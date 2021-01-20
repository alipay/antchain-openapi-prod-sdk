// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Deps.Models;

namespace AntChain.SDK.Deps
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
            this._readTimeout = config.ReadTimeout;
            this._connectTimeout = config.ConnectTimeout;
            this._httpProxy = config.HttpProxy;
            this._httpsProxy = config.HttpsProxy;
            this._noProxy = config.NoProxy;
            this._socks5Proxy = config.Socks5Proxy;
            this._socks5NetWork = config.Socks5NetWork;
            this._maxIdleConns = config.MaxIdleConns;
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
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.Client.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "3.2.1"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
                    }
                    request_.Headers = TeaConverter.merge<string>
                    (
                        new Dictionary<string, string>()
                        {
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "undefined")},
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
                    request_.Query["sign"] = AntChain.AlipayUtil.Client.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = TeaCore.DoAction(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.Client.HasError(raw, _accessKeySecret))
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
                        {"req_time", AntChain.AlipayUtil.Client.GetTimestamp()},
                        {"req_msg_id", AntChain.AlipayUtil.Client.GetNonce()},
                        {"access_key", _accessKeyId},
                        {"base_sdk_version", "TeaSDK-2.0"},
                        {"sdk_version", "3.2.1"},
                    };
                    if (!AlibabaCloud.TeaUtil.Common.Empty(_securityToken))
                    {
                        request_.Query["security_token"] = _securityToken;
                    }
                    request_.Headers = TeaConverter.merge<string>
                    (
                        new Dictionary<string, string>()
                        {
                            {"host", AlibabaCloud.TeaUtil.Common.DefaultString(_endpoint, "undefined")},
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
                    request_.Query["sign"] = AntChain.AlipayUtil.Client.GetSignature(signedParam, _accessKeySecret);
                    _lastRequest = request_;
                    TeaResponse response_ = await TeaCore.DoActionAsync(request_, runtime_);

                    string raw = AlibabaCloud.TeaUtil.Common.ReadAsString(response_.Body);
                    object obj = AlibabaCloud.TeaUtil.Common.ParseJSON(raw);
                    Dictionary<string, object> res = AlibabaCloud.TeaUtil.Common.AssertAsMap(obj);
                    Dictionary<string, object> resp = AlibabaCloud.TeaUtil.Common.AssertAsMap(res.Get("response"));
                    if (AntChain.AlipayUtil.Client.HasError(raw, _accessKeySecret))
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
         * Description: 创建一个应用。
         * Summary: 创建应用
         */
        public CreateApplicationResponse CreateApplication(CreateApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用。
         * Summary: 创建应用
         */
        public async Task<CreateApplicationResponse> CreateApplicationAsync(CreateApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用。
         * Summary: 创建应用
         */
        public CreateApplicationResponse CreateApplicationEx(CreateApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplicationResponse>(DoRequest("1.0", "antcloud.deps.application.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用。
         * Summary: 创建应用
         */
        public async Task<CreateApplicationResponse> CreateApplicationExAsync(CreateApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplicationResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用服务实例。
         * Summary: 创建应用服务实例
         */
        public CreateApplicationServiceResponse CreateApplicationService(CreateApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApplicationServiceEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用服务实例。
         * Summary: 创建应用服务实例
         */
        public async Task<CreateApplicationServiceResponse> CreateApplicationServiceAsync(CreateApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApplicationServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用服务实例。
         * Summary: 创建应用服务实例
         */
        public CreateApplicationServiceResponse CreateApplicationServiceEx(CreateApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplicationServiceResponse>(DoRequest("1.0", "antcloud.deps.application.service.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用服务实例。
         * Summary: 创建应用服务实例
         */
        public async Task<CreateApplicationServiceResponse> CreateApplicationServiceExAsync(CreateApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApplicationServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.service.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否启用应用服务实例。
         * Summary: 查询是否启用应用服务实例
         */
        public EnabledApplicationServiceResponse EnabledApplicationService(EnabledApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnabledApplicationServiceEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否启用应用服务实例。
         * Summary: 查询是否启用应用服务实例
         */
        public async Task<EnabledApplicationServiceResponse> EnabledApplicationServiceAsync(EnabledApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnabledApplicationServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否启用应用服务实例。
         * Summary: 查询是否启用应用服务实例
         */
        public EnabledApplicationServiceResponse EnabledApplicationServiceEx(EnabledApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnabledApplicationServiceResponse>(DoRequest("1.0", "antcloud.deps.application.service.enabled", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否启用应用服务实例。
         * Summary: 查询是否启用应用服务实例
         */
        public async Task<EnabledApplicationServiceResponse> EnabledApplicationServiceExAsync(EnabledApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnabledApplicationServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.service.enabled", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取一个应用详情。
         * Summary: 获取应用
         */
        public GetApplicationResponse GetApplication(GetApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 获取一个应用详情。
         * Summary: 获取应用
         */
        public async Task<GetApplicationResponse> GetApplicationAsync(GetApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取一个应用详情。
         * Summary: 获取应用
         */
        public GetApplicationResponse GetApplicationEx(GetApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationResponse>(DoRequest("1.0", "antcloud.deps.application.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取一个应用详情。
         * Summary: 获取应用
         */
        public async Task<GetApplicationResponse> GetApplicationExAsync(GetApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取一个应用服务详情。
         * Summary: 获取应用服务
         */
        public GetApplicationServiceResponse GetApplicationService(GetApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationServiceEx(request, headers, runtime);
        }

        /**
         * Description: 获取一个应用服务详情。
         * Summary: 获取应用服务
         */
        public async Task<GetApplicationServiceResponse> GetApplicationServiceAsync(GetApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取一个应用服务详情。
         * Summary: 获取应用服务
         */
        public GetApplicationServiceResponse GetApplicationServiceEx(GetApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationServiceResponse>(DoRequest("1.0", "antcloud.deps.application.service.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取一个应用服务详情。
         * Summary: 获取应用服务
         */
        public async Task<GetApplicationServiceResponse> GetApplicationServiceExAsync(GetApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.service.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务实例列表。
         * Summary: 查询应用服务实例列表
         */
        public QueryApplicationServiceResponse QueryApplicationService(QueryApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationServiceEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务实例列表。
         * Summary: 查询应用服务实例列表
         */
        public async Task<QueryApplicationServiceResponse> QueryApplicationServiceAsync(QueryApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务实例列表。
         * Summary: 查询应用服务实例列表
         */
        public QueryApplicationServiceResponse QueryApplicationServiceEx(QueryApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationServiceResponse>(DoRequest("1.0", "antcloud.deps.application.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务实例列表。
         * Summary: 查询应用服务实例列表
         */
        public async Task<QueryApplicationServiceResponse> QueryApplicationServiceExAsync(QueryApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个应用服务实例
         * Summary: 删除一个应用服务实例
         */
        public DeleteApplicationServiceResponse DeleteApplicationService(DeleteApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApplicationServiceEx(request, headers, runtime);
        }

        /**
         * Description: 删除一个应用服务实例
         * Summary: 删除一个应用服务实例
         */
        public async Task<DeleteApplicationServiceResponse> DeleteApplicationServiceAsync(DeleteApplicationServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApplicationServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除一个应用服务实例
         * Summary: 删除一个应用服务实例
         */
        public DeleteApplicationServiceResponse DeleteApplicationServiceEx(DeleteApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplicationServiceResponse>(DoRequest("1.0", "antcloud.deps.application.service.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个应用服务实例
         * Summary: 删除一个应用服务实例
         */
        public async Task<DeleteApplicationServiceResponse> DeleteApplicationServiceExAsync(DeleteApplicationServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplicationServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.service.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用发布包详情包括下载地址、校验码等。
         * Summary: 获取应用发布包详情包括下载地址、校验码等。
         */
        public GetApplicationPackageResponse GetApplicationPackage(GetApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationPackageEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用发布包详情包括下载地址、校验码等。
         * Summary: 获取应用发布包详情包括下载地址、校验码等。
         */
        public async Task<GetApplicationPackageResponse> GetApplicationPackageAsync(GetApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationPackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用发布包详情包括下载地址、校验码等。
         * Summary: 获取应用发布包详情包括下载地址、校验码等。
         */
        public GetApplicationPackageResponse GetApplicationPackageEx(GetApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationPackageResponse>(DoRequest("1.0", "antcloud.deps.application.package.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用发布包详情包括下载地址、校验码等。
         * Summary: 获取应用发布包详情包括下载地址、校验码等。
         */
        public async Task<GetApplicationPackageResponse> GetApplicationPackageExAsync(GetApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationPackageResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.package.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用发布包版本详情
         * Summary: 查询应用发布包版本详情
         */
        public QueryAppVersionResponse QueryAppVersion(QueryAppVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppVersionEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用发布包版本详情
         * Summary: 查询应用发布包版本详情
         */
        public async Task<QueryAppVersionResponse> QueryAppVersionAsync(QueryAppVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用发布包版本详情
         * Summary: 查询应用发布包版本详情
         */
        public QueryAppVersionResponse QueryAppVersionEx(QueryAppVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppVersionResponse>(DoRequest("1.0", "antcloud.deps.app.version.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用发布包版本详情
         * Summary: 查询应用发布包版本详情
         */
        public async Task<QueryAppVersionResponse> QueryAppVersionExAsync(QueryAppVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppVersionResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.version.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个应用。
         * Summary: 删除应用
         */
        public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 删除一个应用。
         * Summary: 删除应用
         */
        public async Task<DeleteApplicationResponse> DeleteApplicationAsync(DeleteApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除一个应用。
         * Summary: 删除应用
         */
        public DeleteApplicationResponse DeleteApplicationEx(DeleteApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplicationResponse>(DoRequest("1.0", "antcloud.deps.application.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个应用。
         * Summary: 删除应用
         */
        public async Task<DeleteApplicationResponse> DeleteApplicationExAsync(DeleteApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteApplicationResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户应用列表。
         * Summary: 列出应用
         */
        public ListApplicationResponse ListApplication(ListApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 获取租户应用列表。
         * Summary: 列出应用
         */
        public async Task<ListApplicationResponse> ListApplicationAsync(ListApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取租户应用列表。
         * Summary: 列出应用
         */
        public ListApplicationResponse ListApplicationEx(ListApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplicationResponse>(DoRequest("1.0", "antcloud.deps.application.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户应用列表。
         * Summary: 列出应用
         */
        public async Task<ListApplicationResponse> ListApplicationExAsync(ListApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListApplicationResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户应用分组列表。
         * Summary: 列出应用分组
         */
        public ListAppgroupResponse ListAppgroup(ListAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取租户应用分组列表。
         * Summary: 列出应用分组
         */
        public async Task<ListAppgroupResponse> ListAppgroupAsync(ListAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取租户应用分组列表。
         * Summary: 列出应用分组
         */
        public ListAppgroupResponse ListAppgroupEx(ListAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppgroupResponse>(DoRequest("1.0", "antcloud.deps.appgroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户应用分组列表。
         * Summary: 列出应用分组
         */
        public async Task<ListAppgroupResponse> ListAppgroupExAsync(ListAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.appgroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
         * Summary: 查询应用计算资源
         */
        public QueryApplicationComputerResponse QueryApplicationComputer(QueryApplicationComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationComputerEx(request, headers, runtime);
        }

        /**
         * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
         * Summary: 查询应用计算资源
         */
        public async Task<QueryApplicationComputerResponse> QueryApplicationComputerAsync(QueryApplicationComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
         * Summary: 查询应用计算资源
         */
        public QueryApplicationComputerResponse QueryApplicationComputerEx(QueryApplicationComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationComputerResponse>(DoRequest("1.0", "antcloud.deps.application.computer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的查询条件查询属于某个应用计算资源列表。
         * Summary: 查询应用计算资源
         */
        public async Task<QueryApplicationComputerResponse> QueryApplicationComputerExAsync(QueryApplicationComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationComputerResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.computer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取一个应用的代码库信息。
         * Summary: 获取一个应用的代码库信息
         */
        public GetApplicationRepositoryResponse GetApplicationRepository(GetApplicationRepositoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationRepositoryEx(request, headers, runtime);
        }

        /**
         * Description: 获取一个应用的代码库信息。
         * Summary: 获取一个应用的代码库信息
         */
        public async Task<GetApplicationRepositoryResponse> GetApplicationRepositoryAsync(GetApplicationRepositoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationRepositoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取一个应用的代码库信息。
         * Summary: 获取一个应用的代码库信息
         */
        public GetApplicationRepositoryResponse GetApplicationRepositoryEx(GetApplicationRepositoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationRepositoryResponse>(DoRequest("1.0", "antcloud.deps.application.repository.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取一个应用的代码库信息。
         * Summary: 获取一个应用的代码库信息
         */
        public async Task<GetApplicationRepositoryResponse> GetApplicationRepositoryExAsync(GetApplicationRepositoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationRepositoryResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.repository.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据名称查询应用分组信息
         * Summary: 应用分组查询
         */
        public QueryAppgroupResponse QueryAppgroup(QueryAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppgroupEx(request, headers, runtime);
        }

        /**
         * Description: 根据名称查询应用分组信息
         * Summary: 应用分组查询
         */
        public async Task<QueryAppgroupResponse> QueryAppgroupAsync(QueryAppgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据名称查询应用分组信息
         * Summary: 应用分组查询
         */
        public QueryAppgroupResponse QueryAppgroupEx(QueryAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppgroupResponse>(DoRequest("1.0", "antcloud.deps.appgroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据名称查询应用分组信息
         * Summary: 应用分组查询
         */
        public async Task<QueryAppgroupResponse> QueryAppgroupExAsync(QueryAppgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppgroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.appgroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据条件查询应用等级
         * Summary: 查询应用等级
         */
        public QueryApplevelResponse QueryApplevel(QueryApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplevelEx(request, headers, runtime);
        }

        /**
         * Description: 根据条件查询应用等级
         * Summary: 查询应用等级
         */
        public async Task<QueryApplevelResponse> QueryApplevelAsync(QueryApplevelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplevelExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据条件查询应用等级
         * Summary: 查询应用等级
         */
        public QueryApplevelResponse QueryApplevelEx(QueryApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplevelResponse>(DoRequest("1.0", "antcloud.deps.applevel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据条件查询应用等级
         * Summary: 查询应用等级
         */
        public async Task<QueryApplevelResponse> QueryApplevelExAsync(QueryApplevelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplevelResponse>(await DoRequestAsync("1.0", "antcloud.deps.applevel.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据查询条件查询应用列表。
         * Summary: 查询应用
         */
        public QueryApplicationResponse QueryApplication(QueryApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 根据查询条件查询应用列表。
         * Summary: 查询应用
         */
        public async Task<QueryApplicationResponse> QueryApplicationAsync(QueryApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据查询条件查询应用列表。
         * Summary: 查询应用
         */
        public QueryApplicationResponse QueryApplicationEx(QueryApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationResponse>(DoRequest("1.0", "antcloud.deps.application.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据查询条件查询应用列表。
         * Summary: 查询应用
         */
        public async Task<QueryApplicationResponse> QueryApplicationExAsync(QueryApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
        当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
         * Summary: 创建应用版本
         */
        public CreateAppVersionResponse CreateAppVersion(CreateAppVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppVersionEx(request, headers, runtime);
        }

        /**
         * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
        当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
         * Summary: 创建应用版本
         */
        public async Task<CreateAppVersionResponse> CreateAppVersionAsync(CreateAppVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
        当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
         * Summary: 创建应用版本
         */
        public CreateAppVersionResponse CreateAppVersionEx(CreateAppVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppVersionResponse>(DoRequest("1.0", "antcloud.deps.app.version.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为一个应用创建一个新版本。调用者需要拥有一个文件交换源，APPMS将从指定的文件交换源中下载应用部署包文件，文件路径与名称由调用者指定。
        当应用部署包成功下载完成后，APPMS将为应用创建一个新版本，版本号由调用者指定，并关联此部署包。
         * Summary: 创建应用版本
         */
        public async Task<CreateAppVersionResponse> CreateAppVersionExAsync(CreateAppVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppVersionResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.version.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用增量统计信息
         * Summary: 查询应用增量统计信息
         */
        public QueryAppDeltaResponse QueryAppDelta(QueryAppDeltaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppDeltaEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用增量统计信息
         * Summary: 查询应用增量统计信息
         */
        public async Task<QueryAppDeltaResponse> QueryAppDeltaAsync(QueryAppDeltaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppDeltaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用增量统计信息
         * Summary: 查询应用增量统计信息
         */
        public QueryAppDeltaResponse QueryAppDeltaEx(QueryAppDeltaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppDeltaResponse>(DoRequest("1.0", "antcloud.deps.app.delta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用增量统计信息
         * Summary: 查询应用增量统计信息
         */
        public async Task<QueryAppDeltaResponse> QueryAppDeltaExAsync(QueryAppDeltaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppDeltaResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.delta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的查询条件查询负载均衡资源列表
         * Summary: loadbalancer查询
         */
        public QueryApplicationLoadbalancerResponse QueryApplicationLoadbalancer(QueryApplicationLoadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationLoadbalancerEx(request, headers, runtime);
        }

        /**
         * Description: 根据指定的查询条件查询负载均衡资源列表
         * Summary: loadbalancer查询
         */
        public async Task<QueryApplicationLoadbalancerResponse> QueryApplicationLoadbalancerAsync(QueryApplicationLoadbalancerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationLoadbalancerExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据指定的查询条件查询负载均衡资源列表
         * Summary: loadbalancer查询
         */
        public QueryApplicationLoadbalancerResponse QueryApplicationLoadbalancerEx(QueryApplicationLoadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationLoadbalancerResponse>(DoRequest("1.0", "antcloud.deps.application.loadbalancer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的查询条件查询负载均衡资源列表
         * Summary: loadbalancer查询
         */
        public async Task<QueryApplicationLoadbalancerResponse> QueryApplicationLoadbalancerExAsync(QueryApplicationLoadbalancerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationLoadbalancerResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.loadbalancer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的查询条件查询数据库资源列表
         * Summary: database查询
         */
        public QueryApplicationDatabaseResponse QueryApplicationDatabase(QueryApplicationDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApplicationDatabaseEx(request, headers, runtime);
        }

        /**
         * Description: 根据指定的查询条件查询数据库资源列表
         * Summary: database查询
         */
        public async Task<QueryApplicationDatabaseResponse> QueryApplicationDatabaseAsync(QueryApplicationDatabaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApplicationDatabaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据指定的查询条件查询数据库资源列表
         * Summary: database查询
         */
        public QueryApplicationDatabaseResponse QueryApplicationDatabaseEx(QueryApplicationDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationDatabaseResponse>(DoRequest("1.0", "antcloud.deps.application.database.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据指定的查询条件查询数据库资源列表
         * Summary: database查询
         */
        public async Task<QueryApplicationDatabaseResponse> QueryApplicationDatabaseExAsync(QueryApplicationDatabaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApplicationDatabaseResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.database.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
         * Summary: 获取上传应用发布包临时签名地址
         */
        public UploadApplicationPackageResponse UploadApplicationPackage(UploadApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadApplicationPackageEx(request, headers, runtime);
        }

        /**
         * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
         * Summary: 获取上传应用发布包临时签名地址
         */
        public async Task<UploadApplicationPackageResponse> UploadApplicationPackageAsync(UploadApplicationPackageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadApplicationPackageExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
         * Summary: 获取上传应用发布包临时签名地址
         */
        public UploadApplicationPackageResponse UploadApplicationPackageEx(UploadApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationPackageResponse>(DoRequest("1.0", "antcloud.deps.application.package.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取上传应用发布包临时签名地址，用于直接向阿里云OSS上传，目前只支持阿里云底座，不支持58底座。注意：该api只能生成上传应用发布包临时签名地址，不会实际上传文件。
         * Summary: 获取上传应用发布包临时签名地址
         */
        public async Task<UploadApplicationPackageResponse> UploadApplicationPackageExAsync(UploadApplicationPackageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadApplicationPackageResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.package.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
        调用步骤如下：
        调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
        通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
        调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
         * Summary: 同步创建对应的发布包版本信息
         */
        public SyncreateApplicationVersionResponse SyncreateApplicationVersion(SyncreateApplicationVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncreateApplicationVersionEx(request, headers, runtime);
        }

        /**
         * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
        调用步骤如下：
        调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
        通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
        调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
         * Summary: 同步创建对应的发布包版本信息
         */
        public async Task<SyncreateApplicationVersionResponse> SyncreateApplicationVersionAsync(SyncreateApplicationVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncreateApplicationVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
        调用步骤如下：
        调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
        通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
        调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
         * Summary: 同步创建对应的发布包版本信息
         */
        public SyncreateApplicationVersionResponse SyncreateApplicationVersionEx(SyncreateApplicationVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncreateApplicationVersionResponse>(DoRequest("1.0", "antcloud.deps.application.version.syncreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传发布包成功后，同步创建对应的发布包版本信息，该接口为同步接口。
        调用步骤如下：
        调用antcloud.deps.application.package.upload获得上传应用发布包临时签名地址
        通过阿里云OSS客户端通过应用发布包临时签名地址完成上传，并获得校验码
        调用antcloud.deps.application.version.syncreate同步接口创建应用新版本
         * Summary: 同步创建对应的发布包版本信息
         */
        public async Task<SyncreateApplicationVersionResponse> SyncreateApplicationVersionExAsync(SyncreateApplicationVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncreateApplicationVersionResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.version.syncreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取connection
         * Summary: 获取connection
         */
        public ListCloudconnectorConnectionResponse ListCloudconnectorConnection(ListCloudconnectorConnectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCloudconnectorConnectionEx(request, headers, runtime);
        }

        /**
         * Description: 获取connection
         * Summary: 获取connection
         */
        public async Task<ListCloudconnectorConnectionResponse> ListCloudconnectorConnectionAsync(ListCloudconnectorConnectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCloudconnectorConnectionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取connection
         * Summary: 获取connection
         */
        public ListCloudconnectorConnectionResponse ListCloudconnectorConnectionEx(ListCloudconnectorConnectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCloudconnectorConnectionResponse>(DoRequest("1.0", "antcloud.deps.cloudconnector.connection.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取connection
         * Summary: 获取connection
         */
        public async Task<ListCloudconnectorConnectionResponse> ListCloudconnectorConnectionExAsync(ListCloudconnectorConnectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCloudconnectorConnectionResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconnector.connection.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询技术栈关系
         * Summary: 查询技术栈关系
         */
        public QueryAppservicebuildpackrelationResponse QueryAppservicebuildpackrelation(QueryAppservicebuildpackrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppservicebuildpackrelationEx(request, headers, runtime);
        }

        /**
         * Description: 查询技术栈关系
         * Summary: 查询技术栈关系
         */
        public async Task<QueryAppservicebuildpackrelationResponse> QueryAppservicebuildpackrelationAsync(QueryAppservicebuildpackrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppservicebuildpackrelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询技术栈关系
         * Summary: 查询技术栈关系
         */
        public QueryAppservicebuildpackrelationResponse QueryAppservicebuildpackrelationEx(QueryAppservicebuildpackrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppservicebuildpackrelationResponse>(DoRequest("1.0", "antcloud.deps.appservicebuildpackrelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询技术栈关系
         * Summary: 查询技术栈关系
         */
        public async Task<QueryAppservicebuildpackrelationResponse> QueryAppservicebuildpackrelationExAsync(QueryAppservicebuildpackrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppservicebuildpackrelationResponse>(await DoRequestAsync("1.0", "antcloud.deps.appservicebuildpackrelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用关系
         * Summary: 更新应用关系
         */
        public UpdateAppservicebuildpackrelationResponse UpdateAppservicebuildpackrelation(UpdateAppservicebuildpackrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppservicebuildpackrelationEx(request, headers, runtime);
        }

        /**
         * Description: 更新应用关系
         * Summary: 更新应用关系
         */
        public async Task<UpdateAppservicebuildpackrelationResponse> UpdateAppservicebuildpackrelationAsync(UpdateAppservicebuildpackrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppservicebuildpackrelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新应用关系
         * Summary: 更新应用关系
         */
        public UpdateAppservicebuildpackrelationResponse UpdateAppservicebuildpackrelationEx(UpdateAppservicebuildpackrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppservicebuildpackrelationResponse>(DoRequest("1.0", "antcloud.deps.appservicebuildpackrelation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用关系
         * Summary: 更新应用关系
         */
        public async Task<UpdateAppservicebuildpackrelationResponse> UpdateAppservicebuildpackrelationExAsync(UpdateAppservicebuildpackrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppservicebuildpackrelationResponse>(await DoRequestAsync("1.0", "antcloud.deps.appservicebuildpackrelation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境变量
         * Summary: 查询环境变量
         */
        public QueryAppserviceenvparamResponse QueryAppserviceenvparam(QueryAppserviceenvparamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppserviceenvparamEx(request, headers, runtime);
        }

        /**
         * Description: 查询环境变量
         * Summary: 查询环境变量
         */
        public async Task<QueryAppserviceenvparamResponse> QueryAppserviceenvparamAsync(QueryAppserviceenvparamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppserviceenvparamExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询环境变量
         * Summary: 查询环境变量
         */
        public QueryAppserviceenvparamResponse QueryAppserviceenvparamEx(QueryAppserviceenvparamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppserviceenvparamResponse>(DoRequest("1.0", "antcloud.deps.appserviceenvparam.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境变量
         * Summary: 查询环境变量
         */
        public async Task<QueryAppserviceenvparamResponse> QueryAppserviceenvparamExAsync(QueryAppserviceenvparamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppserviceenvparamResponse>(await DoRequestAsync("1.0", "antcloud.deps.appserviceenvparam.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境变量
         * Summary: 查询环境变量
         */
        public QueryAppserviceenvparamGroupbyappservicesResponse QueryAppserviceenvparamGroupbyappservices(QueryAppserviceenvparamGroupbyappservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppserviceenvparamGroupbyappservicesEx(request, headers, runtime);
        }

        /**
         * Description: 查询环境变量
         * Summary: 查询环境变量
         */
        public async Task<QueryAppserviceenvparamGroupbyappservicesResponse> QueryAppserviceenvparamGroupbyappservicesAsync(QueryAppserviceenvparamGroupbyappservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppserviceenvparamGroupbyappservicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询环境变量
         * Summary: 查询环境变量
         */
        public QueryAppserviceenvparamGroupbyappservicesResponse QueryAppserviceenvparamGroupbyappservicesEx(QueryAppserviceenvparamGroupbyappservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppserviceenvparamGroupbyappservicesResponse>(DoRequest("1.0", "antcloud.deps.appserviceenvparam.groupbyappservices.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境变量
         * Summary: 查询环境变量
         */
        public async Task<QueryAppserviceenvparamGroupbyappservicesResponse> QueryAppserviceenvparamGroupbyappservicesExAsync(QueryAppserviceenvparamGroupbyappservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppserviceenvparamGroupbyappservicesResponse>(await DoRequestAsync("1.0", "antcloud.deps.appserviceenvparam.groupbyappservices.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 和修改点比较查询
         * Summary: 和修改点比较查询
         */
        public QueryAppserviceenvparamQuerywithdiffResponse QueryAppserviceenvparamQuerywithdiff(QueryAppserviceenvparamQuerywithdiffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppserviceenvparamQuerywithdiffEx(request, headers, runtime);
        }

        /**
         * Description: 和修改点比较查询
         * Summary: 和修改点比较查询
         */
        public async Task<QueryAppserviceenvparamQuerywithdiffResponse> QueryAppserviceenvparamQuerywithdiffAsync(QueryAppserviceenvparamQuerywithdiffRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppserviceenvparamQuerywithdiffExAsync(request, headers, runtime);
        }

        /**
         * Description: 和修改点比较查询
         * Summary: 和修改点比较查询
         */
        public QueryAppserviceenvparamQuerywithdiffResponse QueryAppserviceenvparamQuerywithdiffEx(QueryAppserviceenvparamQuerywithdiffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppserviceenvparamQuerywithdiffResponse>(DoRequest("1.0", "antcloud.deps.appserviceenvparam.querywithdiff.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 和修改点比较查询
         * Summary: 和修改点比较查询
         */
        public async Task<QueryAppserviceenvparamQuerywithdiffResponse> QueryAppserviceenvparamQuerywithdiffExAsync(QueryAppserviceenvparamQuerywithdiffRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppserviceenvparamQuerywithdiffResponse>(await DoRequestAsync("1.0", "antcloud.deps.appserviceenvparam.querywithdiff.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新参数
         * Summary: 更新参数
         */
        public UpdateAppserviceenvparamUpdateparamsResponse UpdateAppserviceenvparamUpdateparams(UpdateAppserviceenvparamUpdateparamsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppserviceenvparamUpdateparamsEx(request, headers, runtime);
        }

        /**
         * Description: 更新参数
         * Summary: 更新参数
         */
        public async Task<UpdateAppserviceenvparamUpdateparamsResponse> UpdateAppserviceenvparamUpdateparamsAsync(UpdateAppserviceenvparamUpdateparamsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppserviceenvparamUpdateparamsExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新参数
         * Summary: 更新参数
         */
        public UpdateAppserviceenvparamUpdateparamsResponse UpdateAppserviceenvparamUpdateparamsEx(UpdateAppserviceenvparamUpdateparamsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppserviceenvparamUpdateparamsResponse>(DoRequest("1.0", "antcloud.deps.appserviceenvparam.updateparams.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新参数
         * Summary: 更新参数
         */
        public async Task<UpdateAppserviceenvparamUpdateparamsResponse> UpdateAppserviceenvparamUpdateparamsExAsync(UpdateAppserviceenvparamUpdateparamsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppserviceenvparamUpdateparamsResponse>(await DoRequestAsync("1.0", "antcloud.deps.appserviceenvparam.updateparams.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用查询技术栈关系
         * Summary: 查询技术栈关系
         */
        public QueryApptechstackrelationResponse QueryApptechstackrelation(QueryApptechstackrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApptechstackrelationEx(request, headers, runtime);
        }

        /**
         * Description: 根据应用查询技术栈关系
         * Summary: 查询技术栈关系
         */
        public async Task<QueryApptechstackrelationResponse> QueryApptechstackrelationAsync(QueryApptechstackrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApptechstackrelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据应用查询技术栈关系
         * Summary: 查询技术栈关系
         */
        public QueryApptechstackrelationResponse QueryApptechstackrelationEx(QueryApptechstackrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApptechstackrelationResponse>(DoRequest("1.0", "antcloud.deps.apptechstackrelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用查询技术栈关系
         * Summary: 查询技术栈关系
         */
        public async Task<QueryApptechstackrelationResponse> QueryApptechstackrelationExAsync(QueryApptechstackrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApptechstackrelationResponse>(await DoRequestAsync("1.0", "antcloud.deps.apptechstackrelation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用技术栈关系
         * Summary: 更新技术栈关系
         */
        public UpdateApptechstackrelationResponse UpdateApptechstackrelation(UpdateApptechstackrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApptechstackrelationEx(request, headers, runtime);
        }

        /**
         * Description: 更新应用技术栈关系
         * Summary: 更新技术栈关系
         */
        public async Task<UpdateApptechstackrelationResponse> UpdateApptechstackrelationAsync(UpdateApptechstackrelationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApptechstackrelationExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新应用技术栈关系
         * Summary: 更新技术栈关系
         */
        public UpdateApptechstackrelationResponse UpdateApptechstackrelationEx(UpdateApptechstackrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApptechstackrelationResponse>(DoRequest("1.0", "antcloud.deps.apptechstackrelation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用技术栈关系
         * Summary: 更新技术栈关系
         */
        public async Task<UpdateApptechstackrelationResponse> UpdateApptechstackrelationExAsync(UpdateApptechstackrelationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApptechstackrelationResponse>(await DoRequestAsync("1.0", "antcloud.deps.apptechstackrelation.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-创建应用
         * Summary: 应用管理-创建应用
         */
        public CreateAppResponse CreateApp(CreateAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-创建应用
         * Summary: 应用管理-创建应用
         */
        public async Task<CreateAppResponse> CreateAppAsync(CreateAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-创建应用
         * Summary: 应用管理-创建应用
         */
        public CreateAppResponse CreateAppEx(CreateAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppResponse>(DoRequest("1.0", "antcloud.deps.app.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-创建应用
         * Summary: 应用管理-创建应用
         */
        public async Task<CreateAppResponse> CreateAppExAsync(CreateAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-应用分组创建
         * Summary: 应用管理-应用分组创建
         */
        public CreateAppGroupResponse CreateAppGroup(CreateAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppGroupEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-应用分组创建
         * Summary: 应用管理-应用分组创建
         */
        public async Task<CreateAppGroupResponse> CreateAppGroupAsync(CreateAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-应用分组创建
         * Summary: 应用管理-应用分组创建
         */
        public CreateAppGroupResponse CreateAppGroupEx(CreateAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppGroupResponse>(DoRequest("1.0", "antcloud.deps.app.group.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-应用分组创建
         * Summary: 应用管理-应用分组创建
         */
        public async Task<CreateAppGroupResponse> CreateAppGroupExAsync(CreateAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppGroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.group.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-获取应用基本信息
         * Summary: 应用管理-获取应用基本信息
         */
        public GetAppResponse GetApp(GetAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-获取应用基本信息
         * Summary: 应用管理-获取应用基本信息
         */
        public async Task<GetAppResponse> GetAppAsync(GetAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-获取应用基本信息
         * Summary: 应用管理-获取应用基本信息
         */
        public GetAppResponse GetAppEx(GetAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppResponse>(DoRequest("1.0", "antcloud.deps.app.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-获取应用基本信息
         * Summary: 应用管理-获取应用基本信息
         */
        public async Task<GetAppResponse> GetAppExAsync(GetAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-查看应用所有应用服务数量
         * Summary: 应用管理-查看应用所有应用服务数量
         */
        public CountAppServiceResponse CountAppService(CountAppServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountAppServiceEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-查看应用所有应用服务数量
         * Summary: 应用管理-查看应用所有应用服务数量
         */
        public async Task<CountAppServiceResponse> CountAppServiceAsync(CountAppServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountAppServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-查看应用所有应用服务数量
         * Summary: 应用管理-查看应用所有应用服务数量
         */
        public CountAppServiceResponse CountAppServiceEx(CountAppServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountAppServiceResponse>(DoRequest("1.0", "antcloud.deps.app.service.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-查看应用所有应用服务数量
         * Summary: 应用管理-查看应用所有应用服务数量
         */
        public async Task<CountAppServiceResponse> CountAppServiceExAsync(CountAppServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountAppServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.service.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
         * Summary: (废弃)获取应用所有环境的部署图(经典)
         */
        public AllAppDeployviewResponse AllAppDeployview(AllAppDeployviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllAppDeployviewEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
         * Summary: (废弃)获取应用所有环境的部署图(经典)
         */
        public async Task<AllAppDeployviewResponse> AllAppDeployviewAsync(AllAppDeployviewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllAppDeployviewExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
         * Summary: (废弃)获取应用所有环境的部署图(经典)
         */
        public AllAppDeployviewResponse AllAppDeployviewEx(AllAppDeployviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAppDeployviewResponse>(DoRequest("1.0", "antcloud.deps.app.deployview.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-获取当前应用所有环境中的部署图(经典应用服务)
         * Summary: (废弃)获取应用所有环境的部署图(经典)
         */
        public async Task<AllAppDeployviewResponse> AllAppDeployviewExAsync(AllAppDeployviewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllAppDeployviewResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.deployview.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-批量查询应用
         * Summary: 应用管理-批量查询应用
         */
        public QueryAppResponse QueryApp(QueryAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-批量查询应用
         * Summary: 应用管理-批量查询应用
         */
        public async Task<QueryAppResponse> QueryAppAsync(QueryAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-批量查询应用
         * Summary: 应用管理-批量查询应用
         */
        public QueryAppResponse QueryAppEx(QueryAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppResponse>(DoRequest("1.0", "antcloud.deps.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-批量查询应用
         * Summary: 应用管理-批量查询应用
         */
        public async Task<QueryAppResponse> QueryAppExAsync(QueryAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-获取应用分组
         * Summary: 应用管理-获取单个应用分组
         */
        public GetAppGroupResponse GetAppGroup(GetAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppGroupEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-获取应用分组
         * Summary: 应用管理-获取单个应用分组
         */
        public async Task<GetAppGroupResponse> GetAppGroupAsync(GetAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-获取应用分组
         * Summary: 应用管理-获取单个应用分组
         */
        public GetAppGroupResponse GetAppGroupEx(GetAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppGroupResponse>(DoRequest("1.0", "antcloud.deps.app.group.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-获取应用分组
         * Summary: 应用管理-获取单个应用分组
         */
        public async Task<GetAppGroupResponse> GetAppGroupExAsync(GetAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppGroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.group.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-批量查询应用分组
         * Summary: 应用管理-批量查询应用分组
         */
        public QueryAppGroupResponse QueryAppGroup(QueryAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppGroupEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-批量查询应用分组
         * Summary: 应用管理-批量查询应用分组
         */
        public async Task<QueryAppGroupResponse> QueryAppGroupAsync(QueryAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-批量查询应用分组
         * Summary: 应用管理-批量查询应用分组
         */
        public QueryAppGroupResponse QueryAppGroupEx(QueryAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppGroupResponse>(DoRequest("1.0", "antcloud.deps.app.group.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-批量查询应用分组
         * Summary: 应用管理-批量查询应用分组
         */
        public async Task<QueryAppGroupResponse> QueryAppGroupExAsync(QueryAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppGroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.group.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-查询当前应用的所有应用服务
         * Summary: 应用管理-查询当前应用的所有应用服务
         */
        public QueryAppServiceResponse QueryAppService(QueryAppServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppServiceEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-查询当前应用的所有应用服务
         * Summary: 应用管理-查询当前应用的所有应用服务
         */
        public async Task<QueryAppServiceResponse> QueryAppServiceAsync(QueryAppServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-查询当前应用的所有应用服务
         * Summary: 应用管理-查询当前应用的所有应用服务
         */
        public QueryAppServiceResponse QueryAppServiceEx(QueryAppServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppServiceResponse>(DoRequest("1.0", "antcloud.deps.app.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-查询当前应用的所有应用服务
         * Summary: 应用管理-查询当前应用的所有应用服务
         */
        public async Task<QueryAppServiceResponse> QueryAppServiceExAsync(QueryAppServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-用户收藏应用
         * Summary: 应用管理-用户收藏应用
         */
        public CreateAppFavouriteResponse CreateAppFavourite(CreateAppFavouriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppFavouriteEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-用户收藏应用
         * Summary: 应用管理-用户收藏应用
         */
        public async Task<CreateAppFavouriteResponse> CreateAppFavouriteAsync(CreateAppFavouriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppFavouriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-用户收藏应用
         * Summary: 应用管理-用户收藏应用
         */
        public CreateAppFavouriteResponse CreateAppFavouriteEx(CreateAppFavouriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppFavouriteResponse>(DoRequest("1.0", "antcloud.deps.app.favourite.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-用户收藏应用
         * Summary: 应用管理-用户收藏应用
         */
        public async Task<CreateAppFavouriteResponse> CreateAppFavouriteExAsync(CreateAppFavouriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppFavouriteResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.favourite.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-用户取消收藏某应用
         * Summary: 应用管理-用户取消收藏某应用
         */
        public DeleteAppFavouriteResponse DeleteAppFavourite(DeleteAppFavouriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppFavouriteEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-用户取消收藏某应用
         * Summary: 应用管理-用户取消收藏某应用
         */
        public async Task<DeleteAppFavouriteResponse> DeleteAppFavouriteAsync(DeleteAppFavouriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppFavouriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-用户取消收藏某应用
         * Summary: 应用管理-用户取消收藏某应用
         */
        public DeleteAppFavouriteResponse DeleteAppFavouriteEx(DeleteAppFavouriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppFavouriteResponse>(DoRequest("1.0", "antcloud.deps.app.favourite.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-用户取消收藏某应用
         * Summary: 应用管理-用户取消收藏某应用
         */
        public async Task<DeleteAppFavouriteResponse> DeleteAppFavouriteExAsync(DeleteAppFavouriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppFavouriteResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.favourite.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-更新应用信息
         * Summary: 应用管理-更新应用信息
         */
        public UpdateAppResponse UpdateApp(UpdateAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-更新应用信息
         * Summary: 应用管理-更新应用信息
         */
        public async Task<UpdateAppResponse> UpdateAppAsync(UpdateAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-更新应用信息
         * Summary: 应用管理-更新应用信息
         */
        public UpdateAppResponse UpdateAppEx(UpdateAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppResponse>(DoRequest("1.0", "antcloud.deps.app.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-更新应用信息
         * Summary: 应用管理-更新应用信息
         */
        public async Task<UpdateAppResponse> UpdateAppExAsync(UpdateAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-更新应用分组信息
         * Summary: 应用管理-更新应用分组信息
         */
        public UpdateAppGroupResponse UpdateAppGroup(UpdateAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppGroupEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-更新应用分组信息
         * Summary: 应用管理-更新应用分组信息
         */
        public async Task<UpdateAppGroupResponse> UpdateAppGroupAsync(UpdateAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-更新应用分组信息
         * Summary: 应用管理-更新应用分组信息
         */
        public UpdateAppGroupResponse UpdateAppGroupEx(UpdateAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppGroupResponse>(DoRequest("1.0", "antcloud.deps.app.group.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-更新应用分组信息
         * Summary: 应用管理-更新应用分组信息
         */
        public async Task<UpdateAppGroupResponse> UpdateAppGroupExAsync(UpdateAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppGroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.group.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-列出当前用户收藏的应用
         * Summary: 应用管理-列出当前用户收藏的应用
         */
        public ListAppFavouriteResponse ListAppFavourite(ListAppFavouriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppFavouriteEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-列出当前用户收藏的应用
         * Summary: 应用管理-列出当前用户收藏的应用
         */
        public async Task<ListAppFavouriteResponse> ListAppFavouriteAsync(ListAppFavouriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppFavouriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-列出当前用户收藏的应用
         * Summary: 应用管理-列出当前用户收藏的应用
         */
        public ListAppFavouriteResponse ListAppFavouriteEx(ListAppFavouriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppFavouriteResponse>(DoRequest("1.0", "antcloud.deps.app.favourite.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-列出当前用户收藏的应用
         * Summary: 应用管理-列出当前用户收藏的应用
         */
        public async Task<ListAppFavouriteResponse> ListAppFavouriteExAsync(ListAppFavouriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppFavouriteResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.favourite.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-删除应用
         * Summary: 应用管理-删除应用
         */
        public DeleteAppResponse DeleteApp(DeleteAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-删除应用
         * Summary: 应用管理-删除应用
         */
        public async Task<DeleteAppResponse> DeleteAppAsync(DeleteAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-删除应用
         * Summary: 应用管理-删除应用
         */
        public DeleteAppResponse DeleteAppEx(DeleteAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppResponse>(DoRequest("1.0", "antcloud.deps.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-删除应用
         * Summary: 应用管理-删除应用
         */
        public async Task<DeleteAppResponse> DeleteAppExAsync(DeleteAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-删除应用分组
         * Summary: 应用管理-删除应用分组
         */
        public DeleteAppGroupResponse DeleteAppGroup(DeleteAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppGroupEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-删除应用分组
         * Summary: 应用管理-删除应用分组
         */
        public async Task<DeleteAppGroupResponse> DeleteAppGroupAsync(DeleteAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-删除应用分组
         * Summary: 应用管理-删除应用分组
         */
        public DeleteAppGroupResponse DeleteAppGroupEx(DeleteAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppGroupResponse>(DoRequest("1.0", "antcloud.deps.app.group.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-删除应用分组
         * Summary: 应用管理-删除应用分组
         */
        public async Task<DeleteAppGroupResponse> DeleteAppGroupExAsync(DeleteAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppGroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.group.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-应用维度查询经典应用服务发布单
         * Summary: 应用管理-应用维度查询经典应用服务发布单
         */
        public QueryAppPlanResponse QueryAppPlan(QueryAppPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppPlanEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-应用维度查询经典应用服务发布单
         * Summary: 应用管理-应用维度查询经典应用服务发布单
         */
        public async Task<QueryAppPlanResponse> QueryAppPlanAsync(QueryAppPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-应用维度查询经典应用服务发布单
         * Summary: 应用管理-应用维度查询经典应用服务发布单
         */
        public QueryAppPlanResponse QueryAppPlanEx(QueryAppPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppPlanResponse>(DoRequest("1.0", "antcloud.deps.app.plan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-应用维度查询经典应用服务发布单
         * Summary: 应用管理-应用维度查询经典应用服务发布单
         */
        public async Task<QueryAppPlanResponse> QueryAppPlanExAsync(QueryAppPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.plan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
         * Summary: 应用管理-判断应用分组是否存在
         */
        public ExistAppGroupResponse ExistAppGroup(ExistAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistAppGroupEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
         * Summary: 应用管理-判断应用分组是否存在
         */
        public async Task<ExistAppGroupResponse> ExistAppGroupAsync(ExistAppGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistAppGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
         * Summary: 应用管理-判断应用分组是否存在
         */
        public ExistAppGroupResponse ExistAppGroupEx(ExistAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistAppGroupResponse>(DoRequest("1.0", "antcloud.deps.app.group.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-判断应用分组是否存在。该接口判断应用分组是否存在的范围是租户级别唯一，也就是说不同级别的应用分组名称也不能同名
         * Summary: 应用管理-判断应用分组是否存在
         */
        public async Task<ExistAppGroupResponse> ExistAppGroupExAsync(ExistAppGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistAppGroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.group.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
         * Summary: 应用管理-当前登录用户信息查询（已废弃）
         */
        public QueryUserResponse QueryUser(QueryUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUserEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
         * Summary: 应用管理-当前登录用户信息查询（已废弃）
         */
        public async Task<QueryUserResponse> QueryUserAsync(QueryUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
         * Summary: 应用管理-当前登录用户信息查询（已废弃）
         */
        public QueryUserResponse QueryUserEx(QueryUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserResponse>(DoRequest("1.0", "antcloud.deps.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-当前登录用户信息查询（已废弃，用户信息应该由onex接口返回）
         * Summary: 应用管理-当前登录用户信息查询（已废弃）
         */
        public async Task<QueryUserResponse> QueryUserExAsync(QueryUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUserResponse>(await DoRequestAsync("1.0", "antcloud.deps.user.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-判断应用是否存在
         * Summary: 应用管理-判断应用是否存在
         */
        public ExistAppResponse ExistApp(ExistAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistAppEx(request, headers, runtime);
        }

        /**
         * Description: 应用管理-判断应用是否存在
         * Summary: 应用管理-判断应用是否存在
         */
        public async Task<ExistAppResponse> ExistAppAsync(ExistAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用管理-判断应用是否存在
         * Summary: 应用管理-判断应用是否存在
         */
        public ExistAppResponse ExistAppEx(ExistAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistAppResponse>(DoRequest("1.0", "antcloud.deps.app.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用管理-判断应用是否存在
         * Summary: 应用管理-判断应用是否存在
         */
        public async Task<ExistAppResponse> ExistAppExAsync(ExistAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用服务实例查询对应的技术栈信息
         * Summary: 查询技术栈信息
         */
        public GetApplicationBuildpackResponse GetApplicationBuildpack(GetApplicationBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 根据应用服务实例查询对应的技术栈信息
         * Summary: 查询技术栈信息
         */
        public async Task<GetApplicationBuildpackResponse> GetApplicationBuildpackAsync(GetApplicationBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据应用服务实例查询对应的技术栈信息
         * Summary: 查询技术栈信息
         */
        public GetApplicationBuildpackResponse GetApplicationBuildpackEx(GetApplicationBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationBuildpackResponse>(DoRequest("1.0", "antcloud.deps.application.buildpack.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用服务实例查询对应的技术栈信息
         * Summary: 查询技术栈信息
         */
        public async Task<GetApplicationBuildpackResponse> GetApplicationBuildpackExAsync(GetApplicationBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.buildpack.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定应用的技术栈框架信息
         * Summary: 查询指定应用的技术栈框架信息
         */
        public GetApplicationTechstackResponse GetApplicationTechstack(GetApplicationTechstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetApplicationTechstackEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定应用的技术栈框架信息
         * Summary: 查询指定应用的技术栈框架信息
         */
        public async Task<GetApplicationTechstackResponse> GetApplicationTechstackAsync(GetApplicationTechstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetApplicationTechstackExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定应用的技术栈框架信息
         * Summary: 查询指定应用的技术栈框架信息
         */
        public GetApplicationTechstackResponse GetApplicationTechstackEx(GetApplicationTechstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationTechstackResponse>(DoRequest("1.0", "antcloud.deps.application.techstack.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定应用的技术栈框架信息
         * Summary: 查询指定应用的技术栈框架信息
         */
        public async Task<GetApplicationTechstackResponse> GetApplicationTechstackExAsync(GetApplicationTechstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetApplicationTechstackResponse>(await DoRequestAsync("1.0", "antcloud.deps.application.techstack.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取技术栈信息
         * Summary: 获取技术栈信息
         */
        public GetBuildpackResponse GetBuildpack(GetBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 获取技术栈信息
         * Summary: 获取技术栈信息
         */
        public async Task<GetBuildpackResponse> GetBuildpackAsync(GetBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取技术栈信息
         * Summary: 获取技术栈信息
         */
        public GetBuildpackResponse GetBuildpackEx(GetBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取技术栈信息
         * Summary: 获取技术栈信息
         */
        public async Task<GetBuildpackResponse> GetBuildpackExAsync(GetBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出系统支持的所有技术栈框架
         * Summary: 列出系统支持的所有技术栈框架
         */
        public ListTechstackResponse ListTechstack(ListTechstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListTechstackEx(request, headers, runtime);
        }

        /**
         * Description: 列出系统支持的所有技术栈框架
         * Summary: 列出系统支持的所有技术栈框架
         */
        public async Task<ListTechstackResponse> ListTechstackAsync(ListTechstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListTechstackExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出系统支持的所有技术栈框架
         * Summary: 列出系统支持的所有技术栈框架
         */
        public ListTechstackResponse ListTechstackEx(ListTechstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTechstackResponse>(DoRequest("1.0", "antcloud.deps.techstack.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出系统支持的所有技术栈框架
         * Summary: 列出系统支持的所有技术栈框架
         */
        public async Task<ListTechstackResponse> ListTechstackExAsync(ListTechstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListTechstackResponse>(await DoRequestAsync("1.0", "antcloud.deps.techstack.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 搜索技术栈
         * Summary: 搜索技术栈
         */
        public QueryBuildpackResponse QueryBuildpack(QueryBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 搜索技术栈
         * Summary: 搜索技术栈
         */
        public async Task<QueryBuildpackResponse> QueryBuildpackAsync(QueryBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 搜索技术栈
         * Summary: 搜索技术栈
         */
        public QueryBuildpackResponse QueryBuildpackEx(QueryBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 搜索技术栈
         * Summary: 搜索技术栈
         */
        public async Task<QueryBuildpackResponse> QueryBuildpackExAsync(QueryBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个技术栈
         * Summary: 创建一个技术栈
         */
        public CreateBuildpackResponse CreateBuildpack(CreateBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个技术栈
         * Summary: 创建一个技术栈
         */
        public async Task<CreateBuildpackResponse> CreateBuildpackAsync(CreateBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个技术栈
         * Summary: 创建一个技术栈
         */
        public CreateBuildpackResponse CreateBuildpackEx(CreateBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个技术栈
         * Summary: 创建一个技术栈
         */
        public async Task<CreateBuildpackResponse> CreateBuildpackExAsync(CreateBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新技术栈包状态
         * Summary: 更新技术栈包状态
         */
        public UploadfinishBuildpackResponse UploadfinishBuildpack(UploadfinishBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadfinishBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 更新技术栈包状态
         * Summary: 更新技术栈包状态
         */
        public async Task<UploadfinishBuildpackResponse> UploadfinishBuildpackAsync(UploadfinishBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadfinishBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新技术栈包状态
         * Summary: 更新技术栈包状态
         */
        public UploadfinishBuildpackResponse UploadfinishBuildpackEx(UploadfinishBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadfinishBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.uploadfinish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新技术栈包状态
         * Summary: 更新技术栈包状态
         */
        public async Task<UploadfinishBuildpackResponse> UploadfinishBuildpackExAsync(UploadfinishBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadfinishBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.uploadfinish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布一个技术栈
         * Summary: 发布一个技术栈
         */
        public PublishBuildpackResponse PublishBuildpack(PublishBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 发布一个技术栈
         * Summary: 发布一个技术栈
         */
        public async Task<PublishBuildpackResponse> PublishBuildpackAsync(PublishBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布一个技术栈
         * Summary: 发布一个技术栈
         */
        public PublishBuildpackResponse PublishBuildpackEx(PublishBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布一个技术栈
         * Summary: 发布一个技术栈
         */
        public async Task<PublishBuildpackResponse> PublishBuildpackExAsync(PublishBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新一个技术栈
         * Summary: 更新一个技术栈
         */
        public UpdateBuildpackResponse UpdateBuildpack(UpdateBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 更新一个技术栈
         * Summary: 更新一个技术栈
         */
        public async Task<UpdateBuildpackResponse> UpdateBuildpackAsync(UpdateBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新一个技术栈
         * Summary: 更新一个技术栈
         */
        public UpdateBuildpackResponse UpdateBuildpackEx(UpdateBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新一个技术栈
         * Summary: 更新一个技术栈
         */
        public async Task<UpdateBuildpackResponse> UpdateBuildpackExAsync(UpdateBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据名称查询
         * Summary: 根据名称查询
         */
        public QueryBuildpackFindbynamesResponse QueryBuildpackFindbynames(QueryBuildpackFindbynamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindbynamesEx(request, headers, runtime);
        }

        /**
         * Description: 根据名称查询
         * Summary: 根据名称查询
         */
        public async Task<QueryBuildpackFindbynamesResponse> QueryBuildpackFindbynamesAsync(QueryBuildpackFindbynamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindbynamesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据名称查询
         * Summary: 根据名称查询
         */
        public QueryBuildpackFindbynamesResponse QueryBuildpackFindbynamesEx(QueryBuildpackFindbynamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbynamesResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findbynames.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据名称查询
         * Summary: 根据名称查询
         */
        public async Task<QueryBuildpackFindbynamesResponse> QueryBuildpackFindbynamesExAsync(QueryBuildpackFindbynamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbynamesResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findbynames.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 计算
         * Summary: 计算
         */
        public CountBuildpackResponse CountBuildpack(CountBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 计算
         * Summary: 计算
         */
        public async Task<CountBuildpackResponse> CountBuildpackAsync(CountBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 计算
         * Summary: 计算
         */
        public CountBuildpackResponse CountBuildpackEx(CountBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 计算
         * Summary: 计算
         */
        public async Task<CountBuildpackResponse> CountBuildpackExAsync(CountBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public DeprecateBuildpackResponse DeprecateBuildpack(DeprecateBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeprecateBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public async Task<DeprecateBuildpackResponse> DeprecateBuildpackAsync(DeprecateBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeprecateBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public DeprecateBuildpackResponse DeprecateBuildpackEx(DeprecateBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeprecateBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.deprecate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 废弃
         * Summary: 废弃
         */
        public async Task<DeprecateBuildpackResponse> DeprecateBuildpackExAsync(DeprecateBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeprecateBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.deprecate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除
         * Summary: 批量删除
         */
        public BatchdeleteBuildpackResponse BatchdeleteBuildpack(BatchdeleteBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchdeleteBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 批量删除
         * Summary: 批量删除
         */
        public async Task<BatchdeleteBuildpackResponse> BatchdeleteBuildpackAsync(BatchdeleteBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchdeleteBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量删除
         * Summary: 批量删除
         */
        public BatchdeleteBuildpackResponse BatchdeleteBuildpackEx(BatchdeleteBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量删除
         * Summary: 批量删除
         */
        public async Task<BatchdeleteBuildpackResponse> BatchdeleteBuildpackExAsync(BatchdeleteBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchdeleteBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.batchdelete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否存在
         * Summary: 查询是否存在
         */
        public ExistBuildpackResponse ExistBuildpack(ExistBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否存在
         * Summary: 查询是否存在
         */
        public async Task<ExistBuildpackResponse> ExistBuildpackAsync(ExistBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否存在
         * Summary: 查询是否存在
         */
        public ExistBuildpackResponse ExistBuildpackEx(ExistBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否存在
         * Summary: 查询是否存在
         */
        public async Task<ExistBuildpackResponse> ExistBuildpackExAsync(ExistBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新打包状态
         * Summary: 更新打包状态
         */
        public UpdateBuildpackUpdatepackagesstatusResponse UpdateBuildpackUpdatepackagesstatus(UpdateBuildpackUpdatepackagesstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBuildpackUpdatepackagesstatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新打包状态
         * Summary: 更新打包状态
         */
        public async Task<UpdateBuildpackUpdatepackagesstatusResponse> UpdateBuildpackUpdatepackagesstatusAsync(UpdateBuildpackUpdatepackagesstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBuildpackUpdatepackagesstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新打包状态
         * Summary: 更新打包状态
         */
        public UpdateBuildpackUpdatepackagesstatusResponse UpdateBuildpackUpdatepackagesstatusEx(UpdateBuildpackUpdatepackagesstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpackUpdatepackagesstatusResponse>(DoRequest("1.0", "antcloud.deps.buildpack.updatepackagesstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新打包状态
         * Summary: 更新打包状态
         */
        public async Task<UpdateBuildpackUpdatepackagesstatusResponse> UpdateBuildpackUpdatepackagesstatusExAsync(UpdateBuildpackUpdatepackagesstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpackUpdatepackagesstatusResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.updatepackagesstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询版本
         * Summary: 查询版本
         */
        public QueryBuildpackFindidversionpairsbyversionResponse QueryBuildpackFindidversionpairsbyversion(QueryBuildpackFindidversionpairsbyversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindidversionpairsbyversionEx(request, headers, runtime);
        }

        /**
         * Description: 查询版本
         * Summary: 查询版本
         */
        public async Task<QueryBuildpackFindidversionpairsbyversionResponse> QueryBuildpackFindidversionpairsbyversionAsync(QueryBuildpackFindidversionpairsbyversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindidversionpairsbyversionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询版本
         * Summary: 查询版本
         */
        public QueryBuildpackFindidversionpairsbyversionResponse QueryBuildpackFindidversionpairsbyversionEx(QueryBuildpackFindidversionpairsbyversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindidversionpairsbyversionResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findidversionpairsbyversion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询版本
         * Summary: 查询版本
         */
        public async Task<QueryBuildpackFindidversionpairsbyversionResponse> QueryBuildpackFindidversionpairsbyversionExAsync(QueryBuildpackFindidversionpairsbyversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindidversionpairsbyversionResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findidversionpairsbyversion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据技术栈分组查询
         * Summary: 根据技术栈分组查询
         */
        public QueryBuildpackGroupbytechstackResponse QueryBuildpackGroupbytechstack(QueryBuildpackGroupbytechstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackGroupbytechstackEx(request, headers, runtime);
        }

        /**
         * Description: 根据技术栈分组查询
         * Summary: 根据技术栈分组查询
         */
        public async Task<QueryBuildpackGroupbytechstackResponse> QueryBuildpackGroupbytechstackAsync(QueryBuildpackGroupbytechstackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackGroupbytechstackExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据技术栈分组查询
         * Summary: 根据技术栈分组查询
         */
        public QueryBuildpackGroupbytechstackResponse QueryBuildpackGroupbytechstackEx(QueryBuildpackGroupbytechstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackGroupbytechstackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.groupbytechstack.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据技术栈分组查询
         * Summary: 根据技术栈分组查询
         */
        public async Task<QueryBuildpackGroupbytechstackResponse> QueryBuildpackGroupbytechstackExAsync(QueryBuildpackGroupbytechstackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackGroupbytechstackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.groupbytechstack.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可见技术栈
         * Summary: 查询可见技术栈
         */
        public QueryBuildpackFindvisibletechstacksResponse QueryBuildpackFindvisibletechstacks(QueryBuildpackFindvisibletechstacksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindvisibletechstacksEx(request, headers, runtime);
        }

        /**
         * Description: 查询可见技术栈
         * Summary: 查询可见技术栈
         */
        public async Task<QueryBuildpackFindvisibletechstacksResponse> QueryBuildpackFindvisibletechstacksAsync(QueryBuildpackFindvisibletechstacksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindvisibletechstacksExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可见技术栈
         * Summary: 查询可见技术栈
         */
        public QueryBuildpackFindvisibletechstacksResponse QueryBuildpackFindvisibletechstacksEx(QueryBuildpackFindvisibletechstacksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindvisibletechstacksResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findvisibletechstacks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可见技术栈
         * Summary: 查询可见技术栈
         */
        public async Task<QueryBuildpackFindvisibletechstacksResponse> QueryBuildpackFindvisibletechstacksExAsync(QueryBuildpackFindvisibletechstacksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindvisibletechstacksResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findvisibletechstacks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可写技术栈
         * Summary: 查询可写技术栈
         */
        public QueryBuildpackFindwritabletechstacksResponse QueryBuildpackFindwritabletechstacks(QueryBuildpackFindwritabletechstacksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindwritabletechstacksEx(request, headers, runtime);
        }

        /**
         * Description: 查询可写技术栈
         * Summary: 查询可写技术栈
         */
        public async Task<QueryBuildpackFindwritabletechstacksResponse> QueryBuildpackFindwritabletechstacksAsync(QueryBuildpackFindwritabletechstacksRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindwritabletechstacksExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可写技术栈
         * Summary: 查询可写技术栈
         */
        public QueryBuildpackFindwritabletechstacksResponse QueryBuildpackFindwritabletechstacksEx(QueryBuildpackFindwritabletechstacksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindwritabletechstacksResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findwritabletechstacks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可写技术栈
         * Summary: 查询可写技术栈
         */
        public async Task<QueryBuildpackFindwritabletechstacksResponse> QueryBuildpackFindwritabletechstacksExAsync(QueryBuildpackFindwritabletechstacksRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindwritabletechstacksResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findwritabletechstacks.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询os通过当前云
         * Summary: 查询os通过当前云
         */
        public QueryBuildpackFindosbycurrentcloudResponse QueryBuildpackFindosbycurrentcloud(QueryBuildpackFindosbycurrentcloudRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindosbycurrentcloudEx(request, headers, runtime);
        }

        /**
         * Description: 查询os通过当前云
         * Summary: 查询os通过当前云
         */
        public async Task<QueryBuildpackFindosbycurrentcloudResponse> QueryBuildpackFindosbycurrentcloudAsync(QueryBuildpackFindosbycurrentcloudRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindosbycurrentcloudExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询os通过当前云
         * Summary: 查询os通过当前云
         */
        public QueryBuildpackFindosbycurrentcloudResponse QueryBuildpackFindosbycurrentcloudEx(QueryBuildpackFindosbycurrentcloudRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindosbycurrentcloudResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findosbycurrentcloud.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询os通过当前云
         * Summary: 查询os通过当前云
         */
        public async Task<QueryBuildpackFindosbycurrentcloudResponse> QueryBuildpackFindosbycurrentcloudExAsync(QueryBuildpackFindosbycurrentcloudRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindosbycurrentcloudResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findosbycurrentcloud.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过appv1查询buildpack
         * Summary: 查询buildpack
         */
        public QueryBuildpackFindbyappsvResponse QueryBuildpackFindbyappsv(QueryBuildpackFindbyappsvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindbyappsvEx(request, headers, runtime);
        }

        /**
         * Description: 通过appv1查询buildpack
         * Summary: 查询buildpack
         */
        public async Task<QueryBuildpackFindbyappsvResponse> QueryBuildpackFindbyappsvAsync(QueryBuildpackFindbyappsvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindbyappsvExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过appv1查询buildpack
         * Summary: 查询buildpack
         */
        public QueryBuildpackFindbyappsvResponse QueryBuildpackFindbyappsvEx(QueryBuildpackFindbyappsvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappsvResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findbyappsv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过appv1查询buildpack
         * Summary: 查询buildpack
         */
        public async Task<QueryBuildpackFindbyappsvResponse> QueryBuildpackFindbyappsvExAsync(QueryBuildpackFindbyappsvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappsvResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findbyappsv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过app查询
         * Summary: 通过app查询
         */
        public QueryBuildpackFindbyappsResponse QueryBuildpackFindbyapps(QueryBuildpackFindbyappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindbyappsEx(request, headers, runtime);
        }

        /**
         * Description: 通过app查询
         * Summary: 通过app查询
         */
        public async Task<QueryBuildpackFindbyappsResponse> QueryBuildpackFindbyappsAsync(QueryBuildpackFindbyappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindbyappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过app查询
         * Summary: 通过app查询
         */
        public QueryBuildpackFindbyappsResponse QueryBuildpackFindbyappsEx(QueryBuildpackFindbyappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappsResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findbyapps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过app查询
         * Summary: 通过app查询
         */
        public async Task<QueryBuildpackFindbyappsResponse> QueryBuildpackFindbyappsExAsync(QueryBuildpackFindbyappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappsResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findbyapps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过app服务查询
         * Summary: 通过app服务查询
         */
        public QueryBuildpackFindbyappservicesResponse QueryBuildpackFindbyappservices(QueryBuildpackFindbyappservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindbyappservicesEx(request, headers, runtime);
        }

        /**
         * Description: 通过app服务查询
         * Summary: 通过app服务查询
         */
        public async Task<QueryBuildpackFindbyappservicesResponse> QueryBuildpackFindbyappservicesAsync(QueryBuildpackFindbyappservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindbyappservicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过app服务查询
         * Summary: 通过app服务查询
         */
        public QueryBuildpackFindbyappservicesResponse QueryBuildpackFindbyappservicesEx(QueryBuildpackFindbyappservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappservicesResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findbyappservices.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过app服务查询
         * Summary: 通过app服务查询
         */
        public async Task<QueryBuildpackFindbyappservicesResponse> QueryBuildpackFindbyappservicesExAsync(QueryBuildpackFindbyappservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappservicesResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findbyappservices.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过appv1查询
         * Summary: 通过appv1查询
         */
        public QueryBuildpackFindbyappvResponse QueryBuildpackFindbyappv(QueryBuildpackFindbyappvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindbyappvEx(request, headers, runtime);
        }

        /**
         * Description: 通过appv1查询
         * Summary: 通过appv1查询
         */
        public async Task<QueryBuildpackFindbyappvResponse> QueryBuildpackFindbyappvAsync(QueryBuildpackFindbyappvRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindbyappvExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过appv1查询
         * Summary: 通过appv1查询
         */
        public QueryBuildpackFindbyappvResponse QueryBuildpackFindbyappvEx(QueryBuildpackFindbyappvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappvResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findbyappv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过appv1查询
         * Summary: 通过appv1查询
         */
        public async Task<QueryBuildpackFindbyappvResponse> QueryBuildpackFindbyappvExAsync(QueryBuildpackFindbyappvRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappvResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findbyappv.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过app查询
         * Summary: 通过app查询
         */
        public QueryBuildpackFindbyappResponse QueryBuildpackFindbyapp(QueryBuildpackFindbyappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindbyappEx(request, headers, runtime);
        }

        /**
         * Description: 通过app查询
         * Summary: 通过app查询
         */
        public async Task<QueryBuildpackFindbyappResponse> QueryBuildpackFindbyappAsync(QueryBuildpackFindbyappRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindbyappExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过app查询
         * Summary: 通过app查询
         */
        public QueryBuildpackFindbyappResponse QueryBuildpackFindbyappEx(QueryBuildpackFindbyappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findbyapp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过app查询
         * Summary: 通过app查询
         */
        public async Task<QueryBuildpackFindbyappResponse> QueryBuildpackFindbyappExAsync(QueryBuildpackFindbyappRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindbyappResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findbyapp.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成url
         * Summary: 生成url
         */
        public CreateBuildpackGeneratesignurlResponse CreateBuildpackGeneratesignurl(CreateBuildpackGeneratesignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBuildpackGeneratesignurlEx(request, headers, runtime);
        }

        /**
         * Description: 生成url
         * Summary: 生成url
         */
        public async Task<CreateBuildpackGeneratesignurlResponse> CreateBuildpackGeneratesignurlAsync(CreateBuildpackGeneratesignurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBuildpackGeneratesignurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 生成url
         * Summary: 生成url
         */
        public CreateBuildpackGeneratesignurlResponse CreateBuildpackGeneratesignurlEx(CreateBuildpackGeneratesignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBuildpackGeneratesignurlResponse>(DoRequest("1.0", "antcloud.deps.buildpack.generatesignurl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成url
         * Summary: 生成url
         */
        public async Task<CreateBuildpackGeneratesignurlResponse> CreateBuildpackGeneratesignurlExAsync(CreateBuildpackGeneratesignurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBuildpackGeneratesignurlResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.generatesignurl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询pagessize
         * Summary: 查询pagessize
         */
        public QueryBuildpackSumpackagessizeResponse QueryBuildpackSumpackagessize(QueryBuildpackSumpackagessizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackSumpackagessizeEx(request, headers, runtime);
        }

        /**
         * Description: 查询pagessize
         * Summary: 查询pagessize
         */
        public async Task<QueryBuildpackSumpackagessizeResponse> QueryBuildpackSumpackagessizeAsync(QueryBuildpackSumpackagessizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackSumpackagessizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询pagessize
         * Summary: 查询pagessize
         */
        public QueryBuildpackSumpackagessizeResponse QueryBuildpackSumpackagessizeEx(QueryBuildpackSumpackagessizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackSumpackagessizeResponse>(DoRequest("1.0", "antcloud.deps.buildpack.sumpackagessize.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询pagessize
         * Summary: 查询pagessize
         */
        public async Task<QueryBuildpackSumpackagessizeResponse> QueryBuildpackSumpackagessizeExAsync(QueryBuildpackSumpackagessizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackSumpackagessizeResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.sumpackagessize.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否supportcode
         * Summary: 查询是否supportcode
         */
        public QueryBuildpackSupportcoderepoResponse QueryBuildpackSupportcoderepo(QueryBuildpackSupportcoderepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackSupportcoderepoEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否supportcode
         * Summary: 查询是否supportcode
         */
        public async Task<QueryBuildpackSupportcoderepoResponse> QueryBuildpackSupportcoderepoAsync(QueryBuildpackSupportcoderepoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackSupportcoderepoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否supportcode
         * Summary: 查询是否supportcode
         */
        public QueryBuildpackSupportcoderepoResponse QueryBuildpackSupportcoderepoEx(QueryBuildpackSupportcoderepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackSupportcoderepoResponse>(DoRequest("1.0", "antcloud.deps.buildpack.supportcoderepo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否supportcode
         * Summary: 查询是否supportcode
         */
        public async Task<QueryBuildpackSupportcoderepoResponse> QueryBuildpackSupportcoderepoExAsync(QueryBuildpackSupportcoderepoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackSupportcoderepoResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.supportcoderepo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过可用的app服务id查询Composite信息
         * Summary: 查询Composite信息
         */
        public QueryBuildpackFindavailablebyappserviceidsResponse QueryBuildpackFindavailablebyappserviceids(QueryBuildpackFindavailablebyappserviceidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpackFindavailablebyappserviceidsEx(request, headers, runtime);
        }

        /**
         * Description: 通过可用的app服务id查询Composite信息
         * Summary: 查询Composite信息
         */
        public async Task<QueryBuildpackFindavailablebyappserviceidsResponse> QueryBuildpackFindavailablebyappserviceidsAsync(QueryBuildpackFindavailablebyappserviceidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpackFindavailablebyappserviceidsExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过可用的app服务id查询Composite信息
         * Summary: 查询Composite信息
         */
        public QueryBuildpackFindavailablebyappserviceidsResponse QueryBuildpackFindavailablebyappserviceidsEx(QueryBuildpackFindavailablebyappserviceidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindavailablebyappserviceidsResponse>(DoRequest("1.0", "antcloud.deps.buildpack.findavailablebyappserviceids.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过可用的app服务id查询Composite信息
         * Summary: 查询Composite信息
         */
        public async Task<QueryBuildpackFindavailablebyappserviceidsResponse> QueryBuildpackFindavailablebyappserviceidsExAsync(QueryBuildpackFindavailablebyappserviceidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpackFindavailablebyappserviceidsResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.findavailablebyappserviceids.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: pageQuery
         * Summary: pageQuery
         */
        public QueryBuildpacknewResponse QueryBuildpacknew(QueryBuildpacknewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBuildpacknewEx(request, headers, runtime);
        }

        /**
         * Description: pageQuery
         * Summary: pageQuery
         */
        public async Task<QueryBuildpacknewResponse> QueryBuildpacknewAsync(QueryBuildpacknewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBuildpacknewExAsync(request, headers, runtime);
        }

        /**
         * Description: pageQuery
         * Summary: pageQuery
         */
        public QueryBuildpacknewResponse QueryBuildpacknewEx(QueryBuildpacknewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpacknewResponse>(DoRequest("1.0", "antcloud.deps.buildpacknew.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: pageQuery
         * Summary: pageQuery
         */
        public async Task<QueryBuildpacknewResponse> QueryBuildpacknewExAsync(QueryBuildpacknewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBuildpacknewResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpacknew.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: buildpacknewget
         * Summary: buildpacknewget
         */
        public GetBuildpacknewResponse GetBuildpacknew(GetBuildpacknewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBuildpacknewEx(request, headers, runtime);
        }

        /**
         * Description: buildpacknewget
         * Summary: buildpacknewget
         */
        public async Task<GetBuildpacknewResponse> GetBuildpacknewAsync(GetBuildpacknewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBuildpacknewExAsync(request, headers, runtime);
        }

        /**
         * Description: buildpacknewget
         * Summary: buildpacknewget
         */
        public GetBuildpacknewResponse GetBuildpacknewEx(GetBuildpacknewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBuildpacknewResponse>(DoRequest("1.0", "antcloud.deps.buildpacknew.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: buildpacknewget
         * Summary: buildpacknewget
         */
        public async Task<GetBuildpacknewResponse> GetBuildpacknewExAsync(GetBuildpacknewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBuildpacknewResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpacknew.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update
         * Summary: update
         */
        public UpdateBuildpacknewUploadfinishResponse UpdateBuildpacknewUploadfinish(UpdateBuildpacknewUploadfinishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBuildpacknewUploadfinishEx(request, headers, runtime);
        }

        /**
         * Description: update
         * Summary: update
         */
        public async Task<UpdateBuildpacknewUploadfinishResponse> UpdateBuildpacknewUploadfinishAsync(UpdateBuildpacknewUploadfinishRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBuildpacknewUploadfinishExAsync(request, headers, runtime);
        }

        /**
         * Description: update
         * Summary: update
         */
        public UpdateBuildpacknewUploadfinishResponse UpdateBuildpacknewUploadfinishEx(UpdateBuildpacknewUploadfinishRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpacknewUploadfinishResponse>(DoRequest("1.0", "antcloud.deps.buildpacknew.uploadfinish.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update
         * Summary: update
         */
        public async Task<UpdateBuildpacknewUploadfinishResponse> UpdateBuildpacknewUploadfinishExAsync(UpdateBuildpacknewUploadfinishRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpacknewUploadfinishResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpacknew.uploadfinish.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update
         * Summary: update
         */
        public UpdateBuildpacknewResponse UpdateBuildpacknew(UpdateBuildpacknewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBuildpacknewEx(request, headers, runtime);
        }

        /**
         * Description: update
         * Summary: update
         */
        public async Task<UpdateBuildpacknewResponse> UpdateBuildpacknewAsync(UpdateBuildpacknewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBuildpacknewExAsync(request, headers, runtime);
        }

        /**
         * Description: update
         * Summary: update
         */
        public UpdateBuildpacknewResponse UpdateBuildpacknewEx(UpdateBuildpacknewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpacknewResponse>(DoRequest("1.0", "antcloud.deps.buildpacknew.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update
         * Summary: update
         */
        public async Task<UpdateBuildpacknewResponse> UpdateBuildpacknewExAsync(UpdateBuildpacknewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBuildpacknewResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpacknew.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建技术栈
         * Summary: 创建技术栈
         */
        public CreateBuildpacknewResponse CreateBuildpacknew(CreateBuildpacknewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBuildpacknewEx(request, headers, runtime);
        }

        /**
         * Description: 创建技术栈
         * Summary: 创建技术栈
         */
        public async Task<CreateBuildpacknewResponse> CreateBuildpacknewAsync(CreateBuildpacknewRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBuildpacknewExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建技术栈
         * Summary: 创建技术栈
         */
        public CreateBuildpacknewResponse CreateBuildpacknewEx(CreateBuildpacknewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBuildpacknewResponse>(DoRequest("1.0", "antcloud.deps.buildpacknew.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建技术栈
         * Summary: 创建技术栈
         */
        public async Task<CreateBuildpacknewResponse> CreateBuildpacknewExAsync(CreateBuildpacknewRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBuildpacknewResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpacknew.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布一个技术栈
         * Summary: 发布一个技术栈
         */
        public OnlineBuildpackResponse OnlineBuildpack(OnlineBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineBuildpackEx(request, headers, runtime);
        }

        /**
         * Description: 发布一个技术栈
         * Summary: 发布一个技术栈
         */
        public async Task<OnlineBuildpackResponse> OnlineBuildpackAsync(OnlineBuildpackRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineBuildpackExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布一个技术栈
         * Summary: 发布一个技术栈
         */
        public OnlineBuildpackResponse OnlineBuildpackEx(OnlineBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineBuildpackResponse>(DoRequest("1.0", "antcloud.deps.buildpack.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布一个技术栈
         * Summary: 发布一个技术栈
         */
        public async Task<OnlineBuildpackResponse> OnlineBuildpackExAsync(OnlineBuildpackRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineBuildpackResponse>(await DoRequestAsync("1.0", "antcloud.deps.buildpack.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个全局参数
         * Summary: 创建一个全局参数
         */
        public CreateConfigGlobalResponse CreateConfigGlobal(CreateConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConfigGlobalEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个全局参数
         * Summary: 创建一个全局参数
         */
        public async Task<CreateConfigGlobalResponse> CreateConfigGlobalAsync(CreateConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConfigGlobalExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个全局参数
         * Summary: 创建一个全局参数
         */
        public CreateConfigGlobalResponse CreateConfigGlobalEx(CreateConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConfigGlobalResponse>(DoRequest("1.0", "antcloud.deps.config.global.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个全局参数
         * Summary: 创建一个全局参数
         */
        public async Task<CreateConfigGlobalResponse> CreateConfigGlobalExAsync(CreateConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConfigGlobalResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.global.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个全局参数
         * Summary: 删除一个全局参数
         */
        public DeleteConfigGlobalResponse DeleteConfigGlobal(DeleteConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteConfigGlobalEx(request, headers, runtime);
        }

        /**
         * Description: 删除一个全局参数
         * Summary: 删除一个全局参数
         */
        public async Task<DeleteConfigGlobalResponse> DeleteConfigGlobalAsync(DeleteConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteConfigGlobalExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除一个全局参数
         * Summary: 删除一个全局参数
         */
        public DeleteConfigGlobalResponse DeleteConfigGlobalEx(DeleteConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteConfigGlobalResponse>(DoRequest("1.0", "antcloud.deps.config.global.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个全局参数
         * Summary: 删除一个全局参数
         */
        public async Task<DeleteConfigGlobalResponse> DeleteConfigGlobalExAsync(DeleteConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteConfigGlobalResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.global.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定的全局参数
         * Summary: 更新指定的全局参数
         */
        public UpdateConfigGlobalResponse UpdateConfigGlobal(UpdateConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateConfigGlobalEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定的全局参数
         * Summary: 更新指定的全局参数
         */
        public async Task<UpdateConfigGlobalResponse> UpdateConfigGlobalAsync(UpdateConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateConfigGlobalExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定的全局参数
         * Summary: 更新指定的全局参数
         */
        public UpdateConfigGlobalResponse UpdateConfigGlobalEx(UpdateConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConfigGlobalResponse>(DoRequest("1.0", "antcloud.deps.config.global.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定的全局参数
         * Summary: 更新指定的全局参数
         */
        public async Task<UpdateConfigGlobalResponse> UpdateConfigGlobalExAsync(UpdateConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConfigGlobalResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.global.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据条件查询符合条件的全局参数
         * Summary: 根据条件查询符合条件的全局参数
         */
        public QueryConfigGlobalResponse QueryConfigGlobal(QueryConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConfigGlobalEx(request, headers, runtime);
        }

        /**
         * Description: 根据条件查询符合条件的全局参数
         * Summary: 根据条件查询符合条件的全局参数
         */
        public async Task<QueryConfigGlobalResponse> QueryConfigGlobalAsync(QueryConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConfigGlobalExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据条件查询符合条件的全局参数
         * Summary: 根据条件查询符合条件的全局参数
         */
        public QueryConfigGlobalResponse QueryConfigGlobalEx(QueryConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigGlobalResponse>(DoRequest("1.0", "antcloud.deps.config.global.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据条件查询符合条件的全局参数
         * Summary: 根据条件查询符合条件的全局参数
         */
        public async Task<QueryConfigGlobalResponse> QueryConfigGlobalExAsync(QueryConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigGlobalResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.global.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个全局参数
         * Summary: 获取单个全局参数
         */
        public GetConfigGlobalResponse GetConfigGlobal(GetConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetConfigGlobalEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个全局参数
         * Summary: 获取单个全局参数
         */
        public async Task<GetConfigGlobalResponse> GetConfigGlobalAsync(GetConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetConfigGlobalExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个全局参数
         * Summary: 获取单个全局参数
         */
        public GetConfigGlobalResponse GetConfigGlobalEx(GetConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigGlobalResponse>(DoRequest("1.0", "antcloud.deps.config.global.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个全局参数
         * Summary: 获取单个全局参数
         */
        public async Task<GetConfigGlobalResponse> GetConfigGlobalExAsync(GetConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigGlobalResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.global.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用参数
         * Summary: 创建一个应用参数
         */
        public CreateConfigAppResponse CreateConfigApp(CreateConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConfigAppEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用参数
         * Summary: 创建一个应用参数
         */
        public async Task<CreateConfigAppResponse> CreateConfigAppAsync(CreateConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConfigAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用参数
         * Summary: 创建一个应用参数
         */
        public CreateConfigAppResponse CreateConfigAppEx(CreateConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConfigAppResponse>(DoRequest("1.0", "antcloud.deps.config.app.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用参数
         * Summary: 创建一个应用参数
         */
        public async Task<CreateConfigAppResponse> CreateConfigAppExAsync(CreateConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConfigAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.app.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个应用参数
         * Summary: 删除一个应用参数
         */
        public DeleteConfigAppResponse DeleteConfigApp(DeleteConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteConfigAppEx(request, headers, runtime);
        }

        /**
         * Description: 删除一个应用参数
         * Summary: 删除一个应用参数
         */
        public async Task<DeleteConfigAppResponse> DeleteConfigAppAsync(DeleteConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteConfigAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除一个应用参数
         * Summary: 删除一个应用参数
         */
        public DeleteConfigAppResponse DeleteConfigAppEx(DeleteConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteConfigAppResponse>(DoRequest("1.0", "antcloud.deps.config.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个应用参数
         * Summary: 删除一个应用参数
         */
        public async Task<DeleteConfigAppResponse> DeleteConfigAppExAsync(DeleteConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteConfigAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定的应用参数
         * Summary: 更新指定的应用参数
         */
        public UpdateConfigAppResponse UpdateConfigApp(UpdateConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateConfigAppEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定的应用参数
         * Summary: 更新指定的应用参数
         */
        public async Task<UpdateConfigAppResponse> UpdateConfigAppAsync(UpdateConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateConfigAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定的应用参数
         * Summary: 更新指定的应用参数
         */
        public UpdateConfigAppResponse UpdateConfigAppEx(UpdateConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConfigAppResponse>(DoRequest("1.0", "antcloud.deps.config.app.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定的应用参数
         * Summary: 更新指定的应用参数
         */
        public async Task<UpdateConfigAppResponse> UpdateConfigAppExAsync(UpdateConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateConfigAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.app.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定的应用参数
         * Summary: 获取指定的应用参数
         */
        public GetConfigAppResponse GetConfigApp(GetConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetConfigAppEx(request, headers, runtime);
        }

        /**
         * Description: 获取指定的应用参数
         * Summary: 获取指定的应用参数
         */
        public async Task<GetConfigAppResponse> GetConfigAppAsync(GetConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetConfigAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指定的应用参数
         * Summary: 获取指定的应用参数
         */
        public GetConfigAppResponse GetConfigAppEx(GetConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigAppResponse>(DoRequest("1.0", "antcloud.deps.config.app.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定的应用参数
         * Summary: 获取指定的应用参数
         */
        public async Task<GetConfigAppResponse> GetConfigAppExAsync(GetConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.app.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询符合条件的应用参数
         * Summary: 查询符合条件的应用参数
         */
        public QueryConfigAppResponse QueryConfigApp(QueryConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConfigAppEx(request, headers, runtime);
        }

        /**
         * Description: 查询符合条件的应用参数
         * Summary: 查询符合条件的应用参数
         */
        public async Task<QueryConfigAppResponse> QueryConfigAppAsync(QueryConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConfigAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询符合条件的应用参数
         * Summary: 查询符合条件的应用参数
         */
        public QueryConfigAppResponse QueryConfigAppEx(QueryConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigAppResponse>(DoRequest("1.0", "antcloud.deps.config.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询符合条件的应用参数
         * Summary: 查询符合条件的应用参数
         */
        public async Task<QueryConfigAppResponse> QueryConfigAppExAsync(QueryConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
         * Summary: 将一个应用参数模板保存为草稿
         */
        public SaveConfigTemplateResponse SaveConfigTemplate(SaveConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveConfigTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
         * Summary: 将一个应用参数模板保存为草稿
         */
        public async Task<SaveConfigTemplateResponse> SaveConfigTemplateAsync(SaveConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveConfigTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
         * Summary: 将一个应用参数模板保存为草稿
         */
        public SaveConfigTemplateResponse SaveConfigTemplateEx(SaveConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveConfigTemplateResponse>(DoRequest("1.0", "antcloud.deps.config.template.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保存一个应用参数模板草稿的修改，后端会将 state 置为 DRAFT，不会生成 version（一直为空）；此时该草稿记录可以反复被修改；点击保存时，如果参数模板还没创建（tpl_id 为空），那么后端会创建一个，如果已经存在参数模板草稿，那么更新该参数模板；
         * Summary: 将一个应用参数模板保存为草稿
         */
        public async Task<SaveConfigTemplateResponse> SaveConfigTemplateExAsync(SaveConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveConfigTemplateResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.template.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
         * Summary: 发布一个应用参数模板
         */
        public CreateConfigTemplateResponse CreateConfigTemplate(CreateConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateConfigTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
         * Summary: 发布一个应用参数模板
         */
        public async Task<CreateConfigTemplateResponse> CreateConfigTemplateAsync(CreateConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateConfigTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
         * Summary: 发布一个应用参数模板
         */
        public CreateConfigTemplateResponse CreateConfigTemplateEx(CreateConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConfigTemplateResponse>(DoRequest("1.0", "antcloud.deps.config.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布一个应用参数模板，后端会将  state 置为 RELEASE，并且自动生成 version；此时该版本就已经固定，不能修改该条记录；点击发布时，如果之前没创建过参数模板草稿（tpl_id 为空），那么直接调用创建接口，如果当前参数模板是在草稿上发布的，那么调用更新接口，将 state 置为 RELEASE，并自动生成 version；
         * Summary: 发布一个应用参数模板
         */
        public async Task<CreateConfigTemplateResponse> CreateConfigTemplateExAsync(CreateConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateConfigTemplateResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取某个应用最新版本的应用参数模板
         * Summary: 获取某个应用最新版本的应用参数模板
         */
        public PullConfigTemplateResponse PullConfigTemplate(PullConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullConfigTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 获取某个应用最新版本的应用参数模板
         * Summary: 获取某个应用最新版本的应用参数模板
         */
        public async Task<PullConfigTemplateResponse> PullConfigTemplateAsync(PullConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullConfigTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取某个应用最新版本的应用参数模板
         * Summary: 获取某个应用最新版本的应用参数模板
         */
        public PullConfigTemplateResponse PullConfigTemplateEx(PullConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullConfigTemplateResponse>(DoRequest("1.0", "antcloud.deps.config.template.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取某个应用最新版本的应用参数模板
         * Summary: 获取某个应用最新版本的应用参数模板
         */
        public async Task<PullConfigTemplateResponse> PullConfigTemplateExAsync(PullConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullConfigTemplateResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.template.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
         * Summary: 删除一个应用参数模板草稿
         */
        public DeleteConfigTemplatedraftResponse DeleteConfigTemplatedraft(DeleteConfigTemplatedraftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteConfigTemplatedraftEx(request, headers, runtime);
        }

        /**
         * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
         * Summary: 删除一个应用参数模板草稿
         */
        public async Task<DeleteConfigTemplatedraftResponse> DeleteConfigTemplatedraftAsync(DeleteConfigTemplatedraftRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteConfigTemplatedraftExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
         * Summary: 删除一个应用参数模板草稿
         */
        public DeleteConfigTemplatedraftResponse DeleteConfigTemplatedraftEx(DeleteConfigTemplatedraftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteConfigTemplatedraftResponse>(DoRequest("1.0", "antcloud.deps.config.templatedraft.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除一个应用参数模板 草稿，后端判断是否为草稿状态，如果不是，删除失败
         * Summary: 删除一个应用参数模板草稿
         */
        public async Task<DeleteConfigTemplatedraftResponse> DeleteConfigTemplatedraftExAsync(DeleteConfigTemplatedraftRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteConfigTemplatedraftResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.templatedraft.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取某个指定的应用参数模板
         * Summary: 获取某个指定的应用参数模板
         */
        public GetConfigTemplateResponse GetConfigTemplate(GetConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetConfigTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 获取某个指定的应用参数模板
         * Summary: 获取某个指定的应用参数模板
         */
        public async Task<GetConfigTemplateResponse> GetConfigTemplateAsync(GetConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetConfigTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取某个指定的应用参数模板
         * Summary: 获取某个指定的应用参数模板
         */
        public GetConfigTemplateResponse GetConfigTemplateEx(GetConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigTemplateResponse>(DoRequest("1.0", "antcloud.deps.config.template.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取某个指定的应用参数模板
         * Summary: 获取某个指定的应用参数模板
         */
        public async Task<GetConfigTemplateResponse> GetConfigTemplateExAsync(GetConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigTemplateResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.template.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询符合条件的应用参数模板
         * Summary: 查询符合条件的应用参数模板
         */
        public QueryConfigTemplateResponse QueryConfigTemplate(QueryConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryConfigTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 查询符合条件的应用参数模板
         * Summary: 查询符合条件的应用参数模板
         */
        public async Task<QueryConfigTemplateResponse> QueryConfigTemplateAsync(QueryConfigTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryConfigTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询符合条件的应用参数模板
         * Summary: 查询符合条件的应用参数模板
         */
        public QueryConfigTemplateResponse QueryConfigTemplateEx(QueryConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigTemplateResponse>(DoRequest("1.0", "antcloud.deps.config.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询符合条件的应用参数模板
         * Summary: 查询符合条件的应用参数模板
         */
        public async Task<QueryConfigTemplateResponse> QueryConfigTemplateExAsync(QueryConfigTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryConfigTemplateResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
         * Summary: 渲染一个指定的参数列表
         */
        public ExecConfigParseResponse ExecConfigParse(ExecConfigParseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecConfigParseEx(request, headers, runtime);
        }

        /**
         * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
         * Summary: 渲染一个指定的参数列表
         */
        public async Task<ExecConfigParseResponse> ExecConfigParseAsync(ExecConfigParseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecConfigParseExAsync(request, headers, runtime);
        }

        /**
         * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
         * Summary: 渲染一个指定的参数列表
         */
        public ExecConfigParseResponse ExecConfigParseEx(ExecConfigParseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConfigParseResponse>(DoRequest("1.0", "antcloud.deps.config.parse.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渲染一个指定的参数列表，包含渲染上下文和待解析的参数，其中 workspace_group_id 和 workspace_id 至少填一个，后端会做校验；
         * Summary: 渲染一个指定的参数列表
         */
        public async Task<ExecConfigParseResponse> ExecConfigParseExAsync(ExecConfigParseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecConfigParseResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.parse.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建全局参数
         * Summary: 批量创建全局参数
         */
        public BatchcreateConfigGlobalResponse BatchcreateConfigGlobal(BatchcreateConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateConfigGlobalEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建全局参数
         * Summary: 批量创建全局参数
         */
        public async Task<BatchcreateConfigGlobalResponse> BatchcreateConfigGlobalAsync(BatchcreateConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateConfigGlobalExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建全局参数
         * Summary: 批量创建全局参数
         */
        public BatchcreateConfigGlobalResponse BatchcreateConfigGlobalEx(BatchcreateConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateConfigGlobalResponse>(DoRequest("1.0", "antcloud.deps.config.global.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建全局参数
         * Summary: 批量创建全局参数
         */
        public async Task<BatchcreateConfigGlobalResponse> BatchcreateConfigGlobalExAsync(BatchcreateConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateConfigGlobalResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.global.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用参数
         * Summary: 批量创建应用参数
         */
        public BatchcreateConfigAppResponse BatchcreateConfigApp(BatchcreateConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchcreateConfigAppEx(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用参数
         * Summary: 批量创建应用参数
         */
        public async Task<BatchcreateConfigAppResponse> BatchcreateConfigAppAsync(BatchcreateConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchcreateConfigAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量创建应用参数
         * Summary: 批量创建应用参数
         */
        public BatchcreateConfigAppResponse BatchcreateConfigAppEx(BatchcreateConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateConfigAppResponse>(DoRequest("1.0", "antcloud.deps.config.app.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量创建应用参数
         * Summary: 批量创建应用参数
         */
        public async Task<BatchcreateConfigAppResponse> BatchcreateConfigAppExAsync(BatchcreateConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchcreateConfigAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.app.batchcreate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
         * Summary: 获取当前租户下的站点管理员视角的树形结构
         */
        public GetConfigSitetreeResponse GetConfigSitetree(GetConfigSitetreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetConfigSitetreeEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
         * Summary: 获取当前租户下的站点管理员视角的树形结构
         */
        public async Task<GetConfigSitetreeResponse> GetConfigSitetreeAsync(GetConfigSitetreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetConfigSitetreeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
         * Summary: 获取当前租户下的站点管理员视角的树形结构
         */
        public GetConfigSitetreeResponse GetConfigSitetreeEx(GetConfigSitetreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigSitetreeResponse>(DoRequest("1.0", "antcloud.deps.config.sitetree.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前租户下的站点管理员视角的树形结构：区域(region)=>机房(az)
         * Summary: 获取当前租户下的站点管理员视角的树形结构
         */
        public async Task<GetConfigSitetreeResponse> GetConfigSitetreeExAsync(GetConfigSitetreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigSitetreeResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.sitetree.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
         * Summary: 获取当前租户下的租户管理员视角的树形结构
         */
        public GetConfigTenanttreeResponse GetConfigTenanttree(GetConfigTenanttreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetConfigTenanttreeEx(request, headers, runtime);
        }

        /**
         * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
         * Summary: 获取当前租户下的租户管理员视角的树形结构
         */
        public async Task<GetConfigTenanttreeResponse> GetConfigTenanttreeAsync(GetConfigTenanttreeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetConfigTenanttreeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
         * Summary: 获取当前租户下的租户管理员视角的树形结构
         */
        public GetConfigTenanttreeResponse GetConfigTenanttreeEx(GetConfigTenanttreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigTenanttreeResponse>(DoRequest("1.0", "antcloud.deps.config.tenanttree.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取当前租户下的租户管理员视角的树形结构：工作空间组(workspaceGroup)=>工作空间(workspace)=>部署单元(cell)
         * Summary: 获取当前租户下的租户管理员视角的树形结构
         */
        public async Task<GetConfigTenanttreeResponse> GetConfigTenanttreeExAsync(GetConfigTenanttreeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetConfigTenanttreeResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.tenanttree.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查应用参数是否已存在
         * Summary: 检查应用参数是否已存在
         */
        public ExistConfigAppResponse ExistConfigApp(ExistConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistConfigAppEx(request, headers, runtime);
        }

        /**
         * Description: 检查应用参数是否已存在
         * Summary: 检查应用参数是否已存在
         */
        public async Task<ExistConfigAppResponse> ExistConfigAppAsync(ExistConfigAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistConfigAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 检查应用参数是否已存在
         * Summary: 检查应用参数是否已存在
         */
        public ExistConfigAppResponse ExistConfigAppEx(ExistConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistConfigAppResponse>(DoRequest("1.0", "antcloud.deps.config.app.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查应用参数是否已存在
         * Summary: 检查应用参数是否已存在
         */
        public async Task<ExistConfigAppResponse> ExistConfigAppExAsync(ExistConfigAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistConfigAppResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.app.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查全局参数是否已存在
         * Summary: 检查全局参数是否已存在
         */
        public ExistConfigGlobalResponse ExistConfigGlobal(ExistConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistConfigGlobalEx(request, headers, runtime);
        }

        /**
         * Description: 检查全局参数是否已存在
         * Summary: 检查全局参数是否已存在
         */
        public async Task<ExistConfigGlobalResponse> ExistConfigGlobalAsync(ExistConfigGlobalRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistConfigGlobalExAsync(request, headers, runtime);
        }

        /**
         * Description: 检查全局参数是否已存在
         * Summary: 检查全局参数是否已存在
         */
        public ExistConfigGlobalResponse ExistConfigGlobalEx(ExistConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistConfigGlobalResponse>(DoRequest("1.0", "antcloud.deps.config.global.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查全局参数是否已存在
         * Summary: 检查全局参数是否已存在
         */
        public async Task<ExistConfigGlobalResponse> ExistConfigGlobalExAsync(ExistConfigGlobalRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistConfigGlobalResponse>(await DoRequestAsync("1.0", "antcloud.deps.config.global.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出指定租户下所有环境
         * Summary: 列出指定租户下所有环境
         */
        public ListWorkspacegroupResponse ListWorkspacegroup(ListWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 列出指定租户下所有环境
         * Summary: 列出指定租户下所有环境
         */
        public async Task<ListWorkspacegroupResponse> ListWorkspacegroupAsync(ListWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出指定租户下所有环境
         * Summary: 列出指定租户下所有环境
         */
        public ListWorkspacegroupResponse ListWorkspacegroupEx(ListWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWorkspacegroupResponse>(DoRequest("1.0", "antcloud.deps.workspacegroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出指定租户下所有环境
         * Summary: 列出指定租户下所有环境
         */
        public async Task<ListWorkspacegroupResponse> ListWorkspacegroupExAsync(ListWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspacegroup.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定环境信息
         * Summary: 查询指定环境信息
         */
        public GetWorkspacegroupResponse GetWorkspacegroup(GetWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定环境信息
         * Summary: 查询指定环境信息
         */
        public async Task<GetWorkspacegroupResponse> GetWorkspacegroupAsync(GetWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定环境信息
         * Summary: 查询指定环境信息
         */
        public GetWorkspacegroupResponse GetWorkspacegroupEx(GetWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspacegroupResponse>(DoRequest("1.0", "antcloud.deps.workspacegroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定环境信息
         * Summary: 查询指定环境信息
         */
        public async Task<GetWorkspacegroupResponse> GetWorkspacegroupExAsync(GetWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspacegroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元列表
         * Summary: 查询部署单元列表
         */
        public QueryCellResponse QueryCell(QueryCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元列表
         * Summary: 查询部署单元列表
         */
        public async Task<QueryCellResponse> QueryCellAsync(QueryCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元列表
         * Summary: 查询部署单元列表
         */
        public QueryCellResponse QueryCellEx(QueryCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCellResponse>(DoRequest("1.0", "antcloud.deps.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元列表
         * Summary: 查询部署单元列表
         */
        public async Task<QueryCellResponse> QueryCellExAsync(QueryCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境增量统计信息
         * Summary: 查询环境增量统计信息
         */
        public QueryWorkspaceDeltaResponse QueryWorkspaceDelta(QueryWorkspaceDeltaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWorkspaceDeltaEx(request, headers, runtime);
        }

        /**
         * Description: 查询环境增量统计信息
         * Summary: 查询环境增量统计信息
         */
        public async Task<QueryWorkspaceDeltaResponse> QueryWorkspaceDeltaAsync(QueryWorkspaceDeltaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWorkspaceDeltaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询环境增量统计信息
         * Summary: 查询环境增量统计信息
         */
        public QueryWorkspaceDeltaResponse QueryWorkspaceDeltaEx(QueryWorkspaceDeltaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkspaceDeltaResponse>(DoRequest("1.0", "antcloud.deps.workspace.delta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境增量统计信息
         * Summary: 查询环境增量统计信息
         */
        public async Task<QueryWorkspaceDeltaResponse> QueryWorkspaceDeltaExAsync(QueryWorkspaceDeltaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkspaceDeltaResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspace.delta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建工作空间组。
         * Summary: 创建工作空间组
         */
        public CreateWorkspacegroupResponse CreateWorkspacegroup(CreateWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建工作空间组。
         * Summary: 创建工作空间组
         */
        public async Task<CreateWorkspacegroupResponse> CreateWorkspacegroupAsync(CreateWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建工作空间组。
         * Summary: 创建工作空间组
         */
        public CreateWorkspacegroupResponse CreateWorkspacegroupEx(CreateWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWorkspacegroupResponse>(DoRequest("1.0", "antcloud.deps.workspacegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建工作空间组。
         * Summary: 创建工作空间组
         */
        public async Task<CreateWorkspacegroupResponse> CreateWorkspacegroupExAsync(CreateWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspacegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境组详细信息
         * Summary: 查询环境组详细信息
         */
        public QueryWorkspacegroupResponse QueryWorkspacegroup(QueryWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询环境组详细信息
         * Summary: 查询环境组详细信息
         */
        public async Task<QueryWorkspacegroupResponse> QueryWorkspacegroupAsync(QueryWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询环境组详细信息
         * Summary: 查询环境组详细信息
         */
        public QueryWorkspacegroupResponse QueryWorkspacegroupEx(QueryWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkspacegroupResponse>(DoRequest("1.0", "antcloud.deps.workspacegroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询环境组详细信息
         * Summary: 查询环境组详细信息
         */
        public async Task<QueryWorkspacegroupResponse> QueryWorkspacegroupExAsync(QueryWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspacegroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定工作空间组。
         * Summary: 删除指定工作空间组。
         */
        public DeleteWorkspacegroupResponse DeleteWorkspacegroup(DeleteWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除指定工作空间组。
         * Summary: 删除指定工作空间组。
         */
        public async Task<DeleteWorkspacegroupResponse> DeleteWorkspacegroupAsync(DeleteWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除指定工作空间组。
         * Summary: 删除指定工作空间组。
         */
        public DeleteWorkspacegroupResponse DeleteWorkspacegroupEx(DeleteWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWorkspacegroupResponse>(DoRequest("1.0", "antcloud.deps.workspacegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定工作空间组。
         * Summary: 删除指定工作空间组。
         */
        public async Task<DeleteWorkspacegroupResponse> DeleteWorkspacegroupExAsync(DeleteWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspacegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace信息(V2)。
         * Summary: 查询workspace信息(V2)。
         */
        public GetSingleworkspaceResponse GetSingleworkspace(GetSingleworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSingleworkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 查询workspace信息(V2)。
         * Summary: 查询workspace信息(V2)。
         */
        public async Task<GetSingleworkspaceResponse> GetSingleworkspaceAsync(GetSingleworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSingleworkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询workspace信息(V2)。
         * Summary: 查询workspace信息(V2)。
         */
        public GetSingleworkspaceResponse GetSingleworkspaceEx(GetSingleworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSingleworkspaceResponse>(DoRequest("1.0", "antcloud.deps.singleworkspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace信息(V2)。
         * Summary: 查询workspace信息(V2)。
         */
        public async Task<GetSingleworkspaceResponse> GetSingleworkspaceExAsync(GetSingleworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSingleworkspaceResponse>(await DoRequestAsync("1.0", "antcloud.deps.singleworkspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定环境信息。
         * Summary: 查询指定环境信息。
         */
        public GetSingleworkspacegroupResponse GetSingleworkspacegroup(GetSingleworkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSingleworkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定环境信息。
         * Summary: 查询指定环境信息。
         */
        public async Task<GetSingleworkspacegroupResponse> GetSingleworkspacegroupAsync(GetSingleworkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSingleworkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定环境信息。
         * Summary: 查询指定环境信息。
         */
        public GetSingleworkspacegroupResponse GetSingleworkspacegroupEx(GetSingleworkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSingleworkspacegroupResponse>(DoRequest("1.0", "antcloud.deps.singleworkspacegroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定环境信息。
         * Summary: 查询指定环境信息。
         */
        public async Task<GetSingleworkspacegroupResponse> GetSingleworkspacegroupExAsync(GetSingleworkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSingleworkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.singleworkspacegroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元列表。
         * Summary: 查询部署单元列表。
         */
        public ListCellResponse ListCell(ListCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元列表。
         * Summary: 查询部署单元列表。
         */
        public async Task<ListCellResponse> ListCellAsync(ListCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元列表。
         * Summary: 查询部署单元列表。
         */
        public ListCellResponse ListCellEx(ListCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCellResponse>(DoRequest("1.0", "antcloud.deps.cell.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元列表。
         * Summary: 查询部署单元列表。
         */
        public async Task<ListCellResponse> ListCellExAsync(ListCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.cell.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建workspace信息(V2)
         * Summary: 创建workspace信息(V2)
         */
        public CreateSingleworkspaceResponse CreateSingleworkspace(CreateSingleworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSingleworkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 创建workspace信息(V2)
         * Summary: 创建workspace信息(V2)
         */
        public async Task<CreateSingleworkspaceResponse> CreateSingleworkspaceAsync(CreateSingleworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSingleworkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建workspace信息(V2)
         * Summary: 创建workspace信息(V2)
         */
        public CreateSingleworkspaceResponse CreateSingleworkspaceEx(CreateSingleworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSingleworkspaceResponse>(DoRequest("1.0", "antcloud.deps.singleworkspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建workspace信息(V2)
         * Summary: 创建workspace信息(V2)
         */
        public async Task<CreateSingleworkspaceResponse> CreateSingleworkspaceExAsync(CreateSingleworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSingleworkspaceResponse>(await DoRequestAsync("1.0", "antcloud.deps.singleworkspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除workspace信息(V2)
         * Summary: 删除workspace信息(V2)
         */
        public DeleteSingleworkspaceResponse DeleteSingleworkspace(DeleteSingleworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSingleworkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 删除workspace信息(V2)
         * Summary: 删除workspace信息(V2)
         */
        public async Task<DeleteSingleworkspaceResponse> DeleteSingleworkspaceAsync(DeleteSingleworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSingleworkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除workspace信息(V2)
         * Summary: 删除workspace信息(V2)
         */
        public DeleteSingleworkspaceResponse DeleteSingleworkspaceEx(DeleteSingleworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSingleworkspaceResponse>(DoRequest("1.0", "antcloud.deps.singleworkspace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除workspace信息(V2)
         * Summary: 删除workspace信息(V2)
         */
        public async Task<DeleteSingleworkspaceResponse> DeleteSingleworkspaceExAsync(DeleteSingleworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSingleworkspaceResponse>(await DoRequestAsync("1.0", "antcloud.deps.singleworkspace.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建专有网络vpc
         * Summary: 创建专有网络vpc
         */
        public CreateVpcResponse CreateVpc(CreateVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateVpcEx(request, headers, runtime);
        }

        /**
         * Description: 创建专有网络vpc
         * Summary: 创建专有网络vpc
         */
        public async Task<CreateVpcResponse> CreateVpcAsync(CreateVpcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateVpcExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建专有网络vpc
         * Summary: 创建专有网络vpc
         */
        public CreateVpcResponse CreateVpcEx(CreateVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVpcResponse>(DoRequest("1.0", "antcloud.deps.vpc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建专有网络vpc
         * Summary: 创建专有网络vpc
         */
        public async Task<CreateVpcResponse> CreateVpcExAsync(CreateVpcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateVpcResponse>(await DoRequestAsync("1.0", "antcloud.deps.vpc.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新workspacegroup。
         * Summary: 更新workspacegroup。
         */
        public UpdateWorkspacegroupResponse UpdateWorkspacegroup(UpdateWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateWorkspacegroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新workspacegroup。
         * Summary: 更新workspacegroup。
         */
        public async Task<UpdateWorkspacegroupResponse> UpdateWorkspacegroupAsync(UpdateWorkspacegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateWorkspacegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新workspacegroup。
         * Summary: 更新workspacegroup。
         */
        public UpdateWorkspacegroupResponse UpdateWorkspacegroupEx(UpdateWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWorkspacegroupResponse>(DoRequest("1.0", "antcloud.deps.workspacegroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新workspacegroup。
         * Summary: 更新workspacegroup。
         */
        public async Task<UpdateWorkspacegroupResponse> UpdateWorkspacegroupExAsync(UpdateWorkspacegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateWorkspacegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspacegroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update workspace meta data
         * Summary: update workspace
         */
        public UpdateSingleworkspaceResponse UpdateSingleworkspace(UpdateSingleworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSingleworkspaceEx(request, headers, runtime);
        }

        /**
         * Description: update workspace meta data
         * Summary: update workspace
         */
        public async Task<UpdateSingleworkspaceResponse> UpdateSingleworkspaceAsync(UpdateSingleworkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSingleworkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: update workspace meta data
         * Summary: update workspace
         */
        public UpdateSingleworkspaceResponse UpdateSingleworkspaceEx(UpdateSingleworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSingleworkspaceResponse>(DoRequest("1.0", "antcloud.deps.singleworkspace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update workspace meta data
         * Summary: update workspace
         */
        public async Task<UpdateSingleworkspaceResponse> UpdateSingleworkspaceExAsync(UpdateSingleworkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSingleworkspaceResponse>(await DoRequestAsync("1.0", "antcloud.deps.singleworkspace.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list regions
         * Summary: list regions
         */
        public ListRegionResponse ListRegion(ListRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListRegionEx(request, headers, runtime);
        }

        /**
         * Description: list regions
         * Summary: list regions
         */
        public async Task<ListRegionResponse> ListRegionAsync(ListRegionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListRegionExAsync(request, headers, runtime);
        }

        /**
         * Description: list regions
         * Summary: list regions
         */
        public ListRegionResponse ListRegionEx(ListRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionResponse>(DoRequest("1.0", "antcloud.deps.region.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: list regions
         * Summary: list regions
         */
        public async Task<ListRegionResponse> ListRegionExAsync(ListRegionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListRegionResponse>(await DoRequestAsync("1.0", "antcloud.deps.region.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: zone list
         * Summary: zone list
         */
        public ListZoneResponse ListZone(ListZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListZoneEx(request, headers, runtime);
        }

        /**
         * Description: zone list
         * Summary: zone list
         */
        public async Task<ListZoneResponse> ListZoneAsync(ListZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: zone list
         * Summary: zone list
         */
        public ListZoneResponse ListZoneEx(ListZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListZoneResponse>(DoRequest("1.0", "antcloud.deps.zone.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: zone list
         * Summary: zone list
         */
        public async Task<ListZoneResponse> ListZoneExAsync(ListZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListZoneResponse>(await DoRequestAsync("1.0", "antcloud.deps.zone.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<CreateCellgroupResponse>(DoRequest("1.0", "antcloud.deps.cellgroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建逻辑单元
         * Summary: 创建逻辑单元
         */
        public async Task<CreateCellgroupResponse> CreateCellgroupExAsync(CreateCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateCellgroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.cellgroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<DeleteCellgroupResponse>(DoRequest("1.0", "antcloud.deps.cellgroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除逻辑单元
         * Summary: 删除逻辑单元
         */
        public async Task<DeleteCellgroupResponse> DeleteCellgroupExAsync(DeleteCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteCellgroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.cellgroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询逻辑单元
         * Summary: 查询逻辑单元
         */
        public QueryCellgroupResponse QueryCellgroup(QueryCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCellgroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询逻辑单元
         * Summary: 查询逻辑单元
         */
        public async Task<QueryCellgroupResponse> QueryCellgroupAsync(QueryCellgroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCellgroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询逻辑单元
         * Summary: 查询逻辑单元
         */
        public QueryCellgroupResponse QueryCellgroupEx(QueryCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCellgroupResponse>(DoRequest("1.0", "antcloud.deps.cellgroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询逻辑单元
         * Summary: 查询逻辑单元
         */
        public async Task<QueryCellgroupResponse> QueryCellgroupExAsync(QueryCellgroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCellgroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.cellgroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<UpdateCellgroupDisasterinfoResponse>(DoRequest("1.0", "antcloud.deps.cellgroup.disasterinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置逻辑单元灾备信息
         * Summary: 配置逻辑单元灾备信息
         */
        public async Task<UpdateCellgroupDisasterinfoResponse> UpdateCellgroupDisasterinfoExAsync(UpdateCellgroupDisasterinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCellgroupDisasterinfoResponse>(await DoRequestAsync("1.0", "antcloud.deps.cellgroup.disasterinfo.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建部署单元
         * Summary: 创建部署单元
         */
        public CreateDeploymentCellResponse CreateDeploymentCell(CreateDeploymentCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDeploymentCellEx(request, headers, runtime);
        }

        /**
         * Description: 创建部署单元
         * Summary: 创建部署单元
         */
        public async Task<CreateDeploymentCellResponse> CreateDeploymentCellAsync(CreateDeploymentCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDeploymentCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建部署单元
         * Summary: 创建部署单元
         */
        public CreateDeploymentCellResponse CreateDeploymentCellEx(CreateDeploymentCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeploymentCellResponse>(DoRequest("1.0", "antcloud.deps.deployment.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建部署单元
         * Summary: 创建部署单元
         */
        public async Task<CreateDeploymentCellResponse> CreateDeploymentCellExAsync(CreateDeploymentCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeploymentCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除部署单元
         * Summary: 删除部署单元
         */
        public DeleteDeploymentCellResponse DeleteDeploymentCell(DeleteDeploymentCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDeploymentCellEx(request, headers, runtime);
        }

        /**
         * Description: 删除部署单元
         * Summary: 删除部署单元
         */
        public async Task<DeleteDeploymentCellResponse> DeleteDeploymentCellAsync(DeleteDeploymentCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDeploymentCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除部署单元
         * Summary: 删除部署单元
         */
        public DeleteDeploymentCellResponse DeleteDeploymentCellEx(DeleteDeploymentCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDeploymentCellResponse>(DoRequest("1.0", "antcloud.deps.deployment.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除部署单元
         * Summary: 删除部署单元
         */
        public async Task<DeleteDeploymentCellResponse> DeleteDeploymentCellExAsync(DeleteDeploymentCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDeploymentCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元
         * Summary: 查询部署单元
         */
        public QueryDeploymentCellResponse QueryDeploymentCell(QueryDeploymentCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeploymentCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元
         * Summary: 查询部署单元
         */
        public async Task<QueryDeploymentCellResponse> QueryDeploymentCellAsync(QueryDeploymentCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeploymentCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元
         * Summary: 查询部署单元
         */
        public QueryDeploymentCellResponse QueryDeploymentCellEx(QueryDeploymentCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeploymentCellResponse>(DoRequest("1.0", "antcloud.deps.deployment.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元
         * Summary: 查询部署单元
         */
        public async Task<QueryDeploymentCellResponse> QueryDeploymentCellExAsync(QueryDeploymentCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeploymentCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新部署单元
         * Summary: 更新部署单元
         */
        public UpdateDeploymentCellResponse UpdateDeploymentCell(UpdateDeploymentCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDeploymentCellEx(request, headers, runtime);
        }

        /**
         * Description: 更新部署单元
         * Summary: 更新部署单元
         */
        public async Task<UpdateDeploymentCellResponse> UpdateDeploymentCellAsync(UpdateDeploymentCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDeploymentCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新部署单元
         * Summary: 更新部署单元
         */
        public UpdateDeploymentCellResponse UpdateDeploymentCellEx(UpdateDeploymentCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDeploymentCellResponse>(DoRequest("1.0", "antcloud.deps.deployment.cell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新部署单元
         * Summary: 更新部署单元
         */
        public async Task<UpdateDeploymentCellResponse> UpdateDeploymentCellExAsync(UpdateDeploymentCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDeploymentCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.cell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询部署单基础信息
         * Summary: 批量查询部署单基础信息
         */
        public QueryDeploymentResponse QueryDeployment(QueryDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询部署单基础信息
         * Summary: 批量查询部署单基础信息
         */
        public async Task<QueryDeploymentResponse> QueryDeploymentAsync(QueryDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询部署单基础信息
         * Summary: 批量查询部署单基础信息
         */
        public QueryDeploymentResponse QueryDeploymentEx(QueryDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeploymentResponse>(DoRequest("1.0", "antcloud.deps.deployment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询部署单基础信息
         * Summary: 批量查询部署单基础信息
         */
        public async Task<QueryDeploymentResponse> QueryDeploymentExAsync(QueryDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个部署单执行取消操作。
        当部署单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public CancelDeploymentResponse CancelDeployment(CancelDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 对一个部署单执行取消操作。
        当部署单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public async Task<CancelDeploymentResponse> CancelDeploymentAsync(CancelDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个部署单执行取消操作。
        当部署单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public CancelDeploymentResponse CancelDeploymentEx(CancelDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDeploymentResponse>(DoRequest("1.0", "antcloud.deps.deployment.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个部署单执行取消操作。
        当部署单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public async Task<CancelDeploymentResponse> CancelDeploymentExAsync(CancelDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
        - 部署依赖示例
        假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
        applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
         * Summary: 创建发布
         */
        public CreateDeploymentResponse CreateDeployment(CreateDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
        - 部署依赖示例
        假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
        applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
         * Summary: 创建发布
         */
        public async Task<CreateDeploymentResponse> CreateDeploymentAsync(CreateDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
        - 部署依赖示例
        假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
        applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
         * Summary: 创建发布
         */
        public CreateDeploymentResponse CreateDeploymentEx(CreateDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeploymentResponse>(DoRequest("1.0", "antcloud.deps.deployment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个部署单，以对一组应用（服务）执行一次部署操作。
        - 部署依赖示例
        假设一个部署单将要部署myapp1、myapp2、myapp3，其中myapp1依赖myapp2、myapp3，则应输入参数：
        applications.1.name=myapp1&applications.2.name=myapp2&applications.3.name=myapp3&applications.1.depends.1=myapp2&applications.1.depends.2=myapp3
         * Summary: 创建发布
         */
        public async Task<CreateDeploymentResponse> CreateDeploymentExAsync(CreateDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个已经创建成功的部署操作。
         * Summary: 获取部署
         */
        public GetDeploymentResponse GetDeployment(GetDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个已经创建成功的部署操作。
         * Summary: 获取部署
         */
        public async Task<GetDeploymentResponse> GetDeploymentAsync(GetDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个已经创建成功的部署操作。
         * Summary: 获取部署
         */
        public GetDeploymentResponse GetDeploymentEx(GetDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentResponse>(DoRequest("1.0", "antcloud.deps.deployment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个已经创建成功的部署操作。
         * Summary: 获取部署
         */
        public async Task<GetDeploymentResponse> GetDeploymentExAsync(GetDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
        当部署单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试部署
         */
        public RetryDeploymentResponse RetryDeployment(RetryDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
        当部署单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试部署
         */
        public async Task<RetryDeploymentResponse> RetryDeploymentAsync(RetryDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
        当部署单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试部署
         */
        public RetryDeploymentResponse RetryDeploymentEx(RetryDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryDeploymentResponse>(DoRequest("1.0", "antcloud.deps.deployment.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个部署操作中所有部署失败的分组进行重试操作。
        当部署单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试部署
         */
        public async Task<RetryDeploymentResponse> RetryDeploymentExAsync(RetryDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始部署
         */
        public StartDeploymentResponse StartDeployment(StartDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始部署
         */
        public async Task<StartDeploymentResponse> StartDeploymentAsync(StartDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始部署
         */
        public StartDeploymentResponse StartDeploymentEx(StartDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartDeploymentResponse>(DoRequest("1.0", "antcloud.deps.deployment.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行一个已经创建成功的部署操作。如果此部署单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始部署
         */
        public async Task<StartDeploymentResponse> StartDeploymentExAsync(StartDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个部署操作中某个应用（服务）的详情。
         * Summary: 获取部署应用（服务）
         */
        public GetDeploymentApplicationResponse GetDeploymentApplication(GetDeploymentApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDeploymentApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个部署操作中某个应用（服务）的详情。
         * Summary: 获取部署应用（服务）
         */
        public async Task<GetDeploymentApplicationResponse> GetDeploymentApplicationAsync(GetDeploymentApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDeploymentApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个部署操作中某个应用（服务）的详情。
         * Summary: 获取部署应用（服务）
         */
        public GetDeploymentApplicationResponse GetDeploymentApplicationEx(GetDeploymentApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentApplicationResponse>(DoRequest("1.0", "antcloud.deps.deployment.application.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个部署操作中某个应用（服务）的详情。
         * Summary: 获取部署应用（服务）
         */
        public async Task<GetDeploymentApplicationResponse> GetDeploymentApplicationExAsync(GetDeploymentApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDeploymentApplicationResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.application.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
        当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
        - EXECUTING：执行中
        - SUCCESS：执行成功
        - FAILED：执行失败
         * Summary: 回滚部署
         */
        public RollbackDeploymentApplicationResponse RollbackDeploymentApplication(RollbackDeploymentApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackDeploymentApplicationEx(request, headers, runtime);
        }

        /**
         * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
        当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
        - EXECUTING：执行中
        - SUCCESS：执行成功
        - FAILED：执行失败
         * Summary: 回滚部署
         */
        public async Task<RollbackDeploymentApplicationResponse> RollbackDeploymentApplicationAsync(RollbackDeploymentApplicationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackDeploymentApplicationExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
        当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
        - EXECUTING：执行中
        - SUCCESS：执行成功
        - FAILED：执行失败
         * Summary: 回滚部署
         */
        public RollbackDeploymentApplicationResponse RollbackDeploymentApplicationEx(RollbackDeploymentApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackDeploymentApplicationResponse>(DoRequest("1.0", "antcloud.deps.deployment.application.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个部署操作中，某个应用（服务）的部署操作执行回滚。执行成功后，将回滚到上次成功部署的版本。一个应用（服务）只可以执行一次回滚操作，即已执行回滚操作的应用无论回滚成功与否都无法再次回滚。
        当部署的应用（服务）且应用（服务）对应的部署单处于以下状态时可执行回滚：
        - EXECUTING：执行中
        - SUCCESS：执行成功
        - FAILED：执行失败
         * Summary: 回滚部署
         */
        public async Task<RollbackDeploymentApplicationResponse> RollbackDeploymentApplicationExAsync(RollbackDeploymentApplicationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackDeploymentApplicationResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.application.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化部署
         */
        public ReinitDeploymentResponse ReinitDeployment(ReinitDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitDeploymentEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化部署
         */
        public async Task<ReinitDeploymentResponse> ReinitDeploymentAsync(ReinitDeploymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitDeploymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化部署
         */
        public ReinitDeploymentResponse ReinitDeploymentEx(ReinitDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitDeploymentResponse>(DoRequest("1.0", "antcloud.deps.deployment.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化一个初始化失败的部署单。当部署单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化部署
         */
        public async Task<ReinitDeploymentResponse> ReinitDeploymentExAsync(ReinitDeploymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitDeploymentResponse>(await DoRequestAsync("1.0", "antcloud.deps.deployment.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据查询条件查询指令模板。
         * Summary: 查询指令模板
         */
        public QueryCmdtemplateResponse QueryCmdtemplate(QueryCmdtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCmdtemplateEx(request, headers, runtime);
        }

        /**
         * Description: 根据查询条件查询指令模板。
         * Summary: 查询指令模板
         */
        public async Task<QueryCmdtemplateResponse> QueryCmdtemplateAsync(QueryCmdtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCmdtemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据查询条件查询指令模板。
         * Summary: 查询指令模板
         */
        public QueryCmdtemplateResponse QueryCmdtemplateEx(QueryCmdtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCmdtemplateResponse>(DoRequest("1.0", "antcloud.deps.cmdtemplate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据查询条件查询指令模板。
         * Summary: 查询指令模板
         */
        public async Task<QueryCmdtemplateResponse> QueryCmdtemplateExAsync(QueryCmdtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCmdtemplateResponse>(await DoRequestAsync("1.0", "antcloud.deps.cmdtemplate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指令模板详情。
         * Summary: 获取指令模板详情。
         */
        public GetCmdtemplateResponse GetCmdtemplate(GetCmdtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCmdtemplateEx(request, headers, runtime);
        }

        /**
         * Description: 获取指令模板详情。
         * Summary: 获取指令模板详情。
         */
        public async Task<GetCmdtemplateResponse> GetCmdtemplateAsync(GetCmdtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCmdtemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指令模板详情。
         * Summary: 获取指令模板详情。
         */
        public GetCmdtemplateResponse GetCmdtemplateEx(GetCmdtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCmdtemplateResponse>(DoRequest("1.0", "antcloud.deps.cmdtemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指令模板详情。
         * Summary: 获取指令模板详情。
         */
        public async Task<GetCmdtemplateResponse> GetCmdtemplateExAsync(GetCmdtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCmdtemplateResponse>(await DoRequestAsync("1.0", "antcloud.deps.cmdtemplate.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步执行指令。
         * Summary: 同步执行指令。
         */
        public SyncexecuteCmdTaskResponse SyncexecuteCmdTask(SyncexecuteCmdTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncexecuteCmdTaskEx(request, headers, runtime);
        }

        /**
         * Description: 同步执行指令。
         * Summary: 同步执行指令。
         */
        public async Task<SyncexecuteCmdTaskResponse> SyncexecuteCmdTaskAsync(SyncexecuteCmdTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncexecuteCmdTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步执行指令。
         * Summary: 同步执行指令。
         */
        public SyncexecuteCmdTaskResponse SyncexecuteCmdTaskEx(SyncexecuteCmdTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncexecuteCmdTaskResponse>(DoRequest("1.0", "antcloud.deps.cmd.task.syncexecute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步执行指令。
         * Summary: 同步执行指令。
         */
        public async Task<SyncexecuteCmdTaskResponse> SyncexecuteCmdTaskExAsync(SyncexecuteCmdTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncexecuteCmdTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.cmd.task.syncexecute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步执行指令。
         * Summary: 异步执行指令。
         */
        public AsyncexecuteCmdTaskResponse AsyncexecuteCmdTask(AsyncexecuteCmdTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AsyncexecuteCmdTaskEx(request, headers, runtime);
        }

        /**
         * Description: 异步执行指令。
         * Summary: 异步执行指令。
         */
        public async Task<AsyncexecuteCmdTaskResponse> AsyncexecuteCmdTaskAsync(AsyncexecuteCmdTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AsyncexecuteCmdTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步执行指令。
         * Summary: 异步执行指令。
         */
        public AsyncexecuteCmdTaskResponse AsyncexecuteCmdTaskEx(AsyncexecuteCmdTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AsyncexecuteCmdTaskResponse>(DoRequest("1.0", "antcloud.deps.cmd.task.asyncexecute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步执行指令。
         * Summary: 异步执行指令。
         */
        public async Task<AsyncexecuteCmdTaskResponse> AsyncexecuteCmdTaskExAsync(AsyncexecuteCmdTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AsyncexecuteCmdTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.cmd.task.asyncexecute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询执行指令任务结果。
         * Summary: 查询执行指令任务结果。
         */
        public GetCmdTaskResponse GetCmdTask(GetCmdTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCmdTaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询执行指令任务结果。
         * Summary: 查询执行指令任务结果。
         */
        public async Task<GetCmdTaskResponse> GetCmdTaskAsync(GetCmdTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCmdTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询执行指令任务结果。
         * Summary: 查询执行指令任务结果。
         */
        public GetCmdTaskResponse GetCmdTaskEx(GetCmdTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCmdTaskResponse>(DoRequest("1.0", "antcloud.deps.cmd.task.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询执行指令任务结果。
         * Summary: 查询执行指令任务结果。
         */
        public async Task<GetCmdTaskResponse> GetCmdTaskExAsync(GetCmdTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCmdTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.cmd.task.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
         * Summary: 创建一个应用（服务）运维单
         */
        public CreateAppopsResponse CreateAppops(CreateAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
         * Summary: 创建一个应用（服务）运维单
         */
        public async Task<CreateAppopsResponse> CreateAppopsAsync(CreateAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
         * Summary: 创建一个应用（服务）运维单
         */
        public CreateAppopsResponse CreateAppopsEx(CreateAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppopsResponse>(DoRequest("1.0", "antcloud.deps.appops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个应用运维单，以对一组应用（服务）执行一次运维操作
         * Summary: 创建一个应用（服务）运维单
         */
        public async Task<CreateAppopsResponse> CreateAppopsExAsync(CreateAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppopsResponse>(await DoRequestAsync("1.0", "antcloud.deps.appops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个已经创建成功的运维操作。
         * Summary: 获取运维单
         */
        public GetAppopsResponse GetAppops(GetAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个已经创建成功的运维操作。
         * Summary: 获取运维单
         */
        public async Task<GetAppopsResponse> GetAppopsAsync(GetAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个已经创建成功的运维操作。
         * Summary: 获取运维单
         */
        public GetAppopsResponse GetAppopsEx(GetAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppopsResponse>(DoRequest("1.0", "antcloud.deps.appops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个已经创建成功的运维操作。
         * Summary: 获取运维单
         */
        public async Task<GetAppopsResponse> GetAppopsExAsync(GetAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAppopsResponse>(await DoRequestAsync("1.0", "antcloud.deps.appops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始运维
         */
        public StartAppopsResponse StartAppops(StartAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始运维
         */
        public async Task<StartAppopsResponse> StartAppopsAsync(StartAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始运维
         */
        public StartAppopsResponse StartAppopsEx(StartAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAppopsResponse>(DoRequest("1.0", "antcloud.deps.appops.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行一个已经创建成功的运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始运维
         */
        public async Task<StartAppopsResponse> StartAppopsExAsync(StartAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAppopsResponse>(await DoRequestAsync("1.0", "antcloud.deps.appops.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化运维
         */
        public ReinitAppopsResponse ReinitAppops(ReinitAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化运维
         */
        public async Task<ReinitAppopsResponse> ReinitAppopsAsync(ReinitAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化运维
         */
        public ReinitAppopsResponse ReinitAppopsEx(ReinitAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitAppopsResponse>(DoRequest("1.0", "antcloud.deps.appops.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化一个初始化失败的运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化运维
         */
        public async Task<ReinitAppopsResponse> ReinitAppopsExAsync(ReinitAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitAppopsResponse>(await DoRequestAsync("1.0", "antcloud.deps.appops.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public CancelAppopsResponse CancelAppops(CancelAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 对一个运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public async Task<CancelAppopsResponse> CancelAppopsAsync(CancelAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public CancelAppopsResponse CancelAppopsEx(CancelAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAppopsResponse>(DoRequest("1.0", "antcloud.deps.appops.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public async Task<CancelAppopsResponse> CancelAppopsExAsync(CancelAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAppopsResponse>(await DoRequestAsync("1.0", "antcloud.deps.appops.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试运维
         */
        public RetryAppopsResponse RetryAppops(RetryAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryAppopsEx(request, headers, runtime);
        }

        /**
         * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试运维
         */
        public async Task<RetryAppopsResponse> RetryAppopsAsync(RetryAppopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryAppopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试运维
         */
        public RetryAppopsResponse RetryAppopsEx(RetryAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAppopsResponse>(DoRequest("1.0", "antcloud.deps.appops.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试运维
         */
        public async Task<RetryAppopsResponse> RetryAppopsExAsync(RetryAppopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryAppopsResponse>(await DoRequestAsync("1.0", "antcloud.deps.appops.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
         * Summary: 创建一个机器运维单
         */
        public CreateComputeropsResponse CreateComputerops(CreateComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateComputeropsEx(request, headers, runtime);
        }

        /**
         * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
         * Summary: 创建一个机器运维单
         */
        public async Task<CreateComputeropsResponse> CreateComputeropsAsync(CreateComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateComputeropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
         * Summary: 创建一个机器运维单
         */
        public CreateComputeropsResponse CreateComputeropsEx(CreateComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateComputeropsResponse>(DoRequest("1.0", "antcloud.deps.computerops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建一个机器运维单，以对一组或多组机器执行一次运维操作
         * Summary: 创建一个机器运维单
         */
        public async Task<CreateComputeropsResponse> CreateComputeropsExAsync(CreateComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateComputeropsResponse>(await DoRequestAsync("1.0", "antcloud.deps.computerops.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个已经创建成功的机器运维操作。
         * Summary: 获取运维单
         */
        public GetComputeropsResponse GetComputerops(GetComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetComputeropsEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个已经创建成功的机器运维操作。
         * Summary: 获取运维单
         */
        public async Task<GetComputeropsResponse> GetComputeropsAsync(GetComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetComputeropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个已经创建成功的机器运维操作。
         * Summary: 获取运维单
         */
        public GetComputeropsResponse GetComputeropsEx(GetComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetComputeropsResponse>(DoRequest("1.0", "antcloud.deps.computerops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个已经创建成功的机器运维操作。
         * Summary: 获取运维单
         */
        public async Task<GetComputeropsResponse> GetComputeropsExAsync(GetComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetComputeropsResponse>(await DoRequestAsync("1.0", "antcloud.deps.computerops.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始运维
         */
        public StartComputeropsResponse StartComputerops(StartComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartComputeropsEx(request, headers, runtime);
        }

        /**
         * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始运维
         */
        public async Task<StartComputeropsResponse> StartComputeropsAsync(StartComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartComputeropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始运维
         */
        public StartComputeropsResponse StartComputeropsEx(StartComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartComputeropsResponse>(DoRequest("1.0", "antcloud.deps.computerops.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开始执行一个已经创建成功的机器运维操作。如果此运维单已初始化完成且还未开始执行，则开始执行并返回成功，否则返回失败。
         * Summary: 开始运维
         */
        public async Task<StartComputeropsResponse> StartComputeropsExAsync(StartComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartComputeropsResponse>(await DoRequestAsync("1.0", "antcloud.deps.computerops.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化运维
         */
        public ReinitComputeropsResponse ReinitComputerops(ReinitComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitComputeropsEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化运维
         */
        public async Task<ReinitComputeropsResponse> ReinitComputeropsAsync(ReinitComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitComputeropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化运维
         */
        public ReinitComputeropsResponse ReinitComputeropsEx(ReinitComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitComputeropsResponse>(DoRequest("1.0", "antcloud.deps.computerops.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化一个初始化失败的机器运维单。当运维单处于初始化失败状态时方可执行重新初始化操作。
         * Summary: 重新初始化运维
         */
        public async Task<ReinitComputeropsResponse> ReinitComputeropsExAsync(ReinitComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitComputeropsResponse>(await DoRequestAsync("1.0", "antcloud.deps.computerops.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个机器运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public CancelComputeropsResponse CancelComputerops(CancelComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelComputeropsEx(request, headers, runtime);
        }

        /**
         * Description: 对一个机器运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public async Task<CancelComputeropsResponse> CancelComputeropsAsync(CancelComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelComputeropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个机器运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public CancelComputeropsResponse CancelComputeropsEx(CancelComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelComputeropsResponse>(DoRequest("1.0", "antcloud.deps.computerops.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个机器运维单执行取消操作。
        当运维单处于以下状态时可执行取消操作：
        INITED：初始化完成
        INIT_FAILED：初始化失败
         * Summary: 取消发布
         */
        public async Task<CancelComputeropsResponse> CancelComputeropsExAsync(CancelComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelComputeropsResponse>(await DoRequestAsync("1.0", "antcloud.deps.computerops.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试运维
         */
        public RetryComputeropsResponse RetryComputerops(RetryComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryComputeropsEx(request, headers, runtime);
        }

        /**
         * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试运维
         */
        public async Task<RetryComputeropsResponse> RetryComputeropsAsync(RetryComputeropsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryComputeropsExAsync(request, headers, runtime);
        }

        /**
         * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试运维
         */
        public RetryComputeropsResponse RetryComputeropsEx(RetryComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryComputeropsResponse>(DoRequest("1.0", "antcloud.deps.computerops.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对一个机器运维操作中所有运维失败的分组进行重试操作。
        当运维单处于以下状态时可执行重试操作：
        - FAILED：执行失败
         * Summary: 重试运维
         */
        public async Task<RetryComputeropsResponse> RetryComputeropsExAsync(RetryComputeropsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryComputeropsResponse>(await DoRequestAsync("1.0", "antcloud.deps.computerops.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务的运维历史。
         * Summary: 查询应用服务的运维历史。
         */
        public QueryOpsappsvcResponse QueryOpsappsvc(QueryOpsappsvcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOpsappsvcEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务的运维历史。
         * Summary: 查询应用服务的运维历史。
         */
        public async Task<QueryOpsappsvcResponse> QueryOpsappsvcAsync(QueryOpsappsvcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOpsappsvcExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用服务的运维历史。
         * Summary: 查询应用服务的运维历史。
         */
        public QueryOpsappsvcResponse QueryOpsappsvcEx(QueryOpsappsvcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsappsvcResponse>(DoRequest("1.0", "antcloud.deps.opsappsvc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用服务的运维历史。
         * Summary: 查询应用服务的运维历史。
         */
        public async Task<QueryOpsappsvcResponse> QueryOpsappsvcExAsync(QueryOpsappsvcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOpsappsvcResponse>(await DoRequestAsync("1.0", "antcloud.deps.opsappsvc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步执行Bash命令。
         * Summary: 异步执行Bash命令。
         */
        public AsyncexecuteBashcmdResponse AsyncexecuteBashcmd(AsyncexecuteBashcmdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AsyncexecuteBashcmdEx(request, headers, runtime);
        }

        /**
         * Description: 异步执行Bash命令。
         * Summary: 异步执行Bash命令。
         */
        public async Task<AsyncexecuteBashcmdResponse> AsyncexecuteBashcmdAsync(AsyncexecuteBashcmdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AsyncexecuteBashcmdExAsync(request, headers, runtime);
        }

        /**
         * Description: 异步执行Bash命令。
         * Summary: 异步执行Bash命令。
         */
        public AsyncexecuteBashcmdResponse AsyncexecuteBashcmdEx(AsyncexecuteBashcmdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AsyncexecuteBashcmdResponse>(DoRequest("1.0", "antcloud.deps.bashcmd.asyncexecute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 异步执行Bash命令。
         * Summary: 异步执行Bash命令。
         */
        public async Task<AsyncexecuteBashcmdResponse> AsyncexecuteBashcmdExAsync(AsyncexecuteBashcmdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AsyncexecuteBashcmdResponse>(await DoRequestAsync("1.0", "antcloud.deps.bashcmd.asyncexecute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据异步执行bash命令的任务ID查询结果。
         * Summary: 根据异步执行bash命令的任务ID查询结果。
         */
        public GetBashcmdResultResponse GetBashcmdResult(GetBashcmdResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBashcmdResultEx(request, headers, runtime);
        }

        /**
         * Description: 根据异步执行bash命令的任务ID查询结果。
         * Summary: 根据异步执行bash命令的任务ID查询结果。
         */
        public async Task<GetBashcmdResultResponse> GetBashcmdResultAsync(GetBashcmdResultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBashcmdResultExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据异步执行bash命令的任务ID查询结果。
         * Summary: 根据异步执行bash命令的任务ID查询结果。
         */
        public GetBashcmdResultResponse GetBashcmdResultEx(GetBashcmdResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBashcmdResultResponse>(DoRequest("1.0", "antcloud.deps.bashcmd.result.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据异步执行bash命令的任务ID查询结果。
         * Summary: 根据异步执行bash命令的任务ID查询结果。
         */
        public async Task<GetBashcmdResultResponse> GetBashcmdResultExAsync(GetBashcmdResultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBashcmdResultResponse>(await DoRequestAsync("1.0", "antcloud.deps.bashcmd.result.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前环境是否已开通蓝绿发布
         * Summary: 查询当前环境是否已开通蓝绿发布
         */
        public CheckCloudconfigBgreleaseResponse CheckCloudconfigBgrelease(CheckCloudconfigBgreleaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCloudconfigBgreleaseEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前环境是否已开通蓝绿发布
         * Summary: 查询当前环境是否已开通蓝绿发布
         */
        public async Task<CheckCloudconfigBgreleaseResponse> CheckCloudconfigBgreleaseAsync(CheckCloudconfigBgreleaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCloudconfigBgreleaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前环境是否已开通蓝绿发布
         * Summary: 查询当前环境是否已开通蓝绿发布
         */
        public CheckCloudconfigBgreleaseResponse CheckCloudconfigBgreleaseEx(CheckCloudconfigBgreleaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigBgreleaseResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.bgrelease.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前环境是否已开通蓝绿发布
         * Summary: 查询当前环境是否已开通蓝绿发布
         */
        public async Task<CheckCloudconfigBgreleaseResponse> CheckCloudconfigBgreleaseExAsync(CheckCloudconfigBgreleaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigBgreleaseResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.bgrelease.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否已开通蓝绿发布部署单元
         * Summary: 查询是否已开通蓝绿发布部署单元
         */
        public CheckCloudconfigBgdeploymentcellResponse CheckCloudconfigBgdeploymentcell(CheckCloudconfigBgdeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCloudconfigBgdeploymentcellEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否已开通蓝绿发布部署单元
         * Summary: 查询是否已开通蓝绿发布部署单元
         */
        public async Task<CheckCloudconfigBgdeploymentcellResponse> CheckCloudconfigBgdeploymentcellAsync(CheckCloudconfigBgdeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCloudconfigBgdeploymentcellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否已开通蓝绿发布部署单元
         * Summary: 查询是否已开通蓝绿发布部署单元
         */
        public CheckCloudconfigBgdeploymentcellResponse CheckCloudconfigBgdeploymentcellEx(CheckCloudconfigBgdeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigBgdeploymentcellResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.bgdeploymentcell.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否已开通蓝绿发布部署单元
         * Summary: 查询是否已开通蓝绿发布部署单元
         */
        public async Task<CheckCloudconfigBgdeploymentcellResponse> CheckCloudconfigBgdeploymentcellExAsync(CheckCloudconfigBgdeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigBgdeploymentcellResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.bgdeploymentcell.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否已开通应用服务
         * Summary: 查询是否已开通应用服务
         */
        public CheckCloudconfigAppserviceResponse CheckCloudconfigAppservice(CheckCloudconfigAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCloudconfigAppserviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否已开通应用服务
         * Summary: 查询是否已开通应用服务
         */
        public async Task<CheckCloudconfigAppserviceResponse> CheckCloudconfigAppserviceAsync(CheckCloudconfigAppserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCloudconfigAppserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否已开通应用服务
         * Summary: 查询是否已开通应用服务
         */
        public CheckCloudconfigAppserviceResponse CheckCloudconfigAppserviceEx(CheckCloudconfigAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigAppserviceResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.appservice.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否已开通应用服务
         * Summary: 查询是否已开通应用服务
         */
        public async Task<CheckCloudconfigAppserviceResponse> CheckCloudconfigAppserviceExAsync(CheckCloudconfigAppserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigAppserviceResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.appservice.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否已开通共享中间件
         * Summary: 查询是否已开通共享中间件
         */
        public CheckCloudconfigSharedmwResponse CheckCloudconfigSharedmw(CheckCloudconfigSharedmwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCloudconfigSharedmwEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否已开通共享中间件
         * Summary: 查询是否已开通共享中间件
         */
        public async Task<CheckCloudconfigSharedmwResponse> CheckCloudconfigSharedmwAsync(CheckCloudconfigSharedmwRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCloudconfigSharedmwExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否已开通共享中间件
         * Summary: 查询是否已开通共享中间件
         */
        public CheckCloudconfigSharedmwResponse CheckCloudconfigSharedmwEx(CheckCloudconfigSharedmwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigSharedmwResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.sharedmw.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否已开通共享中间件
         * Summary: 查询是否已开通共享中间件
         */
        public async Task<CheckCloudconfigSharedmwResponse> CheckCloudconfigSharedmwExAsync(CheckCloudconfigSharedmwRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigSharedmwResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.sharedmw.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否使用 v1 发布策略
         * Summary: 查询是否使用 v1 发布策略
         */
        public CheckCloudconfigVonereleaseResponse CheckCloudconfigVonerelease(CheckCloudconfigVonereleaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCloudconfigVonereleaseEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否使用 v1 发布策略
         * Summary: 查询是否使用 v1 发布策略
         */
        public async Task<CheckCloudconfigVonereleaseResponse> CheckCloudconfigVonereleaseAsync(CheckCloudconfigVonereleaseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCloudconfigVonereleaseExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否使用 v1 发布策略
         * Summary: 查询是否使用 v1 发布策略
         */
        public CheckCloudconfigVonereleaseResponse CheckCloudconfigVonereleaseEx(CheckCloudconfigVonereleaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigVonereleaseResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.vonerelease.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否使用 v1 发布策略
         * Summary: 查询是否使用 v1 发布策略
         */
        public async Task<CheckCloudconfigVonereleaseResponse> CheckCloudconfigVonereleaseExAsync(CheckCloudconfigVonereleaseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigVonereleaseResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.vonerelease.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否使用 v1 应用运维策略
         * Summary: 查询是否使用 v1 应用运维策略
         */
        public CheckCloudconfigVoneappopsResponse CheckCloudconfigVoneappops(CheckCloudconfigVoneappopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCloudconfigVoneappopsEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否使用 v1 应用运维策略
         * Summary: 查询是否使用 v1 应用运维策略
         */
        public async Task<CheckCloudconfigVoneappopsResponse> CheckCloudconfigVoneappopsAsync(CheckCloudconfigVoneappopsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCloudconfigVoneappopsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否使用 v1 应用运维策略
         * Summary: 查询是否使用 v1 应用运维策略
         */
        public CheckCloudconfigVoneappopsResponse CheckCloudconfigVoneappopsEx(CheckCloudconfigVoneappopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigVoneappopsResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.voneappops.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否使用 v1 应用运维策略
         * Summary: 查询是否使用 v1 应用运维策略
         */
        public async Task<CheckCloudconfigVoneappopsResponse> CheckCloudconfigVoneappopsExAsync(CheckCloudconfigVoneappopsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigVoneappopsResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.voneappops.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否使用老版本界面
         * Summary: 查询是否使用老版本界面
         */
        public CheckCloudconfigOlduiResponse CheckCloudconfigOldui(CheckCloudconfigOlduiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCloudconfigOlduiEx(request, headers, runtime);
        }

        /**
         * Description: 查询是否使用老版本界面
         * Summary: 查询是否使用老版本界面
         */
        public async Task<CheckCloudconfigOlduiResponse> CheckCloudconfigOlduiAsync(CheckCloudconfigOlduiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCloudconfigOlduiExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询是否使用老版本界面
         * Summary: 查询是否使用老版本界面
         */
        public CheckCloudconfigOlduiResponse CheckCloudconfigOlduiEx(CheckCloudconfigOlduiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigOlduiResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.oldui.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询是否使用老版本界面
         * Summary: 查询是否使用老版本界面
         */
        public async Task<CheckCloudconfigOlduiResponse> CheckCloudconfigOlduiExAsync(CheckCloudconfigOlduiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigOlduiResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.oldui.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 是否禁用 XDC LB
         * Summary: 是否禁用 XDC LB
         */
        public CheckCloudconfigXdclbforbiddenResponse CheckCloudconfigXdclbforbidden(CheckCloudconfigXdclbforbiddenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckCloudconfigXdclbforbiddenEx(request, headers, runtime);
        }

        /**
         * Description: 是否禁用 XDC LB
         * Summary: 是否禁用 XDC LB
         */
        public async Task<CheckCloudconfigXdclbforbiddenResponse> CheckCloudconfigXdclbforbiddenAsync(CheckCloudconfigXdclbforbiddenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckCloudconfigXdclbforbiddenExAsync(request, headers, runtime);
        }

        /**
         * Description: 是否禁用 XDC LB
         * Summary: 是否禁用 XDC LB
         */
        public CheckCloudconfigXdclbforbiddenResponse CheckCloudconfigXdclbforbiddenEx(CheckCloudconfigXdclbforbiddenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigXdclbforbiddenResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.xdclbforbidden.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 是否禁用 XDC LB
         * Summary: 是否禁用 XDC LB
         */
        public async Task<CheckCloudconfigXdclbforbiddenResponse> CheckCloudconfigXdclbforbiddenExAsync(CheckCloudconfigXdclbforbiddenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckCloudconfigXdclbforbiddenResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.xdclbforbidden.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 openapi 配置信息
         * Summary: 查询 openapi 配置信息
         */
        public QueryCloudconfigOpenapiconfigResponse QueryCloudconfigOpenapiconfig(QueryCloudconfigOpenapiconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryCloudconfigOpenapiconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询 openapi 配置信息
         * Summary: 查询 openapi 配置信息
         */
        public async Task<QueryCloudconfigOpenapiconfigResponse> QueryCloudconfigOpenapiconfigAsync(QueryCloudconfigOpenapiconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryCloudconfigOpenapiconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询 openapi 配置信息
         * Summary: 查询 openapi 配置信息
         */
        public QueryCloudconfigOpenapiconfigResponse QueryCloudconfigOpenapiconfigEx(QueryCloudconfigOpenapiconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCloudconfigOpenapiconfigResponse>(DoRequest("1.0", "antcloud.deps.cloudconfig.openapiconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 openapi 配置信息
         * Summary: 查询 openapi 配置信息
         */
        public async Task<QueryCloudconfigOpenapiconfigResponse> QueryCloudconfigOpenapiconfigExAsync(QueryCloudconfigOpenapiconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryCloudconfigOpenapiconfigResponse>(await DoRequestAsync("1.0", "antcloud.deps.cloudconfig.openapiconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用包个数
         * Summary: 查询应用包个数
         */
        public CountAppsPkgResponse CountAppsPkg(CountAppsPkgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountAppsPkgEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用包个数
         * Summary: 查询应用包个数
         */
        public async Task<CountAppsPkgResponse> CountAppsPkgAsync(CountAppsPkgRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountAppsPkgExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用包个数
         * Summary: 查询应用包个数
         */
        public CountAppsPkgResponse CountAppsPkgEx(CountAppsPkgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountAppsPkgResponse>(DoRequest("1.0", "antcloud.deps.apps.pkg.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用包个数
         * Summary: 查询应用包个数
         */
        public async Task<CountAppsPkgResponse> CountAppsPkgExAsync(CountAppsPkgRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountAppsPkgResponse>(await DoRequestAsync("1.0", "antcloud.deps.apps.pkg.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询app下的资源统计
         * Summary: 查询app下的资源统计
         */
        public QueryAppUnitresourcesResponse QueryAppUnitresources(QueryAppUnitresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAppUnitresourcesEx(request, headers, runtime);
        }

        /**
         * Description: 查询app下的资源统计
         * Summary: 查询app下的资源统计
         */
        public async Task<QueryAppUnitresourcesResponse> QueryAppUnitresourcesAsync(QueryAppUnitresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAppUnitresourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询app下的资源统计
         * Summary: 查询app下的资源统计
         */
        public QueryAppUnitresourcesResponse QueryAppUnitresourcesEx(QueryAppUnitresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppUnitresourcesResponse>(DoRequest("1.0", "antcloud.deps.app.unitresources.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询app下的资源统计
         * Summary: 查询app下的资源统计
         */
        public async Task<QueryAppUnitresourcesResponse> QueryAppUnitresourcesExAsync(QueryAppUnitresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAppUnitresourcesResponse>(await DoRequestAsync("1.0", "antcloud.deps.app.unitresources.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证 token
         * Summary: 查询认证 token
         */
        public QueryOauthTokenResponse QueryOauthToken(QueryOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOauthTokenEx(request, headers, runtime);
        }

        /**
         * Description: 查询认证 token
         * Summary: 查询认证 token
         */
        public async Task<QueryOauthTokenResponse> QueryOauthTokenAsync(QueryOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOauthTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询认证 token
         * Summary: 查询认证 token
         */
        public QueryOauthTokenResponse QueryOauthTokenEx(QueryOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOauthTokenResponse>(DoRequest("1.0", "antcloud.deps.oauth.token.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询认证 token
         * Summary: 查询认证 token
         */
        public async Task<QueryOauthTokenResponse> QueryOauthTokenExAsync(QueryOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOauthTokenResponse>(await DoRequestAsync("1.0", "antcloud.deps.oauth.token.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建或更新 token
         * Summary: 创建或更新 token
         */
        public UpdateOauthTokenResponse UpdateOauthToken(UpdateOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateOauthTokenEx(request, headers, runtime);
        }

        /**
         * Description: 创建或更新 token
         * Summary: 创建或更新 token
         */
        public async Task<UpdateOauthTokenResponse> UpdateOauthTokenAsync(UpdateOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateOauthTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建或更新 token
         * Summary: 创建或更新 token
         */
        public UpdateOauthTokenResponse UpdateOauthTokenEx(UpdateOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOauthTokenResponse>(DoRequest("1.0", "antcloud.deps.oauth.token.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建或更新 token
         * Summary: 创建或更新 token
         */
        public async Task<UpdateOauthTokenResponse> UpdateOauthTokenExAsync(UpdateOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOauthTokenResponse>(await DoRequestAsync("1.0", "antcloud.deps.oauth.token.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除 token
         * Summary: 删除 token
         */
        public DeleteOauthTokenResponse DeleteOauthToken(DeleteOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteOauthTokenEx(request, headers, runtime);
        }

        /**
         * Description: 删除 token
         * Summary: 删除 token
         */
        public async Task<DeleteOauthTokenResponse> DeleteOauthTokenAsync(DeleteOauthTokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteOauthTokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除 token
         * Summary: 删除 token
         */
        public DeleteOauthTokenResponse DeleteOauthTokenEx(DeleteOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteOauthTokenResponse>(DoRequest("1.0", "antcloud.deps.oauth.token.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除 token
         * Summary: 删除 token
         */
        public async Task<DeleteOauthTokenResponse> DeleteOauthTokenExAsync(DeleteOauthTokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteOauthTokenResponse>(await DoRequestAsync("1.0", "antcloud.deps.oauth.token.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 DZ
         * Summary: 查询 DZ
         */
        public QueryBaseinfoDeploymentzonesResponse QueryBaseinfoDeploymentzones(QueryBaseinfoDeploymentzonesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaseinfoDeploymentzonesEx(request, headers, runtime);
        }

        /**
         * Description: 查询 DZ
         * Summary: 查询 DZ
         */
        public async Task<QueryBaseinfoDeploymentzonesResponse> QueryBaseinfoDeploymentzonesAsync(QueryBaseinfoDeploymentzonesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaseinfoDeploymentzonesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询 DZ
         * Summary: 查询 DZ
         */
        public QueryBaseinfoDeploymentzonesResponse QueryBaseinfoDeploymentzonesEx(QueryBaseinfoDeploymentzonesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaseinfoDeploymentzonesResponse>(DoRequest("1.0", "antcloud.deps.baseinfo.deploymentzones.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 DZ
         * Summary: 查询 DZ
         */
        public async Task<QueryBaseinfoDeploymentzonesResponse> QueryBaseinfoDeploymentzonesExAsync(QueryBaseinfoDeploymentzonesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaseinfoDeploymentzonesResponse>(await DoRequestAsync("1.0", "antcloud.deps.baseinfo.deploymentzones.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取蓝绿发布概览
         * Summary: 获取蓝绿发布概览
         */
        public GetBgreleaseArrangementResponse GetBgreleaseArrangement(GetBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 获取蓝绿发布概览
         * Summary: 获取蓝绿发布概览
         */
        public async Task<GetBgreleaseArrangementResponse> GetBgreleaseArrangementAsync(GetBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取蓝绿发布概览
         * Summary: 获取蓝绿发布概览
         */
        public GetBgreleaseArrangementResponse GetBgreleaseArrangementEx(GetBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取蓝绿发布概览
         * Summary: 获取蓝绿发布概览
         */
        public async Task<GetBgreleaseArrangementResponse> GetBgreleaseArrangementExAsync(GetBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询蓝绿发布概览
         * Summary: 查询蓝绿发布概览
         */
        public QueryBgreleaseArrangementResponse QueryBgreleaseArrangement(QueryBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 查询蓝绿发布概览
         * Summary: 查询蓝绿发布概览
         */
        public async Task<QueryBgreleaseArrangementResponse> QueryBgreleaseArrangementAsync(QueryBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询蓝绿发布概览
         * Summary: 查询蓝绿发布概览
         */
        public QueryBgreleaseArrangementResponse QueryBgreleaseArrangementEx(QueryBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询蓝绿发布概览
         * Summary: 查询蓝绿发布概览
         */
        public async Task<QueryBgreleaseArrangementResponse> QueryBgreleaseArrangementExAsync(QueryBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询蓝绿发布进度
         * Summary: 查询蓝绿发布进度
         */
        public QueryBgreleaseArrangementprogressResponse QueryBgreleaseArrangementprogress(QueryBgreleaseArrangementprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBgreleaseArrangementprogressEx(request, headers, runtime);
        }

        /**
         * Description: 查询蓝绿发布进度
         * Summary: 查询蓝绿发布进度
         */
        public async Task<QueryBgreleaseArrangementprogressResponse> QueryBgreleaseArrangementprogressAsync(QueryBgreleaseArrangementprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBgreleaseArrangementprogressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询蓝绿发布进度
         * Summary: 查询蓝绿发布进度
         */
        public QueryBgreleaseArrangementprogressResponse QueryBgreleaseArrangementprogressEx(QueryBgreleaseArrangementprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBgreleaseArrangementprogressResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangementprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询蓝绿发布进度
         * Summary: 查询蓝绿发布进度
         */
        public async Task<QueryBgreleaseArrangementprogressResponse> QueryBgreleaseArrangementprogressExAsync(QueryBgreleaseArrangementprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBgreleaseArrangementprogressResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangementprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询蓝绿发布任务进度
         * Summary: 查询蓝绿发布任务进度
         */
        public QueryBgreleaseTaskprogressResponse QueryBgreleaseTaskprogress(QueryBgreleaseTaskprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBgreleaseTaskprogressEx(request, headers, runtime);
        }

        /**
         * Description: 查询蓝绿发布任务进度
         * Summary: 查询蓝绿发布任务进度
         */
        public async Task<QueryBgreleaseTaskprogressResponse> QueryBgreleaseTaskprogressAsync(QueryBgreleaseTaskprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBgreleaseTaskprogressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询蓝绿发布任务进度
         * Summary: 查询蓝绿发布任务进度
         */
        public QueryBgreleaseTaskprogressResponse QueryBgreleaseTaskprogressEx(QueryBgreleaseTaskprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBgreleaseTaskprogressResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.taskprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询蓝绿发布任务进度
         * Summary: 查询蓝绿发布任务进度
         */
        public async Task<QueryBgreleaseTaskprogressResponse> QueryBgreleaseTaskprogressExAsync(QueryBgreleaseTaskprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBgreleaseTaskprogressResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.taskprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行蓝绿发布
         * Summary: 执行蓝绿发布
         */
        public ExecBgreleaseArrangementResponse ExecBgreleaseArrangement(ExecBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 执行蓝绿发布
         * Summary: 执行蓝绿发布
         */
        public async Task<ExecBgreleaseArrangementResponse> ExecBgreleaseArrangementAsync(ExecBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行蓝绿发布
         * Summary: 执行蓝绿发布
         */
        public ExecBgreleaseArrangementResponse ExecBgreleaseArrangementEx(ExecBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行蓝绿发布
         * Summary: 执行蓝绿发布
         */
        public async Task<ExecBgreleaseArrangementResponse> ExecBgreleaseArrangementExAsync(ExecBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 验证确认蓝绿发布
         * Summary: 验证确认蓝绿发布
         */
        public ConfirmBgreleaseArrangementResponse ConfirmBgreleaseArrangement(ConfirmBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 验证确认蓝绿发布
         * Summary: 验证确认蓝绿发布
         */
        public async Task<ConfirmBgreleaseArrangementResponse> ConfirmBgreleaseArrangementAsync(ConfirmBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 验证确认蓝绿发布
         * Summary: 验证确认蓝绿发布
         */
        public ConfirmBgreleaseArrangementResponse ConfirmBgreleaseArrangementEx(ConfirmBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 验证确认蓝绿发布
         * Summary: 验证确认蓝绿发布
         */
        public async Task<ConfirmBgreleaseArrangementResponse> ConfirmBgreleaseArrangementExAsync(ConfirmBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿验证确认
         * Summary: 蓝绿验证确认
         */
        public ConfirmBgreleaseArrangementvalidationResponse ConfirmBgreleaseArrangementvalidation(ConfirmBgreleaseArrangementvalidationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmBgreleaseArrangementvalidationEx(request, headers, runtime);
        }

        /**
         * Description: 蓝绿验证确认
         * Summary: 蓝绿验证确认
         */
        public async Task<ConfirmBgreleaseArrangementvalidationResponse> ConfirmBgreleaseArrangementvalidationAsync(ConfirmBgreleaseArrangementvalidationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmBgreleaseArrangementvalidationExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝绿验证确认
         * Summary: 蓝绿验证确认
         */
        public ConfirmBgreleaseArrangementvalidationResponse ConfirmBgreleaseArrangementvalidationEx(ConfirmBgreleaseArrangementvalidationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmBgreleaseArrangementvalidationResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangementvalidation.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿验证确认
         * Summary: 蓝绿验证确认
         */
        public async Task<ConfirmBgreleaseArrangementvalidationResponse> ConfirmBgreleaseArrangementvalidationExAsync(ConfirmBgreleaseArrangementvalidationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmBgreleaseArrangementvalidationResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangementvalidation.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试蓝绿发布
         * Summary: 重试蓝绿发布
         */
        public RetryBgreleaseArrangementResponse RetryBgreleaseArrangement(RetryBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 重试蓝绿发布
         * Summary: 重试蓝绿发布
         */
        public async Task<RetryBgreleaseArrangementResponse> RetryBgreleaseArrangementAsync(RetryBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试蓝绿发布
         * Summary: 重试蓝绿发布
         */
        public RetryBgreleaseArrangementResponse RetryBgreleaseArrangementEx(RetryBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试蓝绿发布
         * Summary: 重试蓝绿发布
         */
        public async Task<RetryBgreleaseArrangementResponse> RetryBgreleaseArrangementExAsync(RetryBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试蓝绿发布任务
         * Summary: 重试蓝绿发布任务
         */
        public RetryBgreleaseTaskResponse RetryBgreleaseTask(RetryBgreleaseTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryBgreleaseTaskEx(request, headers, runtime);
        }

        /**
         * Description: 重试蓝绿发布任务
         * Summary: 重试蓝绿发布任务
         */
        public async Task<RetryBgreleaseTaskResponse> RetryBgreleaseTaskAsync(RetryBgreleaseTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryBgreleaseTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试蓝绿发布任务
         * Summary: 重试蓝绿发布任务
         */
        public RetryBgreleaseTaskResponse RetryBgreleaseTaskEx(RetryBgreleaseTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryBgreleaseTaskResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.task.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试蓝绿发布任务
         * Summary: 重试蓝绿发布任务
         */
        public async Task<RetryBgreleaseTaskResponse> RetryBgreleaseTaskExAsync(RetryBgreleaseTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryBgreleaseTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.task.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跳过蓝绿发布任务
         * Summary: 跳过蓝绿发布任务
         */
        public SkipBgreleaseTaskResponse SkipBgreleaseTask(SkipBgreleaseTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipBgreleaseTaskEx(request, headers, runtime);
        }

        /**
         * Description: 跳过蓝绿发布任务
         * Summary: 跳过蓝绿发布任务
         */
        public async Task<SkipBgreleaseTaskResponse> SkipBgreleaseTaskAsync(SkipBgreleaseTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipBgreleaseTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 跳过蓝绿发布任务
         * Summary: 跳过蓝绿发布任务
         */
        public SkipBgreleaseTaskResponse SkipBgreleaseTaskEx(SkipBgreleaseTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipBgreleaseTaskResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.task.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跳过蓝绿发布任务
         * Summary: 跳过蓝绿发布任务
         */
        public async Task<SkipBgreleaseTaskResponse> SkipBgreleaseTaskExAsync(SkipBgreleaseTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipBgreleaseTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.task.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跳过蓝绿发布
         * Summary: 跳过蓝绿发布
         */
        public SkipBgreleaseArrangementResponse SkipBgreleaseArrangement(SkipBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 跳过蓝绿发布
         * Summary: 跳过蓝绿发布
         */
        public async Task<SkipBgreleaseArrangementResponse> SkipBgreleaseArrangementAsync(SkipBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 跳过蓝绿发布
         * Summary: 跳过蓝绿发布
         */
        public SkipBgreleaseArrangementResponse SkipBgreleaseArrangementEx(SkipBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跳过蓝绿发布
         * Summary: 跳过蓝绿发布
         */
        public async Task<SkipBgreleaseArrangementResponse> SkipBgreleaseArrangementExAsync(SkipBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消蓝绿发布
         * Summary: 取消蓝绿发布
         */
        public CancelBgreleaseArrangementResponse CancelBgreleaseArrangement(CancelBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 取消蓝绿发布
         * Summary: 取消蓝绿发布
         */
        public async Task<CancelBgreleaseArrangementResponse> CancelBgreleaseArrangementAsync(CancelBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消蓝绿发布
         * Summary: 取消蓝绿发布
         */
        public CancelBgreleaseArrangementResponse CancelBgreleaseArrangementEx(CancelBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消蓝绿发布
         * Summary: 取消蓝绿发布
         */
        public async Task<CancelBgreleaseArrangementResponse> CancelBgreleaseArrangementExAsync(CancelBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚蓝绿发布
         * Summary: 回滚蓝绿发布
         */
        public RollbackBgreleaseArrangementResponse RollbackBgreleaseArrangement(RollbackBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 回滚蓝绿发布
         * Summary: 回滚蓝绿发布
         */
        public async Task<RollbackBgreleaseArrangementResponse> RollbackBgreleaseArrangementAsync(RollbackBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚蓝绿发布
         * Summary: 回滚蓝绿发布
         */
        public RollbackBgreleaseArrangementResponse RollbackBgreleaseArrangementEx(RollbackBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚蓝绿发布
         * Summary: 回滚蓝绿发布
         */
        public async Task<RollbackBgreleaseArrangementResponse> RollbackBgreleaseArrangementExAsync(RollbackBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布回滚重试
         * Summary: 蓝绿发布回滚重试
         */
        public RetryrollbackBgreleaseArrangementResponse RetryrollbackBgreleaseArrangement(RetryrollbackBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryrollbackBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布回滚重试
         * Summary: 蓝绿发布回滚重试
         */
        public async Task<RetryrollbackBgreleaseArrangementResponse> RetryrollbackBgreleaseArrangementAsync(RetryrollbackBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryrollbackBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布回滚重试
         * Summary: 蓝绿发布回滚重试
         */
        public RetryrollbackBgreleaseArrangementResponse RetryrollbackBgreleaseArrangementEx(RetryrollbackBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryrollbackBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.retryrollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布回滚重试
         * Summary: 蓝绿发布回滚重试
         */
        public async Task<RetryrollbackBgreleaseArrangementResponse> RetryrollbackBgreleaseArrangementExAsync(RetryrollbackBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryrollbackBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.retryrollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布回滚确认
         * Summary: 蓝绿发布回滚确认
         */
        public ConfirmrollbackBgreleaseArrangementResponse ConfirmrollbackBgreleaseArrangement(ConfirmrollbackBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmrollbackBgreleaseArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布回滚确认
         * Summary: 蓝绿发布回滚确认
         */
        public async Task<ConfirmrollbackBgreleaseArrangementResponse> ConfirmrollbackBgreleaseArrangementAsync(ConfirmrollbackBgreleaseArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmrollbackBgreleaseArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布回滚确认
         * Summary: 蓝绿发布回滚确认
         */
        public ConfirmrollbackBgreleaseArrangementResponse ConfirmrollbackBgreleaseArrangementEx(ConfirmrollbackBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmrollbackBgreleaseArrangementResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.arrangement.confirmrollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布回滚确认
         * Summary: 蓝绿发布回滚确认
         */
        public async Task<ConfirmrollbackBgreleaseArrangementResponse> ConfirmrollbackBgreleaseArrangementExAsync(ConfirmrollbackBgreleaseArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmrollbackBgreleaseArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.arrangement.confirmrollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布灰度流量迁移
         * Summary: 蓝绿发布灰度流量迁移
         */
        public SwitchBgreleaseGraytrafficResponse SwitchBgreleaseGraytraffic(SwitchBgreleaseGraytrafficRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SwitchBgreleaseGraytrafficEx(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布灰度流量迁移
         * Summary: 蓝绿发布灰度流量迁移
         */
        public async Task<SwitchBgreleaseGraytrafficResponse> SwitchBgreleaseGraytrafficAsync(SwitchBgreleaseGraytrafficRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SwitchBgreleaseGraytrafficExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布灰度流量迁移
         * Summary: 蓝绿发布灰度流量迁移
         */
        public SwitchBgreleaseGraytrafficResponse SwitchBgreleaseGraytrafficEx(SwitchBgreleaseGraytrafficRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchBgreleaseGraytrafficResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.graytraffic.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布灰度流量迁移
         * Summary: 蓝绿发布灰度流量迁移
         */
        public async Task<SwitchBgreleaseGraytrafficResponse> SwitchBgreleaseGraytrafficExAsync(SwitchBgreleaseGraytrafficRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchBgreleaseGraytrafficResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.graytraffic.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布灰度流量回滚
         * Summary: 蓝绿发布灰度流量回滚
         */
        public RollbackBgreleaseGraytrafficResponse RollbackBgreleaseGraytraffic(RollbackBgreleaseGraytrafficRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackBgreleaseGraytrafficEx(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布灰度流量回滚
         * Summary: 蓝绿发布灰度流量回滚
         */
        public async Task<RollbackBgreleaseGraytrafficResponse> RollbackBgreleaseGraytrafficAsync(RollbackBgreleaseGraytrafficRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackBgreleaseGraytrafficExAsync(request, headers, runtime);
        }

        /**
         * Description: 蓝绿发布灰度流量回滚
         * Summary: 蓝绿发布灰度流量回滚
         */
        public RollbackBgreleaseGraytrafficResponse RollbackBgreleaseGraytrafficEx(RollbackBgreleaseGraytrafficRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackBgreleaseGraytrafficResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.graytraffic.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蓝绿发布灰度流量回滚
         * Summary: 蓝绿发布灰度流量回滚
         */
        public async Task<RollbackBgreleaseGraytrafficResponse> RollbackBgreleaseGraytrafficExAsync(RollbackBgreleaseGraytrafficRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackBgreleaseGraytrafficResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.graytraffic.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询灰度引流进度
         * Summary: 查询灰度引流进度
         */
        public QueryBgreleaseGrayprogressResponse QueryBgreleaseGrayprogress(QueryBgreleaseGrayprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBgreleaseGrayprogressEx(request, headers, runtime);
        }

        /**
         * Description: 查询灰度引流进度
         * Summary: 查询灰度引流进度
         */
        public async Task<QueryBgreleaseGrayprogressResponse> QueryBgreleaseGrayprogressAsync(QueryBgreleaseGrayprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBgreleaseGrayprogressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询灰度引流进度
         * Summary: 查询灰度引流进度
         */
        public QueryBgreleaseGrayprogressResponse QueryBgreleaseGrayprogressEx(QueryBgreleaseGrayprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBgreleaseGrayprogressResponse>(DoRequest("1.0", "antcloud.deps.bgrelease.grayprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询灰度引流进度
         * Summary: 查询灰度引流进度
         */
        public async Task<QueryBgreleaseGrayprogressResponse> QueryBgreleaseGrayprogressExAsync(QueryBgreleaseGrayprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBgreleaseGrayprogressResponse>(await DoRequestAsync("1.0", "antcloud.deps.bgrelease.grayprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取灰度引流进度
         * Summary: 获取灰度引流进度
         */
        public GetGrayProcessResponse GetGrayProcess(GetGrayProcessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGrayProcessEx(request, headers, runtime);
        }

        /**
         * Description: 获取灰度引流进度
         * Summary: 获取灰度引流进度
         */
        public async Task<GetGrayProcessResponse> GetGrayProcessAsync(GetGrayProcessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGrayProcessExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取灰度引流进度
         * Summary: 获取灰度引流进度
         */
        public GetGrayProcessResponse GetGrayProcessEx(GetGrayProcessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGrayProcessResponse>(DoRequest("1.0", "antcloud.deps.gray.process.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取灰度引流进度
         * Summary: 获取灰度引流进度
         */
        public async Task<GetGrayProcessResponse> GetGrayProcessExAsync(GetGrayProcessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGrayProcessResponse>(await DoRequestAsync("1.0", "antcloud.deps.gray.process.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询灰度引流进度
         * Summary: 查询灰度引流进度
         */
        public QueryGrayProgressResponse QueryGrayProgress(QueryGrayProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGrayProgressEx(request, headers, runtime);
        }

        /**
         * Description: 查询灰度引流进度
         * Summary: 查询灰度引流进度
         */
        public async Task<QueryGrayProgressResponse> QueryGrayProgressAsync(QueryGrayProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGrayProgressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询灰度引流进度
         * Summary: 查询灰度引流进度
         */
        public QueryGrayProgressResponse QueryGrayProgressEx(QueryGrayProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGrayProgressResponse>(DoRequest("1.0", "antcloud.deps.gray.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询灰度引流进度
         * Summary: 查询灰度引流进度
         */
        public async Task<QueryGrayProgressResponse> QueryGrayProgressExAsync(QueryGrayProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGrayProgressResponse>(await DoRequestAsync("1.0", "antcloud.deps.gray.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化灰度发布
         * Summary: 重新初始化灰度发布
         */
        public ReinitGrayProcessResponse ReinitGrayProcess(ReinitGrayProcessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitGrayProcessEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化灰度发布
         * Summary: 重新初始化灰度发布
         */
        public async Task<ReinitGrayProcessResponse> ReinitGrayProcessAsync(ReinitGrayProcessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitGrayProcessExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化灰度发布
         * Summary: 重新初始化灰度发布
         */
        public ReinitGrayProcessResponse ReinitGrayProcessEx(ReinitGrayProcessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitGrayProcessResponse>(DoRequest("1.0", "antcloud.deps.gray.process.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化灰度发布
         * Summary: 重新初始化灰度发布
         */
        public async Task<ReinitGrayProcessResponse> ReinitGrayProcessExAsync(ReinitGrayProcessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitGrayProcessResponse>(await DoRequestAsync("1.0", "antcloud.deps.gray.process.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试灰度发布子任务
         * Summary: 重试灰度发布子任务
         */
        public RetryGrayTaskResponse RetryGrayTask(RetryGrayTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryGrayTaskEx(request, headers, runtime);
        }

        /**
         * Description: 重试灰度发布子任务
         * Summary: 重试灰度发布子任务
         */
        public async Task<RetryGrayTaskResponse> RetryGrayTaskAsync(RetryGrayTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryGrayTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试灰度发布子任务
         * Summary: 重试灰度发布子任务
         */
        public RetryGrayTaskResponse RetryGrayTaskEx(RetryGrayTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryGrayTaskResponse>(DoRequest("1.0", "antcloud.deps.gray.task.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试灰度发布子任务
         * Summary: 重试灰度发布子任务
         */
        public async Task<RetryGrayTaskResponse> RetryGrayTaskExAsync(RetryGrayTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryGrayTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.gray.task.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跳过灰度发布子任务
         * Summary: 跳过灰度发布子任务
         */
        public SkipGrayTaskResponse SkipGrayTask(SkipGrayTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipGrayTaskEx(request, headers, runtime);
        }

        /**
         * Description: 跳过灰度发布子任务
         * Summary: 跳过灰度发布子任务
         */
        public async Task<SkipGrayTaskResponse> SkipGrayTaskAsync(SkipGrayTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipGrayTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 跳过灰度发布子任务
         * Summary: 跳过灰度发布子任务
         */
        public SkipGrayTaskResponse SkipGrayTaskEx(SkipGrayTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipGrayTaskResponse>(DoRequest("1.0", "antcloud.deps.gray.task.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 跳过灰度发布子任务
         * Summary: 跳过灰度发布子任务
         */
        public async Task<SkipGrayTaskResponse> SkipGrayTaskExAsync(SkipGrayTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipGrayTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.gray.task.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布机器信息
         * Summary: 查询发布机器信息
         */
        public QueryMachineResponse QueryMachine(QueryMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMachineEx(request, headers, runtime);
        }

        /**
         * Description: 查询发布机器信息
         * Summary: 查询发布机器信息
         */
        public async Task<QueryMachineResponse> QueryMachineAsync(QueryMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发布机器信息
         * Summary: 查询发布机器信息
         */
        public QueryMachineResponse QueryMachineEx(QueryMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachineResponse>(DoRequest("1.0", "antcloud.deps.machine.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布机器信息
         * Summary: 查询发布机器信息
         */
        public async Task<QueryMachineResponse> QueryMachineExAsync(QueryMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachineResponse>(await DoRequestAsync("1.0", "antcloud.deps.machine.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布机器信息
         * Summary: 获取发布机器信息
         */
        public GetMachineResponse GetMachine(GetMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMachineEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布机器信息
         * Summary: 获取发布机器信息
         */
        public async Task<GetMachineResponse> GetMachineAsync(GetMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布机器信息
         * Summary: 获取发布机器信息
         */
        public GetMachineResponse GetMachineEx(GetMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMachineResponse>(DoRequest("1.0", "antcloud.deps.machine.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布机器信息
         * Summary: 获取发布机器信息
         */
        public async Task<GetMachineResponse> GetMachineExAsync(GetMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMachineResponse>(await DoRequestAsync("1.0", "antcloud.deps.machine.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询机器发布进度
         * Summary: 查询机器发布进度
         */
        public QueryMachineProgressResponse QueryMachineProgress(QueryMachineProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMachineProgressEx(request, headers, runtime);
        }

        /**
         * Description: 查询机器发布进度
         * Summary: 查询机器发布进度
         */
        public async Task<QueryMachineProgressResponse> QueryMachineProgressAsync(QueryMachineProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMachineProgressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询机器发布进度
         * Summary: 查询机器发布进度
         */
        public QueryMachineProgressResponse QueryMachineProgressEx(QueryMachineProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachineProgressResponse>(DoRequest("1.0", "antcloud.deps.machine.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询机器发布进度
         * Summary: 查询机器发布进度
         */
        public async Task<QueryMachineProgressResponse> QueryMachineProgressExAsync(QueryMachineProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachineProgressResponse>(await DoRequestAsync("1.0", "antcloud.deps.machine.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试发布机器
         * Summary: 重试发布机器
         */
        public RetryMachineResponse RetryMachine(RetryMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryMachineEx(request, headers, runtime);
        }

        /**
         * Description: 重试发布机器
         * Summary: 重试发布机器
         */
        public async Task<RetryMachineResponse> RetryMachineAsync(RetryMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryMachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试发布机器
         * Summary: 重试发布机器
         */
        public RetryMachineResponse RetryMachineEx(RetryMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryMachineResponse>(DoRequest("1.0", "antcloud.deps.machine.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试发布机器
         * Summary: 重试发布机器
         */
        public async Task<RetryMachineResponse> RetryMachineExAsync(RetryMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryMachineResponse>(await DoRequestAsync("1.0", "antcloud.deps.machine.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略机器发布
         * Summary: 忽略机器发布
         */
        public SkipMachineResponse SkipMachine(SkipMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipMachineEx(request, headers, runtime);
        }

        /**
         * Description: 忽略机器发布
         * Summary: 忽略机器发布
         */
        public async Task<SkipMachineResponse> SkipMachineAsync(SkipMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipMachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 忽略机器发布
         * Summary: 忽略机器发布
         */
        public SkipMachineResponse SkipMachineEx(SkipMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipMachineResponse>(DoRequest("1.0", "antcloud.deps.machine.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略机器发布
         * Summary: 忽略机器发布
         */
        public async Task<SkipMachineResponse> SkipMachineExAsync(SkipMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipMachineResponse>(await DoRequestAsync("1.0", "antcloud.deps.machine.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消机器发布
         * Summary: 取消机器发布
         */
        public CancelMachineResponse CancelMachine(CancelMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelMachineEx(request, headers, runtime);
        }

        /**
         * Description: 取消机器发布
         * Summary: 取消机器发布
         */
        public async Task<CancelMachineResponse> CancelMachineAsync(CancelMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelMachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消机器发布
         * Summary: 取消机器发布
         */
        public CancelMachineResponse CancelMachineEx(CancelMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelMachineResponse>(DoRequest("1.0", "antcloud.deps.machine.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消机器发布
         * Summary: 取消机器发布
         */
        public async Task<CancelMachineResponse> CancelMachineExAsync(CancelMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelMachineResponse>(await DoRequestAsync("1.0", "antcloud.deps.machine.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 触发执行机器发布
         * Summary: 触发执行机器发布
         */
        public ExecMachineResponse ExecMachine(ExecMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecMachineEx(request, headers, runtime);
        }

        /**
         * Description: 触发执行机器发布
         * Summary: 触发执行机器发布
         */
        public async Task<ExecMachineResponse> ExecMachineAsync(ExecMachineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecMachineExAsync(request, headers, runtime);
        }

        /**
         * Description: 触发执行机器发布
         * Summary: 触发执行机器发布
         */
        public ExecMachineResponse ExecMachineEx(ExecMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMachineResponse>(DoRequest("1.0", "antcloud.deps.machine.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 触发执行机器发布
         * Summary: 触发执行机器发布
         */
        public async Task<ExecMachineResponse> ExecMachineExAsync(ExecMachineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecMachineResponse>(await DoRequestAsync("1.0", "antcloud.deps.machine.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询机器分组发布进度
         * Summary: 查询机器分组发布进度
         */
        public QueryMachinegroupProgressResponse QueryMachinegroupProgress(QueryMachinegroupProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMachinegroupProgressEx(request, headers, runtime);
        }

        /**
         * Description: 查询机器分组发布进度
         * Summary: 查询机器分组发布进度
         */
        public async Task<QueryMachinegroupProgressResponse> QueryMachinegroupProgressAsync(QueryMachinegroupProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMachinegroupProgressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询机器分组发布进度
         * Summary: 查询机器分组发布进度
         */
        public QueryMachinegroupProgressResponse QueryMachinegroupProgressEx(QueryMachinegroupProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachinegroupProgressResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询机器分组发布进度
         * Summary: 查询机器分组发布进度
         */
        public async Task<QueryMachinegroupProgressResponse> QueryMachinegroupProgressExAsync(QueryMachinegroupProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachinegroupProgressResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试机器分组
         * Summary: 重试机器分组
         */
        public RetryMachinegroupResponse RetryMachinegroup(RetryMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 重试机器分组
         * Summary: 重试机器分组
         */
        public async Task<RetryMachinegroupResponse> RetryMachinegroupAsync(RetryMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试机器分组
         * Summary: 重试机器分组
         */
        public RetryMachinegroupResponse RetryMachinegroupEx(RetryMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试机器分组
         * Summary: 重试机器分组
         */
        public async Task<RetryMachinegroupResponse> RetryMachinegroupExAsync(RetryMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public SkipMachinegroupResponse SkipMachinegroup(SkipMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public async Task<SkipMachinegroupResponse> SkipMachinegroupAsync(SkipMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public SkipMachinegroupResponse SkipMachinegroupEx(SkipMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public async Task<SkipMachinegroupResponse> SkipMachinegroupExAsync(SkipMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分组取消
         * Summary: 分组取消
         */
        public CancelMachinegroupResponse CancelMachinegroup(CancelMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 分组取消
         * Summary: 分组取消
         */
        public async Task<CancelMachinegroupResponse> CancelMachinegroupAsync(CancelMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 分组取消
         * Summary: 分组取消
         */
        public CancelMachinegroupResponse CancelMachinegroupEx(CancelMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分组取消
         * Summary: 分组取消
         */
        public async Task<CancelMachinegroupResponse> CancelMachinegroupExAsync(CancelMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分组删除
         * Summary: 分组删除
         */
        public DeleteMachinegroupResponse DeleteMachinegroup(DeleteMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 分组删除
         * Summary: 分组删除
         */
        public async Task<DeleteMachinegroupResponse> DeleteMachinegroupAsync(DeleteMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 分组删除
         * Summary: 分组删除
         */
        public DeleteMachinegroupResponse DeleteMachinegroupEx(DeleteMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分组删除
         * Summary: 分组删除
         */
        public async Task<DeleteMachinegroupResponse> DeleteMachinegroupExAsync(DeleteMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新分组
         * Summary: 更新分组
         */
        public UpdateMachinegroupResponse UpdateMachinegroup(UpdateMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新分组
         * Summary: 更新分组
         */
        public async Task<UpdateMachinegroupResponse> UpdateMachinegroupAsync(UpdateMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新分组
         * Summary: 更新分组
         */
        public UpdateMachinegroupResponse UpdateMachinegroupEx(UpdateMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新分组
         * Summary: 更新分组
         */
        public async Task<UpdateMachinegroupResponse> UpdateMachinegroupExAsync(UpdateMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机器分组确认
         * Summary: 机器分组确认
         */
        public ConfirmMachinegroupResponse ConfirmMachinegroup(ConfirmMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 机器分组确认
         * Summary: 机器分组确认
         */
        public async Task<ConfirmMachinegroupResponse> ConfirmMachinegroupAsync(ConfirmMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 机器分组确认
         * Summary: 机器分组确认
         */
        public ConfirmMachinegroupResponse ConfirmMachinegroupEx(ConfirmMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机器分组确认
         * Summary: 机器分组确认
         */
        public async Task<ConfirmMachinegroupResponse> ConfirmMachinegroupExAsync(ConfirmMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机器分组进度批量查询
         * Summary: 机器分组进度批量查询
         */
        public BatchqueryMachinegroupProgressResponse BatchqueryMachinegroupProgress(BatchqueryMachinegroupProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryMachinegroupProgressEx(request, headers, runtime);
        }

        /**
         * Description: 机器分组进度批量查询
         * Summary: 机器分组进度批量查询
         */
        public async Task<BatchqueryMachinegroupProgressResponse> BatchqueryMachinegroupProgressAsync(BatchqueryMachinegroupProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryMachinegroupProgressExAsync(request, headers, runtime);
        }

        /**
         * Description: 机器分组进度批量查询
         * Summary: 机器分组进度批量查询
         */
        public BatchqueryMachinegroupProgressResponse BatchqueryMachinegroupProgressEx(BatchqueryMachinegroupProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryMachinegroupProgressResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.progress.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机器分组进度批量查询
         * Summary: 机器分组进度批量查询
         */
        public async Task<BatchqueryMachinegroupProgressResponse> BatchqueryMachinegroupProgressExAsync(BatchqueryMachinegroupProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryMachinegroupProgressResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.progress.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分区预确认
         * Summary: 分区预确认
         */
        public ConfirmMachinegroupReserveResponse ConfirmMachinegroupReserve(ConfirmMachinegroupReserveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmMachinegroupReserveEx(request, headers, runtime);
        }

        /**
         * Description: 分区预确认
         * Summary: 分区预确认
         */
        public async Task<ConfirmMachinegroupReserveResponse> ConfirmMachinegroupReserveAsync(ConfirmMachinegroupReserveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmMachinegroupReserveExAsync(request, headers, runtime);
        }

        /**
         * Description: 分区预确认
         * Summary: 分区预确认
         */
        public ConfirmMachinegroupReserveResponse ConfirmMachinegroupReserveEx(ConfirmMachinegroupReserveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmMachinegroupReserveResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.reserve.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分区预确认
         * Summary: 分区预确认
         */
        public async Task<ConfirmMachinegroupReserveResponse> ConfirmMachinegroupReserveExAsync(ConfirmMachinegroupReserveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmMachinegroupReserveResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.reserve.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改分组 SLB 权重
         * Summary: 修改分组 SLB 权重
         */
        public UpdateMachinegroupSlbmountweightResponse UpdateMachinegroupSlbmountweight(UpdateMachinegroupSlbmountweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMachinegroupSlbmountweightEx(request, headers, runtime);
        }

        /**
         * Description: 修改分组 SLB 权重
         * Summary: 修改分组 SLB 权重
         */
        public async Task<UpdateMachinegroupSlbmountweightResponse> UpdateMachinegroupSlbmountweightAsync(UpdateMachinegroupSlbmountweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMachinegroupSlbmountweightExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改分组 SLB 权重
         * Summary: 修改分组 SLB 权重
         */
        public UpdateMachinegroupSlbmountweightResponse UpdateMachinegroupSlbmountweightEx(UpdateMachinegroupSlbmountweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMachinegroupSlbmountweightResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.slbmountweight.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改分组 SLB 权重
         * Summary: 修改分组 SLB 权重
         */
        public async Task<UpdateMachinegroupSlbmountweightResponse> UpdateMachinegroupSlbmountweightExAsync(UpdateMachinegroupSlbmountweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMachinegroupSlbmountweightResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.slbmountweight.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分组 SLB 挂载进度
         * Summary: 查询分组 SLB 挂载进度
         */
        public QueryMachinegroupSlbmountprogressResponse QueryMachinegroupSlbmountprogress(QueryMachinegroupSlbmountprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMachinegroupSlbmountprogressEx(request, headers, runtime);
        }

        /**
         * Description: 查询分组 SLB 挂载进度
         * Summary: 查询分组 SLB 挂载进度
         */
        public async Task<QueryMachinegroupSlbmountprogressResponse> QueryMachinegroupSlbmountprogressAsync(QueryMachinegroupSlbmountprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMachinegroupSlbmountprogressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询分组 SLB 挂载进度
         * Summary: 查询分组 SLB 挂载进度
         */
        public QueryMachinegroupSlbmountprogressResponse QueryMachinegroupSlbmountprogressEx(QueryMachinegroupSlbmountprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachinegroupSlbmountprogressResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.slbmountprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分组 SLB 挂载进度
         * Summary: 查询分组 SLB 挂载进度
         */
        public async Task<QueryMachinegroupSlbmountprogressResponse> QueryMachinegroupSlbmountprogressExAsync(QueryMachinegroupSlbmountprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachinegroupSlbmountprogressResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.slbmountprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 slb 挂载状态
         * Summary: 查询 slb 挂载状态
         */
        public QueryMachinegroupSlbmountResponse QueryMachinegroupSlbmount(QueryMachinegroupSlbmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMachinegroupSlbmountEx(request, headers, runtime);
        }

        /**
         * Description: 查询 slb 挂载状态
         * Summary: 查询 slb 挂载状态
         */
        public async Task<QueryMachinegroupSlbmountResponse> QueryMachinegroupSlbmountAsync(QueryMachinegroupSlbmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMachinegroupSlbmountExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询 slb 挂载状态
         * Summary: 查询 slb 挂载状态
         */
        public QueryMachinegroupSlbmountResponse QueryMachinegroupSlbmountEx(QueryMachinegroupSlbmountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachinegroupSlbmountResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.slbmount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询 slb 挂载状态
         * Summary: 查询 slb 挂载状态
         */
        public async Task<QueryMachinegroupSlbmountResponse> QueryMachinegroupSlbmountExAsync(QueryMachinegroupSlbmountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMachinegroupSlbmountResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.slbmount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取分组信息
         * Summary: 获取分组信息
         */
        public GetMachinegroupResponse GetMachinegroup(GetMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 获取分组信息
         * Summary: 获取分组信息
         */
        public async Task<GetMachinegroupResponse> GetMachinegroupAsync(GetMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取分组信息
         * Summary: 获取分组信息
         */
        public GetMachinegroupResponse GetMachinegroupEx(GetMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.machinegroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取分组信息
         * Summary: 获取分组信息
         */
        public async Task<GetMachinegroupResponse> GetMachinegroupExAsync(GetMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinegroup.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略分组任务
         * Summary: 忽略分组任务
         */
        public SkipMachinetaskResponse SkipMachinetask(SkipMachinetaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipMachinetaskEx(request, headers, runtime);
        }

        /**
         * Description: 忽略分组任务
         * Summary: 忽略分组任务
         */
        public async Task<SkipMachinetaskResponse> SkipMachinetaskAsync(SkipMachinetaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipMachinetaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 忽略分组任务
         * Summary: 忽略分组任务
         */
        public SkipMachinetaskResponse SkipMachinetaskEx(SkipMachinetaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipMachinetaskResponse>(DoRequest("1.0", "antcloud.deps.machinetask.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略分组任务
         * Summary: 忽略分组任务
         */
        public async Task<SkipMachinetaskResponse> SkipMachinetaskExAsync(SkipMachinetaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipMachinetaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinetask.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机器任务重试
         * Summary: 机器任务重试
         */
        public RetryMachinetaskResponse RetryMachinetask(RetryMachinetaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryMachinetaskEx(request, headers, runtime);
        }

        /**
         * Description: 机器任务重试
         * Summary: 机器任务重试
         */
        public async Task<RetryMachinetaskResponse> RetryMachinetaskAsync(RetryMachinetaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryMachinetaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 机器任务重试
         * Summary: 机器任务重试
         */
        public RetryMachinetaskResponse RetryMachinetaskEx(RetryMachinetaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryMachinetaskResponse>(DoRequest("1.0", "antcloud.deps.machinetask.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 机器任务重试
         * Summary: 机器任务重试
         */
        public async Task<RetryMachinetaskResponse> RetryMachinetaskExAsync(RetryMachinetaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryMachinetaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.machinetask.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元
         * Summary: 查询部署单元
         */
        public QueryMetaCellResponse QueryMetaCell(QueryMetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetaCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元
         * Summary: 查询部署单元
         */
        public async Task<QueryMetaCellResponse> QueryMetaCellAsync(QueryMetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询部署单元
         * Summary: 查询部署单元
         */
        public QueryMetaCellResponse QueryMetaCellEx(QueryMetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetaCellResponse>(DoRequest("1.0", "antcloud.deps.meta.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询部署单元
         * Summary: 查询部署单元
         */
        public async Task<QueryMetaCellResponse> QueryMetaCellExAsync(QueryMetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetaCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.meta.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 deployment cell
         * Summary: 创建 deployment cell
         */
        public CreateMetaDeploymentcellResponse CreateMetaDeploymentcell(CreateMetaDeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMetaDeploymentcellEx(request, headers, runtime);
        }

        /**
         * Description: 创建 deployment cell
         * Summary: 创建 deployment cell
         */
        public async Task<CreateMetaDeploymentcellResponse> CreateMetaDeploymentcellAsync(CreateMetaDeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMetaDeploymentcellExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建 deployment cell
         * Summary: 创建 deployment cell
         */
        public CreateMetaDeploymentcellResponse CreateMetaDeploymentcellEx(CreateMetaDeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMetaDeploymentcellResponse>(DoRequest("1.0", "antcloud.deps.meta.deploymentcell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 deployment cell
         * Summary: 创建 deployment cell
         */
        public async Task<CreateMetaDeploymentcellResponse> CreateMetaDeploymentcellExAsync(CreateMetaDeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMetaDeploymentcellResponse>(await DoRequestAsync("1.0", "antcloud.deps.meta.deploymentcell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新 deployment zone
         * Summary: 更新 deployment zone
         */
        public UpdateMetaDeploymentcellResponse UpdateMetaDeploymentcell(UpdateMetaDeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMetaDeploymentcellEx(request, headers, runtime);
        }

        /**
         * Description: 更新 deployment zone
         * Summary: 更新 deployment zone
         */
        public async Task<UpdateMetaDeploymentcellResponse> UpdateMetaDeploymentcellAsync(UpdateMetaDeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMetaDeploymentcellExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新 deployment zone
         * Summary: 更新 deployment zone
         */
        public UpdateMetaDeploymentcellResponse UpdateMetaDeploymentcellEx(UpdateMetaDeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMetaDeploymentcellResponse>(DoRequest("1.0", "antcloud.deps.meta.deploymentcell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新 deployment zone
         * Summary: 更新 deployment zone
         */
        public async Task<UpdateMetaDeploymentcellResponse> UpdateMetaDeploymentcellExAsync(UpdateMetaDeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMetaDeploymentcellResponse>(await DoRequestAsync("1.0", "antcloud.deps.meta.deploymentcell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取 deployment cell
         * Summary: 获取 deployment cell
         */
        public GetMetaDeploymentcellResponse GetMetaDeploymentcell(GetMetaDeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMetaDeploymentcellEx(request, headers, runtime);
        }

        /**
         * Description: 获取 deployment cell
         * Summary: 获取 deployment cell
         */
        public async Task<GetMetaDeploymentcellResponse> GetMetaDeploymentcellAsync(GetMetaDeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMetaDeploymentcellExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取 deployment cell
         * Summary: 获取 deployment cell
         */
        public GetMetaDeploymentcellResponse GetMetaDeploymentcellEx(GetMetaDeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMetaDeploymentcellResponse>(DoRequest("1.0", "antcloud.deps.meta.deploymentcell.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取 deployment cell
         * Summary: 获取 deployment cell
         */
        public async Task<GetMetaDeploymentcellResponse> GetMetaDeploymentcellExAsync(GetMetaDeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMetaDeploymentcellResponse>(await DoRequestAsync("1.0", "antcloud.deps.meta.deploymentcell.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量获取 deployment cell
         * Summary: 批量获取 deployment cell
         */
        public QueryMetaDeploymentcellResponse QueryMetaDeploymentcell(QueryMetaDeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMetaDeploymentcellEx(request, headers, runtime);
        }

        /**
         * Description: 批量获取 deployment cell
         * Summary: 批量获取 deployment cell
         */
        public async Task<QueryMetaDeploymentcellResponse> QueryMetaDeploymentcellAsync(QueryMetaDeploymentcellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMetaDeploymentcellExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量获取 deployment cell
         * Summary: 批量获取 deployment cell
         */
        public QueryMetaDeploymentcellResponse QueryMetaDeploymentcellEx(QueryMetaDeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetaDeploymentcellResponse>(DoRequest("1.0", "antcloud.deps.meta.deploymentcell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量获取 deployment cell
         * Summary: 批量获取 deployment cell
         */
        public async Task<QueryMetaDeploymentcellResponse> QueryMetaDeploymentcellExAsync(QueryMetaDeploymentcellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMetaDeploymentcellResponse>(await DoRequestAsync("1.0", "antcloud.deps.meta.deploymentcell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建通知配置
         * Summary: 创建通知配置
         */
        public CreateNotificationConfigResponse CreateNotificationConfig(CreateNotificationConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateNotificationConfigEx(request, headers, runtime);
        }

        /**
         * Description: 创建通知配置
         * Summary: 创建通知配置
         */
        public async Task<CreateNotificationConfigResponse> CreateNotificationConfigAsync(CreateNotificationConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateNotificationConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建通知配置
         * Summary: 创建通知配置
         */
        public CreateNotificationConfigResponse CreateNotificationConfigEx(CreateNotificationConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNotificationConfigResponse>(DoRequest("1.0", "antcloud.deps.notification.config.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建通知配置
         * Summary: 创建通知配置
         */
        public async Task<CreateNotificationConfigResponse> CreateNotificationConfigExAsync(CreateNotificationConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateNotificationConfigResponse>(await DoRequestAsync("1.0", "antcloud.deps.notification.config.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新通知配置
         * Summary: 更新通知配置
         */
        public UpdateNotificationConfigResponse UpdateNotificationConfig(UpdateNotificationConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateNotificationConfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新通知配置
         * Summary: 更新通知配置
         */
        public async Task<UpdateNotificationConfigResponse> UpdateNotificationConfigAsync(UpdateNotificationConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateNotificationConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新通知配置
         * Summary: 更新通知配置
         */
        public UpdateNotificationConfigResponse UpdateNotificationConfigEx(UpdateNotificationConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateNotificationConfigResponse>(DoRequest("1.0", "antcloud.deps.notification.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新通知配置
         * Summary: 更新通知配置
         */
        public async Task<UpdateNotificationConfigResponse> UpdateNotificationConfigExAsync(UpdateNotificationConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateNotificationConfigResponse>(await DoRequestAsync("1.0", "antcloud.deps.notification.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询通知配置
         * Summary: 查询通知配置
         */
        public QueryNotificationConfigResponse QueryNotificationConfig(QueryNotificationConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryNotificationConfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询通知配置
         * Summary: 查询通知配置
         */
        public async Task<QueryNotificationConfigResponse> QueryNotificationConfigAsync(QueryNotificationConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryNotificationConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询通知配置
         * Summary: 查询通知配置
         */
        public QueryNotificationConfigResponse QueryNotificationConfigEx(QueryNotificationConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotificationConfigResponse>(DoRequest("1.0", "antcloud.deps.notification.config.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询通知配置
         * Summary: 查询通知配置
         */
        public async Task<QueryNotificationConfigResponse> QueryNotificationConfigExAsync(QueryNotificationConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryNotificationConfigResponse>(await DoRequestAsync("1.0", "antcloud.deps.notification.config.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除通知配置
         * Summary: 删除通知配置
         */
        public DeleteNotificationConfigResponse DeleteNotificationConfig(DeleteNotificationConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteNotificationConfigEx(request, headers, runtime);
        }

        /**
         * Description: 删除通知配置
         * Summary: 删除通知配置
         */
        public async Task<DeleteNotificationConfigResponse> DeleteNotificationConfigAsync(DeleteNotificationConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteNotificationConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除通知配置
         * Summary: 删除通知配置
         */
        public DeleteNotificationConfigResponse DeleteNotificationConfigEx(DeleteNotificationConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteNotificationConfigResponse>(DoRequest("1.0", "antcloud.deps.notification.config.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除通知配置
         * Summary: 删除通知配置
         */
        public async Task<DeleteNotificationConfigResponse> DeleteNotificationConfigExAsync(DeleteNotificationConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteNotificationConfigResponse>(await DoRequestAsync("1.0", "antcloud.deps.notification.config.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息
         * Summary: 查询用户信息
         */
        public QueryOperatorResponse QueryOperator(QueryOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息
         * Summary: 查询用户信息
         */
        public async Task<QueryOperatorResponse> QueryOperatorAsync(QueryOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户信息
         * Summary: 查询用户信息
         */
        public QueryOperatorResponse QueryOperatorEx(QueryOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperatorResponse>(DoRequest("1.0", "antcloud.deps.operator.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户信息
         * Summary: 查询用户信息
         */
        public async Task<QueryOperatorResponse> QueryOperatorExAsync(QueryOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperatorResponse>(await DoRequestAsync("1.0", "antcloud.deps.operator.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚
         * Summary: 回滚
         */
        public RollbackPlanServiceResponse RollbackPlanService(RollbackPlanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackPlanServiceEx(request, headers, runtime);
        }

        /**
         * Description: 回滚
         * Summary: 回滚
         */
        public async Task<RollbackPlanServiceResponse> RollbackPlanServiceAsync(RollbackPlanServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackPlanServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚
         * Summary: 回滚
         */
        public RollbackPlanServiceResponse RollbackPlanServiceEx(RollbackPlanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackPlanServiceResponse>(DoRequest("1.0", "antcloud.deps.plan.service.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚
         * Summary: 回滚
         */
        public async Task<RollbackPlanServiceResponse> RollbackPlanServiceExAsync(RollbackPlanServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackPlanServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.service.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public CreatePlanResponse CreatePlan(CreatePlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePlanEx(request, headers, runtime);
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public async Task<CreatePlanResponse> CreatePlanAsync(CreatePlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public CreatePlanResponse CreatePlanEx(CreatePlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePlanResponse>(DoRequest("1.0", "antcloud.deps.plan.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public async Task<CreatePlanResponse> CreatePlanExAsync(CreatePlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布单校验
         * Summary: 发布单校验
         */
        public CheckPlanResponse CheckPlan(CheckPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckPlanEx(request, headers, runtime);
        }

        /**
         * Description: 发布单校验
         * Summary: 发布单校验
         */
        public async Task<CheckPlanResponse> CheckPlanAsync(CheckPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布单校验
         * Summary: 发布单校验
         */
        public CheckPlanResponse CheckPlanEx(CheckPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPlanResponse>(DoRequest("1.0", "antcloud.deps.plan.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布单校验
         * Summary: 发布单校验
         */
        public async Task<CheckPlanResponse> CheckPlanExAsync(CheckPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验运维单请求
         * Summary: 校验运维单请求
         */
        public CheckPlanOperationResponse CheckPlanOperation(CheckPlanOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckPlanOperationEx(request, headers, runtime);
        }

        /**
         * Description: 校验运维单请求
         * Summary: 校验运维单请求
         */
        public async Task<CheckPlanOperationResponse> CheckPlanOperationAsync(CheckPlanOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckPlanOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验运维单请求
         * Summary: 校验运维单请求
         */
        public CheckPlanOperationResponse CheckPlanOperationEx(CheckPlanOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPlanOperationResponse>(DoRequest("1.0", "antcloud.deps.plan.operation.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验运维单请求
         * Summary: 校验运维单请求
         */
        public async Task<CheckPlanOperationResponse> CheckPlanOperationExAsync(CheckPlanOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPlanOperationResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.operation.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建运维单
         * Summary: 创建运维单
         */
        public CreatePlanOperationResponse CreatePlanOperation(CreatePlanOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePlanOperationEx(request, headers, runtime);
        }

        /**
         * Description: 创建运维单
         * Summary: 创建运维单
         */
        public async Task<CreatePlanOperationResponse> CreatePlanOperationAsync(CreatePlanOperationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePlanOperationExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建运维单
         * Summary: 创建运维单
         */
        public CreatePlanOperationResponse CreatePlanOperationEx(CreatePlanOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePlanOperationResponse>(DoRequest("1.0", "antcloud.deps.plan.operation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建运维单
         * Summary: 创建运维单
         */
        public async Task<CreatePlanOperationResponse> CreatePlanOperationExAsync(CreatePlanOperationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePlanOperationResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.operation.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public CreatePlanAdvancedResponse CreatePlanAdvanced(CreatePlanAdvancedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreatePlanAdvancedEx(request, headers, runtime);
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public async Task<CreatePlanAdvancedResponse> CreatePlanAdvancedAsync(CreatePlanAdvancedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreatePlanAdvancedExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public CreatePlanAdvancedResponse CreatePlanAdvancedEx(CreatePlanAdvancedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePlanAdvancedResponse>(DoRequest("1.0", "antcloud.deps.plan.advanced.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布单
         * Summary: 创建发布单
         */
        public async Task<CreatePlanAdvancedResponse> CreatePlanAdvancedExAsync(CreatePlanAdvancedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreatePlanAdvancedResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.advanced.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化发布单
         * Summary: 重新初始化发布单
         */
        public ReinitPlanResponse ReinitPlan(ReinitPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitPlanEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化发布单
         * Summary: 重新初始化发布单
         */
        public async Task<ReinitPlanResponse> ReinitPlanAsync(ReinitPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化发布单
         * Summary: 重新初始化发布单
         */
        public ReinitPlanResponse ReinitPlanEx(ReinitPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitPlanResponse>(DoRequest("1.0", "antcloud.deps.plan.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化发布单
         * Summary: 重新初始化发布单
         */
        public async Task<ReinitPlanResponse> ReinitPlanExAsync(ReinitPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布单信息
         * Summary: 获取发布单信息
         */
        public GetPlanResponse GetPlan(GetPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPlanEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布单信息
         * Summary: 获取发布单信息
         */
        public async Task<GetPlanResponse> GetPlanAsync(GetPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布单信息
         * Summary: 获取发布单信息
         */
        public GetPlanResponse GetPlanEx(GetPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlanResponse>(DoRequest("1.0", "antcloud.deps.plan.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布单信息
         * Summary: 获取发布单信息
         */
        public async Task<GetPlanResponse> GetPlanExAsync(GetPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布单基本信息
         * Summary: 获取发布单基本信息
         */
        public GetPlanBasicResponse GetPlanBasic(GetPlanBasicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPlanBasicEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布单基本信息
         * Summary: 获取发布单基本信息
         */
        public async Task<GetPlanBasicResponse> GetPlanBasicAsync(GetPlanBasicRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPlanBasicExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布单基本信息
         * Summary: 获取发布单基本信息
         */
        public GetPlanBasicResponse GetPlanBasicEx(GetPlanBasicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlanBasicResponse>(DoRequest("1.0", "antcloud.deps.plan.basic.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布单基本信息
         * Summary: 获取发布单基本信息
         */
        public async Task<GetPlanBasicResponse> GetPlanBasicExAsync(GetPlanBasicRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlanBasicResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.basic.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布进度
         * Summary: 获取发布进度
         */
        public GetPlanProgressResponse GetPlanProgress(GetPlanProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetPlanProgressEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布进度
         * Summary: 获取发布进度
         */
        public async Task<GetPlanProgressResponse> GetPlanProgressAsync(GetPlanProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetPlanProgressExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布进度
         * Summary: 获取发布进度
         */
        public GetPlanProgressResponse GetPlanProgressEx(GetPlanProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlanProgressResponse>(DoRequest("1.0", "antcloud.deps.plan.progress.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布进度
         * Summary: 获取发布进度
         */
        public async Task<GetPlanProgressResponse> GetPlanProgressExAsync(GetPlanProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetPlanProgressResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.progress.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布单
         * Summary: 查询发布单
         */
        public QueryPlanResponse QueryPlan(QueryPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPlanEx(request, headers, runtime);
        }

        /**
         * Description: 查询发布单
         * Summary: 查询发布单
         */
        public async Task<QueryPlanResponse> QueryPlanAsync(QueryPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发布单
         * Summary: 查询发布单
         */
        public QueryPlanResponse QueryPlanEx(QueryPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPlanResponse>(DoRequest("1.0", "antcloud.deps.plan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布单
         * Summary: 查询发布单
         */
        public async Task<QueryPlanResponse> QueryPlanExAsync(QueryPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布单状态统计
         * Summary: 发布单状态统计
         */
        public CountPlanStateResponse CountPlanState(CountPlanStateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CountPlanStateEx(request, headers, runtime);
        }

        /**
         * Description: 发布单状态统计
         * Summary: 发布单状态统计
         */
        public async Task<CountPlanStateResponse> CountPlanStateAsync(CountPlanStateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CountPlanStateExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布单状态统计
         * Summary: 发布单状态统计
         */
        public CountPlanStateResponse CountPlanStateEx(CountPlanStateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountPlanStateResponse>(DoRequest("1.0", "antcloud.deps.plan.state.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布单状态统计
         * Summary: 发布单状态统计
         */
        public async Task<CountPlanStateResponse> CountPlanStateExAsync(CountPlanStateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CountPlanStateResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.state.count", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  执行
         * Summary:  执行
         */
        public ExecPlanResponse ExecPlan(ExecPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecPlanEx(request, headers, runtime);
        }

        /**
         * Description:  执行
         * Summary:  执行
         */
        public async Task<ExecPlanResponse> ExecPlanAsync(ExecPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecPlanExAsync(request, headers, runtime);
        }

        /**
         * Description:  执行
         * Summary:  执行
         */
        public ExecPlanResponse ExecPlanEx(ExecPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecPlanResponse>(DoRequest("1.0", "antcloud.deps.plan.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  执行
         * Summary:  执行
         */
        public async Task<ExecPlanResponse> ExecPlanExAsync(ExecPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试
         * Summary: 重试
         */
        public RetryPlanResponse RetryPlan(RetryPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryPlanEx(request, headers, runtime);
        }

        /**
         * Description: 重试
         * Summary: 重试
         */
        public async Task<RetryPlanResponse> RetryPlanAsync(RetryPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试
         * Summary: 重试
         */
        public RetryPlanResponse RetryPlanEx(RetryPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryPlanResponse>(DoRequest("1.0", "antcloud.deps.plan.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试
         * Summary: 重试
         */
        public async Task<RetryPlanResponse> RetryPlanExAsync(RetryPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消发布
         * Summary: 取消发布
         */
        public CancelPlanResponse CancelPlan(CancelPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelPlanEx(request, headers, runtime);
        }

        /**
         * Description: 取消发布
         * Summary: 取消发布
         */
        public async Task<CancelPlanResponse> CancelPlanAsync(CancelPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消发布
         * Summary: 取消发布
         */
        public CancelPlanResponse CancelPlanEx(CancelPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelPlanResponse>(DoRequest("1.0", "antcloud.deps.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消发布
         * Summary: 取消发布
         */
        public async Task<CancelPlanResponse> CancelPlanExAsync(CancelPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚发布单
         * Summary: 回滚发布单
         */
        public RollbackPlanResponse RollbackPlan(RollbackPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackPlanEx(request, headers, runtime);
        }

        /**
         * Description: 回滚发布单
         * Summary: 回滚发布单
         */
        public async Task<RollbackPlanResponse> RollbackPlanAsync(RollbackPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚发布单
         * Summary: 回滚发布单
         */
        public RollbackPlanResponse RollbackPlanEx(RollbackPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackPlanResponse>(DoRequest("1.0", "antcloud.deps.plan.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚发布单
         * Summary: 回滚发布单
         */
        public async Task<RollbackPlanResponse> RollbackPlanExAsync(RollbackPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackPlanResponse>(await DoRequestAsync("1.0", "antcloud.deps.plan.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取任务详情
         * Summary: 获取任务详情
         */
        public GetTaskSummaryResponse GetTaskSummary(GetTaskSummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTaskSummaryEx(request, headers, runtime);
        }

        /**
         * Description: 获取任务详情
         * Summary: 获取任务详情
         */
        public async Task<GetTaskSummaryResponse> GetTaskSummaryAsync(GetTaskSummaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTaskSummaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取任务详情
         * Summary: 获取任务详情
         */
        public GetTaskSummaryResponse GetTaskSummaryEx(GetTaskSummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTaskSummaryResponse>(DoRequest("1.0", "antcloud.deps.task.summary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取任务详情
         * Summary: 获取任务详情
         */
        public async Task<GetTaskSummaryResponse> GetTaskSummaryExAsync(GetTaskSummaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTaskSummaryResponse>(await DoRequestAsync("1.0", "antcloud.deps.task.summary.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略任务
         * Summary: 忽略任务
         */
        public SkipTaskResponse SkipTask(SkipTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipTaskEx(request, headers, runtime);
        }

        /**
         * Description: 忽略任务
         * Summary: 忽略任务
         */
        public async Task<SkipTaskResponse> SkipTaskAsync(SkipTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 忽略任务
         * Summary: 忽略任务
         */
        public SkipTaskResponse SkipTaskEx(SkipTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipTaskResponse>(DoRequest("1.0", "antcloud.deps.task.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略任务
         * Summary: 忽略任务
         */
        public async Task<SkipTaskResponse> SkipTaskExAsync(SkipTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.task.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试任务
         * Summary: 重试任务
         */
        public RetryTaskResponse RetryTask(RetryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryTaskEx(request, headers, runtime);
        }

        /**
         * Description: 重试任务
         * Summary: 重试任务
         */
        public async Task<RetryTaskResponse> RetryTaskAsync(RetryTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试任务
         * Summary: 重试任务
         */
        public RetryTaskResponse RetryTaskEx(RetryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryTaskResponse>(DoRequest("1.0", "antcloud.deps.task.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试任务
         * Summary: 重试任务
         */
        public async Task<RetryTaskResponse> RetryTaskExAsync(RetryTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.task.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询角色信息
         * Summary: 查询角色信息
         */
        public QueryRoleResponse QueryRole(QueryRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRoleEx(request, headers, runtime);
        }

        /**
         * Description: 查询角色信息
         * Summary: 查询角色信息
         */
        public async Task<QueryRoleResponse> QueryRoleAsync(QueryRoleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRoleExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询角色信息
         * Summary: 查询角色信息
         */
        public QueryRoleResponse QueryRoleEx(QueryRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRoleResponse>(DoRequest("1.0", "antcloud.deps.role.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询角色信息
         * Summary: 查询角色信息
         */
        public async Task<QueryRoleResponse> QueryRoleExAsync(QueryRoleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRoleResponse>(await DoRequestAsync("1.0", "antcloud.deps.role.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用服务分组集合
         * Summary: 创建应用服务分组集合
         */
        public CreateServicegroupcollectionResponse CreateServicegroupcollection(CreateServicegroupcollectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateServicegroupcollectionEx(request, headers, runtime);
        }

        /**
         * Description: 创建应用服务分组集合
         * Summary: 创建应用服务分组集合
         */
        public async Task<CreateServicegroupcollectionResponse> CreateServicegroupcollectionAsync(CreateServicegroupcollectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateServicegroupcollectionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应用服务分组集合
         * Summary: 创建应用服务分组集合
         */
        public CreateServicegroupcollectionResponse CreateServicegroupcollectionEx(CreateServicegroupcollectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateServicegroupcollectionResponse>(DoRequest("1.0", "antcloud.deps.servicegroupcollection.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用服务分组集合
         * Summary: 创建应用服务分组集合
         */
        public async Task<CreateServicegroupcollectionResponse> CreateServicegroupcollectionExAsync(CreateServicegroupcollectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateServicegroupcollectionResponse>(await DoRequestAsync("1.0", "antcloud.deps.servicegroupcollection.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清除应用服务发布分组集合
         * Summary: 清除应用服务发布分组集合
         */
        public DeleteServicegroupcollectionResponse DeleteServicegroupcollection(DeleteServicegroupcollectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteServicegroupcollectionEx(request, headers, runtime);
        }

        /**
         * Description: 清除应用服务发布分组集合
         * Summary: 清除应用服务发布分组集合
         */
        public async Task<DeleteServicegroupcollectionResponse> DeleteServicegroupcollectionAsync(DeleteServicegroupcollectionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteServicegroupcollectionExAsync(request, headers, runtime);
        }

        /**
         * Description: 清除应用服务发布分组集合
         * Summary: 清除应用服务发布分组集合
         */
        public DeleteServicegroupcollectionResponse DeleteServicegroupcollectionEx(DeleteServicegroupcollectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteServicegroupcollectionResponse>(DoRequest("1.0", "antcloud.deps.servicegroupcollection.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清除应用服务发布分组集合
         * Summary: 清除应用服务发布分组集合
         */
        public async Task<DeleteServicegroupcollectionResponse> DeleteServicegroupcollectionExAsync(DeleteServicegroupcollectionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteServicegroupcollectionResponse>(await DoRequestAsync("1.0", "antcloud.deps.servicegroupcollection.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试分组
         * Summary: 重试分组
         */
        public RetryServicegroupResponse RetryServicegroup(RetryServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryServicegroupEx(request, headers, runtime);
        }

        /**
         * Description: 重试分组
         * Summary: 重试分组
         */
        public async Task<RetryServicegroupResponse> RetryServicegroupAsync(RetryServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryServicegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试分组
         * Summary: 重试分组
         */
        public RetryServicegroupResponse RetryServicegroupEx(RetryServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryServicegroupResponse>(DoRequest("1.0", "antcloud.deps.servicegroup.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试分组
         * Summary: 重试分组
         */
        public async Task<RetryServicegroupResponse> RetryServicegroupExAsync(RetryServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryServicegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.servicegroup.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行发布分组
         * Summary: 执行发布分组
         */
        public ExecServicegroupResponse ExecServicegroup(ExecServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecServicegroupEx(request, headers, runtime);
        }

        /**
         * Description: 执行发布分组
         * Summary: 执行发布分组
         */
        public async Task<ExecServicegroupResponse> ExecServicegroupAsync(ExecServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecServicegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行发布分组
         * Summary: 执行发布分组
         */
        public ExecServicegroupResponse ExecServicegroupEx(ExecServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecServicegroupResponse>(DoRequest("1.0", "antcloud.deps.servicegroup.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行发布分组
         * Summary: 执行发布分组
         */
        public async Task<ExecServicegroupResponse> ExecServicegroupExAsync(ExecServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecServicegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.servicegroup.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public SkipServicegroupResponse SkipServicegroup(SkipServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipServicegroupEx(request, headers, runtime);
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public async Task<SkipServicegroupResponse> SkipServicegroupAsync(SkipServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipServicegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public SkipServicegroupResponse SkipServicegroupEx(SkipServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipServicegroupResponse>(DoRequest("1.0", "antcloud.deps.servicegroup.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public async Task<SkipServicegroupResponse> SkipServicegroupExAsync(SkipServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipServicegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.servicegroup.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布分组
         * Summary: 创建发布分组
         */
        public CreateServicegroupResponse CreateServicegroup(CreateServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateServicegroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建发布分组
         * Summary: 创建发布分组
         */
        public async Task<CreateServicegroupResponse> CreateServicegroupAsync(CreateServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateServicegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建发布分组
         * Summary: 创建发布分组
         */
        public CreateServicegroupResponse CreateServicegroupEx(CreateServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateServicegroupResponse>(DoRequest("1.0", "antcloud.deps.servicegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建发布分组
         * Summary: 创建发布分组
         */
        public async Task<CreateServicegroupResponse> CreateServicegroupExAsync(CreateServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateServicegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.servicegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除发布分组
         * Summary: 删除发布分组
         */
        public DeleteServicegroupResponse DeleteServicegroup(DeleteServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteServicegroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除发布分组
         * Summary: 删除发布分组
         */
        public async Task<DeleteServicegroupResponse> DeleteServicegroupAsync(DeleteServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteServicegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除发布分组
         * Summary: 删除发布分组
         */
        public DeleteServicegroupResponse DeleteServicegroupEx(DeleteServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteServicegroupResponse>(DoRequest("1.0", "antcloud.deps.servicegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除发布分组
         * Summary: 删除发布分组
         */
        public async Task<DeleteServicegroupResponse> DeleteServicegroupExAsync(DeleteServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteServicegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.servicegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转换分组
         * Summary: 转换分组
         */
        public SwitchServicegroupResponse SwitchServicegroup(SwitchServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SwitchServicegroupEx(request, headers, runtime);
        }

        /**
         * Description: 转换分组
         * Summary: 转换分组
         */
        public async Task<SwitchServicegroupResponse> SwitchServicegroupAsync(SwitchServicegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SwitchServicegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 转换分组
         * Summary: 转换分组
         */
        public SwitchServicegroupResponse SwitchServicegroupEx(SwitchServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchServicegroupResponse>(DoRequest("1.0", "antcloud.deps.servicegroup.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 转换分组
         * Summary: 转换分组
         */
        public async Task<SwitchServicegroupResponse> SwitchServicegroupExAsync(SwitchServicegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SwitchServicegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.servicegroup.switch", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布服务详情
         * Summary: 获取发布服务详情
         */
        public GetServiceResponse GetService(GetServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetServiceEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布服务详情
         * Summary: 获取发布服务详情
         */
        public async Task<GetServiceResponse> GetServiceAsync(GetServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布服务详情
         * Summary: 获取发布服务详情
         */
        public GetServiceResponse GetServiceEx(GetServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceResponse>(DoRequest("1.0", "antcloud.deps.service.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布服务详情
         * Summary: 获取发布服务详情
         */
        public async Task<GetServiceResponse> GetServiceExAsync(GetServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用发布信息
         * Summary: 获取应用发布信息
         */
        public GetServiceProgressResponse GetServiceProgress(GetServiceProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetServiceProgressEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用发布信息
         * Summary: 获取应用发布信息
         */
        public async Task<GetServiceProgressResponse> GetServiceProgressAsync(GetServiceProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetServiceProgressExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用发布信息
         * Summary: 获取应用发布信息
         */
        public GetServiceProgressResponse GetServiceProgressEx(GetServiceProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceProgressResponse>(DoRequest("1.0", "antcloud.deps.service.progress.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用发布信息
         * Summary: 获取应用发布信息
         */
        public async Task<GetServiceProgressResponse> GetServiceProgressExAsync(GetServiceProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceProgressResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.progress.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布进度
         * Summary: 查询发布进度
         */
        public QueryServiceProgressResponse QueryServiceProgress(QueryServiceProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServiceProgressEx(request, headers, runtime);
        }

        /**
         * Description: 查询发布进度
         * Summary: 查询发布进度
         */
        public async Task<QueryServiceProgressResponse> QueryServiceProgressAsync(QueryServiceProgressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServiceProgressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询发布进度
         * Summary: 查询发布进度
         */
        public QueryServiceProgressResponse QueryServiceProgressEx(QueryServiceProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceProgressResponse>(DoRequest("1.0", "antcloud.deps.service.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询发布进度
         * Summary: 查询发布进度
         */
        public async Task<QueryServiceProgressResponse> QueryServiceProgressExAsync(QueryServiceProgressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceProgressResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.progress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询SLB挂载信息
         * Summary: 查询SLB挂载信息
         */
        public QueryServiceSlbmountResponse QueryServiceSlbmount(QueryServiceSlbmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServiceSlbmountEx(request, headers, runtime);
        }

        /**
         * Description: 查询SLB挂载信息
         * Summary: 查询SLB挂载信息
         */
        public async Task<QueryServiceSlbmountResponse> QueryServiceSlbmountAsync(QueryServiceSlbmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServiceSlbmountExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询SLB挂载信息
         * Summary: 查询SLB挂载信息
         */
        public QueryServiceSlbmountResponse QueryServiceSlbmountEx(QueryServiceSlbmountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceSlbmountResponse>(DoRequest("1.0", "antcloud.deps.service.slbmount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询SLB挂载信息
         * Summary: 查询SLB挂载信息
         */
        public async Task<QueryServiceSlbmountResponse> QueryServiceSlbmountExAsync(QueryServiceSlbmountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceSlbmountResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.slbmount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询 SLB 挂载信息
         * Summary: 批量查询 SLB 挂载信息
         */
        public BatchqueryServiceSlbmountResponse BatchqueryServiceSlbmount(BatchqueryServiceSlbmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryServiceSlbmountEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询 SLB 挂载信息
         * Summary: 批量查询 SLB 挂载信息
         */
        public async Task<BatchqueryServiceSlbmountResponse> BatchqueryServiceSlbmountAsync(BatchqueryServiceSlbmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryServiceSlbmountExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询 SLB 挂载信息
         * Summary: 批量查询 SLB 挂载信息
         */
        public BatchqueryServiceSlbmountResponse BatchqueryServiceSlbmountEx(BatchqueryServiceSlbmountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryServiceSlbmountResponse>(DoRequest("1.0", "antcloud.deps.service.slbmount.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询 SLB 挂载信息
         * Summary: 批量查询 SLB 挂载信息
         */
        public async Task<BatchqueryServiceSlbmountResponse> BatchqueryServiceSlbmountExAsync(BatchqueryServiceSlbmountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryServiceSlbmountResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.slbmount.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新slb挂载权重
         * Summary: 更新slb挂载权重
         */
        public UpdateServiceSlbmountResponse UpdateServiceSlbmount(UpdateServiceSlbmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateServiceSlbmountEx(request, headers, runtime);
        }

        /**
         * Description: 更新slb挂载权重
         * Summary: 更新slb挂载权重
         */
        public async Task<UpdateServiceSlbmountResponse> UpdateServiceSlbmountAsync(UpdateServiceSlbmountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateServiceSlbmountExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新slb挂载权重
         * Summary: 更新slb挂载权重
         */
        public UpdateServiceSlbmountResponse UpdateServiceSlbmountEx(UpdateServiceSlbmountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateServiceSlbmountResponse>(DoRequest("1.0", "antcloud.deps.service.slbmount.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新slb挂载权重
         * Summary: 更新slb挂载权重
         */
        public async Task<UpdateServiceSlbmountResponse> UpdateServiceSlbmountExAsync(UpdateServiceSlbmountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateServiceSlbmountResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.slbmount.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询挂载进度
         * Summary: 查询挂载进度
         */
        public QueryServiceSlbmountprogressResponse QueryServiceSlbmountprogress(QueryServiceSlbmountprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServiceSlbmountprogressEx(request, headers, runtime);
        }

        /**
         * Description: 查询挂载进度
         * Summary: 查询挂载进度
         */
        public async Task<QueryServiceSlbmountprogressResponse> QueryServiceSlbmountprogressAsync(QueryServiceSlbmountprogressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServiceSlbmountprogressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询挂载进度
         * Summary: 查询挂载进度
         */
        public QueryServiceSlbmountprogressResponse QueryServiceSlbmountprogressEx(QueryServiceSlbmountprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceSlbmountprogressResponse>(DoRequest("1.0", "antcloud.deps.service.slbmountprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询挂载进度
         * Summary: 查询挂载进度
         */
        public async Task<QueryServiceSlbmountprogressResponse> QueryServiceSlbmountprogressExAsync(QueryServiceSlbmountprogressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceSlbmountprogressResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.slbmountprogress.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询最近一次发布成功的应用记录
         * Summary: 查询最近一次发布成功的应用记录
         */
        public QueryServiceLatestsuccessResponse QueryServiceLatestsuccess(QueryServiceLatestsuccessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServiceLatestsuccessEx(request, headers, runtime);
        }

        /**
         * Description: 查询最近一次发布成功的应用记录
         * Summary: 查询最近一次发布成功的应用记录
         */
        public async Task<QueryServiceLatestsuccessResponse> QueryServiceLatestsuccessAsync(QueryServiceLatestsuccessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServiceLatestsuccessExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询最近一次发布成功的应用记录
         * Summary: 查询最近一次发布成功的应用记录
         */
        public QueryServiceLatestsuccessResponse QueryServiceLatestsuccessEx(QueryServiceLatestsuccessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceLatestsuccessResponse>(DoRequest("1.0", "antcloud.deps.service.latestsuccess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询最近一次发布成功的应用记录
         * Summary: 查询最近一次发布成功的应用记录
         */
        public async Task<QueryServiceLatestsuccessResponse> QueryServiceLatestsuccessExAsync(QueryServiceLatestsuccessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceLatestsuccessResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.latestsuccess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化
         * Summary: 重新初始化
         */
        public ReinitServiceResponse ReinitService(ReinitServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitServiceEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化
         * Summary: 重新初始化
         */
        public async Task<ReinitServiceResponse> ReinitServiceAsync(ReinitServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化
         * Summary: 重新初始化
         */
        public ReinitServiceResponse ReinitServiceEx(ReinitServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitServiceResponse>(DoRequest("1.0", "antcloud.deps.service.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化
         * Summary: 重新初始化
         */
        public async Task<ReinitServiceResponse> ReinitServiceExAsync(ReinitServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行发布单
         * Summary: 执行发布单
         */
        public ExecServiceResponse ExecService(ExecServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecServiceEx(request, headers, runtime);
        }

        /**
         * Description: 执行发布单
         * Summary: 执行发布单
         */
        public async Task<ExecServiceResponse> ExecServiceAsync(ExecServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 执行发布单
         * Summary: 执行发布单
         */
        public ExecServiceResponse ExecServiceEx(ExecServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecServiceResponse>(DoRequest("1.0", "antcloud.deps.service.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 执行发布单
         * Summary: 执行发布单
         */
        public async Task<ExecServiceResponse> ExecServiceExAsync(ExecServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消应用发布
         * Summary: 取消应用发布
         */
        public CancelServiceResponse CancelService(CancelServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelServiceEx(request, headers, runtime);
        }

        /**
         * Description: 取消应用发布
         * Summary: 取消应用发布
         */
        public async Task<CancelServiceResponse> CancelServiceAsync(CancelServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消应用发布
         * Summary: 取消应用发布
         */
        public CancelServiceResponse CancelServiceEx(CancelServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelServiceResponse>(DoRequest("1.0", "antcloud.deps.service.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消应用发布
         * Summary: 取消应用发布
         */
        public async Task<CancelServiceResponse> CancelServiceExAsync(CancelServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public SkipServiceResponse SkipService(SkipServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipServiceEx(request, headers, runtime);
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public async Task<SkipServiceResponse> SkipServiceAsync(SkipServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public SkipServiceResponse SkipServiceEx(SkipServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipServiceResponse>(DoRequest("1.0", "antcloud.deps.service.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略分组
         * Summary: 忽略分组
         */
        public async Task<SkipServiceResponse> SkipServiceExAsync(SkipServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 触发服务发布
         * Summary: 触发服务发布
         */
        public StartServiceResponse StartService(StartServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartServiceEx(request, headers, runtime);
        }

        /**
         * Description: 触发服务发布
         * Summary: 触发服务发布
         */
        public async Task<StartServiceResponse> StartServiceAsync(StartServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 触发服务发布
         * Summary: 触发服务发布
         */
        public StartServiceResponse StartServiceEx(StartServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartServiceResponse>(DoRequest("1.0", "antcloud.deps.service.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 触发服务发布
         * Summary: 触发服务发布
         */
        public async Task<StartServiceResponse> StartServiceExAsync(StartServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布确认
         * Summary: 发布确认
         */
        public ConfirmServiceResponse ConfirmService(ConfirmServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmServiceEx(request, headers, runtime);
        }

        /**
         * Description: 发布确认
         * Summary: 发布确认
         */
        public async Task<ConfirmServiceResponse> ConfirmServiceAsync(ConfirmServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布确认
         * Summary: 发布确认
         */
        public ConfirmServiceResponse ConfirmServiceEx(ConfirmServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmServiceResponse>(DoRequest("1.0", "antcloud.deps.service.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布确认
         * Summary: 发布确认
         */
        public async Task<ConfirmServiceResponse> ConfirmServiceExAsync(ConfirmServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置机器分组
         * Summary: 配置机器分组
         */
        public SetServiceMachinegroupResponse SetServiceMachinegroup(SetServiceMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetServiceMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 配置机器分组
         * Summary: 配置机器分组
         */
        public async Task<SetServiceMachinegroupResponse> SetServiceMachinegroupAsync(SetServiceMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetServiceMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 配置机器分组
         * Summary: 配置机器分组
         */
        public SetServiceMachinegroupResponse SetServiceMachinegroupEx(SetServiceMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetServiceMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.service.machinegroup.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 配置机器分组
         * Summary: 配置机器分组
         */
        public async Task<SetServiceMachinegroupResponse> SetServiceMachinegroupExAsync(SetServiceMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetServiceMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.machinegroup.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化机器分组
         * Summary: 重新初始化机器分组
         */
        public ReinitServiceMachinegroupResponse ReinitServiceMachinegroup(ReinitServiceMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitServiceMachinegroupEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化机器分组
         * Summary: 重新初始化机器分组
         */
        public async Task<ReinitServiceMachinegroupResponse> ReinitServiceMachinegroupAsync(ReinitServiceMachinegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitServiceMachinegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化机器分组
         * Summary: 重新初始化机器分组
         */
        public ReinitServiceMachinegroupResponse ReinitServiceMachinegroupEx(ReinitServiceMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitServiceMachinegroupResponse>(DoRequest("1.0", "antcloud.deps.service.machinegroup.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化机器分组
         * Summary: 重新初始化机器分组
         */
        public async Task<ReinitServiceMachinegroupResponse> ReinitServiceMachinegroupExAsync(ReinitServiceMachinegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitServiceMachinegroupResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.machinegroup.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可回滚服务
         * Summary: 查询可回滚服务
         */
        public ListServiceRollbackversionResponse ListServiceRollbackversion(ListServiceRollbackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListServiceRollbackversionEx(request, headers, runtime);
        }

        /**
         * Description: 查询可回滚服务
         * Summary: 查询可回滚服务
         */
        public async Task<ListServiceRollbackversionResponse> ListServiceRollbackversionAsync(ListServiceRollbackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListServiceRollbackversionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可回滚服务
         * Summary: 查询可回滚服务
         */
        public ListServiceRollbackversionResponse ListServiceRollbackversionEx(ListServiceRollbackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListServiceRollbackversionResponse>(DoRequest("1.0", "antcloud.deps.service.rollbackversion.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可回滚服务
         * Summary: 查询可回滚服务
         */
        public async Task<ListServiceRollbackversionResponse> ListServiceRollbackversionExAsync(ListServiceRollbackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListServiceRollbackversionResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.rollbackversion.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可回滚版本
         * Summary: 查询可回滚版本
         */
        public QueryServiceRollbackversionResponse QueryServiceRollbackversion(QueryServiceRollbackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServiceRollbackversionEx(request, headers, runtime);
        }

        /**
         * Description: 查询可回滚版本
         * Summary: 查询可回滚版本
         */
        public async Task<QueryServiceRollbackversionResponse> QueryServiceRollbackversionAsync(QueryServiceRollbackversionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServiceRollbackversionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询可回滚版本
         * Summary: 查询可回滚版本
         */
        public QueryServiceRollbackversionResponse QueryServiceRollbackversionEx(QueryServiceRollbackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceRollbackversionResponse>(DoRequest("1.0", "antcloud.deps.service.rollbackversion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询可回滚版本
         * Summary: 查询可回滚版本
         */
        public async Task<QueryServiceRollbackversionResponse> QueryServiceRollbackversionExAsync(QueryServiceRollbackversionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceRollbackversionResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.rollbackversion.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚应用
         * Summary: 回滚应用
         */
        public RollbackServiceResponse RollbackService(RollbackServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackServiceEx(request, headers, runtime);
        }

        /**
         * Description: 回滚应用
         * Summary: 回滚应用
         */
        public async Task<RollbackServiceResponse> RollbackServiceAsync(RollbackServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚应用
         * Summary: 回滚应用
         */
        public RollbackServiceResponse RollbackServiceEx(RollbackServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackServiceResponse>(DoRequest("1.0", "antcloud.deps.service.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚应用
         * Summary: 回滚应用
         */
        public async Task<RollbackServiceResponse> RollbackServiceExAsync(RollbackServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚确认
         * Summary: 回滚确认
         */
        public ConfirmrollbackServiceResponse ConfirmrollbackService(ConfirmrollbackServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmrollbackServiceEx(request, headers, runtime);
        }

        /**
         * Description: 回滚确认
         * Summary: 回滚确认
         */
        public async Task<ConfirmrollbackServiceResponse> ConfirmrollbackServiceAsync(ConfirmrollbackServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmrollbackServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚确认
         * Summary: 回滚确认
         */
        public ConfirmrollbackServiceResponse ConfirmrollbackServiceEx(ConfirmrollbackServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmrollbackServiceResponse>(DoRequest("1.0", "antcloud.deps.service.confirmrollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚确认
         * Summary: 回滚确认
         */
        public async Task<ConfirmrollbackServiceResponse> ConfirmrollbackServiceExAsync(ConfirmrollbackServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmrollbackServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.confirmrollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚重试
         * Summary: 回滚重试
         */
        public RetryrollbackServiceResponse RetryrollbackService(RetryrollbackServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryrollbackServiceEx(request, headers, runtime);
        }

        /**
         * Description: 回滚重试
         * Summary: 回滚重试
         */
        public async Task<RetryrollbackServiceResponse> RetryrollbackServiceAsync(RetryrollbackServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryrollbackServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 回滚重试
         * Summary: 回滚重试
         */
        public RetryrollbackServiceResponse RetryrollbackServiceEx(RetryrollbackServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryrollbackServiceResponse>(DoRequest("1.0", "antcloud.deps.service.retryrollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 回滚重试
         * Summary: 回滚重试
         */
        public async Task<RetryrollbackServiceResponse> RetryrollbackServiceExAsync(RetryrollbackServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryrollbackServiceResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.retryrollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取子流程进度
         * Summary: 获取子流程进度
         */
        public GetServiceArrangementResponse GetServiceArrangement(GetServiceArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetServiceArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 获取子流程进度
         * Summary: 获取子流程进度
         */
        public async Task<GetServiceArrangementResponse> GetServiceArrangementAsync(GetServiceArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetServiceArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取子流程进度
         * Summary: 获取子流程进度
         */
        public GetServiceArrangementResponse GetServiceArrangementEx(GetServiceArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceArrangementResponse>(DoRequest("1.0", "antcloud.deps.service.arrangement.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取子流程进度
         * Summary: 获取子流程进度
         */
        public async Task<GetServiceArrangementResponse> GetServiceArrangementExAsync(GetServiceArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.arrangement.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试子流程
         * Summary: 重试子流程
         */
        public RetryServiceArrangementResponse RetryServiceArrangement(RetryServiceArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetryServiceArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 重试子流程
         * Summary: 重试子流程
         */
        public async Task<RetryServiceArrangementResponse> RetryServiceArrangementAsync(RetryServiceArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetryServiceArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 重试子流程
         * Summary: 重试子流程
         */
        public RetryServiceArrangementResponse RetryServiceArrangementEx(RetryServiceArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryServiceArrangementResponse>(DoRequest("1.0", "antcloud.deps.service.arrangement.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重试子流程
         * Summary: 重试子流程
         */
        public async Task<RetryServiceArrangementResponse> RetryServiceArrangementExAsync(RetryServiceArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetryServiceArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.arrangement.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略子流程
         * Summary: 忽略子流程
         */
        public SkipServiceArrangementResponse SkipServiceArrangement(SkipServiceArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SkipServiceArrangementEx(request, headers, runtime);
        }

        /**
         * Description: 忽略子流程
         * Summary: 忽略子流程
         */
        public async Task<SkipServiceArrangementResponse> SkipServiceArrangementAsync(SkipServiceArrangementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SkipServiceArrangementExAsync(request, headers, runtime);
        }

        /**
         * Description: 忽略子流程
         * Summary: 忽略子流程
         */
        public SkipServiceArrangementResponse SkipServiceArrangementEx(SkipServiceArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipServiceArrangementResponse>(DoRequest("1.0", "antcloud.deps.service.arrangement.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 忽略子流程
         * Summary: 忽略子流程
         */
        public async Task<SkipServiceArrangementResponse> SkipServiceArrangementExAsync(SkipServiceArrangementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SkipServiceArrangementResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.arrangement.skip", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query op log
         * Summary: query op log
         */
        public QueryOperationlogResponse QueryOperationlog(QueryOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOperationlogEx(request, headers, runtime);
        }

        /**
         * Description: query op log
         * Summary: query op log
         */
        public async Task<QueryOperationlogResponse> QueryOperationlogAsync(QueryOperationlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOperationlogExAsync(request, headers, runtime);
        }

        /**
         * Description: query op log
         * Summary: query op log
         */
        public QueryOperationlogResponse QueryOperationlogEx(QueryOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperationlogResponse>(DoRequest("1.0", "antcloud.deps.operationlog.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query op log
         * Summary: query op log
         */
        public async Task<QueryOperationlogResponse> QueryOperationlogExAsync(QueryOperationlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperationlogResponse>(await DoRequestAsync("1.0", "antcloud.deps.operationlog.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: operation time line
         * Summary: operation time line
         */
        public QueryOperationlogTimelineResponse QueryOperationlogTimeline(QueryOperationlogTimelineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOperationlogTimelineEx(request, headers, runtime);
        }

        /**
         * Description: operation time line
         * Summary: operation time line
         */
        public async Task<QueryOperationlogTimelineResponse> QueryOperationlogTimelineAsync(QueryOperationlogTimelineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOperationlogTimelineExAsync(request, headers, runtime);
        }

        /**
         * Description: operation time line
         * Summary: operation time line
         */
        public QueryOperationlogTimelineResponse QueryOperationlogTimelineEx(QueryOperationlogTimelineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperationlogTimelineResponse>(DoRequest("1.0", "antcloud.deps.operationlog.timeline.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: operation time line
         * Summary: operation time line
         */
        public async Task<QueryOperationlogTimelineResponse> QueryOperationlogTimelineExAsync(QueryOperationlogTimelineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperationlogTimelineResponse>(await DoRequestAsync("1.0", "antcloud.deps.operationlog.timeline.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布应用详情
         * Summary: 获取发布应用详情
         */
        public GetServiceDetailResponse GetServiceDetail(GetServiceDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetServiceDetailEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布应用详情
         * Summary: 获取发布应用详情
         */
        public async Task<GetServiceDetailResponse> GetServiceDetailAsync(GetServiceDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetServiceDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布应用详情
         * Summary: 获取发布应用详情
         */
        public GetServiceDetailResponse GetServiceDetailEx(GetServiceDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceDetailResponse>(DoRequest("1.0", "antcloud.deps.service.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布应用详情
         * Summary: 获取发布应用详情
         */
        public async Task<GetServiceDetailResponse> GetServiceDetailExAsync(GetServiceDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetServiceDetailResponse>(await DoRequestAsync("1.0", "antcloud.deps.service.detail.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create cell
         * Summary: create cell
         */
        public CreateMetaCellResponse CreateMetaCell(CreateMetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMetaCellEx(request, headers, runtime);
        }

        /**
         * Description: create cell
         * Summary: create cell
         */
        public async Task<CreateMetaCellResponse> CreateMetaCellAsync(CreateMetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: create cell
         * Summary: create cell
         */
        public CreateMetaCellResponse CreateMetaCellEx(CreateMetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMetaCellResponse>(DoRequest("1.0", "antcloud.deps.meta.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: create cell
         * Summary: create cell
         */
        public async Task<CreateMetaCellResponse> CreateMetaCellExAsync(CreateMetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMetaCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.meta.cell.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update cell
         * Summary: update cell
         */
        public UpdateMetaCellResponse UpdateMetaCell(UpdateMetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMetaCellEx(request, headers, runtime);
        }

        /**
         * Description: update cell
         * Summary: update cell
         */
        public async Task<UpdateMetaCellResponse> UpdateMetaCellAsync(UpdateMetaCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMetaCellExAsync(request, headers, runtime);
        }

        /**
         * Description: update cell
         * Summary: update cell
         */
        public UpdateMetaCellResponse UpdateMetaCellEx(UpdateMetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMetaCellResponse>(DoRequest("1.0", "antcloud.deps.meta.cell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update cell
         * Summary: update cell
         */
        public async Task<UpdateMetaCellResponse> UpdateMetaCellExAsync(UpdateMetaCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMetaCellResponse>(await DoRequestAsync("1.0", "antcloud.deps.meta.cell.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关联 master zone
         * Summary: 关联 master zone
         */
        public AddMetaMasterzonerelResponse AddMetaMasterzonerel(AddMetaMasterzonerelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddMetaMasterzonerelEx(request, headers, runtime);
        }

        /**
         * Description: 关联 master zone
         * Summary: 关联 master zone
         */
        public async Task<AddMetaMasterzonerelResponse> AddMetaMasterzonerelAsync(AddMetaMasterzonerelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddMetaMasterzonerelExAsync(request, headers, runtime);
        }

        /**
         * Description: 关联 master zone
         * Summary: 关联 master zone
         */
        public AddMetaMasterzonerelResponse AddMetaMasterzonerelEx(AddMetaMasterzonerelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMetaMasterzonerelResponse>(DoRequest("1.0", "antcloud.deps.meta.masterzonerel.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关联 master zone
         * Summary: 关联 master zone
         */
        public async Task<AddMetaMasterzonerelResponse> AddMetaMasterzonerelExAsync(AddMetaMasterzonerelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMetaMasterzonerelResponse>(await DoRequestAsync("1.0", "antcloud.deps.meta.masterzonerel.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分配指定的一个或者多个计算资源到指定的应用
         * Summary: 分配应用计算资源
         */
        public AssignComputerResponse AssignComputer(AssignComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AssignComputerEx(request, headers, runtime);
        }

        /**
         * Description: 分配指定的一个或者多个计算资源到指定的应用
         * Summary: 分配应用计算资源
         */
        public async Task<AssignComputerResponse> AssignComputerAsync(AssignComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AssignComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 分配指定的一个或者多个计算资源到指定的应用
         * Summary: 分配应用计算资源
         */
        public AssignComputerResponse AssignComputerEx(AssignComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssignComputerResponse>(DoRequest("1.0", "antcloud.deps.computer.assign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分配指定的一个或者多个计算资源到指定的应用
         * Summary: 分配应用计算资源
         */
        public async Task<AssignComputerResponse> AssignComputerExAsync(AssignComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AssignComputerResponse>(await DoRequestAsync("1.0", "antcloud.deps.computer.assign", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从指定应用释放一个或者多个计算资源
         * Summary: 释放应用计算资源
         */
        public ReleaseComputerResponse ReleaseComputer(ReleaseComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReleaseComputerEx(request, headers, runtime);
        }

        /**
         * Description: 从指定应用释放一个或者多个计算资源
         * Summary: 释放应用计算资源
         */
        public async Task<ReleaseComputerResponse> ReleaseComputerAsync(ReleaseComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReleaseComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 从指定应用释放一个或者多个计算资源
         * Summary: 释放应用计算资源
         */
        public ReleaseComputerResponse ReleaseComputerEx(ReleaseComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseComputerResponse>(DoRequest("1.0", "antcloud.deps.computer.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 从指定应用释放一个或者多个计算资源
         * Summary: 释放应用计算资源
         */
        public async Task<ReleaseComputerResponse> ReleaseComputerExAsync(ReleaseComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReleaseComputerResponse>(await DoRequestAsync("1.0", "antcloud.deps.computer.release", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
         * Summary: 获取异步任务
         */
        public GetTaskResponse GetTask(GetTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
         * Summary: 获取异步任务
         */
        public async Task<GetTaskResponse> GetTaskAsync(GetTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
         * Summary: 获取异步任务
         */
        public GetTaskResponse GetTaskEx(GetTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTaskResponse>(DoRequest("1.0", "antcloud.deps.task.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询异步请求的详情，包括请求状态，请求中的任务执行状态等
         * Summary: 获取异步任务
         */
        public async Task<GetTaskResponse> GetTaskExAsync(GetTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTaskResponse>(await DoRequestAsync("1.0", "antcloud.deps.task.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 ecs 实例
         * Summary: 创建 ecs 实例
         */
        public CreateComputerResponse CreateComputer(CreateComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateComputerEx(request, headers, runtime);
        }

        /**
         * Description: 创建 ecs 实例
         * Summary: 创建 ecs 实例
         */
        public async Task<CreateComputerResponse> CreateComputerAsync(CreateComputerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateComputerExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建 ecs 实例
         * Summary: 创建 ecs 实例
         */
        public CreateComputerResponse CreateComputerEx(CreateComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateComputerResponse>(DoRequest("1.0", "antcloud.deps.computer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建 ecs 实例
         * Summary: 创建 ecs 实例
         */
        public async Task<CreateComputerResponse> CreateComputerExAsync(CreateComputerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateComputerResponse>(await DoRequestAsync("1.0", "antcloud.deps.computer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建sidecar元数据信息
         * Summary: 创建sidecar元数据信息
         */
        public CreateSidecarResponse CreateSidecar(CreateSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 创建sidecar元数据信息
         * Summary: 创建sidecar元数据信息
         */
        public async Task<CreateSidecarResponse> CreateSidecarAsync(CreateSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建sidecar元数据信息
         * Summary: 创建sidecar元数据信息
         */
        public CreateSidecarResponse CreateSidecarEx(CreateSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarResponse>(DoRequest("1.0", "antcloud.deps.sidecar.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建sidecar元数据信息
         * Summary: 创建sidecar元数据信息
         */
        public async Task<CreateSidecarResponse> CreateSidecarExAsync(CreateSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
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
            return TeaModel.ToObject<ListSidecarResponse>(DoRequest("1.0", "antcloud.deps.sidecar.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar元信息列表
         * Summary: 查询sidecar元信息列表
         */
        public async Task<ListSidecarResponse> ListSidecarExAsync(ListSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建sidecar模板
         * Summary: 创建sidecar版本
         */
        public CreateSidecarVersionResponse CreateSidecarVersion(CreateSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSidecarVersionEx(request, headers, runtime);
        }

        /**
         * Description: 创建sidecar模板
         * Summary: 创建sidecar版本
         */
        public async Task<CreateSidecarVersionResponse> CreateSidecarVersionAsync(CreateSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSidecarVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建sidecar模板
         * Summary: 创建sidecar版本
         */
        public CreateSidecarVersionResponse CreateSidecarVersionEx(CreateSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarVersionResponse>(DoRequest("1.0", "antcloud.deps.sidecar.version.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建sidecar模板
         * Summary: 创建sidecar版本
         */
        public async Task<CreateSidecarVersionResponse> CreateSidecarVersionExAsync(CreateSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarVersionResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.version.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar模板列表
         * Summary: 查询sidecar模板列表
         */
        public ListSidecarVersionResponse ListSidecarVersion(ListSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSidecarVersionEx(request, headers, runtime);
        }

        /**
         * Description: 查询sidecar模板列表
         * Summary: 查询sidecar模板列表
         */
        public async Task<ListSidecarVersionResponse> ListSidecarVersionAsync(ListSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSidecarVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询sidecar模板列表
         * Summary: 查询sidecar模板列表
         */
        public ListSidecarVersionResponse ListSidecarVersionEx(ListSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarVersionResponse>(DoRequest("1.0", "antcloud.deps.sidecar.version.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar模板列表
         * Summary: 查询sidecar模板列表
         */
        public async Task<ListSidecarVersionResponse> ListSidecarVersionExAsync(ListSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarVersionResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.version.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar版本详情
         * Summary: 获取sidecar版本详情
         */
        public GetSidecarVersionResponse GetSidecarVersion(GetSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSidecarVersionEx(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar版本详情
         * Summary: 获取sidecar版本详情
         */
        public async Task<GetSidecarVersionResponse> GetSidecarVersionAsync(GetSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSidecarVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar版本详情
         * Summary: 获取sidecar版本详情
         */
        public GetSidecarVersionResponse GetSidecarVersionEx(GetSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarVersionResponse>(DoRequest("1.0", "antcloud.deps.sidecar.version.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar版本详情
         * Summary: 获取sidecar版本详情
         */
        public async Task<GetSidecarVersionResponse> GetSidecarVersionExAsync(GetSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarVersionResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.version.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建sidecar规则
         * Summary: 创建sidecar规则
         */
        public CreateSidecarRuleResponse CreateSidecarRule(CreateSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSidecarRuleEx(request, headers, runtime);
        }

        /**
         * Description: 创建sidecar规则
         * Summary: 创建sidecar规则
         */
        public async Task<CreateSidecarRuleResponse> CreateSidecarRuleAsync(CreateSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSidecarRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建sidecar规则
         * Summary: 创建sidecar规则
         */
        public CreateSidecarRuleResponse CreateSidecarRuleEx(CreateSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarRuleResponse>(DoRequest("1.0", "antcloud.deps.sidecar.rule.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建sidecar规则
         * Summary: 创建sidecar规则
         */
        public async Task<CreateSidecarRuleResponse> CreateSidecarRuleExAsync(CreateSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarRuleResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.rule.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar单个规则详情
         * Summary: 获取sidecar单个规则详情
         */
        public GetSidecarRuleResponse GetSidecarRule(GetSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSidecarRuleEx(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar单个规则详情
         * Summary: 获取sidecar单个规则详情
         */
        public async Task<GetSidecarRuleResponse> GetSidecarRuleAsync(GetSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSidecarRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar单个规则详情
         * Summary: 获取sidecar单个规则详情
         */
        public GetSidecarRuleResponse GetSidecarRuleEx(GetSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarRuleResponse>(DoRequest("1.0", "antcloud.deps.sidecar.rule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar单个规则详情
         * Summary: 获取sidecar单个规则详情
         */
        public async Task<GetSidecarRuleResponse> GetSidecarRuleExAsync(GetSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarRuleResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.rule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar规则列表
         * Summary: 获取sidecar规则列表
         */
        public ListSidecarRuleResponse ListSidecarRule(ListSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSidecarRuleEx(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar规则列表
         * Summary: 获取sidecar规则列表
         */
        public async Task<ListSidecarRuleResponse> ListSidecarRuleAsync(ListSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSidecarRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar规则列表
         * Summary: 获取sidecar规则列表
         */
        public ListSidecarRuleResponse ListSidecarRuleEx(ListSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarRuleResponse>(DoRequest("1.0", "antcloud.deps.sidecar.rule.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar规则列表
         * Summary: 获取sidecar规则列表
         */
        public async Task<ListSidecarRuleResponse> ListSidecarRuleExAsync(ListSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarRuleResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.rule.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建sidecar版本实例
         * Summary: 创建sidecar版本实例
         */
        public CreateSidecarInstanceResponse CreateSidecarInstance(CreateSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateSidecarInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 创建sidecar版本实例
         * Summary: 创建sidecar版本实例
         */
        public async Task<CreateSidecarInstanceResponse> CreateSidecarInstanceAsync(CreateSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateSidecarInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建sidecar版本实例
         * Summary: 创建sidecar版本实例
         */
        public CreateSidecarInstanceResponse CreateSidecarInstanceEx(CreateSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarInstanceResponse>(DoRequest("1.0", "antcloud.deps.sidecar.instance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建sidecar版本实例
         * Summary: 创建sidecar版本实例
         */
        public async Task<CreateSidecarInstanceResponse> CreateSidecarInstanceExAsync(CreateSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateSidecarInstanceResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.instance.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar版本实例列表
         * Summary: 查询sidecar版本实例列表
         */
        public ListSidecarInstanceResponse ListSidecarInstance(ListSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSidecarInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询sidecar版本实例列表
         * Summary: 查询sidecar版本实例列表
         */
        public async Task<ListSidecarInstanceResponse> ListSidecarInstanceAsync(ListSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSidecarInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询sidecar版本实例列表
         * Summary: 查询sidecar版本实例列表
         */
        public ListSidecarInstanceResponse ListSidecarInstanceEx(ListSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarInstanceResponse>(DoRequest("1.0", "antcloud.deps.sidecar.instance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sidecar版本实例列表
         * Summary: 查询sidecar版本实例列表
         */
        public async Task<ListSidecarInstanceResponse> ListSidecarInstanceExAsync(ListSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSidecarInstanceResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.instance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar版本实例
         * Summary: 获取sidecar版本实例
         */
        public GetSidecarInstanceResponse GetSidecarInstance(GetSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSidecarInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar版本实例
         * Summary: 获取sidecar版本实例
         */
        public async Task<GetSidecarInstanceResponse> GetSidecarInstanceAsync(GetSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSidecarInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar版本实例
         * Summary: 获取sidecar版本实例
         */
        public GetSidecarInstanceResponse GetSidecarInstanceEx(GetSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarInstanceResponse>(DoRequest("1.0", "antcloud.deps.sidecar.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar版本实例
         * Summary: 获取sidecar版本实例
         */
        public async Task<GetSidecarInstanceResponse> GetSidecarInstanceExAsync(GetSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarInstanceResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar类型
         * Summary: 获取sidecar类型
         */
        public GetSidecarResponse GetSidecar(GetSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar类型
         * Summary: 获取sidecar类型
         */
        public async Task<GetSidecarResponse> GetSidecarAsync(GetSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取sidecar类型
         * Summary: 获取sidecar类型
         */
        public GetSidecarResponse GetSidecarEx(GetSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarResponse>(DoRequest("1.0", "antcloud.deps.sidecar.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sidecar类型
         * Summary: 获取sidecar类型
         */
        public async Task<GetSidecarResponse> GetSidecarExAsync(GetSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar类型信息
         * Summary: 更新sidecar类型信息
         */
        public UpdateSidecarResponse UpdateSidecar(UpdateSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar类型信息
         * Summary: 更新sidecar类型信息
         */
        public async Task<UpdateSidecarResponse> UpdateSidecarAsync(UpdateSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar类型信息
         * Summary: 更新sidecar类型信息
         */
        public UpdateSidecarResponse UpdateSidecarEx(UpdateSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarResponse>(DoRequest("1.0", "antcloud.deps.sidecar.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar类型信息
         * Summary: 更新sidecar类型信息
         */
        public async Task<UpdateSidecarResponse> UpdateSidecarExAsync(UpdateSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sidecar类型
         * Summary: 删除sidecar类型
         */
        public DeleteSidecarResponse DeleteSidecar(DeleteSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 删除sidecar类型
         * Summary: 删除sidecar类型
         */
        public async Task<DeleteSidecarResponse> DeleteSidecarAsync(DeleteSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除sidecar类型
         * Summary: 删除sidecar类型
         */
        public DeleteSidecarResponse DeleteSidecarEx(DeleteSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSidecarResponse>(DoRequest("1.0", "antcloud.deps.sidecar.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sidecar类型
         * Summary: 删除sidecar类型
         */
        public async Task<DeleteSidecarResponse> DeleteSidecarExAsync(DeleteSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar版本
         * Summary: 更新sidecar版本
         */
        public UpdateSidecarVersionResponse UpdateSidecarVersion(UpdateSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecarVersionEx(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar版本
         * Summary: 更新sidecar版本
         */
        public async Task<UpdateSidecarVersionResponse> UpdateSidecarVersionAsync(UpdateSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecarVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar版本
         * Summary: 更新sidecar版本
         */
        public UpdateSidecarVersionResponse UpdateSidecarVersionEx(UpdateSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarVersionResponse>(DoRequest("1.0", "antcloud.deps.sidecar.version.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar版本
         * Summary: 更新sidecar版本
         */
        public async Task<UpdateSidecarVersionResponse> UpdateSidecarVersionExAsync(UpdateSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarVersionResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.version.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sidecar模板
         * Summary: 删除sidecar模板
         */
        public DeleteSidecarVersionResponse DeleteSidecarVersion(DeleteSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSidecarVersionEx(request, headers, runtime);
        }

        /**
         * Description: 删除sidecar模板
         * Summary: 删除sidecar模板
         */
        public async Task<DeleteSidecarVersionResponse> DeleteSidecarVersionAsync(DeleteSidecarVersionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSidecarVersionExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除sidecar模板
         * Summary: 删除sidecar模板
         */
        public DeleteSidecarVersionResponse DeleteSidecarVersionEx(DeleteSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSidecarVersionResponse>(DoRequest("1.0", "antcloud.deps.sidecar.version.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sidecar模板
         * Summary: 删除sidecar模板
         */
        public async Task<DeleteSidecarVersionResponse> DeleteSidecarVersionExAsync(DeleteSidecarVersionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSidecarVersionResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.version.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar版本实例
         * Summary: 更新sidecar版本实例
         */
        public UpdateSidecarInstanceResponse UpdateSidecarInstance(UpdateSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecarInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar版本实例
         * Summary: 更新sidecar版本实例
         */
        public async Task<UpdateSidecarInstanceResponse> UpdateSidecarInstanceAsync(UpdateSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecarInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar版本实例
         * Summary: 更新sidecar版本实例
         */
        public UpdateSidecarInstanceResponse UpdateSidecarInstanceEx(UpdateSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarInstanceResponse>(DoRequest("1.0", "antcloud.deps.sidecar.instance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar版本实例
         * Summary: 更新sidecar版本实例
         */
        public async Task<UpdateSidecarInstanceResponse> UpdateSidecarInstanceExAsync(UpdateSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarInstanceResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.instance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sidecar版本实例
         * Summary: 删除sidecar版本实例
         */
        public DeleteSidecarInstanceResponse DeleteSidecarInstance(DeleteSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSidecarInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 删除sidecar版本实例
         * Summary: 删除sidecar版本实例
         */
        public async Task<DeleteSidecarInstanceResponse> DeleteSidecarInstanceAsync(DeleteSidecarInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSidecarInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除sidecar版本实例
         * Summary: 删除sidecar版本实例
         */
        public DeleteSidecarInstanceResponse DeleteSidecarInstanceEx(DeleteSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSidecarInstanceResponse>(DoRequest("1.0", "antcloud.deps.sidecar.instance.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sidecar版本实例
         * Summary: 删除sidecar版本实例
         */
        public async Task<DeleteSidecarInstanceResponse> DeleteSidecarInstanceExAsync(DeleteSidecarInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSidecarInstanceResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.instance.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar规则
         * Summary: 更新sidecar规则
         */
        public UpdateSidecarRuleResponse UpdateSidecarRule(UpdateSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecarRuleEx(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar规则
         * Summary: 更新sidecar规则
         */
        public async Task<UpdateSidecarRuleResponse> UpdateSidecarRuleAsync(UpdateSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecarRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar规则
         * Summary: 更新sidecar规则
         */
        public UpdateSidecarRuleResponse UpdateSidecarRuleEx(UpdateSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarRuleResponse>(DoRequest("1.0", "antcloud.deps.sidecar.rule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar规则
         * Summary: 更新sidecar规则
         */
        public async Task<UpdateSidecarRuleResponse> UpdateSidecarRuleExAsync(UpdateSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarRuleResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.rule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sidecar规则
         * Summary: 删除sidecar规则
         */
        public DeleteSidecarRuleResponse DeleteSidecarRule(DeleteSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSidecarRuleEx(request, headers, runtime);
        }

        /**
         * Description: 删除sidecar规则
         * Summary: 删除sidecar规则
         */
        public async Task<DeleteSidecarRuleResponse> DeleteSidecarRuleAsync(DeleteSidecarRuleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSidecarRuleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除sidecar规则
         * Summary: 删除sidecar规则
         */
        public DeleteSidecarRuleResponse DeleteSidecarRuleEx(DeleteSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSidecarRuleResponse>(DoRequest("1.0", "antcloud.deps.sidecar.rule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sidecar规则
         * Summary: 删除sidecar规则
         */
        public async Task<DeleteSidecarRuleResponse> DeleteSidecarRuleExAsync(DeleteSidecarRuleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSidecarRuleResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.rule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar版本状态
         * Summary: 更新sidecar版本状态
         */
        public UpdateSidecarVersionstatusResponse UpdateSidecarVersionstatus(UpdateSidecarVersionstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecarVersionstatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar版本状态
         * Summary: 更新sidecar版本状态
         */
        public async Task<UpdateSidecarVersionstatusResponse> UpdateSidecarVersionstatusAsync(UpdateSidecarVersionstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecarVersionstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar版本状态
         * Summary: 更新sidecar版本状态
         */
        public UpdateSidecarVersionstatusResponse UpdateSidecarVersionstatusEx(UpdateSidecarVersionstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarVersionstatusResponse>(DoRequest("1.0", "antcloud.deps.sidecar.versionstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar版本状态
         * Summary: 更新sidecar版本状态
         */
        public async Task<UpdateSidecarVersionstatusResponse> UpdateSidecarVersionstatusExAsync(UpdateSidecarVersionstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarVersionstatusResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.versionstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar版本实例状态
         * Summary: 更新sidecar版本实例状态
         */
        public UpdateSidecarInstancestatusResponse UpdateSidecarInstancestatus(UpdateSidecarInstancestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecarInstancestatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar版本实例状态
         * Summary: 更新sidecar版本实例状态
         */
        public async Task<UpdateSidecarInstancestatusResponse> UpdateSidecarInstancestatusAsync(UpdateSidecarInstancestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecarInstancestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar版本实例状态
         * Summary: 更新sidecar版本实例状态
         */
        public UpdateSidecarInstancestatusResponse UpdateSidecarInstancestatusEx(UpdateSidecarInstancestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarInstancestatusResponse>(DoRequest("1.0", "antcloud.deps.sidecar.instancestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar版本实例状态
         * Summary: 更新sidecar版本实例状态
         */
        public async Task<UpdateSidecarInstancestatusResponse> UpdateSidecarInstancestatusExAsync(UpdateSidecarInstancestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarInstancestatusResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.instancestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar规则状态
         * Summary: 更新sidecar规则状态
         */
        public UpdateSidecarRulestatusResponse UpdateSidecarRulestatus(UpdateSidecarRulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSidecarRulestatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar规则状态
         * Summary: 更新sidecar规则状态
         */
        public async Task<UpdateSidecarRulestatusResponse> UpdateSidecarRulestatusAsync(UpdateSidecarRulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSidecarRulestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar规则状态
         * Summary: 更新sidecar规则状态
         */
        public UpdateSidecarRulestatusResponse UpdateSidecarRulestatusEx(UpdateSidecarRulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarRulestatusResponse>(DoRequest("1.0", "antcloud.deps.sidecar.rulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar规则状态
         * Summary: 更新sidecar规则状态
         */
        public async Task<UpdateSidecarRulestatusResponse> UpdateSidecarRulestatusExAsync(UpdateSidecarRulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSidecarRulestatusResponse>(await DoRequestAsync("1.0", "antcloud.deps.sidecar.rulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用sidecar基线
         * Summary: 创建应用sidecar基线
         */
        public CreateAppbaselineSidecarResponse CreateAppbaselineSidecar(CreateAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAppbaselineSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 创建应用sidecar基线
         * Summary: 创建应用sidecar基线
         */
        public async Task<CreateAppbaselineSidecarResponse> CreateAppbaselineSidecarAsync(CreateAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAppbaselineSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建应用sidecar基线
         * Summary: 创建应用sidecar基线
         */
        public CreateAppbaselineSidecarResponse CreateAppbaselineSidecarEx(CreateAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppbaselineSidecarResponse>(DoRequest("1.0", "antcloud.deps.appbaseline.sidecar.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建应用sidecar基线
         * Summary: 创建应用sidecar基线
         */
        public async Task<CreateAppbaselineSidecarResponse> CreateAppbaselineSidecarExAsync(CreateAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAppbaselineSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.appbaseline.sidecar.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用sidecar基线
         * Summary: 查询应用sidecar基线
         */
        public ListAppbaselineSidecarResponse ListAppbaselineSidecar(ListAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAppbaselineSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 查询应用sidecar基线
         * Summary: 查询应用sidecar基线
         */
        public async Task<ListAppbaselineSidecarResponse> ListAppbaselineSidecarAsync(ListAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAppbaselineSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询应用sidecar基线
         * Summary: 查询应用sidecar基线
         */
        public ListAppbaselineSidecarResponse ListAppbaselineSidecarEx(ListAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppbaselineSidecarResponse>(DoRequest("1.0", "antcloud.deps.appbaseline.sidecar.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询应用sidecar基线
         * Summary: 查询应用sidecar基线
         */
        public async Task<ListAppbaselineSidecarResponse> ListAppbaselineSidecarExAsync(ListAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAppbaselineSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.appbaseline.sidecar.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用sidecar基线
         * Summary: 删除应用sidecar基线
         */
        public DeleteAppbaselineSidecarResponse DeleteAppbaselineSidecar(DeleteAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAppbaselineSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 删除应用sidecar基线
         * Summary: 删除应用sidecar基线
         */
        public async Task<DeleteAppbaselineSidecarResponse> DeleteAppbaselineSidecarAsync(DeleteAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAppbaselineSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除应用sidecar基线
         * Summary: 删除应用sidecar基线
         */
        public DeleteAppbaselineSidecarResponse DeleteAppbaselineSidecarEx(DeleteAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppbaselineSidecarResponse>(DoRequest("1.0", "antcloud.deps.appbaseline.sidecar.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除应用sidecar基线
         * Summary: 删除应用sidecar基线
         */
        public async Task<DeleteAppbaselineSidecarResponse> DeleteAppbaselineSidecarExAsync(DeleteAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAppbaselineSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.appbaseline.sidecar.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用sidecar基线
         * Summary: 更新应用sidecar基线
         */
        public UpdateAppbaselineSidecarResponse UpdateAppbaselineSidecar(UpdateAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAppbaselineSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 更新应用sidecar基线
         * Summary: 更新应用sidecar基线
         */
        public async Task<UpdateAppbaselineSidecarResponse> UpdateAppbaselineSidecarAsync(UpdateAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAppbaselineSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新应用sidecar基线
         * Summary: 更新应用sidecar基线
         */
        public UpdateAppbaselineSidecarResponse UpdateAppbaselineSidecarEx(UpdateAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppbaselineSidecarResponse>(DoRequest("1.0", "antcloud.deps.appbaseline.sidecar.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新应用sidecar基线
         * Summary: 更新应用sidecar基线
         */
        public async Task<UpdateAppbaselineSidecarResponse> UpdateAppbaselineSidecarExAsync(UpdateAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAppbaselineSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.appbaseline.sidecar.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
         * Summary: 创建或更新应用sidecar基线
         */
        public SaveAppbaselineSidecarResponse SaveAppbaselineSidecar(SaveAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveAppbaselineSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
         * Summary: 创建或更新应用sidecar基线
         */
        public async Task<SaveAppbaselineSidecarResponse> SaveAppbaselineSidecarAsync(SaveAppbaselineSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveAppbaselineSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
         * Summary: 创建或更新应用sidecar基线
         */
        public SaveAppbaselineSidecarResponse SaveAppbaselineSidecarEx(SaveAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveAppbaselineSidecarResponse>(DoRequest("1.0", "antcloud.deps.appbaseline.sidecar.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建或更新应用sidecar基线，app_name category conditions更新的时候是主键
         * Summary: 创建或更新应用sidecar基线
         */
        public async Task<SaveAppbaselineSidecarResponse> SaveAppbaselineSidecarExAsync(SaveAppbaselineSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveAppbaselineSidecarResponse>(await DoRequestAsync("1.0", "antcloud.deps.appbaseline.sidecar.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace详情
         * Summary: 获取workspace
         */
        public GetWorkspaceResponse GetWorkspace(GetWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 查询workspace详情
         * Summary: 获取workspace
         */
        public async Task<GetWorkspaceResponse> GetWorkspaceAsync(GetWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询workspace详情
         * Summary: 获取workspace
         */
        public GetWorkspaceResponse GetWorkspaceEx(GetWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceResponse>(DoRequest("1.0", "antcloud.deps.workspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace详情
         * Summary: 获取workspace
         */
        public async Task<GetWorkspaceResponse> GetWorkspaceExAsync(GetWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspace.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace列表，可根据状态过滤。
         * Summary: 查询workspace
         */
        public QueryWorkspaceResponse QueryWorkspace(QueryWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 查询workspace列表，可根据状态过滤。
         * Summary: 查询workspace
         */
        public async Task<QueryWorkspaceResponse> QueryWorkspaceAsync(QueryWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询workspace列表，可根据状态过滤。
         * Summary: 查询workspace
         */
        public QueryWorkspaceResponse QueryWorkspaceEx(QueryWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkspaceResponse>(DoRequest("1.0", "antcloud.deps.workspace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace列表，可根据状态过滤。
         * Summary: 查询workspace
         */
        public async Task<QueryWorkspaceResponse> QueryWorkspaceExAsync(QueryWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspace.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建workspace
         * Summary: 创建workspace
         */
        public CreateWorkspaceResponse CreateWorkspace(CreateWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 创建workspace
         * Summary: 创建workspace
         */
        public async Task<CreateWorkspaceResponse> CreateWorkspaceAsync(CreateWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建workspace
         * Summary: 创建workspace
         */
        public CreateWorkspaceResponse CreateWorkspaceEx(CreateWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWorkspaceResponse>(DoRequest("1.0", "antcloud.deps.workspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建workspace
         * Summary: 创建workspace
         */
        public async Task<CreateWorkspaceResponse> CreateWorkspaceExAsync(CreateWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspace.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace列表2.0。
         * Summary: 查询workspace列表2.0
         */
        public ListWorkspaceResponse ListWorkspace(ListWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListWorkspaceEx(request, headers, runtime);
        }

        /**
         * Description: 查询workspace列表2.0。
         * Summary: 查询workspace列表2.0
         */
        public async Task<ListWorkspaceResponse> ListWorkspaceAsync(ListWorkspaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListWorkspaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询workspace列表2.0。
         * Summary: 查询workspace列表2.0
         */
        public ListWorkspaceResponse ListWorkspaceEx(ListWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWorkspaceResponse>(DoRequest("1.0", "antcloud.deps.workspace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询workspace列表2.0。
         * Summary: 查询workspace列表2.0
         */
        public async Task<ListWorkspaceResponse> ListWorkspaceExAsync(ListWorkspaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListWorkspaceResponse>(await DoRequestAsync("1.0", "antcloud.deps.workspace.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
