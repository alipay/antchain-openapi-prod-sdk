// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.YUQING.Models;

namespace AntChain.SDK.YUQING
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
                        {"sdk_version", "1.2.29"},
                        {"_prod_code", "YUQING"},
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
                        {"sdk_version", "1.2.29"},
                        {"_prod_code", "YUQING"},
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

        /**
         * Description: 查询舆情列表
         * Summary: 查询舆情列表
         */
        public QueryMessagesResponse QueryMessages(QueryMessagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMessagesEx(request, headers, runtime);
        }

        /**
         * Description: 查询舆情列表
         * Summary: 查询舆情列表
         */
        public async Task<QueryMessagesResponse> QueryMessagesAsync(QueryMessagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMessagesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询舆情列表
         * Summary: 查询舆情列表
         */
        public QueryMessagesResponse QueryMessagesEx(QueryMessagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMessagesResponse>(DoRequest("1.0", "universalsaas.yuqing.messages.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询舆情列表
         * Summary: 查询舆情列表
         */
        public async Task<QueryMessagesResponse> QueryMessagesExAsync(QueryMessagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMessagesResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.messages.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 舆情分析任务提交
         * Summary: 舆情分析任务提交
         */
        public SaveAnalysisSubmitResponse SaveAnalysisSubmit(SaveAnalysisSubmitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveAnalysisSubmitEx(request, headers, runtime);
        }

        /**
         * Description: 舆情分析任务提交
         * Summary: 舆情分析任务提交
         */
        public async Task<SaveAnalysisSubmitResponse> SaveAnalysisSubmitAsync(SaveAnalysisSubmitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveAnalysisSubmitExAsync(request, headers, runtime);
        }

        /**
         * Description: 舆情分析任务提交
         * Summary: 舆情分析任务提交
         */
        public SaveAnalysisSubmitResponse SaveAnalysisSubmitEx(SaveAnalysisSubmitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveAnalysisSubmitResponse>(DoRequest("1.0", "universalsaas.yuqing.analysis.submit.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 舆情分析任务提交
         * Summary: 舆情分析任务提交
         */
        public async Task<SaveAnalysisSubmitResponse> SaveAnalysisSubmitExAsync(SaveAnalysisSubmitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveAnalysisSubmitResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.analysis.submit.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 舆情分析任务查询
         * Summary: 舆情分析任务查询
         */
        public QueryAnalysisQueryResponse QueryAnalysisQuery(QueryAnalysisQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAnalysisQueryEx(request, headers, runtime);
        }

        /**
         * Description: 舆情分析任务查询
         * Summary: 舆情分析任务查询
         */
        public async Task<QueryAnalysisQueryResponse> QueryAnalysisQueryAsync(QueryAnalysisQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAnalysisQueryExAsync(request, headers, runtime);
        }

        /**
         * Description: 舆情分析任务查询
         * Summary: 舆情分析任务查询
         */
        public QueryAnalysisQueryResponse QueryAnalysisQueryEx(QueryAnalysisQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAnalysisQueryResponse>(DoRequest("1.0", "universalsaas.yuqing.analysis.query.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 舆情分析任务查询
         * Summary: 舆情分析任务查询
         */
        public async Task<QueryAnalysisQueryResponse> QueryAnalysisQueryExAsync(QueryAnalysisQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAnalysisQueryResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.analysis.query.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public SaveProductOpenResponse SaveProductOpen(SaveProductOpenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveProductOpenEx(request, headers, runtime);
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public async Task<SaveProductOpenResponse> SaveProductOpenAsync(SaveProductOpenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveProductOpenExAsync(request, headers, runtime);
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public SaveProductOpenResponse SaveProductOpenEx(SaveProductOpenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveProductOpenResponse>(DoRequest("1.0", "universalsaas.yuqing.product.open.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public async Task<SaveProductOpenResponse> SaveProductOpenExAsync(SaveProductOpenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveProductOpenResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.product.open.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public SaveProductTopResponse SaveProductTop(SaveProductTopRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveProductTopEx(request, headers, runtime);
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public async Task<SaveProductTopResponse> SaveProductTopAsync(SaveProductTopRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveProductTopExAsync(request, headers, runtime);
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public SaveProductTopResponse SaveProductTopEx(SaveProductTopRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveProductTopResponse>(DoRequest("1.0", "universalsaas.yuqing.product.top.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public async Task<SaveProductTopResponse> SaveProductTopExAsync(SaveProductTopRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveProductTopResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.product.top.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品操作接口
         * Summary: 产品操作接口
         */
        public SetProductOperateResponse SetProductOperate(SetProductOperateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetProductOperateEx(request, headers, runtime);
        }

        /**
         * Description: 产品操作接口
         * Summary: 产品操作接口
         */
        public async Task<SetProductOperateResponse> SetProductOperateAsync(SetProductOperateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetProductOperateExAsync(request, headers, runtime);
        }

        /**
         * Description: 产品操作接口
         * Summary: 产品操作接口
         */
        public SetProductOperateResponse SetProductOperateEx(SetProductOperateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetProductOperateResponse>(DoRequest("1.0", "universalsaas.yuqing.product.operate.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 产品操作接口
         * Summary: 产品操作接口
         */
        public async Task<SetProductOperateResponse> SetProductOperateExAsync(SetProductOperateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetProductOperateResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.product.operate.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发送提醒
         * Summary: 发送提醒
         */
        public SendProductNoticeResponse SendProductNotice(SendProductNoticeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendProductNoticeEx(request, headers, runtime);
        }

        /**
         * Description: 发送提醒
         * Summary: 发送提醒
         */
        public async Task<SendProductNoticeResponse> SendProductNoticeAsync(SendProductNoticeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendProductNoticeExAsync(request, headers, runtime);
        }

        /**
         * Description: 发送提醒
         * Summary: 发送提醒
         */
        public SendProductNoticeResponse SendProductNoticeEx(SendProductNoticeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendProductNoticeResponse>(DoRequest("1.0", "universalsaas.yuqing.product.notice.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发送提醒
         * Summary: 发送提醒
         */
        public async Task<SendProductNoticeResponse> SendProductNoticeExAsync(SendProductNoticeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendProductNoticeResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.product.notice.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建深度分析
         * Summary: 创建深度分析
         */
        public SaveDeepanalysisSubmitResponse SaveDeepanalysisSubmit(SaveDeepanalysisSubmitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveDeepanalysisSubmitEx(request, headers, runtime);
        }

        /**
         * Description: 创建深度分析
         * Summary: 创建深度分析
         */
        public async Task<SaveDeepanalysisSubmitResponse> SaveDeepanalysisSubmitAsync(SaveDeepanalysisSubmitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveDeepanalysisSubmitExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建深度分析
         * Summary: 创建深度分析
         */
        public SaveDeepanalysisSubmitResponse SaveDeepanalysisSubmitEx(SaveDeepanalysisSubmitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveDeepanalysisSubmitResponse>(DoRequest("1.0", "universalsaas.yuqing.deepanalysis.submit.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建深度分析
         * Summary: 创建深度分析
         */
        public async Task<SaveDeepanalysisSubmitResponse> SaveDeepanalysisSubmitExAsync(SaveDeepanalysisSubmitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveDeepanalysisSubmitResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.deepanalysis.submit.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询深度分析
         * Summary: 查询深度分析
         */
        public QueryDeepanalysisQueryResponse QueryDeepanalysisQuery(QueryDeepanalysisQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeepanalysisQueryEx(request, headers, runtime);
        }

        /**
         * Description: 查询深度分析
         * Summary: 查询深度分析
         */
        public async Task<QueryDeepanalysisQueryResponse> QueryDeepanalysisQueryAsync(QueryDeepanalysisQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeepanalysisQueryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询深度分析
         * Summary: 查询深度分析
         */
        public QueryDeepanalysisQueryResponse QueryDeepanalysisQueryEx(QueryDeepanalysisQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeepanalysisQueryResponse>(DoRequest("1.0", "universalsaas.yuqing.deepanalysis.query.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询深度分析
         * Summary: 查询深度分析
         */
        public async Task<QueryDeepanalysisQueryResponse> QueryDeepanalysisQueryExAsync(QueryDeepanalysisQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeepanalysisQueryResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.deepanalysis.query.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个與情
         * Summary: 获取单个
         */
        public GetMessageResponse GetMessage(GetMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMessageEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个與情
         * Summary: 获取单个
         */
        public async Task<GetMessageResponse> GetMessageAsync(GetMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个與情
         * Summary: 获取单个
         */
        public GetMessageResponse GetMessageEx(GetMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMessageResponse>(DoRequest("1.0", "universalsaas.yuqing.message.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个與情
         * Summary: 获取单个
         */
        public async Task<GetMessageResponse> GetMessageExAsync(GetMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMessageResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.message.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询與情项目
         * Summary: 查询與情项目
         */
        public QueryProjectResponse QueryProject(QueryProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryProjectEx(request, headers, runtime);
        }

        /**
         * Description: 查询與情项目
         * Summary: 查询與情项目
         */
        public async Task<QueryProjectResponse> QueryProjectAsync(QueryProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询與情项目
         * Summary: 查询與情项目
         */
        public QueryProjectResponse QueryProjectEx(QueryProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProjectResponse>(DoRequest("1.0", "universalsaas.yuqing.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询與情项目
         * Summary: 查询與情项目
         */
        public async Task<QueryProjectResponse> QueryProjectExAsync(QueryProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProjectResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.project.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建项目
         * Summary: 创建项目
         */
        public CreateProjectResponse CreateProject(CreateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateProjectEx(request, headers, runtime);
        }

        /**
         * Description: 创建项目
         * Summary: 创建项目
         */
        public async Task<CreateProjectResponse> CreateProjectAsync(CreateProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建项目
         * Summary: 创建项目
         */
        public CreateProjectResponse CreateProjectEx(CreateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectResponse>(DoRequest("1.0", "universalsaas.yuqing.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建项目
         * Summary: 创建项目
         */
        public async Task<CreateProjectResponse> CreateProjectExAsync(CreateProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除项目
         * Summary: 删除项目
         */
        public DeleteProjectResponse DeleteProject(DeleteProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteProjectEx(request, headers, runtime);
        }

        /**
         * Description: 删除项目
         * Summary: 删除项目
         */
        public async Task<DeleteProjectResponse> DeleteProjectAsync(DeleteProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除项目
         * Summary: 删除项目
         */
        public DeleteProjectResponse DeleteProjectEx(DeleteProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteProjectResponse>(DoRequest("1.0", "universalsaas.yuqing.project.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除项目
         * Summary: 删除项目
         */
        public async Task<DeleteProjectResponse> DeleteProjectExAsync(DeleteProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteProjectResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.project.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询预警消息列表
         * Summary: 查询预警消息列表
         */
        public QueryAlarmResponse QueryAlarm(QueryAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAlarmEx(request, headers, runtime);
        }

        /**
         * Description: 查询预警消息列表
         * Summary: 查询预警消息列表
         */
        public async Task<QueryAlarmResponse> QueryAlarmAsync(QueryAlarmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAlarmExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询预警消息列表
         * Summary: 查询预警消息列表
         */
        public QueryAlarmResponse QueryAlarmEx(QueryAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmResponse>(DoRequest("1.0", "universalsaas.yuqing.alarm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询预警消息列表
         * Summary: 查询预警消息列表
         */
        public async Task<QueryAlarmResponse> QueryAlarmExAsync(QueryAlarmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAlarmResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.alarm.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据接口获取热搜数据
         * Summary: 與情热搜接口
         */
        public QueryHotspotMessageResponse QueryHotspotMessage(QueryHotspotMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryHotspotMessageEx(request, headers, runtime);
        }

        /**
         * Description: 根据接口获取热搜数据
         * Summary: 與情热搜接口
         */
        public async Task<QueryHotspotMessageResponse> QueryHotspotMessageAsync(QueryHotspotMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryHotspotMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据接口获取热搜数据
         * Summary: 與情热搜接口
         */
        public QueryHotspotMessageResponse QueryHotspotMessageEx(QueryHotspotMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryHotspotMessageResponse>(DoRequest("1.0", "universalsaas.yuqing.hotspot.message.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据接口获取热搜数据
         * Summary: 與情热搜接口
         */
        public async Task<QueryHotspotMessageResponse> QueryHotspotMessageExAsync(QueryHotspotMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryHotspotMessageResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.hotspot.message.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 與情历史数据异步查询接口
         * Summary: 與情历史数据异步查询接口
         */
        public SubmitMessagesHistoryResponse SubmitMessagesHistory(SubmitMessagesHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitMessagesHistoryEx(request, headers, runtime);
        }

        /**
         * Description: 與情历史数据异步查询接口
         * Summary: 與情历史数据异步查询接口
         */
        public async Task<SubmitMessagesHistoryResponse> SubmitMessagesHistoryAsync(SubmitMessagesHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitMessagesHistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 與情历史数据异步查询接口
         * Summary: 與情历史数据异步查询接口
         */
        public SubmitMessagesHistoryResponse SubmitMessagesHistoryEx(SubmitMessagesHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitMessagesHistoryResponse>(DoRequest("1.0", "universalsaas.yuqing.messages.history.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 與情历史数据异步查询接口
         * Summary: 與情历史数据异步查询接口
         */
        public async Task<SubmitMessagesHistoryResponse> SubmitMessagesHistoryExAsync(SubmitMessagesHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitMessagesHistoryResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.messages.history.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取历史與情消息
         * Summary: 获取历史與情消息
         */
        public GetMessagesHistoryResponse GetMessagesHistory(GetMessagesHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMessagesHistoryEx(request, headers, runtime);
        }

        /**
         * Description: 获取历史與情消息
         * Summary: 获取历史與情消息
         */
        public async Task<GetMessagesHistoryResponse> GetMessagesHistoryAsync(GetMessagesHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMessagesHistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取历史與情消息
         * Summary: 获取历史與情消息
         */
        public GetMessagesHistoryResponse GetMessagesHistoryEx(GetMessagesHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMessagesHistoryResponse>(DoRequest("1.0", "universalsaas.yuqing.messages.history.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取历史與情消息
         * Summary: 获取历史與情消息
         */
        public async Task<GetMessagesHistoryResponse> GetMessagesHistoryExAsync(GetMessagesHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMessagesHistoryResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.messages.history.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交实时热搜任务
         * Summary: 提交实时热搜任务
         */
        public SubmitHotspotTaskResponse SubmitHotspotTask(SubmitHotspotTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitHotspotTaskEx(request, headers, runtime);
        }

        /**
         * Description: 提交实时热搜任务
         * Summary: 提交实时热搜任务
         */
        public async Task<SubmitHotspotTaskResponse> SubmitHotspotTaskAsync(SubmitHotspotTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitHotspotTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交实时热搜任务
         * Summary: 提交实时热搜任务
         */
        public SubmitHotspotTaskResponse SubmitHotspotTaskEx(SubmitHotspotTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitHotspotTaskResponse>(DoRequest("1.0", "universalsaas.yuqing.hotspot.task.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交实时热搜任务
         * Summary: 提交实时热搜任务
         */
        public async Task<SubmitHotspotTaskResponse> SubmitHotspotTaskExAsync(SubmitHotspotTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitHotspotTaskResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.hotspot.task.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取实时热搜任务结果
         * Summary: 获取实时热搜任务结果
         */
        public GetHotspotTaskResponse GetHotspotTask(GetHotspotTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetHotspotTaskEx(request, headers, runtime);
        }

        /**
         * Description: 获取实时热搜任务结果
         * Summary: 获取实时热搜任务结果
         */
        public async Task<GetHotspotTaskResponse> GetHotspotTaskAsync(GetHotspotTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetHotspotTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取实时热搜任务结果
         * Summary: 获取实时热搜任务结果
         */
        public GetHotspotTaskResponse GetHotspotTaskEx(GetHotspotTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetHotspotTaskResponse>(DoRequest("1.0", "universalsaas.yuqing.hotspot.task.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取实时热搜任务结果
         * Summary: 获取实时热搜任务结果
         */
        public async Task<GetHotspotTaskResponse> GetHotspotTaskExAsync(GetHotspotTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetHotspotTaskResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.hotspot.task.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取stsToken，作用于通用SAAS业务
         * Summary: 获取stsToken
         */
        public GetStsTokenResponse GetStsToken(GetStsTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetStsTokenEx(request, headers, runtime);
        }

        /**
         * Description: 获取stsToken，作用于通用SAAS业务
         * Summary: 获取stsToken
         */
        public async Task<GetStsTokenResponse> GetStsTokenAsync(GetStsTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetStsTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取stsToken，作用于通用SAAS业务
         * Summary: 获取stsToken
         */
        public GetStsTokenResponse GetStsTokenEx(GetStsTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStsTokenResponse>(DoRequest("1.0", "universalsaas.yuqing.sts.token.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取stsToken，作用于通用SAAS业务
         * Summary: 获取stsToken
         */
        public async Task<GetStsTokenResponse> GetStsTokenExAsync(GetStsTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetStsTokenResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.sts.token.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用操作接口
         * Summary: 通用操作接口
         */
        public OperateCommonInterfaceResponse OperateCommonInterface(OperateCommonInterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateCommonInterfaceEx(request, headers, runtime);
        }

        /**
         * Description: 通用操作接口
         * Summary: 通用操作接口
         */
        public async Task<OperateCommonInterfaceResponse> OperateCommonInterfaceAsync(OperateCommonInterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateCommonInterfaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 通用操作接口
         * Summary: 通用操作接口
         */
        public OperateCommonInterfaceResponse OperateCommonInterfaceEx(OperateCommonInterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateCommonInterfaceResponse>(DoRequest("1.0", "universalsaas.yuqing.common.interface.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通用操作接口
         * Summary: 通用操作接口
         */
        public async Task<OperateCommonInterfaceResponse> OperateCommonInterfaceExAsync(OperateCommonInterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateCommonInterfaceResponse>(await DoRequestAsync("1.0", "universalsaas.yuqing.common.interface.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
