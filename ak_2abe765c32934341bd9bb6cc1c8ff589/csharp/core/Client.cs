// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589
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
                        {"sdk_version", "1.0.2"},
                        {"_prod_code", "ak_2abe765c32934341bd9bb6cc1c8ff589"},
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
                        {"sdk_version", "1.0.2"},
                        {"_prod_code", "ak_2abe765c32934341bd9bb6cc1c8ff589"},
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
         * Description: 对账saas交易信息同步接口
         * Summary: 对账saas交易信息同步接口
         */
        public SyncAntchainAtoTradeResponse SyncAntchainAtoTrade(SyncAntchainAtoTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoTradeEx(request, headers, runtime);
        }

        /**
         * Description: 对账saas交易信息同步接口
         * Summary: 对账saas交易信息同步接口
         */
        public async Task<SyncAntchainAtoTradeResponse> SyncAntchainAtoTradeAsync(SyncAntchainAtoTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoTradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 对账saas交易信息同步接口
         * Summary: 对账saas交易信息同步接口
         */
        public SyncAntchainAtoTradeResponse SyncAntchainAtoTradeEx(SyncAntchainAtoTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeResponse>(DoRequest("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对账saas交易信息同步接口
         * Summary: 对账saas交易信息同步接口
         */
        public async Task<SyncAntchainAtoTradeResponse> SyncAntchainAtoTradeExAsync(SyncAntchainAtoTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取详情
         * Summary: 获取详情
         */
        public GetAntchainAtoTradeResponse GetAntchainAtoTrade(GetAntchainAtoTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoTradeEx(request, headers, runtime);
        }

        /**
         * Description: 获取详情
         * Summary: 获取详情
         */
        public async Task<GetAntchainAtoTradeResponse> GetAntchainAtoTradeAsync(GetAntchainAtoTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoTradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取详情
         * Summary: 获取详情
         */
        public GetAntchainAtoTradeResponse GetAntchainAtoTradeEx(GetAntchainAtoTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeResponse>(DoRequest("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取详情
         * Summary: 获取详情
         */
        public async Task<GetAntchainAtoTradeResponse> GetAntchainAtoTradeExAsync(GetAntchainAtoTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信身份认证，创建认证
         * Summary: 创建认证
         */
        public CreateAntchainAtoRealpersonFacevrfResponse CreateAntchainAtoRealpersonFacevrf(CreateAntchainAtoRealpersonFacevrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
        }

        /**
         * Description: 可信身份认证，创建认证
         * Summary: 创建认证
         */
        public async Task<CreateAntchainAtoRealpersonFacevrfResponse> CreateAntchainAtoRealpersonFacevrfAsync(CreateAntchainAtoRealpersonFacevrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainAtoRealpersonFacevrfExAsync(request, headers, runtime);
        }

        /**
         * Description: 可信身份认证，创建认证
         * Summary: 创建认证
         */
        public CreateAntchainAtoRealpersonFacevrfResponse CreateAntchainAtoRealpersonFacevrfEx(CreateAntchainAtoRealpersonFacevrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoRealpersonFacevrfResponse>(DoRequest("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可信身份认证，创建认证
         * Summary: 创建认证
         */
        public async Task<CreateAntchainAtoRealpersonFacevrfResponse> CreateAntchainAtoRealpersonFacevrfExAsync(CreateAntchainAtoRealpersonFacevrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoRealpersonFacevrfResponse>(await DoRequestAsync("1.0", "antchain.ato.realperson.facevrf.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 查询认证结果
         */
        public QueryAntchainAtoRealpersonFacevrfResponse QueryAntchainAtoRealpersonFacevrf(QueryAntchainAtoRealpersonFacevrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoRealpersonFacevrfEx(request, headers, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 查询认证结果
         */
        public async Task<QueryAntchainAtoRealpersonFacevrfResponse> QueryAntchainAtoRealpersonFacevrfAsync(QueryAntchainAtoRealpersonFacevrfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoRealpersonFacevrfExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 查询认证结果
         */
        public QueryAntchainAtoRealpersonFacevrfResponse QueryAntchainAtoRealpersonFacevrfEx(QueryAntchainAtoRealpersonFacevrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoRealpersonFacevrfResponse>(DoRequest("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证的结果和相关信息
         * Summary: 查询认证结果
         */
        public async Task<QueryAntchainAtoRealpersonFacevrfResponse> QueryAntchainAtoRealpersonFacevrfExAsync(QueryAntchainAtoRealpersonFacevrfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoRealpersonFacevrfResponse>(await DoRequestAsync("1.0", "antchain.ato.realperson.facevrf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同签署的合同模板查询服务
         * Summary: 电子合同签署的合同模板查询服务
         */
        public AllAntchainAtoSignTemplateResponse AllAntchainAtoSignTemplate(AllAntchainAtoSignTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllAntchainAtoSignTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 电子合同签署的合同模板查询服务
         * Summary: 电子合同签署的合同模板查询服务
         */
        public async Task<AllAntchainAtoSignTemplateResponse> AllAntchainAtoSignTemplateAsync(AllAntchainAtoSignTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllAntchainAtoSignTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子合同签署的合同模板查询服务
         * Summary: 电子合同签署的合同模板查询服务
         */
        public AllAntchainAtoSignTemplateResponse AllAntchainAtoSignTemplateEx(AllAntchainAtoSignTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAntchainAtoSignTemplateResponse>(DoRequest("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同签署的合同模板查询服务
         * Summary: 电子合同签署的合同模板查询服务
         */
        public async Task<AllAntchainAtoSignTemplateResponse> AllAntchainAtoSignTemplateExAsync(AllAntchainAtoSignTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAntchainAtoSignTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交电子合同的签署流程
         * Summary: 提交电子合同的签署流程
         */
        public SubmitAntchainAtoSignFlowResponse SubmitAntchainAtoSignFlow(SubmitAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAntchainAtoSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 提交电子合同的签署流程
         * Summary: 提交电子合同的签署流程
         */
        public async Task<SubmitAntchainAtoSignFlowResponse> SubmitAntchainAtoSignFlowAsync(SubmitAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAntchainAtoSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交电子合同的签署流程
         * Summary: 提交电子合同的签署流程
         */
        public SubmitAntchainAtoSignFlowResponse SubmitAntchainAtoSignFlowEx(SubmitAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainAtoSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交电子合同的签署流程
         * Summary: 提交电子合同的签署流程
         */
        public async Task<SubmitAntchainAtoSignFlowResponse> SubmitAntchainAtoSignFlowExAsync(SubmitAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainAtoSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署流程详情
         * Summary: 查询签署流程详情
         */
        public GetAntchainAtoSignFlowResponse GetAntchainAtoSignFlow(GetAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 查询签署流程详情
         * Summary: 查询签署流程详情
         */
        public async Task<GetAntchainAtoSignFlowResponse> GetAntchainAtoSignFlowAsync(GetAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询签署流程详情
         * Summary: 查询签署流程详情
         */
        public GetAntchainAtoSignFlowResponse GetAntchainAtoSignFlowEx(GetAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署流程详情
         * Summary: 查询签署流程详情
         */
        public async Task<GetAntchainAtoSignFlowResponse> GetAntchainAtoSignFlowExAsync(GetAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账流水同步
         * Summary: 分账流水同步
         */
        public SyncAntchainAtoFundSplittingResponse SyncAntchainAtoFundSplitting(SyncAntchainAtoFundSplittingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFundSplittingEx(request, headers, runtime);
        }

        /**
         * Description: 分账流水同步
         * Summary: 分账流水同步
         */
        public async Task<SyncAntchainAtoFundSplittingResponse> SyncAntchainAtoFundSplittingAsync(SyncAntchainAtoFundSplittingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFundSplittingExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账流水同步
         * Summary: 分账流水同步
         */
        public SyncAntchainAtoFundSplittingResponse SyncAntchainAtoFundSplittingEx(SyncAntchainAtoFundSplittingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundSplittingResponse>(DoRequest("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账流水同步
         * Summary: 分账流水同步
         */
        public async Task<SyncAntchainAtoFundSplittingResponse> SyncAntchainAtoFundSplittingExAsync(SyncAntchainAtoFundSplittingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundSplittingResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.splitting.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给融资资金方，用以订单融资结果同步
         * Summary: 订单融资结果同步
         */
        public SyncAntchainAtoFundOrderfinancialResponse SyncAntchainAtoFundOrderfinancial(SyncAntchainAtoFundOrderfinancialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFundOrderfinancialEx(request, headers, runtime);
        }

        /**
         * Description: 提供给融资资金方，用以订单融资结果同步
         * Summary: 订单融资结果同步
         */
        public async Task<SyncAntchainAtoFundOrderfinancialResponse> SyncAntchainAtoFundOrderfinancialAsync(SyncAntchainAtoFundOrderfinancialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFundOrderfinancialExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供给融资资金方，用以订单融资结果同步
         * Summary: 订单融资结果同步
         */
        public SyncAntchainAtoFundOrderfinancialResponse SyncAntchainAtoFundOrderfinancialEx(SyncAntchainAtoFundOrderfinancialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundOrderfinancialResponse>(DoRequest("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给融资资金方，用以订单融资结果同步
         * Summary: 订单融资结果同步
         */
        public async Task<SyncAntchainAtoFundOrderfinancialResponse> SyncAntchainAtoFundOrderfinancialExAsync(SyncAntchainAtoFundOrderfinancialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundOrderfinancialResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfinancial.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将返回订单实人认证通过后的、商家同步的还款计划
         * Summary: 获取商家同步的还款计划
         */
        public GetAntchainAtoFundRepaymentplanResponse GetAntchainAtoFundRepaymentplan(GetAntchainAtoFundRepaymentplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundRepaymentplanEx(request, headers, runtime);
        }

        /**
         * Description: 将返回订单实人认证通过后的、商家同步的还款计划
         * Summary: 获取商家同步的还款计划
         */
        public async Task<GetAntchainAtoFundRepaymentplanResponse> GetAntchainAtoFundRepaymentplanAsync(GetAntchainAtoFundRepaymentplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundRepaymentplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 将返回订单实人认证通过后的、商家同步的还款计划
         * Summary: 获取商家同步的还款计划
         */
        public GetAntchainAtoFundRepaymentplanResponse GetAntchainAtoFundRepaymentplanEx(GetAntchainAtoFundRepaymentplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundRepaymentplanResponse>(DoRequest("1.0", "antchain.ato.fund.repaymentplan.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 将返回订单实人认证通过后的、商家同步的还款计划
         * Summary: 获取商家同步的还款计划
         */
        public async Task<GetAntchainAtoFundRepaymentplanResponse> GetAntchainAtoFundRepaymentplanExAsync(GetAntchainAtoFundRepaymentplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundRepaymentplanResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.repaymentplan.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步租赁订单的代扣协议
         * Summary: 同步租赁订单的代扣协议
         */
        public SyncAntchainAtoFundWithholdingcontractResponse SyncAntchainAtoFundWithholdingcontract(SyncAntchainAtoFundWithholdingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFundWithholdingcontractEx(request, headers, runtime);
        }

        /**
         * Description: 同步租赁订单的代扣协议
         * Summary: 同步租赁订单的代扣协议
         */
        public async Task<SyncAntchainAtoFundWithholdingcontractResponse> SyncAntchainAtoFundWithholdingcontractAsync(SyncAntchainAtoFundWithholdingcontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFundWithholdingcontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步租赁订单的代扣协议
         * Summary: 同步租赁订单的代扣协议
         */
        public SyncAntchainAtoFundWithholdingcontractResponse SyncAntchainAtoFundWithholdingcontractEx(SyncAntchainAtoFundWithholdingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundWithholdingcontractResponse>(DoRequest("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步租赁订单的代扣协议
         * Summary: 同步租赁订单的代扣协议
         */
        public async Task<SyncAntchainAtoFundWithholdingcontractResponse> SyncAntchainAtoFundWithholdingcontractExAsync(SyncAntchainAtoFundWithholdingcontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundWithholdingcontractResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.withholdingcontract.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方回传一条订单还款履约信息
         * Summary: 同步订单还款履约信息
         */
        public SyncAntchainAtoFundOrderfulfillmentResponse SyncAntchainAtoFundOrderfulfillment(SyncAntchainAtoFundOrderfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFundOrderfulfillmentEx(request, headers, runtime);
        }

        /**
         * Description: 资方回传一条订单还款履约信息
         * Summary: 同步订单还款履约信息
         */
        public async Task<SyncAntchainAtoFundOrderfulfillmentResponse> SyncAntchainAtoFundOrderfulfillmentAsync(SyncAntchainAtoFundOrderfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFundOrderfulfillmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方回传一条订单还款履约信息
         * Summary: 同步订单还款履约信息
         */
        public SyncAntchainAtoFundOrderfulfillmentResponse SyncAntchainAtoFundOrderfulfillmentEx(SyncAntchainAtoFundOrderfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundOrderfulfillmentResponse>(DoRequest("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方回传一条订单还款履约信息
         * Summary: 同步订单还款履约信息
         */
        public async Task<SyncAntchainAtoFundOrderfulfillmentResponse> SyncAntchainAtoFundOrderfulfillmentExAsync(SyncAntchainAtoFundOrderfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundOrderfulfillmentResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfulfillment.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取订单的履约信息
         * Summary: 获取订单的履约信息
         */
        public GetAntchainAtoFundOrderfulfillmentResponse GetAntchainAtoFundOrderfulfillment(GetAntchainAtoFundOrderfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundOrderfulfillmentEx(request, headers, runtime);
        }

        /**
         * Description: 获取订单的履约信息
         * Summary: 获取订单的履约信息
         */
        public async Task<GetAntchainAtoFundOrderfulfillmentResponse> GetAntchainAtoFundOrderfulfillmentAsync(GetAntchainAtoFundOrderfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundOrderfulfillmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取订单的履约信息
         * Summary: 获取订单的履约信息
         */
        public GetAntchainAtoFundOrderfulfillmentResponse GetAntchainAtoFundOrderfulfillmentEx(GetAntchainAtoFundOrderfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundOrderfulfillmentResponse>(DoRequest("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取订单的履约信息
         * Summary: 获取订单的履约信息
         */
        public async Task<GetAntchainAtoFundOrderfulfillmentResponse> GetAntchainAtoFundOrderfulfillmentExAsync(GetAntchainAtoFundOrderfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundOrderfulfillmentResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfulfillment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约
         * Summary: 代扣签约
         */
        public CreateAntchainAtoWithholdSignResponse CreateAntchainAtoWithholdSign(CreateAntchainAtoWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainAtoWithholdSignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约
         * Summary: 代扣签约
         */
        public async Task<CreateAntchainAtoWithholdSignResponse> CreateAntchainAtoWithholdSignAsync(CreateAntchainAtoWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainAtoWithholdSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约
         * Summary: 代扣签约
         */
        public CreateAntchainAtoWithholdSignResponse CreateAntchainAtoWithholdSignEx(CreateAntchainAtoWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdSignResponse>(DoRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约
         * Summary: 代扣签约
         */
        public async Task<CreateAntchainAtoWithholdSignResponse> CreateAntchainAtoWithholdSignExAsync(CreateAntchainAtoWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdSignResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public QueryAntchainAtoWithholdSignResponse QueryAntchainAtoWithholdSign(QueryAntchainAtoWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoWithholdSignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public async Task<QueryAntchainAtoWithholdSignResponse> QueryAntchainAtoWithholdSignAsync(QueryAntchainAtoWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoWithholdSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public QueryAntchainAtoWithholdSignResponse QueryAntchainAtoWithholdSignEx(QueryAntchainAtoWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdSignResponse>(DoRequest("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约查询
         * Summary: 代扣签约查询
         */
        public async Task<QueryAntchainAtoWithholdSignResponse> QueryAntchainAtoWithholdSignExAsync(QueryAntchainAtoWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdSignResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.sign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
         * Summary: 同步商家的订单信息
         */
        public SyncAntchainAtoTradeFullResponse SyncAntchainAtoTradeFull(SyncAntchainAtoTradeFullRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoTradeFullEx(request, headers, runtime);
        }

        /**
         * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
         * Summary: 同步商家的订单信息
         */
        public async Task<SyncAntchainAtoTradeFullResponse> SyncAntchainAtoTradeFullAsync(SyncAntchainAtoTradeFullRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoTradeFullExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
         * Summary: 同步商家的订单信息
         */
        public SyncAntchainAtoTradeFullResponse SyncAntchainAtoTradeFullEx(SyncAntchainAtoTradeFullRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeFullResponse>(DoRequest("1.0", "antchain.ato.trade.full.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步商家的订单信息，包含下单人信息、订单信息、订单关联的商品信息以及订单绑定的还款计划。
         * Summary: 同步商家的订单信息
         */
        public async Task<SyncAntchainAtoTradeFullResponse> SyncAntchainAtoTradeFullExAsync(SyncAntchainAtoTradeFullRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeFullResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.full.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
         * Summary: 电子合同签署流程落签操作
         */
        public AuthAntchainAtoSignFlowResponse AuthAntchainAtoSignFlow(AuthAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthAntchainAtoSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
         * Summary: 电子合同签署流程落签操作
         */
        public async Task<AuthAntchainAtoSignFlowResponse> AuthAntchainAtoSignFlowAsync(AuthAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthAntchainAtoSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
         * Summary: 电子合同签署流程落签操作
         */
        public AuthAntchainAtoSignFlowResponse AuthAntchainAtoSignFlowEx(AuthAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainAtoSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
         * Summary: 电子合同签署流程落签操作
         */
        public async Task<AuthAntchainAtoSignFlowResponse> AuthAntchainAtoSignFlowExAsync(AuthAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainAtoSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单关闭后,可以通过此接口解绑签约
         * Summary: 代扣签约解绑
         */
        public UnbindAntchainAtoWithholdSignResponse UnbindAntchainAtoWithholdSign(UnbindAntchainAtoWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindAntchainAtoWithholdSignEx(request, headers, runtime);
        }

        /**
         * Description: 订单关闭后,可以通过此接口解绑签约
         * Summary: 代扣签约解绑
         */
        public async Task<UnbindAntchainAtoWithholdSignResponse> UnbindAntchainAtoWithholdSignAsync(UnbindAntchainAtoWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindAntchainAtoWithholdSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单关闭后,可以通过此接口解绑签约
         * Summary: 代扣签约解绑
         */
        public UnbindAntchainAtoWithholdSignResponse UnbindAntchainAtoWithholdSignEx(UnbindAntchainAtoWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindAntchainAtoWithholdSignResponse>(DoRequest("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单关闭后,可以通过此接口解绑签约
         * Summary: 代扣签约解绑
         */
        public async Task<UnbindAntchainAtoWithholdSignResponse> UnbindAntchainAtoWithholdSignExAsync(UnbindAntchainAtoWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindAntchainAtoWithholdSignResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.sign.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
         * Summary: 取消代扣计划
         */
        public CancelAntchainAtoWithholdPlanResponse CancelAntchainAtoWithholdPlan(CancelAntchainAtoWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAntchainAtoWithholdPlanEx(request, headers, runtime);
        }

        /**
         * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
         * Summary: 取消代扣计划
         */
        public async Task<CancelAntchainAtoWithholdPlanResponse> CancelAntchainAtoWithholdPlanAsync(CancelAntchainAtoWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAntchainAtoWithholdPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
         * Summary: 取消代扣计划
         */
        public CancelAntchainAtoWithholdPlanResponse CancelAntchainAtoWithholdPlanEx(CancelAntchainAtoWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoWithholdPlanResponse>(DoRequest("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
         * Summary: 取消代扣计划
         */
        public async Task<CancelAntchainAtoWithholdPlanResponse> CancelAntchainAtoWithholdPlanExAsync(CancelAntchainAtoWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoWithholdPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
         * Summary: 代扣计划清偿/清欠
         */
        public RepayAntchainAtoWithholdPlanResponse RepayAntchainAtoWithholdPlan(RepayAntchainAtoWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayAntchainAtoWithholdPlanEx(request, headers, runtime);
        }

        /**
         * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
         * Summary: 代扣计划清偿/清欠
         */
        public async Task<RepayAntchainAtoWithholdPlanResponse> RepayAntchainAtoWithholdPlanAsync(RepayAntchainAtoWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayAntchainAtoWithholdPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
         * Summary: 代扣计划清偿/清欠
         */
        public RepayAntchainAtoWithholdPlanResponse RepayAntchainAtoWithholdPlanEx(RepayAntchainAtoWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayAntchainAtoWithholdPlanResponse>(DoRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
         * Summary: 代扣计划清偿/清欠
         */
        public async Task<RepayAntchainAtoWithholdPlanResponse> RepayAntchainAtoWithholdPlanExAsync(RepayAntchainAtoWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayAntchainAtoWithholdPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
         * Summary: 扣款计划重试
         */
        public RetryAntchainAtoWithholdPlanResponse RetryAntchainAtoWithholdPlan(RetryAntchainAtoWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryAntchainAtoWithholdPlanEx(request, headers, runtime);
        }

        /**
         * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
         * Summary: 扣款计划重试
         */
        public async Task<RetryAntchainAtoWithholdPlanResponse> RetryAntchainAtoWithholdPlanAsync(RetryAntchainAtoWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryAntchainAtoWithholdPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
         * Summary: 扣款计划重试
         */
        public RetryAntchainAtoWithholdPlanResponse RetryAntchainAtoWithholdPlanEx(RetryAntchainAtoWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAntchainAtoWithholdPlanResponse>(DoRequest("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
         * Summary: 扣款计划重试
         */
        public async Task<RetryAntchainAtoWithholdPlanResponse> RetryAntchainAtoWithholdPlanExAsync(RetryAntchainAtoWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAntchainAtoWithholdPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.plan.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
