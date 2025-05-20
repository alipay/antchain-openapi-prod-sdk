// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.AITECH.Models;

namespace AntChain.SDK.AITECH
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
                        {"sdk_version", "1.1.19"},
                        {"_prod_code", "AITECH"},
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
                        {"sdk_version", "1.1.19"},
                        {"_prod_code", "AITECH"},
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
         * Description: LOGO/二维码审核
         * Summary: LOGO/二维码审核
         */
        public ApplyAuditImageResponse ApplyAuditImage(ApplyAuditImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAuditImageEx(request, headers, runtime);
        }

        /**
         * Description: LOGO/二维码审核
         * Summary: LOGO/二维码审核
         */
        public async Task<ApplyAuditImageResponse> ApplyAuditImageAsync(ApplyAuditImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAuditImageExAsync(request, headers, runtime);
        }

        /**
         * Description: LOGO/二维码审核
         * Summary: LOGO/二维码审核
         */
        public ApplyAuditImageResponse ApplyAuditImageEx(ApplyAuditImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAuditImageResponse>(DoRequest("1.0", "aitech.comm.audit.image.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LOGO/二维码审核
         * Summary: LOGO/二维码审核
         */
        public async Task<ApplyAuditImageResponse> ApplyAuditImageExAsync(ApplyAuditImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAuditImageResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.image.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站审核能力回调
         * Summary: 主站审核能力回调
         */
        public CallbackSofaAuditResponse CallbackSofaAudit(CallbackSofaAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackSofaAuditEx(request, headers, runtime);
        }

        /**
         * Description: 主站审核能力回调
         * Summary: 主站审核能力回调
         */
        public async Task<CallbackSofaAuditResponse> CallbackSofaAuditAsync(CallbackSofaAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackSofaAuditExAsync(request, headers, runtime);
        }

        /**
         * Description: 主站审核能力回调
         * Summary: 主站审核能力回调
         */
        public CallbackSofaAuditResponse CallbackSofaAuditEx(CallbackSofaAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSofaAuditResponse>(DoRequest("1.0", "aitech.comm.sofa.audit.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站审核能力回调
         * Summary: 主站审核能力回调
         */
        public async Task<CallbackSofaAuditResponse> CallbackSofaAuditExAsync(CallbackSofaAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSofaAuditResponse>(await DoRequestAsync("1.0", "aitech.comm.sofa.audit.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本审核入审
         * Summary: 文本审核入审
         */
        public SubmitAuditTextResponse SubmitAuditText(SubmitAuditTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAuditTextEx(request, headers, runtime);
        }

        /**
         * Description: 文本审核入审
         * Summary: 文本审核入审
         */
        public async Task<SubmitAuditTextResponse> SubmitAuditTextAsync(SubmitAuditTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAuditTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本审核入审
         * Summary: 文本审核入审
         */
        public SubmitAuditTextResponse SubmitAuditTextEx(SubmitAuditTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditTextResponse>(DoRequest("1.0", "aitech.comm.audit.text.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本审核入审
         * Summary: 文本审核入审
         */
        public async Task<SubmitAuditTextResponse> SubmitAuditTextExAsync(SubmitAuditTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditTextResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.text.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本审核查询
         * Summary: 文本审核查询
         */
        public QueryAuditTextResponse QueryAuditText(QueryAuditTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuditTextEx(request, headers, runtime);
        }

        /**
         * Description: 文本审核查询
         * Summary: 文本审核查询
         */
        public async Task<QueryAuditTextResponse> QueryAuditTextAsync(QueryAuditTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuditTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本审核查询
         * Summary: 文本审核查询
         */
        public QueryAuditTextResponse QueryAuditTextEx(QueryAuditTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditTextResponse>(DoRequest("1.0", "aitech.comm.audit.text.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本审核查询
         * Summary: 文本审核查询
         */
        public async Task<QueryAuditTextResponse> QueryAuditTextExAsync(QueryAuditTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditTextResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.text.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片审核入审
         * Summary: 图片审核入审
         */
        public SubmitAuditImageResponse SubmitAuditImage(SubmitAuditImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAuditImageEx(request, headers, runtime);
        }

        /**
         * Description: 图片审核入审
         * Summary: 图片审核入审
         */
        public async Task<SubmitAuditImageResponse> SubmitAuditImageAsync(SubmitAuditImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAuditImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 图片审核入审
         * Summary: 图片审核入审
         */
        public SubmitAuditImageResponse SubmitAuditImageEx(SubmitAuditImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditImageResponse>(DoRequest("1.0", "aitech.comm.audit.image.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片审核入审
         * Summary: 图片审核入审
         */
        public async Task<SubmitAuditImageResponse> SubmitAuditImageExAsync(SubmitAuditImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditImageResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.image.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片审核查询
         * Summary: 图片审核查询
         */
        public QueryAuditImageResponse QueryAuditImage(QueryAuditImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuditImageEx(request, headers, runtime);
        }

        /**
         * Description: 图片审核查询
         * Summary: 图片审核查询
         */
        public async Task<QueryAuditImageResponse> QueryAuditImageAsync(QueryAuditImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuditImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 图片审核查询
         * Summary: 图片审核查询
         */
        public QueryAuditImageResponse QueryAuditImageEx(QueryAuditImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditImageResponse>(DoRequest("1.0", "aitech.comm.audit.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片审核查询
         * Summary: 图片审核查询
         */
        public async Task<QueryAuditImageResponse> QueryAuditImageExAsync(QueryAuditImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditImageResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频审核入审
         * Summary: 音频审核入审
         */
        public SubmitAuditAudioResponse SubmitAuditAudio(SubmitAuditAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAuditAudioEx(request, headers, runtime);
        }

        /**
         * Description: 音频审核入审
         * Summary: 音频审核入审
         */
        public async Task<SubmitAuditAudioResponse> SubmitAuditAudioAsync(SubmitAuditAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAuditAudioExAsync(request, headers, runtime);
        }

        /**
         * Description: 音频审核入审
         * Summary: 音频审核入审
         */
        public SubmitAuditAudioResponse SubmitAuditAudioEx(SubmitAuditAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditAudioResponse>(DoRequest("1.0", "aitech.comm.audit.audio.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频审核入审
         * Summary: 音频审核入审
         */
        public async Task<SubmitAuditAudioResponse> SubmitAuditAudioExAsync(SubmitAuditAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditAudioResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.audio.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频审核查询
         * Summary: 音频审核查询
         */
        public QueryAuditAudioResponse QueryAuditAudio(QueryAuditAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuditAudioEx(request, headers, runtime);
        }

        /**
         * Description: 音频审核查询
         * Summary: 音频审核查询
         */
        public async Task<QueryAuditAudioResponse> QueryAuditAudioAsync(QueryAuditAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuditAudioExAsync(request, headers, runtime);
        }

        /**
         * Description: 音频审核查询
         * Summary: 音频审核查询
         */
        public QueryAuditAudioResponse QueryAuditAudioEx(QueryAuditAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditAudioResponse>(DoRequest("1.0", "aitech.comm.audit.audio.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频审核查询
         * Summary: 音频审核查询
         */
        public async Task<QueryAuditAudioResponse> QueryAuditAudioExAsync(QueryAuditAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditAudioResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.audio.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频审核入审
         * Summary: 视频审核入审
         */
        public SubmitAuditVideoResponse SubmitAuditVideo(SubmitAuditVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAuditVideoEx(request, headers, runtime);
        }

        /**
         * Description: 视频审核入审
         * Summary: 视频审核入审
         */
        public async Task<SubmitAuditVideoResponse> SubmitAuditVideoAsync(SubmitAuditVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAuditVideoExAsync(request, headers, runtime);
        }

        /**
         * Description: 视频审核入审
         * Summary: 视频审核入审
         */
        public SubmitAuditVideoResponse SubmitAuditVideoEx(SubmitAuditVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditVideoResponse>(DoRequest("1.0", "aitech.comm.audit.video.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频审核入审
         * Summary: 视频审核入审
         */
        public async Task<SubmitAuditVideoResponse> SubmitAuditVideoExAsync(SubmitAuditVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditVideoResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.video.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频审核查询
         * Summary: 视频审核查询
         */
        public QueryAuditVideoResponse QueryAuditVideo(QueryAuditVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuditVideoEx(request, headers, runtime);
        }

        /**
         * Description: 视频审核查询
         * Summary: 视频审核查询
         */
        public async Task<QueryAuditVideoResponse> QueryAuditVideoAsync(QueryAuditVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuditVideoExAsync(request, headers, runtime);
        }

        /**
         * Description: 视频审核查询
         * Summary: 视频审核查询
         */
        public QueryAuditVideoResponse QueryAuditVideoEx(QueryAuditVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditVideoResponse>(DoRequest("1.0", "aitech.comm.audit.video.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频审核查询
         * Summary: 视频审核查询
         */
        public async Task<QueryAuditVideoResponse> QueryAuditVideoExAsync(QueryAuditVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditVideoResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.video.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
         * Summary: 文本同步审核
         */
        public ApplyAuditTextResponse ApplyAuditText(ApplyAuditTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAuditTextEx(request, headers, runtime);
        }

        /**
         * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
         * Summary: 文本同步审核
         */
        public async Task<ApplyAuditTextResponse> ApplyAuditTextAsync(ApplyAuditTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAuditTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
         * Summary: 文本同步审核
         */
        public ApplyAuditTextResponse ApplyAuditTextEx(ApplyAuditTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAuditTextResponse>(DoRequest("1.0", "aitech.comm.audit.text.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本同步审核接口，调用阿里云内容安全审核增强版
         * Summary: 文本同步审核
         */
        public async Task<ApplyAuditTextResponse> ApplyAuditTextExAsync(ApplyAuditTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAuditTextResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.text.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步接口，只调用机审能力
         * Summary: 图片机审基础版
         */
        public ApplyAuditImagebaseResponse ApplyAuditImagebase(ApplyAuditImagebaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAuditImagebaseEx(request, headers, runtime);
        }

        /**
         * Description: 同步接口，只调用机审能力
         * Summary: 图片机审基础版
         */
        public async Task<ApplyAuditImagebaseResponse> ApplyAuditImagebaseAsync(ApplyAuditImagebaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAuditImagebaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步接口，只调用机审能力
         * Summary: 图片机审基础版
         */
        public ApplyAuditImagebaseResponse ApplyAuditImagebaseEx(ApplyAuditImagebaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAuditImagebaseResponse>(DoRequest("1.0", "aitech.comm.audit.imagebase.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步接口，只调用机审能力
         * Summary: 图片机审基础版
         */
        public async Task<ApplyAuditImagebaseResponse> ApplyAuditImagebaseExAsync(ApplyAuditImagebaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAuditImagebaseResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.imagebase.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步接口，只调用机审能力
         * Summary: 图片审核增强版
         */
        public ApplyAuditImageadvancedResponse ApplyAuditImageadvanced(ApplyAuditImageadvancedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAuditImageadvancedEx(request, headers, runtime);
        }

        /**
         * Description: 同步接口，只调用机审能力
         * Summary: 图片审核增强版
         */
        public async Task<ApplyAuditImageadvancedResponse> ApplyAuditImageadvancedAsync(ApplyAuditImageadvancedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAuditImageadvancedExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步接口，只调用机审能力
         * Summary: 图片审核增强版
         */
        public ApplyAuditImageadvancedResponse ApplyAuditImageadvancedEx(ApplyAuditImageadvancedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAuditImageadvancedResponse>(DoRequest("1.0", "aitech.comm.audit.imageadvanced.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步接口，只调用机审能力
         * Summary: 图片审核增强版
         */
        public async Task<ApplyAuditImageadvancedResponse> ApplyAuditImageadvancedExAsync(ApplyAuditImageadvancedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAuditImageadvancedResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.imageadvanced.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步接口，只调用机审能力
         * Summary: 音频审核通用版入审
         */
        public SubmitAuditAudiobaseResponse SubmitAuditAudiobase(SubmitAuditAudiobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAuditAudiobaseEx(request, headers, runtime);
        }

        /**
         * Description: 异步接口，只调用机审能力
         * Summary: 音频审核通用版入审
         */
        public async Task<SubmitAuditAudiobaseResponse> SubmitAuditAudiobaseAsync(SubmitAuditAudiobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAuditAudiobaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步接口，只调用机审能力
         * Summary: 音频审核通用版入审
         */
        public SubmitAuditAudiobaseResponse SubmitAuditAudiobaseEx(SubmitAuditAudiobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditAudiobaseResponse>(DoRequest("1.0", "aitech.comm.audit.audiobase.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步接口，只调用机审能力
         * Summary: 音频审核通用版入审
         */
        public async Task<SubmitAuditAudiobaseResponse> SubmitAuditAudiobaseExAsync(SubmitAuditAudiobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditAudiobaseResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.audiobase.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步接口，只调用机审能力
         * Summary: 音频审核通用版查询
         */
        public QueryAuditAudiobaseResponse QueryAuditAudiobase(QueryAuditAudiobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuditAudiobaseEx(request, headers, runtime);
        }

        /**
         * Description: 异步接口，只调用机审能力
         * Summary: 音频审核通用版查询
         */
        public async Task<QueryAuditAudiobaseResponse> QueryAuditAudiobaseAsync(QueryAuditAudiobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuditAudiobaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步接口，只调用机审能力
         * Summary: 音频审核通用版查询
         */
        public QueryAuditAudiobaseResponse QueryAuditAudiobaseEx(QueryAuditAudiobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditAudiobaseResponse>(DoRequest("1.0", "aitech.comm.audit.audiobase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步接口，只调用机审能力
         * Summary: 音频审核通用版查询
         */
        public async Task<QueryAuditAudiobaseResponse> QueryAuditAudiobaseExAsync(QueryAuditAudiobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditAudiobaseResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.audiobase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步通知，只调用机审能力
         * Summary: 视频审核通用版入审
         */
        public SubmitAuditVideobaseResponse SubmitAuditVideobase(SubmitAuditVideobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAuditVideobaseEx(request, headers, runtime);
        }

        /**
         * Description: 异步通知，只调用机审能力
         * Summary: 视频审核通用版入审
         */
        public async Task<SubmitAuditVideobaseResponse> SubmitAuditVideobaseAsync(SubmitAuditVideobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAuditVideobaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步通知，只调用机审能力
         * Summary: 视频审核通用版入审
         */
        public SubmitAuditVideobaseResponse SubmitAuditVideobaseEx(SubmitAuditVideobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditVideobaseResponse>(DoRequest("1.0", "aitech.comm.audit.videobase.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步通知，只调用机审能力
         * Summary: 视频审核通用版入审
         */
        public async Task<SubmitAuditVideobaseResponse> SubmitAuditVideobaseExAsync(SubmitAuditVideobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAuditVideobaseResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.videobase.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步查询
         * Summary: 视频审核通用版查询
         */
        public QueryAuditVideobaseResponse QueryAuditVideobase(QueryAuditVideobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuditVideobaseEx(request, headers, runtime);
        }

        /**
         * Description: 异步查询
         * Summary: 视频审核通用版查询
         */
        public async Task<QueryAuditVideobaseResponse> QueryAuditVideobaseAsync(QueryAuditVideobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuditVideobaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步查询
         * Summary: 视频审核通用版查询
         */
        public QueryAuditVideobaseResponse QueryAuditVideobaseEx(QueryAuditVideobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditVideobaseResponse>(DoRequest("1.0", "aitech.comm.audit.videobase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步查询
         * Summary: 视频审核通用版查询
         */
        public async Task<QueryAuditVideobaseResponse> QueryAuditVideobaseExAsync(QueryAuditVideobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditVideobaseResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.videobase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
         * Summary: 阿里云内容审核回调
         */
        public CallbackAliyunAuditResponse CallbackAliyunAudit(CallbackAliyunAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAliyunAuditEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
         * Summary: 阿里云内容审核回调
         */
        public async Task<CallbackAliyunAuditResponse> CallbackAliyunAuditAsync(CallbackAliyunAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAliyunAuditExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
         * Summary: 阿里云内容审核回调
         */
        public CallbackAliyunAuditResponse CallbackAliyunAuditEx(CallbackAliyunAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAliyunAuditResponse>(DoRequest("1.0", "aitech.comm.aliyun.audit.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
         * Summary: 阿里云内容审核回调
         */
        public async Task<CallbackAliyunAuditResponse> CallbackAliyunAuditExAsync(CallbackAliyunAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAliyunAuditResponse>(await DoRequestAsync("1.0", "aitech.comm.aliyun.audit.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部文件转存
         * Summary: 文件转存接口
         */
        public TransferAuditFileResponse TransferAuditFile(TransferAuditFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TransferAuditFileEx(request, headers, runtime);
        }

        /**
         * Description: 外部文件转存
         * Summary: 文件转存接口
         */
        public async Task<TransferAuditFileResponse> TransferAuditFileAsync(TransferAuditFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TransferAuditFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部文件转存
         * Summary: 文件转存接口
         */
        public TransferAuditFileResponse TransferAuditFileEx(TransferAuditFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferAuditFileResponse>(DoRequest("1.0", "aitech.comm.audit.file.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部文件转存
         * Summary: 文件转存接口
         */
        public async Task<TransferAuditFileResponse> TransferAuditFileExAsync(TransferAuditFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferAuditFileResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.file.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件下载接口
         * Summary: 文件下载接口
         */
        public DownloadAuditFileResponse DownloadAuditFile(DownloadAuditFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadAuditFileEx(request, headers, runtime);
        }

        /**
         * Description: 文件下载接口
         * Summary: 文件下载接口
         */
        public async Task<DownloadAuditFileResponse> DownloadAuditFileAsync(DownloadAuditFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadAuditFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件下载接口
         * Summary: 文件下载接口
         */
        public DownloadAuditFileResponse DownloadAuditFileEx(DownloadAuditFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadAuditFileResponse>(DoRequest("1.0", "aitech.comm.audit.file.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件下载接口
         * Summary: 文件下载接口
         */
        public async Task<DownloadAuditFileResponse> DownloadAuditFileExAsync(DownloadAuditFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadAuditFileResponse>(await DoRequestAsync("1.0", "aitech.comm.audit.file.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云ADB调用接口
         * Summary: 阿里云ADB调用接口
         */
        public QueryAicoguardcloudAdbsinkResponse QueryAicoguardcloudAdbsink(QueryAicoguardcloudAdbsinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAicoguardcloudAdbsinkEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云ADB调用接口
         * Summary: 阿里云ADB调用接口
         */
        public async Task<QueryAicoguardcloudAdbsinkResponse> QueryAicoguardcloudAdbsinkAsync(QueryAicoguardcloudAdbsinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAicoguardcloudAdbsinkExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云ADB调用接口
         * Summary: 阿里云ADB调用接口
         */
        public QueryAicoguardcloudAdbsinkResponse QueryAicoguardcloudAdbsinkEx(QueryAicoguardcloudAdbsinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAicoguardcloudAdbsinkResponse>(DoRequest("1.0", "aitech.comm.aicoguardcloud.adbsink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云ADB调用接口
         * Summary: 阿里云ADB调用接口
         */
        public async Task<QueryAicoguardcloudAdbsinkResponse> QueryAicoguardcloudAdbsinkExAsync(QueryAicoguardcloudAdbsinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAicoguardcloudAdbsinkResponse>(await DoRequestAsync("1.0", "aitech.comm.aicoguardcloud.adbsink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 红色GPT流式调用网关接口
         * Summary: 红色GPT网关方式调用接口
         */
        public QueryGuardcoreRedgptResponse QueryGuardcoreRedgpt(QueryGuardcoreRedgptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardcoreRedgptEx(request, headers, runtime);
        }

        /**
         * Description: 红色GPT流式调用网关接口
         * Summary: 红色GPT网关方式调用接口
         */
        public async Task<QueryGuardcoreRedgptResponse> QueryGuardcoreRedgptAsync(QueryGuardcoreRedgptRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardcoreRedgptExAsync(request, headers, runtime);
        }

        /**
         * Description: 红色GPT流式调用网关接口
         * Summary: 红色GPT网关方式调用接口
         */
        public QueryGuardcoreRedgptResponse QueryGuardcoreRedgptEx(QueryGuardcoreRedgptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardcoreRedgptResponse>(DoRequest("1.0", "aitech.comm.guardcore.redgpt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 红色GPT流式调用网关接口
         * Summary: 红色GPT网关方式调用接口
         */
        public async Task<QueryGuardcoreRedgptResponse> QueryGuardcoreRedgptExAsync(QueryGuardcoreRedgptRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardcoreRedgptResponse>(await DoRequestAsync("1.0", "aitech.comm.guardcore.redgpt.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云ADB调用接口
         * Summary: 阿里云ADB调用接口
         */
        public QueryAicoguardAdbsinkResponse QueryAicoguardAdbsink(QueryAicoguardAdbsinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAicoguardAdbsinkEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云ADB调用接口
         * Summary: 阿里云ADB调用接口
         */
        public async Task<QueryAicoguardAdbsinkResponse> QueryAicoguardAdbsinkAsync(QueryAicoguardAdbsinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAicoguardAdbsinkExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云ADB调用接口
         * Summary: 阿里云ADB调用接口
         */
        public QueryAicoguardAdbsinkResponse QueryAicoguardAdbsinkEx(QueryAicoguardAdbsinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAicoguardAdbsinkResponse>(DoRequest("1.0", "aitech.comm.aicoguard.adbsink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云ADB调用接口
         * Summary: 阿里云ADB调用接口
         */
        public async Task<QueryAicoguardAdbsinkResponse> QueryAicoguardAdbsinkExAsync(QueryAicoguardAdbsinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAicoguardAdbsinkResponse>(await DoRequestAsync("1.0", "aitech.comm.aicoguard.adbsink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
         * Summary: 阿里云内容安全回调
         */
        public CallbackGuardAliyunResponse CallbackGuardAliyun(CallbackGuardAliyunRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackGuardAliyunEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
         * Summary: 阿里云内容安全回调
         */
        public async Task<CallbackGuardAliyunResponse> CallbackGuardAliyunAsync(CallbackGuardAliyunRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackGuardAliyunExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
         * Summary: 阿里云内容安全回调
         */
        public CallbackGuardAliyunResponse CallbackGuardAliyunEx(CallbackGuardAliyunRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackGuardAliyunResponse>(DoRequest("1.0", "aitech.comm.guard.aliyun.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云音频、视频的审核结果，经过 adapter 中转，通过该接口回调回来
         * Summary: 阿里云内容安全回调
         */
        public async Task<CallbackGuardAliyunResponse> CallbackGuardAliyunExAsync(CallbackGuardAliyunRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackGuardAliyunResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.aliyun.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站ITASK审核能力回调
         * Summary: 主站ITASK审核能力回调
         */
        public CallbackGuardItaskResponse CallbackGuardItask(CallbackGuardItaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackGuardItaskEx(request, headers, runtime);
        }

        /**
         * Description: 主站ITASK审核能力回调
         * Summary: 主站ITASK审核能力回调
         */
        public async Task<CallbackGuardItaskResponse> CallbackGuardItaskAsync(CallbackGuardItaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackGuardItaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 主站ITASK审核能力回调
         * Summary: 主站ITASK审核能力回调
         */
        public CallbackGuardItaskResponse CallbackGuardItaskEx(CallbackGuardItaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackGuardItaskResponse>(DoRequest("1.0", "aitech.comm.guard.itask.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主站ITASK审核能力回调
         * Summary: 主站ITASK审核能力回调
         */
        public async Task<CallbackGuardItaskResponse> CallbackGuardItaskExAsync(CallbackGuardItaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackGuardItaskResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.itask.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频人审查询
         * Summary: 音频人审查询
         */
        public QueryGuardAudioResponse QueryGuardAudio(QueryGuardAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardAudioEx(request, headers, runtime);
        }

        /**
         * Description: 音频人审查询
         * Summary: 音频人审查询
         */
        public async Task<QueryGuardAudioResponse> QueryGuardAudioAsync(QueryGuardAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardAudioExAsync(request, headers, runtime);
        }

        /**
         * Description: 音频人审查询
         * Summary: 音频人审查询
         */
        public QueryGuardAudioResponse QueryGuardAudioEx(QueryGuardAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAudioResponse>(DoRequest("1.0", "aitech.comm.guard.audio.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频人审查询
         * Summary: 音频人审查询
         */
        public async Task<QueryGuardAudioResponse> QueryGuardAudioExAsync(QueryGuardAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAudioResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.audio.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频人审入审
         * Summary: 音频人审入审
         */
        public SubmitGuardAudioResponse SubmitGuardAudio(SubmitGuardAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitGuardAudioEx(request, headers, runtime);
        }

        /**
         * Description: 音频人审入审
         * Summary: 音频人审入审
         */
        public async Task<SubmitGuardAudioResponse> SubmitGuardAudioAsync(SubmitGuardAudioRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitGuardAudioExAsync(request, headers, runtime);
        }

        /**
         * Description: 音频人审入审
         * Summary: 音频人审入审
         */
        public SubmitGuardAudioResponse SubmitGuardAudioEx(SubmitGuardAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardAudioResponse>(DoRequest("1.0", "aitech.comm.guard.audio.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频人审入审
         * Summary: 音频人审入审
         */
        public async Task<SubmitGuardAudioResponse> SubmitGuardAudioExAsync(SubmitGuardAudioRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardAudioResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.audio.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片人审查询
         * Summary: 图片人审查询
         */
        public QueryGuardImageResponse QueryGuardImage(QueryGuardImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardImageEx(request, headers, runtime);
        }

        /**
         * Description: 图片人审查询
         * Summary: 图片人审查询
         */
        public async Task<QueryGuardImageResponse> QueryGuardImageAsync(QueryGuardImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 图片人审查询
         * Summary: 图片人审查询
         */
        public QueryGuardImageResponse QueryGuardImageEx(QueryGuardImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardImageResponse>(DoRequest("1.0", "aitech.comm.guard.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片人审查询
         * Summary: 图片人审查询
         */
        public async Task<QueryGuardImageResponse> QueryGuardImageExAsync(QueryGuardImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardImageResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.image.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片人审入审
         * Summary: 图片人审入审
         */
        public SubmitGuardImageResponse SubmitGuardImage(SubmitGuardImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitGuardImageEx(request, headers, runtime);
        }

        /**
         * Description: 图片人审入审
         * Summary: 图片人审入审
         */
        public async Task<SubmitGuardImageResponse> SubmitGuardImageAsync(SubmitGuardImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitGuardImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 图片人审入审
         * Summary: 图片人审入审
         */
        public SubmitGuardImageResponse SubmitGuardImageEx(SubmitGuardImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardImageResponse>(DoRequest("1.0", "aitech.comm.guard.image.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片人审入审
         * Summary: 图片人审入审
         */
        public async Task<SubmitGuardImageResponse> SubmitGuardImageExAsync(SubmitGuardImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardImageResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.image.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本人审查询
         * Summary: 文本人审查询
         */
        public QueryGuardTextResponse QueryGuardText(QueryGuardTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardTextEx(request, headers, runtime);
        }

        /**
         * Description: 文本人审查询
         * Summary: 文本人审查询
         */
        public async Task<QueryGuardTextResponse> QueryGuardTextAsync(QueryGuardTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本人审查询
         * Summary: 文本人审查询
         */
        public QueryGuardTextResponse QueryGuardTextEx(QueryGuardTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardTextResponse>(DoRequest("1.0", "aitech.comm.guard.text.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本人审查询
         * Summary: 文本人审查询
         */
        public async Task<QueryGuardTextResponse> QueryGuardTextExAsync(QueryGuardTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardTextResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.text.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本人审提交
         * Summary: 文本人审提交
         */
        public SubmitGuardTextResponse SubmitGuardText(SubmitGuardTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitGuardTextEx(request, headers, runtime);
        }

        /**
         * Description: 文本人审提交
         * Summary: 文本人审提交
         */
        public async Task<SubmitGuardTextResponse> SubmitGuardTextAsync(SubmitGuardTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitGuardTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本人审提交
         * Summary: 文本人审提交
         */
        public SubmitGuardTextResponse SubmitGuardTextEx(SubmitGuardTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardTextResponse>(DoRequest("1.0", "aitech.comm.guard.text.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本人审提交
         * Summary: 文本人审提交
         */
        public async Task<SubmitGuardTextResponse> SubmitGuardTextExAsync(SubmitGuardTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardTextResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.text.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频人审查询
         * Summary: 视频人审查询
         */
        public QueryGuardVideoResponse QueryGuardVideo(QueryGuardVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardVideoEx(request, headers, runtime);
        }

        /**
         * Description: 视频人审查询
         * Summary: 视频人审查询
         */
        public async Task<QueryGuardVideoResponse> QueryGuardVideoAsync(QueryGuardVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardVideoExAsync(request, headers, runtime);
        }

        /**
         * Description: 视频人审查询
         * Summary: 视频人审查询
         */
        public QueryGuardVideoResponse QueryGuardVideoEx(QueryGuardVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardVideoResponse>(DoRequest("1.0", "aitech.comm.guard.video.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频人审查询
         * Summary: 视频人审查询
         */
        public async Task<QueryGuardVideoResponse> QueryGuardVideoExAsync(QueryGuardVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardVideoResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.video.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频人审提交
         * Summary: 视频人审提交
         */
        public SubmitGuardVideoResponse SubmitGuardVideo(SubmitGuardVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitGuardVideoEx(request, headers, runtime);
        }

        /**
         * Description: 视频人审提交
         * Summary: 视频人审提交
         */
        public async Task<SubmitGuardVideoResponse> SubmitGuardVideoAsync(SubmitGuardVideoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitGuardVideoExAsync(request, headers, runtime);
        }

        /**
         * Description: 视频人审提交
         * Summary: 视频人审提交
         */
        public SubmitGuardVideoResponse SubmitGuardVideoEx(SubmitGuardVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardVideoResponse>(DoRequest("1.0", "aitech.comm.guard.video.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频人审提交
         * Summary: 视频人审提交
         */
        public async Task<SubmitGuardVideoResponse> SubmitGuardVideoExAsync(SubmitGuardVideoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardVideoResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.video.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频机审查询-基础版
         * Summary: 音频机审查询-基础版
         */
        public QueryGuardAudiobaseResponse QueryGuardAudiobase(QueryGuardAudiobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardAudiobaseEx(request, headers, runtime);
        }

        /**
         * Description: 音频机审查询-基础版
         * Summary: 音频机审查询-基础版
         */
        public async Task<QueryGuardAudiobaseResponse> QueryGuardAudiobaseAsync(QueryGuardAudiobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardAudiobaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 音频机审查询-基础版
         * Summary: 音频机审查询-基础版
         */
        public QueryGuardAudiobaseResponse QueryGuardAudiobaseEx(QueryGuardAudiobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAudiobaseResponse>(DoRequest("1.0", "aitech.comm.guard.audiobase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频机审查询-基础版
         * Summary: 音频机审查询-基础版
         */
        public async Task<QueryGuardAudiobaseResponse> QueryGuardAudiobaseExAsync(QueryGuardAudiobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardAudiobaseResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.audiobase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频机审入审-基础版
         * Summary: 音频机审入审-基础版
         */
        public SubmitGuardAudiobaseResponse SubmitGuardAudiobase(SubmitGuardAudiobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitGuardAudiobaseEx(request, headers, runtime);
        }

        /**
         * Description: 音频机审入审-基础版
         * Summary: 音频机审入审-基础版
         */
        public async Task<SubmitGuardAudiobaseResponse> SubmitGuardAudiobaseAsync(SubmitGuardAudiobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitGuardAudiobaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 音频机审入审-基础版
         * Summary: 音频机审入审-基础版
         */
        public SubmitGuardAudiobaseResponse SubmitGuardAudiobaseEx(SubmitGuardAudiobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardAudiobaseResponse>(DoRequest("1.0", "aitech.comm.guard.audiobase.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 音频机审入审-基础版
         * Summary: 音频机审入审-基础版
         */
        public async Task<SubmitGuardAudiobaseResponse> SubmitGuardAudiobaseExAsync(SubmitGuardAudiobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardAudiobaseResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.audiobase.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片机审申请-基础版
         * Summary: 图片机审申请-基础版
         */
        public ApplyGuardImagebaseResponse ApplyGuardImagebase(ApplyGuardImagebaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyGuardImagebaseEx(request, headers, runtime);
        }

        /**
         * Description: 图片机审申请-基础版
         * Summary: 图片机审申请-基础版
         */
        public async Task<ApplyGuardImagebaseResponse> ApplyGuardImagebaseAsync(ApplyGuardImagebaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyGuardImagebaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 图片机审申请-基础版
         * Summary: 图片机审申请-基础版
         */
        public ApplyGuardImagebaseResponse ApplyGuardImagebaseEx(ApplyGuardImagebaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyGuardImagebaseResponse>(DoRequest("1.0", "aitech.comm.guard.imagebase.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片机审申请-基础版
         * Summary: 图片机审申请-基础版
         */
        public async Task<ApplyGuardImagebaseResponse> ApplyGuardImagebaseExAsync(ApplyGuardImagebaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyGuardImagebaseResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.imagebase.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片机审申请-增强版
         * Summary: 图片机审申请-增强版
         */
        public ApplyGuardImageadvancedResponse ApplyGuardImageadvanced(ApplyGuardImageadvancedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyGuardImageadvancedEx(request, headers, runtime);
        }

        /**
         * Description: 图片机审申请-增强版
         * Summary: 图片机审申请-增强版
         */
        public async Task<ApplyGuardImageadvancedResponse> ApplyGuardImageadvancedAsync(ApplyGuardImageadvancedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyGuardImageadvancedExAsync(request, headers, runtime);
        }

        /**
         * Description: 图片机审申请-增强版
         * Summary: 图片机审申请-增强版
         */
        public ApplyGuardImageadvancedResponse ApplyGuardImageadvancedEx(ApplyGuardImageadvancedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyGuardImageadvancedResponse>(DoRequest("1.0", "aitech.comm.guard.imageadvanced.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 图片机审申请-增强版
         * Summary: 图片机审申请-增强版
         */
        public async Task<ApplyGuardImageadvancedResponse> ApplyGuardImageadvancedExAsync(ApplyGuardImageadvancedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyGuardImageadvancedResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.imageadvanced.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本机审申请-基础版
         * Summary: 文本机审申请-基础版
         */
        public ApplyGuardTextbaseResponse ApplyGuardTextbase(ApplyGuardTextbaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyGuardTextbaseEx(request, headers, runtime);
        }

        /**
         * Description: 文本机审申请-基础版
         * Summary: 文本机审申请-基础版
         */
        public async Task<ApplyGuardTextbaseResponse> ApplyGuardTextbaseAsync(ApplyGuardTextbaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyGuardTextbaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本机审申请-基础版
         * Summary: 文本机审申请-基础版
         */
        public ApplyGuardTextbaseResponse ApplyGuardTextbaseEx(ApplyGuardTextbaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyGuardTextbaseResponse>(DoRequest("1.0", "aitech.comm.guard.textbase.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本机审申请-基础版
         * Summary: 文本机审申请-基础版
         */
        public async Task<ApplyGuardTextbaseResponse> ApplyGuardTextbaseExAsync(ApplyGuardTextbaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyGuardTextbaseResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.textbase.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频机审查询-基础版
         * Summary: 视频机审查询-基础版
         */
        public QueryGuardVideobaseResponse QueryGuardVideobase(QueryGuardVideobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardVideobaseEx(request, headers, runtime);
        }

        /**
         * Description: 视频机审查询-基础版
         * Summary: 视频机审查询-基础版
         */
        public async Task<QueryGuardVideobaseResponse> QueryGuardVideobaseAsync(QueryGuardVideobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardVideobaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 视频机审查询-基础版
         * Summary: 视频机审查询-基础版
         */
        public QueryGuardVideobaseResponse QueryGuardVideobaseEx(QueryGuardVideobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardVideobaseResponse>(DoRequest("1.0", "aitech.comm.guard.videobase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频机审查询-基础版
         * Summary: 视频机审查询-基础版
         */
        public async Task<QueryGuardVideobaseResponse> QueryGuardVideobaseExAsync(QueryGuardVideobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardVideobaseResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.videobase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频机审提交-基础版
         * Summary: 视频机审提交-基础版
         */
        public SubmitGuardVideobaseResponse SubmitGuardVideobase(SubmitGuardVideobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitGuardVideobaseEx(request, headers, runtime);
        }

        /**
         * Description: 视频机审提交-基础版
         * Summary: 视频机审提交-基础版
         */
        public async Task<SubmitGuardVideobaseResponse> SubmitGuardVideobaseAsync(SubmitGuardVideobaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitGuardVideobaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 视频机审提交-基础版
         * Summary: 视频机审提交-基础版
         */
        public SubmitGuardVideobaseResponse SubmitGuardVideobaseEx(SubmitGuardVideobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardVideobaseResponse>(DoRequest("1.0", "aitech.comm.guard.videobase.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 视频机审提交-基础版
         * Summary: 视频机审提交-基础版
         */
        public async Task<SubmitGuardVideobaseResponse> SubmitGuardVideobaseExAsync(SubmitGuardVideobaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitGuardVideobaseResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.videobase.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于身份证、个人信息识别、防伪等
         * Summary: 图片光鉴识别链路
         */
        public ApplyGuardImagemultiplyResponse ApplyGuardImagemultiply(ApplyGuardImagemultiplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyGuardImagemultiplyEx(request, headers, runtime);
        }

        /**
         * Description: 用于身份证、个人信息识别、防伪等
         * Summary: 图片光鉴识别链路
         */
        public async Task<ApplyGuardImagemultiplyResponse> ApplyGuardImagemultiplyAsync(ApplyGuardImagemultiplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyGuardImagemultiplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于身份证、个人信息识别、防伪等
         * Summary: 图片光鉴识别链路
         */
        public ApplyGuardImagemultiplyResponse ApplyGuardImagemultiplyEx(ApplyGuardImagemultiplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyGuardImagemultiplyResponse>(DoRequest("1.0", "aitech.comm.guard.imagemultiply.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于身份证、个人信息识别、防伪等
         * Summary: 图片光鉴识别链路
         */
        public async Task<ApplyGuardImagemultiplyResponse> ApplyGuardImagemultiplyExAsync(ApplyGuardImagemultiplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyGuardImagemultiplyResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.imagemultiply.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输出文本风险检测
         * Summary: 输出文本风险检测
         */
        public CheckGuardAnswerResponse CheckGuardAnswer(CheckGuardAnswerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckGuardAnswerEx(request, headers, runtime);
        }

        /**
         * Description: 输出文本风险检测
         * Summary: 输出文本风险检测
         */
        public async Task<CheckGuardAnswerResponse> CheckGuardAnswerAsync(CheckGuardAnswerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckGuardAnswerExAsync(request, headers, runtime);
        }

        /**
         * Description: 输出文本风险检测
         * Summary: 输出文本风险检测
         */
        public CheckGuardAnswerResponse CheckGuardAnswerEx(CheckGuardAnswerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckGuardAnswerResponse>(DoRequest("1.0", "aitech.comm.guard.answer.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输出文本风险检测
         * Summary: 输出文本风险检测
         */
        public async Task<CheckGuardAnswerResponse> CheckGuardAnswerExAsync(CheckGuardAnswerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckGuardAnswerResponse>(await DoRequestAsync("1.0", "aitech.comm.guard.answer.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
