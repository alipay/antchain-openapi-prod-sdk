// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.ak_dc040d759c7a442f89b4b6590b1e39a0.models.*;
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
                    new TeaPair("sdk_version", "1.0.0"),
                    new TeaPair("_prod_code", "ak_dc040d759c7a442f89b4b6590b1e39a0"),
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
     * Description: IoT设备平台-设备上链
     * Summary: IoT设备平台-设备上链
     */
    public OperateBlockchainBotIotbasicDevicecollectResponse operateBlockchainBotIotbasicDevicecollect(OperateBlockchainBotIotbasicDevicecollectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateBlockchainBotIotbasicDevicecollectEx(request, headers, runtime);
    }

    /**
     * Description: IoT设备平台-设备上链
     * Summary: IoT设备平台-设备上链
     */
    public OperateBlockchainBotIotbasicDevicecollectResponse operateBlockchainBotIotbasicDevicecollectEx(OperateBlockchainBotIotbasicDevicecollectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.devicecollect.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateBlockchainBotIotbasicDevicecollectResponse());
    }

    /**
     * Description: IoT设备平台-批量数据上链
     * Summary: IoT设备平台-批量数据上链
     */
    public OperateBlockchainBotIotbasicBatchcollectResponse operateBlockchainBotIotbasicBatchcollect(OperateBlockchainBotIotbasicBatchcollectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateBlockchainBotIotbasicBatchcollectEx(request, headers, runtime);
    }

    /**
     * Description: IoT设备平台-批量数据上链
     * Summary: IoT设备平台-批量数据上链
     */
    public OperateBlockchainBotIotbasicBatchcollectResponse operateBlockchainBotIotbasicBatchcollectEx(OperateBlockchainBotIotbasicBatchcollectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.batchcollect.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateBlockchainBotIotbasicBatchcollectResponse());
    }

    /**
     * Description: 上链数据分页查询
     * Summary: 上链数据分页查询
     */
    public QueryBlockchainBotIotbasicDevicecollectResponse queryBlockchainBotIotbasicDevicecollect(QueryBlockchainBotIotbasicDevicecollectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotIotbasicDevicecollectEx(request, headers, runtime);
    }

    /**
     * Description: 上链数据分页查询
     * Summary: 上链数据分页查询
     */
    public QueryBlockchainBotIotbasicDevicecollectResponse queryBlockchainBotIotbasicDevicecollectEx(QueryBlockchainBotIotbasicDevicecollectRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.devicecollect.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotIotbasicDevicecollectResponse());
    }

    /**
     * Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机
     */
    public QueryAntsecuritytechGatewayEkytDriverResponse queryAntsecuritytechGatewayEkytDriver(QueryAntsecuritytechGatewayEkytDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntsecuritytechGatewayEkytDriverEx(request, headers, runtime);
    }

    /**
     * Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机
     */
    public QueryAntsecuritytechGatewayEkytDriverResponse queryAntsecuritytechGatewayEkytDriverEx(QueryAntsecuritytechGatewayEkytDriverRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntsecuritytechGatewayEkytDriverResponse());
    }

    /**
     * Description: 申请设备设备密钥
     * Summary: 申请设备设备密钥
     */
    public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse applyAntsecuritytechGatewayIifaaDevicekey(ApplyAntsecuritytechGatewayIifaaDevicekeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAntsecuritytechGatewayIifaaDevicekeyEx(request, headers, runtime);
    }

    /**
     * Description: 申请设备设备密钥
     * Summary: 申请设备设备密钥
     */
    public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse applyAntsecuritytechGatewayIifaaDevicekeyEx(ApplyAntsecuritytechGatewayIifaaDevicekeyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyAntsecuritytechGatewayIifaaDevicekeyResponse());
    }

    /**
     * Description: iotbasic-设备厂商创建物模型
     * Summary: iotbasic-设备厂商创建物模型
     */
    public CreateBlockchainBotDevicecorpThingmodelResponse createBlockchainBotDevicecorpThingmodel(CreateBlockchainBotDevicecorpThingmodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
    }

    /**
     * Description: iotbasic-设备厂商创建物模型
     * Summary: iotbasic-设备厂商创建物模型
     */
    public CreateBlockchainBotDevicecorpThingmodelResponse createBlockchainBotDevicecorpThingmodelEx(CreateBlockchainBotDevicecorpThingmodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlockchainBotDevicecorpThingmodelResponse());
    }

    /**
     * Description: iotbasic-设备厂商删除物模型
     * Summary: iotbasic-设备厂商删除物模型
     */
    public DeleteBlockchainBotDevicecorpThingmodelResponse deleteBlockchainBotDevicecorpThingmodel(DeleteBlockchainBotDevicecorpThingmodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
    }

    /**
     * Description: iotbasic-设备厂商删除物模型
     * Summary: iotbasic-设备厂商删除物模型
     */
    public DeleteBlockchainBotDevicecorpThingmodelResponse deleteBlockchainBotDevicecorpThingmodelEx(DeleteBlockchainBotDevicecorpThingmodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteBlockchainBotDevicecorpThingmodelResponse());
    }

    /**
     * Description: iotbasic-设备厂商发布物模型
     * Summary: iotbasic-设备厂商发布物模型
     */
    public PublishBlockchainBotDevicecorpThingmodelResponse publishBlockchainBotDevicecorpThingmodel(PublishBlockchainBotDevicecorpThingmodelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
    }

    /**
     * Description: iotbasic-设备厂商发布物模型
     * Summary: iotbasic-设备厂商发布物模型
     */
    public PublishBlockchainBotDevicecorpThingmodelResponse publishBlockchainBotDevicecorpThingmodelEx(PublishBlockchainBotDevicecorpThingmodelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishBlockchainBotDevicecorpThingmodelResponse());
    }

    /**
     * Description: 代扣签约链接获取
     * Summary: 代扣签约链接获取
     */
    public SignBlockchainBotDigitalkeyWithholdResponse signBlockchainBotDigitalkeyWithhold(SignBlockchainBotDigitalkeyWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.signBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约链接获取
     * Summary: 代扣签约链接获取
     */
    public SignBlockchainBotDigitalkeyWithholdResponse signBlockchainBotDigitalkeyWithholdEx(SignBlockchainBotDigitalkeyWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.sign", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SignBlockchainBotDigitalkeyWithholdResponse());
    }

    /**
     * Description: 代扣签约解除
     * Summary: 代扣签约解除
     */
    public UnbindBlockchainBotDigitalkeyWithholdResponse unbindBlockchainBotDigitalkeyWithhold(UnbindBlockchainBotDigitalkeyWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 代扣签约解除
     * Summary: 代扣签约解除
     */
    public UnbindBlockchainBotDigitalkeyWithholdResponse unbindBlockchainBotDigitalkeyWithholdEx(UnbindBlockchainBotDigitalkeyWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindBlockchainBotDigitalkeyWithholdResponse());
    }

    /**
     * Description: 代扣支付
     * Summary: 代扣支付
     */
    public PayBlockchainBotDigitalkeyWithholdResponse payBlockchainBotDigitalkeyWithhold(PayBlockchainBotDigitalkeyWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 代扣支付
     * Summary: 代扣支付
     */
    public PayBlockchainBotDigitalkeyWithholdResponse payBlockchainBotDigitalkeyWithholdEx(PayBlockchainBotDigitalkeyWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayBlockchainBotDigitalkeyWithholdResponse());
    }

    /**
     * Description: 代扣支付退款 
     * Summary: 代扣支付退款 
     */
    public RefuseBlockchainBotDigitalkeyWithholdResponse refuseBlockchainBotDigitalkeyWithhold(RefuseBlockchainBotDigitalkeyWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 代扣支付退款 
     * Summary: 代扣支付退款 
     */
    public RefuseBlockchainBotDigitalkeyWithholdResponse refuseBlockchainBotDigitalkeyWithholdEx(RefuseBlockchainBotDigitalkeyWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseBlockchainBotDigitalkeyWithholdResponse());
    }

    /**
     * Description: 代扣协议查询
     * Summary: 代扣协议查询
     */
    public QueryBlockchainBotDigitalkeyWithholdResponse queryBlockchainBotDigitalkeyWithhold(QueryBlockchainBotDigitalkeyWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 代扣协议查询
     * Summary: 代扣协议查询
     */
    public QueryBlockchainBotDigitalkeyWithholdResponse queryBlockchainBotDigitalkeyWithholdEx(QueryBlockchainBotDigitalkeyWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBlockchainBotDigitalkeyWithholdResponse());
    }

    /**
     * Description: 代扣撤销
     * Summary: 代扣撤销
     */
    public CancelBlockchainBotDigitalkeyWithholdResponse cancelBlockchainBotDigitalkeyWithhold(CancelBlockchainBotDigitalkeyWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 代扣撤销
     * Summary: 代扣撤销
     */
    public CancelBlockchainBotDigitalkeyWithholdResponse cancelBlockchainBotDigitalkeyWithholdEx(CancelBlockchainBotDigitalkeyWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBlockchainBotDigitalkeyWithholdResponse());
    }

    /**
     * Description: 代扣扣款前预通知
     * Summary: 代扣扣款前预通知
     */
    public NotifyBlockchainBotDigitalkeyWithholdResponse notifyBlockchainBotDigitalkeyWithhold(NotifyBlockchainBotDigitalkeyWithholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
    }

    /**
     * Description: 代扣扣款前预通知
     * Summary: 代扣扣款前预通知
     */
    public NotifyBlockchainBotDigitalkeyWithholdResponse notifyBlockchainBotDigitalkeyWithholdEx(NotifyBlockchainBotDigitalkeyWithholdRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyBlockchainBotDigitalkeyWithholdResponse());
    }
}
