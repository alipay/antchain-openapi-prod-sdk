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
                        {"sdk_version", "1.11.57"},
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
                        {"sdk_version", "1.11.57"},
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
         * Description: aiot-创建用户通行证
         * Summary: aiot-创建用户通行证
         */
        public CreateXrUserticketResponse CreateXrUserticket(CreateXrUserticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateXrUserticketEx(request, headers, runtime);
        }

        /**
         * Description: aiot-创建用户通行证
         * Summary: aiot-创建用户通行证
         */
        public async Task<CreateXrUserticketResponse> CreateXrUserticketAsync(CreateXrUserticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateXrUserticketExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-创建用户通行证
         * Summary: aiot-创建用户通行证
         */
        public CreateXrUserticketResponse CreateXrUserticketEx(CreateXrUserticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateXrUserticketResponse>(DoRequest("1.0", "blockchain.bot.xr.userticket.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-创建用户通行证
         * Summary: aiot-创建用户通行证
         */
        public async Task<CreateXrUserticketResponse> CreateXrUserticketExAsync(CreateXrUserticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateXrUserticketResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.userticket.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-获取通行证资源池列表
         * Summary: aiot-获取通行证资源池列表
         */
        public ListXrXrticketpoolResponse ListXrXrticketpool(ListXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListXrXrticketpoolEx(request, headers, runtime);
        }

        /**
         * Description: aiot-获取通行证资源池列表
         * Summary: aiot-获取通行证资源池列表
         */
        public async Task<ListXrXrticketpoolResponse> ListXrXrticketpoolAsync(ListXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListXrXrticketpoolExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-获取通行证资源池列表
         * Summary: aiot-获取通行证资源池列表
         */
        public ListXrXrticketpoolResponse ListXrXrticketpoolEx(ListXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXrXrticketpoolResponse>(DoRequest("1.0", "blockchain.bot.xr.xrticketpool.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-获取通行证资源池列表
         * Summary: aiot-获取通行证资源池列表
         */
        public async Task<ListXrXrticketpoolResponse> ListXrXrticketpoolExAsync(ListXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXrXrticketpoolResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.xrticketpool.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-分页查询用户通行证
         * Summary: aiot-分页查询用户通行证
         */
        public PagequeryXrUserticketResponse PagequeryXrUserticket(PagequeryXrUserticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryXrUserticketEx(request, headers, runtime);
        }

        /**
         * Description: aiot-分页查询用户通行证
         * Summary: aiot-分页查询用户通行证
         */
        public async Task<PagequeryXrUserticketResponse> PagequeryXrUserticketAsync(PagequeryXrUserticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryXrUserticketExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-分页查询用户通行证
         * Summary: aiot-分页查询用户通行证
         */
        public PagequeryXrUserticketResponse PagequeryXrUserticketEx(PagequeryXrUserticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryXrUserticketResponse>(DoRequest("1.0", "blockchain.bot.xr.userticket.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-分页查询用户通行证
         * Summary: aiot-分页查询用户通行证
         */
        public async Task<PagequeryXrUserticketResponse> PagequeryXrUserticketExAsync(PagequeryXrUserticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryXrUserticketResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.userticket.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-查询用户通行证
         * Summary: aiot-查询用户通行证
         */
        public GetXrUserticketResponse GetXrUserticket(GetXrUserticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetXrUserticketEx(request, headers, runtime);
        }

        /**
         * Description: aiot-查询用户通行证
         * Summary: aiot-查询用户通行证
         */
        public async Task<GetXrUserticketResponse> GetXrUserticketAsync(GetXrUserticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetXrUserticketExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-查询用户通行证
         * Summary: aiot-查询用户通行证
         */
        public GetXrUserticketResponse GetXrUserticketEx(GetXrUserticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetXrUserticketResponse>(DoRequest("1.0", "blockchain.bot.xr.userticket.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-查询用户通行证
         * Summary: aiot-查询用户通行证
         */
        public async Task<GetXrUserticketResponse> GetXrUserticketExAsync(GetXrUserticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetXrUserticketResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.userticket.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-核销用户通行证
         * Summary: aiot-核销用户通行证
         */
        public OperateXrUserticketResponse OperateXrUserticket(OperateXrUserticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateXrUserticketEx(request, headers, runtime);
        }

        /**
         * Description: aiot-核销用户通行证
         * Summary: aiot-核销用户通行证
         */
        public async Task<OperateXrUserticketResponse> OperateXrUserticketAsync(OperateXrUserticketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateXrUserticketExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-核销用户通行证
         * Summary: aiot-核销用户通行证
         */
        public OperateXrUserticketResponse OperateXrUserticketEx(OperateXrUserticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateXrUserticketResponse>(DoRequest("1.0", "blockchain.bot.xr.userticket.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-核销用户通行证
         * Summary: aiot-核销用户通行证
         */
        public async Task<OperateXrUserticketResponse> OperateXrUserticketExAsync(OperateXrUserticketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateXrUserticketResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.userticket.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-获取资源列表
         * Summary: aiot-获取资源列表
         */
        public ListXrResourceResponse ListXrResource(ListXrResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListXrResourceEx(request, headers, runtime);
        }

        /**
         * Description: aiot-获取资源列表
         * Summary: aiot-获取资源列表
         */
        public async Task<ListXrResourceResponse> ListXrResourceAsync(ListXrResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListXrResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-获取资源列表
         * Summary: aiot-获取资源列表
         */
        public ListXrResourceResponse ListXrResourceEx(ListXrResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXrResourceResponse>(DoRequest("1.0", "blockchain.bot.xr.resource.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-获取资源列表
         * Summary: aiot-获取资源列表
         */
        public async Task<ListXrResourceResponse> ListXrResourceExAsync(ListXrResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXrResourceResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.resource.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-核销实例分页查询
         * Summary: aiot-核销实例分页查询
         */
        public PagequeryXrXrverificationmodelResponse PagequeryXrXrverificationmodel(PagequeryXrXrverificationmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryXrXrverificationmodelEx(request, headers, runtime);
        }

        /**
         * Description: aiot-核销实例分页查询
         * Summary: aiot-核销实例分页查询
         */
        public async Task<PagequeryXrXrverificationmodelResponse> PagequeryXrXrverificationmodelAsync(PagequeryXrXrverificationmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryXrXrverificationmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-核销实例分页查询
         * Summary: aiot-核销实例分页查询
         */
        public PagequeryXrXrverificationmodelResponse PagequeryXrXrverificationmodelEx(PagequeryXrXrverificationmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryXrXrverificationmodelResponse>(DoRequest("1.0", "blockchain.bot.xr.xrverificationmodel.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-核销实例分页查询
         * Summary: aiot-核销实例分页查询
         */
        public async Task<PagequeryXrXrverificationmodelResponse> PagequeryXrXrverificationmodelExAsync(PagequeryXrXrverificationmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryXrXrverificationmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.xrverificationmodel.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-客户对应设备分页查询
         * Summary: aiot-客户对应设备分页查询
         */
        public PagequeryXrCustomerdeviceResponse PagequeryXrCustomerdevice(PagequeryXrCustomerdeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryXrCustomerdeviceEx(request, headers, runtime);
        }

        /**
         * Description: aiot-客户对应设备分页查询
         * Summary: aiot-客户对应设备分页查询
         */
        public async Task<PagequeryXrCustomerdeviceResponse> PagequeryXrCustomerdeviceAsync(PagequeryXrCustomerdeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryXrCustomerdeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-客户对应设备分页查询
         * Summary: aiot-客户对应设备分页查询
         */
        public PagequeryXrCustomerdeviceResponse PagequeryXrCustomerdeviceEx(PagequeryXrCustomerdeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryXrCustomerdeviceResponse>(DoRequest("1.0", "blockchain.bot.xr.customerdevice.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-客户对应设备分页查询
         * Summary: aiot-客户对应设备分页查询
         */
        public async Task<PagequeryXrCustomerdeviceResponse> PagequeryXrCustomerdeviceExAsync(PagequeryXrCustomerdeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryXrCustomerdeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.customerdevice.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-xr通行证创建
         * Summary: aiot-xr通行证创建
         */
        public CreateXrXrticketpoolResponse CreateXrXrticketpool(CreateXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateXrXrticketpoolEx(request, headers, runtime);
        }

        /**
         * Description: aiot-xr通行证创建
         * Summary: aiot-xr通行证创建
         */
        public async Task<CreateXrXrticketpoolResponse> CreateXrXrticketpoolAsync(CreateXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateXrXrticketpoolExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-xr通行证创建
         * Summary: aiot-xr通行证创建
         */
        public CreateXrXrticketpoolResponse CreateXrXrticketpoolEx(CreateXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateXrXrticketpoolResponse>(DoRequest("1.0", "blockchain.bot.xr.xrticketpool.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-xr通行证创建
         * Summary: aiot-xr通行证创建
         */
        public async Task<CreateXrXrticketpoolResponse> CreateXrXrticketpoolExAsync(CreateXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateXrXrticketpoolResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.xrticketpool.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-xr通行证修改
         * Summary: aiot-xr通行证修改
         */
        public UpdateXrXrticketpoolResponse UpdateXrXrticketpool(UpdateXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateXrXrticketpoolEx(request, headers, runtime);
        }

        /**
         * Description: aiot-xr通行证修改
         * Summary: aiot-xr通行证修改
         */
        public async Task<UpdateXrXrticketpoolResponse> UpdateXrXrticketpoolAsync(UpdateXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateXrXrticketpoolExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-xr通行证修改
         * Summary: aiot-xr通行证修改
         */
        public UpdateXrXrticketpoolResponse UpdateXrXrticketpoolEx(UpdateXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateXrXrticketpoolResponse>(DoRequest("1.0", "blockchain.bot.xr.xrticketpool.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-xr通行证修改
         * Summary: aiot-xr通行证修改
         */
        public async Task<UpdateXrXrticketpoolResponse> UpdateXrXrticketpoolExAsync(UpdateXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateXrXrticketpoolResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.xrticketpool.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-xr通行证分页查询
         * Summary: aiot-xr通行证分页查询
         */
        public PagequeryXrXrticketpoolResponse PagequeryXrXrticketpool(PagequeryXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryXrXrticketpoolEx(request, headers, runtime);
        }

        /**
         * Description: aiot-xr通行证分页查询
         * Summary: aiot-xr通行证分页查询
         */
        public async Task<PagequeryXrXrticketpoolResponse> PagequeryXrXrticketpoolAsync(PagequeryXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryXrXrticketpoolExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-xr通行证分页查询
         * Summary: aiot-xr通行证分页查询
         */
        public PagequeryXrXrticketpoolResponse PagequeryXrXrticketpoolEx(PagequeryXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryXrXrticketpoolResponse>(DoRequest("1.0", "blockchain.bot.xr.xrticketpool.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-xr通行证分页查询
         * Summary: aiot-xr通行证分页查询
         */
        public async Task<PagequeryXrXrticketpoolResponse> PagequeryXrXrticketpoolExAsync(PagequeryXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryXrXrticketpoolResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.xrticketpool.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-同步设备屏幕状态
         * Summary: aiot-同步设备屏幕状态
         */
        public SyncDeviceScreenstatusResponse SyncDeviceScreenstatus(SyncDeviceScreenstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncDeviceScreenstatusEx(request, headers, runtime);
        }

        /**
         * Description: aiot-同步设备屏幕状态
         * Summary: aiot-同步设备屏幕状态
         */
        public async Task<SyncDeviceScreenstatusResponse> SyncDeviceScreenstatusAsync(SyncDeviceScreenstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncDeviceScreenstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-同步设备屏幕状态
         * Summary: aiot-同步设备屏幕状态
         */
        public SyncDeviceScreenstatusResponse SyncDeviceScreenstatusEx(SyncDeviceScreenstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncDeviceScreenstatusResponse>(DoRequest("1.0", "blockchain.bot.device.screenstatus.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-同步设备屏幕状态
         * Summary: aiot-同步设备屏幕状态
         */
        public async Task<SyncDeviceScreenstatusResponse> SyncDeviceScreenstatusExAsync(SyncDeviceScreenstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncDeviceScreenstatusResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.screenstatus.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: xr通行证批量创建
         * Summary: xr通行证批量创建
         */
        public BatchcreateXrXrticketpoolResponse BatchcreateXrXrticketpool(BatchcreateXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateXrXrticketpoolEx(request, headers, runtime);
        }

        /**
         * Description: xr通行证批量创建
         * Summary: xr通行证批量创建
         */
        public async Task<BatchcreateXrXrticketpoolResponse> BatchcreateXrXrticketpoolAsync(BatchcreateXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateXrXrticketpoolExAsync(request, headers, runtime);
        }

        /**
         * Description: xr通行证批量创建
         * Summary: xr通行证批量创建
         */
        public BatchcreateXrXrticketpoolResponse BatchcreateXrXrticketpoolEx(BatchcreateXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateXrXrticketpoolResponse>(DoRequest("1.0", "blockchain.bot.xr.xrticketpool.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: xr通行证批量创建
         * Summary: xr通行证批量创建
         */
        public async Task<BatchcreateXrXrticketpoolResponse> BatchcreateXrXrticketpoolExAsync(BatchcreateXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateXrXrticketpoolResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.xrticketpool.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-获取资源实例列表
         * Summary: aiot-获取资源实例列表
         */
        public ListXrXrverificationmodelinstanceResponse ListXrXrverificationmodelinstance(ListXrXrverificationmodelinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListXrXrverificationmodelinstanceEx(request, headers, runtime);
        }

        /**
         * Description: aiot-获取资源实例列表
         * Summary: aiot-获取资源实例列表
         */
        public async Task<ListXrXrverificationmodelinstanceResponse> ListXrXrverificationmodelinstanceAsync(ListXrXrverificationmodelinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListXrXrverificationmodelinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-获取资源实例列表
         * Summary: aiot-获取资源实例列表
         */
        public ListXrXrverificationmodelinstanceResponse ListXrXrverificationmodelinstanceEx(ListXrXrverificationmodelinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXrXrverificationmodelinstanceResponse>(DoRequest("1.0", "blockchain.bot.xr.xrverificationmodelinstance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-获取资源实例列表
         * Summary: aiot-获取资源实例列表
         */
        public async Task<ListXrXrverificationmodelinstanceResponse> ListXrXrverificationmodelinstanceExAsync(ListXrXrverificationmodelinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListXrXrverificationmodelinstanceResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.xrverificationmodelinstance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-xr通行证详情查询
         * Summary: aiot-xr通行证详情查询
         */
        public DetailXrXrticketpoolResponse DetailXrXrticketpool(DetailXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailXrXrticketpoolEx(request, headers, runtime);
        }

        /**
         * Description: aiot-xr通行证详情查询
         * Summary: aiot-xr通行证详情查询
         */
        public async Task<DetailXrXrticketpoolResponse> DetailXrXrticketpoolAsync(DetailXrXrticketpoolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailXrXrticketpoolExAsync(request, headers, runtime);
        }

        /**
         * Description: aiot-xr通行证详情查询
         * Summary: aiot-xr通行证详情查询
         */
        public DetailXrXrticketpoolResponse DetailXrXrticketpoolEx(DetailXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailXrXrticketpoolResponse>(DoRequest("1.0", "blockchain.bot.xr.xrticketpool.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiot-xr通行证详情查询
         * Summary: aiot-xr通行证详情查询
         */
        public async Task<DetailXrXrticketpoolResponse> DetailXrXrticketpoolExAsync(DetailXrXrticketpoolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailXrXrticketpoolResponse>(await DoRequestAsync("1.0", "blockchain.bot.xr.xrticketpool.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiotnextbs-openApi操作
         * Summary: aiotnextbs-openApi操作
         */
        public OperateAiotnextbsOpenapiResponse OperateAiotnextbsOpenapi(OperateAiotnextbsOpenapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateAiotnextbsOpenapiEx(request, headers, runtime);
        }

        /**
         * Description: aiotnextbs-openApi操作
         * Summary: aiotnextbs-openApi操作
         */
        public async Task<OperateAiotnextbsOpenapiResponse> OperateAiotnextbsOpenapiAsync(OperateAiotnextbsOpenapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateAiotnextbsOpenapiExAsync(request, headers, runtime);
        }

        /**
         * Description: aiotnextbs-openApi操作
         * Summary: aiotnextbs-openApi操作
         */
        public OperateAiotnextbsOpenapiResponse OperateAiotnextbsOpenapiEx(OperateAiotnextbsOpenapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateAiotnextbsOpenapiResponse>(DoRequest("1.0", "blockchain.bot.aiotnextbs.openapi.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: aiotnextbs-openApi操作
         * Summary: aiotnextbs-openApi操作
         */
        public async Task<OperateAiotnextbsOpenapiResponse> OperateAiotnextbsOpenapiExAsync(OperateAiotnextbsOpenapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateAiotnextbsOpenapiResponse>(await DoRequestAsync("1.0", "blockchain.bot.aiotnextbs.openapi.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
                request.FileObject = null;
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
                request.FileObject = null;
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
         * Description: IoT设备平台-设备消息同步
         * Summary: IoT设备平台-设备消息同步
         */
        public NotifyThirddeviceMessageResponse NotifyThirddeviceMessage(NotifyThirddeviceMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyThirddeviceMessageEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备消息同步
         * Summary: IoT设备平台-设备消息同步
         */
        public async Task<NotifyThirddeviceMessageResponse> NotifyThirddeviceMessageAsync(NotifyThirddeviceMessageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyThirddeviceMessageExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备消息同步
         * Summary: IoT设备平台-设备消息同步
         */
        public NotifyThirddeviceMessageResponse NotifyThirddeviceMessageEx(NotifyThirddeviceMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyThirddeviceMessageResponse>(DoRequest("1.0", "blockchain.bot.thirddevice.message.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备消息同步
         * Summary: IoT设备平台-设备消息同步
         */
        public async Task<NotifyThirddeviceMessageResponse> NotifyThirddeviceMessageExAsync(NotifyThirddeviceMessageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyThirddeviceMessageResponse>(await DoRequestAsync("1.0", "blockchain.bot.thirddevice.message.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Iotbasic-厂商入驻
         * Summary: Iotbasic-厂商入驻
         */
        public RegisterIotbasicCorpjoinResponse RegisterIotbasicCorpjoin(RegisterIotbasicCorpjoinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterIotbasicCorpjoinEx(request, headers, runtime);
        }

        /**
         * Description: Iotbasic-厂商入驻
         * Summary: Iotbasic-厂商入驻
         */
        public async Task<RegisterIotbasicCorpjoinResponse> RegisterIotbasicCorpjoinAsync(RegisterIotbasicCorpjoinRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterIotbasicCorpjoinExAsync(request, headers, runtime);
        }

        /**
         * Description: Iotbasic-厂商入驻
         * Summary: Iotbasic-厂商入驻
         */
        public RegisterIotbasicCorpjoinResponse RegisterIotbasicCorpjoinEx(RegisterIotbasicCorpjoinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterIotbasicCorpjoinResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.corpjoin.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Iotbasic-厂商入驻
         * Summary: Iotbasic-厂商入驻
         */
        public async Task<RegisterIotbasicCorpjoinResponse> RegisterIotbasicCorpjoinExAsync(RegisterIotbasicCorpjoinRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterIotbasicCorpjoinResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.corpjoin.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-查询设备链上资产详情
         * Summary: IoT设备平台-查询设备链上资产详情
         */
        public QueryTxtransactionDeviceResponse QueryTxtransactionDevice(QueryTxtransactionDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTxtransactionDeviceEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-查询设备链上资产详情
         * Summary: IoT设备平台-查询设备链上资产详情
         */
        public async Task<QueryTxtransactionDeviceResponse> QueryTxtransactionDeviceAsync(QueryTxtransactionDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTxtransactionDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-查询设备链上资产详情
         * Summary: IoT设备平台-查询设备链上资产详情
         */
        public QueryTxtransactionDeviceResponse QueryTxtransactionDeviceEx(QueryTxtransactionDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTxtransactionDeviceResponse>(DoRequest("1.0", "blockchain.bot.txtransaction.device.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-查询设备链上资产详情
         * Summary: IoT设备平台-查询设备链上资产详情
         */
        public async Task<QueryTxtransactionDeviceResponse> QueryTxtransactionDeviceExAsync(QueryTxtransactionDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTxtransactionDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.txtransaction.device.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-查询业务数据链上资产详情
         * Summary: IoT设备平台-查询业务数据链上资产详情
         */
        public QueryTxtransactionChaindataResponse QueryTxtransactionChaindata(QueryTxtransactionChaindataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTxtransactionChaindataEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-查询业务数据链上资产详情
         * Summary: IoT设备平台-查询业务数据链上资产详情
         */
        public async Task<QueryTxtransactionChaindataResponse> QueryTxtransactionChaindataAsync(QueryTxtransactionChaindataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTxtransactionChaindataExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-查询业务数据链上资产详情
         * Summary: IoT设备平台-查询业务数据链上资产详情
         */
        public QueryTxtransactionChaindataResponse QueryTxtransactionChaindataEx(QueryTxtransactionChaindataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTxtransactionChaindataResponse>(DoRequest("1.0", "blockchain.bot.txtransaction.chaindata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-查询业务数据链上资产详情
         * Summary: IoT设备平台-查询业务数据链上资产详情
         */
        public async Task<QueryTxtransactionChaindataResponse> QueryTxtransactionChaindataExAsync(QueryTxtransactionChaindataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTxtransactionChaindataResponse>(await DoRequestAsync("1.0", "blockchain.bot.txtransaction.chaindata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-生成云上认证设备认证密钥
         * Summary: IoT设备平台-生成云上认证设备认证密钥
         */
        public InitIotbasicDevicekeyResponse InitIotbasicDevicekey(InitIotbasicDevicekeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitIotbasicDevicekeyEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-生成云上认证设备认证密钥
         * Summary: IoT设备平台-生成云上认证设备认证密钥
         */
        public async Task<InitIotbasicDevicekeyResponse> InitIotbasicDevicekeyAsync(InitIotbasicDevicekeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitIotbasicDevicekeyExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-生成云上认证设备认证密钥
         * Summary: IoT设备平台-生成云上认证设备认证密钥
         */
        public InitIotbasicDevicekeyResponse InitIotbasicDevicekeyEx(InitIotbasicDevicekeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIotbasicDevicekeyResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.devicekey.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-生成云上认证设备认证密钥
         * Summary: IoT设备平台-生成云上认证设备认证密钥
         */
        public async Task<InitIotbasicDevicekeyResponse> InitIotbasicDevicekeyExAsync(InitIotbasicDevicekeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitIotbasicDevicekeyResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.devicekey.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设置设备属性
         * Summary: IoT设备平台-设置设备属性
         */
        public SetDevicePropertyResponse SetDeviceProperty(SetDevicePropertyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetDevicePropertyEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设置设备属性
         * Summary: IoT设备平台-设置设备属性
         */
        public async Task<SetDevicePropertyResponse> SetDevicePropertyAsync(SetDevicePropertyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetDevicePropertyExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设置设备属性
         * Summary: IoT设备平台-设置设备属性
         */
        public SetDevicePropertyResponse SetDevicePropertyEx(SetDevicePropertyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDevicePropertyResponse>(DoRequest("1.0", "blockchain.bot.device.property.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设置设备属性
         * Summary: IoT设备平台-设置设备属性
         */
        public async Task<SetDevicePropertyResponse> SetDevicePropertyExAsync(SetDevicePropertyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDevicePropertyResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.property.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-批量设置设备属性
         * Summary: IoT设备平台-批量设置设备属性
         */
        public SetDevicelistPropertyResponse SetDevicelistProperty(SetDevicelistPropertyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetDevicelistPropertyEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-批量设置设备属性
         * Summary: IoT设备平台-批量设置设备属性
         */
        public async Task<SetDevicelistPropertyResponse> SetDevicelistPropertyAsync(SetDevicelistPropertyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetDevicelistPropertyExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-批量设置设备属性
         * Summary: IoT设备平台-批量设置设备属性
         */
        public SetDevicelistPropertyResponse SetDevicelistPropertyEx(SetDevicelistPropertyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDevicelistPropertyResponse>(DoRequest("1.0", "blockchain.bot.devicelist.property.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-批量设置设备属性
         * Summary: IoT设备平台-批量设置设备属性
         */
        public async Task<SetDevicelistPropertyResponse> SetDevicelistPropertyExAsync(SetDevicelistPropertyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetDevicelistPropertyResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicelist.property.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询品类列表
         * Summary: iotbasic-查询品类列表
         */
        public QueryIotbasicCategorylistResponse QueryIotbasicCategorylist(QueryIotbasicCategorylistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotbasicCategorylistEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询品类列表
         * Summary: iotbasic-查询品类列表
         */
        public async Task<QueryIotbasicCategorylistResponse> QueryIotbasicCategorylistAsync(QueryIotbasicCategorylistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotbasicCategorylistExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询品类列表
         * Summary: iotbasic-查询品类列表
         */
        public QueryIotbasicCategorylistResponse QueryIotbasicCategorylistEx(QueryIotbasicCategorylistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicCategorylistResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.categorylist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询品类列表
         * Summary: iotbasic-查询品类列表
         */
        public async Task<QueryIotbasicCategorylistResponse> QueryIotbasicCategorylistExAsync(QueryIotbasicCategorylistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicCategorylistResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.categorylist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询项目空间列表
         * Summary: iotbasic-查询项目空间列表
         */
        public QueryIotbasicProjectspacelistResponse QueryIotbasicProjectspacelist(QueryIotbasicProjectspacelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIotbasicProjectspacelistEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询项目空间列表
         * Summary: iotbasic-查询项目空间列表
         */
        public async Task<QueryIotbasicProjectspacelistResponse> QueryIotbasicProjectspacelistAsync(QueryIotbasicProjectspacelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIotbasicProjectspacelistExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询项目空间列表
         * Summary: iotbasic-查询项目空间列表
         */
        public QueryIotbasicProjectspacelistResponse QueryIotbasicProjectspacelistEx(QueryIotbasicProjectspacelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicProjectspacelistResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.projectspacelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询项目空间列表
         * Summary: iotbasic-查询项目空间列表
         */
        public async Task<QueryIotbasicProjectspacelistResponse> QueryIotbasicProjectspacelistExAsync(QueryIotbasicProjectspacelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIotbasicProjectspacelistResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.projectspacelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商入驻
         * Summary: iotbasic-设备厂商入驻
         */
        public RegisterDevicecorpCustomerResponse RegisterDevicecorpCustomer(RegisterDevicecorpCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterDevicecorpCustomerEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商入驻
         * Summary: iotbasic-设备厂商入驻
         */
        public async Task<RegisterDevicecorpCustomerResponse> RegisterDevicecorpCustomerAsync(RegisterDevicecorpCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterDevicecorpCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商入驻
         * Summary: iotbasic-设备厂商入驻
         */
        public RegisterDevicecorpCustomerResponse RegisterDevicecorpCustomerEx(RegisterDevicecorpCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterDevicecorpCustomerResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.customer.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商入驻
         * Summary: iotbasic-设备厂商入驻
         */
        public async Task<RegisterDevicecorpCustomerResponse> RegisterDevicecorpCustomerExAsync(RegisterDevicecorpCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterDevicecorpCustomerResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.customer.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商产品查询
         * Summary: iotbasic-设备厂商产品查询
         */
        public GetDevicecorpProductinfoResponse GetDevicecorpProductinfo(GetDevicecorpProductinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDevicecorpProductinfoEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商产品查询
         * Summary: iotbasic-设备厂商产品查询
         */
        public async Task<GetDevicecorpProductinfoResponse> GetDevicecorpProductinfoAsync(GetDevicecorpProductinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDevicecorpProductinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商产品查询
         * Summary: iotbasic-设备厂商产品查询
         */
        public GetDevicecorpProductinfoResponse GetDevicecorpProductinfoEx(GetDevicecorpProductinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDevicecorpProductinfoResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.productinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商产品查询
         * Summary: iotbasic-设备厂商产品查询
         */
        public async Task<GetDevicecorpProductinfoResponse> GetDevicecorpProductinfoExAsync(GetDevicecorpProductinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDevicecorpProductinfoResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.productinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-添加设备厂商设备属性
         * Summary: iotbasic-添加设备厂商设备属性
         */
        public AddDevicecorpDeviceattributesResponse AddDevicecorpDeviceattributes(AddDevicecorpDeviceattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDevicecorpDeviceattributesEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-添加设备厂商设备属性
         * Summary: iotbasic-添加设备厂商设备属性
         */
        public async Task<AddDevicecorpDeviceattributesResponse> AddDevicecorpDeviceattributesAsync(AddDevicecorpDeviceattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDevicecorpDeviceattributesExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-添加设备厂商设备属性
         * Summary: iotbasic-添加设备厂商设备属性
         */
        public AddDevicecorpDeviceattributesResponse AddDevicecorpDeviceattributesEx(AddDevicecorpDeviceattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDevicecorpDeviceattributesResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.deviceattributes.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-添加设备厂商设备属性
         * Summary: iotbasic-添加设备厂商设备属性
         */
        public async Task<AddDevicecorpDeviceattributesResponse> AddDevicecorpDeviceattributesExAsync(AddDevicecorpDeviceattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDevicecorpDeviceattributesResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.deviceattributes.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-指定设备上调用指定服务
         * Summary: iotbasic-指定设备上调用指定服务
         */
        public ExecDeviceThingserviceResponse ExecDeviceThingservice(ExecDeviceThingserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecDeviceThingserviceEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-指定设备上调用指定服务
         * Summary: iotbasic-指定设备上调用指定服务
         */
        public async Task<ExecDeviceThingserviceResponse> ExecDeviceThingserviceAsync(ExecDeviceThingserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecDeviceThingserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-指定设备上调用指定服务
         * Summary: iotbasic-指定设备上调用指定服务
         */
        public ExecDeviceThingserviceResponse ExecDeviceThingserviceEx(ExecDeviceThingserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecDeviceThingserviceResponse>(DoRequest("1.0", "blockchain.bot.device.thingservice.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-指定设备上调用指定服务
         * Summary: iotbasic-指定设备上调用指定服务
         */
        public async Task<ExecDeviceThingserviceResponse> ExecDeviceThingserviceExAsync(ExecDeviceThingserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecDeviceThingserviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.thingservice.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查看产品物模型功能定义
         * Summary: iotbasic-查看产品物模型功能定义
         */
        public QueryDeviceThingmodelResponse QueryDeviceThingmodel(QueryDeviceThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查看产品物模型功能定义
         * Summary: iotbasic-查看产品物模型功能定义
         */
        public async Task<QueryDeviceThingmodelResponse> QueryDeviceThingmodelAsync(QueryDeviceThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查看产品物模型功能定义
         * Summary: iotbasic-查看产品物模型功能定义
         */
        public QueryDeviceThingmodelResponse QueryDeviceThingmodelEx(QueryDeviceThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceThingmodelResponse>(DoRequest("1.0", "blockchain.bot.device.thingmodel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查看产品物模型功能定义
         * Summary: iotbasic-查看产品物模型功能定义
         */
        public async Task<QueryDeviceThingmodelResponse> QueryDeviceThingmodelExAsync(QueryDeviceThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.thingmodel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询设备物模型数据
         * Summary: iotbasic-查询设备物模型数据
         */
        public QueryDeviceModeldataResponse QueryDeviceModeldata(QueryDeviceModeldataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeviceModeldataEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询设备物模型数据
         * Summary: iotbasic-查询设备物模型数据
         */
        public async Task<QueryDeviceModeldataResponse> QueryDeviceModeldataAsync(QueryDeviceModeldataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeviceModeldataExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询设备物模型数据
         * Summary: iotbasic-查询设备物模型数据
         */
        public QueryDeviceModeldataResponse QueryDeviceModeldataEx(QueryDeviceModeldataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceModeldataResponse>(DoRequest("1.0", "blockchain.bot.device.modeldata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询设备物模型数据
         * Summary: iotbasic-查询设备物模型数据
         */
        public async Task<QueryDeviceModeldataResponse> QueryDeviceModeldataExAsync(QueryDeviceModeldataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeviceModeldataResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.modeldata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商注册设备
         * Summary: iotbasic-设备厂商注册设备
         */
        public CreateDevicecorpDeviceResponse CreateDevicecorpDevice(CreateDevicecorpDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDevicecorpDeviceEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商注册设备
         * Summary: iotbasic-设备厂商注册设备
         */
        public async Task<CreateDevicecorpDeviceResponse> CreateDevicecorpDeviceAsync(CreateDevicecorpDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDevicecorpDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商注册设备
         * Summary: iotbasic-设备厂商注册设备
         */
        public CreateDevicecorpDeviceResponse CreateDevicecorpDeviceEx(CreateDevicecorpDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDevicecorpDeviceResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.device.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商注册设备
         * Summary: iotbasic-设备厂商注册设备
         */
        public async Task<CreateDevicecorpDeviceResponse> CreateDevicecorpDeviceExAsync(CreateDevicecorpDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDevicecorpDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.device.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商批量注册设备
         * Summary: iotbasic-设备厂商批量注册设备
         */
        public BatchcreateDevicecorpDeviceResponse BatchcreateDevicecorpDevice(BatchcreateDevicecorpDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateDevicecorpDeviceEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商批量注册设备
         * Summary: iotbasic-设备厂商批量注册设备
         */
        public async Task<BatchcreateDevicecorpDeviceResponse> BatchcreateDevicecorpDeviceAsync(BatchcreateDevicecorpDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateDevicecorpDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商批量注册设备
         * Summary: iotbasic-设备厂商批量注册设备
         */
        public BatchcreateDevicecorpDeviceResponse BatchcreateDevicecorpDeviceEx(BatchcreateDevicecorpDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateDevicecorpDeviceResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.device.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商批量注册设备
         * Summary: iotbasic-设备厂商批量注册设备
         */
        public async Task<BatchcreateDevicecorpDeviceResponse> BatchcreateDevicecorpDeviceExAsync(BatchcreateDevicecorpDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateDevicecorpDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.device.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询设备厂商企业注册结果
         * Summary: 查询设备厂商企业注册结果
         */
        public QueryDevicecorpCustomerregisterresultResponse QueryDevicecorpCustomerregisterresult(QueryDevicecorpCustomerregisterresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDevicecorpCustomerregisterresultEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询设备厂商企业注册结果
         * Summary: 查询设备厂商企业注册结果
         */
        public async Task<QueryDevicecorpCustomerregisterresultResponse> QueryDevicecorpCustomerregisterresultAsync(QueryDevicecorpCustomerregisterresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDevicecorpCustomerregisterresultExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询设备厂商企业注册结果
         * Summary: 查询设备厂商企业注册结果
         */
        public QueryDevicecorpCustomerregisterresultResponse QueryDevicecorpCustomerregisterresultEx(QueryDevicecorpCustomerregisterresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDevicecorpCustomerregisterresultResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.customerregisterresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询设备厂商企业注册结果
         * Summary: 查询设备厂商企业注册结果
         */
        public async Task<QueryDevicecorpCustomerregisterresultResponse> QueryDevicecorpCustomerregisterresultExAsync(QueryDevicecorpCustomerregisterresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDevicecorpCustomerregisterresultResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.customerregisterresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-管控设备厂商设备
         * Summary: iotbasic-管控设备厂商设备
         */
        public OperateDevicecorpDevicecontrolResponse OperateDevicecorpDevicecontrol(OperateDevicecorpDevicecontrolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateDevicecorpDevicecontrolEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-管控设备厂商设备
         * Summary: iotbasic-管控设备厂商设备
         */
        public async Task<OperateDevicecorpDevicecontrolResponse> OperateDevicecorpDevicecontrolAsync(OperateDevicecorpDevicecontrolRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateDevicecorpDevicecontrolExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-管控设备厂商设备
         * Summary: iotbasic-管控设备厂商设备
         */
        public OperateDevicecorpDevicecontrolResponse OperateDevicecorpDevicecontrolEx(OperateDevicecorpDevicecontrolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDevicecorpDevicecontrolResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.devicecontrol.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-管控设备厂商设备
         * Summary: iotbasic-管控设备厂商设备
         */
        public async Task<OperateDevicecorpDevicecontrolResponse> OperateDevicecorpDevicecontrolExAsync(OperateDevicecorpDevicecontrolRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDevicecorpDevicecontrolResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.devicecontrol.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商创建物模型
         * Summary: iotbasic-设备厂商创建物模型
         */
        public CreateDevicecorpThingmodelResponse CreateDevicecorpThingmodel(CreateDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDevicecorpThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商创建物模型
         * Summary: iotbasic-设备厂商创建物模型
         */
        public async Task<CreateDevicecorpThingmodelResponse> CreateDevicecorpThingmodelAsync(CreateDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDevicecorpThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商创建物模型
         * Summary: iotbasic-设备厂商创建物模型
         */
        public CreateDevicecorpThingmodelResponse CreateDevicecorpThingmodelEx(CreateDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDevicecorpThingmodelResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.thingmodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商创建物模型
         * Summary: iotbasic-设备厂商创建物模型
         */
        public async Task<CreateDevicecorpThingmodelResponse> CreateDevicecorpThingmodelExAsync(CreateDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDevicecorpThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.thingmodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商修改物模型
         * Summary: iotbasic-设备厂商修改物模型
         */
        public UpdateDevicecorpThingmodelResponse UpdateDevicecorpThingmodel(UpdateDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDevicecorpThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商修改物模型
         * Summary: iotbasic-设备厂商修改物模型
         */
        public async Task<UpdateDevicecorpThingmodelResponse> UpdateDevicecorpThingmodelAsync(UpdateDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDevicecorpThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商修改物模型
         * Summary: iotbasic-设备厂商修改物模型
         */
        public UpdateDevicecorpThingmodelResponse UpdateDevicecorpThingmodelEx(UpdateDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDevicecorpThingmodelResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.thingmodel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商修改物模型
         * Summary: iotbasic-设备厂商修改物模型
         */
        public async Task<UpdateDevicecorpThingmodelResponse> UpdateDevicecorpThingmodelExAsync(UpdateDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDevicecorpThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.thingmodel.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商删除物模型
         * Summary: iotbasic-设备厂商删除物模型
         */
        public DeleteDevicecorpThingmodelResponse DeleteDevicecorpThingmodel(DeleteDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDevicecorpThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商删除物模型
         * Summary: iotbasic-设备厂商删除物模型
         */
        public async Task<DeleteDevicecorpThingmodelResponse> DeleteDevicecorpThingmodelAsync(DeleteDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDevicecorpThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商删除物模型
         * Summary: iotbasic-设备厂商删除物模型
         */
        public DeleteDevicecorpThingmodelResponse DeleteDevicecorpThingmodelEx(DeleteDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDevicecorpThingmodelResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.thingmodel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商删除物模型
         * Summary: iotbasic-设备厂商删除物模型
         */
        public async Task<DeleteDevicecorpThingmodelResponse> DeleteDevicecorpThingmodelExAsync(DeleteDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDevicecorpThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.thingmodel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商发布物模型
         * Summary: iotbasic-设备厂商发布物模型
         */
        public PublishDevicecorpThingmodelResponse PublishDevicecorpThingmodel(PublishDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishDevicecorpThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商发布物模型
         * Summary: iotbasic-设备厂商发布物模型
         */
        public async Task<PublishDevicecorpThingmodelResponse> PublishDevicecorpThingmodelAsync(PublishDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishDevicecorpThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商发布物模型
         * Summary: iotbasic-设备厂商发布物模型
         */
        public PublishDevicecorpThingmodelResponse PublishDevicecorpThingmodelEx(PublishDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDevicecorpThingmodelResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.thingmodel.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商发布物模型
         * Summary: iotbasic-设备厂商发布物模型
         */
        public async Task<PublishDevicecorpThingmodelResponse> PublishDevicecorpThingmodelExAsync(PublishDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishDevicecorpThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.thingmodel.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约链接获取
         * Summary: 代扣签约链接获取
         */
        public CreateDigitalkeyWithholdsignResponse CreateDigitalkeyWithholdsign(CreateDigitalkeyWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDigitalkeyWithholdsignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约链接获取
         * Summary: 代扣签约链接获取
         */
        public async Task<CreateDigitalkeyWithholdsignResponse> CreateDigitalkeyWithholdsignAsync(CreateDigitalkeyWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDigitalkeyWithholdsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约链接获取
         * Summary: 代扣签约链接获取
         */
        public CreateDigitalkeyWithholdsignResponse CreateDigitalkeyWithholdsignEx(CreateDigitalkeyWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDigitalkeyWithholdsignResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withholdsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约链接获取
         * Summary: 代扣签约链接获取
         */
        public async Task<CreateDigitalkeyWithholdsignResponse> CreateDigitalkeyWithholdsignExAsync(CreateDigitalkeyWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDigitalkeyWithholdsignResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withholdsign.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约解除
         * Summary: 代扣签约解除
         */
        public UnbindDigitalkeyWithholdsignResponse UnbindDigitalkeyWithholdsign(UnbindDigitalkeyWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindDigitalkeyWithholdsignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约解除
         * Summary: 代扣签约解除
         */
        public async Task<UnbindDigitalkeyWithholdsignResponse> UnbindDigitalkeyWithholdsignAsync(UnbindDigitalkeyWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindDigitalkeyWithholdsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约解除
         * Summary: 代扣签约解除
         */
        public UnbindDigitalkeyWithholdsignResponse UnbindDigitalkeyWithholdsignEx(UnbindDigitalkeyWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindDigitalkeyWithholdsignResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withholdsign.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约解除
         * Summary: 代扣签约解除
         */
        public async Task<UnbindDigitalkeyWithholdsignResponse> UnbindDigitalkeyWithholdsignExAsync(UnbindDigitalkeyWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindDigitalkeyWithholdsignResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withholdsign.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 网约车代扣支付
         * Summary: 网约车代扣支付
         */
        public PayDigitalkeyWithholdResponse PayDigitalkeyWithhold(PayDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayDigitalkeyWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 网约车代扣支付
         * Summary: 网约车代扣支付
         */
        public async Task<PayDigitalkeyWithholdResponse> PayDigitalkeyWithholdAsync(PayDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayDigitalkeyWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 网约车代扣支付
         * Summary: 网约车代扣支付
         */
        public PayDigitalkeyWithholdResponse PayDigitalkeyWithholdEx(PayDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayDigitalkeyWithholdResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withhold.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 网约车代扣支付
         * Summary: 网约车代扣支付
         */
        public async Task<PayDigitalkeyWithholdResponse> PayDigitalkeyWithholdExAsync(PayDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayDigitalkeyWithholdResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withhold.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付交易退款 
         * Summary: 代扣支付交易退款 
         */
        public RefuseDigitalkeyWithholdpayResponse RefuseDigitalkeyWithholdpay(RefuseDigitalkeyWithholdpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseDigitalkeyWithholdpayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣支付交易退款 
         * Summary: 代扣支付交易退款 
         */
        public async Task<RefuseDigitalkeyWithholdpayResponse> RefuseDigitalkeyWithholdpayAsync(RefuseDigitalkeyWithholdpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseDigitalkeyWithholdpayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣支付交易退款 
         * Summary: 代扣支付交易退款 
         */
        public RefuseDigitalkeyWithholdpayResponse RefuseDigitalkeyWithholdpayEx(RefuseDigitalkeyWithholdpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseDigitalkeyWithholdpayResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withholdpay.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付交易退款 
         * Summary: 代扣支付交易退款 
         */
        public async Task<RefuseDigitalkeyWithholdpayResponse> RefuseDigitalkeyWithholdpayExAsync(RefuseDigitalkeyWithholdpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseDigitalkeyWithholdpayResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withholdpay.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣协议查询
         * Summary: 代扣协议查询
         */
        public QueryDigitalkeyWithholdsignResponse QueryDigitalkeyWithholdsign(QueryDigitalkeyWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDigitalkeyWithholdsignEx(request, headers, runtime);
        }

        /**
         * Description: 代扣协议查询
         * Summary: 代扣协议查询
         */
        public async Task<QueryDigitalkeyWithholdsignResponse> QueryDigitalkeyWithholdsignAsync(QueryDigitalkeyWithholdsignRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDigitalkeyWithholdsignExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣协议查询
         * Summary: 代扣协议查询
         */
        public QueryDigitalkeyWithholdsignResponse QueryDigitalkeyWithholdsignEx(QueryDigitalkeyWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDigitalkeyWithholdsignResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withholdsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣协议查询
         * Summary: 代扣协议查询
         */
        public async Task<QueryDigitalkeyWithholdsignResponse> QueryDigitalkeyWithholdsignExAsync(QueryDigitalkeyWithholdsignRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDigitalkeyWithholdsignResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withholdsign.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付撤销
         * Summary: 代扣支付撤销
         */
        public CancelDigitalkeyWithholdpayResponse CancelDigitalkeyWithholdpay(CancelDigitalkeyWithholdpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelDigitalkeyWithholdpayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣支付撤销
         * Summary: 代扣支付撤销
         */
        public async Task<CancelDigitalkeyWithholdpayResponse> CancelDigitalkeyWithholdpayAsync(CancelDigitalkeyWithholdpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelDigitalkeyWithholdpayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣支付撤销
         * Summary: 代扣支付撤销
         */
        public CancelDigitalkeyWithholdpayResponse CancelDigitalkeyWithholdpayEx(CancelDigitalkeyWithholdpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDigitalkeyWithholdpayResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withholdpay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付撤销
         * Summary: 代扣支付撤销
         */
        public async Task<CancelDigitalkeyWithholdpayResponse> CancelDigitalkeyWithholdpayExAsync(CancelDigitalkeyWithholdpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDigitalkeyWithholdpayResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withholdpay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣扣款前预通知
         * Summary: 代扣扣款前预通知
         */
        public NotifyDigitalkeyWithholdpreResponse NotifyDigitalkeyWithholdpre(NotifyDigitalkeyWithholdpreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyDigitalkeyWithholdpreEx(request, headers, runtime);
        }

        /**
         * Description: 代扣扣款前预通知
         * Summary: 代扣扣款前预通知
         */
        public async Task<NotifyDigitalkeyWithholdpreResponse> NotifyDigitalkeyWithholdpreAsync(NotifyDigitalkeyWithholdpreRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyDigitalkeyWithholdpreExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣扣款前预通知
         * Summary: 代扣扣款前预通知
         */
        public NotifyDigitalkeyWithholdpreResponse NotifyDigitalkeyWithholdpreEx(NotifyDigitalkeyWithholdpreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyDigitalkeyWithholdpreResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withholdpre.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣扣款前预通知
         * Summary: 代扣扣款前预通知
         */
        public async Task<NotifyDigitalkeyWithholdpreResponse> NotifyDigitalkeyWithholdpreExAsync(NotifyDigitalkeyWithholdpreRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyDigitalkeyWithholdpreResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withholdpre.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询品类行业，场景列表
         * Summary: iotbasic-查询品类行业，场景列表
         */
        public QueryCategoryIndustryscenelistResponse QueryCategoryIndustryscenelist(QueryCategoryIndustryscenelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCategoryIndustryscenelistEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询品类行业，场景列表
         * Summary: iotbasic-查询品类行业，场景列表
         */
        public async Task<QueryCategoryIndustryscenelistResponse> QueryCategoryIndustryscenelistAsync(QueryCategoryIndustryscenelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCategoryIndustryscenelistExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询品类行业，场景列表
         * Summary: iotbasic-查询品类行业，场景列表
         */
        public QueryCategoryIndustryscenelistResponse QueryCategoryIndustryscenelistEx(QueryCategoryIndustryscenelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCategoryIndustryscenelistResponse>(DoRequest("1.0", "blockchain.bot.category.industryscenelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询品类行业，场景列表
         * Summary: iotbasic-查询品类行业，场景列表
         */
        public async Task<QueryCategoryIndustryscenelistResponse> QueryCategoryIndustryscenelistExAsync(QueryCategoryIndustryscenelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCategoryIndustryscenelistResponse>(await DoRequestAsync("1.0", "blockchain.bot.category.industryscenelist.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-创建自定义品类
         * Summary: iotbasic-创建自定义品类
         */
        public CreateCategoryCustomResponse CreateCategoryCustom(CreateCategoryCustomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCategoryCustomEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-创建自定义品类
         * Summary: iotbasic-创建自定义品类
         */
        public async Task<CreateCategoryCustomResponse> CreateCategoryCustomAsync(CreateCategoryCustomRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCategoryCustomExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-创建自定义品类
         * Summary: iotbasic-创建自定义品类
         */
        public CreateCategoryCustomResponse CreateCategoryCustomEx(CreateCategoryCustomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCategoryCustomResponse>(DoRequest("1.0", "blockchain.bot.category.custom.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-创建自定义品类
         * Summary: iotbasic-创建自定义品类
         */
        public async Task<CreateCategoryCustomResponse> CreateCategoryCustomExAsync(CreateCategoryCustomRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCategoryCustomResponse>(await DoRequestAsync("1.0", "blockchain.bot.category.custom.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备模型创建
         * Summary: iotbasic-设备模型创建
         */
        public CreateDeviceModelResponse CreateDeviceModel(CreateDeviceModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDeviceModelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备模型创建
         * Summary: iotbasic-设备模型创建
         */
        public async Task<CreateDeviceModelResponse> CreateDeviceModelAsync(CreateDeviceModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDeviceModelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备模型创建
         * Summary: iotbasic-设备模型创建
         */
        public CreateDeviceModelResponse CreateDeviceModelEx(CreateDeviceModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeviceModelResponse>(DoRequest("1.0", "blockchain.bot.device.model.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备模型创建
         * Summary: iotbasic-设备模型创建
         */
        public async Task<CreateDeviceModelResponse> CreateDeviceModelExAsync(CreateDeviceModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeviceModelResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.model.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-创建iot产品
         * Summary: iotbasic-创建iot产品
         */
        public CreateIotbasicProductResponse CreateIotbasicProduct(CreateIotbasicProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIotbasicProductEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-创建iot产品
         * Summary: iotbasic-创建iot产品
         */
        public async Task<CreateIotbasicProductResponse> CreateIotbasicProductAsync(CreateIotbasicProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIotbasicProductExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-创建iot产品
         * Summary: iotbasic-创建iot产品
         */
        public CreateIotbasicProductResponse CreateIotbasicProductEx(CreateIotbasicProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIotbasicProductResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.product.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-创建iot产品
         * Summary: iotbasic-创建iot产品
         */
        public async Task<CreateIotbasicProductResponse> CreateIotbasicProductExAsync(CreateIotbasicProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIotbasicProductResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.product.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付订单查询
         * Summary: 代扣支付订单查询
         */
        public QueryDigitalkeyWithholdpayResponse QueryDigitalkeyWithholdpay(QueryDigitalkeyWithholdpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDigitalkeyWithholdpayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣支付订单查询
         * Summary: 代扣支付订单查询
         */
        public async Task<QueryDigitalkeyWithholdpayResponse> QueryDigitalkeyWithholdpayAsync(QueryDigitalkeyWithholdpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDigitalkeyWithholdpayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣支付订单查询
         * Summary: 代扣支付订单查询
         */
        public QueryDigitalkeyWithholdpayResponse QueryDigitalkeyWithholdpayEx(QueryDigitalkeyWithholdpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDigitalkeyWithholdpayResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withholdpay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付订单查询
         * Summary: 代扣支付订单查询
         */
        public async Task<QueryDigitalkeyWithholdpayResponse> QueryDigitalkeyWithholdpayExAsync(QueryDigitalkeyWithholdpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDigitalkeyWithholdpayResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withholdpay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付查询
         * Summary: 代扣支付查询
         */
        public QueryDigitalkeyTradepayResponse QueryDigitalkeyTradepay(QueryDigitalkeyTradepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDigitalkeyTradepayEx(request, headers, runtime);
        }

        /**
         * Description: 代扣支付查询
         * Summary: 代扣支付查询
         */
        public async Task<QueryDigitalkeyTradepayResponse> QueryDigitalkeyTradepayAsync(QueryDigitalkeyTradepayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDigitalkeyTradepayExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣支付查询
         * Summary: 代扣支付查询
         */
        public QueryDigitalkeyTradepayResponse QueryDigitalkeyTradepayEx(QueryDigitalkeyTradepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDigitalkeyTradepayResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.tradepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付查询
         * Summary: 代扣支付查询
         */
        public async Task<QueryDigitalkeyTradepayResponse> QueryDigitalkeyTradepayExAsync(QueryDigitalkeyTradepayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDigitalkeyTradepayResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.tradepay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询数控设备信息
         * Summary: iotbasic-查询数控设备信息
         */
        public GetDigitalkeyDeviceinfoResponse GetDigitalkeyDeviceinfo(GetDigitalkeyDeviceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDigitalkeyDeviceinfoEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询数控设备信息
         * Summary: iotbasic-查询数控设备信息
         */
        public async Task<GetDigitalkeyDeviceinfoResponse> GetDigitalkeyDeviceinfoAsync(GetDigitalkeyDeviceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDigitalkeyDeviceinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-查询数控设备信息
         * Summary: iotbasic-查询数控设备信息
         */
        public GetDigitalkeyDeviceinfoResponse GetDigitalkeyDeviceinfoEx(GetDigitalkeyDeviceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDigitalkeyDeviceinfoResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.deviceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-查询数控设备信息
         * Summary: iotbasic-查询数控设备信息
         */
        public async Task<GetDigitalkeyDeviceinfoResponse> GetDigitalkeyDeviceinfoExAsync(GetDigitalkeyDeviceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDigitalkeyDeviceinfoResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.deviceinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-新增应用
         * Summary: iotbasic-新增应用
         */
        public CreateIotlinkAppmanagerResponse CreateIotlinkAppmanager(CreateIotlinkAppmanagerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIotlinkAppmanagerEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-新增应用
         * Summary: iotbasic-新增应用
         */
        public async Task<CreateIotlinkAppmanagerResponse> CreateIotlinkAppmanagerAsync(CreateIotlinkAppmanagerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIotlinkAppmanagerExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-新增应用
         * Summary: iotbasic-新增应用
         */
        public CreateIotlinkAppmanagerResponse CreateIotlinkAppmanagerEx(CreateIotlinkAppmanagerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "blockchain.bot.iotlink.appmanager.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = CreateAntcloudGatewayxFileUploadEx(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateIotlinkAppmanagerResponse createIotlinkAppmanagerResponse = new CreateIotlinkAppmanagerResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createIotlinkAppmanagerResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIotlinkAppmanagerResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appmanager.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-新增应用
         * Summary: iotbasic-新增应用
         */
        public async Task<CreateIotlinkAppmanagerResponse> CreateIotlinkAppmanagerExAsync(CreateIotlinkAppmanagerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            if (!AlibabaCloud.TeaUtil.Common.IsUnset(request.FileObject))
            {
                CreateAntcloudGatewayxFileUploadRequest uploadReq = new CreateAntcloudGatewayxFileUploadRequest
                {
                    AuthToken = request.AuthToken,
                    ApiCode = "blockchain.bot.iotlink.appmanager.create",
                    FileName = request.FileObjectName,
                };
                CreateAntcloudGatewayxFileUploadResponse uploadResp = await CreateAntcloudGatewayxFileUploadExAsync(uploadReq, headers, runtime);
                if (!AntChain.AlipayUtil.AntchainUtils.IsSuccess(uploadResp.ResultCode, "ok"))
                {
                    CreateIotlinkAppmanagerResponse createIotlinkAppmanagerResponse = new CreateIotlinkAppmanagerResponse
                    {
                        ReqMsgId = uploadResp.ReqMsgId,
                        ResultCode = uploadResp.ResultCode,
                        ResultMsg = uploadResp.ResultMsg,
                    };
                    return createIotlinkAppmanagerResponse;
                }
                Dictionary<string, string> uploadHeaders = AntChain.AlipayUtil.AntchainUtils.ParseUploadHeaders(uploadResp.UploadHeaders);
                AntChain.AlipayUtil.AntchainUtils.PutObject(request.FileObject, uploadHeaders, uploadResp.UploadUrl);
                request.FileId = uploadResp.FileId;
                request.FileObject = null;
            }
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIotlinkAppmanagerResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appmanager.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-获取应用模块列表
         * Summary: iotbasic-获取应用模块列表
         */
        public ListIotlinkOtamoduleResponse ListIotlinkOtamodule(ListIotlinkOtamoduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIotlinkOtamoduleEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-获取应用模块列表
         * Summary: iotbasic-获取应用模块列表
         */
        public async Task<ListIotlinkOtamoduleResponse> ListIotlinkOtamoduleAsync(ListIotlinkOtamoduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIotlinkOtamoduleExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-获取应用模块列表
         * Summary: iotbasic-获取应用模块列表
         */
        public ListIotlinkOtamoduleResponse ListIotlinkOtamoduleEx(ListIotlinkOtamoduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIotlinkOtamoduleResponse>(DoRequest("1.0", "blockchain.bot.iotlink.otamodule.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-获取应用模块列表
         * Summary: iotbasic-获取应用模块列表
         */
        public async Task<ListIotlinkOtamoduleResponse> ListIotlinkOtamoduleExAsync(ListIotlinkOtamoduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIotlinkOtamoduleResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.otamodule.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-分页查询应用列表
         * Summary: iotbasic-分页查询应用列表
         */
        public PagequeryIotlinkAppmanagerResponse PagequeryIotlinkAppmanager(PagequeryIotlinkAppmanagerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIotlinkAppmanagerEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-分页查询应用列表
         * Summary: iotbasic-分页查询应用列表
         */
        public async Task<PagequeryIotlinkAppmanagerResponse> PagequeryIotlinkAppmanagerAsync(PagequeryIotlinkAppmanagerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIotlinkAppmanagerExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-分页查询应用列表
         * Summary: iotbasic-分页查询应用列表
         */
        public PagequeryIotlinkAppmanagerResponse PagequeryIotlinkAppmanagerEx(PagequeryIotlinkAppmanagerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIotlinkAppmanagerResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appmanager.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-分页查询应用列表
         * Summary: iotbasic-分页查询应用列表
         */
        public async Task<PagequeryIotlinkAppmanagerResponse> PagequeryIotlinkAppmanagerExAsync(PagequeryIotlinkAppmanagerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIotlinkAppmanagerResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appmanager.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-获取应用下载地址
         * Summary: iotbasic-获取应用下载地址
         */
        public GetIotlinkAppmanagerfileurlResponse GetIotlinkAppmanagerfileurl(GetIotlinkAppmanagerfileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetIotlinkAppmanagerfileurlEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-获取应用下载地址
         * Summary: iotbasic-获取应用下载地址
         */
        public async Task<GetIotlinkAppmanagerfileurlResponse> GetIotlinkAppmanagerfileurlAsync(GetIotlinkAppmanagerfileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetIotlinkAppmanagerfileurlExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-获取应用下载地址
         * Summary: iotbasic-获取应用下载地址
         */
        public GetIotlinkAppmanagerfileurlResponse GetIotlinkAppmanagerfileurlEx(GetIotlinkAppmanagerfileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIotlinkAppmanagerfileurlResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appmanagerfileurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-获取应用下载地址
         * Summary: iotbasic-获取应用下载地址
         */
        public async Task<GetIotlinkAppmanagerfileurlResponse> GetIotlinkAppmanagerfileurlExAsync(GetIotlinkAppmanagerfileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetIotlinkAppmanagerfileurlResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appmanagerfileurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-分页查询发布批次列表
         * Summary: iotbasic-分页查询发布批次列表
         */
        public PagequeryIotlinkAppreleaseorderResponse PagequeryIotlinkAppreleaseorder(PagequeryIotlinkAppreleaseorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIotlinkAppreleaseorderEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-分页查询发布批次列表
         * Summary: iotbasic-分页查询发布批次列表
         */
        public async Task<PagequeryIotlinkAppreleaseorderResponse> PagequeryIotlinkAppreleaseorderAsync(PagequeryIotlinkAppreleaseorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIotlinkAppreleaseorderExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-分页查询发布批次列表
         * Summary: iotbasic-分页查询发布批次列表
         */
        public PagequeryIotlinkAppreleaseorderResponse PagequeryIotlinkAppreleaseorderEx(PagequeryIotlinkAppreleaseorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIotlinkAppreleaseorderResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-分页查询发布批次列表
         * Summary: iotbasic-分页查询发布批次列表
         */
        public async Task<PagequeryIotlinkAppreleaseorderResponse> PagequeryIotlinkAppreleaseorderExAsync(PagequeryIotlinkAppreleaseorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIotlinkAppreleaseorderResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appreleaseorder.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-分页查询设备升级列表
         * Summary: iotbasic-分页查询设备升级列表
         */
        public PagequeryIotlinkAppreleasedeviceResponse PagequeryIotlinkAppreleasedevice(PagequeryIotlinkAppreleasedeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryIotlinkAppreleasedeviceEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-分页查询设备升级列表
         * Summary: iotbasic-分页查询设备升级列表
         */
        public async Task<PagequeryIotlinkAppreleasedeviceResponse> PagequeryIotlinkAppreleasedeviceAsync(PagequeryIotlinkAppreleasedeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryIotlinkAppreleasedeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-分页查询设备升级列表
         * Summary: iotbasic-分页查询设备升级列表
         */
        public PagequeryIotlinkAppreleasedeviceResponse PagequeryIotlinkAppreleasedeviceEx(PagequeryIotlinkAppreleasedeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIotlinkAppreleasedeviceResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-分页查询设备升级列表
         * Summary: iotbasic-分页查询设备升级列表
         */
        public async Task<PagequeryIotlinkAppreleasedeviceResponse> PagequeryIotlinkAppreleasedeviceExAsync(PagequeryIotlinkAppreleasedeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryIotlinkAppreleasedeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appreleasedevice.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-发布工单
         * Summary: iotbasic-发布工单
         */
        public PublishIotlinkAppreleaseorderResponse PublishIotlinkAppreleaseorder(PublishIotlinkAppreleaseorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishIotlinkAppreleaseorderEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-发布工单
         * Summary: iotbasic-发布工单
         */
        public async Task<PublishIotlinkAppreleaseorderResponse> PublishIotlinkAppreleaseorderAsync(PublishIotlinkAppreleaseorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishIotlinkAppreleaseorderExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-发布工单
         * Summary: iotbasic-发布工单
         */
        public PublishIotlinkAppreleaseorderResponse PublishIotlinkAppreleaseorderEx(PublishIotlinkAppreleaseorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishIotlinkAppreleaseorderResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-发布工单
         * Summary: iotbasic-发布工单
         */
        public async Task<PublishIotlinkAppreleaseorderResponse> PublishIotlinkAppreleaseorderExAsync(PublishIotlinkAppreleaseorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishIotlinkAppreleaseorderResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appreleaseorder.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-取消工单发布
         * Summary: iotbasic-取消工单发布
         */
        public CancelIotlinkAppreleaseorderResponse CancelIotlinkAppreleaseorder(CancelIotlinkAppreleaseorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelIotlinkAppreleaseorderEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-取消工单发布
         * Summary: iotbasic-取消工单发布
         */
        public async Task<CancelIotlinkAppreleaseorderResponse> CancelIotlinkAppreleaseorderAsync(CancelIotlinkAppreleaseorderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelIotlinkAppreleaseorderExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-取消工单发布
         * Summary: iotbasic-取消工单发布
         */
        public CancelIotlinkAppreleaseorderResponse CancelIotlinkAppreleaseorderEx(CancelIotlinkAppreleaseorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelIotlinkAppreleaseorderResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appreleaseorder.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-取消工单发布
         * Summary: iotbasic-取消工单发布
         */
        public async Task<CancelIotlinkAppreleaseorderResponse> CancelIotlinkAppreleaseorderExAsync(CancelIotlinkAppreleaseorderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelIotlinkAppreleaseorderResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appreleaseorder.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-取消设备升级
         * Summary: iotbasic-取消设备升级
         */
        public CancelIotlinkAppreleasedeviceResponse CancelIotlinkAppreleasedevice(CancelIotlinkAppreleasedeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelIotlinkAppreleasedeviceEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-取消设备升级
         * Summary: iotbasic-取消设备升级
         */
        public async Task<CancelIotlinkAppreleasedeviceResponse> CancelIotlinkAppreleasedeviceAsync(CancelIotlinkAppreleasedeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelIotlinkAppreleasedeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-取消设备升级
         * Summary: iotbasic-取消设备升级
         */
        public CancelIotlinkAppreleasedeviceResponse CancelIotlinkAppreleasedeviceEx(CancelIotlinkAppreleasedeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelIotlinkAppreleasedeviceResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-取消设备升级
         * Summary: iotbasic-取消设备升级
         */
        public async Task<CancelIotlinkAppreleasedeviceResponse> CancelIotlinkAppreleasedeviceExAsync(CancelIotlinkAppreleasedeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelIotlinkAppreleasedeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appreleasedevice.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-重试设备升级
         * Summary: iotbasic-重试设备升级
         */
        public RetryIotlinkAppreleasedeviceResponse RetryIotlinkAppreleasedevice(RetryIotlinkAppreleasedeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryIotlinkAppreleasedeviceEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-重试设备升级
         * Summary: iotbasic-重试设备升级
         */
        public async Task<RetryIotlinkAppreleasedeviceResponse> RetryIotlinkAppreleasedeviceAsync(RetryIotlinkAppreleasedeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryIotlinkAppreleasedeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-重试设备升级
         * Summary: iotbasic-重试设备升级
         */
        public RetryIotlinkAppreleasedeviceResponse RetryIotlinkAppreleasedeviceEx(RetryIotlinkAppreleasedeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryIotlinkAppreleasedeviceResponse>(DoRequest("1.0", "blockchain.bot.iotlink.appreleasedevice.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-重试设备升级
         * Summary: iotbasic-重试设备升级
         */
        public async Task<RetryIotlinkAppreleasedeviceResponse> RetryIotlinkAppreleasedeviceExAsync(RetryIotlinkAppreleasedeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryIotlinkAppreleasedeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.appreleasedevice.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-创建应用类型
         * Summary: iotbasic-创建应用类型
         */
        public CreateIotlinkOtamoduleResponse CreateIotlinkOtamodule(CreateIotlinkOtamoduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateIotlinkOtamoduleEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-创建应用类型
         * Summary: iotbasic-创建应用类型
         */
        public async Task<CreateIotlinkOtamoduleResponse> CreateIotlinkOtamoduleAsync(CreateIotlinkOtamoduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateIotlinkOtamoduleExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-创建应用类型
         * Summary: iotbasic-创建应用类型
         */
        public CreateIotlinkOtamoduleResponse CreateIotlinkOtamoduleEx(CreateIotlinkOtamoduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIotlinkOtamoduleResponse>(DoRequest("1.0", "blockchain.bot.iotlink.otamodule.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-创建应用类型
         * Summary: iotbasic-创建应用类型
         */
        public async Task<CreateIotlinkOtamoduleResponse> CreateIotlinkOtamoduleExAsync(CreateIotlinkOtamoduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateIotlinkOtamoduleResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.otamodule.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-修改应用类型
         * Summary: iotbasic-修改应用类型
         */
        public UpdateIotlinkOtamoduleResponse UpdateIotlinkOtamodule(UpdateIotlinkOtamoduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIotlinkOtamoduleEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-修改应用类型
         * Summary: iotbasic-修改应用类型
         */
        public async Task<UpdateIotlinkOtamoduleResponse> UpdateIotlinkOtamoduleAsync(UpdateIotlinkOtamoduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIotlinkOtamoduleExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-修改应用类型
         * Summary: iotbasic-修改应用类型
         */
        public UpdateIotlinkOtamoduleResponse UpdateIotlinkOtamoduleEx(UpdateIotlinkOtamoduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotlinkOtamoduleResponse>(DoRequest("1.0", "blockchain.bot.iotlink.otamodule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-修改应用类型
         * Summary: iotbasic-修改应用类型
         */
        public async Task<UpdateIotlinkOtamoduleResponse> UpdateIotlinkOtamoduleExAsync(UpdateIotlinkOtamoduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIotlinkOtamoduleResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.otamodule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-删除应用类型
         * Summary: iotbasic-删除应用类型
         */
        public DeleteIotlinkOtamoduleResponse DeleteIotlinkOtamodule(DeleteIotlinkOtamoduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteIotlinkOtamoduleEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-删除应用类型
         * Summary: iotbasic-删除应用类型
         */
        public async Task<DeleteIotlinkOtamoduleResponse> DeleteIotlinkOtamoduleAsync(DeleteIotlinkOtamoduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteIotlinkOtamoduleExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-删除应用类型
         * Summary: iotbasic-删除应用类型
         */
        public DeleteIotlinkOtamoduleResponse DeleteIotlinkOtamoduleEx(DeleteIotlinkOtamoduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIotlinkOtamoduleResponse>(DoRequest("1.0", "blockchain.bot.iotlink.otamodule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-删除应用类型
         * Summary: iotbasic-删除应用类型
         */
        public async Task<DeleteIotlinkOtamoduleResponse> DeleteIotlinkOtamoduleExAsync(DeleteIotlinkOtamoduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteIotlinkOtamoduleResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.otamodule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商导入物模型
         * Summary: iotbasic-设备厂商导入物模型
         */
        public ImportIotlinkThingmodeltslResponse ImportIotlinkThingmodeltsl(ImportIotlinkThingmodeltslRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportIotlinkThingmodeltslEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商导入物模型
         * Summary: iotbasic-设备厂商导入物模型
         */
        public async Task<ImportIotlinkThingmodeltslResponse> ImportIotlinkThingmodeltslAsync(ImportIotlinkThingmodeltslRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportIotlinkThingmodeltslExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商导入物模型
         * Summary: iotbasic-设备厂商导入物模型
         */
        public ImportIotlinkThingmodeltslResponse ImportIotlinkThingmodeltslEx(ImportIotlinkThingmodeltslRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIotlinkThingmodeltslResponse>(DoRequest("1.0", "blockchain.bot.iotlink.thingmodeltsl.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商导入物模型
         * Summary: iotbasic-设备厂商导入物模型
         */
        public async Task<ImportIotlinkThingmodeltslResponse> ImportIotlinkThingmodeltslExAsync(ImportIotlinkThingmodeltslRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportIotlinkThingmodeltslResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotlink.thingmodeltsl.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-重置设备认证秘钥
         * Summary: iotbasic-重置设备认证秘钥
         */
        public ResetIotbasicDeviceseckeyResponse ResetIotbasicDeviceseckey(ResetIotbasicDeviceseckeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResetIotbasicDeviceseckeyEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-重置设备认证秘钥
         * Summary: iotbasic-重置设备认证秘钥
         */
        public async Task<ResetIotbasicDeviceseckeyResponse> ResetIotbasicDeviceseckeyAsync(ResetIotbasicDeviceseckeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResetIotbasicDeviceseckeyExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-重置设备认证秘钥
         * Summary: iotbasic-重置设备认证秘钥
         */
        public ResetIotbasicDeviceseckeyResponse ResetIotbasicDeviceseckeyEx(ResetIotbasicDeviceseckeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetIotbasicDeviceseckeyResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.deviceseckey.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-重置设备认证秘钥
         * Summary: iotbasic-重置设备认证秘钥
         */
        public async Task<ResetIotbasicDeviceseckeyResponse> ResetIotbasicDeviceseckeyExAsync(ResetIotbasicDeviceseckeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResetIotbasicDeviceseckeyResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.deviceseckey.reset", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预授权支付订单创建
         * Summary: 预授权支付订单创建
         */
        public CreateDigitalkeyPreauthpayResponse CreateDigitalkeyPreauthpay(CreateDigitalkeyPreauthpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDigitalkeyPreauthpayEx(request, headers, runtime);
        }

        /**
         * Description: 预授权支付订单创建
         * Summary: 预授权支付订单创建
         */
        public async Task<CreateDigitalkeyPreauthpayResponse> CreateDigitalkeyPreauthpayAsync(CreateDigitalkeyPreauthpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDigitalkeyPreauthpayExAsync(request, headers, runtime);
        }

        /**
         * Description: 预授权支付订单创建
         * Summary: 预授权支付订单创建
         */
        public CreateDigitalkeyPreauthpayResponse CreateDigitalkeyPreauthpayEx(CreateDigitalkeyPreauthpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDigitalkeyPreauthpayResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.preauthpay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预授权支付订单创建
         * Summary: 预授权支付订单创建
         */
        public async Task<CreateDigitalkeyPreauthpayResponse> CreateDigitalkeyPreauthpayExAsync(CreateDigitalkeyPreauthpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDigitalkeyPreauthpayResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.preauthpay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预授权资金撤销
         * Summary: 预授权资金撤销
         */
        public CancelDigitalkeyPreauthpayResponse CancelDigitalkeyPreauthpay(CancelDigitalkeyPreauthpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelDigitalkeyPreauthpayEx(request, headers, runtime);
        }

        /**
         * Description: 预授权资金撤销
         * Summary: 预授权资金撤销
         */
        public async Task<CancelDigitalkeyPreauthpayResponse> CancelDigitalkeyPreauthpayAsync(CancelDigitalkeyPreauthpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelDigitalkeyPreauthpayExAsync(request, headers, runtime);
        }

        /**
         * Description: 预授权资金撤销
         * Summary: 预授权资金撤销
         */
        public CancelDigitalkeyPreauthpayResponse CancelDigitalkeyPreauthpayEx(CancelDigitalkeyPreauthpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDigitalkeyPreauthpayResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.preauthpay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预授权资金撤销
         * Summary: 预授权资金撤销
         */
        public async Task<CancelDigitalkeyPreauthpayResponse> CancelDigitalkeyPreauthpayExAsync(CancelDigitalkeyPreauthpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDigitalkeyPreauthpayResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.preauthpay.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预授权资金解冻
         * Summary: 预授权资金解冻
         */
        public UnfreezeDigitalkeyPreauthpayResponse UnfreezeDigitalkeyPreauthpay(UnfreezeDigitalkeyPreauthpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnfreezeDigitalkeyPreauthpayEx(request, headers, runtime);
        }

        /**
         * Description: 预授权资金解冻
         * Summary: 预授权资金解冻
         */
        public async Task<UnfreezeDigitalkeyPreauthpayResponse> UnfreezeDigitalkeyPreauthpayAsync(UnfreezeDigitalkeyPreauthpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnfreezeDigitalkeyPreauthpayExAsync(request, headers, runtime);
        }

        /**
         * Description: 预授权资金解冻
         * Summary: 预授权资金解冻
         */
        public UnfreezeDigitalkeyPreauthpayResponse UnfreezeDigitalkeyPreauthpayEx(UnfreezeDigitalkeyPreauthpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeDigitalkeyPreauthpayResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.preauthpay.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预授权资金解冻
         * Summary: 预授权资金解冻
         */
        public async Task<UnfreezeDigitalkeyPreauthpayResponse> UnfreezeDigitalkeyPreauthpayExAsync(UnfreezeDigitalkeyPreauthpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeDigitalkeyPreauthpayResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.preauthpay.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预授权支付订单查询
         * Summary: 预授权支付订单查询
         */
        public QueryDigitalkeyPreauthpayResponse QueryDigitalkeyPreauthpay(QueryDigitalkeyPreauthpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDigitalkeyPreauthpayEx(request, headers, runtime);
        }

        /**
         * Description: 预授权支付订单查询
         * Summary: 预授权支付订单查询
         */
        public async Task<QueryDigitalkeyPreauthpayResponse> QueryDigitalkeyPreauthpayAsync(QueryDigitalkeyPreauthpayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDigitalkeyPreauthpayExAsync(request, headers, runtime);
        }

        /**
         * Description: 预授权支付订单查询
         * Summary: 预授权支付订单查询
         */
        public QueryDigitalkeyPreauthpayResponse QueryDigitalkeyPreauthpayEx(QueryDigitalkeyPreauthpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDigitalkeyPreauthpayResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.preauthpay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 预授权支付订单查询
         * Summary: 预授权支付订单查询
         */
        public async Task<QueryDigitalkeyPreauthpayResponse> QueryDigitalkeyPreauthpayExAsync(QueryDigitalkeyPreauthpayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDigitalkeyPreauthpayResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.preauthpay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-客户指定设备调用服务
         * Summary: iotbasic-客户指定设备调用服务
         */
        public ExecDeviceCustomerthingserviceResponse ExecDeviceCustomerthingservice(ExecDeviceCustomerthingserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecDeviceCustomerthingserviceEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-客户指定设备调用服务
         * Summary: iotbasic-客户指定设备调用服务
         */
        public async Task<ExecDeviceCustomerthingserviceResponse> ExecDeviceCustomerthingserviceAsync(ExecDeviceCustomerthingserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecDeviceCustomerthingserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-客户指定设备调用服务
         * Summary: iotbasic-客户指定设备调用服务
         */
        public ExecDeviceCustomerthingserviceResponse ExecDeviceCustomerthingserviceEx(ExecDeviceCustomerthingserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecDeviceCustomerthingserviceResponse>(DoRequest("1.0", "blockchain.bot.device.customerthingservice.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-客户指定设备调用服务
         * Summary: iotbasic-客户指定设备调用服务
         */
        public async Task<ExecDeviceCustomerthingserviceResponse> ExecDeviceCustomerthingserviceExAsync(ExecDeviceCustomerthingserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecDeviceCustomerthingserviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.device.customerthingservice.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 3c商品开通消息转发
         * Summary: 3c商品开通消息转发
         */
        public OpenIotplantformProductResponse OpenIotplantformProduct(OpenIotplantformProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenIotplantformProductEx(request, headers, runtime);
        }

        /**
         * Description: 3c商品开通消息转发
         * Summary: 3c商品开通消息转发
         */
        public async Task<OpenIotplantformProductResponse> OpenIotplantformProductAsync(OpenIotplantformProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenIotplantformProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 3c商品开通消息转发
         * Summary: 3c商品开通消息转发
         */
        public OpenIotplantformProductResponse OpenIotplantformProductEx(OpenIotplantformProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenIotplantformProductResponse>(DoRequest("1.0", "blockchain.bot.iotplantform.product.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3c商品开通消息转发
         * Summary: 3c商品开通消息转发
         */
        public async Task<OpenIotplantformProductResponse> OpenIotplantformProductExAsync(OpenIotplantformProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenIotplantformProductResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotplantform.product.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3c商品停止消息转发
         * Summary: 3c商品停止消息转发
         */
        public StopIotplantformProductResponse StopIotplantformProduct(StopIotplantformProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopIotplantformProductEx(request, headers, runtime);
        }

        /**
         * Description: 3c商品停止消息转发
         * Summary: 3c商品停止消息转发
         */
        public async Task<StopIotplantformProductResponse> StopIotplantformProductAsync(StopIotplantformProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopIotplantformProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 3c商品停止消息转发
         * Summary: 3c商品停止消息转发
         */
        public StopIotplantformProductResponse StopIotplantformProductEx(StopIotplantformProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopIotplantformProductResponse>(DoRequest("1.0", "blockchain.bot.iotplantform.product.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3c商品停止消息转发
         * Summary: 3c商品停止消息转发
         */
        public async Task<StopIotplantformProductResponse> StopIotplantformProductExAsync(StopIotplantformProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopIotplantformProductResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotplantform.product.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3c商品恢复消息转发
         * Summary: 3c商品恢复消息转发
         */
        public ResumeIotplantformProductResponse ResumeIotplantformProduct(ResumeIotplantformProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ResumeIotplantformProductEx(request, headers, runtime);
        }

        /**
         * Description: 3c商品恢复消息转发
         * Summary: 3c商品恢复消息转发
         */
        public async Task<ResumeIotplantformProductResponse> ResumeIotplantformProductAsync(ResumeIotplantformProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ResumeIotplantformProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 3c商品恢复消息转发
         * Summary: 3c商品恢复消息转发
         */
        public ResumeIotplantformProductResponse ResumeIotplantformProductEx(ResumeIotplantformProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeIotplantformProductResponse>(DoRequest("1.0", "blockchain.bot.iotplantform.product.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 3c商品恢复消息转发
         * Summary: 3c商品恢复消息转发
         */
        public async Task<ResumeIotplantformProductResponse> ResumeIotplantformProductExAsync(ResumeIotplantformProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ResumeIotplantformProductResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotplantform.product.resume", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
         * Description: 查询物模型设备详情
         * Summary: 查询物模型设备详情
         */
        public DetailThingmodelDeviceResponse DetailThingmodelDevice(DetailThingmodelDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailThingmodelDeviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询物模型设备详情
         * Summary: 查询物模型设备详情
         */
        public async Task<DetailThingmodelDeviceResponse> DetailThingmodelDeviceAsync(DetailThingmodelDeviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailThingmodelDeviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询物模型设备详情
         * Summary: 查询物模型设备详情
         */
        public DetailThingmodelDeviceResponse DetailThingmodelDeviceEx(DetailThingmodelDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailThingmodelDeviceResponse>(DoRequest("1.0", "blockchain.bot.thingmodel.device.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询物模型设备详情
         * Summary: 查询物模型设备详情
         */
        public async Task<DetailThingmodelDeviceResponse> DetailThingmodelDeviceExAsync(DetailThingmodelDeviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailThingmodelDeviceResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingmodel.device.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
         * Summary: 创建上传文件URL
         */
        public CreateCollectorUploadfileurlResponse CreateCollectorUploadfileurl(CreateCollectorUploadfileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCollectorUploadfileurlEx(request, headers, runtime);
        }

        /**
         * Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
         * Summary: 创建上传文件URL
         */
        public async Task<CreateCollectorUploadfileurlResponse> CreateCollectorUploadfileurlAsync(CreateCollectorUploadfileurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCollectorUploadfileurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
         * Summary: 创建上传文件URL
         */
        public CreateCollectorUploadfileurlResponse CreateCollectorUploadfileurlEx(CreateCollectorUploadfileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCollectorUploadfileurlResponse>(DoRequest("1.0", "blockchain.bot.collector.uploadfileurl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过CSV文件上报数据时，需要先通过这个接口获取上报地址URL
         * Summary: 创建上传文件URL
         */
        public async Task<CreateCollectorUploadfileurlResponse> CreateCollectorUploadfileurlExAsync(CreateCollectorUploadfileurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCollectorUploadfileurlResponse>(await DoRequestAsync("1.0", "blockchain.bot.collector.uploadfileurl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
         * Summary: 通过文件上报数据，上传完毕后确认
         */
        public ConfirmCollectorUploadfileResponse ConfirmCollectorUploadfile(ConfirmCollectorUploadfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmCollectorUploadfileEx(request, headers, runtime);
        }

        /**
         * Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
         * Summary: 通过文件上报数据，上传完毕后确认
         */
        public async Task<ConfirmCollectorUploadfileResponse> ConfirmCollectorUploadfileAsync(ConfirmCollectorUploadfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmCollectorUploadfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
         * Summary: 通过文件上报数据，上传完毕后确认
         */
        public ConfirmCollectorUploadfileResponse ConfirmCollectorUploadfileEx(ConfirmCollectorUploadfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmCollectorUploadfileResponse>(DoRequest("1.0", "blockchain.bot.collector.uploadfile.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过文件上报数据流程，先获取上报文件URL，然后向目标URL中上传文件，最后调用此接口进行确认
         * Summary: 通过文件上报数据，上传完毕后确认
         */
        public async Task<ConfirmCollectorUploadfileResponse> ConfirmCollectorUploadfileExAsync(ConfirmCollectorUploadfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmCollectorUploadfileResponse>(await DoRequestAsync("1.0", "blockchain.bot.collector.uploadfile.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建物模型事件
         * Summary: 创建物模型事件
         */
        public CreateThingmodelEventResponse CreateThingmodelEvent(CreateThingmodelEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateThingmodelEventEx(request, headers, runtime);
        }

        /**
         * Description: 创建物模型事件
         * Summary: 创建物模型事件
         */
        public async Task<CreateThingmodelEventResponse> CreateThingmodelEventAsync(CreateThingmodelEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateThingmodelEventExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建物模型事件
         * Summary: 创建物模型事件
         */
        public CreateThingmodelEventResponse CreateThingmodelEventEx(CreateThingmodelEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateThingmodelEventResponse>(DoRequest("1.0", "blockchain.bot.thingmodel.event.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建物模型事件
         * Summary: 创建物模型事件
         */
        public async Task<CreateThingmodelEventResponse> CreateThingmodelEventExAsync(CreateThingmodelEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateThingmodelEventResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingmodel.event.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询物模型事件
         * Summary: 查询物模型事件
         */
        public QueryThingmodelEventResponse QueryThingmodelEvent(QueryThingmodelEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryThingmodelEventEx(request, headers, runtime);
        }

        /**
         * Description: 查询物模型事件
         * Summary: 查询物模型事件
         */
        public async Task<QueryThingmodelEventResponse> QueryThingmodelEventAsync(QueryThingmodelEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryThingmodelEventExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询物模型事件
         * Summary: 查询物模型事件
         */
        public QueryThingmodelEventResponse QueryThingmodelEventEx(QueryThingmodelEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingmodelEventResponse>(DoRequest("1.0", "blockchain.bot.thingmodel.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询物模型事件
         * Summary: 查询物模型事件
         */
        public async Task<QueryThingmodelEventResponse> QueryThingmodelEventExAsync(QueryThingmodelEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingmodelEventResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingmodel.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
         * Summary: 车辆关联的部标设备列表查询
         */
        public QueryEntityrelationJtdevicebycarResponse QueryEntityrelationJtdevicebycar(QueryEntityrelationJtdevicebycarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEntityrelationJtdevicebycarEx(request, headers, runtime);
        }

        /**
         * Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
         * Summary: 车辆关联的部标设备列表查询
         */
        public async Task<QueryEntityrelationJtdevicebycarResponse> QueryEntityrelationJtdevicebycarAsync(QueryEntityrelationJtdevicebycarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEntityrelationJtdevicebycarExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
         * Summary: 车辆关联的部标设备列表查询
         */
        public QueryEntityrelationJtdevicebycarResponse QueryEntityrelationJtdevicebycarEx(QueryEntityrelationJtdevicebycarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEntityrelationJtdevicebycarResponse>(DoRequest("1.0", "blockchain.bot.entityrelation.jtdevicebycar.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过车辆车牌的颜色+号码+场景码，查询关联的部标设备对应的IoT可信平台唯一ID
         * Summary: 车辆关联的部标设备列表查询
         */
        public async Task<QueryEntityrelationJtdevicebycarResponse> QueryEntityrelationJtdevicebycarExAsync(QueryEntityrelationJtdevicebycarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEntityrelationJtdevicebycarResponse>(await DoRequestAsync("1.0", "blockchain.bot.entityrelation.jtdevicebycar.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 部标设备位置/轨迹/异常数据查询
         * Summary: 部标设备位置/轨迹/异常数据查询
         */
        public QueryCollectorJtfluxResponse QueryCollectorJtflux(QueryCollectorJtfluxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCollectorJtfluxEx(request, headers, runtime);
        }

        /**
         * Description: 部标设备位置/轨迹/异常数据查询
         * Summary: 部标设备位置/轨迹/异常数据查询
         */
        public async Task<QueryCollectorJtfluxResponse> QueryCollectorJtfluxAsync(QueryCollectorJtfluxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCollectorJtfluxExAsync(request, headers, runtime);
        }

        /**
         * Description: 部标设备位置/轨迹/异常数据查询
         * Summary: 部标设备位置/轨迹/异常数据查询
         */
        public QueryCollectorJtfluxResponse QueryCollectorJtfluxEx(QueryCollectorJtfluxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCollectorJtfluxResponse>(DoRequest("1.0", "blockchain.bot.collector.jtflux.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 部标设备位置/轨迹/异常数据查询
         * Summary: 部标设备位置/轨迹/异常数据查询
         */
        public async Task<QueryCollectorJtfluxResponse> QueryCollectorJtfluxExAsync(QueryCollectorJtfluxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCollectorJtfluxResponse>(await DoRequestAsync("1.0", "blockchain.bot.collector.jtflux.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过异常事件ID查询部标多媒体文件地址
         * Summary: 通过异常事件ID查询部标多媒体文件地址
         */
        public QueryCollectorJtmediaResponse QueryCollectorJtmedia(QueryCollectorJtmediaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCollectorJtmediaEx(request, headers, runtime);
        }

        /**
         * Description: 通过异常事件ID查询部标多媒体文件地址
         * Summary: 通过异常事件ID查询部标多媒体文件地址
         */
        public async Task<QueryCollectorJtmediaResponse> QueryCollectorJtmediaAsync(QueryCollectorJtmediaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCollectorJtmediaExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过异常事件ID查询部标多媒体文件地址
         * Summary: 通过异常事件ID查询部标多媒体文件地址
         */
        public QueryCollectorJtmediaResponse QueryCollectorJtmediaEx(QueryCollectorJtmediaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCollectorJtmediaResponse>(DoRequest("1.0", "blockchain.bot.collector.jtmedia.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过异常事件ID查询部标多媒体文件地址
         * Summary: 通过异常事件ID查询部标多媒体文件地址
         */
        public async Task<QueryCollectorJtmediaResponse> QueryCollectorJtmediaExAsync(QueryCollectorJtmediaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCollectorJtmediaResponse>(await DoRequestAsync("1.0", "blockchain.bot.collector.jtmedia.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产线压测任务
         * Summary: 查询项目关联的产线压测任务
         */
        public QueryOnlinepressuretestResponse QueryOnlinepressuretest(QueryOnlinepressuretestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOnlinepressuretestEx(request, headers, runtime);
        }

        /**
         * Description: 查询产线压测任务
         * Summary: 查询项目关联的产线压测任务
         */
        public async Task<QueryOnlinepressuretestResponse> QueryOnlinepressuretestAsync(QueryOnlinepressuretestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOnlinepressuretestExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询产线压测任务
         * Summary: 查询项目关联的产线压测任务
         */
        public QueryOnlinepressuretestResponse QueryOnlinepressuretestEx(QueryOnlinepressuretestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOnlinepressuretestResponse>(DoRequest("1.0", "blockchain.bot.onlinepressuretest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产线压测任务
         * Summary: 查询项目关联的产线压测任务
         */
        public async Task<QueryOnlinepressuretestResponse> QueryOnlinepressuretestExAsync(QueryOnlinepressuretestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOnlinepressuretestResponse>(await DoRequestAsync("1.0", "blockchain.bot.onlinepressuretest.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  【自主联调平台】创建产线压测任务
         * Summary:  【自主联调平台】创建产线压测任务
         */
        public CreateOnlinepressuretestResponse CreateOnlinepressuretest(CreateOnlinepressuretestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOnlinepressuretestEx(request, headers, runtime);
        }

        /**
         * Description:  【自主联调平台】创建产线压测任务
         * Summary:  【自主联调平台】创建产线压测任务
         */
        public async Task<CreateOnlinepressuretestResponse> CreateOnlinepressuretestAsync(CreateOnlinepressuretestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOnlinepressuretestExAsync(request, headers, runtime);
        }

        /**
         * Description:  【自主联调平台】创建产线压测任务
         * Summary:  【自主联调平台】创建产线压测任务
         */
        public CreateOnlinepressuretestResponse CreateOnlinepressuretestEx(CreateOnlinepressuretestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOnlinepressuretestResponse>(DoRequest("1.0", "blockchain.bot.onlinepressuretest.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  【自主联调平台】创建产线压测任务
         * Summary:  【自主联调平台】创建产线压测任务
         */
        public async Task<CreateOnlinepressuretestResponse> CreateOnlinepressuretestExAsync(CreateOnlinepressuretestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOnlinepressuretestResponse>(await DoRequestAsync("1.0", "blockchain.bot.onlinepressuretest.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新客户侧的压测报告
         * Summary: 更新客户侧的压测报告
         */
        public UpdateOnlinepressuretestCustomerreportResponse UpdateOnlinepressuretestCustomerreport(UpdateOnlinepressuretestCustomerreportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateOnlinepressuretestCustomerreportEx(request, headers, runtime);
        }

        /**
         * Description: 更新客户侧的压测报告
         * Summary: 更新客户侧的压测报告
         */
        public async Task<UpdateOnlinepressuretestCustomerreportResponse> UpdateOnlinepressuretestCustomerreportAsync(UpdateOnlinepressuretestCustomerreportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateOnlinepressuretestCustomerreportExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新客户侧的压测报告
         * Summary: 更新客户侧的压测报告
         */
        public UpdateOnlinepressuretestCustomerreportResponse UpdateOnlinepressuretestCustomerreportEx(UpdateOnlinepressuretestCustomerreportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOnlinepressuretestCustomerreportResponse>(DoRequest("1.0", "blockchain.bot.onlinepressuretest.customerreport.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新客户侧的压测报告
         * Summary: 更新客户侧的压测报告
         */
        public async Task<UpdateOnlinepressuretestCustomerreportResponse> UpdateOnlinepressuretestCustomerreportExAsync(UpdateOnlinepressuretestCustomerreportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOnlinepressuretestCustomerreportResponse>(await DoRequestAsync("1.0", "blockchain.bot.onlinepressuretest.customerreport.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询客户的物模型事件
         * Summary: 查询客户的物模型事件列表
         */
        public QueryThingmodeleventBycustomertenantResponse QueryThingmodeleventBycustomertenant(QueryThingmodeleventBycustomertenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryThingmodeleventBycustomertenantEx(request, headers, runtime);
        }

        /**
         * Description: 查询客户的物模型事件
         * Summary: 查询客户的物模型事件列表
         */
        public async Task<QueryThingmodeleventBycustomertenantResponse> QueryThingmodeleventBycustomertenantAsync(QueryThingmodeleventBycustomertenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryThingmodeleventBycustomertenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询客户的物模型事件
         * Summary: 查询客户的物模型事件列表
         */
        public QueryThingmodeleventBycustomertenantResponse QueryThingmodeleventBycustomertenantEx(QueryThingmodeleventBycustomertenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingmodeleventBycustomertenantResponse>(DoRequest("1.0", "blockchain.bot.thingmodelevent.bycustomertenant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询客户的物模型事件
         * Summary: 查询客户的物模型事件列表
         */
        public async Task<QueryThingmodeleventBycustomertenantResponse> QueryThingmodeleventBycustomertenantExAsync(QueryThingmodeleventBycustomertenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryThingmodeleventBycustomertenantResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingmodelevent.bycustomertenant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从联调环境部署物模型UDF到生产环境
         * Summary: 从联调环境部署物模型UDF到生产环境
         */
        public DeployThingudfResponse DeployThingudf(DeployThingudfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeployThingudfEx(request, headers, runtime);
        }

        /**
         * Description: 从联调环境部署物模型UDF到生产环境
         * Summary: 从联调环境部署物模型UDF到生产环境
         */
        public async Task<DeployThingudfResponse> DeployThingudfAsync(DeployThingudfRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeployThingudfExAsync(request, headers, runtime);
        }

        /**
         * Description: 从联调环境部署物模型UDF到生产环境
         * Summary: 从联调环境部署物模型UDF到生产环境
         */
        public DeployThingudfResponse DeployThingudfEx(DeployThingudfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeployThingudfResponse>(DoRequest("1.0", "blockchain.bot.thingudf.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从联调环境部署物模型UDF到生产环境
         * Summary: 从联调环境部署物模型UDF到生产环境
         */
        public async Task<DeployThingudfResponse> DeployThingudfExAsync(DeployThingudfRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeployThingudfResponse>(await DoRequestAsync("1.0", "blockchain.bot.thingudf.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询二轮车操作日志
         * Summary: 分页查询二轮车操作日志
         */
        public PagequeryEbikeOperationlogResponse PagequeryEbikeOperationlog(PagequeryEbikeOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryEbikeOperationlogEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询二轮车操作日志
         * Summary: 分页查询二轮车操作日志
         */
        public async Task<PagequeryEbikeOperationlogResponse> PagequeryEbikeOperationlogAsync(PagequeryEbikeOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryEbikeOperationlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询二轮车操作日志
         * Summary: 分页查询二轮车操作日志
         */
        public PagequeryEbikeOperationlogResponse PagequeryEbikeOperationlogEx(PagequeryEbikeOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryEbikeOperationlogResponse>(DoRequest("1.0", "blockchain.bot.ebike.operationlog.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询二轮车操作日志
         * Summary: 分页查询二轮车操作日志
         */
        public async Task<PagequeryEbikeOperationlogResponse> PagequeryEbikeOperationlogExAsync(PagequeryEbikeOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryEbikeOperationlogResponse>(await DoRequestAsync("1.0", "blockchain.bot.ebike.operationlog.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户实体拓展功能查询
         * Summary: 客户实体拓展功能查询
         */
        public QueryCustomerentityServiceResponse QueryCustomerentityService(QueryCustomerentityServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCustomerentityServiceEx(request, headers, runtime);
        }

        /**
         * Description: 客户实体拓展功能查询
         * Summary: 客户实体拓展功能查询
         */
        public async Task<QueryCustomerentityServiceResponse> QueryCustomerentityServiceAsync(QueryCustomerentityServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCustomerentityServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 客户实体拓展功能查询
         * Summary: 客户实体拓展功能查询
         */
        public QueryCustomerentityServiceResponse QueryCustomerentityServiceEx(QueryCustomerentityServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerentityServiceResponse>(DoRequest("1.0", "blockchain.bot.customerentity.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户实体拓展功能查询
         * Summary: 客户实体拓展功能查询
         */
        public async Task<QueryCustomerentityServiceResponse> QueryCustomerentityServiceExAsync(QueryCustomerentityServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCustomerentityServiceResponse>(await DoRequestAsync("1.0", "blockchain.bot.customerentity.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付芯证书申请
         * Summary: 支付芯证书申请
         */
        public ApplyTechintegrationSkushipResponse ApplyTechintegrationSkuship(ApplyTechintegrationSkushipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyTechintegrationSkushipEx(request, headers, runtime);
        }

        /**
         * Description: 支付芯证书申请
         * Summary: 支付芯证书申请
         */
        public async Task<ApplyTechintegrationSkushipResponse> ApplyTechintegrationSkushipAsync(ApplyTechintegrationSkushipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyTechintegrationSkushipExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付芯证书申请
         * Summary: 支付芯证书申请
         */
        public ApplyTechintegrationSkushipResponse ApplyTechintegrationSkushipEx(ApplyTechintegrationSkushipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTechintegrationSkushipResponse>(DoRequest("1.0", "blockchain.bot.techintegration.skuship.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付芯证书申请
         * Summary: 支付芯证书申请
         */
        public async Task<ApplyTechintegrationSkushipResponse> ApplyTechintegrationSkushipExAsync(ApplyTechintegrationSkushipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTechintegrationSkushipResponse>(await DoRequestAsync("1.0", "blockchain.bot.techintegration.skuship.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
         * Summary: 支付芯证书申请接口，唯一编码软件接入形式
         */
        public ApplyTechintegrationSkushipbyuidResponse ApplyTechintegrationSkushipbyuid(ApplyTechintegrationSkushipbyuidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyTechintegrationSkushipbyuidEx(request, headers, runtime);
        }

        /**
         * Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
         * Summary: 支付芯证书申请接口，唯一编码软件接入形式
         */
        public async Task<ApplyTechintegrationSkushipbyuidResponse> ApplyTechintegrationSkushipbyuidAsync(ApplyTechintegrationSkushipbyuidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyTechintegrationSkushipbyuidExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
         * Summary: 支付芯证书申请接口，唯一编码软件接入形式
         */
        public ApplyTechintegrationSkushipbyuidResponse ApplyTechintegrationSkushipbyuidEx(ApplyTechintegrationSkushipbyuidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTechintegrationSkushipbyuidResponse>(DoRequest("1.0", "blockchain.bot.techintegration.skushipbyuid.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付芯证书申请接口，适用于唯一编码软件接入形式
         * Summary: 支付芯证书申请接口，唯一编码软件接入形式
         */
        public async Task<ApplyTechintegrationSkushipbyuidResponse> ApplyTechintegrationSkushipbyuidExAsync(ApplyTechintegrationSkushipbyuidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyTechintegrationSkushipbyuidResponse>(await DoRequestAsync("1.0", "blockchain.bot.techintegration.skushipbyuid.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询压测任务所关联的实体的最新上链数据列表
         * Summary: 查询压测任务的上链数据列表
         */
        public QueryOnlinepressuretestDataResponse QueryOnlinepressuretestData(QueryOnlinepressuretestDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOnlinepressuretestDataEx(request, headers, runtime);
        }

        /**
         * Description: 查询压测任务所关联的实体的最新上链数据列表
         * Summary: 查询压测任务的上链数据列表
         */
        public async Task<QueryOnlinepressuretestDataResponse> QueryOnlinepressuretestDataAsync(QueryOnlinepressuretestDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOnlinepressuretestDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询压测任务所关联的实体的最新上链数据列表
         * Summary: 查询压测任务的上链数据列表
         */
        public QueryOnlinepressuretestDataResponse QueryOnlinepressuretestDataEx(QueryOnlinepressuretestDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOnlinepressuretestDataResponse>(DoRequest("1.0", "blockchain.bot.onlinepressuretest.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询压测任务所关联的实体的最新上链数据列表
         * Summary: 查询压测任务的上链数据列表
         */
        public async Task<QueryOnlinepressuretestDataResponse> QueryOnlinepressuretestDataExAsync(QueryOnlinepressuretestDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOnlinepressuretestDataResponse>(await DoRequestAsync("1.0", "blockchain.bot.onlinepressuretest.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物模型服务调用
         * Summary: 物模型服务调用
         */
        public ExecThingServiceResponse ExecThingService(ExecThingServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecThingServiceEx(request, headers, runtime);
        }

        /**
         * Description: 物模型服务调用
         * Summary: 物模型服务调用
         */
        public async Task<ExecThingServiceResponse> ExecThingServiceAsync(ExecThingServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecThingServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 物模型服务调用
         * Summary: 物模型服务调用
         */
        public ExecThingServiceResponse ExecThingServiceEx(ExecThingServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecThingServiceResponse>(DoRequest("1.0", "blockchain.bot.thing.service.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物模型服务调用
         * Summary: 物模型服务调用
         */
        public async Task<ExecThingServiceResponse> ExecThingServiceExAsync(ExecThingServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecThingServiceResponse>(await DoRequestAsync("1.0", "blockchain.bot.thing.service.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
         * Summary: 物模型服务回复接口
         */
        public CallbackThingServicebyeventResponse CallbackThingServicebyevent(CallbackThingServicebyeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackThingServicebyeventEx(request, headers, runtime);
        }

        /**
         * Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
         * Summary: 物模型服务回复接口
         */
        public async Task<CallbackThingServicebyeventResponse> CallbackThingServicebyeventAsync(CallbackThingServicebyeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackThingServicebyeventExAsync(request, headers, runtime);
        }

        /**
         * Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
         * Summary: 物模型服务回复接口
         */
        public CallbackThingServicebyeventResponse CallbackThingServicebyeventEx(CallbackThingServicebyeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackThingServicebyeventResponse>(DoRequest("1.0", "blockchain.bot.thing.servicebyevent.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物模型服务回复接口，通过场景码、数据模型ID等作为回复标识
         * Summary: 物模型服务回复接口
         */
        public async Task<CallbackThingServicebyeventResponse> CallbackThingServicebyeventExAsync(CallbackThingServicebyeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackThingServicebyeventResponse>(await DoRequestAsync("1.0", "blockchain.bot.thing.servicebyevent.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加SKU授权白名单
         * Summary: 添加SKU授权白名单
         */
        public ImportTechintegrationSkugrantwhitelistResponse ImportTechintegrationSkugrantwhitelist(ImportTechintegrationSkugrantwhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportTechintegrationSkugrantwhitelistEx(request, headers, runtime);
        }

        /**
         * Description: 添加SKU授权白名单
         * Summary: 添加SKU授权白名单
         */
        public async Task<ImportTechintegrationSkugrantwhitelistResponse> ImportTechintegrationSkugrantwhitelistAsync(ImportTechintegrationSkugrantwhitelistRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportTechintegrationSkugrantwhitelistExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加SKU授权白名单
         * Summary: 添加SKU授权白名单
         */
        public ImportTechintegrationSkugrantwhitelistResponse ImportTechintegrationSkugrantwhitelistEx(ImportTechintegrationSkugrantwhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTechintegrationSkugrantwhitelistResponse>(DoRequest("1.0", "blockchain.bot.techintegration.skugrantwhitelist.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加SKU授权白名单
         * Summary: 添加SKU授权白名单
         */
        public async Task<ImportTechintegrationSkugrantwhitelistResponse> ImportTechintegrationSkugrantwhitelistExAsync(ImportTechintegrationSkugrantwhitelistRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportTechintegrationSkugrantwhitelistResponse>(await DoRequestAsync("1.0", "blockchain.bot.techintegration.skugrantwhitelist.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物模型数据上报
         * Summary: 物模型数据上报
         */
        public SendThingDataResponse SendThingData(SendThingDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendThingDataEx(request, headers, runtime);
        }

        /**
         * Description: 物模型数据上报
         * Summary: 物模型数据上报
         */
        public async Task<SendThingDataResponse> SendThingDataAsync(SendThingDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendThingDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 物模型数据上报
         * Summary: 物模型数据上报
         */
        public SendThingDataResponse SendThingDataEx(SendThingDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendThingDataResponse>(DoRequest("1.0", "blockchain.bot.thing.data.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物模型数据上报
         * Summary: 物模型数据上报
         */
        public async Task<SendThingDataResponse> SendThingDataExAsync(SendThingDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendThingDataResponse>(await DoRequestAsync("1.0", "blockchain.bot.thing.data.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付芯证书授权信息查询
         * Summary: 支付芯证书授权信息查询
         */
        public QueryTechintegrationSkugrantstockinfoResponse QueryTechintegrationSkugrantstockinfo(QueryTechintegrationSkugrantstockinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTechintegrationSkugrantstockinfoEx(request, headers, runtime);
        }

        /**
         * Description: 支付芯证书授权信息查询
         * Summary: 支付芯证书授权信息查询
         */
        public async Task<QueryTechintegrationSkugrantstockinfoResponse> QueryTechintegrationSkugrantstockinfoAsync(QueryTechintegrationSkugrantstockinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTechintegrationSkugrantstockinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付芯证书授权信息查询
         * Summary: 支付芯证书授权信息查询
         */
        public QueryTechintegrationSkugrantstockinfoResponse QueryTechintegrationSkugrantstockinfoEx(QueryTechintegrationSkugrantstockinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTechintegrationSkugrantstockinfoResponse>(DoRequest("1.0", "blockchain.bot.techintegration.skugrantstockinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付芯证书授权信息查询
         * Summary: 支付芯证书授权信息查询
         */
        public async Task<QueryTechintegrationSkugrantstockinfoResponse> QueryTechintegrationSkugrantstockinfoExAsync(QueryTechintegrationSkugrantstockinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTechintegrationSkugrantstockinfoResponse>(await DoRequestAsync("1.0", "blockchain.bot.techintegration.skugrantstockinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 整合目前的设备数据、汇总数据、业务数据、无主体数据、标签数据上报接口
         * Summary: 事件数据上报整合接口
         */
        public SendEventDataResponse SendEventData(SendEventDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SendEventDataEx(request, headers, runtime);
        }

        /**
         * Description: 整合目前的设备数据、汇总数据、业务数据、无主体数据、标签数据上报接口
         * Summary: 事件数据上报整合接口
         */
        public async Task<SendEventDataResponse> SendEventDataAsync(SendEventDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SendEventDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 整合目前的设备数据、汇总数据、业务数据、无主体数据、标签数据上报接口
         * Summary: 事件数据上报整合接口
         */
        public SendEventDataResponse SendEventDataEx(SendEventDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendEventDataResponse>(DoRequest("1.0", "blockchain.bot.event.data.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 整合目前的设备数据、汇总数据、业务数据、无主体数据、标签数据上报接口
         * Summary: 事件数据上报整合接口
         */
        public async Task<SendEventDataResponse> SendEventDataExAsync(SendEventDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SendEventDataResponse>(await DoRequestAsync("1.0", "blockchain.bot.event.data.send", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
