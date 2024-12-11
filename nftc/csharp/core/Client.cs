// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.NFTC.Models;

namespace AntChain.SDK.NFTC
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
                        {"sdk_version", "1.0.28"},
                        {"_prod_code", "NFTC"},
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
                        {"sdk_version", "1.0.28"},
                        {"_prod_code", "NFTC"},
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
         * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
         * Summary: 查询当前数字人形象
         */
        public QueryAvatarProfileResponse QueryAvatarProfile(QueryAvatarProfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAvatarProfileEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
         * Summary: 查询当前数字人形象
         */
        public async Task<QueryAvatarProfileResponse> QueryAvatarProfileAsync(QueryAvatarProfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAvatarProfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
         * Summary: 查询当前数字人形象
         */
        public QueryAvatarProfileResponse QueryAvatarProfileEx(QueryAvatarProfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAvatarProfileResponse>(DoRequest("1.0", "antchain.nftc.avatar.profile.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
         * Summary: 查询当前数字人形象
         */
        public async Task<QueryAvatarProfileResponse> QueryAvatarProfileExAsync(QueryAvatarProfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAvatarProfileResponse>(await DoRequestAsync("1.0", "antchain.nftc.avatar.profile.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
         * Summary: 查询用户助力活动信息
         */
        public QueryPromoteActivityResponse QueryPromoteActivity(QueryPromoteActivityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPromoteActivityEx(request, headers, runtime);
        }

        /**
         * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
         * Summary: 查询用户助力活动信息
         */
        public async Task<QueryPromoteActivityResponse> QueryPromoteActivityAsync(QueryPromoteActivityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPromoteActivityExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
         * Summary: 查询用户助力活动信息
         */
        public QueryPromoteActivityResponse QueryPromoteActivityEx(QueryPromoteActivityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPromoteActivityResponse>(DoRequest("1.0", "antchain.nftc.promote.activity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
         * Summary: 查询用户助力活动信息
         */
        public async Task<QueryPromoteActivityResponse> QueryPromoteActivityExAsync(QueryPromoteActivityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPromoteActivityResponse>(await DoRequestAsync("1.0", "antchain.nftc.promote.activity.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
         * Summary: 发起助力分享
         */
        public GetPromoteShareurlResponse GetPromoteShareurl(GetPromoteShareurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPromoteShareurlEx(request, headers, runtime);
        }

        /**
         * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
         * Summary: 发起助力分享
         */
        public async Task<GetPromoteShareurlResponse> GetPromoteShareurlAsync(GetPromoteShareurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPromoteShareurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
         * Summary: 发起助力分享
         */
        public GetPromoteShareurlResponse GetPromoteShareurlEx(GetPromoteShareurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPromoteShareurlResponse>(DoRequest("1.0", "antchain.nftc.promote.shareurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
         * Summary: 发起助力分享
         */
        public async Task<GetPromoteShareurlResponse> GetPromoteShareurlExAsync(GetPromoteShareurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPromoteShareurlResponse>(await DoRequestAsync("1.0", "antchain.nftc.promote.shareurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认奖励到账
         * Summary: 确认奖励到账
         */
        public ConfirmTaskRewardResponse ConfirmTaskReward(ConfirmTaskRewardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmTaskRewardEx(request, headers, runtime);
        }

        /**
         * Description: 确认奖励到账
         * Summary: 确认奖励到账
         */
        public async Task<ConfirmTaskRewardResponse> ConfirmTaskRewardAsync(ConfirmTaskRewardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmTaskRewardExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认奖励到账
         * Summary: 确认奖励到账
         */
        public ConfirmTaskRewardResponse ConfirmTaskRewardEx(ConfirmTaskRewardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmTaskRewardResponse>(DoRequest("1.0", "antchain.nftc.task.reward.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认奖励到账
         * Summary: 确认奖励到账
         */
        public async Task<ConfirmTaskRewardResponse> ConfirmTaskRewardExAsync(ConfirmTaskRewardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmTaskRewardResponse>(await DoRequestAsync("1.0", "antchain.nftc.task.reward.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: authcode换取token
         * Summary: authcode换取token
         */
        public ApplyOauthTokenResponse ApplyOauthToken(ApplyOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyOauthTokenEx(request, headers, runtime);
        }

        /**
         * Description: authcode换取token
         * Summary: authcode换取token
         */
        public async Task<ApplyOauthTokenResponse> ApplyOauthTokenAsync(ApplyOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyOauthTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: authcode换取token
         * Summary: authcode换取token
         */
        public ApplyOauthTokenResponse ApplyOauthTokenEx(ApplyOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyOauthTokenResponse>(DoRequest("1.0", "antchain.nftc.oauth.token.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: authcode换取token
         * Summary: authcode换取token
         */
        public async Task<ApplyOauthTokenResponse> ApplyOauthTokenExAsync(ApplyOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyOauthTokenResponse>(await DoRequestAsync("1.0", "antchain.nftc.oauth.token.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: token获取头像/昵称
         * Summary: token获取头像/昵称
         */
        public QueryOauthUserinfoResponse QueryOauthUserinfo(QueryOauthUserinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOauthUserinfoEx(request, headers, runtime);
        }

        /**
         * Description: token获取头像/昵称
         * Summary: token获取头像/昵称
         */
        public async Task<QueryOauthUserinfoResponse> QueryOauthUserinfoAsync(QueryOauthUserinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOauthUserinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: token获取头像/昵称
         * Summary: token获取头像/昵称
         */
        public QueryOauthUserinfoResponse QueryOauthUserinfoEx(QueryOauthUserinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOauthUserinfoResponse>(DoRequest("1.0", "antchain.nftc.oauth.userinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: token获取头像/昵称
         * Summary: token获取头像/昵称
         */
        public async Task<QueryOauthUserinfoResponse> QueryOauthUserinfoExAsync(QueryOauthUserinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOauthUserinfoResponse>(await DoRequestAsync("1.0", "antchain.nftc.oauth.userinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户Token
         * Summary: 获取用户Token
         */
        public ApplyOauthUserinfotokenResponse ApplyOauthUserinfotoken(ApplyOauthUserinfotokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyOauthUserinfotokenEx(request, headers, runtime);
        }

        /**
         * Description: 获取用户Token
         * Summary: 获取用户Token
         */
        public async Task<ApplyOauthUserinfotokenResponse> ApplyOauthUserinfotokenAsync(ApplyOauthUserinfotokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyOauthUserinfotokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取用户Token
         * Summary: 获取用户Token
         */
        public ApplyOauthUserinfotokenResponse ApplyOauthUserinfotokenEx(ApplyOauthUserinfotokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyOauthUserinfotokenResponse>(DoRequest("1.0", "antchain.nftc.oauth.userinfotoken.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户Token
         * Summary: 获取用户Token
         */
        public async Task<ApplyOauthUserinfotokenResponse> ApplyOauthUserinfotokenExAsync(ApplyOauthUserinfotokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyOauthUserinfotokenResponse>(await DoRequestAsync("1.0", "antchain.nftc.oauth.userinfotoken.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: token获取实名信息
         * Summary: token获取实名认证信息
         */
        public QueryOauthRealnameinfoResponse QueryOauthRealnameinfo(QueryOauthRealnameinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOauthRealnameinfoEx(request, headers, runtime);
        }

        /**
         * Description: token获取实名信息
         * Summary: token获取实名认证信息
         */
        public async Task<QueryOauthRealnameinfoResponse> QueryOauthRealnameinfoAsync(QueryOauthRealnameinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOauthRealnameinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: token获取实名信息
         * Summary: token获取实名认证信息
         */
        public QueryOauthRealnameinfoResponse QueryOauthRealnameinfoEx(QueryOauthRealnameinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOauthRealnameinfoResponse>(DoRequest("1.0", "antchain.nftc.oauth.realnameinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: token获取实名信息
         * Summary: token获取实名认证信息
         */
        public async Task<QueryOauthRealnameinfoResponse> QueryOauthRealnameinfoExAsync(QueryOauthRealnameinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOauthRealnameinfoResponse>(await DoRequestAsync("1.0", "antchain.nftc.oauth.realnameinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DIY藏品发放
         * Summary: DIY藏品发放
         */
        public PublishMerchantDiyskuResponse PublishMerchantDiysku(PublishMerchantDiyskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishMerchantDiyskuEx(request, headers, runtime);
        }

        /**
         * Description: DIY藏品发放
         * Summary: DIY藏品发放
         */
        public async Task<PublishMerchantDiyskuResponse> PublishMerchantDiyskuAsync(PublishMerchantDiyskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishMerchantDiyskuExAsync(request, headers, runtime);
        }

        /**
         * Description: DIY藏品发放
         * Summary: DIY藏品发放
         */
        public PublishMerchantDiyskuResponse PublishMerchantDiyskuEx(PublishMerchantDiyskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishMerchantDiyskuResponse>(DoRequest("1.0", "antchain.nftc.merchant.diysku.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DIY藏品发放
         * Summary: DIY藏品发放
         */
        public async Task<PublishMerchantDiyskuResponse> PublishMerchantDiyskuExAsync(PublishMerchantDiyskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishMerchantDiyskuResponse>(await DoRequestAsync("1.0", "antchain.nftc.merchant.diysku.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DIY藏品发放查询
         * Summary: DIY藏品发放查询
         */
        public QueryMerchantDiyskuResponse QueryMerchantDiysku(QueryMerchantDiyskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantDiyskuEx(request, headers, runtime);
        }

        /**
         * Description: DIY藏品发放查询
         * Summary: DIY藏品发放查询
         */
        public async Task<QueryMerchantDiyskuResponse> QueryMerchantDiyskuAsync(QueryMerchantDiyskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantDiyskuExAsync(request, headers, runtime);
        }

        /**
         * Description: DIY藏品发放查询
         * Summary: DIY藏品发放查询
         */
        public QueryMerchantDiyskuResponse QueryMerchantDiyskuEx(QueryMerchantDiyskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantDiyskuResponse>(DoRequest("1.0", "antchain.nftc.merchant.diysku.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: DIY藏品发放查询
         * Summary: DIY藏品发放查询
         */
        public async Task<QueryMerchantDiyskuResponse> QueryMerchantDiyskuExAsync(QueryMerchantDiyskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantDiyskuResponse>(await DoRequestAsync("1.0", "antchain.nftc.merchant.diysku.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供ISV  ugc铸造图片查询的openapi服务
         * Summary: ugc铸造图片查询的openapi接口
         */
        public QueryMerchantUgcimagesResponse QueryMerchantUgcimages(QueryMerchantUgcimagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMerchantUgcimagesEx(request, headers, runtime);
        }

        /**
         * Description: 提供ISV  ugc铸造图片查询的openapi服务
         * Summary: ugc铸造图片查询的openapi接口
         */
        public async Task<QueryMerchantUgcimagesResponse> QueryMerchantUgcimagesAsync(QueryMerchantUgcimagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMerchantUgcimagesExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供ISV  ugc铸造图片查询的openapi服务
         * Summary: ugc铸造图片查询的openapi接口
         */
        public QueryMerchantUgcimagesResponse QueryMerchantUgcimagesEx(QueryMerchantUgcimagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantUgcimagesResponse>(DoRequest("1.0", "antchain.nftc.merchant.ugcimages.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供ISV  ugc铸造图片查询的openapi服务
         * Summary: ugc铸造图片查询的openapi接口
         */
        public async Task<QueryMerchantUgcimagesResponse> QueryMerchantUgcimagesExAsync(QueryMerchantUgcimagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMerchantUgcimagesResponse>(await DoRequestAsync("1.0", "antchain.nftc.merchant.ugcimages.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户根据sku给用户发放藏品
         * Summary: 发放藏品
         */
        public ApplyNftTransferResponse ApplyNftTransfer(ApplyNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyNftTransferEx(request, headers, runtime);
        }

        /**
         * Description: 租户根据sku给用户发放藏品
         * Summary: 发放藏品
         */
        public async Task<ApplyNftTransferResponse> ApplyNftTransferAsync(ApplyNftTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyNftTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 租户根据sku给用户发放藏品
         * Summary: 发放藏品
         */
        public ApplyNftTransferResponse ApplyNftTransferEx(ApplyNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyNftTransferResponse>(DoRequest("1.0", "antchain.nftc.nft.transfer.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户根据sku给用户发放藏品
         * Summary: 发放藏品
         */
        public async Task<ApplyNftTransferResponse> ApplyNftTransferExAsync(ApplyNftTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyNftTransferResponse>(await DoRequestAsync("1.0", "antchain.nftc.nft.transfer.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用租户分页查询用户该租户发行的sku的资产
         * Summary: 查询藏品
         */
        public PagequeryNftCustomerResponse PagequeryNftCustomer(PagequeryNftCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryNftCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 调用租户分页查询用户该租户发行的sku的资产
         * Summary: 查询藏品
         */
        public async Task<PagequeryNftCustomerResponse> PagequeryNftCustomerAsync(PagequeryNftCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryNftCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用租户分页查询用户该租户发行的sku的资产
         * Summary: 查询藏品
         */
        public PagequeryNftCustomerResponse PagequeryNftCustomerEx(PagequeryNftCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryNftCustomerResponse>(DoRequest("1.0", "antchain.nftc.nft.customer.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用租户分页查询用户该租户发行的sku的资产
         * Summary: 查询藏品
         */
        public async Task<PagequeryNftCustomerResponse> PagequeryNftCustomerExAsync(PagequeryNftCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryNftCustomerResponse>(await DoRequestAsync("1.0", "antchain.nftc.nft.customer.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询支付结果
         * Summary: 查询支付结果
         */
        public QueryNftOrderResponse QueryNftOrder(QueryNftOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNftOrderEx(request, headers, runtime);
        }

        /**
         * Description: 查询支付结果
         * Summary: 查询支付结果
         */
        public async Task<QueryNftOrderResponse> QueryNftOrderAsync(QueryNftOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNftOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询支付结果
         * Summary: 查询支付结果
         */
        public QueryNftOrderResponse QueryNftOrderEx(QueryNftOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftOrderResponse>(DoRequest("1.0", "antchain.nftc.nft.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询支付结果
         * Summary: 查询支付结果
         */
        public async Task<QueryNftOrderResponse> QueryNftOrderExAsync(QueryNftOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftOrderResponse>(await DoRequestAsync("1.0", "antchain.nftc.nft.order.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据skuId维度查询藏品
         * Summary: 根据skuId维度查询藏品
         */
        public QueryNftAssetbyskuResponse QueryNftAssetbysku(QueryNftAssetbyskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNftAssetbyskuEx(request, headers, runtime);
        }

        /**
         * Description: 根据skuId维度查询藏品
         * Summary: 根据skuId维度查询藏品
         */
        public async Task<QueryNftAssetbyskuResponse> QueryNftAssetbyskuAsync(QueryNftAssetbyskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNftAssetbyskuExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据skuId维度查询藏品
         * Summary: 根据skuId维度查询藏品
         */
        public QueryNftAssetbyskuResponse QueryNftAssetbyskuEx(QueryNftAssetbyskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftAssetbyskuResponse>(DoRequest("1.0", "antchain.nftc.nft.assetbysku.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据skuId维度查询藏品
         * Summary: 根据skuId维度查询藏品
         */
        public async Task<QueryNftAssetbyskuResponse> QueryNftAssetbyskuExAsync(QueryNftAssetbyskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNftAssetbyskuResponse>(await DoRequestAsync("1.0", "antchain.nftc.nft.assetbysku.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据skuId维度校验藏品是否已拥有
         * Summary: 根据skuId维度校验藏品是否已拥有
         */
        public CheckNftAssetbyskuResponse CheckNftAssetbysku(CheckNftAssetbyskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckNftAssetbyskuEx(request, headers, runtime);
        }

        /**
         * Description: 根据skuId维度校验藏品是否已拥有
         * Summary: 根据skuId维度校验藏品是否已拥有
         */
        public async Task<CheckNftAssetbyskuResponse> CheckNftAssetbyskuAsync(CheckNftAssetbyskuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckNftAssetbyskuExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据skuId维度校验藏品是否已拥有
         * Summary: 根据skuId维度校验藏品是否已拥有
         */
        public CheckNftAssetbyskuResponse CheckNftAssetbyskuEx(CheckNftAssetbyskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckNftAssetbyskuResponse>(DoRequest("1.0", "antchain.nftc.nft.assetbysku.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据skuId维度校验藏品是否已拥有
         * Summary: 根据skuId维度校验藏品是否已拥有
         */
        public async Task<CheckNftAssetbyskuResponse> CheckNftAssetbyskuExAsync(CheckNftAssetbyskuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckNftAssetbyskuResponse>(await DoRequestAsync("1.0", "antchain.nftc.nft.assetbysku.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝海豚优惠券发放
         * Summary: 支付宝海豚优惠券发放
         */
        public SendPromoPrizeResponse SendPromoPrize(SendPromoPrizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendPromoPrizeEx(request, headers, runtime);
        }

        /**
         * Description: 支付宝海豚优惠券发放
         * Summary: 支付宝海豚优惠券发放
         */
        public async Task<SendPromoPrizeResponse> SendPromoPrizeAsync(SendPromoPrizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendPromoPrizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付宝海豚优惠券发放
         * Summary: 支付宝海豚优惠券发放
         */
        public SendPromoPrizeResponse SendPromoPrizeEx(SendPromoPrizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendPromoPrizeResponse>(DoRequest("1.0", "antchain.nftc.promo.prize.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝海豚优惠券发放
         * Summary: 支付宝海豚优惠券发放
         */
        public async Task<SendPromoPrizeResponse> SendPromoPrizeExAsync(SendPromoPrizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendPromoPrizeResponse>(await DoRequestAsync("1.0", "antchain.nftc.promo.prize.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建通用资源
         * Summary: 创建通用资源
         */
        public CreateResourceGeneralresourceResponse CreateResourceGeneralresource(CreateResourceGeneralresourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateResourceGeneralresourceEx(request, headers, runtime);
        }

        /**
         * Description: 创建通用资源
         * Summary: 创建通用资源
         */
        public async Task<CreateResourceGeneralresourceResponse> CreateResourceGeneralresourceAsync(CreateResourceGeneralresourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateResourceGeneralresourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建通用资源
         * Summary: 创建通用资源
         */
        public CreateResourceGeneralresourceResponse CreateResourceGeneralresourceEx(CreateResourceGeneralresourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceGeneralresourceResponse>(DoRequest("1.0", "antchain.nftc.resource.generalresource.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建通用资源
         * Summary: 创建通用资源
         */
        public async Task<CreateResourceGeneralresourceResponse> CreateResourceGeneralresourceExAsync(CreateResourceGeneralresourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateResourceGeneralresourceResponse>(await DoRequestAsync("1.0", "antchain.nftc.resource.generalresource.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定文件到通用资源ID
         * Summary: 绑定文件到通用资源ID
         */
        public BindResourceGeneralresourcefileResponse BindResourceGeneralresourcefile(BindResourceGeneralresourcefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindResourceGeneralresourcefileEx(request, headers, runtime);
        }

        /**
         * Description: 绑定文件到通用资源ID
         * Summary: 绑定文件到通用资源ID
         */
        public async Task<BindResourceGeneralresourcefileResponse> BindResourceGeneralresourcefileAsync(BindResourceGeneralresourcefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindResourceGeneralresourcefileExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定文件到通用资源ID
         * Summary: 绑定文件到通用资源ID
         */
        public BindResourceGeneralresourcefileResponse BindResourceGeneralresourcefileEx(BindResourceGeneralresourcefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindResourceGeneralresourcefileResponse>(DoRequest("1.0", "antchain.nftc.resource.generalresourcefile.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定文件到通用资源ID
         * Summary: 绑定文件到通用资源ID
         */
        public async Task<BindResourceGeneralresourcefileResponse> BindResourceGeneralresourcefileExAsync(BindResourceGeneralresourcefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindResourceGeneralresourcefileResponse>(await DoRequestAsync("1.0", "antchain.nftc.resource.generalresourcefile.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布通用资源文件
         * Summary: 发布通用资源文件
         */
        public PublishResourceGeneralresourcefileResponse PublishResourceGeneralresourcefile(PublishResourceGeneralresourcefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishResourceGeneralresourcefileEx(request, headers, runtime);
        }

        /**
         * Description: 发布通用资源文件
         * Summary: 发布通用资源文件
         */
        public async Task<PublishResourceGeneralresourcefileResponse> PublishResourceGeneralresourcefileAsync(PublishResourceGeneralresourcefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishResourceGeneralresourcefileExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布通用资源文件
         * Summary: 发布通用资源文件
         */
        public PublishResourceGeneralresourcefileResponse PublishResourceGeneralresourcefileEx(PublishResourceGeneralresourcefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishResourceGeneralresourcefileResponse>(DoRequest("1.0", "antchain.nftc.resource.generalresourcefile.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布通用资源文件
         * Summary: 发布通用资源文件
         */
        public async Task<PublishResourceGeneralresourcefileResponse> PublishResourceGeneralresourcefileExAsync(PublishResourceGeneralresourcefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishResourceGeneralresourcefileResponse>(await DoRequestAsync("1.0", "antchain.nftc.resource.generalresourcefile.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询资源文件差量包列表
         * Summary: 查询资源文件差量包列表
         */
        public QueryResourcePatchlistResponse QueryResourcePatchlist(QueryResourcePatchlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryResourcePatchlistEx(request, headers, runtime);
        }

        /**
         * Description: 查询资源文件差量包列表
         * Summary: 查询资源文件差量包列表
         */
        public async Task<QueryResourcePatchlistResponse> QueryResourcePatchlistAsync(QueryResourcePatchlistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryResourcePatchlistExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询资源文件差量包列表
         * Summary: 查询资源文件差量包列表
         */
        public QueryResourcePatchlistResponse QueryResourcePatchlistEx(QueryResourcePatchlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourcePatchlistResponse>(DoRequest("1.0", "antchain.nftc.resource.patchlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询资源文件差量包列表
         * Summary: 查询资源文件差量包列表
         */
        public async Task<QueryResourcePatchlistResponse> QueryResourcePatchlistExAsync(QueryResourcePatchlistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryResourcePatchlistResponse>(await DoRequestAsync("1.0", "antchain.nftc.resource.patchlist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源管理平台-申请文件上传token
         * Summary: 资源管理平台-申请文件上传token
         */
        public ApplyResourceFiletokenResponse ApplyResourceFiletoken(ApplyResourceFiletokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyResourceFiletokenEx(request, headers, runtime);
        }

        /**
         * Description: 资源管理平台-申请文件上传token
         * Summary: 资源管理平台-申请文件上传token
         */
        public async Task<ApplyResourceFiletokenResponse> ApplyResourceFiletokenAsync(ApplyResourceFiletokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyResourceFiletokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源管理平台-申请文件上传token
         * Summary: 资源管理平台-申请文件上传token
         */
        public ApplyResourceFiletokenResponse ApplyResourceFiletokenEx(ApplyResourceFiletokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyResourceFiletokenResponse>(DoRequest("1.0", "antchain.nftc.resource.filetoken.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源管理平台-申请文件上传token
         * Summary: 资源管理平台-申请文件上传token
         */
        public async Task<ApplyResourceFiletokenResponse> ApplyResourceFiletokenExAsync(ApplyResourceFiletokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyResourceFiletokenResponse>(await DoRequestAsync("1.0", "antchain.nftc.resource.filetoken.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
