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
                        {"sdk_version", "1.3.16"},
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
                        {"sdk_version", "1.3.16"},
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

    }
}
