// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.webtrwatrade.models.*;

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
     * Init client with Config
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
     * Encapsulate the request and invoke the network
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
                    new TeaPair("sdk_version", "1.0.10"),
                    new TeaPair("_prod_code", "WEBTRWATRADE"),
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
     * Description: 发行机构创建资产项目
     * Summary: 发行机构创建资产项目
     */
    public CreateIssuerProjectResponse createIssuerProject(CreateIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIssuerProjectEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构创建资产项目
     * Summary: 发行机构创建资产项目
     */
    public CreateIssuerProjectResponse createIssuerProjectEx(CreateIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIssuerProjectResponse());
    }

    /**
     * Description: 分页查询发行机构持有的资产项目信息
     * Summary: 分页查询发行机构项目信息
     */
    public PagequeryIssuerProjectResponse pagequeryIssuerProject(PagequeryIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIssuerProjectEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询发行机构持有的资产项目信息
     * Summary: 分页查询发行机构项目信息
     */
    public PagequeryIssuerProjectResponse pagequeryIssuerProjectEx(PagequeryIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIssuerProjectResponse());
    }

    /**
     * Description: 分页查询代销机构代销的资产项目信息
     * Summary: 分页查询代销机构项目信息
     */
    public PagequeryDistributorProjectResponse pagequeryDistributorProject(PagequeryDistributorProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDistributorProjectEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询代销机构代销的资产项目信息
     * Summary: 分页查询代销机构项目信息
     */
    public PagequeryDistributorProjectResponse pagequeryDistributorProjectEx(PagequeryDistributorProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.project.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDistributorProjectResponse());
    }

    /**
     * Description: 发行机构暂停项目
     * Summary: 发行机构暂停项目
     */
    public PauseIssuerProjectResponse pauseIssuerProject(PauseIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseIssuerProjectEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构暂停项目
     * Summary: 发行机构暂停项目
     */
    public PauseIssuerProjectResponse pauseIssuerProjectEx(PauseIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.pause", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PauseIssuerProjectResponse());
    }

    /**
     * Description: 发行机构激活项目(使项目生效)
     * Summary: 发行机构激活项目
     */
    public EnableIssuerProjectResponse enableIssuerProject(EnableIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableIssuerProjectEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构激活项目(使项目生效)
     * Summary: 发行机构激活项目
     */
    public EnableIssuerProjectResponse enableIssuerProjectEx(EnableIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableIssuerProjectResponse());
    }

    /**
     * Description: 发行机构查询项目详情
     * Summary: 发行机构查询项目详情
     */
    public DetailIssuerProjectResponse detailIssuerProject(DetailIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailIssuerProjectEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构查询项目详情
     * Summary: 发行机构查询项目详情
     */
    public DetailIssuerProjectResponse detailIssuerProjectEx(DetailIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailIssuerProjectResponse());
    }

    /**
     * Description: 代销机构查询项目详情
     * Summary: 代销机构查询项目详情
     */
    public DetailDistributorProjectResponse detailDistributorProject(DetailDistributorProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailDistributorProjectEx(request, headers, runtime);
    }

    /**
     * Description: 代销机构查询项目详情
     * Summary: 代销机构查询项目详情
     */
    public DetailDistributorProjectResponse detailDistributorProjectEx(DetailDistributorProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.project.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailDistributorProjectResponse());
    }

    /**
     * Description: 平台管理员分页查询所有项目
     * Summary: 平台管理分页查询项目
     */
    public PagequeryPlatformProjectResponse pagequeryPlatformProject(PagequeryPlatformProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryPlatformProjectEx(request, headers, runtime);
    }

    /**
     * Description: 平台管理员分页查询所有项目
     * Summary: 平台管理分页查询项目
     */
    public PagequeryPlatformProjectResponse pagequeryPlatformProjectEx(PagequeryPlatformProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.platform.project.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryPlatformProjectResponse());
    }

    /**
     * Description: 发行机构获取总览统计数据项
     * Summary: 发行机构获取总览统计数据项
     */
    public CountIssuerDatasummaryResponse countIssuerDatasummary(CountIssuerDatasummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countIssuerDatasummaryEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构获取总览统计数据项
     * Summary: 发行机构获取总览统计数据项
     */
    public CountIssuerDatasummaryResponse countIssuerDatasummaryEx(CountIssuerDatasummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.datasummary.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountIssuerDatasummaryResponse());
    }

    /**
     * Description: 代销机构获取总览统计数据项
     * Summary: 代销机构获取总览统计数据项
     */
    public CountDistributorDatasummaryResponse countDistributorDatasummary(CountDistributorDatasummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDistributorDatasummaryEx(request, headers, runtime);
    }

    /**
     * Description: 代销机构获取总览统计数据项
     * Summary: 代销机构获取总览统计数据项
     */
    public CountDistributorDatasummaryResponse countDistributorDatasummaryEx(CountDistributorDatasummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.datasummary.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDistributorDatasummaryResponse());
    }

    /**
     * Description: 发行机构获取历史资产价值
     * Summary: 发行机构获取历史资产价值
     */
    public ListIssuerDatasummaryResponse listIssuerDatasummary(ListIssuerDatasummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerDatasummaryEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构获取历史资产价值
     * Summary: 发行机构获取历史资产价值
     */
    public ListIssuerDatasummaryResponse listIssuerDatasummaryEx(ListIssuerDatasummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.datasummary.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerDatasummaryResponse());
    }

    /**
     * Description: 代销机构获取历史资产价值
     * Summary: 代销机构获取历史资产价值
     */
    public ListDistributorDatasummaryResponse listDistributorDatasummary(ListDistributorDatasummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributorDatasummaryEx(request, headers, runtime);
    }

    /**
     * Description: 代销机构获取历史资产价值
     * Summary: 代销机构获取历史资产价值
     */
    public ListDistributorDatasummaryResponse listDistributorDatasummaryEx(ListDistributorDatasummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.datasummary.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributorDatasummaryResponse());
    }

    /**
     * Description: 查询代销机构列表
     * Summary: 查询代销机构列表
     */
    public ListIssuerInstitutionResponse listIssuerInstitution(ListIssuerInstitutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerInstitutionEx(request, headers, runtime);
    }

    /**
     * Description: 查询代销机构列表
     * Summary: 查询代销机构列表
     */
    public ListIssuerInstitutionResponse listIssuerInstitutionEx(ListIssuerInstitutionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.institution.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerInstitutionResponse());
    }

    /**
     * Description: 分页查询密钥
     * Summary: 分页查询密钥
     */
    public PagequeryIssuerKeyResponse pagequeryIssuerKey(PagequeryIssuerKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIssuerKeyEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询密钥
     * Summary: 分页查询密钥
     */
    public PagequeryIssuerKeyResponse pagequeryIssuerKeyEx(PagequeryIssuerKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIssuerKeyResponse());
    }

    /**
     * Description: 查询密钥详情
     * Summary: 查询密钥详情
     */
    public DetailIssuerKeyResponse detailIssuerKey(DetailIssuerKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailIssuerKeyEx(request, headers, runtime);
    }

    /**
     * Description: 查询密钥详情
     * Summary: 查询密钥详情
     */
    public DetailIssuerKeyResponse detailIssuerKeyEx(DetailIssuerKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailIssuerKeyResponse());
    }

    /**
     * Description: 创建密钥
     * Summary: 创建密钥
     */
    public CreateIssuerKeyResponse createIssuerKey(CreateIssuerKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIssuerKeyEx(request, headers, runtime);
    }

    /**
     * Description: 创建密钥
     * Summary: 创建密钥
     */
    public CreateIssuerKeyResponse createIssuerKeyEx(CreateIssuerKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIssuerKeyResponse());
    }

    /**
     * Description: 删除密钥
     * Summary: 删除密钥
     */
    public DeleteIssuerKeyResponse deleteIssuerKey(DeleteIssuerKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIssuerKeyEx(request, headers, runtime);
    }

    /**
     * Description: 删除密钥
     * Summary: 删除密钥
     */
    public DeleteIssuerKeyResponse deleteIssuerKeyEx(DeleteIssuerKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteIssuerKeyResponse());
    }

    /**
     * Description: 发行机构添加项目密钥
     * Summary: 发行机构添加项目密钥
     */
    public AddIssuerProjectkeyResponse addIssuerProjectkey(AddIssuerProjectkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addIssuerProjectkeyEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构添加项目密钥
     * Summary: 发行机构添加项目密钥
     */
    public AddIssuerProjectkeyResponse addIssuerProjectkeyEx(AddIssuerProjectkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddIssuerProjectkeyResponse());
    }

    /**
     * Description: 发行机构删除项目密钥
     * Summary: 发行机构删除项目密钥
     */
    public DeleteIssuerProjectkeyResponse deleteIssuerProjectkey(DeleteIssuerProjectkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIssuerProjectkeyEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构删除项目密钥
     * Summary: 发行机构删除项目密钥
     */
    public DeleteIssuerProjectkeyResponse deleteIssuerProjectkeyEx(DeleteIssuerProjectkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteIssuerProjectkeyResponse());
    }

    /**
     * Description: 发行机构获取项目密钥列表
     * Summary: 发行机构获取项目密钥列表
     */
    public ListIssuerProjectkeyResponse listIssuerProjectkey(ListIssuerProjectkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerProjectkeyEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构获取项目密钥列表
     * Summary: 发行机构获取项目密钥列表
     */
    public ListIssuerProjectkeyResponse listIssuerProjectkeyEx(ListIssuerProjectkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerProjectkeyResponse());
    }

    /**
     * Description: 发行机构分页查询密钥关联的项目
     * Summary: 发行机构分页查询密钥关联的项目
     */
    public PagequeryIssuerProjectkeyResponse pagequeryIssuerProjectkey(PagequeryIssuerProjectkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIssuerProjectkeyEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构分页查询密钥关联的项目
     * Summary: 发行机构分页查询密钥关联的项目
     */
    public PagequeryIssuerProjectkeyResponse pagequeryIssuerProjectkeyEx(PagequeryIssuerProjectkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIssuerProjectkeyResponse());
    }

    /**
     * Description: 更新项目净值
     * Summary: 更新项目净值
     */
    public UpdateIssuerNetvalueResponse updateIssuerNetvalue(UpdateIssuerNetvalueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIssuerNetvalueEx(request, headers, runtime);
    }

    /**
     * Description: 更新项目净值
     * Summary: 更新项目净值
     */
    public UpdateIssuerNetvalueResponse updateIssuerNetvalueEx(UpdateIssuerNetvalueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.netvalue.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIssuerNetvalueResponse());
    }

    /**
     * Description: 获取净值列表
     * Summary: 获取净值列表
     */
    public ListIssuerNetvalueResponse listIssuerNetvalue(ListIssuerNetvalueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerNetvalueEx(request, headers, runtime);
    }

    /**
     * Description: 获取净值列表
     * Summary: 获取净值列表
     */
    public ListIssuerNetvalueResponse listIssuerNetvalueEx(ListIssuerNetvalueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.netvalue.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerNetvalueResponse());
    }

    /**
     * Description: 上传项目报告
     * Summary: 上传项目报告
     */
    public UploadIssuerReportResponse uploadIssuerReport(UploadIssuerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadIssuerReportEx(request, headers, runtime);
    }

    /**
     * Description: 上传项目报告
     * Summary: 上传项目报告
     */
    public UploadIssuerReportResponse uploadIssuerReportEx(UploadIssuerReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadIssuerReportResponse());
    }

    /**
     * Description: 发行机构获取历史报告列表
     * Summary: 发行机构获取历史报告列表
     */
    public ListIssuerReportResponse listIssuerReport(ListIssuerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerReportEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构获取历史报告列表
     * Summary: 发行机构获取历史报告列表
     */
    public ListIssuerReportResponse listIssuerReportEx(ListIssuerReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerReportResponse());
    }

    /**
     * Description: 代销机构获取历史项目报告
     * Summary: 代销机构获取历史项目报告
     */
    public ListDistributorReportResponse listDistributorReport(ListDistributorReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributorReportEx(request, headers, runtime);
    }

    /**
     * Description: 代销机构获取历史项目报告
     * Summary: 代销机构获取历史项目报告
     */
    public ListDistributorReportResponse listDistributorReportEx(ListDistributorReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributorReportResponse());
    }

    /**
     * Description: 发行机构获取报告文件下载URL
     * Summary: 发行机构获取报告文件下载URL
     */
    public DownloadIssuerReportResponse downloadIssuerReport(DownloadIssuerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadIssuerReportEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构获取报告文件下载URL
     * Summary: 发行机构获取报告文件下载URL
     */
    public DownloadIssuerReportResponse downloadIssuerReportEx(DownloadIssuerReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadIssuerReportResponse());
    }

    /**
     * Description: 发行机构获取报告文件预览URL
     * Summary: 发行机构获取报告文件预览URL
     */
    public PreviewIssuerReportResponse previewIssuerReport(PreviewIssuerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewIssuerReportEx(request, headers, runtime);
    }

    /**
     * Description: 发行机构获取报告文件预览URL
     * Summary: 发行机构获取报告文件预览URL
     */
    public PreviewIssuerReportResponse previewIssuerReportEx(PreviewIssuerReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewIssuerReportResponse());
    }

    /**
     * Description: 代销机构获取报告文件下载URL
     * Summary: 代销机构获取报告文件下载URL
     */
    public DownloadDistributorReportResponse downloadDistributorReport(DownloadDistributorReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadDistributorReportEx(request, headers, runtime);
    }

    /**
     * Description: 代销机构获取报告文件下载URL
     * Summary: 代销机构获取报告文件下载URL
     */
    public DownloadDistributorReportResponse downloadDistributorReportEx(DownloadDistributorReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadDistributorReportResponse());
    }

    /**
     * Description: 代销机构获取报告文件预览URL
     * Summary: 代销机构获取报告文件预览URL
     */
    public PreviewDistributorReportResponse previewDistributorReport(PreviewDistributorReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewDistributorReportEx(request, headers, runtime);
    }

    /**
     * Description: 代销机构获取报告文件预览URL
     * Summary: 代销机构获取报告文件预览URL
     */
    public PreviewDistributorReportResponse previewDistributorReportEx(PreviewDistributorReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewDistributorReportResponse());
    }

    /**
     * Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表
     */
    public PagequeryIssuerSubuserResponse pagequeryIssuerSubuser(PagequeryIssuerSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIssuerSubuserEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表
     */
    public PagequeryIssuerSubuserResponse pagequeryIssuerSubuserEx(PagequeryIssuerSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIssuerSubuserResponse());
    }

    /**
     * Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表
     */
    public PagequeryDistributorSubuserResponse pagequeryDistributorSubuser(PagequeryDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表
     */
    public PagequeryDistributorSubuserResponse pagequeryDistributorSubuserEx(PagequeryDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDistributorSubuserResponse());
    }

    /**
     * Description: 查询单个二级用户
     * Summary: 查询单个二级用户
     */
    public QueryIssuerSubuserResponse queryIssuerSubuser(QueryIssuerSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIssuerSubuserEx(request, headers, runtime);
    }

    /**
     * Description: 查询单个二级用户
     * Summary: 查询单个二级用户
     */
    public QueryIssuerSubuserResponse queryIssuerSubuserEx(QueryIssuerSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIssuerSubuserResponse());
    }

    /**
     * Description: 查询单个二级用户
     * Summary: 查询单个二级用户
     */
    public QueryDistributorSubuserResponse queryDistributorSubuser(QueryDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * Description: 查询单个二级用户
     * Summary: 查询单个二级用户
     */
    public QueryDistributorSubuserResponse queryDistributorSubuserEx(QueryDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributorSubuserResponse());
    }

    /**
     * Description: 更新二级用户
     * Summary: 更新二级用户
     */
    public UpdateDistributorSubuserResponse updateDistributorSubuser(UpdateDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * Description: 更新二级用户
     * Summary: 更新二级用户
     */
    public UpdateDistributorSubuserResponse updateDistributorSubuserEx(UpdateDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDistributorSubuserResponse());
    }

    /**
     * Description: 添加二级用户
     * Summary: 添加二级用户
     */
    public CreateDistributorSubuserResponse createDistributorSubuser(CreateDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * Description: 添加二级用户
     * Summary: 添加二级用户
     */
    public CreateDistributorSubuserResponse createDistributorSubuserEx(CreateDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributorSubuserResponse());
    }

    /**
     * Description: 删除二级用户
     * Summary: 删除二级用户
     */
    public DeleteDistributorSubuserResponse deleteDistributorSubuser(DeleteDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * Description: 删除二级用户
     * Summary: 删除二级用户
     */
    public DeleteDistributorSubuserResponse deleteDistributorSubuserEx(DeleteDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDistributorSubuserResponse());
    }

    /**
     * Description: 获取二级用户配额
     * Summary: 获取二级用户配额
     */
    public CountDistributorSubusertargetResponse countDistributorSubusertarget(CountDistributorSubusertargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDistributorSubusertargetEx(request, headers, runtime);
    }

    /**
     * Description: 获取二级用户配额
     * Summary: 获取二级用户配额
     */
    public CountDistributorSubusertargetResponse countDistributorSubusertargetEx(CountDistributorSubusertargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subusertarget.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDistributorSubusertargetResponse());
    }

    /**
     * Description: 发行token
     * Summary: 发行token
     */
    public IssueIssuerSubusertradeResponse issueIssuerSubusertrade(IssueIssuerSubusertradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.issueIssuerSubusertradeEx(request, headers, runtime);
    }

    /**
     * Description: 发行token
     * Summary: 发行token
     */
    public IssueIssuerSubusertradeResponse issueIssuerSubusertradeEx(IssueIssuerSubusertradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.issue", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new IssueIssuerSubusertradeResponse());
    }

    /**
     * Description: 赎回token
     * Summary: 赎回token
     */
    public RedeemIssuerSubusertradeResponse redeemIssuerSubusertrade(RedeemIssuerSubusertradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.redeemIssuerSubusertradeEx(request, headers, runtime);
    }

    /**
     * Description: 赎回token
     * Summary: 赎回token
     */
    public RedeemIssuerSubusertradeResponse redeemIssuerSubusertradeEx(RedeemIssuerSubusertradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.redeem", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RedeemIssuerSubusertradeResponse());
    }

    /**
     * Description: 转移token
     * Summary: 转移token
     */
    public TransferIssuerSubusertradeResponse transferIssuerSubusertrade(TransferIssuerSubusertradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferIssuerSubusertradeEx(request, headers, runtime);
    }

    /**
     * Description: 转移token
     * Summary: 转移token
     */
    public TransferIssuerSubusertradeResponse transferIssuerSubusertradeEx(TransferIssuerSubusertradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferIssuerSubusertradeResponse());
    }
}
