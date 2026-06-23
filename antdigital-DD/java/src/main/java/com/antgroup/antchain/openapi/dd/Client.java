// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dd;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.dd.models.*;

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
                    new TeaPair("_prod_code", "DD"),
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
     * <p>Description: 测试使用
     * Summary: 测试使用</p>
     */
    public QueryDemoTestJltestResponse queryDemoTestJltest(QueryDemoTestJltestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoTestJltestEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试使用
     * Summary: 测试使用</p>
     */
    public QueryDemoTestJltestResponse queryDemoTestJltestEx(QueryDemoTestJltestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.jltest.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoTestJltestResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderxResponse createDemoBusinessOrderx(CreateDemoBusinessOrderxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderxEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderxResponse createDemoBusinessOrderxEx(CreateDemoBusinessOrderxRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderx.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderxResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderzResponse createDemoBusinessOrderz(CreateDemoBusinessOrderzRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderzEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderzResponse createDemoBusinessOrderzEx(CreateDemoBusinessOrderzRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderzResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderyResponse createDemoBusinessOrdery(CreateDemoBusinessOrderyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderyResponse createDemoBusinessOrderyEx(CreateDemoBusinessOrderyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.ordery.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单N
     * Summary: 创建订单N</p>
     */
    public CreateDemoBusinessOrdernResponse createDemoBusinessOrdern(CreateDemoBusinessOrdernRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrdernEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单N
     * Summary: 创建订单N</p>
     */
    public CreateDemoBusinessOrdernResponse createDemoBusinessOrdernEx(CreateDemoBusinessOrdernRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.ordern.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrdernResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderaaResponse createDemoBusinessOrderaa(CreateDemoBusinessOrderaaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderaaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderaaResponse createDemoBusinessOrderaaEx(CreateDemoBusinessOrderaaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderaa.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderaaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderqResponse createDemoBusinessOrderq(CreateDemoBusinessOrderqRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderqEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderqResponse createDemoBusinessOrderqEx(CreateDemoBusinessOrderqRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderq.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderqResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderbResponse createDemoBusinessOrderb(CreateDemoBusinessOrderbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderbEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderbResponse createDemoBusinessOrderbEx(CreateDemoBusinessOrderbRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderb.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderbResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public TestDemoTestApiResponse testDemoTestApi(TestDemoTestApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testDemoTestApiEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 测试接口
     * Summary: 测试接口</p>
     */
    public TestDemoTestApiResponse testDemoTestApiEx(TestDemoTestApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.test.api.test", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TestDemoTestApiResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrdercResponse createDemoBusinessOrderc(CreateDemoBusinessOrdercRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrdercEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrdercResponse createDemoBusinessOrdercEx(CreateDemoBusinessOrdercRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderc.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrdercResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderdResponse createDemoBusinessOrderd(CreateDemoBusinessOrderdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDemoBusinessOrderdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建订单
     * Summary: 创建订单</p>
     */
    public CreateDemoBusinessOrderdResponse createDemoBusinessOrderdEx(CreateDemoBusinessOrderdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "demo.business.orderd.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDemoBusinessOrderdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户所属项目列表
     * Summary: 查询用户所属项目列表</p>
     */
    public QueryAntcloudAcmUserProjectResponse queryAntcloudAcmUserProject(QueryAntcloudAcmUserProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudAcmUserProjectEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户所属项目列表
     * Summary: 查询用户所属项目列表</p>
     */
    public QueryAntcloudAcmUserProjectResponse queryAntcloudAcmUserProjectEx(QueryAntcloudAcmUserProjectRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.user.project.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudAcmUserProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 线上对比线下计量计费资源包配置接口
     * Summary: 线上对比线下计量计费资源包配置接口</p>
     */
    public CheckAntcloudBillingConfigPreResponse checkAntcloudBillingConfigPre(CheckAntcloudBillingConfigPreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAntcloudBillingConfigPreEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 线上对比线下计量计费资源包配置接口
     * Summary: 线上对比线下计量计费资源包配置接口</p>
     */
    public CheckAntcloudBillingConfigPreResponse checkAntcloudBillingConfigPreEx(CheckAntcloudBillingConfigPreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.billing.config.pre.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAntcloudBillingConfigPreResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部发券
     * Summary: 外部发券</p>
     */
    public SendAntcloudMarketingPartnerCouponResponse sendAntcloudMarketingPartnerCoupon(SendAntcloudMarketingPartnerCouponRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendAntcloudMarketingPartnerCouponEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部发券
     * Summary: 外部发券</p>
     */
    public SendAntcloudMarketingPartnerCouponResponse sendAntcloudMarketingPartnerCouponEx(SendAntcloudMarketingPartnerCouponRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketing.partner.coupon.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendAntcloudMarketingPartnerCouponResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户查询券余量
     * Summary: 外部客户查询券余量</p>
     */
    public QueryAntcloudMarketingPartnerCouponstockResponse queryAntcloudMarketingPartnerCouponstock(QueryAntcloudMarketingPartnerCouponstockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudMarketingPartnerCouponstockEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 外部客户查询券余量
     * Summary: 外部客户查询券余量</p>
     */
    public QueryAntcloudMarketingPartnerCouponstockResponse queryAntcloudMarketingPartnerCouponstockEx(QueryAntcloudMarketingPartnerCouponstockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.marketing.partner.couponstock.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudMarketingPartnerCouponstockResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
     * Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果</p>
     */
    public QueryAntcloudTradeComboOptionsResponse queryAntcloudTradeComboOptions(QueryAntcloudTradeComboOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudTradeComboOptionsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
     * Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果</p>
     */
    public QueryAntcloudTradeComboOptionsResponse queryAntcloudTradeComboOptionsEx(QueryAntcloudTradeComboOptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.options.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudTradeComboOptionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</p>
     */
    public CreatewithoptionsAntcloudTradeComboResponse createwithoptionsAntcloudTradeCombo(CreatewithoptionsAntcloudTradeComboRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createwithoptionsAntcloudTradeComboEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</p>
     */
    public CreatewithoptionsAntcloudTradeComboResponse createwithoptionsAntcloudTradeComboEx(CreatewithoptionsAntcloudTradeComboRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.createwithoptions", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatewithoptionsAntcloudTradeComboResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
     * Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消</p>
     */
    public CancelAntcloudTradeComboResponse cancelAntcloudTradeCombo(CancelAntcloudTradeComboRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelAntcloudTradeComboEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
     * Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消</p>
     */
    public CancelAntcloudTradeComboResponse cancelAntcloudTradeComboEx(CancelAntcloudTradeComboRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelAntcloudTradeComboResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</p>
     */
    public CreateAntcloudTradeComboOptionsResponse createAntcloudTradeComboOptions(CreateAntcloudTradeComboOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudTradeComboOptionsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
     * Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</p>
     */
    public CreateAntcloudTradeComboOptionsResponse createAntcloudTradeComboOptionsEx(CreateAntcloudTradeComboOptionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.options.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudTradeComboOptionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品定价查询
     * Summary: 商品定价查询</p>
     */
    public QueryAntcloudPccCommodityPriceResponse queryAntcloudPccCommodityPrice(QueryAntcloudPccCommodityPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAntcloudPccCommodityPriceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品定价查询
     * Summary: 商品定价查询</p>
     */
    public QueryAntcloudPccCommodityPriceResponse queryAntcloudPccCommodityPriceEx(QueryAntcloudPccCommodityPriceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.pcc.commodity.price.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAntcloudPccCommodityPriceResponse());
    }
}
