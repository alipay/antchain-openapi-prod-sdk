// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.GOODSCHAIN.Models;

namespace AntChain.SDK.GOODSCHAIN
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
                        {"sdk_version", "1.0.4"},
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
                        {"sdk_version", "1.0.4"},
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
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public CreateLeagueResponse CreateLeague(CreateLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeagueEx(request, headers, runtime);
        }

        /**
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public async Task<CreateLeagueResponse> CreateLeagueAsync(CreateLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeagueExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public CreateLeagueResponse CreateLeagueEx(CreateLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeagueResponse>(DoRequest("1.0", "antchain.goodschain.league.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public async Task<CreateLeagueResponse> CreateLeagueExAsync(CreateLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeagueResponse>(await DoRequestAsync("1.0", "antchain.goodschain.league.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注销联盟
         * Summary: 注销联盟
         */
        public CancelLeagueResponse CancelLeague(CancelLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelLeagueEx(request, headers, runtime);
        }

        /**
         * Description: 注销联盟
         * Summary: 注销联盟
         */
        public async Task<CancelLeagueResponse> CancelLeagueAsync(CancelLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelLeagueExAsync(request, headers, runtime);
        }

        /**
         * Description: 注销联盟
         * Summary: 注销联盟
         */
        public CancelLeagueResponse CancelLeagueEx(CancelLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelLeagueResponse>(DoRequest("1.0", "antchain.goodschain.league.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注销联盟
         * Summary: 注销联盟
         */
        public async Task<CancelLeagueResponse> CancelLeagueExAsync(CancelLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelLeagueResponse>(await DoRequestAsync("1.0", "antchain.goodschain.league.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建用户
         * Summary: 创建用户
         */
        public CreateUserResponse CreateUser(CreateUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUserEx(request, headers, runtime);
        }

        /**
         * Description: 创建用户
         * Summary: 创建用户
         */
        public async Task<CreateUserResponse> CreateUserAsync(CreateUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建用户
         * Summary: 创建用户
         */
        public CreateUserResponse CreateUserEx(CreateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserResponse>(DoRequest("1.0", "antchain.goodschain.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建用户
         * Summary: 创建用户
         */
        public async Task<CreateUserResponse> CreateUserExAsync(CreateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserResponse>(await DoRequestAsync("1.0", "antchain.goodschain.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新用户
         * Summary: 更新用户
         */
        public UpdateUserResponse UpdateUser(UpdateUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUserEx(request, headers, runtime);
        }

        /**
         * Description: 更新用户
         * Summary: 更新用户
         */
        public async Task<UpdateUserResponse> UpdateUserAsync(UpdateUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新用户
         * Summary: 更新用户
         */
        public UpdateUserResponse UpdateUserEx(UpdateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUserResponse>(DoRequest("1.0", "antchain.goodschain.user.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新用户
         * Summary: 更新用户
         */
        public async Task<UpdateUserResponse> UpdateUserExAsync(UpdateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUserResponse>(await DoRequestAsync("1.0", "antchain.goodschain.user.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渠道用户绑定
         * Summary: 渠道用户绑定
         */
        public BindUserResponse BindUser(BindUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindUserEx(request, headers, runtime);
        }

        /**
         * Description: 渠道用户绑定
         * Summary: 渠道用户绑定
         */
        public async Task<BindUserResponse> BindUserAsync(BindUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 渠道用户绑定
         * Summary: 渠道用户绑定
         */
        public BindUserResponse BindUserEx(BindUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindUserResponse>(DoRequest("1.0", "antchain.goodschain.user.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渠道用户绑定
         * Summary: 渠道用户绑定
         */
        public async Task<BindUserResponse> BindUserExAsync(BindUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindUserResponse>(await DoRequestAsync("1.0", "antchain.goodschain.user.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渠道用户解绑
         * Summary: 渠道用户解绑
         */
        public UnbindUserResponse UnbindUser(UnbindUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindUserEx(request, headers, runtime);
        }

        /**
         * Description: 渠道用户解绑
         * Summary: 渠道用户解绑
         */
        public async Task<UnbindUserResponse> UnbindUserAsync(UnbindUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 渠道用户解绑
         * Summary: 渠道用户解绑
         */
        public UnbindUserResponse UnbindUserEx(UnbindUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindUserResponse>(DoRequest("1.0", "antchain.goodschain.user.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渠道用户解绑
         * Summary: 渠道用户解绑
         */
        public async Task<UnbindUserResponse> UnbindUserExAsync(UnbindUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindUserResponse>(await DoRequestAsync("1.0", "antchain.goodschain.user.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品模版定义
         * Summary: 链上商品模版定义
         */
        public CreateGoodstemplateResponse CreateGoodstemplate(CreateGoodstemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateGoodstemplateEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品模版定义
         * Summary: 链上商品模版定义
         */
        public async Task<CreateGoodstemplateResponse> CreateGoodstemplateAsync(CreateGoodstemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateGoodstemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品模版定义
         * Summary: 链上商品模版定义
         */
        public CreateGoodstemplateResponse CreateGoodstemplateEx(CreateGoodstemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGoodstemplateResponse>(DoRequest("1.0", "antchain.goodschain.goodstemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品模版定义
         * Summary: 链上商品模版定义
         */
        public async Task<CreateGoodstemplateResponse> CreateGoodstemplateExAsync(CreateGoodstemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGoodstemplateResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goodstemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品模版更新
         * Summary: 链上商品模版更新
         */
        public UpdateGoodstemplateResponse UpdateGoodstemplate(UpdateGoodstemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGoodstemplateEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品模版更新
         * Summary: 链上商品模版更新
         */
        public async Task<UpdateGoodstemplateResponse> UpdateGoodstemplateAsync(UpdateGoodstemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGoodstemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品模版更新
         * Summary: 链上商品模版更新
         */
        public UpdateGoodstemplateResponse UpdateGoodstemplateEx(UpdateGoodstemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGoodstemplateResponse>(DoRequest("1.0", "antchain.goodschain.goodstemplate.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品模版更新
         * Summary: 链上商品模版更新
         */
        public async Task<UpdateGoodstemplateResponse> UpdateGoodstemplateExAsync(UpdateGoodstemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGoodstemplateResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goodstemplate.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品模版注销
         * Summary: 链上商品模版注销
         */
        public CancelGoodstemplateResponse CancelGoodstemplate(CancelGoodstemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelGoodstemplateEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品模版注销
         * Summary: 链上商品模版注销
         */
        public async Task<CancelGoodstemplateResponse> CancelGoodstemplateAsync(CancelGoodstemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelGoodstemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品模版注销
         * Summary: 链上商品模版注销
         */
        public CancelGoodstemplateResponse CancelGoodstemplateEx(CancelGoodstemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelGoodstemplateResponse>(DoRequest("1.0", "antchain.goodschain.goodstemplate.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品模版注销
         * Summary: 链上商品模版注销
         */
        public async Task<CancelGoodstemplateResponse> CancelGoodstemplateExAsync(CancelGoodstemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelGoodstemplateResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goodstemplate.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品模版查询
         * Summary: 链上商品模版查询
         */
        public QueryGoodstemplateResponse QueryGoodstemplate(QueryGoodstemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGoodstemplateEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品模版查询
         * Summary: 链上商品模版查询
         */
        public async Task<QueryGoodstemplateResponse> QueryGoodstemplateAsync(QueryGoodstemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGoodstemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品模版查询
         * Summary: 链上商品模版查询
         */
        public QueryGoodstemplateResponse QueryGoodstemplateEx(QueryGoodstemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGoodstemplateResponse>(DoRequest("1.0", "antchain.goodschain.goodstemplate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品模版查询
         * Summary: 链上商品模版查询
         */
        public async Task<QueryGoodstemplateResponse> QueryGoodstemplateExAsync(QueryGoodstemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGoodstemplateResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goodstemplate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品发行
         * Summary: 链上商品发行
         */
        public CreateGoodsResponse CreateGoods(CreateGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品发行
         * Summary: 链上商品发行
         */
        public async Task<CreateGoodsResponse> CreateGoodsAsync(CreateGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品发行
         * Summary: 链上商品发行
         */
        public CreateGoodsResponse CreateGoodsEx(CreateGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGoodsResponse>(DoRequest("1.0", "antchain.goodschain.goods.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品发行
         * Summary: 链上商品发行
         */
        public async Task<CreateGoodsResponse> CreateGoodsExAsync(CreateGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGoodsResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goods.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品更新
         * Summary: 链上商品更新
         */
        public UpdateGoodsResponse UpdateGoods(UpdateGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品更新
         * Summary: 链上商品更新
         */
        public async Task<UpdateGoodsResponse> UpdateGoodsAsync(UpdateGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品更新
         * Summary: 链上商品更新
         */
        public UpdateGoodsResponse UpdateGoodsEx(UpdateGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGoodsResponse>(DoRequest("1.0", "antchain.goodschain.goods.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品更新
         * Summary: 链上商品更新
         */
        public async Task<UpdateGoodsResponse> UpdateGoodsExAsync(UpdateGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGoodsResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goods.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品转增
         * Summary: 链上商品转增
         */
        public SendGoodsResponse SendGoods(SendGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品转增
         * Summary: 链上商品转增
         */
        public async Task<SendGoodsResponse> SendGoodsAsync(SendGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品转增
         * Summary: 链上商品转增
         */
        public SendGoodsResponse SendGoodsEx(SendGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendGoodsResponse>(DoRequest("1.0", "antchain.goodschain.goods.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品转增
         * Summary: 链上商品转增
         */
        public async Task<SendGoodsResponse> SendGoodsExAsync(SendGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendGoodsResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goods.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品详情查询
         * Summary: 链上商品详情查询
         */
        public QueryGoodsResponse QueryGoods(QueryGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品详情查询
         * Summary: 链上商品详情查询
         */
        public async Task<QueryGoodsResponse> QueryGoodsAsync(QueryGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品详情查询
         * Summary: 链上商品详情查询
         */
        public QueryGoodsResponse QueryGoodsEx(QueryGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGoodsResponse>(DoRequest("1.0", "antchain.goodschain.goods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品详情查询
         * Summary: 链上商品详情查询
         */
        public async Task<QueryGoodsResponse> QueryGoodsExAsync(QueryGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGoodsResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品列表查询
         * Summary: 链上商品列表查询
         */
        public PagequeryGoodsResponse PagequeryGoods(PagequeryGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 链上商品列表查询
         * Summary: 链上商品列表查询
         */
        public async Task<PagequeryGoodsResponse> PagequeryGoodsAsync(PagequeryGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上商品列表查询
         * Summary: 链上商品列表查询
         */
        public PagequeryGoodsResponse PagequeryGoodsEx(PagequeryGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryGoodsResponse>(DoRequest("1.0", "antchain.goodschain.goods.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上商品列表查询
         * Summary: 链上商品列表查询
         */
        public async Task<PagequeryGoodsResponse> PagequeryGoodsExAsync(PagequeryGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryGoodsResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goods.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自定义链上商品操作节点
         * Summary: 自定义链上商品操作节点
         */
        public CreateGoodsOperateResponse CreateGoodsOperate(CreateGoodsOperateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateGoodsOperateEx(request, headers, runtime);
        }

        /**
         * Description: 自定义链上商品操作节点
         * Summary: 自定义链上商品操作节点
         */
        public async Task<CreateGoodsOperateResponse> CreateGoodsOperateAsync(CreateGoodsOperateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateGoodsOperateExAsync(request, headers, runtime);
        }

        /**
         * Description: 自定义链上商品操作节点
         * Summary: 自定义链上商品操作节点
         */
        public CreateGoodsOperateResponse CreateGoodsOperateEx(CreateGoodsOperateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGoodsOperateResponse>(DoRequest("1.0", "antchain.goodschain.goods.operate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自定义链上商品操作节点
         * Summary: 自定义链上商品操作节点
         */
        public async Task<CreateGoodsOperateResponse> CreateGoodsOperateExAsync(CreateGoodsOperateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGoodsOperateResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goods.operate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品交收核销
         * Summary: 商品交收核销
         */
        public CancelGoodsResponse CancelGoods(CancelGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 商品交收核销
         * Summary: 商品交收核销
         */
        public async Task<CancelGoodsResponse> CancelGoodsAsync(CancelGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品交收核销
         * Summary: 商品交收核销
         */
        public CancelGoodsResponse CancelGoodsEx(CancelGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelGoodsResponse>(DoRequest("1.0", "antchain.goodschain.goods.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品交收核销
         * Summary: 商品交收核销
         */
        public async Task<CancelGoodsResponse> CancelGoodsExAsync(CancelGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelGoodsResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goods.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品异常处置
         * Summary: 商品异常处置
         */
        public DisableGoodsResponse DisableGoods(DisableGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableGoodsEx(request, headers, runtime);
        }

        /**
         * Description: 商品异常处置
         * Summary: 商品异常处置
         */
        public async Task<DisableGoodsResponse> DisableGoodsAsync(DisableGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品异常处置
         * Summary: 商品异常处置
         */
        public DisableGoodsResponse DisableGoodsEx(DisableGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableGoodsResponse>(DoRequest("1.0", "antchain.goodschain.goods.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品异常处置
         * Summary: 商品异常处置
         */
        public async Task<DisableGoodsResponse> DisableGoodsExAsync(DisableGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableGoodsResponse>(await DoRequestAsync("1.0", "antchain.goodschain.goods.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取健康码、核酸、疫苗、行程码等信息
         * Summary: 获取健康码、核酸、疫苗、行程码等信息
         */
        public GetHealthcodeResponse GetHealthcode(GetHealthcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetHealthcodeEx(request, headers, runtime);
        }

        /**
         * Description: 获取健康码、核酸、疫苗、行程码等信息
         * Summary: 获取健康码、核酸、疫苗、行程码等信息
         */
        public async Task<GetHealthcodeResponse> GetHealthcodeAsync(GetHealthcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetHealthcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取健康码、核酸、疫苗、行程码等信息
         * Summary: 获取健康码、核酸、疫苗、行程码等信息
         */
        public GetHealthcodeResponse GetHealthcodeEx(GetHealthcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetHealthcodeResponse>(DoRequest("1.0", "antchain.goodschain.healthcode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取健康码、核酸、疫苗、行程码等信息
         * Summary: 获取健康码、核酸、疫苗、行程码等信息
         */
        public async Task<GetHealthcodeResponse> GetHealthcodeExAsync(GetHealthcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetHealthcodeResponse>(await DoRequestAsync("1.0", "antchain.goodschain.healthcode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
