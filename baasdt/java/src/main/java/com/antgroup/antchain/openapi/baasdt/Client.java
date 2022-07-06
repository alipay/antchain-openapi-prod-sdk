// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.baasdt.models.*;
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
                    new TeaPair("sdk_version", "1.3.67")
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
     * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-创建卡密
     */
    public ExecCardCreateResponse execCardCreate(ExecCardCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCardCreateEx(request, headers, runtime);
    }

    /**
     * Description: 创建卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-创建卡密
     */
    public ExecCardCreateResponse execCardCreateEx(ExecCardCreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.card.create.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCardCreateResponse());
    }

    /**
     * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-查询卡密
     */
    public ExecCardQueryResponse execCardQuery(ExecCardQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCardQueryEx(request, headers, runtime);
    }

    /**
     * Description: 查询卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-查询卡密
     */
    public ExecCardQueryResponse execCardQueryEx(ExecCardQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.card.query.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCardQueryResponse());
    }

    /**
     * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-记名卡发行
     */
    public ExecCardBindnameResponse execCardBindname(ExecCardBindnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCardBindnameEx(request, headers, runtime);
    }

    /**
     * Description: 记名卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-记名卡发行
     */
    public ExecCardBindnameResponse execCardBindnameEx(ExecCardBindnameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.card.bindname.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCardBindnameResponse());
    }

    /**
     * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-充值卡密
     */
    public ExecCardChargeResponse execCardCharge(ExecCardChargeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCardChargeEx(request, headers, runtime);
    }

    /**
     * Description: 充值卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-充值卡密
     */
    public ExecCardChargeResponse execCardChargeEx(ExecCardChargeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.card.charge.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCardChargeResponse());
    }

    /**
     * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-核销卡密
     */
    public ExecCardWriteoffResponse execCardWriteoff(ExecCardWriteoffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCardWriteoffEx(request, headers, runtime);
    }

    /**
     * Description: 核销卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-核销卡密
     */
    public ExecCardWriteoffResponse execCardWriteoffEx(ExecCardWriteoffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.card.writeoff.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCardWriteoffResponse());
    }

    /**
     * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-过期卡密
     */
    public ExecCardExpiredResponse execCardExpired(ExecCardExpiredRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCardExpiredEx(request, headers, runtime);
    }

    /**
     * Description: 过期卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-过期卡密
     */
    public ExecCardExpiredResponse execCardExpiredEx(ExecCardExpiredRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.card.expired.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCardExpiredResponse());
    }

    /**
     * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-风控禁用
     */
    public ExecCardForbiddenResponse execCardForbidden(ExecCardForbiddenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCardForbiddenEx(request, headers, runtime);
    }

    /**
     * Description: 风控禁用卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-风控禁用
     */
    public ExecCardForbiddenResponse execCardForbiddenEx(ExecCardForbiddenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.card.forbidden.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCardForbiddenResponse());
    }

    /**
     * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-充值重置
     */
    public ExecCardChargeresetResponse execCardChargereset(ExecCardChargeresetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCardChargeresetEx(request, headers, runtime);
    }

    /**
     * Description: 充值重置卡密，卡密托管服务调用，需要传入交易的签名
     * Summary: 数字商品服务-电子券卡密服务-充值重置
     */
    public ExecCardChargeresetResponse execCardChargeresetEx(ExecCardChargeresetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.card.chargereset.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCardChargeresetResponse());
    }

    /**
     * Description: 个人或机构账户注册
     * Summary: 数字商品服务-消费卡服务-个人/机构注册
     */
    public CreateConsumecardAccountResponse createConsumecardAccount(CreateConsumecardAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumecardAccountEx(request, headers, runtime);
    }

    /**
     * Description: 个人或机构账户注册
     * Summary: 数字商品服务-消费卡服务-个人/机构注册
     */
    public CreateConsumecardAccountResponse createConsumecardAccountEx(CreateConsumecardAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsumecardAccountResponse());
    }

    /**
     * Description: 个人/机构账户注销
     * Summary: 数字商品服务-消费卡服务-个人/机构注销
     */
    public OfflineConsumecardAccountResponse offlineConsumecardAccount(OfflineConsumecardAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineConsumecardAccountEx(request, headers, runtime);
    }

    /**
     * Description: 个人/机构账户注销
     * Summary: 数字商品服务-消费卡服务-个人/机构注销
     */
    public OfflineConsumecardAccountResponse offlineConsumecardAccountEx(OfflineConsumecardAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.account.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineConsumecardAccountResponse());
    }

    /**
     * Description: 企业消费卡余额回退
     * Summary: 数字商品服务-消费卡服务-企业消费卡回退
     */
    public ReclaimConsumecardWalletResponse reclaimConsumecardWallet(ReclaimConsumecardWalletRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reclaimConsumecardWalletEx(request, headers, runtime);
    }

    /**
     * Description: 企业消费卡余额回退
     * Summary: 数字商品服务-消费卡服务-企业消费卡回退
     */
    public ReclaimConsumecardWalletResponse reclaimConsumecardWalletEx(ReclaimConsumecardWalletRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.wallet.reclaim", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReclaimConsumecardWalletResponse());
    }

    /**
     * Description: 个人/机构账户禁用
     * Summary: 数字商品服务-消费卡服务-账户禁用
     */
    public FreezeConsumecardAccountResponse freezeConsumecardAccount(FreezeConsumecardAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeConsumecardAccountEx(request, headers, runtime);
    }

    /**
     * Description: 个人/机构账户禁用
     * Summary: 数字商品服务-消费卡服务-账户禁用
     */
    public FreezeConsumecardAccountResponse freezeConsumecardAccountEx(FreezeConsumecardAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.account.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeConsumecardAccountResponse());
    }

    /**
     * Description: 个人/机构账户解禁
     * Summary: 数字商品服务-消费卡服务-账户解禁
     */
    public UnfreezeConsumecardAccountResponse unfreezeConsumecardAccount(UnfreezeConsumecardAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeConsumecardAccountEx(request, headers, runtime);
    }

    /**
     * Description: 个人/机构账户解禁
     * Summary: 数字商品服务-消费卡服务-账户解禁
     */
    public UnfreezeConsumecardAccountResponse unfreezeConsumecardAccountEx(UnfreezeConsumecardAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.account.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeConsumecardAccountResponse());
    }

    /**
     * Description: 消费卡风控调整(特殊权限,暂不开放)
     * Summary: 数字商品服务-消费卡服务-消费卡风控调整
     */
    public UpdateConsumecardRiskcontrolResponse updateConsumecardRiskcontrol(UpdateConsumecardRiskcontrolRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConsumecardRiskcontrolEx(request, headers, runtime);
    }

    /**
     * Description: 消费卡风控调整(特殊权限,暂不开放)
     * Summary: 数字商品服务-消费卡服务-消费卡风控调整
     */
    public UpdateConsumecardRiskcontrolResponse updateConsumecardRiskcontrolEx(UpdateConsumecardRiskcontrolRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.riskcontrol.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateConsumecardRiskcontrolResponse());
    }

    /**
     * Description: 账单查询
     * Summary: 数字商品服务-消费卡服务-账单查询
     */
    public QueryConsumecardBillResponse queryConsumecardBill(QueryConsumecardBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardBillEx(request, headers, runtime);
    }

    /**
     * Description: 账单查询
     * Summary: 数字商品服务-消费卡服务-账单查询
     */
    public QueryConsumecardBillResponse queryConsumecardBillEx(QueryConsumecardBillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.bill.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardBillResponse());
    }

    /**
     * Description: 企业消费卡充值冻结
     * Summary: 数字商品服务-消费卡服务-消费卡充值冻结
     */
    public ChargeConsumecardWalletResponse chargeConsumecardWallet(ChargeConsumecardWalletRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.chargeConsumecardWalletEx(request, headers, runtime);
    }

    /**
     * Description: 企业消费卡充值冻结
     * Summary: 数字商品服务-消费卡服务-消费卡充值冻结
     */
    public ChargeConsumecardWalletResponse chargeConsumecardWalletEx(ChargeConsumecardWalletRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.wallet.charge", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ChargeConsumecardWalletResponse());
    }

    /**
     * Description: 更账户信息
     * Summary: 数字商品服务-消费卡服务-更新账户
     */
    public UpdateConsumecardAccountResponse updateConsumecardAccount(UpdateConsumecardAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConsumecardAccountEx(request, headers, runtime);
    }

    /**
     * Description: 更账户信息
     * Summary: 数字商品服务-消费卡服务-更新账户
     */
    public UpdateConsumecardAccountResponse updateConsumecardAccountEx(UpdateConsumecardAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.account.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateConsumecardAccountResponse());
    }

    /**
     * Description: 账单创建
     * Summary: 数字商品服务-消费卡服务-账单创建
     */
    public CreateConsumecardBillResponse createConsumecardBill(CreateConsumecardBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumecardBillEx(request, headers, runtime);
    }

    /**
     * Description: 账单创建
     * Summary: 数字商品服务-消费卡服务-账单创建
     */
    public CreateConsumecardBillResponse createConsumecardBillEx(CreateConsumecardBillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.bill.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsumecardBillResponse());
    }

    /**
     * Description: 账单创建确认成功或失败
     * Summary: 数字商品服务-消费卡服务-账单创建确认
     */
    public ConfirmConsumecardBillcreateResponse confirmConsumecardBillcreate(ConfirmConsumecardBillcreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmConsumecardBillcreateEx(request, headers, runtime);
    }

    /**
     * Description: 账单创建确认成功或失败
     * Summary: 数字商品服务-消费卡服务-账单创建确认
     */
    public ConfirmConsumecardBillcreateResponse confirmConsumecardBillcreateEx(ConfirmConsumecardBillcreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.billcreate.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmConsumecardBillcreateResponse());
    }

    /**
     * Description: 账单取消
     * Summary: 数字商品服务-消费卡服务-取消账单
     */
    public CancelConsumecardBillResponse cancelConsumecardBill(CancelConsumecardBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelConsumecardBillEx(request, headers, runtime);
    }

    /**
     * Description: 账单取消
     * Summary: 数字商品服务-消费卡服务-取消账单
     */
    public CancelConsumecardBillResponse cancelConsumecardBillEx(CancelConsumecardBillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.bill.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelConsumecardBillResponse());
    }

    /**
     * Description: 账单支付
     * Summary: 数字商品服务-消费卡服务-账单支付
     */
    public ExecConsumecardBillpayResponse execConsumecardBillpay(ExecConsumecardBillpayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConsumecardBillpayEx(request, headers, runtime);
    }

    /**
     * Description: 账单支付
     * Summary: 数字商品服务-消费卡服务-账单支付
     */
    public ExecConsumecardBillpayResponse execConsumecardBillpayEx(ExecConsumecardBillpayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.billpay.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConsumecardBillpayResponse());
    }

    /**
     * Description: 账单核销和交易核销，传入交易类型和订单Id
     * Summary: 数字商品服务-消费卡服务-账单和交易核销
     */
    public ExecConsumecardOrderwriteoffResponse execConsumecardOrderwriteoff(ExecConsumecardOrderwriteoffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConsumecardOrderwriteoffEx(request, headers, runtime);
    }

    /**
     * Description: 账单核销和交易核销，传入交易类型和订单Id
     * Summary: 数字商品服务-消费卡服务-账单和交易核销
     */
    public ExecConsumecardOrderwriteoffResponse execConsumecardOrderwriteoffEx(ExecConsumecardOrderwriteoffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.orderwriteoff.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConsumecardOrderwriteoffResponse());
    }

    /**
     * Description: 处理买家的退款申请，接受退款或者拒绝退款
     * Summary: 数字商品服务-消费卡服务-账单退款处理
     */
    public ConfirmConsumecardBillrefundResponse confirmConsumecardBillrefund(ConfirmConsumecardBillrefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmConsumecardBillrefundEx(request, headers, runtime);
    }

    /**
     * Description: 处理买家的退款申请，接受退款或者拒绝退款
     * Summary: 数字商品服务-消费卡服务-账单退款处理
     */
    public ConfirmConsumecardBillrefundResponse confirmConsumecardBillrefundEx(ConfirmConsumecardBillrefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.billrefund.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmConsumecardBillrefundResponse());
    }

    /**
     * Description: 查询账户信息
     * Summary: 数字商品服务-消费卡服务-查询账户信息
     */
    public QueryConsumecardAccountResponse queryConsumecardAccount(QueryConsumecardAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardAccountEx(request, headers, runtime);
    }

    /**
     * Description: 查询账户信息
     * Summary: 数字商品服务-消费卡服务-查询账户信息
     */
    public QueryConsumecardAccountResponse queryConsumecardAccountEx(QueryConsumecardAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardAccountResponse());
    }

    /**
     * Description: 开通钱包
     * Summary: 数字商品服务-消费卡服务-开通钱包
     */
    public OpenConsumecardWalletResponse openConsumecardWallet(OpenConsumecardWalletRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openConsumecardWalletEx(request, headers, runtime);
    }

    /**
     * Description: 开通钱包
     * Summary: 数字商品服务-消费卡服务-开通钱包
     */
    public OpenConsumecardWalletResponse openConsumecardWalletEx(OpenConsumecardWalletRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.wallet.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenConsumecardWalletResponse());
    }

    /**
     * Description: 查询钱包信息
     * Summary: 数字商品服务-消费卡服务-查询钱包
     */
    public QueryConsumecardWalletResponse queryConsumecardWallet(QueryConsumecardWalletRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardWalletEx(request, headers, runtime);
    }

    /**
     * Description: 查询钱包信息
     * Summary: 数字商品服务-消费卡服务-查询钱包
     */
    public QueryConsumecardWalletResponse queryConsumecardWalletEx(QueryConsumecardWalletRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.wallet.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardWalletResponse());
    }

    /**
     * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
     * Summary: 数字商品服务-消费卡服务-充值并兑换资产
     */
    public ExecConsumecardWalletchargetotokenResponse execConsumecardWalletchargetotoken(ExecConsumecardWalletchargetotokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConsumecardWalletchargetotokenEx(request, headers, runtime);
    }

    /**
     * Description: 充值并兑换token,资金托管员权限,运营平台无权限。
     * Summary: 数字商品服务-消费卡服务-充值并兑换资产
     */
    public ExecConsumecardWalletchargetotokenResponse execConsumecardWalletchargetotokenEx(ExecConsumecardWalletchargetotokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.walletchargetotoken.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConsumecardWalletchargetotokenResponse());
    }

    /**
     * Description: 湮灭自己发行的token并提现
     * Summary: 数字商品服务-消费卡服务-湮灭资产并提现
     */
    public ExecConsumecardWalletredeemtokenResponse execConsumecardWalletredeemtoken(ExecConsumecardWalletredeemtokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConsumecardWalletredeemtokenEx(request, headers, runtime);
    }

    /**
     * Description: 湮灭自己发行的token并提现
     * Summary: 数字商品服务-消费卡服务-湮灭资产并提现
     */
    public ExecConsumecardWalletredeemtokenResponse execConsumecardWalletredeemtokenEx(ExecConsumecardWalletredeemtokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.walletredeemtoken.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConsumecardWalletredeemtokenResponse());
    }

    /**
     * Description: 买家发起交易
     * Summary: 数字商品服务-消费卡服务-买家发起交易
     */
    public StartConsumecardPurchaseResponse startConsumecardPurchase(StartConsumecardPurchaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startConsumecardPurchaseEx(request, headers, runtime);
    }

    /**
     * Description: 买家发起交易
     * Summary: 数字商品服务-消费卡服务-买家发起交易
     */
    public StartConsumecardPurchaseResponse startConsumecardPurchaseEx(StartConsumecardPurchaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchase.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartConsumecardPurchaseResponse());
    }

    /**
     * Description: 取消交易，买家发起
     * Summary: 数字商品服务-消费卡服务-买家取消交易
     */
    public CancelConsumecardBuyerpurchaseResponse cancelConsumecardBuyerpurchase(CancelConsumecardBuyerpurchaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelConsumecardBuyerpurchaseEx(request, headers, runtime);
    }

    /**
     * Description: 取消交易，买家发起
     * Summary: 数字商品服务-消费卡服务-买家取消交易
     */
    public CancelConsumecardBuyerpurchaseResponse cancelConsumecardBuyerpurchaseEx(CancelConsumecardBuyerpurchaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.buyerpurchase.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelConsumecardBuyerpurchaseResponse());
    }

    /**
     * Description: 买家申请退款
     * Summary: 数字商品服务-消费卡服务-买家申请退款
     */
    public ApplyConsumecardPurchaserefundResponse applyConsumecardPurchaserefund(ApplyConsumecardPurchaserefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyConsumecardPurchaserefundEx(request, headers, runtime);
    }

    /**
     * Description: 买家申请退款
     * Summary: 数字商品服务-消费卡服务-买家申请退款
     */
    public ApplyConsumecardPurchaserefundResponse applyConsumecardPurchaserefundEx(ApplyConsumecardPurchaserefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchaserefund.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyConsumecardPurchaserefundResponse());
    }

    /**
     * Description: 买家申请售后
     * Summary: 数字商品服务-消费卡服务-买家申请售后
     */
    public ApplyConsumecardPurchasereplaceResponse applyConsumecardPurchasereplace(ApplyConsumecardPurchasereplaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyConsumecardPurchasereplaceEx(request, headers, runtime);
    }

    /**
     * Description: 买家申请售后
     * Summary: 数字商品服务-消费卡服务-买家申请售后
     */
    public ApplyConsumecardPurchasereplaceResponse applyConsumecardPurchasereplaceEx(ApplyConsumecardPurchasereplaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchasereplace.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyConsumecardPurchasereplaceResponse());
    }

    /**
     * Description: 买家确认收货
     * Summary: 数字商品服务-消费卡服务-买家确认收货
     */
    public ExecConsumecardPurchasereceiveResponse execConsumecardPurchasereceive(ExecConsumecardPurchasereceiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConsumecardPurchasereceiveEx(request, headers, runtime);
    }

    /**
     * Description: 买家确认收货
     * Summary: 数字商品服务-消费卡服务-买家确认收货
     */
    public ExecConsumecardPurchasereceiveResponse execConsumecardPurchasereceiveEx(ExecConsumecardPurchasereceiveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchasereceive.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConsumecardPurchasereceiveResponse());
    }

    /**
     * Description: 卖家拒绝交易
     * Summary: 数字商品服务-消费卡服务-卖家拒绝交易
     */
    public RefuseConsumecardPurchaseResponse refuseConsumecardPurchase(RefuseConsumecardPurchaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseConsumecardPurchaseEx(request, headers, runtime);
    }

    /**
     * Description: 卖家拒绝交易
     * Summary: 数字商品服务-消费卡服务-卖家拒绝交易
     */
    public RefuseConsumecardPurchaseResponse refuseConsumecardPurchaseEx(RefuseConsumecardPurchaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchase.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseConsumecardPurchaseResponse());
    }

    /**
     * Description: 卖家退款操作。可以同意退款和拒绝退款。
     * Summary: 数字商品服务-消费卡服务-卖家退款操作
     */
    public SetConsumecardPurchaserefundResponse setConsumecardPurchaserefund(SetConsumecardPurchaserefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumecardPurchaserefundEx(request, headers, runtime);
    }

    /**
     * Description: 卖家退款操作。可以同意退款和拒绝退款。
     * Summary: 数字商品服务-消费卡服务-卖家退款操作
     */
    public SetConsumecardPurchaserefundResponse setConsumecardPurchaserefundEx(SetConsumecardPurchaserefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchaserefund.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumecardPurchaserefundResponse());
    }

    /**
     * Description: 卖家换货操作。可以同意换货，拒绝换货
     * Summary: 数字商品服务-消费卡服务-卖家换货操作
     */
    public SetConsumecardPurchasereplaceResponse setConsumecardPurchasereplace(SetConsumecardPurchasereplaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumecardPurchasereplaceEx(request, headers, runtime);
    }

    /**
     * Description: 卖家换货操作。可以同意换货，拒绝换货
     * Summary: 数字商品服务-消费卡服务-卖家换货操作
     */
    public SetConsumecardPurchasereplaceResponse setConsumecardPurchasereplaceEx(SetConsumecardPurchasereplaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchasereplace.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumecardPurchasereplaceResponse());
    }

    /**
     * Description: 卖家接单
     * Summary: 数字商品服务-消费卡服务-卖家接单
     */
    public ConfirmConsumecardPurchaseResponse confirmConsumecardPurchase(ConfirmConsumecardPurchaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmConsumecardPurchaseEx(request, headers, runtime);
    }

    /**
     * Description: 卖家接单
     * Summary: 数字商品服务-消费卡服务-卖家接单
     */
    public ConfirmConsumecardPurchaseResponse confirmConsumecardPurchaseEx(ConfirmConsumecardPurchaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchase.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmConsumecardPurchaseResponse());
    }

    /**
     * Description: 卖家发货
     * Summary: 数字商品服务-消费卡服务-卖家发货
     */
    public SendConsumecardPurchaseResponse sendConsumecardPurchase(SendConsumecardPurchaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendConsumecardPurchaseEx(request, headers, runtime);
    }

    /**
     * Description: 卖家发货
     * Summary: 数字商品服务-消费卡服务-卖家发货
     */
    public SendConsumecardPurchaseResponse sendConsumecardPurchaseEx(SendConsumecardPurchaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchase.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendConsumecardPurchaseResponse());
    }

    /**
     * Description: 卖家售后补发货
     * Summary: 数字商品服务-消费卡服务-卖家售后补发货
     */
    public ReplaceConsumecardPurchaseResponse replaceConsumecardPurchase(ReplaceConsumecardPurchaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceConsumecardPurchaseEx(request, headers, runtime);
    }

    /**
     * Description: 卖家售后补发货
     * Summary: 数字商品服务-消费卡服务-卖家售后补发货
     */
    public ReplaceConsumecardPurchaseResponse replaceConsumecardPurchaseEx(ReplaceConsumecardPurchaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchase.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceConsumecardPurchaseResponse());
    }

    /**
     * Description: 发布商品
     * Summary: 数字商品服务-消费卡服务-发布商品
     */
    public CreateConsumecardGoodsResponse createConsumecardGoods(CreateConsumecardGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumecardGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 发布商品
     * Summary: 数字商品服务-消费卡服务-发布商品
     */
    public CreateConsumecardGoodsResponse createConsumecardGoodsEx(CreateConsumecardGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goods.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsumecardGoodsResponse());
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-消费卡服务-更新商品信息
     */
    public UpdateConsumecardGoodsResponse updateConsumecardGoods(UpdateConsumecardGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConsumecardGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-消费卡服务-更新商品信息
     */
    public UpdateConsumecardGoodsResponse updateConsumecardGoodsEx(UpdateConsumecardGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goods.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateConsumecardGoodsResponse());
    }

    /**
     * Description: 商品开放购买权限给指定账户
     * Summary: 数字商品服务-消费卡服务-开放购买权限
     */
    public OpenConsumecardGoodstocustomResponse openConsumecardGoodstocustom(OpenConsumecardGoodstocustomRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openConsumecardGoodstocustomEx(request, headers, runtime);
    }

    /**
     * Description: 商品开放购买权限给指定账户
     * Summary: 数字商品服务-消费卡服务-开放购买权限
     */
    public OpenConsumecardGoodstocustomResponse openConsumecardGoodstocustomEx(OpenConsumecardGoodstocustomRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goodstocustom.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenConsumecardGoodstocustomResponse());
    }

    /**
     * Description: 新增商品类别
     * Summary: 数字商品服务-消费卡服务-新增商品类别
     */
    public CreateConsumecardGoodscategoryResponse createConsumecardGoodscategory(CreateConsumecardGoodscategoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumecardGoodscategoryEx(request, headers, runtime);
    }

    /**
     * Description: 新增商品类别
     * Summary: 数字商品服务-消费卡服务-新增商品类别
     */
    public CreateConsumecardGoodscategoryResponse createConsumecardGoodscategoryEx(CreateConsumecardGoodscategoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goodscategory.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsumecardGoodscategoryResponse());
    }

    /**
     * Description: 设置商品一客一价
     * Summary: 数字商品服务-消费卡服务-设置一客一价
     */
    public SetConsumecardGoodscustompriceResponse setConsumecardGoodscustomprice(SetConsumecardGoodscustompriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumecardGoodscustompriceEx(request, headers, runtime);
    }

    /**
     * Description: 设置商品一客一价
     * Summary: 数字商品服务-消费卡服务-设置一客一价
     */
    public SetConsumecardGoodscustompriceResponse setConsumecardGoodscustompriceEx(SetConsumecardGoodscustompriceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goodscustomprice.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumecardGoodscustompriceResponse());
    }

    /**
     * Description: 上传图片获取URL
     * Summary: 数字商品服务-消费卡服务-上传图片
     */
    public UploadConsumecardGoodsimageResponse uploadConsumecardGoodsimage(UploadConsumecardGoodsimageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadConsumecardGoodsimageEx(request, headers, runtime);
    }

    /**
     * Description: 上传图片获取URL
     * Summary: 数字商品服务-消费卡服务-上传图片
     */
    public UploadConsumecardGoodsimageResponse uploadConsumecardGoodsimageEx(UploadConsumecardGoodsimageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goodsimage.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadConsumecardGoodsimageResponse());
    }

    /**
     * Description: 机构订单提现试算
     * Summary: 数字商品服务-消费卡服务-企业提现试算
     */
    public ExecConsumecardOrdertrywithdrawResponse execConsumecardOrdertrywithdraw(ExecConsumecardOrdertrywithdrawRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConsumecardOrdertrywithdrawEx(request, headers, runtime);
    }

    /**
     * Description: 机构订单提现试算
     * Summary: 数字商品服务-消费卡服务-企业提现试算
     */
    public ExecConsumecardOrdertrywithdrawResponse execConsumecardOrdertrywithdrawEx(ExecConsumecardOrdertrywithdrawRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.ordertrywithdraw.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConsumecardOrdertrywithdrawResponse());
    }

    /**
     * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
     * Summary: 数字商品服务-消费卡服务-根据区块提现
     */
    public ExecConsumecardOrderwithdrawbyblocknumResponse execConsumecardOrderwithdrawbyblocknum(ExecConsumecardOrderwithdrawbyblocknumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConsumecardOrderwithdrawbyblocknumEx(request, headers, runtime);
    }

    /**
     * Description: 机构订单提现(区块区间模式)，传入要提现的区块区间，提现该区间的交易
     * Summary: 数字商品服务-消费卡服务-根据区块提现
     */
    public ExecConsumecardOrderwithdrawbyblocknumResponse execConsumecardOrderwithdrawbyblocknumEx(ExecConsumecardOrderwithdrawbyblocknumRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.orderwithdrawbyblocknum.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConsumecardOrderwithdrawbyblocknumResponse());
    }

    /**
     * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
     * Summary: 数字商品服务-消费卡服务-根据订单表提现
     */
    public ExecConsumecardOrderwithdrawbyidsResponse execConsumecardOrderwithdrawbyids(ExecConsumecardOrderwithdrawbyidsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execConsumecardOrderwithdrawbyidsEx(request, headers, runtime);
    }

    /**
     * Description: 机构订单提现(订单列表模式)，传入要提现的订单ID列表
     * Summary: 数字商品服务-消费卡服务-根据订单表提现
     */
    public ExecConsumecardOrderwithdrawbyidsResponse execConsumecardOrderwithdrawbyidsEx(ExecConsumecardOrderwithdrawbyidsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.orderwithdrawbyids.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecConsumecardOrderwithdrawbyidsResponse());
    }

    /**
     * Description: 根据提现单号获取提现结果
     * Summary: 数字商品服务-消费卡服务-获取提现结果
     */
    public GetConsumecardOrderwithdrawresultResponse getConsumecardOrderwithdrawresult(GetConsumecardOrderwithdrawresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getConsumecardOrderwithdrawresultEx(request, headers, runtime);
    }

    /**
     * Description: 根据提现单号获取提现结果
     * Summary: 数字商品服务-消费卡服务-获取提现结果
     */
    public GetConsumecardOrderwithdrawresultResponse getConsumecardOrderwithdrawresultEx(GetConsumecardOrderwithdrawresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.orderwithdrawresult.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetConsumecardOrderwithdrawresultResponse());
    }

    /**
     * Description: 注销前需要回退资金,查询账户可回退金额
     * Summary: 数字商品服务-消费卡服务-查询可回退金额
     */
    public QueryConsumecardWalletredeemableResponse queryConsumecardWalletredeemable(QueryConsumecardWalletredeemableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardWalletredeemableEx(request, headers, runtime);
    }

    /**
     * Description: 注销前需要回退资金,查询账户可回退金额
     * Summary: 数字商品服务-消费卡服务-查询可回退金额
     */
    public QueryConsumecardWalletredeemableResponse queryConsumecardWalletredeemableEx(QueryConsumecardWalletredeemableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.walletredeemable.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardWalletredeemableResponse());
    }

    /**
     * Description: 发布商品是异步流程，根据requestId查询商品发布结果
     * Summary: 数字商品服务-消费卡服务-查询商品发布
     */
    public QueryConsumecardGoodscreateresultResponse queryConsumecardGoodscreateresult(QueryConsumecardGoodscreateresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardGoodscreateresultEx(request, headers, runtime);
    }

    /**
     * Description: 发布商品是异步流程，根据requestId查询商品发布结果
     * Summary: 数字商品服务-消费卡服务-查询商品发布
     */
    public QueryConsumecardGoodscreateresultResponse queryConsumecardGoodscreateresultEx(QueryConsumecardGoodscreateresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goodscreateresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardGoodscreateresultResponse());
    }

    /**
     * Description: 查询消费卡商品信息
     * Summary: 数字商品服务-消费卡服务-查询商品信息
     */
    public QueryConsumecardGoodsResponse queryConsumecardGoods(QueryConsumecardGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 查询消费卡商品信息
     * Summary: 数字商品服务-消费卡服务-查询商品信息
     */
    public QueryConsumecardGoodsResponse queryConsumecardGoodsEx(QueryConsumecardGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goods.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardGoodsResponse());
    }

    /**
     * Description: 账单退款申请
     * Summary: 数字商品服务-消费卡服务-账单退款申请
     */
    public ApplyConsumecardBillrefundResponse applyConsumecardBillrefund(ApplyConsumecardBillrefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyConsumecardBillrefundEx(request, headers, runtime);
    }

    /**
     * Description: 账单退款申请
     * Summary: 数字商品服务-消费卡服务-账单退款申请
     */
    public ApplyConsumecardBillrefundResponse applyConsumecardBillrefundEx(ApplyConsumecardBillrefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.billrefund.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyConsumecardBillrefundResponse());
    }

    /**
     * Description: 查询交易信息
     * Summary: 数字商品服务-消费卡服务-交易查询
     */
    public QueryConsumecardPurchaseResponse queryConsumecardPurchase(QueryConsumecardPurchaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardPurchaseEx(request, headers, runtime);
    }

    /**
     * Description: 查询交易信息
     * Summary: 数字商品服务-消费卡服务-交易查询
     */
    public QueryConsumecardPurchaseResponse queryConsumecardPurchaseEx(QueryConsumecardPurchaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.purchase.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardPurchaseResponse());
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-消费卡服务-获取区块
     */
    public QueryConsumecardBlockResponse queryConsumecardBlock(QueryConsumecardBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardBlockEx(request, headers, runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-消费卡服务-获取区块
     */
    public QueryConsumecardBlockResponse queryConsumecardBlockEx(QueryConsumecardBlockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.block.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardBlockResponse());
    }

    /**
     * Description: 查询最新区块高度
     * Summary: 数字商品服务-消费卡服务-查最新区块高度
     */
    public QueryConsumecardLastblocknumberResponse queryConsumecardLastblocknumber(QueryConsumecardLastblocknumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardLastblocknumberEx(request, headers, runtime);
    }

    /**
     * Description: 查询最新区块高度
     * Summary: 数字商品服务-消费卡服务-查最新区块高度
     */
    public QueryConsumecardLastblocknumberResponse queryConsumecardLastblocknumberEx(QueryConsumecardLastblocknumberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardLastblocknumberResponse());
    }

    /**
     * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
     * Summary: 数字商品服务-消费卡服务-更新结果查询
     */
    public QueryConsumecardGoodsupdateresultResponse queryConsumecardGoodsupdateresult(QueryConsumecardGoodsupdateresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardGoodsupdateresultEx(request, headers, runtime);
    }

    /**
     * Description: 更新商品信息是异步流程，根据requestId查询商品更新结果
     * Summary: 数字商品服务-消费卡服务-更新结果查询
     */
    public QueryConsumecardGoodsupdateresultResponse queryConsumecardGoodsupdateresultEx(QueryConsumecardGoodsupdateresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goodsupdateresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardGoodsupdateresultResponse());
    }

    /**
     * Description: 卖家取消交易
     * Summary: 数字商品服务--消费卡服务-卖家取消交易
     */
    public CancelConsumecardSellerpurchaseResponse cancelConsumecardSellerpurchase(CancelConsumecardSellerpurchaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelConsumecardSellerpurchaseEx(request, headers, runtime);
    }

    /**
     * Description: 卖家取消交易
     * Summary: 数字商品服务--消费卡服务-卖家取消交易
     */
    public CancelConsumecardSellerpurchaseResponse cancelConsumecardSellerpurchaseEx(CancelConsumecardSellerpurchaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.sellerpurchase.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelConsumecardSellerpurchaseResponse());
    }

    /**
     * Description: 配置商品和账单的手续费信息
     * Summary: 数字商品服务-消费卡服务-配置手续费
     */
    public SetConsumecardCommissionResponse setConsumecardCommission(SetConsumecardCommissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumecardCommissionEx(request, headers, runtime);
    }

    /**
     * Description: 配置商品和账单的手续费信息
     * Summary: 数字商品服务-消费卡服务-配置手续费
     */
    public SetConsumecardCommissionResponse setConsumecardCommissionEx(SetConsumecardCommissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.commission.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumecardCommissionResponse());
    }

    /**
     * Description: 删除手续费配置
     * Summary: 数字商品服务-消费卡服务-删除手续费配置
     */
    public RemoveConsumecardCommissionResponse removeConsumecardCommission(RemoveConsumecardCommissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConsumecardCommissionEx(request, headers, runtime);
    }

    /**
     * Description: 删除手续费配置
     * Summary: 数字商品服务-消费卡服务-删除手续费配置
     */
    public RemoveConsumecardCommissionResponse removeConsumecardCommissionEx(RemoveConsumecardCommissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.commission.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveConsumecardCommissionResponse());
    }

    /**
     * Description: 查询手续费信息
     * Summary: 数字商品服务-消费卡服务-查询手续费信息
     */
    public QueryConsumecardCommissionResponse queryConsumecardCommission(QueryConsumecardCommissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardCommissionEx(request, headers, runtime);
    }

    /**
     * Description: 查询手续费信息
     * Summary: 数字商品服务-消费卡服务-查询手续费信息
     */
    public QueryConsumecardCommissionResponse queryConsumecardCommissionEx(QueryConsumecardCommissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.commission.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardCommissionResponse());
    }

    /**
     * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
     * Summary: 数字商品服务-消费卡服务-设置手续费管理
     */
    public SetConsumecardCommissionmanagerResponse setConsumecardCommissionmanager(SetConsumecardCommissionmanagerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumecardCommissionmanagerEx(request, headers, runtime);
    }

    /**
     * Description: 设置手续费管理员，手续费的增删改查需要由手续费管理员操作。平台管理员可以设置手续费管理员。
     * Summary: 数字商品服务-消费卡服务-设置手续费管理
     */
    public SetConsumecardCommissionmanagerResponse setConsumecardCommissionmanagerEx(SetConsumecardCommissionmanagerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.commissionmanager.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumecardCommissionmanagerResponse());
    }

    /**
     * Description: 设置商品状态，可以设置为上线或下线
     * Summary: 数字商品服务-消费卡服务-设置商品状态
     */
    public SetConsumecardGoodsstatusResponse setConsumecardGoodsstatus(SetConsumecardGoodsstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumecardGoodsstatusEx(request, headers, runtime);
    }

    /**
     * Description: 设置商品状态，可以设置为上线或下线
     * Summary: 数字商品服务-消费卡服务-设置商品状态
     */
    public SetConsumecardGoodsstatusResponse setConsumecardGoodsstatusEx(SetConsumecardGoodsstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goodsstatus.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumecardGoodsstatusResponse());
    }

    /**
     * Description: 个人用户来账付款协议签约
     * Summary: 数字商品-消费卡服务-个人用户签约
     */
    public CreateConsumecardReceiptcontractResponse createConsumecardReceiptcontract(CreateConsumecardReceiptcontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumecardReceiptcontractEx(request, headers, runtime);
    }

    /**
     * Description: 个人用户来账付款协议签约
     * Summary: 数字商品-消费卡服务-个人用户签约
     */
    public CreateConsumecardReceiptcontractResponse createConsumecardReceiptcontractEx(CreateConsumecardReceiptcontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.receiptcontract.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsumecardReceiptcontractResponse());
    }

    /**
     * Description: 来账协议解约接口
     * Summary: 数字商品-消费卡服务-个人协议解约
     */
    public RemoveConsumecardReceiptcontractResponse removeConsumecardReceiptcontract(RemoveConsumecardReceiptcontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConsumecardReceiptcontractEx(request, headers, runtime);
    }

    /**
     * Description: 来账协议解约接口
     * Summary: 数字商品-消费卡服务-个人协议解约
     */
    public RemoveConsumecardReceiptcontractResponse removeConsumecardReceiptcontractEx(RemoveConsumecardReceiptcontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.receiptcontract.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveConsumecardReceiptcontractResponse());
    }

    /**
     * Description: 来账协议查询接口
     * Summary: 数字商品-消费卡服务-个人协议查询
     */
    public QueryConsumecardReceiptcontractResponse queryConsumecardReceiptcontract(QueryConsumecardReceiptcontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardReceiptcontractEx(request, headers, runtime);
    }

    /**
     * Description: 来账协议查询接口
     * Summary: 数字商品-消费卡服务-个人协议查询
     */
    public QueryConsumecardReceiptcontractResponse queryConsumecardReceiptcontractEx(QueryConsumecardReceiptcontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.receiptcontract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardReceiptcontractResponse());
    }

    /**
     * Description: 收单协议签约
     * Summary: 数字商品-消费卡服务-商家用户签约
     */
    public CreateConsumecardBillingcontractResponse createConsumecardBillingcontract(CreateConsumecardBillingcontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumecardBillingcontractEx(request, headers, runtime);
    }

    /**
     * Description: 收单协议签约
     * Summary: 数字商品-消费卡服务-商家用户签约
     */
    public CreateConsumecardBillingcontractResponse createConsumecardBillingcontractEx(CreateConsumecardBillingcontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.billingcontract.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsumecardBillingcontractResponse());
    }

    /**
     * Description: 收单协议解约
     * Summary: 数字商品-消费卡服务-商家协议解约
     */
    public RemoveConsumecardBillingcontractResponse removeConsumecardBillingcontract(RemoveConsumecardBillingcontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConsumecardBillingcontractEx(request, headers, runtime);
    }

    /**
     * Description: 收单协议解约
     * Summary: 数字商品-消费卡服务-商家协议解约
     */
    public RemoveConsumecardBillingcontractResponse removeConsumecardBillingcontractEx(RemoveConsumecardBillingcontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.billingcontract.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveConsumecardBillingcontractResponse());
    }

    /**
     * Description: 收单协议签约查询
     * Summary: 数字商品-消费卡服务-商家协议查询
     */
    public QueryConsumecardBillingcontractResponse queryConsumecardBillingcontract(QueryConsumecardBillingcontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardBillingcontractEx(request, headers, runtime);
    }

    /**
     * Description: 收单协议签约查询
     * Summary: 数字商品-消费卡服务-商家协议查询
     */
    public QueryConsumecardBillingcontractResponse queryConsumecardBillingcontractEx(QueryConsumecardBillingcontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.billingcontract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardBillingcontractResponse());
    }

    /**
     * Description: 增加一级分账方
     * Summary: 数字商品服务-消费卡服务-增加一级分账方
     */
    public AddConsumecardCommissionpartyResponse addConsumecardCommissionparty(AddConsumecardCommissionpartyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addConsumecardCommissionpartyEx(request, headers, runtime);
    }

    /**
     * Description: 增加一级分账方
     * Summary: 数字商品服务-消费卡服务-增加一级分账方
     */
    public AddConsumecardCommissionpartyResponse addConsumecardCommissionpartyEx(AddConsumecardCommissionpartyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.commissionparty.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddConsumecardCommissionpartyResponse());
    }

    /**
     * Description: 删除一级分账方
     * Summary: 数字商品服务-消费卡服务-删除一级分账方
     */
    public RemoveConsumecardCommissionpartyResponse removeConsumecardCommissionparty(RemoveConsumecardCommissionpartyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConsumecardCommissionpartyEx(request, headers, runtime);
    }

    /**
     * Description: 删除一级分账方
     * Summary: 数字商品服务-消费卡服务-删除一级分账方
     */
    public RemoveConsumecardCommissionpartyResponse removeConsumecardCommissionpartyEx(RemoveConsumecardCommissionpartyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.commissionparty.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveConsumecardCommissionpartyResponse());
    }

    /**
     * Description: 增加手续费周期
     * Summary: 数字商品服务-消费卡服务-增加手续费周期
     */
    public AddConsumecardCommissionperiodResponse addConsumecardCommissionperiod(AddConsumecardCommissionperiodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addConsumecardCommissionperiodEx(request, headers, runtime);
    }

    /**
     * Description: 增加手续费周期
     * Summary: 数字商品服务-消费卡服务-增加手续费周期
     */
    public AddConsumecardCommissionperiodResponse addConsumecardCommissionperiodEx(AddConsumecardCommissionperiodRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.commissionperiod.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddConsumecardCommissionperiodResponse());
    }

    /**
     * Description: 删除手续费周期
     * Summary: 数字商品服务-消费卡服务-删除手续费周期
     */
    public RemoveConsumecardCommissionperiodResponse removeConsumecardCommissionperiod(RemoveConsumecardCommissionperiodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConsumecardCommissionperiodEx(request, headers, runtime);
    }

    /**
     * Description: 删除手续费周期
     * Summary: 数字商品服务-消费卡服务-删除手续费周期
     */
    public RemoveConsumecardCommissionperiodResponse removeConsumecardCommissionperiodEx(RemoveConsumecardCommissionperiodRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.commissionperiod.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveConsumecardCommissionperiodResponse());
    }

    /**
     * Description: 查询统计信息
     * Summary: 数字商品服务-消费卡服务-查询统计信息
     */
    public QueryConsumecardCounterResponse queryConsumecardCounter(QueryConsumecardCounterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardCounterEx(request, headers, runtime);
    }

    /**
     * Description: 查询统计信息
     * Summary: 数字商品服务-消费卡服务-查询统计信息
     */
    public QueryConsumecardCounterResponse queryConsumecardCounterEx(QueryConsumecardCounterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.counter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardCounterResponse());
    }

    /**
     * Description: 管理接口：配置场景码权限信息
     * Summary: 数字商品服务-消费卡服务-场景码配置
     */
    public SetConsumecardProductcodeResponse setConsumecardProductcode(SetConsumecardProductcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumecardProductcodeEx(request, headers, runtime);
    }

    /**
     * Description: 管理接口：配置场景码权限信息
     * Summary: 数字商品服务-消费卡服务-场景码配置
     */
    public SetConsumecardProductcodeResponse setConsumecardProductcodeEx(SetConsumecardProductcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.productcode.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumecardProductcodeResponse());
    }

    /**
     * Description: 查询已配置的场景码信息
     * Summary: 数字商品服务-消费卡服务-查询场景码配置
     */
    public QueryConsumecardProductcodeResponse queryConsumecardProductcode(QueryConsumecardProductcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardProductcodeEx(request, headers, runtime);
    }

    /**
     * Description: 查询已配置的场景码信息
     * Summary: 数字商品服务-消费卡服务-查询场景码配置
     */
    public QueryConsumecardProductcodeResponse queryConsumecardProductcodeEx(QueryConsumecardProductcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.productcode.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardProductcodeResponse());
    }

    /**
     * Description: 删除场景码配置
     * Summary: 数字商品服务-消费卡服务-删除场景码配置
     */
    public RemoveConsumecardProductcodeResponse removeConsumecardProductcode(RemoveConsumecardProductcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeConsumecardProductcodeEx(request, headers, runtime);
    }

    /**
     * Description: 删除场景码配置
     * Summary: 数字商品服务-消费卡服务-删除场景码配置
     */
    public RemoveConsumecardProductcodeResponse removeConsumecardProductcodeEx(RemoveConsumecardProductcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.productcode.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveConsumecardProductcodeResponse());
    }

    /**
     * Description: 根据图片不可访问URl 获取可以访问的临时URL
     * Summary: 数字商品服务-消费卡服务-查询图片URL
     */
    public QueryConsumecardGoodsimageResponse queryConsumecardGoodsimage(QueryConsumecardGoodsimageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConsumecardGoodsimageEx(request, headers, runtime);
    }

    /**
     * Description: 根据图片不可访问URl 获取可以访问的临时URL
     * Summary: 数字商品服务-消费卡服务-查询图片URL
     */
    public QueryConsumecardGoodsimageResponse queryConsumecardGoodsimageEx(QueryConsumecardGoodsimageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.goodsimage.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConsumecardGoodsimageResponse());
    }

    /**
     * Description: 文件API，上传文件
     * Summary: 数字商品服务-文件服务-上传文件
     */
    public UploadConsumecardFileResponse uploadConsumecardFile(UploadConsumecardFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadConsumecardFileEx(request, headers, runtime);
    }

    /**
     * Description: 文件API，上传文件
     * Summary: 数字商品服务-文件服务-上传文件
     */
    public UploadConsumecardFileResponse uploadConsumecardFileEx(UploadConsumecardFileRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "baas.antdao.consumecard.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadConsumecardFileResponse uploadConsumecardFileResponse = UploadConsumecardFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadConsumecardFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.consumecard.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadConsumecardFileResponse());
    }

    /**
     * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
     * Summary: 数字商品服务-电子券服务-查询电子券
     */
    public QueryCouponResponse queryCoupon(QueryCouponRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCouponEx(request, headers, runtime);
    }

    /**
     * Description: 查询电子券详细信息。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
     * Summary: 数字商品服务-电子券服务-查询电子券
     */
    public QueryCouponResponse queryCouponEx(QueryCouponRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCouponResponse());
    }

    /**
     * Description: 创建单个电子券接口
     * Summary: 数字商品服务-电子券服务-创建单个电子券
     */
    public CreateCouponResponse createCoupon(CreateCouponRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCouponEx(request, headers, runtime);
    }

    /**
     * Description: 创建单个电子券接口
     * Summary: 数字商品服务-电子券服务-创建单个电子券
     */
    public CreateCouponResponse createCouponEx(CreateCouponRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCouponResponse());
    }

    /**
     * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
     * Summary: 数字商品服务-电子券服务-电子券风控禁用
     */
    public ExecCouponForbiddenResponse execCouponForbidden(ExecCouponForbiddenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponForbiddenEx(request, headers, runtime);
    }

    /**
     * Description: 将电子券更新为禁用状态，不能再进行其他状态更新
     * Summary: 数字商品服务-电子券服务-电子券风控禁用
     */
    public ExecCouponForbiddenResponse execCouponForbiddenEx(ExecCouponForbiddenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.forbidden.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponForbiddenResponse());
    }

    /**
     * Description: 将电子券更新为可用状态
     * Summary: 数字商品服务-电子券服务-电子券风控启用
     */
    public ExecCouponEnableResponse execCouponEnable(ExecCouponEnableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponEnableEx(request, headers, runtime);
    }

    /**
     * Description: 将电子券更新为可用状态
     * Summary: 数字商品服务-电子券服务-电子券风控启用
     */
    public ExecCouponEnableResponse execCouponEnableEx(ExecCouponEnableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.enable.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponEnableResponse());
    }

    /**
     * Description: 将电子券状态更新为过期
     * Summary: 数字商品服务-电子券服务-电子券过期
     */
    public ExecCouponExpireResponse execCouponExpire(ExecCouponExpireRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponExpireEx(request, headers, runtime);
    }

    /**
     * Description: 将电子券状态更新为过期
     * Summary: 数字商品服务-电子券服务-电子券过期
     */
    public ExecCouponExpireResponse execCouponExpireEx(ExecCouponExpireRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.expire.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponExpireResponse());
    }

    /**
     * Description: 将电子券状态更新为核销
     * Summary: 数字商品服务-电子券服务-电子券核销
     */
    public ExecCouponWriteoffResponse execCouponWriteoff(ExecCouponWriteoffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponWriteoffEx(request, headers, runtime);
    }

    /**
     * Description: 将电子券状态更新为核销
     * Summary: 数字商品服务-电子券服务-电子券核销
     */
    public ExecCouponWriteoffResponse execCouponWriteoffEx(ExecCouponWriteoffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.writeoff.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponWriteoffResponse());
    }

    /**
     * Description: 更新电子券的激活码状态为已超时
     * Summary: 数字商品服务-电子券服务-券激活码超时
     */
    public ExecCouponTimeoutResponse execCouponTimeout(ExecCouponTimeoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponTimeoutEx(request, headers, runtime);
    }

    /**
     * Description: 更新电子券的激活码状态为已超时
     * Summary: 数字商品服务-电子券服务-券激活码超时
     */
    public ExecCouponTimeoutResponse execCouponTimeoutEx(ExecCouponTimeoutRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.timeout.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponTimeoutResponse());
    }

    /**
     * Description: 商户上传激活码，激活电子券
     * Summary: 数字商品服务-电子券服务-激活电子券
     */
    public ExecCouponActivateResponse execCouponActivate(ExecCouponActivateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponActivateEx(request, headers, runtime);
    }

    /**
     * Description: 商户上传激活码，激活电子券
     * Summary: 数字商品服务-电子券服务-激活电子券
     */
    public ExecCouponActivateResponse execCouponActivateEx(ExecCouponActivateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.activate.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponActivateResponse());
    }

    /**
     * Description: 将电子券转让给其他用户
     * Summary: 数字商品服务-电子券服务-电子券转让
     */
    public ExecCouponTransferResponse execCouponTransfer(ExecCouponTransferRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponTransferEx(request, headers, runtime);
    }

    /**
     * Description: 将电子券转让给其他用户
     * Summary: 数字商品服务-电子券服务-电子券转让
     */
    public ExecCouponTransferResponse execCouponTransferEx(ExecCouponTransferRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.transfer.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponTransferResponse());
    }

    /**
     * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
     * Summary: 数字商品服务-电子券服务-电子券记名
     */
    public ExecCouponSignResponse execCouponSign(ExecCouponSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponSignEx(request, headers, runtime);
    }

    /**
     * Description: 记名电子券创建时没有记录用户信息，可以调用本接口将用户信息更新到电子券上。记名电子券若没有用户信息，则无法进行绑定激活。
     * Summary: 数字商品服务-电子券服务-电子券记名
     */
    public ExecCouponSignResponse execCouponSignEx(ExecCouponSignRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.sign.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponSignResponse());
    }

    /**
     * Description: 绑定电子券，更新为“绑定”状态
     * Summary: 数字商品服务-电子券服务-绑定电子券
     */
    public ExecCouponBindResponse execCouponBind(ExecCouponBindRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execCouponBindEx(request, headers, runtime);
    }

    /**
     * Description: 绑定电子券，更新为“绑定”状态
     * Summary: 数字商品服务-电子券服务-绑定电子券
     */
    public ExecCouponBindResponse execCouponBindEx(ExecCouponBindRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.bind.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecCouponBindResponse());
    }

    /**
     * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
     * Summary: 数字商品服务-电子券服务-电子券批量创建
     */
    public BatchcreateCouponResponse batchcreateCoupon(BatchcreateCouponRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateCouponEx(request, headers, runtime);
    }

    /**
     * Description: 传入数量一次性创建多张电子券，支持不记名电子券或同名电子券创建。每次最多创建100张电子券
     * Summary: 数字商品服务-电子券服务-电子券批量创建
     */
    public BatchcreateCouponResponse batchcreateCouponEx(BatchcreateCouponRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateCouponResponse());
    }

    /**
     * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
     * Summary: 数字商品服务-电子券服务-电子券列表创建
     */
    public CreateCouponListResponse createCouponList(CreateCouponListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCouponListEx(request, headers, runtime);
    }

    /**
     * Description: 电子券列表创建 支持传入不同的电子券信息列表，列表中每个电子券信息可以不相同
     * Summary: 数字商品服务-电子券服务-电子券列表创建
     */
    public CreateCouponListResponse createCouponListEx(CreateCouponListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.list.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCouponListResponse());
    }

    /**
     * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
     * Summary: 数字商品服务-电子券服务-创建电子券批次
     */
    public CreateCouponCollectionResponse createCouponCollection(CreateCouponCollectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCouponCollectionEx(request, headers, runtime);
    }

    /**
     * Description: 创建电子券批次，定义该批次的信息和是否记名，创建批次的商户自动成为批次管理员。
     * Summary: 数字商品服务-电子券服务-创建电子券批次
     */
    public CreateCouponCollectionResponse createCouponCollectionEx(CreateCouponCollectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.collection.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCouponCollectionResponse());
    }

    /**
     * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
     * Summary: 数字商品服务-电子券服务-电子券批次查询
     */
    public QueryCouponCollectionResponse queryCouponCollection(QueryCouponCollectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCouponCollectionEx(request, headers, runtime);
    }

    /**
     * Description: 输入批次ID，查询批次详情。只有批次管理员，过期观察员可以查看，其他商户没有查看权限。
     * Summary: 数字商品服务-电子券服务-电子券批次查询
     */
    public QueryCouponCollectionResponse queryCouponCollectionEx(QueryCouponCollectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.coupon.collection.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCouponCollectionResponse());
    }

    /**
     * Description: 查询调用商户下的用户信息
     * Summary: 数字商品服务-商户管理-查询用户信息
     */
    public QueryMerchantUserResponse queryMerchantUser(QueryMerchantUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantUserEx(request, headers, runtime);
    }

    /**
     * Description: 查询调用商户下的用户信息
     * Summary: 数字商品服务-商户管理-查询用户信息
     */
    public QueryMerchantUserResponse queryMerchantUserEx(QueryMerchantUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantUserResponse());
    }

    /**
     * Description: 创建商户管理下的用户
     * Summary: 数字商品服务-商户管理-商户创建用户
     */
    public CreateMerchantUserResponse createMerchantUser(CreateMerchantUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMerchantUserEx(request, headers, runtime);
    }

    /**
     * Description: 创建商户管理下的用户
     * Summary: 数字商品服务-商户管理-商户创建用户
     */
    public CreateMerchantUserResponse createMerchantUserEx(CreateMerchantUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMerchantUserResponse());
    }

    /**
     * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
     * Summary: 数字商品服务-商户管理-查询商户信息
     */
    public QueryMerchantResponse queryMerchant(QueryMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 查询管理员创建的商户信息（可查询自身的商户信息）
     * Summary: 数字商品服务-商户管理-查询商户信息
     */
    public QueryMerchantResponse queryMerchantEx(QueryMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantResponse());
    }

    /**
     * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
     * Summary: 数字商品服务-OSS服务-上传图片
     */
    public UploadImageResponse uploadImage(UploadImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadImageEx(request, headers, runtime);
    }

    /**
     * Description: 上传图片到OSS，以备风控检查。仅权益发行方可使用，采购方不可使用。上传的图片单张不超过1M。
     * Summary: 数字商品服务-OSS服务-上传图片
     */
    public UploadImageResponse uploadImageEx(UploadImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.image.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadImageResponse());
    }

    /**
     * Description: 获取kms中对应用户的公钥
     * Summary: 数字商品服务-密钥管理-获取用户公钥
     */
    public GetPkiPublickeyResponse getPkiPublickey(GetPkiPublickeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPkiPublickeyEx(request, headers, runtime);
    }

    /**
     * Description: 获取kms中对应用户的公钥
     * Summary: 数字商品服务-密钥管理-获取用户公钥
     */
    public GetPkiPublickeyResponse getPkiPublickeyEx(GetPkiPublickeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.pki.publickey.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPkiPublickeyResponse());
    }

    /**
     * Description: ECC公钥加密接口
     * Summary: 数字商品服务-密钥管理-公钥加密
     */
    public ExecPkiEncryptResponse execPkiEncrypt(ExecPkiEncryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execPkiEncryptEx(request, headers, runtime);
    }

    /**
     * Description: ECC公钥加密接口
     * Summary: 数字商品服务-密钥管理-公钥加密
     */
    public ExecPkiEncryptResponse execPkiEncryptEx(ExecPkiEncryptRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.pki.encrypt.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecPkiEncryptResponse());
    }

    /**
     * Description: ECC解密算法接口
     * Summary: 数字商品服务-密钥管理-私钥解密
     */
    public ExecPkiDecryptResponse execPkiDecrypt(ExecPkiDecryptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execPkiDecryptEx(request, headers, runtime);
    }

    /**
     * Description: ECC解密算法接口
     * Summary: 数字商品服务-密钥管理-私钥解密
     */
    public ExecPkiDecryptResponse execPkiDecryptEx(ExecPkiDecryptRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.pki.decrypt.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecPkiDecryptResponse());
    }

    /**
     * Description: 更新商户的友商信息
     * Summary: 数字商品服务-商户管理-更新商户友商
     */
    public UpdateMerchantFriendResponse updateMerchantFriend(UpdateMerchantFriendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMerchantFriendEx(request, headers, runtime);
    }

    /**
     * Description: 更新商户的友商信息
     * Summary: 数字商品服务-商户管理-更新商户友商
     */
    public UpdateMerchantFriendResponse updateMerchantFriendEx(UpdateMerchantFriendRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.friend.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMerchantFriendResponse());
    }

    /**
     * Description: 商品供应商户发布一个商品
     * Summary: 数字商品服务-商品服务-创建商品
     */
    public CreateEquityResponse createEquity(CreateEquityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEquityEx(request, headers, runtime);
    }

    /**
     * Description: 商品供应商户发布一个商品
     * Summary: 数字商品服务-商品服务-创建商品
     */
    public CreateEquityResponse createEquityEx(CreateEquityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEquityResponse());
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
    下线商品
     * Summary: 数字商品服务-商品服务-下线商品
     */
    public OfflineEquityResponse offlineEquity(OfflineEquityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineEquityEx(request, headers, runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.status.update
    下线商品
     * Summary: 数字商品服务-商品服务-下线商品
     */
    public OfflineEquityResponse offlineEquityEx(OfflineEquityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineEquityResponse());
    }

    /**
     * Description: 该接口不使用，合并至baas.antdao.equity.status.update
    冻结权益
     * Summary: 数字商品服务-商品服务-冻结商品
     */
    public FreezeEquityResponse freezeEquity(FreezeEquityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeEquityEx(request, headers, runtime);
    }

    /**
     * Description: 该接口不使用，合并至baas.antdao.equity.status.update
    冻结权益
     * Summary: 数字商品服务-商品服务-冻结商品
     */
    public FreezeEquityResponse freezeEquityEx(FreezeEquityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeEquityResponse());
    }

    /**
     * Description: 授权兑换—非公开商品商户配置
     * Summary: 数字商品服务-商品服务-授权兑换
     */
    public OpenEquityMerchantResponse openEquityMerchant(OpenEquityMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openEquityMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 授权兑换—非公开商品商户配置
     * Summary: 数字商品服务-商品服务-授权兑换
     */
    public OpenEquityMerchantResponse openEquityMerchantEx(OpenEquityMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.merchant.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenEquityMerchantResponse());
    }

    /**
     * Description: 用户兑换价格设置
     * Summary: 数字商品服务-商品服务-用户兑换价格设置
     */
    public AuthEquityMerchantuserpriceResponse authEquityMerchantuserprice(AuthEquityMerchantuserpriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authEquityMerchantuserpriceEx(request, headers, runtime);
    }

    /**
     * Description: 用户兑换价格设置
     * Summary: 数字商品服务-商品服务-用户兑换价格设置
     */
    public AuthEquityMerchantuserpriceResponse authEquityMerchantuserpriceEx(AuthEquityMerchantuserpriceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.merchantuserprice.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthEquityMerchantuserpriceResponse());
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update 
    更新商品价格
     * Summary: 数字商品服务-商品服务-更新商品价格
     */
    public UpdateEquityDefaultpriceResponse updateEquityDefaultprice(UpdateEquityDefaultpriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEquityDefaultpriceEx(request, headers, runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update 
    更新商品价格
     * Summary: 数字商品服务-商品服务-更新商品价格
     */
    public UpdateEquityDefaultpriceResponse updateEquityDefaultpriceEx(UpdateEquityDefaultpriceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.defaultprice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateEquityDefaultpriceResponse());
    }

    /**
     * Description: 更新商品自定义定价
     * Summary: 数字商品服务-商品服务-更新自定义定价
     */
    public UpdateEquityTenantpriceResponse updateEquityTenantprice(UpdateEquityTenantpriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEquityTenantpriceEx(request, headers, runtime);
    }

    /**
     * Description: 更新商品自定义定价
     * Summary: 数字商品服务-商品服务-更新自定义定价
     */
    public UpdateEquityTenantpriceResponse updateEquityTenantpriceEx(UpdateEquityTenantpriceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.tenantprice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateEquityTenantpriceResponse());
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
    增加权益库存
     * Summary: 数字商品服务-商品服务-增加权益库存
     */
    public AddEquityCountResponse addEquityCount(AddEquityCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEquityCountEx(request, headers, runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
    增加权益库存
     * Summary: 数字商品服务-商品服务-增加权益库存
     */
    public AddEquityCountResponse addEquityCountEx(AddEquityCountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.count.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddEquityCountResponse());
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
    更新兑换限制规则
     * Summary: 数字商品服务-商品服务-更新兑换限制规则
     */
    public UpdateEquityExchangelimitResponse updateEquityExchangelimit(UpdateEquityExchangelimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEquityExchangelimitEx(request, headers, runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
    更新兑换限制规则
     * Summary: 数字商品服务-商品服务-更新兑换限制规则
     */
    public UpdateEquityExchangelimitResponse updateEquityExchangelimitEx(UpdateEquityExchangelimitRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.exchangelimit.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateEquityExchangelimitResponse());
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
    更新商品有效期
     * Summary: 数字商品服务-商品服务-更新有效期
     */
    public UpdateEquityValidtimeResponse updateEquityValidtime(UpdateEquityValidtimeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEquityValidtimeEx(request, headers, runtime);
    }

    /**
     * Description: 该接口不使用，合并至 baas.antdao.equity.update
    更新商品有效期
     * Summary: 数字商品服务-商品服务-更新有效期
     */
    public UpdateEquityValidtimeResponse updateEquityValidtimeEx(UpdateEquityValidtimeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.validtime.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateEquityValidtimeResponse());
    }

    /**
     * Description: 查询商品信息
     * Summary: 数字商品服务-商品服务-查询商品信息
     */
    public QueryEquityResponse queryEquity(QueryEquityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEquityEx(request, headers, runtime);
    }

    /**
     * Description: 查询商品信息
     * Summary: 数字商品服务-商品服务-查询商品信息
     */
    public QueryEquityResponse queryEquityEx(QueryEquityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEquityResponse());
    }

    /**
     * Description: 用户身份发起兑换
     * Summary: 数字商品服务-兑换服务-用户身份发起兑换
     */
    public ExecExchangeByuserResponse execExchangeByuser(ExecExchangeByuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execExchangeByuserEx(request, headers, runtime);
    }

    /**
     * Description: 用户身份发起兑换
     * Summary: 数字商品服务-兑换服务-用户身份发起兑换
     */
    public ExecExchangeByuserResponse execExchangeByuserEx(ExecExchangeByuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.byuser.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecExchangeByuserResponse());
    }

    /**
     * Description: 商户身份发起兑换
     * Summary: 数字商品服务-兑换服务-商户身份发起兑换
     */
    public ExecExchangeBymerchantResponse execExchangeBymerchant(ExecExchangeBymerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execExchangeBymerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商户身份发起兑换
     * Summary: 数字商品服务-兑换服务-商户身份发起兑换
     */
    public ExecExchangeBymerchantResponse execExchangeBymerchantEx(ExecExchangeBymerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.bymerchant.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecExchangeBymerchantResponse());
    }

    /**
     * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
     * Summary: 数字商品服务-兑换服务-确认接单
     */
    public ConfirmExchangeResponse confirmExchange(ConfirmExchangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmExchangeEx(request, headers, runtime);
    }

    /**
     * Description: 确认接单接口。注意：若确认接单则必须发货！如果不能确保发货则直接调用缺货接口。
     * Summary: 数字商品服务-兑换服务-确认接单
     */
    public ConfirmExchangeResponse confirmExchangeEx(ConfirmExchangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmExchangeResponse());
    }

    /**
     * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
     * Summary: 数字商品服务-兑换服务-拒绝发货
     */
    public ExecExchangeOutofstoreResponse execExchangeOutofstore(ExecExchangeOutofstoreRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execExchangeOutofstoreEx(request, headers, runtime);
    }

    /**
     * Description: 拒绝发货。供应商可由于缺货，商品不满足发货条件，意外状态下使用。
     * Summary: 数字商品服务-兑换服务-拒绝发货
     */
    public ExecExchangeOutofstoreResponse execExchangeOutofstoreEx(ExecExchangeOutofstoreRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.outofstore.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecExchangeOutofstoreResponse());
    }

    /**
     * Description: 兑换发货
     * Summary: 数字商品服务-兑换服务-兑换发货
     */
    public SendExchangeResponse sendExchange(SendExchangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendExchangeEx(request, headers, runtime);
    }

    /**
     * Description: 兑换发货
     * Summary: 数字商品服务-兑换服务-兑换发货
     */
    public SendExchangeResponse sendExchangeEx(SendExchangeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendExchangeResponse());
    }

    /**
     * Description: 用户身份确认收货
     * Summary: 数字商品服务-兑换服务-用户身份确认收货
     */
    public ExecExchangeReceivebyuserResponse execExchangeReceivebyuser(ExecExchangeReceivebyuserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execExchangeReceivebyuserEx(request, headers, runtime);
    }

    /**
     * Description: 用户身份确认收货
     * Summary: 数字商品服务-兑换服务-用户身份确认收货
     */
    public ExecExchangeReceivebyuserResponse execExchangeReceivebyuserEx(ExecExchangeReceivebyuserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.receivebyuser.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecExchangeReceivebyuserResponse());
    }

    /**
     * Description: 资产过期
     * Summary: 数字商品服务-资产服务-资产过期
     */
    public ExecAssetExpireResponse execAssetExpire(ExecAssetExpireRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAssetExpireEx(request, headers, runtime);
    }

    /**
     * Description: 资产过期
     * Summary: 数字商品服务-资产服务-资产过期
     */
    public ExecAssetExpireResponse execAssetExpireEx(ExecAssetExpireRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.expire.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAssetExpireResponse());
    }

    /**
     * Description: 检索资产流转流水
     * Summary: 数字商品服务-资产服务-查询资产流转流水
     */
    public QueryAssetInstructionResponse queryAssetInstruction(QueryAssetInstructionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAssetInstructionEx(request, headers, runtime);
    }

    /**
     * Description: 检索资产流转流水
     * Summary: 数字商品服务-资产服务-查询资产流转流水
     */
    public QueryAssetInstructionResponse queryAssetInstructionEx(QueryAssetInstructionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.instruction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAssetInstructionResponse());
    }

    /**
     * Description: 该接口废弃不用！！！
    查询商品兑换流水
     * Summary: 数字商品服务-兑换服务-查询商品兑换流水
     */
    public QueryExchangeInstructionResponse queryExchangeInstruction(QueryExchangeInstructionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryExchangeInstructionEx(request, headers, runtime);
    }

    /**
     * Description: 该接口废弃不用！！！
    查询商品兑换流水
     * Summary: 数字商品服务-兑换服务-查询商品兑换流水
     */
    public QueryExchangeInstructionResponse queryExchangeInstructionEx(QueryExchangeInstructionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.instruction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryExchangeInstructionResponse());
    }

    /**
     * Description: 资产初始化发行
     * Summary: 数字商品服务-资产服务-资产初始化发行
     */
    public ExecAssetIssueResponse execAssetIssue(ExecAssetIssueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAssetIssueEx(request, headers, runtime);
    }

    /**
     * Description: 资产初始化发行
     * Summary: 数字商品服务-资产服务-资产初始化发行
     */
    public ExecAssetIssueResponse execAssetIssueEx(ExecAssetIssueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.issue.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAssetIssueResponse());
    }

    /**
     * Description: 赎回资产
     * Summary: 数字商品服务-资产服务-赎回资产
     */
    public ExecAssetRedeemResponse execAssetRedeem(ExecAssetRedeemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAssetRedeemEx(request, headers, runtime);
    }

    /**
     * Description: 赎回资产
     * Summary: 数字商品服务-资产服务-赎回资产
     */
    public ExecAssetRedeemResponse execAssetRedeemEx(ExecAssetRedeemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.redeem.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAssetRedeemResponse());
    }

    /**
     * Description: 发放资产
     * Summary: 数字商品服务-资产服务-发放资产
     */
    public ExecAssetGrantResponse execAssetGrant(ExecAssetGrantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAssetGrantEx(request, headers, runtime);
    }

    /**
     * Description: 发放资产
     * Summary: 数字商品服务-资产服务-发放资产
     */
    public ExecAssetGrantResponse execAssetGrantEx(ExecAssetGrantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.grant.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAssetGrantResponse());
    }

    /**
     * Description: 发放回退资产
     * Summary: 数字商品服务-资产服务-发放回退资产
     */
    public ExecAssetGrantrefundResponse execAssetGrantrefund(ExecAssetGrantrefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAssetGrantrefundEx(request, headers, runtime);
    }

    /**
     * Description: 发放回退资产
     * Summary: 数字商品服务-资产服务-发放回退资产
     */
    public ExecAssetGrantrefundResponse execAssetGrantrefundEx(ExecAssetGrantrefundRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.grantrefund.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAssetGrantrefundResponse());
    }

    /**
     * Description: 风控调整资产
     * Summary: 数字商品服务-资产服务-风控调整资产
     */
    public ExecAssetAdjustResponse execAssetAdjust(ExecAssetAdjustRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAssetAdjustEx(request, headers, runtime);
    }

    /**
     * Description: 风控调整资产
     * Summary: 数字商品服务-资产服务-风控调整资产
     */
    public ExecAssetAdjustResponse execAssetAdjustEx(ExecAssetAdjustRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.adjust.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAssetAdjustResponse());
    }

    /**
     * Description: 资产查询
     * Summary: 数字商品服务-资产服务-资产查询
     */
    public QueryAssetResponse queryAsset(QueryAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAssetEx(request, headers, runtime);
    }

    /**
     * Description: 资产查询
     * Summary: 数字商品服务-资产服务-资产查询
     */
    public QueryAssetResponse queryAssetEx(QueryAssetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAssetResponse());
    }

    /**
     * Description: 商户身份确认收货
     * Summary: 数字商品服务-兑换服务-商户身份确认收货
     */
    public ExecExchangeReceivebymerchantResponse execExchangeReceivebymerchant(ExecExchangeReceivebymerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execExchangeReceivebymerchantEx(request, headers, runtime);
    }

    /**
     * Description: 商户身份确认收货
     * Summary: 数字商品服务-兑换服务-商户身份确认收货
     */
    public ExecExchangeReceivebymerchantResponse execExchangeReceivebymerchantEx(ExecExchangeReceivebymerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.receivebymerchant.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecExchangeReceivebymerchantResponse());
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     */
    public QueryBlockResponse queryBlock(QueryBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockEx(request, headers, runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     */
    public QueryBlockResponse queryBlockEx(QueryBlockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.block.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockResponse());
    }

    /**
     * Description: 获取区块链最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     */
    public QueryBlockLastblocknumberResponse queryBlockLastblocknumber(QueryBlockLastblocknumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockLastblocknumberEx(request, headers, runtime);
    }

    /**
     * Description: 获取区块链最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     */
    public QueryBlockLastblocknumberResponse queryBlockLastblocknumberEx(QueryBlockLastblocknumberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.block.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockLastblocknumberResponse());
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-商品服务-更新商品属性信息
     */
    public UpdateEquityResponse updateEquity(UpdateEquityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEquityEx(request, headers, runtime);
    }

    /**
     * Description: 更新商品信息
     * Summary: 数字商品服务-商品服务-更新商品属性信息
     */
    public UpdateEquityResponse updateEquityEx(UpdateEquityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateEquityResponse());
    }

    /**
     * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
     * Summary: 数字商品服务-商品服务-发布商品结果查询
     */
    public QueryEquityCreateresultResponse queryEquityCreateresult(QueryEquityCreateresultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEquityCreateresultEx(request, headers, runtime);
    }

    /**
     * Description: 配合异步发布权益接口，查询发布权益商品结果。如查询无结果，判断错误类型，用户需要轮询。
     * Summary: 数字商品服务-商品服务-发布商品结果查询
     */
    public QueryEquityCreateresultResponse queryEquityCreateresultEx(QueryEquityCreateresultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.createresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEquityCreateresultResponse());
    }

    /**
     * Description: 根据商品兑换流水交易号查询商品兑换流水详情
     * Summary: 数字商品服务-商品服务-查询商品兑换流水
     */
    public QueryEquityInstructionResponse queryEquityInstruction(QueryEquityInstructionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEquityInstructionEx(request, headers, runtime);
    }

    /**
     * Description: 根据商品兑换流水交易号查询商品兑换流水详情
     * Summary: 数字商品服务-商品服务-查询商品兑换流水
     */
    public QueryEquityInstructionResponse queryEquityInstructionEx(QueryEquityInstructionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.instruction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEquityInstructionResponse());
    }

    /**
     * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
     * Summary: 数字商品服务-OSS服务-获取图片URL
     */
    public QueryImageResponse queryImage(QueryImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryImageEx(request, headers, runtime);
    }

    /**
     * Description: 传入图片的不可访问URL，获取图片的临时可访问URL（支持批量查询）
     * Summary: 数字商品服务-OSS服务-获取图片URL
     */
    public QueryImageResponse queryImageEx(QueryImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.image.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryImageResponse());
    }

    /**
     * Description: 更新商品状态（可用，冻结，下线）
     * Summary: 数字商品服务-商品服务-更新商品状态
     */
    public UpdateEquityStatusResponse updateEquityStatus(UpdateEquityStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEquityStatusEx(request, headers, runtime);
    }

    /**
     * Description: 更新商品状态（可用，冻结，下线）
     * Summary: 数字商品服务-商品服务-更新商品状态
     */
    public UpdateEquityStatusResponse updateEquityStatusEx(UpdateEquityStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateEquityStatusResponse());
    }

    /**
     * Description: 设置备付金金额（CAS接口）
     * Summary: 数字商品服务-商户管理-设置备付金金额
     */
    public SetMerchantProvisionResponse setMerchantProvision(SetMerchantProvisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setMerchantProvisionEx(request, headers, runtime);
    }

    /**
     * Description: 设置备付金金额（CAS接口）
     * Summary: 数字商品服务-商户管理-设置备付金金额
     */
    public SetMerchantProvisionResponse setMerchantProvisionEx(SetMerchantProvisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.provision.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetMerchantProvisionResponse());
    }

    /**
     * Description: 更新商户的备付金金额，由资金管理员操作
     * Summary: 数字商品服务-商户管理-更新备付金金额
     */
    public UpdateMerchantProvisionResponse updateMerchantProvision(UpdateMerchantProvisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMerchantProvisionEx(request, headers, runtime);
    }

    /**
     * Description: 更新商户的备付金金额，由资金管理员操作
     * Summary: 数字商品服务-商户管理-更新备付金金额
     */
    public UpdateMerchantProvisionResponse updateMerchantProvisionEx(UpdateMerchantProvisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.provision.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMerchantProvisionResponse());
    }

    /**
     * Description: 核销商品兑换交易，由资金管理员操作
     * Summary: 数字商品服务-商品服务-核销商品兑换交易
     */
    public ExecEquityInstructionwriteoffResponse execEquityInstructionwriteoff(ExecEquityInstructionwriteoffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execEquityInstructionwriteoffEx(request, headers, runtime);
    }

    /**
     * Description: 核销商品兑换交易，由资金管理员操作
     * Summary: 数字商品服务-商品服务-核销商品兑换交易
     */
    public ExecEquityInstructionwriteoffResponse execEquityInstructionwriteoffEx(ExecEquityInstructionwriteoffRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.equity.instructionwriteoff.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecEquityInstructionwriteoffResponse());
    }

    /**
     * Description: 查询租户的备付金列表
     * Summary: 数字商品服务-商户管理-查租户备付金列表
     */
    public QueryMerchantProvisionsResponse queryMerchantProvisions(QueryMerchantProvisionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantProvisionsEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户的备付金列表
     * Summary: 数字商品服务-商户管理-查租户备付金列表
     */
    public QueryMerchantProvisionsResponse queryMerchantProvisionsEx(QueryMerchantProvisionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.provisions.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantProvisionsResponse());
    }

    /**
     * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
     * Summary: 数字商品服务-商户管理-查询可兑换商品
     */
    public QueryMerchantExchangeableequitylistResponse queryMerchantExchangeableequitylist(QueryMerchantExchangeableequitylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantExchangeableequitylistEx(request, headers, runtime);
    }

    /**
     * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换商品列表
     * Summary: 数字商品服务-商户管理-查询可兑换商品
     */
    public QueryMerchantExchangeableequitylistResponse queryMerchantExchangeableequitylistEx(QueryMerchantExchangeableequitylistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.exchangeableequitylist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantExchangeableequitylistResponse());
    }

    /**
     * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
     * Summary: 数字商品服务-商户管理-查询可兑商品明细
     */
    public QueryMerchantExchangeableequitydetailResponse queryMerchantExchangeableequitydetail(QueryMerchantExchangeableequitydetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMerchantExchangeableequitydetailEx(request, headers, runtime);
    }

    /**
     * Description: 只有特定的商户才能调用，代理到数字商品管理自营后台的商户才能查询到信息。查询商户可兑换的商品明细信息
     * Summary: 数字商品服务-商户管理-查询可兑商品明细
     */
    public QueryMerchantExchangeableequitydetailResponse queryMerchantExchangeableequitydetailEx(QueryMerchantExchangeableequitydetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.exchangeableequitydetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMerchantExchangeableequitydetailResponse());
    }

    /**
     * Description: 创建新资产
     * Summary: 数字商品服务-资产服务-创建资产
     */
    public ExecAssetCreateResponse execAssetCreate(ExecAssetCreateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAssetCreateEx(request, headers, runtime);
    }

    /**
     * Description: 创建新资产
     * Summary: 数字商品服务-资产服务-创建资产
     */
    public ExecAssetCreateResponse execAssetCreateEx(ExecAssetCreateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.create.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAssetCreateResponse());
    }

    /**
     * Description: 资产铸币(不扣减备付金)，合约管理员操作
     * Summary: 数字商品服务-资产服务-资产铸币
     */
    public ExecAssetGenerateResponse execAssetGenerate(ExecAssetGenerateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execAssetGenerateEx(request, headers, runtime);
    }

    /**
     * Description: 资产铸币(不扣减备付金)，合约管理员操作
     * Summary: 数字商品服务-资产服务-资产铸币
     */
    public ExecAssetGenerateResponse execAssetGenerateEx(ExecAssetGenerateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.asset.generate.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecAssetGenerateResponse());
    }

    /**
     * Description: 创建商户（合约管理员权限）
     * Summary: 数字商品服务-商户管理-创建商户
     */
    public CreateMerchantResponse createMerchant(CreateMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 创建商户（合约管理员权限）
     * Summary: 数字商品服务-商户管理-创建商户
     */
    public CreateMerchantResponse createMerchantEx(CreateMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMerchantResponse());
    }

    /**
     * Description: 设置商户的资金管理员，重要权限，谨慎操作！
     * Summary: 数字商品服务-商户管理-设置资金管理员
     */
    public SetMerchantFundmanagerResponse setMerchantFundmanager(SetMerchantFundmanagerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setMerchantFundmanagerEx(request, headers, runtime);
    }

    /**
     * Description: 设置商户的资金管理员，重要权限，谨慎操作！
     * Summary: 数字商品服务-商户管理-设置资金管理员
     */
    public SetMerchantFundmanagerResponse setMerchantFundmanagerEx(SetMerchantFundmanagerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.fundmanager.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetMerchantFundmanagerResponse());
    }

    /**
     * Description: 创建备付金账户，合约管理员权限
     * Summary: 数字商品服务-商户管理-创建备付金账户
     */
    public CreateMerchantProvisionResponse createMerchantProvision(CreateMerchantProvisionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMerchantProvisionEx(request, headers, runtime);
    }

    /**
     * Description: 创建备付金账户，合约管理员权限
     * Summary: 数字商品服务-商户管理-创建备付金账户
     */
    public CreateMerchantProvisionResponse createMerchantProvisionEx(CreateMerchantProvisionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.merchant.provision.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMerchantProvisionResponse());
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-管理服务-代理权限查询
     */
    public QueryConfigDelegaterelationResponse queryConfigDelegaterelation(QueryConfigDelegaterelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConfigDelegaterelationEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-管理服务-代理权限查询
     */
    public QueryConfigDelegaterelationResponse queryConfigDelegaterelationEx(QueryConfigDelegaterelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.config.delegaterelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConfigDelegaterelationResponse());
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-管理服务-设置代理权限
     */
    public UpdateConfigDelegaterelationResponse updateConfigDelegaterelation(UpdateConfigDelegaterelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigDelegaterelationEx(request, headers, runtime);
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-管理服务-设置代理权限
     */
    public UpdateConfigDelegaterelationResponse updateConfigDelegaterelationEx(UpdateConfigDelegaterelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.config.delegaterelation.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateConfigDelegaterelationResponse());
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     */
    public QueryConfigWhitelistResponse queryConfigWhitelist(QueryConfigWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryConfigWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     */
    public QueryConfigWhitelistResponse queryConfigWhitelistEx(QueryConfigWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.config.whitelist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryConfigWhitelistResponse());
    }

    /**
     * Description: 设置接口访问白名单
     * Summary: 数字商品服务-管理服务-设置访问白名单
     */
    public UpdateConfigWhitelistResponse updateConfigWhitelist(UpdateConfigWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateConfigWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: 设置接口访问白名单
     * Summary: 数字商品服务-管理服务-设置访问白名单
     */
    public UpdateConfigWhitelistResponse updateConfigWhitelistEx(UpdateConfigWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.config.whitelist.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateConfigWhitelistResponse());
    }

    /**
     * Description: 兑换单申请售后（采购商）
     * Summary: 数字商品服务-兑换服务-申请售后(商家)
     */
    public ApplyExchangeAftersaleResponse applyExchangeAftersale(ApplyExchangeAftersaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyExchangeAftersaleEx(request, headers, runtime);
    }

    /**
     * Description: 兑换单申请售后（采购商）
     * Summary: 数字商品服务-兑换服务-申请售后(商家)
     */
    public ApplyExchangeAftersaleResponse applyExchangeAftersaleEx(ApplyExchangeAftersaleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.aftersale.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyExchangeAftersaleResponse());
    }

    /**
     * Description: 同意售后（供应商）
     * Summary: 数字商品服务-兑换服务-同意售后
     */
    public ExecExchangeAgreeaftersaleResponse execExchangeAgreeaftersale(ExecExchangeAgreeaftersaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execExchangeAgreeaftersaleEx(request, headers, runtime);
    }

    /**
     * Description: 同意售后（供应商）
     * Summary: 数字商品服务-兑换服务-同意售后
     */
    public ExecExchangeAgreeaftersaleResponse execExchangeAgreeaftersaleEx(ExecExchangeAgreeaftersaleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.agreeaftersale.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecExchangeAgreeaftersaleResponse());
    }

    /**
     * Description: 拒绝售后（供应商）
     * Summary: 数字商品服务-兑换服务-拒绝售后
     */
    public RefuseExchangeAftersaleResponse refuseExchangeAftersale(RefuseExchangeAftersaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseExchangeAftersaleEx(request, headers, runtime);
    }

    /**
     * Description: 拒绝售后（供应商）
     * Summary: 数字商品服务-兑换服务-拒绝售后
     */
    public RefuseExchangeAftersaleResponse refuseExchangeAftersaleEx(RefuseExchangeAftersaleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.aftersale.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseExchangeAftersaleResponse());
    }

    /**
     * Description: 重新发货（供应商）
     * Summary: 数字商品服务-兑换服务-重新发货
     */
    public SendExchangeAftersaleResponse sendExchangeAftersale(SendExchangeAftersaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendExchangeAftersaleEx(request, headers, runtime);
    }

    /**
     * Description: 重新发货（供应商）
     * Summary: 数字商品服务-兑换服务-重新发货
     */
    public SendExchangeAftersaleResponse sendExchangeAftersaleEx(SendExchangeAftersaleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.aftersale.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendExchangeAftersaleResponse());
    }

    /**
     * Description: 商户确认售后（供应商）comfirmaftersale
     * Summary:  数字商品服务-兑换服务-商户确认售后
     */
    public ConfirmExchangeAftersaleResponse confirmExchangeAftersale(ConfirmExchangeAftersaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmExchangeAftersaleEx(request, headers, runtime);
    }

    /**
     * Description: 商户确认售后（供应商）comfirmaftersale
     * Summary:  数字商品服务-兑换服务-商户确认售后
     */
    public ConfirmExchangeAftersaleResponse confirmExchangeAftersaleEx(ConfirmExchangeAftersaleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.exchange.aftersale.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmExchangeAftersaleResponse());
    }

    /**
     * Description: 数字消费卡链上发布
     * Summary: 数字商品服务-存证服务-消费卡链上发布
     */
    public ExecDataDepositResponse execDataDeposit(ExecDataDepositRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDataDepositEx(request, headers, runtime);
    }

    /**
     * Description: 数字消费卡链上发布
     * Summary: 数字商品服务-存证服务-消费卡链上发布
     */
    public ExecDataDepositResponse execDataDepositEx(ExecDataDepositRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.data.deposit.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDataDepositResponse());
    }

    /**
     * Description: 设置商品兑换手续费
     * Summary: 数字商品服务-商品服务-设置商品手续费
     */
    public SetCommissionResponse setCommission(SetCommissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setCommissionEx(request, headers, runtime);
    }

    /**
     * Description: 设置商品兑换手续费
     * Summary: 数字商品服务-商品服务-设置商品手续费
     */
    public SetCommissionResponse setCommissionEx(SetCommissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.commission.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetCommissionResponse());
    }

    /**
     * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
     * Summary: 数字商品服务-商品服务-查询商品手续费
     */
    public QueryCommissionResponse queryCommission(QueryCommissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCommissionEx(request, headers, runtime);
    }

    /**
     * Description: 查询商品手续费（可查询 当前生效 和 全部 的手续费信息）
     * Summary: 数字商品服务-商品服务-查询商品手续费
     */
    public QueryCommissionResponse queryCommissionEx(QueryCommissionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.commission.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCommissionResponse());
    }

    /**
     * Description: 设置收取手续费的商户信息（合约管理员权限）
     * Summary: 数字商品服务-商品服务-设置收手续费商户
     */
    public SetCommissionMerchantResponse setCommissionMerchant(SetCommissionMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setCommissionMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 设置收取手续费的商户信息（合约管理员权限）
     * Summary: 数字商品服务-商品服务-设置收手续费商户
     */
    public SetCommissionMerchantResponse setCommissionMerchantEx(SetCommissionMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.commission.merchant.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetCommissionMerchantResponse());
    }

    /**
     * Description: 查询收取手续费的商户信息
     * Summary: 数字商品服务-商品服务-查询收手续费商户
     */
    public QueryCommissionMerchantResponse queryCommissionMerchant(QueryCommissionMerchantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCommissionMerchantEx(request, headers, runtime);
    }

    /**
     * Description: 查询收取手续费的商户信息
     * Summary: 数字商品服务-商品服务-查询收手续费商户
     */
    public QueryCommissionMerchantResponse queryCommissionMerchantEx(QueryCommissionMerchantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.commission.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCommissionMerchantResponse());
    }

    /**
     * Description: 单独创建对应的链ID的链上账户
     * Summary: 数字商品服务-管理服务-创建链上账户
     */
    public CreateConfigChainaccountResponse createConfigChainaccount(CreateConfigChainaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConfigChainaccountEx(request, headers, runtime);
    }

    /**
     * Description: 单独创建对应的链ID的链上账户
     * Summary: 数字商品服务-管理服务-创建链上账户
     */
    public CreateConfigChainaccountResponse createConfigChainaccountEx(CreateConfigChainaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.config.chainaccount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConfigChainaccountResponse());
    }

    /**
     * Description: 买家发起套餐交易
     * Summary: 数字商品服务-IP授权服务-发起套餐交易
     */
    public StartIpPackagetradeResponse startIpPackagetrade(StartIpPackagetradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startIpPackagetradeEx(request, headers, runtime);
    }

    /**
     * Description: 买家发起套餐交易
     * Summary: 数字商品服务-IP授权服务-发起套餐交易
     */
    public StartIpPackagetradeResponse startIpPackagetradeEx(StartIpPackagetradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.packagetrade.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartIpPackagetradeResponse());
    }

    /**
     * Description: 交易发起方取消交易，包括套餐交易和定向授权
     * Summary: 数字商品服务-IP授权服务-取消交易
     */
    public CancelIpPackagetradeResponse cancelIpPackagetrade(CancelIpPackagetradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelIpPackagetradeEx(request, headers, runtime);
    }

    /**
     * Description: 交易发起方取消交易，包括套餐交易和定向授权
     * Summary: 数字商品服务-IP授权服务-取消交易
     */
    public CancelIpPackagetradeResponse cancelIpPackagetradeEx(CancelIpPackagetradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.packagetrade.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelIpPackagetradeResponse());
    }

    /**
     * Description: 上传套餐交易销售数据
     * Summary: 数字商品服务-IP授权服务-上传套餐数据
     */
    public UploadIpPackagetradesalesResponse uploadIpPackagetradesales(UploadIpPackagetradesalesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadIpPackagetradesalesEx(request, headers, runtime);
    }

    /**
     * Description: 上传套餐交易销售数据
     * Summary: 数字商品服务-IP授权服务-上传套餐数据
     */
    public UploadIpPackagetradesalesResponse uploadIpPackagetradesalesEx(UploadIpPackagetradesalesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.packagetradesales.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadIpPackagetradesalesResponse());
    }

    /**
     * Description: 发起授权交易
     * Summary: 数字商品服务-IP授权服务-发起授权交易
     */
    public StartIpAuthtradeResponse startIpAuthtrade(StartIpAuthtradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startIpAuthtradeEx(request, headers, runtime);
    }

    /**
     * Description: 发起授权交易
     * Summary: 数字商品服务-IP授权服务-发起授权交易
     */
    public StartIpAuthtradeResponse startIpAuthtradeEx(StartIpAuthtradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.authtrade.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartIpAuthtradeResponse());
    }

    /**
     * Description: 上传授权模式交易的销售数据
     * Summary: 数字商品服务-IP授权服务-上传销售数据
     */
    public UploadIpAuthtradesalesResponse uploadIpAuthtradesales(UploadIpAuthtradesalesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadIpAuthtradesalesEx(request, headers, runtime);
    }

    /**
     * Description: 上传授权模式交易的销售数据
     * Summary: 数字商品服务-IP授权服务-上传销售数据
     */
    public UploadIpAuthtradesalesResponse uploadIpAuthtradesalesEx(UploadIpAuthtradesalesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.authtradesales.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadIpAuthtradesalesResponse());
    }

    /**
     * Description: 取消授权模式下销售数据账单
     * Summary: 数字商品服务-IP授权服务-取消授权账单
     */
    public CancelIpAuthtradebillResponse cancelIpAuthtradebill(CancelIpAuthtradebillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelIpAuthtradebillEx(request, headers, runtime);
    }

    /**
     * Description: 取消授权模式下销售数据账单
     * Summary: 数字商品服务-IP授权服务-取消授权账单
     */
    public CancelIpAuthtradebillResponse cancelIpAuthtradebillEx(CancelIpAuthtradebillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.authtradebill.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelIpAuthtradebillResponse());
    }

    /**
     * Description: 查询账单支付状态
     * Summary: 数字商品服务-IP授权服务-查询账单状态
     */
    public QueryIpBillstatusResponse queryIpBillstatus(QueryIpBillstatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpBillstatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询账单支付状态
     * Summary: 数字商品服务-IP授权服务-查询账单状态
     */
    public QueryIpBillstatusResponse queryIpBillstatusEx(QueryIpBillstatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.billstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpBillstatusResponse());
    }

    /**
     * Description: 查询订单信息，模糊查询和分页查询
     * Summary: 数字商品服务-IP授权服务-查询订单列表
     */
    public QueryIpOrderlistResponse queryIpOrderlist(QueryIpOrderlistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpOrderlistEx(request, headers, runtime);
    }

    /**
     * Description: 查询订单信息，模糊查询和分页查询
     * Summary: 数字商品服务-IP授权服务-查询订单列表
     */
    public QueryIpOrderlistResponse queryIpOrderlistEx(QueryIpOrderlistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.orderlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpOrderlistResponse());
    }

    /**
     * Description: ip商品创建
     * Summary: 数字商品服务-IP授权服务-ip创建
     */
    public CreateIpGoodsResponse createIpGoods(CreateIpGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIpGoodsEx(request, headers, runtime);
    }

    /**
     * Description: ip商品创建
     * Summary: 数字商品服务-IP授权服务-ip创建
     */
    public CreateIpGoodsResponse createIpGoodsEx(CreateIpGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goods.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIpGoodsResponse());
    }

    /**
     * Description: ip的渠道信息添加
     * Summary: 数字商品服务-IP授权服务-渠道信息添加
     */
    public AddIpChannelResponse addIpChannel(AddIpChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addIpChannelEx(request, headers, runtime);
    }

    /**
     * Description: ip的渠道信息添加
     * Summary: 数字商品服务-IP授权服务-渠道信息添加
     */
    public AddIpChannelResponse addIpChannelEx(AddIpChannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.channel.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddIpChannelResponse());
    }

    /**
     * Description: 查询订单详情，包含销售数据
     * Summary: 数字商品服务-IP授权服务-查询订单详情
     */
    public QueryIpOrderinfoResponse queryIpOrderinfo(QueryIpOrderinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpOrderinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询订单详情，包含销售数据
     * Summary: 数字商品服务-IP授权服务-查询订单详情
     */
    public QueryIpOrderinfoResponse queryIpOrderinfoEx(QueryIpOrderinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.orderinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpOrderinfoResponse());
    }

    /**
     * Description: 批量查询ip简略信息
     * Summary: 数字商品服务-IP授权服务-批量查询
     */
    public BatchqueryIpGoodsResponse batchqueryIpGoods(BatchqueryIpGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryIpGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 批量查询ip简略信息
     * Summary: 数字商品服务-IP授权服务-批量查询
     */
    public BatchqueryIpGoodsResponse batchqueryIpGoodsEx(BatchqueryIpGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goods.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryIpGoodsResponse());
    }

    /**
     * Description: 根据渠道查询详细的信息
     * Summary: 数字商品服务-IP授权服务-查询渠道详细
     */
    public QueryIpGoodsdetailwithchannelResponse queryIpGoodsdetailwithchannel(QueryIpGoodsdetailwithchannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpGoodsdetailwithchannelEx(request, headers, runtime);
    }

    /**
     * Description: 根据渠道查询详细的信息
     * Summary: 数字商品服务-IP授权服务-查询渠道详细
     */
    public QueryIpGoodsdetailwithchannelResponse queryIpGoodsdetailwithchannelEx(QueryIpGoodsdetailwithchannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goodsdetailwithchannel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpGoodsdetailwithchannelResponse());
    }

    /**
     * Description: ip的所有信息 包括渠道和sku
     * Summary: 数字商品服务-IP授权服务-IP详情查询
     */
    public QueryIpDetailResponse queryIpDetail(QueryIpDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpDetailEx(request, headers, runtime);
    }

    /**
     * Description: ip的所有信息 包括渠道和sku
     * Summary: 数字商品服务-IP授权服务-IP详情查询
     */
    public QueryIpDetailResponse queryIpDetailEx(QueryIpDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpDetailResponse());
    }

    /**
     * Description: ip商品创建
     * Summary: 数字商品服务-IP授权服务-ip更新
     */
    public UpdateIpGoodsResponse updateIpGoods(UpdateIpGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIpGoodsEx(request, headers, runtime);
    }

    /**
     * Description: ip商品创建
     * Summary: 数字商品服务-IP授权服务-ip更新
     */
    public UpdateIpGoodsResponse updateIpGoodsEx(UpdateIpGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goods.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIpGoodsResponse());
    }

    /**
     * Description: ip的渠道信息修改
     * Summary: 数字商品服务-IP授权服务-渠道信息更新
     */
    public UpdateIpChannelResponse updateIpChannel(UpdateIpChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIpChannelEx(request, headers, runtime);
    }

    /**
     * Description: ip的渠道信息修改
     * Summary: 数字商品服务-IP授权服务-渠道信息更新
     */
    public UpdateIpChannelResponse updateIpChannelEx(UpdateIpChannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.channel.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIpChannelResponse());
    }

    /**
     * Description: ip上线
     * Summary: 数字商品服务-IP授权服务-上架
     */
    public OnlineIpResponse onlineIp(OnlineIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineIpEx(request, headers, runtime);
    }

    /**
     * Description: ip上线
     * Summary: 数字商品服务-IP授权服务-上架
     */
    public OnlineIpResponse onlineIpEx(OnlineIpRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineIpResponse());
    }

    /**
     * Description: ip下线
     * Summary: 数字商品服务-IP授权服务-下架
     */
    public OfflineIpResponse offlineIp(OfflineIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineIpEx(request, headers, runtime);
    }

    /**
     * Description: ip下线
     * Summary: 数字商品服务-IP授权服务-下架
     */
    public OfflineIpResponse offlineIpEx(OfflineIpRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineIpResponse());
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
     * Summary: 数字商品服务-IP授权服务-账户创建
     */
    public CreateIpAccountResponse createIpAccount(CreateIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户注册, 采购商注册账户完成即可以参与IP授权交易服务, 版权方需要根据具体需要完成二级商户创建操作后再参与IP授权交易服务。
     * Summary: 数字商品服务-IP授权服务-账户创建
     */
    public CreateIpAccountResponse createIpAccountEx(CreateIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIpAccountResponse());
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
     * Summary: 数字商品服务-IP授权服务-账户冻结
     */
    public FreezeIpAccountResponse freezeIpAccount(FreezeIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.freezeIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户冻结, 账户冻结后无法参与IP授权交易活动。
     * Summary: 数字商品服务-IP授权服务-账户冻结
     */
    public FreezeIpAccountResponse freezeIpAccountEx(FreezeIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.freeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FreezeIpAccountResponse());
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
     * Summary: 数字商品服务-IP授权服务-账户解冻
     */
    public UnfreezeIpAccountResponse unfreezeIpAccount(UnfreezeIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户解冻, 对于已经被冻结的账户, 账户解冻后才可以参与IP授权交易活动。
     * Summary: 数字商品服务-IP授权服务-账户解冻
     */
    public UnfreezeIpAccountResponse unfreezeIpAccountEx(UnfreezeIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeIpAccountResponse());
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户查询。
     * Summary: 数字商品服务-IP授权服务-账户查询
     */
    public QueryIpAccountResponse queryIpAccount(QueryIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: IP授权交易服务: IP采购商和版权方的账户查询。
     * Summary: 数字商品服务-IP授权服务-账户查询
     */
    public QueryIpAccountResponse queryIpAccountEx(QueryIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpAccountResponse());
    }

    /**
     * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
     * Summary: 数字商品服务-IP授权服务-版权方申请
     */
    public ApplyIpAccountResponse applyIpAccount(ApplyIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权交易服务-版权方申请: 版权方完成账户注册后需要完成版权方申请,异步流程需要查询申请结果。
     * Summary: 数字商品服务-IP授权服务-版权方申请
     */
    public ApplyIpAccountResponse applyIpAccountEx(ApplyIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyIpAccountResponse());
    }

    /**
     * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
     * Summary: 数字商品服务-IP授权服务-查申请进度
     */
    public CheckIpAccountResponse checkIpAccount(CheckIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权交易-版权方申请进度查询: 版权方申请流程需要人工审核和支付宝审核。
     * Summary: 数字商品服务-IP授权服务-查申请进度
     */
    public CheckIpAccountResponse checkIpAccountEx(CheckIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIpAccountResponse());
    }

    /**
     * Description: ip商品审批
     * Summary: 数字商品服务-IP授权服务-ip创建审批
     */
    public ConfirmIpGoodsResponse confirmIpGoods(ConfirmIpGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpGoodsEx(request, headers, runtime);
    }

    /**
     * Description: ip商品审批
     * Summary: 数字商品服务-IP授权服务-ip创建审批
     */
    public ConfirmIpGoodsResponse confirmIpGoodsEx(ConfirmIpGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goods.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpGoodsResponse());
    }

    /**
     * Description: ip信息批量查询--给运营使用
    查询审批信息
     * Summary: 数字商品服务-IP授权服务-审批信息查询
     */
    public BatchqueryIpApprovalResponse batchqueryIpApproval(BatchqueryIpApprovalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryIpApprovalEx(request, headers, runtime);
    }

    /**
     * Description: ip信息批量查询--给运营使用
    查询审批信息
     * Summary: 数字商品服务-IP授权服务-审批信息查询
     */
    public BatchqueryIpApprovalResponse batchqueryIpApprovalEx(BatchqueryIpApprovalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.approval.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryIpApprovalResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-运营审核确认
     * Summary: 数字商品服务-IP授权服务-运营审核确认
     */
    public ConfirmIpAccountResponse confirmIpAccount(ConfirmIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-运营审核确认
     * Summary: 数字商品服务-IP授权服务-运营审核确认
     */
    public ConfirmIpAccountResponse confirmIpAccountEx(ConfirmIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpAccountResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-运营审核拒绝
     * Summary: 数字商品服务-IP授权服务-运营审核拒绝
     */
    public RefuseIpAccountResponse refuseIpAccount(RefuseIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-运营审核拒绝
     * Summary: 数字商品服务-IP授权服务-运营审核拒绝
     */
    public RefuseIpAccountResponse refuseIpAccountEx(RefuseIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseIpAccountResponse());
    }

    /**
     * Description: 版权方进件信息的单个查询
     * Summary: 数字商品服务-IP授权服务-申请信息查询
     */
    public PullIpAccountResponse pullIpAccount(PullIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 版权方进件信息的单个查询
     * Summary: 数字商品服务-IP授权服务-申请信息查询
     */
    public PullIpAccountResponse pullIpAccountEx(PullIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullIpAccountResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-MCC列表查询
     * Summary: 数字商品服务-IP授权服务-MCC查询
     */
    public QueryIpMccResponse queryIpMcc(QueryIpMccRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpMccEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-MCC列表查询
     * Summary: 数字商品服务-IP授权服务-MCC查询
     */
    public QueryIpMccResponse queryIpMccEx(QueryIpMccRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.mcc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpMccResponse());
    }

    /**
     * Description: 查询ip type和受众人群
     * Summary: 数字商品服务-IP授权服务-IP标签查询
     */
    public QueryIpTypeResponse queryIpType(QueryIpTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpTypeEx(request, headers, runtime);
    }

    /**
     * Description: 查询ip type和受众人群
     * Summary: 数字商品服务-IP授权服务-IP标签查询
     */
    public QueryIpTypeResponse queryIpTypeEx(QueryIpTypeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.type.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpTypeResponse());
    }

    /**
     * Description: ip审批信息批量查询（带上渠道信息）
     * Summary: 数字商品服务-IP授权服务-审批批量查询
     */
    public BatchqueryIpApprovalandchannelResponse batchqueryIpApprovalandchannel(BatchqueryIpApprovalandchannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryIpApprovalandchannelEx(request, headers, runtime);
    }

    /**
     * Description: ip审批信息批量查询（带上渠道信息）
     * Summary: 数字商品服务-IP授权服务-审批批量查询
     */
    public BatchqueryIpApprovalandchannelResponse batchqueryIpApprovalandchannelEx(BatchqueryIpApprovalandchannelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.approvalandchannel.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryIpApprovalandchannelResponse());
    }

    /**
     * Description: 版权方进件信息的批量查询
     * Summary: 数字商品服务-IP授权服务-查询商家信息
     */
    public BatchqueryIpAccountResponse batchqueryIpAccount(BatchqueryIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 版权方进件信息的批量查询
     * Summary: 数字商品服务-IP授权服务-查询商家信息
     */
    public BatchqueryIpAccountResponse batchqueryIpAccountEx(BatchqueryIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryIpAccountResponse());
    }

    /**
     * Description: 账户列表查询
     * Summary: 数字商品服务-IP授权服务-查账户列表
     */
    public BatchqueryIpSellerResponse batchqueryIpSeller(BatchqueryIpSellerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryIpSellerEx(request, headers, runtime);
    }

    /**
     * Description: 账户列表查询
     * Summary: 数字商品服务-IP授权服务-查账户列表
     */
    public BatchqueryIpSellerResponse batchqueryIpSellerEx(BatchqueryIpSellerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.seller.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryIpSellerResponse());
    }

    /**
     * Description: 数字商品服务-IP服务-UNI码申请(特别注意: 针对同一笔订单(order_id), 累计申请(调用本接口)次数不能超过200次)
     * Summary: 数字商品服务-IP服务-UNI码申请
     */
    public ApplyIpCodeResponse applyIpCode(ApplyIpCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyIpCodeEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP服务-UNI码申请(特别注意: 针对同一笔订单(order_id), 累计申请(调用本接口)次数不能超过200次)
     * Summary: 数字商品服务-IP服务-UNI码申请
     */
    public ApplyIpCodeResponse applyIpCodeEx(ApplyIpCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.code.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyIpCodeResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-数字凭证源码分页查询: 小程序不可扫描的数字凭证分页查询。
    注意: 这个接口查到的为小程序不可扫描的码, 是原始编码!!!
     * Summary: 数字商品服务-IP服务-凭证源码查询
     */
    public PagequeryIpCodeResponse pagequeryIpCode(PagequeryIpCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpCodeEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-数字凭证源码分页查询: 小程序不可扫描的数字凭证分页查询。
    注意: 这个接口查到的为小程序不可扫描的码, 是原始编码!!!
     * Summary: 数字商品服务-IP服务-凭证源码查询
     */
    public PagequeryIpCodeResponse pagequeryIpCodeEx(PagequeryIpCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.code.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpCodeResponse());
    }

    /**
     * Description: 数字商品服务-IP服务-UNI码校验
     * Summary: 数字商品服务-IP服务-UNI码校验
     */
    public CheckIpCodeResponse checkIpCode(CheckIpCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIpCodeEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP服务-UNI码校验
     * Summary: 数字商品服务-IP服务-UNI码校验
     */
    public CheckIpCodeResponse checkIpCodeEx(CheckIpCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.code.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIpCodeResponse());
    }

    /**
     * Description: 对商品的更新进行审核
     * Summary: 数字商品服务-IP授权服务-IP更新审核
     */
    public ConfirmIpUpdateapprovalResponse confirmIpUpdateapproval(ConfirmIpUpdateapprovalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpUpdateapprovalEx(request, headers, runtime);
    }

    /**
     * Description: 对商品的更新进行审核
     * Summary: 数字商品服务-IP授权服务-IP更新审核
     */
    public ConfirmIpUpdateapprovalResponse confirmIpUpdateapprovalEx(ConfirmIpUpdateapprovalRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.updateapproval.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpUpdateapprovalResponse());
    }

    /**
     * Description: ip商品sku信息设置
     * Summary: 数字商品服务-IP授权服务-sku设置
     */
    public SetIpSkuResponse setIpSku(SetIpSkuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setIpSkuEx(request, headers, runtime);
    }

    /**
     * Description: ip商品sku信息设置
     * Summary: 数字商品服务-IP授权服务-sku设置
     */
    public SetIpSkuResponse setIpSkuEx(SetIpSkuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.sku.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetIpSkuResponse());
    }

    /**
     * Description: 查询商品基础信息的更新数据
     * Summary: 数字商品服务-IP授权服务-查询更新数据
     */
    public QueryIpGoodsupdateResponse queryIpGoodsupdate(QueryIpGoodsupdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpGoodsupdateEx(request, headers, runtime);
    }

    /**
     * Description: 查询商品基础信息的更新数据
     * Summary: 数字商品服务-IP授权服务-查询更新数据
     */
    public QueryIpGoodsupdateResponse queryIpGoodsupdateEx(QueryIpGoodsupdateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goodsupdate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpGoodsupdateResponse());
    }

    /**
     * Description: 查询账单信息，分页查询
     * Summary: 数字商品服务-IP授权服务-查询账单列表
     */
    public PagequeryIpBillResponse pagequeryIpBill(PagequeryIpBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpBillEx(request, headers, runtime);
    }

    /**
     * Description: 查询账单信息，分页查询
     * Summary: 数字商品服务-IP授权服务-查询账单列表
     */
    public PagequeryIpBillResponse pagequeryIpBillEx(PagequeryIpBillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.bill.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpBillResponse());
    }

    /**
     * Description: ip商品某个渠道默认sku查询
     * Summary: 数字商品服务-IP授权服务-sku查询
     */
    public QueryIpSkuconfigResponse queryIpSkuconfig(QueryIpSkuconfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpSkuconfigEx(request, headers, runtime);
    }

    /**
     * Description: ip商品某个渠道默认sku查询
     * Summary: 数字商品服务-IP授权服务-sku查询
     */
    public QueryIpSkuconfigResponse queryIpSkuconfigEx(QueryIpSkuconfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.skuconfig.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpSkuconfigResponse());
    }

    /**
     * Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
     * Summary: 数字商品服务-IP授权服务-版权方导入
     */
    public ImportIpAccountResponse importIpAccount(ImportIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权交易-版权方导入: 一链多端版权方互通
     * Summary: 数字商品服务-IP授权服务-版权方导入
     */
    public ImportIpAccountResponse importIpAccountEx(ImportIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportIpAccountResponse());
    }

    /**
     * Description: 商品特定渠道的sku信息清空
     * Summary: 数字商品服务-IP授权服务-sku清空
     */
    public RemoveIpSkuResponse removeIpSku(RemoveIpSkuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeIpSkuEx(request, headers, runtime);
    }

    /**
     * Description: 商品特定渠道的sku信息清空
     * Summary: 数字商品服务-IP授权服务-sku清空
     */
    public RemoveIpSkuResponse removeIpSkuEx(RemoveIpSkuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.sku.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveIpSkuResponse());
    }

    /**
     * Description: 创建监修报审
     * Summary: 数字商品服务-IP授权服务-创建监修报审
     */
    public CreateIpSuperviseapproveResponse createIpSuperviseapprove(CreateIpSuperviseapproveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIpSuperviseapproveEx(request, headers, runtime);
    }

    /**
     * Description: 创建监修报审
     * Summary: 数字商品服务-IP授权服务-创建监修报审
     */
    public CreateIpSuperviseapproveResponse createIpSuperviseapproveEx(CreateIpSuperviseapproveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.superviseapprove.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIpSuperviseapproveResponse());
    }

    /**
     * Description: 监修报审审批
     * Summary: 数字商品服务-IP授权服务-监修报审审批
     */
    public ConfirmIpSuperviseapproveResponse confirmIpSuperviseapprove(ConfirmIpSuperviseapproveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpSuperviseapproveEx(request, headers, runtime);
    }

    /**
     * Description: 监修报审审批
     * Summary: 数字商品服务-IP授权服务-监修报审审批
     */
    public ConfirmIpSuperviseapproveResponse confirmIpSuperviseapproveEx(ConfirmIpSuperviseapproveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.superviseapprove.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpSuperviseapproveResponse());
    }

    /**
     * Description: 监修报审进度推进/重置
     * Summary: 数字商品服务-IP授权服务-推进监修报审
     */
    public PushIpSuperviseapproveResponse pushIpSuperviseapprove(PushIpSuperviseapproveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushIpSuperviseapproveEx(request, headers, runtime);
    }

    /**
     * Description: 监修报审进度推进/重置
     * Summary: 数字商品服务-IP授权服务-推进监修报审
     */
    public PushIpSuperviseapproveResponse pushIpSuperviseapproveEx(PushIpSuperviseapproveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.superviseapprove.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushIpSuperviseapproveResponse());
    }

    /**
     * Description: 数字商品-IP授权交易-查询监修报审详情
     * Summary: 数字商品服务-IP授权服务-查询监修报审
     */
    public QueryIpSuperviseapproveResponse queryIpSuperviseapprove(QueryIpSuperviseapproveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpSuperviseapproveEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权交易-查询监修报审详情
     * Summary: 数字商品服务-IP授权服务-查询监修报审
     */
    public QueryIpSuperviseapproveResponse queryIpSuperviseapproveEx(QueryIpSuperviseapproveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.superviseapprove.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpSuperviseapproveResponse());
    }

    /**
     * Description: 领取数字凭证，如已被领取则返回被领取人昵称信息
     * Summary: 数字商品服务-IP授权服务-数字凭证领取
     */
    public ReceiveIpCodeResponse receiveIpCode(ReceiveIpCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.receiveIpCodeEx(request, headers, runtime);
    }

    /**
     * Description: 领取数字凭证，如已被领取则返回被领取人昵称信息
     * Summary: 数字商品服务-IP授权服务-数字凭证领取
     */
    public ReceiveIpCodeResponse receiveIpCodeEx(ReceiveIpCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.code.receive", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReceiveIpCodeResponse());
    }

    /**
     * Description: 已领取或以扫描过的数字凭证列表，分页查询
     * Summary: 数字商品服务-IP授权服务-数字凭证列表
     */
    public PagequeryIpCodeinfoResponse pagequeryIpCodeinfo(PagequeryIpCodeinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpCodeinfoEx(request, headers, runtime);
    }

    /**
     * Description: 已领取或以扫描过的数字凭证列表，分页查询
     * Summary: 数字商品服务-IP授权服务-数字凭证列表
     */
    public PagequeryIpCodeinfoResponse pagequeryIpCodeinfoEx(PagequeryIpCodeinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.codeinfo.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpCodeinfoResponse());
    }

    /**
     * Description: 创建增值服务
     * Summary: 数字商品服务-IP授权服务-创建增值服务
     */
    public CreateIpValueaddResponse createIpValueadd(CreateIpValueaddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIpValueaddEx(request, headers, runtime);
    }

    /**
     * Description: 创建增值服务
     * Summary: 数字商品服务-IP授权服务-创建增值服务
     */
    public CreateIpValueaddResponse createIpValueaddEx(CreateIpValueaddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.valueadd.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIpValueaddResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-更新增值服务
     * Summary: 数字商品服务-IP授权服务-更新增值服务
     */
    public UpdateIpValueaddResponse updateIpValueadd(UpdateIpValueaddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIpValueaddEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-更新增值服务
     * Summary: 数字商品服务-IP授权服务-更新增值服务
     */
    public UpdateIpValueaddResponse updateIpValueaddEx(UpdateIpValueaddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.valueadd.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIpValueaddResponse());
    }

    /**
     * Description: 数字商品-IP授权-设置增值服务sku
     * Summary: 数字商品服务-IP授权服务-设置增值服务
     */
    public SetIpValueaddskuResponse setIpValueaddsku(SetIpValueaddskuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setIpValueaddskuEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权-设置增值服务sku
     * Summary: 数字商品服务-IP授权服务-设置增值服务
     */
    public SetIpValueaddskuResponse setIpValueaddskuEx(SetIpValueaddskuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.valueaddsku.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetIpValueaddskuResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-增值服务上下架操作
     * Summary: 数字商品服务-IP授权服务-服务上下架
     */
    public OnlineIpValueaddResponse onlineIpValueadd(OnlineIpValueaddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineIpValueaddEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-增值服务上下架操作
     * Summary: 数字商品服务-IP授权服务-服务上下架
     */
    public OnlineIpValueaddResponse onlineIpValueaddEx(OnlineIpValueaddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.valueadd.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineIpValueaddResponse());
    }

    /**
     * Description: 数字商品-IP授权交易-增值服务查询
     * Summary: 数字商品服务-IP授权服务-增值服务查询
     */
    public QueryIpValueaddResponse queryIpValueadd(QueryIpValueaddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpValueaddEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权交易-增值服务查询
     * Summary: 数字商品服务-IP授权服务-增值服务查询
     */
    public QueryIpValueaddResponse queryIpValueaddEx(QueryIpValueaddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.valueadd.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpValueaddResponse());
    }

    /**
     * Description: 增值服务批量查询
     * Summary: 数字商品服务-IP授权服务-增值服务查询
     */
    public PagequeryIpValueaddResponse pagequeryIpValueadd(PagequeryIpValueaddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpValueaddEx(request, headers, runtime);
    }

    /**
     * Description: 增值服务批量查询
     * Summary: 数字商品服务-IP授权服务-增值服务查询
     */
    public PagequeryIpValueaddResponse pagequeryIpValueaddEx(PagequeryIpValueaddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.valueadd.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpValueaddResponse());
    }

    /**
     * Description: 批量上传授权交易的销售数据
     * Summary: 数字商品服务-IP授权服务-上传销售数据
     */
    public UploadIpTradesalesResponse uploadIpTradesales(UploadIpTradesalesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadIpTradesalesEx(request, headers, runtime);
    }

    /**
     * Description: 批量上传授权交易的销售数据
     * Summary: 数字商品服务-IP授权服务-上传销售数据
     */
    public UploadIpTradesalesResponse uploadIpTradesalesEx(UploadIpTradesalesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.tradesales.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadIpTradesalesResponse());
    }

    /**
     * Description: C端用户授权信息
     * Summary: 数字商品服务-IP授权服务-C用户授权
     */
    public AuthIpUserResponse authIpUser(AuthIpUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authIpUserEx(request, headers, runtime);
    }

    /**
     * Description: C端用户授权信息
     * Summary: 数字商品服务-IP授权服务-C用户授权
     */
    public AuthIpUserResponse authIpUserEx(AuthIpUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.user.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthIpUserResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-删除ip商品
     * Summary: 数字商品服务-IP授权服务-IP删除
     */
    public RemoveIpGoodsResponse removeIpGoods(RemoveIpGoodsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeIpGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-删除ip商品
     * Summary: 数字商品服务-IP授权服务-IP删除
     */
    public RemoveIpGoodsResponse removeIpGoodsEx(RemoveIpGoodsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goods.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveIpGoodsResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-ip数量统计
     * Summary: 数字商品服务-IP授权服务-ip数量统计
     */
    public CountIpNumResponse countIpNum(CountIpNumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countIpNumEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-ip数量统计
     * Summary: 数字商品服务-IP授权服务-ip数量统计
     */
    public CountIpNumResponse countIpNumEx(CountIpNumRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.num.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountIpNumResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-pv统计
     * Summary: 数字商品服务-IP授权服务-pv统计
     */
    public CountIpPvResponse countIpPv(CountIpPvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countIpPvEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-pv统计
     * Summary: 数字商品服务-IP授权服务-pv统计
     */
    public CountIpPvResponse countIpPvEx(CountIpPvRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.pv.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountIpPvResponse());
    }

    /**
     * Description: 查询数字凭证详细信息
     * Summary: 数字商品服务-IP授权服务-数字凭证详情
     */
    public QueryIpCodeResponse queryIpCode(QueryIpCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpCodeEx(request, headers, runtime);
    }

    /**
     * Description: 查询数字凭证详细信息
     * Summary: 数字商品服务-IP授权服务-数字凭证详情
     */
    public QueryIpCodeResponse queryIpCodeEx(QueryIpCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.code.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpCodeResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-账户统计
     * Summary: 数字商品服务-IP授权服务-账户统计
     */
    public CountIpAccountResponse countIpAccount(CountIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-账户统计
     * Summary: 数字商品服务-IP授权服务-账户统计
     */
    public CountIpAccountResponse countIpAccountEx(CountIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountIpAccountResponse());
    }

    /**
     * Description: 查询渠道订单统计值
     * Summary: 数字商品服务-IP授权服务-查询订单统计
     */
    public QueryIpOrderstatisticResponse queryIpOrderstatistic(QueryIpOrderstatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpOrderstatisticEx(request, headers, runtime);
    }

    /**
     * Description: 查询渠道订单统计值
     * Summary: 数字商品服务-IP授权服务-查询订单统计
     */
    public QueryIpOrderstatisticResponse queryIpOrderstatisticEx(QueryIpOrderstatisticRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.orderstatistic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpOrderstatisticResponse());
    }

    /**
     * Description: 版权方更新IP图库
     * Summary: 数字商品服务-IP授权服务-ip更新图库
     */
    public UpdateIpGoodsgalleryResponse updateIpGoodsgallery(UpdateIpGoodsgalleryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIpGoodsgalleryEx(request, headers, runtime);
    }

    /**
     * Description: 版权方更新IP图库
     * Summary: 数字商品服务-IP授权服务-ip更新图库
     */
    public UpdateIpGoodsgalleryResponse updateIpGoodsgalleryEx(UpdateIpGoodsgalleryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goodsgallery.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIpGoodsgalleryResponse());
    }

    /**
     * Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
     * Summary: 数字商品服务-IP授权服务-查询ip图库
     */
    public QueryIpGoodsgalleryResponse queryIpGoodsgallery(QueryIpGoodsgalleryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpGoodsgalleryEx(request, headers, runtime);
    }

    /**
     * Description: 版权方根据IPID查询图库，商家根据订单ID查询图库
     * Summary: 数字商品服务-IP授权服务-查询ip图库
     */
    public QueryIpGoodsgalleryResponse queryIpGoodsgalleryEx(QueryIpGoodsgalleryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goodsgallery.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpGoodsgalleryResponse());
    }

    /**
     * Description: 配置数字凭证的商品信息和资源位信息
     * Summary: 数字商品服务-IP服务-UNI码信息配置
     */
    public SetIpCodeinfoResponse setIpCodeinfo(SetIpCodeinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setIpCodeinfoEx(request, headers, runtime);
    }

    /**
     * Description: 配置数字凭证的商品信息和资源位信息
     * Summary: 数字商品服务-IP服务-UNI码信息配置
     */
    public SetIpCodeinfoResponse setIpCodeinfoEx(SetIpCodeinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.codeinfo.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetIpCodeinfoResponse());
    }

    /**
     * Description: 查询订单的图库下载记录
     * Summary: 数字商品服务-IP授权服务-查询图库记录
     */
    public PagequeryIpGalleryinstructionResponse pagequeryIpGalleryinstruction(PagequeryIpGalleryinstructionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpGalleryinstructionEx(request, headers, runtime);
    }

    /**
     * Description: 查询订单的图库下载记录
     * Summary: 数字商品服务-IP授权服务-查询图库记录
     */
    public PagequeryIpGalleryinstructionResponse pagequeryIpGalleryinstructionEx(PagequeryIpGalleryinstructionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.galleryinstruction.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpGalleryinstructionResponse());
    }

    /**
     * Description: 版权方确认订单图库信息
     * Summary: 数字商品服务-IP授权服务-订单图库确认
     */
    public ConfirmIpOrdergalleryResponse confirmIpOrdergallery(ConfirmIpOrdergalleryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpOrdergalleryEx(request, headers, runtime);
    }

    /**
     * Description: 版权方确认订单图库信息
     * Summary: 数字商品服务-IP授权服务-订单图库确认
     */
    public ConfirmIpOrdergalleryResponse confirmIpOrdergalleryEx(ConfirmIpOrdergalleryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.ordergallery.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpOrdergalleryResponse());
    }

    /**
     * Description: 审批IP定向授权交易。如果订单状态是“合作待确认”，则审批后状态为“合作拒绝”或者“合作通过”。如果订单状态是”订单待审核“，则审批后状态为“审核失败”或者“申请中”。
     * Summary: 数字商品服务-IP授权服务-审批定向授权
     */
    public ConfirmIpAuthtradeResponse confirmIpAuthtrade(ConfirmIpAuthtradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpAuthtradeEx(request, headers, runtime);
    }

    /**
     * Description: 审批IP定向授权交易。如果订单状态是“合作待确认”，则审批后状态为“合作拒绝”或者“合作通过”。如果订单状态是”订单待审核“，则审批后状态为“审核失败”或者“申请中”。
     * Summary: 数字商品服务-IP授权服务-审批定向授权
     */
    public ConfirmIpAuthtradeResponse confirmIpAuthtradeEx(ConfirmIpAuthtradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.authtrade.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpAuthtradeResponse());
    }

    /**
     * Description: 审核套餐授权申请
     * Summary: 数字商品服务-IP授权服务-审批套餐授权
     */
    public ConfirmIpPackagetradeResponse confirmIpPackagetrade(ConfirmIpPackagetradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpPackagetradeEx(request, headers, runtime);
    }

    /**
     * Description: 审核套餐授权申请
     * Summary: 数字商品服务-IP授权服务-审批套餐授权
     */
    public ConfirmIpPackagetradeResponse confirmIpPackagetradeEx(ConfirmIpPackagetradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.packagetrade.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpPackagetradeResponse());
    }

    /**
     * Description: 商家申请套餐交易
     * Summary: 数字商品服务-IP授权服务-申请套餐交易
     */
    public ApplyIpPackagetradeResponse applyIpPackagetrade(ApplyIpPackagetradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyIpPackagetradeEx(request, headers, runtime);
    }

    /**
     * Description: 商家申请套餐交易
     * Summary: 数字商品服务-IP授权服务-申请套餐交易
     */
    public ApplyIpPackagetradeResponse applyIpPackagetradeEx(ApplyIpPackagetradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.packagetrade.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyIpPackagetradeResponse());
    }

    /**
     * Description: 版权方申请授权交易
     * Summary: 数字商品服务-IP授权服务-申请授权交易
     */
    public ApplyIpAuthtradeResponse applyIpAuthtrade(ApplyIpAuthtradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyIpAuthtradeEx(request, headers, runtime);
    }

    /**
     * Description: 版权方申请授权交易
     * Summary: 数字商品服务-IP授权服务-申请授权交易
     */
    public ApplyIpAuthtradeResponse applyIpAuthtradeEx(ApplyIpAuthtradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.authtrade.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyIpAuthtradeResponse());
    }

    /**
     * Description: 查询数字凭证的配置信息
     * Summary: 数字商品服务-IP服务-UNI码配置查询
     */
    public QueryIpCodeinfoResponse queryIpCodeinfo(QueryIpCodeinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpCodeinfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询数字凭证的配置信息
     * Summary: 数字商品服务-IP服务-UNI码配置查询
     */
    public QueryIpCodeinfoResponse queryIpCodeinfoEx(QueryIpCodeinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.codeinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpCodeinfoResponse());
    }

    /**
     * Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
     * Summary: ip审批信息批量查询（带上更新信息）
     */
    public BatchqueryIpApprovalwithupdateResponse batchqueryIpApprovalwithupdate(BatchqueryIpApprovalwithupdateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryIpApprovalwithupdateEx(request, headers, runtime);
    }

    /**
     * Description: ip审批信息批量查询（带上更新信息，供天猫测使用）
     * Summary: ip审批信息批量查询（带上更新信息）
     */
    public BatchqueryIpApprovalwithupdateResponse batchqueryIpApprovalwithupdateEx(BatchqueryIpApprovalwithupdateRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.approvalwithupdate.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryIpApprovalwithupdateResponse());
    }

    /**
     * Description: 数字商品-IP授权交易服务-商家账户信息补充，版权方联系人修改，仅支持版权方联系人修改
     * Summary: 数字商品服务-IP授权服务-账户信息补充
     */
    public UpdateIpAccountResponse updateIpAccount(UpdateIpAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权交易服务-商家账户信息补充，版权方联系人修改，仅支持版权方联系人修改
     * Summary: 数字商品服务-IP授权服务-账户信息补充
     */
    public UpdateIpAccountResponse updateIpAccountEx(UpdateIpAccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.account.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIpAccountResponse());
    }

    /**
     * Description: 数字商品服务-IP-查询账户已经入驻的渠道列表
     * Summary: 数字商品服务-IP-查询账户渠道列表
     */
    public QueryIpAccountsettlementResponse queryIpAccountsettlement(QueryIpAccountsettlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpAccountsettlementEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP-查询账户已经入驻的渠道列表
     * Summary: 数字商品服务-IP-查询账户渠道列表
     */
    public QueryIpAccountsettlementResponse queryIpAccountsettlementEx(QueryIpAccountsettlementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.accountsettlement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpAccountsettlementResponse());
    }

    /**
     * Description: 数字商品-IP授权服务-版权方用户申请开通新渠道
     * Summary: 数字商品-IP授权服务-申请开通新渠道
     */
    public AddIpAccountsettlementResponse addIpAccountsettlement(AddIpAccountsettlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addIpAccountsettlementEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权服务-版权方用户申请开通新渠道
     * Summary: 数字商品-IP授权服务-申请开通新渠道
     */
    public AddIpAccountsettlementResponse addIpAccountsettlementEx(AddIpAccountsettlementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.accountsettlement.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddIpAccountsettlementResponse());
    }

    /**
     * Description: 签署交易订单的区块链合同
     * Summary: 数字商品服务-IP授权服务-签署订单合同
     */
    public SignIpOrdercontractResponse signIpOrdercontract(SignIpOrdercontractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signIpOrdercontractEx(request, headers, runtime);
    }

    /**
     * Description: 签署交易订单的区块链合同
     * Summary: 数字商品服务-IP授权服务-签署订单合同
     */
    public SignIpOrdercontractResponse signIpOrdercontractEx(SignIpOrdercontractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.ordercontract.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignIpOrdercontractResponse());
    }

    /**
     * Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
     * Summary: 数字商品服务-IP授权服务-绑定商品ID
     */
    public SetIpOrdergoodsidsResponse setIpOrdergoodsids(SetIpOrdergoodsidsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setIpOrdergoodsidsEx(request, headers, runtime);
    }

    /**
     * Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
     * Summary: 数字商品服务-IP授权服务-绑定商品ID
     */
    public SetIpOrdergoodsidsResponse setIpOrdergoodsidsEx(SetIpOrdergoodsidsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.ordergoodsids.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetIpOrdergoodsidsResponse());
    }

    /**
     * Description: 分页查询商户和订单的T+1日销售数据汇总数据
     * Summary: 数字商品服务-IP授权服务-查日销售数据
     */
    public PagequeryIpSalesbydayResponse pagequeryIpSalesbyday(PagequeryIpSalesbydayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpSalesbydayEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询商户和订单的T+1日销售数据汇总数据
     * Summary: 数字商品服务-IP授权服务-查日销售数据
     */
    public PagequeryIpSalesbydayResponse pagequeryIpSalesbydayEx(PagequeryIpSalesbydayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.salesbyday.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpSalesbydayResponse());
    }

    /**
     * Description: 联动雀凿，为文件生成区块链证书，实现文件的版权保护
     * Summary: 数字商品服务-IP授权服务-文件版权保护
     */
    public CreateIpCopyrightResponse createIpCopyright(CreateIpCopyrightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIpCopyrightEx(request, headers, runtime);
    }

    /**
     * Description: 联动雀凿，为文件生成区块链证书，实现文件的版权保护
     * Summary: 数字商品服务-IP授权服务-文件版权保护
     */
    public CreateIpCopyrightResponse createIpCopyrightEx(CreateIpCopyrightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.copyright.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIpCopyrightResponse());
    }

    /**
     * Description: 数字商品-IP授权服务-文件版权状态查询
     * Summary: 数字商品-IP授权服务-文件版权状态查询
     */
    public QueryIpCopyrightResponse queryIpCopyright(QueryIpCopyrightRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpCopyrightEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权服务-文件版权状态查询
     * Summary: 数字商品-IP授权服务-文件版权状态查询
     */
    public QueryIpCopyrightResponse queryIpCopyrightEx(QueryIpCopyrightRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.copyright.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpCopyrightResponse());
    }

    /**
     * Description: 编辑订单备注
     * Summary: 数字商品服务-IP授权服务-编辑订单备注
     */
    public SetIpOrdermemoResponse setIpOrdermemo(SetIpOrdermemoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setIpOrdermemoEx(request, headers, runtime);
    }

    /**
     * Description: 编辑订单备注
     * Summary: 数字商品服务-IP授权服务-编辑订单备注
     */
    public SetIpOrdermemoResponse setIpOrdermemoEx(SetIpOrdermemoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.ordermemo.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetIpOrdermemoResponse());
    }

    /**
     * Description: 数字商品服务-IP-确认开通版权方渠道
     * Summary: 数字商品服务-IP-开通版权方渠道
     */
    public ConfirmIpAccountsettlementResponse confirmIpAccountsettlement(ConfirmIpAccountsettlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpAccountsettlementEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP-确认开通版权方渠道
     * Summary: 数字商品服务-IP-开通版权方渠道
     */
    public ConfirmIpAccountsettlementResponse confirmIpAccountsettlementEx(ConfirmIpAccountsettlementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.accountsettlement.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpAccountsettlementResponse());
    }

    /**
     * Description: 分页查询订单的销售数据详情列表
     * Summary: 数字商品服务-IP授权服务-查询销售数据
     */
    public PagequeryIpSalesResponse pagequeryIpSales(PagequeryIpSalesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpSalesEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询订单的销售数据详情列表
     * Summary: 数字商品服务-IP授权服务-查询销售数据
     */
    public PagequeryIpSalesResponse pagequeryIpSalesEx(PagequeryIpSalesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.sales.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpSalesResponse());
    }

    /**
     * Description: 数字商品-IP授权服务-查询申请入驻该渠道的所有版权方列表
     * Summary: 数字商品-IP授权服务-查询版权方列表
     */
    public BatchqueryIpAccountsettlementResponse batchqueryIpAccountsettlement(BatchqueryIpAccountsettlementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryIpAccountsettlementEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品-IP授权服务-查询申请入驻该渠道的所有版权方列表
     * Summary: 数字商品-IP授权服务-查询版权方列表
     */
    public BatchqueryIpAccountsettlementResponse batchqueryIpAccountsettlementEx(BatchqueryIpAccountsettlementRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.accountsettlement.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryIpAccountsettlementResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-可跳转小程序的数字凭证分页查询: 小程序可扫描的数字凭证分页查询。
     * Summary: 数字商品服务-IP服务-UNI码查询
     */
    public PullIpCodeResponse pullIpCode(PullIpCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullIpCodeEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-可跳转小程序的数字凭证分页查询: 小程序可扫描的数字凭证分页查询。
     * Summary: 数字商品服务-IP服务-UNI码查询
     */
    public PullIpCodeResponse pullIpCodeEx(PullIpCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.code.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullIpCodeResponse());
    }

    /**
     * Description: 数字商品服务-IP-猜你喜欢的商品
     * Summary: 数字商品服务-IP-查询用户感兴趣的商品
     */
    public BatchqueryIpGoodsinterestResponse batchqueryIpGoodsinterest(BatchqueryIpGoodsinterestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryIpGoodsinterestEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP-猜你喜欢的商品
     * Summary: 数字商品服务-IP-查询用户感兴趣的商品
     */
    public BatchqueryIpGoodsinterestResponse batchqueryIpGoodsinterestEx(BatchqueryIpGoodsinterestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.goodsinterest.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryIpGoodsinterestResponse());
    }

    /**
     * Description: 查询区块链合同账号信息
     * Summary: 数字商品服务-IP授权服务-合同账户查询
     */
    public QueryIpTwcaccountResponse queryIpTwcaccount(QueryIpTwcaccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpTwcaccountEx(request, headers, runtime);
    }

    /**
     * Description: 查询区块链合同账号信息
     * Summary: 数字商品服务-IP授权服务-合同账户查询
     */
    public QueryIpTwcaccountResponse queryIpTwcaccountEx(QueryIpTwcaccountRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.twcaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpTwcaccountResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-授权URI: 获取授权URI, 用于淘宝店铺授权数据给IPforce
     * Summary: 数字商品服务-IP授权服务-授权URI
     */
    public BindIpShopResponse bindIpShop(BindIpShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindIpShopEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-授权URI: 获取授权URI, 用于淘宝店铺授权数据给IPforce
     * Summary: 数字商品服务-IP授权服务-授权URI
     */
    public BindIpShopResponse bindIpShopEx(BindIpShopRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.shop.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindIpShopResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-店铺授权结果: 店铺登陆淘宝授权后的授权结果回调
     * Summary: 数字商品服务-IP授权服务-店铺授权结果
     */
    public AuthIpShopResponse authIpShop(AuthIpShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authIpShopEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-店铺授权结果: 店铺登陆淘宝授权后的授权结果回调
     * Summary: 数字商品服务-IP授权服务-店铺授权结果
     */
    public AuthIpShopResponse authIpShopEx(AuthIpShopRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.shop.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthIpShopResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-商户授权列表: 商户获取其店铺授权历史列表
     * Summary: 数字商品服务-IP授权服务-商户授权列表
     */
    public ListIpShopResponse listIpShop(ListIpShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIpShopEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-商户授权列表: 商户获取其店铺授权历史列表
     * Summary: 数字商品服务-IP授权服务-商户授权列表
     */
    public ListIpShopResponse listIpShopEx(ListIpShopRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.shop.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIpShopResponse());
    }

    /**
     * Description: 查询数字凭证收藏证书详情，主要包括该数字凭证对应的ip商品，流转信息，区块信息等
     * Summary: 数字商品服务-IP服务-查UNI收藏证书
     */
    public QueryIpCodecollectResponse queryIpCodecollect(QueryIpCodecollectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpCodecollectEx(request, headers, runtime);
    }

    /**
     * Description: 查询数字凭证收藏证书详情，主要包括该数字凭证对应的ip商品，流转信息，区块信息等
     * Summary: 数字商品服务-IP服务-查UNI收藏证书
     */
    public QueryIpCodecollectResponse queryIpCodecollectEx(QueryIpCodecollectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.codecollect.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpCodecollectResponse());
    }

    /**
     * Description: 数字商品服务-IP授权服务-商品查询: 查询单个商品信息(淘宝开放平台数据)
     * Summary: 数字商品服务-IP授权服务-商品查询
     */
    public GetIpShopResponse getIpShop(GetIpShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIpShopEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP授权服务-商品查询: 查询单个商品信息(淘宝开放平台数据)
     * Summary: 数字商品服务-IP授权服务-商品查询
     */
    public GetIpShopResponse getIpShopEx(GetIpShopRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.shop.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetIpShopResponse());
    }

    /**
     * Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
     * Summary: 数字商品服务-IP授权服务-绑定商品ID
     */
    public SetIpOrdergoodsidResponse setIpOrdergoodsid(SetIpOrdergoodsidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setIpOrdergoodsidEx(request, headers, runtime);
    }

    /**
     * Description: 授权订单绑定商品ID，后续上传的销售数据需满足已绑定的商品ID
     * Summary: 数字商品服务-IP授权服务-绑定商品ID
     */
    public SetIpOrdergoodsidResponse setIpOrdergoodsidEx(SetIpOrdergoodsidRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.ordergoodsid.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetIpOrdergoodsidResponse());
    }

    /**
     * Description: 商家校正授权订单的销售数据
     * Summary: 数字商品服务-IP授权服务-校正销售数据
     */
    public SetIpSalescorrectionResponse setIpSalescorrection(SetIpSalescorrectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setIpSalescorrectionEx(request, headers, runtime);
    }

    /**
     * Description: 商家校正授权订单的销售数据
     * Summary: 数字商品服务-IP授权服务-校正销售数据
     */
    public SetIpSalescorrectionResponse setIpSalescorrectionEx(SetIpSalescorrectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.salescorrection.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetIpSalescorrectionResponse());
    }

    /**
     * Description: 商户确认销售数据。版权方确认或者拒绝销售数据
     * Summary: 数字商品服务-IP授权服务-确认销售数据
     */
    public ConfirmIpSalessummaryResponse confirmIpSalessummary(ConfirmIpSalessummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpSalessummaryEx(request, headers, runtime);
    }

    /**
     * Description: 商户确认销售数据。版权方确认或者拒绝销售数据
     * Summary: 数字商品服务-IP授权服务-确认销售数据
     */
    public ConfirmIpSalessummaryResponse confirmIpSalessummaryEx(ConfirmIpSalessummaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.salessummary.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpSalessummaryResponse());
    }

    /**
     * Description: 上传授权订单的逐条销售数据
     * Summary: 数字商品服务-IP授权服务-销售数据上传
     */
    public UploadIpSaleseverylistResponse uploadIpSaleseverylist(UploadIpSaleseverylistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadIpSaleseverylistEx(request, headers, runtime);
    }

    /**
     * Description: 上传授权订单的逐条销售数据
     * Summary: 数字商品服务-IP授权服务-销售数据上传
     */
    public UploadIpSaleseverylistResponse uploadIpSaleseverylistEx(UploadIpSaleseverylistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.saleseverylist.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadIpSaleseverylistResponse());
    }

    /**
     * Description: 查询订单或者账单的销售数据汇总信息列表
     * Summary: 数字商品服务-IP授权服务-查询销售数据
     */
    public PagequeryIpSalessummaryResponse pagequeryIpSalessummary(PagequeryIpSalessummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpSalessummaryEx(request, headers, runtime);
    }

    /**
     * Description: 查询订单或者账单的销售数据汇总信息列表
     * Summary: 数字商品服务-IP授权服务-查询销售数据
     */
    public PagequeryIpSalessummaryResponse pagequeryIpSalessummaryEx(PagequeryIpSalessummaryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.salessummary.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpSalessummaryResponse());
    }

    /**
     * Description: 账单超时关闭的情况下，重新生成支付链接，变为待支付状态
     * Summary: 数字商品服务-IP授权服务-刷新账单状态
     */
    public ReopenIpBillResponse reopenIpBill(ReopenIpBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reopenIpBillEx(request, headers, runtime);
    }

    /**
     * Description: 账单超时关闭的情况下，重新生成支付链接，变为待支付状态
     * Summary: 数字商品服务-IP授权服务-刷新账单状态
     */
    public ReopenIpBillResponse reopenIpBillEx(ReopenIpBillRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.bill.reopen", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReopenIpBillResponse());
    }

    /**
     * Description: 下单问询，商家申请合作授权
     * Summary: 数字商品服务-IP授权服务-授权交易问询
     */
    public InitIpAuthtradeResponse initIpAuthtrade(InitIpAuthtradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIpAuthtradeEx(request, headers, runtime);
    }

    /**
     * Description: 下单问询，商家申请合作授权
     * Summary: 数字商品服务-IP授权服务-授权交易问询
     */
    public InitIpAuthtradeResponse initIpAuthtradeEx(InitIpAuthtradeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.authtrade.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIpAuthtradeResponse());
    }

    /**
     * Description: 查询订单历史信息
     * Summary: 数字商品服务-IP授权服务-查询订单历史
     */
    public QueryIpOrderhistoryResponse queryIpOrderhistory(QueryIpOrderhistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIpOrderhistoryEx(request, headers, runtime);
    }

    /**
     * Description: 查询订单历史信息
     * Summary: 数字商品服务-IP授权服务-查询订单历史
     */
    public QueryIpOrderhistoryResponse queryIpOrderhistoryEx(QueryIpOrderhistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.orderhistory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIpOrderhistoryResponse());
    }

    /**
     * Description: 版权方确认线下回款，生成版权方需要支付的手续费账单和支付链接
     * Summary: 数字商品服务-IP授权服务-确认线下回款
     */
    public ConfirmIpBillpayResponse confirmIpBillpay(ConfirmIpBillpayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmIpBillpayEx(request, headers, runtime);
    }

    /**
     * Description: 版权方确认线下回款，生成版权方需要支付的手续费账单和支付链接
     * Summary: 数字商品服务-IP授权服务-确认线下回款
     */
    public ConfirmIpBillpayResponse confirmIpBillpayEx(ConfirmIpBillpayRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.billpay.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmIpBillpayResponse());
    }

    /**
     * Description: 数字商品服务-IP服务-UNI码失效: 将UNI码失效,不可逆。
     * Summary: 数字商品服务-IP服务-UNI码失效
     */
    public DisableIpCodeResponse disableIpCode(DisableIpCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableIpCodeEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP服务-UNI码失效: 将UNI码失效,不可逆。
     * Summary: 数字商品服务-IP服务-UNI码失效
     */
    public DisableIpCodeResponse disableIpCodeEx(DisableIpCodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.code.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableIpCodeResponse());
    }

    /**
     * Description: 上传数字凭证的流转信息
     * Summary: 数字商品服务-IP服务-上传UNI流转
     */
    public UploadIpCodecirculationResponse uploadIpCodecirculation(UploadIpCodecirculationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadIpCodecirculationEx(request, headers, runtime);
    }

    /**
     * Description: 上传数字凭证的流转信息
     * Summary: 数字商品服务-IP服务-上传UNI流转
     */
    public UploadIpCodecirculationResponse uploadIpCodecirculationEx(UploadIpCodecirculationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.codecirculation.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadIpCodecirculationResponse());
    }

    /**
     * Description: 分页查询数字凭证的流转信息
     * Summary: 数字商品服务-IP服务-查询UNI流转
     */
    public PagequeryIpCodecirculationResponse pagequeryIpCodecirculation(PagequeryIpCodecirculationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIpCodecirculationEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询数字凭证的流转信息
     * Summary: 数字商品服务-IP服务-查询UNI流转
     */
    public PagequeryIpCodecirculationResponse pagequeryIpCodecirculationEx(PagequeryIpCodecirculationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.codecirculation.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIpCodecirculationResponse());
    }

    /**
     * Description: 签署区块链合同, 平台入驻协议、单方协议、三方和大于三方的协议均可签署。
     * Summary: 数字商品服务-IP授权服务-签署合同
     */
    public SignIpContractResponse signIpContract(SignIpContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signIpContractEx(request, headers, runtime);
    }

    /**
     * Description: 签署区块链合同, 平台入驻协议、单方协议、三方和大于三方的协议均可签署。
     * Summary: 数字商品服务-IP授权服务-签署合同
     */
    public SignIpContractResponse signIpContractEx(SignIpContractRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.contract.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignIpContractResponse());
    }

    /**
     * Description: 数字商品服务-IP服务-UNI码核验清空
     * Summary: 数字商品服务-IP服务-UNI码核验清空
     */
    public ReinitIpCheckResponse reinitIpCheck(ReinitIpCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reinitIpCheckEx(request, headers, runtime);
    }

    /**
     * Description: 数字商品服务-IP服务-UNI码核验清空
     * Summary: 数字商品服务-IP服务-UNI码核验清空
     */
    public ReinitIpCheckResponse reinitIpCheckEx(ReinitIpCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.ip.check.reinit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReinitIpCheckResponse());
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     */
    public QueryBlockanalysisBlockResponse queryBlockanalysisBlock(QueryBlockanalysisBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisBlockEx(request, headers, runtime);
    }

    /**
     * Description: 获取特定高度的区块信息
     * Summary: 数字商品服务-拉块服务-获取区块信息
     */
    public QueryBlockanalysisBlockResponse queryBlockanalysisBlockEx(QueryBlockanalysisBlockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.block.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisBlockResponse());
    }

    /**
     * Description: 获取最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     */
    public QueryBlockanalysisLastblocknumberResponse queryBlockanalysisLastblocknumber(QueryBlockanalysisLastblocknumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisLastblocknumberEx(request, headers, runtime);
    }

    /**
     * Description: 获取最新区块高度
     * Summary: 数字商品服务-拉块服务-获取最新区块高度
     */
    public QueryBlockanalysisLastblocknumberResponse queryBlockanalysisLastblocknumberEx(QueryBlockanalysisLastblocknumberRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.lastblocknumber.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisLastblocknumberResponse());
    }

    /**
     * Description: 获取公开的或者已授权的权益商品信息
     * Summary: 数字商品服务-拉块服务-获取已授权商品
     */
    public QueryBlockanalysisOpenedequitiesResponse queryBlockanalysisOpenedequities(QueryBlockanalysisOpenedequitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisOpenedequitiesEx(request, headers, runtime);
    }

    /**
     * Description: 获取公开的或者已授权的权益商品信息
     * Summary: 数字商品服务-拉块服务-获取已授权商品
     */
    public QueryBlockanalysisOpenedequitiesResponse queryBlockanalysisOpenedequitiesEx(QueryBlockanalysisOpenedequitiesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.openedequities.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisOpenedequitiesResponse());
    }

    /**
     * Description: 查询已设置过用户价格的有效权益商品信息
     * Summary: 数字商品服务-拉块服务-已设用户价格商品
     */
    public QueryBlockanalysisUserpriceupdatedequitiesResponse queryBlockanalysisUserpriceupdatedequities(QueryBlockanalysisUserpriceupdatedequitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisUserpriceupdatedequitiesEx(request, headers, runtime);
    }

    /**
     * Description: 查询已设置过用户价格的有效权益商品信息
     * Summary: 数字商品服务-拉块服务-已设用户价格商品
     */
    public QueryBlockanalysisUserpriceupdatedequitiesResponse queryBlockanalysisUserpriceupdatedequitiesEx(QueryBlockanalysisUserpriceupdatedequitiesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.userpriceupdatedequities.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisUserpriceupdatedequitiesResponse());
    }

    /**
     * Description: 查询商户的可提现资产价值(单位:分)
     * Summary: 数字商品服务-拉块服务-查询可提现资产
     */
    public QueryBlockanalysisUnwriteoffvalueResponse queryBlockanalysisUnwriteoffvalue(QueryBlockanalysisUnwriteoffvalueRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisUnwriteoffvalueEx(request, headers, runtime);
    }

    /**
     * Description: 查询商户的可提现资产价值(单位:分)
     * Summary: 数字商品服务-拉块服务-查询可提现资产
     */
    public QueryBlockanalysisUnwriteoffvalueResponse queryBlockanalysisUnwriteoffvalueEx(QueryBlockanalysisUnwriteoffvalueRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.unwriteoffvalue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisUnwriteoffvalueResponse());
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-拉块服务-设置代理权限
     */
    public UpdateBlockanalysisDelegaterelationResponse updateBlockanalysisDelegaterelation(UpdateBlockanalysisDelegaterelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlockanalysisDelegaterelationEx(request, headers, runtime);
    }

    /**
     * Description: 设置租户的授权代理权限。赋予 opt_tenant_id 代理 delegated_tenant_id 调用接口的权限，见可代理的接口详情单。
     * Summary: 数字商品服务-拉块服务-设置代理权限
     */
    public UpdateBlockanalysisDelegaterelationResponse updateBlockanalysisDelegaterelationEx(UpdateBlockanalysisDelegaterelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBlockanalysisDelegaterelationResponse());
    }

    /**
     * Description: 设置接口访问白名单。
     * Summary: 数字商品服务-拉块服务-设置访问白名单
     */
    public UpdateBlockanalysisWhitelistResponse updateBlockanalysisWhitelist(UpdateBlockanalysisWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlockanalysisWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: 设置接口访问白名单。
     * Summary: 数字商品服务-拉块服务-设置访问白名单
     */
    public UpdateBlockanalysisWhitelistResponse updateBlockanalysisWhitelistEx(UpdateBlockanalysisWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.whitelist.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBlockanalysisWhitelistResponse());
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-拉块服务-代理权限查询
     */
    public QueryBlockanalysisDelegaterelationResponse queryBlockanalysisDelegaterelation(QueryBlockanalysisDelegaterelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisDelegaterelationEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户的授权代理权限
     * Summary: 数字商品服务-拉块服务-代理权限查询
     */
    public QueryBlockanalysisDelegaterelationResponse queryBlockanalysisDelegaterelationEx(QueryBlockanalysisDelegaterelationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.delegaterelation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisDelegaterelationResponse());
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     */
    public QueryBlockanalysisWhitelistResponse queryBlockanalysisWhitelist(QueryBlockanalysisWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisWhitelistEx(request, headers, runtime);
    }

    /**
     * Description: 查询接口访问白名单信息
     * Summary: 数字商品服务-拉块服务-查询接口白名单
     */
    public QueryBlockanalysisWhitelistResponse queryBlockanalysisWhitelistEx(QueryBlockanalysisWhitelistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.whitelist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisWhitelistResponse());
    }

    /**
     * Description: 根据交易hash获取交易信息
     * Summary: 数字商品服务-拉块服务-获取交易信息
     */
    public QueryBlockanalysisTransactionResponse queryBlockanalysisTransaction(QueryBlockanalysisTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisTransactionEx(request, headers, runtime);
    }

    /**
     * Description: 根据交易hash获取交易信息
     * Summary: 数字商品服务-拉块服务-获取交易信息
     */
    public QueryBlockanalysisTransactionResponse queryBlockanalysisTransactionEx(QueryBlockanalysisTransactionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.transaction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisTransactionResponse());
    }

    /**
     * Description: 获取商品的授权信息列表(一客一价信息)
     * Summary: 数字商品服务-拉块服务-获取商品授权信息
     */
    public QueryBlockanalysisEquityauthlistResponse queryBlockanalysisEquityauthlist(QueryBlockanalysisEquityauthlistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisEquityauthlistEx(request, headers, runtime);
    }

    /**
     * Description: 获取商品的授权信息列表(一客一价信息)
     * Summary: 数字商品服务-拉块服务-获取商品授权信息
     */
    public QueryBlockanalysisEquityauthlistResponse queryBlockanalysisEquityauthlistEx(QueryBlockanalysisEquityauthlistRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.equityauthlist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisEquityauthlistResponse());
    }

    /**
     * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
     * Summary: 数字商品服务-拉块服务-获取下个相关区块
     */
    public QueryBlockanalysisNextblockResponse queryBlockanalysisNextblock(QueryBlockanalysisNextblockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockanalysisNextblockEx(request, headers, runtime);
    }

    /**
     * Description: 获取下一个与用户有关联交易的区块。需要传入超时时间，如果已到超时时间，则返回当前过滤的最高区块信息。
     * Summary: 数字商品服务-拉块服务-获取下个相关区块
     */
    public QueryBlockanalysisNextblockResponse queryBlockanalysisNextblockEx(QueryBlockanalysisNextblockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.blockanalysis.nextblock.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockanalysisNextblockResponse());
    }

    /**
     * Description: 可订购的SKU列表查询
     * Summary: 数字商品服务-商品服务-商品列表查询
     */
    public QueryMypointsSkuResponse queryMypointsSku(QueryMypointsSkuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMypointsSkuEx(request, headers, runtime);
    }

    /**
     * Description: 可订购的SKU列表查询
     * Summary: 数字商品服务-商品服务-商品列表查询
     */
    public QueryMypointsSkuResponse queryMypointsSkuEx(QueryMypointsSkuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.mypoints.sku.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMypointsSkuResponse());
    }

    /**
     * Description: 查询商户的积分库和预算库
     * Summary: 数字商品服务-商品服务-积分预算库查询
     */
    public QueryMypointsMerchantbalanceResponse queryMypointsMerchantbalance(QueryMypointsMerchantbalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMypointsMerchantbalanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询商户的积分库和预算库
     * Summary: 数字商品服务-商品服务-积分预算库查询
     */
    public QueryMypointsMerchantbalanceResponse queryMypointsMerchantbalanceEx(QueryMypointsMerchantbalanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.mypoints.merchantbalance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMypointsMerchantbalanceResponse());
    }

    /**
     * Description: 预下单商品
     * Summary: 数字商品服务-商品服务-商品预下单
     */
    public ExecMypointsPreorderskuResponse execMypointsPreordersku(ExecMypointsPreorderskuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execMypointsPreorderskuEx(request, headers, runtime);
    }

    /**
     * Description: 预下单商品
     * Summary: 数字商品服务-商品服务-商品预下单
     */
    public ExecMypointsPreorderskuResponse execMypointsPreorderskuEx(ExecMypointsPreorderskuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.mypoints.preordersku.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecMypointsPreorderskuResponse());
    }

    /**
     * Description: 商品下单
     * Summary: 数字商品服务-商品服务-商品下单
     */
    public ExecMypointsOrderskuResponse execMypointsOrdersku(ExecMypointsOrderskuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execMypointsOrderskuEx(request, headers, runtime);
    }

    /**
     * Description: 商品下单
     * Summary: 数字商品服务-商品服务-商品下单
     */
    public ExecMypointsOrderskuResponse execMypointsOrderskuEx(ExecMypointsOrderskuRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.mypoints.ordersku.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecMypointsOrderskuResponse());
    }

    /**
     * Description: 根据商品ID，查询批量购买的费率
     * Summary: 数字商品服务-商品服务-商品费率查询
     */
    public QueryMypointsSkufeeResponse queryMypointsSkufee(QueryMypointsSkufeeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMypointsSkufeeEx(request, headers, runtime);
    }

    /**
     * Description: 根据商品ID，查询批量购买的费率
     * Summary: 数字商品服务-商品服务-商品费率查询
     */
    public QueryMypointsSkufeeResponse queryMypointsSkufeeEx(QueryMypointsSkufeeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.mypoints.skufee.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMypointsSkufeeResponse());
    }

    /**
     * Description: 查询集分宝SKU的预下单流水记录
     * Summary: 数字商品服务-商品服务-预下单流水查询
     */
    public QueryMypointsPreorderinstructionResponse queryMypointsPreorderinstruction(QueryMypointsPreorderinstructionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMypointsPreorderinstructionEx(request, headers, runtime);
    }

    /**
     * Description: 查询集分宝SKU的预下单流水记录
     * Summary: 数字商品服务-商品服务-预下单流水查询
     */
    public QueryMypointsPreorderinstructionResponse queryMypointsPreorderinstructionEx(QueryMypointsPreorderinstructionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.mypoints.preorderinstruction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMypointsPreorderinstructionResponse());
    }

    /**
     * Description: 查询下单流水信息
     * Summary: 数字商品服务-商品服务-商品下单流水查询
     */
    public QueryMypointsOrderinstructionResponse queryMypointsOrderinstruction(QueryMypointsOrderinstructionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMypointsOrderinstructionEx(request, headers, runtime);
    }

    /**
     * Description: 查询下单流水信息
     * Summary: 数字商品服务-商品服务-商品下单流水查询
     */
    public QueryMypointsOrderinstructionResponse queryMypointsOrderinstructionEx(QueryMypointsOrderinstructionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "baas.antdao.mypoints.orderinstruction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMypointsOrderinstructionResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
