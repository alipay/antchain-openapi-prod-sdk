// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.DTAIAGT.Models;

namespace AntChain.SDK.DTAIAGT
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
                        {"sdk_version", "3.1.1"},
                        {"_prod_code", "DTAIAGT"},
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
                        {"sdk_version", "3.1.1"},
                        {"_prod_code", "DTAIAGT"},
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
         * Description: 大模型流式/同步对话接口
         * Summary: 大模型流式/同步对话接口
         */
        public StartOpenaiChatResponse StartOpenaiChat(StartOpenaiChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartOpenaiChatEx(request, headers, runtime);
        }

        /**
         * Description: 大模型流式/同步对话接口
         * Summary: 大模型流式/同步对话接口
         */
        public async Task<StartOpenaiChatResponse> StartOpenaiChatAsync(StartOpenaiChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartOpenaiChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 大模型流式/同步对话接口
         * Summary: 大模型流式/同步对话接口
         */
        public StartOpenaiChatResponse StartOpenaiChatEx(StartOpenaiChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartOpenaiChatResponse>(DoRequest("1.0", "antdigital.dtaiagt.openai.chat.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 大模型流式/同步对话接口
         * Summary: 大模型流式/同步对话接口
         */
        public async Task<StartOpenaiChatResponse> StartOpenaiChatExAsync(StartOpenaiChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartOpenaiChatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.openai.chat.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智能体流式对话接口
         * Summary: 智能体流式对话接口
         */
        public StartAgentChatResponse StartAgentChat(StartAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartAgentChatEx(request, headers, runtime);
        }

        /**
         * Description: 智能体流式对话接口
         * Summary: 智能体流式对话接口
         */
        public async Task<StartAgentChatResponse> StartAgentChatAsync(StartAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartAgentChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 智能体流式对话接口
         * Summary: 智能体流式对话接口
         */
        public StartAgentChatResponse StartAgentChatEx(StartAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAgentChatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.chat.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智能体流式对话接口
         * Summary: 智能体流式对话接口
         */
        public async Task<StartAgentChatResponse> StartAgentChatExAsync(StartAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAgentChatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.chat.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智能体同步对话接口
         * Summary: 智能体同步对话接口
         */
        public StartAgentCchatResponse StartAgentCchat(StartAgentCchatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartAgentCchatEx(request, headers, runtime);
        }

        /**
         * Description: 智能体同步对话接口
         * Summary: 智能体同步对话接口
         */
        public async Task<StartAgentCchatResponse> StartAgentCchatAsync(StartAgentCchatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartAgentCchatExAsync(request, headers, runtime);
        }

        /**
         * Description: 智能体同步对话接口
         * Summary: 智能体同步对话接口
         */
        public StartAgentCchatResponse StartAgentCchatEx(StartAgentCchatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAgentCchatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.cchat.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智能体同步对话接口
         * Summary: 智能体同步对话接口
         */
        public async Task<StartAgentCchatResponse> StartAgentCchatExAsync(StartAgentCchatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAgentCchatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.cchat.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消对话接口
         * Summary: 取消对话接口
         */
        public CancelAgentChatResponse CancelAgentChat(CancelAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAgentChatEx(request, headers, runtime);
        }

        /**
         * Description: 取消对话接口
         * Summary: 取消对话接口
         */
        public async Task<CancelAgentChatResponse> CancelAgentChatAsync(CancelAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAgentChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消对话接口
         * Summary: 取消对话接口
         */
        public CancelAgentChatResponse CancelAgentChatEx(CancelAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAgentChatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.chat.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消对话接口
         * Summary: 取消对话接口
         */
        public async Task<CancelAgentChatResponse> CancelAgentChatExAsync(CancelAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAgentChatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.chat.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站-知识库文件上传
         * Summary: 主站-知识库文件上传
         */
        public UploadAlipayLibraryResponse UploadAlipayLibrary(UploadAlipayLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAlipayLibraryEx(request, headers, runtime);
        }

        /**
         * Description: 主站-知识库文件上传
         * Summary: 主站-知识库文件上传
         */
        public async Task<UploadAlipayLibraryResponse> UploadAlipayLibraryAsync(UploadAlipayLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAlipayLibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: 主站-知识库文件上传
         * Summary: 主站-知识库文件上传
         */
        public UploadAlipayLibraryResponse UploadAlipayLibraryEx(UploadAlipayLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.alipay.library.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAlipayLibraryResponse uploadAlipayLibraryResponse = new UploadAlipayLibraryResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAlipayLibraryResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAlipayLibraryResponse>(DoRequest("1.0", "antdigital.dtaiagt.alipay.library.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站-知识库文件上传
         * Summary: 主站-知识库文件上传
         */
        public async Task<UploadAlipayLibraryResponse> UploadAlipayLibraryExAsync(UploadAlipayLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.alipay.library.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAlipayLibraryResponse uploadAlipayLibraryResponse = new UploadAlipayLibraryResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAlipayLibraryResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAlipayLibraryResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.alipay.library.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站-Agent对话-上传文件
         * Summary: 主站-Agent对话-上传文件
         */
        public UploadAlipayAgentchatResponse UploadAlipayAgentchat(UploadAlipayAgentchatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAlipayAgentchatEx(request, headers, runtime);
        }

        /**
         * Description: 主站-Agent对话-上传文件
         * Summary: 主站-Agent对话-上传文件
         */
        public async Task<UploadAlipayAgentchatResponse> UploadAlipayAgentchatAsync(UploadAlipayAgentchatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAlipayAgentchatExAsync(request, headers, runtime);
        }

        /**
         * Description: 主站-Agent对话-上传文件
         * Summary: 主站-Agent对话-上传文件
         */
        public UploadAlipayAgentchatResponse UploadAlipayAgentchatEx(UploadAlipayAgentchatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.alipay.agentchat.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAlipayAgentchatResponse uploadAlipayAgentchatResponse = new UploadAlipayAgentchatResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAlipayAgentchatResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAlipayAgentchatResponse>(DoRequest("1.0", "antdigital.dtaiagt.alipay.agentchat.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站-Agent对话-上传文件
         * Summary: 主站-Agent对话-上传文件
         */
        public async Task<UploadAlipayAgentchatResponse> UploadAlipayAgentchatExAsync(UploadAlipayAgentchatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.alipay.agentchat.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAlipayAgentchatResponse uploadAlipayAgentchatResponse = new UploadAlipayAgentchatResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAlipayAgentchatResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAlipayAgentchatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.alipay.agentchat.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已订阅的mcp清单
         * Summary: 查询已订阅的mcp清单
         */
        public PagequeryMcpMymcpResponse PagequeryMcpMymcp(PagequeryMcpMymcpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryMcpMymcpEx(request, headers, runtime);
        }

        /**
         * Description: 查询已订阅的mcp清单
         * Summary: 查询已订阅的mcp清单
         */
        public async Task<PagequeryMcpMymcpResponse> PagequeryMcpMymcpAsync(PagequeryMcpMymcpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryMcpMymcpExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已订阅的mcp清单
         * Summary: 查询已订阅的mcp清单
         */
        public PagequeryMcpMymcpResponse PagequeryMcpMymcpEx(PagequeryMcpMymcpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryMcpMymcpResponse>(DoRequest("1.0", "antdigital.dtaiagt.mcp.mymcp.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已订阅的mcp清单
         * Summary: 查询已订阅的mcp清单
         */
        public async Task<PagequeryMcpMymcpResponse> PagequeryMcpMymcpExAsync(PagequeryMcpMymcpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryMcpMymcpResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.mcp.mymcp.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: mcp详情
         * Summary: mcp详情
         */
        public DetailMcpMymcpResponse DetailMcpMymcp(DetailMcpMymcpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailMcpMymcpEx(request, headers, runtime);
        }

        /**
         * Description: mcp详情
         * Summary: mcp详情
         */
        public async Task<DetailMcpMymcpResponse> DetailMcpMymcpAsync(DetailMcpMymcpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailMcpMymcpExAsync(request, headers, runtime);
        }

        /**
         * Description: mcp详情
         * Summary: mcp详情
         */
        public DetailMcpMymcpResponse DetailMcpMymcpEx(DetailMcpMymcpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailMcpMymcpResponse>(DoRequest("1.0", "antdigital.dtaiagt.mcp.mymcp.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: mcp详情
         * Summary: mcp详情
         */
        public async Task<DetailMcpMymcpResponse> DetailMcpMymcpExAsync(DetailMcpMymcpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailMcpMymcpResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.mcp.mymcp.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库-文档分页查询
         * Summary: 知识库-文档分页查询
         */
        public ListLibraryDocResponse ListLibraryDoc(ListLibraryDocRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListLibraryDocEx(request, headers, runtime);
        }

        /**
         * Description: 知识库-文档分页查询
         * Summary: 知识库-文档分页查询
         */
        public async Task<ListLibraryDocResponse> ListLibraryDocAsync(ListLibraryDocRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListLibraryDocExAsync(request, headers, runtime);
        }

        /**
         * Description: 知识库-文档分页查询
         * Summary: 知识库-文档分页查询
         */
        public ListLibraryDocResponse ListLibraryDocEx(ListLibraryDocRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLibraryDocResponse>(DoRequest("1.0", "antdigital.dtaiagt.library.doc.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库-文档分页查询
         * Summary: 知识库-文档分页查询
         */
        public async Task<ListLibraryDocResponse> ListLibraryDocExAsync(ListLibraryDocRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLibraryDocResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.library.doc.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库-任务列表
         * Summary: 知识库-任务列表
         */
        public ListLibraryTaskResponse ListLibraryTask(ListLibraryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListLibraryTaskEx(request, headers, runtime);
        }

        /**
         * Description: 知识库-任务列表
         * Summary: 知识库-任务列表
         */
        public async Task<ListLibraryTaskResponse> ListLibraryTaskAsync(ListLibraryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListLibraryTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 知识库-任务列表
         * Summary: 知识库-任务列表
         */
        public ListLibraryTaskResponse ListLibraryTaskEx(ListLibraryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLibraryTaskResponse>(DoRequest("1.0", "antdigital.dtaiagt.library.task.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库-任务列表
         * Summary: 知识库-任务列表
         */
        public async Task<ListLibraryTaskResponse> ListLibraryTaskExAsync(ListLibraryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLibraryTaskResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.library.task.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库-文档切片
         * Summary: 知识库-文档切片
         */
        public ExecLibraryDocsplitResponse ExecLibraryDocsplit(ExecLibraryDocsplitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecLibraryDocsplitEx(request, headers, runtime);
        }

        /**
         * Description: 知识库-文档切片
         * Summary: 知识库-文档切片
         */
        public async Task<ExecLibraryDocsplitResponse> ExecLibraryDocsplitAsync(ExecLibraryDocsplitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecLibraryDocsplitExAsync(request, headers, runtime);
        }

        /**
         * Description: 知识库-文档切片
         * Summary: 知识库-文档切片
         */
        public ExecLibraryDocsplitResponse ExecLibraryDocsplitEx(ExecLibraryDocsplitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecLibraryDocsplitResponse>(DoRequest("1.0", "antdigital.dtaiagt.library.docsplit.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库-文档切片
         * Summary: 知识库-文档切片
         */
        public async Task<ExecLibraryDocsplitResponse> ExecLibraryDocsplitExAsync(ExecLibraryDocsplitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecLibraryDocsplitResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.library.docsplit.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Agent历史会话列表
         * Summary: 查询Agent历史会话列表
         */
        public ListAgentChatResponse ListAgentChat(ListAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAgentChatEx(request, headers, runtime);
        }

        /**
         * Description: 查询Agent历史会话列表
         * Summary: 查询Agent历史会话列表
         */
        public async Task<ListAgentChatResponse> ListAgentChatAsync(ListAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAgentChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询Agent历史会话列表
         * Summary: 查询Agent历史会话列表
         */
        public ListAgentChatResponse ListAgentChatEx(ListAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAgentChatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.chat.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Agent历史会话列表
         * Summary: 查询Agent历史会话列表
         */
        public async Task<ListAgentChatResponse> ListAgentChatExAsync(ListAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAgentChatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.chat.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看Agent历史会话详情
         * Summary: 查看Agent历史会话详情
         */
        public DetailAgentChatResponse DetailAgentChat(DetailAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailAgentChatEx(request, headers, runtime);
        }

        /**
         * Description: 查看Agent历史会话详情
         * Summary: 查看Agent历史会话详情
         */
        public async Task<DetailAgentChatResponse> DetailAgentChatAsync(DetailAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailAgentChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 查看Agent历史会话详情
         * Summary: 查看Agent历史会话详情
         */
        public DetailAgentChatResponse DetailAgentChatEx(DetailAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAgentChatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.chat.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查看Agent历史会话详情
         * Summary: 查看Agent历史会话详情
         */
        public async Task<DetailAgentChatResponse> DetailAgentChatExAsync(DetailAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAgentChatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.chat.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除Agent会话
         * Summary: 删除Agent会话
         */
        public DeleteAgentChatResponse DeleteAgentChat(DeleteAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAgentChatEx(request, headers, runtime);
        }

        /**
         * Description: 删除Agent会话
         * Summary: 删除Agent会话
         */
        public async Task<DeleteAgentChatResponse> DeleteAgentChatAsync(DeleteAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAgentChatExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除Agent会话
         * Summary: 删除Agent会话
         */
        public DeleteAgentChatResponse DeleteAgentChatEx(DeleteAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAgentChatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.chat.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除Agent会话
         * Summary: 删除Agent会话
         */
        public async Task<DeleteAgentChatResponse> DeleteAgentChatExAsync(DeleteAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAgentChatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.chat.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Agent对话-点赞点踩反馈&删除消息评价
         * Summary: Agent对话-赞/踩反馈&删除消息评价
         */
        public UpdateAgentChatResponse UpdateAgentChat(UpdateAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAgentChatEx(request, headers, runtime);
        }

        /**
         * Description: Agent对话-点赞点踩反馈&删除消息评价
         * Summary: Agent对话-赞/踩反馈&删除消息评价
         */
        public async Task<UpdateAgentChatResponse> UpdateAgentChatAsync(UpdateAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAgentChatExAsync(request, headers, runtime);
        }

        /**
         * Description: Agent对话-点赞点踩反馈&删除消息评价
         * Summary: Agent对话-赞/踩反馈&删除消息评价
         */
        public UpdateAgentChatResponse UpdateAgentChatEx(UpdateAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAgentChatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.chat.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Agent对话-点赞点踩反馈&删除消息评价
         * Summary: Agent对话-赞/踩反馈&删除消息评价
         */
        public async Task<UpdateAgentChatResponse> UpdateAgentChatExAsync(UpdateAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAgentChatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.chat.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取 Agent 详情
         * Summary: 获取 Agent 详情
         */
        public DetailAgentInfoResponse DetailAgentInfo(DetailAgentInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailAgentInfoEx(request, headers, runtime);
        }

        /**
         * Description: 获取 Agent 详情
         * Summary: 获取 Agent 详情
         */
        public async Task<DetailAgentInfoResponse> DetailAgentInfoAsync(DetailAgentInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailAgentInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取 Agent 详情
         * Summary: 获取 Agent 详情
         */
        public DetailAgentInfoResponse DetailAgentInfoEx(DetailAgentInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAgentInfoResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.info.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取 Agent 详情
         * Summary: 获取 Agent 详情
         */
        public async Task<DetailAgentInfoResponse> DetailAgentInfoExAsync(DetailAgentInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAgentInfoResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.info.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Agent停止对话
         * Summary: Agent停止对话
         */
        public StopAgentChatResponse StopAgentChat(StopAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopAgentChatEx(request, headers, runtime);
        }

        /**
         * Description: Agent停止对话
         * Summary: Agent停止对话
         */
        public async Task<StopAgentChatResponse> StopAgentChatAsync(StopAgentChatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopAgentChatExAsync(request, headers, runtime);
        }

        /**
         * Description: Agent停止对话
         * Summary: Agent停止对话
         */
        public StopAgentChatResponse StopAgentChatEx(StopAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopAgentChatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.chat.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Agent停止对话
         * Summary: Agent停止对话
         */
        public async Task<StopAgentChatResponse> StopAgentChatExAsync(StopAgentChatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopAgentChatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.chat.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Agent对话-上传文件
         * Summary: Agent对话-上传文件
         */
        public UploadAgentPortalchatResponse UploadAgentPortalchat(UploadAgentPortalchatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAgentPortalchatEx(request, headers, runtime);
        }

        /**
         * Description: Agent对话-上传文件
         * Summary: Agent对话-上传文件
         */
        public async Task<UploadAgentPortalchatResponse> UploadAgentPortalchatAsync(UploadAgentPortalchatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAgentPortalchatExAsync(request, headers, runtime);
        }

        /**
         * Description: Agent对话-上传文件
         * Summary: Agent对话-上传文件
         */
        public UploadAgentPortalchatResponse UploadAgentPortalchatEx(UploadAgentPortalchatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.agent.portalchat.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAgentPortalchatResponse uploadAgentPortalchatResponse = new UploadAgentPortalchatResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAgentPortalchatResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAgentPortalchatResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.portalchat.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Agent对话-上传文件
         * Summary: Agent对话-上传文件
         */
        public async Task<UploadAgentPortalchatResponse> UploadAgentPortalchatExAsync(UploadAgentPortalchatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.agent.portalchat.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAgentPortalchatResponse uploadAgentPortalchatResponse = new UploadAgentPortalchatResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAgentPortalchatResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAgentPortalchatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.portalchat.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库-文档库-文档下载
         * Summary: 知识库-文档库-文档下载
         */
        public DownloadLibraryDocResponse DownloadLibraryDoc(DownloadLibraryDocRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadLibraryDocEx(request, headers, runtime);
        }

        /**
         * Description: 知识库-文档库-文档下载
         * Summary: 知识库-文档库-文档下载
         */
        public async Task<DownloadLibraryDocResponse> DownloadLibraryDocAsync(DownloadLibraryDocRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadLibraryDocExAsync(request, headers, runtime);
        }

        /**
         * Description: 知识库-文档库-文档下载
         * Summary: 知识库-文档库-文档下载
         */
        public DownloadLibraryDocResponse DownloadLibraryDocEx(DownloadLibraryDocRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadLibraryDocResponse>(DoRequest("1.0", "antdigital.dtaiagt.library.doc.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 知识库-文档库-文档下载
         * Summary: 知识库-文档库-文档下载
         */
        public async Task<DownloadLibraryDocResponse> DownloadLibraryDocExAsync(DownloadLibraryDocRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadLibraryDocResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.library.doc.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: SAAS-知识库文件上传
         * Summary: SAAS-知识库文件上传
         */
        public UploadSaasLibraryResponse UploadSaasLibrary(UploadSaasLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadSaasLibraryEx(request, headers, runtime);
        }

        /**
         * Description: SAAS-知识库文件上传
         * Summary: SAAS-知识库文件上传
         */
        public async Task<UploadSaasLibraryResponse> UploadSaasLibraryAsync(UploadSaasLibraryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadSaasLibraryExAsync(request, headers, runtime);
        }

        /**
         * Description: SAAS-知识库文件上传
         * Summary: SAAS-知识库文件上传
         */
        public UploadSaasLibraryResponse UploadSaasLibraryEx(UploadSaasLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.saas.library.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadSaasLibraryResponse uploadSaasLibraryResponse = new UploadSaasLibraryResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadSaasLibraryResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSaasLibraryResponse>(DoRequest("1.0", "antdigital.dtaiagt.saas.library.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: SAAS-知识库文件上传
         * Summary: SAAS-知识库文件上传
         */
        public async Task<UploadSaasLibraryResponse> UploadSaasLibraryExAsync(UploadSaasLibraryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.saas.library.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadSaasLibraryResponse uploadSaasLibraryResponse = new UploadSaasLibraryResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadSaasLibraryResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSaasLibraryResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.saas.library.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: SAAS-Agent对话-上传文件
         * Summary: SAAS-Agent对话-上传文件
         */
        public UploadSaasAgentchatResponse UploadSaasAgentchat(UploadSaasAgentchatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadSaasAgentchatEx(request, headers, runtime);
        }

        /**
         * Description: SAAS-Agent对话-上传文件
         * Summary: SAAS-Agent对话-上传文件
         */
        public async Task<UploadSaasAgentchatResponse> UploadSaasAgentchatAsync(UploadSaasAgentchatRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadSaasAgentchatExAsync(request, headers, runtime);
        }

        /**
         * Description: SAAS-Agent对话-上传文件
         * Summary: SAAS-Agent对话-上传文件
         */
        public UploadSaasAgentchatResponse UploadSaasAgentchatEx(UploadSaasAgentchatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.saas.agentchat.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadSaasAgentchatResponse uploadSaasAgentchatResponse = new UploadSaasAgentchatResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadSaasAgentchatResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSaasAgentchatResponse>(DoRequest("1.0", "antdigital.dtaiagt.saas.agentchat.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: SAAS-Agent对话-上传文件
         * Summary: SAAS-Agent对话-上传文件
         */
        public async Task<UploadSaasAgentchatResponse> UploadSaasAgentchatExAsync(UploadSaasAgentchatRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antdigital.dtaiagt.saas.agentchat.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadSaasAgentchatResponse uploadSaasAgentchatResponse = new UploadSaasAgentchatResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadSaasAgentchatResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadSaasAgentchatResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.saas.agentchat.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长任务对话，发起任务&重连任务
         * Summary: 长任务对话
         */
        public StartAgentTaskResponse StartAgentTask(StartAgentTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartAgentTaskEx(request, headers, runtime);
        }

        /**
         * Description: 长任务对话，发起任务&重连任务
         * Summary: 长任务对话
         */
        public async Task<StartAgentTaskResponse> StartAgentTaskAsync(StartAgentTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartAgentTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 长任务对话，发起任务&重连任务
         * Summary: 长任务对话
         */
        public StartAgentTaskResponse StartAgentTaskEx(StartAgentTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAgentTaskResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.task.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长任务对话，发起任务&重连任务
         * Summary: 长任务对话
         */
        public async Task<StartAgentTaskResponse> StartAgentTaskExAsync(StartAgentTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAgentTaskResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.task.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终止任务
         * Summary: 终止任务
         */
        public StopAgentTaskResponse StopAgentTask(StopAgentTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopAgentTaskEx(request, headers, runtime);
        }

        /**
         * Description: 终止任务
         * Summary: 终止任务
         */
        public async Task<StopAgentTaskResponse> StopAgentTaskAsync(StopAgentTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopAgentTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 终止任务
         * Summary: 终止任务
         */
        public StopAgentTaskResponse StopAgentTaskEx(StopAgentTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopAgentTaskResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.task.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 终止任务
         * Summary: 终止任务
         */
        public async Task<StopAgentTaskResponse> StopAgentTaskExAsync(StopAgentTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopAgentTaskResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.task.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取前序消息流
         * Summary: 获取前序消息流
         */
        public OperateAgentTaskResponse OperateAgentTask(OperateAgentTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateAgentTaskEx(request, headers, runtime);
        }

        /**
         * Description: 获取前序消息流
         * Summary: 获取前序消息流
         */
        public async Task<OperateAgentTaskResponse> OperateAgentTaskAsync(OperateAgentTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateAgentTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取前序消息流
         * Summary: 获取前序消息流
         */
        public OperateAgentTaskResponse OperateAgentTaskEx(OperateAgentTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateAgentTaskResponse>(DoRequest("1.0", "antdigital.dtaiagt.agent.task.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取前序消息流
         * Summary: 获取前序消息流
         */
        public async Task<OperateAgentTaskResponse> OperateAgentTaskExAsync(OperateAgentTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateAgentTaskResponse>(await DoRequestAsync("1.0", "antdigital.dtaiagt.agent.task.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
