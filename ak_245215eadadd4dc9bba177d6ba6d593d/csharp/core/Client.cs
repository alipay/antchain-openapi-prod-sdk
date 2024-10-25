// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d.Models;

namespace AntChain.SDK.Ak_245215eadadd4dc9bba177d6ba6d593d
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
                        {"sdk_version", "1.1.2"},
                        {"_prod_code", "ak_245215eadadd4dc9bba177d6ba6d593d"},
                        {"_prod_channel", "saas"},
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
                        {"sdk_version", "1.1.2"},
                        {"_prod_code", "ak_245215eadadd4dc9bba177d6ba6d593d"},
                        {"_prod_channel", "saas"},
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
         * Description: 数字人音色列表
         * Summary: 数字人音色列表
         */
        public ListUniversalsaasDigitalhumanVideoVoiceResponse ListUniversalsaasDigitalhumanVideoVoice(ListUniversalsaasDigitalhumanVideoVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanVideoVoiceEx(request, headers, runtime);
        }

        /**
         * Description: 数字人音色列表
         * Summary: 数字人音色列表
         */
        public async Task<ListUniversalsaasDigitalhumanVideoVoiceResponse> ListUniversalsaasDigitalhumanVideoVoiceAsync(ListUniversalsaasDigitalhumanVideoVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanVideoVoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字人音色列表
         * Summary: 数字人音色列表
         */
        public ListUniversalsaasDigitalhumanVideoVoiceResponse ListUniversalsaasDigitalhumanVideoVoiceEx(ListUniversalsaasDigitalhumanVideoVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanVideoVoiceResponse>(DoRequest("1.0", "universalsaas.digitalhuman.video.voice.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人音色列表
         * Summary: 数字人音色列表
         */
        public async Task<ListUniversalsaasDigitalhumanVideoVoiceResponse> ListUniversalsaasDigitalhumanVideoVoiceExAsync(ListUniversalsaasDigitalhumanVideoVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanVideoVoiceResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.video.voice.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人短视频形象列表
         * Summary: 数字人短视频形象列表
         */
        public ListUniversalsaasDigitalhumanVideoProfileResponse ListUniversalsaasDigitalhumanVideoProfile(ListUniversalsaasDigitalhumanVideoProfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUniversalsaasDigitalhumanVideoProfileEx(request, headers, runtime);
        }

        /**
         * Description: 数字人短视频形象列表
         * Summary: 数字人短视频形象列表
         */
        public async Task<ListUniversalsaasDigitalhumanVideoProfileResponse> ListUniversalsaasDigitalhumanVideoProfileAsync(ListUniversalsaasDigitalhumanVideoProfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUniversalsaasDigitalhumanVideoProfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字人短视频形象列表
         * Summary: 数字人短视频形象列表
         */
        public ListUniversalsaasDigitalhumanVideoProfileResponse ListUniversalsaasDigitalhumanVideoProfileEx(ListUniversalsaasDigitalhumanVideoProfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanVideoProfileResponse>(DoRequest("1.0", "universalsaas.digitalhuman.video.profile.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人短视频形象列表
         * Summary: 数字人短视频形象列表
         */
        public async Task<ListUniversalsaasDigitalhumanVideoProfileResponse> ListUniversalsaasDigitalhumanVideoProfileExAsync(ListUniversalsaasDigitalhumanVideoProfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUniversalsaasDigitalhumanVideoProfileResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.video.profile.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频合成任务生成
         * Summary: 视频合成任务生成
         */
        public CreateUniversalsaasDigitalhumanVideoTaskResponse CreateUniversalsaasDigitalhumanVideoTask(CreateUniversalsaasDigitalhumanVideoTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUniversalsaasDigitalhumanVideoTaskEx(request, headers, runtime);
        }

        /**
         * Description: 视频合成任务生成
         * Summary: 视频合成任务生成
         */
        public async Task<CreateUniversalsaasDigitalhumanVideoTaskResponse> CreateUniversalsaasDigitalhumanVideoTaskAsync(CreateUniversalsaasDigitalhumanVideoTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUniversalsaasDigitalhumanVideoTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 视频合成任务生成
         * Summary: 视频合成任务生成
         */
        public CreateUniversalsaasDigitalhumanVideoTaskResponse CreateUniversalsaasDigitalhumanVideoTaskEx(CreateUniversalsaasDigitalhumanVideoTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUniversalsaasDigitalhumanVideoTaskResponse>(DoRequest("1.0", "universalsaas.digitalhuman.video.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频合成任务生成
         * Summary: 视频合成任务生成
         */
        public async Task<CreateUniversalsaasDigitalhumanVideoTaskResponse> CreateUniversalsaasDigitalhumanVideoTaskExAsync(CreateUniversalsaasDigitalhumanVideoTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUniversalsaasDigitalhumanVideoTaskResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.video.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频合成任务查询
         * Summary: 视频合成任务查询
         */
        public QueryUniversalsaasDigitalhumanVideoTaskResponse QueryUniversalsaasDigitalhumanVideoTask(QueryUniversalsaasDigitalhumanVideoTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUniversalsaasDigitalhumanVideoTaskEx(request, headers, runtime);
        }

        /**
         * Description: 视频合成任务查询
         * Summary: 视频合成任务查询
         */
        public async Task<QueryUniversalsaasDigitalhumanVideoTaskResponse> QueryUniversalsaasDigitalhumanVideoTaskAsync(QueryUniversalsaasDigitalhumanVideoTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUniversalsaasDigitalhumanVideoTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 视频合成任务查询
         * Summary: 视频合成任务查询
         */
        public QueryUniversalsaasDigitalhumanVideoTaskResponse QueryUniversalsaasDigitalhumanVideoTaskEx(QueryUniversalsaasDigitalhumanVideoTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUniversalsaasDigitalhumanVideoTaskResponse>(DoRequest("1.0", "universalsaas.digitalhuman.video.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频合成任务查询
         * Summary: 视频合成任务查询
         */
        public async Task<QueryUniversalsaasDigitalhumanVideoTaskResponse> QueryUniversalsaasDigitalhumanVideoTaskExAsync(QueryUniversalsaasDigitalhumanVideoTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUniversalsaasDigitalhumanVideoTaskResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.video.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人tts接口
         * Summary: 数字人tts接口
         */
        public CreateUniversalsaasDigitalhumanVoiceResponse CreateUniversalsaasDigitalhumanVoice(CreateUniversalsaasDigitalhumanVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUniversalsaasDigitalhumanVoiceEx(request, headers, runtime);
        }

        /**
         * Description: 数字人tts接口
         * Summary: 数字人tts接口
         */
        public async Task<CreateUniversalsaasDigitalhumanVoiceResponse> CreateUniversalsaasDigitalhumanVoiceAsync(CreateUniversalsaasDigitalhumanVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUniversalsaasDigitalhumanVoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字人tts接口
         * Summary: 数字人tts接口
         */
        public CreateUniversalsaasDigitalhumanVoiceResponse CreateUniversalsaasDigitalhumanVoiceEx(CreateUniversalsaasDigitalhumanVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUniversalsaasDigitalhumanVoiceResponse>(DoRequest("1.0", "universalsaas.digitalhuman.voice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字人tts接口
         * Summary: 数字人tts接口
         */
        public async Task<CreateUniversalsaasDigitalhumanVoiceResponse> CreateUniversalsaasDigitalhumanVoiceExAsync(CreateUniversalsaasDigitalhumanVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUniversalsaasDigitalhumanVoiceResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.voice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极速训练数字人分身，返回modelId
         * Summary: 训练数字人分身
         */
        public CloneUniversalsaasDigitalhumanAvatarResponse CloneUniversalsaasDigitalhumanAvatar(CloneUniversalsaasDigitalhumanAvatarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloneUniversalsaasDigitalhumanAvatarEx(request, headers, runtime);
        }

        /**
         * Description: 极速训练数字人分身，返回modelId
         * Summary: 训练数字人分身
         */
        public async Task<CloneUniversalsaasDigitalhumanAvatarResponse> CloneUniversalsaasDigitalhumanAvatarAsync(CloneUniversalsaasDigitalhumanAvatarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloneUniversalsaasDigitalhumanAvatarExAsync(request, headers, runtime);
        }

        /**
         * Description: 极速训练数字人分身，返回modelId
         * Summary: 训练数字人分身
         */
        public CloneUniversalsaasDigitalhumanAvatarResponse CloneUniversalsaasDigitalhumanAvatarEx(CloneUniversalsaasDigitalhumanAvatarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneUniversalsaasDigitalhumanAvatarResponse>(DoRequest("1.0", "universalsaas.digitalhuman.avatar.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极速训练数字人分身，返回modelId
         * Summary: 训练数字人分身
         */
        public async Task<CloneUniversalsaasDigitalhumanAvatarResponse> CloneUniversalsaasDigitalhumanAvatarExAsync(CloneUniversalsaasDigitalhumanAvatarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneUniversalsaasDigitalhumanAvatarResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.avatar.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音色克隆
         * Summary: 音色克隆
         */
        public CloneUniversalsaasDigitalhumanAvatarVoiceResponse CloneUniversalsaasDigitalhumanAvatarVoice(CloneUniversalsaasDigitalhumanAvatarVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloneUniversalsaasDigitalhumanAvatarVoiceEx(request, headers, runtime);
        }

        /**
         * Description: 音色克隆
         * Summary: 音色克隆
         */
        public async Task<CloneUniversalsaasDigitalhumanAvatarVoiceResponse> CloneUniversalsaasDigitalhumanAvatarVoiceAsync(CloneUniversalsaasDigitalhumanAvatarVoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloneUniversalsaasDigitalhumanAvatarVoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 音色克隆
         * Summary: 音色克隆
         */
        public CloneUniversalsaasDigitalhumanAvatarVoiceResponse CloneUniversalsaasDigitalhumanAvatarVoiceEx(CloneUniversalsaasDigitalhumanAvatarVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneUniversalsaasDigitalhumanAvatarVoiceResponse>(DoRequest("1.0", "universalsaas.digitalhuman.avatar.voice.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音色克隆
         * Summary: 音色克隆
         */
        public async Task<CloneUniversalsaasDigitalhumanAvatarVoiceResponse> CloneUniversalsaasDigitalhumanAvatarVoiceExAsync(CloneUniversalsaasDigitalhumanAvatarVoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneUniversalsaasDigitalhumanAvatarVoiceResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.avatar.voice.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 训练数字人分身任务查询
         * Summary: 训练数字人分身任务查询
         */
        public QueryUniversalsaasDigitalhumanCloneTaskResponse QueryUniversalsaasDigitalhumanCloneTask(QueryUniversalsaasDigitalhumanCloneTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUniversalsaasDigitalhumanCloneTaskEx(request, headers, runtime);
        }

        /**
         * Description: 训练数字人分身任务查询
         * Summary: 训练数字人分身任务查询
         */
        public async Task<QueryUniversalsaasDigitalhumanCloneTaskResponse> QueryUniversalsaasDigitalhumanCloneTaskAsync(QueryUniversalsaasDigitalhumanCloneTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUniversalsaasDigitalhumanCloneTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 训练数字人分身任务查询
         * Summary: 训练数字人分身任务查询
         */
        public QueryUniversalsaasDigitalhumanCloneTaskResponse QueryUniversalsaasDigitalhumanCloneTaskEx(QueryUniversalsaasDigitalhumanCloneTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUniversalsaasDigitalhumanCloneTaskResponse>(DoRequest("1.0", "universalsaas.digitalhuman.clone.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 训练数字人分身任务查询
         * Summary: 训练数字人分身任务查询
         */
        public async Task<QueryUniversalsaasDigitalhumanCloneTaskResponse> QueryUniversalsaasDigitalhumanCloneTaskExAsync(QueryUniversalsaasDigitalhumanCloneTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUniversalsaasDigitalhumanCloneTaskResponse>(await DoRequestAsync("1.0", "universalsaas.digitalhuman.clone.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
