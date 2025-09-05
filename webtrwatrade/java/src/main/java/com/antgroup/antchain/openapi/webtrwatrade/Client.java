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
                    new TeaPair("sdk_version", "1.0.25"),
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
     * <b>description</b> :
     * <p>Description: 发行机构创建资产项目
     * Summary: 发行机构创建资产项目</p>
     */
    public CreateIssuerProjectResponse createIssuerProject(CreateIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIssuerProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构创建资产项目
     * Summary: 发行机构创建资产项目</p>
     */
    public CreateIssuerProjectResponse createIssuerProjectEx(CreateIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIssuerProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询发行机构持有的资产项目信息
     * Summary: 分页查询发行机构项目信息</p>
     */
    public PagequeryIssuerProjectResponse pagequeryIssuerProject(PagequeryIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIssuerProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询发行机构持有的资产项目信息
     * Summary: 分页查询发行机构项目信息</p>
     */
    public PagequeryIssuerProjectResponse pagequeryIssuerProjectEx(PagequeryIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIssuerProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询代销机构代销的资产项目信息
     * Summary: 分页查询代销机构项目信息</p>
     */
    public PagequeryDistributorProjectResponse pagequeryDistributorProject(PagequeryDistributorProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDistributorProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询代销机构代销的资产项目信息
     * Summary: 分页查询代销机构项目信息</p>
     */
    public PagequeryDistributorProjectResponse pagequeryDistributorProjectEx(PagequeryDistributorProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.project.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDistributorProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构暂停项目
     * Summary: 发行机构暂停项目</p>
     */
    public PauseIssuerProjectResponse pauseIssuerProject(PauseIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pauseIssuerProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构暂停项目
     * Summary: 发行机构暂停项目</p>
     */
    public PauseIssuerProjectResponse pauseIssuerProjectEx(PauseIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.pause", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PauseIssuerProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构激活项目(使项目生效)
     * Summary: 发行机构激活项目</p>
     */
    public EnableIssuerProjectResponse enableIssuerProject(EnableIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableIssuerProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构激活项目(使项目生效)
     * Summary: 发行机构激活项目</p>
     */
    public EnableIssuerProjectResponse enableIssuerProjectEx(EnableIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableIssuerProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询项目详情
     * Summary: 发行机构查询项目详情</p>
     */
    public DetailIssuerProjectResponse detailIssuerProject(DetailIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailIssuerProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询项目详情
     * Summary: 发行机构查询项目详情</p>
     */
    public DetailIssuerProjectResponse detailIssuerProjectEx(DetailIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailIssuerProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构查询项目详情
     * Summary: 代销机构查询项目详情</p>
     */
    public DetailDistributorProjectResponse detailDistributorProject(DetailDistributorProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailDistributorProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构查询项目详情
     * Summary: 代销机构查询项目详情</p>
     */
    public DetailDistributorProjectResponse detailDistributorProjectEx(DetailDistributorProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.project.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailDistributorProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 平台管理员分页查询所有项目
     * Summary: 平台管理分页查询项目</p>
     */
    public PagequeryPlatformProjectResponse pagequeryPlatformProject(PagequeryPlatformProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryPlatformProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 平台管理员分页查询所有项目
     * Summary: 平台管理分页查询项目</p>
     */
    public PagequeryPlatformProjectResponse pagequeryPlatformProjectEx(PagequeryPlatformProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.platform.project.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryPlatformProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询项目及角色信息
     * Summary: 发行机构查询项目及角色信息</p>
     */
    public DetailIssuerProjectwithroleResponse detailIssuerProjectwithrole(DetailIssuerProjectwithroleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailIssuerProjectwithroleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询项目及角色信息
     * Summary: 发行机构查询项目及角色信息</p>
     */
    public DetailIssuerProjectwithroleResponse detailIssuerProjectwithroleEx(DetailIssuerProjectwithroleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectwithrole.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailIssuerProjectwithroleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构跨链账号明细
     * Summary: 发行机构跨链账号明细</p>
     */
    public ListIssuerCrossaccountResponse listIssuerCrossaccount(ListIssuerCrossaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerCrossaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构跨链账号明细
     * Summary: 发行机构跨链账号明细</p>
     */
    public ListIssuerCrossaccountResponse listIssuerCrossaccountEx(ListIssuerCrossaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.crossaccount.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerCrossaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构跨链账号明细
     * Summary: 代销机构跨链账号明细</p>
     */
    public ListDistributorCrossaccountResponse listDistributorCrossaccount(ListDistributorCrossaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributorCrossaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构跨链账号明细
     * Summary: 代销机构跨链账号明细</p>
     */
    public ListDistributorCrossaccountResponse listDistributorCrossaccountEx(ListDistributorCrossaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.crossaccount.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributorCrossaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取总览统计数据项
     * Summary: 发行机构获取总览统计数据项</p>
     */
    public CountIssuerDatasummaryResponse countIssuerDatasummary(CountIssuerDatasummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countIssuerDatasummaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取总览统计数据项
     * Summary: 发行机构获取总览统计数据项</p>
     */
    public CountIssuerDatasummaryResponse countIssuerDatasummaryEx(CountIssuerDatasummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.datasummary.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountIssuerDatasummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取总览统计数据项
     * Summary: 代销机构获取总览统计数据项</p>
     */
    public CountDistributorDatasummaryResponse countDistributorDatasummary(CountDistributorDatasummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDistributorDatasummaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取总览统计数据项
     * Summary: 代销机构获取总览统计数据项</p>
     */
    public CountDistributorDatasummaryResponse countDistributorDatasummaryEx(CountDistributorDatasummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.datasummary.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDistributorDatasummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取历史资产价值
     * Summary: 发行机构获取历史资产价值</p>
     */
    public ListIssuerDatasummaryResponse listIssuerDatasummary(ListIssuerDatasummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerDatasummaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取历史资产价值
     * Summary: 发行机构获取历史资产价值</p>
     */
    public ListIssuerDatasummaryResponse listIssuerDatasummaryEx(ListIssuerDatasummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.datasummary.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerDatasummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取历史资产价值
     * Summary: 代销机构获取历史资产价值</p>
     */
    public ListDistributorDatasummaryResponse listDistributorDatasummary(ListDistributorDatasummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributorDatasummaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取历史资产价值
     * Summary: 代销机构获取历史资产价值</p>
     */
    public ListDistributorDatasummaryResponse listDistributorDatasummaryEx(ListDistributorDatasummaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.datasummary.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributorDatasummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代销机构列表
     * Summary: 查询代销机构列表</p>
     */
    public ListIssuerInstitutionResponse listIssuerInstitution(ListIssuerInstitutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerInstitutionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代销机构列表
     * Summary: 查询代销机构列表</p>
     */
    public ListIssuerInstitutionResponse listIssuerInstitutionEx(ListIssuerInstitutionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.institution.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerInstitutionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询密钥
     * Summary: 分页查询密钥</p>
     */
    public PagequeryIssuerKeyResponse pagequeryIssuerKey(PagequeryIssuerKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIssuerKeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询密钥
     * Summary: 分页查询密钥</p>
     */
    public PagequeryIssuerKeyResponse pagequeryIssuerKeyEx(PagequeryIssuerKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIssuerKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询密钥详情
     * Summary: 查询密钥详情</p>
     */
    public DetailIssuerKeyResponse detailIssuerKey(DetailIssuerKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailIssuerKeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询密钥详情
     * Summary: 查询密钥详情</p>
     */
    public DetailIssuerKeyResponse detailIssuerKeyEx(DetailIssuerKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailIssuerKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建密钥
     * Summary: 创建密钥</p>
     */
    public CreateIssuerKeyResponse createIssuerKey(CreateIssuerKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIssuerKeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建密钥
     * Summary: 创建密钥</p>
     */
    public CreateIssuerKeyResponse createIssuerKeyEx(CreateIssuerKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIssuerKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除密钥
     * Summary: 删除密钥</p>
     */
    public DeleteIssuerKeyResponse deleteIssuerKey(DeleteIssuerKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIssuerKeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除密钥
     * Summary: 删除密钥</p>
     */
    public DeleteIssuerKeyResponse deleteIssuerKeyEx(DeleteIssuerKeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.key.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteIssuerKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询登录登出操作日志
     * Summary: 发行机构查询登录登出操作日志</p>
     */
    public ListIssuerOperationlogResponse listIssuerOperationlog(ListIssuerOperationlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerOperationlogEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询登录登出操作日志
     * Summary: 发行机构查询登录登出操作日志</p>
     */
    public ListIssuerOperationlogResponse listIssuerOperationlogEx(ListIssuerOperationlogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerOperationlogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构查询登录登出操作日志
     * Summary: 代销机构查询登录登出操作日志</p>
     */
    public ListDistributorOperationlogResponse listDistributorOperationlog(ListDistributorOperationlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributorOperationlogEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构查询登录登出操作日志
     * Summary: 代销机构查询登录登出操作日志</p>
     */
    public ListDistributorOperationlogResponse listDistributorOperationlogEx(ListDistributorOperationlogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributorOperationlogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构添加项目密钥
     * Summary: 发行机构添加项目密钥</p>
     */
    public AddIssuerProjectkeyResponse addIssuerProjectkey(AddIssuerProjectkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addIssuerProjectkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构添加项目密钥
     * Summary: 发行机构添加项目密钥</p>
     */
    public AddIssuerProjectkeyResponse addIssuerProjectkeyEx(AddIssuerProjectkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddIssuerProjectkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构删除项目密钥
     * Summary: 发行机构删除项目密钥</p>
     */
    public DeleteIssuerProjectkeyResponse deleteIssuerProjectkey(DeleteIssuerProjectkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIssuerProjectkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构删除项目密钥
     * Summary: 发行机构删除项目密钥</p>
     */
    public DeleteIssuerProjectkeyResponse deleteIssuerProjectkeyEx(DeleteIssuerProjectkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteIssuerProjectkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取项目密钥列表
     * Summary: 发行机构获取项目密钥列表</p>
     */
    public ListIssuerProjectkeyResponse listIssuerProjectkey(ListIssuerProjectkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerProjectkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取项目密钥列表
     * Summary: 发行机构获取项目密钥列表</p>
     */
    public ListIssuerProjectkeyResponse listIssuerProjectkeyEx(ListIssuerProjectkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerProjectkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构分页查询密钥关联的项目
     * Summary: 发行机构分页查询密钥关联的项目</p>
     */
    public PagequeryIssuerProjectkeyResponse pagequeryIssuerProjectkey(PagequeryIssuerProjectkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIssuerProjectkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构分页查询密钥关联的项目
     * Summary: 发行机构分页查询密钥关联的项目</p>
     */
    public PagequeryIssuerProjectkeyResponse pagequeryIssuerProjectkeyEx(PagequeryIssuerProjectkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectkey.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIssuerProjectkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新项目净值
     * Summary: 更新项目净值</p>
     */
    public UpdateIssuerNetvalueResponse updateIssuerNetvalue(UpdateIssuerNetvalueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIssuerNetvalueEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新项目净值
     * Summary: 更新项目净值</p>
     */
    public UpdateIssuerNetvalueResponse updateIssuerNetvalueEx(UpdateIssuerNetvalueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.netvalue.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIssuerNetvalueResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取净值列表
     * Summary: 获取净值列表</p>
     */
    public ListIssuerNetvalueResponse listIssuerNetvalue(ListIssuerNetvalueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerNetvalueEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取净值列表
     * Summary: 获取净值列表</p>
     */
    public ListIssuerNetvalueResponse listIssuerNetvalueEx(ListIssuerNetvalueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.netvalue.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerNetvalueResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传项目报告
     * Summary: 上传项目报告</p>
     */
    public UploadIssuerReportResponse uploadIssuerReport(UploadIssuerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadIssuerReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传项目报告
     * Summary: 上传项目报告</p>
     */
    public UploadIssuerReportResponse uploadIssuerReportEx(UploadIssuerReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadIssuerReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取历史报告列表
     * Summary: 发行机构获取历史报告列表</p>
     */
    public ListIssuerReportResponse listIssuerReport(ListIssuerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIssuerReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取历史报告列表
     * Summary: 发行机构获取历史报告列表</p>
     */
    public ListIssuerReportResponse listIssuerReportEx(ListIssuerReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIssuerReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取历史项目报告
     * Summary: 代销机构获取历史项目报告</p>
     */
    public ListDistributorReportResponse listDistributorReport(ListDistributorReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributorReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取历史项目报告
     * Summary: 代销机构获取历史项目报告</p>
     */
    public ListDistributorReportResponse listDistributorReportEx(ListDistributorReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributorReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取报告文件下载URL
     * Summary: 发行机构获取报告文件下载URL</p>
     */
    public DownloadIssuerReportResponse downloadIssuerReport(DownloadIssuerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadIssuerReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取报告文件下载URL
     * Summary: 发行机构获取报告文件下载URL</p>
     */
    public DownloadIssuerReportResponse downloadIssuerReportEx(DownloadIssuerReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadIssuerReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取报告文件预览URL
     * Summary: 发行机构获取报告文件预览URL</p>
     */
    public PreviewIssuerReportResponse previewIssuerReport(PreviewIssuerReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewIssuerReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取报告文件预览URL
     * Summary: 发行机构获取报告文件预览URL</p>
     */
    public PreviewIssuerReportResponse previewIssuerReportEx(PreviewIssuerReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.report.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewIssuerReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取报告文件下载URL
     * Summary: 代销机构获取报告文件下载URL</p>
     */
    public DownloadDistributorReportResponse downloadDistributorReport(DownloadDistributorReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadDistributorReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取报告文件下载URL
     * Summary: 代销机构获取报告文件下载URL</p>
     */
    public DownloadDistributorReportResponse downloadDistributorReportEx(DownloadDistributorReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadDistributorReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取报告文件预览URL
     * Summary: 代销机构获取报告文件预览URL</p>
     */
    public PreviewDistributorReportResponse previewDistributorReport(PreviewDistributorReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewDistributorReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取报告文件预览URL
     * Summary: 代销机构获取报告文件预览URL</p>
     */
    public PreviewDistributorReportResponse previewDistributorReportEx(PreviewDistributorReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.report.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewDistributorReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表</p>
     */
    public PagequeryIssuerSubuserResponse pagequeryIssuerSubuser(PagequeryIssuerSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIssuerSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表</p>
     */
    public PagequeryIssuerSubuserResponse pagequeryIssuerSubuserEx(PagequeryIssuerSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIssuerSubuserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表</p>
     */
    public PagequeryDistributorSubuserResponse pagequeryDistributorSubuser(PagequeryDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询二级用户列表
     * Summary: 分页查询二级用户列表</p>
     */
    public PagequeryDistributorSubuserResponse pagequeryDistributorSubuserEx(PagequeryDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDistributorSubuserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询单个二级用户
     * Summary: 查询单个二级用户</p>
     */
    public QueryIssuerSubuserResponse queryIssuerSubuser(QueryIssuerSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIssuerSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询单个二级用户
     * Summary: 查询单个二级用户</p>
     */
    public QueryIssuerSubuserResponse queryIssuerSubuserEx(QueryIssuerSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIssuerSubuserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询单个二级用户
     * Summary: 查询单个二级用户</p>
     */
    public QueryDistributorSubuserResponse queryDistributorSubuser(QueryDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询单个二级用户
     * Summary: 查询单个二级用户</p>
     */
    public QueryDistributorSubuserResponse queryDistributorSubuserEx(QueryDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributorSubuserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新二级用户
     * Summary: 更新二级用户</p>
     */
    public UpdateDistributorSubuserResponse updateDistributorSubuser(UpdateDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新二级用户
     * Summary: 更新二级用户</p>
     */
    public UpdateDistributorSubuserResponse updateDistributorSubuserEx(UpdateDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDistributorSubuserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加二级用户
     * Summary: 添加二级用户</p>
     */
    public CreateDistributorSubuserResponse createDistributorSubuser(CreateDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加二级用户
     * Summary: 添加二级用户</p>
     */
    public CreateDistributorSubuserResponse createDistributorSubuserEx(CreateDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributorSubuserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除二级用户
     * Summary: 删除二级用户</p>
     */
    public DeleteDistributorSubuserResponse deleteDistributorSubuser(DeleteDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除二级用户
     * Summary: 删除二级用户</p>
     */
    public DeleteDistributorSubuserResponse deleteDistributorSubuserEx(DeleteDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDistributorSubuserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取二级用户配额
     * Summary: 获取二级用户配额</p>
     */
    public CountDistributorSubusertargetResponse countDistributorSubusertarget(CountDistributorSubusertargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countDistributorSubusertargetEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取二级用户配额
     * Summary: 获取二级用户配额</p>
     */
    public CountDistributorSubusertargetResponse countDistributorSubusertargetEx(CountDistributorSubusertargetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subusertarget.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountDistributorSubusertargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取二级用户详情数据
     * Summary: 发行机构获取二级用户详情数据</p>
     */
    public QueryIssuerResponse queryIssuer(QueryIssuerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIssuerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取二级用户详情数据
     * Summary: 发行机构获取二级用户详情数据</p>
     */
    public QueryIssuerResponse queryIssuerEx(QueryIssuerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIssuerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取二级用户详情数据
     * Summary: 代销机构获取二级用户详情数据</p>
     */
    public QueryDistributorResponse queryDistributor(QueryDistributorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDistributorEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取二级用户详情数据
     * Summary: 代销机构获取二级用户详情数据</p>
     */
    public QueryDistributorResponse queryDistributorEx(QueryDistributorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDistributorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行token
     * Summary: 发行token</p>
     */
    public IssueIssuerSubusertradeResponse issueIssuerSubusertrade(IssueIssuerSubusertradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.issueIssuerSubusertradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行token
     * Summary: 发行token</p>
     */
    public IssueIssuerSubusertradeResponse issueIssuerSubusertradeEx(IssueIssuerSubusertradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.issue", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new IssueIssuerSubusertradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 赎回token
     * Summary: 赎回token</p>
     */
    public RedeemIssuerSubusertradeResponse redeemIssuerSubusertrade(RedeemIssuerSubusertradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.redeemIssuerSubusertradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 赎回token
     * Summary: 赎回token</p>
     */
    public RedeemIssuerSubusertradeResponse redeemIssuerSubusertradeEx(RedeemIssuerSubusertradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.redeem", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RedeemIssuerSubusertradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 转移token
     * Summary: 转移token</p>
     */
    public TransferIssuerSubusertradeResponse transferIssuerSubusertrade(TransferIssuerSubusertradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferIssuerSubusertradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 转移token
     * Summary: 转移token</p>
     */
    public TransferIssuerSubusertradeResponse transferIssuerSubusertradeEx(TransferIssuerSubusertradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subusertrade.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferIssuerSubusertradeResponse());
    }
}
