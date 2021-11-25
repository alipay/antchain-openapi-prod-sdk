// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.ACC.Models;

namespace AntChain.SDK.ACC
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
                        {"sdk_version", "1.1.51"},
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
                        {"sdk_version", "1.1.51"},
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
         * Description: 账密登录(PWD_LOGIN)
         * Summary: 账密登录
         */
        public VerifyUserPwdResponse VerifyUserPwd(VerifyUserPwdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyUserPwdEx(request, headers, runtime);
        }

        /**
         * Description: 账密登录(PWD_LOGIN)
         * Summary: 账密登录
         */
        public async Task<VerifyUserPwdResponse> VerifyUserPwdAsync(VerifyUserPwdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyUserPwdExAsync(request, headers, runtime);
        }

        /**
         * Description: 账密登录(PWD_LOGIN)
         * Summary: 账密登录
         */
        public VerifyUserPwdResponse VerifyUserPwdEx(VerifyUserPwdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyUserPwdResponse>(DoRequest("1.0", "antchain.acc.user.pwd.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账密登录(PWD_LOGIN)
         * Summary: 账密登录
         */
        public async Task<VerifyUserPwdResponse> VerifyUserPwdExAsync(VerifyUserPwdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyUserPwdResponse>(await DoRequestAsync("1.0", "antchain.acc.user.pwd.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 短信登录申请
         * Summary: 短信登录申请
         */
        public ApplyUserSmsResponse ApplyUserSms(ApplyUserSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyUserSmsEx(request, headers, runtime);
        }

        /**
         * Description: 短信登录申请
         * Summary: 短信登录申请
         */
        public async Task<ApplyUserSmsResponse> ApplyUserSmsAsync(ApplyUserSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyUserSmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 短信登录申请
         * Summary: 短信登录申请
         */
        public ApplyUserSmsResponse ApplyUserSmsEx(ApplyUserSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyUserSmsResponse>(DoRequest("1.0", "antchain.acc.user.sms.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 短信登录申请
         * Summary: 短信登录申请
         */
        public async Task<ApplyUserSmsResponse> ApplyUserSmsExAsync(ApplyUserSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyUserSmsResponse>(await DoRequestAsync("1.0", "antchain.acc.user.sms.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 短信登录
         * Summary: 短信登录
         */
        public VerifyUserSmsResponse VerifyUserSms(VerifyUserSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyUserSmsEx(request, headers, runtime);
        }

        /**
         * Description: 短信登录
         * Summary: 短信登录
         */
        public async Task<VerifyUserSmsResponse> VerifyUserSmsAsync(VerifyUserSmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyUserSmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 短信登录
         * Summary: 短信登录
         */
        public VerifyUserSmsResponse VerifyUserSmsEx(VerifyUserSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyUserSmsResponse>(DoRequest("1.0", "antchain.acc.user.sms.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 短信登录
         * Summary: 短信登录
         */
        public async Task<VerifyUserSmsResponse> VerifyUserSmsExAsync(VerifyUserSmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyUserSmsResponse>(await DoRequestAsync("1.0", "antchain.acc.user.sms.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关联登录
         * Summary: 关联登录
         */
        public AuthUserRefResponse AuthUserRef(AuthUserRefRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthUserRefEx(request, headers, runtime);
        }

        /**
         * Description: 关联登录
         * Summary: 关联登录
         */
        public async Task<AuthUserRefResponse> AuthUserRefAsync(AuthUserRefRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthUserRefExAsync(request, headers, runtime);
        }

        /**
         * Description: 关联登录
         * Summary: 关联登录
         */
        public AuthUserRefResponse AuthUserRefEx(AuthUserRefRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthUserRefResponse>(DoRequest("1.0", "antchain.acc.user.ref.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关联登录
         * Summary: 关联登录
         */
        public async Task<AuthUserRefResponse> AuthUserRefExAsync(AuthUserRefRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthUserRefResponse>(await DoRequestAsync("1.0", "antchain.acc.user.ref.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 退出登录
         * Summary: 退出登录
         */
        public CloseUserLoginResponse CloseUserLogin(CloseUserLoginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CloseUserLoginEx(request, headers, runtime);
        }

        /**
         * Description: 退出登录
         * Summary: 退出登录
         */
        public async Task<CloseUserLoginResponse> CloseUserLoginAsync(CloseUserLoginRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CloseUserLoginExAsync(request, headers, runtime);
        }

        /**
         * Description: 退出登录
         * Summary: 退出登录
         */
        public CloseUserLoginResponse CloseUserLoginEx(CloseUserLoginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseUserLoginResponse>(DoRequest("1.0", "antchain.acc.user.login.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 退出登录
         * Summary: 退出登录
         */
        public async Task<CloseUserLoginResponse> CloseUserLoginExAsync(CloseUserLoginRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CloseUserLoginResponse>(await DoRequestAsync("1.0", "antchain.acc.user.login.close", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户注册
         * Summary: 用户注册
         */
        public CreateUserResponse CreateUser(CreateUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUserEx(request, headers, runtime);
        }

        /**
         * Description: 用户注册
         * Summary: 用户注册
         */
        public async Task<CreateUserResponse> CreateUserAsync(CreateUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户注册
         * Summary: 用户注册
         */
        public CreateUserResponse CreateUserEx(CreateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserResponse>(DoRequest("1.0", "antchain.acc.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户注册
         * Summary: 用户注册
         */
        public async Task<CreateUserResponse> CreateUserExAsync(CreateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserResponse>(await DoRequestAsync("1.0", "antchain.acc.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户信息
         * Summary: 获取用户信息
         */
        public GetUserCurrentResponse GetUserCurrent(GetUserCurrentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUserCurrentEx(request, headers, runtime);
        }

        /**
         * Description: 获取用户信息
         * Summary: 获取用户信息
         */
        public async Task<GetUserCurrentResponse> GetUserCurrentAsync(GetUserCurrentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUserCurrentExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取用户信息
         * Summary: 获取用户信息
         */
        public GetUserCurrentResponse GetUserCurrentEx(GetUserCurrentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUserCurrentResponse>(DoRequest("1.0", "antchain.acc.user.current.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户信息
         * Summary: 获取用户信息
         */
        public async Task<GetUserCurrentResponse> GetUserCurrentExAsync(GetUserCurrentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUserCurrentResponse>(await DoRequestAsync("1.0", "antchain.acc.user.current.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证
         * Summary: 企业认证
         */
        public VerifyFirmResponse VerifyFirm(VerifyFirmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyFirmEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证
         * Summary: 企业认证
         */
        public async Task<VerifyFirmResponse> VerifyFirmAsync(VerifyFirmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyFirmExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证
         * Summary: 企业认证
         */
        public VerifyFirmResponse VerifyFirmEx(VerifyFirmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFirmResponse>(DoRequest("1.0", "antchain.acc.firm.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证
         * Summary: 企业认证
         */
        public async Task<VerifyFirmResponse> VerifyFirmExAsync(VerifyFirmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyFirmResponse>(await DoRequestAsync("1.0", "antchain.acc.firm.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人认证
         * Summary: 个人认证
         */
        public VerifyUserResponse VerifyUser(VerifyUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyUserEx(request, headers, runtime);
        }

        /**
         * Description: 个人认证
         * Summary: 个人认证
         */
        public async Task<VerifyUserResponse> VerifyUserAsync(VerifyUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人认证
         * Summary: 个人认证
         */
        public VerifyUserResponse VerifyUserEx(VerifyUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyUserResponse>(DoRequest("1.0", "antchain.acc.user.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人认证
         * Summary: 个人认证
         */
        public async Task<VerifyUserResponse> VerifyUserExAsync(VerifyUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyUserResponse>(await DoRequestAsync("1.0", "antchain.acc.user.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ocr_文件识别接口
         * Summary: ocr_文件识别接口
         */
        public RecognizeOcrFileResponse RecognizeOcrFile(RecognizeOcrFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeOcrFileEx(request, headers, runtime);
        }

        /**
         * Description: ocr_文件识别接口
         * Summary: ocr_文件识别接口
         */
        public async Task<RecognizeOcrFileResponse> RecognizeOcrFileAsync(RecognizeOcrFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeOcrFileExAsync(request, headers, runtime);
        }

        /**
         * Description: ocr_文件识别接口
         * Summary: ocr_文件识别接口
         */
        public RecognizeOcrFileResponse RecognizeOcrFileEx(RecognizeOcrFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeOcrFileResponse>(DoRequest("1.0", "antchain.acc.ocr.file.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ocr_文件识别接口
         * Summary: ocr_文件识别接口
         */
        public async Task<RecognizeOcrFileResponse> RecognizeOcrFileExAsync(RecognizeOcrFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeOcrFileResponse>(await DoRequestAsync("1.0", "antchain.acc.ocr.file.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入企业的四要素进行认证。
         * Summary: 企业四要素认证
         */
        public CertifyCertifyFirmmetaResponse CertifyCertifyFirmmeta(CertifyCertifyFirmmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyCertifyFirmmetaEx(request, headers, runtime);
        }

        /**
         * Description: 输入企业的四要素进行认证。
         * Summary: 企业四要素认证
         */
        public async Task<CertifyCertifyFirmmetaResponse> CertifyCertifyFirmmetaAsync(CertifyCertifyFirmmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyCertifyFirmmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入企业的四要素进行认证。
         * Summary: 企业四要素认证
         */
        public CertifyCertifyFirmmetaResponse CertifyCertifyFirmmetaEx(CertifyCertifyFirmmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyCertifyFirmmetaResponse>(DoRequest("1.0", "antchain.acc.certify.firmmeta.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入企业的四要素进行认证。
         * Summary: 企业四要素认证
         */
        public async Task<CertifyCertifyFirmmetaResponse> CertifyCertifyFirmmetaExAsync(CertifyCertifyFirmmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyCertifyFirmmetaResponse>(await DoRequestAsync("1.0", "antchain.acc.certify.firmmeta.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入个人的二要素进行认证。
         * Summary: 个人二要素认证
         */
        public CertifyCertifyPersonmetaResponse CertifyCertifyPersonmeta(CertifyCertifyPersonmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyCertifyPersonmetaEx(request, headers, runtime);
        }

        /**
         * Description: 输入个人的二要素进行认证。
         * Summary: 个人二要素认证
         */
        public async Task<CertifyCertifyPersonmetaResponse> CertifyCertifyPersonmetaAsync(CertifyCertifyPersonmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyCertifyPersonmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入个人的二要素进行认证。
         * Summary: 个人二要素认证
         */
        public CertifyCertifyPersonmetaResponse CertifyCertifyPersonmetaEx(CertifyCertifyPersonmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyCertifyPersonmetaResponse>(DoRequest("1.0", "antchain.acc.certify.personmeta.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入个人的二要素进行认证。
         * Summary: 个人二要素认证
         */
        public async Task<CertifyCertifyPersonmetaResponse> CertifyCertifyPersonmetaExAsync(CertifyCertifyPersonmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyCertifyPersonmetaResponse>(await DoRequestAsync("1.0", "antchain.acc.certify.personmeta.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸识别认证
         * Summary: 人脸识别认证
         */
        public CertifyCertifyFaceResponse CertifyCertifyFace(CertifyCertifyFaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyCertifyFaceEx(request, headers, runtime);
        }

        /**
         * Description: 人脸识别认证
         * Summary: 人脸识别认证
         */
        public async Task<CertifyCertifyFaceResponse> CertifyCertifyFaceAsync(CertifyCertifyFaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyCertifyFaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 人脸识别认证
         * Summary: 人脸识别认证
         */
        public CertifyCertifyFaceResponse CertifyCertifyFaceEx(CertifyCertifyFaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyCertifyFaceResponse>(DoRequest("1.0", "antchain.acc.certify.face.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 人脸识别认证
         * Summary: 人脸识别认证
         */
        public async Task<CertifyCertifyFaceResponse> CertifyCertifyFaceExAsync(CertifyCertifyFaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyCertifyFaceResponse>(await DoRequestAsync("1.0", "antchain.acc.certify.face.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询人脸识别结果
         * Summary: 人脸识别结果查询
         */
        public QueryQueryFacecertifyResponse QueryQueryFacecertify(QueryQueryFacecertifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryQueryFacecertifyEx(request, headers, runtime);
        }

        /**
         * Description: 查询人脸识别结果
         * Summary: 人脸识别结果查询
         */
        public async Task<QueryQueryFacecertifyResponse> QueryQueryFacecertifyAsync(QueryQueryFacecertifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryQueryFacecertifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询人脸识别结果
         * Summary: 人脸识别结果查询
         */
        public QueryQueryFacecertifyResponse QueryQueryFacecertifyEx(QueryQueryFacecertifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryQueryFacecertifyResponse>(DoRequest("1.0", "antchain.acc.query.facecertify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询人脸识别结果
         * Summary: 人脸识别结果查询
         */
        public async Task<QueryQueryFacecertifyResponse> QueryQueryFacecertifyExAsync(QueryQueryFacecertifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryQueryFacecertifyResponse>(await DoRequestAsync("1.0", "antchain.acc.query.facecertify.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 每次切换企业，同步当前企业id
         * Summary: 控制台切换企业同步
         */
        public SwitchSwitchFirmidResponse SwitchSwitchFirmid(SwitchSwitchFirmidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SwitchSwitchFirmidEx(request, headers, runtime);
        }

        /**
         * Description: 每次切换企业，同步当前企业id
         * Summary: 控制台切换企业同步
         */
        public async Task<SwitchSwitchFirmidResponse> SwitchSwitchFirmidAsync(SwitchSwitchFirmidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SwitchSwitchFirmidExAsync(request, headers, runtime);
        }

        /**
         * Description: 每次切换企业，同步当前企业id
         * Summary: 控制台切换企业同步
         */
        public SwitchSwitchFirmidResponse SwitchSwitchFirmidEx(SwitchSwitchFirmidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchSwitchFirmidResponse>(DoRequest("1.0", "antchain.acc.switch.firmid.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 每次切换企业，同步当前企业id
         * Summary: 控制台切换企业同步
         */
        public async Task<SwitchSwitchFirmidResponse> SwitchSwitchFirmidExAsync(SwitchSwitchFirmidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchSwitchFirmidResponse>(await DoRequestAsync("1.0", "antchain.acc.switch.firmid.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业身份中心查询企业财报
         * Summary: 查询企业财报
         */
        public QueryQueryFirmfinancialResponse QueryQueryFirmfinancial(QueryQueryFirmfinancialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryQueryFirmfinancialEx(request, headers, runtime);
        }

        /**
         * Description: 企业身份中心查询企业财报
         * Summary: 查询企业财报
         */
        public async Task<QueryQueryFirmfinancialResponse> QueryQueryFirmfinancialAsync(QueryQueryFirmfinancialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryQueryFirmfinancialExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业身份中心查询企业财报
         * Summary: 查询企业财报
         */
        public QueryQueryFirmfinancialResponse QueryQueryFirmfinancialEx(QueryQueryFirmfinancialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryQueryFirmfinancialResponse>(DoRequest("1.0", "antchain.acc.query.firmfinancial.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业身份中心查询企业财报
         * Summary: 查询企业财报
         */
        public async Task<QueryQueryFirmfinancialResponse> QueryQueryFirmfinancialExAsync(QueryQueryFirmfinancialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryQueryFirmfinancialResponse>(await DoRequestAsync("1.0", "antchain.acc.query.firmfinancial.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业身份中心新增或删除企业财报
         * Summary: 新增/删除企业财报
         */
        public SwitchSwitchFirmfinancialResponse SwitchSwitchFirmfinancial(SwitchSwitchFirmfinancialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SwitchSwitchFirmfinancialEx(request, headers, runtime);
        }

        /**
         * Description: 企业身份中心新增或删除企业财报
         * Summary: 新增/删除企业财报
         */
        public async Task<SwitchSwitchFirmfinancialResponse> SwitchSwitchFirmfinancialAsync(SwitchSwitchFirmfinancialRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SwitchSwitchFirmfinancialExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业身份中心新增或删除企业财报
         * Summary: 新增/删除企业财报
         */
        public SwitchSwitchFirmfinancialResponse SwitchSwitchFirmfinancialEx(SwitchSwitchFirmfinancialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchSwitchFirmfinancialResponse>(DoRequest("1.0", "antchain.acc.switch.firmfinancial.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业身份中心新增或删除企业财报
         * Summary: 新增/删除企业财报
         */
        public async Task<SwitchSwitchFirmfinancialResponse> SwitchSwitchFirmfinancialExAsync(SwitchSwitchFirmfinancialRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchSwitchFirmfinancialResponse>(await DoRequestAsync("1.0", "antchain.acc.switch.firmfinancial.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成企业/个人did
         * Summary: 生成企业/个人did
         */
        public CreateDidResponse CreateDid(CreateDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDidEx(request, headers, runtime);
        }

        /**
         * Description: 生成企业/个人did
         * Summary: 生成企业/个人did
         */
        public async Task<CreateDidResponse> CreateDidAsync(CreateDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDidExAsync(request, headers, runtime);
        }

        /**
         * Description: 生成企业/个人did
         * Summary: 生成企业/个人did
         */
        public CreateDidResponse CreateDidEx(CreateDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidResponse>(DoRequest("1.0", "antchain.acc.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成企业/个人did
         * Summary: 生成企业/个人did
         */
        public async Task<CreateDidResponse> CreateDidExAsync(CreateDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDidResponse>(await DoRequestAsync("1.0", "antchain.acc.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateContractPlatformResponse>(DoRequest("1.0", "antchain.acc.contract.platform.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
         * Summary: 电子合同平台方注册
         */
        public async Task<CreateContractPlatformResponse> CreateContractPlatformExAsync(CreateContractPlatformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractPlatformResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.platform.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<AddContractDocumentResponse>(DoRequest("1.0", "antchain.acc.contract.document.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
         * Summary: 向电子合同签署流程中添加待签署文档
         */
        public async Task<AddContractDocumentResponse> AddContractDocumentExAsync(AddContractDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractDocumentResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.document.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<AddContractFileResponse>(DoRequest("1.0", "antchain.acc.contract.file.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
         * Summary: 通过电子合同模板添加文档
         */
        public async Task<AddContractFileResponse> AddContractFileExAsync(AddContractFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractFileResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.file.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<ApplyContractCallbackkeyResponse>(DoRequest("1.0", "antchain.acc.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
         * Summary: 申请区块链合同回调加签key
         */
        public async Task<ApplyContractCallbackkeyResponse> ApplyContractCallbackkeyExAsync(ApplyContractCallbackkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContractCallbackkeyResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.callbackkey.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<AuthContractSignResponse>(DoRequest("1.0", "antchain.acc.contract.sign.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 静默签署授权
         * Summary: 静默签署授权
         */
        public async Task<AuthContractSignResponse> AuthContractSignExAsync(AuthContractSignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthContractSignResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.sign.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateContractTemplateResponse>(DoRequest("1.0", "antchain.acc.contract.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
         * Summary: 通过文件上传方式创建电子合同签署模板
         */
        public async Task<CreateContractTemplateResponse> CreateContractTemplateExAsync(CreateContractTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractTemplateResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateContractSignflowResponse>(DoRequest("1.0", "antchain.acc.contract.signflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
         * Summary: 创建签署流程
         */
        public async Task<CreateContractSignflowResponse> CreateContractSignflowExAsync(CreateContractSignflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractSignflowResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.signflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<GetContractFileuploadurlResponse>(DoRequest("1.0", "antchain.acc.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
         * Summary: 通过上传方式创建文件
         */
        public async Task<GetContractFileuploadurlResponse> GetContractFileuploadurlExAsync(GetContractFileuploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractFileuploadurlResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.fileuploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<AddContractSignfieldResponse>(DoRequest("1.0", "antchain.acc.contract.signfield.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
         * Summary: 添加电子合同签署方自动盖章签署区
         */
        public async Task<AddContractSignfieldResponse> AddContractSignfieldExAsync(AddContractSignfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractSignfieldResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.signfield.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateContractHandsignfieldResponse>(DoRequest("1.0", "antchain.acc.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
         * Summary: 添加电子合同签署方手动盖章签署区
         */
        public async Task<CreateContractHandsignfieldResponse> CreateContractHandsignfieldExAsync(CreateContractHandsignfieldRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractHandsignfieldResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.handsignfield.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<StartContractFlowResponse>(DoRequest("1.0", "antchain.acc.contract.flow.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
         * Summary: 电子合同签署流程开启
         */
        public async Task<StartContractFlowResponse> StartContractFlowExAsync(StartContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartContractFlowResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.flow.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<GetContractSignurlResponse>(DoRequest("1.0", "antchain.acc.contract.signurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
         * Summary: 获取签署地址
         */
        public async Task<GetContractSignurlResponse> GetContractSignurlExAsync(GetContractSignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractSignurlResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.signurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<DownloadContractDocumentResponse>(DoRequest("1.0", "antchain.acc.contract.document.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流程归档后，查询和下载签署后的文件
         * Summary: 电子合同流程文档下载
         */
        public async Task<DownloadContractDocumentResponse> DownloadContractDocumentExAsync(DownloadContractDocumentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadContractDocumentResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.document.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<SaveContractFlowResponse>(DoRequest("1.0", "antchain.acc.contract.flow.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
         * Summary: 电子合同签署流程归档
         */
        public async Task<SaveContractFlowResponse> SaveContractFlowExAsync(SaveContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveContractFlowResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.flow.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<QueryContractFlowResponse>(DoRequest("1.0", "antchain.acc.contract.flow.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询签署流程的详细信息，包括流程配置、签署状态等
         * Summary: 签署流程查询
         */
        public async Task<QueryContractFlowResponse> QueryContractFlowExAsync(QueryContractFlowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractFlowResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.flow.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<GetContractFileResponse>(DoRequest("1.0", "antchain.acc.contract.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件详情，包括文件名称、大小、下载地址等
         * Summary: 查询文件详情
         */
        public async Task<GetContractFileResponse> GetContractFileExAsync(GetContractFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractFileResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<QueryContractNotaryResponse>(DoRequest("1.0", "antchain.acc.contract.notary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过流程ID查询合同存证信息
         * Summary: 查询合同存证信息
         */
        public async Task<QueryContractNotaryResponse> QueryContractNotaryExAsync(QueryContractNotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractNotaryResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.notary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateContractAccountsealimageResponse>(DoRequest("1.0", "antchain.acc.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建个人/机构图片印章
         * Summary: 创建个人/机构图片印章
         */
        public async Task<CreateContractAccountsealimageResponse> CreateContractAccountsealimageExAsync(CreateContractAccountsealimageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractAccountsealimageResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.accountsealimage.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateContractOnestepflowResponse>(DoRequest("1.0", "antchain.acc.contract.onestepflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
         * Summary: 一步创建签署流程接口
         */
        public async Task<CreateContractOnestepflowResponse> CreateContractOnestepflowExAsync(CreateContractOnestepflowRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractOnestepflowResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.onestepflow.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<QueryContractFlowsignerResponse>(DoRequest("1.0", "antchain.acc.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询流程所有签署人列表。
         * Summary: 查询流程签署人列表
         */
        public async Task<QueryContractFlowsignerResponse> QueryContractFlowsignerExAsync(QueryContractFlowsignerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractFlowsignerResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.flowsigner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<QueryContractSignfieldsResponse>(DoRequest("1.0", "antchain.acc.contract.signfields.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
         * Summary: 查询签署区列表
         */
        public async Task<QueryContractSignfieldsResponse> QueryContractSignfieldsExAsync(QueryContractSignfieldsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContractSignfieldsResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.signfields.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<DeleteContractSignerResponse>(DoRequest("1.0", "antchain.acc.contract.signer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行签署人删除逻辑
         * Summary: 删除签署人
         */
        public async Task<DeleteContractSignerResponse> DeleteContractSignerExAsync(DeleteContractSignerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContractSignerResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.signer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ecp同步金融云,内部通道
         * Summary: ecp同步金融云,内部通道
         */
        public SyncEcpCloudResponse SyncEcpCloud(SyncEcpCloudRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncEcpCloudEx(request, headers, runtime);
        }

        /**
         * Description: ecp同步金融云,内部通道
         * Summary: ecp同步金融云,内部通道
         */
        public async Task<SyncEcpCloudResponse> SyncEcpCloudAsync(SyncEcpCloudRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncEcpCloudExAsync(request, headers, runtime);
        }

        /**
         * Description: ecp同步金融云,内部通道
         * Summary: ecp同步金融云,内部通道
         */
        public SyncEcpCloudResponse SyncEcpCloudEx(SyncEcpCloudRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncEcpCloudResponse>(DoRequest("1.0", "antchain.acc.ecp.cloud.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ecp同步金融云,内部通道
         * Summary: ecp同步金融云,内部通道
         */
        public async Task<SyncEcpCloudResponse> SyncEcpCloudExAsync(SyncEcpCloudRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncEcpCloudResponse>(await DoRequestAsync("1.0", "antchain.acc.ecp.cloud.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成url跳转登录
         * Summary: 生成url跳转登录
         */
        public CreateOauthUrlResponse CreateOauthUrl(CreateOauthUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOauthUrlEx(request, headers, runtime);
        }

        /**
         * Description: 生成url跳转登录
         * Summary: 生成url跳转登录
         */
        public async Task<CreateOauthUrlResponse> CreateOauthUrlAsync(CreateOauthUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOauthUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 生成url跳转登录
         * Summary: 生成url跳转登录
         */
        public CreateOauthUrlResponse CreateOauthUrlEx(CreateOauthUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOauthUrlResponse>(DoRequest("1.0", "antchain.acc.oauth.url.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成url跳转登录
         * Summary: 生成url跳转登录
         */
        public async Task<CreateOauthUrlResponse> CreateOauthUrlExAsync(CreateOauthUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOauthUrlResponse>(await DoRequestAsync("1.0", "antchain.acc.oauth.url.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取token
         * Summary: 获取token
         */
        public GetOauthTokenResponse GetOauthToken(GetOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetOauthTokenEx(request, headers, runtime);
        }

        /**
         * Description: 获取token
         * Summary: 获取token
         */
        public async Task<GetOauthTokenResponse> GetOauthTokenAsync(GetOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetOauthTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取token
         * Summary: 获取token
         */
        public GetOauthTokenResponse GetOauthTokenEx(GetOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOauthTokenResponse>(DoRequest("1.0", "antchain.acc.oauth.token.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取token
         * Summary: 获取token
         */
        public async Task<GetOauthTokenResponse> GetOauthTokenExAsync(GetOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOauthTokenResponse>(await DoRequestAsync("1.0", "antchain.acc.oauth.token.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: token明细获取
         * Summary: token明细获取
         */
        public GetOauthTokendetailResponse GetOauthTokendetail(GetOauthTokendetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetOauthTokendetailEx(request, headers, runtime);
        }

        /**
         * Description: token明细获取
         * Summary: token明细获取
         */
        public async Task<GetOauthTokendetailResponse> GetOauthTokendetailAsync(GetOauthTokendetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetOauthTokendetailExAsync(request, headers, runtime);
        }

        /**
         * Description: token明细获取
         * Summary: token明细获取
         */
        public GetOauthTokendetailResponse GetOauthTokendetailEx(GetOauthTokendetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOauthTokendetailResponse>(DoRequest("1.0", "antchain.acc.oauth.tokendetail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: token明细获取
         * Summary: token明细获取
         */
        public async Task<GetOauthTokendetailResponse> GetOauthTokendetailExAsync(GetOauthTokendetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOauthTokendetailResponse>(await DoRequestAsync("1.0", "antchain.acc.oauth.tokendetail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: session判活
         * Summary: session判活
         */
        public CheckSessionAliveResponse CheckSessionAlive(CheckSessionAliveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckSessionAliveEx(request, headers, runtime);
        }

        /**
         * Description: session判活
         * Summary: session判活
         */
        public async Task<CheckSessionAliveResponse> CheckSessionAliveAsync(CheckSessionAliveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckSessionAliveExAsync(request, headers, runtime);
        }

        /**
         * Description: session判活
         * Summary: session判活
         */
        public CheckSessionAliveResponse CheckSessionAliveEx(CheckSessionAliveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSessionAliveResponse>(DoRequest("1.0", "antchain.acc.session.alive.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: session判活
         * Summary: session判活
         */
        public async Task<CheckSessionAliveResponse> CheckSessionAliveExAsync(CheckSessionAliveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSessionAliveResponse>(await DoRequestAsync("1.0", "antchain.acc.session.alive.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部合作伙伴异步通知接口
         * Summary: 外部合作伙伴异步通知接口
         */
        public NotifyPartnerAsyncResponse NotifyPartnerAsync(NotifyPartnerAsyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyPartnerAsyncEx(request, headers, runtime);
        }

        /**
         * Description: 外部合作伙伴异步通知接口
         * Summary: 外部合作伙伴异步通知接口
         */
        public async Task<NotifyPartnerAsyncResponse> NotifyPartnerAsyncAsync(NotifyPartnerAsyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyPartnerAsyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部合作伙伴异步通知接口
         * Summary: 外部合作伙伴异步通知接口
         */
        public NotifyPartnerAsyncResponse NotifyPartnerAsyncEx(NotifyPartnerAsyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyPartnerAsyncResponse>(DoRequest("1.0", "antchain.acc.partner.async.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部合作伙伴异步通知接口
         * Summary: 外部合作伙伴异步通知接口
         */
        public async Task<NotifyPartnerAsyncResponse> NotifyPartnerAsyncExAsync(NotifyPartnerAsyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyPartnerAsyncResponse>(await DoRequestAsync("1.0", "antchain.acc.partner.async.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一条项目基本信息
         * Summary: 创建一条项目基本信息
         */
        public CreateProjectBaseResponse CreateProjectBase(CreateProjectBaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateProjectBaseEx(request, headers, runtime);
        }

        /**
         * Description: 创建一条项目基本信息
         * Summary: 创建一条项目基本信息
         */
        public async Task<CreateProjectBaseResponse> CreateProjectBaseAsync(CreateProjectBaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateProjectBaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一条项目基本信息
         * Summary: 创建一条项目基本信息
         */
        public CreateProjectBaseResponse CreateProjectBaseEx(CreateProjectBaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectBaseResponse>(DoRequest("1.0", "antchain.acc.project.base.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一条项目基本信息
         * Summary: 创建一条项目基本信息
         */
        public async Task<CreateProjectBaseResponse> CreateProjectBaseExAsync(CreateProjectBaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectBaseResponse>(await DoRequestAsync("1.0", "antchain.acc.project.base.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量新增农民工基本信息
         * Summary: 批量新增农民工基本信息
         */
        public BatchcreateWorkersBaseResponse BatchcreateWorkersBase(BatchcreateWorkersBaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateWorkersBaseEx(request, headers, runtime);
        }

        /**
         * Description: 批量新增农民工基本信息
         * Summary: 批量新增农民工基本信息
         */
        public async Task<BatchcreateWorkersBaseResponse> BatchcreateWorkersBaseAsync(BatchcreateWorkersBaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateWorkersBaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量新增农民工基本信息
         * Summary: 批量新增农民工基本信息
         */
        public BatchcreateWorkersBaseResponse BatchcreateWorkersBaseEx(BatchcreateWorkersBaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateWorkersBaseResponse>(DoRequest("1.0", "antchain.acc.workers.base.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量新增农民工基本信息
         * Summary: 批量新增农民工基本信息
         */
        public async Task<BatchcreateWorkersBaseResponse> BatchcreateWorkersBaseExAsync(BatchcreateWorkersBaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateWorkersBaseResponse>(await DoRequestAsync("1.0", "antchain.acc.workers.base.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量新增农民工考勤信息
         * Summary: 批量新增农民工考勤信息
         */
        public BatchcreateWorkersAttendanceResponse BatchcreateWorkersAttendance(BatchcreateWorkersAttendanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateWorkersAttendanceEx(request, headers, runtime);
        }

        /**
         * Description: 批量新增农民工考勤信息
         * Summary: 批量新增农民工考勤信息
         */
        public async Task<BatchcreateWorkersAttendanceResponse> BatchcreateWorkersAttendanceAsync(BatchcreateWorkersAttendanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateWorkersAttendanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量新增农民工考勤信息
         * Summary: 批量新增农民工考勤信息
         */
        public BatchcreateWorkersAttendanceResponse BatchcreateWorkersAttendanceEx(BatchcreateWorkersAttendanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateWorkersAttendanceResponse>(DoRequest("1.0", "antchain.acc.workers.attendance.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量新增农民工考勤信息
         * Summary: 批量新增农民工考勤信息
         */
        public async Task<BatchcreateWorkersAttendanceResponse> BatchcreateWorkersAttendanceExAsync(BatchcreateWorkersAttendanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateWorkersAttendanceResponse>(await DoRequestAsync("1.0", "antchain.acc.workers.attendance.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量新增农民工工资发放信息
         * Summary: 批量新增农民工工资发放信息
         */
        public BatchcreateWorkersWageResponse BatchcreateWorkersWage(BatchcreateWorkersWageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateWorkersWageEx(request, headers, runtime);
        }

        /**
         * Description: 批量新增农民工工资发放信息
         * Summary: 批量新增农民工工资发放信息
         */
        public async Task<BatchcreateWorkersWageResponse> BatchcreateWorkersWageAsync(BatchcreateWorkersWageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateWorkersWageExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量新增农民工工资发放信息
         * Summary: 批量新增农民工工资发放信息
         */
        public BatchcreateWorkersWageResponse BatchcreateWorkersWageEx(BatchcreateWorkersWageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateWorkersWageResponse>(DoRequest("1.0", "antchain.acc.workers.wage.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量新增农民工工资发放信息
         * Summary: 批量新增农民工工资发放信息
         */
        public async Task<BatchcreateWorkersWageResponse> BatchcreateWorkersWageExAsync(BatchcreateWorkersWageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateWorkersWageResponse>(await DoRequestAsync("1.0", "antchain.acc.workers.wage.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一条项目文件信息
         * Summary: 创建一条项目文件信息
         */
        public CreateProjectFileResponse CreateProjectFile(CreateProjectFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateProjectFileEx(request, headers, runtime);
        }

        /**
         * Description: 创建一条项目文件信息
         * Summary: 创建一条项目文件信息
         */
        public async Task<CreateProjectFileResponse> CreateProjectFileAsync(CreateProjectFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateProjectFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一条项目文件信息
         * Summary: 创建一条项目文件信息
         */
        public CreateProjectFileResponse CreateProjectFileEx(CreateProjectFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectFileResponse>(DoRequest("1.0", "antchain.acc.project.file.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一条项目文件信息
         * Summary: 创建一条项目文件信息
         */
        public async Task<CreateProjectFileResponse> CreateProjectFileExAsync(CreateProjectFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProjectFileResponse>(await DoRequestAsync("1.0", "antchain.acc.project.file.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同基本信息流入
         * Summary: 合同基本信息流入
         */
        public CreateContractBaseResponse CreateContractBase(CreateContractBaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractBaseEx(request, headers, runtime);
        }

        /**
         * Description: 合同基本信息流入
         * Summary: 合同基本信息流入
         */
        public async Task<CreateContractBaseResponse> CreateContractBaseAsync(CreateContractBaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractBaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同基本信息流入
         * Summary: 合同基本信息流入
         */
        public CreateContractBaseResponse CreateContractBaseEx(CreateContractBaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractBaseResponse>(DoRequest("1.0", "antchain.acc.contract.base.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同基本信息流入
         * Summary: 合同基本信息流入
         */
        public async Task<CreateContractBaseResponse> CreateContractBaseExAsync(CreateContractBaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractBaseResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.base.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同收付款信息流入
         * Summary: 合同收付款信息流入
         */
        public CreateContractImplResponse CreateContractImpl(CreateContractImplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContractImplEx(request, headers, runtime);
        }

        /**
         * Description: 合同收付款信息流入
         * Summary: 合同收付款信息流入
         */
        public async Task<CreateContractImplResponse> CreateContractImplAsync(CreateContractImplRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContractImplExAsync(request, headers, runtime);
        }

        /**
         * Description: 合同收付款信息流入
         * Summary: 合同收付款信息流入
         */
        public CreateContractImplResponse CreateContractImplEx(CreateContractImplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractImplResponse>(DoRequest("1.0", "antchain.acc.contract.impl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合同收付款信息流入
         * Summary: 合同收付款信息流入
         */
        public async Task<CreateContractImplResponse> CreateContractImplExAsync(CreateContractImplRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContractImplResponse>(await DoRequestAsync("1.0", "antchain.acc.contract.impl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人认证信息同步
         * Summary: 个人认证信息同步
         */
        public CreateUserCertResponse CreateUserCert(CreateUserCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUserCertEx(request, headers, runtime);
        }

        /**
         * Description: 个人认证信息同步
         * Summary: 个人认证信息同步
         */
        public async Task<CreateUserCertResponse> CreateUserCertAsync(CreateUserCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUserCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人认证信息同步
         * Summary: 个人认证信息同步
         */
        public CreateUserCertResponse CreateUserCertEx(CreateUserCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserCertResponse>(DoRequest("1.0", "antchain.acc.user.cert.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人认证信息同步
         * Summary: 个人认证信息同步
         */
        public async Task<CreateUserCertResponse> CreateUserCertExAsync(CreateUserCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserCertResponse>(await DoRequestAsync("1.0", "antchain.acc.user.cert.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户信息变更同步
         * Summary: 用户信息变更同步
         */
        public UpdateUserInfoResponse UpdateUserInfo(UpdateUserInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUserInfoEx(request, headers, runtime);
        }

        /**
         * Description: 用户信息变更同步
         * Summary: 用户信息变更同步
         */
        public async Task<UpdateUserInfoResponse> UpdateUserInfoAsync(UpdateUserInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUserInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户信息变更同步
         * Summary: 用户信息变更同步
         */
        public UpdateUserInfoResponse UpdateUserInfoEx(UpdateUserInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUserInfoResponse>(DoRequest("1.0", "antchain.acc.user.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户信息变更同步
         * Summary: 用户信息变更同步
         */
        public async Task<UpdateUserInfoResponse> UpdateUserInfoExAsync(UpdateUserInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUserInfoResponse>(await DoRequestAsync("1.0", "antchain.acc.user.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户注册信息同步
         * Summary: 用户注册信息同步
         */
        public CreateUserRegisterResponse CreateUserRegister(CreateUserRegisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUserRegisterEx(request, headers, runtime);
        }

        /**
         * Description: 用户注册信息同步
         * Summary: 用户注册信息同步
         */
        public async Task<CreateUserRegisterResponse> CreateUserRegisterAsync(CreateUserRegisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUserRegisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户注册信息同步
         * Summary: 用户注册信息同步
         */
        public CreateUserRegisterResponse CreateUserRegisterEx(CreateUserRegisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserRegisterResponse>(DoRequest("1.0", "antchain.acc.user.register.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户注册信息同步
         * Summary: 用户注册信息同步
         */
        public async Task<CreateUserRegisterResponse> CreateUserRegisterExAsync(CreateUserRegisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserRegisterResponse>(await DoRequestAsync("1.0", "antchain.acc.user.register.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证信息同步
         * Summary: 企业认证信息同步
         */
        public CreateFirmCertResponse CreateFirmCert(CreateFirmCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFirmCertEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证信息同步
         * Summary: 企业认证信息同步
         */
        public async Task<CreateFirmCertResponse> CreateFirmCertAsync(CreateFirmCertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFirmCertExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证信息同步
         * Summary: 企业认证信息同步
         */
        public CreateFirmCertResponse CreateFirmCertEx(CreateFirmCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFirmCertResponse>(DoRequest("1.0", "antchain.acc.firm.cert.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证信息同步
         * Summary: 企业认证信息同步
         */
        public async Task<CreateFirmCertResponse> CreateFirmCertExAsync(CreateFirmCertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFirmCertResponse>(await DoRequestAsync("1.0", "antchain.acc.firm.cert.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业信息变更同步
         * Summary: 企业信息变更同步
         */
        public UpdateFirmInfoResponse UpdateFirmInfo(UpdateFirmInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFirmInfoEx(request, headers, runtime);
        }

        /**
         * Description: 企业信息变更同步
         * Summary: 企业信息变更同步
         */
        public async Task<UpdateFirmInfoResponse> UpdateFirmInfoAsync(UpdateFirmInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFirmInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业信息变更同步
         * Summary: 企业信息变更同步
         */
        public UpdateFirmInfoResponse UpdateFirmInfoEx(UpdateFirmInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFirmInfoResponse>(DoRequest("1.0", "antchain.acc.firm.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业信息变更同步
         * Summary: 企业信息变更同步
         */
        public async Task<UpdateFirmInfoResponse> UpdateFirmInfoExAsync(UpdateFirmInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFirmInfoResponse>(await DoRequestAsync("1.0", "antchain.acc.firm.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上信息
         * Summary: 查询链上信息
         */
        public QueryChainTransactionResponse QueryChainTransaction(QueryChainTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChainTransactionEx(request, headers, runtime);
        }

        /**
         * Description: 查询链上信息
         * Summary: 查询链上信息
         */
        public async Task<QueryChainTransactionResponse> QueryChainTransactionAsync(QueryChainTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChainTransactionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链上信息
         * Summary: 查询链上信息
         */
        public QueryChainTransactionResponse QueryChainTransactionEx(QueryChainTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChainTransactionResponse>(DoRequest("1.0", "antchain.acc.chain.transaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上信息
         * Summary: 查询链上信息
         */
        public async Task<QueryChainTransactionResponse> QueryChainTransactionExAsync(QueryChainTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChainTransactionResponse>(await DoRequestAsync("1.0", "antchain.acc.chain.transaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
