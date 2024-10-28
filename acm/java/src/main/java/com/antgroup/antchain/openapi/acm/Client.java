// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.acm.models.*;

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
                    new TeaPair("sdk_version", "1.6.0"),
                    new TeaPair("_prod_code", "acm"),
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
     * Description: 查询企业详情
     * Summary: 获取企业
     */
    public GetCustomerResponse getCustomer(GetCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业详情
     * Summary: 获取企业
     */
    public GetCustomerResponse getCustomerEx(GetCustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.customer.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCustomerResponse());
    }

    /**
     * Description: 查询一个操作员的详情
     * Summary: 获取操作员
     */
    public GetOperatorResponse getOperator(GetOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 查询一个操作员的详情
     * Summary: 获取操作员
     */
    public GetOperatorResponse getOperatorEx(GetOperatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.operator.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetOperatorResponse());
    }

    /**
     * Description: 查询操作员列表
     * Summary: 查询操作员
     */
    public QueryOperatorResponse queryOperator(QueryOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 查询操作员列表
     * Summary: 查询操作员
     */
    public QueryOperatorResponse queryOperatorEx(QueryOperatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.operator.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryOperatorResponse());
    }

    /**
     * Description: 搜索操作员
     * Summary: 搜索操作员
     */
    public SearchOperatorResponse searchOperator(SearchOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 搜索操作员
     * Summary: 搜索操作员
     */
    public SearchOperatorResponse searchOperatorEx(SearchOperatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.operator.search", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SearchOperatorResponse());
    }

    /**
     * Description: 创建操作员
     * Summary: 创建操作员
     */
    public CreateOperatorResponse createOperator(CreateOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 创建操作员
     * Summary: 创建操作员
     */
    public CreateOperatorResponse createOperatorEx(CreateOperatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.operator.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOperatorResponse());
    }

    /**
     * Description: 更新操作员
     * Summary: 更新操作员
     */
    public UpdateOperatorResponse updateOperator(UpdateOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 更新操作员
     * Summary: 更新操作员
     */
    public UpdateOperatorResponse updateOperatorEx(UpdateOperatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.operator.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateOperatorResponse());
    }

    /**
     * Description: 删除操作员
     * Summary: 删除操作员
     */
    public DeleteOperatorResponse deleteOperator(DeleteOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteOperatorEx(request, headers, runtime);
    }

    /**
     * Description: 删除操作员
     * Summary: 删除操作员
     */
    public DeleteOperatorResponse deleteOperatorEx(DeleteOperatorRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.operator.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteOperatorResponse());
    }

    /**
     * Description: 添加租户成员
     * Summary: 添加租户成员
     */
    public AddTenantMemberResponse addTenantMember(AddTenantMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTenantMemberEx(request, headers, runtime);
    }

    /**
     * Description: 添加租户成员
     * Summary: 添加租户成员
     */
    public AddTenantMemberResponse addTenantMemberEx(AddTenantMemberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.member.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddTenantMemberResponse());
    }

    /**
     * Description: 初始化租户
     * Summary: 初始化租户
     */
    public CreateTenantResponse createTenant(CreateTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTenantEx(request, headers, runtime);
    }

    /**
     * Description: 初始化租户
     * Summary: 初始化租户
     */
    public CreateTenantResponse createTenantEx(CreateTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTenantResponse());
    }

    /**
     * Description: 查询租户详情
     * Summary: 获取用户信息
     */
    public GetTenantResponse getTenant(GetTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTenantEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户详情
     * Summary: 获取用户信息
     */
    public GetTenantResponse getTenantEx(GetTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTenantResponse());
    }

    /**
     * Description: 查询租户列表
     * Summary: 查询租户列表
     */
    public QueryTenantResponse queryTenant(QueryTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTenantEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户列表
     * Summary: 查询租户列表
     */
    public QueryTenantResponse queryTenantEx(QueryTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTenantResponse());
    }

    /**
     * Description: 根据蚂蚁通行证uid查询租户id
     * Summary: 查询租户ID
     */
    public GetAntpassportTenantResponse getAntpassportTenant(GetAntpassportTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAntpassportTenantEx(request, headers, runtime);
    }

    /**
     * Description: 根据蚂蚁通行证uid查询租户id
     * Summary: 查询租户ID
     */
    public GetAntpassportTenantResponse getAntpassportTenantEx(GetAntpassportTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.antpassport.tenant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetAntpassportTenantResponse());
    }

    /**
     * Description: 获取调用接口所使用AccessKey对应的身份实体信息
     * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
     */
    public GetCurrentidResponse getCurrentid(GetCurrentidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCurrentidEx(request, headers, runtime);
    }

    /**
     * Description: 获取调用接口所使用AccessKey对应的身份实体信息
     * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
     */
    public GetCurrentidResponse getCurrentidEx(GetCurrentidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.currentid.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCurrentidResponse());
    }

    /**
     * Description: 获取租户对应的钉钉授权token信息，内部接口
     * Summary: 获取租户的钉钉授权
     */
    public GetTenantDingtokenResponse getTenantDingtoken(GetTenantDingtokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTenantDingtokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取租户对应的钉钉授权token信息，内部接口
     * Summary: 获取租户的钉钉授权
     */
    public GetTenantDingtokenResponse getTenantDingtokenEx(GetTenantDingtokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.dingtoken.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTenantDingtokenResponse());
    }

    /**
     * Description: 分页查询管理员，内部接口
     * Summary: 分页查询管理员
     */
    public QueryAdminResponse queryAdmin(QueryAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAdminEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询管理员，内部接口
     * Summary: 分页查询管理员
     */
    public QueryAdminResponse queryAdminEx(QueryAdminRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.admin.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAdminResponse());
    }

    /**
     * Description: 获取租户的IaaS账号
     * Summary: 获取租户的IaaS账号
     */
    public GetTenantIaasaccountResponse getTenantIaasaccount(GetTenantIaasaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTenantIaasaccountEx(request, headers, runtime);
    }

    /**
     * Description: 获取租户的IaaS账号
     * Summary: 获取租户的IaaS账号
     */
    public GetTenantIaasaccountResponse getTenantIaasaccountEx(GetTenantIaasaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.iaasaccount.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTenantIaasaccountResponse());
    }

    /**
     * Description: 查询企业列表(内部接口,私有云开放)
     * Summary: 查询企业列表
     */
    public ListCustomerResponse listCustomer(ListCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCustomerEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业列表(内部接口,私有云开放)
     * Summary: 查询企业列表
     */
    public ListCustomerResponse listCustomerEx(ListCustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.customer.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListCustomerResponse());
    }

    /**
     * Description: 支付宝账号证书信息校验及校验、入驻、打标
     * Summary: 支付宝账号证书信息校验、入驻、打标
     */
    public CheckAlipayTenantResponse checkAlipayTenant(CheckAlipayTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkAlipayTenantEx(request, headers, runtime);
    }

    /**
     * Description: 支付宝账号证书信息校验及校验、入驻、打标
     * Summary: 支付宝账号证书信息校验、入驻、打标
     */
    public CheckAlipayTenantResponse checkAlipayTenantEx(CheckAlipayTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.alipay.tenant.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckAlipayTenantResponse());
    }

    /**
     * Description: 租户入住状态查询
     * Summary: 租户入住状态查询
     */
    public QueryTenantStatusResponse queryTenantStatus(QueryTenantStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTenantStatusEx(request, headers, runtime);
    }

    /**
     * Description: 租户入住状态查询
     * Summary: 租户入住状态查询
     */
    public QueryTenantStatusResponse queryTenantStatusEx(QueryTenantStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTenantStatusResponse());
    }

    /**
     * Description: 账号创建
     * Summary: 账号创建
     */
    public CreateAntchainTenantResponse createAntchainTenant(CreateAntchainTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntchainTenantEx(request, headers, runtime);
    }

    /**
     * Description: 账号创建
     * Summary: 账号创建
     */
    public CreateAntchainTenantResponse createAntchainTenantEx(CreateAntchainTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.antchain.tenant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntchainTenantResponse());
    }

    /**
     * Description: 客户认证信息更新
     * Summary: 客户认证信息更新
     */
    public UpdateCustomerIdentityResponse updateCustomerIdentity(UpdateCustomerIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCustomerIdentityEx(request, headers, runtime);
    }

    /**
     * Description: 客户认证信息更新
     * Summary: 客户认证信息更新
     */
    public UpdateCustomerIdentityResponse updateCustomerIdentityEx(UpdateCustomerIdentityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.customer.identity.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateCustomerIdentityResponse());
    }

    /**
     * Description: 使用用户ID或用户CODE查询用户信息
     * Summary: 使用用户ID或用户CODE查询用户信息
     */
    public GetMasterTenantResponse getMasterTenant(GetMasterTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMasterTenantEx(request, headers, runtime);
    }

    /**
     * Description: 使用用户ID或用户CODE查询用户信息
     * Summary: 使用用户ID或用户CODE查询用户信息
     */
    public GetMasterTenantResponse getMasterTenantEx(GetMasterTenantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.master.tenant.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetMasterTenantResponse());
    }

    /**
     * Description: 检查邮箱是否可以用来注册
     * Summary: 检查邮箱是否可以用来注册
     */
    public CheckLoginnameResponse checkLoginname(CheckLoginnameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkLoginnameEx(request, headers, runtime);
    }

    /**
     * Description: 检查邮箱是否可以用来注册
     * Summary: 检查邮箱是否可以用来注册
     */
    public CheckLoginnameResponse checkLoginnameEx(CheckLoginnameRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.loginname.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckLoginnameResponse());
    }

    /**
     * Description: 查询租户的标签
     * Summary: 查询租户的标签列表
     */
    public QueryTenantTagResponse queryTenantTag(QueryTenantTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTenantTagEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户的标签
     * Summary: 查询租户的标签列表
     */
    public QueryTenantTagResponse queryTenantTagEx(QueryTenantTagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.tag.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryTenantTagResponse());
    }

    /**
     * Description: 租户增加业务标签
     * Summary: 租户增加业务标签
     */
    public AddTenantBusinesstagResponse addTenantBusinesstag(AddTenantBusinesstagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addTenantBusinesstagEx(request, headers, runtime);
    }

    /**
     * Description: 租户增加业务标签
     * Summary: 租户增加业务标签
     */
    public AddTenantBusinesstagResponse addTenantBusinesstagEx(AddTenantBusinesstagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.businesstag.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddTenantBusinesstagResponse());
    }

    /**
     * Description: 删除业务标签
     * Summary: 删除业务标签
     */
    public RemoveTenantBusinesstagResponse removeTenantBusinesstag(RemoveTenantBusinesstagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeTenantBusinesstagEx(request, headers, runtime);
    }

    /**
     * Description: 删除业务标签
     * Summary: 删除业务标签
     */
    public RemoveTenantBusinesstagResponse removeTenantBusinesstagEx(RemoveTenantBusinesstagRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.businesstag.remove", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RemoveTenantBusinesstagResponse());
    }

    /**
     * Description: 用户发送操作员的激活邮件
     * Summary: 操作员发送激活邮件
     */
    public SendOperatorActiveemailResponse sendOperatorActiveemail(SendOperatorActiveemailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendOperatorActiveemailEx(request, headers, runtime);
    }

    /**
     * Description: 用户发送操作员的激活邮件
     * Summary: 操作员发送激活邮件
     */
    public SendOperatorActiveemailResponse sendOperatorActiveemailEx(SendOperatorActiveemailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.operator.activeemail.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendOperatorActiveemailResponse());
    }

    /**
     * Description: 账号信息同步
     * Summary: 账号信息同步
     */
    public SyncTenantInfoResponse syncTenantInfo(SyncTenantInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTenantInfoEx(request, headers, runtime);
    }

    /**
     * Description: 账号信息同步
     * Summary: 账号信息同步
     */
    public SyncTenantInfoResponse syncTenantInfoEx(SyncTenantInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.tenant.info.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTenantInfoResponse());
    }

    /**
     * Description: 三方授权创建服务账号
     * Summary: 三方授权创建服务账号
     */
    public CreateOauthServiceaccountResponse createOauthServiceaccount(CreateOauthServiceaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOauthServiceaccountEx(request, headers, runtime);
    }

    /**
     * Description: 三方授权创建服务账号
     * Summary: 三方授权创建服务账号
     */
    public CreateOauthServiceaccountResponse createOauthServiceaccountEx(CreateOauthServiceaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.oauth.serviceaccount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOauthServiceaccountResponse());
    }

    /**
     * Description: 三方授权获取服务账号信息
     * Summary: 三方授权获取服务账号信息
     */
    public GetOauthServiceaccountResponse getOauthServiceaccount(GetOauthServiceaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOauthServiceaccountEx(request, headers, runtime);
    }

    /**
     * Description: 三方授权获取服务账号信息
     * Summary: 三方授权获取服务账号信息
     */
    public GetOauthServiceaccountResponse getOauthServiceaccountEx(GetOauthServiceaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.oauth.serviceaccount.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetOauthServiceaccountResponse());
    }

    /**
     * Description: 三方授权开通手机号登陆
     * Summary: 三方授权开通手机号登陆
     */
    public EnableOauthMobileloginResponse enableOauthMobilelogin(EnableOauthMobileloginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableOauthMobileloginEx(request, headers, runtime);
    }

    /**
     * Description: 三方授权开通手机号登陆
     * Summary: 三方授权开通手机号登陆
     */
    public EnableOauthMobileloginResponse enableOauthMobileloginEx(EnableOauthMobileloginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.oauth.mobilelogin.enable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new EnableOauthMobileloginResponse());
    }

    /**
     * Description: 三方授权关闭手机号登陆
     * Summary: 三方授权关闭手机号登陆
     */
    public DisableOauthMobileloginResponse disableOauthMobilelogin(DisableOauthMobileloginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableOauthMobileloginEx(request, headers, runtime);
    }

    /**
     * Description: 三方授权关闭手机号登陆
     * Summary: 三方授权关闭手机号登陆
     */
    public DisableOauthMobileloginResponse disableOauthMobileloginEx(DisableOauthMobileloginRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.oauth.mobilelogin.disable", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DisableOauthMobileloginResponse());
    }

    /**
     * Description: 提供给一方化平台代客创建服务账号（ak sk）
     * Summary: 一方化会员服务账号创建
     */
    public CreateServiceaccountOnepartyResponse createServiceaccountOneparty(CreateServiceaccountOnepartyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createServiceaccountOnepartyEx(request, headers, runtime);
    }

    /**
     * Description: 提供给一方化平台代客创建服务账号（ak sk）
     * Summary: 一方化会员服务账号创建
     */
    public CreateServiceaccountOnepartyResponse createServiceaccountOnepartyEx(CreateServiceaccountOnepartyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.serviceaccount.oneparty.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateServiceaccountOnepartyResponse());
    }

    /**
     * Description: 一方化会员服务账号查询（ak sk）
     * Summary: 一方化会员服务账号查询
     */
    public GetServiceaccountOnepartyResponse getServiceaccountOneparty(GetServiceaccountOnepartyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceaccountOnepartyEx(request, headers, runtime);
    }

    /**
     * Description: 一方化会员服务账号查询（ak sk）
     * Summary: 一方化会员服务账号查询
     */
    public GetServiceaccountOnepartyResponse getServiceaccountOnepartyEx(GetServiceaccountOnepartyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.serviceaccount.oneparty.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetServiceaccountOnepartyResponse());
    }

    /**
     * Description: token用于三方会员免密登录，与数科官网token不通用
     * Summary: 三方会员免密登录token申请
     */
    public ApplyTrustloginTokenResponse applyTrustloginToken(ApplyTrustloginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyTrustloginTokenEx(request, headers, runtime);
    }

    /**
     * Description: token用于三方会员免密登录，与数科官网token不通用
     * Summary: 三方会员免密登录token申请
     */
    public ApplyTrustloginTokenResponse applyTrustloginTokenEx(ApplyTrustloginTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.trustlogin.token.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyTrustloginTokenResponse());
    }

    /**
     * Description: 三方会员免密登录token校验，与数科官网token不通用
     * Summary: 三方会员免密登录token校验
     */
    public VerifyTrustloginTokenResponse verifyTrustloginToken(VerifyTrustloginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyTrustloginTokenEx(request, headers, runtime);
    }

    /**
     * Description: 三方会员免密登录token校验，与数科官网token不通用
     * Summary: 三方会员免密登录token校验
     */
    public VerifyTrustloginTokenResponse verifyTrustloginTokenEx(VerifyTrustloginTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.trustlogin.token.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyTrustloginTokenResponse());
    }

    /**
     * Description: 一方化会员创建的服务账号授权
     * Summary: 一方化会员创建的服务账号授权
     */
    public AddServiceaccountAuthpolicyResponse addServiceaccountAuthpolicy(AddServiceaccountAuthpolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addServiceaccountAuthpolicyEx(request, headers, runtime);
    }

    /**
     * Description: 一方化会员创建的服务账号授权
     * Summary: 一方化会员创建的服务账号授权
     */
    public AddServiceaccountAuthpolicyResponse addServiceaccountAuthpolicyEx(AddServiceaccountAuthpolicyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.serviceaccount.authpolicy.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddServiceaccountAuthpolicyResponse());
    }

    /**
     * Description: 查询用户所具有的角色，用于平台型产品管控用户
     * Summary: 查询用户所具有的角色
     */
    public QueryUserRoleResponse queryUserRole(QueryUserRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryUserRoleEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户所具有的角色，用于平台型产品管控用户
     * Summary: 查询用户所具有的角色
     */
    public QueryUserRoleResponse queryUserRoleEx(QueryUserRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.user.role.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryUserRoleResponse());
    }

    /**
     * Description: 角色权限点查询，用于平台型产品
     * Summary: 角色权限点查询
     */
    public QueryRoleActionResponse queryRoleAction(QueryRoleActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRoleActionEx(request, headers, runtime);
    }

    /**
     * Description: 角色权限点查询，用于平台型产品
     * Summary: 角色权限点查询
     */
    public QueryRoleActionResponse queryRoleActionEx(QueryRoleActionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.role.action.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRoleActionResponse());
    }

    /**
     * Description: 服务账号（AK）验签
     * Summary: 服务账号（AK）验签
     */
    public VerifyServiceaccountSignatureResponse verifyServiceaccountSignature(VerifyServiceaccountSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyServiceaccountSignatureEx(request, headers, runtime);
    }

    /**
     * Description: 服务账号（AK）验签
     * Summary: 服务账号（AK）验签
     */
    public VerifyServiceaccountSignatureResponse verifyServiceaccountSignatureEx(VerifyServiceaccountSignatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.serviceaccount.signature.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyServiceaccountSignatureResponse());
    }

    /**
     * Description: 创建用户登录态（线下环境使用）
     * Summary: 创建用户登录态（线下环境使用）
     */
    public CreateUserTokenResponse createUserToken(CreateUserTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserTokenEx(request, headers, runtime);
    }

    /**
     * Description: 创建用户登录态（线下环境使用）
     * Summary: 创建用户登录态（线下环境使用）
     */
    public CreateUserTokenResponse createUserTokenEx(CreateUserTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.user.token.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateUserTokenResponse());
    }

    /**
     * Description: 刷新用户登录态（线下环境使用）
     * Summary: 刷新用户登录态（线下环境使用）
     */
    public RefreshUserTokenResponse refreshUserToken(RefreshUserTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshUserTokenEx(request, headers, runtime);
    }

    /**
     * Description: 刷新用户登录态（线下环境使用）
     * Summary: 刷新用户登录态（线下环境使用）
     */
    public RefreshUserTokenResponse refreshUserTokenEx(RefreshUserTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.user.token.refresh", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RefreshUserTokenResponse());
    }

    /**
     * Description: 三方会员免密登录token删除
     * Summary: 三方会员免密登录token删除
     */
    public DeleteTrustloginTokenResponse deleteTrustloginToken(DeleteTrustloginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTrustloginTokenEx(request, headers, runtime);
    }

    /**
     * Description: 三方会员免密登录token删除
     * Summary: 三方会员免密登录token删除
     */
    public DeleteTrustloginTokenResponse deleteTrustloginTokenEx(DeleteTrustloginTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.acm.trustlogin.token.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteTrustloginTokenResponse());
    }
}
