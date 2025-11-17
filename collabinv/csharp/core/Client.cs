// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.COLLABINV.Models;

namespace AntChain.SDK.COLLABINV
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
                        {"sdk_version", "1.0.53"},
                        {"_prod_code", "COLLABINV"},
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
                        {"sdk_version", "1.0.53"},
                        {"_prod_code", "COLLABINV"},
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

        /**
         * Description: sse查询
         * Summary: sse查询
         */
        public QueryAgentSseResponse QueryAgentSse(QueryAgentSseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAgentSseEx(request, headers, runtime);
        }

        /**
         * Description: sse查询
         * Summary: sse查询
         */
        public async Task<QueryAgentSseResponse> QueryAgentSseAsync(QueryAgentSseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAgentSseExAsync(request, headers, runtime);
        }

        /**
         * Description: sse查询
         * Summary: sse查询
         */
        public QueryAgentSseResponse QueryAgentSseEx(QueryAgentSseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAgentSseResponse>(DoRequest("1.0", "antchain.zkcollabinv.agent.sse.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sse查询
         * Summary: sse查询
         */
        public async Task<QueryAgentSseResponse> QueryAgentSseExAsync(QueryAgentSseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAgentSseResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.agent.sse.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据用户id查询用户会话列表
         * Summary: 根据用户id查询用户会话列表
         */
        public ListAgentConversationResponse ListAgentConversation(ListAgentConversationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAgentConversationEx(request, headers, runtime);
        }

        /**
         * Description: 根据用户id查询用户会话列表
         * Summary: 根据用户id查询用户会话列表
         */
        public async Task<ListAgentConversationResponse> ListAgentConversationAsync(ListAgentConversationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAgentConversationExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据用户id查询用户会话列表
         * Summary: 根据用户id查询用户会话列表
         */
        public ListAgentConversationResponse ListAgentConversationEx(ListAgentConversationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAgentConversationResponse>(DoRequest("1.0", "antchain.zkcollabinv.agent.conversation.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据用户id查询用户会话列表
         * Summary: 根据用户id查询用户会话列表
         */
        public async Task<ListAgentConversationResponse> ListAgentConversationExAsync(ListAgentConversationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAgentConversationResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.agent.conversation.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据用户Id会话ID删除会话
         * Summary: 删除会话
         */
        public DeleteAgentConversationResponse DeleteAgentConversation(DeleteAgentConversationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAgentConversationEx(request, headers, runtime);
        }

        /**
         * Description: 根据用户Id会话ID删除会话
         * Summary: 删除会话
         */
        public async Task<DeleteAgentConversationResponse> DeleteAgentConversationAsync(DeleteAgentConversationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAgentConversationExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据用户Id会话ID删除会话
         * Summary: 删除会话
         */
        public DeleteAgentConversationResponse DeleteAgentConversationEx(DeleteAgentConversationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAgentConversationResponse>(DoRequest("1.0", "antchain.zkcollabinv.agent.conversation.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据用户Id会话ID删除会话
         * Summary: 删除会话
         */
        public async Task<DeleteAgentConversationResponse> DeleteAgentConversationExAsync(DeleteAgentConversationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAgentConversationResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.agent.conversation.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除用户所有会话
         * Summary: 删除用户所有会话
         */
        public BatchdeleteAgentConversationResponse BatchdeleteAgentConversation(BatchdeleteAgentConversationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteAgentConversationEx(request, headers, runtime);
        }

        /**
         * Description: 删除用户所有会话
         * Summary: 删除用户所有会话
         */
        public async Task<BatchdeleteAgentConversationResponse> BatchdeleteAgentConversationAsync(BatchdeleteAgentConversationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteAgentConversationExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除用户所有会话
         * Summary: 删除用户所有会话
         */
        public BatchdeleteAgentConversationResponse BatchdeleteAgentConversationEx(BatchdeleteAgentConversationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteAgentConversationResponse>(DoRequest("1.0", "antchain.zkcollabinv.agent.conversation.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除用户所有会话
         * Summary: 删除用户所有会话
         */
        public async Task<BatchdeleteAgentConversationResponse> BatchdeleteAgentConversationExAsync(BatchdeleteAgentConversationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteAgentConversationResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.agent.conversation.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取会话消息列表
         * Summary: 获取会话消息列表
         */
        public ListAgentMessageResponse ListAgentMessage(ListAgentMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAgentMessageEx(request, headers, runtime);
        }

        /**
         * Description: 获取会话消息列表
         * Summary: 获取会话消息列表
         */
        public async Task<ListAgentMessageResponse> ListAgentMessageAsync(ListAgentMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAgentMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取会话消息列表
         * Summary: 获取会话消息列表
         */
        public ListAgentMessageResponse ListAgentMessageEx(ListAgentMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAgentMessageResponse>(DoRequest("1.0", "antchain.zkcollabinv.agent.message.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取会话消息列表
         * Summary: 获取会话消息列表
         */
        public async Task<ListAgentMessageResponse> ListAgentMessageExAsync(ListAgentMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAgentMessageResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.agent.message.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑会话信息
         * Summary: 编辑会话信息
         */
        public UpdateAgentConversationResponse UpdateAgentConversation(UpdateAgentConversationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAgentConversationEx(request, headers, runtime);
        }

        /**
         * Description: 编辑会话信息
         * Summary: 编辑会话信息
         */
        public async Task<UpdateAgentConversationResponse> UpdateAgentConversationAsync(UpdateAgentConversationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAgentConversationExAsync(request, headers, runtime);
        }

        /**
         * Description: 编辑会话信息
         * Summary: 编辑会话信息
         */
        public UpdateAgentConversationResponse UpdateAgentConversationEx(UpdateAgentConversationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAgentConversationResponse>(DoRequest("1.0", "antchain.zkcollabinv.agent.conversation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 编辑会话信息
         * Summary: 编辑会话信息
         */
        public async Task<UpdateAgentConversationResponse> UpdateAgentConversationExAsync(UpdateAgentConversationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAgentConversationResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.agent.conversation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: agent api 同步
         * Summary: agent api
         */
        public QueryAgentCompletionResponse QueryAgentCompletion(QueryAgentCompletionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAgentCompletionEx(request, headers, runtime);
        }

        /**
         * Description: agent api 同步
         * Summary: agent api
         */
        public async Task<QueryAgentCompletionResponse> QueryAgentCompletionAsync(QueryAgentCompletionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAgentCompletionExAsync(request, headers, runtime);
        }

        /**
         * Description: agent api 同步
         * Summary: agent api
         */
        public QueryAgentCompletionResponse QueryAgentCompletionEx(QueryAgentCompletionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAgentCompletionResponse>(DoRequest("1.0", "antchain.zkcollabinv.agent.completion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: agent api 同步
         * Summary: agent api
         */
        public async Task<QueryAgentCompletionResponse> QueryAgentCompletionExAsync(QueryAgentCompletionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAgentCompletionResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.agent.completion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车抵贷人群匹配
         * Summary: 车抵贷人群匹配
         */
        public MatchCarloanUsersResponse MatchCarloanUsers(MatchCarloanUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MatchCarloanUsersEx(request, headers, runtime);
        }

        /**
         * Description: 车抵贷人群匹配
         * Summary: 车抵贷人群匹配
         */
        public async Task<MatchCarloanUsersResponse> MatchCarloanUsersAsync(MatchCarloanUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MatchCarloanUsersExAsync(request, headers, runtime);
        }

        /**
         * Description: 车抵贷人群匹配
         * Summary: 车抵贷人群匹配
         */
        public MatchCarloanUsersResponse MatchCarloanUsersEx(MatchCarloanUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchCarloanUsersResponse>(DoRequest("1.0", "antchain.zkcollabinv.carloan.users.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 车抵贷人群匹配
         * Summary: 车抵贷人群匹配
         */
        public async Task<MatchCarloanUsersResponse> MatchCarloanUsersExAsync(MatchCarloanUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchCarloanUsersResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.carloan.users.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量碰撞人群数据
         * Summary: 批量碰撞人群数据
         */
        public BatchqueryCarloanUsersResponse BatchqueryCarloanUsers(BatchqueryCarloanUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryCarloanUsersEx(request, headers, runtime);
        }

        /**
         * Description: 批量碰撞人群数据
         * Summary: 批量碰撞人群数据
         */
        public async Task<BatchqueryCarloanUsersResponse> BatchqueryCarloanUsersAsync(BatchqueryCarloanUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryCarloanUsersExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量碰撞人群数据
         * Summary: 批量碰撞人群数据
         */
        public BatchqueryCarloanUsersResponse BatchqueryCarloanUsersEx(BatchqueryCarloanUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryCarloanUsersResponse>(DoRequest("1.0", "antchain.zkcollabinv.carloan.users.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量碰撞人群数据
         * Summary: 批量碰撞人群数据
         */
        public async Task<BatchqueryCarloanUsersResponse> BatchqueryCarloanUsersExAsync(BatchqueryCarloanUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryCarloanUsersResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.carloan.users.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入人群文件
         * Summary: 导入人群文件
         */
        public ImportCarloanUsersResponse ImportCarloanUsers(ImportCarloanUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportCarloanUsersEx(request, headers, runtime);
        }

        /**
         * Description: 导入人群文件
         * Summary: 导入人群文件
         */
        public async Task<ImportCarloanUsersResponse> ImportCarloanUsersAsync(ImportCarloanUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportCarloanUsersExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入人群文件
         * Summary: 导入人群文件
         */
        public ImportCarloanUsersResponse ImportCarloanUsersEx(ImportCarloanUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.zkcollabinv.carloan.users.import",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ImportCarloanUsersResponse importCarloanUsersResponse = new ImportCarloanUsersResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importCarloanUsersResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCarloanUsersResponse>(DoRequest("1.0", "antchain.zkcollabinv.carloan.users.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入人群文件
         * Summary: 导入人群文件
         */
        public async Task<ImportCarloanUsersResponse> ImportCarloanUsersExAsync(ImportCarloanUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.zkcollabinv.carloan.users.import",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    ImportCarloanUsersResponse importCarloanUsersResponse = new ImportCarloanUsersResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return importCarloanUsersResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportCarloanUsersResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.carloan.users.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加用户
         * Summary: 添加天猫用户
         */
        public AddCaruserUsersResponse AddCaruserUsers(AddCaruserUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddCaruserUsersEx(request, headers, runtime);
        }

        /**
         * Description: 添加用户
         * Summary: 添加天猫用户
         */
        public async Task<AddCaruserUsersResponse> AddCaruserUsersAsync(AddCaruserUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddCaruserUsersExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加用户
         * Summary: 添加天猫用户
         */
        public AddCaruserUsersResponse AddCaruserUsersEx(AddCaruserUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCaruserUsersResponse>(DoRequest("1.0", "antchain.zkcollabinv.caruser.users.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加用户
         * Summary: 添加天猫用户
         */
        public async Task<AddCaruserUsersResponse> AddCaruserUsersExAsync(AddCaruserUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCaruserUsersResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.caruser.users.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询匹配结果
         * Summary: 查询结果
         */
        public QueryCarloanUsersResponse QueryCarloanUsers(QueryCarloanUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCarloanUsersEx(request, headers, runtime);
        }

        /**
         * Description: 查询匹配结果
         * Summary: 查询结果
         */
        public async Task<QueryCarloanUsersResponse> QueryCarloanUsersAsync(QueryCarloanUsersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCarloanUsersExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询匹配结果
         * Summary: 查询结果
         */
        public QueryCarloanUsersResponse QueryCarloanUsersEx(QueryCarloanUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarloanUsersResponse>(DoRequest("1.0", "antchain.zkcollabinv.carloan.users.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询匹配结果
         * Summary: 查询结果
         */
        public async Task<QueryCarloanUsersResponse> QueryCarloanUsersExAsync(QueryCarloanUsersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCarloanUsersResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.carloan.users.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: idMapping碰撞
         * Summary: idMapping碰撞
         */
        public ImportIdmapSamplefileResponse ImportIdmapSamplefile(ImportIdmapSamplefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportIdmapSamplefileEx(request, headers, runtime);
        }

        /**
         * Description: idMapping碰撞
         * Summary: idMapping碰撞
         */
        public async Task<ImportIdmapSamplefileResponse> ImportIdmapSamplefileAsync(ImportIdmapSamplefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportIdmapSamplefileExAsync(request, headers, runtime);
        }

        /**
         * Description: idMapping碰撞
         * Summary: idMapping碰撞
         */
        public ImportIdmapSamplefileResponse ImportIdmapSamplefileEx(ImportIdmapSamplefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIdmapSamplefileResponse>(DoRequest("1.0", "antchain.zkcollabinv.idmap.samplefile.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: idMapping碰撞
         * Summary: idMapping碰撞
         */
        public async Task<ImportIdmapSamplefileResponse> ImportIdmapSamplefileExAsync(ImportIdmapSamplefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIdmapSamplefileResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.idmap.samplefile.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: psi求交结果导入
         * Summary: psi求交结果导入
         */
        public ImportIdmapPsiresultfileResponse ImportIdmapPsiresultfile(ImportIdmapPsiresultfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportIdmapPsiresultfileEx(request, headers, runtime);
        }

        /**
         * Description: psi求交结果导入
         * Summary: psi求交结果导入
         */
        public async Task<ImportIdmapPsiresultfileResponse> ImportIdmapPsiresultfileAsync(ImportIdmapPsiresultfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportIdmapPsiresultfileExAsync(request, headers, runtime);
        }

        /**
         * Description: psi求交结果导入
         * Summary: psi求交结果导入
         */
        public ImportIdmapPsiresultfileResponse ImportIdmapPsiresultfileEx(ImportIdmapPsiresultfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIdmapPsiresultfileResponse>(DoRequest("1.0", "antchain.zkcollabinv.idmap.psiresultfile.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: psi求交结果导入
         * Summary: psi求交结果导入
         */
        public async Task<ImportIdmapPsiresultfileResponse> ImportIdmapPsiresultfileExAsync(ImportIdmapPsiresultfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIdmapPsiresultfileResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.idmap.psiresultfile.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 投行研究，品牌调用
         * Summary: 投行研究，品牌调用
         */
        public QueryIndexresearchBrandResponse QueryIndexresearchBrand(QueryIndexresearchBrandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndexresearchBrandEx(request, headers, runtime);
        }

        /**
         * Description: 投行研究，品牌调用
         * Summary: 投行研究，品牌调用
         */
        public async Task<QueryIndexresearchBrandResponse> QueryIndexresearchBrandAsync(QueryIndexresearchBrandRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndexresearchBrandExAsync(request, headers, runtime);
        }

        /**
         * Description: 投行研究，品牌调用
         * Summary: 投行研究，品牌调用
         */
        public QueryIndexresearchBrandResponse QueryIndexresearchBrandEx(QueryIndexresearchBrandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndexresearchBrandResponse>(DoRequest("1.0", "antchain.zkcollabinv.indexresearch.brand.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 投行研究，品牌调用
         * Summary: 投行研究，品牌调用
         */
        public async Task<QueryIndexresearchBrandResponse> QueryIndexresearchBrandExAsync(QueryIndexresearchBrandRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndexresearchBrandResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.indexresearch.brand.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 投行研究，查询品牌指标结果
         * Summary: 查询品牌指标
         */
        public QueryIndexresearchBrandindexResponse QueryIndexresearchBrandindex(QueryIndexresearchBrandindexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndexresearchBrandindexEx(request, headers, runtime);
        }

        /**
         * Description: 投行研究，查询品牌指标结果
         * Summary: 查询品牌指标
         */
        public async Task<QueryIndexresearchBrandindexResponse> QueryIndexresearchBrandindexAsync(QueryIndexresearchBrandindexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndexresearchBrandindexExAsync(request, headers, runtime);
        }

        /**
         * Description: 投行研究，查询品牌指标结果
         * Summary: 查询品牌指标
         */
        public QueryIndexresearchBrandindexResponse QueryIndexresearchBrandindexEx(QueryIndexresearchBrandindexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndexresearchBrandindexResponse>(DoRequest("1.0", "antchain.zkcollabinv.indexresearch.brandindex.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 投行研究，查询品牌指标结果
         * Summary: 查询品牌指标
         */
        public async Task<QueryIndexresearchBrandindexResponse> QueryIndexresearchBrandindexExAsync(QueryIndexresearchBrandindexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndexresearchBrandindexResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.indexresearch.brandindex.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费行业报告查询
         * Summary: 消费行业报告查询
         */
        public QueryIndexresearchConsumeindustryResponse QueryIndexresearchConsumeindustry(QueryIndexresearchConsumeindustryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndexresearchConsumeindustryEx(request, headers, runtime);
        }

        /**
         * Description: 消费行业报告查询
         * Summary: 消费行业报告查询
         */
        public async Task<QueryIndexresearchConsumeindustryResponse> QueryIndexresearchConsumeindustryAsync(QueryIndexresearchConsumeindustryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndexresearchConsumeindustryExAsync(request, headers, runtime);
        }

        /**
         * Description: 消费行业报告查询
         * Summary: 消费行业报告查询
         */
        public QueryIndexresearchConsumeindustryResponse QueryIndexresearchConsumeindustryEx(QueryIndexresearchConsumeindustryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndexresearchConsumeindustryResponse>(DoRequest("1.0", "antchain.zkcollabinv.indexresearch.consumeindustry.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费行业报告查询
         * Summary: 消费行业报告查询
         */
        public async Task<QueryIndexresearchConsumeindustryResponse> QueryIndexresearchConsumeindustryExAsync(QueryIndexresearchConsumeindustryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndexresearchConsumeindustryResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.indexresearch.consumeindustry.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费行业报告行业查询
         * Summary: 消费行业报告行业查询
         */
        public QueryIndexresearchIndustryResponse QueryIndexresearchIndustry(QueryIndexresearchIndustryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIndexresearchIndustryEx(request, headers, runtime);
        }

        /**
         * Description: 消费行业报告行业查询
         * Summary: 消费行业报告行业查询
         */
        public async Task<QueryIndexresearchIndustryResponse> QueryIndexresearchIndustryAsync(QueryIndexresearchIndustryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIndexresearchIndustryExAsync(request, headers, runtime);
        }

        /**
         * Description: 消费行业报告行业查询
         * Summary: 消费行业报告行业查询
         */
        public QueryIndexresearchIndustryResponse QueryIndexresearchIndustryEx(QueryIndexresearchIndustryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndexresearchIndustryResponse>(DoRequest("1.0", "antchain.zkcollabinv.indexresearch.industry.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费行业报告行业查询
         * Summary: 消费行业报告行业查询
         */
        public async Task<QueryIndexresearchIndustryResponse> QueryIndexresearchIndustryExAsync(QueryIndexresearchIndustryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIndexresearchIndustryResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.indexresearch.industry.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于交易数据的定位信息协查
         * Summary: 定位协查
         */
        public QueryLocationInternalResponse QueryLocationInternal(QueryLocationInternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLocationInternalEx(request, headers, runtime);
        }

        /**
         * Description: 基于交易数据的定位信息协查
         * Summary: 定位协查
         */
        public async Task<QueryLocationInternalResponse> QueryLocationInternalAsync(QueryLocationInternalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLocationInternalExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于交易数据的定位信息协查
         * Summary: 定位协查
         */
        public QueryLocationInternalResponse QueryLocationInternalEx(QueryLocationInternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLocationInternalResponse>(DoRequest("1.0", "antchain.zkcollabinv.location.internal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于交易数据的定位信息协查
         * Summary: 定位协查
         */
        public async Task<QueryLocationInternalResponse> QueryLocationInternalExAsync(QueryLocationInternalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLocationInternalResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.location.internal.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于交易数据的定位信息协查对外接口
         * Summary: 定位协查对外接口
         */
        public QueryLocationTradeResponse QueryLocationTrade(QueryLocationTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLocationTradeEx(request, headers, runtime);
        }

        /**
         * Description: 基于交易数据的定位信息协查对外接口
         * Summary: 定位协查对外接口
         */
        public async Task<QueryLocationTradeResponse> QueryLocationTradeAsync(QueryLocationTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLocationTradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于交易数据的定位信息协查对外接口
         * Summary: 定位协查对外接口
         */
        public QueryLocationTradeResponse QueryLocationTradeEx(QueryLocationTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLocationTradeResponse>(DoRequest("1.0", "antchain.zkcollabinv.location.trade.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于交易数据的定位信息协查对外接口
         * Summary: 定位协查对外接口
         */
        public async Task<QueryLocationTradeResponse> QueryLocationTradeExAsync(QueryLocationTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLocationTradeResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.location.trade.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 样本文件摘要
         * Summary: 样本文件摘要
         */
        public PushModelSamplefileResponse PushModelSamplefile(PushModelSamplefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushModelSamplefileEx(request, headers, runtime);
        }

        /**
         * Description: 样本文件摘要
         * Summary: 样本文件摘要
         */
        public async Task<PushModelSamplefileResponse> PushModelSamplefileAsync(PushModelSamplefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushModelSamplefileExAsync(request, headers, runtime);
        }

        /**
         * Description: 样本文件摘要
         * Summary: 样本文件摘要
         */
        public PushModelSamplefileResponse PushModelSamplefileEx(PushModelSamplefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushModelSamplefileResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.samplefile.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 样本文件摘要
         * Summary: 样本文件摘要
         */
        public async Task<PushModelSamplefileResponse> PushModelSamplefileExAsync(PushModelSamplefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushModelSamplefileResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.samplefile.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 样本任务执行
         * Summary: 样本任务执行
         */
        public ExecModelSampletaskResponse ExecModelSampletask(ExecModelSampletaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecModelSampletaskEx(request, headers, runtime);
        }

        /**
         * Description: 样本任务执行
         * Summary: 样本任务执行
         */
        public async Task<ExecModelSampletaskResponse> ExecModelSampletaskAsync(ExecModelSampletaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecModelSampletaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 样本任务执行
         * Summary: 样本任务执行
         */
        public ExecModelSampletaskResponse ExecModelSampletaskEx(ExecModelSampletaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecModelSampletaskResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.sampletask.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 样本任务执行
         * Summary: 样本任务执行
         */
        public async Task<ExecModelSampletaskResponse> ExecModelSampletaskExAsync(ExecModelSampletaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecModelSampletaskResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.sampletask.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 任务状态查询
         * Summary: 任务状态查询
         */
        public QueryModelSampletaskResponse QueryModelSampletask(QueryModelSampletaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelSampletaskEx(request, headers, runtime);
        }

        /**
         * Description: 任务状态查询
         * Summary: 任务状态查询
         */
        public async Task<QueryModelSampletaskResponse> QueryModelSampletaskAsync(QueryModelSampletaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelSampletaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 任务状态查询
         * Summary: 任务状态查询
         */
        public QueryModelSampletaskResponse QueryModelSampletaskEx(QueryModelSampletaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelSampletaskResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.sampletask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 任务状态查询
         * Summary: 任务状态查询
         */
        public async Task<QueryModelSampletaskResponse> QueryModelSampletaskExAsync(QueryModelSampletaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelSampletaskResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.sampletask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 特征集查询
         * Summary: 特征集查询
         */
        public QueryModelFeaturesetResponse QueryModelFeatureset(QueryModelFeaturesetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelFeaturesetEx(request, headers, runtime);
        }

        /**
         * Description: 特征集查询
         * Summary: 特征集查询
         */
        public async Task<QueryModelFeaturesetResponse> QueryModelFeaturesetAsync(QueryModelFeaturesetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelFeaturesetExAsync(request, headers, runtime);
        }

        /**
         * Description: 特征集查询
         * Summary: 特征集查询
         */
        public QueryModelFeaturesetResponse QueryModelFeaturesetEx(QueryModelFeaturesetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelFeaturesetResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.featureset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 特征集查询
         * Summary: 特征集查询
         */
        public async Task<QueryModelFeaturesetResponse> QueryModelFeaturesetExAsync(QueryModelFeaturesetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelFeaturesetResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.featureset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模型保存
         * Summary: 模型保存
         */
        public SubmitModelInstanceResponse SubmitModelInstance(SubmitModelInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitModelInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 模型保存
         * Summary: 模型保存
         */
        public async Task<SubmitModelInstanceResponse> SubmitModelInstanceAsync(SubmitModelInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitModelInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 模型保存
         * Summary: 模型保存
         */
        public SubmitModelInstanceResponse SubmitModelInstanceEx(SubmitModelInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitModelInstanceResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.instance.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模型保存
         * Summary: 模型保存
         */
        public async Task<SubmitModelInstanceResponse> SubmitModelInstanceExAsync(SubmitModelInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitModelInstanceResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.instance.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模型调用统计查询
         * Summary: 模型调用统计查询
         */
        public QueryModelStatsResponse QueryModelStats(QueryModelStatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelStatsEx(request, headers, runtime);
        }

        /**
         * Description: 模型调用统计查询
         * Summary: 模型调用统计查询
         */
        public async Task<QueryModelStatsResponse> QueryModelStatsAsync(QueryModelStatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelStatsExAsync(request, headers, runtime);
        }

        /**
         * Description: 模型调用统计查询
         * Summary: 模型调用统计查询
         */
        public QueryModelStatsResponse QueryModelStatsEx(QueryModelStatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelStatsResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.stats.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 模型调用统计查询
         * Summary: 模型调用统计查询
         */
        public async Task<QueryModelStatsResponse> QueryModelStatsExAsync(QueryModelStatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelStatsResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.stats.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用查询
         * Summary: 通用查询
         */
        public QueryModelCommonscoreResponse QueryModelCommonscore(QueryModelCommonscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelCommonscoreEx(request, headers, runtime);
        }

        /**
         * Description: 通用查询
         * Summary: 通用查询
         */
        public async Task<QueryModelCommonscoreResponse> QueryModelCommonscoreAsync(QueryModelCommonscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelCommonscoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用查询
         * Summary: 通用查询
         */
        public QueryModelCommonscoreResponse QueryModelCommonscoreEx(QueryModelCommonscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelCommonscoreResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.commonscore.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用查询
         * Summary: 通用查询
         */
        public async Task<QueryModelCommonscoreResponse> QueryModelCommonscoreExAsync(QueryModelCommonscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelCommonscoreResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.commonscore.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用查询批次，仅针对外部使用PIR场景
         * Summary: 通用查询批次
         */
        public BatchqueryModelCommonscoreResponse BatchqueryModelCommonscore(BatchqueryModelCommonscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryModelCommonscoreEx(request, headers, runtime);
        }

        /**
         * Description: 通用查询批次，仅针对外部使用PIR场景
         * Summary: 通用查询批次
         */
        public async Task<BatchqueryModelCommonscoreResponse> BatchqueryModelCommonscoreAsync(BatchqueryModelCommonscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryModelCommonscoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用查询批次，仅针对外部使用PIR场景
         * Summary: 通用查询批次
         */
        public BatchqueryModelCommonscoreResponse BatchqueryModelCommonscoreEx(BatchqueryModelCommonscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryModelCommonscoreResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.commonscore.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用查询批次，仅针对外部使用PIR场景
         * Summary: 通用查询批次
         */
        public async Task<BatchqueryModelCommonscoreResponse> BatchqueryModelCommonscoreExAsync(BatchqueryModelCommonscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryModelCommonscoreResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.commonscore.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 多模型预测值
         * Summary: 多模型预测值
         */
        public QueryModelMultiscoreResponse QueryModelMultiscore(QueryModelMultiscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelMultiscoreEx(request, headers, runtime);
        }

        /**
         * Description: 多模型预测值
         * Summary: 多模型预测值
         */
        public async Task<QueryModelMultiscoreResponse> QueryModelMultiscoreAsync(QueryModelMultiscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelMultiscoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 多模型预测值
         * Summary: 多模型预测值
         */
        public QueryModelMultiscoreResponse QueryModelMultiscoreEx(QueryModelMultiscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelMultiscoreResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.multiscore.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 多模型预测值
         * Summary: 多模型预测值
         */
        public async Task<QueryModelMultiscoreResponse> QueryModelMultiscoreExAsync(QueryModelMultiscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelMultiscoreResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.multiscore.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融合模型的调用
         * Summary: 融合模型调用
         */
        public QueryModelFusionmodelResponse QueryModelFusionmodel(QueryModelFusionmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelFusionmodelEx(request, headers, runtime);
        }

        /**
         * Description: 融合模型的调用
         * Summary: 融合模型调用
         */
        public async Task<QueryModelFusionmodelResponse> QueryModelFusionmodelAsync(QueryModelFusionmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelFusionmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 融合模型的调用
         * Summary: 融合模型调用
         */
        public QueryModelFusionmodelResponse QueryModelFusionmodelEx(QueryModelFusionmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelFusionmodelResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.fusionmodel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融合模型的调用
         * Summary: 融合模型调用
         */
        public async Task<QueryModelFusionmodelResponse> QueryModelFusionmodelExAsync(QueryModelFusionmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelFusionmodelResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.fusionmodel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用工分
         * Summary: 用工分调用
         */
        public QueryModelWorkscoreResponse QueryModelWorkscore(QueryModelWorkscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelWorkscoreEx(request, headers, runtime);
        }

        /**
         * Description: 用工分
         * Summary: 用工分调用
         */
        public async Task<QueryModelWorkscoreResponse> QueryModelWorkscoreAsync(QueryModelWorkscoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelWorkscoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 用工分
         * Summary: 用工分调用
         */
        public QueryModelWorkscoreResponse QueryModelWorkscoreEx(QueryModelWorkscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelWorkscoreResponse>(DoRequest("1.0", "antchain.zkcollabinv.model.workscore.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用工分
         * Summary: 用工分调用
         */
        public async Task<QueryModelWorkscoreResponse> QueryModelWorkscoreExAsync(QueryModelWorkscoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelWorkscoreResponse>(await DoRequestAsync("1.0", "antchain.zkcollabinv.model.workscore.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUpload(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntcloudGatewayxFileUploadEx(request, headers, runtime);
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadAsync(CreateAntcloudGatewayxFileUploadRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntcloudGatewayxFileUploadExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public CreateAntcloudGatewayxFileUploadResponse CreateAntcloudGatewayxFileUploadEx(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(DoRequest("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建HTTP PUT提交的文件上传
         * Summary: 文件上传创建
         */
        public async Task<CreateAntcloudGatewayxFileUploadResponse> CreateAntcloudGatewayxFileUploadExAsync(CreateAntcloudGatewayxFileUploadRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntcloudGatewayxFileUploadResponse>(await DoRequestAsync("1.0", "antcloud.gatewayx.file.upload.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
