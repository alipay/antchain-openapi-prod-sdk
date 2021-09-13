// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade;

import com.aliyun.tea.*;
import com.antgroup.antchain.openapi.trade.models.*;
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
                    new TeaPair("req_time", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getTimestamp()),
                    new TeaPair("req_msg_id", com.antgroup.antchain.openapi.antchain.util.AntchainUtils.getNonce()),
                    new TeaPair("access_key", _accessKeyId),
                    new TeaPair("base_sdk_version", "TeaSDK-2.0"),
                    new TeaPair("sdk_version", "3.6.3")
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
     * Description: 查询租户实例容量信息
     * Summary: 查询租户实例容量信息
     */
    public QueryInstanceCapacityResponse queryInstanceCapacity(QueryInstanceCapacityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryInstanceCapacityEx(request, headers, runtime);
    }

    /**
     * Description: 查询租户实例容量信息
     * Summary: 查询租户实例容量信息
     */
    public QueryInstanceCapacityResponse queryInstanceCapacityEx(QueryInstanceCapacityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.instance.capacity.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryInstanceCapacityResponse());
    }

    /**
     * Description: 优惠券列表查询接口
     * Summary: 优惠券列表查询接口
     */
    public QueryMarketingCouponResponse queryMarketingCoupon(QueryMarketingCouponRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryMarketingCouponEx(request, headers, runtime);
    }

    /**
     * Description: 优惠券列表查询接口
     * Summary: 优惠券列表查询接口
     */
    public QueryMarketingCouponResponse queryMarketingCouponEx(QueryMarketingCouponRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.marketing.coupon.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryMarketingCouponResponse());
    }

    /**
     * Description: 优惠券发放接口，基于模板ID发送优惠券
     * Summary: 优惠券发放接口
     */
    public SendMarketingCouponResponse sendMarketingCoupon(SendMarketingCouponRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendMarketingCouponEx(request, headers, runtime);
    }

    /**
     * Description: 优惠券发放接口，基于模板ID发送优惠券
     * Summary: 优惠券发放接口
     */
    public SendMarketingCouponResponse sendMarketingCouponEx(SendMarketingCouponRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.marketing.coupon.send", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new SendMarketingCouponResponse());
    }

    /**
     * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
     * Summary: 开通类商品自动下单接口
     */
    public CreateOrderAfterResponse createOrderAfter(CreateOrderAfterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrderAfterEx(request, headers, runtime);
    }

    /**
     * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
     * Summary: 开通类商品自动下单接口
     */
    public CreateOrderAfterResponse createOrderAfterEx(CreateOrderAfterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.order.after.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOrderAfterResponse());
    }

    /**
     * Description: 流程编排，创建商品开通接口
     * Summary: 能力编排-商品开通
     */
    public CreateOrderWorkflowResponse createOrderWorkflow(CreateOrderWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrderWorkflowEx(request, headers, runtime);
    }

    /**
     * Description: 流程编排，创建商品开通接口
     * Summary: 能力编排-商品开通
     */
    public CreateOrderWorkflowResponse createOrderWorkflowEx(CreateOrderWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.order.workflow.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOrderWorkflowResponse());
    }

    /**
     * Description: 获取套餐详情接口
     * Summary: 获取套餐详情
     */
    public GetComboResponse getCombo(GetComboRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getComboEx(request, headers, runtime);
    }

    /**
     * Description: 获取套餐详情接口
     * Summary: 获取套餐详情
     */
    public GetComboResponse getComboEx(GetComboRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.get", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new GetComboResponse());
    }

    /**
     * Description: 套餐询价接口
     * Summary: 套餐询价接口
     */
    public QueryComboPriceResponse queryComboPrice(QueryComboPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComboPriceEx(request, headers, runtime);
    }

    /**
     * Description: 套餐询价接口
     * Summary: 套餐询价接口
     */
    public QueryComboPriceResponse queryComboPriceEx(QueryComboPriceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.price.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComboPriceResponse());
    }

    /**
     * Description: 套餐下单接口，支持部分渠道的自动支付
     * Summary: 套餐下单接口
     */
    public CreateComboOrderResponse createComboOrder(CreateComboOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createComboOrderEx(request, headers, runtime);
    }

    /**
     * Description: 套餐下单接口，支持部分渠道的自动支付
     * Summary: 套餐下单接口
     */
    public CreateComboOrderResponse createComboOrderEx(CreateComboOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateComboOrderResponse());
    }

    /**
     * Description: 套餐订单列表分页查询接口
     * Summary: 套餐订单列表分页查询接口
     */
    public QueryComboOrderResponse queryComboOrder(QueryComboOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComboOrderEx(request, headers, runtime);
    }

    /**
     * Description: 套餐订单列表分页查询接口
     * Summary: 套餐订单列表分页查询接口
     */
    public QueryComboOrderResponse queryComboOrderEx(QueryComboOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.order.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComboOrderResponse());
    }

    /**
     * Description: 查询套餐列表，支持分页查询
     * Summary: 查询套餐列表
     */
    public QueryComboResponse queryCombo(QueryComboRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryComboEx(request, headers, runtime);
    }

    /**
     * Description: 查询套餐列表，支持分页查询
     * Summary: 查询套餐列表
     */
    public QueryComboResponse queryComboEx(QueryComboRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryComboResponse());
    }

    /**
     * Description: 套餐订单支付接口
     * Summary: 套餐订单支付接口
     */
    public PayComboOrderResponse payComboOrder(PayComboOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payComboOrderEx(request, headers, runtime);
    }

    /**
     * Description: 套餐订单支付接口
     * Summary: 套餐订单支付接口
     */
    public PayComboOrderResponse payComboOrderEx(PayComboOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.combo.order.pay", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new PayComboOrderResponse());
    }

    /**
     * Description: 通用下单接口，支持单商品下单，支持0元订单自动支付
     * Summary: 通用下单接口
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrderEx(request, headers, runtime);
    }

    /**
     * Description: 通用下单接口，支持单商品下单，支持0元订单自动支付
     * Summary: 通用下单接口
     */
    public CreateOrderResponse createOrderEx(CreateOrderRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.order.create", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new CreateOrderResponse());
    }

    /**
     * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
     * Summary: 判断租户是否存在个性化定价
     */
    public ExistPricePersonalizedResponse existPricePersonalized(ExistPricePersonalizedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.existPricePersonalizedEx(request, headers, runtime);
    }

    /**
     * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
     * Summary: 判断租户是否存在个性化定价
     */
    public ExistPricePersonalizedResponse existPricePersonalizedEx(ExistPricePersonalizedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.price.personalized.exist", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new ExistPricePersonalizedResponse());
    }

    /**
     * Description: 单商品询价接口，支持抵扣优惠券和命中优惠券
     * Summary: 商品询价接口
     */
    public QueryPriceResponse queryPrice(QueryPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPriceEx(request, headers, runtime);
    }

    /**
     * Description: 单商品询价接口，支持抵扣优惠券和命中优惠券
     * Summary: 商品询价接口
     */
    public QueryPriceResponse queryPriceEx(QueryPriceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.price.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryPriceResponse());
    }

    /**
     * Description: 实例接口查询
     * Summary: 实例接口查询
     */
    public QueryWareslifeInstanceResponse queryWareslifeInstance(QueryWareslifeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryWareslifeInstanceEx(request, headers, runtime);
    }

    /**
     * Description: 实例接口查询
     * Summary: 实例接口查询
     */
    public QueryWareslifeInstanceResponse queryWareslifeInstanceEx(QueryWareslifeInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("1.0", "antcloud.trade.wareslife.instance.query", "HTTPS", "POST", "/gateway.do", TeaModel.buildMap(request), headers, runtime), new QueryWareslifeInstanceResponse());
    }
}
