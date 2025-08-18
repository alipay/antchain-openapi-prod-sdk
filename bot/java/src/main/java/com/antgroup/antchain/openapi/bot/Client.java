// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.bot.models.*;

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
                    new TeaPair("sdk_version", "1.12.32"),
                    new TeaPair("_prod_code", "BOT"),
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
     * <p>Description: acec提供的SPI服务开通接口
     * Summary: acec提供的SPI服务开通接口</p>
     */
    public OpenAcecContractResponse openAcecContract(OpenAcecContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openAcecContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: acec提供的SPI服务开通接口
     * Summary: acec提供的SPI服务开通接口</p>
     */
    public OpenAcecContractResponse openAcecContractEx(OpenAcecContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.acec.contract.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenAcecContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AI服务组提供的SPI服务停止接口
     * Summary: acec提供的SPI服务停止接口</p>
     */
    public StopAcecContractResponse stopAcecContract(StopAcecContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopAcecContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AI服务组提供的SPI服务停止接口
     * Summary: acec提供的SPI服务停止接口</p>
     */
    public StopAcecContractResponse stopAcecContractEx(StopAcecContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.acec.contract.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopAcecContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: acec提供的SPI服务复入接口
     * Summary: acec提供的SPI服务复入接口</p>
     */
    public ResumeAcecContractResponse resumeAcecContract(ResumeAcecContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeAcecContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: acec提供的SPI服务复入接口
     * Summary: acec提供的SPI服务复入接口</p>
     */
    public ResumeAcecContractResponse resumeAcecContractEx(ResumeAcecContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.acec.contract.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeAcecContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁智能中心实人认证创建服务
     * Summary: 租赁智能中心实人认证创建服务</p>
     */
    public CreateLeaseRealpersonResponse createLeaseRealperson(CreateLeaseRealpersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseRealpersonEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁智能中心实人认证创建服务
     * Summary: 租赁智能中心实人认证创建服务</p>
     */
    public CreateLeaseRealpersonResponse createLeaseRealpersonEx(CreateLeaseRealpersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.lease.realperson.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseRealpersonResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁智能中心实人认证查询服务
     * Summary: 租赁智能中心实人认证查询服务</p>
     */
    public QueryLeaseRealpersonResponse queryLeaseRealperson(QueryLeaseRealpersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRealpersonEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁智能中心实人认证查询服务
     * Summary: 租赁智能中心实人认证查询服务</p>
     */
    public QueryLeaseRealpersonResponse queryLeaseRealpersonEx(QueryLeaseRealpersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.lease.realperson.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRealpersonResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁智能中心风控查询服务
     * Summary: 租赁智能中心风控查询服务</p>
     */
    public QueryLeaseRiskResponse queryLeaseRisk(QueryLeaseRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRiskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁智能中心风控查询服务
     * Summary: 租赁智能中心风控查询服务</p>
     */
    public QueryLeaseRiskResponse queryLeaseRiskEx(QueryLeaseRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.lease.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-创建用户通行证
     * Summary: aiot-创建用户通行证</p>
     */
    public CreateXrUserticketResponse createXrUserticket(CreateXrUserticketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createXrUserticketEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-创建用户通行证
     * Summary: aiot-创建用户通行证</p>
     */
    public CreateXrUserticketResponse createXrUserticketEx(CreateXrUserticketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.userticket.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateXrUserticketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-获取通行证资源池列表
     * Summary: aiot-获取通行证资源池列表</p>
     */
    public ListXrXrticketpoolResponse listXrXrticketpool(ListXrXrticketpoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listXrXrticketpoolEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-获取通行证资源池列表
     * Summary: aiot-获取通行证资源池列表</p>
     */
    public ListXrXrticketpoolResponse listXrXrticketpoolEx(ListXrXrticketpoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListXrXrticketpoolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-分页查询用户通行证
     * Summary: aiot-分页查询用户通行证</p>
     */
    public PagequeryXrUserticketResponse pagequeryXrUserticket(PagequeryXrUserticketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryXrUserticketEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-分页查询用户通行证
     * Summary: aiot-分页查询用户通行证</p>
     */
    public PagequeryXrUserticketResponse pagequeryXrUserticketEx(PagequeryXrUserticketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.userticket.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryXrUserticketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-查询用户通行证
     * Summary: aiot-查询用户通行证</p>
     */
    public GetXrUserticketResponse getXrUserticket(GetXrUserticketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getXrUserticketEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-查询用户通行证
     * Summary: aiot-查询用户通行证</p>
     */
    public GetXrUserticketResponse getXrUserticketEx(GetXrUserticketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.userticket.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetXrUserticketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-核销用户通行证
     * Summary: aiot-核销用户通行证</p>
     */
    public OperateXrUserticketResponse operateXrUserticket(OperateXrUserticketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateXrUserticketEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-核销用户通行证
     * Summary: aiot-核销用户通行证</p>
     */
    public OperateXrUserticketResponse operateXrUserticketEx(OperateXrUserticketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.userticket.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateXrUserticketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-获取资源列表
     * Summary: aiot-获取资源列表</p>
     */
    public ListXrResourceResponse listXrResource(ListXrResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listXrResourceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-获取资源列表
     * Summary: aiot-获取资源列表</p>
     */
    public ListXrResourceResponse listXrResourceEx(ListXrResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.resource.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListXrResourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-核销实例分页查询
     * Summary: aiot-核销实例分页查询</p>
     */
    public PagequeryXrXrverificationmodelResponse pagequeryXrXrverificationmodel(PagequeryXrXrverificationmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryXrXrverificationmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-核销实例分页查询
     * Summary: aiot-核销实例分页查询</p>
     */
    public PagequeryXrXrverificationmodelResponse pagequeryXrXrverificationmodelEx(PagequeryXrXrverificationmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.xrverificationmodel.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryXrXrverificationmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-客户对应设备分页查询
     * Summary: aiot-客户对应设备分页查询</p>
     */
    public PagequeryXrCustomerdeviceResponse pagequeryXrCustomerdevice(PagequeryXrCustomerdeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryXrCustomerdeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-客户对应设备分页查询
     * Summary: aiot-客户对应设备分页查询</p>
     */
    public PagequeryXrCustomerdeviceResponse pagequeryXrCustomerdeviceEx(PagequeryXrCustomerdeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.customerdevice.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryXrCustomerdeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-xr通行证创建
     * Summary: aiot-xr通行证创建</p>
     */
    public CreateXrXrticketpoolResponse createXrXrticketpool(CreateXrXrticketpoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createXrXrticketpoolEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-xr通行证创建
     * Summary: aiot-xr通行证创建</p>
     */
    public CreateXrXrticketpoolResponse createXrXrticketpoolEx(CreateXrXrticketpoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateXrXrticketpoolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-xr通行证修改
     * Summary: aiot-xr通行证修改</p>
     */
    public UpdateXrXrticketpoolResponse updateXrXrticketpool(UpdateXrXrticketpoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateXrXrticketpoolEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-xr通行证修改
     * Summary: aiot-xr通行证修改</p>
     */
    public UpdateXrXrticketpoolResponse updateXrXrticketpoolEx(UpdateXrXrticketpoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateXrXrticketpoolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-xr通行证分页查询
     * Summary: aiot-xr通行证分页查询</p>
     */
    public PagequeryXrXrticketpoolResponse pagequeryXrXrticketpool(PagequeryXrXrticketpoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryXrXrticketpoolEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-xr通行证分页查询
     * Summary: aiot-xr通行证分页查询</p>
     */
    public PagequeryXrXrticketpoolResponse pagequeryXrXrticketpoolEx(PagequeryXrXrticketpoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryXrXrticketpoolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-同步设备屏幕状态
     * Summary: aiot-同步设备屏幕状态</p>
     */
    public SyncDeviceScreenstatusResponse syncDeviceScreenstatus(SyncDeviceScreenstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncDeviceScreenstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-同步设备屏幕状态
     * Summary: aiot-同步设备屏幕状态</p>
     */
    public SyncDeviceScreenstatusResponse syncDeviceScreenstatusEx(SyncDeviceScreenstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.screenstatus.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncDeviceScreenstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: xr通行证批量创建
     * Summary: xr通行证批量创建</p>
     */
    public BatchcreateXrXrticketpoolResponse batchcreateXrXrticketpool(BatchcreateXrXrticketpoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateXrXrticketpoolEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: xr通行证批量创建
     * Summary: xr通行证批量创建</p>
     */
    public BatchcreateXrXrticketpoolResponse batchcreateXrXrticketpoolEx(BatchcreateXrXrticketpoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateXrXrticketpoolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-获取资源实例列表
     * Summary: aiot-获取资源实例列表</p>
     */
    public ListXrXrverificationmodelinstanceResponse listXrXrverificationmodelinstance(ListXrXrverificationmodelinstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listXrXrverificationmodelinstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-获取资源实例列表
     * Summary: aiot-获取资源实例列表</p>
     */
    public ListXrXrverificationmodelinstanceResponse listXrXrverificationmodelinstanceEx(ListXrXrverificationmodelinstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.xrverificationmodelinstance.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListXrXrverificationmodelinstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-xr通行证详情查询
     * Summary: aiot-xr通行证详情查询</p>
     */
    public DetailXrXrticketpoolResponse detailXrXrticketpool(DetailXrXrticketpoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailXrXrticketpoolEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiot-xr通行证详情查询
     * Summary: aiot-xr通行证详情查询</p>
     */
    public DetailXrXrticketpoolResponse detailXrXrticketpoolEx(DetailXrXrticketpoolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.xr.xrticketpool.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailXrXrticketpoolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiotnextbs-openApi操作
     * Summary: aiotnextbs-openApi操作</p>
     */
    public OperateAiotnextbsOpenapiResponse operateAiotnextbsOpenapi(OperateAiotnextbsOpenapiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateAiotnextbsOpenapiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiotnextbs-openApi操作
     * Summary: aiotnextbs-openApi操作</p>
     */
    public OperateAiotnextbsOpenapiResponse operateAiotnextbsOpenapiEx(OperateAiotnextbsOpenapiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiotnextbs.openapi.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateAiotnextbsOpenapiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: aiotnext-节能项目设置照明模式
     * Summary: aiotnext-节能项目设置照明模式</p>
     */
    public SetEnergyprojectLightmodeResponse setEnergyprojectLightmode(SetEnergyprojectLightmodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setEnergyprojectLightmodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: aiotnext-节能项目设置照明模式
     * Summary: aiotnext-节能项目设置照明模式</p>
     */
    public SetEnergyprojectLightmodeResponse setEnergyprojectLightmodeEx(SetEnergyprojectLightmodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.energyproject.lightmode.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetEnergyprojectLightmodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 私有化配置推送回告API 
     * Summary: 私有化配置推送回告API </p>
     */
    public FinishTraceConfigResponse finishTraceConfig(FinishTraceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishTraceConfigEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 私有化配置推送回告API 
     * Summary: 私有化配置推送回告API </p>
     */
    public FinishTraceConfigResponse finishTraceConfigEx(FinishTraceConfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.trace.config.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishTraceConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: BAI提供的OCR服务接口
     * Summary: BAI提供的OCR服务</p>
     */
    public QueryBaiOcrResponse queryBaiOcr(QueryBaiOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBaiOcrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: BAI提供的OCR服务接口
     * Summary: BAI提供的OCR服务</p>
     */
    public QueryBaiOcrResponse queryBaiOcrEx(QueryBaiOcrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.bai.ocr.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBaiOcrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AI二维码验真
     * Summary: AI二维码验真</p>
     */
    public QueryAiidentificationQrcodeResponse queryAiidentificationQrcode(QueryAiidentificationQrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAiidentificationQrcodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AI二维码验真
     * Summary: AI二维码验真</p>
     */
    public QueryAiidentificationQrcodeResponse queryAiidentificationQrcodeEx(QueryAiidentificationQrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "blockchain.bot.aiidentification.qrcode.query"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                QueryAiidentificationQrcodeResponse queryAiidentificationQrcodeResponse = QueryAiidentificationQrcodeResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return queryAiidentificationQrcodeResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAiidentificationQrcodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AI商品鉴定
     * Summary: AI商品鉴定</p>
     */
    public QueryAiidentificationGoodsResponse queryAiidentificationGoods(QueryAiidentificationGoodsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAiidentificationGoodsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AI商品鉴定
     * Summary: AI商品鉴定</p>
     */
    public QueryAiidentificationGoodsResponse queryAiidentificationGoodsEx(QueryAiidentificationGoodsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.goods.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAiidentificationGoodsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品鉴定点图片检测
     * Summary: 商品鉴定点图片检测</p>
     */
    public CheckAiidentificationGoodspointResponse checkAiidentificationGoodspoint(CheckAiidentificationGoodspointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAiidentificationGoodspointEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品鉴定点图片检测
     * Summary: 商品鉴定点图片检测</p>
     */
    public CheckAiidentificationGoodspointResponse checkAiidentificationGoodspointEx(CheckAiidentificationGoodspointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.goodspoint.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAiidentificationGoodspointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 溯源码比对服务
     * Summary: AI溯源码验真</p>
     */
    public CheckAiidentificationQrcodeResponse checkAiidentificationQrcode(CheckAiidentificationQrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAiidentificationQrcodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 溯源码比对服务
     * Summary: AI溯源码验真</p>
     */
    public CheckAiidentificationQrcodeResponse checkAiidentificationQrcodeEx(CheckAiidentificationQrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAiidentificationQrcodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于生成溯源防伪码
     * Summary: 溯源防伪码生成接口</p>
     */
    public CreateAiidentificationQrcodeResponse createAiidentificationQrcode(CreateAiidentificationQrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAiidentificationQrcodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用于生成溯源防伪码
     * Summary: 溯源防伪码生成接口</p>
     */
    public CreateAiidentificationQrcodeResponse createAiidentificationQrcodeEx(CreateAiidentificationQrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAiidentificationQrcodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: B端二维码质检
     * Summary: B端二维码质检</p>
     */
    public VerifyAiidentificationQrcodeResponse verifyAiidentificationQrcode(VerifyAiidentificationQrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyAiidentificationQrcodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: B端二维码质检
     * Summary: B端二维码质检</p>
     */
    public VerifyAiidentificationQrcodeResponse verifyAiidentificationQrcodeEx(VerifyAiidentificationQrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyAiidentificationQrcodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品鉴定
     * Summary: 商品鉴定</p>
     */
    public QueryAiidentificationGoodspointResponse queryAiidentificationGoodspoint(QueryAiidentificationGoodspointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAiidentificationGoodspointEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品鉴定
     * Summary: 商品鉴定</p>
     */
    public QueryAiidentificationGoodspointResponse queryAiidentificationGoodspointEx(QueryAiidentificationGoodspointRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.goodspoint.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAiidentificationGoodspointResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AI商品数字指纹注册
     * Summary: AI数字指纹注册</p>
     */
    public RegisterAiidentificationGoodsdigitalfingerprintResponse registerAiidentificationGoodsdigitalfingerprint(RegisterAiidentificationGoodsdigitalfingerprintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerAiidentificationGoodsdigitalfingerprintEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AI商品数字指纹注册
     * Summary: AI数字指纹注册</p>
     */
    public RegisterAiidentificationGoodsdigitalfingerprintResponse registerAiidentificationGoodsdigitalfingerprintEx(RegisterAiidentificationGoodsdigitalfingerprintRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.goodsdigitalfingerprint.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterAiidentificationGoodsdigitalfingerprintResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AI商品数字指纹鉴定
     * Summary: AI商品数字指纹鉴定</p>
     */
    public CheckAiidentificationGoodsdigitalfingerprintResponse checkAiidentificationGoodsdigitalfingerprint(CheckAiidentificationGoodsdigitalfingerprintRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAiidentificationGoodsdigitalfingerprintEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AI商品数字指纹鉴定
     * Summary: AI商品数字指纹鉴定</p>
     */
    public CheckAiidentificationGoodsdigitalfingerprintResponse checkAiidentificationGoodsdigitalfingerprintEx(CheckAiidentificationGoodsdigitalfingerprintRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.goodsdigitalfingerprint.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAiidentificationGoodsdigitalfingerprintResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 识别票据上的二维码
     * Summary: AI二维码识别</p>
     */
    public GetAiidentificationQrcodeResponse getAiidentificationQrcode(GetAiidentificationQrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAiidentificationQrcodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 识别票据上的二维码
     * Summary: AI二维码识别</p>
     */
    public GetAiidentificationQrcodeResponse getAiidentificationQrcodeEx(GetAiidentificationQrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.aiidentification.qrcode.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAiidentificationQrcodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: biot 私有化 设备注册接口
     * Summary: biot 私有化 设备注册接口</p>
     */
    public CreateAcsDeviceResponse createAcsDevice(CreateAcsDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAcsDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: biot 私有化 设备注册接口
     * Summary: biot 私有化 设备注册接口</p>
     */
    public CreateAcsDeviceResponse createAcsDeviceEx(CreateAcsDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.acs.device.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAcsDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: biot 私有化 业务数据上报
     * Summary: biot 私有化 业务数据上报</p>
     */
    public SendAcsCollectorResponse sendAcsCollector(SendAcsCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendAcsCollectorEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: biot 私有化 业务数据上报
     * Summary: biot 私有化 业务数据上报</p>
     */
    public SendAcsCollectorResponse sendAcsCollectorEx(SendAcsCollectorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.acs.collector.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendAcsCollectorResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供设备基础信息查询服务
     * Summary: IoT设备平台-设备查询</p>
     */
    public QueryIotbasicDeviceResponse queryIotbasicDevice(QueryIotbasicDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotbasicDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供设备基础信息查询服务
     * Summary: IoT设备平台-设备查询</p>
     */
    public QueryIotbasicDeviceResponse queryIotbasicDeviceEx(QueryIotbasicDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.device.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotbasicDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT产品开通状态查询
     * Summary: IoT产品开通状态查询</p>
     */
    public RecognizeIotbasicCustomerResponse recognizeIotbasicCustomer(RecognizeIotbasicCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recognizeIotbasicCustomerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT产品开通状态查询
     * Summary: IoT产品开通状态查询</p>
     */
    public RecognizeIotbasicCustomerResponse recognizeIotbasicCustomerEx(RecognizeIotbasicCustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.customer.recognize", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RecognizeIotbasicCustomerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备认证
     * Summary: IoT设备平台-设备认证</p>
     */
    public CertifyIotbasicDeviceResponse certifyIotbasicDevice(CertifyIotbasicDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyIotbasicDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备认证
     * Summary: IoT设备平台-设备认证</p>
     */
    public CertifyIotbasicDeviceResponse certifyIotbasicDeviceEx(CertifyIotbasicDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.device.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyIotbasicDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
     * Summary: iot平台用户注册操作</p>
     */
    public OperateIotbasicUserResponse operateIotbasicUser(OperateIotbasicUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
     * Summary: iot平台用户注册操作</p>
     */
    public OperateIotbasicUserResponse operateIotbasicUserEx(OperateIotbasicUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.user.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iot 平台权限操作
     * Summary: iot 平台权限操作</p>
     */
    public OperateIotbasicPermissionResponse operateIotbasicPermission(OperateIotbasicPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicPermissionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iot 平台权限操作
     * Summary: iot 平台权限操作</p>
     */
    public OperateIotbasicPermissionResponse operateIotbasicPermissionEx(OperateIotbasicPermissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.permission.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicPermissionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备sn列表查询
     * Summary: IoT设备平台-设备sn列表查询</p>
     */
    public QueryIotbasicSnResponse queryIotbasicSn(QueryIotbasicSnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotbasicSnEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备sn列表查询
     * Summary: IoT设备平台-设备sn列表查询</p>
     */
    public QueryIotbasicSnResponse queryIotbasicSnEx(QueryIotbasicSnRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.sn.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotbasicSnResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备规格查询
     * Summary: IoT设备平台-设备规格查询</p>
     */
    public QueryDeviceSpecsResponse queryDeviceSpecs(QueryDeviceSpecsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceSpecsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备规格查询
     * Summary: IoT设备平台-设备规格查询</p>
     */
    public QueryDeviceSpecsResponse queryDeviceSpecsEx(QueryDeviceSpecsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.specs.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceSpecsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备规格关系维护
     * Summary: IoT设备平台-设备规格关系维护</p>
     */
    public OperateIotbasicRelrationResponse operateIotbasicRelration(OperateIotbasicRelrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicRelrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备规格关系维护
     * Summary: IoT设备平台-设备规格关系维护</p>
     */
    public OperateIotbasicRelrationResponse operateIotbasicRelrationEx(OperateIotbasicRelrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.relration.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicRelrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备字典数据维护
     * Summary: IoT设备平台-设备字典数据维护</p>
     */
    public OperateIotbasicDictionaryResponse operateIotbasicDictionary(OperateIotbasicDictionaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicDictionaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备字典数据维护
     * Summary: IoT设备平台-设备字典数据维护</p>
     */
    public OperateIotbasicDictionaryResponse operateIotbasicDictionaryEx(OperateIotbasicDictionaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.dictionary.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicDictionaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备品类数据维护
     * Summary: IoT设备平台-设备品类数据维护</p>
     */
    public OperateIotbasicCategoryResponse operateIotbasicCategory(OperateIotbasicCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicCategoryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备品类数据维护
     * Summary: IoT设备平台-设备品类数据维护</p>
     */
    public OperateIotbasicCategoryResponse operateIotbasicCategoryEx(OperateIotbasicCategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.category.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备管控配置维护
     * Summary: IoT设备平台-设备管控配置维护</p>
     */
    public OperateIotbasicControlconfigResponse operateIotbasicControlconfig(OperateIotbasicControlconfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicControlconfigEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备管控配置维护
     * Summary: IoT设备平台-设备管控配置维护</p>
     */
    public OperateIotbasicControlconfigResponse operateIotbasicControlconfigEx(OperateIotbasicControlconfigRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.controlconfig.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicControlconfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-上链业务模型配置维护
     * Summary: IoT设备平台-上链业务模型配置维护</p>
     */
    public OperateIotbasicChainmodelResponse operateIotbasicChainmodel(OperateIotbasicChainmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicChainmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-上链业务模型配置维护
     * Summary: IoT设备平台-上链业务模型配置维护</p>
     */
    public OperateIotbasicChainmodelResponse operateIotbasicChainmodelEx(OperateIotbasicChainmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.chainmodel.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicChainmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备不可操作标记更新
     * Summary: IoT设备平台-设备不可操作标记更新</p>
     */
    public OperateIotbasicDeviceResponse operateIotbasicDevice(OperateIotbasicDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备不可操作标记更新
     * Summary: IoT设备平台-设备不可操作标记更新</p>
     */
    public OperateIotbasicDeviceResponse operateIotbasicDeviceEx(OperateIotbasicDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.device.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: biot设备注册-创建设备
     * Summary: biot设备注册-创建设备</p>
     */
    public CreateIotbasicDeviceResponse createIotbasicDevice(CreateIotbasicDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIotbasicDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: biot设备注册-创建设备
     * Summary: biot设备注册-创建设备</p>
     */
    public CreateIotbasicDeviceResponse createIotbasicDeviceEx(CreateIotbasicDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.device.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIotbasicDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: biot设备注册-批量创建设备
     * Summary: biot设备注册-批量创建设备</p>
     */
    public BatchcreateIotbasicDeviceResponse batchcreateIotbasicDevice(BatchcreateIotbasicDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateIotbasicDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: biot设备注册-批量创建设备
     * Summary: biot设备注册-批量创建设备</p>
     */
    public BatchcreateIotbasicDeviceResponse batchcreateIotbasicDeviceEx(BatchcreateIotbasicDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.device.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateIotbasicDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: biot设备状态同步
     * Summary: iot平台-设备状态同步</p>
     */
    public SyncIotbasicDevicestatusResponse syncIotbasicDevicestatus(SyncIotbasicDevicestatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncIotbasicDevicestatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: biot设备状态同步
     * Summary: iot平台-设备状态同步</p>
     */
    public SyncIotbasicDevicestatusResponse syncIotbasicDevicestatusEx(SyncIotbasicDevicestatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.devicestatus.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncIotbasicDevicestatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: biot设备-安全认证
     * Summary: biot设备-安全认证</p>
     */
    public VerifyIotbasicIdentifyResponse verifyIotbasicIdentify(VerifyIotbasicIdentifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyIotbasicIdentifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: biot设备-安全认证
     * Summary: biot设备-安全认证</p>
     */
    public VerifyIotbasicIdentifyResponse verifyIotbasicIdentifyEx(VerifyIotbasicIdentifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.identify.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyIotbasicIdentifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-更新设备信息
     * Summary: IoT设备平台-更新设备信息</p>
     */
    public UpdateIotbasicDeviceResponse updateIotbasicDevice(UpdateIotbasicDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIotbasicDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-更新设备信息
     * Summary: IoT设备平台-更新设备信息</p>
     */
    public UpdateIotbasicDeviceResponse updateIotbasicDeviceEx(UpdateIotbasicDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.device.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIotbasicDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备上链
     * Summary: IoT设备平台-设备上链</p>
     */
    public OperateIotbasicDevicecollectResponse operateIotbasicDevicecollect(OperateIotbasicDevicecollectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicDevicecollectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备上链
     * Summary: IoT设备平台-设备上链</p>
     */
    public OperateIotbasicDevicecollectResponse operateIotbasicDevicecollectEx(OperateIotbasicDevicecollectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.devicecollect.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicDevicecollectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-项目空间数据维护
     * Summary: IoT设备平台-项目空间数据维护</p>
     */
    public OperateIotbasicProjectspaceResponse operateIotbasicProjectspace(OperateIotbasicProjectspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicProjectspaceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-项目空间数据维护
     * Summary: IoT设备平台-项目空间数据维护</p>
     */
    public OperateIotbasicProjectspaceResponse operateIotbasicProjectspaceEx(OperateIotbasicProjectspaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.projectspace.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicProjectspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-企业信息同步(个人房东)
     * Summary: 租房saas-企业信息同步(个人房东)</p>
     */
    public PushRentMerchantResponse pushRentMerchant(PushRentMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRentMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-企业信息同步(个人房东)
     * Summary: 租房saas-企业信息同步(个人房东)</p>
     */
    public PushRentMerchantResponse pushRentMerchantEx(PushRentMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.rent.merchant.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRentMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-业主账单信息同步
     * Summary: 租房saas-业主账单信息同步</p>
     */
    public PushRentBillResponse pushRentBill(PushRentBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRentBillEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-业主账单信息同步
     * Summary: 租房saas-业主账单信息同步</p>
     */
    public PushRentBillResponse pushRentBillEx(PushRentBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.rent.bill.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRentBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-租客入住信息同步
     * Summary: 租房saas-租客入住信息同步</p>
     */
    public PushRentRenterResponse pushRentRenter(PushRentRenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRentRenterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-租客入住信息同步
     * Summary: 租房saas-租客入住信息同步</p>
     */
    public PushRentRenterResponse pushRentRenterEx(PushRentRenterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.rent.renter.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRentRenterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-租金缴纳支付状态通知
     * Summary: 租房saas-租金缴纳支付状态通知</p>
     */
    public SyncRentRentpaymentResponse syncRentRentpayment(SyncRentRentpaymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncRentRentpaymentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-租金缴纳支付状态通知
     * Summary: 租房saas-租金缴纳支付状态通知</p>
     */
    public SyncRentRentpaymentResponse syncRentRentpaymentEx(SyncRentRentpaymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.rent.rentpayment.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncRentRentpaymentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-房源信息同步
     * Summary: 租房saas-房源信息同步</p>
     */
    public PushRentHouseResponse pushRentHouse(PushRentHouseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRentHouseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租房saas-房源信息同步
     * Summary: 租房saas-房源信息同步</p>
     */
    public PushRentHouseResponse pushRentHouseEx(PushRentHouseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.rent.house.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRentHouseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-生成设备认证密钥
     * Summary: IoT设备平台-生成设备认证密钥</p>
     */
    public SyncIotbasicDevicegenerateResponse syncIotbasicDevicegenerate(SyncIotbasicDevicegenerateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncIotbasicDevicegenerateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-生成设备认证密钥
     * Summary: IoT设备平台-生成设备认证密钥</p>
     */
    public SyncIotbasicDevicegenerateResponse syncIotbasicDevicegenerateEx(SyncIotbasicDevicegenerateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.devicegenerate.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncIotbasicDevicegenerateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-批量数据上链
     * Summary: IoT设备平台-批量数据上链</p>
     */
    public OperateIotbasicBatchcollectResponse operateIotbasicBatchcollect(OperateIotbasicBatchcollectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicBatchcollectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-批量数据上链
     * Summary: IoT设备平台-批量数据上链</p>
     */
    public OperateIotbasicBatchcollectResponse operateIotbasicBatchcollectEx(OperateIotbasicBatchcollectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.batchcollect.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicBatchcollectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备订单导入
     * Summary: IoT设备平台-设备订单导入</p>
     */
    public ImportIotbasicDeviceorderResponse importIotbasicDeviceorder(ImportIotbasicDeviceorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importIotbasicDeviceorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备订单导入
     * Summary: IoT设备平台-设备订单导入</p>
     */
    public ImportIotbasicDeviceorderResponse importIotbasicDeviceorderEx(ImportIotbasicDeviceorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.deviceorder.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportIotbasicDeviceorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-订单批量同步
     * Summary: IoT设备平台-订单批量同步</p>
     */
    public ImportIotbasicDeviceorderbatchResponse importIotbasicDeviceorderbatch(ImportIotbasicDeviceorderbatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importIotbasicDeviceorderbatchEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-订单批量同步
     * Summary: IoT设备平台-订单批量同步</p>
     */
    public ImportIotbasicDeviceorderbatchResponse importIotbasicDeviceorderbatchEx(ImportIotbasicDeviceorderbatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.deviceorderbatch.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportIotbasicDeviceorderbatchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-删除设备信息
     * Summary: IoT设备平台-删除设备信息</p>
     */
    public DeleteIotbasicDeviceResponse deleteIotbasicDevice(DeleteIotbasicDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIotbasicDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-删除设备信息
     * Summary: IoT设备平台-删除设备信息</p>
     */
    public DeleteIotbasicDeviceResponse deleteIotbasicDeviceEx(DeleteIotbasicDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.device.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteIotbasicDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备远程管控
     * Summary: IoT设备平台-设备远程管控</p>
     */
    public OperateIotbasicDevicecontrolResponse operateIotbasicDevicecontrol(OperateIotbasicDevicecontrolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicDevicecontrolEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备远程管控
     * Summary: IoT设备平台-设备远程管控</p>
     */
    public OperateIotbasicDevicecontrolResponse operateIotbasicDevicecontrolEx(OperateIotbasicDevicecontrolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.devicecontrol.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicDevicecontrolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备注册结果查询
     * Summary: IoT设备平台-设备注册结果查询</p>
     */
    public QueryDeviceRegisterresultResponse queryDeviceRegisterresult(QueryDeviceRegisterresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceRegisterresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备注册结果查询
     * Summary: IoT设备平台-设备注册结果查询</p>
     */
    public QueryDeviceRegisterresultResponse queryDeviceRegisterresultEx(QueryDeviceRegisterresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.registerresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceRegisterresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备状态查询
     * Summary: IoT设备平台-设备状态查询</p>
     */
    public QueryDeviceStatusResponse queryDeviceStatus(QueryDeviceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备状态查询
     * Summary: IoT设备平台-设备状态查询</p>
     */
    public QueryDeviceStatusResponse queryDeviceStatusEx(QueryDeviceStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-openApi操作
     * Summary: IoT设备平台-openApi操作</p>
     */
    public OperateIotbasicOpenapiResponse operateIotbasicOpenapi(OperateIotbasicOpenapiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateIotbasicOpenapiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-openApi操作
     * Summary: IoT设备平台-openApi操作</p>
     */
    public OperateIotbasicOpenapiResponse operateIotbasicOpenapiEx(OperateIotbasicOpenapiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.openapi.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateIotbasicOpenapiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上链数据分页查询
     * Summary: 上链数据分页查询</p>
     */
    public QueryIotbasicDevicecollectResponse queryIotbasicDevicecollect(QueryIotbasicDevicecollectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotbasicDevicecollectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上链数据分页查询
     * Summary: 上链数据分页查询</p>
     */
    public QueryIotbasicDevicecollectResponse queryIotbasicDevicecollectEx(QueryIotbasicDevicecollectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.devicecollect.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotbasicDevicecollectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单上链数据分页查询
     * Summary: 订单上链数据分页查询</p>
     */
    public QueryIotbasicDeviceorderResponse queryIotbasicDeviceorder(QueryIotbasicDeviceorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotbasicDeviceorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 订单上链数据分页查询
     * Summary: 订单上链数据分页查询</p>
     */
    public QueryIotbasicDeviceorderResponse queryIotbasicDeviceorderEx(QueryIotbasicDeviceorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.deviceorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotbasicDeviceorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-订单数据推送中台
     * Summary: IoT设备平台-订单数据推送中台</p>
     */
    public PushIotbasicMeterdataResponse pushIotbasicMeterdata(PushIotbasicMeterdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushIotbasicMeterdataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-订单数据推送中台
     * Summary: IoT设备平台-订单数据推送中台</p>
     */
    public PushIotbasicMeterdataResponse pushIotbasicMeterdataEx(PushIotbasicMeterdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.meterdata.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushIotbasicMeterdataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-客户新增
     * Summary: IoT设备平台-中台签约客户同步</p>
     */
    public SaveIotbasicCustomerResponse saveIotbasicCustomer(SaveIotbasicCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveIotbasicCustomerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-客户新增
     * Summary: IoT设备平台-中台签约客户同步</p>
     */
    public SaveIotbasicCustomerResponse saveIotbasicCustomerEx(SaveIotbasicCustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.customer.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveIotbasicCustomerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备消息同步
     * Summary: IoT设备平台-设备消息同步</p>
     */
    public NotifyThirddeviceMessageResponse notifyThirddeviceMessage(NotifyThirddeviceMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyThirddeviceMessageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设备消息同步
     * Summary: IoT设备平台-设备消息同步</p>
     */
    public NotifyThirddeviceMessageResponse notifyThirddeviceMessageEx(NotifyThirddeviceMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thirddevice.message.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyThirddeviceMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Iotbasic-厂商入驻
     * Summary: Iotbasic-厂商入驻</p>
     */
    public RegisterIotbasicCorpjoinResponse registerIotbasicCorpjoin(RegisterIotbasicCorpjoinRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerIotbasicCorpjoinEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Iotbasic-厂商入驻
     * Summary: Iotbasic-厂商入驻</p>
     */
    public RegisterIotbasicCorpjoinResponse registerIotbasicCorpjoinEx(RegisterIotbasicCorpjoinRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.corpjoin.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterIotbasicCorpjoinResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-查询设备链上资产详情
     * Summary: IoT设备平台-查询设备链上资产详情</p>
     */
    public QueryTxtransactionDeviceResponse queryTxtransactionDevice(QueryTxtransactionDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTxtransactionDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-查询设备链上资产详情
     * Summary: IoT设备平台-查询设备链上资产详情</p>
     */
    public QueryTxtransactionDeviceResponse queryTxtransactionDeviceEx(QueryTxtransactionDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.txtransaction.device.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTxtransactionDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-查询业务数据链上资产详情
     * Summary: IoT设备平台-查询业务数据链上资产详情</p>
     */
    public QueryTxtransactionChaindataResponse queryTxtransactionChaindata(QueryTxtransactionChaindataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTxtransactionChaindataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-查询业务数据链上资产详情
     * Summary: IoT设备平台-查询业务数据链上资产详情</p>
     */
    public QueryTxtransactionChaindataResponse queryTxtransactionChaindataEx(QueryTxtransactionChaindataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.txtransaction.chaindata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTxtransactionChaindataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-生成云上认证设备认证密钥
     * Summary: IoT设备平台-生成云上认证设备认证密钥</p>
     */
    public InitIotbasicDevicekeyResponse initIotbasicDevicekey(InitIotbasicDevicekeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIotbasicDevicekeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-生成云上认证设备认证密钥
     * Summary: IoT设备平台-生成云上认证设备认证密钥</p>
     */
    public InitIotbasicDevicekeyResponse initIotbasicDevicekeyEx(InitIotbasicDevicekeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.devicekey.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIotbasicDevicekeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设置设备属性
     * Summary: IoT设备平台-设置设备属性</p>
     */
    public SetDevicePropertyResponse setDeviceProperty(SetDevicePropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDevicePropertyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-设置设备属性
     * Summary: IoT设备平台-设置设备属性</p>
     */
    public SetDevicePropertyResponse setDevicePropertyEx(SetDevicePropertyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.property.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDevicePropertyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-批量设置设备属性
     * Summary: IoT设备平台-批量设置设备属性</p>
     */
    public SetDevicelistPropertyResponse setDevicelistProperty(SetDevicelistPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setDevicelistPropertyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: IoT设备平台-批量设置设备属性
     * Summary: IoT设备平台-批量设置设备属性</p>
     */
    public SetDevicelistPropertyResponse setDevicelistPropertyEx(SetDevicelistPropertyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicelist.property.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetDevicelistPropertyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询品类列表
     * Summary: iotbasic-查询品类列表</p>
     */
    public QueryIotbasicCategorylistResponse queryIotbasicCategorylist(QueryIotbasicCategorylistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotbasicCategorylistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询品类列表
     * Summary: iotbasic-查询品类列表</p>
     */
    public QueryIotbasicCategorylistResponse queryIotbasicCategorylistEx(QueryIotbasicCategorylistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.categorylist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotbasicCategorylistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询项目空间列表
     * Summary: iotbasic-查询项目空间列表</p>
     */
    public QueryIotbasicProjectspacelistResponse queryIotbasicProjectspacelist(QueryIotbasicProjectspacelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotbasicProjectspacelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询项目空间列表
     * Summary: iotbasic-查询项目空间列表</p>
     */
    public QueryIotbasicProjectspacelistResponse queryIotbasicProjectspacelistEx(QueryIotbasicProjectspacelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.projectspacelist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotbasicProjectspacelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商入驻
     * Summary: iotbasic-设备厂商入驻</p>
     */
    public RegisterDevicecorpCustomerResponse registerDevicecorpCustomer(RegisterDevicecorpCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerDevicecorpCustomerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商入驻
     * Summary: iotbasic-设备厂商入驻</p>
     */
    public RegisterDevicecorpCustomerResponse registerDevicecorpCustomerEx(RegisterDevicecorpCustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.customer.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterDevicecorpCustomerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商产品查询
     * Summary: iotbasic-设备厂商产品查询</p>
     */
    public GetDevicecorpProductinfoResponse getDevicecorpProductinfo(GetDevicecorpProductinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDevicecorpProductinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商产品查询
     * Summary: iotbasic-设备厂商产品查询</p>
     */
    public GetDevicecorpProductinfoResponse getDevicecorpProductinfoEx(GetDevicecorpProductinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.productinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDevicecorpProductinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-添加设备厂商设备属性
     * Summary: iotbasic-添加设备厂商设备属性</p>
     */
    public AddDevicecorpDeviceattributesResponse addDevicecorpDeviceattributes(AddDevicecorpDeviceattributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDevicecorpDeviceattributesEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-添加设备厂商设备属性
     * Summary: iotbasic-添加设备厂商设备属性</p>
     */
    public AddDevicecorpDeviceattributesResponse addDevicecorpDeviceattributesEx(AddDevicecorpDeviceattributesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.deviceattributes.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDevicecorpDeviceattributesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-指定设备上调用指定服务
     * Summary: iotbasic-指定设备上调用指定服务</p>
     */
    public ExecDeviceThingserviceResponse execDeviceThingservice(ExecDeviceThingserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDeviceThingserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-指定设备上调用指定服务
     * Summary: iotbasic-指定设备上调用指定服务</p>
     */
    public ExecDeviceThingserviceResponse execDeviceThingserviceEx(ExecDeviceThingserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.thingservice.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDeviceThingserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查看产品物模型功能定义
     * Summary: iotbasic-查看产品物模型功能定义</p>
     */
    public QueryDeviceThingmodelResponse queryDeviceThingmodel(QueryDeviceThingmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceThingmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查看产品物模型功能定义
     * Summary: iotbasic-查看产品物模型功能定义</p>
     */
    public QueryDeviceThingmodelResponse queryDeviceThingmodelEx(QueryDeviceThingmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.thingmodel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceThingmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询设备物模型数据
     * Summary: iotbasic-查询设备物模型数据</p>
     */
    public QueryDeviceModeldataResponse queryDeviceModeldata(QueryDeviceModeldataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceModeldataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询设备物模型数据
     * Summary: iotbasic-查询设备物模型数据</p>
     */
    public QueryDeviceModeldataResponse queryDeviceModeldataEx(QueryDeviceModeldataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.modeldata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceModeldataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商注册设备
     * Summary: iotbasic-设备厂商注册设备</p>
     */
    public CreateDevicecorpDeviceResponse createDevicecorpDevice(CreateDevicecorpDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDevicecorpDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商注册设备
     * Summary: iotbasic-设备厂商注册设备</p>
     */
    public CreateDevicecorpDeviceResponse createDevicecorpDeviceEx(CreateDevicecorpDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.device.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDevicecorpDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商批量注册设备
     * Summary: iotbasic-设备厂商批量注册设备</p>
     */
    public BatchcreateDevicecorpDeviceResponse batchcreateDevicecorpDevice(BatchcreateDevicecorpDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateDevicecorpDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商批量注册设备
     * Summary: iotbasic-设备厂商批量注册设备</p>
     */
    public BatchcreateDevicecorpDeviceResponse batchcreateDevicecorpDeviceEx(BatchcreateDevicecorpDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.device.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateDevicecorpDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询设备厂商企业注册结果
     * Summary: 查询设备厂商企业注册结果</p>
     */
    public QueryDevicecorpCustomerregisterresultResponse queryDevicecorpCustomerregisterresult(QueryDevicecorpCustomerregisterresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDevicecorpCustomerregisterresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询设备厂商企业注册结果
     * Summary: 查询设备厂商企业注册结果</p>
     */
    public QueryDevicecorpCustomerregisterresultResponse queryDevicecorpCustomerregisterresultEx(QueryDevicecorpCustomerregisterresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.customerregisterresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDevicecorpCustomerregisterresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-管控设备厂商设备
     * Summary: iotbasic-管控设备厂商设备</p>
     */
    public OperateDevicecorpDevicecontrolResponse operateDevicecorpDevicecontrol(OperateDevicecorpDevicecontrolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateDevicecorpDevicecontrolEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-管控设备厂商设备
     * Summary: iotbasic-管控设备厂商设备</p>
     */
    public OperateDevicecorpDevicecontrolResponse operateDevicecorpDevicecontrolEx(OperateDevicecorpDevicecontrolRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.devicecontrol.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateDevicecorpDevicecontrolResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商创建物模型
     * Summary: iotbasic-设备厂商创建物模型</p>
     */
    public CreateDevicecorpThingmodelResponse createDevicecorpThingmodel(CreateDevicecorpThingmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDevicecorpThingmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商创建物模型
     * Summary: iotbasic-设备厂商创建物模型</p>
     */
    public CreateDevicecorpThingmodelResponse createDevicecorpThingmodelEx(CreateDevicecorpThingmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDevicecorpThingmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商修改物模型
     * Summary: iotbasic-设备厂商修改物模型</p>
     */
    public UpdateDevicecorpThingmodelResponse updateDevicecorpThingmodel(UpdateDevicecorpThingmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDevicecorpThingmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商修改物模型
     * Summary: iotbasic-设备厂商修改物模型</p>
     */
    public UpdateDevicecorpThingmodelResponse updateDevicecorpThingmodelEx(UpdateDevicecorpThingmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDevicecorpThingmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商删除物模型
     * Summary: iotbasic-设备厂商删除物模型</p>
     */
    public DeleteDevicecorpThingmodelResponse deleteDevicecorpThingmodel(DeleteDevicecorpThingmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDevicecorpThingmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商删除物模型
     * Summary: iotbasic-设备厂商删除物模型</p>
     */
    public DeleteDevicecorpThingmodelResponse deleteDevicecorpThingmodelEx(DeleteDevicecorpThingmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDevicecorpThingmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商发布物模型
     * Summary: iotbasic-设备厂商发布物模型</p>
     */
    public PublishDevicecorpThingmodelResponse publishDevicecorpThingmodel(PublishDevicecorpThingmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishDevicecorpThingmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商发布物模型
     * Summary: iotbasic-设备厂商发布物模型</p>
     */
    public PublishDevicecorpThingmodelResponse publishDevicecorpThingmodelEx(PublishDevicecorpThingmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.devicecorp.thingmodel.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishDevicecorpThingmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约链接获取
     * Summary: 代扣签约链接获取</p>
     */
    public CreateDigitalkeyWithholdsignResponse createDigitalkeyWithholdsign(CreateDigitalkeyWithholdsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalkeyWithholdsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约链接获取
     * Summary: 代扣签约链接获取</p>
     */
    public CreateDigitalkeyWithholdsignResponse createDigitalkeyWithholdsignEx(CreateDigitalkeyWithholdsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withholdsign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDigitalkeyWithholdsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约解除
     * Summary: 代扣签约解除</p>
     */
    public UnbindDigitalkeyWithholdsignResponse unbindDigitalkeyWithholdsign(UnbindDigitalkeyWithholdsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindDigitalkeyWithholdsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣签约解除
     * Summary: 代扣签约解除</p>
     */
    public UnbindDigitalkeyWithholdsignResponse unbindDigitalkeyWithholdsignEx(UnbindDigitalkeyWithholdsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withholdsign.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindDigitalkeyWithholdsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 网约车代扣支付
     * Summary: 网约车代扣支付</p>
     */
    public PayDigitalkeyWithholdResponse payDigitalkeyWithhold(PayDigitalkeyWithholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payDigitalkeyWithholdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 网约车代扣支付
     * Summary: 网约车代扣支付</p>
     */
    public PayDigitalkeyWithholdResponse payDigitalkeyWithholdEx(PayDigitalkeyWithholdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withhold.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayDigitalkeyWithholdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣支付交易退款 
     * Summary: 代扣支付交易退款 </p>
     */
    public RefuseDigitalkeyWithholdpayResponse refuseDigitalkeyWithholdpay(RefuseDigitalkeyWithholdpayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refuseDigitalkeyWithholdpayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣支付交易退款 
     * Summary: 代扣支付交易退款 </p>
     */
    public RefuseDigitalkeyWithholdpayResponse refuseDigitalkeyWithholdpayEx(RefuseDigitalkeyWithholdpayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withholdpay.refuse", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefuseDigitalkeyWithholdpayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣协议查询
     * Summary: 代扣协议查询</p>
     */
    public QueryDigitalkeyWithholdsignResponse queryDigitalkeyWithholdsign(QueryDigitalkeyWithholdsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDigitalkeyWithholdsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣协议查询
     * Summary: 代扣协议查询</p>
     */
    public QueryDigitalkeyWithholdsignResponse queryDigitalkeyWithholdsignEx(QueryDigitalkeyWithholdsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withholdsign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDigitalkeyWithholdsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣支付撤销
     * Summary: 代扣支付撤销</p>
     */
    public CancelDigitalkeyWithholdpayResponse cancelDigitalkeyWithholdpay(CancelDigitalkeyWithholdpayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDigitalkeyWithholdpayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣支付撤销
     * Summary: 代扣支付撤销</p>
     */
    public CancelDigitalkeyWithholdpayResponse cancelDigitalkeyWithholdpayEx(CancelDigitalkeyWithholdpayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withholdpay.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDigitalkeyWithholdpayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣扣款前预通知
     * Summary: 代扣扣款前预通知</p>
     */
    public NotifyDigitalkeyWithholdpreResponse notifyDigitalkeyWithholdpre(NotifyDigitalkeyWithholdpreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyDigitalkeyWithholdpreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣扣款前预通知
     * Summary: 代扣扣款前预通知</p>
     */
    public NotifyDigitalkeyWithholdpreResponse notifyDigitalkeyWithholdpreEx(NotifyDigitalkeyWithholdpreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withholdpre.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyDigitalkeyWithholdpreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询品类行业，场景列表
     * Summary: iotbasic-查询品类行业，场景列表</p>
     */
    public QueryCategoryIndustryscenelistResponse queryCategoryIndustryscenelist(QueryCategoryIndustryscenelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCategoryIndustryscenelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询品类行业，场景列表
     * Summary: iotbasic-查询品类行业，场景列表</p>
     */
    public QueryCategoryIndustryscenelistResponse queryCategoryIndustryscenelistEx(QueryCategoryIndustryscenelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.category.industryscenelist.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCategoryIndustryscenelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-创建自定义品类
     * Summary: iotbasic-创建自定义品类</p>
     */
    public CreateCategoryCustomResponse createCategoryCustom(CreateCategoryCustomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCategoryCustomEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-创建自定义品类
     * Summary: iotbasic-创建自定义品类</p>
     */
    public CreateCategoryCustomResponse createCategoryCustomEx(CreateCategoryCustomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.category.custom.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCategoryCustomResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备模型创建
     * Summary: iotbasic-设备模型创建</p>
     */
    public CreateDeviceModelResponse createDeviceModel(CreateDeviceModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeviceModelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备模型创建
     * Summary: iotbasic-设备模型创建</p>
     */
    public CreateDeviceModelResponse createDeviceModelEx(CreateDeviceModelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.model.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDeviceModelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-创建iot产品
     * Summary: iotbasic-创建iot产品</p>
     */
    public CreateIotbasicProductResponse createIotbasicProduct(CreateIotbasicProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIotbasicProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-创建iot产品
     * Summary: iotbasic-创建iot产品</p>
     */
    public CreateIotbasicProductResponse createIotbasicProductEx(CreateIotbasicProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.product.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIotbasicProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣支付订单查询
     * Summary: 代扣支付订单查询</p>
     */
    public QueryDigitalkeyWithholdpayResponse queryDigitalkeyWithholdpay(QueryDigitalkeyWithholdpayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDigitalkeyWithholdpayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣支付订单查询
     * Summary: 代扣支付订单查询</p>
     */
    public QueryDigitalkeyWithholdpayResponse queryDigitalkeyWithholdpayEx(QueryDigitalkeyWithholdpayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.withholdpay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDigitalkeyWithholdpayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣支付查询
     * Summary: 代扣支付查询</p>
     */
    public QueryDigitalkeyTradepayResponse queryDigitalkeyTradepay(QueryDigitalkeyTradepayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDigitalkeyTradepayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣支付查询
     * Summary: 代扣支付查询</p>
     */
    public QueryDigitalkeyTradepayResponse queryDigitalkeyTradepayEx(QueryDigitalkeyTradepayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.tradepay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDigitalkeyTradepayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询数控设备信息
     * Summary: iotbasic-查询数控设备信息</p>
     */
    public GetDigitalkeyDeviceinfoResponse getDigitalkeyDeviceinfo(GetDigitalkeyDeviceinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDigitalkeyDeviceinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-查询数控设备信息
     * Summary: iotbasic-查询数控设备信息</p>
     */
    public GetDigitalkeyDeviceinfoResponse getDigitalkeyDeviceinfoEx(GetDigitalkeyDeviceinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.deviceinfo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDigitalkeyDeviceinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-新增应用
     * Summary: iotbasic-新增应用</p>
     */
    public CreateIotlinkAppmanagerResponse createIotlinkAppmanager(CreateIotlinkAppmanagerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIotlinkAppmanagerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-新增应用
     * Summary: iotbasic-新增应用</p>
     */
    public CreateIotlinkAppmanagerResponse createIotlinkAppmanagerEx(CreateIotlinkAppmanagerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "blockchain.bot.iotlink.appmanager.create"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                CreateIotlinkAppmanagerResponse createIotlinkAppmanagerResponse = CreateIotlinkAppmanagerResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return createIotlinkAppmanagerResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
            request.fileObject = null;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appmanager.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIotlinkAppmanagerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-获取应用模块列表
     * Summary: iotbasic-获取应用模块列表</p>
     */
    public ListIotlinkOtamoduleResponse listIotlinkOtamodule(ListIotlinkOtamoduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listIotlinkOtamoduleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-获取应用模块列表
     * Summary: iotbasic-获取应用模块列表</p>
     */
    public ListIotlinkOtamoduleResponse listIotlinkOtamoduleEx(ListIotlinkOtamoduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.otamodule.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListIotlinkOtamoduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-分页查询应用列表
     * Summary: iotbasic-分页查询应用列表</p>
     */
    public PagequeryIotlinkAppmanagerResponse pagequeryIotlinkAppmanager(PagequeryIotlinkAppmanagerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIotlinkAppmanagerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-分页查询应用列表
     * Summary: iotbasic-分页查询应用列表</p>
     */
    public PagequeryIotlinkAppmanagerResponse pagequeryIotlinkAppmanagerEx(PagequeryIotlinkAppmanagerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appmanager.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIotlinkAppmanagerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-获取应用下载地址
     * Summary: iotbasic-获取应用下载地址</p>
     */
    public GetIotlinkAppmanagerfileurlResponse getIotlinkAppmanagerfileurl(GetIotlinkAppmanagerfileurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIotlinkAppmanagerfileurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-获取应用下载地址
     * Summary: iotbasic-获取应用下载地址</p>
     */
    public GetIotlinkAppmanagerfileurlResponse getIotlinkAppmanagerfileurlEx(GetIotlinkAppmanagerfileurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appmanagerfileurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetIotlinkAppmanagerfileurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-分页查询发布批次列表
     * Summary: iotbasic-分页查询发布批次列表</p>
     */
    public PagequeryIotlinkAppreleaseorderResponse pagequeryIotlinkAppreleaseorder(PagequeryIotlinkAppreleaseorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIotlinkAppreleaseorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-分页查询发布批次列表
     * Summary: iotbasic-分页查询发布批次列表</p>
     */
    public PagequeryIotlinkAppreleaseorderResponse pagequeryIotlinkAppreleaseorderEx(PagequeryIotlinkAppreleaseorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIotlinkAppreleaseorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-分页查询设备升级列表
     * Summary: iotbasic-分页查询设备升级列表</p>
     */
    public PagequeryIotlinkAppreleasedeviceResponse pagequeryIotlinkAppreleasedevice(PagequeryIotlinkAppreleasedeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryIotlinkAppreleasedeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-分页查询设备升级列表
     * Summary: iotbasic-分页查询设备升级列表</p>
     */
    public PagequeryIotlinkAppreleasedeviceResponse pagequeryIotlinkAppreleasedeviceEx(PagequeryIotlinkAppreleasedeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryIotlinkAppreleasedeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-发布工单
     * Summary: iotbasic-发布工单</p>
     */
    public PublishIotlinkAppreleaseorderResponse publishIotlinkAppreleaseorder(PublishIotlinkAppreleaseorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishIotlinkAppreleaseorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-发布工单
     * Summary: iotbasic-发布工单</p>
     */
    public PublishIotlinkAppreleaseorderResponse publishIotlinkAppreleaseorderEx(PublishIotlinkAppreleaseorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishIotlinkAppreleaseorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-取消工单发布
     * Summary: iotbasic-取消工单发布</p>
     */
    public CancelIotlinkAppreleaseorderResponse cancelIotlinkAppreleaseorder(CancelIotlinkAppreleaseorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelIotlinkAppreleaseorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-取消工单发布
     * Summary: iotbasic-取消工单发布</p>
     */
    public CancelIotlinkAppreleaseorderResponse cancelIotlinkAppreleaseorderEx(CancelIotlinkAppreleaseorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelIotlinkAppreleaseorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-取消设备升级
     * Summary: iotbasic-取消设备升级</p>
     */
    public CancelIotlinkAppreleasedeviceResponse cancelIotlinkAppreleasedevice(CancelIotlinkAppreleasedeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelIotlinkAppreleasedeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-取消设备升级
     * Summary: iotbasic-取消设备升级</p>
     */
    public CancelIotlinkAppreleasedeviceResponse cancelIotlinkAppreleasedeviceEx(CancelIotlinkAppreleasedeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelIotlinkAppreleasedeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-重试设备升级
     * Summary: iotbasic-重试设备升级</p>
     */
    public RetryIotlinkAppreleasedeviceResponse retryIotlinkAppreleasedevice(RetryIotlinkAppreleasedeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryIotlinkAppreleasedeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-重试设备升级
     * Summary: iotbasic-重试设备升级</p>
     */
    public RetryIotlinkAppreleasedeviceResponse retryIotlinkAppreleasedeviceEx(RetryIotlinkAppreleasedeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.retry", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RetryIotlinkAppreleasedeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-创建应用类型
     * Summary: iotbasic-创建应用类型</p>
     */
    public CreateIotlinkOtamoduleResponse createIotlinkOtamodule(CreateIotlinkOtamoduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIotlinkOtamoduleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-创建应用类型
     * Summary: iotbasic-创建应用类型</p>
     */
    public CreateIotlinkOtamoduleResponse createIotlinkOtamoduleEx(CreateIotlinkOtamoduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.otamodule.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIotlinkOtamoduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-修改应用类型
     * Summary: iotbasic-修改应用类型</p>
     */
    public UpdateIotlinkOtamoduleResponse updateIotlinkOtamodule(UpdateIotlinkOtamoduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateIotlinkOtamoduleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-修改应用类型
     * Summary: iotbasic-修改应用类型</p>
     */
    public UpdateIotlinkOtamoduleResponse updateIotlinkOtamoduleEx(UpdateIotlinkOtamoduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.otamodule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateIotlinkOtamoduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-删除应用类型
     * Summary: iotbasic-删除应用类型</p>
     */
    public DeleteIotlinkOtamoduleResponse deleteIotlinkOtamodule(DeleteIotlinkOtamoduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteIotlinkOtamoduleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-删除应用类型
     * Summary: iotbasic-删除应用类型</p>
     */
    public DeleteIotlinkOtamoduleResponse deleteIotlinkOtamoduleEx(DeleteIotlinkOtamoduleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.otamodule.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteIotlinkOtamoduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商导入物模型
     * Summary: iotbasic-设备厂商导入物模型</p>
     */
    public ImportIotlinkThingmodeltslResponse importIotlinkThingmodeltsl(ImportIotlinkThingmodeltslRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importIotlinkThingmodeltslEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-设备厂商导入物模型
     * Summary: iotbasic-设备厂商导入物模型</p>
     */
    public ImportIotlinkThingmodeltslResponse importIotlinkThingmodeltslEx(ImportIotlinkThingmodeltslRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotlink.thingmodeltsl.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportIotlinkThingmodeltslResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-重置设备认证秘钥
     * Summary: iotbasic-重置设备认证秘钥</p>
     */
    public ResetIotbasicDeviceseckeyResponse resetIotbasicDeviceseckey(ResetIotbasicDeviceseckeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetIotbasicDeviceseckeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-重置设备认证秘钥
     * Summary: iotbasic-重置设备认证秘钥</p>
     */
    public ResetIotbasicDeviceseckeyResponse resetIotbasicDeviceseckeyEx(ResetIotbasicDeviceseckeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotbasic.deviceseckey.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetIotbasicDeviceseckeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 预授权支付订单创建
     * Summary: 预授权支付订单创建</p>
     */
    public CreateDigitalkeyPreauthpayResponse createDigitalkeyPreauthpay(CreateDigitalkeyPreauthpayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalkeyPreauthpayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 预授权支付订单创建
     * Summary: 预授权支付订单创建</p>
     */
    public CreateDigitalkeyPreauthpayResponse createDigitalkeyPreauthpayEx(CreateDigitalkeyPreauthpayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.preauthpay.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDigitalkeyPreauthpayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 预授权资金撤销
     * Summary: 预授权资金撤销</p>
     */
    public CancelDigitalkeyPreauthpayResponse cancelDigitalkeyPreauthpay(CancelDigitalkeyPreauthpayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDigitalkeyPreauthpayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 预授权资金撤销
     * Summary: 预授权资金撤销</p>
     */
    public CancelDigitalkeyPreauthpayResponse cancelDigitalkeyPreauthpayEx(CancelDigitalkeyPreauthpayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.preauthpay.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDigitalkeyPreauthpayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 预授权资金解冻
     * Summary: 预授权资金解冻</p>
     */
    public UnfreezeDigitalkeyPreauthpayResponse unfreezeDigitalkeyPreauthpay(UnfreezeDigitalkeyPreauthpayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unfreezeDigitalkeyPreauthpayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 预授权资金解冻
     * Summary: 预授权资金解冻</p>
     */
    public UnfreezeDigitalkeyPreauthpayResponse unfreezeDigitalkeyPreauthpayEx(UnfreezeDigitalkeyPreauthpayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.preauthpay.unfreeze", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnfreezeDigitalkeyPreauthpayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 预授权支付订单查询
     * Summary: 预授权支付订单查询</p>
     */
    public QueryDigitalkeyPreauthpayResponse queryDigitalkeyPreauthpay(QueryDigitalkeyPreauthpayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDigitalkeyPreauthpayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 预授权支付订单查询
     * Summary: 预授权支付订单查询</p>
     */
    public QueryDigitalkeyPreauthpayResponse queryDigitalkeyPreauthpayEx(QueryDigitalkeyPreauthpayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.digitalkey.preauthpay.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDigitalkeyPreauthpayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-客户指定设备调用服务
     * Summary: iotbasic-客户指定设备调用服务</p>
     */
    public ExecDeviceCustomerthingserviceResponse execDeviceCustomerthingservice(ExecDeviceCustomerthingserviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDeviceCustomerthingserviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-客户指定设备调用服务
     * Summary: iotbasic-客户指定设备调用服务</p>
     */
    public ExecDeviceCustomerthingserviceResponse execDeviceCustomerthingserviceEx(ExecDeviceCustomerthingserviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.customerthingservice.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDeviceCustomerthingserviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 在指定设备上对自定义topic 远程下发消息 
     * Summary: 自定义topic远程调用</p>
     */
    public ExecDeviceUsertopicResponse execDeviceUsertopic(ExecDeviceUsertopicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execDeviceUsertopicEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 在指定设备上对自定义topic 远程下发消息 
     * Summary: 自定义topic远程调用</p>
     */
    public ExecDeviceUsertopicResponse execDeviceUsertopicEx(ExecDeviceUsertopicRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.usertopic.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecDeviceUsertopicResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动往设备下发消息，提供给数科上游业务系统使用
     * Summary: 主动往设备下发消息</p>
     */
    public PushDeviceMessageResponse pushDeviceMessage(PushDeviceMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDeviceMessageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 主动往设备下发消息，提供给数科上游业务系统使用
     * Summary: 主动往设备下发消息</p>
     */
    public PushDeviceMessageResponse pushDeviceMessageEx(PushDeviceMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.message.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushDeviceMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-四轮车安全驾驶事件同步
     * Summary: iotbasic-四轮车安全驾驶事件同步</p>
     */
    public SyncFourwheelerCareventResponse syncFourwheelerCarevent(SyncFourwheelerCareventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncFourwheelerCareventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: iotbasic-四轮车安全驾驶事件同步
     * Summary: iotbasic-四轮车安全驾驶事件同步</p>
     */
    public SyncFourwheelerCareventResponse syncFourwheelerCareventEx(SyncFourwheelerCareventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.fourwheeler.carevent.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncFourwheelerCareventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过指定字段查询车辆最新的信息
     * Summary: 二轮车车辆状态实时查询</p>
     */
    public QueryElectrocarRealtimedataResponse queryElectrocarRealtimedata(QueryElectrocarRealtimedataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryElectrocarRealtimedataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过指定字段查询车辆最新的信息
     * Summary: 二轮车车辆状态实时查询</p>
     */
    public QueryElectrocarRealtimedataResponse queryElectrocarRealtimedataEx(QueryElectrocarRealtimedataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.electrocar.realtimedata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryElectrocarRealtimedataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询一段时间范围的所有行程记录及明细 
     * Summary: 二轮车行程记录查询</p>
     */
    public QueryElectrocarTravelResponse queryElectrocarTravel(QueryElectrocarTravelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryElectrocarTravelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询一段时间范围的所有行程记录及明细 
     * Summary: 二轮车行程记录查询</p>
     */
    public QueryElectrocarTravelResponse queryElectrocarTravelEx(QueryElectrocarTravelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.electrocar.travel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryElectrocarTravelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 厂商注册接口
     * Summary: 车钥匙厂商注册</p>
     */
    public RegisterCarkeyscorpCustomerResponse registerCarkeyscorpCustomer(RegisterCarkeyscorpCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerCarkeyscorpCustomerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 厂商注册接口
     * Summary: 车钥匙厂商注册</p>
     */
    public RegisterCarkeyscorpCustomerResponse registerCarkeyscorpCustomerEx(RegisterCarkeyscorpCustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.carkeyscorp.customer.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterCarkeyscorpCustomerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请凭证
     * Summary: 申请凭证</p>
     */
    public CreateElectrocarApplycarkeycertificateResponse createElectrocarApplycarkeycertificate(CreateElectrocarApplycarkeycertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createElectrocarApplycarkeycertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请凭证
     * Summary: 申请凭证</p>
     */
    public CreateElectrocarApplycarkeycertificateResponse createElectrocarApplycarkeycertificateEx(CreateElectrocarApplycarkeycertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.electrocar.applycarkeycertificate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateElectrocarApplycarkeycertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据设备串号查询采购设备
     * Summary: 根据设备串号查询采购设备</p>
     */
    public QueryIotplatformPurchaseorderResponse queryIotplatformPurchaseorder(QueryIotplatformPurchaseorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIotplatformPurchaseorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据设备串号查询采购设备
     * Summary: 根据设备串号查询采购设备</p>
     */
    public QueryIotplatformPurchaseorderResponse queryIotplatformPurchaseorderEx(QueryIotplatformPurchaseorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotplatform.purchaseorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIotplatformPurchaseorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
     * Summary: 绑定MeshId及设备SN</p>
     */
    public ImportIotplatformMeshidResponse importIotplatformMeshid(ImportIotplatformMeshidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importIotplatformMeshidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
     * Summary: 绑定MeshId及设备SN</p>
     */
    public ImportIotplatformMeshidResponse importIotplatformMeshidEx(ImportIotplatformMeshidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotplatform.meshid.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportIotplatformMeshidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 与租赁宝对接采购订单导入的接口
     * Summary: 与租赁宝对接采购订单导入的接口</p>
     */
    public ImportPurchaseorderThirdpartyResponse importPurchaseorderThirdparty(ImportPurchaseorderThirdpartyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importPurchaseorderThirdpartyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 与租赁宝对接采购订单导入的接口
     * Summary: 与租赁宝对接采购订单导入的接口</p>
     */
    public ImportPurchaseorderThirdpartyResponse importPurchaseorderThirdpartyEx(ImportPurchaseorderThirdpartyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.purchaseorder.thirdparty.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportPurchaseorderThirdpartyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 采购平台新增供应商角色
     * Summary: 采购平台新增供应商角色</p>
     */
    public AddUserRoleResponse addUserRole(AddUserRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addUserRoleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 采购平台新增供应商角色
     * Summary: 采购平台新增供应商角色</p>
     */
    public AddUserRoleResponse addUserRoleEx(AddUserRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.user.role.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddUserRoleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 采购平台新增SKU
     * Summary: 采购平台新增SKU</p>
     */
    public AddGoodsSkuResponse addGoodsSku(AddGoodsSkuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addGoodsSkuEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 采购平台新增SKU
     * Summary: 采购平台新增SKU</p>
     */
    public AddGoodsSkuResponse addGoodsSkuEx(AddGoodsSkuRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.goods.sku.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddGoodsSkuResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: Iotplatform-设备订单计费上传
     * Summary: Iotplatform-设备订单计费上传</p>
     */
    public PushMeterdataOrderResponse pushMeterdataOrder(PushMeterdataOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushMeterdataOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: Iotplatform-设备订单计费上传
     * Summary: Iotplatform-设备订单计费上传</p>
     */
    public PushMeterdataOrderResponse pushMeterdataOrderEx(PushMeterdataOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.meterdata.order.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushMeterdataOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 3c商品开通消息转发
     * Summary: 3c商品开通消息转发</p>
     */
    public OpenIotplantformProductResponse openIotplantformProduct(OpenIotplantformProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openIotplantformProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 3c商品开通消息转发
     * Summary: 3c商品开通消息转发</p>
     */
    public OpenIotplantformProductResponse openIotplantformProductEx(OpenIotplantformProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotplantform.product.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenIotplantformProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 3c商品停止消息转发
     * Summary: 3c商品停止消息转发</p>
     */
    public StopIotplantformProductResponse stopIotplantformProduct(StopIotplantformProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopIotplantformProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 3c商品停止消息转发
     * Summary: 3c商品停止消息转发</p>
     */
    public StopIotplantformProductResponse stopIotplantformProductEx(StopIotplantformProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotplantform.product.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopIotplantformProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 3c商品恢复消息转发
     * Summary: 3c商品恢复消息转发</p>
     */
    public ResumeIotplantformProductResponse resumeIotplantformProduct(ResumeIotplantformProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeIotplantformProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 3c商品恢复消息转发
     * Summary: 3c商品恢复消息转发</p>
     */
    public ResumeIotplantformProductResponse resumeIotplantformProductEx(ResumeIotplantformProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.iotplantform.product.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeIotplantformProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建数据模型
     * Summary: 创建数据模型</p>
     */
    public CreateDeviceDatamodelResponse createDeviceDatamodel(CreateDeviceDatamodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeviceDatamodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建数据模型
     * Summary: 创建数据模型</p>
     */
    public CreateDeviceDatamodelResponse createDeviceDatamodelEx(CreateDeviceDatamodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.datamodel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDeviceDatamodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取数据模型
     * Summary: 获取数据模型</p>
     */
    public GetDeviceDatamodelResponse getDeviceDatamodel(GetDeviceDatamodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceDatamodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取数据模型
     * Summary: 获取数据模型</p>
     */
    public GetDeviceDatamodelResponse getDeviceDatamodelEx(GetDeviceDatamodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.datamodel.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeviceDatamodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 注册设备
     * Summary: 注册设备</p>
     */
    public ImportDeviceResponse importDevice(ImportDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 注册设备
     * Summary: 注册设备</p>
     */
    public ImportDeviceResponse importDeviceEx(ImportDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过chainId获取设备详情
     * Summary: 通过chainId获取设备详情</p>
     */
    public GetDeviceBychainidResponse getDeviceBychainid(GetDeviceBychainidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceBychainidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过chainId获取设备详情
     * Summary: 通过chainId获取设备详情</p>
     */
    public GetDeviceBychainidResponse getDeviceBychainidEx(GetDeviceBychainidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.bychainid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeviceBychainidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过deviceId获取设备详情
     * Summary: 通过deviceId获取设备详情</p>
     */
    public GetDeviceBydeviceidResponse getDeviceBydeviceid(GetDeviceBydeviceidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDeviceBydeviceidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过deviceId获取设备详情
     * Summary: 通过deviceId获取设备详情</p>
     */
    public GetDeviceBydeviceidResponse getDeviceBydeviceidEx(GetDeviceBydeviceidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.bydeviceid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDeviceBydeviceidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过场景码列举设备
     * Summary: 通过场景码列举设备</p>
     */
    public ListDeviceBysceneResponse listDeviceByscene(ListDeviceBysceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDeviceBysceneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过场景码列举设备
     * Summary: 通过场景码列举设备</p>
     */
    public ListDeviceBysceneResponse listDeviceBysceneEx(ListDeviceBysceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.byscene.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDeviceBysceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新设备信息
     * Summary: 更新设备信息</p>
     */
    public UpdateDeviceInfoResponse updateDeviceInfo(UpdateDeviceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeviceInfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新设备信息
     * Summary: 更新设备信息</p>
     */
    public UpdateDeviceInfoResponse updateDeviceInfoEx(UpdateDeviceInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.info.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDeviceInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 免签名注册设备
     * Summary: 免签名注册设备</p>
     */
    public CreateDistributedeviceBydeviceidResponse createDistributedeviceBydeviceid(CreateDistributedeviceBydeviceidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBydeviceidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 免签名注册设备
     * Summary: 免签名注册设备</p>
     */
    public CreateDistributedeviceBydeviceidResponse createDistributedeviceBydeviceidEx(CreateDistributedeviceBydeviceidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydeviceid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBydeviceidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过链上设备Id发行
     * Summary: 通过链上设备Id发行</p>
     */
    public CreateDistributedeviceBychainidResponse createDistributedeviceBychainid(CreateDistributedeviceBychainidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBychainidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过链上设备Id发行
     * Summary: 通过链上设备Id发行</p>
     */
    public CreateDistributedeviceBychainidResponse createDistributedeviceBychainidEx(CreateDistributedeviceBychainidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBychainidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 替换发行设备
     * Summary: 替换发行设备</p>
     */
    public ReplaceDistributedeviceBychainidResponse replaceDistributedeviceBychainid(ReplaceDistributedeviceBychainidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceDistributedeviceBychainidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 替换发行设备
     * Summary: 替换发行设备</p>
     */
    public ReplaceDistributedeviceBychainidResponse replaceDistributedeviceBychainidEx(ReplaceDistributedeviceBychainidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceDistributedeviceBychainidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传单个设备所产生的设备数据 
     * Summary: 上传设备数据</p>
     */
    public SendCollectorBychainidResponse sendCollectorBychainid(SendCollectorBychainidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCollectorBychainidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传单个设备所产生的设备数据 
     * Summary: 上传设备数据</p>
     */
    public SendCollectorBychainidResponse sendCollectorBychainidEx(SendCollectorBychainidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.bychainid.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCollectorBychainidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过Id获取发行设备
     * Summary: 通过Id获取发行设备</p>
     */
    public GetDistributedeviceBychainidResponse getDistributedeviceBychainid(GetDistributedeviceBychainidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistributedeviceBychainidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过Id获取发行设备
     * Summary: 通过Id获取发行设备</p>
     */
    public GetDistributedeviceBychainidResponse getDistributedeviceBychainidEx(GetDistributedeviceBychainidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDistributedeviceBychainidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过场景码列举发行设备
     * Summary: 通过场景码列举发行设备</p>
     */
    public ListDistributedeviceBysceneResponse listDistributedeviceByscene(ListDistributedeviceBysceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributedeviceBysceneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过场景码列举发行设备
     * Summary: 通过场景码列举发行设备</p>
     */
    public ListDistributedeviceBysceneResponse listDistributedeviceBysceneEx(ListDistributedeviceBysceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.byscene.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributedeviceBysceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建消费者
     * Summary: 创建消费者</p>
     */
    public CreateConsumerResponse createConsumer(CreateConsumerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConsumerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建消费者
     * Summary: 创建消费者</p>
     */
    public CreateConsumerResponse createConsumerEx(CreateConsumerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.consumer.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateConsumerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费者订阅
     * Summary: 消费者订阅</p>
     */
    public SetConsumerSubscribeResponse setConsumerSubscribe(SetConsumerSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumerSubscribeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费者订阅
     * Summary: 消费者订阅</p>
     */
    public SetConsumerSubscribeResponse setConsumerSubscribeEx(SetConsumerSubscribeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.consumer.subscribe.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumerSubscribeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费者取消订阅设备
     * Summary: 消费者取消订阅设备</p>
     */
    public SetConsumerUnsubscribeResponse setConsumerUnsubscribe(SetConsumerUnsubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setConsumerUnsubscribeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费者取消订阅设备
     * Summary: 消费者取消订阅设备</p>
     */
    public SetConsumerUnsubscribeResponse setConsumerUnsubscribeEx(SetConsumerUnsubscribeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.consumer.unsubscribe.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetConsumerUnsubscribeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费者获取数据
     * Summary: 消费者获取数据</p>
     */
    public PullConsumerDatasourceResponse pullConsumerDatasource(PullConsumerDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullConsumerDatasourceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 消费者获取数据
     * Summary: 消费者获取数据</p>
     */
    public PullConsumerDatasourceResponse pullConsumerDatasourceEx(PullConsumerDatasourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.consumer.datasource.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullConsumerDatasourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过设备id获取发行设备详情
     * Summary: 通过设备id获取发行设备详情</p>
     */
    public GetDistributedeviceBydeviceidResponse getDistributedeviceBydeviceid(GetDistributedeviceBydeviceidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistributedeviceBydeviceidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过设备id获取发行设备详情
     * Summary: 通过设备id获取发行设备详情</p>
     */
    public GetDistributedeviceBydeviceidResponse getDistributedeviceBydeviceidEx(GetDistributedeviceBydeviceidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydeviceid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDistributedeviceBydeviceidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过发行id获取设备
     * Summary: 通过发行id获取设备</p>
     */
    public GetDistributedeviceBydisidResponse getDistributedeviceBydisid(GetDistributedeviceBydisidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistributedeviceBydisidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过发行id获取设备
     * Summary: 通过发行id获取设备</p>
     */
    public GetDistributedeviceBydisidResponse getDistributedeviceBydisidEx(GetDistributedeviceBydisidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydisid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDistributedeviceBydisidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 注册外围设备
     * Summary: 注册外围设备</p>
     */
    public ImportPeripheralResponse importPeripheral(ImportPeripheralRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importPeripheralEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 注册外围设备
     * Summary: 注册外围设备</p>
     */
    public ImportPeripheralResponse importPeripheralEx(ImportPeripheralRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.peripheral.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportPeripheralResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过链上外围设备ID获取详情
     * Summary: 通过链上外围设备ID获取详情</p>
     */
    public GetPeripheralBychainperipheralidResponse getPeripheralBychainperipheralid(GetPeripheralBychainperipheralidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPeripheralBychainperipheralidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过链上外围设备ID获取详情
     * Summary: 通过链上外围设备ID获取详情</p>
     */
    public GetPeripheralBychainperipheralidResponse getPeripheralBychainperipheralidEx(GetPeripheralBychainperipheralidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.peripheral.bychainperipheralid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPeripheralBychainperipheralidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过外围设备ID获取详情
     * Summary: 通过外围设备ID获取详情</p>
     */
    public GetPeripheralByperipheralidResponse getPeripheralByperipheralid(GetPeripheralByperipheralidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPeripheralByperipheralidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过外围设备ID获取详情
     * Summary: 通过外围设备ID获取详情</p>
     */
    public GetPeripheralByperipheralidResponse getPeripheralByperipheralidEx(GetPeripheralByperipheralidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.peripheral.byperipheralid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPeripheralByperipheralidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据场景列举外围设备
     * Summary: 根据场景列举外围设备</p>
     */
    public ListPeripheralBysceneResponse listPeripheralByscene(ListPeripheralBysceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPeripheralBysceneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据场景列举外围设备
     * Summary: 根据场景列举外围设备</p>
     */
    public ListPeripheralBysceneResponse listPeripheralBysceneEx(ListPeripheralBysceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.peripheral.byscene.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListPeripheralBysceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过外围设备Id发行
     * Summary: 通过外围设备Id发行</p>
     */
    public CreateDistributedeviceByperipheralidResponse createDistributedeviceByperipheralid(CreateDistributedeviceByperipheralidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceByperipheralidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过外围设备Id发行
     * Summary: 通过外围设备Id发行</p>
     */
    public CreateDistributedeviceByperipheralidResponse createDistributedeviceByperipheralidEx(CreateDistributedeviceByperipheralidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceByperipheralidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过链上外围设备Id发行
     * Summary: 通过链上外围设备Id发行</p>
     */
    public CreateDistributedeviceBychainperipheralidResponse createDistributedeviceBychainperipheralid(CreateDistributedeviceBychainperipheralidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBychainperipheralidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过链上外围设备Id发行
     * Summary: 通过链上外围设备Id发行</p>
     */
    public CreateDistributedeviceBychainperipheralidResponse createDistributedeviceBychainperipheralidEx(CreateDistributedeviceBychainperipheralidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainperipheralid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBychainperipheralidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 替换发行外围设备 by 链上外围设备ID
     * Summary: 替换发行外围设备 by 链上外围设备ID</p>
     */
    public ReplaceDistributedeviceBychainperipheralidResponse replaceDistributedeviceBychainperipheralid(ReplaceDistributedeviceBychainperipheralidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceDistributedeviceBychainperipheralidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 替换发行外围设备 by 链上外围设备ID
     * Summary: 替换发行外围设备 by 链上外围设备ID</p>
     */
    public ReplaceDistributedeviceBychainperipheralidResponse replaceDistributedeviceBychainperipheralidEx(ReplaceDistributedeviceBychainperipheralidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bychainperipheralid.replace", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReplaceDistributedeviceBychainperipheralidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据场景列举发行外围设备
     * Summary: 根据场景列举发行外围设备</p>
     */
    public ListDistributedeviceByperipheralsceneResponse listDistributedeviceByperipheralscene(ListDistributedeviceByperipheralsceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDistributedeviceByperipheralsceneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据场景列举发行外围设备
     * Summary: 根据场景列举发行外围设备</p>
     */
    public ListDistributedeviceByperipheralsceneResponse listDistributedeviceByperipheralsceneEx(ListDistributedeviceByperipheralsceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralscene.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListDistributedeviceByperipheralsceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过外围设备ID获取发行外围设备信息
     * Summary: 通过外围设备ID获取发行外围设备信息</p>
     */
    public GetDistributedeviceByperipheralidResponse getDistributedeviceByperipheralid(GetDistributedeviceByperipheralidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDistributedeviceByperipheralidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过外围设备ID获取发行外围设备信息
     * Summary: 通过外围设备ID获取发行外围设备信息</p>
     */
    public GetDistributedeviceByperipheralidResponse getDistributedeviceByperipheralidEx(GetDistributedeviceByperipheralidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.byperipheralid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDistributedeviceByperipheralidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行设备by_devcie
     * Summary: 发行设备by_devcie</p>
     */
    public CreateDistributedeviceBydeviceResponse createDistributedeviceBydevice(CreateDistributedeviceBydeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBydeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发行设备by_devcie
     * Summary: 发行设备by_devcie</p>
     */
    public CreateDistributedeviceBydeviceResponse createDistributedeviceBydeviceEx(CreateDistributedeviceBydeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydevice.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBydeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 远程任务创建
     * Summary: 远程任务创建</p>
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 远程任务创建
     * Summary: 远程任务创建</p>
     */
    public CreateTaskResponse createTaskEx(CreateTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 远程任务查询
     * Summary: 远程任务查询</p>
     */
    public QueryTaskResponse queryTask(QueryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 远程任务查询
     * Summary: 远程任务查询</p>
     */
    public QueryTaskResponse queryTaskEx(QueryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分析数据查询
     * Summary: 分析数据查询</p>
     */
    public QueryAnalysisResponse queryAnalysis(QueryAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAnalysisEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分析数据查询
     * Summary: 分析数据查询</p>
     */
    public QueryAnalysisResponse queryAnalysisEx(QueryAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.analysis.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
     * Summary: 上传设备数据mul</p>
     */
    public SendCollectorBychainidmulResponse sendCollectorBychainidmul(SendCollectorBychainidmulRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCollectorBychainidmulEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
     * Summary: 上传设备数据mul</p>
     */
    public SendCollectorBychainidmulResponse sendCollectorBychainidmulEx(SendCollectorBychainidmulRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.bychainidmul.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCollectorBychainidmulResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传设备业务数据
     * Summary: 上传设备业务数据</p>
     */
    public SendCollectorDevicebizdataResponse sendCollectorDevicebizdata(SendCollectorDevicebizdataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCollectorDevicebizdataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传设备业务数据
     * Summary: 上传设备业务数据</p>
     */
    public SendCollectorDevicebizdataResponse sendCollectorDevicebizdataEx(SendCollectorDevicebizdataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.devicebizdata.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCollectorDevicebizdataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新设备信息by_devcie
     * Summary: 更新设备信息by_devcie</p>
     */
    public UpdateDeviceInfobydeviceResponse updateDeviceInfobydevice(UpdateDeviceInfobydeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeviceInfobydeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新设备信息by_devcie
     * Summary: 更新设备信息by_devcie</p>
     */
    public UpdateDeviceInfobydeviceResponse updateDeviceInfobydeviceEx(UpdateDeviceInfobydeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.infobydevice.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDeviceInfobydeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 下线设备
     * Summary: 下线设备</p>
     */
    public OfflineDeviceResponse offlineDevice(OfflineDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 下线设备
     * Summary: 下线设备</p>
     */
    public OfflineDeviceResponse offlineDeviceEx(OfflineDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请MQTT token
     * Summary: 申请MQTT token</p>
     */
    public ApplyMqtokenResponse applyMqtoken(ApplyMqtokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyMqtokenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请MQTT token
     * Summary: 申请MQTT token</p>
     */
    public ApplyMqtokenResponse applyMqtokenEx(ApplyMqtokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.mqtoken.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyMqtokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询设备所注册的公钥是否正确
     * Summary: 查询注册信息</p>
     */
    public QueryDeviceRegistrationResponse queryDeviceRegistration(QueryDeviceRegistrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceRegistrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询设备所注册的公钥是否正确
     * Summary: 查询注册信息</p>
     */
    public QueryDeviceRegistrationResponse queryDeviceRegistrationEx(QueryDeviceRegistrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.registration.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDeviceRegistrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备异常上报
     * Summary: 设备异常上报</p>
     */
    public AddAbnormalResponse addAbnormal(AddAbnormalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAbnormalEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备异常上报
     * Summary: 设备异常上报</p>
     */
    public AddAbnormalResponse addAbnormalEx(AddAbnormalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.abnormal.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAbnormalResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备下线后，可通过此接口重新上线
     * Summary: 设置设备状态为上线</p>
     */
    public OnlineDeviceResponse onlineDevice(OnlineDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.onlineDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设备下线后，可通过此接口重新上线
     * Summary: 设置设备状态为上线</p>
     */
    public OnlineDeviceResponse onlineDeviceEx(OnlineDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.online", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OnlineDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 注销设备
     * Summary: 注销设备</p>
     */
    public OfflineDeviceByunregisterResponse offlineDeviceByunregister(OfflineDeviceByunregisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.offlineDeviceByunregisterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 注销设备
     * Summary: 注销设备</p>
     */
    public OfflineDeviceByunregisterResponse offlineDeviceByunregisterEx(OfflineDeviceByunregisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.byunregister.offline", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OfflineDeviceByunregisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签状态查询
     * Summary: 标签状态查询</p>
     */
    public QueryLabelTraceResponse queryLabelTrace(QueryLabelTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLabelTraceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签状态查询
     * Summary: 标签状态查询</p>
     */
    public QueryLabelTraceResponse queryLabelTraceEx(QueryLabelTraceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.trace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLabelTraceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签流转状态同步
     * Summary: 标签流转状态同步</p>
     */
    public SyncLabelTransferResponse syncLabelTransfer(SyncLabelTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncLabelTransferEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签流转状态同步
     * Summary: 标签流转状态同步</p>
     */
    public SyncLabelTransferResponse syncLabelTransferEx(SyncLabelTransferRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.transfer.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncLabelTransferResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签资产绑定
     * Summary: 标签资产绑定</p>
     */
    public AddLabelAssetResponse addLabelAsset(AddLabelAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addLabelAssetEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签资产绑定
     * Summary: 标签资产绑定</p>
     */
    public AddLabelAssetResponse addLabelAssetEx(AddLabelAssetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.asset.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddLabelAssetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过tx_hash查询上链信息
     * Summary: 链上信息查询</p>
     */
    public QueryDataBytxhashResponse queryDataBytxhash(QueryDataBytxhashRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataBytxhashEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过tx_hash查询上链信息
     * Summary: 链上信息查询</p>
     */
    public QueryDataBytxhashResponse queryDataBytxhashEx(QueryDataBytxhashRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.data.bytxhash.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataBytxhashResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据taskId 执行未处理的任务
     * Summary: 执行未处理的任务</p>
     */
    public ExecUnprocessedTaskResponse execUnprocessedTask(ExecUnprocessedTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execUnprocessedTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据taskId 执行未处理的任务
     * Summary: 执行未处理的任务</p>
     */
    public ExecUnprocessedTaskResponse execUnprocessedTaskEx(ExecUnprocessedTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.unprocessed.task.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecUnprocessedTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传汇总数据
     * Summary: 上传汇总数据</p>
     */
    public SendCollectorSummarydataResponse sendCollectorSummarydata(SendCollectorSummarydataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendCollectorSummarydataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上传汇总数据
     * Summary: 上传汇总数据</p>
     */
    public SendCollectorSummarydataResponse sendCollectorSummarydataEx(SendCollectorSummarydataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.summarydata.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendCollectorSummarydataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据请求体内容保存密钥
     * Summary: 保存公钥</p>
     */
    public AddCertificateResponse addCertificate(AddCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据请求体内容保存密钥
     * Summary: 保存公钥</p>
     */
    public AddCertificateResponse addCertificateEx(AddCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.certificate.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增租户
     * Summary: 新增租户</p>
     */
    public AddTenantResponse addTenant(AddTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTenantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增租户
     * Summary: 新增租户</p>
     */
    public AddTenantResponse addTenantEx(AddTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tenant.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddTenantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增场景码
     * Summary: 新增场景码</p>
     */
    public AddSceneResponse addScene(AddSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSceneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增场景码
     * Summary: 新增场景码</p>
     */
    public AddSceneResponse addSceneEx(AddSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.scene.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 部署场景合同
     * Summary: 部署场景合同</p>
     */
    public DeploySceneResponse deployScene(DeploySceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deploySceneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 部署场景合同
     * Summary: 部署场景合同</p>
     */
    public DeploySceneResponse deploySceneEx(DeploySceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.scene.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeploySceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增sdk
     * Summary: 新增sdk</p>
     */
    public AddSdkResponse addSdk(AddSdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addSdkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增sdk
     * Summary: 新增sdk</p>
     */
    public AddSdkResponse addSdkEx(AddSdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.sdk.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddSdkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新sdk
     * Summary: 更新sdk</p>
     */
    public UpdateSdkResponse updateSdk(UpdateSdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSdkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新sdk
     * Summary: 更新sdk</p>
     */
    public UpdateSdkResponse updateSdkEx(UpdateSdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.sdk.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSdkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增productKey
     * Summary: 新增productKey</p>
     */
    public AddProductkeyResponse addProductkey(AddProductkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增productKey
     * Summary: 新增productKey</p>
     */
    public AddProductkeyResponse addProductkeyEx(AddProductkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.productkey.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddProductkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新productKey
     * Summary: 更新productKey</p>
     */
    public UpdateProductkeyResponse updateProductkey(UpdateProductkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateProductkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新productKey
     * Summary: 更新productKey</p>
     */
    public UpdateProductkeyResponse updateProductkeyEx(UpdateProductkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.productkey.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateProductkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新租户
     * Summary: 更新租户</p>
     */
    public UpdateTenantResponse updateTenant(UpdateTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTenantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新租户
     * Summary: 更新租户</p>
     */
    public UpdateTenantResponse updateTenantEx(UpdateTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tenant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTenantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新场景码
     * Summary: 更新场景码</p>
     */
    public UpdateSceneResponse updateScene(UpdateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSceneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新场景码
     * Summary: 更新场景码</p>
     */
    public UpdateSceneResponse updateSceneEx(UpdateSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.scene.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
     * Summary: 上报标签流转的异步接口</p>
     */
    public SendLabelTransferonasyncResponse sendLabelTransferonasync(SendLabelTransferonasyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendLabelTransferonasyncEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
     * Summary: 上报标签流转的异步接口</p>
     */
    public SendLabelTransferonasyncResponse sendLabelTransferonasyncEx(SendLabelTransferonasyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.transferonasync.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendLabelTransferonasyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果 
     * Summary: 异步接口结果查询</p>
     */
    public QueryAsyncRequestResponse queryAsyncRequest(QueryAsyncRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAsyncRequestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果 
     * Summary: 异步接口结果查询</p>
     */
    public QueryAsyncRequestResponse queryAsyncRequestEx(QueryAsyncRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.async.request.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAsyncRequestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询租户
     * Summary: 分页查询租户</p>
     */
    public PagequeryTenantResponse pagequeryTenant(PagequeryTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryTenantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询租户
     * Summary: 分页查询租户</p>
     */
    public PagequeryTenantResponse pagequeryTenantEx(PagequeryTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tenant.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryTenantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询场景码
     * Summary: 分页查询场景码</p>
     */
    public PagequerySceneResponse pagequeryScene(PagequerySceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequerySceneEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询场景码
     * Summary: 分页查询场景码</p>
     */
    public PagequerySceneResponse pagequerySceneEx(PagequerySceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.scene.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequerySceneResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询sdk
     * Summary: 分页查询sdk</p>
     */
    public PagequerySdkResponse pagequerySdk(PagequerySdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequerySdkEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询sdk
     * Summary: 分页查询sdk</p>
     */
    public PagequerySdkResponse pagequerySdkEx(PagequerySdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.sdk.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequerySdkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询productKey
     * Summary: 分页查询productKey</p>
     */
    public PagequeryProductkeyResponse pagequeryProductkey(PagequeryProductkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryProductkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询productKey
     * Summary: 分页查询productKey</p>
     */
    public PagequeryProductkeyResponse pagequeryProductkeyEx(PagequeryProductkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.productkey.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryProductkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询校验失败的数据
     * Summary: 分页查询校验失败的数据</p>
     */
    public PagequeryDataverifyFailureResponse pagequeryDataverifyFailure(PagequeryDataverifyFailureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDataverifyFailureEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询校验失败的数据
     * Summary: 分页查询校验失败的数据</p>
     */
    public PagequeryDataverifyFailureResponse pagequeryDataverifyFailureEx(PagequeryDataverifyFailureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.dataverify.failure.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDataverifyFailureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description:  新增告警策略
     * Summary:  新增告警策略</p>
     */
    public AddAlertStrategyResponse addAlertStrategy(AddAlertStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAlertStrategyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description:  新增告警策略
     * Summary:  新增告警策略</p>
     */
    public AddAlertStrategyResponse addAlertStrategyEx(AddAlertStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.alert.strategy.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAlertStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新告警策略接口
     * Summary: 更新告警策略接口</p>
     */
    public UpdateAlertStrategyResponse updateAlertStrategy(UpdateAlertStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAlertStrategyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新告警策略接口
     * Summary: 更新告警策略接口</p>
     */
    public UpdateAlertStrategyResponse updateAlertStrategyEx(UpdateAlertStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.alert.strategy.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAlertStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询告警策略接口
     * Summary: 分页查询告警策略接口</p>
     */
    public PagequeryAlertStrategyResponse pagequeryAlertStrategy(PagequeryAlertStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAlertStrategyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询告警策略接口
     * Summary: 分页查询告警策略接口</p>
     */
    public PagequeryAlertStrategyResponse pagequeryAlertStrategyEx(PagequeryAlertStrategyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.alert.strategy.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAlertStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签流转状态同步（元数据，无签名）
     * Summary: 标签流转状态同步（元数据，无签名）</p>
     */
    public SyncLabelTransferrawResponse syncLabelTransferraw(SyncLabelTransferrawRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncLabelTransferrawEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 标签流转状态同步（元数据，无签名）
     * Summary: 标签流转状态同步（元数据，无签名）</p>
     */
    public SyncLabelTransferrawResponse syncLabelTransferrawEx(SyncLabelTransferrawRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.transferraw.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncLabelTransferrawResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
     * Summary: 上报标签流转的异步接口（元数据，无签名）</p>
     */
    public SendLabelTransferrawonasyncResponse sendLabelTransferrawonasync(SendLabelTransferrawonasyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendLabelTransferrawonasyncEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
     * Summary: 上报标签流转的异步接口（元数据，无签名）</p>
     */
    public SendLabelTransferrawonasyncResponse sendLabelTransferrawonasyncEx(SendLabelTransferrawonasyncRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.label.transferrawonasync.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendLabelTransferrawonasyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
     * Summary: 查询验收已对接的数据</p>
     */
    public QueryDockedDataResponse queryDockedData(QueryDockedDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDockedDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
     * Summary: 查询验收已对接的数据</p>
     */
    public QueryDockedDataResponse queryDockedDataEx(QueryDockedDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.docked.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDockedDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建实体关联关系
     * Summary: 创建实体关联关系</p>
     */
    public CreateDeviceRelationResponse createDeviceRelation(CreateDeviceRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDeviceRelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建实体关联关系
     * Summary: 创建实体关联关系</p>
     */
    public CreateDeviceRelationResponse createDeviceRelationEx(CreateDeviceRelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.relation.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDeviceRelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除实体关联关系
     * Summary: 删除实体关联关系</p>
     */
    public DeleteDeviceRelationResponse deleteDeviceRelation(DeleteDeviceRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDeviceRelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除实体关联关系
     * Summary: 删除实体关联关系</p>
     */
    public DeleteDeviceRelationResponse deleteDeviceRelationEx(DeleteDeviceRelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.relation.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteDeviceRelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 推送单个设备所产生的设备数据
     * Summary: 推送设备数据</p>
     */
    public PushCollectotBychainidResponse pushCollectotBychainid(PushCollectotBychainidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushCollectotBychainidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 推送单个设备所产生的设备数据
     * Summary: 推送设备数据</p>
     */
    public PushCollectotBychainidResponse pushCollectotBychainidEx(PushCollectotBychainidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collectot.bychainid.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushCollectotBychainidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 推送设备状态变更信息
     * Summary: 推送设备状态变更信息</p>
     */
    public NotifyPullstrategyChangestatusResponse notifyPullstrategyChangestatus(NotifyPullstrategyChangestatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyPullstrategyChangestatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 推送设备状态变更信息
     * Summary: 推送设备状态变更信息</p>
     */
    public NotifyPullstrategyChangestatusResponse notifyPullstrategyChangestatusEx(NotifyPullstrategyChangestatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.pullstrategy.changestatus.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyPullstrategyChangestatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 推送订单信息
     * Summary: 推送订单信息</p>
     */
    public NotifyPullstrategyChargeorderinfoResponse notifyPullstrategyChargeorderinfo(NotifyPullstrategyChargeorderinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyPullstrategyChargeorderinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 推送订单信息
     * Summary: 推送订单信息</p>
     */
    public NotifyPullstrategyChargeorderinfoResponse notifyPullstrategyChargeorderinfoEx(NotifyPullstrategyChargeorderinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.pullstrategy.chargeorderinfo.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyPullstrategyChargeorderinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 菜鸟设备监控信息获取
     * Summary: 菜鸟设备监控信息获取</p>
     */
    public QueryScfleaseEqpinfoResponse queryScfleaseEqpinfo(QueryScfleaseEqpinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryScfleaseEqpinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 菜鸟设备监控信息获取
     * Summary: 菜鸟设备监控信息获取</p>
     */
    public QueryScfleaseEqpinfoResponse queryScfleaseEqpinfoEx(QueryScfleaseEqpinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.scflease.eqpinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryScfleaseEqpinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建自定义的实体数据
     * Summary: 创建自定义实体</p>
     */
    public CreateCustomerEntityResponse createCustomerEntity(CreateCustomerEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomerEntityEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建自定义的实体数据
     * Summary: 创建自定义实体</p>
     */
    public CreateCustomerEntityResponse createCustomerEntityEx(CreateCustomerEntityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.customer.entity.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCustomerEntityResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
     * Summary: 更新自定义实体</p>
     */
    public UpdateCustomerEntityResponse updateCustomerEntity(UpdateCustomerEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCustomerEntityEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
     * Summary: 更新自定义实体</p>
     */
    public UpdateCustomerEntityResponse updateCustomerEntityEx(UpdateCustomerEntityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.customer.entity.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCustomerEntityResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 为租户创建物模型
     * Summary: 为租户创建物模型</p>
     */
    public CreateThingmodelResponse createThingmodel(CreateThingmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createThingmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 为租户创建物模型
     * Summary: 为租户创建物模型</p>
     */
    public CreateThingmodelResponse createThingmodelEx(CreateThingmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingmodel.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateThingmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户的物模型
     * Summary: 查询租户的物模型</p>
     */
    public QueryThingmodelResponse queryThingmodel(QueryThingmodelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThingmodelEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询租户的物模型
     * Summary: 查询租户的物模型</p>
     */
    public QueryThingmodelResponse queryThingmodelEx(QueryThingmodelRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingmodel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThingmodelResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过设备异步批量发行设备
     * Summary: 通过设备异步批量发行设备</p>
     */
    public CreateDistributedeviceBydevicemulResponse createDistributedeviceBydevicemul(CreateDistributedeviceBydevicemulRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBydevicemulEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过设备异步批量发行设备
     * Summary: 通过设备异步批量发行设备</p>
     */
    public CreateDistributedeviceBydevicemulResponse createDistributedeviceBydevicemulEx(CreateDistributedeviceBydevicemulRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydevicemul.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBydevicemulResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过设备ID异步批量发行设备
     * Summary: 通过设备ID异步批量发行设备</p>
     */
    public CreateDistributedeviceBydeviceidmulResponse createDistributedeviceBydeviceidmul(CreateDistributedeviceBydeviceidmulRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDistributedeviceBydeviceidmulEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过设备ID异步批量发行设备
     * Summary: 通过设备ID异步批量发行设备</p>
     */
    public CreateDistributedeviceBydeviceidmulResponse createDistributedeviceBydeviceidmulEx(CreateDistributedeviceBydeviceidmulRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.distributedevice.bydeviceidmul.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDistributedeviceBydeviceidmulResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 绑定实体关系
     * Summary: 绑定实体关系</p>
     */
    public BindEntityrelationResponse bindEntityrelation(BindEntityrelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindEntityrelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 绑定实体关系
     * Summary: 绑定实体关系</p>
     */
    public BindEntityrelationResponse bindEntityrelationEx(BindEntityrelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.entityrelation.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindEntityrelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量解绑实体关系
     * Summary: 批量解绑实体关系</p>
     */
    public UnbindEntityrelationResponse unbindEntityrelation(UnbindEntityrelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindEntityrelationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 批量解绑实体关系
     * Summary: 批量解绑实体关系</p>
     */
    public UnbindEntityrelationResponse unbindEntityrelationEx(UnbindEntityrelationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.entityrelation.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindEntityrelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询物模型设备详情
     * Summary: 查询物模型设备详情</p>
     */
    public DetailThingmodelDeviceResponse detailThingmodelDevice(DetailThingmodelDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailThingmodelDeviceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询物模型设备详情
     * Summary: 查询物模型设备详情</p>
     */
    public DetailThingmodelDeviceResponse detailThingmodelDeviceEx(DetailThingmodelDeviceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingmodel.device.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailThingmodelDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
     * Summary: 创建上传文件URL</p>
     */
    public CreateCollectorUploadfileurlResponse createCollectorUploadfileurl(CreateCollectorUploadfileurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCollectorUploadfileurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
     * Summary: 创建上传文件URL</p>
     */
    public CreateCollectorUploadfileurlResponse createCollectorUploadfileurlEx(CreateCollectorUploadfileurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.uploadfileurl.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCollectorUploadfileurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
     * Summary: 通过文件上报数据，上传完毕后确认</p>
     */
    public ConfirmCollectorUploadfileResponse confirmCollectorUploadfile(ConfirmCollectorUploadfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmCollectorUploadfileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
     * Summary: 通过文件上报数据，上传完毕后确认</p>
     */
    public ConfirmCollectorUploadfileResponse confirmCollectorUploadfileEx(ConfirmCollectorUploadfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.uploadfile.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmCollectorUploadfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建物模型事件
     * Summary: 创建物模型事件</p>
     */
    public CreateThingmodelEventResponse createThingmodelEvent(CreateThingmodelEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createThingmodelEventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建物模型事件
     * Summary: 创建物模型事件</p>
     */
    public CreateThingmodelEventResponse createThingmodelEventEx(CreateThingmodelEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingmodel.event.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateThingmodelEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询物模型事件
     * Summary: 查询物模型事件</p>
     */
    public QueryThingmodelEventResponse queryThingmodelEvent(QueryThingmodelEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThingmodelEventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询物模型事件
     * Summary: 查询物模型事件</p>
     */
    public QueryThingmodelEventResponse queryThingmodelEventEx(QueryThingmodelEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingmodel.event.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThingmodelEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
     * Summary: 车辆关联的部标设备列表查询</p>
     */
    public QueryEntityrelationJtdevicebycarResponse queryEntityrelationJtdevicebycar(QueryEntityrelationJtdevicebycarRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEntityrelationJtdevicebycarEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
     * Summary: 车辆关联的部标设备列表查询</p>
     */
    public QueryEntityrelationJtdevicebycarResponse queryEntityrelationJtdevicebycarEx(QueryEntityrelationJtdevicebycarRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.entityrelation.jtdevicebycar.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEntityrelationJtdevicebycarResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 部标设备位置/轨迹/异常数据查询
     * Summary: 部标设备位置/轨迹/异常数据查询</p>
     */
    public QueryCollectorJtfluxResponse queryCollectorJtflux(QueryCollectorJtfluxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCollectorJtfluxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 部标设备位置/轨迹/异常数据查询
     * Summary: 部标设备位置/轨迹/异常数据查询</p>
     */
    public QueryCollectorJtfluxResponse queryCollectorJtfluxEx(QueryCollectorJtfluxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.jtflux.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCollectorJtfluxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过异常事件ID查询部标多媒体文件地址
     * Summary: 通过异常事件ID查询部标多媒体文件地址</p>
     */
    public QueryCollectorJtmediaResponse queryCollectorJtmedia(QueryCollectorJtmediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCollectorJtmediaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过异常事件ID查询部标多媒体文件地址
     * Summary: 通过异常事件ID查询部标多媒体文件地址</p>
     */
    public QueryCollectorJtmediaResponse queryCollectorJtmediaEx(QueryCollectorJtmediaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.collector.jtmedia.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCollectorJtmediaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询产线压测任务
     * Summary: 查询项目关联的产线压测任务</p>
     */
    public QueryOnlinepressuretestResponse queryOnlinepressuretest(QueryOnlinepressuretestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOnlinepressuretestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询产线压测任务
     * Summary: 查询项目关联的产线压测任务</p>
     */
    public QueryOnlinepressuretestResponse queryOnlinepressuretestEx(QueryOnlinepressuretestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.onlinepressuretest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOnlinepressuretestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description:  【自主联调平台】创建产线压测任务
     * Summary:  【自主联调平台】创建产线压测任务</p>
     */
    public CreateOnlinepressuretestResponse createOnlinepressuretest(CreateOnlinepressuretestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOnlinepressuretestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description:  【自主联调平台】创建产线压测任务
     * Summary:  【自主联调平台】创建产线压测任务</p>
     */
    public CreateOnlinepressuretestResponse createOnlinepressuretestEx(CreateOnlinepressuretestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.onlinepressuretest.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOnlinepressuretestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新客户侧的压测报告
     * Summary: 更新客户侧的压测报告</p>
     */
    public UpdateOnlinepressuretestCustomerreportResponse updateOnlinepressuretestCustomerreport(UpdateOnlinepressuretestCustomerreportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOnlinepressuretestCustomerreportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新客户侧的压测报告
     * Summary: 更新客户侧的压测报告</p>
     */
    public UpdateOnlinepressuretestCustomerreportResponse updateOnlinepressuretestCustomerreportEx(UpdateOnlinepressuretestCustomerreportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.onlinepressuretest.customerreport.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateOnlinepressuretestCustomerreportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询客户的物模型事件
     * Summary: 查询客户的物模型事件列表</p>
     */
    public QueryThingmodeleventBycustomertenantResponse queryThingmodeleventBycustomertenant(QueryThingmodeleventBycustomertenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThingmodeleventBycustomertenantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询客户的物模型事件
     * Summary: 查询客户的物模型事件列表</p>
     */
    public QueryThingmodeleventBycustomertenantResponse queryThingmodeleventBycustomertenantEx(QueryThingmodeleventBycustomertenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingmodelevent.bycustomertenant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThingmodeleventBycustomertenantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 从联调环境部署物模型UDF到生产环境
     * Summary: 从联调环境部署物模型UDF到生产环境</p>
     */
    public DeployThingudfResponse deployThingudf(DeployThingudfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployThingudfEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 从联调环境部署物模型UDF到生产环境
     * Summary: 从联调环境部署物模型UDF到生产环境</p>
     */
    public DeployThingudfResponse deployThingudfEx(DeployThingudfRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingudf.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployThingudfResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询二轮车操作日志
     * Summary: 分页查询二轮车操作日志</p>
     */
    public PagequeryEbikeOperationlogResponse pagequeryEbikeOperationlog(PagequeryEbikeOperationlogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryEbikeOperationlogEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分页查询二轮车操作日志
     * Summary: 分页查询二轮车操作日志</p>
     */
    public PagequeryEbikeOperationlogResponse pagequeryEbikeOperationlogEx(PagequeryEbikeOperationlogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.ebike.operationlog.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryEbikeOperationlogResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户实体拓展功能查询
     * Summary: 客户实体拓展功能查询</p>
     */
    public QueryCustomerentityServiceResponse queryCustomerentityService(QueryCustomerentityServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCustomerentityServiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 客户实体拓展功能查询
     * Summary: 客户实体拓展功能查询</p>
     */
    public QueryCustomerentityServiceResponse queryCustomerentityServiceEx(QueryCustomerentityServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.customerentity.service.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCustomerentityServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付芯证书申请
     * Summary: 支付芯证书申请</p>
     */
    public ApplyTechintegrationSkushipResponse applyTechintegrationSkuship(ApplyTechintegrationSkushipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTechintegrationSkushipEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付芯证书申请
     * Summary: 支付芯证书申请</p>
     */
    public ApplyTechintegrationSkushipResponse applyTechintegrationSkushipEx(ApplyTechintegrationSkushipRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.techintegration.skuship.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyTechintegrationSkushipResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
     * Summary: 支付芯证书申请接口，唯一编码软件接入形式</p>
     */
    public ApplyTechintegrationSkushipbyuidResponse applyTechintegrationSkushipbyuid(ApplyTechintegrationSkushipbyuidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTechintegrationSkushipbyuidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
     * Summary: 支付芯证书申请接口，唯一编码软件接入形式</p>
     */
    public ApplyTechintegrationSkushipbyuidResponse applyTechintegrationSkushipbyuidEx(ApplyTechintegrationSkushipbyuidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.techintegration.skushipbyuid.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyTechintegrationSkushipbyuidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询压测任务所关联的实体的最新上链数据列表
     * Summary: 查询压测任务的上链数据列表</p>
     */
    public QueryOnlinepressuretestDataResponse queryOnlinepressuretestData(QueryOnlinepressuretestDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOnlinepressuretestDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询压测任务所关联的实体的最新上链数据列表
     * Summary: 查询压测任务的上链数据列表</p>
     */
    public QueryOnlinepressuretestDataResponse queryOnlinepressuretestDataEx(QueryOnlinepressuretestDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.onlinepressuretest.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOnlinepressuretestDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 物模型服务调用
     * Summary: 物模型服务调用</p>
     */
    public ExecThingServiceResponse execThingService(ExecThingServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execThingServiceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 物模型服务调用
     * Summary: 物模型服务调用</p>
     */
    public ExecThingServiceResponse execThingServiceEx(ExecThingServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thing.service.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecThingServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
     * Summary: 物模型服务回复接口</p>
     */
    public CallbackThingServicebyeventResponse callbackThingServicebyevent(CallbackThingServicebyeventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackThingServicebyeventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
     * Summary: 物模型服务回复接口</p>
     */
    public CallbackThingServicebyeventResponse callbackThingServicebyeventEx(CallbackThingServicebyeventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thing.servicebyevent.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackThingServicebyeventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加SKU授权白名单
     * Summary: 添加SKU授权白名单</p>
     */
    public ImportTechintegrationSkugrantwhitelistResponse importTechintegrationSkugrantwhitelist(ImportTechintegrationSkugrantwhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.importTechintegrationSkugrantwhitelistEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 添加SKU授权白名单
     * Summary: 添加SKU授权白名单</p>
     */
    public ImportTechintegrationSkugrantwhitelistResponse importTechintegrationSkugrantwhitelistEx(ImportTechintegrationSkugrantwhitelistRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.techintegration.skugrantwhitelist.import", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ImportTechintegrationSkugrantwhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 物模型数据上报
     * Summary: 物模型数据上报</p>
     */
    public SendThingDataResponse sendThingData(SendThingDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendThingDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 物模型数据上报
     * Summary: 物模型数据上报</p>
     */
    public SendThingDataResponse sendThingDataEx(SendThingDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thing.data.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendThingDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付芯证书授权信息查询
     * Summary: 支付芯证书授权信息查询</p>
     */
    public QueryTechintegrationSkugrantstockinfoResponse queryTechintegrationSkugrantstockinfo(QueryTechintegrationSkugrantstockinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTechintegrationSkugrantstockinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 支付芯证书授权信息查询
     * Summary: 支付芯证书授权信息查询</p>
     */
    public QueryTechintegrationSkugrantstockinfoResponse queryTechintegrationSkugrantstockinfoEx(QueryTechintegrationSkugrantstockinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.techintegration.skugrantstockinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTechintegrationSkugrantstockinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 整合目前的设备数据、汇总数据、业务数据、无主体数据、标签数据上报接口
     * Summary: 事件数据上报整合接口</p>
     */
    public SendEventDataResponse sendEventData(SendEventDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendEventDataEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 整合目前的设备数据、汇总数据、业务数据、无主体数据、标签数据上报接口
     * Summary: 事件数据上报整合接口</p>
     */
    public SendEventDataResponse sendEventDataEx(SendEventDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.event.data.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendEventDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取定时任务保存至oss的文件链接
     * Summary: 获取定时任务保存至oss的文件链接</p>
     */
    public QueryOssDownloadjoburlResponse queryOssDownloadjoburl(QueryOssDownloadjoburlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOssDownloadjoburlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取定时任务保存至oss的文件链接
     * Summary: 获取定时任务保存至oss的文件链接</p>
     */
    public QueryOssDownloadjoburlResponse queryOssDownloadjoburlEx(QueryOssDownloadjoburlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.oss.downloadjoburl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOssDownloadjoburlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 要素项目同步
     * Summary: 要素项目同步</p>
     */
    public SyncAssetelementProjectResponse syncAssetelementProject(SyncAssetelementProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAssetelementProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 要素项目同步
     * Summary: 要素项目同步</p>
     */
    public SyncAssetelementProjectResponse syncAssetelementProjectEx(SyncAssetelementProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.assetelement.project.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAssetelementProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据deviceId更新设备
     * Summary: 根据deviceId更新设备</p>
     */
    public UpdateDeviceBydeviceidResponse updateDeviceBydeviceid(UpdateDeviceBydeviceidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeviceBydeviceidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据deviceId更新设备
     * Summary: 根据deviceId更新设备</p>
     */
    public UpdateDeviceBydeviceidResponse updateDeviceBydeviceidEx(UpdateDeviceBydeviceidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.device.bydeviceid.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateDeviceBydeviceidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 时序异常检测任务扫描
     * Summary: 任务扫描</p>
     */
    public QueryTaskscanResponse queryTaskscan(QueryTaskscanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTaskscanEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 时序异常检测任务扫描
     * Summary: 任务扫描</p>
     */
    public QueryTaskscanResponse queryTaskscanEx(QueryTaskscanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.taskscan.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTaskscanResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链oneapi
     * Summary: 信物链oneapi</p>
     */
    public ExecThingsdidOneapiResponse execThingsdidOneapi(ExecThingsdidOneapiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execThingsdidOneapiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链oneapi
     * Summary: 信物链oneapi</p>
     */
    public ExecThingsdidOneapiResponse execThingsdidOneapiEx(ExecThingsdidOneapiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.oneapi.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecThingsdidOneapiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链存证
     * Summary: 信物链存证</p>
     */
    public StartEvidenceStoreResponse startEvidenceStore(StartEvidenceStoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startEvidenceStoreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链存证
     * Summary: 信物链存证</p>
     */
    public StartEvidenceStoreResponse startEvidenceStoreEx(StartEvidenceStoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.evidence.store.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartEvidenceStoreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链存证查询
     * Summary: 信物链存证查询</p>
     */
    public StartEvidenceQueryResponse startEvidenceQuery(StartEvidenceQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startEvidenceQueryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链存证查询
     * Summary: 信物链存证查询</p>
     */
    public StartEvidenceQueryResponse startEvidenceQueryEx(StartEvidenceQueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.evidence.query.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartEvidenceQueryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链实体身份注册
     * Summary: 信物链实体身份注册</p>
     */
    public StartThingsdidRegisterResponse startThingsdidRegister(StartThingsdidRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startThingsdidRegisterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链实体身份注册
     * Summary: 信物链实体身份注册</p>
     */
    public StartThingsdidRegisterResponse startThingsdidRegisterEx(StartThingsdidRegisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.register.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartThingsdidRegisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链异步操作查询
     * 智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
     * Summary: 信物链异步操作查询</p>
     */
    public QueryThingsdidAsyncprocessResponse queryThingsdidAsyncprocess(QueryThingsdidAsyncprocessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThingsdidAsyncprocessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链异步操作查询
     * 智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
     * Summary: 信物链异步操作查询</p>
     */
    public QueryThingsdidAsyncprocessResponse queryThingsdidAsyncprocessEx(QueryThingsdidAsyncprocessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.asyncprocess.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThingsdidAsyncprocessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链身份状态更新，此API目前仅支持设备状态更新
     * Summary: 信物链身份状态更新</p>
     */
    public UpdateThingsdidStatusResponse updateThingsdidStatus(UpdateThingsdidStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThingsdidStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链身份状态更新，此API目前仅支持设备状态更新
     * Summary: 信物链身份状态更新</p>
     */
    public UpdateThingsdidStatusResponse updateThingsdidStatusEx(UpdateThingsdidStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateThingsdidStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链设备空间关联更新，完成设备和空间关联绑定
     * Summary: 信物链设备空间关联更新</p>
     */
    public UpdateThingsdidDevicespaceResponse updateThingsdidDevicespace(UpdateThingsdidDevicespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThingsdidDevicespaceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链设备空间关联更新，完成设备和空间关联绑定
     * Summary: 信物链设备空间关联更新</p>
     */
    public UpdateThingsdidDevicespaceResponse updateThingsdidDevicespaceEx(UpdateThingsdidDevicespaceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.devicespace.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateThingsdidDevicespaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链实体did查询，根据dataFilter过滤输出
     * Summary: 信物链实体did查询</p>
     */
    public QueryThingsdidDidResponse queryThingsdidDid(QueryThingsdidDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThingsdidDidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链实体did查询，根据dataFilter过滤输出
     * Summary: 信物链实体did查询</p>
     */
    public QueryThingsdidDidResponse queryThingsdidDidEx(QueryThingsdidDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.did.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThingsdidDidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链实体身份更新，字段空则不更新。
     * Summary: 信物链实体身份更新</p>
     */
    public UpdateThingsdidDidResponse updateThingsdidDid(UpdateThingsdidDidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThingsdidDidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链实体身份更新，字段空则不更新。
     * Summary: 信物链实体身份更新</p>
     */
    public UpdateThingsdidDidResponse updateThingsdidDidEx(UpdateThingsdidDidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.did.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateThingsdidDidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链租户信息关联
     * Summary: 信物链租户信息关联</p>
     */
    public StartTenantBindinfoResponse startTenantBindinfo(StartTenantBindinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTenantBindinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链租户信息关联
     * Summary: 信物链租户信息关联</p>
     */
    public StartTenantBindinfoResponse startTenantBindinfoEx(StartTenantBindinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tenant.bindinfo.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartTenantBindinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
     * Summary: 信物链租户项目创建</p>
     */
    public CreateTenantProjectResponse createTenantProject(CreateTenantProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTenantProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
     * Summary: 信物链租户项目创建</p>
     */
    public CreateTenantProjectResponse createTenantProjectEx(CreateTenantProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tenant.project.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTenantProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链实体访问权限更新
     * 所有者/使用者/观察者权限更新
     * Summary: 信物链实体访问权限更新</p>
     */
    public UpdateThingsdidTenantResponse updateThingsdidTenant(UpdateThingsdidTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThingsdidTenantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 信物链实体访问权限更新
     * 所有者/使用者/观察者权限更新
     * Summary: 信物链实体访问权限更新</p>
     */
    public UpdateThingsdidTenantResponse updateThingsdidTenantEx(UpdateThingsdidTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.thingsdid.tenant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateThingsdidTenantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: LoadCertificateTSMCmd，仅限内部使用api
     * Summary: TSM迁移内部使用 </p>
     */
    public LoadTsmCertificatetsmResponse loadTsmCertificatetsm(LoadTsmCertificatetsmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadTsmCertificatetsmEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: LoadCertificateTSMCmd，仅限内部使用api
     * Summary: TSM迁移内部使用 </p>
     */
    public LoadTsmCertificatetsmResponse loadTsmCertificatetsmEx(LoadTsmCertificatetsmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tsm.certificatetsm.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadTsmCertificatetsmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: TSM迁移内部使用
     * Summary: loadResourceFile</p>
     */
    public LoadTsmResourcefileResponse loadTsmResourcefile(LoadTsmResourcefileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadTsmResourcefileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: TSM迁移内部使用
     * Summary: loadResourceFile</p>
     */
    public LoadTsmResourcefileResponse loadTsmResourcefileEx(LoadTsmResourcefileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tsm.resourcefile.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadTsmResourcefileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 触发tlsnotary文件认证任务
     * Summary: 触发tlsnotary文件认证任务</p>
     */
    public StartTlsnotaryTaskResponse startTlsnotaryTask(StartTlsnotaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startTlsnotaryTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 触发tlsnotary文件认证任务
     * Summary: 触发tlsnotary文件认证任务</p>
     */
    public StartTlsnotaryTaskResponse startTlsnotaryTaskEx(StartTlsnotaryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tlsnotary.task.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartTlsnotaryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询tlsnotary文件认证任务结果
     * Summary: 查询tlsnotary文件认证任务结果</p>
     */
    public QueryTlsnotaryTaskResponse queryTlsnotaryTask(QueryTlsnotaryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTlsnotaryTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询tlsnotary文件认证任务结果
     * Summary: 查询tlsnotary文件认证任务结果</p>
     */
    public QueryTlsnotaryTaskResponse queryTlsnotaryTaskEx(QueryTlsnotaryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "blockchain.bot.tlsnotary.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTlsnotaryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建</p>
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
