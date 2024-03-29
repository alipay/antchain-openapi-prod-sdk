// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f.Models;

namespace AntChain.SDK.Ak_195dff03d395462ea294bafdba69df3f
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
                        {"sdk_version", "1.2.1"},
                        {"_prod_code", "ak_195dff03d395462ea294bafdba69df3f"},
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
                        {"sdk_version", "1.2.1"},
                        {"_prod_code", "ak_195dff03d395462ea294bafdba69df3f"},
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
         * Description: 提交电子合同的签署流程(后置签署模式)
         * Summary: 提交电子合同的签署流程（后置签署模式）
         */
        public SubmitAntchainAtoSignFlowResponse SubmitAntchainAtoSignFlow(SubmitAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAntchainAtoSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 提交电子合同的签署流程(后置签署模式)
         * Summary: 提交电子合同的签署流程（后置签署模式）
         */
        public async Task<SubmitAntchainAtoSignFlowResponse> SubmitAntchainAtoSignFlowAsync(SubmitAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAntchainAtoSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交电子合同的签署流程(后置签署模式)
         * Summary: 提交电子合同的签署流程（后置签署模式）
         */
        public SubmitAntchainAtoSignFlowResponse SubmitAntchainAtoSignFlowEx(SubmitAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainAtoSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交电子合同的签署流程(后置签署模式)
         * Summary: 提交电子合同的签署流程（后置签署模式）
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
         * Description: 提交前置签署的电子合同签署流程（前置签署模式）
         * Summary: 提交签署的电子合同签署流程（前置签署）
         */
        public SubmitAntchainAtoFrontSignResponse SubmitAntchainAtoFrontSign(SubmitAntchainAtoFrontSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAntchainAtoFrontSignEx(request, headers, runtime);
        }

        /**
         * Description: 提交前置签署的电子合同签署流程（前置签署模式）
         * Summary: 提交签署的电子合同签署流程（前置签署）
         */
        public async Task<SubmitAntchainAtoFrontSignResponse> SubmitAntchainAtoFrontSignAsync(SubmitAntchainAtoFrontSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAntchainAtoFrontSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交前置签署的电子合同签署流程（前置签署模式）
         * Summary: 提交签署的电子合同签署流程（前置签署）
         */
        public SubmitAntchainAtoFrontSignResponse SubmitAntchainAtoFrontSignEx(SubmitAntchainAtoFrontSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainAtoFrontSignResponse>(DoRequest("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交前置签署的电子合同签署流程（前置签署模式）
         * Summary: 提交签署的电子合同签署流程（前置签署）
         */
        public async Task<SubmitAntchainAtoFrontSignResponse> SubmitAntchainAtoFrontSignExAsync(SubmitAntchainAtoFrontSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainAtoFrontSignResponse>(await DoRequestAsync("1.0", "antchain.ato.front.sign.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单创建，前置签署
         * Summary: 前置签署订单创建
         */
        public SyncAntchainAtoFrontTradeResponse SyncAntchainAtoFrontTrade(SyncAntchainAtoFrontTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFrontTradeEx(request, headers, runtime);
        }

        /**
         * Description: 订单创建，前置签署
         * Summary: 前置签署订单创建
         */
        public async Task<SyncAntchainAtoFrontTradeResponse> SyncAntchainAtoFrontTradeAsync(SyncAntchainAtoFrontTradeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFrontTradeExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单创建，前置签署
         * Summary: 前置签署订单创建
         */
        public SyncAntchainAtoFrontTradeResponse SyncAntchainAtoFrontTradeEx(SyncAntchainAtoFrontTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFrontTradeResponse>(DoRequest("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单创建，前置签署
         * Summary: 前置签署订单创建
         */
        public async Task<SyncAntchainAtoFrontTradeResponse> SyncAntchainAtoFrontTradeExAsync(SyncAntchainAtoFrontTradeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFrontTradeResponse>(await DoRequestAsync("1.0", "antchain.ato.front.trade.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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

        /**
         * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
         * Summary: 代扣签约的异步解约确认
         */
        public ConfirmAntchainAtoWithholdSignasyncunsignResponse ConfirmAntchainAtoWithholdSignasyncunsign(ConfirmAntchainAtoWithholdSignasyncunsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmAntchainAtoWithholdSignasyncunsignEx(request, headers, runtime);
        }

        /**
         * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
         * Summary: 代扣签约的异步解约确认
         */
        public async Task<ConfirmAntchainAtoWithholdSignasyncunsignResponse> ConfirmAntchainAtoWithholdSignasyncunsignAsync(ConfirmAntchainAtoWithholdSignasyncunsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmAntchainAtoWithholdSignasyncunsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
         * Summary: 代扣签约的异步解约确认
         */
        public ConfirmAntchainAtoWithholdSignasyncunsignResponse ConfirmAntchainAtoWithholdSignasyncunsignEx(ConfirmAntchainAtoWithholdSignasyncunsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmAntchainAtoWithholdSignasyncunsignResponse>(DoRequest("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
         * Summary: 代扣签约的异步解约确认
         */
        public async Task<ConfirmAntchainAtoWithholdSignasyncunsignResponse> ConfirmAntchainAtoWithholdSignasyncunsignExAsync(ConfirmAntchainAtoWithholdSignasyncunsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmAntchainAtoWithholdSignasyncunsignResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.signasyncunsign.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传
         * Summary: 资方合同文件上传接口
         */
        public UploadAntchainAtoFundFlowResponse UploadAntchainAtoFundFlow(UploadAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntchainAtoFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传
         * Summary: 资方合同文件上传接口
         */
        public async Task<UploadAntchainAtoFundFlowResponse> UploadAntchainAtoFundFlowAsync(UploadAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntchainAtoFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传
         * Summary: 资方合同文件上传接口
         */
        public UploadAntchainAtoFundFlowResponse UploadAntchainAtoFundFlowEx(UploadAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.fund.flow.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntchainAtoFundFlowResponse uploadAntchainAtoFundFlowResponse = new UploadAntchainAtoFundFlowResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntchainAtoFundFlowResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传
         * Summary: 资方合同文件上传接口
         */
        public async Task<UploadAntchainAtoFundFlowResponse> UploadAntchainAtoFundFlowExAsync(UploadAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.fund.flow.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntchainAtoFundFlowResponse uploadAntchainAtoFundFlowResponse = new UploadAntchainAtoFundFlowResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntchainAtoFundFlowResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取商户签署后的合同文件，用于资方签署落章
         * Summary: 资方合同文件获取接口
         */
        public GetAntchainAtoFundFlowResponse GetAntchainAtoFundFlow(GetAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 获取商户签署后的合同文件，用于资方签署落章
         * Summary: 资方合同文件获取接口
         */
        public async Task<GetAntchainAtoFundFlowResponse> GetAntchainAtoFundFlowAsync(GetAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取商户签署后的合同文件，用于资方签署落章
         * Summary: 资方合同文件获取接口
         */
        public GetAntchainAtoFundFlowResponse GetAntchainAtoFundFlowEx(GetAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取商户签署后的合同文件，用于资方签署落章
         * Summary: 资方合同文件获取接口
         */
        public async Task<GetAntchainAtoFundFlowResponse> GetAntchainAtoFundFlowExAsync(GetAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
         * Summary: 资方合同签署状态通知
         */
        public RefuseAntchainAtoFundFlowResponse RefuseAntchainAtoFundFlow(RefuseAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseAntchainAtoFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
         * Summary: 资方合同签署状态通知
         */
        public async Task<RefuseAntchainAtoFundFlowResponse> RefuseAntchainAtoFundFlowAsync(RefuseAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseAntchainAtoFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
         * Summary: 资方合同签署状态通知
         */
        public RefuseAntchainAtoFundFlowResponse RefuseAntchainAtoFundFlowEx(RefuseAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseAntchainAtoFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
         * Summary: 资方合同签署状态通知
         */
        public async Task<RefuseAntchainAtoFundFlowResponse> RefuseAntchainAtoFundFlowExAsync(RefuseAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseAntchainAtoFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，授权通过e签宝进行落签
         * Summary: 资方e签宝落签接口
         */
        public AuthAntchainAtoFundFlowResponse AuthAntchainAtoFundFlow(AuthAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthAntchainAtoFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方调用，授权通过e签宝进行落签
         * Summary: 资方e签宝落签接口
         */
        public async Task<AuthAntchainAtoFundFlowResponse> AuthAntchainAtoFundFlowAsync(AuthAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthAntchainAtoFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方调用，授权通过e签宝进行落签
         * Summary: 资方e签宝落签接口
         */
        public AuthAntchainAtoFundFlowResponse AuthAntchainAtoFundFlowEx(AuthAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainAtoFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，授权通过e签宝进行落签
         * Summary: 资方e签宝落签接口
         */
        public async Task<AuthAntchainAtoFundFlowResponse> AuthAntchainAtoFundFlowExAsync(AuthAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainAtoFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付创建
         * Summary: 代扣主动支付创建
         */
        public CreateAntchainAtoWithholdActivepayResponse CreateAntchainAtoWithholdActivepay(CreateAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainAtoWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付创建
         * Summary: 代扣主动支付创建
         */
        public async Task<CreateAntchainAtoWithholdActivepayResponse> CreateAntchainAtoWithholdActivepayAsync(CreateAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainAtoWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付创建
         * Summary: 代扣主动支付创建
         */
        public CreateAntchainAtoWithholdActivepayResponse CreateAntchainAtoWithholdActivepayEx(CreateAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付创建
         * Summary: 代扣主动支付创建
         */
        public async Task<CreateAntchainAtoWithholdActivepayResponse> CreateAntchainAtoWithholdActivepayExAsync(CreateAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付查询
         * Summary: 代扣主动支付查询
         */
        public QueryAntchainAtoWithholdActivepayResponse QueryAntchainAtoWithholdActivepay(QueryAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付查询
         * Summary: 代扣主动支付查询
         */
        public async Task<QueryAntchainAtoWithholdActivepayResponse> QueryAntchainAtoWithholdActivepayAsync(QueryAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付查询
         * Summary: 代扣主动支付查询
         */
        public QueryAntchainAtoWithholdActivepayResponse QueryAntchainAtoWithholdActivepayEx(QueryAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付查询
         * Summary: 代扣主动支付查询
         */
        public async Task<QueryAntchainAtoWithholdActivepayResponse> QueryAntchainAtoWithholdActivepayExAsync(QueryAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付取消
         * Summary: 代扣主动支付取消
         */
        public CancelAntchainAtoWithholdActivepayResponse CancelAntchainAtoWithholdActivepay(CancelAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAntchainAtoWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付取消
         * Summary: 代扣主动支付取消
         */
        public async Task<CancelAntchainAtoWithholdActivepayResponse> CancelAntchainAtoWithholdActivepayAsync(CancelAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAntchainAtoWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣主动支付取消
         * Summary: 代扣主动支付取消
         */
        public CancelAntchainAtoWithholdActivepayResponse CancelAntchainAtoWithholdActivepayEx(CancelAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣主动支付取消
         * Summary: 代扣主动支付取消
         */
        public async Task<CancelAntchainAtoWithholdActivepayResponse> CancelAntchainAtoWithholdActivepayExAsync(CancelAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，取消商户履约计划
         * Summary: 商户履约计划取消
         */
        public CancelAntchainAtoFundPlanResponse CancelAntchainAtoFundPlan(CancelAntchainAtoFundPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAntchainAtoFundPlanEx(request, headers, runtime);
        }

        /**
         * Description: 资方调用，取消商户履约计划
         * Summary: 商户履约计划取消
         */
        public async Task<CancelAntchainAtoFundPlanResponse> CancelAntchainAtoFundPlanAsync(CancelAntchainAtoFundPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAntchainAtoFundPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方调用，取消商户履约计划
         * Summary: 商户履约计划取消
         */
        public CancelAntchainAtoFundPlanResponse CancelAntchainAtoFundPlanEx(CancelAntchainAtoFundPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoFundPlanResponse>(DoRequest("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用，取消商户履约计划
         * Summary: 商户履约计划取消
         */
        public async Task<CancelAntchainAtoFundPlanResponse> CancelAntchainAtoFundPlanExAsync(CancelAntchainAtoFundPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoFundPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知回调
         * Summary: 通知回调
         */
        public CallbackAntchainAtoFundNotifyResponse CallbackAntchainAtoFundNotify(CallbackAntchainAtoFundNotifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAntchainAtoFundNotifyEx(request, headers, runtime);
        }

        /**
         * Description: 通知回调
         * Summary: 通知回调
         */
        public async Task<CallbackAntchainAtoFundNotifyResponse> CallbackAntchainAtoFundNotifyAsync(CallbackAntchainAtoFundNotifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAntchainAtoFundNotifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 通知回调
         * Summary: 通知回调
         */
        public CallbackAntchainAtoFundNotifyResponse CallbackAntchainAtoFundNotifyEx(CallbackAntchainAtoFundNotifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntchainAtoFundNotifyResponse>(DoRequest("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知回调
         * Summary: 通知回调
         */
        public async Task<CallbackAntchainAtoFundNotifyResponse> CallbackAntchainAtoFundNotifyExAsync(CallbackAntchainAtoFundNotifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAntchainAtoFundNotifyResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.notify.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资放款申请接口
         * Summary: 融资放款申请接口
         */
        public SyncAntchainAtoTradeFinanceloanapplyResponse SyncAntchainAtoTradeFinanceloanapply(SyncAntchainAtoTradeFinanceloanapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoTradeFinanceloanapplyEx(request, headers, runtime);
        }

        /**
         * Description: 融资放款申请接口
         * Summary: 融资放款申请接口
         */
        public async Task<SyncAntchainAtoTradeFinanceloanapplyResponse> SyncAntchainAtoTradeFinanceloanapplyAsync(SyncAntchainAtoTradeFinanceloanapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoTradeFinanceloanapplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资放款申请接口
         * Summary: 融资放款申请接口
         */
        public SyncAntchainAtoTradeFinanceloanapplyResponse SyncAntchainAtoTradeFinanceloanapplyEx(SyncAntchainAtoTradeFinanceloanapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeFinanceloanapplyResponse>(DoRequest("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资放款申请接口
         * Summary: 融资放款申请接口
         */
        public async Task<SyncAntchainAtoTradeFinanceloanapplyResponse> SyncAntchainAtoTradeFinanceloanapplyExAsync(SyncAntchainAtoTradeFinanceloanapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeFinanceloanapplyResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.financeloanapply.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约查询
         * Summary: 商户履约查询
         */
        public GetAntchainAtoTradeMerchantfulfillmentResponse GetAntchainAtoTradeMerchantfulfillment(GetAntchainAtoTradeMerchantfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoTradeMerchantfulfillmentEx(request, headers, runtime);
        }

        /**
         * Description: 商户履约查询
         * Summary: 商户履约查询
         */
        public async Task<GetAntchainAtoTradeMerchantfulfillmentResponse> GetAntchainAtoTradeMerchantfulfillmentAsync(GetAntchainAtoTradeMerchantfulfillmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoTradeMerchantfulfillmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户履约查询
         * Summary: 商户履约查询
         */
        public GetAntchainAtoTradeMerchantfulfillmentResponse GetAntchainAtoTradeMerchantfulfillmentEx(GetAntchainAtoTradeMerchantfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeMerchantfulfillmentResponse>(DoRequest("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约查询
         * Summary: 商户履约查询
         */
        public async Task<GetAntchainAtoTradeMerchantfulfillmentResponse> GetAntchainAtoTradeMerchantfulfillmentExAsync(GetAntchainAtoTradeMerchantfulfillmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeMerchantfulfillmentResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.merchantfulfillment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户还款承诺同步
         * Summary: 商户还款承诺同步
         */
        public SyncAntchainAtoFundMerchantpromiseResponse SyncAntchainAtoFundMerchantpromise(SyncAntchainAtoFundMerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFundMerchantpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 商户还款承诺同步
         * Summary: 商户还款承诺同步
         */
        public async Task<SyncAntchainAtoFundMerchantpromiseResponse> SyncAntchainAtoFundMerchantpromiseAsync(SyncAntchainAtoFundMerchantpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFundMerchantpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户还款承诺同步
         * Summary: 商户还款承诺同步
         */
        public SyncAntchainAtoFundMerchantpromiseResponse SyncAntchainAtoFundMerchantpromiseEx(SyncAntchainAtoFundMerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundMerchantpromiseResponse>(DoRequest("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户还款承诺同步
         * Summary: 商户还款承诺同步
         */
        public async Task<SyncAntchainAtoFundMerchantpromiseResponse> SyncAntchainAtoFundMerchantpromiseExAsync(SyncAntchainAtoFundMerchantpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundMerchantpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.merchantpromise.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资放款结果同步
         * Summary: 融资放款结果同步
         */
        public SyncAntchainAtoFundFinanceloanresultsResponse SyncAntchainAtoFundFinanceloanresults(SyncAntchainAtoFundFinanceloanresultsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFundFinanceloanresultsEx(request, headers, runtime);
        }

        /**
         * Description: 融资放款结果同步
         * Summary: 融资放款结果同步
         */
        public async Task<SyncAntchainAtoFundFinanceloanresultsResponse> SyncAntchainAtoFundFinanceloanresultsAsync(SyncAntchainAtoFundFinanceloanresultsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFundFinanceloanresultsExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资放款结果同步
         * Summary: 融资放款结果同步
         */
        public SyncAntchainAtoFundFinanceloanresultsResponse SyncAntchainAtoFundFinanceloanresultsEx(SyncAntchainAtoFundFinanceloanresultsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundFinanceloanresultsResponse>(DoRequest("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资放款结果同步
         * Summary: 融资放款结果同步
         */
        public async Task<SyncAntchainAtoFundFinanceloanresultsResponse> SyncAntchainAtoFundFinanceloanresultsExAsync(SyncAntchainAtoFundFinanceloanresultsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundFinanceloanresultsResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.financeloanresults.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户承诺
         * Summary: 查询用户承诺
         */
        public GetAntchainAtoFundUserpromiseResponse GetAntchainAtoFundUserpromise(GetAntchainAtoFundUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户承诺
         * Summary: 查询用户承诺
         */
        public async Task<GetAntchainAtoFundUserpromiseResponse> GetAntchainAtoFundUserpromiseAsync(GetAntchainAtoFundUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户承诺
         * Summary: 查询用户承诺
         */
        public GetAntchainAtoFundUserpromiseResponse GetAntchainAtoFundUserpromiseEx(GetAntchainAtoFundUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundUserpromiseResponse>(DoRequest("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户承诺
         * Summary: 查询用户承诺
         */
        public async Task<GetAntchainAtoFundUserpromiseResponse> GetAntchainAtoFundUserpromiseExAsync(GetAntchainAtoFundUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.userpromise.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约信息查询（履约承诺+记录）
         * Summary: 用户履约信息查询（履约承诺+记录）
         */
        public GetAntchainAtoTradeUserperformanceResponse GetAntchainAtoTradeUserperformance(GetAntchainAtoTradeUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoTradeUserperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 用户履约信息查询（履约承诺+记录）
         * Summary: 用户履约信息查询（履约承诺+记录）
         */
        public async Task<GetAntchainAtoTradeUserperformanceResponse> GetAntchainAtoTradeUserperformanceAsync(GetAntchainAtoTradeUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoTradeUserperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户履约信息查询（履约承诺+记录）
         * Summary: 用户履约信息查询（履约承诺+记录）
         */
        public GetAntchainAtoTradeUserperformanceResponse GetAntchainAtoTradeUserperformanceEx(GetAntchainAtoTradeUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeUserperformanceResponse>(DoRequest("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约信息查询（履约承诺+记录）
         * Summary: 用户履约信息查询（履约承诺+记录）
         */
        public async Task<GetAntchainAtoTradeUserperformanceResponse> GetAntchainAtoTradeUserperformanceExAsync(GetAntchainAtoTradeUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeUserperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public GetAntchainAtoTradeMerchantperformanceResponse GetAntchainAtoTradeMerchantperformance(GetAntchainAtoTradeMerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoTradeMerchantperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetAntchainAtoTradeMerchantperformanceResponse> GetAntchainAtoTradeMerchantperformanceAsync(GetAntchainAtoTradeMerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoTradeMerchantperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public GetAntchainAtoTradeMerchantperformanceResponse GetAntchainAtoTradeMerchantperformanceEx(GetAntchainAtoTradeMerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeMerchantperformanceResponse>(DoRequest("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetAntchainAtoTradeMerchantperformanceResponse> GetAntchainAtoTradeMerchantperformanceExAsync(GetAntchainAtoTradeMerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeMerchantperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.merchantperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约信息查询（履约承诺+履约记录）
         * Summary: 用户履约信息查询（履约承诺+履约记录）
         */
        public GetAntchainAtoFundUserperformanceResponse GetAntchainAtoFundUserperformance(GetAntchainAtoFundUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundUserperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 用户履约信息查询（履约承诺+履约记录）
         * Summary: 用户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetAntchainAtoFundUserperformanceResponse> GetAntchainAtoFundUserperformanceAsync(GetAntchainAtoFundUserperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundUserperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户履约信息查询（履约承诺+履约记录）
         * Summary: 用户履约信息查询（履约承诺+履约记录）
         */
        public GetAntchainAtoFundUserperformanceResponse GetAntchainAtoFundUserperformanceEx(GetAntchainAtoFundUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundUserperformanceResponse>(DoRequest("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约信息查询（履约承诺+履约记录）
         * Summary: 用户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetAntchainAtoFundUserperformanceResponse> GetAntchainAtoFundUserperformanceExAsync(GetAntchainAtoFundUserperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundUserperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.userperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public GetAntchainAtoFundMerchantperformanceResponse GetAntchainAtoFundMerchantperformance(GetAntchainAtoFundMerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundMerchantperformanceEx(request, headers, runtime);
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetAntchainAtoFundMerchantperformanceResponse> GetAntchainAtoFundMerchantperformanceAsync(GetAntchainAtoFundMerchantperformanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundMerchantperformanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public GetAntchainAtoFundMerchantperformanceResponse GetAntchainAtoFundMerchantperformanceEx(GetAntchainAtoFundMerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundMerchantperformanceResponse>(DoRequest("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户履约信息查询（履约承诺+履约记录）
         * Summary: 商户履约信息查询（履约承诺+履约记录）
         */
        public async Task<GetAntchainAtoFundMerchantperformanceResponse> GetAntchainAtoFundMerchantperformanceExAsync(GetAntchainAtoFundMerchantperformanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundMerchantperformanceResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.merchantperformance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询订单详情
         * Summary: 资方查询订单详情
         */
        public GetAntchainAtoFundOrderfullinfoResponse GetAntchainAtoFundOrderfullinfo(GetAntchainAtoFundOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundOrderfullinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资方查询订单详情
         * Summary: 资方查询订单详情
         */
        public async Task<GetAntchainAtoFundOrderfullinfoResponse> GetAntchainAtoFundOrderfullinfoAsync(GetAntchainAtoFundOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundOrderfullinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方查询订单详情
         * Summary: 资方查询订单详情
         */
        public GetAntchainAtoFundOrderfullinfoResponse GetAntchainAtoFundOrderfullinfoEx(GetAntchainAtoFundOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundOrderfullinfoResponse>(DoRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询订单详情
         * Summary: 资方查询订单详情
         */
        public async Task<GetAntchainAtoFundOrderfullinfoResponse> GetAntchainAtoFundOrderfullinfoExAsync(GetAntchainAtoFundOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundOrderfullinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用该接口，追加上传无法在原有链路上签署的合同
         * Summary: 商户调用合同追加接口
         */
        public UploadAntchainAtoSignFlowResponse UploadAntchainAtoSignFlow(UploadAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntchainAtoSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 调用该接口，追加上传无法在原有链路上签署的合同
         * Summary: 商户调用合同追加接口
         */
        public async Task<UploadAntchainAtoSignFlowResponse> UploadAntchainAtoSignFlowAsync(UploadAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntchainAtoSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用该接口，追加上传无法在原有链路上签署的合同
         * Summary: 商户调用合同追加接口
         */
        public UploadAntchainAtoSignFlowResponse UploadAntchainAtoSignFlowEx(UploadAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.sign.flow.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntchainAtoSignFlowResponse uploadAntchainAtoSignFlowResponse = new UploadAntchainAtoSignFlowResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntchainAtoSignFlowResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用该接口，追加上传无法在原有链路上签署的合同
         * Summary: 商户调用合同追加接口
         */
        public async Task<UploadAntchainAtoSignFlowResponse> UploadAntchainAtoSignFlowExAsync(UploadAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.sign.flow.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntchainAtoSignFlowResponse uploadAntchainAtoSignFlowResponse = new UploadAntchainAtoSignFlowResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntchainAtoSignFlowResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
