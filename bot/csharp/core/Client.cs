// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.BOT.Models;

namespace AntChain.SDK.BOT
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
                        {"sdk_version", "1.8.19"},
                        {"_prod_code", "BOT"},
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
                        {"sdk_version", "1.8.19"},
                        {"_prod_code", "BOT"},
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
         * Description: acec提供的SPI服务开通接口
         * Summary: acec提供的SPI服务开通接口
         */
        public OpenAcecContractResponse OpenAcecContract(OpenAcecContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenAcecContractEx(request, headers, runtime);
        }

        /**
         * Description: acec提供的SPI服务开通接口
         * Summary: acec提供的SPI服务开通接口
         */
        public async Task<OpenAcecContractResponse> OpenAcecContractAsync(OpenAcecContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenAcecContractExAsync(request, headers, runtime);
        }

        /**
         * Description: acec提供的SPI服务开通接口
         * Summary: acec提供的SPI服务开通接口
         */
        public OpenAcecContractResponse OpenAcecContractEx(OpenAcecContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenAcecContractResponse>(DoRequest("1.0", "blockchain.bot.acec.contract.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: acec提供的SPI服务开通接口
         * Summary: acec提供的SPI服务开通接口
         */
        public async Task<OpenAcecContractResponse> OpenAcecContractExAsync(OpenAcecContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenAcecContractResponse>(await DoRequestAsync("1.0", "blockchain.bot.acec.contract.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI服务组提供的SPI服务停止接口
         * Summary: acec提供的SPI服务停止接口
         */
        public StopAcecContractResponse StopAcecContract(StopAcecContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopAcecContractEx(request, headers, runtime);
        }

        /**
         * Description: AI服务组提供的SPI服务停止接口
         * Summary: acec提供的SPI服务停止接口
         */
        public async Task<StopAcecContractResponse> StopAcecContractAsync(StopAcecContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopAcecContractExAsync(request, headers, runtime);
        }

        /**
         * Description: AI服务组提供的SPI服务停止接口
         * Summary: acec提供的SPI服务停止接口
         */
        public StopAcecContractResponse StopAcecContractEx(StopAcecContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopAcecContractResponse>(DoRequest("1.0", "blockchain.bot.acec.contract.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI服务组提供的SPI服务停止接口
         * Summary: acec提供的SPI服务停止接口
         */
        public async Task<StopAcecContractResponse> StopAcecContractExAsync(StopAcecContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopAcecContractResponse>(await DoRequestAsync("1.0", "blockchain.bot.acec.contract.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: acec提供的SPI服务复入接口
         * Summary: acec提供的SPI服务复入接口
         */
        public ResumeAcecContractResponse ResumeAcecContract(ResumeAcecContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeAcecContractEx(request, headers, runtime);
        }

        /**
         * Description: acec提供的SPI服务复入接口
         * Summary: acec提供的SPI服务复入接口
         */
        public async Task<ResumeAcecContractResponse> ResumeAcecContractAsync(ResumeAcecContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeAcecContractExAsync(request, headers, runtime);
        }

        /**
         * Description: acec提供的SPI服务复入接口
         * Summary: acec提供的SPI服务复入接口
         */
        public ResumeAcecContractResponse ResumeAcecContractEx(ResumeAcecContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeAcecContractResponse>(DoRequest("1.0", "blockchain.bot.acec.contract.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: acec提供的SPI服务复入接口
         * Summary: acec提供的SPI服务复入接口
         */
        public async Task<ResumeAcecContractResponse> ResumeAcecContractExAsync(ResumeAcecContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeAcecContractResponse>(await DoRequestAsync("1.0", "blockchain.bot.acec.contract.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁智能中心实人认证创建服务
         * Summary: 租赁智能中心实人认证创建服务
         */
        public CreateLeaseRealpersonResponse CreateLeaseRealperson(CreateLeaseRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateLeaseRealpersonEx(request, headers, runtime);
        }

        /**
         * Description: 租赁智能中心实人认证创建服务
         * Summary: 租赁智能中心实人认证创建服务
         */
        public async Task<CreateLeaseRealpersonResponse> CreateLeaseRealpersonAsync(CreateLeaseRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateLeaseRealpersonExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁智能中心实人认证创建服务
         * Summary: 租赁智能中心实人认证创建服务
         */
        public CreateLeaseRealpersonResponse CreateLeaseRealpersonEx(CreateLeaseRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRealpersonResponse>(DoRequest("1.0", "blockchain.bot.lease.realperson.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁智能中心实人认证创建服务
         * Summary: 租赁智能中心实人认证创建服务
         */
        public async Task<CreateLeaseRealpersonResponse> CreateLeaseRealpersonExAsync(CreateLeaseRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateLeaseRealpersonResponse>(await DoRequestAsync("1.0", "blockchain.bot.lease.realperson.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁智能中心实人认证查询服务
         * Summary: 租赁智能中心实人认证查询服务
         */
        public QueryLeaseRealpersonResponse QueryLeaseRealperson(QueryLeaseRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseRealpersonEx(request, headers, runtime);
        }

        /**
         * Description: 租赁智能中心实人认证查询服务
         * Summary: 租赁智能中心实人认证查询服务
         */
        public async Task<QueryLeaseRealpersonResponse> QueryLeaseRealpersonAsync(QueryLeaseRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseRealpersonExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁智能中心实人认证查询服务
         * Summary: 租赁智能中心实人认证查询服务
         */
        public QueryLeaseRealpersonResponse QueryLeaseRealpersonEx(QueryLeaseRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRealpersonResponse>(DoRequest("1.0", "blockchain.bot.lease.realperson.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁智能中心实人认证查询服务
         * Summary: 租赁智能中心实人认证查询服务
         */
        public async Task<QueryLeaseRealpersonResponse> QueryLeaseRealpersonExAsync(QueryLeaseRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRealpersonResponse>(await DoRequestAsync("1.0", "blockchain.bot.lease.realperson.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁智能中心风控查询服务
         * Summary: 租赁智能中心风控查询服务
         */
        public QueryLeaseRiskResponse QueryLeaseRisk(QueryLeaseRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLeaseRiskEx(request, headers, runtime);
        }

        /**
         * Description: 租赁智能中心风控查询服务
         * Summary: 租赁智能中心风控查询服务
         */
        public async Task<QueryLeaseRiskResponse> QueryLeaseRiskAsync(QueryLeaseRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLeaseRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 租赁智能中心风控查询服务
         * Summary: 租赁智能中心风控查询服务
         */
        public QueryLeaseRiskResponse QueryLeaseRiskEx(QueryLeaseRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRiskResponse>(DoRequest("1.0", "blockchain.bot.lease.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租赁智能中心风控查询服务
         * Summary: 租赁智能中心风控查询服务
         */
        public async Task<QueryLeaseRiskResponse> QueryLeaseRiskExAsync(QueryLeaseRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLeaseRiskResponse>(await DoRequestAsync("1.0", "blockchain.bot.lease.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化配置推送回告API 
         * Summary: 私有化配置推送回告API 
         */
        public FinishTraceConfigResponse FinishTraceConfig(FinishTraceConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishTraceConfigEx(request, headers, runtime);
        }

        /**
         * Description: 私有化配置推送回告API 
         * Summary: 私有化配置推送回告API 
         */
        public async Task<FinishTraceConfigResponse> FinishTraceConfigAsync(FinishTraceConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishTraceConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 私有化配置推送回告API 
         * Summary: 私有化配置推送回告API 
         */
        public FinishTraceConfigResponse FinishTraceConfigEx(FinishTraceConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishTraceConfigResponse>(DoRequest("1.0", "blockchain.bot.trace.config.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化配置推送回告API 
         * Summary: 私有化配置推送回告API 
         */
        public async Task<FinishTraceConfigResponse> FinishTraceConfigExAsync(FinishTraceConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishTraceConfigResponse>(await DoRequestAsync("1.0", "blockchain.bot.trace.config.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: BAI提供的OCR服务接口
         * Summary: BAI提供的OCR服务
         */
        public QueryBaiOcrResponse QueryBaiOcr(QueryBaiOcrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaiOcrEx(request, headers, runtime);
        }

        /**
         * Description: BAI提供的OCR服务接口
         * Summary: BAI提供的OCR服务
         */
        public async Task<QueryBaiOcrResponse> QueryBaiOcrAsync(QueryBaiOcrRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaiOcrExAsync(request, headers, runtime);
        }

        /**
         * Description: BAI提供的OCR服务接口
         * Summary: BAI提供的OCR服务
         */
        public QueryBaiOcrResponse QueryBaiOcrEx(QueryBaiOcrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaiOcrResponse>(DoRequest("1.0", "blockchain.bot.bai.ocr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: BAI提供的OCR服务接口
         * Summary: BAI提供的OCR服务
         */
        public async Task<QueryBaiOcrResponse> QueryBaiOcrExAsync(QueryBaiOcrRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaiOcrResponse>(await DoRequestAsync("1.0", "blockchain.bot.bai.ocr.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI二维码验真
         * Summary: AI二维码验真
         */
        public QueryAiidentificationQrcodeResponse QueryAiidentificationQrcode(QueryAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAiidentificationQrcodeEx(request, headers, runtime);
        }

        /**
         * Description: AI二维码验真
         * Summary: AI二维码验真
         */
        public async Task<QueryAiidentificationQrcodeResponse> QueryAiidentificationQrcodeAsync(QueryAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAiidentificationQrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: AI二维码验真
         * Summary: AI二维码验真
         */
        public QueryAiidentificationQrcodeResponse QueryAiidentificationQrcodeEx(QueryAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "blockchain.bot.aiidentification.qrcode.query",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    QueryAiidentificationQrcodeResponse queryAiidentificationQrcodeResponse = new QueryAiidentificationQrcodeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return queryAiidentificationQrcodeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAiidentificationQrcodeResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.qrcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI二维码验真
         * Summary: AI二维码验真
         */
        public async Task<QueryAiidentificationQrcodeResponse> QueryAiidentificationQrcodeExAsync(QueryAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "blockchain.bot.aiidentification.qrcode.query",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    QueryAiidentificationQrcodeResponse queryAiidentificationQrcodeResponse = new QueryAiidentificationQrcodeResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return queryAiidentificationQrcodeResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAiidentificationQrcodeResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.qrcode.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI商品鉴定
         * Summary: AI商品鉴定
         */
        public QueryAiidentificationGoodsResponse QueryAiidentificationGoods(QueryAiidentificationGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAiidentificationGoodsEx(request, headers, runtime);
        }

        /**
         * Description: AI商品鉴定
         * Summary: AI商品鉴定
         */
        public async Task<QueryAiidentificationGoodsResponse> QueryAiidentificationGoodsAsync(QueryAiidentificationGoodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAiidentificationGoodsExAsync(request, headers, runtime);
        }

        /**
         * Description: AI商品鉴定
         * Summary: AI商品鉴定
         */
        public QueryAiidentificationGoodsResponse QueryAiidentificationGoodsEx(QueryAiidentificationGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAiidentificationGoodsResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.goods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI商品鉴定
         * Summary: AI商品鉴定
         */
        public async Task<QueryAiidentificationGoodsResponse> QueryAiidentificationGoodsExAsync(QueryAiidentificationGoodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAiidentificationGoodsResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.goods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品鉴定点图片检测
         * Summary: 商品鉴定点图片检测
         */
        public CheckAiidentificationGoodspointResponse CheckAiidentificationGoodspoint(CheckAiidentificationGoodspointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAiidentificationGoodspointEx(request, headers, runtime);
        }

        /**
         * Description: 商品鉴定点图片检测
         * Summary: 商品鉴定点图片检测
         */
        public async Task<CheckAiidentificationGoodspointResponse> CheckAiidentificationGoodspointAsync(CheckAiidentificationGoodspointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAiidentificationGoodspointExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品鉴定点图片检测
         * Summary: 商品鉴定点图片检测
         */
        public CheckAiidentificationGoodspointResponse CheckAiidentificationGoodspointEx(CheckAiidentificationGoodspointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAiidentificationGoodspointResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.goodspoint.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品鉴定点图片检测
         * Summary: 商品鉴定点图片检测
         */
        public async Task<CheckAiidentificationGoodspointResponse> CheckAiidentificationGoodspointExAsync(CheckAiidentificationGoodspointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAiidentificationGoodspointResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.goodspoint.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码比对服务
         * Summary: AI溯源码验真
         */
        public CheckAiidentificationQrcodeResponse CheckAiidentificationQrcode(CheckAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAiidentificationQrcodeEx(request, headers, runtime);
        }

        /**
         * Description: 溯源码比对服务
         * Summary: AI溯源码验真
         */
        public async Task<CheckAiidentificationQrcodeResponse> CheckAiidentificationQrcodeAsync(CheckAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAiidentificationQrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 溯源码比对服务
         * Summary: AI溯源码验真
         */
        public CheckAiidentificationQrcodeResponse CheckAiidentificationQrcodeEx(CheckAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAiidentificationQrcodeResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.qrcode.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 溯源码比对服务
         * Summary: AI溯源码验真
         */
        public async Task<CheckAiidentificationQrcodeResponse> CheckAiidentificationQrcodeExAsync(CheckAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAiidentificationQrcodeResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.qrcode.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于生成溯源防伪码
         * Summary: 溯源防伪码生成接口
         */
        public CreateAiidentificationQrcodeResponse CreateAiidentificationQrcode(CreateAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAiidentificationQrcodeEx(request, headers, runtime);
        }

        /**
         * Description: 用于生成溯源防伪码
         * Summary: 溯源防伪码生成接口
         */
        public async Task<CreateAiidentificationQrcodeResponse> CreateAiidentificationQrcodeAsync(CreateAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAiidentificationQrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于生成溯源防伪码
         * Summary: 溯源防伪码生成接口
         */
        public CreateAiidentificationQrcodeResponse CreateAiidentificationQrcodeEx(CreateAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAiidentificationQrcodeResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.qrcode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于生成溯源防伪码
         * Summary: 溯源防伪码生成接口
         */
        public async Task<CreateAiidentificationQrcodeResponse> CreateAiidentificationQrcodeExAsync(CreateAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAiidentificationQrcodeResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.qrcode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B端二维码质检
         * Summary: B端二维码质检
         */
        public VerifyAiidentificationQrcodeResponse VerifyAiidentificationQrcode(VerifyAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyAiidentificationQrcodeEx(request, headers, runtime);
        }

        /**
         * Description: B端二维码质检
         * Summary: B端二维码质检
         */
        public async Task<VerifyAiidentificationQrcodeResponse> VerifyAiidentificationQrcodeAsync(VerifyAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyAiidentificationQrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: B端二维码质检
         * Summary: B端二维码质检
         */
        public VerifyAiidentificationQrcodeResponse VerifyAiidentificationQrcodeEx(VerifyAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyAiidentificationQrcodeResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.qrcode.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B端二维码质检
         * Summary: B端二维码质检
         */
        public async Task<VerifyAiidentificationQrcodeResponse> VerifyAiidentificationQrcodeExAsync(VerifyAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyAiidentificationQrcodeResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.qrcode.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品鉴定
         * Summary: 商品鉴定
         */
        public QueryAiidentificationGoodspointResponse QueryAiidentificationGoodspoint(QueryAiidentificationGoodspointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAiidentificationGoodspointEx(request, headers, runtime);
        }

        /**
         * Description: 商品鉴定
         * Summary: 商品鉴定
         */
        public async Task<QueryAiidentificationGoodspointResponse> QueryAiidentificationGoodspointAsync(QueryAiidentificationGoodspointRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAiidentificationGoodspointExAsync(request, headers, runtime);
        }

        /**
         * Description: 商品鉴定
         * Summary: 商品鉴定
         */
        public QueryAiidentificationGoodspointResponse QueryAiidentificationGoodspointEx(QueryAiidentificationGoodspointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAiidentificationGoodspointResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.goodspoint.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商品鉴定
         * Summary: 商品鉴定
         */
        public async Task<QueryAiidentificationGoodspointResponse> QueryAiidentificationGoodspointExAsync(QueryAiidentificationGoodspointRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAiidentificationGoodspointResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.goodspoint.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI商品数字指纹注册
         * Summary: AI数字指纹注册
         */
        public RegisterAiidentificationGoodsdigitalfingerprintResponse RegisterAiidentificationGoodsdigitalfingerprint(RegisterAiidentificationGoodsdigitalfingerprintRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterAiidentificationGoodsdigitalfingerprintEx(request, headers, runtime);
        }

        /**
         * Description: AI商品数字指纹注册
         * Summary: AI数字指纹注册
         */
        public async Task<RegisterAiidentificationGoodsdigitalfingerprintResponse> RegisterAiidentificationGoodsdigitalfingerprintAsync(RegisterAiidentificationGoodsdigitalfingerprintRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterAiidentificationGoodsdigitalfingerprintExAsync(request, headers, runtime);
        }

        /**
         * Description: AI商品数字指纹注册
         * Summary: AI数字指纹注册
         */
        public RegisterAiidentificationGoodsdigitalfingerprintResponse RegisterAiidentificationGoodsdigitalfingerprintEx(RegisterAiidentificationGoodsdigitalfingerprintRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterAiidentificationGoodsdigitalfingerprintResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.goodsdigitalfingerprint.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI商品数字指纹注册
         * Summary: AI数字指纹注册
         */
        public async Task<RegisterAiidentificationGoodsdigitalfingerprintResponse> RegisterAiidentificationGoodsdigitalfingerprintExAsync(RegisterAiidentificationGoodsdigitalfingerprintRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterAiidentificationGoodsdigitalfingerprintResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.goodsdigitalfingerprint.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI商品数字指纹鉴定
         * Summary: AI商品数字指纹鉴定
         */
        public CheckAiidentificationGoodsdigitalfingerprintResponse CheckAiidentificationGoodsdigitalfingerprint(CheckAiidentificationGoodsdigitalfingerprintRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAiidentificationGoodsdigitalfingerprintEx(request, headers, runtime);
        }

        /**
         * Description: AI商品数字指纹鉴定
         * Summary: AI商品数字指纹鉴定
         */
        public async Task<CheckAiidentificationGoodsdigitalfingerprintResponse> CheckAiidentificationGoodsdigitalfingerprintAsync(CheckAiidentificationGoodsdigitalfingerprintRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAiidentificationGoodsdigitalfingerprintExAsync(request, headers, runtime);
        }

        /**
         * Description: AI商品数字指纹鉴定
         * Summary: AI商品数字指纹鉴定
         */
        public CheckAiidentificationGoodsdigitalfingerprintResponse CheckAiidentificationGoodsdigitalfingerprintEx(CheckAiidentificationGoodsdigitalfingerprintRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAiidentificationGoodsdigitalfingerprintResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.goodsdigitalfingerprint.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: AI商品数字指纹鉴定
         * Summary: AI商品数字指纹鉴定
         */
        public async Task<CheckAiidentificationGoodsdigitalfingerprintResponse> CheckAiidentificationGoodsdigitalfingerprintExAsync(CheckAiidentificationGoodsdigitalfingerprintRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAiidentificationGoodsdigitalfingerprintResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.goodsdigitalfingerprint.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 识别票据上的二维码
         * Summary: AI二维码识别
         */
        public GetAiidentificationQrcodeResponse GetAiidentificationQrcode(GetAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAiidentificationQrcodeEx(request, headers, runtime);
        }

        /**
         * Description: 识别票据上的二维码
         * Summary: AI二维码识别
         */
        public async Task<GetAiidentificationQrcodeResponse> GetAiidentificationQrcodeAsync(GetAiidentificationQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAiidentificationQrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 识别票据上的二维码
         * Summary: AI二维码识别
         */
        public GetAiidentificationQrcodeResponse GetAiidentificationQrcodeEx(GetAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAiidentificationQrcodeResponse>(DoRequest("1.0", "blockchain.bot.aiidentification.qrcode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 识别票据上的二维码
         * Summary: AI二维码识别
         */
        public async Task<GetAiidentificationQrcodeResponse> GetAiidentificationQrcodeExAsync(GetAiidentificationQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAiidentificationQrcodeResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiidentification.qrcode.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot 私有化 设备注册接口
         * Summary: biot 私有化 设备注册接口
         */
        public CreateAcsDeviceResponse CreateAcsDevice(CreateAcsDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAcsDeviceEx(request, headers, runtime);
        }

        /**
         * Description: biot 私有化 设备注册接口
         * Summary: biot 私有化 设备注册接口
         */
        public async Task<CreateAcsDeviceResponse> CreateAcsDeviceAsync(CreateAcsDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAcsDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: biot 私有化 设备注册接口
         * Summary: biot 私有化 设备注册接口
         */
        public CreateAcsDeviceResponse CreateAcsDeviceEx(CreateAcsDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAcsDeviceResponse>(DoRequest("1.0", "blockchain.bot.acs.device.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot 私有化 设备注册接口
         * Summary: biot 私有化 设备注册接口
         */
        public async Task<CreateAcsDeviceResponse> CreateAcsDeviceExAsync(CreateAcsDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAcsDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.acs.device.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot 私有化 业务数据上报
         * Summary: biot 私有化 业务数据上报
         */
        public SendAcsCollectorResponse SendAcsCollector(SendAcsCollectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendAcsCollectorEx(request, headers, runtime);
        }

        /**
         * Description: biot 私有化 业务数据上报
         * Summary: biot 私有化 业务数据上报
         */
        public async Task<SendAcsCollectorResponse> SendAcsCollectorAsync(SendAcsCollectorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendAcsCollectorExAsync(request, headers, runtime);
        }

        /**
         * Description: biot 私有化 业务数据上报
         * Summary: biot 私有化 业务数据上报
         */
        public SendAcsCollectorResponse SendAcsCollectorEx(SendAcsCollectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendAcsCollectorResponse>(DoRequest("1.0", "blockchain.bot.acs.collector.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot 私有化 业务数据上报
         * Summary: biot 私有化 业务数据上报
         */
        public async Task<SendAcsCollectorResponse> SendAcsCollectorExAsync(SendAcsCollectorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendAcsCollectorResponse>(await DoRequestAsync("1.0", "blockchain.bot.acs.collector.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供设备基础信息查询服务
         * Summary: IoT设备平台-设备查询
         */
        public QueryIotbasicDeviceResponse QueryIotbasicDevice(QueryIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotbasicDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 提供设备基础信息查询服务
         * Summary: IoT设备平台-设备查询
         */
        public async Task<QueryIotbasicDeviceResponse> QueryIotbasicDeviceAsync(QueryIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotbasicDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供设备基础信息查询服务
         * Summary: IoT设备平台-设备查询
         */
        public QueryIotbasicDeviceResponse QueryIotbasicDeviceEx(QueryIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicDeviceResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.device.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供设备基础信息查询服务
         * Summary: IoT设备平台-设备查询
         */
        public async Task<QueryIotbasicDeviceResponse> QueryIotbasicDeviceExAsync(QueryIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.device.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT产品开通状态查询
         * Summary: IoT产品开通状态查询
         */
        public RecognizeIotbasicCustomerResponse RecognizeIotbasicCustomer(RecognizeIotbasicCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeIotbasicCustomerEx(request, headers, runtime);
        }

        /**
         * Description: IoT产品开通状态查询
         * Summary: IoT产品开通状态查询
         */
        public async Task<RecognizeIotbasicCustomerResponse> RecognizeIotbasicCustomerAsync(RecognizeIotbasicCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeIotbasicCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT产品开通状态查询
         * Summary: IoT产品开通状态查询
         */
        public RecognizeIotbasicCustomerResponse RecognizeIotbasicCustomerEx(RecognizeIotbasicCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeIotbasicCustomerResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.customer.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT产品开通状态查询
         * Summary: IoT产品开通状态查询
         */
        public async Task<RecognizeIotbasicCustomerResponse> RecognizeIotbasicCustomerExAsync(RecognizeIotbasicCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeIotbasicCustomerResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.customer.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备认证
         * Summary: IoT设备平台-设备认证
         */
        public CertifyIotbasicDeviceResponse CertifyIotbasicDevice(CertifyIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CertifyIotbasicDeviceEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备认证
         * Summary: IoT设备平台-设备认证
         */
        public async Task<CertifyIotbasicDeviceResponse> CertifyIotbasicDeviceAsync(CertifyIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CertifyIotbasicDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备认证
         * Summary: IoT设备平台-设备认证
         */
        public CertifyIotbasicDeviceResponse CertifyIotbasicDeviceEx(CertifyIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIotbasicDeviceResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.device.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备认证
         * Summary: IoT设备平台-设备认证
         */
        public async Task<CertifyIotbasicDeviceResponse> CertifyIotbasicDeviceExAsync(CertifyIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CertifyIotbasicDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.device.certify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
         * Summary: iot平台用户注册操作
         */
        public OperateIotbasicUserResponse OperateIotbasicUser(OperateIotbasicUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicUserEx(request, headers, runtime);
        }

        /**
         * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
         * Summary: iot平台用户注册操作
         */
        public async Task<OperateIotbasicUserResponse> OperateIotbasicUserAsync(OperateIotbasicUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicUserExAsync(request, headers, runtime);
        }

        /**
         * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
         * Summary: iot平台用户注册操作
         */
        public OperateIotbasicUserResponse OperateIotbasicUserEx(OperateIotbasicUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicUserResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.user.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
         * Summary: iot平台用户注册操作
         */
        public async Task<OperateIotbasicUserResponse> OperateIotbasicUserExAsync(OperateIotbasicUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicUserResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.user.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iot 平台权限操作
         * Summary: iot 平台权限操作
         */
        public OperateIotbasicPermissionResponse OperateIotbasicPermission(OperateIotbasicPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicPermissionEx(request, headers, runtime);
        }

        /**
         * Description: iot 平台权限操作
         * Summary: iot 平台权限操作
         */
        public async Task<OperateIotbasicPermissionResponse> OperateIotbasicPermissionAsync(OperateIotbasicPermissionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicPermissionExAsync(request, headers, runtime);
        }

        /**
         * Description: iot 平台权限操作
         * Summary: iot 平台权限操作
         */
        public OperateIotbasicPermissionResponse OperateIotbasicPermissionEx(OperateIotbasicPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicPermissionResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.permission.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iot 平台权限操作
         * Summary: iot 平台权限操作
         */
        public async Task<OperateIotbasicPermissionResponse> OperateIotbasicPermissionExAsync(OperateIotbasicPermissionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicPermissionResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.permission.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备sn列表查询
         * Summary: IoT设备平台-设备sn列表查询
         */
        public QueryIotbasicSnResponse QueryIotbasicSn(QueryIotbasicSnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotbasicSnEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备sn列表查询
         * Summary: IoT设备平台-设备sn列表查询
         */
        public async Task<QueryIotbasicSnResponse> QueryIotbasicSnAsync(QueryIotbasicSnRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotbasicSnExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备sn列表查询
         * Summary: IoT设备平台-设备sn列表查询
         */
        public QueryIotbasicSnResponse QueryIotbasicSnEx(QueryIotbasicSnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicSnResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.sn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备sn列表查询
         * Summary: IoT设备平台-设备sn列表查询
         */
        public async Task<QueryIotbasicSnResponse> QueryIotbasicSnExAsync(QueryIotbasicSnRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicSnResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.sn.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备规格查询
         * Summary: IoT设备平台-设备规格查询
         */
        public QueryDeviceSpecsResponse QueryDeviceSpecs(QueryDeviceSpecsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceSpecsEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备规格查询
         * Summary: IoT设备平台-设备规格查询
         */
        public async Task<QueryDeviceSpecsResponse> QueryDeviceSpecsAsync(QueryDeviceSpecsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceSpecsExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备规格查询
         * Summary: IoT设备平台-设备规格查询
         */
        public QueryDeviceSpecsResponse QueryDeviceSpecsEx(QueryDeviceSpecsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceSpecsResponse>(DoRequest("1.0", "blockchain.bot.device.specs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备规格查询
         * Summary: IoT设备平台-设备规格查询
         */
        public async Task<QueryDeviceSpecsResponse> QueryDeviceSpecsExAsync(QueryDeviceSpecsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceSpecsResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.specs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备规格关系维护
         * Summary: IoT设备平台-设备规格关系维护
         */
        public OperateIotbasicRelrationResponse OperateIotbasicRelration(OperateIotbasicRelrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicRelrationEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备规格关系维护
         * Summary: IoT设备平台-设备规格关系维护
         */
        public async Task<OperateIotbasicRelrationResponse> OperateIotbasicRelrationAsync(OperateIotbasicRelrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicRelrationExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备规格关系维护
         * Summary: IoT设备平台-设备规格关系维护
         */
        public OperateIotbasicRelrationResponse OperateIotbasicRelrationEx(OperateIotbasicRelrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicRelrationResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.relration.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备规格关系维护
         * Summary: IoT设备平台-设备规格关系维护
         */
        public async Task<OperateIotbasicRelrationResponse> OperateIotbasicRelrationExAsync(OperateIotbasicRelrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicRelrationResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.relration.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备字典数据维护
         * Summary: IoT设备平台-设备字典数据维护
         */
        public OperateIotbasicDictionaryResponse OperateIotbasicDictionary(OperateIotbasicDictionaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicDictionaryEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备字典数据维护
         * Summary: IoT设备平台-设备字典数据维护
         */
        public async Task<OperateIotbasicDictionaryResponse> OperateIotbasicDictionaryAsync(OperateIotbasicDictionaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicDictionaryExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备字典数据维护
         * Summary: IoT设备平台-设备字典数据维护
         */
        public OperateIotbasicDictionaryResponse OperateIotbasicDictionaryEx(OperateIotbasicDictionaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicDictionaryResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.dictionary.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备字典数据维护
         * Summary: IoT设备平台-设备字典数据维护
         */
        public async Task<OperateIotbasicDictionaryResponse> OperateIotbasicDictionaryExAsync(OperateIotbasicDictionaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicDictionaryResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.dictionary.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备品类数据维护
         * Summary: IoT设备平台-设备品类数据维护
         */
        public OperateIotbasicCategoryResponse OperateIotbasicCategory(OperateIotbasicCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicCategoryEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备品类数据维护
         * Summary: IoT设备平台-设备品类数据维护
         */
        public async Task<OperateIotbasicCategoryResponse> OperateIotbasicCategoryAsync(OperateIotbasicCategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicCategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备品类数据维护
         * Summary: IoT设备平台-设备品类数据维护
         */
        public OperateIotbasicCategoryResponse OperateIotbasicCategoryEx(OperateIotbasicCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicCategoryResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.category.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备品类数据维护
         * Summary: IoT设备平台-设备品类数据维护
         */
        public async Task<OperateIotbasicCategoryResponse> OperateIotbasicCategoryExAsync(OperateIotbasicCategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicCategoryResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.category.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备管控配置维护
         * Summary: IoT设备平台-设备管控配置维护
         */
        public OperateIotbasicControlconfigResponse OperateIotbasicControlconfig(OperateIotbasicControlconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicControlconfigEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备管控配置维护
         * Summary: IoT设备平台-设备管控配置维护
         */
        public async Task<OperateIotbasicControlconfigResponse> OperateIotbasicControlconfigAsync(OperateIotbasicControlconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicControlconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备管控配置维护
         * Summary: IoT设备平台-设备管控配置维护
         */
        public OperateIotbasicControlconfigResponse OperateIotbasicControlconfigEx(OperateIotbasicControlconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicControlconfigResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.controlconfig.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备管控配置维护
         * Summary: IoT设备平台-设备管控配置维护
         */
        public async Task<OperateIotbasicControlconfigResponse> OperateIotbasicControlconfigExAsync(OperateIotbasicControlconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicControlconfigResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.controlconfig.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-上链业务模型配置维护
         * Summary: IoT设备平台-上链业务模型配置维护
         */
        public OperateIotbasicChainmodelResponse OperateIotbasicChainmodel(OperateIotbasicChainmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicChainmodelEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-上链业务模型配置维护
         * Summary: IoT设备平台-上链业务模型配置维护
         */
        public async Task<OperateIotbasicChainmodelResponse> OperateIotbasicChainmodelAsync(OperateIotbasicChainmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicChainmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-上链业务模型配置维护
         * Summary: IoT设备平台-上链业务模型配置维护
         */
        public OperateIotbasicChainmodelResponse OperateIotbasicChainmodelEx(OperateIotbasicChainmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicChainmodelResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.chainmodel.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-上链业务模型配置维护
         * Summary: IoT设备平台-上链业务模型配置维护
         */
        public async Task<OperateIotbasicChainmodelResponse> OperateIotbasicChainmodelExAsync(OperateIotbasicChainmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicChainmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.chainmodel.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备不可操作标记更新
         * Summary: IoT设备平台-设备不可操作标记更新
         */
        public OperateIotbasicDeviceResponse OperateIotbasicDevice(OperateIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicDeviceEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备不可操作标记更新
         * Summary: IoT设备平台-设备不可操作标记更新
         */
        public async Task<OperateIotbasicDeviceResponse> OperateIotbasicDeviceAsync(OperateIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备不可操作标记更新
         * Summary: IoT设备平台-设备不可操作标记更新
         */
        public OperateIotbasicDeviceResponse OperateIotbasicDeviceEx(OperateIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicDeviceResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.device.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备不可操作标记更新
         * Summary: IoT设备平台-设备不可操作标记更新
         */
        public async Task<OperateIotbasicDeviceResponse> OperateIotbasicDeviceExAsync(OperateIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.device.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot设备注册-创建设备
         * Summary: biot设备注册-创建设备
         */
        public CreateIotbasicDeviceResponse CreateIotbasicDevice(CreateIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIotbasicDeviceEx(request, headers, runtime);
        }

        /**
         * Description: biot设备注册-创建设备
         * Summary: biot设备注册-创建设备
         */
        public async Task<CreateIotbasicDeviceResponse> CreateIotbasicDeviceAsync(CreateIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIotbasicDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: biot设备注册-创建设备
         * Summary: biot设备注册-创建设备
         */
        public CreateIotbasicDeviceResponse CreateIotbasicDeviceEx(CreateIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIotbasicDeviceResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.device.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot设备注册-创建设备
         * Summary: biot设备注册-创建设备
         */
        public async Task<CreateIotbasicDeviceResponse> CreateIotbasicDeviceExAsync(CreateIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIotbasicDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.device.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot设备注册-批量创建设备
         * Summary: biot设备注册-批量创建设备
         */
        public BatchcreateIotbasicDeviceResponse BatchcreateIotbasicDevice(BatchcreateIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateIotbasicDeviceEx(request, headers, runtime);
        }

        /**
         * Description: biot设备注册-批量创建设备
         * Summary: biot设备注册-批量创建设备
         */
        public async Task<BatchcreateIotbasicDeviceResponse> BatchcreateIotbasicDeviceAsync(BatchcreateIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateIotbasicDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: biot设备注册-批量创建设备
         * Summary: biot设备注册-批量创建设备
         */
        public BatchcreateIotbasicDeviceResponse BatchcreateIotbasicDeviceEx(BatchcreateIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateIotbasicDeviceResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.device.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot设备注册-批量创建设备
         * Summary: biot设备注册-批量创建设备
         */
        public async Task<BatchcreateIotbasicDeviceResponse> BatchcreateIotbasicDeviceExAsync(BatchcreateIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateIotbasicDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.device.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot设备状态同步
         * Summary: iot平台-设备状态同步
         */
        public SyncIotbasicDevicestatusResponse SyncIotbasicDevicestatus(SyncIotbasicDevicestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncIotbasicDevicestatusEx(request, headers, runtime);
        }

        /**
         * Description: biot设备状态同步
         * Summary: iot平台-设备状态同步
         */
        public async Task<SyncIotbasicDevicestatusResponse> SyncIotbasicDevicestatusAsync(SyncIotbasicDevicestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncIotbasicDevicestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: biot设备状态同步
         * Summary: iot平台-设备状态同步
         */
        public SyncIotbasicDevicestatusResponse SyncIotbasicDevicestatusEx(SyncIotbasicDevicestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncIotbasicDevicestatusResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.devicestatus.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot设备状态同步
         * Summary: iot平台-设备状态同步
         */
        public async Task<SyncIotbasicDevicestatusResponse> SyncIotbasicDevicestatusExAsync(SyncIotbasicDevicestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncIotbasicDevicestatusResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.devicestatus.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot设备-安全认证
         * Summary: biot设备-安全认证
         */
        public VerifyIotbasicIdentifyResponse VerifyIotbasicIdentify(VerifyIotbasicIdentifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return VerifyIotbasicIdentifyEx(request, headers, runtime);
        }

        /**
         * Description: biot设备-安全认证
         * Summary: biot设备-安全认证
         */
        public async Task<VerifyIotbasicIdentifyResponse> VerifyIotbasicIdentifyAsync(VerifyIotbasicIdentifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await VerifyIotbasicIdentifyExAsync(request, headers, runtime);
        }

        /**
         * Description: biot设备-安全认证
         * Summary: biot设备-安全认证
         */
        public VerifyIotbasicIdentifyResponse VerifyIotbasicIdentifyEx(VerifyIotbasicIdentifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyIotbasicIdentifyResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.identify.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: biot设备-安全认证
         * Summary: biot设备-安全认证
         */
        public async Task<VerifyIotbasicIdentifyResponse> VerifyIotbasicIdentifyExAsync(VerifyIotbasicIdentifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<VerifyIotbasicIdentifyResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.identify.verify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-更新设备信息
         * Summary: IoT设备平台-更新设备信息
         */
        public UpdateIotbasicDeviceResponse UpdateIotbasicDevice(UpdateIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIotbasicDeviceEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-更新设备信息
         * Summary: IoT设备平台-更新设备信息
         */
        public async Task<UpdateIotbasicDeviceResponse> UpdateIotbasicDeviceAsync(UpdateIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIotbasicDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-更新设备信息
         * Summary: IoT设备平台-更新设备信息
         */
        public UpdateIotbasicDeviceResponse UpdateIotbasicDeviceEx(UpdateIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotbasicDeviceResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.device.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-更新设备信息
         * Summary: IoT设备平台-更新设备信息
         */
        public async Task<UpdateIotbasicDeviceResponse> UpdateIotbasicDeviceExAsync(UpdateIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotbasicDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.device.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备上链
         * Summary: IoT设备平台-设备上链
         */
        public OperateIotbasicDevicecollectResponse OperateIotbasicDevicecollect(OperateIotbasicDevicecollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicDevicecollectEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备上链
         * Summary: IoT设备平台-设备上链
         */
        public async Task<OperateIotbasicDevicecollectResponse> OperateIotbasicDevicecollectAsync(OperateIotbasicDevicecollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicDevicecollectExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备上链
         * Summary: IoT设备平台-设备上链
         */
        public OperateIotbasicDevicecollectResponse OperateIotbasicDevicecollectEx(OperateIotbasicDevicecollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicDevicecollectResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.devicecollect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备上链
         * Summary: IoT设备平台-设备上链
         */
        public async Task<OperateIotbasicDevicecollectResponse> OperateIotbasicDevicecollectExAsync(OperateIotbasicDevicecollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicDevicecollectResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.devicecollect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-项目空间数据维护
         * Summary: IoT设备平台-项目空间数据维护
         */
        public OperateIotbasicProjectspaceResponse OperateIotbasicProjectspace(OperateIotbasicProjectspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicProjectspaceEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-项目空间数据维护
         * Summary: IoT设备平台-项目空间数据维护
         */
        public async Task<OperateIotbasicProjectspaceResponse> OperateIotbasicProjectspaceAsync(OperateIotbasicProjectspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicProjectspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-项目空间数据维护
         * Summary: IoT设备平台-项目空间数据维护
         */
        public OperateIotbasicProjectspaceResponse OperateIotbasicProjectspaceEx(OperateIotbasicProjectspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicProjectspaceResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.projectspace.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-项目空间数据维护
         * Summary: IoT设备平台-项目空间数据维护
         */
        public async Task<OperateIotbasicProjectspaceResponse> OperateIotbasicProjectspaceExAsync(OperateIotbasicProjectspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicProjectspaceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.projectspace.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-企业信息同步(个人房东)
         * Summary: 租房saas-企业信息同步(个人房东)
         */
        public PushRentMerchantResponse PushRentMerchant(PushRentMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushRentMerchantEx(request, headers, runtime);
        }

        /**
         * Description: 租房saas-企业信息同步(个人房东)
         * Summary: 租房saas-企业信息同步(个人房东)
         */
        public async Task<PushRentMerchantResponse> PushRentMerchantAsync(PushRentMerchantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushRentMerchantExAsync(request, headers, runtime);
        }

        /**
         * Description: 租房saas-企业信息同步(个人房东)
         * Summary: 租房saas-企业信息同步(个人房东)
         */
        public PushRentMerchantResponse PushRentMerchantEx(PushRentMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRentMerchantResponse>(DoRequest("1.0", "blockchain.bot.rent.merchant.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-企业信息同步(个人房东)
         * Summary: 租房saas-企业信息同步(个人房东)
         */
        public async Task<PushRentMerchantResponse> PushRentMerchantExAsync(PushRentMerchantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRentMerchantResponse>(await DoRequestAsync("1.0", "blockchain.bot.rent.merchant.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-业主账单信息同步
         * Summary: 租房saas-业主账单信息同步
         */
        public PushRentBillResponse PushRentBill(PushRentBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushRentBillEx(request, headers, runtime);
        }

        /**
         * Description: 租房saas-业主账单信息同步
         * Summary: 租房saas-业主账单信息同步
         */
        public async Task<PushRentBillResponse> PushRentBillAsync(PushRentBillRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushRentBillExAsync(request, headers, runtime);
        }

        /**
         * Description: 租房saas-业主账单信息同步
         * Summary: 租房saas-业主账单信息同步
         */
        public PushRentBillResponse PushRentBillEx(PushRentBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRentBillResponse>(DoRequest("1.0", "blockchain.bot.rent.bill.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-业主账单信息同步
         * Summary: 租房saas-业主账单信息同步
         */
        public async Task<PushRentBillResponse> PushRentBillExAsync(PushRentBillRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRentBillResponse>(await DoRequestAsync("1.0", "blockchain.bot.rent.bill.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-租客入住信息同步
         * Summary: 租房saas-租客入住信息同步
         */
        public PushRentRenterResponse PushRentRenter(PushRentRenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushRentRenterEx(request, headers, runtime);
        }

        /**
         * Description: 租房saas-租客入住信息同步
         * Summary: 租房saas-租客入住信息同步
         */
        public async Task<PushRentRenterResponse> PushRentRenterAsync(PushRentRenterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushRentRenterExAsync(request, headers, runtime);
        }

        /**
         * Description: 租房saas-租客入住信息同步
         * Summary: 租房saas-租客入住信息同步
         */
        public PushRentRenterResponse PushRentRenterEx(PushRentRenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRentRenterResponse>(DoRequest("1.0", "blockchain.bot.rent.renter.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-租客入住信息同步
         * Summary: 租房saas-租客入住信息同步
         */
        public async Task<PushRentRenterResponse> PushRentRenterExAsync(PushRentRenterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRentRenterResponse>(await DoRequestAsync("1.0", "blockchain.bot.rent.renter.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-租金缴纳支付状态通知
         * Summary: 租房saas-租金缴纳支付状态通知
         */
        public SyncRentRentpaymentResponse SyncRentRentpayment(SyncRentRentpaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncRentRentpaymentEx(request, headers, runtime);
        }

        /**
         * Description: 租房saas-租金缴纳支付状态通知
         * Summary: 租房saas-租金缴纳支付状态通知
         */
        public async Task<SyncRentRentpaymentResponse> SyncRentRentpaymentAsync(SyncRentRentpaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncRentRentpaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 租房saas-租金缴纳支付状态通知
         * Summary: 租房saas-租金缴纳支付状态通知
         */
        public SyncRentRentpaymentResponse SyncRentRentpaymentEx(SyncRentRentpaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncRentRentpaymentResponse>(DoRequest("1.0", "blockchain.bot.rent.rentpayment.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-租金缴纳支付状态通知
         * Summary: 租房saas-租金缴纳支付状态通知
         */
        public async Task<SyncRentRentpaymentResponse> SyncRentRentpaymentExAsync(SyncRentRentpaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncRentRentpaymentResponse>(await DoRequestAsync("1.0", "blockchain.bot.rent.rentpayment.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-房源信息同步
         * Summary: 租房saas-房源信息同步
         */
        public PushRentHouseResponse PushRentHouse(PushRentHouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushRentHouseEx(request, headers, runtime);
        }

        /**
         * Description: 租房saas-房源信息同步
         * Summary: 租房saas-房源信息同步
         */
        public async Task<PushRentHouseResponse> PushRentHouseAsync(PushRentHouseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushRentHouseExAsync(request, headers, runtime);
        }

        /**
         * Description: 租房saas-房源信息同步
         * Summary: 租房saas-房源信息同步
         */
        public PushRentHouseResponse PushRentHouseEx(PushRentHouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRentHouseResponse>(DoRequest("1.0", "blockchain.bot.rent.house.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租房saas-房源信息同步
         * Summary: 租房saas-房源信息同步
         */
        public async Task<PushRentHouseResponse> PushRentHouseExAsync(PushRentHouseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushRentHouseResponse>(await DoRequestAsync("1.0", "blockchain.bot.rent.house.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-生成设备认证密钥
         * Summary: IoT设备平台-生成设备认证密钥
         */
        public SyncIotbasicDevicegenerateResponse SyncIotbasicDevicegenerate(SyncIotbasicDevicegenerateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncIotbasicDevicegenerateEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-生成设备认证密钥
         * Summary: IoT设备平台-生成设备认证密钥
         */
        public async Task<SyncIotbasicDevicegenerateResponse> SyncIotbasicDevicegenerateAsync(SyncIotbasicDevicegenerateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncIotbasicDevicegenerateExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-生成设备认证密钥
         * Summary: IoT设备平台-生成设备认证密钥
         */
        public SyncIotbasicDevicegenerateResponse SyncIotbasicDevicegenerateEx(SyncIotbasicDevicegenerateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncIotbasicDevicegenerateResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.devicegenerate.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-生成设备认证密钥
         * Summary: IoT设备平台-生成设备认证密钥
         */
        public async Task<SyncIotbasicDevicegenerateResponse> SyncIotbasicDevicegenerateExAsync(SyncIotbasicDevicegenerateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncIotbasicDevicegenerateResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.devicegenerate.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-批量数据上链
         * Summary: IoT设备平台-批量数据上链
         */
        public OperateIotbasicBatchcollectResponse OperateIotbasicBatchcollect(OperateIotbasicBatchcollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicBatchcollectEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-批量数据上链
         * Summary: IoT设备平台-批量数据上链
         */
        public async Task<OperateIotbasicBatchcollectResponse> OperateIotbasicBatchcollectAsync(OperateIotbasicBatchcollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicBatchcollectExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-批量数据上链
         * Summary: IoT设备平台-批量数据上链
         */
        public OperateIotbasicBatchcollectResponse OperateIotbasicBatchcollectEx(OperateIotbasicBatchcollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicBatchcollectResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.batchcollect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-批量数据上链
         * Summary: IoT设备平台-批量数据上链
         */
        public async Task<OperateIotbasicBatchcollectResponse> OperateIotbasicBatchcollectExAsync(OperateIotbasicBatchcollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicBatchcollectResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.batchcollect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备订单导入
         * Summary: IoT设备平台-设备订单导入
         */
        public ImportIotbasicDeviceorderResponse ImportIotbasicDeviceorder(ImportIotbasicDeviceorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportIotbasicDeviceorderEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备订单导入
         * Summary: IoT设备平台-设备订单导入
         */
        public async Task<ImportIotbasicDeviceorderResponse> ImportIotbasicDeviceorderAsync(ImportIotbasicDeviceorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportIotbasicDeviceorderExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备订单导入
         * Summary: IoT设备平台-设备订单导入
         */
        public ImportIotbasicDeviceorderResponse ImportIotbasicDeviceorderEx(ImportIotbasicDeviceorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIotbasicDeviceorderResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.deviceorder.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备订单导入
         * Summary: IoT设备平台-设备订单导入
         */
        public async Task<ImportIotbasicDeviceorderResponse> ImportIotbasicDeviceorderExAsync(ImportIotbasicDeviceorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIotbasicDeviceorderResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.deviceorder.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-订单批量同步
         * Summary: IoT设备平台-订单批量同步
         */
        public ImportIotbasicDeviceorderbatchResponse ImportIotbasicDeviceorderbatch(ImportIotbasicDeviceorderbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportIotbasicDeviceorderbatchEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-订单批量同步
         * Summary: IoT设备平台-订单批量同步
         */
        public async Task<ImportIotbasicDeviceorderbatchResponse> ImportIotbasicDeviceorderbatchAsync(ImportIotbasicDeviceorderbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportIotbasicDeviceorderbatchExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-订单批量同步
         * Summary: IoT设备平台-订单批量同步
         */
        public ImportIotbasicDeviceorderbatchResponse ImportIotbasicDeviceorderbatchEx(ImportIotbasicDeviceorderbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIotbasicDeviceorderbatchResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.deviceorderbatch.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-订单批量同步
         * Summary: IoT设备平台-订单批量同步
         */
        public async Task<ImportIotbasicDeviceorderbatchResponse> ImportIotbasicDeviceorderbatchExAsync(ImportIotbasicDeviceorderbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIotbasicDeviceorderbatchResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.deviceorderbatch.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-删除设备信息
         * Summary: IoT设备平台-删除设备信息
         */
        public DeleteIotbasicDeviceResponse DeleteIotbasicDevice(DeleteIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteIotbasicDeviceEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-删除设备信息
         * Summary: IoT设备平台-删除设备信息
         */
        public async Task<DeleteIotbasicDeviceResponse> DeleteIotbasicDeviceAsync(DeleteIotbasicDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteIotbasicDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-删除设备信息
         * Summary: IoT设备平台-删除设备信息
         */
        public DeleteIotbasicDeviceResponse DeleteIotbasicDeviceEx(DeleteIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIotbasicDeviceResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.device.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-删除设备信息
         * Summary: IoT设备平台-删除设备信息
         */
        public async Task<DeleteIotbasicDeviceResponse> DeleteIotbasicDeviceExAsync(DeleteIotbasicDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIotbasicDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.device.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备远程管控
         * Summary: IoT设备平台-设备远程管控
         */
        public OperateIotbasicDevicecontrolResponse OperateIotbasicDevicecontrol(OperateIotbasicDevicecontrolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicDevicecontrolEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备远程管控
         * Summary: IoT设备平台-设备远程管控
         */
        public async Task<OperateIotbasicDevicecontrolResponse> OperateIotbasicDevicecontrolAsync(OperateIotbasicDevicecontrolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicDevicecontrolExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备远程管控
         * Summary: IoT设备平台-设备远程管控
         */
        public OperateIotbasicDevicecontrolResponse OperateIotbasicDevicecontrolEx(OperateIotbasicDevicecontrolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicDevicecontrolResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.devicecontrol.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备远程管控
         * Summary: IoT设备平台-设备远程管控
         */
        public async Task<OperateIotbasicDevicecontrolResponse> OperateIotbasicDevicecontrolExAsync(OperateIotbasicDevicecontrolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicDevicecontrolResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.devicecontrol.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备注册结果查询
         * Summary: IoT设备平台-设备注册结果查询
         */
        public QueryDeviceRegisterresultResponse QueryDeviceRegisterresult(QueryDeviceRegisterresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceRegisterresultEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备注册结果查询
         * Summary: IoT设备平台-设备注册结果查询
         */
        public async Task<QueryDeviceRegisterresultResponse> QueryDeviceRegisterresultAsync(QueryDeviceRegisterresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceRegisterresultExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备注册结果查询
         * Summary: IoT设备平台-设备注册结果查询
         */
        public QueryDeviceRegisterresultResponse QueryDeviceRegisterresultEx(QueryDeviceRegisterresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceRegisterresultResponse>(DoRequest("1.0", "blockchain.bot.device.registerresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备注册结果查询
         * Summary: IoT设备平台-设备注册结果查询
         */
        public async Task<QueryDeviceRegisterresultResponse> QueryDeviceRegisterresultExAsync(QueryDeviceRegisterresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceRegisterresultResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.registerresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备状态查询
         * Summary: IoT设备平台-设备状态查询
         */
        public QueryDeviceStatusResponse QueryDeviceStatus(QueryDeviceStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceStatusEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备状态查询
         * Summary: IoT设备平台-设备状态查询
         */
        public async Task<QueryDeviceStatusResponse> QueryDeviceStatusAsync(QueryDeviceStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备状态查询
         * Summary: IoT设备平台-设备状态查询
         */
        public QueryDeviceStatusResponse QueryDeviceStatusEx(QueryDeviceStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceStatusResponse>(DoRequest("1.0", "blockchain.bot.device.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备状态查询
         * Summary: IoT设备平台-设备状态查询
         */
        public async Task<QueryDeviceStatusResponse> QueryDeviceStatusExAsync(QueryDeviceStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceStatusResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-openApi操作
         * Summary: IoT设备平台-openApi操作
         */
        public OperateIotbasicOpenapiResponse OperateIotbasicOpenapi(OperateIotbasicOpenapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateIotbasicOpenapiEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-openApi操作
         * Summary: IoT设备平台-openApi操作
         */
        public async Task<OperateIotbasicOpenapiResponse> OperateIotbasicOpenapiAsync(OperateIotbasicOpenapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateIotbasicOpenapiExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-openApi操作
         * Summary: IoT设备平台-openApi操作
         */
        public OperateIotbasicOpenapiResponse OperateIotbasicOpenapiEx(OperateIotbasicOpenapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicOpenapiResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.openapi.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-openApi操作
         * Summary: IoT设备平台-openApi操作
         */
        public async Task<OperateIotbasicOpenapiResponse> OperateIotbasicOpenapiExAsync(OperateIotbasicOpenapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateIotbasicOpenapiResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.openapi.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上链数据分页查询
         * Summary: 上链数据分页查询
         */
        public QueryIotbasicDevicecollectResponse QueryIotbasicDevicecollect(QueryIotbasicDevicecollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotbasicDevicecollectEx(request, headers, runtime);
        }

        /**
         * Description: 上链数据分页查询
         * Summary: 上链数据分页查询
         */
        public async Task<QueryIotbasicDevicecollectResponse> QueryIotbasicDevicecollectAsync(QueryIotbasicDevicecollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotbasicDevicecollectExAsync(request, headers, runtime);
        }

        /**
         * Description: 上链数据分页查询
         * Summary: 上链数据分页查询
         */
        public QueryIotbasicDevicecollectResponse QueryIotbasicDevicecollectEx(QueryIotbasicDevicecollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicDevicecollectResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.devicecollect.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上链数据分页查询
         * Summary: 上链数据分页查询
         */
        public async Task<QueryIotbasicDevicecollectResponse> QueryIotbasicDevicecollectExAsync(QueryIotbasicDevicecollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicDevicecollectResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.devicecollect.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单上链数据分页查询
         * Summary: 订单上链数据分页查询
         */
        public QueryIotbasicDeviceorderResponse QueryIotbasicDeviceorder(QueryIotbasicDeviceorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotbasicDeviceorderEx(request, headers, runtime);
        }

        /**
         * Description: 订单上链数据分页查询
         * Summary: 订单上链数据分页查询
         */
        public async Task<QueryIotbasicDeviceorderResponse> QueryIotbasicDeviceorderAsync(QueryIotbasicDeviceorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotbasicDeviceorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 订单上链数据分页查询
         * Summary: 订单上链数据分页查询
         */
        public QueryIotbasicDeviceorderResponse QueryIotbasicDeviceorderEx(QueryIotbasicDeviceorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicDeviceorderResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.deviceorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 订单上链数据分页查询
         * Summary: 订单上链数据分页查询
         */
        public async Task<QueryIotbasicDeviceorderResponse> QueryIotbasicDeviceorderExAsync(QueryIotbasicDeviceorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicDeviceorderResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.deviceorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-订单数据推送中台
         * Summary: IoT设备平台-订单数据推送中台
         */
        public PushIotbasicMeterdataResponse PushIotbasicMeterdata(PushIotbasicMeterdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushIotbasicMeterdataEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-订单数据推送中台
         * Summary: IoT设备平台-订单数据推送中台
         */
        public async Task<PushIotbasicMeterdataResponse> PushIotbasicMeterdataAsync(PushIotbasicMeterdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushIotbasicMeterdataExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-订单数据推送中台
         * Summary: IoT设备平台-订单数据推送中台
         */
        public PushIotbasicMeterdataResponse PushIotbasicMeterdataEx(PushIotbasicMeterdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushIotbasicMeterdataResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.meterdata.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-订单数据推送中台
         * Summary: IoT设备平台-订单数据推送中台
         */
        public async Task<PushIotbasicMeterdataResponse> PushIotbasicMeterdataExAsync(PushIotbasicMeterdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushIotbasicMeterdataResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.meterdata.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-客户新增
         * Summary: IoT设备平台-中台签约客户同步
         */
        public SaveIotbasicCustomerResponse SaveIotbasicCustomer(SaveIotbasicCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveIotbasicCustomerEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-客户新增
         * Summary: IoT设备平台-中台签约客户同步
         */
        public async Task<SaveIotbasicCustomerResponse> SaveIotbasicCustomerAsync(SaveIotbasicCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveIotbasicCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-客户新增
         * Summary: IoT设备平台-中台签约客户同步
         */
        public SaveIotbasicCustomerResponse SaveIotbasicCustomerEx(SaveIotbasicCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveIotbasicCustomerResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.customer.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-客户新增
         * Summary: IoT设备平台-中台签约客户同步
         */
        public async Task<SaveIotbasicCustomerResponse> SaveIotbasicCustomerExAsync(SaveIotbasicCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveIotbasicCustomerResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.customer.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据设备串号查询采购设备
         * Summary: 根据设备串号查询采购设备
         */
        public QueryIotplatformPurchaseorderResponse QueryIotplatformPurchaseorder(QueryIotplatformPurchaseorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotplatformPurchaseorderEx(request, headers, runtime);
        }

        /**
         * Description: 根据设备串号查询采购设备
         * Summary: 根据设备串号查询采购设备
         */
        public async Task<QueryIotplatformPurchaseorderResponse> QueryIotplatformPurchaseorderAsync(QueryIotplatformPurchaseorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotplatformPurchaseorderExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据设备串号查询采购设备
         * Summary: 根据设备串号查询采购设备
         */
        public QueryIotplatformPurchaseorderResponse QueryIotplatformPurchaseorderEx(QueryIotplatformPurchaseorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotplatformPurchaseorderResponse>(DoRequest("1.0", "blockchain.bot.iotplatform.purchaseorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据设备串号查询采购设备
         * Summary: 根据设备串号查询采购设备
         */
        public async Task<QueryIotplatformPurchaseorderResponse> QueryIotplatformPurchaseorderExAsync(QueryIotplatformPurchaseorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotplatformPurchaseorderResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotplatform.purchaseorder.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
         * Summary: 绑定MeshId及设备SN
         */
        public ImportIotplatformMeshidResponse ImportIotplatformMeshid(ImportIotplatformMeshidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportIotplatformMeshidEx(request, headers, runtime);
        }

        /**
         * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
         * Summary: 绑定MeshId及设备SN
         */
        public async Task<ImportIotplatformMeshidResponse> ImportIotplatformMeshidAsync(ImportIotplatformMeshidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportIotplatformMeshidExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
         * Summary: 绑定MeshId及设备SN
         */
        public ImportIotplatformMeshidResponse ImportIotplatformMeshidEx(ImportIotplatformMeshidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIotplatformMeshidResponse>(DoRequest("1.0", "blockchain.bot.iotplatform.meshid.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
         * Summary: 绑定MeshId及设备SN
         */
        public async Task<ImportIotplatformMeshidResponse> ImportIotplatformMeshidExAsync(ImportIotplatformMeshidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIotplatformMeshidResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotplatform.meshid.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 与租赁宝对接采购订单导入的接口
         * Summary: 与租赁宝对接采购订单导入的接口
         */
        public ImportPurchaseorderThirdpartyResponse ImportPurchaseorderThirdparty(ImportPurchaseorderThirdpartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportPurchaseorderThirdpartyEx(request, headers, runtime);
        }

        /**
         * Description: 与租赁宝对接采购订单导入的接口
         * Summary: 与租赁宝对接采购订单导入的接口
         */
        public async Task<ImportPurchaseorderThirdpartyResponse> ImportPurchaseorderThirdpartyAsync(ImportPurchaseorderThirdpartyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportPurchaseorderThirdpartyExAsync(request, headers, runtime);
        }

        /**
         * Description: 与租赁宝对接采购订单导入的接口
         * Summary: 与租赁宝对接采购订单导入的接口
         */
        public ImportPurchaseorderThirdpartyResponse ImportPurchaseorderThirdpartyEx(ImportPurchaseorderThirdpartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportPurchaseorderThirdpartyResponse>(DoRequest("1.0", "blockchain.bot.purchaseorder.thirdparty.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 与租赁宝对接采购订单导入的接口
         * Summary: 与租赁宝对接采购订单导入的接口
         */
        public async Task<ImportPurchaseorderThirdpartyResponse> ImportPurchaseorderThirdpartyExAsync(ImportPurchaseorderThirdpartyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportPurchaseorderThirdpartyResponse>(await DoRequestAsync("1.0", "blockchain.bot.purchaseorder.thirdparty.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采购平台新增供应商角色
         * Summary: 采购平台新增供应商角色
         */
        public AddUserRoleResponse AddUserRole(AddUserRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddUserRoleEx(request, headers, runtime);
        }

        /**
         * Description: 采购平台新增供应商角色
         * Summary: 采购平台新增供应商角色
         */
        public async Task<AddUserRoleResponse> AddUserRoleAsync(AddUserRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddUserRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 采购平台新增供应商角色
         * Summary: 采购平台新增供应商角色
         */
        public AddUserRoleResponse AddUserRoleEx(AddUserRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUserRoleResponse>(DoRequest("1.0", "blockchain.bot.user.role.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采购平台新增供应商角色
         * Summary: 采购平台新增供应商角色
         */
        public async Task<AddUserRoleResponse> AddUserRoleExAsync(AddUserRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddUserRoleResponse>(await DoRequestAsync("1.0", "blockchain.bot.user.role.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采购平台新增SKU
         * Summary: 采购平台新增SKU
         */
        public AddGoodsSkuResponse AddGoodsSku(AddGoodsSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddGoodsSkuEx(request, headers, runtime);
        }

        /**
         * Description: 采购平台新增SKU
         * Summary: 采购平台新增SKU
         */
        public async Task<AddGoodsSkuResponse> AddGoodsSkuAsync(AddGoodsSkuRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddGoodsSkuExAsync(request, headers, runtime);
        }

        /**
         * Description: 采购平台新增SKU
         * Summary: 采购平台新增SKU
         */
        public AddGoodsSkuResponse AddGoodsSkuEx(AddGoodsSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGoodsSkuResponse>(DoRequest("1.0", "blockchain.bot.goods.sku.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采购平台新增SKU
         * Summary: 采购平台新增SKU
         */
        public async Task<AddGoodsSkuResponse> AddGoodsSkuExAsync(AddGoodsSkuRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGoodsSkuResponse>(await DoRequestAsync("1.0", "blockchain.bot.goods.sku.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Iotplatform-设备订单计费上传
         * Summary: Iotplatform-设备订单计费上传
         */
        public PushMeterdataOrderResponse PushMeterdataOrder(PushMeterdataOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushMeterdataOrderEx(request, headers, runtime);
        }

        /**
         * Description: Iotplatform-设备订单计费上传
         * Summary: Iotplatform-设备订单计费上传
         */
        public async Task<PushMeterdataOrderResponse> PushMeterdataOrderAsync(PushMeterdataOrderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushMeterdataOrderExAsync(request, headers, runtime);
        }

        /**
         * Description: Iotplatform-设备订单计费上传
         * Summary: Iotplatform-设备订单计费上传
         */
        public PushMeterdataOrderResponse PushMeterdataOrderEx(PushMeterdataOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushMeterdataOrderResponse>(DoRequest("1.0", "blockchain.bot.meterdata.order.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Iotplatform-设备订单计费上传
         * Summary: Iotplatform-设备订单计费上传
         */
        public async Task<PushMeterdataOrderResponse> PushMeterdataOrderExAsync(PushMeterdataOrderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushMeterdataOrderResponse>(await DoRequestAsync("1.0", "blockchain.bot.meterdata.order.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据模型
         * Summary: 创建数据模型
         */
        public CreateDeviceDatamodelResponse CreateDeviceDatamodel(CreateDeviceDatamodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDeviceDatamodelEx(request, headers, runtime);
        }

        /**
         * Description: 创建数据模型
         * Summary: 创建数据模型
         */
        public async Task<CreateDeviceDatamodelResponse> CreateDeviceDatamodelAsync(CreateDeviceDatamodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDeviceDatamodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建数据模型
         * Summary: 创建数据模型
         */
        public CreateDeviceDatamodelResponse CreateDeviceDatamodelEx(CreateDeviceDatamodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeviceDatamodelResponse>(DoRequest("1.0", "blockchain.bot.device.datamodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建数据模型
         * Summary: 创建数据模型
         */
        public async Task<CreateDeviceDatamodelResponse> CreateDeviceDatamodelExAsync(CreateDeviceDatamodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeviceDatamodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.datamodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取数据模型
         * Summary: 获取数据模型
         */
        public GetDeviceDatamodelResponse GetDeviceDatamodel(GetDeviceDatamodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDeviceDatamodelEx(request, headers, runtime);
        }

        /**
         * Description: 获取数据模型
         * Summary: 获取数据模型
         */
        public async Task<GetDeviceDatamodelResponse> GetDeviceDatamodelAsync(GetDeviceDatamodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDeviceDatamodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取数据模型
         * Summary: 获取数据模型
         */
        public GetDeviceDatamodelResponse GetDeviceDatamodelEx(GetDeviceDatamodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeviceDatamodelResponse>(DoRequest("1.0", "blockchain.bot.device.datamodel.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取数据模型
         * Summary: 获取数据模型
         */
        public async Task<GetDeviceDatamodelResponse> GetDeviceDatamodelExAsync(GetDeviceDatamodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeviceDatamodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.datamodel.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册设备
         * Summary: 注册设备
         */
        public ImportDeviceResponse ImportDevice(ImportDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 注册设备
         * Summary: 注册设备
         */
        public async Task<ImportDeviceResponse> ImportDeviceAsync(ImportDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 注册设备
         * Summary: 注册设备
         */
        public ImportDeviceResponse ImportDeviceEx(ImportDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDeviceResponse>(DoRequest("1.0", "blockchain.bot.device.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册设备
         * Summary: 注册设备
         */
        public async Task<ImportDeviceResponse> ImportDeviceExAsync(ImportDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过chainId获取设备详情
         * Summary: 通过chainId获取设备详情
         */
        public GetDeviceBychainidResponse GetDeviceBychainid(GetDeviceBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDeviceBychainidEx(request, headers, runtime);
        }

        /**
         * Description: 通过chainId获取设备详情
         * Summary: 通过chainId获取设备详情
         */
        public async Task<GetDeviceBychainidResponse> GetDeviceBychainidAsync(GetDeviceBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDeviceBychainidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过chainId获取设备详情
         * Summary: 通过chainId获取设备详情
         */
        public GetDeviceBychainidResponse GetDeviceBychainidEx(GetDeviceBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeviceBychainidResponse>(DoRequest("1.0", "blockchain.bot.device.bychainid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过chainId获取设备详情
         * Summary: 通过chainId获取设备详情
         */
        public async Task<GetDeviceBychainidResponse> GetDeviceBychainidExAsync(GetDeviceBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeviceBychainidResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.bychainid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过deviceId获取设备详情
         * Summary: 通过deviceId获取设备详情
         */
        public GetDeviceBydeviceidResponse GetDeviceBydeviceid(GetDeviceBydeviceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDeviceBydeviceidEx(request, headers, runtime);
        }

        /**
         * Description: 通过deviceId获取设备详情
         * Summary: 通过deviceId获取设备详情
         */
        public async Task<GetDeviceBydeviceidResponse> GetDeviceBydeviceidAsync(GetDeviceBydeviceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDeviceBydeviceidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过deviceId获取设备详情
         * Summary: 通过deviceId获取设备详情
         */
        public GetDeviceBydeviceidResponse GetDeviceBydeviceidEx(GetDeviceBydeviceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeviceBydeviceidResponse>(DoRequest("1.0", "blockchain.bot.device.bydeviceid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过deviceId获取设备详情
         * Summary: 通过deviceId获取设备详情
         */
        public async Task<GetDeviceBydeviceidResponse> GetDeviceBydeviceidExAsync(GetDeviceBydeviceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeviceBydeviceidResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.bydeviceid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过场景码列举设备
         * Summary: 通过场景码列举设备
         */
        public ListDeviceBysceneResponse ListDeviceByscene(ListDeviceBysceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDeviceBysceneEx(request, headers, runtime);
        }

        /**
         * Description: 通过场景码列举设备
         * Summary: 通过场景码列举设备
         */
        public async Task<ListDeviceBysceneResponse> ListDeviceBysceneAsync(ListDeviceBysceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDeviceBysceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过场景码列举设备
         * Summary: 通过场景码列举设备
         */
        public ListDeviceBysceneResponse ListDeviceBysceneEx(ListDeviceBysceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDeviceBysceneResponse>(DoRequest("1.0", "blockchain.bot.device.byscene.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过场景码列举设备
         * Summary: 通过场景码列举设备
         */
        public async Task<ListDeviceBysceneResponse> ListDeviceBysceneExAsync(ListDeviceBysceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDeviceBysceneResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.byscene.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新设备信息
         * Summary: 更新设备信息
         */
        public UpdateDeviceInfoResponse UpdateDeviceInfo(UpdateDeviceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDeviceInfoEx(request, headers, runtime);
        }

        /**
         * Description: 更新设备信息
         * Summary: 更新设备信息
         */
        public async Task<UpdateDeviceInfoResponse> UpdateDeviceInfoAsync(UpdateDeviceInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDeviceInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新设备信息
         * Summary: 更新设备信息
         */
        public UpdateDeviceInfoResponse UpdateDeviceInfoEx(UpdateDeviceInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDeviceInfoResponse>(DoRequest("1.0", "blockchain.bot.device.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新设备信息
         * Summary: 更新设备信息
         */
        public async Task<UpdateDeviceInfoResponse> UpdateDeviceInfoExAsync(UpdateDeviceInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDeviceInfoResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.info.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过deviceId发行设备
         * Summary: 通过deviceId发行设备
         */
        public CreateDistributedeviceBydeviceidResponse CreateDistributedeviceBydeviceid(CreateDistributedeviceBydeviceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDistributedeviceBydeviceidEx(request, headers, runtime);
        }

        /**
         * Description: 通过deviceId发行设备
         * Summary: 通过deviceId发行设备
         */
        public async Task<CreateDistributedeviceBydeviceidResponse> CreateDistributedeviceBydeviceidAsync(CreateDistributedeviceBydeviceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDistributedeviceBydeviceidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过deviceId发行设备
         * Summary: 通过deviceId发行设备
         */
        public CreateDistributedeviceBydeviceidResponse CreateDistributedeviceBydeviceidEx(CreateDistributedeviceBydeviceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBydeviceidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bydeviceid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过deviceId发行设备
         * Summary: 通过deviceId发行设备
         */
        public async Task<CreateDistributedeviceBydeviceidResponse> CreateDistributedeviceBydeviceidExAsync(CreateDistributedeviceBydeviceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBydeviceidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bydeviceid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过链上设备Id发行
         * Summary: 通过链上设备Id发行
         */
        public CreateDistributedeviceBychainidResponse CreateDistributedeviceBychainid(CreateDistributedeviceBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDistributedeviceBychainidEx(request, headers, runtime);
        }

        /**
         * Description: 通过链上设备Id发行
         * Summary: 通过链上设备Id发行
         */
        public async Task<CreateDistributedeviceBychainidResponse> CreateDistributedeviceBychainidAsync(CreateDistributedeviceBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDistributedeviceBychainidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过链上设备Id发行
         * Summary: 通过链上设备Id发行
         */
        public CreateDistributedeviceBychainidResponse CreateDistributedeviceBychainidEx(CreateDistributedeviceBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBychainidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bychainid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过链上设备Id发行
         * Summary: 通过链上设备Id发行
         */
        public async Task<CreateDistributedeviceBychainidResponse> CreateDistributedeviceBychainidExAsync(CreateDistributedeviceBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBychainidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bychainid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 替换发行设备
         * Summary: 替换发行设备
         */
        public ReplaceDistributedeviceBychainidResponse ReplaceDistributedeviceBychainid(ReplaceDistributedeviceBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceDistributedeviceBychainidEx(request, headers, runtime);
        }

        /**
         * Description: 替换发行设备
         * Summary: 替换发行设备
         */
        public async Task<ReplaceDistributedeviceBychainidResponse> ReplaceDistributedeviceBychainidAsync(ReplaceDistributedeviceBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceDistributedeviceBychainidExAsync(request, headers, runtime);
        }

        /**
         * Description: 替换发行设备
         * Summary: 替换发行设备
         */
        public ReplaceDistributedeviceBychainidResponse ReplaceDistributedeviceBychainidEx(ReplaceDistributedeviceBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDistributedeviceBychainidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bychainid.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 替换发行设备
         * Summary: 替换发行设备
         */
        public async Task<ReplaceDistributedeviceBychainidResponse> ReplaceDistributedeviceBychainidExAsync(ReplaceDistributedeviceBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDistributedeviceBychainidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bychainid.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传单个设备所产生的设备数据 
         * Summary: 上传设备数据
         */
        public SendCollectorBychainidResponse SendCollectorBychainid(SendCollectorBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendCollectorBychainidEx(request, headers, runtime);
        }

        /**
         * Description: 上传单个设备所产生的设备数据 
         * Summary: 上传设备数据
         */
        public async Task<SendCollectorBychainidResponse> SendCollectorBychainidAsync(SendCollectorBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendCollectorBychainidExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传单个设备所产生的设备数据 
         * Summary: 上传设备数据
         */
        public SendCollectorBychainidResponse SendCollectorBychainidEx(SendCollectorBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCollectorBychainidResponse>(DoRequest("1.0", "blockchain.bot.collector.bychainid.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传单个设备所产生的设备数据 
         * Summary: 上传设备数据
         */
        public async Task<SendCollectorBychainidResponse> SendCollectorBychainidExAsync(SendCollectorBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCollectorBychainidResponse>(await DoRequestAsync("1.0", "blockchain.bot.collector.bychainid.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过Id获取发行设备
         * Summary: 通过Id获取发行设备
         */
        public GetDistributedeviceBychainidResponse GetDistributedeviceBychainid(GetDistributedeviceBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDistributedeviceBychainidEx(request, headers, runtime);
        }

        /**
         * Description: 通过Id获取发行设备
         * Summary: 通过Id获取发行设备
         */
        public async Task<GetDistributedeviceBychainidResponse> GetDistributedeviceBychainidAsync(GetDistributedeviceBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDistributedeviceBychainidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过Id获取发行设备
         * Summary: 通过Id获取发行设备
         */
        public GetDistributedeviceBychainidResponse GetDistributedeviceBychainidEx(GetDistributedeviceBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDistributedeviceBychainidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bychainid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过Id获取发行设备
         * Summary: 通过Id获取发行设备
         */
        public async Task<GetDistributedeviceBychainidResponse> GetDistributedeviceBychainidExAsync(GetDistributedeviceBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDistributedeviceBychainidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bychainid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过场景码列举发行设备
         * Summary: 通过场景码列举发行设备
         */
        public ListDistributedeviceBysceneResponse ListDistributedeviceByscene(ListDistributedeviceBysceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDistributedeviceBysceneEx(request, headers, runtime);
        }

        /**
         * Description: 通过场景码列举发行设备
         * Summary: 通过场景码列举发行设备
         */
        public async Task<ListDistributedeviceBysceneResponse> ListDistributedeviceBysceneAsync(ListDistributedeviceBysceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDistributedeviceBysceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过场景码列举发行设备
         * Summary: 通过场景码列举发行设备
         */
        public ListDistributedeviceBysceneResponse ListDistributedeviceBysceneEx(ListDistributedeviceBysceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributedeviceBysceneResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.byscene.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过场景码列举发行设备
         * Summary: 通过场景码列举发行设备
         */
        public async Task<ListDistributedeviceBysceneResponse> ListDistributedeviceBysceneExAsync(ListDistributedeviceBysceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributedeviceBysceneResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.byscene.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建消费者
         * Summary: 创建消费者
         */
        public CreateConsumerResponse CreateConsumer(CreateConsumerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConsumerEx(request, headers, runtime);
        }

        /**
         * Description: 创建消费者
         * Summary: 创建消费者
         */
        public async Task<CreateConsumerResponse> CreateConsumerAsync(CreateConsumerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConsumerExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建消费者
         * Summary: 创建消费者
         */
        public CreateConsumerResponse CreateConsumerEx(CreateConsumerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumerResponse>(DoRequest("1.0", "blockchain.bot.consumer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建消费者
         * Summary: 创建消费者
         */
        public async Task<CreateConsumerResponse> CreateConsumerExAsync(CreateConsumerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConsumerResponse>(await DoRequestAsync("1.0", "blockchain.bot.consumer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费者订阅
         * Summary: 消费者订阅
         */
        public SetConsumerSubscribeResponse SetConsumerSubscribe(SetConsumerSubscribeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumerSubscribeEx(request, headers, runtime);
        }

        /**
         * Description: 消费者订阅
         * Summary: 消费者订阅
         */
        public async Task<SetConsumerSubscribeResponse> SetConsumerSubscribeAsync(SetConsumerSubscribeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumerSubscribeExAsync(request, headers, runtime);
        }

        /**
         * Description: 消费者订阅
         * Summary: 消费者订阅
         */
        public SetConsumerSubscribeResponse SetConsumerSubscribeEx(SetConsumerSubscribeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumerSubscribeResponse>(DoRequest("1.0", "blockchain.bot.consumer.subscribe.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费者订阅
         * Summary: 消费者订阅
         */
        public async Task<SetConsumerSubscribeResponse> SetConsumerSubscribeExAsync(SetConsumerSubscribeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumerSubscribeResponse>(await DoRequestAsync("1.0", "blockchain.bot.consumer.subscribe.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费者取消订阅设备
         * Summary: 消费者取消订阅设备
         */
        public SetConsumerUnsubscribeResponse SetConsumerUnsubscribe(SetConsumerUnsubscribeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetConsumerUnsubscribeEx(request, headers, runtime);
        }

        /**
         * Description: 消费者取消订阅设备
         * Summary: 消费者取消订阅设备
         */
        public async Task<SetConsumerUnsubscribeResponse> SetConsumerUnsubscribeAsync(SetConsumerUnsubscribeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetConsumerUnsubscribeExAsync(request, headers, runtime);
        }

        /**
         * Description: 消费者取消订阅设备
         * Summary: 消费者取消订阅设备
         */
        public SetConsumerUnsubscribeResponse SetConsumerUnsubscribeEx(SetConsumerUnsubscribeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumerUnsubscribeResponse>(DoRequest("1.0", "blockchain.bot.consumer.unsubscribe.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费者取消订阅设备
         * Summary: 消费者取消订阅设备
         */
        public async Task<SetConsumerUnsubscribeResponse> SetConsumerUnsubscribeExAsync(SetConsumerUnsubscribeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetConsumerUnsubscribeResponse>(await DoRequestAsync("1.0", "blockchain.bot.consumer.unsubscribe.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费者获取数据
         * Summary: 消费者获取数据
         */
        public PullConsumerDatasourceResponse PullConsumerDatasource(PullConsumerDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullConsumerDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 消费者获取数据
         * Summary: 消费者获取数据
         */
        public async Task<PullConsumerDatasourceResponse> PullConsumerDatasourceAsync(PullConsumerDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullConsumerDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 消费者获取数据
         * Summary: 消费者获取数据
         */
        public PullConsumerDatasourceResponse PullConsumerDatasourceEx(PullConsumerDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullConsumerDatasourceResponse>(DoRequest("1.0", "blockchain.bot.consumer.datasource.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 消费者获取数据
         * Summary: 消费者获取数据
         */
        public async Task<PullConsumerDatasourceResponse> PullConsumerDatasourceExAsync(PullConsumerDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullConsumerDatasourceResponse>(await DoRequestAsync("1.0", "blockchain.bot.consumer.datasource.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过设备id获取发行设备详情
         * Summary: 通过设备id获取发行设备详情
         */
        public GetDistributedeviceBydeviceidResponse GetDistributedeviceBydeviceid(GetDistributedeviceBydeviceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDistributedeviceBydeviceidEx(request, headers, runtime);
        }

        /**
         * Description: 通过设备id获取发行设备详情
         * Summary: 通过设备id获取发行设备详情
         */
        public async Task<GetDistributedeviceBydeviceidResponse> GetDistributedeviceBydeviceidAsync(GetDistributedeviceBydeviceidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDistributedeviceBydeviceidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过设备id获取发行设备详情
         * Summary: 通过设备id获取发行设备详情
         */
        public GetDistributedeviceBydeviceidResponse GetDistributedeviceBydeviceidEx(GetDistributedeviceBydeviceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDistributedeviceBydeviceidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bydeviceid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过设备id获取发行设备详情
         * Summary: 通过设备id获取发行设备详情
         */
        public async Task<GetDistributedeviceBydeviceidResponse> GetDistributedeviceBydeviceidExAsync(GetDistributedeviceBydeviceidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDistributedeviceBydeviceidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bydeviceid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过发行id获取设备
         * Summary: 通过发行id获取设备
         */
        public GetDistributedeviceBydisidResponse GetDistributedeviceBydisid(GetDistributedeviceBydisidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDistributedeviceBydisidEx(request, headers, runtime);
        }

        /**
         * Description: 通过发行id获取设备
         * Summary: 通过发行id获取设备
         */
        public async Task<GetDistributedeviceBydisidResponse> GetDistributedeviceBydisidAsync(GetDistributedeviceBydisidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDistributedeviceBydisidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过发行id获取设备
         * Summary: 通过发行id获取设备
         */
        public GetDistributedeviceBydisidResponse GetDistributedeviceBydisidEx(GetDistributedeviceBydisidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDistributedeviceBydisidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bydisid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过发行id获取设备
         * Summary: 通过发行id获取设备
         */
        public async Task<GetDistributedeviceBydisidResponse> GetDistributedeviceBydisidExAsync(GetDistributedeviceBydisidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDistributedeviceBydisidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bydisid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册外围设备
         * Summary: 注册外围设备
         */
        public ImportPeripheralResponse ImportPeripheral(ImportPeripheralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportPeripheralEx(request, headers, runtime);
        }

        /**
         * Description: 注册外围设备
         * Summary: 注册外围设备
         */
        public async Task<ImportPeripheralResponse> ImportPeripheralAsync(ImportPeripheralRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportPeripheralExAsync(request, headers, runtime);
        }

        /**
         * Description: 注册外围设备
         * Summary: 注册外围设备
         */
        public ImportPeripheralResponse ImportPeripheralEx(ImportPeripheralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportPeripheralResponse>(DoRequest("1.0", "blockchain.bot.peripheral.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册外围设备
         * Summary: 注册外围设备
         */
        public async Task<ImportPeripheralResponse> ImportPeripheralExAsync(ImportPeripheralRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportPeripheralResponse>(await DoRequestAsync("1.0", "blockchain.bot.peripheral.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过链上外围设备ID获取详情
         * Summary: 通过链上外围设备ID获取详情
         */
        public GetPeripheralBychainperipheralidResponse GetPeripheralBychainperipheralid(GetPeripheralBychainperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPeripheralBychainperipheralidEx(request, headers, runtime);
        }

        /**
         * Description: 通过链上外围设备ID获取详情
         * Summary: 通过链上外围设备ID获取详情
         */
        public async Task<GetPeripheralBychainperipheralidResponse> GetPeripheralBychainperipheralidAsync(GetPeripheralBychainperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPeripheralBychainperipheralidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过链上外围设备ID获取详情
         * Summary: 通过链上外围设备ID获取详情
         */
        public GetPeripheralBychainperipheralidResponse GetPeripheralBychainperipheralidEx(GetPeripheralBychainperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPeripheralBychainperipheralidResponse>(DoRequest("1.0", "blockchain.bot.peripheral.bychainperipheralid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过链上外围设备ID获取详情
         * Summary: 通过链上外围设备ID获取详情
         */
        public async Task<GetPeripheralBychainperipheralidResponse> GetPeripheralBychainperipheralidExAsync(GetPeripheralBychainperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPeripheralBychainperipheralidResponse>(await DoRequestAsync("1.0", "blockchain.bot.peripheral.bychainperipheralid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过外围设备ID获取详情
         * Summary: 通过外围设备ID获取详情
         */
        public GetPeripheralByperipheralidResponse GetPeripheralByperipheralid(GetPeripheralByperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPeripheralByperipheralidEx(request, headers, runtime);
        }

        /**
         * Description: 通过外围设备ID获取详情
         * Summary: 通过外围设备ID获取详情
         */
        public async Task<GetPeripheralByperipheralidResponse> GetPeripheralByperipheralidAsync(GetPeripheralByperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPeripheralByperipheralidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过外围设备ID获取详情
         * Summary: 通过外围设备ID获取详情
         */
        public GetPeripheralByperipheralidResponse GetPeripheralByperipheralidEx(GetPeripheralByperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPeripheralByperipheralidResponse>(DoRequest("1.0", "blockchain.bot.peripheral.byperipheralid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过外围设备ID获取详情
         * Summary: 通过外围设备ID获取详情
         */
        public async Task<GetPeripheralByperipheralidResponse> GetPeripheralByperipheralidExAsync(GetPeripheralByperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPeripheralByperipheralidResponse>(await DoRequestAsync("1.0", "blockchain.bot.peripheral.byperipheralid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据场景列举外围设备
         * Summary: 根据场景列举外围设备
         */
        public ListPeripheralBysceneResponse ListPeripheralByscene(ListPeripheralBysceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListPeripheralBysceneEx(request, headers, runtime);
        }

        /**
         * Description: 根据场景列举外围设备
         * Summary: 根据场景列举外围设备
         */
        public async Task<ListPeripheralBysceneResponse> ListPeripheralBysceneAsync(ListPeripheralBysceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListPeripheralBysceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据场景列举外围设备
         * Summary: 根据场景列举外围设备
         */
        public ListPeripheralBysceneResponse ListPeripheralBysceneEx(ListPeripheralBysceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListPeripheralBysceneResponse>(DoRequest("1.0", "blockchain.bot.peripheral.byscene.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据场景列举外围设备
         * Summary: 根据场景列举外围设备
         */
        public async Task<ListPeripheralBysceneResponse> ListPeripheralBysceneExAsync(ListPeripheralBysceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListPeripheralBysceneResponse>(await DoRequestAsync("1.0", "blockchain.bot.peripheral.byscene.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过外围设备Id发行
         * Summary: 通过外围设备Id发行
         */
        public CreateDistributedeviceByperipheralidResponse CreateDistributedeviceByperipheralid(CreateDistributedeviceByperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDistributedeviceByperipheralidEx(request, headers, runtime);
        }

        /**
         * Description: 通过外围设备Id发行
         * Summary: 通过外围设备Id发行
         */
        public async Task<CreateDistributedeviceByperipheralidResponse> CreateDistributedeviceByperipheralidAsync(CreateDistributedeviceByperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDistributedeviceByperipheralidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过外围设备Id发行
         * Summary: 通过外围设备Id发行
         */
        public CreateDistributedeviceByperipheralidResponse CreateDistributedeviceByperipheralidEx(CreateDistributedeviceByperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceByperipheralidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.byperipheralid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过外围设备Id发行
         * Summary: 通过外围设备Id发行
         */
        public async Task<CreateDistributedeviceByperipheralidResponse> CreateDistributedeviceByperipheralidExAsync(CreateDistributedeviceByperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceByperipheralidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.byperipheralid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过链上外围设备Id发行
         * Summary: 通过链上外围设备Id发行
         */
        public CreateDistributedeviceBychainperipheralidResponse CreateDistributedeviceBychainperipheralid(CreateDistributedeviceBychainperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDistributedeviceBychainperipheralidEx(request, headers, runtime);
        }

        /**
         * Description: 通过链上外围设备Id发行
         * Summary: 通过链上外围设备Id发行
         */
        public async Task<CreateDistributedeviceBychainperipheralidResponse> CreateDistributedeviceBychainperipheralidAsync(CreateDistributedeviceBychainperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDistributedeviceBychainperipheralidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过链上外围设备Id发行
         * Summary: 通过链上外围设备Id发行
         */
        public CreateDistributedeviceBychainperipheralidResponse CreateDistributedeviceBychainperipheralidEx(CreateDistributedeviceBychainperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBychainperipheralidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bychainperipheralid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过链上外围设备Id发行
         * Summary: 通过链上外围设备Id发行
         */
        public async Task<CreateDistributedeviceBychainperipheralidResponse> CreateDistributedeviceBychainperipheralidExAsync(CreateDistributedeviceBychainperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBychainperipheralidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bychainperipheralid.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 替换发行外围设备 by 链上外围设备ID
         * Summary: 替换发行外围设备 by 链上外围设备ID
         */
        public ReplaceDistributedeviceBychainperipheralidResponse ReplaceDistributedeviceBychainperipheralid(ReplaceDistributedeviceBychainperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReplaceDistributedeviceBychainperipheralidEx(request, headers, runtime);
        }

        /**
         * Description: 替换发行外围设备 by 链上外围设备ID
         * Summary: 替换发行外围设备 by 链上外围设备ID
         */
        public async Task<ReplaceDistributedeviceBychainperipheralidResponse> ReplaceDistributedeviceBychainperipheralidAsync(ReplaceDistributedeviceBychainperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReplaceDistributedeviceBychainperipheralidExAsync(request, headers, runtime);
        }

        /**
         * Description: 替换发行外围设备 by 链上外围设备ID
         * Summary: 替换发行外围设备 by 链上外围设备ID
         */
        public ReplaceDistributedeviceBychainperipheralidResponse ReplaceDistributedeviceBychainperipheralidEx(ReplaceDistributedeviceBychainperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDistributedeviceBychainperipheralidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bychainperipheralid.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 替换发行外围设备 by 链上外围设备ID
         * Summary: 替换发行外围设备 by 链上外围设备ID
         */
        public async Task<ReplaceDistributedeviceBychainperipheralidResponse> ReplaceDistributedeviceBychainperipheralidExAsync(ReplaceDistributedeviceBychainperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReplaceDistributedeviceBychainperipheralidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bychainperipheralid.replace", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据场景列举发行外围设备
         * Summary: 根据场景列举发行外围设备
         */
        public ListDistributedeviceByperipheralsceneResponse ListDistributedeviceByperipheralscene(ListDistributedeviceByperipheralsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDistributedeviceByperipheralsceneEx(request, headers, runtime);
        }

        /**
         * Description: 根据场景列举发行外围设备
         * Summary: 根据场景列举发行外围设备
         */
        public async Task<ListDistributedeviceByperipheralsceneResponse> ListDistributedeviceByperipheralsceneAsync(ListDistributedeviceByperipheralsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDistributedeviceByperipheralsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据场景列举发行外围设备
         * Summary: 根据场景列举发行外围设备
         */
        public ListDistributedeviceByperipheralsceneResponse ListDistributedeviceByperipheralsceneEx(ListDistributedeviceByperipheralsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributedeviceByperipheralsceneResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.byperipheralscene.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据场景列举发行外围设备
         * Summary: 根据场景列举发行外围设备
         */
        public async Task<ListDistributedeviceByperipheralsceneResponse> ListDistributedeviceByperipheralsceneExAsync(ListDistributedeviceByperipheralsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDistributedeviceByperipheralsceneResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.byperipheralscene.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过外围设备ID获取发行外围设备信息
         * Summary: 通过外围设备ID获取发行外围设备信息
         */
        public GetDistributedeviceByperipheralidResponse GetDistributedeviceByperipheralid(GetDistributedeviceByperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDistributedeviceByperipheralidEx(request, headers, runtime);
        }

        /**
         * Description: 通过外围设备ID获取发行外围设备信息
         * Summary: 通过外围设备ID获取发行外围设备信息
         */
        public async Task<GetDistributedeviceByperipheralidResponse> GetDistributedeviceByperipheralidAsync(GetDistributedeviceByperipheralidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDistributedeviceByperipheralidExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过外围设备ID获取发行外围设备信息
         * Summary: 通过外围设备ID获取发行外围设备信息
         */
        public GetDistributedeviceByperipheralidResponse GetDistributedeviceByperipheralidEx(GetDistributedeviceByperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDistributedeviceByperipheralidResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.byperipheralid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过外围设备ID获取发行外围设备信息
         * Summary: 通过外围设备ID获取发行外围设备信息
         */
        public async Task<GetDistributedeviceByperipheralidResponse> GetDistributedeviceByperipheralidExAsync(GetDistributedeviceByperipheralidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDistributedeviceByperipheralidResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.byperipheralid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行设备by_devcie
         * Summary: 发行设备by_devcie
         */
        public CreateDistributedeviceBydeviceResponse CreateDistributedeviceBydevice(CreateDistributedeviceBydeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDistributedeviceBydeviceEx(request, headers, runtime);
        }

        /**
         * Description: 发行设备by_devcie
         * Summary: 发行设备by_devcie
         */
        public async Task<CreateDistributedeviceBydeviceResponse> CreateDistributedeviceBydeviceAsync(CreateDistributedeviceBydeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDistributedeviceBydeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 发行设备by_devcie
         * Summary: 发行设备by_devcie
         */
        public CreateDistributedeviceBydeviceResponse CreateDistributedeviceBydeviceEx(CreateDistributedeviceBydeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBydeviceResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bydevice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发行设备by_devcie
         * Summary: 发行设备by_devcie
         */
        public async Task<CreateDistributedeviceBydeviceResponse> CreateDistributedeviceBydeviceExAsync(CreateDistributedeviceBydeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBydeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bydevice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 远程任务创建
         * Summary: 远程任务创建
         */
        public CreateTaskResponse CreateTask(CreateTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTaskEx(request, headers, runtime);
        }

        /**
         * Description: 远程任务创建
         * Summary: 远程任务创建
         */
        public async Task<CreateTaskResponse> CreateTaskAsync(CreateTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 远程任务创建
         * Summary: 远程任务创建
         */
        public CreateTaskResponse CreateTaskEx(CreateTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTaskResponse>(DoRequest("1.0", "blockchain.bot.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 远程任务创建
         * Summary: 远程任务创建
         */
        public async Task<CreateTaskResponse> CreateTaskExAsync(CreateTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTaskResponse>(await DoRequestAsync("1.0", "blockchain.bot.task.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 远程任务查询
         * Summary: 远程任务查询
         */
        public QueryTaskResponse QueryTask(QueryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTaskEx(request, headers, runtime);
        }

        /**
         * Description: 远程任务查询
         * Summary: 远程任务查询
         */
        public async Task<QueryTaskResponse> QueryTaskAsync(QueryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 远程任务查询
         * Summary: 远程任务查询
         */
        public QueryTaskResponse QueryTaskEx(QueryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTaskResponse>(DoRequest("1.0", "blockchain.bot.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 远程任务查询
         * Summary: 远程任务查询
         */
        public async Task<QueryTaskResponse> QueryTaskExAsync(QueryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTaskResponse>(await DoRequestAsync("1.0", "blockchain.bot.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分析数据查询
         * Summary: 分析数据查询
         */
        public QueryAnalysisResponse QueryAnalysis(QueryAnalysisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAnalysisEx(request, headers, runtime);
        }

        /**
         * Description: 分析数据查询
         * Summary: 分析数据查询
         */
        public async Task<QueryAnalysisResponse> QueryAnalysisAsync(QueryAnalysisRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAnalysisExAsync(request, headers, runtime);
        }

        /**
         * Description: 分析数据查询
         * Summary: 分析数据查询
         */
        public QueryAnalysisResponse QueryAnalysisEx(QueryAnalysisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAnalysisResponse>(DoRequest("1.0", "blockchain.bot.analysis.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分析数据查询
         * Summary: 分析数据查询
         */
        public async Task<QueryAnalysisResponse> QueryAnalysisExAsync(QueryAnalysisRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAnalysisResponse>(await DoRequestAsync("1.0", "blockchain.bot.analysis.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
         * Summary: 上传设备数据mul
         */
        public SendCollectorBychainidmulResponse SendCollectorBychainidmul(SendCollectorBychainidmulRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendCollectorBychainidmulEx(request, headers, runtime);
        }

        /**
         * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
         * Summary: 上传设备数据mul
         */
        public async Task<SendCollectorBychainidmulResponse> SendCollectorBychainidmulAsync(SendCollectorBychainidmulRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendCollectorBychainidmulExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
         * Summary: 上传设备数据mul
         */
        public SendCollectorBychainidmulResponse SendCollectorBychainidmulEx(SendCollectorBychainidmulRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCollectorBychainidmulResponse>(DoRequest("1.0", "blockchain.bot.collector.bychainidmul.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
         * Summary: 上传设备数据mul
         */
        public async Task<SendCollectorBychainidmulResponse> SendCollectorBychainidmulExAsync(SendCollectorBychainidmulRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCollectorBychainidmulResponse>(await DoRequestAsync("1.0", "blockchain.bot.collector.bychainidmul.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传设备业务数据
         * Summary: 上传设备业务数据
         */
        public SendCollectorDevicebizdataResponse SendCollectorDevicebizdata(SendCollectorDevicebizdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendCollectorDevicebizdataEx(request, headers, runtime);
        }

        /**
         * Description: 上传设备业务数据
         * Summary: 上传设备业务数据
         */
        public async Task<SendCollectorDevicebizdataResponse> SendCollectorDevicebizdataAsync(SendCollectorDevicebizdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendCollectorDevicebizdataExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传设备业务数据
         * Summary: 上传设备业务数据
         */
        public SendCollectorDevicebizdataResponse SendCollectorDevicebizdataEx(SendCollectorDevicebizdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCollectorDevicebizdataResponse>(DoRequest("1.0", "blockchain.bot.collector.devicebizdata.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传设备业务数据
         * Summary: 上传设备业务数据
         */
        public async Task<SendCollectorDevicebizdataResponse> SendCollectorDevicebizdataExAsync(SendCollectorDevicebizdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCollectorDevicebizdataResponse>(await DoRequestAsync("1.0", "blockchain.bot.collector.devicebizdata.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新设备信息by_devcie
         * Summary: 更新设备信息by_devcie
         */
        public UpdateDeviceInfobydeviceResponse UpdateDeviceInfobydevice(UpdateDeviceInfobydeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDeviceInfobydeviceEx(request, headers, runtime);
        }

        /**
         * Description: 更新设备信息by_devcie
         * Summary: 更新设备信息by_devcie
         */
        public async Task<UpdateDeviceInfobydeviceResponse> UpdateDeviceInfobydeviceAsync(UpdateDeviceInfobydeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDeviceInfobydeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新设备信息by_devcie
         * Summary: 更新设备信息by_devcie
         */
        public UpdateDeviceInfobydeviceResponse UpdateDeviceInfobydeviceEx(UpdateDeviceInfobydeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDeviceInfobydeviceResponse>(DoRequest("1.0", "blockchain.bot.device.infobydevice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新设备信息by_devcie
         * Summary: 更新设备信息by_devcie
         */
        public async Task<UpdateDeviceInfobydeviceResponse> UpdateDeviceInfobydeviceExAsync(UpdateDeviceInfobydeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDeviceInfobydeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.infobydevice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下线设备
         * Summary: 下线设备
         */
        public OfflineDeviceResponse OfflineDevice(OfflineDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 下线设备
         * Summary: 下线设备
         */
        public async Task<OfflineDeviceResponse> OfflineDeviceAsync(OfflineDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 下线设备
         * Summary: 下线设备
         */
        public OfflineDeviceResponse OfflineDeviceEx(OfflineDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineDeviceResponse>(DoRequest("1.0", "blockchain.bot.device.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下线设备
         * Summary: 下线设备
         */
        public async Task<OfflineDeviceResponse> OfflineDeviceExAsync(OfflineDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请MQTT token
         * Summary: 申请MQTT token
         */
        public ApplyMqtokenResponse ApplyMqtoken(ApplyMqtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyMqtokenEx(request, headers, runtime);
        }

        /**
         * Description: 申请MQTT token
         * Summary: 申请MQTT token
         */
        public async Task<ApplyMqtokenResponse> ApplyMqtokenAsync(ApplyMqtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyMqtokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 申请MQTT token
         * Summary: 申请MQTT token
         */
        public ApplyMqtokenResponse ApplyMqtokenEx(ApplyMqtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyMqtokenResponse>(DoRequest("1.0", "blockchain.bot.mqtoken.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请MQTT token
         * Summary: 申请MQTT token
         */
        public async Task<ApplyMqtokenResponse> ApplyMqtokenExAsync(ApplyMqtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyMqtokenResponse>(await DoRequestAsync("1.0", "blockchain.bot.mqtoken.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询设备所注册的公钥是否正确
         * Summary: 查询注册信息
         */
        public QueryDeviceRegistrationResponse QueryDeviceRegistration(QueryDeviceRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceRegistrationEx(request, headers, runtime);
        }

        /**
         * Description: 查询设备所注册的公钥是否正确
         * Summary: 查询注册信息
         */
        public async Task<QueryDeviceRegistrationResponse> QueryDeviceRegistrationAsync(QueryDeviceRegistrationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceRegistrationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询设备所注册的公钥是否正确
         * Summary: 查询注册信息
         */
        public QueryDeviceRegistrationResponse QueryDeviceRegistrationEx(QueryDeviceRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceRegistrationResponse>(DoRequest("1.0", "blockchain.bot.device.registration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询设备所注册的公钥是否正确
         * Summary: 查询注册信息
         */
        public async Task<QueryDeviceRegistrationResponse> QueryDeviceRegistrationExAsync(QueryDeviceRegistrationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceRegistrationResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.registration.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备异常上报
         * Summary: 设备异常上报
         */
        public AddAbnormalResponse AddAbnormal(AddAbnormalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAbnormalEx(request, headers, runtime);
        }

        /**
         * Description: 设备异常上报
         * Summary: 设备异常上报
         */
        public async Task<AddAbnormalResponse> AddAbnormalAsync(AddAbnormalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAbnormalExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备异常上报
         * Summary: 设备异常上报
         */
        public AddAbnormalResponse AddAbnormalEx(AddAbnormalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAbnormalResponse>(DoRequest("1.0", "blockchain.bot.abnormal.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备异常上报
         * Summary: 设备异常上报
         */
        public async Task<AddAbnormalResponse> AddAbnormalExAsync(AddAbnormalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAbnormalResponse>(await DoRequestAsync("1.0", "blockchain.bot.abnormal.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备下线后，可通过此接口重新上线
         * Summary: 设置设备状态为上线
         */
        public OnlineDeviceResponse OnlineDevice(OnlineDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 设备下线后，可通过此接口重新上线
         * Summary: 设置设备状态为上线
         */
        public async Task<OnlineDeviceResponse> OnlineDeviceAsync(OnlineDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 设备下线后，可通过此接口重新上线
         * Summary: 设置设备状态为上线
         */
        public OnlineDeviceResponse OnlineDeviceEx(OnlineDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineDeviceResponse>(DoRequest("1.0", "blockchain.bot.device.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设备下线后，可通过此接口重新上线
         * Summary: 设置设备状态为上线
         */
        public async Task<OnlineDeviceResponse> OnlineDeviceExAsync(OnlineDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注销设备
         * Summary: 注销设备
         */
        public OfflineDeviceByunregisterResponse OfflineDeviceByunregister(OfflineDeviceByunregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineDeviceByunregisterEx(request, headers, runtime);
        }

        /**
         * Description: 注销设备
         * Summary: 注销设备
         */
        public async Task<OfflineDeviceByunregisterResponse> OfflineDeviceByunregisterAsync(OfflineDeviceByunregisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineDeviceByunregisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 注销设备
         * Summary: 注销设备
         */
        public OfflineDeviceByunregisterResponse OfflineDeviceByunregisterEx(OfflineDeviceByunregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineDeviceByunregisterResponse>(DoRequest("1.0", "blockchain.bot.device.byunregister.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注销设备
         * Summary: 注销设备
         */
        public async Task<OfflineDeviceByunregisterResponse> OfflineDeviceByunregisterExAsync(OfflineDeviceByunregisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineDeviceByunregisterResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.byunregister.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签状态查询
         * Summary: 标签状态查询
         */
        public QueryLabelTraceResponse QueryLabelTrace(QueryLabelTraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLabelTraceEx(request, headers, runtime);
        }

        /**
         * Description: 标签状态查询
         * Summary: 标签状态查询
         */
        public async Task<QueryLabelTraceResponse> QueryLabelTraceAsync(QueryLabelTraceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLabelTraceExAsync(request, headers, runtime);
        }

        /**
         * Description: 标签状态查询
         * Summary: 标签状态查询
         */
        public QueryLabelTraceResponse QueryLabelTraceEx(QueryLabelTraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLabelTraceResponse>(DoRequest("1.0", "blockchain.bot.label.trace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签状态查询
         * Summary: 标签状态查询
         */
        public async Task<QueryLabelTraceResponse> QueryLabelTraceExAsync(QueryLabelTraceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLabelTraceResponse>(await DoRequestAsync("1.0", "blockchain.bot.label.trace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签流转状态同步
         * Summary: 标签流转状态同步
         */
        public SyncLabelTransferResponse SyncLabelTransfer(SyncLabelTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncLabelTransferEx(request, headers, runtime);
        }

        /**
         * Description: 标签流转状态同步
         * Summary: 标签流转状态同步
         */
        public async Task<SyncLabelTransferResponse> SyncLabelTransferAsync(SyncLabelTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncLabelTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 标签流转状态同步
         * Summary: 标签流转状态同步
         */
        public SyncLabelTransferResponse SyncLabelTransferEx(SyncLabelTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncLabelTransferResponse>(DoRequest("1.0", "blockchain.bot.label.transfer.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签流转状态同步
         * Summary: 标签流转状态同步
         */
        public async Task<SyncLabelTransferResponse> SyncLabelTransferExAsync(SyncLabelTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncLabelTransferResponse>(await DoRequestAsync("1.0", "blockchain.bot.label.transfer.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签资产绑定
         * Summary: 标签资产绑定
         */
        public AddLabelAssetResponse AddLabelAsset(AddLabelAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddLabelAssetEx(request, headers, runtime);
        }

        /**
         * Description: 标签资产绑定
         * Summary: 标签资产绑定
         */
        public async Task<AddLabelAssetResponse> AddLabelAssetAsync(AddLabelAssetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddLabelAssetExAsync(request, headers, runtime);
        }

        /**
         * Description: 标签资产绑定
         * Summary: 标签资产绑定
         */
        public AddLabelAssetResponse AddLabelAssetEx(AddLabelAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLabelAssetResponse>(DoRequest("1.0", "blockchain.bot.label.asset.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签资产绑定
         * Summary: 标签资产绑定
         */
        public async Task<AddLabelAssetResponse> AddLabelAssetExAsync(AddLabelAssetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddLabelAssetResponse>(await DoRequestAsync("1.0", "blockchain.bot.label.asset.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过tx_hash查询上链信息
         * Summary: 链上信息查询
         */
        public QueryDataBytxhashResponse QueryDataBytxhash(QueryDataBytxhashRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDataBytxhashEx(request, headers, runtime);
        }

        /**
         * Description: 通过tx_hash查询上链信息
         * Summary: 链上信息查询
         */
        public async Task<QueryDataBytxhashResponse> QueryDataBytxhashAsync(QueryDataBytxhashRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDataBytxhashExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过tx_hash查询上链信息
         * Summary: 链上信息查询
         */
        public QueryDataBytxhashResponse QueryDataBytxhashEx(QueryDataBytxhashRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataBytxhashResponse>(DoRequest("1.0", "blockchain.bot.data.bytxhash.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过tx_hash查询上链信息
         * Summary: 链上信息查询
         */
        public async Task<QueryDataBytxhashResponse> QueryDataBytxhashExAsync(QueryDataBytxhashRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataBytxhashResponse>(await DoRequestAsync("1.0", "blockchain.bot.data.bytxhash.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据taskId 执行未处理的任务
         * Summary: 执行未处理的任务
         */
        public ExecUnprocessedTaskResponse ExecUnprocessedTask(ExecUnprocessedTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecUnprocessedTaskEx(request, headers, runtime);
        }

        /**
         * Description: 根据taskId 执行未处理的任务
         * Summary: 执行未处理的任务
         */
        public async Task<ExecUnprocessedTaskResponse> ExecUnprocessedTaskAsync(ExecUnprocessedTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecUnprocessedTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据taskId 执行未处理的任务
         * Summary: 执行未处理的任务
         */
        public ExecUnprocessedTaskResponse ExecUnprocessedTaskEx(ExecUnprocessedTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecUnprocessedTaskResponse>(DoRequest("1.0", "blockchain.bot.unprocessed.task.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据taskId 执行未处理的任务
         * Summary: 执行未处理的任务
         */
        public async Task<ExecUnprocessedTaskResponse> ExecUnprocessedTaskExAsync(ExecUnprocessedTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecUnprocessedTaskResponse>(await DoRequestAsync("1.0", "blockchain.bot.unprocessed.task.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传汇总数据
         * Summary: 上传汇总数据
         */
        public SendCollectorSummarydataResponse SendCollectorSummarydata(SendCollectorSummarydataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendCollectorSummarydataEx(request, headers, runtime);
        }

        /**
         * Description: 上传汇总数据
         * Summary: 上传汇总数据
         */
        public async Task<SendCollectorSummarydataResponse> SendCollectorSummarydataAsync(SendCollectorSummarydataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendCollectorSummarydataExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传汇总数据
         * Summary: 上传汇总数据
         */
        public SendCollectorSummarydataResponse SendCollectorSummarydataEx(SendCollectorSummarydataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCollectorSummarydataResponse>(DoRequest("1.0", "blockchain.bot.collector.summarydata.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传汇总数据
         * Summary: 上传汇总数据
         */
        public async Task<SendCollectorSummarydataResponse> SendCollectorSummarydataExAsync(SendCollectorSummarydataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendCollectorSummarydataResponse>(await DoRequestAsync("1.0", "blockchain.bot.collector.summarydata.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据请求体内容保存密钥
         * Summary: 保存公钥
         */
        public AddCertificateResponse AddCertificate(AddCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddCertificateEx(request, headers, runtime);
        }

        /**
         * Description: 根据请求体内容保存密钥
         * Summary: 保存公钥
         */
        public async Task<AddCertificateResponse> AddCertificateAsync(AddCertificateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddCertificateExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据请求体内容保存密钥
         * Summary: 保存公钥
         */
        public AddCertificateResponse AddCertificateEx(AddCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCertificateResponse>(DoRequest("1.0", "blockchain.bot.certificate.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据请求体内容保存密钥
         * Summary: 保存公钥
         */
        public async Task<AddCertificateResponse> AddCertificateExAsync(AddCertificateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddCertificateResponse>(await DoRequestAsync("1.0", "blockchain.bot.certificate.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增租户
         * Summary: 新增租户
         */
        public AddTenantResponse AddTenant(AddTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTenantEx(request, headers, runtime);
        }

        /**
         * Description: 新增租户
         * Summary: 新增租户
         */
        public async Task<AddTenantResponse> AddTenantAsync(AddTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增租户
         * Summary: 新增租户
         */
        public AddTenantResponse AddTenantEx(AddTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTenantResponse>(DoRequest("1.0", "blockchain.bot.tenant.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增租户
         * Summary: 新增租户
         */
        public async Task<AddTenantResponse> AddTenantExAsync(AddTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTenantResponse>(await DoRequestAsync("1.0", "blockchain.bot.tenant.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增场景码
         * Summary: 新增场景码
         */
        public AddSceneResponse AddScene(AddSceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSceneEx(request, headers, runtime);
        }

        /**
         * Description: 新增场景码
         * Summary: 新增场景码
         */
        public async Task<AddSceneResponse> AddSceneAsync(AddSceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增场景码
         * Summary: 新增场景码
         */
        public AddSceneResponse AddSceneEx(AddSceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSceneResponse>(DoRequest("1.0", "blockchain.bot.scene.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增场景码
         * Summary: 新增场景码
         */
        public async Task<AddSceneResponse> AddSceneExAsync(AddSceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSceneResponse>(await DoRequestAsync("1.0", "blockchain.bot.scene.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 部署场景合同
         * Summary: 部署场景合同
         */
        public DeploySceneResponse DeployScene(DeploySceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeploySceneEx(request, headers, runtime);
        }

        /**
         * Description: 部署场景合同
         * Summary: 部署场景合同
         */
        public async Task<DeploySceneResponse> DeploySceneAsync(DeploySceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeploySceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 部署场景合同
         * Summary: 部署场景合同
         */
        public DeploySceneResponse DeploySceneEx(DeploySceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeploySceneResponse>(DoRequest("1.0", "blockchain.bot.scene.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 部署场景合同
         * Summary: 部署场景合同
         */
        public async Task<DeploySceneResponse> DeploySceneExAsync(DeploySceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeploySceneResponse>(await DoRequestAsync("1.0", "blockchain.bot.scene.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增sdk
         * Summary: 新增sdk
         */
        public AddSdkResponse AddSdk(AddSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSdkEx(request, headers, runtime);
        }

        /**
         * Description: 新增sdk
         * Summary: 新增sdk
         */
        public async Task<AddSdkResponse> AddSdkAsync(AddSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增sdk
         * Summary: 新增sdk
         */
        public AddSdkResponse AddSdkEx(AddSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSdkResponse>(DoRequest("1.0", "blockchain.bot.sdk.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增sdk
         * Summary: 新增sdk
         */
        public async Task<AddSdkResponse> AddSdkExAsync(AddSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSdkResponse>(await DoRequestAsync("1.0", "blockchain.bot.sdk.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sdk
         * Summary: 更新sdk
         */
        public UpdateSdkResponse UpdateSdk(UpdateSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSdkEx(request, headers, runtime);
        }

        /**
         * Description: 更新sdk
         * Summary: 更新sdk
         */
        public async Task<UpdateSdkResponse> UpdateSdkAsync(UpdateSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sdk
         * Summary: 更新sdk
         */
        public UpdateSdkResponse UpdateSdkEx(UpdateSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSdkResponse>(DoRequest("1.0", "blockchain.bot.sdk.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sdk
         * Summary: 更新sdk
         */
        public async Task<UpdateSdkResponse> UpdateSdkExAsync(UpdateSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSdkResponse>(await DoRequestAsync("1.0", "blockchain.bot.sdk.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增productKey
         * Summary: 新增productKey
         */
        public AddProductkeyResponse AddProductkey(AddProductkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddProductkeyEx(request, headers, runtime);
        }

        /**
         * Description: 新增productKey
         * Summary: 新增productKey
         */
        public async Task<AddProductkeyResponse> AddProductkeyAsync(AddProductkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddProductkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增productKey
         * Summary: 新增productKey
         */
        public AddProductkeyResponse AddProductkeyEx(AddProductkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddProductkeyResponse>(DoRequest("1.0", "blockchain.bot.productkey.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增productKey
         * Summary: 新增productKey
         */
        public async Task<AddProductkeyResponse> AddProductkeyExAsync(AddProductkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddProductkeyResponse>(await DoRequestAsync("1.0", "blockchain.bot.productkey.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新productKey
         * Summary: 更新productKey
         */
        public UpdateProductkeyResponse UpdateProductkey(UpdateProductkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateProductkeyEx(request, headers, runtime);
        }

        /**
         * Description: 更新productKey
         * Summary: 更新productKey
         */
        public async Task<UpdateProductkeyResponse> UpdateProductkeyAsync(UpdateProductkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateProductkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新productKey
         * Summary: 更新productKey
         */
        public UpdateProductkeyResponse UpdateProductkeyEx(UpdateProductkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateProductkeyResponse>(DoRequest("1.0", "blockchain.bot.productkey.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新productKey
         * Summary: 更新productKey
         */
        public async Task<UpdateProductkeyResponse> UpdateProductkeyExAsync(UpdateProductkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateProductkeyResponse>(await DoRequestAsync("1.0", "blockchain.bot.productkey.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新租户
         * Summary: 更新租户
         */
        public UpdateTenantResponse UpdateTenant(UpdateTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTenantEx(request, headers, runtime);
        }

        /**
         * Description: 更新租户
         * Summary: 更新租户
         */
        public async Task<UpdateTenantResponse> UpdateTenantAsync(UpdateTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新租户
         * Summary: 更新租户
         */
        public UpdateTenantResponse UpdateTenantEx(UpdateTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTenantResponse>(DoRequest("1.0", "blockchain.bot.tenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新租户
         * Summary: 更新租户
         */
        public async Task<UpdateTenantResponse> UpdateTenantExAsync(UpdateTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTenantResponse>(await DoRequestAsync("1.0", "blockchain.bot.tenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新场景码
         * Summary: 更新场景码
         */
        public UpdateSceneResponse UpdateScene(UpdateSceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSceneEx(request, headers, runtime);
        }

        /**
         * Description: 更新场景码
         * Summary: 更新场景码
         */
        public async Task<UpdateSceneResponse> UpdateSceneAsync(UpdateSceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新场景码
         * Summary: 更新场景码
         */
        public UpdateSceneResponse UpdateSceneEx(UpdateSceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSceneResponse>(DoRequest("1.0", "blockchain.bot.scene.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新场景码
         * Summary: 更新场景码
         */
        public async Task<UpdateSceneResponse> UpdateSceneExAsync(UpdateSceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSceneResponse>(await DoRequestAsync("1.0", "blockchain.bot.scene.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
         * Summary: 上报标签流转的异步接口
         */
        public SendLabelTransferonasyncResponse SendLabelTransferonasync(SendLabelTransferonasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendLabelTransferonasyncEx(request, headers, runtime);
        }

        /**
         * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
         * Summary: 上报标签流转的异步接口
         */
        public async Task<SendLabelTransferonasyncResponse> SendLabelTransferonasyncAsync(SendLabelTransferonasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendLabelTransferonasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
         * Summary: 上报标签流转的异步接口
         */
        public SendLabelTransferonasyncResponse SendLabelTransferonasyncEx(SendLabelTransferonasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendLabelTransferonasyncResponse>(DoRequest("1.0", "blockchain.bot.label.transferonasync.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
         * Summary: 上报标签流转的异步接口
         */
        public async Task<SendLabelTransferonasyncResponse> SendLabelTransferonasyncExAsync(SendLabelTransferonasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendLabelTransferonasyncResponse>(await DoRequestAsync("1.0", "blockchain.bot.label.transferonasync.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果 
         * Summary: 异步接口结果查询
         */
        public QueryAsyncRequestResponse QueryAsyncRequest(QueryAsyncRequestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAsyncRequestEx(request, headers, runtime);
        }

        /**
         * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果 
         * Summary: 异步接口结果查询
         */
        public async Task<QueryAsyncRequestResponse> QueryAsyncRequestAsync(QueryAsyncRequestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAsyncRequestExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果 
         * Summary: 异步接口结果查询
         */
        public QueryAsyncRequestResponse QueryAsyncRequestEx(QueryAsyncRequestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAsyncRequestResponse>(DoRequest("1.0", "blockchain.bot.async.request.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果 
         * Summary: 异步接口结果查询
         */
        public async Task<QueryAsyncRequestResponse> QueryAsyncRequestExAsync(QueryAsyncRequestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAsyncRequestResponse>(await DoRequestAsync("1.0", "blockchain.bot.async.request.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询租户
         * Summary: 分页查询租户
         */
        public PagequeryTenantResponse PagequeryTenant(PagequeryTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryTenantEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询租户
         * Summary: 分页查询租户
         */
        public async Task<PagequeryTenantResponse> PagequeryTenantAsync(PagequeryTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询租户
         * Summary: 分页查询租户
         */
        public PagequeryTenantResponse PagequeryTenantEx(PagequeryTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTenantResponse>(DoRequest("1.0", "blockchain.bot.tenant.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询租户
         * Summary: 分页查询租户
         */
        public async Task<PagequeryTenantResponse> PagequeryTenantExAsync(PagequeryTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryTenantResponse>(await DoRequestAsync("1.0", "blockchain.bot.tenant.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询场景码
         * Summary: 分页查询场景码
         */
        public PagequerySceneResponse PagequeryScene(PagequerySceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequerySceneEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询场景码
         * Summary: 分页查询场景码
         */
        public async Task<PagequerySceneResponse> PagequerySceneAsync(PagequerySceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequerySceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询场景码
         * Summary: 分页查询场景码
         */
        public PagequerySceneResponse PagequerySceneEx(PagequerySceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequerySceneResponse>(DoRequest("1.0", "blockchain.bot.scene.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询场景码
         * Summary: 分页查询场景码
         */
        public async Task<PagequerySceneResponse> PagequerySceneExAsync(PagequerySceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequerySceneResponse>(await DoRequestAsync("1.0", "blockchain.bot.scene.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询sdk
         * Summary: 分页查询sdk
         */
        public PagequerySdkResponse PagequerySdk(PagequerySdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequerySdkEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询sdk
         * Summary: 分页查询sdk
         */
        public async Task<PagequerySdkResponse> PagequerySdkAsync(PagequerySdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequerySdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询sdk
         * Summary: 分页查询sdk
         */
        public PagequerySdkResponse PagequerySdkEx(PagequerySdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequerySdkResponse>(DoRequest("1.0", "blockchain.bot.sdk.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询sdk
         * Summary: 分页查询sdk
         */
        public async Task<PagequerySdkResponse> PagequerySdkExAsync(PagequerySdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequerySdkResponse>(await DoRequestAsync("1.0", "blockchain.bot.sdk.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询productKey
         * Summary: 分页查询productKey
         */
        public PagequeryProductkeyResponse PagequeryProductkey(PagequeryProductkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryProductkeyEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询productKey
         * Summary: 分页查询productKey
         */
        public async Task<PagequeryProductkeyResponse> PagequeryProductkeyAsync(PagequeryProductkeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryProductkeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询productKey
         * Summary: 分页查询productKey
         */
        public PagequeryProductkeyResponse PagequeryProductkeyEx(PagequeryProductkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryProductkeyResponse>(DoRequest("1.0", "blockchain.bot.productkey.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询productKey
         * Summary: 分页查询productKey
         */
        public async Task<PagequeryProductkeyResponse> PagequeryProductkeyExAsync(PagequeryProductkeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryProductkeyResponse>(await DoRequestAsync("1.0", "blockchain.bot.productkey.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询校验失败的数据
         * Summary: 分页查询校验失败的数据
         */
        public PagequeryDataverifyFailureResponse PagequeryDataverifyFailure(PagequeryDataverifyFailureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryDataverifyFailureEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询校验失败的数据
         * Summary: 分页查询校验失败的数据
         */
        public async Task<PagequeryDataverifyFailureResponse> PagequeryDataverifyFailureAsync(PagequeryDataverifyFailureRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryDataverifyFailureExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询校验失败的数据
         * Summary: 分页查询校验失败的数据
         */
        public PagequeryDataverifyFailureResponse PagequeryDataverifyFailureEx(PagequeryDataverifyFailureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDataverifyFailureResponse>(DoRequest("1.0", "blockchain.bot.dataverify.failure.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询校验失败的数据
         * Summary: 分页查询校验失败的数据
         */
        public async Task<PagequeryDataverifyFailureResponse> PagequeryDataverifyFailureExAsync(PagequeryDataverifyFailureRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryDataverifyFailureResponse>(await DoRequestAsync("1.0", "blockchain.bot.dataverify.failure.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  新增告警策略
         * Summary:  新增告警策略
         */
        public AddAlertStrategyResponse AddAlertStrategy(AddAlertStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAlertStrategyEx(request, headers, runtime);
        }

        /**
         * Description:  新增告警策略
         * Summary:  新增告警策略
         */
        public async Task<AddAlertStrategyResponse> AddAlertStrategyAsync(AddAlertStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAlertStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description:  新增告警策略
         * Summary:  新增告警策略
         */
        public AddAlertStrategyResponse AddAlertStrategyEx(AddAlertStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAlertStrategyResponse>(DoRequest("1.0", "blockchain.bot.alert.strategy.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  新增告警策略
         * Summary:  新增告警策略
         */
        public async Task<AddAlertStrategyResponse> AddAlertStrategyExAsync(AddAlertStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAlertStrategyResponse>(await DoRequestAsync("1.0", "blockchain.bot.alert.strategy.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新告警策略接口
         * Summary: 更新告警策略接口
         */
        public UpdateAlertStrategyResponse UpdateAlertStrategy(UpdateAlertStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAlertStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 更新告警策略接口
         * Summary: 更新告警策略接口
         */
        public async Task<UpdateAlertStrategyResponse> UpdateAlertStrategyAsync(UpdateAlertStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAlertStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新告警策略接口
         * Summary: 更新告警策略接口
         */
        public UpdateAlertStrategyResponse UpdateAlertStrategyEx(UpdateAlertStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAlertStrategyResponse>(DoRequest("1.0", "blockchain.bot.alert.strategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新告警策略接口
         * Summary: 更新告警策略接口
         */
        public async Task<UpdateAlertStrategyResponse> UpdateAlertStrategyExAsync(UpdateAlertStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAlertStrategyResponse>(await DoRequestAsync("1.0", "blockchain.bot.alert.strategy.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询告警策略接口
         * Summary: 分页查询告警策略接口
         */
        public PagequeryAlertStrategyResponse PagequeryAlertStrategy(PagequeryAlertStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryAlertStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询告警策略接口
         * Summary: 分页查询告警策略接口
         */
        public async Task<PagequeryAlertStrategyResponse> PagequeryAlertStrategyAsync(PagequeryAlertStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryAlertStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询告警策略接口
         * Summary: 分页查询告警策略接口
         */
        public PagequeryAlertStrategyResponse PagequeryAlertStrategyEx(PagequeryAlertStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAlertStrategyResponse>(DoRequest("1.0", "blockchain.bot.alert.strategy.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询告警策略接口
         * Summary: 分页查询告警策略接口
         */
        public async Task<PagequeryAlertStrategyResponse> PagequeryAlertStrategyExAsync(PagequeryAlertStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAlertStrategyResponse>(await DoRequestAsync("1.0", "blockchain.bot.alert.strategy.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签流转状态同步（元数据，无签名）
         * Summary: 标签流转状态同步（元数据，无签名）
         */
        public SyncLabelTransferrawResponse SyncLabelTransferraw(SyncLabelTransferrawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncLabelTransferrawEx(request, headers, runtime);
        }

        /**
         * Description: 标签流转状态同步（元数据，无签名）
         * Summary: 标签流转状态同步（元数据，无签名）
         */
        public async Task<SyncLabelTransferrawResponse> SyncLabelTransferrawAsync(SyncLabelTransferrawRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncLabelTransferrawExAsync(request, headers, runtime);
        }

        /**
         * Description: 标签流转状态同步（元数据，无签名）
         * Summary: 标签流转状态同步（元数据，无签名）
         */
        public SyncLabelTransferrawResponse SyncLabelTransferrawEx(SyncLabelTransferrawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncLabelTransferrawResponse>(DoRequest("1.0", "blockchain.bot.label.transferraw.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标签流转状态同步（元数据，无签名）
         * Summary: 标签流转状态同步（元数据，无签名）
         */
        public async Task<SyncLabelTransferrawResponse> SyncLabelTransferrawExAsync(SyncLabelTransferrawRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncLabelTransferrawResponse>(await DoRequestAsync("1.0", "blockchain.bot.label.transferraw.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
         * Summary: 上报标签流转的异步接口（元数据，无签名）
         */
        public SendLabelTransferrawonasyncResponse SendLabelTransferrawonasync(SendLabelTransferrawonasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendLabelTransferrawonasyncEx(request, headers, runtime);
        }

        /**
         * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
         * Summary: 上报标签流转的异步接口（元数据，无签名）
         */
        public async Task<SendLabelTransferrawonasyncResponse> SendLabelTransferrawonasyncAsync(SendLabelTransferrawonasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendLabelTransferrawonasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
         * Summary: 上报标签流转的异步接口（元数据，无签名）
         */
        public SendLabelTransferrawonasyncResponse SendLabelTransferrawonasyncEx(SendLabelTransferrawonasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendLabelTransferrawonasyncResponse>(DoRequest("1.0", "blockchain.bot.label.transferrawonasync.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
         * Summary: 上报标签流转的异步接口（元数据，无签名）
         */
        public async Task<SendLabelTransferrawonasyncResponse> SendLabelTransferrawonasyncExAsync(SendLabelTransferrawonasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendLabelTransferrawonasyncResponse>(await DoRequestAsync("1.0", "blockchain.bot.label.transferrawonasync.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
         * Summary: 查询验收已对接的数据
         */
        public QueryDockedDataResponse QueryDockedData(QueryDockedDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDockedDataEx(request, headers, runtime);
        }

        /**
         * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
         * Summary: 查询验收已对接的数据
         */
        public async Task<QueryDockedDataResponse> QueryDockedDataAsync(QueryDockedDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDockedDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
         * Summary: 查询验收已对接的数据
         */
        public QueryDockedDataResponse QueryDockedDataEx(QueryDockedDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDockedDataResponse>(DoRequest("1.0", "blockchain.bot.docked.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
         * Summary: 查询验收已对接的数据
         */
        public async Task<QueryDockedDataResponse> QueryDockedDataExAsync(QueryDockedDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDockedDataResponse>(await DoRequestAsync("1.0", "blockchain.bot.docked.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建实体关联关系
         * Summary: 创建实体关联关系
         */
        public CreateDeviceRelationResponse CreateDeviceRelation(CreateDeviceRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDeviceRelationEx(request, headers, runtime);
        }

        /**
         * Description: 创建实体关联关系
         * Summary: 创建实体关联关系
         */
        public async Task<CreateDeviceRelationResponse> CreateDeviceRelationAsync(CreateDeviceRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDeviceRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建实体关联关系
         * Summary: 创建实体关联关系
         */
        public CreateDeviceRelationResponse CreateDeviceRelationEx(CreateDeviceRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeviceRelationResponse>(DoRequest("1.0", "blockchain.bot.device.relation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建实体关联关系
         * Summary: 创建实体关联关系
         */
        public async Task<CreateDeviceRelationResponse> CreateDeviceRelationExAsync(CreateDeviceRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeviceRelationResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.relation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除实体关联关系
         * Summary: 删除实体关联关系
         */
        public DeleteDeviceRelationResponse DeleteDeviceRelation(DeleteDeviceRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDeviceRelationEx(request, headers, runtime);
        }

        /**
         * Description: 删除实体关联关系
         * Summary: 删除实体关联关系
         */
        public async Task<DeleteDeviceRelationResponse> DeleteDeviceRelationAsync(DeleteDeviceRelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDeviceRelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除实体关联关系
         * Summary: 删除实体关联关系
         */
        public DeleteDeviceRelationResponse DeleteDeviceRelationEx(DeleteDeviceRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDeviceRelationResponse>(DoRequest("1.0", "blockchain.bot.device.relation.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除实体关联关系
         * Summary: 删除实体关联关系
         */
        public async Task<DeleteDeviceRelationResponse> DeleteDeviceRelationExAsync(DeleteDeviceRelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDeviceRelationResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.relation.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送单个设备所产生的设备数据
         * Summary: 推送设备数据
         */
        public PushCollectotBychainidResponse PushCollectotBychainid(PushCollectotBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushCollectotBychainidEx(request, headers, runtime);
        }

        /**
         * Description: 推送单个设备所产生的设备数据
         * Summary: 推送设备数据
         */
        public async Task<PushCollectotBychainidResponse> PushCollectotBychainidAsync(PushCollectotBychainidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushCollectotBychainidExAsync(request, headers, runtime);
        }

        /**
         * Description: 推送单个设备所产生的设备数据
         * Summary: 推送设备数据
         */
        public PushCollectotBychainidResponse PushCollectotBychainidEx(PushCollectotBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushCollectotBychainidResponse>(DoRequest("1.0", "blockchain.bot.collectot.bychainid.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送单个设备所产生的设备数据
         * Summary: 推送设备数据
         */
        public async Task<PushCollectotBychainidResponse> PushCollectotBychainidExAsync(PushCollectotBychainidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushCollectotBychainidResponse>(await DoRequestAsync("1.0", "blockchain.bot.collectot.bychainid.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送设备状态变更信息
         * Summary: 推送设备状态变更信息
         */
        public NotifyPullstrategyChangestatusResponse NotifyPullstrategyChangestatus(NotifyPullstrategyChangestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyPullstrategyChangestatusEx(request, headers, runtime);
        }

        /**
         * Description: 推送设备状态变更信息
         * Summary: 推送设备状态变更信息
         */
        public async Task<NotifyPullstrategyChangestatusResponse> NotifyPullstrategyChangestatusAsync(NotifyPullstrategyChangestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyPullstrategyChangestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 推送设备状态变更信息
         * Summary: 推送设备状态变更信息
         */
        public NotifyPullstrategyChangestatusResponse NotifyPullstrategyChangestatusEx(NotifyPullstrategyChangestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyPullstrategyChangestatusResponse>(DoRequest("1.0", "blockchain.bot.pullstrategy.changestatus.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送设备状态变更信息
         * Summary: 推送设备状态变更信息
         */
        public async Task<NotifyPullstrategyChangestatusResponse> NotifyPullstrategyChangestatusExAsync(NotifyPullstrategyChangestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyPullstrategyChangestatusResponse>(await DoRequestAsync("1.0", "blockchain.bot.pullstrategy.changestatus.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送订单信息
         * Summary: 推送订单信息
         */
        public NotifyPullstrategyChargeorderinfoResponse NotifyPullstrategyChargeorderinfo(NotifyPullstrategyChargeorderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyPullstrategyChargeorderinfoEx(request, headers, runtime);
        }

        /**
         * Description: 推送订单信息
         * Summary: 推送订单信息
         */
        public async Task<NotifyPullstrategyChargeorderinfoResponse> NotifyPullstrategyChargeorderinfoAsync(NotifyPullstrategyChargeorderinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyPullstrategyChargeorderinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 推送订单信息
         * Summary: 推送订单信息
         */
        public NotifyPullstrategyChargeorderinfoResponse NotifyPullstrategyChargeorderinfoEx(NotifyPullstrategyChargeorderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyPullstrategyChargeorderinfoResponse>(DoRequest("1.0", "blockchain.bot.pullstrategy.chargeorderinfo.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送订单信息
         * Summary: 推送订单信息
         */
        public async Task<NotifyPullstrategyChargeorderinfoResponse> NotifyPullstrategyChargeorderinfoExAsync(NotifyPullstrategyChargeorderinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyPullstrategyChargeorderinfoResponse>(await DoRequestAsync("1.0", "blockchain.bot.pullstrategy.chargeorderinfo.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 菜鸟设备监控信息获取
         * Summary: 菜鸟设备监控信息获取
         */
        public QueryScfleaseEqpinfoResponse QueryScfleaseEqpinfo(QueryScfleaseEqpinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryScfleaseEqpinfoEx(request, headers, runtime);
        }

        /**
         * Description: 菜鸟设备监控信息获取
         * Summary: 菜鸟设备监控信息获取
         */
        public async Task<QueryScfleaseEqpinfoResponse> QueryScfleaseEqpinfoAsync(QueryScfleaseEqpinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryScfleaseEqpinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 菜鸟设备监控信息获取
         * Summary: 菜鸟设备监控信息获取
         */
        public QueryScfleaseEqpinfoResponse QueryScfleaseEqpinfoEx(QueryScfleaseEqpinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryScfleaseEqpinfoResponse>(DoRequest("1.0", "blockchain.bot.scflease.eqpinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 菜鸟设备监控信息获取
         * Summary: 菜鸟设备监控信息获取
         */
        public async Task<QueryScfleaseEqpinfoResponse> QueryScfleaseEqpinfoExAsync(QueryScfleaseEqpinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryScfleaseEqpinfoResponse>(await DoRequestAsync("1.0", "blockchain.bot.scflease.eqpinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建自定义的实体数据
         * Summary: 创建自定义实体
         */
        public CreateCustomerEntityResponse CreateCustomerEntity(CreateCustomerEntityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCustomerEntityEx(request, headers, runtime);
        }

        /**
         * Description: 创建自定义的实体数据
         * Summary: 创建自定义实体
         */
        public async Task<CreateCustomerEntityResponse> CreateCustomerEntityAsync(CreateCustomerEntityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCustomerEntityExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建自定义的实体数据
         * Summary: 创建自定义实体
         */
        public CreateCustomerEntityResponse CreateCustomerEntityEx(CreateCustomerEntityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCustomerEntityResponse>(DoRequest("1.0", "blockchain.bot.customer.entity.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建自定义的实体数据
         * Summary: 创建自定义实体
         */
        public async Task<CreateCustomerEntityResponse> CreateCustomerEntityExAsync(CreateCustomerEntityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCustomerEntityResponse>(await DoRequestAsync("1.0", "blockchain.bot.customer.entity.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
         * Summary: 更新自定义实体
         */
        public UpdateCustomerEntityResponse UpdateCustomerEntity(UpdateCustomerEntityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCustomerEntityEx(request, headers, runtime);
        }

        /**
         * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
         * Summary: 更新自定义实体
         */
        public async Task<UpdateCustomerEntityResponse> UpdateCustomerEntityAsync(UpdateCustomerEntityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCustomerEntityExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
         * Summary: 更新自定义实体
         */
        public UpdateCustomerEntityResponse UpdateCustomerEntityEx(UpdateCustomerEntityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustomerEntityResponse>(DoRequest("1.0", "blockchain.bot.customer.entity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
         * Summary: 更新自定义实体
         */
        public async Task<UpdateCustomerEntityResponse> UpdateCustomerEntityExAsync(UpdateCustomerEntityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustomerEntityResponse>(await DoRequestAsync("1.0", "blockchain.bot.customer.entity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为租户创建物模型
         * Summary: 为租户创建物模型
         */
        public CreateThingmodelResponse CreateThingmodel(CreateThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: 为租户创建物模型
         * Summary: 为租户创建物模型
         */
        public async Task<CreateThingmodelResponse> CreateThingmodelAsync(CreateThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 为租户创建物模型
         * Summary: 为租户创建物模型
         */
        public CreateThingmodelResponse CreateThingmodelEx(CreateThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateThingmodelResponse>(DoRequest("1.0", "blockchain.bot.thingmodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为租户创建物模型
         * Summary: 为租户创建物模型
         */
        public async Task<CreateThingmodelResponse> CreateThingmodelExAsync(CreateThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingmodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的物模型
         * Summary: 查询租户的物模型
         */
        public QueryThingmodelResponse QueryThingmodel(QueryThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户的物模型
         * Summary: 查询租户的物模型
         */
        public async Task<QueryThingmodelResponse> QueryThingmodelAsync(QueryThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户的物模型
         * Summary: 查询租户的物模型
         */
        public QueryThingmodelResponse QueryThingmodelEx(QueryThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingmodelResponse>(DoRequest("1.0", "blockchain.bot.thingmodel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的物模型
         * Summary: 查询租户的物模型
         */
        public async Task<QueryThingmodelResponse> QueryThingmodelExAsync(QueryThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingmodel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过设备异步批量发行设备
         * Summary: 通过设备异步批量发行设备
         */
        public CreateDistributedeviceBydevicemulResponse CreateDistributedeviceBydevicemul(CreateDistributedeviceBydevicemulRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDistributedeviceBydevicemulEx(request, headers, runtime);
        }

        /**
         * Description: 通过设备异步批量发行设备
         * Summary: 通过设备异步批量发行设备
         */
        public async Task<CreateDistributedeviceBydevicemulResponse> CreateDistributedeviceBydevicemulAsync(CreateDistributedeviceBydevicemulRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDistributedeviceBydevicemulExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过设备异步批量发行设备
         * Summary: 通过设备异步批量发行设备
         */
        public CreateDistributedeviceBydevicemulResponse CreateDistributedeviceBydevicemulEx(CreateDistributedeviceBydevicemulRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBydevicemulResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bydevicemul.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过设备异步批量发行设备
         * Summary: 通过设备异步批量发行设备
         */
        public async Task<CreateDistributedeviceBydevicemulResponse> CreateDistributedeviceBydevicemulExAsync(CreateDistributedeviceBydevicemulRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBydevicemulResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bydevicemul.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过设备ID异步批量发行设备
         * Summary: 通过设备ID异步批量发行设备
         */
        public CreateDistributedeviceBydeviceidmulResponse CreateDistributedeviceBydeviceidmul(CreateDistributedeviceBydeviceidmulRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDistributedeviceBydeviceidmulEx(request, headers, runtime);
        }

        /**
         * Description: 通过设备ID异步批量发行设备
         * Summary: 通过设备ID异步批量发行设备
         */
        public async Task<CreateDistributedeviceBydeviceidmulResponse> CreateDistributedeviceBydeviceidmulAsync(CreateDistributedeviceBydeviceidmulRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDistributedeviceBydeviceidmulExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过设备ID异步批量发行设备
         * Summary: 通过设备ID异步批量发行设备
         */
        public CreateDistributedeviceBydeviceidmulResponse CreateDistributedeviceBydeviceidmulEx(CreateDistributedeviceBydeviceidmulRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBydeviceidmulResponse>(DoRequest("1.0", "blockchain.bot.distributedevice.bydeviceidmul.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过设备ID异步批量发行设备
         * Summary: 通过设备ID异步批量发行设备
         */
        public async Task<CreateDistributedeviceBydeviceidmulResponse> CreateDistributedeviceBydeviceidmulExAsync(CreateDistributedeviceBydeviceidmulRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDistributedeviceBydeviceidmulResponse>(await DoRequestAsync("1.0", "blockchain.bot.distributedevice.bydeviceidmul.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定实体关系
         * Summary: 绑定实体关系
         */
        public BindEntityrelationResponse BindEntityrelation(BindEntityrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindEntityrelationEx(request, headers, runtime);
        }

        /**
         * Description: 绑定实体关系
         * Summary: 绑定实体关系
         */
        public async Task<BindEntityrelationResponse> BindEntityrelationAsync(BindEntityrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindEntityrelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 绑定实体关系
         * Summary: 绑定实体关系
         */
        public BindEntityrelationResponse BindEntityrelationEx(BindEntityrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindEntityrelationResponse>(DoRequest("1.0", "blockchain.bot.entityrelation.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 绑定实体关系
         * Summary: 绑定实体关系
         */
        public async Task<BindEntityrelationResponse> BindEntityrelationExAsync(BindEntityrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindEntityrelationResponse>(await DoRequestAsync("1.0", "blockchain.bot.entityrelation.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量解绑实体关系
         * Summary: 批量解绑实体关系
         */
        public UnbindEntityrelationResponse UnbindEntityrelation(UnbindEntityrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindEntityrelationEx(request, headers, runtime);
        }

        /**
         * Description: 批量解绑实体关系
         * Summary: 批量解绑实体关系
         */
        public async Task<UnbindEntityrelationResponse> UnbindEntityrelationAsync(UnbindEntityrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindEntityrelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量解绑实体关系
         * Summary: 批量解绑实体关系
         */
        public UnbindEntityrelationResponse UnbindEntityrelationEx(UnbindEntityrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindEntityrelationResponse>(DoRequest("1.0", "blockchain.bot.entityrelation.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量解绑实体关系
         * Summary: 批量解绑实体关系
         */
        public async Task<UnbindEntityrelationResponse> UnbindEntityrelationExAsync(UnbindEntityrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindEntityrelationResponse>(await DoRequestAsync("1.0", "blockchain.bot.entityrelation.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链oneapi
         * Summary: 信物链oneapi
         */
        public ExecThingsdidOneapiResponse ExecThingsdidOneapi(ExecThingsdidOneapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecThingsdidOneapiEx(request, headers, runtime);
        }

        /**
         * Description: 信物链oneapi
         * Summary: 信物链oneapi
         */
        public async Task<ExecThingsdidOneapiResponse> ExecThingsdidOneapiAsync(ExecThingsdidOneapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecThingsdidOneapiExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链oneapi
         * Summary: 信物链oneapi
         */
        public ExecThingsdidOneapiResponse ExecThingsdidOneapiEx(ExecThingsdidOneapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecThingsdidOneapiResponse>(DoRequest("1.0", "blockchain.bot.thingsdid.oneapi.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链oneapi
         * Summary: 信物链oneapi
         */
        public async Task<ExecThingsdidOneapiResponse> ExecThingsdidOneapiExAsync(ExecThingsdidOneapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecThingsdidOneapiResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingsdid.oneapi.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链存证
         * Summary: 信物链存证
         */
        public StartEvidenceStoreResponse StartEvidenceStore(StartEvidenceStoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartEvidenceStoreEx(request, headers, runtime);
        }

        /**
         * Description: 信物链存证
         * Summary: 信物链存证
         */
        public async Task<StartEvidenceStoreResponse> StartEvidenceStoreAsync(StartEvidenceStoreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartEvidenceStoreExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链存证
         * Summary: 信物链存证
         */
        public StartEvidenceStoreResponse StartEvidenceStoreEx(StartEvidenceStoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartEvidenceStoreResponse>(DoRequest("1.0", "blockchain.bot.evidence.store.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链存证
         * Summary: 信物链存证
         */
        public async Task<StartEvidenceStoreResponse> StartEvidenceStoreExAsync(StartEvidenceStoreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartEvidenceStoreResponse>(await DoRequestAsync("1.0", "blockchain.bot.evidence.store.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链存证查询
         * Summary: 信物链存证查询
         */
        public StartEvidenceQueryResponse StartEvidenceQuery(StartEvidenceQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartEvidenceQueryEx(request, headers, runtime);
        }

        /**
         * Description: 信物链存证查询
         * Summary: 信物链存证查询
         */
        public async Task<StartEvidenceQueryResponse> StartEvidenceQueryAsync(StartEvidenceQueryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartEvidenceQueryExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链存证查询
         * Summary: 信物链存证查询
         */
        public StartEvidenceQueryResponse StartEvidenceQueryEx(StartEvidenceQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartEvidenceQueryResponse>(DoRequest("1.0", "blockchain.bot.evidence.query.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链存证查询
         * Summary: 信物链存证查询
         */
        public async Task<StartEvidenceQueryResponse> StartEvidenceQueryExAsync(StartEvidenceQueryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartEvidenceQueryResponse>(await DoRequestAsync("1.0", "blockchain.bot.evidence.query.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链实体身份注册
         * Summary: 信物链实体身份注册
         */
        public StartThingsdidRegisterResponse StartThingsdidRegister(StartThingsdidRegisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartThingsdidRegisterEx(request, headers, runtime);
        }

        /**
         * Description: 信物链实体身份注册
         * Summary: 信物链实体身份注册
         */
        public async Task<StartThingsdidRegisterResponse> StartThingsdidRegisterAsync(StartThingsdidRegisterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartThingsdidRegisterExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链实体身份注册
         * Summary: 信物链实体身份注册
         */
        public StartThingsdidRegisterResponse StartThingsdidRegisterEx(StartThingsdidRegisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartThingsdidRegisterResponse>(DoRequest("1.0", "blockchain.bot.thingsdid.register.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链实体身份注册
         * Summary: 信物链实体身份注册
         */
        public async Task<StartThingsdidRegisterResponse> StartThingsdidRegisterExAsync(StartThingsdidRegisterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartThingsdidRegisterResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingsdid.register.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
         * Summary: 信物链异步操作查询
         */
        public QueryThingsdidAsyncprocessResponse QueryThingsdidAsyncprocess(QueryThingsdidAsyncprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryThingsdidAsyncprocessEx(request, headers, runtime);
        }

        /**
         * Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
         * Summary: 信物链异步操作查询
         */
        public async Task<QueryThingsdidAsyncprocessResponse> QueryThingsdidAsyncprocessAsync(QueryThingsdidAsyncprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryThingsdidAsyncprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
         * Summary: 信物链异步操作查询
         */
        public QueryThingsdidAsyncprocessResponse QueryThingsdidAsyncprocessEx(QueryThingsdidAsyncprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingsdidAsyncprocessResponse>(DoRequest("1.0", "blockchain.bot.thingsdid.asyncprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
         * Summary: 信物链异步操作查询
         */
        public async Task<QueryThingsdidAsyncprocessResponse> QueryThingsdidAsyncprocessExAsync(QueryThingsdidAsyncprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingsdidAsyncprocessResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingsdid.asyncprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
         * Summary: 信物链身份状态更新
         */
        public UpdateThingsdidStatusResponse UpdateThingsdidStatus(UpdateThingsdidStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateThingsdidStatusEx(request, headers, runtime);
        }

        /**
         * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
         * Summary: 信物链身份状态更新
         */
        public async Task<UpdateThingsdidStatusResponse> UpdateThingsdidStatusAsync(UpdateThingsdidStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateThingsdidStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
         * Summary: 信物链身份状态更新
         */
        public UpdateThingsdidStatusResponse UpdateThingsdidStatusEx(UpdateThingsdidStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateThingsdidStatusResponse>(DoRequest("1.0", "blockchain.bot.thingsdid.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链身份状态更新，此API目前仅支持设备状态更新
         * Summary: 信物链身份状态更新
         */
        public async Task<UpdateThingsdidStatusResponse> UpdateThingsdidStatusExAsync(UpdateThingsdidStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateThingsdidStatusResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingsdid.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
         * Summary: 信物链设备空间关联更新
         */
        public UpdateThingsdidDevicespaceResponse UpdateThingsdidDevicespace(UpdateThingsdidDevicespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateThingsdidDevicespaceEx(request, headers, runtime);
        }

        /**
         * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
         * Summary: 信物链设备空间关联更新
         */
        public async Task<UpdateThingsdidDevicespaceResponse> UpdateThingsdidDevicespaceAsync(UpdateThingsdidDevicespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateThingsdidDevicespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
         * Summary: 信物链设备空间关联更新
         */
        public UpdateThingsdidDevicespaceResponse UpdateThingsdidDevicespaceEx(UpdateThingsdidDevicespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateThingsdidDevicespaceResponse>(DoRequest("1.0", "blockchain.bot.thingsdid.devicespace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链设备空间关联更新，完成设备和空间关联绑定
         * Summary: 信物链设备空间关联更新
         */
        public async Task<UpdateThingsdidDevicespaceResponse> UpdateThingsdidDevicespaceExAsync(UpdateThingsdidDevicespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateThingsdidDevicespaceResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingsdid.devicespace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链实体did查询，根据dataFilter过滤输出
         * Summary: 信物链实体did查询
         */
        public QueryThingsdidDidResponse QueryThingsdidDid(QueryThingsdidDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryThingsdidDidEx(request, headers, runtime);
        }

        /**
         * Description: 信物链实体did查询，根据dataFilter过滤输出
         * Summary: 信物链实体did查询
         */
        public async Task<QueryThingsdidDidResponse> QueryThingsdidDidAsync(QueryThingsdidDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryThingsdidDidExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链实体did查询，根据dataFilter过滤输出
         * Summary: 信物链实体did查询
         */
        public QueryThingsdidDidResponse QueryThingsdidDidEx(QueryThingsdidDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingsdidDidResponse>(DoRequest("1.0", "blockchain.bot.thingsdid.did.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链实体did查询，根据dataFilter过滤输出
         * Summary: 信物链实体did查询
         */
        public async Task<QueryThingsdidDidResponse> QueryThingsdidDidExAsync(QueryThingsdidDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingsdidDidResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingsdid.did.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链实体身份更新，字段空则不更新。
         * Summary: 信物链实体身份更新
         */
        public UpdateThingsdidDidResponse UpdateThingsdidDid(UpdateThingsdidDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateThingsdidDidEx(request, headers, runtime);
        }

        /**
         * Description: 信物链实体身份更新，字段空则不更新。
         * Summary: 信物链实体身份更新
         */
        public async Task<UpdateThingsdidDidResponse> UpdateThingsdidDidAsync(UpdateThingsdidDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateThingsdidDidExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链实体身份更新，字段空则不更新。
         * Summary: 信物链实体身份更新
         */
        public UpdateThingsdidDidResponse UpdateThingsdidDidEx(UpdateThingsdidDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateThingsdidDidResponse>(DoRequest("1.0", "blockchain.bot.thingsdid.did.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链实体身份更新，字段空则不更新。
         * Summary: 信物链实体身份更新
         */
        public async Task<UpdateThingsdidDidResponse> UpdateThingsdidDidExAsync(UpdateThingsdidDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateThingsdidDidResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingsdid.did.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链租户信息关联
         * Summary: 信物链租户信息关联
         */
        public StartTenantBindinfoResponse StartTenantBindinfo(StartTenantBindinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartTenantBindinfoEx(request, headers, runtime);
        }

        /**
         * Description: 信物链租户信息关联
         * Summary: 信物链租户信息关联
         */
        public async Task<StartTenantBindinfoResponse> StartTenantBindinfoAsync(StartTenantBindinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartTenantBindinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链租户信息关联
         * Summary: 信物链租户信息关联
         */
        public StartTenantBindinfoResponse StartTenantBindinfoEx(StartTenantBindinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartTenantBindinfoResponse>(DoRequest("1.0", "blockchain.bot.tenant.bindinfo.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链租户信息关联
         * Summary: 信物链租户信息关联
         */
        public async Task<StartTenantBindinfoResponse> StartTenantBindinfoExAsync(StartTenantBindinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartTenantBindinfoResponse>(await DoRequestAsync("1.0", "blockchain.bot.tenant.bindinfo.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
         * Summary: 信物链租户项目创建
         */
        public CreateTenantProjectResponse CreateTenantProject(CreateTenantProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTenantProjectEx(request, headers, runtime);
        }

        /**
         * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
         * Summary: 信物链租户项目创建
         */
        public async Task<CreateTenantProjectResponse> CreateTenantProjectAsync(CreateTenantProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTenantProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
         * Summary: 信物链租户项目创建
         */
        public CreateTenantProjectResponse CreateTenantProjectEx(CreateTenantProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTenantProjectResponse>(DoRequest("1.0", "blockchain.bot.tenant.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
         * Summary: 信物链租户项目创建
         */
        public async Task<CreateTenantProjectResponse> CreateTenantProjectExAsync(CreateTenantProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTenantProjectResponse>(await DoRequestAsync("1.0", "blockchain.bot.tenant.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
         * Summary: 信物链实体访问权限更新
         */
        public UpdateThingsdidTenantResponse UpdateThingsdidTenant(UpdateThingsdidTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateThingsdidTenantEx(request, headers, runtime);
        }

        /**
         * Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
         * Summary: 信物链实体访问权限更新
         */
        public async Task<UpdateThingsdidTenantResponse> UpdateThingsdidTenantAsync(UpdateThingsdidTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateThingsdidTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
         * Summary: 信物链实体访问权限更新
         */
        public UpdateThingsdidTenantResponse UpdateThingsdidTenantEx(UpdateThingsdidTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateThingsdidTenantResponse>(DoRequest("1.0", "blockchain.bot.thingsdid.tenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
         * Summary: 信物链实体访问权限更新
         */
        public async Task<UpdateThingsdidTenantResponse> UpdateThingsdidTenantExAsync(UpdateThingsdidTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateThingsdidTenantResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingsdid.tenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LoadCertificateTSMCmd，仅限内部使用api
         * Summary: TSM迁移内部使用 
         */
        public LoadTsmCertificatetsmResponse LoadTsmCertificatetsm(LoadTsmCertificatetsmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoadTsmCertificatetsmEx(request, headers, runtime);
        }

        /**
         * Description: LoadCertificateTSMCmd，仅限内部使用api
         * Summary: TSM迁移内部使用 
         */
        public async Task<LoadTsmCertificatetsmResponse> LoadTsmCertificatetsmAsync(LoadTsmCertificatetsmRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoadTsmCertificatetsmExAsync(request, headers, runtime);
        }

        /**
         * Description: LoadCertificateTSMCmd，仅限内部使用api
         * Summary: TSM迁移内部使用 
         */
        public LoadTsmCertificatetsmResponse LoadTsmCertificatetsmEx(LoadTsmCertificatetsmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadTsmCertificatetsmResponse>(DoRequest("1.0", "blockchain.bot.tsm.certificatetsm.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LoadCertificateTSMCmd，仅限内部使用api
         * Summary: TSM迁移内部使用 
         */
        public async Task<LoadTsmCertificatetsmResponse> LoadTsmCertificatetsmExAsync(LoadTsmCertificatetsmRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadTsmCertificatetsmResponse>(await DoRequestAsync("1.0", "blockchain.bot.tsm.certificatetsm.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: TSM迁移内部使用
         * Summary: loadResourceFile
         */
        public LoadTsmResourcefileResponse LoadTsmResourcefile(LoadTsmResourcefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoadTsmResourcefileEx(request, headers, runtime);
        }

        /**
         * Description: TSM迁移内部使用
         * Summary: loadResourceFile
         */
        public async Task<LoadTsmResourcefileResponse> LoadTsmResourcefileAsync(LoadTsmResourcefileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoadTsmResourcefileExAsync(request, headers, runtime);
        }

        /**
         * Description: TSM迁移内部使用
         * Summary: loadResourceFile
         */
        public LoadTsmResourcefileResponse LoadTsmResourcefileEx(LoadTsmResourcefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadTsmResourcefileResponse>(DoRequest("1.0", "blockchain.bot.tsm.resourcefile.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: TSM迁移内部使用
         * Summary: loadResourceFile
         */
        public async Task<LoadTsmResourcefileResponse> LoadTsmResourcefileExAsync(LoadTsmResourcefileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadTsmResourcefileResponse>(await DoRequestAsync("1.0", "blockchain.bot.tsm.resourcefile.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 触发tlsnotary文件认证任务
         * Summary: 触发tlsnotary文件认证任务
         */
        public StartTlsnotaryTaskResponse StartTlsnotaryTask(StartTlsnotaryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartTlsnotaryTaskEx(request, headers, runtime);
        }

        /**
         * Description: 触发tlsnotary文件认证任务
         * Summary: 触发tlsnotary文件认证任务
         */
        public async Task<StartTlsnotaryTaskResponse> StartTlsnotaryTaskAsync(StartTlsnotaryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartTlsnotaryTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 触发tlsnotary文件认证任务
         * Summary: 触发tlsnotary文件认证任务
         */
        public StartTlsnotaryTaskResponse StartTlsnotaryTaskEx(StartTlsnotaryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartTlsnotaryTaskResponse>(DoRequest("1.0", "blockchain.bot.tlsnotary.task.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 触发tlsnotary文件认证任务
         * Summary: 触发tlsnotary文件认证任务
         */
        public async Task<StartTlsnotaryTaskResponse> StartTlsnotaryTaskExAsync(StartTlsnotaryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartTlsnotaryTaskResponse>(await DoRequestAsync("1.0", "blockchain.bot.tlsnotary.task.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询tlsnotary文件认证任务结果
         * Summary: 查询tlsnotary文件认证任务结果
         */
        public QueryTlsnotaryTaskResponse QueryTlsnotaryTask(QueryTlsnotaryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTlsnotaryTaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询tlsnotary文件认证任务结果
         * Summary: 查询tlsnotary文件认证任务结果
         */
        public async Task<QueryTlsnotaryTaskResponse> QueryTlsnotaryTaskAsync(QueryTlsnotaryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTlsnotaryTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询tlsnotary文件认证任务结果
         * Summary: 查询tlsnotary文件认证任务结果
         */
        public QueryTlsnotaryTaskResponse QueryTlsnotaryTaskEx(QueryTlsnotaryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTlsnotaryTaskResponse>(DoRequest("1.0", "blockchain.bot.tlsnotary.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询tlsnotary文件认证任务结果
         * Summary: 查询tlsnotary文件认证任务结果
         */
        public async Task<QueryTlsnotaryTaskResponse> QueryTlsnotaryTaskExAsync(QueryTlsnotaryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTlsnotaryTaskResponse>(await DoRequestAsync("1.0", "blockchain.bot.tlsnotary.task.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
