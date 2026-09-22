// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.energent;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.energent.models.*;

public class Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public String _endpoint;
    public String _regionId;
    public String _accessKeyId;
    public String _accessKeySecret;
    public String _protocol;
    public String _userAgent;
    public Number _readTimeout;
    public Number _connectTimeout;
    public String _httpProxy;
    public String _httpsProxy;
    public String _socks5Proxy;
    public String _socks5NetWork;
    public String _noProxy;
    public Number _maxIdleConns;
    public String _securityToken;
    public Number _maxIdleTimeMillis;
    public Number _keepAliveDurationMillis;
    public Number _maxRequests;
    public Number _maxRequestsPerHost;
    /**
     * <b>description</b> :
     * <p>Init client with Config</p>
     * 
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(config)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "ParameterMissing"),
                new TeaPair("message", "'config' can not be unset")
            ));
        }

        this._accessKeyId = config.accessKeyId;
        this._accessKeySecret = config.accessKeySecret;
        this._securityToken = config.securityToken;
        this._endpoint = config.endpoint;
        this._protocol = config.protocol;
        this._userAgent = config.userAgent;
        this._readTimeout = com.aliyun.teautil.Common.defaultNumber(config.readTimeout, 20000);
        this._connectTimeout = com.aliyun.teautil.Common.defaultNumber(config.connectTimeout, 20000);
        this._httpProxy = config.httpProxy;
        this._httpsProxy = config.httpsProxy;
        this._noProxy = config.noProxy;
        this._socks5Proxy = config.socks5Proxy;
        this._socks5NetWork = config.socks5NetWork;
        this._maxIdleConns = com.aliyun.teautil.Common.defaultNumber(config.maxIdleConns, 60000);
        this._maxIdleTimeMillis = com.aliyun.teautil.Common.defaultNumber(config.maxIdleTimeMillis, 5);
        this._keepAliveDurationMillis = com.aliyun.teautil.Common.defaultNumber(config.keepAliveDurationMillis, 5000);
        this._maxRequests = com.aliyun.teautil.Common.defaultNumber(config.maxRequests, 100);
        this._maxRequestsPerHost = com.aliyun.teautil.Common.defaultNumber(config.maxRequestsPerHost, 100);
    }

    /**
     * <b>description</b> :
     * <p>Encapsulate the request and invoke the network</p>
     * 
     * @param action api name
     * @param protocol http or https
     * @param method e.g. GET
     * @param pathname pathname of every api
     * @param request which contains request params
     * @param runtime which controls some details of call api, such as retry times
     * @return the response
     */
    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("maxIdleTimeMillis", _maxIdleTimeMillis),
            new TeaPair("keepAliveDuration", _keepAliveDurationMillis),
            new TeaPair("maxRequests", _maxRequests),
            new TeaPair("maxRequestsPerHost", _maxRequestsPerHost),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", runtime.ignoreSSL)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                request_.protocol = com.aliyun.teautil.Common.defaultString(_protocol, protocol);
                request_.method = method;
                request_.pathname = pathname;
                request_.query = TeaConverter.buildMap(
                    new TeaPair("method", action),
                    new TeaPair("version", version),
                    new TeaPair("sign_type", "HmacSHA1"),
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "1.0.6"),
                    new TeaPair("_prod_code", "ENERGENT"),
                    new TeaPair("_prod_channel", "default")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "openapi.antchain.antgroup.com")),
                        new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(_userAgent))
                    ),
                    headers
                );
                java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.anyifyMapValue(com.aliyun.common.Common.query(request));
                request_.body = Tea.toReadable(com.aliyun.teautil.Common.toFormString(tmp));
                request_.headers.put("content-type", "application/x-www-form-urlencoded");
                java.util.Map<String, String> signedParam = TeaConverter.merge(String.class,
                    request_.query,
                    com.aliyun.common.Common.query(request)
                );
                request_.query.put("sign", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                String raw = com.aliyun.teautil.Common.readAsString(response_.body);
                Object obj = com.aliyun.teautil.Common.parseJSON(raw);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antgroup.antchain.openapi.antchain.util.AntchainUtils.hasError(raw, _accessKeySecret)) {
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("message", resp.get("result_msg")),
                        new TeaPair("data", resp),
                        new TeaPair("code", resp.get("result_code"))
                    ));
                }

                return resp;
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识库列表
     * Summary: 知识库列表</p>
     */
    public QueryKmKnowledgelistResponse queryKmKnowledgelist(QueryKmKnowledgelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryKmKnowledgelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识库列表
     * Summary: 知识库列表</p>
     */
    public QueryKmKnowledgelistResponse queryKmKnowledgelistEx(QueryKmKnowledgelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.knowledgelist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryKmKnowledgelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除目录树节点(级联子节点与挂载)
     * Summary: 删除目录树节点(级联子节点与挂载)</p>
     */
    public DeleteKmNodeResponse deleteKmNode(DeleteKmNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKmNodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除目录树节点(级联子节点与挂载)
     * Summary: 删除目录树节点(级联子节点与挂载)</p>
     */
    public DeleteKmNodeResponse deleteKmNodeEx(DeleteKmNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.node.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteKmNodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
     * Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)</p>
     */
    public DetailKmTreeResponse detailKmTree(DetailKmTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailKmTreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)
     * Summary: 查询知识库详情(含根节点树形结构与版本统计与处理中编译任务数)</p>
     */
    public DetailKmTreeResponse detailKmTreeEx(DetailKmTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.tree.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailKmTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 按OSS地址批量入库--
     * Summary: 按OSS地址批量入库--</p>
     */
    public BatchimportKmDocumentResponse batchimportKmDocument(BatchimportKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchimportKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 按OSS地址批量入库--
     * Summary: 按OSS地址批量入库--</p>
     */
    public BatchimportKmDocumentResponse batchimportKmDocumentEx(BatchimportKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.document.batchimport", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchimportKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建知识库
     * Summary: 创建知识库</p>
     */
    public CreateKmTreeResponse createKmTree(CreateKmTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKmTreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建知识库
     * Summary: 创建知识库</p>
     */
    public CreateKmTreeResponse createKmTreeEx(CreateKmTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.tree.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateKmTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑目录树节点槽位信息
     * Summary: 编辑目录树节点槽位信息</p>
     */
    public UpdateKmNodeResponse updateKmNode(UpdateKmNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKmNodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 编辑目录树节点槽位信息
     * Summary: 编辑目录树节点槽位信息</p>
     */
    public UpdateKmNodeResponse updateKmNodeEx(UpdateKmNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.node.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateKmNodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新知识库基础信息
     * Summary: 更新知识库基础信息</p>
     */
    public UpdateKmTreeResponse updateKmTree(UpdateKmTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKmTreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新知识库基础信息
     * Summary: 更新知识库基础信息</p>
     */
    public UpdateKmTreeResponse updateKmTreeEx(UpdateKmTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.tree.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateKmTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询知识库图谱关系模板Schema
     * Summary: 查询知识库图谱关系模板Schema</p>
     */
    public SchemaKmTreeResponse schemaKmTree(SchemaKmTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.schemaKmTreeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询知识库图谱关系模板Schema
     * Summary: 查询知识库图谱关系模板Schema</p>
     */
    public SchemaKmTreeResponse schemaKmTreeEx(SchemaKmTreeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.tree.schema", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SchemaKmTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 目录树中创建节点(挂父节点槽位)
     * Summary: 目录树中创建节点(挂父节点槽位)</p>
     */
    public CreateKmNodeResponse createKmNode(CreateKmNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKmNodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 目录树中创建节点(挂父节点槽位)
     * Summary: 目录树中创建节点(挂父节点槽位)</p>
     */
    public CreateKmNodeResponse createKmNodeEx(CreateKmNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.node.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateKmNodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询节点下挂载的文档列表(含是否处理中标记)
     * Summary: 查询节点下挂载的文档列表(含是否处理中标记)</p>
     */
    public ListKmDocumentResponse listKmDocument(ListKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询节点下挂载的文档列表(含是否处理中标记)
     * Summary: 查询节点下挂载的文档列表(含是否处理中标记)</p>
     */
    public ListKmDocumentResponse listKmDocumentEx(ListKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.document.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 解除文档与节点的挂载关系(不删除文档记录)
     * Summary: 解除文档与节点的挂载关系(不删除文档记录)</p>
     */
    public UnmountKmDocumentResponse unmountKmDocument(UnmountKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unmountKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 解除文档与节点的挂载关系(不删除文档记录)
     * Summary: 解除文档与节点的挂载关系(不删除文档记录)</p>
     */
    public UnmountKmDocumentResponse unmountKmDocumentEx(UnmountKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.document.unmount", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnmountKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询文档预览内容(MD正文)
     * Summary: 查询文档预览内容(MD正文)</p>
     */
    public PreviewKmDocumentResponse previewKmDocument(PreviewKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询文档预览内容(MD正文)
     * Summary: 查询文档预览内容(MD正文)</p>
     */
    public PreviewKmDocumentResponse previewKmDocumentEx(PreviewKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.document.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询文档段落切片列表(支持关键词过滤)
     * Summary: 查询文档段落切片列表(支持关键词过滤)</p>
     */
    public SegmentsKmDocumentResponse segmentsKmDocument(SegmentsKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.segmentsKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询文档段落切片列表(支持关键词过滤)
     * Summary: 查询文档段落切片列表(支持关键词过滤)</p>
     */
    public SegmentsKmDocumentResponse segmentsKmDocumentEx(SegmentsKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.document.segments", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SegmentsKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 树内节点与文档统一搜索
     * Summary: 树内节点与文档统一搜索</p>
     */
    public SearchKmDocumentResponse searchKmDocument(SearchKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 树内节点与文档统一搜索
     * Summary: 树内节点与文档统一搜索</p>
     */
    public SearchKmDocumentResponse searchKmDocumentEx(SearchKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.document.search", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SearchKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建并发布知识库新版本
     * Summary: 创建并发布知识库新版本</p>
     */
    public CreateKmVersionResponse createKmVersion(CreateKmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKmVersionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建并发布知识库新版本
     * Summary: 创建并发布知识库新版本</p>
     */
    public CreateKmVersionResponse createKmVersionEx(CreateKmVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.version.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateKmVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询知识库版本列表(分页)
     * Summary: 查询知识库版本列表(分页)</p>
     */
    public ListKmVersionResponse listKmVersion(ListKmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKmVersionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询知识库版本列表(分页)
     * Summary: 查询知识库版本列表(分页)</p>
     */
    public ListKmVersionResponse listKmVersionEx(ListKmVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.version.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListKmVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询版本详情(含JSON快照)
     * Summary: 查询版本详情(含JSON快照)</p>
     */
    public DetailKmVersionResponse detailKmVersion(DetailKmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailKmVersionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询版本详情(含JSON快照)
     * Summary: 查询版本详情(含JSON快照)</p>
     */
    public DetailKmVersionResponse detailKmVersionEx(DetailKmVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.version.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailKmVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询知识库下一个可用版本号
     * Summary: 查询知识库下一个可用版本号</p>
     */
    public NextKmVersionResponse nextKmVersion(NextKmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.nextKmVersionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询知识库下一个可用版本号
     * Summary: 查询知识库下一个可用版本号</p>
     */
    public NextKmVersionResponse nextKmVersionEx(NextKmVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.version.next", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NextKmVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 激活知识库指定版本(回滚用)
     * Summary: 激活知识库指定版本(回滚用)</p>
     */
    public ActivateKmVersionResponse activateKmVersion(ActivateKmVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activateKmVersionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 激活知识库指定版本(回滚用)
     * Summary: 激活知识库指定版本(回滚用)</p>
     */
    public ActivateKmVersionResponse activateKmVersionEx(ActivateKmVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.version.activate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ActivateKmVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 图谱节点详情与邻域展开
     * Summary: 图谱节点详情与邻域展开</p>
     */
    public NodeKgGraphResponse nodeKgGraph(NodeKgGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.nodeKgGraphEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 图谱节点详情与邻域展开
     * Summary: 图谱节点详情与邻域展开</p>
     */
    public NodeKgGraphResponse nodeKgGraphEx(NodeKgGraphRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.kg.graph.node", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NodeKgGraphResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 图谱节点分类与图例配置
     * Summary: 图谱节点分类与图例配置</p>
     */
    public CategoriesKgGraphResponse categoriesKgGraph(CategoriesKgGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.categoriesKgGraphEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 图谱节点分类与图例配置
     * Summary: 图谱节点分类与图例配置</p>
     */
    public CategoriesKgGraphResponse categoriesKgGraphEx(CategoriesKgGraphRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.kg.graph.categories", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CategoriesKgGraphResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 重试失败的图谱编译任务
     * Summary: 重试失败的图谱编译任务</p>
     */
    public RetryKgCompileResponse retryKgCompile(RetryKgCompileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryKgCompileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 重试失败的图谱编译任务
     * Summary: 重试失败的图谱编译任务</p>
     */
    public RetryKgCompileResponse retryKgCompileEx(RetryKgCompileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.kg.compile.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryKgCompileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询图谱编译任务列表(分页)
     * Summary: 查询图谱编译任务列表(分页)</p>
     */
    public ListKgCompileResponse listKgCompile(ListKgCompileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKgCompileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询图谱编译任务列表(分页)
     * Summary: 查询图谱编译任务列表(分页)</p>
     */
    public ListKgCompileResponse listKgCompileEx(ListKgCompileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.kg.compile.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListKgCompileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于已上传文件生成图谱本体Schema(不落库)
     * Summary: 基于已上传文件生成图谱本体Schema(不落库)</p>
     */
    public ExtractschemaKmDocumentResponse extractschemaKmDocument(ExtractschemaKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.extractschemaKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于已上传文件生成图谱本体Schema(不落库)
     * Summary: 基于已上传文件生成图谱本体Schema(不落库)</p>
     */
    public ExtractschemaKmDocumentResponse extractschemaKmDocumentEx(ExtractschemaKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.document.extractschema", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExtractschemaKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同级目录树节点拖拽排序
     * Summary: 同级目录树节点拖拽排序</p>
     */
    public RankKmNodeResponse rankKmNode(RankKmNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.rankKmNodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同级目录树节点拖拽排序
     * Summary: 同级目录树节点拖拽排序</p>
     */
    public RankKmNodeResponse rankKmNodeEx(RankKmNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.node.rank", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RankKmNodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同级目录树节点按序重排
     * Summary: 同级目录树节点按序重排</p>
     */
    public ReorderKmNodeResponse reorderKmNode(ReorderKmNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reorderKmNodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同级目录树节点按序重排
     * Summary: 同级目录树节点按序重排</p>
     */
    public ReorderKmNodeResponse reorderKmNodeEx(ReorderKmNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.node.reorder", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReorderKmNodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识图谱全图查询(节点与关系)
     * Summary: 知识图谱全图查询(节点与关系)</p>
     */
    public RetrieveKgGraphResponse retrieveKgGraph(RetrieveKgGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retrieveKgGraphEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识图谱全图查询(节点与关系)
     * Summary: 知识图谱全图查询(节点与关系)</p>
     */
    public RetrieveKgGraphResponse retrieveKgGraphEx(RetrieveKgGraphRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.kg.graph.retrieve", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetrieveKgGraphResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同级目录树节点按序重排
     * Summary: 同级目录树节点按序重排</p>
     */
    public SortKmNodeResponse sortKmNode(SortKmNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sortKmNodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同级目录树节点按序重排
     * Summary: 同级目录树节点按序重排</p>
     */
    public SortKmNodeResponse sortKmNodeEx(SortKmNodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.node.sort", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SortKmNodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识图谱全图查询(节点与关系)
     * Summary: 知识图谱全图查询(节点与关系)</p>
     */
    public QueryKgGraphResponse queryKgGraph(QueryKgGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryKgGraphEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识图谱全图查询(节点与关系)
     * Summary: 知识图谱全图查询(节点与关系)</p>
     */
    public QueryKgGraphResponse queryKgGraphEx(QueryKgGraphRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.kg.graph.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryKgGraphResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识库文件上传接入
     * Summary: 知识库文件上传接入</p>
     */
    public FileuploadKmDocumentResponse fileuploadKmDocument(FileuploadKmDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fileuploadKmDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识库文件上传接入
     * Summary: 知识库文件上传接入</p>
     */
    public FileuploadKmDocumentResponse fileuploadKmDocumentEx(FileuploadKmDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antdigital.energent.km.document.fileupload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                FileuploadKmDocumentResponse fileuploadKmDocumentResponse = FileuploadKmDocumentResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return fileuploadKmDocumentResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.km.document.fileupload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FileuploadKmDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识库rag 检索
     * Summary: 知识库rag 检索</p>
     */
    public QueryKnowledgeRagResponse queryKnowledgeRag(QueryKnowledgeRagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryKnowledgeRagEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识库rag 检索
     * Summary: 知识库rag 检索</p>
     */
    public QueryKnowledgeRagResponse queryKnowledgeRagEx(QueryKnowledgeRagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.knowledge.rag.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryKnowledgeRagResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: rag检索
     * Summary: rag检索</p>
     */
    public QueryEnergyknowledgeRagResponse queryEnergyknowledgeRag(QueryEnergyknowledgeRagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnergyknowledgeRagEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: rag检索
     * Summary: rag检索</p>
     */
    public QueryEnergyknowledgeRagResponse queryEnergyknowledgeRagEx(QueryEnergyknowledgeRagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.energyknowledge.rag.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnergyknowledgeRagResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识图谱rag召回
     * Summary: 知识图谱rag召回</p>
     */
    public QueryEnergyknowledgeRagrecallResponse queryEnergyknowledgeRagrecall(QueryEnergyknowledgeRagrecallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnergyknowledgeRagrecallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 知识图谱rag召回
     * Summary: 知识图谱rag召回</p>
     */
    public QueryEnergyknowledgeRagrecallResponse queryEnergyknowledgeRagrecallEx(QueryEnergyknowledgeRagrecallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.energent.energyknowledge.ragrecall.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnergyknowledgeRagrecallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
