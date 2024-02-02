// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.saas;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.saas.models.*;
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
                    new TeaPair("sdk_version", "1.1.29"),
                    new TeaPair("_prod_code", "SAAS"),
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
     * Description: SaaS服务调用
     * Summary: SaaS服务调用
     */
    public RunMarketServiceResponse runMarketService(RunMarketServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runMarketServiceEx(request, headers, runtime);
    }

    /**
     * Description: SaaS服务调用
     * Summary: SaaS服务调用
     */
    public RunMarketServiceResponse runMarketServiceEx(RunMarketServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RunMarketServiceResponse());
    }

    /**
     * Description: 查询解决方案，包括能力列表
     * Summary: 查询解决方案，包括能力列表
     */
    public QueryMarketSolutionResponse queryMarketSolution(QueryMarketSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMarketSolutionEx(request, headers, runtime);
    }

    /**
     * Description: 查询解决方案，包括能力列表
     * Summary: 查询解决方案，包括能力列表
     */
    public QueryMarketSolutionResponse queryMarketSolutionEx(QueryMarketSolutionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.market.solution.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMarketSolutionResponse());
    }

    /**
     * Description: 查询本产品下所有的能力标签
     * Summary: 查询本产品下所有的能力标签
     */
    public QueryAbilityWithproductResponse queryAbilityWithproduct(QueryAbilityWithproductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbilityWithproductEx(request, headers, runtime);
    }

    /**
     * Description: 查询本产品下所有的能力标签
     * Summary: 查询本产品下所有的能力标签
     */
    public QueryAbilityWithproductResponse queryAbilityWithproductEx(QueryAbilityWithproductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.ability.withproduct.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbilityWithproductResponse());
    }

    /**
     * Description: 分页查询能力数据
     * Summary: 分页查询能力数据
     */
    public PagequeryAbilityResponse pagequeryAbility(PagequeryAbilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAbilityEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询能力数据
     * Summary: 分页查询能力数据
     */
    public PagequeryAbilityResponse pagequeryAbilityEx(PagequeryAbilityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.ability.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAbilityResponse());
    }

    /**
     * Description: 绑定API
     * Summary: 绑定能力与API关系
     */
    public BindAbilityResponse bindAbility(BindAbilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAbilityEx(request, headers, runtime);
    }

    /**
     * Description: 绑定API
     * Summary: 绑定能力与API关系
     */
    public BindAbilityResponse bindAbilityEx(BindAbilityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.ability.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAbilityResponse());
    }

    /**
     * Description: 根据api名称列表查询能力标签列表
     * Summary: 根据api名称列表查询能力标签列表
     */
    public QueryAbilityWithapinameResponse queryAbilityWithapiname(QueryAbilityWithapinameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbilityWithapinameEx(request, headers, runtime);
    }

    /**
     * Description: 根据api名称列表查询能力标签列表
     * Summary: 根据api名称列表查询能力标签列表
     */
    public QueryAbilityWithapinameResponse queryAbilityWithapinameEx(QueryAbilityWithapinameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.ability.withapiname.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbilityWithapinameResponse());
    }

    /**
     * Description: api上线回调接口
     * Summary: api上线回调接口
     */
    public CallbackAbilityResponse callbackAbility(CallbackAbilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackAbilityEx(request, headers, runtime);
    }

    /**
     * Description: api上线回调接口
     * Summary: api上线回调接口
     */
    public CallbackAbilityResponse callbackAbilityEx(CallbackAbilityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.ability.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackAbilityResponse());
    }

    /**
     * Description: 根据产品码+api code查询api protobuf信息
     * Summary: 查询api protobuf信息（勿删）
     */
    public QueryFoundationProtobufResponse queryFoundationProtobuf(QueryFoundationProtobufRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFoundationProtobufEx(request, headers, runtime);
    }

    /**
     * Description: 根据产品码+api code查询api protobuf信息
     * Summary: 查询api protobuf信息（勿删）
     */
    public QueryFoundationProtobufResponse queryFoundationProtobufEx(QueryFoundationProtobufRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.foundation.protobuf.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFoundationProtobufResponse());
    }

    /**
     * Description: 测试网关结果码和计量接口
     * Summary: 网关结果码测试接口
     */
    public QueryAbilityResultcodeResponse queryAbilityResultcode(QueryAbilityResultcodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbilityResultcodeEx(request, headers, runtime);
    }

    /**
     * Description: 测试网关结果码和计量接口
     * Summary: 网关结果码测试接口
     */
    public QueryAbilityResultcodeResponse queryAbilityResultcodeEx(QueryAbilityResultcodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.ability.resultcode.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbilityResultcodeResponse());
    }

    /**
     * Description: 绑定能力的api信息
     * Summary: 绑定能力的api信息
     */
    public BindAbilityApiResponse bindAbilityApi(BindAbilityApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindAbilityApiEx(request, headers, runtime);
    }

    /**
     * Description: 绑定能力的api信息
     * Summary: 绑定能力的api信息
     */
    public BindAbilityApiResponse bindAbilityApiEx(BindAbilityApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.ability.api.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindAbilityApiResponse());
    }

    /**
     * Description: 根据能力id查询能力信息
     * Summary: 根据能力id查询能力信息
     */
    public QueryAbilityBusinesscodeResponse queryAbilityBusinesscode(QueryAbilityBusinesscodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAbilityBusinesscodeEx(request, headers, runtime);
    }

    /**
     * Description: 根据能力id查询能力信息
     * Summary: 根据能力id查询能力信息
     */
    public QueryAbilityBusinesscodeResponse queryAbilityBusinesscodeEx(QueryAbilityBusinesscodeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.ability.businesscode.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAbilityBusinesscodeResponse());
    }

    /**
     * Description: 根据商业编码查询sdk依赖和api信息
     * Summary: 根据商业编码查询sdk依赖和api信息
     */
    public QueryBusinessProductResponse queryBusinessProduct(QueryBusinessProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBusinessProductEx(request, headers, runtime);
    }

    /**
     * Description: 根据商业编码查询sdk依赖和api信息
     * Summary: 根据商业编码查询sdk依赖和api信息
     */
    public QueryBusinessProductResponse queryBusinessProductEx(QueryBusinessProductRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.business.product.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBusinessProductResponse());
    }

    /**
     * Description: 查询计量规则信息
     * Summary: 查询计量规则信息
     */
    public QueryMeteringRuleResponse queryMeteringRule(QueryMeteringRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeteringRuleEx(request, headers, runtime);
    }

    /**
     * Description: 查询计量规则信息
     * Summary: 查询计量规则信息
     */
    public QueryMeteringRuleResponse queryMeteringRuleEx(QueryMeteringRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.metering.rule.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeteringRuleResponse());
    }

    /**
     * Description: 创建计量规则
     * Summary: 创建计量规则
     */
    public CreateMeteringRuleResponse createMeteringRule(CreateMeteringRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMeteringRuleEx(request, headers, runtime);
    }

    /**
     * Description: 创建计量规则
     * Summary: 创建计量规则
     */
    public CreateMeteringRuleResponse createMeteringRuleEx(CreateMeteringRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.metering.rule.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMeteringRuleResponse());
    }

    /**
     * Description: 更新计量规则信息
     * Summary: 更新计量规则信息
     */
    public UpdateMeteringRuleResponse updateMeteringRule(UpdateMeteringRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeteringRuleEx(request, headers, runtime);
    }

    /**
     * Description: 更新计量规则信息
     * Summary: 更新计量规则信息
     */
    public UpdateMeteringRuleResponse updateMeteringRuleEx(UpdateMeteringRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.metering.rule.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeteringRuleResponse());
    }

    /**
     * Description: 查询计量项信息
     * Summary: 查询计量项信息
     */
    public QueryMeteringItemResponse queryMeteringItem(QueryMeteringItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMeteringItemEx(request, headers, runtime);
    }

    /**
     * Description: 查询计量项信息
     * Summary: 查询计量项信息
     */
    public QueryMeteringItemResponse queryMeteringItemEx(QueryMeteringItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.metering.item.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMeteringItemResponse());
    }

    /**
     * Description: 新增计量项
     * Summary: 新增计量项
     */
    public CreateMeteringItemResponse createMeteringItem(CreateMeteringItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMeteringItemEx(request, headers, runtime);
    }

    /**
     * Description: 新增计量项
     * Summary: 新增计量项
     */
    public CreateMeteringItemResponse createMeteringItemEx(CreateMeteringItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.metering.item.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateMeteringItemResponse());
    }

    /**
     * Description: 更新计量规则
     * Summary: 更新计量规则
     */
    public UpdateMeteringItemResponse updateMeteringItem(UpdateMeteringItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMeteringItemEx(request, headers, runtime);
    }

    /**
     * Description: 更新计量规则
     * Summary: 更新计量规则
     */
    public UpdateMeteringItemResponse updateMeteringItemEx(UpdateMeteringItemRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.saas.metering.item.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateMeteringItemResponse());
    }
}
