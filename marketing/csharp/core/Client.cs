// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.MARKETING.Models;

namespace AntChain.SDK.MARKETING
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
                        {"sdk_version", "1.2.0"},
                        {"_prod_code", "MARKETING"},
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
                        {"sdk_version", "1.2.0"},
                        {"_prod_code", "MARKETING"},
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
         * Description: 优惠券列表查询接口
         * Summary: 优惠券列表查询接口
         */
        public QueryCouponResponse QueryCoupon(QueryCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCouponEx(request, headers, runtime);
        }

        /**
         * Description: 优惠券列表查询接口
         * Summary: 优惠券列表查询接口
         */
        public async Task<QueryCouponResponse> QueryCouponAsync(QueryCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCouponExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠券列表查询接口
         * Summary: 优惠券列表查询接口
         */
        public QueryCouponResponse QueryCouponEx(QueryCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponResponse>(DoRequest("1.0", "antcloud.marketing.coupon.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券列表查询接口
         * Summary: 优惠券列表查询接口
         */
        public async Task<QueryCouponResponse> QueryCouponExAsync(QueryCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponResponse>(await DoRequestAsync("1.0", "antcloud.marketing.coupon.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口
         */
        public SendCouponResponse SendCoupon(SendCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendCouponEx(request, headers, runtime);
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口
         */
        public async Task<SendCouponResponse> SendCouponAsync(SendCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendCouponExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口
         */
        public SendCouponResponse SendCouponEx(SendCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCouponResponse>(DoRequest("1.0", "antcloud.marketing.coupon.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口
         */
        public async Task<SendCouponResponse> SendCouponExAsync(SendCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCouponResponse>(await DoRequestAsync("1.0", "antcloud.marketing.coupon.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 会员信息首次创建
         * Summary: 线索数据同步
         */
        public CreateLeadClueResponse CreateLeadClue(CreateLeadClueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeadClueEx(request, headers, runtime);
        }

        /**
         * Description: 会员信息首次创建
         * Summary: 线索数据同步
         */
        public async Task<CreateLeadClueResponse> CreateLeadClueAsync(CreateLeadClueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeadClueExAsync(request, headers, runtime);
        }

        /**
         * Description: 会员信息首次创建
         * Summary: 线索数据同步
         */
        public CreateLeadClueResponse CreateLeadClueEx(CreateLeadClueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeadClueResponse>(DoRequest("1.0", "antcloud.marketing.lead.clue.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 会员信息首次创建
         * Summary: 线索数据同步
         */
        public async Task<CreateLeadClueResponse> CreateLeadClueExAsync(CreateLeadClueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeadClueResponse>(await DoRequestAsync("1.0", "antcloud.marketing.lead.clue.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新/添加商机
         * Summary: 添加商机
         */
        public AddLeadBusinessResponse AddLeadBusiness(AddLeadBusinessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddLeadBusinessEx(request, headers, runtime);
        }

        /**
         * Description: 更新/添加商机
         * Summary: 添加商机
         */
        public async Task<AddLeadBusinessResponse> AddLeadBusinessAsync(AddLeadBusinessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddLeadBusinessExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新/添加商机
         * Summary: 添加商机
         */
        public AddLeadBusinessResponse AddLeadBusinessEx(AddLeadBusinessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLeadBusinessResponse>(DoRequest("1.0", "antcloud.marketing.lead.business.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新/添加商机
         * Summary: 添加商机
         */
        public async Task<AddLeadBusinessResponse> AddLeadBusinessExAsync(AddLeadBusinessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLeadBusinessResponse>(await DoRequestAsync("1.0", "antcloud.marketing.lead.business.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券查询(不区分可用与不可用)
        先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
         * Summary: 分页查询优惠券列表
         */
        public QueryCouponPageResponse QueryCouponPage(QueryCouponPageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCouponPageEx(request, headers, runtime);
        }

        /**
         * Description: 优惠券查询(不区分可用与不可用)
        先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
         * Summary: 分页查询优惠券列表
         */
        public async Task<QueryCouponPageResponse> QueryCouponPageAsync(QueryCouponPageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCouponPageExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠券查询(不区分可用与不可用)
        先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
         * Summary: 分页查询优惠券列表
         */
        public QueryCouponPageResponse QueryCouponPageEx(QueryCouponPageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponPageResponse>(DoRequest("1.0", "antcloud.marketing.coupon.page.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券查询(不区分可用与不可用)
        先查询客户的优惠券列表，然后再内存中过滤商品，会导致每页数量不同
         * Summary: 分页查询优惠券列表
         */
        public async Task<QueryCouponPageResponse> QueryCouponPageExAsync(QueryCouponPageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponPageResponse>(await DoRequestAsync("1.0", "antcloud.marketing.coupon.page.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券查询(不区分可用与不可用)
        商品过滤放在SQL里面，从而每页数量一样
         * Summary: 分页查询优惠券列表V2
         */
        public QueryCouponPagelistResponse QueryCouponPagelist(QueryCouponPagelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCouponPagelistEx(request, headers, runtime);
        }

        /**
         * Description: 优惠券查询(不区分可用与不可用)
        商品过滤放在SQL里面，从而每页数量一样
         * Summary: 分页查询优惠券列表V2
         */
        public async Task<QueryCouponPagelistResponse> QueryCouponPagelistAsync(QueryCouponPagelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCouponPagelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠券查询(不区分可用与不可用)
        商品过滤放在SQL里面，从而每页数量一样
         * Summary: 分页查询优惠券列表V2
         */
        public QueryCouponPagelistResponse QueryCouponPagelistEx(QueryCouponPagelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponPagelistResponse>(DoRequest("1.0", "antcloud.marketing.coupon.pagelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券查询(不区分可用与不可用)
        商品过滤放在SQL里面，从而每页数量一样
         * Summary: 分页查询优惠券列表V2
         */
        public async Task<QueryCouponPagelistResponse> QueryCouponPagelistExAsync(QueryCouponPagelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponPagelistResponse>(await DoRequestAsync("1.0", "antcloud.marketing.coupon.pagelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠模板详情
         * Summary: 优惠模板详情
         */
        public QueryYouhuiTemplateResponse QueryYouhuiTemplate(QueryYouhuiTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryYouhuiTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 优惠模板详情
         * Summary: 优惠模板详情
         */
        public async Task<QueryYouhuiTemplateResponse> QueryYouhuiTemplateAsync(QueryYouhuiTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryYouhuiTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠模板详情
         * Summary: 优惠模板详情
         */
        public QueryYouhuiTemplateResponse QueryYouhuiTemplateEx(QueryYouhuiTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYouhuiTemplateResponse>(DoRequest("1.0", "antcloud.marketing.youhui.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠模板详情
         * Summary: 优惠模板详情
         */
        public async Task<QueryYouhuiTemplateResponse> QueryYouhuiTemplateExAsync(QueryYouhuiTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryYouhuiTemplateResponse>(await DoRequestAsync("1.0", "antcloud.marketing.youhui.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口,含错误返回
         */
        public SendCouponAnnotatedResponse SendCouponAnnotated(SendCouponAnnotatedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendCouponAnnotatedEx(request, headers, runtime);
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口,含错误返回
         */
        public async Task<SendCouponAnnotatedResponse> SendCouponAnnotatedAsync(SendCouponAnnotatedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendCouponAnnotatedExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口,含错误返回
         */
        public SendCouponAnnotatedResponse SendCouponAnnotatedEx(SendCouponAnnotatedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCouponAnnotatedResponse>(DoRequest("1.0", "antcloud.marketing.coupon.annotated.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券发放接口，基于模板ID发送优惠券
         * Summary: 优惠券发放接口,含错误返回
         */
        public async Task<SendCouponAnnotatedResponse> SendCouponAnnotatedExAsync(SendCouponAnnotatedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCouponAnnotatedResponse>(await DoRequestAsync("1.0", "antcloud.marketing.coupon.annotated.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取文档内容
         * Summary: 获取文档内容
         */
        public QueryDocResponse QueryDoc(QueryDocRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDocEx(request, headers, runtime);
        }

        /**
         * Description: 获取文档内容
         * Summary: 获取文档内容
         */
        public async Task<QueryDocResponse> QueryDocAsync(QueryDocRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDocExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取文档内容
         * Summary: 获取文档内容
         */
        public QueryDocResponse QueryDocEx(QueryDocRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDocResponse>(DoRequest("1.0", "antcloud.marketing.doc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取文档内容
         * Summary: 获取文档内容
         */
        public async Task<QueryDocResponse> QueryDocExAsync(QueryDocRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDocResponse>(await DoRequestAsync("1.0", "antcloud.marketing.doc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据内容库id和目录id查询子目录
         * Summary: 根据内容库id和目录id查询子目录
         */
        public QueryDocChildResponse QueryDocChild(QueryDocChildRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDocChildEx(request, headers, runtime);
        }

        /**
         * Description: 根据内容库id和目录id查询子目录
         * Summary: 根据内容库id和目录id查询子目录
         */
        public async Task<QueryDocChildResponse> QueryDocChildAsync(QueryDocChildRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDocChildExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据内容库id和目录id查询子目录
         * Summary: 根据内容库id和目录id查询子目录
         */
        public QueryDocChildResponse QueryDocChildEx(QueryDocChildRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDocChildResponse>(DoRequest("1.0", "antcloud.marketing.doc.child.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据内容库id和目录id查询子目录
         * Summary: 根据内容库id和目录id查询子目录
         */
        public async Task<QueryDocChildResponse> QueryDocChildExAsync(QueryDocChildRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDocChildResponse>(await DoRequestAsync("1.0", "antcloud.marketing.doc.child.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
         * Summary: 查询所有可用优惠券列表
         */
        public QueryCouponAvaliableResponse QueryCouponAvaliable(QueryCouponAvaliableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCouponAvaliableEx(request, headers, runtime);
        }

        /**
         * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
         * Summary: 查询所有可用优惠券列表
         */
        public async Task<QueryCouponAvaliableResponse> QueryCouponAvaliableAsync(QueryCouponAvaliableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCouponAvaliableExAsync(request, headers, runtime);
        }

        /**
         * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
         * Summary: 查询所有可用优惠券列表
         */
        public QueryCouponAvaliableResponse QueryCouponAvaliableEx(QueryCouponAvaliableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponAvaliableResponse>(DoRequest("1.0", "antcloud.marketing.coupon.avaliable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 优惠券查询(只查询可用优惠券，提供给收银台使用)
         * Summary: 查询所有可用优惠券列表
         */
        public async Task<QueryCouponAvaliableResponse> QueryCouponAvaliableExAsync(QueryCouponAvaliableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCouponAvaliableResponse>(await DoRequestAsync("1.0", "antcloud.marketing.coupon.avaliable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交活动情报数据
         * Summary: 提交活动情报数据
         */
        public SubmitActivityInformationResponse SubmitActivityInformation(SubmitActivityInformationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitActivityInformationEx(request, headers, runtime);
        }

        /**
         * Description: 提交活动情报数据
         * Summary: 提交活动情报数据
         */
        public async Task<SubmitActivityInformationResponse> SubmitActivityInformationAsync(SubmitActivityInformationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitActivityInformationExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交活动情报数据
         * Summary: 提交活动情报数据
         */
        public SubmitActivityInformationResponse SubmitActivityInformationEx(SubmitActivityInformationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitActivityInformationResponse>(DoRequest("1.0", "antcloud.marketing.activity.information.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交活动情报数据
         * Summary: 提交活动情报数据
         */
        public async Task<SubmitActivityInformationResponse> SubmitActivityInformationExAsync(SubmitActivityInformationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitActivityInformationResponse>(await DoRequestAsync("1.0", "antcloud.marketing.activity.information.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步活动资产信息
         * Summary: 同步活动资产信息
         */
        public SyncActivityAssetsResponse SyncActivityAssets(SyncActivityAssetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncActivityAssetsEx(request, headers, runtime);
        }

        /**
         * Description: 同步活动资产信息
         * Summary: 同步活动资产信息
         */
        public async Task<SyncActivityAssetsResponse> SyncActivityAssetsAsync(SyncActivityAssetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncActivityAssetsExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步活动资产信息
         * Summary: 同步活动资产信息
         */
        public SyncActivityAssetsResponse SyncActivityAssetsEx(SyncActivityAssetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncActivityAssetsResponse>(DoRequest("1.0", "antcloud.marketing.activity.assets.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步活动资产信息
         * Summary: 同步活动资产信息
         */
        public async Task<SyncActivityAssetsResponse> SyncActivityAssetsExAsync(SyncActivityAssetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncActivityAssetsResponse>(await DoRequestAsync("1.0", "antcloud.marketing.activity.assets.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
