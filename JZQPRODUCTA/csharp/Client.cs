// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.JZQPRODUCTA.Models;

namespace AntChain.SDK.JZQPRODUCTA
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
                        {"sdk_version", "1.0.1"},
                        {"_prod_code", "JZQPRODUCTA"},
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
                        {"sdk_version", "1.0.1"},
                        {"_prod_code", "JZQPRODUCTA"},
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
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public TestDemoResponse TestDemo(TestDemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestDemoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public async Task<TestDemoResponse> TestDemoAsync(TestDemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestDemoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public TestDemoResponse TestDemoEx(TestDemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestDemoResponse>(DoRequest("1.0", "antdigital.jzqproducta.demo.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public async Task<TestDemoResponse> TestDemoExAsync(TestDemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestDemoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.demo.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public ApiWithdrawResponse ApiWithdraw(ApiWithdrawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiWithdrawEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<ApiWithdrawResponse> ApiWithdrawAsync(ApiWithdrawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiWithdrawExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public ApiWithdrawResponse ApiWithdrawEx(ApiWithdrawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiWithdrawResponse>(DoRequest("1.0", "antdigital.jzqproducta.withdraw.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: test
        /// Summary: test</para>
        /// </description>
        public async Task<ApiWithdrawResponse> ApiWithdrawExAsync(ApiWithdrawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiWithdrawResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.withdraw.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTestResponse QueryPreformanceTest(QueryPreformanceTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTestResponse> QueryPreformanceTestAsync(QueryPreformanceTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTestResponse QueryPreformanceTestEx(QueryPreformanceTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTestResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTestResponse> QueryPreformanceTestExAsync(QueryPreformanceTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTestResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOnjgraResponse QueryPreformanceOnjgra(QueryPreformanceOnjgraRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceOnjgraEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOnjgraResponse> QueryPreformanceOnjgraAsync(QueryPreformanceOnjgraRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceOnjgraExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOnjgraResponse QueryPreformanceOnjgraEx(QueryPreformanceOnjgraRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOnjgraResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.onjgra.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOnjgraResponse> QueryPreformanceOnjgraExAsync(QueryPreformanceOnjgraRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOnjgraResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.onjgra.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCgscczResponse QueryPreformanceCgsccz(QueryPreformanceCgscczRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceCgscczEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCgscczResponse> QueryPreformanceCgscczAsync(QueryPreformanceCgscczRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceCgscczExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCgscczResponse QueryPreformanceCgscczEx(QueryPreformanceCgscczRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCgscczResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.cgsccz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCgscczResponse> QueryPreformanceCgscczExAsync(QueryPreformanceCgscczRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCgscczResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.cgsccz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRyhdhnResponse QueryPreformanceRyhdhn(QueryPreformanceRyhdhnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceRyhdhnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRyhdhnResponse> QueryPreformanceRyhdhnAsync(QueryPreformanceRyhdhnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceRyhdhnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRyhdhnResponse QueryPreformanceRyhdhnEx(QueryPreformanceRyhdhnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRyhdhnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ryhdhn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRyhdhnResponse> QueryPreformanceRyhdhnExAsync(QueryPreformanceRyhdhnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRyhdhnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ryhdhn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQcbszeResponse QueryPreformanceQcbsze(QueryPreformanceQcbszeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQcbszeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQcbszeResponse> QueryPreformanceQcbszeAsync(QueryPreformanceQcbszeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQcbszeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQcbszeResponse QueryPreformanceQcbszeEx(QueryPreformanceQcbszeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQcbszeResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.qcbsze.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQcbszeResponse> QueryPreformanceQcbszeExAsync(QueryPreformanceQcbszeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQcbszeResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.qcbsze.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceScilwtResponse QueryPreformanceScilwt(QueryPreformanceScilwtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceScilwtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceScilwtResponse> QueryPreformanceScilwtAsync(QueryPreformanceScilwtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceScilwtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceScilwtResponse QueryPreformanceScilwtEx(QueryPreformanceScilwtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceScilwtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.scilwt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceScilwtResponse> QueryPreformanceScilwtExAsync(QueryPreformanceScilwtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceScilwtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.scilwt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZdsrecResponse QueryPreformanceZdsrec(QueryPreformanceZdsrecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZdsrecEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZdsrecResponse> QueryPreformanceZdsrecAsync(QueryPreformanceZdsrecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZdsrecExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZdsrecResponse QueryPreformanceZdsrecEx(QueryPreformanceZdsrecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZdsrecResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.zdsrec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZdsrecResponse> QueryPreformanceZdsrecExAsync(QueryPreformanceZdsrecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZdsrecResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.zdsrec.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIezhucResponse QueryPreformanceIezhuc(QueryPreformanceIezhucRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIezhucEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIezhucResponse> QueryPreformanceIezhucAsync(QueryPreformanceIezhucRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIezhucExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIezhucResponse QueryPreformanceIezhucEx(QueryPreformanceIezhucRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIezhucResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.iezhuc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIezhucResponse> QueryPreformanceIezhucExAsync(QueryPreformanceIezhucRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIezhucResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.iezhuc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXjdezpResponse QueryPreformanceXjdezp(QueryPreformanceXjdezpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXjdezpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXjdezpResponse> QueryPreformanceXjdezpAsync(QueryPreformanceXjdezpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXjdezpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXjdezpResponse QueryPreformanceXjdezpEx(QueryPreformanceXjdezpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXjdezpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xjdezp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXjdezpResponse> QueryPreformanceXjdezpExAsync(QueryPreformanceXjdezpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXjdezpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xjdezp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDjuoinResponse QueryPreformanceDjuoin(QueryPreformanceDjuoinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDjuoinEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDjuoinResponse> QueryPreformanceDjuoinAsync(QueryPreformanceDjuoinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDjuoinExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDjuoinResponse QueryPreformanceDjuoinEx(QueryPreformanceDjuoinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDjuoinResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.djuoin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDjuoinResponse> QueryPreformanceDjuoinExAsync(QueryPreformanceDjuoinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDjuoinResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.djuoin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBagemgResponse QueryPreformanceBagemg(QueryPreformanceBagemgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBagemgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBagemgResponse> QueryPreformanceBagemgAsync(QueryPreformanceBagemgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBagemgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBagemgResponse QueryPreformanceBagemgEx(QueryPreformanceBagemgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBagemgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bagemg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBagemgResponse> QueryPreformanceBagemgExAsync(QueryPreformanceBagemgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBagemgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bagemg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDpvzbtResponse QueryPreformanceDpvzbt(QueryPreformanceDpvzbtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDpvzbtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDpvzbtResponse> QueryPreformanceDpvzbtAsync(QueryPreformanceDpvzbtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDpvzbtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDpvzbtResponse QueryPreformanceDpvzbtEx(QueryPreformanceDpvzbtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDpvzbtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dpvzbt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDpvzbtResponse> QueryPreformanceDpvzbtExAsync(QueryPreformanceDpvzbtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDpvzbtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dpvzbt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGziwauResponse QueryPreformanceGziwau(QueryPreformanceGziwauRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGziwauEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGziwauResponse> QueryPreformanceGziwauAsync(QueryPreformanceGziwauRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGziwauExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGziwauResponse QueryPreformanceGziwauEx(QueryPreformanceGziwauRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGziwauResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gziwau.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGziwauResponse> QueryPreformanceGziwauExAsync(QueryPreformanceGziwauRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGziwauResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gziwau.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVhpywuResponse QueryPreformanceVhpywu(QueryPreformanceVhpywuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVhpywuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVhpywuResponse> QueryPreformanceVhpywuAsync(QueryPreformanceVhpywuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVhpywuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVhpywuResponse QueryPreformanceVhpywuEx(QueryPreformanceVhpywuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVhpywuResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vhpywu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVhpywuResponse> QueryPreformanceVhpywuExAsync(QueryPreformanceVhpywuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVhpywuResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vhpywu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJsulhtResponse QueryPreformanceJsulht(QueryPreformanceJsulhtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJsulhtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJsulhtResponse> QueryPreformanceJsulhtAsync(QueryPreformanceJsulhtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJsulhtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJsulhtResponse QueryPreformanceJsulhtEx(QueryPreformanceJsulhtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJsulhtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jsulht.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJsulhtResponse> QueryPreformanceJsulhtExAsync(QueryPreformanceJsulhtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJsulhtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jsulht.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIvcyplResponse QueryPreformanceIvcypl(QueryPreformanceIvcyplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIvcyplEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIvcyplResponse> QueryPreformanceIvcyplAsync(QueryPreformanceIvcyplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIvcyplExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIvcyplResponse QueryPreformanceIvcyplEx(QueryPreformanceIvcyplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIvcyplResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ivcypl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIvcyplResponse> QueryPreformanceIvcyplExAsync(QueryPreformanceIvcyplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIvcyplResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ivcypl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGmylkmResponse QueryPreformanceGmylkm(QueryPreformanceGmylkmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGmylkmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGmylkmResponse> QueryPreformanceGmylkmAsync(QueryPreformanceGmylkmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGmylkmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGmylkmResponse QueryPreformanceGmylkmEx(QueryPreformanceGmylkmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGmylkmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gmylkm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGmylkmResponse> QueryPreformanceGmylkmExAsync(QueryPreformanceGmylkmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGmylkmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gmylkm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYcdqltResponse QueryPreformanceYcdqlt(QueryPreformanceYcdqltRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYcdqltEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYcdqltResponse> QueryPreformanceYcdqltAsync(QueryPreformanceYcdqltRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYcdqltExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYcdqltResponse QueryPreformanceYcdqltEx(QueryPreformanceYcdqltRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYcdqltResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ycdqlt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYcdqltResponse> QueryPreformanceYcdqltExAsync(QueryPreformanceYcdqltRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYcdqltResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ycdqlt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTmspncResponse QueryPreformanceTmspnc(QueryPreformanceTmspncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTmspncEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTmspncResponse> QueryPreformanceTmspncAsync(QueryPreformanceTmspncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTmspncExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTmspncResponse QueryPreformanceTmspncEx(QueryPreformanceTmspncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTmspncResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.tmspnc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTmspncResponse> QueryPreformanceTmspncExAsync(QueryPreformanceTmspncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTmspncResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.tmspnc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSghpbdResponse QueryPreformanceSghpbd(QueryPreformanceSghpbdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSghpbdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSghpbdResponse> QueryPreformanceSghpbdAsync(QueryPreformanceSghpbdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSghpbdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSghpbdResponse QueryPreformanceSghpbdEx(QueryPreformanceSghpbdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSghpbdResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.sghpbd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSghpbdResponse> QueryPreformanceSghpbdExAsync(QueryPreformanceSghpbdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSghpbdResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.sghpbd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRhuirbResponse QueryPreformanceRhuirb(QueryPreformanceRhuirbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceRhuirbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRhuirbResponse> QueryPreformanceRhuirbAsync(QueryPreformanceRhuirbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceRhuirbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRhuirbResponse QueryPreformanceRhuirbEx(QueryPreformanceRhuirbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRhuirbResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.rhuirb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRhuirbResponse> QueryPreformanceRhuirbExAsync(QueryPreformanceRhuirbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRhuirbResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.rhuirb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZcvaeaResponse QueryPreformanceZcvaea(QueryPreformanceZcvaeaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZcvaeaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZcvaeaResponse> QueryPreformanceZcvaeaAsync(QueryPreformanceZcvaeaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZcvaeaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZcvaeaResponse QueryPreformanceZcvaeaEx(QueryPreformanceZcvaeaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZcvaeaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.zcvaea.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZcvaeaResponse> QueryPreformanceZcvaeaExAsync(QueryPreformanceZcvaeaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZcvaeaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.zcvaea.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGhohidResponse QueryPreformanceGhohid(QueryPreformanceGhohidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGhohidEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGhohidResponse> QueryPreformanceGhohidAsync(QueryPreformanceGhohidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGhohidExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGhohidResponse QueryPreformanceGhohidEx(QueryPreformanceGhohidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGhohidResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ghohid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGhohidResponse> QueryPreformanceGhohidExAsync(QueryPreformanceGhohidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGhohidResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ghohid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMcxrxmResponse QueryPreformanceMcxrxm(QueryPreformanceMcxrxmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMcxrxmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMcxrxmResponse> QueryPreformanceMcxrxmAsync(QueryPreformanceMcxrxmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMcxrxmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMcxrxmResponse QueryPreformanceMcxrxmEx(QueryPreformanceMcxrxmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMcxrxmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mcxrxm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMcxrxmResponse> QueryPreformanceMcxrxmExAsync(QueryPreformanceMcxrxmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMcxrxmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mcxrxm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYdbeozResponse QueryPreformanceYdbeoz(QueryPreformanceYdbeozRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYdbeozEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYdbeozResponse> QueryPreformanceYdbeozAsync(QueryPreformanceYdbeozRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYdbeozExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYdbeozResponse QueryPreformanceYdbeozEx(QueryPreformanceYdbeozRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYdbeozResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ydbeoz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYdbeozResponse> QueryPreformanceYdbeozExAsync(QueryPreformanceYdbeozRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYdbeozResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ydbeoz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGqiyjtResponse QueryPreformanceGqiyjt(QueryPreformanceGqiyjtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGqiyjtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGqiyjtResponse> QueryPreformanceGqiyjtAsync(QueryPreformanceGqiyjtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGqiyjtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGqiyjtResponse QueryPreformanceGqiyjtEx(QueryPreformanceGqiyjtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGqiyjtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gqiyjt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGqiyjtResponse> QueryPreformanceGqiyjtExAsync(QueryPreformanceGqiyjtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGqiyjtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gqiyjt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFlmtjeResponse QueryPreformanceFlmtje(QueryPreformanceFlmtjeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFlmtjeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFlmtjeResponse> QueryPreformanceFlmtjeAsync(QueryPreformanceFlmtjeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFlmtjeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFlmtjeResponse QueryPreformanceFlmtjeEx(QueryPreformanceFlmtjeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFlmtjeResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.flmtje.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFlmtjeResponse> QueryPreformanceFlmtjeExAsync(QueryPreformanceFlmtjeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFlmtjeResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.flmtje.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIhmckrResponse QueryPreformanceIhmckr(QueryPreformanceIhmckrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIhmckrEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIhmckrResponse> QueryPreformanceIhmckrAsync(QueryPreformanceIhmckrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIhmckrExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIhmckrResponse QueryPreformanceIhmckrEx(QueryPreformanceIhmckrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIhmckrResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ihmckr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIhmckrResponse> QueryPreformanceIhmckrExAsync(QueryPreformanceIhmckrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIhmckrResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ihmckr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVuhkynResponse QueryPreformanceVuhkyn(QueryPreformanceVuhkynRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVuhkynEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVuhkynResponse> QueryPreformanceVuhkynAsync(QueryPreformanceVuhkynRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVuhkynExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVuhkynResponse QueryPreformanceVuhkynEx(QueryPreformanceVuhkynRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVuhkynResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vuhkyn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVuhkynResponse> QueryPreformanceVuhkynExAsync(QueryPreformanceVuhkynRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVuhkynResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vuhkyn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCdyiujResponse QueryPreformanceCdyiuj(QueryPreformanceCdyiujRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceCdyiujEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCdyiujResponse> QueryPreformanceCdyiujAsync(QueryPreformanceCdyiujRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceCdyiujExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCdyiujResponse QueryPreformanceCdyiujEx(QueryPreformanceCdyiujRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCdyiujResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.cdyiuj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCdyiujResponse> QueryPreformanceCdyiujExAsync(QueryPreformanceCdyiujRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCdyiujResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.cdyiuj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQcenzcResponse QueryPreformanceQcenzc(QueryPreformanceQcenzcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQcenzcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQcenzcResponse> QueryPreformanceQcenzcAsync(QueryPreformanceQcenzcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQcenzcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQcenzcResponse QueryPreformanceQcenzcEx(QueryPreformanceQcenzcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQcenzcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.qcenzc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQcenzcResponse> QueryPreformanceQcenzcExAsync(QueryPreformanceQcenzcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQcenzcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.qcenzc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKrohvyResponse QueryPreformanceKrohvy(QueryPreformanceKrohvyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKrohvyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKrohvyResponse> QueryPreformanceKrohvyAsync(QueryPreformanceKrohvyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKrohvyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKrohvyResponse QueryPreformanceKrohvyEx(QueryPreformanceKrohvyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKrohvyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.krohvy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKrohvyResponse> QueryPreformanceKrohvyExAsync(QueryPreformanceKrohvyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKrohvyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.krohvy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNpyznvResponse QueryPreformanceNpyznv(QueryPreformanceNpyznvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceNpyznvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNpyznvResponse> QueryPreformanceNpyznvAsync(QueryPreformanceNpyznvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceNpyznvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNpyznvResponse QueryPreformanceNpyznvEx(QueryPreformanceNpyznvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNpyznvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.npyznv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNpyznvResponse> QueryPreformanceNpyznvExAsync(QueryPreformanceNpyznvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNpyznvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.npyznv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLqbvkmResponse QueryPreformanceLqbvkm(QueryPreformanceLqbvkmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLqbvkmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLqbvkmResponse> QueryPreformanceLqbvkmAsync(QueryPreformanceLqbvkmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLqbvkmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLqbvkmResponse QueryPreformanceLqbvkmEx(QueryPreformanceLqbvkmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLqbvkmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.lqbvkm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLqbvkmResponse> QueryPreformanceLqbvkmExAsync(QueryPreformanceLqbvkmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLqbvkmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.lqbvkm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFjxvfjResponse QueryPreformanceFjxvfj(QueryPreformanceFjxvfjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFjxvfjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFjxvfjResponse> QueryPreformanceFjxvfjAsync(QueryPreformanceFjxvfjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFjxvfjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFjxvfjResponse QueryPreformanceFjxvfjEx(QueryPreformanceFjxvfjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFjxvfjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.fjxvfj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFjxvfjResponse> QueryPreformanceFjxvfjExAsync(QueryPreformanceFjxvfjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFjxvfjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.fjxvfj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEqoghcResponse QueryPreformanceEqoghc(QueryPreformanceEqoghcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEqoghcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEqoghcResponse> QueryPreformanceEqoghcAsync(QueryPreformanceEqoghcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEqoghcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEqoghcResponse QueryPreformanceEqoghcEx(QueryPreformanceEqoghcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEqoghcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.eqoghc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEqoghcResponse> QueryPreformanceEqoghcExAsync(QueryPreformanceEqoghcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEqoghcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.eqoghc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQuklgcResponse QueryPreformanceQuklgc(QueryPreformanceQuklgcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQuklgcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQuklgcResponse> QueryPreformanceQuklgcAsync(QueryPreformanceQuklgcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQuklgcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQuklgcResponse QueryPreformanceQuklgcEx(QueryPreformanceQuklgcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQuklgcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.quklgc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQuklgcResponse> QueryPreformanceQuklgcExAsync(QueryPreformanceQuklgcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQuklgcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.quklgc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOtekpgResponse QueryPreformanceOtekpg(QueryPreformanceOtekpgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceOtekpgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOtekpgResponse> QueryPreformanceOtekpgAsync(QueryPreformanceOtekpgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceOtekpgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOtekpgResponse QueryPreformanceOtekpgEx(QueryPreformanceOtekpgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOtekpgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.otekpg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOtekpgResponse> QueryPreformanceOtekpgExAsync(QueryPreformanceOtekpgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOtekpgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.otekpg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFnipumResponse QueryPreformanceFnipum(QueryPreformanceFnipumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFnipumEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFnipumResponse> QueryPreformanceFnipumAsync(QueryPreformanceFnipumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFnipumExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFnipumResponse QueryPreformanceFnipumEx(QueryPreformanceFnipumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFnipumResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.fnipum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFnipumResponse> QueryPreformanceFnipumExAsync(QueryPreformanceFnipumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFnipumResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.fnipum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEhhgnqResponse QueryPreformanceEhhgnq(QueryPreformanceEhhgnqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEhhgnqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEhhgnqResponse> QueryPreformanceEhhgnqAsync(QueryPreformanceEhhgnqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEhhgnqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEhhgnqResponse QueryPreformanceEhhgnqEx(QueryPreformanceEhhgnqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEhhgnqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ehhgnq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEhhgnqResponse> QueryPreformanceEhhgnqExAsync(QueryPreformanceEhhgnqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEhhgnqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ehhgnq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNtrmkkResponse QueryPreformanceNtrmkk(QueryPreformanceNtrmkkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceNtrmkkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNtrmkkResponse> QueryPreformanceNtrmkkAsync(QueryPreformanceNtrmkkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceNtrmkkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNtrmkkResponse QueryPreformanceNtrmkkEx(QueryPreformanceNtrmkkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNtrmkkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ntrmkk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNtrmkkResponse> QueryPreformanceNtrmkkExAsync(QueryPreformanceNtrmkkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNtrmkkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ntrmkk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCdjnvmResponse QueryPreformanceCdjnvm(QueryPreformanceCdjnvmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceCdjnvmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCdjnvmResponse> QueryPreformanceCdjnvmAsync(QueryPreformanceCdjnvmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceCdjnvmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCdjnvmResponse QueryPreformanceCdjnvmEx(QueryPreformanceCdjnvmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCdjnvmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.cdjnvm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCdjnvmResponse> QueryPreformanceCdjnvmExAsync(QueryPreformanceCdjnvmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCdjnvmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.cdjnvm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZnmzzvResponse QueryPreformanceZnmzzv(QueryPreformanceZnmzzvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZnmzzvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZnmzzvResponse> QueryPreformanceZnmzzvAsync(QueryPreformanceZnmzzvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZnmzzvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZnmzzvResponse QueryPreformanceZnmzzvEx(QueryPreformanceZnmzzvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZnmzzvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.znmzzv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZnmzzvResponse> QueryPreformanceZnmzzvExAsync(QueryPreformanceZnmzzvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZnmzzvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.znmzzv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJhxufrResponse QueryPreformanceJhxufr(QueryPreformanceJhxufrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJhxufrEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJhxufrResponse> QueryPreformanceJhxufrAsync(QueryPreformanceJhxufrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJhxufrExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJhxufrResponse QueryPreformanceJhxufrEx(QueryPreformanceJhxufrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJhxufrResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jhxufr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJhxufrResponse> QueryPreformanceJhxufrExAsync(QueryPreformanceJhxufrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJhxufrResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jhxufr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBvhiaaResponse QueryPreformanceBvhiaa(QueryPreformanceBvhiaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBvhiaaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBvhiaaResponse> QueryPreformanceBvhiaaAsync(QueryPreformanceBvhiaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBvhiaaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBvhiaaResponse QueryPreformanceBvhiaaEx(QueryPreformanceBvhiaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBvhiaaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bvhiaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBvhiaaResponse> QueryPreformanceBvhiaaExAsync(QueryPreformanceBvhiaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBvhiaaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bvhiaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXkpsmyResponse QueryPreformanceXkpsmy(QueryPreformanceXkpsmyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXkpsmyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXkpsmyResponse> QueryPreformanceXkpsmyAsync(QueryPreformanceXkpsmyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXkpsmyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXkpsmyResponse QueryPreformanceXkpsmyEx(QueryPreformanceXkpsmyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXkpsmyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xkpsmy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXkpsmyResponse> QueryPreformanceXkpsmyExAsync(QueryPreformanceXkpsmyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXkpsmyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xkpsmy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUvqflcResponse QueryPreformanceUvqflc(QueryPreformanceUvqflcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUvqflcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUvqflcResponse> QueryPreformanceUvqflcAsync(QueryPreformanceUvqflcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUvqflcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUvqflcResponse QueryPreformanceUvqflcEx(QueryPreformanceUvqflcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUvqflcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.uvqflc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUvqflcResponse> QueryPreformanceUvqflcExAsync(QueryPreformanceUvqflcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUvqflcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.uvqflc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVyjnjhResponse QueryPreformanceVyjnjh(QueryPreformanceVyjnjhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVyjnjhEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVyjnjhResponse> QueryPreformanceVyjnjhAsync(QueryPreformanceVyjnjhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVyjnjhExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVyjnjhResponse QueryPreformanceVyjnjhEx(QueryPreformanceVyjnjhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVyjnjhResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vyjnjh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVyjnjhResponse> QueryPreformanceVyjnjhExAsync(QueryPreformanceVyjnjhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVyjnjhResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vyjnjh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQdwewwResponse QueryPreformanceQdweww(QueryPreformanceQdwewwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQdwewwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQdwewwResponse> QueryPreformanceQdwewwAsync(QueryPreformanceQdwewwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQdwewwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQdwewwResponse QueryPreformanceQdwewwEx(QueryPreformanceQdwewwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQdwewwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.qdweww.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQdwewwResponse> QueryPreformanceQdwewwExAsync(QueryPreformanceQdwewwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQdwewwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.qdweww.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYxsifpResponse QueryPreformanceYxsifp(QueryPreformanceYxsifpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYxsifpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYxsifpResponse> QueryPreformanceYxsifpAsync(QueryPreformanceYxsifpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYxsifpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYxsifpResponse QueryPreformanceYxsifpEx(QueryPreformanceYxsifpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYxsifpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yxsifp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYxsifpResponse> QueryPreformanceYxsifpExAsync(QueryPreformanceYxsifpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYxsifpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yxsifp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEfvjvzResponse QueryPreformanceEfvjvz(QueryPreformanceEfvjvzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEfvjvzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEfvjvzResponse> QueryPreformanceEfvjvzAsync(QueryPreformanceEfvjvzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEfvjvzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEfvjvzResponse QueryPreformanceEfvjvzEx(QueryPreformanceEfvjvzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEfvjvzResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.efvjvz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEfvjvzResponse> QueryPreformanceEfvjvzExAsync(QueryPreformanceEfvjvzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEfvjvzResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.efvjvz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJppmohResponse QueryPreformanceJppmoh(QueryPreformanceJppmohRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJppmohEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJppmohResponse> QueryPreformanceJppmohAsync(QueryPreformanceJppmohRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJppmohExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJppmohResponse QueryPreformanceJppmohEx(QueryPreformanceJppmohRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJppmohResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jppmoh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJppmohResponse> QueryPreformanceJppmohExAsync(QueryPreformanceJppmohRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJppmohResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jppmoh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVcwcvoResponse QueryPreformanceVcwcvo(QueryPreformanceVcwcvoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVcwcvoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVcwcvoResponse> QueryPreformanceVcwcvoAsync(QueryPreformanceVcwcvoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVcwcvoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVcwcvoResponse QueryPreformanceVcwcvoEx(QueryPreformanceVcwcvoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVcwcvoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vcwcvo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVcwcvoResponse> QueryPreformanceVcwcvoExAsync(QueryPreformanceVcwcvoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVcwcvoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vcwcvo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBdbqlwResponse QueryPreformanceBdbqlw(QueryPreformanceBdbqlwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBdbqlwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBdbqlwResponse> QueryPreformanceBdbqlwAsync(QueryPreformanceBdbqlwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBdbqlwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBdbqlwResponse QueryPreformanceBdbqlwEx(QueryPreformanceBdbqlwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBdbqlwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bdbqlw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBdbqlwResponse> QueryPreformanceBdbqlwExAsync(QueryPreformanceBdbqlwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBdbqlwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bdbqlw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAqmmruResponse QueryPreformanceAqmmru(QueryPreformanceAqmmruRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAqmmruEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAqmmruResponse> QueryPreformanceAqmmruAsync(QueryPreformanceAqmmruRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAqmmruExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAqmmruResponse QueryPreformanceAqmmruEx(QueryPreformanceAqmmruRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAqmmruResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.aqmmru.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAqmmruResponse> QueryPreformanceAqmmruExAsync(QueryPreformanceAqmmruRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAqmmruResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.aqmmru.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRvieyvResponse QueryPreformanceRvieyv(QueryPreformanceRvieyvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceRvieyvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRvieyvResponse> QueryPreformanceRvieyvAsync(QueryPreformanceRvieyvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceRvieyvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRvieyvResponse QueryPreformanceRvieyvEx(QueryPreformanceRvieyvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRvieyvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.rvieyv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRvieyvResponse> QueryPreformanceRvieyvExAsync(QueryPreformanceRvieyvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRvieyvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.rvieyv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDmopqgResponse QueryPreformanceDmopqg(QueryPreformanceDmopqgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDmopqgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDmopqgResponse> QueryPreformanceDmopqgAsync(QueryPreformanceDmopqgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDmopqgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDmopqgResponse QueryPreformanceDmopqgEx(QueryPreformanceDmopqgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDmopqgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dmopqg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDmopqgResponse> QueryPreformanceDmopqgExAsync(QueryPreformanceDmopqgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDmopqgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dmopqg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJiccssResponse QueryPreformanceJiccss(QueryPreformanceJiccssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJiccssEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJiccssResponse> QueryPreformanceJiccssAsync(QueryPreformanceJiccssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJiccssExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJiccssResponse QueryPreformanceJiccssEx(QueryPreformanceJiccssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJiccssResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jiccss.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJiccssResponse> QueryPreformanceJiccssExAsync(QueryPreformanceJiccssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJiccssResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jiccss.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHlqjtdResponse QueryPreformanceHlqjtd(QueryPreformanceHlqjtdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHlqjtdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHlqjtdResponse> QueryPreformanceHlqjtdAsync(QueryPreformanceHlqjtdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHlqjtdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHlqjtdResponse QueryPreformanceHlqjtdEx(QueryPreformanceHlqjtdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHlqjtdResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hlqjtd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHlqjtdResponse> QueryPreformanceHlqjtdExAsync(QueryPreformanceHlqjtdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHlqjtdResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hlqjtd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLaldyfResponse QueryPreformanceLaldyf(QueryPreformanceLaldyfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLaldyfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLaldyfResponse> QueryPreformanceLaldyfAsync(QueryPreformanceLaldyfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLaldyfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLaldyfResponse QueryPreformanceLaldyfEx(QueryPreformanceLaldyfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLaldyfResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.laldyf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLaldyfResponse> QueryPreformanceLaldyfExAsync(QueryPreformanceLaldyfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLaldyfResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.laldyf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYbynjwResponse QueryPreformanceYbynjw(QueryPreformanceYbynjwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYbynjwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYbynjwResponse> QueryPreformanceYbynjwAsync(QueryPreformanceYbynjwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYbynjwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYbynjwResponse QueryPreformanceYbynjwEx(QueryPreformanceYbynjwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYbynjwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ybynjw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYbynjwResponse> QueryPreformanceYbynjwExAsync(QueryPreformanceYbynjwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYbynjwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ybynjw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFsinwzResponse QueryPreformanceFsinwz(QueryPreformanceFsinwzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFsinwzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFsinwzResponse> QueryPreformanceFsinwzAsync(QueryPreformanceFsinwzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFsinwzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFsinwzResponse QueryPreformanceFsinwzEx(QueryPreformanceFsinwzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFsinwzResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.fsinwz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFsinwzResponse> QueryPreformanceFsinwzExAsync(QueryPreformanceFsinwzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFsinwzResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.fsinwz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePgfxxnResponse QueryPreformancePgfxxn(QueryPreformancePgfxxnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePgfxxnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePgfxxnResponse> QueryPreformancePgfxxnAsync(QueryPreformancePgfxxnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePgfxxnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePgfxxnResponse QueryPreformancePgfxxnEx(QueryPreformancePgfxxnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePgfxxnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pgfxxn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePgfxxnResponse> QueryPreformancePgfxxnExAsync(QueryPreformancePgfxxnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePgfxxnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pgfxxn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQuinflResponse QueryPreformanceQuinfl(QueryPreformanceQuinflRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQuinflEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQuinflResponse> QueryPreformanceQuinflAsync(QueryPreformanceQuinflRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQuinflExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQuinflResponse QueryPreformanceQuinflEx(QueryPreformanceQuinflRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQuinflResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.quinfl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQuinflResponse> QueryPreformanceQuinflExAsync(QueryPreformanceQuinflRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQuinflResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.quinfl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYxgwyyResponse QueryPreformanceYxgwyy(QueryPreformanceYxgwyyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYxgwyyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYxgwyyResponse> QueryPreformanceYxgwyyAsync(QueryPreformanceYxgwyyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYxgwyyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYxgwyyResponse QueryPreformanceYxgwyyEx(QueryPreformanceYxgwyyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYxgwyyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yxgwyy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYxgwyyResponse> QueryPreformanceYxgwyyExAsync(QueryPreformanceYxgwyyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYxgwyyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yxgwyy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNendtwResponse QueryPreformanceNendtw(QueryPreformanceNendtwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceNendtwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNendtwResponse> QueryPreformanceNendtwAsync(QueryPreformanceNendtwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceNendtwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNendtwResponse QueryPreformanceNendtwEx(QueryPreformanceNendtwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNendtwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.nendtw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNendtwResponse> QueryPreformanceNendtwExAsync(QueryPreformanceNendtwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNendtwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.nendtw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFtjeczResponse QueryPreformanceFtjecz(QueryPreformanceFtjeczRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFtjeczEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFtjeczResponse> QueryPreformanceFtjeczAsync(QueryPreformanceFtjeczRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFtjeczExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFtjeczResponse QueryPreformanceFtjeczEx(QueryPreformanceFtjeczRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFtjeczResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ftjecz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFtjeczResponse> QueryPreformanceFtjeczExAsync(QueryPreformanceFtjeczRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFtjeczResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ftjecz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEputrhResponse QueryPreformanceEputrh(QueryPreformanceEputrhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEputrhEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEputrhResponse> QueryPreformanceEputrhAsync(QueryPreformanceEputrhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEputrhExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEputrhResponse QueryPreformanceEputrhEx(QueryPreformanceEputrhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEputrhResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.eputrh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEputrhResponse> QueryPreformanceEputrhExAsync(QueryPreformanceEputrhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEputrhResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.eputrh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVspsumResponse QueryPreformanceVspsum(QueryPreformanceVspsumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVspsumEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVspsumResponse> QueryPreformanceVspsumAsync(QueryPreformanceVspsumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVspsumExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVspsumResponse QueryPreformanceVspsumEx(QueryPreformanceVspsumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVspsumResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vspsum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVspsumResponse> QueryPreformanceVspsumExAsync(QueryPreformanceVspsumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVspsumResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vspsum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZlwaueResponse QueryPreformanceZlwaue(QueryPreformanceZlwaueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZlwaueEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZlwaueResponse> QueryPreformanceZlwaueAsync(QueryPreformanceZlwaueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZlwaueExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZlwaueResponse QueryPreformanceZlwaueEx(QueryPreformanceZlwaueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZlwaueResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.zlwaue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZlwaueResponse> QueryPreformanceZlwaueExAsync(QueryPreformanceZlwaueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZlwaueResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.zlwaue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMqaojrResponse QueryPreformanceMqaojr(QueryPreformanceMqaojrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMqaojrEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMqaojrResponse> QueryPreformanceMqaojrAsync(QueryPreformanceMqaojrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMqaojrExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMqaojrResponse QueryPreformanceMqaojrEx(QueryPreformanceMqaojrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMqaojrResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mqaojr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMqaojrResponse> QueryPreformanceMqaojrExAsync(QueryPreformanceMqaojrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMqaojrResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mqaojr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBfcfqdResponse QueryPreformanceBfcfqd(QueryPreformanceBfcfqdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBfcfqdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBfcfqdResponse> QueryPreformanceBfcfqdAsync(QueryPreformanceBfcfqdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBfcfqdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBfcfqdResponse QueryPreformanceBfcfqdEx(QueryPreformanceBfcfqdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBfcfqdResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bfcfqd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBfcfqdResponse> QueryPreformanceBfcfqdExAsync(QueryPreformanceBfcfqdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBfcfqdResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bfcfqd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYcfsafResponse QueryPreformanceYcfsaf(QueryPreformanceYcfsafRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYcfsafEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYcfsafResponse> QueryPreformanceYcfsafAsync(QueryPreformanceYcfsafRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYcfsafExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYcfsafResponse QueryPreformanceYcfsafEx(QueryPreformanceYcfsafRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYcfsafResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ycfsaf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYcfsafResponse> QueryPreformanceYcfsafExAsync(QueryPreformanceYcfsafRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYcfsafResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ycfsaf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZwpmyiResponse QueryPreformanceZwpmyi(QueryPreformanceZwpmyiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZwpmyiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZwpmyiResponse> QueryPreformanceZwpmyiAsync(QueryPreformanceZwpmyiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZwpmyiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZwpmyiResponse QueryPreformanceZwpmyiEx(QueryPreformanceZwpmyiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZwpmyiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.zwpmyi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZwpmyiResponse> QueryPreformanceZwpmyiExAsync(QueryPreformanceZwpmyiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZwpmyiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.zwpmyi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMvgnlaResponse QueryPreformanceMvgnla(QueryPreformanceMvgnlaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMvgnlaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMvgnlaResponse> QueryPreformanceMvgnlaAsync(QueryPreformanceMvgnlaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMvgnlaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMvgnlaResponse QueryPreformanceMvgnlaEx(QueryPreformanceMvgnlaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMvgnlaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mvgnla.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMvgnlaResponse> QueryPreformanceMvgnlaExAsync(QueryPreformanceMvgnlaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMvgnlaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mvgnla.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVlmrpmResponse QueryPreformanceVlmrpm(QueryPreformanceVlmrpmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVlmrpmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVlmrpmResponse> QueryPreformanceVlmrpmAsync(QueryPreformanceVlmrpmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVlmrpmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVlmrpmResponse QueryPreformanceVlmrpmEx(QueryPreformanceVlmrpmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVlmrpmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vlmrpm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVlmrpmResponse> QueryPreformanceVlmrpmExAsync(QueryPreformanceVlmrpmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVlmrpmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vlmrpm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKfygrpResponse QueryPreformanceKfygrp(QueryPreformanceKfygrpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKfygrpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKfygrpResponse> QueryPreformanceKfygrpAsync(QueryPreformanceKfygrpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKfygrpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKfygrpResponse QueryPreformanceKfygrpEx(QueryPreformanceKfygrpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKfygrpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kfygrp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKfygrpResponse> QueryPreformanceKfygrpExAsync(QueryPreformanceKfygrpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKfygrpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kfygrp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKqdmywResponse QueryPreformanceKqdmyw(QueryPreformanceKqdmywRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKqdmywEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKqdmywResponse> QueryPreformanceKqdmywAsync(QueryPreformanceKqdmywRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKqdmywExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKqdmywResponse QueryPreformanceKqdmywEx(QueryPreformanceKqdmywRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKqdmywResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kqdmyw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKqdmywResponse> QueryPreformanceKqdmywExAsync(QueryPreformanceKqdmywRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKqdmywResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kqdmyw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIdrolcResponse QueryPreformanceIdrolc(QueryPreformanceIdrolcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIdrolcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIdrolcResponse> QueryPreformanceIdrolcAsync(QueryPreformanceIdrolcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIdrolcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIdrolcResponse QueryPreformanceIdrolcEx(QueryPreformanceIdrolcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIdrolcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.idrolc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIdrolcResponse> QueryPreformanceIdrolcExAsync(QueryPreformanceIdrolcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIdrolcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.idrolc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGoxdkkResponse QueryPreformanceGoxdkk(QueryPreformanceGoxdkkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGoxdkkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGoxdkkResponse> QueryPreformanceGoxdkkAsync(QueryPreformanceGoxdkkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGoxdkkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGoxdkkResponse QueryPreformanceGoxdkkEx(QueryPreformanceGoxdkkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGoxdkkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.goxdkk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGoxdkkResponse> QueryPreformanceGoxdkkExAsync(QueryPreformanceGoxdkkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGoxdkkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.goxdkk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJnrlwyResponse QueryPreformanceJnrlwy(QueryPreformanceJnrlwyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJnrlwyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJnrlwyResponse> QueryPreformanceJnrlwyAsync(QueryPreformanceJnrlwyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJnrlwyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJnrlwyResponse QueryPreformanceJnrlwyEx(QueryPreformanceJnrlwyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJnrlwyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jnrlwy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJnrlwyResponse> QueryPreformanceJnrlwyExAsync(QueryPreformanceJnrlwyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJnrlwyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jnrlwy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYoiwnfResponse QueryPreformanceYoiwnf(QueryPreformanceYoiwnfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYoiwnfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYoiwnfResponse> QueryPreformanceYoiwnfAsync(QueryPreformanceYoiwnfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYoiwnfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYoiwnfResponse QueryPreformanceYoiwnfEx(QueryPreformanceYoiwnfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYoiwnfResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yoiwnf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYoiwnfResponse> QueryPreformanceYoiwnfExAsync(QueryPreformanceYoiwnfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYoiwnfResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yoiwnf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePxtfgcResponse QueryPreformancePxtfgc(QueryPreformancePxtfgcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePxtfgcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePxtfgcResponse> QueryPreformancePxtfgcAsync(QueryPreformancePxtfgcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePxtfgcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePxtfgcResponse QueryPreformancePxtfgcEx(QueryPreformancePxtfgcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePxtfgcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pxtfgc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePxtfgcResponse> QueryPreformancePxtfgcExAsync(QueryPreformancePxtfgcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePxtfgcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pxtfgc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGbigiaResponse QueryPreformanceGbigia(QueryPreformanceGbigiaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGbigiaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGbigiaResponse> QueryPreformanceGbigiaAsync(QueryPreformanceGbigiaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGbigiaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGbigiaResponse QueryPreformanceGbigiaEx(QueryPreformanceGbigiaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGbigiaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gbigia.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGbigiaResponse> QueryPreformanceGbigiaExAsync(QueryPreformanceGbigiaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGbigiaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gbigia.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGohgooResponse QueryPreformanceGohgoo(QueryPreformanceGohgooRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGohgooEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGohgooResponse> QueryPreformanceGohgooAsync(QueryPreformanceGohgooRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGohgooExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGohgooResponse QueryPreformanceGohgooEx(QueryPreformanceGohgooRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGohgooResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gohgoo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGohgooResponse> QueryPreformanceGohgooExAsync(QueryPreformanceGohgooRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGohgooResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gohgoo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQzijugResponse QueryPreformanceQzijug(QueryPreformanceQzijugRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQzijugEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQzijugResponse> QueryPreformanceQzijugAsync(QueryPreformanceQzijugRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQzijugExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQzijugResponse QueryPreformanceQzijugEx(QueryPreformanceQzijugRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQzijugResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.qzijug.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQzijugResponse> QueryPreformanceQzijugExAsync(QueryPreformanceQzijugRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQzijugResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.qzijug.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDtiqsmResponse QueryPreformanceDtiqsm(QueryPreformanceDtiqsmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDtiqsmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDtiqsmResponse> QueryPreformanceDtiqsmAsync(QueryPreformanceDtiqsmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDtiqsmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDtiqsmResponse QueryPreformanceDtiqsmEx(QueryPreformanceDtiqsmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDtiqsmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dtiqsm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDtiqsmResponse> QueryPreformanceDtiqsmExAsync(QueryPreformanceDtiqsmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDtiqsmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dtiqsm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIapwkxResponse QueryPreformanceIapwkx(QueryPreformanceIapwkxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIapwkxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIapwkxResponse> QueryPreformanceIapwkxAsync(QueryPreformanceIapwkxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIapwkxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIapwkxResponse QueryPreformanceIapwkxEx(QueryPreformanceIapwkxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIapwkxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.iapwkx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIapwkxResponse> QueryPreformanceIapwkxExAsync(QueryPreformanceIapwkxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIapwkxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.iapwkx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAarwuqResponse QueryPreformanceAarwuq(QueryPreformanceAarwuqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAarwuqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAarwuqResponse> QueryPreformanceAarwuqAsync(QueryPreformanceAarwuqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAarwuqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAarwuqResponse QueryPreformanceAarwuqEx(QueryPreformanceAarwuqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAarwuqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.aarwuq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAarwuqResponse> QueryPreformanceAarwuqExAsync(QueryPreformanceAarwuqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAarwuqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.aarwuq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEgsbveResponse QueryPreformanceEgsbve(QueryPreformanceEgsbveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEgsbveEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEgsbveResponse> QueryPreformanceEgsbveAsync(QueryPreformanceEgsbveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEgsbveExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEgsbveResponse QueryPreformanceEgsbveEx(QueryPreformanceEgsbveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEgsbveResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.egsbve.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEgsbveResponse> QueryPreformanceEgsbveExAsync(QueryPreformanceEgsbveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEgsbveResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.egsbve.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUdgzvlResponse QueryPreformanceUdgzvl(QueryPreformanceUdgzvlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUdgzvlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUdgzvlResponse> QueryPreformanceUdgzvlAsync(QueryPreformanceUdgzvlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUdgzvlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUdgzvlResponse QueryPreformanceUdgzvlEx(QueryPreformanceUdgzvlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUdgzvlResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.udgzvl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUdgzvlResponse> QueryPreformanceUdgzvlExAsync(QueryPreformanceUdgzvlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUdgzvlResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.udgzvl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOxzmsdResponse QueryPreformanceOxzmsd(QueryPreformanceOxzmsdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceOxzmsdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOxzmsdResponse> QueryPreformanceOxzmsdAsync(QueryPreformanceOxzmsdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceOxzmsdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOxzmsdResponse QueryPreformanceOxzmsdEx(QueryPreformanceOxzmsdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOxzmsdResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.oxzmsd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOxzmsdResponse> QueryPreformanceOxzmsdExAsync(QueryPreformanceOxzmsdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOxzmsdResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.oxzmsd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWrbogxResponse QueryPreformanceWrbogx(QueryPreformanceWrbogxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceWrbogxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWrbogxResponse> QueryPreformanceWrbogxAsync(QueryPreformanceWrbogxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceWrbogxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWrbogxResponse QueryPreformanceWrbogxEx(QueryPreformanceWrbogxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWrbogxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.wrbogx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWrbogxResponse> QueryPreformanceWrbogxExAsync(QueryPreformanceWrbogxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWrbogxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.wrbogx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSovdsqResponse QueryPreformanceSovdsq(QueryPreformanceSovdsqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSovdsqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSovdsqResponse> QueryPreformanceSovdsqAsync(QueryPreformanceSovdsqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSovdsqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSovdsqResponse QueryPreformanceSovdsqEx(QueryPreformanceSovdsqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSovdsqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.sovdsq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSovdsqResponse> QueryPreformanceSovdsqExAsync(QueryPreformanceSovdsqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSovdsqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.sovdsq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKmenziResponse QueryPreformanceKmenzi(QueryPreformanceKmenziRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKmenziEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKmenziResponse> QueryPreformanceKmenziAsync(QueryPreformanceKmenziRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKmenziExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKmenziResponse QueryPreformanceKmenziEx(QueryPreformanceKmenziRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKmenziResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kmenzi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKmenziResponse> QueryPreformanceKmenziExAsync(QueryPreformanceKmenziRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKmenziResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kmenzi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNdyzvbResponse QueryPreformanceNdyzvb(QueryPreformanceNdyzvbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceNdyzvbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNdyzvbResponse> QueryPreformanceNdyzvbAsync(QueryPreformanceNdyzvbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceNdyzvbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNdyzvbResponse QueryPreformanceNdyzvbEx(QueryPreformanceNdyzvbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNdyzvbResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ndyzvb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNdyzvbResponse> QueryPreformanceNdyzvbExAsync(QueryPreformanceNdyzvbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNdyzvbResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ndyzvb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePleorxResponse QueryPreformancePleorx(QueryPreformancePleorxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePleorxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePleorxResponse> QueryPreformancePleorxAsync(QueryPreformancePleorxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePleorxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePleorxResponse QueryPreformancePleorxEx(QueryPreformancePleorxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePleorxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pleorx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePleorxResponse> QueryPreformancePleorxExAsync(QueryPreformancePleorxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePleorxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pleorx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceErldmsResponse QueryPreformanceErldms(QueryPreformanceErldmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceErldmsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceErldmsResponse> QueryPreformanceErldmsAsync(QueryPreformanceErldmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceErldmsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceErldmsResponse QueryPreformanceErldmsEx(QueryPreformanceErldmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceErldmsResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.erldms.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceErldmsResponse> QueryPreformanceErldmsExAsync(QueryPreformanceErldmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceErldmsResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.erldms.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePstmvtResponse QueryPreformancePstmvt(QueryPreformancePstmvtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePstmvtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePstmvtResponse> QueryPreformancePstmvtAsync(QueryPreformancePstmvtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePstmvtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePstmvtResponse QueryPreformancePstmvtEx(QueryPreformancePstmvtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePstmvtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pstmvt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePstmvtResponse> QueryPreformancePstmvtExAsync(QueryPreformancePstmvtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePstmvtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pstmvt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRgcensResponse QueryPreformanceRgcens(QueryPreformanceRgcensRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceRgcensEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRgcensResponse> QueryPreformanceRgcensAsync(QueryPreformanceRgcensRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceRgcensExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRgcensResponse QueryPreformanceRgcensEx(QueryPreformanceRgcensRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRgcensResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.rgcens.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRgcensResponse> QueryPreformanceRgcensExAsync(QueryPreformanceRgcensRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRgcensResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.rgcens.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDfawnnResponse QueryPreformanceDfawnn(QueryPreformanceDfawnnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDfawnnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDfawnnResponse> QueryPreformanceDfawnnAsync(QueryPreformanceDfawnnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDfawnnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDfawnnResponse QueryPreformanceDfawnnEx(QueryPreformanceDfawnnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDfawnnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dfawnn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDfawnnResponse> QueryPreformanceDfawnnExAsync(QueryPreformanceDfawnnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDfawnnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dfawnn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYzzbsmResponse QueryPreformanceYzzbsm(QueryPreformanceYzzbsmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYzzbsmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYzzbsmResponse> QueryPreformanceYzzbsmAsync(QueryPreformanceYzzbsmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYzzbsmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYzzbsmResponse QueryPreformanceYzzbsmEx(QueryPreformanceYzzbsmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYzzbsmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yzzbsm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYzzbsmResponse> QueryPreformanceYzzbsmExAsync(QueryPreformanceYzzbsmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYzzbsmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yzzbsm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSybmpkResponse QueryPreformanceSybmpk(QueryPreformanceSybmpkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSybmpkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSybmpkResponse> QueryPreformanceSybmpkAsync(QueryPreformanceSybmpkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSybmpkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSybmpkResponse QueryPreformanceSybmpkEx(QueryPreformanceSybmpkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSybmpkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.sybmpk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSybmpkResponse> QueryPreformanceSybmpkExAsync(QueryPreformanceSybmpkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSybmpkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.sybmpk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZtxnbkResponse QueryPreformanceZtxnbk(QueryPreformanceZtxnbkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZtxnbkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZtxnbkResponse> QueryPreformanceZtxnbkAsync(QueryPreformanceZtxnbkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZtxnbkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZtxnbkResponse QueryPreformanceZtxnbkEx(QueryPreformanceZtxnbkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZtxnbkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ztxnbk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZtxnbkResponse> QueryPreformanceZtxnbkExAsync(QueryPreformanceZtxnbkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZtxnbkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ztxnbk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTtttjpResponse QueryPreformanceTtttjp(QueryPreformanceTtttjpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTtttjpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTtttjpResponse> QueryPreformanceTtttjpAsync(QueryPreformanceTtttjpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTtttjpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTtttjpResponse QueryPreformanceTtttjpEx(QueryPreformanceTtttjpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTtttjpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ttttjp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTtttjpResponse> QueryPreformanceTtttjpExAsync(QueryPreformanceTtttjpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTtttjpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ttttjp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKpnmpvResponse QueryPreformanceKpnmpv(QueryPreformanceKpnmpvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKpnmpvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKpnmpvResponse> QueryPreformanceKpnmpvAsync(QueryPreformanceKpnmpvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKpnmpvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKpnmpvResponse QueryPreformanceKpnmpvEx(QueryPreformanceKpnmpvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKpnmpvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kpnmpv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKpnmpvResponse> QueryPreformanceKpnmpvExAsync(QueryPreformanceKpnmpvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKpnmpvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kpnmpv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYquegwResponse QueryPreformanceYquegw(QueryPreformanceYquegwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYquegwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYquegwResponse> QueryPreformanceYquegwAsync(QueryPreformanceYquegwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYquegwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYquegwResponse QueryPreformanceYquegwEx(QueryPreformanceYquegwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYquegwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yquegw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYquegwResponse> QueryPreformanceYquegwExAsync(QueryPreformanceYquegwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYquegwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yquegw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYjmbylResponse QueryPreformanceYjmbyl(QueryPreformanceYjmbylRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYjmbylEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYjmbylResponse> QueryPreformanceYjmbylAsync(QueryPreformanceYjmbylRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYjmbylExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYjmbylResponse QueryPreformanceYjmbylEx(QueryPreformanceYjmbylRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYjmbylResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yjmbyl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYjmbylResponse> QueryPreformanceYjmbylExAsync(QueryPreformanceYjmbylRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYjmbylResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yjmbyl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGjnnnvResponse QueryPreformanceGjnnnv(QueryPreformanceGjnnnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGjnnnvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGjnnnvResponse> QueryPreformanceGjnnnvAsync(QueryPreformanceGjnnnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGjnnnvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGjnnnvResponse QueryPreformanceGjnnnvEx(QueryPreformanceGjnnnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGjnnnvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gjnnnv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGjnnnvResponse> QueryPreformanceGjnnnvExAsync(QueryPreformanceGjnnnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGjnnnvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gjnnnv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCgcmkvResponse QueryPreformanceCgcmkv(QueryPreformanceCgcmkvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceCgcmkvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCgcmkvResponse> QueryPreformanceCgcmkvAsync(QueryPreformanceCgcmkvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceCgcmkvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCgcmkvResponse QueryPreformanceCgcmkvEx(QueryPreformanceCgcmkvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCgcmkvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.cgcmkv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCgcmkvResponse> QueryPreformanceCgcmkvExAsync(QueryPreformanceCgcmkvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCgcmkvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.cgcmkv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVtqjtiResponse QueryPreformanceVtqjti(QueryPreformanceVtqjtiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVtqjtiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVtqjtiResponse> QueryPreformanceVtqjtiAsync(QueryPreformanceVtqjtiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVtqjtiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVtqjtiResponse QueryPreformanceVtqjtiEx(QueryPreformanceVtqjtiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVtqjtiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vtqjti.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVtqjtiResponse> QueryPreformanceVtqjtiExAsync(QueryPreformanceVtqjtiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVtqjtiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vtqjti.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZazxkcResponse QueryPreformanceZazxkc(QueryPreformanceZazxkcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZazxkcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZazxkcResponse> QueryPreformanceZazxkcAsync(QueryPreformanceZazxkcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZazxkcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZazxkcResponse QueryPreformanceZazxkcEx(QueryPreformanceZazxkcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZazxkcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.zazxkc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZazxkcResponse> QueryPreformanceZazxkcExAsync(QueryPreformanceZazxkcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZazxkcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.zazxkc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNxifyyResponse QueryPreformanceNxifyy(QueryPreformanceNxifyyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceNxifyyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNxifyyResponse> QueryPreformanceNxifyyAsync(QueryPreformanceNxifyyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceNxifyyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNxifyyResponse QueryPreformanceNxifyyEx(QueryPreformanceNxifyyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNxifyyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.nxifyy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNxifyyResponse> QueryPreformanceNxifyyExAsync(QueryPreformanceNxifyyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNxifyyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.nxifyy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZnlzkiResponse QueryPreformanceZnlzki(QueryPreformanceZnlzkiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZnlzkiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZnlzkiResponse> QueryPreformanceZnlzkiAsync(QueryPreformanceZnlzkiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZnlzkiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZnlzkiResponse QueryPreformanceZnlzkiEx(QueryPreformanceZnlzkiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZnlzkiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.znlzki.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZnlzkiResponse> QueryPreformanceZnlzkiExAsync(QueryPreformanceZnlzkiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZnlzkiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.znlzki.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVcvcvyResponse QueryPreformanceVcvcvy(QueryPreformanceVcvcvyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVcvcvyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVcvcvyResponse> QueryPreformanceVcvcvyAsync(QueryPreformanceVcvcvyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVcvcvyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVcvcvyResponse QueryPreformanceVcvcvyEx(QueryPreformanceVcvcvyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVcvcvyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vcvcvy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVcvcvyResponse> QueryPreformanceVcvcvyExAsync(QueryPreformanceVcvcvyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVcvcvyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vcvcvy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXuchrmResponse QueryPreformanceXuchrm(QueryPreformanceXuchrmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXuchrmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXuchrmResponse> QueryPreformanceXuchrmAsync(QueryPreformanceXuchrmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXuchrmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXuchrmResponse QueryPreformanceXuchrmEx(QueryPreformanceXuchrmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXuchrmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xuchrm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXuchrmResponse> QueryPreformanceXuchrmExAsync(QueryPreformanceXuchrmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXuchrmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xuchrm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZtkrkpResponse QueryPreformanceZtkrkp(QueryPreformanceZtkrkpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZtkrkpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZtkrkpResponse> QueryPreformanceZtkrkpAsync(QueryPreformanceZtkrkpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZtkrkpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZtkrkpResponse QueryPreformanceZtkrkpEx(QueryPreformanceZtkrkpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZtkrkpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ztkrkp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZtkrkpResponse> QueryPreformanceZtkrkpExAsync(QueryPreformanceZtkrkpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZtkrkpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ztkrkp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJetnghResponse QueryPreformanceJetngh(QueryPreformanceJetnghRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJetnghEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJetnghResponse> QueryPreformanceJetnghAsync(QueryPreformanceJetnghRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJetnghExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJetnghResponse QueryPreformanceJetnghEx(QueryPreformanceJetnghRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJetnghResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jetngh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJetnghResponse> QueryPreformanceJetnghExAsync(QueryPreformanceJetnghRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJetnghResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jetngh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBgtghlResponse QueryPreformanceBgtghl(QueryPreformanceBgtghlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBgtghlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBgtghlResponse> QueryPreformanceBgtghlAsync(QueryPreformanceBgtghlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBgtghlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBgtghlResponse QueryPreformanceBgtghlEx(QueryPreformanceBgtghlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBgtghlResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bgtghl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBgtghlResponse> QueryPreformanceBgtghlExAsync(QueryPreformanceBgtghlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBgtghlResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bgtghl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVwquksResponse QueryPreformanceVwquks(QueryPreformanceVwquksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVwquksEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVwquksResponse> QueryPreformanceVwquksAsync(QueryPreformanceVwquksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVwquksExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVwquksResponse QueryPreformanceVwquksEx(QueryPreformanceVwquksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVwquksResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vwquks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVwquksResponse> QueryPreformanceVwquksExAsync(QueryPreformanceVwquksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVwquksResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vwquks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceElcoqaResponse QueryPreformanceElcoqa(QueryPreformanceElcoqaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceElcoqaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceElcoqaResponse> QueryPreformanceElcoqaAsync(QueryPreformanceElcoqaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceElcoqaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceElcoqaResponse QueryPreformanceElcoqaEx(QueryPreformanceElcoqaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceElcoqaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.elcoqa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceElcoqaResponse> QueryPreformanceElcoqaExAsync(QueryPreformanceElcoqaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceElcoqaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.elcoqa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSwzidtResponse QueryPreformanceSwzidt(QueryPreformanceSwzidtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSwzidtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSwzidtResponse> QueryPreformanceSwzidtAsync(QueryPreformanceSwzidtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSwzidtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSwzidtResponse QueryPreformanceSwzidtEx(QueryPreformanceSwzidtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSwzidtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.swzidt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSwzidtResponse> QueryPreformanceSwzidtExAsync(QueryPreformanceSwzidtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSwzidtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.swzidt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLepjayResponse QueryPreformanceLepjay(QueryPreformanceLepjayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLepjayEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLepjayResponse> QueryPreformanceLepjayAsync(QueryPreformanceLepjayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLepjayExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLepjayResponse QueryPreformanceLepjayEx(QueryPreformanceLepjayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLepjayResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.lepjay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLepjayResponse> QueryPreformanceLepjayExAsync(QueryPreformanceLepjayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLepjayResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.lepjay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWssfmiResponse QueryPreformanceWssfmi(QueryPreformanceWssfmiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceWssfmiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWssfmiResponse> QueryPreformanceWssfmiAsync(QueryPreformanceWssfmiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceWssfmiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWssfmiResponse QueryPreformanceWssfmiEx(QueryPreformanceWssfmiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWssfmiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.wssfmi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWssfmiResponse> QueryPreformanceWssfmiExAsync(QueryPreformanceWssfmiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWssfmiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.wssfmi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHiiibpResponse QueryPreformanceHiiibp(QueryPreformanceHiiibpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHiiibpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHiiibpResponse> QueryPreformanceHiiibpAsync(QueryPreformanceHiiibpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHiiibpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHiiibpResponse QueryPreformanceHiiibpEx(QueryPreformanceHiiibpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHiiibpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hiiibp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHiiibpResponse> QueryPreformanceHiiibpExAsync(QueryPreformanceHiiibpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHiiibpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hiiibp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIlsifvResponse QueryPreformanceIlsifv(QueryPreformanceIlsifvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIlsifvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIlsifvResponse> QueryPreformanceIlsifvAsync(QueryPreformanceIlsifvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIlsifvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIlsifvResponse QueryPreformanceIlsifvEx(QueryPreformanceIlsifvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIlsifvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ilsifv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIlsifvResponse> QueryPreformanceIlsifvExAsync(QueryPreformanceIlsifvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIlsifvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ilsifv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQrrdcgResponse QueryPreformanceQrrdcg(QueryPreformanceQrrdcgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQrrdcgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQrrdcgResponse> QueryPreformanceQrrdcgAsync(QueryPreformanceQrrdcgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQrrdcgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQrrdcgResponse QueryPreformanceQrrdcgEx(QueryPreformanceQrrdcgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQrrdcgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.qrrdcg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQrrdcgResponse> QueryPreformanceQrrdcgExAsync(QueryPreformanceQrrdcgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQrrdcgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.qrrdcg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOeffbqResponse QueryPreformanceOeffbq(QueryPreformanceOeffbqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceOeffbqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOeffbqResponse> QueryPreformanceOeffbqAsync(QueryPreformanceOeffbqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceOeffbqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOeffbqResponse QueryPreformanceOeffbqEx(QueryPreformanceOeffbqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOeffbqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.oeffbq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOeffbqResponse> QueryPreformanceOeffbqExAsync(QueryPreformanceOeffbqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOeffbqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.oeffbq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBfnylcResponse QueryPreformanceBfnylc(QueryPreformanceBfnylcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBfnylcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBfnylcResponse> QueryPreformanceBfnylcAsync(QueryPreformanceBfnylcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBfnylcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBfnylcResponse QueryPreformanceBfnylcEx(QueryPreformanceBfnylcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBfnylcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bfnylc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBfnylcResponse> QueryPreformanceBfnylcExAsync(QueryPreformanceBfnylcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBfnylcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bfnylc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKhmkcuResponse QueryPreformanceKhmkcu(QueryPreformanceKhmkcuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKhmkcuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKhmkcuResponse> QueryPreformanceKhmkcuAsync(QueryPreformanceKhmkcuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKhmkcuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKhmkcuResponse QueryPreformanceKhmkcuEx(QueryPreformanceKhmkcuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKhmkcuResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.khmkcu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKhmkcuResponse> QueryPreformanceKhmkcuExAsync(QueryPreformanceKhmkcuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKhmkcuResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.khmkcu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXahvpkResponse QueryPreformanceXahvpk(QueryPreformanceXahvpkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXahvpkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXahvpkResponse> QueryPreformanceXahvpkAsync(QueryPreformanceXahvpkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXahvpkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXahvpkResponse QueryPreformanceXahvpkEx(QueryPreformanceXahvpkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXahvpkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xahvpk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXahvpkResponse> QueryPreformanceXahvpkExAsync(QueryPreformanceXahvpkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXahvpkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xahvpk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePajjznResponse QueryPreformancePajjzn(QueryPreformancePajjznRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePajjznEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePajjznResponse> QueryPreformancePajjznAsync(QueryPreformancePajjznRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePajjznExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePajjznResponse QueryPreformancePajjznEx(QueryPreformancePajjznRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePajjznResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pajjzn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePajjznResponse> QueryPreformancePajjznExAsync(QueryPreformancePajjznRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePajjznResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pajjzn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLrwablResponse QueryPreformanceLrwabl(QueryPreformanceLrwablRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLrwablEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLrwablResponse> QueryPreformanceLrwablAsync(QueryPreformanceLrwablRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLrwablExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLrwablResponse QueryPreformanceLrwablEx(QueryPreformanceLrwablRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLrwablResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.lrwabl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLrwablResponse> QueryPreformanceLrwablExAsync(QueryPreformanceLrwablRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLrwablResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.lrwabl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQccygnResponse QueryPreformanceQccygn(QueryPreformanceQccygnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQccygnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQccygnResponse> QueryPreformanceQccygnAsync(QueryPreformanceQccygnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQccygnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQccygnResponse QueryPreformanceQccygnEx(QueryPreformanceQccygnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQccygnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.qccygn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQccygnResponse> QueryPreformanceQccygnExAsync(QueryPreformanceQccygnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQccygnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.qccygn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHtqkxtResponse QueryPreformanceHtqkxt(QueryPreformanceHtqkxtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHtqkxtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHtqkxtResponse> QueryPreformanceHtqkxtAsync(QueryPreformanceHtqkxtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHtqkxtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHtqkxtResponse QueryPreformanceHtqkxtEx(QueryPreformanceHtqkxtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHtqkxtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.htqkxt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHtqkxtResponse> QueryPreformanceHtqkxtExAsync(QueryPreformanceHtqkxtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHtqkxtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.htqkxt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMitdkqResponse QueryPreformanceMitdkq(QueryPreformanceMitdkqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMitdkqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMitdkqResponse> QueryPreformanceMitdkqAsync(QueryPreformanceMitdkqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMitdkqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMitdkqResponse QueryPreformanceMitdkqEx(QueryPreformanceMitdkqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMitdkqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mitdkq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMitdkqResponse> QueryPreformanceMitdkqExAsync(QueryPreformanceMitdkqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMitdkqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mitdkq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePrbsekResponse QueryPreformancePrbsek(QueryPreformancePrbsekRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePrbsekEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePrbsekResponse> QueryPreformancePrbsekAsync(QueryPreformancePrbsekRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePrbsekExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePrbsekResponse QueryPreformancePrbsekEx(QueryPreformancePrbsekRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePrbsekResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.prbsek.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePrbsekResponse> QueryPreformancePrbsekExAsync(QueryPreformancePrbsekRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePrbsekResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.prbsek.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVrqoxoResponse QueryPreformanceVrqoxo(QueryPreformanceVrqoxoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVrqoxoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVrqoxoResponse> QueryPreformanceVrqoxoAsync(QueryPreformanceVrqoxoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVrqoxoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVrqoxoResponse QueryPreformanceVrqoxoEx(QueryPreformanceVrqoxoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVrqoxoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vrqoxo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVrqoxoResponse> QueryPreformanceVrqoxoExAsync(QueryPreformanceVrqoxoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVrqoxoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vrqoxo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUcltcuResponse QueryPreformanceUcltcu(QueryPreformanceUcltcuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUcltcuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUcltcuResponse> QueryPreformanceUcltcuAsync(QueryPreformanceUcltcuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUcltcuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUcltcuResponse QueryPreformanceUcltcuEx(QueryPreformanceUcltcuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUcltcuResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ucltcu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUcltcuResponse> QueryPreformanceUcltcuExAsync(QueryPreformanceUcltcuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUcltcuResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ucltcu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMzmhjmResponse QueryPreformanceMzmhjm(QueryPreformanceMzmhjmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMzmhjmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMzmhjmResponse> QueryPreformanceMzmhjmAsync(QueryPreformanceMzmhjmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMzmhjmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMzmhjmResponse QueryPreformanceMzmhjmEx(QueryPreformanceMzmhjmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMzmhjmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mzmhjm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMzmhjmResponse> QueryPreformanceMzmhjmExAsync(QueryPreformanceMzmhjmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMzmhjmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mzmhjm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUgztluResponse QueryPreformanceUgztlu(QueryPreformanceUgztluRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUgztluEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUgztluResponse> QueryPreformanceUgztluAsync(QueryPreformanceUgztluRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUgztluExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUgztluResponse QueryPreformanceUgztluEx(QueryPreformanceUgztluRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUgztluResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ugztlu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUgztluResponse> QueryPreformanceUgztluExAsync(QueryPreformanceUgztluRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUgztluResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ugztlu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYkrosjResponse QueryPreformanceYkrosj(QueryPreformanceYkrosjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYkrosjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYkrosjResponse> QueryPreformanceYkrosjAsync(QueryPreformanceYkrosjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYkrosjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYkrosjResponse QueryPreformanceYkrosjEx(QueryPreformanceYkrosjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYkrosjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ykrosj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYkrosjResponse> QueryPreformanceYkrosjExAsync(QueryPreformanceYkrosjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYkrosjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ykrosj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGflgulResponse QueryPreformanceGflgul(QueryPreformanceGflgulRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGflgulEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGflgulResponse> QueryPreformanceGflgulAsync(QueryPreformanceGflgulRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGflgulExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGflgulResponse QueryPreformanceGflgulEx(QueryPreformanceGflgulRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGflgulResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gflgul.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGflgulResponse> QueryPreformanceGflgulExAsync(QueryPreformanceGflgulRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGflgulResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gflgul.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXwkppoResponse QueryPreformanceXwkppo(QueryPreformanceXwkppoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXwkppoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXwkppoResponse> QueryPreformanceXwkppoAsync(QueryPreformanceXwkppoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXwkppoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXwkppoResponse QueryPreformanceXwkppoEx(QueryPreformanceXwkppoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXwkppoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xwkppo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXwkppoResponse> QueryPreformanceXwkppoExAsync(QueryPreformanceXwkppoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXwkppoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xwkppo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVmvwlqResponse QueryPreformanceVmvwlq(QueryPreformanceVmvwlqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVmvwlqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVmvwlqResponse> QueryPreformanceVmvwlqAsync(QueryPreformanceVmvwlqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVmvwlqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVmvwlqResponse QueryPreformanceVmvwlqEx(QueryPreformanceVmvwlqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVmvwlqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vmvwlq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVmvwlqResponse> QueryPreformanceVmvwlqExAsync(QueryPreformanceVmvwlqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVmvwlqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vmvwlq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLeciagResponse QueryPreformanceLeciag(QueryPreformanceLeciagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLeciagEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLeciagResponse> QueryPreformanceLeciagAsync(QueryPreformanceLeciagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLeciagExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLeciagResponse QueryPreformanceLeciagEx(QueryPreformanceLeciagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLeciagResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.leciag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLeciagResponse> QueryPreformanceLeciagExAsync(QueryPreformanceLeciagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLeciagResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.leciag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYhfxnrResponse QueryPreformanceYhfxnr(QueryPreformanceYhfxnrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYhfxnrEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYhfxnrResponse> QueryPreformanceYhfxnrAsync(QueryPreformanceYhfxnrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYhfxnrExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYhfxnrResponse QueryPreformanceYhfxnrEx(QueryPreformanceYhfxnrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYhfxnrResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yhfxnr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYhfxnrResponse> QueryPreformanceYhfxnrExAsync(QueryPreformanceYhfxnrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYhfxnrResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yhfxnr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTmuqnsResponse QueryPreformanceTmuqns(QueryPreformanceTmuqnsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTmuqnsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTmuqnsResponse> QueryPreformanceTmuqnsAsync(QueryPreformanceTmuqnsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTmuqnsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTmuqnsResponse QueryPreformanceTmuqnsEx(QueryPreformanceTmuqnsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTmuqnsResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.tmuqns.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTmuqnsResponse> QueryPreformanceTmuqnsExAsync(QueryPreformanceTmuqnsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTmuqnsResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.tmuqns.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAzmyssResponse QueryPreformanceAzmyss(QueryPreformanceAzmyssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAzmyssEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAzmyssResponse> QueryPreformanceAzmyssAsync(QueryPreformanceAzmyssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAzmyssExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAzmyssResponse QueryPreformanceAzmyssEx(QueryPreformanceAzmyssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAzmyssResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.azmyss.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAzmyssResponse> QueryPreformanceAzmyssExAsync(QueryPreformanceAzmyssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAzmyssResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.azmyss.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXnkkmhResponse QueryPreformanceXnkkmh(QueryPreformanceXnkkmhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXnkkmhEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXnkkmhResponse> QueryPreformanceXnkkmhAsync(QueryPreformanceXnkkmhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXnkkmhExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXnkkmhResponse QueryPreformanceXnkkmhEx(QueryPreformanceXnkkmhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXnkkmhResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xnkkmh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXnkkmhResponse> QueryPreformanceXnkkmhExAsync(QueryPreformanceXnkkmhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXnkkmhResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xnkkmh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBngodmResponse QueryPreformanceBngodm(QueryPreformanceBngodmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBngodmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBngodmResponse> QueryPreformanceBngodmAsync(QueryPreformanceBngodmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBngodmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBngodmResponse QueryPreformanceBngodmEx(QueryPreformanceBngodmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBngodmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bngodm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBngodmResponse> QueryPreformanceBngodmExAsync(QueryPreformanceBngodmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBngodmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bngodm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTtvegrResponse QueryPreformanceTtvegr(QueryPreformanceTtvegrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTtvegrEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTtvegrResponse> QueryPreformanceTtvegrAsync(QueryPreformanceTtvegrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTtvegrExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTtvegrResponse QueryPreformanceTtvegrEx(QueryPreformanceTtvegrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTtvegrResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ttvegr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTtvegrResponse> QueryPreformanceTtvegrExAsync(QueryPreformanceTtvegrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTtvegrResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ttvegr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHaarbkResponse QueryPreformanceHaarbk(QueryPreformanceHaarbkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHaarbkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHaarbkResponse> QueryPreformanceHaarbkAsync(QueryPreformanceHaarbkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHaarbkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHaarbkResponse QueryPreformanceHaarbkEx(QueryPreformanceHaarbkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHaarbkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.haarbk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHaarbkResponse> QueryPreformanceHaarbkExAsync(QueryPreformanceHaarbkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHaarbkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.haarbk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOnualkResponse QueryPreformanceOnualk(QueryPreformanceOnualkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceOnualkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOnualkResponse> QueryPreformanceOnualkAsync(QueryPreformanceOnualkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceOnualkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOnualkResponse QueryPreformanceOnualkEx(QueryPreformanceOnualkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOnualkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.onualk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOnualkResponse> QueryPreformanceOnualkExAsync(QueryPreformanceOnualkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOnualkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.onualk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZrjcrwResponse QueryPreformanceZrjcrw(QueryPreformanceZrjcrwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZrjcrwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZrjcrwResponse> QueryPreformanceZrjcrwAsync(QueryPreformanceZrjcrwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZrjcrwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZrjcrwResponse QueryPreformanceZrjcrwEx(QueryPreformanceZrjcrwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZrjcrwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.zrjcrw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZrjcrwResponse> QueryPreformanceZrjcrwExAsync(QueryPreformanceZrjcrwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZrjcrwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.zrjcrw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBztkaaResponse QueryPreformanceBztkaa(QueryPreformanceBztkaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBztkaaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBztkaaResponse> QueryPreformanceBztkaaAsync(QueryPreformanceBztkaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBztkaaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBztkaaResponse QueryPreformanceBztkaaEx(QueryPreformanceBztkaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBztkaaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bztkaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBztkaaResponse> QueryPreformanceBztkaaExAsync(QueryPreformanceBztkaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBztkaaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bztkaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMtpvfgResponse QueryPreformanceMtpvfg(QueryPreformanceMtpvfgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMtpvfgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMtpvfgResponse> QueryPreformanceMtpvfgAsync(QueryPreformanceMtpvfgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMtpvfgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMtpvfgResponse QueryPreformanceMtpvfgEx(QueryPreformanceMtpvfgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMtpvfgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mtpvfg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMtpvfgResponse> QueryPreformanceMtpvfgExAsync(QueryPreformanceMtpvfgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMtpvfgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mtpvfg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTysxvoResponse QueryPreformanceTysxvo(QueryPreformanceTysxvoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTysxvoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTysxvoResponse> QueryPreformanceTysxvoAsync(QueryPreformanceTysxvoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTysxvoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTysxvoResponse QueryPreformanceTysxvoEx(QueryPreformanceTysxvoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTysxvoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.tysxvo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTysxvoResponse> QueryPreformanceTysxvoExAsync(QueryPreformanceTysxvoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTysxvoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.tysxvo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKmexgpResponse QueryPreformanceKmexgp(QueryPreformanceKmexgpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKmexgpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKmexgpResponse> QueryPreformanceKmexgpAsync(QueryPreformanceKmexgpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKmexgpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKmexgpResponse QueryPreformanceKmexgpEx(QueryPreformanceKmexgpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKmexgpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kmexgp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKmexgpResponse> QueryPreformanceKmexgpExAsync(QueryPreformanceKmexgpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKmexgpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kmexgp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePwqvffResponse QueryPreformancePwqvff(QueryPreformancePwqvffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePwqvffEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePwqvffResponse> QueryPreformancePwqvffAsync(QueryPreformancePwqvffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePwqvffExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePwqvffResponse QueryPreformancePwqvffEx(QueryPreformancePwqvffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePwqvffResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pwqvff.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePwqvffResponse> QueryPreformancePwqvffExAsync(QueryPreformancePwqvffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePwqvffResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pwqvff.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTuyazjResponse QueryPreformanceTuyazj(QueryPreformanceTuyazjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTuyazjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTuyazjResponse> QueryPreformanceTuyazjAsync(QueryPreformanceTuyazjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTuyazjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTuyazjResponse QueryPreformanceTuyazjEx(QueryPreformanceTuyazjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTuyazjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.tuyazj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTuyazjResponse> QueryPreformanceTuyazjExAsync(QueryPreformanceTuyazjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTuyazjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.tuyazj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSeidvgResponse QueryPreformanceSeidvg(QueryPreformanceSeidvgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSeidvgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSeidvgResponse> QueryPreformanceSeidvgAsync(QueryPreformanceSeidvgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSeidvgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSeidvgResponse QueryPreformanceSeidvgEx(QueryPreformanceSeidvgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSeidvgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.seidvg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSeidvgResponse> QueryPreformanceSeidvgExAsync(QueryPreformanceSeidvgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSeidvgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.seidvg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMbtpawResponse QueryPreformanceMbtpaw(QueryPreformanceMbtpawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMbtpawEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMbtpawResponse> QueryPreformanceMbtpawAsync(QueryPreformanceMbtpawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMbtpawExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMbtpawResponse QueryPreformanceMbtpawEx(QueryPreformanceMbtpawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMbtpawResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mbtpaw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMbtpawResponse> QueryPreformanceMbtpawExAsync(QueryPreformanceMbtpawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMbtpawResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mbtpaw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFxblowResponse QueryPreformanceFxblow(QueryPreformanceFxblowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFxblowEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFxblowResponse> QueryPreformanceFxblowAsync(QueryPreformanceFxblowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFxblowExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFxblowResponse QueryPreformanceFxblowEx(QueryPreformanceFxblowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFxblowResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.fxblow.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFxblowResponse> QueryPreformanceFxblowExAsync(QueryPreformanceFxblowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFxblowResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.fxblow.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAequnwResponse QueryPreformanceAequnw(QueryPreformanceAequnwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAequnwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAequnwResponse> QueryPreformanceAequnwAsync(QueryPreformanceAequnwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAequnwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAequnwResponse QueryPreformanceAequnwEx(QueryPreformanceAequnwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAequnwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.aequnw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAequnwResponse> QueryPreformanceAequnwExAsync(QueryPreformanceAequnwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAequnwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.aequnw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKksgngResponse QueryPreformanceKksgng(QueryPreformanceKksgngRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKksgngEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKksgngResponse> QueryPreformanceKksgngAsync(QueryPreformanceKksgngRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKksgngExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKksgngResponse QueryPreformanceKksgngEx(QueryPreformanceKksgngRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKksgngResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kksgng.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKksgngResponse> QueryPreformanceKksgngExAsync(QueryPreformanceKksgngRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKksgngResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kksgng.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEplydbResponse QueryPreformanceEplydb(QueryPreformanceEplydbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEplydbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEplydbResponse> QueryPreformanceEplydbAsync(QueryPreformanceEplydbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEplydbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEplydbResponse QueryPreformanceEplydbEx(QueryPreformanceEplydbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEplydbResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.eplydb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEplydbResponse> QueryPreformanceEplydbExAsync(QueryPreformanceEplydbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEplydbResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.eplydb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLkdxvsResponse QueryPreformanceLkdxvs(QueryPreformanceLkdxvsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLkdxvsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLkdxvsResponse> QueryPreformanceLkdxvsAsync(QueryPreformanceLkdxvsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLkdxvsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLkdxvsResponse QueryPreformanceLkdxvsEx(QueryPreformanceLkdxvsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLkdxvsResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.lkdxvs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLkdxvsResponse> QueryPreformanceLkdxvsExAsync(QueryPreformanceLkdxvsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLkdxvsResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.lkdxvs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePkwuzmResponse QueryPreformancePkwuzm(QueryPreformancePkwuzmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePkwuzmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePkwuzmResponse> QueryPreformancePkwuzmAsync(QueryPreformancePkwuzmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePkwuzmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePkwuzmResponse QueryPreformancePkwuzmEx(QueryPreformancePkwuzmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePkwuzmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pkwuzm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePkwuzmResponse> QueryPreformancePkwuzmExAsync(QueryPreformancePkwuzmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePkwuzmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pkwuzm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTgagmiResponse QueryPreformanceTgagmi(QueryPreformanceTgagmiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTgagmiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTgagmiResponse> QueryPreformanceTgagmiAsync(QueryPreformanceTgagmiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTgagmiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTgagmiResponse QueryPreformanceTgagmiEx(QueryPreformanceTgagmiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTgagmiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.tgagmi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTgagmiResponse> QueryPreformanceTgagmiExAsync(QueryPreformanceTgagmiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTgagmiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.tgagmi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDadqnvResponse QueryPreformanceDadqnv(QueryPreformanceDadqnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDadqnvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDadqnvResponse> QueryPreformanceDadqnvAsync(QueryPreformanceDadqnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDadqnvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDadqnvResponse QueryPreformanceDadqnvEx(QueryPreformanceDadqnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDadqnvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dadqnv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDadqnvResponse> QueryPreformanceDadqnvExAsync(QueryPreformanceDadqnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDadqnvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dadqnv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCfxhofResponse QueryPreformanceCfxhof(QueryPreformanceCfxhofRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceCfxhofEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCfxhofResponse> QueryPreformanceCfxhofAsync(QueryPreformanceCfxhofRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceCfxhofExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCfxhofResponse QueryPreformanceCfxhofEx(QueryPreformanceCfxhofRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCfxhofResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.cfxhof.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCfxhofResponse> QueryPreformanceCfxhofExAsync(QueryPreformanceCfxhofRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCfxhofResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.cfxhof.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFlukhlResponse QueryPreformanceFlukhl(QueryPreformanceFlukhlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFlukhlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFlukhlResponse> QueryPreformanceFlukhlAsync(QueryPreformanceFlukhlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFlukhlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFlukhlResponse QueryPreformanceFlukhlEx(QueryPreformanceFlukhlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFlukhlResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.flukhl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFlukhlResponse> QueryPreformanceFlukhlExAsync(QueryPreformanceFlukhlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFlukhlResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.flukhl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDuwewnResponse QueryPreformanceDuwewn(QueryPreformanceDuwewnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDuwewnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDuwewnResponse> QueryPreformanceDuwewnAsync(QueryPreformanceDuwewnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDuwewnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDuwewnResponse QueryPreformanceDuwewnEx(QueryPreformanceDuwewnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDuwewnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.duwewn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDuwewnResponse> QueryPreformanceDuwewnExAsync(QueryPreformanceDuwewnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDuwewnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.duwewn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJcgpsjResponse QueryPreformanceJcgpsj(QueryPreformanceJcgpsjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJcgpsjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJcgpsjResponse> QueryPreformanceJcgpsjAsync(QueryPreformanceJcgpsjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJcgpsjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJcgpsjResponse QueryPreformanceJcgpsjEx(QueryPreformanceJcgpsjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJcgpsjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jcgpsj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJcgpsjResponse> QueryPreformanceJcgpsjExAsync(QueryPreformanceJcgpsjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJcgpsjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jcgpsj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIeexfuResponse QueryPreformanceIeexfu(QueryPreformanceIeexfuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIeexfuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIeexfuResponse> QueryPreformanceIeexfuAsync(QueryPreformanceIeexfuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIeexfuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIeexfuResponse QueryPreformanceIeexfuEx(QueryPreformanceIeexfuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIeexfuResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ieexfu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIeexfuResponse> QueryPreformanceIeexfuExAsync(QueryPreformanceIeexfuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIeexfuResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ieexfu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGalthwResponse QueryPreformanceGalthw(QueryPreformanceGalthwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGalthwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGalthwResponse> QueryPreformanceGalthwAsync(QueryPreformanceGalthwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGalthwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGalthwResponse QueryPreformanceGalthwEx(QueryPreformanceGalthwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGalthwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.galthw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGalthwResponse> QueryPreformanceGalthwExAsync(QueryPreformanceGalthwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGalthwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.galthw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFnmdohResponse QueryPreformanceFnmdoh(QueryPreformanceFnmdohRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFnmdohEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFnmdohResponse> QueryPreformanceFnmdohAsync(QueryPreformanceFnmdohRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFnmdohExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFnmdohResponse QueryPreformanceFnmdohEx(QueryPreformanceFnmdohRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFnmdohResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.fnmdoh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFnmdohResponse> QueryPreformanceFnmdohExAsync(QueryPreformanceFnmdohRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFnmdohResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.fnmdoh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXngfdiResponse QueryPreformanceXngfdi(QueryPreformanceXngfdiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXngfdiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXngfdiResponse> QueryPreformanceXngfdiAsync(QueryPreformanceXngfdiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXngfdiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXngfdiResponse QueryPreformanceXngfdiEx(QueryPreformanceXngfdiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXngfdiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xngfdi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXngfdiResponse> QueryPreformanceXngfdiExAsync(QueryPreformanceXngfdiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXngfdiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xngfdi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHynnnnResponse QueryPreformanceHynnnn(QueryPreformanceHynnnnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHynnnnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHynnnnResponse> QueryPreformanceHynnnnAsync(QueryPreformanceHynnnnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHynnnnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHynnnnResponse QueryPreformanceHynnnnEx(QueryPreformanceHynnnnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHynnnnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hynnnn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHynnnnResponse> QueryPreformanceHynnnnExAsync(QueryPreformanceHynnnnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHynnnnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hynnnn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDyjtoyResponse QueryPreformanceDyjtoy(QueryPreformanceDyjtoyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDyjtoyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDyjtoyResponse> QueryPreformanceDyjtoyAsync(QueryPreformanceDyjtoyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDyjtoyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDyjtoyResponse QueryPreformanceDyjtoyEx(QueryPreformanceDyjtoyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDyjtoyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dyjtoy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDyjtoyResponse> QueryPreformanceDyjtoyExAsync(QueryPreformanceDyjtoyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDyjtoyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dyjtoy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWenfdhResponse QueryPreformanceWenfdh(QueryPreformanceWenfdhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceWenfdhEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWenfdhResponse> QueryPreformanceWenfdhAsync(QueryPreformanceWenfdhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceWenfdhExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWenfdhResponse QueryPreformanceWenfdhEx(QueryPreformanceWenfdhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWenfdhResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.wenfdh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWenfdhResponse> QueryPreformanceWenfdhExAsync(QueryPreformanceWenfdhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWenfdhResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.wenfdh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJrctdxResponse QueryPreformanceJrctdx(QueryPreformanceJrctdxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJrctdxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJrctdxResponse> QueryPreformanceJrctdxAsync(QueryPreformanceJrctdxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJrctdxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJrctdxResponse QueryPreformanceJrctdxEx(QueryPreformanceJrctdxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJrctdxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jrctdx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJrctdxResponse> QueryPreformanceJrctdxExAsync(QueryPreformanceJrctdxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJrctdxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jrctdx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDfdlkvResponse QueryPreformanceDfdlkv(QueryPreformanceDfdlkvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDfdlkvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDfdlkvResponse> QueryPreformanceDfdlkvAsync(QueryPreformanceDfdlkvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDfdlkvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDfdlkvResponse QueryPreformanceDfdlkvEx(QueryPreformanceDfdlkvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDfdlkvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dfdlkv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDfdlkvResponse> QueryPreformanceDfdlkvExAsync(QueryPreformanceDfdlkvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDfdlkvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dfdlkv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKnwgewResponse QueryPreformanceKnwgew(QueryPreformanceKnwgewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKnwgewEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKnwgewResponse> QueryPreformanceKnwgewAsync(QueryPreformanceKnwgewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKnwgewExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKnwgewResponse QueryPreformanceKnwgewEx(QueryPreformanceKnwgewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKnwgewResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.knwgew.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKnwgewResponse> QueryPreformanceKnwgewExAsync(QueryPreformanceKnwgewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKnwgewResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.knwgew.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceApifsyResponse QueryPreformanceApifsy(QueryPreformanceApifsyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceApifsyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceApifsyResponse> QueryPreformanceApifsyAsync(QueryPreformanceApifsyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceApifsyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceApifsyResponse QueryPreformanceApifsyEx(QueryPreformanceApifsyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceApifsyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.apifsy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceApifsyResponse> QueryPreformanceApifsyExAsync(QueryPreformanceApifsyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceApifsyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.apifsy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMjgxpvResponse QueryPreformanceMjgxpv(QueryPreformanceMjgxpvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMjgxpvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMjgxpvResponse> QueryPreformanceMjgxpvAsync(QueryPreformanceMjgxpvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMjgxpvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMjgxpvResponse QueryPreformanceMjgxpvEx(QueryPreformanceMjgxpvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMjgxpvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mjgxpv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMjgxpvResponse> QueryPreformanceMjgxpvExAsync(QueryPreformanceMjgxpvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMjgxpvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mjgxpv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAskegsResponse QueryPreformanceAskegs(QueryPreformanceAskegsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAskegsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAskegsResponse> QueryPreformanceAskegsAsync(QueryPreformanceAskegsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAskegsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAskegsResponse QueryPreformanceAskegsEx(QueryPreformanceAskegsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAskegsResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.askegs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAskegsResponse> QueryPreformanceAskegsExAsync(QueryPreformanceAskegsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAskegsResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.askegs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJajelfResponse QueryPreformanceJajelf(QueryPreformanceJajelfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJajelfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJajelfResponse> QueryPreformanceJajelfAsync(QueryPreformanceJajelfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJajelfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJajelfResponse QueryPreformanceJajelfEx(QueryPreformanceJajelfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJajelfResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jajelf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJajelfResponse> QueryPreformanceJajelfExAsync(QueryPreformanceJajelfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJajelfResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jajelf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKstsxlResponse QueryPreformanceKstsxl(QueryPreformanceKstsxlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKstsxlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKstsxlResponse> QueryPreformanceKstsxlAsync(QueryPreformanceKstsxlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKstsxlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKstsxlResponse QueryPreformanceKstsxlEx(QueryPreformanceKstsxlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKstsxlResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kstsxl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKstsxlResponse> QueryPreformanceKstsxlExAsync(QueryPreformanceKstsxlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKstsxlResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kstsxl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYihqycResponse QueryPreformanceYihqyc(QueryPreformanceYihqycRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYihqycEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYihqycResponse> QueryPreformanceYihqycAsync(QueryPreformanceYihqycRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYihqycExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYihqycResponse QueryPreformanceYihqycEx(QueryPreformanceYihqycRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYihqycResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yihqyc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYihqycResponse> QueryPreformanceYihqycExAsync(QueryPreformanceYihqycRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYihqycResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yihqyc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePaqvegResponse QueryPreformancePaqveg(QueryPreformancePaqvegRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePaqvegEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePaqvegResponse> QueryPreformancePaqvegAsync(QueryPreformancePaqvegRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePaqvegExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePaqvegResponse QueryPreformancePaqvegEx(QueryPreformancePaqvegRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePaqvegResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.paqveg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePaqvegResponse> QueryPreformancePaqvegExAsync(QueryPreformancePaqvegRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePaqvegResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.paqveg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVgtiiuResponse QueryPreformanceVgtiiu(QueryPreformanceVgtiiuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVgtiiuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVgtiiuResponse> QueryPreformanceVgtiiuAsync(QueryPreformanceVgtiiuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVgtiiuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVgtiiuResponse QueryPreformanceVgtiiuEx(QueryPreformanceVgtiiuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVgtiiuResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vgtiiu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVgtiiuResponse> QueryPreformanceVgtiiuExAsync(QueryPreformanceVgtiiuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVgtiiuResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vgtiiu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSdlanzResponse QueryPreformanceSdlanz(QueryPreformanceSdlanzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSdlanzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSdlanzResponse> QueryPreformanceSdlanzAsync(QueryPreformanceSdlanzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSdlanzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSdlanzResponse QueryPreformanceSdlanzEx(QueryPreformanceSdlanzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSdlanzResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.sdlanz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSdlanzResponse> QueryPreformanceSdlanzExAsync(QueryPreformanceSdlanzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSdlanzResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.sdlanz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKkxxkfResponse QueryPreformanceKkxxkf(QueryPreformanceKkxxkfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKkxxkfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKkxxkfResponse> QueryPreformanceKkxxkfAsync(QueryPreformanceKkxxkfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKkxxkfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKkxxkfResponse QueryPreformanceKkxxkfEx(QueryPreformanceKkxxkfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKkxxkfResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kkxxkf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKkxxkfResponse> QueryPreformanceKkxxkfExAsync(QueryPreformanceKkxxkfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKkxxkfResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kkxxkf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEglmkoResponse QueryPreformanceEglmko(QueryPreformanceEglmkoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEglmkoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEglmkoResponse> QueryPreformanceEglmkoAsync(QueryPreformanceEglmkoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEglmkoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEglmkoResponse QueryPreformanceEglmkoEx(QueryPreformanceEglmkoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEglmkoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.eglmko.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEglmkoResponse> QueryPreformanceEglmkoExAsync(QueryPreformanceEglmkoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEglmkoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.eglmko.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOquwumResponse QueryPreformanceOquwum(QueryPreformanceOquwumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceOquwumEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOquwumResponse> QueryPreformanceOquwumAsync(QueryPreformanceOquwumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceOquwumExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOquwumResponse QueryPreformanceOquwumEx(QueryPreformanceOquwumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOquwumResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.oquwum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOquwumResponse> QueryPreformanceOquwumExAsync(QueryPreformanceOquwumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOquwumResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.oquwum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGsnlkhResponse QueryPreformanceGsnlkh(QueryPreformanceGsnlkhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGsnlkhEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGsnlkhResponse> QueryPreformanceGsnlkhAsync(QueryPreformanceGsnlkhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGsnlkhExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGsnlkhResponse QueryPreformanceGsnlkhEx(QueryPreformanceGsnlkhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGsnlkhResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gsnlkh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGsnlkhResponse> QueryPreformanceGsnlkhExAsync(QueryPreformanceGsnlkhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGsnlkhResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gsnlkh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOjswwdResponse QueryPreformanceOjswwd(QueryPreformanceOjswwdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceOjswwdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOjswwdResponse> QueryPreformanceOjswwdAsync(QueryPreformanceOjswwdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceOjswwdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOjswwdResponse QueryPreformanceOjswwdEx(QueryPreformanceOjswwdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOjswwdResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ojswwd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOjswwdResponse> QueryPreformanceOjswwdExAsync(QueryPreformanceOjswwdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOjswwdResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ojswwd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLmpubpResponse QueryPreformanceLmpubp(QueryPreformanceLmpubpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLmpubpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLmpubpResponse> QueryPreformanceLmpubpAsync(QueryPreformanceLmpubpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLmpubpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLmpubpResponse QueryPreformanceLmpubpEx(QueryPreformanceLmpubpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLmpubpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.lmpubp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLmpubpResponse> QueryPreformanceLmpubpExAsync(QueryPreformanceLmpubpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLmpubpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.lmpubp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMvjqpqResponse QueryPreformanceMvjqpq(QueryPreformanceMvjqpqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMvjqpqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMvjqpqResponse> QueryPreformanceMvjqpqAsync(QueryPreformanceMvjqpqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMvjqpqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMvjqpqResponse QueryPreformanceMvjqpqEx(QueryPreformanceMvjqpqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMvjqpqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mvjqpq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMvjqpqResponse> QueryPreformanceMvjqpqExAsync(QueryPreformanceMvjqpqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMvjqpqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mvjqpq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUpavrgResponse QueryPreformanceUpavrg(QueryPreformanceUpavrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUpavrgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUpavrgResponse> QueryPreformanceUpavrgAsync(QueryPreformanceUpavrgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUpavrgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUpavrgResponse QueryPreformanceUpavrgEx(QueryPreformanceUpavrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUpavrgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.upavrg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUpavrgResponse> QueryPreformanceUpavrgExAsync(QueryPreformanceUpavrgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUpavrgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.upavrg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHovxvtResponse QueryPreformanceHovxvt(QueryPreformanceHovxvtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHovxvtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHovxvtResponse> QueryPreformanceHovxvtAsync(QueryPreformanceHovxvtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHovxvtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHovxvtResponse QueryPreformanceHovxvtEx(QueryPreformanceHovxvtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHovxvtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hovxvt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHovxvtResponse> QueryPreformanceHovxvtExAsync(QueryPreformanceHovxvtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHovxvtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hovxvt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLpgyzxResponse QueryPreformanceLpgyzx(QueryPreformanceLpgyzxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLpgyzxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLpgyzxResponse> QueryPreformanceLpgyzxAsync(QueryPreformanceLpgyzxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLpgyzxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLpgyzxResponse QueryPreformanceLpgyzxEx(QueryPreformanceLpgyzxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLpgyzxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.lpgyzx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLpgyzxResponse> QueryPreformanceLpgyzxExAsync(QueryPreformanceLpgyzxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLpgyzxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.lpgyzx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePhleouResponse QueryPreformancePhleou(QueryPreformancePhleouRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePhleouEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePhleouResponse> QueryPreformancePhleouAsync(QueryPreformancePhleouRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePhleouExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePhleouResponse QueryPreformancePhleouEx(QueryPreformancePhleouRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePhleouResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.phleou.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePhleouResponse> QueryPreformancePhleouExAsync(QueryPreformancePhleouRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePhleouResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.phleou.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEzhhniResponse QueryPreformanceEzhhni(QueryPreformanceEzhhniRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEzhhniEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEzhhniResponse> QueryPreformanceEzhhniAsync(QueryPreformanceEzhhniRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEzhhniExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEzhhniResponse QueryPreformanceEzhhniEx(QueryPreformanceEzhhniRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEzhhniResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ezhhni.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEzhhniResponse> QueryPreformanceEzhhniExAsync(QueryPreformanceEzhhniRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEzhhniResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ezhhni.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVmkggaResponse QueryPreformanceVmkgga(QueryPreformanceVmkggaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVmkggaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVmkggaResponse> QueryPreformanceVmkggaAsync(QueryPreformanceVmkggaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVmkggaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVmkggaResponse QueryPreformanceVmkggaEx(QueryPreformanceVmkggaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVmkggaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vmkgga.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVmkggaResponse> QueryPreformanceVmkggaExAsync(QueryPreformanceVmkggaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVmkggaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vmkgga.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSbsurxResponse QueryPreformanceSbsurx(QueryPreformanceSbsurxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSbsurxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSbsurxResponse> QueryPreformanceSbsurxAsync(QueryPreformanceSbsurxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSbsurxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSbsurxResponse QueryPreformanceSbsurxEx(QueryPreformanceSbsurxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSbsurxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.sbsurx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSbsurxResponse> QueryPreformanceSbsurxExAsync(QueryPreformanceSbsurxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSbsurxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.sbsurx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGxqzrqResponse QueryPreformanceGxqzrq(QueryPreformanceGxqzrqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGxqzrqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGxqzrqResponse> QueryPreformanceGxqzrqAsync(QueryPreformanceGxqzrqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGxqzrqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGxqzrqResponse QueryPreformanceGxqzrqEx(QueryPreformanceGxqzrqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGxqzrqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gxqzrq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGxqzrqResponse> QueryPreformanceGxqzrqExAsync(QueryPreformanceGxqzrqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGxqzrqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gxqzrq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHvgdsqResponse QueryPreformanceHvgdsq(QueryPreformanceHvgdsqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHvgdsqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHvgdsqResponse> QueryPreformanceHvgdsqAsync(QueryPreformanceHvgdsqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHvgdsqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHvgdsqResponse QueryPreformanceHvgdsqEx(QueryPreformanceHvgdsqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHvgdsqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hvgdsq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHvgdsqResponse> QueryPreformanceHvgdsqExAsync(QueryPreformanceHvgdsqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHvgdsqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hvgdsq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKatrmiResponse QueryPreformanceKatrmi(QueryPreformanceKatrmiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKatrmiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKatrmiResponse> QueryPreformanceKatrmiAsync(QueryPreformanceKatrmiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKatrmiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKatrmiResponse QueryPreformanceKatrmiEx(QueryPreformanceKatrmiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKatrmiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.katrmi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKatrmiResponse> QueryPreformanceKatrmiExAsync(QueryPreformanceKatrmiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKatrmiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.katrmi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRdkcqdResponse QueryPreformanceRdkcqd(QueryPreformanceRdkcqdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceRdkcqdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRdkcqdResponse> QueryPreformanceRdkcqdAsync(QueryPreformanceRdkcqdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceRdkcqdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRdkcqdResponse QueryPreformanceRdkcqdEx(QueryPreformanceRdkcqdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRdkcqdResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.rdkcqd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRdkcqdResponse> QueryPreformanceRdkcqdExAsync(QueryPreformanceRdkcqdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRdkcqdResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.rdkcqd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYdpsaoResponse QueryPreformanceYdpsao(QueryPreformanceYdpsaoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYdpsaoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYdpsaoResponse> QueryPreformanceYdpsaoAsync(QueryPreformanceYdpsaoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYdpsaoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYdpsaoResponse QueryPreformanceYdpsaoEx(QueryPreformanceYdpsaoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYdpsaoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ydpsao.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYdpsaoResponse> QueryPreformanceYdpsaoExAsync(QueryPreformanceYdpsaoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYdpsaoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ydpsao.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFbqfgdResponse QueryPreformanceFbqfgd(QueryPreformanceFbqfgdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFbqfgdEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFbqfgdResponse> QueryPreformanceFbqfgdAsync(QueryPreformanceFbqfgdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFbqfgdExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFbqfgdResponse QueryPreformanceFbqfgdEx(QueryPreformanceFbqfgdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFbqfgdResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.fbqfgd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFbqfgdResponse> QueryPreformanceFbqfgdExAsync(QueryPreformanceFbqfgdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFbqfgdResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.fbqfgd.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVyqznvResponse QueryPreformanceVyqznv(QueryPreformanceVyqznvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVyqznvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVyqznvResponse> QueryPreformanceVyqznvAsync(QueryPreformanceVyqznvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVyqznvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVyqznvResponse QueryPreformanceVyqznvEx(QueryPreformanceVyqznvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVyqznvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vyqznv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVyqznvResponse> QueryPreformanceVyqznvExAsync(QueryPreformanceVyqznvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVyqznvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vyqznv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIwhkbpResponse QueryPreformanceIwhkbp(QueryPreformanceIwhkbpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIwhkbpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIwhkbpResponse> QueryPreformanceIwhkbpAsync(QueryPreformanceIwhkbpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIwhkbpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIwhkbpResponse QueryPreformanceIwhkbpEx(QueryPreformanceIwhkbpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIwhkbpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.iwhkbp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIwhkbpResponse> QueryPreformanceIwhkbpExAsync(QueryPreformanceIwhkbpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIwhkbpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.iwhkbp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGcavtcResponse QueryPreformanceGcavtc(QueryPreformanceGcavtcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGcavtcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGcavtcResponse> QueryPreformanceGcavtcAsync(QueryPreformanceGcavtcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGcavtcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGcavtcResponse QueryPreformanceGcavtcEx(QueryPreformanceGcavtcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGcavtcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gcavtc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGcavtcResponse> QueryPreformanceGcavtcExAsync(QueryPreformanceGcavtcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGcavtcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gcavtc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEigmbuResponse QueryPreformanceEigmbu(QueryPreformanceEigmbuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEigmbuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEigmbuResponse> QueryPreformanceEigmbuAsync(QueryPreformanceEigmbuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEigmbuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEigmbuResponse QueryPreformanceEigmbuEx(QueryPreformanceEigmbuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEigmbuResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.eigmbu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEigmbuResponse> QueryPreformanceEigmbuExAsync(QueryPreformanceEigmbuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEigmbuResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.eigmbu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNsxzrqResponse QueryPreformanceNsxzrq(QueryPreformanceNsxzrqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceNsxzrqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNsxzrqResponse> QueryPreformanceNsxzrqAsync(QueryPreformanceNsxzrqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceNsxzrqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNsxzrqResponse QueryPreformanceNsxzrqEx(QueryPreformanceNsxzrqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNsxzrqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.nsxzrq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNsxzrqResponse> QueryPreformanceNsxzrqExAsync(QueryPreformanceNsxzrqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNsxzrqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.nsxzrq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHzlepwResponse QueryPreformanceHzlepw(QueryPreformanceHzlepwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHzlepwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHzlepwResponse> QueryPreformanceHzlepwAsync(QueryPreformanceHzlepwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHzlepwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHzlepwResponse QueryPreformanceHzlepwEx(QueryPreformanceHzlepwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHzlepwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hzlepw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHzlepwResponse> QueryPreformanceHzlepwExAsync(QueryPreformanceHzlepwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHzlepwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hzlepw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUpoctvResponse QueryPreformanceUpoctv(QueryPreformanceUpoctvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUpoctvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUpoctvResponse> QueryPreformanceUpoctvAsync(QueryPreformanceUpoctvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUpoctvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUpoctvResponse QueryPreformanceUpoctvEx(QueryPreformanceUpoctvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUpoctvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.upoctv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUpoctvResponse> QueryPreformanceUpoctvExAsync(QueryPreformanceUpoctvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUpoctvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.upoctv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePdyotjResponse QueryPreformancePdyotj(QueryPreformancePdyotjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePdyotjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePdyotjResponse> QueryPreformancePdyotjAsync(QueryPreformancePdyotjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePdyotjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePdyotjResponse QueryPreformancePdyotjEx(QueryPreformancePdyotjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePdyotjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pdyotj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePdyotjResponse> QueryPreformancePdyotjExAsync(QueryPreformancePdyotjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePdyotjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pdyotj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQfhcuyResponse QueryPreformanceQfhcuy(QueryPreformanceQfhcuyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQfhcuyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQfhcuyResponse> QueryPreformanceQfhcuyAsync(QueryPreformanceQfhcuyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQfhcuyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQfhcuyResponse QueryPreformanceQfhcuyEx(QueryPreformanceQfhcuyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQfhcuyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.qfhcuy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQfhcuyResponse> QueryPreformanceQfhcuyExAsync(QueryPreformanceQfhcuyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQfhcuyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.qfhcuy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJuynknResponse QueryPreformanceJuynkn(QueryPreformanceJuynknRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJuynknEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJuynknResponse> QueryPreformanceJuynknAsync(QueryPreformanceJuynknRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJuynknExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJuynknResponse QueryPreformanceJuynknEx(QueryPreformanceJuynknRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJuynknResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.juynkn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJuynknResponse> QueryPreformanceJuynknExAsync(QueryPreformanceJuynknRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJuynknResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.juynkn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTxdmeoResponse QueryPreformanceTxdmeo(QueryPreformanceTxdmeoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTxdmeoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTxdmeoResponse> QueryPreformanceTxdmeoAsync(QueryPreformanceTxdmeoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTxdmeoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTxdmeoResponse QueryPreformanceTxdmeoEx(QueryPreformanceTxdmeoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTxdmeoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.txdmeo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTxdmeoResponse> QueryPreformanceTxdmeoExAsync(QueryPreformanceTxdmeoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTxdmeoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.txdmeo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKcjxngResponse QueryPreformanceKcjxng(QueryPreformanceKcjxngRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceKcjxngEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKcjxngResponse> QueryPreformanceKcjxngAsync(QueryPreformanceKcjxngRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceKcjxngExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceKcjxngResponse QueryPreformanceKcjxngEx(QueryPreformanceKcjxngRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKcjxngResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.kcjxng.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceKcjxngResponse> QueryPreformanceKcjxngExAsync(QueryPreformanceKcjxngRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceKcjxngResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.kcjxng.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXyfytzResponse QueryPreformanceXyfytz(QueryPreformanceXyfytzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXyfytzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXyfytzResponse> QueryPreformanceXyfytzAsync(QueryPreformanceXyfytzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXyfytzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXyfytzResponse QueryPreformanceXyfytzEx(QueryPreformanceXyfytzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXyfytzResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xyfytz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXyfytzResponse> QueryPreformanceXyfytzExAsync(QueryPreformanceXyfytzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXyfytzResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xyfytz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHxmzyiResponse QueryPreformanceHxmzyi(QueryPreformanceHxmzyiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHxmzyiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHxmzyiResponse> QueryPreformanceHxmzyiAsync(QueryPreformanceHxmzyiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHxmzyiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHxmzyiResponse QueryPreformanceHxmzyiEx(QueryPreformanceHxmzyiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHxmzyiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hxmzyi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHxmzyiResponse> QueryPreformanceHxmzyiExAsync(QueryPreformanceHxmzyiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHxmzyiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hxmzyi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSxdzlbResponse QueryPreformanceSxdzlb(QueryPreformanceSxdzlbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSxdzlbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSxdzlbResponse> QueryPreformanceSxdzlbAsync(QueryPreformanceSxdzlbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSxdzlbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSxdzlbResponse QueryPreformanceSxdzlbEx(QueryPreformanceSxdzlbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSxdzlbResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.sxdzlb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSxdzlbResponse> QueryPreformanceSxdzlbExAsync(QueryPreformanceSxdzlbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSxdzlbResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.sxdzlb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZmuzkgResponse QueryPreformanceZmuzkg(QueryPreformanceZmuzkgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZmuzkgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZmuzkgResponse> QueryPreformanceZmuzkgAsync(QueryPreformanceZmuzkgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZmuzkgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZmuzkgResponse QueryPreformanceZmuzkgEx(QueryPreformanceZmuzkgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZmuzkgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.zmuzkg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZmuzkgResponse> QueryPreformanceZmuzkgExAsync(QueryPreformanceZmuzkgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZmuzkgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.zmuzkg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAiojyzResponse QueryPreformanceAiojyz(QueryPreformanceAiojyzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAiojyzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAiojyzResponse> QueryPreformanceAiojyzAsync(QueryPreformanceAiojyzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAiojyzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAiojyzResponse QueryPreformanceAiojyzEx(QueryPreformanceAiojyzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAiojyzResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.aiojyz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAiojyzResponse> QueryPreformanceAiojyzExAsync(QueryPreformanceAiojyzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAiojyzResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.aiojyz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQxhgmlResponse QueryPreformanceQxhgml(QueryPreformanceQxhgmlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceQxhgmlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQxhgmlResponse> QueryPreformanceQxhgmlAsync(QueryPreformanceQxhgmlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceQxhgmlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceQxhgmlResponse QueryPreformanceQxhgmlEx(QueryPreformanceQxhgmlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQxhgmlResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.qxhgml.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceQxhgmlResponse> QueryPreformanceQxhgmlExAsync(QueryPreformanceQxhgmlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceQxhgmlResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.qxhgml.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUbklssResponse QueryPreformanceUbklss(QueryPreformanceUbklssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUbklssEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUbklssResponse> QueryPreformanceUbklssAsync(QueryPreformanceUbklssRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUbklssExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUbklssResponse QueryPreformanceUbklssEx(QueryPreformanceUbklssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUbklssResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ubklss.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUbklssResponse> QueryPreformanceUbklssExAsync(QueryPreformanceUbklssRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUbklssResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ubklss.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGcavnvResponse QueryPreformanceGcavnv(QueryPreformanceGcavnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGcavnvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGcavnvResponse> QueryPreformanceGcavnvAsync(QueryPreformanceGcavnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGcavnvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGcavnvResponse QueryPreformanceGcavnvEx(QueryPreformanceGcavnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGcavnvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gcavnv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGcavnvResponse> QueryPreformanceGcavnvExAsync(QueryPreformanceGcavnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGcavnvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gcavnv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUcybsnResponse QueryPreformanceUcybsn(QueryPreformanceUcybsnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUcybsnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUcybsnResponse> QueryPreformanceUcybsnAsync(QueryPreformanceUcybsnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUcybsnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUcybsnResponse QueryPreformanceUcybsnEx(QueryPreformanceUcybsnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUcybsnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ucybsn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUcybsnResponse> QueryPreformanceUcybsnExAsync(QueryPreformanceUcybsnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUcybsnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ucybsn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAzwtosResponse QueryPreformanceAzwtos(QueryPreformanceAzwtosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAzwtosEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAzwtosResponse> QueryPreformanceAzwtosAsync(QueryPreformanceAzwtosRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAzwtosExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAzwtosResponse QueryPreformanceAzwtosEx(QueryPreformanceAzwtosRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAzwtosResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.azwtos.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAzwtosResponse> QueryPreformanceAzwtosExAsync(QueryPreformanceAzwtosRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAzwtosResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.azwtos.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWrbbytResponse QueryPreformanceWrbbyt(QueryPreformanceWrbbytRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceWrbbytEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWrbbytResponse> QueryPreformanceWrbbytAsync(QueryPreformanceWrbbytRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceWrbbytExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWrbbytResponse QueryPreformanceWrbbytEx(QueryPreformanceWrbbytRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWrbbytResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.wrbbyt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWrbbytResponse> QueryPreformanceWrbbytExAsync(QueryPreformanceWrbbytRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWrbbytResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.wrbbyt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIvbcwvResponse QueryPreformanceIvbcwv(QueryPreformanceIvbcwvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIvbcwvEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIvbcwvResponse> QueryPreformanceIvbcwvAsync(QueryPreformanceIvbcwvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIvbcwvExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIvbcwvResponse QueryPreformanceIvbcwvEx(QueryPreformanceIvbcwvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIvbcwvResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ivbcwv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIvbcwvResponse> QueryPreformanceIvbcwvExAsync(QueryPreformanceIvbcwvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIvbcwvResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ivbcwv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTvcsigResponse QueryPreformanceTvcsig(QueryPreformanceTvcsigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceTvcsigEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTvcsigResponse> QueryPreformanceTvcsigAsync(QueryPreformanceTvcsigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceTvcsigExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceTvcsigResponse QueryPreformanceTvcsigEx(QueryPreformanceTvcsigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTvcsigResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.tvcsig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceTvcsigResponse> QueryPreformanceTvcsigExAsync(QueryPreformanceTvcsigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceTvcsigResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.tvcsig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVvsvkxResponse QueryPreformanceVvsvkx(QueryPreformanceVvsvkxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVvsvkxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVvsvkxResponse> QueryPreformanceVvsvkxAsync(QueryPreformanceVvsvkxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVvsvkxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVvsvkxResponse QueryPreformanceVvsvkxEx(QueryPreformanceVvsvkxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVvsvkxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vvsvkx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVvsvkxResponse> QueryPreformanceVvsvkxExAsync(QueryPreformanceVvsvkxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVvsvkxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vvsvkx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRxetnjResponse QueryPreformanceRxetnj(QueryPreformanceRxetnjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceRxetnjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRxetnjResponse> QueryPreformanceRxetnjAsync(QueryPreformanceRxetnjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceRxetnjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRxetnjResponse QueryPreformanceRxetnjEx(QueryPreformanceRxetnjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRxetnjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.rxetnj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRxetnjResponse> QueryPreformanceRxetnjExAsync(QueryPreformanceRxetnjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRxetnjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.rxetnj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDulefcResponse QueryPreformanceDulefc(QueryPreformanceDulefcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDulefcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDulefcResponse> QueryPreformanceDulefcAsync(QueryPreformanceDulefcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDulefcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDulefcResponse QueryPreformanceDulefcEx(QueryPreformanceDulefcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDulefcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dulefc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDulefcResponse> QueryPreformanceDulefcExAsync(QueryPreformanceDulefcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDulefcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dulefc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJsazbwResponse QueryPreformanceJsazbw(QueryPreformanceJsazbwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJsazbwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJsazbwResponse> QueryPreformanceJsazbwAsync(QueryPreformanceJsazbwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJsazbwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJsazbwResponse QueryPreformanceJsazbwEx(QueryPreformanceJsazbwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJsazbwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jsazbw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJsazbwResponse> QueryPreformanceJsazbwExAsync(QueryPreformanceJsazbwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJsazbwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jsazbw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXhzfcaResponse QueryPreformanceXhzfca(QueryPreformanceXhzfcaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXhzfcaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXhzfcaResponse> QueryPreformanceXhzfcaAsync(QueryPreformanceXhzfcaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXhzfcaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXhzfcaResponse QueryPreformanceXhzfcaEx(QueryPreformanceXhzfcaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXhzfcaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xhzfca.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXhzfcaResponse> QueryPreformanceXhzfcaExAsync(QueryPreformanceXhzfcaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXhzfcaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xhzfca.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDgzghrResponse QueryPreformanceDgzghr(QueryPreformanceDgzghrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDgzghrEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDgzghrResponse> QueryPreformanceDgzghrAsync(QueryPreformanceDgzghrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDgzghrExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDgzghrResponse QueryPreformanceDgzghrEx(QueryPreformanceDgzghrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDgzghrResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dgzghr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDgzghrResponse> QueryPreformanceDgzghrExAsync(QueryPreformanceDgzghrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDgzghrResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dgzghr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDmjttzResponse QueryPreformanceDmjttz(QueryPreformanceDmjttzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDmjttzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDmjttzResponse> QueryPreformanceDmjttzAsync(QueryPreformanceDmjttzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDmjttzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDmjttzResponse QueryPreformanceDmjttzEx(QueryPreformanceDmjttzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDmjttzResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dmjttz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDmjttzResponse> QueryPreformanceDmjttzExAsync(QueryPreformanceDmjttzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDmjttzResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dmjttz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCahjgjResponse QueryPreformanceCahjgj(QueryPreformanceCahjgjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceCahjgjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCahjgjResponse> QueryPreformanceCahjgjAsync(QueryPreformanceCahjgjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceCahjgjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCahjgjResponse QueryPreformanceCahjgjEx(QueryPreformanceCahjgjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCahjgjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.cahjgj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCahjgjResponse> QueryPreformanceCahjgjExAsync(QueryPreformanceCahjgjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCahjgjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.cahjgj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRjbfvtResponse QueryPreformanceRjbfvt(QueryPreformanceRjbfvtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceRjbfvtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRjbfvtResponse> QueryPreformanceRjbfvtAsync(QueryPreformanceRjbfvtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceRjbfvtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRjbfvtResponse QueryPreformanceRjbfvtEx(QueryPreformanceRjbfvtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRjbfvtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.rjbfvt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRjbfvtResponse> QueryPreformanceRjbfvtExAsync(QueryPreformanceRjbfvtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRjbfvtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.rjbfvt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAywijlResponse QueryPreformanceAywijl(QueryPreformanceAywijlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAywijlEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAywijlResponse> QueryPreformanceAywijlAsync(QueryPreformanceAywijlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAywijlExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAywijlResponse QueryPreformanceAywijlEx(QueryPreformanceAywijlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAywijlResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.aywijl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAywijlResponse> QueryPreformanceAywijlExAsync(QueryPreformanceAywijlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAywijlResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.aywijl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBcjihiResponse QueryPreformanceBcjihi(QueryPreformanceBcjihiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceBcjihiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBcjihiResponse> QueryPreformanceBcjihiAsync(QueryPreformanceBcjihiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceBcjihiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceBcjihiResponse QueryPreformanceBcjihiEx(QueryPreformanceBcjihiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBcjihiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.bcjihi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceBcjihiResponse> QueryPreformanceBcjihiExAsync(QueryPreformanceBcjihiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceBcjihiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.bcjihi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVewdbwResponse QueryPreformanceVewdbw(QueryPreformanceVewdbwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVewdbwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVewdbwResponse> QueryPreformanceVewdbwAsync(QueryPreformanceVewdbwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVewdbwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVewdbwResponse QueryPreformanceVewdbwEx(QueryPreformanceVewdbwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVewdbwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vewdbw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVewdbwResponse> QueryPreformanceVewdbwExAsync(QueryPreformanceVewdbwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVewdbwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vewdbw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWgbntjResponse QueryPreformanceWgbntj(QueryPreformanceWgbntjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceWgbntjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWgbntjResponse> QueryPreformanceWgbntjAsync(QueryPreformanceWgbntjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceWgbntjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWgbntjResponse QueryPreformanceWgbntjEx(QueryPreformanceWgbntjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWgbntjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.wgbntj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWgbntjResponse> QueryPreformanceWgbntjExAsync(QueryPreformanceWgbntjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWgbntjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.wgbntj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDwzzxqResponse QueryPreformanceDwzzxq(QueryPreformanceDwzzxqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceDwzzxqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDwzzxqResponse> QueryPreformanceDwzzxqAsync(QueryPreformanceDwzzxqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceDwzzxqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceDwzzxqResponse QueryPreformanceDwzzxqEx(QueryPreformanceDwzzxqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDwzzxqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.dwzzxq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceDwzzxqResponse> QueryPreformanceDwzzxqExAsync(QueryPreformanceDwzzxqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceDwzzxqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.dwzzxq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMhldihResponse QueryPreformanceMhldih(QueryPreformanceMhldihRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMhldihEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMhldihResponse> QueryPreformanceMhldihAsync(QueryPreformanceMhldihRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMhldihExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMhldihResponse QueryPreformanceMhldihEx(QueryPreformanceMhldihRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMhldihResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mhldih.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMhldihResponse> QueryPreformanceMhldihExAsync(QueryPreformanceMhldihRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMhldihResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mhldih.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUtiveiResponse QueryPreformanceUtivei(QueryPreformanceUtiveiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUtiveiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUtiveiResponse> QueryPreformanceUtiveiAsync(QueryPreformanceUtiveiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUtiveiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUtiveiResponse QueryPreformanceUtiveiEx(QueryPreformanceUtiveiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUtiveiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.utivei.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUtiveiResponse> QueryPreformanceUtiveiExAsync(QueryPreformanceUtiveiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUtiveiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.utivei.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePrgtxgResponse QueryPreformancePrgtxg(QueryPreformancePrgtxgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePrgtxgEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePrgtxgResponse> QueryPreformancePrgtxgAsync(QueryPreformancePrgtxgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePrgtxgExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePrgtxgResponse QueryPreformancePrgtxgEx(QueryPreformancePrgtxgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePrgtxgResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.prgtxg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePrgtxgResponse> QueryPreformancePrgtxgExAsync(QueryPreformancePrgtxgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePrgtxgResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.prgtxg.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXezxoyResponse QueryPreformanceXezxoy(QueryPreformanceXezxoyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXezxoyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXezxoyResponse> QueryPreformanceXezxoyAsync(QueryPreformanceXezxoyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXezxoyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXezxoyResponse QueryPreformanceXezxoyEx(QueryPreformanceXezxoyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXezxoyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xezxoy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXezxoyResponse> QueryPreformanceXezxoyExAsync(QueryPreformanceXezxoyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXezxoyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xezxoy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceChnteuResponse QueryPreformanceChnteu(QueryPreformanceChnteuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceChnteuEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceChnteuResponse> QueryPreformanceChnteuAsync(QueryPreformanceChnteuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceChnteuExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceChnteuResponse QueryPreformanceChnteuEx(QueryPreformanceChnteuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceChnteuResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.chnteu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceChnteuResponse> QueryPreformanceChnteuExAsync(QueryPreformanceChnteuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceChnteuResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.chnteu.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGzbbbcResponse QueryPreformanceGzbbbc(QueryPreformanceGzbbbcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGzbbbcEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGzbbbcResponse> QueryPreformanceGzbbbcAsync(QueryPreformanceGzbbbcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGzbbbcExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGzbbbcResponse QueryPreformanceGzbbbcEx(QueryPreformanceGzbbbcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGzbbbcResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gzbbbc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGzbbbcResponse> QueryPreformanceGzbbbcExAsync(QueryPreformanceGzbbbcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGzbbbcResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gzbbbc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEdwgsrResponse QueryPreformanceEdwgsr(QueryPreformanceEdwgsrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEdwgsrEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEdwgsrResponse> QueryPreformanceEdwgsrAsync(QueryPreformanceEdwgsrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEdwgsrExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEdwgsrResponse QueryPreformanceEdwgsrEx(QueryPreformanceEdwgsrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEdwgsrResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.edwgsr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEdwgsrResponse> QueryPreformanceEdwgsrExAsync(QueryPreformanceEdwgsrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEdwgsrResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.edwgsr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEdmasfResponse QueryPreformanceEdmasf(QueryPreformanceEdmasfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEdmasfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEdmasfResponse> QueryPreformanceEdmasfAsync(QueryPreformanceEdmasfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEdmasfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEdmasfResponse QueryPreformanceEdmasfEx(QueryPreformanceEdmasfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEdmasfResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.edmasf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEdmasfResponse> QueryPreformanceEdmasfExAsync(QueryPreformanceEdmasfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEdmasfResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.edmasf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZzwagiResponse QueryPreformanceZzwagi(QueryPreformanceZzwagiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceZzwagiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZzwagiResponse> QueryPreformanceZzwagiAsync(QueryPreformanceZzwagiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceZzwagiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceZzwagiResponse QueryPreformanceZzwagiEx(QueryPreformanceZzwagiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZzwagiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.zzwagi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceZzwagiResponse> QueryPreformanceZzwagiExAsync(QueryPreformanceZzwagiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceZzwagiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.zzwagi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHlgygqResponse QueryPreformanceHlgygq(QueryPreformanceHlgygqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHlgygqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHlgygqResponse> QueryPreformanceHlgygqAsync(QueryPreformanceHlgygqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHlgygqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHlgygqResponse QueryPreformanceHlgygqEx(QueryPreformanceHlgygqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHlgygqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hlgygq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHlgygqResponse> QueryPreformanceHlgygqExAsync(QueryPreformanceHlgygqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHlgygqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hlgygq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXajpkiResponse QueryPreformanceXajpki(QueryPreformanceXajpkiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceXajpkiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXajpkiResponse> QueryPreformanceXajpkiAsync(QueryPreformanceXajpkiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceXajpkiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceXajpkiResponse QueryPreformanceXajpkiEx(QueryPreformanceXajpkiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXajpkiResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.xajpki.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceXajpkiResponse> QueryPreformanceXajpkiExAsync(QueryPreformanceXajpkiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceXajpkiResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.xajpki.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOwjbhoResponse QueryPreformanceOwjbho(QueryPreformanceOwjbhoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceOwjbhoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOwjbhoResponse> QueryPreformanceOwjbhoAsync(QueryPreformanceOwjbhoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceOwjbhoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceOwjbhoResponse QueryPreformanceOwjbhoEx(QueryPreformanceOwjbhoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOwjbhoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.owjbho.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceOwjbhoResponse> QueryPreformanceOwjbhoExAsync(QueryPreformanceOwjbhoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceOwjbhoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.owjbho.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEcvcwyResponse QueryPreformanceEcvcwy(QueryPreformanceEcvcwyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEcvcwyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEcvcwyResponse> QueryPreformanceEcvcwyAsync(QueryPreformanceEcvcwyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEcvcwyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEcvcwyResponse QueryPreformanceEcvcwyEx(QueryPreformanceEcvcwyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEcvcwyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ecvcwy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEcvcwyResponse> QueryPreformanceEcvcwyExAsync(QueryPreformanceEcvcwyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEcvcwyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ecvcwy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWxvpvmResponse QueryPreformanceWxvpvm(QueryPreformanceWxvpvmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceWxvpvmEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWxvpvmResponse> QueryPreformanceWxvpvmAsync(QueryPreformanceWxvpvmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceWxvpvmExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWxvpvmResponse QueryPreformanceWxvpvmEx(QueryPreformanceWxvpvmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWxvpvmResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.wxvpvm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWxvpvmResponse> QueryPreformanceWxvpvmExAsync(QueryPreformanceWxvpvmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWxvpvmResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.wxvpvm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceItjtfbResponse QueryPreformanceItjtfb(QueryPreformanceItjtfbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceItjtfbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceItjtfbResponse> QueryPreformanceItjtfbAsync(QueryPreformanceItjtfbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceItjtfbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceItjtfbResponse QueryPreformanceItjtfbEx(QueryPreformanceItjtfbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceItjtfbResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.itjtfb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceItjtfbResponse> QueryPreformanceItjtfbExAsync(QueryPreformanceItjtfbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceItjtfbResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.itjtfb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCvlthhResponse QueryPreformanceCvlthh(QueryPreformanceCvlthhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceCvlthhEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCvlthhResponse> QueryPreformanceCvlthhAsync(QueryPreformanceCvlthhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceCvlthhExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCvlthhResponse QueryPreformanceCvlthhEx(QueryPreformanceCvlthhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCvlthhResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.cvlthh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCvlthhResponse> QueryPreformanceCvlthhExAsync(QueryPreformanceCvlthhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCvlthhResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.cvlthh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMnedehResponse QueryPreformanceMnedeh(QueryPreformanceMnedehRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMnedehEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMnedehResponse> QueryPreformanceMnedehAsync(QueryPreformanceMnedehRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMnedehExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMnedehResponse QueryPreformanceMnedehEx(QueryPreformanceMnedehRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMnedehResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mnedeh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMnedehResponse> QueryPreformanceMnedehExAsync(QueryPreformanceMnedehRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMnedehResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mnedeh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIisiwtResponse QueryPreformanceIisiwt(QueryPreformanceIisiwtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceIisiwtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIisiwtResponse> QueryPreformanceIisiwtAsync(QueryPreformanceIisiwtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceIisiwtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceIisiwtResponse QueryPreformanceIisiwtEx(QueryPreformanceIisiwtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIisiwtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.iisiwt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceIisiwtResponse> QueryPreformanceIisiwtExAsync(QueryPreformanceIisiwtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceIisiwtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.iisiwt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNbdxumResponse QueryPreformanceNbdxum(QueryPreformanceNbdxumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceNbdxumEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNbdxumResponse> QueryPreformanceNbdxumAsync(QueryPreformanceNbdxumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceNbdxumExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceNbdxumResponse QueryPreformanceNbdxumEx(QueryPreformanceNbdxumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNbdxumResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.nbdxum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceNbdxumResponse> QueryPreformanceNbdxumExAsync(QueryPreformanceNbdxumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceNbdxumResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.nbdxum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSzsmhtResponse QueryPreformanceSzsmht(QueryPreformanceSzsmhtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSzsmhtEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSzsmhtResponse> QueryPreformanceSzsmhtAsync(QueryPreformanceSzsmhtRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSzsmhtExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSzsmhtResponse QueryPreformanceSzsmhtEx(QueryPreformanceSzsmhtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSzsmhtResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.szsmht.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSzsmhtResponse> QueryPreformanceSzsmhtExAsync(QueryPreformanceSzsmhtRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSzsmhtResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.szsmht.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVfrukaResponse QueryPreformanceVfruka(QueryPreformanceVfrukaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceVfrukaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVfrukaResponse> QueryPreformanceVfrukaAsync(QueryPreformanceVfrukaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceVfrukaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceVfrukaResponse QueryPreformanceVfrukaEx(QueryPreformanceVfrukaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVfrukaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.vfruka.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceVfrukaResponse> QueryPreformanceVfrukaExAsync(QueryPreformanceVfrukaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceVfrukaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.vfruka.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGcvnehResponse QueryPreformanceGcvneh(QueryPreformanceGcvnehRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceGcvnehEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGcvnehResponse> QueryPreformanceGcvnehAsync(QueryPreformanceGcvnehRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceGcvnehExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceGcvnehResponse QueryPreformanceGcvnehEx(QueryPreformanceGcvnehRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGcvnehResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.gcvneh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceGcvnehResponse> QueryPreformanceGcvnehExAsync(QueryPreformanceGcvnehRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceGcvnehResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.gcvneh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWmxlgeResponse QueryPreformanceWmxlge(QueryPreformanceWmxlgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceWmxlgeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWmxlgeResponse> QueryPreformanceWmxlgeAsync(QueryPreformanceWmxlgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceWmxlgeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWmxlgeResponse QueryPreformanceWmxlgeEx(QueryPreformanceWmxlgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWmxlgeResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.wmxlge.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWmxlgeResponse> QueryPreformanceWmxlgeExAsync(QueryPreformanceWmxlgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWmxlgeResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.wmxlge.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLcsnasResponse QueryPreformanceLcsnas(QueryPreformanceLcsnasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLcsnasEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLcsnasResponse> QueryPreformanceLcsnasAsync(QueryPreformanceLcsnasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLcsnasExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLcsnasResponse QueryPreformanceLcsnasEx(QueryPreformanceLcsnasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLcsnasResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.lcsnas.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLcsnasResponse> QueryPreformanceLcsnasExAsync(QueryPreformanceLcsnasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLcsnasResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.lcsnas.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEmfcanResponse QueryPreformanceEmfcan(QueryPreformanceEmfcanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEmfcanEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEmfcanResponse> QueryPreformanceEmfcanAsync(QueryPreformanceEmfcanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEmfcanExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEmfcanResponse QueryPreformanceEmfcanEx(QueryPreformanceEmfcanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEmfcanResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.emfcan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEmfcanResponse> QueryPreformanceEmfcanExAsync(QueryPreformanceEmfcanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEmfcanResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.emfcan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHmgrsyResponse QueryPreformanceHmgrsy(QueryPreformanceHmgrsyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHmgrsyEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHmgrsyResponse> QueryPreformanceHmgrsyAsync(QueryPreformanceHmgrsyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHmgrsyExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHmgrsyResponse QueryPreformanceHmgrsyEx(QueryPreformanceHmgrsyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHmgrsyResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hmgrsy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHmgrsyResponse> QueryPreformanceHmgrsyExAsync(QueryPreformanceHmgrsyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHmgrsyResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hmgrsy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFgadhfResponse QueryPreformanceFgadhf(QueryPreformanceFgadhfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFgadhfEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFgadhfResponse> QueryPreformanceFgadhfAsync(QueryPreformanceFgadhfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFgadhfExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFgadhfResponse QueryPreformanceFgadhfEx(QueryPreformanceFgadhfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFgadhfResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.fgadhf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFgadhfResponse> QueryPreformanceFgadhfExAsync(QueryPreformanceFgadhfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFgadhfResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.fgadhf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRmevfqResponse QueryPreformanceRmevfq(QueryPreformanceRmevfqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceRmevfqEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRmevfqResponse> QueryPreformanceRmevfqAsync(QueryPreformanceRmevfqRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceRmevfqExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceRmevfqResponse QueryPreformanceRmevfqEx(QueryPreformanceRmevfqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRmevfqResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.rmevfq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceRmevfqResponse> QueryPreformanceRmevfqExAsync(QueryPreformanceRmevfqRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceRmevfqResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.rmevfq.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceElpwxxResponse QueryPreformanceElpwxx(QueryPreformanceElpwxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceElpwxxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceElpwxxResponse> QueryPreformanceElpwxxAsync(QueryPreformanceElpwxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceElpwxxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceElpwxxResponse QueryPreformanceElpwxxEx(QueryPreformanceElpwxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceElpwxxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.elpwxx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceElpwxxResponse> QueryPreformanceElpwxxExAsync(QueryPreformanceElpwxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceElpwxxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.elpwxx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAislleResponse QueryPreformanceAislle(QueryPreformanceAislleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAislleEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAislleResponse> QueryPreformanceAislleAsync(QueryPreformanceAislleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAislleExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAislleResponse QueryPreformanceAislleEx(QueryPreformanceAislleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAislleResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.aislle.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAislleResponse> QueryPreformanceAislleExAsync(QueryPreformanceAislleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAislleResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.aislle.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFbupcoResponse QueryPreformanceFbupco(QueryPreformanceFbupcoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceFbupcoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFbupcoResponse> QueryPreformanceFbupcoAsync(QueryPreformanceFbupcoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceFbupcoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceFbupcoResponse QueryPreformanceFbupcoEx(QueryPreformanceFbupcoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFbupcoResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.fbupco.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceFbupcoResponse> QueryPreformanceFbupcoExAsync(QueryPreformanceFbupcoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceFbupcoResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.fbupco.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSolifaResponse QueryPreformanceSolifa(QueryPreformanceSolifaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceSolifaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSolifaResponse> QueryPreformanceSolifaAsync(QueryPreformanceSolifaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceSolifaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceSolifaResponse QueryPreformanceSolifaEx(QueryPreformanceSolifaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSolifaResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.solifa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceSolifaResponse> QueryPreformanceSolifaExAsync(QueryPreformanceSolifaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceSolifaResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.solifa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEcowvhResponse QueryPreformanceEcowvh(QueryPreformanceEcowvhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceEcowvhEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEcowvhResponse> QueryPreformanceEcowvhAsync(QueryPreformanceEcowvhRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceEcowvhExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceEcowvhResponse QueryPreformanceEcowvhEx(QueryPreformanceEcowvhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEcowvhResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ecowvh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceEcowvhResponse> QueryPreformanceEcowvhExAsync(QueryPreformanceEcowvhRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceEcowvhResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ecowvh.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMudnyeResponse QueryPreformanceMudnye(QueryPreformanceMudnyeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceMudnyeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMudnyeResponse> QueryPreformanceMudnyeAsync(QueryPreformanceMudnyeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceMudnyeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceMudnyeResponse QueryPreformanceMudnyeEx(QueryPreformanceMudnyeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMudnyeResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.mudnye.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceMudnyeResponse> QueryPreformanceMudnyeExAsync(QueryPreformanceMudnyeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceMudnyeResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.mudnye.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLswaxkResponse QueryPreformanceLswaxk(QueryPreformanceLswaxkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLswaxkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLswaxkResponse> QueryPreformanceLswaxkAsync(QueryPreformanceLswaxkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLswaxkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLswaxkResponse QueryPreformanceLswaxkEx(QueryPreformanceLswaxkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLswaxkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.lswaxk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLswaxkResponse> QueryPreformanceLswaxkExAsync(QueryPreformanceLswaxkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLswaxkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.lswaxk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAruxngResponse QueryPreformanceAruxng(QueryPreformanceAruxngRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceAruxngEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAruxngResponse> QueryPreformanceAruxngAsync(QueryPreformanceAruxngRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceAruxngExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceAruxngResponse QueryPreformanceAruxngEx(QueryPreformanceAruxngRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAruxngResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.aruxng.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceAruxngResponse> QueryPreformanceAruxngExAsync(QueryPreformanceAruxngRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceAruxngResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.aruxng.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHbnwdpResponse QueryPreformanceHbnwdp(QueryPreformanceHbnwdpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHbnwdpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHbnwdpResponse> QueryPreformanceHbnwdpAsync(QueryPreformanceHbnwdpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHbnwdpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHbnwdpResponse QueryPreformanceHbnwdpEx(QueryPreformanceHbnwdpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHbnwdpResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hbnwdp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHbnwdpResponse> QueryPreformanceHbnwdpExAsync(QueryPreformanceHbnwdpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHbnwdpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hbnwdp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUfdptnResponse QueryPreformanceUfdptn(QueryPreformanceUfdptnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceUfdptnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUfdptnResponse> QueryPreformanceUfdptnAsync(QueryPreformanceUfdptnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceUfdptnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceUfdptnResponse QueryPreformanceUfdptnEx(QueryPreformanceUfdptnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUfdptnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ufdptn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceUfdptnResponse> QueryPreformanceUfdptnExAsync(QueryPreformanceUfdptnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceUfdptnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ufdptn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceReyqjrResponse QueryPreformanceReyqjr(QueryPreformanceReyqjrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceReyqjrEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceReyqjrResponse> QueryPreformanceReyqjrAsync(QueryPreformanceReyqjrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceReyqjrExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceReyqjrResponse QueryPreformanceReyqjrEx(QueryPreformanceReyqjrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceReyqjrResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.reyqjr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceReyqjrResponse> QueryPreformanceReyqjrExAsync(QueryPreformanceReyqjrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceReyqjrResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.reyqjr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWtxvtjResponse QueryPreformanceWtxvtj(QueryPreformanceWtxvtjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceWtxvtjEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWtxvtjResponse> QueryPreformanceWtxvtjAsync(QueryPreformanceWtxvtjRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceWtxvtjExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceWtxvtjResponse QueryPreformanceWtxvtjEx(QueryPreformanceWtxvtjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWtxvtjResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.wtxvtj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceWtxvtjResponse> QueryPreformanceWtxvtjExAsync(QueryPreformanceWtxvtjRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceWtxvtjResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.wtxvtj.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLjbjmkResponse QueryPreformanceLjbjmk(QueryPreformanceLjbjmkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceLjbjmkEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLjbjmkResponse> QueryPreformanceLjbjmkAsync(QueryPreformanceLjbjmkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceLjbjmkExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceLjbjmkResponse QueryPreformanceLjbjmkEx(QueryPreformanceLjbjmkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLjbjmkResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ljbjmk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceLjbjmkResponse> QueryPreformanceLjbjmkExAsync(QueryPreformanceLjbjmkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceLjbjmkResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ljbjmk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCryfwzResponse QueryPreformanceCryfwz(QueryPreformanceCryfwzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceCryfwzEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCryfwzResponse> QueryPreformanceCryfwzAsync(QueryPreformanceCryfwzRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceCryfwzExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceCryfwzResponse QueryPreformanceCryfwzEx(QueryPreformanceCryfwzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCryfwzResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.cryfwz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceCryfwzResponse> QueryPreformanceCryfwzExAsync(QueryPreformanceCryfwzRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceCryfwzResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.cryfwz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePxnzuwResponse QueryPreformancePxnzuw(QueryPreformancePxnzuwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePxnzuwEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePxnzuwResponse> QueryPreformancePxnzuwAsync(QueryPreformancePxnzuwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePxnzuwExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePxnzuwResponse QueryPreformancePxnzuwEx(QueryPreformancePxnzuwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePxnzuwResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.pxnzuw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePxnzuwResponse> QueryPreformancePxnzuwExAsync(QueryPreformancePxnzuwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePxnzuwResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.pxnzuw.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePpefnnResponse QueryPreformancePpefnn(QueryPreformancePpefnnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformancePpefnnEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePpefnnResponse> QueryPreformancePpefnnAsync(QueryPreformancePpefnnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformancePpefnnExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformancePpefnnResponse QueryPreformancePpefnnEx(QueryPreformancePpefnnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePpefnnResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.ppefnn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformancePpefnnResponse> QueryPreformancePpefnnExAsync(QueryPreformancePpefnnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformancePpefnnResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.ppefnn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHhekdxResponse QueryPreformanceHhekdx(QueryPreformanceHhekdxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceHhekdxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHhekdxResponse> QueryPreformanceHhekdxAsync(QueryPreformanceHhekdxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceHhekdxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceHhekdxResponse QueryPreformanceHhekdxEx(QueryPreformanceHhekdxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHhekdxResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.hhekdx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceHhekdxResponse> QueryPreformanceHhekdxExAsync(QueryPreformanceHhekdxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceHhekdxResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.hhekdx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYirplbResponse QueryPreformanceYirplb(QueryPreformanceYirplbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceYirplbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYirplbResponse> QueryPreformanceYirplbAsync(QueryPreformanceYirplbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceYirplbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceYirplbResponse QueryPreformanceYirplbEx(QueryPreformanceYirplbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYirplbResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.yirplb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceYirplbResponse> QueryPreformanceYirplbExAsync(QueryPreformanceYirplbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceYirplbResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.yirplb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJgxxvbResponse QueryPreformanceJgxxvb(QueryPreformanceJgxxvbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPreformanceJgxxvbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJgxxvbResponse> QueryPreformanceJgxxvbAsync(QueryPreformanceJgxxvbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPreformanceJgxxvbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public QueryPreformanceJgxxvbResponse QueryPreformanceJgxxvbEx(QueryPreformanceJgxxvbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJgxxvbResponse>(DoRequest("1.0", "antdigital.jzqproducta.preformance.jgxxvb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 门户性能测试
        /// Summary: 门户性能测试</para>
        /// </description>
        public async Task<QueryPreformanceJgxxvbResponse> QueryPreformanceJgxxvbExAsync(QueryPreformanceJgxxvbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPreformanceJgxxvbResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.preformance.jgxxvb.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建http协议api
        /// Summary: 创建http协议api</para>
        /// </description>
        public ApiCreateHttpResponse ApiCreateHttp(ApiCreateHttpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiCreateHttpEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建http协议api
        /// Summary: 创建http协议api</para>
        /// </description>
        public async Task<ApiCreateHttpResponse> ApiCreateHttpAsync(ApiCreateHttpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiCreateHttpExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建http协议api
        /// Summary: 创建http协议api</para>
        /// </description>
        public ApiCreateHttpResponse ApiCreateHttpEx(ApiCreateHttpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiCreateHttpResponse>(DoRequest("1.0", "antdigital.jzqproducta.create.http.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 创建http协议api
        /// Summary: 创建http协议api</para>
        /// </description>
        public async Task<ApiCreateHttpResponse> ApiCreateHttpExAsync(ApiCreateHttpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiCreateHttpResponse>(await DoRequestAsync("1.0", "antdigital.jzqproducta.create.http.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
