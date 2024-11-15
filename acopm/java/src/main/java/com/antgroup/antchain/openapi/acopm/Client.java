// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acopm;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.acopm.models.*;

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
                    new TeaPair("sdk_version", "1.3.39"),
                    new TeaPair("_prod_code", "ACOPM"),
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
     * Description: 获取产品列表
     * Summary: 获取产品列表
     */
    public ListProductResponse listProduct(ListProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listProductEx(request, headers, runtime);
    }

    /**
     * Description: 获取产品列表
     * Summary: 获取产品列表
     */
    public ListProductResponse listProductEx(ListProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.product.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListProductResponse());
    }

    /**
     * Description: 阿里云Tea多语言SDK生成回调
     * Summary: 阿里云Tea多语言SDK生成回调
     */
    public CallbackMultisdkResponse callbackMultisdk(CallbackMultisdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackMultisdkEx(request, headers, runtime);
    }

    /**
     * Description: 阿里云Tea多语言SDK生成回调
     * Summary: 阿里云Tea多语言SDK生成回调
     */
    public CallbackMultisdkResponse callbackMultisdkEx(CallbackMultisdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.multisdk.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackMultisdkResponse());
    }

    /**
     * Description: 创建产品
     * Summary: 创建产品
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductEx(request, headers, runtime);
    }

    /**
     * Description: 创建产品
     * Summary: 创建产品
     */
    public CreateProductResponse createProductEx(CreateProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.product.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateProductResponse());
    }

    /**
     * Description: api初始化
     * Summary: api初始化
     */
    public InitProductResponse initProduct(InitProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initProductEx(request, headers, runtime);
    }

    /**
     * Description: api初始化
     * Summary: api初始化
     */
    public InitProductResponse initProductEx(InitProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.product.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitProductResponse());
    }

    /**
     * Description: 删除产品
     * Summary: 删除产品
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductEx(request, headers, runtime);
    }

    /**
     * Description: 删除产品
     * Summary: 删除产品
     */
    public DeleteProductResponse deleteProductEx(DeleteProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.product.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteProductResponse());
    }

    /**
     * Description: 发布sdk
     * Summary: 发布sdk
     */
    public PublishProductSdkResponse publishProductSdk(PublishProductSdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishProductSdkEx(request, headers, runtime);
    }

    /**
     * Description: 发布sdk
     * Summary: 发布sdk
     */
    public PublishProductSdkResponse publishProductSdkEx(PublishProductSdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.product.sdk.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishProductSdkResponse());
    }

    /**
     * Description: 获取sdk元数据snapshot
     * Summary: 获取sdk元数据snapshot
     */
    public GetSdkResponse getSdk(GetSdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSdkEx(request, headers, runtime);
    }

    /**
     * Description: 获取sdk元数据snapshot
     * Summary: 获取sdk元数据snapshot
     */
    public GetSdkResponse getSdkEx(GetSdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.sdk.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSdkResponse());
    }

    /**
     * Description: 发布共享能力中心sdk
     * Summary: 共享能力中心sdk发布
     */
    public PublishProductSaassdkResponse publishProductSaassdk(PublishProductSaassdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishProductSaassdkEx(request, headers, runtime);
    }

    /**
     * Description: 发布共享能力中心sdk
     * Summary: 共享能力中心sdk发布
     */
    public PublishProductSaassdkResponse publishProductSaassdkEx(PublishProductSaassdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.product.saassdk.publish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PublishProductSaassdkResponse());
    }

    /**
     * Description: 共享能力中心获取sdk打包结果
     * Summary: 共享能力中心获取sdk打包结果
     */
    public GetProductSaassdkResponse getProductSaassdk(GetProductSaassdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProductSaassdkEx(request, headers, runtime);
    }

    /**
     * Description: 共享能力中心获取sdk打包结果
     * Summary: 共享能力中心获取sdk打包结果
     */
    public GetProductSaassdkResponse getProductSaassdkEx(GetProductSaassdkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.product.saassdk.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetProductSaassdkResponse());
    }

    /**
     * Description: 同步产品成员权限
     * Summary: 同步产品成员权限
     */
    public AddProductMemberResponse addProductMember(AddProductMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addProductMemberEx(request, headers, runtime);
    }

    /**
     * Description: 同步产品成员权限
     * Summary: 同步产品成员权限
     */
    public AddProductMemberResponse addProductMemberEx(AddProductMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.product.member.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddProductMemberResponse());
    }

    /**
     * Description: 查询api限流信息
     * Summary: 查询api限流信息（api）
     */
    public QueryApiRatelimitResponse queryApiRatelimit(QueryApiRatelimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiRatelimitEx(request, headers, runtime);
    }

    /**
     * Description: 查询api限流信息
     * Summary: 查询api限流信息（api）
     */
    public QueryApiRatelimitResponse queryApiRatelimitEx(QueryApiRatelimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.api.ratelimit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiRatelimitResponse());
    }

    /**
     * Description:  查询api限流信息
     * Summary:  查询api限流信息（租户维度）
     */
    public QueryTenantRatelimitResponse queryTenantRatelimit(QueryTenantRatelimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTenantRatelimitEx(request, headers, runtime);
    }

    /**
     * Description:  查询api限流信息
     * Summary:  查询api限流信息（租户维度）
     */
    public QueryTenantRatelimitResponse queryTenantRatelimitEx(QueryTenantRatelimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.tenant.ratelimit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTenantRatelimitResponse());
    }

    /**
     * Description: api限流更新
     * Summary: api限流更新（api维度）
     */
    public UpdateApiRatelimitResponse updateApiRatelimit(UpdateApiRatelimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApiRatelimitEx(request, headers, runtime);
    }

    /**
     * Description: api限流更新
     * Summary: api限流更新（api维度）
     */
    public UpdateApiRatelimitResponse updateApiRatelimitEx(UpdateApiRatelimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.api.ratelimit.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApiRatelimitResponse());
    }

    /**
     * Description: api限流更新
     * Summary: api限流更新（租户维度）
     */
    public UpdateTenantRatelimitResponse updateTenantRatelimit(UpdateTenantRatelimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTenantRatelimitEx(request, headers, runtime);
    }

    /**
     * Description: api限流更新
     * Summary: api限流更新（租户维度）
     */
    public UpdateTenantRatelimitResponse updateTenantRatelimitEx(UpdateTenantRatelimitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.tenant.ratelimit.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateTenantRatelimitResponse());
    }

    /**
     * Description: 九州工单回调接口
     * Summary: 九州工单回调接口
     */
    public CallbackJiuzhouPlanResponse callbackJiuzhouPlan(CallbackJiuzhouPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackJiuzhouPlanEx(request, headers, runtime);
    }

    /**
     * Description: 九州工单回调接口
     * Summary: 九州工单回调接口
     */
    public CallbackJiuzhouPlanResponse callbackJiuzhouPlanEx(CallbackJiuzhouPlanRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.jiuzhou.plan.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackJiuzhouPlanResponse());
    }

    /**
     * Description: 智能排障机器人接口
     * Summary: 排障机器人接口
     */
    public ExecRobotIntelligentResponse execRobotIntelligent(ExecRobotIntelligentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRobotIntelligentEx(request, headers, runtime);
    }

    /**
     * Description: 智能排障机器人接口
     * Summary: 排障机器人接口
     */
    public ExecRobotIntelligentResponse execRobotIntelligentEx(ExecRobotIntelligentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.robot.intelligent.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRobotIntelligentResponse());
    }

    /**
     * Description: 生产环境api状态更新
     * Summary: 生产环境api状态更新
     */
    public UpdateApisStatusResponse updateApisStatus(UpdateApisStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateApisStatusEx(request, headers, runtime);
    }

    /**
     * Description: 生产环境api状态更新
     * Summary: 生产环境api状态更新
     */
    public UpdateApisStatusResponse updateApisStatusEx(UpdateApisStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.apis.status.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateApisStatusResponse());
    }

    /**
     * Description: 查询商业产品sdk版本api信息
     * Summary: 查询商业产品sdk版本api信息
     */
    public QuerySdkApiResponse querySdkApi(QuerySdkApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySdkApiEx(request, headers, runtime);
    }

    /**
     * Description: 查询商业产品sdk版本api信息
     * Summary: 查询商业产品sdk版本api信息
     */
    public QuerySdkApiResponse querySdkApiEx(QuerySdkApiRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.sdk.api.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySdkApiResponse());
    }

    /**
     * Description: 企业认证排障
     * Summary: 企业认证排障
     */
    public ExecRobotBaasplusResponse execRobotBaasplus(ExecRobotBaasplusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRobotBaasplusEx(request, headers, runtime);
    }

    /**
     * Description: 企业认证排障
     * Summary: 企业认证排障
     */
    public ExecRobotBaasplusResponse execRobotBaasplusEx(ExecRobotBaasplusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.robot.baasplus.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRobotBaasplusResponse());
    }

    /**
     * Description: api数据获取
     * Summary: api数据获取
     */
    public QueryApiDetailResponse queryApiDetail(QueryApiDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiDetailEx(request, headers, runtime);
    }

    /**
     * Description: api数据获取
     * Summary: api数据获取
     */
    public QueryApiDetailResponse queryApiDetailEx(QueryApiDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.api.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiDetailResponse());
    }

    /**
     * Description: 查询api负责人信息
     * Summary: 查询api负责人信息
     */
    public QueryApiOwnerResponse queryApiOwner(QueryApiOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryApiOwnerEx(request, headers, runtime);
    }

    /**
     * Description: 查询api负责人信息
     * Summary: 查询api负责人信息
     */
    public QueryApiOwnerResponse queryApiOwnerEx(QueryApiOwnerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.api.owner.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryApiOwnerResponse());
    }

    /**
     * Description: 请求刷新gw的缓存
     * Summary: 网关运行态gw cache刷新
     */
    public UpdateGwCacheResponse updateGwCache(UpdateGwCacheRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateGwCacheEx(request, headers, runtime);
    }

    /**
     * Description: 请求刷新gw的缓存
     * Summary: 网关运行态gw cache刷新
     */
    public UpdateGwCacheResponse updateGwCacheEx(UpdateGwCacheRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.gw.cache.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateGwCacheResponse());
    }

    /**
     * Description: 商业化规则创建
     * Summary: 商业化规则创建
     */
    public CreateBusinessruleOperateResponse createBusinessruleOperate(CreateBusinessruleOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBusinessruleOperateEx(request, headers, runtime);
    }

    /**
     * Description: 商业化规则创建
     * Summary: 商业化规则创建
     */
    public CreateBusinessruleOperateResponse createBusinessruleOperateEx(CreateBusinessruleOperateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.businessrule.operate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBusinessruleOperateResponse());
    }

    /**
     * Description: 生效商业化规则
     * Summary: 生效商业化规则
     */
    public EnableBusinessruleOperateResponse enableBusinessruleOperate(EnableBusinessruleOperateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableBusinessruleOperateEx(request, headers, runtime);
    }

    /**
     * Description: 生效商业化规则
     * Summary: 生效商业化规则
     */
    public EnableBusinessruleOperateResponse enableBusinessruleOperateEx(EnableBusinessruleOperateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.businessrule.operate.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableBusinessruleOperateResponse());
    }

    /**
     * Description: 查询规则匹配情况
     * Summary: 查询规则匹配情况
     */
    public QueryBusinessruleMatchResponse queryBusinessruleMatch(QueryBusinessruleMatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessruleMatchEx(request, headers, runtime);
    }

    /**
     * Description: 查询规则匹配情况
     * Summary: 查询规则匹配情况
     */
    public QueryBusinessruleMatchResponse queryBusinessruleMatchEx(QueryBusinessruleMatchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.businessrule.match.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessruleMatchResponse());
    }

    /**
     * Description: 查询当前登录人有权限的服务列表
     * Summary: 查询当前登录人有权限的服务列表
     */
    public QueryBusinessruleServicesResponse queryBusinessruleServices(QueryBusinessruleServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessruleServicesEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前登录人有权限的服务列表
     * Summary: 查询当前登录人有权限的服务列表
     */
    public QueryBusinessruleServicesResponse queryBusinessruleServicesEx(QueryBusinessruleServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.businessrule.services.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessruleServicesResponse());
    }

    /**
     * Description: 查询单个服务的参数/返回等元信息
     * Summary: 查询单个服务的参数/返回等元信息
     */
    public GetBusinessruleServicesResponse getBusinessruleServices(GetBusinessruleServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBusinessruleServicesEx(request, headers, runtime);
    }

    /**
     * Description: 查询单个服务的参数/返回等元信息
     * Summary: 查询单个服务的参数/返回等元信息
     */
    public GetBusinessruleServicesResponse getBusinessruleServicesEx(GetBusinessruleServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.businessrule.services.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBusinessruleServicesResponse());
    }

    /**
     * Description: 实例更新
     * Summary: 实例更新
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 实例更新
     * Summary: 实例更新
     */
    public UpdateInstanceResponse updateInstanceEx(UpdateInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.instance.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInstanceResponse());
    }

    /**
     * Description: 租户实例更新
     * Summary: 租户实例更新
     */
    public UpdateInstanceTenantResponse updateInstanceTenant(UpdateInstanceTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateInstanceTenantEx(request, headers, runtime);
    }

    /**
     * Description: 租户实例更新
     * Summary: 租户实例更新
     */
    public UpdateInstanceTenantResponse updateInstanceTenantEx(UpdateInstanceTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acopm.instance.tenant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateInstanceTenantResponse());
    }
}
