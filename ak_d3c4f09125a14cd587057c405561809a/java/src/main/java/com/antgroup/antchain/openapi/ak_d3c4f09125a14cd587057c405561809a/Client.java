// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models.*;

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
                    new TeaPair("sdk_version", "1.1.1"),
                    new TeaPair("_prod_code", "ak_d3c4f09125a14cd587057c405561809a"),
                    new TeaPair("_prod_channel", "saas")
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
     * <p>Description: 更新项目净值
     * Summary: 更新项目净值</p>
     */
    public UpdateAntdigitalWebtrwatradeIssuerPriceResponse updateAntdigitalWebtrwatradeIssuerPrice(UpdateAntdigitalWebtrwatradeIssuerPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAntdigitalWebtrwatradeIssuerPriceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新项目净值
     * Summary: 更新项目净值</p>
     */
    public UpdateAntdigitalWebtrwatradeIssuerPriceResponse updateAntdigitalWebtrwatradeIssuerPriceEx(UpdateAntdigitalWebtrwatradeIssuerPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.price.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAntdigitalWebtrwatradeIssuerPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询登录登出操作日志
     * Summary: 发行机构查询登录登出操作日志</p>
     */
    public ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse listAntdigitalWebtrwatradeIssuerOperationloglogininfo(ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeIssuerOperationloglogininfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询登录登出操作日志
     * Summary: 发行机构查询登录登出操作日志</p>
     */
    public ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse listAntdigitalWebtrwatradeIssuerOperationloglogininfoEx(ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.operationloglogininfo.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构查询登录登出操作日志
     * Summary: 代销机构查询登录登出操作日志</p>
     */
    public ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse listAntdigitalWebtrwatradeDistributorOperationloglogininfo(ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeDistributorOperationloglogininfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构查询登录登出操作日志
     * Summary: 代销机构查询登录登出操作日志</p>
     */
    public ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse listAntdigitalWebtrwatradeDistributorOperationloglogininfoEx(ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.operationloglogininfo.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取二级用户详情数据
     * Summary: 发行机构获取二级用户详情数据</p>
     */
    public QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse queryAntdigitalWebtrwatradeIssuerSubuserdetail(QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebtrwatradeIssuerSubuserdetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构获取二级用户详情数据
     * Summary: 发行机构获取二级用户详情数据</p>
     */
    public QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse queryAntdigitalWebtrwatradeIssuerSubuserdetailEx(QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuserdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取二级用户详情数据
     * Summary: 代销机构获取二级用户详情数据</p>
     */
    public QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse queryAntdigitalWebtrwatradeDistributorSubuserdetail(QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebtrwatradeDistributorSubuserdetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构获取二级用户详情数据
     * Summary: 代销机构获取二级用户详情数据</p>
     */
    public QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse queryAntdigitalWebtrwatradeDistributorSubuserdetailEx(QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuserdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构跨链账号明细
     * Summary: 发行机构跨链账号明细</p>
     */
    public ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse listAntdigitalWebtrwatradeIssuerCrosschainaccount(ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeIssuerCrosschainaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构跨链账号明细
     * Summary: 发行机构跨链账号明细</p>
     */
    public ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse listAntdigitalWebtrwatradeIssuerCrosschainaccountEx(ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.crosschainaccount.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构跨链账号明细
     * Summary: 代销机构跨链账号明细</p>
     */
    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse listAntdigitalWebtrwatradeDistributorCrosschainaccount(ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeDistributorCrosschainaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构跨链账号明细
     * Summary: 代销机构跨链账号明细</p>
     */
    public ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse listAntdigitalWebtrwatradeDistributorCrosschainaccountEx(ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.crosschainaccount.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询项目及角色信息
     * Summary: 发行机构查询项目及角色信息</p>
     */
    public DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse detailAntdigitalWebtrwatradeIssuerProjectwithrole(DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailAntdigitalWebtrwatradeIssuerProjectwithroleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询项目及角色信息
     * Summary: 发行机构查询项目及角色信息</p>
     */
    public DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse detailAntdigitalWebtrwatradeIssuerProjectwithroleEx(DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.projectwithrole.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询所有操作员的操作日志
     * Summary: 发行机构查询所有操作员的操作日志</p>
     */
    public ListAntdigitalWebtrwatradeIssuerOperationlogResponse listAntdigitalWebtrwatradeIssuerOperationlog(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeIssuerOperationlogEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行机构查询所有操作员的操作日志
     * Summary: 发行机构查询所有操作员的操作日志</p>
     */
    public ListAntdigitalWebtrwatradeIssuerOperationlogResponse listAntdigitalWebtrwatradeIssuerOperationlogEx(ListAntdigitalWebtrwatradeIssuerOperationlogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.operationlog.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeIssuerOperationlogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构查询所有操作员的操作日志
     * Summary: 代销机构查询所有操作员的操作日志</p>
     */
    public ListAntdigitalWebtrwatradeDistributorOperationlogResponse listAntdigitalWebtrwatradeDistributorOperationlog(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeDistributorOperationlogEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代销机构查询所有操作员的操作日志
     * Summary: 代销机构查询所有操作员的操作日志</p>
     */
    public ListAntdigitalWebtrwatradeDistributorOperationlogResponse listAntdigitalWebtrwatradeDistributorOperationlogEx(ListAntdigitalWebtrwatradeDistributorOperationlogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.operationlog.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeDistributorOperationlogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询发行机构下所有的项目
     * Summary: 查询发行机构下所有的项目</p>
     */
    public ListAntdigitalWebtrwatradeIssuerProjectResponse listAntdigitalWebtrwatradeIssuerProject(ListAntdigitalWebtrwatradeIssuerProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeIssuerProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询发行机构下所有的项目
     * Summary: 查询发行机构下所有的项目</p>
     */
    public ListAntdigitalWebtrwatradeIssuerProjectResponse listAntdigitalWebtrwatradeIssuerProjectEx(ListAntdigitalWebtrwatradeIssuerProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.project.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeIssuerProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代销机构下所有的项目
     * Summary: 查询代销机构下所有的项目</p>
     */
    public ListAntdigitalWebtrwatradeDistributorProjectResponse listAntdigitalWebtrwatradeDistributorProject(ListAntdigitalWebtrwatradeDistributorProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeDistributorProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代销机构下所有的项目
     * Summary: 查询代销机构下所有的项目</p>
     */
    public ListAntdigitalWebtrwatradeDistributorProjectResponse listAntdigitalWebtrwatradeDistributorProjectEx(ListAntdigitalWebtrwatradeDistributorProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.project.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeDistributorProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询发行机构和项目下所有关联的二级用户信息
     * Summary: 查询机构和项目下所有关联的二级用户信息</p>
     */
    public ListAntdigitalWebtrwatradeIssuerSubuserResponse listAntdigitalWebtrwatradeIssuerSubuser(ListAntdigitalWebtrwatradeIssuerSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeIssuerSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询发行机构和项目下所有关联的二级用户信息
     * Summary: 查询机构和项目下所有关联的二级用户信息</p>
     */
    public ListAntdigitalWebtrwatradeIssuerSubuserResponse listAntdigitalWebtrwatradeIssuerSubuserEx(ListAntdigitalWebtrwatradeIssuerSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.issuer.subuser.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeIssuerSubuserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代销机构和项目下所有关联的二级用户信息
     * Summary: 查询机构和项目下所有关联的二级用户信息</p>
     */
    public ListAntdigitalWebtrwatradeDistributorSubuserResponse listAntdigitalWebtrwatradeDistributorSubuser(ListAntdigitalWebtrwatradeDistributorSubuserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebtrwatradeDistributorSubuserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代销机构和项目下所有关联的二级用户信息
     * Summary: 查询机构和项目下所有关联的二级用户信息</p>
     */
    public ListAntdigitalWebtrwatradeDistributorSubuserResponse listAntdigitalWebtrwatradeDistributorSubuserEx(ListAntdigitalWebtrwatradeDistributorSubuserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtrwatrade.distributor.subuser.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebtrwatradeDistributorSubuserResponse());
    }
}
