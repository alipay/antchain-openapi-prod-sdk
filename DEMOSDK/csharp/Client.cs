// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.DEMOSDK.Models;

namespace AntChain.SDK.DEMOSDK
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
                        {"sdk_version", "1.3.57"},
                        {"_prod_code", "DEMOSDK"},
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
                        {"sdk_version", "1.3.57"},
                        {"_prod_code", "DEMOSDK"},
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
        /// <para>Description: 用于结构体上线测试
        /// Summary: 用于结构体上线测试</para>
        /// </description>
        public TestStructOnlineResponse TestStructOnline(TestStructOnlineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestStructOnlineEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于结构体上线测试
        /// Summary: 用于结构体上线测试</para>
        /// </description>
        public async Task<TestStructOnlineResponse> TestStructOnlineAsync(TestStructOnlineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestStructOnlineExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于结构体上线测试
        /// Summary: 用于结构体上线测试</para>
        /// </description>
        public TestStructOnlineResponse TestStructOnlineEx(TestStructOnlineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestStructOnlineResponse>(DoRequest("1.0", "antchain.demosdk.struct.online.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于结构体上线测试
        /// Summary: 用于结构体上线测试</para>
        /// </description>
        public async Task<TestStructOnlineResponse> TestStructOnlineExAsync(TestStructOnlineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestStructOnlineResponse>(await DoRequestAsync("1.0", "antchain.demosdk.struct.online.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 结构体测试·edit for test18
        /// Summary: 结构体测试·edit for test18</para>
        /// </description>
        public TestaStructCreateResponse TestaStructCreate(TestaStructCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestaStructCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 结构体测试·edit for test18
        /// Summary: 结构体测试·edit for test18</para>
        /// </description>
        public async Task<TestaStructCreateResponse> TestaStructCreateAsync(TestaStructCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestaStructCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 结构体测试·edit for test18
        /// Summary: 结构体测试·edit for test18</para>
        /// </description>
        public TestaStructCreateResponse TestaStructCreateEx(TestaStructCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestaStructCreateResponse>(DoRequest("1.0", "antchain.demosdk.struct.create.testa", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 结构体测试·edit for test18
        /// Summary: 结构体测试·edit for test18</para>
        /// </description>
        public async Task<TestaStructCreateResponse> TestaStructCreateExAsync(TestaStructCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestaStructCreateResponse>(await DoRequestAsync("1.0", "antchain.demosdk.struct.create.testa", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是测试的
        /// Summary: 这是测试的</para>
        /// </description>
        public QueryAaaSdkResponse QueryAaaSdk(QueryAaaSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaSdkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是测试的
        /// Summary: 这是测试的</para>
        /// </description>
        public async Task<QueryAaaSdkResponse> QueryAaaSdkAsync(QueryAaaSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaSdkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是测试的
        /// Summary: 这是测试的</para>
        /// </description>
        public QueryAaaSdkResponse QueryAaaSdkEx(QueryAaaSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaSdkResponse>(DoRequest("1.0", "antchain.demosdk.aaa.sdk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是测试的
        /// Summary: 这是测试的</para>
        /// </description>
        public async Task<QueryAaaSdkResponse> QueryAaaSdkExAsync(QueryAaaSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaSdkResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.sdk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public QueryMultiCciuResponse QueryMultiCciu(QueryMultiCciuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMultiCciuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public async Task<QueryMultiCciuResponse> QueryMultiCciuAsync(QueryMultiCciuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMultiCciuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public QueryMultiCciuResponse QueryMultiCciuEx(QueryMultiCciuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMultiCciuResponse>(DoRequest("1.0", "antchain.demosdk.multi.cciu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public async Task<QueryMultiCciuResponse> QueryMultiCciuExAsync(QueryMultiCciuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMultiCciuResponse>(await DoRequestAsync("1.0", "antchain.demosdk.multi.cciu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: a
        /// Summary: a</para>
        /// </description>
        public QueryIamTestResponse QueryIamTest(QueryIamTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIamTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: a
        /// Summary: a</para>
        /// </description>
        public async Task<QueryIamTestResponse> QueryIamTestAsync(QueryIamTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIamTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: a
        /// Summary: a</para>
        /// </description>
        public QueryIamTestResponse QueryIamTestEx(QueryIamTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIamTestResponse>(DoRequest("1.0", "antchain.demosdk.iam.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: a
        /// Summary: a</para>
        /// </description>
        public async Task<QueryIamTestResponse> QueryIamTestExAsync(QueryIamTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIamTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.iam.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam同步测试
        /// Summary: iam同步测试</para>
        /// </description>
        public TestIamSynchronousResponse TestIamSynchronous(TestIamSynchronousRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestIamSynchronousEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam同步测试
        /// Summary: iam同步测试</para>
        /// </description>
        public async Task<TestIamSynchronousResponse> TestIamSynchronousAsync(TestIamSynchronousRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestIamSynchronousExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam同步测试
        /// Summary: iam同步测试</para>
        /// </description>
        public TestIamSynchronousResponse TestIamSynchronousEx(TestIamSynchronousRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestIamSynchronousResponse>(DoRequest("1.0", "antchain.demosdk.iam.synchronous.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam同步测试
        /// Summary: iam同步测试</para>
        /// </description>
        public async Task<TestIamSynchronousResponse> TestIamSynchronousExAsync(TestIamSynchronousRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestIamSynchronousResponse>(await DoRequestAsync("1.0", "antchain.demosdk.iam.synchronous.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam同步测试
        /// Summary: iam同步测试</para>
        /// </description>
        public IamIamIamResponse IamIamIam(IamIamIamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return IamIamIamEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam同步测试
        /// Summary: iam同步测试</para>
        /// </description>
        public async Task<IamIamIamResponse> IamIamIamAsync(IamIamIamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await IamIamIamExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam同步测试
        /// Summary: iam同步测试</para>
        /// </description>
        public IamIamIamResponse IamIamIamEx(IamIamIamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IamIamIamResponse>(DoRequest("1.0", "antchain.demosdk.iam.iam.iam", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam同步测试
        /// Summary: iam同步测试</para>
        /// </description>
        public async Task<IamIamIamResponse> IamIamIamExAsync(IamIamIamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IamIamIamResponse>(await DoRequestAsync("1.0", "antchain.demosdk.iam.iam.iam", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam推送测试
        /// Summary: iam推送测试</para>
        /// </description>
        public TestIamPushResponse TestIamPush(TestIamPushRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestIamPushEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam推送测试
        /// Summary: iam推送测试</para>
        /// </description>
        public async Task<TestIamPushResponse> TestIamPushAsync(TestIamPushRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestIamPushExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam推送测试
        /// Summary: iam推送测试</para>
        /// </description>
        public TestIamPushResponse TestIamPushEx(TestIamPushRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestIamPushResponse>(DoRequest("1.0", "antchain.demosdk.iam.push.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: iam推送测试
        /// Summary: iam推送测试</para>
        /// </description>
        public async Task<TestIamPushResponse> TestIamPushExAsync(TestIamPushRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestIamPushResponse>(await DoRequestAsync("1.0", "antchain.demosdk.iam.push.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QueryIamPushResponse QueryIamPush(QueryIamPushRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIamPushEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QueryIamPushResponse> QueryIamPushAsync(QueryIamPushRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIamPushExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public QueryIamPushResponse QueryIamPushEx(QueryIamPushRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIamPushResponse>(DoRequest("1.0", "antchain.demosdk.iam.push.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<QueryIamPushResponse> QueryIamPushExAsync(QueryIamPushRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIamPushResponse>(await DoRequestAsync("1.0", "antchain.demosdk.iam.push.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public IamApipushForResponse IamApipushFor(IamApipushForRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return IamApipushForEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<IamApipushForResponse> IamApipushForAsync(IamApipushForRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await IamApipushForExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public IamApipushForResponse IamApipushForEx(IamApipushForRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IamApipushForResponse>(DoRequest("1.0", "antchain.demosdk.apipush.for.iam", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<IamApipushForResponse> IamApipushForExAsync(IamApipushForRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<IamApipushForResponse>(await DoRequestAsync("1.0", "antchain.demosdk.apipush.for.iam", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: queryApiConfig接口优化
        /// Summary: queryApiConfig接口优化</para>
        /// </description>
        public ConfigQueryApiResponse ConfigQueryApi(ConfigQueryApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfigQueryApiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: queryApiConfig接口优化
        /// Summary: queryApiConfig接口优化</para>
        /// </description>
        public async Task<ConfigQueryApiResponse> ConfigQueryApiAsync(ConfigQueryApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfigQueryApiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: queryApiConfig接口优化
        /// Summary: queryApiConfig接口优化</para>
        /// </description>
        public ConfigQueryApiResponse ConfigQueryApiEx(ConfigQueryApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfigQueryApiResponse>(DoRequest("1.0", "antchain.demosdk.query.api.config", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: queryApiConfig接口优化
        /// Summary: queryApiConfig接口优化</para>
        /// </description>
        public async Task<ConfigQueryApiResponse> ConfigQueryApiExAsync(ConfigQueryApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfigQueryApiResponse>(await DoRequestAsync("1.0", "antchain.demosdk.query.api.config", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化创建接口a
        /// Summary: 自动化创建接口a</para>
        /// </description>
        public ApiaAciCreateResponse ApiaAciCreate(ApiaAciCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiaAciCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化创建接口a
        /// Summary: 自动化创建接口a</para>
        /// </description>
        public async Task<ApiaAciCreateResponse> ApiaAciCreateAsync(ApiaAciCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiaAciCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化创建接口a
        /// Summary: 自动化创建接口a</para>
        /// </description>
        public ApiaAciCreateResponse ApiaAciCreateEx(ApiaAciCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiaAciCreateResponse>(DoRequest("1.0", "antchain.demosdk.aci.create.apia", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化创建接口a
        /// Summary: 自动化创建接口a</para>
        /// </description>
        public async Task<ApiaAciCreateResponse> ApiaAciCreateExAsync(ApiaAciCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiaAciCreateResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aci.create.apia", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindAaaBbbCccResponse BindAaaBbbCcc(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAaaBbbCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccAsync(BindAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAaaBbbCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindAaaBbbCccResponse BindAaaBbbCccEx(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(DoRequest("1.0", "antchain.demosdk.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindAaaBbbCccResponse> BindAaaBbbCccExAsync(BindAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAaaBbbCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public QueryAaaCcdResponse QueryAaaCcd(QueryAaaCcdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaCcdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<QueryAaaCcdResponse> QueryAaaCcdAsync(QueryAaaCcdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaCcdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public QueryAaaCcdResponse QueryAaaCcdEx(QueryAaaCcdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaCcdResponse>(DoRequest("1.0", "antchain.demosdk.aaa.ccd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<QueryAaaCcdResponse> QueryAaaCcdExAsync(QueryAaaCcdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaCcdResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.ccd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindXxxResponse BindXxx(BindXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindXxxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindXxxResponse> BindXxxAsync(BindXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindXxxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindXxxResponse BindXxxEx(BindXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindXxxResponse>(DoRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindXxxResponse> BindXxxExAsync(BindXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindXxxResponse>(await DoRequestAsync("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试api流程
        /// Summary: 测试api流程</para>
        /// </description>
        public QueryTxtResponse QueryTxt(QueryTxtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTxtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试api流程
        /// Summary: 测试api流程</para>
        /// </description>
        public async Task<QueryTxtResponse> QueryTxtAsync(QueryTxtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTxtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试api流程
        /// Summary: 测试api流程</para>
        /// </description>
        public QueryTxtResponse QueryTxtEx(QueryTxtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTxtResponse>(DoRequest("1.0", "antchain.demosdk.txt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试api流程
        /// Summary: 测试api流程</para>
        /// </description>
        public async Task<QueryTxtResponse> QueryTxtExAsync(QueryTxtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTxtResponse>(await DoRequestAsync("1.0", "antchain.demosdk.txt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: desc
        /// Summary: desc</para>
        /// </description>
        public ListTxtResponse ListTxt(ListTxtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListTxtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: desc
        /// Summary: desc</para>
        /// </description>
        public async Task<ListTxtResponse> ListTxtAsync(ListTxtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListTxtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: desc
        /// Summary: desc</para>
        /// </description>
        public ListTxtResponse ListTxtEx(ListTxtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTxtResponse>(DoRequest("1.0", "antchain.demosdk.txt.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: desc
        /// Summary: desc</para>
        /// </description>
        public async Task<ListTxtResponse> ListTxtExAsync(ListTxtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTxtResponse>(await DoRequestAsync("1.0", "antchain.demosdk.txt.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用测试test
        /// Summary: 用于个人工作台二期测试使用测试test</para>
        /// </description>
        public QueryWorkbenchTestResponse QueryWorkbenchTest(QueryWorkbenchTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWorkbenchTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用测试test
        /// Summary: 用于个人工作台二期测试使用测试test</para>
        /// </description>
        public async Task<QueryWorkbenchTestResponse> QueryWorkbenchTestAsync(QueryWorkbenchTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWorkbenchTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用测试test
        /// Summary: 用于个人工作台二期测试使用测试test</para>
        /// </description>
        public QueryWorkbenchTestResponse QueryWorkbenchTestEx(QueryWorkbenchTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkbenchTestResponse>(DoRequest("1.0", "antchain.demosdk.workbench.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用测试test
        /// Summary: 用于个人工作台二期测试使用测试test</para>
        /// </description>
        public async Task<QueryWorkbenchTestResponse> QueryWorkbenchTestExAsync(QueryWorkbenchTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkbenchTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.workbench.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public ImportAbcdOneResponse ImportAbcdOne(ImportAbcdOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportAbcdOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<ImportAbcdOneResponse> ImportAbcdOneAsync(ImportAbcdOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportAbcdOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public ImportAbcdOneResponse ImportAbcdOneEx(ImportAbcdOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAbcdOneResponse>(DoRequest("1.0", "antchain.demosdk.abcd.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<ImportAbcdOneResponse> ImportAbcdOneExAsync(ImportAbcdOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAbcdOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.abcd.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public PublishWorkbenchOneResponse PublishWorkbenchOne(PublishWorkbenchOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishWorkbenchOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public async Task<PublishWorkbenchOneResponse> PublishWorkbenchOneAsync(PublishWorkbenchOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishWorkbenchOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public PublishWorkbenchOneResponse PublishWorkbenchOneEx(PublishWorkbenchOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishWorkbenchOneResponse>(DoRequest("1.0", "antchain.demosdk.workbench.one.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public async Task<PublishWorkbenchOneResponse> PublishWorkbenchOneExAsync(PublishWorkbenchOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishWorkbenchOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.workbench.one.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试
        /// Summary: 个人工作台测试</para>
        /// </description>
        public PublishWorkbenchTwoResponse PublishWorkbenchTwo(PublishWorkbenchTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishWorkbenchTwoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试
        /// Summary: 个人工作台测试</para>
        /// </description>
        public async Task<PublishWorkbenchTwoResponse> PublishWorkbenchTwoAsync(PublishWorkbenchTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishWorkbenchTwoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试
        /// Summary: 个人工作台测试</para>
        /// </description>
        public PublishWorkbenchTwoResponse PublishWorkbenchTwoEx(PublishWorkbenchTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishWorkbenchTwoResponse>(DoRequest("1.0", "antchain.demosdk.workbench.two.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试
        /// Summary: 个人工作台测试</para>
        /// </description>
        public async Task<PublishWorkbenchTwoResponse> PublishWorkbenchTwoExAsync(PublishWorkbenchTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishWorkbenchTwoResponse>(await DoRequestAsync("1.0", "antchain.demosdk.workbench.two.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试1
        /// Summary: 个人工作台二期预发测试1</para>
        /// </description>
        public PublishTwiceOneResponse PublishTwiceOne(PublishTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishTwiceOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试1
        /// Summary: 个人工作台二期预发测试1</para>
        /// </description>
        public async Task<PublishTwiceOneResponse> PublishTwiceOneAsync(PublishTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishTwiceOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试1
        /// Summary: 个人工作台二期预发测试1</para>
        /// </description>
        public PublishTwiceOneResponse PublishTwiceOneEx(PublishTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishTwiceOneResponse>(DoRequest("1.0", "antchain.demosdk.twice.one.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试1
        /// Summary: 个人工作台二期预发测试1</para>
        /// </description>
        public async Task<PublishTwiceOneResponse> PublishTwiceOneExAsync(PublishTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishTwiceOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.one.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportTwiceThreeResponse ImportTwiceThree(ImportTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportTwiceThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportTwiceThreeResponse> ImportTwiceThreeAsync(ImportTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportTwiceThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportTwiceThreeResponse ImportTwiceThreeEx(ImportTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTwiceThreeResponse>(DoRequest("1.0", "antchain.demosdk.twice.three.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportTwiceThreeResponse> ImportTwiceThreeExAsync(ImportTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTwiceThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.three.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public PublishWorkbenchThreeResponse PublishWorkbenchThree(PublishWorkbenchThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishWorkbenchThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public async Task<PublishWorkbenchThreeResponse> PublishWorkbenchThreeAsync(PublishWorkbenchThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishWorkbenchThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public PublishWorkbenchThreeResponse PublishWorkbenchThreeEx(PublishWorkbenchThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishWorkbenchThreeResponse>(DoRequest("1.0", "antchain.demosdk.workbench.three.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public async Task<PublishWorkbenchThreeResponse> PublishWorkbenchThreeExAsync(PublishWorkbenchThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishWorkbenchThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.workbench.three.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public PublishWorkbenchFourResponse PublishWorkbenchFour(PublishWorkbenchFourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishWorkbenchFourEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public async Task<PublishWorkbenchFourResponse> PublishWorkbenchFourAsync(PublishWorkbenchFourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishWorkbenchFourExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public PublishWorkbenchFourResponse PublishWorkbenchFourEx(PublishWorkbenchFourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishWorkbenchFourResponse>(DoRequest("1.0", "antchain.demosdk.workbench.four.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试使用
        /// Summary: 个人工作台测试使用</para>
        /// </description>
        public async Task<PublishWorkbenchFourResponse> PublishWorkbenchFourExAsync(PublishWorkbenchFourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishWorkbenchFourResponse>(await DoRequestAsync("1.0", "antchain.demosdk.workbench.four.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: AAAA
        /// Summary: AAAA</para>
        /// </description>
        public QueryAaaQqqResponse QueryAaaQqq(QueryAaaQqqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAaaQqqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: AAAA
        /// Summary: AAAA</para>
        /// </description>
        public async Task<QueryAaaQqqResponse> QueryAaaQqqAsync(QueryAaaQqqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAaaQqqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: AAAA
        /// Summary: AAAA</para>
        /// </description>
        public QueryAaaQqqResponse QueryAaaQqqEx(QueryAaaQqqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaQqqResponse>(DoRequest("1.0", "antchain.demosdk.aaa.qqq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: AAAA
        /// Summary: AAAA</para>
        /// </description>
        public async Task<QueryAaaQqqResponse> QueryAaaQqqExAsync(QueryAaaQqqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAaaQqqResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.qqq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: a
        /// Summary: a</para>
        /// </description>
        public CABResponse CAB(CABRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CABEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: a
        /// Summary: a</para>
        /// </description>
        public async Task<CABResponse> CABAsync(CABRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CABExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: a
        /// Summary: a</para>
        /// </description>
        public CABResponse CABEx(CABRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CABResponse>(DoRequest("1.0", "antchain.demosdk.a.b.c", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: a
        /// Summary: a</para>
        /// </description>
        public async Task<CABResponse> CABExAsync(CABRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CABResponse>(await DoRequestAsync("1.0", "antchain.demosdk.a.b.c", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public AAAResponse AAA(AAARequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AAAEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<AAAResponse> AAAAsync(AAARequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AAAExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public AAAResponse AAAEx(AAARequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AAAResponse>(DoRequest("1.0", "antchain.demosdk.a.a.a", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<AAAResponse> AAAExAsync(AAARequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AAAResponse>(await DoRequestAsync("1.0", "antchain.demosdk.a.a.a", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试使用
        /// Summary: 自动化测试使用</para>
        /// </description>
        public ApiAutotestCreateResponse ApiAutotestCreate(ApiAutotestCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiAutotestCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试使用
        /// Summary: 自动化测试使用</para>
        /// </description>
        public async Task<ApiAutotestCreateResponse> ApiAutotestCreateAsync(ApiAutotestCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiAutotestCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试使用
        /// Summary: 自动化测试使用</para>
        /// </description>
        public ApiAutotestCreateResponse ApiAutotestCreateEx(ApiAutotestCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiAutotestCreateResponse>(DoRequest("1.0", "antchain.demosdk.autotest.create.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试使用
        /// Summary: 自动化测试使用</para>
        /// </description>
        public async Task<ApiAutotestCreateResponse> ApiAutotestCreateExAsync(ApiAutotestCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiAutotestCreateResponse>(await DoRequestAsync("1.0", "antchain.demosdk.autotest.create.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是编辑后的描述
        /// Summary: 这是编辑后的描述</para>
        /// </description>
        public ZhongyipretestbZhongyipretestbZhongyipretestbResponse ZhongyipretestbZhongyipretestbZhongyipretestb(ZhongyipretestbZhongyipretestbZhongyipretestbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ZhongyipretestbZhongyipretestbZhongyipretestbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是编辑后的描述
        /// Summary: 这是编辑后的描述</para>
        /// </description>
        public async Task<ZhongyipretestbZhongyipretestbZhongyipretestbResponse> ZhongyipretestbZhongyipretestbZhongyipretestbAsync(ZhongyipretestbZhongyipretestbZhongyipretestbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ZhongyipretestbZhongyipretestbZhongyipretestbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是编辑后的描述
        /// Summary: 这是编辑后的描述</para>
        /// </description>
        public ZhongyipretestbZhongyipretestbZhongyipretestbResponse ZhongyipretestbZhongyipretestbZhongyipretestbEx(ZhongyipretestbZhongyipretestbZhongyipretestbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ZhongyipretestbZhongyipretestbZhongyipretestbResponse>(DoRequest("1.0", "antchain.demosdk.zhongyipretestb.zhongyipretestb.zhongyipretestb", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 这是编辑后的描述
        /// Summary: 这是编辑后的描述</para>
        /// </description>
        public async Task<ZhongyipretestbZhongyipretestbZhongyipretestbResponse> ZhongyipretestbZhongyipretestbZhongyipretestbExAsync(ZhongyipretestbZhongyipretestbZhongyipretestbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ZhongyipretestbZhongyipretestbZhongyipretestbResponse>(await DoRequestAsync("1.0", "antchain.demosdk.zhongyipretestb.zhongyipretestb.zhongyipretestb", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
