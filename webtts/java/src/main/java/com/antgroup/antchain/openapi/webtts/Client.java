// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtts;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.webtts.models.*;

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
                    new TeaPair("sdk_version", "1.0.7"),
                    new TeaPair("_prod_code", "WEBTTS"),
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
     * <p>Description: Withdraw Token
     * Summary: Withdraw Token</p>
     */
    public WithdrawDacVaultResponse withdrawDacVault(WithdrawDacVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.withdrawDacVaultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Withdraw Token
     * Summary: Withdraw Token</p>
     */
    public WithdrawDacVaultResponse withdrawDacVaultEx(WithdrawDacVaultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.vault.withdraw", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new WithdrawDacVaultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 开通托管服务
     * Summary: 开通托管服务</p>
     */
    public OpenActivateResponse openActivate(OpenActivateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openActivateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 开通托管服务
     * Summary: 开通托管服务</p>
     */
    public OpenActivateResponse openActivateEx(OpenActivateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.activate.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenActivateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 关闭托管服务
     * Summary: 关闭托管服务</p>
     */
    public StopActivateResponse stopActivate(StopActivateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopActivateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 关闭托管服务
     * Summary: 关闭托管服务</p>
     */
    public StopActivateResponse stopActivateEx(StopActivateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.activate.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopActivateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询支持的区块链
     * Summary: 分页查询支持的区块链</p>
     */
    public PagequeryDacBlockchainResponse pagequeryDacBlockchain(PagequeryDacBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDacBlockchainEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询支持的区块链
     * Summary: 分页查询支持的区块链</p>
     */
    public PagequeryDacBlockchainResponse pagequeryDacBlockchainEx(PagequeryDacBlockchainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.blockchain.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDacBlockchainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询支持的币种
     * Summary: 分页查询支持的币种</p>
     */
    public PagequeryDacTokenResponse pagequeryDacToken(PagequeryDacTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDacTokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询支持的币种
     * Summary: 分页查询支持的币种</p>
     */
    public PagequeryDacTokenResponse pagequeryDacTokenEx(PagequeryDacTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.token.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDacTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加白名单服务
     * Summary: 添加白名单服务</p>
     */
    public AddDacWhitelistResponse addDacWhitelist(AddDacWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDacWhitelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加白名单服务
     * Summary: 添加白名单服务</p>
     */
    public AddDacWhitelistResponse addDacWhitelistEx(AddDacWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelist.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDacWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 白名单地址检查
     * Summary: 白名单地址检查</p>
     */
    public CheckDacWhitelistResponse checkDacWhitelist(CheckDacWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkDacWhitelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 白名单地址检查
     * Summary: 白名单地址检查</p>
     */
    public CheckDacWhitelistResponse checkDacWhitelistEx(CheckDacWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelist.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckDacWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Query customer quota and return the comparative balance between customer quota and customer balance
     * 查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
     * Summary: 查询提现最大金额</p>
     */
    public QueryDacQuotaResponse queryDacQuota(QueryDacQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDacQuotaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Query customer quota and return the comparative balance between customer quota and customer balance
     * 查询提现最大金额，会对比个人提现额度和自有余额，取最小值。
     * Summary: 查询提现最大金额</p>
     */
    public QueryDacQuotaResponse queryDacQuotaEx(QueryDacQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.quota.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDacQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定用户和区块链的托管钱包地址
     * Summary: 查询托管地址</p>
     */
    public QueryDacCustodyaddressResponse queryDacCustodyaddress(QueryDacCustodyaddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDacCustodyaddressEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询指定用户和区块链的托管钱包地址
     * Summary: 查询托管地址</p>
     */
    public QueryDacCustodyaddressResponse queryDacCustodyaddressEx(QueryDacCustodyaddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.custodyaddress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDacCustodyaddressResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建deposit订单
     * Summary: 创建deposit订单</p>
     */
    public CreateDacDepositResponse createDacDeposit(CreateDacDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDacDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建deposit订单
     * Summary: 创建deposit订单</p>
     */
    public CreateDacDepositResponse createDacDepositEx(CreateDacDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.deposit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDacDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询deposit订单列表
     * Summary: 分页查询deposit订单列表</p>
     */
    public PagequeryDacDepositResponse pagequeryDacDeposit(PagequeryDacDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDacDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询deposit订单列表
     * Summary: 分页查询deposit订单列表</p>
     */
    public PagequeryDacDepositResponse pagequeryDacDepositEx(PagequeryDacDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.deposit.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDacDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询最大/最小可以deposit的数量
     * Summary: 查询最大/最小可以deposit的数量</p>
     */
    public QueryDacDepositlimitsResponse queryDacDepositlimits(QueryDacDepositlimitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDacDepositlimitsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询最大/最小可以deposit的数量
     * Summary: 查询最大/最小可以deposit的数量</p>
     */
    public QueryDacDepositlimitsResponse queryDacDepositlimitsEx(QueryDacDepositlimitsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.depositlimits.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDacDepositlimitsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 白名单分页列表查询
     * Summary: 白名单分页列表查询</p>
     */
    public PagequeryDacWhitelistResponse pagequeryDacWhitelist(PagequeryDacWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDacWhitelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 白名单分页列表查询
     * Summary: 白名单分页列表查询</p>
     */
    public PagequeryDacWhitelistResponse pagequeryDacWhitelistEx(PagequeryDacWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelist.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDacWhitelistResponse());
    }
}
