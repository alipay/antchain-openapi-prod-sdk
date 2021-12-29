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
                        {"sdk_version", "1.6.53"},
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
                        {"sdk_version", "1.6.53"},
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

    }
}
