// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.sp;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.antgroup.antchain.openapi.sp.models.*;

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
                    new TeaPair("sdk_version", "4.9.0"),
                    new TeaPair("_prod_code", "SP"),
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
     * Description: 更新链上账户余额
     * Summary: 更新链上账户余额
     */
    public UpdateAbilityChainAccountResponse updateAbilityChainAccount(UpdateAbilityChainAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAbilityChainAccountEx(request, headers, runtime);
    }

    /**
     * Description: 更新链上账户余额
     * Summary: 更新链上账户余额
     */
    public UpdateAbilityChainAccountResponse updateAbilityChainAccountEx(UpdateAbilityChainAccountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.ability.chain.account.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAbilityChainAccountResponse());
    }

    /**
     * Description: 链上资产核销、确认核销成功
     * Summary: 链上资产核销确认
     */
    public UpdateAbilityChainAssetResponse updateAbilityChainAsset(UpdateAbilityChainAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAbilityChainAssetEx(request, headers, runtime);
    }

    /**
     * Description: 链上资产核销、确认核销成功
     * Summary: 链上资产核销确认
     */
    public UpdateAbilityChainAssetResponse updateAbilityChainAssetEx(UpdateAbilityChainAssetRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.ability.chain.asset.update", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new UpdateAbilityChainAssetResponse());
    }

    /**
     * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
    停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
    注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
     * Summary: SPI-停止服务
     */
    public StopSpProductResponse stopSpProduct(StopSpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopSpProductEx(request, headers, runtime);
    }

    /**
     * Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
    停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
    注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
     * Summary: SPI-停止服务
     */
    public StopSpProductResponse stopSpProductEx(StopSpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.stop", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new StopSpProductResponse());
    }

    /**
     * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
    恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
    注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
     * Summary: SPI-恢复服务
     */
    public ResumeSpProductResponse resumeSpProduct(ResumeSpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resumeSpProductEx(request, headers, runtime);
    }

    /**
     * Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
    恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
    注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
     * Summary: SPI-恢复服务
     */
    public ResumeSpProductResponse resumeSpProductEx(ResumeSpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.resume", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ResumeSpProductResponse());
    }

    /**
     * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
    创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
    异步接口，也支持通过参数指定同步返回。
    能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
    注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
     * Summary: SPI-创建产品实例
     */
    public ProvisionSpProductResponse provisionSpProduct(ProvisionSpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.provisionSpProductEx(request, headers, runtime);
    }

    /**
     * Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
    创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
    异步接口，也支持通过参数指定同步返回。
    能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
    注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
     * Summary: SPI-创建产品实例
     */
    public ProvisionSpProductResponse provisionSpProductEx(ProvisionSpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.provision", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ProvisionSpProductResponse());
    }

    /**
     * Description: 对已有的实例进行规格变更操作。
    支持同步、异步返回结果
    1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
    2.如果变更过程立即生效，则通过sync=true进行返回
    中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
     * Summary: SPI-变更产品实例配置
     */
    public ModifySpProductResponse modifySpProduct(ModifySpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySpProductEx(request, headers, runtime);
    }

    /**
     * Description: 对已有的实例进行规格变更操作。
    支持同步、异步返回结果
    1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
    2.如果变更过程立即生效，则通过sync=true进行返回
    中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
     * Summary: SPI-变更产品实例配置
     */
    public ModifySpProductResponse modifySpProductEx(ModifySpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.modify", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ModifySpProductResponse());
    }

    /**
     * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
    释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
    注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
     * Summary: SPI-释放产品实例
     */
    public ReleaseSpProductResponse releaseSpProduct(ReleaseSpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.releaseSpProductEx(request, headers, runtime);
    }

    /**
     * Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
    释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
    注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
     * Summary: SPI-释放产品实例
     */
    public ReleaseSpProductResponse releaseSpProductEx(ReleaseSpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.release", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ReleaseSpProductResponse());
    }

    /**
     * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
    注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
    接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
     * Summary: SPI-获取产品订单结果
     */
    public GetSpProductOrderResponse getSpProductOrder(GetSpProductOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSpProductOrderEx(request, headers, runtime);
    }

    /**
     * Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
    注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
    接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
     * Summary: SPI-获取产品订单结果
     */
    public GetSpProductOrderResponse getSpProductOrderEx(GetSpProductOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.order.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetSpProductOrderResponse());
    }

    /**
     * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
     * Summary: 从产品方加载购买页参数
     */
    public LoadSpProductOrderparameterResponse loadSpProductOrderparameter(LoadSpProductOrderparameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.loadSpProductOrderparameterEx(request, headers, runtime);
    }

    /**
     * Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
     * Summary: 从产品方加载购买页参数
     */
    public LoadSpProductOrderparameterResponse loadSpProductOrderparameterEx(LoadSpProductOrderparameterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.orderparameter.load", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new LoadSpProductOrderparameterResponse());
    }

    /**
     * Description: 交易结果通知
     * Summary: 交易结果通知
     */
    public SyncIndustryTradeResultResponse syncIndustryTradeResult(SyncIndustryTradeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncIndustryTradeResultEx(request, headers, runtime);
    }

    /**
     * Description: 交易结果通知
     * Summary: 交易结果通知
     */
    public SyncIndustryTradeResultResponse syncIndustryTradeResultEx(SyncIndustryTradeResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.industry.trade.result.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncIndustryTradeResultResponse());
    }

    /**
     * Description: 商家注册结果通知
     * Summary: 商家注册结果通知
     */
    public SyncMerchantSignResultResponse syncMerchantSignResult(SyncMerchantSignResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncMerchantSignResultEx(request, headers, runtime);
    }

    /**
     * Description: 商家注册结果通知
     * Summary: 商家注册结果通知
     */
    public SyncMerchantSignResultResponse syncMerchantSignResultEx(SyncMerchantSignResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.merchant.sign.result.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncMerchantSignResultResponse());
    }

    /**
     * Description: 签约状态变更通知
     * Summary: 签约状态变更通知
     */
    public SyncMerchantAgreementResultResponse syncMerchantAgreementResult(SyncMerchantAgreementResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncMerchantAgreementResultEx(request, headers, runtime);
    }

    /**
     * Description: 签约状态变更通知
     * Summary: 签约状态变更通知
     */
    public SyncMerchantAgreementResultResponse syncMerchantAgreementResultEx(SyncMerchantAgreementResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.merchant.agreement.result.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncMerchantAgreementResultResponse());
    }

    /**
     * Description: pdf
     * Summary: test
     */
    public QueryDemoCccCccResponse queryDemoCccCcc(QueryDemoCccCccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoCccCccEx(request, headers, runtime);
    }

    /**
     * Description: pdf
     * Summary: test
     */
    public QueryDemoCccCccResponse queryDemoCccCccEx(QueryDemoCccCccRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.demo.ccc.ccc.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoCccCccResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）项目签约结果通知
     * Summary: 合作方（伙伴、商家等）项目签约结果通知
     */
    public SyncAcpartnerProjectResultResponse syncAcpartnerProjectResult(SyncAcpartnerProjectResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAcpartnerProjectResultEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）项目签约结果通知
     * Summary: 合作方（伙伴、商家等）项目签约结果通知
     */
    public SyncAcpartnerProjectResultResponse syncAcpartnerProjectResultEx(SyncAcpartnerProjectResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.acpartner.project.result.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAcpartnerProjectResultResponse());
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻结果通知
     * Summary: 合作方（伙伴、商家等）入驻结果通知
     */
    public SyncAcpartnerSettleinResultResponse syncAcpartnerSettleinResult(SyncAcpartnerSettleinResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncAcpartnerSettleinResultEx(request, headers, runtime);
    }

    /**
     * Description: 合作方（伙伴、商家等）入驻结果通知
     * Summary: 合作方（伙伴、商家等）入驻结果通知
     */
    public SyncAcpartnerSettleinResultResponse syncAcpartnerSettleinResultEx(SyncAcpartnerSettleinResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.acpartner.settlein.result.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncAcpartnerSettleinResultResponse());
    }

    /**
     * Description: 交易平台履约结果通知
     * Summary: 交易平台履约结果通知
     */
    public SyncTradeFulfillResultResponse syncTradeFulfillResult(SyncTradeFulfillResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncTradeFulfillResultEx(request, headers, runtime);
    }

    /**
     * Description: 交易平台履约结果通知
     * Summary: 交易平台履约结果通知
     */
    public SyncTradeFulfillResultResponse syncTradeFulfillResultEx(SyncTradeFulfillResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.trade.fulfill.result.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncTradeFulfillResultResponse());
    }

    /**
     * Description: 目前仅通知商品上架状态变更事件
     * Summary: 商品状态变更通知
     */
    public SyncPccCommodityStatusResponse syncPccCommodityStatus(SyncPccCommodityStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncPccCommodityStatusEx(request, headers, runtime);
    }

    /**
     * Description: 目前仅通知商品上架状态变更事件
     * Summary: 商品状态变更通知
     */
    public SyncPccCommodityStatusResponse syncPccCommodityStatusEx(SyncPccCommodityStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.pcc.commodity.status.sync", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SyncPccCommodityStatusResponse());
    }

    /**
     * Description: spi测试
     * Summary: spi测试
     */
    public QueryDemoEchoResponse queryDemoEcho(QueryDemoEchoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDemoEchoEx(request, headers, runtime);
    }

    /**
     * Description: spi测试
     * Summary: spi测试
     */
    public QueryDemoEchoResponse queryDemoEchoEx(QueryDemoEchoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.demo.echo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryDemoEchoResponse());
    }

    /**
     * Description: 逻辑实例创建成功后回调
     * Summary: 逻辑实例创建成功后回调
     */
    public CreateSpProductLogicinstanceResponse createSpProductLogicinstance(CreateSpProductLogicinstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSpProductLogicinstanceEx(request, headers, runtime);
    }

    /**
     * Description: 逻辑实例创建成功后回调
     * Summary: 逻辑实例创建成功后回调
     */
    public CreateSpProductLogicinstanceResponse createSpProductLogicinstanceEx(CreateSpProductLogicinstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.logicinstance.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateSpProductLogicinstanceResponse());
    }

    /**
     * Description: 商品实例续费，支持已经创建的商品，延长生效时间
     * Summary: SPI-商品实例续费
     */
    public RenewSpProductResponse renewSpProduct(RenewSpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renewSpProductEx(request, headers, runtime);
    }

    /**
     * Description: 商品实例续费，支持已经创建的商品，延长生效时间
     * Summary: SPI-商品实例续费
     */
    public RenewSpProductResponse renewSpProductEx(RenewSpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.renew", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new RenewSpProductResponse());
    }

    /**
     * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
     * Summary: 购买页参数传递给产品方校验
     */
    public CheckSpProductOrderparameterResponse checkSpProductOrderparameter(CheckSpProductOrderparameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkSpProductOrderparameterEx(request, headers, runtime);
    }

    /**
     * Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
     * Summary: 购买页参数传递给产品方校验
     */
    public CheckSpProductOrderparameterResponse checkSpProductOrderparameterEx(CheckSpProductOrderparameterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.orderparameter.check", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CheckSpProductOrderparameterResponse());
    }

    /**
     * Description: 开通前通知
     * Summary: 开通前通知
     */
    public PreopenSpProductResponse preopenSpProduct(PreopenSpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.preopenSpProductEx(request, headers, runtime);
    }

    /**
     * Description: 开通前通知
     * Summary: 开通前通知
     */
    public PreopenSpProductResponse preopenSpProductEx(PreopenSpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.preopen", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PreopenSpProductResponse());
    }

    /**
     * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
    开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
    目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
    注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
     * Summary: SPI-开通产品
     */
    public OpenSpProductResponse openSpProduct(OpenSpProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openSpProductEx(request, headers, runtime);
    }

    /**
     * Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
    开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
    目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
    注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
     * Summary: SPI-开通产品
     */
    public OpenSpProductResponse openSpProductEx(OpenSpProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloudspi.sp.product.open", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new OpenSpProductResponse());
    }
}
