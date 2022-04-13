// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ldc.Models;

namespace AntChain.SDK.Ldc
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
                        {"sdk_version", "1.12.15"},
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
                        {"sdk_version", "1.12.15"},
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
         * Description: 关联单元化应用服务实例
         * Summary: 关联单元化应用服务实例
         */
        public BindAppserviceResponse BindAppservice(BindAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 关联单元化应用服务实例
         * Summary: 关联单元化应用服务实例
         */
        public async Task<BindAppserviceResponse> BindAppserviceAsync(BindAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 关联单元化应用服务实例
         * Summary: 关联单元化应用服务实例
         */
        public BindAppserviceResponse BindAppserviceEx(BindAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAppserviceResponse>(DoRequest("1.0", "antcloud.ldc.appservice.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关联单元化应用服务实例
         * Summary: 关联单元化应用服务实例
         */
        public async Task<BindAppserviceResponse> BindAppserviceExAsync(BindAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appservice.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解除关联的单元化应用服务实例
         * Summary: 解除关联的单元化应用服务实例
         */
        public UnbindAppserviceResponse UnbindAppservice(UnbindAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnbindAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 解除关联的单元化应用服务实例
         * Summary: 解除关联的单元化应用服务实例
         */
        public async Task<UnbindAppserviceResponse> UnbindAppserviceAsync(UnbindAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnbindAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 解除关联的单元化应用服务实例
         * Summary: 解除关联的单元化应用服务实例
         */
        public UnbindAppserviceResponse UnbindAppserviceEx(UnbindAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindAppserviceResponse>(DoRequest("1.0", "antcloud.ldc.appservice.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 解除关联的单元化应用服务实例
         * Summary: 解除关联的单元化应用服务实例
         */
        public async Task<UnbindAppserviceResponse> UnbindAppserviceExAsync(UnbindAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnbindAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appservice.unbind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用运维单，以对一组应用执行一次运维操作
         * Summary: 创建一个应用运维单
         */
        public CreateAppopsResponse CreateAppops(CreateAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用运维单，以对一组应用执行一次运维操作
         * Summary: 创建一个应用运维单
         */
        public async Task<CreateAppopsResponse> CreateAppopsAsync(CreateAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用运维单，以对一组应用执行一次运维操作
         * Summary: 创建一个应用运维单
         */
        public CreateAppopsResponse CreateAppopsEx(CreateAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppopsResponse>(DoRequest("1.0", "antcloud.ldc.appops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用运维单，以对一组应用执行一次运维操作
         * Summary: 创建一个应用运维单
         */
        public async Task<CreateAppopsResponse> CreateAppopsExAsync(CreateAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppopsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个已经创建成功的部署操作
         * Summary: 查询一个已经创建成功的部署操作。
         */
        public GetAppopsResponse GetAppops(GetAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个已经创建成功的部署操作
         * Summary: 查询一个已经创建成功的部署操作。
         */
        public async Task<GetAppopsResponse> GetAppopsAsync(GetAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个已经创建成功的部署操作
         * Summary: 查询一个已经创建成功的部署操作。
         */
        public GetAppopsResponse GetAppopsEx(GetAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppopsResponse>(DoRequest("1.0", "antcloud.ldc.appops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个已经创建成功的部署操作
         * Summary: 查询一个已经创建成功的部署操作。
         */
        public async Task<GetAppopsResponse> GetAppopsExAsync(GetAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppopsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个运维操作中某个应用的详情
         * Summary: 查询一个运维操作中某个应用的详情
         */
        public GetAppopsApplicationResponse GetAppopsApplication(GetAppopsApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppopsApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个运维操作中某个应用的详情
         * Summary: 查询一个运维操作中某个应用的详情
         */
        public async Task<GetAppopsApplicationResponse> GetAppopsApplicationAsync(GetAppopsApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppopsApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个运维操作中某个应用的详情
         * Summary: 查询一个运维操作中某个应用的详情
         */
        public GetAppopsApplicationResponse GetAppopsApplicationEx(GetAppopsApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppopsApplicationResponse>(DoRequest("1.0", "antcloud.ldc.appops.application.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个运维操作中某个应用的详情
         * Summary: 查询一个运维操作中某个应用的详情
         */
        public async Task<GetAppopsApplicationResponse> GetAppopsApplicationExAsync(GetAppopsApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppopsApplicationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appops.application.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始执行一个已经创建成功的运维操作。
         */
        public StartAppopsResponse StartAppops(StartAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始执行一个已经创建成功的运维操作。
         */
        public async Task<StartAppopsResponse> StartAppopsAsync(StartAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始执行一个已经创建成功的运维操作。
         */
        public StartAppopsResponse StartAppopsEx(StartAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAppopsResponse>(DoRequest("1.0", "antcloud.ldc.appops.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始执行一个已经创建成功的运维操作。
         */
        public async Task<StartAppopsResponse> StartAppopsExAsync(StartAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAppopsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appops.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化一个初始化失败的运维单。
         */
        public ReinitAppopsResponse ReinitAppops(ReinitAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化一个初始化失败的运维单。
         */
        public async Task<ReinitAppopsResponse> ReinitAppopsAsync(ReinitAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化一个初始化失败的运维单。
         */
        public ReinitAppopsResponse ReinitAppopsEx(ReinitAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitAppopsResponse>(DoRequest("1.0", "antcloud.ldc.appops.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化一个初始化失败的运维单。
         */
        public async Task<ReinitAppopsResponse> ReinitAppopsExAsync(ReinitAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitAppopsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appops.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
         * Summary: 对一个运维单执行取消操作。
         */
        public CancelAppopsResponse CancelAppops(CancelAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
         * Summary: 对一个运维单执行取消操作。
         */
        public async Task<CancelAppopsResponse> CancelAppopsAsync(CancelAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
         * Summary: 对一个运维单执行取消操作。
         */
        public CancelAppopsResponse CancelAppopsEx(CancelAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAppopsResponse>(DoRequest("1.0", "antcloud.ldc.appops.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个运维单执行取消操作。 当运维单处于以下状态时可执行取消操作： INITED：初始化完成 INIT_FAILED：初始化失败
         * Summary: 对一个运维单执行取消操作。
         */
        public async Task<CancelAppopsResponse> CancelAppopsExAsync(CancelAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAppopsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appops.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
         * Summary: 重试运维
         */
        public RetryAppopsResponse RetryAppops(RetryAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
         * Summary: 重试运维
         */
        public async Task<RetryAppopsResponse> RetryAppopsAsync(RetryAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
         * Summary: 重试运维
         */
        public RetryAppopsResponse RetryAppopsEx(RetryAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAppopsResponse>(DoRequest("1.0", "antcloud.ldc.appops.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个运维操作中所有运维失败的分组进行重试操作。 当运维单处于以下状态时可执行重试操作： - FAILED：执行失败
         * Summary: 重试运维
         */
        public async Task<RetryAppopsResponse> RetryAppopsExAsync(RetryAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAppopsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.appops.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布单
         * Summary: 查询发布单
         */
        public GetDeploymentResponse GetDeployment(GetDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 查询发布单
         * Summary: 查询发布单
         */
        public async Task<GetDeploymentResponse> GetDeploymentAsync(GetDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发布单
         * Summary: 查询发布单
         */
        public GetDeploymentResponse GetDeploymentEx(GetDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentResponse>(DoRequest("1.0", "antcloud.ldc.deployment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布单
         * Summary: 查询发布单
         */
        public async Task<GetDeploymentResponse> GetDeploymentExAsync(GetDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单中某个应用的详情
         * Summary: 查询部署单中某个应用的详情
         */
        public GetDeploymentApplicationResponse GetDeploymentApplication(GetDeploymentApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDeploymentApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单中某个应用的详情
         * Summary: 查询部署单中某个应用的详情
         */
        public async Task<GetDeploymentApplicationResponse> GetDeploymentApplicationAsync(GetDeploymentApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDeploymentApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单中某个应用的详情
         * Summary: 查询部署单中某个应用的详情
         */
        public GetDeploymentApplicationResponse GetDeploymentApplicationEx(GetDeploymentApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentApplicationResponse>(DoRequest("1.0", "antcloud.ldc.deployment.application.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单中某个应用的详情
         * Summary: 查询部署单中某个应用的详情
         */
        public async Task<GetDeploymentApplicationResponse> GetDeploymentApplicationExAsync(GetDeploymentApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentApplicationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.application.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单中某个应用的回滚详情
         * Summary: 查询部署单中某个应用的回滚详情
         */
        public GetDeploymentRollbackResponse GetDeploymentRollback(GetDeploymentRollbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDeploymentRollbackEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单中某个应用的回滚详情
         * Summary: 查询部署单中某个应用的回滚详情
         */
        public async Task<GetDeploymentRollbackResponse> GetDeploymentRollbackAsync(GetDeploymentRollbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDeploymentRollbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单中某个应用的回滚详情
         * Summary: 查询部署单中某个应用的回滚详情
         */
        public GetDeploymentRollbackResponse GetDeploymentRollbackEx(GetDeploymentRollbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentRollbackResponse>(DoRequest("1.0", "antcloud.ldc.deployment.rollback.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单中某个应用的回滚详情
         * Summary: 查询部署单中某个应用的回滚详情
         */
        public async Task<GetDeploymentRollbackResponse> GetDeploymentRollbackExAsync(GetDeploymentRollbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentRollbackResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.rollback.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可回滚的版本信息
         * Summary: 查询可回滚的版本信息
         */
        public QueryDeploymentRollbackableResponse QueryDeploymentRollbackable(QueryDeploymentRollbackableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeploymentRollbackableEx(request, headers, runtime);
        }

        /**
         * Description: 查询可回滚的版本信息
         * Summary: 查询可回滚的版本信息
         */
        public async Task<QueryDeploymentRollbackableResponse> QueryDeploymentRollbackableAsync(QueryDeploymentRollbackableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeploymentRollbackableExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可回滚的版本信息
         * Summary: 查询可回滚的版本信息
         */
        public QueryDeploymentRollbackableResponse QueryDeploymentRollbackableEx(QueryDeploymentRollbackableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeploymentRollbackableResponse>(DoRequest("1.0", "antcloud.ldc.deployment.rollbackable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可回滚的版本信息
         * Summary: 查询可回滚的版本信息
         */
        public async Task<QueryDeploymentRollbackableResponse> QueryDeploymentRollbackableExAsync(QueryDeploymentRollbackableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeploymentRollbackableResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.rollbackable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚指定的应用
         * Summary: 回滚指定的应用
         */
        public RollbackDeploymentApplicationResponse RollbackDeploymentApplication(RollbackDeploymentApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackDeploymentApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 回滚指定的应用
         * Summary: 回滚指定的应用
         */
        public async Task<RollbackDeploymentApplicationResponse> RollbackDeploymentApplicationAsync(RollbackDeploymentApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackDeploymentApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚指定的应用
         * Summary: 回滚指定的应用
         */
        public RollbackDeploymentApplicationResponse RollbackDeploymentApplicationEx(RollbackDeploymentApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackDeploymentApplicationResponse>(DoRequest("1.0", "antcloud.ldc.deployment.application.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚指定的应用
         * Summary: 回滚指定的应用
         */
        public async Task<RollbackDeploymentApplicationResponse> RollbackDeploymentApplicationExAsync(RollbackDeploymentApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackDeploymentApplicationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.application.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送 LDC 流量规则
         * Summary: 推送 LDC 流量规则
         */
        public PushFlowRouteclientResponse PushFlowRouteclient(PushFlowRouteclientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushFlowRouteclientEx(request, headers, runtime);
        }

        /**
         * Description: 推送 LDC 流量规则
         * Summary: 推送 LDC 流量规则
         */
        public async Task<PushFlowRouteclientResponse> PushFlowRouteclientAsync(PushFlowRouteclientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushFlowRouteclientExAsync(request, headers, runtime);
        }

        /**
         * Description: 推送 LDC 流量规则
         * Summary: 推送 LDC 流量规则
         */
        public PushFlowRouteclientResponse PushFlowRouteclientEx(PushFlowRouteclientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushFlowRouteclientResponse>(DoRequest("1.0", "antcloud.ldc.flow.routeclient.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送 LDC 流量规则
         * Summary: 推送 LDC 流量规则
         */
        public async Task<PushFlowRouteclientResponse> PushFlowRouteclientExAsync(PushFlowRouteclientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushFlowRouteclientResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.routeclient.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: fedNamespace创建
         * Summary: FedNamespace创建
         */
        public CreateFederationNamespaceResponse CreateFederationNamespace(CreateFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFederationNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: fedNamespace创建
         * Summary: FedNamespace创建
         */
        public async Task<CreateFederationNamespaceResponse> CreateFederationNamespaceAsync(CreateFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFederationNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: fedNamespace创建
         * Summary: FedNamespace创建
         */
        public CreateFederationNamespaceResponse CreateFederationNamespaceEx(CreateFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.federation.namespace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: fedNamespace创建
         * Summary: FedNamespace创建
         */
        public async Task<CreateFederationNamespaceResponse> CreateFederationNamespaceExAsync(CreateFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.namespace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedNamespace更新API
         * Summary: FedNamespace更新
         */
        public UpdateFederationNamespaceResponse UpdateFederationNamespace(UpdateFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFederationNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: FedNamespace更新API
         * Summary: FedNamespace更新
         */
        public async Task<UpdateFederationNamespaceResponse> UpdateFederationNamespaceAsync(UpdateFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFederationNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: FedNamespace更新API
         * Summary: FedNamespace更新
         */
        public UpdateFederationNamespaceResponse UpdateFederationNamespaceEx(UpdateFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFederationNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.federation.namespace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedNamespace更新API
         * Summary: FedNamespace更新
         */
        public async Task<UpdateFederationNamespaceResponse> UpdateFederationNamespaceExAsync(UpdateFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFederationNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.namespace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个FedNamespace 
         * Summary: FedNamespace get
         */
        public GetFederationNamespaceResponse GetFederationNamespace(GetFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFederationNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个FedNamespace 
         * Summary: FedNamespace get
         */
        public async Task<GetFederationNamespaceResponse> GetFederationNamespaceAsync(GetFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFederationNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个FedNamespace 
         * Summary: FedNamespace get
         */
        public GetFederationNamespaceResponse GetFederationNamespaceEx(GetFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFederationNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.federation.namespace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个FedNamespace 
         * Summary: FedNamespace get
         */
        public async Task<GetFederationNamespaceResponse> GetFederationNamespaceExAsync(GetFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFederationNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.namespace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedNamespace 删除
         * Summary: FedNamespace 删除
         */
        public DeleteFederationNamespaceResponse DeleteFederationNamespace(DeleteFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFederationNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: FedNamespace 删除
         * Summary: FedNamespace 删除
         */
        public async Task<DeleteFederationNamespaceResponse> DeleteFederationNamespaceAsync(DeleteFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFederationNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: FedNamespace 删除
         * Summary: FedNamespace 删除
         */
        public DeleteFederationNamespaceResponse DeleteFederationNamespaceEx(DeleteFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFederationNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.federation.namespace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedNamespace 删除
         * Summary: FedNamespace 删除
         */
        public async Task<DeleteFederationNamespaceResponse> DeleteFederationNamespaceExAsync(DeleteFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFederationNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.namespace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建FedConfigMap
         * Summary: 创建FedConfigMap
         */
        public CreateFederationConfigmapResponse CreateFederationConfigmap(CreateFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFederationConfigmapEx(request, headers, runtime);
        }

        /**
         * Description: 创建FedConfigMap
         * Summary: 创建FedConfigMap
         */
        public async Task<CreateFederationConfigmapResponse> CreateFederationConfigmapAsync(CreateFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFederationConfigmapExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建FedConfigMap
         * Summary: 创建FedConfigMap
         */
        public CreateFederationConfigmapResponse CreateFederationConfigmapEx(CreateFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationConfigmapResponse>(DoRequest("1.0", "antcloud.ldc.federation.configmap.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建FedConfigMap
         * Summary: 创建FedConfigMap
         */
        public async Task<CreateFederationConfigmapResponse> CreateFederationConfigmapExAsync(CreateFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationConfigmapResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.configmap.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedConfigMap更新
         * Summary: FedConfigMap更新
         */
        public UpdateFederationConfigmapResponse UpdateFederationConfigmap(UpdateFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFederationConfigmapEx(request, headers, runtime);
        }

        /**
         * Description: FedConfigMap更新
         * Summary: FedConfigMap更新
         */
        public async Task<UpdateFederationConfigmapResponse> UpdateFederationConfigmapAsync(UpdateFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFederationConfigmapExAsync(request, headers, runtime);
        }

        /**
         * Description: FedConfigMap更新
         * Summary: FedConfigMap更新
         */
        public UpdateFederationConfigmapResponse UpdateFederationConfigmapEx(UpdateFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFederationConfigmapResponse>(DoRequest("1.0", "antcloud.ldc.federation.configmap.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedConfigMap更新
         * Summary: FedConfigMap更新
         */
        public async Task<UpdateFederationConfigmapResponse> UpdateFederationConfigmapExAsync(UpdateFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFederationConfigmapResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.configmap.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedConfigMap Get
         * Summary: FedConfigMap Get
         */
        public GetFederationConfigmapResponse GetFederationConfigmap(GetFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFederationConfigmapEx(request, headers, runtime);
        }

        /**
         * Description: FedConfigMap Get
         * Summary: FedConfigMap Get
         */
        public async Task<GetFederationConfigmapResponse> GetFederationConfigmapAsync(GetFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFederationConfigmapExAsync(request, headers, runtime);
        }

        /**
         * Description: FedConfigMap Get
         * Summary: FedConfigMap Get
         */
        public GetFederationConfigmapResponse GetFederationConfigmapEx(GetFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFederationConfigmapResponse>(DoRequest("1.0", "antcloud.ldc.federation.configmap.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedConfigMap Get
         * Summary: FedConfigMap Get
         */
        public async Task<GetFederationConfigmapResponse> GetFederationConfigmapExAsync(GetFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFederationConfigmapResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.configmap.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedConfigMap 删除
         * Summary: FedConfigMap 删除
         */
        public DeleteFederationConfigmapResponse DeleteFederationConfigmap(DeleteFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFederationConfigmapEx(request, headers, runtime);
        }

        /**
         * Description: FedConfigMap 删除
         * Summary: FedConfigMap 删除
         */
        public async Task<DeleteFederationConfigmapResponse> DeleteFederationConfigmapAsync(DeleteFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFederationConfigmapExAsync(request, headers, runtime);
        }

        /**
         * Description: FedConfigMap 删除
         * Summary: FedConfigMap 删除
         */
        public DeleteFederationConfigmapResponse DeleteFederationConfigmapEx(DeleteFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFederationConfigmapResponse>(DoRequest("1.0", "antcloud.ldc.federation.configmap.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedConfigMap 删除
         * Summary: FedConfigMap 删除
         */
        public async Task<DeleteFederationConfigmapResponse> DeleteFederationConfigmapExAsync(DeleteFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFederationConfigmapResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.configmap.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedConfigMap List
         * Summary: FedConfigMap List
         */
        public ListFederationConfigmapResponse ListFederationConfigmap(ListFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListFederationConfigmapEx(request, headers, runtime);
        }

        /**
         * Description: FedConfigMap List
         * Summary: FedConfigMap List
         */
        public async Task<ListFederationConfigmapResponse> ListFederationConfigmapAsync(ListFederationConfigmapRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListFederationConfigmapExAsync(request, headers, runtime);
        }

        /**
         * Description: FedConfigMap List
         * Summary: FedConfigMap List
         */
        public ListFederationConfigmapResponse ListFederationConfigmapEx(ListFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFederationConfigmapResponse>(DoRequest("1.0", "antcloud.ldc.federation.configmap.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedConfigMap List
         * Summary: FedConfigMap List
         */
        public async Task<ListFederationConfigmapResponse> ListFederationConfigmapExAsync(ListFederationConfigmapRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFederationConfigmapResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.configmap.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: List FeNamespace 
         * Summary: List FeNamespace 
         */
        public ListFederationNamespaceResponse ListFederationNamespace(ListFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListFederationNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: List FeNamespace 
         * Summary: List FeNamespace 
         */
        public async Task<ListFederationNamespaceResponse> ListFederationNamespaceAsync(ListFederationNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListFederationNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: List FeNamespace 
         * Summary: List FeNamespace 
         */
        public ListFederationNamespaceResponse ListFederationNamespaceEx(ListFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFederationNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.federation.namespace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: List FeNamespace 
         * Summary: List FeNamespace 
         */
        public async Task<ListFederationNamespaceResponse> ListFederationNamespaceExAsync(ListFederationNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFederationNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.namespace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询容器应用服务OpenAPI
         * Summary: 查询容器应用服务
         */
        public QueryContainerserviceResponse QueryContainerservice(QueryContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContainerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询容器应用服务OpenAPI
         * Summary: 查询容器应用服务
         */
        public async Task<QueryContainerserviceResponse> QueryContainerserviceAsync(QueryContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContainerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询容器应用服务OpenAPI
         * Summary: 查询容器应用服务
         */
        public QueryContainerserviceResponse QueryContainerserviceEx(QueryContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContainerserviceResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询容器应用服务OpenAPI
         * Summary: 查询容器应用服务
         */
        public async Task<QueryContainerserviceResponse> QueryContainerserviceExAsync(QueryContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContainerserviceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get master clusters for each zone
         * Summary: getMasterClusters
         */
        public ListMulticlusterMasterclusterResponse ListMulticlusterMastercluster(ListMulticlusterMasterclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListMulticlusterMasterclusterEx(request, headers, runtime);
        }

        /**
         * Description: get master clusters for each zone
         * Summary: getMasterClusters
         */
        public async Task<ListMulticlusterMasterclusterResponse> ListMulticlusterMasterclusterAsync(ListMulticlusterMasterclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListMulticlusterMasterclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: get master clusters for each zone
         * Summary: getMasterClusters
         */
        public ListMulticlusterMasterclusterResponse ListMulticlusterMasterclusterEx(ListMulticlusterMasterclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMulticlusterMasterclusterResponse>(DoRequest("1.0", "antcloud.ldc.multicluster.mastercluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get master clusters for each zone
         * Summary: getMasterClusters
         */
        public async Task<ListMulticlusterMasterclusterResponse> ListMulticlusterMasterclusterExAsync(ListMulticlusterMasterclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMulticlusterMasterclusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.multicluster.mastercluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: import master clusters
         * Summary: importMasterCluster
         */
        public InitMulticlusterClusterResponse InitMulticlusterCluster(InitMulticlusterClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitMulticlusterClusterEx(request, headers, runtime);
        }

        /**
         * Description: import master clusters
         * Summary: importMasterCluster
         */
        public async Task<InitMulticlusterClusterResponse> InitMulticlusterClusterAsync(InitMulticlusterClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitMulticlusterClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: import master clusters
         * Summary: importMasterCluster
         */
        public InitMulticlusterClusterResponse InitMulticlusterClusterEx(InitMulticlusterClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitMulticlusterClusterResponse>(DoRequest("1.0", "antcloud.ldc.multicluster.cluster.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: import master clusters
         * Summary: importMasterCluster
         */
        public async Task<InitMulticlusterClusterResponse> InitMulticlusterClusterExAsync(InitMulticlusterClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitMulticlusterClusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.multicluster.cluster.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list multi clusters
         * Summary: list MultiCluster
         */
        public ListMulticlusterResponse ListMulticluster(ListMulticlusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListMulticlusterEx(request, headers, runtime);
        }

        /**
         * Description: list multi clusters
         * Summary: list MultiCluster
         */
        public async Task<ListMulticlusterResponse> ListMulticlusterAsync(ListMulticlusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListMulticlusterExAsync(request, headers, runtime);
        }

        /**
         * Description: list multi clusters
         * Summary: list MultiCluster
         */
        public ListMulticlusterResponse ListMulticlusterEx(ListMulticlusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMulticlusterResponse>(DoRequest("1.0", "antcloud.ldc.multicluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list multi clusters
         * Summary: list MultiCluster
         */
        public async Task<ListMulticlusterResponse> ListMulticlusterExAsync(ListMulticlusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMulticlusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.multicluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除容器应用服务
         * Summary: 删除容器应用服务
         */
        public DeleteContainerserviceResponse DeleteContainerservice(DeleteContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteContainerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 删除容器应用服务
         * Summary: 删除容器应用服务
         */
        public async Task<DeleteContainerserviceResponse> DeleteContainerserviceAsync(DeleteContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteContainerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除容器应用服务
         * Summary: 删除容器应用服务
         */
        public DeleteContainerserviceResponse DeleteContainerserviceEx(DeleteContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContainerserviceResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除容器应用服务
         * Summary: 删除容器应用服务
         */
        public async Task<DeleteContainerserviceResponse> DeleteContainerserviceExAsync(DeleteContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContainerserviceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个部署单
         * Summary: 创建一个部署单
         */
        public CreateContainerserviceDeploymentResponse CreateContainerserviceDeployment(CreateContainerserviceDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContainerserviceDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个部署单
         * Summary: 创建一个部署单
         */
        public async Task<CreateContainerserviceDeploymentResponse> CreateContainerserviceDeploymentAsync(CreateContainerserviceDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContainerserviceDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个部署单
         * Summary: 创建一个部署单
         */
        public CreateContainerserviceDeploymentResponse CreateContainerserviceDeploymentEx(CreateContainerserviceDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContainerserviceDeploymentResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.deployment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个部署单
         * Summary: 创建一个部署单
         */
        public async Task<CreateContainerserviceDeploymentResponse> CreateContainerserviceDeploymentExAsync(CreateContainerserviceDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContainerserviceDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.deployment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建FedSecret
         * Summary: 创建FedSecret
         */
        public CreateFederationSecretResponse CreateFederationSecret(CreateFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFederationSecretEx(request, headers, runtime);
        }

        /**
         * Description: 创建FedSecret
         * Summary: 创建FedSecret
         */
        public async Task<CreateFederationSecretResponse> CreateFederationSecretAsync(CreateFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFederationSecretExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建FedSecret
         * Summary: 创建FedSecret
         */
        public CreateFederationSecretResponse CreateFederationSecretEx(CreateFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationSecretResponse>(DoRequest("1.0", "antcloud.ldc.federation.secret.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建FedSecret
         * Summary: 创建FedSecret
         */
        public async Task<CreateFederationSecretResponse> CreateFederationSecretExAsync(CreateFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationSecretResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.secret.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedSecret Get
         * Summary: FedSecret Get
         */
        public GetFederationSecretResponse GetFederationSecret(GetFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFederationSecretEx(request, headers, runtime);
        }

        /**
         * Description: FedSecret Get
         * Summary: FedSecret Get
         */
        public async Task<GetFederationSecretResponse> GetFederationSecretAsync(GetFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFederationSecretExAsync(request, headers, runtime);
        }

        /**
         * Description: FedSecret Get
         * Summary: FedSecret Get
         */
        public GetFederationSecretResponse GetFederationSecretEx(GetFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFederationSecretResponse>(DoRequest("1.0", "antcloud.ldc.federation.secret.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedSecret Get
         * Summary: FedSecret Get
         */
        public async Task<GetFederationSecretResponse> GetFederationSecretExAsync(GetFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFederationSecretResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.secret.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedSecret 删除
         * Summary: FedSecret 删除
         */
        public DeleteFederationSecretResponse DeleteFederationSecret(DeleteFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFederationSecretEx(request, headers, runtime);
        }

        /**
         * Description: FedSecret 删除
         * Summary: FedSecret 删除
         */
        public async Task<DeleteFederationSecretResponse> DeleteFederationSecretAsync(DeleteFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFederationSecretExAsync(request, headers, runtime);
        }

        /**
         * Description: FedSecret 删除
         * Summary: FedSecret 删除
         */
        public DeleteFederationSecretResponse DeleteFederationSecretEx(DeleteFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFederationSecretResponse>(DoRequest("1.0", "antcloud.ldc.federation.secret.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedSecret 删除
         * Summary: FedSecret 删除
         */
        public async Task<DeleteFederationSecretResponse> DeleteFederationSecretExAsync(DeleteFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFederationSecretResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.secret.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedSecret 更新
         * Summary: FedSecret 更新
         */
        public UpdateFederationSecretResponse UpdateFederationSecret(UpdateFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFederationSecretEx(request, headers, runtime);
        }

        /**
         * Description: FedSecret 更新
         * Summary: FedSecret 更新
         */
        public async Task<UpdateFederationSecretResponse> UpdateFederationSecretAsync(UpdateFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFederationSecretExAsync(request, headers, runtime);
        }

        /**
         * Description: FedSecret 更新
         * Summary: FedSecret 更新
         */
        public UpdateFederationSecretResponse UpdateFederationSecretEx(UpdateFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFederationSecretResponse>(DoRequest("1.0", "antcloud.ldc.federation.secret.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedSecret 更新
         * Summary: FedSecret 更新
         */
        public async Task<UpdateFederationSecretResponse> UpdateFederationSecretExAsync(UpdateFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFederationSecretResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.secret.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedSecret List
         * Summary: FedSecret List
         */
        public ListFederationSecretResponse ListFederationSecret(ListFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListFederationSecretEx(request, headers, runtime);
        }

        /**
         * Description: FedSecret List
         * Summary: FedSecret List
         */
        public async Task<ListFederationSecretResponse> ListFederationSecretAsync(ListFederationSecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListFederationSecretExAsync(request, headers, runtime);
        }

        /**
         * Description: FedSecret List
         * Summary: FedSecret List
         */
        public ListFederationSecretResponse ListFederationSecretEx(ListFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFederationSecretResponse>(DoRequest("1.0", "antcloud.ldc.federation.secret.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: FedSecret List
         * Summary: FedSecret List
         */
        public async Task<ListFederationSecretResponse> ListFederationSecretExAsync(ListFederationSecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFederationSecretResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.secret.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
        调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
         * Summary: 获取容器服务最新发布的版本
         */
        public DescribeContainerserviceRevisionResponse DescribeContainerserviceRevision(DescribeContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeContainerserviceRevisionEx(request, headers, runtime);
        }

        /**
         * Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
        调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
         * Summary: 获取容器服务最新发布的版本
         */
        public async Task<DescribeContainerserviceRevisionResponse> DescribeContainerserviceRevisionAsync(DescribeContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeContainerserviceRevisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
        调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
         * Summary: 获取容器服务最新发布的版本
         */
        public DescribeContainerserviceRevisionResponse DescribeContainerserviceRevisionEx(DescribeContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeContainerserviceRevisionResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.revision.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取容器服务最新发布的版本，包括发布中和发布完成的，不是最新编辑保存的版本。
        调antcloud.ldc.containerservice.revision.query获取第一条记录是最新编辑保存的版本。
         * Summary: 获取容器服务最新发布的版本
         */
        public async Task<DescribeContainerserviceRevisionResponse> DescribeContainerserviceRevisionExAsync(DescribeContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeContainerserviceRevisionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.revision.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取某一个版本的配置信息
         * Summary: 获取某一个版本的配置信息
         */
        public GetContainerserviceRevisionResponse GetContainerserviceRevision(GetContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContainerserviceRevisionEx(request, headers, runtime);
        }

        /**
         * Description: 获取某一个版本的配置信息
         * Summary: 获取某一个版本的配置信息
         */
        public async Task<GetContainerserviceRevisionResponse> GetContainerserviceRevisionAsync(GetContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContainerserviceRevisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取某一个版本的配置信息
         * Summary: 获取某一个版本的配置信息
         */
        public GetContainerserviceRevisionResponse GetContainerserviceRevisionEx(GetContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContainerserviceRevisionResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.revision.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取某一个版本的配置信息
         * Summary: 获取某一个版本的配置信息
         */
        public async Task<GetContainerserviceRevisionResponse> GetContainerserviceRevisionExAsync(GetContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContainerserviceRevisionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.revision.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询容器服务版本列表
         * Summary: 查询容器服务版本列表
         */
        public QueryContainerserviceRevisionResponse QueryContainerserviceRevision(QueryContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContainerserviceRevisionEx(request, headers, runtime);
        }

        /**
         * Description: 查询容器服务版本列表
         * Summary: 查询容器服务版本列表
         */
        public async Task<QueryContainerserviceRevisionResponse> QueryContainerserviceRevisionAsync(QueryContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContainerserviceRevisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询容器服务版本列表
         * Summary: 查询容器服务版本列表
         */
        public QueryContainerserviceRevisionResponse QueryContainerserviceRevisionEx(QueryContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContainerserviceRevisionResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.revision.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询容器服务版本列表
         * Summary: 查询容器服务版本列表
         */
        public async Task<QueryContainerserviceRevisionResponse> QueryContainerserviceRevisionExAsync(QueryContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContainerserviceRevisionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.revision.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为某一版本加上备注
         * Summary: 为某一版本加上备注
         */
        public UpdateContainerserviceRevisionResponse UpdateContainerserviceRevision(UpdateContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContainerserviceRevisionEx(request, headers, runtime);
        }

        /**
         * Description: 为某一版本加上备注
         * Summary: 为某一版本加上备注
         */
        public async Task<UpdateContainerserviceRevisionResponse> UpdateContainerserviceRevisionAsync(UpdateContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContainerserviceRevisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 为某一版本加上备注
         * Summary: 为某一版本加上备注
         */
        public UpdateContainerserviceRevisionResponse UpdateContainerserviceRevisionEx(UpdateContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceRevisionResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.revision.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为某一版本加上备注
         * Summary: 为某一版本加上备注
         */
        public async Task<UpdateContainerserviceRevisionResponse> UpdateContainerserviceRevisionExAsync(UpdateContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceRevisionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.revision.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 快速更新镜像
         * Summary: 快速更新镜像
         */
        public UpdateContainerserviceImageResponse UpdateContainerserviceImage(UpdateContainerserviceImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContainerserviceImageEx(request, headers, runtime);
        }

        /**
         * Description: 快速更新镜像
         * Summary: 快速更新镜像
         */
        public async Task<UpdateContainerserviceImageResponse> UpdateContainerserviceImageAsync(UpdateContainerserviceImageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContainerserviceImageExAsync(request, headers, runtime);
        }

        /**
         * Description: 快速更新镜像
         * Summary: 快速更新镜像
         */
        public UpdateContainerserviceImageResponse UpdateContainerserviceImageEx(UpdateContainerserviceImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceImageResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.image.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 快速更新镜像
         * Summary: 快速更新镜像
         */
        public async Task<UpdateContainerserviceImageResponse> UpdateContainerserviceImageExAsync(UpdateContainerserviceImageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceImageResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.image.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 快速更新容器服务副本数
         * Summary: 快速更新容器服务副本数
         */
        public UpdateContainerserviceReplicasResponse UpdateContainerserviceReplicas(UpdateContainerserviceReplicasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContainerserviceReplicasEx(request, headers, runtime);
        }

        /**
         * Description: 快速更新容器服务副本数
         * Summary: 快速更新容器服务副本数
         */
        public async Task<UpdateContainerserviceReplicasResponse> UpdateContainerserviceReplicasAsync(UpdateContainerserviceReplicasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContainerserviceReplicasExAsync(request, headers, runtime);
        }

        /**
         * Description: 快速更新容器服务副本数
         * Summary: 快速更新容器服务副本数
         */
        public UpdateContainerserviceReplicasResponse UpdateContainerserviceReplicasEx(UpdateContainerserviceReplicasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceReplicasResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.replicas.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 快速更新容器服务副本数
         * Summary: 快速更新容器服务副本数
         */
        public async Task<UpdateContainerserviceReplicasResponse> UpdateContainerserviceReplicasExAsync(UpdateContainerserviceReplicasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceReplicasResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.replicas.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建容器应用服务。
         * Summary: 创建容器应用服务
         */
        public CreateContainerserviceResponse CreateContainerservice(CreateContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContainerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 创建容器应用服务。
         * Summary: 创建容器应用服务
         */
        public async Task<CreateContainerserviceResponse> CreateContainerserviceAsync(CreateContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContainerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建容器应用服务。
         * Summary: 创建容器应用服务
         */
        public CreateContainerserviceResponse CreateContainerserviceEx(CreateContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContainerserviceResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建容器应用服务。
         * Summary: 创建容器应用服务
         */
        public async Task<CreateContainerserviceResponse> CreateContainerserviceExAsync(CreateContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContainerserviceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存容器服务草稿。
         * Summary: 保存容器服务草稿
         */
        public SaveContainerserviceRevisionResponse SaveContainerserviceRevision(SaveContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveContainerserviceRevisionEx(request, headers, runtime);
        }

        /**
         * Description: 保存容器服务草稿。
         * Summary: 保存容器服务草稿
         */
        public async Task<SaveContainerserviceRevisionResponse> SaveContainerserviceRevisionAsync(SaveContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveContainerserviceRevisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存容器服务草稿。
         * Summary: 保存容器服务草稿
         */
        public SaveContainerserviceRevisionResponse SaveContainerserviceRevisionEx(SaveContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveContainerserviceRevisionResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.revision.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存容器服务草稿。
         * Summary: 保存容器服务草稿
         */
        public async Task<SaveContainerserviceRevisionResponse> SaveContainerserviceRevisionExAsync(SaveContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveContainerserviceRevisionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.revision.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: container service 更新
         * Summary: container service 更新
         */
        public UpdateContainerserviceResponse UpdateContainerservice(UpdateContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContainerserviceEx(request, headers, runtime);
        }

        /**
         * Description: container service 更新
         * Summary: container service 更新
         */
        public async Task<UpdateContainerserviceResponse> UpdateContainerserviceAsync(UpdateContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContainerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: container service 更新
         * Summary: container service 更新
         */
        public UpdateContainerserviceResponse UpdateContainerserviceEx(UpdateContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: container service 更新
         * Summary: container service 更新
         */
        public async Task<UpdateContainerserviceResponse> UpdateContainerserviceExAsync(UpdateContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查对应容器服务是否存在。
         * Summary: 检查对应容器服务是否存在
         */
        public ExistContainerserviceResponse ExistContainerservice(ExistContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistContainerserviceEx(request, headers, runtime);
        }

        /**
         * Description: 检查对应容器服务是否存在。
         * Summary: 检查对应容器服务是否存在
         */
        public async Task<ExistContainerserviceResponse> ExistContainerserviceAsync(ExistContainerserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistContainerserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 检查对应容器服务是否存在。
         * Summary: 检查对应容器服务是否存在
         */
        public ExistContainerserviceResponse ExistContainerserviceEx(ExistContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistContainerserviceResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查对应容器服务是否存在。
         * Summary: 检查对应容器服务是否存在
         */
        public async Task<ExistContainerserviceResponse> ExistContainerserviceExAsync(ExistContainerserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistContainerserviceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get cluster basic info by name
         * Summary: getClusterBasicInfo
         */
        public GetClusterBasicinfoResponse GetClusterBasicinfo(GetClusterBasicinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetClusterBasicinfoEx(request, headers, runtime);
        }

        /**
         * Description: get cluster basic info by name
         * Summary: getClusterBasicInfo
         */
        public async Task<GetClusterBasicinfoResponse> GetClusterBasicinfoAsync(GetClusterBasicinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetClusterBasicinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: get cluster basic info by name
         * Summary: getClusterBasicInfo
         */
        public GetClusterBasicinfoResponse GetClusterBasicinfoEx(GetClusterBasicinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetClusterBasicinfoResponse>(DoRequest("1.0", "antcloud.ldc.cluster.basicinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get cluster basic info by name
         * Summary: getClusterBasicInfo
         */
        public async Task<GetClusterBasicinfoResponse> GetClusterBasicinfoExAsync(GetClusterBasicinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetClusterBasicinfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.basicinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get cluster overview info 
         * Summary: getClusterOverview
         */
        public GetClusterOverviewinfoResponse GetClusterOverviewinfo(GetClusterOverviewinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetClusterOverviewinfoEx(request, headers, runtime);
        }

        /**
         * Description: get cluster overview info 
         * Summary: getClusterOverview
         */
        public async Task<GetClusterOverviewinfoResponse> GetClusterOverviewinfoAsync(GetClusterOverviewinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetClusterOverviewinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: get cluster overview info 
         * Summary: getClusterOverview
         */
        public GetClusterOverviewinfoResponse GetClusterOverviewinfoEx(GetClusterOverviewinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetClusterOverviewinfoResponse>(DoRequest("1.0", "antcloud.ldc.cluster.overviewinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get cluster overview info 
         * Summary: getClusterOverview
         */
        public async Task<GetClusterOverviewinfoResponse> GetClusterOverviewinfoExAsync(GetClusterOverviewinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetClusterOverviewinfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.overviewinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元。
         * Summary: 查询部署单元
         */
        public QueryCellResponse QueryCell(QueryCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元。
         * Summary: 查询部署单元
         */
        public async Task<QueryCellResponse> QueryCellAsync(QueryCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元。
         * Summary: 查询部署单元
         */
        public QueryCellResponse QueryCellEx(QueryCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCellResponse>(DoRequest("1.0", "antcloud.ldc.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元。
         * Summary: 查询部署单元
         */
        public async Task<QueryCellResponse> QueryCellExAsync(QueryCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get pod overview infos of specific cluster
         * Summary: getPodOverviewInfo
         */
        public GetClusterPodoverviewResponse GetClusterPodoverview(GetClusterPodoverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetClusterPodoverviewEx(request, headers, runtime);
        }

        /**
         * Description: get pod overview infos of specific cluster
         * Summary: getPodOverviewInfo
         */
        public async Task<GetClusterPodoverviewResponse> GetClusterPodoverviewAsync(GetClusterPodoverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetClusterPodoverviewExAsync(request, headers, runtime);
        }

        /**
         * Description: get pod overview infos of specific cluster
         * Summary: getPodOverviewInfo
         */
        public GetClusterPodoverviewResponse GetClusterPodoverviewEx(GetClusterPodoverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetClusterPodoverviewResponse>(DoRequest("1.0", "antcloud.ldc.cluster.podoverview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get pod overview infos of specific cluster
         * Summary: getPodOverviewInfo
         */
        public async Task<GetClusterPodoverviewResponse> GetClusterPodoverviewExAsync(GetClusterPodoverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetClusterPodoverviewResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.podoverview.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list all nodes info of specific cluster
         * Summary: listNodeInfo
         */
        public ListClusterNodeinfoResponse ListClusterNodeinfo(ListClusterNodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListClusterNodeinfoEx(request, headers, runtime);
        }

        /**
         * Description: list all nodes info of specific cluster
         * Summary: listNodeInfo
         */
        public async Task<ListClusterNodeinfoResponse> ListClusterNodeinfoAsync(ListClusterNodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListClusterNodeinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: list all nodes info of specific cluster
         * Summary: listNodeInfo
         */
        public ListClusterNodeinfoResponse ListClusterNodeinfoEx(ListClusterNodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterNodeinfoResponse>(DoRequest("1.0", "antcloud.ldc.cluster.nodeinfo.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list all nodes info of specific cluster
         * Summary: listNodeInfo
         */
        public async Task<ListClusterNodeinfoResponse> ListClusterNodeinfoExAsync(ListClusterNodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterNodeinfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.nodeinfo.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create namespace of a specific cluster
         * Summary: createNamespace
         */
        public CreateClusterNamespaceResponse CreateClusterNamespace(CreateClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateClusterNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: create namespace of a specific cluster
         * Summary: createNamespace
         */
        public async Task<CreateClusterNamespaceResponse> CreateClusterNamespaceAsync(CreateClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateClusterNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: create namespace of a specific cluster
         * Summary: createNamespace
         */
        public CreateClusterNamespaceResponse CreateClusterNamespaceEx(CreateClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateClusterNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.cluster.namespace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create namespace of a specific cluster
         * Summary: createNamespace
         */
        public async Task<CreateClusterNamespaceResponse> CreateClusterNamespaceExAsync(CreateClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateClusterNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.namespace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list namespace
         * Summary: list namespace
         */
        public ListClusterNamespaceResponse ListClusterNamespace(ListClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListClusterNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: list namespace
         * Summary: list namespace
         */
        public async Task<ListClusterNamespaceResponse> ListClusterNamespaceAsync(ListClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListClusterNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: list namespace
         * Summary: list namespace
         */
        public ListClusterNamespaceResponse ListClusterNamespaceEx(ListClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.cluster.namespace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list namespace
         * Summary: list namespace
         */
        public async Task<ListClusterNamespaceResponse> ListClusterNamespaceExAsync(ListClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.namespace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query namespace detail info
         * Summary: query namespace 
         */
        public QueryClusterNamespaceResponse QueryClusterNamespace(QueryClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryClusterNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: query namespace detail info
         * Summary: query namespace 
         */
        public async Task<QueryClusterNamespaceResponse> QueryClusterNamespaceAsync(QueryClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryClusterNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: query namespace detail info
         * Summary: query namespace 
         */
        public QueryClusterNamespaceResponse QueryClusterNamespaceEx(QueryClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.cluster.namespace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query namespace detail info
         * Summary: query namespace 
         */
        public async Task<QueryClusterNamespaceResponse> QueryClusterNamespaceExAsync(QueryClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryClusterNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.namespace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete namespace of specific cluster
         * Summary: delete namespace
         */
        public DeleteClusterNamespaceResponse DeleteClusterNamespace(DeleteClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteClusterNamespaceEx(request, headers, runtime);
        }

        /**
         * Description: delete namespace of specific cluster
         * Summary: delete namespace
         */
        public async Task<DeleteClusterNamespaceResponse> DeleteClusterNamespaceAsync(DeleteClusterNamespaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteClusterNamespaceExAsync(request, headers, runtime);
        }

        /**
         * Description: delete namespace of specific cluster
         * Summary: delete namespace
         */
        public DeleteClusterNamespaceResponse DeleteClusterNamespaceEx(DeleteClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteClusterNamespaceResponse>(DoRequest("1.0", "antcloud.ldc.cluster.namespace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete namespace of specific cluster
         * Summary: delete namespace
         */
        public async Task<DeleteClusterNamespaceResponse> DeleteClusterNamespaceExAsync(DeleteClusterNamespaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteClusterNamespaceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.namespace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get node detail info by name
         * Summary: get node detail info
         */
        public GetClusterNodeinfoResponse GetClusterNodeinfo(GetClusterNodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetClusterNodeinfoEx(request, headers, runtime);
        }

        /**
         * Description: get node detail info by name
         * Summary: get node detail info
         */
        public async Task<GetClusterNodeinfoResponse> GetClusterNodeinfoAsync(GetClusterNodeinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetClusterNodeinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: get node detail info by name
         * Summary: get node detail info
         */
        public GetClusterNodeinfoResponse GetClusterNodeinfoEx(GetClusterNodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetClusterNodeinfoResponse>(DoRequest("1.0", "antcloud.ldc.cluster.nodeinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get node detail info by name
         * Summary: get node detail info
         */
        public async Task<GetClusterNodeinfoResponse> GetClusterNodeinfoExAsync(GetClusterNodeinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetClusterNodeinfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.nodeinfo.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ImagePullSecret创建
         * Summary: ImagePullSecret创建
         */
        public CreateFederationImagepullsecretResponse CreateFederationImagepullsecret(CreateFederationImagepullsecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFederationImagepullsecretEx(request, headers, runtime);
        }

        /**
         * Description: ImagePullSecret创建
         * Summary: ImagePullSecret创建
         */
        public async Task<CreateFederationImagepullsecretResponse> CreateFederationImagepullsecretAsync(CreateFederationImagepullsecretRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFederationImagepullsecretExAsync(request, headers, runtime);
        }

        /**
         * Description: ImagePullSecret创建
         * Summary: ImagePullSecret创建
         */
        public CreateFederationImagepullsecretResponse CreateFederationImagepullsecretEx(CreateFederationImagepullsecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationImagepullsecretResponse>(DoRequest("1.0", "antcloud.ldc.federation.imagepullsecret.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ImagePullSecret创建
         * Summary: ImagePullSecret创建
         */
        public async Task<CreateFederationImagepullsecretResponse> CreateFederationImagepullsecretExAsync(CreateFederationImagepullsecretRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationImagepullsecretResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.imagepullsecret.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list all pods of specific node
         * Summary: listtPodsOfNode
         */
        public ListClusterNodepodResponse ListClusterNodepod(ListClusterNodepodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListClusterNodepodEx(request, headers, runtime);
        }

        /**
         * Description: list all pods of specific node
         * Summary: listtPodsOfNode
         */
        public async Task<ListClusterNodepodResponse> ListClusterNodepodAsync(ListClusterNodepodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListClusterNodepodExAsync(request, headers, runtime);
        }

        /**
         * Description: list all pods of specific node
         * Summary: listtPodsOfNode
         */
        public ListClusterNodepodResponse ListClusterNodepodEx(ListClusterNodepodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterNodepodResponse>(DoRequest("1.0", "antcloud.ldc.cluster.nodepod.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list all pods of specific node
         * Summary: listtPodsOfNode
         */
        public async Task<ListClusterNodepodResponse> ListClusterNodepodExAsync(ListClusterNodepodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterNodepodResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.nodepod.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list all events of specific node
         * Summary: listEventOfNode
         */
        public ListClusterNodeeventResponse ListClusterNodeevent(ListClusterNodeeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListClusterNodeeventEx(request, headers, runtime);
        }

        /**
         * Description: list all events of specific node
         * Summary: listEventOfNode
         */
        public async Task<ListClusterNodeeventResponse> ListClusterNodeeventAsync(ListClusterNodeeventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListClusterNodeeventExAsync(request, headers, runtime);
        }

        /**
         * Description: list all events of specific node
         * Summary: listEventOfNode
         */
        public ListClusterNodeeventResponse ListClusterNodeeventEx(ListClusterNodeeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterNodeeventResponse>(DoRequest("1.0", "antcloud.ldc.cluster.nodeevent.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list all events of specific node
         * Summary: listEventOfNode
         */
        public async Task<ListClusterNodeeventResponse> ListClusterNodeeventExAsync(ListClusterNodeeventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterNodeeventResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.nodeevent.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询发布单列表
         * Summary: 分页查询发布单列表
         */
        public QueryOpsplanResponse QueryOpsplan(QueryOpsplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOpsplanEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询发布单列表
         * Summary: 分页查询发布单列表
         */
        public async Task<QueryOpsplanResponse> QueryOpsplanAsync(QueryOpsplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOpsplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询发布单列表
         * Summary: 分页查询发布单列表
         */
        public QueryOpsplanResponse QueryOpsplanEx(QueryOpsplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询发布单列表
         * Summary: 分页查询发布单列表
         */
        public async Task<QueryOpsplanResponse> QueryOpsplanExAsync(QueryOpsplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询发布单状态概要列表
         * Summary: 分页查询发布单状态概要列表
         */
        public QueryOpsplanStatesummaryResponse QueryOpsplanStatesummary(QueryOpsplanStatesummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOpsplanStatesummaryEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询发布单状态概要列表
         * Summary: 分页查询发布单状态概要列表
         */
        public async Task<QueryOpsplanStatesummaryResponse> QueryOpsplanStatesummaryAsync(QueryOpsplanStatesummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOpsplanStatesummaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询发布单状态概要列表
         * Summary: 分页查询发布单状态概要列表
         */
        public QueryOpsplanStatesummaryResponse QueryOpsplanStatesummaryEx(QueryOpsplanStatesummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanStatesummaryResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.statesummary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询发布单状态概要列表
         * Summary: 分页查询发布单状态概要列表
         */
        public async Task<QueryOpsplanStatesummaryResponse> QueryOpsplanStatesummaryExAsync(QueryOpsplanStatesummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanStatesummaryResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.statesummary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布/运维单详情查询
         * Summary: 发布/运维单详情查询
         */
        public QueryOpsplanDetailResponse QueryOpsplanDetail(QueryOpsplanDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOpsplanDetailEx(request, headers, runtime);
        }

        /**
         * Description: 发布/运维单详情查询
         * Summary: 发布/运维单详情查询
         */
        public async Task<QueryOpsplanDetailResponse> QueryOpsplanDetailAsync(QueryOpsplanDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOpsplanDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布/运维单详情查询
         * Summary: 发布/运维单详情查询
         */
        public QueryOpsplanDetailResponse QueryOpsplanDetailEx(QueryOpsplanDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanDetailResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布/运维单详情查询
         * Summary: 发布/运维单详情查询
         */
        public async Task<QueryOpsplanDetailResponse> QueryOpsplanDetailExAsync(QueryOpsplanDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanDetailResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
         * Summary: 查询公共的以及租户内自定义技术栈分类
         */
        public QueryBuildpackTechstackResponse QueryBuildpackTechstack(QueryBuildpackTechstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackTechstackEx(request, headers, runtime);
        }

        /**
         * Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
         * Summary: 查询公共的以及租户内自定义技术栈分类
         */
        public async Task<QueryBuildpackTechstackResponse> QueryBuildpackTechstackAsync(QueryBuildpackTechstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackTechstackExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
         * Summary: 查询公共的以及租户内自定义技术栈分类
         */
        public QueryBuildpackTechstackResponse QueryBuildpackTechstackEx(QueryBuildpackTechstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackTechstackResponse>(DoRequest("1.0", "antcloud.ldc.buildpack.techstack.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询公共技术栈类型，如SOFA|SOFABOOT，包括（如果存在的话）用户自定义技术栈类型，如 MYBANK_SOFA
         * Summary: 查询公共的以及租户内自定义技术栈分类
         */
        public async Task<QueryBuildpackTechstackResponse> QueryBuildpackTechstackExAsync(QueryBuildpackTechstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackTechstackResponse>(await DoRequestAsync("1.0", "antcloud.ldc.buildpack.techstack.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
        e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
         * Summary: 获取云原生技术栈小版本列表信息
         */
        public QueryBuildpackNativetechstackversionResponse QueryBuildpackNativetechstackversion(QueryBuildpackNativetechstackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackNativetechstackversionEx(request, headers, runtime);
        }

        /**
         * Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
        e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
         * Summary: 获取云原生技术栈小版本列表信息
         */
        public async Task<QueryBuildpackNativetechstackversionResponse> QueryBuildpackNativetechstackversionAsync(QueryBuildpackNativetechstackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackNativetechstackversionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
        e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
         * Summary: 获取云原生技术栈小版本列表信息
         */
        public QueryBuildpackNativetechstackversionResponse QueryBuildpackNativetechstackversionEx(QueryBuildpackNativetechstackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackNativetechstackversionResponse>(DoRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定技术栈类别下全局可见的云原生技术栈版本以及租户内扩展的自定义版本
        e.g: ce4456_jdk7_tengine, enhanced_ce4456_jdk7_tengine16
         * Summary: 获取云原生技术栈小版本列表信息
         */
        public async Task<QueryBuildpackNativetechstackversionResponse> QueryBuildpackNativetechstackversionExAsync(QueryBuildpackNativetechstackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackNativetechstackversionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.buildpack.nativetechstackversion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新容器应用服务的云原生技术栈版本。
        e.g: 更新为 ce44610
         * Summary: 更新容器应用服务对应的云原生技术栈版本
         */
        public UpdateContainerserviceNativebpversionResponse UpdateContainerserviceNativebpversion(UpdateContainerserviceNativebpversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContainerserviceNativebpversionEx(request, headers, runtime);
        }

        /**
         * Description: 更新容器应用服务的云原生技术栈版本。
        e.g: 更新为 ce44610
         * Summary: 更新容器应用服务对应的云原生技术栈版本
         */
        public async Task<UpdateContainerserviceNativebpversionResponse> UpdateContainerserviceNativebpversionAsync(UpdateContainerserviceNativebpversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContainerserviceNativebpversionExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新容器应用服务的云原生技术栈版本。
        e.g: 更新为 ce44610
         * Summary: 更新容器应用服务对应的云原生技术栈版本
         */
        public UpdateContainerserviceNativebpversionResponse UpdateContainerserviceNativebpversionEx(UpdateContainerserviceNativebpversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceNativebpversionResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.nativebpversion.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新容器应用服务的云原生技术栈版本。
        e.g: 更新为 ce44610
         * Summary: 更新容器应用服务对应的云原生技术栈版本
         */
        public async Task<UpdateContainerserviceNativebpversionResponse> UpdateContainerserviceNativebpversionExAsync(UpdateContainerserviceNativebpversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceNativebpversionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.nativebpversion.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成Dockerfile命令列表并获取
         * Summary: 获取容器服务对应的Dockerfile
         */
        public LoadContainerserviceDockerfileResponse LoadContainerserviceDockerfile(LoadContainerserviceDockerfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoadContainerserviceDockerfileEx(request, headers, runtime);
        }

        /**
         * Description: 生成Dockerfile命令列表并获取
         * Summary: 获取容器服务对应的Dockerfile
         */
        public async Task<LoadContainerserviceDockerfileResponse> LoadContainerserviceDockerfileAsync(LoadContainerserviceDockerfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoadContainerserviceDockerfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 生成Dockerfile命令列表并获取
         * Summary: 获取容器服务对应的Dockerfile
         */
        public LoadContainerserviceDockerfileResponse LoadContainerserviceDockerfileEx(LoadContainerserviceDockerfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadContainerserviceDockerfileResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.dockerfile.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成Dockerfile命令列表并获取
         * Summary: 获取容器服务对应的Dockerfile
         */
        public async Task<LoadContainerserviceDockerfileResponse> LoadContainerserviceDockerfileExAsync(LoadContainerserviceDockerfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadContainerserviceDockerfileResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.dockerfile.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建云原生技术栈版本
         * Summary: 创建云原生技术栈版本
         */
        public CreateBuildpackNativetechstackversionResponse CreateBuildpackNativetechstackversion(CreateBuildpackNativetechstackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBuildpackNativetechstackversionEx(request, headers, runtime);
        }

        /**
         * Description: 创建云原生技术栈版本
         * Summary: 创建云原生技术栈版本
         */
        public async Task<CreateBuildpackNativetechstackversionResponse> CreateBuildpackNativetechstackversionAsync(CreateBuildpackNativetechstackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBuildpackNativetechstackversionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建云原生技术栈版本
         * Summary: 创建云原生技术栈版本
         */
        public CreateBuildpackNativetechstackversionResponse CreateBuildpackNativetechstackversionEx(CreateBuildpackNativetechstackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBuildpackNativetechstackversionResponse>(DoRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建云原生技术栈版本
         * Summary: 创建云原生技术栈版本
         */
        public async Task<CreateBuildpackNativetechstackversionResponse> CreateBuildpackNativetechstackversionExAsync(CreateBuildpackNativetechstackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBuildpackNativetechstackversionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.buildpack.nativetechstackversion.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get zonelist of each workspace in a workspace group
         * Summary: getZoneListOfWSG
         */
        public ListMulticlusterZoneResponse ListMulticlusterZone(ListMulticlusterZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListMulticlusterZoneEx(request, headers, runtime);
        }

        /**
         * Description: get zonelist of each workspace in a workspace group
         * Summary: getZoneListOfWSG
         */
        public async Task<ListMulticlusterZoneResponse> ListMulticlusterZoneAsync(ListMulticlusterZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListMulticlusterZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: get zonelist of each workspace in a workspace group
         * Summary: getZoneListOfWSG
         */
        public ListMulticlusterZoneResponse ListMulticlusterZoneEx(ListMulticlusterZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMulticlusterZoneResponse>(DoRequest("1.0", "antcloud.ldc.multicluster.zone.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: get zonelist of each workspace in a workspace group
         * Summary: getZoneListOfWSG
         */
        public async Task<ListMulticlusterZoneResponse> ListMulticlusterZoneExAsync(ListMulticlusterZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMulticlusterZoneResponse>(await DoRequestAsync("1.0", "antcloud.ldc.multicluster.zone.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
         * Summary: 发布/运维单发布任务操作
         */
        public ExecOpsplanAppopstaskResponse ExecOpsplanAppopstask(ExecOpsplanAppopstaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecOpsplanAppopstaskEx(request, headers, runtime);
        }

        /**
         * Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
         * Summary: 发布/运维单发布任务操作
         */
        public async Task<ExecOpsplanAppopstaskResponse> ExecOpsplanAppopstaskAsync(ExecOpsplanAppopstaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecOpsplanAppopstaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
         * Summary: 发布/运维单发布任务操作
         */
        public ExecOpsplanAppopstaskResponse ExecOpsplanAppopstaskEx(ExecOpsplanAppopstaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecOpsplanAppopstaskResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.appopstask.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布/运维单发布任务操作，发布单任务是发布单可以操作的最小单元，操作类型包括重试、跳过、确认等操作
         * Summary: 发布/运维单发布任务操作
         */
        public async Task<ExecOpsplanAppopstaskResponse> ExecOpsplanAppopstaskExAsync(ExecOpsplanAppopstaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecOpsplanAppopstaskResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.appopstask.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
         * Summary: 发布单进度查询
         */
        public QueryOpsplanProgressResponse QueryOpsplanProgress(QueryOpsplanProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOpsplanProgressEx(request, headers, runtime);
        }

        /**
         * Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
         * Summary: 发布单进度查询
         */
        public async Task<QueryOpsplanProgressResponse> QueryOpsplanProgressAsync(QueryOpsplanProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOpsplanProgressExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
         * Summary: 发布单进度查询
         */
        public QueryOpsplanProgressResponse QueryOpsplanProgressEx(QueryOpsplanProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanProgressResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布单进度查询，包括发布单状态机应用整体的执行情况以及每个应用内部的执行进度状态汇总
         * Summary: 发布单进度查询
         */
        public async Task<QueryOpsplanProgressResponse> QueryOpsplanProgressExAsync(QueryOpsplanProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanProgressResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布(运维)单应进度查询
         * Summary: 发布(运维)单应进度查询
         */
        public QueryOpsplanAppprogressResponse QueryOpsplanAppprogress(QueryOpsplanAppprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOpsplanAppprogressEx(request, headers, runtime);
        }

        /**
         * Description: 发布(运维)单应进度查询
         * Summary: 发布(运维)单应进度查询
         */
        public async Task<QueryOpsplanAppprogressResponse> QueryOpsplanAppprogressAsync(QueryOpsplanAppprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOpsplanAppprogressExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布(运维)单应进度查询
         * Summary: 发布(运维)单应进度查询
         */
        public QueryOpsplanAppprogressResponse QueryOpsplanAppprogressEx(QueryOpsplanAppprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanAppprogressResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.appprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布(运维)单应进度查询
         * Summary: 发布(运维)单应进度查询
         */
        public async Task<QueryOpsplanAppprogressResponse> QueryOpsplanAppprogressExAsync(QueryOpsplanAppprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsplanAppprogressResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.appprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 容器服务pod列表
         * Summary: 容器服务pod列表
         */
        public ListContainerservicePodResponse ListContainerservicePod(ListContainerservicePodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContainerservicePodEx(request, headers, runtime);
        }

        /**
         * Description: 容器服务pod列表
         * Summary: 容器服务pod列表
         */
        public async Task<ListContainerservicePodResponse> ListContainerservicePodAsync(ListContainerservicePodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContainerservicePodExAsync(request, headers, runtime);
        }

        /**
         * Description: 容器服务pod列表
         * Summary: 容器服务pod列表
         */
        public ListContainerservicePodResponse ListContainerservicePodEx(ListContainerservicePodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContainerservicePodResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.pod.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 容器服务pod列表
         * Summary: 容器服务pod列表
         */
        public async Task<ListContainerservicePodResponse> ListContainerservicePodExAsync(ListContainerservicePodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContainerservicePodResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.pod.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: To list kubeevents
         * Summary: To list kubeevents
         */
        public ListContainerserviceKubeeventsResponse ListContainerserviceKubeevents(ListContainerserviceKubeeventsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContainerserviceKubeeventsEx(request, headers, runtime);
        }

        /**
         * Description: To list kubeevents
         * Summary: To list kubeevents
         */
        public async Task<ListContainerserviceKubeeventsResponse> ListContainerserviceKubeeventsAsync(ListContainerserviceKubeeventsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContainerserviceKubeeventsExAsync(request, headers, runtime);
        }

        /**
         * Description: To list kubeevents
         * Summary: To list kubeevents
         */
        public ListContainerserviceKubeeventsResponse ListContainerserviceKubeeventsEx(ListContainerserviceKubeeventsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContainerserviceKubeeventsResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.kubeevents.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: To list kubeevents
         * Summary: To list kubeevents
         */
        public async Task<ListContainerserviceKubeeventsResponse> ListContainerserviceKubeeventsExAsync(ListContainerserviceKubeeventsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContainerserviceKubeeventsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.kubeevents.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Pod事件列表
         * Summary: 查询Pod事件列表
         */
        public ListPodEventsResponse ListPodEvents(ListPodEventsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListPodEventsEx(request, headers, runtime);
        }

        /**
         * Description: 查询Pod事件列表
         * Summary: 查询Pod事件列表
         */
        public async Task<ListPodEventsResponse> ListPodEventsAsync(ListPodEventsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListPodEventsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询Pod事件列表
         * Summary: 查询Pod事件列表
         */
        public ListPodEventsResponse ListPodEventsEx(ListPodEventsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListPodEventsResponse>(DoRequest("1.0", "antcloud.ldc.pod.events.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Pod事件列表
         * Summary: 查询Pod事件列表
         */
        public async Task<ListPodEventsResponse> ListPodEventsExAsync(ListPodEventsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListPodEventsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.pod.events.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Pod事件列表
         * Summary: 查询Pod容器列表
         */
        public ListPodContainersResponse ListPodContainers(ListPodContainersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListPodContainersEx(request, headers, runtime);
        }

        /**
         * Description: 查询Pod事件列表
         * Summary: 查询Pod容器列表
         */
        public async Task<ListPodContainersResponse> ListPodContainersAsync(ListPodContainersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListPodContainersExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询Pod事件列表
         * Summary: 查询Pod容器列表
         */
        public ListPodContainersResponse ListPodContainersEx(ListPodContainersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListPodContainersResponse>(DoRequest("1.0", "antcloud.ldc.pod.containers.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Pod事件列表
         * Summary: 查询Pod容器列表
         */
        public async Task<ListPodContainersResponse> ListPodContainersExAsync(ListPodContainersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListPodContainersResponse>(await DoRequestAsync("1.0", "antcloud.ldc.pod.containers.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query replica cell
         * Summary: query replica cell
         */
        public QueryContainerserviceCellResponse QueryContainerserviceCell(QueryContainerserviceCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContainerserviceCellEx(request, headers, runtime);
        }

        /**
         * Description: query replica cell
         * Summary: query replica cell
         */
        public async Task<QueryContainerserviceCellResponse> QueryContainerserviceCellAsync(QueryContainerserviceCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContainerserviceCellExAsync(request, headers, runtime);
        }

        /**
         * Description: query replica cell
         * Summary: query replica cell
         */
        public QueryContainerserviceCellResponse QueryContainerserviceCellEx(QueryContainerserviceCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContainerserviceCellResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query replica cell
         * Summary: query replica cell
         */
        public async Task<QueryContainerserviceCellResponse> QueryContainerserviceCellExAsync(QueryContainerserviceCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContainerserviceCellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建逻辑单元
         * Summary: 创建逻辑单元
         */
        public CreateCellgroupResponse CreateCellgroup(CreateCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCellgroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建逻辑单元
         * Summary: 创建逻辑单元
         */
        public async Task<CreateCellgroupResponse> CreateCellgroupAsync(CreateCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCellgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建逻辑单元
         * Summary: 创建逻辑单元
         */
        public CreateCellgroupResponse CreateCellgroupEx(CreateCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCellgroupResponse>(DoRequest("1.0", "antcloud.ldc.cellgroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建逻辑单元
         * Summary: 创建逻辑单元
         */
        public async Task<CreateCellgroupResponse> CreateCellgroupExAsync(CreateCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCellgroupResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cellgroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取cellgroup列表
         * Summary: 获取cellgroup列表
         */
        public ListCellgroupResponse ListCellgroup(ListCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCellgroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取cellgroup列表
         * Summary: 获取cellgroup列表
         */
        public async Task<ListCellgroupResponse> ListCellgroupAsync(ListCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCellgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取cellgroup列表
         * Summary: 获取cellgroup列表
         */
        public ListCellgroupResponse ListCellgroupEx(ListCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCellgroupResponse>(DoRequest("1.0", "antcloud.ldc.cellgroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取cellgroup列表
         * Summary: 获取cellgroup列表
         */
        public async Task<ListCellgroupResponse> ListCellgroupExAsync(ListCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCellgroupResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cellgroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置逻辑单元灾备信息
         * Summary: 配置逻辑单元灾备信息
         */
        public UpdateCellgroupDisasterinfoResponse UpdateCellgroupDisasterinfo(UpdateCellgroupDisasterinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCellgroupDisasterinfoEx(request, headers, runtime);
        }

        /**
         * Description: 配置逻辑单元灾备信息
         * Summary: 配置逻辑单元灾备信息
         */
        public async Task<UpdateCellgroupDisasterinfoResponse> UpdateCellgroupDisasterinfoAsync(UpdateCellgroupDisasterinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCellgroupDisasterinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 配置逻辑单元灾备信息
         * Summary: 配置逻辑单元灾备信息
         */
        public UpdateCellgroupDisasterinfoResponse UpdateCellgroupDisasterinfoEx(UpdateCellgroupDisasterinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCellgroupDisasterinfoResponse>(DoRequest("1.0", "antcloud.ldc.cellgroup.disasterinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置逻辑单元灾备信息
         * Summary: 配置逻辑单元灾备信息
         */
        public async Task<UpdateCellgroupDisasterinfoResponse> UpdateCellgroupDisasterinfoExAsync(UpdateCellgroupDisasterinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCellgroupDisasterinfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cellgroup.disasterinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除逻辑单元
         * Summary: 删除逻辑单元
         */
        public DeleteCellgroupResponse DeleteCellgroup(DeleteCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteCellgroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除逻辑单元
         * Summary: 删除逻辑单元
         */
        public async Task<DeleteCellgroupResponse> DeleteCellgroupAsync(DeleteCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteCellgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除逻辑单元
         * Summary: 删除逻辑单元
         */
        public DeleteCellgroupResponse DeleteCellgroupEx(DeleteCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCellgroupResponse>(DoRequest("1.0", "antcloud.ldc.cellgroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除逻辑单元
         * Summary: 删除逻辑单元
         */
        public async Task<DeleteCellgroupResponse> DeleteCellgroupExAsync(DeleteCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCellgroupResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cellgroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元列表
         * Summary: 查询部署单元列表
         */
        public ListCellResponse ListCell(ListCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元列表
         * Summary: 查询部署单元列表
         */
        public async Task<ListCellResponse> ListCellAsync(ListCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元列表
         * Summary: 查询部署单元列表
         */
        public ListCellResponse ListCellEx(ListCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCellResponse>(DoRequest("1.0", "antcloud.ldc.cell.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元列表
         * Summary: 查询部署单元列表
         */
        public async Task<ListCellResponse> ListCellExAsync(ListCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cell.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建部署单元。
         * Summary: 创建部署单元
         */
        public CreateCellResponse CreateCell(CreateCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateCellEx(request, headers, runtime);
        }

        /**
         * Description: 创建部署单元。
         * Summary: 创建部署单元
         */
        public async Task<CreateCellResponse> CreateCellAsync(CreateCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建部署单元。
         * Summary: 创建部署单元
         */
        public CreateCellResponse CreateCellEx(CreateCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCellResponse>(DoRequest("1.0", "antcloud.ldc.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建部署单元。
         * Summary: 创建部署单元
         */
        public async Task<CreateCellResponse> CreateCellExAsync(CreateCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除部署单元。
         * Summary: 删除部署单元
         */
        public DeleteCellResponse DeleteCell(DeleteCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteCellEx(request, headers, runtime);
        }

        /**
         * Description: 删除部署单元。
         * Summary: 删除部署单元
         */
        public async Task<DeleteCellResponse> DeleteCellAsync(DeleteCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除部署单元。
         * Summary: 删除部署单元
         */
        public DeleteCellResponse DeleteCellEx(DeleteCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCellResponse>(DoRequest("1.0", "antcloud.ldc.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除部署单元。
         * Summary: 删除部署单元
         */
        public async Task<DeleteCellResponse> DeleteCellExAsync(DeleteCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除pod
         * Summary: 删除pod
         */
        public DeletePodResponse DeletePod(DeletePodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeletePodEx(request, headers, runtime);
        }

        /**
         * Description: 删除pod
         * Summary: 删除pod
         */
        public async Task<DeletePodResponse> DeletePodAsync(DeletePodRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeletePodExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除pod
         * Summary: 删除pod
         */
        public DeletePodResponse DeletePodEx(DeletePodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeletePodResponse>(DoRequest("1.0", "antcloud.ldc.pod.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除pod
         * Summary: 删除pod
         */
        public async Task<DeletePodResponse> DeletePodExAsync(DeletePodRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeletePodResponse>(await DoRequestAsync("1.0", "antcloud.ldc.pod.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境部署单元拓扑
         * Summary: 查询环境部署单元拓扑
         */
        public GetWorkspacegroupTopologyResponse GetWorkspacegroupTopology(GetWorkspacegroupTopologyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWorkspacegroupTopologyEx(request, headers, runtime);
        }

        /**
         * Description: 查询环境部署单元拓扑
         * Summary: 查询环境部署单元拓扑
         */
        public async Task<GetWorkspacegroupTopologyResponse> GetWorkspacegroupTopologyAsync(GetWorkspacegroupTopologyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWorkspacegroupTopologyExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询环境部署单元拓扑
         * Summary: 查询环境部署单元拓扑
         */
        public GetWorkspacegroupTopologyResponse GetWorkspacegroupTopologyEx(GetWorkspacegroupTopologyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspacegroupTopologyResponse>(DoRequest("1.0", "antcloud.ldc.workspacegroup.topology.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境部署单元拓扑
         * Summary: 查询环境部署单元拓扑
         */
        public async Task<GetWorkspacegroupTopologyResponse> GetWorkspacegroupTopologyExAsync(GetWorkspacegroupTopologyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspacegroupTopologyResponse>(await DoRequestAsync("1.0", "antcloud.ldc.workspacegroup.topology.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改 cell 权重
         * Summary: 修改 cell 权重
         */
        public UpdateFlowCellweightResponse UpdateFlowCellweight(UpdateFlowCellweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFlowCellweightEx(request, headers, runtime);
        }

        /**
         * Description: 修改 cell 权重
         * Summary: 修改 cell 权重
         */
        public async Task<UpdateFlowCellweightResponse> UpdateFlowCellweightAsync(UpdateFlowCellweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFlowCellweightExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改 cell 权重
         * Summary: 修改 cell 权重
         */
        public UpdateFlowCellweightResponse UpdateFlowCellweightEx(UpdateFlowCellweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowCellweightResponse>(DoRequest("1.0", "antcloud.ldc.flow.cellweight.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改 cell 权重
         * Summary: 修改 cell 权重
         */
        public async Task<UpdateFlowCellweightResponse> UpdateFlowCellweightExAsync(UpdateFlowCellweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowCellweightResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.cellweight.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: uid 分片调整
         * Summary: uid 分片调整
         */
        public UpdateFlowUidrangeResponse UpdateFlowUidrange(UpdateFlowUidrangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFlowUidrangeEx(request, headers, runtime);
        }

        /**
         * Description: uid 分片调整
         * Summary: uid 分片调整
         */
        public async Task<UpdateFlowUidrangeResponse> UpdateFlowUidrangeAsync(UpdateFlowUidrangeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFlowUidrangeExAsync(request, headers, runtime);
        }

        /**
         * Description: uid 分片调整
         * Summary: uid 分片调整
         */
        public UpdateFlowUidrangeResponse UpdateFlowUidrangeEx(UpdateFlowUidrangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowUidrangeResponse>(DoRequest("1.0", "antcloud.ldc.flow.uidrange.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: uid 分片调整
         * Summary: uid 分片调整
         */
        public async Task<UpdateFlowUidrangeResponse> UpdateFlowUidrangeExAsync(UpdateFlowUidrangeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowUidrangeResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.uidrange.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 弹出 UID 到弹性部署单元
         * Summary: 弹出 UID 到弹性部署单元
         */
        public EnableFlowElasticuidResponse EnableFlowElasticuid(EnableFlowElasticuidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableFlowElasticuidEx(request, headers, runtime);
        }

        /**
         * Description: 弹出 UID 到弹性部署单元
         * Summary: 弹出 UID 到弹性部署单元
         */
        public async Task<EnableFlowElasticuidResponse> EnableFlowElasticuidAsync(EnableFlowElasticuidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableFlowElasticuidExAsync(request, headers, runtime);
        }

        /**
         * Description: 弹出 UID 到弹性部署单元
         * Summary: 弹出 UID 到弹性部署单元
         */
        public EnableFlowElasticuidResponse EnableFlowElasticuidEx(EnableFlowElasticuidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableFlowElasticuidResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticuid.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 弹出 UID 到弹性部署单元
         * Summary: 弹出 UID 到弹性部署单元
         */
        public async Task<EnableFlowElasticuidResponse> EnableFlowElasticuidExAsync(EnableFlowElasticuidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableFlowElasticuidResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticuid.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 弹回 UID 分片
         * Summary: 弹回 UID 分片
         */
        public DisableFlowElasticuidResponse DisableFlowElasticuid(DisableFlowElasticuidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableFlowElasticuidEx(request, headers, runtime);
        }

        /**
         * Description: 弹回 UID 分片
         * Summary: 弹回 UID 分片
         */
        public async Task<DisableFlowElasticuidResponse> DisableFlowElasticuidAsync(DisableFlowElasticuidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableFlowElasticuidExAsync(request, headers, runtime);
        }

        /**
         * Description: 弹回 UID 分片
         * Summary: 弹回 UID 分片
         */
        public DisableFlowElasticuidResponse DisableFlowElasticuidEx(DisableFlowElasticuidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableFlowElasticuidResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticuid.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 弹回 UID 分片
         * Summary: 弹回 UID 分片
         */
        public async Task<DisableFlowElasticuidResponse> DisableFlowElasticuidExAsync(DisableFlowElasticuidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableFlowElasticuidResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticuid.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出当前的流量规则
         * Summary: 导出当前的流量规则
         */
        public ExportFlowRuleResponse ExportFlowRule(ExportFlowRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportFlowRuleEx(request, headers, runtime);
        }

        /**
         * Description: 导出当前的流量规则
         * Summary: 导出当前的流量规则
         */
        public async Task<ExportFlowRuleResponse> ExportFlowRuleAsync(ExportFlowRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportFlowRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 导出当前的流量规则
         * Summary: 导出当前的流量规则
         */
        public ExportFlowRuleResponse ExportFlowRuleEx(ExportFlowRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportFlowRuleResponse>(DoRequest("1.0", "antcloud.ldc.flow.rule.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出当前的流量规则
         * Summary: 导出当前的流量规则
         */
        public async Task<ExportFlowRuleResponse> ExportFlowRuleExAsync(ExportFlowRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportFlowRuleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.rule.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送流量规则
         * Summary: 推送流量规则
         */
        public PushFlowRuleResponse PushFlowRule(PushFlowRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushFlowRuleEx(request, headers, runtime);
        }

        /**
         * Description: 推送流量规则
         * Summary: 推送流量规则
         */
        public async Task<PushFlowRuleResponse> PushFlowRuleAsync(PushFlowRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushFlowRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 推送流量规则
         * Summary: 推送流量规则
         */
        public PushFlowRuleResponse PushFlowRuleEx(PushFlowRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushFlowRuleResponse>(DoRequest("1.0", "antcloud.ldc.flow.rule.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 推送流量规则
         * Summary: 推送流量规则
         */
        public async Task<PushFlowRuleResponse> PushFlowRuleExAsync(PushFlowRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushFlowRuleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.rule.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建弹性规则
         * Summary: 创建弹性规则
         */
        public AddFlowElasticruleResponse AddFlowElasticrule(AddFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddFlowElasticruleEx(request, headers, runtime);
        }

        /**
         * Description: 创建弹性规则
         * Summary: 创建弹性规则
         */
        public async Task<AddFlowElasticruleResponse> AddFlowElasticruleAsync(AddFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddFlowElasticruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建弹性规则
         * Summary: 创建弹性规则
         */
        public AddFlowElasticruleResponse AddFlowElasticruleEx(AddFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddFlowElasticruleResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建弹性规则
         * Summary: 创建弹性规则
         */
        public async Task<AddFlowElasticruleResponse> AddFlowElasticruleExAsync(AddFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddFlowElasticruleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新弹性规则
         * Summary: 更新弹性规则
         */
        public UpdateFlowElasticruleResponse UpdateFlowElasticrule(UpdateFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFlowElasticruleEx(request, headers, runtime);
        }

        /**
         * Description: 更新弹性规则
         * Summary: 更新弹性规则
         */
        public async Task<UpdateFlowElasticruleResponse> UpdateFlowElasticruleAsync(UpdateFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFlowElasticruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新弹性规则
         * Summary: 更新弹性规则
         */
        public UpdateFlowElasticruleResponse UpdateFlowElasticruleEx(UpdateFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowElasticruleResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticrule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新弹性规则
         * Summary: 更新弹性规则
         */
        public async Task<UpdateFlowElasticruleResponse> UpdateFlowElasticruleExAsync(UpdateFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowElasticruleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticrule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除弹性规则
         * Summary: 删除弹性规则
         */
        public DeleteFlowElasticruleResponse DeleteFlowElasticrule(DeleteFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFlowElasticruleEx(request, headers, runtime);
        }

        /**
         * Description: 删除弹性规则
         * Summary: 删除弹性规则
         */
        public async Task<DeleteFlowElasticruleResponse> DeleteFlowElasticruleAsync(DeleteFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFlowElasticruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除弹性规则
         * Summary: 删除弹性规则
         */
        public DeleteFlowElasticruleResponse DeleteFlowElasticruleEx(DeleteFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowElasticruleResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除弹性规则
         * Summary: 删除弹性规则
         */
        public async Task<DeleteFlowElasticruleResponse> DeleteFlowElasticruleExAsync(DeleteFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowElasticruleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加弹性子规则
         * Summary: 添加弹性子规则
         */
        public AddFlowElasticsubruleResponse AddFlowElasticsubrule(AddFlowElasticsubruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddFlowElasticsubruleEx(request, headers, runtime);
        }

        /**
         * Description: 添加弹性子规则
         * Summary: 添加弹性子规则
         */
        public async Task<AddFlowElasticsubruleResponse> AddFlowElasticsubruleAsync(AddFlowElasticsubruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddFlowElasticsubruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加弹性子规则
         * Summary: 添加弹性子规则
         */
        public AddFlowElasticsubruleResponse AddFlowElasticsubruleEx(AddFlowElasticsubruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddFlowElasticsubruleResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticsubrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加弹性子规则
         * Summary: 添加弹性子规则
         */
        public async Task<AddFlowElasticsubruleResponse> AddFlowElasticsubruleExAsync(AddFlowElasticsubruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddFlowElasticsubruleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticsubrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除子弹性规则
         * Summary: 删除子弹性规则
         */
        public DeleteFlowElasticsubruleResponse DeleteFlowElasticsubrule(DeleteFlowElasticsubruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFlowElasticsubruleEx(request, headers, runtime);
        }

        /**
         * Description: 删除子弹性规则
         * Summary: 删除子弹性规则
         */
        public async Task<DeleteFlowElasticsubruleResponse> DeleteFlowElasticsubruleAsync(DeleteFlowElasticsubruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFlowElasticsubruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除子弹性规则
         * Summary: 删除子弹性规则
         */
        public DeleteFlowElasticsubruleResponse DeleteFlowElasticsubruleEx(DeleteFlowElasticsubruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowElasticsubruleResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticsubrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除子弹性规则
         * Summary: 删除子弹性规则
         */
        public async Task<DeleteFlowElasticsubruleResponse> DeleteFlowElasticsubruleExAsync(DeleteFlowElasticsubruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowElasticsubruleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticsubrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量更新弹性规则状态
         * Summary: 批量更新弹性规则状态
         */
        public UpdateFlowElasticrulestatusResponse UpdateFlowElasticrulestatus(UpdateFlowElasticrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFlowElasticrulestatusEx(request, headers, runtime);
        }

        /**
         * Description: 批量更新弹性规则状态
         * Summary: 批量更新弹性规则状态
         */
        public async Task<UpdateFlowElasticrulestatusResponse> UpdateFlowElasticrulestatusAsync(UpdateFlowElasticrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFlowElasticrulestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量更新弹性规则状态
         * Summary: 批量更新弹性规则状态
         */
        public UpdateFlowElasticrulestatusResponse UpdateFlowElasticrulestatusEx(UpdateFlowElasticrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowElasticrulestatusResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量更新弹性规则状态
         * Summary: 批量更新弹性规则状态
         */
        public async Task<UpdateFlowElasticrulestatusResponse> UpdateFlowElasticrulestatusExAsync(UpdateFlowElasticrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowElasticrulestatusResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除弹性规则
         * Summary: 批量删除弹性规则
         */
        public BatchdeleteFlowElasticruleResponse BatchdeleteFlowElasticrule(BatchdeleteFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteFlowElasticruleEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除弹性规则
         * Summary: 批量删除弹性规则
         */
        public async Task<BatchdeleteFlowElasticruleResponse> BatchdeleteFlowElasticruleAsync(BatchdeleteFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteFlowElasticruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除弹性规则
         * Summary: 批量删除弹性规则
         */
        public BatchdeleteFlowElasticruleResponse BatchdeleteFlowElasticruleEx(BatchdeleteFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteFlowElasticruleResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticrule.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除弹性规则
         * Summary: 批量删除弹性规则
         */
        public async Task<BatchdeleteFlowElasticruleResponse> BatchdeleteFlowElasticruleExAsync(BatchdeleteFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteFlowElasticruleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticrule.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建弹性场景
         * Summary: 创建弹性场景
         */
        public CreateFlowElasticsceneResponse CreateFlowElasticscene(CreateFlowElasticsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFlowElasticsceneEx(request, headers, runtime);
        }

        /**
         * Description: 创建弹性场景
         * Summary: 创建弹性场景
         */
        public async Task<CreateFlowElasticsceneResponse> CreateFlowElasticsceneAsync(CreateFlowElasticsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFlowElasticsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建弹性场景
         * Summary: 创建弹性场景
         */
        public CreateFlowElasticsceneResponse CreateFlowElasticsceneEx(CreateFlowElasticsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowElasticsceneResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticscene.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建弹性场景
         * Summary: 创建弹性场景
         */
        public async Task<CreateFlowElasticsceneResponse> CreateFlowElasticsceneExAsync(CreateFlowElasticsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowElasticsceneResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticscene.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改弹性场景
         * Summary: 修改弹性场景
         */
        public UpdateFlowElasticsceneResponse UpdateFlowElasticscene(UpdateFlowElasticsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFlowElasticsceneEx(request, headers, runtime);
        }

        /**
         * Description: 修改弹性场景
         * Summary: 修改弹性场景
         */
        public async Task<UpdateFlowElasticsceneResponse> UpdateFlowElasticsceneAsync(UpdateFlowElasticsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFlowElasticsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改弹性场景
         * Summary: 修改弹性场景
         */
        public UpdateFlowElasticsceneResponse UpdateFlowElasticsceneEx(UpdateFlowElasticsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowElasticsceneResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticscene.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改弹性场景
         * Summary: 修改弹性场景
         */
        public async Task<UpdateFlowElasticsceneResponse> UpdateFlowElasticsceneExAsync(UpdateFlowElasticsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowElasticsceneResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticscene.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除弹性场景
         * Summary: 删除弹性场景
         */
        public DeleteFlowElasticsceneResponse DeleteFlowElasticscene(DeleteFlowElasticsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFlowElasticsceneEx(request, headers, runtime);
        }

        /**
         * Description: 删除弹性场景
         * Summary: 删除弹性场景
         */
        public async Task<DeleteFlowElasticsceneResponse> DeleteFlowElasticsceneAsync(DeleteFlowElasticsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFlowElasticsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除弹性场景
         * Summary: 删除弹性场景
         */
        public DeleteFlowElasticsceneResponse DeleteFlowElasticsceneEx(DeleteFlowElasticsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowElasticsceneResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticscene.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除弹性场景
         * Summary: 删除弹性场景
         */
        public async Task<DeleteFlowElasticsceneResponse> DeleteFlowElasticsceneExAsync(DeleteFlowElasticsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowElasticsceneResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticscene.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置弹性值
         * Summary: 配置弹性值
         */
        public SetFlowElasticvalueResponse SetFlowElasticvalue(SetFlowElasticvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetFlowElasticvalueEx(request, headers, runtime);
        }

        /**
         * Description: 配置弹性值
         * Summary: 配置弹性值
         */
        public async Task<SetFlowElasticvalueResponse> SetFlowElasticvalueAsync(SetFlowElasticvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetFlowElasticvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 配置弹性值
         * Summary: 配置弹性值
         */
        public SetFlowElasticvalueResponse SetFlowElasticvalueEx(SetFlowElasticvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetFlowElasticvalueResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticvalue.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置弹性值
         * Summary: 配置弹性值
         */
        public async Task<SetFlowElasticvalueResponse> SetFlowElasticvalueExAsync(SetFlowElasticvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetFlowElasticvalueResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticvalue.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复弹性值
         * Summary: 恢复弹性值
         */
        public DisableFlowElasticvalueResponse DisableFlowElasticvalue(DisableFlowElasticvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableFlowElasticvalueEx(request, headers, runtime);
        }

        /**
         * Description: 恢复弹性值
         * Summary: 恢复弹性值
         */
        public async Task<DisableFlowElasticvalueResponse> DisableFlowElasticvalueAsync(DisableFlowElasticvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableFlowElasticvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 恢复弹性值
         * Summary: 恢复弹性值
         */
        public DisableFlowElasticvalueResponse DisableFlowElasticvalueEx(DisableFlowElasticvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableFlowElasticvalueResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticvalue.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复弹性值
         * Summary: 恢复弹性值
         */
        public async Task<DisableFlowElasticvalueResponse> DisableFlowElasticvalueExAsync(DisableFlowElasticvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableFlowElasticvalueResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticvalue.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建站点
         * Summary: 创建站点
         */
        public CreateFlowSiteResponse CreateFlowSite(CreateFlowSiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFlowSiteEx(request, headers, runtime);
        }

        /**
         * Description: 创建站点
         * Summary: 创建站点
         */
        public async Task<CreateFlowSiteResponse> CreateFlowSiteAsync(CreateFlowSiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFlowSiteExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建站点
         * Summary: 创建站点
         */
        public CreateFlowSiteResponse CreateFlowSiteEx(CreateFlowSiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowSiteResponse>(DoRequest("1.0", "antcloud.ldc.flow.site.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建站点
         * Summary: 创建站点
         */
        public async Task<CreateFlowSiteResponse> CreateFlowSiteExAsync(CreateFlowSiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowSiteResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.site.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改站点信息
         * Summary: 修改站点信息
         */
        public UpdateFlowSiteResponse UpdateFlowSite(UpdateFlowSiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFlowSiteEx(request, headers, runtime);
        }

        /**
         * Description: 修改站点信息
         * Summary: 修改站点信息
         */
        public async Task<UpdateFlowSiteResponse> UpdateFlowSiteAsync(UpdateFlowSiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFlowSiteExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改站点信息
         * Summary: 修改站点信息
         */
        public UpdateFlowSiteResponse UpdateFlowSiteEx(UpdateFlowSiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowSiteResponse>(DoRequest("1.0", "antcloud.ldc.flow.site.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改站点信息
         * Summary: 修改站点信息
         */
        public async Task<UpdateFlowSiteResponse> UpdateFlowSiteExAsync(UpdateFlowSiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFlowSiteResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.site.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除站点
         * Summary: 删除站点
         */
        public DeleteFlowSiteResponse DeleteFlowSite(DeleteFlowSiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFlowSiteEx(request, headers, runtime);
        }

        /**
         * Description: 删除站点
         * Summary: 删除站点
         */
        public async Task<DeleteFlowSiteResponse> DeleteFlowSiteAsync(DeleteFlowSiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFlowSiteExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除站点
         * Summary: 删除站点
         */
        public DeleteFlowSiteResponse DeleteFlowSiteEx(DeleteFlowSiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowSiteResponse>(DoRequest("1.0", "antcloud.ldc.flow.site.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除站点
         * Summary: 删除站点
         */
        public async Task<DeleteFlowSiteResponse> DeleteFlowSiteExAsync(DeleteFlowSiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowSiteResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.site.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定应用或指定pods创建重启运维单
         * Summary: 创建重启运维单
         */
        public CreateOpsplanRestartResponse CreateOpsplanRestart(CreateOpsplanRestartRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOpsplanRestartEx(request, headers, runtime);
        }

        /**
         * Description: 指定应用或指定pods创建重启运维单
         * Summary: 创建重启运维单
         */
        public async Task<CreateOpsplanRestartResponse> CreateOpsplanRestartAsync(CreateOpsplanRestartRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOpsplanRestartExAsync(request, headers, runtime);
        }

        /**
         * Description: 指定应用或指定pods创建重启运维单
         * Summary: 创建重启运维单
         */
        public CreateOpsplanRestartResponse CreateOpsplanRestartEx(CreateOpsplanRestartRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOpsplanRestartResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.restart.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定应用或指定pods创建重启运维单
         * Summary: 创建重启运维单
         */
        public async Task<CreateOpsplanRestartResponse> CreateOpsplanRestartExAsync(CreateOpsplanRestartRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOpsplanRestartResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.restart.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 容器应用服务revision添加备注
         * Summary: 容器应用服务revision添加备注
         */
        public UpdateContainerserviceCommentResponse UpdateContainerserviceComment(UpdateContainerserviceCommentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContainerserviceCommentEx(request, headers, runtime);
        }

        /**
         * Description: 容器应用服务revision添加备注
         * Summary: 容器应用服务revision添加备注
         */
        public async Task<UpdateContainerserviceCommentResponse> UpdateContainerserviceCommentAsync(UpdateContainerserviceCommentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContainerserviceCommentExAsync(request, headers, runtime);
        }

        /**
         * Description: 容器应用服务revision添加备注
         * Summary: 容器应用服务revision添加备注
         */
        public UpdateContainerserviceCommentResponse UpdateContainerserviceCommentEx(UpdateContainerserviceCommentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceCommentResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.comment.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 容器应用服务revision添加备注
         * Summary: 容器应用服务revision添加备注
         */
        public async Task<UpdateContainerserviceCommentResponse> UpdateContainerserviceCommentExAsync(UpdateContainerserviceCommentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceCommentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.comment.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚容器服务到指定版本
         * Summary: 回滚容器服务到指定版本
         */
        public RollbackContainerserviceDeploymentResponse RollbackContainerserviceDeployment(RollbackContainerserviceDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackContainerserviceDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 回滚容器服务到指定版本
         * Summary: 回滚容器服务到指定版本
         */
        public async Task<RollbackContainerserviceDeploymentResponse> RollbackContainerserviceDeploymentAsync(RollbackContainerserviceDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackContainerserviceDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚容器服务到指定版本
         * Summary: 回滚容器服务到指定版本
         */
        public RollbackContainerserviceDeploymentResponse RollbackContainerserviceDeploymentEx(RollbackContainerserviceDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackContainerserviceDeploymentResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.deployment.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚容器服务到指定版本
         * Summary: 回滚容器服务到指定版本
         */
        public async Task<RollbackContainerserviceDeploymentResponse> RollbackContainerserviceDeploymentExAsync(RollbackContainerserviceDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackContainerserviceDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.deployment.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 uid 信息
         * Summary: 查询 uid 信息
         */
        public QueryFlowUidinfoResponse QueryFlowUidinfo(QueryFlowUidinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowUidinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询 uid 信息
         * Summary: 查询 uid 信息
         */
        public async Task<QueryFlowUidinfoResponse> QueryFlowUidinfoAsync(QueryFlowUidinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowUidinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询 uid 信息
         * Summary: 查询 uid 信息
         */
        public QueryFlowUidinfoResponse QueryFlowUidinfoEx(QueryFlowUidinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowUidinfoResponse>(DoRequest("1.0", "antcloud.ldc.flow.uidinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 uid 信息
         * Summary: 查询 uid 信息
         */
        public async Task<QueryFlowUidinfoResponse> QueryFlowUidinfoExAsync(QueryFlowUidinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowUidinfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.uidinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询站点
         * Summary: 查询站点
         */
        public QueryFlowSiteResponse QueryFlowSite(QueryFlowSiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowSiteEx(request, headers, runtime);
        }

        /**
         * Description: 查询站点
         * Summary: 查询站点
         */
        public async Task<QueryFlowSiteResponse> QueryFlowSiteAsync(QueryFlowSiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowSiteExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询站点
         * Summary: 查询站点
         */
        public QueryFlowSiteResponse QueryFlowSiteEx(QueryFlowSiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowSiteResponse>(DoRequest("1.0", "antcloud.ldc.flow.site.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询站点
         * Summary: 查询站点
         */
        public async Task<QueryFlowSiteResponse> QueryFlowSiteExAsync(QueryFlowSiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowSiteResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.site.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元信息
         * Summary: 查询部署单元信息
         */
        public GetCellResponse GetCell(GetCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元信息
         * Summary: 查询部署单元信息
         */
        public async Task<GetCellResponse> GetCellAsync(GetCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元信息
         * Summary: 查询部署单元信息
         */
        public GetCellResponse GetCellEx(GetCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCellResponse>(DoRequest("1.0", "antcloud.ldc.cell.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元信息
         * Summary: 查询部署单元信息
         */
        public async Task<GetCellResponse> GetCellExAsync(GetCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cell.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询逻辑单元信息。
         * Summary: 查询逻辑单元信息。
         */
        public GetCellgroupResponse GetCellgroup(GetCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCellgroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询逻辑单元信息。
         * Summary: 查询逻辑单元信息。
         */
        public async Task<GetCellgroupResponse> GetCellgroupAsync(GetCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCellgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询逻辑单元信息。
         * Summary: 查询逻辑单元信息。
         */
        public GetCellgroupResponse GetCellgroupEx(GetCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCellgroupResponse>(DoRequest("1.0", "antcloud.ldc.cellgroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询逻辑单元信息。
         * Summary: 查询逻辑单元信息。
         */
        public async Task<GetCellgroupResponse> GetCellgroupExAsync(GetCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCellgroupResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cellgroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新部署单元信息。
         * Summary: 更新部署单元信息。
         */
        public UpdateCellResponse UpdateCell(UpdateCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCellEx(request, headers, runtime);
        }

        /**
         * Description: 更新部署单元信息。
         * Summary: 更新部署单元信息。
         */
        public async Task<UpdateCellResponse> UpdateCellAsync(UpdateCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新部署单元信息。
         * Summary: 更新部署单元信息。
         */
        public UpdateCellResponse UpdateCellEx(UpdateCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCellResponse>(DoRequest("1.0", "antcloud.ldc.cell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新部署单元信息。
         * Summary: 更新部署单元信息。
         */
        public async Task<UpdateCellResponse> UpdateCellExAsync(UpdateCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Pod/容器事件列表
         * Summary: 查询Pod/容器事件列表
         */
        public ListEventsResponse ListEvents(ListEventsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListEventsEx(request, headers, runtime);
        }

        /**
         * Description: 查询Pod/容器事件列表
         * Summary: 查询Pod/容器事件列表
         */
        public async Task<ListEventsResponse> ListEventsAsync(ListEventsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListEventsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询Pod/容器事件列表
         * Summary: 查询Pod/容器事件列表
         */
        public ListEventsResponse ListEventsEx(ListEventsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEventsResponse>(DoRequest("1.0", "antcloud.ldc.events.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Pod/容器事件列表
         * Summary: 查询Pod/容器事件列表
         */
        public async Task<ListEventsResponse> ListEventsExAsync(ListEventsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEventsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.events.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取地域信息
         * Summary: 获取地域信息
         */
        public ListRegionResponse ListRegion(ListRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRegionEx(request, headers, runtime);
        }

        /**
         * Description: 获取地域信息
         * Summary: 获取地域信息
         */
        public async Task<ListRegionResponse> ListRegionAsync(ListRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取地域信息
         * Summary: 获取地域信息
         */
        public ListRegionResponse ListRegionEx(ListRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionResponse>(DoRequest("1.0", "antcloud.ldc.region.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取地域信息
         * Summary: 获取地域信息
         */
        public async Task<ListRegionResponse> ListRegionExAsync(ListRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.region.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可用区列表
         * Summary: 可用区列表
         */
        public ListZoneResponse ListZone(ListZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListZoneEx(request, headers, runtime);
        }

        /**
         * Description: 可用区列表
         * Summary: 可用区列表
         */
        public async Task<ListZoneResponse> ListZoneAsync(ListZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: 可用区列表
         * Summary: 可用区列表
         */
        public ListZoneResponse ListZoneEx(ListZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListZoneResponse>(DoRequest("1.0", "antcloud.ldc.zone.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可用区列表
         * Summary: 可用区列表
         */
        public async Task<ListZoneResponse> ListZoneExAsync(ListZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListZoneResponse>(await DoRequestAsync("1.0", "antcloud.ldc.zone.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询pod下container 日志
         * Summary: 查询pod日志
         */
        public QueryPodLogResponse QueryPodLog(QueryPodLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPodLogEx(request, headers, runtime);
        }

        /**
         * Description: 查询pod下container 日志
         * Summary: 查询pod日志
         */
        public async Task<QueryPodLogResponse> QueryPodLogAsync(QueryPodLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPodLogExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询pod下container 日志
         * Summary: 查询pod日志
         */
        public QueryPodLogResponse QueryPodLogEx(QueryPodLogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPodLogResponse>(DoRequest("1.0", "antcloud.ldc.pod.log.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询pod下container 日志
         * Summary: 查询pod日志
         */
        public async Task<QueryPodLogResponse> QueryPodLogExAsync(QueryPodLogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPodLogResponse>(await DoRequestAsync("1.0", "antcloud.ldc.pod.log.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建spanner集群
         * Summary: 创建spanner集群
         */
        public CreateSpannerClusterResponse CreateSpannerCluster(CreateSpannerClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSpannerClusterEx(request, headers, runtime);
        }

        /**
         * Description: 创建spanner集群
         * Summary: 创建spanner集群
         */
        public async Task<CreateSpannerClusterResponse> CreateSpannerClusterAsync(CreateSpannerClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSpannerClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建spanner集群
         * Summary: 创建spanner集群
         */
        public CreateSpannerClusterResponse CreateSpannerClusterEx(CreateSpannerClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpannerClusterResponse>(DoRequest("1.0", "antcloud.ldc.spanner.cluster.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建spanner集群
         * Summary: 创建spanner集群
         */
        public async Task<CreateSpannerClusterResponse> CreateSpannerClusterExAsync(CreateSpannerClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSpannerClusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.spanner.cluster.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取集群详情
         * Summary: 获取集群详情
         */
        public GetSpannerClusterResponse GetSpannerCluster(GetSpannerClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSpannerClusterEx(request, headers, runtime);
        }

        /**
         * Description: 获取集群详情
         * Summary: 获取集群详情
         */
        public async Task<GetSpannerClusterResponse> GetSpannerClusterAsync(GetSpannerClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSpannerClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取集群详情
         * Summary: 获取集群详情
         */
        public GetSpannerClusterResponse GetSpannerClusterEx(GetSpannerClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSpannerClusterResponse>(DoRequest("1.0", "antcloud.ldc.spanner.cluster.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取集群详情
         * Summary: 获取集群详情
         */
        public async Task<GetSpannerClusterResponse> GetSpannerClusterExAsync(GetSpannerClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSpannerClusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.spanner.cluster.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 扩容spanner集群
         * Summary: 扩容spanner集群
         */
        public ScaleSpannerClusterResponse ScaleSpannerCluster(ScaleSpannerClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ScaleSpannerClusterEx(request, headers, runtime);
        }

        /**
         * Description: 扩容spanner集群
         * Summary: 扩容spanner集群
         */
        public async Task<ScaleSpannerClusterResponse> ScaleSpannerClusterAsync(ScaleSpannerClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ScaleSpannerClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 扩容spanner集群
         * Summary: 扩容spanner集群
         */
        public ScaleSpannerClusterResponse ScaleSpannerClusterEx(ScaleSpannerClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleSpannerClusterResponse>(DoRequest("1.0", "antcloud.ldc.spanner.cluster.scale", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 扩容spanner集群
         * Summary: 扩容spanner集群
         */
        public async Task<ScaleSpannerClusterResponse> ScaleSpannerClusterExAsync(ScaleSpannerClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ScaleSpannerClusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.spanner.cluster.scale", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群列表
         * Summary: 查询集群列表
         */
        public QuerySpannerClusterResponse QuerySpannerCluster(QuerySpannerClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySpannerClusterEx(request, headers, runtime);
        }

        /**
         * Description: 查询集群列表
         * Summary: 查询集群列表
         */
        public async Task<QuerySpannerClusterResponse> QuerySpannerClusterAsync(QuerySpannerClusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySpannerClusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询集群列表
         * Summary: 查询集群列表
         */
        public QuerySpannerClusterResponse QuerySpannerClusterEx(QuerySpannerClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySpannerClusterResponse>(DoRequest("1.0", "antcloud.ldc.spanner.cluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群列表
         * Summary: 查询集群列表
         */
        public async Task<QuerySpannerClusterResponse> QuerySpannerClusterExAsync(QuerySpannerClusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySpannerClusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.spanner.cluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新spanner集群状态
         * Summary: 更新spanner集群状态
         */
        public UpdateSpannerClusterstatusResponse UpdateSpannerClusterstatus(UpdateSpannerClusterstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSpannerClusterstatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新spanner集群状态
         * Summary: 更新spanner集群状态
         */
        public async Task<UpdateSpannerClusterstatusResponse> UpdateSpannerClusterstatusAsync(UpdateSpannerClusterstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSpannerClusterstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新spanner集群状态
         * Summary: 更新spanner集群状态
         */
        public UpdateSpannerClusterstatusResponse UpdateSpannerClusterstatusEx(UpdateSpannerClusterstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSpannerClusterstatusResponse>(DoRequest("1.0", "antcloud.ldc.spanner.clusterstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新spanner集群状态
         * Summary: 更新spanner集群状态
         */
        public async Task<UpdateSpannerClusterstatusResponse> UpdateSpannerClusterstatusExAsync(UpdateSpannerClusterstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSpannerClusterstatusResponse>(await DoRequestAsync("1.0", "antcloud.ldc.spanner.clusterstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新集群单元状态
         * Summary: 更新集群单元状态
         */
        public UpdateSpannerUnitstatusResponse UpdateSpannerUnitstatus(UpdateSpannerUnitstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSpannerUnitstatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新集群单元状态
         * Summary: 更新集群单元状态
         */
        public async Task<UpdateSpannerUnitstatusResponse> UpdateSpannerUnitstatusAsync(UpdateSpannerUnitstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSpannerUnitstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新集群单元状态
         * Summary: 更新集群单元状态
         */
        public UpdateSpannerUnitstatusResponse UpdateSpannerUnitstatusEx(UpdateSpannerUnitstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSpannerUnitstatusResponse>(DoRequest("1.0", "antcloud.ldc.spanner.unitstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新集群单元状态
         * Summary: 更新集群单元状态
         */
        public async Task<UpdateSpannerUnitstatusResponse> UpdateSpannerUnitstatusExAsync(UpdateSpannerUnitstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSpannerUnitstatusResponse>(await DoRequestAsync("1.0", "antcloud.ldc.spanner.unitstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消应用服务发布|运维
         * Summary: 取消应用服务发布|运维
         */
        public CancelOpsplanServiceResponse CancelOpsplanService(CancelOpsplanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelOpsplanServiceEx(request, headers, runtime);
        }

        /**
         * Description: 取消应用服务发布|运维
         * Summary: 取消应用服务发布|运维
         */
        public async Task<CancelOpsplanServiceResponse> CancelOpsplanServiceAsync(CancelOpsplanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelOpsplanServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消应用服务发布|运维
         * Summary: 取消应用服务发布|运维
         */
        public CancelOpsplanServiceResponse CancelOpsplanServiceEx(CancelOpsplanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelOpsplanServiceResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.service.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消应用服务发布|运维
         * Summary: 取消应用服务发布|运维
         */
        public async Task<CancelOpsplanServiceResponse> CancelOpsplanServiceExAsync(CancelOpsplanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelOpsplanServiceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.service.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询系统配置url
         * Summary: 系统url查询
         */
        public ListSystemUrlResponse ListSystemUrl(ListSystemUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSystemUrlEx(request, headers, runtime);
        }

        /**
         * Description: 查询系统配置url
         * Summary: 系统url查询
         */
        public async Task<ListSystemUrlResponse> ListSystemUrlAsync(ListSystemUrlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSystemUrlExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询系统配置url
         * Summary: 系统url查询
         */
        public ListSystemUrlResponse ListSystemUrlEx(ListSystemUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSystemUrlResponse>(DoRequest("1.0", "antcloud.ldc.system.url.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询系统配置url
         * Summary: 系统url查询
         */
        public async Task<ListSystemUrlResponse> ListSystemUrlExAsync(ListSystemUrlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSystemUrlResponse>(await DoRequestAsync("1.0", "antcloud.ldc.system.url.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询流量推送记录
         * Summary: 查询
         */
        public QueryFlowRecordResponse QueryFlowRecord(QueryFlowRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowRecordEx(request, headers, runtime);
        }

        /**
         * Description: 查询流量推送记录
         * Summary: 查询
         */
        public async Task<QueryFlowRecordResponse> QueryFlowRecordAsync(QueryFlowRecordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowRecordExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询流量推送记录
         * Summary: 查询
         */
        public QueryFlowRecordResponse QueryFlowRecordEx(QueryFlowRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowRecordResponse>(DoRequest("1.0", "antcloud.ldc.flow.record.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询流量推送记录
         * Summary: 查询
         */
        public async Task<QueryFlowRecordResponse> QueryFlowRecordExAsync(QueryFlowRecordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowRecordResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.record.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存环境关联
         * Summary: 保存环境关联
         */
        public SaveFlowEnvrelResponse SaveFlowEnvrel(SaveFlowEnvrelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveFlowEnvrelEx(request, headers, runtime);
        }

        /**
         * Description: 保存环境关联
         * Summary: 保存环境关联
         */
        public async Task<SaveFlowEnvrelResponse> SaveFlowEnvrelAsync(SaveFlowEnvrelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveFlowEnvrelExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存环境关联
         * Summary: 保存环境关联
         */
        public SaveFlowEnvrelResponse SaveFlowEnvrelEx(SaveFlowEnvrelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveFlowEnvrelResponse>(DoRequest("1.0", "antcloud.ldc.flow.envrel.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存环境关联
         * Summary: 保存环境关联
         */
        public async Task<SaveFlowEnvrelResponse> SaveFlowEnvrelExAsync(SaveFlowEnvrelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveFlowEnvrelResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.envrel.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除环境关联
         * Summary: 删除环境关联
         */
        public DeleteFlowEnvrelResponse DeleteFlowEnvrel(DeleteFlowEnvrelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFlowEnvrelEx(request, headers, runtime);
        }

        /**
         * Description: 删除环境关联
         * Summary: 删除环境关联
         */
        public async Task<DeleteFlowEnvrelResponse> DeleteFlowEnvrelAsync(DeleteFlowEnvrelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFlowEnvrelExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除环境关联
         * Summary: 删除环境关联
         */
        public DeleteFlowEnvrelResponse DeleteFlowEnvrelEx(DeleteFlowEnvrelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowEnvrelResponse>(DoRequest("1.0", "antcloud.ldc.flow.envrel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除环境关联
         * Summary: 删除环境关联
         */
        public async Task<DeleteFlowEnvrelResponse> DeleteFlowEnvrelExAsync(DeleteFlowEnvrelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowEnvrelResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.envrel.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询关联
         * Summary: 查询关联
         */
        public QueryFlowEnvrelResponse QueryFlowEnvrel(QueryFlowEnvrelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowEnvrelEx(request, headers, runtime);
        }

        /**
         * Description: 查询关联
         * Summary: 查询关联
         */
        public async Task<QueryFlowEnvrelResponse> QueryFlowEnvrelAsync(QueryFlowEnvrelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowEnvrelExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询关联
         * Summary: 查询关联
         */
        public QueryFlowEnvrelResponse QueryFlowEnvrelEx(QueryFlowEnvrelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowEnvrelResponse>(DoRequest("1.0", "antcloud.ldc.flow.envrel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询关联
         * Summary: 查询关联
         */
        public async Task<QueryFlowEnvrelResponse> QueryFlowEnvrelExAsync(QueryFlowEnvrelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowEnvrelResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.envrel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建异构机房部署单元
         * Summary: 创建异构机房部署单元
         */
        public CreateFlowSitecellResponse CreateFlowSitecell(CreateFlowSitecellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFlowSitecellEx(request, headers, runtime);
        }

        /**
         * Description: 创建异构机房部署单元
         * Summary: 创建异构机房部署单元
         */
        public async Task<CreateFlowSitecellResponse> CreateFlowSitecellAsync(CreateFlowSitecellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFlowSitecellExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建异构机房部署单元
         * Summary: 创建异构机房部署单元
         */
        public CreateFlowSitecellResponse CreateFlowSitecellEx(CreateFlowSitecellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowSitecellResponse>(DoRequest("1.0", "antcloud.ldc.flow.sitecell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建异构机房部署单元
         * Summary: 创建异构机房部署单元
         */
        public async Task<CreateFlowSitecellResponse> CreateFlowSitecellExAsync(CreateFlowSitecellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFlowSitecellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.sitecell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除异构机房部署单元
         * Summary: 删除异构机房部署单元
         */
        public DeleteFlowSitecellResponse DeleteFlowSitecell(DeleteFlowSitecellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFlowSitecellEx(request, headers, runtime);
        }

        /**
         * Description: 删除异构机房部署单元
         * Summary: 删除异构机房部署单元
         */
        public async Task<DeleteFlowSitecellResponse> DeleteFlowSitecellAsync(DeleteFlowSitecellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFlowSitecellExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除异构机房部署单元
         * Summary: 删除异构机房部署单元
         */
        public DeleteFlowSitecellResponse DeleteFlowSitecellEx(DeleteFlowSitecellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowSitecellResponse>(DoRequest("1.0", "antcloud.ldc.flow.sitecell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除异构机房部署单元
         * Summary: 删除异构机房部署单元
         */
        public async Task<DeleteFlowSitecellResponse> DeleteFlowSitecellExAsync(DeleteFlowSitecellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFlowSitecellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.sitecell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询异构机房部署单元
         * Summary: 查询异构机房部署单元
         */
        public QueryFlowSitecellResponse QueryFlowSitecell(QueryFlowSitecellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowSitecellEx(request, headers, runtime);
        }

        /**
         * Description: 查询异构机房部署单元
         * Summary: 查询异构机房部署单元
         */
        public async Task<QueryFlowSitecellResponse> QueryFlowSitecellAsync(QueryFlowSitecellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowSitecellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询异构机房部署单元
         * Summary: 查询异构机房部署单元
         */
        public QueryFlowSitecellResponse QueryFlowSitecellEx(QueryFlowSitecellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowSitecellResponse>(DoRequest("1.0", "antcloud.ldc.flow.sitecell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询异构机房部署单元
         * Summary: 查询异构机房部署单元
         */
        public async Task<QueryFlowSitecellResponse> QueryFlowSitecellExAsync(QueryFlowSitecellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowSitecellResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.sitecell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布单下应用服务详情
         * Summary: 获取发布单下应用服务详情
         */
        public GetOpsplanServiceResponse GetOpsplanService(GetOpsplanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetOpsplanServiceEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布单下应用服务详情
         * Summary: 获取发布单下应用服务详情
         */
        public async Task<GetOpsplanServiceResponse> GetOpsplanServiceAsync(GetOpsplanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetOpsplanServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布单下应用服务详情
         * Summary: 获取发布单下应用服务详情
         */
        public GetOpsplanServiceResponse GetOpsplanServiceEx(GetOpsplanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOpsplanServiceResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.service.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布单下应用服务详情
         * Summary: 获取发布单下应用服务详情
         */
        public async Task<GetOpsplanServiceResponse> GetOpsplanServiceExAsync(GetOpsplanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOpsplanServiceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.service.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前生效的路由规则
         * Summary: 获取当前生效的路由规则
         */
        public QueryFlowRuleResponse QueryFlowRule(QueryFlowRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowRuleEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前生效的路由规则
         * Summary: 获取当前生效的路由规则
         */
        public async Task<QueryFlowRuleResponse> QueryFlowRuleAsync(QueryFlowRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前生效的路由规则
         * Summary: 获取当前生效的路由规则
         */
        public QueryFlowRuleResponse QueryFlowRuleEx(QueryFlowRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowRuleResponse>(DoRequest("1.0", "antcloud.ldc.flow.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前生效的路由规则
         * Summary: 获取当前生效的路由规则
         */
        public async Task<QueryFlowRuleResponse> QueryFlowRuleExAsync(QueryFlowRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowRuleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.rule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建FedDeployment
         * Summary: 创建FedDeployment
         */
        public CreateFederationDeploymentResponse CreateFederationDeployment(CreateFederationDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFederationDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 创建FedDeployment
         * Summary: 创建FedDeployment
         */
        public async Task<CreateFederationDeploymentResponse> CreateFederationDeploymentAsync(CreateFederationDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFederationDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建FedDeployment
         * Summary: 创建FedDeployment
         */
        public CreateFederationDeploymentResponse CreateFederationDeploymentEx(CreateFederationDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationDeploymentResponse>(DoRequest("1.0", "antcloud.ldc.federation.deployment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建FedDeployment
         * Summary: 创建FedDeployment
         */
        public async Task<CreateFederationDeploymentResponse> CreateFederationDeploymentExAsync(CreateFederationDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFederationDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.deployment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
         * Summary: 查询负责均衡实例。
         */
        public QueryLoadbalancerResponse QueryLoadbalancer(QueryLoadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryLoadbalancerEx(request, headers, runtime);
        }

        /**
         * Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
         * Summary: 查询负责均衡实例。
         */
        public async Task<QueryLoadbalancerResponse> QueryLoadbalancerAsync(QueryLoadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryLoadbalancerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
         * Summary: 查询负责均衡实例。
         */
        public QueryLoadbalancerResponse QueryLoadbalancerEx(QueryLoadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalancerResponse>(DoRequest("1.0", "antcloud.ldc.loadbalancer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询负责均衡实例。[底层元数据不具备之前，先放在LHC里实现]
         * Summary: 查询负责均衡实例。
         */
        public async Task<QueryLoadbalancerResponse> QueryLoadbalancerExAsync(QueryLoadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryLoadbalancerResponse>(await DoRequestAsync("1.0", "antcloud.ldc.loadbalancer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询容器服务 Service 列表。
         * Summary: 查询容器服务 Service 列表。
         */
        public ListContainerserviceServiceResponse ListContainerserviceService(ListContainerserviceServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContainerserviceServiceEx(request, headers, runtime);
        }

        /**
         * Description: 查询容器服务 Service 列表。
         * Summary: 查询容器服务 Service 列表。
         */
        public async Task<ListContainerserviceServiceResponse> ListContainerserviceServiceAsync(ListContainerserviceServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContainerserviceServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询容器服务 Service 列表。
         * Summary: 查询容器服务 Service 列表。
         */
        public ListContainerserviceServiceResponse ListContainerserviceServiceEx(ListContainerserviceServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContainerserviceServiceResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.service.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询容器服务 Service 列表。
         * Summary: 查询容器服务 Service 列表。
         */
        public async Task<ListContainerserviceServiceResponse> ListContainerserviceServiceExAsync(ListContainerserviceServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContainerserviceServiceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.service.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar元信息列表
         * Summary: 查询sidecar元信息列表
         */
        public ListSidecarResponse ListSidecar(ListSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 查询sidecar元信息列表
         * Summary: 查询sidecar元信息列表
         */
        public async Task<ListSidecarResponse> ListSidecarAsync(ListSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询sidecar元信息列表
         * Summary: 查询sidecar元信息列表
         */
        public ListSidecarResponse ListSidecarEx(ListSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarResponse>(DoRequest("1.0", "antcloud.ldc.sidecar.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar元信息列表
         * Summary: 查询sidecar元信息列表
         */
        public async Task<ListSidecarResponse> ListSidecarExAsync(ListSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecar.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list template
         * Summary: list template
         */
        public ListSidecarTemplateResponse ListSidecarTemplate(ListSidecarTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSidecarTemplateEx(request, headers, runtime);
        }

        /**
         * Description: list template
         * Summary: list template
         */
        public async Task<ListSidecarTemplateResponse> ListSidecarTemplateAsync(ListSidecarTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSidecarTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: list template
         * Summary: list template
         */
        public ListSidecarTemplateResponse ListSidecarTemplateEx(ListSidecarTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarTemplateResponse>(DoRequest("1.0", "antcloud.ldc.sidecar.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list template
         * Summary: list template
         */
        public async Task<ListSidecarTemplateResponse> ListSidecarTemplateExAsync(ListSidecarTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecar.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar版本详情
         * Summary: 版本详情
         */
        public GetSidecarTemplateResponse GetSidecarTemplate(GetSidecarTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSidecarTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar版本详情
         * Summary: 版本详情
         */
        public async Task<GetSidecarTemplateResponse> GetSidecarTemplateAsync(GetSidecarTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSidecarTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar版本详情
         * Summary: 版本详情
         */
        public GetSidecarTemplateResponse GetSidecarTemplateEx(GetSidecarTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarTemplateResponse>(DoRequest("1.0", "antcloud.ldc.sidecar.template.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar版本详情
         * Summary: 版本详情
         */
        public async Task<GetSidecarTemplateResponse> GetSidecarTemplateExAsync(GetSidecarTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecar.template.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取FedDeployment详情
         * Summary: 获取FedDeployment详情
         */
        public GetFederationDeploymentResponse GetFederationDeployment(GetFederationDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFederationDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 获取FedDeployment详情
         * Summary: 获取FedDeployment详情
         */
        public async Task<GetFederationDeploymentResponse> GetFederationDeploymentAsync(GetFederationDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFederationDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取FedDeployment详情
         * Summary: 获取FedDeployment详情
         */
        public GetFederationDeploymentResponse GetFederationDeploymentEx(GetFederationDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFederationDeploymentResponse>(DoRequest("1.0", "antcloud.ldc.federation.deployment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取FedDeployment详情
         * Summary: 获取FedDeployment详情
         */
        public async Task<GetFederationDeploymentResponse> GetFederationDeploymentExAsync(GetFederationDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFederationDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.deployment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取FederatedDeployment列表信息
         * Summary: 获取FedDeploy列表
         */
        public ListFederationDeploymentResponse ListFederationDeployment(ListFederationDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListFederationDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 获取FederatedDeployment列表信息
         * Summary: 获取FedDeploy列表
         */
        public async Task<ListFederationDeploymentResponse> ListFederationDeploymentAsync(ListFederationDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListFederationDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取FederatedDeployment列表信息
         * Summary: 获取FedDeploy列表
         */
        public ListFederationDeploymentResponse ListFederationDeploymentEx(ListFederationDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFederationDeploymentResponse>(DoRequest("1.0", "antcloud.ldc.federation.deployment.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取FederatedDeployment列表信息
         * Summary: 获取FedDeploy列表
         */
        public async Task<ListFederationDeploymentResponse> ListFederationDeploymentExAsync(ListFederationDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFederationDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.deployment.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除FedDeployment
         * Summary: 删除FedDeployment
         */
        public DeleteFederationDeploymentResponse DeleteFederationDeployment(DeleteFederationDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFederationDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 删除FedDeployment
         * Summary: 删除FedDeployment
         */
        public async Task<DeleteFederationDeploymentResponse> DeleteFederationDeploymentAsync(DeleteFederationDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFederationDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除FedDeployment
         * Summary: 删除FedDeployment
         */
        public DeleteFederationDeploymentResponse DeleteFederationDeploymentEx(DeleteFederationDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFederationDeploymentResponse>(DoRequest("1.0", "antcloud.ldc.federation.deployment.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除FedDeployment
         * Summary: 删除FedDeployment
         */
        public async Task<DeleteFederationDeploymentResponse> DeleteFederationDeploymentExAsync(DeleteFederationDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFederationDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.federation.deployment.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置当前uid规则为默认uid规则
         * Summary: 设置当前uid规则为默认uid规则
         */
        public SetFlowDefaultuidResponse SetFlowDefaultuid(SetFlowDefaultuidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetFlowDefaultuidEx(request, headers, runtime);
        }

        /**
         * Description: 设置当前uid规则为默认uid规则
         * Summary: 设置当前uid规则为默认uid规则
         */
        public async Task<SetFlowDefaultuidResponse> SetFlowDefaultuidAsync(SetFlowDefaultuidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetFlowDefaultuidExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置当前uid规则为默认uid规则
         * Summary: 设置当前uid规则为默认uid规则
         */
        public SetFlowDefaultuidResponse SetFlowDefaultuidEx(SetFlowDefaultuidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetFlowDefaultuidResponse>(DoRequest("1.0", "antcloud.ldc.flow.defaultuid.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置当前uid规则为默认uid规则
         * Summary: 设置当前uid规则为默认uid规则
         */
        public async Task<SetFlowDefaultuidResponse> SetFlowDefaultuidExAsync(SetFlowDefaultuidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetFlowDefaultuidResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.defaultuid.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行应用服务发布|运维
         * Summary: 开始执行应用服务发布|运维
         */
        public StartOpsplanServiceResponse StartOpsplanService(StartOpsplanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartOpsplanServiceEx(request, headers, runtime);
        }

        /**
         * Description: 开始执行应用服务发布|运维
         * Summary: 开始执行应用服务发布|运维
         */
        public async Task<StartOpsplanServiceResponse> StartOpsplanServiceAsync(StartOpsplanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartOpsplanServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 开始执行应用服务发布|运维
         * Summary: 开始执行应用服务发布|运维
         */
        public StartOpsplanServiceResponse StartOpsplanServiceEx(StartOpsplanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartOpsplanServiceResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.service.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行应用服务发布|运维
         * Summary: 开始执行应用服务发布|运维
         */
        public async Task<StartOpsplanServiceResponse> StartOpsplanServiceExAsync(StartOpsplanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartOpsplanServiceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.service.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚确认应用服务
         * Summary: 回滚确认应用服务
         */
        public ConfirmOpsplanServicerollbackResponse ConfirmOpsplanServicerollback(ConfirmOpsplanServicerollbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmOpsplanServicerollbackEx(request, headers, runtime);
        }

        /**
         * Description: 回滚确认应用服务
         * Summary: 回滚确认应用服务
         */
        public async Task<ConfirmOpsplanServicerollbackResponse> ConfirmOpsplanServicerollbackAsync(ConfirmOpsplanServicerollbackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmOpsplanServicerollbackExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚确认应用服务
         * Summary: 回滚确认应用服务
         */
        public ConfirmOpsplanServicerollbackResponse ConfirmOpsplanServicerollbackEx(ConfirmOpsplanServicerollbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmOpsplanServicerollbackResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.servicerollback.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚确认应用服务
         * Summary: 回滚确认应用服务
         */
        public async Task<ConfirmOpsplanServicerollbackResponse> ConfirmOpsplanServicerollbackExAsync(ConfirmOpsplanServicerollbackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmOpsplanServicerollbackResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.servicerollback.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试发布服务
         * Summary: 重试发布服务
         */
        public RetryOpsplanServiceResponse RetryOpsplanService(RetryOpsplanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryOpsplanServiceEx(request, headers, runtime);
        }

        /**
         * Description: 重试发布服务
         * Summary: 重试发布服务
         */
        public async Task<RetryOpsplanServiceResponse> RetryOpsplanServiceAsync(RetryOpsplanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryOpsplanServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试发布服务
         * Summary: 重试发布服务
         */
        public RetryOpsplanServiceResponse RetryOpsplanServiceEx(RetryOpsplanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryOpsplanServiceResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.service.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试发布服务
         * Summary: 重试发布服务
         */
        public async Task<RetryOpsplanServiceResponse> RetryOpsplanServiceExAsync(RetryOpsplanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryOpsplanServiceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.service.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询弹性场景
         * Summary: 查询弹性场景
         */
        public QueryFlowElasticsceneResponse QueryFlowElasticscene(QueryFlowElasticsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowElasticsceneEx(request, headers, runtime);
        }

        /**
         * Description: 查询弹性场景
         * Summary: 查询弹性场景
         */
        public async Task<QueryFlowElasticsceneResponse> QueryFlowElasticsceneAsync(QueryFlowElasticsceneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowElasticsceneExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询弹性场景
         * Summary: 查询弹性场景
         */
        public QueryFlowElasticsceneResponse QueryFlowElasticsceneEx(QueryFlowElasticsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowElasticsceneResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticscene.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询弹性场景
         * Summary: 查询弹性场景
         */
        public async Task<QueryFlowElasticsceneResponse> QueryFlowElasticsceneExAsync(QueryFlowElasticsceneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowElasticsceneResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticscene.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询弹性规则
         * Summary: 查询弹性规则
         */
        public QueryFlowElasticruleResponse QueryFlowElasticrule(QueryFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowElasticruleEx(request, headers, runtime);
        }

        /**
         * Description: 查询弹性规则
         * Summary: 查询弹性规则
         */
        public async Task<QueryFlowElasticruleResponse> QueryFlowElasticruleAsync(QueryFlowElasticruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowElasticruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询弹性规则
         * Summary: 查询弹性规则
         */
        public QueryFlowElasticruleResponse QueryFlowElasticruleEx(QueryFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowElasticruleResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticrule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询弹性规则
         * Summary: 查询弹性规则
         */
        public async Task<QueryFlowElasticruleResponse> QueryFlowElasticruleExAsync(QueryFlowElasticruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowElasticruleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticrule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询弹性子规则
         * Summary: 查询弹性子规则
         */
        public QueryFlowElasticsubruleResponse QueryFlowElasticsubrule(QueryFlowElasticsubruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowElasticsubruleEx(request, headers, runtime);
        }

        /**
         * Description: 查询弹性子规则
         * Summary: 查询弹性子规则
         */
        public async Task<QueryFlowElasticsubruleResponse> QueryFlowElasticsubruleAsync(QueryFlowElasticsubruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowElasticsubruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询弹性子规则
         * Summary: 查询弹性子规则
         */
        public QueryFlowElasticsubruleResponse QueryFlowElasticsubruleEx(QueryFlowElasticsubruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowElasticsubruleResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticsubrule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询弹性子规则
         * Summary: 查询弹性子规则
         */
        public async Task<QueryFlowElasticsubruleResponse> QueryFlowElasticsubruleExAsync(QueryFlowElasticsubruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowElasticsubruleResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticsubrule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前弹性状态
         * Summary: 查询当前弹性状态
         */
        public QueryFlowElasticvalueResponse QueryFlowElasticvalue(QueryFlowElasticvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFlowElasticvalueEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前弹性状态
         * Summary: 查询当前弹性状态
         */
        public async Task<QueryFlowElasticvalueResponse> QueryFlowElasticvalueAsync(QueryFlowElasticvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFlowElasticvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前弹性状态
         * Summary: 查询当前弹性状态
         */
        public QueryFlowElasticvalueResponse QueryFlowElasticvalueEx(QueryFlowElasticvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowElasticvalueResponse>(DoRequest("1.0", "antcloud.ldc.flow.elasticvalue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前弹性状态
         * Summary: 查询当前弹性状态
         */
        public async Task<QueryFlowElasticvalueResponse> QueryFlowElasticvalueExAsync(QueryFlowElasticvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFlowElasticvalueResponse>(await DoRequestAsync("1.0", "antcloud.ldc.flow.elasticvalue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开关配置
         * Summary: 开关配置
         */
        public ListSystemSwitchResponse ListSystemSwitch(ListSystemSwitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSystemSwitchEx(request, headers, runtime);
        }

        /**
         * Description: 开关配置
         * Summary: 开关配置
         */
        public async Task<ListSystemSwitchResponse> ListSystemSwitchAsync(ListSystemSwitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSystemSwitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 开关配置
         * Summary: 开关配置
         */
        public ListSystemSwitchResponse ListSystemSwitchEx(ListSystemSwitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSystemSwitchResponse>(DoRequest("1.0", "antcloud.ldc.system.switch.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开关配置
         * Summary: 开关配置
         */
        public async Task<ListSystemSwitchResponse> ListSystemSwitchExAsync(ListSystemSwitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSystemSwitchResponse>(await DoRequestAsync("1.0", "antcloud.ldc.system.switch.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取云原生技术栈对应的Dockerfile
         * Summary: 获取技术栈对应的Dockerfile
         */
        public LoadBuildpackDockerfileResponse LoadBuildpackDockerfile(LoadBuildpackDockerfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LoadBuildpackDockerfileEx(request, headers, runtime);
        }

        /**
         * Description: 获取云原生技术栈对应的Dockerfile
         * Summary: 获取技术栈对应的Dockerfile
         */
        public async Task<LoadBuildpackDockerfileResponse> LoadBuildpackDockerfileAsync(LoadBuildpackDockerfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LoadBuildpackDockerfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取云原生技术栈对应的Dockerfile
         * Summary: 获取技术栈对应的Dockerfile
         */
        public LoadBuildpackDockerfileResponse LoadBuildpackDockerfileEx(LoadBuildpackDockerfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadBuildpackDockerfileResponse>(DoRequest("1.0", "antcloud.ldc.buildpack.dockerfile.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取云原生技术栈对应的Dockerfile
         * Summary: 获取技术栈对应的Dockerfile
         */
        public async Task<LoadBuildpackDockerfileResponse> LoadBuildpackDockerfileExAsync(LoadBuildpackDockerfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LoadBuildpackDockerfileResponse>(await DoRequestAsync("1.0", "antcloud.ldc.buildpack.dockerfile.load", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定pod创建缩容运维单
         * Summary: 创建pod缩容运维单
         */
        public CreateOpsplanPodofflineResponse CreateOpsplanPodoffline(CreateOpsplanPodofflineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOpsplanPodofflineEx(request, headers, runtime);
        }

        /**
         * Description: 指定pod创建缩容运维单
         * Summary: 创建pod缩容运维单
         */
        public async Task<CreateOpsplanPodofflineResponse> CreateOpsplanPodofflineAsync(CreateOpsplanPodofflineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOpsplanPodofflineExAsync(request, headers, runtime);
        }

        /**
         * Description: 指定pod创建缩容运维单
         * Summary: 创建pod缩容运维单
         */
        public CreateOpsplanPodofflineResponse CreateOpsplanPodofflineEx(CreateOpsplanPodofflineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOpsplanPodofflineResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.podoffline.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定pod创建缩容运维单
         * Summary: 创建pod缩容运维单
         */
        public async Task<CreateOpsplanPodofflineResponse> CreateOpsplanPodofflineExAsync(CreateOpsplanPodofflineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOpsplanPodofflineResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.podoffline.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加OB租户信息以及对应的uid分片段
         * Summary: 添加OB租户信息
         */
        public CreateDbflowObtenantResponse CreateDbflowObtenant(CreateDbflowObtenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDbflowObtenantEx(request, headers, runtime);
        }

        /**
         * Description: 添加OB租户信息以及对应的uid分片段
         * Summary: 添加OB租户信息
         */
        public async Task<CreateDbflowObtenantResponse> CreateDbflowObtenantAsync(CreateDbflowObtenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDbflowObtenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加OB租户信息以及对应的uid分片段
         * Summary: 添加OB租户信息
         */
        public CreateDbflowObtenantResponse CreateDbflowObtenantEx(CreateDbflowObtenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDbflowObtenantResponse>(DoRequest("1.0", "antcloud.ldc.dbflow.obtenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加OB租户信息以及对应的uid分片段
         * Summary: 添加OB租户信息
         */
        public async Task<CreateDbflowObtenantResponse> CreateDbflowObtenantExAsync(CreateDbflowObtenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDbflowObtenantResponse>(await DoRequestAsync("1.0", "antcloud.ldc.dbflow.obtenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询ob租户列表
         * Summary: 分页查询ob租户列表
         */
        public QueryDbflowObtenantResponse QueryDbflowObtenant(QueryDbflowObtenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDbflowObtenantEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询ob租户列表
         * Summary: 分页查询ob租户列表
         */
        public async Task<QueryDbflowObtenantResponse> QueryDbflowObtenantAsync(QueryDbflowObtenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDbflowObtenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询ob租户列表
         * Summary: 分页查询ob租户列表
         */
        public QueryDbflowObtenantResponse QueryDbflowObtenantEx(QueryDbflowObtenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDbflowObtenantResponse>(DoRequest("1.0", "antcloud.ldc.dbflow.obtenant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询ob租户列表
         * Summary: 分页查询ob租户列表
         */
        public async Task<QueryDbflowObtenantResponse> QueryDbflowObtenantExAsync(QueryDbflowObtenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDbflowObtenantResponse>(await DoRequestAsync("1.0", "antcloud.ldc.dbflow.obtenant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新OB租户信息，包括uid映射
         * Summary: 更新OB租户信息
         */
        public UpdateDbflowObtenantResponse UpdateDbflowObtenant(UpdateDbflowObtenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDbflowObtenantEx(request, headers, runtime);
        }

        /**
         * Description: 更新OB租户信息，包括uid映射
         * Summary: 更新OB租户信息
         */
        public async Task<UpdateDbflowObtenantResponse> UpdateDbflowObtenantAsync(UpdateDbflowObtenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDbflowObtenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新OB租户信息，包括uid映射
         * Summary: 更新OB租户信息
         */
        public UpdateDbflowObtenantResponse UpdateDbflowObtenantEx(UpdateDbflowObtenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDbflowObtenantResponse>(DoRequest("1.0", "antcloud.ldc.dbflow.obtenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新OB租户信息，包括uid映射
         * Summary: 更新OB租户信息
         */
        public async Task<UpdateDbflowObtenantResponse> UpdateDbflowObtenantExAsync(UpdateDbflowObtenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDbflowObtenantResponse>(await DoRequestAsync("1.0", "antcloud.ldc.dbflow.obtenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
         * Summary: 删除PaaS中记录的OB租户信息
         */
        public DeleteDbflowObtenantResponse DeleteDbflowObtenant(DeleteDbflowObtenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDbflowObtenantEx(request, headers, runtime);
        }

        /**
         * Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
         * Summary: 删除PaaS中记录的OB租户信息
         */
        public async Task<DeleteDbflowObtenantResponse> DeleteDbflowObtenantAsync(DeleteDbflowObtenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDbflowObtenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
         * Summary: 删除PaaS中记录的OB租户信息
         */
        public DeleteDbflowObtenantResponse DeleteDbflowObtenantEx(DeleteDbflowObtenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDbflowObtenantResponse>(DoRequest("1.0", "antcloud.ldc.dbflow.obtenant.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除PaaS中记录的OB租户信息，非实际OB租户删除
         * Summary: 删除PaaS中记录的OB租户信息
         */
        public async Task<DeleteDbflowObtenantResponse> DeleteDbflowObtenantExAsync(DeleteDbflowObtenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDbflowObtenantResponse>(await DoRequestAsync("1.0", "antcloud.ldc.dbflow.obtenant.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新原生技术栈版本信息（Dockerfile模板信息）
         * Summary: 更新原生技术栈版本信息
         */
        public UpdateBuildpackNativetechstackversionResponse UpdateBuildpackNativetechstackversion(UpdateBuildpackNativetechstackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBuildpackNativetechstackversionEx(request, headers, runtime);
        }

        /**
         * Description: 更新原生技术栈版本信息（Dockerfile模板信息）
         * Summary: 更新原生技术栈版本信息
         */
        public async Task<UpdateBuildpackNativetechstackversionResponse> UpdateBuildpackNativetechstackversionAsync(UpdateBuildpackNativetechstackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBuildpackNativetechstackversionExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新原生技术栈版本信息（Dockerfile模板信息）
         * Summary: 更新原生技术栈版本信息
         */
        public UpdateBuildpackNativetechstackversionResponse UpdateBuildpackNativetechstackversionEx(UpdateBuildpackNativetechstackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpackNativetechstackversionResponse>(DoRequest("1.0", "antcloud.ldc.buildpack.nativetechstackversion.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新原生技术栈版本信息（Dockerfile模板信息）
         * Summary: 更新原生技术栈版本信息
         */
        public async Task<UpdateBuildpackNativetechstackversionResponse> UpdateBuildpackNativetechstackversionExAsync(UpdateBuildpackNativetechstackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpackNativetechstackversionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.buildpack.nativetechstackversion.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前环境组的region列表信息
         * Summary: 获取环境组region信息
         */
        public ListWorkspacegroupRegionsResponse ListWorkspacegroupRegions(ListWorkspacegroupRegionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListWorkspacegroupRegionsEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前环境组的region列表信息
         * Summary: 获取环境组region信息
         */
        public async Task<ListWorkspacegroupRegionsResponse> ListWorkspacegroupRegionsAsync(ListWorkspacegroupRegionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListWorkspacegroupRegionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前环境组的region列表信息
         * Summary: 获取环境组region信息
         */
        public ListWorkspacegroupRegionsResponse ListWorkspacegroupRegionsEx(ListWorkspacegroupRegionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWorkspacegroupRegionsResponse>(DoRequest("1.0", "antcloud.ldc.workspacegroup.regions.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前环境组的region列表信息
         * Summary: 获取环境组region信息
         */
        public async Task<ListWorkspacegroupRegionsResponse> ListWorkspacegroupRegionsExAsync(ListWorkspacegroupRegionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWorkspacegroupRegionsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.workspacegroup.regions.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取集群列表信息
         * Summary: 获取集群列表
         */
        public ListClusterInfoResponse ListClusterInfo(ListClusterInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListClusterInfoEx(request, headers, runtime);
        }

        /**
         * Description: 获取集群列表信息
         * Summary: 获取集群列表
         */
        public async Task<ListClusterInfoResponse> ListClusterInfoAsync(ListClusterInfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListClusterInfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取集群列表信息
         * Summary: 获取集群列表
         */
        public ListClusterInfoResponse ListClusterInfoEx(ListClusterInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterInfoResponse>(DoRequest("1.0", "antcloud.ldc.cluster.info.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取集群列表信息
         * Summary: 获取集群列表
         */
        public async Task<ListClusterInfoResponse> ListClusterInfoExAsync(ListClusterInfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterInfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.info.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取集群资源状态信息
         * Summary: 获取集群资源状态信息
         */
        public ListClusterOverviewResponse ListClusterOverview(ListClusterOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListClusterOverviewEx(request, headers, runtime);
        }

        /**
         * Description: 获取集群资源状态信息
         * Summary: 获取集群资源状态信息
         */
        public async Task<ListClusterOverviewResponse> ListClusterOverviewAsync(ListClusterOverviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListClusterOverviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取集群资源状态信息
         * Summary: 获取集群资源状态信息
         */
        public ListClusterOverviewResponse ListClusterOverviewEx(ListClusterOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterOverviewResponse>(DoRequest("1.0", "antcloud.ldc.cluster.overview.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取集群资源状态信息
         * Summary: 获取集群资源状态信息
         */
        public async Task<ListClusterOverviewResponse> ListClusterOverviewExAsync(ListClusterOverviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListClusterOverviewResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cluster.overview.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询ALB证书信息。
         * Summary: 查询ALB证书信息。
         */
        public ListCertificatesResponse ListCertificates(ListCertificatesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCertificatesEx(request, headers, runtime);
        }

        /**
         * Description: 查询ALB证书信息。
         * Summary: 查询ALB证书信息。
         */
        public async Task<ListCertificatesResponse> ListCertificatesAsync(ListCertificatesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCertificatesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询ALB证书信息。
         * Summary: 查询ALB证书信息。
         */
        public ListCertificatesResponse ListCertificatesEx(ListCertificatesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCertificatesResponse>(DoRequest("1.0", "antcloud.ldc.certificates.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询ALB证书信息。
         * Summary: 查询ALB证书信息。
         */
        public async Task<ListCertificatesResponse> ListCertificatesExAsync(ListCertificatesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCertificatesResponse>(await DoRequestAsync("1.0", "antcloud.ldc.certificates.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有已被使用的lb iaas id。
         * Summary: 获取所有已被使用的lb iaas id。
         */
        public ListLoadbalancerResponse ListLoadbalancer(ListLoadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListLoadbalancerEx(request, headers, runtime);
        }

        /**
         * Description: 获取所有已被使用的lb iaas id。
         * Summary: 获取所有已被使用的lb iaas id。
         */
        public async Task<ListLoadbalancerResponse> ListLoadbalancerAsync(ListLoadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListLoadbalancerExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取所有已被使用的lb iaas id。
         * Summary: 获取所有已被使用的lb iaas id。
         */
        public ListLoadbalancerResponse ListLoadbalancerEx(ListLoadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLoadbalancerResponse>(DoRequest("1.0", "antcloud.ldc.loadbalancer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取所有已被使用的lb iaas id。
         * Summary: 获取所有已被使用的lb iaas id。
         */
        public async Task<ListLoadbalancerResponse> ListLoadbalancerExAsync(ListLoadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListLoadbalancerResponse>(await DoRequestAsync("1.0", "antcloud.ldc.loadbalancer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取cloudconfig当前配置
         * Summary: 获取cloudconfig当前配置
         */
        public GetCloudconfigResponse GetCloudconfig(GetCloudconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCloudconfigEx(request, headers, runtime);
        }

        /**
         * Description: 获取cloudconfig当前配置
         * Summary: 获取cloudconfig当前配置
         */
        public async Task<GetCloudconfigResponse> GetCloudconfigAsync(GetCloudconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCloudconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取cloudconfig当前配置
         * Summary: 获取cloudconfig当前配置
         */
        public GetCloudconfigResponse GetCloudconfigEx(GetCloudconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCloudconfigResponse>(DoRequest("1.0", "antcloud.ldc.cloudconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取cloudconfig当前配置
         * Summary: 获取cloudconfig当前配置
         */
        public async Task<GetCloudconfigResponse> GetCloudconfigExAsync(GetCloudconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCloudconfigResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cloudconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新cloudconfig
         * Summary: 更新cloudconfig
         */
        public UpdateCloudconfigResponse UpdateCloudconfig(UpdateCloudconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCloudconfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新cloudconfig
         * Summary: 更新cloudconfig
         */
        public async Task<UpdateCloudconfigResponse> UpdateCloudconfigAsync(UpdateCloudconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCloudconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新cloudconfig
         * Summary: 更新cloudconfig
         */
        public UpdateCloudconfigResponse UpdateCloudconfigEx(UpdateCloudconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCloudconfigResponse>(DoRequest("1.0", "antcloud.ldc.cloudconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新cloudconfig
         * Summary: 更新cloudconfig
         */
        public async Task<UpdateCloudconfigResponse> UpdateCloudconfigExAsync(UpdateCloudconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCloudconfigResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cloudconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版本历史
         * Summary: 版本历史
         */
        public ListCloudconfigHistoryResponse ListCloudconfigHistory(ListCloudconfigHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCloudconfigHistoryEx(request, headers, runtime);
        }

        /**
         * Description: 版本历史
         * Summary: 版本历史
         */
        public async Task<ListCloudconfigHistoryResponse> ListCloudconfigHistoryAsync(ListCloudconfigHistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCloudconfigHistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 版本历史
         * Summary: 版本历史
         */
        public ListCloudconfigHistoryResponse ListCloudconfigHistoryEx(ListCloudconfigHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCloudconfigHistoryResponse>(DoRequest("1.0", "antcloud.ldc.cloudconfig.history.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 版本历史
         * Summary: 版本历史
         */
        public async Task<ListCloudconfigHistoryResponse> ListCloudconfigHistoryExAsync(ListCloudconfigHistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCloudconfigHistoryResponse>(await DoRequestAsync("1.0", "antcloud.ldc.cloudconfig.history.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sidecar运维能力创建（接入|升级）
         * Summary: sidecar运维创建（接入|升级）
         */
        public CreateSidecarOperationResponse CreateSidecarOperation(CreateSidecarOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSidecarOperationEx(request, headers, runtime);
        }

        /**
         * Description: sidecar运维能力创建（接入|升级）
         * Summary: sidecar运维创建（接入|升级）
         */
        public async Task<CreateSidecarOperationResponse> CreateSidecarOperationAsync(CreateSidecarOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSidecarOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: sidecar运维能力创建（接入|升级）
         * Summary: sidecar运维创建（接入|升级）
         */
        public CreateSidecarOperationResponse CreateSidecarOperationEx(CreateSidecarOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarOperationResponse>(DoRequest("1.0", "antcloud.ldc.sidecar.operation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: sidecar运维能力创建（接入|升级）
         * Summary: sidecar运维创建（接入|升级）
         */
        public async Task<CreateSidecarOperationResponse> CreateSidecarOperationExAsync(CreateSidecarOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarOperationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecar.operation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定operationId重试sidecar运维
         * Summary: 重试sidecar运维
         */
        public RetrySidecarOperationResponse RetrySidecarOperation(RetrySidecarOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetrySidecarOperationEx(request, headers, runtime);
        }

        /**
         * Description: 指定operationId重试sidecar运维
         * Summary: 重试sidecar运维
         */
        public async Task<RetrySidecarOperationResponse> RetrySidecarOperationAsync(RetrySidecarOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetrySidecarOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 指定operationId重试sidecar运维
         * Summary: 重试sidecar运维
         */
        public RetrySidecarOperationResponse RetrySidecarOperationEx(RetrySidecarOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetrySidecarOperationResponse>(DoRequest("1.0", "antcloud.ldc.sidecar.operation.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 指定operationId重试sidecar运维
         * Summary: 重试sidecar运维
         */
        public async Task<RetrySidecarOperationResponse> RetrySidecarOperationExAsync(RetrySidecarOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetrySidecarOperationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecar.operation.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消sidecar运维
         * Summary: 取消sidecar运维
         */
        public CancelSidecarOperationResponse CancelSidecarOperation(CancelSidecarOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelSidecarOperationEx(request, headers, runtime);
        }

        /**
         * Description: 取消sidecar运维
         * Summary: 取消sidecar运维
         */
        public async Task<CancelSidecarOperationResponse> CancelSidecarOperationAsync(CancelSidecarOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelSidecarOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消sidecar运维
         * Summary: 取消sidecar运维
         */
        public CancelSidecarOperationResponse CancelSidecarOperationEx(CancelSidecarOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSidecarOperationResponse>(DoRequest("1.0", "antcloud.ldc.sidecar.operation.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消sidecar运维
         * Summary: 取消sidecar运维
         */
        public async Task<CancelSidecarOperationResponse> CancelSidecarOperationExAsync(CancelSidecarOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelSidecarOperationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecar.operation.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create or update a service
         * Summary: patch a service
         */
        public UpdateServiceResponse UpdateService(UpdateServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateServiceEx(request, headers, runtime);
        }

        /**
         * Description: create or update a service
         * Summary: patch a service
         */
        public async Task<UpdateServiceResponse> UpdateServiceAsync(UpdateServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: create or update a service
         * Summary: patch a service
         */
        public UpdateServiceResponse UpdateServiceEx(UpdateServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateServiceResponse>(DoRequest("1.0", "antcloud.ldc.service.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create or update a service
         * Summary: patch a service
         */
        public async Task<UpdateServiceResponse> UpdateServiceExAsync(UpdateServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateServiceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.service.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 九州通过LHC创建发布单
         * Summary: 九州通过LHC创建发布单
         */
        public CreateGpaasReleaseResponse CreateGpaasRelease(CreateGpaasReleaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateGpaasReleaseEx(request, headers, runtime);
        }

        /**
         * Description: 九州通过LHC创建发布单
         * Summary: 九州通过LHC创建发布单
         */
        public async Task<CreateGpaasReleaseResponse> CreateGpaasReleaseAsync(CreateGpaasReleaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateGpaasReleaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 九州通过LHC创建发布单
         * Summary: 九州通过LHC创建发布单
         */
        public CreateGpaasReleaseResponse CreateGpaasReleaseEx(CreateGpaasReleaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGpaasReleaseResponse>(DoRequest("1.0", "antcloud.ldc.gpaas.release.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 九州通过LHC创建发布单
         * Summary: 九州通过LHC创建发布单
         */
        public async Task<CreateGpaasReleaseResponse> CreateGpaasReleaseExAsync(CreateGpaasReleaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGpaasReleaseResponse>(await DoRequestAsync("1.0", "antcloud.ldc.gpaas.release.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar运维进度
         * Summary: 查询sidecar运维进度
         */
        public QuerySidecarOperationResponse QuerySidecarOperation(QuerySidecarOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySidecarOperationEx(request, headers, runtime);
        }

        /**
         * Description: 查询sidecar运维进度
         * Summary: 查询sidecar运维进度
         */
        public async Task<QuerySidecarOperationResponse> QuerySidecarOperationAsync(QuerySidecarOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySidecarOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询sidecar运维进度
         * Summary: 查询sidecar运维进度
         */
        public QuerySidecarOperationResponse QuerySidecarOperationEx(QuerySidecarOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySidecarOperationResponse>(DoRequest("1.0", "antcloud.ldc.sidecar.operation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar运维进度
         * Summary: 查询sidecar运维进度
         */
        public async Task<QuerySidecarOperationResponse> QuerySidecarOperationExAsync(QuerySidecarOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySidecarOperationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecar.operation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Kubernetes原生资源
         * Summary: 查询Kubernetes原生资源
         */
        public ListKubernetesResourcesResponse ListKubernetesResources(ListKubernetesResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListKubernetesResourcesEx(request, headers, runtime);
        }

        /**
         * Description: 查询Kubernetes原生资源
         * Summary: 查询Kubernetes原生资源
         */
        public async Task<ListKubernetesResourcesResponse> ListKubernetesResourcesAsync(ListKubernetesResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListKubernetesResourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询Kubernetes原生资源
         * Summary: 查询Kubernetes原生资源
         */
        public ListKubernetesResourcesResponse ListKubernetesResourcesEx(ListKubernetesResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListKubernetesResourcesResponse>(DoRequest("1.0", "antcloud.ldc.kubernetes.resources.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询Kubernetes原生资源
         * Summary: 查询Kubernetes原生资源
         */
        public async Task<ListKubernetesResourcesResponse> ListKubernetesResourcesExAsync(ListKubernetesResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListKubernetesResourcesResponse>(await DoRequestAsync("1.0", "antcloud.ldc.kubernetes.resources.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public QueryReleasepipelinestageEventResponse QueryReleasepipelinestageEvent(QueryReleasepipelinestageEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryReleasepipelinestageEventEx(request, headers, runtime);
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public async Task<QueryReleasepipelinestageEventResponse> QueryReleasepipelinestageEventAsync(QueryReleasepipelinestageEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryReleasepipelinestageEventExAsync(request, headers, runtime);
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public QueryReleasepipelinestageEventResponse QueryReleasepipelinestageEventEx(QueryReleasepipelinestageEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryReleasepipelinestageEventResponse>(DoRequest("1.0", "antcloud.ldc.releasepipelinestage.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public async Task<QueryReleasepipelinestageEventResponse> QueryReleasepipelinestageEventExAsync(QueryReleasepipelinestageEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryReleasepipelinestageEventResponse>(await DoRequestAsync("1.0", "antcloud.ldc.releasepipelinestage.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取projectname
         * Summary: 获取projectname
         */
        public GetSlsProjectnameResponse GetSlsProjectname(GetSlsProjectnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSlsProjectnameEx(request, headers, runtime);
        }

        /**
         * Description: 获取projectname
         * Summary: 获取projectname
         */
        public async Task<GetSlsProjectnameResponse> GetSlsProjectnameAsync(GetSlsProjectnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSlsProjectnameExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取projectname
         * Summary: 获取projectname
         */
        public GetSlsProjectnameResponse GetSlsProjectnameEx(GetSlsProjectnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSlsProjectnameResponse>(DoRequest("1.0", "antcloud.ldc.sls.projectname.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取projectname
         * Summary: 获取projectname
         */
        public async Task<GetSlsProjectnameResponse> GetSlsProjectnameExAsync(GetSlsProjectnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSlsProjectnameResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sls.projectname.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public QueryReleasepipelineEventResponse QueryReleasepipelineEvent(QueryReleasepipelineEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryReleasepipelineEventEx(request, headers, runtime);
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public async Task<QueryReleasepipelineEventResponse> QueryReleasepipelineEventAsync(QueryReleasepipelineEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryReleasepipelineEventExAsync(request, headers, runtime);
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public QueryReleasepipelineEventResponse QueryReleasepipelineEventEx(QueryReleasepipelineEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryReleasepipelineEventResponse>(DoRequest("1.0", "antcloud.ldc.releasepipeline.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public async Task<QueryReleasepipelineEventResponse> QueryReleasepipelineEventExAsync(QueryReleasepipelineEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryReleasepipelineEventResponse>(await DoRequestAsync("1.0", "antcloud.ldc.releasepipeline.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public QueryPodEventResponse QueryPodEvent(QueryPodEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPodEventEx(request, headers, runtime);
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public async Task<QueryPodEventResponse> QueryPodEventAsync(QueryPodEventRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPodEventExAsync(request, headers, runtime);
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public QueryPodEventResponse QueryPodEventEx(QueryPodEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPodEventResponse>(DoRequest("1.0", "antcloud.ldc.pod.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc发布单发布分组相关k8s事件查询，包括pod，stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关k8s事件查询
         */
        public async Task<QueryPodEventResponse> QueryPodEventExAsync(QueryPodEventRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPodEventResponse>(await DoRequestAsync("1.0", "antcloud.ldc.pod.event.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关logs查询
         */
        public QueryServiceProcesslogResponse QueryServiceProcesslog(QueryServiceProcesslogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServiceProcesslogEx(request, headers, runtime);
        }

        /**
         * Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关logs查询
         */
        public async Task<QueryServiceProcesslogResponse> QueryServiceProcesslogAsync(QueryServiceProcesslogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServiceProcesslogExAsync(request, headers, runtime);
        }

        /**
         * Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关logs查询
         */
        public QueryServiceProcesslogResponse QueryServiceProcesslogEx(QueryServiceProcesslogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceProcesslogResponse>(DoRequest("1.0", "antcloud.ldc.service.processlog.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc发布单发布分组相关log查询，包括stage，rpv2等资源相关的事件
         * Summary: ldc发布单相关logs查询
         */
        public async Task<QueryServiceProcesslogResponse> QueryServiceProcesslogExAsync(QueryServiceProcesslogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceProcesslogResponse>(await DoRequestAsync("1.0", "antcloud.ldc.service.processlog.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-在应用维度查询容器应用服务
         * Summary: 应用管理-在应用维度查询容器应用服务
         */
        public QueryAppServiceResponse QueryAppService(QueryAppServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppServiceEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-在应用维度查询容器应用服务
         * Summary: 应用管理-在应用维度查询容器应用服务
         */
        public async Task<QueryAppServiceResponse> QueryAppServiceAsync(QueryAppServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-在应用维度查询容器应用服务
         * Summary: 应用管理-在应用维度查询容器应用服务
         */
        public QueryAppServiceResponse QueryAppServiceEx(QueryAppServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppServiceResponse>(DoRequest("1.0", "antcloud.ldc.app.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-在应用维度查询容器应用服务
         * Summary: 应用管理-在应用维度查询容器应用服务
         */
        public async Task<QueryAppServiceResponse> QueryAppServiceExAsync(QueryAppServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppServiceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.app.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-应用维度查询容器应用服务发布单
         * Summary: 应用管理-应用维度查询容器应用服务发布单
         */
        public QueryAppPlanResponse QueryAppPlan(QueryAppPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppPlanEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-应用维度查询容器应用服务发布单
         * Summary: 应用管理-应用维度查询容器应用服务发布单
         */
        public async Task<QueryAppPlanResponse> QueryAppPlanAsync(QueryAppPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-应用维度查询容器应用服务发布单
         * Summary: 应用管理-应用维度查询容器应用服务发布单
         */
        public QueryAppPlanResponse QueryAppPlanEx(QueryAppPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppPlanResponse>(DoRequest("1.0", "antcloud.ldc.app.plan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-应用维度查询容器应用服务发布单
         * Summary: 应用管理-应用维度查询容器应用服务发布单
         */
        public async Task<QueryAppPlanResponse> QueryAppPlanExAsync(QueryAppPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppPlanResponse>(await DoRequestAsync("1.0", "antcloud.ldc.app.plan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建统一接入实例，支持单元化和非单元化两种模式
         * Summary: 创建统一接入实例
         */
        public CreateUnifiedaccessinstanceResponse CreateUnifiedaccessinstance(CreateUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUnifiedaccessinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 创建统一接入实例，支持单元化和非单元化两种模式
         * Summary: 创建统一接入实例
         */
        public async Task<CreateUnifiedaccessinstanceResponse> CreateUnifiedaccessinstanceAsync(CreateUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUnifiedaccessinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建统一接入实例，支持单元化和非单元化两种模式
         * Summary: 创建统一接入实例
         */
        public CreateUnifiedaccessinstanceResponse CreateUnifiedaccessinstanceEx(CreateUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnifiedaccessinstanceResponse>(DoRequest("1.0", "antcloud.ldc.unifiedaccessinstance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建统一接入实例，支持单元化和非单元化两种模式
         * Summary: 创建统一接入实例
         */
        public async Task<CreateUnifiedaccessinstanceResponse> CreateUnifiedaccessinstanceExAsync(CreateUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnifiedaccessinstanceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unifiedaccessinstance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统一接入实例列表信息
         * Summary: 查询统一接入实例列表信息
         */
        public QueryUnifiedaccessinstanceResponse QueryUnifiedaccessinstance(QueryUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnifiedaccessinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询统一接入实例列表信息
         * Summary: 查询统一接入实例列表信息
         */
        public async Task<QueryUnifiedaccessinstanceResponse> QueryUnifiedaccessinstanceAsync(QueryUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnifiedaccessinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询统一接入实例列表信息
         * Summary: 查询统一接入实例列表信息
         */
        public QueryUnifiedaccessinstanceResponse QueryUnifiedaccessinstanceEx(QueryUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedaccessinstanceResponse>(DoRequest("1.0", "antcloud.ldc.unifiedaccessinstance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统一接入实例列表信息
         * Summary: 查询统一接入实例列表信息
         */
        public async Task<QueryUnifiedaccessinstanceResponse> QueryUnifiedaccessinstanceExAsync(QueryUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnifiedaccessinstanceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unifiedaccessinstance.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取统一接入单个实例信息
         * Summary: 获取统一接入单个实例信息
         */
        public GetUnifiedaccessinstanceResponse GetUnifiedaccessinstance(GetUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUnifiedaccessinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 获取统一接入单个实例信息
         * Summary: 获取统一接入单个实例信息
         */
        public async Task<GetUnifiedaccessinstanceResponse> GetUnifiedaccessinstanceAsync(GetUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUnifiedaccessinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取统一接入单个实例信息
         * Summary: 获取统一接入单个实例信息
         */
        public GetUnifiedaccessinstanceResponse GetUnifiedaccessinstanceEx(GetUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnifiedaccessinstanceResponse>(DoRequest("1.0", "antcloud.ldc.unifiedaccessinstance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取统一接入单个实例信息
         * Summary: 获取统一接入单个实例信息
         */
        public async Task<GetUnifiedaccessinstanceResponse> GetUnifiedaccessinstanceExAsync(GetUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnifiedaccessinstanceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unifiedaccessinstance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除统一接入实例
         * Summary: 删除统一接入实例
         */
        public DeleteUnifiedaccessinstanceResponse DeleteUnifiedaccessinstance(DeleteUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteUnifiedaccessinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 删除统一接入实例
         * Summary: 删除统一接入实例
         */
        public async Task<DeleteUnifiedaccessinstanceResponse> DeleteUnifiedaccessinstanceAsync(DeleteUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteUnifiedaccessinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除统一接入实例
         * Summary: 删除统一接入实例
         */
        public DeleteUnifiedaccessinstanceResponse DeleteUnifiedaccessinstanceEx(DeleteUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUnifiedaccessinstanceResponse>(DoRequest("1.0", "antcloud.ldc.unifiedaccessinstance.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除统一接入实例
         * Summary: 删除统一接入实例
         */
        public async Task<DeleteUnifiedaccessinstanceResponse> DeleteUnifiedaccessinstanceExAsync(DeleteUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteUnifiedaccessinstanceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unifiedaccessinstance.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新统一接入实例信息
         * Summary: 更新统一接入实例信息
         */
        public UpdateUnifiedaccessinstanceResponse UpdateUnifiedaccessinstance(UpdateUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateUnifiedaccessinstanceEx(request, headers, runtime);
        }

        /**
         * Description: 更新统一接入实例信息
         * Summary: 更新统一接入实例信息
         */
        public async Task<UpdateUnifiedaccessinstanceResponse> UpdateUnifiedaccessinstanceAsync(UpdateUnifiedaccessinstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateUnifiedaccessinstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新统一接入实例信息
         * Summary: 更新统一接入实例信息
         */
        public UpdateUnifiedaccessinstanceResponse UpdateUnifiedaccessinstanceEx(UpdateUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUnifiedaccessinstanceResponse>(DoRequest("1.0", "antcloud.ldc.unifiedaccessinstance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新统一接入实例信息
         * Summary: 更新统一接入实例信息
         */
        public async Task<UpdateUnifiedaccessinstanceResponse> UpdateUnifiedaccessinstanceExAsync(UpdateUnifiedaccessinstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateUnifiedaccessinstanceResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unifiedaccessinstance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc 对接统一发布 openAPI
         * Summary: ldc 对接统一发布 openAPI
         */
        public ExecUnireleasespiResponse ExecUnireleasespi(ExecUnireleasespiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecUnireleasespiEx(request, headers, runtime);
        }

        /**
         * Description: ldc 对接统一发布 openAPI
         * Summary: ldc 对接统一发布 openAPI
         */
        public async Task<ExecUnireleasespiResponse> ExecUnireleasespiAsync(ExecUnireleasespiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecUnireleasespiExAsync(request, headers, runtime);
        }

        /**
         * Description: ldc 对接统一发布 openAPI
         * Summary: ldc 对接统一发布 openAPI
         */
        public ExecUnireleasespiResponse ExecUnireleasespiEx(ExecUnireleasespiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecUnireleasespiResponse>(DoRequest("1.0", "antcloud.ldc.unireleasespi.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ldc 对接统一发布 openAPI
         * Summary: ldc 对接统一发布 openAPI
         */
        public async Task<ExecUnireleasespiResponse> ExecUnireleasespiExAsync(ExecUnireleasespiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecUnireleasespiResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unireleasespi.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于创建 fed spanner 集群
         * Summary: 创建 fed spanner 集群
         */
        public CreateFedspannerclusterResponse CreateFedspannercluster(CreateFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFedspannerclusterEx(request, headers, runtime);
        }

        /**
         * Description: 用于创建 fed spanner 集群
         * Summary: 创建 fed spanner 集群
         */
        public async Task<CreateFedspannerclusterResponse> CreateFedspannerclusterAsync(CreateFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFedspannerclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于创建 fed spanner 集群
         * Summary: 创建 fed spanner 集群
         */
        public CreateFedspannerclusterResponse CreateFedspannerclusterEx(CreateFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFedspannerclusterResponse>(DoRequest("1.0", "antcloud.ldc.fedspannercluster.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于创建 fed spanner 集群
         * Summary: 创建 fed spanner 集群
         */
        public async Task<CreateFedspannerclusterResponse> CreateFedspannerclusterExAsync(CreateFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFedspannerclusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedspannercluster.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询联邦fed spanner 集群状态信息
         * Summary: 查询 fed spanner 集群
         */
        public QueryFedspannerclusterResponse QueryFedspannercluster(QueryFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryFedspannerclusterEx(request, headers, runtime);
        }

        /**
         * Description: 查询联邦fed spanner 集群状态信息
         * Summary: 查询 fed spanner 集群
         */
        public async Task<QueryFedspannerclusterResponse> QueryFedspannerclusterAsync(QueryFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryFedspannerclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询联邦fed spanner 集群状态信息
         * Summary: 查询 fed spanner 集群
         */
        public QueryFedspannerclusterResponse QueryFedspannerclusterEx(QueryFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFedspannerclusterResponse>(DoRequest("1.0", "antcloud.ldc.fedspannercluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询联邦fed spanner 集群状态信息
         * Summary: 查询 fed spanner 集群
         */
        public async Task<QueryFedspannerclusterResponse> QueryFedspannerclusterExAsync(QueryFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryFedspannerclusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedspannercluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过fed集群 name 获取单个集群详细信息
         * Summary: 获取单个fed spanner 集群信息
         */
        public GetFedspannerclusterResponse GetFedspannercluster(GetFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFedspannerclusterEx(request, headers, runtime);
        }

        /**
         * Description: 通过fed集群 name 获取单个集群详细信息
         * Summary: 获取单个fed spanner 集群信息
         */
        public async Task<GetFedspannerclusterResponse> GetFedspannerclusterAsync(GetFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFedspannerclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过fed集群 name 获取单个集群详细信息
         * Summary: 获取单个fed spanner 集群信息
         */
        public GetFedspannerclusterResponse GetFedspannerclusterEx(GetFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFedspannerclusterResponse>(DoRequest("1.0", "antcloud.ldc.fedspannercluster.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过fed集群 name 获取单个集群详细信息
         * Summary: 获取单个fed spanner 集群信息
         */
        public async Task<GetFedspannerclusterResponse> GetFedspannerclusterExAsync(GetFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFedspannerclusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedspannercluster.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 展示所有联邦 spanner 集群
         * Summary: 展示所有联邦 spanner 集群
         */
        public ListFedspannerclusterResponse ListFedspannercluster(ListFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListFedspannerclusterEx(request, headers, runtime);
        }

        /**
         * Description: 展示所有联邦 spanner 集群
         * Summary: 展示所有联邦 spanner 集群
         */
        public async Task<ListFedspannerclusterResponse> ListFedspannerclusterAsync(ListFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListFedspannerclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 展示所有联邦 spanner 集群
         * Summary: 展示所有联邦 spanner 集群
         */
        public ListFedspannerclusterResponse ListFedspannerclusterEx(ListFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFedspannerclusterResponse>(DoRequest("1.0", "antcloud.ldc.fedspannercluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 展示所有联邦 spanner 集群
         * Summary: 展示所有联邦 spanner 集群
         */
        public async Task<ListFedspannerclusterResponse> ListFedspannerclusterExAsync(ListFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFedspannerclusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedspannercluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定fed spanner集群
         * Summary: 删除 联邦spanner集群
         */
        public DeleteFedspannerclusterResponse DeleteFedspannercluster(DeleteFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFedspannerclusterEx(request, headers, runtime);
        }

        /**
         * Description: 删除指定fed spanner集群
         * Summary: 删除 联邦spanner集群
         */
        public async Task<DeleteFedspannerclusterResponse> DeleteFedspannerclusterAsync(DeleteFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFedspannerclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除指定fed spanner集群
         * Summary: 删除 联邦spanner集群
         */
        public DeleteFedspannerclusterResponse DeleteFedspannerclusterEx(DeleteFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFedspannerclusterResponse>(DoRequest("1.0", "antcloud.ldc.fedspannercluster.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定fed spanner集群
         * Summary: 删除 联邦spanner集群
         */
        public async Task<DeleteFedspannerclusterResponse> DeleteFedspannerclusterExAsync(DeleteFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFedspannerclusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedspannercluster.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除指定集群
         * Summary: 批量删除 fed spanner 集群
         */
        public BatchdeleteFedspannerclusterResponse BatchdeleteFedspannercluster(BatchdeleteFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteFedspannerclusterEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除指定集群
         * Summary: 批量删除 fed spanner 集群
         */
        public async Task<BatchdeleteFedspannerclusterResponse> BatchdeleteFedspannerclusterAsync(BatchdeleteFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteFedspannerclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除指定集群
         * Summary: 批量删除 fed spanner 集群
         */
        public BatchdeleteFedspannerclusterResponse BatchdeleteFedspannerclusterEx(BatchdeleteFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteFedspannerclusterResponse>(DoRequest("1.0", "antcloud.ldc.fedspannercluster.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除指定集群
         * Summary: 批量删除 fed spanner 集群
         */
        public async Task<BatchdeleteFedspannerclusterResponse> BatchdeleteFedspannerclusterExAsync(BatchdeleteFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteFedspannerclusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedspannercluster.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新 fed spanner 集群
         * Summary: 更新 fed spanner 集群
         */
        public UpdateFedspannerclusterResponse UpdateFedspannercluster(UpdateFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFedspannerclusterEx(request, headers, runtime);
        }

        /**
         * Description: 更新 fed spanner 集群
         * Summary: 更新 fed spanner 集群
         */
        public async Task<UpdateFedspannerclusterResponse> UpdateFedspannerclusterAsync(UpdateFedspannerclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFedspannerclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新 fed spanner 集群
         * Summary: 更新 fed spanner 集群
         */
        public UpdateFedspannerclusterResponse UpdateFedspannerclusterEx(UpdateFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFedspannerclusterResponse>(DoRequest("1.0", "antcloud.ldc.fedspannercluster.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新 fed spanner 集群
         * Summary: 更新 fed spanner 集群
         */
        public async Task<UpdateFedspannerclusterResponse> UpdateFedspannerclusterExAsync(UpdateFedspannerclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFedspannerclusterResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedspannercluster.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public CreateReleaseplanResponse CreateReleaseplan(CreateReleaseplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateReleaseplanEx(request, headers, runtime);
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public async Task<CreateReleaseplanResponse> CreateReleaseplanAsync(CreateReleaseplanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateReleaseplanExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public CreateReleaseplanResponse CreateReleaseplanEx(CreateReleaseplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateReleaseplanResponse>(DoRequest("1.0", "antcloud.ldc.releaseplan.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public async Task<CreateReleaseplanResponse> CreateReleaseplanExAsync(CreateReleaseplanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateReleaseplanResponse>(await DoRequestAsync("1.0", "antcloud.ldc.releaseplan.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 需要指定fed spanner cluster name 和期望的合法状态
         * Summary: 更新 spanner 集群 状态
         */
        public UpdateFedspannerclusterStatusResponse UpdateFedspannerclusterStatus(UpdateFedspannerclusterStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFedspannerclusterStatusEx(request, headers, runtime);
        }

        /**
         * Description: 需要指定fed spanner cluster name 和期望的合法状态
         * Summary: 更新 spanner 集群 状态
         */
        public async Task<UpdateFedspannerclusterStatusResponse> UpdateFedspannerclusterStatusAsync(UpdateFedspannerclusterStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFedspannerclusterStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 需要指定fed spanner cluster name 和期望的合法状态
         * Summary: 更新 spanner 集群 状态
         */
        public UpdateFedspannerclusterStatusResponse UpdateFedspannerclusterStatusEx(UpdateFedspannerclusterStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFedspannerclusterStatusResponse>(DoRequest("1.0", "antcloud.ldc.fedspannercluster.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 需要指定fed spanner cluster name 和期望的合法状态
         * Summary: 更新 spanner 集群 状态
         */
        public async Task<UpdateFedspannerclusterStatusResponse> UpdateFedspannerclusterStatusExAsync(UpdateFedspannerclusterStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFedspannerclusterStatusResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedspannercluster.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加antvip域名
         * Summary: 添加antvip域名
         */
        public AddAntvipDomainResponse AddAntvipDomain(AddAntvipDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddAntvipDomainEx(request, headers, runtime);
        }

        /**
         * Description: 添加antvip域名
         * Summary: 添加antvip域名
         */
        public async Task<AddAntvipDomainResponse> AddAntvipDomainAsync(AddAntvipDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddAntvipDomainExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加antvip域名
         * Summary: 添加antvip域名
         */
        public AddAntvipDomainResponse AddAntvipDomainEx(AddAntvipDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntvipDomainResponse>(DoRequest("1.0", "antcloud.ldc.antvip.domain.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加antvip域名
         * Summary: 添加antvip域名
         */
        public async Task<AddAntvipDomainResponse> AddAntvipDomainExAsync(AddAntvipDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddAntvipDomainResponse>(await DoRequestAsync("1.0", "antcloud.ldc.antvip.domain.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除antvip域名
         * Summary: 删除antvip域名
         */
        public DeleteAntvipDomainResponse DeleteAntvipDomain(DeleteAntvipDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAntvipDomainEx(request, headers, runtime);
        }

        /**
         * Description: 删除antvip域名
         * Summary: 删除antvip域名
         */
        public async Task<DeleteAntvipDomainResponse> DeleteAntvipDomainAsync(DeleteAntvipDomainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAntvipDomainExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除antvip域名
         * Summary: 删除antvip域名
         */
        public DeleteAntvipDomainResponse DeleteAntvipDomainEx(DeleteAntvipDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAntvipDomainResponse>(DoRequest("1.0", "antcloud.ldc.antvip.domain.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除antvip域名
         * Summary: 删除antvip域名
         */
        public async Task<DeleteAntvipDomainResponse> DeleteAntvipDomainExAsync(DeleteAntvipDomainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAntvipDomainResponse>(await DoRequestAsync("1.0", "antcloud.ldc.antvip.domain.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询容器服务 Ingress 列表。
         * Summary: 查询容器服务 Ingress 列表。
         */
        public ListContainerserviceIngressResponse ListContainerserviceIngress(ListContainerserviceIngressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContainerserviceIngressEx(request, headers, runtime);
        }

        /**
         * Description: 查询容器服务 Ingress 列表。
         * Summary: 查询容器服务 Ingress 列表。
         */
        public async Task<ListContainerserviceIngressResponse> ListContainerserviceIngressAsync(ListContainerserviceIngressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContainerserviceIngressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询容器服务 Ingress 列表。
         * Summary: 查询容器服务 Ingress 列表。
         */
        public ListContainerserviceIngressResponse ListContainerserviceIngressEx(ListContainerserviceIngressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContainerserviceIngressResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.ingress.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询容器服务 Ingress 列表。
         * Summary: 查询容器服务 Ingress 列表。
         */
        public async Task<ListContainerserviceIngressResponse> ListContainerserviceIngressExAsync(ListContainerserviceIngressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContainerserviceIngressResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.ingress.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个运维单
         * Summary: 创建一个运维单
         */
        public CreateContainerserviceOperationResponse CreateContainerserviceOperation(CreateContainerserviceOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateContainerserviceOperationEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个运维单
         * Summary: 创建一个运维单
         */
        public async Task<CreateContainerserviceOperationResponse> CreateContainerserviceOperationAsync(CreateContainerserviceOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateContainerserviceOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个运维单
         * Summary: 创建一个运维单
         */
        public CreateContainerserviceOperationResponse CreateContainerserviceOperationEx(CreateContainerserviceOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContainerserviceOperationResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.operation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个运维单
         * Summary: 创建一个运维单
         */
        public async Task<CreateContainerserviceOperationResponse> CreateContainerserviceOperationExAsync(CreateContainerserviceOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateContainerserviceOperationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.operation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询多集群k8s事件
         * Summary: 查询多集群k8s event
         */
        public ListMulticlusterEventsResponse ListMulticlusterEvents(ListMulticlusterEventsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListMulticlusterEventsEx(request, headers, runtime);
        }

        /**
         * Description: 查询多集群k8s事件
         * Summary: 查询多集群k8s event
         */
        public async Task<ListMulticlusterEventsResponse> ListMulticlusterEventsAsync(ListMulticlusterEventsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListMulticlusterEventsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询多集群k8s事件
         * Summary: 查询多集群k8s event
         */
        public ListMulticlusterEventsResponse ListMulticlusterEventsEx(ListMulticlusterEventsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMulticlusterEventsResponse>(DoRequest("1.0", "antcloud.ldc.multicluster.events.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询多集群k8s事件
         * Summary: 查询多集群k8s event
         */
        public async Task<ListMulticlusterEventsResponse> ListMulticlusterEventsExAsync(ListMulticlusterEventsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListMulticlusterEventsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.multicluster.events.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 部署单提交审批申请
         * Summary: 部署单提交审批申请
         */
        public ApplyContainerserviceDeploymentResponse ApplyContainerserviceDeployment(ApplyContainerserviceDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyContainerserviceDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 部署单提交审批申请
         * Summary: 部署单提交审批申请
         */
        public async Task<ApplyContainerserviceDeploymentResponse> ApplyContainerserviceDeploymentAsync(ApplyContainerserviceDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyContainerserviceDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 部署单提交审批申请
         * Summary: 部署单提交审批申请
         */
        public ApplyContainerserviceDeploymentResponse ApplyContainerserviceDeploymentEx(ApplyContainerserviceDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContainerserviceDeploymentResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.deployment.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 部署单提交审批申请
         * Summary: 部署单提交审批申请
         */
        public async Task<ApplyContainerserviceDeploymentResponse> ApplyContainerserviceDeploymentExAsync(ApplyContainerserviceDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyContainerserviceDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.deployment.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布调整Ingress流量权重比例
         * Summary: 蓝绿发布调整Ingress流量权重比例
         */
        public UpdateIngressTrafficweightResponse UpdateIngressTrafficweight(UpdateIngressTrafficweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateIngressTrafficweightEx(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布调整Ingress流量权重比例
         * Summary: 蓝绿发布调整Ingress流量权重比例
         */
        public async Task<UpdateIngressTrafficweightResponse> UpdateIngressTrafficweightAsync(UpdateIngressTrafficweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateIngressTrafficweightExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布调整Ingress流量权重比例
         * Summary: 蓝绿发布调整Ingress流量权重比例
         */
        public UpdateIngressTrafficweightResponse UpdateIngressTrafficweightEx(UpdateIngressTrafficweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIngressTrafficweightResponse>(DoRequest("1.0", "antcloud.ldc.ingress.trafficweight.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布调整Ingress流量权重比例
         * Summary: 蓝绿发布调整Ingress流量权重比例
         */
        public async Task<UpdateIngressTrafficweightResponse> UpdateIngressTrafficweightExAsync(UpdateIngressTrafficweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateIngressTrafficweightResponse>(await DoRequestAsync("1.0", "antcloud.ldc.ingress.trafficweight.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布查询单蓝区信息
         * Summary: 蓝绿发布查询单蓝区信息
         */
        public GetOpsplanBluedetailResponse GetOpsplanBluedetail(GetOpsplanBluedetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetOpsplanBluedetailEx(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布查询单蓝区信息
         * Summary: 蓝绿发布查询单蓝区信息
         */
        public async Task<GetOpsplanBluedetailResponse> GetOpsplanBluedetailAsync(GetOpsplanBluedetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetOpsplanBluedetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布查询单蓝区信息
         * Summary: 蓝绿发布查询单蓝区信息
         */
        public GetOpsplanBluedetailResponse GetOpsplanBluedetailEx(GetOpsplanBluedetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOpsplanBluedetailResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.bluedetail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布查询单蓝区信息
         * Summary: 蓝绿发布查询单蓝区信息
         */
        public async Task<GetOpsplanBluedetailResponse> GetOpsplanBluedetailExAsync(GetOpsplanBluedetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOpsplanBluedetailResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.bluedetail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
         * Summary: 蓝绿发布查询Ingress流量权重
         */
        public ListIngressTrafficweightResponse ListIngressTrafficweight(ListIngressTrafficweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListIngressTrafficweightEx(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
         * Summary: 蓝绿发布查询Ingress流量权重
         */
        public async Task<ListIngressTrafficweightResponse> ListIngressTrafficweightAsync(ListIngressTrafficweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListIngressTrafficweightExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
         * Summary: 蓝绿发布查询Ingress流量权重
         */
        public ListIngressTrafficweightResponse ListIngressTrafficweightEx(ListIngressTrafficweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIngressTrafficweightResponse>(DoRequest("1.0", "antcloud.ldc.ingress.trafficweight.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布查询当前发布单中所有Ingress流量权重及状态
         * Summary: 蓝绿发布查询Ingress流量权重
         */
        public async Task<ListIngressTrafficweightResponse> ListIngressTrafficweightExAsync(ListIngressTrafficweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListIngressTrafficweightResponse>(await DoRequestAsync("1.0", "antcloud.ldc.ingress.trafficweight.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于OAM模型创建包含多应用服务的应用
         * Summary: 创建包含多应用服务的应用
         */
        public CreateOamserviceApplicationconfigurationResponse CreateOamserviceApplicationconfiguration(CreateOamserviceApplicationconfigurationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOamserviceApplicationconfigurationEx(request, headers, runtime);
        }

        /**
         * Description: 基于OAM模型创建包含多应用服务的应用
         * Summary: 创建包含多应用服务的应用
         */
        public async Task<CreateOamserviceApplicationconfigurationResponse> CreateOamserviceApplicationconfigurationAsync(CreateOamserviceApplicationconfigurationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOamserviceApplicationconfigurationExAsync(request, headers, runtime);
        }

        /**
         * Description: 基于OAM模型创建包含多应用服务的应用
         * Summary: 创建包含多应用服务的应用
         */
        public CreateOamserviceApplicationconfigurationResponse CreateOamserviceApplicationconfigurationEx(CreateOamserviceApplicationconfigurationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOamserviceApplicationconfigurationResponse>(DoRequest("1.0", "antcloud.ldc.oamservice.applicationconfiguration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 基于OAM模型创建包含多应用服务的应用
         * Summary: 创建包含多应用服务的应用
         */
        public async Task<CreateOamserviceApplicationconfigurationResponse> CreateOamserviceApplicationconfigurationExAsync(CreateOamserviceApplicationconfigurationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOamserviceApplicationconfigurationResponse>(await DoRequestAsync("1.0", "antcloud.ldc.oamservice.applicationconfiguration.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于创建联邦负载均衡实例
         * Summary: 创建联邦负载均衡实例
         */
        public CreateFedloadbalancerResponse CreateFedloadbalancer(CreateFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateFedloadbalancerEx(request, headers, runtime);
        }

        /**
         * Description: 用于创建联邦负载均衡实例
         * Summary: 创建联邦负载均衡实例
         */
        public async Task<CreateFedloadbalancerResponse> CreateFedloadbalancerAsync(CreateFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateFedloadbalancerExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于创建联邦负载均衡实例
         * Summary: 创建联邦负载均衡实例
         */
        public CreateFedloadbalancerResponse CreateFedloadbalancerEx(CreateFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFedloadbalancerResponse>(DoRequest("1.0", "antcloud.ldc.fedloadbalancer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于创建联邦负载均衡实例
         * Summary: 创建联邦负载均衡实例
         */
        public async Task<CreateFedloadbalancerResponse> CreateFedloadbalancerExAsync(CreateFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateFedloadbalancerResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedloadbalancer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新联邦负载均衡实例
         * Summary: 更新联邦负载均衡实例
         */
        public UpdateFedloadbalancerResponse UpdateFedloadbalancer(UpdateFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateFedloadbalancerEx(request, headers, runtime);
        }

        /**
         * Description: 更新联邦负载均衡实例
         * Summary: 更新联邦负载均衡实例
         */
        public async Task<UpdateFedloadbalancerResponse> UpdateFedloadbalancerAsync(UpdateFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateFedloadbalancerExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新联邦负载均衡实例
         * Summary: 更新联邦负载均衡实例
         */
        public UpdateFedloadbalancerResponse UpdateFedloadbalancerEx(UpdateFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFedloadbalancerResponse>(DoRequest("1.0", "antcloud.ldc.fedloadbalancer.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新联邦负载均衡实例
         * Summary: 更新联邦负载均衡实例
         */
        public async Task<UpdateFedloadbalancerResponse> UpdateFedloadbalancerExAsync(UpdateFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateFedloadbalancerResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedloadbalancer.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list联邦负载均衡实例
         * Summary: list联邦负载均衡实例
         */
        public ListFedloadbalancerResponse ListFedloadbalancer(ListFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListFedloadbalancerEx(request, headers, runtime);
        }

        /**
         * Description: list联邦负载均衡实例
         * Summary: list联邦负载均衡实例
         */
        public async Task<ListFedloadbalancerResponse> ListFedloadbalancerAsync(ListFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListFedloadbalancerExAsync(request, headers, runtime);
        }

        /**
         * Description: list联邦负载均衡实例
         * Summary: list联邦负载均衡实例
         */
        public ListFedloadbalancerResponse ListFedloadbalancerEx(ListFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFedloadbalancerResponse>(DoRequest("1.0", "antcloud.ldc.fedloadbalancer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list联邦负载均衡实例
         * Summary: list联邦负载均衡实例
         */
        public async Task<ListFedloadbalancerResponse> ListFedloadbalancerExAsync(ListFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListFedloadbalancerResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedloadbalancer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除联邦负载均衡
         * Summary: 删除联邦负载均衡实例
         */
        public DeleteFedloadbalancerResponse DeleteFedloadbalancer(DeleteFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteFedloadbalancerEx(request, headers, runtime);
        }

        /**
         * Description: 删除联邦负载均衡
         * Summary: 删除联邦负载均衡实例
         */
        public async Task<DeleteFedloadbalancerResponse> DeleteFedloadbalancerAsync(DeleteFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteFedloadbalancerExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除联邦负载均衡
         * Summary: 删除联邦负载均衡实例
         */
        public DeleteFedloadbalancerResponse DeleteFedloadbalancerEx(DeleteFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFedloadbalancerResponse>(DoRequest("1.0", "antcloud.ldc.fedloadbalancer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除联邦负载均衡
         * Summary: 删除联邦负载均衡实例
         */
        public async Task<DeleteFedloadbalancerResponse> DeleteFedloadbalancerExAsync(DeleteFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteFedloadbalancerResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedloadbalancer.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个联邦负载均衡实例
         * Summary: 查询单个联邦负载均衡实例
         */
        public GetFedloadbalancerResponse GetFedloadbalancer(GetFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetFedloadbalancerEx(request, headers, runtime);
        }

        /**
         * Description: 查询单个联邦负载均衡实例
         * Summary: 查询单个联邦负载均衡实例
         */
        public async Task<GetFedloadbalancerResponse> GetFedloadbalancerAsync(GetFedloadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetFedloadbalancerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询单个联邦负载均衡实例
         * Summary: 查询单个联邦负载均衡实例
         */
        public GetFedloadbalancerResponse GetFedloadbalancerEx(GetFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFedloadbalancerResponse>(DoRequest("1.0", "antcloud.ldc.fedloadbalancer.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个联邦负载均衡实例
         * Summary: 查询单个联邦负载均衡实例
         */
        public async Task<GetFedloadbalancerResponse> GetFedloadbalancerExAsync(GetFedloadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetFedloadbalancerResponse>(await DoRequestAsync("1.0", "antcloud.ldc.fedloadbalancer.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入统一解决方案
         * Summary: 导入统一解决方案
         */
        public ImportUnireleaseSolutionResponse ImportUnireleaseSolution(ImportUnireleaseSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportUnireleaseSolutionEx(request, headers, runtime);
        }

        /**
         * Description: 导入统一解决方案
         * Summary: 导入统一解决方案
         */
        public async Task<ImportUnireleaseSolutionResponse> ImportUnireleaseSolutionAsync(ImportUnireleaseSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportUnireleaseSolutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入统一解决方案
         * Summary: 导入统一解决方案
         */
        public ImportUnireleaseSolutionResponse ImportUnireleaseSolutionEx(ImportUnireleaseSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportUnireleaseSolutionResponse>(DoRequest("1.0", "antcloud.ldc.unirelease.solution.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入统一解决方案
         * Summary: 导入统一解决方案
         */
        public async Task<ImportUnireleaseSolutionResponse> ImportUnireleaseSolutionExAsync(ImportUnireleaseSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportUnireleaseSolutionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unirelease.solution.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解决方案列表
         * Summary: 查询解决方案列表
         */
        public ListUnireleaseSolutionsResponse ListUnireleaseSolutions(ListUnireleaseSolutionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUnireleaseSolutionsEx(request, headers, runtime);
        }

        /**
         * Description: 查询解决方案列表
         * Summary: 查询解决方案列表
         */
        public async Task<ListUnireleaseSolutionsResponse> ListUnireleaseSolutionsAsync(ListUnireleaseSolutionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUnireleaseSolutionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询解决方案列表
         * Summary: 查询解决方案列表
         */
        public ListUnireleaseSolutionsResponse ListUnireleaseSolutionsEx(ListUnireleaseSolutionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnireleaseSolutionsResponse>(DoRequest("1.0", "antcloud.ldc.unirelease.solutions.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解决方案列表
         * Summary: 查询解决方案列表
         */
        public async Task<ListUnireleaseSolutionsResponse> ListUnireleaseSolutionsExAsync(ListUnireleaseSolutionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnireleaseSolutionsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unirelease.solutions.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解决方案发布详情
         * Summary: 查询解决方案发布详情
         */
        public GetUnireleaseSolutionResponse GetUnireleaseSolution(GetUnireleaseSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUnireleaseSolutionEx(request, headers, runtime);
        }

        /**
         * Description: 查询解决方案发布详情
         * Summary: 查询解决方案发布详情
         */
        public async Task<GetUnireleaseSolutionResponse> GetUnireleaseSolutionAsync(GetUnireleaseSolutionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUnireleaseSolutionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询解决方案发布详情
         * Summary: 查询解决方案发布详情
         */
        public GetUnireleaseSolutionResponse GetUnireleaseSolutionEx(GetUnireleaseSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnireleaseSolutionResponse>(DoRequest("1.0", "antcloud.ldc.unirelease.solution.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解决方案发布详情
         * Summary: 查询解决方案发布详情
         */
        public async Task<GetUnireleaseSolutionResponse> GetUnireleaseSolutionExAsync(GetUnireleaseSolutionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnireleaseSolutionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unirelease.solution.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解决方案发布状态
         * Summary: 查询解决方案发布状态
         */
        public GetUnireleasePipelineResponse GetUnireleasePipeline(GetUnireleasePipelineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUnireleasePipelineEx(request, headers, runtime);
        }

        /**
         * Description: 查询解决方案发布状态
         * Summary: 查询解决方案发布状态
         */
        public async Task<GetUnireleasePipelineResponse> GetUnireleasePipelineAsync(GetUnireleasePipelineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUnireleasePipelineExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询解决方案发布状态
         * Summary: 查询解决方案发布状态
         */
        public GetUnireleasePipelineResponse GetUnireleasePipelineEx(GetUnireleasePipelineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnireleasePipelineResponse>(DoRequest("1.0", "antcloud.ldc.unirelease.pipeline.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询解决方案发布状态
         * Summary: 查询解决方案发布状态
         */
        public async Task<GetUnireleasePipelineResponse> GetUnireleasePipelineExAsync(GetUnireleasePipelineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnireleasePipelineResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unirelease.pipeline.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行机构发布单
         * Summary: 执行机构发布单
         */
        public ExecUnireleasePipelinesResponse ExecUnireleasePipelines(ExecUnireleasePipelinesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecUnireleasePipelinesEx(request, headers, runtime);
        }

        /**
         * Description: 执行机构发布单
         * Summary: 执行机构发布单
         */
        public async Task<ExecUnireleasePipelinesResponse> ExecUnireleasePipelinesAsync(ExecUnireleasePipelinesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecUnireleasePipelinesExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行机构发布单
         * Summary: 执行机构发布单
         */
        public ExecUnireleasePipelinesResponse ExecUnireleasePipelinesEx(ExecUnireleasePipelinesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecUnireleasePipelinesResponse>(DoRequest("1.0", "antcloud.ldc.unirelease.pipelines.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行机构发布单
         * Summary: 执行机构发布单
         */
        public async Task<ExecUnireleasePipelinesResponse> ExecUnireleasePipelinesExAsync(ExecUnireleasePipelinesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecUnireleasePipelinesResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unirelease.pipelines.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据解决方案反查相关租户信息
         * Summary: 根据解决方案反查相关租户信息
         */
        public GetUnireleaseTenantsResponse GetUnireleaseTenants(GetUnireleaseTenantsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUnireleaseTenantsEx(request, headers, runtime);
        }

        /**
         * Description: 根据解决方案反查相关租户信息
         * Summary: 根据解决方案反查相关租户信息
         */
        public async Task<GetUnireleaseTenantsResponse> GetUnireleaseTenantsAsync(GetUnireleaseTenantsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUnireleaseTenantsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据解决方案反查相关租户信息
         * Summary: 根据解决方案反查相关租户信息
         */
        public GetUnireleaseTenantsResponse GetUnireleaseTenantsEx(GetUnireleaseTenantsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnireleaseTenantsResponse>(DoRequest("1.0", "antcloud.ldc.unirelease.tenants.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据解决方案反查相关租户信息
         * Summary: 根据解决方案反查相关租户信息
         */
        public async Task<GetUnireleaseTenantsResponse> GetUnireleaseTenantsExAsync(GetUnireleaseTenantsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnireleaseTenantsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unirelease.tenants.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加中间接变更配置
         * Summary: 添加中间接变更配置
         */
        public AddContainerserviceMiddlewareconfigResponse AddContainerserviceMiddlewareconfig(AddContainerserviceMiddlewareconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddContainerserviceMiddlewareconfigEx(request, headers, runtime);
        }

        /**
         * Description: 添加中间接变更配置
         * Summary: 添加中间接变更配置
         */
        public async Task<AddContainerserviceMiddlewareconfigResponse> AddContainerserviceMiddlewareconfigAsync(AddContainerserviceMiddlewareconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddContainerserviceMiddlewareconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加中间接变更配置
         * Summary: 添加中间接变更配置
         */
        public AddContainerserviceMiddlewareconfigResponse AddContainerserviceMiddlewareconfigEx(AddContainerserviceMiddlewareconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContainerserviceMiddlewareconfigResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.middlewareconfig.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加中间接变更配置
         * Summary: 添加中间接变更配置
         */
        public async Task<AddContainerserviceMiddlewareconfigResponse> AddContainerserviceMiddlewareconfigExAsync(AddContainerserviceMiddlewareconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContainerserviceMiddlewareconfigResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.middlewareconfig.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据选中的单元、pods计算以及分批策略计算分批结果
         * Summary: 计算分批结果
         */
        public ExportOpsplanStagesResponse ExportOpsplanStages(ExportOpsplanStagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportOpsplanStagesEx(request, headers, runtime);
        }

        /**
         * Description: 根据选中的单元、pods计算以及分批策略计算分批结果
         * Summary: 计算分批结果
         */
        public async Task<ExportOpsplanStagesResponse> ExportOpsplanStagesAsync(ExportOpsplanStagesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportOpsplanStagesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据选中的单元、pods计算以及分批策略计算分批结果
         * Summary: 计算分批结果
         */
        public ExportOpsplanStagesResponse ExportOpsplanStagesEx(ExportOpsplanStagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportOpsplanStagesResponse>(DoRequest("1.0", "antcloud.ldc.opsplan.stages.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据选中的单元、pods计算以及分批策略计算分批结果
         * Summary: 计算分批结果
         */
        public async Task<ExportOpsplanStagesResponse> ExportOpsplanStagesExAsync(ExportOpsplanStagesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportOpsplanStagesResponse>(await DoRequestAsync("1.0", "antcloud.ldc.opsplan.stages.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
         * Summary: 应用（服务）基础信息
         */
        public DetailAppMetainfoResponse DetailAppMetainfo(DetailAppMetainfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailAppMetainfoEx(request, headers, runtime);
        }

        /**
         * Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
         * Summary: 应用（服务）基础信息
         */
        public async Task<DetailAppMetainfoResponse> DetailAppMetainfoAsync(DetailAppMetainfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailAppMetainfoExAsync(request, headers, runtime);
        }

        /**
         * Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
         * Summary: 应用（服务）基础信息
         */
        public DetailAppMetainfoResponse DetailAppMetainfoEx(DetailAppMetainfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAppMetainfoResponse>(DoRequest("1.0", "antcloud.ldc.app.metainfo.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: huanyu场景下，根据tenant, appName, wsgLabel获取wsgName, namespace, containerServiceName, 以及containerServiceRevision
         * Summary: 应用（服务）基础信息
         */
        public async Task<DetailAppMetainfoResponse> DetailAppMetainfoExAsync(DetailAppMetainfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailAppMetainfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.app.metainfo.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为指定sidecar更新版本信息，如镜像，feature等
         * Summary: 更新sidecar版本
         */
        public UpdateSidecaropsResponse UpdateSidecarops(UpdateSidecaropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecaropsEx(request, headers, runtime);
        }

        /**
         * Description: 为指定sidecar更新版本信息，如镜像，feature等
         * Summary: 更新sidecar版本
         */
        public async Task<UpdateSidecaropsResponse> UpdateSidecaropsAsync(UpdateSidecaropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecaropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 为指定sidecar更新版本信息，如镜像，feature等
         * Summary: 更新sidecar版本
         */
        public UpdateSidecaropsResponse UpdateSidecaropsEx(UpdateSidecaropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecaropsResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为指定sidecar更新版本信息，如镜像，feature等
         * Summary: 更新sidecar版本
         */
        public async Task<UpdateSidecaropsResponse> UpdateSidecaropsExAsync(UpdateSidecaropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecaropsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务当前的部署单元，及部署副本数
         * Summary: 查询应用服务当前的部署单元，及部署副本数
         */
        public CountContainerserviceCellreplicasResponse CountContainerserviceCellreplicas(CountContainerserviceCellreplicasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountContainerserviceCellreplicasEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务当前的部署单元，及部署副本数
         * Summary: 查询应用服务当前的部署单元，及部署副本数
         */
        public async Task<CountContainerserviceCellreplicasResponse> CountContainerserviceCellreplicasAsync(CountContainerserviceCellreplicasRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountContainerserviceCellreplicasExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务当前的部署单元，及部署副本数
         * Summary: 查询应用服务当前的部署单元，及部署副本数
         */
        public CountContainerserviceCellreplicasResponse CountContainerserviceCellreplicasEx(CountContainerserviceCellreplicasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountContainerserviceCellreplicasResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.cellreplicas.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务当前的部署单元，及部署副本数
         * Summary: 查询应用服务当前的部署单元，及部署副本数
         */
        public async Task<CountContainerserviceCellreplicasResponse> CountContainerserviceCellreplicasExAsync(CountContainerserviceCellreplicasRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountContainerserviceCellreplicasResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.cellreplicas.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定类型sidecar的template列表，最多20条。
         * Summary: 获取sidecar的template列表
         */
        public ListSidecaropsTemplateResponse ListSidecaropsTemplate(ListSidecaropsTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSidecaropsTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 获取指定类型sidecar的template列表，最多20条。
         * Summary: 获取sidecar的template列表
         */
        public async Task<ListSidecaropsTemplateResponse> ListSidecaropsTemplateAsync(ListSidecaropsTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSidecaropsTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指定类型sidecar的template列表，最多20条。
         * Summary: 获取sidecar的template列表
         */
        public ListSidecaropsTemplateResponse ListSidecaropsTemplateEx(ListSidecaropsTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecaropsTemplateResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定类型sidecar的template列表，最多20条。
         * Summary: 获取sidecar的template列表
         */
        public async Task<ListSidecaropsTemplateResponse> ListSidecaropsTemplateExAsync(ListSidecaropsTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecaropsTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
         * Summary: 应用sidecar更新的一致性拉齐
         */
        public UpdateSidecaropsConsistencyResponse UpdateSidecaropsConsistency(UpdateSidecaropsConsistencyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecaropsConsistencyEx(request, headers, runtime);
        }

        /**
         * Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
         * Summary: 应用sidecar更新的一致性拉齐
         */
        public async Task<UpdateSidecaropsConsistencyResponse> UpdateSidecaropsConsistencyAsync(UpdateSidecaropsConsistencyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecaropsConsistencyExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
         * Summary: 应用sidecar更新的一致性拉齐
         */
        public UpdateSidecaropsConsistencyResponse UpdateSidecaropsConsistencyEx(UpdateSidecaropsConsistencyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecaropsConsistencyResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.consistency.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用sidecar更新的一致性拉齐，防止发布时扩容导致的部分pod未更新
         * Summary: 应用sidecar更新的一致性拉齐
         */
        public async Task<UpdateSidecaropsConsistencyResponse> UpdateSidecaropsConsistencyExAsync(UpdateSidecaropsConsistencyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecaropsConsistencyResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.consistency.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
         * Summary: 版本清理
         */
        public FinishSidecaropsResponse FinishSidecarops(FinishSidecaropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FinishSidecaropsEx(request, headers, runtime);
        }

        /**
         * Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
         * Summary: 版本清理
         */
        public async Task<FinishSidecaropsResponse> FinishSidecaropsAsync(FinishSidecaropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FinishSidecaropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
         * Summary: 版本清理
         */
        public FinishSidecaropsResponse FinishSidecaropsEx(FinishSidecaropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishSidecaropsResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清除上一个版本的rd，将本次派发的rd置为weight 0
         * Summary: 版本清理
         */
        public async Task<FinishSidecaropsResponse> FinishSidecaropsExAsync(FinishSidecaropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FinishSidecaropsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.finish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询rd的当前状态。
         * Summary: 查询更新状态
         */
        public QuerySidecaropsStateResponse QuerySidecaropsState(QuerySidecaropsStateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySidecaropsStateEx(request, headers, runtime);
        }

        /**
         * Description: 查询rd的当前状态。
         * Summary: 查询更新状态
         */
        public async Task<QuerySidecaropsStateResponse> QuerySidecaropsStateAsync(QuerySidecaropsStateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySidecaropsStateExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询rd的当前状态。
         * Summary: 查询更新状态
         */
        public QuerySidecaropsStateResponse QuerySidecaropsStateEx(QuerySidecaropsStateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySidecaropsStateResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.state.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询rd的当前状态。
         * Summary: 查询更新状态
         */
        public async Task<QuerySidecaropsStateResponse> QuerySidecaropsStateExAsync(QuerySidecaropsStateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySidecaropsStateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.state.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
         * Summary: 添加sidecar基础模板
         */
        public AddSidecaropsTemplateResponse AddSidecaropsTemplate(AddSidecaropsTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSidecaropsTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
         * Summary: 添加sidecar基础模板
         */
        public async Task<AddSidecaropsTemplateResponse> AddSidecaropsTemplateAsync(AddSidecaropsTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSidecaropsTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
         * Summary: 添加sidecar基础模板
         */
        public AddSidecaropsTemplateResponse AddSidecaropsTemplateEx(AddSidecaropsTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSidecaropsTemplateResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.template.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加特定sidecar类型的基础模板信息，包括镜像地址，tempalte等，会自动更新版本号
         * Summary: 添加sidecar基础模板
         */
        public async Task<AddSidecaropsTemplateResponse> AddSidecaropsTemplateExAsync(AddSidecaropsTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSidecaropsTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.template.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
         * Summary: 查询应用发布sidecar升级的相关记录
         */
        public QuerySidecaropsReleaseinfoResponse QuerySidecaropsReleaseinfo(QuerySidecaropsReleaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySidecaropsReleaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
         * Summary: 查询应用发布sidecar升级的相关记录
         */
        public async Task<QuerySidecaropsReleaseinfoResponse> QuerySidecaropsReleaseinfoAsync(QuerySidecaropsReleaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySidecaropsReleaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
         * Summary: 查询应用发布sidecar升级的相关记录
         */
        public QuerySidecaropsReleaseinfoResponse QuerySidecaropsReleaseinfoEx(QuerySidecaropsReleaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySidecaropsReleaseinfoResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.releaseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用发布sidecar的记录信息，包括特定发布中，填入的feature，镜像号等。
         * Summary: 查询应用发布sidecar升级的相关记录
         */
        public async Task<QuerySidecaropsReleaseinfoResponse> QuerySidecaropsReleaseinfoExAsync(QuerySidecaropsReleaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySidecaropsReleaseinfoResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.releaseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 给存量应用服务注入sidecar，应用服务需已经创建
         * Summary: 初始化注入sidecar
         */
        public InitSidecaropsResponse InitSidecarops(InitSidecaropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitSidecaropsEx(request, headers, runtime);
        }

        /**
         * Description: 给存量应用服务注入sidecar，应用服务需已经创建
         * Summary: 初始化注入sidecar
         */
        public async Task<InitSidecaropsResponse> InitSidecaropsAsync(InitSidecaropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitSidecaropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 给存量应用服务注入sidecar，应用服务需已经创建
         * Summary: 初始化注入sidecar
         */
        public InitSidecaropsResponse InitSidecaropsEx(InitSidecaropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSidecaropsResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 给存量应用服务注入sidecar，应用服务需已经创建
         * Summary: 初始化注入sidecar
         */
        public async Task<InitSidecaropsResponse> InitSidecaropsExAsync(InitSidecaropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSidecaropsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
         * Summary: 重启sidecar容器
         */
        public RebootSidecaropsResponse RebootSidecarops(RebootSidecaropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RebootSidecaropsEx(request, headers, runtime);
        }

        /**
         * Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
         * Summary: 重启sidecar容器
         */
        public async Task<RebootSidecaropsResponse> RebootSidecaropsAsync(RebootSidecaropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RebootSidecaropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
         * Summary: 重启sidecar容器
         */
        public RebootSidecaropsResponse RebootSidecaropsEx(RebootSidecaropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RebootSidecaropsResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.reboot", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对注入了sidecar的容器进行单重启sidecar的操作，部分情况也会引起整个pod的重建。
         * Summary: 重启sidecar容器
         */
        public async Task<RebootSidecaropsResponse> RebootSidecaropsExAsync(RebootSidecaropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RebootSidecaropsResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.reboot", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用服务服务指定版本，lks1.25.0开始支持
         * Summary: 删除指定版本
         */
        public DeleteContainerserviceRevisionResponse DeleteContainerserviceRevision(DeleteContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteContainerserviceRevisionEx(request, headers, runtime);
        }

        /**
         * Description: 删除应用服务服务指定版本，lks1.25.0开始支持
         * Summary: 删除指定版本
         */
        public async Task<DeleteContainerserviceRevisionResponse> DeleteContainerserviceRevisionAsync(DeleteContainerserviceRevisionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteContainerserviceRevisionExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除应用服务服务指定版本，lks1.25.0开始支持
         * Summary: 删除指定版本
         */
        public DeleteContainerserviceRevisionResponse DeleteContainerserviceRevisionEx(DeleteContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContainerserviceRevisionResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.revision.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用服务服务指定版本，lks1.25.0开始支持
         * Summary: 删除指定版本
         */
        public async Task<DeleteContainerserviceRevisionResponse> DeleteContainerserviceRevisionExAsync(DeleteContainerserviceRevisionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContainerserviceRevisionResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.revision.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
         * Summary: 手动执行 hook 配置的 api
         */
        public ExecContainerserviceApihookResponse ExecContainerserviceApihook(ExecContainerserviceApihookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContainerserviceApihookEx(request, headers, runtime);
        }

        /**
         * Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
         * Summary: 手动执行 hook 配置的 api
         */
        public async Task<ExecContainerserviceApihookResponse> ExecContainerserviceApihookAsync(ExecContainerserviceApihookRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContainerserviceApihookExAsync(request, headers, runtime);
        }

        /**
         * Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
         * Summary: 手动执行 hook 配置的 api
         */
        public ExecContainerserviceApihookResponse ExecContainerserviceApihookEx(ExecContainerserviceApihookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContainerserviceApihookResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.apihook.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手动执行 customhook 配置的 api，lks1.25.0开始支持
         * Summary: 手动执行 hook 配置的 api
         */
        public async Task<ExecContainerserviceApihookResponse> ExecContainerserviceApihookExAsync(ExecContainerserviceApihookRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContainerserviceApihookResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.apihook.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
         * Summary: 获取已发布应用服务配置
         */
        public QuerySidecaropsAllservicesResponse QuerySidecaropsAllservices(QuerySidecaropsAllservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySidecaropsAllservicesEx(request, headers, runtime);
        }

        /**
         * Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
         * Summary: 获取已发布应用服务配置
         */
        public async Task<QuerySidecaropsAllservicesResponse> QuerySidecaropsAllservicesAsync(QuerySidecaropsAllservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySidecaropsAllservicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
         * Summary: 获取已发布应用服务配置
         */
        public QuerySidecaropsAllservicesResponse QuerySidecaropsAllservicesEx(QuerySidecaropsAllservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySidecaropsAllservicesResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.allservices.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取已发布应用服务的sidecar配置，主要用于sidecar全站升级时，当前服务sidecar状态的获取
         * Summary: 获取已发布应用服务配置
         */
        public async Task<QuerySidecaropsAllservicesResponse> QuerySidecaropsAllservicesExAsync(QuerySidecaropsAllservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySidecaropsAllservicesResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.allservices.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可用于更新基线模板的作用范围等
         * Summary: 更新sidecar基线模板
         */
        public UpdateSidecaropsTemplateResponse UpdateSidecaropsTemplate(UpdateSidecaropsTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecaropsTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 可用于更新基线模板的作用范围等
         * Summary: 更新sidecar基线模板
         */
        public async Task<UpdateSidecaropsTemplateResponse> UpdateSidecaropsTemplateAsync(UpdateSidecaropsTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecaropsTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 可用于更新基线模板的作用范围等
         * Summary: 更新sidecar基线模板
         */
        public UpdateSidecaropsTemplateResponse UpdateSidecaropsTemplateEx(UpdateSidecaropsTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecaropsTemplateResponse>(DoRequest("1.0", "antcloud.ldc.sidecarops.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可用于更新基线模板的作用范围等
         * Summary: 更新sidecar基线模板
         */
        public async Task<UpdateSidecaropsTemplateResponse> UpdateSidecaropsTemplateExAsync(UpdateSidecaropsTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecaropsTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.sidecarops.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布模板
         * Summary: 创建发布模板
         */
        public CreateDeploymentTemplateResponse CreateDeploymentTemplate(CreateDeploymentTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDeploymentTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 创建发布模板
         * Summary: 创建发布模板
         */
        public async Task<CreateDeploymentTemplateResponse> CreateDeploymentTemplateAsync(CreateDeploymentTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDeploymentTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建发布模板
         * Summary: 创建发布模板
         */
        public CreateDeploymentTemplateResponse CreateDeploymentTemplateEx(CreateDeploymentTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeploymentTemplateResponse>(DoRequest("1.0", "antcloud.ldc.deployment.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布模板
         * Summary: 创建发布模板
         */
        public async Task<CreateDeploymentTemplateResponse> CreateDeploymentTemplateExAsync(CreateDeploymentTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeploymentTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布方案文件列表
         * Summary: 查询发布方案文件列表
         */
        public QueryUnireleaseSolutionfilesResponse QueryUnireleaseSolutionfiles(QueryUnireleaseSolutionfilesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnireleaseSolutionfilesEx(request, headers, runtime);
        }

        /**
         * Description: 查询发布方案文件列表
         * Summary: 查询发布方案文件列表
         */
        public async Task<QueryUnireleaseSolutionfilesResponse> QueryUnireleaseSolutionfilesAsync(QueryUnireleaseSolutionfilesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnireleaseSolutionfilesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发布方案文件列表
         * Summary: 查询发布方案文件列表
         */
        public QueryUnireleaseSolutionfilesResponse QueryUnireleaseSolutionfilesEx(QueryUnireleaseSolutionfilesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnireleaseSolutionfilesResponse>(DoRequest("1.0", "antcloud.ldc.unirelease.solutionfiles.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布方案文件列表
         * Summary: 查询发布方案文件列表
         */
        public async Task<QueryUnireleaseSolutionfilesResponse> QueryUnireleaseSolutionfilesExAsync(QueryUnireleaseSolutionfilesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnireleaseSolutionfilesResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unirelease.solutionfiles.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布方案文件内容
         * Summary: 获取发布方案文件内容
         */
        public GetUnireleaseSolutionfileResponse GetUnireleaseSolutionfile(GetUnireleaseSolutionfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetUnireleaseSolutionfileEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布方案文件内容
         * Summary: 获取发布方案文件内容
         */
        public async Task<GetUnireleaseSolutionfileResponse> GetUnireleaseSolutionfileAsync(GetUnireleaseSolutionfileRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetUnireleaseSolutionfileExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布方案文件内容
         * Summary: 获取发布方案文件内容
         */
        public GetUnireleaseSolutionfileResponse GetUnireleaseSolutionfileEx(GetUnireleaseSolutionfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnireleaseSolutionfileResponse>(DoRequest("1.0", "antcloud.ldc.unirelease.solutionfile.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布方案文件内容
         * Summary: 获取发布方案文件内容
         */
        public async Task<GetUnireleaseSolutionfileResponse> GetUnireleaseSolutionfileExAsync(GetUnireleaseSolutionfileRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetUnireleaseSolutionfileResponse>(await DoRequestAsync("1.0", "antcloud.ldc.unirelease.solutionfile.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新发布模板
         * Summary: 更新发布模板
         */
        public UpdateDeploymentTemplateResponse UpdateDeploymentTemplate(UpdateDeploymentTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDeploymentTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 更新发布模板
         * Summary: 更新发布模板
         */
        public async Task<UpdateDeploymentTemplateResponse> UpdateDeploymentTemplateAsync(UpdateDeploymentTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDeploymentTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新发布模板
         * Summary: 更新发布模板
         */
        public UpdateDeploymentTemplateResponse UpdateDeploymentTemplateEx(UpdateDeploymentTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDeploymentTemplateResponse>(DoRequest("1.0", "antcloud.ldc.deployment.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新发布模板
         * Summary: 更新发布模板
         */
        public async Task<UpdateDeploymentTemplateResponse> UpdateDeploymentTemplateExAsync(UpdateDeploymentTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDeploymentTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.template.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布模板
         * Summary: 查询发布模板
         */
        public ListDeploymentTemplateResponse ListDeploymentTemplate(ListDeploymentTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDeploymentTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 查询发布模板
         * Summary: 查询发布模板
         */
        public async Task<ListDeploymentTemplateResponse> ListDeploymentTemplateAsync(ListDeploymentTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDeploymentTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发布模板
         * Summary: 查询发布模板
         */
        public ListDeploymentTemplateResponse ListDeploymentTemplateEx(ListDeploymentTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDeploymentTemplateResponse>(DoRequest("1.0", "antcloud.ldc.deployment.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布模板
         * Summary: 查询发布模板
         */
        public async Task<ListDeploymentTemplateResponse> ListDeploymentTemplateExAsync(ListDeploymentTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDeploymentTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.template.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除发布模板
         * Summary: 删除发布模板
         */
        public DeleteDeploymentTemplateResponse DeleteDeploymentTemplate(DeleteDeploymentTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDeploymentTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 删除发布模板
         * Summary: 删除发布模板
         */
        public async Task<DeleteDeploymentTemplateResponse> DeleteDeploymentTemplateAsync(DeleteDeploymentTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDeploymentTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除发布模板
         * Summary: 删除发布模板
         */
        public DeleteDeploymentTemplateResponse DeleteDeploymentTemplateEx(DeleteDeploymentTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDeploymentTemplateResponse>(DoRequest("1.0", "antcloud.ldc.deployment.template.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除发布模板
         * Summary: 删除发布模板
         */
        public async Task<DeleteDeploymentTemplateResponse> DeleteDeploymentTemplateExAsync(DeleteDeploymentTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDeploymentTemplateResponse>(await DoRequestAsync("1.0", "antcloud.ldc.deployment.template.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询守夜人预案列表
         * Summary: 查询守夜人预案列表
         */
        public ListEmergencyPlansResponse ListEmergencyPlans(ListEmergencyPlansRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListEmergencyPlansEx(request, headers, runtime);
        }

        /**
         * Description: 查询守夜人预案列表
         * Summary: 查询守夜人预案列表
         */
        public async Task<ListEmergencyPlansResponse> ListEmergencyPlansAsync(ListEmergencyPlansRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListEmergencyPlansExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询守夜人预案列表
         * Summary: 查询守夜人预案列表
         */
        public ListEmergencyPlansResponse ListEmergencyPlansEx(ListEmergencyPlansRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEmergencyPlansResponse>(DoRequest("1.0", "antcloud.ldc.emergency.plans.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询守夜人预案列表
         * Summary: 查询守夜人预案列表
         */
        public async Task<ListEmergencyPlansResponse> ListEmergencyPlansExAsync(ListEmergencyPlansRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListEmergencyPlansResponse>(await DoRequestAsync("1.0", "antcloud.ldc.emergency.plans.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改灰度发布规则
         * Summary: 修改灰度发布规则
         */
        public UpdateContainerserviceGrayreleaseconfigResponse UpdateContainerserviceGrayreleaseconfig(UpdateContainerserviceGrayreleaseconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateContainerserviceGrayreleaseconfigEx(request, headers, runtime);
        }

        /**
         * Description: 修改灰度发布规则
         * Summary: 修改灰度发布规则
         */
        public async Task<UpdateContainerserviceGrayreleaseconfigResponse> UpdateContainerserviceGrayreleaseconfigAsync(UpdateContainerserviceGrayreleaseconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateContainerserviceGrayreleaseconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改灰度发布规则
         * Summary: 修改灰度发布规则
         */
        public UpdateContainerserviceGrayreleaseconfigResponse UpdateContainerserviceGrayreleaseconfigEx(UpdateContainerserviceGrayreleaseconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceGrayreleaseconfigResponse>(DoRequest("1.0", "antcloud.ldc.containerservice.grayreleaseconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改灰度发布规则
         * Summary: 修改灰度发布规则
         */
        public async Task<UpdateContainerserviceGrayreleaseconfigResponse> UpdateContainerserviceGrayreleaseconfigExAsync(UpdateContainerserviceGrayreleaseconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateContainerserviceGrayreleaseconfigResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerservice.grayreleaseconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询（灰度）发布单的灰度发布配置
         * Summary: 查询（灰度）发布单的灰度发布配置
         */
        public QueryContainerserivceGrayreleaseconfigResponse QueryContainerserivceGrayreleaseconfig(QueryContainerserivceGrayreleaseconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryContainerserivceGrayreleaseconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询（灰度）发布单的灰度发布配置
         * Summary: 查询（灰度）发布单的灰度发布配置
         */
        public async Task<QueryContainerserivceGrayreleaseconfigResponse> QueryContainerserivceGrayreleaseconfigAsync(QueryContainerserivceGrayreleaseconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryContainerserivceGrayreleaseconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询（灰度）发布单的灰度发布配置
         * Summary: 查询（灰度）发布单的灰度发布配置
         */
        public QueryContainerserivceGrayreleaseconfigResponse QueryContainerserivceGrayreleaseconfigEx(QueryContainerserivceGrayreleaseconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContainerserivceGrayreleaseconfigResponse>(DoRequest("1.0", "antcloud.ldc.containerserivce.grayreleaseconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询（灰度）发布单的灰度发布配置
         * Summary: 查询（灰度）发布单的灰度发布配置
         */
        public async Task<QueryContainerserivceGrayreleaseconfigResponse> QueryContainerserivceGrayreleaseconfigExAsync(QueryContainerserivceGrayreleaseconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryContainerserivceGrayreleaseconfigResponse>(await DoRequestAsync("1.0", "antcloud.ldc.containerserivce.grayreleaseconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
