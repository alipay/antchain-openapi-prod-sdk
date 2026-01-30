// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.TRADE.Models;

namespace AntChain.SDK.TRADE
{
    public class Client 
    {
        protected string _endpoint;
        protected string _regionId;
        protected string _accessKeyId;
        protected string _accessKeySecret;
        protected string _protocol;
        protected string _userAgent;
        protected int? _readTimeout;
        protected int? _connectTimeout;
        protected string _httpProxy;
        protected string _httpsProxy;
        protected string _socks5Proxy;
        protected string _socks5NetWork;
        protected string _noProxy;
        protected int? _maxIdleConns;
        protected string _securityToken;
        protected int? _maxIdleTimeMillis;
        protected int? _keepAliveDurationMillis;
        protected int? _maxRequests;
        protected int? _maxRequestsPerHost;

        /**
         * Init client with Config
         * @param config config contains the necessary information to create a client
         */
        public Client(Config config)
        {
            if (AlibabaCloud.TeaUtil.Common.IsUnset(config.ToMap()))
            {
                throw new TeaException(new Dictionary<string, string>
                {
                    {"code", "ParameterMissing"},
                    {"message", "'config' can not be unset"},
                });
            }
            this._accessKeyId = config.AccessKeyId;
            this._accessKeySecret = config.AccessKeySecret;
            this._securityToken = config.SecurityToken;
            this._endpoint = config.Endpoint;
            this._protocol = config.Protocol;
            this._userAgent = config.UserAgent;
            this._readTimeout = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.ReadTimeout, 20000);
            this._connectTimeout = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.ConnectTimeout, 20000);
            this._httpProxy = config.HttpProxy;
            this._httpsProxy = config.HttpsProxy;
            this._noProxy = config.NoProxy;
            this._socks5Proxy = config.Socks5Proxy;
            this._socks5NetWork = config.Socks5NetWork;
            this._maxIdleConns = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.MaxIdleConns, 60000);
            this._maxIdleTimeMillis = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.MaxIdleTimeMillis, 5);
            this._keepAliveDurationMillis = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.KeepAliveDurationMillis, 5000);
            this._maxRequests = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.MaxRequests, 100);
            this._maxRequestsPerHost = AlibabaCloud.TeaUtil.Common.DefaultNumber(config.MaxRequestsPerHost, 100);
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
        public Dictionary<string, object> DoRequest(string version, string action, string protocol, string method, string pathname, Dictionary<string, object> request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"timeouted", "retry"},
                {"readTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ReadTimeout, _readTimeout)},
                {"connectTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ConnectTimeout, _connectTimeout)},
                {"httpProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpProxy, _httpProxy)},
                {"httpsProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpsProxy, _httpsProxy)},
                {"noProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.NoProxy, _noProxy)},
                {"maxIdleConns", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxIdleConns, _maxIdleConns)},
                {"maxIdleTimeMillis", _maxIdleTimeMillis},
                {"keepAliveDuration", _keepAliveDurationMillis},
                {"maxRequests", _maxRequests},
                {"maxRequestsPerHost", _maxRequestsPerHost},
                {"retry", new Dictionary<string, object>
                {
                    {"retryable", runtime.Autoretry},
                    {"maxAttempts", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxAttempts, 3)},
                }},
                {"backoff", new Dictionary<string, object>
                {
                    {"policy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.BackoffPolicy, "no")},
                    {"period", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.BackoffPeriod, 1)},
                }},
                {"ignoreSSL", runtime.IgnoreSSL},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Protocol = AlibabaCloud.TeaUtil.Common.DefaultString(_protocol, protocol);
                    request_.Method = method;
                    request_.Pathname = pathname;
                    request_.Query = new Dictionary<string, string>
                    {
                        {"method", action},
                        {"version", version},
                        {"sign_type", "HmacSHA1"},
                        {"req_time", AntChain.AlipayUtil.AntchainUtils.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.AntchainUtils.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "3.15.4"},
                        {"_prod_code", "TRADE"},
                        {"_prod_channel", "undefined"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
                    }
                    request_.Headers = TeaConverter.merge<string>
                    (
                        new Dictionary<string, string>()
                        {
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "openapi.antchain.antgroup.com")},
                            {"user-agent", AlibabaCloud.TeaUtil.Common.GetUserAgent(_userAgent)},
                        },
                        headers
                    );
                    Dictionary<string, object> tmp = AlibabaCloud.TeaUtil.Common.AnyifyMapValue(AlibabaCloud.Commons.Common.Query(request));
                    request_.Body = TeaCore.BytesReadable(AlibabaCloud.TeaUtil.Common.ToFormString(tmp));
                    request_.Headers["content-type"] = "application/x-www-form-urlencoded";
                    Dictionary<string, string> signedParam = TeaConverter.merge<string>
                    (
                        request_.Query,
                        AlibabaCloud.Commons.Common.Query(request)
                    );
                    request_.Query["sign"] = AntChain.AlipayUtil.AntchainUtils.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = TeaCore.DoAction(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.AntchainUtils.HasError(raw, _accessKeySecret))
                    {
                        throw new TeaException(new Dictionary<string, object>
                        {
                            {"message", resp.Get("result_msg")},
                            {"data", resp},
                            {"code", resp.Get("result_code")},
                        });
                    }
                    return resp;
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
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
        public async Task<Dictionary<string, object>> DoRequestAsync(string version, string action, string protocol, string method, string pathname, Dictionary<string, object> request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"timeouted", "retry"},
                {"readTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ReadTimeout, _readTimeout)},
                {"connectTimeout", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.ConnectTimeout, _connectTimeout)},
                {"httpProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpProxy, _httpProxy)},
                {"httpsProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.HttpsProxy, _httpsProxy)},
                {"noProxy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.NoProxy, _noProxy)},
                {"maxIdleConns", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxIdleConns, _maxIdleConns)},
                {"maxIdleTimeMillis", _maxIdleTimeMillis},
                {"keepAliveDuration", _keepAliveDurationMillis},
                {"maxRequests", _maxRequests},
                {"maxRequestsPerHost", _maxRequestsPerHost},
                {"retry", new Dictionary<string, object>
                {
                    {"retryable", runtime.Autoretry},
                    {"maxAttempts", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.MaxAttempts, 3)},
                }},
                {"backoff", new Dictionary<string, object>
                {
                    {"policy", AlibabaCloud.TeaUtil.Common.DefaultString(runtime.BackoffPolicy, "no")},
                    {"period", AlibabaCloud.TeaUtil.Common.DefaultNumber(runtime.BackoffPeriod, 1)},
                }},
                {"ignoreSSL", runtime.IgnoreSSL},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Protocol = AlibabaCloud.TeaUtil.Common.DefaultString(_protocol, protocol);
                    request_.Method = method;
                    request_.Pathname = pathname;
                    request_.Query = new Dictionary<string, string>
                    {
                        {"method", action},
                        {"version", version},
                        {"sign_type", "HmacSHA1"},
                        {"req_time", AntChain.AlipayUtil.AntchainUtils.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.AntchainUtils.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "3.15.4"},
                        {"_prod_code", "TRADE"},
                        {"_prod_channel", "undefined"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
                    }
                    request_.Headers = TeaConverter.merge<string>
                    (
                        new Dictionary<string, string>()
                        {
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "openapi.antchain.antgroup.com")},
                            {"user-agent", AlibabaCloud.TeaUtil.Common.GetUserAgent(_userAgent)},
                        },
                        headers
                    );
                    Dictionary<string, object> tmp = AlibabaCloud.TeaUtil.Common.AnyifyMapValue(AlibabaCloud.Commons.Common.Query(request));
                    request_.Body = TeaCore.BytesReadable(AlibabaCloud.TeaUtil.Common.ToFormString(tmp));
                    request_.Headers["content-type"] = "application/x-www-form-urlencoded";
                    Dictionary<string, string> signedParam = TeaConverter.merge<string>
                    (
                        request_.Query,
                        AlibabaCloud.Commons.Common.Query(request)
                    );
                    request_.Query["sign"] = AntChain.AlipayUtil.AntchainUtils.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = await TeaCore.DoActionAsync(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.AntchainUtils.HasError(raw, _accessKeySecret))
                    {
                        throw new TeaException(new Dictionary<string, object>
                        {
                            {"message", resp.Get("result_msg")},
                            {"data", resp},
                            {"code", resp.Get("result_code")},
                        });
                    }
                    return resp;
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
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
        public QueryInstanceCapacityResponse QueryInstanceCapacity(QueryInstanceCapacityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInstanceCapacityEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户实例容量信息
         * Summary: 查询租户实例容量信息
         */
        public async Task<QueryInstanceCapacityResponse> QueryInstanceCapacityAsync(QueryInstanceCapacityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInstanceCapacityExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户实例容量信息
         * Summary: 查询租户实例容量信息
         */
        public QueryInstanceCapacityResponse QueryInstanceCapacityEx(QueryInstanceCapacityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceCapacityResponse>(DoRequest("1.0", "antcloud.trade.instance.capacity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户实例容量信息
         * Summary: 查询租户实例容量信息
         */
        public async Task<QueryInstanceCapacityResponse> QueryInstanceCapacityExAsync(QueryInstanceCapacityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInstanceCapacityResponse>(await DoRequestAsync("1.0", "antcloud.trade.instance.capacity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券列表查询接口
         * Summary: 优惠券列表查询接口
         */
        public QueryMarketingCouponResponse QueryMarketingCoupon(QueryMarketingCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMarketingCouponEx(request, headers, runtime);
        }

        /**
         * Description: 优惠券列表查询接口
         * Summary: 优惠券列表查询接口
         */
        public async Task<QueryMarketingCouponResponse> QueryMarketingCouponAsync(QueryMarketingCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMarketingCouponExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠券列表查询接口
         * Summary: 优惠券列表查询接口
         */
        public QueryMarketingCouponResponse QueryMarketingCouponEx(QueryMarketingCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMarketingCouponResponse>(DoRequest("1.0", "antcloud.trade.marketing.coupon.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券列表查询接口
         * Summary: 优惠券列表查询接口
         */
        public async Task<QueryMarketingCouponResponse> QueryMarketingCouponExAsync(QueryMarketingCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMarketingCouponResponse>(await DoRequestAsync("1.0", "antcloud.trade.marketing.coupon.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口
         */
        public SendMarketingCouponResponse SendMarketingCoupon(SendMarketingCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendMarketingCouponEx(request, headers, runtime);
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口
         */
        public async Task<SendMarketingCouponResponse> SendMarketingCouponAsync(SendMarketingCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendMarketingCouponExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口
         */
        public SendMarketingCouponResponse SendMarketingCouponEx(SendMarketingCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendMarketingCouponResponse>(DoRequest("1.0", "antcloud.trade.marketing.coupon.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口
         */
        public async Task<SendMarketingCouponResponse> SendMarketingCouponExAsync(SendMarketingCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendMarketingCouponResponse>(await DoRequestAsync("1.0", "antcloud.trade.marketing.coupon.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于线下sit调试完成的商品commonBuy信息一件上线
         * Summary: 商品commonBuy配置信息同步
         */
        public SyncOfferCommonbuyResponse SyncOfferCommonbuy(SyncOfferCommonbuyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncOfferCommonbuyEx(request, headers, runtime);
        }

        /**
         * Description: 用于线下sit调试完成的商品commonBuy信息一件上线
         * Summary: 商品commonBuy配置信息同步
         */
        public async Task<SyncOfferCommonbuyResponse> SyncOfferCommonbuyAsync(SyncOfferCommonbuyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncOfferCommonbuyExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于线下sit调试完成的商品commonBuy信息一件上线
         * Summary: 商品commonBuy配置信息同步
         */
        public SyncOfferCommonbuyResponse SyncOfferCommonbuyEx(SyncOfferCommonbuyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncOfferCommonbuyResponse>(DoRequest("1.0", "antcloud.trade.offer.commonbuy.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于线下sit调试完成的商品commonBuy信息一件上线
         * Summary: 商品commonBuy配置信息同步
         */
        public async Task<SyncOfferCommonbuyResponse> SyncOfferCommonbuyExAsync(SyncOfferCommonbuyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncOfferCommonbuyResponse>(await DoRequestAsync("1.0", "antcloud.trade.offer.commonbuy.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
         * Summary: 开通类商品自动下单接口
         */
        public CreateOrderAfterResponse CreateOrderAfter(CreateOrderAfterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOrderAfterEx(request, headers, runtime);
        }

        /**
         * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
         * Summary: 开通类商品自动下单接口
         */
        public async Task<CreateOrderAfterResponse> CreateOrderAfterAsync(CreateOrderAfterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOrderAfterExAsync(request, headers, runtime);
        }

        /**
         * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
         * Summary: 开通类商品自动下单接口
         */
        public CreateOrderAfterResponse CreateOrderAfterEx(CreateOrderAfterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderAfterResponse>(DoRequest("1.0", "antcloud.trade.order.after.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通类商品自动下单接口，仅仅针对其下后付开通类商品。预付等涉及金额暂不支持。
         * Summary: 开通类商品自动下单接口
         */
        public async Task<CreateOrderAfterResponse> CreateOrderAfterExAsync(CreateOrderAfterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderAfterResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.after.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流程编排，创建商品开通接口
         * Summary: 能力编排-商品开通
         */
        public CreateOrderWorkflowResponse CreateOrderWorkflow(CreateOrderWorkflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOrderWorkflowEx(request, headers, runtime);
        }

        /**
         * Description: 流程编排，创建商品开通接口
         * Summary: 能力编排-商品开通
         */
        public async Task<CreateOrderWorkflowResponse> CreateOrderWorkflowAsync(CreateOrderWorkflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOrderWorkflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 流程编排，创建商品开通接口
         * Summary: 能力编排-商品开通
         */
        public CreateOrderWorkflowResponse CreateOrderWorkflowEx(CreateOrderWorkflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderWorkflowResponse>(DoRequest("1.0", "antcloud.trade.order.workflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流程编排，创建商品开通接口
         * Summary: 能力编排-商品开通
         */
        public async Task<CreateOrderWorkflowResponse> CreateOrderWorkflowExAsync(CreateOrderWorkflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderWorkflowResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.workflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取套餐详情接口
         * Summary: 获取套餐详情
         */
        public GetComboResponse GetCombo(GetComboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetComboEx(request, headers, runtime);
        }

        /**
         * Description: 获取套餐详情接口
         * Summary: 获取套餐详情
         */
        public async Task<GetComboResponse> GetComboAsync(GetComboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetComboExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取套餐详情接口
         * Summary: 获取套餐详情
         */
        public GetComboResponse GetComboEx(GetComboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetComboResponse>(DoRequest("1.0", "antcloud.trade.combo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取套餐详情接口
         * Summary: 获取套餐详情
         */
        public async Task<GetComboResponse> GetComboExAsync(GetComboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetComboResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐询价接口
         * Summary: 套餐询价接口
         */
        public QueryComboPriceResponse QueryComboPrice(QueryComboPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComboPriceEx(request, headers, runtime);
        }

        /**
         * Description: 套餐询价接口
         * Summary: 套餐询价接口
         */
        public async Task<QueryComboPriceResponse> QueryComboPriceAsync(QueryComboPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComboPriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 套餐询价接口
         * Summary: 套餐询价接口
         */
        public QueryComboPriceResponse QueryComboPriceEx(QueryComboPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComboPriceResponse>(DoRequest("1.0", "antcloud.trade.combo.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐询价接口
         * Summary: 套餐询价接口
         */
        public async Task<QueryComboPriceResponse> QueryComboPriceExAsync(QueryComboPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComboPriceResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐下单接口，支持部分渠道的自动支付
         * Summary: 套餐下单接口
         */
        public CreateComboOrderResponse CreateComboOrder(CreateComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateComboOrderEx(request, headers, runtime);
        }

        /**
         * Description: 套餐下单接口，支持部分渠道的自动支付
         * Summary: 套餐下单接口
         */
        public async Task<CreateComboOrderResponse> CreateComboOrderAsync(CreateComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateComboOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 套餐下单接口，支持部分渠道的自动支付
         * Summary: 套餐下单接口
         */
        public CreateComboOrderResponse CreateComboOrderEx(CreateComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateComboOrderResponse>(DoRequest("1.0", "antcloud.trade.combo.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐下单接口，支持部分渠道的自动支付
         * Summary: 套餐下单接口
         */
        public async Task<CreateComboOrderResponse> CreateComboOrderExAsync(CreateComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateComboOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐订单列表分页查询接口
         * Summary: 套餐订单列表分页查询接口
         */
        public QueryComboOrderResponse QueryComboOrder(QueryComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComboOrderEx(request, headers, runtime);
        }

        /**
         * Description: 套餐订单列表分页查询接口
         * Summary: 套餐订单列表分页查询接口
         */
        public async Task<QueryComboOrderResponse> QueryComboOrderAsync(QueryComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComboOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 套餐订单列表分页查询接口
         * Summary: 套餐订单列表分页查询接口
         */
        public QueryComboOrderResponse QueryComboOrderEx(QueryComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComboOrderResponse>(DoRequest("1.0", "antcloud.trade.combo.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐订单列表分页查询接口
         * Summary: 套餐订单列表分页查询接口
         */
        public async Task<QueryComboOrderResponse> QueryComboOrderExAsync(QueryComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComboOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询套餐列表，支持分页查询
         * Summary: 查询套餐列表
         */
        public QueryComboResponse QueryCombo(QueryComboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryComboEx(request, headers, runtime);
        }

        /**
         * Description: 查询套餐列表，支持分页查询
         * Summary: 查询套餐列表
         */
        public async Task<QueryComboResponse> QueryComboAsync(QueryComboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryComboExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询套餐列表，支持分页查询
         * Summary: 查询套餐列表
         */
        public QueryComboResponse QueryComboEx(QueryComboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComboResponse>(DoRequest("1.0", "antcloud.trade.combo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询套餐列表，支持分页查询
         * Summary: 查询套餐列表
         */
        public async Task<QueryComboResponse> QueryComboExAsync(QueryComboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryComboResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐订单支付接口
         * Summary: 套餐订单支付接口
         */
        public PayComboOrderResponse PayComboOrder(PayComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayComboOrderEx(request, headers, runtime);
        }

        /**
         * Description: 套餐订单支付接口
         * Summary: 套餐订单支付接口
         */
        public async Task<PayComboOrderResponse> PayComboOrderAsync(PayComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayComboOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 套餐订单支付接口
         * Summary: 套餐订单支付接口
         */
        public PayComboOrderResponse PayComboOrderEx(PayComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayComboOrderResponse>(DoRequest("1.0", "antcloud.trade.combo.order.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐订单支付接口
         * Summary: 套餐订单支付接口
         */
        public async Task<PayComboOrderResponse> PayComboOrderExAsync(PayComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayComboOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.order.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单商品通用下单接口
         * Summary: 通用下单接口
         */
        public CreateOrderResponse CreateOrder(CreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOrderEx(request, headers, runtime);
        }

        /**
         * Description: 单商品通用下单接口
         * Summary: 通用下单接口
         */
        public async Task<CreateOrderResponse> CreateOrderAsync(CreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 单商品通用下单接口
         * Summary: 通用下单接口
         */
        public CreateOrderResponse CreateOrderEx(CreateOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderResponse>(DoRequest("1.0", "antcloud.trade.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单商品通用下单接口
         * Summary: 通用下单接口
         */
        public async Task<CreateOrderResponse> CreateOrderExAsync(CreateOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐订单详情查询接口
         * Summary: 套餐订单详情查询接口
         */
        public GetComboOrderResponse GetComboOrder(GetComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetComboOrderEx(request, headers, runtime);
        }

        /**
         * Description: 套餐订单详情查询接口
         * Summary: 套餐订单详情查询接口
         */
        public async Task<GetComboOrderResponse> GetComboOrderAsync(GetComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetComboOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 套餐订单详情查询接口
         * Summary: 套餐订单详情查询接口
         */
        public GetComboOrderResponse GetComboOrderEx(GetComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetComboOrderResponse>(DoRequest("1.0", "antcloud.trade.combo.order.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 套餐订单详情查询接口
         * Summary: 套餐订单详情查询接口
         */
        public async Task<GetComboOrderResponse> GetComboOrderExAsync(GetComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetComboOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.order.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消下单接口
         * Summary: 取消下单接口
         */
        public CancelOrderResponse CancelOrder(CancelOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelOrderEx(request, headers, runtime);
        }

        /**
         * Description: 取消下单接口
         * Summary: 取消下单接口
         */
        public async Task<CancelOrderResponse> CancelOrderAsync(CancelOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消下单接口
         * Summary: 取消下单接口
         */
        public CancelOrderResponse CancelOrderEx(CancelOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelOrderResponse>(DoRequest("1.0", "antcloud.trade.order.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消下单接口
         * Summary: 取消下单接口
         */
        public async Task<CancelOrderResponse> CancelOrderExAsync(CancelOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品通用批量下单接口
         * Summary: 通用批量下单接口
         */
        public BatchcreateOrderResponse BatchcreateOrder(BatchcreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateOrderEx(request, headers, runtime);
        }

        /**
         * Description: 商品通用批量下单接口
         * Summary: 通用批量下单接口
         */
        public async Task<BatchcreateOrderResponse> BatchcreateOrderAsync(BatchcreateOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品通用批量下单接口
         * Summary: 通用批量下单接口
         */
        public BatchcreateOrderResponse BatchcreateOrderEx(BatchcreateOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateOrderResponse>(DoRequest("1.0", "antcloud.trade.order.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品通用批量下单接口
         * Summary: 通用批量下单接口
         */
        public async Task<BatchcreateOrderResponse> BatchcreateOrderExAsync(BatchcreateOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用订单批量取消接口
         * Summary: 通用订单批量取消接口
         */
        public BatchcancelOrderResponse BatchcancelOrder(BatchcancelOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcancelOrderEx(request, headers, runtime);
        }

        /**
         * Description: 通用订单批量取消接口
         * Summary: 通用订单批量取消接口
         */
        public async Task<BatchcancelOrderResponse> BatchcancelOrderAsync(BatchcancelOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcancelOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用订单批量取消接口
         * Summary: 通用订单批量取消接口
         */
        public BatchcancelOrderResponse BatchcancelOrderEx(BatchcancelOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcancelOrderResponse>(DoRequest("1.0", "antcloud.trade.order.batchcancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用订单批量取消接口
         * Summary: 通用订单批量取消接口
         */
        public async Task<BatchcancelOrderResponse> BatchcancelOrderExAsync(BatchcancelOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcancelOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.batchcancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在订单非自动履约场景，手动触发执行
         * Summary: 触发订单的履约执行
         */
        public ExecOrderResponse ExecOrder(ExecOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecOrderEx(request, headers, runtime);
        }

        /**
         * Description: 在订单非自动履约场景，手动触发执行
         * Summary: 触发订单的履约执行
         */
        public async Task<ExecOrderResponse> ExecOrderAsync(ExecOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 在订单非自动履约场景，手动触发执行
         * Summary: 触发订单的履约执行
         */
        public ExecOrderResponse ExecOrderEx(ExecOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecOrderResponse>(DoRequest("1.0", "antcloud.trade.order.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在订单非自动履约场景，手动触发执行
         * Summary: 触发订单的履约执行
         */
        public async Task<ExecOrderResponse> ExecOrderExAsync(ExecOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在订单非自动履约场景，撤销订单并退款
         * Summary: 订单退款
         */
        public RefundOrderResponse RefundOrder(RefundOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefundOrderEx(request, headers, runtime);
        }

        /**
         * Description: 在订单非自动履约场景，撤销订单并退款
         * Summary: 订单退款
         */
        public async Task<RefundOrderResponse> RefundOrderAsync(RefundOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefundOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 在订单非自动履约场景，撤销订单并退款
         * Summary: 订单退款
         */
        public RefundOrderResponse RefundOrderEx(RefundOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefundOrderResponse>(DoRequest("1.0", "antcloud.trade.order.refund", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在订单非自动履约场景，撤销订单并退款
         * Summary: 订单退款
         */
        public async Task<RefundOrderResponse> RefundOrderExAsync(RefundOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefundOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.refund", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
         * Summary: 判断租户是否存在个性化定价
         */
        public ExistPricePersonalizedResponse ExistPricePersonalized(ExistPricePersonalizedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistPricePersonalizedEx(request, headers, runtime);
        }

        /**
         * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
         * Summary: 判断租户是否存在个性化定价
         */
        public async Task<ExistPricePersonalizedResponse> ExistPricePersonalizedAsync(ExistPricePersonalizedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistPricePersonalizedExAsync(request, headers, runtime);
        }

        /**
         * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
         * Summary: 判断租户是否存在个性化定价
         */
        public ExistPricePersonalizedResponse ExistPricePersonalizedEx(ExistPricePersonalizedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistPricePersonalizedResponse>(DoRequest("1.0", "antcloud.trade.price.personalized.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 仅支持查询租户在后付费商品下，是否存在个性化定价
         * Summary: 判断租户是否存在个性化定价
         */
        public async Task<ExistPricePersonalizedResponse> ExistPricePersonalizedExAsync(ExistPricePersonalizedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistPricePersonalizedResponse>(await DoRequestAsync("1.0", "antcloud.trade.price.personalized.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
         * Summary: 商品询价接口
         */
        public QueryPriceResponse QueryPrice(QueryPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPriceEx(request, headers, runtime);
        }

        /**
         * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
         * Summary: 商品询价接口
         */
        public async Task<QueryPriceResponse> QueryPriceAsync(QueryPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPriceExAsync(request, headers, runtime);
        }

        /**
         * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
         * Summary: 商品询价接口
         */
        public QueryPriceResponse QueryPriceEx(QueryPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPriceResponse>(DoRequest("1.0", "antcloud.trade.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
         * Summary: 商品询价接口
         */
        public async Task<QueryPriceResponse> QueryPriceExAsync(QueryPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPriceResponse>(await DoRequestAsync("1.0", "antcloud.trade.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实例接口查询
         * Summary: 实例接口查询
         */
        public QueryWareslifeInstanceResponse QueryWareslifeInstance(QueryWareslifeInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWareslifeInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 实例接口查询
         * Summary: 实例接口查询
         */
        public async Task<QueryWareslifeInstanceResponse> QueryWareslifeInstanceAsync(QueryWareslifeInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWareslifeInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 实例接口查询
         * Summary: 实例接口查询
         */
        public QueryWareslifeInstanceResponse QueryWareslifeInstanceEx(QueryWareslifeInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWareslifeInstanceResponse>(DoRequest("1.0", "antcloud.trade.wareslife.instance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实例接口查询
         * Summary: 实例接口查询
         */
        public async Task<QueryWareslifeInstanceResponse> QueryWareslifeInstanceExAsync(QueryWareslifeInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWareslifeInstanceResponse>(await DoRequestAsync("1.0", "antcloud.trade.wareslife.instance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
