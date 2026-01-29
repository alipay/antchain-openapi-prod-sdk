// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.TWC.Models;

namespace AntChain.SDK.TWC
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
                        {"sdk_version", "1.13.20"},
                        {"_prod_code", "TWC"},
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
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "twc-openapi.antchain.antgroup.com")},
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
                        {"sdk_version", "1.13.20"},
                        {"_prod_code", "TWC"},
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
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "twc-openapi.antchain.antgroup.com")},
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
         * Description: AI提问获取答案
         * Summary: 获取答案
         */
        public QueryAilegalAnswerResponse QueryAilegalAnswer(QueryAilegalAnswerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAilegalAnswerEx(request, headers, runtime);
        }

        /**
         * Description: AI提问获取答案
         * Summary: 获取答案
         */
        public async Task<QueryAilegalAnswerResponse> QueryAilegalAnswerAsync(QueryAilegalAnswerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAilegalAnswerExAsync(request, headers, runtime);
        }

        /**
         * Description: AI提问获取答案
         * Summary: 获取答案
         */
        public QueryAilegalAnswerResponse QueryAilegalAnswerEx(QueryAilegalAnswerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAilegalAnswerResponse>(DoRequest("1.0", "twc.notary.ailegal.answer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI提问获取答案
         * Summary: 获取答案
         */
        public async Task<QueryAilegalAnswerResponse> QueryAilegalAnswerExAsync(QueryAilegalAnswerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAilegalAnswerResponse>(await DoRequestAsync("1.0", "twc.notary.ailegal.answer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 问答反馈
         * Summary: 问答反馈
         */
        public SubmitAilegalFeedbackResponse SubmitAilegalFeedback(SubmitAilegalFeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAilegalFeedbackEx(request, headers, runtime);
        }

        /**
         * Description: 问答反馈
         * Summary: 问答反馈
         */
        public async Task<SubmitAilegalFeedbackResponse> SubmitAilegalFeedbackAsync(SubmitAilegalFeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAilegalFeedbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 问答反馈
         * Summary: 问答反馈
         */
        public SubmitAilegalFeedbackResponse SubmitAilegalFeedbackEx(SubmitAilegalFeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAilegalFeedbackResponse>(DoRequest("1.0", "twc.notary.ailegal.feedback.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 问答反馈
         * Summary: 问答反馈
         */
        public async Task<SubmitAilegalFeedbackResponse> SubmitAilegalFeedbackExAsync(SubmitAilegalFeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAilegalFeedbackResponse>(await DoRequestAsync("1.0", "twc.notary.ailegal.feedback.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI法律服务提问接口
         * Summary: 提出问题
         */
        public InitAilegalQuestionResponse InitAilegalQuestion(InitAilegalQuestionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitAilegalQuestionEx(request, headers, runtime);
        }

        /**
         * Description: AI法律服务提问接口
         * Summary: 提出问题
         */
        public async Task<InitAilegalQuestionResponse> InitAilegalQuestionAsync(InitAilegalQuestionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitAilegalQuestionExAsync(request, headers, runtime);
        }

        /**
         * Description: AI法律服务提问接口
         * Summary: 提出问题
         */
        public InitAilegalQuestionResponse InitAilegalQuestionEx(InitAilegalQuestionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitAilegalQuestionResponse>(DoRequest("1.0", "twc.notary.ailegal.question.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI法律服务提问接口
         * Summary: 提出问题
         */
        public async Task<InitAilegalQuestionResponse> InitAilegalQuestionExAsync(InitAilegalQuestionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitAilegalQuestionResponse>(await DoRequestAsync("1.0", "twc.notary.ailegal.question.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
         * Summary: 仲裁状态信息变更回调接口
         */
        public CallbackArbitrationStatusResponse CallbackArbitrationStatus(CallbackArbitrationStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackArbitrationStatusEx(request, headers, runtime);
        }

        /**
         * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
         * Summary: 仲裁状态信息变更回调接口
         */
        public async Task<CallbackArbitrationStatusResponse> CallbackArbitrationStatusAsync(CallbackArbitrationStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackArbitrationStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
         * Summary: 仲裁状态信息变更回调接口
         */
        public CallbackArbitrationStatusResponse CallbackArbitrationStatusEx(CallbackArbitrationStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackArbitrationStatusResponse>(DoRequest("1.0", "twc.notary.arbitration.status.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
         * Summary: 仲裁状态信息变更回调接口
         */
        public async Task<CallbackArbitrationStatusResponse> CallbackArbitrationStatusExAsync(CallbackArbitrationStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackArbitrationStatusResponse>(await DoRequestAsync("1.0", "twc.notary.arbitration.status.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 仲裁签署状态信息变更回调接口
         * Summary: 仲裁签署状态信息变更回调接口
         */
        public CallbackArbitrationSignstatusResponse CallbackArbitrationSignstatus(CallbackArbitrationSignstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackArbitrationSignstatusEx(request, headers, runtime);
        }

        /**
         * Description: 仲裁签署状态信息变更回调接口
         * Summary: 仲裁签署状态信息变更回调接口
         */
        public async Task<CallbackArbitrationSignstatusResponse> CallbackArbitrationSignstatusAsync(CallbackArbitrationSignstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackArbitrationSignstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 仲裁签署状态信息变更回调接口
         * Summary: 仲裁签署状态信息变更回调接口
         */
        public CallbackArbitrationSignstatusResponse CallbackArbitrationSignstatusEx(CallbackArbitrationSignstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackArbitrationSignstatusResponse>(DoRequest("1.0", "twc.notary.arbitration.signstatus.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 仲裁签署状态信息变更回调接口
         * Summary: 仲裁签署状态信息变更回调接口
         */
        public async Task<CallbackArbitrationSignstatusResponse> CallbackArbitrationSignstatusExAsync(CallbackArbitrationSignstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackArbitrationSignstatusResponse>(await DoRequestAsync("1.0", "twc.notary.arbitration.signstatus.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁物流信息添加
         * Summary: 租赁物流信息添加
         */
        public AddBclLogisticinfoResponse AddBclLogisticinfo(AddBclLogisticinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddBclLogisticinfoEx(request, headers, runtime);
        }

        /**
         * Description: 租赁物流信息添加
         * Summary: 租赁物流信息添加
         */
        public async Task<AddBclLogisticinfoResponse> AddBclLogisticinfoAsync(AddBclLogisticinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddBclLogisticinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁物流信息添加
         * Summary: 租赁物流信息添加
         */
        public AddBclLogisticinfoResponse AddBclLogisticinfoEx(AddBclLogisticinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBclLogisticinfoResponse>(DoRequest("1.0", "twc.notary.bcl.logisticinfo.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁物流信息添加
         * Summary: 租赁物流信息添加
         */
        public async Task<AddBclLogisticinfoResponse> AddBclLogisticinfoExAsync(AddBclLogisticinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBclLogisticinfoResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.logisticinfo.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁订单发起
         * Summary: 租赁订单发起
         */
        public SubmitBclOrderResponse SubmitBclOrder(SubmitBclOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitBclOrderEx(request, headers, runtime);
        }

        /**
         * Description: 租赁订单发起
         * Summary: 租赁订单发起
         */
        public async Task<SubmitBclOrderResponse> SubmitBclOrderAsync(SubmitBclOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitBclOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁订单发起
         * Summary: 租赁订单发起
         */
        public SubmitBclOrderResponse SubmitBclOrderEx(SubmitBclOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitBclOrderResponse>(DoRequest("1.0", "twc.notary.bcl.order.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁订单发起
         * Summary: 租赁订单发起
         */
        public async Task<SubmitBclOrderResponse> SubmitBclOrderExAsync(SubmitBclOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitBclOrderResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.order.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建租赁订单
         * Summary: 创建租赁订单
         */
        public CreateBclOrderResponse CreateBclOrder(CreateBclOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBclOrderEx(request, headers, runtime);
        }

        /**
         * Description: 创建租赁订单
         * Summary: 创建租赁订单
         */
        public async Task<CreateBclOrderResponse> CreateBclOrderAsync(CreateBclOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBclOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建租赁订单
         * Summary: 创建租赁订单
         */
        public CreateBclOrderResponse CreateBclOrderEx(CreateBclOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclOrderResponse>(DoRequest("1.0", "twc.notary.bcl.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建租赁订单
         * Summary: 创建租赁订单
         */
        public async Task<CreateBclOrderResponse> CreateBclOrderExAsync(CreateBclOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclOrderResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁订单查询
         * Summary: 租赁订单查询
         */
        public QueryBclOrderResponse QueryBclOrder(QueryBclOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBclOrderEx(request, headers, runtime);
        }

        /**
         * Description: 租赁订单查询
         * Summary: 租赁订单查询
         */
        public async Task<QueryBclOrderResponse> QueryBclOrderAsync(QueryBclOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBclOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁订单查询
         * Summary: 租赁订单查询
         */
        public QueryBclOrderResponse QueryBclOrderEx(QueryBclOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclOrderResponse>(DoRequest("1.0", "twc.notary.bcl.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁订单查询
         * Summary: 租赁订单查询
         */
        public async Task<QueryBclOrderResponse> QueryBclOrderExAsync(QueryBclOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclOrderResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 履约信息上传接口
         * Summary: 履约信息上传接口
         */
        public UploadBclPerformanceResponse UploadBclPerformance(UploadBclPerformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadBclPerformanceEx(request, headers, runtime);
        }

        /**
         * Description: 履约信息上传接口
         * Summary: 履约信息上传接口
         */
        public async Task<UploadBclPerformanceResponse> UploadBclPerformanceAsync(UploadBclPerformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadBclPerformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 履约信息上传接口
         * Summary: 履约信息上传接口
         */
        public UploadBclPerformanceResponse UploadBclPerformanceEx(UploadBclPerformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBclPerformanceResponse>(DoRequest("1.0", "twc.notary.bcl.performance.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 履约信息上传接口
         * Summary: 履约信息上传接口
         */
        public async Task<UploadBclPerformanceResponse> UploadBclPerformanceExAsync(UploadBclPerformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBclPerformanceResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.performance.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品导入
         * Summary: 商品导入
         */
        public CreateBclProductResponse CreateBclProduct(CreateBclProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBclProductEx(request, headers, runtime);
        }

        /**
         * Description: 商品导入
         * Summary: 商品导入
         */
        public async Task<CreateBclProductResponse> CreateBclProductAsync(CreateBclProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBclProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品导入
         * Summary: 商品导入
         */
        public CreateBclProductResponse CreateBclProductEx(CreateBclProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclProductResponse>(DoRequest("1.0", "twc.notary.bcl.product.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品导入
         * Summary: 商品导入
         */
        public async Task<CreateBclProductResponse> CreateBclProductExAsync(CreateBclProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclProductResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.product.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品查询
         * Summary: 商品查询
         */
        public QueryBclProductResponse QueryBclProduct(QueryBclProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBclProductEx(request, headers, runtime);
        }

        /**
         * Description: 商品查询
         * Summary: 商品查询
         */
        public async Task<QueryBclProductResponse> QueryBclProductAsync(QueryBclProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBclProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品查询
         * Summary: 商品查询
         */
        public QueryBclProductResponse QueryBclProductEx(QueryBclProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclProductResponse>(DoRequest("1.0", "twc.notary.bcl.product.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品查询
         * Summary: 商品查询
         */
        public async Task<QueryBclProductResponse> QueryBclProductExAsync(QueryBclProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclProductResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.product.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同资源量校验与资源扣减
         * Summary: 合同资源量校验与资源扣减
         */
        public VerifyBclContractmetricResponse VerifyBclContractmetric(VerifyBclContractmetricRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyBclContractmetricEx(request, headers, runtime);
        }

        /**
         * Description: 合同资源量校验与资源扣减
         * Summary: 合同资源量校验与资源扣减
         */
        public async Task<VerifyBclContractmetricResponse> VerifyBclContractmetricAsync(VerifyBclContractmetricRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyBclContractmetricExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同资源量校验与资源扣减
         * Summary: 合同资源量校验与资源扣减
         */
        public VerifyBclContractmetricResponse VerifyBclContractmetricEx(VerifyBclContractmetricRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyBclContractmetricResponse>(DoRequest("1.0", "twc.notary.bcl.contractmetric.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同资源量校验与资源扣减
         * Summary: 合同资源量校验与资源扣减
         */
        public async Task<VerifyBclContractmetricResponse> VerifyBclContractmetricExAsync(VerifyBclContractmetricRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyBclContractmetricResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.contractmetric.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权访问oss链接
         * Summary: 获取授权访问oss链接
         */
        public GetBclUploadurlResponse GetBclUploadurl(GetBclUploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBclUploadurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取授权访问oss链接
         * Summary: 获取授权访问oss链接
         */
        public async Task<GetBclUploadurlResponse> GetBclUploadurlAsync(GetBclUploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBclUploadurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取授权访问oss链接
         * Summary: 获取授权访问oss链接
         */
        public GetBclUploadurlResponse GetBclUploadurlEx(GetBclUploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBclUploadurlResponse>(DoRequest("1.0", "twc.notary.bcl.uploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权访问oss链接
         * Summary: 获取授权访问oss链接
         */
        public async Task<GetBclUploadurlResponse> GetBclUploadurlExAsync(GetBclUploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBclUploadurlResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.uploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 变更BCL订单承诺履约还款方式。合同代扣类型的订单，可以调用该接口取消某一期的代扣(转换为主动还款)。
         * Summary: 变更BCL订单承诺履约还款方式
         */
        public UpdateBclPromiserepaymentResponse UpdateBclPromiserepayment(UpdateBclPromiserepaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBclPromiserepaymentEx(request, headers, runtime);
        }

        /**
         * Description: 变更BCL订单承诺履约还款方式。合同代扣类型的订单，可以调用该接口取消某一期的代扣(转换为主动还款)。
         * Summary: 变更BCL订单承诺履约还款方式
         */
        public async Task<UpdateBclPromiserepaymentResponse> UpdateBclPromiserepaymentAsync(UpdateBclPromiserepaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBclPromiserepaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 变更BCL订单承诺履约还款方式。合同代扣类型的订单，可以调用该接口取消某一期的代扣(转换为主动还款)。
         * Summary: 变更BCL订单承诺履约还款方式
         */
        public UpdateBclPromiserepaymentResponse UpdateBclPromiserepaymentEx(UpdateBclPromiserepaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBclPromiserepaymentResponse>(DoRequest("1.0", "twc.notary.bcl.promiserepayment.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 变更BCL订单承诺履约还款方式。合同代扣类型的订单，可以调用该接口取消某一期的代扣(转换为主动还款)。
         * Summary: 变更BCL订单承诺履约还款方式
         */
        public async Task<UpdateBclPromiserepaymentResponse> UpdateBclPromiserepaymentExAsync(UpdateBclPromiserepaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBclPromiserepaymentResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.promiserepayment.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建收款方
         * Summary: 创建收款方
         */
        public CreateBclPayeeResponse CreateBclPayee(CreateBclPayeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBclPayeeEx(request, headers, runtime);
        }

        /**
         * Description: 创建收款方
         * Summary: 创建收款方
         */
        public async Task<CreateBclPayeeResponse> CreateBclPayeeAsync(CreateBclPayeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBclPayeeExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建收款方
         * Summary: 创建收款方
         */
        public CreateBclPayeeResponse CreateBclPayeeEx(CreateBclPayeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclPayeeResponse>(DoRequest("1.0", "twc.notary.bcl.payee.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建收款方
         * Summary: 创建收款方
         */
        public async Task<CreateBclPayeeResponse> CreateBclPayeeExAsync(CreateBclPayeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclPayeeResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.payee.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus订单融资申请接口
         * Summary: 租赁宝plus订单融资申请接口
         */
        public ApplyBclFinancingResponse ApplyBclFinancing(ApplyBclFinancingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyBclFinancingEx(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus订单融资申请接口
         * Summary: 租赁宝plus订单融资申请接口
         */
        public async Task<ApplyBclFinancingResponse> ApplyBclFinancingAsync(ApplyBclFinancingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyBclFinancingExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus订单融资申请接口
         * Summary: 租赁宝plus订单融资申请接口
         */
        public ApplyBclFinancingResponse ApplyBclFinancingEx(ApplyBclFinancingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBclFinancingResponse>(DoRequest("1.0", "twc.notary.bcl.financing.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus订单融资申请接口
         * Summary: 租赁宝plus订单融资申请接口
         */
        public async Task<ApplyBclFinancingResponse> ApplyBclFinancingExAsync(ApplyBclFinancingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBclFinancingResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.financing.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家发起入驻成功后，可以通过此接口查询入驻的结果
         * Summary: 查询商家入驻结果
         */
        public QueryBclMerchantResponse QueryBclMerchant(QueryBclMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBclMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商家发起入驻成功后，可以通过此接口查询入驻的结果
         * Summary: 查询商家入驻结果
         */
        public async Task<QueryBclMerchantResponse> QueryBclMerchantAsync(QueryBclMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBclMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家发起入驻成功后，可以通过此接口查询入驻的结果
         * Summary: 查询商家入驻结果
         */
        public QueryBclMerchantResponse QueryBclMerchantEx(QueryBclMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclMerchantResponse>(DoRequest("1.0", "twc.notary.bcl.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家发起入驻成功后，可以通过此接口查询入驻的结果
         * Summary: 查询商家入驻结果
         */
        public async Task<QueryBclMerchantResponse> QueryBclMerchantExAsync(QueryBclMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclMerchantResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家入驻租赁宝plus平台接口
         * Summary: 商家入驻租赁宝plus平台接口
         */
        public RegisterBclMerchantResponse RegisterBclMerchant(RegisterBclMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterBclMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商家入驻租赁宝plus平台接口
         * Summary: 商家入驻租赁宝plus平台接口
         */
        public async Task<RegisterBclMerchantResponse> RegisterBclMerchantAsync(RegisterBclMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterBclMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家入驻租赁宝plus平台接口
         * Summary: 商家入驻租赁宝plus平台接口
         */
        public RegisterBclMerchantResponse RegisterBclMerchantEx(RegisterBclMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterBclMerchantResponse>(DoRequest("1.0", "twc.notary.bcl.merchant.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家入驻租赁宝plus平台接口
         * Summary: 商家入驻租赁宝plus平台接口
         */
        public async Task<RegisterBclMerchantResponse> RegisterBclMerchantExAsync(RegisterBclMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterBclMerchantResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.merchant.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当商家收到买家想解除代扣协议的消息后，可选择同意或拒绝用户解约操作；前置条件：商家已成功收到买家解除代扣协议的消息；
         * Summary: 解除代扣协议
         */
        public CancelBclWithholdResponse CancelBclWithhold(CancelBclWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelBclWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 当商家收到买家想解除代扣协议的消息后，可选择同意或拒绝用户解约操作；前置条件：商家已成功收到买家解除代扣协议的消息；
         * Summary: 解除代扣协议
         */
        public async Task<CancelBclWithholdResponse> CancelBclWithholdAsync(CancelBclWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelBclWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 当商家收到买家想解除代扣协议的消息后，可选择同意或拒绝用户解约操作；前置条件：商家已成功收到买家解除代扣协议的消息；
         * Summary: 解除代扣协议
         */
        public CancelBclWithholdResponse CancelBclWithholdEx(CancelBclWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBclWithholdResponse>(DoRequest("1.0", "twc.notary.bcl.withhold.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当商家收到买家想解除代扣协议的消息后，可选择同意或拒绝用户解约操作；前置条件：商家已成功收到买家解除代扣协议的消息；
         * Summary: 解除代扣协议
         */
        public async Task<CancelBclWithholdResponse> CancelBclWithholdExAsync(CancelBclWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBclWithholdResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.withhold.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单条交易投诉详情接口
         * Summary: 查询单条交易投诉详情接口
         */
        public QueryBclComplainResponse QueryBclComplain(QueryBclComplainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBclComplainEx(request, headers, runtime);
        }

        /**
         * Description: 查询单条交易投诉详情接口
         * Summary: 查询单条交易投诉详情接口
         */
        public async Task<QueryBclComplainResponse> QueryBclComplainAsync(QueryBclComplainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBclComplainExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询单条交易投诉详情接口
         * Summary: 查询单条交易投诉详情接口
         */
        public QueryBclComplainResponse QueryBclComplainEx(QueryBclComplainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclComplainResponse>(DoRequest("1.0", "twc.notary.bcl.complain.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单条交易投诉详情接口
         * Summary: 查询单条交易投诉详情接口
         */
        public async Task<QueryBclComplainResponse> QueryBclComplainExAsync(QueryBclComplainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclComplainResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.complain.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户上传处理图片
         * Summary: 商户上传处理图片
         */
        public UploadBclComplainimageResponse UploadBclComplainimage(UploadBclComplainimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadBclComplainimageEx(request, headers, runtime);
        }

        /**
         * Description: 商户上传处理图片
         * Summary: 商户上传处理图片
         */
        public async Task<UploadBclComplainimageResponse> UploadBclComplainimageAsync(UploadBclComplainimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadBclComplainimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户上传处理图片
         * Summary: 商户上传处理图片
         */
        public UploadBclComplainimageResponse UploadBclComplainimageEx(UploadBclComplainimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBclComplainimageResponse>(DoRequest("1.0", "twc.notary.bcl.complainimage.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户上传处理图片
         * Summary: 商户上传处理图片
         */
        public async Task<UploadBclComplainimageResponse> UploadBclComplainimageExAsync(UploadBclComplainimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBclComplainimageResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.complainimage.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家处理交易投诉
         * Summary: 商家处理交易投诉
         */
        public SubmitBclComplainfeedbackResponse SubmitBclComplainfeedback(SubmitBclComplainfeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitBclComplainfeedbackEx(request, headers, runtime);
        }

        /**
         * Description: 商家处理交易投诉
         * Summary: 商家处理交易投诉
         */
        public async Task<SubmitBclComplainfeedbackResponse> SubmitBclComplainfeedbackAsync(SubmitBclComplainfeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitBclComplainfeedbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家处理交易投诉
         * Summary: 商家处理交易投诉
         */
        public SubmitBclComplainfeedbackResponse SubmitBclComplainfeedbackEx(SubmitBclComplainfeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitBclComplainfeedbackResponse>(DoRequest("1.0", "twc.notary.bcl.complainfeedback.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家处理交易投诉
         * Summary: 商家处理交易投诉
         */
        public async Task<SubmitBclComplainfeedbackResponse> SubmitBclComplainfeedbackExAsync(SubmitBclComplainfeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitBclComplainfeedbackResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.complainfeedback.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询投诉单id列表
         * Summary: 查询投诉单id列表
         */
        public QueryBclComplaineventidsResponse QueryBclComplaineventids(QueryBclComplaineventidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBclComplaineventidsEx(request, headers, runtime);
        }

        /**
         * Description: 查询投诉单id列表
         * Summary: 查询投诉单id列表
         */
        public async Task<QueryBclComplaineventidsResponse> QueryBclComplaineventidsAsync(QueryBclComplaineventidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBclComplaineventidsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询投诉单id列表
         * Summary: 查询投诉单id列表
         */
        public QueryBclComplaineventidsResponse QueryBclComplaineventidsEx(QueryBclComplaineventidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclComplaineventidsResponse>(DoRequest("1.0", "twc.notary.bcl.complaineventids.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询投诉单id列表
         * Summary: 查询投诉单id列表
         */
        public async Task<QueryBclComplaineventidsResponse> QueryBclComplaineventidsExAsync(QueryBclComplaineventidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclComplaineventidsResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.complaineventids.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus文件上传接口
         * Summary: 租赁文件上传接口
         */
        public UploadBclFileResponse UploadBclFile(UploadBclFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadBclFileEx(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus文件上传接口
         * Summary: 租赁文件上传接口
         */
        public async Task<UploadBclFileResponse> UploadBclFileAsync(UploadBclFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadBclFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus文件上传接口
         * Summary: 租赁文件上传接口
         */
        public UploadBclFileResponse UploadBclFileEx(UploadBclFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBclFileResponse>(DoRequest("1.0", "twc.notary.bcl.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus文件上传接口
         * Summary: 租赁文件上传接口
         */
        public async Task<UploadBclFileResponse> UploadBclFileExAsync(UploadBclFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadBclFileResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成租赁单推进终态，本期要支持非自建代扣+新租赁宝代扣+老合同+老租赁宝代扣的租赁单完结
         * Summary: 完结租赁单
         */
        public FinishBclOrderResponse FinishBclOrder(FinishBclOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishBclOrderEx(request, headers, runtime);
        }

        /**
         * Description: 完成租赁单推进终态，本期要支持非自建代扣+新租赁宝代扣+老合同+老租赁宝代扣的租赁单完结
         * Summary: 完结租赁单
         */
        public async Task<FinishBclOrderResponse> FinishBclOrderAsync(FinishBclOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishBclOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 完成租赁单推进终态，本期要支持非自建代扣+新租赁宝代扣+老合同+老租赁宝代扣的租赁单完结
         * Summary: 完结租赁单
         */
        public FinishBclOrderResponse FinishBclOrderEx(FinishBclOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishBclOrderResponse>(DoRequest("1.0", "twc.notary.bcl.order.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成租赁单推进终态，本期要支持非自建代扣+新租赁宝代扣+老合同+老租赁宝代扣的租赁单完结
         * Summary: 完结租赁单
         */
        public async Task<FinishBclOrderResponse> FinishBclOrderExAsync(FinishBclOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishBclOrderResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.order.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus退款
         * Summary: 租赁宝plus退款
         */
        public CreateBclRefundResponse CreateBclRefund(CreateBclRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBclRefundEx(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus退款
         * Summary: 租赁宝plus退款
         */
        public async Task<CreateBclRefundResponse> CreateBclRefundAsync(CreateBclRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBclRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus退款
         * Summary: 租赁宝plus退款
         */
        public CreateBclRefundResponse CreateBclRefundEx(CreateBclRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclRefundResponse>(DoRequest("1.0", "twc.notary.bcl.refund.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus退款
         * Summary: 租赁宝plus退款
         */
        public async Task<CreateBclRefundResponse> CreateBclRefundExAsync(CreateBclRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclRefundResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.refund.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus退款查询
         * Summary: 租赁宝plus退款查询
         */
        public QueryBclRefundResponse QueryBclRefund(QueryBclRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBclRefundEx(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus退款查询
         * Summary: 租赁宝plus退款查询
         */
        public async Task<QueryBclRefundResponse> QueryBclRefundAsync(QueryBclRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBclRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus退款查询
         * Summary: 租赁宝plus退款查询
         */
        public QueryBclRefundResponse QueryBclRefundEx(QueryBclRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclRefundResponse>(DoRequest("1.0", "twc.notary.bcl.refund.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus退款查询
         * Summary: 租赁宝plus退款查询
         */
        public async Task<QueryBclRefundResponse> QueryBclRefundExAsync(QueryBclRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclRefundResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.refund.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus投保
         * Summary: 租赁宝plus投保
         */
        public CreateBclInsuranceResponse CreateBclInsurance(CreateBclInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBclInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus投保
         * Summary: 租赁宝plus投保
         */
        public async Task<CreateBclInsuranceResponse> CreateBclInsuranceAsync(CreateBclInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBclInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus投保
         * Summary: 租赁宝plus投保
         */
        public CreateBclInsuranceResponse CreateBclInsuranceEx(CreateBclInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclInsuranceResponse>(DoRequest("1.0", "twc.notary.bcl.insurance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus投保
         * Summary: 租赁宝plus投保
         */
        public async Task<CreateBclInsuranceResponse> CreateBclInsuranceExAsync(CreateBclInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBclInsuranceResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.insurance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus退保
         * Summary: 租赁宝plus退保
         */
        public CancelBclInsuranceResponse CancelBclInsurance(CancelBclInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelBclInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus退保
         * Summary: 租赁宝plus退保
         */
        public async Task<CancelBclInsuranceResponse> CancelBclInsuranceAsync(CancelBclInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelBclInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus退保
         * Summary: 租赁宝plus退保
         */
        public CancelBclInsuranceResponse CancelBclInsuranceEx(CancelBclInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBclInsuranceResponse>(DoRequest("1.0", "twc.notary.bcl.insurance.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus退保
         * Summary: 租赁宝plus退保
         */
        public async Task<CancelBclInsuranceResponse> CancelBclInsuranceExAsync(CancelBclInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBclInsuranceResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.insurance.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus查询订单保险详情
         * Summary: 租赁宝plus查询订单保险详情
         */
        public QueryBclInsuranceResponse QueryBclInsurance(QueryBclInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBclInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus查询订单保险详情
         * Summary: 租赁宝plus查询订单保险详情
         */
        public async Task<QueryBclInsuranceResponse> QueryBclInsuranceAsync(QueryBclInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBclInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁宝plus查询订单保险详情
         * Summary: 租赁宝plus查询订单保险详情
         */
        public QueryBclInsuranceResponse QueryBclInsuranceEx(QueryBclInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclInsuranceResponse>(DoRequest("1.0", "twc.notary.bcl.insurance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝plus查询订单保险详情
         * Summary: 租赁宝plus查询订单保险详情
         */
        public async Task<QueryBclInsuranceResponse> QueryBclInsuranceExAsync(QueryBclInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBclInsuranceResponse>(await DoRequestAsync("1.0", "twc.notary.bcl.insurance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
         * Summary: 创建电子合同签署个人帐户
         */
        public CreateContractAccountResponse CreateContractAccount(CreateContractAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractAccountEx(request, headers, runtime);
        }

        /**
         * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
         * Summary: 创建电子合同签署个人帐户
         */
        public async Task<CreateContractAccountResponse> CreateContractAccountAsync(CreateContractAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
         * Summary: 创建电子合同签署个人帐户
         */
        public CreateContractAccountResponse CreateContractAccountEx(CreateContractAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAccountResponse>(DoRequest("1.0", "twc.notary.contract.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
         * Summary: 创建电子合同签署个人帐户
         */
        public async Task<CreateContractAccountResponse> CreateContractAccountExAsync(CreateContractAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAccountResponse>(await DoRequestAsync("1.0", "twc.notary.contract.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模版参数，创建个人印章
         * Summary: 创建电子合同个人帐户印章
         */
        public CreateContractAccountsealResponse CreateContractAccountseal(CreateContractAccountsealRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractAccountsealEx(request, headers, runtime);
        }

        /**
         * Description: 通过模版参数，创建个人印章
         * Summary: 创建电子合同个人帐户印章
         */
        public async Task<CreateContractAccountsealResponse> CreateContractAccountsealAsync(CreateContractAccountsealRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractAccountsealExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过模版参数，创建个人印章
         * Summary: 创建电子合同个人帐户印章
         */
        public CreateContractAccountsealResponse CreateContractAccountsealEx(CreateContractAccountsealRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAccountsealResponse>(DoRequest("1.0", "twc.notary.contract.accountseal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模版参数，创建个人印章
         * Summary: 创建电子合同个人帐户印章
         */
        public async Task<CreateContractAccountsealResponse> CreateContractAccountsealExAsync(CreateContractAccountsealRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAccountsealResponse>(await DoRequestAsync("1.0", "twc.notary.contract.accountseal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
         * Summary: 创建电子合同签署机构帐户
         */
        public CreateContractOrganizationResponse CreateContractOrganization(CreateContractOrganizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractOrganizationEx(request, headers, runtime);
        }

        /**
         * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
         * Summary: 创建电子合同签署机构帐户
         */
        public async Task<CreateContractOrganizationResponse> CreateContractOrganizationAsync(CreateContractOrganizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractOrganizationExAsync(request, headers, runtime);
        }

        /**
         * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
         * Summary: 创建电子合同签署机构帐户
         */
        public CreateContractOrganizationResponse CreateContractOrganizationEx(CreateContractOrganizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractOrganizationResponse>(DoRequest("1.0", "twc.notary.contract.organization.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
         * Summary: 创建电子合同签署机构帐户
         */
        public async Task<CreateContractOrganizationResponse> CreateContractOrganizationExAsync(CreateContractOrganizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractOrganizationResponse>(await DoRequestAsync("1.0", "twc.notary.contract.organization.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模版参数，创建机构印章
         * Summary: 创建电子合同机构帐户印章
         */
        public CreateContractOrgsealResponse CreateContractOrgseal(CreateContractOrgsealRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractOrgsealEx(request, headers, runtime);
        }

        /**
         * Description: 通过模版参数，创建机构印章
         * Summary: 创建电子合同机构帐户印章
         */
        public async Task<CreateContractOrgsealResponse> CreateContractOrgsealAsync(CreateContractOrgsealRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractOrgsealExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过模版参数，创建机构印章
         * Summary: 创建电子合同机构帐户印章
         */
        public CreateContractOrgsealResponse CreateContractOrgsealEx(CreateContractOrgsealRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractOrgsealResponse>(DoRequest("1.0", "twc.notary.contract.orgseal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模版参数，创建机构印章
         * Summary: 创建电子合同机构帐户印章
         */
        public async Task<CreateContractOrgsealResponse> CreateContractOrgsealExAsync(CreateContractOrgsealRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractOrgsealResponse>(await DoRequestAsync("1.0", "twc.notary.contract.orgseal.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 静默签署授权
         * Summary: 静默签署授权
         */
        public AuthContractSignResponse AuthContractSign(AuthContractSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthContractSignEx(request, headers, runtime);
        }

        /**
         * Description: 静默签署授权
         * Summary: 静默签署授权
         */
        public async Task<AuthContractSignResponse> AuthContractSignAsync(AuthContractSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthContractSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 静默签署授权
         * Summary: 静默签署授权
         */
        public AuthContractSignResponse AuthContractSignEx(AuthContractSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthContractSignResponse>(DoRequest("1.0", "twc.notary.contract.sign.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 静默签署授权
         * Summary: 静默签署授权
         */
        public async Task<AuthContractSignResponse> AuthContractSignExAsync(AuthContractSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthContractSignResponse>(await DoRequestAsync("1.0", "twc.notary.contract.sign.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
         * Summary: 通过文件上传方式创建电子合同签署模板
         */
        public CreateContractTemplateResponse CreateContractTemplate(CreateContractTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
         * Summary: 通过文件上传方式创建电子合同签署模板
         */
        public async Task<CreateContractTemplateResponse> CreateContractTemplateAsync(CreateContractTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
         * Summary: 通过文件上传方式创建电子合同签署模板
         */
        public CreateContractTemplateResponse CreateContractTemplateEx(CreateContractTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractTemplateResponse>(DoRequest("1.0", "twc.notary.contract.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
         * Summary: 通过文件上传方式创建电子合同签署模板
         */
        public async Task<CreateContractTemplateResponse> CreateContractTemplateExAsync(CreateContractTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractTemplateResponse>(await DoRequestAsync("1.0", "twc.notary.contract.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建签署流程
         * Summary: 创建电子合同签署流程
         */
        public CreateContractFlowResponse CreateContractFlow(CreateContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractFlowEx(request, headers, runtime);
        }

        /**
         * Description: 创建签署流程
         * Summary: 创建电子合同签署流程
         */
        public async Task<CreateContractFlowResponse> CreateContractFlowAsync(CreateContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建签署流程
         * Summary: 创建电子合同签署流程
         */
        public CreateContractFlowResponse CreateContractFlowEx(CreateContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractFlowResponse>(DoRequest("1.0", "twc.notary.contract.flow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建签署流程
         * Summary: 创建电子合同签署流程
         */
        public async Task<CreateContractFlowResponse> CreateContractFlowExAsync(CreateContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractFlowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.flow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
         * Summary: 向电子合同签署流程中添加待签署文档
         */
        public AddContractDocumentResponse AddContractDocument(AddContractDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddContractDocumentEx(request, headers, runtime);
        }

        /**
         * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
         * Summary: 向电子合同签署流程中添加待签署文档
         */
        public async Task<AddContractDocumentResponse> AddContractDocumentAsync(AddContractDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddContractDocumentExAsync(request, headers, runtime);
        }

        /**
         * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
         * Summary: 向电子合同签署流程中添加待签署文档
         */
        public AddContractDocumentResponse AddContractDocumentEx(AddContractDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractDocumentResponse>(DoRequest("1.0", "twc.notary.contract.document.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
         * Summary: 向电子合同签署流程中添加待签署文档
         */
        public async Task<AddContractDocumentResponse> AddContractDocumentExAsync(AddContractDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractDocumentResponse>(await DoRequestAsync("1.0", "twc.notary.contract.document.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
         * Summary: 添加电子合同签署方自动盖章签署区
         */
        public AddContractSignfieldResponse AddContractSignfield(AddContractSignfieldRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddContractSignfieldEx(request, headers, runtime);
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
         * Summary: 添加电子合同签署方自动盖章签署区
         */
        public async Task<AddContractSignfieldResponse> AddContractSignfieldAsync(AddContractSignfieldRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddContractSignfieldExAsync(request, headers, runtime);
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
         * Summary: 添加电子合同签署方自动盖章签署区
         */
        public AddContractSignfieldResponse AddContractSignfieldEx(AddContractSignfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractSignfieldResponse>(DoRequest("1.0", "twc.notary.contract.signfield.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
         * Summary: 添加电子合同签署方自动盖章签署区
         */
        public async Task<AddContractSignfieldResponse> AddContractSignfieldExAsync(AddContractSignfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractSignfieldResponse>(await DoRequestAsync("1.0", "twc.notary.contract.signfield.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
         * Summary: 电子合同签署流程开启
         */
        public StartContractFlowResponse StartContractFlow(StartContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartContractFlowEx(request, headers, runtime);
        }

        /**
         * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
         * Summary: 电子合同签署流程开启
         */
        public async Task<StartContractFlowResponse> StartContractFlowAsync(StartContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartContractFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
         * Summary: 电子合同签署流程开启
         */
        public StartContractFlowResponse StartContractFlowEx(StartContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartContractFlowResponse>(DoRequest("1.0", "twc.notary.contract.flow.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
         * Summary: 电子合同签署流程开启
         */
        public async Task<StartContractFlowResponse> StartContractFlowExAsync(StartContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartContractFlowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.flow.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
         * Summary: 电子合同签署流程归档
         */
        public SaveContractFlowResponse SaveContractFlow(SaveContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveContractFlowEx(request, headers, runtime);
        }

        /**
         * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
         * Summary: 电子合同签署流程归档
         */
        public async Task<SaveContractFlowResponse> SaveContractFlowAsync(SaveContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveContractFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
         * Summary: 电子合同签署流程归档
         */
        public SaveContractFlowResponse SaveContractFlowEx(SaveContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveContractFlowResponse>(DoRequest("1.0", "twc.notary.contract.flow.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
         * Summary: 电子合同签署流程归档
         */
        public async Task<SaveContractFlowResponse> SaveContractFlowExAsync(SaveContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveContractFlowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.flow.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流程归档后，查询和下载签署后的文件
         * Summary: 电子合同流程文档下载
         */
        public DownloadContractDocumentResponse DownloadContractDocument(DownloadContractDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadContractDocumentEx(request, headers, runtime);
        }

        /**
         * Description: 流程归档后，查询和下载签署后的文件
         * Summary: 电子合同流程文档下载
         */
        public async Task<DownloadContractDocumentResponse> DownloadContractDocumentAsync(DownloadContractDocumentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadContractDocumentExAsync(request, headers, runtime);
        }

        /**
         * Description: 流程归档后，查询和下载签署后的文件
         * Summary: 电子合同流程文档下载
         */
        public DownloadContractDocumentResponse DownloadContractDocumentEx(DownloadContractDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadContractDocumentResponse>(DoRequest("1.0", "twc.notary.contract.document.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流程归档后，查询和下载签署后的文件
         * Summary: 电子合同流程文档下载
         */
        public async Task<DownloadContractDocumentResponse> DownloadContractDocumentExAsync(DownloadContractDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadContractDocumentResponse>(await DoRequestAsync("1.0", "twc.notary.contract.document.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
         * Summary: 通过电子合同模板添加文档
         */
        public AddContractFileResponse AddContractFile(AddContractFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddContractFileEx(request, headers, runtime);
        }

        /**
         * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
         * Summary: 通过电子合同模板添加文档
         */
        public async Task<AddContractFileResponse> AddContractFileAsync(AddContractFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddContractFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
         * Summary: 通过电子合同模板添加文档
         */
        public AddContractFileResponse AddContractFileEx(AddContractFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractFileResponse>(DoRequest("1.0", "twc.notary.contract.file.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
         * Summary: 通过电子合同模板添加文档
         */
        public async Task<AddContractFileResponse> AddContractFileExAsync(AddContractFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractFileResponse>(await DoRequestAsync("1.0", "twc.notary.contract.file.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
         * Summary: 电子合同平台方注册
         */
        public CreateContractPlatformResponse CreateContractPlatform(CreateContractPlatformRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractPlatformEx(request, headers, runtime);
        }

        /**
         * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
         * Summary: 电子合同平台方注册
         */
        public async Task<CreateContractPlatformResponse> CreateContractPlatformAsync(CreateContractPlatformRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractPlatformExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
         * Summary: 电子合同平台方注册
         */
        public CreateContractPlatformResponse CreateContractPlatformEx(CreateContractPlatformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractPlatformResponse>(DoRequest("1.0", "twc.notary.contract.platform.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
         * Summary: 电子合同平台方注册
         */
        public async Task<CreateContractPlatformResponse> CreateContractPlatformExAsync(CreateContractPlatformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractPlatformResponse>(await DoRequestAsync("1.0", "twc.notary.contract.platform.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同平台方提供用户信息，注册成为平台用户
         * Summary: 电子合同平台方的用户注册
         */
        public CreateContractUserResponse CreateContractUser(CreateContractUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractUserEx(request, headers, runtime);
        }

        /**
         * Description: 电子合同平台方提供用户信息，注册成为平台用户
         * Summary: 电子合同平台方的用户注册
         */
        public async Task<CreateContractUserResponse> CreateContractUserAsync(CreateContractUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子合同平台方提供用户信息，注册成为平台用户
         * Summary: 电子合同平台方的用户注册
         */
        public CreateContractUserResponse CreateContractUserEx(CreateContractUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractUserResponse>(DoRequest("1.0", "twc.notary.contract.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同平台方提供用户信息，注册成为平台用户
         * Summary: 电子合同平台方的用户注册
         */
        public async Task<CreateContractUserResponse> CreateContractUserExAsync(CreateContractUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractUserResponse>(await DoRequestAsync("1.0", "twc.notary.contract.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
         * Summary: 电子合同平台方发起手动签署流程
         */
        public StartContractHandsignResponse StartContractHandsign(StartContractHandsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartContractHandsignEx(request, headers, runtime);
        }

        /**
         * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
         * Summary: 电子合同平台方发起手动签署流程
         */
        public async Task<StartContractHandsignResponse> StartContractHandsignAsync(StartContractHandsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartContractHandsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
         * Summary: 电子合同平台方发起手动签署流程
         */
        public StartContractHandsignResponse StartContractHandsignEx(StartContractHandsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartContractHandsignResponse>(DoRequest("1.0", "twc.notary.contract.handsign.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
         * Summary: 电子合同平台方发起手动签署流程
         */
        public async Task<StartContractHandsignResponse> StartContractHandsignExAsync(StartContractHandsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartContractHandsignResponse>(await DoRequestAsync("1.0", "twc.notary.contract.handsign.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
         * Summary: 签署流程查询
         */
        public QueryContractFlowResponse QueryContractFlow(QueryContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractFlowEx(request, headers, runtime);
        }

        /**
         * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
         * Summary: 签署流程查询
         */
        public async Task<QueryContractFlowResponse> QueryContractFlowAsync(QueryContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
         * Summary: 签署流程查询
         */
        public QueryContractFlowResponse QueryContractFlowEx(QueryContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractFlowResponse>(DoRequest("1.0", "twc.notary.contract.flow.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
         * Summary: 签署流程查询
         */
        public async Task<QueryContractFlowResponse> QueryContractFlowExAsync(QueryContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractFlowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.flow.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建个人/机构图片印章
         * Summary: 创建个人/机构图片印章
         */
        public CreateContractAccountsealimageResponse CreateContractAccountsealimage(CreateContractAccountsealimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractAccountsealimageEx(request, headers, runtime);
        }

        /**
         * Description: 创建个人/机构图片印章
         * Summary: 创建个人/机构图片印章
         */
        public async Task<CreateContractAccountsealimageResponse> CreateContractAccountsealimageAsync(CreateContractAccountsealimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractAccountsealimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建个人/机构图片印章
         * Summary: 创建个人/机构图片印章
         */
        public CreateContractAccountsealimageResponse CreateContractAccountsealimageEx(CreateContractAccountsealimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAccountsealimageResponse>(DoRequest("1.0", "twc.notary.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建个人/机构图片印章
         * Summary: 创建个人/机构图片印章
         */
        public async Task<CreateContractAccountsealimageResponse> CreateContractAccountsealimageExAsync(CreateContractAccountsealimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAccountsealimageResponse>(await DoRequestAsync("1.0", "twc.notary.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
         * Summary: 通过上传方式创建文件
         */
        public GetContractFileuploadurlResponse GetContractFileuploadurl(GetContractFileuploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractFileuploadurlEx(request, headers, runtime);
        }

        /**
         * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
         * Summary: 通过上传方式创建文件
         */
        public async Task<GetContractFileuploadurlResponse> GetContractFileuploadurlAsync(GetContractFileuploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractFileuploadurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
         * Summary: 通过上传方式创建文件
         */
        public GetContractFileuploadurlResponse GetContractFileuploadurlEx(GetContractFileuploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractFileuploadurlResponse>(DoRequest("1.0", "twc.notary.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
         * Summary: 通过上传方式创建文件
         */
        public async Task<GetContractFileuploadurlResponse> GetContractFileuploadurlExAsync(GetContractFileuploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractFileuploadurlResponse>(await DoRequestAsync("1.0", "twc.notary.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
         * Summary: 添加平台自动盖章签署区
         */
        public AddContractPlatformsignfieldsResponse AddContractPlatformsignfields(AddContractPlatformsignfieldsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddContractPlatformsignfieldsEx(request, headers, runtime);
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
         * Summary: 添加平台自动盖章签署区
         */
        public async Task<AddContractPlatformsignfieldsResponse> AddContractPlatformsignfieldsAsync(AddContractPlatformsignfieldsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddContractPlatformsignfieldsExAsync(request, headers, runtime);
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
         * Summary: 添加平台自动盖章签署区
         */
        public AddContractPlatformsignfieldsResponse AddContractPlatformsignfieldsEx(AddContractPlatformsignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractPlatformsignfieldsResponse>(DoRequest("1.0", "twc.notary.contract.platformsignfields.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
         * Summary: 添加平台自动盖章签署区
         */
        public async Task<AddContractPlatformsignfieldsResponse> AddContractPlatformsignfieldsExAsync(AddContractPlatformsignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractPlatformsignfieldsResponse>(await DoRequestAsync("1.0", "twc.notary.contract.platformsignfields.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件详情，包括文件名称、大小、下载地址等
         * Summary: 查询文件详情
         */
        public GetContractFileResponse GetContractFile(GetContractFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractFileEx(request, headers, runtime);
        }

        /**
         * Description: 查询文件详情，包括文件名称、大小、下载地址等
         * Summary: 查询文件详情
         */
        public async Task<GetContractFileResponse> GetContractFileAsync(GetContractFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询文件详情，包括文件名称、大小、下载地址等
         * Summary: 查询文件详情
         */
        public GetContractFileResponse GetContractFileEx(GetContractFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractFileResponse>(DoRequest("1.0", "twc.notary.contract.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件详情，包括文件名称、大小、下载地址等
         * Summary: 查询文件详情
         */
        public async Task<GetContractFileResponse> GetContractFileExAsync(GetContractFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractFileResponse>(await DoRequestAsync("1.0", "twc.notary.contract.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询个人所有印章
         * Summary: 查询个人印章
         */
        public QueryContractAccountsealsResponse QueryContractAccountseals(QueryContractAccountsealsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractAccountsealsEx(request, headers, runtime);
        }

        /**
         * Description: 查询个人所有印章
         * Summary: 查询个人印章
         */
        public async Task<QueryContractAccountsealsResponse> QueryContractAccountsealsAsync(QueryContractAccountsealsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractAccountsealsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询个人所有印章
         * Summary: 查询个人印章
         */
        public QueryContractAccountsealsResponse QueryContractAccountsealsEx(QueryContractAccountsealsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractAccountsealsResponse>(DoRequest("1.0", "twc.notary.contract.accountseals.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询个人所有印章
         * Summary: 查询个人印章
         */
        public async Task<QueryContractAccountsealsResponse> QueryContractAccountsealsExAsync(QueryContractAccountsealsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractAccountsealsResponse>(await DoRequestAsync("1.0", "twc.notary.contract.accountseals.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询机构所有印章
         * Summary: 查询机构印章
         */
        public QueryContractOrganizationsealsResponse QueryContractOrganizationseals(QueryContractOrganizationsealsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractOrganizationsealsEx(request, headers, runtime);
        }

        /**
         * Description: 查询机构所有印章
         * Summary: 查询机构印章
         */
        public async Task<QueryContractOrganizationsealsResponse> QueryContractOrganizationsealsAsync(QueryContractOrganizationsealsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractOrganizationsealsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询机构所有印章
         * Summary: 查询机构印章
         */
        public QueryContractOrganizationsealsResponse QueryContractOrganizationsealsEx(QueryContractOrganizationsealsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractOrganizationsealsResponse>(DoRequest("1.0", "twc.notary.contract.organizationseals.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询机构所有印章
         * Summary: 查询机构印章
         */
        public async Task<QueryContractOrganizationsealsResponse> QueryContractOrganizationsealsExAsync(QueryContractOrganizationsealsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractOrganizationsealsResponse>(await DoRequestAsync("1.0", "twc.notary.contract.organizationseals.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询流程所有签署人列表。
         * Summary: 查询流程签署人列表
         */
        public QueryContractFlowsignerResponse QueryContractFlowsigner(QueryContractFlowsignerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractFlowsignerEx(request, headers, runtime);
        }

        /**
         * Description: 查询流程所有签署人列表。
         * Summary: 查询流程签署人列表
         */
        public async Task<QueryContractFlowsignerResponse> QueryContractFlowsignerAsync(QueryContractFlowsignerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractFlowsignerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询流程所有签署人列表。
         * Summary: 查询流程签署人列表
         */
        public QueryContractFlowsignerResponse QueryContractFlowsignerEx(QueryContractFlowsignerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractFlowsignerResponse>(DoRequest("1.0", "twc.notary.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询流程所有签署人列表。
         * Summary: 查询流程签署人列表
         */
        public async Task<QueryContractFlowsignerResponse> QueryContractFlowsignerExAsync(QueryContractFlowsignerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractFlowsignerResponse>(await DoRequestAsync("1.0", "twc.notary.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
         * Summary: 查询签署区列表
         */
        public QueryContractSignfieldsResponse QueryContractSignfields(QueryContractSignfieldsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractSignfieldsEx(request, headers, runtime);
        }

        /**
         * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
         * Summary: 查询签署区列表
         */
        public async Task<QueryContractSignfieldsResponse> QueryContractSignfieldsAsync(QueryContractSignfieldsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractSignfieldsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
         * Summary: 查询签署区列表
         */
        public QueryContractSignfieldsResponse QueryContractSignfieldsEx(QueryContractSignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractSignfieldsResponse>(DoRequest("1.0", "twc.notary.contract.signfields.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
         * Summary: 查询签署区列表
         */
        public async Task<QueryContractSignfieldsResponse> QueryContractSignfieldsExAsync(QueryContractSignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractSignfieldsResponse>(await DoRequestAsync("1.0", "twc.notary.contract.signfields.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用创建账号返回的账号id查询用户的账号。
         * Summary: 查询个人账号
         */
        public QueryContractAccountResponse QueryContractAccount(QueryContractAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractAccountEx(request, headers, runtime);
        }

        /**
         * Description: 使用创建账号返回的账号id查询用户的账号。
         * Summary: 查询个人账号
         */
        public async Task<QueryContractAccountResponse> QueryContractAccountAsync(QueryContractAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 使用创建账号返回的账号id查询用户的账号。
         * Summary: 查询个人账号
         */
        public QueryContractAccountResponse QueryContractAccountEx(QueryContractAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractAccountResponse>(DoRequest("1.0", "twc.notary.contract.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用创建账号返回的账号id查询用户的账号。
         * Summary: 查询个人账号
         */
        public async Task<QueryContractAccountResponse> QueryContractAccountExAsync(QueryContractAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractAccountResponse>(await DoRequestAsync("1.0", "twc.notary.contract.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用创建账号返回的账号id查询机构账号。
         * Summary: 查询机构账号
         */
        public QueryContractOrganizationResponse QueryContractOrganization(QueryContractOrganizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractOrganizationEx(request, headers, runtime);
        }

        /**
         * Description: 使用创建账号返回的账号id查询机构账号。
         * Summary: 查询机构账号
         */
        public async Task<QueryContractOrganizationResponse> QueryContractOrganizationAsync(QueryContractOrganizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractOrganizationExAsync(request, headers, runtime);
        }

        /**
         * Description: 使用创建账号返回的账号id查询机构账号。
         * Summary: 查询机构账号
         */
        public QueryContractOrganizationResponse QueryContractOrganizationEx(QueryContractOrganizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractOrganizationResponse>(DoRequest("1.0", "twc.notary.contract.organization.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用创建账号返回的账号id查询机构账号。
         * Summary: 查询机构账号
         */
        public async Task<QueryContractOrganizationResponse> QueryContractOrganizationExAsync(QueryContractOrganizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractOrganizationResponse>(await DoRequestAsync("1.0", "twc.notary.contract.organization.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
         * Summary: 查询模板详情详情
         */
        public QueryContractTemplateResponse QueryContractTemplate(QueryContractTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
         * Summary: 查询模板详情详情
         */
        public async Task<QueryContractTemplateResponse> QueryContractTemplateAsync(QueryContractTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
         * Summary: 查询模板详情详情
         */
        public QueryContractTemplateResponse QueryContractTemplateEx(QueryContractTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTemplateResponse>(DoRequest("1.0", "twc.notary.contract.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
         * Summary: 查询模板详情详情
         */
        public async Task<QueryContractTemplateResponse> QueryContractTemplateExAsync(QueryContractTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTemplateResponse>(await DoRequestAsync("1.0", "twc.notary.contract.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
         * Summary: 创建签署流程
         */
        public CreateContractSignflowResponse CreateContractSignflow(CreateContractSignflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractSignflowEx(request, headers, runtime);
        }

        /**
         * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
         * Summary: 创建签署流程
         */
        public async Task<CreateContractSignflowResponse> CreateContractSignflowAsync(CreateContractSignflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractSignflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
         * Summary: 创建签署流程
         */
        public CreateContractSignflowResponse CreateContractSignflowEx(CreateContractSignflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractSignflowResponse>(DoRequest("1.0", "twc.notary.contract.signflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
         * Summary: 创建签署流程
         */
        public async Task<CreateContractSignflowResponse> CreateContractSignflowExAsync(CreateContractSignflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractSignflowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.signflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户签署直付通协议
         * Summary: 商户签署直付通协议
         */
        public CreateContractRegisterzftResponse CreateContractRegisterzft(CreateContractRegisterzftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractRegisterzftEx(request, headers, runtime);
        }

        /**
         * Description: 商户签署直付通协议
         * Summary: 商户签署直付通协议
         */
        public async Task<CreateContractRegisterzftResponse> CreateContractRegisterzftAsync(CreateContractRegisterzftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractRegisterzftExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户签署直付通协议
         * Summary: 商户签署直付通协议
         */
        public CreateContractRegisterzftResponse CreateContractRegisterzftEx(CreateContractRegisterzftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractRegisterzftResponse>(DoRequest("1.0", "twc.notary.contract.registerzft.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户签署直付通协议
         * Summary: 商户签署直付通协议
         */
        public async Task<CreateContractRegisterzftResponse> CreateContractRegisterzftExAsync(CreateContractRegisterzftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractRegisterzftResponse>(await DoRequestAsync("1.0", "twc.notary.contract.registerzft.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
         * Summary: 创建智能合同模板
         */
        public CreateContractPlatformtemplateResponse CreateContractPlatformtemplate(CreateContractPlatformtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractPlatformtemplateEx(request, headers, runtime);
        }

        /**
         * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
         * Summary: 创建智能合同模板
         */
        public async Task<CreateContractPlatformtemplateResponse> CreateContractPlatformtemplateAsync(CreateContractPlatformtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractPlatformtemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
         * Summary: 创建智能合同模板
         */
        public CreateContractPlatformtemplateResponse CreateContractPlatformtemplateEx(CreateContractPlatformtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractPlatformtemplateResponse>(DoRequest("1.0", "twc.notary.contract.platformtemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
         * Summary: 创建智能合同模板
         */
        public async Task<CreateContractPlatformtemplateResponse> CreateContractPlatformtemplateExAsync(CreateContractPlatformtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractPlatformtemplateResponse>(await DoRequestAsync("1.0", "twc.notary.contract.platformtemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户直付通入驻信息
         * Summary: 查询商户直付通入驻信息
         */
        public QueryContractMerchantzftResponse QueryContractMerchantzft(QueryContractMerchantzftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractMerchantzftEx(request, headers, runtime);
        }

        /**
         * Description: 查询商户直付通入驻信息
         * Summary: 查询商户直付通入驻信息
         */
        public async Task<QueryContractMerchantzftResponse> QueryContractMerchantzftAsync(QueryContractMerchantzftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractMerchantzftExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商户直付通入驻信息
         * Summary: 查询商户直付通入驻信息
         */
        public QueryContractMerchantzftResponse QueryContractMerchantzftEx(QueryContractMerchantzftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractMerchantzftResponse>(DoRequest("1.0", "twc.notary.contract.merchantzft.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商户直付通入驻信息
         * Summary: 查询商户直付通入驻信息
         */
        public async Task<QueryContractMerchantzftResponse> QueryContractMerchantzftExAsync(QueryContractMerchantzftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractMerchantzftResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchantzft.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举本租户合同相关交易
         * Summary: 列举本租户合同相关交易
         */
        public ListContractOuttradeidResponse ListContractOuttradeid(ListContractOuttradeidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContractOuttradeidEx(request, headers, runtime);
        }

        /**
         * Description: 列举本租户合同相关交易
         * Summary: 列举本租户合同相关交易
         */
        public async Task<ListContractOuttradeidResponse> ListContractOuttradeidAsync(ListContractOuttradeidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContractOuttradeidExAsync(request, headers, runtime);
        }

        /**
         * Description: 列举本租户合同相关交易
         * Summary: 列举本租户合同相关交易
         */
        public ListContractOuttradeidResponse ListContractOuttradeidEx(ListContractOuttradeidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractOuttradeidResponse>(DoRequest("1.0", "twc.notary.contract.outtradeid.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举本租户合同相关交易
         * Summary: 列举本租户合同相关交易
         */
        public async Task<ListContractOuttradeidResponse> ListContractOuttradeidExAsync(ListContractOuttradeidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractOuttradeidResponse>(await DoRequestAsync("1.0", "twc.notary.contract.outtradeid.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据订单id查询订单代扣详情
         * Summary: 根据订单id查询订单代扣详情
         */
        public QueryContractTradedetailResponse QueryContractTradedetail(QueryContractTradedetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractTradedetailEx(request, headers, runtime);
        }

        /**
         * Description: 根据订单id查询订单代扣详情
         * Summary: 根据订单id查询订单代扣详情
         */
        public async Task<QueryContractTradedetailResponse> QueryContractTradedetailAsync(QueryContractTradedetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractTradedetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据订单id查询订单代扣详情
         * Summary: 根据订单id查询订单代扣详情
         */
        public QueryContractTradedetailResponse QueryContractTradedetailEx(QueryContractTradedetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTradedetailResponse>(DoRequest("1.0", "twc.notary.contract.tradedetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据订单id查询订单代扣详情
         * Summary: 根据订单id查询订单代扣详情
         */
        public async Task<QueryContractTradedetailResponse> QueryContractTradedetailExAsync(QueryContractTradedetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTradedetailResponse>(await DoRequestAsync("1.0", "twc.notary.contract.tradedetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户根据订单id退款
         * Summary: 商户根据订单id退款
         */
        public CreateContractMerchantrefundResponse CreateContractMerchantrefund(CreateContractMerchantrefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractMerchantrefundEx(request, headers, runtime);
        }

        /**
         * Description: 商户根据订单id退款
         * Summary: 商户根据订单id退款
         */
        public async Task<CreateContractMerchantrefundResponse> CreateContractMerchantrefundAsync(CreateContractMerchantrefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractMerchantrefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户根据订单id退款
         * Summary: 商户根据订单id退款
         */
        public CreateContractMerchantrefundResponse CreateContractMerchantrefundEx(CreateContractMerchantrefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractMerchantrefundResponse>(DoRequest("1.0", "twc.notary.contract.merchantrefund.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户根据订单id退款
         * Summary: 商户根据订单id退款
         */
        public async Task<CreateContractMerchantrefundResponse> CreateContractMerchantrefundExAsync(CreateContractMerchantrefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractMerchantrefundResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchantrefund.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建蚂蚁区块链账户
         * Summary: 创建蚂蚁区块链账户
         */
        public CreateContractAdminaccountResponse CreateContractAdminaccount(CreateContractAdminaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractAdminaccountEx(request, headers, runtime);
        }

        /**
         * Description: 创建蚂蚁区块链账户
         * Summary: 创建蚂蚁区块链账户
         */
        public async Task<CreateContractAdminaccountResponse> CreateContractAdminaccountAsync(CreateContractAdminaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractAdminaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建蚂蚁区块链账户
         * Summary: 创建蚂蚁区块链账户
         */
        public CreateContractAdminaccountResponse CreateContractAdminaccountEx(CreateContractAdminaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAdminaccountResponse>(DoRequest("1.0", "twc.notary.contract.adminaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建蚂蚁区块链账户
         * Summary: 创建蚂蚁区块链账户
         */
        public async Task<CreateContractAdminaccountResponse> CreateContractAdminaccountExAsync(CreateContractAdminaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAdminaccountResponse>(await DoRequestAsync("1.0", "twc.notary.contract.adminaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户根据合同id列举所有的tradeId
         * Summary: 商户根据合同id列举所有的tradeId
         */
        public ListContractTradeidsResponse ListContractTradeids(ListContractTradeidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContractTradeidsEx(request, headers, runtime);
        }

        /**
         * Description: 商户根据合同id列举所有的tradeId
         * Summary: 商户根据合同id列举所有的tradeId
         */
        public async Task<ListContractTradeidsResponse> ListContractTradeidsAsync(ListContractTradeidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContractTradeidsExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户根据合同id列举所有的tradeId
         * Summary: 商户根据合同id列举所有的tradeId
         */
        public ListContractTradeidsResponse ListContractTradeidsEx(ListContractTradeidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractTradeidsResponse>(DoRequest("1.0", "twc.notary.contract.tradeids.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户根据合同id列举所有的tradeId
         * Summary: 商户根据合同id列举所有的tradeId
         */
        public async Task<ListContractTradeidsResponse> ListContractTradeidsExAsync(ListContractTradeidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractTradeidsResponse>(await DoRequestAsync("1.0", "twc.notary.contract.tradeids.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户上传代扣规则
         * Summary: 商户上传代扣规则
         */
        public CreateContractCommontriggerResponse CreateContractCommontrigger(CreateContractCommontriggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractCommontriggerEx(request, headers, runtime);
        }

        /**
         * Description: 商户上传代扣规则
         * Summary: 商户上传代扣规则
         */
        public async Task<CreateContractCommontriggerResponse> CreateContractCommontriggerAsync(CreateContractCommontriggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractCommontriggerExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户上传代扣规则
         * Summary: 商户上传代扣规则
         */
        public CreateContractCommontriggerResponse CreateContractCommontriggerEx(CreateContractCommontriggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractCommontriggerResponse>(DoRequest("1.0", "twc.notary.contract.commontrigger.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户上传代扣规则
         * Summary: 商户上传代扣规则
         */
        public async Task<CreateContractCommontriggerResponse> CreateContractCommontriggerExAsync(CreateContractCommontriggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractCommontriggerResponse>(await DoRequestAsync("1.0", "twc.notary.contract.commontrigger.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻直付通
         * Summary: 商户入驻直付通
         */
        public CreateContractMerchantindirectzftResponse CreateContractMerchantindirectzft(CreateContractMerchantindirectzftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractMerchantindirectzftEx(request, headers, runtime);
        }

        /**
         * Description: 商户入驻直付通
         * Summary: 商户入驻直付通
         */
        public async Task<CreateContractMerchantindirectzftResponse> CreateContractMerchantindirectzftAsync(CreateContractMerchantindirectzftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractMerchantindirectzftExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户入驻直付通
         * Summary: 商户入驻直付通
         */
        public CreateContractMerchantindirectzftResponse CreateContractMerchantindirectzftEx(CreateContractMerchantindirectzftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractMerchantindirectzftResponse>(DoRequest("1.0", "twc.notary.contract.merchantindirectzft.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻直付通
         * Summary: 商户入驻直付通
         */
        public async Task<CreateContractMerchantindirectzftResponse> CreateContractMerchantindirectzftExAsync(CreateContractMerchantindirectzftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractMerchantindirectzftResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchantindirectzft.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据订单id查询直付通商户入驻信息
         * Summary: 根据订单id查询直付通商户入驻信息
         */
        public QueryContractMerchantindirectzftResponse QueryContractMerchantindirectzft(QueryContractMerchantindirectzftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractMerchantindirectzftEx(request, headers, runtime);
        }

        /**
         * Description: 根据订单id查询直付通商户入驻信息
         * Summary: 根据订单id查询直付通商户入驻信息
         */
        public async Task<QueryContractMerchantindirectzftResponse> QueryContractMerchantindirectzftAsync(QueryContractMerchantindirectzftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractMerchantindirectzftExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据订单id查询直付通商户入驻信息
         * Summary: 根据订单id查询直付通商户入驻信息
         */
        public QueryContractMerchantindirectzftResponse QueryContractMerchantindirectzftEx(QueryContractMerchantindirectzftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractMerchantindirectzftResponse>(DoRequest("1.0", "twc.notary.contract.merchantindirectzft.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据订单id查询直付通商户入驻信息
         * Summary: 根据订单id查询直付通商户入驻信息
         */
        public async Task<QueryContractMerchantindirectzftResponse> QueryContractMerchantindirectzftExAsync(QueryContractMerchantindirectzftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractMerchantindirectzftResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchantindirectzft.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取支付对账文件的url
         * Summary: 获取支付对账文件的url
         */
        public QueryPayresultfileurlResponse QueryPayresultfileurl(QueryPayresultfileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPayresultfileurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取支付对账文件的url
         * Summary: 获取支付对账文件的url
         */
        public async Task<QueryPayresultfileurlResponse> QueryPayresultfileurlAsync(QueryPayresultfileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPayresultfileurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取支付对账文件的url
         * Summary: 获取支付对账文件的url
         */
        public QueryPayresultfileurlResponse QueryPayresultfileurlEx(QueryPayresultfileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPayresultfileurlResponse>(DoRequest("1.0", "twc.notary.payresultfileurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取支付对账文件的url
         * Summary: 获取支付对账文件的url
         */
        public async Task<QueryPayresultfileurlResponse> QueryPayresultfileurlExAsync(QueryPayresultfileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPayresultfileurlResponse>(await DoRequestAsync("1.0", "twc.notary.payresultfileurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智能合同图片上传
         * Summary: 智能合同图片上传
         */
        public CreateContractMerchantimageResponse CreateContractMerchantimage(CreateContractMerchantimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractMerchantimageEx(request, headers, runtime);
        }

        /**
         * Description: 智能合同图片上传
         * Summary: 智能合同图片上传
         */
        public async Task<CreateContractMerchantimageResponse> CreateContractMerchantimageAsync(CreateContractMerchantimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractMerchantimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 智能合同图片上传
         * Summary: 智能合同图片上传
         */
        public CreateContractMerchantimageResponse CreateContractMerchantimageEx(CreateContractMerchantimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractMerchantimageResponse>(DoRequest("1.0", "twc.notary.contract.merchantimage.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智能合同图片上传
         * Summary: 智能合同图片上传
         */
        public async Task<CreateContractMerchantimageResponse> CreateContractMerchantimageExAsync(CreateContractMerchantimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractMerchantimageResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchantimage.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消智能合同剩余代扣条目
         * Summary: 取消智能合同剩余代扣条目
         */
        public CancelContractPaytradeResponse CancelContractPaytrade(CancelContractPaytradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelContractPaytradeEx(request, headers, runtime);
        }

        /**
         * Description: 取消智能合同剩余代扣条目
         * Summary: 取消智能合同剩余代扣条目
         */
        public async Task<CancelContractPaytradeResponse> CancelContractPaytradeAsync(CancelContractPaytradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelContractPaytradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消智能合同剩余代扣条目
         * Summary: 取消智能合同剩余代扣条目
         */
        public CancelContractPaytradeResponse CancelContractPaytradeEx(CancelContractPaytradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractPaytradeResponse>(DoRequest("1.0", "twc.notary.contract.paytrade.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消智能合同剩余代扣条目
         * Summary: 取消智能合同剩余代扣条目
         */
        public async Task<CancelContractPaytradeResponse> CancelContractPaytradeExAsync(CancelContractPaytradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractPaytradeResponse>(await DoRequestAsync("1.0", "twc.notary.contract.paytrade.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建手动签署流程
         * Summary: 创建手动签署流程
         */
        public CreateContractHandsignflowResponse CreateContractHandsignflow(CreateContractHandsignflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractHandsignflowEx(request, headers, runtime);
        }

        /**
         * Description: 创建手动签署流程
         * Summary: 创建手动签署流程
         */
        public async Task<CreateContractHandsignflowResponse> CreateContractHandsignflowAsync(CreateContractHandsignflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractHandsignflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建手动签署流程
         * Summary: 创建手动签署流程
         */
        public CreateContractHandsignflowResponse CreateContractHandsignflowEx(CreateContractHandsignflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractHandsignflowResponse>(DoRequest("1.0", "twc.notary.contract.handsignflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建手动签署流程
         * Summary: 创建手动签署流程
         */
        public async Task<CreateContractHandsignflowResponse> CreateContractHandsignflowExAsync(CreateContractHandsignflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractHandsignflowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.handsignflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
         * Summary: 添加电子合同签署方手动盖章签署区
         */
        public CreateContractHandsignfieldResponse CreateContractHandsignfield(CreateContractHandsignfieldRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractHandsignfieldEx(request, headers, runtime);
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
         * Summary: 添加电子合同签署方手动盖章签署区
         */
        public async Task<CreateContractHandsignfieldResponse> CreateContractHandsignfieldAsync(CreateContractHandsignfieldRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractHandsignfieldExAsync(request, headers, runtime);
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
         * Summary: 添加电子合同签署方手动盖章签署区
         */
        public CreateContractHandsignfieldResponse CreateContractHandsignfieldEx(CreateContractHandsignfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractHandsignfieldResponse>(DoRequest("1.0", "twc.notary.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
         * Summary: 添加电子合同签署方手动盖章签署区
         */
        public async Task<CreateContractHandsignfieldResponse> CreateContractHandsignfieldExAsync(CreateContractHandsignfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractHandsignfieldResponse>(await DoRequestAsync("1.0", "twc.notary.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
         * Summary: 获取签署地址
         */
        public GetContractSignurlResponse GetContractSignurl(GetContractSignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractSignurlEx(request, headers, runtime);
        }

        /**
         * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
         * Summary: 获取签署地址
         */
        public async Task<GetContractSignurlResponse> GetContractSignurlAsync(GetContractSignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractSignurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
         * Summary: 获取签署地址
         */
        public GetContractSignurlResponse GetContractSignurlEx(GetContractSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractSignurlResponse>(DoRequest("1.0", "twc.notary.contract.signurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
         * Summary: 获取签署地址
         */
        public async Task<GetContractSignurlResponse> GetContractSignurlExAsync(GetContractSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractSignurlResponse>(await DoRequestAsync("1.0", "twc.notary.contract.signurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信付代扣规则内容创建
         * Summary: 可信付代扣规则内容创建
         */
        public CreateWithholdAgreementResponse CreateWithholdAgreement(CreateWithholdAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWithholdAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 可信付代扣规则内容创建
         * Summary: 可信付代扣规则内容创建
         */
        public async Task<CreateWithholdAgreementResponse> CreateWithholdAgreementAsync(CreateWithholdAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWithholdAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信付代扣规则内容创建
         * Summary: 可信付代扣规则内容创建
         */
        public CreateWithholdAgreementResponse CreateWithholdAgreementEx(CreateWithholdAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdAgreementResponse>(DoRequest("1.0", "twc.notary.withhold.agreement.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信付代扣规则内容创建
         * Summary: 可信付代扣规则内容创建
         */
        public async Task<CreateWithholdAgreementResponse> CreateWithholdAgreementExAsync(CreateWithholdAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdAgreementResponse>(await DoRequestAsync("1.0", "twc.notary.withhold.agreement.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消金代扣协议
         * Summary: 查询可信付代扣协议内容
         */
        public QueryWithholdAgreementResponse QueryWithholdAgreement(QueryWithholdAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWithholdAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 查询消金代扣协议
         * Summary: 查询可信付代扣协议内容
         */
        public async Task<QueryWithholdAgreementResponse> QueryWithholdAgreementAsync(QueryWithholdAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWithholdAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询消金代扣协议
         * Summary: 查询可信付代扣协议内容
         */
        public QueryWithholdAgreementResponse QueryWithholdAgreementEx(QueryWithholdAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdAgreementResponse>(DoRequest("1.0", "twc.notary.withhold.agreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询消金代扣协议
         * Summary: 查询可信付代扣协议内容
         */
        public async Task<QueryWithholdAgreementResponse> QueryWithholdAgreementExAsync(QueryWithholdAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdAgreementResponse>(await DoRequestAsync("1.0", "twc.notary.withhold.agreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可信付协议的入口
         * Summary: 查询可信付协议的入口
         */
        public QueryWithholdAgreementurlResponse QueryWithholdAgreementurl(QueryWithholdAgreementurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWithholdAgreementurlEx(request, headers, runtime);
        }

        /**
         * Description: 查询可信付协议的入口
         * Summary: 查询可信付协议的入口
         */
        public async Task<QueryWithholdAgreementurlResponse> QueryWithholdAgreementurlAsync(QueryWithholdAgreementurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWithholdAgreementurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可信付协议的入口
         * Summary: 查询可信付协议的入口
         */
        public QueryWithholdAgreementurlResponse QueryWithholdAgreementurlEx(QueryWithholdAgreementurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdAgreementurlResponse>(DoRequest("1.0", "twc.notary.withhold.agreementurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可信付协议的入口
         * Summary: 查询可信付协议的入口
         */
        public async Task<QueryWithholdAgreementurlResponse> QueryWithholdAgreementurlExAsync(QueryWithholdAgreementurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdAgreementurlResponse>(await DoRequestAsync("1.0", "twc.notary.withhold.agreementurl.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 后台录入商家的产品的逾期日
         * Summary: 后台录入商家的产品的逾期日
         */
        public CreateWithholdOverduetimeResponse CreateWithholdOverduetime(CreateWithholdOverduetimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWithholdOverduetimeEx(request, headers, runtime);
        }

        /**
         * Description: 后台录入商家的产品的逾期日
         * Summary: 后台录入商家的产品的逾期日
         */
        public async Task<CreateWithholdOverduetimeResponse> CreateWithholdOverduetimeAsync(CreateWithholdOverduetimeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWithholdOverduetimeExAsync(request, headers, runtime);
        }

        /**
         * Description: 后台录入商家的产品的逾期日
         * Summary: 后台录入商家的产品的逾期日
         */
        public CreateWithholdOverduetimeResponse CreateWithholdOverduetimeEx(CreateWithholdOverduetimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdOverduetimeResponse>(DoRequest("1.0", "twc.notary.withhold.overduetime.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 后台录入商家的产品的逾期日
         * Summary: 后台录入商家的产品的逾期日
         */
        public async Task<CreateWithholdOverduetimeResponse> CreateWithholdOverduetimeExAsync(CreateWithholdOverduetimeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdOverduetimeResponse>(await DoRequestAsync("1.0", "twc.notary.withhold.overduetime.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信付代扣的扣费请求
         * Summary: 发送代扣请求
         */
        public SendWithholdDeductResponse SendWithholdDeduct(SendWithholdDeductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendWithholdDeductEx(request, headers, runtime);
        }

        /**
         * Description: 可信付代扣的扣费请求
         * Summary: 发送代扣请求
         */
        public async Task<SendWithholdDeductResponse> SendWithholdDeductAsync(SendWithholdDeductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendWithholdDeductExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信付代扣的扣费请求
         * Summary: 发送代扣请求
         */
        public SendWithholdDeductResponse SendWithholdDeductEx(SendWithholdDeductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendWithholdDeductResponse>(DoRequest("1.0", "twc.notary.withhold.deduct.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信付代扣的扣费请求
         * Summary: 发送代扣请求
         */
        public async Task<SendWithholdDeductResponse> SendWithholdDeductExAsync(SendWithholdDeductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendWithholdDeductResponse>(await DoRequestAsync("1.0", "twc.notary.withhold.deduct.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信付代扣结果查询
         * Summary: 可信付代扣结果查询
         */
        public QueryWithholdPayresultResponse QueryWithholdPayresult(QueryWithholdPayresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWithholdPayresultEx(request, headers, runtime);
        }

        /**
         * Description: 可信付代扣结果查询
         * Summary: 可信付代扣结果查询
         */
        public async Task<QueryWithholdPayresultResponse> QueryWithholdPayresultAsync(QueryWithholdPayresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWithholdPayresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信付代扣结果查询
         * Summary: 可信付代扣结果查询
         */
        public QueryWithholdPayresultResponse QueryWithholdPayresultEx(QueryWithholdPayresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdPayresultResponse>(DoRequest("1.0", "twc.notary.withhold.payresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信付代扣结果查询
         * Summary: 可信付代扣结果查询
         */
        public async Task<QueryWithholdPayresultResponse> QueryWithholdPayresultExAsync(QueryWithholdPayresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWithholdPayresultResponse>(await DoRequestAsync("1.0", "twc.notary.withhold.payresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信付退款请求
         * Summary: 可信付退款请求
         */
        public SendWithholdRefundResponse SendWithholdRefund(SendWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendWithholdRefundEx(request, headers, runtime);
        }

        /**
         * Description: 可信付退款请求
         * Summary: 可信付退款请求
         */
        public async Task<SendWithholdRefundResponse> SendWithholdRefundAsync(SendWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendWithholdRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信付退款请求
         * Summary: 可信付退款请求
         */
        public SendWithholdRefundResponse SendWithholdRefundEx(SendWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendWithholdRefundResponse>(DoRequest("1.0", "twc.notary.withhold.refund.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信付退款请求
         * Summary: 可信付退款请求
         */
        public async Task<SendWithholdRefundResponse> SendWithholdRefundExAsync(SendWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendWithholdRefundResponse>(await DoRequestAsync("1.0", "twc.notary.withhold.refund.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
         * Summary: 创建注册邀请任务
         */
        public SendContractInvitationResponse SendContractInvitation(SendContractInvitationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendContractInvitationEx(request, headers, runtime);
        }

        /**
         * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
         * Summary: 创建注册邀请任务
         */
        public async Task<SendContractInvitationResponse> SendContractInvitationAsync(SendContractInvitationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendContractInvitationExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
         * Summary: 创建注册邀请任务
         */
        public SendContractInvitationResponse SendContractInvitationEx(SendContractInvitationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendContractInvitationResponse>(DoRequest("1.0", "twc.notary.contract.invitation.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
         * Summary: 创建注册邀请任务
         */
        public async Task<SendContractInvitationResponse> SendContractInvitationExAsync(SendContractInvitationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendContractInvitationResponse>(await DoRequestAsync("1.0", "twc.notary.contract.invitation.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代扣规则
         * Summary: 查询代扣规则
         */
        public ListContractPayruleResponse ListContractPayrule(ListContractPayruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContractPayruleEx(request, headers, runtime);
        }

        /**
         * Description: 查询代扣规则
         * Summary: 查询代扣规则
         */
        public async Task<ListContractPayruleResponse> ListContractPayruleAsync(ListContractPayruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContractPayruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询代扣规则
         * Summary: 查询代扣规则
         */
        public ListContractPayruleResponse ListContractPayruleEx(ListContractPayruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractPayruleResponse>(DoRequest("1.0", "twc.notary.contract.payrule.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询代扣规则
         * Summary: 查询代扣规则
         */
        public async Task<ListContractPayruleResponse> ListContractPayruleExAsync(ListContractPayruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractPayruleResponse>(await DoRequestAsync("1.0", "twc.notary.contract.payrule.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取可信付免签协议的二维码
         * Summary: 获取可信付免签协议的二维码
         */
        public CreateWithholdQrcodeResponse CreateWithholdQrcode(CreateWithholdQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWithholdQrcodeEx(request, headers, runtime);
        }

        /**
         * Description: 获取可信付免签协议的二维码
         * Summary: 获取可信付免签协议的二维码
         */
        public async Task<CreateWithholdQrcodeResponse> CreateWithholdQrcodeAsync(CreateWithholdQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWithholdQrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取可信付免签协议的二维码
         * Summary: 获取可信付免签协议的二维码
         */
        public CreateWithholdQrcodeResponse CreateWithholdQrcodeEx(CreateWithholdQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdQrcodeResponse>(DoRequest("1.0", "twc.notary.withhold.qrcode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取可信付免签协议的二维码
         * Summary: 获取可信付免签协议的二维码
         */
        public async Task<CreateWithholdQrcodeResponse> CreateWithholdQrcodeExAsync(CreateWithholdQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWithholdQrcodeResponse>(await DoRequestAsync("1.0", "twc.notary.withhold.qrcode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消某一期的代扣规则
         * Summary: 取消某一期的代扣规则
         */
        public CancelContractPaysingletradeResponse CancelContractPaysingletrade(CancelContractPaysingletradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelContractPaysingletradeEx(request, headers, runtime);
        }

        /**
         * Description: 取消某一期的代扣规则
         * Summary: 取消某一期的代扣规则
         */
        public async Task<CancelContractPaysingletradeResponse> CancelContractPaysingletradeAsync(CancelContractPaysingletradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelContractPaysingletradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消某一期的代扣规则
         * Summary: 取消某一期的代扣规则
         */
        public CancelContractPaysingletradeResponse CancelContractPaysingletradeEx(CancelContractPaysingletradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractPaysingletradeResponse>(DoRequest("1.0", "twc.notary.contract.paysingletrade.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消某一期的代扣规则
         * Summary: 取消某一期的代扣规则
         */
        public async Task<CancelContractPaysingletradeResponse> CancelContractPaysingletradeExAsync(CancelContractPaysingletradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractPaysingletradeResponse>(await DoRequestAsync("1.0", "twc.notary.contract.paysingletrade.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
         * Summary: 申请区块链合同回调加签key
         */
        public ApplyContractCallbackkeyResponse ApplyContractCallbackkey(ApplyContractCallbackkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyContractCallbackkeyEx(request, headers, runtime);
        }

        /**
         * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
         * Summary: 申请区块链合同回调加签key
         */
        public async Task<ApplyContractCallbackkeyResponse> ApplyContractCallbackkeyAsync(ApplyContractCallbackkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyContractCallbackkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
         * Summary: 申请区块链合同回调加签key
         */
        public ApplyContractCallbackkeyResponse ApplyContractCallbackkeyEx(ApplyContractCallbackkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractCallbackkeyResponse>(DoRequest("1.0", "twc.notary.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
         * Summary: 申请区块链合同回调加签key
         */
        public async Task<ApplyContractCallbackkeyResponse> ApplyContractCallbackkeyExAsync(ApplyContractCallbackkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractCallbackkeyResponse>(await DoRequestAsync("1.0", "twc.notary.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
         * Summary: 一步创建签署流程接口
         */
        public CreateContractOnestepflowResponse CreateContractOnestepflow(CreateContractOnestepflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractOnestepflowEx(request, headers, runtime);
        }

        /**
         * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
         * Summary: 一步创建签署流程接口
         */
        public async Task<CreateContractOnestepflowResponse> CreateContractOnestepflowAsync(CreateContractOnestepflowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractOnestepflowExAsync(request, headers, runtime);
        }

        /**
         * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
         * Summary: 一步创建签署流程接口
         */
        public CreateContractOnestepflowResponse CreateContractOnestepflowEx(CreateContractOnestepflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractOnestepflowResponse>(DoRequest("1.0", "twc.notary.contract.onestepflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
         * Summary: 一步创建签署流程接口
         */
        public async Task<CreateContractOnestepflowResponse> CreateContractOnestepflowExAsync(CreateContractOnestepflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractOnestepflowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.onestepflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过流程ID查询合同存证信息
         * Summary: 查询合同存证信息
         */
        public QueryContractNotaryResponse QueryContractNotary(QueryContractNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractNotaryEx(request, headers, runtime);
        }

        /**
         * Description: 通过流程ID查询合同存证信息
         * Summary: 查询合同存证信息
         */
        public async Task<QueryContractNotaryResponse> QueryContractNotaryAsync(QueryContractNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractNotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过流程ID查询合同存证信息
         * Summary: 查询合同存证信息
         */
        public QueryContractNotaryResponse QueryContractNotaryEx(QueryContractNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractNotaryResponse>(DoRequest("1.0", "twc.notary.contract.notary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过流程ID查询合同存证信息
         * Summary: 查询合同存证信息
         */
        public async Task<QueryContractNotaryResponse> QueryContractNotaryExAsync(QueryContractNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractNotaryResponse>(await DoRequestAsync("1.0", "twc.notary.contract.notary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合同存证事务ID
         * Summary: 获取合同存证事务ID
         */
        public CreateEcocontractTransResponse CreateEcocontractTrans(CreateEcocontractTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEcocontractTransEx(request, headers, runtime);
        }

        /**
         * Description: 获取合同存证事务ID
         * Summary: 获取合同存证事务ID
         */
        public async Task<CreateEcocontractTransResponse> CreateEcocontractTransAsync(CreateEcocontractTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEcocontractTransExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取合同存证事务ID
         * Summary: 获取合同存证事务ID
         */
        public CreateEcocontractTransResponse CreateEcocontractTransEx(CreateEcocontractTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEcocontractTransResponse>(DoRequest("1.0", "twc.notary.ecocontract.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合同存证事务ID
         * Summary: 获取合同存证事务ID
         */
        public async Task<CreateEcocontractTransResponse> CreateEcocontractTransExAsync(CreateEcocontractTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEcocontractTransResponse>(await DoRequestAsync("1.0", "twc.notary.ecocontract.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同文本存证
         * Summary: 合同文本存证
         */
        public CreateEcocontractTextResponse CreateEcocontractText(CreateEcocontractTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateEcocontractTextEx(request, headers, runtime);
        }

        /**
         * Description: 合同文本存证
         * Summary: 合同文本存证
         */
        public async Task<CreateEcocontractTextResponse> CreateEcocontractTextAsync(CreateEcocontractTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateEcocontractTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同文本存证
         * Summary: 合同文本存证
         */
        public CreateEcocontractTextResponse CreateEcocontractTextEx(CreateEcocontractTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEcocontractTextResponse>(DoRequest("1.0", "twc.notary.ecocontract.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同文本存证
         * Summary: 合同文本存证
         */
        public async Task<CreateEcocontractTextResponse> CreateEcocontractTextExAsync(CreateEcocontractTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateEcocontractTextResponse>(await DoRequestAsync("1.0", "twc.notary.ecocontract.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
         * Summary: 搜索关键字坐标
         */
        public QueryContractWordspositionResponse QueryContractWordsposition(QueryContractWordspositionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractWordspositionEx(request, headers, runtime);
        }

        /**
         * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
         * Summary: 搜索关键字坐标
         */
        public async Task<QueryContractWordspositionResponse> QueryContractWordspositionAsync(QueryContractWordspositionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractWordspositionExAsync(request, headers, runtime);
        }

        /**
         * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
         * Summary: 搜索关键字坐标
         */
        public QueryContractWordspositionResponse QueryContractWordspositionEx(QueryContractWordspositionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractWordspositionResponse>(DoRequest("1.0", "twc.notary.contract.wordsposition.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
         * Summary: 搜索关键字坐标
         */
        public async Task<QueryContractWordspositionResponse> QueryContractWordspositionExAsync(QueryContractWordspositionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractWordspositionResponse>(await DoRequestAsync("1.0", "twc.notary.contract.wordsposition.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行签署人删除逻辑
         * Summary: 删除签署人
         */
        public DeleteContractSignerResponse DeleteContractSigner(DeleteContractSignerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteContractSignerEx(request, headers, runtime);
        }

        /**
         * Description: 执行签署人删除逻辑
         * Summary: 删除签署人
         */
        public async Task<DeleteContractSignerResponse> DeleteContractSignerAsync(DeleteContractSignerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteContractSignerExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行签署人删除逻辑
         * Summary: 删除签署人
         */
        public DeleteContractSignerResponse DeleteContractSignerEx(DeleteContractSignerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContractSignerResponse>(DoRequest("1.0", "twc.notary.contract.signer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行签署人删除逻辑
         * Summary: 删除签署人
         */
        public async Task<DeleteContractSignerResponse> DeleteContractSignerExAsync(DeleteContractSignerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContractSignerResponse>(await DoRequestAsync("1.0", "twc.notary.contract.signer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取区块链合同存证证明
         * Summary: 获取区块链合同存证证明
         */
        public GetContractCertificateResponse GetContractCertificate(GetContractCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 获取区块链合同存证证明
         * Summary: 获取区块链合同存证证明
         */
        public async Task<GetContractCertificateResponse> GetContractCertificateAsync(GetContractCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取区块链合同存证证明
         * Summary: 获取区块链合同存证证明
         */
        public GetContractCertificateResponse GetContractCertificateEx(GetContractCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractCertificateResponse>(DoRequest("1.0", "twc.notary.contract.certificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取区块链合同存证证明
         * Summary: 获取区块链合同存证证明
         */
        public async Task<GetContractCertificateResponse> GetContractCertificateExAsync(GetContractCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractCertificateResponse>(await DoRequestAsync("1.0", "twc.notary.contract.certificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
         * Summary: 根据合同流程签署区查询已使用的印章id
         */
        public QueryContractSignfieldsealidResponse QueryContractSignfieldsealid(QueryContractSignfieldsealidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractSignfieldsealidEx(request, headers, runtime);
        }

        /**
         * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
         * Summary: 根据合同流程签署区查询已使用的印章id
         */
        public async Task<QueryContractSignfieldsealidResponse> QueryContractSignfieldsealidAsync(QueryContractSignfieldsealidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractSignfieldsealidExAsync(request, headers, runtime);
        }

        /**
         * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
         * Summary: 根据合同流程签署区查询已使用的印章id
         */
        public QueryContractSignfieldsealidResponse QueryContractSignfieldsealidEx(QueryContractSignfieldsealidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractSignfieldsealidResponse>(DoRequest("1.0", "twc.notary.contract.signfieldsealid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
         * Summary: 根据合同流程签署区查询已使用的印章id
         */
        public async Task<QueryContractSignfieldsealidResponse> QueryContractSignfieldsealidExAsync(QueryContractSignfieldsealidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractSignfieldsealidResponse>(await DoRequestAsync("1.0", "twc.notary.contract.signfieldsealid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
         * Summary: 通知签署方执行合同签署
         */
        public NotifyContractSignerResponse NotifyContractSigner(NotifyContractSignerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyContractSignerEx(request, headers, runtime);
        }

        /**
         * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
         * Summary: 通知签署方执行合同签署
         */
        public async Task<NotifyContractSignerResponse> NotifyContractSignerAsync(NotifyContractSignerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyContractSignerExAsync(request, headers, runtime);
        }

        /**
         * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
         * Summary: 通知签署方执行合同签署
         */
        public NotifyContractSignerResponse NotifyContractSignerEx(NotifyContractSignerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyContractSignerResponse>(DoRequest("1.0", "twc.notary.contract.signer.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
         * Summary: 通知签署方执行合同签署
         */
        public async Task<NotifyContractSignerResponse> NotifyContractSignerExAsync(NotifyContractSignerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyContractSignerResponse>(await DoRequestAsync("1.0", "twc.notary.contract.signer.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
         * Summary: 修改平台方注册信息
         */
        public UpdateContractPlatformResponse UpdateContractPlatform(UpdateContractPlatformRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContractPlatformEx(request, headers, runtime);
        }

        /**
         * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
         * Summary: 修改平台方注册信息
         */
        public async Task<UpdateContractPlatformResponse> UpdateContractPlatformAsync(UpdateContractPlatformRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContractPlatformExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
         * Summary: 修改平台方注册信息
         */
        public UpdateContractPlatformResponse UpdateContractPlatformEx(UpdateContractPlatformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContractPlatformResponse>(DoRequest("1.0", "twc.notary.contract.platform.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
         * Summary: 修改平台方注册信息
         */
        public async Task<UpdateContractPlatformResponse> UpdateContractPlatformExAsync(UpdateContractPlatformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContractPlatformResponse>(await DoRequestAsync("1.0", "twc.notary.contract.platform.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
         * Summary: 修改用户注册信息
         */
        public UpdateContractUserResponse UpdateContractUser(UpdateContractUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContractUserEx(request, headers, runtime);
        }

        /**
         * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
         * Summary: 修改用户注册信息
         */
        public async Task<UpdateContractUserResponse> UpdateContractUserAsync(UpdateContractUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContractUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
         * Summary: 修改用户注册信息
         */
        public UpdateContractUserResponse UpdateContractUserEx(UpdateContractUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContractUserResponse>(DoRequest("1.0", "twc.notary.contract.user.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
         * Summary: 修改用户注册信息
         */
        public async Task<UpdateContractUserResponse> UpdateContractUserExAsync(UpdateContractUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContractUserResponse>(await DoRequestAsync("1.0", "twc.notary.contract.user.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改  
         * Summary: 修改机构用户注册信息
         */
        public UpdateContractOrganizationResponse UpdateContractOrganization(UpdateContractOrganizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContractOrganizationEx(request, headers, runtime);
        }

        /**
         * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改  
         * Summary: 修改机构用户注册信息
         */
        public async Task<UpdateContractOrganizationResponse> UpdateContractOrganizationAsync(UpdateContractOrganizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContractOrganizationExAsync(request, headers, runtime);
        }

        /**
         * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改  
         * Summary: 修改机构用户注册信息
         */
        public UpdateContractOrganizationResponse UpdateContractOrganizationEx(UpdateContractOrganizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContractOrganizationResponse>(DoRequest("1.0", "twc.notary.contract.organization.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改  
         * Summary: 修改机构用户注册信息
         */
        public async Task<UpdateContractOrganizationResponse> UpdateContractOrganizationExAsync(UpdateContractOrganizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContractOrganizationResponse>(await DoRequestAsync("1.0", "twc.notary.contract.organization.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
         * Summary: 商户入驻直付通新接口
         */
        public ApplyContractMerchantResponse ApplyContractMerchant(ApplyContractMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyContractMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
         * Summary: 商户入驻直付通新接口
         */
        public async Task<ApplyContractMerchantResponse> ApplyContractMerchantAsync(ApplyContractMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyContractMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
         * Summary: 商户入驻直付通新接口
         */
        public ApplyContractMerchantResponse ApplyContractMerchantEx(ApplyContractMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractMerchantResponse>(DoRequest("1.0", "twc.notary.contract.merchant.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
         * Summary: 商户入驻直付通新接口
         */
        public async Task<ApplyContractMerchantResponse> ApplyContractMerchantExAsync(ApplyContractMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractMerchantResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchant.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
         * Summary: 直付通商户入驻确认
         */
        public ConfirmContractMerchantResponse ConfirmContractMerchant(ConfirmContractMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmContractMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
         * Summary: 直付通商户入驻确认
         */
        public async Task<ConfirmContractMerchantResponse> ConfirmContractMerchantAsync(ConfirmContractMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmContractMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
         * Summary: 直付通商户入驻确认
         */
        public ConfirmContractMerchantResponse ConfirmContractMerchantEx(ConfirmContractMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmContractMerchantResponse>(DoRequest("1.0", "twc.notary.contract.merchant.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 直付通商户入驻确认（确认成功则表明入驻成功）
         * Summary: 直付通商户入驻确认
         */
        public async Task<ConfirmContractMerchantResponse> ConfirmContractMerchantExAsync(ConfirmContractMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmContractMerchantResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchant.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建合同存证事务ID。私有云使用。
         * Summary: 创建合同存证事务ID。私有云使用。
         */
        public CreatePrivatecontractTransResponse CreatePrivatecontractTrans(CreatePrivatecontractTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePrivatecontractTransEx(request, headers, runtime);
        }

        /**
         * Description: 创建合同存证事务ID。私有云使用。
         * Summary: 创建合同存证事务ID。私有云使用。
         */
        public async Task<CreatePrivatecontractTransResponse> CreatePrivatecontractTransAsync(CreatePrivatecontractTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePrivatecontractTransExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建合同存证事务ID。私有云使用。
         * Summary: 创建合同存证事务ID。私有云使用。
         */
        public CreatePrivatecontractTransResponse CreatePrivatecontractTransEx(CreatePrivatecontractTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePrivatecontractTransResponse>(DoRequest("1.0", "twc.notary.privatecontract.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建合同存证事务ID。私有云使用。
         * Summary: 创建合同存证事务ID。私有云使用。
         */
        public async Task<CreatePrivatecontractTransResponse> CreatePrivatecontractTransExAsync(CreatePrivatecontractTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePrivatecontractTransResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同文本存证。私有云使用。
         * Summary: 合同文本存证。私有云使用。
         */
        public CreatePrivatecontractTextResponse CreatePrivatecontractText(CreatePrivatecontractTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePrivatecontractTextEx(request, headers, runtime);
        }

        /**
         * Description: 合同文本存证。私有云使用。
         * Summary: 合同文本存证。私有云使用。
         */
        public async Task<CreatePrivatecontractTextResponse> CreatePrivatecontractTextAsync(CreatePrivatecontractTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePrivatecontractTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同文本存证。私有云使用。
         * Summary: 合同文本存证。私有云使用。
         */
        public CreatePrivatecontractTextResponse CreatePrivatecontractTextEx(CreatePrivatecontractTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePrivatecontractTextResponse>(DoRequest("1.0", "twc.notary.privatecontract.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同文本存证。私有云使用。
         * Summary: 合同文本存证。私有云使用。
         */
        public async Task<CreatePrivatecontractTextResponse> CreatePrivatecontractTextExAsync(CreatePrivatecontractTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePrivatecontractTextResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人二要素校验
         * Summary: 个人二要素校验
         */
        public VerifyPrivatepersonTwometaResponse VerifyPrivatepersonTwometa(VerifyPrivatepersonTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyPrivatepersonTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 个人二要素校验
         * Summary: 个人二要素校验
         */
        public async Task<VerifyPrivatepersonTwometaResponse> VerifyPrivatepersonTwometaAsync(VerifyPrivatepersonTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyPrivatepersonTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人二要素校验
         * Summary: 个人二要素校验
         */
        public VerifyPrivatepersonTwometaResponse VerifyPrivatepersonTwometaEx(VerifyPrivatepersonTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyPrivatepersonTwometaResponse>(DoRequest("1.0", "twc.notary.privateperson.twometa.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人二要素校验
         * Summary: 个人二要素校验
         */
        public async Task<VerifyPrivatepersonTwometaResponse> VerifyPrivatepersonTwometaExAsync(VerifyPrivatepersonTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyPrivatepersonTwometaResponse>(await DoRequestAsync("1.0", "twc.notary.privateperson.twometa.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业二要素校验
         * Summary: 企业二要素校验
         */
        public VerifyPrivatecompanyTwometaResponse VerifyPrivatecompanyTwometa(VerifyPrivatecompanyTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyPrivatecompanyTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 企业二要素校验
         * Summary: 企业二要素校验
         */
        public async Task<VerifyPrivatecompanyTwometaResponse> VerifyPrivatecompanyTwometaAsync(VerifyPrivatecompanyTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyPrivatecompanyTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业二要素校验
         * Summary: 企业二要素校验
         */
        public VerifyPrivatecompanyTwometaResponse VerifyPrivatecompanyTwometaEx(VerifyPrivatecompanyTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyPrivatecompanyTwometaResponse>(DoRequest("1.0", "twc.notary.privatecompany.twometa.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业二要素校验
         * Summary: 企业二要素校验
         */
        public async Task<VerifyPrivatecompanyTwometaResponse> VerifyPrivatecompanyTwometaExAsync(VerifyPrivatecompanyTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyPrivatecompanyTwometaResponse>(await DoRequestAsync("1.0", "twc.notary.privatecompany.twometa.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业四要素校验
         * Summary: 企业四要素校验
         */
        public VerifyPrivatecompanyFourmetaResponse VerifyPrivatecompanyFourmeta(VerifyPrivatecompanyFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyPrivatecompanyFourmetaEx(request, headers, runtime);
        }

        /**
         * Description: 企业四要素校验
         * Summary: 企业四要素校验
         */
        public async Task<VerifyPrivatecompanyFourmetaResponse> VerifyPrivatecompanyFourmetaAsync(VerifyPrivatecompanyFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyPrivatecompanyFourmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业四要素校验
         * Summary: 企业四要素校验
         */
        public VerifyPrivatecompanyFourmetaResponse VerifyPrivatecompanyFourmetaEx(VerifyPrivatecompanyFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyPrivatecompanyFourmetaResponse>(DoRequest("1.0", "twc.notary.privatecompany.fourmeta.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业四要素校验
         * Summary: 企业四要素校验
         */
        public async Task<VerifyPrivatecompanyFourmetaResponse> VerifyPrivatecompanyFourmetaExAsync(VerifyPrivatecompanyFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyPrivatecompanyFourmetaResponse>(await DoRequestAsync("1.0", "twc.notary.privatecompany.fourmeta.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开放给私有云的外部用户的注册接口.
         * Summary: 私有云的外部用户注册接口.
         */
        public ApplyPrivatecontractCertResponse ApplyPrivatecontractCert(ApplyPrivatecontractCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyPrivatecontractCertEx(request, headers, runtime);
        }

        /**
         * Description: 开放给私有云的外部用户的注册接口.
         * Summary: 私有云的外部用户注册接口.
         */
        public async Task<ApplyPrivatecontractCertResponse> ApplyPrivatecontractCertAsync(ApplyPrivatecontractCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyPrivatecontractCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 开放给私有云的外部用户的注册接口.
         * Summary: 私有云的外部用户注册接口.
         */
        public ApplyPrivatecontractCertResponse ApplyPrivatecontractCertEx(ApplyPrivatecontractCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPrivatecontractCertResponse>(DoRequest("1.0", "twc.notary.privatecontract.cert.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开放给私有云的外部用户的注册接口.
         * Summary: 私有云的外部用户注册接口.
         */
        public async Task<ApplyPrivatecontractCertResponse> ApplyPrivatecontractCertExAsync(ApplyPrivatecontractCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyPrivatecontractCertResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.cert.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
         * Summary: 代扣计划状态查询
         */
        public QueryContractTradestatusResponse QueryContractTradestatus(QueryContractTradestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractTradestatusEx(request, headers, runtime);
        }

        /**
         * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
         * Summary: 代扣计划状态查询
         */
        public async Task<QueryContractTradestatusResponse> QueryContractTradestatusAsync(QueryContractTradestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractTradestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
         * Summary: 代扣计划状态查询
         */
        public QueryContractTradestatusResponse QueryContractTradestatusEx(QueryContractTradestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTradestatusResponse>(DoRequest("1.0", "twc.notary.contract.tradestatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
         * Summary: 代扣计划状态查询
         */
        public async Task<QueryContractTradestatusResponse> QueryContractTradestatusExAsync(QueryContractTradestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTradestatusResponse>(await DoRequestAsync("1.0", "twc.notary.contract.tradestatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
         * Summary: 代扣退款查询
         */
        public QueryContractRefundResponse QueryContractRefund(QueryContractRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractRefundEx(request, headers, runtime);
        }

        /**
         * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
         * Summary: 代扣退款查询
         */
        public async Task<QueryContractRefundResponse> QueryContractRefundAsync(QueryContractRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
         * Summary: 代扣退款查询
         */
        public QueryContractRefundResponse QueryContractRefundEx(QueryContractRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractRefundResponse>(DoRequest("1.0", "twc.notary.contract.refund.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
         * Summary: 代扣退款查询
         */
        public async Task<QueryContractRefundResponse> QueryContractRefundExAsync(QueryContractRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractRefundResponse>(await DoRequestAsync("1.0", "twc.notary.contract.refund.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
         * Summary: 私有云服务获取外部用户签署地址
         */
        public GetPrivatecontractSignurlResponse GetPrivatecontractSignurl(GetPrivatecontractSignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPrivatecontractSignurlEx(request, headers, runtime);
        }

        /**
         * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
         * Summary: 私有云服务获取外部用户签署地址
         */
        public async Task<GetPrivatecontractSignurlResponse> GetPrivatecontractSignurlAsync(GetPrivatecontractSignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPrivatecontractSignurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
         * Summary: 私有云服务获取外部用户签署地址
         */
        public GetPrivatecontractSignurlResponse GetPrivatecontractSignurlEx(GetPrivatecontractSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPrivatecontractSignurlResponse>(DoRequest("1.0", "twc.notary.privatecontract.signurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
         * Summary: 私有云服务获取外部用户签署地址
         */
        public async Task<GetPrivatecontractSignurlResponse> GetPrivatecontractSignurlExAsync(GetPrivatecontractSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPrivatecontractSignurlResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.signurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
         * Summary: 商户入驻直付通进度查询
         */
        public QueryContractMerchantorderResponse QueryContractMerchantorder(QueryContractMerchantorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractMerchantorderEx(request, headers, runtime);
        }

        /**
         * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
         * Summary: 商户入驻直付通进度查询
         */
        public async Task<QueryContractMerchantorderResponse> QueryContractMerchantorderAsync(QueryContractMerchantorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractMerchantorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
         * Summary: 商户入驻直付通进度查询
         */
        public QueryContractMerchantorderResponse QueryContractMerchantorderEx(QueryContractMerchantorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractMerchantorderResponse>(DoRequest("1.0", "twc.notary.contract.merchantorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
         * Summary: 商户入驻直付通进度查询
         */
        public async Task<QueryContractMerchantorderResponse> QueryContractMerchantorderExAsync(QueryContractMerchantorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractMerchantorderResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchantorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
         * Summary: 商户进件信息修改
         */
        public UpdateContractMerchantResponse UpdateContractMerchant(UpdateContractMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContractMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
         * Summary: 商户进件信息修改
         */
        public async Task<UpdateContractMerchantResponse> UpdateContractMerchantAsync(UpdateContractMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContractMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
         * Summary: 商户进件信息修改
         */
        public UpdateContractMerchantResponse UpdateContractMerchantEx(UpdateContractMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContractMerchantResponse>(DoRequest("1.0", "twc.notary.contract.merchant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
         * Summary: 商户进件信息修改
         */
        public async Task<UpdateContractMerchantResponse> UpdateContractMerchantExAsync(UpdateContractMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContractMerchantResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
         * Summary: 二级商户代理挂接接口
         */
        public BindContractMerchantResponse BindContractMerchant(BindContractMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindContractMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
         * Summary: 二级商户代理挂接接口
         */
        public async Task<BindContractMerchantResponse> BindContractMerchantAsync(BindContractMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindContractMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
         * Summary: 二级商户代理挂接接口
         */
        public BindContractMerchantResponse BindContractMerchantEx(BindContractMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindContractMerchantResponse>(DoRequest("1.0", "twc.notary.contract.merchant.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
         * Summary: 二级商户代理挂接接口
         */
        public async Task<BindContractMerchantResponse> BindContractMerchantExAsync(BindContractMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindContractMerchantResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchant.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
         * Summary: 初始化新的私有化合同服务实例
         */
        public InitPrivatecontractIntanceResponse InitPrivatecontractIntance(InitPrivatecontractIntanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitPrivatecontractIntanceEx(request, headers, runtime);
        }

        /**
         * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
         * Summary: 初始化新的私有化合同服务实例
         */
        public async Task<InitPrivatecontractIntanceResponse> InitPrivatecontractIntanceAsync(InitPrivatecontractIntanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitPrivatecontractIntanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
         * Summary: 初始化新的私有化合同服务实例
         */
        public InitPrivatecontractIntanceResponse InitPrivatecontractIntanceEx(InitPrivatecontractIntanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitPrivatecontractIntanceResponse>(DoRequest("1.0", "twc.notary.privatecontract.intance.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
         * Summary: 初始化新的私有化合同服务实例
         */
        public async Task<InitPrivatecontractIntanceResponse> InitPrivatecontractIntanceExAsync(InitPrivatecontractIntanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitPrivatecontractIntanceResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.intance.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
         * Summary: 更新私有化合同服务实例信息
         */
        public UpdatePrivatecontractIntanceResponse UpdatePrivatecontractIntance(UpdatePrivatecontractIntanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdatePrivatecontractIntanceEx(request, headers, runtime);
        }

        /**
         * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
         * Summary: 更新私有化合同服务实例信息
         */
        public async Task<UpdatePrivatecontractIntanceResponse> UpdatePrivatecontractIntanceAsync(UpdatePrivatecontractIntanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdatePrivatecontractIntanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
         * Summary: 更新私有化合同服务实例信息
         */
        public UpdatePrivatecontractIntanceResponse UpdatePrivatecontractIntanceEx(UpdatePrivatecontractIntanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdatePrivatecontractIntanceResponse>(DoRequest("1.0", "twc.notary.privatecontract.intance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
         * Summary: 更新私有化合同服务实例信息
         */
        public async Task<UpdatePrivatecontractIntanceResponse> UpdatePrivatecontractIntanceExAsync(UpdatePrivatecontractIntanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdatePrivatecontractIntanceResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.intance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开放给私有云的外部用户的证书更新接口.
         * Summary: 私有云用户证书更新接口.
         */
        public UpdatePrivatecontractCertResponse UpdatePrivatecontractCert(UpdatePrivatecontractCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdatePrivatecontractCertEx(request, headers, runtime);
        }

        /**
         * Description: 开放给私有云的外部用户的证书更新接口.
         * Summary: 私有云用户证书更新接口.
         */
        public async Task<UpdatePrivatecontractCertResponse> UpdatePrivatecontractCertAsync(UpdatePrivatecontractCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdatePrivatecontractCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 开放给私有云的外部用户的证书更新接口.
         * Summary: 私有云用户证书更新接口.
         */
        public UpdatePrivatecontractCertResponse UpdatePrivatecontractCertEx(UpdatePrivatecontractCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdatePrivatecontractCertResponse>(DoRequest("1.0", "twc.notary.privatecontract.cert.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开放给私有云的外部用户的证书更新接口.
         * Summary: 私有云用户证书更新接口.
         */
        public async Task<UpdatePrivatecontractCertResponse> UpdatePrivatecontractCertExAsync(UpdatePrivatecontractCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdatePrivatecontractCertResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.cert.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
         * Summary: 商户进件申请信息重置
         */
        public ResetContractMerchantapplyResponse ResetContractMerchantapply(ResetContractMerchantapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetContractMerchantapplyEx(request, headers, runtime);
        }

        /**
         * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
         * Summary: 商户进件申请信息重置
         */
        public async Task<ResetContractMerchantapplyResponse> ResetContractMerchantapplyAsync(ResetContractMerchantapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetContractMerchantapplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
         * Summary: 商户进件申请信息重置
         */
        public ResetContractMerchantapplyResponse ResetContractMerchantapplyEx(ResetContractMerchantapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetContractMerchantapplyResponse>(DoRequest("1.0", "twc.notary.contract.merchantapply.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改商户进件申请信息状态数据，只允许超管租户操作
         * Summary: 商户进件申请信息重置
         */
        public async Task<ResetContractMerchantapplyResponse> ResetContractMerchantapplyExAsync(ResetContractMerchantapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetContractMerchantapplyResponse>(await DoRequestAsync("1.0", "twc.notary.contract.merchantapply.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
         * Summary: 校验私有化合同服务实例权限情况
         */
        public CheckPrivatecontractProvisionResponse CheckPrivatecontractProvision(CheckPrivatecontractProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckPrivatecontractProvisionEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
         * Summary: 校验私有化合同服务实例权限情况
         */
        public async Task<CheckPrivatecontractProvisionResponse> CheckPrivatecontractProvisionAsync(CheckPrivatecontractProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckPrivatecontractProvisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
         * Summary: 校验私有化合同服务实例权限情况
         */
        public CheckPrivatecontractProvisionResponse CheckPrivatecontractProvisionEx(CheckPrivatecontractProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPrivatecontractProvisionResponse>(DoRequest("1.0", "twc.notary.privatecontract.provision.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
         * Summary: 校验私有化合同服务实例权限情况
         */
        public async Task<CheckPrivatecontractProvisionResponse> CheckPrivatecontractProvisionExAsync(CheckPrivatecontractProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPrivatecontractProvisionResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.provision.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化合同服务实例计量数据推送
         * Summary: 私有化合同服务实例计量数据推送
         */
        public PushPrivatecontractGaugeResponse PushPrivatecontractGauge(PushPrivatecontractGaugeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushPrivatecontractGaugeEx(request, headers, runtime);
        }

        /**
         * Description: 私有化合同服务实例计量数据推送
         * Summary: 私有化合同服务实例计量数据推送
         */
        public async Task<PushPrivatecontractGaugeResponse> PushPrivatecontractGaugeAsync(PushPrivatecontractGaugeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushPrivatecontractGaugeExAsync(request, headers, runtime);
        }

        /**
         * Description: 私有化合同服务实例计量数据推送
         * Summary: 私有化合同服务实例计量数据推送
         */
        public PushPrivatecontractGaugeResponse PushPrivatecontractGaugeEx(PushPrivatecontractGaugeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushPrivatecontractGaugeResponse>(DoRequest("1.0", "twc.notary.privatecontract.gauge.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化合同服务实例计量数据推送
         * Summary: 私有化合同服务实例计量数据推送
         */
        public async Task<PushPrivatecontractGaugeResponse> PushPrivatecontractGaugeExAsync(PushPrivatecontractGaugeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushPrivatecontractGaugeResponse>(await DoRequestAsync("1.0", "twc.notary.privatecontract.gauge.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
         * Summary: 法院代扣账户扣款预校验
         */
        public CheckContractCourtdeductResponse CheckContractCourtdeduct(CheckContractCourtdeductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckContractCourtdeductEx(request, headers, runtime);
        }

        /**
         * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
         * Summary: 法院代扣账户扣款预校验
         */
        public async Task<CheckContractCourtdeductResponse> CheckContractCourtdeductAsync(CheckContractCourtdeductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckContractCourtdeductExAsync(request, headers, runtime);
        }

        /**
         * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
         * Summary: 法院代扣账户扣款预校验
         */
        public CheckContractCourtdeductResponse CheckContractCourtdeductEx(CheckContractCourtdeductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckContractCourtdeductResponse>(DoRequest("1.0", "twc.notary.contract.courtdeduct.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
         * Summary: 法院代扣账户扣款预校验
         */
        public async Task<CheckContractCourtdeductResponse> CheckContractCourtdeductExAsync(CheckContractCourtdeductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckContractCourtdeductResponse>(await DoRequestAsync("1.0", "twc.notary.contract.courtdeduct.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法院代扣计划创建
         * Summary: 法院代扣计划创建
         */
        public CreateContractCourtdeductResponse CreateContractCourtdeduct(CreateContractCourtdeductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractCourtdeductEx(request, headers, runtime);
        }

        /**
         * Description: 法院代扣计划创建
         * Summary: 法院代扣计划创建
         */
        public async Task<CreateContractCourtdeductResponse> CreateContractCourtdeductAsync(CreateContractCourtdeductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractCourtdeductExAsync(request, headers, runtime);
        }

        /**
         * Description: 法院代扣计划创建
         * Summary: 法院代扣计划创建
         */
        public CreateContractCourtdeductResponse CreateContractCourtdeductEx(CreateContractCourtdeductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractCourtdeductResponse>(DoRequest("1.0", "twc.notary.contract.courtdeduct.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法院代扣计划创建
         * Summary: 法院代扣计划创建
         */
        public async Task<CreateContractCourtdeductResponse> CreateContractCourtdeductExAsync(CreateContractCourtdeductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractCourtdeductResponse>(await DoRequestAsync("1.0", "twc.notary.contract.courtdeduct.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法院代扣执行扣款
         * Summary: 法院代扣执行扣款
         */
        public ExecContractCourtdeductResponse ExecContractCourtdeduct(ExecContractCourtdeductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractCourtdeductEx(request, headers, runtime);
        }

        /**
         * Description: 法院代扣执行扣款
         * Summary: 法院代扣执行扣款
         */
        public async Task<ExecContractCourtdeductResponse> ExecContractCourtdeductAsync(ExecContractCourtdeductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractCourtdeductExAsync(request, headers, runtime);
        }

        /**
         * Description: 法院代扣执行扣款
         * Summary: 法院代扣执行扣款
         */
        public ExecContractCourtdeductResponse ExecContractCourtdeductEx(ExecContractCourtdeductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractCourtdeductResponse>(DoRequest("1.0", "twc.notary.contract.courtdeduct.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法院代扣执行扣款
         * Summary: 法院代扣执行扣款
         */
        public async Task<ExecContractCourtdeductResponse> ExecContractCourtdeductExAsync(ExecContractCourtdeductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractCourtdeductResponse>(await DoRequestAsync("1.0", "twc.notary.contract.courtdeduct.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本签名
         * Summary: 文本签接口
         */
        public GetContractTextsignResponse GetContractTextsign(GetContractTextsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractTextsignEx(request, headers, runtime);
        }

        /**
         * Description: 文本签名
         * Summary: 文本签接口
         */
        public async Task<GetContractTextsignResponse> GetContractTextsignAsync(GetContractTextsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractTextsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本签名
         * Summary: 文本签接口
         */
        public GetContractTextsignResponse GetContractTextsignEx(GetContractTextsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractTextsignResponse>(DoRequest("1.0", "twc.notary.contract.textsign.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本签名
         * Summary: 文本签接口
         */
        public async Task<GetContractTextsignResponse> GetContractTextsignExAsync(GetContractTextsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractTextsignResponse>(await DoRequestAsync("1.0", "twc.notary.contract.textsign.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本验签
         * Summary: 文本验签接口
         */
        public VerifyContractTextsignResponse VerifyContractTextsign(VerifyContractTextsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyContractTextsignEx(request, headers, runtime);
        }

        /**
         * Description: 文本验签
         * Summary: 文本验签接口
         */
        public async Task<VerifyContractTextsignResponse> VerifyContractTextsignAsync(VerifyContractTextsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyContractTextsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本验签
         * Summary: 文本验签接口
         */
        public VerifyContractTextsignResponse VerifyContractTextsignEx(VerifyContractTextsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyContractTextsignResponse>(DoRequest("1.0", "twc.notary.contract.textsign.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本验签
         * Summary: 文本验签接口
         */
        public async Task<VerifyContractTextsignResponse> VerifyContractTextsignExAsync(VerifyContractTextsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyContractTextsignResponse>(await DoRequestAsync("1.0", "twc.notary.contract.textsign.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件签验签
         * Summary: 文件签验签
         */
        public VerifyContractDocsignResponse VerifyContractDocsign(VerifyContractDocsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyContractDocsignEx(request, headers, runtime);
        }

        /**
         * Description: 文件签验签
         * Summary: 文件签验签
         */
        public async Task<VerifyContractDocsignResponse> VerifyContractDocsignAsync(VerifyContractDocsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyContractDocsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件签验签
         * Summary: 文件签验签
         */
        public VerifyContractDocsignResponse VerifyContractDocsignEx(VerifyContractDocsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyContractDocsignResponse>(DoRequest("1.0", "twc.notary.contract.docsign.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件签验签
         * Summary: 文件签验签
         */
        public async Task<VerifyContractDocsignResponse> VerifyContractDocsignExAsync(VerifyContractDocsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyContractDocsignResponse>(await DoRequestAsync("1.0", "twc.notary.contract.docsign.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除签署区
         * Summary: 删除签署区
         */
        public DeleteContractSignfieldResponse DeleteContractSignfield(DeleteContractSignfieldRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteContractSignfieldEx(request, headers, runtime);
        }

        /**
         * Description: 删除签署区
         * Summary: 删除签署区
         */
        public async Task<DeleteContractSignfieldResponse> DeleteContractSignfieldAsync(DeleteContractSignfieldRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteContractSignfieldExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除签署区
         * Summary: 删除签署区
         */
        public DeleteContractSignfieldResponse DeleteContractSignfieldEx(DeleteContractSignfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContractSignfieldResponse>(DoRequest("1.0", "twc.notary.contract.signfield.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除签署区
         * Summary: 删除签署区
         */
        public async Task<DeleteContractSignfieldResponse> DeleteContractSignfieldExAsync(DeleteContractSignfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContractSignfieldResponse>(await DoRequestAsync("1.0", "twc.notary.contract.signfield.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建平台方用户接口twc.notary.contract.user.create加密版
         * Summary: 创建平台方用户加密版
         */
        public CreateContractEncrypteduserResponse CreateContractEncrypteduser(CreateContractEncrypteduserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractEncrypteduserEx(request, headers, runtime);
        }

        /**
         * Description: 创建平台方用户接口twc.notary.contract.user.create加密版
         * Summary: 创建平台方用户加密版
         */
        public async Task<CreateContractEncrypteduserResponse> CreateContractEncrypteduserAsync(CreateContractEncrypteduserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractEncrypteduserExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建平台方用户接口twc.notary.contract.user.create加密版
         * Summary: 创建平台方用户加密版
         */
        public CreateContractEncrypteduserResponse CreateContractEncrypteduserEx(CreateContractEncrypteduserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractEncrypteduserResponse>(DoRequest("1.0", "twc.notary.contract.encrypteduser.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建平台方用户接口twc.notary.contract.user.create加密版
         * Summary: 创建平台方用户加密版
         */
        public async Task<CreateContractEncrypteduserResponse> CreateContractEncrypteduserExAsync(CreateContractEncrypteduserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractEncrypteduserResponse>(await DoRequestAsync("1.0", "twc.notary.contract.encrypteduser.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
         * Summary: 用户密钥设置接口
         */
        public SetContractTenantkeyResponse SetContractTenantkey(SetContractTenantkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetContractTenantkeyEx(request, headers, runtime);
        }

        /**
         * Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
         * Summary: 用户密钥设置接口
         */
        public async Task<SetContractTenantkeyResponse> SetContractTenantkeyAsync(SetContractTenantkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetContractTenantkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
         * Summary: 用户密钥设置接口
         */
        public SetContractTenantkeyResponse SetContractTenantkeyEx(SetContractTenantkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetContractTenantkeyResponse>(DoRequest("1.0", "twc.notary.contract.tenantkey.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
         * Summary: 用户密钥设置接口
         */
        public async Task<SetContractTenantkeyResponse> SetContractTenantkeyExAsync(SetContractTenantkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetContractTenantkeyResponse>(await DoRequestAsync("1.0", "twc.notary.contract.tenantkey.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取加密文件上传链接
         * Summary: 获取加密文件上传链接
         */
        public GetContractEncryptedfileuploadurlResponse GetContractEncryptedfileuploadurl(GetContractEncryptedfileuploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractEncryptedfileuploadurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取加密文件上传链接
         * Summary: 获取加密文件上传链接
         */
        public async Task<GetContractEncryptedfileuploadurlResponse> GetContractEncryptedfileuploadurlAsync(GetContractEncryptedfileuploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractEncryptedfileuploadurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取加密文件上传链接
         * Summary: 获取加密文件上传链接
         */
        public GetContractEncryptedfileuploadurlResponse GetContractEncryptedfileuploadurlEx(GetContractEncryptedfileuploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractEncryptedfileuploadurlResponse>(DoRequest("1.0", "twc.notary.contract.encryptedfileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取加密文件上传链接
         * Summary: 获取加密文件上传链接
         */
        public async Task<GetContractEncryptedfileuploadurlResponse> GetContractEncryptedfileuploadurlExAsync(GetContractEncryptedfileuploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractEncryptedfileuploadurlResponse>(await DoRequestAsync("1.0", "twc.notary.contract.encryptedfileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建异步任务
         * Summary: 创建任务接口
         */
        public CreateContractTaskResponse CreateContractTask(CreateContractTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractTaskEx(request, headers, runtime);
        }

        /**
         * Description: 创建异步任务
         * Summary: 创建任务接口
         */
        public async Task<CreateContractTaskResponse> CreateContractTaskAsync(CreateContractTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建异步任务
         * Summary: 创建任务接口
         */
        public CreateContractTaskResponse CreateContractTaskEx(CreateContractTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractTaskResponse>(DoRequest("1.0", "twc.notary.contract.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建异步任务
         * Summary: 创建任务接口
         */
        public async Task<CreateContractTaskResponse> CreateContractTaskExAsync(CreateContractTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractTaskResponse>(await DoRequestAsync("1.0", "twc.notary.contract.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 任务查询接口
         * Summary: 任务查询
         */
        public QueryContractTaskResponse QueryContractTask(QueryContractTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractTaskEx(request, headers, runtime);
        }

        /**
         * Description: 任务查询接口
         * Summary: 任务查询
         */
        public async Task<QueryContractTaskResponse> QueryContractTaskAsync(QueryContractTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 任务查询接口
         * Summary: 任务查询
         */
        public QueryContractTaskResponse QueryContractTaskEx(QueryContractTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTaskResponse>(DoRequest("1.0", "twc.notary.contract.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 任务查询接口
         * Summary: 任务查询
         */
        public async Task<QueryContractTaskResponse> QueryContractTaskExAsync(QueryContractTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractTaskResponse>(await DoRequestAsync("1.0", "twc.notary.contract.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
         * Summary: 合同代扣触发接口
         */
        public ExecContractPayResponse ExecContractPay(ExecContractPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractPayEx(request, headers, runtime);
        }

        /**
         * Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
         * Summary: 合同代扣触发接口
         */
        public async Task<ExecContractPayResponse> ExecContractPayAsync(ExecContractPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractPayExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
         * Summary: 合同代扣触发接口
         */
        public ExecContractPayResponse ExecContractPayEx(ExecContractPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractPayResponse>(DoRequest("1.0", "twc.notary.contract.pay.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
         * Summary: 合同代扣触发接口
         */
        public async Task<ExecContractPayResponse> ExecContractPayExAsync(ExecContractPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractPayResponse>(await DoRequestAsync("1.0", "twc.notary.contract.pay.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
         * Summary: 代扣强制解约
         */
        public UnbindContractPayResponse UnbindContractPay(UnbindContractPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindContractPayEx(request, headers, runtime);
        }

        /**
         * Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
         * Summary: 代扣强制解约
         */
        public async Task<UnbindContractPayResponse> UnbindContractPayAsync(UnbindContractPayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindContractPayExAsync(request, headers, runtime);
        }

        /**
         * Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
         * Summary: 代扣强制解约
         */
        public UnbindContractPayResponse UnbindContractPayEx(UnbindContractPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindContractPayResponse>(DoRequest("1.0", "twc.notary.contract.pay.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
         * Summary: 代扣强制解约
         */
        public async Task<UnbindContractPayResponse> UnbindContractPayExAsync(UnbindContractPayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindContractPayResponse>(await DoRequestAsync("1.0", "twc.notary.contract.pay.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
         * Summary: 投诉数据查询
         */
        public QueryContractComplainResponse QueryContractComplain(QueryContractComplainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractComplainEx(request, headers, runtime);
        }

        /**
         * Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
         * Summary: 投诉数据查询
         */
        public async Task<QueryContractComplainResponse> QueryContractComplainAsync(QueryContractComplainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractComplainExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
         * Summary: 投诉数据查询
         */
        public QueryContractComplainResponse QueryContractComplainEx(QueryContractComplainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractComplainResponse>(DoRequest("1.0", "twc.notary.contract.complain.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
         * Summary: 投诉数据查询
         */
        public async Task<QueryContractComplainResponse> QueryContractComplainExAsync(QueryContractComplainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractComplainResponse>(await DoRequestAsync("1.0", "twc.notary.contract.complain.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
         * Summary: 投诉反馈
         */
        public SendContractComplainfeedbackResponse SendContractComplainfeedback(SendContractComplainfeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendContractComplainfeedbackEx(request, headers, runtime);
        }

        /**
         * Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
         * Summary: 投诉反馈
         */
        public async Task<SendContractComplainfeedbackResponse> SendContractComplainfeedbackAsync(SendContractComplainfeedbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendContractComplainfeedbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
         * Summary: 投诉反馈
         */
        public SendContractComplainfeedbackResponse SendContractComplainfeedbackEx(SendContractComplainfeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendContractComplainfeedbackResponse>(DoRequest("1.0", "twc.notary.contract.complainfeedback.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
         * Summary: 投诉反馈
         */
        public async Task<SendContractComplainfeedbackResponse> SendContractComplainfeedbackExAsync(SendContractComplainfeedbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendContractComplainfeedbackResponse>(await DoRequestAsync("1.0", "twc.notary.contract.complainfeedback.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户上传处理图片
         * Summary: 商户上传处理图片
         */
        public UploadContractComplainimageResponse UploadContractComplainimage(UploadContractComplainimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadContractComplainimageEx(request, headers, runtime);
        }

        /**
         * Description: 商户上传处理图片
         * Summary: 商户上传处理图片
         */
        public async Task<UploadContractComplainimageResponse> UploadContractComplainimageAsync(UploadContractComplainimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadContractComplainimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户上传处理图片
         * Summary: 商户上传处理图片
         */
        public UploadContractComplainimageResponse UploadContractComplainimageEx(UploadContractComplainimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadContractComplainimageResponse>(DoRequest("1.0", "twc.notary.contract.complainimage.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户上传处理图片
         * Summary: 商户上传处理图片
         */
        public async Task<UploadContractComplainimageResponse> UploadContractComplainimageExAsync(UploadContractComplainimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadContractComplainimageResponse>(await DoRequestAsync("1.0", "twc.notary.contract.complainimage.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据起止日期查询体验宝投诉工单
         * Summary: 根据起止日期查询体验宝投诉工单
         */
        public QueryContractComplaineventidsResponse QueryContractComplaineventids(QueryContractComplaineventidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractComplaineventidsEx(request, headers, runtime);
        }

        /**
         * Description: 根据起止日期查询体验宝投诉工单
         * Summary: 根据起止日期查询体验宝投诉工单
         */
        public async Task<QueryContractComplaineventidsResponse> QueryContractComplaineventidsAsync(QueryContractComplaineventidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractComplaineventidsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据起止日期查询体验宝投诉工单
         * Summary: 根据起止日期查询体验宝投诉工单
         */
        public QueryContractComplaineventidsResponse QueryContractComplaineventidsEx(QueryContractComplaineventidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractComplaineventidsResponse>(DoRequest("1.0", "twc.notary.contract.complaineventids.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据起止日期查询体验宝投诉工单
         * Summary: 根据起止日期查询体验宝投诉工单
         */
        public async Task<QueryContractComplaineventidsResponse> QueryContractComplaineventidsExAsync(QueryContractComplaineventidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractComplaineventidsResponse>(await DoRequestAsync("1.0", "twc.notary.contract.complaineventids.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对ato等系统提供区块链合同签署流程撤销能力
         * Summary: 区块链合同签署流程撤销
         */
        public CancelContractFlowResponse CancelContractFlow(CancelContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelContractFlowEx(request, headers, runtime);
        }

        /**
         * Description: 对ato等系统提供区块链合同签署流程撤销能力
         * Summary: 区块链合同签署流程撤销
         */
        public async Task<CancelContractFlowResponse> CancelContractFlowAsync(CancelContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelContractFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 对ato等系统提供区块链合同签署流程撤销能力
         * Summary: 区块链合同签署流程撤销
         */
        public CancelContractFlowResponse CancelContractFlowEx(CancelContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractFlowResponse>(DoRequest("1.0", "twc.notary.contract.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对ato等系统提供区块链合同签署流程撤销能力
         * Summary: 区块链合同签署流程撤销
         */
        public async Task<CancelContractFlowResponse> CancelContractFlowExAsync(CancelContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelContractFlowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转化短链接
         * Summary: 转化短链接
         */
        public TransferGeneralShortenurlResponse TransferGeneralShortenurl(TransferGeneralShortenurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TransferGeneralShortenurlEx(request, headers, runtime);
        }

        /**
         * Description: 转化短链接
         * Summary: 转化短链接
         */
        public async Task<TransferGeneralShortenurlResponse> TransferGeneralShortenurlAsync(TransferGeneralShortenurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TransferGeneralShortenurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 转化短链接
         * Summary: 转化短链接
         */
        public TransferGeneralShortenurlResponse TransferGeneralShortenurlEx(TransferGeneralShortenurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferGeneralShortenurlResponse>(DoRequest("1.0", "twc.notary.general.shortenurl.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转化短链接
         * Summary: 转化短链接
         */
        public async Task<TransferGeneralShortenurlResponse> TransferGeneralShortenurlExAsync(TransferGeneralShortenurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferGeneralShortenurlResponse>(await DoRequestAsync("1.0", "twc.notary.general.shortenurl.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 触发合同提交归档
         * Summary: 合同提交归档
         */
        public SubmitContractArchiveResponse SubmitContractArchive(SubmitContractArchiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitContractArchiveEx(request, headers, runtime);
        }

        /**
         * Description: 触发合同提交归档
         * Summary: 合同提交归档
         */
        public async Task<SubmitContractArchiveResponse> SubmitContractArchiveAsync(SubmitContractArchiveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitContractArchiveExAsync(request, headers, runtime);
        }

        /**
         * Description: 触发合同提交归档
         * Summary: 合同提交归档
         */
        public SubmitContractArchiveResponse SubmitContractArchiveEx(SubmitContractArchiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitContractArchiveResponse>(DoRequest("1.0", "twc.notary.contract.archive.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 触发合同提交归档
         * Summary: 合同提交归档
         */
        public async Task<SubmitContractArchiveResponse> SubmitContractArchiveExAsync(SubmitContractArchiveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitContractArchiveResponse>(await DoRequestAsync("1.0", "twc.notary.contract.archive.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链合同代扣订单列表
         * Summary: 代扣订单列表
         */
        public ListContractDeductorderResponse ListContractDeductorder(ListContractDeductorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContractDeductorderEx(request, headers, runtime);
        }

        /**
         * Description: 区块链合同代扣订单列表
         * Summary: 代扣订单列表
         */
        public async Task<ListContractDeductorderResponse> ListContractDeductorderAsync(ListContractDeductorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContractDeductorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 区块链合同代扣订单列表
         * Summary: 代扣订单列表
         */
        public ListContractDeductorderResponse ListContractDeductorderEx(ListContractDeductorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractDeductorderResponse>(DoRequest("1.0", "twc.notary.contract.deductorder.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链合同代扣订单列表
         * Summary: 代扣订单列表
         */
        public async Task<ListContractDeductorderResponse> ListContractDeductorderExAsync(ListContractDeductorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractDeductorderResponse>(await DoRequestAsync("1.0", "twc.notary.contract.deductorder.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣订单详情
         * Summary: 代扣订单详情
         */
        public QueryContractDeductdetailResponse QueryContractDeductdetail(QueryContractDeductdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractDeductdetailEx(request, headers, runtime);
        }

        /**
         * Description: 代扣订单详情
         * Summary: 代扣订单详情
         */
        public async Task<QueryContractDeductdetailResponse> QueryContractDeductdetailAsync(QueryContractDeductdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractDeductdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣订单详情
         * Summary: 代扣订单详情
         */
        public QueryContractDeductdetailResponse QueryContractDeductdetailEx(QueryContractDeductdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractDeductdetailResponse>(DoRequest("1.0", "twc.notary.contract.deductdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣订单详情
         * Summary: 代扣订单详情
         */
        public async Task<QueryContractDeductdetailResponse> QueryContractDeductdetailExAsync(QueryContractDeductdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractDeductdetailResponse>(await DoRequestAsync("1.0", "twc.notary.contract.deductdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据支付宝商家订单号查询交易单
         * Summary: 根据交易号查询订单
         */
        public QueryContractDedcutpayinfoResponse QueryContractDedcutpayinfo(QueryContractDedcutpayinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractDedcutpayinfoEx(request, headers, runtime);
        }

        /**
         * Description: 根据支付宝商家订单号查询交易单
         * Summary: 根据交易号查询订单
         */
        public async Task<QueryContractDedcutpayinfoResponse> QueryContractDedcutpayinfoAsync(QueryContractDedcutpayinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractDedcutpayinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据支付宝商家订单号查询交易单
         * Summary: 根据交易号查询订单
         */
        public QueryContractDedcutpayinfoResponse QueryContractDedcutpayinfoEx(QueryContractDedcutpayinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractDedcutpayinfoResponse>(DoRequest("1.0", "twc.notary.contract.dedcutpayinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据支付宝商家订单号查询交易单
         * Summary: 根据交易号查询订单
         */
        public async Task<QueryContractDedcutpayinfoResponse> QueryContractDedcutpayinfoExAsync(QueryContractDedcutpayinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractDedcutpayinfoResponse>(await DoRequestAsync("1.0", "twc.notary.contract.dedcutpayinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 72h代扣解约代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
         * Summary: 72h代扣解约-twc解约
         */
        public UnbindContractZfbagreementResponse UnbindContractZfbagreement(UnbindContractZfbagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindContractZfbagreementEx(request, headers, runtime);
        }

        /**
         * Description: 72h代扣解约代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
         * Summary: 72h代扣解约-twc解约
         */
        public async Task<UnbindContractZfbagreementResponse> UnbindContractZfbagreementAsync(UnbindContractZfbagreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindContractZfbagreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 72h代扣解约代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
         * Summary: 72h代扣解约-twc解约
         */
        public UnbindContractZfbagreementResponse UnbindContractZfbagreementEx(UnbindContractZfbagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindContractZfbagreementResponse>(DoRequest("1.0", "twc.notary.contract.zfbagreement.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 72h代扣解约代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
         * Summary: 72h代扣解约-twc解约
         */
        public async Task<UnbindContractZfbagreementResponse> UnbindContractZfbagreementExAsync(UnbindContractZfbagreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindContractZfbagreementResponse>(await DoRequestAsync("1.0", "twc.notary.contract.zfbagreement.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成手动签署流程
         * Summary: 完成手动签署流程
         */
        public FinishContractFlowResponse FinishContractFlow(FinishContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishContractFlowEx(request, headers, runtime);
        }

        /**
         * Description: 完成手动签署流程
         * Summary: 完成手动签署流程
         */
        public async Task<FinishContractFlowResponse> FinishContractFlowAsync(FinishContractFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishContractFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 完成手动签署流程
         * Summary: 完成手动签署流程
         */
        public FinishContractFlowResponse FinishContractFlowEx(FinishContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishContractFlowResponse>(DoRequest("1.0", "twc.notary.contract.flow.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成手动签署流程
         * Summary: 完成手动签署流程
         */
        public async Task<FinishContractFlowResponse> FinishContractFlowExAsync(FinishContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishContractFlowResponse>(await DoRequestAsync("1.0", "twc.notary.contract.flow.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户使用mp4内容，集成方通过该openAPI进行使用上报。
         * Summary: 集成方通过该接口进行使用mp4上报
         */
        public PushDigitalcontentUsageResponse PushDigitalcontentUsage(PushDigitalcontentUsageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushDigitalcontentUsageEx(request, headers, runtime);
        }

        /**
         * Description: 用户使用mp4内容，集成方通过该openAPI进行使用上报。
         * Summary: 集成方通过该接口进行使用mp4上报
         */
        public async Task<PushDigitalcontentUsageResponse> PushDigitalcontentUsageAsync(PushDigitalcontentUsageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushDigitalcontentUsageExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户使用mp4内容，集成方通过该openAPI进行使用上报。
         * Summary: 集成方通过该接口进行使用mp4上报
         */
        public PushDigitalcontentUsageResponse PushDigitalcontentUsageEx(PushDigitalcontentUsageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushDigitalcontentUsageResponse>(DoRequest("1.0", "twc.notary.digitalcontent.usage.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户使用mp4内容，集成方通过该openAPI进行使用上报。
         * Summary: 集成方通过该接口进行使用mp4上报
         */
        public async Task<PushDigitalcontentUsageResponse> PushDigitalcontentUsageExAsync(PushDigitalcontentUsageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushDigitalcontentUsageResponse>(await DoRequestAsync("1.0", "twc.notary.digitalcontent.usage.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户使用apk内容，集成方通过该openAPI申请该使用的订单id。
         * Summary: 集成方通过该接口申请apk订单id
         */
        public ApplyDigitalcontentOrderResponse ApplyDigitalcontentOrder(ApplyDigitalcontentOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyDigitalcontentOrderEx(request, headers, runtime);
        }

        /**
         * Description: 用户使用apk内容，集成方通过该openAPI申请该使用的订单id。
         * Summary: 集成方通过该接口申请apk订单id
         */
        public async Task<ApplyDigitalcontentOrderResponse> ApplyDigitalcontentOrderAsync(ApplyDigitalcontentOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyDigitalcontentOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户使用apk内容，集成方通过该openAPI申请该使用的订单id。
         * Summary: 集成方通过该接口申请apk订单id
         */
        public ApplyDigitalcontentOrderResponse ApplyDigitalcontentOrderEx(ApplyDigitalcontentOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDigitalcontentOrderResponse>(DoRequest("1.0", "twc.notary.digitalcontent.order.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户使用apk内容，集成方通过该openAPI申请该使用的订单id。
         * Summary: 集成方通过该接口申请apk订单id
         */
        public async Task<ApplyDigitalcontentOrderResponse> ApplyDigitalcontentOrderExAsync(ApplyDigitalcontentOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyDigitalcontentOrderResponse>(await DoRequestAsync("1.0", "twc.notary.digitalcontent.order.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户使用apk内容支付后，集成方通过订单id和支付id反馈支付结果，并申请交互token。
         * Summary: 集成方反馈apk订单支付结果
         */
        public SubmitDigitalcontentOrderResponse SubmitDigitalcontentOrder(SubmitDigitalcontentOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitDigitalcontentOrderEx(request, headers, runtime);
        }

        /**
         * Description: 用户使用apk内容支付后，集成方通过订单id和支付id反馈支付结果，并申请交互token。
         * Summary: 集成方反馈apk订单支付结果
         */
        public async Task<SubmitDigitalcontentOrderResponse> SubmitDigitalcontentOrderAsync(SubmitDigitalcontentOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitDigitalcontentOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户使用apk内容支付后，集成方通过订单id和支付id反馈支付结果，并申请交互token。
         * Summary: 集成方反馈apk订单支付结果
         */
        public SubmitDigitalcontentOrderResponse SubmitDigitalcontentOrderEx(SubmitDigitalcontentOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDigitalcontentOrderResponse>(DoRequest("1.0", "twc.notary.digitalcontent.order.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户使用apk内容支付后，集成方通过订单id和支付id反馈支付结果，并申请交互token。
         * Summary: 集成方反馈apk订单支付结果
         */
        public async Task<SubmitDigitalcontentOrderResponse> SubmitDigitalcontentOrderExAsync(SubmitDigitalcontentOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitDigitalcontentOrderResponse>(await DoRequestAsync("1.0", "twc.notary.digitalcontent.order.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
         * Summary: 向notarycore同步事务数据
         */
        public SyncInnerTransResponse SyncInnerTrans(SyncInnerTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerTransEx(request, headers, runtime);
        }

        /**
         * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
         * Summary: 向notarycore同步事务数据
         */
        public async Task<SyncInnerTransResponse> SyncInnerTransAsync(SyncInnerTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerTransExAsync(request, headers, runtime);
        }

        /**
         * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
         * Summary: 向notarycore同步事务数据
         */
        public SyncInnerTransResponse SyncInnerTransEx(SyncInnerTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerTransResponse>(DoRequest("1.0", "twc.notary.inner.trans.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
         * Summary: 向notarycore同步事务数据
         */
        public async Task<SyncInnerTransResponse> SyncInnerTransExAsync(SyncInnerTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerTransResponse>(await DoRequestAsync("1.0", "twc.notary.inner.trans.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从baas-notary向notarycore同步存证数据
         * Summary: 向notarycore同步存证数据
         */
        public SyncInnerNotaryResponse SyncInnerNotary(SyncInnerNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerNotaryEx(request, headers, runtime);
        }

        /**
         * Description: 从baas-notary向notarycore同步存证数据
         * Summary: 向notarycore同步存证数据
         */
        public async Task<SyncInnerNotaryResponse> SyncInnerNotaryAsync(SyncInnerNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerNotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 从baas-notary向notarycore同步存证数据
         * Summary: 向notarycore同步存证数据
         */
        public SyncInnerNotaryResponse SyncInnerNotaryEx(SyncInnerNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerNotaryResponse>(DoRequest("1.0", "twc.notary.inner.notary.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从baas-notary向notarycore同步存证数据
         * Summary: 向notarycore同步存证数据
         */
        public async Task<SyncInnerNotaryResponse> SyncInnerNotaryExAsync(SyncInnerNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerNotaryResponse>(await DoRequestAsync("1.0", "twc.notary.inner.notary.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从baas-notary向notarycore同步自租户信息
         * Summary: 向notarycore同步子租户数据
         */
        public SyncInnerTwcopenResponse SyncInnerTwcopen(SyncInnerTwcopenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerTwcopenEx(request, headers, runtime);
        }

        /**
         * Description: 从baas-notary向notarycore同步自租户信息
         * Summary: 向notarycore同步子租户数据
         */
        public async Task<SyncInnerTwcopenResponse> SyncInnerTwcopenAsync(SyncInnerTwcopenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerTwcopenExAsync(request, headers, runtime);
        }

        /**
         * Description: 从baas-notary向notarycore同步自租户信息
         * Summary: 向notarycore同步子租户数据
         */
        public SyncInnerTwcopenResponse SyncInnerTwcopenEx(SyncInnerTwcopenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerTwcopenResponse>(DoRequest("1.0", "twc.notary.inner.twcopen.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从baas-notary向notarycore同步自租户信息
         * Summary: 向notarycore同步子租户数据
         */
        public async Task<SyncInnerTwcopenResponse> SyncInnerTwcopenExAsync(SyncInnerTwcopenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerTwcopenResponse>(await DoRequestAsync("1.0", "twc.notary.inner.twcopen.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从baas-notary向notarycore同步租户权限数据
         * Summary: 向notarycore同步租户数据
         */
        public SyncInnerProvisionResponse SyncInnerProvision(SyncInnerProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerProvisionEx(request, headers, runtime);
        }

        /**
         * Description: 从baas-notary向notarycore同步租户权限数据
         * Summary: 向notarycore同步租户数据
         */
        public async Task<SyncInnerProvisionResponse> SyncInnerProvisionAsync(SyncInnerProvisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerProvisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 从baas-notary向notarycore同步租户权限数据
         * Summary: 向notarycore同步租户数据
         */
        public SyncInnerProvisionResponse SyncInnerProvisionEx(SyncInnerProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerProvisionResponse>(DoRequest("1.0", "twc.notary.inner.provision.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从baas-notary向notarycore同步租户权限数据
         * Summary: 向notarycore同步租户数据
         */
        public async Task<SyncInnerProvisionResponse> SyncInnerProvisionExAsync(SyncInnerProvisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerProvisionResponse>(await DoRequestAsync("1.0", "twc.notary.inner.provision.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从baas-notary向notarycore同步tsr数据
         * Summary: 向notarycore同步tsr数据
         */
        public SyncInnerTsrResponse SyncInnerTsr(SyncInnerTsrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInnerTsrEx(request, headers, runtime);
        }

        /**
         * Description: 从baas-notary向notarycore同步tsr数据
         * Summary: 向notarycore同步tsr数据
         */
        public async Task<SyncInnerTsrResponse> SyncInnerTsrAsync(SyncInnerTsrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInnerTsrExAsync(request, headers, runtime);
        }

        /**
         * Description: 从baas-notary向notarycore同步tsr数据
         * Summary: 向notarycore同步tsr数据
         */
        public SyncInnerTsrResponse SyncInnerTsrEx(SyncInnerTsrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerTsrResponse>(DoRequest("1.0", "twc.notary.inner.tsr.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从baas-notary向notarycore同步tsr数据
         * Summary: 向notarycore同步tsr数据
         */
        public async Task<SyncInnerTsrResponse> SyncInnerTsrExAsync(SyncInnerTsrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInnerTsrResponse>(await DoRequestAsync("1.0", "twc.notary.inner.tsr.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转化短链接(废弃)
         * Summary: 转化短链接(废弃)
         */
        public TransferInnerShorturlResponse TransferInnerShorturl(TransferInnerShorturlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TransferInnerShorturlEx(request, headers, runtime);
        }

        /**
         * Description: 转化短链接(废弃)
         * Summary: 转化短链接(废弃)
         */
        public async Task<TransferInnerShorturlResponse> TransferInnerShorturlAsync(TransferInnerShorturlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TransferInnerShorturlExAsync(request, headers, runtime);
        }

        /**
         * Description: 转化短链接(废弃)
         * Summary: 转化短链接(废弃)
         */
        public TransferInnerShorturlResponse TransferInnerShorturlEx(TransferInnerShorturlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferInnerShorturlResponse>(DoRequest("1.0", "twc.notary.inner.shorturl.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转化短链接(废弃)
         * Summary: 转化短链接(废弃)
         */
        public async Task<TransferInnerShorturlResponse> TransferInnerShorturlExAsync(TransferInnerShorturlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferInnerShorturlResponse>(await DoRequestAsync("1.0", "twc.notary.inner.shorturl.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 宠物比对能力图片资源合格性校验
         * Summary: 宠物合格性校验
         */
        public VerifyLeasePetrecognitionResponse VerifyLeasePetrecognition(VerifyLeasePetrecognitionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyLeasePetrecognitionEx(request, headers, runtime);
        }

        /**
         * Description: 宠物比对能力图片资源合格性校验
         * Summary: 宠物合格性校验
         */
        public async Task<VerifyLeasePetrecognitionResponse> VerifyLeasePetrecognitionAsync(VerifyLeasePetrecognitionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyLeasePetrecognitionExAsync(request, headers, runtime);
        }

        /**
         * Description: 宠物比对能力图片资源合格性校验
         * Summary: 宠物合格性校验
         */
        public VerifyLeasePetrecognitionResponse VerifyLeasePetrecognitionEx(VerifyLeasePetrecognitionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyLeasePetrecognitionResponse>(DoRequest("1.0", "twc.notary.lease.petrecognition.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 宠物比对能力图片资源合格性校验
         * Summary: 宠物合格性校验
         */
        public async Task<VerifyLeasePetrecognitionResponse> VerifyLeasePetrecognitionExAsync(VerifyLeasePetrecognitionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyLeasePetrecognitionResponse>(await DoRequestAsync("1.0", "twc.notary.lease.petrecognition.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 宠物比对能力建档注册功能
         * Summary: 宠物建档注册
         */
        public RegisterLeasePetrecognitionResponse RegisterLeasePetrecognition(RegisterLeasePetrecognitionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterLeasePetrecognitionEx(request, headers, runtime);
        }

        /**
         * Description: 宠物比对能力建档注册功能
         * Summary: 宠物建档注册
         */
        public async Task<RegisterLeasePetrecognitionResponse> RegisterLeasePetrecognitionAsync(RegisterLeasePetrecognitionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterLeasePetrecognitionExAsync(request, headers, runtime);
        }

        /**
         * Description: 宠物比对能力建档注册功能
         * Summary: 宠物建档注册
         */
        public RegisterLeasePetrecognitionResponse RegisterLeasePetrecognitionEx(RegisterLeasePetrecognitionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterLeasePetrecognitionResponse>(DoRequest("1.0", "twc.notary.lease.petrecognition.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 宠物比对能力建档注册功能
         * Summary: 宠物建档注册
         */
        public async Task<RegisterLeasePetrecognitionResponse> RegisterLeasePetrecognitionExAsync(RegisterLeasePetrecognitionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterLeasePetrecognitionResponse>(await DoRequestAsync("1.0", "twc.notary.lease.petrecognition.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 宠物比对能力建档比对
         * Summary: 宠物建档比对
         */
        public OperateLeasePetcomparepetidResponse OperateLeasePetcomparepetid(OperateLeasePetcomparepetidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateLeasePetcomparepetidEx(request, headers, runtime);
        }

        /**
         * Description: 宠物比对能力建档比对
         * Summary: 宠物建档比对
         */
        public async Task<OperateLeasePetcomparepetidResponse> OperateLeasePetcomparepetidAsync(OperateLeasePetcomparepetidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateLeasePetcomparepetidExAsync(request, headers, runtime);
        }

        /**
         * Description: 宠物比对能力建档比对
         * Summary: 宠物建档比对
         */
        public OperateLeasePetcomparepetidResponse OperateLeasePetcomparepetidEx(OperateLeasePetcomparepetidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateLeasePetcomparepetidResponse>(DoRequest("1.0", "twc.notary.lease.petcomparepetid.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 宠物比对能力建档比对
         * Summary: 宠物建档比对
         */
        public async Task<OperateLeasePetcomparepetidResponse> OperateLeasePetcomparepetidExAsync(OperateLeasePetcomparepetidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateLeasePetcomparepetidResponse>(await DoRequestAsync("1.0", "twc.notary.lease.petcomparepetid.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 宠物比对能力图片资源直接比对
         * Summary: 宠物资源直接比对
         */
        public OperateLeasePetcomparepetsResponse OperateLeasePetcomparepets(OperateLeasePetcomparepetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateLeasePetcomparepetsEx(request, headers, runtime);
        }

        /**
         * Description: 宠物比对能力图片资源直接比对
         * Summary: 宠物资源直接比对
         */
        public async Task<OperateLeasePetcomparepetsResponse> OperateLeasePetcomparepetsAsync(OperateLeasePetcomparepetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateLeasePetcomparepetsExAsync(request, headers, runtime);
        }

        /**
         * Description: 宠物比对能力图片资源直接比对
         * Summary: 宠物资源直接比对
         */
        public OperateLeasePetcomparepetsResponse OperateLeasePetcomparepetsEx(OperateLeasePetcomparepetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateLeasePetcomparepetsResponse>(DoRequest("1.0", "twc.notary.lease.petcomparepets.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 宠物比对能力图片资源直接比对
         * Summary: 宠物资源直接比对
         */
        public async Task<OperateLeasePetcomparepetsResponse> OperateLeasePetcomparepetsExAsync(OperateLeasePetcomparepetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateLeasePetcomparepetsResponse>(await DoRequestAsync("1.0", "twc.notary.lease.petcomparepets.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务电子签发起签署
         * Summary: 法务电子签发起签署
         */
        public ApplyInnerAntesignResponse ApplyInnerAntesign(ApplyInnerAntesignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyInnerAntesignEx(request, headers, runtime);
        }

        /**
         * Description: 法务电子签发起签署
         * Summary: 法务电子签发起签署
         */
        public async Task<ApplyInnerAntesignResponse> ApplyInnerAntesignAsync(ApplyInnerAntesignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyInnerAntesignExAsync(request, headers, runtime);
        }

        /**
         * Description: 法务电子签发起签署
         * Summary: 法务电子签发起签署
         */
        public ApplyInnerAntesignResponse ApplyInnerAntesignEx(ApplyInnerAntesignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInnerAntesignResponse>(DoRequest("1.0", "twc.notary.inner.antesign.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务电子签发起签署
         * Summary: 法务电子签发起签署
         */
        public async Task<ApplyInnerAntesignResponse> ApplyInnerAntesignExAsync(ApplyInnerAntesignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyInnerAntesignResponse>(await DoRequestAsync("1.0", "twc.notary.inner.antesign.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务电子签查询签署状态
         * Summary: 法务电子签查询签署状态
         */
        public QueryInnerAntesignResponse QueryInnerAntesign(QueryInnerAntesignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInnerAntesignEx(request, headers, runtime);
        }

        /**
         * Description: 法务电子签查询签署状态
         * Summary: 法务电子签查询签署状态
         */
        public async Task<QueryInnerAntesignResponse> QueryInnerAntesignAsync(QueryInnerAntesignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInnerAntesignExAsync(request, headers, runtime);
        }

        /**
         * Description: 法务电子签查询签署状态
         * Summary: 法务电子签查询签署状态
         */
        public QueryInnerAntesignResponse QueryInnerAntesignEx(QueryInnerAntesignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAntesignResponse>(DoRequest("1.0", "twc.notary.inner.antesign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务电子签查询签署状态
         * Summary: 法务电子签查询签署状态
         */
        public async Task<QueryInnerAntesignResponse> QueryInnerAntesignExAsync(QueryInnerAntesignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInnerAntesignResponse>(await DoRequestAsync("1.0", "twc.notary.inner.antesign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务电子签根据公司名称统代生成印章
         * Summary: 法务电子签根据公司名称统代生成印章
         */
        public CreateInnerAntesignResponse CreateInnerAntesign(CreateInnerAntesignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInnerAntesignEx(request, headers, runtime);
        }

        /**
         * Description: 法务电子签根据公司名称统代生成印章
         * Summary: 法务电子签根据公司名称统代生成印章
         */
        public async Task<CreateInnerAntesignResponse> CreateInnerAntesignAsync(CreateInnerAntesignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInnerAntesignExAsync(request, headers, runtime);
        }

        /**
         * Description: 法务电子签根据公司名称统代生成印章
         * Summary: 法务电子签根据公司名称统代生成印章
         */
        public CreateInnerAntesignResponse CreateInnerAntesignEx(CreateInnerAntesignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerAntesignResponse>(DoRequest("1.0", "twc.notary.inner.antesign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 法务电子签根据公司名称统代生成印章
         * Summary: 法务电子签根据公司名称统代生成印章
         */
        public async Task<CreateInnerAntesignResponse> CreateInnerAntesignExAsync(CreateInnerAntesignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInnerAntesignResponse>(await DoRequestAsync("1.0", "twc.notary.inner.antesign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入企业名+证件号，发起企业二要素认证请求。
         * Summary: 企业二要素认证
         */
        public CheckEpidentityTwometaResponse CheckEpidentityTwometa(CheckEpidentityTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckEpidentityTwometaEx(request, headers, runtime);
        }

        /**
         * Description: 输入企业名+证件号，发起企业二要素认证请求。
         * Summary: 企业二要素认证
         */
        public async Task<CheckEpidentityTwometaResponse> CheckEpidentityTwometaAsync(CheckEpidentityTwometaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckEpidentityTwometaExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入企业名+证件号，发起企业二要素认证请求。
         * Summary: 企业二要素认证
         */
        public CheckEpidentityTwometaResponse CheckEpidentityTwometaEx(CheckEpidentityTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckEpidentityTwometaResponse>(DoRequest("1.0", "twc.notary.epidentity.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入企业名+证件号，发起企业二要素认证请求。
         * Summary: 企业二要素认证
         */
        public async Task<CheckEpidentityTwometaResponse> CheckEpidentityTwometaExAsync(CheckEpidentityTwometaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckEpidentityTwometaResponse>(await DoRequestAsync("1.0", "twc.notary.epidentity.twometa.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
         * Summary: 企业三要素认证
         */
        public CheckEpidentityThreemetaResponse CheckEpidentityThreemeta(CheckEpidentityThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckEpidentityThreemetaEx(request, headers, runtime);
        }

        /**
         * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
         * Summary: 企业三要素认证
         */
        public async Task<CheckEpidentityThreemetaResponse> CheckEpidentityThreemetaAsync(CheckEpidentityThreemetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckEpidentityThreemetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
         * Summary: 企业三要素认证
         */
        public CheckEpidentityThreemetaResponse CheckEpidentityThreemetaEx(CheckEpidentityThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckEpidentityThreemetaResponse>(DoRequest("1.0", "twc.notary.epidentity.threemeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
         * Summary: 企业三要素认证
         */
        public async Task<CheckEpidentityThreemetaResponse> CheckEpidentityThreemetaExAsync(CheckEpidentityThreemetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckEpidentityThreemetaResponse>(await DoRequestAsync("1.0", "twc.notary.epidentity.threemeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
         * Summary: 企业四要素认证
         */
        public CheckEpidentityFourmetaResponse CheckEpidentityFourmeta(CheckEpidentityFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckEpidentityFourmetaEx(request, headers, runtime);
        }

        /**
         * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
         * Summary: 企业四要素认证
         */
        public async Task<CheckEpidentityFourmetaResponse> CheckEpidentityFourmetaAsync(CheckEpidentityFourmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckEpidentityFourmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
         * Summary: 企业四要素认证
         */
        public CheckEpidentityFourmetaResponse CheckEpidentityFourmetaEx(CheckEpidentityFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckEpidentityFourmetaResponse>(DoRequest("1.0", "twc.notary.epidentity.fourmeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
         * Summary: 企业四要素认证
         */
        public async Task<CheckEpidentityFourmetaResponse> CheckEpidentityFourmetaExAsync(CheckEpidentityFourmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckEpidentityFourmetaResponse>(await DoRequestAsync("1.0", "twc.notary.epidentity.fourmeta.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询公证订单的有效性
         * Summary: 查询公证订单的有效性
         */
        public CheckNotarizationOrderResponse CheckNotarizationOrder(CheckNotarizationOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckNotarizationOrderEx(request, headers, runtime);
        }

        /**
         * Description: 查询公证订单的有效性
         * Summary: 查询公证订单的有效性
         */
        public async Task<CheckNotarizationOrderResponse> CheckNotarizationOrderAsync(CheckNotarizationOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckNotarizationOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询公证订单的有效性
         * Summary: 查询公证订单的有效性
         */
        public CheckNotarizationOrderResponse CheckNotarizationOrderEx(CheckNotarizationOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckNotarizationOrderResponse>(DoRequest("1.0", "twc.notary.notarization.order.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询公证订单的有效性
         * Summary: 查询公证订单的有效性
         */
        public async Task<CheckNotarizationOrderResponse> CheckNotarizationOrderExAsync(CheckNotarizationOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckNotarizationOrderResponse>(await DoRequestAsync("1.0", "twc.notary.notarization.order.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新公证订单状态
         * Summary: 更新公证订单状态
         */
        public UpdateNotarizationOrderResponse UpdateNotarizationOrder(UpdateNotarizationOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateNotarizationOrderEx(request, headers, runtime);
        }

        /**
         * Description: 更新公证订单状态
         * Summary: 更新公证订单状态
         */
        public async Task<UpdateNotarizationOrderResponse> UpdateNotarizationOrderAsync(UpdateNotarizationOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateNotarizationOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新公证订单状态
         * Summary: 更新公证订单状态
         */
        public UpdateNotarizationOrderResponse UpdateNotarizationOrderEx(UpdateNotarizationOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateNotarizationOrderResponse>(DoRequest("1.0", "twc.notary.notarization.order.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新公证订单状态
         * Summary: 更新公证订单状态
         */
        public async Task<UpdateNotarizationOrderResponse> UpdateNotarizationOrderExAsync(UpdateNotarizationOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateNotarizationOrderResponse>(await DoRequestAsync("1.0", "twc.notary.notarization.order.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置订单属性
         * Summary: 设置订单属性
         */
        public SetNotarizationOrderResponse SetNotarizationOrder(SetNotarizationOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetNotarizationOrderEx(request, headers, runtime);
        }

        /**
         * Description: 设置订单属性
         * Summary: 设置订单属性
         */
        public async Task<SetNotarizationOrderResponse> SetNotarizationOrderAsync(SetNotarizationOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetNotarizationOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置订单属性
         * Summary: 设置订单属性
         */
        public SetNotarizationOrderResponse SetNotarizationOrderEx(SetNotarizationOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetNotarizationOrderResponse>(DoRequest("1.0", "twc.notary.notarization.order.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置订单属性
         * Summary: 设置订单属性
         */
        public async Task<SetNotarizationOrderResponse> SetNotarizationOrderExAsync(SetNotarizationOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetNotarizationOrderResponse>(await DoRequestAsync("1.0", "twc.notary.notarization.order.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实人认证初始化
         * Summary: 实人认证初始化
         */
        public InitIdentificationFaceauthResponse InitIdentificationFaceauth(InitIdentificationFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitIdentificationFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 实人认证初始化
         * Summary: 实人认证初始化
         */
        public async Task<InitIdentificationFaceauthResponse> InitIdentificationFaceauthAsync(InitIdentificationFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitIdentificationFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 实人认证初始化
         * Summary: 实人认证初始化
         */
        public InitIdentificationFaceauthResponse InitIdentificationFaceauthEx(InitIdentificationFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIdentificationFaceauthResponse>(DoRequest("1.0", "twc.notary.identification.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实人认证初始化
         * Summary: 实人认证初始化
         */
        public async Task<InitIdentificationFaceauthResponse> InitIdentificationFaceauthExAsync(InitIdentificationFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIdentificationFaceauthResponse>(await DoRequestAsync("1.0", "twc.notary.identification.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起实人认证
         * Summary: 发起实人认证
         */
        public CertifyIdentificationFaceauthResponse CertifyIdentificationFaceauth(CertifyIdentificationFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyIdentificationFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 发起实人认证
         * Summary: 发起实人认证
         */
        public async Task<CertifyIdentificationFaceauthResponse> CertifyIdentificationFaceauthAsync(CertifyIdentificationFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyIdentificationFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起实人认证
         * Summary: 发起实人认证
         */
        public CertifyIdentificationFaceauthResponse CertifyIdentificationFaceauthEx(CertifyIdentificationFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIdentificationFaceauthResponse>(DoRequest("1.0", "twc.notary.identification.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起实人认证
         * Summary: 发起实人认证
         */
        public async Task<CertifyIdentificationFaceauthResponse> CertifyIdentificationFaceauthExAsync(CertifyIdentificationFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIdentificationFaceauthResponse>(await DoRequestAsync("1.0", "twc.notary.identification.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实人认证结果
         * Summary: 查询实人认证结果
         */
        public QueryIdentificationFaceauthResponse QueryIdentificationFaceauth(QueryIdentificationFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIdentificationFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 查询实人认证结果
         * Summary: 查询实人认证结果
         */
        public async Task<QueryIdentificationFaceauthResponse> QueryIdentificationFaceauthAsync(QueryIdentificationFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIdentificationFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询实人认证结果
         * Summary: 查询实人认证结果
         */
        public QueryIdentificationFaceauthResponse QueryIdentificationFaceauthEx(QueryIdentificationFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIdentificationFaceauthResponse>(DoRequest("1.0", "twc.notary.identification.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实人认证结果
         * Summary: 查询实人认证结果
         */
        public async Task<QueryIdentificationFaceauthResponse> QueryIdentificationFaceauthExAsync(QueryIdentificationFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIdentificationFaceauthResponse>(await DoRequestAsync("1.0", "twc.notary.identification.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业法人认证查询结果接口
         * Summary: 企业法人认证查询
         */
        public QueryEnterpriseFaceauthResponse QueryEnterpriseFaceauth(QueryEnterpriseFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnterpriseFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 企业法人认证查询结果接口
         * Summary: 企业法人认证查询
         */
        public async Task<QueryEnterpriseFaceauthResponse> QueryEnterpriseFaceauthAsync(QueryEnterpriseFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnterpriseFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业法人认证查询结果接口
         * Summary: 企业法人认证查询
         */
        public QueryEnterpriseFaceauthResponse QueryEnterpriseFaceauthEx(QueryEnterpriseFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseFaceauthResponse>(DoRequest("1.0", "twc.notary.enterprise.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业法人认证查询结果接口
         * Summary: 企业法人认证查询
         */
        public async Task<QueryEnterpriseFaceauthResponse> QueryEnterpriseFaceauthExAsync(QueryEnterpriseFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseFaceauthResponse>(await DoRequestAsync("1.0", "twc.notary.enterprise.faceauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业法人认证初始化接口
         * Summary: 企业法人认证初始化
         */
        public InitEnterpriseFaceauthResponse InitEnterpriseFaceauth(InitEnterpriseFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitEnterpriseFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 企业法人认证初始化接口
         * Summary: 企业法人认证初始化
         */
        public async Task<InitEnterpriseFaceauthResponse> InitEnterpriseFaceauthAsync(InitEnterpriseFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitEnterpriseFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业法人认证初始化接口
         * Summary: 企业法人认证初始化
         */
        public InitEnterpriseFaceauthResponse InitEnterpriseFaceauthEx(InitEnterpriseFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEnterpriseFaceauthResponse>(DoRequest("1.0", "twc.notary.enterprise.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业法人认证初始化接口
         * Summary: 企业法人认证初始化
         */
        public async Task<InitEnterpriseFaceauthResponse> InitEnterpriseFaceauthExAsync(InitEnterpriseFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitEnterpriseFaceauthResponse>(await DoRequestAsync("1.0", "twc.notary.enterprise.faceauth.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业法人认证开始接口
         * Summary: 企业法人认证开始
         */
        public CertifyEnterpriseFaceauthResponse CertifyEnterpriseFaceauth(CertifyEnterpriseFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyEnterpriseFaceauthEx(request, headers, runtime);
        }

        /**
         * Description: 企业法人认证开始接口
         * Summary: 企业法人认证开始
         */
        public async Task<CertifyEnterpriseFaceauthResponse> CertifyEnterpriseFaceauthAsync(CertifyEnterpriseFaceauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyEnterpriseFaceauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业法人认证开始接口
         * Summary: 企业法人认证开始
         */
        public CertifyEnterpriseFaceauthResponse CertifyEnterpriseFaceauthEx(CertifyEnterpriseFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyEnterpriseFaceauthResponse>(DoRequest("1.0", "twc.notary.enterprise.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业法人认证开始接口
         * Summary: 企业法人认证开始
         */
        public async Task<CertifyEnterpriseFaceauthResponse> CertifyEnterpriseFaceauthExAsync(CertifyEnterpriseFaceauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyEnterpriseFaceauthResponse>(await DoRequestAsync("1.0", "twc.notary.enterprise.faceauth.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建租赁订单
         * Summary: 租赁订单创建
         */
        public CreateLeaseOrderResponse CreateLeaseOrder(CreateLeaseOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseOrderEx(request, headers, runtime);
        }

        /**
         * Description: 创建租赁订单
         * Summary: 租赁订单创建
         */
        public async Task<CreateLeaseOrderResponse> CreateLeaseOrderAsync(CreateLeaseOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建租赁订单
         * Summary: 租赁订单创建
         */
        public CreateLeaseOrderResponse CreateLeaseOrderEx(CreateLeaseOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseOrderResponse>(DoRequest("1.0", "twc.notary.lease.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建租赁订单
         * Summary: 租赁订单创建
         */
        public async Task<CreateLeaseOrderResponse> CreateLeaseOrderExAsync(CreateLeaseOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseOrderResponse>(await DoRequestAsync("1.0", "twc.notary.lease.order.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
         * Summary: 公证场景创建收费订单
         */
        public CreateNotarizationBillResponse CreateNotarizationBill(CreateNotarizationBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateNotarizationBillEx(request, headers, runtime);
        }

        /**
         * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
         * Summary: 公证场景创建收费订单
         */
        public async Task<CreateNotarizationBillResponse> CreateNotarizationBillAsync(CreateNotarizationBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateNotarizationBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
         * Summary: 公证场景创建收费订单
         */
        public CreateNotarizationBillResponse CreateNotarizationBillEx(CreateNotarizationBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNotarizationBillResponse>(DoRequest("1.0", "twc.notary.notarization.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
         * Summary: 公证场景创建收费订单
         */
        public async Task<CreateNotarizationBillResponse> CreateNotarizationBillExAsync(CreateNotarizationBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNotarizationBillResponse>(await DoRequestAsync("1.0", "twc.notary.notarization.bill.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
         * Summary: 初始化存证证明订单
         */
        public InitCertificationResponse InitCertification(InitCertificationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitCertificationEx(request, headers, runtime);
        }

        /**
         * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
         * Summary: 初始化存证证明订单
         */
        public async Task<InitCertificationResponse> InitCertificationAsync(InitCertificationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitCertificationExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
         * Summary: 初始化存证证明订单
         */
        public InitCertificationResponse InitCertificationEx(InitCertificationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCertificationResponse>(DoRequest("1.0", "twc.notary.certification.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
         * Summary: 初始化存证证明订单
         */
        public async Task<InitCertificationResponse> InitCertificationExAsync(InitCertificationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitCertificationResponse>(await DoRequestAsync("1.0", "twc.notary.certification.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
         * Summary: 查询存证证明申请状态
         */
        public QueryCertificationResponse QueryCertification(QueryCertificationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCertificationEx(request, headers, runtime);
        }

        /**
         * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
         * Summary: 查询存证证明申请状态
         */
        public async Task<QueryCertificationResponse> QueryCertificationAsync(QueryCertificationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCertificationExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
         * Summary: 查询存证证明申请状态
         */
        public QueryCertificationResponse QueryCertificationEx(QueryCertificationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertificationResponse>(DoRequest("1.0", "twc.notary.certification.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
         * Summary: 查询存证证明申请状态
         */
        public async Task<QueryCertificationResponse> QueryCertificationExAsync(QueryCertificationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCertificationResponse>(await DoRequestAsync("1.0", "twc.notary.certification.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
         * Summary: 可信时间凭证服务 - 获取时间凭证证书
         */
        public GetTsrCertificateResponse GetTsrCertificate(GetTsrCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTsrCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
         * Summary: 可信时间凭证服务 - 获取时间凭证证书
         */
        public async Task<GetTsrCertificateResponse> GetTsrCertificateAsync(GetTsrCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTsrCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
         * Summary: 可信时间凭证服务 - 获取时间凭证证书
         */
        public GetTsrCertificateResponse GetTsrCertificateEx(GetTsrCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTsrCertificateResponse>(DoRequest("1.0", "twc.notary.tsr.certificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
         * Summary: 可信时间凭证服务 - 获取时间凭证证书
         */
        public async Task<GetTsrCertificateResponse> GetTsrCertificateExAsync(GetTsrCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTsrCertificateResponse>(await DoRequestAsync("1.0", "twc.notary.tsr.certificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起实人认证，这是改造后的接口
         * Summary: 实人认证创建
         */
        public CreateIdentificationRealpersonResponse CreateIdentificationRealperson(CreateIdentificationRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIdentificationRealpersonEx(request, headers, runtime);
        }

        /**
         * Description: 发起实人认证，这是改造后的接口
         * Summary: 实人认证创建
         */
        public async Task<CreateIdentificationRealpersonResponse> CreateIdentificationRealpersonAsync(CreateIdentificationRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIdentificationRealpersonExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起实人认证，这是改造后的接口
         * Summary: 实人认证创建
         */
        public CreateIdentificationRealpersonResponse CreateIdentificationRealpersonEx(CreateIdentificationRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIdentificationRealpersonResponse>(DoRequest("1.0", "twc.notary.identification.realperson.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起实人认证，这是改造后的接口
         * Summary: 实人认证创建
         */
        public async Task<CreateIdentificationRealpersonResponse> CreateIdentificationRealpersonExAsync(CreateIdentificationRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIdentificationRealpersonResponse>(await DoRequestAsync("1.0", "twc.notary.identification.realperson.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实人认证结果
         * Summary: 查询实人认证结果
         */
        public QueryIdentificationRealpersonResponse QueryIdentificationRealperson(QueryIdentificationRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIdentificationRealpersonEx(request, headers, runtime);
        }

        /**
         * Description: 查询实人认证结果
         * Summary: 查询实人认证结果
         */
        public async Task<QueryIdentificationRealpersonResponse> QueryIdentificationRealpersonAsync(QueryIdentificationRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIdentificationRealpersonExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询实人认证结果
         * Summary: 查询实人认证结果
         */
        public QueryIdentificationRealpersonResponse QueryIdentificationRealpersonEx(QueryIdentificationRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIdentificationRealpersonResponse>(DoRequest("1.0", "twc.notary.identification.realperson.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实人认证结果
         * Summary: 查询实人认证结果
         */
        public async Task<QueryIdentificationRealpersonResponse> QueryIdentificationRealpersonExAsync(QueryIdentificationRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIdentificationRealpersonResponse>(await DoRequestAsync("1.0", "twc.notary.identification.realperson.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
         * Summary: 联合执行履行记录新增/修改接口
         */
        public SaveJointconstraintRecordResponse SaveJointconstraintRecord(SaveJointconstraintRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveJointconstraintRecordEx(request, headers, runtime);
        }

        /**
         * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
         * Summary: 联合执行履行记录新增/修改接口
         */
        public async Task<SaveJointconstraintRecordResponse> SaveJointconstraintRecordAsync(SaveJointconstraintRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveJointconstraintRecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
         * Summary: 联合执行履行记录新增/修改接口
         */
        public SaveJointconstraintRecordResponse SaveJointconstraintRecordEx(SaveJointconstraintRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveJointconstraintRecordResponse>(DoRequest("1.0", "twc.notary.jointconstraint.record.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
         * Summary: 联合执行履行记录新增/修改接口
         */
        public async Task<SaveJointconstraintRecordResponse> SaveJointconstraintRecordExAsync(SaveJointconstraintRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveJointconstraintRecordResponse>(await DoRequestAsync("1.0", "twc.notary.jointconstraint.record.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除履行记录
         * Summary: 履行记录删除接口
         */
        public DeleteJointconstraintRecordResponse DeleteJointconstraintRecord(DeleteJointconstraintRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteJointconstraintRecordEx(request, headers, runtime);
        }

        /**
         * Description: 删除履行记录
         * Summary: 履行记录删除接口
         */
        public async Task<DeleteJointconstraintRecordResponse> DeleteJointconstraintRecordAsync(DeleteJointconstraintRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteJointconstraintRecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除履行记录
         * Summary: 履行记录删除接口
         */
        public DeleteJointconstraintRecordResponse DeleteJointconstraintRecordEx(DeleteJointconstraintRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteJointconstraintRecordResponse>(DoRequest("1.0", "twc.notary.jointconstraint.record.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除履行记录
         * Summary: 履行记录删除接口
         */
        public async Task<DeleteJointconstraintRecordResponse> DeleteJointconstraintRecordExAsync(DeleteJointconstraintRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteJointconstraintRecordResponse>(await DoRequestAsync("1.0", "twc.notary.jointconstraint.record.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询违约记录
         * Summary: 违约记录查询接口
         */
        public QueryJointconstraintBreachrecordResponse QueryJointconstraintBreachrecord(QueryJointconstraintBreachrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryJointconstraintBreachrecordEx(request, headers, runtime);
        }

        /**
         * Description: 查询违约记录
         * Summary: 违约记录查询接口
         */
        public async Task<QueryJointconstraintBreachrecordResponse> QueryJointconstraintBreachrecordAsync(QueryJointconstraintBreachrecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryJointconstraintBreachrecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询违约记录
         * Summary: 违约记录查询接口
         */
        public QueryJointconstraintBreachrecordResponse QueryJointconstraintBreachrecordEx(QueryJointconstraintBreachrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJointconstraintBreachrecordResponse>(DoRequest("1.0", "twc.notary.jointconstraint.breachrecord.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询违约记录
         * Summary: 违约记录查询接口
         */
        public async Task<QueryJointconstraintBreachrecordResponse> QueryJointconstraintBreachrecordExAsync(QueryJointconstraintBreachrecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJointconstraintBreachrecordResponse>(await DoRequestAsync("1.0", "twc.notary.jointconstraint.breachrecord.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给第三方调解申请提交
         * Summary: 调解申请
         */
        public ApplyJusticeMediationResponse ApplyJusticeMediation(ApplyJusticeMediationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyJusticeMediationEx(request, headers, runtime);
        }

        /**
         * Description: 提供给第三方调解申请提交
         * Summary: 调解申请
         */
        public async Task<ApplyJusticeMediationResponse> ApplyJusticeMediationAsync(ApplyJusticeMediationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyJusticeMediationExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供给第三方调解申请提交
         * Summary: 调解申请
         */
        public ApplyJusticeMediationResponse ApplyJusticeMediationEx(ApplyJusticeMediationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyJusticeMediationResponse>(DoRequest("1.0", "twc.notary.justice.mediation.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给第三方调解申请提交
         * Summary: 调解申请
         */
        public async Task<ApplyJusticeMediationResponse> ApplyJusticeMediationExAsync(ApplyJusticeMediationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyJusticeMediationResponse>(await DoRequestAsync("1.0", "twc.notary.justice.mediation.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调解申请进度查询
         * Summary: 调解申请进度查询
         */
        public QueryJusticeMediationResponse QueryJusticeMediation(QueryJusticeMediationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryJusticeMediationEx(request, headers, runtime);
        }

        /**
         * Description: 调解申请进度查询
         * Summary: 调解申请进度查询
         */
        public async Task<QueryJusticeMediationResponse> QueryJusticeMediationAsync(QueryJusticeMediationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryJusticeMediationExAsync(request, headers, runtime);
        }

        /**
         * Description: 调解申请进度查询
         * Summary: 调解申请进度查询
         */
        public QueryJusticeMediationResponse QueryJusticeMediationEx(QueryJusticeMediationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeMediationResponse>(DoRequest("1.0", "twc.notary.justice.mediation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调解申请进度查询
         * Summary: 调解申请进度查询
         */
        public async Task<QueryJusticeMediationResponse> QueryJusticeMediationExAsync(QueryJusticeMediationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeMediationResponse>(await DoRequestAsync("1.0", "twc.notary.justice.mediation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汇裁证据要素查询接口
         * Summary: 汇裁证据要素查询接口
         */
        public QueryJusticeCaseinfoResponse QueryJusticeCaseinfo(QueryJusticeCaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryJusticeCaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 汇裁证据要素查询接口
         * Summary: 汇裁证据要素查询接口
         */
        public async Task<QueryJusticeCaseinfoResponse> QueryJusticeCaseinfoAsync(QueryJusticeCaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryJusticeCaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 汇裁证据要素查询接口
         * Summary: 汇裁证据要素查询接口
         */
        public QueryJusticeCaseinfoResponse QueryJusticeCaseinfoEx(QueryJusticeCaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeCaseinfoResponse>(DoRequest("1.0", "twc.notary.justice.caseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 汇裁证据要素查询接口
         * Summary: 汇裁证据要素查询接口
         */
        public async Task<QueryJusticeCaseinfoResponse> QueryJusticeCaseinfoExAsync(QueryJusticeCaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeCaseinfoResponse>(await DoRequestAsync("1.0", "twc.notary.justice.caseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
         * Summary: 获取OSS文件上传路径
         */
        public GetJusticeUploadfilepathResponse GetJusticeUploadfilepath(GetJusticeUploadfilepathRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetJusticeUploadfilepathEx(request, headers, runtime);
        }

        /**
         * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
         * Summary: 获取OSS文件上传路径
         */
        public async Task<GetJusticeUploadfilepathResponse> GetJusticeUploadfilepathAsync(GetJusticeUploadfilepathRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetJusticeUploadfilepathExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
         * Summary: 获取OSS文件上传路径
         */
        public GetJusticeUploadfilepathResponse GetJusticeUploadfilepathEx(GetJusticeUploadfilepathRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetJusticeUploadfilepathResponse>(DoRequest("1.0", "twc.notary.justice.uploadfilepath.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
         * Summary: 获取OSS文件上传路径
         */
        public async Task<GetJusticeUploadfilepathResponse> GetJusticeUploadfilepathExAsync(GetJusticeUploadfilepathRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetJusticeUploadfilepathResponse>(await DoRequestAsync("1.0", "twc.notary.justice.uploadfilepath.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
         * Summary: 自动进件案件回写
         */
        public CreateJusticeCasewritebackResponse CreateJusticeCasewriteback(CreateJusticeCasewritebackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateJusticeCasewritebackEx(request, headers, runtime);
        }

        /**
         * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
         * Summary: 自动进件案件回写
         */
        public async Task<CreateJusticeCasewritebackResponse> CreateJusticeCasewritebackAsync(CreateJusticeCasewritebackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateJusticeCasewritebackExAsync(request, headers, runtime);
        }

        /**
         * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
         * Summary: 自动进件案件回写
         */
        public CreateJusticeCasewritebackResponse CreateJusticeCasewritebackEx(CreateJusticeCasewritebackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeCasewritebackResponse>(DoRequest("1.0", "twc.notary.justice.casewriteback.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
         * Summary: 自动进件案件回写
         */
        public async Task<CreateJusticeCasewritebackResponse> CreateJusticeCasewritebackExAsync(CreateJusticeCasewritebackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeCasewritebackResponse>(await DoRequestAsync("1.0", "twc.notary.justice.casewriteback.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件基础信息查询
         * Summary: 案件基础信息查询
         */
        public QueryJusticeBasecaseResponse QueryJusticeBasecase(QueryJusticeBasecaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryJusticeBasecaseEx(request, headers, runtime);
        }

        /**
         * Description: 案件基础信息查询
         * Summary: 案件基础信息查询
         */
        public async Task<QueryJusticeBasecaseResponse> QueryJusticeBasecaseAsync(QueryJusticeBasecaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryJusticeBasecaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 案件基础信息查询
         * Summary: 案件基础信息查询
         */
        public QueryJusticeBasecaseResponse QueryJusticeBasecaseEx(QueryJusticeBasecaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeBasecaseResponse>(DoRequest("1.0", "twc.notary.justice.basecase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件基础信息查询
         * Summary: 案件基础信息查询
         */
        public async Task<QueryJusticeBasecaseResponse> QueryJusticeBasecaseExAsync(QueryJusticeBasecaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeBasecaseResponse>(await DoRequestAsync("1.0", "twc.notary.justice.basecase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件材料下载
         * Summary: 案件材料下载
         */
        public DownloadJusticeCasefileResponse DownloadJusticeCasefile(DownloadJusticeCasefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadJusticeCasefileEx(request, headers, runtime);
        }

        /**
         * Description: 案件材料下载
         * Summary: 案件材料下载
         */
        public async Task<DownloadJusticeCasefileResponse> DownloadJusticeCasefileAsync(DownloadJusticeCasefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadJusticeCasefileExAsync(request, headers, runtime);
        }

        /**
         * Description: 案件材料下载
         * Summary: 案件材料下载
         */
        public DownloadJusticeCasefileResponse DownloadJusticeCasefileEx(DownloadJusticeCasefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadJusticeCasefileResponse>(DoRequest("1.0", "twc.notary.justice.casefile.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件材料下载
         * Summary: 案件材料下载
         */
        public async Task<DownloadJusticeCasefileResponse> DownloadJusticeCasefileExAsync(DownloadJusticeCasefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadJusticeCasefileResponse>(await DoRequestAsync("1.0", "twc.notary.justice.casefile.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通纠纷平台使用权限
         * Summary: 开通纠纷平台使用权限
         */
        public OpenInternalJudicialResponse OpenInternalJudicial(OpenInternalJudicialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenInternalJudicialEx(request, headers, runtime);
        }

        /**
         * Description: 开通纠纷平台使用权限
         * Summary: 开通纠纷平台使用权限
         */
        public async Task<OpenInternalJudicialResponse> OpenInternalJudicialAsync(OpenInternalJudicialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenInternalJudicialExAsync(request, headers, runtime);
        }

        /**
         * Description: 开通纠纷平台使用权限
         * Summary: 开通纠纷平台使用权限
         */
        public OpenInternalJudicialResponse OpenInternalJudicialEx(OpenInternalJudicialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenInternalJudicialResponse>(DoRequest("1.0", "twc.notary.internal.judicial.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通纠纷平台使用权限
         * Summary: 开通纠纷平台使用权限
         */
        public async Task<OpenInternalJudicialResponse> OpenInternalJudicialExAsync(OpenInternalJudicialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenInternalJudicialResponse>(await DoRequestAsync("1.0", "twc.notary.internal.judicial.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件当事人信息保存
         * Summary: 案件当事人信息保存
         */
        public SaveJusticePartyResponse SaveJusticeParty(SaveJusticePartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveJusticePartyEx(request, headers, runtime);
        }

        /**
         * Description: 案件当事人信息保存
         * Summary: 案件当事人信息保存
         */
        public async Task<SaveJusticePartyResponse> SaveJusticePartyAsync(SaveJusticePartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveJusticePartyExAsync(request, headers, runtime);
        }

        /**
         * Description: 案件当事人信息保存
         * Summary: 案件当事人信息保存
         */
        public SaveJusticePartyResponse SaveJusticePartyEx(SaveJusticePartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveJusticePartyResponse>(DoRequest("1.0", "twc.notary.justice.party.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件当事人信息保存
         * Summary: 案件当事人信息保存
         */
        public async Task<SaveJusticePartyResponse> SaveJusticePartyExAsync(SaveJusticePartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveJusticePartyResponse>(await DoRequestAsync("1.0", "twc.notary.justice.party.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 普通案件创建
         * Summary: 普通案件创建
         */
        public CreateJusticeNormalcaseResponse CreateJusticeNormalcase(CreateJusticeNormalcaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateJusticeNormalcaseEx(request, headers, runtime);
        }

        /**
         * Description: 普通案件创建
         * Summary: 普通案件创建
         */
        public async Task<CreateJusticeNormalcaseResponse> CreateJusticeNormalcaseAsync(CreateJusticeNormalcaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateJusticeNormalcaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 普通案件创建
         * Summary: 普通案件创建
         */
        public CreateJusticeNormalcaseResponse CreateJusticeNormalcaseEx(CreateJusticeNormalcaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeNormalcaseResponse>(DoRequest("1.0", "twc.notary.justice.normalcase.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 普通案件创建
         * Summary: 普通案件创建
         */
        public async Task<CreateJusticeNormalcaseResponse> CreateJusticeNormalcaseExAsync(CreateJusticeNormalcaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeNormalcaseResponse>(await DoRequestAsync("1.0", "twc.notary.justice.normalcase.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上案件创建
         * Summary: 链上案件创建
         */
        public CreateJusticeChaincaseResponse CreateJusticeChaincase(CreateJusticeChaincaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateJusticeChaincaseEx(request, headers, runtime);
        }

        /**
         * Description: 链上案件创建
         * Summary: 链上案件创建
         */
        public async Task<CreateJusticeChaincaseResponse> CreateJusticeChaincaseAsync(CreateJusticeChaincaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateJusticeChaincaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上案件创建
         * Summary: 链上案件创建
         */
        public CreateJusticeChaincaseResponse CreateJusticeChaincaseEx(CreateJusticeChaincaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeChaincaseResponse>(DoRequest("1.0", "twc.notary.justice.chaincase.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上案件创建
         * Summary: 链上案件创建
         */
        public async Task<CreateJusticeChaincaseResponse> CreateJusticeChaincaseExAsync(CreateJusticeChaincaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeChaincaseResponse>(await DoRequestAsync("1.0", "twc.notary.justice.chaincase.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件维权发起
         * Summary: 案件维权发起
         */
        public StartJusticeCaseResponse StartJusticeCase(StartJusticeCaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartJusticeCaseEx(request, headers, runtime);
        }

        /**
         * Description: 案件维权发起
         * Summary: 案件维权发起
         */
        public async Task<StartJusticeCaseResponse> StartJusticeCaseAsync(StartJusticeCaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartJusticeCaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 案件维权发起
         * Summary: 案件维权发起
         */
        public StartJusticeCaseResponse StartJusticeCaseEx(StartJusticeCaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartJusticeCaseResponse>(DoRequest("1.0", "twc.notary.justice.case.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件维权发起
         * Summary: 案件维权发起
         */
        public async Task<StartJusticeCaseResponse> StartJusticeCaseExAsync(StartJusticeCaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartJusticeCaseResponse>(await DoRequestAsync("1.0", "twc.notary.justice.case.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件查询
         * Summary: 案件查询
         */
        public QueryJusticeCaseResponse QueryJusticeCase(QueryJusticeCaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryJusticeCaseEx(request, headers, runtime);
        }

        /**
         * Description: 案件查询
         * Summary: 案件查询
         */
        public async Task<QueryJusticeCaseResponse> QueryJusticeCaseAsync(QueryJusticeCaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryJusticeCaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 案件查询
         * Summary: 案件查询
         */
        public QueryJusticeCaseResponse QueryJusticeCaseEx(QueryJusticeCaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeCaseResponse>(DoRequest("1.0", "twc.notary.justice.case.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件查询
         * Summary: 案件查询
         */
        public async Task<QueryJusticeCaseResponse> QueryJusticeCaseExAsync(QueryJusticeCaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeCaseResponse>(await DoRequestAsync("1.0", "twc.notary.justice.case.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件事件响应
         * Summary: 案件事件响应
         */
        public OperateJusticeEventResponse OperateJusticeEvent(OperateJusticeEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateJusticeEventEx(request, headers, runtime);
        }

        /**
         * Description: 案件事件响应
         * Summary: 案件事件响应
         */
        public async Task<OperateJusticeEventResponse> OperateJusticeEventAsync(OperateJusticeEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateJusticeEventExAsync(request, headers, runtime);
        }

        /**
         * Description: 案件事件响应
         * Summary: 案件事件响应
         */
        public OperateJusticeEventResponse OperateJusticeEventEx(OperateJusticeEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateJusticeEventResponse>(DoRequest("1.0", "twc.notary.justice.event.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 案件事件响应
         * Summary: 案件事件响应
         */
        public async Task<OperateJusticeEventResponse> OperateJusticeEventExAsync(OperateJusticeEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateJusticeEventResponse>(await DoRequestAsync("1.0", "twc.notary.justice.event.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 司法解纷平台API服务，创建案件要素模板接口
         * Summary: 创建案件要素模板
         */
        public CreateJusticeCasetemplateResponse CreateJusticeCasetemplate(CreateJusticeCasetemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateJusticeCasetemplateEx(request, headers, runtime);
        }

        /**
         * Description: 司法解纷平台API服务，创建案件要素模板接口
         * Summary: 创建案件要素模板
         */
        public async Task<CreateJusticeCasetemplateResponse> CreateJusticeCasetemplateAsync(CreateJusticeCasetemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateJusticeCasetemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 司法解纷平台API服务，创建案件要素模板接口
         * Summary: 创建案件要素模板
         */
        public CreateJusticeCasetemplateResponse CreateJusticeCasetemplateEx(CreateJusticeCasetemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeCasetemplateResponse>(DoRequest("1.0", "twc.notary.justice.casetemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 司法解纷平台API服务，创建案件要素模板接口
         * Summary: 创建案件要素模板
         */
        public async Task<CreateJusticeCasetemplateResponse> CreateJusticeCasetemplateExAsync(CreateJusticeCasetemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeCasetemplateResponse>(await DoRequestAsync("1.0", "twc.notary.justice.casetemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 司法解纷平台API服务，创建维权要素模板接口
         * Summary: 创建维权要素模板
         */
        public CreateJusticeRightprotecttemplateResponse CreateJusticeRightprotecttemplate(CreateJusticeRightprotecttemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateJusticeRightprotecttemplateEx(request, headers, runtime);
        }

        /**
         * Description: 司法解纷平台API服务，创建维权要素模板接口
         * Summary: 创建维权要素模板
         */
        public async Task<CreateJusticeRightprotecttemplateResponse> CreateJusticeRightprotecttemplateAsync(CreateJusticeRightprotecttemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateJusticeRightprotecttemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 司法解纷平台API服务，创建维权要素模板接口
         * Summary: 创建维权要素模板
         */
        public CreateJusticeRightprotecttemplateResponse CreateJusticeRightprotecttemplateEx(CreateJusticeRightprotecttemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeRightprotecttemplateResponse>(DoRequest("1.0", "twc.notary.justice.rightprotecttemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 司法解纷平台API服务，创建维权要素模板接口
         * Summary: 创建维权要素模板
         */
        public async Task<CreateJusticeRightprotecttemplateResponse> CreateJusticeRightprotecttemplateExAsync(CreateJusticeRightprotecttemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeRightprotecttemplateResponse>(await DoRequestAsync("1.0", "twc.notary.justice.rightprotecttemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取司法文件上传链接
         * Summary: 获取司法文件上传链接
         */
        public GetJusticeFileuploadurlResponse GetJusticeFileuploadurl(GetJusticeFileuploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetJusticeFileuploadurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取司法文件上传链接
         * Summary: 获取司法文件上传链接
         */
        public async Task<GetJusticeFileuploadurlResponse> GetJusticeFileuploadurlAsync(GetJusticeFileuploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetJusticeFileuploadurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取司法文件上传链接
         * Summary: 获取司法文件上传链接
         */
        public GetJusticeFileuploadurlResponse GetJusticeFileuploadurlEx(GetJusticeFileuploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetJusticeFileuploadurlResponse>(DoRequest("1.0", "twc.notary.justice.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取司法文件上传链接
         * Summary: 获取司法文件上传链接
         */
        public async Task<GetJusticeFileuploadurlResponse> GetJusticeFileuploadurlExAsync(GetJusticeFileuploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetJusticeFileuploadurlResponse>(await DoRequestAsync("1.0", "twc.notary.justice.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 司法解纷平台API服务，创建文书要素模板接口
         * Summary: 创建文书要素模板
         */
        public CreateJusticeDocumenttemplateResponse CreateJusticeDocumenttemplate(CreateJusticeDocumenttemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateJusticeDocumenttemplateEx(request, headers, runtime);
        }

        /**
         * Description: 司法解纷平台API服务，创建文书要素模板接口
         * Summary: 创建文书要素模板
         */
        public async Task<CreateJusticeDocumenttemplateResponse> CreateJusticeDocumenttemplateAsync(CreateJusticeDocumenttemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateJusticeDocumenttemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 司法解纷平台API服务，创建文书要素模板接口
         * Summary: 创建文书要素模板
         */
        public CreateJusticeDocumenttemplateResponse CreateJusticeDocumenttemplateEx(CreateJusticeDocumenttemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeDocumenttemplateResponse>(DoRequest("1.0", "twc.notary.justice.documenttemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 司法解纷平台API服务，创建文书要素模板接口
         * Summary: 创建文书要素模板
         */
        public async Task<CreateJusticeDocumenttemplateResponse> CreateJusticeDocumenttemplateExAsync(CreateJusticeDocumenttemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeDocumenttemplateResponse>(await DoRequestAsync("1.0", "twc.notary.justice.documenttemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 仲裁-通用版本进件要素信息查询
         * Summary: 仲裁-通用版本进件要素信息查询
         */
        public QueryJusticeCommoncaseinfoResponse QueryJusticeCommoncaseinfo(QueryJusticeCommoncaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryJusticeCommoncaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 仲裁-通用版本进件要素信息查询
         * Summary: 仲裁-通用版本进件要素信息查询
         */
        public async Task<QueryJusticeCommoncaseinfoResponse> QueryJusticeCommoncaseinfoAsync(QueryJusticeCommoncaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryJusticeCommoncaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 仲裁-通用版本进件要素信息查询
         * Summary: 仲裁-通用版本进件要素信息查询
         */
        public QueryJusticeCommoncaseinfoResponse QueryJusticeCommoncaseinfoEx(QueryJusticeCommoncaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeCommoncaseinfoResponse>(DoRequest("1.0", "twc.notary.justice.commoncaseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 仲裁-通用版本进件要素信息查询
         * Summary: 仲裁-通用版本进件要素信息查询
         */
        public async Task<QueryJusticeCommoncaseinfoResponse> QueryJusticeCommoncaseinfoExAsync(QueryJusticeCommoncaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeCommoncaseinfoResponse>(await DoRequestAsync("1.0", "twc.notary.justice.commoncaseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1级商户为2级商户进件
         * Summary: 代理二级商户进件
         */
        public CreateJusticeAgentcaseResponse CreateJusticeAgentcase(CreateJusticeAgentcaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateJusticeAgentcaseEx(request, headers, runtime);
        }

        /**
         * Description: 1级商户为2级商户进件
         * Summary: 代理二级商户进件
         */
        public async Task<CreateJusticeAgentcaseResponse> CreateJusticeAgentcaseAsync(CreateJusticeAgentcaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateJusticeAgentcaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 1级商户为2级商户进件
         * Summary: 代理二级商户进件
         */
        public CreateJusticeAgentcaseResponse CreateJusticeAgentcaseEx(CreateJusticeAgentcaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeAgentcaseResponse>(DoRequest("1.0", "twc.notary.justice.agentcase.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 1级商户为2级商户进件
         * Summary: 代理二级商户进件
         */
        public async Task<CreateJusticeAgentcaseResponse> CreateJusticeAgentcaseExAsync(CreateJusticeAgentcaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateJusticeAgentcaseResponse>(await DoRequestAsync("1.0", "twc.notary.justice.agentcase.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: isv机构-案件要素查询
         * Summary: isv机构-案件要素查询
         */
        public QueryJusticeRightsResponse QueryJusticeRights(QueryJusticeRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryJusticeRightsEx(request, headers, runtime);
        }

        /**
         * Description: isv机构-案件要素查询
         * Summary: isv机构-案件要素查询
         */
        public async Task<QueryJusticeRightsResponse> QueryJusticeRightsAsync(QueryJusticeRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryJusticeRightsExAsync(request, headers, runtime);
        }

        /**
         * Description: isv机构-案件要素查询
         * Summary: isv机构-案件要素查询
         */
        public QueryJusticeRightsResponse QueryJusticeRightsEx(QueryJusticeRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeRightsResponse>(DoRequest("1.0", "twc.notary.justice.rights.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: isv机构-案件要素查询
         * Summary: isv机构-案件要素查询
         */
        public async Task<QueryJusticeRightsResponse> QueryJusticeRightsExAsync(QueryJusticeRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryJusticeRightsResponse>(await DoRequestAsync("1.0", "twc.notary.justice.rights.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: isv机构-维权状态更新
         * Summary: isv机构-维权状态更新
         */
        public UpdateJusticeRightsResponse UpdateJusticeRights(UpdateJusticeRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateJusticeRightsEx(request, headers, runtime);
        }

        /**
         * Description: isv机构-维权状态更新
         * Summary: isv机构-维权状态更新
         */
        public async Task<UpdateJusticeRightsResponse> UpdateJusticeRightsAsync(UpdateJusticeRightsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateJusticeRightsExAsync(request, headers, runtime);
        }

        /**
         * Description: isv机构-维权状态更新
         * Summary: isv机构-维权状态更新
         */
        public UpdateJusticeRightsResponse UpdateJusticeRightsEx(UpdateJusticeRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateJusticeRightsResponse>(DoRequest("1.0", "twc.notary.justice.rights.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: isv机构-维权状态更新
         * Summary: isv机构-维权状态更新
         */
        public async Task<UpdateJusticeRightsResponse> UpdateJusticeRightsExAsync(UpdateJusticeRightsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateJusticeRightsResponse>(await DoRequestAsync("1.0", "twc.notary.justice.rights.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: isv机构-案件缴费通知接口
         * Summary: isv机构-案件缴费通知接口
         */
        public NotifyJusticeRightspaymentResponse NotifyJusticeRightspayment(NotifyJusticeRightspaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyJusticeRightspaymentEx(request, headers, runtime);
        }

        /**
         * Description: isv机构-案件缴费通知接口
         * Summary: isv机构-案件缴费通知接口
         */
        public async Task<NotifyJusticeRightspaymentResponse> NotifyJusticeRightspaymentAsync(NotifyJusticeRightspaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyJusticeRightspaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: isv机构-案件缴费通知接口
         * Summary: isv机构-案件缴费通知接口
         */
        public NotifyJusticeRightspaymentResponse NotifyJusticeRightspaymentEx(NotifyJusticeRightspaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyJusticeRightspaymentResponse>(DoRequest("1.0", "twc.notary.justice.rightspayment.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: isv机构-案件缴费通知接口
         * Summary: isv机构-案件缴费通知接口
         */
        public async Task<NotifyJusticeRightspaymentResponse> NotifyJusticeRightspaymentExAsync(NotifyJusticeRightspaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyJusticeRightspaymentResponse>(await DoRequestAsync("1.0", "twc.notary.justice.rightspayment.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资服务平台上传商品类别信息
         * Summary: 融资服务平台上传商品类别信息
         */
        public CreateLeaseProductinfoResponse CreateLeaseProductinfo(CreateLeaseProductinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseProductinfoEx(request, headers, runtime);
        }

        /**
         * Description: 融资服务平台上传商品类别信息
         * Summary: 融资服务平台上传商品类别信息
         */
        public async Task<CreateLeaseProductinfoResponse> CreateLeaseProductinfoAsync(CreateLeaseProductinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseProductinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资服务平台上传商品类别信息
         * Summary: 融资服务平台上传商品类别信息
         */
        public CreateLeaseProductinfoResponse CreateLeaseProductinfoEx(CreateLeaseProductinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseProductinfoResponse>(DoRequest("1.0", "twc.notary.lease.productinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资服务平台上传商品类别信息
         * Summary: 融资服务平台上传商品类别信息
         */
        public async Task<CreateLeaseProductinfoResponse> CreateLeaseProductinfoExAsync(CreateLeaseProductinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseProductinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.productinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 升级融资租赁合约
         * Summary: 升级融资租赁合约
         */
        public UpdateLeaseContractResponse UpdateLeaseContract(UpdateLeaseContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateLeaseContractEx(request, headers, runtime);
        }

        /**
         * Description: 升级融资租赁合约
         * Summary: 升级融资租赁合约
         */
        public async Task<UpdateLeaseContractResponse> UpdateLeaseContractAsync(UpdateLeaseContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateLeaseContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 升级融资租赁合约
         * Summary: 升级融资租赁合约
         */
        public UpdateLeaseContractResponse UpdateLeaseContractEx(UpdateLeaseContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLeaseContractResponse>(DoRequest("1.0", "twc.notary.lease.contract.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 升级融资租赁合约
         * Summary: 升级融资租赁合约
         */
        public async Task<UpdateLeaseContractResponse> UpdateLeaseContractExAsync(UpdateLeaseContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateLeaseContractResponse>(await DoRequestAsync("1.0", "twc.notary.lease.contract.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台isv模式代理商户入驻
         * Summary: 租赁平台isv模式代理商户入驻
         */
        public CreateLeaseAssetagentregisterResponse CreateLeaseAssetagentregister(CreateLeaseAssetagentregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseAssetagentregisterEx(request, headers, runtime);
        }

        /**
         * Description: 租赁平台isv模式代理商户入驻
         * Summary: 租赁平台isv模式代理商户入驻
         */
        public async Task<CreateLeaseAssetagentregisterResponse> CreateLeaseAssetagentregisterAsync(CreateLeaseAssetagentregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseAssetagentregisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁平台isv模式代理商户入驻
         * Summary: 租赁平台isv模式代理商户入驻
         */
        public CreateLeaseAssetagentregisterResponse CreateLeaseAssetagentregisterEx(CreateLeaseAssetagentregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAssetagentregisterResponse>(DoRequest("1.0", "twc.notary.lease.assetagentregister.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台isv模式代理商户入驻
         * Summary: 租赁平台isv模式代理商户入驻
         */
        public async Task<CreateLeaseAssetagentregisterResponse> CreateLeaseAssetagentregisterExAsync(CreateLeaseAssetagentregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAssetagentregisterResponse>(await DoRequestAsync("1.0", "twc.notary.lease.assetagentregister.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁商品信息查询接口
         * Summary: 融资租赁商品信息查询接口
         */
        public QueryLeaseProductinfoResponse QueryLeaseProductinfo(QueryLeaseProductinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseProductinfoEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁商品信息查询接口
         * Summary: 融资租赁商品信息查询接口
         */
        public async Task<QueryLeaseProductinfoResponse> QueryLeaseProductinfoAsync(QueryLeaseProductinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseProductinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁商品信息查询接口
         * Summary: 融资租赁商品信息查询接口
         */
        public QueryLeaseProductinfoResponse QueryLeaseProductinfoEx(QueryLeaseProductinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseProductinfoResponse>(DoRequest("1.0", "twc.notary.lease.productinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁商品信息查询接口
         * Summary: 融资租赁商品信息查询接口
         */
        public async Task<QueryLeaseProductinfoResponse> QueryLeaseProductinfoExAsync(QueryLeaseProductinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseProductinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.productinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步采购平台订单状态
         * Summary: 同步采购平台订单状态
         */
        public SyncLeaseSupplierorderstatusResponse SyncLeaseSupplierorderstatus(SyncLeaseSupplierorderstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncLeaseSupplierorderstatusEx(request, headers, runtime);
        }

        /**
         * Description: 同步采购平台订单状态
         * Summary: 同步采购平台订单状态
         */
        public async Task<SyncLeaseSupplierorderstatusResponse> SyncLeaseSupplierorderstatusAsync(SyncLeaseSupplierorderstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncLeaseSupplierorderstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步采购平台订单状态
         * Summary: 同步采购平台订单状态
         */
        public SyncLeaseSupplierorderstatusResponse SyncLeaseSupplierorderstatusEx(SyncLeaseSupplierorderstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncLeaseSupplierorderstatusResponse>(DoRequest("1.0", "twc.notary.lease.supplierorderstatus.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步采购平台订单状态
         * Summary: 同步采购平台订单状态
         */
        public async Task<SyncLeaseSupplierorderstatusResponse> SyncLeaseSupplierorderstatusExAsync(SyncLeaseSupplierorderstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncLeaseSupplierorderstatusResponse>(await DoRequestAsync("1.0", "twc.notary.lease.supplierorderstatus.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采购供应商初始化 
         * Summary: 采购供应商初始化 
         */
        public InitLeaseSupplierResponse InitLeaseSupplier(InitLeaseSupplierRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitLeaseSupplierEx(request, headers, runtime);
        }

        /**
         * Description: 采购供应商初始化 
         * Summary: 采购供应商初始化 
         */
        public async Task<InitLeaseSupplierResponse> InitLeaseSupplierAsync(InitLeaseSupplierRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitLeaseSupplierExAsync(request, headers, runtime);
        }

        /**
         * Description: 采购供应商初始化 
         * Summary: 采购供应商初始化 
         */
        public InitLeaseSupplierResponse InitLeaseSupplierEx(InitLeaseSupplierRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitLeaseSupplierResponse>(DoRequest("1.0", "twc.notary.lease.supplier.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采购供应商初始化 
         * Summary: 采购供应商初始化 
         */
        public async Task<InitLeaseSupplierResponse> InitLeaseSupplierExAsync(InitLeaseSupplierRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitLeaseSupplierResponse>(await DoRequestAsync("1.0", "twc.notary.lease.supplier.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
         * Summary: 租赁订单接收采购状态信息，完成采购流程
         */
        public FinishLeaseSupplierstatusResponse FinishLeaseSupplierstatus(FinishLeaseSupplierstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishLeaseSupplierstatusEx(request, headers, runtime);
        }

        /**
         * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
         * Summary: 租赁订单接收采购状态信息，完成采购流程
         */
        public async Task<FinishLeaseSupplierstatusResponse> FinishLeaseSupplierstatusAsync(FinishLeaseSupplierstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishLeaseSupplierstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
         * Summary: 租赁订单接收采购状态信息，完成采购流程
         */
        public FinishLeaseSupplierstatusResponse FinishLeaseSupplierstatusEx(FinishLeaseSupplierstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishLeaseSupplierstatusResponse>(DoRequest("1.0", "twc.notary.lease.supplierstatus.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
         * Summary: 租赁订单接收采购状态信息，完成采购流程
         */
        public async Task<FinishLeaseSupplierstatusResponse> FinishLeaseSupplierstatusExAsync(FinishLeaseSupplierstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishLeaseSupplierstatusResponse>(await DoRequestAsync("1.0", "twc.notary.lease.supplierstatus.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采购商品初始化 
         * Summary: 采购商品初始化 
         */
        public CreateLeaseSupplierproductResponse CreateLeaseSupplierproduct(CreateLeaseSupplierproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseSupplierproductEx(request, headers, runtime);
        }

        /**
         * Description: 采购商品初始化 
         * Summary: 采购商品初始化 
         */
        public async Task<CreateLeaseSupplierproductResponse> CreateLeaseSupplierproductAsync(CreateLeaseSupplierproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseSupplierproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 采购商品初始化 
         * Summary: 采购商品初始化 
         */
        public CreateLeaseSupplierproductResponse CreateLeaseSupplierproductEx(CreateLeaseSupplierproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseSupplierproductResponse>(DoRequest("1.0", "twc.notary.lease.supplierproduct.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采购商品初始化 
         * Summary: 采购商品初始化 
         */
        public async Task<CreateLeaseSupplierproductResponse> CreateLeaseSupplierproductExAsync(CreateLeaseSupplierproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseSupplierproductResponse>(await DoRequestAsync("1.0", "twc.notary.lease.supplierproduct.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上采购申请
         * Summary: 链上采购申请
         */
        public ApplyLeaseSupplierorderResponse ApplyLeaseSupplierorder(ApplyLeaseSupplierorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyLeaseSupplierorderEx(request, headers, runtime);
        }

        /**
         * Description: 链上采购申请
         * Summary: 链上采购申请
         */
        public async Task<ApplyLeaseSupplierorderResponse> ApplyLeaseSupplierorderAsync(ApplyLeaseSupplierorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyLeaseSupplierorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上采购申请
         * Summary: 链上采购申请
         */
        public ApplyLeaseSupplierorderResponse ApplyLeaseSupplierorderEx(ApplyLeaseSupplierorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyLeaseSupplierorderResponse>(DoRequest("1.0", "twc.notary.lease.supplierorder.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上采购申请
         * Summary: 链上采购申请
         */
        public async Task<ApplyLeaseSupplierorderResponse> ApplyLeaseSupplierorderExAsync(ApplyLeaseSupplierorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyLeaseSupplierorderResponse>(await DoRequestAsync("1.0", "twc.notary.lease.supplierorder.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建融资租赁提前还款人脸认证信息
         * Summary: 创建融资租赁提前还款人脸认证信息
         */
        public CreateLeaseFinancecertifyResponse CreateLeaseFinancecertify(CreateLeaseFinancecertifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseFinancecertifyEx(request, headers, runtime);
        }

        /**
         * Description: 创建融资租赁提前还款人脸认证信息
         * Summary: 创建融资租赁提前还款人脸认证信息
         */
        public async Task<CreateLeaseFinancecertifyResponse> CreateLeaseFinancecertifyAsync(CreateLeaseFinancecertifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseFinancecertifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建融资租赁提前还款人脸认证信息
         * Summary: 创建融资租赁提前还款人脸认证信息
         */
        public CreateLeaseFinancecertifyResponse CreateLeaseFinancecertifyEx(CreateLeaseFinancecertifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseFinancecertifyResponse>(DoRequest("1.0", "twc.notary.lease.financecertify.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建融资租赁提前还款人脸认证信息
         * Summary: 创建融资租赁提前还款人脸认证信息
         */
        public async Task<CreateLeaseFinancecertifyResponse> CreateLeaseFinancecertifyExAsync(CreateLeaseFinancecertifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseFinancecertifyResponse>(await DoRequestAsync("1.0", "twc.notary.lease.financecertify.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁提前还款人脸识别核验
         * Summary: 融资租赁提前还款人脸识别核验
         */
        public QueryLeaseFinancecertifyResponse QueryLeaseFinancecertify(QueryLeaseFinancecertifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseFinancecertifyEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁提前还款人脸识别核验
         * Summary: 融资租赁提前还款人脸识别核验
         */
        public async Task<QueryLeaseFinancecertifyResponse> QueryLeaseFinancecertifyAsync(QueryLeaseFinancecertifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseFinancecertifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁提前还款人脸识别核验
         * Summary: 融资租赁提前还款人脸识别核验
         */
        public QueryLeaseFinancecertifyResponse QueryLeaseFinancecertifyEx(QueryLeaseFinancecertifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseFinancecertifyResponse>(DoRequest("1.0", "twc.notary.lease.financecertify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁提前还款人脸识别核验
         * Summary: 融资租赁提前还款人脸识别核验
         */
        public async Task<QueryLeaseFinancecertifyResponse> QueryLeaseFinancecertifyExAsync(QueryLeaseFinancecertifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseFinancecertifyResponse>(await DoRequestAsync("1.0", "twc.notary.lease.financecertify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询融资租赁合约内核验结果
         * Summary: 查询融资租赁合约内核验结果
         */
        public QueryLeaseFinancecertifyincontractResponse QueryLeaseFinancecertifyincontract(QueryLeaseFinancecertifyincontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseFinancecertifyincontractEx(request, headers, runtime);
        }

        /**
         * Description: 查询融资租赁合约内核验结果
         * Summary: 查询融资租赁合约内核验结果
         */
        public async Task<QueryLeaseFinancecertifyincontractResponse> QueryLeaseFinancecertifyincontractAsync(QueryLeaseFinancecertifyincontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseFinancecertifyincontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询融资租赁合约内核验结果
         * Summary: 查询融资租赁合约内核验结果
         */
        public QueryLeaseFinancecertifyincontractResponse QueryLeaseFinancecertifyincontractEx(QueryLeaseFinancecertifyincontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseFinancecertifyincontractResponse>(DoRequest("1.0", "twc.notary.lease.financecertifyincontract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询融资租赁合约内核验结果
         * Summary: 查询融资租赁合约内核验结果
         */
        public async Task<QueryLeaseFinancecertifyincontractResponse> QueryLeaseFinancecertifyincontractExAsync(QueryLeaseFinancecertifyincontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseFinancecertifyincontractResponse>(await DoRequestAsync("1.0", "twc.notary.lease.financecertifyincontract.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁用户信息查询
         * Summary: 融资租赁用户信息查询
         */
        public QueryLeaseUserResponse QueryLeaseUser(QueryLeaseUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseUserEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁用户信息查询
         * Summary: 融资租赁用户信息查询
         */
        public async Task<QueryLeaseUserResponse> QueryLeaseUserAsync(QueryLeaseUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁用户信息查询
         * Summary: 融资租赁用户信息查询
         */
        public QueryLeaseUserResponse QueryLeaseUserEx(QueryLeaseUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseUserResponse>(DoRequest("1.0", "twc.notary.lease.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁用户信息查询
         * Summary: 融资租赁用户信息查询
         */
        public async Task<QueryLeaseUserResponse> QueryLeaseUserExAsync(QueryLeaseUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseUserResponse>(await DoRequestAsync("1.0", "twc.notary.lease.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁订单详情查询
         * Summary: 融资租赁订单详情查询
         */
        public QueryLeaseOrderdetailinfoResponse QueryLeaseOrderdetailinfo(QueryLeaseOrderdetailinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseOrderdetailinfoEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁订单详情查询
         * Summary: 融资租赁订单详情查询
         */
        public async Task<QueryLeaseOrderdetailinfoResponse> QueryLeaseOrderdetailinfoAsync(QueryLeaseOrderdetailinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseOrderdetailinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁订单详情查询
         * Summary: 融资租赁订单详情查询
         */
        public QueryLeaseOrderdetailinfoResponse QueryLeaseOrderdetailinfoEx(QueryLeaseOrderdetailinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseOrderdetailinfoResponse>(DoRequest("1.0", "twc.notary.lease.orderdetailinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁订单详情查询
         * Summary: 融资租赁订单详情查询
         */
        public async Task<QueryLeaseOrderdetailinfoResponse> QueryLeaseOrderdetailinfoExAsync(QueryLeaseOrderdetailinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseOrderdetailinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.orderdetailinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁租赁机构承诺查询
         * Summary: 融资租赁租赁机构承诺查询
         */
        public QueryLeaseLeasepromiseResponse QueryLeaseLeasepromise(QueryLeaseLeasepromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseLeasepromiseEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁租赁机构承诺查询
         * Summary: 融资租赁租赁机构承诺查询
         */
        public async Task<QueryLeaseLeasepromiseResponse> QueryLeaseLeasepromiseAsync(QueryLeaseLeasepromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseLeasepromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁租赁机构承诺查询
         * Summary: 融资租赁租赁机构承诺查询
         */
        public QueryLeaseLeasepromiseResponse QueryLeaseLeasepromiseEx(QueryLeaseLeasepromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseLeasepromiseResponse>(DoRequest("1.0", "twc.notary.lease.leasepromise.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁租赁机构承诺查询
         * Summary: 融资租赁租赁机构承诺查询
         */
        public async Task<QueryLeaseLeasepromiseResponse> QueryLeaseLeasepromiseExAsync(QueryLeaseLeasepromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseLeasepromiseResponse>(await DoRequestAsync("1.0", "twc.notary.lease.leasepromise.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁资方承诺查询
         * Summary: 融资租赁资方承诺查询
         */
        public QueryLeaseCreditpromiseResponse QueryLeaseCreditpromise(QueryLeaseCreditpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseCreditpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁资方承诺查询
         * Summary: 融资租赁资方承诺查询
         */
        public async Task<QueryLeaseCreditpromiseResponse> QueryLeaseCreditpromiseAsync(QueryLeaseCreditpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseCreditpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁资方承诺查询
         * Summary: 融资租赁资方承诺查询
         */
        public QueryLeaseCreditpromiseResponse QueryLeaseCreditpromiseEx(QueryLeaseCreditpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseCreditpromiseResponse>(DoRequest("1.0", "twc.notary.lease.creditpromise.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁资方承诺查询
         * Summary: 融资租赁资方承诺查询
         */
        public async Task<QueryLeaseCreditpromiseResponse> QueryLeaseCreditpromiseExAsync(QueryLeaseCreditpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseCreditpromiseResponse>(await DoRequestAsync("1.0", "twc.notary.lease.creditpromise.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁订单清分信息查询
         * Summary: 融资租赁订单清分信息查询
         */
        public QueryLeaseClearingResponse QueryLeaseClearing(QueryLeaseClearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseClearingEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁订单清分信息查询
         * Summary: 融资租赁订单清分信息查询
         */
        public async Task<QueryLeaseClearingResponse> QueryLeaseClearingAsync(QueryLeaseClearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseClearingExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁订单清分信息查询
         * Summary: 融资租赁订单清分信息查询
         */
        public QueryLeaseClearingResponse QueryLeaseClearingEx(QueryLeaseClearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseClearingResponse>(DoRequest("1.0", "twc.notary.lease.clearing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁订单清分信息查询
         * Summary: 融资租赁订单清分信息查询
         */
        public async Task<QueryLeaseClearingResponse> QueryLeaseClearingExAsync(QueryLeaseClearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseClearingResponse>(await DoRequestAsync("1.0", "twc.notary.lease.clearing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁用户侧还款信息
         * Summary: 融资租赁用户侧还款信息
         */
        public QueryLeaseRentalinfoResponse QueryLeaseRentalinfo(QueryLeaseRentalinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseRentalinfoEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁用户侧还款信息
         * Summary: 融资租赁用户侧还款信息
         */
        public async Task<QueryLeaseRentalinfoResponse> QueryLeaseRentalinfoAsync(QueryLeaseRentalinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseRentalinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁用户侧还款信息
         * Summary: 融资租赁用户侧还款信息
         */
        public QueryLeaseRentalinfoResponse QueryLeaseRentalinfoEx(QueryLeaseRentalinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRentalinfoResponse>(DoRequest("1.0", "twc.notary.lease.rentalinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁用户侧还款信息
         * Summary: 融资租赁用户侧还款信息
         */
        public async Task<QueryLeaseRentalinfoResponse> QueryLeaseRentalinfoExAsync(QueryLeaseRentalinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRentalinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.rentalinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁资方还款信息查询
         * Summary: 融资租赁资方还款信息查询
         */
        public QueryLeaseRepaymentResponse QueryLeaseRepayment(QueryLeaseRepaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseRepaymentEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁资方还款信息查询
         * Summary: 融资租赁资方还款信息查询
         */
        public async Task<QueryLeaseRepaymentResponse> QueryLeaseRepaymentAsync(QueryLeaseRepaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseRepaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁资方还款信息查询
         * Summary: 融资租赁资方还款信息查询
         */
        public QueryLeaseRepaymentResponse QueryLeaseRepaymentEx(QueryLeaseRepaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRepaymentResponse>(DoRequest("1.0", "twc.notary.lease.repayment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁资方还款信息查询
         * Summary: 融资租赁资方还款信息查询
         */
        public async Task<QueryLeaseRepaymentResponse> QueryLeaseRepaymentExAsync(QueryLeaseRepaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRepaymentResponse>(await DoRequestAsync("1.0", "twc.notary.lease.repayment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单商品信息
         * Summary: 查询订单商品信息
         */
        public QueryLeaseOrderproductResponse QueryLeaseOrderproduct(QueryLeaseOrderproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseOrderproductEx(request, headers, runtime);
        }

        /**
         * Description: 查询订单商品信息
         * Summary: 查询订单商品信息
         */
        public async Task<QueryLeaseOrderproductResponse> QueryLeaseOrderproductAsync(QueryLeaseOrderproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseOrderproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询订单商品信息
         * Summary: 查询订单商品信息
         */
        public QueryLeaseOrderproductResponse QueryLeaseOrderproductEx(QueryLeaseOrderproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseOrderproductResponse>(DoRequest("1.0", "twc.notary.lease.orderproduct.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询订单商品信息
         * Summary: 查询订单商品信息
         */
        public async Task<QueryLeaseOrderproductResponse> QueryLeaseOrderproductExAsync(QueryLeaseOrderproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseOrderproductResponse>(await DoRequestAsync("1.0", "twc.notary.lease.orderproduct.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁查询资金方信息
         * Summary: 融资租赁查询资金方信息
         */
        public QueryLeaseFinancecreditResponse QueryLeaseFinancecredit(QueryLeaseFinancecreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseFinancecreditEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁查询资金方信息
         * Summary: 融资租赁查询资金方信息
         */
        public async Task<QueryLeaseFinancecreditResponse> QueryLeaseFinancecreditAsync(QueryLeaseFinancecreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseFinancecreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁查询资金方信息
         * Summary: 融资租赁查询资金方信息
         */
        public QueryLeaseFinancecreditResponse QueryLeaseFinancecreditEx(QueryLeaseFinancecreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseFinancecreditResponse>(DoRequest("1.0", "twc.notary.lease.financecredit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁查询资金方信息
         * Summary: 融资租赁查询资金方信息
         */
        public async Task<QueryLeaseFinancecreditResponse> QueryLeaseFinancecreditExAsync(QueryLeaseFinancecreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseFinancecreditResponse>(await DoRequestAsync("1.0", "twc.notary.lease.financecredit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据资产包id分页查询再融资订单id
         * Summary: 分页查询再融资订单id
         */
        public QueryRefinanceOrderidResponse QueryRefinanceOrderid(QueryRefinanceOrderidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRefinanceOrderidEx(request, headers, runtime);
        }

        /**
         * Description: 根据资产包id分页查询再融资订单id
         * Summary: 分页查询再融资订单id
         */
        public async Task<QueryRefinanceOrderidResponse> QueryRefinanceOrderidAsync(QueryRefinanceOrderidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRefinanceOrderidExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据资产包id分页查询再融资订单id
         * Summary: 分页查询再融资订单id
         */
        public QueryRefinanceOrderidResponse QueryRefinanceOrderidEx(QueryRefinanceOrderidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRefinanceOrderidResponse>(DoRequest("1.0", "twc.notary.refinance.orderid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据资产包id分页查询再融资订单id
         * Summary: 分页查询再融资订单id
         */
        public async Task<QueryRefinanceOrderidResponse> QueryRefinanceOrderidExAsync(QueryRefinanceOrderidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRefinanceOrderidResponse>(await DoRequestAsync("1.0", "twc.notary.refinance.orderid.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产明细查询
         * Summary: 资产明细
         */
        public QueryRefinanceOrderResponse QueryRefinanceOrder(QueryRefinanceOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRefinanceOrderEx(request, headers, runtime);
        }

        /**
         * Description: 资产明细查询
         * Summary: 资产明细
         */
        public async Task<QueryRefinanceOrderResponse> QueryRefinanceOrderAsync(QueryRefinanceOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRefinanceOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产明细查询
         * Summary: 资产明细
         */
        public QueryRefinanceOrderResponse QueryRefinanceOrderEx(QueryRefinanceOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRefinanceOrderResponse>(DoRequest("1.0", "twc.notary.refinance.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产明细查询
         * Summary: 资产明细
         */
        public async Task<QueryRefinanceOrderResponse> QueryRefinanceOrderExAsync(QueryRefinanceOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRefinanceOrderResponse>(await DoRequestAsync("1.0", "twc.notary.refinance.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 再融资的商品信息查询
         * Summary: 再融资的商品信息查询
         */
        public QueryRefinanceProductResponse QueryRefinanceProduct(QueryRefinanceProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRefinanceProductEx(request, headers, runtime);
        }

        /**
         * Description: 再融资的商品信息查询
         * Summary: 再融资的商品信息查询
         */
        public async Task<QueryRefinanceProductResponse> QueryRefinanceProductAsync(QueryRefinanceProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRefinanceProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 再融资的商品信息查询
         * Summary: 再融资的商品信息查询
         */
        public QueryRefinanceProductResponse QueryRefinanceProductEx(QueryRefinanceProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRefinanceProductResponse>(DoRequest("1.0", "twc.notary.refinance.product.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 再融资的商品信息查询
         * Summary: 再融资的商品信息查询
         */
        public async Task<QueryRefinanceProductResponse> QueryRefinanceProductExAsync(QueryRefinanceProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRefinanceProductResponse>(await DoRequestAsync("1.0", "twc.notary.refinance.product.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产包的受让/驳回资产包
         * Summary: 资产包的受让/驳回资产包
         */
        public VerifyRefinancePackageResponse VerifyRefinancePackage(VerifyRefinancePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyRefinancePackageEx(request, headers, runtime);
        }

        /**
         * Description: 资产包的受让/驳回资产包
         * Summary: 资产包的受让/驳回资产包
         */
        public async Task<VerifyRefinancePackageResponse> VerifyRefinancePackageAsync(VerifyRefinancePackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyRefinancePackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产包的受让/驳回资产包
         * Summary: 资产包的受让/驳回资产包
         */
        public VerifyRefinancePackageResponse VerifyRefinancePackageEx(VerifyRefinancePackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyRefinancePackageResponse>(DoRequest("1.0", "twc.notary.refinance.package.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产包的受让/驳回资产包
         * Summary: 资产包的受让/驳回资产包
         */
        public async Task<VerifyRefinancePackageResponse> VerifyRefinancePackageExAsync(VerifyRefinancePackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyRefinancePackageResponse>(await DoRequestAsync("1.0", "twc.notary.refinance.package.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁查询清分信息
         * Summary: 融资租赁查询清分信息
         */
        public QueryLeaseOrderclearingResponse QueryLeaseOrderclearing(QueryLeaseOrderclearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseOrderclearingEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁查询清分信息
         * Summary: 融资租赁查询清分信息
         */
        public async Task<QueryLeaseOrderclearingResponse> QueryLeaseOrderclearingAsync(QueryLeaseOrderclearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseOrderclearingExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁查询清分信息
         * Summary: 融资租赁查询清分信息
         */
        public QueryLeaseOrderclearingResponse QueryLeaseOrderclearingEx(QueryLeaseOrderclearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseOrderclearingResponse>(DoRequest("1.0", "twc.notary.lease.orderclearing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁查询清分信息
         * Summary: 融资租赁查询清分信息
         */
        public async Task<QueryLeaseOrderclearingResponse> QueryLeaseOrderclearingExAsync(QueryLeaseOrderclearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseOrderclearingResponse>(await DoRequestAsync("1.0", "twc.notary.lease.orderclearing.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁提前还款详情查询
         * Summary: 融资租赁提前还款详情查询
         */
        public QueryLeaseRepaymentstatusResponse QueryLeaseRepaymentstatus(QueryLeaseRepaymentstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseRepaymentstatusEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁提前还款详情查询
         * Summary: 融资租赁提前还款详情查询
         */
        public async Task<QueryLeaseRepaymentstatusResponse> QueryLeaseRepaymentstatusAsync(QueryLeaseRepaymentstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseRepaymentstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁提前还款详情查询
         * Summary: 融资租赁提前还款详情查询
         */
        public QueryLeaseRepaymentstatusResponse QueryLeaseRepaymentstatusEx(QueryLeaseRepaymentstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRepaymentstatusResponse>(DoRequest("1.0", "twc.notary.lease.repaymentstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁提前还款详情查询
         * Summary: 融资租赁提前还款详情查询
         */
        public async Task<QueryLeaseRepaymentstatusResponse> QueryLeaseRepaymentstatusExAsync(QueryLeaseRepaymentstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRepaymentstatusResponse>(await DoRequestAsync("1.0", "twc.notary.lease.repaymentstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 续租过程中，当前资方希望查询用户历史的履约表现
         * Summary: 核验链上用户的履约情况
         */
        public QueryLeaseUserperformanceResponse QueryLeaseUserperformance(QueryLeaseUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseUserperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 续租过程中，当前资方希望查询用户历史的履约表现
         * Summary: 核验链上用户的履约情况
         */
        public async Task<QueryLeaseUserperformanceResponse> QueryLeaseUserperformanceAsync(QueryLeaseUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseUserperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 续租过程中，当前资方希望查询用户历史的履约表现
         * Summary: 核验链上用户的履约情况
         */
        public QueryLeaseUserperformanceResponse QueryLeaseUserperformanceEx(QueryLeaseUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseUserperformanceResponse>(DoRequest("1.0", "twc.notary.lease.userperformance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 续租过程中，当前资方希望查询用户历史的履约表现
         * Summary: 核验链上用户的履约情况
         */
        public async Task<QueryLeaseUserperformanceResponse> QueryLeaseUserperformanceExAsync(QueryLeaseUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseUserperformanceResponse>(await DoRequestAsync("1.0", "twc.notary.lease.userperformance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 履约流水核验查询
         * Summary: 履约流水核验查询
         */
        public QueryLeaseRentalverifyResponse QueryLeaseRentalverify(QueryLeaseRentalverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseRentalverifyEx(request, headers, runtime);
        }

        /**
         * Description: 履约流水核验查询
         * Summary: 履约流水核验查询
         */
        public async Task<QueryLeaseRentalverifyResponse> QueryLeaseRentalverifyAsync(QueryLeaseRentalverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseRentalverifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 履约流水核验查询
         * Summary: 履约流水核验查询
         */
        public QueryLeaseRentalverifyResponse QueryLeaseRentalverifyEx(QueryLeaseRentalverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRentalverifyResponse>(DoRequest("1.0", "twc.notary.lease.rentalverify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 履约流水核验查询
         * Summary: 履约流水核验查询
         */
        public async Task<QueryLeaseRentalverifyResponse> QueryLeaseRentalverifyExAsync(QueryLeaseRentalverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRentalverifyResponse>(await DoRequestAsync("1.0", "twc.notary.lease.rentalverify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分期查询用户归还记录 资方还款 清分信息
         * Summary: 分期查询用户归还记录 资方还款 清分信息
         */
        public QueryLeaseInstallmentResponse QueryLeaseInstallment(QueryLeaseInstallmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseInstallmentEx(request, headers, runtime);
        }

        /**
         * Description: 分期查询用户归还记录 资方还款 清分信息
         * Summary: 分期查询用户归还记录 资方还款 清分信息
         */
        public async Task<QueryLeaseInstallmentResponse> QueryLeaseInstallmentAsync(QueryLeaseInstallmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseInstallmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 分期查询用户归还记录 资方还款 清分信息
         * Summary: 分期查询用户归还记录 资方还款 清分信息
         */
        public QueryLeaseInstallmentResponse QueryLeaseInstallmentEx(QueryLeaseInstallmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseInstallmentResponse>(DoRequest("1.0", "twc.notary.lease.installment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分期查询用户归还记录 资方还款 清分信息
         * Summary: 分期查询用户归还记录 资方还款 清分信息
         */
        public async Task<QueryLeaseInstallmentResponse> QueryLeaseInstallmentExAsync(QueryLeaseInstallmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseInstallmentResponse>(await DoRequestAsync("1.0", "twc.notary.lease.installment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁保险退保接口
         * Summary: 租赁保险退保
         */
        public CancelLeaseInsuranceResponse CancelLeaseInsurance(CancelLeaseInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelLeaseInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 租赁保险退保接口
         * Summary: 租赁保险退保
         */
        public async Task<CancelLeaseInsuranceResponse> CancelLeaseInsuranceAsync(CancelLeaseInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelLeaseInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁保险退保接口
         * Summary: 租赁保险退保
         */
        public CancelLeaseInsuranceResponse CancelLeaseInsuranceEx(CancelLeaseInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelLeaseInsuranceResponse>(DoRequest("1.0", "twc.notary.lease.insurance.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁保险退保接口
         * Summary: 租赁保险退保
         */
        public async Task<CancelLeaseInsuranceResponse> CancelLeaseInsuranceExAsync(CancelLeaseInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelLeaseInsuranceResponse>(await DoRequestAsync("1.0", "twc.notary.lease.insurance.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
         * Summary: 再融资资产推送
         */
        public PushRefinanceInvalidorderResponse PushRefinanceInvalidorder(PushRefinanceInvalidorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushRefinanceInvalidorderEx(request, headers, runtime);
        }

        /**
         * Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
         * Summary: 再融资资产推送
         */
        public async Task<PushRefinanceInvalidorderResponse> PushRefinanceInvalidorderAsync(PushRefinanceInvalidorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushRefinanceInvalidorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
         * Summary: 再融资资产推送
         */
        public PushRefinanceInvalidorderResponse PushRefinanceInvalidorderEx(PushRefinanceInvalidorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRefinanceInvalidorderResponse>(DoRequest("1.0", "twc.notary.refinance.invalidorder.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
         * Summary: 再融资资产推送
         */
        public async Task<PushRefinanceInvalidorderResponse> PushRefinanceInvalidorderExAsync(PushRefinanceInvalidorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRefinanceInvalidorderResponse>(await DoRequestAsync("1.0", "twc.notary.refinance.invalidorder.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蚂蚁链租赁的风控
         * Summary: 蚂蚁链租赁的风控
         */
        public CreateLeaseRiskResponse CreateLeaseRisk(CreateLeaseRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseRiskEx(request, headers, runtime);
        }

        /**
         * Description: 蚂蚁链租赁的风控
         * Summary: 蚂蚁链租赁的风控
         */
        public async Task<CreateLeaseRiskResponse> CreateLeaseRiskAsync(CreateLeaseRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 蚂蚁链租赁的风控
         * Summary: 蚂蚁链租赁的风控
         */
        public CreateLeaseRiskResponse CreateLeaseRiskEx(CreateLeaseRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRiskResponse>(DoRequest("1.0", "twc.notary.lease.risk.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蚂蚁链租赁的风控
         * Summary: 蚂蚁链租赁的风控
         */
        public async Task<CreateLeaseRiskResponse> CreateLeaseRiskExAsync(CreateLeaseRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRiskResponse>(await DoRequestAsync("1.0", "twc.notary.lease.risk.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
         * Summary: 上传租赁物购买贷款订单信息（异步）
         */
        public CreateLeaseAsyncverifyinfoResponse CreateLeaseAsyncverifyinfo(CreateLeaseAsyncverifyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseAsyncverifyinfoEx(request, headers, runtime);
        }

        /**
         * Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
         * Summary: 上传租赁物购买贷款订单信息（异步）
         */
        public async Task<CreateLeaseAsyncverifyinfoResponse> CreateLeaseAsyncverifyinfoAsync(CreateLeaseAsyncverifyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseAsyncverifyinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
         * Summary: 上传租赁物购买贷款订单信息（异步）
         */
        public CreateLeaseAsyncverifyinfoResponse CreateLeaseAsyncverifyinfoEx(CreateLeaseAsyncverifyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncverifyinfoResponse>(DoRequest("1.0", "twc.notary.lease.asyncverifyinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
         * Summary: 上传租赁物购买贷款订单信息（异步）
         */
        public async Task<CreateLeaseAsyncverifyinfoResponse> CreateLeaseAsyncverifyinfoExAsync(CreateLeaseAsyncverifyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncverifyinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.asyncverifyinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
         * Summary: 融资方上传承诺信息(异步)
         */
        public CreateLeaseAsynccreditpromiseResponse CreateLeaseAsynccreditpromise(CreateLeaseAsynccreditpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseAsynccreditpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
         * Summary: 融资方上传承诺信息(异步)
         */
        public async Task<CreateLeaseAsynccreditpromiseResponse> CreateLeaseAsynccreditpromiseAsync(CreateLeaseAsynccreditpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseAsynccreditpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
         * Summary: 融资方上传承诺信息(异步)
         */
        public CreateLeaseAsynccreditpromiseResponse CreateLeaseAsynccreditpromiseEx(CreateLeaseAsynccreditpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsynccreditpromiseResponse>(DoRequest("1.0", "twc.notary.lease.asynccreditpromise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
         * Summary: 融资方上传承诺信息(异步)
         */
        public async Task<CreateLeaseAsynccreditpromiseResponse> CreateLeaseAsynccreditpromiseExAsync(CreateLeaseAsynccreditpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsynccreditpromiseResponse>(await DoRequestAsync("1.0", "twc.notary.lease.asynccreditpromise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
         * Summary: 清分服务机构上传资金清算记录，分期
         */
        public CreateLeaseAsyncclearingResponse CreateLeaseAsyncclearing(CreateLeaseAsyncclearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseAsyncclearingEx(request, headers, runtime);
        }

        /**
         * Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
         * Summary: 清分服务机构上传资金清算记录，分期
         */
        public async Task<CreateLeaseAsyncclearingResponse> CreateLeaseAsyncclearingAsync(CreateLeaseAsyncclearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseAsyncclearingExAsync(request, headers, runtime);
        }

        /**
         * Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
         * Summary: 清分服务机构上传资金清算记录，分期
         */
        public CreateLeaseAsyncclearingResponse CreateLeaseAsyncclearingEx(CreateLeaseAsyncclearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncclearingResponse>(DoRequest("1.0", "twc.notary.lease.asyncclearing.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
         * Summary: 清分服务机构上传资金清算记录，分期
         */
        public async Task<CreateLeaseAsyncclearingResponse> CreateLeaseAsyncclearingExAsync(CreateLeaseAsyncclearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncclearingResponse>(await DoRequestAsync("1.0", "twc.notary.lease.asyncclearing.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
         * Summary: 融资金融机构上传还款信息 每期
         */
        public CreateLeaseAsyncrepaymentResponse CreateLeaseAsyncrepayment(CreateLeaseAsyncrepaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseAsyncrepaymentEx(request, headers, runtime);
        }

        /**
         * Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
         * Summary: 融资金融机构上传还款信息 每期
         */
        public async Task<CreateLeaseAsyncrepaymentResponse> CreateLeaseAsyncrepaymentAsync(CreateLeaseAsyncrepaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseAsyncrepaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
         * Summary: 融资金融机构上传还款信息 每期
         */
        public CreateLeaseAsyncrepaymentResponse CreateLeaseAsyncrepaymentEx(CreateLeaseAsyncrepaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncrepaymentResponse>(DoRequest("1.0", "twc.notary.lease.asyncrepayment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
         * Summary: 融资金融机构上传还款信息 每期
         */
        public async Task<CreateLeaseAsyncrepaymentResponse> CreateLeaseAsyncrepaymentExAsync(CreateLeaseAsyncrepaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncrepaymentResponse>(await DoRequestAsync("1.0", "twc.notary.lease.asyncrepayment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
         * Summary: 融资平台审核订单信息
         */
        public CreateLeaseAsyncauditResponse CreateLeaseAsyncaudit(CreateLeaseAsyncauditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseAsyncauditEx(request, headers, runtime);
        }

        /**
         * Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
         * Summary: 融资平台审核订单信息
         */
        public async Task<CreateLeaseAsyncauditResponse> CreateLeaseAsyncauditAsync(CreateLeaseAsyncauditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseAsyncauditExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
         * Summary: 融资平台审核订单信息
         */
        public CreateLeaseAsyncauditResponse CreateLeaseAsyncauditEx(CreateLeaseAsyncauditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncauditResponse>(DoRequest("1.0", "twc.notary.lease.asyncaudit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
         * Summary: 融资平台审核订单信息
         */
        public async Task<CreateLeaseAsyncauditResponse> CreateLeaseAsyncauditExAsync(CreateLeaseAsyncauditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncauditResponse>(await DoRequestAsync("1.0", "twc.notary.lease.asyncaudit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
         * Summary: 租赁平台上传付款通知信息
         */
        public CreateLeaseAsyncpaymentfileResponse CreateLeaseAsyncpaymentfile(CreateLeaseAsyncpaymentfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseAsyncpaymentfileEx(request, headers, runtime);
        }

        /**
         * Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
         * Summary: 租赁平台上传付款通知信息
         */
        public async Task<CreateLeaseAsyncpaymentfileResponse> CreateLeaseAsyncpaymentfileAsync(CreateLeaseAsyncpaymentfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseAsyncpaymentfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
         * Summary: 租赁平台上传付款通知信息
         */
        public CreateLeaseAsyncpaymentfileResponse CreateLeaseAsyncpaymentfileEx(CreateLeaseAsyncpaymentfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncpaymentfileResponse>(DoRequest("1.0", "twc.notary.lease.asyncpaymentfile.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
         * Summary: 租赁平台上传付款通知信息
         */
        public async Task<CreateLeaseAsyncpaymentfileResponse> CreateLeaseAsyncpaymentfileExAsync(CreateLeaseAsyncpaymentfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAsyncpaymentfileResponse>(await DoRequestAsync("1.0", "twc.notary.lease.asyncpaymentfile.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
         * Summary: 查询用户等加密信息
         */
        public QueryLeaseAsyncencryptedinfoResponse QueryLeaseAsyncencryptedinfo(QueryLeaseAsyncencryptedinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseAsyncencryptedinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
         * Summary: 查询用户等加密信息
         */
        public async Task<QueryLeaseAsyncencryptedinfoResponse> QueryLeaseAsyncencryptedinfoAsync(QueryLeaseAsyncencryptedinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseAsyncencryptedinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
         * Summary: 查询用户等加密信息
         */
        public QueryLeaseAsyncencryptedinfoResponse QueryLeaseAsyncencryptedinfoEx(QueryLeaseAsyncencryptedinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseAsyncencryptedinfoResponse>(DoRequest("1.0", "twc.notary.lease.asyncencryptedinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
         * Summary: 查询用户等加密信息
         */
        public async Task<QueryLeaseAsyncencryptedinfoResponse> QueryLeaseAsyncencryptedinfoExAsync(QueryLeaseAsyncencryptedinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseAsyncencryptedinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.asyncencryptedinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁异步调用上链结果回查
         * Summary: 租赁异步调用上链结果回查
         */
        public QueryLeaseAsynccallResponse QueryLeaseAsynccall(QueryLeaseAsynccallRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseAsynccallEx(request, headers, runtime);
        }

        /**
         * Description: 租赁异步调用上链结果回查
         * Summary: 租赁异步调用上链结果回查
         */
        public async Task<QueryLeaseAsynccallResponse> QueryLeaseAsynccallAsync(QueryLeaseAsynccallRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseAsynccallExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁异步调用上链结果回查
         * Summary: 租赁异步调用上链结果回查
         */
        public QueryLeaseAsynccallResponse QueryLeaseAsynccallEx(QueryLeaseAsynccallRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseAsynccallResponse>(DoRequest("1.0", "twc.notary.lease.asynccall.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁异步调用上链结果回查
         * Summary: 租赁异步调用上链结果回查
         */
        public async Task<QueryLeaseAsynccallResponse> QueryLeaseAsynccallExAsync(QueryLeaseAsynccallRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseAsynccallResponse>(await DoRequestAsync("1.0", "twc.notary.lease.asynccall.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建签署见证流程
         * Summary: 创建见证流程
         */
        public CreateWitnessFlowResponse CreateWitnessFlow(CreateWitnessFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWitnessFlowEx(request, headers, runtime);
        }

        /**
         * Description: 创建签署见证流程
         * Summary: 创建见证流程
         */
        public async Task<CreateWitnessFlowResponse> CreateWitnessFlowAsync(CreateWitnessFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWitnessFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建签署见证流程
         * Summary: 创建见证流程
         */
        public CreateWitnessFlowResponse CreateWitnessFlowEx(CreateWitnessFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWitnessFlowResponse>(DoRequest("1.0", "twc.notary.witness.flow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建签署见证流程
         * Summary: 创建见证流程
         */
        public async Task<CreateWitnessFlowResponse> CreateWitnessFlowExAsync(CreateWitnessFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWitnessFlowResponse>(await DoRequestAsync("1.0", "twc.notary.witness.flow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存见证流程快照数据
         * Summary: 保存见证流程快照数据
         */
        public SaveWitnessSnapshotResponse SaveWitnessSnapshot(SaveWitnessSnapshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveWitnessSnapshotEx(request, headers, runtime);
        }

        /**
         * Description: 保存见证流程快照数据
         * Summary: 保存见证流程快照数据
         */
        public async Task<SaveWitnessSnapshotResponse> SaveWitnessSnapshotAsync(SaveWitnessSnapshotRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveWitnessSnapshotExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存见证流程快照数据
         * Summary: 保存见证流程快照数据
         */
        public SaveWitnessSnapshotResponse SaveWitnessSnapshotEx(SaveWitnessSnapshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveWitnessSnapshotResponse>(DoRequest("1.0", "twc.notary.witness.snapshot.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存见证流程快照数据
         * Summary: 保存见证流程快照数据
         */
        public async Task<SaveWitnessSnapshotResponse> SaveWitnessSnapshotExAsync(SaveWitnessSnapshotRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveWitnessSnapshotResponse>(await DoRequestAsync("1.0", "twc.notary.witness.snapshot.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 见证流程签署权限校验
         * Summary: 见证流程签署权限校验
         */
        public CheckWitnessSignaccessResponse CheckWitnessSignaccess(CheckWitnessSignaccessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckWitnessSignaccessEx(request, headers, runtime);
        }

        /**
         * Description: 见证流程签署权限校验
         * Summary: 见证流程签署权限校验
         */
        public async Task<CheckWitnessSignaccessResponse> CheckWitnessSignaccessAsync(CheckWitnessSignaccessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckWitnessSignaccessExAsync(request, headers, runtime);
        }

        /**
         * Description: 见证流程签署权限校验
         * Summary: 见证流程签署权限校验
         */
        public CheckWitnessSignaccessResponse CheckWitnessSignaccessEx(CheckWitnessSignaccessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckWitnessSignaccessResponse>(DoRequest("1.0", "twc.notary.witness.signaccess.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 见证流程签署权限校验
         * Summary: 见证流程签署权限校验
         */
        public async Task<CheckWitnessSignaccessResponse> CheckWitnessSignaccessExAsync(CheckWitnessSignaccessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckWitnessSignaccessResponse>(await DoRequestAsync("1.0", "twc.notary.witness.signaccess.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 见证流程签署
         * Summary: 见证流程签署
         */
        public AuthWitnessFlowResponse AuthWitnessFlow(AuthWitnessFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthWitnessFlowEx(request, headers, runtime);
        }

        /**
         * Description: 见证流程签署
         * Summary: 见证流程签署
         */
        public async Task<AuthWitnessFlowResponse> AuthWitnessFlowAsync(AuthWitnessFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthWitnessFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 见证流程签署
         * Summary: 见证流程签署
         */
        public AuthWitnessFlowResponse AuthWitnessFlowEx(AuthWitnessFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthWitnessFlowResponse>(DoRequest("1.0", "twc.notary.witness.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 见证流程签署
         * Summary: 见证流程签署
         */
        public async Task<AuthWitnessFlowResponse> AuthWitnessFlowExAsync(AuthWitnessFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthWitnessFlowResponse>(await DoRequestAsync("1.0", "twc.notary.witness.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 见证流程签署确认
         * Summary: 见证流程签署确认
         */
        public ConfirmWitnessFlowResponse ConfirmWitnessFlow(ConfirmWitnessFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmWitnessFlowEx(request, headers, runtime);
        }

        /**
         * Description: 见证流程签署确认
         * Summary: 见证流程签署确认
         */
        public async Task<ConfirmWitnessFlowResponse> ConfirmWitnessFlowAsync(ConfirmWitnessFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmWitnessFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 见证流程签署确认
         * Summary: 见证流程签署确认
         */
        public ConfirmWitnessFlowResponse ConfirmWitnessFlowEx(ConfirmWitnessFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmWitnessFlowResponse>(DoRequest("1.0", "twc.notary.witness.flow.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 见证流程签署确认
         * Summary: 见证流程签署确认
         */
        public async Task<ConfirmWitnessFlowResponse> ConfirmWitnessFlowExAsync(ConfirmWitnessFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmWitnessFlowResponse>(await DoRequestAsync("1.0", "twc.notary.witness.flow.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取存证事务ID
         * Summary: 获取存证事务ID
         */
        public CreateTransResponse CreateTrans(CreateTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTransEx(request, headers, runtime);
        }

        /**
         * Description: 获取存证事务ID
         * Summary: 获取存证事务ID
         */
        public async Task<CreateTransResponse> CreateTransAsync(CreateTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTransExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取存证事务ID
         * Summary: 获取存证事务ID
         */
        public CreateTransResponse CreateTransEx(CreateTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTransResponse>(DoRequest("1.0", "twc.notary.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取存证事务ID
         * Summary: 获取存证事务ID
         */
        public async Task<CreateTransResponse> CreateTransExAsync(CreateTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTransResponse>(await DoRequestAsync("1.0", "twc.notary.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过存证事务Token，获取事务中所有的存证信息
         * Summary: 获取事务中所有的存证信息
         */
        public GetTransResponse GetTrans(GetTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTransEx(request, headers, runtime);
        }

        /**
         * Description: 通过存证事务Token，获取事务中所有的存证信息
         * Summary: 获取事务中所有的存证信息
         */
        public async Task<GetTransResponse> GetTransAsync(GetTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTransExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过存证事务Token，获取事务中所有的存证信息
         * Summary: 获取事务中所有的存证信息
         */
        public GetTransResponse GetTransEx(GetTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransResponse>(DoRequest("1.0", "twc.notary.trans.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过存证事务Token，获取事务中所有的存证信息
         * Summary: 获取事务中所有的存证信息
         */
        public async Task<GetTransResponse> GetTransExAsync(GetTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTransResponse>(await DoRequestAsync("1.0", "twc.notary.trans.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文本存证，将文本内容存证上链
         * Summary: 文本存证，将文本内容存证上链
         */
        public CreateTextResponse CreateText(CreateTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTextEx(request, headers, runtime);
        }

        /**
         * Description: 发起文本存证，将文本内容存证上链
         * Summary: 文本存证，将文本内容存证上链
         */
        public async Task<CreateTextResponse> CreateTextAsync(CreateTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起文本存证，将文本内容存证上链
         * Summary: 文本存证，将文本内容存证上链
         */
        public CreateTextResponse CreateTextEx(CreateTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTextResponse>(DoRequest("1.0", "twc.notary.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文本存证，将文本内容存证上链
         * Summary: 文本存证，将文本内容存证上链
         */
        public async Task<CreateTextResponse> CreateTextExAsync(CreateTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTextResponse>(await DoRequestAsync("1.0", "twc.notary.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文本存证内容
         * Summary: 获取文本存证内容
         */
        public GetTextResponse GetText(GetTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTextEx(request, headers, runtime);
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文本存证内容
         * Summary: 获取文本存证内容
         */
        public async Task<GetTextResponse> GetTextAsync(GetTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文本存证内容
         * Summary: 获取文本存证内容
         */
        public GetTextResponse GetTextEx(GetTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTextResponse>(DoRequest("1.0", "twc.notary.text.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文本存证内容
         * Summary: 获取文本存证内容
         */
        public async Task<GetTextResponse> GetTextExAsync(GetTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTextResponse>(await DoRequestAsync("1.0", "twc.notary.text.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链
         * Summary: 文件内容存证上链
         */
        public CreateFileResponse CreateFile(CreateFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFileEx(request, headers, runtime);
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链
         * Summary: 文件内容存证上链
         */
        public async Task<CreateFileResponse> CreateFileAsync(CreateFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链
         * Summary: 文件内容存证上链
         */
        public CreateFileResponse CreateFileEx(CreateFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFileResponse>(DoRequest("1.0", "twc.notary.file.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链
         * Summary: 文件内容存证上链
         */
        public async Task<CreateFileResponse> CreateFileExAsync(CreateFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFileResponse>(await DoRequestAsync("1.0", "twc.notary.file.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
         * Summary: 获取文件存证oss下载地址
         */
        public GetFileResponse GetFile(GetFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFileEx(request, headers, runtime);
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
         * Summary: 获取文件存证oss下载地址
         */
        public async Task<GetFileResponse> GetFileAsync(GetFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
         * Summary: 获取文件存证oss下载地址
         */
        public GetFileResponse GetFileEx(GetFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFileResponse>(DoRequest("1.0", "twc.notary.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
         * Summary: 获取文件存证oss下载地址
         */
        public async Task<GetFileResponse> GetFileExAsync(GetFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFileResponse>(await DoRequestAsync("1.0", "twc.notary.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起原文存证，将原文内容存证上链
         * Summary: 原文内容存证
         */
        public CreateSourceResponse CreateSource(CreateSourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSourceEx(request, headers, runtime);
        }

        /**
         * Description: 发起原文存证，将原文内容存证上链
         * Summary: 原文内容存证
         */
        public async Task<CreateSourceResponse> CreateSourceAsync(CreateSourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起原文存证，将原文内容存证上链
         * Summary: 原文内容存证
         */
        public CreateSourceResponse CreateSourceEx(CreateSourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSourceResponse>(DoRequest("1.0", "twc.notary.source.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起原文存证，将原文内容存证上链
         * Summary: 原文内容存证
         */
        public async Task<CreateSourceResponse> CreateSourceExAsync(CreateSourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSourceResponse>(await DoRequestAsync("1.0", "twc.notary.source.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
         * Summary: 获取原文存证oss下载地址
         */
        public GetSourceResponse GetSource(GetSourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSourceEx(request, headers, runtime);
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
         * Summary: 获取原文存证oss下载地址
         */
        public async Task<GetSourceResponse> GetSourceAsync(GetSourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
         * Summary: 获取原文存证oss下载地址
         */
        public GetSourceResponse GetSourceEx(GetSourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSourceResponse>(DoRequest("1.0", "twc.notary.source.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
         * Summary: 获取原文存证oss下载地址
         */
        public async Task<GetSourceResponse> GetSourceExAsync(GetSourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSourceResponse>(await DoRequestAsync("1.0", "twc.notary.source.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建存证后，使用存证凭据核验存证状态。
         * Summary: 存证内容核验
         */
        public CheckStatusResponse CheckStatus(CheckStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckStatusEx(request, headers, runtime);
        }

        /**
         * Description: 创建存证后，使用存证凭据核验存证状态。
         * Summary: 存证内容核验
         */
        public async Task<CheckStatusResponse> CheckStatusAsync(CheckStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建存证后，使用存证凭据核验存证状态。
         * Summary: 存证内容核验
         */
        public CheckStatusResponse CheckStatusEx(CheckStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckStatusResponse>(DoRequest("1.0", "twc.notary.status.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建存证后，使用存证凭据核验存证状态。
         * Summary: 存证内容核验
         */
        public async Task<CheckStatusResponse> CheckStatusExAsync(CheckStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckStatusResponse>(await DoRequestAsync("1.0", "twc.notary.status.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资服务平台部署合约
         * Summary: 融资服务平台部署合约
         */
        public DeployLeaseContractResponse DeployLeaseContract(DeployLeaseContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeployLeaseContractEx(request, headers, runtime);
        }

        /**
         * Description: 融资服务平台部署合约
         * Summary: 融资服务平台部署合约
         */
        public async Task<DeployLeaseContractResponse> DeployLeaseContractAsync(DeployLeaseContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeployLeaseContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资服务平台部署合约
         * Summary: 融资服务平台部署合约
         */
        public DeployLeaseContractResponse DeployLeaseContractEx(DeployLeaseContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeployLeaseContractResponse>(DoRequest("1.0", "twc.notary.lease.contract.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资服务平台部署合约
         * Summary: 融资服务平台部署合约
         */
        public async Task<DeployLeaseContractResponse> DeployLeaseContractExAsync(DeployLeaseContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeployLeaseContractResponse>(await DoRequestAsync("1.0", "twc.notary.lease.contract.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁服务平台授权融资服务平台
         * Summary: 租赁服务平台授权融资服务平台
         */
        public AuthLeaseContractResponse AuthLeaseContract(AuthLeaseContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthLeaseContractEx(request, headers, runtime);
        }

        /**
         * Description: 租赁服务平台授权融资服务平台
         * Summary: 租赁服务平台授权融资服务平台
         */
        public async Task<AuthLeaseContractResponse> AuthLeaseContractAsync(AuthLeaseContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthLeaseContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁服务平台授权融资服务平台
         * Summary: 租赁服务平台授权融资服务平台
         */
        public AuthLeaseContractResponse AuthLeaseContractEx(AuthLeaseContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthLeaseContractResponse>(DoRequest("1.0", "twc.notary.lease.contract.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁服务平台授权融资服务平台
         * Summary: 租赁服务平台授权融资服务平台
         */
        public async Task<AuthLeaseContractResponse> AuthLeaseContractExAsync(AuthLeaseContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthLeaseContractResponse>(await DoRequestAsync("1.0", "twc.notary.lease.contract.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁服务平台上传用户信息
         * Summary: 租赁服务平台上传用户信息
         */
        public CreateLeaseUserinfoResponse CreateLeaseUserinfo(CreateLeaseUserinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseUserinfoEx(request, headers, runtime);
        }

        /**
         * Description: 租赁服务平台上传用户信息
         * Summary: 租赁服务平台上传用户信息
         */
        public async Task<CreateLeaseUserinfoResponse> CreateLeaseUserinfoAsync(CreateLeaseUserinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseUserinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁服务平台上传用户信息
         * Summary: 租赁服务平台上传用户信息
         */
        public CreateLeaseUserinfoResponse CreateLeaseUserinfoEx(CreateLeaseUserinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseUserinfoResponse>(DoRequest("1.0", "twc.notary.lease.userinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁服务平台上传用户信息
         * Summary: 租赁服务平台上传用户信息
         */
        public async Task<CreateLeaseUserinfoResponse> CreateLeaseUserinfoExAsync(CreateLeaseUserinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseUserinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.userinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁服务平台上传订单产品/服务信息
         * Summary: 租赁服务平台上传订单产品/服务信息
         */
        public CreateLeaseOrderinfoResponse CreateLeaseOrderinfo(CreateLeaseOrderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseOrderinfoEx(request, headers, runtime);
        }

        /**
         * Description: 租赁服务平台上传订单产品/服务信息
         * Summary: 租赁服务平台上传订单产品/服务信息
         */
        public async Task<CreateLeaseOrderinfoResponse> CreateLeaseOrderinfoAsync(CreateLeaseOrderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseOrderinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁服务平台上传订单产品/服务信息
         * Summary: 租赁服务平台上传订单产品/服务信息
         */
        public CreateLeaseOrderinfoResponse CreateLeaseOrderinfoEx(CreateLeaseOrderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseOrderinfoResponse>(DoRequest("1.0", "twc.notary.lease.orderinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁服务平台上传订单产品/服务信息
         * Summary: 租赁服务平台上传订单产品/服务信息
         */
        public async Task<CreateLeaseOrderinfoResponse> CreateLeaseOrderinfoExAsync(CreateLeaseOrderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseOrderinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.orderinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁服务平台上传承诺信息
         * Summary: 租赁服务平台上传承诺信息
         */
        public CreateLeasePromiseResponse CreateLeasePromise(CreateLeasePromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeasePromiseEx(request, headers, runtime);
        }

        /**
         * Description: 租赁服务平台上传承诺信息
         * Summary: 租赁服务平台上传承诺信息
         */
        public async Task<CreateLeasePromiseResponse> CreateLeasePromiseAsync(CreateLeasePromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeasePromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁服务平台上传承诺信息
         * Summary: 租赁服务平台上传承诺信息
         */
        public CreateLeasePromiseResponse CreateLeasePromiseEx(CreateLeasePromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeasePromiseResponse>(DoRequest("1.0", "twc.notary.lease.promise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁服务平台上传承诺信息
         * Summary: 租赁服务平台上传承诺信息
         */
        public async Task<CreateLeasePromiseResponse> CreateLeasePromiseExAsync(CreateLeasePromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeasePromiseResponse>(await DoRequestAsync("1.0", "twc.notary.lease.promise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资平台上传租赁物购买贷款订单信息
         * Summary: 融资平台上传租赁物购买贷款订单信息
         */
        public CreateLeaseVerifyinfoResponse CreateLeaseVerifyinfo(CreateLeaseVerifyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseVerifyinfoEx(request, headers, runtime);
        }

        /**
         * Description: 融资平台上传租赁物购买贷款订单信息
         * Summary: 融资平台上传租赁物购买贷款订单信息
         */
        public async Task<CreateLeaseVerifyinfoResponse> CreateLeaseVerifyinfoAsync(CreateLeaseVerifyinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseVerifyinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资平台上传租赁物购买贷款订单信息
         * Summary: 融资平台上传租赁物购买贷款订单信息
         */
        public CreateLeaseVerifyinfoResponse CreateLeaseVerifyinfoEx(CreateLeaseVerifyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseVerifyinfoResponse>(DoRequest("1.0", "twc.notary.lease.verifyinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资平台上传租赁物购买贷款订单信息
         * Summary: 融资平台上传租赁物购买贷款订单信息
         */
        public async Task<CreateLeaseVerifyinfoResponse> CreateLeaseVerifyinfoExAsync(CreateLeaseVerifyinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseVerifyinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.verifyinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资方上传承诺信息
         * Summary: 融资方上传承诺信息
         */
        public CreateLeaseCreditpromiseResponse CreateLeaseCreditpromise(CreateLeaseCreditpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseCreditpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 融资方上传承诺信息
         * Summary: 融资方上传承诺信息
         */
        public async Task<CreateLeaseCreditpromiseResponse> CreateLeaseCreditpromiseAsync(CreateLeaseCreditpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseCreditpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资方上传承诺信息
         * Summary: 融资方上传承诺信息
         */
        public CreateLeaseCreditpromiseResponse CreateLeaseCreditpromiseEx(CreateLeaseCreditpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseCreditpromiseResponse>(DoRequest("1.0", "twc.notary.lease.creditpromise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资方上传承诺信息
         * Summary: 融资方上传承诺信息
         */
        public async Task<CreateLeaseCreditpromiseResponse> CreateLeaseCreditpromiseExAsync(CreateLeaseCreditpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseCreditpromiseResponse>(await DoRequestAsync("1.0", "twc.notary.lease.creditpromise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台上传支用/还款信息
         * Summary: 租赁平台上传支用/还款信息
         */
        public CreateLeaseDisburseinfoResponse CreateLeaseDisburseinfo(CreateLeaseDisburseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseDisburseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 租赁平台上传支用/还款信息
         * Summary: 租赁平台上传支用/还款信息
         */
        public async Task<CreateLeaseDisburseinfoResponse> CreateLeaseDisburseinfoAsync(CreateLeaseDisburseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseDisburseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁平台上传支用/还款信息
         * Summary: 租赁平台上传支用/还款信息
         */
        public CreateLeaseDisburseinfoResponse CreateLeaseDisburseinfoEx(CreateLeaseDisburseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseDisburseinfoResponse>(DoRequest("1.0", "twc.notary.lease.disburseinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台上传支用/还款信息
         * Summary: 租赁平台上传支用/还款信息
         */
        public async Task<CreateLeaseDisburseinfoResponse> CreateLeaseDisburseinfoExAsync(CreateLeaseDisburseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseDisburseinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.disburseinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询订单详细信息
         * Summary:  查询订单详细信息
         */
        public QueryLeaseOrderinfoResponse QueryLeaseOrderinfo(QueryLeaseOrderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseOrderinfoEx(request, headers, runtime);
        }

        /**
         * Description:  查询订单详细信息
         * Summary:  查询订单详细信息
         */
        public async Task<QueryLeaseOrderinfoResponse> QueryLeaseOrderinfoAsync(QueryLeaseOrderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseOrderinfoExAsync(request, headers, runtime);
        }

        /**
         * Description:  查询订单详细信息
         * Summary:  查询订单详细信息
         */
        public QueryLeaseOrderinfoResponse QueryLeaseOrderinfoEx(QueryLeaseOrderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseOrderinfoResponse>(DoRequest("1.0", "twc.notary.lease.orderinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询订单详细信息
         * Summary:  查询订单详细信息
         */
        public async Task<QueryLeaseOrderinfoResponse> QueryLeaseOrderinfoExAsync(QueryLeaseOrderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseOrderinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.orderinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建金融行业标准文本存证
         * Summary: 创建金融行业文本存证
         */
        public CreateFinanceTextnotaryResponse CreateFinanceTextnotary(CreateFinanceTextnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFinanceTextnotaryEx(request, headers, runtime);
        }

        /**
         * Description: 创建金融行业标准文本存证
         * Summary: 创建金融行业文本存证
         */
        public async Task<CreateFinanceTextnotaryResponse> CreateFinanceTextnotaryAsync(CreateFinanceTextnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFinanceTextnotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建金融行业标准文本存证
         * Summary: 创建金融行业文本存证
         */
        public CreateFinanceTextnotaryResponse CreateFinanceTextnotaryEx(CreateFinanceTextnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFinanceTextnotaryResponse>(DoRequest("1.0", "twc.notary.finance.textnotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建金融行业标准文本存证
         * Summary: 创建金融行业文本存证
         */
        public async Task<CreateFinanceTextnotaryResponse> CreateFinanceTextnotaryExAsync(CreateFinanceTextnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFinanceTextnotaryResponse>(await DoRequestAsync("1.0", "twc.notary.finance.textnotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取金融行业文本存证接口描述
         * Summary: 获取金融行业文本存证
         */
        public GetFinanceTextnotaryResponse GetFinanceTextnotary(GetFinanceTextnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFinanceTextnotaryEx(request, headers, runtime);
        }

        /**
         * Description: 获取金融行业文本存证接口描述
         * Summary: 获取金融行业文本存证
         */
        public async Task<GetFinanceTextnotaryResponse> GetFinanceTextnotaryAsync(GetFinanceTextnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFinanceTextnotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取金融行业文本存证接口描述
         * Summary: 获取金融行业文本存证
         */
        public GetFinanceTextnotaryResponse GetFinanceTextnotaryEx(GetFinanceTextnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFinanceTextnotaryResponse>(DoRequest("1.0", "twc.notary.finance.textnotary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取金融行业文本存证接口描述
         * Summary: 获取金融行业文本存证
         */
        public async Task<GetFinanceTextnotaryResponse> GetFinanceTextnotaryExAsync(GetFinanceTextnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFinanceTextnotaryResponse>(await DoRequestAsync("1.0", "twc.notary.finance.textnotary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建金融行业文件存证接口描述
         * Summary: 创建金融行业文件存证
         */
        public CreateFinanceFilenotaryResponse CreateFinanceFilenotary(CreateFinanceFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFinanceFilenotaryEx(request, headers, runtime);
        }

        /**
         * Description: 创建金融行业文件存证接口描述
         * Summary: 创建金融行业文件存证
         */
        public async Task<CreateFinanceFilenotaryResponse> CreateFinanceFilenotaryAsync(CreateFinanceFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFinanceFilenotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建金融行业文件存证接口描述
         * Summary: 创建金融行业文件存证
         */
        public CreateFinanceFilenotaryResponse CreateFinanceFilenotaryEx(CreateFinanceFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFinanceFilenotaryResponse>(DoRequest("1.0", "twc.notary.finance.filenotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建金融行业文件存证接口描述
         * Summary: 创建金融行业文件存证
         */
        public async Task<CreateFinanceFilenotaryResponse> CreateFinanceFilenotaryExAsync(CreateFinanceFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFinanceFilenotaryResponse>(await DoRequestAsync("1.0", "twc.notary.finance.filenotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取金融行业文件存证接口描述
         * Summary: 获取金融行业文件存证
         */
        public GetFinanceFilenotaryResponse GetFinanceFilenotary(GetFinanceFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFinanceFilenotaryEx(request, headers, runtime);
        }

        /**
         * Description: 获取金融行业文件存证接口描述
         * Summary: 获取金融行业文件存证
         */
        public async Task<GetFinanceFilenotaryResponse> GetFinanceFilenotaryAsync(GetFinanceFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFinanceFilenotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取金融行业文件存证接口描述
         * Summary: 获取金融行业文件存证
         */
        public GetFinanceFilenotaryResponse GetFinanceFilenotaryEx(GetFinanceFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFinanceFilenotaryResponse>(DoRequest("1.0", "twc.notary.finance.filenotary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取金融行业文件存证接口描述
         * Summary: 获取金融行业文件存证
         */
        public async Task<GetFinanceFilenotaryResponse> GetFinanceFilenotaryExAsync(GetFinanceFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFinanceFilenotaryResponse>(await DoRequestAsync("1.0", "twc.notary.finance.filenotary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 统一存证核验接口
         * Summary: 统一存证核验接口（已下架）
         */
        public CheckIndustryNotaryResponse CheckIndustryNotary(CheckIndustryNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckIndustryNotaryEx(request, headers, runtime);
        }

        /**
         * Description: 统一存证核验接口
         * Summary: 统一存证核验接口（已下架）
         */
        public async Task<CheckIndustryNotaryResponse> CheckIndustryNotaryAsync(CheckIndustryNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckIndustryNotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 统一存证核验接口
         * Summary: 统一存证核验接口（已下架）
         */
        public CheckIndustryNotaryResponse CheckIndustryNotaryEx(CheckIndustryNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIndustryNotaryResponse>(DoRequest("1.0", "twc.notary.industry.notary.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 统一存证核验接口
         * Summary: 统一存证核验接口（已下架）
         */
        public async Task<CheckIndustryNotaryResponse> CheckIndustryNotaryExAsync(CheckIndustryNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckIndustryNotaryResponse>(await DoRequestAsync("1.0", "twc.notary.industry.notary.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 违约案件信息提交服务
         * Summary: 违约案件信息提交服务
         */
        public CreateSueBreakpromiseinfoResponse CreateSueBreakpromiseinfo(CreateSueBreakpromiseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSueBreakpromiseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 违约案件信息提交服务
         * Summary: 违约案件信息提交服务
         */
        public async Task<CreateSueBreakpromiseinfoResponse> CreateSueBreakpromiseinfoAsync(CreateSueBreakpromiseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSueBreakpromiseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 违约案件信息提交服务
         * Summary: 违约案件信息提交服务
         */
        public CreateSueBreakpromiseinfoResponse CreateSueBreakpromiseinfoEx(CreateSueBreakpromiseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSueBreakpromiseinfoResponse>(DoRequest("1.0", "twc.notary.sue.breakpromiseinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 违约案件信息提交服务
         * Summary: 违约案件信息提交服务
         */
        public async Task<CreateSueBreakpromiseinfoResponse> CreateSueBreakpromiseinfoExAsync(CreateSueBreakpromiseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSueBreakpromiseinfoResponse>(await DoRequestAsync("1.0", "twc.notary.sue.breakpromiseinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 违约案件信息修改服务
         * Summary: 违约案件信息修改服务
         */
        public UpdateSueBreakpromiseinfoResponse UpdateSueBreakpromiseinfo(UpdateSueBreakpromiseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSueBreakpromiseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 违约案件信息修改服务
         * Summary: 违约案件信息修改服务
         */
        public async Task<UpdateSueBreakpromiseinfoResponse> UpdateSueBreakpromiseinfoAsync(UpdateSueBreakpromiseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSueBreakpromiseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 违约案件信息修改服务
         * Summary: 违约案件信息修改服务
         */
        public UpdateSueBreakpromiseinfoResponse UpdateSueBreakpromiseinfoEx(UpdateSueBreakpromiseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSueBreakpromiseinfoResponse>(DoRequest("1.0", "twc.notary.sue.breakpromiseinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 违约案件信息修改服务
         * Summary: 违约案件信息修改服务
         */
        public async Task<UpdateSueBreakpromiseinfoResponse> UpdateSueBreakpromiseinfoExAsync(UpdateSueBreakpromiseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSueBreakpromiseinfoResponse>(await DoRequestAsync("1.0", "twc.notary.sue.breakpromiseinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 违约案件信息删除服务
         * Summary: 违约案件信息删除服务
         */
        public DeleteSueBreakpromiseinfoResponse DeleteSueBreakpromiseinfo(DeleteSueBreakpromiseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSueBreakpromiseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 违约案件信息删除服务
         * Summary: 违约案件信息删除服务
         */
        public async Task<DeleteSueBreakpromiseinfoResponse> DeleteSueBreakpromiseinfoAsync(DeleteSueBreakpromiseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSueBreakpromiseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 违约案件信息删除服务
         * Summary: 违约案件信息删除服务
         */
        public DeleteSueBreakpromiseinfoResponse DeleteSueBreakpromiseinfoEx(DeleteSueBreakpromiseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSueBreakpromiseinfoResponse>(DoRequest("1.0", "twc.notary.sue.breakpromiseinfo.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 违约案件信息删除服务
         * Summary: 违约案件信息删除服务
         */
        public async Task<DeleteSueBreakpromiseinfoResponse> DeleteSueBreakpromiseinfoExAsync(DeleteSueBreakpromiseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSueBreakpromiseinfoResponse>(await DoRequestAsync("1.0", "twc.notary.sue.breakpromiseinfo.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询惩戒信息
         * Summary: 查询惩戒信息
         */
        public QuerySueUserinfoResponse QuerySueUserinfo(QuerySueUserinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySueUserinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询惩戒信息
         * Summary: 查询惩戒信息
         */
        public async Task<QuerySueUserinfoResponse> QuerySueUserinfoAsync(QuerySueUserinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySueUserinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询惩戒信息
         * Summary: 查询惩戒信息
         */
        public QuerySueUserinfoResponse QuerySueUserinfoEx(QuerySueUserinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySueUserinfoResponse>(DoRequest("1.0", "twc.notary.sue.userinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询惩戒信息
         * Summary: 查询惩戒信息
         */
        public async Task<QuerySueUserinfoResponse> QuerySueUserinfoExAsync(QuerySueUserinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySueUserinfoResponse>(await DoRequestAsync("1.0", "twc.notary.sue.userinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 升级用户管理合约
         * Summary: 升级用户管理合约
         */
        public UpdateSueExeplarycontractResponse UpdateSueExeplarycontract(UpdateSueExeplarycontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSueExeplarycontractEx(request, headers, runtime);
        }

        /**
         * Description: 升级用户管理合约
         * Summary: 升级用户管理合约
         */
        public async Task<UpdateSueExeplarycontractResponse> UpdateSueExeplarycontractAsync(UpdateSueExeplarycontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSueExeplarycontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 升级用户管理合约
         * Summary: 升级用户管理合约
         */
        public UpdateSueExeplarycontractResponse UpdateSueExeplarycontractEx(UpdateSueExeplarycontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSueExeplarycontractResponse>(DoRequest("1.0", "twc.notary.sue.exeplarycontract.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 升级用户管理合约
         * Summary: 升级用户管理合约
         */
        public async Task<UpdateSueExeplarycontractResponse> UpdateSueExeplarycontractExAsync(UpdateSueExeplarycontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSueExeplarycontractResponse>(await DoRequestAsync("1.0", "twc.notary.sue.exeplarycontract.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回退用户管理合约
         * Summary: 回退用户管理合约
         */
        public UpdateSueExemplaryrevertResponse UpdateSueExemplaryrevert(UpdateSueExemplaryrevertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSueExemplaryrevertEx(request, headers, runtime);
        }

        /**
         * Description: 回退用户管理合约
         * Summary: 回退用户管理合约
         */
        public async Task<UpdateSueExemplaryrevertResponse> UpdateSueExemplaryrevertAsync(UpdateSueExemplaryrevertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSueExemplaryrevertExAsync(request, headers, runtime);
        }

        /**
         * Description: 回退用户管理合约
         * Summary: 回退用户管理合约
         */
        public UpdateSueExemplaryrevertResponse UpdateSueExemplaryrevertEx(UpdateSueExemplaryrevertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSueExemplaryrevertResponse>(DoRequest("1.0", "twc.notary.sue.exemplaryrevert.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回退用户管理合约
         * Summary: 回退用户管理合约
         */
        public async Task<UpdateSueExemplaryrevertResponse> UpdateSueExemplaryrevertExAsync(UpdateSueExemplaryrevertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSueExemplaryrevertResponse>(await DoRequestAsync("1.0", "twc.notary.sue.exemplaryrevert.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资平台审核订单信息
         * Summary: 融资平台审核订单信息
         */
        public CreateLeaseAuditResponse CreateLeaseAudit(CreateLeaseAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseAuditEx(request, headers, runtime);
        }

        /**
         * Description: 融资平台审核订单信息
         * Summary: 融资平台审核订单信息
         */
        public async Task<CreateLeaseAuditResponse> CreateLeaseAuditAsync(CreateLeaseAuditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseAuditExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资平台审核订单信息
         * Summary: 融资平台审核订单信息
         */
        public CreateLeaseAuditResponse CreateLeaseAuditEx(CreateLeaseAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAuditResponse>(DoRequest("1.0", "twc.notary.lease.audit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资平台审核订单信息
         * Summary: 融资平台审核订单信息
         */
        public async Task<CreateLeaseAuditResponse> CreateLeaseAuditExAsync(CreateLeaseAuditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseAuditResponse>(await DoRequestAsync("1.0", "twc.notary.lease.audit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台上传付款通知信息
         * Summary: 租赁平台上传付款通知信息
         */
        public CreateLeasePaymentfileResponse CreateLeasePaymentfile(CreateLeasePaymentfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeasePaymentfileEx(request, headers, runtime);
        }

        /**
         * Description: 租赁平台上传付款通知信息
         * Summary: 租赁平台上传付款通知信息
         */
        public async Task<CreateLeasePaymentfileResponse> CreateLeasePaymentfileAsync(CreateLeasePaymentfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeasePaymentfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁平台上传付款通知信息
         * Summary: 租赁平台上传付款通知信息
         */
        public CreateLeasePaymentfileResponse CreateLeasePaymentfileEx(CreateLeasePaymentfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeasePaymentfileResponse>(DoRequest("1.0", "twc.notary.lease.paymentfile.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台上传付款通知信息
         * Summary: 租赁平台上传付款通知信息
         */
        public async Task<CreateLeasePaymentfileResponse> CreateLeasePaymentfileExAsync(CreateLeasePaymentfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeasePaymentfileResponse>(await DoRequestAsync("1.0", "twc.notary.lease.paymentfile.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁系统上传租金归还记录 分期调用
         * Summary: 租赁系统上传租金归还记录 分期调用
         */
        public CreateLeaseRentalResponse CreateLeaseRental(CreateLeaseRentalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseRentalEx(request, headers, runtime);
        }

        /**
         * Description: 租赁系统上传租金归还记录 分期调用
         * Summary: 租赁系统上传租金归还记录 分期调用
         */
        public async Task<CreateLeaseRentalResponse> CreateLeaseRentalAsync(CreateLeaseRentalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseRentalExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁系统上传租金归还记录 分期调用
         * Summary: 租赁系统上传租金归还记录 分期调用
         */
        public CreateLeaseRentalResponse CreateLeaseRentalEx(CreateLeaseRentalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRentalResponse>(DoRequest("1.0", "twc.notary.lease.rental.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁系统上传租金归还记录 分期调用
         * Summary: 租赁系统上传租金归还记录 分期调用
         */
        public async Task<CreateLeaseRentalResponse> CreateLeaseRentalExAsync(CreateLeaseRentalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRentalResponse>(await DoRequestAsync("1.0", "twc.notary.lease.rental.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清分服务机构上传资金清算记录，分期
         * Summary: 清分服务机构上传资金清算记录，分期
         */
        public CreateLeaseClearingResponse CreateLeaseClearing(CreateLeaseClearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseClearingEx(request, headers, runtime);
        }

        /**
         * Description: 清分服务机构上传资金清算记录，分期
         * Summary: 清分服务机构上传资金清算记录，分期
         */
        public async Task<CreateLeaseClearingResponse> CreateLeaseClearingAsync(CreateLeaseClearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseClearingExAsync(request, headers, runtime);
        }

        /**
         * Description: 清分服务机构上传资金清算记录，分期
         * Summary: 清分服务机构上传资金清算记录，分期
         */
        public CreateLeaseClearingResponse CreateLeaseClearingEx(CreateLeaseClearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseClearingResponse>(DoRequest("1.0", "twc.notary.lease.clearing.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清分服务机构上传资金清算记录，分期
         * Summary: 清分服务机构上传资金清算记录，分期
         */
        public async Task<CreateLeaseClearingResponse> CreateLeaseClearingExAsync(CreateLeaseClearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseClearingResponse>(await DoRequestAsync("1.0", "twc.notary.lease.clearing.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资金融机构上传还款信息 每期
         * Summary: 融资金融机构上传还款信息 每期
         */
        public CreateLeaseRepaymentResponse CreateLeaseRepayment(CreateLeaseRepaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseRepaymentEx(request, headers, runtime);
        }

        /**
         * Description: 融资金融机构上传还款信息 每期
         * Summary: 融资金融机构上传还款信息 每期
         */
        public async Task<CreateLeaseRepaymentResponse> CreateLeaseRepaymentAsync(CreateLeaseRepaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseRepaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资金融机构上传还款信息 每期
         * Summary: 融资金融机构上传还款信息 每期
         */
        public CreateLeaseRepaymentResponse CreateLeaseRepaymentEx(CreateLeaseRepaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRepaymentResponse>(DoRequest("1.0", "twc.notary.lease.repayment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资金融机构上传还款信息 每期
         * Summary: 融资金融机构上传还款信息 每期
         */
        public async Task<CreateLeaseRepaymentResponse> CreateLeaseRepaymentExAsync(CreateLeaseRepaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRepaymentResponse>(await DoRequestAsync("1.0", "twc.notary.lease.repayment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁通知系统注册
         * Summary: 融资租赁通知系统注册
         */
        public CreateLeaseNotifyregisterResponse CreateLeaseNotifyregister(CreateLeaseNotifyregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseNotifyregisterEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁通知系统注册
         * Summary: 融资租赁通知系统注册
         */
        public async Task<CreateLeaseNotifyregisterResponse> CreateLeaseNotifyregisterAsync(CreateLeaseNotifyregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseNotifyregisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁通知系统注册
         * Summary: 融资租赁通知系统注册
         */
        public CreateLeaseNotifyregisterResponse CreateLeaseNotifyregisterEx(CreateLeaseNotifyregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseNotifyregisterResponse>(DoRequest("1.0", "twc.notary.lease.notifyregister.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁通知系统注册
         * Summary: 融资租赁通知系统注册
         */
        public async Task<CreateLeaseNotifyregisterResponse> CreateLeaseNotifyregisterExAsync(CreateLeaseNotifyregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseNotifyregisterResponse>(await DoRequestAsync("1.0", "twc.notary.lease.notifyregister.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据imeiID查询iot设备的详情
         * Summary: 根据imeiID查询iot设备的详情
         */
        public QueryLeaseIotinfoResponse QueryLeaseIotinfo(QueryLeaseIotinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseIotinfoEx(request, headers, runtime);
        }

        /**
         * Description: 根据imeiID查询iot设备的详情
         * Summary: 根据imeiID查询iot设备的详情
         */
        public async Task<QueryLeaseIotinfoResponse> QueryLeaseIotinfoAsync(QueryLeaseIotinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseIotinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据imeiID查询iot设备的详情
         * Summary: 根据imeiID查询iot设备的详情
         */
        public QueryLeaseIotinfoResponse QueryLeaseIotinfoEx(QueryLeaseIotinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseIotinfoResponse>(DoRequest("1.0", "twc.notary.lease.iotinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据imeiID查询iot设备的详情
         * Summary: 根据imeiID查询iot设备的详情
         */
        public async Task<QueryLeaseIotinfoResponse> QueryLeaseIotinfoExAsync(QueryLeaseIotinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseIotinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.iotinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建法院通用文本存证
         * Summary: 法院通用文本存证创建接口
         */
        public CreateCourtTextnotaryResponse CreateCourtTextnotary(CreateCourtTextnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCourtTextnotaryEx(request, headers, runtime);
        }

        /**
         * Description: 创建法院通用文本存证
         * Summary: 法院通用文本存证创建接口
         */
        public async Task<CreateCourtTextnotaryResponse> CreateCourtTextnotaryAsync(CreateCourtTextnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCourtTextnotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建法院通用文本存证
         * Summary: 法院通用文本存证创建接口
         */
        public CreateCourtTextnotaryResponse CreateCourtTextnotaryEx(CreateCourtTextnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCourtTextnotaryResponse>(DoRequest("1.0", "twc.notary.court.textnotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建法院通用文本存证
         * Summary: 法院通用文本存证创建接口
         */
        public async Task<CreateCourtTextnotaryResponse> CreateCourtTextnotaryExAsync(CreateCourtTextnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCourtTextnotaryResponse>(await DoRequestAsync("1.0", "twc.notary.court.textnotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取法院通用文本存证
         * Summary: 法院通用文本存证获取接口
         */
        public GetCourtTextnotaryResponse GetCourtTextnotary(GetCourtTextnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCourtTextnotaryEx(request, headers, runtime);
        }

        /**
         * Description: 获取法院通用文本存证
         * Summary: 法院通用文本存证获取接口
         */
        public async Task<GetCourtTextnotaryResponse> GetCourtTextnotaryAsync(GetCourtTextnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCourtTextnotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取法院通用文本存证
         * Summary: 法院通用文本存证获取接口
         */
        public GetCourtTextnotaryResponse GetCourtTextnotaryEx(GetCourtTextnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCourtTextnotaryResponse>(DoRequest("1.0", "twc.notary.court.textnotary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取法院通用文本存证
         * Summary: 法院通用文本存证获取接口
         */
        public async Task<GetCourtTextnotaryResponse> GetCourtTextnotaryExAsync(GetCourtTextnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCourtTextnotaryResponse>(await DoRequestAsync("1.0", "twc.notary.court.textnotary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建法院通用文件存证接口
         * Summary: 法院通用文件存证创建接口
         */
        public CreateCourtFilenotaryResponse CreateCourtFilenotary(CreateCourtFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCourtFilenotaryEx(request, headers, runtime);
        }

        /**
         * Description: 创建法院通用文件存证接口
         * Summary: 法院通用文件存证创建接口
         */
        public async Task<CreateCourtFilenotaryResponse> CreateCourtFilenotaryAsync(CreateCourtFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCourtFilenotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建法院通用文件存证接口
         * Summary: 法院通用文件存证创建接口
         */
        public CreateCourtFilenotaryResponse CreateCourtFilenotaryEx(CreateCourtFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCourtFilenotaryResponse>(DoRequest("1.0", "twc.notary.court.filenotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建法院通用文件存证接口
         * Summary: 法院通用文件存证创建接口
         */
        public async Task<CreateCourtFilenotaryResponse> CreateCourtFilenotaryExAsync(CreateCourtFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCourtFilenotaryResponse>(await DoRequestAsync("1.0", "twc.notary.court.filenotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取法院通用文件存证
         * Summary: 法院通用文件存证获取接口
         */
        public GetCourtFilenotaryResponse GetCourtFilenotary(GetCourtFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCourtFilenotaryEx(request, headers, runtime);
        }

        /**
         * Description: 获取法院通用文件存证
         * Summary: 法院通用文件存证获取接口
         */
        public async Task<GetCourtFilenotaryResponse> GetCourtFilenotaryAsync(GetCourtFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCourtFilenotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取法院通用文件存证
         * Summary: 法院通用文件存证获取接口
         */
        public GetCourtFilenotaryResponse GetCourtFilenotaryEx(GetCourtFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCourtFilenotaryResponse>(DoRequest("1.0", "twc.notary.court.filenotary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取法院通用文件存证
         * Summary: 法院通用文件存证获取接口
         */
        public async Task<GetCourtFilenotaryResponse> GetCourtFilenotaryExAsync(GetCourtFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCourtFilenotaryResponse>(await DoRequestAsync("1.0", "twc.notary.court.filenotary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁定制化统一入口
         * Summary: 融资租赁定制化统一入口
         */
        public CreateLeaseRouteResponse CreateLeaseRoute(CreateLeaseRouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseRouteEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁定制化统一入口
         * Summary: 融资租赁定制化统一入口
         */
        public async Task<CreateLeaseRouteResponse> CreateLeaseRouteAsync(CreateLeaseRouteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseRouteExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁定制化统一入口
         * Summary: 融资租赁定制化统一入口
         */
        public CreateLeaseRouteResponse CreateLeaseRouteEx(CreateLeaseRouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRouteResponse>(DoRequest("1.0", "twc.notary.lease.route.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁定制化统一入口
         * Summary: 融资租赁定制化统一入口
         */
        public async Task<CreateLeaseRouteResponse> CreateLeaseRouteExAsync(CreateLeaseRouteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRouteResponse>(await DoRequestAsync("1.0", "twc.notary.lease.route.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
         * Summary: 查询用户等加密信息
         */
        public QueryLeaseEncryptedinfoResponse QueryLeaseEncryptedinfo(QueryLeaseEncryptedinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseEncryptedinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
         * Summary: 查询用户等加密信息
         */
        public async Task<QueryLeaseEncryptedinfoResponse> QueryLeaseEncryptedinfoAsync(QueryLeaseEncryptedinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseEncryptedinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
         * Summary: 查询用户等加密信息
         */
        public QueryLeaseEncryptedinfoResponse QueryLeaseEncryptedinfoEx(QueryLeaseEncryptedinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseEncryptedinfoResponse>(DoRequest("1.0", "twc.notary.lease.encryptedinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
         * Summary: 查询用户等加密信息
         */
        public async Task<QueryLeaseEncryptedinfoResponse> QueryLeaseEncryptedinfoExAsync(QueryLeaseEncryptedinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseEncryptedinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.encryptedinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同文本存证
         * Summary: 电子合同文本存证
         */
        public CreateContractTextResponse CreateContractText(CreateContractTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractTextEx(request, headers, runtime);
        }

        /**
         * Description: 电子合同文本存证
         * Summary: 电子合同文本存证
         */
        public async Task<CreateContractTextResponse> CreateContractTextAsync(CreateContractTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子合同文本存证
         * Summary: 电子合同文本存证
         */
        public CreateContractTextResponse CreateContractTextEx(CreateContractTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractTextResponse>(DoRequest("1.0", "twc.notary.contract.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同文本存证
         * Summary: 电子合同文本存证
         */
        public async Task<CreateContractTextResponse> CreateContractTextExAsync(CreateContractTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractTextResponse>(await DoRequestAsync("1.0", "twc.notary.contract.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
         * Summary: 申请电子合同存证报告
         */
        public ApplyContractReportResponse ApplyContractReport(ApplyContractReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyContractReportEx(request, headers, runtime);
        }

        /**
         * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
         * Summary: 申请电子合同存证报告
         */
        public async Task<ApplyContractReportResponse> ApplyContractReportAsync(ApplyContractReportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyContractReportExAsync(request, headers, runtime);
        }

        /**
         * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
         * Summary: 申请电子合同存证报告
         */
        public ApplyContractReportResponse ApplyContractReportEx(ApplyContractReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractReportResponse>(DoRequest("1.0", "twc.notary.contract.report.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
         * Summary: 申请电子合同存证报告
         */
        public async Task<ApplyContractReportResponse> ApplyContractReportExAsync(ApplyContractReportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractReportResponse>(await DoRequestAsync("1.0", "twc.notary.contract.report.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
         * Summary: 下载合同存证
         */
        public GetContractTextResponse GetContractText(GetContractTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractTextEx(request, headers, runtime);
        }

        /**
         * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
         * Summary: 下载合同存证
         */
        public async Task<GetContractTextResponse> GetContractTextAsync(GetContractTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
         * Summary: 下载合同存证
         */
        public GetContractTextResponse GetContractTextEx(GetContractTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractTextResponse>(DoRequest("1.0", "twc.notary.contract.text.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
         * Summary: 下载合同存证
         */
        public async Task<GetContractTextResponse> GetContractTextExAsync(GetContractTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractTextResponse>(await DoRequestAsync("1.0", "twc.notary.contract.text.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取存证事务ID内部接口
         * Summary: 获取存证事务ID内部接口
         */
        public CreateInternalTransResponse CreateInternalTrans(CreateInternalTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInternalTransEx(request, headers, runtime);
        }

        /**
         * Description: 获取存证事务ID内部接口
         * Summary: 获取存证事务ID内部接口
         */
        public async Task<CreateInternalTransResponse> CreateInternalTransAsync(CreateInternalTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInternalTransExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取存证事务ID内部接口
         * Summary: 获取存证事务ID内部接口
         */
        public CreateInternalTransResponse CreateInternalTransEx(CreateInternalTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInternalTransResponse>(DoRequest("1.0", "twc.notary.internal.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取存证事务ID内部接口
         * Summary: 获取存证事务ID内部接口
         */
        public async Task<CreateInternalTransResponse> CreateInternalTransExAsync(CreateInternalTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInternalTransResponse>(await DoRequestAsync("1.0", "twc.notary.internal.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本存证内部接口，将文本内容存证上链
         * Summary: 文本存证内部接口，将文本内容存证上链
         */
        public CreateInternalTextResponse CreateInternalText(CreateInternalTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInternalTextEx(request, headers, runtime);
        }

        /**
         * Description: 文本存证内部接口，将文本内容存证上链
         * Summary: 文本存证内部接口，将文本内容存证上链
         */
        public async Task<CreateInternalTextResponse> CreateInternalTextAsync(CreateInternalTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInternalTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 文本存证内部接口，将文本内容存证上链
         * Summary: 文本存证内部接口，将文本内容存证上链
         */
        public CreateInternalTextResponse CreateInternalTextEx(CreateInternalTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInternalTextResponse>(DoRequest("1.0", "twc.notary.internal.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文本存证内部接口，将文本内容存证上链
         * Summary: 文本存证内部接口，将文本内容存证上链
         */
        public async Task<CreateInternalTextResponse> CreateInternalTextExAsync(CreateInternalTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInternalTextResponse>(await DoRequestAsync("1.0", "twc.notary.internal.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
         * Summary: 租赁业务文本存证，将文本内容存证上链
         */
        public CreateLeaseTextResponse CreateLeaseText(CreateLeaseTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseTextEx(request, headers, runtime);
        }

        /**
         * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
         * Summary: 租赁业务文本存证，将文本内容存证上链
         */
        public async Task<CreateLeaseTextResponse> CreateLeaseTextAsync(CreateLeaseTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
         * Summary: 租赁业务文本存证，将文本内容存证上链
         */
        public CreateLeaseTextResponse CreateLeaseTextEx(CreateLeaseTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseTextResponse>(DoRequest("1.0", "twc.notary.lease.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
         * Summary: 租赁业务文本存证，将文本内容存证上链
         */
        public async Task<CreateLeaseTextResponse> CreateLeaseTextExAsync(CreateLeaseTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseTextResponse>(await DoRequestAsync("1.0", "twc.notary.lease.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
         * Summary: 租赁业务文件内容存证上链
         */
        public CreateLeaseFileResponse CreateLeaseFile(CreateLeaseFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseFileEx(request, headers, runtime);
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
         * Summary: 租赁业务文件内容存证上链
         */
        public async Task<CreateLeaseFileResponse> CreateLeaseFileAsync(CreateLeaseFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
         * Summary: 租赁业务文件内容存证上链
         */
        public CreateLeaseFileResponse CreateLeaseFileEx(CreateLeaseFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseFileResponse>(DoRequest("1.0", "twc.notary.lease.file.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
         * Summary: 租赁业务文件内容存证上链
         */
        public async Task<CreateLeaseFileResponse> CreateLeaseFileExAsync(CreateLeaseFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseFileResponse>(await DoRequestAsync("1.0", "twc.notary.lease.file.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
         * Summary: 租赁业务获取订单存证列表
         */
        public ListLeaseNotaryResponse ListLeaseNotary(ListLeaseNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListLeaseNotaryEx(request, headers, runtime);
        }

        /**
         * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
         * Summary: 租赁业务获取订单存证列表
         */
        public async Task<ListLeaseNotaryResponse> ListLeaseNotaryAsync(ListLeaseNotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListLeaseNotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
         * Summary: 租赁业务获取订单存证列表
         */
        public ListLeaseNotaryResponse ListLeaseNotaryEx(ListLeaseNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLeaseNotaryResponse>(DoRequest("1.0", "twc.notary.lease.notary.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
         * Summary: 租赁业务获取订单存证列表
         */
        public async Task<ListLeaseNotaryResponse> ListLeaseNotaryExAsync(ListLeaseNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLeaseNotaryResponse>(await DoRequestAsync("1.0", "twc.notary.lease.notary.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询融资租赁application
         * Summary: 查询融资租赁application
         */
        public QueryLeaseApplicationResponse QueryLeaseApplication(QueryLeaseApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 查询融资租赁application
         * Summary: 查询融资租赁application
         */
        public async Task<QueryLeaseApplicationResponse> QueryLeaseApplicationAsync(QueryLeaseApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询融资租赁application
         * Summary: 查询融资租赁application
         */
        public QueryLeaseApplicationResponse QueryLeaseApplicationEx(QueryLeaseApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseApplicationResponse>(DoRequest("1.0", "twc.notary.lease.application.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询融资租赁application
         * Summary: 查询融资租赁application
         */
        public async Task<QueryLeaseApplicationResponse> QueryLeaseApplicationExAsync(QueryLeaseApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseApplicationResponse>(await DoRequestAsync("1.0", "twc.notary.lease.application.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询融资租赁application的定义详情
         * Summary: 查询application的定义详情
         */
        public QueryLeaseApplicationdetailinfoResponse QueryLeaseApplicationdetailinfo(QueryLeaseApplicationdetailinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseApplicationdetailinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询融资租赁application的定义详情
         * Summary: 查询application的定义详情
         */
        public async Task<QueryLeaseApplicationdetailinfoResponse> QueryLeaseApplicationdetailinfoAsync(QueryLeaseApplicationdetailinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseApplicationdetailinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询融资租赁application的定义详情
         * Summary: 查询application的定义详情
         */
        public QueryLeaseApplicationdetailinfoResponse QueryLeaseApplicationdetailinfoEx(QueryLeaseApplicationdetailinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseApplicationdetailinfoResponse>(DoRequest("1.0", "twc.notary.lease.applicationdetailinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询融资租赁application的定义详情
         * Summary: 查询application的定义详情
         */
        public async Task<QueryLeaseApplicationdetailinfoResponse> QueryLeaseApplicationdetailinfoExAsync(QueryLeaseApplicationdetailinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseApplicationdetailinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.applicationdetailinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁资方重置订单状态
         * Summary: 融资租赁资方重置订单状态
         */
        public SetLeaseRepaymentstatusResponse SetLeaseRepaymentstatus(SetLeaseRepaymentstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetLeaseRepaymentstatusEx(request, headers, runtime);
        }

        /**
         * Description: 融资租赁资方重置订单状态
         * Summary: 融资租赁资方重置订单状态
         */
        public async Task<SetLeaseRepaymentstatusResponse> SetLeaseRepaymentstatusAsync(SetLeaseRepaymentstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetLeaseRepaymentstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资租赁资方重置订单状态
         * Summary: 融资租赁资方重置订单状态
         */
        public SetLeaseRepaymentstatusResponse SetLeaseRepaymentstatusEx(SetLeaseRepaymentstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetLeaseRepaymentstatusResponse>(DoRequest("1.0", "twc.notary.lease.repaymentstatus.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资租赁资方重置订单状态
         * Summary: 融资租赁资方重置订单状态
         */
        public async Task<SetLeaseRepaymentstatusResponse> SetLeaseRepaymentstatusExAsync(SetLeaseRepaymentstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetLeaseRepaymentstatusResponse>(await DoRequestAsync("1.0", "twc.notary.lease.repaymentstatus.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 供应商上传采购等相关信息
         * Summary: 供应商上传采购等相关信息
         */
        public CreateLeaseSupplierinfoResponse CreateLeaseSupplierinfo(CreateLeaseSupplierinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseSupplierinfoEx(request, headers, runtime);
        }

        /**
         * Description: 供应商上传采购等相关信息
         * Summary: 供应商上传采购等相关信息
         */
        public async Task<CreateLeaseSupplierinfoResponse> CreateLeaseSupplierinfoAsync(CreateLeaseSupplierinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseSupplierinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 供应商上传采购等相关信息
         * Summary: 供应商上传采购等相关信息
         */
        public CreateLeaseSupplierinfoResponse CreateLeaseSupplierinfoEx(CreateLeaseSupplierinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseSupplierinfoResponse>(DoRequest("1.0", "twc.notary.lease.supplierinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 供应商上传采购等相关信息
         * Summary: 供应商上传采购等相关信息
         */
        public async Task<CreateLeaseSupplierinfoResponse> CreateLeaseSupplierinfoExAsync(CreateLeaseSupplierinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseSupplierinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.supplierinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: mytf的tapp部署
         * Summary: mytf的tapp部署
         */
        public DeployMytfTappResponse DeployMytfTapp(DeployMytfTappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeployMytfTappEx(request, headers, runtime);
        }

        /**
         * Description: mytf的tapp部署
         * Summary: mytf的tapp部署
         */
        public async Task<DeployMytfTappResponse> DeployMytfTappAsync(DeployMytfTappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeployMytfTappExAsync(request, headers, runtime);
        }

        /**
         * Description: mytf的tapp部署
         * Summary: mytf的tapp部署
         */
        public DeployMytfTappResponse DeployMytfTappEx(DeployMytfTappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeployMytfTappResponse>(DoRequest("1.0", "twc.notary.mytf.tapp.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: mytf的tapp部署
         * Summary: mytf的tapp部署
         */
        public async Task<DeployMytfTappResponse> DeployMytfTappExAsync(DeployMytfTappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeployMytfTappResponse>(await DoRequestAsync("1.0", "twc.notary.mytf.tapp.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 供应商更新物流状态、签收记录等信息
         * Summary: 供应商更新物流状态、签收记录等信息
         */
        public CreateLeaseSupplierdynamicinfoResponse CreateLeaseSupplierdynamicinfo(CreateLeaseSupplierdynamicinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseSupplierdynamicinfoEx(request, headers, runtime);
        }

        /**
         * Description: 供应商更新物流状态、签收记录等信息
         * Summary: 供应商更新物流状态、签收记录等信息
         */
        public async Task<CreateLeaseSupplierdynamicinfoResponse> CreateLeaseSupplierdynamicinfoAsync(CreateLeaseSupplierdynamicinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseSupplierdynamicinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 供应商更新物流状态、签收记录等信息
         * Summary: 供应商更新物流状态、签收记录等信息
         */
        public CreateLeaseSupplierdynamicinfoResponse CreateLeaseSupplierdynamicinfoEx(CreateLeaseSupplierdynamicinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseSupplierdynamicinfoResponse>(DoRequest("1.0", "twc.notary.lease.supplierdynamicinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 供应商更新物流状态、签收记录等信息
         * Summary: 供应商更新物流状态、签收记录等信息
         */
        public async Task<CreateLeaseSupplierdynamicinfoResponse> CreateLeaseSupplierdynamicinfoExAsync(CreateLeaseSupplierdynamicinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseSupplierdynamicinfoResponse>(await DoRequestAsync("1.0", "twc.notary.lease.supplierdynamicinfo.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建租赁订单相关信息，融资租赁的前置条件
         * Summary: 创建租赁订单相关信息，融资租赁的前置条件
         */
        public CreateLeaseBizResponse CreateLeaseBiz(CreateLeaseBizRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseBizEx(request, headers, runtime);
        }

        /**
         * Description: 创建租赁订单相关信息，融资租赁的前置条件
         * Summary: 创建租赁订单相关信息，融资租赁的前置条件
         */
        public async Task<CreateLeaseBizResponse> CreateLeaseBizAsync(CreateLeaseBizRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseBizExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建租赁订单相关信息，融资租赁的前置条件
         * Summary: 创建租赁订单相关信息，融资租赁的前置条件
         */
        public CreateLeaseBizResponse CreateLeaseBizEx(CreateLeaseBizRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseBizResponse>(DoRequest("1.0", "twc.notary.lease.biz.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建租赁订单相关信息，融资租赁的前置条件
         * Summary: 创建租赁订单相关信息，融资租赁的前置条件
         */
        public async Task<CreateLeaseBizResponse> CreateLeaseBizExAsync(CreateLeaseBizRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseBizResponse>(await DoRequestAsync("1.0", "twc.notary.lease.biz.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询核验结果
         * Summary: 查询核验结果
         */
        public QueryLeaseProofResponse QueryLeaseProof(QueryLeaseProofRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseProofEx(request, headers, runtime);
        }

        /**
         * Description: 查询核验结果
         * Summary: 查询核验结果
         */
        public async Task<QueryLeaseProofResponse> QueryLeaseProofAsync(QueryLeaseProofRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseProofExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询核验结果
         * Summary: 查询核验结果
         */
        public QueryLeaseProofResponse QueryLeaseProofEx(QueryLeaseProofRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseProofResponse>(DoRequest("1.0", "twc.notary.lease.proof.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询核验结果
         * Summary: 查询核验结果
         */
        public async Task<QueryLeaseProofResponse> QueryLeaseProofExAsync(QueryLeaseProofRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseProofResponse>(await DoRequestAsync("1.0", "twc.notary.lease.proof.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
         * Summary: 大文件内容存证接口
         */
        public CreateLargefileResponse CreateLargefile(CreateLargefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLargefileEx(request, headers, runtime);
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
         * Summary: 大文件内容存证接口
         */
        public async Task<CreateLargefileResponse> CreateLargefileAsync(CreateLargefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLargefileExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
         * Summary: 大文件内容存证接口
         */
        public CreateLargefileResponse CreateLargefileEx(CreateLargefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLargefileResponse>(DoRequest("1.0", "twc.notary.largefile.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
         * Summary: 大文件内容存证接口
         */
        public async Task<CreateLargefileResponse> CreateLargefileExAsync(CreateLargefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLargefileResponse>(await DoRequestAsync("1.0", "twc.notary.largefile.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台查询接口
         * Summary: 租赁平台查询接口
         */
        public QueryLeaseBizResponse QueryLeaseBiz(QueryLeaseBizRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseBizEx(request, headers, runtime);
        }

        /**
         * Description: 租赁平台查询接口
         * Summary: 租赁平台查询接口
         */
        public async Task<QueryLeaseBizResponse> QueryLeaseBizAsync(QueryLeaseBizRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseBizExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁平台查询接口
         * Summary: 租赁平台查询接口
         */
        public QueryLeaseBizResponse QueryLeaseBizEx(QueryLeaseBizRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseBizResponse>(DoRequest("1.0", "twc.notary.lease.biz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁平台查询接口
         * Summary: 租赁平台查询接口
         */
        public async Task<QueryLeaseBizResponse> QueryLeaseBizExAsync(QueryLeaseBizRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseBizResponse>(await DoRequestAsync("1.0", "twc.notary.lease.biz.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝哈希存证
         * Summary: 租赁宝哈希存证
         */
        public CreateLeaseBiznotaryResponse CreateLeaseBiznotary(CreateLeaseBiznotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseBiznotaryEx(request, headers, runtime);
        }

        /**
         * Description: 租赁宝哈希存证
         * Summary: 租赁宝哈希存证
         */
        public async Task<CreateLeaseBiznotaryResponse> CreateLeaseBiznotaryAsync(CreateLeaseBiznotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseBiznotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁宝哈希存证
         * Summary: 租赁宝哈希存证
         */
        public CreateLeaseBiznotaryResponse CreateLeaseBiznotaryEx(CreateLeaseBiznotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseBiznotaryResponse>(DoRequest("1.0", "twc.notary.lease.biznotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁宝哈希存证
         * Summary: 租赁宝哈希存证
         */
        public async Task<CreateLeaseBiznotaryResponse> CreateLeaseBiznotaryExAsync(CreateLeaseBiznotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseBiznotaryResponse>(await DoRequestAsync("1.0", "twc.notary.lease.biznotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同内部文本存证
         * Summary: 合同内部文本存证
         */
        public CreateInternalContractResponse CreateInternalContract(CreateInternalContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInternalContractEx(request, headers, runtime);
        }

        /**
         * Description: 合同内部文本存证
         * Summary: 合同内部文本存证
         */
        public async Task<CreateInternalContractResponse> CreateInternalContractAsync(CreateInternalContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInternalContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同内部文本存证
         * Summary: 合同内部文本存证
         */
        public CreateInternalContractResponse CreateInternalContractEx(CreateInternalContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInternalContractResponse>(DoRequest("1.0", "twc.notary.internal.contract.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同内部文本存证
         * Summary: 合同内部文本存证
         */
        public async Task<CreateInternalContractResponse> CreateInternalContractExAsync(CreateInternalContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInternalContractResponse>(await DoRequestAsync("1.0", "twc.notary.internal.contract.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方上传网商直付通代扣协议核验结果
         * Summary: 资方上传网商直付通代扣协议核验结果
         */
        public CreateLeaseZftagreementsignResponse CreateLeaseZftagreementsign(CreateLeaseZftagreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseZftagreementsignEx(request, headers, runtime);
        }

        /**
         * Description: 资方上传网商直付通代扣协议核验结果
         * Summary: 资方上传网商直付通代扣协议核验结果
         */
        public async Task<CreateLeaseZftagreementsignResponse> CreateLeaseZftagreementsignAsync(CreateLeaseZftagreementsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseZftagreementsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方上传网商直付通代扣协议核验结果
         * Summary: 资方上传网商直付通代扣协议核验结果
         */
        public CreateLeaseZftagreementsignResponse CreateLeaseZftagreementsignEx(CreateLeaseZftagreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseZftagreementsignResponse>(DoRequest("1.0", "twc.notary.lease.zftagreementsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方上传网商直付通代扣协议核验结果
         * Summary: 资方上传网商直付通代扣协议核验结果
         */
        public async Task<CreateLeaseZftagreementsignResponse> CreateLeaseZftagreementsignExAsync(CreateLeaseZftagreementsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseZftagreementsignResponse>(await DoRequestAsync("1.0", "twc.notary.lease.zftagreementsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方上传网商直付通代扣协议解约相关信息
         * Summary: 资方上传网商直付通代扣协议解约相关信息
         */
        public CreateLeaseZftagreementunsignResponse CreateLeaseZftagreementunsign(CreateLeaseZftagreementunsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseZftagreementunsignEx(request, headers, runtime);
        }

        /**
         * Description: 资方上传网商直付通代扣协议解约相关信息
         * Summary: 资方上传网商直付通代扣协议解约相关信息
         */
        public async Task<CreateLeaseZftagreementunsignResponse> CreateLeaseZftagreementunsignAsync(CreateLeaseZftagreementunsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseZftagreementunsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方上传网商直付通代扣协议解约相关信息
         * Summary: 资方上传网商直付通代扣协议解约相关信息
         */
        public CreateLeaseZftagreementunsignResponse CreateLeaseZftagreementunsignEx(CreateLeaseZftagreementunsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseZftagreementunsignResponse>(DoRequest("1.0", "twc.notary.lease.zftagreementunsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方上传网商直付通代扣协议解约相关信息
         * Summary: 资方上传网商直付通代扣协议解约相关信息
         */
        public async Task<CreateLeaseZftagreementunsignResponse> CreateLeaseZftagreementunsignExAsync(CreateLeaseZftagreementunsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseZftagreementunsignResponse>(await DoRequestAsync("1.0", "twc.notary.lease.zftagreementunsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取蚂蚁链版存证证明
         * Summary: 获取蚂蚁链版存证证明
         */
        public GetCertificateDetailResponse GetCertificateDetail(GetCertificateDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCertificateDetailEx(request, headers, runtime);
        }

        /**
         * Description: 获取蚂蚁链版存证证明
         * Summary: 获取蚂蚁链版存证证明
         */
        public async Task<GetCertificateDetailResponse> GetCertificateDetailAsync(GetCertificateDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCertificateDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取蚂蚁链版存证证明
         * Summary: 获取蚂蚁链版存证证明
         */
        public GetCertificateDetailResponse GetCertificateDetailEx(GetCertificateDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCertificateDetailResponse>(DoRequest("1.0", "twc.notary.certificate.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取蚂蚁链版存证证明
         * Summary: 获取蚂蚁链版存证证明
         */
        public async Task<GetCertificateDetailResponse> GetCertificateDetailExAsync(GetCertificateDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCertificateDetailResponse>(await DoRequestAsync("1.0", "twc.notary.certificate.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文本存证内容
         * Summary: 获取文本存证内容
         */
        public GetInternalTextResponse GetInternalText(GetInternalTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInternalTextEx(request, headers, runtime);
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文本存证内容
         * Summary: 获取文本存证内容
         */
        public async Task<GetInternalTextResponse> GetInternalTextAsync(GetInternalTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInternalTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文本存证内容
         * Summary: 获取文本存证内容
         */
        public GetInternalTextResponse GetInternalTextEx(GetInternalTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInternalTextResponse>(DoRequest("1.0", "twc.notary.internal.text.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户通过交易哈希获取自己上传的文本存证内容
         * Summary: 获取文本存证内容
         */
        public async Task<GetInternalTextResponse> GetInternalTextExAsync(GetInternalTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInternalTextResponse>(await DoRequestAsync("1.0", "twc.notary.internal.text.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方服务获取开通权限，标记开通状态。
         * Summary: 三方服务获取开通权限，标记开通状态。
         */
        public OpenInternalTwcResponse OpenInternalTwc(OpenInternalTwcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenInternalTwcEx(request, headers, runtime);
        }

        /**
         * Description: 三方服务获取开通权限，标记开通状态。
         * Summary: 三方服务获取开通权限，标记开通状态。
         */
        public async Task<OpenInternalTwcResponse> OpenInternalTwcAsync(OpenInternalTwcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenInternalTwcExAsync(request, headers, runtime);
        }

        /**
         * Description: 三方服务获取开通权限，标记开通状态。
         * Summary: 三方服务获取开通权限，标记开通状态。
         */
        public OpenInternalTwcResponse OpenInternalTwcEx(OpenInternalTwcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenInternalTwcResponse>(DoRequest("1.0", "twc.notary.internal.twc.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 三方服务获取开通权限，标记开通状态。
         * Summary: 三方服务获取开通权限，标记开通状态。
         */
        public async Task<OpenInternalTwcResponse> OpenInternalTwcExAsync(OpenInternalTwcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenInternalTwcResponse>(await DoRequestAsync("1.0", "twc.notary.internal.twc.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定节点获取存证事务Id
         * Summary: 指定节点获取存证事务id
         */
        public CreateSpecifyTransResponse CreateSpecifyTrans(CreateSpecifyTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSpecifyTransEx(request, headers, runtime);
        }

        /**
         * Description: 指定节点获取存证事务Id
         * Summary: 指定节点获取存证事务id
         */
        public async Task<CreateSpecifyTransResponse> CreateSpecifyTransAsync(CreateSpecifyTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSpecifyTransExAsync(request, headers, runtime);
        }

        /**
         * Description: 指定节点获取存证事务Id
         * Summary: 指定节点获取存证事务id
         */
        public CreateSpecifyTransResponse CreateSpecifyTransEx(CreateSpecifyTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpecifyTransResponse>(DoRequest("1.0", "twc.notary.specify.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定节点获取存证事务Id
         * Summary: 指定节点获取存证事务id
         */
        public async Task<CreateSpecifyTransResponse> CreateSpecifyTransExAsync(CreateSpecifyTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpecifyTransResponse>(await DoRequestAsync("1.0", "twc.notary.specify.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定节点文本存证
         * Summary: 指定节点文本存证
         */
        public CreateSpecifyTextResponse CreateSpecifyText(CreateSpecifyTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSpecifyTextEx(request, headers, runtime);
        }

        /**
         * Description: 指定节点文本存证
         * Summary: 指定节点文本存证
         */
        public async Task<CreateSpecifyTextResponse> CreateSpecifyTextAsync(CreateSpecifyTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSpecifyTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 指定节点文本存证
         * Summary: 指定节点文本存证
         */
        public CreateSpecifyTextResponse CreateSpecifyTextEx(CreateSpecifyTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpecifyTextResponse>(DoRequest("1.0", "twc.notary.specify.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定节点文本存证
         * Summary: 指定节点文本存证
         */
        public async Task<CreateSpecifyTextResponse> CreateSpecifyTextExAsync(CreateSpecifyTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpecifyTextResponse>(await DoRequestAsync("1.0", "twc.notary.specify.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件存证大租户内部接口
         * Summary: 文件存证内部接口
         */
        public CreateInternalFileResponse CreateInternalFile(CreateInternalFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateInternalFileEx(request, headers, runtime);
        }

        /**
         * Description: 文件存证大租户内部接口
         * Summary: 文件存证内部接口
         */
        public async Task<CreateInternalFileResponse> CreateInternalFileAsync(CreateInternalFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateInternalFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 文件存证大租户内部接口
         * Summary: 文件存证内部接口
         */
        public CreateInternalFileResponse CreateInternalFileEx(CreateInternalFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInternalFileResponse>(DoRequest("1.0", "twc.notary.internal.file.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 文件存证大租户内部接口
         * Summary: 文件存证内部接口
         */
        public async Task<CreateInternalFileResponse> CreateInternalFileExAsync(CreateInternalFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateInternalFileResponse>(await DoRequestAsync("1.0", "twc.notary.internal.file.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取文件存证内容内部接口
         * Summary: 获取文件存证内容内部接口
         */
        public GetInternalFileResponse GetInternalFile(GetInternalFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetInternalFileEx(request, headers, runtime);
        }

        /**
         * Description: 获取文件存证内容内部接口
         * Summary: 获取文件存证内容内部接口
         */
        public async Task<GetInternalFileResponse> GetInternalFileAsync(GetInternalFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetInternalFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取文件存证内容内部接口
         * Summary: 获取文件存证内容内部接口
         */
        public GetInternalFileResponse GetInternalFileEx(GetInternalFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInternalFileResponse>(DoRequest("1.0", "twc.notary.internal.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取文件存证内容内部接口
         * Summary: 获取文件存证内容内部接口
         */
        public async Task<GetInternalFileResponse> GetInternalFileExAsync(GetInternalFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetInternalFileResponse>(await DoRequestAsync("1.0", "twc.notary.internal.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转文本存证
         * Summary: 数据流转文本存证
         */
        public CreateDataflowTextResponse CreateDataflowText(CreateDataflowTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDataflowTextEx(request, headers, runtime);
        }

        /**
         * Description: 数据流转文本存证
         * Summary: 数据流转文本存证
         */
        public async Task<CreateDataflowTextResponse> CreateDataflowTextAsync(CreateDataflowTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDataflowTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据流转文本存证
         * Summary: 数据流转文本存证
         */
        public CreateDataflowTextResponse CreateDataflowTextEx(CreateDataflowTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataflowTextResponse>(DoRequest("1.0", "twc.notary.dataflow.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转文本存证
         * Summary: 数据流转文本存证
         */
        public async Task<CreateDataflowTextResponse> CreateDataflowTextExAsync(CreateDataflowTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataflowTextResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.text.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据流转文本存证内容
         * Summary: 查询数据流转文本存证内容
         */
        public GetDataflowTextResponse GetDataflowText(GetDataflowTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDataflowTextEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据流转文本存证内容
         * Summary: 查询数据流转文本存证内容
         */
        public async Task<GetDataflowTextResponse> GetDataflowTextAsync(GetDataflowTextRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDataflowTextExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据流转文本存证内容
         * Summary: 查询数据流转文本存证内容
         */
        public GetDataflowTextResponse GetDataflowTextEx(GetDataflowTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataflowTextResponse>(DoRequest("1.0", "twc.notary.dataflow.text.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据流转文本存证内容
         * Summary: 查询数据流转文本存证内容
         */
        public async Task<GetDataflowTextResponse> GetDataflowTextExAsync(GetDataflowTextRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataflowTextResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.text.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转存证创建存证事务
         * Summary: 数据流转存证创建存证事务
         */
        public CreateDataflowTransResponse CreateDataflowTrans(CreateDataflowTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDataflowTransEx(request, headers, runtime);
        }

        /**
         * Description: 数据流转存证创建存证事务
         * Summary: 数据流转存证创建存证事务
         */
        public async Task<CreateDataflowTransResponse> CreateDataflowTransAsync(CreateDataflowTransRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDataflowTransExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据流转存证创建存证事务
         * Summary: 数据流转存证创建存证事务
         */
        public CreateDataflowTransResponse CreateDataflowTransEx(CreateDataflowTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataflowTransResponse>(DoRequest("1.0", "twc.notary.dataflow.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转存证创建存证事务
         * Summary: 数据流转存证创建存证事务
         */
        public async Task<CreateDataflowTransResponse> CreateDataflowTransExAsync(CreateDataflowTransRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataflowTransResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.trans.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
         * Summary: 发起管理合约部署
         */
        public DeployDataflowContractResponse DeployDataflowContract(DeployDataflowContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeployDataflowContractEx(request, headers, runtime);
        }

        /**
         * Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
         * Summary: 发起管理合约部署
         */
        public async Task<DeployDataflowContractResponse> DeployDataflowContractAsync(DeployDataflowContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeployDataflowContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
         * Summary: 发起管理合约部署
         */
        public DeployDataflowContractResponse DeployDataflowContractEx(DeployDataflowContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeployDataflowContractResponse>(DoRequest("1.0", "twc.notary.dataflow.contract.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
         * Summary: 发起管理合约部署
         */
        public async Task<DeployDataflowContractResponse> DeployDataflowContractExAsync(DeployDataflowContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeployDataflowContractResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.contract.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
         * Summary: 发起授权
         */
        public CreateDataflowAuthorizeResponse CreateDataflowAuthorize(CreateDataflowAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDataflowAuthorizeEx(request, headers, runtime);
        }

        /**
         * Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
         * Summary: 发起授权
         */
        public async Task<CreateDataflowAuthorizeResponse> CreateDataflowAuthorizeAsync(CreateDataflowAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDataflowAuthorizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
         * Summary: 发起授权
         */
        public CreateDataflowAuthorizeResponse CreateDataflowAuthorizeEx(CreateDataflowAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataflowAuthorizeResponse>(DoRequest("1.0", "twc.notary.dataflow.authorize.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
         * Summary: 发起授权
         */
        public async Task<CreateDataflowAuthorizeResponse> CreateDataflowAuthorizeExAsync(CreateDataflowAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataflowAuthorizeResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.authorize.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证方对撤销已经发起的权限授予。
         * Summary: 撤销授权
         */
        public CancelDataflowAuthorizeResponse CancelDataflowAuthorize(CancelDataflowAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelDataflowAuthorizeEx(request, headers, runtime);
        }

        /**
         * Description: 存证方对撤销已经发起的权限授予。
         * Summary: 撤销授权
         */
        public async Task<CancelDataflowAuthorizeResponse> CancelDataflowAuthorizeAsync(CancelDataflowAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelDataflowAuthorizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证方对撤销已经发起的权限授予。
         * Summary: 撤销授权
         */
        public CancelDataflowAuthorizeResponse CancelDataflowAuthorizeEx(CancelDataflowAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDataflowAuthorizeResponse>(DoRequest("1.0", "twc.notary.dataflow.authorize.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证方对撤销已经发起的权限授予。
         * Summary: 撤销授权
         */
        public async Task<CancelDataflowAuthorizeResponse> CancelDataflowAuthorizeExAsync(CancelDataflowAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDataflowAuthorizeResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.authorize.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
         * Summary: 查询对存证合约的各类操作执行结果
         */
        public QueryDataflowActionResponse QueryDataflowAction(QueryDataflowActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDataflowActionEx(request, headers, runtime);
        }

        /**
         * Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
         * Summary: 查询对存证合约的各类操作执行结果
         */
        public async Task<QueryDataflowActionResponse> QueryDataflowActionAsync(QueryDataflowActionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDataflowActionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
         * Summary: 查询对存证合约的各类操作执行结果
         */
        public QueryDataflowActionResponse QueryDataflowActionEx(QueryDataflowActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataflowActionResponse>(DoRequest("1.0", "twc.notary.dataflow.action.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
         * Summary: 查询对存证合约的各类操作执行结果
         */
        public async Task<QueryDataflowActionResponse> QueryDataflowActionExAsync(QueryDataflowActionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataflowActionResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.action.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
         * Summary: 发起信封密钥上传
         */
        public UploadDataflowPubkeyResponse UploadDataflowPubkey(UploadDataflowPubkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadDataflowPubkeyEx(request, headers, runtime);
        }

        /**
         * Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
         * Summary: 发起信封密钥上传
         */
        public async Task<UploadDataflowPubkeyResponse> UploadDataflowPubkeyAsync(UploadDataflowPubkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadDataflowPubkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
         * Summary: 发起信封密钥上传
         */
        public UploadDataflowPubkeyResponse UploadDataflowPubkeyEx(UploadDataflowPubkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadDataflowPubkeyResponse>(DoRequest("1.0", "twc.notary.dataflow.pubkey.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
         * Summary: 发起信封密钥上传
         */
        public async Task<UploadDataflowPubkeyResponse> UploadDataflowPubkeyExAsync(UploadDataflowPubkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadDataflowPubkeyResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.pubkey.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转存证创建链上账户
         * Summary: 数据流转存证创建链上账户
         */
        public CreateDataflowAccountResponse CreateDataflowAccount(CreateDataflowAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDataflowAccountEx(request, headers, runtime);
        }

        /**
         * Description: 数据流转存证创建链上账户
         * Summary: 数据流转存证创建链上账户
         */
        public async Task<CreateDataflowAccountResponse> CreateDataflowAccountAsync(CreateDataflowAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDataflowAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据流转存证创建链上账户
         * Summary: 数据流转存证创建链上账户
         */
        public CreateDataflowAccountResponse CreateDataflowAccountEx(CreateDataflowAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataflowAccountResponse>(DoRequest("1.0", "twc.notary.dataflow.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转存证创建链上账户
         * Summary: 数据流转存证创建链上账户
         */
        public async Task<CreateDataflowAccountResponse> CreateDataflowAccountExAsync(CreateDataflowAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataflowAccountResponse>(await DoRequestAsync("1.0", "twc.notary.dataflow.account.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起一体化文件存证
         * Summary: 发起一体化文件存证
         */
        public CreateFileIntegrationResponse CreateFileIntegration(CreateFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFileIntegrationEx(request, headers, runtime);
        }

        /**
         * Description: 发起一体化文件存证
         * Summary: 发起一体化文件存证
         */
        public async Task<CreateFileIntegrationResponse> CreateFileIntegrationAsync(CreateFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFileIntegrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起一体化文件存证
         * Summary: 发起一体化文件存证
         */
        public CreateFileIntegrationResponse CreateFileIntegrationEx(CreateFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFileIntegrationResponse>(DoRequest("1.0", "twc.notary.file.integration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起一体化文件存证
         * Summary: 发起一体化文件存证
         */
        public async Task<CreateFileIntegrationResponse> CreateFileIntegrationExAsync(CreateFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFileIntegrationResponse>(await DoRequestAsync("1.0", "twc.notary.file.integration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成一体化文件存证
         * Summary: 完成一体化文件存证
         */
        public FinishFileIntegrationResponse FinishFileIntegration(FinishFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishFileIntegrationEx(request, headers, runtime);
        }

        /**
         * Description: 完成一体化文件存证
         * Summary: 完成一体化文件存证
         */
        public async Task<FinishFileIntegrationResponse> FinishFileIntegrationAsync(FinishFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishFileIntegrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 完成一体化文件存证
         * Summary: 完成一体化文件存证
         */
        public FinishFileIntegrationResponse FinishFileIntegrationEx(FinishFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishFileIntegrationResponse>(DoRequest("1.0", "twc.notary.file.integration.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成一体化文件存证
         * Summary: 完成一体化文件存证
         */
        public async Task<FinishFileIntegrationResponse> FinishFileIntegrationExAsync(FinishFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishFileIntegrationResponse>(await DoRequestAsync("1.0", "twc.notary.file.integration.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一体化文件存证
         * Summary: 查询一体化文件存证
         */
        public GetFileIntegrationResponse GetFileIntegration(GetFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFileIntegrationEx(request, headers, runtime);
        }

        /**
         * Description: 查询一体化文件存证
         * Summary: 查询一体化文件存证
         */
        public async Task<GetFileIntegrationResponse> GetFileIntegrationAsync(GetFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFileIntegrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一体化文件存证
         * Summary: 查询一体化文件存证
         */
        public GetFileIntegrationResponse GetFileIntegrationEx(GetFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFileIntegrationResponse>(DoRequest("1.0", "twc.notary.file.integration.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一体化文件存证
         * Summary: 查询一体化文件存证
         */
        public async Task<GetFileIntegrationResponse> GetFileIntegrationExAsync(GetFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFileIntegrationResponse>(await DoRequestAsync("1.0", "twc.notary.file.integration.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一体化文件存证-发起授权
         * Summary: 一体化文件存证-发起授权
         */
        public AuthFileIntegrationResponse AuthFileIntegration(AuthFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthFileIntegrationEx(request, headers, runtime);
        }

        /**
         * Description: 一体化文件存证-发起授权
         * Summary: 一体化文件存证-发起授权
         */
        public async Task<AuthFileIntegrationResponse> AuthFileIntegrationAsync(AuthFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthFileIntegrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 一体化文件存证-发起授权
         * Summary: 一体化文件存证-发起授权
         */
        public AuthFileIntegrationResponse AuthFileIntegrationEx(AuthFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthFileIntegrationResponse>(DoRequest("1.0", "twc.notary.file.integration.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一体化文件存证-发起授权
         * Summary: 一体化文件存证-发起授权
         */
        public async Task<AuthFileIntegrationResponse> AuthFileIntegrationExAsync(AuthFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthFileIntegrationResponse>(await DoRequestAsync("1.0", "twc.notary.file.integration.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一体化文件存证-取消授权
         * Summary: 一体化文件存证-取消授权
         */
        public CancelFileIntegrationResponse CancelFileIntegration(CancelFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelFileIntegrationEx(request, headers, runtime);
        }

        /**
         * Description: 一体化文件存证-取消授权
         * Summary: 一体化文件存证-取消授权
         */
        public async Task<CancelFileIntegrationResponse> CancelFileIntegrationAsync(CancelFileIntegrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelFileIntegrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 一体化文件存证-取消授权
         * Summary: 一体化文件存证-取消授权
         */
        public CancelFileIntegrationResponse CancelFileIntegrationEx(CancelFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelFileIntegrationResponse>(DoRequest("1.0", "twc.notary.file.integration.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一体化文件存证-取消授权
         * Summary: 一体化文件存证-取消授权
         */
        public async Task<CancelFileIntegrationResponse> CancelFileIntegrationExAsync(CancelFileIntegrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelFileIntegrationResponse>(await DoRequestAsync("1.0", "twc.notary.file.integration.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建存证流程实例
         * Summary: 创建存证流程实例
         */
        public CreateFlowInstanceResponse CreateFlowInstance(CreateFlowInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFlowInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 创建存证流程实例
         * Summary: 创建存证流程实例
         */
        public async Task<CreateFlowInstanceResponse> CreateFlowInstanceAsync(CreateFlowInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFlowInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建存证流程实例
         * Summary: 创建存证流程实例
         */
        public CreateFlowInstanceResponse CreateFlowInstanceEx(CreateFlowInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowInstanceResponse>(DoRequest("1.0", "twc.notary.flow.instance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建存证流程实例
         * Summary: 创建存证流程实例
         */
        public async Task<CreateFlowInstanceResponse> CreateFlowInstanceExAsync(CreateFlowInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowInstanceResponse>(await DoRequestAsync("1.0", "twc.notary.flow.instance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证流程实例完结
         * Summary: 存证流程实例完结
         */
        public FinishFlowInstanceResponse FinishFlowInstance(FinishFlowInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishFlowInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 存证流程实例完结
         * Summary: 存证流程实例完结
         */
        public async Task<FinishFlowInstanceResponse> FinishFlowInstanceAsync(FinishFlowInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishFlowInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证流程实例完结
         * Summary: 存证流程实例完结
         */
        public FinishFlowInstanceResponse FinishFlowInstanceEx(FinishFlowInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishFlowInstanceResponse>(DoRequest("1.0", "twc.notary.flow.instance.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证流程实例完结
         * Summary: 存证流程实例完结
         */
        public async Task<FinishFlowInstanceResponse> FinishFlowInstanceExAsync(FinishFlowInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishFlowInstanceResponse>(await DoRequestAsync("1.0", "twc.notary.flow.instance.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建阶段存证
         * Summary: 创建阶段存证
         */
        public InitFlowPhaseResponse InitFlowPhase(InitFlowPhaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitFlowPhaseEx(request, headers, runtime);
        }

        /**
         * Description: 创建阶段存证
         * Summary: 创建阶段存证
         */
        public async Task<InitFlowPhaseResponse> InitFlowPhaseAsync(InitFlowPhaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitFlowPhaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建阶段存证
         * Summary: 创建阶段存证
         */
        public InitFlowPhaseResponse InitFlowPhaseEx(InitFlowPhaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFlowPhaseResponse>(DoRequest("1.0", "twc.notary.flow.phase.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建阶段存证
         * Summary: 创建阶段存证
         */
        public async Task<InitFlowPhaseResponse> InitFlowPhaseExAsync(InitFlowPhaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitFlowPhaseResponse>(await DoRequestAsync("1.0", "twc.notary.flow.phase.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询阶段存证结果
         * Summary: 查询阶段存证结果
         */
        public QueryFlowPhaseResponse QueryFlowPhase(QueryFlowPhaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowPhaseEx(request, headers, runtime);
        }

        /**
         * Description: 查询阶段存证结果
         * Summary: 查询阶段存证结果
         */
        public async Task<QueryFlowPhaseResponse> QueryFlowPhaseAsync(QueryFlowPhaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowPhaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询阶段存证结果
         * Summary: 查询阶段存证结果
         */
        public QueryFlowPhaseResponse QueryFlowPhaseEx(QueryFlowPhaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowPhaseResponse>(DoRequest("1.0", "twc.notary.flow.phase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询阶段存证结果
         * Summary: 查询阶段存证结果
         */
        public async Task<QueryFlowPhaseResponse> QueryFlowPhaseExAsync(QueryFlowPhaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowPhaseResponse>(await DoRequestAsync("1.0", "twc.notary.flow.phase.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阶段存证数据详情
         * Summary: 阶段存证数据详情
         */
        public DetailFlowPhaseResponse DetailFlowPhase(DetailFlowPhaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailFlowPhaseEx(request, headers, runtime);
        }

        /**
         * Description: 阶段存证数据详情
         * Summary: 阶段存证数据详情
         */
        public async Task<DetailFlowPhaseResponse> DetailFlowPhaseAsync(DetailFlowPhaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailFlowPhaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 阶段存证数据详情
         * Summary: 阶段存证数据详情
         */
        public DetailFlowPhaseResponse DetailFlowPhaseEx(DetailFlowPhaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailFlowPhaseResponse>(DoRequest("1.0", "twc.notary.flow.phase.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阶段存证数据详情
         * Summary: 阶段存证数据详情
         */
        public async Task<DetailFlowPhaseResponse> DetailFlowPhaseExAsync(DetailFlowPhaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailFlowPhaseResponse>(await DoRequestAsync("1.0", "twc.notary.flow.phase.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一键创建全流程存证实例和阶段存证
         * Summary: 一键创建全流程存证实例和阶段存证
         */
        public CreateFlowOnestepnotaryResponse CreateFlowOnestepnotary(CreateFlowOnestepnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFlowOnestepnotaryEx(request, headers, runtime);
        }

        /**
         * Description: 一键创建全流程存证实例和阶段存证
         * Summary: 一键创建全流程存证实例和阶段存证
         */
        public async Task<CreateFlowOnestepnotaryResponse> CreateFlowOnestepnotaryAsync(CreateFlowOnestepnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFlowOnestepnotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 一键创建全流程存证实例和阶段存证
         * Summary: 一键创建全流程存证实例和阶段存证
         */
        public CreateFlowOnestepnotaryResponse CreateFlowOnestepnotaryEx(CreateFlowOnestepnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowOnestepnotaryResponse>(DoRequest("1.0", "twc.notary.flow.onestepnotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一键创建全流程存证实例和阶段存证
         * Summary: 一键创建全流程存证实例和阶段存证
         */
        public async Task<CreateFlowOnestepnotaryResponse> CreateFlowOnestepnotaryExAsync(CreateFlowOnestepnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowOnestepnotaryResponse>(await DoRequestAsync("1.0", "twc.notary.flow.onestepnotary.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一键创建全流程存证进度状态
         * Summary: 查询一键创建全流程存证进度状态
         */
        public QueryFlowOnestepnotaryResponse QueryFlowOnestepnotary(QueryFlowOnestepnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowOnestepnotaryEx(request, headers, runtime);
        }

        /**
         * Description: 查询一键创建全流程存证进度状态
         * Summary: 查询一键创建全流程存证进度状态
         */
        public async Task<QueryFlowOnestepnotaryResponse> QueryFlowOnestepnotaryAsync(QueryFlowOnestepnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowOnestepnotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一键创建全流程存证进度状态
         * Summary: 查询一键创建全流程存证进度状态
         */
        public QueryFlowOnestepnotaryResponse QueryFlowOnestepnotaryEx(QueryFlowOnestepnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowOnestepnotaryResponse>(DoRequest("1.0", "twc.notary.flow.onestepnotary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一键创建全流程存证进度状态
         * Summary: 查询一键创建全流程存证进度状态
         */
        public async Task<QueryFlowOnestepnotaryResponse> QueryFlowOnestepnotaryExAsync(QueryFlowOnestepnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowOnestepnotaryResponse>(await DoRequestAsync("1.0", "twc.notary.flow.onestepnotary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证全流程证明申请
         * Summary: 存证全流程证明申请
         */
        public ApplyFlowCertificateResponse ApplyFlowCertificate(ApplyFlowCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyFlowCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 存证全流程证明申请
         * Summary: 存证全流程证明申请
         */
        public async Task<ApplyFlowCertificateResponse> ApplyFlowCertificateAsync(ApplyFlowCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyFlowCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证全流程证明申请
         * Summary: 存证全流程证明申请
         */
        public ApplyFlowCertificateResponse ApplyFlowCertificateEx(ApplyFlowCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFlowCertificateResponse>(DoRequest("1.0", "twc.notary.flow.certificate.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证全流程证明申请
         * Summary: 存证全流程证明申请
         */
        public async Task<ApplyFlowCertificateResponse> ApplyFlowCertificateExAsync(ApplyFlowCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFlowCertificateResponse>(await DoRequestAsync("1.0", "twc.notary.flow.certificate.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证全流程证明出证进度查询
         * Summary: 存证全流程证明出证进度查询
         */
        public QueryFlowCertificateResponse QueryFlowCertificate(QueryFlowCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 存证全流程证明出证进度查询
         * Summary: 存证全流程证明出证进度查询
         */
        public async Task<QueryFlowCertificateResponse> QueryFlowCertificateAsync(QueryFlowCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 存证全流程证明出证进度查询
         * Summary: 存证全流程证明出证进度查询
         */
        public QueryFlowCertificateResponse QueryFlowCertificateEx(QueryFlowCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowCertificateResponse>(DoRequest("1.0", "twc.notary.flow.certificate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 存证全流程证明出证进度查询
         * Summary: 存证全流程证明出证进度查询
         */
        public async Task<QueryFlowCertificateResponse> QueryFlowCertificateExAsync(QueryFlowCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowCertificateResponse>(await DoRequestAsync("1.0", "twc.notary.flow.certificate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根全流程出证申请
         * Summary: 数字票根全流程出证申请
         */
        public ApplyStubCertificateResponse ApplyStubCertificate(ApplyStubCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyStubCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 数字票根全流程出证申请
         * Summary: 数字票根全流程出证申请
         */
        public async Task<ApplyStubCertificateResponse> ApplyStubCertificateAsync(ApplyStubCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyStubCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字票根全流程出证申请
         * Summary: 数字票根全流程出证申请
         */
        public ApplyStubCertificateResponse ApplyStubCertificateEx(ApplyStubCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyStubCertificateResponse>(DoRequest("1.0", "twc.notary.stub.certificate.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根全流程出证申请
         * Summary: 数字票根全流程出证申请
         */
        public async Task<ApplyStubCertificateResponse> ApplyStubCertificateExAsync(ApplyStubCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyStubCertificateResponse>(await DoRequestAsync("1.0", "twc.notary.stub.certificate.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根全流程证明出证进度查询
         * Summary: 数字票根全流程证明出证进度查询
         */
        public QueryStubCertificateResponse QueryStubCertificate(QueryStubCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStubCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 数字票根全流程证明出证进度查询
         * Summary: 数字票根全流程证明出证进度查询
         */
        public async Task<QueryStubCertificateResponse> QueryStubCertificateAsync(QueryStubCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStubCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字票根全流程证明出证进度查询
         * Summary: 数字票根全流程证明出证进度查询
         */
        public QueryStubCertificateResponse QueryStubCertificateEx(QueryStubCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStubCertificateResponse>(DoRequest("1.0", "twc.notary.stub.certificate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根全流程证明出证进度查询
         * Summary: 数字票根全流程证明出证进度查询
         */
        public async Task<QueryStubCertificateResponse> QueryStubCertificateExAsync(QueryStubCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStubCertificateResponse>(await DoRequestAsync("1.0", "twc.notary.stub.certificate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根全流程存证进度查询
         * Summary: 数字票根全流程存证进度查询
         */
        public QueryStubResponse QueryStub(QueryStubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStubEx(request, headers, runtime);
        }

        /**
         * Description: 数字票根全流程存证进度查询
         * Summary: 数字票根全流程存证进度查询
         */
        public async Task<QueryStubResponse> QueryStubAsync(QueryStubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStubExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字票根全流程存证进度查询
         * Summary: 数字票根全流程存证进度查询
         */
        public QueryStubResponse QueryStubEx(QueryStubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStubResponse>(DoRequest("1.0", "twc.notary.stub.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根全流程存证进度查询
         * Summary: 数字票根全流程存证进度查询
         */
        public async Task<QueryStubResponse> QueryStubExAsync(QueryStubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStubResponse>(await DoRequestAsync("1.0", "twc.notary.stub.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根全流程存证创建
         * Summary: 数字票根全流程存证创建
         */
        public CreateStubResponse CreateStub(CreateStubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateStubEx(request, headers, runtime);
        }

        /**
         * Description: 数字票根全流程存证创建
         * Summary: 数字票根全流程存证创建
         */
        public async Task<CreateStubResponse> CreateStubAsync(CreateStubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateStubExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字票根全流程存证创建
         * Summary: 数字票根全流程存证创建
         */
        public CreateStubResponse CreateStubEx(CreateStubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStubResponse>(DoRequest("1.0", "twc.notary.stub.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根全流程存证创建
         * Summary: 数字票根全流程存证创建
         */
        public async Task<CreateStubResponse> CreateStubExAsync(CreateStubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStubResponse>(await DoRequestAsync("1.0", "twc.notary.stub.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数字票根是否存在
         * Summary: 查询数字票根是否存在
         */
        public ExistStubResponse ExistStub(ExistStubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistStubEx(request, headers, runtime);
        }

        /**
         * Description: 查询数字票根是否存在
         * Summary: 查询数字票根是否存在
         */
        public async Task<ExistStubResponse> ExistStubAsync(ExistStubRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistStubExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数字票根是否存在
         * Summary: 查询数字票根是否存在
         */
        public ExistStubResponse ExistStubEx(ExistStubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistStubResponse>(DoRequest("1.0", "twc.notary.stub.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数字票根是否存在
         * Summary: 查询数字票根是否存在
         */
        public async Task<ExistStubResponse> ExistStubExAsync(ExistStubRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistStubResponse>(await DoRequestAsync("1.0", "twc.notary.stub.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根-清分接口
         * Summary: 数字票根-清分接口
         */
        public CreateStubClearingResponse CreateStubClearing(CreateStubClearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateStubClearingEx(request, headers, runtime);
        }

        /**
         * Description: 数字票根-清分接口
         * Summary: 数字票根-清分接口
         */
        public async Task<CreateStubClearingResponse> CreateStubClearingAsync(CreateStubClearingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateStubClearingExAsync(request, headers, runtime);
        }

        /**
         * Description: 数字票根-清分接口
         * Summary: 数字票根-清分接口
         */
        public CreateStubClearingResponse CreateStubClearingEx(CreateStubClearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStubClearingResponse>(DoRequest("1.0", "twc.notary.stub.clearing.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数字票根-清分接口
         * Summary: 数字票根-清分接口
         */
        public async Task<CreateStubClearingResponse> CreateStubClearingExAsync(CreateStubClearingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStubClearingResponse>(await DoRequestAsync("1.0", "twc.notary.stub.clearing.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请全流程证据包，包括链上证据包和链下证据包
         * Summary: 申请全流程证据包
         */
        public ApplyFlowEvidenceResponse ApplyFlowEvidence(ApplyFlowEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyFlowEvidenceEx(request, headers, runtime);
        }

        /**
         * Description: 申请全流程证据包，包括链上证据包和链下证据包
         * Summary: 申请全流程证据包
         */
        public async Task<ApplyFlowEvidenceResponse> ApplyFlowEvidenceAsync(ApplyFlowEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyFlowEvidenceExAsync(request, headers, runtime);
        }

        /**
         * Description: 申请全流程证据包，包括链上证据包和链下证据包
         * Summary: 申请全流程证据包
         */
        public ApplyFlowEvidenceResponse ApplyFlowEvidenceEx(ApplyFlowEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFlowEvidenceResponse>(DoRequest("1.0", "twc.notary.flow.evidence.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请全流程证据包，包括链上证据包和链下证据包
         * Summary: 申请全流程证据包
         */
        public async Task<ApplyFlowEvidenceResponse> ApplyFlowEvidenceExAsync(ApplyFlowEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFlowEvidenceResponse>(await DoRequestAsync("1.0", "twc.notary.flow.evidence.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全流程证据包生成进度查询
         * Summary: 全流程证据包生成进度查询
         */
        public QueryFlowEvidenceResponse QueryFlowEvidence(QueryFlowEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowEvidenceEx(request, headers, runtime);
        }

        /**
         * Description: 全流程证据包生成进度查询
         * Summary: 全流程证据包生成进度查询
         */
        public async Task<QueryFlowEvidenceResponse> QueryFlowEvidenceAsync(QueryFlowEvidenceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowEvidenceExAsync(request, headers, runtime);
        }

        /**
         * Description: 全流程证据包生成进度查询
         * Summary: 全流程证据包生成进度查询
         */
        public QueryFlowEvidenceResponse QueryFlowEvidenceEx(QueryFlowEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowEvidenceResponse>(DoRequest("1.0", "twc.notary.flow.evidence.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全流程证据包生成进度查询
         * Summary: 全流程证据包生成进度查询
         */
        public async Task<QueryFlowEvidenceResponse> QueryFlowEvidenceExAsync(QueryFlowEvidenceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowEvidenceResponse>(await DoRequestAsync("1.0", "twc.notary.flow.evidence.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全流程证据授权码申请
         * Summary: 全流程证据授权码申请
         */
        public ApplyFlowAuthResponse ApplyFlowAuth(ApplyFlowAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyFlowAuthEx(request, headers, runtime);
        }

        /**
         * Description: 全流程证据授权码申请
         * Summary: 全流程证据授权码申请
         */
        public async Task<ApplyFlowAuthResponse> ApplyFlowAuthAsync(ApplyFlowAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyFlowAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 全流程证据授权码申请
         * Summary: 全流程证据授权码申请
         */
        public ApplyFlowAuthResponse ApplyFlowAuthEx(ApplyFlowAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFlowAuthResponse>(DoRequest("1.0", "twc.notary.flow.auth.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全流程证据授权码申请
         * Summary: 全流程证据授权码申请
         */
        public async Task<ApplyFlowAuthResponse> ApplyFlowAuthExAsync(ApplyFlowAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyFlowAuthResponse>(await DoRequestAsync("1.0", "twc.notary.flow.auth.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全流程详情查询
         * Summary: 全流程详情查询
         */
        public DetailFlowInstanceResponse DetailFlowInstance(DetailFlowInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailFlowInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 全流程详情查询
         * Summary: 全流程详情查询
         */
        public async Task<DetailFlowInstanceResponse> DetailFlowInstanceAsync(DetailFlowInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailFlowInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 全流程详情查询
         * Summary: 全流程详情查询
         */
        public DetailFlowInstanceResponse DetailFlowInstanceEx(DetailFlowInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailFlowInstanceResponse>(DoRequest("1.0", "twc.notary.flow.instance.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全流程详情查询
         * Summary: 全流程详情查询
         */
        public async Task<DetailFlowInstanceResponse> DetailFlowInstanceExAsync(DetailFlowInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailFlowInstanceResponse>(await DoRequestAsync("1.0", "twc.notary.flow.instance.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合约校验接口
         * Summary: 合约校验接口
         */
        public CheckContractResponse CheckContract(CheckContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckContractEx(request, headers, runtime);
        }

        /**
         * Description: 合约校验接口
         * Summary: 合约校验接口
         */
        public async Task<CheckContractResponse> CheckContractAsync(CheckContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 合约校验接口
         * Summary: 合约校验接口
         */
        public CheckContractResponse CheckContractEx(CheckContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckContractResponse>(DoRequest("1.0", "twc.notary.contract.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合约校验接口
         * Summary: 合约校验接口
         */
        public async Task<CheckContractResponse> CheckContractExAsync(CheckContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckContractResponse>(await DoRequestAsync("1.0", "twc.notary.contract.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询合约核验结果
         * Summary: 查询合约核验结果
         */
        public QueryContractStatusResponse QueryContractStatus(QueryContractStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractStatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询合约核验结果
         * Summary: 查询合约核验结果
         */
        public async Task<QueryContractStatusResponse> QueryContractStatusAsync(QueryContractStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询合约核验结果
         * Summary: 查询合约核验结果
         */
        public QueryContractStatusResponse QueryContractStatusEx(QueryContractStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractStatusResponse>(DoRequest("1.0", "twc.notary.contract.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询合约核验结果
         * Summary: 查询合约核验结果
         */
        public async Task<QueryContractStatusResponse> QueryContractStatusExAsync(QueryContractStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractStatusResponse>(await DoRequestAsync("1.0", "twc.notary.contract.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据业务场景码创建raceId
         * Summary: traceId创建接口
         */
        public CreateTrafficTraceidResponse CreateTrafficTraceid(CreateTrafficTraceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTrafficTraceidEx(request, headers, runtime);
        }

        /**
         * Description: 根据业务场景码创建raceId
         * Summary: traceId创建接口
         */
        public async Task<CreateTrafficTraceidResponse> CreateTrafficTraceidAsync(CreateTrafficTraceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTrafficTraceidExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据业务场景码创建raceId
         * Summary: traceId创建接口
         */
        public CreateTrafficTraceidResponse CreateTrafficTraceidEx(CreateTrafficTraceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTrafficTraceidResponse>(DoRequest("1.0", "twc.notary.traffic.traceid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据业务场景码创建raceId
         * Summary: traceId创建接口
         */
        public async Task<CreateTrafficTraceidResponse> CreateTrafficTraceidExAsync(CreateTrafficTraceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTrafficTraceidResponse>(await DoRequestAsync("1.0", "twc.notary.traffic.traceid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 业务方操作行为日志传入
         * Summary: 操作行为日志传入
         */
        public UploadTrafficOperatelogResponse UploadTrafficOperatelog(UploadTrafficOperatelogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadTrafficOperatelogEx(request, headers, runtime);
        }

        /**
         * Description: 业务方操作行为日志传入
         * Summary: 操作行为日志传入
         */
        public async Task<UploadTrafficOperatelogResponse> UploadTrafficOperatelogAsync(UploadTrafficOperatelogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadTrafficOperatelogExAsync(request, headers, runtime);
        }

        /**
         * Description: 业务方操作行为日志传入
         * Summary: 操作行为日志传入
         */
        public UploadTrafficOperatelogResponse UploadTrafficOperatelogEx(UploadTrafficOperatelogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTrafficOperatelogResponse>(DoRequest("1.0", "twc.notary.traffic.operatelog.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 业务方操作行为日志传入
         * Summary: 操作行为日志传入
         */
        public async Task<UploadTrafficOperatelogResponse> UploadTrafficOperatelogExAsync(UploadTrafficOperatelogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadTrafficOperatelogResponse>(await DoRequestAsync("1.0", "twc.notary.traffic.operatelog.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
