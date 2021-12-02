// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cafecmdb;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.cafecmdb.models.*;
import com.antgroup.antchain.openapi.antchain.util.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;

public class Client {

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
     * Init client with Config
     * @param config config contains the necessary information to create a client
     */
    public Client(Config config) throws Exception {
        if (com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(config))) {
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

    public java.util.Map<String, ?> doRequest(String version, String action, String protocol, String method, String pathname, java.util.Map<String, ?> request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("maxIdleTimeMillis", _maxIdleTimeMillis),
            new TeaPair("keepAliveDurationMillis", _keepAliveDurationMillis),
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
                    new TeaPair("sdk_version", "1.0.27")
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
                TeaResponse response_ = Tea.doAction(request_, runtime_);

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

    /**
     * Description: 查询资源
     * Summary: 查询资源
     */
    public QueryItemResponse queryItem(QueryItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryItemEx(request, headers, runtime);
    }

    /**
     * Description: 查询资源
     * Summary: 查询资源
     */
    public QueryItemResponse queryItemEx(QueryItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryItemResponse());
    }

    /**
     * Description: 创建资源
     * Summary: 创建资源
     */
    public CreateItemResponse createItem(CreateItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createItemEx(request, headers, runtime);
    }

    /**
     * Description: 创建资源
     * Summary: 创建资源
     */
    public CreateItemResponse createItemEx(CreateItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateItemResponse());
    }

    /**
     * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
     * Summary: 更新资源属性
     */
    public UpdateItemResponse updateItem(UpdateItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateItemEx(request, headers, runtime);
    }

    /**
     * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
     * Summary: 更新资源属性
     */
    public UpdateItemResponse updateItemEx(UpdateItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateItemResponse());
    }

    /**
     * Description: 删除单个资源
     * Summary: 删除单个资源
     */
    public DeleteItemResponse deleteItem(DeleteItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteItemEx(request, headers, runtime);
    }

    /**
     * Description: 删除单个资源
     * Summary: 删除单个资源
     */
    public DeleteItemResponse deleteItemEx(DeleteItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteItemResponse());
    }

    /**
     * Description: 获取单个Item的详细信息
     * Summary: 获取单个Item的详细信息
     */
    public GetItemResponse getItem(GetItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getItemEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个Item的详细信息
     * Summary: 获取单个Item的详细信息
     */
    public GetItemResponse getItemEx(GetItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetItemResponse());
    }

    /**
     * Description: 获取单个模型
     * Summary: 获取单个模型
     */
    public GetModelResponse getModel(GetModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个模型
     * Summary: 获取单个模型
     */
    public GetModelResponse getModelEx(GetModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetModelResponse());
    }

    /**
     * Description: 查询模型
     * Summary: 查询模型
     */
    public QueryModelResponse queryModel(QueryModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelEx(request, headers, runtime);
    }

    /**
     * Description: 查询模型
     * Summary: 查询模型
     */
    public QueryModelResponse queryModelEx(QueryModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelResponse());
    }

    /**
     * Description: 创建模型
     * Summary: 创建模型
     */
    public CreateModelResponse createModel(CreateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelEx(request, headers, runtime);
    }

    /**
     * Description: 创建模型
     * Summary: 创建模型
     */
    public CreateModelResponse createModelEx(CreateModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateModelResponse());
    }

    /**
     * Description: 更新模型
     * Summary: 更新模型
     */
    public UpdateModelResponse updateModel(UpdateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelEx(request, headers, runtime);
    }

    /**
     * Description: 更新模型
     * Summary: 更新模型
     */
    public UpdateModelResponse updateModelEx(UpdateModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateModelResponse());
    }

    /**
     * Description: 获取单个模型分组
     * Summary: 获取单个模型分组
     */
    public GetModelcategoryResponse getModelcategory(GetModelcategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelcategoryEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个模型分组
     * Summary: 获取单个模型分组
     */
    public GetModelcategoryResponse getModelcategoryEx(GetModelcategoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelcategory.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetModelcategoryResponse());
    }

    /**
     * Description: 删除模型
     * Summary: 删除模型
     */
    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelEx(request, headers, runtime);
    }

    /**
     * Description: 删除模型
     * Summary: 删除模型
     */
    public DeleteModelResponse deleteModelEx(DeleteModelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteModelResponse());
    }

    /**
     * Description: 查询模型分组
     * Summary: 查询模型分组
     */
    public QueryModelcategoryResponse queryModelcategory(QueryModelcategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelcategoryEx(request, headers, runtime);
    }

    /**
     * Description: 查询模型分组
     * Summary: 查询模型分组
     */
    public QueryModelcategoryResponse queryModelcategoryEx(QueryModelcategoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelcategory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelcategoryResponse());
    }

    /**
     * Description: 创建模型分组
     * Summary: 创建模型分组
     */
    public CreateModelcategoryResponse createModelcategory(CreateModelcategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelcategoryEx(request, headers, runtime);
    }

    /**
     * Description: 创建模型分组
     * Summary: 创建模型分组
     */
    public CreateModelcategoryResponse createModelcategoryEx(CreateModelcategoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelcategory.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateModelcategoryResponse());
    }

    /**
     * Description: 更新模型分组
     * Summary: 更新模型分组
     */
    public UpdateModelcategoryResponse updateModelcategory(UpdateModelcategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelcategoryEx(request, headers, runtime);
    }

    /**
     * Description: 更新模型分组
     * Summary: 更新模型分组
     */
    public UpdateModelcategoryResponse updateModelcategoryEx(UpdateModelcategoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelcategory.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateModelcategoryResponse());
    }

    /**
     * Description: 删除模型分组
     * Summary: 删除模型分组
     */
    public DeleteModelcategoryResponse deleteModelcategory(DeleteModelcategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelcategoryEx(request, headers, runtime);
    }

    /**
     * Description: 删除模型分组
     * Summary: 删除模型分组
     */
    public DeleteModelcategoryResponse deleteModelcategoryEx(DeleteModelcategoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelcategory.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteModelcategoryResponse());
    }

    /**
     * Description: 获取单个模型字段
     * Summary: 获取单个模型字段
     */
    public GetModelAttributeResponse getModelAttribute(GetModelAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个模型字段
     * Summary: 获取单个模型字段
     */
    public GetModelAttributeResponse getModelAttributeEx(GetModelAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.attribute.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetModelAttributeResponse());
    }

    /**
     * Description: 查询模型字段
     * Summary: 查询模型字段
     */
    public QueryModelAttributeResponse queryModelAttribute(QueryModelAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 查询模型字段
     * Summary: 查询模型字段
     */
    public QueryModelAttributeResponse queryModelAttributeEx(QueryModelAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.attribute.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelAttributeResponse());
    }

    /**
     * Description: 创建模型字段
     * Summary: 创建模型字段
     */
    public CreateModelAttributeResponse createModelAttribute(CreateModelAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 创建模型字段
     * Summary: 创建模型字段
     */
    public CreateModelAttributeResponse createModelAttributeEx(CreateModelAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.attribute.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateModelAttributeResponse());
    }

    /**
     * Description: 更新模型字段
     * Summary: 更新模型字段
     */
    public UpdateModelAttributeResponse updateModelAttribute(UpdateModelAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 更新模型字段
     * Summary: 更新模型字段
     */
    public UpdateModelAttributeResponse updateModelAttributeEx(UpdateModelAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.attribute.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateModelAttributeResponse());
    }

    /**
     * Description: 删除模型字段
     * Summary: 删除模型字段
     */
    public DeleteModelAttributeResponse deleteModelAttribute(DeleteModelAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelAttributeEx(request, headers, runtime);
    }

    /**
     * Description: 删除模型字段
     * Summary: 删除模型字段
     */
    public DeleteModelAttributeResponse deleteModelAttributeEx(DeleteModelAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.model.attribute.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteModelAttributeResponse());
    }

    /**
     * Description: id是否存在
     * Summary: id是否存在
     */
    public ExistItemIdResponse existItemId(ExistItemIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existItemIdEx(request, headers, runtime);
    }

    /**
     * Description: id是否存在
     * Summary: id是否存在
     */
    public ExistItemIdResponse existItemIdEx(ExistItemIdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.id.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistItemIdResponse());
    }

    /**
     * Description: 查询当前item的关系资源，注意区分上钻和下钻
     * Summary: 查询当前item的关系资源
     */
    public QueryItemRelationsResponse queryItemRelations(QueryItemRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryItemRelationsEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前item的关系资源，注意区分上钻和下钻
     * Summary: 查询当前item的关系资源
     */
    public QueryItemRelationsResponse queryItemRelationsEx(QueryItemRelationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.relations.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryItemRelationsResponse());
    }

    /**
     * Description: 导入ITEM
     * Summary: 导入ITEM
     */
    public ImportItemResponse importItem(ImportItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importItemEx(request, headers, runtime);
    }

    /**
     * Description: 导入ITEM
     * Summary: 导入ITEM
     */
    public ImportItemResponse importItemEx(ImportItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportItemResponse());
    }

    /**
     * Description: 导出资源
     * Summary: 导出资源
     */
    public ExportItemResponse exportItem(ExportItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportItemEx(request, headers, runtime);
    }

    /**
     * Description: 导出资源
     * Summary: 导出资源
     */
    public ExportItemResponse exportItemEx(ExportItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.item.export", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExportItemResponse());
    }

    /**
     * Description: 获取单个模型关联
     * Summary: 获取单个模型关联
     */
    public GetModelrelationshipResponse getModelrelationship(GetModelrelationshipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getModelrelationshipEx(request, headers, runtime);
    }

    /**
     * Description: 获取单个模型关联
     * Summary: 获取单个模型关联
     */
    public GetModelrelationshipResponse getModelrelationshipEx(GetModelrelationshipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelrelationship.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetModelrelationshipResponse());
    }

    /**
     * Description: 查询模型关联
     * Summary: 查询模型关联
     */
    public QueryModelrelationshipResponse queryModelrelationship(QueryModelrelationshipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryModelrelationshipEx(request, headers, runtime);
    }

    /**
     * Description: 查询模型关联
     * Summary: 查询模型关联
     */
    public QueryModelrelationshipResponse queryModelrelationshipEx(QueryModelrelationshipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelrelationship.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryModelrelationshipResponse());
    }

    /**
     * Description: 创建模型关联
     * Summary: 创建模型关联
     */
    public CreateModelrelationshipResponse createModelrelationship(CreateModelrelationshipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createModelrelationshipEx(request, headers, runtime);
    }

    /**
     * Description: 创建模型关联
     * Summary: 创建模型关联
     */
    public CreateModelrelationshipResponse createModelrelationshipEx(CreateModelrelationshipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelrelationship.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateModelrelationshipResponse());
    }

    /**
     * Description: 更新模型关联
     * Summary: 更新模型关联
     */
    public UpdateModelrelationshipResponse updateModelrelationship(UpdateModelrelationshipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateModelrelationshipEx(request, headers, runtime);
    }

    /**
     * Description: 更新模型关联
     * Summary: 更新模型关联
     */
    public UpdateModelrelationshipResponse updateModelrelationshipEx(UpdateModelrelationshipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelrelationship.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateModelrelationshipResponse());
    }

    /**
     * Description: 删除模型关联
     * Summary: 删除模型关联
     */
    public DeleteModelrelationshipResponse deleteModelrelationship(DeleteModelrelationshipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteModelrelationshipEx(request, headers, runtime);
    }

    /**
     * Description: 删除模型关联
     * Summary: 删除模型关联
     */
    public DeleteModelrelationshipResponse deleteModelrelationshipEx(DeleteModelrelationshipRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.modelrelationship.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteModelrelationshipResponse());
    }

    /**
     * Description: 拉取当前环境的参数表
     * Summary: 拉取当前环境的参数表
     */
    public PullParamResponse pullParam(PullParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullParamEx(request, headers, runtime);
    }

    /**
     * Description: 拉取当前环境的参数表
     * Summary: 拉取当前环境的参数表
     */
    public PullParamResponse pullParamEx(PullParamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.param.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullParamResponse());
    }

    /**
     * Description: 更新配置信息
     * Summary: 更新配置信息
     */
    public PushParamResponse pushParam(PushParamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushParamEx(request, headers, runtime);
    }

    /**
     * Description: 更新配置信息
     * Summary: 更新配置信息
     */
    public PushParamResponse pushParamEx(PushParamRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.param.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushParamResponse());
    }

    /**
     * Description: 创建字段组
     * Summary: 创建字段组
     */
    public CreateAttributegroupResponse createAttributegroup(CreateAttributegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAttributegroupEx(request, headers, runtime);
    }

    /**
     * Description: 创建字段组
     * Summary: 创建字段组
     */
    public CreateAttributegroupResponse createAttributegroupEx(CreateAttributegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.attributegroup.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAttributegroupResponse());
    }

    /**
     * Description: 查询字段组
     * Summary: 查询字段组
     */
    public QueryAttributegroupResponse queryAttributegroup(QueryAttributegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAttributegroupEx(request, headers, runtime);
    }

    /**
     * Description: 查询字段组
     * Summary: 查询字段组
     */
    public QueryAttributegroupResponse queryAttributegroupEx(QueryAttributegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.attributegroup.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAttributegroupResponse());
    }

    /**
     * Description: 删除字段组
     * Summary: 删除字段组
     */
    public DeleteAttributegroupResponse deleteAttributegroup(DeleteAttributegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteAttributegroupEx(request, headers, runtime);
    }

    /**
     * Description: 删除字段组
     * Summary: 删除字段组
     */
    public DeleteAttributegroupResponse deleteAttributegroupEx(DeleteAttributegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.attributegroup.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteAttributegroupResponse());
    }

    /**
     * Description: 更新字段组
     * Summary: 更新字段组
     */
    public UpdateAttributegroupResponse updateAttributegroup(UpdateAttributegroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAttributegroupEx(request, headers, runtime);
    }

    /**
     * Description: 更新字段组
     * Summary: 更新字段组
     */
    public UpdateAttributegroupResponse updateAttributegroupEx(UpdateAttributegroupRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.attributegroup.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAttributegroupResponse());
    }

    /**
     * Description: 审计日志查询
     * Summary: 审计日志查询
     */
    public QueryAuditlogResponse queryAuditlog(QueryAuditlogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuditlogEx(request, headers, runtime);
    }

    /**
     * Description: 审计日志查询
     * Summary: 审计日志查询
     */
    public QueryAuditlogResponse queryAuditlogEx(QueryAuditlogRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.cmdb.auditlog.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuditlogResponse());
    }
}
