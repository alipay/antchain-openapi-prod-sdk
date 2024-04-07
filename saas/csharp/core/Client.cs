// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.SAAS.Models;

namespace AntChain.SDK.SAAS
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
                        {"sdk_version", "1.1.30"},
                        {"_prod_code", "SAAS"},
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
                        {"sdk_version", "1.1.30"},
                        {"_prod_code", "SAAS"},
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
         * Description: SaaS服务调用
         * Summary: SaaS服务调用
         */
        public RunMarketServiceResponse RunMarketService(RunMarketServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunMarketServiceEx(request, headers, runtime);
        }

        /**
         * Description: SaaS服务调用
         * Summary: SaaS服务调用
         */
        public async Task<RunMarketServiceResponse> RunMarketServiceAsync(RunMarketServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunMarketServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: SaaS服务调用
         * Summary: SaaS服务调用
         */
        public RunMarketServiceResponse RunMarketServiceEx(RunMarketServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunMarketServiceResponse>(DoRequest("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: SaaS服务调用
         * Summary: SaaS服务调用
         */
        public async Task<RunMarketServiceResponse> RunMarketServiceExAsync(RunMarketServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunMarketServiceResponse>(await DoRequestAsync("1.0", "antchain.saas.market.service.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解决方案，包括能力列表
         * Summary: 查询解决方案，包括能力列表
         */
        public QueryMarketSolutionResponse QueryMarketSolution(QueryMarketSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMarketSolutionEx(request, headers, runtime);
        }

        /**
         * Description: 查询解决方案，包括能力列表
         * Summary: 查询解决方案，包括能力列表
         */
        public async Task<QueryMarketSolutionResponse> QueryMarketSolutionAsync(QueryMarketSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMarketSolutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询解决方案，包括能力列表
         * Summary: 查询解决方案，包括能力列表
         */
        public QueryMarketSolutionResponse QueryMarketSolutionEx(QueryMarketSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMarketSolutionResponse>(DoRequest("1.0", "antchain.saas.market.solution.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解决方案，包括能力列表
         * Summary: 查询解决方案，包括能力列表
         */
        public async Task<QueryMarketSolutionResponse> QueryMarketSolutionExAsync(QueryMarketSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMarketSolutionResponse>(await DoRequestAsync("1.0", "antchain.saas.market.solution.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询本产品下所有的能力标签
         * Summary: 查询本产品下所有的能力标签
         */
        public QueryAbilityWithproductResponse QueryAbilityWithproduct(QueryAbilityWithproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAbilityWithproductEx(request, headers, runtime);
        }

        /**
         * Description: 查询本产品下所有的能力标签
         * Summary: 查询本产品下所有的能力标签
         */
        public async Task<QueryAbilityWithproductResponse> QueryAbilityWithproductAsync(QueryAbilityWithproductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAbilityWithproductExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询本产品下所有的能力标签
         * Summary: 查询本产品下所有的能力标签
         */
        public QueryAbilityWithproductResponse QueryAbilityWithproductEx(QueryAbilityWithproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbilityWithproductResponse>(DoRequest("1.0", "antchain.saas.ability.withproduct.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询本产品下所有的能力标签
         * Summary: 查询本产品下所有的能力标签
         */
        public async Task<QueryAbilityWithproductResponse> QueryAbilityWithproductExAsync(QueryAbilityWithproductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbilityWithproductResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.withproduct.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询能力数据
         * Summary: 分页查询能力数据
         */
        public PagequeryAbilityResponse PagequeryAbility(PagequeryAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryAbilityEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询能力数据
         * Summary: 分页查询能力数据
         */
        public async Task<PagequeryAbilityResponse> PagequeryAbilityAsync(PagequeryAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryAbilityExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询能力数据
         * Summary: 分页查询能力数据
         */
        public PagequeryAbilityResponse PagequeryAbilityEx(PagequeryAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAbilityResponse>(DoRequest("1.0", "antchain.saas.ability.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询能力数据
         * Summary: 分页查询能力数据
         */
        public async Task<PagequeryAbilityResponse> PagequeryAbilityExAsync(PagequeryAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAbilityResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定API
         * Summary: 绑定能力与API关系
         */
        public BindAbilityResponse BindAbility(BindAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAbilityEx(request, headers, runtime);
        }

        /**
         * Description: 绑定API
         * Summary: 绑定能力与API关系
         */
        public async Task<BindAbilityResponse> BindAbilityAsync(BindAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAbilityExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定API
         * Summary: 绑定能力与API关系
         */
        public BindAbilityResponse BindAbilityEx(BindAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAbilityResponse>(DoRequest("1.0", "antchain.saas.ability.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定API
         * Summary: 绑定能力与API关系
         */
        public async Task<BindAbilityResponse> BindAbilityExAsync(BindAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAbilityResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据api名称列表查询能力标签列表
         * Summary: 根据api名称列表查询能力标签列表
         */
        public QueryAbilityWithapinameResponse QueryAbilityWithapiname(QueryAbilityWithapinameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAbilityWithapinameEx(request, headers, runtime);
        }

        /**
         * Description: 根据api名称列表查询能力标签列表
         * Summary: 根据api名称列表查询能力标签列表
         */
        public async Task<QueryAbilityWithapinameResponse> QueryAbilityWithapinameAsync(QueryAbilityWithapinameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAbilityWithapinameExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据api名称列表查询能力标签列表
         * Summary: 根据api名称列表查询能力标签列表
         */
        public QueryAbilityWithapinameResponse QueryAbilityWithapinameEx(QueryAbilityWithapinameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbilityWithapinameResponse>(DoRequest("1.0", "antchain.saas.ability.withapiname.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据api名称列表查询能力标签列表
         * Summary: 根据api名称列表查询能力标签列表
         */
        public async Task<QueryAbilityWithapinameResponse> QueryAbilityWithapinameExAsync(QueryAbilityWithapinameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbilityWithapinameResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.withapiname.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api上线回调接口
         * Summary: api上线回调接口
         */
        public CallbackAbilityResponse CallbackAbility(CallbackAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackAbilityEx(request, headers, runtime);
        }

        /**
         * Description: api上线回调接口
         * Summary: api上线回调接口
         */
        public async Task<CallbackAbilityResponse> CallbackAbilityAsync(CallbackAbilityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackAbilityExAsync(request, headers, runtime);
        }

        /**
         * Description: api上线回调接口
         * Summary: api上线回调接口
         */
        public CallbackAbilityResponse CallbackAbilityEx(CallbackAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAbilityResponse>(DoRequest("1.0", "antchain.saas.ability.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api上线回调接口
         * Summary: api上线回调接口
         */
        public async Task<CallbackAbilityResponse> CallbackAbilityExAsync(CallbackAbilityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackAbilityResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据产品码+api code查询api protobuf信息
         * Summary: 查询api protobuf信息（勿删）
         */
        public QueryFoundationProtobufResponse QueryFoundationProtobuf(QueryFoundationProtobufRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFoundationProtobufEx(request, headers, runtime);
        }

        /**
         * Description: 根据产品码+api code查询api protobuf信息
         * Summary: 查询api protobuf信息（勿删）
         */
        public async Task<QueryFoundationProtobufResponse> QueryFoundationProtobufAsync(QueryFoundationProtobufRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFoundationProtobufExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据产品码+api code查询api protobuf信息
         * Summary: 查询api protobuf信息（勿删）
         */
        public QueryFoundationProtobufResponse QueryFoundationProtobufEx(QueryFoundationProtobufRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFoundationProtobufResponse>(DoRequest("1.0", "antchain.saas.foundation.protobuf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据产品码+api code查询api protobuf信息
         * Summary: 查询api protobuf信息（勿删）
         */
        public async Task<QueryFoundationProtobufResponse> QueryFoundationProtobufExAsync(QueryFoundationProtobufRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFoundationProtobufResponse>(await DoRequestAsync("1.0", "antchain.saas.foundation.protobuf.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试网关结果码和计量接口
         * Summary: 网关结果码测试接口
         */
        public QueryAbilityResultcodeResponse QueryAbilityResultcode(QueryAbilityResultcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAbilityResultcodeEx(request, headers, runtime);
        }

        /**
         * Description: 测试网关结果码和计量接口
         * Summary: 网关结果码测试接口
         */
        public async Task<QueryAbilityResultcodeResponse> QueryAbilityResultcodeAsync(QueryAbilityResultcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAbilityResultcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 测试网关结果码和计量接口
         * Summary: 网关结果码测试接口
         */
        public QueryAbilityResultcodeResponse QueryAbilityResultcodeEx(QueryAbilityResultcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbilityResultcodeResponse>(DoRequest("1.0", "antchain.saas.ability.resultcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 测试网关结果码和计量接口
         * Summary: 网关结果码测试接口
         */
        public async Task<QueryAbilityResultcodeResponse> QueryAbilityResultcodeExAsync(QueryAbilityResultcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbilityResultcodeResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.resultcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定能力的api信息
         * Summary: 绑定能力的api信息
         */
        public BindAbilityApiResponse BindAbilityApi(BindAbilityApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAbilityApiEx(request, headers, runtime);
        }

        /**
         * Description: 绑定能力的api信息
         * Summary: 绑定能力的api信息
         */
        public async Task<BindAbilityApiResponse> BindAbilityApiAsync(BindAbilityApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAbilityApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定能力的api信息
         * Summary: 绑定能力的api信息
         */
        public BindAbilityApiResponse BindAbilityApiEx(BindAbilityApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAbilityApiResponse>(DoRequest("1.0", "antchain.saas.ability.api.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定能力的api信息
         * Summary: 绑定能力的api信息
         */
        public async Task<BindAbilityApiResponse> BindAbilityApiExAsync(BindAbilityApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAbilityApiResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.api.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据能力id查询能力信息
         * Summary: 根据能力id查询能力信息
         */
        public QueryAbilityBusinesscodeResponse QueryAbilityBusinesscode(QueryAbilityBusinesscodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAbilityBusinesscodeEx(request, headers, runtime);
        }

        /**
         * Description: 根据能力id查询能力信息
         * Summary: 根据能力id查询能力信息
         */
        public async Task<QueryAbilityBusinesscodeResponse> QueryAbilityBusinesscodeAsync(QueryAbilityBusinesscodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAbilityBusinesscodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据能力id查询能力信息
         * Summary: 根据能力id查询能力信息
         */
        public QueryAbilityBusinesscodeResponse QueryAbilityBusinesscodeEx(QueryAbilityBusinesscodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbilityBusinesscodeResponse>(DoRequest("1.0", "antchain.saas.ability.businesscode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据能力id查询能力信息
         * Summary: 根据能力id查询能力信息
         */
        public async Task<QueryAbilityBusinesscodeResponse> QueryAbilityBusinesscodeExAsync(QueryAbilityBusinesscodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAbilityBusinesscodeResponse>(await DoRequestAsync("1.0", "antchain.saas.ability.businesscode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商业编码查询sdk依赖和api信息
         * Summary: 根据商业编码查询sdk依赖和api信息
         */
        public QueryBusinessProductResponse QueryBusinessProduct(QueryBusinessProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBusinessProductEx(request, headers, runtime);
        }

        /**
         * Description: 根据商业编码查询sdk依赖和api信息
         * Summary: 根据商业编码查询sdk依赖和api信息
         */
        public async Task<QueryBusinessProductResponse> QueryBusinessProductAsync(QueryBusinessProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBusinessProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据商业编码查询sdk依赖和api信息
         * Summary: 根据商业编码查询sdk依赖和api信息
         */
        public QueryBusinessProductResponse QueryBusinessProductEx(QueryBusinessProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessProductResponse>(DoRequest("1.0", "antchain.saas.business.product.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据商业编码查询sdk依赖和api信息
         * Summary: 根据商业编码查询sdk依赖和api信息
         */
        public async Task<QueryBusinessProductResponse> QueryBusinessProductExAsync(QueryBusinessProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessProductResponse>(await DoRequestAsync("1.0", "antchain.saas.business.product.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询计量规则信息
         * Summary: 查询计量规则信息
         */
        public QueryMeteringRuleResponse QueryMeteringRule(QueryMeteringRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeteringRuleEx(request, headers, runtime);
        }

        /**
         * Description: 查询计量规则信息
         * Summary: 查询计量规则信息
         */
        public async Task<QueryMeteringRuleResponse> QueryMeteringRuleAsync(QueryMeteringRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeteringRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询计量规则信息
         * Summary: 查询计量规则信息
         */
        public QueryMeteringRuleResponse QueryMeteringRuleEx(QueryMeteringRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeteringRuleResponse>(DoRequest("1.0", "antchain.saas.metering.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询计量规则信息
         * Summary: 查询计量规则信息
         */
        public async Task<QueryMeteringRuleResponse> QueryMeteringRuleExAsync(QueryMeteringRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeteringRuleResponse>(await DoRequestAsync("1.0", "antchain.saas.metering.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建计量规则
         * Summary: 创建计量规则
         */
        public CreateMeteringRuleResponse CreateMeteringRule(CreateMeteringRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMeteringRuleEx(request, headers, runtime);
        }

        /**
         * Description: 创建计量规则
         * Summary: 创建计量规则
         */
        public async Task<CreateMeteringRuleResponse> CreateMeteringRuleAsync(CreateMeteringRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMeteringRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建计量规则
         * Summary: 创建计量规则
         */
        public CreateMeteringRuleResponse CreateMeteringRuleEx(CreateMeteringRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMeteringRuleResponse>(DoRequest("1.0", "antchain.saas.metering.rule.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建计量规则
         * Summary: 创建计量规则
         */
        public async Task<CreateMeteringRuleResponse> CreateMeteringRuleExAsync(CreateMeteringRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMeteringRuleResponse>(await DoRequestAsync("1.0", "antchain.saas.metering.rule.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新计量规则信息
         * Summary: 更新计量规则信息
         */
        public UpdateMeteringRuleResponse UpdateMeteringRule(UpdateMeteringRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeteringRuleEx(request, headers, runtime);
        }

        /**
         * Description: 更新计量规则信息
         * Summary: 更新计量规则信息
         */
        public async Task<UpdateMeteringRuleResponse> UpdateMeteringRuleAsync(UpdateMeteringRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeteringRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新计量规则信息
         * Summary: 更新计量规则信息
         */
        public UpdateMeteringRuleResponse UpdateMeteringRuleEx(UpdateMeteringRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeteringRuleResponse>(DoRequest("1.0", "antchain.saas.metering.rule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新计量规则信息
         * Summary: 更新计量规则信息
         */
        public async Task<UpdateMeteringRuleResponse> UpdateMeteringRuleExAsync(UpdateMeteringRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeteringRuleResponse>(await DoRequestAsync("1.0", "antchain.saas.metering.rule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询计量项信息
         * Summary: 查询计量项信息
         */
        public QueryMeteringItemResponse QueryMeteringItem(QueryMeteringItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeteringItemEx(request, headers, runtime);
        }

        /**
         * Description: 查询计量项信息
         * Summary: 查询计量项信息
         */
        public async Task<QueryMeteringItemResponse> QueryMeteringItemAsync(QueryMeteringItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeteringItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询计量项信息
         * Summary: 查询计量项信息
         */
        public QueryMeteringItemResponse QueryMeteringItemEx(QueryMeteringItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeteringItemResponse>(DoRequest("1.0", "antchain.saas.metering.item.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询计量项信息
         * Summary: 查询计量项信息
         */
        public async Task<QueryMeteringItemResponse> QueryMeteringItemExAsync(QueryMeteringItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeteringItemResponse>(await DoRequestAsync("1.0", "antchain.saas.metering.item.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增计量项
         * Summary: 新增计量项
         */
        public CreateMeteringItemResponse CreateMeteringItem(CreateMeteringItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMeteringItemEx(request, headers, runtime);
        }

        /**
         * Description: 新增计量项
         * Summary: 新增计量项
         */
        public async Task<CreateMeteringItemResponse> CreateMeteringItemAsync(CreateMeteringItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMeteringItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增计量项
         * Summary: 新增计量项
         */
        public CreateMeteringItemResponse CreateMeteringItemEx(CreateMeteringItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMeteringItemResponse>(DoRequest("1.0", "antchain.saas.metering.item.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增计量项
         * Summary: 新增计量项
         */
        public async Task<CreateMeteringItemResponse> CreateMeteringItemExAsync(CreateMeteringItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMeteringItemResponse>(await DoRequestAsync("1.0", "antchain.saas.metering.item.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新计量规则
         * Summary: 更新计量规则
         */
        public UpdateMeteringItemResponse UpdateMeteringItem(UpdateMeteringItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMeteringItemEx(request, headers, runtime);
        }

        /**
         * Description: 更新计量规则
         * Summary: 更新计量规则
         */
        public async Task<UpdateMeteringItemResponse> UpdateMeteringItemAsync(UpdateMeteringItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMeteringItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新计量规则
         * Summary: 更新计量规则
         */
        public UpdateMeteringItemResponse UpdateMeteringItemEx(UpdateMeteringItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeteringItemResponse>(DoRequest("1.0", "antchain.saas.metering.item.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新计量规则
         * Summary: 更新计量规则
         */
        public async Task<UpdateMeteringItemResponse> UpdateMeteringItemExAsync(UpdateMeteringItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMeteringItemResponse>(await DoRequestAsync("1.0", "antchain.saas.metering.item.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
