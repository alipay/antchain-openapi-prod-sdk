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
                        {"sdk_version", "1.7.2"},
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
                        {"sdk_version", "1.7.2"},
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
         * Description: 代扣签约创建
         * Summary: 代扣签约
         */
        public CreateAntchainAtoWithholdSignResponse CreateAntchainAtoWithholdSign(CreateAntchainAtoWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainAtoWithholdSignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约创建
         * Summary: 代扣签约
         */
        public async Task<CreateAntchainAtoWithholdSignResponse> CreateAntchainAtoWithholdSignAsync(CreateAntchainAtoWithholdSignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainAtoWithholdSignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约创建
         * Summary: 代扣签约
         */
        public CreateAntchainAtoWithholdSignResponse CreateAntchainAtoWithholdSignEx(CreateAntchainAtoWithholdSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdSignResponse>(DoRequest("1.0", "antchain.ato.withhold.sign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约创建
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
         * Description: 重要说明：
            1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
            2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
         * Summary: 单期多期代扣取消
         */
        public RepayAntchainAtoWithholdPlanResponse RepayAntchainAtoWithholdPlan(RepayAntchainAtoWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayAntchainAtoWithholdPlanEx(request, headers, runtime);
        }

        /**
         * Description: 重要说明：
            1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
            2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
         * Summary: 单期多期代扣取消
         */
        public async Task<RepayAntchainAtoWithholdPlanResponse> RepayAntchainAtoWithholdPlanAsync(RepayAntchainAtoWithholdPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayAntchainAtoWithholdPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 重要说明：
            1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
            2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
         * Summary: 单期多期代扣取消
         */
        public RepayAntchainAtoWithholdPlanResponse RepayAntchainAtoWithholdPlanEx(RepayAntchainAtoWithholdPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayAntchainAtoWithholdPlanResponse>(DoRequest("1.0", "antchain.ato.withhold.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重要说明：
            1. 这个接口是取消订单某一、多期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
            2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
         * Summary: 单期多期代扣取消
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
                request.FileObject = null;
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
                request.FileObject = null;
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
         * Description: 资方合同落签
         * Summary: 资方合同落签
         */
        public AuthAntchainAtoFundFlowResponse AuthAntchainAtoFundFlow(AuthAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthAntchainAtoFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方合同落签
         * Summary: 资方合同落签
         */
        public async Task<AuthAntchainAtoFundFlowResponse> AuthAntchainAtoFundFlowAsync(AuthAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthAntchainAtoFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方合同落签
         * Summary: 资方合同落签
         */
        public AuthAntchainAtoFundFlowResponse AuthAntchainAtoFundFlowEx(AuthAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainAtoFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方合同落签
         * Summary: 资方合同落签
         */
        public async Task<AuthAntchainAtoFundFlowResponse> AuthAntchainAtoFundFlowExAsync(AuthAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainAtoFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付创建
         * Summary: 主动支付创建
         */
        public CreateAntchainAtoWithholdActivepayResponse CreateAntchainAtoWithholdActivepay(CreateAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainAtoWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 主动支付创建
         * Summary: 主动支付创建
         */
        public async Task<CreateAntchainAtoWithholdActivepayResponse> CreateAntchainAtoWithholdActivepayAsync(CreateAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainAtoWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 主动支付创建
         * Summary: 主动支付创建
         */
        public CreateAntchainAtoWithholdActivepayResponse CreateAntchainAtoWithholdActivepayEx(CreateAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付创建
         * Summary: 主动支付创建
         */
        public async Task<CreateAntchainAtoWithholdActivepayResponse> CreateAntchainAtoWithholdActivepayExAsync(CreateAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付查询
         * Summary: 主动支付查询
         */
        public QueryAntchainAtoWithholdActivepayResponse QueryAntchainAtoWithholdActivepay(QueryAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 主动支付查询
         * Summary: 主动支付查询
         */
        public async Task<QueryAntchainAtoWithholdActivepayResponse> QueryAntchainAtoWithholdActivepayAsync(QueryAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 主动支付查询
         * Summary: 主动支付查询
         */
        public QueryAntchainAtoWithholdActivepayResponse QueryAntchainAtoWithholdActivepayEx(QueryAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付查询
         * Summary: 主动支付查询
         */
        public async Task<QueryAntchainAtoWithholdActivepayResponse> QueryAntchainAtoWithholdActivepayExAsync(QueryAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdActivepayResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.activepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付取消
         * Summary: 主动支付取消
         */
        public CancelAntchainAtoWithholdActivepayResponse CancelAntchainAtoWithholdActivepay(CancelAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAntchainAtoWithholdActivepayEx(request, headers, runtime);
        }

        /**
         * Description: 主动支付取消
         * Summary: 主动支付取消
         */
        public async Task<CancelAntchainAtoWithholdActivepayResponse> CancelAntchainAtoWithholdActivepayAsync(CancelAntchainAtoWithholdActivepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAntchainAtoWithholdActivepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 主动支付取消
         * Summary: 主动支付取消
         */
        public CancelAntchainAtoWithholdActivepayResponse CancelAntchainAtoWithholdActivepayEx(CancelAntchainAtoWithholdActivepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoWithholdActivepayResponse>(DoRequest("1.0", "antchain.ato.withhold.activepay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 主动支付取消
         * Summary: 主动支付取消
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
         * Description: 资方调用、订单详情获取
         * Summary: 资方调用、订单详情获取
         */
        public GetAntchainAtoFundOrderfullinfoResponse GetAntchainAtoFundOrderfullinfo(GetAntchainAtoFundOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundOrderfullinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资方调用、订单详情获取
         * Summary: 资方调用、订单详情获取
         */
        public async Task<GetAntchainAtoFundOrderfullinfoResponse> GetAntchainAtoFundOrderfullinfoAsync(GetAntchainAtoFundOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundOrderfullinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方调用、订单详情获取
         * Summary: 资方调用、订单详情获取
         */
        public GetAntchainAtoFundOrderfullinfoResponse GetAntchainAtoFundOrderfullinfoEx(GetAntchainAtoFundOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundOrderfullinfoResponse>(DoRequest("1.0", "antchain.ato.fund.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方调用、订单详情获取
         * Summary: 资方调用、订单详情获取
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
                request.FileObject = null;
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
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建退款请求
         * Summary: 创建退款申请
         */
        public CreateAntchainAtoWithholdRefundResponse CreateAntchainAtoWithholdRefund(CreateAntchainAtoWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainAtoWithholdRefundEx(request, headers, runtime);
        }

        /**
         * Description: 创建退款请求
         * Summary: 创建退款申请
         */
        public async Task<CreateAntchainAtoWithholdRefundResponse> CreateAntchainAtoWithholdRefundAsync(CreateAntchainAtoWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainAtoWithholdRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建退款请求
         * Summary: 创建退款申请
         */
        public CreateAntchainAtoWithholdRefundResponse CreateAntchainAtoWithholdRefundEx(CreateAntchainAtoWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdRefundResponse>(DoRequest("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建退款请求
         * Summary: 创建退款申请
         */
        public async Task<CreateAntchainAtoWithholdRefundResponse> CreateAntchainAtoWithholdRefundExAsync(CreateAntchainAtoWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoWithholdRefundResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.refund.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 退款申请结果查询
         * Summary: 退款申请结果查询
         */
        public QueryAntchainAtoWithholdRefundResponse QueryAntchainAtoWithholdRefund(QueryAntchainAtoWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoWithholdRefundEx(request, headers, runtime);
        }

        /**
         * Description: 退款申请结果查询
         * Summary: 退款申请结果查询
         */
        public async Task<QueryAntchainAtoWithholdRefundResponse> QueryAntchainAtoWithholdRefundAsync(QueryAntchainAtoWithholdRefundRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoWithholdRefundExAsync(request, headers, runtime);
        }

        /**
         * Description: 退款申请结果查询
         * Summary: 退款申请结果查询
         */
        public QueryAntchainAtoWithholdRefundResponse QueryAntchainAtoWithholdRefundEx(QueryAntchainAtoWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdRefundResponse>(DoRequest("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 退款申请结果查询
         * Summary: 退款申请结果查询
         */
        public async Task<QueryAntchainAtoWithholdRefundResponse> QueryAntchainAtoWithholdRefundExAsync(QueryAntchainAtoWithholdRefundRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdRefundResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.refund.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户调用，修改订单的用户还款承诺
         * Summary: 用户还款承诺信息修改
         */
        public UpdateAntchainAtoTradeUserpromiseResponse UpdateAntchainAtoTradeUserpromise(UpdateAntchainAtoTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntchainAtoTradeUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 商户调用，修改订单的用户还款承诺
         * Summary: 用户还款承诺信息修改
         */
        public async Task<UpdateAntchainAtoTradeUserpromiseResponse> UpdateAntchainAtoTradeUserpromiseAsync(UpdateAntchainAtoTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntchainAtoTradeUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户调用，修改订单的用户还款承诺
         * Summary: 用户还款承诺信息修改
         */
        public UpdateAntchainAtoTradeUserpromiseResponse UpdateAntchainAtoTradeUserpromiseEx(UpdateAntchainAtoTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainAtoTradeUserpromiseResponse>(DoRequest("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户调用，修改订单的用户还款承诺
         * Summary: 用户还款承诺信息修改
         */
        public async Task<UpdateAntchainAtoTradeUserpromiseResponse> UpdateAntchainAtoTradeUserpromiseExAsync(UpdateAntchainAtoTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainAtoTradeUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromise.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据租户查询合同模板列表
         * Summary: 查询模板列表
         */
        public AllAntchainAtoInnerTemplateResponse AllAntchainAtoInnerTemplate(AllAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据租户查询合同模板列表
         * Summary: 查询模板列表
         */
        public async Task<AllAntchainAtoInnerTemplateResponse> AllAntchainAtoInnerTemplateAsync(AllAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据租户查询合同模板列表
         * Summary: 查询模板列表
         */
        public AllAntchainAtoInnerTemplateResponse AllAntchainAtoInnerTemplateEx(AllAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据租户查询合同模板列表
         * Summary: 查询模板列表
         */
        public async Task<AllAntchainAtoInnerTemplateResponse> AllAntchainAtoInnerTemplateExAsync(AllAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据模板code查询合同模板版本列表
         * Summary: 查询魔法库某一模板版本列表
         */
        public ListAntchainAtoInnerTemplateResponse ListAntchainAtoInnerTemplate(ListAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据模板code查询合同模板版本列表
         * Summary: 查询魔法库某一模板版本列表
         */
        public async Task<ListAntchainAtoInnerTemplateResponse> ListAntchainAtoInnerTemplateAsync(ListAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据模板code查询合同模板版本列表
         * Summary: 查询魔法库某一模板版本列表
         */
        public ListAntchainAtoInnerTemplateResponse ListAntchainAtoInnerTemplateEx(ListAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据模板code查询合同模板版本列表
         * Summary: 查询魔法库某一模板版本列表
         */
        public async Task<ListAntchainAtoInnerTemplateResponse> ListAntchainAtoInnerTemplateExAsync(ListAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据模板code查询指定版本的模板详情
         * Summary: 查询魔法库模板详情
         */
        public DetailAntchainAtoInnerTemplateResponse DetailAntchainAtoInnerTemplate(DetailAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据模板code查询指定版本的模板详情
         * Summary: 查询魔法库模板详情
         */
        public async Task<DetailAntchainAtoInnerTemplateResponse> DetailAntchainAtoInnerTemplateAsync(DetailAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据模板code查询指定版本的模板详情
         * Summary: 查询魔法库模板详情
         */
        public DetailAntchainAtoInnerTemplateResponse DetailAntchainAtoInnerTemplateEx(DetailAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据模板code查询指定版本的模板详情
         * Summary: 查询魔法库模板详情
         */
        public async Task<DetailAntchainAtoInnerTemplateResponse> DetailAntchainAtoInnerTemplateExAsync(DetailAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，创建魔法库模板
         * Summary: 创建模板
         */
        public CreateAntchainAtoInnerTemplateResponse CreateAntchainAtoInnerTemplate(CreateAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，创建魔法库模板
         * Summary: 创建模板
         */
        public async Task<CreateAntchainAtoInnerTemplateResponse> CreateAntchainAtoInnerTemplateAsync(CreateAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，创建魔法库模板
         * Summary: 创建模板
         */
        public CreateAntchainAtoInnerTemplateResponse CreateAntchainAtoInnerTemplateEx(CreateAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，创建魔法库模板
         * Summary: 创建模板
         */
        public async Task<CreateAntchainAtoInnerTemplateResponse> CreateAntchainAtoInnerTemplateExAsync(CreateAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，保存魔法库模板
         * Summary: 保存魔法库模板
         */
        public SaveAntchainAtoInnerTemplateResponse SaveAntchainAtoInnerTemplate(SaveAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，保存魔法库模板
         * Summary: 保存魔法库模板
         */
        public async Task<SaveAntchainAtoInnerTemplateResponse> SaveAntchainAtoInnerTemplateAsync(SaveAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，保存魔法库模板
         * Summary: 保存魔法库模板
         */
        public SaveAntchainAtoInnerTemplateResponse SaveAntchainAtoInnerTemplateEx(SaveAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，保存魔法库模板
         * Summary: 保存魔法库模板
         */
        public async Task<SaveAntchainAtoInnerTemplateResponse> SaveAntchainAtoInnerTemplateExAsync(SaveAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，发布魔法库模板
         * Summary: 发布魔法库模板
         */
        public PublishAntchainAtoInnerTemplateResponse PublishAntchainAtoInnerTemplate(PublishAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，发布魔法库模板
         * Summary: 发布魔法库模板
         */
        public async Task<PublishAntchainAtoInnerTemplateResponse> PublishAntchainAtoInnerTemplateAsync(PublishAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，发布魔法库模板
         * Summary: 发布魔法库模板
         */
        public PublishAntchainAtoInnerTemplateResponse PublishAntchainAtoInnerTemplateEx(PublishAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，发布魔法库模板
         * Summary: 发布魔法库模板
         */
        public async Task<PublishAntchainAtoInnerTemplateResponse> PublishAntchainAtoInnerTemplateExAsync(PublishAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据code预览对应魔法库模板
         * Summary: 预览魔法库模板
         */
        public PreviewAntchainAtoInnerTemplateResponse PreviewAntchainAtoInnerTemplate(PreviewAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PreviewAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据code预览对应魔法库模板
         * Summary: 预览魔法库模板
         */
        public async Task<PreviewAntchainAtoInnerTemplateResponse> PreviewAntchainAtoInnerTemplateAsync(PreviewAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PreviewAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据code预览对应魔法库模板
         * Summary: 预览魔法库模板
         */
        public PreviewAntchainAtoInnerTemplateResponse PreviewAntchainAtoInnerTemplateEx(PreviewAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据code预览对应魔法库模板
         * Summary: 预览魔法库模板
         */
        public async Task<PreviewAntchainAtoInnerTemplateResponse> PreviewAntchainAtoInnerTemplateExAsync(PreviewAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PreviewAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.preview", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据code删除对应魔法库模板
         * Summary: 删除魔法库模板
         */
        public DeleteAntchainAtoInnerTemplateResponse DeleteAntchainAtoInnerTemplate(DeleteAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据code删除对应魔法库模板
         * Summary: 删除魔法库模板
         */
        public async Task<DeleteAntchainAtoInnerTemplateResponse> DeleteAntchainAtoInnerTemplateAsync(DeleteAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，根据code删除对应魔法库模板
         * Summary: 删除魔法库模板
         */
        public DeleteAntchainAtoInnerTemplateResponse DeleteAntchainAtoInnerTemplateEx(DeleteAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，根据code删除对应魔法库模板
         * Summary: 删除魔法库模板
         */
        public async Task<DeleteAntchainAtoInnerTemplateResponse> DeleteAntchainAtoInnerTemplateExAsync(DeleteAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，复制一个魔法库模板
         * Summary: 复制魔法库模板
         */
        public CloneAntchainAtoInnerTemplateResponse CloneAntchainAtoInnerTemplate(CloneAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloneAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 内部接口，复制一个魔法库模板
         * Summary: 复制魔法库模板
         */
        public async Task<CloneAntchainAtoInnerTemplateResponse> CloneAntchainAtoInnerTemplateAsync(CloneAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloneAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 内部接口，复制一个魔法库模板
         * Summary: 复制魔法库模板
         */
        public CloneAntchainAtoInnerTemplateResponse CloneAntchainAtoInnerTemplateEx(CloneAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 内部接口，复制一个魔法库模板
         * Summary: 复制魔法库模板
         */
        public async Task<CloneAntchainAtoInnerTemplateResponse> CloneAntchainAtoInnerTemplateExAsync(CloneAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloneAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.clone", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
         * Summary: 资方合同文件已上传确认接口
         */
        public NotifyAntchainAtoFundFlowResponse NotifyAntchainAtoFundFlow(NotifyAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyAntchainAtoFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
         * Summary: 资方合同文件已上传确认接口
         */
        public async Task<NotifyAntchainAtoFundFlowResponse> NotifyAntchainAtoFundFlowAsync(NotifyAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyAntchainAtoFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
         * Summary: 资方合同文件已上传确认接口
         */
        public NotifyAntchainAtoFundFlowResponse NotifyAntchainAtoFundFlowEx(NotifyAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyAntchainAtoFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
         * Summary: 资方合同文件已上传确认接口
         */
        public async Task<NotifyAntchainAtoFundFlowResponse> NotifyAntchainAtoFundFlowExAsync(NotifyAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyAntchainAtoFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板的图片列表
         * Summary: 获取模板的图片列表
         */
        public QueryAntchainAtoInnerTemplateimageResponse QueryAntchainAtoInnerTemplateimage(QueryAntchainAtoInnerTemplateimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoInnerTemplateimageEx(request, headers, runtime);
        }

        /**
         * Description: 获取模板的图片列表
         * Summary: 获取模板的图片列表
         */
        public async Task<QueryAntchainAtoInnerTemplateimageResponse> QueryAntchainAtoInnerTemplateimageAsync(QueryAntchainAtoInnerTemplateimageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoInnerTemplateimageExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取模板的图片列表
         * Summary: 获取模板的图片列表
         */
        public QueryAntchainAtoInnerTemplateimageResponse QueryAntchainAtoInnerTemplateimageEx(QueryAntchainAtoInnerTemplateimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoInnerTemplateimageResponse>(DoRequest("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板的图片列表
         * Summary: 获取模板的图片列表
         */
        public async Task<QueryAntchainAtoInnerTemplateimageResponse> QueryAntchainAtoInnerTemplateimageExAsync(QueryAntchainAtoInnerTemplateimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoInnerTemplateimageResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templateimage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 前置签署间联模式订单进件
         * Summary: 前置签署间联模式订单进件
         */
        public SyncAntchainAtoFrontIndirectorderResponse SyncAntchainAtoFrontIndirectorder(SyncAntchainAtoFrontIndirectorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFrontIndirectorderEx(request, headers, runtime);
        }

        /**
         * Description: 前置签署间联模式订单进件
         * Summary: 前置签署间联模式订单进件
         */
        public async Task<SyncAntchainAtoFrontIndirectorderResponse> SyncAntchainAtoFrontIndirectorderAsync(SyncAntchainAtoFrontIndirectorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFrontIndirectorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 前置签署间联模式订单进件
         * Summary: 前置签署间联模式订单进件
         */
        public SyncAntchainAtoFrontIndirectorderResponse SyncAntchainAtoFrontIndirectorderEx(SyncAntchainAtoFrontIndirectorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFrontIndirectorderResponse>(DoRequest("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 前置签署间联模式订单进件
         * Summary: 前置签署间联模式订单进件
         */
        public async Task<SyncAntchainAtoFrontIndirectorderResponse> SyncAntchainAtoFrontIndirectorderExAsync(SyncAntchainAtoFrontIndirectorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFrontIndirectorderResponse>(await DoRequestAsync("1.0", "antchain.ato.front.indirectorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 间联模式-后置模式订单进件
         * Summary: 间联模式-后置模式订单进件
         */
        public SyncAntchainAtoTradeIndirectorderResponse SyncAntchainAtoTradeIndirectorder(SyncAntchainAtoTradeIndirectorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoTradeIndirectorderEx(request, headers, runtime);
        }

        /**
         * Description: 间联模式-后置模式订单进件
         * Summary: 间联模式-后置模式订单进件
         */
        public async Task<SyncAntchainAtoTradeIndirectorderResponse> SyncAntchainAtoTradeIndirectorderAsync(SyncAntchainAtoTradeIndirectorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoTradeIndirectorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 间联模式-后置模式订单进件
         * Summary: 间联模式-后置模式订单进件
         */
        public SyncAntchainAtoTradeIndirectorderResponse SyncAntchainAtoTradeIndirectorderEx(SyncAntchainAtoTradeIndirectorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeIndirectorderResponse>(DoRequest("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 间联模式-后置模式订单进件
         * Summary: 间联模式-后置模式订单进件
         */
        public async Task<SyncAntchainAtoTradeIndirectorderResponse> SyncAntchainAtoTradeIndirectorderExAsync(SyncAntchainAtoTradeIndirectorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeIndirectorderResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.indirectorder.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻
         * Summary: 商户入驻
         */
        public RegisterAntchainAtoMerchantexpandMerchantResponse RegisterAntchainAtoMerchantexpandMerchant(RegisterAntchainAtoMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商户入驻
         * Summary: 商户入驻
         */
        public async Task<RegisterAntchainAtoMerchantexpandMerchantResponse> RegisterAntchainAtoMerchantexpandMerchantAsync(RegisterAntchainAtoMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterAntchainAtoMerchantexpandMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户入驻
         * Summary: 商户入驻
         */
        public RegisterAntchainAtoMerchantexpandMerchantResponse RegisterAntchainAtoMerchantexpandMerchantEx(RegisterAntchainAtoMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterAntchainAtoMerchantexpandMerchantResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻
         * Summary: 商户入驻
         */
        public async Task<RegisterAntchainAtoMerchantexpandMerchantResponse> RegisterAntchainAtoMerchantexpandMerchantExAsync(RegisterAntchainAtoMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterAntchainAtoMerchantexpandMerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.merchant.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取临时上传文件链接
         * Summary: 获取临时上传文件链接
         */
        public UploadAntchainAtoMerchantexpandFileResponse UploadAntchainAtoMerchantexpandFile(UploadAntchainAtoMerchantexpandFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntchainAtoMerchantexpandFileEx(request, headers, runtime);
        }

        /**
         * Description: 获取临时上传文件链接
         * Summary: 获取临时上传文件链接
         */
        public async Task<UploadAntchainAtoMerchantexpandFileResponse> UploadAntchainAtoMerchantexpandFileAsync(UploadAntchainAtoMerchantexpandFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntchainAtoMerchantexpandFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取临时上传文件链接
         * Summary: 获取临时上传文件链接
         */
        public UploadAntchainAtoMerchantexpandFileResponse UploadAntchainAtoMerchantexpandFileEx(UploadAntchainAtoMerchantexpandFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoMerchantexpandFileResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取临时上传文件链接
         * Summary: 获取临时上传文件链接
         */
        public async Task<UploadAntchainAtoMerchantexpandFileResponse> UploadAntchainAtoMerchantexpandFileExAsync(UploadAntchainAtoMerchantexpandFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoMerchantexpandFileResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.file.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻查询
         * Summary: 商户入驻查询
         */
        public QueryAntchainAtoMerchantexpandMerchantResponse QueryAntchainAtoMerchantexpandMerchant(QueryAntchainAtoMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商户入驻查询
         * Summary: 商户入驻查询
         */
        public async Task<QueryAntchainAtoMerchantexpandMerchantResponse> QueryAntchainAtoMerchantexpandMerchantAsync(QueryAntchainAtoMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoMerchantexpandMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户入驻查询
         * Summary: 商户入驻查询
         */
        public QueryAntchainAtoMerchantexpandMerchantResponse QueryAntchainAtoMerchantexpandMerchantEx(QueryAntchainAtoMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoMerchantexpandMerchantResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户入驻查询
         * Summary: 商户入驻查询
         */
        public async Task<QueryAntchainAtoMerchantexpandMerchantResponse> QueryAntchainAtoMerchantexpandMerchantExAsync(QueryAntchainAtoMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoMerchantexpandMerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.merchant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步已发布的模板
         * Summary: 同步已发布的模板
         */
        public SyncAntchainAtoInnerTemplateResponse SyncAntchainAtoInnerTemplate(SyncAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 同步已发布的模板
         * Summary: 同步已发布的模板
         */
        public async Task<SyncAntchainAtoInnerTemplateResponse> SyncAntchainAtoInnerTemplateAsync(SyncAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步已发布的模板
         * Summary: 同步已发布的模板
         */
        public SyncAntchainAtoInnerTemplateResponse SyncAntchainAtoInnerTemplateEx(SyncAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步已发布的模板
         * Summary: 同步已发布的模板
         */
        public async Task<SyncAntchainAtoInnerTemplateResponse> SyncAntchainAtoInnerTemplateExAsync(SyncAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新魔法库模板基本信息
         * Summary: 更新魔法库模板基本信息
         */
        public UpdateAntchainAtoInnerTemplateResponse UpdateAntchainAtoInnerTemplate(UpdateAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 更新魔法库模板基本信息
         * Summary: 更新魔法库模板基本信息
         */
        public async Task<UpdateAntchainAtoInnerTemplateResponse> UpdateAntchainAtoInnerTemplateAsync(UpdateAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新魔法库模板基本信息
         * Summary: 更新魔法库模板基本信息
         */
        public UpdateAntchainAtoInnerTemplateResponse UpdateAntchainAtoInnerTemplateEx(UpdateAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新魔法库模板基本信息
         * Summary: 更新魔法库模板基本信息
         */
        public async Task<UpdateAntchainAtoInnerTemplateResponse> UpdateAntchainAtoInnerTemplateExAsync(UpdateAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户合同模板上传接口
         * Summary: 商户合同模板上传
         */
        public UploadAntchainAtoSignTemplateResponse UploadAntchainAtoSignTemplate(UploadAntchainAtoSignTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntchainAtoSignTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 商户合同模板上传接口
         * Summary: 商户合同模板上传
         */
        public async Task<UploadAntchainAtoSignTemplateResponse> UploadAntchainAtoSignTemplateAsync(UploadAntchainAtoSignTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntchainAtoSignTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户合同模板上传接口
         * Summary: 商户合同模板上传
         */
        public UploadAntchainAtoSignTemplateResponse UploadAntchainAtoSignTemplateEx(UploadAntchainAtoSignTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.sign.template.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntchainAtoSignTemplateResponse uploadAntchainAtoSignTemplateResponse = new UploadAntchainAtoSignTemplateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntchainAtoSignTemplateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoSignTemplateResponse>(DoRequest("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户合同模板上传接口
         * Summary: 商户合同模板上传
         */
        public async Task<UploadAntchainAtoSignTemplateResponse> UploadAntchainAtoSignTemplateExAsync(UploadAntchainAtoSignTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.ato.sign.template.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadAntchainAtoSignTemplateResponse uploadAntchainAtoSignTemplateResponse = new UploadAntchainAtoSignTemplateResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadAntchainAtoSignTemplateResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoSignTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.template.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模板code更新模板的基本信息，比如模板名称等
         * Summary: 查询模板的基本信息
         */
        public QueryAntchainAtoInnerTemplateResponse QueryAntchainAtoInnerTemplate(QueryAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 通过模板code更新模板的基本信息，比如模板名称等
         * Summary: 查询模板的基本信息
         */
        public async Task<QueryAntchainAtoInnerTemplateResponse> QueryAntchainAtoInnerTemplateAsync(QueryAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过模板code更新模板的基本信息，比如模板名称等
         * Summary: 查询模板的基本信息
         */
        public QueryAntchainAtoInnerTemplateResponse QueryAntchainAtoInnerTemplateEx(QueryAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过模板code更新模板的基本信息，比如模板名称等
         * Summary: 查询模板的基本信息
         */
        public async Task<QueryAntchainAtoInnerTemplateResponse> QueryAntchainAtoInnerTemplateExAsync(QueryAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板关联的元素列表信息，包括组件信息
         * Summary: 获取模板关联的元素列表信息
         */
        public QueryAntchainAtoInnerTemplateelementlinkResponse QueryAntchainAtoInnerTemplateelementlink(QueryAntchainAtoInnerTemplateelementlinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoInnerTemplateelementlinkEx(request, headers, runtime);
        }

        /**
         * Description: 获取模板关联的元素列表信息，包括组件信息
         * Summary: 获取模板关联的元素列表信息
         */
        public async Task<QueryAntchainAtoInnerTemplateelementlinkResponse> QueryAntchainAtoInnerTemplateelementlinkAsync(QueryAntchainAtoInnerTemplateelementlinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoInnerTemplateelementlinkExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取模板关联的元素列表信息，包括组件信息
         * Summary: 获取模板关联的元素列表信息
         */
        public QueryAntchainAtoInnerTemplateelementlinkResponse QueryAntchainAtoInnerTemplateelementlinkEx(QueryAntchainAtoInnerTemplateelementlinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoInnerTemplateelementlinkResponse>(DoRequest("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取模板关联的元素列表信息，包括组件信息
         * Summary: 获取模板关联的元素列表信息
         */
        public async Task<QueryAntchainAtoInnerTemplateelementlinkResponse> QueryAntchainAtoInnerTemplateelementlinkExAsync(QueryAntchainAtoInnerTemplateelementlinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoInnerTemplateelementlinkResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.templateelementlink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方资产凭证上传，可以是文本或文件
         * Summary: 资方资产凭证上传
         */
        public UploadAntchainAtoFundCreditResponse UploadAntchainAtoFundCredit(UploadAntchainAtoFundCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntchainAtoFundCreditEx(request, headers, runtime);
        }

        /**
         * Description: 资方资产凭证上传，可以是文本或文件
         * Summary: 资方资产凭证上传
         */
        public async Task<UploadAntchainAtoFundCreditResponse> UploadAntchainAtoFundCreditAsync(UploadAntchainAtoFundCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntchainAtoFundCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方资产凭证上传，可以是文本或文件
         * Summary: 资方资产凭证上传
         */
        public UploadAntchainAtoFundCreditResponse UploadAntchainAtoFundCreditEx(UploadAntchainAtoFundCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoFundCreditResponse>(DoRequest("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方资产凭证上传，可以是文本或文件
         * Summary: 资方资产凭证上传
         */
        public async Task<UploadAntchainAtoFundCreditResponse> UploadAntchainAtoFundCreditExAsync(UploadAntchainAtoFundCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoFundCreditResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.credit.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户资产凭证上传，可以是文本或文件
         * Summary: 商户资产凭证上传
         */
        public UploadAntchainAtoSignCreditResponse UploadAntchainAtoSignCredit(UploadAntchainAtoSignCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntchainAtoSignCreditEx(request, headers, runtime);
        }

        /**
         * Description: 商户资产凭证上传，可以是文本或文件
         * Summary: 商户资产凭证上传
         */
        public async Task<UploadAntchainAtoSignCreditResponse> UploadAntchainAtoSignCreditAsync(UploadAntchainAtoSignCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntchainAtoSignCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户资产凭证上传，可以是文本或文件
         * Summary: 商户资产凭证上传
         */
        public UploadAntchainAtoSignCreditResponse UploadAntchainAtoSignCreditEx(UploadAntchainAtoSignCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoSignCreditResponse>(DoRequest("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户资产凭证上传，可以是文本或文件
         * Summary: 商户资产凭证上传
         */
        public async Task<UploadAntchainAtoSignCreditResponse> UploadAntchainAtoSignCreditExAsync(UploadAntchainAtoSignCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainAtoSignCreditResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.credit.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方资产凭证查询，需要提供订单号或资产包号
         * Summary: 资方资产凭证查询
         */
        public QueryAntchainAtoFundCreditResponse QueryAntchainAtoFundCredit(QueryAntchainAtoFundCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoFundCreditEx(request, headers, runtime);
        }

        /**
         * Description: 资方资产凭证查询，需要提供订单号或资产包号
         * Summary: 资方资产凭证查询
         */
        public async Task<QueryAntchainAtoFundCreditResponse> QueryAntchainAtoFundCreditAsync(QueryAntchainAtoFundCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoFundCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方资产凭证查询，需要提供订单号或资产包号
         * Summary: 资方资产凭证查询
         */
        public QueryAntchainAtoFundCreditResponse QueryAntchainAtoFundCreditEx(QueryAntchainAtoFundCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoFundCreditResponse>(DoRequest("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方资产凭证查询，需要提供订单号或资产包号
         * Summary: 资方资产凭证查询
         */
        public async Task<QueryAntchainAtoFundCreditResponse> QueryAntchainAtoFundCreditExAsync(QueryAntchainAtoFundCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoFundCreditResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户资产凭证查询，需要提供订单号或资产包号
         * Summary: 商户资产凭证查询
         */
        public QueryAntchainAtoSignCreditResponse QueryAntchainAtoSignCredit(QueryAntchainAtoSignCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoSignCreditEx(request, headers, runtime);
        }

        /**
         * Description: 商户资产凭证查询，需要提供订单号或资产包号
         * Summary: 商户资产凭证查询
         */
        public async Task<QueryAntchainAtoSignCreditResponse> QueryAntchainAtoSignCreditAsync(QueryAntchainAtoSignCreditRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoSignCreditExAsync(request, headers, runtime);
        }

        /**
         * Description: 商户资产凭证查询，需要提供订单号或资产包号
         * Summary: 商户资产凭证查询
         */
        public QueryAntchainAtoSignCreditResponse QueryAntchainAtoSignCreditEx(QueryAntchainAtoSignCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoSignCreditResponse>(DoRequest("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商户资产凭证查询，需要提供订单号或资产包号
         * Summary: 商户资产凭证查询
         */
        public async Task<QueryAntchainAtoSignCreditResponse> QueryAntchainAtoSignCreditExAsync(QueryAntchainAtoSignCreditRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoSignCreditResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.credit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家信息修改
         * Summary: 商家信息修改
         */
        public UpdateAntchainAtoMerchantexpandMerchantResponse UpdateAntchainAtoMerchantexpandMerchant(UpdateAntchainAtoMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntchainAtoMerchantexpandMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 商家信息修改
         * Summary: 商家信息修改
         */
        public async Task<UpdateAntchainAtoMerchantexpandMerchantResponse> UpdateAntchainAtoMerchantexpandMerchantAsync(UpdateAntchainAtoMerchantexpandMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntchainAtoMerchantexpandMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 商家信息修改
         * Summary: 商家信息修改
         */
        public UpdateAntchainAtoMerchantexpandMerchantResponse UpdateAntchainAtoMerchantexpandMerchantEx(UpdateAntchainAtoMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainAtoMerchantexpandMerchantResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商家信息修改
         * Summary: 商家信息修改
         */
        public async Task<UpdateAntchainAtoMerchantexpandMerchantResponse> UpdateAntchainAtoMerchantexpandMerchantExAsync(UpdateAntchainAtoMerchantexpandMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainAtoMerchantexpandMerchantResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.merchant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销签署流程
         * Summary: 撤销签署流程
         */
        public CancelAntchainAtoSignFlowResponse CancelAntchainAtoSignFlow(CancelAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAntchainAtoSignFlowEx(request, headers, runtime);
        }

        /**
         * Description: 撤销签署流程
         * Summary: 撤销签署流程
         */
        public async Task<CancelAntchainAtoSignFlowResponse> CancelAntchainAtoSignFlowAsync(CancelAntchainAtoSignFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAntchainAtoSignFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 撤销签署流程
         * Summary: 撤销签署流程
         */
        public CancelAntchainAtoSignFlowResponse CancelAntchainAtoSignFlowEx(CancelAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoSignFlowResponse>(DoRequest("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销签署流程
         * Summary: 撤销签署流程
         */
        public async Task<CancelAntchainAtoSignFlowResponse> CancelAntchainAtoSignFlowExAsync(CancelAntchainAtoSignFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoSignFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约承诺替换更新
         * Summary: 用户履约承诺替换更新
         */
        public ReplaceAntchainAtoTradeUserpromiseResponse ReplaceAntchainAtoTradeUserpromise(ReplaceAntchainAtoTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceAntchainAtoTradeUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 用户履约承诺替换更新
         * Summary: 用户履约承诺替换更新
         */
        public async Task<ReplaceAntchainAtoTradeUserpromiseResponse> ReplaceAntchainAtoTradeUserpromiseAsync(ReplaceAntchainAtoTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceAntchainAtoTradeUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户履约承诺替换更新
         * Summary: 用户履约承诺替换更新
         */
        public ReplaceAntchainAtoTradeUserpromiseResponse ReplaceAntchainAtoTradeUserpromiseEx(ReplaceAntchainAtoTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceAntchainAtoTradeUserpromiseResponse>(DoRequest("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户履约承诺替换更新
         * Summary: 用户履约承诺替换更新
         */
        public async Task<ReplaceAntchainAtoTradeUserpromiseResponse> ReplaceAntchainAtoTradeUserpromiseExAsync(ReplaceAntchainAtoTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceAntchainAtoTradeUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromise.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单融资预审申请接口
         * Summary: 订单融资预审申请接口
         */
        public ApplyAntchainAtoTradeFinanceprecheckResponse ApplyAntchainAtoTradeFinanceprecheck(ApplyAntchainAtoTradeFinanceprecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAntchainAtoTradeFinanceprecheckEx(request, headers, runtime);
        }

        /**
         * Description: 订单融资预审申请接口
         * Summary: 订单融资预审申请接口
         */
        public async Task<ApplyAntchainAtoTradeFinanceprecheckResponse> ApplyAntchainAtoTradeFinanceprecheckAsync(ApplyAntchainAtoTradeFinanceprecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAntchainAtoTradeFinanceprecheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单融资预审申请接口
         * Summary: 订单融资预审申请接口
         */
        public ApplyAntchainAtoTradeFinanceprecheckResponse ApplyAntchainAtoTradeFinanceprecheckEx(ApplyAntchainAtoTradeFinanceprecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntchainAtoTradeFinanceprecheckResponse>(DoRequest("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单融资预审申请接口
         * Summary: 订单融资预审申请接口
         */
        public async Task<ApplyAntchainAtoTradeFinanceprecheckResponse> ApplyAntchainAtoTradeFinanceprecheckExAsync(ApplyAntchainAtoTradeFinanceprecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntchainAtoTradeFinanceprecheckResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.financeprecheck.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资预审结果同步
         * Summary: 融资预审结果同步
         */
        public SyncAntchainAtoFundFinanceprecheckresultResponse SyncAntchainAtoFundFinanceprecheckresult(SyncAntchainAtoFundFinanceprecheckresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFundFinanceprecheckresultEx(request, headers, runtime);
        }

        /**
         * Description: 融资预审结果同步
         * Summary: 融资预审结果同步
         */
        public async Task<SyncAntchainAtoFundFinanceprecheckresultResponse> SyncAntchainAtoFundFinanceprecheckresultAsync(SyncAntchainAtoFundFinanceprecheckresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFundFinanceprecheckresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资预审结果同步
         * Summary: 融资预审结果同步
         */
        public SyncAntchainAtoFundFinanceprecheckresultResponse SyncAntchainAtoFundFinanceprecheckresultEx(SyncAntchainAtoFundFinanceprecheckresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundFinanceprecheckresultResponse>(DoRequest("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资预审结果同步
         * Summary: 融资预审结果同步
         */
        public async Task<SyncAntchainAtoFundFinanceprecheckresultResponse> SyncAntchainAtoFundFinanceprecheckresultExAsync(SyncAntchainAtoFundFinanceprecheckresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundFinanceprecheckresultResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.financeprecheckresult.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询代偿户余额
         * Summary: 代偿户查询
         */
        public QueryAntchainAtoFundCompensateaccountResponse QueryAntchainAtoFundCompensateaccount(QueryAntchainAtoFundCompensateaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoFundCompensateaccountEx(request, headers, runtime);
        }

        /**
         * Description: 资方查询代偿户余额
         * Summary: 代偿户查询
         */
        public async Task<QueryAntchainAtoFundCompensateaccountResponse> QueryAntchainAtoFundCompensateaccountAsync(QueryAntchainAtoFundCompensateaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoFundCompensateaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方查询代偿户余额
         * Summary: 代偿户查询
         */
        public QueryAntchainAtoFundCompensateaccountResponse QueryAntchainAtoFundCompensateaccountEx(QueryAntchainAtoFundCompensateaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoFundCompensateaccountResponse>(DoRequest("1.0", "antchain.ato.fund.compensateaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询代偿户余额
         * Summary: 代偿户查询
         */
        public async Task<QueryAntchainAtoFundCompensateaccountResponse> QueryAntchainAtoFundCompensateaccountExAsync(QueryAntchainAtoFundCompensateaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoFundCompensateaccountResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.compensateaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代偿户账户查询
         * Summary: 代偿户账户查询
         */
        public QueryAntchainAtoWithholdCompensateaccountResponse QueryAntchainAtoWithholdCompensateaccount(QueryAntchainAtoWithholdCompensateaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoWithholdCompensateaccountEx(request, headers, runtime);
        }

        /**
         * Description: 代偿户账户查询
         * Summary: 代偿户账户查询
         */
        public async Task<QueryAntchainAtoWithholdCompensateaccountResponse> QueryAntchainAtoWithholdCompensateaccountAsync(QueryAntchainAtoWithholdCompensateaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoWithholdCompensateaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 代偿户账户查询
         * Summary: 代偿户账户查询
         */
        public QueryAntchainAtoWithholdCompensateaccountResponse QueryAntchainAtoWithholdCompensateaccountEx(QueryAntchainAtoWithholdCompensateaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdCompensateaccountResponse>(DoRequest("1.0", "antchain.ato.withhold.compensateaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代偿户账户查询
         * Summary: 代偿户账户查询
         */
        public async Task<QueryAntchainAtoWithholdCompensateaccountResponse> QueryAntchainAtoWithholdCompensateaccountExAsync(QueryAntchainAtoWithholdCompensateaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoWithholdCompensateaccountResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.compensateaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合同存证证明
         * Summary: 获取合同存证证明
         */
        public GetAntchainAtoSignContractcertificateResponse GetAntchainAtoSignContractcertificate(GetAntchainAtoSignContractcertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoSignContractcertificateEx(request, headers, runtime);
        }

        /**
         * Description: 获取合同存证证明
         * Summary: 获取合同存证证明
         */
        public async Task<GetAntchainAtoSignContractcertificateResponse> GetAntchainAtoSignContractcertificateAsync(GetAntchainAtoSignContractcertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoSignContractcertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取合同存证证明
         * Summary: 获取合同存证证明
         */
        public GetAntchainAtoSignContractcertificateResponse GetAntchainAtoSignContractcertificateEx(GetAntchainAtoSignContractcertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoSignContractcertificateResponse>(DoRequest("1.0", "antchain.ato.sign.contractcertificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合同存证证明
         * Summary: 获取合同存证证明
         */
        public async Task<GetAntchainAtoSignContractcertificateResponse> GetAntchainAtoSignContractcertificateExAsync(GetAntchainAtoSignContractcertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoSignContractcertificateResponse>(await DoRequestAsync("1.0", "antchain.ato.sign.contractcertificate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 非融转融资
         * Summary: 非融转融资
         */
        public TransferAntchainAtoTradeFinanceResponse TransferAntchainAtoTradeFinance(TransferAntchainAtoTradeFinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return TransferAntchainAtoTradeFinanceEx(request, headers, runtime);
        }

        /**
         * Description: 非融转融资
         * Summary: 非融转融资
         */
        public async Task<TransferAntchainAtoTradeFinanceResponse> TransferAntchainAtoTradeFinanceAsync(TransferAntchainAtoTradeFinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await TransferAntchainAtoTradeFinanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 非融转融资
         * Summary: 非融转融资
         */
        public TransferAntchainAtoTradeFinanceResponse TransferAntchainAtoTradeFinanceEx(TransferAntchainAtoTradeFinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferAntchainAtoTradeFinanceResponse>(DoRequest("1.0", "antchain.ato.trade.finance.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 非融转融资
         * Summary: 非融转融资
         */
        public async Task<TransferAntchainAtoTradeFinanceResponse> TransferAntchainAtoTradeFinanceExAsync(TransferAntchainAtoTradeFinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<TransferAntchainAtoTradeFinanceResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.finance.transfer", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新订单信息
         * Summary: 更新订单信息
         */
        public UpdateAntchainAtoTradeOrderResponse UpdateAntchainAtoTradeOrder(UpdateAntchainAtoTradeOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntchainAtoTradeOrderEx(request, headers, runtime);
        }

        /**
         * Description: 更新订单信息
         * Summary: 更新订单信息
         */
        public async Task<UpdateAntchainAtoTradeOrderResponse> UpdateAntchainAtoTradeOrderAsync(UpdateAntchainAtoTradeOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntchainAtoTradeOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新订单信息
         * Summary: 更新订单信息
         */
        public UpdateAntchainAtoTradeOrderResponse UpdateAntchainAtoTradeOrderEx(UpdateAntchainAtoTradeOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainAtoTradeOrderResponse>(DoRequest("1.0", "antchain.ato.trade.order.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新订单信息
         * Summary: 更新订单信息
         */
        public async Task<UpdateAntchainAtoTradeOrderResponse> UpdateAntchainAtoTradeOrderExAsync(UpdateAntchainAtoTradeOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainAtoTradeOrderResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.order.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资订单追加预审资金方
         * Summary: 融资订单追加预审资金方
         */
        public AddAntchainAtoTradeFinanceprecheckResponse AddAntchainAtoTradeFinanceprecheck(AddAntchainAtoTradeFinanceprecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAntchainAtoTradeFinanceprecheckEx(request, headers, runtime);
        }

        /**
         * Description: 融资订单追加预审资金方
         * Summary: 融资订单追加预审资金方
         */
        public async Task<AddAntchainAtoTradeFinanceprecheckResponse> AddAntchainAtoTradeFinanceprecheckAsync(AddAntchainAtoTradeFinanceprecheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAntchainAtoTradeFinanceprecheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 融资订单追加预审资金方
         * Summary: 融资订单追加预审资金方
         */
        public AddAntchainAtoTradeFinanceprecheckResponse AddAntchainAtoTradeFinanceprecheckEx(AddAntchainAtoTradeFinanceprecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntchainAtoTradeFinanceprecheckResponse>(DoRequest("1.0", "antchain.ato.trade.financeprecheck.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 融资订单追加预审资金方
         * Summary: 融资订单追加预审资金方
         */
        public async Task<AddAntchainAtoTradeFinanceprecheckResponse> AddAntchainAtoTradeFinanceprecheckExAsync(AddAntchainAtoTradeFinanceprecheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntchainAtoTradeFinanceprecheckResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.financeprecheck.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单融资信息查询接口
         * Summary: 订单融资信息查询接口
         */
        public GetAntchainAtoTradeOrderfinanceinfoResponse GetAntchainAtoTradeOrderfinanceinfo(GetAntchainAtoTradeOrderfinanceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoTradeOrderfinanceinfoEx(request, headers, runtime);
        }

        /**
         * Description: 订单融资信息查询接口
         * Summary: 订单融资信息查询接口
         */
        public async Task<GetAntchainAtoTradeOrderfinanceinfoResponse> GetAntchainAtoTradeOrderfinanceinfoAsync(GetAntchainAtoTradeOrderfinanceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoTradeOrderfinanceinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单融资信息查询接口
         * Summary: 订单融资信息查询接口
         */
        public GetAntchainAtoTradeOrderfinanceinfoResponse GetAntchainAtoTradeOrderfinanceinfoEx(GetAntchainAtoTradeOrderfinanceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeOrderfinanceinfoResponse>(DoRequest("1.0", "antchain.ato.trade.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单融资信息查询接口
         * Summary: 订单融资信息查询接口
         */
        public async Task<GetAntchainAtoTradeOrderfinanceinfoResponse> GetAntchainAtoTradeOrderfinanceinfoExAsync(GetAntchainAtoTradeOrderfinanceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeOrderfinanceinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询订单融资信息
         * Summary: 资方查询订单融资信息
         */
        public GetAntchainAtoFundOrderfinanceinfoResponse GetAntchainAtoFundOrderfinanceinfo(GetAntchainAtoFundOrderfinanceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundOrderfinanceinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资方查询订单融资信息
         * Summary: 资方查询订单融资信息
         */
        public async Task<GetAntchainAtoFundOrderfinanceinfoResponse> GetAntchainAtoFundOrderfinanceinfoAsync(GetAntchainAtoFundOrderfinanceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundOrderfinanceinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方查询订单融资信息
         * Summary: 资方查询订单融资信息
         */
        public GetAntchainAtoFundOrderfinanceinfoResponse GetAntchainAtoFundOrderfinanceinfoEx(GetAntchainAtoFundOrderfinanceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundOrderfinanceinfoResponse>(DoRequest("1.0", "antchain.ato.fund.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方查询订单融资信息
         * Summary: 资方查询订单融资信息
         */
        public async Task<GetAntchainAtoFundOrderfinanceinfoResponse> GetAntchainAtoFundOrderfinanceinfoExAsync(GetAntchainAtoFundOrderfinanceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundOrderfinanceinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.orderfinanceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单代扣计划延期
         * Summary: 订单代扣计划延期
         */
        public SyncAntchainAtoTradeUserpromisedelayResponse SyncAntchainAtoTradeUserpromisedelay(SyncAntchainAtoTradeUserpromisedelayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoTradeUserpromisedelayEx(request, headers, runtime);
        }

        /**
         * Description: 订单代扣计划延期
         * Summary: 订单代扣计划延期
         */
        public async Task<SyncAntchainAtoTradeUserpromisedelayResponse> SyncAntchainAtoTradeUserpromisedelayAsync(SyncAntchainAtoTradeUserpromisedelayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoTradeUserpromisedelayExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单代扣计划延期
         * Summary: 订单代扣计划延期
         */
        public SyncAntchainAtoTradeUserpromisedelayResponse SyncAntchainAtoTradeUserpromisedelayEx(SyncAntchainAtoTradeUserpromisedelayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeUserpromisedelayResponse>(DoRequest("1.0", "antchain.ato.trade.userpromisedelay.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单代扣计划延期
         * Summary: 订单代扣计划延期
         */
        public async Task<SyncAntchainAtoTradeUserpromisedelayResponse> SyncAntchainAtoTradeUserpromisedelayExAsync(SyncAntchainAtoTradeUserpromisedelayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeUserpromisedelayResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromisedelay.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单代扣计划暂停
         * Summary: 订单代扣计划暂停
         */
        public PauseAntchainAtoTradeUserpromiseResponse PauseAntchainAtoTradeUserpromise(PauseAntchainAtoTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PauseAntchainAtoTradeUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 订单代扣计划暂停
         * Summary: 订单代扣计划暂停
         */
        public async Task<PauseAntchainAtoTradeUserpromiseResponse> PauseAntchainAtoTradeUserpromiseAsync(PauseAntchainAtoTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PauseAntchainAtoTradeUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单代扣计划暂停
         * Summary: 订单代扣计划暂停
         */
        public PauseAntchainAtoTradeUserpromiseResponse PauseAntchainAtoTradeUserpromiseEx(PauseAntchainAtoTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseAntchainAtoTradeUserpromiseResponse>(DoRequest("1.0", "antchain.ato.trade.userpromise.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单代扣计划暂停
         * Summary: 订单代扣计划暂停
         */
        public async Task<PauseAntchainAtoTradeUserpromiseResponse> PauseAntchainAtoTradeUserpromiseExAsync(PauseAntchainAtoTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PauseAntchainAtoTradeUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromise.pause", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划重启
         * Summary: 代扣计划重启
         */
        public ResumeAntchainAtoTradeUserpromiseResponse ResumeAntchainAtoTradeUserpromise(ResumeAntchainAtoTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeAntchainAtoTradeUserpromiseEx(request, headers, runtime);
        }

        /**
         * Description: 代扣计划重启
         * Summary: 代扣计划重启
         */
        public async Task<ResumeAntchainAtoTradeUserpromiseResponse> ResumeAntchainAtoTradeUserpromiseAsync(ResumeAntchainAtoTradeUserpromiseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeAntchainAtoTradeUserpromiseExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣计划重启
         * Summary: 代扣计划重启
         */
        public ResumeAntchainAtoTradeUserpromiseResponse ResumeAntchainAtoTradeUserpromiseEx(ResumeAntchainAtoTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeAntchainAtoTradeUserpromiseResponse>(DoRequest("1.0", "antchain.ato.trade.userpromise.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣计划重启
         * Summary: 代扣计划重启
         */
        public async Task<ResumeAntchainAtoTradeUserpromiseResponse> ResumeAntchainAtoTradeUserpromiseExAsync(ResumeAntchainAtoTradeUserpromiseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeAntchainAtoTradeUserpromiseResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.userpromise.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public AddAntchainAtoMerchantexpandDividerelationResponse AddAntchainAtoMerchantexpandDividerelation(AddAntchainAtoMerchantexpandDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAntchainAtoMerchantexpandDividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public async Task<AddAntchainAtoMerchantexpandDividerelationResponse> AddAntchainAtoMerchantexpandDividerelationAsync(AddAntchainAtoMerchantexpandDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAntchainAtoMerchantexpandDividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public AddAntchainAtoMerchantexpandDividerelationResponse AddAntchainAtoMerchantexpandDividerelationEx(AddAntchainAtoMerchantexpandDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntchainAtoMerchantexpandDividerelationResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.dividerelation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加分账绑定关系
         * Summary: 添加分账绑定关系
         */
        public async Task<AddAntchainAtoMerchantexpandDividerelationResponse> AddAntchainAtoMerchantexpandDividerelationExAsync(AddAntchainAtoMerchantexpandDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntchainAtoMerchantexpandDividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.dividerelation.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public QueryAntchainAtoMerchantexpandDividerelationResponse QueryAntchainAtoMerchantexpandDividerelation(QueryAntchainAtoMerchantexpandDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoMerchantexpandDividerelationEx(request, headers, runtime);
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public async Task<QueryAntchainAtoMerchantexpandDividerelationResponse> QueryAntchainAtoMerchantexpandDividerelationAsync(QueryAntchainAtoMerchantexpandDividerelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoMerchantexpandDividerelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public QueryAntchainAtoMerchantexpandDividerelationResponse QueryAntchainAtoMerchantexpandDividerelationEx(QueryAntchainAtoMerchantexpandDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoMerchantexpandDividerelationResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.dividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账绑定关系查询
         * Summary: 分账绑定关系查询
         */
        public async Task<QueryAntchainAtoMerchantexpandDividerelationResponse> QueryAntchainAtoMerchantexpandDividerelationExAsync(QueryAntchainAtoMerchantexpandDividerelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoMerchantexpandDividerelationResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.dividerelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同模板制作根据已有模板新增合同模板文件
         * Summary: 根据已有模板新增合同模板文件
         */
        public AddAntchainAtoInnerTemplateResponse AddAntchainAtoInnerTemplate(AddAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAntchainAtoInnerTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 合同模板制作根据已有模板新增合同模板文件
         * Summary: 根据已有模板新增合同模板文件
         */
        public async Task<AddAntchainAtoInnerTemplateResponse> AddAntchainAtoInnerTemplateAsync(AddAntchainAtoInnerTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAntchainAtoInnerTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同模板制作根据已有模板新增合同模板文件
         * Summary: 根据已有模板新增合同模板文件
         */
        public AddAntchainAtoInnerTemplateResponse AddAntchainAtoInnerTemplateEx(AddAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntchainAtoInnerTemplateResponse>(DoRequest("1.0", "antchain.ato.inner.template.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同模板制作根据已有模板新增合同模板文件
         * Summary: 根据已有模板新增合同模板文件
         */
        public async Task<AddAntchainAtoInnerTemplateResponse> AddAntchainAtoInnerTemplateExAsync(AddAntchainAtoInnerTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntchainAtoInnerTemplateResponse>(await DoRequestAsync("1.0", "antchain.ato.inner.template.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
         * Summary: 用信申请接口
         */
        public ApplyAntchainAtoFundCreditutilizationResponse ApplyAntchainAtoFundCreditutilization(ApplyAntchainAtoFundCreditutilizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAntchainAtoFundCreditutilizationEx(request, headers, runtime);
        }

        /**
         * Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
         * Summary: 用信申请接口
         */
        public async Task<ApplyAntchainAtoFundCreditutilizationResponse> ApplyAntchainAtoFundCreditutilizationAsync(ApplyAntchainAtoFundCreditutilizationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAntchainAtoFundCreditutilizationExAsync(request, headers, runtime);
        }

        /**
         * Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
         * Summary: 用信申请接口
         */
        public ApplyAntchainAtoFundCreditutilizationResponse ApplyAntchainAtoFundCreditutilizationEx(ApplyAntchainAtoFundCreditutilizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntchainAtoFundCreditutilizationResponse>(DoRequest("1.0", "antchain.ato.fund.creditutilization.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ● 本接口获取用信授权
        ● 本接口返回成功后，仅代表用信申请成功；不代表订单融资发起申请成功，融资申请结果通过异步消息通知
         * Summary: 用信申请接口
         */
        public async Task<ApplyAntchainAtoFundCreditutilizationResponse> ApplyAntchainAtoFundCreditutilizationExAsync(ApplyAntchainAtoFundCreditutilizationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntchainAtoFundCreditutilizationResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditutilization.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
         * Summary: 授信结果同步接口
         */
        public SyncAntchainAtoFundCreditgrantingResponse SyncAntchainAtoFundCreditgranting(SyncAntchainAtoFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoFundCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
         * Summary: 授信结果同步接口
         */
        public async Task<SyncAntchainAtoFundCreditgrantingResponse> SyncAntchainAtoFundCreditgrantingAsync(SyncAntchainAtoFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoFundCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
         * Summary: 授信结果同步接口
         */
        public SyncAntchainAtoFundCreditgrantingResponse SyncAntchainAtoFundCreditgrantingEx(SyncAntchainAtoFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.fund.creditgranting.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        ● 本接口用于授信额度试算完成后同步授信结果。
         * Summary: 授信结果同步接口
         */
        public async Task<SyncAntchainAtoFundCreditgrantingResponse> SyncAntchainAtoFundCreditgrantingExAsync(SyncAntchainAtoFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoFundCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditgranting.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
         * Summary: 授信授权申请接口
         */
        public AuthAntchainAtoFundCreditgrantingResponse AuthAntchainAtoFundCreditgranting(AuthAntchainAtoFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthAntchainAtoFundCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
         * Summary: 授信授权申请接口
         */
        public async Task<AuthAntchainAtoFundCreditgrantingResponse> AuthAntchainAtoFundCreditgrantingAsync(AuthAntchainAtoFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthAntchainAtoFundCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
         * Summary: 授信授权申请接口
         */
        public AuthAntchainAtoFundCreditgrantingResponse AuthAntchainAtoFundCreditgrantingEx(AuthAntchainAtoFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainAtoFundCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.fund.creditgranting.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于授信授权。本接口返回成功后，代表授权申请已发起。如果授权通过，会发送异步通知。
         * Summary: 授信授权申请接口
         */
        public async Task<AuthAntchainAtoFundCreditgrantingResponse> AuthAntchainAtoFundCreditgrantingExAsync(AuthAntchainAtoFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainAtoFundCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditgranting.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于查询授信结果
         * Summary: 授信结果查询
         */
        public QueryAntchainAtoFundCreditgrantingResponse QueryAntchainAtoFundCreditgranting(QueryAntchainAtoFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoFundCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 本接口用于查询授信结果
         * Summary: 授信结果查询
         */
        public async Task<QueryAntchainAtoFundCreditgrantingResponse> QueryAntchainAtoFundCreditgrantingAsync(QueryAntchainAtoFundCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoFundCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 本接口用于查询授信结果
         * Summary: 授信结果查询
         */
        public QueryAntchainAtoFundCreditgrantingResponse QueryAntchainAtoFundCreditgrantingEx(QueryAntchainAtoFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoFundCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.fund.creditgranting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 本接口用于查询授信结果
         * Summary: 授信结果查询
         */
        public async Task<QueryAntchainAtoFundCreditgrantingResponse> QueryAntchainAtoFundCreditgrantingExAsync(QueryAntchainAtoFundCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoFundCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.creditgranting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产包详情查询
         * Summary: 资产包详情查询
         */
        public QueryAntchainAtoFundAssetpackageResponse QueryAntchainAtoFundAssetpackage(QueryAntchainAtoFundAssetpackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoFundAssetpackageEx(request, headers, runtime);
        }

        /**
         * Description: 资产包详情查询
         * Summary: 资产包详情查询
         */
        public async Task<QueryAntchainAtoFundAssetpackageResponse> QueryAntchainAtoFundAssetpackageAsync(QueryAntchainAtoFundAssetpackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoFundAssetpackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产包详情查询
         * Summary: 资产包详情查询
         */
        public QueryAntchainAtoFundAssetpackageResponse QueryAntchainAtoFundAssetpackageEx(QueryAntchainAtoFundAssetpackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoFundAssetpackageResponse>(DoRequest("1.0", "antchain.ato.fund.assetpackage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产包详情查询
         * Summary: 资产包详情查询
         */
        public async Task<QueryAntchainAtoFundAssetpackageResponse> QueryAntchainAtoFundAssetpackageExAsync(QueryAntchainAtoFundAssetpackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoFundAssetpackageResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.assetpackage.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
         * Summary: 商户履约其他方式还款（单期取消）
         */
        public RepayAntchainAtoFundPlanResponse RepayAntchainAtoFundPlan(RepayAntchainAtoFundPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayAntchainAtoFundPlanEx(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
         * Summary: 商户履约其他方式还款（单期取消）
         */
        public async Task<RepayAntchainAtoFundPlanResponse> RepayAntchainAtoFundPlanAsync(RepayAntchainAtoFundPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayAntchainAtoFundPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
         * Summary: 商户履约其他方式还款（单期取消）
         */
        public RepayAntchainAtoFundPlanResponse RepayAntchainAtoFundPlanEx(RepayAntchainAtoFundPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayAntchainAtoFundPlanResponse>(DoRequest("1.0", "antchain.ato.fund.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用说明：
        1. 当商户通过其他方式还款后，通过次接口同步信息，同步完成后会将扣款进行取消
         * Summary: 商户履约其他方式还款（单期取消）
         */
        public async Task<RepayAntchainAtoFundPlanResponse> RepayAntchainAtoFundPlanExAsync(RepayAntchainAtoFundPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayAntchainAtoFundPlanResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.plan.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方代偿签约链接获取
         * Summary: 资方代偿签约链接获取
         */
        public GetAntchainAtoFundCompensatesignurlResponse GetAntchainAtoFundCompensatesignurl(GetAntchainAtoFundCompensatesignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoFundCompensatesignurlEx(request, headers, runtime);
        }

        /**
         * Description: 资方代偿签约链接获取
         * Summary: 资方代偿签约链接获取
         */
        public async Task<GetAntchainAtoFundCompensatesignurlResponse> GetAntchainAtoFundCompensatesignurlAsync(GetAntchainAtoFundCompensatesignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoFundCompensatesignurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方代偿签约链接获取
         * Summary: 资方代偿签约链接获取
         */
        public GetAntchainAtoFundCompensatesignurlResponse GetAntchainAtoFundCompensatesignurlEx(GetAntchainAtoFundCompensatesignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundCompensatesignurlResponse>(DoRequest("1.0", "antchain.ato.fund.compensatesignurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方代偿签约链接获取
         * Summary: 资方代偿签约链接获取
         */
        public async Task<GetAntchainAtoFundCompensatesignurlResponse> GetAntchainAtoFundCompensatesignurlExAsync(GetAntchainAtoFundCompensatesignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoFundCompensatesignurlResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.compensatesignurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转账代偿签约结果确认
         * Summary: 转账代偿签约结果确认
         */
        public ConfirmAntchainAtoFundCompensateResponse ConfirmAntchainAtoFundCompensate(ConfirmAntchainAtoFundCompensateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmAntchainAtoFundCompensateEx(request, headers, runtime);
        }

        /**
         * Description: 转账代偿签约结果确认
         * Summary: 转账代偿签约结果确认
         */
        public async Task<ConfirmAntchainAtoFundCompensateResponse> ConfirmAntchainAtoFundCompensateAsync(ConfirmAntchainAtoFundCompensateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmAntchainAtoFundCompensateExAsync(request, headers, runtime);
        }

        /**
         * Description: 转账代偿签约结果确认
         * Summary: 转账代偿签约结果确认
         */
        public ConfirmAntchainAtoFundCompensateResponse ConfirmAntchainAtoFundCompensateEx(ConfirmAntchainAtoFundCompensateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmAntchainAtoFundCompensateResponse>(DoRequest("1.0", "antchain.ato.fund.compensate.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转账代偿签约结果确认
         * Summary: 转账代偿签约结果确认
         */
        public async Task<ConfirmAntchainAtoFundCompensateResponse> ConfirmAntchainAtoFundCompensateExAsync(ConfirmAntchainAtoFundCompensateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmAntchainAtoFundCompensateResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.compensate.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试pending状态的代扣计划
         * Summary: 重试pending状态的代扣计划
         */
        public RetryAntchainAtoWithholdPlanpendingResponse RetryAntchainAtoWithholdPlanpending(RetryAntchainAtoWithholdPlanpendingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryAntchainAtoWithholdPlanpendingEx(request, headers, runtime);
        }

        /**
         * Description: 重试pending状态的代扣计划
         * Summary: 重试pending状态的代扣计划
         */
        public async Task<RetryAntchainAtoWithholdPlanpendingResponse> RetryAntchainAtoWithholdPlanpendingAsync(RetryAntchainAtoWithholdPlanpendingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryAntchainAtoWithholdPlanpendingExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试pending状态的代扣计划
         * Summary: 重试pending状态的代扣计划
         */
        public RetryAntchainAtoWithholdPlanpendingResponse RetryAntchainAtoWithholdPlanpendingEx(RetryAntchainAtoWithholdPlanpendingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAntchainAtoWithholdPlanpendingResponse>(DoRequest("1.0", "antchain.ato.withhold.planpending.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试pending状态的代扣计划
         * Summary: 重试pending状态的代扣计划
         */
        public async Task<RetryAntchainAtoWithholdPlanpendingResponse> RetryAntchainAtoWithholdPlanpendingExAsync(RetryAntchainAtoWithholdPlanpendingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAntchainAtoWithholdPlanpendingResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.planpending.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账pending重试
         * Summary: 分账pending重试
         */
        public RetryAntchainAtoWithholdDividependingResponse RetryAntchainAtoWithholdDividepending(RetryAntchainAtoWithholdDividependingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryAntchainAtoWithholdDividependingEx(request, headers, runtime);
        }

        /**
         * Description: 分账pending重试
         * Summary: 分账pending重试
         */
        public async Task<RetryAntchainAtoWithholdDividependingResponse> RetryAntchainAtoWithholdDividependingAsync(RetryAntchainAtoWithholdDividependingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryAntchainAtoWithholdDividependingExAsync(request, headers, runtime);
        }

        /**
         * Description: 分账pending重试
         * Summary: 分账pending重试
         */
        public RetryAntchainAtoWithholdDividependingResponse RetryAntchainAtoWithholdDividependingEx(RetryAntchainAtoWithholdDividependingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAntchainAtoWithholdDividependingResponse>(DoRequest("1.0", "antchain.ato.withhold.dividepending.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分账pending重试
         * Summary: 分账pending重试
         */
        public async Task<RetryAntchainAtoWithholdDividependingResponse> RetryAntchainAtoWithholdDividependingExAsync(RetryAntchainAtoWithholdDividependingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAntchainAtoWithholdDividependingResponse>(await DoRequestAsync("1.0", "antchain.ato.withhold.dividepending.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单信息同步
         * Summary: 订单信息同步
         */
        public SyncAntchainAtoTradePromoorderinfoResponse SyncAntchainAtoTradePromoorderinfo(SyncAntchainAtoTradePromoorderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoTradePromoorderinfoEx(request, headers, runtime);
        }

        /**
         * Description: 订单信息同步
         * Summary: 订单信息同步
         */
        public async Task<SyncAntchainAtoTradePromoorderinfoResponse> SyncAntchainAtoTradePromoorderinfoAsync(SyncAntchainAtoTradePromoorderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoTradePromoorderinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单信息同步
         * Summary: 订单信息同步
         */
        public SyncAntchainAtoTradePromoorderinfoResponse SyncAntchainAtoTradePromoorderinfoEx(SyncAntchainAtoTradePromoorderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradePromoorderinfoResponse>(DoRequest("1.0", "antchain.ato.trade.promoorderinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单信息同步
         * Summary: 订单信息同步
         */
        public async Task<SyncAntchainAtoTradePromoorderinfoResponse> SyncAntchainAtoTradePromoorderinfoExAsync(SyncAntchainAtoTradePromoorderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradePromoorderinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.promoorderinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 二级户进件绑定结算卡信息
         * Summary: 二级户进件绑定结算卡信息
         */
        public BindAntchainAtoMerchantexpandSettlecardResponse BindAntchainAtoMerchantexpandSettlecard(BindAntchainAtoMerchantexpandSettlecardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAntchainAtoMerchantexpandSettlecardEx(request, headers, runtime);
        }

        /**
         * Description: 二级户进件绑定结算卡信息
         * Summary: 二级户进件绑定结算卡信息
         */
        public async Task<BindAntchainAtoMerchantexpandSettlecardResponse> BindAntchainAtoMerchantexpandSettlecardAsync(BindAntchainAtoMerchantexpandSettlecardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAntchainAtoMerchantexpandSettlecardExAsync(request, headers, runtime);
        }

        /**
         * Description: 二级户进件绑定结算卡信息
         * Summary: 二级户进件绑定结算卡信息
         */
        public BindAntchainAtoMerchantexpandSettlecardResponse BindAntchainAtoMerchantexpandSettlecardEx(BindAntchainAtoMerchantexpandSettlecardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAntchainAtoMerchantexpandSettlecardResponse>(DoRequest("1.0", "antchain.ato.merchantexpand.settlecard.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 二级户进件绑定结算卡信息
         * Summary: 二级户进件绑定结算卡信息
         */
        public async Task<BindAntchainAtoMerchantexpandSettlecardResponse> BindAntchainAtoMerchantexpandSettlecardExAsync(BindAntchainAtoMerchantexpandSettlecardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAntchainAtoMerchantexpandSettlecardResponse>(await DoRequestAsync("1.0", "antchain.ato.merchantexpand.settlecard.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产订单同步
         * Summary: 资产订单同步
         */
        public SyncAntchainAtoTradeReceiptorderfullinfoResponse SyncAntchainAtoTradeReceiptorderfullinfo(SyncAntchainAtoTradeReceiptorderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainAtoTradeReceiptorderfullinfoEx(request, headers, runtime);
        }

        /**
         * Description: 资产订单同步
         * Summary: 资产订单同步
         */
        public async Task<SyncAntchainAtoTradeReceiptorderfullinfoResponse> SyncAntchainAtoTradeReceiptorderfullinfoAsync(SyncAntchainAtoTradeReceiptorderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainAtoTradeReceiptorderfullinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 资产订单同步
         * Summary: 资产订单同步
         */
        public SyncAntchainAtoTradeReceiptorderfullinfoResponse SyncAntchainAtoTradeReceiptorderfullinfoEx(SyncAntchainAtoTradeReceiptorderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeReceiptorderfullinfoResponse>(DoRequest("1.0", "antchain.ato.trade.receiptorderfullinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资产订单同步
         * Summary: 资产订单同步
         */
        public async Task<SyncAntchainAtoTradeReceiptorderfullinfoResponse> SyncAntchainAtoTradeReceiptorderfullinfoExAsync(SyncAntchainAtoTradeReceiptorderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainAtoTradeReceiptorderfullinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.receiptorderfullinfo.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单信息查询（新）
         * Summary: 订单获取
         */
        public GetAntchainAtoTradeOrderfullinfoResponse GetAntchainAtoTradeOrderfullinfo(GetAntchainAtoTradeOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainAtoTradeOrderfullinfoEx(request, headers, runtime);
        }

        /**
         * Description: 订单信息查询（新）
         * Summary: 订单获取
         */
        public async Task<GetAntchainAtoTradeOrderfullinfoResponse> GetAntchainAtoTradeOrderfullinfoAsync(GetAntchainAtoTradeOrderfullinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainAtoTradeOrderfullinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单信息查询（新）
         * Summary: 订单获取
         */
        public GetAntchainAtoTradeOrderfullinfoResponse GetAntchainAtoTradeOrderfullinfoEx(GetAntchainAtoTradeOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeOrderfullinfoResponse>(DoRequest("1.0", "antchain.ato.trade.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单信息查询（新）
         * Summary: 订单获取
         */
        public async Task<GetAntchainAtoTradeOrderfullinfoResponse> GetAntchainAtoTradeOrderfullinfoExAsync(GetAntchainAtoTradeOrderfullinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainAtoTradeOrderfullinfoResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.orderfullinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方提交合同签署
         * Summary: 资方提交合同签署
         */
        public SubmitAntchainAtoFundFlowResponse SubmitAntchainAtoFundFlow(SubmitAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAntchainAtoFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方提交合同签署
         * Summary: 资方提交合同签署
         */
        public async Task<SubmitAntchainAtoFundFlowResponse> SubmitAntchainAtoFundFlowAsync(SubmitAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAntchainAtoFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方提交合同签署
         * Summary: 资方提交合同签署
         */
        public SubmitAntchainAtoFundFlowResponse SubmitAntchainAtoFundFlowEx(SubmitAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainAtoFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方提交合同签署
         * Summary: 资方提交合同签署
         */
        public async Task<SubmitAntchainAtoFundFlowResponse> SubmitAntchainAtoFundFlowExAsync(SubmitAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainAtoFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方合同流程撤销
         * Summary: 资方合同流程撤销
         */
        public CancelAntchainAtoFundFlowResponse CancelAntchainAtoFundFlow(CancelAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAntchainAtoFundFlowEx(request, headers, runtime);
        }

        /**
         * Description: 资方合同流程撤销
         * Summary: 资方合同流程撤销
         */
        public async Task<CancelAntchainAtoFundFlowResponse> CancelAntchainAtoFundFlowAsync(CancelAntchainAtoFundFlowRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAntchainAtoFundFlowExAsync(request, headers, runtime);
        }

        /**
         * Description: 资方合同流程撤销
         * Summary: 资方合同流程撤销
         */
        public CancelAntchainAtoFundFlowResponse CancelAntchainAtoFundFlowEx(CancelAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoFundFlowResponse>(DoRequest("1.0", "antchain.ato.fund.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资方合同流程撤销
         * Summary: 资方合同流程撤销
         */
        public async Task<CancelAntchainAtoFundFlowResponse> CancelAntchainAtoFundFlowExAsync(CancelAntchainAtoFundFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainAtoFundFlowResponse>(await DoRequestAsync("1.0", "antchain.ato.fund.flow.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交授信申请
         * Summary: 提交授信申请
         */
        public ApplyAntchainAtoTradeCreditgrantingResponse ApplyAntchainAtoTradeCreditgranting(ApplyAntchainAtoTradeCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAntchainAtoTradeCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 提交授信申请
         * Summary: 提交授信申请
         */
        public async Task<ApplyAntchainAtoTradeCreditgrantingResponse> ApplyAntchainAtoTradeCreditgrantingAsync(ApplyAntchainAtoTradeCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAntchainAtoTradeCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交授信申请
         * Summary: 提交授信申请
         */
        public ApplyAntchainAtoTradeCreditgrantingResponse ApplyAntchainAtoTradeCreditgrantingEx(ApplyAntchainAtoTradeCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntchainAtoTradeCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.trade.creditgranting.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交授信申请
         * Summary: 提交授信申请
         */
        public async Task<ApplyAntchainAtoTradeCreditgrantingResponse> ApplyAntchainAtoTradeCreditgrantingExAsync(ApplyAntchainAtoTradeCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntchainAtoTradeCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.creditgranting.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授信信息查询
         * Summary: 授信信息查询
         */
        public QueryAntchainAtoTradeCreditgrantingResponse QueryAntchainAtoTradeCreditgranting(QueryAntchainAtoTradeCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainAtoTradeCreditgrantingEx(request, headers, runtime);
        }

        /**
         * Description: 授信信息查询
         * Summary: 授信信息查询
         */
        public async Task<QueryAntchainAtoTradeCreditgrantingResponse> QueryAntchainAtoTradeCreditgrantingAsync(QueryAntchainAtoTradeCreditgrantingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainAtoTradeCreditgrantingExAsync(request, headers, runtime);
        }

        /**
         * Description: 授信信息查询
         * Summary: 授信信息查询
         */
        public QueryAntchainAtoTradeCreditgrantingResponse QueryAntchainAtoTradeCreditgrantingEx(QueryAntchainAtoTradeCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoTradeCreditgrantingResponse>(DoRequest("1.0", "antchain.ato.trade.creditgranting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授信信息查询
         * Summary: 授信信息查询
         */
        public async Task<QueryAntchainAtoTradeCreditgrantingResponse> QueryAntchainAtoTradeCreditgrantingExAsync(QueryAntchainAtoTradeCreditgrantingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainAtoTradeCreditgrantingResponse>(await DoRequestAsync("1.0", "antchain.ato.trade.creditgranting.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
