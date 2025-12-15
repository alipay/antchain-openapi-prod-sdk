// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.INSURANCE_SAAS.Models;

namespace AntChain.SDK.INSURANCE_SAAS
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
                        {"sdk_version", "1.11.0"},
                        {"_prod_code", "INSURANCE_SAAS"},
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
                        {"sdk_version", "1.11.0"},
                        {"_prod_code", "INSURANCE_SAAS"},
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
         * Description: 保险询报价结果查询
         * Summary: 保险询报价结果查询
         */
        public QueryInquiryResponse QueryInquiry(QueryInquiryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInquiryEx(request, headers, runtime);
        }

        /**
         * Description: 保险询报价结果查询
         * Summary: 保险询报价结果查询
         */
        public async Task<QueryInquiryResponse> QueryInquiryAsync(QueryInquiryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInquiryExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险询报价结果查询
         * Summary: 保险询报价结果查询
         */
        public QueryInquiryResponse QueryInquiryEx(QueryInquiryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInquiryResponse>(DoRequest("1.0", "antcloud.insurance.inquiry.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险询报价结果查询
         * Summary: 保险询报价结果查询
         */
        public async Task<QueryInquiryResponse> QueryInquiryExAsync(QueryInquiryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInquiryResponse>(await DoRequestAsync("1.0", "antcloud.insurance.inquiry.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险产品询价
         * Summary: 保险产品询价
         */
        public SubmitInquiryResponse SubmitInquiry(SubmitInquiryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInquiryEx(request, headers, runtime);
        }

        /**
         * Description: 保险产品询价
         * Summary: 保险产品询价
         */
        public async Task<SubmitInquiryResponse> SubmitInquiryAsync(SubmitInquiryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInquiryExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险产品询价
         * Summary: 保险产品询价
         */
        public SubmitInquiryResponse SubmitInquiryEx(SubmitInquiryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInquiryResponse>(DoRequest("1.0", "antcloud.insurance.inquiry.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险产品询价
         * Summary: 保险产品询价
         */
        public async Task<SubmitInquiryResponse> SubmitInquiryExAsync(SubmitInquiryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInquiryResponse>(await DoRequestAsync("1.0", "antcloud.insurance.inquiry.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 历史灾害查询
         * Summary: 历史灾害数据查询
         */
        public QueryDataDisasterResponse QueryDataDisaster(QueryDataDisasterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDataDisasterEx(request, headers, runtime);
        }

        /**
         * Description: 历史灾害查询
         * Summary: 历史灾害数据查询
         */
        public async Task<QueryDataDisasterResponse> QueryDataDisasterAsync(QueryDataDisasterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDataDisasterExAsync(request, headers, runtime);
        }

        /**
         * Description: 历史灾害查询
         * Summary: 历史灾害数据查询
         */
        public QueryDataDisasterResponse QueryDataDisasterEx(QueryDataDisasterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataDisasterResponse>(DoRequest("1.0", "antcloud.insurance.data.disaster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 历史灾害查询
         * Summary: 历史灾害数据查询
         */
        public async Task<QueryDataDisasterResponse> QueryDataDisasterExAsync(QueryDataDisasterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataDisasterResponse>(await DoRequestAsync("1.0", "antcloud.insurance.data.disaster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实时天气预警
         * Summary: 实时天气预警
         */
        public QueryDataWeatherResponse QueryDataWeather(QueryDataWeatherRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDataWeatherEx(request, headers, runtime);
        }

        /**
         * Description: 实时天气预警
         * Summary: 实时天气预警
         */
        public async Task<QueryDataWeatherResponse> QueryDataWeatherAsync(QueryDataWeatherRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDataWeatherExAsync(request, headers, runtime);
        }

        /**
         * Description: 实时天气预警
         * Summary: 实时天气预警
         */
        public QueryDataWeatherResponse QueryDataWeatherEx(QueryDataWeatherRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataWeatherResponse>(DoRequest("1.0", "antcloud.insurance.data.weather.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实时天气预警
         * Summary: 实时天气预警
         */
        public async Task<QueryDataWeatherResponse> QueryDataWeatherExAsync(QueryDataWeatherRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataWeatherResponse>(await DoRequestAsync("1.0", "antcloud.insurance.data.weather.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报价接口同步接口
         * Summary: 报价接口同步接口
         */
        public SyncQuoteResponse SyncQuote(SyncQuoteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncQuoteEx(request, headers, runtime);
        }

        /**
         * Description: 报价接口同步接口
         * Summary: 报价接口同步接口
         */
        public async Task<SyncQuoteResponse> SyncQuoteAsync(SyncQuoteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncQuoteExAsync(request, headers, runtime);
        }

        /**
         * Description: 报价接口同步接口
         * Summary: 报价接口同步接口
         */
        public SyncQuoteResponse SyncQuoteEx(SyncQuoteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncQuoteResponse>(DoRequest("1.0", "antcloud.insurance.quote.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报价接口同步接口
         * Summary: 报价接口同步接口
         */
        public async Task<SyncQuoteResponse> SyncQuoteExAsync(SyncQuoteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncQuoteResponse>(await DoRequestAsync("1.0", "antcloud.insurance.quote.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 承保自核申请接口
         * Summary: 承保自核申请接口
         */
        public ApplyUnderwritingResponse ApplyUnderwriting(ApplyUnderwritingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyUnderwritingEx(request, headers, runtime);
        }

        /**
         * Description: 承保自核申请接口
         * Summary: 承保自核申请接口
         */
        public async Task<ApplyUnderwritingResponse> ApplyUnderwritingAsync(ApplyUnderwritingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyUnderwritingExAsync(request, headers, runtime);
        }

        /**
         * Description: 承保自核申请接口
         * Summary: 承保自核申请接口
         */
        public ApplyUnderwritingResponse ApplyUnderwritingEx(ApplyUnderwritingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyUnderwritingResponse>(DoRequest("1.0", "antcloud.insurance.underwriting.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 承保自核申请接口
         * Summary: 承保自核申请接口
         */
        public async Task<ApplyUnderwritingResponse> ApplyUnderwritingExAsync(ApplyUnderwritingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyUnderwritingResponse>(await DoRequestAsync("1.0", "antcloud.insurance.underwriting.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 承保自核结果查询接口
         * Summary: 承保自核结果查询接口
         */
        public QueryUnderwritingResponse QueryUnderwriting(QueryUnderwritingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnderwritingEx(request, headers, runtime);
        }

        /**
         * Description: 承保自核结果查询接口
         * Summary: 承保自核结果查询接口
         */
        public async Task<QueryUnderwritingResponse> QueryUnderwritingAsync(QueryUnderwritingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnderwritingExAsync(request, headers, runtime);
        }

        /**
         * Description: 承保自核结果查询接口
         * Summary: 承保自核结果查询接口
         */
        public QueryUnderwritingResponse QueryUnderwritingEx(QueryUnderwritingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnderwritingResponse>(DoRequest("1.0", "antcloud.insurance.underwriting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 承保自核结果查询接口
         * Summary: 承保自核结果查询接口
         */
        public async Task<QueryUnderwritingResponse> QueryUnderwritingExAsync(QueryUnderwritingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnderwritingResponse>(await DoRequestAsync("1.0", "antcloud.insurance.underwriting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
         * Summary: 保险科技保单附件查询接口
         */
        public QueryPolicyFileResponse QueryPolicyFile(QueryPolicyFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPolicyFileEx(request, headers, runtime);
        }

        /**
         * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
         * Summary: 保险科技保单附件查询接口
         */
        public async Task<QueryPolicyFileResponse> QueryPolicyFileAsync(QueryPolicyFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPolicyFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
         * Summary: 保险科技保单附件查询接口
         */
        public QueryPolicyFileResponse QueryPolicyFileEx(QueryPolicyFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPolicyFileResponse>(DoRequest("1.0", "antcloud.insurance.policy.file.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据保单号查询保单附件，并返回一个有效期为7天的ossurl
         * Summary: 保险科技保单附件查询接口
         */
        public async Task<QueryPolicyFileResponse> QueryPolicyFileExAsync(QueryPolicyFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPolicyFileResponse>(await DoRequestAsync("1.0", "antcloud.insurance.policy.file.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险SaaS投保申请接口
         * Summary: 投保申请接口
         */
        public ApplyInsureResponse ApplyInsure(ApplyInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsureEx(request, headers, runtime);
        }

        /**
         * Description: 保险SaaS投保申请接口
         * Summary: 投保申请接口
         */
        public async Task<ApplyInsureResponse> ApplyInsureAsync(ApplyInsureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsureExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险SaaS投保申请接口
         * Summary: 投保申请接口
         */
        public ApplyInsureResponse ApplyInsureEx(ApplyInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsureResponse>(DoRequest("1.0", "antcloud.insurance.insure.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险SaaS投保申请接口
         * Summary: 投保申请接口
         */
        public async Task<ApplyInsureResponse> ApplyInsureExAsync(ApplyInsureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsureResponse>(await DoRequestAsync("1.0", "antcloud.insurance.insure.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
         * Summary: 保单结果同步（依赖投保申请）
         */
        public NotifyPolicyResultResponse NotifyPolicyResult(NotifyPolicyResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyPolicyResultEx(request, headers, runtime);
        }

        /**
         * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
         * Summary: 保单结果同步（依赖投保申请）
         */
        public async Task<NotifyPolicyResultResponse> NotifyPolicyResultAsync(NotifyPolicyResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyPolicyResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
         * Summary: 保单结果同步（依赖投保申请）
         */
        public NotifyPolicyResultResponse NotifyPolicyResultEx(NotifyPolicyResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyPolicyResultResponse>(DoRequest("1.0", "antcloud.insurance.policy.result.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单结果同步，注意：基于投保信息的保单结果同步。
         * Summary: 保单结果同步（依赖投保申请）
         */
        public async Task<NotifyPolicyResultResponse> NotifyPolicyResultExAsync(NotifyPolicyResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyPolicyResultResponse>(await DoRequestAsync("1.0", "antcloud.insurance.policy.result.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报案接口
         * Summary: 保险科技 报案接口
         */
        public ApplyClaimResponse ApplyClaim(ApplyClaimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyClaimEx(request, headers, runtime);
        }

        /**
         * Description: 报案接口
         * Summary: 保险科技 报案接口
         */
        public async Task<ApplyClaimResponse> ApplyClaimAsync(ApplyClaimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyClaimExAsync(request, headers, runtime);
        }

        /**
         * Description: 报案接口
         * Summary: 保险科技 报案接口
         */
        public ApplyClaimResponse ApplyClaimEx(ApplyClaimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyClaimResponse>(DoRequest("1.0", "antcloud.insurance.claim.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报案接口
         * Summary: 保险科技 报案接口
         */
        public async Task<ApplyClaimResponse> ApplyClaimExAsync(ApplyClaimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyClaimResponse>(await DoRequestAsync("1.0", "antcloud.insurance.claim.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报案撤销（场景端）
         * Summary: 报案撤销（场景端）
         */
        public CancelClaimResponse CancelClaim(CancelClaimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelClaimEx(request, headers, runtime);
        }

        /**
         * Description: 报案撤销（场景端）
         * Summary: 报案撤销（场景端）
         */
        public async Task<CancelClaimResponse> CancelClaimAsync(CancelClaimRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelClaimExAsync(request, headers, runtime);
        }

        /**
         * Description: 报案撤销（场景端）
         * Summary: 报案撤销（场景端）
         */
        public CancelClaimResponse CancelClaimEx(CancelClaimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelClaimResponse>(DoRequest("1.0", "antcloud.insurance.claim.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报案撤销（场景端）
         * Summary: 报案撤销（场景端）
         */
        public async Task<CancelClaimResponse> CancelClaimExAsync(CancelClaimRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelClaimResponse>(await DoRequestAsync("1.0", "antcloud.insurance.claim.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报案材料更新（场景端）
         * Summary: 报案材料更新（场景端）
         */
        public UpdateClaimMaterialResponse UpdateClaimMaterial(UpdateClaimMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateClaimMaterialEx(request, headers, runtime);
        }

        /**
         * Description: 报案材料更新（场景端）
         * Summary: 报案材料更新（场景端）
         */
        public async Task<UpdateClaimMaterialResponse> UpdateClaimMaterialAsync(UpdateClaimMaterialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateClaimMaterialExAsync(request, headers, runtime);
        }

        /**
         * Description: 报案材料更新（场景端）
         * Summary: 报案材料更新（场景端）
         */
        public UpdateClaimMaterialResponse UpdateClaimMaterialEx(UpdateClaimMaterialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateClaimMaterialResponse>(DoRequest("1.0", "antcloud.insurance.claim.material.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 报案材料更新（场景端）
         * Summary: 报案材料更新（场景端）
         */
        public async Task<UpdateClaimMaterialResponse> UpdateClaimMaterialExAsync(UpdateClaimMaterialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateClaimMaterialResponse>(await DoRequestAsync("1.0", "antcloud.insurance.claim.material.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 理赔结果确认（场景端）
         * Summary: 理赔结果确认（场景端）
         */
        public ConfirmClaimSettleResponse ConfirmClaimSettle(ConfirmClaimSettleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmClaimSettleEx(request, headers, runtime);
        }

        /**
         * Description: 理赔结果确认（场景端）
         * Summary: 理赔结果确认（场景端）
         */
        public async Task<ConfirmClaimSettleResponse> ConfirmClaimSettleAsync(ConfirmClaimSettleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmClaimSettleExAsync(request, headers, runtime);
        }

        /**
         * Description: 理赔结果确认（场景端）
         * Summary: 理赔结果确认（场景端）
         */
        public ConfirmClaimSettleResponse ConfirmClaimSettleEx(ConfirmClaimSettleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmClaimSettleResponse>(DoRequest("1.0", "antcloud.insurance.claim.settle.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 理赔结果确认（场景端）
         * Summary: 理赔结果确认（场景端）
         */
        public async Task<ConfirmClaimSettleResponse> ConfirmClaimSettleExAsync(ConfirmClaimSettleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmClaimSettleResponse>(await DoRequestAsync("1.0", "antcloud.insurance.claim.settle.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 理赔结案通知（保司端）
         * Summary: 理赔结案通知（保司端）
         */
        public FinishClaimSettleResponse FinishClaimSettle(FinishClaimSettleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishClaimSettleEx(request, headers, runtime);
        }

        /**
         * Description: 理赔结案通知（保司端）
         * Summary: 理赔结案通知（保司端）
         */
        public async Task<FinishClaimSettleResponse> FinishClaimSettleAsync(FinishClaimSettleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishClaimSettleExAsync(request, headers, runtime);
        }

        /**
         * Description: 理赔结案通知（保司端）
         * Summary: 理赔结案通知（保司端）
         */
        public FinishClaimSettleResponse FinishClaimSettleEx(FinishClaimSettleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishClaimSettleResponse>(DoRequest("1.0", "antcloud.insurance.claim.settle.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 理赔结案通知（保司端）
         * Summary: 理赔结案通知（保司端）
         */
        public async Task<FinishClaimSettleResponse> FinishClaimSettleExAsync(FinishClaimSettleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishClaimSettleResponse>(await DoRequestAsync("1.0", "antcloud.insurance.claim.settle.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险批改自核接口
         * Summary: 保险批改自核接口
         */
        public ApplyEndorsementStrategyResponse ApplyEndorsementStrategy(ApplyEndorsementStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyEndorsementStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 保险批改自核接口
         * Summary: 保险批改自核接口
         */
        public async Task<ApplyEndorsementStrategyResponse> ApplyEndorsementStrategyAsync(ApplyEndorsementStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyEndorsementStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险批改自核接口
         * Summary: 保险批改自核接口
         */
        public ApplyEndorsementStrategyResponse ApplyEndorsementStrategyEx(ApplyEndorsementStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyEndorsementStrategyResponse>(DoRequest("1.0", "antcloud.insurance.endorsement.strategy.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险批改自核接口
         * Summary: 保险批改自核接口
         */
        public async Task<ApplyEndorsementStrategyResponse> ApplyEndorsementStrategyExAsync(ApplyEndorsementStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyEndorsementStrategyResponse>(await DoRequestAsync("1.0", "antcloud.insurance.endorsement.strategy.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单信息离线同步
         * Summary: 保单信息离线同步
         */
        public SyncPolicyResultResponse SyncPolicyResult(SyncPolicyResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncPolicyResultEx(request, headers, runtime);
        }

        /**
         * Description: 保单信息离线同步
         * Summary: 保单信息离线同步
         */
        public async Task<SyncPolicyResultResponse> SyncPolicyResultAsync(SyncPolicyResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncPolicyResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 保单信息离线同步
         * Summary: 保单信息离线同步
         */
        public SyncPolicyResultResponse SyncPolicyResultEx(SyncPolicyResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncPolicyResultResponse>(DoRequest("1.0", "antcloud.insurance.policy.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单信息离线同步
         * Summary: 保单信息离线同步
         */
        public async Task<SyncPolicyResultResponse> SyncPolicyResultExAsync(SyncPolicyResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncPolicyResultResponse>(await DoRequestAsync("1.0", "antcloud.insurance.policy.result.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于通知单号查询保险投保结果
         * Summary: 保险投保结果查询
         */
        public QueryInsureResultResponse QueryInsureResult(QueryInsureResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInsureResultEx(request, headers, runtime);
        }

        /**
         * Description: 基于通知单号查询保险投保结果
         * Summary: 保险投保结果查询
         */
        public async Task<QueryInsureResultResponse> QueryInsureResultAsync(QueryInsureResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInsureResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于通知单号查询保险投保结果
         * Summary: 保险投保结果查询
         */
        public QueryInsureResultResponse QueryInsureResultEx(QueryInsureResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsureResultResponse>(DoRequest("1.0", "antcloud.insurance.insure.result.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于通知单号查询保险投保结果
         * Summary: 保险投保结果查询
         */
        public async Task<QueryInsureResultResponse> QueryInsureResultExAsync(QueryInsureResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsureResultResponse>(await DoRequestAsync("1.0", "antcloud.insurance.insure.result.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 投保测试接口
         * Summary: 投保测试接口
         */
        public ApplyInsureTestResponse ApplyInsureTest(ApplyInsureTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInsureTestEx(request, headers, runtime);
        }

        /**
         * Description: 投保测试接口
         * Summary: 投保测试接口
         */
        public async Task<ApplyInsureTestResponse> ApplyInsureTestAsync(ApplyInsureTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInsureTestExAsync(request, headers, runtime);
        }

        /**
         * Description: 投保测试接口
         * Summary: 投保测试接口
         */
        public ApplyInsureTestResponse ApplyInsureTestEx(ApplyInsureTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsureTestResponse>(DoRequest("1.0", "antcloud.insurance.insure.test.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 投保测试接口
         * Summary: 投保测试接口
         */
        public async Task<ApplyInsureTestResponse> ApplyInsureTestExAsync(ApplyInsureTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInsureTestResponse>(await DoRequestAsync("1.0", "antcloud.insurance.insure.test.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于调查报案数据的提交
         * Summary: 调查报案提交接口
         */
        public SubmitInvestigateCaseResponse SubmitInvestigateCase(SubmitInvestigateCaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitInvestigateCaseEx(request, headers, runtime);
        }

        /**
         * Description: 本接口用于调查报案数据的提交
         * Summary: 调查报案提交接口
         */
        public async Task<SubmitInvestigateCaseResponse> SubmitInvestigateCaseAsync(SubmitInvestigateCaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitInvestigateCaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 本接口用于调查报案数据的提交
         * Summary: 调查报案提交接口
         */
        public SubmitInvestigateCaseResponse SubmitInvestigateCaseEx(SubmitInvestigateCaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInvestigateCaseResponse>(DoRequest("1.0", "antcloud.insurance.investigate.case.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于调查报案数据的提交
         * Summary: 调查报案提交接口
         */
        public async Task<SubmitInvestigateCaseResponse> SubmitInvestigateCaseExAsync(SubmitInvestigateCaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitInvestigateCaseResponse>(await DoRequestAsync("1.0", "antcloud.insurance.investigate.case.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回销结果查询接口
         * Summary: 回销结果查询接口
         */
        public QueryReverseCommissionResponse QueryReverseCommission(QueryReverseCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryReverseCommissionEx(request, headers, runtime);
        }

        /**
         * Description: 回销结果查询接口
         * Summary: 回销结果查询接口
         */
        public async Task<QueryReverseCommissionResponse> QueryReverseCommissionAsync(QueryReverseCommissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryReverseCommissionExAsync(request, headers, runtime);
        }

        /**
         * Description: 回销结果查询接口
         * Summary: 回销结果查询接口
         */
        public QueryReverseCommissionResponse QueryReverseCommissionEx(QueryReverseCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryReverseCommissionResponse>(DoRequest("1.0", "antcloud.insurance.reverse.commission.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回销结果查询接口
         * Summary: 回销结果查询接口
         */
        public async Task<QueryReverseCommissionResponse> QueryReverseCommissionExAsync(QueryReverseCommissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryReverseCommissionResponse>(await DoRequestAsync("1.0", "antcloud.insurance.reverse.commission.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 嵌入式保险服务卡片url链接获取
         * Summary: 嵌入式保险服务卡片url链接获取
         */
        public GetEmbedcardUrlResponse GetEmbedcardUrl(GetEmbedcardUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetEmbedcardUrlEx(request, headers, runtime);
        }

        /**
         * Description: 嵌入式保险服务卡片url链接获取
         * Summary: 嵌入式保险服务卡片url链接获取
         */
        public async Task<GetEmbedcardUrlResponse> GetEmbedcardUrlAsync(GetEmbedcardUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetEmbedcardUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 嵌入式保险服务卡片url链接获取
         * Summary: 嵌入式保险服务卡片url链接获取
         */
        public GetEmbedcardUrlResponse GetEmbedcardUrlEx(GetEmbedcardUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEmbedcardUrlResponse>(DoRequest("1.0", "antcloud.insurance.embedcard.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 嵌入式保险服务卡片url链接获取
         * Summary: 嵌入式保险服务卡片url链接获取
         */
        public async Task<GetEmbedcardUrlResponse> GetEmbedcardUrlExAsync(GetEmbedcardUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEmbedcardUrlResponse>(await DoRequestAsync("1.0", "antcloud.insurance.embedcard.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 嵌入式保险服务打款成功出单接口
         * Summary: 嵌入式保险服务打款成功出单接口
         */
        public IssueEmbedcardPaysucResponse IssueEmbedcardPaysuc(IssueEmbedcardPaysucRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return IssueEmbedcardPaysucEx(request, headers, runtime);
        }

        /**
         * Description: 嵌入式保险服务打款成功出单接口
         * Summary: 嵌入式保险服务打款成功出单接口
         */
        public async Task<IssueEmbedcardPaysucResponse> IssueEmbedcardPaysucAsync(IssueEmbedcardPaysucRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await IssueEmbedcardPaysucExAsync(request, headers, runtime);
        }

        /**
         * Description: 嵌入式保险服务打款成功出单接口
         * Summary: 嵌入式保险服务打款成功出单接口
         */
        public IssueEmbedcardPaysucResponse IssueEmbedcardPaysucEx(IssueEmbedcardPaysucRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IssueEmbedcardPaysucResponse>(DoRequest("1.0", "antcloud.insurance.embedcard.paysuc.issue", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 嵌入式保险服务打款成功出单接口
         * Summary: 嵌入式保险服务打款成功出单接口
         */
        public async Task<IssueEmbedcardPaysucResponse> IssueEmbedcardPaysucExAsync(IssueEmbedcardPaysucRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IssueEmbedcardPaysucResponse>(await DoRequestAsync("1.0", "antcloud.insurance.embedcard.paysuc.issue", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 嵌入式主机厂车险url链接获取
         * Summary: 嵌入式主机厂车险url链接获取
         */
        public GetEmbedoemautoinsuranceUrlResponse GetEmbedoemautoinsuranceUrl(GetEmbedoemautoinsuranceUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetEmbedoemautoinsuranceUrlEx(request, headers, runtime);
        }

        /**
         * Description: 嵌入式主机厂车险url链接获取
         * Summary: 嵌入式主机厂车险url链接获取
         */
        public async Task<GetEmbedoemautoinsuranceUrlResponse> GetEmbedoemautoinsuranceUrlAsync(GetEmbedoemautoinsuranceUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetEmbedoemautoinsuranceUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 嵌入式主机厂车险url链接获取
         * Summary: 嵌入式主机厂车险url链接获取
         */
        public GetEmbedoemautoinsuranceUrlResponse GetEmbedoemautoinsuranceUrlEx(GetEmbedoemautoinsuranceUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEmbedoemautoinsuranceUrlResponse>(DoRequest("1.0", "antcloud.insurance.embedoemautoinsurance.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 嵌入式主机厂车险url链接获取
         * Summary: 嵌入式主机厂车险url链接获取
         */
        public async Task<GetEmbedoemautoinsuranceUrlResponse> GetEmbedoemautoinsuranceUrlExAsync(GetEmbedoemautoinsuranceUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetEmbedoemautoinsuranceUrlResponse>(await DoRequestAsync("1.0", "antcloud.insurance.embedoemautoinsurance.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 场景方获取权益链接 
         * Summary: 场景方获取权益链接
         */
        public GetRightplatformUrlResponse GetRightplatformUrl(GetRightplatformUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetRightplatformUrlEx(request, headers, runtime);
        }

        /**
         * Description: 场景方获取权益链接 
         * Summary: 场景方获取权益链接
         */
        public async Task<GetRightplatformUrlResponse> GetRightplatformUrlAsync(GetRightplatformUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetRightplatformUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 场景方获取权益链接 
         * Summary: 场景方获取权益链接
         */
        public GetRightplatformUrlResponse GetRightplatformUrlEx(GetRightplatformUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRightplatformUrlResponse>(DoRequest("1.0", "antcloud.insurance.rightplatform.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 场景方获取权益链接 
         * Summary: 场景方获取权益链接
         */
        public async Task<GetRightplatformUrlResponse> GetRightplatformUrlExAsync(GetRightplatformUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetRightplatformUrlResponse>(await DoRequestAsync("1.0", "antcloud.insurance.rightplatform.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新申请额度状态&投保人信息
         * Summary: 更新申请额度状态&投保人信息
         */
        public UpdateRightplatformApplyinfoResponse UpdateRightplatformApplyinfo(UpdateRightplatformApplyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateRightplatformApplyinfoEx(request, headers, runtime);
        }

        /**
         * Description: 更新申请额度状态&投保人信息
         * Summary: 更新申请额度状态&投保人信息
         */
        public async Task<UpdateRightplatformApplyinfoResponse> UpdateRightplatformApplyinfoAsync(UpdateRightplatformApplyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateRightplatformApplyinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新申请额度状态&投保人信息
         * Summary: 更新申请额度状态&投保人信息
         */
        public UpdateRightplatformApplyinfoResponse UpdateRightplatformApplyinfoEx(UpdateRightplatformApplyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRightplatformApplyinfoResponse>(DoRequest("1.0", "antcloud.insurance.rightplatform.applyinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新申请额度状态&投保人信息
         * Summary: 更新申请额度状态&投保人信息
         */
        public async Task<UpdateRightplatformApplyinfoResponse> UpdateRightplatformApplyinfoExAsync(UpdateRightplatformApplyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateRightplatformApplyinfoResponse>(await DoRequestAsync("1.0", "antcloud.insurance.rightplatform.applyinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 场景方标的信息通知
         * Summary: 场景方标的信息通知
         */
        public NotifyInterestScenesubjectResponse NotifyInterestScenesubject(NotifyInterestScenesubjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyInterestScenesubjectEx(request, headers, runtime);
        }

        /**
         * Description: 场景方标的信息通知
         * Summary: 场景方标的信息通知
         */
        public async Task<NotifyInterestScenesubjectResponse> NotifyInterestScenesubjectAsync(NotifyInterestScenesubjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyInterestScenesubjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 场景方标的信息通知
         * Summary: 场景方标的信息通知
         */
        public NotifyInterestScenesubjectResponse NotifyInterestScenesubjectEx(NotifyInterestScenesubjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInterestScenesubjectResponse>(DoRequest("1.0", "antcloud.insurance.interest.scenesubject.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 场景方标的信息通知
         * Summary: 场景方标的信息通知
         */
        public async Task<NotifyInterestScenesubjectResponse> NotifyInterestScenesubjectExAsync(NotifyInterestScenesubjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInterestScenesubjectResponse>(await DoRequestAsync("1.0", "antcloud.insurance.interest.scenesubject.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益服务商标的信息查询
         * Summary: 权益服务商标的信息查询
         */
        public QueryInterestSuppliersubjectResponse QueryInterestSuppliersubject(QueryInterestSuppliersubjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInterestSuppliersubjectEx(request, headers, runtime);
        }

        /**
         * Description: 权益服务商标的信息查询
         * Summary: 权益服务商标的信息查询
         */
        public async Task<QueryInterestSuppliersubjectResponse> QueryInterestSuppliersubjectAsync(QueryInterestSuppliersubjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInterestSuppliersubjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 权益服务商标的信息查询
         * Summary: 权益服务商标的信息查询
         */
        public QueryInterestSuppliersubjectResponse QueryInterestSuppliersubjectEx(QueryInterestSuppliersubjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInterestSuppliersubjectResponse>(DoRequest("1.0", "antcloud.insurance.interest.suppliersubject.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益服务商标的信息查询
         * Summary: 权益服务商标的信息查询
         */
        public async Task<QueryInterestSuppliersubjectResponse> QueryInterestSuppliersubjectExAsync(QueryInterestSuppliersubjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInterestSuppliersubjectResponse>(await DoRequestAsync("1.0", "antcloud.insurance.interest.suppliersubject.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益服务商投保后通知保单信息
         * Summary: 权益服务商投保后通知保单信息
         */
        public NotifyInterestSupplierpolicyResponse NotifyInterestSupplierpolicy(NotifyInterestSupplierpolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyInterestSupplierpolicyEx(request, headers, runtime);
        }

        /**
         * Description: 权益服务商投保后通知保单信息
         * Summary: 权益服务商投保后通知保单信息
         */
        public async Task<NotifyInterestSupplierpolicyResponse> NotifyInterestSupplierpolicyAsync(NotifyInterestSupplierpolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyInterestSupplierpolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 权益服务商投保后通知保单信息
         * Summary: 权益服务商投保后通知保单信息
         */
        public NotifyInterestSupplierpolicyResponse NotifyInterestSupplierpolicyEx(NotifyInterestSupplierpolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInterestSupplierpolicyResponse>(DoRequest("1.0", "antcloud.insurance.interest.supplierpolicy.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益服务商投保后通知保单信息
         * Summary: 权益服务商投保后通知保单信息
         */
        public async Task<NotifyInterestSupplierpolicyResponse> NotifyInterestSupplierpolicyExAsync(NotifyInterestSupplierpolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInterestSupplierpolicyResponse>(await DoRequestAsync("1.0", "antcloud.insurance.interest.supplierpolicy.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 场景方获取权益链接
         * Summary: 场景方获取权益链接
         */
        public GetInterestUrlResponse GetInterestUrl(GetInterestUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInterestUrlEx(request, headers, runtime);
        }

        /**
         * Description: 场景方获取权益链接
         * Summary: 场景方获取权益链接
         */
        public async Task<GetInterestUrlResponse> GetInterestUrlAsync(GetInterestUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInterestUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 场景方获取权益链接
         * Summary: 场景方获取权益链接
         */
        public GetInterestUrlResponse GetInterestUrlEx(GetInterestUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInterestUrlResponse>(DoRequest("1.0", "antcloud.insurance.interest.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 场景方获取权益链接
         * Summary: 场景方获取权益链接
         */
        public async Task<GetInterestUrlResponse> GetInterestUrlExAsync(GetInterestUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInterestUrlResponse>(await DoRequestAsync("1.0", "antcloud.insurance.interest.url.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 场景方订单信息查询
         * Summary: 场景方订单信息查询
         */
        public QueryInterestSceneorderResponse QueryInterestSceneorder(QueryInterestSceneorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInterestSceneorderEx(request, headers, runtime);
        }

        /**
         * Description: 场景方订单信息查询
         * Summary: 场景方订单信息查询
         */
        public async Task<QueryInterestSceneorderResponse> QueryInterestSceneorderAsync(QueryInterestSceneorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInterestSceneorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 场景方订单信息查询
         * Summary: 场景方订单信息查询
         */
        public QueryInterestSceneorderResponse QueryInterestSceneorderEx(QueryInterestSceneorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInterestSceneorderResponse>(DoRequest("1.0", "antcloud.insurance.interest.sceneorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 场景方订单信息查询
         * Summary: 场景方订单信息查询
         */
        public async Task<QueryInterestSceneorderResponse> QueryInterestSceneorderExAsync(QueryInterestSceneorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInterestSceneorderResponse>(await DoRequestAsync("1.0", "antcloud.insurance.interest.sceneorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益服务商订单状态通知
         * Summary: 权益服务商订单状态通知
         */
        public NotifyInterestSupplierorderResponse NotifyInterestSupplierorder(NotifyInterestSupplierorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyInterestSupplierorderEx(request, headers, runtime);
        }

        /**
         * Description: 权益服务商订单状态通知
         * Summary: 权益服务商订单状态通知
         */
        public async Task<NotifyInterestSupplierorderResponse> NotifyInterestSupplierorderAsync(NotifyInterestSupplierorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyInterestSupplierorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 权益服务商订单状态通知
         * Summary: 权益服务商订单状态通知
         */
        public NotifyInterestSupplierorderResponse NotifyInterestSupplierorderEx(NotifyInterestSupplierorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInterestSupplierorderResponse>(DoRequest("1.0", "antcloud.insurance.interest.supplierorder.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 权益服务商订单状态通知
         * Summary: 权益服务商订单状态通知
         */
        public async Task<NotifyInterestSupplierorderResponse> NotifyInterestSupplierorderExAsync(NotifyInterestSupplierorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyInterestSupplierorderResponse>(await DoRequestAsync("1.0", "antcloud.insurance.interest.supplierorder.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车险线索营销结果接收
         * Summary: 车险线索营销结果接收
         */
        public ReceiveLeadMarketResponse ReceiveLeadMarket(ReceiveLeadMarketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReceiveLeadMarketEx(request, headers, runtime);
        }

        /**
         * Description: 车险线索营销结果接收
         * Summary: 车险线索营销结果接收
         */
        public async Task<ReceiveLeadMarketResponse> ReceiveLeadMarketAsync(ReceiveLeadMarketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReceiveLeadMarketExAsync(request, headers, runtime);
        }

        /**
         * Description: 车险线索营销结果接收
         * Summary: 车险线索营销结果接收
         */
        public ReceiveLeadMarketResponse ReceiveLeadMarketEx(ReceiveLeadMarketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveLeadMarketResponse>(DoRequest("1.0", "antcloud.insurance.lead.market.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车险线索营销结果接收
         * Summary: 车险线索营销结果接收
         */
        public async Task<ReceiveLeadMarketResponse> ReceiveLeadMarketExAsync(ReceiveLeadMarketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveLeadMarketResponse>(await DoRequestAsync("1.0", "antcloud.insurance.lead.market.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 非标营销投保短链获取
         * Summary: 非标营销投保短链获取
         */
        public GetMarketingInsureurlResponse GetMarketingInsureurl(GetMarketingInsureurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMarketingInsureurlEx(request, headers, runtime);
        }

        /**
         * Description: 非标营销投保短链获取
         * Summary: 非标营销投保短链获取
         */
        public async Task<GetMarketingInsureurlResponse> GetMarketingInsureurlAsync(GetMarketingInsureurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMarketingInsureurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 非标营销投保短链获取
         * Summary: 非标营销投保短链获取
         */
        public GetMarketingInsureurlResponse GetMarketingInsureurlEx(GetMarketingInsureurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMarketingInsureurlResponse>(DoRequest("1.0", "antcloud.insurance.marketing.insureurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 非标营销投保短链获取
         * Summary: 非标营销投保短链获取
         */
        public async Task<GetMarketingInsureurlResponse> GetMarketingInsureurlExAsync(GetMarketingInsureurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMarketingInsureurlResponse>(await DoRequestAsync("1.0", "antcloud.insurance.marketing.insureurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 众安回传接口，获取保单信息保存。
         * Summary: 非标营销保单信息事件回传；
         */
        public CallbackMarketingEventResponse CallbackMarketingEvent(CallbackMarketingEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackMarketingEventEx(request, headers, runtime);
        }

        /**
         * Description: 众安回传接口，获取保单信息保存。
         * Summary: 非标营销保单信息事件回传；
         */
        public async Task<CallbackMarketingEventResponse> CallbackMarketingEventAsync(CallbackMarketingEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackMarketingEventExAsync(request, headers, runtime);
        }

        /**
         * Description: 众安回传接口，获取保单信息保存。
         * Summary: 非标营销保单信息事件回传；
         */
        public CallbackMarketingEventResponse CallbackMarketingEventEx(CallbackMarketingEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackMarketingEventResponse>(DoRequest("1.0", "antcloud.insurance.marketing.event.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 众安回传接口，获取保单信息保存。
         * Summary: 非标营销保单信息事件回传；
         */
        public async Task<CallbackMarketingEventResponse> CallbackMarketingEventExAsync(CallbackMarketingEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackMarketingEventResponse>(await DoRequestAsync("1.0", "antcloud.insurance.marketing.event.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 众安退保信息回传
         * Summary: 非标营销退保事件回传；
         */
        public CallbackMarketingPolicycancelResponse CallbackMarketingPolicycancel(CallbackMarketingPolicycancelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackMarketingPolicycancelEx(request, headers, runtime);
        }

        /**
         * Description: 众安退保信息回传
         * Summary: 非标营销退保事件回传；
         */
        public async Task<CallbackMarketingPolicycancelResponse> CallbackMarketingPolicycancelAsync(CallbackMarketingPolicycancelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackMarketingPolicycancelExAsync(request, headers, runtime);
        }

        /**
         * Description: 众安退保信息回传
         * Summary: 非标营销退保事件回传；
         */
        public CallbackMarketingPolicycancelResponse CallbackMarketingPolicycancelEx(CallbackMarketingPolicycancelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackMarketingPolicycancelResponse>(DoRequest("1.0", "antcloud.insurance.marketing.policycancel.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 众安退保信息回传
         * Summary: 非标营销退保事件回传；
         */
        public async Task<CallbackMarketingPolicycancelResponse> CallbackMarketingPolicycancelExAsync(CallbackMarketingPolicycancelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackMarketingPolicycancelResponse>(await DoRequestAsync("1.0", "antcloud.insurance.marketing.policycancel.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
