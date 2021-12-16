// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.COMMERCIAL.Models;

namespace AntChain.SDK.COMMERCIAL
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
                {"keepAliveDurationMillis", _keepAliveDurationMillis},
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
                        {"sdk_version", "1.0.26"},
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
                {"keepAliveDurationMillis", _keepAliveDurationMillis},
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
                        {"sdk_version", "1.0.26"},
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
         * Description: 发票信息查询
         * Summary: 发票信息查询
         */
        public QueryBillingcoreInvoiceResponse QueryBillingcoreInvoice(QueryBillingcoreInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBillingcoreInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 发票信息查询
         * Summary: 发票信息查询
         */
        public async Task<QueryBillingcoreInvoiceResponse> QueryBillingcoreInvoiceAsync(QueryBillingcoreInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBillingcoreInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 发票信息查询
         * Summary: 发票信息查询
         */
        public QueryBillingcoreInvoiceResponse QueryBillingcoreInvoiceEx(QueryBillingcoreInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillingcoreInvoiceResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.invoice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发票信息查询
         * Summary: 发票信息查询
         */
        public async Task<QueryBillingcoreInvoiceResponse> QueryBillingcoreInvoiceExAsync(QueryBillingcoreInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillingcoreInvoiceResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.invoice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发票地址信息查询
         * Summary: 发票地址信息查询
         */
        public QueryBillingcoreInvoicelocResponse QueryBillingcoreInvoiceloc(QueryBillingcoreInvoicelocRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBillingcoreInvoicelocEx(request, headers, runtime);
        }

        /**
         * Description: 发票地址信息查询
         * Summary: 发票地址信息查询
         */
        public async Task<QueryBillingcoreInvoicelocResponse> QueryBillingcoreInvoicelocAsync(QueryBillingcoreInvoicelocRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBillingcoreInvoicelocExAsync(request, headers, runtime);
        }

        /**
         * Description: 发票地址信息查询
         * Summary: 发票地址信息查询
         */
        public QueryBillingcoreInvoicelocResponse QueryBillingcoreInvoicelocEx(QueryBillingcoreInvoicelocRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillingcoreInvoicelocResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.invoiceloc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发票地址信息查询
         * Summary: 发票地址信息查询
         */
        public async Task<QueryBillingcoreInvoicelocResponse> QueryBillingcoreInvoicelocExAsync(QueryBillingcoreInvoicelocRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillingcoreInvoicelocResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.invoiceloc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增发票信息
         * Summary: 新增发票信息
         */
        public AddBillingcoreInvoiceResponse AddBillingcoreInvoice(AddBillingcoreInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddBillingcoreInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 新增发票信息
         * Summary: 新增发票信息
         */
        public async Task<AddBillingcoreInvoiceResponse> AddBillingcoreInvoiceAsync(AddBillingcoreInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddBillingcoreInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增发票信息
         * Summary: 新增发票信息
         */
        public AddBillingcoreInvoiceResponse AddBillingcoreInvoiceEx(AddBillingcoreInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBillingcoreInvoiceResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.invoice.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增发票信息
         * Summary: 新增发票信息
         */
        public async Task<AddBillingcoreInvoiceResponse> AddBillingcoreInvoiceExAsync(AddBillingcoreInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBillingcoreInvoiceResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.invoice.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新发票信息
         * Summary: 更新发票信息
         */
        public UpdateBillingcoreInvoiceResponse UpdateBillingcoreInvoice(UpdateBillingcoreInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBillingcoreInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 更新发票信息
         * Summary: 更新发票信息
         */
        public async Task<UpdateBillingcoreInvoiceResponse> UpdateBillingcoreInvoiceAsync(UpdateBillingcoreInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBillingcoreInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新发票信息
         * Summary: 更新发票信息
         */
        public UpdateBillingcoreInvoiceResponse UpdateBillingcoreInvoiceEx(UpdateBillingcoreInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillingcoreInvoiceResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.invoice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新发票信息
         * Summary: 更新发票信息
         */
        public async Task<UpdateBillingcoreInvoiceResponse> UpdateBillingcoreInvoiceExAsync(UpdateBillingcoreInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillingcoreInvoiceResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.invoice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增发票地址
         * Summary: 新增发票地址
         */
        public AddBillingcoreInvoiceaddressResponse AddBillingcoreInvoiceaddress(AddBillingcoreInvoiceaddressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddBillingcoreInvoiceaddressEx(request, headers, runtime);
        }

        /**
         * Description: 新增发票地址
         * Summary: 新增发票地址
         */
        public async Task<AddBillingcoreInvoiceaddressResponse> AddBillingcoreInvoiceaddressAsync(AddBillingcoreInvoiceaddressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddBillingcoreInvoiceaddressExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增发票地址
         * Summary: 新增发票地址
         */
        public AddBillingcoreInvoiceaddressResponse AddBillingcoreInvoiceaddressEx(AddBillingcoreInvoiceaddressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBillingcoreInvoiceaddressResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.invoiceaddress.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增发票地址
         * Summary: 新增发票地址
         */
        public async Task<AddBillingcoreInvoiceaddressResponse> AddBillingcoreInvoiceaddressExAsync(AddBillingcoreInvoiceaddressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBillingcoreInvoiceaddressResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.invoiceaddress.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新发票地址信息
         * Summary: 更新发票地址信息
         */
        public UpdateBillingcoreInvoiceaddressResponse UpdateBillingcoreInvoiceaddress(UpdateBillingcoreInvoiceaddressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBillingcoreInvoiceaddressEx(request, headers, runtime);
        }

        /**
         * Description: 更新发票地址信息
         * Summary: 更新发票地址信息
         */
        public async Task<UpdateBillingcoreInvoiceaddressResponse> UpdateBillingcoreInvoiceaddressAsync(UpdateBillingcoreInvoiceaddressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBillingcoreInvoiceaddressExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新发票地址信息
         * Summary: 更新发票地址信息
         */
        public UpdateBillingcoreInvoiceaddressResponse UpdateBillingcoreInvoiceaddressEx(UpdateBillingcoreInvoiceaddressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillingcoreInvoiceaddressResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.invoiceaddress.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新发票地址信息
         * Summary: 更新发票地址信息
         */
        public async Task<UpdateBillingcoreInvoiceaddressResponse> UpdateBillingcoreInvoiceaddressExAsync(UpdateBillingcoreInvoiceaddressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillingcoreInvoiceaddressResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.invoiceaddress.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增发票电子邮箱
         * Summary: 新增发票电子邮箱
         */
        public AddBillingcoreInvoiceemailResponse AddBillingcoreInvoiceemail(AddBillingcoreInvoiceemailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddBillingcoreInvoiceemailEx(request, headers, runtime);
        }

        /**
         * Description: 新增发票电子邮箱
         * Summary: 新增发票电子邮箱
         */
        public async Task<AddBillingcoreInvoiceemailResponse> AddBillingcoreInvoiceemailAsync(AddBillingcoreInvoiceemailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddBillingcoreInvoiceemailExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增发票电子邮箱
         * Summary: 新增发票电子邮箱
         */
        public AddBillingcoreInvoiceemailResponse AddBillingcoreInvoiceemailEx(AddBillingcoreInvoiceemailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBillingcoreInvoiceemailResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.invoiceemail.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增发票电子邮箱
         * Summary: 新增发票电子邮箱
         */
        public async Task<AddBillingcoreInvoiceemailResponse> AddBillingcoreInvoiceemailExAsync(AddBillingcoreInvoiceemailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBillingcoreInvoiceemailResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.invoiceemail.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新发票电子邮箱
         * Summary: 更新发票电子邮箱
         */
        public UpdateBillingcoreInvoiceemailResponse UpdateBillingcoreInvoiceemail(UpdateBillingcoreInvoiceemailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBillingcoreInvoiceemailEx(request, headers, runtime);
        }

        /**
         * Description: 更新发票电子邮箱
         * Summary: 更新发票电子邮箱
         */
        public async Task<UpdateBillingcoreInvoiceemailResponse> UpdateBillingcoreInvoiceemailAsync(UpdateBillingcoreInvoiceemailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBillingcoreInvoiceemailExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新发票电子邮箱
         * Summary: 更新发票电子邮箱
         */
        public UpdateBillingcoreInvoiceemailResponse UpdateBillingcoreInvoiceemailEx(UpdateBillingcoreInvoiceemailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillingcoreInvoiceemailResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.invoiceemail.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新发票电子邮箱
         * Summary: 更新发票电子邮箱
         */
        public async Task<UpdateBillingcoreInvoiceemailResponse> UpdateBillingcoreInvoiceemailExAsync(UpdateBillingcoreInvoiceemailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBillingcoreInvoiceemailResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.invoiceemail.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户开票申请
         * Summary: 商户开票申请
         */
        public ApplyBillingcoreMerchantinvoiceResponse ApplyBillingcoreMerchantinvoice(ApplyBillingcoreMerchantinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyBillingcoreMerchantinvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 商户开票申请
         * Summary: 商户开票申请
         */
        public async Task<ApplyBillingcoreMerchantinvoiceResponse> ApplyBillingcoreMerchantinvoiceAsync(ApplyBillingcoreMerchantinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyBillingcoreMerchantinvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户开票申请
         * Summary: 商户开票申请
         */
        public ApplyBillingcoreMerchantinvoiceResponse ApplyBillingcoreMerchantinvoiceEx(ApplyBillingcoreMerchantinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBillingcoreMerchantinvoiceResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.merchantinvoice.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户开票申请
         * Summary: 商户开票申请
         */
        public async Task<ApplyBillingcoreMerchantinvoiceResponse> ApplyBillingcoreMerchantinvoiceExAsync(ApplyBillingcoreMerchantinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBillingcoreMerchantinvoiceResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.merchantinvoice.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户开票查询
         * Summary: 商户开票查询
         */
        public QueryBillingcoreMerchantinvoiceResponse QueryBillingcoreMerchantinvoice(QueryBillingcoreMerchantinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBillingcoreMerchantinvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 商户开票查询
         * Summary: 商户开票查询
         */
        public async Task<QueryBillingcoreMerchantinvoiceResponse> QueryBillingcoreMerchantinvoiceAsync(QueryBillingcoreMerchantinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBillingcoreMerchantinvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户开票查询
         * Summary: 商户开票查询
         */
        public QueryBillingcoreMerchantinvoiceResponse QueryBillingcoreMerchantinvoiceEx(QueryBillingcoreMerchantinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillingcoreMerchantinvoiceResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.merchantinvoice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户开票查询
         * Summary: 商户开票查询
         */
        public async Task<QueryBillingcoreMerchantinvoiceResponse> QueryBillingcoreMerchantinvoiceExAsync(QueryBillingcoreMerchantinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillingcoreMerchantinvoiceResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.merchantinvoice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询服务商账单
         * Summary: 查询服务商账单
         */
        public QueryBillingcoreSpbillResponse QueryBillingcoreSpbill(QueryBillingcoreSpbillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBillingcoreSpbillEx(request, headers, runtime);
        }

        /**
         * Description: 查询服务商账单
         * Summary: 查询服务商账单
         */
        public async Task<QueryBillingcoreSpbillResponse> QueryBillingcoreSpbillAsync(QueryBillingcoreSpbillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBillingcoreSpbillExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询服务商账单
         * Summary: 查询服务商账单
         */
        public QueryBillingcoreSpbillResponse QueryBillingcoreSpbillEx(QueryBillingcoreSpbillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillingcoreSpbillResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.spbill.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询服务商账单
         * Summary: 查询服务商账单
         */
        public async Task<QueryBillingcoreSpbillResponse> QueryBillingcoreSpbillExAsync(QueryBillingcoreSpbillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBillingcoreSpbillResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.spbill.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询服务商账单
         * Summary: 分页查询服务商账单
         */
        public PagequeryBillingcoreSpbillResponse PagequeryBillingcoreSpbill(PagequeryBillingcoreSpbillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryBillingcoreSpbillEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询服务商账单
         * Summary: 分页查询服务商账单
         */
        public async Task<PagequeryBillingcoreSpbillResponse> PagequeryBillingcoreSpbillAsync(PagequeryBillingcoreSpbillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryBillingcoreSpbillExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询服务商账单
         * Summary: 分页查询服务商账单
         */
        public PagequeryBillingcoreSpbillResponse PagequeryBillingcoreSpbillEx(PagequeryBillingcoreSpbillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryBillingcoreSpbillResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.spbill.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询服务商账单
         * Summary: 分页查询服务商账单
         */
        public async Task<PagequeryBillingcoreSpbillResponse> PagequeryBillingcoreSpbillExAsync(PagequeryBillingcoreSpbillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryBillingcoreSpbillResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.spbill.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务商结算申请
         * Summary: 服务商结算申请
         */
        public ApplyBillingcoreSpinvoiceResponse ApplyBillingcoreSpinvoice(ApplyBillingcoreSpinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyBillingcoreSpinvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 服务商结算申请
         * Summary: 服务商结算申请
         */
        public async Task<ApplyBillingcoreSpinvoiceResponse> ApplyBillingcoreSpinvoiceAsync(ApplyBillingcoreSpinvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyBillingcoreSpinvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 服务商结算申请
         * Summary: 服务商结算申请
         */
        public ApplyBillingcoreSpinvoiceResponse ApplyBillingcoreSpinvoiceEx(ApplyBillingcoreSpinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBillingcoreSpinvoiceResponse>(DoRequest("1.0", "antcloud.commercial.billingcore.spinvoice.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务商结算申请
         * Summary: 服务商结算申请
         */
        public async Task<ApplyBillingcoreSpinvoiceResponse> ApplyBillingcoreSpinvoiceExAsync(ApplyBillingcoreSpinvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBillingcoreSpinvoiceResponse>(await DoRequestAsync("1.0", "antcloud.commercial.billingcore.spinvoice.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有类目树
         * Summary: 查询所有类目树
         */
        public AllCommercialcoreCatalogResponse AllCommercialcoreCatalog(AllCommercialcoreCatalogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllCommercialcoreCatalogEx(request, headers, runtime);
        }

        /**
         * Description: 查询所有类目树
         * Summary: 查询所有类目树
         */
        public async Task<AllCommercialcoreCatalogResponse> AllCommercialcoreCatalogAsync(AllCommercialcoreCatalogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllCommercialcoreCatalogExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询所有类目树
         * Summary: 查询所有类目树
         */
        public AllCommercialcoreCatalogResponse AllCommercialcoreCatalogEx(AllCommercialcoreCatalogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllCommercialcoreCatalogResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.catalog.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有类目树
         * Summary: 查询所有类目树
         */
        public async Task<AllCommercialcoreCatalogResponse> AllCommercialcoreCatalogExAsync(AllCommercialcoreCatalogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllCommercialcoreCatalogResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.catalog.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据类目id查询产品列表
         * Summary: 查询产品列表
         */
        public ListCommercialcoreProductResponse ListCommercialcoreProduct(ListCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCommercialcoreProductEx(request, headers, runtime);
        }

        /**
         * Description: 根据类目id查询产品列表
         * Summary: 查询产品列表
         */
        public async Task<ListCommercialcoreProductResponse> ListCommercialcoreProductAsync(ListCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCommercialcoreProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据类目id查询产品列表
         * Summary: 查询产品列表
         */
        public ListCommercialcoreProductResponse ListCommercialcoreProductEx(ListCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCommercialcoreProductResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.product.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据类目id查询产品列表
         * Summary: 查询产品列表
         */
        public async Task<ListCommercialcoreProductResponse> ListCommercialcoreProductExAsync(ListCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCommercialcoreProductResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.product.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据产品Code查询商品列表
         * Summary: 查询商品列表
         */
        public ListCommercialcoreCommodityResponse ListCommercialcoreCommodity(ListCommercialcoreCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCommercialcoreCommodityEx(request, headers, runtime);
        }

        /**
         * Description: 根据产品Code查询商品列表
         * Summary: 查询商品列表
         */
        public async Task<ListCommercialcoreCommodityResponse> ListCommercialcoreCommodityAsync(ListCommercialcoreCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCommercialcoreCommodityExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据产品Code查询商品列表
         * Summary: 查询商品列表
         */
        public ListCommercialcoreCommodityResponse ListCommercialcoreCommodityEx(ListCommercialcoreCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCommercialcoreCommodityResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.commodity.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据产品Code查询商品列表
         * Summary: 查询商品列表
         */
        public async Task<ListCommercialcoreCommodityResponse> ListCommercialcoreCommodityExAsync(ListCommercialcoreCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCommercialcoreCommodityResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.commodity.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商品code查询规格列表
         * Summary: 查询规格列表
         */
        public ListCommercialcoreSpecResponse ListCommercialcoreSpec(ListCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCommercialcoreSpecEx(request, headers, runtime);
        }

        /**
         * Description: 根据商品code查询规格列表
         * Summary: 查询规格列表
         */
        public async Task<ListCommercialcoreSpecResponse> ListCommercialcoreSpecAsync(ListCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCommercialcoreSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据商品code查询规格列表
         * Summary: 查询规格列表
         */
        public ListCommercialcoreSpecResponse ListCommercialcoreSpecEx(ListCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCommercialcoreSpecResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.spec.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商品code查询规格列表
         * Summary: 查询规格列表
         */
        public async Task<ListCommercialcoreSpecResponse> ListCommercialcoreSpecExAsync(ListCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCommercialcoreSpecResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.spec.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据规格code查询规格定价计划
         * Summary: 查询规格定价计划
         */
        public QueryCommercialcoreSpecResponse QueryCommercialcoreSpec(QueryCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCommercialcoreSpecEx(request, headers, runtime);
        }

        /**
         * Description: 根据规格code查询规格定价计划
         * Summary: 查询规格定价计划
         */
        public async Task<QueryCommercialcoreSpecResponse> QueryCommercialcoreSpecAsync(QueryCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCommercialcoreSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据规格code查询规格定价计划
         * Summary: 查询规格定价计划
         */
        public QueryCommercialcoreSpecResponse QueryCommercialcoreSpecEx(QueryCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommercialcoreSpecResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.spec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据规格code查询规格定价计划
         * Summary: 查询规格定价计划
         */
        public async Task<QueryCommercialcoreSpecResponse> QueryCommercialcoreSpecExAsync(QueryCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommercialcoreSpecResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.spec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增产品
         * Summary: 新增产品
         */
        public AddCommercialcoreProductResponse AddCommercialcoreProduct(AddCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddCommercialcoreProductEx(request, headers, runtime);
        }

        /**
         * Description: 新增产品
         * Summary: 新增产品
         */
        public async Task<AddCommercialcoreProductResponse> AddCommercialcoreProductAsync(AddCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddCommercialcoreProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增产品
         * Summary: 新增产品
         */
        public AddCommercialcoreProductResponse AddCommercialcoreProductEx(AddCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCommercialcoreProductResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.product.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增产品
         * Summary: 新增产品
         */
        public async Task<AddCommercialcoreProductResponse> AddCommercialcoreProductExAsync(AddCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCommercialcoreProductResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.product.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新产品
         * Summary: 更新产品
         */
        public UpdateCommercialcoreProductResponse UpdateCommercialcoreProduct(UpdateCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCommercialcoreProductEx(request, headers, runtime);
        }

        /**
         * Description: 更新产品
         * Summary: 更新产品
         */
        public async Task<UpdateCommercialcoreProductResponse> UpdateCommercialcoreProductAsync(UpdateCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCommercialcoreProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新产品
         * Summary: 更新产品
         */
        public UpdateCommercialcoreProductResponse UpdateCommercialcoreProductEx(UpdateCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCommercialcoreProductResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.product.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新产品
         * Summary: 更新产品
         */
        public async Task<UpdateCommercialcoreProductResponse> UpdateCommercialcoreProductExAsync(UpdateCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCommercialcoreProductResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.product.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品code列表
         * Summary: 查询产品code列表
         */
        public BatchqueryCommercialcoreProductResponse BatchqueryCommercialcoreProduct(BatchqueryCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryCommercialcoreProductEx(request, headers, runtime);
        }

        /**
         * Description: 查询产品code列表
         * Summary: 查询产品code列表
         */
        public async Task<BatchqueryCommercialcoreProductResponse> BatchqueryCommercialcoreProductAsync(BatchqueryCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryCommercialcoreProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询产品code列表
         * Summary: 查询产品code列表
         */
        public BatchqueryCommercialcoreProductResponse BatchqueryCommercialcoreProductEx(BatchqueryCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryCommercialcoreProductResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.product.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品code列表
         * Summary: 查询产品code列表
         */
        public async Task<BatchqueryCommercialcoreProductResponse> BatchqueryCommercialcoreProductExAsync(BatchqueryCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryCommercialcoreProductResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.product.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据产品code查询产品信息
         * Summary: 查询产品
         */
        public QueryCommercialcoreProductResponse QueryCommercialcoreProduct(QueryCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCommercialcoreProductEx(request, headers, runtime);
        }

        /**
         * Description: 根据产品code查询产品信息
         * Summary: 查询产品
         */
        public async Task<QueryCommercialcoreProductResponse> QueryCommercialcoreProductAsync(QueryCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCommercialcoreProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据产品code查询产品信息
         * Summary: 查询产品
         */
        public QueryCommercialcoreProductResponse QueryCommercialcoreProductEx(QueryCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommercialcoreProductResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.product.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据产品code查询产品信息
         * Summary: 查询产品
         */
        public async Task<QueryCommercialcoreProductResponse> QueryCommercialcoreProductExAsync(QueryCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommercialcoreProductResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.product.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据产品code查询商品来源
         * Summary: 查询商品来源
         */
        public QueryCommercialcoreCommodityResponse QueryCommercialcoreCommodity(QueryCommercialcoreCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCommercialcoreCommodityEx(request, headers, runtime);
        }

        /**
         * Description: 根据产品code查询商品来源
         * Summary: 查询商品来源
         */
        public async Task<QueryCommercialcoreCommodityResponse> QueryCommercialcoreCommodityAsync(QueryCommercialcoreCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCommercialcoreCommodityExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据产品code查询商品来源
         * Summary: 查询商品来源
         */
        public QueryCommercialcoreCommodityResponse QueryCommercialcoreCommodityEx(QueryCommercialcoreCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommercialcoreCommodityResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.commodity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据产品code查询商品来源
         * Summary: 查询商品来源
         */
        public async Task<QueryCommercialcoreCommodityResponse> QueryCommercialcoreCommodityExAsync(QueryCommercialcoreCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCommercialcoreCommodityResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.commodity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增商品
         * Summary: 新增商品
         */
        public AddCommercialcoreCommodityResponse AddCommercialcoreCommodity(AddCommercialcoreCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddCommercialcoreCommodityEx(request, headers, runtime);
        }

        /**
         * Description: 新增商品
         * Summary: 新增商品
         */
        public async Task<AddCommercialcoreCommodityResponse> AddCommercialcoreCommodityAsync(AddCommercialcoreCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddCommercialcoreCommodityExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增商品
         * Summary: 新增商品
         */
        public AddCommercialcoreCommodityResponse AddCommercialcoreCommodityEx(AddCommercialcoreCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCommercialcoreCommodityResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.commodity.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增商品
         * Summary: 新增商品
         */
        public async Task<AddCommercialcoreCommodityResponse> AddCommercialcoreCommodityExAsync(AddCommercialcoreCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCommercialcoreCommodityResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.commodity.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品
         * Summary: 更新商品
         */
        public UpdateCommercialcoreCommodityResponse UpdateCommercialcoreCommodity(UpdateCommercialcoreCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCommercialcoreCommodityEx(request, headers, runtime);
        }

        /**
         * Description: 更新商品
         * Summary: 更新商品
         */
        public async Task<UpdateCommercialcoreCommodityResponse> UpdateCommercialcoreCommodityAsync(UpdateCommercialcoreCommodityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCommercialcoreCommodityExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新商品
         * Summary: 更新商品
         */
        public UpdateCommercialcoreCommodityResponse UpdateCommercialcoreCommodityEx(UpdateCommercialcoreCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCommercialcoreCommodityResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.commodity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新商品
         * Summary: 更新商品
         */
        public async Task<UpdateCommercialcoreCommodityResponse> UpdateCommercialcoreCommodityExAsync(UpdateCommercialcoreCommodityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCommercialcoreCommodityResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.commodity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商品code查询规格售卖模式
         * Summary: 查询规格售卖模式
         */
        public BatchqueryCommercialcoreSpecResponse BatchqueryCommercialcoreSpec(BatchqueryCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryCommercialcoreSpecEx(request, headers, runtime);
        }

        /**
         * Description: 根据商品code查询规格售卖模式
         * Summary: 查询规格售卖模式
         */
        public async Task<BatchqueryCommercialcoreSpecResponse> BatchqueryCommercialcoreSpecAsync(BatchqueryCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryCommercialcoreSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据商品code查询规格售卖模式
         * Summary: 查询规格售卖模式
         */
        public BatchqueryCommercialcoreSpecResponse BatchqueryCommercialcoreSpecEx(BatchqueryCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryCommercialcoreSpecResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.spec.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商品code查询规格售卖模式
         * Summary: 查询规格售卖模式
         */
        public async Task<BatchqueryCommercialcoreSpecResponse> BatchqueryCommercialcoreSpecExAsync(BatchqueryCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryCommercialcoreSpecResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.spec.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增规格与定价计划
         * Summary: 新增规格与定价计划
         */
        public AddCommercialcoreSpecResponse AddCommercialcoreSpec(AddCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddCommercialcoreSpecEx(request, headers, runtime);
        }

        /**
         * Description: 新增规格与定价计划
         * Summary: 新增规格与定价计划
         */
        public async Task<AddCommercialcoreSpecResponse> AddCommercialcoreSpecAsync(AddCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddCommercialcoreSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增规格与定价计划
         * Summary: 新增规格与定价计划
         */
        public AddCommercialcoreSpecResponse AddCommercialcoreSpecEx(AddCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCommercialcoreSpecResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.spec.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增规格与定价计划
         * Summary: 新增规格与定价计划
         */
        public async Task<AddCommercialcoreSpecResponse> AddCommercialcoreSpecExAsync(AddCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCommercialcoreSpecResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.spec.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新规格
         * Summary: 更新规格
         */
        public UpdateCommercialcoreSpecResponse UpdateCommercialcoreSpec(UpdateCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCommercialcoreSpecEx(request, headers, runtime);
        }

        /**
         * Description: 更新规格
         * Summary: 更新规格
         */
        public async Task<UpdateCommercialcoreSpecResponse> UpdateCommercialcoreSpecAsync(UpdateCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCommercialcoreSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新规格
         * Summary: 更新规格
         */
        public UpdateCommercialcoreSpecResponse UpdateCommercialcoreSpecEx(UpdateCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCommercialcoreSpecResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.spec.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新规格
         * Summary: 更新规格
         */
        public async Task<UpdateCommercialcoreSpecResponse> UpdateCommercialcoreSpecExAsync(UpdateCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCommercialcoreSpecResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.spec.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改规格状态
         * Summary: 修改规格状态
         */
        public AuthCommercialcoreSpecResponse AuthCommercialcoreSpec(AuthCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthCommercialcoreSpecEx(request, headers, runtime);
        }

        /**
         * Description: 修改规格状态
         * Summary: 修改规格状态
         */
        public async Task<AuthCommercialcoreSpecResponse> AuthCommercialcoreSpecAsync(AuthCommercialcoreSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthCommercialcoreSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改规格状态
         * Summary: 修改规格状态
         */
        public AuthCommercialcoreSpecResponse AuthCommercialcoreSpecEx(AuthCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthCommercialcoreSpecResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.spec.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改规格状态
         * Summary: 修改规格状态
         */
        public async Task<AuthCommercialcoreSpecResponse> AuthCommercialcoreSpecExAsync(AuthCommercialcoreSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthCommercialcoreSpecResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.spec.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品code查重校验
         * Summary: 产品code查重校验
         */
        public CheckCommercialcoreProductResponse CheckCommercialcoreProduct(CheckCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCommercialcoreProductEx(request, headers, runtime);
        }

        /**
         * Description: 产品code查重校验
         * Summary: 产品code查重校验
         */
        public async Task<CheckCommercialcoreProductResponse> CheckCommercialcoreProductAsync(CheckCommercialcoreProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCommercialcoreProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 产品code查重校验
         * Summary: 产品code查重校验
         */
        public CheckCommercialcoreProductResponse CheckCommercialcoreProductEx(CheckCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCommercialcoreProductResponse>(DoRequest("1.0", "antcloud.commercial.commercialcore.product.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品code查重校验
         * Summary: 产品code查重校验
         */
        public async Task<CheckCommercialcoreProductResponse> CheckCommercialcoreProductExAsync(CheckCommercialcoreProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCommercialcoreProductResponse>(await DoRequestAsync("1.0", "antcloud.commercial.commercialcore.product.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增签约接口
         * Summary: 新增签约接口
         */
        public AddPartnercoreSignResponse AddPartnercoreSign(AddPartnercoreSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddPartnercoreSignEx(request, headers, runtime);
        }

        /**
         * Description: 新增签约接口
         * Summary: 新增签约接口
         */
        public async Task<AddPartnercoreSignResponse> AddPartnercoreSignAsync(AddPartnercoreSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddPartnercoreSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增签约接口
         * Summary: 新增签约接口
         */
        public AddPartnercoreSignResponse AddPartnercoreSignEx(AddPartnercoreSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPartnercoreSignResponse>(DoRequest("1.0", "antcloud.commercial.partnercore.sign.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增签约接口
         * Summary: 新增签约接口
         */
        public async Task<AddPartnercoreSignResponse> AddPartnercoreSignExAsync(AddPartnercoreSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddPartnercoreSignResponse>(await DoRequestAsync("1.0", "antcloud.commercial.partnercore.sign.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 政策详情查询
         * Summary: 政策详情查询
         */
        public QueryPartnercorePolicyResponse QueryPartnercorePolicy(QueryPartnercorePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPartnercorePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 政策详情查询
         * Summary: 政策详情查询
         */
        public async Task<QueryPartnercorePolicyResponse> QueryPartnercorePolicyAsync(QueryPartnercorePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPartnercorePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 政策详情查询
         * Summary: 政策详情查询
         */
        public QueryPartnercorePolicyResponse QueryPartnercorePolicyEx(QueryPartnercorePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPartnercorePolicyResponse>(DoRequest("1.0", "antcloud.commercial.partnercore.policy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 政策详情查询
         * Summary: 政策详情查询
         */
        public async Task<QueryPartnercorePolicyResponse> QueryPartnercorePolicyExAsync(QueryPartnercorePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPartnercorePolicyResponse>(await DoRequestAsync("1.0", "antcloud.commercial.partnercore.policy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 政策分页查询
         * Summary: 政策分页查询
         */
        public PagequeryPartnercorePolicyResponse PagequeryPartnercorePolicy(PagequeryPartnercorePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryPartnercorePolicyEx(request, headers, runtime);
        }

        /**
         * Description: 政策分页查询
         * Summary: 政策分页查询
         */
        public async Task<PagequeryPartnercorePolicyResponse> PagequeryPartnercorePolicyAsync(PagequeryPartnercorePolicyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryPartnercorePolicyExAsync(request, headers, runtime);
        }

        /**
         * Description: 政策分页查询
         * Summary: 政策分页查询
         */
        public PagequeryPartnercorePolicyResponse PagequeryPartnercorePolicyEx(PagequeryPartnercorePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryPartnercorePolicyResponse>(DoRequest("1.0", "antcloud.commercial.partnercore.policy.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 政策分页查询
         * Summary: 政策分页查询
         */
        public async Task<PagequeryPartnercorePolicyResponse> PagequeryPartnercorePolicyExAsync(PagequeryPartnercorePolicyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryPartnercorePolicyResponse>(await DoRequestAsync("1.0", "antcloud.commercial.partnercore.policy.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 签约信息查询
         * Summary: 签约信息查询
         */
        public QueryPartnercoreSignResponse QueryPartnercoreSign(QueryPartnercoreSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPartnercoreSignEx(request, headers, runtime);
        }

        /**
         * Description: 签约信息查询
         * Summary: 签约信息查询
         */
        public async Task<QueryPartnercoreSignResponse> QueryPartnercoreSignAsync(QueryPartnercoreSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPartnercoreSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 签约信息查询
         * Summary: 签约信息查询
         */
        public QueryPartnercoreSignResponse QueryPartnercoreSignEx(QueryPartnercoreSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPartnercoreSignResponse>(DoRequest("1.0", "antcloud.commercial.partnercore.sign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 签约信息查询
         * Summary: 签约信息查询
         */
        public async Task<QueryPartnercoreSignResponse> QueryPartnercoreSignExAsync(QueryPartnercoreSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPartnercoreSignResponse>(await DoRequestAsync("1.0", "antcloud.commercial.partnercore.sign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
         * Summary: 批量获取商户已购规格实例信息-控制台用
         */
        public BatchqueryTradecorePaidspecinstanceResponse BatchqueryTradecorePaidspecinstance(BatchqueryTradecorePaidspecinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTradecorePaidspecinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
         * Summary: 批量获取商户已购规格实例信息-控制台用
         */
        public async Task<BatchqueryTradecorePaidspecinstanceResponse> BatchqueryTradecorePaidspecinstanceAsync(BatchqueryTradecorePaidspecinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTradecorePaidspecinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
         * Summary: 批量获取商户已购规格实例信息-控制台用
         */
        public BatchqueryTradecorePaidspecinstanceResponse BatchqueryTradecorePaidspecinstanceEx(BatchqueryTradecorePaidspecinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTradecorePaidspecinstanceResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.paidspecinstance.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根具商户id获取商户已购的规格实例的详细信息(包含规格名称、描述等)；该接口用与商户控制台显示商户已购规格信息
         * Summary: 批量获取商户已购规格实例信息-控制台用
         */
        public async Task<BatchqueryTradecorePaidspecinstanceResponse> BatchqueryTradecorePaidspecinstanceExAsync(BatchqueryTradecorePaidspecinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTradecorePaidspecinstanceResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.paidspecinstance.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
         * Summary: 获取已售给商户的规格实例信息-开发商用 
         */
        public BatchqueryTradecoreSoldspecinstanceResponse BatchqueryTradecoreSoldspecinstance(BatchqueryTradecoreSoldspecinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryTradecoreSoldspecinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
         * Summary: 获取已售给商户的规格实例信息-开发商用 
         */
        public async Task<BatchqueryTradecoreSoldspecinstanceResponse> BatchqueryTradecoreSoldspecinstanceAsync(BatchqueryTradecoreSoldspecinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryTradecoreSoldspecinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
         * Summary: 获取已售给商户的规格实例信息-开发商用 
         */
        public BatchqueryTradecoreSoldspecinstanceResponse BatchqueryTradecoreSoldspecinstanceEx(BatchqueryTradecoreSoldspecinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTradecoreSoldspecinstanceResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.soldspecinstance.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商户id和开发商id获取已售给某商户的所有规格实例的详细信息(不包含规格名称、描述等)；该接口用于开发商查询
         * Summary: 获取已售给商户的规格实例信息-开发商用 
         */
        public async Task<BatchqueryTradecoreSoldspecinstanceResponse> BatchqueryTradecoreSoldspecinstanceExAsync(BatchqueryTradecoreSoldspecinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryTradecoreSoldspecinstanceResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.soldspecinstance.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
         * Summary: 获取商户信息-开发商用
         */
        public QueryTradecoreMerchantinfoResponse QueryTradecoreMerchantinfo(QueryTradecoreMerchantinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTradecoreMerchantinfoEx(request, headers, runtime);
        }

        /**
         * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
         * Summary: 获取商户信息-开发商用
         */
        public async Task<QueryTradecoreMerchantinfoResponse> QueryTradecoreMerchantinfoAsync(QueryTradecoreMerchantinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTradecoreMerchantinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
         * Summary: 获取商户信息-开发商用
         */
        public QueryTradecoreMerchantinfoResponse QueryTradecoreMerchantinfoEx(QueryTradecoreMerchantinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTradecoreMerchantinfoResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.merchantinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商户id、开发商id获取存在服务关系的商户信息(开发商用)
         * Summary: 获取商户信息-开发商用
         */
        public async Task<QueryTradecoreMerchantinfoResponse> QueryTradecoreMerchantinfoExAsync(QueryTradecoreMerchantinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTradecoreMerchantinfoResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.merchantinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建支付单，调用支付宝接口获取收银台触发表单
         * Summary: 支付创建
         */
        public CreateTradecorePayResponse CreateTradecorePay(CreateTradecorePayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTradecorePayEx(request, headers, runtime);
        }

        /**
         * Description: 创建支付单，调用支付宝接口获取收银台触发表单
         * Summary: 支付创建
         */
        public async Task<CreateTradecorePayResponse> CreateTradecorePayAsync(CreateTradecorePayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTradecorePayExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建支付单，调用支付宝接口获取收银台触发表单
         * Summary: 支付创建
         */
        public CreateTradecorePayResponse CreateTradecorePayEx(CreateTradecorePayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTradecorePayResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.pay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建支付单，调用支付宝接口获取收银台触发表单
         * Summary: 支付创建
         */
        public async Task<CreateTradecorePayResponse> CreateTradecorePayExAsync(CreateTradecorePayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTradecorePayResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.pay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝支付结果回调
         * Summary: 支付结果回调
         */
        public ReceiveTradecorePayResponse ReceiveTradecorePay(ReceiveTradecorePayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReceiveTradecorePayEx(request, headers, runtime);
        }

        /**
         * Description: 支付宝支付结果回调
         * Summary: 支付结果回调
         */
        public async Task<ReceiveTradecorePayResponse> ReceiveTradecorePayAsync(ReceiveTradecorePayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReceiveTradecorePayExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付宝支付结果回调
         * Summary: 支付结果回调
         */
        public ReceiveTradecorePayResponse ReceiveTradecorePayEx(ReceiveTradecorePayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveTradecorePayResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.pay.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝支付结果回调
         * Summary: 支付结果回调
         */
        public async Task<ReceiveTradecorePayResponse> ReceiveTradecorePayExAsync(ReceiveTradecorePayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReceiveTradecorePayResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.pay.receive", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单取消
         * Summary: 订单取消
         */
        public CancelTradecoreOrderResponse CancelTradecoreOrder(CancelTradecoreOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelTradecoreOrderEx(request, headers, runtime);
        }

        /**
         * Description: 订单取消
         * Summary: 订单取消
         */
        public async Task<CancelTradecoreOrderResponse> CancelTradecoreOrderAsync(CancelTradecoreOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelTradecoreOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单取消
         * Summary: 订单取消
         */
        public CancelTradecoreOrderResponse CancelTradecoreOrderEx(CancelTradecoreOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelTradecoreOrderResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.order.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单取消
         * Summary: 订单取消
         */
        public async Task<CancelTradecoreOrderResponse> CancelTradecoreOrderExAsync(CancelTradecoreOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelTradecoreOrderResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.order.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单创建
         * Summary: 订单创建
         */
        public CreateTradecoreOrderResponse CreateTradecoreOrder(CreateTradecoreOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTradecoreOrderEx(request, headers, runtime);
        }

        /**
         * Description: 订单创建
         * Summary: 订单创建
         */
        public async Task<CreateTradecoreOrderResponse> CreateTradecoreOrderAsync(CreateTradecoreOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTradecoreOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单创建
         * Summary: 订单创建
         */
        public CreateTradecoreOrderResponse CreateTradecoreOrderEx(CreateTradecoreOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTradecoreOrderResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单创建
         * Summary: 订单创建
         */
        public async Task<CreateTradecoreOrderResponse> CreateTradecoreOrderExAsync(CreateTradecoreOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTradecoreOrderResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单查询
         * Summary: 订单查询
         */
        public QueryTradecoreOrderResponse QueryTradecoreOrder(QueryTradecoreOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTradecoreOrderEx(request, headers, runtime);
        }

        /**
         * Description: 订单查询
         * Summary: 订单查询
         */
        public async Task<QueryTradecoreOrderResponse> QueryTradecoreOrderAsync(QueryTradecoreOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTradecoreOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单查询
         * Summary: 订单查询
         */
        public QueryTradecoreOrderResponse QueryTradecoreOrderEx(QueryTradecoreOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTradecoreOrderResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单查询
         * Summary: 订单查询
         */
        public async Task<QueryTradecoreOrderResponse> QueryTradecoreOrderExAsync(QueryTradecoreOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTradecoreOrderResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单分页查询
         * Summary: 订单分页查询
         */
        public PagequeryTradecoreOrderResponse PagequeryTradecoreOrder(PagequeryTradecoreOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTradecoreOrderEx(request, headers, runtime);
        }

        /**
         * Description: 订单分页查询
         * Summary: 订单分页查询
         */
        public async Task<PagequeryTradecoreOrderResponse> PagequeryTradecoreOrderAsync(PagequeryTradecoreOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTradecoreOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单分页查询
         * Summary: 订单分页查询
         */
        public PagequeryTradecoreOrderResponse PagequeryTradecoreOrderEx(PagequeryTradecoreOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTradecoreOrderResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.order.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单分页查询
         * Summary: 订单分页查询
         */
        public async Task<PagequeryTradecoreOrderResponse> PagequeryTradecoreOrderExAsync(PagequeryTradecoreOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTradecoreOrderResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.order.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务商信息校验
         * Summary: 服务商信息校验
         */
        public CheckTradecoreSpResponse CheckTradecoreSp(CheckTradecoreSpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckTradecoreSpEx(request, headers, runtime);
        }

        /**
         * Description: 服务商信息校验
         * Summary: 服务商信息校验
         */
        public async Task<CheckTradecoreSpResponse> CheckTradecoreSpAsync(CheckTradecoreSpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckTradecoreSpExAsync(request, headers, runtime);
        }

        /**
         * Description: 服务商信息校验
         * Summary: 服务商信息校验
         */
        public CheckTradecoreSpResponse CheckTradecoreSpEx(CheckTradecoreSpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckTradecoreSpResponse>(DoRequest("1.0", "antcloud.commercial.tradecore.sp.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务商信息校验
         * Summary: 服务商信息校验
         */
        public async Task<CheckTradecoreSpResponse> CheckTradecoreSpExAsync(CheckTradecoreSpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckTradecoreSpResponse>(await DoRequestAsync("1.0", "antcloud.commercial.tradecore.sp.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
