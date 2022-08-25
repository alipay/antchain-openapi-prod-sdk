// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.BBP.Models;

namespace AntChain.SDK.BBP
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
                {"keepAliveDurationMillis", _keepAliveDurationMillis},
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
                        {"sdk_version", "1.7.30"},
                        {"_prod_code", "BBP"},
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
                {"keepAliveDurationMillis", _keepAliveDurationMillis},
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
                        {"sdk_version", "1.7.30"},
                        {"_prod_code", "BBP"},
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
         * Description: 对企业/个人进行身份认证
         * Summary: 统一客户认证接口
         */
        public AuthCustomerResponse AuthCustomer(AuthCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 对企业/个人进行身份认证
         * Summary: 统一客户认证接口
         */
        public async Task<AuthCustomerResponse> AuthCustomerAsync(AuthCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 对企业/个人进行身份认证
         * Summary: 统一客户认证接口
         */
        public AuthCustomerResponse AuthCustomerEx(AuthCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthCustomerResponse>(DoRequest("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对企业/个人进行身份认证
         * Summary: 统一客户认证接口
         */
        public async Task<AuthCustomerResponse> AuthCustomerExAsync(AuthCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthCustomerResponse>(await DoRequestAsync("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智科统一客户注册
         * Summary: 统一客户注册接口
         */
        public CreateCustomerResponse CreateCustomer(CreateCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 智科统一客户注册
         * Summary: 统一客户注册接口
         */
        public async Task<CreateCustomerResponse> CreateCustomerAsync(CreateCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 智科统一客户注册
         * Summary: 统一客户注册接口
         */
        public CreateCustomerResponse CreateCustomerEx(CreateCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCustomerResponse>(DoRequest("1.0", "antchain.bbp.customer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智科统一客户注册
         * Summary: 统一客户注册接口
         */
        public async Task<CreateCustomerResponse> CreateCustomerExAsync(CreateCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCustomerResponse>(await DoRequestAsync("1.0", "antchain.bbp.customer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户信息查询
         * Summary: 客户信息查询
         */
        public QueryCustomerResponse QueryCustomer(QueryCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 客户信息查询
         * Summary: 客户信息查询
         */
        public async Task<QueryCustomerResponse> QueryCustomerAsync(QueryCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 客户信息查询
         * Summary: 客户信息查询
         */
        public QueryCustomerResponse QueryCustomerEx(QueryCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerResponse>(DoRequest("1.0", "antchain.bbp.customer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户信息查询
         * Summary: 客户信息查询
         */
        public async Task<QueryCustomerResponse> QueryCustomerExAsync(QueryCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerResponse>(await DoRequestAsync("1.0", "antchain.bbp.customer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public InitVerifyResponse InitVerify(InitVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public async Task<InitVerifyResponse> InitVerifyAsync(InitVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public InitVerifyResponse InitVerifyEx(InitVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitVerifyResponse>(DoRequest("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public async Task<InitVerifyResponse> InitVerifyExAsync(InitVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitVerifyResponse>(await DoRequestAsync("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身产品渲染接口
         * Summary: 核身产品渲染接口
         */
        public StartVerifyResponse StartVerify(StartVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 核身产品渲染接口
         * Summary: 核身产品渲染接口
         */
        public async Task<StartVerifyResponse> StartVerifyAsync(StartVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 核身产品渲染接口
         * Summary: 核身产品渲染接口
         */
        public StartVerifyResponse StartVerifyEx(StartVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartVerifyResponse>(DoRequest("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身产品渲染接口
         * Summary: 核身产品渲染接口
         */
        public async Task<StartVerifyResponse> StartVerifyExAsync(StartVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartVerifyResponse>(await DoRequestAsync("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身结果查询
         * Summary: 核身结果查询
         */
        public CheckVerifyResponse CheckVerify(CheckVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 核身结果查询
         * Summary: 核身结果查询
         */
        public async Task<CheckVerifyResponse> CheckVerifyAsync(CheckVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 核身结果查询
         * Summary: 核身结果查询
         */
        public CheckVerifyResponse CheckVerifyEx(CheckVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckVerifyResponse>(DoRequest("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身结果查询
         * Summary: 核身结果查询
         */
        public async Task<CheckVerifyResponse> CheckVerifyExAsync(CheckVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckVerifyResponse>(await DoRequestAsync("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对企业身份进行认证
         * Summary: 企业四要素认证
         */
        public VerifyMetaResponse VerifyMeta(VerifyMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyMetaEx(request, headers, runtime);
        }

        /**
         * Description: 对企业身份进行认证
         * Summary: 企业四要素认证
         */
        public async Task<VerifyMetaResponse> VerifyMetaAsync(VerifyMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyMetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 对企业身份进行认证
         * Summary: 企业四要素认证
         */
        public VerifyMetaResponse VerifyMetaEx(VerifyMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyMetaResponse>(DoRequest("1.0", "antchain.bbp.meta.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对企业身份进行认证
         * Summary: 企业四要素认证
         */
        public async Task<VerifyMetaResponse> VerifyMetaExAsync(VerifyMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyMetaResponse>(await DoRequestAsync("1.0", "antchain.bbp.meta.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 经营信息查询
         * Summary: 经营信息查询
         */
        public QueryEnterpriseBusinessinfoResponse QueryEnterpriseBusinessinfo(QueryEnterpriseBusinessinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnterpriseBusinessinfoEx(request, headers, runtime);
        }

        /**
         * Description: 经营信息查询
         * Summary: 经营信息查询
         */
        public async Task<QueryEnterpriseBusinessinfoResponse> QueryEnterpriseBusinessinfoAsync(QueryEnterpriseBusinessinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnterpriseBusinessinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 经营信息查询
         * Summary: 经营信息查询
         */
        public QueryEnterpriseBusinessinfoResponse QueryEnterpriseBusinessinfoEx(QueryEnterpriseBusinessinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseBusinessinfoResponse>(DoRequest("1.0", "antchain.bbp.enterprise.businessinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 经营信息查询
         * Summary: 经营信息查询
         */
        public async Task<QueryEnterpriseBusinessinfoResponse> QueryEnterpriseBusinessinfoExAsync(QueryEnterpriseBusinessinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseBusinessinfoResponse>(await DoRequestAsync("1.0", "antchain.bbp.enterprise.businessinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 网关测试
         * Summary: 网关测试
         */
        public QueryGwtestResponse QueryGwtest(QueryGwtestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGwtestEx(request, headers, runtime);
        }

        /**
         * Description: 网关测试
         * Summary: 网关测试
         */
        public async Task<QueryGwtestResponse> QueryGwtestAsync(QueryGwtestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGwtestExAsync(request, headers, runtime);
        }

        /**
         * Description: 网关测试
         * Summary: 网关测试
         */
        public QueryGwtestResponse QueryGwtestEx(QueryGwtestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGwtestResponse>(DoRequest("1.0", "antchain.bbp.gwtest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 网关测试
         * Summary: 网关测试
         */
        public async Task<QueryGwtestResponse> QueryGwtestExAsync(QueryGwtestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGwtestResponse>(await DoRequestAsync("1.0", "antchain.bbp.gwtest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
         * Summary: 外包薪资规则合约发布接口
         */
        public ApplyContractRuleResponse ApplyContractRule(ApplyContractRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyContractRuleEx(request, headers, runtime);
        }

        /**
         * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
         * Summary: 外包薪资规则合约发布接口
         */
        public async Task<ApplyContractRuleResponse> ApplyContractRuleAsync(ApplyContractRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyContractRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
         * Summary: 外包薪资规则合约发布接口
         */
        public ApplyContractRuleResponse ApplyContractRuleEx(ApplyContractRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractRuleResponse>(DoRequest("1.0", "antchain.bbp.contract.rule.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 定义外包的薪资方案接口,以【服务商、项目类别、领域、角色、资质】为unique
         * Summary: 外包薪资规则合约发布接口
         */
        public async Task<ApplyContractRuleResponse> ApplyContractRuleExAsync(ApplyContractRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractRuleResponse>(await DoRequestAsync("1.0", "antchain.bbp.contract.rule.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用链上合约接口，查询外包的薪资方案
        
         * Summary: 外包薪资规则合约查询接口
         */
        public GetContractRuleResponse GetContractRule(GetContractRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractRuleEx(request, headers, runtime);
        }

        /**
         * Description: 调用链上合约接口，查询外包的薪资方案
        
         * Summary: 外包薪资规则合约查询接口
         */
        public async Task<GetContractRuleResponse> GetContractRuleAsync(GetContractRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用链上合约接口，查询外包的薪资方案
        
         * Summary: 外包薪资规则合约查询接口
         */
        public GetContractRuleResponse GetContractRuleEx(GetContractRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractRuleResponse>(DoRequest("1.0", "antchain.bbp.contract.rule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用链上合约接口，查询外包的薪资方案
        
         * Summary: 外包薪资规则合约查询接口
         */
        public async Task<GetContractRuleResponse> GetContractRuleExAsync(GetContractRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractRuleResponse>(await DoRequestAsync("1.0", "antchain.bbp.contract.rule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
         * Summary: 长城汽车的考勤信息上传接口
         */
        public UploadStaffAttendanceResponse UploadStaffAttendance(UploadStaffAttendanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadStaffAttendanceEx(request, headers, runtime);
        }

        /**
         * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
         * Summary: 长城汽车的考勤信息上传接口
         */
        public async Task<UploadStaffAttendanceResponse> UploadStaffAttendanceAsync(UploadStaffAttendanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadStaffAttendanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
         * Summary: 长城汽车的考勤信息上传接口
         */
        public UploadStaffAttendanceResponse UploadStaffAttendanceEx(UploadStaffAttendanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadStaffAttendanceResponse>(DoRequest("1.0", "antchain.bbp.staff.attendance.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于人的维度,支持批量接口上传，以{id,name,createDate,resultDate}。具体格式待商议
         * Summary: 长城汽车的考勤信息上传接口
         */
        public async Task<UploadStaffAttendanceResponse> UploadStaffAttendanceExAsync(UploadStaffAttendanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadStaffAttendanceResponse>(await DoRequestAsync("1.0", "antchain.bbp.staff.attendance.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于人的维度，入参：{用户id,考勤月份}
         * Summary: 长城汽车的考勤信息获取
         */
        public QueryStaffAttendanceResponse QueryStaffAttendance(QueryStaffAttendanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStaffAttendanceEx(request, headers, runtime);
        }

        /**
         * Description: 基于人的维度，入参：{用户id,考勤月份}
         * Summary: 长城汽车的考勤信息获取
         */
        public async Task<QueryStaffAttendanceResponse> QueryStaffAttendanceAsync(QueryStaffAttendanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStaffAttendanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于人的维度，入参：{用户id,考勤月份}
         * Summary: 长城汽车的考勤信息获取
         */
        public QueryStaffAttendanceResponse QueryStaffAttendanceEx(QueryStaffAttendanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStaffAttendanceResponse>(DoRequest("1.0", "antchain.bbp.staff.attendance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于人的维度，入参：{用户id,考勤月份}
         * Summary: 长城汽车的考勤信息获取
         */
        public async Task<QueryStaffAttendanceResponse> QueryStaffAttendanceExAsync(QueryStaffAttendanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStaffAttendanceResponse>(await DoRequestAsync("1.0", "antchain.bbp.staff.attendance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长城汽车的考核信息
         * Summary: 长城汽车的考核信息
         */
        public UploadStaffAssessmentResponse UploadStaffAssessment(UploadStaffAssessmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadStaffAssessmentEx(request, headers, runtime);
        }

        /**
         * Description: 长城汽车的考核信息
         * Summary: 长城汽车的考核信息
         */
        public async Task<UploadStaffAssessmentResponse> UploadStaffAssessmentAsync(UploadStaffAssessmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadStaffAssessmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 长城汽车的考核信息
         * Summary: 长城汽车的考核信息
         */
        public UploadStaffAssessmentResponse UploadStaffAssessmentEx(UploadStaffAssessmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadStaffAssessmentResponse>(DoRequest("1.0", "antchain.bbp.staff.assessment.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 长城汽车的考核信息
         * Summary: 长城汽车的考核信息
         */
        public async Task<UploadStaffAssessmentResponse> UploadStaffAssessmentExAsync(UploadStaffAssessmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadStaffAssessmentResponse>(await DoRequestAsync("1.0", "antchain.bbp.staff.assessment.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 考核信息查询
         * Summary: 考核信息查询
         */
        public QueryStaffAssessmentResponse QueryStaffAssessment(QueryStaffAssessmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStaffAssessmentEx(request, headers, runtime);
        }

        /**
         * Description: 考核信息查询
         * Summary: 考核信息查询
         */
        public async Task<QueryStaffAssessmentResponse> QueryStaffAssessmentAsync(QueryStaffAssessmentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStaffAssessmentExAsync(request, headers, runtime);
        }

        /**
         * Description: 考核信息查询
         * Summary: 考核信息查询
         */
        public QueryStaffAssessmentResponse QueryStaffAssessmentEx(QueryStaffAssessmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStaffAssessmentResponse>(DoRequest("1.0", "antchain.bbp.staff.assessment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 考核信息查询
         * Summary: 考核信息查询
         */
        public async Task<QueryStaffAssessmentResponse> QueryStaffAssessmentExAsync(QueryStaffAssessmentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStaffAssessmentResponse>(await DoRequestAsync("1.0", "antchain.bbp.staff.assessment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对账单执行
         * Summary: 对账单执行接口
         */
        public ExecContractReconciliationResponse ExecContractReconciliation(ExecContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractReconciliationEx(request, headers, runtime);
        }

        /**
         * Description: 对账单执行
         * Summary: 对账单执行接口
         */
        public async Task<ExecContractReconciliationResponse> ExecContractReconciliationAsync(ExecContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractReconciliationExAsync(request, headers, runtime);
        }

        /**
         * Description: 对账单执行
         * Summary: 对账单执行接口
         */
        public ExecContractReconciliationResponse ExecContractReconciliationEx(ExecContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractReconciliationResponse>(DoRequest("1.0", "antchain.bbp.contract.reconciliation.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对账单执行
         * Summary: 对账单执行接口
         */
        public async Task<ExecContractReconciliationResponse> ExecContractReconciliationExAsync(ExecContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractReconciliationResponse>(await DoRequestAsync("1.0", "antchain.bbp.contract.reconciliation.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 结算单确认
         * Summary: 结算单确认
         */
        public ConfirmContractReconciliationResponse ConfirmContractReconciliation(ConfirmContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmContractReconciliationEx(request, headers, runtime);
        }

        /**
         * Description: 结算单确认
         * Summary: 结算单确认
         */
        public async Task<ConfirmContractReconciliationResponse> ConfirmContractReconciliationAsync(ConfirmContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmContractReconciliationExAsync(request, headers, runtime);
        }

        /**
         * Description: 结算单确认
         * Summary: 结算单确认
         */
        public ConfirmContractReconciliationResponse ConfirmContractReconciliationEx(ConfirmContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmContractReconciliationResponse>(DoRequest("1.0", "antchain.bbp.contract.reconciliation.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 结算单确认
         * Summary: 结算单确认
         */
        public async Task<ConfirmContractReconciliationResponse> ConfirmContractReconciliationExAsync(ConfirmContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmContractReconciliationResponse>(await DoRequestAsync("1.0", "antchain.bbp.contract.reconciliation.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询结算单
         * Summary: 查询结算单
         */
        public QueryContractReconciliationResponse QueryContractReconciliation(QueryContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContractReconciliationEx(request, headers, runtime);
        }

        /**
         * Description: 查询结算单
         * Summary: 查询结算单
         */
        public async Task<QueryContractReconciliationResponse> QueryContractReconciliationAsync(QueryContractReconciliationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContractReconciliationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询结算单
         * Summary: 查询结算单
         */
        public QueryContractReconciliationResponse QueryContractReconciliationEx(QueryContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractReconciliationResponse>(DoRequest("1.0", "antchain.bbp.contract.reconciliation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询结算单
         * Summary: 查询结算单
         */
        public async Task<QueryContractReconciliationResponse> QueryContractReconciliationExAsync(QueryContractReconciliationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractReconciliationResponse>(await DoRequestAsync("1.0", "antchain.bbp.contract.reconciliation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DID创建及核验
         * Summary: DID创建及核验
         */
        public VerifyCustomerResponse VerifyCustomer(VerifyCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyCustomerEx(request, headers, runtime);
        }

        /**
         * Description: DID创建及核验
         * Summary: DID创建及核验
         */
        public async Task<VerifyCustomerResponse> VerifyCustomerAsync(VerifyCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: DID创建及核验
         * Summary: DID创建及核验
         */
        public VerifyCustomerResponse VerifyCustomerEx(VerifyCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyCustomerResponse>(DoRequest("1.0", "antchain.bbp.customer.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DID创建及核验
         * Summary: DID创建及核验
         */
        public async Task<VerifyCustomerResponse> VerifyCustomerExAsync(VerifyCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyCustomerResponse>(await DoRequestAsync("1.0", "antchain.bbp.customer.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份关联链上账户
         * Summary: 身份关联链上账户
         */
        public MatchDidAccountResponse MatchDidAccount(MatchDidAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MatchDidAccountEx(request, headers, runtime);
        }

        /**
         * Description: 身份关联链上账户
         * Summary: 身份关联链上账户
         */
        public async Task<MatchDidAccountResponse> MatchDidAccountAsync(MatchDidAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MatchDidAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 身份关联链上账户
         * Summary: 身份关联链上账户
         */
        public MatchDidAccountResponse MatchDidAccountEx(MatchDidAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchDidAccountResponse>(DoRequest("1.0", "antchain.bbp.did.account.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份关联链上账户
         * Summary: 身份关联链上账户
         */
        public async Task<MatchDidAccountResponse> MatchDidAccountExAsync(MatchDidAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchDidAccountResponse>(await DoRequestAsync("1.0", "antchain.bbp.did.account.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份关数字资产
         * Summary: 身份关数字资产
         */
        public MatchDidAssetsResponse MatchDidAssets(MatchDidAssetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MatchDidAssetsEx(request, headers, runtime);
        }

        /**
         * Description: 身份关数字资产
         * Summary: 身份关数字资产
         */
        public async Task<MatchDidAssetsResponse> MatchDidAssetsAsync(MatchDidAssetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MatchDidAssetsExAsync(request, headers, runtime);
        }

        /**
         * Description: 身份关数字资产
         * Summary: 身份关数字资产
         */
        public MatchDidAssetsResponse MatchDidAssetsEx(MatchDidAssetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchDidAssetsResponse>(DoRequest("1.0", "antchain.bbp.did.assets.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份关数字资产
         * Summary: 身份关数字资产
         */
        public async Task<MatchDidAssetsResponse> MatchDidAssetsExAsync(MatchDidAssetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchDidAssetsResponse>(await DoRequestAsync("1.0", "antchain.bbp.did.assets.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DID创建及核验
         * Summary: DID创建及核验
         */
        public CreateDidCustomerResponse CreateDidCustomer(CreateDidCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDidCustomerEx(request, headers, runtime);
        }

        /**
         * Description: DID创建及核验
         * Summary: DID创建及核验
         */
        public async Task<CreateDidCustomerResponse> CreateDidCustomerAsync(CreateDidCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDidCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: DID创建及核验
         * Summary: DID创建及核验
         */
        public CreateDidCustomerResponse CreateDidCustomerEx(CreateDidCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidCustomerResponse>(DoRequest("1.0", "antchain.bbp.did.customer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DID创建及核验
         * Summary: DID创建及核验
         */
        public async Task<CreateDidCustomerResponse> CreateDidCustomerExAsync(CreateDidCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidCustomerResponse>(await DoRequestAsync("1.0", "antchain.bbp.did.customer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业DID创建及核验
         * Summary: 企业DID创建及核验
         */
        public CreateDidEnterpriseResponse CreateDidEnterprise(CreateDidEnterpriseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDidEnterpriseEx(request, headers, runtime);
        }

        /**
         * Description: 企业DID创建及核验
         * Summary: 企业DID创建及核验
         */
        public async Task<CreateDidEnterpriseResponse> CreateDidEnterpriseAsync(CreateDidEnterpriseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDidEnterpriseExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业DID创建及核验
         * Summary: 企业DID创建及核验
         */
        public CreateDidEnterpriseResponse CreateDidEnterpriseEx(CreateDidEnterpriseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidEnterpriseResponse>(DoRequest("1.0", "antchain.bbp.did.enterprise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业DID创建及核验
         * Summary: 企业DID创建及核验
         */
        public async Task<CreateDidEnterpriseResponse> CreateDidEnterpriseExAsync(CreateDidEnterpriseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidEnterpriseResponse>(await DoRequestAsync("1.0", "antchain.bbp.did.enterprise.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 记录用户登录保司小程序信息
         * Summary: 用户登陆页面埋点
         */
        public InitInsuranceUserResponse InitInsuranceUser(InitInsuranceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitInsuranceUserEx(request, headers, runtime);
        }

        /**
         * Description: 记录用户登录保司小程序信息
         * Summary: 用户登陆页面埋点
         */
        public async Task<InitInsuranceUserResponse> InitInsuranceUserAsync(InitInsuranceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitInsuranceUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 记录用户登录保司小程序信息
         * Summary: 用户登陆页面埋点
         */
        public InitInsuranceUserResponse InitInsuranceUserEx(InitInsuranceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitInsuranceUserResponse>(DoRequest("1.0", "antchain.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 记录用户登录保司小程序信息
         * Summary: 用户登陆页面埋点
         */
        public async Task<InitInsuranceUserResponse> InitInsuranceUserExAsync(InitInsuranceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitInsuranceUserResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保司方获取授权信息
         * Summary: 获取授权信息
         */
        public QueryInsuranceResponse QueryInsurance(QueryInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 保司方获取授权信息
         * Summary: 获取授权信息
         */
        public async Task<QueryInsuranceResponse> QueryInsuranceAsync(QueryInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 保司方获取授权信息
         * Summary: 获取授权信息
         */
        public QueryInsuranceResponse QueryInsuranceEx(QueryInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceResponse>(DoRequest("1.0", "antchain.bbp.insurance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保司方获取授权信息
         * Summary: 获取授权信息
         */
        public async Task<QueryInsuranceResponse> QueryInsuranceExAsync(QueryInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单信息上链，保单信息同步
         * Summary: 保单信息上链
         */
        public OperateInsuranceResponse OperateInsurance(OperateInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 保单信息上链，保单信息同步
         * Summary: 保单信息上链
         */
        public async Task<OperateInsuranceResponse> OperateInsuranceAsync(OperateInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 保单信息上链，保单信息同步
         * Summary: 保单信息上链
         */
        public OperateInsuranceResponse OperateInsuranceEx(OperateInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInsuranceResponse>(DoRequest("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单信息上链，保单信息同步
         * Summary: 保单信息上链
         */
        public async Task<OperateInsuranceResponse> OperateInsuranceExAsync(OperateInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateInsuranceResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传保单附件至阿里云OSS
         * Summary: 上传保单附件
         */
        public UploadInsuranceResponse UploadInsurance(UploadInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 上传保单附件至阿里云OSS
         * Summary: 上传保单附件
         */
        public async Task<UploadInsuranceResponse> UploadInsuranceAsync(UploadInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传保单附件至阿里云OSS
         * Summary: 上传保单附件
         */
        public UploadInsuranceResponse UploadInsuranceEx(UploadInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.bbp.insurance.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadInsuranceResponse uploadInsuranceResponse = new UploadInsuranceResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadInsuranceResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadInsuranceResponse>(DoRequest("1.0", "antchain.bbp.insurance.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传保单附件至阿里云OSS
         * Summary: 上传保单附件
         */
        public async Task<UploadInsuranceResponse> UploadInsuranceExAsync(UploadInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "antchain.bbp.insurance.upload",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    UploadInsuranceResponse uploadInsuranceResponse = new UploadInsuranceResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return uploadInsuranceResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadInsuranceResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险理赔受理信息同步到蚂蚁链
         * Summary: 理赔受理上链
         */
        public SyncInsuranceResponse SyncInsurance(SyncInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 保险理赔受理信息同步到蚂蚁链
         * Summary: 理赔受理上链
         */
        public async Task<SyncInsuranceResponse> SyncInsuranceAsync(SyncInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险理赔受理信息同步到蚂蚁链
         * Summary: 理赔受理上链
         */
        public SyncInsuranceResponse SyncInsuranceEx(SyncInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInsuranceResponse>(DoRequest("1.0", "antchain.bbp.insurance.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险理赔受理信息同步到蚂蚁链
         * Summary: 理赔受理上链
         */
        public async Task<SyncInsuranceResponse> SyncInsuranceExAsync(SyncInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncInsuranceResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步用户退保信息上链
         * Summary: 保单退保接口
         */
        public CancelInsuranceResponse CancelInsurance(CancelInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 同步用户退保信息上链
         * Summary: 保单退保接口
         */
        public async Task<CancelInsuranceResponse> CancelInsuranceAsync(CancelInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步用户退保信息上链
         * Summary: 保单退保接口
         */
        public CancelInsuranceResponse CancelInsuranceEx(CancelInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelInsuranceResponse>(DoRequest("1.0", "antchain.bbp.insurance.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步用户退保信息上链
         * Summary: 保单退保接口
         */
        public async Task<CancelInsuranceResponse> CancelInsuranceExAsync(CancelInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelInsuranceResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户的数据库保单记录
         * Summary: 用户保单信息列表查询
         */
        public QueryInsuranceRecordsResponse QueryInsuranceRecords(QueryInsuranceRecordsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInsuranceRecordsEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户的数据库保单记录
         * Summary: 用户保单信息列表查询
         */
        public async Task<QueryInsuranceRecordsResponse> QueryInsuranceRecordsAsync(QueryInsuranceRecordsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInsuranceRecordsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户的数据库保单记录
         * Summary: 用户保单信息列表查询
         */
        public QueryInsuranceRecordsResponse QueryInsuranceRecordsEx(QueryInsuranceRecordsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceRecordsResponse>(DoRequest("1.0", "antchain.bbp.insurance.records.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户的数据库保单记录
         * Summary: 用户保单信息列表查询
         */
        public async Task<QueryInsuranceRecordsResponse> QueryInsuranceRecordsExAsync(QueryInsuranceRecordsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceRecordsResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.records.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单链上信息查询
         * Summary: 保单链上信息查询
         */
        public QueryInsuranceChainResponse QueryInsuranceChain(QueryInsuranceChainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryInsuranceChainEx(request, headers, runtime);
        }

        /**
         * Description: 保单链上信息查询
         * Summary: 保单链上信息查询
         */
        public async Task<QueryInsuranceChainResponse> QueryInsuranceChainAsync(QueryInsuranceChainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryInsuranceChainExAsync(request, headers, runtime);
        }

        /**
         * Description: 保单链上信息查询
         * Summary: 保单链上信息查询
         */
        public QueryInsuranceChainResponse QueryInsuranceChainEx(QueryInsuranceChainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceChainResponse>(DoRequest("1.0", "antchain.bbp.insurance.chain.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单链上信息查询
         * Summary: 保单链上信息查询
         */
        public async Task<QueryInsuranceChainResponse> QueryInsuranceChainExAsync(QueryInsuranceChainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryInsuranceChainResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.chain.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
