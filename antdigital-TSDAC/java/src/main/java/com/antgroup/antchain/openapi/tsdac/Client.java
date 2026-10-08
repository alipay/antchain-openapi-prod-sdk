// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.tsdac.models.*;

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
                    new TeaPair("sdk_version", "1.2.18"),
                    new TeaPair("_prod_code", "TSDAC"),
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
    public WithdrawAntdigitalWebttsDacVaultResponse withdrawAntdigitalWebttsDacVault(WithdrawAntdigitalWebttsDacVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.withdrawAntdigitalWebttsDacVaultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Withdraw Token
     * Summary: Withdraw Token</p>
     */
    public WithdrawAntdigitalWebttsDacVaultResponse withdrawAntdigitalWebttsDacVaultEx(WithdrawAntdigitalWebttsDacVaultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.vault.withdraw", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new WithdrawAntdigitalWebttsDacVaultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 开通托管服务
     * Summary: 开通托管服务</p>
     */
    public OpenAntdigitalWebttsActivateResponse openAntdigitalWebttsActivate(OpenAntdigitalWebttsActivateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openAntdigitalWebttsActivateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 开通托管服务
     * Summary: 开通托管服务</p>
     */
    public OpenAntdigitalWebttsActivateResponse openAntdigitalWebttsActivateEx(OpenAntdigitalWebttsActivateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.activate.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenAntdigitalWebttsActivateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 关闭托管服务
     * Summary: 关闭托管服务</p>
     */
    public StopAntdigitalWebttsActivateResponse stopAntdigitalWebttsActivate(StopAntdigitalWebttsActivateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopAntdigitalWebttsActivateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 关闭托管服务
     * Summary: 关闭托管服务</p>
     */
    public StopAntdigitalWebttsActivateResponse stopAntdigitalWebttsActivateEx(StopAntdigitalWebttsActivateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.activate.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopAntdigitalWebttsActivateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询支持的区块链
     * Summary: 分页查询支持的区块链</p>
     */
    public PagequeryAntdigitalWebttsDacBlockchainResponse pagequeryAntdigitalWebttsDacBlockchain(PagequeryAntdigitalWebttsDacBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAntdigitalWebttsDacBlockchainEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询支持的区块链
     * Summary: 分页查询支持的区块链</p>
     */
    public PagequeryAntdigitalWebttsDacBlockchainResponse pagequeryAntdigitalWebttsDacBlockchainEx(PagequeryAntdigitalWebttsDacBlockchainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.blockchain.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAntdigitalWebttsDacBlockchainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询支持的币种
     * Summary: 分页查询支持的币种</p>
     */
    public PagequeryAntdigitalWebttsDacTokenResponse pagequeryAntdigitalWebttsDacToken(PagequeryAntdigitalWebttsDacTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAntdigitalWebttsDacTokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询支持的币种
     * Summary: 分页查询支持的币种</p>
     */
    public PagequeryAntdigitalWebttsDacTokenResponse pagequeryAntdigitalWebttsDacTokenEx(PagequeryAntdigitalWebttsDacTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.token.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAntdigitalWebttsDacTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加白名单服务
     * Summary: 添加白名单服务</p>
     */
    public AddAntdigitalWebttsDacWhitelistResponse addAntdigitalWebttsDacWhitelist(AddAntdigitalWebttsDacWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAntdigitalWebttsDacWhitelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加白名单服务
     * Summary: 添加白名单服务</p>
     */
    public AddAntdigitalWebttsDacWhitelistResponse addAntdigitalWebttsDacWhitelistEx(AddAntdigitalWebttsDacWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelist.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAntdigitalWebttsDacWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 白名单地址检查
     * Summary: 白名单地址检查</p>
     */
    public CheckAntdigitalWebttsDacWhitelistResponse checkAntdigitalWebttsDacWhitelist(CheckAntdigitalWebttsDacWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAntdigitalWebttsDacWhitelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 白名单地址检查
     * Summary: 白名单地址检查</p>
     */
    public CheckAntdigitalWebttsDacWhitelistResponse checkAntdigitalWebttsDacWhitelistEx(CheckAntdigitalWebttsDacWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelist.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAntdigitalWebttsDacWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询Custody钱包地址列表
     * Summary: 查询Custody钱包地址列表</p>
     */
    public QueryAntdigitalWebttsDacCustodyaddressResponse queryAntdigitalWebttsDacCustodyaddress(QueryAntdigitalWebttsDacCustodyaddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacCustodyaddressEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询Custody钱包地址列表
     * Summary: 查询Custody钱包地址列表</p>
     */
    public QueryAntdigitalWebttsDacCustodyaddressResponse queryAntdigitalWebttsDacCustodyaddressEx(QueryAntdigitalWebttsDacCustodyaddressRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.custodyaddress.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacCustodyaddressResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建deposit订单
     * Summary: 创建deposit订单</p>
     */
    public CreateAntdigitalWebttsDacDepositResponse createAntdigitalWebttsDacDeposit(CreateAntdigitalWebttsDacDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntdigitalWebttsDacDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建deposit订单
     * Summary: 创建deposit订单</p>
     */
    public CreateAntdigitalWebttsDacDepositResponse createAntdigitalWebttsDacDepositEx(CreateAntdigitalWebttsDacDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.deposit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntdigitalWebttsDacDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询deposit订单列表
     * Summary: 分页查询deposit订单列表</p>
     */
    public PagequeryAntdigitalWebttsDacDepositResponse pagequeryAntdigitalWebttsDacDeposit(PagequeryAntdigitalWebttsDacDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAntdigitalWebttsDacDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询deposit订单列表
     * Summary: 分页查询deposit订单列表</p>
     */
    public PagequeryAntdigitalWebttsDacDepositResponse pagequeryAntdigitalWebttsDacDepositEx(PagequeryAntdigitalWebttsDacDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.deposit.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAntdigitalWebttsDacDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询最大/最小可以deposit的数量
     * Summary: 查询最大/最小可以deposit的数量</p>
     */
    public QueryAntdigitalWebttsDacDepositlimitsResponse queryAntdigitalWebttsDacDepositlimits(QueryAntdigitalWebttsDacDepositlimitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacDepositlimitsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询最大/最小可以deposit的数量
     * Summary: 查询最大/最小可以deposit的数量</p>
     */
    public QueryAntdigitalWebttsDacDepositlimitsResponse queryAntdigitalWebttsDacDepositlimitsEx(QueryAntdigitalWebttsDacDepositlimitsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.depositlimits.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacDepositlimitsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 白名单分页列表查询
     * Summary: 白名单分页列表查询</p>
     */
    public PagequeryAntdigitalWebttsDacWhitelistResponse pagequeryAntdigitalWebttsDacWhitelist(PagequeryAntdigitalWebttsDacWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAntdigitalWebttsDacWhitelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 白名单分页列表查询
     * Summary: 白名单分页列表查询</p>
     */
    public PagequeryAntdigitalWebttsDacWhitelistResponse pagequeryAntdigitalWebttsDacWhitelistEx(PagequeryAntdigitalWebttsDacWhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelist.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAntdigitalWebttsDacWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询Master Account出入金单笔交易限额
     * Summary: 查询Master Account出入金单笔交易限额</p>
     */
    public AmountlimitsAntdigitalWebttsDacTransactionResponse amountlimitsAntdigitalWebttsDacTransaction(AmountlimitsAntdigitalWebttsDacTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.amountlimitsAntdigitalWebttsDacTransactionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询Master Account出入金单笔交易限额
     * Summary: 查询Master Account出入金单笔交易限额</p>
     */
    public AmountlimitsAntdigitalWebttsDacTransactionResponse amountlimitsAntdigitalWebttsDacTransactionEx(AmountlimitsAntdigitalWebttsDacTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.transaction.amountlimits", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AmountlimitsAntdigitalWebttsDacTransactionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询Master Account出入金累计额度
     * Summary: 查询Master Account出入金累计额度</p>
     */
    public AmountcumulativeAntdigitalWebttsDacTransactionResponse amountcumulativeAntdigitalWebttsDacTransaction(AmountcumulativeAntdigitalWebttsDacTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.amountcumulativeAntdigitalWebttsDacTransactionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询Master Account出入金累计额度
     * Summary: 查询Master Account出入金累计额度</p>
     */
    public AmountcumulativeAntdigitalWebttsDacTransactionResponse amountcumulativeAntdigitalWebttsDacTransactionEx(AmountcumulativeAntdigitalWebttsDacTransactionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.transaction.amountcumulative", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AmountcumulativeAntdigitalWebttsDacTransactionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金创建订单
     * Summary: 出金创建订单</p>
     */
    public CreateAntdigitalWebttsDacWithdrawResponse createAntdigitalWebttsDacWithdraw(CreateAntdigitalWebttsDacWithdrawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntdigitalWebttsDacWithdrawEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金创建订单
     * Summary: 出金创建订单</p>
     */
    public CreateAntdigitalWebttsDacWithdrawResponse createAntdigitalWebttsDacWithdrawEx(CreateAntdigitalWebttsDacWithdrawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.withdraw.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntdigitalWebttsDacWithdrawResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金订单审批
     * Summary: 出金订单审批</p>
     */
    public AuditAntdigitalWebttsDacWithdrawResponse auditAntdigitalWebttsDacWithdraw(AuditAntdigitalWebttsDacWithdrawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.auditAntdigitalWebttsDacWithdrawEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金订单审批
     * Summary: 出金订单审批</p>
     */
    public AuditAntdigitalWebttsDacWithdrawResponse auditAntdigitalWebttsDacWithdrawEx(AuditAntdigitalWebttsDacWithdrawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.withdraw.audit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuditAntdigitalWebttsDacWithdrawResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金订单列表查询
     * Summary: 出金订单列表查询</p>
     */
    public ListAntdigitalWebttsDacWithdrawResponse listAntdigitalWebttsDacWithdraw(ListAntdigitalWebttsDacWithdrawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebttsDacWithdrawEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金订单列表查询
     * Summary: 出金订单列表查询</p>
     */
    public ListAntdigitalWebttsDacWithdrawResponse listAntdigitalWebttsDacWithdrawEx(ListAntdigitalWebttsDacWithdrawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.withdraw.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebttsDacWithdrawResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 入金审核订单
     * Summary: 入金审核订单</p>
     */
    public AuditAntdigitalWebttsDacDepositResponse auditAntdigitalWebttsDacDeposit(AuditAntdigitalWebttsDacDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.auditAntdigitalWebttsDacDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 入金审核订单
     * Summary: 入金审核订单</p>
     */
    public AuditAntdigitalWebttsDacDepositResponse auditAntdigitalWebttsDacDepositEx(AuditAntdigitalWebttsDacDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.deposit.audit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuditAntdigitalWebttsDacDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Checker审核白名单订单
     * Summary: Checker审核白名单订单</p>
     */
    public ExecAntdigitalWebttsDacWhitelistorderResponse execAntdigitalWebttsDacWhitelistorder(ExecAntdigitalWebttsDacWhitelistorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAntdigitalWebttsDacWhitelistorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Checker审核白名单订单
     * Summary: Checker审核白名单订单</p>
     */
    public ExecAntdigitalWebttsDacWhitelistorderResponse execAntdigitalWebttsDacWhitelistorderEx(ExecAntdigitalWebttsDacWhitelistorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelistorder.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAntdigitalWebttsDacWhitelistorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 入金订单详情查询
     * Summary: 入金订单详情查询</p>
     */
    public DetailAntdigitalWebttsDacDepositResponse detailAntdigitalWebttsDacDeposit(DetailAntdigitalWebttsDacDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailAntdigitalWebttsDacDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 入金订单详情查询
     * Summary: 入金订单详情查询</p>
     */
    public DetailAntdigitalWebttsDacDepositResponse detailAntdigitalWebttsDacDepositEx(DetailAntdigitalWebttsDacDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.deposit.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailAntdigitalWebttsDacDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询白名单申请订单详情
     * Summary: 查询白名单申请订单详情</p>
     */
    public QueryAntdigitalWebttsDacWhitelistorderResponse queryAntdigitalWebttsDacWhitelistorder(QueryAntdigitalWebttsDacWhitelistorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacWhitelistorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询白名单申请订单详情
     * Summary: 查询白名单申请订单详情</p>
     */
    public QueryAntdigitalWebttsDacWhitelistorderResponse queryAntdigitalWebttsDacWhitelistorderEx(QueryAntdigitalWebttsDacWhitelistorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelistorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacWhitelistorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询企业数字资产持仓
     * Summary: 查询企业数字资产持仓</p>
     */
    public QueryAntdigitalWebttsDacAssetpositionResponse queryAntdigitalWebttsDacAssetposition(QueryAntdigitalWebttsDacAssetpositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacAssetpositionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询企业数字资产持仓
     * Summary: 查询企业数字资产持仓</p>
     */
    public QueryAntdigitalWebttsDacAssetpositionResponse queryAntdigitalWebttsDacAssetpositionEx(QueryAntdigitalWebttsDacAssetpositionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.assetposition.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacAssetpositionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金取消订单
     * Summary: 出金取消订单</p>
     */
    public CancelAntdigitalWebttsDacWithdrawResponse cancelAntdigitalWebttsDacWithdraw(CancelAntdigitalWebttsDacWithdrawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntdigitalWebttsDacWithdrawEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金取消订单
     * Summary: 出金取消订单</p>
     */
    public CancelAntdigitalWebttsDacWithdrawResponse cancelAntdigitalWebttsDacWithdrawEx(CancelAntdigitalWebttsDacWithdrawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.withdraw.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntdigitalWebttsDacWithdrawResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金订单详情查询
     * Summary: 出金订单详情查询</p>
     */
    public QueryAntdigitalWebttsDacWithdrawResponse queryAntdigitalWebttsDacWithdraw(QueryAntdigitalWebttsDacWithdrawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacWithdrawEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 出金订单详情查询
     * Summary: 出金订单详情查询</p>
     */
    public QueryAntdigitalWebttsDacWithdrawResponse queryAntdigitalWebttsDacWithdrawEx(QueryAntdigitalWebttsDacWithdrawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.withdraw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacWithdrawResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交白名单所有权验证结果
     * Summary: 提交白名单所有权验证结果</p>
     */
    public ExecAntdigitalWebttsDacWhitelistverifyResponse execAntdigitalWebttsDacWhitelistverify(ExecAntdigitalWebttsDacWhitelistverifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAntdigitalWebttsDacWhitelistverifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提交白名单所有权验证结果
     * Summary: 提交白名单所有权验证结果</p>
     */
    public ExecAntdigitalWebttsDacWhitelistverifyResponse execAntdigitalWebttsDacWhitelistverifyEx(ExecAntdigitalWebttsDacWhitelistverifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelistverify.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAntdigitalWebttsDacWhitelistverifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改白名单别名
     * Summary: 修改白名单别名</p>
     */
    public ResetAntdigitalWebttsDacWhitelistnicknameResponse resetAntdigitalWebttsDacWhitelistnickname(ResetAntdigitalWebttsDacWhitelistnicknameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetAntdigitalWebttsDacWhitelistnicknameEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改白名单别名
     * Summary: 修改白名单别名</p>
     */
    public ResetAntdigitalWebttsDacWhitelistnicknameResponse resetAntdigitalWebttsDacWhitelistnicknameEx(ResetAntdigitalWebttsDacWhitelistnicknameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelistnickname.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetAntdigitalWebttsDacWhitelistnicknameResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 入金取消订单
     * Summary: 入金取消订单</p>
     */
    public CancelAntdigitalWebttsDacDepositResponse cancelAntdigitalWebttsDacDeposit(CancelAntdigitalWebttsDacDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntdigitalWebttsDacDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 入金取消订单
     * Summary: 入金取消订单</p>
     */
    public CancelAntdigitalWebttsDacDepositResponse cancelAntdigitalWebttsDacDepositEx(CancelAntdigitalWebttsDacDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.deposit.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntdigitalWebttsDacDepositResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询白名单申请订单列表
     * Summary: 查询白名单申请订单列表</p>
     */
    public QueryAntdigitalWebttsDacWhitelistorderlistResponse queryAntdigitalWebttsDacWhitelistorderlist(QueryAntdigitalWebttsDacWhitelistorderlistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacWhitelistorderlistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询白名单申请订单列表
     * Summary: 查询白名单申请订单列表</p>
     */
    public QueryAntdigitalWebttsDacWhitelistorderlistResponse queryAntdigitalWebttsDacWhitelistorderlistEx(QueryAntdigitalWebttsDacWhitelistorderlistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.whitelistorderlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacWhitelistorderlistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询Master Account 和 User启用状态
     * Summary: 查询Master Account 和 User启用状态</p>
     */
    public QueryAntdigitalWebttsDacAccountstatusResponse queryAntdigitalWebttsDacAccountstatus(QueryAntdigitalWebttsDacAccountstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacAccountstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询Master Account 和 User启用状态
     * Summary: 查询Master Account 和 User启用状态</p>
     */
    public QueryAntdigitalWebttsDacAccountstatusResponse queryAntdigitalWebttsDacAccountstatusEx(QueryAntdigitalWebttsDacAccountstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.accountstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacAccountstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改DAC客户角色
     * Summary: 修改DAC客户角色</p>
     */
    public ResetAntdigitalWebttsDacCustomerroleResponse resetAntdigitalWebttsDacCustomerrole(ResetAntdigitalWebttsDacCustomerroleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetAntdigitalWebttsDacCustomerroleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改DAC客户角色
     * Summary: 修改DAC客户角色</p>
     */
    public ResetAntdigitalWebttsDacCustomerroleResponse resetAntdigitalWebttsDacCustomerroleEx(ResetAntdigitalWebttsDacCustomerroleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.customerrole.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetAntdigitalWebttsDacCustomerroleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询DAC客户列表
     * Summary: 查询DAC客户列表</p>
     */
    public QueryAntdigitalWebttsDacCustomerResponse queryAntdigitalWebttsDacCustomer(QueryAntdigitalWebttsDacCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacCustomerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询DAC客户列表
     * Summary: 查询DAC客户列表</p>
     */
    public QueryAntdigitalWebttsDacCustomerResponse queryAntdigitalWebttsDacCustomerEx(QueryAntdigitalWebttsDacCustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.customer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacCustomerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询DAC登录客户角色
     * Summary: 查询DAC登录客户角色</p>
     */
    public QueryAntdigitalWebttsDacCustomerroleResponse queryAntdigitalWebttsDacCustomerrole(QueryAntdigitalWebttsDacCustomerroleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacCustomerroleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询DAC登录客户角色
     * Summary: 查询DAC登录客户角色</p>
     */
    public QueryAntdigitalWebttsDacCustomerroleResponse queryAntdigitalWebttsDacCustomerroleEx(QueryAntdigitalWebttsDacCustomerroleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.customerrole.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacCustomerroleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询DAC客户角色列表
     * Summary: 查询DAC客户角色列表</p>
     */
    public QueryAntdigitalWebttsDacRoleResponse queryAntdigitalWebttsDacRole(QueryAntdigitalWebttsDacRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacRoleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询DAC客户角色列表
     * Summary: 查询DAC客户角色列表</p>
     */
    public QueryAntdigitalWebttsDacRoleResponse queryAntdigitalWebttsDacRoleEx(QueryAntdigitalWebttsDacRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.role.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacRoleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 账单查询-托管费账单明细查询
     * Summary: 账单查询-托管费账单明细查询</p>
     */
    public CustodydetailAntdigitalWebttsDacBillResponse custodydetailAntdigitalWebttsDacBill(CustodydetailAntdigitalWebttsDacBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.custodydetailAntdigitalWebttsDacBillEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 账单查询-托管费账单明细查询
     * Summary: 账单查询-托管费账单明细查询</p>
     */
    public CustodydetailAntdigitalWebttsDacBillResponse custodydetailAntdigitalWebttsDacBillEx(CustodydetailAntdigitalWebttsDacBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.bill.custodydetail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CustodydetailAntdigitalWebttsDacBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 账单查询-汇总账单查询
     * Summary: 账单查询-汇总账单查询</p>
     */
    public ListAntdigitalWebttsDacBillResponse listAntdigitalWebttsDacBill(ListAntdigitalWebttsDacBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAntdigitalWebttsDacBillEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 账单查询-汇总账单查询
     * Summary: 账单查询-汇总账单查询</p>
     */
    public ListAntdigitalWebttsDacBillResponse listAntdigitalWebttsDacBillEx(ListAntdigitalWebttsDacBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.bill.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListAntdigitalWebttsDacBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 账单查询-交易费明细查询
     * Summary: 账单查询-交易费明细查询</p>
     */
    public TransactiondetailAntdigitalWebttsDacBillResponse transactiondetailAntdigitalWebttsDacBill(TransactiondetailAntdigitalWebttsDacBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transactiondetailAntdigitalWebttsDacBillEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 账单查询-交易费明细查询
     * Summary: 账单查询-交易费明细查询</p>
     */
    public TransactiondetailAntdigitalWebttsDacBillResponse transactiondetailAntdigitalWebttsDacBillEx(TransactiondetailAntdigitalWebttsDacBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.bill.transactiondetail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransactiondetailAntdigitalWebttsDacBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询网络上账区块数
     * Summary: 查询网络上账区块数</p>
     */
    public QueryAntdigitalWebttsDacTxResponse queryAntdigitalWebttsDacTx(QueryAntdigitalWebttsDacTxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntdigitalWebttsDacTxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询网络上账区块数
     * Summary: 查询网络上账区块数</p>
     */
    public QueryAntdigitalWebttsDacTxResponse queryAntdigitalWebttsDacTxEx(QueryAntdigitalWebttsDacTxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.tx.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntdigitalWebttsDacTxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AML 回调接口
     * Summary: AML 回调接口</p>
     */
    public CallbackAntdigitalWebttsDacAmlResponse callbackAntdigitalWebttsDacAml(CallbackAntdigitalWebttsDacAmlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackAntdigitalWebttsDacAmlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AML 回调接口
     * Summary: AML 回调接口</p>
     */
    public CallbackAntdigitalWebttsDacAmlResponse callbackAntdigitalWebttsDacAmlEx(CallbackAntdigitalWebttsDacAmlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.aml.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackAntdigitalWebttsDacAmlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询其所属的出金和入金交易记录
     * Summary: 查询其所属的出金和入金交易记录</p>
     */
    public QueryhistoryAntdigitalWebttsDacDepositResponse queryhistoryAntdigitalWebttsDacDeposit(QueryhistoryAntdigitalWebttsDacDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryhistoryAntdigitalWebttsDacDepositEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询其所属的出金和入金交易记录
     * Summary: 查询其所属的出金和入金交易记录</p>
     */
    public QueryhistoryAntdigitalWebttsDacDepositResponse queryhistoryAntdigitalWebttsDacDepositEx(QueryhistoryAntdigitalWebttsDacDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antdigital.webtts.dac.deposit.queryhistory", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryhistoryAntdigitalWebttsDacDepositResponse());
    }
}
