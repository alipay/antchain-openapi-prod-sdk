// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.ABC.Models;

namespace AntChain.SDK.ABC
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
                        {"sdk_version", "1.0.34"},
                        {"_prod_code", "ABC"},
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
                        {"sdk_version", "1.0.34"},
                        {"_prod_code", "ABC"},
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
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public QueryAlltestOneResponse QueryAlltestOne(QueryAlltestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlltestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<QueryAlltestOneResponse> QueryAlltestOneAsync(QueryAlltestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlltestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public QueryAlltestOneResponse QueryAlltestOneEx(QueryAlltestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlltestOneResponse>(DoRequest("1.0", "antchain.abc.alltest.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<QueryAlltestOneResponse> QueryAlltestOneExAsync(QueryAlltestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlltestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.alltest.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportAlltestOneResponse ImportAlltestOne(ImportAlltestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportAlltestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportAlltestOneResponse> ImportAlltestOneAsync(ImportAlltestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportAlltestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportAlltestOneResponse ImportAlltestOneEx(ImportAlltestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAlltestOneResponse>(DoRequest("1.0", "antchain.abc.alltest.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportAlltestOneResponse> ImportAlltestOneExAsync(ImportAlltestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAlltestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.alltest.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public StabilizeAlltestOneResponse StabilizeAlltestOne(StabilizeAlltestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StabilizeAlltestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<StabilizeAlltestOneResponse> StabilizeAlltestOneAsync(StabilizeAlltestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StabilizeAlltestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public StabilizeAlltestOneResponse StabilizeAlltestOneEx(StabilizeAlltestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeAlltestOneResponse>(DoRequest("1.0", "antchain.abc.alltest.one.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<StabilizeAlltestOneResponse> StabilizeAlltestOneExAsync(StabilizeAlltestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeAlltestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.alltest.one.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public UnstabilizeAlltestOneResponse UnstabilizeAlltestOne(UnstabilizeAlltestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnstabilizeAlltestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<UnstabilizeAlltestOneResponse> UnstabilizeAlltestOneAsync(UnstabilizeAlltestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnstabilizeAlltestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public UnstabilizeAlltestOneResponse UnstabilizeAlltestOneEx(UnstabilizeAlltestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeAlltestOneResponse>(DoRequest("1.0", "antchain.abc.alltest.one.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<UnstabilizeAlltestOneResponse> UnstabilizeAlltestOneExAsync(UnstabilizeAlltestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeAlltestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.alltest.one.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试AAA
        /// Summary: 个人工作台测试AAA</para>
        /// </description>
        public QueryAlltestTwoResponse QueryAlltestTwo(QueryAlltestTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlltestTwoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试AAA
        /// Summary: 个人工作台测试AAA</para>
        /// </description>
        public async Task<QueryAlltestTwoResponse> QueryAlltestTwoAsync(QueryAlltestTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlltestTwoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试AAA
        /// Summary: 个人工作台测试AAA</para>
        /// </description>
        public QueryAlltestTwoResponse QueryAlltestTwoEx(QueryAlltestTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlltestTwoResponse>(DoRequest("1.0", "antchain.abc.alltest.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台测试AAA
        /// Summary: 个人工作台测试AAA</para>
        /// </description>
        public async Task<QueryAlltestTwoResponse> QueryAlltestTwoExAsync(QueryAlltestTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlltestTwoResponse>(await DoRequestAsync("1.0", "antchain.abc.alltest.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 录入演示111
        /// Summary: 录入演示API</para>
        /// </description>
        public PreviewDemoResponse PreviewDemo(PreviewDemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewDemoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 录入演示111
        /// Summary: 录入演示API</para>
        /// </description>
        public async Task<PreviewDemoResponse> PreviewDemoAsync(PreviewDemoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewDemoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 录入演示111
        /// Summary: 录入演示API</para>
        /// </description>
        public PreviewDemoResponse PreviewDemoEx(PreviewDemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.abc.demo.preview",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    PreviewDemoResponse previewDemoResponse = new PreviewDemoResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return previewDemoResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewDemoResponse>(DoRequest("1.0", "antchain.abc.demo.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 录入演示111
        /// Summary: 录入演示API</para>
        /// </description>
        public async Task<PreviewDemoResponse> PreviewDemoExAsync(PreviewDemoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.abc.demo.preview",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    PreviewDemoResponse previewDemoResponse = new PreviewDemoResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return previewDemoResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewDemoResponse>(await DoRequestAsync("1.0", "antchain.abc.demo.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试导入api1
        /// Summary: 测试导入api1</para>
        /// </description>
        public QueryGatewayResponse QueryGateway(QueryGatewayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试导入api1
        /// Summary: 测试导入api1</para>
        /// </description>
        public async Task<QueryGatewayResponse> QueryGatewayAsync(QueryGatewayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试导入api1
        /// Summary: 测试导入api1</para>
        /// </description>
        public QueryGatewayResponse QueryGatewayEx(QueryGatewayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayResponse>(DoRequest("1.0", "antchain.abc.gateway.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试导入api1
        /// Summary: 测试导入api1</para>
        /// </description>
        public async Task<QueryGatewayResponse> QueryGatewayExAsync(QueryGatewayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayResponse>(await DoRequestAsync("1.0", "antchain.abc.gateway.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 调试a s dddd
        /// Summary: 调试1</para>
        /// </description>
        public QueryAbcdaAbcddaaResponse QueryAbcdaAbcddaa(QueryAbcdaAbcddaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAbcdaAbcddaaEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 调试a s dddd
        /// Summary: 调试1</para>
        /// </description>
        public async Task<QueryAbcdaAbcddaaResponse> QueryAbcdaAbcddaaAsync(QueryAbcdaAbcddaaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAbcdaAbcddaaExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 调试a s dddd
        /// Summary: 调试1</para>
        /// </description>
        public QueryAbcdaAbcddaaResponse QueryAbcdaAbcddaaEx(QueryAbcdaAbcddaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbcdaAbcddaaResponse>(DoRequest("1.0", "antchain.abc.abcda.abcddaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 调试a s dddd
        /// Summary: 调试1</para>
        /// </description>
        public async Task<QueryAbcdaAbcddaaResponse> QueryAbcdaAbcddaaExAsync(QueryAbcdaAbcddaaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbcdaAbcddaaResponse>(await DoRequestAsync("1.0", "antchain.abc.abcda.abcddaa.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试大安全接口
        /// Summary: 测试大安全接口</para>
        /// </description>
        public MatchSecurityFaceResponse MatchSecurityFace(MatchSecurityFaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MatchSecurityFaceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试大安全接口
        /// Summary: 测试大安全接口</para>
        /// </description>
        public async Task<MatchSecurityFaceResponse> MatchSecurityFaceAsync(MatchSecurityFaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MatchSecurityFaceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试大安全接口
        /// Summary: 测试大安全接口</para>
        /// </description>
        public MatchSecurityFaceResponse MatchSecurityFaceEx(MatchSecurityFaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchSecurityFaceResponse>(DoRequest("1.0", "antchain.abc.security.face.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试大安全接口
        /// Summary: 测试大安全接口</para>
        /// </description>
        public async Task<MatchSecurityFaceResponse> MatchSecurityFaceExAsync(MatchSecurityFaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchSecurityFaceResponse>(await DoRequestAsync("1.0", "antchain.abc.security.face.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传测试接口
        /// Summary: 文件上传测试接口</para>
        /// </description>
        public UploadTestFileResponse UploadTestFile(UploadTestFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadTestFileEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传测试接口
        /// Summary: 文件上传测试接口</para>
        /// </description>
        public async Task<UploadTestFileResponse> UploadTestFileAsync(UploadTestFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadTestFileExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传测试接口
        /// Summary: 文件上传测试接口</para>
        /// </description>
        public UploadTestFileResponse UploadTestFileEx(UploadTestFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.abc.test.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadTestFileResponse uploadTestFileResponse = new UploadTestFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadTestFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTestFileResponse>(DoRequest("1.0", "antchain.abc.test.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传测试接口
        /// Summary: 文件上传测试接口</para>
        /// </description>
        public async Task<UploadTestFileResponse> UploadTestFileExAsync(UploadTestFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.abc.test.file.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadTestFileResponse uploadTestFileResponse = new UploadTestFileResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadTestFileResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTestFileResponse>(await DoRequestAsync("1.0", "antchain.abc.test.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口1
        /// Summary: 压测接口1</para>
        /// </description>
        public QueryTimeOneResponse QueryTimeOne(QueryTimeOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTimeOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口1
        /// Summary: 压测接口1</para>
        /// </description>
        public async Task<QueryTimeOneResponse> QueryTimeOneAsync(QueryTimeOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTimeOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口1
        /// Summary: 压测接口1</para>
        /// </description>
        public QueryTimeOneResponse QueryTimeOneEx(QueryTimeOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeOneResponse>(DoRequest("1.0", "antchain.abc.time.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口1
        /// Summary: 压测接口1</para>
        /// </description>
        public async Task<QueryTimeOneResponse> QueryTimeOneExAsync(QueryTimeOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeOneResponse>(await DoRequestAsync("1.0", "antchain.abc.time.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口2
        /// Summary: 压测接口2</para>
        /// </description>
        public QueryTimeTwoResponse QueryTimeTwo(QueryTimeTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTimeTwoEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口2
        /// Summary: 压测接口2</para>
        /// </description>
        public async Task<QueryTimeTwoResponse> QueryTimeTwoAsync(QueryTimeTwoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTimeTwoExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口2
        /// Summary: 压测接口2</para>
        /// </description>
        public QueryTimeTwoResponse QueryTimeTwoEx(QueryTimeTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeTwoResponse>(DoRequest("1.0", "antchain.abc.time.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口2
        /// Summary: 压测接口2</para>
        /// </description>
        public async Task<QueryTimeTwoResponse> QueryTimeTwoExAsync(QueryTimeTwoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeTwoResponse>(await DoRequestAsync("1.0", "antchain.abc.time.two.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口3
        /// Summary: 压测接口3</para>
        /// </description>
        public QueryTimeThreeResponse QueryTimeThree(QueryTimeThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTimeThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口3
        /// Summary: 压测接口3</para>
        /// </description>
        public async Task<QueryTimeThreeResponse> QueryTimeThreeAsync(QueryTimeThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTimeThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口3
        /// Summary: 压测接口3</para>
        /// </description>
        public QueryTimeThreeResponse QueryTimeThreeEx(QueryTimeThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeThreeResponse>(DoRequest("1.0", "antchain.abc.time.three.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口3
        /// Summary: 压测接口3</para>
        /// </description>
        public async Task<QueryTimeThreeResponse> QueryTimeThreeExAsync(QueryTimeThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeThreeResponse>(await DoRequestAsync("1.0", "antchain.abc.time.three.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口4
        /// Summary: 压测接口4</para>
        /// </description>
        public QueryTimeFourResponse QueryTimeFour(QueryTimeFourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTimeFourEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口4
        /// Summary: 压测接口4</para>
        /// </description>
        public async Task<QueryTimeFourResponse> QueryTimeFourAsync(QueryTimeFourRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTimeFourExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口4
        /// Summary: 压测接口4</para>
        /// </description>
        public QueryTimeFourResponse QueryTimeFourEx(QueryTimeFourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeFourResponse>(DoRequest("1.0", "antchain.abc.time.four.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口4
        /// Summary: 压测接口4</para>
        /// </description>
        public async Task<QueryTimeFourResponse> QueryTimeFourExAsync(QueryTimeFourRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeFourResponse>(await DoRequestAsync("1.0", "antchain.abc.time.four.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口5
        /// Summary: 压测接口5</para>
        /// </description>
        public QueryTimeFiveResponse QueryTimeFive(QueryTimeFiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTimeFiveEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口5
        /// Summary: 压测接口5</para>
        /// </description>
        public async Task<QueryTimeFiveResponse> QueryTimeFiveAsync(QueryTimeFiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTimeFiveExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口5
        /// Summary: 压测接口5</para>
        /// </description>
        public QueryTimeFiveResponse QueryTimeFiveEx(QueryTimeFiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeFiveResponse>(DoRequest("1.0", "antchain.abc.time.five.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口5
        /// Summary: 压测接口5</para>
        /// </description>
        public async Task<QueryTimeFiveResponse> QueryTimeFiveExAsync(QueryTimeFiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTimeFiveResponse>(await DoRequestAsync("1.0", "antchain.abc.time.five.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: aaa
        /// Summary: aaa</para>
        /// </description>
        public CccAaaBbbResponse CccAaaBbb(CccAaaBbbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CccAaaBbbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: aaa
        /// Summary: aaa</para>
        /// </description>
        public async Task<CccAaaBbbResponse> CccAaaBbbAsync(CccAaaBbbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CccAaaBbbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: aaa
        /// Summary: aaa</para>
        /// </description>
        public CccAaaBbbResponse CccAaaBbbEx(CccAaaBbbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CccAaaBbbResponse>(DoRequest("1.0", "antchain.abc.aaa.bbb.ccc", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: aaa
        /// Summary: aaa</para>
        /// </description>
        public async Task<CccAaaBbbResponse> CccAaaBbbExAsync(CccAaaBbbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CccAaaBbbResponse>(await DoRequestAsync("1.0", "antchain.abc.aaa.bbb.ccc", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 已有产品创建api
        /// Summary: 已有产品创建api</para>
        /// </description>
        public CreateapiExistingProductsResponse CreateapiExistingProducts(CreateapiExistingProductsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateapiExistingProductsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 已有产品创建api
        /// Summary: 已有产品创建api</para>
        /// </description>
        public async Task<CreateapiExistingProductsResponse> CreateapiExistingProductsAsync(CreateapiExistingProductsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateapiExistingProductsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 已有产品创建api
        /// Summary: 已有产品创建api</para>
        /// </description>
        public CreateapiExistingProductsResponse CreateapiExistingProductsEx(CreateapiExistingProductsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateapiExistingProductsResponse>(DoRequest("1.0", "antchain.abc.existing.products.createapi", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 已有产品创建api
        /// Summary: 已有产品创建api</para>
        /// </description>
        public async Task<CreateapiExistingProductsResponse> CreateapiExistingProductsExAsync(CreateapiExistingProductsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateapiExistingProductsResponse>(await DoRequestAsync("1.0", "antchain.abc.existing.products.createapi", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 已有产品下创建的api
        /// Summary: 已有产品下创建的api</para>
        /// </description>
        public APreCreateApiResponse APreCreateApi(APreCreateApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return APreCreateApiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 已有产品下创建的api
        /// Summary: 已有产品下创建的api</para>
        /// </description>
        public async Task<APreCreateApiResponse> APreCreateApiAsync(APreCreateApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await APreCreateApiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 已有产品下创建的api
        /// Summary: 已有产品下创建的api</para>
        /// </description>
        public APreCreateApiResponse APreCreateApiEx(APreCreateApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<APreCreateApiResponse>(DoRequest("1.0", "antchain.abc.pre.create.api.a", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 已有产品下创建的api
        /// Summary: 已有产品下创建的api</para>
        /// </description>
        public async Task<APreCreateApiResponse> APreCreateApiExAsync(APreCreateApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<APreCreateApiResponse>(await DoRequestAsync("1.0", "antchain.abc.pre.create.api.a", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用api
        /// Summary: 测试使用api</para>
        /// </description>
        public ApiTestCreateResponse ApiTestCreate(ApiTestCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiTestCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用api
        /// Summary: 测试使用api</para>
        /// </description>
        public async Task<ApiTestCreateResponse> ApiTestCreateAsync(ApiTestCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiTestCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用api
        /// Summary: 测试使用api</para>
        /// </description>
        public ApiTestCreateResponse ApiTestCreateEx(ApiTestCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiTestCreateResponse>(DoRequest("1.0", "antchain.abc.test.create.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用api
        /// Summary: 测试使用api</para>
        /// </description>
        public async Task<ApiTestCreateResponse> ApiTestCreateExAsync(ApiTestCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiTestCreateResponse>(await DoRequestAsync("1.0", "antchain.abc.test.create.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于测试api评审接入SDL/修改后的评审/0323
        /// Summary: 用于测试api评审接入SDL/修改后的评审/0323</para>
        /// </description>
        public QueryApprovalTestResponse QueryApprovalTest(QueryApprovalTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApprovalTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于测试api评审接入SDL/修改后的评审/0323
        /// Summary: 用于测试api评审接入SDL/修改后的评审/0323</para>
        /// </description>
        public async Task<QueryApprovalTestResponse> QueryApprovalTestAsync(QueryApprovalTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApprovalTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于测试api评审接入SDL/修改后的评审/0323
        /// Summary: 用于测试api评审接入SDL/修改后的评审/0323</para>
        /// </description>
        public QueryApprovalTestResponse QueryApprovalTestEx(QueryApprovalTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApprovalTestResponse>(DoRequest("1.0", "antchain.abc.approval.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于测试api评审接入SDL/修改后的评审/0323
        /// Summary: 用于测试api评审接入SDL/修改后的评审/0323</para>
        /// </description>
        public async Task<QueryApprovalTestResponse> QueryApprovalTestExAsync(QueryApprovalTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApprovalTestResponse>(await DoRequestAsync("1.0", "antchain.abc.approval.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public AzxdAzsxResponse AzxdAzsx(AzxdAzsxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AzxdAzsxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public async Task<AzxdAzsxResponse> AzxdAzsxAsync(AzxdAzsxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AzxdAzsxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public AzxdAzsxResponse AzxdAzsxEx(AzxdAzsxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AzxdAzsxResponse>(DoRequest("1.0", "antchain.abc.azsx.azxd", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public async Task<AzxdAzsxResponse> AzxdAzsxExAsync(AzxdAzsxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AzxdAzsxResponse>(await DoRequestAsync("1.0", "antchain.abc.azsx.azxd", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 钟忆个人工作台预发测试1
        /// Summary: 钟忆个人工作台预发测试1</para>
        /// </description>
        public QueryTestOneResponse QueryTestOne(QueryTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 钟忆个人工作台预发测试1
        /// Summary: 钟忆个人工作台预发测试1</para>
        /// </description>
        public async Task<QueryTestOneResponse> QueryTestOneAsync(QueryTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 钟忆个人工作台预发测试1
        /// Summary: 钟忆个人工作台预发测试1</para>
        /// </description>
        public QueryTestOneResponse QueryTestOneEx(QueryTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestOneResponse>(DoRequest("1.0", "antchain.abc.test.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 钟忆个人工作台预发测试1
        /// Summary: 钟忆个人工作台预发测试1</para>
        /// </description>
        public async Task<QueryTestOneResponse> QueryTestOneExAsync(QueryTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.test.one.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportTestOneResponse ImportTestOne(ImportTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportTestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportTestOneResponse> ImportTestOneAsync(ImportTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportTestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportTestOneResponse ImportTestOneEx(ImportTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTestOneResponse>(DoRequest("1.0", "antchain.abc.test.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportTestOneResponse> ImportTestOneExAsync(ImportTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.test.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public StabilizeTestOneResponse StabilizeTestOne(StabilizeTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StabilizeTestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<StabilizeTestOneResponse> StabilizeTestOneAsync(StabilizeTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StabilizeTestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public StabilizeTestOneResponse StabilizeTestOneEx(StabilizeTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeTestOneResponse>(DoRequest("1.0", "antchain.abc.test.one.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<StabilizeTestOneResponse> StabilizeTestOneExAsync(StabilizeTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeTestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.test.one.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public CaptureTestOneResponse CaptureTestOne(CaptureTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CaptureTestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<CaptureTestOneResponse> CaptureTestOneAsync(CaptureTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CaptureTestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public CaptureTestOneResponse CaptureTestOneEx(CaptureTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CaptureTestOneResponse>(DoRequest("1.0", "antchain.abc.test.one.capture", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<CaptureTestOneResponse> CaptureTestOneExAsync(CaptureTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CaptureTestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.test.one.capture", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public MatchTestOneResponse MatchTestOne(MatchTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MatchTestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<MatchTestOneResponse> MatchTestOneAsync(MatchTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MatchTestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public MatchTestOneResponse MatchTestOneEx(MatchTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchTestOneResponse>(DoRequest("1.0", "antchain.abc.test.one.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<MatchTestOneResponse> MatchTestOneExAsync(MatchTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchTestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.test.one.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public OperateTestOneResponse OperateTestOne(OperateTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateTestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<OperateTestOneResponse> OperateTestOneAsync(OperateTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateTestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public OperateTestOneResponse OperateTestOneEx(OperateTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateTestOneResponse>(DoRequest("1.0", "antchain.abc.test.one.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<OperateTestOneResponse> OperateTestOneExAsync(OperateTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateTestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.test.one.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台新增接口测试
        /// Summary: 个人工作台新增接口测试</para>
        /// </description>
        public TimeTestOneResponse TimeTestOne(TimeTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TimeTestOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台新增接口测试
        /// Summary: 个人工作台新增接口测试</para>
        /// </description>
        public async Task<TimeTestOneResponse> TimeTestOneAsync(TimeTestOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TimeTestOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台新增接口测试
        /// Summary: 个人工作台新增接口测试</para>
        /// </description>
        public TimeTestOneResponse TimeTestOneEx(TimeTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TimeTestOneResponse>(DoRequest("1.0", "antchain.abc.test.one.time", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台新增接口测试
        /// Summary: 个人工作台新增接口测试</para>
        /// </description>
        public async Task<TimeTestOneResponse> TimeTestOneExAsync(TimeTestOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TimeTestOneResponse>(await DoRequestAsync("1.0", "antchain.abc.test.one.time", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        /// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</para>
        /// </description>
        public QueryOneLimitResponse QueryOneLimit(QueryOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOneLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        /// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</para>
        /// </description>
        public async Task<QueryOneLimitResponse> QueryOneLimitAsync(QueryOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOneLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        /// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</para>
        /// </description>
        public QueryOneLimitResponse QueryOneLimitEx(QueryOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOneLimitResponse>(DoRequest("1.0", "antchain.abc.one.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        /// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</para>
        /// </description>
        public async Task<QueryOneLimitResponse> QueryOneLimitExAsync(QueryOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOneLimitResponse>(await DoRequestAsync("1.0", "antchain.abc.one.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportOneLimitResponse ImportOneLimit(ImportOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportOneLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportOneLimitResponse> ImportOneLimitAsync(ImportOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportOneLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ImportOneLimitResponse ImportOneLimitEx(ImportOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportOneLimitResponse>(DoRequest("1.0", "antchain.abc.one.limit.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ImportOneLimitResponse> ImportOneLimitExAsync(ImportOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportOneLimitResponse>(await DoRequestAsync("1.0", "antchain.abc.one.limit.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public StabilizeOneLimitResponse StabilizeOneLimit(StabilizeOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StabilizeOneLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<StabilizeOneLimitResponse> StabilizeOneLimitAsync(StabilizeOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StabilizeOneLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public StabilizeOneLimitResponse StabilizeOneLimitEx(StabilizeOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeOneLimitResponse>(DoRequest("1.0", "antchain.abc.one.limit.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<StabilizeOneLimitResponse> StabilizeOneLimitExAsync(StabilizeOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeOneLimitResponse>(await DoRequestAsync("1.0", "antchain.abc.one.limit.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public UnstabilizeOneLimitResponse UnstabilizeOneLimit(UnstabilizeOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnstabilizeOneLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<UnstabilizeOneLimitResponse> UnstabilizeOneLimitAsync(UnstabilizeOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnstabilizeOneLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public UnstabilizeOneLimitResponse UnstabilizeOneLimitEx(UnstabilizeOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeOneLimitResponse>(DoRequest("1.0", "antchain.abc.one.limit.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<UnstabilizeOneLimitResponse> UnstabilizeOneLimitExAsync(UnstabilizeOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeOneLimitResponse>(await DoRequestAsync("1.0", "antchain.abc.one.limit.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ResetOneLimitResponse ResetOneLimit(ResetOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetOneLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ResetOneLimitResponse> ResetOneLimitAsync(ResetOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetOneLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public ResetOneLimitResponse ResetOneLimitEx(ResetOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetOneLimitResponse>(DoRequest("1.0", "antchain.abc.one.limit.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<ResetOneLimitResponse> ResetOneLimitExAsync(ResetOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetOneLimitResponse>(await DoRequestAsync("1.0", "antchain.abc.one.limit.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public WithdrawOneLimitResponse WithdrawOneLimit(WithdrawOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return WithdrawOneLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<WithdrawOneLimitResponse> WithdrawOneLimitAsync(WithdrawOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await WithdrawOneLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public WithdrawOneLimitResponse WithdrawOneLimitEx(WithdrawOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<WithdrawOneLimitResponse>(DoRequest("1.0", "antchain.abc.one.limit.withdraw", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<WithdrawOneLimitResponse> WithdrawOneLimitExAsync(WithdrawOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<WithdrawOneLimitResponse>(await DoRequestAsync("1.0", "antchain.abc.one.limit.withdraw", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于共享能力中心六期接入rasp回归验证
        /// Summary: 用于共享能力中心六期接入rasp回归验证</para>
        /// </description>
        public QueryGongxiangTesttestResponse QueryGongxiangTesttest(QueryGongxiangTesttestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGongxiangTesttestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于共享能力中心六期接入rasp回归验证
        /// Summary: 用于共享能力中心六期接入rasp回归验证</para>
        /// </description>
        public async Task<QueryGongxiangTesttestResponse> QueryGongxiangTesttestAsync(QueryGongxiangTesttestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGongxiangTesttestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于共享能力中心六期接入rasp回归验证
        /// Summary: 用于共享能力中心六期接入rasp回归验证</para>
        /// </description>
        public QueryGongxiangTesttestResponse QueryGongxiangTesttestEx(QueryGongxiangTesttestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGongxiangTesttestResponse>(DoRequest("1.0", "antchain.abc.gongxiang.testtest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于共享能力中心六期接入rasp回归验证
        /// Summary: 用于共享能力中心六期接入rasp回归验证</para>
        /// </description>
        public async Task<QueryGongxiangTesttestResponse> QueryGongxiangTesttestExAsync(QueryGongxiangTesttestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGongxiangTesttestResponse>(await DoRequestAsync("1.0", "antchain.abc.gongxiang.testtest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
