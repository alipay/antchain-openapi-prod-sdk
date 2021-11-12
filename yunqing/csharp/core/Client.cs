// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.YUNQING.Models;

namespace AntChain.SDK.YUNQING
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
                        {"sdk_version", "3.12.4"},
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
                        {"sdk_version", "3.12.4"},
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
         * Description: 创建一个运维单。
         * Summary: 创建一个运维单。
         */
        public CreateAppopsResponse CreateAppops(CreateAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个运维单。
         * Summary: 创建一个运维单。
         */
        public async Task<CreateAppopsResponse> CreateAppopsAsync(CreateAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个运维单。
         * Summary: 创建一个运维单。
         */
        public CreateAppopsResponse CreateAppopsEx(CreateAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppopsResponse>(DoRequest("1.0", "yunyou.yunqing.appops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个运维单。
         * Summary: 创建一个运维单。
         */
        public async Task<CreateAppopsResponse> CreateAppopsExAsync(CreateAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppopsResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.appops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个运维单详情。
         * Summary: 查询一个运维单详情。
         */
        public GetAppopsResponse GetAppops(GetAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个运维单详情。
         * Summary: 查询一个运维单详情。
         */
        public async Task<GetAppopsResponse> GetAppopsAsync(GetAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个运维单详情。
         * Summary: 查询一个运维单详情。
         */
        public GetAppopsResponse GetAppopsEx(GetAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppopsResponse>(DoRequest("1.0", "yunyou.yunqing.appops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个运维单详情。
         * Summary: 查询一个运维单详情。
         */
        public async Task<GetAppopsResponse> GetAppopsExAsync(GetAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppopsResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.appops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
         * Summary: 重试一个运维单。
         */
        public RetryAppopsResponse RetryAppops(RetryAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
         * Summary: 重试一个运维单。
         */
        public async Task<RetryAppopsResponse> RetryAppopsAsync(RetryAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
         * Summary: 重试一个运维单。
         */
        public RetryAppopsResponse RetryAppopsEx(RetryAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAppopsResponse>(DoRequest("1.0", "yunyou.yunqing.appops.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试一个运维单，仅当运维单状态为FAILED时可执行。
         * Summary: 重试一个运维单。
         */
        public async Task<RetryAppopsResponse> RetryAppopsExAsync(RetryAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAppopsResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.appops.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消一个发布单。
         * Summary: 取消一个发布单。
         */
        public CancelAppopsResponse CancelAppops(CancelAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 取消一个发布单。
         * Summary: 取消一个发布单。
         */
        public async Task<CancelAppopsResponse> CancelAppopsAsync(CancelAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消一个发布单。
         * Summary: 取消一个发布单。
         */
        public CancelAppopsResponse CancelAppopsEx(CancelAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAppopsResponse>(DoRequest("1.0", "yunyou.yunqing.appops.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消一个发布单。
         * Summary: 取消一个发布单。
         */
        public async Task<CancelAppopsResponse> CancelAppopsExAsync(CancelAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAppopsResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.appops.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 变更应用服务实例集群大小。
         * Summary: 已废弃，勿用！！！
         */
        public ScaleProdinstanceAppserviceResponse ScaleProdinstanceAppservice(ScaleProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ScaleProdinstanceAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 变更应用服务实例集群大小。
         * Summary: 已废弃，勿用！！！
         */
        public async Task<ScaleProdinstanceAppserviceResponse> ScaleProdinstanceAppserviceAsync(ScaleProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ScaleProdinstanceAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 变更应用服务实例集群大小。
         * Summary: 已废弃，勿用！！！
         */
        public ScaleProdinstanceAppserviceResponse ScaleProdinstanceAppserviceEx(ScaleProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleProdinstanceAppserviceResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scale", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 变更应用服务实例集群大小。
         * Summary: 已废弃，勿用！！！
         */
        public async Task<ScaleProdinstanceAppserviceResponse> ScaleProdinstanceAppserviceExAsync(ScaleProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleProdinstanceAppserviceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.appservice.scale", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取环境列表。
         * Summary: 获取环境列表。
         */
        public ListEnvResponse ListEnv(ListEnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListEnvEx(request, headers, runtime);
        }

        /**
         * Description: 获取环境列表。
         * Summary: 获取环境列表。
         */
        public async Task<ListEnvResponse> ListEnvAsync(ListEnvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListEnvExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取环境列表。
         * Summary: 获取环境列表。
         */
        public ListEnvResponse ListEnvEx(ListEnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEnvResponse>(DoRequest("1.0", "yunyou.yunqing.env.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取环境列表。
         * Summary: 获取环境列表。
         */
        public async Task<ListEnvResponse> ListEnvExAsync(ListEnvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEnvResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.env.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用服务实例详情信息。
         * Summary: 获取应用服务实例详情信息。
         */
        public GetProdinstanceAppserviceResponse GetProdinstanceAppservice(GetProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetProdinstanceAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用服务实例详情信息。
         * Summary: 获取应用服务实例详情信息。
         */
        public async Task<GetProdinstanceAppserviceResponse> GetProdinstanceAppserviceAsync(GetProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetProdinstanceAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用服务实例详情信息。
         * Summary: 获取应用服务实例详情信息。
         */
        public GetProdinstanceAppserviceResponse GetProdinstanceAppserviceEx(GetProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetProdinstanceAppserviceResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.appservice.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用服务实例详情信息。
         * Summary: 获取应用服务实例详情信息。
         */
        public async Task<GetProdinstanceAppserviceResponse> GetProdinstanceAppserviceExAsync(GetProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetProdinstanceAppserviceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.appservice.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品实例。
         * Summary: 查询产品实例。
         */
        public QueryProdinstanceResponse QueryProdinstance(QueryProdinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryProdinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询产品实例。
         * Summary: 查询产品实例。
         */
        public async Task<QueryProdinstanceResponse> QueryProdinstanceAsync(QueryProdinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryProdinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询产品实例。
         * Summary: 查询产品实例。
         */
        public QueryProdinstanceResponse QueryProdinstanceEx(QueryProdinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProdinstanceResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品实例。
         * Summary: 查询产品实例。
         */
        public async Task<QueryProdinstanceResponse> QueryProdinstanceExAsync(QueryProdinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProdinstanceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卸载应用服务实例。
         * Summary: 卸载应用服务实例。
         */
        public UninstallProdinstanceAppserviceResponse UninstallProdinstanceAppservice(UninstallProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UninstallProdinstanceAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 卸载应用服务实例。
         * Summary: 卸载应用服务实例。
         */
        public async Task<UninstallProdinstanceAppserviceResponse> UninstallProdinstanceAppserviceAsync(UninstallProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UninstallProdinstanceAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 卸载应用服务实例。
         * Summary: 卸载应用服务实例。
         */
        public UninstallProdinstanceAppserviceResponse UninstallProdinstanceAppserviceEx(UninstallProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UninstallProdinstanceAppserviceResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.appservice.uninstall", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卸载应用服务实例。
         * Summary: 卸载应用服务实例。
         */
        public async Task<UninstallProdinstanceAppserviceResponse> UninstallProdinstanceAppserviceExAsync(UninstallProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UninstallProdinstanceAppserviceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.appservice.uninstall", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建部署单元实例
         * Summary: 创建部署单元实例
         */
        public CreateProdinstanceDeployunitResponse CreateProdinstanceDeployunit(CreateProdinstanceDeployunitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateProdinstanceDeployunitEx(request, headers, runtime);
        }

        /**
         * Description: 创建部署单元实例
         * Summary: 创建部署单元实例
         */
        public async Task<CreateProdinstanceDeployunitResponse> CreateProdinstanceDeployunitAsync(CreateProdinstanceDeployunitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateProdinstanceDeployunitExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建部署单元实例
         * Summary: 创建部署单元实例
         */
        public CreateProdinstanceDeployunitResponse CreateProdinstanceDeployunitEx(CreateProdinstanceDeployunitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProdinstanceDeployunitResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建部署单元实例
         * Summary: 创建部署单元实例
         */
        public async Task<CreateProdinstanceDeployunitResponse> CreateProdinstanceDeployunitExAsync(CreateProdinstanceDeployunitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProdinstanceDeployunitResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.deployunit.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元实例创建状态
         * Summary: 废弃，勿用！！！
         */
        public QueryUnitinstanceCreationResponse QueryUnitinstanceCreation(QueryUnitinstanceCreationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnitinstanceCreationEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元实例创建状态
         * Summary: 废弃，勿用！！！
         */
        public async Task<QueryUnitinstanceCreationResponse> QueryUnitinstanceCreationAsync(QueryUnitinstanceCreationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnitinstanceCreationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元实例创建状态
         * Summary: 废弃，勿用！！！
         */
        public QueryUnitinstanceCreationResponse QueryUnitinstanceCreationEx(QueryUnitinstanceCreationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnitinstanceCreationResponse>(DoRequest("1.0", "yunyou.yunqing.unitinstance.creation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元实例创建状态
         * Summary: 废弃，勿用！！！
         */
        public async Task<QueryUnitinstanceCreationResponse> QueryUnitinstanceCreationExAsync(QueryUnitinstanceCreationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnitinstanceCreationResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.unitinstance.creation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取部署单元详情
         * Summary: 废弃，勿用！！！
         */
        public GetUnitDetailResponse GetUnitDetail(GetUnitDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUnitDetailEx(request, headers, runtime);
        }

        /**
         * Description: 获取部署单元详情
         * Summary: 废弃，勿用！！！
         */
        public async Task<GetUnitDetailResponse> GetUnitDetailAsync(GetUnitDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUnitDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取部署单元详情
         * Summary: 废弃，勿用！！！
         */
        public GetUnitDetailResponse GetUnitDetailEx(GetUnitDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnitDetailResponse>(DoRequest("1.0", "yunyou.yunqing.unit.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取部署单元详情
         * Summary: 废弃，勿用！！！
         */
        public async Task<GetUnitDetailResponse> GetUnitDetailExAsync(GetUnitDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnitDetailResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.unit.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务实例信息。
         * Summary: 查询应用服务实例信息。
         */
        public QueryProdinstanceAppserviceResponse QueryProdinstanceAppservice(QueryProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryProdinstanceAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务实例信息。
         * Summary: 查询应用服务实例信息。
         */
        public async Task<QueryProdinstanceAppserviceResponse> QueryProdinstanceAppserviceAsync(QueryProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryProdinstanceAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务实例信息。
         * Summary: 查询应用服务实例信息。
         */
        public QueryProdinstanceAppserviceResponse QueryProdinstanceAppserviceEx(QueryProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProdinstanceAppserviceResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.appservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务实例信息。
         * Summary: 查询应用服务实例信息。
         */
        public async Task<QueryProdinstanceAppserviceResponse> QueryProdinstanceAppserviceExAsync(QueryProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryProdinstanceAppserviceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.appservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单元实例信息
         * Summary: 获取单元实例信息
         */
        public GetProdinstanceDeployunitResponse GetProdinstanceDeployunit(GetProdinstanceDeployunitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetProdinstanceDeployunitEx(request, headers, runtime);
        }

        /**
         * Description: 获取单元实例信息
         * Summary: 获取单元实例信息
         */
        public async Task<GetProdinstanceDeployunitResponse> GetProdinstanceDeployunitAsync(GetProdinstanceDeployunitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetProdinstanceDeployunitExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单元实例信息
         * Summary: 获取单元实例信息
         */
        public GetProdinstanceDeployunitResponse GetProdinstanceDeployunitEx(GetProdinstanceDeployunitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetProdinstanceDeployunitResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单元实例信息
         * Summary: 获取单元实例信息
         */
        public async Task<GetProdinstanceDeployunitResponse> GetProdinstanceDeployunitExAsync(GetProdinstanceDeployunitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetProdinstanceDeployunitResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.deployunit.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取产品实例下的部署单元列表。
         * Summary: 获取产品实例下的部署单元列表
         */
        public ListProdinstanceDeployunitResponse ListProdinstanceDeployunit(ListProdinstanceDeployunitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListProdinstanceDeployunitEx(request, headers, runtime);
        }

        /**
         * Description: 获取产品实例下的部署单元列表。
         * Summary: 获取产品实例下的部署单元列表
         */
        public async Task<ListProdinstanceDeployunitResponse> ListProdinstanceDeployunitAsync(ListProdinstanceDeployunitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListProdinstanceDeployunitExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取产品实例下的部署单元列表。
         * Summary: 获取产品实例下的部署单元列表
         */
        public ListProdinstanceDeployunitResponse ListProdinstanceDeployunitEx(ListProdinstanceDeployunitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListProdinstanceDeployunitResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取产品实例下的部署单元列表。
         * Summary: 获取产品实例下的部署单元列表
         */
        public async Task<ListProdinstanceDeployunitResponse> ListProdinstanceDeployunitExAsync(ListProdinstanceDeployunitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListProdinstanceDeployunitResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.deployunit.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定应用服务扩容。
         * Summary: 指定应用服务扩容。
         */
        public ScaleoutProdinstanceAppserviceResponse ScaleoutProdinstanceAppservice(ScaleoutProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ScaleoutProdinstanceAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 指定应用服务扩容。
         * Summary: 指定应用服务扩容。
         */
        public async Task<ScaleoutProdinstanceAppserviceResponse> ScaleoutProdinstanceAppserviceAsync(ScaleoutProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ScaleoutProdinstanceAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 指定应用服务扩容。
         * Summary: 指定应用服务扩容。
         */
        public ScaleoutProdinstanceAppserviceResponse ScaleoutProdinstanceAppserviceEx(ScaleoutProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleoutProdinstanceAppserviceResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scaleout", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定应用服务扩容。
         * Summary: 指定应用服务扩容。
         */
        public async Task<ScaleoutProdinstanceAppserviceResponse> ScaleoutProdinstanceAppserviceExAsync(ScaleoutProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleoutProdinstanceAppserviceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.appservice.scaleout", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户授权信息
         * Summary: 查询用户授权信息
         */
        public QueryAuthResponse QueryAuth(QueryAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuthEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户授权信息
         * Summary: 查询用户授权信息
         */
        public async Task<QueryAuthResponse> QueryAuthAsync(QueryAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户授权信息
         * Summary: 查询用户授权信息
         */
        public QueryAuthResponse QueryAuthEx(QueryAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthResponse>(DoRequest("1.0", "yunyou.yunqing.auth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户授权信息
         * Summary: 查询用户授权信息
         */
        public async Task<QueryAuthResponse> QueryAuthExAsync(QueryAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuthResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.auth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入用户授权
         * Summary: 导入用户授权
         */
        public ImportAuthResponse ImportAuth(ImportAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportAuthEx(request, headers, runtime);
        }

        /**
         * Description: 导入用户授权
         * Summary: 导入用户授权
         */
        public async Task<ImportAuthResponse> ImportAuthAsync(ImportAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入用户授权
         * Summary: 导入用户授权
         */
        public ImportAuthResponse ImportAuthEx(ImportAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAuthResponse>(DoRequest("1.0", "yunyou.yunqing.auth.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入用户授权
         * Summary: 导入用户授权
         */
        public async Task<ImportAuthResponse> ImportAuthExAsync(ImportAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportAuthResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.auth.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 系统信息
         * Summary: 获取Local系统信息
         */
        public GetSystemResponse GetSystem(GetSystemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSystemEx(request, headers, runtime);
        }

        /**
         * Description: 系统信息
         * Summary: 获取Local系统信息
         */
        public async Task<GetSystemResponse> GetSystemAsync(GetSystemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSystemExAsync(request, headers, runtime);
        }

        /**
         * Description: 系统信息
         * Summary: 获取Local系统信息
         */
        public GetSystemResponse GetSystemEx(GetSystemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSystemResponse>(DoRequest("1.0", "yunyou.yunqing.system.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 系统信息
         * Summary: 获取Local系统信息
         */
        public async Task<GetSystemResponse> GetSystemExAsync(GetSystemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSystemResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.system.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用服务缩容。
         * Summary: 应用服务缩容。
         */
        public ScaleinProdinstanceAppserviceResponse ScaleinProdinstanceAppservice(ScaleinProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ScaleinProdinstanceAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 应用服务缩容。
         * Summary: 应用服务缩容。
         */
        public async Task<ScaleinProdinstanceAppserviceResponse> ScaleinProdinstanceAppserviceAsync(ScaleinProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ScaleinProdinstanceAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用服务缩容。
         * Summary: 应用服务缩容。
         */
        public ScaleinProdinstanceAppserviceResponse ScaleinProdinstanceAppserviceEx(ScaleinProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleinProdinstanceAppserviceResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.appservice.scalein", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用服务缩容。
         * Summary: 应用服务缩容。
         */
        public async Task<ScaleinProdinstanceAppserviceResponse> ScaleinProdinstanceAppserviceExAsync(ScaleinProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleinProdinstanceAppserviceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.appservice.scalein", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
         * Summary: 查询一个环境内的全部应用服务实例信息。
         */
        public AllProdinstanceAppserviceResponse AllProdinstanceAppservice(AllProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllProdinstanceAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
         * Summary: 查询一个环境内的全部应用服务实例信息。
         */
        public async Task<AllProdinstanceAppserviceResponse> AllProdinstanceAppserviceAsync(AllProdinstanceAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllProdinstanceAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
         * Summary: 查询一个环境内的全部应用服务实例信息。
         */
        public AllProdinstanceAppserviceResponse AllProdinstanceAppserviceEx(AllProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllProdinstanceAppserviceResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.appservice.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个环境内的全部应用服务实例信息，仅供监控调用。
         * Summary: 查询一个环境内的全部应用服务实例信息。
         */
        public async Task<AllProdinstanceAppserviceResponse> AllProdinstanceAppserviceExAsync(AllProdinstanceAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllProdinstanceAppserviceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.appservice.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入产品码，自动创建一个测试单，并开始执行
         * Summary: 创建一个自动巡检测试单
         */
        public CreateAutotestopsResponse CreateAutotestops(CreateAutotestopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAutotestopsEx(request, headers, runtime);
        }

        /**
         * Description: 输入产品码，自动创建一个测试单，并开始执行
         * Summary: 创建一个自动巡检测试单
         */
        public async Task<CreateAutotestopsResponse> CreateAutotestopsAsync(CreateAutotestopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAutotestopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 输入产品码，自动创建一个测试单，并开始执行
         * Summary: 创建一个自动巡检测试单
         */
        public CreateAutotestopsResponse CreateAutotestopsEx(CreateAutotestopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAutotestopsResponse>(DoRequest("1.0", "yunyou.yunqing.autotestops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 输入产品码，自动创建一个测试单，并开始执行
         * Summary: 创建一个自动巡检测试单
         */
        public async Task<CreateAutotestopsResponse> CreateAutotestopsExAsync(CreateAutotestopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAutotestopsResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.autotestops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取测试单状态和case
         * Summary: 获取测试单详情
         */
        public GetAutotestopsResponse GetAutotestops(GetAutotestopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAutotestopsEx(request, headers, runtime);
        }

        /**
         * Description: 获取测试单状态和case
         * Summary: 获取测试单详情
         */
        public async Task<GetAutotestopsResponse> GetAutotestopsAsync(GetAutotestopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAutotestopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取测试单状态和case
         * Summary: 获取测试单详情
         */
        public GetAutotestopsResponse GetAutotestopsEx(GetAutotestopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAutotestopsResponse>(DoRequest("1.0", "yunyou.yunqing.autotestops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取测试单状态和case
         * Summary: 获取测试单详情
         */
        public async Task<GetAutotestopsResponse> GetAutotestopsExAsync(GetAutotestopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAutotestopsResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.autotestops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基线数据回流
         * Summary: 基线数据回流
         */
        public ExportBaselineResponse ExportBaseline(ExportBaselineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportBaselineEx(request, headers, runtime);
        }

        /**
         * Description: 基线数据回流
         * Summary: 基线数据回流
         */
        public async Task<ExportBaselineResponse> ExportBaselineAsync(ExportBaselineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportBaselineExAsync(request, headers, runtime);
        }

        /**
         * Description: 基线数据回流
         * Summary: 基线数据回流
         */
        public ExportBaselineResponse ExportBaselineEx(ExportBaselineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportBaselineResponse>(DoRequest("1.0", "yunyou.yunqing.baseline.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基线数据回流
         * Summary: 基线数据回流
         */
        public async Task<ExportBaselineResponse> ExportBaselineExAsync(ExportBaselineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportBaselineResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.baseline.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个发布单
         * Summary: 创建一个发布单
         */
        public CreateAppdeployResponse CreateAppdeploy(CreateAppdeployRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppdeployEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个发布单
         * Summary: 创建一个发布单
         */
        public async Task<CreateAppdeployResponse> CreateAppdeployAsync(CreateAppdeployRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppdeployExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个发布单
         * Summary: 创建一个发布单
         */
        public CreateAppdeployResponse CreateAppdeployEx(CreateAppdeployRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppdeployResponse>(DoRequest("1.0", "yunyou.yunqing.appdeploy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个发布单
         * Summary: 创建一个发布单
         */
        public async Task<CreateAppdeployResponse> CreateAppdeployExAsync(CreateAppdeployRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppdeployResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.appdeploy.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境中的解决方案实例
         * Summary: 查询环境中的解决方案实例
         */
        public QuerySolutioninstanceResponse QuerySolutioninstance(QuerySolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySolutioninstanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询环境中的解决方案实例
         * Summary: 查询环境中的解决方案实例
         */
        public async Task<QuerySolutioninstanceResponse> QuerySolutioninstanceAsync(QuerySolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySolutioninstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询环境中的解决方案实例
         * Summary: 查询环境中的解决方案实例
         */
        public QuerySolutioninstanceResponse QuerySolutioninstanceEx(QuerySolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutioninstanceResponse>(DoRequest("1.0", "yunyou.yunqing.solutioninstance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境中的解决方案实例
         * Summary: 查询环境中的解决方案实例
         */
        public async Task<QuerySolutioninstanceResponse> QuerySolutioninstanceExAsync(QuerySolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutioninstanceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solutioninstance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入解决方案
         * Summary: 导入解决方案
         */
        public ImportSolutioninstanceResponse ImportSolutioninstance(ImportSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportSolutioninstanceEx(request, headers, runtime);
        }

        /**
         * Description: 导入解决方案
         * Summary: 导入解决方案
         */
        public async Task<ImportSolutioninstanceResponse> ImportSolutioninstanceAsync(ImportSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportSolutioninstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入解决方案
         * Summary: 导入解决方案
         */
        public ImportSolutioninstanceResponse ImportSolutioninstanceEx(ImportSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSolutioninstanceResponse>(DoRequest("1.0", "yunyou.yunqing.solutioninstance.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入解决方案
         * Summary: 导入解决方案
         */
        public async Task<ImportSolutioninstanceResponse> ImportSolutioninstanceExAsync(ImportSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSolutioninstanceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solutioninstance.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查解决方案是否可以导入
         * Summary: 检查解决方案是否可以导入
         */
        public CheckSolutioninstanceImportResponse CheckSolutioninstanceImport(CheckSolutioninstanceImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckSolutioninstanceImportEx(request, headers, runtime);
        }

        /**
         * Description: 检查解决方案是否可以导入
         * Summary: 检查解决方案是否可以导入
         */
        public async Task<CheckSolutioninstanceImportResponse> CheckSolutioninstanceImportAsync(CheckSolutioninstanceImportRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckSolutioninstanceImportExAsync(request, headers, runtime);
        }

        /**
         * Description: 检查解决方案是否可以导入
         * Summary: 检查解决方案是否可以导入
         */
        public CheckSolutioninstanceImportResponse CheckSolutioninstanceImportEx(CheckSolutioninstanceImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSolutioninstanceImportResponse>(DoRequest("1.0", "yunyou.yunqing.solutioninstance.import.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查解决方案是否可以导入
         * Summary: 检查解决方案是否可以导入
         */
        public async Task<CheckSolutioninstanceImportResponse> CheckSolutioninstanceImportExAsync(CheckSolutioninstanceImportRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckSolutioninstanceImportResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solutioninstance.import.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 返回解决方案支持的操作列表
         * Summary: 返回解决方案支持的操作列表
         */
        public DescribeSolutioninstanceResponse DescribeSolutioninstance(DescribeSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeSolutioninstanceEx(request, headers, runtime);
        }

        /**
         * Description: 返回解决方案支持的操作列表
         * Summary: 返回解决方案支持的操作列表
         */
        public async Task<DescribeSolutioninstanceResponse> DescribeSolutioninstanceAsync(DescribeSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeSolutioninstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 返回解决方案支持的操作列表
         * Summary: 返回解决方案支持的操作列表
         */
        public DescribeSolutioninstanceResponse DescribeSolutioninstanceEx(DescribeSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeSolutioninstanceResponse>(DoRequest("1.0", "yunyou.yunqing.solutioninstance.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 返回解决方案支持的操作列表
         * Summary: 返回解决方案支持的操作列表
         */
        public async Task<DescribeSolutioninstanceResponse> DescribeSolutioninstanceExAsync(DescribeSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeSolutioninstanceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solutioninstance.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 废弃一个解决方案
         * Summary: 废弃一个解决方案
         */
        public DeprecateSolutioninstanceResponse DeprecateSolutioninstance(DeprecateSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeprecateSolutioninstanceEx(request, headers, runtime);
        }

        /**
         * Description: 废弃一个解决方案
         * Summary: 废弃一个解决方案
         */
        public async Task<DeprecateSolutioninstanceResponse> DeprecateSolutioninstanceAsync(DeprecateSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeprecateSolutioninstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 废弃一个解决方案
         * Summary: 废弃一个解决方案
         */
        public DeprecateSolutioninstanceResponse DeprecateSolutioninstanceEx(DeprecateSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeprecateSolutioninstanceResponse>(DoRequest("1.0", "yunyou.yunqing.solutioninstance.deprecate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 废弃一个解决方案
         * Summary: 废弃一个解决方案
         */
        public async Task<DeprecateSolutioninstanceResponse> DeprecateSolutioninstanceExAsync(DeprecateSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeprecateSolutioninstanceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solutioninstance.deprecate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成一个解决方案
         * Summary: 完成一个解决方案
         */
        public FinishSolutioninstanceResponse FinishSolutioninstance(FinishSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishSolutioninstanceEx(request, headers, runtime);
        }

        /**
         * Description: 完成一个解决方案
         * Summary: 完成一个解决方案
         */
        public async Task<FinishSolutioninstanceResponse> FinishSolutioninstanceAsync(FinishSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishSolutioninstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 完成一个解决方案
         * Summary: 完成一个解决方案
         */
        public FinishSolutioninstanceResponse FinishSolutioninstanceEx(FinishSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishSolutioninstanceResponse>(DoRequest("1.0", "yunyou.yunqing.solutioninstance.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 完成一个解决方案
         * Summary: 完成一个解决方案
         */
        public async Task<FinishSolutioninstanceResponse> FinishSolutioninstanceExAsync(FinishSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishSolutioninstanceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solutioninstance.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: reopen一个解决方案
         * Summary: reopen一个解决方案
         */
        public ReopenSolutioninstanceResponse ReopenSolutioninstance(ReopenSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReopenSolutioninstanceEx(request, headers, runtime);
        }

        /**
         * Description: reopen一个解决方案
         * Summary: reopen一个解决方案
         */
        public async Task<ReopenSolutioninstanceResponse> ReopenSolutioninstanceAsync(ReopenSolutioninstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReopenSolutioninstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: reopen一个解决方案
         * Summary: reopen一个解决方案
         */
        public ReopenSolutioninstanceResponse ReopenSolutioninstanceEx(ReopenSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReopenSolutioninstanceResponse>(DoRequest("1.0", "yunyou.yunqing.solutioninstance.reopen", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: reopen一个解决方案
         * Summary: reopen一个解决方案
         */
        public async Task<ReopenSolutioninstanceResponse> ReopenSolutioninstanceExAsync(ReopenSolutioninstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReopenSolutioninstanceResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solutioninstance.reopen", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入一个云架构
         * Summary: 导入一个云架构
         */
        public ImportEnvMetaResponse ImportEnvMeta(ImportEnvMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportEnvMetaEx(request, headers, runtime);
        }

        /**
         * Description: 导入一个云架构
         * Summary: 导入一个云架构
         */
        public async Task<ImportEnvMetaResponse> ImportEnvMetaAsync(ImportEnvMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportEnvMetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入一个云架构
         * Summary: 导入一个云架构
         */
        public ImportEnvMetaResponse ImportEnvMetaEx(ImportEnvMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportEnvMetaResponse>(DoRequest("1.0", "yunyou.yunqing.env.meta.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入一个云架构
         * Summary: 导入一个云架构
         */
        public async Task<ImportEnvMetaResponse> ImportEnvMetaExAsync(ImportEnvMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportEnvMetaResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.env.meta.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入产品元数据
         * Summary: 导入产品元数据
         */
        public ImportProdMetaResponse ImportProdMeta(ImportProdMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportProdMetaEx(request, headers, runtime);
        }

        /**
         * Description: 导入产品元数据
         * Summary: 导入产品元数据
         */
        public async Task<ImportProdMetaResponse> ImportProdMetaAsync(ImportProdMetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportProdMetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入产品元数据
         * Summary: 导入产品元数据
         */
        public ImportProdMetaResponse ImportProdMetaEx(ImportProdMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportProdMetaResponse>(DoRequest("1.0", "yunyou.yunqing.prod.meta.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入产品元数据
         * Summary: 导入产品元数据
         */
        public async Task<ImportProdMetaResponse> ImportProdMetaExAsync(ImportProdMetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportProdMetaResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prod.meta.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卸载部署单元实例
         * Summary: 卸载部署单元实例
         */
        public UninstallProdinstanceDeployunitResponse UninstallProdinstanceDeployunit(UninstallProdinstanceDeployunitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UninstallProdinstanceDeployunitEx(request, headers, runtime);
        }

        /**
         * Description: 卸载部署单元实例
         * Summary: 卸载部署单元实例
         */
        public async Task<UninstallProdinstanceDeployunitResponse> UninstallProdinstanceDeployunitAsync(UninstallProdinstanceDeployunitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UninstallProdinstanceDeployunitExAsync(request, headers, runtime);
        }

        /**
         * Description: 卸载部署单元实例
         * Summary: 卸载部署单元实例
         */
        public UninstallProdinstanceDeployunitResponse UninstallProdinstanceDeployunitEx(UninstallProdinstanceDeployunitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UninstallProdinstanceDeployunitResponse>(DoRequest("1.0", "yunyou.yunqing.prodinstance.deployunit.uninstall", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 卸载部署单元实例
         * Summary: 卸载部署单元实例
         */
        public async Task<UninstallProdinstanceDeployunitResponse> UninstallProdinstanceDeployunitExAsync(UninstallProdinstanceDeployunitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UninstallProdinstanceDeployunitResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.prodinstance.deployunit.uninstall", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 集群内部pod信息查询，巡检使用
         * Summary: 集群内部pod信息查询，巡检使用
         */
        public QueryClusterPodsResponse QueryClusterPods(QueryClusterPodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryClusterPodsEx(request, headers, runtime);
        }

        /**
         * Description: 集群内部pod信息查询，巡检使用
         * Summary: 集群内部pod信息查询，巡检使用
         */
        public async Task<QueryClusterPodsResponse> QueryClusterPodsAsync(QueryClusterPodsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryClusterPodsExAsync(request, headers, runtime);
        }

        /**
         * Description: 集群内部pod信息查询，巡检使用
         * Summary: 集群内部pod信息查询，巡检使用
         */
        public QueryClusterPodsResponse QueryClusterPodsEx(QueryClusterPodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterPodsResponse>(DoRequest("1.0", "yunyou.yunqing.cluster.pods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 集群内部pod信息查询，巡检使用
         * Summary: 集群内部pod信息查询，巡检使用
         */
        public async Task<QueryClusterPodsResponse> QueryClusterPodsExAsync(QueryClusterPodsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterPodsResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.cluster.pods.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 集群内部kubeconfig查询巡检使用
         * Summary: 集群内部kubeconfig查询巡检使用
         */
        public QueryClusterKubeconfigResponse QueryClusterKubeconfig(QueryClusterKubeconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryClusterKubeconfigEx(request, headers, runtime);
        }

        /**
         * Description: 集群内部kubeconfig查询巡检使用
         * Summary: 集群内部kubeconfig查询巡检使用
         */
        public async Task<QueryClusterKubeconfigResponse> QueryClusterKubeconfigAsync(QueryClusterKubeconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryClusterKubeconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 集群内部kubeconfig查询巡检使用
         * Summary: 集群内部kubeconfig查询巡检使用
         */
        public QueryClusterKubeconfigResponse QueryClusterKubeconfigEx(QueryClusterKubeconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterKubeconfigResponse>(DoRequest("1.0", "yunyou.yunqing.cluster.kubeconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 集群内部kubeconfig查询巡检使用
         * Summary: 集群内部kubeconfig查询巡检使用
         */
        public async Task<QueryClusterKubeconfigResponse> QueryClusterKubeconfigExAsync(QueryClusterKubeconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterKubeconfigResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.cluster.kubeconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 【ODP虚商迁移】公有云支持创建公网SLB
        https://aone.alipay.com/req/33161543?from=ak&
         * Summary: 生成公网访问的slb
         */
        public EnableDynamicslbResponse EnableDynamicslb(EnableDynamicslbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableDynamicslbEx(request, headers, runtime);
        }

        /**
         * Description: 【ODP虚商迁移】公有云支持创建公网SLB
        https://aone.alipay.com/req/33161543?from=ak&
         * Summary: 生成公网访问的slb
         */
        public async Task<EnableDynamicslbResponse> EnableDynamicslbAsync(EnableDynamicslbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableDynamicslbExAsync(request, headers, runtime);
        }

        /**
         * Description: 【ODP虚商迁移】公有云支持创建公网SLB
        https://aone.alipay.com/req/33161543?from=ak&
         * Summary: 生成公网访问的slb
         */
        public EnableDynamicslbResponse EnableDynamicslbEx(EnableDynamicslbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableDynamicslbResponse>(DoRequest("1.0", "yunyou.yunqing.dynamicslb.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 【ODP虚商迁移】公有云支持创建公网SLB
        https://aone.alipay.com/req/33161543?from=ak&
         * Summary: 生成公网访问的slb
         */
        public async Task<EnableDynamicslbResponse> EnableDynamicslbExAsync(EnableDynamicslbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableDynamicslbResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.dynamicslb.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除公网SLB
        【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
         * Summary: 移除公网访问的slb
         */
        public DisableDynamicslbResponse DisableDynamicslb(DisableDynamicslbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableDynamicslbEx(request, headers, runtime);
        }

        /**
         * Description: 移除公网SLB
        【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
         * Summary: 移除公网访问的slb
         */
        public async Task<DisableDynamicslbResponse> DisableDynamicslbAsync(DisableDynamicslbRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableDynamicslbExAsync(request, headers, runtime);
        }

        /**
         * Description: 移除公网SLB
        【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
         * Summary: 移除公网访问的slb
         */
        public DisableDynamicslbResponse DisableDynamicslbEx(DisableDynamicslbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableDynamicslbResponse>(DoRequest("1.0", "yunyou.yunqing.dynamicslb.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移除公网SLB
        【ODP虚商迁移】公有云支持创建公网SLB https://aone.alipay.com/req/33161543?from=ak&
         * Summary: 移除公网访问的slb
         */
        public async Task<DisableDynamicslbResponse> DisableDynamicslbExAsync(DisableDynamicslbRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableDynamicslbResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.dynamicslb.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云游环境下应用dns的上下线
         * Summary: 云游环境下应用dns的上下线
         */
        public ExecClusterDnsResponse ExecClusterDns(ExecClusterDnsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecClusterDnsEx(request, headers, runtime);
        }

        /**
         * Description: 云游环境下应用dns的上下线
         * Summary: 云游环境下应用dns的上下线
         */
        public async Task<ExecClusterDnsResponse> ExecClusterDnsAsync(ExecClusterDnsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecClusterDnsExAsync(request, headers, runtime);
        }

        /**
         * Description: 云游环境下应用dns的上下线
         * Summary: 云游环境下应用dns的上下线
         */
        public ExecClusterDnsResponse ExecClusterDnsEx(ExecClusterDnsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecClusterDnsResponse>(DoRequest("1.0", "yunyou.yunqing.cluster.dns.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云游环境下应用dns的上下线
         * Summary: 云游环境下应用dns的上下线
         */
        public async Task<ExecClusterDnsResponse> ExecClusterDnsExAsync(ExecClusterDnsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecClusterDnsResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.cluster.dns.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云游环境下应用容器的下线
         * Summary: 云游环境下应用容器的下线
         */
        public OfflineClusterContainerResponse OfflineClusterContainer(OfflineClusterContainerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineClusterContainerEx(request, headers, runtime);
        }

        /**
         * Description: 云游环境下应用容器的下线
         * Summary: 云游环境下应用容器的下线
         */
        public async Task<OfflineClusterContainerResponse> OfflineClusterContainerAsync(OfflineClusterContainerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineClusterContainerExAsync(request, headers, runtime);
        }

        /**
         * Description: 云游环境下应用容器的下线
         * Summary: 云游环境下应用容器的下线
         */
        public OfflineClusterContainerResponse OfflineClusterContainerEx(OfflineClusterContainerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineClusterContainerResponse>(DoRequest("1.0", "yunyou.yunqing.cluster.container.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云游环境下应用容器的下线
         * Summary: 云游环境下应用容器的下线
         */
        public async Task<OfflineClusterContainerResponse> OfflineClusterContainerExAsync(OfflineClusterContainerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineClusterContainerResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.cluster.container.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云游环境下应用容器的上线
         * Summary: 云游环境下应用容器的上线
         */
        public OnlineClusterContainerResponse OnlineClusterContainer(OnlineClusterContainerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineClusterContainerEx(request, headers, runtime);
        }

        /**
         * Description: 云游环境下应用容器的上线
         * Summary: 云游环境下应用容器的上线
         */
        public async Task<OnlineClusterContainerResponse> OnlineClusterContainerAsync(OnlineClusterContainerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineClusterContainerExAsync(request, headers, runtime);
        }

        /**
         * Description: 云游环境下应用容器的上线
         * Summary: 云游环境下应用容器的上线
         */
        public OnlineClusterContainerResponse OnlineClusterContainerEx(OnlineClusterContainerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineClusterContainerResponse>(DoRequest("1.0", "yunyou.yunqing.cluster.container.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 云游环境下应用容器的上线
         * Summary: 云游环境下应用容器的上线
         */
        public async Task<OnlineClusterContainerResponse> OnlineClusterContainerExAsync(OnlineClusterContainerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineClusterContainerResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.cluster.container.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用启动参数
         * Summary: 查询应用启动参数
         */
        public QueryAppparamResponse QueryAppparam(QueryAppparamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppparamEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用启动参数
         * Summary: 查询应用启动参数
         */
        public async Task<QueryAppparamResponse> QueryAppparamAsync(QueryAppparamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppparamExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用启动参数
         * Summary: 查询应用启动参数
         */
        public QueryAppparamResponse QueryAppparamEx(QueryAppparamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppparamResponse>(DoRequest("1.0", "yunyou.yunqing.appparam.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用启动参数
         * Summary: 查询应用启动参数
         */
        public async Task<QueryAppparamResponse> QueryAppparamExAsync(QueryAppparamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppparamResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.appparam.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品解决方案的所有发布单
         * Summary: 查询产品解决方案的所有发布单
         */
        public PagequerySolutionOpsplanResponse PagequerySolutionOpsplan(PagequerySolutionOpsplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequerySolutionOpsplanEx(request, headers, runtime);
        }

        /**
         * Description: 查询产品解决方案的所有发布单
         * Summary: 查询产品解决方案的所有发布单
         */
        public async Task<PagequerySolutionOpsplanResponse> PagequerySolutionOpsplanAsync(PagequerySolutionOpsplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequerySolutionOpsplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询产品解决方案的所有发布单
         * Summary: 查询产品解决方案的所有发布单
         */
        public PagequerySolutionOpsplanResponse PagequerySolutionOpsplanEx(PagequerySolutionOpsplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequerySolutionOpsplanResponse>(DoRequest("1.0", "yunyou.yunqing.solution.opsplan.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询产品解决方案的所有发布单
         * Summary: 查询产品解决方案的所有发布单
         */
        public async Task<PagequerySolutionOpsplanResponse> PagequerySolutionOpsplanExAsync(PagequerySolutionOpsplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequerySolutionOpsplanResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solution.opsplan.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认解决方案的各种规划
         * Summary: 确认解决方案规划
         */
        public ConfirmSolutionPlanResponse ConfirmSolutionPlan(ConfirmSolutionPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmSolutionPlanEx(request, headers, runtime);
        }

        /**
         * Description: 确认解决方案的各种规划
         * Summary: 确认解决方案规划
         */
        public async Task<ConfirmSolutionPlanResponse> ConfirmSolutionPlanAsync(ConfirmSolutionPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmSolutionPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 确认解决方案的各种规划
         * Summary: 确认解决方案规划
         */
        public ConfirmSolutionPlanResponse ConfirmSolutionPlanEx(ConfirmSolutionPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmSolutionPlanResponse>(DoRequest("1.0", "yunyou.yunqing.solution.plan.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 确认解决方案的各种规划
         * Summary: 确认解决方案规划
         */
        public async Task<ConfirmSolutionPlanResponse> ConfirmSolutionPlanExAsync(ConfirmSolutionPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmSolutionPlanResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solution.plan.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解决方案应用previewtask查询
         * Summary: 解决方案应用previewtask查询
         */
        public QuerySolutionPreviewtaskResponse QuerySolutionPreviewtask(QuerySolutionPreviewtaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySolutionPreviewtaskEx(request, headers, runtime);
        }

        /**
         * Description: 解决方案应用previewtask查询
         * Summary: 解决方案应用previewtask查询
         */
        public async Task<QuerySolutionPreviewtaskResponse> QuerySolutionPreviewtaskAsync(QuerySolutionPreviewtaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySolutionPreviewtaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 解决方案应用previewtask查询
         * Summary: 解决方案应用previewtask查询
         */
        public QuerySolutionPreviewtaskResponse QuerySolutionPreviewtaskEx(QuerySolutionPreviewtaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutionPreviewtaskResponse>(DoRequest("1.0", "yunyou.yunqing.solution.previewtask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解决方案应用previewtask查询
         * Summary: 解决方案应用previewtask查询
         */
        public async Task<QuerySolutionPreviewtaskResponse> QuerySolutionPreviewtaskExAsync(QuerySolutionPreviewtaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutionPreviewtaskResponse>(await DoRequestAsync("1.0", "yunyou.yunqing.solution.previewtask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
