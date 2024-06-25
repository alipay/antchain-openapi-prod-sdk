// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.stlr;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.stlr.models.*;

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
                    new TeaPair("sdk_version", "2.9.2"),
                    new TeaPair("_prod_code", "STLR"),
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
     * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
     * Summary: 查询当前活动资料信息
     */
    public DescribeAcarActivityResponse describeAcarActivity(DescribeAcarActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarActivityEx(request, headers, runtime);
    }

    /**
     * Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
     * Summary: 查询当前活动资料信息
     */
    public DescribeAcarActivityResponse describeAcarActivityEx(DescribeAcarActivityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.activity.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarActivityResponse());
    }

    /**
     * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
     * Summary: 查询当前活动的每日碳排放量
     */
    public DescribeAcarDailyemissionsResponse describeAcarDailyemissions(DescribeAcarDailyemissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarDailyemissionsEx(request, headers, runtime);
    }

    /**
     * Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
     * Summary: 查询当前活动的每日碳排放量
     */
    public DescribeAcarDailyemissionsResponse describeAcarDailyemissionsEx(DescribeAcarDailyemissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.dailyemissions.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarDailyemissionsResponse());
    }

    /**
     * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
     * Summary: 查询当前活动各范围的碳排放量
     */
    public DescribeAcarScopemissionResponse describeAcarScopemission(DescribeAcarScopemissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarScopemissionEx(request, headers, runtime);
    }

    /**
     * Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
     * Summary: 查询当前活动各范围的碳排放量
     */
    public DescribeAcarScopemissionResponse describeAcarScopemissionEx(DescribeAcarScopemissionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.scopemission.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarScopemissionResponse());
    }

    /**
     * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
     * Summary: 获取减排情况
     */
    public DescribeAcarReductionemissionsResponse describeAcarReductionemissions(DescribeAcarReductionemissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarReductionemissionsEx(request, headers, runtime);
    }

    /**
     * Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
     * Summary: 获取减排情况
     */
    public DescribeAcarReductionemissionsResponse describeAcarReductionemissionsEx(DescribeAcarReductionemissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.reductionemissions.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarReductionemissionsResponse());
    }

    /**
     * Description: 查询最近排放数据，返回最近排放数据信息
     * Summary: 查询最近排放数据
     */
    public DescribeAcarLastemissiondataResponse describeAcarLastemissiondata(DescribeAcarLastemissiondataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeAcarLastemissiondataEx(request, headers, runtime);
    }

    /**
     * Description: 查询最近排放数据，返回最近排放数据信息
     * Summary: 查询最近排放数据
     */
    public DescribeAcarLastemissiondataResponse describeAcarLastemissiondataEx(DescribeAcarLastemissiondataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.acar.lastemissiondata.describe", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DescribeAcarLastemissiondataResponse());
    }

    /**
     * Description: 碳总量查询
     * Summary: 碳总量查询
     */
    public QueryEmissionTotalResponse queryEmissionTotal(QueryEmissionTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEmissionTotalEx(request, headers, runtime);
    }

    /**
     * Description: 碳总量查询
     * Summary: 碳总量查询
     */
    public QueryEmissionTotalResponse queryEmissionTotalEx(QueryEmissionTotalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.emission.total.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEmissionTotalResponse());
    }

    /**
     * Description: 碳排放总量分类统计
     * Summary: 碳排放总量分类统计
     */
    public QueryEmissionGroupbycategoryResponse queryEmissionGroupbycategory(QueryEmissionGroupbycategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEmissionGroupbycategoryEx(request, headers, runtime);
    }

    /**
     * Description: 碳排放总量分类统计
     * Summary: 碳排放总量分类统计
     */
    public QueryEmissionGroupbycategoryResponse queryEmissionGroupbycategoryEx(QueryEmissionGroupbycategoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.emission.groupbycategory.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEmissionGroupbycategoryResponse());
    }

    /**
     * Description: 碳排放总量分单元统计
     * Summary: 碳排放总量分单元统计
     */
    public QueryEmissionGroupbylocationResponse queryEmissionGroupbylocation(QueryEmissionGroupbylocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEmissionGroupbylocationEx(request, headers, runtime);
    }

    /**
     * Description: 碳排放总量分单元统计
     * Summary: 碳排放总量分单元统计
     */
    public QueryEmissionGroupbylocationResponse queryEmissionGroupbylocationEx(QueryEmissionGroupbylocationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.emission.groupbylocation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEmissionGroupbylocationResponse());
    }

    /**
     * Description: 碳排放总量分城市统计
     * Summary: 碳排放总量分城市统计
     */
    public QueryEmissionGroupbycityResponse queryEmissionGroupbycity(QueryEmissionGroupbycityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEmissionGroupbycityEx(request, headers, runtime);
    }

    /**
     * Description: 碳排放总量分城市统计
     * Summary: 碳排放总量分城市统计
     */
    public QueryEmissionGroupbycityResponse queryEmissionGroupbycityEx(QueryEmissionGroupbycityRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.emission.groupbycity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEmissionGroupbycityResponse());
    }

    /**
     * Description: 减排统计查询
     * Summary: 减排统计查询
     */
    public QueryEmissionReductionResponse queryEmissionReduction(QueryEmissionReductionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEmissionReductionEx(request, headers, runtime);
    }

    /**
     * Description: 减排统计查询
     * Summary: 减排统计查询
     */
    public QueryEmissionReductionResponse queryEmissionReductionEx(QueryEmissionReductionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.emission.reduction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEmissionReductionResponse());
    }

    /**
     * Description: 碳抵消量统计
     * Summary: 碳抵消量统计
     */
    public QueryEmissionCounteractionResponse queryEmissionCounteraction(QueryEmissionCounteractionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEmissionCounteractionEx(request, headers, runtime);
    }

    /**
     * Description: 碳抵消量统计
     * Summary: 碳抵消量统计
     */
    public QueryEmissionCounteractionResponse queryEmissionCounteractionEx(QueryEmissionCounteractionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.emission.counteraction.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEmissionCounteractionResponse());
    }

    /**
     * Description: 账户开通接口。开通协作平台和链上账户
     * Summary: 账户开通接口
     */
    public RegisterPdcpAccountResponse registerPdcpAccount(RegisterPdcpAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerPdcpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 账户开通接口。开通协作平台和链上账户
     * Summary: 账户开通接口
     */
    public RegisterPdcpAccountResponse registerPdcpAccountEx(RegisterPdcpAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.account.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterPdcpAccountResponse());
    }

    /**
     * Description: 存证接口
     * Summary: 存证接口
     */
    public PushPdcpBlockchainResponse pushPdcpBlockchain(PushPdcpBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushPdcpBlockchainEx(request, headers, runtime);
    }

    /**
     * Description: 存证接口
     * Summary: 存证接口
     */
    public PushPdcpBlockchainResponse pushPdcpBlockchainEx(PushPdcpBlockchainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushPdcpBlockchainResponse());
    }

    /**
     * Description: 异步存证接口
     * Summary: 异步存证接口
     */
    public UploadPdcpBlockchainResponse uploadPdcpBlockchain(UploadPdcpBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadPdcpBlockchainEx(request, headers, runtime);
    }

    /**
     * Description: 异步存证接口
     * Summary: 异步存证接口
     */
    public UploadPdcpBlockchainResponse uploadPdcpBlockchainEx(UploadPdcpBlockchainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadPdcpBlockchainResponse());
    }

    /**
     * Description: 查询异步存证结果
     * Summary: 查询异步存证结果
     */
    public GetPdcpBlockchainResponse getPdcpBlockchain(GetPdcpBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPdcpBlockchainEx(request, headers, runtime);
    }

    /**
     * Description: 查询异步存证结果
     * Summary: 查询异步存证结果
     */
    public GetPdcpBlockchainResponse getPdcpBlockchainEx(GetPdcpBlockchainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.blockchain.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPdcpBlockchainResponse());
    }

    /**
     * Description: 链上账户查询接口
     * Summary: 链上账户查询接口
     */
    public QueryPdcpAccountResponse queryPdcpAccount(QueryPdcpAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdcpAccountEx(request, headers, runtime);
    }

    /**
     * Description: 链上账户查询接口
     * Summary: 链上账户查询接口
     */
    public QueryPdcpAccountResponse queryPdcpAccountEx(QueryPdcpAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdcpAccountResponse());
    }

    /**
     * Description: 新增授权接口
     * Summary: 新增授权接口
     */
    public AddPdcpAuthResponse addPdcpAuth(AddPdcpAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addPdcpAuthEx(request, headers, runtime);
    }

    /**
     * Description: 新增授权接口
     * Summary: 新增授权接口
     */
    public AddPdcpAuthResponse addPdcpAuthEx(AddPdcpAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.auth.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddPdcpAuthResponse());
    }

    /**
     * Description: 授权取消、授权审批接口
     * Summary: 授权接口变更
     */
    public UpdatePdcpAuthResponse updatePdcpAuth(UpdatePdcpAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePdcpAuthEx(request, headers, runtime);
    }

    /**
     * Description: 授权取消、授权审批接口
     * Summary: 授权接口变更
     */
    public UpdatePdcpAuthResponse updatePdcpAuthEx(UpdatePdcpAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.auth.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdatePdcpAuthResponse());
    }

    /**
     * Description: 路由账户查询接口
     * Summary: 路由账户查询接口
     */
    public QueryGatewayAccountResponse queryGatewayAccount(QueryGatewayAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryGatewayAccountEx(request, headers, runtime);
    }

    /**
     * Description: 路由账户查询接口
     * Summary: 路由账户查询接口
     */
    public QueryGatewayAccountResponse queryGatewayAccountEx(QueryGatewayAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.gateway.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryGatewayAccountResponse());
    }

    /**
     * Description: 授权记录查询
     * Summary: 授权记录查询
     */
    public QueryPdcpAuthResponse queryPdcpAuth(QueryPdcpAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdcpAuthEx(request, headers, runtime);
    }

    /**
     * Description: 授权记录查询
     * Summary: 授权记录查询
     */
    public QueryPdcpAuthResponse queryPdcpAuthEx(QueryPdcpAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.auth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdcpAuthResponse());
    }

    /**
     * Description: 授权数据查询
     * Summary: 授权数据查询
     */
    public QueryPdcpDataResponse queryPdcpData(QueryPdcpDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdcpDataEx(request, headers, runtime);
    }

    /**
     * Description: 授权数据查询
     * Summary: 授权数据查询
     */
    public QueryPdcpDataResponse queryPdcpDataEx(QueryPdcpDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.data.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdcpDataResponse());
    }

    /**
     * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
     * Summary: 查询存证数据详情
     */
    public DetailPdcpDepositResponse detailPdcpDeposit(DetailPdcpDepositRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailPdcpDepositEx(request, headers, runtime);
    }

    /**
     * Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
     * Summary: 查询存证数据详情
     */
    public DetailPdcpDepositResponse detailPdcpDepositEx(DetailPdcpDepositRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.deposit.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailPdcpDepositResponse());
    }

    /**
     * Description: 查询存证数据历史变更
     * Summary: 存证数据变更历史追溯查询
     */
    public QueryPdcpDtraceResponse queryPdcpDtrace(QueryPdcpDtraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdcpDtraceEx(request, headers, runtime);
    }

    /**
     * Description: 查询存证数据历史变更
     * Summary: 存证数据变更历史追溯查询
     */
    public QueryPdcpDtraceResponse queryPdcpDtraceEx(QueryPdcpDtraceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.dtrace.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdcpDtraceResponse());
    }

    /**
     * Description: 通过链山存证内容校验存证数据可信性
     * Summary: 存证数据可信校验
     */
    public CheckPdcpDtraceResponse checkPdcpDtrace(CheckPdcpDtraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPdcpDtraceEx(request, headers, runtime);
    }

    /**
     * Description: 通过链山存证内容校验存证数据可信性
     * Summary: 存证数据可信校验
     */
    public CheckPdcpDtraceResponse checkPdcpDtraceEx(CheckPdcpDtraceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.dtrace.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckPdcpDtraceResponse());
    }

    /**
     * Description: 根据授权方和被授权方授权关系批量查询授权数据
     * Summary: 批量查询授权数据
     */
    public BatchqueryPdcpDataResponse batchqueryPdcpData(BatchqueryPdcpDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchqueryPdcpDataEx(request, headers, runtime);
    }

    /**
     * Description: 根据授权方和被授权方授权关系批量查询授权数据
     * Summary: 批量查询授权数据
     */
    public BatchqueryPdcpDataResponse batchqueryPdcpDataEx(BatchqueryPdcpDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.data.batchquery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchqueryPdcpDataResponse());
    }

    /**
     * Description: 查询用户拥有的数据记录
     * Summary: 查询拥有的数据
     */
    public QueryPdcpOwndataResponse queryPdcpOwndata(QueryPdcpOwndataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdcpOwndataEx(request, headers, runtime);
    }

    /**
     * Description: 查询用户拥有的数据记录
     * Summary: 查询拥有的数据
     */
    public QueryPdcpOwndataResponse queryPdcpOwndataEx(QueryPdcpOwndataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.owndata.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdcpOwndataResponse());
    }

    /**
     * Description: 分页查询数据资产
     * Summary: 数据资产
     */
    public QueryPdcpDataassetResponse queryPdcpDataasset(QueryPdcpDataassetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPdcpDataassetEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询数据资产
     * Summary: 数据资产
     */
    public QueryPdcpDataassetResponse queryPdcpDataassetEx(QueryPdcpDataassetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.dataasset.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPdcpDataassetResponse());
    }

    /**
     * Description: 注册数据资产
     * Summary: 注册数据资产
     */
    public RegisterPdcpDataassetResponse registerPdcpDataasset(RegisterPdcpDataassetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerPdcpDataassetEx(request, headers, runtime);
    }

    /**
     * Description: 注册数据资产
     * Summary: 注册数据资产
     */
    public RegisterPdcpDataassetResponse registerPdcpDataassetEx(RegisterPdcpDataassetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.pdcp.dataasset.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterPdcpDataassetResponse());
    }

    /**
     * Description: 添加数据授权策略
     * Summary: 添加数据授权策略
     */
    public AddAuthAdminResponse addAuthAdmin(AddAuthAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAuthAdminEx(request, headers, runtime);
    }

    /**
     * Description: 添加数据授权策略
     * Summary: 添加数据授权策略
     */
    public AddAuthAdminResponse addAuthAdminEx(AddAuthAdminRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.auth.admin.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddAuthAdminResponse());
    }

    /**
     * Description: 分页查询数据授权策略
     * Summary: 分页查询数据授权策略
     */
    public PagequeryAuthAdminResponse pagequeryAuthAdmin(PagequeryAuthAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryAuthAdminEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询数据授权策略
     * Summary: 分页查询数据授权策略
     */
    public PagequeryAuthAdminResponse pagequeryAuthAdminEx(PagequeryAuthAdminRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.auth.admin.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryAuthAdminResponse());
    }

    /**
     * Description: 查询数据授权策略
     * Summary: 查询数据授权策略
     */
    public QueryAuthAdminResponse queryAuthAdmin(QueryAuthAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAuthAdminEx(request, headers, runtime);
    }

    /**
     * Description: 查询数据授权策略
     * Summary: 查询数据授权策略
     */
    public QueryAuthAdminResponse queryAuthAdminEx(QueryAuthAdminRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.auth.admin.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAuthAdminResponse());
    }

    /**
     * Description: 数据资产添加数据类型
     * Summary: 添加数据类型
     */
    public AddDataassetTypeResponse addDataassetType(AddDataassetTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addDataassetTypeEx(request, headers, runtime);
    }

    /**
     * Description: 数据资产添加数据类型
     * Summary: 添加数据类型
     */
    public AddDataassetTypeResponse addDataassetTypeEx(AddDataassetTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.dataasset.type.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddDataassetTypeResponse());
    }

    /**
     * Description: 分页查询数据资产类型
     * Summary: 分页查询数据资产类型
     */
    public PagequeryDataassetTypeResponse pagequeryDataassetType(PagequeryDataassetTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pagequeryDataassetTypeEx(request, headers, runtime);
    }

    /**
     * Description: 分页查询数据资产类型
     * Summary: 分页查询数据资产类型
     */
    public PagequeryDataassetTypeResponse pagequeryDataassetTypeEx(PagequeryDataassetTypeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.dataasset.type.pagequery", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PagequeryDataassetTypeResponse());
    }

    /**
     * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
     * Summary: 开始采集外部数据
     */
    public StartDatasetCollectingResponse startDatasetCollecting(StartDatasetCollectingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startDatasetCollectingEx(request, headers, runtime);
    }

    /**
     * Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
     * Summary: 开始采集外部数据
     */
    public StartDatasetCollectingResponse startDatasetCollectingEx(StartDatasetCollectingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.dataset.collecting.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartDatasetCollectingResponse());
    }

    /**
     * Description: 查询外部数据采集状态
     * Summary: 查询外部数据采集状态
     */
    public QueryDatasetCollectingResponse queryDatasetCollecting(QueryDatasetCollectingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDatasetCollectingEx(request, headers, runtime);
    }

    /**
     * Description: 查询外部数据采集状态
     * Summary: 查询外部数据采集状态
     */
    public QueryDatasetCollectingResponse queryDatasetCollectingEx(QueryDatasetCollectingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.dataset.collecting.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDatasetCollectingResponse());
    }

    /**
     * Description: 新增排放活动数据
     * Summary: 新增排放活动数据
     */
    public AddEcarAvitivedataResponse addEcarAvitivedata(AddEcarAvitivedataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEcarAvitivedataEx(request, headers, runtime);
    }

    /**
     * Description: 新增排放活动数据
     * Summary: 新增排放活动数据
     */
    public AddEcarAvitivedataResponse addEcarAvitivedataEx(AddEcarAvitivedataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddEcarAvitivedataResponse());
    }

    /**
     * Description: 查询排放活动数据详情
     * Summary: 查询排放活动数据详情
     */
    public DetailEcarAvitivedataResponse detailEcarAvitivedata(DetailEcarAvitivedataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailEcarAvitivedataEx(request, headers, runtime);
    }

    /**
     * Description: 查询排放活动数据详情
     * Summary: 查询排放活动数据详情
     */
    public DetailEcarAvitivedataResponse detailEcarAvitivedataEx(DetailEcarAvitivedataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailEcarAvitivedataResponse());
    }

    /**
     * Description: 排放活动数据统计计算
     * Summary: 排放活动数据统计计算
     */
    public CountEcarActivedataResponse countEcarActivedata(CountEcarActivedataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countEcarActivedataEx(request, headers, runtime);
    }

    /**
     * Description: 排放活动数据统计计算
     * Summary: 排放活动数据统计计算
     */
    public CountEcarActivedataResponse countEcarActivedataEx(CountEcarActivedataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.activedata.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountEcarActivedataResponse());
    }

    /**
     * Description: 文件上传接口
     * Summary: 文件上传接口
     */
    public UploadEcarFileResponse uploadEcarFile(UploadEcarFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadEcarFileEx(request, headers, runtime);
    }

    /**
     * Description: 文件上传接口
     * Summary: 文件上传接口
     */
    public UploadEcarFileResponse uploadEcarFileEx(UploadEcarFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.carbon.ecar.file.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadEcarFileResponse uploadEcarFileResponse = UploadEcarFileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadEcarFileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadEcarFileResponse());
    }

    /**
     * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
     * Summary: 录入绿色行为数据
     */
    public AddEcarGreenoperationResponse addEcarGreenoperation(AddEcarGreenoperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEcarGreenoperationEx(request, headers, runtime);
    }

    /**
     * Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
     * Summary: 录入绿色行为数据
     */
    public AddEcarGreenoperationResponse addEcarGreenoperationEx(AddEcarGreenoperationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddEcarGreenoperationResponse());
    }

    /**
     * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
     * Summary: 统计绿色行为数据
     */
    public CountEcarGreenoperationResponse countEcarGreenoperation(CountEcarGreenoperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.countEcarGreenoperationEx(request, headers, runtime);
    }

    /**
     * Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
     * Summary: 统计绿色行为数据
     */
    public CountEcarGreenoperationResponse countEcarGreenoperationEx(CountEcarGreenoperationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.count", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CountEcarGreenoperationResponse());
    }

    /**
     * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
     * Summary: 查询最近的绿色行为数据
     */
    public ListEcarGreenoperationResponse listEcarGreenoperation(ListEcarGreenoperationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcarGreenoperationEx(request, headers, runtime);
    }

    /**
     * Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
     * Summary: 查询最近的绿色行为数据
     */
    public ListEcarGreenoperationResponse listEcarGreenoperationEx(ListEcarGreenoperationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.greenoperation.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListEcarGreenoperationResponse());
    }

    /**
     * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
     * Summary: 预览本年度排放统计
     */
    public PreviewEcarAvitivedataResponse previewEcarAvitivedata(PreviewEcarAvitivedataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewEcarAvitivedataEx(request, headers, runtime);
    }

    /**
     * Description: 按年度统计排放数据，用于一般的总的预览页展示数据
     * Summary: 预览本年度排放统计
     */
    public PreviewEcarAvitivedataResponse previewEcarAvitivedataEx(PreviewEcarAvitivedataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.avitivedata.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewEcarAvitivedataResponse());
    }

    /**
     * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
     * Summary: 机构会员注册
     */
    public RegisterEcarEnterprisememberResponse registerEcarEnterprisemember(RegisterEcarEnterprisememberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerEcarEnterprisememberEx(request, headers, runtime);
    }

    /**
     * Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
     * Summary: 机构会员注册
     */
    public RegisterEcarEnterprisememberResponse registerEcarEnterprisememberEx(RegisterEcarEnterprisememberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.enterprisemember.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterEcarEnterprisememberResponse());
    }

    /**
     * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
     * Summary: 碳补偿数据采集
     */
    public AddEcarOffsetacquisitionResponse addEcarOffsetacquisition(AddEcarOffsetacquisitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEcarOffsetacquisitionEx(request, headers, runtime);
    }

    /**
     * Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
     * Summary: 碳补偿数据采集
     */
    public AddEcarOffsetacquisitionResponse addEcarOffsetacquisitionEx(AddEcarOffsetacquisitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.offsetacquisition.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddEcarOffsetacquisitionResponse());
    }

    /**
     * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
     * Summary: 碳普惠减碳量转移
     */
    public AddEcarOffsettranslateResponse addEcarOffsettranslate(AddEcarOffsettranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addEcarOffsettranslateEx(request, headers, runtime);
    }

    /**
     * Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
     * Summary: 碳普惠减碳量转移
     */
    public AddEcarOffsettranslateResponse addEcarOffsettranslateEx(AddEcarOffsettranslateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.offsettranslate.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddEcarOffsettranslateResponse());
    }

    /**
     * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
     * Summary: 碳普惠数据授权
     */
    public AuthEcarOffsetdatumResponse authEcarOffsetdatum(AuthEcarOffsetdatumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authEcarOffsetdatumEx(request, headers, runtime);
    }

    /**
     * Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
     * Summary: 碳普惠数据授权
     */
    public AuthEcarOffsetdatumResponse authEcarOffsetdatumEx(AuthEcarOffsetdatumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.offsetdatum.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthEcarOffsetdatumResponse());
    }

    /**
     * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
     * Summary: 碳普惠数据列表查询
     */
    public ListEcarOffsetdatumResponse listEcarOffsetdatum(ListEcarOffsetdatumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcarOffsetdatumEx(request, headers, runtime);
    }

    /**
     * Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
     * Summary: 碳普惠数据列表查询
     */
    public ListEcarOffsetdatumResponse listEcarOffsetdatumEx(ListEcarOffsetdatumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.offsetdatum.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListEcarOffsetdatumResponse());
    }

    /**
     * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
     * Summary: 机构会员列表查询
     */
    public ListEcarEnterprisememberResponse listEcarEnterprisemember(ListEcarEnterprisememberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEcarEnterprisememberEx(request, headers, runtime);
    }

    /**
     * Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
     * Summary: 机构会员列表查询
     */
    public ListEcarEnterprisememberResponse listEcarEnterprisememberEx(ListEcarEnterprisememberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.enterprisemember.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListEcarEnterprisememberResponse());
    }

    /**
     * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
     * Summary: 碳普惠项目数据预览
     */
    public PreviewEcarOffsetdatumResponse previewEcarOffsetdatum(PreviewEcarOffsetdatumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewEcarOffsetdatumEx(request, headers, runtime);
    }

    /**
     * Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
     * Summary: 碳普惠项目数据预览
     */
    public PreviewEcarOffsetdatumResponse previewEcarOffsetdatumEx(PreviewEcarOffsetdatumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.offsetdatum.preview", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreviewEcarOffsetdatumResponse());
    }

    /**
     * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
     * Summary: 单个机构会员信息查询
     */
    public DetailEcarEnterprisememberResponse detailEcarEnterprisemember(DetailEcarEnterprisememberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailEcarEnterprisememberEx(request, headers, runtime);
    }

    /**
     * Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
     * Summary: 单个机构会员信息查询
     */
    public DetailEcarEnterprisememberResponse detailEcarEnterprisememberEx(DetailEcarEnterprisememberRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.enterprisemember.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailEcarEnterprisememberResponse());
    }

    /**
     * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
     * Summary: 碳补偿项目账户查询
     */
    public QueryEcarOffsetaccountResponse queryEcarOffsetaccount(QueryEcarOffsetaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEcarOffsetaccountEx(request, headers, runtime);
    }

    /**
     * Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
     * Summary: 碳补偿项目账户查询
     */
    public QueryEcarOffsetaccountResponse queryEcarOffsetaccountEx(QueryEcarOffsetaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.offsetaccount.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEcarOffsetaccountResponse());
    }

    /**
     * Description: 查询碳补偿数据详情
     * Summary: 碳补偿数据详情
     */
    public DetailEcarOffsetdatumResponse detailEcarOffsetdatum(DetailEcarOffsetdatumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailEcarOffsetdatumEx(request, headers, runtime);
    }

    /**
     * Description: 查询碳补偿数据详情
     * Summary: 碳补偿数据详情
     */
    public DetailEcarOffsetdatumResponse detailEcarOffsetdatumEx(DetailEcarOffsetdatumRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.offsetdatum.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailEcarOffsetdatumResponse());
    }

    /**
     * Description: 查询碳普惠减碳量转移记录详情
     * Summary: 碳普惠减碳量转移记录详情
     */
    public DetailEcarOffsettranslateResponse detailEcarOffsettranslate(DetailEcarOffsettranslateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailEcarOffsettranslateEx(request, headers, runtime);
    }

    /**
     * Description: 查询碳普惠减碳量转移记录详情
     * Summary: 碳普惠减碳量转移记录详情
     */
    public DetailEcarOffsettranslateResponse detailEcarOffsettranslateEx(DetailEcarOffsettranslateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.offsettranslate.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailEcarOffsettranslateResponse());
    }

    /**
     * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
     * Summary: 平台方LCA评估结果提交
     */
    public SubmitEcarLcaassementResponse submitEcarLcaassement(SubmitEcarLcaassementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitEcarLcaassementEx(request, headers, runtime);
    }

    /**
     * Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
     * Summary: 平台方LCA评估结果提交
     */
    public SubmitEcarLcaassementResponse submitEcarLcaassementEx(SubmitEcarLcaassementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.lcaassement.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitEcarLcaassementResponse());
    }

    /**
     * Description: 三方平台文件上传
     * Summary: 三方平台文件上传
     */
    public UploadEcarPlaformfileResponse uploadEcarPlaformfile(UploadEcarPlaformfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadEcarPlaformfileEx(request, headers, runtime);
    }

    /**
     * Description: 三方平台文件上传
     * Summary: 三方平台文件上传
     */
    public UploadEcarPlaformfileResponse uploadEcarPlaformfileEx(UploadEcarPlaformfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.carbon.ecar.plaformfile.upload"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                UploadEcarPlaformfileResponse uploadEcarPlaformfileResponse = UploadEcarPlaformfileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return uploadEcarPlaformfileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.plaformfile.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadEcarPlaformfileResponse());
    }

    /**
     * Description: 三方平台提交LCA订单，同时包括客户入驻信息
     * Summary: LCA订单提交(含客户入驻信息)
     */
    public SubmitEcarLcaorderwithcustomerResponse submitEcarLcaorderwithcustomer(SubmitEcarLcaorderwithcustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitEcarLcaorderwithcustomerEx(request, headers, runtime);
    }

    /**
     * Description: 三方平台提交LCA订单，同时包括客户入驻信息
     * Summary: LCA订单提交(含客户入驻信息)
     */
    public SubmitEcarLcaorderwithcustomerResponse submitEcarLcaorderwithcustomerEx(SubmitEcarLcaorderwithcustomerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.lcaorderwithcustomer.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitEcarLcaorderwithcustomerResponse());
    }

    /**
     * Description: 三方平台信登token获取
     * Summary: 三方平台获取信登token
     */
    public GetEcarPlaformauthtokenResponse getEcarPlaformauthtoken(GetEcarPlaformauthtokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEcarPlaformauthtokenEx(request, headers, runtime);
    }

    /**
     * Description: 三方平台信登token获取
     * Summary: 三方平台获取信登token
     */
    public GetEcarPlaformauthtokenResponse getEcarPlaformauthtokenEx(GetEcarPlaformauthtokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.plaformauthtoken.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetEcarPlaformauthtokenResponse());
    }

    /**
     * Description: LCA订单查询
     * Summary: LCA订单查询
     */
    public QueryEcarLcaorderResponse queryEcarLcaorder(QueryEcarLcaorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEcarLcaorderEx(request, headers, runtime);
    }

    /**
     * Description: LCA订单查询
     * Summary: LCA订单查询
     */
    public QueryEcarLcaorderResponse queryEcarLcaorderEx(QueryEcarLcaorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.lcaorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEcarLcaorderResponse());
    }

    /**
     * Description: 绿证发电量数据上报接口
     * Summary: 绿证发电量数据上报接口
     */
    public BatchcreateEcarGreencertificategenerationResponse batchcreateEcarGreencertificategeneration(BatchcreateEcarGreencertificategenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchcreateEcarGreencertificategenerationEx(request, headers, runtime);
    }

    /**
     * Description: 绿证发电量数据上报接口
     * Summary: 绿证发电量数据上报接口
     */
    public BatchcreateEcarGreencertificategenerationResponse batchcreateEcarGreencertificategenerationEx(BatchcreateEcarGreencertificategenerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.greencertificategeneration.batchcreate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BatchcreateEcarGreencertificategenerationResponse());
    }

    /**
     * Description: 产品碳足迹速算请求提交
     * Summary: 产品碳足迹速算请求提交
     */
    public SubmitEcarLcacalcResponse submitEcarLcacalc(SubmitEcarLcacalcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitEcarLcacalcEx(request, headers, runtime);
    }

    /**
     * Description: 产品碳足迹速算请求提交
     * Summary: 产品碳足迹速算请求提交
     */
    public SubmitEcarLcacalcResponse submitEcarLcacalcEx(SubmitEcarLcacalcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.lcacalc.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitEcarLcacalcResponse());
    }

    /**
     * Description: 产品碳足迹速算结果查询
     * Summary: 产品碳足迹速算结果查询
     */
    public QueryEcarLcacalcResponse queryEcarLcacalc(QueryEcarLcacalcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEcarLcacalcEx(request, headers, runtime);
    }

    /**
     * Description: 产品碳足迹速算结果查询
     * Summary: 产品碳足迹速算结果查询
     */
    public QueryEcarLcacalcResponse queryEcarLcacalcEx(QueryEcarLcacalcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.lcacalc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEcarLcacalcResponse());
    }

    /**
     * Description: 发电数据文件导入开放接口
     * Summary: 发电数据文件导入开放接口
     */
    public SubmitEcarGreencertificategenerationfileResponse submitEcarGreencertificategenerationfile(SubmitEcarGreencertificategenerationfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitEcarGreencertificategenerationfileEx(request, headers, runtime);
    }

    /**
     * Description: 发电数据文件导入开放接口
     * Summary: 发电数据文件导入开放接口
     */
    public SubmitEcarGreencertificategenerationfileResponse submitEcarGreencertificategenerationfileEx(SubmitEcarGreencertificategenerationfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        if (!com.aliyun.teautil.Common.isUnset(request.fileObject)) {
            CreateAntcloudGatewayxFileUploadRequest uploadReq = CreateAntcloudGatewayxFileUploadRequest.build(TeaConverter.buildMap(
                new TeaPair("authToken", request.authToken),
                new TeaPair("apiCode", "antchain.carbon.ecar.greencertificategenerationfile.submit"),
                new TeaPair("fileName", request.fileObjectName)
            ));
            CreateAntcloudGatewayxFileUploadResponse uploadResp = this.createAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
            if (!com.antgroup.antchain.openapi.antchain.util.AntchainUtils.isSuccess(uploadResp.resultCode, "ok")) {
                SubmitEcarGreencertificategenerationfileResponse submitEcarGreencertificategenerationfileResponse = SubmitEcarGreencertificategenerationfileResponse.build(TeaConverter.buildMap(
                    new TeaPair("reqMsgId", uploadResp.reqMsgId),
                    new TeaPair("resultCode", uploadResp.resultCode),
                    new TeaPair("resultMsg", uploadResp.resultMsg)
                ));
                return submitEcarGreencertificategenerationfileResponse;
            }

            java.util.Map<String, String> uploadHeaders = com.antgroup.antchain.openapi.antchain.util.AntchainUtils.parseUploadHeaders(uploadResp.uploadHeaders);
            com.antgroup.antchain.openapi.antchain.util.AntchainUtils.putObject(request.fileObject, uploadHeaders, uploadResp.uploadUrl);
            request.fileId = uploadResp.fileId;
        }

        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.ecar.greencertificategenerationfile.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitEcarGreencertificategenerationfileResponse());
    }

    /**
     * Description: 三方平台调用此接口，查询用户的证书信息
     * Summary: 证书查询
     */
    public QueryThirdCertResponse queryThirdCert(QueryThirdCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryThirdCertEx(request, headers, runtime);
    }

    /**
     * Description: 三方平台调用此接口，查询用户的证书信息
     * Summary: 证书查询
     */
    public QueryThirdCertResponse queryThirdCertEx(QueryThirdCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antchain.carbon.third.cert.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryThirdCertResponse());
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAntcloudGatewayxFileUploadEx(request, headers, runtime);
    }

    /**
     * Description: 创建HTTP PUT提交的文件上传
     * Summary: 文件上传创建
     */
    public CreateAntcloudGatewayxFileUploadResponse createAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateAntcloudGatewayxFileUploadResponse());
    }
}
