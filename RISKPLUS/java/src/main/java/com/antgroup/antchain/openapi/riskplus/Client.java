// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.riskplus.models.*;
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
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.Client.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.Client.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "1.6.5")
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
                request_.query.put("sign", com.antgroup.antchain.openapi.antchain.util.Client.getSignature(signedParam, _accessKeySecret));
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_);

                String raw = com.aliyun.teautil.Common.readAsString(response_.body);
                Object obj = com.aliyun.teautil.Common.parseJSON(raw);
                java.util.Map<String, Object> res = com.aliyun.teautil.Common.assertAsMap(obj);
                java.util.Map<String, Object> resp = com.aliyun.teautil.Common.assertAsMap(res.get("response"));
                if (com.antgroup.antchain.openapi.antchain.util.Client.hasError(raw, _accessKeySecret)) {
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
     * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
     * Summary: 策略咨询服务输出
     */
    public QuerySecurityPolicyResponse querySecurityPolicy(QuerySecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecurityPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行风险识别和风险决策。
     * Summary: 策略咨询服务输出
     */
    public QuerySecurityPolicyResponse querySecurityPolicyEx(QuerySecurityPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecurityPolicyResponse());
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据
     */
    public SendSecurityDataResponse sendSecurityData(SendSecurityDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendSecurityDataEx(request, headers, runtime);
    }

    /**
     * Description: 向风控发送异步安全数据
     * Summary: 异步发送安全数据
     */
    public SendSecurityDataResponse sendSecurityDataEx(SendSecurityDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendSecurityDataResponse());
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出
     */
    public ConfirmSecurityPolicyResponse confirmSecurityPolicy(ConfirmSecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
     * Summary: 安全策略确认服务输出
     */
    public ConfirmSecurityPolicyResponse confirmSecurityPolicyEx(ConfirmSecurityPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.policy.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmSecurityPolicyResponse());
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出
     */
    public CheckSecurityRdsResponse checkSecurityRds(CheckSecurityRdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSecurityRdsEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，进行人机识别判断。
     * Summary: 策略咨询服务输出
     */
    public CheckSecurityRdsResponse checkSecurityRdsEx(CheckSecurityRdsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.rds.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSecurityRdsResponse());
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出
     */
    public QuerySecurityDataResponse querySecurityData(QuerySecurityDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySecurityDataEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
     * Summary: 安全数据服务输出
     */
    public QuerySecurityDataResponse querySecurityDataEx(QuerySecurityDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySecurityDataResponse());
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验
     */
    public CheckSecurityDataResponse checkSecurityData(CheckSecurityDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSecurityDataEx(request, headers, runtime);
    }

    /**
     * Description: 外部客户数据校验接口，比如端防护
     * Summary: 安全数据服务校验
     */
    public CheckSecurityDataResponse checkSecurityDataEx(CheckSecurityDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.security.data.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSecurityDataResponse());
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口
     */
    public VerifyFinserviceZhimaIdentifyResponse verifyFinserviceZhimaIdentify(VerifyFinserviceZhimaIdentifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyFinserviceZhimaIdentifyEx(request, headers, runtime);
    }

    /**
     * Description: 四要素认证首先调用此接口
     * Summary: 芝麻四要素接口
     */
    public VerifyFinserviceZhimaIdentifyResponse verifyFinserviceZhimaIdentifyEx(VerifyFinserviceZhimaIdentifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.finservice.zhima.identify.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyFinserviceZhimaIdentifyResponse());
    }

    /**
     * Description:  
     * Summary: 芝麻四要素认证结果查询
     */
    public QueryFinserviceZhimaIdentifyResponse queryFinserviceZhimaIdentify(QueryFinserviceZhimaIdentifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFinserviceZhimaIdentifyEx(request, headers, runtime);
    }

    /**
     * Description:  
     * Summary: 芝麻四要素认证结果查询
     */
    public QueryFinserviceZhimaIdentifyResponse queryFinserviceZhimaIdentifyEx(QueryFinserviceZhimaIdentifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.finservice.zhima.identify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFinserviceZhimaIdentifyResponse());
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】
     */
    public QueryRbbGenericInvokeResponse queryRbbGenericInvoke(QueryRbbGenericInvokeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbGenericInvokeEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询接口
     * Summary: 【已废弃】
     */
    public QueryRbbGenericInvokeResponse queryRbbGenericInvokeEx(QueryRbbGenericInvokeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.generic.invoke.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbGenericInvokeResponse());
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】
     */
    public CreateRbbTokenResponse createRbbToken(CreateRbbTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbTokenEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版token生成
     * Summary: 【已废弃】
     */
    public CreateRbbTokenResponse createRbbTokenEx(CreateRbbTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.token.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbTokenResponse());
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】
     */
    public CreateRbbApiGwtokenResponse createRbbApiGwtoken(CreateRbbApiGwtokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbApiGwtokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取风险大脑企业版登录token
     * Summary: 【已废弃】
     */
    public CreateRbbApiGwtokenResponse createRbbApiGwtokenEx(CreateRbbApiGwtokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.api.gwtoken.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbApiGwtokenResponse());
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI
     */
    public QueryRbbGeneralResponse queryRbbGeneral(QueryRbbGeneralRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRbbGeneralEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版通用查询OpenAPI
     * Summary: 风险大脑企业版通用查询OpenAPI
     */
    public QueryRbbGeneralResponse queryRbbGeneralEx(QueryRbbGeneralRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.general.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRbbGeneralResponse());
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token
     */
    public GetRbbLoginTokenResponse getRbbLoginToken(GetRbbLoginTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRbbLoginTokenEx(request, headers, runtime);
    }

    /**
     * Description: 获取登录Token
     * Summary: 获取登录Token
     */
    public GetRbbLoginTokenResponse getRbbLoginTokenEx(GetRbbLoginTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.login.token.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRbbLoginTokenResponse());
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户
     */
    public CreateRbbTenantResponse createRbbTenant(CreateRbbTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbTenantEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版创建租户
     * Summary: 风险大脑企业版创建租户
     */
    public CreateRbbTenantResponse createRbbTenantEx(CreateRbbTenantRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.tenant.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbTenantResponse());
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户
     */
    public CreateRbbUserResponse createRbbUser(CreateRbbUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRbbUserEx(request, headers, runtime);
    }

    /**
     * Description: 风险大脑企业版创建用户
     * Summary: 风险大脑企业版创建用户
     */
    public CreateRbbUserResponse createRbbUserEx(CreateRbbUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rbb.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRbbUserResponse());
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表
     */
    public QueryRtopCompanyOpinionResponse queryRtopCompanyOpinion(QueryRtopCompanyOpinionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyOpinionEx(request, headers, runtime);
    }

    /**
     * Description: 查询所在地的负面舆情企业列表
     * Summary: 查询所在地的负面舆情企业列表
     */
    public QueryRtopCompanyOpinionResponse queryRtopCompanyOpinionEx(QueryRtopCompanyOpinionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.opinion.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyOpinionResponse());
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息
     */
    public ListRtopCompanyOpinionsResponse listRtopCompanyOpinions(ListRtopCompanyOpinionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCompanyOpinionsEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业的舆情详情信息
     * Summary: 查询企业的舆情详情信息
     */
    public ListRtopCompanyOpinionsResponse listRtopCompanyOpinionsEx(ListRtopCompanyOpinionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.opinions.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCompanyOpinionsResponse());
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情
     */
    public GetRtopCompanyMonitorResponse getRtopCompanyMonitor(GetRtopCompanyMonitorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRtopCompanyMonitorEx(request, headers, runtime);
    }

    /**
     * Description: 查询监测企业的详情
     * Summary: 查询监测企业的详情
     */
    public GetRtopCompanyMonitorResponse getRtopCompanyMonitorEx(GetRtopCompanyMonitorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.monitor.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRtopCompanyMonitorResponse());
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息
     */
    public QueryRtopCrowdriskStatisticResponse queryRtopCrowdriskStatistic(QueryRtopCrowdriskStatisticRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskStatisticEx(request, headers, runtime);
    }

    /**
     * Description: 查询所在地的涉众风险企业统计信息
     * Summary: 查询所在地的涉众风险企业统计信息
     */
    public QueryRtopCrowdriskStatisticResponse queryRtopCrowdriskStatisticEx(QueryRtopCrowdriskStatisticRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.statistic.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskStatisticResponse());
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表
     */
    public ListRtopCrowdriskResponse listRtopCrowdrisk(ListRtopCrowdriskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCrowdriskEx(request, headers, runtime);
    }

    /**
     * Description: 查询涉众风险企业的列表
     * Summary: 查询涉众风险企业的列表
     */
    public ListRtopCrowdriskResponse listRtopCrowdriskEx(ListRtopCrowdriskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCrowdriskResponse());
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息
     */
    public QueryRtopCrowdriskDetailResponse queryRtopCrowdriskDetail(QueryRtopCrowdriskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskDetailEx(request, headers, runtime);
    }

    /**
     * Description: 查询涉众风险企业的详细信息
     * Summary: 查询涉众风险企业的详细信息
     */
    public QueryRtopCrowdriskDetailResponse queryRtopCrowdriskDetailEx(QueryRtopCrowdriskDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.detail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskDetailResponse());
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息
     */
    public QueryRtopRiskstormResponse queryRtopRiskstorm(QueryRtopRiskstormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRiskstormEx(request, headers, runtime);
    }

    /**
     * Description: 查询风报的详细信息
     * Summary: 查询风报的详细信息
     */
    public QueryRtopRiskstormResponse queryRtopRiskstormEx(QueryRtopRiskstormRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.riskstorm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRiskstormResponse());
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额
     */
    public QueryRtopCrowdriskSumResponse queryRtopCrowdriskSum(QueryRtopCrowdriskSumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCrowdriskSumEx(request, headers, runtime);
    }

    /**
     * Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
     * Summary: 监管涉众风险一批企业的影响人数影响金额
     */
    public QueryRtopCrowdriskSumResponse queryRtopCrowdriskSumEx(QueryRtopCrowdriskSumRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.crowdrisk.sum.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCrowdriskSumResponse());
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取
     */
    public GetRtopCompanyDetailResponse getRtopCompanyDetail(GetRtopCompanyDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRtopCompanyDetailEx(request, headers, runtime);
    }

    /**
     * Description: 监管企业详情获取，包括风险分数、风险标签。
     * Summary: 监管企业详情获取
     */
    public GetRtopCompanyDetailResponse getRtopCompanyDetailEx(GetRtopCompanyDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetRtopCompanyDetailResponse());
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口
     */
    public QueryRtopCompanyRiskinfoResponse queryRtopCompanyRiskinfo(QueryRtopCompanyRiskinfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskinfoEx(request, headers, runtime);
    }

    /**
     * Description: 企业风险查询接口
     * Summary: 企业风险查询接口
     */
    public QueryRtopCompanyRiskinfoResponse queryRtopCompanyRiskinfoEx(QueryRtopCompanyRiskinfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.riskinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskinfoResponse());
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口
     */
    public ExecRtopGenericInvokeResponse execRtopGenericInvoke(ExecRtopGenericInvokeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execRtopGenericInvokeEx(request, headers, runtime);
    }

    /**
     * Description: 公有云通用风险信息接口
     * Summary: 公有云通用风险信息接口
     */
    public ExecRtopGenericInvokeResponse execRtopGenericInvokeEx(ExecRtopGenericInvokeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.generic.invoke.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecRtopGenericInvokeResponse());
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token
     */
    public CreateRtopTokenResponse createRtopToken(CreateRtopTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRtopTokenEx(request, headers, runtime);
    }

    /**
     * Description: 公有云生成token
     * Summary: 公有云生成token
     */
    public CreateRtopTokenResponse createRtopTokenEx(CreateRtopTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.token.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateRtopTokenResponse());
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取
     */
    public QueryRtopRisklabelResponse queryRtopRisklabel(QueryRtopRisklabelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelEx(request, headers, runtime);
    }

    /**
     * Description: 标签全量信息获取
     * Summary: 标签全量信息获取
     */
    public QueryRtopRisklabelResponse queryRtopRisklabelEx(QueryRtopRisklabelRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelResponse());
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取
     */
    public QueryRtopCompanyResponse queryRtopCompany(QueryRtopCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyEx(request, headers, runtime);
    }

    /**
     * Description: 企业全量信息获取
     * Summary: 企业全量信息获取
     */
    public QueryRtopCompanyResponse queryRtopCompanyEx(QueryRtopCompanyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyResponse());
    }

    /**
     * Description: 标签配置全量信息获取
    rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取
     */
    public QueryRtopRisklabelFilterResponse queryRtopRisklabelFilter(QueryRtopRisklabelFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelFilterEx(request, headers, runtime);
    }

    /**
     * Description: 标签配置全量信息获取
    rtop_company_tag_filter_config
     * Summary: 标签配置全量信息获取
     */
    public QueryRtopRisklabelFilterResponse queryRtopRisklabelFilterEx(QueryRtopRisklabelFilterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.filter.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelFilterResponse());
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步
     */
    public PullRegtechNewsResponse pullRegtechNews(PullRegtechNewsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pullRegtechNewsEx(request, headers, runtime);
    }

    /**
     * Description: 用于鹰眼项目舆情同步
     * Summary: 鹰眼项目舆情同步
     */
    public PullRegtechNewsResponse pullRegtechNewsEx(PullRegtechNewsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.regtech.news.pull", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PullRegtechNewsResponse());
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈
     */
    public QueryRtopCompanyFeedbackResponse queryRtopCompanyFeedback(QueryRtopCompanyFeedbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyFeedbackEx(request, headers, runtime);
    }

    /**
     * Description: 查看企业反馈
     * Summary: 查看企业反馈
     */
    public QueryRtopCompanyFeedbackResponse queryRtopCompanyFeedbackEx(QueryRtopCompanyFeedbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.feedback.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyFeedbackResponse());
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询
     */
    public QueryRtopCompanyAlarmResponse queryRtopCompanyAlarm(QueryRtopCompanyAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyAlarmEx(request, headers, runtime);
    }

    /**
     * Description: 全局动态中的预警企业详细列表查询
     * Summary: 全局动态中的预警企业详细列表查询
     */
    public QueryRtopCompanyAlarmResponse queryRtopCompanyAlarmEx(QueryRtopCompanyAlarmRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.alarm.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyAlarmResponse());
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表
     */
    public QueryRtopCompanyRiskyResponse queryRtopCompanyRisky(QueryRtopCompanyRiskyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskyEx(request, headers, runtime);
    }

    /**
     * Description: 查询全局动态中的企业列表里的全部列表
     * Summary: 查询全局动态中的企业列表里的全部列表
     */
    public QueryRtopCompanyRiskyResponse queryRtopCompanyRiskyEx(QueryRtopCompanyRiskyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.risky.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskyResponse());
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表
     */
    public QueryRtopCompanyListResponse queryRtopCompanyList(QueryRtopCompanyListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyListEx(request, headers, runtime);
    }

    /**
     * Description: 查询企业列表
     * Summary: 查询企业列表
     */
    public QueryRtopCompanyListResponse queryRtopCompanyListEx(QueryRtopCompanyListRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.list.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyListResponse());
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取
     */
    public QueryRtopRisklabelConfigResponse queryRtopRisklabelConfig(QueryRtopRisklabelConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopRisklabelConfigEx(request, headers, runtime);
    }

    /**
     * Description: 标签配置全量信息获取
     * Summary: 标签配置全量信息获取
     */
    public QueryRtopRisklabelConfigResponse queryRtopRisklabelConfigEx(QueryRtopRisklabelConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.risklabel.config.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopRisklabelConfigResponse());
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询
     */
    public QueryRtopCompanyRiskResponse queryRtopCompanyRisk(QueryRtopCompanyRiskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopCompanyRiskEx(request, headers, runtime);
    }

    /**
     * Description: 企业风险标签信息查询
     * Summary: 企业风险标签信息查询
     */
    public QueryRtopCompanyRiskResponse queryRtopCompanyRiskEx(QueryRtopCompanyRiskRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.risk.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopCompanyRiskResponse());
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业
     */
    public ListRtopCompanyRelatedResponse listRtopCompanyRelated(ListRtopCompanyRelatedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopCompanyRelatedEx(request, headers, runtime);
    }

    /**
     * Description: 查看重点关联企业
     * Summary: 重点关联企业
     */
    public ListRtopCompanyRelatedResponse listRtopCompanyRelatedEx(ListRtopCompanyRelatedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.company.related.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopCompanyRelatedResponse());
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询
     */
    public QueryRtopTagImageResponse queryRtopTagImage(QueryRtopTagImageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRtopTagImageEx(request, headers, runtime);
    }

    /**
     * Description: 风险标签图片查询
     * Summary: 风险标签图片查询
     */
    public QueryRtopTagImageResponse queryRtopTagImageEx(QueryRtopTagImageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.tag.image.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRtopTagImageResponse());
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表
     */
    public ListRtopStarCompanyResponse listRtopStarCompany(ListRtopStarCompanyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRtopStarCompanyEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户收藏企业列表
     * Summary: 查询用户收藏企业列表
     */
    public ListRtopStarCompanyResponse listRtopStarCompanyEx(ListRtopStarCompanyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rtop.star.company.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListRtopStarCompanyResponse());
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas)
     */
    public QueryRpSecurityPolicyResponse queryRpSecurityPolicy(QueryRpSecurityPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRpSecurityPolicyEx(request, headers, runtime);
    }

    /**
     * Description: 策略咨询服务输出(saas)
     * Summary: 策略咨询服务输出(saas)
     */
    public QueryRpSecurityPolicyResponse queryRpSecurityPolicyEx(QueryRpSecurityPolicyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "riskplus.rp.security.policy.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRpSecurityPolicyResponse());
    }
}
