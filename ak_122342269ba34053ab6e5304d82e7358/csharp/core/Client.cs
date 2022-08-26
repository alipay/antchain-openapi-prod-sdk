// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_122342269ba34053ab6e5304d82e7358"},
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_122342269ba34053ab6e5304d82e7358"},
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
         * Description: 授权跨链数据访问
         * Summary: 授权跨链数据访问
         */
        public StartBaasOdatsAccesschainAuthorizeResponse StartBaasOdatsAccesschainAuthorize(StartBaasOdatsAccesschainAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasOdatsAccesschainAuthorizeEx(request, headers, runtime);
        }

        /**
         * Description: 授权跨链数据访问
         * Summary: 授权跨链数据访问
         */
        public async Task<StartBaasOdatsAccesschainAuthorizeResponse> StartBaasOdatsAccesschainAuthorizeAsync(StartBaasOdatsAccesschainAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasOdatsAccesschainAuthorizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权跨链数据访问
         * Summary: 授权跨链数据访问
         */
        public StartBaasOdatsAccesschainAuthorizeResponse StartBaasOdatsAccesschainAuthorizeEx(StartBaasOdatsAccesschainAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsAccesschainAuthorizeResponse>(DoRequest("1.0", "baas.odats.accesschain.authorize.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权跨链数据访问
         * Summary: 授权跨链数据访问
         */
        public async Task<StartBaasOdatsAccesschainAuthorizeResponse> StartBaasOdatsAccesschainAuthorizeExAsync(StartBaasOdatsAccesschainAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsAccesschainAuthorizeResponse>(await DoRequestAsync("1.0", "baas.odats.accesschain.authorize.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新跨链数据访问权限
         * Summary: 更新跨链数据访问权限
         */
        public UpdateBaasOdatsAccesschainAuthorizeResponse UpdateBaasOdatsAccesschainAuthorize(UpdateBaasOdatsAccesschainAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaasOdatsAccesschainAuthorizeEx(request, headers, runtime);
        }

        /**
         * Description: 更新跨链数据访问权限
         * Summary: 更新跨链数据访问权限
         */
        public async Task<UpdateBaasOdatsAccesschainAuthorizeResponse> UpdateBaasOdatsAccesschainAuthorizeAsync(UpdateBaasOdatsAccesschainAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaasOdatsAccesschainAuthorizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新跨链数据访问权限
         * Summary: 更新跨链数据访问权限
         */
        public UpdateBaasOdatsAccesschainAuthorizeResponse UpdateBaasOdatsAccesschainAuthorizeEx(UpdateBaasOdatsAccesschainAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasOdatsAccesschainAuthorizeResponse>(DoRequest("1.0", "baas.odats.accesschain.authorize.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新跨链数据访问权限
         * Summary: 更新跨链数据访问权限
         */
        public async Task<UpdateBaasOdatsAccesschainAuthorizeResponse> UpdateBaasOdatsAccesschainAuthorizeExAsync(UpdateBaasOdatsAccesschainAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasOdatsAccesschainAuthorizeResponse>(await DoRequestAsync("1.0", "baas.odats.accesschain.authorize.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链授权访问的链列表
         * Summary: 获取链授权访问的链列表
         */
        public ListBaasOdatsAccesschainAuthorizedResponse ListBaasOdatsAccesschainAuthorized(ListBaasOdatsAccesschainAuthorizedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBaasOdatsAccesschainAuthorizedEx(request, headers, runtime);
        }

        /**
         * Description: 获取链授权访问的链列表
         * Summary: 获取链授权访问的链列表
         */
        public async Task<ListBaasOdatsAccesschainAuthorizedResponse> ListBaasOdatsAccesschainAuthorizedAsync(ListBaasOdatsAccesschainAuthorizedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBaasOdatsAccesschainAuthorizedExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取链授权访问的链列表
         * Summary: 获取链授权访问的链列表
         */
        public ListBaasOdatsAccesschainAuthorizedResponse ListBaasOdatsAccesschainAuthorizedEx(ListBaasOdatsAccesschainAuthorizedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsAccesschainAuthorizedResponse>(DoRequest("1.0", "baas.odats.accesschain.authorized.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取链授权访问的链列表
         * Summary: 获取链授权访问的链列表
         */
        public async Task<ListBaasOdatsAccesschainAuthorizedResponse> ListBaasOdatsAccesschainAuthorizedExAsync(ListBaasOdatsAccesschainAuthorizedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsAccesschainAuthorizedResponse>(await DoRequestAsync("1.0", "baas.odats.accesschain.authorized.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询被授权访问数据的映射关系列表
         * Summary: 查询被授权访问数据的映射关系列表
         */
        public ListBaasOdatsAccesschainGrantedResponse ListBaasOdatsAccesschainGranted(ListBaasOdatsAccesschainGrantedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBaasOdatsAccesschainGrantedEx(request, headers, runtime);
        }

        /**
         * Description: 查询被授权访问数据的映射关系列表
         * Summary: 查询被授权访问数据的映射关系列表
         */
        public async Task<ListBaasOdatsAccesschainGrantedResponse> ListBaasOdatsAccesschainGrantedAsync(ListBaasOdatsAccesschainGrantedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBaasOdatsAccesschainGrantedExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询被授权访问数据的映射关系列表
         * Summary: 查询被授权访问数据的映射关系列表
         */
        public ListBaasOdatsAccesschainGrantedResponse ListBaasOdatsAccesschainGrantedEx(ListBaasOdatsAccesschainGrantedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsAccesschainGrantedResponse>(DoRequest("1.0", "baas.odats.accesschain.granted.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询被授权访问数据的映射关系列表
         * Summary: 查询被授权访问数据的映射关系列表
         */
        public async Task<ListBaasOdatsAccesschainGrantedResponse> ListBaasOdatsAccesschainGrantedExAsync(ListBaasOdatsAccesschainGrantedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsAccesschainGrantedResponse>(await DoRequestAsync("1.0", "baas.odats.accesschain.granted.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定链提供的可访问的资源类型
         * Summary: 获取指定链提供的可访问的资源类型
         */
        public ListBaasOdatsAccesschainResourcetypeResponse ListBaasOdatsAccesschainResourcetype(ListBaasOdatsAccesschainResourcetypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBaasOdatsAccesschainResourcetypeEx(request, headers, runtime);
        }

        /**
         * Description: 获取指定链提供的可访问的资源类型
         * Summary: 获取指定链提供的可访问的资源类型
         */
        public async Task<ListBaasOdatsAccesschainResourcetypeResponse> ListBaasOdatsAccesschainResourcetypeAsync(ListBaasOdatsAccesschainResourcetypeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBaasOdatsAccesschainResourcetypeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指定链提供的可访问的资源类型
         * Summary: 获取指定链提供的可访问的资源类型
         */
        public ListBaasOdatsAccesschainResourcetypeResponse ListBaasOdatsAccesschainResourcetypeEx(ListBaasOdatsAccesschainResourcetypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsAccesschainResourcetypeResponse>(DoRequest("1.0", "baas.odats.accesschain.resourcetype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定链提供的可访问的资源类型
         * Summary: 获取指定链提供的可访问的资源类型
         */
        public async Task<ListBaasOdatsAccesschainResourcetypeResponse> ListBaasOdatsAccesschainResourcetypeExAsync(ListBaasOdatsAccesschainResourcetypeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsAccesschainResourcetypeResponse>(await DoRequestAsync("1.0", "baas.odats.accesschain.resourcetype.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销跨链访问数据/调用权限
         * Summary: 撤销跨链访问数据/调用权限
         */
        public DisableBaasOdatsAclResponse DisableBaasOdatsAcl(DisableBaasOdatsAclRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableBaasOdatsAclEx(request, headers, runtime);
        }

        /**
         * Description: 撤销跨链访问数据/调用权限
         * Summary: 撤销跨链访问数据/调用权限
         */
        public async Task<DisableBaasOdatsAclResponse> DisableBaasOdatsAclAsync(DisableBaasOdatsAclRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableBaasOdatsAclExAsync(request, headers, runtime);
        }

        /**
         * Description: 撤销跨链访问数据/调用权限
         * Summary: 撤销跨链访问数据/调用权限
         */
        public DisableBaasOdatsAclResponse DisableBaasOdatsAclEx(DisableBaasOdatsAclRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableBaasOdatsAclResponse>(DoRequest("1.0", "baas.odats.acl.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销跨链访问数据/调用权限
         * Summary: 撤销跨链访问数据/调用权限
         */
        public async Task<DisableBaasOdatsAclResponse> DisableBaasOdatsAclExAsync(DisableBaasOdatsAclRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableBaasOdatsAclResponse>(await DoRequestAsync("1.0", "baas.odats.acl.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户是否已经开通odats服务
         * Summary: 查询用户是否已经开通odats服务
         */
        public QueryBaasOdatsActivestatusResponse QueryBaasOdatsActivestatus(QueryBaasOdatsActivestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasOdatsActivestatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户是否已经开通odats服务
         * Summary: 查询用户是否已经开通odats服务
         */
        public async Task<QueryBaasOdatsActivestatusResponse> QueryBaasOdatsActivestatusAsync(QueryBaasOdatsActivestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasOdatsActivestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户是否已经开通odats服务
         * Summary: 查询用户是否已经开通odats服务
         */
        public QueryBaasOdatsActivestatusResponse QueryBaasOdatsActivestatusEx(QueryBaasOdatsActivestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsActivestatusResponse>(DoRequest("1.0", "baas.odats.activestatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户是否已经开通odats服务
         * Summary: 查询用户是否已经开通odats服务
         */
        public async Task<QueryBaasOdatsActivestatusResponse> QueryBaasOdatsActivestatusExAsync(QueryBaasOdatsActivestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsActivestatusResponse>(await DoRequestAsync("1.0", "baas.odats.activestatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户是否已经同意odats服务协议
         * Summary: 查询用户是否已经同意odats服务协议
         */
        public QueryBaasOdatsAgreementResponse QueryBaasOdatsAgreement(QueryBaasOdatsAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasOdatsAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 查询用户是否已经同意odats服务协议
         * Summary: 查询用户是否已经同意odats服务协议
         */
        public async Task<QueryBaasOdatsAgreementResponse> QueryBaasOdatsAgreementAsync(QueryBaasOdatsAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasOdatsAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询用户是否已经同意odats服务协议
         * Summary: 查询用户是否已经同意odats服务协议
         */
        public QueryBaasOdatsAgreementResponse QueryBaasOdatsAgreementEx(QueryBaasOdatsAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsAgreementResponse>(DoRequest("1.0", "baas.odats.agreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询用户是否已经同意odats服务协议
         * Summary: 查询用户是否已经同意odats服务协议
         */
        public async Task<QueryBaasOdatsAgreementResponse> QueryBaasOdatsAgreementExAsync(QueryBaasOdatsAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsAgreementResponse>(await DoRequestAsync("1.0", "baas.odats.agreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户同意授权之后保持状态
         * Summary: 用户同意授权之后保持状态
         */
        public SaveBaasOdatsAgreementResponse SaveBaasOdatsAgreement(SaveBaasOdatsAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveBaasOdatsAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 用户同意授权之后保持状态
         * Summary: 用户同意授权之后保持状态
         */
        public async Task<SaveBaasOdatsAgreementResponse> SaveBaasOdatsAgreementAsync(SaveBaasOdatsAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveBaasOdatsAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户同意授权之后保持状态
         * Summary: 用户同意授权之后保持状态
         */
        public SaveBaasOdatsAgreementResponse SaveBaasOdatsAgreementEx(SaveBaasOdatsAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBaasOdatsAgreementResponse>(DoRequest("1.0", "baas.odats.agreement.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户同意授权之后保持状态
         * Summary: 用户同意授权之后保持状态
         */
        public async Task<SaveBaasOdatsAgreementResponse> SaveBaasOdatsAgreementExAsync(SaveBaasOdatsAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveBaasOdatsAgreementResponse>(await DoRequestAsync("1.0", "baas.odats.agreement.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册的链的基本信息
         * Summary: 查询注册的链的基本信息
         */
        public QueryBaasOdatsBlockchainBaseinfoResponse QueryBaasOdatsBlockchainBaseinfo(QueryBaasOdatsBlockchainBaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasOdatsBlockchainBaseinfoEx(request, headers, runtime);
        }

        /**
         * Description: 查询注册的链的基本信息
         * Summary: 查询注册的链的基本信息
         */
        public async Task<QueryBaasOdatsBlockchainBaseinfoResponse> QueryBaasOdatsBlockchainBaseinfoAsync(QueryBaasOdatsBlockchainBaseinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasOdatsBlockchainBaseinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询注册的链的基本信息
         * Summary: 查询注册的链的基本信息
         */
        public QueryBaasOdatsBlockchainBaseinfoResponse QueryBaasOdatsBlockchainBaseinfoEx(QueryBaasOdatsBlockchainBaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsBlockchainBaseinfoResponse>(DoRequest("1.0", "baas.odats.blockchain.baseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册的链的基本信息
         * Summary: 查询注册的链的基本信息
         */
        public async Task<QueryBaasOdatsBlockchainBaseinfoResponse> QueryBaasOdatsBlockchainBaseinfoExAsync(QueryBaasOdatsBlockchainBaseinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsBlockchainBaseinfoResponse>(await DoRequestAsync("1.0", "baas.odats.blockchain.baseinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取跨链合约信息
         * Summary: 获取跨链合约信息
         */
        public QueryBaasOdatsBlockchainContractinfoResponse QueryBaasOdatsBlockchainContractinfo(QueryBaasOdatsBlockchainContractinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasOdatsBlockchainContractinfoEx(request, headers, runtime);
        }

        /**
         * Description: 获取跨链合约信息
         * Summary: 获取跨链合约信息
         */
        public async Task<QueryBaasOdatsBlockchainContractinfoResponse> QueryBaasOdatsBlockchainContractinfoAsync(QueryBaasOdatsBlockchainContractinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasOdatsBlockchainContractinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取跨链合约信息
         * Summary: 获取跨链合约信息
         */
        public QueryBaasOdatsBlockchainContractinfoResponse QueryBaasOdatsBlockchainContractinfoEx(QueryBaasOdatsBlockchainContractinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsBlockchainContractinfoResponse>(DoRequest("1.0", "baas.odats.blockchain.contractinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取跨链合约信息
         * Summary: 获取跨链合约信息
         */
        public async Task<QueryBaasOdatsBlockchainContractinfoResponse> QueryBaasOdatsBlockchainContractinfoExAsync(QueryBaasOdatsBlockchainContractinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsBlockchainContractinfoResponse>(await DoRequestAsync("1.0", "baas.odats.blockchain.contractinfo.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新跨链访问权限
         * Summary: 更新跨链访问权限
         */
        public UpdateBaasOdatsCrosschaimAuthorizeResponse UpdateBaasOdatsCrosschaimAuthorize(UpdateBaasOdatsCrosschaimAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaasOdatsCrosschaimAuthorizeEx(request, headers, runtime);
        }

        /**
         * Description: 更新跨链访问权限
         * Summary: 更新跨链访问权限
         */
        public async Task<UpdateBaasOdatsCrosschaimAuthorizeResponse> UpdateBaasOdatsCrosschaimAuthorizeAsync(UpdateBaasOdatsCrosschaimAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaasOdatsCrosschaimAuthorizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新跨链访问权限
         * Summary: 更新跨链访问权限
         */
        public UpdateBaasOdatsCrosschaimAuthorizeResponse UpdateBaasOdatsCrosschaimAuthorizeEx(UpdateBaasOdatsCrosschaimAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasOdatsCrosschaimAuthorizeResponse>(DoRequest("1.0", "baas.odats.crosschaim.authorize.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新跨链访问权限
         * Summary: 更新跨链访问权限
         */
        public async Task<UpdateBaasOdatsCrosschaimAuthorizeResponse> UpdateBaasOdatsCrosschaimAuthorizeExAsync(UpdateBaasOdatsCrosschaimAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasOdatsCrosschaimAuthorizeResponse>(await DoRequestAsync("1.0", "baas.odats.crosschaim.authorize.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权跨链合约调用权限
         * Summary: 授权跨链合约调用权限
         */
        public StartBaasOdatsCrosschainAuthorizeResponse StartBaasOdatsCrosschainAuthorize(StartBaasOdatsCrosschainAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasOdatsCrosschainAuthorizeEx(request, headers, runtime);
        }

        /**
         * Description: 授权跨链合约调用权限
         * Summary: 授权跨链合约调用权限
         */
        public async Task<StartBaasOdatsCrosschainAuthorizeResponse> StartBaasOdatsCrosschainAuthorizeAsync(StartBaasOdatsCrosschainAuthorizeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasOdatsCrosschainAuthorizeExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权跨链合约调用权限
         * Summary: 授权跨链合约调用权限
         */
        public StartBaasOdatsCrosschainAuthorizeResponse StartBaasOdatsCrosschainAuthorizeEx(StartBaasOdatsCrosschainAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsCrosschainAuthorizeResponse>(DoRequest("1.0", "baas.odats.crosschain.authorize.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权跨链合约调用权限
         * Summary: 授权跨链合约调用权限
         */
        public async Task<StartBaasOdatsCrosschainAuthorizeResponse> StartBaasOdatsCrosschainAuthorizeExAsync(StartBaasOdatsCrosschainAuthorizeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsCrosschainAuthorizeResponse>(await DoRequestAsync("1.0", "baas.odats.crosschain.authorize.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定自有链已授权的信息列表
         * Summary: 获取指定自有链已授权的信息列表
         */
        public ListBaasOdatsCrosschainAuthorizedResponse ListBaasOdatsCrosschainAuthorized(ListBaasOdatsCrosschainAuthorizedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBaasOdatsCrosschainAuthorizedEx(request, headers, runtime);
        }

        /**
         * Description: 获取指定自有链已授权的信息列表
         * Summary: 获取指定自有链已授权的信息列表
         */
        public async Task<ListBaasOdatsCrosschainAuthorizedResponse> ListBaasOdatsCrosschainAuthorizedAsync(ListBaasOdatsCrosschainAuthorizedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBaasOdatsCrosschainAuthorizedExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取指定自有链已授权的信息列表
         * Summary: 获取指定自有链已授权的信息列表
         */
        public ListBaasOdatsCrosschainAuthorizedResponse ListBaasOdatsCrosschainAuthorizedEx(ListBaasOdatsCrosschainAuthorizedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsCrosschainAuthorizedResponse>(DoRequest("1.0", "baas.odats.crosschain.authorized.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取指定自有链已授权的信息列表
         * Summary: 获取指定自有链已授权的信息列表
         */
        public async Task<ListBaasOdatsCrosschainAuthorizedResponse> ListBaasOdatsCrosschainAuthorizedExAsync(ListBaasOdatsCrosschainAuthorizedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsCrosschainAuthorizedResponse>(await DoRequestAsync("1.0", "baas.odats.crosschain.authorized.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取目标链被授权的映射关系列表
         * Summary: 获取目标链被授权的映射关系列表
         */
        public ListBaasOdatsCrosschainGrantedResponse ListBaasOdatsCrosschainGranted(ListBaasOdatsCrosschainGrantedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBaasOdatsCrosschainGrantedEx(request, headers, runtime);
        }

        /**
         * Description: 获取目标链被授权的映射关系列表
         * Summary: 获取目标链被授权的映射关系列表
         */
        public async Task<ListBaasOdatsCrosschainGrantedResponse> ListBaasOdatsCrosschainGrantedAsync(ListBaasOdatsCrosschainGrantedRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBaasOdatsCrosschainGrantedExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取目标链被授权的映射关系列表
         * Summary: 获取目标链被授权的映射关系列表
         */
        public ListBaasOdatsCrosschainGrantedResponse ListBaasOdatsCrosschainGrantedEx(ListBaasOdatsCrosschainGrantedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsCrosschainGrantedResponse>(DoRequest("1.0", "baas.odats.crosschain.granted.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取目标链被授权的映射关系列表
         * Summary: 获取目标链被授权的映射关系列表
         */
        public async Task<ListBaasOdatsCrosschainGrantedResponse> ListBaasOdatsCrosschainGrantedExAsync(ListBaasOdatsCrosschainGrantedRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsCrosschainGrantedResponse>(await DoRequestAsync("1.0", "baas.odats.crosschain.granted.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取域名证书
         * Summary: 获取域名证书
         */
        public QueryBaasOdatsDomaincertResponse QueryBaasOdatsDomaincert(QueryBaasOdatsDomaincertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasOdatsDomaincertEx(request, headers, runtime);
        }

        /**
         * Description: 获取域名证书
         * Summary: 获取域名证书
         */
        public async Task<QueryBaasOdatsDomaincertResponse> QueryBaasOdatsDomaincertAsync(QueryBaasOdatsDomaincertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasOdatsDomaincertExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取域名证书
         * Summary: 获取域名证书
         */
        public QueryBaasOdatsDomaincertResponse QueryBaasOdatsDomaincertEx(QueryBaasOdatsDomaincertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsDomaincertResponse>(DoRequest("1.0", "baas.odats.domaincert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取域名证书
         * Summary: 获取域名证书
         */
        public async Task<QueryBaasOdatsDomaincertResponse> QueryBaasOdatsDomaincertExAsync(QueryBaasOdatsDomaincertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsDomaincertResponse>(await DoRequestAsync("1.0", "baas.odats.domaincert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询跨链合约
         * Summary: 查询跨链CC
         */
        public QueryBaasOdatsFabricCcResponse QueryBaasOdatsFabricCc(QueryBaasOdatsFabricCcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasOdatsFabricCcEx(request, headers, runtime);
        }

        /**
         * Description: 查询跨链合约
         * Summary: 查询跨链CC
         */
        public async Task<QueryBaasOdatsFabricCcResponse> QueryBaasOdatsFabricCcAsync(QueryBaasOdatsFabricCcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasOdatsFabricCcExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询跨链合约
         * Summary: 查询跨链CC
         */
        public QueryBaasOdatsFabricCcResponse QueryBaasOdatsFabricCcEx(QueryBaasOdatsFabricCcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsFabricCcResponse>(DoRequest("1.0", "baas.odats.fabric.cc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询跨链合约
         * Summary: 查询跨链CC
         */
        public async Task<QueryBaasOdatsFabricCcResponse> QueryBaasOdatsFabricCcExAsync(QueryBaasOdatsFabricCcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsFabricCcResponse>(await DoRequestAsync("1.0", "baas.odats.fabric.cc.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询fabric CC的oss路径
         * Summary: 查询fabric CC的oss路径
         */
        public QueryBaasOdatsFabricChaincodepathResponse QueryBaasOdatsFabricChaincodepath(QueryBaasOdatsFabricChaincodepathRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasOdatsFabricChaincodepathEx(request, headers, runtime);
        }

        /**
         * Description: 查询fabric CC的oss路径
         * Summary: 查询fabric CC的oss路径
         */
        public async Task<QueryBaasOdatsFabricChaincodepathResponse> QueryBaasOdatsFabricChaincodepathAsync(QueryBaasOdatsFabricChaincodepathRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasOdatsFabricChaincodepathExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询fabric CC的oss路径
         * Summary: 查询fabric CC的oss路径
         */
        public QueryBaasOdatsFabricChaincodepathResponse QueryBaasOdatsFabricChaincodepathEx(QueryBaasOdatsFabricChaincodepathRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsFabricChaincodepathResponse>(DoRequest("1.0", "baas.odats.fabric.chaincodepath.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询fabric CC的oss路径
         * Summary: 查询fabric CC的oss路径
         */
        public async Task<QueryBaasOdatsFabricChaincodepathResponse> QueryBaasOdatsFabricChaincodepathExAsync(QueryBaasOdatsFabricChaincodepathRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsFabricChaincodepathResponse>(await DoRequestAsync("1.0", "baas.odats.fabric.chaincodepath.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 处理fabric配置文件
         * Summary: 处理fabric配置文件
         */
        public StartBaasOdatsFabricConfigyamlResponse StartBaasOdatsFabricConfigyaml(StartBaasOdatsFabricConfigyamlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasOdatsFabricConfigyamlEx(request, headers, runtime);
        }

        /**
         * Description: 处理fabric配置文件
         * Summary: 处理fabric配置文件
         */
        public async Task<StartBaasOdatsFabricConfigyamlResponse> StartBaasOdatsFabricConfigyamlAsync(StartBaasOdatsFabricConfigyamlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasOdatsFabricConfigyamlExAsync(request, headers, runtime);
        }

        /**
         * Description: 处理fabric配置文件
         * Summary: 处理fabric配置文件
         */
        public StartBaasOdatsFabricConfigyamlResponse StartBaasOdatsFabricConfigyamlEx(StartBaasOdatsFabricConfigyamlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsFabricConfigyamlResponse>(DoRequest("1.0", "baas.odats.fabric.configyaml.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 处理fabric配置文件
         * Summary: 处理fabric配置文件
         */
        public async Task<StartBaasOdatsFabricConfigyamlResponse> StartBaasOdatsFabricConfigyamlExAsync(StartBaasOdatsFabricConfigyamlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsFabricConfigyamlResponse>(await DoRequestAsync("1.0", "baas.odats.fabric.configyaml.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册fabric链
         * Summary: 注册fabric链
         */
        public StartBaasOdatsFabricResponse StartBaasOdatsFabric(StartBaasOdatsFabricRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasOdatsFabricEx(request, headers, runtime);
        }

        /**
         * Description: 注册fabric链
         * Summary: 注册fabric链
         */
        public async Task<StartBaasOdatsFabricResponse> StartBaasOdatsFabricAsync(StartBaasOdatsFabricRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasOdatsFabricExAsync(request, headers, runtime);
        }

        /**
         * Description: 注册fabric链
         * Summary: 注册fabric链
         */
        public StartBaasOdatsFabricResponse StartBaasOdatsFabricEx(StartBaasOdatsFabricRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsFabricResponse>(DoRequest("1.0", "baas.odats.fabric.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册fabric链
         * Summary: 注册fabric链
         */
        public async Task<StartBaasOdatsFabricResponse> StartBaasOdatsFabricExAsync(StartBaasOdatsFabricRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsFabricResponse>(await DoRequestAsync("1.0", "baas.odats.fabric.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向odats注册mychain链
         * Summary: 向odats注册mychain链
         */
        public StartBaasOdatsMychainResponse StartBaasOdatsMychain(StartBaasOdatsMychainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartBaasOdatsMychainEx(request, headers, runtime);
        }

        /**
         * Description: 向odats注册mychain链
         * Summary: 向odats注册mychain链
         */
        public async Task<StartBaasOdatsMychainResponse> StartBaasOdatsMychainAsync(StartBaasOdatsMychainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartBaasOdatsMychainExAsync(request, headers, runtime);
        }

        /**
         * Description: 向odats注册mychain链
         * Summary: 向odats注册mychain链
         */
        public StartBaasOdatsMychainResponse StartBaasOdatsMychainEx(StartBaasOdatsMychainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsMychainResponse>(DoRequest("1.0", "baas.odats.mychain.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 向odats注册mychain链
         * Summary: 向odats注册mychain链
         */
        public async Task<StartBaasOdatsMychainResponse> StartBaasOdatsMychainExAsync(StartBaasOdatsMychainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartBaasOdatsMychainResponse>(await DoRequestAsync("1.0", "baas.odats.mychain.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册的blockchain列表
         * Summary: 查询注册的blockchain列表
         */
        public ListBaasOdatsRegisteredblockchainResponse ListBaasOdatsRegisteredblockchain(ListBaasOdatsRegisteredblockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListBaasOdatsRegisteredblockchainEx(request, headers, runtime);
        }

        /**
         * Description: 查询注册的blockchain列表
         * Summary: 查询注册的blockchain列表
         */
        public async Task<ListBaasOdatsRegisteredblockchainResponse> ListBaasOdatsRegisteredblockchainAsync(ListBaasOdatsRegisteredblockchainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListBaasOdatsRegisteredblockchainExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询注册的blockchain列表
         * Summary: 查询注册的blockchain列表
         */
        public ListBaasOdatsRegisteredblockchainResponse ListBaasOdatsRegisteredblockchainEx(ListBaasOdatsRegisteredblockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsRegisteredblockchainResponse>(DoRequest("1.0", "baas.odats.registeredblockchain.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册的blockchain列表
         * Summary: 查询注册的blockchain列表
         */
        public async Task<ListBaasOdatsRegisteredblockchainResponse> ListBaasOdatsRegisteredblockchainExAsync(ListBaasOdatsRegisteredblockchainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListBaasOdatsRegisteredblockchainResponse>(await DoRequestAsync("1.0", "baas.odats.registeredblockchain.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取udns证书
         * Summary: 获取udns证书
         */
        public QueryBaasOdatsUdnscertResponse QueryBaasOdatsUdnscert(QueryBaasOdatsUdnscertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasOdatsUdnscertEx(request, headers, runtime);
        }

        /**
         * Description: 获取udns证书
         * Summary: 获取udns证书
         */
        public async Task<QueryBaasOdatsUdnscertResponse> QueryBaasOdatsUdnscertAsync(QueryBaasOdatsUdnscertRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasOdatsUdnscertExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取udns证书
         * Summary: 获取udns证书
         */
        public QueryBaasOdatsUdnscertResponse QueryBaasOdatsUdnscertEx(QueryBaasOdatsUdnscertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsUdnscertResponse>(DoRequest("1.0", "baas.odats.udnscert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取udns证书
         * Summary: 获取udns证书
         */
        public async Task<QueryBaasOdatsUdnscertResponse> QueryBaasOdatsUdnscertExAsync(QueryBaasOdatsUdnscertRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasOdatsUdnscertResponse>(await DoRequestAsync("1.0", "baas.odats.udnscert.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
