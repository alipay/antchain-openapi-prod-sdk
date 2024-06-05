// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0.Models;

namespace AntChain.SDK.Ak_dc040d759c7a442f89b4b6590b1e39a0
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_dc040d759c7a442f89b4b6590b1e39a0"},
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_dc040d759c7a442f89b4b6590b1e39a0"},
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
         * Description: IoT设备平台-设备上链
         * Summary: IoT设备平台-设备上链
         */
        public OperateBlockchainBotIotbasicDevicecollectResponse OperateBlockchainBotIotbasicDevicecollect(OperateBlockchainBotIotbasicDevicecollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateBlockchainBotIotbasicDevicecollectEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备上链
         * Summary: IoT设备平台-设备上链
         */
        public async Task<OperateBlockchainBotIotbasicDevicecollectResponse> OperateBlockchainBotIotbasicDevicecollectAsync(OperateBlockchainBotIotbasicDevicecollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateBlockchainBotIotbasicDevicecollectExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-设备上链
         * Summary: IoT设备平台-设备上链
         */
        public OperateBlockchainBotIotbasicDevicecollectResponse OperateBlockchainBotIotbasicDevicecollectEx(OperateBlockchainBotIotbasicDevicecollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateBlockchainBotIotbasicDevicecollectResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.devicecollect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-设备上链
         * Summary: IoT设备平台-设备上链
         */
        public async Task<OperateBlockchainBotIotbasicDevicecollectResponse> OperateBlockchainBotIotbasicDevicecollectExAsync(OperateBlockchainBotIotbasicDevicecollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateBlockchainBotIotbasicDevicecollectResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.devicecollect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-批量数据上链
         * Summary: IoT设备平台-批量数据上链
         */
        public OperateBlockchainBotIotbasicBatchcollectResponse OperateBlockchainBotIotbasicBatchcollect(OperateBlockchainBotIotbasicBatchcollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateBlockchainBotIotbasicBatchcollectEx(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-批量数据上链
         * Summary: IoT设备平台-批量数据上链
         */
        public async Task<OperateBlockchainBotIotbasicBatchcollectResponse> OperateBlockchainBotIotbasicBatchcollectAsync(OperateBlockchainBotIotbasicBatchcollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateBlockchainBotIotbasicBatchcollectExAsync(request, headers, runtime);
        }

        /**
         * Description: IoT设备平台-批量数据上链
         * Summary: IoT设备平台-批量数据上链
         */
        public OperateBlockchainBotIotbasicBatchcollectResponse OperateBlockchainBotIotbasicBatchcollectEx(OperateBlockchainBotIotbasicBatchcollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateBlockchainBotIotbasicBatchcollectResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.batchcollect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: IoT设备平台-批量数据上链
         * Summary: IoT设备平台-批量数据上链
         */
        public async Task<OperateBlockchainBotIotbasicBatchcollectResponse> OperateBlockchainBotIotbasicBatchcollectExAsync(OperateBlockchainBotIotbasicBatchcollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateBlockchainBotIotbasicBatchcollectResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.batchcollect.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上链数据分页查询
         * Summary: 上链数据分页查询
         */
        public QueryBlockchainBotIotbasicDevicecollectResponse QueryBlockchainBotIotbasicDevicecollect(QueryBlockchainBotIotbasicDevicecollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotIotbasicDevicecollectEx(request, headers, runtime);
        }

        /**
         * Description: 上链数据分页查询
         * Summary: 上链数据分页查询
         */
        public async Task<QueryBlockchainBotIotbasicDevicecollectResponse> QueryBlockchainBotIotbasicDevicecollectAsync(QueryBlockchainBotIotbasicDevicecollectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotIotbasicDevicecollectExAsync(request, headers, runtime);
        }

        /**
         * Description: 上链数据分页查询
         * Summary: 上链数据分页查询
         */
        public QueryBlockchainBotIotbasicDevicecollectResponse QueryBlockchainBotIotbasicDevicecollectEx(QueryBlockchainBotIotbasicDevicecollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotbasicDevicecollectResponse>(DoRequest("1.0", "blockchain.bot.iotbasic.devicecollect.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上链数据分页查询
         * Summary: 上链数据分页查询
         */
        public async Task<QueryBlockchainBotIotbasicDevicecollectResponse> QueryBlockchainBotIotbasicDevicecollectExAsync(QueryBlockchainBotIotbasicDevicecollectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotIotbasicDevicecollectResponse>(await DoRequestAsync("1.0", "blockchain.bot.iotbasic.devicecollect.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT风险评估服务-出行场景司机
         * Summary: eKYT风险评估服务-出行场景司机
         */
        public QueryAntsecuritytechGatewayEkytDriverResponse QueryAntsecuritytechGatewayEkytDriver(QueryAntsecuritytechGatewayEkytDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntsecuritytechGatewayEkytDriverEx(request, headers, runtime);
        }

        /**
         * Description: eKYT风险评估服务-出行场景司机
         * Summary: eKYT风险评估服务-出行场景司机
         */
        public async Task<QueryAntsecuritytechGatewayEkytDriverResponse> QueryAntsecuritytechGatewayEkytDriverAsync(QueryAntsecuritytechGatewayEkytDriverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntsecuritytechGatewayEkytDriverExAsync(request, headers, runtime);
        }

        /**
         * Description: eKYT风险评估服务-出行场景司机
         * Summary: eKYT风险评估服务-出行场景司机
         */
        public QueryAntsecuritytechGatewayEkytDriverResponse QueryAntsecuritytechGatewayEkytDriverEx(QueryAntsecuritytechGatewayEkytDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsecuritytechGatewayEkytDriverResponse>(DoRequest("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: eKYT风险评估服务-出行场景司机
         * Summary: eKYT风险评估服务-出行场景司机
         */
        public async Task<QueryAntsecuritytechGatewayEkytDriverResponse> QueryAntsecuritytechGatewayEkytDriverExAsync(QueryAntsecuritytechGatewayEkytDriverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntsecuritytechGatewayEkytDriverResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.ekyt.driver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请设备设备密钥
         * Summary: 申请设备设备密钥
         */
        public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse ApplyAntsecuritytechGatewayIifaaDevicekey(ApplyAntsecuritytechGatewayIifaaDevicekeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyAntsecuritytechGatewayIifaaDevicekeyEx(request, headers, runtime);
        }

        /**
         * Description: 申请设备设备密钥
         * Summary: 申请设备设备密钥
         */
        public async Task<ApplyAntsecuritytechGatewayIifaaDevicekeyResponse> ApplyAntsecuritytechGatewayIifaaDevicekeyAsync(ApplyAntsecuritytechGatewayIifaaDevicekeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyAntsecuritytechGatewayIifaaDevicekeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 申请设备设备密钥
         * Summary: 申请设备设备密钥
         */
        public ApplyAntsecuritytechGatewayIifaaDevicekeyResponse ApplyAntsecuritytechGatewayIifaaDevicekeyEx(ApplyAntsecuritytechGatewayIifaaDevicekeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntsecuritytechGatewayIifaaDevicekeyResponse>(DoRequest("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 申请设备设备密钥
         * Summary: 申请设备设备密钥
         */
        public async Task<ApplyAntsecuritytechGatewayIifaaDevicekeyResponse> ApplyAntsecuritytechGatewayIifaaDevicekeyExAsync(ApplyAntsecuritytechGatewayIifaaDevicekeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyAntsecuritytechGatewayIifaaDevicekeyResponse>(await DoRequestAsync("1.0", "antsecuritytech.gateway.iifaa.devicekey.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商创建物模型
         * Summary: iotbasic-设备厂商创建物模型
         */
        public CreateBlockchainBotDevicecorpThingmodelResponse CreateBlockchainBotDevicecorpThingmodel(CreateBlockchainBotDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商创建物模型
         * Summary: iotbasic-设备厂商创建物模型
         */
        public async Task<CreateBlockchainBotDevicecorpThingmodelResponse> CreateBlockchainBotDevicecorpThingmodelAsync(CreateBlockchainBotDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBlockchainBotDevicecorpThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商创建物模型
         * Summary: iotbasic-设备厂商创建物模型
         */
        public CreateBlockchainBotDevicecorpThingmodelResponse CreateBlockchainBotDevicecorpThingmodelEx(CreateBlockchainBotDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBotDevicecorpThingmodelResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.thingmodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商创建物模型
         * Summary: iotbasic-设备厂商创建物模型
         */
        public async Task<CreateBlockchainBotDevicecorpThingmodelResponse> CreateBlockchainBotDevicecorpThingmodelExAsync(CreateBlockchainBotDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBlockchainBotDevicecorpThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.thingmodel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商删除物模型
         * Summary: iotbasic-设备厂商删除物模型
         */
        public DeleteBlockchainBotDevicecorpThingmodelResponse DeleteBlockchainBotDevicecorpThingmodel(DeleteBlockchainBotDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商删除物模型
         * Summary: iotbasic-设备厂商删除物模型
         */
        public async Task<DeleteBlockchainBotDevicecorpThingmodelResponse> DeleteBlockchainBotDevicecorpThingmodelAsync(DeleteBlockchainBotDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteBlockchainBotDevicecorpThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商删除物模型
         * Summary: iotbasic-设备厂商删除物模型
         */
        public DeleteBlockchainBotDevicecorpThingmodelResponse DeleteBlockchainBotDevicecorpThingmodelEx(DeleteBlockchainBotDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBlockchainBotDevicecorpThingmodelResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.thingmodel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商删除物模型
         * Summary: iotbasic-设备厂商删除物模型
         */
        public async Task<DeleteBlockchainBotDevicecorpThingmodelResponse> DeleteBlockchainBotDevicecorpThingmodelExAsync(DeleteBlockchainBotDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBlockchainBotDevicecorpThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.thingmodel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商发布物模型
         * Summary: iotbasic-设备厂商发布物模型
         */
        public PublishBlockchainBotDevicecorpThingmodelResponse PublishBlockchainBotDevicecorpThingmodel(PublishBlockchainBotDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishBlockchainBotDevicecorpThingmodelEx(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商发布物模型
         * Summary: iotbasic-设备厂商发布物模型
         */
        public async Task<PublishBlockchainBotDevicecorpThingmodelResponse> PublishBlockchainBotDevicecorpThingmodelAsync(PublishBlockchainBotDevicecorpThingmodelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishBlockchainBotDevicecorpThingmodelExAsync(request, headers, runtime);
        }

        /**
         * Description: iotbasic-设备厂商发布物模型
         * Summary: iotbasic-设备厂商发布物模型
         */
        public PublishBlockchainBotDevicecorpThingmodelResponse PublishBlockchainBotDevicecorpThingmodelEx(PublishBlockchainBotDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishBlockchainBotDevicecorpThingmodelResponse>(DoRequest("1.0", "blockchain.bot.devicecorp.thingmodel.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: iotbasic-设备厂商发布物模型
         * Summary: iotbasic-设备厂商发布物模型
         */
        public async Task<PublishBlockchainBotDevicecorpThingmodelResponse> PublishBlockchainBotDevicecorpThingmodelExAsync(PublishBlockchainBotDevicecorpThingmodelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishBlockchainBotDevicecorpThingmodelResponse>(await DoRequestAsync("1.0", "blockchain.bot.devicecorp.thingmodel.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约链接获取
         * Summary: 代扣签约链接获取
         */
        public SignBlockchainBotDigitalkeyWithholdResponse SignBlockchainBotDigitalkeyWithhold(SignBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SignBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约链接获取
         * Summary: 代扣签约链接获取
         */
        public async Task<SignBlockchainBotDigitalkeyWithholdResponse> SignBlockchainBotDigitalkeyWithholdAsync(SignBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SignBlockchainBotDigitalkeyWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约链接获取
         * Summary: 代扣签约链接获取
         */
        public SignBlockchainBotDigitalkeyWithholdResponse SignBlockchainBotDigitalkeyWithholdEx(SignBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignBlockchainBotDigitalkeyWithholdResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withhold.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约链接获取
         * Summary: 代扣签约链接获取
         */
        public async Task<SignBlockchainBotDigitalkeyWithholdResponse> SignBlockchainBotDigitalkeyWithholdExAsync(SignBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SignBlockchainBotDigitalkeyWithholdResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withhold.sign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约解除
         * Summary: 代扣签约解除
         */
        public UnbindBlockchainBotDigitalkeyWithholdResponse UnbindBlockchainBotDigitalkeyWithhold(UnbindBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 代扣签约解除
         * Summary: 代扣签约解除
         */
        public async Task<UnbindBlockchainBotDigitalkeyWithholdResponse> UnbindBlockchainBotDigitalkeyWithholdAsync(UnbindBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindBlockchainBotDigitalkeyWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣签约解除
         * Summary: 代扣签约解除
         */
        public UnbindBlockchainBotDigitalkeyWithholdResponse UnbindBlockchainBotDigitalkeyWithholdEx(UnbindBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindBlockchainBotDigitalkeyWithholdResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withhold.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣签约解除
         * Summary: 代扣签约解除
         */
        public async Task<UnbindBlockchainBotDigitalkeyWithholdResponse> UnbindBlockchainBotDigitalkeyWithholdExAsync(UnbindBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindBlockchainBotDigitalkeyWithholdResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withhold.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付
         * Summary: 代扣支付
         */
        public PayBlockchainBotDigitalkeyWithholdResponse PayBlockchainBotDigitalkeyWithhold(PayBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PayBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 代扣支付
         * Summary: 代扣支付
         */
        public async Task<PayBlockchainBotDigitalkeyWithholdResponse> PayBlockchainBotDigitalkeyWithholdAsync(PayBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PayBlockchainBotDigitalkeyWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣支付
         * Summary: 代扣支付
         */
        public PayBlockchainBotDigitalkeyWithholdResponse PayBlockchainBotDigitalkeyWithholdEx(PayBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayBlockchainBotDigitalkeyWithholdResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withhold.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付
         * Summary: 代扣支付
         */
        public async Task<PayBlockchainBotDigitalkeyWithholdResponse> PayBlockchainBotDigitalkeyWithholdExAsync(PayBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PayBlockchainBotDigitalkeyWithholdResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withhold.pay", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付退款 
         * Summary: 代扣支付退款 
         */
        public RefuseBlockchainBotDigitalkeyWithholdResponse RefuseBlockchainBotDigitalkeyWithhold(RefuseBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RefuseBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 代扣支付退款 
         * Summary: 代扣支付退款 
         */
        public async Task<RefuseBlockchainBotDigitalkeyWithholdResponse> RefuseBlockchainBotDigitalkeyWithholdAsync(RefuseBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RefuseBlockchainBotDigitalkeyWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣支付退款 
         * Summary: 代扣支付退款 
         */
        public RefuseBlockchainBotDigitalkeyWithholdResponse RefuseBlockchainBotDigitalkeyWithholdEx(RefuseBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseBlockchainBotDigitalkeyWithholdResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withhold.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣支付退款 
         * Summary: 代扣支付退款 
         */
        public async Task<RefuseBlockchainBotDigitalkeyWithholdResponse> RefuseBlockchainBotDigitalkeyWithholdExAsync(RefuseBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RefuseBlockchainBotDigitalkeyWithholdResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withhold.refuse", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣协议查询
         * Summary: 代扣协议查询
         */
        public QueryBlockchainBotDigitalkeyWithholdResponse QueryBlockchainBotDigitalkeyWithhold(QueryBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 代扣协议查询
         * Summary: 代扣协议查询
         */
        public async Task<QueryBlockchainBotDigitalkeyWithholdResponse> QueryBlockchainBotDigitalkeyWithholdAsync(QueryBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBlockchainBotDigitalkeyWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣协议查询
         * Summary: 代扣协议查询
         */
        public QueryBlockchainBotDigitalkeyWithholdResponse QueryBlockchainBotDigitalkeyWithholdEx(QueryBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotDigitalkeyWithholdResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withhold.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣协议查询
         * Summary: 代扣协议查询
         */
        public async Task<QueryBlockchainBotDigitalkeyWithholdResponse> QueryBlockchainBotDigitalkeyWithholdExAsync(QueryBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBlockchainBotDigitalkeyWithholdResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withhold.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣撤销
         * Summary: 代扣撤销
         */
        public CancelBlockchainBotDigitalkeyWithholdResponse CancelBlockchainBotDigitalkeyWithhold(CancelBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 代扣撤销
         * Summary: 代扣撤销
         */
        public async Task<CancelBlockchainBotDigitalkeyWithholdResponse> CancelBlockchainBotDigitalkeyWithholdAsync(CancelBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelBlockchainBotDigitalkeyWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣撤销
         * Summary: 代扣撤销
         */
        public CancelBlockchainBotDigitalkeyWithholdResponse CancelBlockchainBotDigitalkeyWithholdEx(CancelBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBlockchainBotDigitalkeyWithholdResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withhold.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣撤销
         * Summary: 代扣撤销
         */
        public async Task<CancelBlockchainBotDigitalkeyWithholdResponse> CancelBlockchainBotDigitalkeyWithholdExAsync(CancelBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBlockchainBotDigitalkeyWithholdResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withhold.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣扣款前预通知
         * Summary: 代扣扣款前预通知
         */
        public NotifyBlockchainBotDigitalkeyWithholdResponse NotifyBlockchainBotDigitalkeyWithhold(NotifyBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return NotifyBlockchainBotDigitalkeyWithholdEx(request, headers, runtime);
        }

        /**
         * Description: 代扣扣款前预通知
         * Summary: 代扣扣款前预通知
         */
        public async Task<NotifyBlockchainBotDigitalkeyWithholdResponse> NotifyBlockchainBotDigitalkeyWithholdAsync(NotifyBlockchainBotDigitalkeyWithholdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await NotifyBlockchainBotDigitalkeyWithholdExAsync(request, headers, runtime);
        }

        /**
         * Description: 代扣扣款前预通知
         * Summary: 代扣扣款前预通知
         */
        public NotifyBlockchainBotDigitalkeyWithholdResponse NotifyBlockchainBotDigitalkeyWithholdEx(NotifyBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyBlockchainBotDigitalkeyWithholdResponse>(DoRequest("1.0", "blockchain.bot.digitalkey.withhold.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 代扣扣款前预通知
         * Summary: 代扣扣款前预通知
         */
        public async Task<NotifyBlockchainBotDigitalkeyWithholdResponse> NotifyBlockchainBotDigitalkeyWithholdExAsync(NotifyBlockchainBotDigitalkeyWithholdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<NotifyBlockchainBotDigitalkeyWithholdResponse>(await DoRequestAsync("1.0", "blockchain.bot.digitalkey.withhold.notify", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
