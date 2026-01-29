// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.twc.models.*;

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
                    new TeaPair("sdk_version", "1.13.20"),
                    new TeaPair("_prod_code", "TWC"),
                    new TeaPair("_prod_channel", "undefined")
                );
                if (!com.aliyun.teautil.Common.empty(_securityToken)) {
                    request_.query.put("security_token", _securityToken);
                }

                request_.headers = TeaConverter.merge(String.class,
                    TeaConverter.buildMap(
                        new TeaPair("host", com.aliyun.teautil.Common.defaultString(_endpoint, "twc-openapi.antchain.antgroup.com")),
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
     * <p>Description: AI提问获取答案
     * Summary: 获取答案</p>
     */
    public QueryAilegalAnswerResponse queryAilegalAnswer(QueryAilegalAnswerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAilegalAnswerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AI提问获取答案
     * Summary: 获取答案</p>
     */
    public QueryAilegalAnswerResponse queryAilegalAnswerEx(QueryAilegalAnswerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.ailegal.answer.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryAilegalAnswerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 问答反馈
     * Summary: 问答反馈</p>
     */
    public SubmitAilegalFeedbackResponse submitAilegalFeedback(SubmitAilegalFeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAilegalFeedbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 问答反馈
     * Summary: 问答反馈</p>
     */
    public SubmitAilegalFeedbackResponse submitAilegalFeedbackEx(SubmitAilegalFeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.ailegal.feedback.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitAilegalFeedbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: AI法律服务提问接口
     * Summary: 提出问题</p>
     */
    public InitAilegalQuestionResponse initAilegalQuestion(InitAilegalQuestionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initAilegalQuestionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: AI法律服务提问接口
     * Summary: 提出问题</p>
     */
    public InitAilegalQuestionResponse initAilegalQuestionEx(InitAilegalQuestionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.ailegal.question.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitAilegalQuestionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
     * Summary: 仲裁状态信息变更回调接口</p>
     */
    public CallbackArbitrationStatusResponse callbackArbitrationStatus(CallbackArbitrationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackArbitrationStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
     * Summary: 仲裁状态信息变更回调接口</p>
     */
    public CallbackArbitrationStatusResponse callbackArbitrationStatusEx(CallbackArbitrationStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.arbitration.status.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackArbitrationStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 仲裁签署状态信息变更回调接口
     * Summary: 仲裁签署状态信息变更回调接口</p>
     */
    public CallbackArbitrationSignstatusResponse callbackArbitrationSignstatus(CallbackArbitrationSignstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.callbackArbitrationSignstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 仲裁签署状态信息变更回调接口
     * Summary: 仲裁签署状态信息变更回调接口</p>
     */
    public CallbackArbitrationSignstatusResponse callbackArbitrationSignstatusEx(CallbackArbitrationSignstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.arbitration.signstatus.callback", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CallbackArbitrationSignstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁物流信息添加
     * Summary: 租赁物流信息添加</p>
     */
    public AddBclLogisticinfoResponse addBclLogisticinfo(AddBclLogisticinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addBclLogisticinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁物流信息添加
     * Summary: 租赁物流信息添加</p>
     */
    public AddBclLogisticinfoResponse addBclLogisticinfoEx(AddBclLogisticinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.logisticinfo.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddBclLogisticinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁订单发起
     * Summary: 租赁订单发起</p>
     */
    public SubmitBclOrderResponse submitBclOrder(SubmitBclOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitBclOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁订单发起
     * Summary: 租赁订单发起</p>
     */
    public SubmitBclOrderResponse submitBclOrderEx(SubmitBclOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.order.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitBclOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建租赁订单
     * Summary: 创建租赁订单</p>
     */
    public CreateBclOrderResponse createBclOrder(CreateBclOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBclOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建租赁订单
     * Summary: 创建租赁订单</p>
     */
    public CreateBclOrderResponse createBclOrderEx(CreateBclOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBclOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁订单查询
     * Summary: 租赁订单查询</p>
     */
    public QueryBclOrderResponse queryBclOrder(QueryBclOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBclOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁订单查询
     * Summary: 租赁订单查询</p>
     */
    public QueryBclOrderResponse queryBclOrderEx(QueryBclOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBclOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 履约信息上传接口
     * Summary: 履约信息上传接口</p>
     */
    public UploadBclPerformanceResponse uploadBclPerformance(UploadBclPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadBclPerformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 履约信息上传接口
     * Summary: 履约信息上传接口</p>
     */
    public UploadBclPerformanceResponse uploadBclPerformanceEx(UploadBclPerformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.performance.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadBclPerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品导入
     * Summary: 商品导入</p>
     */
    public CreateBclProductResponse createBclProduct(CreateBclProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBclProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品导入
     * Summary: 商品导入</p>
     */
    public CreateBclProductResponse createBclProductEx(CreateBclProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.product.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBclProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品查询
     * Summary: 商品查询</p>
     */
    public QueryBclProductResponse queryBclProduct(QueryBclProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBclProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商品查询
     * Summary: 商品查询</p>
     */
    public QueryBclProductResponse queryBclProductEx(QueryBclProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.product.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBclProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同资源量校验与资源扣减
     * Summary: 合同资源量校验与资源扣减</p>
     */
    public VerifyBclContractmetricResponse verifyBclContractmetric(VerifyBclContractmetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyBclContractmetricEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同资源量校验与资源扣减
     * Summary: 合同资源量校验与资源扣减</p>
     */
    public VerifyBclContractmetricResponse verifyBclContractmetricEx(VerifyBclContractmetricRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.contractmetric.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyBclContractmetricResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取授权访问oss链接
     * Summary: 获取授权访问oss链接</p>
     */
    public GetBclUploadurlResponse getBclUploadurl(GetBclUploadurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBclUploadurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取授权访问oss链接
     * Summary: 获取授权访问oss链接</p>
     */
    public GetBclUploadurlResponse getBclUploadurlEx(GetBclUploadurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.uploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetBclUploadurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 变更BCL订单承诺履约还款方式。合同代扣类型的订单，可以调用该接口取消某一期的代扣(转换为主动还款)。
     * Summary: 变更BCL订单承诺履约还款方式</p>
     */
    public UpdateBclPromiserepaymentResponse updateBclPromiserepayment(UpdateBclPromiserepaymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBclPromiserepaymentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 变更BCL订单承诺履约还款方式。合同代扣类型的订单，可以调用该接口取消某一期的代扣(转换为主动还款)。
     * Summary: 变更BCL订单承诺履约还款方式</p>
     */
    public UpdateBclPromiserepaymentResponse updateBclPromiserepaymentEx(UpdateBclPromiserepaymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.promiserepayment.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateBclPromiserepaymentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建收款方
     * Summary: 创建收款方</p>
     */
    public CreateBclPayeeResponse createBclPayee(CreateBclPayeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBclPayeeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建收款方
     * Summary: 创建收款方</p>
     */
    public CreateBclPayeeResponse createBclPayeeEx(CreateBclPayeeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.payee.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBclPayeeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus订单融资申请接口
     * Summary: 租赁宝plus订单融资申请接口</p>
     */
    public ApplyBclFinancingResponse applyBclFinancing(ApplyBclFinancingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyBclFinancingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus订单融资申请接口
     * Summary: 租赁宝plus订单融资申请接口</p>
     */
    public ApplyBclFinancingResponse applyBclFinancingEx(ApplyBclFinancingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.financing.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyBclFinancingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家发起入驻成功后，可以通过此接口查询入驻的结果
     * Summary: 查询商家入驻结果</p>
     */
    public QueryBclMerchantResponse queryBclMerchant(QueryBclMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBclMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家发起入驻成功后，可以通过此接口查询入驻的结果
     * Summary: 查询商家入驻结果</p>
     */
    public QueryBclMerchantResponse queryBclMerchantEx(QueryBclMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.merchant.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBclMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家入驻租赁宝plus平台接口
     * Summary: 商家入驻租赁宝plus平台接口</p>
     */
    public RegisterBclMerchantResponse registerBclMerchant(RegisterBclMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerBclMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家入驻租赁宝plus平台接口
     * Summary: 商家入驻租赁宝plus平台接口</p>
     */
    public RegisterBclMerchantResponse registerBclMerchantEx(RegisterBclMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.merchant.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterBclMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 当商家收到买家想解除代扣协议的消息后，可选择同意或拒绝用户解约操作；前置条件：商家已成功收到买家解除代扣协议的消息；
     * Summary: 解除代扣协议</p>
     */
    public CancelBclWithholdResponse cancelBclWithhold(CancelBclWithholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBclWithholdEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 当商家收到买家想解除代扣协议的消息后，可选择同意或拒绝用户解约操作；前置条件：商家已成功收到买家解除代扣协议的消息；
     * Summary: 解除代扣协议</p>
     */
    public CancelBclWithholdResponse cancelBclWithholdEx(CancelBclWithholdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.withhold.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBclWithholdResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询单条交易投诉详情接口
     * Summary: 查询单条交易投诉详情接口</p>
     */
    public QueryBclComplainResponse queryBclComplain(QueryBclComplainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBclComplainEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询单条交易投诉详情接口
     * Summary: 查询单条交易投诉详情接口</p>
     */
    public QueryBclComplainResponse queryBclComplainEx(QueryBclComplainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.complain.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBclComplainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户上传处理图片
     * Summary: 商户上传处理图片</p>
     */
    public UploadBclComplainimageResponse uploadBclComplainimage(UploadBclComplainimageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadBclComplainimageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户上传处理图片
     * Summary: 商户上传处理图片</p>
     */
    public UploadBclComplainimageResponse uploadBclComplainimageEx(UploadBclComplainimageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.complainimage.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadBclComplainimageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家处理交易投诉
     * Summary: 商家处理交易投诉</p>
     */
    public SubmitBclComplainfeedbackResponse submitBclComplainfeedback(SubmitBclComplainfeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitBclComplainfeedbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家处理交易投诉
     * Summary: 商家处理交易投诉</p>
     */
    public SubmitBclComplainfeedbackResponse submitBclComplainfeedbackEx(SubmitBclComplainfeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.complainfeedback.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitBclComplainfeedbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询投诉单id列表
     * Summary: 查询投诉单id列表</p>
     */
    public QueryBclComplaineventidsResponse queryBclComplaineventids(QueryBclComplaineventidsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBclComplaineventidsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询投诉单id列表
     * Summary: 查询投诉单id列表</p>
     */
    public QueryBclComplaineventidsResponse queryBclComplaineventidsEx(QueryBclComplaineventidsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.complaineventids.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBclComplaineventidsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus文件上传接口
     * Summary: 租赁文件上传接口</p>
     */
    public UploadBclFileResponse uploadBclFile(UploadBclFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadBclFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus文件上传接口
     * Summary: 租赁文件上传接口</p>
     */
    public UploadBclFileResponse uploadBclFileEx(UploadBclFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.file.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadBclFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 完成租赁单推进终态，本期要支持非自建代扣+新租赁宝代扣+老合同+老租赁宝代扣的租赁单完结
     * Summary: 完结租赁单</p>
     */
    public FinishBclOrderResponse finishBclOrder(FinishBclOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishBclOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 完成租赁单推进终态，本期要支持非自建代扣+新租赁宝代扣+老合同+老租赁宝代扣的租赁单完结
     * Summary: 完结租赁单</p>
     */
    public FinishBclOrderResponse finishBclOrderEx(FinishBclOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.order.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishBclOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus退款
     * Summary: 租赁宝plus退款</p>
     */
    public CreateBclRefundResponse createBclRefund(CreateBclRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBclRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus退款
     * Summary: 租赁宝plus退款</p>
     */
    public CreateBclRefundResponse createBclRefundEx(CreateBclRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.refund.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBclRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus退款查询
     * Summary: 租赁宝plus退款查询</p>
     */
    public QueryBclRefundResponse queryBclRefund(QueryBclRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBclRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus退款查询
     * Summary: 租赁宝plus退款查询</p>
     */
    public QueryBclRefundResponse queryBclRefundEx(QueryBclRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.refund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBclRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus投保
     * Summary: 租赁宝plus投保</p>
     */
    public CreateBclInsuranceResponse createBclInsurance(CreateBclInsuranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createBclInsuranceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus投保
     * Summary: 租赁宝plus投保</p>
     */
    public CreateBclInsuranceResponse createBclInsuranceEx(CreateBclInsuranceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.insurance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateBclInsuranceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus退保
     * Summary: 租赁宝plus退保</p>
     */
    public CancelBclInsuranceResponse cancelBclInsurance(CancelBclInsuranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelBclInsuranceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus退保
     * Summary: 租赁宝plus退保</p>
     */
    public CancelBclInsuranceResponse cancelBclInsuranceEx(CancelBclInsuranceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.insurance.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelBclInsuranceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus查询订单保险详情
     * Summary: 租赁宝plus查询订单保险详情</p>
     */
    public QueryBclInsuranceResponse queryBclInsurance(QueryBclInsuranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryBclInsuranceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝plus查询订单保险详情
     * Summary: 租赁宝plus查询订单保险详情</p>
     */
    public QueryBclInsuranceResponse queryBclInsuranceEx(QueryBclInsuranceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.bcl.insurance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryBclInsuranceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
     * Summary: 创建电子合同签署个人帐户</p>
     */
    public CreateContractAccountResponse createContractAccount(CreateContractAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
     * Summary: 创建电子合同签署个人帐户</p>
     */
    public CreateContractAccountResponse createContractAccountEx(CreateContractAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模版参数，创建个人印章
     * Summary: 创建电子合同个人帐户印章</p>
     */
    public CreateContractAccountsealResponse createContractAccountseal(CreateContractAccountsealRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAccountsealEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模版参数，创建个人印章
     * Summary: 创建电子合同个人帐户印章</p>
     */
    public CreateContractAccountsealResponse createContractAccountsealEx(CreateContractAccountsealRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.accountseal.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAccountsealResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
     * 创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
     * Summary: 创建电子合同签署机构帐户</p>
     */
    public CreateContractOrganizationResponse createContractOrganization(CreateContractOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractOrganizationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
     * 创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
     * Summary: 创建电子合同签署机构帐户</p>
     */
    public CreateContractOrganizationResponse createContractOrganizationEx(CreateContractOrganizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.organization.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractOrganizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模版参数，创建机构印章
     * Summary: 创建电子合同机构帐户印章</p>
     */
    public CreateContractOrgsealResponse createContractOrgseal(CreateContractOrgsealRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractOrgsealEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过模版参数，创建机构印章
     * Summary: 创建电子合同机构帐户印章</p>
     */
    public CreateContractOrgsealResponse createContractOrgsealEx(CreateContractOrgsealRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.orgseal.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractOrgsealResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 静默签署授权
     * Summary: 静默签署授权</p>
     */
    public AuthContractSignResponse authContractSign(AuthContractSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authContractSignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 静默签署授权
     * Summary: 静默签署授权</p>
     */
    public AuthContractSignResponse authContractSignEx(AuthContractSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.sign.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthContractSignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板</p>
     */
    public CreateContractTemplateResponse createContractTemplate(CreateContractTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
     * Summary: 通过文件上传方式创建电子合同签署模板</p>
     */
    public CreateContractTemplateResponse createContractTemplateEx(CreateContractTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.template.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建签署流程
     * Summary: 创建电子合同签署流程</p>
     */
    public CreateContractFlowResponse createContractFlow(CreateContractFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建签署流程
     * Summary: 创建电子合同签署流程</p>
     */
    public CreateContractFlowResponse createContractFlowEx(CreateContractFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档</p>
     */
    public AddContractDocumentResponse addContractDocument(AddContractDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
     * Summary: 向电子合同签署流程中添加待签署文档</p>
     */
    public AddContractDocumentResponse addContractDocumentEx(AddContractDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.document.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区</p>
     */
    public AddContractSignfieldResponse addContractSignfield(AddContractSignfieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractSignfieldEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
     * Summary: 添加电子合同签署方自动盖章签署区</p>
     */
    public AddContractSignfieldResponse addContractSignfieldEx(AddContractSignfieldRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signfield.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractSignfieldResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启</p>
     */
    public StartContractFlowResponse startContractFlow(StartContractFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startContractFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
     * Summary: 电子合同签署流程开启</p>
     */
    public StartContractFlowResponse startContractFlowEx(StartContractFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartContractFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档</p>
     */
    public SaveContractFlowResponse saveContractFlow(SaveContractFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveContractFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
     * Summary: 电子合同签署流程归档</p>
     */
    public SaveContractFlowResponse saveContractFlowEx(SaveContractFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveContractFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载</p>
     */
    public DownloadContractDocumentResponse downloadContractDocument(DownloadContractDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadContractDocumentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流程归档后，查询和下载签署后的文件
     * Summary: 电子合同流程文档下载</p>
     */
    public DownloadContractDocumentResponse downloadContractDocumentEx(DownloadContractDocumentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.document.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadContractDocumentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档</p>
     */
    public AddContractFileResponse addContractFile(AddContractFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
     * Summary: 通过电子合同模板添加文档</p>
     */
    public AddContractFileResponse addContractFileEx(AddContractFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.file.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册</p>
     */
    public CreateContractPlatformResponse createContractPlatform(CreateContractPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractPlatformEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
     * Summary: 电子合同平台方注册</p>
     */
    public CreateContractPlatformResponse createContractPlatformEx(CreateContractPlatformRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.platform.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractPlatformResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同平台方提供用户信息，注册成为平台用户
     * Summary: 电子合同平台方的用户注册</p>
     */
    public CreateContractUserResponse createContractUser(CreateContractUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同平台方提供用户信息，注册成为平台用户
     * Summary: 电子合同平台方的用户注册</p>
     */
    public CreateContractUserResponse createContractUserEx(CreateContractUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.user.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
     * Summary: 电子合同平台方发起手动签署流程</p>
     */
    public StartContractHandsignResponse startContractHandsign(StartContractHandsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startContractHandsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
     * Summary: 电子合同平台方发起手动签署流程</p>
     */
    public StartContractHandsignResponse startContractHandsignEx(StartContractHandsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.handsign.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartContractHandsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询</p>
     */
    public QueryContractFlowResponse queryContractFlow(QueryContractFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询签署流程的详细信息，包括流程配置、签署状态等
     * Summary: 签署流程查询</p>
     */
    public QueryContractFlowResponse queryContractFlowEx(QueryContractFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章</p>
     */
    public CreateContractAccountsealimageResponse createContractAccountsealimage(CreateContractAccountsealimageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAccountsealimageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建个人/机构图片印章
     * Summary: 创建个人/机构图片印章</p>
     */
    public CreateContractAccountsealimageResponse createContractAccountsealimageEx(CreateContractAccountsealimageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAccountsealimageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件</p>
     */
    public GetContractFileuploadurlResponse getContractFileuploadurl(GetContractFileuploadurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractFileuploadurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
     * Summary: 通过上传方式创建文件</p>
     */
    public GetContractFileuploadurlResponse getContractFileuploadurlEx(GetContractFileuploadurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractFileuploadurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
     * 签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
     * Summary: 添加平台自动盖章签署区</p>
     */
    public AddContractPlatformsignfieldsResponse addContractPlatformsignfields(AddContractPlatformsignfieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addContractPlatformsignfieldsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
     * 签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
     * Summary: 添加平台自动盖章签署区</p>
     */
    public AddContractPlatformsignfieldsResponse addContractPlatformsignfieldsEx(AddContractPlatformsignfieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.platformsignfields.add", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AddContractPlatformsignfieldsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情</p>
     */
    public GetContractFileResponse getContractFile(GetContractFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询文件详情，包括文件名称、大小、下载地址等
     * Summary: 查询文件详情</p>
     */
    public GetContractFileResponse getContractFileEx(GetContractFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询个人所有印章
     * Summary: 查询个人印章</p>
     */
    public QueryContractAccountsealsResponse queryContractAccountseals(QueryContractAccountsealsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractAccountsealsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询个人所有印章
     * Summary: 查询个人印章</p>
     */
    public QueryContractAccountsealsResponse queryContractAccountsealsEx(QueryContractAccountsealsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.accountseals.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractAccountsealsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询机构所有印章
     * Summary: 查询机构印章</p>
     */
    public QueryContractOrganizationsealsResponse queryContractOrganizationseals(QueryContractOrganizationsealsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractOrganizationsealsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询机构所有印章
     * Summary: 查询机构印章</p>
     */
    public QueryContractOrganizationsealsResponse queryContractOrganizationsealsEx(QueryContractOrganizationsealsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.organizationseals.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractOrganizationsealsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表</p>
     */
    public QueryContractFlowsignerResponse queryContractFlowsigner(QueryContractFlowsignerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractFlowsignerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询流程所有签署人列表。
     * Summary: 查询流程签署人列表</p>
     */
    public QueryContractFlowsignerResponse queryContractFlowsignerEx(QueryContractFlowsignerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractFlowsignerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表</p>
     */
    public QueryContractSignfieldsResponse queryContractSignfields(QueryContractSignfieldsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractSignfieldsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
     * Summary: 查询签署区列表</p>
     */
    public QueryContractSignfieldsResponse queryContractSignfieldsEx(QueryContractSignfieldsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signfields.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractSignfieldsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 使用创建账号返回的账号id查询用户的账号。
     * Summary: 查询个人账号</p>
     */
    public QueryContractAccountResponse queryContractAccount(QueryContractAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractAccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 使用创建账号返回的账号id查询用户的账号。
     * Summary: 查询个人账号</p>
     */
    public QueryContractAccountResponse queryContractAccountEx(QueryContractAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.account.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 使用创建账号返回的账号id查询机构账号。
     * Summary: 查询机构账号</p>
     */
    public QueryContractOrganizationResponse queryContractOrganization(QueryContractOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractOrganizationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 使用创建账号返回的账号id查询机构账号。
     * Summary: 查询机构账号</p>
     */
    public QueryContractOrganizationResponse queryContractOrganizationEx(QueryContractOrganizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.organization.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractOrganizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
     * Summary: 查询模板详情详情</p>
     */
    public QueryContractTemplateResponse queryContractTemplate(QueryContractTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractTemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
     * Summary: 查询模板详情详情</p>
     */
    public QueryContractTemplateResponse queryContractTemplateEx(QueryContractTemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.template.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程</p>
     */
    public CreateContractSignflowResponse createContractSignflow(CreateContractSignflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractSignflowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
     * Summary: 创建签署流程</p>
     */
    public CreateContractSignflowResponse createContractSignflowEx(CreateContractSignflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractSignflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户签署直付通协议
     * Summary: 商户签署直付通协议</p>
     */
    public CreateContractRegisterzftResponse createContractRegisterzft(CreateContractRegisterzftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractRegisterzftEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户签署直付通协议
     * Summary: 商户签署直付通协议</p>
     */
    public CreateContractRegisterzftResponse createContractRegisterzftEx(CreateContractRegisterzftRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.registerzft.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractRegisterzftResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
     * Summary: 创建智能合同模板</p>
     */
    public CreateContractPlatformtemplateResponse createContractPlatformtemplate(CreateContractPlatformtemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractPlatformtemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
     * Summary: 创建智能合同模板</p>
     */
    public CreateContractPlatformtemplateResponse createContractPlatformtemplateEx(CreateContractPlatformtemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.platformtemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractPlatformtemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询商户直付通入驻信息
     * Summary: 查询商户直付通入驻信息</p>
     */
    public QueryContractMerchantzftResponse queryContractMerchantzft(QueryContractMerchantzftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractMerchantzftEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询商户直付通入驻信息
     * Summary: 查询商户直付通入驻信息</p>
     */
    public QueryContractMerchantzftResponse queryContractMerchantzftEx(QueryContractMerchantzftRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantzft.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractMerchantzftResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 列举本租户合同相关交易
     * Summary: 列举本租户合同相关交易</p>
     */
    public ListContractOuttradeidResponse listContractOuttradeid(ListContractOuttradeidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractOuttradeidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 列举本租户合同相关交易
     * Summary: 列举本租户合同相关交易</p>
     */
    public ListContractOuttradeidResponse listContractOuttradeidEx(ListContractOuttradeidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.outtradeid.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractOuttradeidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据订单id查询订单代扣详情
     * Summary: 根据订单id查询订单代扣详情</p>
     */
    public QueryContractTradedetailResponse queryContractTradedetail(QueryContractTradedetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractTradedetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据订单id查询订单代扣详情
     * Summary: 根据订单id查询订单代扣详情</p>
     */
    public QueryContractTradedetailResponse queryContractTradedetailEx(QueryContractTradedetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.tradedetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractTradedetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户根据订单id退款
     * Summary: 商户根据订单id退款</p>
     */
    public CreateContractMerchantrefundResponse createContractMerchantrefund(CreateContractMerchantrefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractMerchantrefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户根据订单id退款
     * Summary: 商户根据订单id退款</p>
     */
    public CreateContractMerchantrefundResponse createContractMerchantrefundEx(CreateContractMerchantrefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantrefund.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractMerchantrefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建蚂蚁区块链账户
     * Summary: 创建蚂蚁区块链账户</p>
     */
    public CreateContractAdminaccountResponse createContractAdminaccount(CreateContractAdminaccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractAdminaccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建蚂蚁区块链账户
     * Summary: 创建蚂蚁区块链账户</p>
     */
    public CreateContractAdminaccountResponse createContractAdminaccountEx(CreateContractAdminaccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.adminaccount.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractAdminaccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户根据合同id列举所有的tradeId
     * Summary: 商户根据合同id列举所有的tradeId</p>
     */
    public ListContractTradeidsResponse listContractTradeids(ListContractTradeidsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractTradeidsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户根据合同id列举所有的tradeId
     * Summary: 商户根据合同id列举所有的tradeId</p>
     */
    public ListContractTradeidsResponse listContractTradeidsEx(ListContractTradeidsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.tradeids.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractTradeidsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户上传代扣规则
     * Summary: 商户上传代扣规则</p>
     */
    public CreateContractCommontriggerResponse createContractCommontrigger(CreateContractCommontriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractCommontriggerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户上传代扣规则
     * Summary: 商户上传代扣规则</p>
     */
    public CreateContractCommontriggerResponse createContractCommontriggerEx(CreateContractCommontriggerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.commontrigger.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractCommontriggerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻直付通
     * Summary: 商户入驻直付通</p>
     */
    public CreateContractMerchantindirectzftResponse createContractMerchantindirectzft(CreateContractMerchantindirectzftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractMerchantindirectzftEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻直付通
     * Summary: 商户入驻直付通</p>
     */
    public CreateContractMerchantindirectzftResponse createContractMerchantindirectzftEx(CreateContractMerchantindirectzftRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantindirectzft.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractMerchantindirectzftResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据订单id查询直付通商户入驻信息
     * Summary: 根据订单id查询直付通商户入驻信息</p>
     */
    public QueryContractMerchantindirectzftResponse queryContractMerchantindirectzft(QueryContractMerchantindirectzftRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractMerchantindirectzftEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据订单id查询直付通商户入驻信息
     * Summary: 根据订单id查询直付通商户入驻信息</p>
     */
    public QueryContractMerchantindirectzftResponse queryContractMerchantindirectzftEx(QueryContractMerchantindirectzftRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantindirectzft.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractMerchantindirectzftResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取支付对账文件的url
     * Summary: 获取支付对账文件的url</p>
     */
    public QueryPayresultfileurlResponse queryPayresultfileurl(QueryPayresultfileurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPayresultfileurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取支付对账文件的url
     * Summary: 获取支付对账文件的url</p>
     */
    public QueryPayresultfileurlResponse queryPayresultfileurlEx(QueryPayresultfileurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.payresultfileurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPayresultfileurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能合同图片上传
     * Summary: 智能合同图片上传</p>
     */
    public CreateContractMerchantimageResponse createContractMerchantimage(CreateContractMerchantimageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractMerchantimageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 智能合同图片上传
     * Summary: 智能合同图片上传</p>
     */
    public CreateContractMerchantimageResponse createContractMerchantimageEx(CreateContractMerchantimageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantimage.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractMerchantimageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消智能合同剩余代扣条目
     * Summary: 取消智能合同剩余代扣条目</p>
     */
    public CancelContractPaytradeResponse cancelContractPaytrade(CancelContractPaytradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelContractPaytradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消智能合同剩余代扣条目
     * Summary: 取消智能合同剩余代扣条目</p>
     */
    public CancelContractPaytradeResponse cancelContractPaytradeEx(CancelContractPaytradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.paytrade.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelContractPaytradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建手动签署流程
     * Summary: 创建手动签署流程</p>
     */
    public CreateContractHandsignflowResponse createContractHandsignflow(CreateContractHandsignflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractHandsignflowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建手动签署流程
     * Summary: 创建手动签署流程</p>
     */
    public CreateContractHandsignflowResponse createContractHandsignflowEx(CreateContractHandsignflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.handsignflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractHandsignflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区</p>
     */
    public CreateContractHandsignfieldResponse createContractHandsignfield(CreateContractHandsignfieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractHandsignfieldEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
     * Summary: 添加电子合同签署方手动盖章签署区</p>
     */
    public CreateContractHandsignfieldResponse createContractHandsignfieldEx(CreateContractHandsignfieldRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractHandsignfieldResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址</p>
     */
    public GetContractSignurlResponse getContractSignurl(GetContractSignurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractSignurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
     * Summary: 获取签署地址</p>
     */
    public GetContractSignurlResponse getContractSignurlEx(GetContractSignurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractSignurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信付代扣规则内容创建
     * Summary: 可信付代扣规则内容创建</p>
     */
    public CreateWithholdAgreementResponse createWithholdAgreement(CreateWithholdAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdAgreementEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信付代扣规则内容创建
     * Summary: 可信付代扣规则内容创建</p>
     */
    public CreateWithholdAgreementResponse createWithholdAgreementEx(CreateWithholdAgreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.agreement.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdAgreementResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询消金代扣协议
     * Summary: 查询可信付代扣协议内容</p>
     */
    public QueryWithholdAgreementResponse queryWithholdAgreement(QueryWithholdAgreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdAgreementEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询消金代扣协议
     * Summary: 查询可信付代扣协议内容</p>
     */
    public QueryWithholdAgreementResponse queryWithholdAgreementEx(QueryWithholdAgreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.agreement.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdAgreementResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询可信付协议的入口
     * Summary: 查询可信付协议的入口</p>
     */
    public QueryWithholdAgreementurlResponse queryWithholdAgreementurl(QueryWithholdAgreementurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdAgreementurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询可信付协议的入口
     * Summary: 查询可信付协议的入口</p>
     */
    public QueryWithholdAgreementurlResponse queryWithholdAgreementurlEx(QueryWithholdAgreementurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.agreementurl.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdAgreementurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 后台录入商家的产品的逾期日
     * Summary: 后台录入商家的产品的逾期日</p>
     */
    public CreateWithholdOverduetimeResponse createWithholdOverduetime(CreateWithholdOverduetimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdOverduetimeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 后台录入商家的产品的逾期日
     * Summary: 后台录入商家的产品的逾期日</p>
     */
    public CreateWithholdOverduetimeResponse createWithholdOverduetimeEx(CreateWithholdOverduetimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.overduetime.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdOverduetimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信付代扣的扣费请求
     * Summary: 发送代扣请求</p>
     */
    public SendWithholdDeductResponse sendWithholdDeduct(SendWithholdDeductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendWithholdDeductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信付代扣的扣费请求
     * Summary: 发送代扣请求</p>
     */
    public SendWithholdDeductResponse sendWithholdDeductEx(SendWithholdDeductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.deduct.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendWithholdDeductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信付代扣结果查询
     * Summary: 可信付代扣结果查询</p>
     */
    public QueryWithholdPayresultResponse queryWithholdPayresult(QueryWithholdPayresultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWithholdPayresultEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信付代扣结果查询
     * Summary: 可信付代扣结果查询</p>
     */
    public QueryWithholdPayresultResponse queryWithholdPayresultEx(QueryWithholdPayresultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.payresult.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWithholdPayresultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信付退款请求
     * Summary: 可信付退款请求</p>
     */
    public SendWithholdRefundResponse sendWithholdRefund(SendWithholdRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendWithholdRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可信付退款请求
     * Summary: 可信付退款请求</p>
     */
    public SendWithholdRefundResponse sendWithholdRefundEx(SendWithholdRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.refund.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendWithholdRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
     * Summary: 创建注册邀请任务</p>
     */
    public SendContractInvitationResponse sendContractInvitation(SendContractInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendContractInvitationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
     * Summary: 创建注册邀请任务</p>
     */
    public SendContractInvitationResponse sendContractInvitationEx(SendContractInvitationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.invitation.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendContractInvitationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代扣规则
     * Summary: 查询代扣规则</p>
     */
    public ListContractPayruleResponse listContractPayrule(ListContractPayruleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractPayruleEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询代扣规则
     * Summary: 查询代扣规则</p>
     */
    public ListContractPayruleResponse listContractPayruleEx(ListContractPayruleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.payrule.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractPayruleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取可信付免签协议的二维码
     * Summary: 获取可信付免签协议的二维码</p>
     */
    public CreateWithholdQrcodeResponse createWithholdQrcode(CreateWithholdQrcodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWithholdQrcodeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取可信付免签协议的二维码
     * Summary: 获取可信付免签协议的二维码</p>
     */
    public CreateWithholdQrcodeResponse createWithholdQrcodeEx(CreateWithholdQrcodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.withhold.qrcode.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWithholdQrcodeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消某一期的代扣规则
     * Summary: 取消某一期的代扣规则</p>
     */
    public CancelContractPaysingletradeResponse cancelContractPaysingletrade(CancelContractPaysingletradeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelContractPaysingletradeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 取消某一期的代扣规则
     * Summary: 取消某一期的代扣规则</p>
     */
    public CancelContractPaysingletradeResponse cancelContractPaysingletradeEx(CancelContractPaysingletradeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.paysingletrade.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelContractPaysingletradeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key</p>
     */
    public ApplyContractCallbackkeyResponse applyContractCallbackkey(ApplyContractCallbackkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContractCallbackkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
     * Summary: 申请区块链合同回调加签key</p>
     */
    public ApplyContractCallbackkeyResponse applyContractCallbackkeyEx(ApplyContractCallbackkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContractCallbackkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
     * Summary: 一步创建签署流程接口</p>
     */
    public CreateContractOnestepflowResponse createContractOnestepflow(CreateContractOnestepflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractOnestepflowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
     * Summary: 一步创建签署流程接口</p>
     */
    public CreateContractOnestepflowResponse createContractOnestepflowEx(CreateContractOnestepflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.onestepflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractOnestepflowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过流程ID查询合同存证信息
     * Summary: 查询合同存证信息</p>
     */
    public QueryContractNotaryResponse queryContractNotary(QueryContractNotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractNotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过流程ID查询合同存证信息
     * Summary: 查询合同存证信息</p>
     */
    public QueryContractNotaryResponse queryContractNotaryEx(QueryContractNotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.notary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractNotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取合同存证事务ID
     * Summary: 获取合同存证事务ID</p>
     */
    public CreateEcocontractTransResponse createEcocontractTrans(CreateEcocontractTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEcocontractTransEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取合同存证事务ID
     * Summary: 获取合同存证事务ID</p>
     */
    public CreateEcocontractTransResponse createEcocontractTransEx(CreateEcocontractTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.ecocontract.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEcocontractTransResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同文本存证
     * Summary: 合同文本存证</p>
     */
    public CreateEcocontractTextResponse createEcocontractText(CreateEcocontractTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createEcocontractTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同文本存证
     * Summary: 合同文本存证</p>
     */
    public CreateEcocontractTextResponse createEcocontractTextEx(CreateEcocontractTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.ecocontract.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateEcocontractTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
     * Summary: 搜索关键字坐标</p>
     */
    public QueryContractWordspositionResponse queryContractWordsposition(QueryContractWordspositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractWordspositionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
     * Summary: 搜索关键字坐标</p>
     */
    public QueryContractWordspositionResponse queryContractWordspositionEx(QueryContractWordspositionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.wordsposition.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractWordspositionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 执行签署人删除逻辑
     * Summary: 删除签署人</p>
     */
    public DeleteContractSignerResponse deleteContractSigner(DeleteContractSignerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContractSignerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 执行签署人删除逻辑
     * Summary: 删除签署人</p>
     */
    public DeleteContractSignerResponse deleteContractSignerEx(DeleteContractSignerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signer.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContractSignerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取区块链合同存证证明
     * Summary: 获取区块链合同存证证明</p>
     */
    public GetContractCertificateResponse getContractCertificate(GetContractCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取区块链合同存证证明
     * Summary: 获取区块链合同存证证明</p>
     */
    public GetContractCertificateResponse getContractCertificateEx(GetContractCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.certificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
     * Summary: 根据合同流程签署区查询已使用的印章id</p>
     */
    public QueryContractSignfieldsealidResponse queryContractSignfieldsealid(QueryContractSignfieldsealidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractSignfieldsealidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
     * Summary: 根据合同流程签署区查询已使用的印章id</p>
     */
    public QueryContractSignfieldsealidResponse queryContractSignfieldsealidEx(QueryContractSignfieldsealidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signfieldsealid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractSignfieldsealidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
     * Summary: 通知签署方执行合同签署</p>
     */
    public NotifyContractSignerResponse notifyContractSigner(NotifyContractSignerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyContractSignerEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
     * Summary: 通知签署方执行合同签署</p>
     */
    public NotifyContractSignerResponse notifyContractSignerEx(NotifyContractSignerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signer.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyContractSignerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
     * Summary: 修改平台方注册信息</p>
     */
    public UpdateContractPlatformResponse updateContractPlatform(UpdateContractPlatformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractPlatformEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
     * Summary: 修改平台方注册信息</p>
     */
    public UpdateContractPlatformResponse updateContractPlatformEx(UpdateContractPlatformRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.platform.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractPlatformResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
     * Summary: 修改用户注册信息</p>
     */
    public UpdateContractUserResponse updateContractUser(UpdateContractUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
     * Summary: 修改用户注册信息</p>
     */
    public UpdateContractUserResponse updateContractUserEx(UpdateContractUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.user.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改<br>Summary: 修改机构用户注册信息</p>
     */
    public UpdateContractOrganizationResponse updateContractOrganization(UpdateContractOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractOrganizationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改<br>Summary: 修改机构用户注册信息</p>
     */
    public UpdateContractOrganizationResponse updateContractOrganizationEx(UpdateContractOrganizationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.organization.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractOrganizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
     * Summary: 商户入驻直付通新接口</p>
     */
    public ApplyContractMerchantResponse applyContractMerchant(ApplyContractMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContractMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
     * Summary: 商户入驻直付通新接口</p>
     */
    public ApplyContractMerchantResponse applyContractMerchantEx(ApplyContractMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchant.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContractMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 直付通商户入驻确认（确认成功则表明入驻成功）
     * Summary: 直付通商户入驻确认</p>
     */
    public ConfirmContractMerchantResponse confirmContractMerchant(ConfirmContractMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmContractMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 直付通商户入驻确认（确认成功则表明入驻成功）
     * Summary: 直付通商户入驻确认</p>
     */
    public ConfirmContractMerchantResponse confirmContractMerchantEx(ConfirmContractMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchant.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmContractMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建合同存证事务ID。私有云使用。
     * Summary: 创建合同存证事务ID。私有云使用。</p>
     */
    public CreatePrivatecontractTransResponse createPrivatecontractTrans(CreatePrivatecontractTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrivatecontractTransEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建合同存证事务ID。私有云使用。
     * Summary: 创建合同存证事务ID。私有云使用。</p>
     */
    public CreatePrivatecontractTransResponse createPrivatecontractTransEx(CreatePrivatecontractTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePrivatecontractTransResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同文本存证。私有云使用。
     * Summary: 合同文本存证。私有云使用。</p>
     */
    public CreatePrivatecontractTextResponse createPrivatecontractText(CreatePrivatecontractTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPrivatecontractTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同文本存证。私有云使用。
     * Summary: 合同文本存证。私有云使用。</p>
     */
    public CreatePrivatecontractTextResponse createPrivatecontractTextEx(CreatePrivatecontractTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreatePrivatecontractTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人二要素校验
     * Summary: 个人二要素校验</p>
     */
    public VerifyPrivatepersonTwometaResponse verifyPrivatepersonTwometa(VerifyPrivatepersonTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyPrivatepersonTwometaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 个人二要素校验
     * Summary: 个人二要素校验</p>
     */
    public VerifyPrivatepersonTwometaResponse verifyPrivatepersonTwometaEx(VerifyPrivatepersonTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privateperson.twometa.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyPrivatepersonTwometaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业二要素校验
     * Summary: 企业二要素校验</p>
     */
    public VerifyPrivatecompanyTwometaResponse verifyPrivatecompanyTwometa(VerifyPrivatecompanyTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyPrivatecompanyTwometaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业二要素校验
     * Summary: 企业二要素校验</p>
     */
    public VerifyPrivatecompanyTwometaResponse verifyPrivatecompanyTwometaEx(VerifyPrivatecompanyTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecompany.twometa.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyPrivatecompanyTwometaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业四要素校验
     * Summary: 企业四要素校验</p>
     */
    public VerifyPrivatecompanyFourmetaResponse verifyPrivatecompanyFourmeta(VerifyPrivatecompanyFourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyPrivatecompanyFourmetaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业四要素校验
     * Summary: 企业四要素校验</p>
     */
    public VerifyPrivatecompanyFourmetaResponse verifyPrivatecompanyFourmetaEx(VerifyPrivatecompanyFourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecompany.fourmeta.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyPrivatecompanyFourmetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 开放给私有云的外部用户的注册接口.
     * Summary: 私有云的外部用户注册接口.</p>
     */
    public ApplyPrivatecontractCertResponse applyPrivatecontractCert(ApplyPrivatecontractCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyPrivatecontractCertEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 开放给私有云的外部用户的注册接口.
     * Summary: 私有云的外部用户注册接口.</p>
     */
    public ApplyPrivatecontractCertResponse applyPrivatecontractCertEx(ApplyPrivatecontractCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.cert.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyPrivatecontractCertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
     * Summary: 代扣计划状态查询</p>
     */
    public QueryContractTradestatusResponse queryContractTradestatus(QueryContractTradestatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractTradestatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
     * Summary: 代扣计划状态查询</p>
     */
    public QueryContractTradestatusResponse queryContractTradestatusEx(QueryContractTradestatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.tradestatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractTradestatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
     * Summary: 代扣退款查询</p>
     */
    public QueryContractRefundResponse queryContractRefund(QueryContractRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractRefundEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
     * Summary: 代扣退款查询</p>
     */
    public QueryContractRefundResponse queryContractRefundEx(QueryContractRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.refund.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractRefundResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
     * Summary: 私有云服务获取外部用户签署地址</p>
     */
    public GetPrivatecontractSignurlResponse getPrivatecontractSignurl(GetPrivatecontractSignurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPrivatecontractSignurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
     * Summary: 私有云服务获取外部用户签署地址</p>
     */
    public GetPrivatecontractSignurlResponse getPrivatecontractSignurlEx(GetPrivatecontractSignurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.signurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetPrivatecontractSignurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
     * Summary: 商户入驻直付通进度查询</p>
     */
    public QueryContractMerchantorderResponse queryContractMerchantorder(QueryContractMerchantorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractMerchantorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
     * Summary: 商户入驻直付通进度查询</p>
     */
    public QueryContractMerchantorderResponse queryContractMerchantorderEx(QueryContractMerchantorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantorder.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractMerchantorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
     * Summary: 商户进件信息修改</p>
     */
    public UpdateContractMerchantResponse updateContractMerchant(UpdateContractMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateContractMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
     * Summary: 商户进件信息修改</p>
     */
    public UpdateContractMerchantResponse updateContractMerchantEx(UpdateContractMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchant.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateContractMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
     * Summary: 二级商户代理挂接接口</p>
     */
    public BindContractMerchantResponse bindContractMerchant(BindContractMerchantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.bindContractMerchantEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
     * Summary: 二级商户代理挂接接口</p>
     */
    public BindContractMerchantResponse bindContractMerchantEx(BindContractMerchantRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchant.bind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new BindContractMerchantResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
     * Summary: 初始化新的私有化合同服务实例</p>
     */
    public InitPrivatecontractIntanceResponse initPrivatecontractIntance(InitPrivatecontractIntanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initPrivatecontractIntanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
     * Summary: 初始化新的私有化合同服务实例</p>
     */
    public InitPrivatecontractIntanceResponse initPrivatecontractIntanceEx(InitPrivatecontractIntanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.intance.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitPrivatecontractIntanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
     * Summary: 更新私有化合同服务实例信息</p>
     */
    public UpdatePrivatecontractIntanceResponse updatePrivatecontractIntance(UpdatePrivatecontractIntanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrivatecontractIntanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
     * Summary: 更新私有化合同服务实例信息</p>
     */
    public UpdatePrivatecontractIntanceResponse updatePrivatecontractIntanceEx(UpdatePrivatecontractIntanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.intance.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdatePrivatecontractIntanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 开放给私有云的外部用户的证书更新接口.
     * Summary: 私有云用户证书更新接口.</p>
     */
    public UpdatePrivatecontractCertResponse updatePrivatecontractCert(UpdatePrivatecontractCertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePrivatecontractCertEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 开放给私有云的外部用户的证书更新接口.
     * Summary: 私有云用户证书更新接口.</p>
     */
    public UpdatePrivatecontractCertResponse updatePrivatecontractCertEx(UpdatePrivatecontractCertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.cert.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdatePrivatecontractCertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改商户进件申请信息状态数据，只允许超管租户操作
     * Summary: 商户进件申请信息重置</p>
     */
    public ResetContractMerchantapplyResponse resetContractMerchantapply(ResetContractMerchantapplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetContractMerchantapplyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 修改商户进件申请信息状态数据，只允许超管租户操作
     * Summary: 商户进件申请信息重置</p>
     */
    public ResetContractMerchantapplyResponse resetContractMerchantapplyEx(ResetContractMerchantapplyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.merchantapply.reset", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResetContractMerchantapplyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
     * Summary: 校验私有化合同服务实例权限情况</p>
     */
    public CheckPrivatecontractProvisionResponse checkPrivatecontractProvision(CheckPrivatecontractProvisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPrivatecontractProvisionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
     * Summary: 校验私有化合同服务实例权限情况</p>
     */
    public CheckPrivatecontractProvisionResponse checkPrivatecontractProvisionEx(CheckPrivatecontractProvisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.provision.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckPrivatecontractProvisionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 私有化合同服务实例计量数据推送
     * Summary: 私有化合同服务实例计量数据推送</p>
     */
    public PushPrivatecontractGaugeResponse pushPrivatecontractGauge(PushPrivatecontractGaugeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushPrivatecontractGaugeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 私有化合同服务实例计量数据推送
     * Summary: 私有化合同服务实例计量数据推送</p>
     */
    public PushPrivatecontractGaugeResponse pushPrivatecontractGaugeEx(PushPrivatecontractGaugeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.privatecontract.gauge.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushPrivatecontractGaugeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
     * Summary: 法院代扣账户扣款预校验</p>
     */
    public CheckContractCourtdeductResponse checkContractCourtdeduct(CheckContractCourtdeductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkContractCourtdeductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
     * Summary: 法院代扣账户扣款预校验</p>
     */
    public CheckContractCourtdeductResponse checkContractCourtdeductEx(CheckContractCourtdeductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.courtdeduct.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckContractCourtdeductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法院代扣计划创建
     * Summary: 法院代扣计划创建</p>
     */
    public CreateContractCourtdeductResponse createContractCourtdeduct(CreateContractCourtdeductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractCourtdeductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法院代扣计划创建
     * Summary: 法院代扣计划创建</p>
     */
    public CreateContractCourtdeductResponse createContractCourtdeductEx(CreateContractCourtdeductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.courtdeduct.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractCourtdeductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法院代扣执行扣款
     * Summary: 法院代扣执行扣款</p>
     */
    public ExecContractCourtdeductResponse execContractCourtdeduct(ExecContractCourtdeductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractCourtdeductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法院代扣执行扣款
     * Summary: 法院代扣执行扣款</p>
     */
    public ExecContractCourtdeductResponse execContractCourtdeductEx(ExecContractCourtdeductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.courtdeduct.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractCourtdeductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本签名
     * Summary: 文本签接口</p>
     */
    public GetContractTextsignResponse getContractTextsign(GetContractTextsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractTextsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本签名
     * Summary: 文本签接口</p>
     */
    public GetContractTextsignResponse getContractTextsignEx(GetContractTextsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.textsign.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractTextsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本验签
     * Summary: 文本验签接口</p>
     */
    public VerifyContractTextsignResponse verifyContractTextsign(VerifyContractTextsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyContractTextsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本验签
     * Summary: 文本验签接口</p>
     */
    public VerifyContractTextsignResponse verifyContractTextsignEx(VerifyContractTextsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.textsign.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyContractTextsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件签验签
     * Summary: 文件签验签</p>
     */
    public VerifyContractDocsignResponse verifyContractDocsign(VerifyContractDocsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyContractDocsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件签验签
     * Summary: 文件签验签</p>
     */
    public VerifyContractDocsignResponse verifyContractDocsignEx(VerifyContractDocsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.docsign.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyContractDocsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除签署区
     * Summary: 删除签署区</p>
     */
    public DeleteContractSignfieldResponse deleteContractSignfield(DeleteContractSignfieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteContractSignfieldEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除签署区
     * Summary: 删除签署区</p>
     */
    public DeleteContractSignfieldResponse deleteContractSignfieldEx(DeleteContractSignfieldRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.signfield.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteContractSignfieldResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建平台方用户接口twc.notary.contract.user.create加密版
     * Summary: 创建平台方用户加密版</p>
     */
    public CreateContractEncrypteduserResponse createContractEncrypteduser(CreateContractEncrypteduserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractEncrypteduserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建平台方用户接口twc.notary.contract.user.create加密版
     * Summary: 创建平台方用户加密版</p>
     */
    public CreateContractEncrypteduserResponse createContractEncrypteduserEx(CreateContractEncrypteduserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.encrypteduser.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractEncrypteduserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
     * Summary: 用户密钥设置接口</p>
     */
    public SetContractTenantkeyResponse setContractTenantkey(SetContractTenantkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setContractTenantkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
     * Summary: 用户密钥设置接口</p>
     */
    public SetContractTenantkeyResponse setContractTenantkeyEx(SetContractTenantkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.tenantkey.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetContractTenantkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取加密文件上传链接
     * Summary: 获取加密文件上传链接</p>
     */
    public GetContractEncryptedfileuploadurlResponse getContractEncryptedfileuploadurl(GetContractEncryptedfileuploadurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractEncryptedfileuploadurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取加密文件上传链接
     * Summary: 获取加密文件上传链接</p>
     */
    public GetContractEncryptedfileuploadurlResponse getContractEncryptedfileuploadurlEx(GetContractEncryptedfileuploadurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.encryptedfileuploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractEncryptedfileuploadurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建异步任务
     * Summary: 创建任务接口</p>
     */
    public CreateContractTaskResponse createContractTask(CreateContractTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建异步任务
     * Summary: 创建任务接口</p>
     */
    public CreateContractTaskResponse createContractTaskEx(CreateContractTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.task.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 任务查询接口
     * Summary: 任务查询</p>
     */
    public QueryContractTaskResponse queryContractTask(QueryContractTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractTaskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 任务查询接口
     * Summary: 任务查询</p>
     */
    public QueryContractTaskResponse queryContractTaskEx(QueryContractTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.task.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
     * Summary: 合同代扣触发接口</p>
     */
    public ExecContractPayResponse execContractPay(ExecContractPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.execContractPayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
     * Summary: 合同代扣触发接口</p>
     */
    public ExecContractPayResponse execContractPayEx(ExecContractPayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.pay.exec", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExecContractPayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
     * Summary: 代扣强制解约</p>
     */
    public UnbindContractPayResponse unbindContractPay(UnbindContractPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindContractPayEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
     * Summary: 代扣强制解约</p>
     */
    public UnbindContractPayResponse unbindContractPayEx(UnbindContractPayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.pay.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindContractPayResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
     * Summary: 投诉数据查询</p>
     */
    public QueryContractComplainResponse queryContractComplain(QueryContractComplainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractComplainEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
     * Summary: 投诉数据查询</p>
     */
    public QueryContractComplainResponse queryContractComplainEx(QueryContractComplainRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.complain.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractComplainResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
     * Summary: 投诉反馈</p>
     */
    public SendContractComplainfeedbackResponse sendContractComplainfeedback(SendContractComplainfeedbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendContractComplainfeedbackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
     * Summary: 投诉反馈</p>
     */
    public SendContractComplainfeedbackResponse sendContractComplainfeedbackEx(SendContractComplainfeedbackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.complainfeedback.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendContractComplainfeedbackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户上传处理图片
     * Summary: 商户上传处理图片</p>
     */
    public UploadContractComplainimageResponse uploadContractComplainimage(UploadContractComplainimageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadContractComplainimageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 商户上传处理图片
     * Summary: 商户上传处理图片</p>
     */
    public UploadContractComplainimageResponse uploadContractComplainimageEx(UploadContractComplainimageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.complainimage.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadContractComplainimageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据起止日期查询体验宝投诉工单
     * Summary: 根据起止日期查询体验宝投诉工单</p>
     */
    public QueryContractComplaineventidsResponse queryContractComplaineventids(QueryContractComplaineventidsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractComplaineventidsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据起止日期查询体验宝投诉工单
     * Summary: 根据起止日期查询体验宝投诉工单</p>
     */
    public QueryContractComplaineventidsResponse queryContractComplaineventidsEx(QueryContractComplaineventidsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.complaineventids.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractComplaineventidsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 对ato等系统提供区块链合同签署流程撤销能力
     * Summary: 区块链合同签署流程撤销</p>
     */
    public CancelContractFlowResponse cancelContractFlow(CancelContractFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelContractFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 对ato等系统提供区块链合同签署流程撤销能力
     * Summary: 区块链合同签署流程撤销</p>
     */
    public CancelContractFlowResponse cancelContractFlowEx(CancelContractFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelContractFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 转化短链接
     * Summary: 转化短链接</p>
     */
    public TransferGeneralShortenurlResponse transferGeneralShortenurl(TransferGeneralShortenurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferGeneralShortenurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 转化短链接
     * Summary: 转化短链接</p>
     */
    public TransferGeneralShortenurlResponse transferGeneralShortenurlEx(TransferGeneralShortenurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.general.shortenurl.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferGeneralShortenurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 触发合同提交归档
     * Summary: 合同提交归档</p>
     */
    public SubmitContractArchiveResponse submitContractArchive(SubmitContractArchiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitContractArchiveEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 触发合同提交归档
     * Summary: 合同提交归档</p>
     */
    public SubmitContractArchiveResponse submitContractArchiveEx(SubmitContractArchiveRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.archive.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitContractArchiveResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 区块链合同代扣订单列表
     * Summary: 代扣订单列表</p>
     */
    public ListContractDeductorderResponse listContractDeductorder(ListContractDeductorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listContractDeductorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 区块链合同代扣订单列表
     * Summary: 代扣订单列表</p>
     */
    public ListContractDeductorderResponse listContractDeductorderEx(ListContractDeductorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.deductorder.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListContractDeductorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣订单详情
     * Summary: 代扣订单详情</p>
     */
    public QueryContractDeductdetailResponse queryContractDeductdetail(QueryContractDeductdetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractDeductdetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 代扣订单详情
     * Summary: 代扣订单详情</p>
     */
    public QueryContractDeductdetailResponse queryContractDeductdetailEx(QueryContractDeductdetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.deductdetail.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractDeductdetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据支付宝商家订单号查询交易单
     * Summary: 根据交易号查询订单</p>
     */
    public QueryContractDedcutpayinfoResponse queryContractDedcutpayinfo(QueryContractDedcutpayinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractDedcutpayinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据支付宝商家订单号查询交易单
     * Summary: 根据交易号查询订单</p>
     */
    public QueryContractDedcutpayinfoResponse queryContractDedcutpayinfoEx(QueryContractDedcutpayinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.dedcutpayinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractDedcutpayinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 72h代扣解约代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
     * Summary: 72h代扣解约-twc解约</p>
     */
    public UnbindContractZfbagreementResponse unbindContractZfbagreement(UnbindContractZfbagreementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unbindContractZfbagreementEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 72h代扣解约代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
     * Summary: 72h代扣解约-twc解约</p>
     */
    public UnbindContractZfbagreementResponse unbindContractZfbagreementEx(UnbindContractZfbagreementRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.zfbagreement.unbind", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UnbindContractZfbagreementResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 完成手动签署流程
     * Summary: 完成手动签署流程</p>
     */
    public FinishContractFlowResponse finishContractFlow(FinishContractFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishContractFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 完成手动签署流程
     * Summary: 完成手动签署流程</p>
     */
    public FinishContractFlowResponse finishContractFlowEx(FinishContractFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.flow.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishContractFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户使用mp4内容，集成方通过该openAPI进行使用上报。
     * Summary: 集成方通过该接口进行使用mp4上报</p>
     */
    public PushDigitalcontentUsageResponse pushDigitalcontentUsage(PushDigitalcontentUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDigitalcontentUsageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户使用mp4内容，集成方通过该openAPI进行使用上报。
     * Summary: 集成方通过该接口进行使用mp4上报</p>
     */
    public PushDigitalcontentUsageResponse pushDigitalcontentUsageEx(PushDigitalcontentUsageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.digitalcontent.usage.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushDigitalcontentUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户使用apk内容，集成方通过该openAPI申请该使用的订单id。
     * Summary: 集成方通过该接口申请apk订单id</p>
     */
    public ApplyDigitalcontentOrderResponse applyDigitalcontentOrder(ApplyDigitalcontentOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyDigitalcontentOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户使用apk内容，集成方通过该openAPI申请该使用的订单id。
     * Summary: 集成方通过该接口申请apk订单id</p>
     */
    public ApplyDigitalcontentOrderResponse applyDigitalcontentOrderEx(ApplyDigitalcontentOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.digitalcontent.order.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyDigitalcontentOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户使用apk内容支付后，集成方通过订单id和支付id反馈支付结果，并申请交互token。
     * Summary: 集成方反馈apk订单支付结果</p>
     */
    public SubmitDigitalcontentOrderResponse submitDigitalcontentOrder(SubmitDigitalcontentOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitDigitalcontentOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户使用apk内容支付后，集成方通过订单id和支付id反馈支付结果，并申请交互token。
     * Summary: 集成方反馈apk订单支付结果</p>
     */
    public SubmitDigitalcontentOrderResponse submitDigitalcontentOrderEx(SubmitDigitalcontentOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.digitalcontent.order.submit", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SubmitDigitalcontentOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
     * Summary: 向notarycore同步事务数据</p>
     */
    public SyncInnerTransResponse syncInnerTrans(SyncInnerTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerTransEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
     * Summary: 向notarycore同步事务数据</p>
     */
    public SyncInnerTransResponse syncInnerTransEx(SyncInnerTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.trans.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerTransResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 从baas-notary向notarycore同步存证数据
     * Summary: 向notarycore同步存证数据</p>
     */
    public SyncInnerNotaryResponse syncInnerNotary(SyncInnerNotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerNotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 从baas-notary向notarycore同步存证数据
     * Summary: 向notarycore同步存证数据</p>
     */
    public SyncInnerNotaryResponse syncInnerNotaryEx(SyncInnerNotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.notary.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerNotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 从baas-notary向notarycore同步自租户信息
     * Summary: 向notarycore同步子租户数据</p>
     */
    public SyncInnerTwcopenResponse syncInnerTwcopen(SyncInnerTwcopenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerTwcopenEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 从baas-notary向notarycore同步自租户信息
     * Summary: 向notarycore同步子租户数据</p>
     */
    public SyncInnerTwcopenResponse syncInnerTwcopenEx(SyncInnerTwcopenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.twcopen.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerTwcopenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 从baas-notary向notarycore同步租户权限数据
     * Summary: 向notarycore同步租户数据</p>
     */
    public SyncInnerProvisionResponse syncInnerProvision(SyncInnerProvisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerProvisionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 从baas-notary向notarycore同步租户权限数据
     * Summary: 向notarycore同步租户数据</p>
     */
    public SyncInnerProvisionResponse syncInnerProvisionEx(SyncInnerProvisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.provision.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerProvisionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 从baas-notary向notarycore同步tsr数据
     * Summary: 向notarycore同步tsr数据</p>
     */
    public SyncInnerTsrResponse syncInnerTsr(SyncInnerTsrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncInnerTsrEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 从baas-notary向notarycore同步tsr数据
     * Summary: 向notarycore同步tsr数据</p>
     */
    public SyncInnerTsrResponse syncInnerTsrEx(SyncInnerTsrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.tsr.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncInnerTsrResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 转化短链接(废弃)
     * Summary: 转化短链接(废弃)</p>
     */
    public TransferInnerShorturlResponse transferInnerShorturl(TransferInnerShorturlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.transferInnerShorturlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 转化短链接(废弃)
     * Summary: 转化短链接(废弃)</p>
     */
    public TransferInnerShorturlResponse transferInnerShorturlEx(TransferInnerShorturlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.shorturl.transfer", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new TransferInnerShorturlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 宠物比对能力图片资源合格性校验
     * Summary: 宠物合格性校验</p>
     */
    public VerifyLeasePetrecognitionResponse verifyLeasePetrecognition(VerifyLeasePetrecognitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyLeasePetrecognitionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 宠物比对能力图片资源合格性校验
     * Summary: 宠物合格性校验</p>
     */
    public VerifyLeasePetrecognitionResponse verifyLeasePetrecognitionEx(VerifyLeasePetrecognitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.petrecognition.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyLeasePetrecognitionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 宠物比对能力建档注册功能
     * Summary: 宠物建档注册</p>
     */
    public RegisterLeasePetrecognitionResponse registerLeasePetrecognition(RegisterLeasePetrecognitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerLeasePetrecognitionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 宠物比对能力建档注册功能
     * Summary: 宠物建档注册</p>
     */
    public RegisterLeasePetrecognitionResponse registerLeasePetrecognitionEx(RegisterLeasePetrecognitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.petrecognition.register", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RegisterLeasePetrecognitionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 宠物比对能力建档比对
     * Summary: 宠物建档比对</p>
     */
    public OperateLeasePetcomparepetidResponse operateLeasePetcomparepetid(OperateLeasePetcomparepetidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateLeasePetcomparepetidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 宠物比对能力建档比对
     * Summary: 宠物建档比对</p>
     */
    public OperateLeasePetcomparepetidResponse operateLeasePetcomparepetidEx(OperateLeasePetcomparepetidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.petcomparepetid.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateLeasePetcomparepetidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 宠物比对能力图片资源直接比对
     * Summary: 宠物资源直接比对</p>
     */
    public OperateLeasePetcomparepetsResponse operateLeasePetcomparepets(OperateLeasePetcomparepetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateLeasePetcomparepetsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 宠物比对能力图片资源直接比对
     * Summary: 宠物资源直接比对</p>
     */
    public OperateLeasePetcomparepetsResponse operateLeasePetcomparepetsEx(OperateLeasePetcomparepetsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.petcomparepets.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateLeasePetcomparepetsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务电子签发起签署
     * Summary: 法务电子签发起签署</p>
     */
    public ApplyInnerAntesignResponse applyInnerAntesign(ApplyInnerAntesignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyInnerAntesignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务电子签发起签署
     * Summary: 法务电子签发起签署</p>
     */
    public ApplyInnerAntesignResponse applyInnerAntesignEx(ApplyInnerAntesignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.antesign.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyInnerAntesignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务电子签查询签署状态
     * Summary: 法务电子签查询签署状态</p>
     */
    public QueryInnerAntesignResponse queryInnerAntesign(QueryInnerAntesignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInnerAntesignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务电子签查询签署状态
     * Summary: 法务电子签查询签署状态</p>
     */
    public QueryInnerAntesignResponse queryInnerAntesignEx(QueryInnerAntesignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.antesign.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInnerAntesignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务电子签根据公司名称统代生成印章
     * Summary: 法务电子签根据公司名称统代生成印章</p>
     */
    public CreateInnerAntesignResponse createInnerAntesign(CreateInnerAntesignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInnerAntesignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 法务电子签根据公司名称统代生成印章
     * Summary: 法务电子签根据公司名称统代生成印章</p>
     */
    public CreateInnerAntesignResponse createInnerAntesignEx(CreateInnerAntesignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.inner.antesign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInnerAntesignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 输入企业名+证件号，发起企业二要素认证请求。
     * Summary: 企业二要素认证</p>
     */
    public CheckEpidentityTwometaResponse checkEpidentityTwometa(CheckEpidentityTwometaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkEpidentityTwometaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 输入企业名+证件号，发起企业二要素认证请求。
     * Summary: 企业二要素认证</p>
     */
    public CheckEpidentityTwometaResponse checkEpidentityTwometaEx(CheckEpidentityTwometaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.epidentity.twometa.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckEpidentityTwometaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
     * Summary: 企业三要素认证</p>
     */
    public CheckEpidentityThreemetaResponse checkEpidentityThreemeta(CheckEpidentityThreemetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkEpidentityThreemetaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
     * Summary: 企业三要素认证</p>
     */
    public CheckEpidentityThreemetaResponse checkEpidentityThreemetaEx(CheckEpidentityThreemetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.epidentity.threemeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckEpidentityThreemetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
     * Summary: 企业四要素认证</p>
     */
    public CheckEpidentityFourmetaResponse checkEpidentityFourmeta(CheckEpidentityFourmetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkEpidentityFourmetaEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
     * Summary: 企业四要素认证</p>
     */
    public CheckEpidentityFourmetaResponse checkEpidentityFourmetaEx(CheckEpidentityFourmetaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.epidentity.fourmeta.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckEpidentityFourmetaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询公证订单的有效性
     * Summary: 查询公证订单的有效性</p>
     */
    public CheckNotarizationOrderResponse checkNotarizationOrder(CheckNotarizationOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkNotarizationOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询公证订单的有效性
     * Summary: 查询公证订单的有效性</p>
     */
    public CheckNotarizationOrderResponse checkNotarizationOrderEx(CheckNotarizationOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.notarization.order.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckNotarizationOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新公证订单状态
     * Summary: 更新公证订单状态</p>
     */
    public UpdateNotarizationOrderResponse updateNotarizationOrder(UpdateNotarizationOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateNotarizationOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 更新公证订单状态
     * Summary: 更新公证订单状态</p>
     */
    public UpdateNotarizationOrderResponse updateNotarizationOrderEx(UpdateNotarizationOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.notarization.order.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateNotarizationOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 设置订单属性
     * Summary: 设置订单属性</p>
     */
    public SetNotarizationOrderResponse setNotarizationOrder(SetNotarizationOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setNotarizationOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 设置订单属性
     * Summary: 设置订单属性</p>
     */
    public SetNotarizationOrderResponse setNotarizationOrderEx(SetNotarizationOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.notarization.order.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetNotarizationOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 实人认证初始化
     * Summary: 实人认证初始化</p>
     */
    public InitIdentificationFaceauthResponse initIdentificationFaceauth(InitIdentificationFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 实人认证初始化
     * Summary: 实人认证初始化</p>
     */
    public InitIdentificationFaceauthResponse initIdentificationFaceauthEx(InitIdentificationFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitIdentificationFaceauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起实人认证
     * Summary: 发起实人认证</p>
     */
    public CertifyIdentificationFaceauthResponse certifyIdentificationFaceauth(CertifyIdentificationFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起实人认证
     * Summary: 发起实人认证</p>
     */
    public CertifyIdentificationFaceauthResponse certifyIdentificationFaceauthEx(CertifyIdentificationFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.faceauth.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyIdentificationFaceauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询实人认证结果
     * Summary: 查询实人认证结果</p>
     */
    public QueryIdentificationFaceauthResponse queryIdentificationFaceauth(QueryIdentificationFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationFaceauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询实人认证结果
     * Summary: 查询实人认证结果</p>
     */
    public QueryIdentificationFaceauthResponse queryIdentificationFaceauthEx(QueryIdentificationFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationFaceauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业法人认证查询结果接口
     * Summary: 企业法人认证查询</p>
     */
    public QueryEnterpriseFaceauthResponse queryEnterpriseFaceauth(QueryEnterpriseFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryEnterpriseFaceauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业法人认证查询结果接口
     * Summary: 企业法人认证查询</p>
     */
    public QueryEnterpriseFaceauthResponse queryEnterpriseFaceauthEx(QueryEnterpriseFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.enterprise.faceauth.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryEnterpriseFaceauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业法人认证初始化接口
     * Summary: 企业法人认证初始化</p>
     */
    public InitEnterpriseFaceauthResponse initEnterpriseFaceauth(InitEnterpriseFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initEnterpriseFaceauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业法人认证初始化接口
     * Summary: 企业法人认证初始化</p>
     */
    public InitEnterpriseFaceauthResponse initEnterpriseFaceauthEx(InitEnterpriseFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.enterprise.faceauth.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitEnterpriseFaceauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业法人认证开始接口
     * Summary: 企业法人认证开始</p>
     */
    public CertifyEnterpriseFaceauthResponse certifyEnterpriseFaceauth(CertifyEnterpriseFaceauthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.certifyEnterpriseFaceauthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 企业法人认证开始接口
     * Summary: 企业法人认证开始</p>
     */
    public CertifyEnterpriseFaceauthResponse certifyEnterpriseFaceauthEx(CertifyEnterpriseFaceauthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.enterprise.faceauth.certify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CertifyEnterpriseFaceauthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建租赁订单
     * Summary: 租赁订单创建</p>
     */
    public CreateLeaseOrderResponse createLeaseOrder(CreateLeaseOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建租赁订单
     * Summary: 租赁订单创建</p>
     */
    public CreateLeaseOrderResponse createLeaseOrderEx(CreateLeaseOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
     * Summary: 公证场景创建收费订单</p>
     */
    public CreateNotarizationBillResponse createNotarizationBill(CreateNotarizationBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createNotarizationBillEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
     * Summary: 公证场景创建收费订单</p>
     */
    public CreateNotarizationBillResponse createNotarizationBillEx(CreateNotarizationBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.notarization.bill.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateNotarizationBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
     * Summary: 初始化存证证明订单</p>
     */
    public InitCertificationResponse initCertification(InitCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initCertificationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
     * Summary: 初始化存证证明订单</p>
     */
    public InitCertificationResponse initCertificationEx(InitCertificationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.certification.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitCertificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
     * Summary: 查询存证证明申请状态</p>
     */
    public QueryCertificationResponse queryCertification(QueryCertificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCertificationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
     * Summary: 查询存证证明申请状态</p>
     */
    public QueryCertificationResponse queryCertificationEx(QueryCertificationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.certification.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryCertificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
     * Summary: 可信时间凭证服务 - 获取时间凭证证书</p>
     */
    public GetTsrCertificateResponse getTsrCertificate(GetTsrCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTsrCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
     * Summary: 可信时间凭证服务 - 获取时间凭证证书</p>
     */
    public GetTsrCertificateResponse getTsrCertificateEx(GetTsrCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.tsr.certificate.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTsrCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起实人认证，这是改造后的接口
     * Summary: 实人认证创建</p>
     */
    public CreateIdentificationRealpersonResponse createIdentificationRealperson(CreateIdentificationRealpersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createIdentificationRealpersonEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起实人认证，这是改造后的接口
     * Summary: 实人认证创建</p>
     */
    public CreateIdentificationRealpersonResponse createIdentificationRealpersonEx(CreateIdentificationRealpersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.realperson.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateIdentificationRealpersonResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询实人认证结果
     * Summary: 查询实人认证结果</p>
     */
    public QueryIdentificationRealpersonResponse queryIdentificationRealperson(QueryIdentificationRealpersonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryIdentificationRealpersonEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询实人认证结果
     * Summary: 查询实人认证结果</p>
     */
    public QueryIdentificationRealpersonResponse queryIdentificationRealpersonEx(QueryIdentificationRealpersonRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.identification.realperson.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryIdentificationRealpersonResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
     * Summary: 联合执行履行记录新增/修改接口</p>
     */
    public SaveJointconstraintRecordResponse saveJointconstraintRecord(SaveJointconstraintRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveJointconstraintRecordEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
     * Summary: 联合执行履行记录新增/修改接口</p>
     */
    public SaveJointconstraintRecordResponse saveJointconstraintRecordEx(SaveJointconstraintRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.jointconstraint.record.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveJointconstraintRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除履行记录
     * Summary: 履行记录删除接口</p>
     */
    public DeleteJointconstraintRecordResponse deleteJointconstraintRecord(DeleteJointconstraintRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteJointconstraintRecordEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 删除履行记录
     * Summary: 履行记录删除接口</p>
     */
    public DeleteJointconstraintRecordResponse deleteJointconstraintRecordEx(DeleteJointconstraintRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.jointconstraint.record.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteJointconstraintRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询违约记录
     * Summary: 违约记录查询接口</p>
     */
    public QueryJointconstraintBreachrecordResponse queryJointconstraintBreachrecord(QueryJointconstraintBreachrecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJointconstraintBreachrecordEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询违约记录
     * Summary: 违约记录查询接口</p>
     */
    public QueryJointconstraintBreachrecordResponse queryJointconstraintBreachrecordEx(QueryJointconstraintBreachrecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.jointconstraint.breachrecord.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJointconstraintBreachrecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供给第三方调解申请提交
     * Summary: 调解申请</p>
     */
    public ApplyJusticeMediationResponse applyJusticeMediation(ApplyJusticeMediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyJusticeMediationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 提供给第三方调解申请提交
     * Summary: 调解申请</p>
     */
    public ApplyJusticeMediationResponse applyJusticeMediationEx(ApplyJusticeMediationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.mediation.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyJusticeMediationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 调解申请进度查询
     * Summary: 调解申请进度查询</p>
     */
    public QueryJusticeMediationResponse queryJusticeMediation(QueryJusticeMediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeMediationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 调解申请进度查询
     * Summary: 调解申请进度查询</p>
     */
    public QueryJusticeMediationResponse queryJusticeMediationEx(QueryJusticeMediationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.mediation.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeMediationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 汇裁证据要素查询接口
     * Summary: 汇裁证据要素查询接口</p>
     */
    public QueryJusticeCaseinfoResponse queryJusticeCaseinfo(QueryJusticeCaseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeCaseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 汇裁证据要素查询接口
     * Summary: 汇裁证据要素查询接口</p>
     */
    public QueryJusticeCaseinfoResponse queryJusticeCaseinfoEx(QueryJusticeCaseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.caseinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeCaseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
     * Summary: 获取OSS文件上传路径</p>
     */
    public GetJusticeUploadfilepathResponse getJusticeUploadfilepath(GetJusticeUploadfilepathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJusticeUploadfilepathEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
     * Summary: 获取OSS文件上传路径</p>
     */
    public GetJusticeUploadfilepathResponse getJusticeUploadfilepathEx(GetJusticeUploadfilepathRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.uploadfilepath.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetJusticeUploadfilepathResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
     * Summary: 自动进件案件回写</p>
     */
    public CreateJusticeCasewritebackResponse createJusticeCasewriteback(CreateJusticeCasewritebackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeCasewritebackEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
     * Summary: 自动进件案件回写</p>
     */
    public CreateJusticeCasewritebackResponse createJusticeCasewritebackEx(CreateJusticeCasewritebackRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.casewriteback.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeCasewritebackResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件基础信息查询
     * Summary: 案件基础信息查询</p>
     */
    public QueryJusticeBasecaseResponse queryJusticeBasecase(QueryJusticeBasecaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeBasecaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件基础信息查询
     * Summary: 案件基础信息查询</p>
     */
    public QueryJusticeBasecaseResponse queryJusticeBasecaseEx(QueryJusticeBasecaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.basecase.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeBasecaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件材料下载
     * Summary: 案件材料下载</p>
     */
    public DownloadJusticeCasefileResponse downloadJusticeCasefile(DownloadJusticeCasefileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downloadJusticeCasefileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件材料下载
     * Summary: 案件材料下载</p>
     */
    public DownloadJusticeCasefileResponse downloadJusticeCasefileEx(DownloadJusticeCasefileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.casefile.download", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DownloadJusticeCasefileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 开通纠纷平台使用权限
     * Summary: 开通纠纷平台使用权限</p>
     */
    public OpenInternalJudicialResponse openInternalJudicial(OpenInternalJudicialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openInternalJudicialEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 开通纠纷平台使用权限
     * Summary: 开通纠纷平台使用权限</p>
     */
    public OpenInternalJudicialResponse openInternalJudicialEx(OpenInternalJudicialRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.judicial.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenInternalJudicialResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件当事人信息保存
     * Summary: 案件当事人信息保存</p>
     */
    public SaveJusticePartyResponse saveJusticeParty(SaveJusticePartyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveJusticePartyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件当事人信息保存
     * Summary: 案件当事人信息保存</p>
     */
    public SaveJusticePartyResponse saveJusticePartyEx(SaveJusticePartyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.party.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveJusticePartyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 普通案件创建
     * Summary: 普通案件创建</p>
     */
    public CreateJusticeNormalcaseResponse createJusticeNormalcase(CreateJusticeNormalcaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeNormalcaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 普通案件创建
     * Summary: 普通案件创建</p>
     */
    public CreateJusticeNormalcaseResponse createJusticeNormalcaseEx(CreateJusticeNormalcaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.normalcase.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeNormalcaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 链上案件创建
     * Summary: 链上案件创建</p>
     */
    public CreateJusticeChaincaseResponse createJusticeChaincase(CreateJusticeChaincaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeChaincaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 链上案件创建
     * Summary: 链上案件创建</p>
     */
    public CreateJusticeChaincaseResponse createJusticeChaincaseEx(CreateJusticeChaincaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.chaincase.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeChaincaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件维权发起
     * Summary: 案件维权发起</p>
     */
    public StartJusticeCaseResponse startJusticeCase(StartJusticeCaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startJusticeCaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件维权发起
     * Summary: 案件维权发起</p>
     */
    public StartJusticeCaseResponse startJusticeCaseEx(StartJusticeCaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.case.start", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StartJusticeCaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件查询
     * Summary: 案件查询</p>
     */
    public QueryJusticeCaseResponse queryJusticeCase(QueryJusticeCaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeCaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件查询
     * Summary: 案件查询</p>
     */
    public QueryJusticeCaseResponse queryJusticeCaseEx(QueryJusticeCaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.case.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeCaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件事件响应
     * Summary: 案件事件响应</p>
     */
    public OperateJusticeEventResponse operateJusticeEvent(OperateJusticeEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.operateJusticeEventEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 案件事件响应
     * Summary: 案件事件响应</p>
     */
    public OperateJusticeEventResponse operateJusticeEventEx(OperateJusticeEventRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.event.operate", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OperateJusticeEventResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 司法解纷平台API服务，创建案件要素模板接口
     * Summary: 创建案件要素模板</p>
     */
    public CreateJusticeCasetemplateResponse createJusticeCasetemplate(CreateJusticeCasetemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeCasetemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 司法解纷平台API服务，创建案件要素模板接口
     * Summary: 创建案件要素模板</p>
     */
    public CreateJusticeCasetemplateResponse createJusticeCasetemplateEx(CreateJusticeCasetemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.casetemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeCasetemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 司法解纷平台API服务，创建维权要素模板接口
     * Summary: 创建维权要素模板</p>
     */
    public CreateJusticeRightprotecttemplateResponse createJusticeRightprotecttemplate(CreateJusticeRightprotecttemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeRightprotecttemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 司法解纷平台API服务，创建维权要素模板接口
     * Summary: 创建维权要素模板</p>
     */
    public CreateJusticeRightprotecttemplateResponse createJusticeRightprotecttemplateEx(CreateJusticeRightprotecttemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.rightprotecttemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeRightprotecttemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取司法文件上传链接
     * Summary: 获取司法文件上传链接</p>
     */
    public GetJusticeFileuploadurlResponse getJusticeFileuploadurl(GetJusticeFileuploadurlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getJusticeFileuploadurlEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取司法文件上传链接
     * Summary: 获取司法文件上传链接</p>
     */
    public GetJusticeFileuploadurlResponse getJusticeFileuploadurlEx(GetJusticeFileuploadurlRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetJusticeFileuploadurlResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 司法解纷平台API服务，创建文书要素模板接口
     * Summary: 创建文书要素模板</p>
     */
    public CreateJusticeDocumenttemplateResponse createJusticeDocumenttemplate(CreateJusticeDocumenttemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeDocumenttemplateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 司法解纷平台API服务，创建文书要素模板接口
     * Summary: 创建文书要素模板</p>
     */
    public CreateJusticeDocumenttemplateResponse createJusticeDocumenttemplateEx(CreateJusticeDocumenttemplateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.documenttemplate.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeDocumenttemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 仲裁-通用版本进件要素信息查询
     * Summary: 仲裁-通用版本进件要素信息查询</p>
     */
    public QueryJusticeCommoncaseinfoResponse queryJusticeCommoncaseinfo(QueryJusticeCommoncaseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeCommoncaseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 仲裁-通用版本进件要素信息查询
     * Summary: 仲裁-通用版本进件要素信息查询</p>
     */
    public QueryJusticeCommoncaseinfoResponse queryJusticeCommoncaseinfoEx(QueryJusticeCommoncaseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.commoncaseinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeCommoncaseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 1级商户为2级商户进件
     * Summary: 代理二级商户进件</p>
     */
    public CreateJusticeAgentcaseResponse createJusticeAgentcase(CreateJusticeAgentcaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createJusticeAgentcaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 1级商户为2级商户进件
     * Summary: 代理二级商户进件</p>
     */
    public CreateJusticeAgentcaseResponse createJusticeAgentcaseEx(CreateJusticeAgentcaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.agentcase.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateJusticeAgentcaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: isv机构-案件要素查询
     * Summary: isv机构-案件要素查询</p>
     */
    public QueryJusticeRightsResponse queryJusticeRights(QueryJusticeRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryJusticeRightsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: isv机构-案件要素查询
     * Summary: isv机构-案件要素查询</p>
     */
    public QueryJusticeRightsResponse queryJusticeRightsEx(QueryJusticeRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.rights.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryJusticeRightsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: isv机构-维权状态更新
     * Summary: isv机构-维权状态更新</p>
     */
    public UpdateJusticeRightsResponse updateJusticeRights(UpdateJusticeRightsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateJusticeRightsEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: isv机构-维权状态更新
     * Summary: isv机构-维权状态更新</p>
     */
    public UpdateJusticeRightsResponse updateJusticeRightsEx(UpdateJusticeRightsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.rights.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateJusticeRightsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: isv机构-案件缴费通知接口
     * Summary: isv机构-案件缴费通知接口</p>
     */
    public NotifyJusticeRightspaymentResponse notifyJusticeRightspayment(NotifyJusticeRightspaymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.notifyJusticeRightspaymentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: isv机构-案件缴费通知接口
     * Summary: isv机构-案件缴费通知接口</p>
     */
    public NotifyJusticeRightspaymentResponse notifyJusticeRightspaymentEx(NotifyJusticeRightspaymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.justice.rightspayment.notify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new NotifyJusticeRightspaymentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资服务平台上传商品类别信息
     * Summary: 融资服务平台上传商品类别信息</p>
     */
    public CreateLeaseProductinfoResponse createLeaseProductinfo(CreateLeaseProductinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseProductinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资服务平台上传商品类别信息
     * Summary: 融资服务平台上传商品类别信息</p>
     */
    public CreateLeaseProductinfoResponse createLeaseProductinfoEx(CreateLeaseProductinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.productinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseProductinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 升级融资租赁合约
     * Summary: 升级融资租赁合约</p>
     */
    public UpdateLeaseContractResponse updateLeaseContract(UpdateLeaseContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateLeaseContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 升级融资租赁合约
     * Summary: 升级融资租赁合约</p>
     */
    public UpdateLeaseContractResponse updateLeaseContractEx(UpdateLeaseContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.contract.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateLeaseContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台isv模式代理商户入驻
     * Summary: 租赁平台isv模式代理商户入驻</p>
     */
    public CreateLeaseAssetagentregisterResponse createLeaseAssetagentregister(CreateLeaseAssetagentregisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAssetagentregisterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台isv模式代理商户入驻
     * Summary: 租赁平台isv模式代理商户入驻</p>
     */
    public CreateLeaseAssetagentregisterResponse createLeaseAssetagentregisterEx(CreateLeaseAssetagentregisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.assetagentregister.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAssetagentregisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁商品信息查询接口
     * Summary: 融资租赁商品信息查询接口</p>
     */
    public QueryLeaseProductinfoResponse queryLeaseProductinfo(QueryLeaseProductinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseProductinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁商品信息查询接口
     * Summary: 融资租赁商品信息查询接口</p>
     */
    public QueryLeaseProductinfoResponse queryLeaseProductinfoEx(QueryLeaseProductinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.productinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseProductinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步采购平台订单状态
     * Summary: 同步采购平台订单状态</p>
     */
    public SyncLeaseSupplierorderstatusResponse syncLeaseSupplierorderstatus(SyncLeaseSupplierorderstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncLeaseSupplierorderstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 同步采购平台订单状态
     * Summary: 同步采购平台订单状态</p>
     */
    public SyncLeaseSupplierorderstatusResponse syncLeaseSupplierorderstatusEx(SyncLeaseSupplierorderstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierorderstatus.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncLeaseSupplierorderstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 采购供应商初始化 
     * Summary: 采购供应商初始化 </p>
     */
    public InitLeaseSupplierResponse initLeaseSupplier(InitLeaseSupplierRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initLeaseSupplierEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 采购供应商初始化 
     * Summary: 采购供应商初始化 </p>
     */
    public InitLeaseSupplierResponse initLeaseSupplierEx(InitLeaseSupplierRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplier.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitLeaseSupplierResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
     * Summary: 租赁订单接收采购状态信息，完成采购流程</p>
     */
    public FinishLeaseSupplierstatusResponse finishLeaseSupplierstatus(FinishLeaseSupplierstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishLeaseSupplierstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
     * Summary: 租赁订单接收采购状态信息，完成采购流程</p>
     */
    public FinishLeaseSupplierstatusResponse finishLeaseSupplierstatusEx(FinishLeaseSupplierstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierstatus.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishLeaseSupplierstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 采购商品初始化 
     * Summary: 采购商品初始化 </p>
     */
    public CreateLeaseSupplierproductResponse createLeaseSupplierproduct(CreateLeaseSupplierproductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseSupplierproductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 采购商品初始化 
     * Summary: 采购商品初始化 </p>
     */
    public CreateLeaseSupplierproductResponse createLeaseSupplierproductEx(CreateLeaseSupplierproductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierproduct.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseSupplierproductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 链上采购申请
     * Summary: 链上采购申请</p>
     */
    public ApplyLeaseSupplierorderResponse applyLeaseSupplierorder(ApplyLeaseSupplierorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyLeaseSupplierorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 链上采购申请
     * Summary: 链上采购申请</p>
     */
    public ApplyLeaseSupplierorderResponse applyLeaseSupplierorderEx(ApplyLeaseSupplierorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierorder.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyLeaseSupplierorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建融资租赁提前还款人脸认证信息
     * Summary: 创建融资租赁提前还款人脸认证信息</p>
     */
    public CreateLeaseFinancecertifyResponse createLeaseFinancecertify(CreateLeaseFinancecertifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseFinancecertifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建融资租赁提前还款人脸认证信息
     * Summary: 创建融资租赁提前还款人脸认证信息</p>
     */
    public CreateLeaseFinancecertifyResponse createLeaseFinancecertifyEx(CreateLeaseFinancecertifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.financecertify.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseFinancecertifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁提前还款人脸识别核验
     * Summary: 融资租赁提前还款人脸识别核验</p>
     */
    public QueryLeaseFinancecertifyResponse queryLeaseFinancecertify(QueryLeaseFinancecertifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseFinancecertifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁提前还款人脸识别核验
     * Summary: 融资租赁提前还款人脸识别核验</p>
     */
    public QueryLeaseFinancecertifyResponse queryLeaseFinancecertifyEx(QueryLeaseFinancecertifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.financecertify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseFinancecertifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询融资租赁合约内核验结果
     * Summary: 查询融资租赁合约内核验结果</p>
     */
    public QueryLeaseFinancecertifyincontractResponse queryLeaseFinancecertifyincontract(QueryLeaseFinancecertifyincontractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseFinancecertifyincontractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询融资租赁合约内核验结果
     * Summary: 查询融资租赁合约内核验结果</p>
     */
    public QueryLeaseFinancecertifyincontractResponse queryLeaseFinancecertifyincontractEx(QueryLeaseFinancecertifyincontractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.financecertifyincontract.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseFinancecertifyincontractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁用户信息查询
     * Summary: 融资租赁用户信息查询</p>
     */
    public QueryLeaseUserResponse queryLeaseUser(QueryLeaseUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseUserEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁用户信息查询
     * Summary: 融资租赁用户信息查询</p>
     */
    public QueryLeaseUserResponse queryLeaseUserEx(QueryLeaseUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.user.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁订单详情查询
     * Summary: 融资租赁订单详情查询</p>
     */
    public QueryLeaseOrderdetailinfoResponse queryLeaseOrderdetailinfo(QueryLeaseOrderdetailinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseOrderdetailinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁订单详情查询
     * Summary: 融资租赁订单详情查询</p>
     */
    public QueryLeaseOrderdetailinfoResponse queryLeaseOrderdetailinfoEx(QueryLeaseOrderdetailinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderdetailinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseOrderdetailinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁租赁机构承诺查询
     * Summary: 融资租赁租赁机构承诺查询</p>
     */
    public QueryLeaseLeasepromiseResponse queryLeaseLeasepromise(QueryLeaseLeasepromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseLeasepromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁租赁机构承诺查询
     * Summary: 融资租赁租赁机构承诺查询</p>
     */
    public QueryLeaseLeasepromiseResponse queryLeaseLeasepromiseEx(QueryLeaseLeasepromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.leasepromise.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseLeasepromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁资方承诺查询
     * Summary: 融资租赁资方承诺查询</p>
     */
    public QueryLeaseCreditpromiseResponse queryLeaseCreditpromise(QueryLeaseCreditpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseCreditpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁资方承诺查询
     * Summary: 融资租赁资方承诺查询</p>
     */
    public QueryLeaseCreditpromiseResponse queryLeaseCreditpromiseEx(QueryLeaseCreditpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.creditpromise.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseCreditpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁订单清分信息查询
     * Summary: 融资租赁订单清分信息查询</p>
     */
    public QueryLeaseClearingResponse queryLeaseClearing(QueryLeaseClearingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseClearingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁订单清分信息查询
     * Summary: 融资租赁订单清分信息查询</p>
     */
    public QueryLeaseClearingResponse queryLeaseClearingEx(QueryLeaseClearingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.clearing.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseClearingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁用户侧还款信息
     * Summary: 融资租赁用户侧还款信息</p>
     */
    public QueryLeaseRentalinfoResponse queryLeaseRentalinfo(QueryLeaseRentalinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRentalinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁用户侧还款信息
     * Summary: 融资租赁用户侧还款信息</p>
     */
    public QueryLeaseRentalinfoResponse queryLeaseRentalinfoEx(QueryLeaseRentalinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.rentalinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRentalinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁资方还款信息查询
     * Summary: 融资租赁资方还款信息查询</p>
     */
    public QueryLeaseRepaymentResponse queryLeaseRepayment(QueryLeaseRepaymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRepaymentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁资方还款信息查询
     * Summary: 融资租赁资方还款信息查询</p>
     */
    public QueryLeaseRepaymentResponse queryLeaseRepaymentEx(QueryLeaseRepaymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.repayment.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRepaymentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询订单商品信息
     * Summary: 查询订单商品信息</p>
     */
    public QueryLeaseOrderproductResponse queryLeaseOrderproduct(QueryLeaseOrderproductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseOrderproductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询订单商品信息
     * Summary: 查询订单商品信息</p>
     */
    public QueryLeaseOrderproductResponse queryLeaseOrderproductEx(QueryLeaseOrderproductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderproduct.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseOrderproductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁查询资金方信息
     * Summary: 融资租赁查询资金方信息</p>
     */
    public QueryLeaseFinancecreditResponse queryLeaseFinancecredit(QueryLeaseFinancecreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseFinancecreditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁查询资金方信息
     * Summary: 融资租赁查询资金方信息</p>
     */
    public QueryLeaseFinancecreditResponse queryLeaseFinancecreditEx(QueryLeaseFinancecreditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.financecredit.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseFinancecreditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据资产包id分页查询再融资订单id
     * Summary: 分页查询再融资订单id</p>
     */
    public QueryRefinanceOrderidResponse queryRefinanceOrderid(QueryRefinanceOrderidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRefinanceOrderidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据资产包id分页查询再融资订单id
     * Summary: 分页查询再融资订单id</p>
     */
    public QueryRefinanceOrderidResponse queryRefinanceOrderidEx(QueryRefinanceOrderidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.orderid.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRefinanceOrderidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产明细查询
     * Summary: 资产明细</p>
     */
    public QueryRefinanceOrderResponse queryRefinanceOrder(QueryRefinanceOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRefinanceOrderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产明细查询
     * Summary: 资产明细</p>
     */
    public QueryRefinanceOrderResponse queryRefinanceOrderEx(QueryRefinanceOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRefinanceOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 再融资的商品信息查询
     * Summary: 再融资的商品信息查询</p>
     */
    public QueryRefinanceProductResponse queryRefinanceProduct(QueryRefinanceProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRefinanceProductEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 再融资的商品信息查询
     * Summary: 再融资的商品信息查询</p>
     */
    public QueryRefinanceProductResponse queryRefinanceProductEx(QueryRefinanceProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.product.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryRefinanceProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产包的受让/驳回资产包
     * Summary: 资产包的受让/驳回资产包</p>
     */
    public VerifyRefinancePackageResponse verifyRefinancePackage(VerifyRefinancePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.verifyRefinancePackageEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资产包的受让/驳回资产包
     * Summary: 资产包的受让/驳回资产包</p>
     */
    public VerifyRefinancePackageResponse verifyRefinancePackageEx(VerifyRefinancePackageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.package.verify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new VerifyRefinancePackageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁查询清分信息
     * Summary: 融资租赁查询清分信息</p>
     */
    public QueryLeaseOrderclearingResponse queryLeaseOrderclearing(QueryLeaseOrderclearingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseOrderclearingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁查询清分信息
     * Summary: 融资租赁查询清分信息</p>
     */
    public QueryLeaseOrderclearingResponse queryLeaseOrderclearingEx(QueryLeaseOrderclearingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderclearing.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseOrderclearingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁提前还款详情查询
     * Summary: 融资租赁提前还款详情查询</p>
     */
    public QueryLeaseRepaymentstatusResponse queryLeaseRepaymentstatus(QueryLeaseRepaymentstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRepaymentstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁提前还款详情查询
     * Summary: 融资租赁提前还款详情查询</p>
     */
    public QueryLeaseRepaymentstatusResponse queryLeaseRepaymentstatusEx(QueryLeaseRepaymentstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.repaymentstatus.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRepaymentstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 续租过程中，当前资方希望查询用户历史的履约表现
     * Summary: 核验链上用户的履约情况</p>
     */
    public QueryLeaseUserperformanceResponse queryLeaseUserperformance(QueryLeaseUserperformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseUserperformanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 续租过程中，当前资方希望查询用户历史的履约表现
     * Summary: 核验链上用户的履约情况</p>
     */
    public QueryLeaseUserperformanceResponse queryLeaseUserperformanceEx(QueryLeaseUserperformanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.userperformance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseUserperformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 履约流水核验查询
     * Summary: 履约流水核验查询</p>
     */
    public QueryLeaseRentalverifyResponse queryLeaseRentalverify(QueryLeaseRentalverifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseRentalverifyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 履约流水核验查询
     * Summary: 履约流水核验查询</p>
     */
    public QueryLeaseRentalverifyResponse queryLeaseRentalverifyEx(QueryLeaseRentalverifyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.rentalverify.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseRentalverifyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 分期查询用户归还记录 资方还款 清分信息
     * Summary: 分期查询用户归还记录 资方还款 清分信息</p>
     */
    public QueryLeaseInstallmentResponse queryLeaseInstallment(QueryLeaseInstallmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseInstallmentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 分期查询用户归还记录 资方还款 清分信息
     * Summary: 分期查询用户归还记录 资方还款 清分信息</p>
     */
    public QueryLeaseInstallmentResponse queryLeaseInstallmentEx(QueryLeaseInstallmentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.installment.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseInstallmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁保险退保接口
     * Summary: 租赁保险退保</p>
     */
    public CancelLeaseInsuranceResponse cancelLeaseInsurance(CancelLeaseInsuranceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelLeaseInsuranceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁保险退保接口
     * Summary: 租赁保险退保</p>
     */
    public CancelLeaseInsuranceResponse cancelLeaseInsuranceEx(CancelLeaseInsuranceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.insurance.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelLeaseInsuranceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
     * Summary: 再融资资产推送</p>
     */
    public PushRefinanceInvalidorderResponse pushRefinanceInvalidorder(PushRefinanceInvalidorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushRefinanceInvalidorderEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
     * Summary: 再融资资产推送</p>
     */
    public PushRefinanceInvalidorderResponse pushRefinanceInvalidorderEx(PushRefinanceInvalidorderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.refinance.invalidorder.push", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PushRefinanceInvalidorderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂蚁链租赁的风控
     * Summary: 蚂蚁链租赁的风控</p>
     */
    public CreateLeaseRiskResponse createLeaseRisk(CreateLeaseRiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseRiskEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 蚂蚁链租赁的风控
     * Summary: 蚂蚁链租赁的风控</p>
     */
    public CreateLeaseRiskResponse createLeaseRiskEx(CreateLeaseRiskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.risk.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseRiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
     * Summary: 上传租赁物购买贷款订单信息（异步）</p>
     */
    public CreateLeaseAsyncverifyinfoResponse createLeaseAsyncverifyinfo(CreateLeaseAsyncverifyinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAsyncverifyinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
     * Summary: 上传租赁物购买贷款订单信息（异步）</p>
     */
    public CreateLeaseAsyncverifyinfoResponse createLeaseAsyncverifyinfoEx(CreateLeaseAsyncverifyinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.asyncverifyinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAsyncverifyinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
     * Summary: 融资方上传承诺信息(异步)</p>
     */
    public CreateLeaseAsynccreditpromiseResponse createLeaseAsynccreditpromise(CreateLeaseAsynccreditpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAsynccreditpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
     * Summary: 融资方上传承诺信息(异步)</p>
     */
    public CreateLeaseAsynccreditpromiseResponse createLeaseAsynccreditpromiseEx(CreateLeaseAsynccreditpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.asynccreditpromise.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAsynccreditpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
     * Summary: 清分服务机构上传资金清算记录，分期</p>
     */
    public CreateLeaseAsyncclearingResponse createLeaseAsyncclearing(CreateLeaseAsyncclearingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAsyncclearingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
     * Summary: 清分服务机构上传资金清算记录，分期</p>
     */
    public CreateLeaseAsyncclearingResponse createLeaseAsyncclearingEx(CreateLeaseAsyncclearingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.asyncclearing.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAsyncclearingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
     * Summary: 融资金融机构上传还款信息 每期</p>
     */
    public CreateLeaseAsyncrepaymentResponse createLeaseAsyncrepayment(CreateLeaseAsyncrepaymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAsyncrepaymentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
     * Summary: 融资金融机构上传还款信息 每期</p>
     */
    public CreateLeaseAsyncrepaymentResponse createLeaseAsyncrepaymentEx(CreateLeaseAsyncrepaymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.asyncrepayment.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAsyncrepaymentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
     * Summary: 融资平台审核订单信息</p>
     */
    public CreateLeaseAsyncauditResponse createLeaseAsyncaudit(CreateLeaseAsyncauditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAsyncauditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
     * Summary: 融资平台审核订单信息</p>
     */
    public CreateLeaseAsyncauditResponse createLeaseAsyncauditEx(CreateLeaseAsyncauditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.asyncaudit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAsyncauditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
     * Summary: 租赁平台上传付款通知信息</p>
     */
    public CreateLeaseAsyncpaymentfileResponse createLeaseAsyncpaymentfile(CreateLeaseAsyncpaymentfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAsyncpaymentfileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
     * Summary: 租赁平台上传付款通知信息</p>
     */
    public CreateLeaseAsyncpaymentfileResponse createLeaseAsyncpaymentfileEx(CreateLeaseAsyncpaymentfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.asyncpaymentfile.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAsyncpaymentfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
     * Summary: 查询用户等加密信息</p>
     */
    public QueryLeaseAsyncencryptedinfoResponse queryLeaseAsyncencryptedinfo(QueryLeaseAsyncencryptedinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseAsyncencryptedinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
     * Summary: 查询用户等加密信息</p>
     */
    public QueryLeaseAsyncencryptedinfoResponse queryLeaseAsyncencryptedinfoEx(QueryLeaseAsyncencryptedinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.asyncencryptedinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseAsyncencryptedinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁异步调用上链结果回查
     * Summary: 租赁异步调用上链结果回查</p>
     */
    public QueryLeaseAsynccallResponse queryLeaseAsynccall(QueryLeaseAsynccallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseAsynccallEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁异步调用上链结果回查
     * Summary: 租赁异步调用上链结果回查</p>
     */
    public QueryLeaseAsynccallResponse queryLeaseAsynccallEx(QueryLeaseAsynccallRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.asynccall.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseAsynccallResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建签署见证流程
     * Summary: 创建见证流程</p>
     */
    public CreateWitnessFlowResponse createWitnessFlow(CreateWitnessFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createWitnessFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建签署见证流程
     * Summary: 创建见证流程</p>
     */
    public CreateWitnessFlowResponse createWitnessFlowEx(CreateWitnessFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.flow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateWitnessFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存见证流程快照数据
     * Summary: 保存见证流程快照数据</p>
     */
    public SaveWitnessSnapshotResponse saveWitnessSnapshot(SaveWitnessSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveWitnessSnapshotEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 保存见证流程快照数据
     * Summary: 保存见证流程快照数据</p>
     */
    public SaveWitnessSnapshotResponse saveWitnessSnapshotEx(SaveWitnessSnapshotRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.snapshot.save", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SaveWitnessSnapshotResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 见证流程签署权限校验
     * Summary: 见证流程签署权限校验</p>
     */
    public CheckWitnessSignaccessResponse checkWitnessSignaccess(CheckWitnessSignaccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkWitnessSignaccessEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 见证流程签署权限校验
     * Summary: 见证流程签署权限校验</p>
     */
    public CheckWitnessSignaccessResponse checkWitnessSignaccessEx(CheckWitnessSignaccessRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.signaccess.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckWitnessSignaccessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 见证流程签署
     * Summary: 见证流程签署</p>
     */
    public AuthWitnessFlowResponse authWitnessFlow(AuthWitnessFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authWitnessFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 见证流程签署
     * Summary: 见证流程签署</p>
     */
    public AuthWitnessFlowResponse authWitnessFlowEx(AuthWitnessFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.flow.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthWitnessFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 见证流程签署确认
     * Summary: 见证流程签署确认</p>
     */
    public ConfirmWitnessFlowResponse confirmWitnessFlow(ConfirmWitnessFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmWitnessFlowEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 见证流程签署确认
     * Summary: 见证流程签署确认</p>
     */
    public ConfirmWitnessFlowResponse confirmWitnessFlowEx(ConfirmWitnessFlowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.witness.flow.confirm", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ConfirmWitnessFlowResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取存证事务ID
     * Summary: 获取存证事务ID</p>
     */
    public CreateTransResponse createTrans(CreateTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTransEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取存证事务ID
     * Summary: 获取存证事务ID</p>
     */
    public CreateTransResponse createTransEx(CreateTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTransResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息</p>
     */
    public GetTransResponse getTrans(GetTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTransEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 通过存证事务Token，获取事务中所有的存证信息
     * Summary: 获取事务中所有的存证信息</p>
     */
    public GetTransResponse getTransEx(GetTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.trans.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTransResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链</p>
     */
    public CreateTextResponse createText(CreateTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文本存证，将文本内容存证上链
     * Summary: 文本存证，将文本内容存证上链</p>
     */
    public CreateTextResponse createTextEx(CreateTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容</p>
     */
    public GetTextResponse getText(GetTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容</p>
     */
    public GetTextResponse getTextEx(GetTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链</p>
     */
    public CreateFileResponse createFile(CreateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文件存证，将文件内容存证上链
     * Summary: 文件内容存证上链</p>
     */
    public CreateFileResponse createFileEx(CreateFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址</p>
     */
    public GetFileResponse getFile(GetFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
     * Summary: 获取文件存证oss下载地址</p>
     */
    public GetFileResponse getFileEx(GetFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证</p>
     */
    public CreateSourceResponse createSource(CreateSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSourceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起原文存证，将原文内容存证上链
     * Summary: 原文内容存证</p>
     */
    public CreateSourceResponse createSourceEx(CreateSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.source.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址</p>
     */
    public GetSourceResponse getSource(GetSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSourceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
     * Summary: 获取原文存证oss下载地址</p>
     */
    public GetSourceResponse getSourceEx(GetSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.source.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建存证后，使用存证凭据核验存证状态。
     * Summary: 存证内容核验</p>
     */
    public CheckStatusResponse checkStatus(CheckStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建存证后，使用存证凭据核验存证状态。
     * Summary: 存证内容核验</p>
     */
    public CheckStatusResponse checkStatusEx(CheckStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.status.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资服务平台部署合约
     * Summary: 融资服务平台部署合约</p>
     */
    public DeployLeaseContractResponse deployLeaseContract(DeployLeaseContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployLeaseContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资服务平台部署合约
     * Summary: 融资服务平台部署合约</p>
     */
    public DeployLeaseContractResponse deployLeaseContractEx(DeployLeaseContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.contract.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployLeaseContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁服务平台授权融资服务平台
     * Summary: 租赁服务平台授权融资服务平台</p>
     */
    public AuthLeaseContractResponse authLeaseContract(AuthLeaseContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authLeaseContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁服务平台授权融资服务平台
     * Summary: 租赁服务平台授权融资服务平台</p>
     */
    public AuthLeaseContractResponse authLeaseContractEx(AuthLeaseContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.contract.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthLeaseContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁服务平台上传用户信息
     * Summary: 租赁服务平台上传用户信息</p>
     */
    public CreateLeaseUserinfoResponse createLeaseUserinfo(CreateLeaseUserinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseUserinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁服务平台上传用户信息
     * Summary: 租赁服务平台上传用户信息</p>
     */
    public CreateLeaseUserinfoResponse createLeaseUserinfoEx(CreateLeaseUserinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.userinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseUserinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁服务平台上传订单产品/服务信息
     * Summary: 租赁服务平台上传订单产品/服务信息</p>
     */
    public CreateLeaseOrderinfoResponse createLeaseOrderinfo(CreateLeaseOrderinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseOrderinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁服务平台上传订单产品/服务信息
     * Summary: 租赁服务平台上传订单产品/服务信息</p>
     */
    public CreateLeaseOrderinfoResponse createLeaseOrderinfoEx(CreateLeaseOrderinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseOrderinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁服务平台上传承诺信息
     * Summary: 租赁服务平台上传承诺信息</p>
     */
    public CreateLeasePromiseResponse createLeasePromise(CreateLeasePromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeasePromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁服务平台上传承诺信息
     * Summary: 租赁服务平台上传承诺信息</p>
     */
    public CreateLeasePromiseResponse createLeasePromiseEx(CreateLeasePromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.promise.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeasePromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资平台上传租赁物购买贷款订单信息
     * Summary: 融资平台上传租赁物购买贷款订单信息</p>
     */
    public CreateLeaseVerifyinfoResponse createLeaseVerifyinfo(CreateLeaseVerifyinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseVerifyinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资平台上传租赁物购买贷款订单信息
     * Summary: 融资平台上传租赁物购买贷款订单信息</p>
     */
    public CreateLeaseVerifyinfoResponse createLeaseVerifyinfoEx(CreateLeaseVerifyinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.verifyinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseVerifyinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资方上传承诺信息
     * Summary: 融资方上传承诺信息</p>
     */
    public CreateLeaseCreditpromiseResponse createLeaseCreditpromise(CreateLeaseCreditpromiseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseCreditpromiseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资方上传承诺信息
     * Summary: 融资方上传承诺信息</p>
     */
    public CreateLeaseCreditpromiseResponse createLeaseCreditpromiseEx(CreateLeaseCreditpromiseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.creditpromise.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseCreditpromiseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台上传支用/还款信息
     * Summary: 租赁平台上传支用/还款信息</p>
     */
    public CreateLeaseDisburseinfoResponse createLeaseDisburseinfo(CreateLeaseDisburseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseDisburseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台上传支用/还款信息
     * Summary: 租赁平台上传支用/还款信息</p>
     */
    public CreateLeaseDisburseinfoResponse createLeaseDisburseinfoEx(CreateLeaseDisburseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.disburseinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseDisburseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description:  查询订单详细信息
     * Summary:  查询订单详细信息</p>
     */
    public QueryLeaseOrderinfoResponse queryLeaseOrderinfo(QueryLeaseOrderinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseOrderinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description:  查询订单详细信息
     * Summary:  查询订单详细信息</p>
     */
    public QueryLeaseOrderinfoResponse queryLeaseOrderinfoEx(QueryLeaseOrderinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.orderinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseOrderinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建金融行业标准文本存证
     * Summary: 创建金融行业文本存证</p>
     */
    public CreateFinanceTextnotaryResponse createFinanceTextnotary(CreateFinanceTextnotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFinanceTextnotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建金融行业标准文本存证
     * Summary: 创建金融行业文本存证</p>
     */
    public CreateFinanceTextnotaryResponse createFinanceTextnotaryEx(CreateFinanceTextnotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.finance.textnotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFinanceTextnotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取金融行业文本存证接口描述
     * Summary: 获取金融行业文本存证</p>
     */
    public GetFinanceTextnotaryResponse getFinanceTextnotary(GetFinanceTextnotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFinanceTextnotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取金融行业文本存证接口描述
     * Summary: 获取金融行业文本存证</p>
     */
    public GetFinanceTextnotaryResponse getFinanceTextnotaryEx(GetFinanceTextnotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.finance.textnotary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFinanceTextnotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建金融行业文件存证接口描述
     * Summary: 创建金融行业文件存证</p>
     */
    public CreateFinanceFilenotaryResponse createFinanceFilenotary(CreateFinanceFilenotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFinanceFilenotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建金融行业文件存证接口描述
     * Summary: 创建金融行业文件存证</p>
     */
    public CreateFinanceFilenotaryResponse createFinanceFilenotaryEx(CreateFinanceFilenotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.finance.filenotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFinanceFilenotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取金融行业文件存证接口描述
     * Summary: 获取金融行业文件存证</p>
     */
    public GetFinanceFilenotaryResponse getFinanceFilenotary(GetFinanceFilenotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFinanceFilenotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取金融行业文件存证接口描述
     * Summary: 获取金融行业文件存证</p>
     */
    public GetFinanceFilenotaryResponse getFinanceFilenotaryEx(GetFinanceFilenotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.finance.filenotary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFinanceFilenotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 统一存证核验接口
     * Summary: 统一存证核验接口（已下架）</p>
     */
    public CheckIndustryNotaryResponse checkIndustryNotary(CheckIndustryNotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkIndustryNotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 统一存证核验接口
     * Summary: 统一存证核验接口（已下架）</p>
     */
    public CheckIndustryNotaryResponse checkIndustryNotaryEx(CheckIndustryNotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.industry.notary.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckIndustryNotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 违约案件信息提交服务
     * Summary: 违约案件信息提交服务</p>
     */
    public CreateSueBreakpromiseinfoResponse createSueBreakpromiseinfo(CreateSueBreakpromiseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSueBreakpromiseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 违约案件信息提交服务
     * Summary: 违约案件信息提交服务</p>
     */
    public CreateSueBreakpromiseinfoResponse createSueBreakpromiseinfoEx(CreateSueBreakpromiseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSueBreakpromiseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 违约案件信息修改服务
     * Summary: 违约案件信息修改服务</p>
     */
    public UpdateSueBreakpromiseinfoResponse updateSueBreakpromiseinfo(UpdateSueBreakpromiseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSueBreakpromiseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 违约案件信息修改服务
     * Summary: 违约案件信息修改服务</p>
     */
    public UpdateSueBreakpromiseinfoResponse updateSueBreakpromiseinfoEx(UpdateSueBreakpromiseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSueBreakpromiseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 违约案件信息删除服务
     * Summary: 违约案件信息删除服务</p>
     */
    public DeleteSueBreakpromiseinfoResponse deleteSueBreakpromiseinfo(DeleteSueBreakpromiseinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSueBreakpromiseinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 违约案件信息删除服务
     * Summary: 违约案件信息删除服务</p>
     */
    public DeleteSueBreakpromiseinfoResponse deleteSueBreakpromiseinfoEx(DeleteSueBreakpromiseinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.breakpromiseinfo.delete", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeleteSueBreakpromiseinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询惩戒信息
     * Summary: 查询惩戒信息</p>
     */
    public QuerySueUserinfoResponse querySueUserinfo(QuerySueUserinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySueUserinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询惩戒信息
     * Summary: 查询惩戒信息</p>
     */
    public QuerySueUserinfoResponse querySueUserinfoEx(QuerySueUserinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.userinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QuerySueUserinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 升级用户管理合约
     * Summary: 升级用户管理合约</p>
     */
    public UpdateSueExeplarycontractResponse updateSueExeplarycontract(UpdateSueExeplarycontractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSueExeplarycontractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 升级用户管理合约
     * Summary: 升级用户管理合约</p>
     */
    public UpdateSueExeplarycontractResponse updateSueExeplarycontractEx(UpdateSueExeplarycontractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.exeplarycontract.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSueExeplarycontractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 回退用户管理合约
     * Summary: 回退用户管理合约</p>
     */
    public UpdateSueExemplaryrevertResponse updateSueExemplaryrevert(UpdateSueExemplaryrevertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSueExemplaryrevertEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 回退用户管理合约
     * Summary: 回退用户管理合约</p>
     */
    public UpdateSueExemplaryrevertResponse updateSueExemplaryrevertEx(UpdateSueExemplaryrevertRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.sue.exemplaryrevert.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateSueExemplaryrevertResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资平台审核订单信息
     * Summary: 融资平台审核订单信息</p>
     */
    public CreateLeaseAuditResponse createLeaseAudit(CreateLeaseAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseAuditEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资平台审核订单信息
     * Summary: 融资平台审核订单信息</p>
     */
    public CreateLeaseAuditResponse createLeaseAuditEx(CreateLeaseAuditRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.audit.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseAuditResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台上传付款通知信息
     * Summary: 租赁平台上传付款通知信息</p>
     */
    public CreateLeasePaymentfileResponse createLeasePaymentfile(CreateLeasePaymentfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeasePaymentfileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台上传付款通知信息
     * Summary: 租赁平台上传付款通知信息</p>
     */
    public CreateLeasePaymentfileResponse createLeasePaymentfileEx(CreateLeasePaymentfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.paymentfile.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeasePaymentfileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁系统上传租金归还记录 分期调用
     * Summary: 租赁系统上传租金归还记录 分期调用</p>
     */
    public CreateLeaseRentalResponse createLeaseRental(CreateLeaseRentalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseRentalEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁系统上传租金归还记录 分期调用
     * Summary: 租赁系统上传租金归还记录 分期调用</p>
     */
    public CreateLeaseRentalResponse createLeaseRentalEx(CreateLeaseRentalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.rental.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseRentalResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 清分服务机构上传资金清算记录，分期
     * Summary: 清分服务机构上传资金清算记录，分期</p>
     */
    public CreateLeaseClearingResponse createLeaseClearing(CreateLeaseClearingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseClearingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 清分服务机构上传资金清算记录，分期
     * Summary: 清分服务机构上传资金清算记录，分期</p>
     */
    public CreateLeaseClearingResponse createLeaseClearingEx(CreateLeaseClearingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.clearing.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseClearingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资金融机构上传还款信息 每期
     * Summary: 融资金融机构上传还款信息 每期</p>
     */
    public CreateLeaseRepaymentResponse createLeaseRepayment(CreateLeaseRepaymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseRepaymentEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资金融机构上传还款信息 每期
     * Summary: 融资金融机构上传还款信息 每期</p>
     */
    public CreateLeaseRepaymentResponse createLeaseRepaymentEx(CreateLeaseRepaymentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.repayment.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseRepaymentResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁通知系统注册
     * Summary: 融资租赁通知系统注册</p>
     */
    public CreateLeaseNotifyregisterResponse createLeaseNotifyregister(CreateLeaseNotifyregisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseNotifyregisterEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁通知系统注册
     * Summary: 融资租赁通知系统注册</p>
     */
    public CreateLeaseNotifyregisterResponse createLeaseNotifyregisterEx(CreateLeaseNotifyregisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.notifyregister.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseNotifyregisterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据imeiID查询iot设备的详情
     * Summary: 根据imeiID查询iot设备的详情</p>
     */
    public QueryLeaseIotinfoResponse queryLeaseIotinfo(QueryLeaseIotinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseIotinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据imeiID查询iot设备的详情
     * Summary: 根据imeiID查询iot设备的详情</p>
     */
    public QueryLeaseIotinfoResponse queryLeaseIotinfoEx(QueryLeaseIotinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.iotinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseIotinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建法院通用文本存证
     * Summary: 法院通用文本存证创建接口</p>
     */
    public CreateCourtTextnotaryResponse createCourtTextnotary(CreateCourtTextnotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCourtTextnotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建法院通用文本存证
     * Summary: 法院通用文本存证创建接口</p>
     */
    public CreateCourtTextnotaryResponse createCourtTextnotaryEx(CreateCourtTextnotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.court.textnotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCourtTextnotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取法院通用文本存证
     * Summary: 法院通用文本存证获取接口</p>
     */
    public GetCourtTextnotaryResponse getCourtTextnotary(GetCourtTextnotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCourtTextnotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取法院通用文本存证
     * Summary: 法院通用文本存证获取接口</p>
     */
    public GetCourtTextnotaryResponse getCourtTextnotaryEx(GetCourtTextnotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.court.textnotary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCourtTextnotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建法院通用文件存证接口
     * Summary: 法院通用文件存证创建接口</p>
     */
    public CreateCourtFilenotaryResponse createCourtFilenotary(CreateCourtFilenotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCourtFilenotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建法院通用文件存证接口
     * Summary: 法院通用文件存证创建接口</p>
     */
    public CreateCourtFilenotaryResponse createCourtFilenotaryEx(CreateCourtFilenotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.court.filenotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateCourtFilenotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取法院通用文件存证
     * Summary: 法院通用文件存证获取接口</p>
     */
    public GetCourtFilenotaryResponse getCourtFilenotary(GetCourtFilenotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCourtFilenotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取法院通用文件存证
     * Summary: 法院通用文件存证获取接口</p>
     */
    public GetCourtFilenotaryResponse getCourtFilenotaryEx(GetCourtFilenotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.court.filenotary.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCourtFilenotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁定制化统一入口
     * Summary: 融资租赁定制化统一入口</p>
     */
    public CreateLeaseRouteResponse createLeaseRoute(CreateLeaseRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseRouteEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁定制化统一入口
     * Summary: 融资租赁定制化统一入口</p>
     */
    public CreateLeaseRouteResponse createLeaseRouteEx(CreateLeaseRouteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.route.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseRouteResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
     * Summary: 查询用户等加密信息</p>
     */
    public QueryLeaseEncryptedinfoResponse queryLeaseEncryptedinfo(QueryLeaseEncryptedinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseEncryptedinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
     * Summary: 查询用户等加密信息</p>
     */
    public QueryLeaseEncryptedinfoResponse queryLeaseEncryptedinfoEx(QueryLeaseEncryptedinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.encryptedinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseEncryptedinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同文本存证
     * Summary: 电子合同文本存证</p>
     */
    public CreateContractTextResponse createContractText(CreateContractTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createContractTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 电子合同文本存证
     * Summary: 电子合同文本存证</p>
     */
    public CreateContractTextResponse createContractTextEx(CreateContractTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateContractTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
     * Summary: 申请电子合同存证报告</p>
     */
    public ApplyContractReportResponse applyContractReport(ApplyContractReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyContractReportEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
     * Summary: 申请电子合同存证报告</p>
     */
    public ApplyContractReportResponse applyContractReportEx(ApplyContractReportRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.report.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyContractReportResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
     * Summary: 下载合同存证</p>
     */
    public GetContractTextResponse getContractText(GetContractTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getContractTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
     * Summary: 下载合同存证</p>
     */
    public GetContractTextResponse getContractTextEx(GetContractTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetContractTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取存证事务ID内部接口
     * Summary: 获取存证事务ID内部接口</p>
     */
    public CreateInternalTransResponse createInternalTrans(CreateInternalTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInternalTransEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取存证事务ID内部接口
     * Summary: 获取存证事务ID内部接口</p>
     */
    public CreateInternalTransResponse createInternalTransEx(CreateInternalTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInternalTransResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本存证内部接口，将文本内容存证上链
     * Summary: 文本存证内部接口，将文本内容存证上链</p>
     */
    public CreateInternalTextResponse createInternalText(CreateInternalTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInternalTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文本存证内部接口，将文本内容存证上链
     * Summary: 文本存证内部接口，将文本内容存证上链</p>
     */
    public CreateInternalTextResponse createInternalTextEx(CreateInternalTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInternalTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
     * Summary: 租赁业务文本存证，将文本内容存证上链</p>
     */
    public CreateLeaseTextResponse createLeaseText(CreateLeaseTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
     * Summary: 租赁业务文本存证，将文本内容存证上链</p>
     */
    public CreateLeaseTextResponse createLeaseTextEx(CreateLeaseTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
     * Summary: 租赁业务文件内容存证上链</p>
     */
    public CreateLeaseFileResponse createLeaseFile(CreateLeaseFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
     * Summary: 租赁业务文件内容存证上链</p>
     */
    public CreateLeaseFileResponse createLeaseFileEx(CreateLeaseFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.file.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
     * Summary: 租赁业务获取订单存证列表</p>
     */
    public ListLeaseNotaryResponse listLeaseNotary(ListLeaseNotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLeaseNotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
     * Summary: 租赁业务获取订单存证列表</p>
     */
    public ListLeaseNotaryResponse listLeaseNotaryEx(ListLeaseNotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.notary.list", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ListLeaseNotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询融资租赁application
     * Summary: 查询融资租赁application</p>
     */
    public QueryLeaseApplicationResponse queryLeaseApplication(QueryLeaseApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseApplicationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询融资租赁application
     * Summary: 查询融资租赁application</p>
     */
    public QueryLeaseApplicationResponse queryLeaseApplicationEx(QueryLeaseApplicationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.application.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询融资租赁application的定义详情
     * Summary: 查询application的定义详情</p>
     */
    public QueryLeaseApplicationdetailinfoResponse queryLeaseApplicationdetailinfo(QueryLeaseApplicationdetailinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseApplicationdetailinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询融资租赁application的定义详情
     * Summary: 查询application的定义详情</p>
     */
    public QueryLeaseApplicationdetailinfoResponse queryLeaseApplicationdetailinfoEx(QueryLeaseApplicationdetailinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.applicationdetailinfo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseApplicationdetailinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁资方重置订单状态
     * Summary: 融资租赁资方重置订单状态</p>
     */
    public SetLeaseRepaymentstatusResponse setLeaseRepaymentstatus(SetLeaseRepaymentstatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.setLeaseRepaymentstatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 融资租赁资方重置订单状态
     * Summary: 融资租赁资方重置订单状态</p>
     */
    public SetLeaseRepaymentstatusResponse setLeaseRepaymentstatusEx(SetLeaseRepaymentstatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.repaymentstatus.set", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SetLeaseRepaymentstatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 供应商上传采购等相关信息
     * Summary: 供应商上传采购等相关信息</p>
     */
    public CreateLeaseSupplierinfoResponse createLeaseSupplierinfo(CreateLeaseSupplierinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseSupplierinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 供应商上传采购等相关信息
     * Summary: 供应商上传采购等相关信息</p>
     */
    public CreateLeaseSupplierinfoResponse createLeaseSupplierinfoEx(CreateLeaseSupplierinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseSupplierinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: mytf的tapp部署
     * Summary: mytf的tapp部署</p>
     */
    public DeployMytfTappResponse deployMytfTapp(DeployMytfTappRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployMytfTappEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: mytf的tapp部署
     * Summary: mytf的tapp部署</p>
     */
    public DeployMytfTappResponse deployMytfTappEx(DeployMytfTappRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.mytf.tapp.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployMytfTappResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 供应商更新物流状态、签收记录等信息
     * Summary: 供应商更新物流状态、签收记录等信息</p>
     */
    public CreateLeaseSupplierdynamicinfoResponse createLeaseSupplierdynamicinfo(CreateLeaseSupplierdynamicinfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseSupplierdynamicinfoEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 供应商更新物流状态、签收记录等信息
     * Summary: 供应商更新物流状态、签收记录等信息</p>
     */
    public CreateLeaseSupplierdynamicinfoResponse createLeaseSupplierdynamicinfoEx(CreateLeaseSupplierdynamicinfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.supplierdynamicinfo.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseSupplierdynamicinfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建租赁订单相关信息，融资租赁的前置条件
     * Summary: 创建租赁订单相关信息，融资租赁的前置条件</p>
     */
    public CreateLeaseBizResponse createLeaseBiz(CreateLeaseBizRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseBizEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建租赁订单相关信息，融资租赁的前置条件
     * Summary: 创建租赁订单相关信息，融资租赁的前置条件</p>
     */
    public CreateLeaseBizResponse createLeaseBizEx(CreateLeaseBizRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.biz.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseBizResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询核验结果
     * Summary: 查询核验结果</p>
     */
    public QueryLeaseProofResponse queryLeaseProof(QueryLeaseProofRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseProofEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询核验结果
     * Summary: 查询核验结果</p>
     */
    public QueryLeaseProofResponse queryLeaseProofEx(QueryLeaseProofRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.proof.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseProofResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
     * Summary: 大文件内容存证接口</p>
     */
    public CreateLargefileResponse createLargefile(CreateLargefileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLargefileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
     * Summary: 大文件内容存证接口</p>
     */
    public CreateLargefileResponse createLargefileEx(CreateLargefileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.largefile.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLargefileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台查询接口
     * Summary: 租赁平台查询接口</p>
     */
    public QueryLeaseBizResponse queryLeaseBiz(QueryLeaseBizRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryLeaseBizEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁平台查询接口
     * Summary: 租赁平台查询接口</p>
     */
    public QueryLeaseBizResponse queryLeaseBizEx(QueryLeaseBizRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.biz.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryLeaseBizResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝哈希存证
     * Summary: 租赁宝哈希存证</p>
     */
    public CreateLeaseBiznotaryResponse createLeaseBiznotary(CreateLeaseBiznotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseBiznotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 租赁宝哈希存证
     * Summary: 租赁宝哈希存证</p>
     */
    public CreateLeaseBiznotaryResponse createLeaseBiznotaryEx(CreateLeaseBiznotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.biznotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseBiznotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同内部文本存证
     * Summary: 合同内部文本存证</p>
     */
    public CreateInternalContractResponse createInternalContract(CreateInternalContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInternalContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合同内部文本存证
     * Summary: 合同内部文本存证</p>
     */
    public CreateInternalContractResponse createInternalContractEx(CreateInternalContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.contract.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInternalContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方上传网商直付通代扣协议核验结果
     * Summary: 资方上传网商直付通代扣协议核验结果</p>
     */
    public CreateLeaseZftagreementsignResponse createLeaseZftagreementsign(CreateLeaseZftagreementsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseZftagreementsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方上传网商直付通代扣协议核验结果
     * Summary: 资方上传网商直付通代扣协议核验结果</p>
     */
    public CreateLeaseZftagreementsignResponse createLeaseZftagreementsignEx(CreateLeaseZftagreementsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.zftagreementsign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseZftagreementsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方上传网商直付通代扣协议解约相关信息
     * Summary: 资方上传网商直付通代扣协议解约相关信息</p>
     */
    public CreateLeaseZftagreementunsignResponse createLeaseZftagreementunsign(CreateLeaseZftagreementunsignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLeaseZftagreementunsignEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 资方上传网商直付通代扣协议解约相关信息
     * Summary: 资方上传网商直付通代扣协议解约相关信息</p>
     */
    public CreateLeaseZftagreementunsignResponse createLeaseZftagreementunsignEx(CreateLeaseZftagreementunsignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.lease.zftagreementunsign.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateLeaseZftagreementunsignResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取蚂蚁链版存证证明
     * Summary: 获取蚂蚁链版存证证明</p>
     */
    public GetCertificateDetailResponse getCertificateDetail(GetCertificateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCertificateDetailEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取蚂蚁链版存证证明
     * Summary: 获取蚂蚁链版存证证明</p>
     */
    public GetCertificateDetailResponse getCertificateDetailEx(GetCertificateDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.certificate.detail.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetCertificateDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容</p>
     */
    public GetInternalTextResponse getInternalText(GetInternalTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInternalTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 用户通过交易哈希获取自己上传的文本存证内容
     * Summary: 获取文本存证内容</p>
     */
    public GetInternalTextResponse getInternalTextEx(GetInternalTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInternalTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 三方服务获取开通权限，标记开通状态。
     * Summary: 三方服务获取开通权限，标记开通状态。</p>
     */
    public OpenInternalTwcResponse openInternalTwc(OpenInternalTwcRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openInternalTwcEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 三方服务获取开通权限，标记开通状态。
     * Summary: 三方服务获取开通权限，标记开通状态。</p>
     */
    public OpenInternalTwcResponse openInternalTwcEx(OpenInternalTwcRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.twc.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenInternalTwcResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 指定节点获取存证事务Id
     * Summary: 指定节点获取存证事务id</p>
     */
    public CreateSpecifyTransResponse createSpecifyTrans(CreateSpecifyTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSpecifyTransEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 指定节点获取存证事务Id
     * Summary: 指定节点获取存证事务id</p>
     */
    public CreateSpecifyTransResponse createSpecifyTransEx(CreateSpecifyTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.specify.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSpecifyTransResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 指定节点文本存证
     * Summary: 指定节点文本存证</p>
     */
    public CreateSpecifyTextResponse createSpecifyText(CreateSpecifyTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSpecifyTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 指定节点文本存证
     * Summary: 指定节点文本存证</p>
     */
    public CreateSpecifyTextResponse createSpecifyTextEx(CreateSpecifyTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.specify.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSpecifyTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件存证大租户内部接口
     * Summary: 文件存证内部接口</p>
     */
    public CreateInternalFileResponse createInternalFile(CreateInternalFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInternalFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 文件存证大租户内部接口
     * Summary: 文件存证内部接口</p>
     */
    public CreateInternalFileResponse createInternalFileEx(CreateInternalFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.file.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateInternalFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取文件存证内容内部接口
     * Summary: 获取文件存证内容内部接口</p>
     */
    public GetInternalFileResponse getInternalFile(GetInternalFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInternalFileEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 获取文件存证内容内部接口
     * Summary: 获取文件存证内容内部接口</p>
     */
    public GetInternalFileResponse getInternalFileEx(GetInternalFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.internal.file.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetInternalFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转文本存证
     * Summary: 数据流转文本存证</p>
     */
    public CreateDataflowTextResponse createDataflowText(CreateDataflowTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataflowTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转文本存证
     * Summary: 数据流转文本存证</p>
     */
    public CreateDataflowTextResponse createDataflowTextEx(CreateDataflowTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.text.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataflowTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数据流转文本存证内容
     * Summary: 查询数据流转文本存证内容</p>
     */
    public GetDataflowTextResponse getDataflowText(GetDataflowTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataflowTextEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数据流转文本存证内容
     * Summary: 查询数据流转文本存证内容</p>
     */
    public GetDataflowTextResponse getDataflowTextEx(GetDataflowTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.text.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetDataflowTextResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转存证创建存证事务
     * Summary: 数据流转存证创建存证事务</p>
     */
    public CreateDataflowTransResponse createDataflowTrans(CreateDataflowTransRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataflowTransEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转存证创建存证事务
     * Summary: 数据流转存证创建存证事务</p>
     */
    public CreateDataflowTransResponse createDataflowTransEx(CreateDataflowTransRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.trans.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataflowTransResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
     * Summary: 发起管理合约部署</p>
     */
    public DeployDataflowContractResponse deployDataflowContract(DeployDataflowContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deployDataflowContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
     * Summary: 发起管理合约部署</p>
     */
    public DeployDataflowContractResponse deployDataflowContractEx(DeployDataflowContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.contract.deploy", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DeployDataflowContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
     * Summary: 发起授权</p>
     */
    public CreateDataflowAuthorizeResponse createDataflowAuthorize(CreateDataflowAuthorizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataflowAuthorizeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
     * Summary: 发起授权</p>
     */
    public CreateDataflowAuthorizeResponse createDataflowAuthorizeEx(CreateDataflowAuthorizeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.authorize.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataflowAuthorizeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证方对撤销已经发起的权限授予。
     * Summary: 撤销授权</p>
     */
    public CancelDataflowAuthorizeResponse cancelDataflowAuthorize(CancelDataflowAuthorizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelDataflowAuthorizeEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证方对撤销已经发起的权限授予。
     * Summary: 撤销授权</p>
     */
    public CancelDataflowAuthorizeResponse cancelDataflowAuthorizeEx(CancelDataflowAuthorizeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.authorize.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelDataflowAuthorizeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
     * Summary: 查询对存证合约的各类操作执行结果</p>
     */
    public QueryDataflowActionResponse queryDataflowAction(QueryDataflowActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataflowActionEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
     * Summary: 查询对存证合约的各类操作执行结果</p>
     */
    public QueryDataflowActionResponse queryDataflowActionEx(QueryDataflowActionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.action.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDataflowActionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
     * Summary: 发起信封密钥上传</p>
     */
    public UploadDataflowPubkeyResponse uploadDataflowPubkey(UploadDataflowPubkeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadDataflowPubkeyEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
     * Summary: 发起信封密钥上传</p>
     */
    public UploadDataflowPubkeyResponse uploadDataflowPubkeyEx(UploadDataflowPubkeyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.pubkey.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadDataflowPubkeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转存证创建链上账户
     * Summary: 数据流转存证创建链上账户</p>
     */
    public CreateDataflowAccountResponse createDataflowAccount(CreateDataflowAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDataflowAccountEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数据流转存证创建链上账户
     * Summary: 数据流转存证创建链上账户</p>
     */
    public CreateDataflowAccountResponse createDataflowAccountEx(CreateDataflowAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.dataflow.account.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateDataflowAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起一体化文件存证
     * Summary: 发起一体化文件存证</p>
     */
    public CreateFileIntegrationResponse createFileIntegration(CreateFileIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFileIntegrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 发起一体化文件存证
     * Summary: 发起一体化文件存证</p>
     */
    public CreateFileIntegrationResponse createFileIntegrationEx(CreateFileIntegrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.integration.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFileIntegrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 完成一体化文件存证
     * Summary: 完成一体化文件存证</p>
     */
    public FinishFileIntegrationResponse finishFileIntegration(FinishFileIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishFileIntegrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 完成一体化文件存证
     * Summary: 完成一体化文件存证</p>
     */
    public FinishFileIntegrationResponse finishFileIntegrationEx(FinishFileIntegrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.integration.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishFileIntegrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询一体化文件存证
     * Summary: 查询一体化文件存证</p>
     */
    public GetFileIntegrationResponse getFileIntegration(GetFileIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFileIntegrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询一体化文件存证
     * Summary: 查询一体化文件存证</p>
     */
    public GetFileIntegrationResponse getFileIntegrationEx(GetFileIntegrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.integration.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetFileIntegrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 一体化文件存证-发起授权
     * Summary: 一体化文件存证-发起授权</p>
     */
    public AuthFileIntegrationResponse authFileIntegration(AuthFileIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authFileIntegrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 一体化文件存证-发起授权
     * Summary: 一体化文件存证-发起授权</p>
     */
    public AuthFileIntegrationResponse authFileIntegrationEx(AuthFileIntegrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.integration.auth", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new AuthFileIntegrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 一体化文件存证-取消授权
     * Summary: 一体化文件存证-取消授权</p>
     */
    public CancelFileIntegrationResponse cancelFileIntegration(CancelFileIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelFileIntegrationEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 一体化文件存证-取消授权
     * Summary: 一体化文件存证-取消授权</p>
     */
    public CancelFileIntegrationResponse cancelFileIntegrationEx(CancelFileIntegrationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.file.integration.cancel", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CancelFileIntegrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建存证流程实例
     * Summary: 创建存证流程实例</p>
     */
    public CreateFlowInstanceResponse createFlowInstance(CreateFlowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowInstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建存证流程实例
     * Summary: 创建存证流程实例</p>
     */
    public CreateFlowInstanceResponse createFlowInstanceEx(CreateFlowInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.instance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFlowInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证流程实例完结
     * Summary: 存证流程实例完结</p>
     */
    public FinishFlowInstanceResponse finishFlowInstance(FinishFlowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.finishFlowInstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证流程实例完结
     * Summary: 存证流程实例完结</p>
     */
    public FinishFlowInstanceResponse finishFlowInstanceEx(FinishFlowInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.instance.finish", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new FinishFlowInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建阶段存证
     * Summary: 创建阶段存证</p>
     */
    public InitFlowPhaseResponse initFlowPhase(InitFlowPhaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initFlowPhaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 创建阶段存证
     * Summary: 创建阶段存证</p>
     */
    public InitFlowPhaseResponse initFlowPhaseEx(InitFlowPhaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.phase.init", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new InitFlowPhaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询阶段存证结果
     * Summary: 查询阶段存证结果</p>
     */
    public QueryFlowPhaseResponse queryFlowPhase(QueryFlowPhaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowPhaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询阶段存证结果
     * Summary: 查询阶段存证结果</p>
     */
    public QueryFlowPhaseResponse queryFlowPhaseEx(QueryFlowPhaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.phase.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowPhaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 阶段存证数据详情
     * Summary: 阶段存证数据详情</p>
     */
    public DetailFlowPhaseResponse detailFlowPhase(DetailFlowPhaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailFlowPhaseEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 阶段存证数据详情
     * Summary: 阶段存证数据详情</p>
     */
    public DetailFlowPhaseResponse detailFlowPhaseEx(DetailFlowPhaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.phase.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailFlowPhaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 一键创建全流程存证实例和阶段存证
     * Summary: 一键创建全流程存证实例和阶段存证</p>
     */
    public CreateFlowOnestepnotaryResponse createFlowOnestepnotary(CreateFlowOnestepnotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFlowOnestepnotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 一键创建全流程存证实例和阶段存证
     * Summary: 一键创建全流程存证实例和阶段存证</p>
     */
    public CreateFlowOnestepnotaryResponse createFlowOnestepnotaryEx(CreateFlowOnestepnotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.onestepnotary.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateFlowOnestepnotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询一键创建全流程存证进度状态
     * Summary: 查询一键创建全流程存证进度状态</p>
     */
    public QueryFlowOnestepnotaryResponse queryFlowOnestepnotary(QueryFlowOnestepnotaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowOnestepnotaryEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询一键创建全流程存证进度状态
     * Summary: 查询一键创建全流程存证进度状态</p>
     */
    public QueryFlowOnestepnotaryResponse queryFlowOnestepnotaryEx(QueryFlowOnestepnotaryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.onestepnotary.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowOnestepnotaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证全流程证明申请
     * Summary: 存证全流程证明申请</p>
     */
    public ApplyFlowCertificateResponse applyFlowCertificate(ApplyFlowCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFlowCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证全流程证明申请
     * Summary: 存证全流程证明申请</p>
     */
    public ApplyFlowCertificateResponse applyFlowCertificateEx(ApplyFlowCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.certificate.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyFlowCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证全流程证明出证进度查询
     * Summary: 存证全流程证明出证进度查询</p>
     */
    public QueryFlowCertificateResponse queryFlowCertificate(QueryFlowCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 存证全流程证明出证进度查询
     * Summary: 存证全流程证明出证进度查询</p>
     */
    public QueryFlowCertificateResponse queryFlowCertificateEx(QueryFlowCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.certificate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根全流程出证申请
     * Summary: 数字票根全流程出证申请</p>
     */
    public ApplyStubCertificateResponse applyStubCertificate(ApplyStubCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyStubCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根全流程出证申请
     * Summary: 数字票根全流程出证申请</p>
     */
    public ApplyStubCertificateResponse applyStubCertificateEx(ApplyStubCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.certificate.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyStubCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根全流程证明出证进度查询
     * Summary: 数字票根全流程证明出证进度查询</p>
     */
    public QueryStubCertificateResponse queryStubCertificate(QueryStubCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStubCertificateEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根全流程证明出证进度查询
     * Summary: 数字票根全流程证明出证进度查询</p>
     */
    public QueryStubCertificateResponse queryStubCertificateEx(QueryStubCertificateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.certificate.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStubCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根全流程存证进度查询
     * Summary: 数字票根全流程存证进度查询</p>
     */
    public QueryStubResponse queryStub(QueryStubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryStubEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根全流程存证进度查询
     * Summary: 数字票根全流程存证进度查询</p>
     */
    public QueryStubResponse queryStubEx(QueryStubRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryStubResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根全流程存证创建
     * Summary: 数字票根全流程存证创建</p>
     */
    public CreateStubResponse createStub(CreateStubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStubEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根全流程存证创建
     * Summary: 数字票根全流程存证创建</p>
     */
    public CreateStubResponse createStubEx(CreateStubRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStubResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数字票根是否存在
     * Summary: 查询数字票根是否存在</p>
     */
    public ExistStubResponse existStub(ExistStubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existStubEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询数字票根是否存在
     * Summary: 查询数字票根是否存在</p>
     */
    public ExistStubResponse existStubEx(ExistStubRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistStubResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根-清分接口
     * Summary: 数字票根-清分接口</p>
     */
    public CreateStubClearingResponse createStubClearing(CreateStubClearingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStubClearingEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 数字票根-清分接口
     * Summary: 数字票根-清分接口</p>
     */
    public CreateStubClearingResponse createStubClearingEx(CreateStubClearingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.stub.clearing.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateStubClearingResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请全流程证据包，包括链上证据包和链下证据包
     * Summary: 申请全流程证据包</p>
     */
    public ApplyFlowEvidenceResponse applyFlowEvidence(ApplyFlowEvidenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFlowEvidenceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 申请全流程证据包，包括链上证据包和链下证据包
     * Summary: 申请全流程证据包</p>
     */
    public ApplyFlowEvidenceResponse applyFlowEvidenceEx(ApplyFlowEvidenceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.evidence.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyFlowEvidenceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 全流程证据包生成进度查询
     * Summary: 全流程证据包生成进度查询</p>
     */
    public QueryFlowEvidenceResponse queryFlowEvidence(QueryFlowEvidenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryFlowEvidenceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 全流程证据包生成进度查询
     * Summary: 全流程证据包生成进度查询</p>
     */
    public QueryFlowEvidenceResponse queryFlowEvidenceEx(QueryFlowEvidenceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.evidence.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryFlowEvidenceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 全流程证据授权码申请
     * Summary: 全流程证据授权码申请</p>
     */
    public ApplyFlowAuthResponse applyFlowAuth(ApplyFlowAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyFlowAuthEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 全流程证据授权码申请
     * Summary: 全流程证据授权码申请</p>
     */
    public ApplyFlowAuthResponse applyFlowAuthEx(ApplyFlowAuthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.auth.apply", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ApplyFlowAuthResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 全流程详情查询
     * Summary: 全流程详情查询</p>
     */
    public DetailFlowInstanceResponse detailFlowInstance(DetailFlowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detailFlowInstanceEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 全流程详情查询
     * Summary: 全流程详情查询</p>
     */
    public DetailFlowInstanceResponse detailFlowInstanceEx(DetailFlowInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.flow.instance.detail", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new DetailFlowInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 合约校验接口
     * Summary: 合约校验接口</p>
     */
    public CheckContractResponse checkContract(CheckContractRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkContractEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 合约校验接口
     * Summary: 合约校验接口</p>
     */
    public CheckContractResponse checkContractEx(CheckContractRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckContractResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询合约核验结果
     * Summary: 查询合约核验结果</p>
     */
    public QueryContractStatusResponse queryContractStatus(QueryContractStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryContractStatusEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 查询合约核验结果
     * Summary: 查询合约核验结果</p>
     */
    public QueryContractStatusResponse queryContractStatusEx(QueryContractStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.contract.status.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryContractStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据业务场景码创建raceId
     * Summary: traceId创建接口</p>
     */
    public CreateTrafficTraceidResponse createTrafficTraceid(CreateTrafficTraceidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTrafficTraceidEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 根据业务场景码创建raceId
     * Summary: traceId创建接口</p>
     */
    public CreateTrafficTraceidResponse createTrafficTraceidEx(CreateTrafficTraceidRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.traffic.traceid.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateTrafficTraceidResponse());
    }

    /**
     * <b>description</b> :
     * <p>Description: 业务方操作行为日志传入
     * Summary: 操作行为日志传入</p>
     */
    public UploadTrafficOperatelogResponse uploadTrafficOperatelog(UploadTrafficOperatelogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadTrafficOperatelogEx(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Description: 业务方操作行为日志传入
     * Summary: 操作行为日志传入</p>
     */
    public UploadTrafficOperatelogResponse uploadTrafficOperatelogEx(UploadTrafficOperatelogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "twc.notary.traffic.operatelog.upload", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UploadTrafficOperatelogResponse());
    }
}
