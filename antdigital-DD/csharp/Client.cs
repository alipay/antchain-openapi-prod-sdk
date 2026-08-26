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
                        {"sdk_version", "1.1.1"},
                        {"_prod_code", "DD"},
                        {"_prod_channel", "default"},
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
                        {"sdk_version", "1.1.1"},
                        {"_prod_code", "DD"},
                        {"_prod_channel", "default"},
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
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QueryDemoTestTestjlResponse QueryDemoTestTestjl(QueryDemoTestTestjlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDemoTestTestjlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QueryDemoTestTestjlResponse> QueryDemoTestTestjlAsync(QueryDemoTestTestjlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDemoTestTestjlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QueryDemoTestTestjlResponse QueryDemoTestTestjlEx(QueryDemoTestTestjlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestTestjlResponse>(DoRequest("1.0", "demo.test.testjl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QueryDemoTestTestjlResponse> QueryDemoTestTestjlExAsync(QueryDemoTestTestjlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDemoTestTestjlResponse>(await DoRequestAsync("1.0", "demo.test.testjl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderppResponse CreateDemoBusinessOrderpp(CreateDemoBusinessOrderppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderppEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderppResponse> CreateDemoBusinessOrderppAsync(CreateDemoBusinessOrderppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderppExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderppResponse CreateDemoBusinessOrderppEx(CreateDemoBusinessOrderppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderppResponse>(DoRequest("1.0", "demo.business.orderpp.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderppResponse> CreateDemoBusinessOrderppExAsync(CreateDemoBusinessOrderppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderppResponse>(await DoRequestAsync("1.0", "demo.business.orderpp.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderxxxResponse CreateDemoBusinessOrderxxx(CreateDemoBusinessOrderxxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderxxxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderxxxResponse> CreateDemoBusinessOrderxxxAsync(CreateDemoBusinessOrderxxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderxxxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderxxxResponse CreateDemoBusinessOrderxxxEx(CreateDemoBusinessOrderxxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderxxxResponse>(DoRequest("1.0", "demo.business.orderxxx.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderxxxResponse> CreateDemoBusinessOrderxxxExAsync(CreateDemoBusinessOrderxxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderxxxResponse>(await DoRequestAsync("1.0", "demo.business.orderxxx.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderResponse CreateDemoBusinessOrder(CreateDemoBusinessOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderResponse> CreateDemoBusinessOrderAsync(CreateDemoBusinessOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderResponse CreateDemoBusinessOrderEx(CreateDemoBusinessOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderResponse>(DoRequest("1.0", "demo.business.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderResponse> CreateDemoBusinessOrderExAsync(CreateDemoBusinessOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderResponse>(await DoRequestAsync("1.0", "demo.business.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderzzzResponse CreateDemoBusinessOrderzzz(CreateDemoBusinessOrderzzzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDemoBusinessOrderzzzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderzzzResponse> CreateDemoBusinessOrderzzzAsync(CreateDemoBusinessOrderzzzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDemoBusinessOrderzzzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public CreateDemoBusinessOrderzzzResponse CreateDemoBusinessOrderzzzEx(CreateDemoBusinessOrderzzzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderzzzResponse>(DoRequest("1.0", "demo.business.orderzzz.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建订单
        /// Summary: 创建订单</para>
        /// </description>
        public async Task<CreateDemoBusinessOrderzzzResponse> CreateDemoBusinessOrderzzzExAsync(CreateDemoBusinessOrderzzzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDemoBusinessOrderzzzResponse>(await DoRequestAsync("1.0", "demo.business.orderzzz.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public ApixaDemoCliCreateResponse ApixaDemoCliCreate(ApixaDemoCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApixaDemoCliCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public async Task<ApixaDemoCliCreateResponse> ApixaDemoCliCreateAsync(ApixaDemoCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApixaDemoCliCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public ApixaDemoCliCreateResponse ApixaDemoCliCreateEx(ApixaDemoCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApixaDemoCliCreateResponse>(DoRequest("1.0", "demo.cli.create.apixa", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public async Task<ApixaDemoCliCreateResponse> ApixaDemoCliCreateExAsync(ApixaDemoCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApixaDemoCliCreateResponse>(await DoRequestAsync("1.0", "demo.cli.create.apixa", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public ApixbDemoCliCreateResponse ApixbDemoCliCreate(ApixbDemoCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApixbDemoCliCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public async Task<ApixbDemoCliCreateResponse> ApixbDemoCliCreateAsync(ApixbDemoCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApixbDemoCliCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public ApixbDemoCliCreateResponse ApixbDemoCliCreateEx(ApixbDemoCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApixbDemoCliCreateResponse>(DoRequest("1.0", "demo.cli.create.apixb", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public async Task<ApixbDemoCliCreateResponse> ApixbDemoCliCreateExAsync(ApixbDemoCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApixbDemoCliCreateResponse>(await DoRequestAsync("1.0", "demo.cli.create.apixb", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public ApizDemoCliCreateResponse ApizDemoCliCreate(ApizDemoCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApizDemoCliCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public async Task<ApizDemoCliCreateResponse> ApizDemoCliCreateAsync(ApizDemoCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApizDemoCliCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public ApizDemoCliCreateResponse ApizDemoCliCreateEx(ApizDemoCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApizDemoCliCreateResponse>(DoRequest("1.0", "demo.cli.create.apiz", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口A
        /// Summary: cli创建测试接口A</para>
        /// </description>
        public async Task<ApizDemoCliCreateResponse> ApizDemoCliCreateExAsync(ApizDemoCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApizDemoCliCreateResponse>(await DoRequestAsync("1.0", "demo.cli.create.apiz", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 账号创建
        /// Summary: 账号创建</para>
        /// </description>
        public CreateAntcloudAcmAntchainTenantResponse CreateAntcloudAcmAntchainTenant(CreateAntcloudAcmAntchainTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudAcmAntchainTenantEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 账号创建
        /// Summary: 账号创建</para>
        /// </description>
        public async Task<CreateAntcloudAcmAntchainTenantResponse> CreateAntcloudAcmAntchainTenantAsync(CreateAntcloudAcmAntchainTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudAcmAntchainTenantExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 账号创建
        /// Summary: 账号创建</para>
        /// </description>
        public CreateAntcloudAcmAntchainTenantResponse CreateAntcloudAcmAntchainTenantEx(CreateAntcloudAcmAntchainTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudAcmAntchainTenantResponse>(DoRequest("1.0", "antcloud.acm.antchain.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 账号创建
        /// Summary: 账号创建</para>
        /// </description>
        public async Task<CreateAntcloudAcmAntchainTenantResponse> CreateAntcloudAcmAntchainTenantExAsync(CreateAntcloudAcmAntchainTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudAcmAntchainTenantResponse>(await DoRequestAsync("1.0", "antcloud.acm.antchain.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 客户认证信息更新
        /// Summary: 客户认证信息更新</para>
        /// </description>
        public UpdateAntcloudAcmCustomerIdentityResponse UpdateAntcloudAcmCustomerIdentity(UpdateAntcloudAcmCustomerIdentityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntcloudAcmCustomerIdentityEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 客户认证信息更新
        /// Summary: 客户认证信息更新</para>
        /// </description>
        public async Task<UpdateAntcloudAcmCustomerIdentityResponse> UpdateAntcloudAcmCustomerIdentityAsync(UpdateAntcloudAcmCustomerIdentityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntcloudAcmCustomerIdentityExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 客户认证信息更新
        /// Summary: 客户认证信息更新</para>
        /// </description>
        public UpdateAntcloudAcmCustomerIdentityResponse UpdateAntcloudAcmCustomerIdentityEx(UpdateAntcloudAcmCustomerIdentityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntcloudAcmCustomerIdentityResponse>(DoRequest("1.0", "antcloud.acm.customer.identity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 客户认证信息更新
        /// Summary: 客户认证信息更新</para>
        /// </description>
        public async Task<UpdateAntcloudAcmCustomerIdentityResponse> UpdateAntcloudAcmCustomerIdentityExAsync(UpdateAntcloudAcmCustomerIdentityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntcloudAcmCustomerIdentityResponse>(await DoRequestAsync("1.0", "antcloud.acm.customer.identity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
        /// <para>Description: 更新蚂蚁链账号的国家代码
        /// Summary: 更新蚂蚁链账号的国家代码</para>
        /// </description>
        public UpdateAntcloudAcmTenantCountryResponse UpdateAntcloudAcmTenantCountry(UpdateAntcloudAcmTenantCountryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntcloudAcmTenantCountryEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新蚂蚁链账号的国家代码
        /// Summary: 更新蚂蚁链账号的国家代码</para>
        /// </description>
        public async Task<UpdateAntcloudAcmTenantCountryResponse> UpdateAntcloudAcmTenantCountryAsync(UpdateAntcloudAcmTenantCountryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntcloudAcmTenantCountryExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新蚂蚁链账号的国家代码
        /// Summary: 更新蚂蚁链账号的国家代码</para>
        /// </description>
        public UpdateAntcloudAcmTenantCountryResponse UpdateAntcloudAcmTenantCountryEx(UpdateAntcloudAcmTenantCountryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntcloudAcmTenantCountryResponse>(DoRequest("1.0", "antcloud.acm.tenant.country.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新蚂蚁链账号的国家代码
        /// Summary: 更新蚂蚁链账号的国家代码</para>
        /// </description>
        public async Task<UpdateAntcloudAcmTenantCountryResponse> UpdateAntcloudAcmTenantCountryExAsync(UpdateAntcloudAcmTenantCountryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntcloudAcmTenantCountryResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.country.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询租户下项目列表
        /// Summary: 查询租户下项目列表</para>
        /// </description>
        public QueryAntcloudAcmTenantProjectResponse QueryAntcloudAcmTenantProject(QueryAntcloudAcmTenantProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudAcmTenantProjectEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询租户下项目列表
        /// Summary: 查询租户下项目列表</para>
        /// </description>
        public async Task<QueryAntcloudAcmTenantProjectResponse> QueryAntcloudAcmTenantProjectAsync(QueryAntcloudAcmTenantProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudAcmTenantProjectExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询租户下项目列表
        /// Summary: 查询租户下项目列表</para>
        /// </description>
        public QueryAntcloudAcmTenantProjectResponse QueryAntcloudAcmTenantProjectEx(QueryAntcloudAcmTenantProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudAcmTenantProjectResponse>(DoRequest("1.0", "antcloud.acm.tenant.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询租户下项目列表
        /// Summary: 查询租户下项目列表</para>
        /// </description>
        public async Task<QueryAntcloudAcmTenantProjectResponse> QueryAntcloudAcmTenantProjectExAsync(QueryAntcloudAcmTenantProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudAcmTenantProjectResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建项目
        /// Summary: 创建项目</para>
        /// </description>
        public CreateAntcloudAcmTenantProjectResponse CreateAntcloudAcmTenantProject(CreateAntcloudAcmTenantProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudAcmTenantProjectEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建项目
        /// Summary: 创建项目</para>
        /// </description>
        public async Task<CreateAntcloudAcmTenantProjectResponse> CreateAntcloudAcmTenantProjectAsync(CreateAntcloudAcmTenantProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudAcmTenantProjectExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建项目
        /// Summary: 创建项目</para>
        /// </description>
        public CreateAntcloudAcmTenantProjectResponse CreateAntcloudAcmTenantProjectEx(CreateAntcloudAcmTenantProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudAcmTenantProjectResponse>(DoRequest("1.0", "antcloud.acm.tenant.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建项目
        /// Summary: 创建项目</para>
        /// </description>
        public async Task<CreateAntcloudAcmTenantProjectResponse> CreateAntcloudAcmTenantProjectExAsync(CreateAntcloudAcmTenantProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudAcmTenantProjectResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 编辑项目
        /// Summary: 编辑项目</para>
        /// </description>
        public UpdateAntcloudAcmTenantProjectResponse UpdateAntcloudAcmTenantProject(UpdateAntcloudAcmTenantProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntcloudAcmTenantProjectEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 编辑项目
        /// Summary: 编辑项目</para>
        /// </description>
        public async Task<UpdateAntcloudAcmTenantProjectResponse> UpdateAntcloudAcmTenantProjectAsync(UpdateAntcloudAcmTenantProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntcloudAcmTenantProjectExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 编辑项目
        /// Summary: 编辑项目</para>
        /// </description>
        public UpdateAntcloudAcmTenantProjectResponse UpdateAntcloudAcmTenantProjectEx(UpdateAntcloudAcmTenantProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntcloudAcmTenantProjectResponse>(DoRequest("1.0", "antcloud.acm.tenant.project.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 编辑项目
        /// Summary: 编辑项目</para>
        /// </description>
        public async Task<UpdateAntcloudAcmTenantProjectResponse> UpdateAntcloudAcmTenantProjectExAsync(UpdateAntcloudAcmTenantProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntcloudAcmTenantProjectResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.project.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新项目状态
        /// Summary: 更新项目状态</para>
        /// </description>
        public UpdateAntcloudAcmProjectStatusResponse UpdateAntcloudAcmProjectStatus(UpdateAntcloudAcmProjectStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntcloudAcmProjectStatusEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新项目状态
        /// Summary: 更新项目状态</para>
        /// </description>
        public async Task<UpdateAntcloudAcmProjectStatusResponse> UpdateAntcloudAcmProjectStatusAsync(UpdateAntcloudAcmProjectStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntcloudAcmProjectStatusExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新项目状态
        /// Summary: 更新项目状态</para>
        /// </description>
        public UpdateAntcloudAcmProjectStatusResponse UpdateAntcloudAcmProjectStatusEx(UpdateAntcloudAcmProjectStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntcloudAcmProjectStatusResponse>(DoRequest("1.0", "antcloud.acm.project.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新项目状态
        /// Summary: 更新项目状态</para>
        /// </description>
        public async Task<UpdateAntcloudAcmProjectStatusResponse> UpdateAntcloudAcmProjectStatusExAsync(UpdateAntcloudAcmProjectStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntcloudAcmProjectStatusResponse>(await DoRequestAsync("1.0", "antcloud.acm.project.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 分页查询项目成员列表
        /// Summary: 分页查询项目成员列表</para>
        /// </description>
        public QueryAntcloudAcmProjectMemberResponse QueryAntcloudAcmProjectMember(QueryAntcloudAcmProjectMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudAcmProjectMemberEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 分页查询项目成员列表
        /// Summary: 分页查询项目成员列表</para>
        /// </description>
        public async Task<QueryAntcloudAcmProjectMemberResponse> QueryAntcloudAcmProjectMemberAsync(QueryAntcloudAcmProjectMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudAcmProjectMemberExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 分页查询项目成员列表
        /// Summary: 分页查询项目成员列表</para>
        /// </description>
        public QueryAntcloudAcmProjectMemberResponse QueryAntcloudAcmProjectMemberEx(QueryAntcloudAcmProjectMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudAcmProjectMemberResponse>(DoRequest("1.0", "antcloud.acm.project.member.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 分页查询项目成员列表
        /// Summary: 分页查询项目成员列表</para>
        /// </description>
        public async Task<QueryAntcloudAcmProjectMemberResponse> QueryAntcloudAcmProjectMemberExAsync(QueryAntcloudAcmProjectMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudAcmProjectMemberResponse>(await DoRequestAsync("1.0", "antcloud.acm.project.member.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 批量添加项目成员
        /// Summary: 批量添加项目成员</para>
        /// </description>
        public AddAntcloudAcmProjectMemberResponse AddAntcloudAcmProjectMember(AddAntcloudAcmProjectMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAntcloudAcmProjectMemberEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 批量添加项目成员
        /// Summary: 批量添加项目成员</para>
        /// </description>
        public async Task<AddAntcloudAcmProjectMemberResponse> AddAntcloudAcmProjectMemberAsync(AddAntcloudAcmProjectMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAntcloudAcmProjectMemberExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 批量添加项目成员
        /// Summary: 批量添加项目成员</para>
        /// </description>
        public AddAntcloudAcmProjectMemberResponse AddAntcloudAcmProjectMemberEx(AddAntcloudAcmProjectMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntcloudAcmProjectMemberResponse>(DoRequest("1.0", "antcloud.acm.project.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 批量添加项目成员
        /// Summary: 批量添加项目成员</para>
        /// </description>
        public async Task<AddAntcloudAcmProjectMemberResponse> AddAntcloudAcmProjectMemberExAsync(AddAntcloudAcmProjectMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntcloudAcmProjectMemberResponse>(await DoRequestAsync("1.0", "antcloud.acm.project.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 移除项目成员
        /// Summary: 移除项目成员</para>
        /// </description>
        public RemoveAntcloudAcmProjectMemberResponse RemoveAntcloudAcmProjectMember(RemoveAntcloudAcmProjectMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveAntcloudAcmProjectMemberEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 移除项目成员
        /// Summary: 移除项目成员</para>
        /// </description>
        public async Task<RemoveAntcloudAcmProjectMemberResponse> RemoveAntcloudAcmProjectMemberAsync(RemoveAntcloudAcmProjectMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveAntcloudAcmProjectMemberExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 移除项目成员
        /// Summary: 移除项目成员</para>
        /// </description>
        public RemoveAntcloudAcmProjectMemberResponse RemoveAntcloudAcmProjectMemberEx(RemoveAntcloudAcmProjectMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveAntcloudAcmProjectMemberResponse>(DoRequest("1.0", "antcloud.acm.project.member.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 移除项目成员
        /// Summary: 移除项目成员</para>
        /// </description>
        public async Task<RemoveAntcloudAcmProjectMemberResponse> RemoveAntcloudAcmProjectMemberExAsync(RemoveAntcloudAcmProjectMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveAntcloudAcmProjectMemberResponse>(await DoRequestAsync("1.0", "antcloud.acm.project.member.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询尚未加入该项目的用户列表
        /// Summary: 查询尚未加入该项目的用户列表</para>
        /// </description>
        public QueryAntcloudAcmProjectUserResponse QueryAntcloudAcmProjectUser(QueryAntcloudAcmProjectUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudAcmProjectUserEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询尚未加入该项目的用户列表
        /// Summary: 查询尚未加入该项目的用户列表</para>
        /// </description>
        public async Task<QueryAntcloudAcmProjectUserResponse> QueryAntcloudAcmProjectUserAsync(QueryAntcloudAcmProjectUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudAcmProjectUserExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询尚未加入该项目的用户列表
        /// Summary: 查询尚未加入该项目的用户列表</para>
        /// </description>
        public QueryAntcloudAcmProjectUserResponse QueryAntcloudAcmProjectUserEx(QueryAntcloudAcmProjectUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudAcmProjectUserResponse>(DoRequest("1.0", "antcloud.acm.project.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询尚未加入该项目的用户列表
        /// Summary: 查询尚未加入该项目的用户列表</para>
        /// </description>
        public async Task<QueryAntcloudAcmProjectUserResponse> QueryAntcloudAcmProjectUserExAsync(QueryAntcloudAcmProjectUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudAcmProjectUserResponse>(await DoRequestAsync("1.0", "antcloud.acm.project.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据租户查询实例列表
        /// Summary: 根据租户查询实例列表</para>
        /// </description>
        public ListAntcloudOfferInstanceResponse ListAntcloudOfferInstance(ListAntcloudOfferInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntcloudOfferInstanceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据租户查询实例列表
        /// Summary: 根据租户查询实例列表</para>
        /// </description>
        public async Task<ListAntcloudOfferInstanceResponse> ListAntcloudOfferInstanceAsync(ListAntcloudOfferInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntcloudOfferInstanceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据租户查询实例列表
        /// Summary: 根据租户查询实例列表</para>
        /// </description>
        public ListAntcloudOfferInstanceResponse ListAntcloudOfferInstanceEx(ListAntcloudOfferInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntcloudOfferInstanceResponse>(DoRequest("1.0", "antcloud.offer.instance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据租户查询实例列表
        /// Summary: 根据租户查询实例列表</para>
        /// </description>
        public async Task<ListAntcloudOfferInstanceResponse> ListAntcloudOfferInstanceExAsync(ListAntcloudOfferInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntcloudOfferInstanceResponse>(await DoRequestAsync("1.0", "antcloud.offer.instance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 由外部业务系统来调用触发抵扣接口
        /// Summary: 由外部业务系统来调用触发抵扣接口</para>
        /// </description>
        public ApplyAntcloudBillingRespackageCountResponse ApplyAntcloudBillingRespackageCount(ApplyAntcloudBillingRespackageCountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAntcloudBillingRespackageCountEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 由外部业务系统来调用触发抵扣接口
        /// Summary: 由外部业务系统来调用触发抵扣接口</para>
        /// </description>
        public async Task<ApplyAntcloudBillingRespackageCountResponse> ApplyAntcloudBillingRespackageCountAsync(ApplyAntcloudBillingRespackageCountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAntcloudBillingRespackageCountExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 由外部业务系统来调用触发抵扣接口
        /// Summary: 由外部业务系统来调用触发抵扣接口</para>
        /// </description>
        public ApplyAntcloudBillingRespackageCountResponse ApplyAntcloudBillingRespackageCountEx(ApplyAntcloudBillingRespackageCountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntcloudBillingRespackageCountResponse>(DoRequest("1.0", "antcloud.billing.respackage.count.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 由外部业务系统来调用触发抵扣接口
        /// Summary: 由外部业务系统来调用触发抵扣接口</para>
        /// </description>
        public async Task<ApplyAntcloudBillingRespackageCountResponse> ApplyAntcloudBillingRespackageCountExAsync(ApplyAntcloudBillingRespackageCountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntcloudBillingRespackageCountResponse>(await DoRequestAsync("1.0", "antcloud.billing.respackage.count.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据租户、抵扣的量价商品查询资源包余量
        /// Summary: 根据租户、抵扣的量价商品查询资源包余量</para>
        /// </description>
        public QueryAntcloudBillingRespackageBalanceResponse QueryAntcloudBillingRespackageBalance(QueryAntcloudBillingRespackageBalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudBillingRespackageBalanceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据租户、抵扣的量价商品查询资源包余量
        /// Summary: 根据租户、抵扣的量价商品查询资源包余量</para>
        /// </description>
        public async Task<QueryAntcloudBillingRespackageBalanceResponse> QueryAntcloudBillingRespackageBalanceAsync(QueryAntcloudBillingRespackageBalanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudBillingRespackageBalanceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据租户、抵扣的量价商品查询资源包余量
        /// Summary: 根据租户、抵扣的量价商品查询资源包余量</para>
        /// </description>
        public QueryAntcloudBillingRespackageBalanceResponse QueryAntcloudBillingRespackageBalanceEx(QueryAntcloudBillingRespackageBalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudBillingRespackageBalanceResponse>(DoRequest("1.0", "antcloud.billing.respackage.balance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据租户、抵扣的量价商品查询资源包余量
        /// Summary: 根据租户、抵扣的量价商品查询资源包余量</para>
        /// </description>
        public async Task<QueryAntcloudBillingRespackageBalanceResponse> QueryAntcloudBillingRespackageBalanceExAsync(QueryAntcloudBillingRespackageBalanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudBillingRespackageBalanceResponse>(await DoRequestAsync("1.0", "antcloud.billing.respackage.balance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
        /// <para>Description: 查询指定租户指定产品列表可用优惠券
        /// Summary: 查询指定租户指定产品列表可用优惠券</para>
        /// </description>
        public QueryAntcloudMarketingPartnerCouponResponse QueryAntcloudMarketingPartnerCoupon(QueryAntcloudMarketingPartnerCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudMarketingPartnerCouponEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询指定租户指定产品列表可用优惠券
        /// Summary: 查询指定租户指定产品列表可用优惠券</para>
        /// </description>
        public async Task<QueryAntcloudMarketingPartnerCouponResponse> QueryAntcloudMarketingPartnerCouponAsync(QueryAntcloudMarketingPartnerCouponRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudMarketingPartnerCouponExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询指定租户指定产品列表可用优惠券
        /// Summary: 查询指定租户指定产品列表可用优惠券</para>
        /// </description>
        public QueryAntcloudMarketingPartnerCouponResponse QueryAntcloudMarketingPartnerCouponEx(QueryAntcloudMarketingPartnerCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudMarketingPartnerCouponResponse>(DoRequest("1.0", "antcloud.marketing.partner.coupon.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询指定租户指定产品列表可用优惠券
        /// Summary: 查询指定租户指定产品列表可用优惠券</para>
        /// </description>
        public async Task<QueryAntcloudMarketingPartnerCouponResponse> QueryAntcloudMarketingPartnerCouponExAsync(QueryAntcloudMarketingPartnerCouponRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudMarketingPartnerCouponResponse>(await DoRequestAsync("1.0", "antcloud.marketing.partner.coupon.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于查询可用的优惠券模板信息
        /// Summary: 用于查询可用的优惠券模板信息</para>
        /// </description>
        public ListAntcloudMarketingPartnerCoupontemplateResponse ListAntcloudMarketingPartnerCoupontemplate(ListAntcloudMarketingPartnerCoupontemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntcloudMarketingPartnerCoupontemplateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于查询可用的优惠券模板信息
        /// Summary: 用于查询可用的优惠券模板信息</para>
        /// </description>
        public async Task<ListAntcloudMarketingPartnerCoupontemplateResponse> ListAntcloudMarketingPartnerCoupontemplateAsync(ListAntcloudMarketingPartnerCoupontemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntcloudMarketingPartnerCoupontemplateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于查询可用的优惠券模板信息
        /// Summary: 用于查询可用的优惠券模板信息</para>
        /// </description>
        public ListAntcloudMarketingPartnerCoupontemplateResponse ListAntcloudMarketingPartnerCoupontemplateEx(ListAntcloudMarketingPartnerCoupontemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntcloudMarketingPartnerCoupontemplateResponse>(DoRequest("1.0", "antcloud.marketing.partner.coupontemplate.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于查询可用的优惠券模板信息
        /// Summary: 用于查询可用的优惠券模板信息</para>
        /// </description>
        public async Task<ListAntcloudMarketingPartnerCoupontemplateResponse> ListAntcloudMarketingPartnerCoupontemplateExAsync(ListAntcloudMarketingPartnerCoupontemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntcloudMarketingPartnerCoupontemplateResponse>(await DoRequestAsync("1.0", "antcloud.marketing.partner.coupontemplate.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 套餐询价接口
        /// Summary: 套餐询价接口</para>
        /// </description>
        public QueryAntcloudTradeComboPriceResponse QueryAntcloudTradeComboPrice(QueryAntcloudTradeComboPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudTradeComboPriceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 套餐询价接口
        /// Summary: 套餐询价接口</para>
        /// </description>
        public async Task<QueryAntcloudTradeComboPriceResponse> QueryAntcloudTradeComboPriceAsync(QueryAntcloudTradeComboPriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudTradeComboPriceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 套餐询价接口
        /// Summary: 套餐询价接口</para>
        /// </description>
        public QueryAntcloudTradeComboPriceResponse QueryAntcloudTradeComboPriceEx(QueryAntcloudTradeComboPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudTradeComboPriceResponse>(DoRequest("1.0", "antcloud.trade.combo.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 套餐询价接口
        /// Summary: 套餐询价接口</para>
        /// </description>
        public async Task<QueryAntcloudTradeComboPriceResponse> QueryAntcloudTradeComboPriceExAsync(QueryAntcloudTradeComboPriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudTradeComboPriceResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 套餐订单支付接口
        /// Summary: 套餐订单支付接口</para>
        /// </description>
        public PayAntcloudTradeComboOrderResponse PayAntcloudTradeComboOrder(PayAntcloudTradeComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayAntcloudTradeComboOrderEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 套餐订单支付接口
        /// Summary: 套餐订单支付接口</para>
        /// </description>
        public async Task<PayAntcloudTradeComboOrderResponse> PayAntcloudTradeComboOrderAsync(PayAntcloudTradeComboOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayAntcloudTradeComboOrderExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 套餐订单支付接口
        /// Summary: 套餐订单支付接口</para>
        /// </description>
        public PayAntcloudTradeComboOrderResponse PayAntcloudTradeComboOrderEx(PayAntcloudTradeComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayAntcloudTradeComboOrderResponse>(DoRequest("1.0", "antcloud.trade.combo.order.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 套餐订单支付接口
        /// Summary: 套餐订单支付接口</para>
        /// </description>
        public async Task<PayAntcloudTradeComboOrderResponse> PayAntcloudTradeComboOrderExAsync(PayAntcloudTradeComboOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayAntcloudTradeComboOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.combo.order.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        /// Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动</para>
        /// </description>
        public QueryAntcloudTradePriceResponse QueryAntcloudTradePrice(QueryAntcloudTradePriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudTradePriceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        /// Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动</para>
        /// </description>
        public async Task<QueryAntcloudTradePriceResponse> QueryAntcloudTradePriceAsync(QueryAntcloudTradePriceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudTradePriceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        /// Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动</para>
        /// </description>
        public QueryAntcloudTradePriceResponse QueryAntcloudTradePriceEx(QueryAntcloudTradePriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudTradePriceResponse>(DoRequest("1.0", "antcloud.trade.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        /// Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动</para>
        /// </description>
        public async Task<QueryAntcloudTradePriceResponse> QueryAntcloudTradePriceExAsync(QueryAntcloudTradePriceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudTradePriceResponse>(await DoRequestAsync("1.0", "antcloud.trade.price.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
        /// <para>Description: 单商品订单履约状态查询
        /// Summary: 单商品订单履约状态查询</para>
        /// </description>
        public GetAntcloudTradeOrderResponse GetAntcloudTradeOrder(GetAntcloudTradeOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntcloudTradeOrderEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 单商品订单履约状态查询
        /// Summary: 单商品订单履约状态查询</para>
        /// </description>
        public async Task<GetAntcloudTradeOrderResponse> GetAntcloudTradeOrderAsync(GetAntcloudTradeOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntcloudTradeOrderExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 单商品订单履约状态查询
        /// Summary: 单商品订单履约状态查询</para>
        /// </description>
        public GetAntcloudTradeOrderResponse GetAntcloudTradeOrderEx(GetAntcloudTradeOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntcloudTradeOrderResponse>(DoRequest("1.0", "antcloud.trade.order.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 单商品订单履约状态查询
        /// Summary: 单商品订单履约状态查询</para>
        /// </description>
        public async Task<GetAntcloudTradeOrderResponse> GetAntcloudTradeOrderExAsync(GetAntcloudTradeOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntcloudTradeOrderResponse>(await DoRequestAsync("1.0", "antcloud.trade.order.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public UseAntchainAbcJustTestResponse UseAntchainAbcJustTest(UseAntchainAbcJustTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UseAntchainAbcJustTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<UseAntchainAbcJustTestResponse> UseAntchainAbcJustTestAsync(UseAntchainAbcJustTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UseAntchainAbcJustTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public UseAntchainAbcJustTestResponse UseAntchainAbcJustTestEx(UseAntchainAbcJustTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UseAntchainAbcJustTestResponse>(DoRequest("1.0", "antchain.abc.just.test.use", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<UseAntchainAbcJustTestResponse> UseAntchainAbcJustTestExAsync(UseAntchainAbcJustTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UseAntchainAbcJustTestResponse>(await DoRequestAsync("1.0", "antchain.abc.just.test.use", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际开票场景下查询客户信息
        /// Summary: 国际开票场景下查询客户信息</para>
        /// </description>
        public QueryAntcloudInvoiceIntlconfigUserinfoResponse QueryAntcloudInvoiceIntlconfigUserinfo(QueryAntcloudInvoiceIntlconfigUserinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudInvoiceIntlconfigUserinfoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际开票场景下查询客户信息
        /// Summary: 国际开票场景下查询客户信息</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlconfigUserinfoResponse> QueryAntcloudInvoiceIntlconfigUserinfoAsync(QueryAntcloudInvoiceIntlconfigUserinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudInvoiceIntlconfigUserinfoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际开票场景下查询客户信息
        /// Summary: 国际开票场景下查询客户信息</para>
        /// </description>
        public QueryAntcloudInvoiceIntlconfigUserinfoResponse QueryAntcloudInvoiceIntlconfigUserinfoEx(QueryAntcloudInvoiceIntlconfigUserinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlconfigUserinfoResponse>(DoRequest("1.0", "antcloud.invoice.intlconfig.userinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际开票场景下查询客户信息
        /// Summary: 国际开票场景下查询客户信息</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlconfigUserinfoResponse> QueryAntcloudInvoiceIntlconfigUserinfoExAsync(QueryAntcloudInvoiceIntlconfigUserinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlconfigUserinfoResponse>(await DoRequestAsync("1.0", "antcloud.invoice.intlconfig.userinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际发票场景果询可开票单据
        /// Summary: 国际发票场景果询可开票单据</para>
        /// </description>
        public QueryAntcloudInvoiceIntlamountRcptResponse QueryAntcloudInvoiceIntlamountRcpt(QueryAntcloudInvoiceIntlamountRcptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudInvoiceIntlamountRcptEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际发票场景果询可开票单据
        /// Summary: 国际发票场景果询可开票单据</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlamountRcptResponse> QueryAntcloudInvoiceIntlamountRcptAsync(QueryAntcloudInvoiceIntlamountRcptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudInvoiceIntlamountRcptExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际发票场景果询可开票单据
        /// Summary: 国际发票场景果询可开票单据</para>
        /// </description>
        public QueryAntcloudInvoiceIntlamountRcptResponse QueryAntcloudInvoiceIntlamountRcptEx(QueryAntcloudInvoiceIntlamountRcptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlamountRcptResponse>(DoRequest("1.0", "antcloud.invoice.intlamount.rcpt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际发票场景果询可开票单据
        /// Summary: 国际发票场景果询可开票单据</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlamountRcptResponse> QueryAntcloudInvoiceIntlamountRcptExAsync(QueryAntcloudInvoiceIntlamountRcptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlamountRcptResponse>(await DoRequestAsync("1.0", "antcloud.invoice.intlamount.rcpt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际发票场景下查询开票申请列表
        /// Summary: 国际发票场景下查询开票申请列表</para>
        /// </description>
        public QueryAntcloudInvoiceIntlinvoicesApplyResponse QueryAntcloudInvoiceIntlinvoicesApply(QueryAntcloudInvoiceIntlinvoicesApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudInvoiceIntlinvoicesApplyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际发票场景下查询开票申请列表
        /// Summary: 国际发票场景下查询开票申请列表</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlinvoicesApplyResponse> QueryAntcloudInvoiceIntlinvoicesApplyAsync(QueryAntcloudInvoiceIntlinvoicesApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudInvoiceIntlinvoicesApplyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际发票场景下查询开票申请列表
        /// Summary: 国际发票场景下查询开票申请列表</para>
        /// </description>
        public QueryAntcloudInvoiceIntlinvoicesApplyResponse QueryAntcloudInvoiceIntlinvoicesApplyEx(QueryAntcloudInvoiceIntlinvoicesApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlinvoicesApplyResponse>(DoRequest("1.0", "antcloud.invoice.intlinvoices.apply.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 国际发票场景下查询开票申请列表
        /// Summary: 国际发票场景下查询开票申请列表</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlinvoicesApplyResponse> QueryAntcloudInvoiceIntlinvoicesApplyExAsync(QueryAntcloudInvoiceIntlinvoicesApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlinvoicesApplyResponse>(await DoRequestAsync("1.0", "antcloud.invoice.intlinvoices.apply.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据业务号和发票ID获取国际发票文件下载地址
        /// Summary: 根据业务号和发票ID获取国际发票文件下载地址</para>
        /// </description>
        public QueryAntcloudInvoiceIntlinvoicesFileurlResponse QueryAntcloudInvoiceIntlinvoicesFileurl(QueryAntcloudInvoiceIntlinvoicesFileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudInvoiceIntlinvoicesFileurlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据业务号和发票ID获取国际发票文件下载地址
        /// Summary: 根据业务号和发票ID获取国际发票文件下载地址</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlinvoicesFileurlResponse> QueryAntcloudInvoiceIntlinvoicesFileurlAsync(QueryAntcloudInvoiceIntlinvoicesFileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudInvoiceIntlinvoicesFileurlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据业务号和发票ID获取国际发票文件下载地址
        /// Summary: 根据业务号和发票ID获取国际发票文件下载地址</para>
        /// </description>
        public QueryAntcloudInvoiceIntlinvoicesFileurlResponse QueryAntcloudInvoiceIntlinvoicesFileurlEx(QueryAntcloudInvoiceIntlinvoicesFileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlinvoicesFileurlResponse>(DoRequest("1.0", "antcloud.invoice.intlinvoices.fileurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据业务号和发票ID获取国际发票文件下载地址
        /// Summary: 根据业务号和发票ID获取国际发票文件下载地址</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlinvoicesFileurlResponse> QueryAntcloudInvoiceIntlinvoicesFileurlExAsync(QueryAntcloudInvoiceIntlinvoicesFileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlinvoicesFileurlResponse>(await DoRequestAsync("1.0", "antcloud.invoice.intlinvoices.fileurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 提交国际形式发票开票申请
        /// Summary: 提交国际形式发票开票申请</para>
        /// </description>
        public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse PushAntcloudInvoiceIntlinvoicesProformainvoice(PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushAntcloudInvoiceIntlinvoicesProformainvoiceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 提交国际形式发票开票申请
        /// Summary: 提交国际形式发票开票申请</para>
        /// </description>
        public async Task<PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse> PushAntcloudInvoiceIntlinvoicesProformainvoiceAsync(PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushAntcloudInvoiceIntlinvoicesProformainvoiceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 提交国际形式发票开票申请
        /// Summary: 提交国际形式发票开票申请</para>
        /// </description>
        public PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse PushAntcloudInvoiceIntlinvoicesProformainvoiceEx(PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse>(DoRequest("1.0", "antcloud.invoice.intlinvoices.proformainvoice.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 提交国际形式发票开票申请
        /// Summary: 提交国际形式发票开票申请</para>
        /// </description>
        public async Task<PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse> PushAntcloudInvoiceIntlinvoicesProformainvoiceExAsync(PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse>(await DoRequestAsync("1.0", "antcloud.invoice.intlinvoices.proformainvoice.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询国家代码选择信息
        /// Summary: 查询国家代码选择信息</para>
        /// </description>
        public QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse QueryAntcloudInvoiceIntlconfigAllcountrycnen(QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudInvoiceIntlconfigAllcountrycnenEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询国家代码选择信息
        /// Summary: 查询国家代码选择信息</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse> QueryAntcloudInvoiceIntlconfigAllcountrycnenAsync(QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudInvoiceIntlconfigAllcountrycnenExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询国家代码选择信息
        /// Summary: 查询国家代码选择信息</para>
        /// </description>
        public QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse QueryAntcloudInvoiceIntlconfigAllcountrycnenEx(QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse>(DoRequest("1.0", "antcloud.invoice.intlconfig.allcountrycnen.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询国家代码选择信息
        /// Summary: 查询国家代码选择信息</para>
        /// </description>
        public async Task<QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse> QueryAntcloudInvoiceIntlconfigAllcountrycnenExAsync(QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse>(await DoRequestAsync("1.0", "antcloud.invoice.intlconfig.allcountrycnen.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口a
        /// Summary: cli创建测试接口a</para>
        /// </description>
        public ApiaAntdigitalTestliuyzpCliCreateResponse ApiaAntdigitalTestliuyzpCliCreate(ApiaAntdigitalTestliuyzpCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiaAntdigitalTestliuyzpCliCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口a
        /// Summary: cli创建测试接口a</para>
        /// </description>
        public async Task<ApiaAntdigitalTestliuyzpCliCreateResponse> ApiaAntdigitalTestliuyzpCliCreateAsync(ApiaAntdigitalTestliuyzpCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiaAntdigitalTestliuyzpCliCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口a
        /// Summary: cli创建测试接口a</para>
        /// </description>
        public ApiaAntdigitalTestliuyzpCliCreateResponse ApiaAntdigitalTestliuyzpCliCreateEx(ApiaAntdigitalTestliuyzpCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiaAntdigitalTestliuyzpCliCreateResponse>(DoRequest("1.0", "antdigital.testliuyzp.cli.create.apia", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口a
        /// Summary: cli创建测试接口a</para>
        /// </description>
        public async Task<ApiaAntdigitalTestliuyzpCliCreateResponse> ApiaAntdigitalTestliuyzpCliCreateExAsync(ApiaAntdigitalTestliuyzpCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiaAntdigitalTestliuyzpCliCreateResponse>(await DoRequestAsync("1.0", "antdigital.testliuyzp.cli.create.apia", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: plugin测试编辑接口
        /// Summary: plugin测试编辑接口</para>
        /// </description>
        public QueryAntcloudDemositdevsyTesxXxxResponse QueryAntcloudDemositdevsyTesxXxx(QueryAntcloudDemositdevsyTesxXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntcloudDemositdevsyTesxXxxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: plugin测试编辑接口
        /// Summary: plugin测试编辑接口</para>
        /// </description>
        public async Task<QueryAntcloudDemositdevsyTesxXxxResponse> QueryAntcloudDemositdevsyTesxXxxAsync(QueryAntcloudDemositdevsyTesxXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntcloudDemositdevsyTesxXxxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: plugin测试编辑接口
        /// Summary: plugin测试编辑接口</para>
        /// </description>
        public QueryAntcloudDemositdevsyTesxXxxResponse QueryAntcloudDemositdevsyTesxXxxEx(QueryAntcloudDemositdevsyTesxXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudDemositdevsyTesxXxxResponse>(DoRequest("1.0", "antcloud.demositdevsy.tesx.xxx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: plugin测试编辑接口
        /// Summary: plugin测试编辑接口</para>
        /// </description>
        public async Task<QueryAntcloudDemositdevsyTesxXxxResponse> QueryAntcloudDemositdevsyTesxXxxExAsync(QueryAntcloudDemositdevsyTesxXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntcloudDemositdevsyTesxXxxResponse>(await DoRequestAsync("1.0", "antcloud.demositdevsy.tesx.xxx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口a
        /// Summary: cli创建测试接口a</para>
        /// </description>
        public ApiaAntcloudDemositdevsyCliCreateResponse ApiaAntcloudDemositdevsyCliCreate(ApiaAntcloudDemositdevsyCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiaAntcloudDemositdevsyCliCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口a
        /// Summary: cli创建测试接口a</para>
        /// </description>
        public async Task<ApiaAntcloudDemositdevsyCliCreateResponse> ApiaAntcloudDemositdevsyCliCreateAsync(ApiaAntcloudDemositdevsyCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiaAntcloudDemositdevsyCliCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口a
        /// Summary: cli创建测试接口a</para>
        /// </description>
        public ApiaAntcloudDemositdevsyCliCreateResponse ApiaAntcloudDemositdevsyCliCreateEx(ApiaAntcloudDemositdevsyCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiaAntcloudDemositdevsyCliCreateResponse>(DoRequest("1.0", "antcloud.demositdevsy.cli.create.apia", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: cli创建测试接口a
        /// Summary: cli创建测试接口a</para>
        /// </description>
        public async Task<ApiaAntcloudDemositdevsyCliCreateResponse> ApiaAntcloudDemositdevsyCliCreateExAsync(ApiaAntcloudDemositdevsyCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiaAntcloudDemositdevsyCliCreateResponse>(await DoRequestAsync("1.0", "antcloud.demositdevsy.cli.create.apia", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: gatewat-plugin创建接口a
        /// Summary: gatewat-plugin创建接口a</para>
        /// </description>
        public ApiaAntcloudWorkbenchphaseiiaCliCreateResponse ApiaAntcloudWorkbenchphaseiiaCliCreate(ApiaAntcloudWorkbenchphaseiiaCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiaAntcloudWorkbenchphaseiiaCliCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: gatewat-plugin创建接口a
        /// Summary: gatewat-plugin创建接口a</para>
        /// </description>
        public async Task<ApiaAntcloudWorkbenchphaseiiaCliCreateResponse> ApiaAntcloudWorkbenchphaseiiaCliCreateAsync(ApiaAntcloudWorkbenchphaseiiaCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiaAntcloudWorkbenchphaseiiaCliCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: gatewat-plugin创建接口a
        /// Summary: gatewat-plugin创建接口a</para>
        /// </description>
        public ApiaAntcloudWorkbenchphaseiiaCliCreateResponse ApiaAntcloudWorkbenchphaseiiaCliCreateEx(ApiaAntcloudWorkbenchphaseiiaCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.workbenchphaseiia.cli.create.apia",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ApiaAntcloudWorkbenchphaseiiaCliCreateResponse apiaAntcloudWorkbenchphaseiiaCliCreateResponse = new ApiaAntcloudWorkbenchphaseiiaCliCreateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return apiaAntcloudWorkbenchphaseiiaCliCreateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiaAntcloudWorkbenchphaseiiaCliCreateResponse>(DoRequest("1.0", "antcloud.workbenchphaseiia.cli.create.apia", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: gatewat-plugin创建接口a
        /// Summary: gatewat-plugin创建接口a</para>
        /// </description>
        public async Task<ApiaAntcloudWorkbenchphaseiiaCliCreateResponse> ApiaAntcloudWorkbenchphaseiiaCliCreateExAsync(ApiaAntcloudWorkbenchphaseiiaCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.workbenchphaseiia.cli.create.apia",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ApiaAntcloudWorkbenchphaseiiaCliCreateResponse apiaAntcloudWorkbenchphaseiiaCliCreateResponse = new ApiaAntcloudWorkbenchphaseiiaCliCreateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return apiaAntcloudWorkbenchphaseiiaCliCreateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiaAntcloudWorkbenchphaseiiaCliCreateResponse>(await DoRequestAsync("1.0", "antcloud.workbenchphaseiia.cli.create.apia", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: gateway-plugin创建接口b
        /// Summary: gateway-plugin创建接口b</para>
        /// </description>
        public ApibAntcloudWorkbenchphaseiiaCliCreateResponse ApibAntcloudWorkbenchphaseiiaCliCreate(ApibAntcloudWorkbenchphaseiiaCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApibAntcloudWorkbenchphaseiiaCliCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: gateway-plugin创建接口b
        /// Summary: gateway-plugin创建接口b</para>
        /// </description>
        public async Task<ApibAntcloudWorkbenchphaseiiaCliCreateResponse> ApibAntcloudWorkbenchphaseiiaCliCreateAsync(ApibAntcloudWorkbenchphaseiiaCliCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApibAntcloudWorkbenchphaseiiaCliCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: gateway-plugin创建接口b
        /// Summary: gateway-plugin创建接口b</para>
        /// </description>
        public ApibAntcloudWorkbenchphaseiiaCliCreateResponse ApibAntcloudWorkbenchphaseiiaCliCreateEx(ApibAntcloudWorkbenchphaseiiaCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.workbenchphaseiia.cli.create.apib",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ApibAntcloudWorkbenchphaseiiaCliCreateResponse apibAntcloudWorkbenchphaseiiaCliCreateResponse = new ApibAntcloudWorkbenchphaseiiaCliCreateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return apibAntcloudWorkbenchphaseiiaCliCreateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApibAntcloudWorkbenchphaseiiaCliCreateResponse>(DoRequest("1.0", "antcloud.workbenchphaseiia.cli.create.apib", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: gateway-plugin创建接口b
        /// Summary: gateway-plugin创建接口b</para>
        /// </description>
        public async Task<ApibAntcloudWorkbenchphaseiiaCliCreateResponse> ApibAntcloudWorkbenchphaseiiaCliCreateExAsync(ApibAntcloudWorkbenchphaseiiaCliCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antcloud.workbenchphaseiia.cli.create.apib",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ApibAntcloudWorkbenchphaseiiaCliCreateResponse apibAntcloudWorkbenchphaseiiaCliCreateResponse = new ApibAntcloudWorkbenchphaseiiaCliCreateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return apibAntcloudWorkbenchphaseiiaCliCreateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApibAntcloudWorkbenchphaseiiaCliCreateResponse>(await DoRequestAsync("1.0", "antcloud.workbenchphaseiia.cli.create.apib", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudGatewayxFileUploadEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadAsync(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudGatewayxFileUploadExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(DoRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建HTTP PUT提交的文件上传
        /// Summary: 文件上传创建</para>
        /// </description>
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadExAsync(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(await DoRequestAsync("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
