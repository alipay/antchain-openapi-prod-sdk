// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.securitytech.models.*;

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
                    new TeaPair("sdk_version", "1.4.5"),
                    new TeaPair("_prod_code", "SECURITYTECH"),
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
     * Description: 安全科技网关通用运行接口
     * Summary: 安全科技网关通用运行接口
     */
    public RunGeneralResponse runGeneral(RunGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runGeneralEx(request, headers, runtime);
    }

    /**
     * Description: 安全科技网关通用运行接口
     * Summary: 安全科技网关通用运行接口
     */
    public RunGeneralResponse runGeneralEx(RunGeneralRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.general.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunGeneralResponse());
    }

    /**
     * Description: 租赁住房保险产品，开放接口
    调用方：上海远点网络科技有限公司
     * Summary: 租赁住房保险产品，接口开放给租房平台
     */
    public ExecEkytInsureResponse execEkytInsure(ExecEkytInsureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execEkytInsureEx(request, headers, runtime);
    }

    /**
     * Description: 租赁住房保险产品，开放接口
    调用方：上海远点网络科技有限公司
     * Summary: 租赁住房保险产品，接口开放给租房平台
     */
    public ExecEkytInsureResponse execEkytInsureEx(ExecEkytInsureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.insure.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecEkytInsureResponse());
    }

    /**
     * Description: 获取EKYT平台入驻的车队信息列表
     * Summary: 获取EKYT平台入驻的车队信息列表
     */
    public ListDcpResponse listDcp(ListDcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDcpEx(request, headers, runtime);
    }

    /**
     * Description: 获取EKYT平台入驻的车队信息列表
     * Summary: 获取EKYT平台入驻的车队信息列表
     */
    public ListDcpResponse listDcpEx(ListDcpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.dcp.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDcpResponse());
    }

    /**
     * Description: 获取EKYT平台入驻的司机灵工卡信息列表
     * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
     */
    public ListDcpAccountbookResponse listDcpAccountbook(ListDcpAccountbookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDcpAccountbookEx(request, headers, runtime);
    }

    /**
     * Description: 获取EKYT平台入驻的司机灵工卡信息列表
     * Summary: 获取EKYT平台入驻的司机灵工卡信息列表
     */
    public ListDcpAccountbookResponse listDcpAccountbookEx(ListDcpAccountbookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.dcp.accountbook.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDcpAccountbookResponse());
    }

    /**
     * Description: 企业ETC入驻车辆查询
     * Summary: 企业ETC入驻车辆查询
     */
    public QueryEtcVehicleResponse queryEtcVehicle(QueryEtcVehicleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEtcVehicleEx(request, headers, runtime);
    }

    /**
     * Description: 企业ETC入驻车辆查询
     * Summary: 企业ETC入驻车辆查询
     */
    public QueryEtcVehicleResponse queryEtcVehicleEx(QueryEtcVehicleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.etc.vehicle.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEtcVehicleResponse());
    }

    /**
     * Description: 企业ETC运单上传
     * Summary: 企业ETC运单上传
     */
    public UploadEtcWaybillResponse uploadEtcWaybill(UploadEtcWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadEtcWaybillEx(request, headers, runtime);
    }

    /**
     * Description: 企业ETC运单上传
     * Summary: 企业ETC运单上传
     */
    public UploadEtcWaybillResponse uploadEtcWaybillEx(UploadEtcWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.etc.waybill.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadEtcWaybillResponse());
    }

    /**
     * Description: 企业ETC车辆行程查询
     * Summary: 企业ETC车辆行程查询
     */
    public QueryEtcTripResponse queryEtcTrip(QueryEtcTripRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEtcTripEx(request, headers, runtime);
    }

    /**
     * Description: 企业ETC车辆行程查询
     * Summary: 企业ETC车辆行程查询
     */
    public QueryEtcTripResponse queryEtcTripEx(QueryEtcTripRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.etc.trip.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEtcTripResponse());
    }

    /**
     * Description: 两轮车一体机获取授权登录地址
     * Summary: 两轮车一体机获取授权登录地址
     */
    public InitSimLoginResponse initSimLogin(InitSimLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initSimLoginEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机获取授权登录地址
     * Summary: 两轮车一体机获取授权登录地址
     */
    public InitSimLoginResponse initSimLoginEx(InitSimLoginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.login.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitSimLoginResponse());
    }

    /**
     * Description: 两轮车一体机查询登录结果
     * Summary: 两轮车一体机查询登录结果
     */
    public QuerySimLoginResponse querySimLogin(QuerySimLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySimLoginEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机查询登录结果
     * Summary: 两轮车一体机查询登录结果
     */
    public QuerySimLoginResponse querySimLoginEx(QuerySimLoginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.login.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySimLoginResponse());
    }

    /**
     * Description: 两轮车一体机获取营销活动
     * Summary: 两轮车一体机获取营销活动
     */
    public ListSimCampaignResponse listSimCampaign(ListSimCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimCampaignEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机获取营销活动
     * Summary: 两轮车一体机获取营销活动
     */
    public ListSimCampaignResponse listSimCampaignEx(ListSimCampaignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.campaign.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSimCampaignResponse());
    }

    /**
     * Description: 两轮车一体机查询车辆SKU
     * Summary: 两轮车一体机查询车辆SKU
     */
    public QuerySimSkuResponse querySimSku(QuerySimSkuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySimSkuEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机查询车辆SKU
     * Summary: 两轮车一体机查询车辆SKU
     */
    public QuerySimSkuResponse querySimSkuEx(QuerySimSkuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySimSkuResponse());
    }

    /**
     * Description: 两轮车一体机列举车辆SKU
     * Summary: 两轮车一体机列举车辆SKU
     */
    public ListSimSkuResponse listSimSku(ListSimSkuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimSkuEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机列举车辆SKU
     * Summary: 两轮车一体机列举车辆SKU
     */
    public ListSimSkuResponse listSimSkuEx(ListSimSkuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSimSkuResponse());
    }

    /**
     * Description: 两轮车一体机创建订单信息
     * Summary: 两轮车一体机创建订单信息
     */
    public CreateSimOrderResponse createSimOrder(CreateSimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSimOrderEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机创建订单信息
     * Summary: 两轮车一体机创建订单信息
     */
    public CreateSimOrderResponse createSimOrderEx(CreateSimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSimOrderResponse());
    }

    /**
     * Description: 两轮车一体机查询订单信息
     * Summary: 两轮车一体机查询订单信息
     */
    public QuerySimOrderResponse querySimOrder(QuerySimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySimOrderEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机查询订单信息
     * Summary: 两轮车一体机查询订单信息
     */
    public QuerySimOrderResponse querySimOrderEx(QuerySimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySimOrderResponse());
    }

    /**
     * Description: 两轮车一体机列举订单信息
     * Summary: 两轮车一体机列举订单信息
     */
    public ListSimOrderResponse listSimOrder(ListSimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimOrderEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机列举订单信息
     * Summary: 两轮车一体机列举订单信息
     */
    public ListSimOrderResponse listSimOrderEx(ListSimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSimOrderResponse());
    }

    /**
     * Description: 两轮车一体机取消订单信息
     * Summary: 两轮车一体机取消订单信息
     */
    public CancelSimOrderResponse cancelSimOrder(CancelSimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSimOrderEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机取消订单信息
     * Summary: 两轮车一体机取消订单信息
     */
    public CancelSimOrderResponse cancelSimOrderEx(CancelSimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSimOrderResponse());
    }

    /**
     * Description: 两轮车一体机拉取车辆SKU
     * Summary: 两轮车一体机拉取车辆SKU
     */
    public PullSimSkuResponse pullSimSku(PullSimSkuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullSimSkuEx(request, headers, runtime);
    }

    /**
     * Description: 两轮车一体机拉取车辆SKU
     * Summary: 两轮车一体机拉取车辆SKU
     */
    public PullSimSkuResponse pullSimSkuEx(PullSimSkuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullSimSkuResponse());
    }

    /**
     * Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成
     */
    public CreateBssecpicResponse createBssecpic(CreateBssecpicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBssecpicEx(request, headers, runtime);
    }

    /**
     * Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成
     */
    public CreateBssecpicResponse createBssecpicEx(CreateBssecpicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.bssecpic.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBssecpicResponse());
    }

    /**
     * Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成
     */
    public CreateBlueshieldSecuritypictureResponse createBlueshieldSecuritypicture(CreateBlueshieldSecuritypictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlueshieldSecuritypictureEx(request, headers, runtime);
    }

    /**
     * Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成
     */
    public CreateBlueshieldSecuritypictureResponse createBlueshieldSecuritypictureEx(CreateBlueshieldSecuritypictureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlueshieldSecuritypictureResponse());
    }

    /**
     * Description: 终端安全人脸盾Native查询
     * Summary: 人脸盾Native查询
     */
    public QueryFaceshieldNativeResponse queryFaceshieldNative(QueryFaceshieldNativeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceshieldNativeEx(request, headers, runtime);
    }

    /**
     * Description: 终端安全人脸盾Native查询
     * Summary: 人脸盾Native查询
     */
    public QueryFaceshieldNativeResponse queryFaceshieldNativeEx(QueryFaceshieldNativeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceshieldNativeResponse());
    }

    /**
     * Description: 终端安全人脸盾Web查询
     * Summary: 人脸盾Web查询
     */
    public QueryFaceshieldWebResponse queryFaceshieldWeb(QueryFaceshieldWebRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceshieldWebEx(request, headers, runtime);
    }

    /**
     * Description: 终端安全人脸盾Web查询
     * Summary: 人脸盾Web查询
     */
    public QueryFaceshieldWebResponse queryFaceshieldWebEx(QueryFaceshieldWebRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceshieldWebResponse());
    }

    /**
     * Description: 设备激活
     * Summary: 可信设备认证设备初始化，设备激活
     */
    public InitIifaaDeviceResponse initIifaaDevice(InitIifaaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIifaaDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 设备激活
     * Summary: 可信设备认证设备初始化，设备激活
     */
    public InitIifaaDeviceResponse initIifaaDeviceEx(InitIifaaDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIifaaDeviceResponse());
    }

    /**
     * Description: 可信设备认证风险咨询，获取预认证数据
     * Summary: 可信设备认证风险咨询，获取预认证数据
     */
    public RecognizeIifaaDeviceResponse recognizeIifaaDevice(RecognizeIifaaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeIifaaDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 可信设备认证风险咨询，获取预认证数据
     * Summary: 可信设备认证风险咨询，获取预认证数据
     */
    public RecognizeIifaaDeviceResponse recognizeIifaaDeviceEx(RecognizeIifaaDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeIifaaDeviceResponse());
    }

    /**
     * Description: 可信设备认证，设备验证
     * Summary: 可信设备认证，设备验证
     */
    public VerifyIifaaDeviceResponse verifyIifaaDevice(VerifyIifaaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyIifaaDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 可信设备认证，设备验证
     * Summary: 可信设备认证，设备验证
     */
    public VerifyIifaaDeviceResponse verifyIifaaDeviceEx(VerifyIifaaDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyIifaaDeviceResponse());
    }

    /**
     * Description: 可信设备认证，产商注册
     * Summary: 可信设备认证，产商注册
     */
    public RegisterIifaaCorpResponse registerIifaaCorp(RegisterIifaaCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerIifaaCorpEx(request, headers, runtime);
    }

    /**
     * Description: 可信设备认证，产商注册
     * Summary: 可信设备认证，产商注册
     */
    public RegisterIifaaCorpResponse registerIifaaCorpEx(RegisterIifaaCorpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.corp.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterIifaaCorpResponse());
    }

    /**
     * Description: 可信设备认证，擦除设备信息
     * Summary: 可信设备认证，擦除设备信息
     */
    public DeprecateIifaaDeviceResponse deprecateIifaaDevice(DeprecateIifaaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deprecateIifaaDeviceEx(request, headers, runtime);
    }

    /**
     * Description: 可信设备认证，擦除设备信息
     * Summary: 可信设备认证，擦除设备信息
     */
    public DeprecateIifaaDeviceResponse deprecateIifaaDeviceEx(DeprecateIifaaDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.deprecate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeprecateIifaaDeviceResponse());
    }

    /**
     * Description: 巡检商业化
     * Summary: 巡检商业化
     */
    public RunXhunterSpiResponse runXhunterSpi(RunXhunterSpiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runXhunterSpiEx(request, headers, runtime);
    }

    /**
     * Description: 巡检商业化
     * Summary: 巡检商业化
     */
    public RunXhunterSpiResponse runXhunterSpiEx(RunXhunterSpiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.xhunter.spi.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunXhunterSpiResponse());
    }

    /**
     * Description: 租凭住房保险产品，接口开放给租房平台
     * Summary: 租凭住房保险产品，接口开放给租房平台
     */
    public ExecIifaaInsureResponse execIifaaInsure(ExecIifaaInsureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execIifaaInsureEx(request, headers, runtime);
    }

    /**
     * Description: 租凭住房保险产品，接口开放给租房平台
     * Summary: 租凭住房保险产品，接口开放给租房平台
     */
    public ExecIifaaInsureResponse execIifaaInsureEx(ExecIifaaInsureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.insure.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecIifaaInsureResponse());
    }

    /**
     * Description: 内容安全图片同步检测
     * Summary: 内容安全图片同步检测
     */
    public QueryCctPictureResponse queryCctPicture(QueryCctPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCctPictureEx(request, headers, runtime);
    }

    /**
     * Description: 内容安全图片同步检测
     * Summary: 内容安全图片同步检测
     */
    public QueryCctPictureResponse queryCctPictureEx(QueryCctPictureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.cct.picture.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCctPictureResponse());
    }

    /**
     * Description: 内容安全主站同步检测
     * Summary: 内容安全主站同步检测
     */
    public RecognizeCctAnalyzeResponse recognizeCctAnalyze(RecognizeCctAnalyzeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeCctAnalyzeEx(request, headers, runtime);
    }

    /**
     * Description: 内容安全主站同步检测
     * Summary: 内容安全主站同步检测
     */
    public RecognizeCctAnalyzeResponse recognizeCctAnalyzeEx(RecognizeCctAnalyzeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.cct.analyze.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeCctAnalyzeResponse());
    }

    /**
     * Description: RAAS数据服务统一接口
     * Summary: RAAS数据服务统一接口
     */
    public QueryRiskGeneralResponse queryRiskGeneral(QueryRiskGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskGeneralEx(request, headers, runtime);
    }

    /**
     * Description: RAAS数据服务统一接口
     * Summary: RAAS数据服务统一接口
     */
    public QueryRiskGeneralResponse queryRiskGeneralEx(QueryRiskGeneralRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.risk.general.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskGeneralResponse());
    }

    /**
     * Description: 设备指纹查询
     * Summary: 设备指纹查询
     */
    public QueryDeviceriskFingerResponse queryDeviceriskFinger(QueryDeviceriskFingerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceriskFingerEx(request, headers, runtime);
    }

    /**
     * Description: 设备指纹查询
     * Summary: 设备指纹查询
     */
    public QueryDeviceriskFingerResponse queryDeviceriskFingerEx(QueryDeviceriskFingerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceriskFingerResponse());
    }

    /**
     * Description: 风险标签查询
     * Summary: 风险标签查询
     */
    public QueryDeviceriskRisklabelResponse queryDeviceriskRisklabel(QueryDeviceriskRisklabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceriskRisklabelEx(request, headers, runtime);
    }

    /**
     * Description: 风险标签查询
     * Summary: 风险标签查询
     */
    public QueryDeviceriskRisklabelResponse queryDeviceriskRisklabelEx(QueryDeviceriskRisklabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.risklabel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceriskRisklabelResponse());
    }

    /**
     * Description: 设备风险查询
     * Summary: 设备风险查询
     */
    public QueryDeviceriskDeviceriskResponse queryDeviceriskDevicerisk(QueryDeviceriskDeviceriskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceriskDeviceriskEx(request, headers, runtime);
    }

    /**
     * Description: 设备风险查询
     * Summary: 设备风险查询
     */
    public QueryDeviceriskDeviceriskResponse queryDeviceriskDeviceriskEx(QueryDeviceriskDeviceriskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceriskDeviceriskResponse());
    }

    /**
     * Description: 设备信息上报
     * Summary: 设备信息上报
     */
    public SubmitDeviceriskReportResponse submitDeviceriskReport(SubmitDeviceriskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDeviceriskReportEx(request, headers, runtime);
    }

    /**
     * Description: 设备信息上报
     * Summary: 设备信息上报
     */
    public SubmitDeviceriskReportResponse submitDeviceriskReportEx(SubmitDeviceriskReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitDeviceriskReportResponse());
    }

    /**
     * Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机
     */
    public QueryEkytDriverResponse queryEkytDriver(QueryEkytDriverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEkytDriverEx(request, headers, runtime);
    }

    /**
     * Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机
     */
    public QueryEkytDriverResponse queryEkytDriverEx(QueryEkytDriverRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEkytDriverResponse());
    }

    /**
     * Description: 申请设备设备密钥
     * Summary: 申请设备设备密钥
     */
    public ApplyIifaaDevicekeyResponse applyIifaaDevicekey(ApplyIifaaDevicekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyIifaaDevicekeyEx(request, headers, runtime);
    }

    /**
     * Description: 申请设备设备密钥
     * Summary: 申请设备设备密钥
     */
    public ApplyIifaaDevicekeyResponse applyIifaaDevicekeyEx(ApplyIifaaDevicekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyIifaaDevicekeyResponse());
    }

    /**
     * Description: 设备风险咨询
     * Summary: 设备风险咨询
     */
    public QueryDeviceplusRiskqueryResponse queryDeviceplusRiskquery(QueryDeviceplusRiskqueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceplusRiskqueryEx(request, headers, runtime);
    }

    /**
     * Description: 设备风险咨询
     * Summary: 设备风险咨询
     */
    public QueryDeviceplusRiskqueryResponse queryDeviceplusRiskqueryEx(QueryDeviceplusRiskqueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.deviceplus.riskquery.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceplusRiskqueryResponse());
    }

    /**
     * Description: 设备风险咨询mpaas
     * Summary: 设备风险咨询mpaas
     */
    public QueryDeviceplusMpaasResponse queryDeviceplusMpaas(QueryDeviceplusMpaasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceplusMpaasEx(request, headers, runtime);
    }

    /**
     * Description: 设备风险咨询mpaas
     * Summary: 设备风险咨询mpaas
     */
    public QueryDeviceplusMpaasResponse queryDeviceplusMpaasEx(QueryDeviceplusMpaasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.deviceplus.mpaas.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceplusMpaasResponse());
    }

    /**
     * Description: 终端安全-Android应用加固-启动加固任务(包月)
     * Summary: 启动加固任务(包月)
     */
    public SubmitAshieldPeriodhardeningtaskResponse submitAshieldPeriodhardeningtask(SubmitAshieldPeriodhardeningtaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAshieldPeriodhardeningtaskEx(request, headers, runtime);
    }

    /**
     * Description: 终端安全-Android应用加固-启动加固任务(包月)
     * Summary: 启动加固任务(包月)
     */
    public SubmitAshieldPeriodhardeningtaskResponse submitAshieldPeriodhardeningtaskEx(SubmitAshieldPeriodhardeningtaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.periodhardeningtask.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAshieldPeriodhardeningtaskResponse());
    }

    /**
     * Description: 终端安全-Android应用加固-获取上传文件的临时URL
     * Summary: 获取上传文件的临时URL
     */
    public GetAshieldFiletokenResponse getAshieldFiletoken(GetAshieldFiletokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAshieldFiletokenEx(request, headers, runtime);
    }

    /**
     * Description: 终端安全-Android应用加固-获取上传文件的临时URL
     * Summary: 获取上传文件的临时URL
     */
    public GetAshieldFiletokenResponse getAshieldFiletokenEx(GetAshieldFiletokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.filetoken.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAshieldFiletokenResponse());
    }

    /**
     * Description: 终端安全-Android应用加固-启动加固任务
     * Summary: 启动加固任务(按次计费)
     */
    public SubmitAshieldHardeningtaskResponse submitAshieldHardeningtask(SubmitAshieldHardeningtaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAshieldHardeningtaskEx(request, headers, runtime);
    }

    /**
     * Description: 终端安全-Android应用加固-启动加固任务
     * Summary: 启动加固任务(按次计费)
     */
    public SubmitAshieldHardeningtaskResponse submitAshieldHardeningtaskEx(SubmitAshieldHardeningtaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningtask.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAshieldHardeningtaskResponse());
    }

    /**
     * Description: 终端安全-Android应用加固-查询加固任务进度
     * Summary: 查询加固任务进度
     */
    public GetAshieldHardeningtaskprocessResponse getAshieldHardeningtaskprocess(GetAshieldHardeningtaskprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAshieldHardeningtaskprocessEx(request, headers, runtime);
    }

    /**
     * Description: 终端安全-Android应用加固-查询加固任务进度
     * Summary: 查询加固任务进度
     */
    public GetAshieldHardeningtaskprocessResponse getAshieldHardeningtaskprocessEx(GetAshieldHardeningtaskprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningtaskprocess.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAshieldHardeningtaskprocessResponse());
    }

    /**
     * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
     * Summary: 查询加固后的产物下载链接
     */
    public GetAshieldHardeningresultResponse getAshieldHardeningresult(GetAshieldHardeningresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAshieldHardeningresultEx(request, headers, runtime);
    }

    /**
     * Description: 终端安全-Android应用加固-查询加固后的产物下载链接
     * Summary: 查询加固后的产物下载链接
     */
    public GetAshieldHardeningresultResponse getAshieldHardeningresultEx(GetAshieldHardeningresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningresult.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAshieldHardeningresultResponse());
    }

    /**
     * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
     * Summary: 查询加固后的日志下载链接
     */
    public GetAshieldHardeninglogResponse getAshieldHardeninglog(GetAshieldHardeninglogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAshieldHardeninglogEx(request, headers, runtime);
    }

    /**
     * Description: 终端安全-Android应用加固-查询加固后的日志下载链接
     * Summary: 查询加固后的日志下载链接
     */
    public GetAshieldHardeninglogResponse getAshieldHardeninglogEx(GetAshieldHardeninglogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeninglog.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAshieldHardeninglogResponse());
    }

    /**
     * Description: eKYT可信签约初始化
     * Summary: eKYT可信签约-初始化
     */
    public InitEkytTrustsignResponse initEkytTrustsign(InitEkytTrustsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEkytTrustsignEx(request, headers, runtime);
    }

    /**
     * Description: eKYT可信签约初始化
     * Summary: eKYT可信签约-初始化
     */
    public InitEkytTrustsignResponse initEkytTrustsignEx(InitEkytTrustsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.trustsign.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEkytTrustsignResponse());
    }

    /**
     * Description: eKYT可信签约签约单查询
     * Summary: eKYT可信签约-签约单查询
     */
    public QueryEkytTrustsignResponse queryEkytTrustsign(QueryEkytTrustsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEkytTrustsignEx(request, headers, runtime);
    }

    /**
     * Description: eKYT可信签约签约单查询
     * Summary: eKYT可信签约-签约单查询
     */
    public QueryEkytTrustsignResponse queryEkytTrustsignEx(QueryEkytTrustsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.trustsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEkytTrustsignResponse());
    }

    /**
     * Description: eKYT人脸核身初始化
     * Summary: eKYT人脸核身-初始化
     */
    public InitEkytFaceverifyResponse initEkytFaceverify(InitEkytFaceverifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEkytFaceverifyEx(request, headers, runtime);
    }

    /**
     * Description: eKYT人脸核身初始化
     * Summary: eKYT人脸核身-初始化
     */
    public InitEkytFaceverifyResponse initEkytFaceverifyEx(InitEkytFaceverifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.faceverify.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEkytFaceverifyResponse());
    }

    /**
     * Description: eKYT人脸核身结果查询
     * Summary: eKYT人脸核身-结果查询
     */
    public QueryEkytFaceverifyResponse queryEkytFaceverify(QueryEkytFaceverifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEkytFaceverifyEx(request, headers, runtime);
    }

    /**
     * Description: eKYT人脸核身结果查询
     * Summary: eKYT人脸核身-结果查询
     */
    public QueryEkytFaceverifyResponse queryEkytFaceverifyEx(QueryEkytFaceverifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.faceverify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEkytFaceverifyResponse());
    }

    /**
     * Description: 友活来了创建任务api
     * Summary: 友活来了创建任务api
     */
    public ImportYhllResponse importYhll(ImportYhllRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importYhllEx(request, headers, runtime);
    }

    /**
     * Description: 友活来了创建任务api
     * Summary: 友活来了创建任务api
     */
    public ImportYhllResponse importYhllEx(ImportYhllRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.yhll.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportYhllResponse());
    }

    /**
     * Description: 友活来了任务查询api
     * Summary: 友活来了任务查询api
     */
    public QueryYhllResponse queryYhll(QueryYhllRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYhllEx(request, headers, runtime);
    }

    /**
     * Description: 友活来了任务查询api
     * Summary: 友活来了任务查询api
     */
    public QueryYhllResponse queryYhllEx(QueryYhllRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.yhll.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYhllResponse());
    }

    /**
     * Description: 天鉴ask接口
     * Summary: 天鉴ask接口
     */
    public QueryGuardAskResponse queryGuardAsk(QueryGuardAskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardAskEx(request, headers, runtime);
    }

    /**
     * Description: 天鉴ask接口
     * Summary: 天鉴ask接口
     */
    public QueryGuardAskResponse queryGuardAskEx(QueryGuardAskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.guard.ask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardAskResponse());
    }

    /**
     * Description: 天鉴answer接口
     * Summary: 天鉴answer接口
     */
    public QueryGuardAnswerResponse queryGuardAnswer(QueryGuardAnswerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardAnswerEx(request, headers, runtime);
    }

    /**
     * Description: 天鉴answer接口
     * Summary: 天鉴answer接口
     */
    public QueryGuardAnswerResponse queryGuardAnswerEx(QueryGuardAnswerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.guard.answer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardAnswerResponse());
    }

    /**
     * Description: 开放给设备产商，删除数字钥匙
     * Summary: 删除数字钥匙
     */
    public DeleteIifaaDigitalkeyResponse deleteIifaaDigitalkey(DeleteIifaaDigitalkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIifaaDigitalkeyEx(request, headers, runtime);
    }

    /**
     * Description: 开放给设备产商，删除数字钥匙
     * Summary: 删除数字钥匙
     */
    public DeleteIifaaDigitalkeyResponse deleteIifaaDigitalkeyEx(DeleteIifaaDigitalkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.digitalkey.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteIifaaDigitalkeyResponse());
    }

    /**
     * Description: 光鉴智能凭证
     * Summary: 光鉴智能凭证
     */
    public CheckOpticalIdentifyResponse checkOpticalIdentify(CheckOpticalIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkOpticalIdentifyEx(request, headers, runtime);
    }

    /**
     * Description: 光鉴智能凭证
     * Summary: 光鉴智能凭证
     */
    public CheckOpticalIdentifyResponse checkOpticalIdentifyEx(CheckOpticalIdentifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.optical.identify.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckOpticalIdentifyResponse());
    }
}
