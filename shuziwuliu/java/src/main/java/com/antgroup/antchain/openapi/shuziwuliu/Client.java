// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.shuziwuliu.models.*;

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
                    new TeaPair("sdk_version", "1.7.13"),
                    new TeaPair("_prod_code", "SHUZIWULIU"),
                    new TeaPair("_prod_channel", "undefined")
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
     * Description: 标准化应收账单
     * Summary: 标准化应收账单
     */
    public CreateReceivableBillResponse createReceivableBill(CreateReceivableBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createReceivableBillEx(request, headers, runtime);
    }

    /**
     * Description: 标准化应收账单
     * Summary: 标准化应收账单
     */
    public CreateReceivableBillResponse createReceivableBillEx(CreateReceivableBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.receivable.bill.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateReceivableBillResponse());
    }

    /**
     * Description: 创建凭证
     * Summary: 创建凭证
     */
    public CreateStandardVoucherResponse createStandardVoucher(CreateStandardVoucherRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStandardVoucherEx(request, headers, runtime);
    }

    /**
     * Description: 创建凭证
     * Summary: 创建凭证
     */
    public CreateStandardVoucherResponse createStandardVoucherEx(CreateStandardVoucherRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.standard.voucher.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStandardVoucherResponse());
    }

    /**
     * Description: 无车承运平台为自身申请DIS分布式数字身份
     * Summary: 无车承运平台DIS分布式数字身份申请
     */
    public CreatePlatformDidResponse createPlatformDid(CreatePlatformDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlatformDidEx(request, headers, runtime);
    }

    /**
     * Description: 无车承运平台为自身申请DIS分布式数字身份
     * Summary: 无车承运平台DIS分布式数字身份申请
     */
    public CreatePlatformDidResponse createPlatformDidEx(CreatePlatformDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.platform.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePlatformDidResponse());
    }

    /**
     * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
     * Summary: 无车承运平台DIS分布式数字身份代理申请
     */
    public CreateAgentDidResponse createAgentDid(CreateAgentDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAgentDidEx(request, headers, runtime);
    }

    /**
     * Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
     * Summary: 无车承运平台DIS分布式数字身份代理申请
     */
    public CreateAgentDidResponse createAgentDidEx(CreateAgentDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.agent.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAgentDidResponse());
    }

    /**
     * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 货主DIS分布式数字身份申请
     */
    public CreateConsignorDisResponse createConsignorDis(CreateConsignorDisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsignorDisEx(request, headers, runtime);
    }

    /**
     * Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 货主DIS分布式数字身份申请
     */
    public CreateConsignorDisResponse createConsignorDisEx(CreateConsignorDisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.consignor.dis.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsignorDisResponse());
    }

    /**
     * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 司机DIS分布式数字身份申请
     */
    public CreateDriverDisResponse createDriverDis(CreateDriverDisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDriverDisEx(request, headers, runtime);
    }

    /**
     * Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
     * Summary: 司机DIS分布式数字身份申请
     */
    public CreateDriverDisResponse createDriverDisEx(CreateDriverDisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.driver.dis.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDriverDisResponse());
    }

    /**
     * Description: 货源订单创建，货主发货给平台时的订单信息
     * Summary: 货源订单创建
     */
    public CreateCargoOrderResponse createCargoOrder(CreateCargoOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCargoOrderEx(request, headers, runtime);
    }

    /**
     * Description: 货源订单创建，货主发货给平台时的订单信息
     * Summary: 货源订单创建
     */
    public CreateCargoOrderResponse createCargoOrderEx(CreateCargoOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cargo.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCargoOrderResponse());
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建
     */
    public CreateCargoPayResponse createCargoPay(CreateCargoPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCargoPayEx(request, headers, runtime);
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建
     */
    public CreateCargoPayResponse createCargoPayEx(CreateCargoPayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cargo.pay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCargoPayResponse());
    }

    /**
     * Description: 物流平台将运单指派给下游（承运商、司机）时产生
     * Summary: 运单创建
     */
    public CreateWaybillOrderResponse createWaybillOrder(CreateWaybillOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWaybillOrderEx(request, headers, runtime);
    }

    /**
     * Description: 物流平台将运单指派给下游（承运商、司机）时产生
     * Summary: 运单创建
     */
    public CreateWaybillOrderResponse createWaybillOrderEx(CreateWaybillOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWaybillOrderResponse());
    }

    /**
     * Description: 创建物流支付订单，运单需已存在并且未结束
     * Summary: 运单支付订单创建
     */
    public CreateWaybillPayResponse createWaybillPay(CreateWaybillPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWaybillPayEx(request, headers, runtime);
    }

    /**
     * Description: 创建物流支付订单，运单需已存在并且未结束
     * Summary: 运单支付订单创建
     */
    public CreateWaybillPayResponse createWaybillPayEx(CreateWaybillPayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.pay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWaybillPayResponse());
    }

    /**
     * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
     * Summary: 第三方位置信息上报
     */
    public ImportWaybillLocationResponse importWaybillLocation(ImportWaybillLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importWaybillLocationEx(request, headers, runtime);
    }

    /**
     * Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
     * Summary: 第三方位置信息上报
     */
    public ImportWaybillLocationResponse importWaybillLocationEx(ImportWaybillLocationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.location.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportWaybillLocationResponse());
    }

    /**
     * Description: 发票订单创建
     * Summary: 发票订单创建
     */
    public CreateWaybillBillResponse createWaybillBill(CreateWaybillBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWaybillBillEx(request, headers, runtime);
    }

    /**
     * Description: 发票订单创建
     * Summary: 发票订单创建
     */
    public CreateWaybillBillResponse createWaybillBillEx(CreateWaybillBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.bill.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWaybillBillResponse());
    }

    /**
     * Description: 查询物流运单状态
     * Summary: 查询运单状态
     */
    public QueryWaybillStatusResponse queryWaybillStatus(QueryWaybillStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWaybillStatusEx(request, headers, runtime);
    }

    /**
     * Description: 查询物流运单状态
     * Summary: 查询运单状态
     */
    public QueryWaybillStatusResponse queryWaybillStatusEx(QueryWaybillStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWaybillStatusResponse());
    }

    /**
     * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
    完成后的运单无法再调用支付订单与轨迹位置上传接口。
     * Summary: 运单完成
     */
    public FinishWaybillOrderResponse finishWaybillOrder(FinishWaybillOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishWaybillOrderEx(request, headers, runtime);
    }

    /**
     * Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
    完成后的运单无法再调用支付订单与轨迹位置上传接口。
     * Summary: 运单完成
     */
    public FinishWaybillOrderResponse finishWaybillOrderEx(FinishWaybillOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.order.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishWaybillOrderResponse());
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建
     */
    public CreateCargoPayorderResponse createCargoPayorder(CreateCargoPayorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCargoPayorderEx(request, headers, runtime);
    }

    /**
     * Description: 货源支付订单创建,货源订单需存在。
     * Summary: 货源支付订单创建
     */
    public CreateCargoPayorderResponse createCargoPayorderEx(CreateCargoPayorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cargo.payorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCargoPayorderResponse());
    }

    /**
     * Description: 当货物到达目的地时，调用此接口
     * Summary: 运单运输完成
     */
    public SaveWaybillOrderResponse saveWaybillOrder(SaveWaybillOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveWaybillOrderEx(request, headers, runtime);
    }

    /**
     * Description: 当货物到达目的地时，调用此接口
     * Summary: 运单运输完成
     */
    public SaveWaybillOrderResponse saveWaybillOrderEx(SaveWaybillOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.order.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveWaybillOrderResponse());
    }

    /**
     * Description: 运单关闭
     * Summary: 运单关闭
     */
    public CloseWaybillOrderResponse closeWaybillOrder(CloseWaybillOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeWaybillOrderEx(request, headers, runtime);
    }

    /**
     * Description: 运单关闭
     * Summary: 运单关闭
     */
    public CloseWaybillOrderResponse closeWaybillOrderEx(CloseWaybillOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.order.close", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CloseWaybillOrderResponse());
    }

    /**
     * Description: 完成物流运单
     * Summary: 完成物流运单
     */
    public FinishFinanceWaybillResponse finishFinanceWaybill(FinishFinanceWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishFinanceWaybillEx(request, headers, runtime);
    }

    /**
     * Description: 完成物流运单
     * Summary: 完成物流运单
     */
    public FinishFinanceWaybillResponse finishFinanceWaybillEx(FinishFinanceWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.finance.waybill.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishFinanceWaybillResponse());
    }

    /**
     * Description: 运输完成
     * Summary: 运输完成
     */
    public FinishFinanceTransportResponse finishFinanceTransport(FinishFinanceTransportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishFinanceTransportEx(request, headers, runtime);
    }

    /**
     * Description: 运输完成
     * Summary: 运输完成
     */
    public FinishFinanceTransportResponse finishFinanceTransportEx(FinishFinanceTransportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.finance.transport.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishFinanceTransportResponse());
    }

    /**
     * Description: 对运单信息项需更新时调用
     * Summary: 更新运单
     */
    public UpdateFinanceWaybillResponse updateFinanceWaybill(UpdateFinanceWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFinanceWaybillEx(request, headers, runtime);
    }

    /**
     * Description: 对运单信息项需更新时调用
     * Summary: 更新运单
     */
    public UpdateFinanceWaybillResponse updateFinanceWaybillEx(UpdateFinanceWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.finance.waybill.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateFinanceWaybillResponse());
    }

    /**
     * Description: 当司机到达货主装货地后，调用此接口
     * Summary: 起运运单
     */
    public StartFinanceWaybillResponse startFinanceWaybill(StartFinanceWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startFinanceWaybillEx(request, headers, runtime);
    }

    /**
     * Description: 当司机到达货主装货地后，调用此接口
     * Summary: 起运运单
     */
    public StartFinanceWaybillResponse startFinanceWaybillEx(StartFinanceWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.finance.waybill.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartFinanceWaybillResponse());
    }

    /**
     * Description: 创建承运商账户
     * Summary: 创建承运商账户
     */
    public CreateCaptainDisResponse createCaptainDis(CreateCaptainDisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCaptainDisEx(request, headers, runtime);
    }

    /**
     * Description: 创建承运商账户
     * Summary: 创建承运商账户
     */
    public CreateCaptainDisResponse createCaptainDisEx(CreateCaptainDisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.captain.dis.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCaptainDisResponse());
    }

    /**
     * Description: 创建货主账单
     * Summary: 货主账单创建
     */
    public CreateCargowaybillBillResponse createCargowaybillBill(CreateCargowaybillBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCargowaybillBillEx(request, headers, runtime);
    }

    /**
     * Description: 创建货主账单
     * Summary: 货主账单创建
     */
    public CreateCargowaybillBillResponse createCargowaybillBillEx(CreateCargowaybillBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cargowaybill.bill.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCargowaybillBillResponse());
    }

    /**
     * Description: 确认货主账单
     * Summary: 货主账单确认
     */
    public ConfirmCargowaybillBillResponse confirmCargowaybillBill(ConfirmCargowaybillBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmCargowaybillBillEx(request, headers, runtime);
    }

    /**
     * Description: 确认货主账单
     * Summary: 货主账单确认
     */
    public ConfirmCargowaybillBillResponse confirmCargowaybillBillEx(ConfirmCargowaybillBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cargowaybill.bill.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmCargowaybillBillResponse());
    }

    /**
     * Description: 结算货主账单
     * Summary: 货主账单结算
     */
    public CreateCargowaybillBillsettleResponse createCargowaybillBillsettle(CreateCargowaybillBillsettleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCargowaybillBillsettleEx(request, headers, runtime);
    }

    /**
     * Description: 结算货主账单
     * Summary: 货主账单结算
     */
    public CreateCargowaybillBillsettleResponse createCargowaybillBillsettleEx(CreateCargowaybillBillsettleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cargowaybill.billsettle.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCargowaybillBillsettleResponse());
    }

    /**
     * Description: 运单平台did更新
     * Summary: 运单平台did更新
     */
    public UpdateWaybillorderPlatformdidResponse updateWaybillorderPlatformdid(UpdateWaybillorderPlatformdidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWaybillorderPlatformdidEx(request, headers, runtime);
    }

    /**
     * Description: 运单平台did更新
     * Summary: 运单平台did更新
     */
    public UpdateWaybillorderPlatformdidResponse updateWaybillorderPlatformdidEx(UpdateWaybillorderPlatformdidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybillorder.platformdid.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateWaybillorderPlatformdidResponse());
    }

    /**
     * Description: 更新货主账单
     * Summary: 货主账单更新
     */
    public UpdateCargowaybillBillResponse updateCargowaybillBill(UpdateCargowaybillBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCargowaybillBillEx(request, headers, runtime);
    }

    /**
     * Description: 更新货主账单
     * Summary: 货主账单更新
     */
    public UpdateCargowaybillBillResponse updateCargowaybillBillEx(UpdateCargowaybillBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cargowaybill.bill.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCargowaybillBillResponse());
    }

    /**
     * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
     * Summary: 分布式数字身份申请did集合
     */
    public CreateDisDidResponse createDisDid(CreateDisDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDisDidEx(request, headers, runtime);
    }

    /**
     * Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
     * Summary: 分布式数字身份申请did集合
     */
    public CreateDisDidResponse createDisDidEx(CreateDisDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.dis.did.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDisDidResponse());
    }

    /**
     * Description: 3PL运输合同上传
     * Summary: 3PL运输合同上传
     */
    public UploadTransportContractResponse uploadTransportContract(UploadTransportContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadTransportContractEx(request, headers, runtime);
    }

    /**
     * Description: 3PL运输合同上传
     * Summary: 3PL运输合同上传
     */
    public UploadTransportContractResponse uploadTransportContractEx(UploadTransportContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.transport.contract.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadTransportContractResponse());
    }

    /**
     * Description: 3PL运输线路上传
     * Summary: 3PL运输线路上传
     */
    public UploadTransportRouteResponse uploadTransportRoute(UploadTransportRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadTransportRouteEx(request, headers, runtime);
    }

    /**
     * Description: 3PL运输线路上传
     * Summary: 3PL运输线路上传
     */
    public UploadTransportRouteResponse uploadTransportRouteEx(UploadTransportRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.transport.route.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadTransportRouteResponse());
    }

    /**
     * Description: 3PL运单创建
     * Summary: 3PL运单创建
     */
    public CreateTransportWaybillResponse createTransportWaybill(CreateTransportWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTransportWaybillEx(request, headers, runtime);
    }

    /**
     * Description: 3PL运单创建
     * Summary: 3PL运单创建
     */
    public CreateTransportWaybillResponse createTransportWaybillEx(CreateTransportWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.transport.waybill.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTransportWaybillResponse());
    }

    /**
     * Description: 3PL运单状态更新
     * Summary: 3PL运单状态更新
     */
    public UpdateWaybillActionResponse updateWaybillAction(UpdateWaybillActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWaybillActionEx(request, headers, runtime);
    }

    /**
     * Description: 3PL运单状态更新
     * Summary: 3PL运单状态更新
     */
    public UpdateWaybillActionResponse updateWaybillActionEx(UpdateWaybillActionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.action.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateWaybillActionResponse());
    }

    /**
     * Description: 3PL运单修改
     * Summary: 3PL运单修改
     */
    public UpdateTransportWaybillResponse updateTransportWaybill(UpdateTransportWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTransportWaybillEx(request, headers, runtime);
    }

    /**
     * Description: 3PL运单修改
     * Summary: 3PL运单修改
     */
    public UpdateTransportWaybillResponse updateTransportWaybillEx(UpdateTransportWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.transport.waybill.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTransportWaybillResponse());
    }

    /**
     * Description: 3PL回单上传
     * Summary: 3PL回单上传
     */
    public UploadTransportReceiptResponse uploadTransportReceipt(UploadTransportReceiptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadTransportReceiptEx(request, headers, runtime);
    }

    /**
     * Description: 3PL回单上传
     * Summary: 3PL回单上传
     */
    public UploadTransportReceiptResponse uploadTransportReceiptEx(UploadTransportReceiptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.transport.receipt.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadTransportReceiptResponse());
    }

    /**
     * Description: 应收账单创建
     * Summary: 应收账单创建
     */
    public CreateBillReceivablebillResponse createBillReceivablebill(CreateBillReceivablebillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBillReceivablebillEx(request, headers, runtime);
    }

    /**
     * Description: 应收账单创建
     * Summary: 应收账单创建
     */
    public CreateBillReceivablebillResponse createBillReceivablebillEx(CreateBillReceivablebillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.receivablebill.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBillReceivablebillResponse());
    }

    /**
     * Description: 应收账单状态更新
     * Summary: 应收账单状态更新
     */
    public UpdateReceivablebillStatusResponse updateReceivablebillStatus(UpdateReceivablebillStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateReceivablebillStatusEx(request, headers, runtime);
    }

    /**
     * Description: 应收账单状态更新
     * Summary: 应收账单状态更新
     */
    public UpdateReceivablebillStatusResponse updateReceivablebillStatusEx(UpdateReceivablebillStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.receivablebill.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateReceivablebillStatusResponse());
    }

    /**
     * Description: 应收账单修改
     * Summary: 应收账单修改
     */
    public UpdateBillReceivablebillResponse updateBillReceivablebill(UpdateBillReceivablebillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBillReceivablebillEx(request, headers, runtime);
    }

    /**
     * Description: 应收账单修改
     * Summary: 应收账单修改
     */
    public UpdateBillReceivablebillResponse updateBillReceivablebillEx(UpdateBillReceivablebillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.receivablebill.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBillReceivablebillResponse());
    }

    /**
     * Description: 路运发票创建
     * Summary: 路运发票创建
     */
    public CreateHighwayInvoiceResponse createHighwayInvoice(CreateHighwayInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createHighwayInvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 路运发票创建
     * Summary: 路运发票创建
     */
    public CreateHighwayInvoiceResponse createHighwayInvoiceEx(CreateHighwayInvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.highway.invoice.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateHighwayInvoiceResponse());
    }

    /**
     * Description: 查询运单信息
     * Summary: 运单信息查询
     */
    public QueryWaybillInfoResponse queryWaybillInfo(QueryWaybillInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWaybillInfoEx(request, headers, runtime);
    }

    /**
     * Description: 查询运单信息
     * Summary: 运单信息查询
     */
    public QueryWaybillInfoResponse queryWaybillInfoEx(QueryWaybillInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.waybill.info.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWaybillInfoResponse());
    }

    /**
     * Description: 应收账单创建无明细版
     * Summary: 应收账单创建无明细版
     */
    public CreateBillReceivablebillnodetailResponse createBillReceivablebillnodetail(CreateBillReceivablebillnodetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBillReceivablebillnodetailEx(request, headers, runtime);
    }

    /**
     * Description: 应收账单创建无明细版
     * Summary: 应收账单创建无明细版
     */
    public CreateBillReceivablebillnodetailResponse createBillReceivablebillnodetailEx(CreateBillReceivablebillnodetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.receivablebillnodetail.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBillReceivablebillnodetailResponse());
    }

    /**
     * Description: 企业信息上传/更新
     * Summary: 企业信息上传/更新
     */
    public SaveTrailerCorpResponse saveTrailerCorp(SaveTrailerCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveTrailerCorpEx(request, headers, runtime);
    }

    /**
     * Description: 企业信息上传/更新
     * Summary: 企业信息上传/更新
     */
    public SaveTrailerCorpResponse saveTrailerCorpEx(SaveTrailerCorpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.trailer.corp.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveTrailerCorpResponse());
    }

    /**
     * Description: 企业运营数据上传/更新
     * Summary: 企业运营数据上传/更新
     */
    public SaveTrailerTransportResponse saveTrailerTransport(SaveTrailerTransportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveTrailerTransportEx(request, headers, runtime);
    }

    /**
     * Description: 企业运营数据上传/更新
     * Summary: 企业运营数据上传/更新
     */
    public SaveTrailerTransportResponse saveTrailerTransportEx(SaveTrailerTransportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.trailer.transport.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveTrailerTransportResponse());
    }

    /**
     * Description: 根据实例id，查询实例状态
     * Summary: 实例状态查询
     */
    public QueryBusinessInstancestatusResponse queryBusinessInstancestatus(QueryBusinessInstancestatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessInstancestatusEx(request, headers, runtime);
    }

    /**
     * Description: 根据实例id，查询实例状态
     * Summary: 实例状态查询
     */
    public QueryBusinessInstancestatusResponse queryBusinessInstancestatusEx(QueryBusinessInstancestatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.business.instancestatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessInstancestatusResponse());
    }

    /**
     * Description: 司机信用流转协议签署并开通流转能力
     * Summary: 司机信用流转协议签署并开通流转能力
     */
    public OpenCreditDriverResponse openCreditDriver(OpenCreditDriverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openCreditDriverEx(request, headers, runtime);
    }

    /**
     * Description: 司机信用流转协议签署并开通流转能力
     * Summary: 司机信用流转协议签署并开通流转能力
     */
    public OpenCreditDriverResponse openCreditDriverEx(OpenCreditDriverRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.driver.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenCreditDriverResponse());
    }

    /**
     * Description: 查询司机信用流转能力开通情况
     * Summary: 查询司机信用流转能力开通情况
     */
    public QueryCreditDriverResponse queryCreditDriver(QueryCreditDriverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditDriverEx(request, headers, runtime);
    }

    /**
     * Description: 查询司机信用流转能力开通情况
     * Summary: 查询司机信用流转能力开通情况
     */
    public QueryCreditDriverResponse queryCreditDriverEx(QueryCreditDriverRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.driver.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditDriverResponse());
    }

    /**
     * Description: 查询货主信用流转能力开通情况
     * Summary: 查询货主信用流转能力开通情况
     */
    public QueryCreditConsignorResponse queryCreditConsignor(QueryCreditConsignorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditConsignorEx(request, headers, runtime);
    }

    /**
     * Description: 查询货主信用流转能力开通情况
     * Summary: 查询货主信用流转能力开通情况
     */
    public QueryCreditConsignorResponse queryCreditConsignorEx(QueryCreditConsignorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.consignor.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditConsignorResponse());
    }

    /**
     * Description: 查询货主信用流转额度
     * Summary: 查询货主信用流转额度
     */
    public QueryCreditBalanceResponse queryCreditBalance(QueryCreditBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditBalanceEx(request, headers, runtime);
    }

    /**
     * Description: 查询货主信用流转额度
     * Summary: 查询货主信用流转额度
     */
    public QueryCreditBalanceResponse queryCreditBalanceEx(QueryCreditBalanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.balance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditBalanceResponse());
    }

    /**
     * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
     * Summary: 发行信用流转批次信息上传
     */
    public UploadCreditIssueResponse uploadCreditIssue(UploadCreditIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCreditIssueEx(request, headers, runtime);
    }

    /**
     * Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
     * Summary: 发行信用流转批次信息上传
     */
    public UploadCreditIssueResponse uploadCreditIssueEx(UploadCreditIssueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issue.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadCreditIssueResponse());
    }

    /**
     * Description: 信用流转批次状态查询
     * Summary: 信用流转批次状态查询
     */
    public QueryCreditIssuebatchstatusResponse queryCreditIssuebatchstatus(QueryCreditIssuebatchstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditIssuebatchstatusEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转批次状态查询
     * Summary: 信用流转批次状态查询
     */
    public QueryCreditIssuebatchstatusResponse queryCreditIssuebatchstatusEx(QueryCreditIssuebatchstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuebatchstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditIssuebatchstatusResponse());
    }

    /**
     * Description: 支付批次撤销
     * Summary: 支付批次撤销
     */
    public CancelCreditIssuebatchResponse cancelCreditIssuebatch(CancelCreditIssuebatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelCreditIssuebatchEx(request, headers, runtime);
    }

    /**
     * Description: 支付批次撤销
     * Summary: 支付批次撤销
     */
    public CancelCreditIssuebatchResponse cancelCreditIssuebatchEx(CancelCreditIssuebatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuebatch.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelCreditIssuebatchResponse());
    }

    /**
     * Description: 根据id查询信用凭证信息
     * Summary: 根据id查询信用凭证信息
     */
    public QueryCreditIssuebyidResponse queryCreditIssuebyid(QueryCreditIssuebyidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditIssuebyidEx(request, headers, runtime);
    }

    /**
     * Description: 根据id查询信用凭证信息
     * Summary: 根据id查询信用凭证信息
     */
    public QueryCreditIssuebyidResponse queryCreditIssuebyidEx(QueryCreditIssuebyidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuebyid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditIssuebyidResponse());
    }

    /**
     * Description: 根据时间查询信用凭证信息
     * Summary: 根据时间查询信用凭证信息
     */
    public QueryCreditIssuebytimeResponse queryCreditIssuebytime(QueryCreditIssuebytimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditIssuebytimeEx(request, headers, runtime);
    }

    /**
     * Description: 根据时间查询信用凭证信息
     * Summary: 根据时间查询信用凭证信息
     */
    public QueryCreditIssuebytimeResponse queryCreditIssuebytimeEx(QueryCreditIssuebytimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuebytime.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditIssuebytimeResponse());
    }

    /**
     * Description: 查询用户持有的信用凭证信息
     * Summary: 查询用户持有的信用凭证信息
     */
    public QueryCreditUserissueResponse queryCreditUserissue(QueryCreditUserissueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditUserissueEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户持有的信用凭证信息
     * Summary: 查询用户持有的信用凭证信息
     */
    public QueryCreditUserissueResponse queryCreditUserissueEx(QueryCreditUserissueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.userissue.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditUserissueResponse());
    }

    /**
     * Description: 查询用户信用流转流水记录
     * Summary: 查询用户信用流转流水记录
     */
    public QueryCreditStatementResponse queryCreditStatement(QueryCreditStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditStatementEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户信用流转流水记录
     * Summary: 查询用户信用流转流水记录
     */
    public QueryCreditStatementResponse queryCreditStatementEx(QueryCreditStatementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.statement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditStatementResponse());
    }

    /**
     * Description: 信用凭证拆分转让申请
     * Summary: 信用凭证拆分转让申请
     */
    public CreateCreditIssuetransferResponse createCreditIssuetransfer(CreateCreditIssuetransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCreditIssuetransferEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证拆分转让申请
     * Summary: 信用凭证拆分转让申请
     */
    public CreateCreditIssuetransferResponse createCreditIssuetransferEx(CreateCreditIssuetransferRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuetransfer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCreditIssuetransferResponse());
    }

    /**
     * Description: 信用凭证拆分转让结果查询
     * Summary: 信用凭证拆分转让结果查询
     */
    public QueryCreditIssuetransferResponse queryCreditIssuetransfer(QueryCreditIssuetransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditIssuetransferEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证拆分转让结果查询
     * Summary: 信用凭证拆分转让结果查询
     */
    public QueryCreditIssuetransferResponse queryCreditIssuetransferEx(QueryCreditIssuetransferRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuetransfer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditIssuetransferResponse());
    }

    /**
     * Description: 信用凭证融资申请
     * Summary: 信用凭证融资申请
     */
    public CreateCreditIssuefinanceResponse createCreditIssuefinance(CreateCreditIssuefinanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCreditIssuefinanceEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证融资申请
     * Summary: 信用凭证融资申请
     */
    public CreateCreditIssuefinanceResponse createCreditIssuefinanceEx(CreateCreditIssuefinanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuefinance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCreditIssuefinanceResponse());
    }

    /**
     * Description: 信用凭证融资结果查询
     * Summary: 信用凭证融资结果查询
     */
    public QueryCreditIssuefinanceResponse queryCreditIssuefinance(QueryCreditIssuefinanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditIssuefinanceEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证融资结果查询
     * Summary: 信用凭证融资结果查询
     */
    public QueryCreditIssuefinanceResponse queryCreditIssuefinanceEx(QueryCreditIssuefinanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuefinance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditIssuefinanceResponse());
    }

    /**
     * Description: 信用凭证清分信息查询
     * Summary: 信用凭证清分信息查询
     */
    public QueryCreditIssuereceivableResponse queryCreditIssuereceivable(QueryCreditIssuereceivableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditIssuereceivableEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证清分信息查询
     * Summary: 信用凭证清分信息查询
     */
    public QueryCreditIssuereceivableResponse queryCreditIssuereceivableEx(QueryCreditIssuereceivableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuereceivable.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditIssuereceivableResponse());
    }

    /**
     * Description: 信用凭证资产查询
     * Summary: 信用凭证资产查询
     */
    public QueryCreditIssueamountResponse queryCreditIssueamount(QueryCreditIssueamountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditIssueamountEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证资产查询
     * Summary: 信用凭证资产查询
     */
    public QueryCreditIssueamountResponse queryCreditIssueamountEx(QueryCreditIssueamountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issueamount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditIssueamountResponse());
    }

    /**
     * Description: 物流金融统一回调接口
     * Summary: 物流金融统一回调接口
     */
    public CallbackCreditCommonResponse callbackCreditCommon(CallbackCreditCommonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackCreditCommonEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融统一回调接口
     * Summary: 物流金融统一回调接口
     */
    public CallbackCreditCommonResponse callbackCreditCommonEx(CallbackCreditCommonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.common.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackCreditCommonResponse());
    }

    /**
     * Description: 信用凭证主动清分
     * Summary: 信用凭证主动清分
     */
    public ApplyCreditIssueclearResponse applyCreditIssueclear(ApplyCreditIssueclearRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyCreditIssueclearEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证主动清分
     * Summary: 信用凭证主动清分
     */
    public ApplyCreditIssueclearResponse applyCreditIssueclearEx(ApplyCreditIssueclearRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issueclear.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyCreditIssueclearResponse());
    }

    /**
     * Description: 物流金融代理消息
     * Summary: 物流金融代理消息
     */
    public SendCreditProxyResponse sendCreditProxy(SendCreditProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCreditProxyEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融代理消息
     * Summary: 物流金融代理消息
     */
    public SendCreditProxyResponse sendCreditProxyEx(SendCreditProxyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.proxy.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCreditProxyResponse());
    }

    /**
     * Description: 运单信用流转核验结果查询
     * Summary: 运单信用流转核验结果查询
     */
    public CheckCreditWaybillResponse checkCreditWaybill(CheckCreditWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkCreditWaybillEx(request, headers, runtime);
    }

    /**
     * Description: 运单信用流转核验结果查询
     * Summary: 运单信用流转核验结果查询
     */
    public CheckCreditWaybillResponse checkCreditWaybillEx(CheckCreditWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.waybill.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckCreditWaybillResponse());
    }

    /**
     * Description: 物流金融信用流转司机换绑
     * Summary: 物流金融信用流转司机换绑
     */
    public ReopenCreditDriverResponse reopenCreditDriver(ReopenCreditDriverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reopenCreditDriverEx(request, headers, runtime);
    }

    /**
     * Description: 物流金融信用流转司机换绑
     * Summary: 物流金融信用流转司机换绑
     */
    public ReopenCreditDriverResponse reopenCreditDriverEx(ReopenCreditDriverRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.driver.reopen", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReopenCreditDriverResponse());
    }

    /**
     * Description: 线下协议授权关系上传
     * Summary: 线下协议授权关系上传
     */
    public UploadCreditAuthorizationResponse uploadCreditAuthorization(UploadCreditAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCreditAuthorizationEx(request, headers, runtime);
    }

    /**
     * Description: 线下协议授权关系上传
     * Summary: 线下协议授权关系上传
     */
    public UploadCreditAuthorizationResponse uploadCreditAuthorizationEx(UploadCreditAuthorizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.authorization.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadCreditAuthorizationResponse());
    }

    /**
     * Description: 线上应收转让确认关系
     * Summary: 线上应收转让确认关系
     */
    public UploadCreditConfirmResponse uploadCreditConfirm(UploadCreditConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCreditConfirmEx(request, headers, runtime);
    }

    /**
     * Description: 线上应收转让确认关系
     * Summary: 线上应收转让确认关系
     */
    public UploadCreditConfirmResponse uploadCreditConfirmEx(UploadCreditConfirmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.confirm.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadCreditConfirmResponse());
    }

    /**
     * Description: 物流信用流转凭证批量发行
     * Summary: 物流信用流转凭证批量发行
     */
    public BatchcreateCreditmodeIssueResponse batchcreateCreditmodeIssue(BatchcreateCreditmodeIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateCreditmodeIssueEx(request, headers, runtime);
    }

    /**
     * Description: 物流信用流转凭证批量发行
     * Summary: 物流信用流转凭证批量发行
     */
    public BatchcreateCreditmodeIssueResponse batchcreateCreditmodeIssueEx(BatchcreateCreditmodeIssueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.creditmode.issue.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateCreditmodeIssueResponse());
    }

    /**
     * Description: 物流信用流转按模式主动清分
     * Summary: 物流信用流转按模式主动清分
     */
    public ApplyCreditmodeIssueclearResponse applyCreditmodeIssueclear(ApplyCreditmodeIssueclearRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyCreditmodeIssueclearEx(request, headers, runtime);
    }

    /**
     * Description: 物流信用流转按模式主动清分
     * Summary: 物流信用流转按模式主动清分
     */
    public ApplyCreditmodeIssueclearResponse applyCreditmodeIssueclearEx(ApplyCreditmodeIssueclearRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.creditmode.issueclear.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyCreditmodeIssueclearResponse());
    }

    /**
     * Description: 信用流转发行信息上传SAAS版
     * Summary: 信用流转发行信息上传SAAS版
     */
    public UploadCreditIssuebysaasResponse uploadCreditIssuebysaas(UploadCreditIssuebysaasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCreditIssuebysaasEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转发行信息上传SAAS版
     * Summary: 信用流转发行信息上传SAAS版
     */
    public UploadCreditIssuebysaasResponse uploadCreditIssuebysaasEx(UploadCreditIssuebysaasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuebysaas.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadCreditIssuebysaasResponse());
    }

    /**
     * Description: 信用流转B模式发行批次撤销SAAS版
     * Summary: 信用流转B模式发行批次撤销SAAS版
     */
    public CancelCreditIssuebatchbysaasResponse cancelCreditIssuebatchbysaas(CancelCreditIssuebatchbysaasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelCreditIssuebatchbysaasEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转B模式发行批次撤销SAAS版
     * Summary: 信用流转B模式发行批次撤销SAAS版
     */
    public CancelCreditIssuebatchbysaasResponse cancelCreditIssuebatchbysaasEx(CancelCreditIssuebatchbysaasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuebatchbysaas.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelCreditIssuebatchbysaasResponse());
    }

    /**
     * Description: 信用流转可用额度查询SAAS版
     * Summary: 信用流转可用额度查询SAAS版
     */
    public QueryCreditBalancebysaasResponse queryCreditBalancebysaas(QueryCreditBalancebysaasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditBalancebysaasEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转可用额度查询SAAS版
     * Summary: 信用流转可用额度查询SAAS版
     */
    public QueryCreditBalancebysaasResponse queryCreditBalancebysaasEx(QueryCreditBalancebysaasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.balancebysaas.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditBalancebysaasResponse());
    }

    /**
     * Description: 信用凭证电子回单获取
     * Summary: 信用凭证电子回单获取
     */
    public GetCreditIssuescpticketResponse getCreditIssuescpticket(GetCreditIssuescpticketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCreditIssuescpticketEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证电子回单获取
     * Summary: 信用凭证电子回单获取
     */
    public GetCreditIssuescpticketResponse getCreditIssuescpticketEx(GetCreditIssuescpticketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuescpticket.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCreditIssuescpticketResponse());
    }

    /**
     * Description: 信用凭证电子回单获取结果查询接口
     * Summary: 信用凭证电子回单获取结果查询接口
     */
    public QueryCreditIssuescpticketresultResponse queryCreditIssuescpticketresult(QueryCreditIssuescpticketresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditIssuescpticketresultEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证电子回单获取结果查询接口
     * Summary: 信用凭证电子回单获取结果查询接口
     */
    public QueryCreditIssuescpticketresultResponse queryCreditIssuescpticketresultEx(QueryCreditIssuescpticketresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuescpticketresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditIssuescpticketresultResponse());
    }

    /**
     * Description: 信用流转A+模式发行信息上传
     * Summary: 信用流转A+模式发行信息上传
     */
    public UploadCreditAplusissueResponse uploadCreditAplusissue(UploadCreditAplusissueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCreditAplusissueEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转A+模式发行信息上传
     * Summary: 信用流转A+模式发行信息上传
     */
    public UploadCreditAplusissueResponse uploadCreditAplusissueEx(UploadCreditAplusissueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.aplusissue.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadCreditAplusissueResponse());
    }

    /**
     * Description: 信用流转可用额度查询接口
     * Summary: 信用流转可用额度查询接口
     */
    public QueryCreditCreditamountResponse queryCreditCreditamount(QueryCreditCreditamountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditCreditamountEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转可用额度查询接口
     * Summary: 信用流转可用额度查询接口
     */
    public QueryCreditCreditamountResponse queryCreditCreditamountEx(QueryCreditCreditamountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.creditamount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditCreditamountResponse());
    }

    /**
     * Description: 信用流转非授信通用签约接口
     * Summary: 信用流转非授信通用签约接口
     */
    public CreateCreditCommonsignResponse createCreditCommonsign(CreateCreditCommonsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCreditCommonsignEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转非授信通用签约接口
     * Summary: 信用流转非授信通用签约接口
     */
    public CreateCreditCommonsignResponse createCreditCommonsignEx(CreateCreditCommonsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.commonsign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCreditCommonsignResponse());
    }

    /**
     * Description: 信用流转非授信通用签约查询接口
     * Summary: 信用流转非授信通用签约查询接口
     */
    public QueryCreditCommonsignResponse queryCreditCommonsign(QueryCreditCommonsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCreditCommonsignEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转非授信通用签约查询接口
     * Summary: 信用流转非授信通用签约查询接口
     */
    public QueryCreditCommonsignResponse queryCreditCommonsignEx(QueryCreditCommonsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.commonsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCreditCommonsignResponse());
    }

    /**
     * Description: 信用流转凭证合并发行接口
     * Summary: 信用流转凭证合并发行接口
     */
    public BatchcreateCreditIssueResponse batchcreateCreditIssue(BatchcreateCreditIssueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateCreditIssueEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转凭证合并发行接口
     * Summary: 信用流转凭证合并发行接口
     */
    public BatchcreateCreditIssueResponse batchcreateCreditIssueEx(BatchcreateCreditIssueRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issue.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateCreditIssueResponse());
    }

    /**
     * Description: 信用流转凭证合并发行信息上传接口
     * Summary: 信用流转凭证合并发行信息上传接口
     */
    public UploadCreditIssuebatchResponse uploadCreditIssuebatch(UploadCreditIssuebatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadCreditIssuebatchEx(request, headers, runtime);
    }

    /**
     * Description: 信用流转凭证合并发行信息上传接口
     * Summary: 信用流转凭证合并发行信息上传接口
     */
    public UploadCreditIssuebatchResponse uploadCreditIssuebatchEx(UploadCreditIssuebatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.credit.issuebatch.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadCreditIssuebatchResponse());
    }

    /**
     * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
     * Summary: 信用凭证电子回单获取(新)
     */
    public GetIssueTransferfileResponse getIssueTransferfile(GetIssueTransferfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIssueTransferfileEx(request, headers, runtime);
    }

    /**
     * Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
     * Summary: 信用凭证电子回单获取(新)
     */
    public GetIssueTransferfileResponse getIssueTransferfileEx(GetIssueTransferfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.issue.transferfile.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetIssueTransferfileResponse());
    }

    /**
     * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-中华财险-承运人责任险
     */
    public ApplyInsurancepolicyZhonghuacaixianResponse applyInsurancepolicyZhonghuacaixian(ApplyInsurancepolicyZhonghuacaixianRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsurancepolicyZhonghuacaixianEx(request, headers, runtime);
    }

    /**
     * Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-中华财险-承运人责任险
     */
    public ApplyInsurancepolicyZhonghuacaixianResponse applyInsurancepolicyZhonghuacaixianEx(ApplyInsurancepolicyZhonghuacaixianRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsurancepolicyZhonghuacaixianResponse());
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-中华财险-承运人责任险
     */
    public CancelInsurancepolicyZhonghuacaixianResponse cancelInsurancepolicyZhonghuacaixian(CancelInsurancepolicyZhonghuacaixianRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelInsurancepolicyZhonghuacaixianEx(request, headers, runtime);
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-中华财险-承运人责任险
     */
    public CancelInsurancepolicyZhonghuacaixianResponse cancelInsurancepolicyZhonghuacaixianEx(CancelInsurancepolicyZhonghuacaixianRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurancepolicy.zhonghuacaixian.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelInsurancepolicyZhonghuacaixianResponse());
    }

    /**
     * Description: 保险理赔通知
     * Summary: 保险理赔通知
     */
    public PushInsurancenotifyClaimResponse pushInsurancenotifyClaim(PushInsurancenotifyClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInsurancenotifyClaimEx(request, headers, runtime);
    }

    /**
     * Description: 保险理赔通知
     * Summary: 保险理赔通知
     */
    public PushInsurancenotifyClaimResponse pushInsurancenotifyClaimEx(PushInsurancenotifyClaimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurancenotify.claim.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushInsurancenotifyClaimResponse());
    }

    /**
     * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
     * Summary: 上传文件链接申请
     */
    public ApplyInsuranceFileurlResponse applyInsuranceFileurl(ApplyInsuranceFileurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceFileurlEx(request, headers, runtime);
    }

    /**
     * Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
     * Summary: 上传文件链接申请
     */
    public ApplyInsuranceFileurlResponse applyInsuranceFileurlEx(ApplyInsuranceFileurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.fileurl.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceFileurlResponse());
    }

    /**
     * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
    接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-承运人平台责任险
     */
    public ApplyInsurancepolicyUniversalResponse applyInsurancepolicyUniversal(ApplyInsurancepolicyUniversalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsurancepolicyUniversalEx(request, headers, runtime);
    }

    /**
     * Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
    接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
     * Summary: 投保接口-承运人平台责任险
     */
    public ApplyInsurancepolicyUniversalResponse applyInsurancepolicyUniversalEx(ApplyInsurancepolicyUniversalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurancepolicy.universal.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsurancepolicyUniversalResponse());
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-承运人平台责任险
     */
    public CancelInsurancepolicyUniversalResponse cancelInsurancepolicyUniversal(CancelInsurancepolicyUniversalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelInsurancepolicyUniversalEx(request, headers, runtime);
    }

    /**
     * Description: 数字物流保险，退保接口
     * Summary: 退保接口-承运人平台责任险
     */
    public CancelInsurancepolicyUniversalResponse cancelInsurancepolicyUniversalEx(CancelInsurancepolicyUniversalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurancepolicy.universal.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelInsurancepolicyUniversalResponse());
    }

    /**
     * Description: 利用区块链智能合约进行离线保单存证
     * Summary: 离线保单存证推送
     */
    public PushInsuranceOlpResponse pushInsuranceOlp(PushInsuranceOlpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInsuranceOlpEx(request, headers, runtime);
    }

    /**
     * Description: 利用区块链智能合约进行离线保单存证
     * Summary: 离线保单存证推送
     */
    public PushInsuranceOlpResponse pushInsuranceOlpEx(PushInsuranceOlpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.olp.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushInsuranceOlpResponse());
    }

    /**
     * Description: 利用区块链智能合约进行离线保单信息更新追踪
     * Summary: 离线保单更新
     */
    public UpdateInsuranceOlpResponse updateInsuranceOlp(UpdateInsuranceOlpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInsuranceOlpEx(request, headers, runtime);
    }

    /**
     * Description: 利用区块链智能合约进行离线保单信息更新追踪
     * Summary: 离线保单更新
     */
    public UpdateInsuranceOlpResponse updateInsuranceOlpEx(UpdateInsuranceOlpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.olp.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInsuranceOlpResponse());
    }

    /**
     * Description: 再保分保单推送接口
     * Summary: 再保分保单推送
     */
    public PushInsuranceReppolicyResponse pushInsuranceReppolicy(PushInsuranceReppolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInsuranceReppolicyEx(request, headers, runtime);
    }

    /**
     * Description: 再保分保单推送接口
     * Summary: 再保分保单推送
     */
    public PushInsuranceReppolicyResponse pushInsuranceReppolicyEx(PushInsuranceReppolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.reppolicy.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushInsuranceReppolicyResponse());
    }

    /**
     * Description: 再保批改单推送
     * Summary: 再保批改单推送
     */
    public PushInsuranceRepcorrectResponse pushInsuranceRepcorrect(PushInsuranceRepcorrectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInsuranceRepcorrectEx(request, headers, runtime);
    }

    /**
     * Description: 再保批改单推送
     * Summary: 再保批改单推送
     */
    public PushInsuranceRepcorrectResponse pushInsuranceRepcorrectEx(PushInsuranceRepcorrectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.repcorrect.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushInsuranceRepcorrectResponse());
    }

    /**
     * Description: 跨境运费险投保申请
     * Summary: 跨境运费险投保
     */
    public ApplyInsuranceCbrfResponse applyInsuranceCbrf(ApplyInsuranceCbrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceCbrfEx(request, headers, runtime);
    }

    /**
     * Description: 跨境运费险投保申请
     * Summary: 跨境运费险投保
     */
    public ApplyInsuranceCbrfResponse applyInsuranceCbrfEx(ApplyInsuranceCbrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.cbrf.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceCbrfResponse());
    }

    /**
     * Description: 跨境运费险理赔
     * Summary: 跨境运费险理赔
     */
    public RepayInsuranceCbrfResponse repayInsuranceCbrf(RepayInsuranceCbrfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayInsuranceCbrfEx(request, headers, runtime);
    }

    /**
     * Description: 跨境运费险理赔
     * Summary: 跨境运费险理赔
     */
    public RepayInsuranceCbrfResponse repayInsuranceCbrfEx(RepayInsuranceCbrfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.cbrf.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayInsuranceCbrfResponse());
    }

    /**
     * Description: 跨境出口货运险投保
     * Summary: 跨境出口货运险投保
     */
    public ApplyInsuranceCbecResponse applyInsuranceCbec(ApplyInsuranceCbecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceCbecEx(request, headers, runtime);
    }

    /**
     * Description: 跨境出口货运险投保
     * Summary: 跨境出口货运险投保
     */
    public ApplyInsuranceCbecResponse applyInsuranceCbecEx(ApplyInsuranceCbecRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.cbec.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceCbecResponse());
    }

    /**
     * Description: 货物入库申报
     * Summary: 货物入库申报
     */
    public ApplyInsuranceStockinResponse applyInsuranceStockin(ApplyInsuranceStockinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceStockinEx(request, headers, runtime);
    }

    /**
     * Description: 货物入库申报
     * Summary: 货物入库申报
     */
    public ApplyInsuranceStockinResponse applyInsuranceStockinEx(ApplyInsuranceStockinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.stockin.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceStockinResponse());
    }

    /**
     * Description: 货物库存申报
     * Summary: 货物库存申报
     */
    public ApplyInsuranceInventoryResponse applyInsuranceInventory(ApplyInsuranceInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceInventoryEx(request, headers, runtime);
    }

    /**
     * Description: 货物库存申报
     * Summary: 货物库存申报
     */
    public ApplyInsuranceInventoryResponse applyInsuranceInventoryEx(ApplyInsuranceInventoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.inventory.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceInventoryResponse());
    }

    /**
     * Description: 海外邮包险投保api
     * Summary: 海外邮包险投保
     */
    public ApplyInsuranceOspiResponse applyInsuranceOspi(ApplyInsuranceOspiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceOspiEx(request, headers, runtime);
    }

    /**
     * Description: 海外邮包险投保api
     * Summary: 海外邮包险投保
     */
    public ApplyInsuranceOspiResponse applyInsuranceOspiEx(ApplyInsuranceOspiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.ospi.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceOspiResponse());
    }

    /**
     * Description: 海外、跨境邮包险、平台责任险的理赔报案
     * Summary: 海外、跨境邮包险、平台责任险报案
     */
    public ApplyInsuranceOspireportResponse applyInsuranceOspireport(ApplyInsuranceOspireportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceOspireportEx(request, headers, runtime);
    }

    /**
     * Description: 海外、跨境邮包险、平台责任险的理赔报案
     * Summary: 海外、跨境邮包险、平台责任险报案
     */
    public ApplyInsuranceOspireportResponse applyInsuranceOspireportEx(ApplyInsuranceOspireportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.ospireport.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceOspireportResponse());
    }

    /**
     * Description: 海外、跨境邮包险、平台责任险案件结果通知
     * Summary: 海外、跨境邮包险、平台责任险案件结果通知
     */
    public NotifyInsuranceOspireportResponse notifyInsuranceOspireport(NotifyInsuranceOspireportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyInsuranceOspireportEx(request, headers, runtime);
    }

    /**
     * Description: 海外、跨境邮包险、平台责任险案件结果通知
     * Summary: 海外、跨境邮包险、平台责任险案件结果通知
     */
    public NotifyInsuranceOspireportResponse notifyInsuranceOspireportEx(NotifyInsuranceOspireportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.ospireport.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyInsuranceOspireportResponse());
    }

    /**
     * Description: 驿站宝投保
     * Summary: 驿站宝投保
     */
    public ApplyInsuranceYzbResponse applyInsuranceYzb(ApplyInsuranceYzbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceYzbEx(request, headers, runtime);
    }

    /**
     * Description: 驿站宝投保
     * Summary: 驿站宝投保
     */
    public ApplyInsuranceYzbResponse applyInsuranceYzbEx(ApplyInsuranceYzbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.yzb.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceYzbResponse());
    }

    /**
     * Description: 跨境邮包险、平台责任险投保
     * Summary: 跨境邮包险、平台责任险投保
     */
    public ApplyInsuranceCbpiResponse applyInsuranceCbpi(ApplyInsuranceCbpiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceCbpiEx(request, headers, runtime);
    }

    /**
     * Description: 跨境邮包险、平台责任险投保
     * Summary: 跨境邮包险、平台责任险投保
     */
    public ApplyInsuranceCbpiResponse applyInsuranceCbpiEx(ApplyInsuranceCbpiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.cbpi.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceCbpiResponse());
    }

    /**
     * Description: 驿站宝报案
     * Summary: 驿站宝报案
     */
    public ApplyInsuranceYzbreportResponse applyInsuranceYzbreport(ApplyInsuranceYzbreportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceYzbreportEx(request, headers, runtime);
    }

    /**
     * Description: 驿站宝报案
     * Summary: 驿站宝报案
     */
    public ApplyInsuranceYzbreportResponse applyInsuranceYzbreportEx(ApplyInsuranceYzbreportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.yzbreport.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceYzbreportResponse());
    }

    /**
     * Description: 驿站宝案件进度查询
     * Summary: 驿站宝案件进度查询
     */
    public QueryInsuranceYzbreportResponse queryInsuranceYzbreport(QueryInsuranceYzbreportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInsuranceYzbreportEx(request, headers, runtime);
    }

    /**
     * Description: 驿站宝案件进度查询
     * Summary: 驿站宝案件进度查询
     */
    public QueryInsuranceYzbreportResponse queryInsuranceYzbreportEx(QueryInsuranceYzbreportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.yzbreport.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInsuranceYzbreportResponse());
    }

    /**
     * Description: 零担快运运单上链存证接口
     * Summary: 零担快运运单上链存证接口
     */
    public SaveInsuranceWaybillResponse saveInsuranceWaybill(SaveInsuranceWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveInsuranceWaybillEx(request, headers, runtime);
    }

    /**
     * Description: 零担快运运单上链存证接口
     * Summary: 零担快运运单上链存证接口
     */
    public SaveInsuranceWaybillResponse saveInsuranceWaybillEx(SaveInsuranceWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.waybill.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveInsuranceWaybillResponse());
    }

    /**
     * Description: 保险电子保单查询
     * Summary: 保险电子保单查询
     */
    public QueryInsuranceEpolicyResponse queryInsuranceEpolicy(QueryInsuranceEpolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInsuranceEpolicyEx(request, headers, runtime);
    }

    /**
     * Description: 保险电子保单查询
     * Summary: 保险电子保单查询
     */
    public QueryInsuranceEpolicyResponse queryInsuranceEpolicyEx(QueryInsuranceEpolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.epolicy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInsuranceEpolicyResponse());
    }

    /**
     * Description: 报案案件结果通知（内部）
     * Summary: 报案案件结果通知（内部）
     */
    public NotifyInsuranceReportresultResponse notifyInsuranceReportresult(NotifyInsuranceReportresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyInsuranceReportresultEx(request, headers, runtime);
    }

    /**
     * Description: 报案案件结果通知（内部）
     * Summary: 报案案件结果通知（内部）
     */
    public NotifyInsuranceReportresultResponse notifyInsuranceReportresultEx(NotifyInsuranceReportresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.reportresult.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyInsuranceReportresultResponse());
    }

    /**
     * Description: 不可达项目投保接口
     * Summary: 跨境退货运费险-不可达项目投保接口
     */
    public ApplyCbrfInsureResponse applyCbrfInsure(ApplyCbrfInsureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyCbrfInsureEx(request, headers, runtime);
    }

    /**
     * Description: 不可达项目投保接口
     * Summary: 跨境退货运费险-不可达项目投保接口
     */
    public ApplyCbrfInsureResponse applyCbrfInsureEx(ApplyCbrfInsureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cbrf.insure.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyCbrfInsureResponse());
    }

    /**
     * Description: 不可达项目理赔接口
     * Summary: 跨境退货运费险-不可达项目理赔接口
     */
    public RepayCbrfClaimResponse repayCbrfClaim(RepayCbrfClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.repayCbrfClaimEx(request, headers, runtime);
    }

    /**
     * Description: 不可达项目理赔接口
     * Summary: 跨境退货运费险-不可达项目理赔接口
     */
    public RepayCbrfClaimResponse repayCbrfClaimEx(RepayCbrfClaimRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.cbrf.claim.repay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RepayCbrfClaimResponse());
    }

    /**
     * Description: 大保单批单
     * Summary: 大保单批单申请接口
     */
    public ApplyInsuranceEndorsementResponse applyInsuranceEndorsement(ApplyInsuranceEndorsementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsuranceEndorsementEx(request, headers, runtime);
    }

    /**
     * Description: 大保单批单
     * Summary: 大保单批单申请接口
     */
    public ApplyInsuranceEndorsementResponse applyInsuranceEndorsementEx(ApplyInsuranceEndorsementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.endorsement.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsuranceEndorsementResponse());
    }

    /**
     * Description: 大保单批单查询接口
     * Summary: 大保单批单查询接口
     */
    public QueryInsuranceEndorsementResponse queryInsuranceEndorsement(QueryInsuranceEndorsementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInsuranceEndorsementEx(request, headers, runtime);
    }

    /**
     * Description: 大保单批单查询接口
     * Summary: 大保单批单查询接口
     */
    public QueryInsuranceEndorsementResponse queryInsuranceEndorsementEx(QueryInsuranceEndorsementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.endorsement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInsuranceEndorsementResponse());
    }

    /**
     * Description: 海外、跨境邮包险预报案
     * Summary: 海外、跨境邮包险预报案
     */
    public ApplyInsurancePiprereportResponse applyInsurancePiprereport(ApplyInsurancePiprereportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInsurancePiprereportEx(request, headers, runtime);
    }

    /**
     * Description: 海外、跨境邮包险预报案
     * Summary: 海外、跨境邮包险预报案
     */
    public ApplyInsurancePiprereportResponse applyInsurancePiprereportEx(ApplyInsurancePiprereportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.piprereport.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInsurancePiprereportResponse());
    }

    /**
     * Description: 保险案件材料更新
     * Summary: 保险案件材料更新
     */
    public UpdateInsuranceMaterialResponse updateInsuranceMaterial(UpdateInsuranceMaterialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInsuranceMaterialEx(request, headers, runtime);
    }

    /**
     * Description: 保险案件材料更新
     * Summary: 保险案件材料更新
     */
    public UpdateInsuranceMaterialResponse updateInsuranceMaterialEx(UpdateInsuranceMaterialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.insurance.material.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInsuranceMaterialResponse());
    }

    /**
     * Description: 授权签署信息推送
     * Summary: 授权签署信息推送
     */
    public PushAuthSigninfoResponse pushAuthSigninfo(PushAuthSigninfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushAuthSigninfoEx(request, headers, runtime);
    }

    /**
     * Description: 授权签署信息推送
     * Summary: 授权签署信息推送
     */
    public PushAuthSigninfoResponse pushAuthSigninfoEx(PushAuthSigninfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.auth.signinfo.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushAuthSigninfoResponse());
    }

    /**
     * Description: 池融资委托支付入账查询
     * Summary: 委托支付入账查询
     */
    public QueryPfPaymentResponse queryPfPayment(QueryPfPaymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPfPaymentEx(request, headers, runtime);
    }

    /**
     * Description: 池融资委托支付入账查询
     * Summary: 委托支付入账查询
     */
    public QueryPfPaymentResponse queryPfPaymentEx(QueryPfPaymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.payment.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPfPaymentResponse());
    }

    /**
     * Description: 池融资借据信息查询
     * Summary: 借据信息查询
     */
    public QueryPfIouResponse queryPfIou(QueryPfIouRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPfIouEx(request, headers, runtime);
    }

    /**
     * Description: 池融资借据信息查询
     * Summary: 借据信息查询
     */
    public QueryPfIouResponse queryPfIouEx(QueryPfIouRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.iou.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPfIouResponse());
    }

    /**
     * Description: 池融资授信额度查询
     * Summary: 授信额度查询
     */
    public QueryPfQuotaResponse queryPfQuota(QueryPfQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPfQuotaEx(request, headers, runtime);
    }

    /**
     * Description: 池融资授信额度查询
     * Summary: 授信额度查询
     */
    public QueryPfQuotaResponse queryPfQuotaEx(QueryPfQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.quota.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPfQuotaResponse());
    }

    /**
     * Description: 池融资支用申请
     * Summary: 池融资支用申请
     */
    public ApplyPfWaybillfinancingResponse applyPfWaybillfinancing(ApplyPfWaybillfinancingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyPfWaybillfinancingEx(request, headers, runtime);
    }

    /**
     * Description: 池融资支用申请
     * Summary: 池融资支用申请
     */
    public ApplyPfWaybillfinancingResponse applyPfWaybillfinancingEx(ApplyPfWaybillfinancingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.waybillfinancing.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyPfWaybillfinancingResponse());
    }

    /**
     * Description: 池融资账单质押，用于入池
     * Summary: 池融资账单质押
     */
    public PushPfPledgeResponse pushPfPledge(PushPfPledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushPfPledgeEx(request, headers, runtime);
    }

    /**
     * Description: 池融资账单质押，用于入池
     * Summary: 池融资账单质押
     */
    public PushPfPledgeResponse pushPfPledgeEx(PushPfPledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.pledge.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushPfPledgeResponse());
    }

    /**
     * Description: 入池账单质押状态查询
     * Summary: 质押状态查询
     */
    public QueryPfPledgeResponse queryPfPledge(QueryPfPledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPfPledgeEx(request, headers, runtime);
    }

    /**
     * Description: 入池账单质押状态查询
     * Summary: 质押状态查询
     */
    public QueryPfPledgeResponse queryPfPledgeEx(QueryPfPledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.pledge.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPfPledgeResponse());
    }

    /**
     * Description: 池融资融资支用状态查询
     * Summary: 池融资融资支用状态查询
     */
    public QueryPfFinancingResponse queryPfFinancing(QueryPfFinancingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPfFinancingEx(request, headers, runtime);
    }

    /**
     * Description: 池融资融资支用状态查询
     * Summary: 池融资融资支用状态查询
     */
    public QueryPfFinancingResponse queryPfFinancingEx(QueryPfFinancingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.financing.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPfFinancingResponse());
    }

    /**
     * Description: 池融资凭证核验结果查询
     * Summary: 池融资凭证核验结果查询
     */
    public CheckPfVoucherResponse checkPfVoucher(CheckPfVoucherRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPfVoucherEx(request, headers, runtime);
    }

    /**
     * Description: 池融资凭证核验结果查询
     * Summary: 池融资凭证核验结果查询
     */
    public CheckPfVoucherResponse checkPfVoucherEx(CheckPfVoucherRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.voucher.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckPfVoucherResponse());
    }

    /**
     * Description: 池融资提款确认书申请
     * Summary: 提款确认书申请
     */
    public ApplyPfConfirmationResponse applyPfConfirmation(ApplyPfConfirmationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyPfConfirmationEx(request, headers, runtime);
    }

    /**
     * Description: 池融资提款确认书申请
     * Summary: 提款确认书申请
     */
    public ApplyPfConfirmationResponse applyPfConfirmationEx(ApplyPfConfirmationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.confirmation.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyPfConfirmationResponse());
    }

    /**
     * Description: 池融资融资资格申请
     * Summary: 池融资融资资格申请
     */
    public ApplyPfFinancingqualificationResponse applyPfFinancingqualification(ApplyPfFinancingqualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyPfFinancingqualificationEx(request, headers, runtime);
    }

    /**
     * Description: 池融资融资资格申请
     * Summary: 池融资融资资格申请
     */
    public ApplyPfFinancingqualificationResponse applyPfFinancingqualificationEx(ApplyPfFinancingqualificationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.financingqualification.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyPfFinancingqualificationResponse());
    }

    /**
     * Description: 池融资融资资格申请结果查询
     * Summary: 池融资融资资格申请结果查询
     */
    public QueryPfFinancingqualificationResponse queryPfFinancingqualification(QueryPfFinancingqualificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPfFinancingqualificationEx(request, headers, runtime);
    }

    /**
     * Description: 池融资融资资格申请结果查询
     * Summary: 池融资融资资格申请结果查询
     */
    public QueryPfFinancingqualificationResponse queryPfFinancingqualificationEx(QueryPfFinancingqualificationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.financingqualification.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPfFinancingqualificationResponse());
    }

    /**
     * Description: 池融资主站回调金融云接口
     * Summary: 池融资主站回调金融云接口
     */
    public CallbackPfDefinpfResponse callbackPfDefinpf(CallbackPfDefinpfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackPfDefinpfEx(request, headers, runtime);
    }

    /**
     * Description: 池融资主站回调金融云接口
     * Summary: 池融资主站回调金融云接口
     */
    public CallbackPfDefinpfResponse callbackPfDefinpfEx(CallbackPfDefinpfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.definpf.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackPfDefinpfResponse());
    }

    /**
     * Description: 用于查询可提款额度
     * Summary: 可提款额度查询
     */
    public QueryPfWithdrawResponse queryPfWithdraw(QueryPfWithdrawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPfWithdrawEx(request, headers, runtime);
    }

    /**
     * Description: 用于查询可提款额度
     * Summary: 可提款额度查询
     */
    public QueryPfWithdrawResponse queryPfWithdrawEx(QueryPfWithdrawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.pf.withdraw.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPfWithdrawResponse());
    }

    /**
     * Description: 创建货代did
     * Summary: 创建货代did
     */
    public CreateDidForwarderResponse createDidForwarder(CreateDidForwarderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidForwarderEx(request, headers, runtime);
    }

    /**
     * Description: 创建货代did
     * Summary: 创建货代did
     */
    public CreateDidForwarderResponse createDidForwarderEx(CreateDidForwarderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.did.forwarder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidForwarderResponse());
    }

    /**
     * Description: 创建saas平台did
     * Summary: 创建saas平台did
     */
    public CreateDidSaasplatformResponse createDidSaasplatform(CreateDidSaasplatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidSaasplatformEx(request, headers, runtime);
    }

    /**
     * Description: 创建saas平台did
     * Summary: 创建saas平台did
     */
    public CreateDidSaasplatformResponse createDidSaasplatformEx(CreateDidSaasplatformRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.did.saasplatform.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidSaasplatformResponse());
    }

    /**
     * Description: 创建直客did
     * Summary: 创建直客did
     */
    public CreateDidClientResponse createDidClient(CreateDidClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidClientEx(request, headers, runtime);
    }

    /**
     * Description: 创建直客did
     * Summary: 创建直客did
     */
    public CreateDidClientResponse createDidClientEx(CreateDidClientRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.did.client.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidClientResponse());
    }

    /**
     * Description: 保存订单
     * Summary: 保存订单
     */
    public SaveBizOrderResponse saveBizOrder(SaveBizOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizOrderEx(request, headers, runtime);
    }

    /**
     * Description: 保存订单
     * Summary: 保存订单
     */
    public SaveBizOrderResponse saveBizOrderEx(SaveBizOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.order.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizOrderResponse());
    }

    /**
     * Description: 保存托单文件
     * Summary: 保存托单文件
     */
    public SaveBizConsignorderResponse saveBizConsignorder(SaveBizConsignorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizConsignorderEx(request, headers, runtime);
    }

    /**
     * Description: 保存托单文件
     * Summary: 保存托单文件
     */
    public SaveBizConsignorderResponse saveBizConsignorderEx(SaveBizConsignorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.consignorder.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizConsignorderResponse());
    }

    /**
     * Description: 保存货物
     * Summary: 保存货物
     */
    public SaveBizGoodsResponse saveBizGoods(SaveBizGoodsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizGoodsEx(request, headers, runtime);
    }

    /**
     * Description: 保存货物
     * Summary: 保存货物
     */
    public SaveBizGoodsResponse saveBizGoodsEx(SaveBizGoodsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.goods.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizGoodsResponse());
    }

    /**
     * Description: 保存SO入货通知
     * Summary: 保存SO入货通知
     */
    public SaveBizSonotifyResponse saveBizSonotify(SaveBizSonotifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizSonotifyEx(request, headers, runtime);
    }

    /**
     * Description: 保存SO入货通知
     * Summary: 保存SO入货通知
     */
    public SaveBizSonotifyResponse saveBizSonotifyEx(SaveBizSonotifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.sonotify.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizSonotifyResponse());
    }

    /**
     * Description: 保存订舱单
     * Summary: 保存订舱单
     */
    public SaveBizBookingorderResponse saveBizBookingorder(SaveBizBookingorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizBookingorderEx(request, headers, runtime);
    }

    /**
     * Description: 保存订舱单
     * Summary: 保存订舱单
     */
    public SaveBizBookingorderResponse saveBizBookingorderEx(SaveBizBookingorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.bookingorder.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizBookingorderResponse());
    }

    /**
     * Description: 保存集装箱
     * Summary: 保存集装箱
     */
    public SaveBizContainerResponse saveBizContainer(SaveBizContainerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizContainerEx(request, headers, runtime);
    }

    /**
     * Description: 保存集装箱
     * Summary: 保存集装箱
     */
    public SaveBizContainerResponse saveBizContainerEx(SaveBizContainerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.container.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizContainerResponse());
    }

    /**
     * Description: 保存报关单
     * Summary: 保存报关单
     */
    public SaveBizCustomsorderResponse saveBizCustomsorder(SaveBizCustomsorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizCustomsorderEx(request, headers, runtime);
    }

    /**
     * Description: 保存报关单
     * Summary: 保存报关单
     */
    public SaveBizCustomsorderResponse saveBizCustomsorderEx(SaveBizCustomsorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.customsorder.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizCustomsorderResponse());
    }

    /**
     * Description: 保存拖车单
     * Summary: 保存拖车单
     */
    public SaveBizVehicleResponse saveBizVehicle(SaveBizVehicleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizVehicleEx(request, headers, runtime);
    }

    /**
     * Description: 保存拖车单
     * Summary: 保存拖车单
     */
    public SaveBizVehicleResponse saveBizVehicleEx(SaveBizVehicleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.vehicle.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizVehicleResponse());
    }

    /**
     * Description: 保存master提单
     * Summary: 保存master提单
     */
    public SaveBizMasterblResponse saveBizMasterbl(SaveBizMasterblRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizMasterblEx(request, headers, runtime);
    }

    /**
     * Description: 保存master提单
     * Summary: 保存master提单
     */
    public SaveBizMasterblResponse saveBizMasterblEx(SaveBizMasterblRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.masterbl.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizMasterblResponse());
    }

    /**
     * Description: 内审完成
     * Summary: 内审完成
     */
    public FinishBizAuditResponse finishBizAudit(FinishBizAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishBizAuditEx(request, headers, runtime);
    }

    /**
     * Description: 内审完成
     * Summary: 内审完成
     */
    public FinishBizAuditResponse finishBizAuditEx(FinishBizAuditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.audit.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishBizAuditResponse());
    }

    /**
     * Description: 保存house提单
     * Summary: 保存house提单
     */
    public SaveBizHouseblResponse saveBizHousebl(SaveBizHouseblRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizHouseblEx(request, headers, runtime);
    }

    /**
     * Description: 保存house提单
     * Summary: 保存house提单
     */
    public SaveBizHouseblResponse saveBizHouseblEx(SaveBizHouseblRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.housebl.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizHouseblResponse());
    }

    /**
     * Description: 创建应付账单
     * Summary: 创建应付账单(已下)
     */
    public CreateBillPaybillorderResponse createBillPaybillorder(CreateBillPaybillorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBillPaybillorderEx(request, headers, runtime);
    }

    /**
     * Description: 创建应付账单
     * Summary: 创建应付账单(已下)
     */
    public CreateBillPaybillorderResponse createBillPaybillorderEx(CreateBillPaybillorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.paybillorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBillPaybillorderResponse());
    }

    /**
     * Description: 创建应收账单
     * Summary: 创建应收账单(已下)
     */
    public CreateBillReceiptbillorderResponse createBillReceiptbillorder(CreateBillReceiptbillorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBillReceiptbillorderEx(request, headers, runtime);
    }

    /**
     * Description: 创建应收账单
     * Summary: 创建应收账单(已下)
     */
    public CreateBillReceiptbillorderResponse createBillReceiptbillorderEx(CreateBillReceiptbillorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBillReceiptbillorderResponse());
    }

    /**
     * Description: 保存应付资费项
     * Summary: 保存应付资费项
     */
    public SaveBillPaybilltariffResponse saveBillPaybilltariff(SaveBillPaybilltariffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBillPaybilltariffEx(request, headers, runtime);
    }

    /**
     * Description: 保存应付资费项
     * Summary: 保存应付资费项
     */
    public SaveBillPaybilltariffResponse saveBillPaybilltariffEx(SaveBillPaybilltariffRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.paybilltariff.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBillPaybilltariffResponse());
    }

    /**
     * Description: 保存应收资费项
     * Summary: 保存应收资费项
     */
    public SaveBillReceiptbilltariffResponse saveBillReceiptbilltariff(SaveBillReceiptbilltariffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBillReceiptbilltariffEx(request, headers, runtime);
    }

    /**
     * Description: 保存应收资费项
     * Summary: 保存应收资费项
     */
    public SaveBillReceiptbilltariffResponse saveBillReceiptbilltariffEx(SaveBillReceiptbilltariffRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.receiptbilltariff.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBillReceiptbilltariffResponse());
    }

    /**
     * Description: 核销应付资费项
     * Summary: 核销应付资费项
     */
    public VerifyBillPaybillResponse verifyBillPaybill(VerifyBillPaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyBillPaybillEx(request, headers, runtime);
    }

    /**
     * Description: 核销应付资费项
     * Summary: 核销应付资费项
     */
    public VerifyBillPaybillResponse verifyBillPaybillEx(VerifyBillPaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.paybill.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyBillPaybillResponse());
    }

    /**
     * Description: 核销应收资费项
     * Summary: 核销应收资费项
     */
    public VerifyBillReceiptbillorderResponse verifyBillReceiptbillorder(VerifyBillReceiptbillorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyBillReceiptbillorderEx(request, headers, runtime);
    }

    /**
     * Description: 核销应收资费项
     * Summary: 核销应收资费项
     */
    public VerifyBillReceiptbillorderResponse verifyBillReceiptbillorderEx(VerifyBillReceiptbillorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyBillReceiptbillorderResponse());
    }

    /**
     * Description: 更新应付账单
     * Summary: 更新应付账单
     */
    public UpdateBillPaybillorderResponse updateBillPaybillorder(UpdateBillPaybillorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBillPaybillorderEx(request, headers, runtime);
    }

    /**
     * Description: 更新应付账单
     * Summary: 更新应付账单
     */
    public UpdateBillPaybillorderResponse updateBillPaybillorderEx(UpdateBillPaybillorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.paybillorder.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBillPaybillorderResponse());
    }

    /**
     * Description: 更新应收账单
     * Summary: 更新应收账单
     */
    public UpdateBillReceiptbillorderResponse updateBillReceiptbillorder(UpdateBillReceiptbillorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBillReceiptbillorderEx(request, headers, runtime);
    }

    /**
     * Description: 更新应收账单
     * Summary: 更新应收账单
     */
    public UpdateBillReceiptbillorderResponse updateBillReceiptbillorderEx(UpdateBillReceiptbillorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.receiptbillorder.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBillReceiptbillorderResponse());
    }

    /**
     * Description: 保存应付发票
     * Summary: 保存应付发票
     */
    public SaveBillPayinvoiceResponse saveBillPayinvoice(SaveBillPayinvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBillPayinvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 保存应付发票
     * Summary: 保存应付发票
     */
    public SaveBillPayinvoiceResponse saveBillPayinvoiceEx(SaveBillPayinvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.payinvoice.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBillPayinvoiceResponse());
    }

    /**
     * Description: 保存应收发票
     * Summary: 保存应收发票
     */
    public SaveBillReceiptinvoiceResponse saveBillReceiptinvoice(SaveBillReceiptinvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBillReceiptinvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 保存应收发票
     * Summary: 保存应收发票
     */
    public SaveBillReceiptinvoiceResponse saveBillReceiptinvoiceEx(SaveBillReceiptinvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.bill.receiptinvoice.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBillReceiptinvoiceResponse());
    }

    /**
     * Description: 上传历史数据
     * Summary: 上传历史数据
     */
    public UploadBizFinancingResponse uploadBizFinancing(UploadBizFinancingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadBizFinancingEx(request, headers, runtime);
    }

    /**
     * Description: 上传历史数据
     * Summary: 上传历史数据
     */
    public UploadBizFinancingResponse uploadBizFinancingEx(UploadBizFinancingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.financing.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadBizFinancingResponse());
    }

    /**
     * Description: 上传订单
     * Summary: 上传订单
     */
    public UploadBizOrderResponse uploadBizOrder(UploadBizOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadBizOrderEx(request, headers, runtime);
    }

    /**
     * Description: 上传订单
     * Summary: 上传订单
     */
    public UploadBizOrderResponse uploadBizOrderEx(UploadBizOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.order.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadBizOrderResponse());
    }

    /**
     * Description: 创建船公司did账户
     * Summary: 创建船公司did账户
     */
    public CreateDidCarrierResponse createDidCarrier(CreateDidCarrierRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDidCarrierEx(request, headers, runtime);
    }

    /**
     * Description: 创建船公司did账户
     * Summary: 创建船公司did账户
     */
    public CreateDidCarrierResponse createDidCarrierEx(CreateDidCarrierRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.did.carrier.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDidCarrierResponse());
    }

    /**
     * Description:  货代授权
     * Summary:  货代授权
     */
    public AuthSysForwarderResponse authSysForwarder(AuthSysForwarderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authSysForwarderEx(request, headers, runtime);
    }

    /**
     * Description:  货代授权
     * Summary:  货代授权
     */
    public AuthSysForwarderResponse authSysForwarderEx(AuthSysForwarderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.sys.forwarder.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthSysForwarderResponse());
    }

    /**
     * Description: master提单信息查询
     * Summary: master提单信息查询
     */
    public QueryBizMasterblResponse queryBizMasterbl(QueryBizMasterblRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBizMasterblEx(request, headers, runtime);
    }

    /**
     * Description: master提单信息查询
     * Summary: master提单信息查询
     */
    public QueryBizMasterblResponse queryBizMasterblEx(QueryBizMasterblRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.masterbl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBizMasterblResponse());
    }

    /**
     * Description: 应付发票文件上传接口
     * Summary: 应付发票文件上传接口
     */
    public SaveBizPayinvoicefileResponse saveBizPayinvoicefile(SaveBizPayinvoicefileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBizPayinvoicefileEx(request, headers, runtime);
    }

    /**
     * Description: 应付发票文件上传接口
     * Summary: 应付发票文件上传接口
     */
    public SaveBizPayinvoicefileResponse saveBizPayinvoicefileEx(SaveBizPayinvoicefileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biz.payinvoicefile.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBizPayinvoicefileResponse());
    }

    /**
     * Description: 托运订单保存接口
     * Summary: 托运订单保存接口
     */
    public SaveBiznewOrderResponse saveBiznewOrder(SaveBiznewOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBiznewOrderEx(request, headers, runtime);
    }

    /**
     * Description: 托运订单保存接口
     * Summary: 托运订单保存接口
     */
    public SaveBiznewOrderResponse saveBiznewOrderEx(SaveBiznewOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biznew.order.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBiznewOrderResponse());
    }

    /**
     * Description: 订舱单创建接口
     * Summary: 订舱单创建接口
     */
    public SaveBiznewBookingResponse saveBiznewBooking(SaveBiznewBookingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBiznewBookingEx(request, headers, runtime);
    }

    /**
     * Description: 订舱单创建接口
     * Summary: 订舱单创建接口
     */
    public SaveBiznewBookingResponse saveBiznewBookingEx(SaveBiznewBookingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biznew.booking.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBiznewBookingResponse());
    }

    /**
     * Description: 拖车单保存接口
     * Summary: 拖车单保存接口
     */
    public SaveBiznewVehicleResponse saveBiznewVehicle(SaveBiznewVehicleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBiznewVehicleEx(request, headers, runtime);
    }

    /**
     * Description: 拖车单保存接口
     * Summary: 拖车单保存接口
     */
    public SaveBiznewVehicleResponse saveBiznewVehicleEx(SaveBiznewVehicleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biznew.vehicle.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBiznewVehicleResponse());
    }

    /**
     * Description: 报关单保存接口
     * Summary: 报关单保存接口
     */
    public SaveBiznewCustomsResponse saveBiznewCustoms(SaveBiznewCustomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBiznewCustomsEx(request, headers, runtime);
    }

    /**
     * Description: 报关单保存接口
     * Summary: 报关单保存接口
     */
    public SaveBiznewCustomsResponse saveBiznewCustomsEx(SaveBiznewCustomsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biznew.customs.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBiznewCustomsResponse());
    }

    /**
     * Description: 航运提单保存接口
     * Summary: 航运提单保存接口
     */
    public SaveBiznewMasterResponse saveBiznewMaster(SaveBiznewMasterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBiznewMasterEx(request, headers, runtime);
    }

    /**
     * Description: 航运提单保存接口
     * Summary: 航运提单保存接口
     */
    public SaveBiznewMasterResponse saveBiznewMasterEx(SaveBiznewMasterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biznew.master.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBiznewMasterResponse());
    }

    /**
     * Description: 应付账单保存接口
     * Summary: 应付账单保存接口
     */
    public SaveBiznewPaybillorderResponse saveBiznewPaybillorder(SaveBiznewPaybillorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBiznewPaybillorderEx(request, headers, runtime);
    }

    /**
     * Description: 应付账单保存接口
     * Summary: 应付账单保存接口
     */
    public SaveBiznewPaybillorderResponse saveBiznewPaybillorderEx(SaveBiznewPaybillorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biznew.paybillorder.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBiznewPaybillorderResponse());
    }

    /**
     * Description: 应收账单保存接口
     * Summary: 应收账单保存接口
     */
    public SaveBiznewReceiptbillorderResponse saveBiznewReceiptbillorder(SaveBiznewReceiptbillorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBiznewReceiptbillorderEx(request, headers, runtime);
    }

    /**
     * Description: 应收账单保存接口
     * Summary: 应收账单保存接口
     */
    public SaveBiznewReceiptbillorderResponse saveBiznewReceiptbillorderEx(SaveBiznewReceiptbillorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biznew.receiptbillorder.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBiznewReceiptbillorderResponse());
    }

    /**
     * Description: 航运发票保存接口
     * Summary: 航运发票保存接口
     */
    public SaveBiznewInvoiceResponse saveBiznewInvoice(SaveBiznewInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveBiznewInvoiceEx(request, headers, runtime);
    }

    /**
     * Description: 航运发票保存接口
     * Summary: 航运发票保存接口
     */
    public SaveBiznewInvoiceResponse saveBiznewInvoiceEx(SaveBiznewInvoiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.biznew.invoice.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveBiznewInvoiceResponse());
    }

    /**
     * Description: 上传电子提单
     * Summary: 上传电子提单
     */
    public UploadShippingEblResponse uploadShippingEbl(UploadShippingEblRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadShippingEblEx(request, headers, runtime);
    }

    /**
     * Description: 上传电子提单
     * Summary: 上传电子提单
     */
    public UploadShippingEblResponse uploadShippingEblEx(UploadShippingEblRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.shipping.ebl.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadShippingEblResponse());
    }

    /**
     * Description: 电子提单批次上传，一个I批次下传递多个提单
     * Summary: 电子提单批次上传
     */
    public UploadShippingEblbatchResponse uploadShippingEblbatch(UploadShippingEblbatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadShippingEblbatchEx(request, headers, runtime);
    }

    /**
     * Description: 电子提单批次上传，一个I批次下传递多个提单
     * Summary: 电子提单批次上传
     */
    public UploadShippingEblbatchResponse uploadShippingEblbatchEx(UploadShippingEblbatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.shipping.eblbatch.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadShippingEblbatchResponse());
    }

    /**
     * Description: 感知收货人提单状态的变更
     * Summary: 电子提单批次状态变更
     */
    public UpdateShippingEblbatchstatusResponse updateShippingEblbatchstatus(UpdateShippingEblbatchstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateShippingEblbatchstatusEx(request, headers, runtime);
    }

    /**
     * Description: 感知收货人提单状态的变更
     * Summary: 电子提单批次状态变更
     */
    public UpdateShippingEblbatchstatusResponse updateShippingEblbatchstatusEx(UpdateShippingEblbatchstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "digital.logistic.shipping.eblbatchstatus.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateShippingEblbatchstatusResponse());
    }
}
