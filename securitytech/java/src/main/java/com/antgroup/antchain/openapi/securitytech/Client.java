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
                    new TeaPair("sdk_version", "1.4.18"),
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
     * <b>description</b> :
     * <p>Description: 安全科技网关通用运行接口
     * Summary: 安全科技网关通用运行接口</p>
     */
    public RunGeneralResponse runGeneral(RunGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runGeneralEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 安全科技网关通用运行接口
     * Summary: 安全科技网关通用运行接口</p>
     */
    public RunGeneralResponse runGeneralEx(RunGeneralRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.general.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunGeneralResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁住房保险产品，开放接口
     * 调用方：上海远点网络科技有限公司
     * Summary: 租赁住房保险产品，接口开放给租房平台</p>
     */
    public ExecEkytInsureResponse execEkytInsure(ExecEkytInsureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execEkytInsureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁住房保险产品，开放接口
     * 调用方：上海远点网络科技有限公司
     * Summary: 租赁住房保险产品，接口开放给租房平台</p>
     */
    public ExecEkytInsureResponse execEkytInsureEx(ExecEkytInsureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.insure.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecEkytInsureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取EKYT平台入驻的车队信息列表
     * Summary: 获取EKYT平台入驻的车队信息列表</p>
     */
    public ListDcpResponse listDcp(ListDcpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDcpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取EKYT平台入驻的车队信息列表
     * Summary: 获取EKYT平台入驻的车队信息列表</p>
     */
    public ListDcpResponse listDcpEx(ListDcpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.dcp.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDcpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取EKYT平台入驻的司机灵工卡信息列表
     * Summary: 获取EKYT平台入驻的司机灵工卡信息列表</p>
     */
    public ListDcpAccountbookResponse listDcpAccountbook(ListDcpAccountbookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDcpAccountbookEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取EKYT平台入驻的司机灵工卡信息列表
     * Summary: 获取EKYT平台入驻的司机灵工卡信息列表</p>
     */
    public ListDcpAccountbookResponse listDcpAccountbookEx(ListDcpAccountbookRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.dcp.accountbook.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDcpAccountbookResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业ETC入驻车辆查询
     * Summary: 企业ETC入驻车辆查询</p>
     */
    public QueryEtcVehicleResponse queryEtcVehicle(QueryEtcVehicleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEtcVehicleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业ETC入驻车辆查询
     * Summary: 企业ETC入驻车辆查询</p>
     */
    public QueryEtcVehicleResponse queryEtcVehicleEx(QueryEtcVehicleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.etc.vehicle.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEtcVehicleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业ETC运单上传
     * Summary: 企业ETC运单上传</p>
     */
    public UploadEtcWaybillResponse uploadEtcWaybill(UploadEtcWaybillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadEtcWaybillEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业ETC运单上传
     * Summary: 企业ETC运单上传</p>
     */
    public UploadEtcWaybillResponse uploadEtcWaybillEx(UploadEtcWaybillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.etc.waybill.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadEtcWaybillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业ETC车辆行程查询
     * Summary: 企业ETC车辆行程查询</p>
     */
    public QueryEtcTripResponse queryEtcTrip(QueryEtcTripRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEtcTripEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业ETC车辆行程查询
     * Summary: 企业ETC车辆行程查询</p>
     */
    public QueryEtcTripResponse queryEtcTripEx(QueryEtcTripRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.etc.trip.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEtcTripResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机获取授权登录地址
     * Summary: 两轮车一体机获取授权登录地址</p>
     */
    public InitSimLoginResponse initSimLogin(InitSimLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initSimLoginEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机获取授权登录地址
     * Summary: 两轮车一体机获取授权登录地址</p>
     */
    public InitSimLoginResponse initSimLoginEx(InitSimLoginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.login.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitSimLoginResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机查询登录结果
     * Summary: 两轮车一体机查询登录结果</p>
     */
    public QuerySimLoginResponse querySimLogin(QuerySimLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySimLoginEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机查询登录结果
     * Summary: 两轮车一体机查询登录结果</p>
     */
    public QuerySimLoginResponse querySimLoginEx(QuerySimLoginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.login.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySimLoginResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机获取营销活动
     * Summary: 两轮车一体机获取营销活动</p>
     */
    public ListSimCampaignResponse listSimCampaign(ListSimCampaignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimCampaignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机获取营销活动
     * Summary: 两轮车一体机获取营销活动</p>
     */
    public ListSimCampaignResponse listSimCampaignEx(ListSimCampaignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.campaign.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSimCampaignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机查询车辆SKU
     * Summary: 两轮车一体机查询车辆SKU</p>
     */
    public QuerySimSkuResponse querySimSku(QuerySimSkuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySimSkuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机查询车辆SKU
     * Summary: 两轮车一体机查询车辆SKU</p>
     */
    public QuerySimSkuResponse querySimSkuEx(QuerySimSkuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySimSkuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机列举车辆SKU
     * Summary: 两轮车一体机列举车辆SKU</p>
     */
    public ListSimSkuResponse listSimSku(ListSimSkuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimSkuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机列举车辆SKU
     * Summary: 两轮车一体机列举车辆SKU</p>
     */
    public ListSimSkuResponse listSimSkuEx(ListSimSkuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSimSkuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机创建订单信息
     * Summary: 两轮车一体机创建订单信息</p>
     */
    public CreateSimOrderResponse createSimOrder(CreateSimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSimOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机创建订单信息
     * Summary: 两轮车一体机创建订单信息</p>
     */
    public CreateSimOrderResponse createSimOrderEx(CreateSimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSimOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机查询订单信息
     * Summary: 两轮车一体机查询订单信息</p>
     */
    public QuerySimOrderResponse querySimOrder(QuerySimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySimOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机查询订单信息
     * Summary: 两轮车一体机查询订单信息</p>
     */
    public QuerySimOrderResponse querySimOrderEx(QuerySimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySimOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机列举订单信息
     * Summary: 两轮车一体机列举订单信息</p>
     */
    public ListSimOrderResponse listSimOrder(ListSimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSimOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机列举订单信息
     * Summary: 两轮车一体机列举订单信息</p>
     */
    public ListSimOrderResponse listSimOrderEx(ListSimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListSimOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机取消订单信息
     * Summary: 两轮车一体机取消订单信息</p>
     */
    public CancelSimOrderResponse cancelSimOrder(CancelSimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelSimOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机取消订单信息
     * Summary: 两轮车一体机取消订单信息</p>
     */
    public CancelSimOrderResponse cancelSimOrderEx(CancelSimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelSimOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机拉取车辆SKU
     * Summary: 两轮车一体机拉取车辆SKU</p>
     */
    public PullSimSkuResponse pullSimSku(PullSimSkuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullSimSkuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机拉取车辆SKU
     * Summary: 两轮车一体机拉取车辆SKU</p>
     */
    public PullSimSkuResponse pullSimSkuEx(PullSimSkuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.sku.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullSimSkuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 一体机购车订单支付确认请求
     * Summary: 一体机购车订单支付确认请求</p>
     */
    public ConfirmSimOrderResponse confirmSimOrder(ConfirmSimOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmSimOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 一体机购车订单支付确认请求
     * Summary: 一体机购车订单支付确认请求</p>
     */
    public ConfirmSimOrderResponse confirmSimOrderEx(ConfirmSimOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.order.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmSimOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 门店一体机车辆码上传解析接口
     * Summary: 门店一体机车辆码上传解析接口</p>
     */
    public UploadSimQrcodeResponse uploadSimQrcode(UploadSimQrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSimQrcodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 门店一体机车辆码上传解析接口
     * Summary: 门店一体机车辆码上传解析接口</p>
     */
    public UploadSimQrcodeResponse uploadSimQrcodeEx(UploadSimQrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.qrcode.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadSimQrcodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询spu列表
     * Summary: 两轮车一体机列举车辆SPU</p>
     */
    public QuerySpuListResponse querySpuList(QuerySpuListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySpuListEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询spu列表
     * Summary: 两轮车一体机列举车辆SPU</p>
     */
    public QuerySpuListResponse querySpuListEx(QuerySpuListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.spu.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySpuListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机轮询门店签约结果
     * Summary: 两轮车一体机轮询门店签约结果</p>
     */
    public QueryLoginSignResponse queryLoginSign(QueryLoginSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLoginSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 两轮车一体机轮询门店签约结果
     * Summary: 两轮车一体机轮询门店签约结果</p>
     */
    public QueryLoginSignResponse queryLoginSignEx(QueryLoginSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.login.sign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLoginSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 刷新订单链接
     * Summary: 刷新订单链接</p>
     */
    public ResetOrderLinkResponse resetOrderLink(ResetOrderLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetOrderLinkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 刷新订单链接
     * Summary: 刷新订单链接</p>
     */
    public ResetOrderLinkResponse resetOrderLinkEx(ResetOrderLinkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.order.link.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetOrderLinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 一体机风控信息上传接口
     * Summary: 一体机风控信息上传接口</p>
     */
    public UploadSimRiskdataResponse uploadSimRiskdata(UploadSimRiskdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadSimRiskdataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 一体机风控信息上传接口
     * Summary: 一体机风控信息上传接口</p>
     */
    public UploadSimRiskdataResponse uploadSimRiskdataEx(UploadSimRiskdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.sim.riskdata.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadSimRiskdataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成</p>
     */
    public CreateBssecpicResponse createBssecpic(CreateBssecpicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBssecpicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成</p>
     */
    public CreateBssecpicResponse createBssecpicEx(CreateBssecpicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.bssecpic.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBssecpicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成</p>
     */
    public CreateBlueshieldSecuritypictureResponse createBlueshieldSecuritypicture(CreateBlueshieldSecuritypictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBlueshieldSecuritypictureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蓝盾安全图片生成
     * Summary: 蓝盾安全图片生成</p>
     */
    public CreateBlueshieldSecuritypictureResponse createBlueshieldSecuritypictureEx(CreateBlueshieldSecuritypictureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.blueshield.securitypicture.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBlueshieldSecuritypictureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全人脸盾Native查询
     * Summary: 人脸盾Native查询</p>
     */
    public QueryFaceshieldNativeResponse queryFaceshieldNative(QueryFaceshieldNativeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceshieldNativeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全人脸盾Native查询
     * Summary: 人脸盾Native查询</p>
     */
    public QueryFaceshieldNativeResponse queryFaceshieldNativeEx(QueryFaceshieldNativeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.faceshield.native.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceshieldNativeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全人脸盾Web查询
     * Summary: 人脸盾Web查询</p>
     */
    public QueryFaceshieldWebResponse queryFaceshieldWeb(QueryFaceshieldWebRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFaceshieldWebEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全人脸盾Web查询
     * Summary: 人脸盾Web查询</p>
     */
    public QueryFaceshieldWebResponse queryFaceshieldWebEx(QueryFaceshieldWebRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.faceshield.web.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFaceshieldWebResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备激活
     * Summary: 可信设备认证设备初始化，设备激活</p>
     */
    public InitIifaaDeviceResponse initIifaaDevice(InitIifaaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIifaaDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备激活
     * Summary: 可信设备认证设备初始化，设备激活</p>
     */
    public InitIifaaDeviceResponse initIifaaDeviceEx(InitIifaaDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIifaaDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信设备认证风险咨询，获取预认证数据
     * Summary: 可信设备认证风险咨询，获取预认证数据</p>
     */
    public RecognizeIifaaDeviceResponse recognizeIifaaDevice(RecognizeIifaaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeIifaaDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信设备认证风险咨询，获取预认证数据
     * Summary: 可信设备认证风险咨询，获取预认证数据</p>
     */
    public RecognizeIifaaDeviceResponse recognizeIifaaDeviceEx(RecognizeIifaaDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeIifaaDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信设备认证，设备验证
     * Summary: 可信设备认证，设备验证</p>
     */
    public VerifyIifaaDeviceResponse verifyIifaaDevice(VerifyIifaaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyIifaaDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信设备认证，设备验证
     * Summary: 可信设备认证，设备验证</p>
     */
    public VerifyIifaaDeviceResponse verifyIifaaDeviceEx(VerifyIifaaDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyIifaaDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信设备认证，产商注册
     * Summary: 可信设备认证，产商注册</p>
     */
    public RegisterIifaaCorpResponse registerIifaaCorp(RegisterIifaaCorpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerIifaaCorpEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信设备认证，产商注册
     * Summary: 可信设备认证，产商注册</p>
     */
    public RegisterIifaaCorpResponse registerIifaaCorpEx(RegisterIifaaCorpRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.corp.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterIifaaCorpResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信设备认证，擦除设备信息
     * Summary: 可信设备认证，擦除设备信息</p>
     */
    public DeprecateIifaaDeviceResponse deprecateIifaaDevice(DeprecateIifaaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deprecateIifaaDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信设备认证，擦除设备信息
     * Summary: 可信设备认证，擦除设备信息</p>
     */
    public DeprecateIifaaDeviceResponse deprecateIifaaDeviceEx(DeprecateIifaaDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.device.deprecate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeprecateIifaaDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 巡检商业化
     * Summary: 巡检商业化</p>
     */
    public RunXhunterSpiResponse runXhunterSpi(RunXhunterSpiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runXhunterSpiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 巡检商业化
     * Summary: 巡检商业化</p>
     */
    public RunXhunterSpiResponse runXhunterSpiEx(RunXhunterSpiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.xhunter.spi.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunXhunterSpiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租凭住房保险产品，接口开放给租房平台
     * Summary: 租凭住房保险产品，接口开放给租房平台</p>
     */
    public ExecIifaaInsureResponse execIifaaInsure(ExecIifaaInsureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execIifaaInsureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租凭住房保险产品，接口开放给租房平台
     * Summary: 租凭住房保险产品，接口开放给租房平台</p>
     */
    public ExecIifaaInsureResponse execIifaaInsureEx(ExecIifaaInsureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.insure.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecIifaaInsureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内容安全图片同步检测
     * Summary: 内容安全图片同步检测</p>
     */
    public QueryCctPictureResponse queryCctPicture(QueryCctPictureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCctPictureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内容安全图片同步检测
     * Summary: 内容安全图片同步检测</p>
     */
    public QueryCctPictureResponse queryCctPictureEx(QueryCctPictureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.cct.picture.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCctPictureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内容安全主站同步检测
     * Summary: 内容安全主站同步检测</p>
     */
    public RecognizeCctAnalyzeResponse recognizeCctAnalyze(RecognizeCctAnalyzeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeCctAnalyzeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内容安全主站同步检测
     * Summary: 内容安全主站同步检测</p>
     */
    public RecognizeCctAnalyzeResponse recognizeCctAnalyzeEx(RecognizeCctAnalyzeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.cct.analyze.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeCctAnalyzeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: RAAS数据服务统一接口
     * Summary: RAAS数据服务统一接口</p>
     */
    public QueryRiskGeneralResponse queryRiskGeneral(QueryRiskGeneralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRiskGeneralEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: RAAS数据服务统一接口
     * Summary: RAAS数据服务统一接口</p>
     */
    public QueryRiskGeneralResponse queryRiskGeneralEx(QueryRiskGeneralRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.risk.general.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRiskGeneralResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备指纹查询
     * Summary: 设备指纹查询</p>
     */
    public QueryDeviceriskFingerResponse queryDeviceriskFinger(QueryDeviceriskFingerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceriskFingerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备指纹查询
     * Summary: 设备指纹查询</p>
     */
    public QueryDeviceriskFingerResponse queryDeviceriskFingerEx(QueryDeviceriskFingerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.finger.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceriskFingerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险标签查询
     * Summary: 风险标签查询</p>
     */
    public QueryDeviceriskRisklabelResponse queryDeviceriskRisklabel(QueryDeviceriskRisklabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceriskRisklabelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 风险标签查询
     * Summary: 风险标签查询</p>
     */
    public QueryDeviceriskRisklabelResponse queryDeviceriskRisklabelEx(QueryDeviceriskRisklabelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.risklabel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceriskRisklabelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备风险查询
     * Summary: 设备风险查询</p>
     */
    public QueryDeviceriskDeviceriskResponse queryDeviceriskDevicerisk(QueryDeviceriskDeviceriskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceriskDeviceriskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备风险查询
     * Summary: 设备风险查询</p>
     */
    public QueryDeviceriskDeviceriskResponse queryDeviceriskDeviceriskEx(QueryDeviceriskDeviceriskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.devicerisk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceriskDeviceriskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备信息上报
     * Summary: 设备信息上报</p>
     */
    public SubmitDeviceriskReportResponse submitDeviceriskReport(SubmitDeviceriskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDeviceriskReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备信息上报
     * Summary: 设备信息上报</p>
     */
    public SubmitDeviceriskReportResponse submitDeviceriskReportEx(SubmitDeviceriskReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.devicerisk.report.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitDeviceriskReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机</p>
     */
    public QueryEkytDriverResponse queryEkytDriver(QueryEkytDriverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEkytDriverEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT风险评估服务-出行场景司机
     * Summary: eKYT风险评估服务-出行场景司机</p>
     */
    public QueryEkytDriverResponse queryEkytDriverEx(QueryEkytDriverRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEkytDriverResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请设备设备密钥
     * Summary: 申请设备设备密钥</p>
     */
    public ApplyIifaaDevicekeyResponse applyIifaaDevicekey(ApplyIifaaDevicekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyIifaaDevicekeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请设备设备密钥
     * Summary: 申请设备设备密钥</p>
     */
    public ApplyIifaaDevicekeyResponse applyIifaaDevicekeyEx(ApplyIifaaDevicekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyIifaaDevicekeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备风险咨询
     * Summary: 设备风险咨询</p>
     */
    public QueryDeviceplusRiskqueryResponse queryDeviceplusRiskquery(QueryDeviceplusRiskqueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceplusRiskqueryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备风险咨询
     * Summary: 设备风险咨询</p>
     */
    public QueryDeviceplusRiskqueryResponse queryDeviceplusRiskqueryEx(QueryDeviceplusRiskqueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.deviceplus.riskquery.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceplusRiskqueryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备风险咨询mpaas
     * Summary: 设备风险咨询mpaas</p>
     */
    public QueryDeviceplusMpaasResponse queryDeviceplusMpaas(QueryDeviceplusMpaasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceplusMpaasEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备风险咨询mpaas
     * Summary: 设备风险咨询mpaas</p>
     */
    public QueryDeviceplusMpaasResponse queryDeviceplusMpaasEx(QueryDeviceplusMpaasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.deviceplus.mpaas.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceplusMpaasResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-启动加固任务(包月)
     * Summary: 启动加固任务(包月)</p>
     */
    public SubmitAshieldPeriodhardeningtaskResponse submitAshieldPeriodhardeningtask(SubmitAshieldPeriodhardeningtaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAshieldPeriodhardeningtaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-启动加固任务(包月)
     * Summary: 启动加固任务(包月)</p>
     */
    public SubmitAshieldPeriodhardeningtaskResponse submitAshieldPeriodhardeningtaskEx(SubmitAshieldPeriodhardeningtaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.periodhardeningtask.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAshieldPeriodhardeningtaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-获取上传文件的临时URL
     * Summary: 获取上传文件的临时URL</p>
     */
    public GetAshieldFiletokenResponse getAshieldFiletoken(GetAshieldFiletokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAshieldFiletokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-获取上传文件的临时URL
     * Summary: 获取上传文件的临时URL</p>
     */
    public GetAshieldFiletokenResponse getAshieldFiletokenEx(GetAshieldFiletokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.filetoken.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAshieldFiletokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-启动加固任务
     * Summary: 启动加固任务(按次计费)</p>
     */
    public SubmitAshieldHardeningtaskResponse submitAshieldHardeningtask(SubmitAshieldHardeningtaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAshieldHardeningtaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-启动加固任务
     * Summary: 启动加固任务(按次计费)</p>
     */
    public SubmitAshieldHardeningtaskResponse submitAshieldHardeningtaskEx(SubmitAshieldHardeningtaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningtask.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAshieldHardeningtaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-查询加固任务进度
     * Summary: 查询加固任务进度</p>
     */
    public GetAshieldHardeningtaskprocessResponse getAshieldHardeningtaskprocess(GetAshieldHardeningtaskprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAshieldHardeningtaskprocessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-查询加固任务进度
     * Summary: 查询加固任务进度</p>
     */
    public GetAshieldHardeningtaskprocessResponse getAshieldHardeningtaskprocessEx(GetAshieldHardeningtaskprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningtaskprocess.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAshieldHardeningtaskprocessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-查询加固后的产物下载链接
     * Summary: 查询加固后的产物下载链接</p>
     */
    public GetAshieldHardeningresultResponse getAshieldHardeningresult(GetAshieldHardeningresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAshieldHardeningresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-查询加固后的产物下载链接
     * Summary: 查询加固后的产物下载链接</p>
     */
    public GetAshieldHardeningresultResponse getAshieldHardeningresultEx(GetAshieldHardeningresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeningresult.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAshieldHardeningresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-查询加固后的日志下载链接
     * Summary: 查询加固后的日志下载链接</p>
     */
    public GetAshieldHardeninglogResponse getAshieldHardeninglog(GetAshieldHardeninglogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAshieldHardeninglogEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 终端安全-Android应用加固-查询加固后的日志下载链接
     * Summary: 查询加固后的日志下载链接</p>
     */
    public GetAshieldHardeninglogResponse getAshieldHardeninglogEx(GetAshieldHardeninglogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ashield.hardeninglog.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAshieldHardeninglogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT可信签约初始化
     * Summary: eKYT可信签约-初始化</p>
     */
    public InitEkytTrustsignResponse initEkytTrustsign(InitEkytTrustsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEkytTrustsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT可信签约初始化
     * Summary: eKYT可信签约-初始化</p>
     */
    public InitEkytTrustsignResponse initEkytTrustsignEx(InitEkytTrustsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.trustsign.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEkytTrustsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT可信签约签约单查询
     * Summary: eKYT可信签约-签约单查询</p>
     */
    public QueryEkytTrustsignResponse queryEkytTrustsign(QueryEkytTrustsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEkytTrustsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT可信签约签约单查询
     * Summary: eKYT可信签约-签约单查询</p>
     */
    public QueryEkytTrustsignResponse queryEkytTrustsignEx(QueryEkytTrustsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.trustsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEkytTrustsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT人脸核身初始化
     * Summary: eKYT人脸核身-初始化</p>
     */
    public InitEkytFaceverifyResponse initEkytFaceverify(InitEkytFaceverifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEkytFaceverifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT人脸核身初始化
     * Summary: eKYT人脸核身-初始化</p>
     */
    public InitEkytFaceverifyResponse initEkytFaceverifyEx(InitEkytFaceverifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.faceverify.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEkytFaceverifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT人脸核身结果查询
     * Summary: eKYT人脸核身-结果查询</p>
     */
    public QueryEkytFaceverifyResponse queryEkytFaceverify(QueryEkytFaceverifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEkytFaceverifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: eKYT人脸核身结果查询
     * Summary: eKYT人脸核身-结果查询</p>
     */
    public QueryEkytFaceverifyResponse queryEkytFaceverifyEx(QueryEkytFaceverifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.ekyt.faceverify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEkytFaceverifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 友活来了创建任务api
     * Summary: 友活来了创建任务api</p>
     */
    public ImportYhllResponse importYhll(ImportYhllRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importYhllEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 友活来了创建任务api
     * Summary: 友活来了创建任务api</p>
     */
    public ImportYhllResponse importYhllEx(ImportYhllRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.yhll.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportYhllResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 友活来了任务查询api
     * Summary: 友活来了任务查询api</p>
     */
    public QueryYhllResponse queryYhll(QueryYhllRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYhllEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 友活来了任务查询api
     * Summary: 友活来了任务查询api</p>
     */
    public QueryYhllResponse queryYhllEx(QueryYhllRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.yhll.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryYhllResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天鉴ask接口
     * Summary: 天鉴ask接口</p>
     */
    public QueryGuardAskResponse queryGuardAsk(QueryGuardAskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardAskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天鉴ask接口
     * Summary: 天鉴ask接口</p>
     */
    public QueryGuardAskResponse queryGuardAskEx(QueryGuardAskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.guard.ask.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardAskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 天鉴answer接口
     * Summary: 天鉴answer接口</p>
     */
    public QueryGuardAnswerResponse queryGuardAnswer(QueryGuardAnswerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGuardAnswerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 天鉴answer接口
     * Summary: 天鉴answer接口</p>
     */
    public QueryGuardAnswerResponse queryGuardAnswerEx(QueryGuardAnswerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.guard.answer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGuardAnswerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 开放给设备产商，删除数字钥匙
     * Summary: 删除数字钥匙</p>
     */
    public DeleteIifaaDigitalkeyResponse deleteIifaaDigitalkey(DeleteIifaaDigitalkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIifaaDigitalkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 开放给设备产商，删除数字钥匙
     * Summary: 删除数字钥匙</p>
     */
    public DeleteIifaaDigitalkeyResponse deleteIifaaDigitalkeyEx(DeleteIifaaDigitalkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.iifaa.digitalkey.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteIifaaDigitalkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 光鉴智能凭证
     * Summary: 光鉴智能凭证</p>
     */
    public CheckOpticalIdentifyResponse checkOpticalIdentify(CheckOpticalIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkOpticalIdentifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 光鉴智能凭证
     * Summary: 光鉴智能凭证</p>
     */
    public CheckOpticalIdentifyResponse checkOpticalIdentifyEx(CheckOpticalIdentifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antsecuritytech.gateway.optical.identify.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckOpticalIdentifyResponse());
    }
}
