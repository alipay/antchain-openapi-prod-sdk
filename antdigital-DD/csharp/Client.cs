// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.DD.Models;

namespace AntChain.SDK.DD
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Init client with Config</para>
        /// </description>
        /// 
        /// <param name="config">
        /// config contains the necessary information to create a client
        /// </param>
        public Client(Config config)
        {
            if (AlibabaCloud.TeaUtil.Common.IsUnset(config))
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Encapsulate the request and invoke the network</para>
        /// </description>
        /// 
        /// <param name="action">
        /// api name
        /// </param>
        /// <param name="protocol">
        /// http or https
        /// </param>
        /// <param name="method">
        /// e.g. GET
        /// </param>
        /// <param name="pathname">
        /// pathname of every api
        /// </param>
        /// <param name="request">
        /// which contains request params
        /// </param>
        /// <param name="runtime">
        /// which controls some details of call api, such as retry times
        /// </param>
        /// 
        /// <returns>
        /// the response
        /// </returns>
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
                        {"sdk_version", "1.0.9"},
                        {"_prod_code", "DD"},
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Encapsulate the request and invoke the network</para>
        /// </description>
        /// 
        /// <param name="action">
        /// api name
        /// </param>
        /// <param name="protocol">
        /// http or https
        /// </param>
        /// <param name="method">
        /// e.g. GET
        /// </param>
        /// <param name="pathname">
        /// pathname of every api
        /// </param>
        /// <param name="request">
        /// which contains request params
        /// </param>
        /// <param name="runtime">
        /// which controls some details of call api, such as retry times
        /// </param>
        /// 
        /// <returns>
        /// the response
        /// </returns>
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
                        {"sdk_version", "1.0.9"},
                        {"_prod_code", "DD"},
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用
        /// Summary: 测试使用</para>
        /// </description>
        public QueryDemoTestJltestResponse QueryDemoTestJltest(QueryDemoTestJltestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoTestJltestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用
        /// Summary: 测试使用</para>
        /// </description>
        public async Task<QueryDemoTestJltestResponse> QueryDemoTestJltestAsync(QueryDemoTestJltestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoTestJltestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用
        /// Summary: 测试使用</para>
        /// </description>
        public QueryDemoTestJltestResponse QueryDemoTestJltestEx(QueryDemoTestJltestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestJltestResponse>(DoRequest("1.0", "demo.test.jltest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用
        /// Summary: 测试使用</para>
        /// </description>
        public async Task<QueryDemoTestJltestResponse> QueryDemoTestJltestExAsync(QueryDemoTestJltestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestJltestResponse>(await DoRequestAsync("1.0", "demo.test.jltest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderxResponse CreateDemoBusinessOrderx(CreateDemoBusinessOrderxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderxResponse> CreateDemoBusinessOrderxAsync(CreateDemoBusinessOrderxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderxResponse CreateDemoBusinessOrderxEx(CreateDemoBusinessOrderxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderxResponse>(DoRequest("1.0", "demo.business.orderx.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderxResponse> CreateDemoBusinessOrderxExAsync(CreateDemoBusinessOrderxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderxResponse>(await DoRequestAsync("1.0", "demo.business.orderx.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderzResponse CreateDemoBusinessOrderz(CreateDemoBusinessOrderzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderzResponse> CreateDemoBusinessOrderzAsync(CreateDemoBusinessOrderzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderzResponse CreateDemoBusinessOrderzEx(CreateDemoBusinessOrderzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderzResponse>(DoRequest("1.0", "demo.business.orderz.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderzResponse> CreateDemoBusinessOrderzExAsync(CreateDemoBusinessOrderzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderzResponse>(await DoRequestAsync("1.0", "demo.business.orderz.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderyResponse CreateDemoBusinessOrdery(CreateDemoBusinessOrderyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderyResponse> CreateDemoBusinessOrderyAsync(CreateDemoBusinessOrderyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderyResponse CreateDemoBusinessOrderyEx(CreateDemoBusinessOrderyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderyResponse>(DoRequest("1.0", "demo.business.ordery.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderyResponse> CreateDemoBusinessOrderyExAsync(CreateDemoBusinessOrderyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderyResponse>(await DoRequestAsync("1.0", "demo.business.ordery.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单N
        /// Summary: 创建订单N</para>
        /// </description>
        public CreateDemoBusinessOrdernResponse CreateDemoBusinessOrdern(CreateDemoBusinessOrdernRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrdernEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单N
        /// Summary: 创建订单N</para>
        /// </description>
        public async Task<CreateDemoBusinessOrdernResponse> CreateDemoBusinessOrdernAsync(CreateDemoBusinessOrdernRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrdernExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单N
        /// Summary: 创建订单N</para>
        /// </description>
        public CreateDemoBusinessOrdernResponse CreateDemoBusinessOrdernEx(CreateDemoBusinessOrdernRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrdernResponse>(DoRequest("1.0", "demo.business.ordern.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单N
        /// Summary: 创建订单N</para>
        /// </description>
        public async Task<CreateDemoBusinessOrdernResponse> CreateDemoBusinessOrdernExAsync(CreateDemoBusinessOrdernRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrdernResponse>(await DoRequestAsync("1.0", "demo.business.ordern.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderaaResponse CreateDemoBusinessOrderaa(CreateDemoBusinessOrderaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderaaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderaaResponse> CreateDemoBusinessOrderaaAsync(CreateDemoBusinessOrderaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderaaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderaaResponse CreateDemoBusinessOrderaaEx(CreateDemoBusinessOrderaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderaaResponse>(DoRequest("1.0", "demo.business.orderaa.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderaaResponse> CreateDemoBusinessOrderaaExAsync(CreateDemoBusinessOrderaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderaaResponse>(await DoRequestAsync("1.0", "demo.business.orderaa.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderqResponse CreateDemoBusinessOrderq(CreateDemoBusinessOrderqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderqResponse> CreateDemoBusinessOrderqAsync(CreateDemoBusinessOrderqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderqResponse CreateDemoBusinessOrderqEx(CreateDemoBusinessOrderqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderqResponse>(DoRequest("1.0", "demo.business.orderq.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderqResponse> CreateDemoBusinessOrderqExAsync(CreateDemoBusinessOrderqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderqResponse>(await DoRequestAsync("1.0", "demo.business.orderq.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderbResponse CreateDemoBusinessOrderb(CreateDemoBusinessOrderbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderbResponse> CreateDemoBusinessOrderbAsync(CreateDemoBusinessOrderbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderbResponse CreateDemoBusinessOrderbEx(CreateDemoBusinessOrderbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderbResponse>(DoRequest("1.0", "demo.business.orderb.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderbResponse> CreateDemoBusinessOrderbExAsync(CreateDemoBusinessOrderbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderbResponse>(await DoRequestAsync("1.0", "demo.business.orderb.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public TestDemoTestApiResponse TestDemoTestApi(TestDemoTestApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestDemoTestApiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<TestDemoTestApiResponse> TestDemoTestApiAsync(TestDemoTestApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestDemoTestApiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public TestDemoTestApiResponse TestDemoTestApiEx(TestDemoTestApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestDemoTestApiResponse>(DoRequest("1.0", "demo.test.api.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<TestDemoTestApiResponse> TestDemoTestApiExAsync(TestDemoTestApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestDemoTestApiResponse>(await DoRequestAsync("1.0", "demo.test.api.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrdercResponse CreateDemoBusinessOrderc(CreateDemoBusinessOrdercRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrdercEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrdercResponse> CreateDemoBusinessOrdercAsync(CreateDemoBusinessOrdercRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrdercExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrdercResponse CreateDemoBusinessOrdercEx(CreateDemoBusinessOrdercRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrdercResponse>(DoRequest("1.0", "demo.business.orderc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrdercResponse> CreateDemoBusinessOrdercExAsync(CreateDemoBusinessOrdercRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrdercResponse>(await DoRequestAsync("1.0", "demo.business.orderc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderdResponse CreateDemoBusinessOrderd(CreateDemoBusinessOrderdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderdResponse> CreateDemoBusinessOrderdAsync(CreateDemoBusinessOrderdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderdResponse CreateDemoBusinessOrderdEx(CreateDemoBusinessOrderdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderdResponse>(DoRequest("1.0", "demo.business.orderd.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderdResponse> CreateDemoBusinessOrderdExAsync(CreateDemoBusinessOrderdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderdResponse>(await DoRequestAsync("1.0", "demo.business.orderd.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询用户所属项目列表
        /// Summary: 查询用户所属项目列表</para>
        /// </description>
        public QueryAntcloudAcmUserProjectResponse QueryAntcloudAcmUserProject(QueryAntcloudAcmUserProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudAcmUserProjectEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询用户所属项目列表
        /// Summary: 查询用户所属项目列表</para>
        /// </description>
        public async Task<QueryAntcloudAcmUserProjectResponse> QueryAntcloudAcmUserProjectAsync(QueryAntcloudAcmUserProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudAcmUserProjectExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询用户所属项目列表
        /// Summary: 查询用户所属项目列表</para>
        /// </description>
        public QueryAntcloudAcmUserProjectResponse QueryAntcloudAcmUserProjectEx(QueryAntcloudAcmUserProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudAcmUserProjectResponse>(DoRequest("1.0", "antcloud.acm.user.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询用户所属项目列表
        /// Summary: 查询用户所属项目列表</para>
        /// </description>
        public async Task<QueryAntcloudAcmUserProjectResponse> QueryAntcloudAcmUserProjectExAsync(QueryAntcloudAcmUserProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudAcmUserProjectResponse>(await DoRequestAsync("1.0", "antcloud.acm.user.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 线上对比线下计量计费资源包配置接口
        /// Summary: 线上对比线下计量计费资源包配置接口</para>
        /// </description>
        public CheckAntcloudBillingConfigPreResponse CheckAntcloudBillingConfigPre(CheckAntcloudBillingConfigPreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAntcloudBillingConfigPreEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 线上对比线下计量计费资源包配置接口
        /// Summary: 线上对比线下计量计费资源包配置接口</para>
        /// </description>
        public async Task<CheckAntcloudBillingConfigPreResponse> CheckAntcloudBillingConfigPreAsync(CheckAntcloudBillingConfigPreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAntcloudBillingConfigPreExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 线上对比线下计量计费资源包配置接口
        /// Summary: 线上对比线下计量计费资源包配置接口</para>
        /// </description>
        public CheckAntcloudBillingConfigPreResponse CheckAntcloudBillingConfigPreEx(CheckAntcloudBillingConfigPreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAntcloudBillingConfigPreResponse>(DoRequest("1.0", "antcloud.billing.config.pre.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 线上对比线下计量计费资源包配置接口
        /// Summary: 线上对比线下计量计费资源包配置接口</para>
        /// </description>
        public async Task<CheckAntcloudBillingConfigPreResponse> CheckAntcloudBillingConfigPreExAsync(CheckAntcloudBillingConfigPreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAntcloudBillingConfigPreResponse>(await DoRequestAsync("1.0", "antcloud.billing.config.pre.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 外部发券
        /// Summary: 外部发券</para>
        /// </description>
        public SendAntcloudMarketingPartnerCouponResponse SendAntcloudMarketingPartnerCoupon(SendAntcloudMarketingPartnerCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendAntcloudMarketingPartnerCouponEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 外部发券
        /// Summary: 外部发券</para>
        /// </description>
        public async Task<SendAntcloudMarketingPartnerCouponResponse> SendAntcloudMarketingPartnerCouponAsync(SendAntcloudMarketingPartnerCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendAntcloudMarketingPartnerCouponExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 外部发券
        /// Summary: 外部发券</para>
        /// </description>
        public SendAntcloudMarketingPartnerCouponResponse SendAntcloudMarketingPartnerCouponEx(SendAntcloudMarketingPartnerCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendAntcloudMarketingPartnerCouponResponse>(DoRequest("1.0", "antcloud.marketing.partner.coupon.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 外部发券
        /// Summary: 外部发券</para>
        /// </description>
        public async Task<SendAntcloudMarketingPartnerCouponResponse> SendAntcloudMarketingPartnerCouponExAsync(SendAntcloudMarketingPartnerCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendAntcloudMarketingPartnerCouponResponse>(await DoRequestAsync("1.0", "antcloud.marketing.partner.coupon.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 外部客户查询券余量
        /// Summary: 外部客户查询券余量</para>
        /// </description>
        public QueryAntcloudMarketingPartnerCouponstockResponse QueryAntcloudMarketingPartnerCouponstock(QueryAntcloudMarketingPartnerCouponstockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudMarketingPartnerCouponstockEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 外部客户查询券余量
        /// Summary: 外部客户查询券余量</para>
        /// </description>
        public async Task<QueryAntcloudMarketingPartnerCouponstockResponse> QueryAntcloudMarketingPartnerCouponstockAsync(QueryAntcloudMarketingPartnerCouponstockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudMarketingPartnerCouponstockExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 外部客户查询券余量
        /// Summary: 外部客户查询券余量</para>
        /// </description>
        public QueryAntcloudMarketingPartnerCouponstockResponse QueryAntcloudMarketingPartnerCouponstockEx(QueryAntcloudMarketingPartnerCouponstockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudMarketingPartnerCouponstockResponse>(DoRequest("1.0", "antcloud.marketing.partner.couponstock.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 外部客户查询券余量
        /// Summary: 外部客户查询券余量</para>
        /// </description>
        public async Task<QueryAntcloudMarketingPartnerCouponstockResponse> QueryAntcloudMarketingPartnerCouponstockExAsync(QueryAntcloudMarketingPartnerCouponstockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudMarketingPartnerCouponstockResponse>(await DoRequestAsync("1.0", "antcloud.marketing.partner.couponstock.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        /// Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果</para>
        /// </description>
        public QueryAntcloudTradeComboOptionsResponse QueryAntcloudTradeComboOptions(QueryAntcloudTradeComboOptionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudTradeComboOptionsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        /// Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果</para>
        /// </description>
        public async Task<QueryAntcloudTradeComboOptionsResponse> QueryAntcloudTradeComboOptionsAsync(QueryAntcloudTradeComboOptionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudTradeComboOptionsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        /// Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果</para>
        /// </description>
        public QueryAntcloudTradeComboOptionsResponse QueryAntcloudTradeComboOptionsEx(QueryAntcloudTradeComboOptionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudTradeComboOptionsResponse>(DoRequest("1.0", "antcloud.trade.combo.options.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果
        /// Summary: 查询套餐内各商品的可选规格列表，返回套餐基本信息及每个商品的可选规格、售卖规则校验结果</para>
        /// </description>
        public async Task<QueryAntcloudTradeComboOptionsResponse> QueryAntcloudTradeComboOptionsExAsync(QueryAntcloudTradeComboOptionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudTradeComboOptionsResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.options.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        /// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</para>
        /// </description>
        public CreatewithoptionsAntcloudTradeComboResponse CreatewithoptionsAntcloudTradeCombo(CreatewithoptionsAntcloudTradeComboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatewithoptionsAntcloudTradeComboEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        /// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</para>
        /// </description>
        public async Task<CreatewithoptionsAntcloudTradeComboResponse> CreatewithoptionsAntcloudTradeComboAsync(CreatewithoptionsAntcloudTradeComboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatewithoptionsAntcloudTradeComboExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        /// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</para>
        /// </description>
        public CreatewithoptionsAntcloudTradeComboResponse CreatewithoptionsAntcloudTradeComboEx(CreatewithoptionsAntcloudTradeComboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatewithoptionsAntcloudTradeComboResponse>(DoRequest("1.0", "antcloud.trade.combo.createwithoptions", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        /// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</para>
        /// </description>
        public async Task<CreatewithoptionsAntcloudTradeComboResponse> CreatewithoptionsAntcloudTradeComboExAsync(CreatewithoptionsAntcloudTradeComboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatewithoptionsAntcloudTradeComboResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.createwithoptions", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        /// Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消</para>
        /// </description>
        public CancelAntcloudTradeComboResponse CancelAntcloudTradeCombo(CancelAntcloudTradeComboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAntcloudTradeComboEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        /// Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消</para>
        /// </description>
        public async Task<CancelAntcloudTradeComboResponse> CancelAntcloudTradeComboAsync(CancelAntcloudTradeComboRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAntcloudTradeComboExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        /// Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消</para>
        /// </description>
        public CancelAntcloudTradeComboResponse CancelAntcloudTradeComboEx(CancelAntcloudTradeComboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntcloudTradeComboResponse>(DoRequest("1.0", "antcloud.trade.combo.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消
        /// Summary: 取消套餐订单，仅当订单处于 INIT（初始化）或 WAIT_CONFIRM（待确认）状态时允许取消</para>
        /// </description>
        public async Task<CancelAntcloudTradeComboResponse> CancelAntcloudTradeComboExAsync(CancelAntcloudTradeComboRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntcloudTradeComboResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        /// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</para>
        /// </description>
        public CreateAntcloudTradeComboOptionsResponse CreateAntcloudTradeComboOptions(CreateAntcloudTradeComboOptionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudTradeComboOptionsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        /// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</para>
        /// </description>
        public async Task<CreateAntcloudTradeComboOptionsResponse> CreateAntcloudTradeComboOptionsAsync(CreateAntcloudTradeComboOptionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudTradeComboOptionsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        /// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</para>
        /// </description>
        public CreateAntcloudTradeComboOptionsResponse CreateAntcloudTradeComboOptionsEx(CreateAntcloudTradeComboOptionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudTradeComboOptionsResponse>(DoRequest("1.0", "antcloud.trade.combo.options.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 户选择完套餐规格后调用，按自选规格创建套餐订单
        /// Summary: 户选择完套餐规格后调用，按自选规格创建套餐订单</para>
        /// </description>
        public async Task<CreateAntcloudTradeComboOptionsResponse> CreateAntcloudTradeComboOptionsExAsync(CreateAntcloudTradeComboOptionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudTradeComboOptionsResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.options.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 商品定价查询
        /// Summary: 商品定价查询</para>
        /// </description>
        public QueryAntcloudPccCommodityPriceResponse QueryAntcloudPccCommodityPrice(QueryAntcloudPccCommodityPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudPccCommodityPriceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 商品定价查询
        /// Summary: 商品定价查询</para>
        /// </description>
        public async Task<QueryAntcloudPccCommodityPriceResponse> QueryAntcloudPccCommodityPriceAsync(QueryAntcloudPccCommodityPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudPccCommodityPriceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 商品定价查询
        /// Summary: 商品定价查询</para>
        /// </description>
        public QueryAntcloudPccCommodityPriceResponse QueryAntcloudPccCommodityPriceEx(QueryAntcloudPccCommodityPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudPccCommodityPriceResponse>(DoRequest("1.0", "antcloud.pcc.commodity.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 商品定价查询
        /// Summary: 商品定价查询</para>
        /// </description>
        public async Task<QueryAntcloudPccCommodityPriceResponse> QueryAntcloudPccCommodityPriceExAsync(QueryAntcloudPccCommodityPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudPccCommodityPriceResponse>(await DoRequestAsync("1.0", "antcloud.pcc.commodity.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
