// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.QQQ.Models;

namespace AntChain.SDK.QQQ
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
                        {"sdk_version", "2.0.7"},
                        {"_prod_code", "QQQ"},
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
                        {"sdk_version", "2.0.7"},
                        {"_prod_code", "QQQ"},
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
        /// <para>Description: 压测接口5
        /// Summary: 压测接口5</para>
        /// </description>
        public QueryAntchainAbcTimeFiveResponse QueryAntchainAbcTimeFive(QueryAntchainAbcTimeFiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAbcTimeFiveEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口5
        /// Summary: 压测接口5</para>
        /// </description>
        public async Task<QueryAntchainAbcTimeFiveResponse> QueryAntchainAbcTimeFiveAsync(QueryAntchainAbcTimeFiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAbcTimeFiveExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口5
        /// Summary: 压测接口5</para>
        /// </description>
        public QueryAntchainAbcTimeFiveResponse QueryAntchainAbcTimeFiveEx(QueryAntchainAbcTimeFiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAbcTimeFiveResponse>(DoRequest("1.0", "antchain.abc.time.five.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 压测接口5
        /// Summary: 压测接口5</para>
        /// </description>
        public async Task<QueryAntchainAbcTimeFiveResponse> QueryAntchainAbcTimeFiveExAsync(QueryAntchainAbcTimeFiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAbcTimeFiveResponse>(await DoRequestAsync("1.0", "antchain.abc.time.five.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于测试api评审接入SDL/修改后的评审/0323
        /// Summary: 用于测试api评审接入SDL/修改后的评审/0323</para>
        /// </description>
        public QueryAntchainAbcApprovalTestResponse QueryAntchainAbcApprovalTest(QueryAntchainAbcApprovalTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAbcApprovalTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于测试api评审接入SDL/修改后的评审/0323
        /// Summary: 用于测试api评审接入SDL/修改后的评审/0323</para>
        /// </description>
        public async Task<QueryAntchainAbcApprovalTestResponse> QueryAntchainAbcApprovalTestAsync(QueryAntchainAbcApprovalTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAbcApprovalTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于测试api评审接入SDL/修改后的评审/0323
        /// Summary: 用于测试api评审接入SDL/修改后的评审/0323</para>
        /// </description>
        public QueryAntchainAbcApprovalTestResponse QueryAntchainAbcApprovalTestEx(QueryAntchainAbcApprovalTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAbcApprovalTestResponse>(DoRequest("1.0", "antchain.abc.approval.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于测试api评审接入SDL/修改后的评审/0323
        /// Summary: 用于测试api评审接入SDL/修改后的评审/0323</para>
        /// </description>
        public async Task<QueryAntchainAbcApprovalTestResponse> QueryAntchainAbcApprovalTestExAsync(QueryAntchainAbcApprovalTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAbcApprovalTestResponse>(await DoRequestAsync("1.0", "antchain.abc.approval.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用api
        /// Summary: 测试使用api</para>
        /// </description>
        public ApiAntchainAbcTestCreateResponse ApiAntchainAbcTestCreate(ApiAntchainAbcTestCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApiAntchainAbcTestCreateEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用api
        /// Summary: 测试使用api</para>
        /// </description>
        public async Task<ApiAntchainAbcTestCreateResponse> ApiAntchainAbcTestCreateAsync(ApiAntchainAbcTestCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApiAntchainAbcTestCreateExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用api
        /// Summary: 测试使用api</para>
        /// </description>
        public ApiAntchainAbcTestCreateResponse ApiAntchainAbcTestCreateEx(ApiAntchainAbcTestCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiAntchainAbcTestCreateResponse>(DoRequest("1.0", "antchain.abc.test.create.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试使用api
        /// Summary: 测试使用api</para>
        /// </description>
        public async Task<ApiAntchainAbcTestCreateResponse> ApiAntchainAbcTestCreateExAsync(ApiAntchainAbcTestCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApiAntchainAbcTestCreateResponse>(await DoRequestAsync("1.0", "antchain.abc.test.create.api", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        /// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</para>
        /// </description>
        public QueryAntchainAbcOneLimitResponse QueryAntchainAbcOneLimit(QueryAntchainAbcOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAbcOneLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        /// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</para>
        /// </description>
        public async Task<QueryAntchainAbcOneLimitResponse> QueryAntchainAbcOneLimitAsync(QueryAntchainAbcOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAbcOneLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        /// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</para>
        /// </description>
        public QueryAntchainAbcOneLimitResponse QueryAntchainAbcOneLimitEx(QueryAntchainAbcOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAbcOneLimitResponse>(DoRequest("1.0", "antchain.abc.one.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        /// Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq</para>
        /// </description>
        public async Task<QueryAntchainAbcOneLimitResponse> QueryAntchainAbcOneLimitExAsync(QueryAntchainAbcOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAbcOneLimitResponse>(await DoRequestAsync("1.0", "antchain.abc.one.limit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public UnstabilizeAntchainAbcOneLimitResponse UnstabilizeAntchainAbcOneLimit(UnstabilizeAntchainAbcOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnstabilizeAntchainAbcOneLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<UnstabilizeAntchainAbcOneLimitResponse> UnstabilizeAntchainAbcOneLimitAsync(UnstabilizeAntchainAbcOneLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnstabilizeAntchainAbcOneLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public UnstabilizeAntchainAbcOneLimitResponse UnstabilizeAntchainAbcOneLimitEx(UnstabilizeAntchainAbcOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeAntchainAbcOneLimitResponse>(DoRequest("1.0", "antchain.abc.one.limit.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期测试接口
        /// Summary: 个人工作台二期测试接口</para>
        /// </description>
        public async Task<UnstabilizeAntchainAbcOneLimitResponse> UnstabilizeAntchainAbcOneLimitExAsync(UnstabilizeAntchainAbcOneLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeAntchainAbcOneLimitResponse>(await DoRequestAsync("1.0", "antchain.abc.one.limit.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryAntchainDemosdkBbbEeeResponse QueryAntchainDemosdkBbbEee(QueryAntchainDemosdkBbbEeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkBbbEeeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryAntchainDemosdkBbbEeeResponse> QueryAntchainDemosdkBbbEeeAsync(QueryAntchainDemosdkBbbEeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkBbbEeeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryAntchainDemosdkBbbEeeResponse QueryAntchainDemosdkBbbEeeEx(QueryAntchainDemosdkBbbEeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkBbbEeeResponse>(DoRequest("1.0", "antchain.demosdk.bbb.eee.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryAntchainDemosdkBbbEeeResponse> QueryAntchainDemosdkBbbEeeExAsync(QueryAntchainDemosdkBbbEeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkBbbEeeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.eee.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public QueryAntchainDemosdkAaaTestResponse QueryAntchainDemosdkAaaTest(QueryAntchainDemosdkAaaTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkAaaTestEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<QueryAntchainDemosdkAaaTestResponse> QueryAntchainDemosdkAaaTestAsync(QueryAntchainDemosdkAaaTestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkAaaTestExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public QueryAntchainDemosdkAaaTestResponse QueryAntchainDemosdkAaaTestEx(QueryAntchainDemosdkAaaTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkAaaTestResponse>(DoRequest("1.0", "antchain.demosdk.aaa.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<QueryAntchainDemosdkAaaTestResponse> QueryAntchainDemosdkAaaTestExAsync(QueryAntchainDemosdkAaaTestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkAaaTestResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.test.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public StabilizeAntchainDemosdkBbbCccResponse StabilizeAntchainDemosdkBbbCcc(StabilizeAntchainDemosdkBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StabilizeAntchainDemosdkBbbCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<StabilizeAntchainDemosdkBbbCccResponse> StabilizeAntchainDemosdkBbbCccAsync(StabilizeAntchainDemosdkBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StabilizeAntchainDemosdkBbbCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public StabilizeAntchainDemosdkBbbCccResponse StabilizeAntchainDemosdkBbbCccEx(StabilizeAntchainDemosdkBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeAntchainDemosdkBbbCccResponse>(DoRequest("1.0", "antchain.demosdk.bbb.ccc.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<StabilizeAntchainDemosdkBbbCccResponse> StabilizeAntchainDemosdkBbbCccExAsync(StabilizeAntchainDemosdkBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StabilizeAntchainDemosdkBbbCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.ccc.stabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: r
        /// Summary: r</para>
        /// </description>
        public QueryAntchainDemosdkMultiCccResponse QueryAntchainDemosdkMultiCcc(QueryAntchainDemosdkMultiCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkMultiCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: r
        /// Summary: r</para>
        /// </description>
        public async Task<QueryAntchainDemosdkMultiCccResponse> QueryAntchainDemosdkMultiCccAsync(QueryAntchainDemosdkMultiCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkMultiCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: r
        /// Summary: r</para>
        /// </description>
        public QueryAntchainDemosdkMultiCccResponse QueryAntchainDemosdkMultiCccEx(QueryAntchainDemosdkMultiCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkMultiCccResponse>(DoRequest("1.0", "antchain.demosdk.multi.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: r
        /// Summary: r</para>
        /// </description>
        public async Task<QueryAntchainDemosdkMultiCccResponse> QueryAntchainDemosdkMultiCccExAsync(QueryAntchainDemosdkMultiCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkMultiCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.multi.ccc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public QueryAntchainDemosdkAaaCciResponse QueryAntchainDemosdkAaaCci(QueryAntchainDemosdkAaaCciRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkAaaCciEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public async Task<QueryAntchainDemosdkAaaCciResponse> QueryAntchainDemosdkAaaCciAsync(QueryAntchainDemosdkAaaCciRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkAaaCciExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public QueryAntchainDemosdkAaaCciResponse QueryAntchainDemosdkAaaCciEx(QueryAntchainDemosdkAaaCciRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkAaaCciResponse>(DoRequest("1.0", "antchain.demosdk.aaa.cci.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: l
        /// Summary: l</para>
        /// </description>
        public async Task<QueryAntchainDemosdkAaaCciResponse> QueryAntchainDemosdkAaaCciExAsync(QueryAntchainDemosdkAaaCciRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkAaaCciResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.cci.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public ResetAntchainDemosdkBbbCccResponse ResetAntchainDemosdkBbbCcc(ResetAntchainDemosdkBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetAntchainDemosdkBbbCccEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<ResetAntchainDemosdkBbbCccResponse> ResetAntchainDemosdkBbbCccAsync(ResetAntchainDemosdkBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetAntchainDemosdkBbbCccExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public ResetAntchainDemosdkBbbCccResponse ResetAntchainDemosdkBbbCccEx(ResetAntchainDemosdkBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetAntchainDemosdkBbbCccResponse>(DoRequest("1.0", "antchain.demosdk.bbb.ccc.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<ResetAntchainDemosdkBbbCccResponse> ResetAntchainDemosdkBbbCccExAsync(ResetAntchainDemosdkBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetAntchainDemosdkBbbCccResponse>(await DoRequestAsync("1.0", "antchain.demosdk.bbb.ccc.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindAntchainDemosdkXxxResponse BindAntchainDemosdkXxx(BindAntchainDemosdkXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAntchainDemosdkXxxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindAntchainDemosdkXxxResponse> BindAntchainDemosdkXxxAsync(BindAntchainDemosdkXxxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAntchainDemosdkXxxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public BindAntchainDemosdkXxxResponse BindAntchainDemosdkXxxEx(BindAntchainDemosdkXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAntchainDemosdkXxxResponse>(DoRequest("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<BindAntchainDemosdkXxxResponse> BindAntchainDemosdkXxxExAsync(BindAntchainDemosdkXxxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAntchainDemosdkXxxResponse>(await DoRequestAsync("1.0", "antchain.demosdk.xxx.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryAntchainDemosdkCcXxResponse QueryAntchainDemosdkCcXx(QueryAntchainDemosdkCcXxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkCcXxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryAntchainDemosdkCcXxResponse> QueryAntchainDemosdkCcXxAsync(QueryAntchainDemosdkCcXxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkCcXxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryAntchainDemosdkCcXxResponse QueryAntchainDemosdkCcXxEx(QueryAntchainDemosdkCcXxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkCcXxResponse>(DoRequest("1.0", "antchain.demosdk.cc.xx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryAntchainDemosdkCcXxResponse> QueryAntchainDemosdkCcXxExAsync(QueryAntchainDemosdkCcXxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkCcXxResponse>(await DoRequestAsync("1.0", "antchain.demosdk.cc.xx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由灰度测试接口
        /// Summary: 个人工作台二期分组路由灰度测试接口</para>
        /// </description>
        public ResetAntchainDemosdkAbcdLimitResponse ResetAntchainDemosdkAbcdLimit(ResetAntchainDemosdkAbcdLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetAntchainDemosdkAbcdLimitEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由灰度测试接口
        /// Summary: 个人工作台二期分组路由灰度测试接口</para>
        /// </description>
        public async Task<ResetAntchainDemosdkAbcdLimitResponse> ResetAntchainDemosdkAbcdLimitAsync(ResetAntchainDemosdkAbcdLimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetAntchainDemosdkAbcdLimitExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由灰度测试接口
        /// Summary: 个人工作台二期分组路由灰度测试接口</para>
        /// </description>
        public ResetAntchainDemosdkAbcdLimitResponse ResetAntchainDemosdkAbcdLimitEx(ResetAntchainDemosdkAbcdLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetAntchainDemosdkAbcdLimitResponse>(DoRequest("1.0", "antchain.demosdk.abcd.limit.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期分组路由灰度测试接口
        /// Summary: 个人工作台二期分组路由灰度测试接口</para>
        /// </description>
        public async Task<ResetAntchainDemosdkAbcdLimitResponse> ResetAntchainDemosdkAbcdLimitExAsync(ResetAntchainDemosdkAbcdLimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetAntchainDemosdkAbcdLimitResponse>(await DoRequestAsync("1.0", "antchain.demosdk.abcd.limit.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public ImportAntchainDemosdkCreateOneResponse ImportAntchainDemosdkCreateOne(ImportAntchainDemosdkCreateOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportAntchainDemosdkCreateOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<ImportAntchainDemosdkCreateOneResponse> ImportAntchainDemosdkCreateOneAsync(ImportAntchainDemosdkCreateOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportAntchainDemosdkCreateOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public ImportAntchainDemosdkCreateOneResponse ImportAntchainDemosdkCreateOneEx(ImportAntchainDemosdkCreateOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAntchainDemosdkCreateOneResponse>(DoRequest("1.0", "antchain.demosdk.create.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 用于个人工作台二期测试使用
        /// Summary: 用于个人工作台二期测试使用</para>
        /// </description>
        public async Task<ImportAntchainDemosdkCreateOneResponse> ImportAntchainDemosdkCreateOneExAsync(ImportAntchainDemosdkCreateOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAntchainDemosdkCreateOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.create.one.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public WithdrawAntchainDemosdkTwiceOneResponse WithdrawAntchainDemosdkTwiceOne(WithdrawAntchainDemosdkTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return WithdrawAntchainDemosdkTwiceOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<WithdrawAntchainDemosdkTwiceOneResponse> WithdrawAntchainDemosdkTwiceOneAsync(WithdrawAntchainDemosdkTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await WithdrawAntchainDemosdkTwiceOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public WithdrawAntchainDemosdkTwiceOneResponse WithdrawAntchainDemosdkTwiceOneEx(WithdrawAntchainDemosdkTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<WithdrawAntchainDemosdkTwiceOneResponse>(DoRequest("1.0", "antchain.demosdk.twice.one.withdraw", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<WithdrawAntchainDemosdkTwiceOneResponse> WithdrawAntchainDemosdkTwiceOneExAsync(WithdrawAntchainDemosdkTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<WithdrawAntchainDemosdkTwiceOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.one.withdraw", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public OperateAntchainDemosdkTwiceOneResponse OperateAntchainDemosdkTwiceOne(OperateAntchainDemosdkTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateAntchainDemosdkTwiceOneEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<OperateAntchainDemosdkTwiceOneResponse> OperateAntchainDemosdkTwiceOneAsync(OperateAntchainDemosdkTwiceOneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateAntchainDemosdkTwiceOneExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public OperateAntchainDemosdkTwiceOneResponse OperateAntchainDemosdkTwiceOneEx(OperateAntchainDemosdkTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateAntchainDemosdkTwiceOneResponse>(DoRequest("1.0", "antchain.demosdk.twice.one.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<OperateAntchainDemosdkTwiceOneResponse> OperateAntchainDemosdkTwiceOneExAsync(OperateAntchainDemosdkTwiceOneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateAntchainDemosdkTwiceOneResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.one.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public QueryAntchainDemosdkTwiceThreeResponse QueryAntchainDemosdkTwiceThree(QueryAntchainDemosdkTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkTwiceThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<QueryAntchainDemosdkTwiceThreeResponse> QueryAntchainDemosdkTwiceThreeAsync(QueryAntchainDemosdkTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkTwiceThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public QueryAntchainDemosdkTwiceThreeResponse QueryAntchainDemosdkTwiceThreeEx(QueryAntchainDemosdkTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkTwiceThreeResponse>(DoRequest("1.0", "antchain.demosdk.twice.three.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<QueryAntchainDemosdkTwiceThreeResponse> QueryAntchainDemosdkTwiceThreeExAsync(QueryAntchainDemosdkTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkTwiceThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.three.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public UnstabilizeAntchainDemosdkTwiceThreeResponse UnstabilizeAntchainDemosdkTwiceThree(UnstabilizeAntchainDemosdkTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnstabilizeAntchainDemosdkTwiceThreeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<UnstabilizeAntchainDemosdkTwiceThreeResponse> UnstabilizeAntchainDemosdkTwiceThreeAsync(UnstabilizeAntchainDemosdkTwiceThreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnstabilizeAntchainDemosdkTwiceThreeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public UnstabilizeAntchainDemosdkTwiceThreeResponse UnstabilizeAntchainDemosdkTwiceThreeEx(UnstabilizeAntchainDemosdkTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeAntchainDemosdkTwiceThreeResponse>(DoRequest("1.0", "antchain.demosdk.twice.three.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 个人工作台二期预发测试
        /// Summary: 个人工作台二期预发测试</para>
        /// </description>
        public async Task<UnstabilizeAntchainDemosdkTwiceThreeResponse> UnstabilizeAntchainDemosdkTwiceThreeExAsync(UnstabilizeAntchainDemosdkTwiceThreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnstabilizeAntchainDemosdkTwiceThreeResponse>(await DoRequestAsync("1.0", "antchain.demosdk.twice.three.unstabilize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryAntchainDemosdkTesxResponse QueryAntchainDemosdkTesx(QueryAntchainDemosdkTesxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkTesxEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryAntchainDemosdkTesxResponse> QueryAntchainDemosdkTesxAsync(QueryAntchainDemosdkTesxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkTesxExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryAntchainDemosdkTesxResponse QueryAntchainDemosdkTesxEx(QueryAntchainDemosdkTesxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkTesxResponse>(DoRequest("1.0", "antchain.demosdk.tesx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryAntchainDemosdkTesxResponse> QueryAntchainDemosdkTesxExAsync(QueryAntchainDemosdkTesxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkTesxResponse>(await DoRequestAsync("1.0", "antchain.demosdk.tesx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public TestAntchainDemosdkPreFullResponse TestAntchainDemosdkPreFull(TestAntchainDemosdkPreFullRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestAntchainDemosdkPreFullEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public async Task<TestAntchainDemosdkPreFullResponse> TestAntchainDemosdkPreFullAsync(TestAntchainDemosdkPreFullRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestAntchainDemosdkPreFullExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public TestAntchainDemosdkPreFullResponse TestAntchainDemosdkPreFullEx(TestAntchainDemosdkPreFullRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.pre.full.test",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    TestAntchainDemosdkPreFullResponse testAntchainDemosdkPreFullResponse = new TestAntchainDemosdkPreFullResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return testAntchainDemosdkPreFullResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestAntchainDemosdkPreFullResponse>(DoRequest("1.0", "antchain.demosdk.pre.full.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 1
        /// Summary: 1</para>
        /// </description>
        public async Task<TestAntchainDemosdkPreFullResponse> TestAntchainDemosdkPreFullExAsync(TestAntchainDemosdkPreFullRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.demosdk.pre.full.test",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    TestAntchainDemosdkPreFullResponse testAntchainDemosdkPreFullResponse = new TestAntchainDemosdkPreFullResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return testAntchainDemosdkPreFullResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestAntchainDemosdkPreFullResponse>(await DoRequestAsync("1.0", "antchain.demosdk.pre.full.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryAntchainDemosdkTestapiResponse QueryAntchainDemosdkTestapi(QueryAntchainDemosdkTestapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkTestapiEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryAntchainDemosdkTestapiResponse> QueryAntchainDemosdkTestapiAsync(QueryAntchainDemosdkTestapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkTestapiExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public QueryAntchainDemosdkTestapiResponse QueryAntchainDemosdkTestapiEx(QueryAntchainDemosdkTestapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkTestapiResponse>(DoRequest("1.0", "antchain.demosdk.testapi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试接口
        /// Summary: 测试接口</para>
        /// </description>
        public async Task<QueryAntchainDemosdkTestapiResponse> QueryAntchainDemosdkTestapiExAsync(QueryAntchainDemosdkTestapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkTestapiResponse>(await DoRequestAsync("1.0", "antchain.demosdk.testapi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryAntchainDemosdkTumResponse QueryAntchainDemosdkTum(QueryAntchainDemosdkTumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDemosdkTumEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryAntchainDemosdkTumResponse> QueryAntchainDemosdkTumAsync(QueryAntchainDemosdkTumRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDemosdkTumExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public QueryAntchainDemosdkTumResponse QueryAntchainDemosdkTumEx(QueryAntchainDemosdkTumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkTumResponse>(DoRequest("1.0", "antchain.demosdk.tum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试
        /// Summary: 测试</para>
        /// </description>
        public async Task<QueryAntchainDemosdkTumResponse> QueryAntchainDemosdkTumExAsync(QueryAntchainDemosdkTumRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDemosdkTumResponse>(await DoRequestAsync("1.0", "antchain.demosdk.tum.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public ZzzAntchainDemosdkAaaBbbResponse ZzzAntchainDemosdkAaaBbb(ZzzAntchainDemosdkAaaBbbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ZzzAntchainDemosdkAaaBbbEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<ZzzAntchainDemosdkAaaBbbResponse> ZzzAntchainDemosdkAaaBbbAsync(ZzzAntchainDemosdkAaaBbbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ZzzAntchainDemosdkAaaBbbExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public ZzzAntchainDemosdkAaaBbbResponse ZzzAntchainDemosdkAaaBbbEx(ZzzAntchainDemosdkAaaBbbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ZzzAntchainDemosdkAaaBbbResponse>(DoRequest("1.0", "antchain.demosdk.aaa.bbb.zzz", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 自动化测试创建test，请勿修改、删除
        /// Summary: 自动化测试创建test，请勿修改、删除</para>
        /// </description>
        public async Task<ZzzAntchainDemosdkAaaBbbResponse> ZzzAntchainDemosdkAaaBbbExAsync(ZzzAntchainDemosdkAaaBbbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ZzzAntchainDemosdkAaaBbbResponse>(await DoRequestAsync("1.0", "antchain.demosdk.aaa.bbb.zzz", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
