// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.IOTAGENT.Models;

namespace AntChain.SDK.IOTAGENT
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
                        {"sdk_version", "1.3.3"},
                        {"_prod_code", "IOTAGENT"},
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
                        {"sdk_version", "1.3.3"},
                        {"_prod_code", "IOTAGENT"},
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
        /// <para>Description: 查询租户下的userid
        /// Summary: 查询租户下的userid</para>
        /// </description>
        public QueryBlockchainBotIotagentUseridsResponse QueryBlockchainBotIotagentUserids(QueryBlockchainBotIotagentUseridsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotagentUseridsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询租户下的userid
        /// Summary: 查询租户下的userid</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentUseridsResponse> QueryBlockchainBotIotagentUseridsAsync(QueryBlockchainBotIotagentUseridsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotagentUseridsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询租户下的userid
        /// Summary: 查询租户下的userid</para>
        /// </description>
        public QueryBlockchainBotIotagentUseridsResponse QueryBlockchainBotIotagentUseridsEx(QueryBlockchainBotIotagentUseridsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentUseridsResponse>(DoRequest("1.0", "blockchain.bot.iotagent.userids.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询租户下的userid
        /// Summary: 查询租户下的userid</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentUseridsResponse> QueryBlockchainBotIotagentUseridsExAsync(QueryBlockchainBotIotagentUseridsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentUseridsResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.userids.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public TestBlockchainBotIotagentPluginResponse TestBlockchainBotIotagentPlugin(TestBlockchainBotIotagentPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TestBlockchainBotIotagentPluginEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<TestBlockchainBotIotagentPluginResponse> TestBlockchainBotIotagentPluginAsync(TestBlockchainBotIotagentPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TestBlockchainBotIotagentPluginExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public TestBlockchainBotIotagentPluginResponse TestBlockchainBotIotagentPluginEx(TestBlockchainBotIotagentPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "blockchain.bot.iotagent.plugin.test",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    TestBlockchainBotIotagentPluginResponse testBlockchainBotIotagentPluginResponse = new TestBlockchainBotIotagentPluginResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return testBlockchainBotIotagentPluginResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestBlockchainBotIotagentPluginResponse>(DoRequest("1.0", "blockchain.bot.iotagent.plugin.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 测试用
        /// Summary: 测试用</para>
        /// </description>
        public async Task<TestBlockchainBotIotagentPluginResponse> TestBlockchainBotIotagentPluginExAsync(TestBlockchainBotIotagentPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "blockchain.bot.iotagent.plugin.test",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    TestBlockchainBotIotagentPluginResponse testBlockchainBotIotagentPluginResponse = new TestBlockchainBotIotagentPluginResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return testBlockchainBotIotagentPluginResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TestBlockchainBotIotagentPluginResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.plugin.test", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 获取智能体信息
        /// Summary: 获取智能体信息</para>
        /// </description>
        public QueryBlockchainBotIoaAgentResponse QueryBlockchainBotIoaAgent(QueryBlockchainBotIoaAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIoaAgentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 获取智能体信息
        /// Summary: 获取智能体信息</para>
        /// </description>
        public async Task<QueryBlockchainBotIoaAgentResponse> QueryBlockchainBotIoaAgentAsync(QueryBlockchainBotIoaAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIoaAgentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 获取智能体信息
        /// Summary: 获取智能体信息</para>
        /// </description>
        public QueryBlockchainBotIoaAgentResponse QueryBlockchainBotIoaAgentEx(QueryBlockchainBotIoaAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIoaAgentResponse>(DoRequest("1.0", "blockchain.bot.ioa.agent.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 获取智能体信息
        /// Summary: 获取智能体信息</para>
        /// </description>
        public async Task<QueryBlockchainBotIoaAgentResponse> QueryBlockchainBotIoaAgentExAsync(QueryBlockchainBotIoaAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIoaAgentResponse>(await DoRequestAsync("1.0", "blockchain.bot.ioa.agent.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新智能体信息
        /// Summary: 更新智能体信息</para>
        /// </description>
        public SaveBlockchainBotIoaAgentResponse SaveBlockchainBotIoaAgent(SaveBlockchainBotIoaAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBlockchainBotIoaAgentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新智能体信息
        /// Summary: 更新智能体信息</para>
        /// </description>
        public async Task<SaveBlockchainBotIoaAgentResponse> SaveBlockchainBotIoaAgentAsync(SaveBlockchainBotIoaAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBlockchainBotIoaAgentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新智能体信息
        /// Summary: 更新智能体信息</para>
        /// </description>
        public SaveBlockchainBotIoaAgentResponse SaveBlockchainBotIoaAgentEx(SaveBlockchainBotIoaAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBlockchainBotIoaAgentResponse>(DoRequest("1.0", "blockchain.bot.ioa.agent.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 更新智能体信息
        /// Summary: 更新智能体信息</para>
        /// </description>
        public async Task<SaveBlockchainBotIoaAgentResponse> SaveBlockchainBotIoaAgentExAsync(SaveBlockchainBotIoaAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBlockchainBotIoaAgentResponse>(await DoRequestAsync("1.0", "blockchain.bot.ioa.agent.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询用户可选的模板列表详情
        /// Summary: 查询用户可选的模板列表详情</para>
        /// </description>
        public QueryBlockchainBotIoaTemplatesResponse QueryBlockchainBotIoaTemplates(QueryBlockchainBotIoaTemplatesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIoaTemplatesEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询用户可选的模板列表详情
        /// Summary: 查询用户可选的模板列表详情</para>
        /// </description>
        public async Task<QueryBlockchainBotIoaTemplatesResponse> QueryBlockchainBotIoaTemplatesAsync(QueryBlockchainBotIoaTemplatesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIoaTemplatesExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询用户可选的模板列表详情
        /// Summary: 查询用户可选的模板列表详情</para>
        /// </description>
        public QueryBlockchainBotIoaTemplatesResponse QueryBlockchainBotIoaTemplatesEx(QueryBlockchainBotIoaTemplatesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIoaTemplatesResponse>(DoRequest("1.0", "blockchain.bot.ioa.templates.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询用户可选的模板列表详情
        /// Summary: 查询用户可选的模板列表详情</para>
        /// </description>
        public async Task<QueryBlockchainBotIoaTemplatesResponse> QueryBlockchainBotIoaTemplatesExAsync(QueryBlockchainBotIoaTemplatesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIoaTemplatesResponse>(await DoRequestAsync("1.0", "blockchain.bot.ioa.templates.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询聊天记录
        /// Summary: 查询聊天记录</para>
        /// </description>
        public QueryBlockchainBotAgentchatHistoryResponse QueryBlockchainBotAgentchatHistory(QueryBlockchainBotAgentchatHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotAgentchatHistoryEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询聊天记录
        /// Summary: 查询聊天记录</para>
        /// </description>
        public async Task<QueryBlockchainBotAgentchatHistoryResponse> QueryBlockchainBotAgentchatHistoryAsync(QueryBlockchainBotAgentchatHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotAgentchatHistoryExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询聊天记录
        /// Summary: 查询聊天记录</para>
        /// </description>
        public QueryBlockchainBotAgentchatHistoryResponse QueryBlockchainBotAgentchatHistoryEx(QueryBlockchainBotAgentchatHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotAgentchatHistoryResponse>(DoRequest("1.0", "blockchain.bot.agentchat.history.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询聊天记录
        /// Summary: 查询聊天记录</para>
        /// </description>
        public async Task<QueryBlockchainBotAgentchatHistoryResponse> QueryBlockchainBotAgentchatHistoryExAsync(QueryBlockchainBotAgentchatHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotAgentchatHistoryResponse>(await DoRequestAsync("1.0", "blockchain.bot.agentchat.history.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询 Session 列表
        /// Summary: 查询 Session 列表</para>
        /// </description>
        public QueryBlockchainBotAgentSessionsResponse QueryBlockchainBotAgentSessions(QueryBlockchainBotAgentSessionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotAgentSessionsEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询 Session 列表
        /// Summary: 查询 Session 列表</para>
        /// </description>
        public async Task<QueryBlockchainBotAgentSessionsResponse> QueryBlockchainBotAgentSessionsAsync(QueryBlockchainBotAgentSessionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotAgentSessionsExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询 Session 列表
        /// Summary: 查询 Session 列表</para>
        /// </description>
        public QueryBlockchainBotAgentSessionsResponse QueryBlockchainBotAgentSessionsEx(QueryBlockchainBotAgentSessionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotAgentSessionsResponse>(DoRequest("1.0", "blockchain.bot.agent.sessions.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询 Session 列表
        /// Summary: 查询 Session 列表</para>
        /// </description>
        public async Task<QueryBlockchainBotAgentSessionsResponse> QueryBlockchainBotAgentSessionsExAsync(QueryBlockchainBotAgentSessionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotAgentSessionsResponse>(await DoRequestAsync("1.0", "blockchain.bot.agent.sessions.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询ai设备可用状态
        /// Summary: 查询ai设备可用状态</para>
        /// </description>
        public QueryBlockchainBotIotagentAideviceResponse QueryBlockchainBotIotagentAidevice(QueryBlockchainBotIotagentAideviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotagentAideviceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询ai设备可用状态
        /// Summary: 查询ai设备可用状态</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentAideviceResponse> QueryBlockchainBotIotagentAideviceAsync(QueryBlockchainBotIotagentAideviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotagentAideviceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询ai设备可用状态
        /// Summary: 查询ai设备可用状态</para>
        /// </description>
        public QueryBlockchainBotIotagentAideviceResponse QueryBlockchainBotIotagentAideviceEx(QueryBlockchainBotIotagentAideviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentAideviceResponse>(DoRequest("1.0", "blockchain.bot.iotagent.aidevice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询ai设备可用状态
        /// Summary: 查询ai设备可用状态</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentAideviceResponse> QueryBlockchainBotIotagentAideviceExAsync(QueryBlockchainBotIotagentAideviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentAideviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.aidevice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询物模型上报数据时间范围
        /// Summary: 查询物模型上报数据时间范围</para>
        /// </description>
        public QueryBlockchainBotIotagentThingmodelrangeResponse QueryBlockchainBotIotagentThingmodelrange(QueryBlockchainBotIotagentThingmodelrangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotagentThingmodelrangeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询物模型上报数据时间范围
        /// Summary: 查询物模型上报数据时间范围</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentThingmodelrangeResponse> QueryBlockchainBotIotagentThingmodelrangeAsync(QueryBlockchainBotIotagentThingmodelrangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotagentThingmodelrangeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询物模型上报数据时间范围
        /// Summary: 查询物模型上报数据时间范围</para>
        /// </description>
        public QueryBlockchainBotIotagentThingmodelrangeResponse QueryBlockchainBotIotagentThingmodelrangeEx(QueryBlockchainBotIotagentThingmodelrangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentThingmodelrangeResponse>(DoRequest("1.0", "blockchain.bot.iotagent.thingmodelrange.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询物模型上报数据时间范围
        /// Summary: 查询物模型上报数据时间范围</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentThingmodelrangeResponse> QueryBlockchainBotIotagentThingmodelrangeExAsync(QueryBlockchainBotIotagentThingmodelrangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentThingmodelrangeResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.thingmodelrange.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询物模型上报数据
        /// Summary: 查询物模型上报数据</para>
        /// </description>
        public QueryBlockchainBotIotagentThingmodeldataResponse QueryBlockchainBotIotagentThingmodeldata(QueryBlockchainBotIotagentThingmodeldataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotagentThingmodeldataEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询物模型上报数据
        /// Summary: 查询物模型上报数据</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentThingmodeldataResponse> QueryBlockchainBotIotagentThingmodeldataAsync(QueryBlockchainBotIotagentThingmodeldataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotagentThingmodeldataExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询物模型上报数据
        /// Summary: 查询物模型上报数据</para>
        /// </description>
        public QueryBlockchainBotIotagentThingmodeldataResponse QueryBlockchainBotIotagentThingmodeldataEx(QueryBlockchainBotIotagentThingmodeldataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentThingmodeldataResponse>(DoRequest("1.0", "blockchain.bot.iotagent.thingmodeldata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询物模型上报数据
        /// Summary: 查询物模型上报数据</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentThingmodeldataResponse> QueryBlockchainBotIotagentThingmodeldataExAsync(QueryBlockchainBotIotagentThingmodeldataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentThingmodeldataResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.thingmodeldata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: IoT智能体插件签约URL获取接口
        /// Summary: IoT智能体插件签约URL获取接口</para>
        /// </description>
        public GetsignurlBlockchainBotIotagentPlugincontractResponse GetsignurlBlockchainBotIotagentPlugincontract(GetsignurlBlockchainBotIotagentPlugincontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetsignurlBlockchainBotIotagentPlugincontractEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: IoT智能体插件签约URL获取接口
        /// Summary: IoT智能体插件签约URL获取接口</para>
        /// </description>
        public async Task<GetsignurlBlockchainBotIotagentPlugincontractResponse> GetsignurlBlockchainBotIotagentPlugincontractAsync(GetsignurlBlockchainBotIotagentPlugincontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetsignurlBlockchainBotIotagentPlugincontractExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: IoT智能体插件签约URL获取接口
        /// Summary: IoT智能体插件签约URL获取接口</para>
        /// </description>
        public GetsignurlBlockchainBotIotagentPlugincontractResponse GetsignurlBlockchainBotIotagentPlugincontractEx(GetsignurlBlockchainBotIotagentPlugincontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetsignurlBlockchainBotIotagentPlugincontractResponse>(DoRequest("1.0", "blockchain.bot.iotagent.plugincontract.getsignurl", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: IoT智能体插件签约URL获取接口
        /// Summary: IoT智能体插件签约URL获取接口</para>
        /// </description>
        public async Task<GetsignurlBlockchainBotIotagentPlugincontractResponse> GetsignurlBlockchainBotIotagentPlugincontractExAsync(GetsignurlBlockchainBotIotagentPlugincontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetsignurlBlockchainBotIotagentPlugincontractResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.plugincontract.getsignurl", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: IoT智能体插件签约查询接口
        /// Summary: IoT智能体插件签约查询接口</para>
        /// </description>
        public QueryBlockchainBotIotagentPlugincontractResponse QueryBlockchainBotIotagentPlugincontract(QueryBlockchainBotIotagentPlugincontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotagentPlugincontractEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: IoT智能体插件签约查询接口
        /// Summary: IoT智能体插件签约查询接口</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentPlugincontractResponse> QueryBlockchainBotIotagentPlugincontractAsync(QueryBlockchainBotIotagentPlugincontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotagentPlugincontractExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: IoT智能体插件签约查询接口
        /// Summary: IoT智能体插件签约查询接口</para>
        /// </description>
        public QueryBlockchainBotIotagentPlugincontractResponse QueryBlockchainBotIotagentPlugincontractEx(QueryBlockchainBotIotagentPlugincontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentPlugincontractResponse>(DoRequest("1.0", "blockchain.bot.iotagent.plugincontract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: IoT智能体插件签约查询接口
        /// Summary: IoT智能体插件签约查询接口</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentPlugincontractResponse> QueryBlockchainBotIotagentPlugincontractExAsync(QueryBlockchainBotIotagentPlugincontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentPlugincontractResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.plugincontract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据tenant获取tenant下的userId
        /// Summary: 根据tenant获取tenant下的userId</para>
        /// </description>
        public QueryBlockchainBotIotagentUseridResponse QueryBlockchainBotIotagentUserid(QueryBlockchainBotIotagentUseridRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotagentUseridEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据tenant获取tenant下的userId
        /// Summary: 根据tenant获取tenant下的userId</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentUseridResponse> QueryBlockchainBotIotagentUseridAsync(QueryBlockchainBotIotagentUseridRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotagentUseridExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据tenant获取tenant下的userId
        /// Summary: 根据tenant获取tenant下的userId</para>
        /// </description>
        public QueryBlockchainBotIotagentUseridResponse QueryBlockchainBotIotagentUseridEx(QueryBlockchainBotIotagentUseridRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentUseridResponse>(DoRequest("1.0", "blockchain.bot.iotagent.userid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据tenant获取tenant下的userId
        /// Summary: 根据tenant获取tenant下的userId</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentUseridResponse> QueryBlockchainBotIotagentUseridExAsync(QueryBlockchainBotIotagentUseridRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentUseridResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.userid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据tenant获取featureId
        /// Summary: 根据tenant获取featureId</para>
        /// </description>
        public QueryBlockchainBotIotagentFeatureResponse QueryBlockchainBotIotagentFeature(QueryBlockchainBotIotagentFeatureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotagentFeatureEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据tenant获取featureId
        /// Summary: 根据tenant获取featureId</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentFeatureResponse> QueryBlockchainBotIotagentFeatureAsync(QueryBlockchainBotIotagentFeatureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotagentFeatureExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据tenant获取featureId
        /// Summary: 根据tenant获取featureId</para>
        /// </description>
        public QueryBlockchainBotIotagentFeatureResponse QueryBlockchainBotIotagentFeatureEx(QueryBlockchainBotIotagentFeatureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentFeatureResponse>(DoRequest("1.0", "blockchain.bot.iotagent.feature.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 根据tenant获取featureId
        /// Summary: 根据tenant获取featureId</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentFeatureResponse> QueryBlockchainBotIotagentFeatureExAsync(QueryBlockchainBotIotagentFeatureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentFeatureResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.feature.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体创建
        /// Summary: 智能体创建</para>
        /// </description>
        public CreateBlockchainBotIotagentAgentResponse CreateBlockchainBotIotagentAgent(CreateBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlockchainBotIotagentAgentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体创建
        /// Summary: 智能体创建</para>
        /// </description>
        public async Task<CreateBlockchainBotIotagentAgentResponse> CreateBlockchainBotIotagentAgentAsync(CreateBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlockchainBotIotagentAgentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体创建
        /// Summary: 智能体创建</para>
        /// </description>
        public CreateBlockchainBotIotagentAgentResponse CreateBlockchainBotIotagentAgentEx(CreateBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBotIotagentAgentResponse>(DoRequest("1.0", "blockchain.bot.iotagent.agent.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体创建
        /// Summary: 智能体创建</para>
        /// </description>
        public async Task<CreateBlockchainBotIotagentAgentResponse> CreateBlockchainBotIotagentAgentExAsync(CreateBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBotIotagentAgentResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.agent.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体更新
        /// Summary: 智能体更新</para>
        /// </description>
        public UpdateBlockchainBotIotagentAgentResponse UpdateBlockchainBotIotagentAgent(UpdateBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBlockchainBotIotagentAgentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体更新
        /// Summary: 智能体更新</para>
        /// </description>
        public async Task<UpdateBlockchainBotIotagentAgentResponse> UpdateBlockchainBotIotagentAgentAsync(UpdateBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBlockchainBotIotagentAgentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体更新
        /// Summary: 智能体更新</para>
        /// </description>
        public UpdateBlockchainBotIotagentAgentResponse UpdateBlockchainBotIotagentAgentEx(UpdateBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBlockchainBotIotagentAgentResponse>(DoRequest("1.0", "blockchain.bot.iotagent.agent.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体更新
        /// Summary: 智能体更新</para>
        /// </description>
        public async Task<UpdateBlockchainBotIotagentAgentResponse> UpdateBlockchainBotIotagentAgentExAsync(UpdateBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBlockchainBotIotagentAgentResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.agent.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体删除
        /// Summary: 智能体删除</para>
        /// </description>
        public DeleteBlockchainBotIotagentAgentResponse DeleteBlockchainBotIotagentAgent(DeleteBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteBlockchainBotIotagentAgentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体删除
        /// Summary: 智能体删除</para>
        /// </description>
        public async Task<DeleteBlockchainBotIotagentAgentResponse> DeleteBlockchainBotIotagentAgentAsync(DeleteBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteBlockchainBotIotagentAgentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体删除
        /// Summary: 智能体删除</para>
        /// </description>
        public DeleteBlockchainBotIotagentAgentResponse DeleteBlockchainBotIotagentAgentEx(DeleteBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBlockchainBotIotagentAgentResponse>(DoRequest("1.0", "blockchain.bot.iotagent.agent.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体删除
        /// Summary: 智能体删除</para>
        /// </description>
        public async Task<DeleteBlockchainBotIotagentAgentResponse> DeleteBlockchainBotIotagentAgentExAsync(DeleteBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBlockchainBotIotagentAgentResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.agent.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体列表
        /// Summary: 智能体列表</para>
        /// </description>
        public ListBlockchainBotIotagentAgentResponse ListBlockchainBotIotagentAgent(ListBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBlockchainBotIotagentAgentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体列表
        /// Summary: 智能体列表</para>
        /// </description>
        public async Task<ListBlockchainBotIotagentAgentResponse> ListBlockchainBotIotagentAgentAsync(ListBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBlockchainBotIotagentAgentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体列表
        /// Summary: 智能体列表</para>
        /// </description>
        public ListBlockchainBotIotagentAgentResponse ListBlockchainBotIotagentAgentEx(ListBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBlockchainBotIotagentAgentResponse>(DoRequest("1.0", "blockchain.bot.iotagent.agent.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体列表
        /// Summary: 智能体列表</para>
        /// </description>
        public async Task<ListBlockchainBotIotagentAgentResponse> ListBlockchainBotIotagentAgentExAsync(ListBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBlockchainBotIotagentAgentResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.agent.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体团队创建
        /// Summary: 智能体团队创建</para>
        /// </description>
        public CreateBlockchainBotIotagentAgentteamResponse CreateBlockchainBotIotagentAgentteam(CreateBlockchainBotIotagentAgentteamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlockchainBotIotagentAgentteamEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体团队创建
        /// Summary: 智能体团队创建</para>
        /// </description>
        public async Task<CreateBlockchainBotIotagentAgentteamResponse> CreateBlockchainBotIotagentAgentteamAsync(CreateBlockchainBotIotagentAgentteamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlockchainBotIotagentAgentteamExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体团队创建
        /// Summary: 智能体团队创建</para>
        /// </description>
        public CreateBlockchainBotIotagentAgentteamResponse CreateBlockchainBotIotagentAgentteamEx(CreateBlockchainBotIotagentAgentteamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBotIotagentAgentteamResponse>(DoRequest("1.0", "blockchain.bot.iotagent.agentteam.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体团队创建
        /// Summary: 智能体团队创建</para>
        /// </description>
        public async Task<CreateBlockchainBotIotagentAgentteamResponse> CreateBlockchainBotIotagentAgentteamExAsync(CreateBlockchainBotIotagentAgentteamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBotIotagentAgentteamResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.agentteam.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体团队编辑
        /// Summary: 智能体团队编辑</para>
        /// </description>
        public UpdateBlockchainBotIotagentAgentteamResponse UpdateBlockchainBotIotagentAgentteam(UpdateBlockchainBotIotagentAgentteamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBlockchainBotIotagentAgentteamEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体团队编辑
        /// Summary: 智能体团队编辑</para>
        /// </description>
        public async Task<UpdateBlockchainBotIotagentAgentteamResponse> UpdateBlockchainBotIotagentAgentteamAsync(UpdateBlockchainBotIotagentAgentteamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBlockchainBotIotagentAgentteamExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体团队编辑
        /// Summary: 智能体团队编辑</para>
        /// </description>
        public UpdateBlockchainBotIotagentAgentteamResponse UpdateBlockchainBotIotagentAgentteamEx(UpdateBlockchainBotIotagentAgentteamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBlockchainBotIotagentAgentteamResponse>(DoRequest("1.0", "blockchain.bot.iotagent.agentteam.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体团队编辑
        /// Summary: 智能体团队编辑</para>
        /// </description>
        public async Task<UpdateBlockchainBotIotagentAgentteamResponse> UpdateBlockchainBotIotagentAgentteamExAsync(UpdateBlockchainBotIotagentAgentteamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBlockchainBotIotagentAgentteamResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.agentteam.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体详情
        /// Summary: 智能体详情</para>
        /// </description>
        public DetailBlockchainBotIotagentAgentResponse DetailBlockchainBotIotagentAgent(DetailBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailBlockchainBotIotagentAgentEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体详情
        /// Summary: 智能体详情</para>
        /// </description>
        public async Task<DetailBlockchainBotIotagentAgentResponse> DetailBlockchainBotIotagentAgentAsync(DetailBlockchainBotIotagentAgentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailBlockchainBotIotagentAgentExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体详情
        /// Summary: 智能体详情</para>
        /// </description>
        public DetailBlockchainBotIotagentAgentResponse DetailBlockchainBotIotagentAgentEx(DetailBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailBlockchainBotIotagentAgentResponse>(DoRequest("1.0", "blockchain.bot.iotagent.agent.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体详情
        /// Summary: 智能体详情</para>
        /// </description>
        public async Task<DetailBlockchainBotIotagentAgentResponse> DetailBlockchainBotIotagentAgentExAsync(DetailBlockchainBotIotagentAgentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailBlockchainBotIotagentAgentResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.agent.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session创建
        /// Summary: session创建</para>
        /// </description>
        public CreateBlockchainBotIotagentSessionResponse CreateBlockchainBotIotagentSession(CreateBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session创建
        /// Summary: session创建</para>
        /// </description>
        public async Task<CreateBlockchainBotIotagentSessionResponse> CreateBlockchainBotIotagentSessionAsync(CreateBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session创建
        /// Summary: session创建</para>
        /// </description>
        public CreateBlockchainBotIotagentSessionResponse CreateBlockchainBotIotagentSessionEx(CreateBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session创建
        /// Summary: session创建</para>
        /// </description>
        public async Task<CreateBlockchainBotIotagentSessionResponse> CreateBlockchainBotIotagentSessionExAsync(CreateBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: seesion名字修改
        /// Summary: seesion名字修改</para>
        /// </description>
        public RenameBlockchainBotIotagentSessionResponse RenameBlockchainBotIotagentSession(RenameBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RenameBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: seesion名字修改
        /// Summary: seesion名字修改</para>
        /// </description>
        public async Task<RenameBlockchainBotIotagentSessionResponse> RenameBlockchainBotIotagentSessionAsync(RenameBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RenameBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: seesion名字修改
        /// Summary: seesion名字修改</para>
        /// </description>
        public RenameBlockchainBotIotagentSessionResponse RenameBlockchainBotIotagentSessionEx(RenameBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenameBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.rename", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: seesion名字修改
        /// Summary: seesion名字修改</para>
        /// </description>
        public async Task<RenameBlockchainBotIotagentSessionResponse> RenameBlockchainBotIotagentSessionExAsync(RenameBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RenameBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.rename", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session删除
        /// Summary: session删除</para>
        /// </description>
        public DeleteBlockchainBotIotagentSessionResponse DeleteBlockchainBotIotagentSession(DeleteBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session删除
        /// Summary: session删除</para>
        /// </description>
        public async Task<DeleteBlockchainBotIotagentSessionResponse> DeleteBlockchainBotIotagentSessionAsync(DeleteBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session删除
        /// Summary: session删除</para>
        /// </description>
        public DeleteBlockchainBotIotagentSessionResponse DeleteBlockchainBotIotagentSessionEx(DeleteBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session删除
        /// Summary: session删除</para>
        /// </description>
        public async Task<DeleteBlockchainBotIotagentSessionResponse> DeleteBlockchainBotIotagentSessionExAsync(DeleteBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session对话历史
        /// Summary: session对话历史</para>
        /// </description>
        public HistoryBlockchainBotIotagentSessionResponse HistoryBlockchainBotIotagentSession(HistoryBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return HistoryBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session对话历史
        /// Summary: session对话历史</para>
        /// </description>
        public async Task<HistoryBlockchainBotIotagentSessionResponse> HistoryBlockchainBotIotagentSessionAsync(HistoryBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await HistoryBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session对话历史
        /// Summary: session对话历史</para>
        /// </description>
        public HistoryBlockchainBotIotagentSessionResponse HistoryBlockchainBotIotagentSessionEx(HistoryBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<HistoryBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.history", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session对话历史
        /// Summary: session对话历史</para>
        /// </description>
        public async Task<HistoryBlockchainBotIotagentSessionResponse> HistoryBlockchainBotIotagentSessionExAsync(HistoryBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<HistoryBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.history", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session 列表
        /// Summary: session 列表</para>
        /// </description>
        public ListBlockchainBotIotagentSessionResponse ListBlockchainBotIotagentSession(ListBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session 列表
        /// Summary: session 列表</para>
        /// </description>
        public async Task<ListBlockchainBotIotagentSessionResponse> ListBlockchainBotIotagentSessionAsync(ListBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session 列表
        /// Summary: session 列表</para>
        /// </description>
        public ListBlockchainBotIotagentSessionResponse ListBlockchainBotIotagentSessionEx(ListBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session 列表
        /// Summary: session 列表</para>
        /// </description>
        public async Task<ListBlockchainBotIotagentSessionResponse> ListBlockchainBotIotagentSessionExAsync(ListBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: sse聊天
        /// Summary: sse聊天</para>
        /// </description>
        public ChatBlockchainBotIotagentSessionResponse ChatBlockchainBotIotagentSession(ChatBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ChatBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: sse聊天
        /// Summary: sse聊天</para>
        /// </description>
        public async Task<ChatBlockchainBotIotagentSessionResponse> ChatBlockchainBotIotagentSessionAsync(ChatBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ChatBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: sse聊天
        /// Summary: sse聊天</para>
        /// </description>
        public ChatBlockchainBotIotagentSessionResponse ChatBlockchainBotIotagentSessionEx(ChatBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChatBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.chat", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: sse聊天
        /// Summary: sse聊天</para>
        /// </description>
        public async Task<ChatBlockchainBotIotagentSessionResponse> ChatBlockchainBotIotagentSessionExAsync(ChatBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChatBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.chat", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 会话打断
        /// Summary: 会话打断</para>
        /// </description>
        public InterruptBlockchainBotIotagentSessionResponse InterruptBlockchainBotIotagentSession(InterruptBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InterruptBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 会话打断
        /// Summary: 会话打断</para>
        /// </description>
        public async Task<InterruptBlockchainBotIotagentSessionResponse> InterruptBlockchainBotIotagentSessionAsync(InterruptBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InterruptBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 会话打断
        /// Summary: 会话打断</para>
        /// </description>
        public InterruptBlockchainBotIotagentSessionResponse InterruptBlockchainBotIotagentSessionEx(InterruptBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InterruptBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.interrupt", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 会话打断
        /// Summary: 会话打断</para>
        /// </description>
        public async Task<InterruptBlockchainBotIotagentSessionResponse> InterruptBlockchainBotIotagentSessionExAsync(InterruptBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InterruptBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.interrupt", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体消息/指令推送
        /// Summary: 智能体消息/指令推送</para>
        /// </description>
        public PushBlockchainBotIotagentMessageResponse PushBlockchainBotIotagentMessage(PushBlockchainBotIotagentMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushBlockchainBotIotagentMessageEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体消息/指令推送
        /// Summary: 智能体消息/指令推送</para>
        /// </description>
        public async Task<PushBlockchainBotIotagentMessageResponse> PushBlockchainBotIotagentMessageAsync(PushBlockchainBotIotagentMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushBlockchainBotIotagentMessageExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体消息/指令推送
        /// Summary: 智能体消息/指令推送</para>
        /// </description>
        public PushBlockchainBotIotagentMessageResponse PushBlockchainBotIotagentMessageEx(PushBlockchainBotIotagentMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushBlockchainBotIotagentMessageResponse>(DoRequest("1.0", "blockchain.bot.iotagent.message.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 智能体消息/指令推送
        /// Summary: 智能体消息/指令推送</para>
        /// </description>
        public async Task<PushBlockchainBotIotagentMessageResponse> PushBlockchainBotIotagentMessageExAsync(PushBlockchainBotIotagentMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushBlockchainBotIotagentMessageResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.message.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询智能体消息/指令推送状态
        /// Summary: 查询智能体消息/指令推送状态</para>
        /// </description>
        public QuerypushstatusBlockchainBotIotagentMessageResponse QuerypushstatusBlockchainBotIotagentMessage(QuerypushstatusBlockchainBotIotagentMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerypushstatusBlockchainBotIotagentMessageEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询智能体消息/指令推送状态
        /// Summary: 查询智能体消息/指令推送状态</para>
        /// </description>
        public async Task<QuerypushstatusBlockchainBotIotagentMessageResponse> QuerypushstatusBlockchainBotIotagentMessageAsync(QuerypushstatusBlockchainBotIotagentMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerypushstatusBlockchainBotIotagentMessageExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询智能体消息/指令推送状态
        /// Summary: 查询智能体消息/指令推送状态</para>
        /// </description>
        public QuerypushstatusBlockchainBotIotagentMessageResponse QuerypushstatusBlockchainBotIotagentMessageEx(QuerypushstatusBlockchainBotIotagentMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerypushstatusBlockchainBotIotagentMessageResponse>(DoRequest("1.0", "blockchain.bot.iotagent.message.querypushstatus", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询智能体消息/指令推送状态
        /// Summary: 查询智能体消息/指令推送状态</para>
        /// </description>
        public async Task<QuerypushstatusBlockchainBotIotagentMessageResponse> QuerypushstatusBlockchainBotIotagentMessageExAsync(QuerypushstatusBlockchainBotIotagentMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerypushstatusBlockchainBotIotagentMessageResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.message.querypushstatus", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session下的文件列表
        /// Summary: session下的文件列表</para>
        /// </description>
        public ListfilesBlockchainBotIotagentSessionResponse ListfilesBlockchainBotIotagentSession(ListfilesBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListfilesBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session下的文件列表
        /// Summary: session下的文件列表</para>
        /// </description>
        public async Task<ListfilesBlockchainBotIotagentSessionResponse> ListfilesBlockchainBotIotagentSessionAsync(ListfilesBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListfilesBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session下的文件列表
        /// Summary: session下的文件列表</para>
        /// </description>
        public ListfilesBlockchainBotIotagentSessionResponse ListfilesBlockchainBotIotagentSessionEx(ListfilesBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListfilesBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.listfiles", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: session下的文件列表
        /// Summary: session下的文件列表</para>
        /// </description>
        public async Task<ListfilesBlockchainBotIotagentSessionResponse> ListfilesBlockchainBotIotagentSessionExAsync(ListfilesBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListfilesBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.listfiles", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件下载
        /// Summary: 文件下载</para>
        /// </description>
        public FliedownloadBlockchainBotIotagentSessionResponse FliedownloadBlockchainBotIotagentSession(FliedownloadBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FliedownloadBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件下载
        /// Summary: 文件下载</para>
        /// </description>
        public async Task<FliedownloadBlockchainBotIotagentSessionResponse> FliedownloadBlockchainBotIotagentSessionAsync(FliedownloadBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FliedownloadBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件下载
        /// Summary: 文件下载</para>
        /// </description>
        public FliedownloadBlockchainBotIotagentSessionResponse FliedownloadBlockchainBotIotagentSessionEx(FliedownloadBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FliedownloadBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.fliedownload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件下载
        /// Summary: 文件下载</para>
        /// </description>
        public async Task<FliedownloadBlockchainBotIotagentSessionResponse> FliedownloadBlockchainBotIotagentSessionExAsync(FliedownloadBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FliedownloadBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.fliedownload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件预览
        /// Summary: 文件预览</para>
        /// </description>
        public FilepreviewBlockchainBotIotagentSessionResponse FilepreviewBlockchainBotIotagentSession(FilepreviewBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FilepreviewBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件预览
        /// Summary: 文件预览</para>
        /// </description>
        public async Task<FilepreviewBlockchainBotIotagentSessionResponse> FilepreviewBlockchainBotIotagentSessionAsync(FilepreviewBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FilepreviewBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件预览
        /// Summary: 文件预览</para>
        /// </description>
        public FilepreviewBlockchainBotIotagentSessionResponse FilepreviewBlockchainBotIotagentSessionEx(FilepreviewBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FilepreviewBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.filepreview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件预览
        /// Summary: 文件预览</para>
        /// </description>
        public async Task<FilepreviewBlockchainBotIotagentSessionResponse> FilepreviewBlockchainBotIotagentSessionExAsync(FilepreviewBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FilepreviewBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.filepreview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 插件接口
        /// Summary: 插件接口</para>
        /// </description>
        public PushBlockchainBotIotagentAudioscribeResponse PushBlockchainBotIotagentAudioscribe(PushBlockchainBotIotagentAudioscribeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushBlockchainBotIotagentAudioscribeEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 插件接口
        /// Summary: 插件接口</para>
        /// </description>
        public async Task<PushBlockchainBotIotagentAudioscribeResponse> PushBlockchainBotIotagentAudioscribeAsync(PushBlockchainBotIotagentAudioscribeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushBlockchainBotIotagentAudioscribeExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 插件接口
        /// Summary: 插件接口</para>
        /// </description>
        public PushBlockchainBotIotagentAudioscribeResponse PushBlockchainBotIotagentAudioscribeEx(PushBlockchainBotIotagentAudioscribeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "blockchain.bot.iotagent.audioscribe.push",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    PushBlockchainBotIotagentAudioscribeResponse pushBlockchainBotIotagentAudioscribeResponse = new PushBlockchainBotIotagentAudioscribeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return pushBlockchainBotIotagentAudioscribeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushBlockchainBotIotagentAudioscribeResponse>(DoRequest("1.0", "blockchain.bot.iotagent.audioscribe.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 插件接口
        /// Summary: 插件接口</para>
        /// </description>
        public async Task<PushBlockchainBotIotagentAudioscribeResponse> PushBlockchainBotIotagentAudioscribeExAsync(PushBlockchainBotIotagentAudioscribeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "blockchain.bot.iotagent.audioscribe.push",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    PushBlockchainBotIotagentAudioscribeResponse pushBlockchainBotIotagentAudioscribeResponse = new PushBlockchainBotIotagentAudioscribeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return pushBlockchainBotIotagentAudioscribeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushBlockchainBotIotagentAudioscribeResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.audioscribe.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 插件通用HTTP接口
        /// Summary: 插件通用HTTP接口</para>
        /// </description>
        public ExecBlockchainBotIotagentPluginResponse ExecBlockchainBotIotagentPlugin(ExecBlockchainBotIotagentPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecBlockchainBotIotagentPluginEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 插件通用HTTP接口
        /// Summary: 插件通用HTTP接口</para>
        /// </description>
        public async Task<ExecBlockchainBotIotagentPluginResponse> ExecBlockchainBotIotagentPluginAsync(ExecBlockchainBotIotagentPluginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecBlockchainBotIotagentPluginExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 插件通用HTTP接口
        /// Summary: 插件通用HTTP接口</para>
        /// </description>
        public ExecBlockchainBotIotagentPluginResponse ExecBlockchainBotIotagentPluginEx(ExecBlockchainBotIotagentPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecBlockchainBotIotagentPluginResponse>(DoRequest("1.0", "blockchain.bot.iotagent.plugin.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 插件通用HTTP接口
        /// Summary: 插件通用HTTP接口</para>
        /// </description>
        public async Task<ExecBlockchainBotIotagentPluginResponse> ExecBlockchainBotIotagentPluginExAsync(ExecBlockchainBotIotagentPluginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecBlockchainBotIotagentPluginResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.plugin.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传
        /// Summary: 文件上传</para>
        /// </description>
        public PushBlockchainBotIotagentWorkspaceResponse PushBlockchainBotIotagentWorkspace(PushBlockchainBotIotagentWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushBlockchainBotIotagentWorkspaceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传
        /// Summary: 文件上传</para>
        /// </description>
        public async Task<PushBlockchainBotIotagentWorkspaceResponse> PushBlockchainBotIotagentWorkspaceAsync(PushBlockchainBotIotagentWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushBlockchainBotIotagentWorkspaceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传
        /// Summary: 文件上传</para>
        /// </description>
        public PushBlockchainBotIotagentWorkspaceResponse PushBlockchainBotIotagentWorkspaceEx(PushBlockchainBotIotagentWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushBlockchainBotIotagentWorkspaceResponse>(DoRequest("1.0", "blockchain.bot.iotagent.workspace.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传
        /// Summary: 文件上传</para>
        /// </description>
        public async Task<PushBlockchainBotIotagentWorkspaceResponse> PushBlockchainBotIotagentWorkspaceExAsync(PushBlockchainBotIotagentWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushBlockchainBotIotagentWorkspaceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.workspace.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传确认
        /// Summary: 文件上传确认</para>
        /// </description>
        public ConfirmBlockchainBotIotagentWorkspaceResponse ConfirmBlockchainBotIotagentWorkspace(ConfirmBlockchainBotIotagentWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmBlockchainBotIotagentWorkspaceEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传确认
        /// Summary: 文件上传确认</para>
        /// </description>
        public async Task<ConfirmBlockchainBotIotagentWorkspaceResponse> ConfirmBlockchainBotIotagentWorkspaceAsync(ConfirmBlockchainBotIotagentWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmBlockchainBotIotagentWorkspaceExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传确认
        /// Summary: 文件上传确认</para>
        /// </description>
        public ConfirmBlockchainBotIotagentWorkspaceResponse ConfirmBlockchainBotIotagentWorkspaceEx(ConfirmBlockchainBotIotagentWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmBlockchainBotIotagentWorkspaceResponse>(DoRequest("1.0", "blockchain.bot.iotagent.workspace.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 文件上传确认
        /// Summary: 文件上传确认</para>
        /// </description>
        public async Task<ConfirmBlockchainBotIotagentWorkspaceResponse> ConfirmBlockchainBotIotagentWorkspaceExAsync(ConfirmBlockchainBotIotagentWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmBlockchainBotIotagentWorkspaceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.workspace.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询设备的云音乐登录状态及用户/VIP 信息。
        /// Summary: 查询设备的云音乐登录状态及用户/VIP 信息。</para>
        /// </description>
        public StatusBlockchainBotIotagentMusicResponse StatusBlockchainBotIotagentMusic(StatusBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StatusBlockchainBotIotagentMusicEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询设备的云音乐登录状态及用户/VIP 信息。
        /// Summary: 查询设备的云音乐登录状态及用户/VIP 信息。</para>
        /// </description>
        public async Task<StatusBlockchainBotIotagentMusicResponse> StatusBlockchainBotIotagentMusicAsync(StatusBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StatusBlockchainBotIotagentMusicExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询设备的云音乐登录状态及用户/VIP 信息。
        /// Summary: 查询设备的云音乐登录状态及用户/VIP 信息。</para>
        /// </description>
        public StatusBlockchainBotIotagentMusicResponse StatusBlockchainBotIotagentMusicEx(StatusBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StatusBlockchainBotIotagentMusicResponse>(DoRequest("1.0", "blockchain.bot.iotagent.music.status", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询设备的云音乐登录状态及用户/VIP 信息。
        /// Summary: 查询设备的云音乐登录状态及用户/VIP 信息。</para>
        /// </description>
        public async Task<StatusBlockchainBotIotagentMusicResponse> StatusBlockchainBotIotagentMusicExAsync(StatusBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StatusBlockchainBotIotagentMusicResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.music.status", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        /// Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）</para>
        /// </description>
        public LoginurlBlockchainBotIotagentMusicResponse LoginurlBlockchainBotIotagentMusic(LoginurlBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoginurlBlockchainBotIotagentMusicEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        /// Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）</para>
        /// </description>
        public async Task<LoginurlBlockchainBotIotagentMusicResponse> LoginurlBlockchainBotIotagentMusicAsync(LoginurlBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoginurlBlockchainBotIotagentMusicExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        /// Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）</para>
        /// </description>
        public LoginurlBlockchainBotIotagentMusicResponse LoginurlBlockchainBotIotagentMusicEx(LoginurlBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoginurlBlockchainBotIotagentMusicResponse>(DoRequest("1.0", "blockchain.bot.iotagent.music.loginurl", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）
        /// Summary: 获取云音乐 H5 OAuth 登录 URL（用于设备端引导用户授权）</para>
        /// </description>
        public async Task<LoginurlBlockchainBotIotagentMusicResponse> LoginurlBlockchainBotIotagentMusicExAsync(LoginurlBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoginurlBlockchainBotIotagentMusicResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.music.loginurl", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询云音乐播放历史
        /// Summary: 查询云音乐播放历史</para>
        /// </description>
        public PlayhistoryBlockchainBotIotagentMusicResponse PlayhistoryBlockchainBotIotagentMusic(PlayhistoryBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PlayhistoryBlockchainBotIotagentMusicEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询云音乐播放历史
        /// Summary: 查询云音乐播放历史</para>
        /// </description>
        public async Task<PlayhistoryBlockchainBotIotagentMusicResponse> PlayhistoryBlockchainBotIotagentMusicAsync(PlayhistoryBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PlayhistoryBlockchainBotIotagentMusicExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询云音乐播放历史
        /// Summary: 查询云音乐播放历史</para>
        /// </description>
        public PlayhistoryBlockchainBotIotagentMusicResponse PlayhistoryBlockchainBotIotagentMusicEx(PlayhistoryBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PlayhistoryBlockchainBotIotagentMusicResponse>(DoRequest("1.0", "blockchain.bot.iotagent.music.playhistory", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询云音乐播放历史
        /// Summary: 查询云音乐播放历史</para>
        /// </description>
        public async Task<PlayhistoryBlockchainBotIotagentMusicResponse> PlayhistoryBlockchainBotIotagentMusicExAsync(PlayhistoryBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PlayhistoryBlockchainBotIotagentMusicResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.music.playhistory", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 分页查询红心歌曲
        /// Summary: 分页查询红心歌曲</para>
        /// </description>
        public FavoritesBlockchainBotIotagentMusicResponse FavoritesBlockchainBotIotagentMusic(FavoritesBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FavoritesBlockchainBotIotagentMusicEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 分页查询红心歌曲
        /// Summary: 分页查询红心歌曲</para>
        /// </description>
        public async Task<FavoritesBlockchainBotIotagentMusicResponse> FavoritesBlockchainBotIotagentMusicAsync(FavoritesBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FavoritesBlockchainBotIotagentMusicExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 分页查询红心歌曲
        /// Summary: 分页查询红心歌曲</para>
        /// </description>
        public FavoritesBlockchainBotIotagentMusicResponse FavoritesBlockchainBotIotagentMusicEx(FavoritesBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FavoritesBlockchainBotIotagentMusicResponse>(DoRequest("1.0", "blockchain.bot.iotagent.music.favorites", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 分页查询红心歌曲
        /// Summary: 分页查询红心歌曲</para>
        /// </description>
        public async Task<FavoritesBlockchainBotIotagentMusicResponse> FavoritesBlockchainBotIotagentMusicExAsync(FavoritesBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FavoritesBlockchainBotIotagentMusicResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.music.favorites", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询指定歌曲的歌词。
        /// Summary: 查询指定歌曲的歌词。</para>
        /// </description>
        public LyricsBlockchainBotIotagentMusicResponse LyricsBlockchainBotIotagentMusic(LyricsBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LyricsBlockchainBotIotagentMusicEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询指定歌曲的歌词。
        /// Summary: 查询指定歌曲的歌词。</para>
        /// </description>
        public async Task<LyricsBlockchainBotIotagentMusicResponse> LyricsBlockchainBotIotagentMusicAsync(LyricsBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LyricsBlockchainBotIotagentMusicExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询指定歌曲的歌词。
        /// Summary: 查询指定歌曲的歌词。</para>
        /// </description>
        public LyricsBlockchainBotIotagentMusicResponse LyricsBlockchainBotIotagentMusicEx(LyricsBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LyricsBlockchainBotIotagentMusicResponse>(DoRequest("1.0", "blockchain.bot.iotagent.music.lyrics", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询指定歌曲的歌词。
        /// Summary: 查询指定歌曲的歌词。</para>
        /// </description>
        public async Task<LyricsBlockchainBotIotagentMusicResponse> LyricsBlockchainBotIotagentMusicExAsync(LyricsBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LyricsBlockchainBotIotagentMusicResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.music.lyrics", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 对一首歌进行红心/取消红心操作。
        /// Summary: 对一首歌进行红心/取消红心操作。</para>
        /// </description>
        public LikeBlockchainBotIotagentMusicResponse LikeBlockchainBotIotagentMusic(LikeBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LikeBlockchainBotIotagentMusicEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 对一首歌进行红心/取消红心操作。
        /// Summary: 对一首歌进行红心/取消红心操作。</para>
        /// </description>
        public async Task<LikeBlockchainBotIotagentMusicResponse> LikeBlockchainBotIotagentMusicAsync(LikeBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LikeBlockchainBotIotagentMusicExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 对一首歌进行红心/取消红心操作。
        /// Summary: 对一首歌进行红心/取消红心操作。</para>
        /// </description>
        public LikeBlockchainBotIotagentMusicResponse LikeBlockchainBotIotagentMusicEx(LikeBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LikeBlockchainBotIotagentMusicResponse>(DoRequest("1.0", "blockchain.bot.iotagent.music.like", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 对一首歌进行红心/取消红心操作。
        /// Summary: 对一首歌进行红心/取消红心操作。</para>
        /// </description>
        public async Task<LikeBlockchainBotIotagentMusicResponse> LikeBlockchainBotIotagentMusicExAsync(LikeBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LikeBlockchainBotIotagentMusicResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.music.like", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 退出云音乐登录，清理 token
        /// Summary: 退出云音乐登录，清理 token</para>
        /// </description>
        public LogoutBlockchainBotIotagentMusicResponse LogoutBlockchainBotIotagentMusic(LogoutBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LogoutBlockchainBotIotagentMusicEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 退出云音乐登录，清理 token
        /// Summary: 退出云音乐登录，清理 token</para>
        /// </description>
        public async Task<LogoutBlockchainBotIotagentMusicResponse> LogoutBlockchainBotIotagentMusicAsync(LogoutBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LogoutBlockchainBotIotagentMusicExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 退出云音乐登录，清理 token
        /// Summary: 退出云音乐登录，清理 token</para>
        /// </description>
        public LogoutBlockchainBotIotagentMusicResponse LogoutBlockchainBotIotagentMusicEx(LogoutBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LogoutBlockchainBotIotagentMusicResponse>(DoRequest("1.0", "blockchain.bot.iotagent.music.logout", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 退出云音乐登录，清理 token
        /// Summary: 退出云音乐登录，清理 token</para>
        /// </description>
        public async Task<LogoutBlockchainBotIotagentMusicResponse> LogoutBlockchainBotIotagentMusicExAsync(LogoutBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LogoutBlockchainBotIotagentMusicResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.music.logout", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 云音乐回调接口
        /// Summary: 云音乐回调接口</para>
        /// </description>
        public CallbackBlockchainBotIotagentMusicResponse CallbackBlockchainBotIotagentMusic(CallbackBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackBlockchainBotIotagentMusicEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 云音乐回调接口
        /// Summary: 云音乐回调接口</para>
        /// </description>
        public async Task<CallbackBlockchainBotIotagentMusicResponse> CallbackBlockchainBotIotagentMusicAsync(CallbackBlockchainBotIotagentMusicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackBlockchainBotIotagentMusicExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 云音乐回调接口
        /// Summary: 云音乐回调接口</para>
        /// </description>
        public CallbackBlockchainBotIotagentMusicResponse CallbackBlockchainBotIotagentMusicEx(CallbackBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackBlockchainBotIotagentMusicResponse>(DoRequest("1.0", "blockchain.bot.iotagent.music.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 云音乐回调接口
        /// Summary: 云音乐回调接口</para>
        /// </description>
        public async Task<CallbackBlockchainBotIotagentMusicResponse> CallbackBlockchainBotIotagentMusicExAsync(CallbackBlockchainBotIotagentMusicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackBlockchainBotIotagentMusicResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.music.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        /// Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）</para>
        /// </description>
        public UsageBlockchainBotIotagentSessionResponse UsageBlockchainBotIotagentSession(UsageBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UsageBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        /// Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）</para>
        /// </description>
        public async Task<UsageBlockchainBotIotagentSessionResponse> UsageBlockchainBotIotagentSessionAsync(UsageBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UsageBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        /// Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）</para>
        /// </description>
        public UsageBlockchainBotIotagentSessionResponse UsageBlockchainBotIotagentSessionEx(UsageBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UsageBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.usage", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）
        /// Summary: 查询会话用量（按 sessionId 聚合  usage 记录，返回会话总量 + 轮次明细分页）</para>
        /// </description>
        public async Task<UsageBlockchainBotIotagentSessionResponse> UsageBlockchainBotIotagentSessionExAsync(UsageBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UsageBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.usage", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 会话上下文处理操作
        /// Summary: 会话上下文处理操作</para>
        /// </description>
        public ActionBlockchainBotIotagentSessioncontextResponse ActionBlockchainBotIotagentSessioncontext(ActionBlockchainBotIotagentSessioncontextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ActionBlockchainBotIotagentSessioncontextEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 会话上下文处理操作
        /// Summary: 会话上下文处理操作</para>
        /// </description>
        public async Task<ActionBlockchainBotIotagentSessioncontextResponse> ActionBlockchainBotIotagentSessioncontextAsync(ActionBlockchainBotIotagentSessioncontextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ActionBlockchainBotIotagentSessioncontextExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 会话上下文处理操作
        /// Summary: 会话上下文处理操作</para>
        /// </description>
        public ActionBlockchainBotIotagentSessioncontextResponse ActionBlockchainBotIotagentSessioncontextEx(ActionBlockchainBotIotagentSessioncontextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ActionBlockchainBotIotagentSessioncontextResponse>(DoRequest("1.0", "blockchain.bot.iotagent.sessioncontext.action", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 会话上下文处理操作
        /// Summary: 会话上下文处理操作</para>
        /// </description>
        public async Task<ActionBlockchainBotIotagentSessioncontextResponse> ActionBlockchainBotIotagentSessioncontextExAsync(ActionBlockchainBotIotagentSessioncontextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ActionBlockchainBotIotagentSessioncontextResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.sessioncontext.action", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询上下文压缩操作结果
        /// Summary: 查询上下文压缩操作结果</para>
        /// </description>
        public QueryBlockchainBotIotagentSessioncontextactionResponse QueryBlockchainBotIotagentSessioncontextaction(QueryBlockchainBotIotagentSessioncontextactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotagentSessioncontextactionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询上下文压缩操作结果
        /// Summary: 查询上下文压缩操作结果</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentSessioncontextactionResponse> QueryBlockchainBotIotagentSessioncontextactionAsync(QueryBlockchainBotIotagentSessioncontextactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotagentSessioncontextactionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询上下文压缩操作结果
        /// Summary: 查询上下文压缩操作结果</para>
        /// </description>
        public QueryBlockchainBotIotagentSessioncontextactionResponse QueryBlockchainBotIotagentSessioncontextactionEx(QueryBlockchainBotIotagentSessioncontextactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentSessioncontextactionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.sessioncontextaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询上下文压缩操作结果
        /// Summary: 查询上下文压缩操作结果</para>
        /// </description>
        public async Task<QueryBlockchainBotIotagentSessioncontextactionResponse> QueryBlockchainBotIotagentSessioncontextactionExAsync(QueryBlockchainBotIotagentSessioncontextactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotagentSessioncontextactionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.sessioncontextaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        /// Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）</para>
        /// </description>
        public QueryBlockchainBotAgentDailysummaryResponse QueryBlockchainBotAgentDailysummary(QueryBlockchainBotAgentDailysummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotAgentDailysummaryEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        /// Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）</para>
        /// </description>
        public async Task<QueryBlockchainBotAgentDailysummaryResponse> QueryBlockchainBotAgentDailysummaryAsync(QueryBlockchainBotAgentDailysummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotAgentDailysummaryExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        /// Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）</para>
        /// </description>
        public QueryBlockchainBotAgentDailysummaryResponse QueryBlockchainBotAgentDailysummaryEx(QueryBlockchainBotAgentDailysummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotAgentDailysummaryResponse>(DoRequest("1.0", "blockchain.bot.agent.dailysummary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）
        /// Summary: 查询智能体指定日期的聊天总结（只读，不触发生成；content 为空表示尚未生成或当日无对话）</para>
        /// </description>
        public async Task<QueryBlockchainBotAgentDailysummaryResponse> QueryBlockchainBotAgentDailysummaryExAsync(QueryBlockchainBotAgentDailysummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotAgentDailysummaryResponse>(await DoRequestAsync("1.0", "blockchain.bot.agent.dailysummary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        /// Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）</para>
        /// </description>
        public GenerateBlockchainBotAgentDailysummaryResponse GenerateBlockchainBotAgentDailysummary(GenerateBlockchainBotAgentDailysummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GenerateBlockchainBotAgentDailysummaryEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        /// Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）</para>
        /// </description>
        public async Task<GenerateBlockchainBotAgentDailysummaryResponse> GenerateBlockchainBotAgentDailysummaryAsync(GenerateBlockchainBotAgentDailysummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GenerateBlockchainBotAgentDailysummaryExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        /// Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）</para>
        /// </description>
        public GenerateBlockchainBotAgentDailysummaryResponse GenerateBlockchainBotAgentDailysummaryEx(GenerateBlockchainBotAgentDailysummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GenerateBlockchainBotAgentDailysummaryResponse>(DoRequest("1.0", "blockchain.bot.agent.dailysummary.generate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）
        /// Summary: 触发智能体指定日期的聊天总结生成（异步受理，立即返回；同一智能体同一天 60 秒内重复触发只生成一次，生成结果通过 daily summary 查询接口获取）</para>
        /// </description>
        public async Task<GenerateBlockchainBotAgentDailysummaryResponse> GenerateBlockchainBotAgentDailysummaryExAsync(GenerateBlockchainBotAgentDailysummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GenerateBlockchainBotAgentDailysummaryResponse>(await DoRequestAsync("1.0", "blockchain.bot.agent.dailysummary.generate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        /// Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数</para>
        /// </description>
        public TrajectoryBlockchainBotIotagentSessionResponse TrajectoryBlockchainBotIotagentSession(TrajectoryBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TrajectoryBlockchainBotIotagentSessionEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        /// Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数</para>
        /// </description>
        public async Task<TrajectoryBlockchainBotIotagentSessionResponse> TrajectoryBlockchainBotIotagentSessionAsync(TrajectoryBlockchainBotIotagentSessionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TrajectoryBlockchainBotIotagentSessionExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        /// Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数</para>
        /// </description>
        public TrajectoryBlockchainBotIotagentSessionResponse TrajectoryBlockchainBotIotagentSessionEx(TrajectoryBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TrajectoryBlockchainBotIotagentSessionResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.trajectory", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数
        /// Summary: 查询会话执行轨迹索引，按作用域返回轮次列表、诊断摘要和统计计数</para>
        /// </description>
        public async Task<TrajectoryBlockchainBotIotagentSessionResponse> TrajectoryBlockchainBotIotagentSessionExAsync(TrajectoryBlockchainBotIotagentSessionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TrajectoryBlockchainBotIotagentSessionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.trajectory", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询单轮/操作的执行步骤详情，展开执行树
        /// Summary: 查询单轮/操作的执行步骤详情，展开执行树</para>
        /// </description>
        public StepsBlockchainBotIotagentSessionTrajectoryResponse StepsBlockchainBotIotagentSessionTrajectory(StepsBlockchainBotIotagentSessionTrajectoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StepsBlockchainBotIotagentSessionTrajectoryEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询单轮/操作的执行步骤详情，展开执行树
        /// Summary: 查询单轮/操作的执行步骤详情，展开执行树</para>
        /// </description>
        public async Task<StepsBlockchainBotIotagentSessionTrajectoryResponse> StepsBlockchainBotIotagentSessionTrajectoryAsync(StepsBlockchainBotIotagentSessionTrajectoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StepsBlockchainBotIotagentSessionTrajectoryExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询单轮/操作的执行步骤详情，展开执行树
        /// Summary: 查询单轮/操作的执行步骤详情，展开执行树</para>
        /// </description>
        public StepsBlockchainBotIotagentSessionTrajectoryResponse StepsBlockchainBotIotagentSessionTrajectoryEx(StepsBlockchainBotIotagentSessionTrajectoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StepsBlockchainBotIotagentSessionTrajectoryResponse>(DoRequest("1.0", "blockchain.bot.iotagent.session.trajectory.steps", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 查询单轮/操作的执行步骤详情，展开执行树
        /// Summary: 查询单轮/操作的执行步骤详情，展开执行树</para>
        /// </description>
        public async Task<StepsBlockchainBotIotagentSessionTrajectoryResponse> StepsBlockchainBotIotagentSessionTrajectoryExAsync(StepsBlockchainBotIotagentSessionTrajectoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StepsBlockchainBotIotagentSessionTrajectoryResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotagent.session.trajectory.steps", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a>
        /// Summary: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a></para>
        /// </description>
        public QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse QuerycontractBlockchainBotAiotdatalinkAntfinanceassistant(QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a>
        /// Summary: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a></para>
        /// </description>
        public async Task<QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse> QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantAsync(QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a>
        /// Summary: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a></para>
        /// </description>
        public QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantEx(QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse>(DoRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.querycontract", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a>
        /// Summary: 蚂小财签约状态查询，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#ZHvWp</a></para>
        /// </description>
        public async Task<QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse> QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantExAsync(QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerycontractBlockchainBotAiotdatalinkAntfinanceassistantResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.querycontract", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a>
        /// Summary: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a></para>
        /// </description>
        public SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse SigncontractBlockchainBotAiotdatalinkAntfinanceassistant(SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SigncontractBlockchainBotAiotdatalinkAntfinanceassistantEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a>
        /// Summary: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a></para>
        /// </description>
        public async Task<SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse> SigncontractBlockchainBotAiotdatalinkAntfinanceassistantAsync(SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SigncontractBlockchainBotAiotdatalinkAntfinanceassistantExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a>
        /// Summary: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a></para>
        /// </description>
        public SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse SigncontractBlockchainBotAiotdatalinkAntfinanceassistantEx(SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse>(DoRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.signcontract", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a>
        /// Summary: 蚂小财签约，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#bs3M4</a></para>
        /// </description>
        public async Task<SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse> SigncontractBlockchainBotAiotdatalinkAntfinanceassistantExAsync(SigncontractBlockchainBotAiotdatalinkAntfinanceassistantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SigncontractBlockchainBotAiotdatalinkAntfinanceassistantResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.signcontract", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
        /// Summary: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></para>
        /// </description>
        public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse ChatBlockchainBotAiotdatalinkAntfinanceassistant(ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ChatBlockchainBotAiotdatalinkAntfinanceassistantEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
        /// Summary: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></para>
        /// </description>
        public async Task<ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse> ChatBlockchainBotAiotdatalinkAntfinanceassistantAsync(ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ChatBlockchainBotAiotdatalinkAntfinanceassistantExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
        /// Summary: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></para>
        /// </description>
        public ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse ChatBlockchainBotAiotdatalinkAntfinanceassistantEx(ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse>(DoRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.chat", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
        /// Summary: 蚂小财对话，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></para>
        /// </description>
        public async Task<ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse> ChatBlockchainBotAiotdatalinkAntfinanceassistantExAsync(ChatBlockchainBotAiotdatalinkAntfinanceassistantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ChatBlockchainBotAiotdatalinkAntfinanceassistantResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.chat", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
        /// Summary: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></para>
        /// </description>
        public StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse StreamchatBlockchainBotAiotdatalinkAntfinanceassistant(StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StreamchatBlockchainBotAiotdatalinkAntfinanceassistantEx(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
        /// Summary: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></para>
        /// </description>
        public async Task<StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse> StreamchatBlockchainBotAiotdatalinkAntfinanceassistantAsync(StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StreamchatBlockchainBotAiotdatalinkAntfinanceassistantExAsync(request, headers, runtime);
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
        /// Summary: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></para>
        /// </description>
        public StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse StreamchatBlockchainBotAiotdatalinkAntfinanceassistantEx(StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse>(DoRequest("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.streamchat", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /// <term><b>Description:</b></term>
        /// <description>
        /// <para>Description: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a>
        /// Summary: 蚂小财对话流式接口，参考RPC接口文档：<a href="https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S">https://yuque.antfin.com/pw3zzd/cplb7g/ghfep7wirmlxlg3u#nzb6S</a></para>
        /// </description>
        public async Task<StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse> StreamchatBlockchainBotAiotdatalinkAntfinanceassistantExAsync(StreamchatBlockchainBotAiotdatalinkAntfinanceassistantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StreamchatBlockchainBotAiotdatalinkAntfinanceassistantResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiotdatalink.antfinanceassistant.streamchat", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
