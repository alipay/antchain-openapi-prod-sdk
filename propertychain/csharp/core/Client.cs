// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.PROPERTYCHAIN.Models;

namespace AntChain.SDK.PROPERTYCHAIN
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
                        {"sdk_version", "1.0.45"},
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
                        {"sdk_version", "1.0.45"},
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
            return TeaModel.ToObject<CreateUserResponse>(DoRequest("1.0", "blockchain.propertychain.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户注册
         * Summary: 用户注册
         */
        public async Task<CreateUserResponse> CreateUserExAsync(CreateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.user.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物权凭证转让/赠送
         * Summary: 物权凭证转让/赠送
         */
        public CreateTransferResponse CreateTransfer(CreateTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTransferEx(request, headers, runtime);
        }

        /**
         * Description: 物权凭证转让/赠送
         * Summary: 物权凭证转让/赠送
         */
        public async Task<CreateTransferResponse> CreateTransferAsync(CreateTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 物权凭证转让/赠送
         * Summary: 物权凭证转让/赠送
         */
        public CreateTransferResponse CreateTransferEx(CreateTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTransferResponse>(DoRequest("1.0", "blockchain.propertychain.transfer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物权凭证转让/赠送
         * Summary: 物权凭证转让/赠送
         */
        public async Task<CreateTransferResponse> CreateTransferExAsync(CreateTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTransferResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.transfer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建提取码
         * Summary: 创建提取码
         */
        public CreatePickupResponse CreatePickup(CreatePickupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePickupEx(request, headers, runtime);
        }

        /**
         * Description: 创建提取码
         * Summary: 创建提取码
         */
        public async Task<CreatePickupResponse> CreatePickupAsync(CreatePickupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePickupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建提取码
         * Summary: 创建提取码
         */
        public CreatePickupResponse CreatePickupEx(CreatePickupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePickupResponse>(DoRequest("1.0", "blockchain.propertychain.pickup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建提取码
         * Summary: 创建提取码
         */
        public async Task<CreatePickupResponse> CreatePickupExAsync(CreatePickupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePickupResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.pickup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 销毁提取码
         * Summary: 销毁提取码
         */
        public CancelPickupResponse CancelPickup(CancelPickupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelPickupEx(request, headers, runtime);
        }

        /**
         * Description: 销毁提取码
         * Summary: 销毁提取码
         */
        public async Task<CancelPickupResponse> CancelPickupAsync(CancelPickupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelPickupExAsync(request, headers, runtime);
        }

        /**
         * Description: 销毁提取码
         * Summary: 销毁提取码
         */
        public CancelPickupResponse CancelPickupEx(CancelPickupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelPickupResponse>(DoRequest("1.0", "blockchain.propertychain.pickup.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 销毁提取码
         * Summary: 销毁提取码
         */
        public async Task<CancelPickupResponse> CancelPickupExAsync(CancelPickupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelPickupResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.pickup.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销提取码
         * Summary: 核销提取码
         */
        public DisablePickupResponse DisablePickup(DisablePickupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisablePickupEx(request, headers, runtime);
        }

        /**
         * Description: 核销提取码
         * Summary: 核销提取码
         */
        public async Task<DisablePickupResponse> DisablePickupAsync(DisablePickupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisablePickupExAsync(request, headers, runtime);
        }

        /**
         * Description: 核销提取码
         * Summary: 核销提取码
         */
        public DisablePickupResponse DisablePickupEx(DisablePickupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisablePickupResponse>(DoRequest("1.0", "blockchain.propertychain.pickup.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核销提取码
         * Summary: 核销提取码
         */
        public async Task<DisablePickupResponse> DisablePickupExAsync(DisablePickupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisablePickupResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.pickup.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateLeagueResponse>(DoRequest("1.0", "blockchain.propertychain.league.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public async Task<CreateLeagueResponse> CreateLeagueExAsync(CreateLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeagueResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 加入联盟
         * Summary: 加入联盟
         */
        public AddLeagueResponse AddLeague(AddLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddLeagueEx(request, headers, runtime);
        }

        /**
         * Description: 加入联盟
         * Summary: 加入联盟
         */
        public async Task<AddLeagueResponse> AddLeagueAsync(AddLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddLeagueExAsync(request, headers, runtime);
        }

        /**
         * Description: 加入联盟
         * Summary: 加入联盟
         */
        public AddLeagueResponse AddLeagueEx(AddLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLeagueResponse>(DoRequest("1.0", "blockchain.propertychain.league.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 加入联盟
         * Summary: 加入联盟
         */
        public async Task<AddLeagueResponse> AddLeagueExAsync(AddLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLeagueResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 审核加入联盟
         * Summary: 审核加入联盟
         */
        public ConfirmLeagueResponse ConfirmLeague(ConfirmLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmLeagueEx(request, headers, runtime);
        }

        /**
         * Description: 审核加入联盟
         * Summary: 审核加入联盟
         */
        public async Task<ConfirmLeagueResponse> ConfirmLeagueAsync(ConfirmLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmLeagueExAsync(request, headers, runtime);
        }

        /**
         * Description: 审核加入联盟
         * Summary: 审核加入联盟
         */
        public ConfirmLeagueResponse ConfirmLeagueEx(ConfirmLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmLeagueResponse>(DoRequest("1.0", "blockchain.propertychain.league.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 审核加入联盟
         * Summary: 审核加入联盟
         */
        public async Task<ConfirmLeagueResponse> ConfirmLeagueExAsync(ConfirmLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmLeagueResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询联盟
         * Summary: 查询联盟
         */
        public QueryLeagueResponse QueryLeague(QueryLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeagueEx(request, headers, runtime);
        }

        /**
         * Description: 查询联盟
         * Summary: 查询联盟
         */
        public async Task<QueryLeagueResponse> QueryLeagueAsync(QueryLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeagueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询联盟
         * Summary: 查询联盟
         */
        public QueryLeagueResponse QueryLeagueEx(QueryLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeagueResponse>(DoRequest("1.0", "blockchain.propertychain.league.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询联盟
         * Summary: 查询联盟
         */
        public async Task<QueryLeagueResponse> QueryLeagueExAsync(QueryLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeagueResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建资产信息
         * Summary: 创建资产信息
         */
        public CreateImportassetResponse CreateImportasset(CreateImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 创建资产信息
         * Summary: 创建资产信息
         */
        public async Task<CreateImportassetResponse> CreateImportassetAsync(CreateImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建资产信息
         * Summary: 创建资产信息
         */
        public CreateImportassetResponse CreateImportassetEx(CreateImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建资产信息
         * Summary: 创建资产信息
         */
        public async Task<CreateImportassetResponse> CreateImportassetExAsync(CreateImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新物权
         * Summary: 更新物权
         */
        public UpdateImportassetResponse UpdateImportasset(UpdateImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 更新物权
         * Summary: 更新物权
         */
        public async Task<UpdateImportassetResponse> UpdateImportassetAsync(UpdateImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新物权
         * Summary: 更新物权
         */
        public UpdateImportassetResponse UpdateImportassetEx(UpdateImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新物权
         * Summary: 更新物权
         */
        public async Task<UpdateImportassetResponse> UpdateImportassetExAsync(UpdateImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注销物权
         * Summary: 注销物权
         */
        public CancelImportassetResponse CancelImportasset(CancelImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 注销物权
         * Summary: 注销物权
         */
        public async Task<CancelImportassetResponse> CancelImportassetAsync(CancelImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 注销物权
         * Summary: 注销物权
         */
        public CancelImportassetResponse CancelImportassetEx(CancelImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注销物权
         * Summary: 注销物权
         */
        public async Task<CancelImportassetResponse> CancelImportassetExAsync(CancelImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 冻结物权
         * Summary: 冻结物权
         */
        public FreezeImportassetResponse FreezeImportasset(FreezeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FreezeImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 冻结物权
         * Summary: 冻结物权
         */
        public async Task<FreezeImportassetResponse> FreezeImportassetAsync(FreezeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FreezeImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 冻结物权
         * Summary: 冻结物权
         */
        public FreezeImportassetResponse FreezeImportassetEx(FreezeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 冻结物权
         * Summary: 冻结物权
         */
        public async Task<FreezeImportassetResponse> FreezeImportassetExAsync(FreezeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解冻物权
         * Summary: 解冻物权
         */
        public UnfreezeImportassetResponse UnfreezeImportasset(UnfreezeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnfreezeImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 解冻物权
         * Summary: 解冻物权
         */
        public async Task<UnfreezeImportassetResponse> UnfreezeImportassetAsync(UnfreezeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnfreezeImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 解冻物权
         * Summary: 解冻物权
         */
        public UnfreezeImportassetResponse UnfreezeImportassetEx(UnfreezeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解冻物权
         * Summary: 解冻物权
         */
        public async Task<UnfreezeImportassetResponse> UnfreezeImportassetExAsync(UnfreezeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询物权
         * Summary: 查询物权
         */
        public QueryImportassetResponse QueryImportasset(QueryImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 查询物权
         * Summary: 查询物权
         */
        public async Task<QueryImportassetResponse> QueryImportassetAsync(QueryImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询物权
         * Summary: 查询物权
         */
        public QueryImportassetResponse QueryImportassetEx(QueryImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询物权
         * Summary: 查询物权
         */
        public async Task<QueryImportassetResponse> QueryImportassetExAsync(QueryImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物权列表
         * Summary: 物权列表
         */
        public AllImportassetResponse AllImportasset(AllImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 物权列表
         * Summary: 物权列表
         */
        public async Task<AllImportassetResponse> AllImportassetAsync(AllImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 物权列表
         * Summary: 物权列表
         */
        public AllImportassetResponse AllImportassetEx(AllImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物权列表
         * Summary: 物权列表
         */
        public async Task<AllImportassetResponse> AllImportassetExAsync(AllImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询溯源信息
         * Summary: 批量查询溯源信息
         */
        public BatchqueryImportassetResponse BatchqueryImportasset(BatchqueryImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询溯源信息
         * Summary: 批量查询溯源信息
         */
        public async Task<BatchqueryImportassetResponse> BatchqueryImportassetAsync(BatchqueryImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询溯源信息
         * Summary: 批量查询溯源信息
         */
        public BatchqueryImportassetResponse BatchqueryImportassetEx(BatchqueryImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询溯源信息
         * Summary: 批量查询溯源信息
         */
        public async Task<BatchqueryImportassetResponse> BatchqueryImportassetExAsync(BatchqueryImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据字典
         * Summary: 创建数据字典
         */
        public CreateTemplateResponse CreateTemplate(CreateTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 创建数据字典
         * Summary: 创建数据字典
         */
        public async Task<CreateTemplateResponse> CreateTemplateAsync(CreateTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建数据字典
         * Summary: 创建数据字典
         */
        public CreateTemplateResponse CreateTemplateEx(CreateTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTemplateResponse>(DoRequest("1.0", "blockchain.propertychain.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据字典
         * Summary: 创建数据字典
         */
        public async Task<CreateTemplateResponse> CreateTemplateExAsync(CreateTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新数据字典
         * Summary: 更新数据字典
         */
        public UpdateTemplateResponse UpdateTemplate(UpdateTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 更新数据字典
         * Summary: 更新数据字典
         */
        public async Task<UpdateTemplateResponse> UpdateTemplateAsync(UpdateTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新数据字典
         * Summary: 更新数据字典
         */
        public UpdateTemplateResponse UpdateTemplateEx(UpdateTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTemplateResponse>(DoRequest("1.0", "blockchain.propertychain.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新数据字典
         * Summary: 更新数据字典
         */
        public async Task<UpdateTemplateResponse> UpdateTemplateExAsync(UpdateTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据字典
         * Summary: 查询数据字典
         */
        public QueryTemplateResponse QueryTemplate(QueryTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据字典
         * Summary: 查询数据字典
         */
        public async Task<QueryTemplateResponse> QueryTemplateAsync(QueryTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据字典
         * Summary: 查询数据字典
         */
        public QueryTemplateResponse QueryTemplateEx(QueryTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTemplateResponse>(DoRequest("1.0", "blockchain.propertychain.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据字典
         * Summary: 查询数据字典
         */
        public async Task<QueryTemplateResponse> QueryTemplateExAsync(QueryTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据字典列表信息
         * Summary: 数据字典列表信息
         */
        public AllTemplateResponse AllTemplate(AllTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 数据字典列表信息
         * Summary: 数据字典列表信息
         */
        public async Task<AllTemplateResponse> AllTemplateAsync(AllTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据字典列表信息
         * Summary: 数据字典列表信息
         */
        public AllTemplateResponse AllTemplateEx(AllTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTemplateResponse>(DoRequest("1.0", "blockchain.propertychain.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据字典列表信息
         * Summary: 数据字典列表信息
         */
        public async Task<AllTemplateResponse> AllTemplateExAsync(AllTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllTemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.template.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建验权码
         * Summary: 创建验权码
         */
        public CreateCheckcodeResponse CreateCheckcode(CreateCheckcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCheckcodeEx(request, headers, runtime);
        }

        /**
         * Description: 创建验权码
         * Summary: 创建验权码
         */
        public async Task<CreateCheckcodeResponse> CreateCheckcodeAsync(CreateCheckcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCheckcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建验权码
         * Summary: 创建验权码
         */
        public CreateCheckcodeResponse CreateCheckcodeEx(CreateCheckcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCheckcodeResponse>(DoRequest("1.0", "blockchain.propertychain.checkcode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建验权码
         * Summary: 创建验权码
         */
        public async Task<CreateCheckcodeResponse> CreateCheckcodeExAsync(CreateCheckcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCheckcodeResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.checkcode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验验权码
         * Summary: 校验验权码
         */
        public CheckCheckcodeResponse CheckCheckcode(CheckCheckcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCheckcodeEx(request, headers, runtime);
        }

        /**
         * Description: 校验验权码
         * Summary: 校验验权码
         */
        public async Task<CheckCheckcodeResponse> CheckCheckcodeAsync(CheckCheckcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCheckcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验验权码
         * Summary: 校验验权码
         */
        public CheckCheckcodeResponse CheckCheckcodeEx(CheckCheckcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCheckcodeResponse>(DoRequest("1.0", "blockchain.propertychain.checkcode.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验验权码
         * Summary: 校验验权码
         */
        public async Task<CheckCheckcodeResponse> CheckCheckcodeExAsync(CheckCheckcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCheckcodeResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.checkcode.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建质押申请
         * Summary: 创建质押申请
         */
        public CreateAssetpledgeResponse CreateAssetpledge(CreateAssetpledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAssetpledgeEx(request, headers, runtime);
        }

        /**
         * Description: 创建质押申请
         * Summary: 创建质押申请
         */
        public async Task<CreateAssetpledgeResponse> CreateAssetpledgeAsync(CreateAssetpledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAssetpledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建质押申请
         * Summary: 创建质押申请
         */
        public CreateAssetpledgeResponse CreateAssetpledgeEx(CreateAssetpledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAssetpledgeResponse>(DoRequest("1.0", "blockchain.propertychain.assetpledge.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建质押申请
         * Summary: 创建质押申请
         */
        public async Task<CreateAssetpledgeResponse> CreateAssetpledgeExAsync(CreateAssetpledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAssetpledgeResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assetpledge.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 质押放款
         * Summary: 质押放款
         */
        public ReleaseAssetpledgeResponse ReleaseAssetpledge(ReleaseAssetpledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReleaseAssetpledgeEx(request, headers, runtime);
        }

        /**
         * Description: 质押放款
         * Summary: 质押放款
         */
        public async Task<ReleaseAssetpledgeResponse> ReleaseAssetpledgeAsync(ReleaseAssetpledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReleaseAssetpledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 质押放款
         * Summary: 质押放款
         */
        public ReleaseAssetpledgeResponse ReleaseAssetpledgeEx(ReleaseAssetpledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseAssetpledgeResponse>(DoRequest("1.0", "blockchain.propertychain.assetpledge.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 质押放款
         * Summary: 质押放款
         */
        public async Task<ReleaseAssetpledgeResponse> ReleaseAssetpledgeExAsync(ReleaseAssetpledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseAssetpledgeResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assetpledge.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 质押还款
         * Summary: 质押还款
         */
        public RepayAssetpledgeResponse RepayAssetpledge(RepayAssetpledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RepayAssetpledgeEx(request, headers, runtime);
        }

        /**
         * Description: 质押还款
         * Summary: 质押还款
         */
        public async Task<RepayAssetpledgeResponse> RepayAssetpledgeAsync(RepayAssetpledgeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RepayAssetpledgeExAsync(request, headers, runtime);
        }

        /**
         * Description: 质押还款
         * Summary: 质押还款
         */
        public RepayAssetpledgeResponse RepayAssetpledgeEx(RepayAssetpledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayAssetpledgeResponse>(DoRequest("1.0", "blockchain.propertychain.assetpledge.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 质押还款
         * Summary: 质押还款
         */
        public async Task<RepayAssetpledgeResponse> RepayAssetpledgeExAsync(RepayAssetpledgeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RepayAssetpledgeResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assetpledge.repay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询账户信息
         * Summary: 查询账户信息
         */
        public GetLeagueAccountinfoResponse GetLeagueAccountinfo(GetLeagueAccountinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetLeagueAccountinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询账户信息
         * Summary: 查询账户信息
         */
        public async Task<GetLeagueAccountinfoResponse> GetLeagueAccountinfoAsync(GetLeagueAccountinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetLeagueAccountinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询账户信息
         * Summary: 查询账户信息
         */
        public GetLeagueAccountinfoResponse GetLeagueAccountinfoEx(GetLeagueAccountinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLeagueAccountinfoResponse>(DoRequest("1.0", "blockchain.propertychain.league.accountinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询账户信息
         * Summary: 查询账户信息
         */
        public async Task<GetLeagueAccountinfoResponse> GetLeagueAccountinfoExAsync(GetLeagueAccountinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetLeagueAccountinfoResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.accountinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 登记仓库
         * Summary: 登记仓库
         */
        public CreateWarehouseResponse CreateWarehouse(CreateWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWarehouseEx(request, headers, runtime);
        }

        /**
         * Description: 登记仓库
         * Summary: 登记仓库
         */
        public async Task<CreateWarehouseResponse> CreateWarehouseAsync(CreateWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWarehouseExAsync(request, headers, runtime);
        }

        /**
         * Description: 登记仓库
         * Summary: 登记仓库
         */
        public CreateWarehouseResponse CreateWarehouseEx(CreateWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWarehouseResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 登记仓库
         * Summary: 登记仓库
         */
        public async Task<CreateWarehouseResponse> CreateWarehouseExAsync(CreateWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWarehouseResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 例举角色类型
         * Summary: 例举角色类型
         */
        public ListLeagueRoleResponse ListLeagueRole(ListLeagueRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListLeagueRoleEx(request, headers, runtime);
        }

        /**
         * Description: 例举角色类型
         * Summary: 例举角色类型
         */
        public async Task<ListLeagueRoleResponse> ListLeagueRoleAsync(ListLeagueRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListLeagueRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 例举角色类型
         * Summary: 例举角色类型
         */
        public ListLeagueRoleResponse ListLeagueRoleEx(ListLeagueRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLeagueRoleResponse>(DoRequest("1.0", "blockchain.propertychain.league.role.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 例举角色类型
         * Summary: 例举角色类型
         */
        public async Task<ListLeagueRoleResponse> ListLeagueRoleExAsync(ListLeagueRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLeagueRoleResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.role.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询仓库详细信息
         * Summary: 查询仓库详细信息
         */
        public GetWarehouseResponse GetWarehouse(GetWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWarehouseEx(request, headers, runtime);
        }

        /**
         * Description: 查询仓库详细信息
         * Summary: 查询仓库详细信息
         */
        public async Task<GetWarehouseResponse> GetWarehouseAsync(GetWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWarehouseExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询仓库详细信息
         * Summary: 查询仓库详细信息
         */
        public GetWarehouseResponse GetWarehouseEx(GetWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWarehouseResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询仓库详细信息
         * Summary: 查询仓库详细信息
         */
        public async Task<GetWarehouseResponse> GetWarehouseExAsync(GetWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWarehouseResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新库存信息
         * Summary: 更新库存信息
         */
        public UpdateWarehouseResponse UpdateWarehouse(UpdateWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateWarehouseEx(request, headers, runtime);
        }

        /**
         * Description: 更新库存信息
         * Summary: 更新库存信息
         */
        public async Task<UpdateWarehouseResponse> UpdateWarehouseAsync(UpdateWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateWarehouseExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新库存信息
         * Summary: 更新库存信息
         */
        public UpdateWarehouseResponse UpdateWarehouseEx(UpdateWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWarehouseResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新库存信息
         * Summary: 更新库存信息
         */
        public async Task<UpdateWarehouseResponse> UpdateWarehouseExAsync(UpdateWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWarehouseResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举用户仓库列表
         * Summary: 列举用户仓库列表
         */
        public ListWarehouseResponse ListWarehouse(ListWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListWarehouseEx(request, headers, runtime);
        }

        /**
         * Description: 列举用户仓库列表
         * Summary: 列举用户仓库列表
         */
        public async Task<ListWarehouseResponse> ListWarehouseAsync(ListWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListWarehouseExAsync(request, headers, runtime);
        }

        /**
         * Description: 列举用户仓库列表
         * Summary: 列举用户仓库列表
         */
        public ListWarehouseResponse ListWarehouseEx(ListWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWarehouseResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举用户仓库列表
         * Summary: 列举用户仓库列表
         */
        public async Task<ListWarehouseResponse> ListWarehouseExAsync(ListWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWarehouseResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 例举联盟
         * Summary: 例举联盟
         */
        public ListLeagueResponse ListLeague(ListLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListLeagueEx(request, headers, runtime);
        }

        /**
         * Description: 例举联盟
         * Summary: 例举联盟
         */
        public async Task<ListLeagueResponse> ListLeagueAsync(ListLeagueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListLeagueExAsync(request, headers, runtime);
        }

        /**
         * Description: 例举联盟
         * Summary: 例举联盟
         */
        public ListLeagueResponse ListLeagueEx(ListLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLeagueResponse>(DoRequest("1.0", "blockchain.propertychain.league.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 例举联盟
         * Summary: 例举联盟
         */
        public async Task<ListLeagueResponse> ListLeagueExAsync(ListLeagueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLeagueResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举某个仓库/仓位下的设备信息
         * Summary: 列举某个仓库/仓位下的设备信息
         */
        public QueryWarehouseDeviceResponse QueryWarehouseDevice(QueryWarehouseDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWarehouseDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 列举某个仓库/仓位下的设备信息
         * Summary: 列举某个仓库/仓位下的设备信息
         */
        public async Task<QueryWarehouseDeviceResponse> QueryWarehouseDeviceAsync(QueryWarehouseDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWarehouseDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 列举某个仓库/仓位下的设备信息
         * Summary: 列举某个仓库/仓位下的设备信息
         */
        public QueryWarehouseDeviceResponse QueryWarehouseDeviceEx(QueryWarehouseDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWarehouseDeviceResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.device.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举某个仓库/仓位下的设备信息
         * Summary: 列举某个仓库/仓位下的设备信息
         */
        public async Task<QueryWarehouseDeviceResponse> QueryWarehouseDeviceExAsync(QueryWarehouseDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWarehouseDeviceResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.device.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建联盟申请
         * Summary: 创建联盟申请
         */
        public CreateLeagueApplyResponse CreateLeagueApply(CreateLeagueApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeagueApplyEx(request, headers, runtime);
        }

        /**
         * Description: 创建联盟申请
         * Summary: 创建联盟申请
         */
        public async Task<CreateLeagueApplyResponse> CreateLeagueApplyAsync(CreateLeagueApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeagueApplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建联盟申请
         * Summary: 创建联盟申请
         */
        public CreateLeagueApplyResponse CreateLeagueApplyEx(CreateLeagueApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeagueApplyResponse>(DoRequest("1.0", "blockchain.propertychain.league.apply.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建联盟申请
         * Summary: 创建联盟申请
         */
        public async Task<CreateLeagueApplyResponse> CreateLeagueApplyExAsync(CreateLeagueApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeagueApplyResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.apply.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交入盟申请
         * Summary: 提交入盟申请
         */
        public CreateLeagueJoinapplyResponse CreateLeagueJoinapply(CreateLeagueJoinapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeagueJoinapplyEx(request, headers, runtime);
        }

        /**
         * Description: 提交入盟申请
         * Summary: 提交入盟申请
         */
        public async Task<CreateLeagueJoinapplyResponse> CreateLeagueJoinapplyAsync(CreateLeagueJoinapplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeagueJoinapplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交入盟申请
         * Summary: 提交入盟申请
         */
        public CreateLeagueJoinapplyResponse CreateLeagueJoinapplyEx(CreateLeagueJoinapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeagueJoinapplyResponse>(DoRequest("1.0", "blockchain.propertychain.league.joinapply.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交入盟申请
         * Summary: 提交入盟申请
         */
        public async Task<CreateLeagueJoinapplyResponse> CreateLeagueJoinapplyExAsync(CreateLeagueJoinapplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeagueJoinapplyResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.joinapply.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销入盟申请
         * Summary: 撤销入盟申请
         */
        public CancelLeagueApplyResponse CancelLeagueApply(CancelLeagueApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelLeagueApplyEx(request, headers, runtime);
        }

        /**
         * Description: 撤销入盟申请
         * Summary: 撤销入盟申请
         */
        public async Task<CancelLeagueApplyResponse> CancelLeagueApplyAsync(CancelLeagueApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelLeagueApplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 撤销入盟申请
         * Summary: 撤销入盟申请
         */
        public CancelLeagueApplyResponse CancelLeagueApplyEx(CancelLeagueApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelLeagueApplyResponse>(DoRequest("1.0", "blockchain.propertychain.league.apply.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销入盟申请
         * Summary: 撤销入盟申请
         */
        public async Task<CancelLeagueApplyResponse> CancelLeagueApplyExAsync(CancelLeagueApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelLeagueApplyResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.apply.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举仓库下的库位列表
         * Summary: 列举仓库下的库位列表
         */
        public QueryWarehouseStoragelocationResponse QueryWarehouseStoragelocation(QueryWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWarehouseStoragelocationEx(request, headers, runtime);
        }

        /**
         * Description: 列举仓库下的库位列表
         * Summary: 列举仓库下的库位列表
         */
        public async Task<QueryWarehouseStoragelocationResponse> QueryWarehouseStoragelocationAsync(QueryWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWarehouseStoragelocationExAsync(request, headers, runtime);
        }

        /**
         * Description: 列举仓库下的库位列表
         * Summary: 列举仓库下的库位列表
         */
        public QueryWarehouseStoragelocationResponse QueryWarehouseStoragelocationEx(QueryWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWarehouseStoragelocationResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举仓库下的库位列表
         * Summary: 列举仓库下的库位列表
         */
        public async Task<QueryWarehouseStoragelocationResponse> QueryWarehouseStoragelocationExAsync(QueryWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWarehouseStoragelocationResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.storagelocation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 盟主审核入盟申请
         * Summary: 盟主审核入盟申请
         */
        public AuthLeagueApplyResponse AuthLeagueApply(AuthLeagueApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthLeagueApplyEx(request, headers, runtime);
        }

        /**
         * Description: 盟主审核入盟申请
         * Summary: 盟主审核入盟申请
         */
        public async Task<AuthLeagueApplyResponse> AuthLeagueApplyAsync(AuthLeagueApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthLeagueApplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 盟主审核入盟申请
         * Summary: 盟主审核入盟申请
         */
        public AuthLeagueApplyResponse AuthLeagueApplyEx(AuthLeagueApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthLeagueApplyResponse>(DoRequest("1.0", "blockchain.propertychain.league.apply.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 盟主审核入盟申请
         * Summary: 盟主审核入盟申请
         */
        public async Task<AuthLeagueApplyResponse> AuthLeagueApplyExAsync(AuthLeagueApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthLeagueApplyResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.apply.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除仓库
         * Summary: 删除仓库
         */
        public DeleteWarehouseResponse DeleteWarehouse(DeleteWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteWarehouseEx(request, headers, runtime);
        }

        /**
         * Description: 删除仓库
         * Summary: 删除仓库
         */
        public async Task<DeleteWarehouseResponse> DeleteWarehouseAsync(DeleteWarehouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteWarehouseExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除仓库
         * Summary: 删除仓库
         */
        public DeleteWarehouseResponse DeleteWarehouseEx(DeleteWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWarehouseResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除仓库
         * Summary: 删除仓库
         */
        public async Task<DeleteWarehouseResponse> DeleteWarehouseExAsync(DeleteWarehouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWarehouseResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 例举入盟申请
         * Summary: 例举入盟申请
         */
        public ListLeagueApplyResponse ListLeagueApply(ListLeagueApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListLeagueApplyEx(request, headers, runtime);
        }

        /**
         * Description: 例举入盟申请
         * Summary: 例举入盟申请
         */
        public async Task<ListLeagueApplyResponse> ListLeagueApplyAsync(ListLeagueApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListLeagueApplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 例举入盟申请
         * Summary: 例举入盟申请
         */
        public ListLeagueApplyResponse ListLeagueApplyEx(ListLeagueApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLeagueApplyResponse>(DoRequest("1.0", "blockchain.propertychain.league.apply.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 例举入盟申请
         * Summary: 例举入盟申请
         */
        public async Task<ListLeagueApplyResponse> ListLeagueApplyExAsync(ListLeagueApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLeagueApplyResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.league.apply.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 登记库位信息
         * Summary: 登记库位信息
         */
        public CreateWarehouseStoraglocationResponse CreateWarehouseStoraglocation(CreateWarehouseStoraglocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWarehouseStoraglocationEx(request, headers, runtime);
        }

        /**
         * Description: 登记库位信息
         * Summary: 登记库位信息
         */
        public async Task<CreateWarehouseStoraglocationResponse> CreateWarehouseStoraglocationAsync(CreateWarehouseStoraglocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWarehouseStoraglocationExAsync(request, headers, runtime);
        }

        /**
         * Description: 登记库位信息
         * Summary: 登记库位信息
         */
        public CreateWarehouseStoraglocationResponse CreateWarehouseStoraglocationEx(CreateWarehouseStoraglocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWarehouseStoraglocationResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.storaglocation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 登记库位信息
         * Summary: 登记库位信息
         */
        public async Task<CreateWarehouseStoraglocationResponse> CreateWarehouseStoraglocationExAsync(CreateWarehouseStoraglocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWarehouseStoraglocationResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.storaglocation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询库位详细信息
         * Summary: 查询库位详细信息
         */
        public GetWarehouseStoragelocationResponse GetWarehouseStoragelocation(GetWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWarehouseStoragelocationEx(request, headers, runtime);
        }

        /**
         * Description: 查询库位详细信息
         * Summary: 查询库位详细信息
         */
        public async Task<GetWarehouseStoragelocationResponse> GetWarehouseStoragelocationAsync(GetWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWarehouseStoragelocationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询库位详细信息
         * Summary: 查询库位详细信息
         */
        public GetWarehouseStoragelocationResponse GetWarehouseStoragelocationEx(GetWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWarehouseStoragelocationResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询库位详细信息
         * Summary: 查询库位详细信息
         */
        public async Task<GetWarehouseStoragelocationResponse> GetWarehouseStoragelocationExAsync(GetWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWarehouseStoragelocationResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.storagelocation.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  更新库位信息
         * Summary:  更新库位信息
         */
        public UpdateWarehouseStoragelocationResponse UpdateWarehouseStoragelocation(UpdateWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateWarehouseStoragelocationEx(request, headers, runtime);
        }

        /**
         * Description:  更新库位信息
         * Summary:  更新库位信息
         */
        public async Task<UpdateWarehouseStoragelocationResponse> UpdateWarehouseStoragelocationAsync(UpdateWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateWarehouseStoragelocationExAsync(request, headers, runtime);
        }

        /**
         * Description:  更新库位信息
         * Summary:  更新库位信息
         */
        public UpdateWarehouseStoragelocationResponse UpdateWarehouseStoragelocationEx(UpdateWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWarehouseStoragelocationResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  更新库位信息
         * Summary:  更新库位信息
         */
        public async Task<UpdateWarehouseStoragelocationResponse> UpdateWarehouseStoragelocationExAsync(UpdateWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWarehouseStoragelocationResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.storagelocation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举用户库位列表
         * Summary: 列举用户库位列表
         */
        public BatchqueryWarehouseStoragelocationResponse BatchqueryWarehouseStoragelocation(BatchqueryWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryWarehouseStoragelocationEx(request, headers, runtime);
        }

        /**
         * Description: 列举用户库位列表
         * Summary: 列举用户库位列表
         */
        public async Task<BatchqueryWarehouseStoragelocationResponse> BatchqueryWarehouseStoragelocationAsync(BatchqueryWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryWarehouseStoragelocationExAsync(request, headers, runtime);
        }

        /**
         * Description: 列举用户库位列表
         * Summary: 列举用户库位列表
         */
        public BatchqueryWarehouseStoragelocationResponse BatchqueryWarehouseStoragelocationEx(BatchqueryWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryWarehouseStoragelocationResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举用户库位列表
         * Summary: 列举用户库位列表
         */
        public async Task<BatchqueryWarehouseStoragelocationResponse> BatchqueryWarehouseStoragelocationExAsync(BatchqueryWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryWarehouseStoragelocationResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.storagelocation.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举仓库下某状态的库位列表
         * Summary: 列举仓库下某状态的库位列表
         */
        public ListWarehouseStoragelocationResponse ListWarehouseStoragelocation(ListWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListWarehouseStoragelocationEx(request, headers, runtime);
        }

        /**
         * Description: 列举仓库下某状态的库位列表
         * Summary: 列举仓库下某状态的库位列表
         */
        public async Task<ListWarehouseStoragelocationResponse> ListWarehouseStoragelocationAsync(ListWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListWarehouseStoragelocationExAsync(request, headers, runtime);
        }

        /**
         * Description: 列举仓库下某状态的库位列表
         * Summary: 列举仓库下某状态的库位列表
         */
        public ListWarehouseStoragelocationResponse ListWarehouseStoragelocationEx(ListWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWarehouseStoragelocationResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举仓库下某状态的库位列表
         * Summary: 列举仓库下某状态的库位列表
         */
        public async Task<ListWarehouseStoragelocationResponse> ListWarehouseStoragelocationExAsync(ListWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWarehouseStoragelocationResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.storagelocation.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除库位
         * Summary: 删除库位
         */
        public DeleteWarehouseStoragelocationResponse DeleteWarehouseStoragelocation(DeleteWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteWarehouseStoragelocationEx(request, headers, runtime);
        }

        /**
         * Description: 删除库位
         * Summary: 删除库位
         */
        public async Task<DeleteWarehouseStoragelocationResponse> DeleteWarehouseStoragelocationAsync(DeleteWarehouseStoragelocationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteWarehouseStoragelocationExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除库位
         * Summary: 删除库位
         */
        public DeleteWarehouseStoragelocationResponse DeleteWarehouseStoragelocationEx(DeleteWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWarehouseStoragelocationResponse>(DoRequest("1.0", "blockchain.propertychain.warehouse.storagelocation.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除库位
         * Summary: 删除库位
         */
        public async Task<DeleteWarehouseStoragelocationResponse> DeleteWarehouseStoragelocationExAsync(DeleteWarehouseStoragelocationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWarehouseStoragelocationResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.warehouse.storagelocation.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据字典
         * Summary: 创建数据字典
         */
        public CreateAssettemplateResponse CreateAssettemplate(CreateAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAssettemplateEx(request, headers, runtime);
        }

        /**
         * Description: 创建数据字典
         * Summary: 创建数据字典
         */
        public async Task<CreateAssettemplateResponse> CreateAssettemplateAsync(CreateAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAssettemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建数据字典
         * Summary: 创建数据字典
         */
        public CreateAssettemplateResponse CreateAssettemplateEx(CreateAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAssettemplateResponse>(DoRequest("1.0", "blockchain.propertychain.assettemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据字典
         * Summary: 创建数据字典
         */
        public async Task<CreateAssettemplateResponse> CreateAssettemplateExAsync(CreateAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAssettemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assettemplate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新数据字典
         * Summary: 更新数据字典
         */
        public UpdateAssettemplateResponse UpdateAssettemplate(UpdateAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAssettemplateEx(request, headers, runtime);
        }

        /**
         * Description: 更新数据字典
         * Summary: 更新数据字典
         */
        public async Task<UpdateAssettemplateResponse> UpdateAssettemplateAsync(UpdateAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAssettemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新数据字典
         * Summary: 更新数据字典
         */
        public UpdateAssettemplateResponse UpdateAssettemplateEx(UpdateAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAssettemplateResponse>(DoRequest("1.0", "blockchain.propertychain.assettemplate.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新数据字典
         * Summary: 更新数据字典
         */
        public async Task<UpdateAssettemplateResponse> UpdateAssettemplateExAsync(UpdateAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAssettemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assettemplate.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据字典
         * Summary: 查询数据字典
         */
        public GetAssettemplateResponse GetAssettemplate(GetAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAssettemplateEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据字典
         * Summary: 查询数据字典
         */
        public async Task<GetAssettemplateResponse> GetAssettemplateAsync(GetAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAssettemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据字典
         * Summary: 查询数据字典
         */
        public GetAssettemplateResponse GetAssettemplateEx(GetAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAssettemplateResponse>(DoRequest("1.0", "blockchain.propertychain.assettemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据字典
         * Summary: 查询数据字典
         */
        public async Task<GetAssettemplateResponse> GetAssettemplateExAsync(GetAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAssettemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assettemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举数据字典
         * Summary: 列举数据字典
         */
        public ListAssettemplateResponse ListAssettemplate(ListAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAssettemplateEx(request, headers, runtime);
        }

        /**
         * Description: 列举数据字典
         * Summary: 列举数据字典
         */
        public async Task<ListAssettemplateResponse> ListAssettemplateAsync(ListAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAssettemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 列举数据字典
         * Summary: 列举数据字典
         */
        public ListAssettemplateResponse ListAssettemplateEx(ListAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAssettemplateResponse>(DoRequest("1.0", "blockchain.propertychain.assettemplate.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列举数据字典
         * Summary: 列举数据字典
         */
        public async Task<ListAssettemplateResponse> ListAssettemplateExAsync(ListAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAssettemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assettemplate.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除数据字典
         * Summary: 删除数据字典
         */
        public DeleteAssettemplateResponse DeleteAssettemplate(DeleteAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAssettemplateEx(request, headers, runtime);
        }

        /**
         * Description: 删除数据字典
         * Summary: 删除数据字典
         */
        public async Task<DeleteAssettemplateResponse> DeleteAssettemplateAsync(DeleteAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAssettemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除数据字典
         * Summary: 删除数据字典
         */
        public DeleteAssettemplateResponse DeleteAssettemplateEx(DeleteAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAssettemplateResponse>(DoRequest("1.0", "blockchain.propertychain.assettemplate.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除数据字典
         * Summary: 删除数据字典
         */
        public async Task<DeleteAssettemplateResponse> DeleteAssettemplateExAsync(DeleteAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAssettemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assettemplate.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生效/失效数据字典
         * Summary: 生效/失效数据字典
         */
        public EnableAssettemplateResponse EnableAssettemplate(EnableAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableAssettemplateEx(request, headers, runtime);
        }

        /**
         * Description: 生效/失效数据字典
         * Summary: 生效/失效数据字典
         */
        public async Task<EnableAssettemplateResponse> EnableAssettemplateAsync(EnableAssettemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableAssettemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 生效/失效数据字典
         * Summary: 生效/失效数据字典
         */
        public EnableAssettemplateResponse EnableAssettemplateEx(EnableAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableAssettemplateResponse>(DoRequest("1.0", "blockchain.propertychain.assettemplate.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生效/失效数据字典
         * Summary: 生效/失效数据字典
         */
        public async Task<EnableAssettemplateResponse> EnableAssettemplateExAsync(EnableAssettemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableAssettemplateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.assettemplate.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传文件
         * Summary: 上传文件
         */
        public UpdateDocumentFileResponse UpdateDocumentFile(UpdateDocumentFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDocumentFileEx(request, headers, runtime);
        }

        /**
         * Description: 上传文件
         * Summary: 上传文件
         */
        public async Task<UpdateDocumentFileResponse> UpdateDocumentFileAsync(UpdateDocumentFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDocumentFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传文件
         * Summary: 上传文件
         */
        public UpdateDocumentFileResponse UpdateDocumentFileEx(UpdateDocumentFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDocumentFileResponse>(DoRequest("1.0", "blockchain.propertychain.document.file.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传文件
         * Summary: 上传文件
         */
        public async Task<UpdateDocumentFileResponse> UpdateDocumentFileExAsync(UpdateDocumentFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDocumentFileResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.document.file.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据文件id查找文件
         * Summary: 根据文件id查找文件
         */
        public GetDocumentFileResponse GetDocumentFile(GetDocumentFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDocumentFileEx(request, headers, runtime);
        }

        /**
         * Description: 根据文件id查找文件
         * Summary: 根据文件id查找文件
         */
        public async Task<GetDocumentFileResponse> GetDocumentFileAsync(GetDocumentFileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDocumentFileExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据文件id查找文件
         * Summary: 根据文件id查找文件
         */
        public GetDocumentFileResponse GetDocumentFileEx(GetDocumentFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDocumentFileResponse>(DoRequest("1.0", "blockchain.propertychain.document.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据文件id查找文件
         * Summary: 根据文件id查找文件
         */
        public async Task<GetDocumentFileResponse> GetDocumentFileExAsync(GetDocumentFileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDocumentFileResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.document.file.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户注销
         * Summary: 用户注销
         */
        public CancelUserResponse CancelUser(CancelUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelUserEx(request, headers, runtime);
        }

        /**
         * Description: 用户注销
         * Summary: 用户注销
         */
        public async Task<CancelUserResponse> CancelUserAsync(CancelUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户注销
         * Summary: 用户注销
         */
        public CancelUserResponse CancelUserEx(CancelUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelUserResponse>(DoRequest("1.0", "blockchain.propertychain.user.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户注销
         * Summary: 用户注销
         */
        public async Task<CancelUserResponse> CancelUserExAsync(CancelUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelUserResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.user.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新用户信息
         * Summary: 更新用户信息
         */
        public UpdateUserResponse UpdateUser(UpdateUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUserEx(request, headers, runtime);
        }

        /**
         * Description: 更新用户信息
         * Summary: 更新用户信息
         */
        public async Task<UpdateUserResponse> UpdateUserAsync(UpdateUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新用户信息
         * Summary: 更新用户信息
         */
        public UpdateUserResponse UpdateUserEx(UpdateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUserResponse>(DoRequest("1.0", "blockchain.propertychain.user.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新用户信息
         * Summary: 更新用户信息
         */
        public async Task<UpdateUserResponse> UpdateUserExAsync(UpdateUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUserResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.user.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息列表
         * Summary: 查询用户信息列表
         */
        public ListUserResponse ListUser(ListUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUserEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息列表
         * Summary: 查询用户信息列表
         */
        public async Task<ListUserResponse> ListUserAsync(ListUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息列表
         * Summary: 查询用户信息列表
         */
        public ListUserResponse ListUserEx(ListUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUserResponse>(DoRequest("1.0", "blockchain.propertychain.user.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息列表
         * Summary: 查询用户信息列表
         */
        public async Task<ListUserResponse> ListUserExAsync(ListUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUserResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.user.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 映射用户信息
         * Summary: 映射用户信息
         */
        public MountUserResponse MountUser(MountUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MountUserEx(request, headers, runtime);
        }

        /**
         * Description: 映射用户信息
         * Summary: 映射用户信息
         */
        public async Task<MountUserResponse> MountUserAsync(MountUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MountUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 映射用户信息
         * Summary: 映射用户信息
         */
        public MountUserResponse MountUserEx(MountUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountUserResponse>(DoRequest("1.0", "blockchain.propertychain.user.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 映射用户信息
         * Summary: 映射用户信息
         */
        public async Task<MountUserResponse> MountUserExAsync(MountUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MountUserResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.user.mount", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建物权
         * Summary: 批量创建物权
         */
        public BatchcreateImportassetResponse BatchcreateImportasset(BatchcreateImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建物权
         * Summary: 批量创建物权
         */
        public async Task<BatchcreateImportassetResponse> BatchcreateImportassetAsync(BatchcreateImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建物权
         * Summary: 批量创建物权
         */
        public BatchcreateImportassetResponse BatchcreateImportassetEx(BatchcreateImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建物权
         * Summary: 批量创建物权
         */
        public async Task<BatchcreateImportassetResponse> BatchcreateImportassetExAsync(BatchcreateImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加物权描述信息
         * Summary: 添加物权描述信息
         */
        public DescribeImportassetResponse DescribeImportasset(DescribeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 添加物权描述信息
         * Summary: 添加物权描述信息
         */
        public async Task<DescribeImportassetResponse> DescribeImportassetAsync(DescribeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加物权描述信息
         * Summary: 添加物权描述信息
         */
        public DescribeImportassetResponse DescribeImportassetEx(DescribeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加物权描述信息
         * Summary: 添加物权描述信息
         */
        public async Task<DescribeImportassetResponse> DescribeImportassetExAsync(DescribeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量冻结
         * Summary: 批量冻结
         */
        public BatchfreezeImportassetResponse BatchfreezeImportasset(BatchfreezeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchfreezeImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 批量冻结
         * Summary: 批量冻结
         */
        public async Task<BatchfreezeImportassetResponse> BatchfreezeImportassetAsync(BatchfreezeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchfreezeImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量冻结
         * Summary: 批量冻结
         */
        public BatchfreezeImportassetResponse BatchfreezeImportassetEx(BatchfreezeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchfreezeImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.batchfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量冻结
         * Summary: 批量冻结
         */
        public async Task<BatchfreezeImportassetResponse> BatchfreezeImportassetExAsync(BatchfreezeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchfreezeImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.batchfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物权批量解冻
         * Summary: 物权批量解冻
         */
        public BatchunfreezeImportassetResponse BatchunfreezeImportasset(BatchunfreezeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchunfreezeImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 物权批量解冻
         * Summary: 物权批量解冻
         */
        public async Task<BatchunfreezeImportassetResponse> BatchunfreezeImportassetAsync(BatchunfreezeImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchunfreezeImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 物权批量解冻
         * Summary: 物权批量解冻
         */
        public BatchunfreezeImportassetResponse BatchunfreezeImportassetEx(BatchunfreezeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchunfreezeImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.batchunfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物权批量解冻
         * Summary: 物权批量解冻
         */
        public async Task<BatchunfreezeImportassetResponse> BatchunfreezeImportassetExAsync(BatchunfreezeImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchunfreezeImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.batchunfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物权批量撤销
         * Summary: 物权批量撤销
         */
        public BatchcancelImportassetResponse BatchcancelImportasset(BatchcancelImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcancelImportassetEx(request, headers, runtime);
        }

        /**
         * Description: 物权批量撤销
         * Summary: 物权批量撤销
         */
        public async Task<BatchcancelImportassetResponse> BatchcancelImportassetAsync(BatchcancelImportassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcancelImportassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 物权批量撤销
         * Summary: 物权批量撤销
         */
        public BatchcancelImportassetResponse BatchcancelImportassetEx(BatchcancelImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcancelImportassetResponse>(DoRequest("1.0", "blockchain.propertychain.importasset.batchcancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物权批量撤销
         * Summary: 物权批量撤销
         */
        public async Task<BatchcancelImportassetResponse> BatchcancelImportassetExAsync(BatchcancelImportassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcancelImportassetResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.importasset.batchcancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建转让申请
         * Summary: 批量创建转让申请
         */
        public BatchcreateTransferResponse BatchcreateTransfer(BatchcreateTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateTransferEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建转让申请
         * Summary: 批量创建转让申请
         */
        public async Task<BatchcreateTransferResponse> BatchcreateTransferAsync(BatchcreateTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建转让申请
         * Summary: 批量创建转让申请
         */
        public BatchcreateTransferResponse BatchcreateTransferEx(BatchcreateTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTransferResponse>(DoRequest("1.0", "blockchain.propertychain.transfer.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建转让申请
         * Summary: 批量创建转让申请
         */
        public async Task<BatchcreateTransferResponse> BatchcreateTransferExAsync(BatchcreateTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateTransferResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.transfer.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建分润比例配置
         * Summary: 创建分润比例配置
         */
        public CreateCmportProfitrateResponse CreateCmportProfitrate(CreateCmportProfitrateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCmportProfitrateEx(request, headers, runtime);
        }

        /**
         * Description: 创建分润比例配置
         * Summary: 创建分润比例配置
         */
        public async Task<CreateCmportProfitrateResponse> CreateCmportProfitrateAsync(CreateCmportProfitrateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCmportProfitrateExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建分润比例配置
         * Summary: 创建分润比例配置
         */
        public CreateCmportProfitrateResponse CreateCmportProfitrateEx(CreateCmportProfitrateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCmportProfitrateResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.profitrate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建分润比例配置
         * Summary: 创建分润比例配置
         */
        public async Task<CreateCmportProfitrateResponse> CreateCmportProfitrateExAsync(CreateCmportProfitrateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCmportProfitrateResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.profitrate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
         * Summary: 融资申请信息落地到区块链
         */
        public ApplyCmportFinanceResponse ApplyCmportFinance(ApplyCmportFinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyCmportFinanceEx(request, headers, runtime);
        }

        /**
         * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
         * Summary: 融资申请信息落地到区块链
         */
        public async Task<ApplyCmportFinanceResponse> ApplyCmportFinanceAsync(ApplyCmportFinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyCmportFinanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
         * Summary: 融资申请信息落地到区块链
         */
        public ApplyCmportFinanceResponse ApplyCmportFinanceEx(ApplyCmportFinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyCmportFinanceResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.finance.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 粮达网发起融资申请，经过金融平台，然后金融平台再全量同步给区块链应用。
         * Summary: 融资申请信息落地到区块链
         */
        public async Task<ApplyCmportFinanceResponse> ApplyCmportFinanceExAsync(ApplyCmportFinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyCmportFinanceResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.finance.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分润对账，企业到当前记账日期的累计利润信息
         * Summary: 企业分润对账单
         */
        public ListCmportEnterprisestatementResponse ListCmportEnterprisestatement(ListCmportEnterprisestatementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCmportEnterprisestatementEx(request, headers, runtime);
        }

        /**
         * Description: 分润对账，企业到当前记账日期的累计利润信息
         * Summary: 企业分润对账单
         */
        public async Task<ListCmportEnterprisestatementResponse> ListCmportEnterprisestatementAsync(ListCmportEnterprisestatementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCmportEnterprisestatementExAsync(request, headers, runtime);
        }

        /**
         * Description: 分润对账，企业到当前记账日期的累计利润信息
         * Summary: 企业分润对账单
         */
        public ListCmportEnterprisestatementResponse ListCmportEnterprisestatementEx(ListCmportEnterprisestatementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCmportEnterprisestatementResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.enterprisestatement.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分润对账，企业到当前记账日期的累计利润信息
         * Summary: 企业分润对账单
         */
        public async Task<ListCmportEnterprisestatementResponse> ListCmportEnterprisestatementExAsync(ListCmportEnterprisestatementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCmportEnterprisestatementResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.enterprisestatement.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户对账单
         * Summary: 用户对账单
         */
        public ListCmportUserstatementResponse ListCmportUserstatement(ListCmportUserstatementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCmportUserstatementEx(request, headers, runtime);
        }

        /**
         * Description: 用户对账单
         * Summary: 用户对账单
         */
        public async Task<ListCmportUserstatementResponse> ListCmportUserstatementAsync(ListCmportUserstatementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCmportUserstatementExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户对账单
         * Summary: 用户对账单
         */
        public ListCmportUserstatementResponse ListCmportUserstatementEx(ListCmportUserstatementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCmportUserstatementResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.userstatement.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户对账单
         * Summary: 用户对账单
         */
        public async Task<ListCmportUserstatementResponse> ListCmportUserstatementExAsync(ListCmportUserstatementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCmportUserstatementResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.userstatement.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户明细清单
         * Summary: 用户明细清单
         */
        public ListCmportUserprofitResponse ListCmportUserprofit(ListCmportUserprofitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCmportUserprofitEx(request, headers, runtime);
        }

        /**
         * Description: 用户明细清单
         * Summary: 用户明细清单
         */
        public async Task<ListCmportUserprofitResponse> ListCmportUserprofitAsync(ListCmportUserprofitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCmportUserprofitExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户明细清单
         * Summary: 用户明细清单
         */
        public ListCmportUserprofitResponse ListCmportUserprofitEx(ListCmportUserprofitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCmportUserprofitResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.userprofit.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户明细清单
         * Summary: 用户明细清单
         */
        public async Task<ListCmportUserprofitResponse> ListCmportUserprofitExAsync(ListCmportUserprofitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCmportUserprofitResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.userprofit.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 还款本息查询
         * Summary: 还款本息查询
         */
        public QueryCmportBankfeeResponse QueryCmportBankfee(QueryCmportBankfeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCmportBankfeeEx(request, headers, runtime);
        }

        /**
         * Description: 还款本息查询
         * Summary: 还款本息查询
         */
        public async Task<QueryCmportBankfeeResponse> QueryCmportBankfeeAsync(QueryCmportBankfeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCmportBankfeeExAsync(request, headers, runtime);
        }

        /**
         * Description: 还款本息查询
         * Summary: 还款本息查询
         */
        public QueryCmportBankfeeResponse QueryCmportBankfeeEx(QueryCmportBankfeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCmportBankfeeResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.bankfee.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 还款本息查询
         * Summary: 还款本息查询
         */
        public async Task<QueryCmportBankfeeResponse> QueryCmportBankfeeExAsync(QueryCmportBankfeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCmportBankfeeResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.bankfee.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建分润归属配置
         * Summary: 创建分润归属配置
         */
        public CreateCmportProfitpartnerResponse CreateCmportProfitpartner(CreateCmportProfitpartnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCmportProfitpartnerEx(request, headers, runtime);
        }

        /**
         * Description: 创建分润归属配置
         * Summary: 创建分润归属配置
         */
        public async Task<CreateCmportProfitpartnerResponse> CreateCmportProfitpartnerAsync(CreateCmportProfitpartnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCmportProfitpartnerExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建分润归属配置
         * Summary: 创建分润归属配置
         */
        public CreateCmportProfitpartnerResponse CreateCmportProfitpartnerEx(CreateCmportProfitpartnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCmportProfitpartnerResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.profitpartner.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建分润归属配置
         * Summary: 创建分润归属配置
         */
        public async Task<CreateCmportProfitpartnerResponse> CreateCmportProfitpartnerExAsync(CreateCmportProfitpartnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCmportProfitpartnerResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.profitpartner.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监管方（粮达网）撤销融资申请
         * Summary: 撤销融资申请
         */
        public CancelCmportFinanceResponse CancelCmportFinance(CancelCmportFinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelCmportFinanceEx(request, headers, runtime);
        }

        /**
         * Description: 监管方（粮达网）撤销融资申请
         * Summary: 撤销融资申请
         */
        public async Task<CancelCmportFinanceResponse> CancelCmportFinanceAsync(CancelCmportFinanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelCmportFinanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 监管方（粮达网）撤销融资申请
         * Summary: 撤销融资申请
         */
        public CancelCmportFinanceResponse CancelCmportFinanceEx(CancelCmportFinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelCmportFinanceResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.finance.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 监管方（粮达网）撤销融资申请
         * Summary: 撤销融资申请
         */
        public async Task<CancelCmportFinanceResponse> CancelCmportFinanceExAsync(CancelCmportFinanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelCmportFinanceResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.finance.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 银行融资审核结果同步
         * Summary: 银行融资审核结果同步
         */
        public NotifyCmportBankResponse NotifyCmportBank(NotifyCmportBankRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyCmportBankEx(request, headers, runtime);
        }

        /**
         * Description: 银行融资审核结果同步
         * Summary: 银行融资审核结果同步
         */
        public async Task<NotifyCmportBankResponse> NotifyCmportBankAsync(NotifyCmportBankRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyCmportBankExAsync(request, headers, runtime);
        }

        /**
         * Description: 银行融资审核结果同步
         * Summary: 银行融资审核结果同步
         */
        public NotifyCmportBankResponse NotifyCmportBankEx(NotifyCmportBankRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyCmportBankResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.bank.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 银行融资审核结果同步
         * Summary: 银行融资审核结果同步
         */
        public async Task<NotifyCmportBankResponse> NotifyCmportBankExAsync(NotifyCmportBankRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyCmportBankResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.bank.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 银行放款结果同步给区块链
         * Summary: 银行放款结果同步给区块链
         */
        public NotifyCmportLoanResponse NotifyCmportLoan(NotifyCmportLoanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyCmportLoanEx(request, headers, runtime);
        }

        /**
         * Description: 银行放款结果同步给区块链
         * Summary: 银行放款结果同步给区块链
         */
        public async Task<NotifyCmportLoanResponse> NotifyCmportLoanAsync(NotifyCmportLoanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyCmportLoanExAsync(request, headers, runtime);
        }

        /**
         * Description: 银行放款结果同步给区块链
         * Summary: 银行放款结果同步给区块链
         */
        public NotifyCmportLoanResponse NotifyCmportLoanEx(NotifyCmportLoanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyCmportLoanResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.loan.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 银行放款结果同步给区块链
         * Summary: 银行放款结果同步给区块链
         */
        public async Task<NotifyCmportLoanResponse> NotifyCmportLoanExAsync(NotifyCmportLoanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyCmportLoanResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.loan.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 还款结果同步给区块链
         * Summary: 还款结果同步给区块链
         */
        public NotifyCmportRepayResponse NotifyCmportRepay(NotifyCmportRepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyCmportRepayEx(request, headers, runtime);
        }

        /**
         * Description: 还款结果同步给区块链
         * Summary: 还款结果同步给区块链
         */
        public async Task<NotifyCmportRepayResponse> NotifyCmportRepayAsync(NotifyCmportRepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyCmportRepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 还款结果同步给区块链
         * Summary: 还款结果同步给区块链
         */
        public NotifyCmportRepayResponse NotifyCmportRepayEx(NotifyCmportRepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyCmportRepayResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.repay.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 还款结果同步给区块链
         * Summary: 还款结果同步给区块链
         */
        public async Task<NotifyCmportRepayResponse> NotifyCmportRepayExAsync(NotifyCmportRepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyCmportRepayResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.repay.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 还款本息查询-分页
         * Summary: 还款本息查询-分页
         */
        public ListCmportBankfeeResponse ListCmportBankfee(ListCmportBankfeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCmportBankfeeEx(request, headers, runtime);
        }

        /**
         * Description: 还款本息查询-分页
         * Summary: 还款本息查询-分页
         */
        public async Task<ListCmportBankfeeResponse> ListCmportBankfeeAsync(ListCmportBankfeeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCmportBankfeeExAsync(request, headers, runtime);
        }

        /**
         * Description: 还款本息查询-分页
         * Summary: 还款本息查询-分页
         */
        public ListCmportBankfeeResponse ListCmportBankfeeEx(ListCmportBankfeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCmportBankfeeResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.bankfee.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 还款本息查询-分页
         * Summary: 还款本息查询-分页
         */
        public async Task<ListCmportBankfeeResponse> ListCmportBankfeeExAsync(ListCmportBankfeeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCmportBankfeeResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.bankfee.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流轨迹同步给区块链
         * Summary: 物流轨迹同步给区块链
         */
        public NotifyCmportLogisticsResponse NotifyCmportLogistics(NotifyCmportLogisticsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyCmportLogisticsEx(request, headers, runtime);
        }

        /**
         * Description: 物流轨迹同步给区块链
         * Summary: 物流轨迹同步给区块链
         */
        public async Task<NotifyCmportLogisticsResponse> NotifyCmportLogisticsAsync(NotifyCmportLogisticsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyCmportLogisticsExAsync(request, headers, runtime);
        }

        /**
         * Description: 物流轨迹同步给区块链
         * Summary: 物流轨迹同步给区块链
         */
        public NotifyCmportLogisticsResponse NotifyCmportLogisticsEx(NotifyCmportLogisticsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyCmportLogisticsResponse>(DoRequest("1.0", "blockchain.propertychain.cmport.logistics.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物流轨迹同步给区块链
         * Summary: 物流轨迹同步给区块链
         */
        public async Task<NotifyCmportLogisticsResponse> NotifyCmportLogisticsExAsync(NotifyCmportLogisticsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyCmportLogisticsResponse>(await DoRequestAsync("1.0", "blockchain.propertychain.cmport.logistics.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
