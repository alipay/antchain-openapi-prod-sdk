// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.MS.Models;

namespace AntChain.SDK.MS
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
                        {"sdk_version", "3.4.0"},
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
                        {"sdk_version", "3.4.0"},
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
         * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
         * Summary: 动态配置持久化推送
         */
        public PersistpushMsDdcsResponse PersistpushMsDdcs(PersistpushMsDdcsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PersistpushMsDdcsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
         * Summary: 动态配置持久化推送
         */
        public async Task<PersistpushMsDdcsResponse> PersistpushMsDdcsAsync(PersistpushMsDdcsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PersistpushMsDdcsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
         * Summary: 动态配置持久化推送
         */
        public PersistpushMsDdcsResponse PersistpushMsDdcsEx(PersistpushMsDdcsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PersistpushMsDdcsResponse>(DoRequest("1.0", "ms.ddcs.persistpush", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
         * Summary: 动态配置持久化推送
         */
        public async Task<PersistpushMsDdcsResponse> PersistpushMsDdcsExAsync(PersistpushMsDdcsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PersistpushMsDdcsResponse>(await DoRequestAsync("1.0", "ms.ddcs.persistpush", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
         * Summary: 查询动态配置订阅客户端
         */
        public QueryclientsMsDdcsResponse QueryclientsMsDdcs(QueryclientsMsDdcsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryclientsMsDdcsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
         * Summary: 查询动态配置订阅客户端
         */
        public async Task<QueryclientsMsDdcsResponse> QueryclientsMsDdcsAsync(QueryclientsMsDdcsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryclientsMsDdcsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
         * Summary: 查询动态配置订阅客户端
         */
        public QueryclientsMsDdcsResponse QueryclientsMsDdcsEx(QueryclientsMsDdcsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryclientsMsDdcsResponse>(DoRequest("1.0", "ms.ddcs.queryclients", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
         * Summary: 查询动态配置订阅客户端
         */
        public async Task<QueryclientsMsDdcsResponse> QueryclientsMsDdcsExAsync(QueryclientsMsDdcsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryclientsMsDdcsResponse>(await DoRequestAsync("1.0", "ms.ddcs.queryclients", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-添加动态资源
         * Summary: 添加 DDCS 资源
         */
        public AddMsDdcsResourceResponse AddMsDdcsResource(AddMsDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddMsDdcsResourceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-添加动态资源
         * Summary: 添加 DDCS 资源
         */
        public async Task<AddMsDdcsResourceResponse> AddMsDdcsResourceAsync(AddMsDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddMsDdcsResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-添加动态资源
         * Summary: 添加 DDCS 资源
         */
        public AddMsDdcsResourceResponse AddMsDdcsResourceEx(AddMsDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMsDdcsResourceResponse>(DoRequest("1.0", "ms.ddcs.resource.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-添加动态资源
         * Summary: 添加 DDCS 资源
         */
        public async Task<AddMsDdcsResourceResponse> AddMsDdcsResourceExAsync(AddMsDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMsDdcsResourceResponse>(await DoRequestAsync("1.0", "ms.ddcs.resource.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-编辑动态资源
         * Summary: 编辑 DDCS 资源
         */
        public UpdateMsDdcsResourceResponse UpdateMsDdcsResource(UpdateMsDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMsDdcsResourceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-编辑动态资源
         * Summary: 编辑 DDCS 资源
         */
        public async Task<UpdateMsDdcsResourceResponse> UpdateMsDdcsResourceAsync(UpdateMsDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMsDdcsResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-编辑动态资源
         * Summary: 编辑 DDCS 资源
         */
        public UpdateMsDdcsResourceResponse UpdateMsDdcsResourceEx(UpdateMsDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMsDdcsResourceResponse>(DoRequest("1.0", "ms.ddcs.resource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-编辑动态资源
         * Summary: 编辑 DDCS 资源
         */
        public async Task<UpdateMsDdcsResourceResponse> UpdateMsDdcsResourceExAsync(UpdateMsDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMsDdcsResourceResponse>(await DoRequestAsync("1.0", "ms.ddcs.resource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-删除动态资源
         * Summary: 删除 DDCS 资源
         */
        public DeleteMsDdcsResourceResponse DeleteMsDdcsResource(DeleteMsDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMsDdcsResourceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-删除动态资源
         * Summary: 删除 DDCS 资源
         */
        public async Task<DeleteMsDdcsResourceResponse> DeleteMsDdcsResourceAsync(DeleteMsDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMsDdcsResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-删除动态资源
         * Summary: 删除 DDCS 资源
         */
        public DeleteMsDdcsResourceResponse DeleteMsDdcsResourceEx(DeleteMsDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsDdcsResourceResponse>(DoRequest("1.0", "ms.ddcs.resource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-删除动态资源
         * Summary: 删除 DDCS 资源
         */
        public async Task<DeleteMsDdcsResourceResponse> DeleteMsDdcsResourceExAsync(DeleteMsDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsDdcsResourceResponse>(await DoRequestAsync("1.0", "ms.ddcs.resource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-添加属性
         * Summary: 添加属性
         */
        public AddMsDdcsAttributeResponse AddMsDdcsAttribute(AddMsDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddMsDdcsAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-添加属性
         * Summary: 添加属性
         */
        public async Task<AddMsDdcsAttributeResponse> AddMsDdcsAttributeAsync(AddMsDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddMsDdcsAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-添加属性
         * Summary: 添加属性
         */
        public AddMsDdcsAttributeResponse AddMsDdcsAttributeEx(AddMsDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMsDdcsAttributeResponse>(DoRequest("1.0", "ms.ddcs.attribute.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-添加属性
         * Summary: 添加属性
         */
        public async Task<AddMsDdcsAttributeResponse> AddMsDdcsAttributeExAsync(AddMsDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMsDdcsAttributeResponse>(await DoRequestAsync("1.0", "ms.ddcs.attribute.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-编辑属性
         * Summary: 编辑属性
         */
        public UpdateMsDdcsAttributeResponse UpdateMsDdcsAttribute(UpdateMsDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMsDdcsAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-编辑属性
         * Summary: 编辑属性
         */
        public async Task<UpdateMsDdcsAttributeResponse> UpdateMsDdcsAttributeAsync(UpdateMsDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMsDdcsAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-编辑属性
         * Summary: 编辑属性
         */
        public UpdateMsDdcsAttributeResponse UpdateMsDdcsAttributeEx(UpdateMsDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMsDdcsAttributeResponse>(DoRequest("1.0", "ms.ddcs.attribute.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-编辑属性
         * Summary: 编辑属性
         */
        public async Task<UpdateMsDdcsAttributeResponse> UpdateMsDdcsAttributeExAsync(UpdateMsDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMsDdcsAttributeResponse>(await DoRequestAsync("1.0", "ms.ddcs.attribute.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-删除属性
         * Summary: 删除属性
         */
        public DeleteMsDdcsAttributeResponse DeleteMsDdcsAttribute(DeleteMsDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMsDdcsAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-删除属性
         * Summary: 删除属性
         */
        public async Task<DeleteMsDdcsAttributeResponse> DeleteMsDdcsAttributeAsync(DeleteMsDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMsDdcsAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-删除属性
         * Summary: 删除属性
         */
        public DeleteMsDdcsAttributeResponse DeleteMsDdcsAttributeEx(DeleteMsDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsDdcsAttributeResponse>(DoRequest("1.0", "ms.ddcs.attribute.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-删除属性
         * Summary: 删除属性
         */
        public async Task<DeleteMsDdcsAttributeResponse> DeleteMsDdcsAttributeExAsync(DeleteMsDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsDdcsAttributeResponse>(await DoRequestAsync("1.0", "ms.ddcs.attribute.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-查找动态配置
         * Summary: 查找动态资源
         */
        public SearchMsDdcsResourceResponse SearchMsDdcsResource(SearchMsDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SearchMsDdcsResourceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-查找动态配置
         * Summary: 查找动态资源
         */
        public async Task<SearchMsDdcsResourceResponse> SearchMsDdcsResourceAsync(SearchMsDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SearchMsDdcsResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-查找动态配置
         * Summary: 查找动态资源
         */
        public SearchMsDdcsResourceResponse SearchMsDdcsResourceEx(SearchMsDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMsDdcsResourceResponse>(DoRequest("1.0", "ms.ddcs.resource.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-查找动态配置
         * Summary: 查找动态资源
         */
        public async Task<SearchMsDdcsResourceResponse> SearchMsDdcsResourceExAsync(SearchMsDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMsDdcsResourceResponse>(await DoRequestAsync("1.0", "ms.ddcs.resource.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-添加调度任务
         * Summary: 添加调度任务
         */
        public AddMsDssTaskResponse AddMsDssTask(AddMsDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddMsDssTaskEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-添加调度任务
         * Summary: 添加调度任务
         */
        public async Task<AddMsDssTaskResponse> AddMsDssTaskAsync(AddMsDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddMsDssTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-添加调度任务
         * Summary: 添加调度任务
         */
        public AddMsDssTaskResponse AddMsDssTaskEx(AddMsDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMsDssTaskResponse>(DoRequest("1.0", "ms.dss.task.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-添加调度任务
         * Summary: 添加调度任务
         */
        public async Task<AddMsDssTaskResponse> AddMsDssTaskExAsync(AddMsDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddMsDssTaskResponse>(await DoRequestAsync("1.0", "ms.dss.task.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-编辑调度任务
         * Summary: 编辑调度任务
         */
        public UpdateMsDssTaskResponse UpdateMsDssTask(UpdateMsDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateMsDssTaskEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-编辑调度任务
         * Summary: 编辑调度任务
         */
        public async Task<UpdateMsDssTaskResponse> UpdateMsDssTaskAsync(UpdateMsDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateMsDssTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-编辑调度任务
         * Summary: 编辑调度任务
         */
        public UpdateMsDssTaskResponse UpdateMsDssTaskEx(UpdateMsDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMsDssTaskResponse>(DoRequest("1.0", "ms.dss.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-编辑调度任务
         * Summary: 编辑调度任务
         */
        public async Task<UpdateMsDssTaskResponse> UpdateMsDssTaskExAsync(UpdateMsDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateMsDssTaskResponse>(await DoRequestAsync("1.0", "ms.dss.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务
         * Summary: 删除调度任务
         */
        public DeleteMsDssTaskResponse DeleteMsDssTask(DeleteMsDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteMsDssTaskEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务
         * Summary: 删除调度任务
         */
        public async Task<DeleteMsDssTaskResponse> DeleteMsDssTaskAsync(DeleteMsDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteMsDssTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务
         * Summary: 删除调度任务
         */
        public DeleteMsDssTaskResponse DeleteMsDssTaskEx(DeleteMsDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsDssTaskResponse>(DoRequest("1.0", "ms.dss.task.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务
         * Summary: 删除调度任务
         */
        public async Task<DeleteMsDssTaskResponse> DeleteMsDssTaskExAsync(DeleteMsDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteMsDssTaskResponse>(await DoRequestAsync("1.0", "ms.dss.task.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务
         * Summary: 查找调度任务
         */
        public SearchMsDssTaskResponse SearchMsDssTask(SearchMsDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SearchMsDssTaskEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务
         * Summary: 查找调度任务
         */
        public async Task<SearchMsDssTaskResponse> SearchMsDssTaskAsync(SearchMsDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SearchMsDssTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务
         * Summary: 查找调度任务
         */
        public SearchMsDssTaskResponse SearchMsDssTaskEx(SearchMsDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMsDssTaskResponse>(DoRequest("1.0", "ms.dss.task.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务
         * Summary: 查找调度任务
         */
        public async Task<SearchMsDssTaskResponse> SearchMsDssTaskExAsync(SearchMsDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchMsDssTaskResponse>(await DoRequestAsync("1.0", "ms.dss.task.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
         * Summary: 通过策略名称查询策略
         */
        public QueryMsDssTaskStrategyResponse QueryMsDssTaskStrategy(QueryMsDssTaskStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMsDssTaskStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
         * Summary: 通过策略名称查询策略
         */
        public async Task<QueryMsDssTaskStrategyResponse> QueryMsDssTaskStrategyAsync(QueryMsDssTaskStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMsDssTaskStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
         * Summary: 通过策略名称查询策略
         */
        public QueryMsDssTaskStrategyResponse QueryMsDssTaskStrategyEx(QueryMsDssTaskStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMsDssTaskStrategyResponse>(DoRequest("1.0", "ms.dss.task.strategy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
         * Summary: 通过策略名称查询策略
         */
        public async Task<QueryMsDssTaskStrategyResponse> QueryMsDssTaskStrategyExAsync(QueryMsDssTaskStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMsDssTaskStrategyResponse>(await DoRequestAsync("1.0", "ms.dss.task.strategy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-机房信息(独占版)
         * Summary: 获取部署调度任务的所有机房
         */
        public ListDssIdcResponse ListDssIdc(ListDssIdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDssIdcEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-机房信息(独占版)
         * Summary: 获取部署调度任务的所有机房
         */
        public async Task<ListDssIdcResponse> ListDssIdcAsync(ListDssIdcRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDssIdcExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-机房信息(独占版)
         * Summary: 获取部署调度任务的所有机房
         */
        public ListDssIdcResponse ListDssIdcEx(ListDssIdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDssIdcResponse>(DoRequest("1.0", "sofa.ms.dss.idc.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-机房信息(独占版)
         * Summary: 获取部署调度任务的所有机房
         */
        public async Task<ListDssIdcResponse> ListDssIdcExAsync(ListDssIdcRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDssIdcResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.idc.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-增加任务(独占版)
         * Summary: 独占版添加调度任务
         */
        public AddDssScheduleResponse AddDssSchedule(AddDssScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDssScheduleEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-增加任务(独占版)
         * Summary: 独占版添加调度任务
         */
        public async Task<AddDssScheduleResponse> AddDssScheduleAsync(AddDssScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDssScheduleExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-增加任务(独占版)
         * Summary: 独占版添加调度任务
         */
        public AddDssScheduleResponse AddDssScheduleEx(AddDssScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDssScheduleResponse>(DoRequest("1.0", "sofa.ms.dss.schedule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-增加任务(独占版)
         * Summary: 独占版添加调度任务
         */
        public async Task<AddDssScheduleResponse> AddDssScheduleExAsync(AddDssScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDssScheduleResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.schedule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-更新任务(独占版)
         * Summary: 更新调度任务
         */
        public UpdateDssScheduleResponse UpdateDssSchedule(UpdateDssScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDssScheduleEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-更新任务(独占版)
         * Summary: 更新调度任务
         */
        public async Task<UpdateDssScheduleResponse> UpdateDssScheduleAsync(UpdateDssScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDssScheduleExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-更新任务(独占版)
         * Summary: 更新调度任务
         */
        public UpdateDssScheduleResponse UpdateDssScheduleEx(UpdateDssScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDssScheduleResponse>(DoRequest("1.0", "sofa.ms.dss.schedule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-更新任务(独占版)
         * Summary: 更新调度任务
         */
        public async Task<UpdateDssScheduleResponse> UpdateDssScheduleExAsync(UpdateDssScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDssScheduleResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.schedule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查询调度任务(独占版)
         * Summary: 分页查询调度任务
         */
        public QueryDssScheduleResponse QueryDssSchedule(QueryDssScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDssScheduleEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查询调度任务(独占版)
         * Summary: 分页查询调度任务
         */
        public async Task<QueryDssScheduleResponse> QueryDssScheduleAsync(QueryDssScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDssScheduleExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查询调度任务(独占版)
         * Summary: 分页查询调度任务
         */
        public QueryDssScheduleResponse QueryDssScheduleEx(QueryDssScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDssScheduleResponse>(DoRequest("1.0", "sofa.ms.dss.schedule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查询调度任务(独占版)
         * Summary: 分页查询调度任务
         */
        public async Task<QueryDssScheduleResponse> QueryDssScheduleExAsync(QueryDssScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDssScheduleResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.schedule.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
         * Summary: 动态配置持久化推送
         */
        public PersistpushDdcsDataResponse PersistpushDdcsData(PersistpushDdcsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PersistpushDdcsDataEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
         * Summary: 动态配置持久化推送
         */
        public async Task<PersistpushDdcsDataResponse> PersistpushDdcsDataAsync(PersistpushDdcsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PersistpushDdcsDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
         * Summary: 动态配置持久化推送
         */
        public PersistpushDdcsDataResponse PersistpushDdcsDataEx(PersistpushDdcsDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PersistpushDdcsDataResponse>(DoRequest("1.0", "sofa.ms.ddcs.data.persistpush", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-持久化推送接口。此接口推送的动态配置值会持续生效，应用重启也会拉取服务端保存的最新值。
         * Summary: 动态配置持久化推送
         */
        public async Task<PersistpushDdcsDataResponse> PersistpushDdcsDataExAsync(PersistpushDdcsDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PersistpushDdcsDataResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.data.persistpush", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
         * Summary: 查询动态配置订阅客户端
         */
        public QueryDdcsClientsResponse QueryDdcsClients(QueryDdcsClientsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDdcsClientsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
         * Summary: 查询动态配置订阅客户端
         */
        public async Task<QueryDdcsClientsResponse> QueryDdcsClientsAsync(QueryDdcsClientsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDdcsClientsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
         * Summary: 查询动态配置订阅客户端
         */
        public QueryDdcsClientsResponse QueryDdcsClientsEx(QueryDdcsClientsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsClientsResponse>(DoRequest("1.0", "sofa.ms.ddcs.clients.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-查询动态配置订阅客户端接口。此接口可查询到订阅指定配置项的客户端信息。
         * Summary: 查询动态配置订阅客户端
         */
        public async Task<QueryDdcsClientsResponse> QueryDdcsClientsExAsync(QueryDdcsClientsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsClientsResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.clients.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-添加动态资源
         * Summary: 添加 DDCS 资源
         */
        public AddDdcsResourceResponse AddDdcsResource(AddDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDdcsResourceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-添加动态资源
         * Summary: 添加 DDCS 资源
         */
        public async Task<AddDdcsResourceResponse> AddDdcsResourceAsync(AddDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDdcsResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-添加动态资源
         * Summary: 添加 DDCS 资源
         */
        public AddDdcsResourceResponse AddDdcsResourceEx(AddDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsResourceResponse>(DoRequest("1.0", "sofa.ms.ddcs.resource.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-添加动态资源
         * Summary: 添加 DDCS 资源
         */
        public async Task<AddDdcsResourceResponse> AddDdcsResourceExAsync(AddDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsResourceResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.resource.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-编辑动态资源
         * Summary: 编辑 DDCS 资源
         */
        public UpdateDdcsResourceResponse UpdateDdcsResource(UpdateDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDdcsResourceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-编辑动态资源
         * Summary: 编辑 DDCS 资源
         */
        public async Task<UpdateDdcsResourceResponse> UpdateDdcsResourceAsync(UpdateDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDdcsResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-编辑动态资源
         * Summary: 编辑 DDCS 资源
         */
        public UpdateDdcsResourceResponse UpdateDdcsResourceEx(UpdateDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdcsResourceResponse>(DoRequest("1.0", "sofa.ms.ddcs.resource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-编辑动态资源
         * Summary: 编辑 DDCS 资源
         */
        public async Task<UpdateDdcsResourceResponse> UpdateDdcsResourceExAsync(UpdateDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdcsResourceResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.resource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-删除动态资源
         * Summary: 删除 DDCS 资源
         */
        public DeleteDdcsResourceResponse DeleteDdcsResource(DeleteDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDdcsResourceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-删除动态资源
         * Summary: 删除 DDCS 资源
         */
        public async Task<DeleteDdcsResourceResponse> DeleteDdcsResourceAsync(DeleteDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDdcsResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-删除动态资源
         * Summary: 删除 DDCS 资源
         */
        public DeleteDdcsResourceResponse DeleteDdcsResourceEx(DeleteDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdcsResourceResponse>(DoRequest("1.0", "sofa.ms.ddcs.resource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-删除动态资源
         * Summary: 删除 DDCS 资源
         */
        public async Task<DeleteDdcsResourceResponse> DeleteDdcsResourceExAsync(DeleteDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdcsResourceResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.resource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-添加属性
         * Summary: 添加属性
         */
        public AddDdcsAttributeResponse AddDdcsAttribute(AddDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDdcsAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-添加属性
         * Summary: 添加属性
         */
        public async Task<AddDdcsAttributeResponse> AddDdcsAttributeAsync(AddDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDdcsAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-添加属性
         * Summary: 添加属性
         */
        public AddDdcsAttributeResponse AddDdcsAttributeEx(AddDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsAttributeResponse>(DoRequest("1.0", "sofa.ms.ddcs.attribute.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-添加属性
         * Summary: 添加属性
         */
        public async Task<AddDdcsAttributeResponse> AddDdcsAttributeExAsync(AddDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsAttributeResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.attribute.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-编辑属性
         * Summary: 编辑属性
         */
        public UpdateDdcsAttributeResponse UpdateDdcsAttribute(UpdateDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDdcsAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-编辑属性
         * Summary: 编辑属性
         */
        public async Task<UpdateDdcsAttributeResponse> UpdateDdcsAttributeAsync(UpdateDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDdcsAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-编辑属性
         * Summary: 编辑属性
         */
        public UpdateDdcsAttributeResponse UpdateDdcsAttributeEx(UpdateDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdcsAttributeResponse>(DoRequest("1.0", "sofa.ms.ddcs.attribute.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-编辑属性
         * Summary: 编辑属性
         */
        public async Task<UpdateDdcsAttributeResponse> UpdateDdcsAttributeExAsync(UpdateDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdcsAttributeResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.attribute.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-删除属性
         * Summary: 删除属性
         */
        public DeleteDdcsAttributeResponse DeleteDdcsAttribute(DeleteDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDdcsAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-删除属性
         * Summary: 删除属性
         */
        public async Task<DeleteDdcsAttributeResponse> DeleteDdcsAttributeAsync(DeleteDdcsAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDdcsAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-删除属性
         * Summary: 删除属性
         */
        public DeleteDdcsAttributeResponse DeleteDdcsAttributeEx(DeleteDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdcsAttributeResponse>(DoRequest("1.0", "sofa.ms.ddcs.attribute.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-删除属性
         * Summary: 删除属性
         */
        public async Task<DeleteDdcsAttributeResponse> DeleteDdcsAttributeExAsync(DeleteDdcsAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdcsAttributeResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.attribute.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-查找动态配置
         * Summary: 查找动态资源
         */
        public SearchDdcsResourceResponse SearchDdcsResource(SearchDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SearchDdcsResourceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-查找动态配置
         * Summary: 查找动态资源
         */
        public async Task<SearchDdcsResourceResponse> SearchDdcsResourceAsync(SearchDdcsResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SearchDdcsResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-动态配置-查找动态配置
         * Summary: 查找动态资源
         */
        public SearchDdcsResourceResponse SearchDdcsResourceEx(SearchDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchDdcsResourceResponse>(DoRequest("1.0", "sofa.ms.ddcs.resource.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-动态配置-查找动态配置
         * Summary: 查找动态资源
         */
        public async Task<SearchDdcsResourceResponse> SearchDdcsResourceExAsync(SearchDdcsResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchDdcsResourceResponse>(await DoRequestAsync("1.0", "sofa.ms.ddcs.resource.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-添加调度任务
         * Summary: 添加调度任务
         */
        public AddDssTaskResponse AddDssTask(AddDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDssTaskEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-添加调度任务
         * Summary: 添加调度任务
         */
        public async Task<AddDssTaskResponse> AddDssTaskAsync(AddDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDssTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-添加调度任务
         * Summary: 添加调度任务
         */
        public AddDssTaskResponse AddDssTaskEx(AddDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDssTaskResponse>(DoRequest("1.0", "sofa.ms.dss.task.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-添加调度任务
         * Summary: 添加调度任务
         */
        public async Task<AddDssTaskResponse> AddDssTaskExAsync(AddDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDssTaskResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.task.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-编辑调度任务
         * Summary: 编辑调度任务
         */
        public UpdateDssTaskResponse UpdateDssTask(UpdateDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDssTaskEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-编辑调度任务
         * Summary: 编辑调度任务
         */
        public async Task<UpdateDssTaskResponse> UpdateDssTaskAsync(UpdateDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDssTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-编辑调度任务
         * Summary: 编辑调度任务
         */
        public UpdateDssTaskResponse UpdateDssTaskEx(UpdateDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDssTaskResponse>(DoRequest("1.0", "sofa.ms.dss.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-编辑调度任务
         * Summary: 编辑调度任务
         */
        public async Task<UpdateDssTaskResponse> UpdateDssTaskExAsync(UpdateDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDssTaskResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.task.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务
         * Summary: 删除调度任务
         */
        public DeleteDssTaskResponse DeleteDssTask(DeleteDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDssTaskEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务
         * Summary: 删除调度任务
         */
        public async Task<DeleteDssTaskResponse> DeleteDssTaskAsync(DeleteDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDssTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务
         * Summary: 删除调度任务
         */
        public DeleteDssTaskResponse DeleteDssTaskEx(DeleteDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDssTaskResponse>(DoRequest("1.0", "sofa.ms.dss.task.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务
         * Summary: 删除调度任务
         */
        public async Task<DeleteDssTaskResponse> DeleteDssTaskExAsync(DeleteDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDssTaskResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.task.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务
         * Summary: 查找调度任务
         */
        public SearchDssTaskResponse SearchDssTask(SearchDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SearchDssTaskEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务
         * Summary: 查找调度任务
         */
        public async Task<SearchDssTaskResponse> SearchDssTaskAsync(SearchDssTaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SearchDssTaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务
         * Summary: 查找调度任务
         */
        public SearchDssTaskResponse SearchDssTaskEx(SearchDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchDssTaskResponse>(DoRequest("1.0", "sofa.ms.dss.task.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务
         * Summary: 查找调度任务
         */
        public async Task<SearchDssTaskResponse> SearchDssTaskExAsync(SearchDssTaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchDssTaskResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.task.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
         * Summary: 通过策略名称查询策略
         */
        public QueryDssStrategyResponse QueryDssStrategy(QueryDssStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDssStrategyEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
         * Summary: 通过策略名称查询策略
         */
        public async Task<QueryDssStrategyResponse> QueryDssStrategyAsync(QueryDssStrategyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDssStrategyExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
         * Summary: 通过策略名称查询策略
         */
        public QueryDssStrategyResponse QueryDssStrategyEx(QueryDssStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDssStrategyResponse>(DoRequest("1.0", "sofa.ms.dss.strategy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查找调度任务策略(独占版)
         * Summary: 通过策略名称查询策略
         */
        public async Task<QueryDssStrategyResponse> QueryDssStrategyExAsync(QueryDssStrategyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDssStrategyResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.strategy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务(独占版)
         * Summary: 删除调度任务
         */
        public DeleteDssScheduleResponse DeleteDssSchedule(DeleteDssScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDssScheduleEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务(独占版)
         * Summary: 删除调度任务
         */
        public async Task<DeleteDssScheduleResponse> DeleteDssScheduleAsync(DeleteDssScheduleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDssScheduleExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务(独占版)
         * Summary: 删除调度任务
         */
        public DeleteDssScheduleResponse DeleteDssScheduleEx(DeleteDssScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDssScheduleResponse>(DoRequest("1.0", "sofa.ms.dss.schedule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-删除任务(独占版)
         * Summary: 删除调度任务
         */
        public async Task<DeleteDssScheduleResponse> DeleteDssScheduleExAsync(DeleteDssScheduleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDssScheduleResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.schedule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-执行单元切换
         * Summary: 定时任务执行单元切换
         */
        public ExecuteDssSwitchoverResponse ExecuteDssSwitchover(ExecuteDssSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecuteDssSwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-执行单元切换
         * Summary: 定时任务执行单元切换
         */
        public async Task<ExecuteDssSwitchoverResponse> ExecuteDssSwitchoverAsync(ExecuteDssSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecuteDssSwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-执行单元切换
         * Summary: 定时任务执行单元切换
         */
        public ExecuteDssSwitchoverResponse ExecuteDssSwitchoverEx(ExecuteDssSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecuteDssSwitchoverResponse>(DoRequest("1.0", "sofa.ms.dss.switchover.execute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-执行单元切换
         * Summary: 定时任务执行单元切换
         */
        public async Task<ExecuteDssSwitchoverResponse> ExecuteDssSwitchoverExAsync(ExecuteDssSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecuteDssSwitchoverResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.switchover.execute", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-取消单元切换
         * Summary: 定时任务取消单元切换
         */
        public CancelDssSwitchoverResponse CancelDssSwitchover(CancelDssSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelDssSwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-取消单元切换
         * Summary: 定时任务取消单元切换
         */
        public async Task<CancelDssSwitchoverResponse> CancelDssSwitchoverAsync(CancelDssSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelDssSwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-取消单元切换
         * Summary: 定时任务取消单元切换
         */
        public CancelDssSwitchoverResponse CancelDssSwitchoverEx(CancelDssSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDssSwitchoverResponse>(DoRequest("1.0", "sofa.ms.dss.switchover.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-取消单元切换
         * Summary: 定时任务取消单元切换
         */
        public async Task<CancelDssSwitchoverResponse> CancelDssSwitchoverExAsync(CancelDssSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelDssSwitchoverResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.switchover.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查询单元切换状态
         * Summary: 查询定时任务单元切换状态
         */
        public QueryDssSwitchoverResponse QueryDssSwitchover(QueryDssSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDssSwitchoverEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查询单元切换状态
         * Summary: 查询定时任务单元切换状态
         */
        public async Task<QueryDssSwitchoverResponse> QueryDssSwitchoverAsync(QueryDssSwitchoverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDssSwitchoverExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分布式调度任务-查询单元切换状态
         * Summary: 查询定时任务单元切换状态
         */
        public QueryDssSwitchoverResponse QueryDssSwitchoverEx(QueryDssSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDssSwitchoverResponse>(DoRequest("1.0", "sofa.ms.dss.switchover.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分布式调度任务-查询单元切换状态
         * Summary: 查询定时任务单元切换状态
         */
        public async Task<QueryDssSwitchoverResponse> QueryDssSwitchoverExAsync(QueryDssSwitchoverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDssSwitchoverResponse>(await DoRequestAsync("1.0", "sofa.ms.dss.switchover.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-服务注册中心-注销服务
         * Summary: 注销服务
         */
        public LogoutRegistryServiceResponse LogoutRegistryService(LogoutRegistryServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return LogoutRegistryServiceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-服务注册中心-注销服务
         * Summary: 注销服务
         */
        public async Task<LogoutRegistryServiceResponse> LogoutRegistryServiceAsync(LogoutRegistryServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await LogoutRegistryServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-服务注册中心-注销服务
         * Summary: 注销服务
         */
        public LogoutRegistryServiceResponse LogoutRegistryServiceEx(LogoutRegistryServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LogoutRegistryServiceResponse>(DoRequest("1.0", "sofa.ms.registry.service.logout", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-服务注册中心-注销服务
         * Summary: 注销服务
         */
        public async Task<LogoutRegistryServiceResponse> LogoutRegistryServiceExAsync(LogoutRegistryServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<LogoutRegistryServiceResponse>(await DoRequestAsync("1.0", "sofa.ms.registry.service.logout", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-服务注册中心-服务挂流
         * Summary: 服务挂流
         */
        public OnlineRegistryServiceResponse OnlineRegistryService(OnlineRegistryServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OnlineRegistryServiceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-服务注册中心-服务挂流
         * Summary: 服务挂流
         */
        public async Task<OnlineRegistryServiceResponse> OnlineRegistryServiceAsync(OnlineRegistryServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OnlineRegistryServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-服务注册中心-服务挂流
         * Summary: 服务挂流
         */
        public OnlineRegistryServiceResponse OnlineRegistryServiceEx(OnlineRegistryServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineRegistryServiceResponse>(DoRequest("2.0", "sofa.ms.registry.service.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-服务注册中心-服务挂流
         * Summary: 服务挂流
         */
        public async Task<OnlineRegistryServiceResponse> OnlineRegistryServiceExAsync(OnlineRegistryServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OnlineRegistryServiceResponse>(await DoRequestAsync("2.0", "sofa.ms.registry.service.online", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实例标识
         * Summary: 查询实例标识
         */
        public ListSofaOspInstanceResponse ListSofaOspInstance(ListSofaOspInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSofaOspInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 查询实例标识
         * Summary: 查询实例标识
         */
        public async Task<ListSofaOspInstanceResponse> ListSofaOspInstanceAsync(ListSofaOspInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSofaOspInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询实例标识
         * Summary: 查询实例标识
         */
        public ListSofaOspInstanceResponse ListSofaOspInstanceEx(ListSofaOspInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofaOspInstanceResponse>(DoRequest("1.0", "sofa.osp.instance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询实例标识
         * Summary: 查询实例标识
         */
        public async Task<ListSofaOspInstanceResponse> ListSofaOspInstanceExAsync(ListSofaOspInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSofaOspInstanceResponse>(await DoRequestAsync("1.0", "sofa.osp.instance.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增某个实例下的单元
         * Summary: 新增单元
         */
        public AddSofaOspCellResponse AddSofaOspCell(AddSofaOspCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSofaOspCellEx(request, headers, runtime);
        }

        /**
         * Description: 新增某个实例下的单元
         * Summary: 新增单元
         */
        public async Task<AddSofaOspCellResponse> AddSofaOspCellAsync(AddSofaOspCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSofaOspCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增某个实例下的单元
         * Summary: 新增单元
         */
        public AddSofaOspCellResponse AddSofaOspCellEx(AddSofaOspCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSofaOspCellResponse>(DoRequest("1.0", "sofa.osp.cell.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增某个实例下的单元
         * Summary: 新增单元
         */
        public async Task<AddSofaOspCellResponse> AddSofaOspCellExAsync(AddSofaOspCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSofaOspCellResponse>(await DoRequestAsync("1.0", "sofa.osp.cell.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除某个实例下的单元
         * Summary: 删除单元
         */
        public DeleteSofaOspCellResponse DeleteSofaOspCell(DeleteSofaOspCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSofaOspCellEx(request, headers, runtime);
        }

        /**
         * Description: 删除某个实例下的单元
         * Summary: 删除单元
         */
        public async Task<DeleteSofaOspCellResponse> DeleteSofaOspCellAsync(DeleteSofaOspCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSofaOspCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除某个实例下的单元
         * Summary: 删除单元
         */
        public DeleteSofaOspCellResponse DeleteSofaOspCellEx(DeleteSofaOspCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofaOspCellResponse>(DoRequest("1.0", "sofa.osp.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除某个实例下的单元
         * Summary: 删除单元
         */
        public async Task<DeleteSofaOspCellResponse> DeleteSofaOspCellExAsync(DeleteSofaOspCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSofaOspCellResponse>(await DoRequestAsync("1.0", "sofa.osp.cell.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某个实例下的单元列表
         * Summary: 查询单元列表
         */
        public QuerySofaOspCellResponse QuerySofaOspCell(QuerySofaOspCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySofaOspCellEx(request, headers, runtime);
        }

        /**
         * Description: 查询某个实例下的单元列表
         * Summary: 查询单元列表
         */
        public async Task<QuerySofaOspCellResponse> QuerySofaOspCellAsync(QuerySofaOspCellRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySofaOspCellExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询某个实例下的单元列表
         * Summary: 查询单元列表
         */
        public QuerySofaOspCellResponse QuerySofaOspCellEx(QuerySofaOspCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofaOspCellResponse>(DoRequest("1.0", "sofa.osp.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某个实例下的单元列表
         * Summary: 查询单元列表
         */
        public async Task<QuerySofaOspCellResponse> QuerySofaOspCellExAsync(QuerySofaOspCellRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySofaOspCellResponse>(await DoRequestAsync("1.0", "sofa.osp.cell.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query service records.
         * Summary: query service record
         */
        public QueryServiceResponse QueryService(QueryServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServiceEx(request, headers, runtime);
        }

        /**
         * Description: Query service records.
         * Summary: query service record
         */
        public async Task<QueryServiceResponse> QueryServiceAsync(QueryServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: Query service records.
         * Summary: query service record
         */
        public QueryServiceResponse QueryServiceEx(QueryServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceResponse>(DoRequest("2.0", "sofa.ms.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query service records.
         * Summary: query service record
         */
        public async Task<QueryServiceResponse> QueryServiceExAsync(QueryServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceResponse>(await DoRequestAsync("2.0", "sofa.ms.service.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query service publishers.
         * Summary: query service publishers
         */
        public QueryServicePublisherResponse QueryServicePublisher(QueryServicePublisherRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServicePublisherEx(request, headers, runtime);
        }

        /**
         * Description: Query service publishers.
         * Summary: query service publishers
         */
        public async Task<QueryServicePublisherResponse> QueryServicePublisherAsync(QueryServicePublisherRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServicePublisherExAsync(request, headers, runtime);
        }

        /**
         * Description: Query service publishers.
         * Summary: query service publishers
         */
        public QueryServicePublisherResponse QueryServicePublisherEx(QueryServicePublisherRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServicePublisherResponse>(DoRequest("2.0", "sofa.ms.service.publisher.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query service publishers.
         * Summary: query service publishers
         */
        public async Task<QueryServicePublisherResponse> QueryServicePublisherExAsync(QueryServicePublisherRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServicePublisherResponse>(await DoRequestAsync("2.0", "sofa.ms.service.publisher.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query service subscribers.
         * Summary: query service subscribers
         */
        public QueryServiceSubscriberResponse QueryServiceSubscriber(QueryServiceSubscriberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryServiceSubscriberEx(request, headers, runtime);
        }

        /**
         * Description: Query service subscribers.
         * Summary: query service subscribers
         */
        public async Task<QueryServiceSubscriberResponse> QueryServiceSubscriberAsync(QueryServiceSubscriberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryServiceSubscriberExAsync(request, headers, runtime);
        }

        /**
         * Description: Query service subscribers.
         * Summary: query service subscribers
         */
        public QueryServiceSubscriberResponse QueryServiceSubscriberEx(QueryServiceSubscriberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceSubscriberResponse>(DoRequest("2.0", "sofa.ms.service.subscriber.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Query service subscribers.
         * Summary: query service subscribers
         */
        public async Task<QueryServiceSubscriberResponse> QueryServiceSubscriberExAsync(QueryServiceSubscriberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryServiceSubscriberResponse>(await DoRequestAsync("2.0", "sofa.ms.service.subscriber.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Client operation, like logout all services published from the client.
         * Summary: Client operation
         */
        public AddServiceClientResponse AddServiceClient(AddServiceClientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddServiceClientEx(request, headers, runtime);
        }

        /**
         * Description: Client operation, like logout all services published from the client.
         * Summary: Client operation
         */
        public async Task<AddServiceClientResponse> AddServiceClientAsync(AddServiceClientRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddServiceClientExAsync(request, headers, runtime);
        }

        /**
         * Description: Client operation, like logout all services published from the client.
         * Summary: Client operation
         */
        public AddServiceClientResponse AddServiceClientEx(AddServiceClientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddServiceClientResponse>(DoRequest("2.0", "sofa.ms.service.client.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Client operation, like logout all services published from the client.
         * Summary: Client operation
         */
        public async Task<AddServiceClientResponse> AddServiceClientExAsync(AddServiceClientRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddServiceClientResponse>(await DoRequestAsync("2.0", "sofa.ms.service.client.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
         * Summary: 模糊查询资源
         */
        public QueryDdcsResourcesResponse QueryDdcsResources(QueryDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDdcsResourcesEx(request, headers, runtime);
        }

        /**
         * Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
         * Summary: 模糊查询资源
         */
        public async Task<QueryDdcsResourcesResponse> QueryDdcsResourcesAsync(QueryDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDdcsResourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
         * Summary: 模糊查询资源
         */
        public QueryDdcsResourcesResponse QueryDdcsResourcesEx(QueryDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsResourcesResponse>(DoRequest("2.0", "sofa.ms.ddcs.resources.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用名或者资源 ID 模糊查询对应的资源元信息。
         * Summary: 模糊查询资源
         */
        public async Task<QueryDdcsResourcesResponse> QueryDdcsResourcesExAsync(QueryDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsResourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.resources.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
         * Summary: 推送属性值
         */
        public AddDdcsDataResponse AddDdcsData(AddDdcsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDdcsDataEx(request, headers, runtime);
        }

        /**
         * Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
         * Summary: 推送属性值
         */
        public async Task<AddDdcsDataResponse> AddDdcsDataAsync(AddDdcsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDdcsDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
         * Summary: 推送属性值
         */
        public AddDdcsDataResponse AddDdcsDataEx(AddDdcsDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsDataResponse>(DoRequest("2.0", "sofa.ms.ddcs.data.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核心推送属性值接口，推送后所有订阅该属性的客户端都会在一秒内更新内存值，并回调属性对应的 setter 方法。此推送方式是持久化推送，即动态配置服务端会在数据库里存储属性值，客户端在重启的时候能够获取到上一次推送值。
         * Summary: 推送属性值
         */
        public async Task<AddDdcsDataResponse> AddDdcsDataExAsync(AddDdcsDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsDataResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.data.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
         * Summary: 新增资源元数据
         */
        public AddDdcsResourcesResponse AddDdcsResources(AddDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDdcsResourcesEx(request, headers, runtime);
        }

        /**
         * Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
         * Summary: 新增资源元数据
         */
        public async Task<AddDdcsResourcesResponse> AddDdcsResourcesAsync(AddDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDdcsResourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
         * Summary: 新增资源元数据
         */
        public AddDdcsResourcesResponse AddDdcsResourcesEx(AddDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsResourcesResponse>(DoRequest("2.0", "sofa.ms.ddcs.resources.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增资源元数据。资源相当于文件的概念，一个资源下可以有多个属性。
         * Summary: 新增资源元数据
         */
        public async Task<AddDdcsResourcesResponse> AddDdcsResourcesExAsync(AddDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsResourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.resources.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
         * Summary: 更新资源元信息
         */
        public UpdateDdcsResourcesResponse UpdateDdcsResources(UpdateDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDdcsResourcesEx(request, headers, runtime);
        }

        /**
         * Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
         * Summary: 更新资源元信息
         */
        public async Task<UpdateDdcsResourcesResponse> UpdateDdcsResourcesAsync(UpdateDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDdcsResourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
         * Summary: 更新资源元信息
         */
        public UpdateDdcsResourcesResponse UpdateDdcsResourcesEx(UpdateDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdcsResourcesResponse>(DoRequest("2.0", "sofa.ms.ddcs.resources.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新资源元信息。update_attribute 为 false 时，则只更新资源元信息，不会更新属性信息。update_attribute 为 true 时，会同时更新资源元信息以及全量覆盖所有属性。
         * Summary: 更新资源元信息
         */
        public async Task<UpdateDdcsResourcesResponse> UpdateDdcsResourcesExAsync(UpdateDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdcsResourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.resources.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
         * Summary: 根据资源ID删除资源
         */
        public DeleteDdcsResourcesResponse DeleteDdcsResources(DeleteDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDdcsResourcesEx(request, headers, runtime);
        }

        /**
         * Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
         * Summary: 根据资源ID删除资源
         */
        public async Task<DeleteDdcsResourcesResponse> DeleteDdcsResourcesAsync(DeleteDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDdcsResourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
         * Summary: 根据资源ID删除资源
         */
        public DeleteDdcsResourcesResponse DeleteDdcsResourcesEx(DeleteDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdcsResourcesResponse>(DoRequest("2.0", "sofa.ms.ddcs.resources.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据资源 ID 删除对应资源，删除资源会同时删除该资源下所有的属性信息。
         * Summary: 根据资源ID删除资源
         */
        public async Task<DeleteDdcsResourcesResponse> DeleteDdcsResourcesExAsync(DeleteDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdcsResourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.resources.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据资源 ID 获取对应的资源元信息。
         * Summary: 根据资源自增长 ID 获取资源元信息
         */
        public GetDdcsResourcesResponse GetDdcsResources(GetDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDdcsResourcesEx(request, headers, runtime);
        }

        /**
         * Description: 根据资源 ID 获取对应的资源元信息。
         * Summary: 根据资源自增长 ID 获取资源元信息
         */
        public async Task<GetDdcsResourcesResponse> GetDdcsResourcesAsync(GetDdcsResourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDdcsResourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据资源 ID 获取对应的资源元信息。
         * Summary: 根据资源自增长 ID 获取资源元信息
         */
        public GetDdcsResourcesResponse GetDdcsResourcesEx(GetDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDdcsResourcesResponse>(DoRequest("2.0", "sofa.ms.ddcs.resources.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据资源 ID 获取对应的资源元信息。
         * Summary: 根据资源自增长 ID 获取资源元信息
         */
        public async Task<GetDdcsResourcesResponse> GetDdcsResourcesExAsync(GetDdcsResourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDdcsResourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.resources.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
         * Summary: 新增属性元信息
         */
        public AddDdcsAttributesResponse AddDdcsAttributes(AddDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDdcsAttributesEx(request, headers, runtime);
        }

        /**
         * Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
         * Summary: 新增属性元信息
         */
        public async Task<AddDdcsAttributesResponse> AddDdcsAttributesAsync(AddDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDdcsAttributesExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
         * Summary: 新增属性元信息
         */
        public AddDdcsAttributesResponse AddDdcsAttributesEx(AddDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsAttributesResponse>(DoRequest("2.0", "sofa.ms.ddcs.attributes.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增属性元信息。属性相当于一个配置文件配置项的概念，只有添加属性之后，才能对属性进行推送。
         * Summary: 新增属性元信息
         */
        public async Task<AddDdcsAttributesResponse> AddDdcsAttributesExAsync(AddDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsAttributesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.attributes.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据属性 ID 更新属性元信息。
         * Summary: 更新属性元信息
         */
        public UpdateDdcsAttributesResponse UpdateDdcsAttributes(UpdateDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDdcsAttributesEx(request, headers, runtime);
        }

        /**
         * Description: 根据属性 ID 更新属性元信息。
         * Summary: 更新属性元信息
         */
        public async Task<UpdateDdcsAttributesResponse> UpdateDdcsAttributesAsync(UpdateDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDdcsAttributesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据属性 ID 更新属性元信息。
         * Summary: 更新属性元信息
         */
        public UpdateDdcsAttributesResponse UpdateDdcsAttributesEx(UpdateDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdcsAttributesResponse>(DoRequest("2.0", "sofa.ms.ddcs.attributes.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据属性 ID 更新属性元信息。
         * Summary: 更新属性元信息
         */
        public async Task<UpdateDdcsAttributesResponse> UpdateDdcsAttributesExAsync(UpdateDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdcsAttributesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.attributes.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
         * Summary: 删除属性
         */
        public DeleteDdcsAttributesResponse DeleteDdcsAttributes(DeleteDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDdcsAttributesEx(request, headers, runtime);
        }

        /**
         * Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
         * Summary: 删除属性
         */
        public async Task<DeleteDdcsAttributesResponse> DeleteDdcsAttributesAsync(DeleteDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDdcsAttributesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
         * Summary: 删除属性
         */
        public DeleteDdcsAttributesResponse DeleteDdcsAttributesEx(DeleteDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdcsAttributesResponse>(DoRequest("2.0", "sofa.ms.ddcs.attributes.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据属性 ID 删除对应的属性元信息。删除属性元信息，属性值不会删除。
         * Summary: 删除属性
         */
        public async Task<DeleteDdcsAttributesResponse> DeleteDdcsAttributesExAsync(DeleteDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdcsAttributesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.attributes.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据属性 ID 获取对应的属性信息。
         * Summary: 获取属性
         */
        public GetDdcsAttributesResponse GetDdcsAttributes(GetDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDdcsAttributesEx(request, headers, runtime);
        }

        /**
         * Description: 根据属性 ID 获取对应的属性信息。
         * Summary: 获取属性
         */
        public async Task<GetDdcsAttributesResponse> GetDdcsAttributesAsync(GetDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDdcsAttributesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据属性 ID 获取对应的属性信息。
         * Summary: 获取属性
         */
        public GetDdcsAttributesResponse GetDdcsAttributesEx(GetDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDdcsAttributesResponse>(DoRequest("2.0", "sofa.ms.ddcs.attributes.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据属性 ID 获取对应的属性信息。
         * Summary: 获取属性
         */
        public async Task<GetDdcsAttributesResponse> GetDdcsAttributesExAsync(GetDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDdcsAttributesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.attributes.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
         * Summary: 根据资源和属性名称获取属性信息
         */
        public QueryDdcsAttributesResponse QueryDdcsAttributes(QueryDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDdcsAttributesEx(request, headers, runtime);
        }

        /**
         * Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
         * Summary: 根据资源和属性名称获取属性信息
         */
        public async Task<QueryDdcsAttributesResponse> QueryDdcsAttributesAsync(QueryDdcsAttributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDdcsAttributesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
         * Summary: 根据资源和属性名称获取属性信息
         */
        public QueryDdcsAttributesResponse QueryDdcsAttributesEx(QueryDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsAttributesResponse>(DoRequest("2.0", "sofa.ms.ddcs.attributes.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据域,、应用名、资源 ID、属性名称获取属性详细信息，包含属性 ID。其它接口都依赖此接口获取属性 ID。
         * Summary: 根据资源和属性名称获取属性信息
         */
        public async Task<QueryDdcsAttributesResponse> QueryDdcsAttributesExAsync(QueryDdcsAttributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsAttributesResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.attributes.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query job by specific id
         * Summary: query job
         */
        public GetDdsJobResponse GetDdsJob(GetDdsJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDdsJobEx(request, headers, runtime);
        }

        /**
         * Description: query job by specific id
         * Summary: query job
         */
        public async Task<GetDdsJobResponse> GetDdsJobAsync(GetDdsJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDdsJobExAsync(request, headers, runtime);
        }

        /**
         * Description: query job by specific id
         * Summary: query job
         */
        public GetDdsJobResponse GetDdsJobEx(GetDdsJobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDdsJobResponse>(DoRequest("2.0", "sofa.ms.dds.job.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query job by specific id
         * Summary: query job
         */
        public async Task<GetDdsJobResponse> GetDdsJobExAsync(GetDdsJobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDdsJobResponse>(await DoRequestAsync("2.0", "sofa.ms.dds.job.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: add job
         * Summary: add job
         */
        public AddDdsJobResponse AddDdsJob(AddDdsJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDdsJobEx(request, headers, runtime);
        }

        /**
         * Description: add job
         * Summary: add job
         */
        public async Task<AddDdsJobResponse> AddDdsJobAsync(AddDdsJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDdsJobExAsync(request, headers, runtime);
        }

        /**
         * Description: add job
         * Summary: add job
         */
        public AddDdsJobResponse AddDdsJobEx(AddDdsJobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdsJobResponse>(DoRequest("2.0", "sofa.ms.dds.job.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: add job
         * Summary: add job
         */
        public async Task<AddDdsJobResponse> AddDdsJobExAsync(AddDdsJobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdsJobResponse>(await DoRequestAsync("2.0", "sofa.ms.dds.job.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: modify job by specific id
         * Summary: modify job
         */
        public UpdateDdsJobResponse UpdateDdsJob(UpdateDdsJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDdsJobEx(request, headers, runtime);
        }

        /**
         * Description: modify job by specific id
         * Summary: modify job
         */
        public async Task<UpdateDdsJobResponse> UpdateDdsJobAsync(UpdateDdsJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDdsJobExAsync(request, headers, runtime);
        }

        /**
         * Description: modify job by specific id
         * Summary: modify job
         */
        public UpdateDdsJobResponse UpdateDdsJobEx(UpdateDdsJobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdsJobResponse>(DoRequest("2.0", "sofa.ms.dds.job.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: modify job by specific id
         * Summary: modify job
         */
        public async Task<UpdateDdsJobResponse> UpdateDdsJobExAsync(UpdateDdsJobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdsJobResponse>(await DoRequestAsync("2.0", "sofa.ms.dds.job.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete job by specific id
         * Summary: delete job
         */
        public DeleteDdsJobResponse DeleteDdsJob(DeleteDdsJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDdsJobEx(request, headers, runtime);
        }

        /**
         * Description: delete job by specific id
         * Summary: delete job
         */
        public async Task<DeleteDdsJobResponse> DeleteDdsJobAsync(DeleteDdsJobRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDdsJobExAsync(request, headers, runtime);
        }

        /**
         * Description: delete job by specific id
         * Summary: delete job
         */
        public DeleteDdsJobResponse DeleteDdsJobEx(DeleteDdsJobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdsJobResponse>(DoRequest("2.0", "sofa.ms.dds.job.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: delete job by specific id
         * Summary: delete job
         */
        public async Task<DeleteDdsJobResponse> DeleteDdsJobExAsync(DeleteDdsJobRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDdsJobResponse>(await DoRequestAsync("2.0", "sofa.ms.dds.job.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update status by specific id
         * Summary: update status
         */
        public UpdateDdsJobStatusResponse UpdateDdsJobStatus(UpdateDdsJobStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDdsJobStatusEx(request, headers, runtime);
        }

        /**
         * Description: update status by specific id
         * Summary: update status
         */
        public async Task<UpdateDdsJobStatusResponse> UpdateDdsJobStatusAsync(UpdateDdsJobStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDdsJobStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: update status by specific id
         * Summary: update status
         */
        public UpdateDdsJobStatusResponse UpdateDdsJobStatusEx(UpdateDdsJobStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdsJobStatusResponse>(DoRequest("2.0", "sofa.ms.dds.job.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: update status by specific id
         * Summary: update status
         */
        public async Task<UpdateDdsJobStatusResponse> UpdateDdsJobStatusExAsync(UpdateDdsJobStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDdsJobStatusResponse>(await DoRequestAsync("2.0", "sofa.ms.dds.job.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按 IP 灰度推送属性值。
         * Summary: 按IP灰度推送属性值
         */
        public AddDdcsGraydataResponse AddDdcsGraydata(AddDdcsGraydataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDdcsGraydataEx(request, headers, runtime);
        }

        /**
         * Description: 按 IP 灰度推送属性值。
         * Summary: 按IP灰度推送属性值
         */
        public async Task<AddDdcsGraydataResponse> AddDdcsGraydataAsync(AddDdcsGraydataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDdcsGraydataExAsync(request, headers, runtime);
        }

        /**
         * Description: 按 IP 灰度推送属性值。
         * Summary: 按IP灰度推送属性值
         */
        public AddDdcsGraydataResponse AddDdcsGraydataEx(AddDdcsGraydataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsGraydataResponse>(DoRequest("2.0", "sofa.ms.ddcs.graydata.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按 IP 灰度推送属性值。
         * Summary: 按IP灰度推送属性值
         */
        public async Task<AddDdcsGraydataResponse> AddDdcsGraydataExAsync(AddDdcsGraydataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDdcsGraydataResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.graydata.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询属性最后一次的推送值。
         * Summary: 查询属性最后一次推送值
         */
        public QueryDdcsDataResponse QueryDdcsData(QueryDdcsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDdcsDataEx(request, headers, runtime);
        }

        /**
         * Description: 查询属性最后一次的推送值。
         * Summary: 查询属性最后一次推送值
         */
        public async Task<QueryDdcsDataResponse> QueryDdcsDataAsync(QueryDdcsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDdcsDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询属性最后一次的推送值。
         * Summary: 查询属性最后一次推送值
         */
        public QueryDdcsDataResponse QueryDdcsDataEx(QueryDdcsDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsDataResponse>(DoRequest("2.0", "sofa.ms.ddcs.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询属性最后一次的推送值。
         * Summary: 查询属性最后一次推送值
         */
        public async Task<QueryDdcsDataResponse> QueryDdcsDataExAsync(QueryDdcsDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsDataResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.data.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query jobs
         * Summary: query jobs
         */
        public QueryDdsJobsResponse QueryDdsJobs(QueryDdsJobsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDdsJobsEx(request, headers, runtime);
        }

        /**
         * Description: query jobs
         * Summary: query jobs
         */
        public async Task<QueryDdsJobsResponse> QueryDdsJobsAsync(QueryDdsJobsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDdsJobsExAsync(request, headers, runtime);
        }

        /**
         * Description: query jobs
         * Summary: query jobs
         */
        public QueryDdsJobsResponse QueryDdsJobsEx(QueryDdsJobsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdsJobsResponse>(DoRequest("2.0", "sofa.ms.dds.jobs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: query jobs
         * Summary: query jobs
         */
        public async Task<QueryDdsJobsResponse> QueryDdsJobsExAsync(QueryDdsJobsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdsJobsResponse>(await DoRequestAsync("2.0", "sofa.ms.dds.jobs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询属性下指定客户端的内存值。
         * Summary: 查询属性下指定客户端的内存值
         */
        public QueryDdcsClientvalueResponse QueryDdcsClientvalue(QueryDdcsClientvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDdcsClientvalueEx(request, headers, runtime);
        }

        /**
         * Description: 查询属性下指定客户端的内存值。
         * Summary: 查询属性下指定客户端的内存值
         */
        public async Task<QueryDdcsClientvalueResponse> QueryDdcsClientvalueAsync(QueryDdcsClientvalueRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDdcsClientvalueExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询属性下指定客户端的内存值。
         * Summary: 查询属性下指定客户端的内存值
         */
        public QueryDdcsClientvalueResponse QueryDdcsClientvalueEx(QueryDdcsClientvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsClientvalueResponse>(DoRequest("2.0", "sofa.ms.ddcs.clientvalue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询属性下指定客户端的内存值。
         * Summary: 查询属性下指定客户端的内存值
         */
        public async Task<QueryDdcsClientvalueResponse> QueryDdcsClientvalueExAsync(QueryDdcsClientvalueRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsClientvalueResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.clientvalue.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询属性推送历史
         * Summary: 查询属性推送历史
         */
        public QueryDdcsPushhistoryResponse QueryDdcsPushhistory(QueryDdcsPushhistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDdcsPushhistoryEx(request, headers, runtime);
        }

        /**
         * Description: 查询属性推送历史
         * Summary: 查询属性推送历史
         */
        public async Task<QueryDdcsPushhistoryResponse> QueryDdcsPushhistoryAsync(QueryDdcsPushhistoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDdcsPushhistoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询属性推送历史
         * Summary: 查询属性推送历史
         */
        public QueryDdcsPushhistoryResponse QueryDdcsPushhistoryEx(QueryDdcsPushhistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsPushhistoryResponse>(DoRequest("2.0", "sofa.ms.ddcs.pushhistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询属性推送历史
         * Summary: 查询属性推送历史
         */
        public async Task<QueryDdcsPushhistoryResponse> QueryDdcsPushhistoryExAsync(QueryDdcsPushhistoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDdcsPushhistoryResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.pushhistory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LDC模式部署获取所有zone
         * Summary: LDC模式部署获取所有zone
         */
        public QueryDssZoneResponse QueryDssZone(QueryDssZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDssZoneEx(request, headers, runtime);
        }

        /**
         * Description: LDC模式部署获取所有zone
         * Summary: LDC模式部署获取所有zone
         */
        public async Task<QueryDssZoneResponse> QueryDssZoneAsync(QueryDssZoneRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDssZoneExAsync(request, headers, runtime);
        }

        /**
         * Description: LDC模式部署获取所有zone
         * Summary: LDC模式部署获取所有zone
         */
        public QueryDssZoneResponse QueryDssZoneEx(QueryDssZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDssZoneResponse>(DoRequest("2.0", "sofa.ms.dss.zone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: LDC模式部署获取所有zone
         * Summary: LDC模式部署获取所有zone
         */
        public async Task<QueryDssZoneResponse> QueryDssZoneExAsync(QueryDssZoneRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDssZoneResponse>(await DoRequestAsync("2.0", "sofa.ms.dss.zone.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
        由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
         * Summary: 回滚最近一次动态配置推送
         */
        public RollbackDdcsDataResponse RollbackDdcsData(RollbackDdcsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackDdcsDataEx(request, headers, runtime);
        }

        /**
         * Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
        由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
         * Summary: 回滚最近一次动态配置推送
         */
        public async Task<RollbackDdcsDataResponse> RollbackDdcsDataAsync(RollbackDdcsDataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackDdcsDataExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
        由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
         * Summary: 回滚最近一次动态配置推送
         */
        public RollbackDdcsDataResponse RollbackDdcsDataEx(RollbackDdcsDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackDdcsDataResponse>(DoRequest("2.0", "sofa.ms.ddcs.data.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过 OpenAPI 回滚最后一次推送，也可以通过 uniqueId+forceRollback 回滚某一次推送。
        由于回滚历史版本风险非常高，不建议使用，只使用回滚最后一次推送。
         * Summary: 回滚最近一次动态配置推送
         */
        public async Task<RollbackDdcsDataResponse> RollbackDdcsDataExAsync(RollbackDdcsDataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackDdcsDataResponse>(await DoRequestAsync("2.0", "sofa.ms.ddcs.data.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据服务接口查询服务鉴权规则
         * Summary: 根据服务接口查询服务鉴权规则
         */
        public ListSgAuthrulegroupsResponse ListSgAuthrulegroups(ListSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAuthrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 根据服务接口查询服务鉴权规则
         * Summary: 根据服务接口查询服务鉴权规则
         */
        public async Task<ListSgAuthrulegroupsResponse> ListSgAuthrulegroupsAsync(ListSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAuthrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据服务接口查询服务鉴权规则
         * Summary: 根据服务接口查询服务鉴权规则
         */
        public ListSgAuthrulegroupsResponse ListSgAuthrulegroupsEx(ListSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroups.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据服务接口查询服务鉴权规则
         * Summary: 根据服务接口查询服务鉴权规则
         */
        public async Task<ListSgAuthrulegroupsResponse> ListSgAuthrulegroupsExAsync(ListSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroups.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询表单元数据，支持哪些鉴权规则
         * Summary: 查询表单元数据
         */
        public QuerySgFormconfigResponse QuerySgFormconfig(QuerySgFormconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgFormconfigEx(request, headers, runtime);
        }

        /**
         * Description: 查询表单元数据，支持哪些鉴权规则
         * Summary: 查询表单元数据
         */
        public async Task<QuerySgFormconfigResponse> QuerySgFormconfigAsync(QuerySgFormconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgFormconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询表单元数据，支持哪些鉴权规则
         * Summary: 查询表单元数据
         */
        public QuerySgFormconfigResponse QuerySgFormconfigEx(QuerySgFormconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgFormconfigResponse>(DoRequest("2.0", "sofa.ms.sg.formconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询表单元数据，支持哪些鉴权规则
         * Summary: 查询表单元数据
         */
        public async Task<QuerySgFormconfigResponse> QuerySgFormconfigExAsync(QuerySgFormconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgFormconfigResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.formconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清空黑白名单下所有鉴权规则
         * Summary: 清空黑白名单
         */
        public ReinitSgAuthrulesResponse ReinitSgAuthrules(ReinitSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitSgAuthrulesEx(request, headers, runtime);
        }

        /**
         * Description: 清空黑白名单下所有鉴权规则
         * Summary: 清空黑白名单
         */
        public async Task<ReinitSgAuthrulesResponse> ReinitSgAuthrulesAsync(ReinitSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitSgAuthrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 清空黑白名单下所有鉴权规则
         * Summary: 清空黑白名单
         */
        public ReinitSgAuthrulesResponse ReinitSgAuthrulesEx(ReinitSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitSgAuthrulesResponse>(DoRequest("2.0", "sofa.ms.sg.authrules.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 清空黑白名单下所有鉴权规则
         * Summary: 清空黑白名单
         */
        public async Task<ReinitSgAuthrulesResponse> ReinitSgAuthrulesExAsync(ReinitSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitSgAuthrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrules.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建服务鉴权规则
         * Summary: 创建服务鉴权规则
         */
        public SaveSgAuthrulegroupsResponse SaveSgAuthrulegroups(SaveSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveSgAuthrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 创建服务鉴权规则
         * Summary: 创建服务鉴权规则
         */
        public async Task<SaveSgAuthrulegroupsResponse> SaveSgAuthrulegroupsAsync(SaveSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveSgAuthrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建服务鉴权规则
         * Summary: 创建服务鉴权规则
         */
        public SaveSgAuthrulegroupsResponse SaveSgAuthrulegroupsEx(SaveSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveSgAuthrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroups.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建服务鉴权规则
         * Summary: 创建服务鉴权规则
         */
        public async Task<SaveSgAuthrulegroupsResponse> SaveSgAuthrulegroupsExAsync(SaveSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveSgAuthrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroups.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-同步服务发布者信息
         * Summary: 同步服务发布者信息
         */
        public SyncSgServicepublishersResponse SyncSgServicepublishers(SyncSgServicepublishersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncSgServicepublishersEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-同步服务发布者信息
         * Summary: 同步服务发布者信息
         */
        public async Task<SyncSgServicepublishersResponse> SyncSgServicepublishersAsync(SyncSgServicepublishersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncSgServicepublishersExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-同步服务发布者信息
         * Summary: 同步服务发布者信息
         */
        public SyncSgServicepublishersResponse SyncSgServicepublishersEx(SyncSgServicepublishersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSgServicepublishersResponse>(DoRequest("2.0", "sofa.ms.sg.servicepublishers.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-同步服务发布者信息
         * Summary: 同步服务发布者信息
         */
        public async Task<SyncSgServicepublishersResponse> SyncSgServicepublishersExAsync(SyncSgServicepublishersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSgServicepublishersResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicepublishers.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-同步服务发布者信息
         * Summary: 同步服务发布者信息
         */
        public SyncSgServicesubscribersResponse SyncSgServicesubscribers(SyncSgServicesubscribersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncSgServicesubscribersEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-同步服务发布者信息
         * Summary: 同步服务发布者信息
         */
        public async Task<SyncSgServicesubscribersResponse> SyncSgServicesubscribersAsync(SyncSgServicesubscribersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncSgServicesubscribersExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-同步服务发布者信息
         * Summary: 同步服务发布者信息
         */
        public SyncSgServicesubscribersResponse SyncSgServicesubscribersEx(SyncSgServicesubscribersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSgServicesubscribersResponse>(DoRequest("2.0", "sofa.ms.sg.servicesubscribers.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-同步服务发布者信息
         * Summary: 同步服务发布者信息
         */
        public async Task<SyncSgServicesubscribersResponse> SyncSgServicesubscribersExAsync(SyncSgServicesubscribersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSgServicesubscribersResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicesubscribers.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-同步客户端下线事件
         * Summary: 同步客户端下线事件
         */
        public SyncSgServiceclientsResponse SyncSgServiceclients(SyncSgServiceclientsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncSgServiceclientsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-同步客户端下线事件
         * Summary: 同步客户端下线事件
         */
        public async Task<SyncSgServiceclientsResponse> SyncSgServiceclientsAsync(SyncSgServiceclientsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncSgServiceclientsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-同步客户端下线事件
         * Summary: 同步客户端下线事件
         */
        public SyncSgServiceclientsResponse SyncSgServiceclientsEx(SyncSgServiceclientsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSgServiceclientsResponse>(DoRequest("2.0", "sofa.ms.sg.serviceclients.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-同步客户端下线事件
         * Summary: 同步客户端下线事件
         */
        public async Task<SyncSgServiceclientsResponse> SyncSgServiceclientsExAsync(SyncSgServiceclientsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSgServiceclientsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceclients.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-同步心跳数据
         * Summary: 同步心跳数据
         */
        public SyncSgServiceheartbeatsResponse SyncSgServiceheartbeats(SyncSgServiceheartbeatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncSgServiceheartbeatsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-同步心跳数据
         * Summary: 同步心跳数据
         */
        public async Task<SyncSgServiceheartbeatsResponse> SyncSgServiceheartbeatsAsync(SyncSgServiceheartbeatsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncSgServiceheartbeatsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-同步心跳数据
         * Summary: 同步心跳数据
         */
        public SyncSgServiceheartbeatsResponse SyncSgServiceheartbeatsEx(SyncSgServiceheartbeatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSgServiceheartbeatsResponse>(DoRequest("2.0", "sofa.ms.sg.serviceheartbeats.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-同步心跳数据
         * Summary: 同步心跳数据
         */
        public async Task<SyncSgServiceheartbeatsResponse> SyncSgServiceheartbeatsExAsync(SyncSgServiceheartbeatsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSgServiceheartbeatsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceheartbeats.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询发布者信息
         * Summary: 分页查询发布者
         */
        public QuerySgServicepublishersResponse QuerySgServicepublishers(QuerySgServicepublishersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicepublishersEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询发布者信息
         * Summary: 分页查询发布者
         */
        public async Task<QuerySgServicepublishersResponse> QuerySgServicepublishersAsync(QuerySgServicepublishersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicepublishersExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询发布者信息
         * Summary: 分页查询发布者
         */
        public QuerySgServicepublishersResponse QuerySgServicepublishersEx(QuerySgServicepublishersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicepublishersResponse>(DoRequest("2.0", "sofa.ms.sg.servicepublishers.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询发布者信息
         * Summary: 分页查询发布者
         */
        public async Task<QuerySgServicepublishersResponse> QuerySgServicepublishersExAsync(QuerySgServicepublishersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicepublishersResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicepublishers.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询消费者
         * Summary: 分页查询消费者
         */
        public QuerySgServicesubscribersResponse QuerySgServicesubscribers(QuerySgServicesubscribersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicesubscribersEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询消费者
         * Summary: 分页查询消费者
         */
        public async Task<QuerySgServicesubscribersResponse> QuerySgServicesubscribersAsync(QuerySgServicesubscribersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicesubscribersExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询消费者
         * Summary: 分页查询消费者
         */
        public QuerySgServicesubscribersResponse QuerySgServicesubscribersEx(QuerySgServicesubscribersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesubscribersResponse>(DoRequest("2.0", "sofa.ms.sg.servicesubscribers.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询消费者
         * Summary: 分页查询消费者
         */
        public async Task<QuerySgServicesubscribersResponse> QuerySgServicesubscribersExAsync(QuerySgServicesubscribersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesubscribersResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicesubscribers.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据dataId查询服务限流规则
         * Summary: 根据dataId查询服务限流规则
         */
        public QuerySgServiceratelimitrulesResponse QuerySgServiceratelimitrules(QuerySgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServiceratelimitrulesEx(request, headers, runtime);
        }

        /**
         * Description: 根据dataId查询服务限流规则
         * Summary: 根据dataId查询服务限流规则
         */
        public async Task<QuerySgServiceratelimitrulesResponse> QuerySgServiceratelimitrulesAsync(QuerySgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServiceratelimitrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据dataId查询服务限流规则
         * Summary: 根据dataId查询服务限流规则
         */
        public QuerySgServiceratelimitrulesResponse QuerySgServiceratelimitrulesEx(QuerySgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServiceratelimitrulesResponse>(DoRequest("2.0", "sofa.ms.sg.serviceratelimitrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据dataId查询服务限流规则
         * Summary: 根据dataId查询服务限流规则
         */
        public async Task<QuerySgServiceratelimitrulesResponse> QuerySgServiceratelimitrulesExAsync(QuerySgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServiceratelimitrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceratelimitrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增限流规则
         * Summary: 新增限流规则
         */
        public AddSgServiceratelimitrulesResponse AddSgServiceratelimitrules(AddSgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgServiceratelimitrulesEx(request, headers, runtime);
        }

        /**
         * Description: 新增限流规则
         * Summary: 新增限流规则
         */
        public async Task<AddSgServiceratelimitrulesResponse> AddSgServiceratelimitrulesAsync(AddSgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgServiceratelimitrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增限流规则
         * Summary: 新增限流规则
         */
        public AddSgServiceratelimitrulesResponse AddSgServiceratelimitrulesEx(AddSgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgServiceratelimitrulesResponse>(DoRequest("2.0", "sofa.ms.sg.serviceratelimitrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增限流规则
         * Summary: 新增限流规则
         */
        public async Task<AddSgServiceratelimitrulesResponse> AddSgServiceratelimitrulesExAsync(AddSgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgServiceratelimitrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceratelimitrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新服务限流规则
         * Summary: 更新服务限流规则
         */
        public UpdateSgServiceratelimitrulesResponse UpdateSgServiceratelimitrules(UpdateSgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgServiceratelimitrulesEx(request, headers, runtime);
        }

        /**
         * Description: 更新服务限流规则
         * Summary: 更新服务限流规则
         */
        public async Task<UpdateSgServiceratelimitrulesResponse> UpdateSgServiceratelimitrulesAsync(UpdateSgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgServiceratelimitrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新服务限流规则
         * Summary: 更新服务限流规则
         */
        public UpdateSgServiceratelimitrulesResponse UpdateSgServiceratelimitrulesEx(UpdateSgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgServiceratelimitrulesResponse>(DoRequest("2.0", "sofa.ms.sg.serviceratelimitrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新服务限流规则
         * Summary: 更新服务限流规则
         */
        public async Task<UpdateSgServiceratelimitrulesResponse> UpdateSgServiceratelimitrulesExAsync(UpdateSgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgServiceratelimitrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceratelimitrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public DeleteSgServiceratelimitrulesResponse DeleteSgServiceratelimitrules(DeleteSgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgServiceratelimitrulesEx(request, headers, runtime);
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public async Task<DeleteSgServiceratelimitrulesResponse> DeleteSgServiceratelimitrulesAsync(DeleteSgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgServiceratelimitrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public DeleteSgServiceratelimitrulesResponse DeleteSgServiceratelimitrulesEx(DeleteSgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgServiceratelimitrulesResponse>(DoRequest("2.0", "sofa.ms.sg.serviceratelimitrules.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除限流规则
         * Summary: 删除限流规则
         */
        public async Task<DeleteSgServiceratelimitrulesResponse> DeleteSgServiceratelimitrulesExAsync(DeleteSgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgServiceratelimitrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceratelimitrules.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 禁用/启用限流规则
         * Summary: 禁用/启用限流规则
         */
        public UpdateSgServiceratelimitrulestatusResponse UpdateSgServiceratelimitrulestatus(UpdateSgServiceratelimitrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgServiceratelimitrulestatusEx(request, headers, runtime);
        }

        /**
         * Description: 禁用/启用限流规则
         * Summary: 禁用/启用限流规则
         */
        public async Task<UpdateSgServiceratelimitrulestatusResponse> UpdateSgServiceratelimitrulestatusAsync(UpdateSgServiceratelimitrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgServiceratelimitrulestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 禁用/启用限流规则
         * Summary: 禁用/启用限流规则
         */
        public UpdateSgServiceratelimitrulestatusResponse UpdateSgServiceratelimitrulestatusEx(UpdateSgServiceratelimitrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgServiceratelimitrulestatusResponse>(DoRequest("2.0", "sofa.ms.sg.serviceratelimitrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 禁用/启用限流规则
         * Summary: 禁用/启用限流规则
         */
        public async Task<UpdateSgServiceratelimitrulestatusResponse> UpdateSgServiceratelimitrulestatusExAsync(UpdateSgServiceratelimitrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgServiceratelimitrulestatusResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceratelimitrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加服务路由规则
         * Summary: 添加服务路由规则
         */
        public AddSgRouterrulegroupsResponse AddSgRouterrulegroups(AddSgRouterrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgRouterrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 添加服务路由规则
         * Summary: 添加服务路由规则
         */
        public async Task<AddSgRouterrulegroupsResponse> AddSgRouterrulegroupsAsync(AddSgRouterrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgRouterrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加服务路由规则
         * Summary: 添加服务路由规则
         */
        public AddSgRouterrulegroupsResponse AddSgRouterrulegroupsEx(AddSgRouterrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgRouterrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulegroups.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加服务路由规则
         * Summary: 添加服务路由规则
         */
        public async Task<AddSgRouterrulegroupsResponse> AddSgRouterrulegroupsExAsync(AddSgRouterrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgRouterrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulegroups.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由规则
         * Summary: 查询路由规则
         */
        public GetSgRouterrulesResponse GetSgRouterrules(GetSgRouterrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSgRouterrulesEx(request, headers, runtime);
        }

        /**
         * Description: 查询路由规则
         * Summary: 查询路由规则
         */
        public async Task<GetSgRouterrulesResponse> GetSgRouterrulesAsync(GetSgRouterrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSgRouterrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询路由规则
         * Summary: 查询路由规则
         */
        public GetSgRouterrulesResponse GetSgRouterrulesEx(GetSgRouterrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgRouterrulesResponse>(DoRequest("2.0", "sofa.ms.sg.routerrules.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询路由规则
         * Summary: 查询路由规则
         */
        public async Task<GetSgRouterrulesResponse> GetSgRouterrulesExAsync(GetSgRouterrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgRouterrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrules.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新服务路由规则
         * Summary: 更新服务路由规则
         */
        public UpdateSgRouterrulegroupsResponse UpdateSgRouterrulegroups(UpdateSgRouterrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgRouterrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 更新服务路由规则
         * Summary: 更新服务路由规则
         */
        public async Task<UpdateSgRouterrulegroupsResponse> UpdateSgRouterrulegroupsAsync(UpdateSgRouterrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgRouterrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新服务路由规则
         * Summary: 更新服务路由规则
         */
        public UpdateSgRouterrulegroupsResponse UpdateSgRouterrulegroupsEx(UpdateSgRouterrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgRouterrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulegroups.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新服务路由规则
         * Summary: 更新服务路由规则
         */
        public async Task<UpdateSgRouterrulegroupsResponse> UpdateSgRouterrulegroupsExAsync(UpdateSgRouterrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgRouterrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulegroups.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-启用路由器规则组
         * Summary: 启用路由器规则组
         */
        public EnableSgRouterrulesResponse EnableSgRouterrules(EnableSgRouterrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgRouterrulesEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-启用路由器规则组
         * Summary: 启用路由器规则组
         */
        public async Task<EnableSgRouterrulesResponse> EnableSgRouterrulesAsync(EnableSgRouterrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgRouterrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-启用路由器规则组
         * Summary: 启用路由器规则组
         */
        public EnableSgRouterrulesResponse EnableSgRouterrulesEx(EnableSgRouterrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgRouterrulesResponse>(DoRequest("2.0", "sofa.ms.sg.routerrules.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-启用路由器规则组
         * Summary: 启用路由器规则组
         */
        public async Task<EnableSgRouterrulesResponse> EnableSgRouterrulesExAsync(EnableSgRouterrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgRouterrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrules.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取路由规则组版本列表
         * Summary: 获取路由规则组版本列表
         */
        public ListSgRouterruleversionsResponse ListSgRouterruleversions(ListSgRouterruleversionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgRouterruleversionsEx(request, headers, runtime);
        }

        /**
         * Description: 获取路由规则组版本列表
         * Summary: 获取路由规则组版本列表
         */
        public async Task<ListSgRouterruleversionsResponse> ListSgRouterruleversionsAsync(ListSgRouterruleversionsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgRouterruleversionsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取路由规则组版本列表
         * Summary: 获取路由规则组版本列表
         */
        public ListSgRouterruleversionsResponse ListSgRouterruleversionsEx(ListSgRouterruleversionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterruleversionsResponse>(DoRequest("2.0", "sofa.ms.sg.routerruleversions.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取路由规则组版本列表
         * Summary: 获取路由规则组版本列表
         */
        public async Task<ListSgRouterruleversionsResponse> ListSgRouterruleversionsExAsync(ListSgRouterruleversionsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterruleversionsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerruleversions.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取路由规则状态
         * Summary: 获取路由规则状态
         */
        public QuerySgRouterrulestatusResponse QuerySgRouterrulestatus(QuerySgRouterrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgRouterrulestatusEx(request, headers, runtime);
        }

        /**
         * Description: 获取路由规则状态
         * Summary: 获取路由规则状态
         */
        public async Task<QuerySgRouterrulestatusResponse> QuerySgRouterrulestatusAsync(QuerySgRouterrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgRouterrulestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取路由规则状态
         * Summary: 获取路由规则状态
         */
        public QuerySgRouterrulestatusResponse QuerySgRouterrulestatusEx(QuerySgRouterrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgRouterrulestatusResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulestatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取路由规则状态
         * Summary: 获取路由规则状态
         */
        public async Task<QuerySgRouterrulestatusResponse> QuerySgRouterrulestatusExAsync(QuerySgRouterrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgRouterrulestatusResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulestatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除鉴权规则
         * Summary: 删除鉴权规则
         */
        public DeleteSgAuthrulesResponse DeleteSgAuthrules(DeleteSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgAuthrulesEx(request, headers, runtime);
        }

        /**
         * Description: 删除鉴权规则
         * Summary: 删除鉴权规则
         */
        public async Task<DeleteSgAuthrulesResponse> DeleteSgAuthrulesAsync(DeleteSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgAuthrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除鉴权规则
         * Summary: 删除鉴权规则
         */
        public DeleteSgAuthrulesResponse DeleteSgAuthrulesEx(DeleteSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgAuthrulesResponse>(DoRequest("2.0", "sofa.ms.sg.authrules.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除鉴权规则
         * Summary: 删除鉴权规则
         */
        public async Task<DeleteSgAuthrulesResponse> DeleteSgAuthrulesExAsync(DeleteSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgAuthrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrules.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-通过DataId获取AppNames
         * Summary: 通过DataId获取AppNames
         */
        public ListSgRouterruleappnamesResponse ListSgRouterruleappnames(ListSgRouterruleappnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgRouterruleappnamesEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-通过DataId获取AppNames
         * Summary: 通过DataId获取AppNames
         */
        public async Task<ListSgRouterruleappnamesResponse> ListSgRouterruleappnamesAsync(ListSgRouterruleappnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgRouterruleappnamesExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-通过DataId获取AppNames
         * Summary: 通过DataId获取AppNames
         */
        public ListSgRouterruleappnamesResponse ListSgRouterruleappnamesEx(ListSgRouterruleappnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterruleappnamesResponse>(DoRequest("2.0", "sofa.ms.sg.routerruleappnames.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-通过DataId获取AppNames
         * Summary: 通过DataId获取AppNames
         */
        public async Task<ListSgRouterruleappnamesResponse> ListSgRouterruleappnamesExAsync(ListSgRouterruleappnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterruleappnamesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerruleappnames.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
         * Summary: 启用服务鉴权黑、白名单
         */
        public EnableSgAuthrulegroupsResponse EnableSgAuthrulegroups(EnableSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgAuthrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
         * Summary: 启用服务鉴权黑、白名单
         */
        public async Task<EnableSgAuthrulegroupsResponse> EnableSgAuthrulegroupsAsync(EnableSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgAuthrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
         * Summary: 启用服务鉴权黑、白名单
         */
        public EnableSgAuthrulegroupsResponse EnableSgAuthrulegroupsEx(EnableSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgAuthrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroups.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启用服务鉴权黑、白名单。黑、白名单不能同时生效
         * Summary: 启用服务鉴权黑、白名单
         */
        public async Task<EnableSgAuthrulegroupsResponse> EnableSgAuthrulegroupsExAsync(EnableSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgAuthrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroups.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取快照最后一个
         * Summary: 获取快照最后一个
         */
        public GetSgRouterrulesnapshotsResponse GetSgRouterrulesnapshots(GetSgRouterrulesnapshotsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSgRouterrulesnapshotsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取快照最后一个
         * Summary: 获取快照最后一个
         */
        public async Task<GetSgRouterrulesnapshotsResponse> GetSgRouterrulesnapshotsAsync(GetSgRouterrulesnapshotsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSgRouterrulesnapshotsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取快照最后一个
         * Summary: 获取快照最后一个
         */
        public GetSgRouterrulesnapshotsResponse GetSgRouterrulesnapshotsEx(GetSgRouterrulesnapshotsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgRouterrulesnapshotsResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulesnapshots.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取快照最后一个
         * Summary: 获取快照最后一个
         */
        public async Task<GetSgRouterrulesnapshotsResponse> GetSgRouterrulesnapshotsExAsync(GetSgRouterrulesnapshotsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgRouterrulesnapshotsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulesnapshots.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-回滚快照最后一个
         * Summary: 回滚快照最后一个
         */
        public RollbackSgRouterrulesnapshotsResponse RollbackSgRouterrulesnapshots(RollbackSgRouterrulesnapshotsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RollbackSgRouterrulesnapshotsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-回滚快照最后一个
         * Summary: 回滚快照最后一个
         */
        public async Task<RollbackSgRouterrulesnapshotsResponse> RollbackSgRouterrulesnapshotsAsync(RollbackSgRouterrulesnapshotsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RollbackSgRouterrulesnapshotsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-回滚快照最后一个
         * Summary: 回滚快照最后一个
         */
        public RollbackSgRouterrulesnapshotsResponse RollbackSgRouterrulesnapshotsEx(RollbackSgRouterrulesnapshotsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackSgRouterrulesnapshotsResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulesnapshots.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-回滚快照最后一个
         * Summary: 回滚快照最后一个
         */
        public async Task<RollbackSgRouterrulesnapshotsResponse> RollbackSgRouterrulesnapshotsExAsync(RollbackSgRouterrulesnapshotsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RollbackSgRouterrulesnapshotsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulesnapshots.rollback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取调度日志
         * Summary: 获取调度日志
         */
        public QuerySgRouterruledispatchlogsResponse QuerySgRouterruledispatchlogs(QuerySgRouterruledispatchlogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgRouterruledispatchlogsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取调度日志
         * Summary: 获取调度日志
         */
        public async Task<QuerySgRouterruledispatchlogsResponse> QuerySgRouterruledispatchlogsAsync(QuerySgRouterruledispatchlogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgRouterruledispatchlogsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取调度日志
         * Summary: 获取调度日志
         */
        public QuerySgRouterruledispatchlogsResponse QuerySgRouterruledispatchlogsEx(QuerySgRouterruledispatchlogsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgRouterruledispatchlogsResponse>(DoRequest("2.0", "sofa.ms.sg.routerruledispatchlogs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取调度日志
         * Summary: 获取调度日志
         */
        public async Task<QuerySgRouterruledispatchlogsResponse> QuerySgRouterruledispatchlogsExAsync(QuerySgRouterruledispatchlogsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgRouterruledispatchlogsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerruledispatchlogs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加一条白、黑名单规则
         * Summary: 添加一条鉴权规则
         */
        public AddSgAuthrulesResponse AddSgAuthrules(AddSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgAuthrulesEx(request, headers, runtime);
        }

        /**
         * Description: 添加一条白、黑名单规则
         * Summary: 添加一条鉴权规则
         */
        public async Task<AddSgAuthrulesResponse> AddSgAuthrulesAsync(AddSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgAuthrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加一条白、黑名单规则
         * Summary: 添加一条鉴权规则
         */
        public AddSgAuthrulesResponse AddSgAuthrulesEx(AddSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgAuthrulesResponse>(DoRequest("2.0", "sofa.ms.sg.authrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加一条白、黑名单规则
         * Summary: 添加一条鉴权规则
         */
        public async Task<AddSgAuthrulesResponse> AddSgAuthrulesExAsync(AddSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgAuthrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新一条服务鉴权规则
         * Summary: 更新一条服务鉴权规则
         */
        public UpdateSgAuthrulesResponse UpdateSgAuthrules(UpdateSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgAuthrulesEx(request, headers, runtime);
        }

        /**
         * Description: 更新一条服务鉴权规则
         * Summary: 更新一条服务鉴权规则
         */
        public async Task<UpdateSgAuthrulesResponse> UpdateSgAuthrulesAsync(UpdateSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgAuthrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新一条服务鉴权规则
         * Summary: 更新一条服务鉴权规则
         */
        public UpdateSgAuthrulesResponse UpdateSgAuthrulesEx(UpdateSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgAuthrulesResponse>(DoRequest("2.0", "sofa.ms.sg.authrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新一条服务鉴权规则
         * Summary: 更新一条服务鉴权规则
         */
        public async Task<UpdateSgAuthrulesResponse> UpdateSgAuthrulesExAsync(UpdateSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgAuthrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 禁止一份服务鉴权黑、白名单
         * Summary: 禁止一份服务鉴权黑、白名单
         */
        public DisableSgAuthrulegroupsResponse DisableSgAuthrulegroups(DisableSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableSgAuthrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 禁止一份服务鉴权黑、白名单
         * Summary: 禁止一份服务鉴权黑、白名单
         */
        public async Task<DisableSgAuthrulegroupsResponse> DisableSgAuthrulegroupsAsync(DisableSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableSgAuthrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 禁止一份服务鉴权黑、白名单
         * Summary: 禁止一份服务鉴权黑、白名单
         */
        public DisableSgAuthrulegroupsResponse DisableSgAuthrulegroupsEx(DisableSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgAuthrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroups.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 禁止一份服务鉴权黑、白名单
         * Summary: 禁止一份服务鉴权黑、白名单
         */
        public async Task<DisableSgAuthrulegroupsResponse> DisableSgAuthrulegroupsExAsync(DisableSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgAuthrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroups.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用关联数据
         * Summary: 获取应用关联数据
         */
        public QuerySgApprelationsResponse QuerySgApprelations(QuerySgApprelationsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgApprelationsEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用关联数据
         * Summary: 获取应用关联数据
         */
        public async Task<QuerySgApprelationsResponse> QuerySgApprelationsAsync(QuerySgApprelationsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgApprelationsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用关联数据
         * Summary: 获取应用关联数据
         */
        public QuerySgApprelationsResponse QuerySgApprelationsEx(QuerySgApprelationsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgApprelationsResponse>(DoRequest("2.0", "sofa.ms.sg.apprelations.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用关联数据
         * Summary: 获取应用关联数据
         */
        public async Task<QuerySgApprelationsResponse> QuerySgApprelationsExAsync(QuerySgApprelationsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgApprelationsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.apprelations.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启用服务鉴权规则
         * Summary: 启用服务鉴权规则
         */
        public EnableSgAuthrulesResponse EnableSgAuthrules(EnableSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgAuthrulesEx(request, headers, runtime);
        }

        /**
         * Description: 启用服务鉴权规则
         * Summary: 启用服务鉴权规则
         */
        public async Task<EnableSgAuthrulesResponse> EnableSgAuthrulesAsync(EnableSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgAuthrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 启用服务鉴权规则
         * Summary: 启用服务鉴权规则
         */
        public EnableSgAuthrulesResponse EnableSgAuthrulesEx(EnableSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgAuthrulesResponse>(DoRequest("2.0", "sofa.ms.sg.authrules.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启用服务鉴权规则
         * Summary: 启用服务鉴权规则
         */
        public async Task<EnableSgAuthrulesResponse> EnableSgAuthrulesExAsync(EnableSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgAuthrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrules.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 禁用黑、白名单中的一条规则
         * Summary: 禁用黑、白名单中的一条规则
         */
        public DisableSgAuthrulesResponse DisableSgAuthrules(DisableSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableSgAuthrulesEx(request, headers, runtime);
        }

        /**
         * Description: 禁用黑、白名单中的一条规则
         * Summary: 禁用黑、白名单中的一条规则
         */
        public async Task<DisableSgAuthrulesResponse> DisableSgAuthrulesAsync(DisableSgAuthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableSgAuthrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 禁用黑、白名单中的一条规则
         * Summary: 禁用黑、白名单中的一条规则
         */
        public DisableSgAuthrulesResponse DisableSgAuthrulesEx(DisableSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgAuthrulesResponse>(DoRequest("2.0", "sofa.ms.sg.authrules.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 禁用黑、白名单中的一条规则
         * Summary: 禁用黑、白名单中的一条规则
         */
        public async Task<DisableSgAuthrulesResponse> DisableSgAuthrulesExAsync(DisableSgAuthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgAuthrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrules.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取服务发布者关系
         * Summary: 获取服务发布者关系
         */
        public QuerySgServicepubrelationsResponse QuerySgServicepubrelations(QuerySgServicepubrelationsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicepubrelationsEx(request, headers, runtime);
        }

        /**
         * Description: 获取服务发布者关系
         * Summary: 获取服务发布者关系
         */
        public async Task<QuerySgServicepubrelationsResponse> QuerySgServicepubrelationsAsync(QuerySgServicepubrelationsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicepubrelationsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取服务发布者关系
         * Summary: 获取服务发布者关系
         */
        public QuerySgServicepubrelationsResponse QuerySgServicepubrelationsEx(QuerySgServicepubrelationsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicepubrelationsResponse>(DoRequest("2.0", "sofa.ms.sg.servicepubrelations.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取服务发布者关系
         * Summary: 获取服务发布者关系
         */
        public async Task<QuerySgServicepubrelationsResponse> QuerySgServicepubrelationsExAsync(QuerySgServicepubrelationsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicepubrelationsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicepubrelations.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务鉴权规则下发失败，重新下发规则
         * Summary: 服务鉴权规则下发失败，重新下发规则
         */
        public RetrySgAuthrulegroupsResponse RetrySgAuthrulegroups(RetrySgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RetrySgAuthrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 服务鉴权规则下发失败，重新下发规则
         * Summary: 服务鉴权规则下发失败，重新下发规则
         */
        public async Task<RetrySgAuthrulegroupsResponse> RetrySgAuthrulegroupsAsync(RetrySgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RetrySgAuthrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 服务鉴权规则下发失败，重新下发规则
         * Summary: 服务鉴权规则下发失败，重新下发规则
         */
        public RetrySgAuthrulegroupsResponse RetrySgAuthrulegroupsEx(RetrySgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetrySgAuthrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroups.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务鉴权规则下发失败，重新下发规则
         * Summary: 服务鉴权规则下发失败，重新下发规则
         */
        public async Task<RetrySgAuthrulegroupsResponse> RetrySgAuthrulegroupsExAsync(RetrySgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RetrySgAuthrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroups.retry", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取服务消费者数据
         * Summary: 获取服务消费者数据
         */
        public QuerySgServicesubrelationsResponse QuerySgServicesubrelations(QuerySgServicesubrelationsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicesubrelationsEx(request, headers, runtime);
        }

        /**
         * Description: 获取服务消费者数据
         * Summary: 获取服务消费者数据
         */
        public async Task<QuerySgServicesubrelationsResponse> QuerySgServicesubrelationsAsync(QuerySgServicesubrelationsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicesubrelationsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取服务消费者数据
         * Summary: 获取服务消费者数据
         */
        public QuerySgServicesubrelationsResponse QuerySgServicesubrelationsEx(QuerySgServicesubrelationsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesubrelationsResponse>(DoRequest("2.0", "sofa.ms.sg.servicesubrelations.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取服务消费者数据
         * Summary: 获取服务消费者数据
         */
        public async Task<QuerySgServicesubrelationsResponse> QuerySgServicesubrelationsExAsync(QuerySgServicesubrelationsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesubrelationsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicesubrelations.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-显示关系切换
         * Summary: 显示关系切换
         */
        public GetSgRelationswitchResponse GetSgRelationswitch(GetSgRelationswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSgRelationswitchEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-显示关系切换
         * Summary: 显示关系切换
         */
        public async Task<GetSgRelationswitchResponse> GetSgRelationswitchAsync(GetSgRelationswitchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSgRelationswitchExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-显示关系切换
         * Summary: 显示关系切换
         */
        public GetSgRelationswitchResponse GetSgRelationswitchEx(GetSgRelationswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgRelationswitchResponse>(DoRequest("2.0", "sofa.ms.sg.relationswitch.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-显示关系切换
         * Summary: 显示关系切换
         */
        public async Task<GetSgRelationswitchResponse> GetSgRelationswitchExAsync(GetSgRelationswitchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgRelationswitchResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.relationswitch.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取InstanceId
         * Summary: 获取InstanceId
         */
        public GetMiddlewareInstanceResponse GetMiddlewareInstance(GetMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMiddlewareInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取InstanceId
         * Summary: 获取InstanceId
         */
        public async Task<GetMiddlewareInstanceResponse> GetMiddlewareInstanceAsync(GetMiddlewareInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMiddlewareInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取InstanceId
         * Summary: 获取InstanceId
         */
        public GetMiddlewareInstanceResponse GetMiddlewareInstanceEx(GetMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareInstanceResponse>(DoRequest("2.0", "sofa.ms.middleware.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取InstanceId
         * Summary: 获取InstanceId
         */
        public async Task<GetMiddlewareInstanceResponse> GetMiddlewareInstanceExAsync(GetMiddlewareInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMiddlewareInstanceResponse>(await DoRequestAsync("2.0", "sofa.ms.middleware.instance.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取获取环境配置
         * Summary: 获取获取环境配置
         */
        public GetSgEnvconfigResponse GetSgEnvconfig(GetSgEnvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSgEnvconfigEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取获取环境配置
         * Summary: 获取获取环境配置
         */
        public async Task<GetSgEnvconfigResponse> GetSgEnvconfigAsync(GetSgEnvconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSgEnvconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取获取环境配置
         * Summary: 获取获取环境配置
         */
        public GetSgEnvconfigResponse GetSgEnvconfigEx(GetSgEnvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgEnvconfigResponse>(DoRequest("2.0", "sofa.ms.sg.envconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取获取环境配置
         * Summary: 获取获取环境配置
         */
        public async Task<GetSgEnvconfigResponse> GetSgEnvconfigExAsync(GetSgEnvconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgEnvconfigResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.envconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布服务的应用列表
         * Summary: 获取发布服务的应用列表
         */
        public ListSgServiceappsResponse ListSgServiceapps(ListSgServiceappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgServiceappsEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布服务的应用列表
         * Summary: 获取发布服务的应用列表
         */
        public async Task<ListSgServiceappsResponse> ListSgServiceappsAsync(ListSgServiceappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgServiceappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布服务的应用列表
         * Summary: 获取发布服务的应用列表
         */
        public ListSgServiceappsResponse ListSgServiceappsEx(ListSgServiceappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgServiceappsResponse>(DoRequest("2.0", "sofa.ms.sg.serviceapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布服务的应用列表
         * Summary: 获取发布服务的应用列表
         */
        public async Task<ListSgServiceappsResponse> ListSgServiceappsExAsync(ListSgServiceappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgServiceappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取服务候选词
         * Summary: 获取服务候选词
         */
        public QuerySgServicekeywordResponse QuerySgServicekeyword(QuerySgServicekeywordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicekeywordEx(request, headers, runtime);
        }

        /**
         * Description: 获取服务候选词
         * Summary: 获取服务候选词
         */
        public async Task<QuerySgServicekeywordResponse> QuerySgServicekeywordAsync(QuerySgServicekeywordRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicekeywordExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取服务候选词
         * Summary: 获取服务候选词
         */
        public QuerySgServicekeywordResponse QuerySgServicekeywordEx(QuerySgServicekeywordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicekeywordResponse>(DoRequest("2.0", "sofa.ms.sg.servicekeyword.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取服务候选词
         * Summary: 获取服务候选词
         */
        public async Task<QuerySgServicekeywordResponse> QuerySgServicekeywordExAsync(QuerySgServicekeywordRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicekeywordResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicekeyword.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-根据关键词搜索
         * Summary: 根据关键词搜索
         */
        public QuerySgServicesResponse QuerySgServices(QuerySgServicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicesEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-根据关键词搜索
         * Summary: 根据关键词搜索
         */
        public async Task<QuerySgServicesResponse> QuerySgServicesAsync(QuerySgServicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-根据关键词搜索
         * Summary: 根据关键词搜索
         */
        public QuerySgServicesResponse QuerySgServicesEx(QuerySgServicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesResponse>(DoRequest("2.0", "sofa.ms.sg.services.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-根据关键词搜索
         * Summary: 根据关键词搜索
         */
        public async Task<QuerySgServicesResponse> QuerySgServicesExAsync(QuerySgServicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.services.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据ip搜索服务提供方
         * Summary: 根据ip搜索服务提供方
         */
        public QuerySgServicepubkeysResponse QuerySgServicepubkeys(QuerySgServicepubkeysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicepubkeysEx(request, headers, runtime);
        }

        /**
         * Description: 根据ip搜索服务提供方
         * Summary: 根据ip搜索服务提供方
         */
        public async Task<QuerySgServicepubkeysResponse> QuerySgServicepubkeysAsync(QuerySgServicepubkeysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicepubkeysExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据ip搜索服务提供方
         * Summary: 根据ip搜索服务提供方
         */
        public QuerySgServicepubkeysResponse QuerySgServicepubkeysEx(QuerySgServicepubkeysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicepubkeysResponse>(DoRequest("2.0", "sofa.ms.sg.servicepubkeys.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据ip搜索服务提供方
         * Summary: 根据ip搜索服务提供方
         */
        public async Task<QuerySgServicepubkeysResponse> QuerySgServicepubkeysExAsync(QuerySgServicepubkeysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicepubkeysResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicepubkeys.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据ip搜索消费者
         * Summary: 根据ip搜索消费者
         */
        public QuerySgServicesubkeysResponse QuerySgServicesubkeys(QuerySgServicesubkeysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicesubkeysEx(request, headers, runtime);
        }

        /**
         * Description: 根据ip搜索消费者
         * Summary: 根据ip搜索消费者
         */
        public async Task<QuerySgServicesubkeysResponse> QuerySgServicesubkeysAsync(QuerySgServicesubkeysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicesubkeysExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据ip搜索消费者
         * Summary: 根据ip搜索消费者
         */
        public QuerySgServicesubkeysResponse QuerySgServicesubkeysEx(QuerySgServicesubkeysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesubkeysResponse>(DoRequest("2.0", "sofa.ms.sg.servicesubkeys.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据ip搜索消费者
         * Summary: 根据ip搜索消费者
         */
        public async Task<QuerySgServicesubkeysResponse> QuerySgServicesubkeysExAsync(QuerySgServicesubkeysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesubkeysResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicesubkeys.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布者服务详情
         * Summary: 获取发布者服务详情
         */
        public QuerySgServicepubsResponse QuerySgServicepubs(QuerySgServicepubsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicepubsEx(request, headers, runtime);
        }

        /**
         * Description: 获取发布者服务详情
         * Summary: 获取发布者服务详情
         */
        public async Task<QuerySgServicepubsResponse> QuerySgServicepubsAsync(QuerySgServicepubsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicepubsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取发布者服务详情
         * Summary: 获取发布者服务详情
         */
        public QuerySgServicepubsResponse QuerySgServicepubsEx(QuerySgServicepubsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicepubsResponse>(DoRequest("2.0", "sofa.ms.sg.servicepubs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取发布者服务详情
         * Summary: 获取发布者服务详情
         */
        public async Task<QuerySgServicepubsResponse> QuerySgServicepubsExAsync(QuerySgServicepubsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicepubsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicepubs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取订阅者服务详情
         * Summary: 获取订阅者服务详情
         */
        public QuerySgServicesubsResponse QuerySgServicesubs(QuerySgServicesubsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicesubsEx(request, headers, runtime);
        }

        /**
         * Description: 获取订阅者服务详情
         * Summary: 获取订阅者服务详情
         */
        public async Task<QuerySgServicesubsResponse> QuerySgServicesubsAsync(QuerySgServicesubsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicesubsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取订阅者服务详情
         * Summary: 获取订阅者服务详情
         */
        public QuerySgServicesubsResponse QuerySgServicesubsEx(QuerySgServicesubsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesubsResponse>(DoRequest("2.0", "sofa.ms.sg.servicesubs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取订阅者服务详情
         * Summary: 获取订阅者服务详情
         */
        public async Task<QuerySgServicesubsResponse> QuerySgServicesubsExAsync(QuerySgServicesubsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesubsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicesubs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-通过DataId和IP获取pub服务详情
         * Summary: 通过DataId和IP获取pub服务详情
         */
        public ListSgServicepubsResponse ListSgServicepubs(ListSgServicepubsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgServicepubsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-通过DataId和IP获取pub服务详情
         * Summary: 通过DataId和IP获取pub服务详情
         */
        public async Task<ListSgServicepubsResponse> ListSgServicepubsAsync(ListSgServicepubsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgServicepubsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-通过DataId和IP获取pub服务详情
         * Summary: 通过DataId和IP获取pub服务详情
         */
        public ListSgServicepubsResponse ListSgServicepubsEx(ListSgServicepubsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgServicepubsResponse>(DoRequest("2.0", "sofa.ms.sg.servicepubs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-通过DataId和IP获取pub服务详情
         * Summary: 通过DataId和IP获取pub服务详情
         */
        public async Task<ListSgServicepubsResponse> ListSgServicepubsExAsync(ListSgServicepubsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgServicepubsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicepubs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-通过DataId和IP获取sub服务详情
         * Summary: 通过DataId和IP获取sub服务详情
         */
        public ListSgServicesubsResponse ListSgServicesubs(ListSgServicesubsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgServicesubsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-通过DataId和IP获取sub服务详情
         * Summary: 通过DataId和IP获取sub服务详情
         */
        public async Task<ListSgServicesubsResponse> ListSgServicesubsAsync(ListSgServicesubsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgServicesubsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-通过DataId和IP获取sub服务详情
         * Summary: 通过DataId和IP获取sub服务详情
         */
        public ListSgServicesubsResponse ListSgServicesubsEx(ListSgServicesubsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgServicesubsResponse>(DoRequest("2.0", "sofa.ms.sg.servicesubs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-通过DataId和IP获取sub服务详情
         * Summary: 通过DataId和IP获取sub服务详情
         */
        public async Task<ListSgServicesubsResponse> ListSgServicesubsExAsync(ListSgServicesubsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgServicesubsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicesubs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取服务汇总信息
         * Summary: 获取服务汇总信息
         */
        public QuerySgServicesummarysResponse QuerySgServicesummarys(QuerySgServicesummarysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgServicesummarysEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取服务汇总信息
         * Summary: 获取服务汇总信息
         */
        public async Task<QuerySgServicesummarysResponse> QuerySgServicesummarysAsync(QuerySgServicesummarysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgServicesummarysExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取服务汇总信息
         * Summary: 获取服务汇总信息
         */
        public QuerySgServicesummarysResponse QuerySgServicesummarysEx(QuerySgServicesummarysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesummarysResponse>(DoRequest("2.0", "sofa.ms.sg.servicesummarys.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取服务汇总信息
         * Summary: 获取服务汇总信息
         */
        public async Task<QuerySgServicesummarysResponse> QuerySgServicesummarysExAsync(QuerySgServicesummarysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgServicesummarysResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicesummarys.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 禁用一个服务下某个服务提供者
         * Summary: 禁用一个服务下某个服务提供者
         */
        public DisableSgServiceparamsResponse DisableSgServiceparams(DisableSgServiceparamsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableSgServiceparamsEx(request, headers, runtime);
        }

        /**
         * Description: 禁用一个服务下某个服务提供者
         * Summary: 禁用一个服务下某个服务提供者
         */
        public async Task<DisableSgServiceparamsResponse> DisableSgServiceparamsAsync(DisableSgServiceparamsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableSgServiceparamsExAsync(request, headers, runtime);
        }

        /**
         * Description: 禁用一个服务下某个服务提供者
         * Summary: 禁用一个服务下某个服务提供者
         */
        public DisableSgServiceparamsResponse DisableSgServiceparamsEx(DisableSgServiceparamsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgServiceparamsResponse>(DoRequest("2.0", "sofa.ms.sg.serviceparams.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 禁用一个服务下某个服务提供者
         * Summary: 禁用一个服务下某个服务提供者
         */
        public async Task<DisableSgServiceparamsResponse> DisableSgServiceparamsExAsync(DisableSgServiceparamsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgServiceparamsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceparams.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动一个服务下某个服务提供者
         * Summary: 启动一个服务下某个服务提供者
         */
        public EnableSgServiceparamsResponse EnableSgServiceparams(EnableSgServiceparamsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgServiceparamsEx(request, headers, runtime);
        }

        /**
         * Description: 启动一个服务下某个服务提供者
         * Summary: 启动一个服务下某个服务提供者
         */
        public async Task<EnableSgServiceparamsResponse> EnableSgServiceparamsAsync(EnableSgServiceparamsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgServiceparamsExAsync(request, headers, runtime);
        }

        /**
         * Description: 启动一个服务下某个服务提供者
         * Summary: 启动一个服务下某个服务提供者
         */
        public EnableSgServiceparamsResponse EnableSgServiceparamsEx(EnableSgServiceparamsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgServiceparamsResponse>(DoRequest("2.0", "sofa.ms.sg.serviceparams.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 启动一个服务下某个服务提供者
         * Summary: 启动一个服务下某个服务提供者
         */
        public async Task<EnableSgServiceparamsResponse> EnableSgServiceparamsExAsync(EnableSgServiceparamsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgServiceparamsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceparams.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置服务提供者权重
         * Summary: 设置服务提供者权重
         */
        public SetSgServiceparamweightResponse SetSgServiceparamweight(SetSgServiceparamweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetSgServiceparamweightEx(request, headers, runtime);
        }

        /**
         * Description: 设置服务提供者权重
         * Summary: 设置服务提供者权重
         */
        public async Task<SetSgServiceparamweightResponse> SetSgServiceparamweightAsync(SetSgServiceparamweightRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetSgServiceparamweightExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置服务提供者权重
         * Summary: 设置服务提供者权重
         */
        public SetSgServiceparamweightResponse SetSgServiceparamweightEx(SetSgServiceparamweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetSgServiceparamweightResponse>(DoRequest("2.0", "sofa.ms.sg.serviceparamweight.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置服务提供者权重
         * Summary: 设置服务提供者权重
         */
        public async Task<SetSgServiceparamweightResponse> SetSgServiceparamweightExAsync(SetSgServiceparamweightRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetSgServiceparamweightResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceparamweight.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复服务提供者默认设置
         * Summary: 恢复服务提供者默认设置
         */
        public ReinitSgServiceparamsResponse ReinitSgServiceparams(ReinitSgServiceparamsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitSgServiceparamsEx(request, headers, runtime);
        }

        /**
         * Description: 恢复服务提供者默认设置
         * Summary: 恢复服务提供者默认设置
         */
        public async Task<ReinitSgServiceparamsResponse> ReinitSgServiceparamsAsync(ReinitSgServiceparamsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitSgServiceparamsExAsync(request, headers, runtime);
        }

        /**
         * Description: 恢复服务提供者默认设置
         * Summary: 恢复服务提供者默认设置
         */
        public ReinitSgServiceparamsResponse ReinitSgServiceparamsEx(ReinitSgServiceparamsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitSgServiceparamsResponse>(DoRequest("2.0", "sofa.ms.sg.serviceparams.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 恢复服务提供者默认设置
         * Summary: 恢复服务提供者默认设置
         */
        public async Task<ReinitSgServiceparamsResponse> ReinitSgServiceparamsExAsync(ReinitSgServiceparamsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitSgServiceparamsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceparams.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-查询全部服务参数信息
         * Summary: 查询全部服务参数信息
         */
        public BatchquerySgServiceparamResponse BatchquerySgServiceparam(BatchquerySgServiceparamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchquerySgServiceparamEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-查询全部服务参数信息
         * Summary: 查询全部服务参数信息
         */
        public async Task<BatchquerySgServiceparamResponse> BatchquerySgServiceparamAsync(BatchquerySgServiceparamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchquerySgServiceparamExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-查询全部服务参数信息
         * Summary: 查询全部服务参数信息
         */
        public BatchquerySgServiceparamResponse BatchquerySgServiceparamEx(BatchquerySgServiceparamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchquerySgServiceparamResponse>(DoRequest("2.0", "sofa.ms.sg.serviceparam.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-查询全部服务参数信息
         * Summary: 查询全部服务参数信息
         */
        public async Task<BatchquerySgServiceparamResponse> BatchquerySgServiceparamExAsync(BatchquerySgServiceparamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchquerySgServiceparamResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceparam.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注入了指定类型的sidecar 的Pod 实例
         * Summary: sidecar实例查询
         */
        public QueryMeshSidecarResponse QueryMeshSidecar(QueryMeshSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMeshSidecarEx(request, headers, runtime);
        }

        /**
         * Description: 查询注入了指定类型的sidecar 的Pod 实例
         * Summary: sidecar实例查询
         */
        public async Task<QueryMeshSidecarResponse> QueryMeshSidecarAsync(QueryMeshSidecarRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMeshSidecarExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询注入了指定类型的sidecar 的Pod 实例
         * Summary: sidecar实例查询
         */
        public QueryMeshSidecarResponse QueryMeshSidecarEx(QueryMeshSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshSidecarResponse>(DoRequest("2.0", "sofa.ms.mesh.sidecar.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注入了指定类型的sidecar 的Pod 实例
         * Summary: sidecar实例查询
         */
        public async Task<QueryMeshSidecarResponse> QueryMeshSidecarExAsync(QueryMeshSidecarRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMeshSidecarResponse>(await DoRequestAsync("2.0", "sofa.ms.mesh.sidecar.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-配置获取
         * Summary: 配置获取
         */
        public GetGuardianGuardianconfigResponse GetGuardianGuardianconfig(GetGuardianGuardianconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGuardianGuardianconfigEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-配置获取
         * Summary: 配置获取
         */
        public async Task<GetGuardianGuardianconfigResponse> GetGuardianGuardianconfigAsync(GetGuardianGuardianconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGuardianGuardianconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-配置获取
         * Summary: 配置获取
         */
        public GetGuardianGuardianconfigResponse GetGuardianGuardianconfigEx(GetGuardianGuardianconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGuardianGuardianconfigResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-配置获取
         * Summary: 配置获取
         */
        public async Task<GetGuardianGuardianconfigResponse> GetGuardianGuardianconfigExAsync(GetGuardianGuardianconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGuardianGuardianconfigResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianconfig.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取app列表
         * Summary: 获取app列表
         */
        public AllGuardianGuardianappsResponse AllGuardianGuardianapps(AllGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllGuardianGuardianappsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取app列表
         * Summary: 获取app列表
         */
        public async Task<AllGuardianGuardianappsResponse> AllGuardianGuardianappsAsync(AllGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllGuardianGuardianappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-获取app列表
         * Summary: 获取app列表
         */
        public AllGuardianGuardianappsResponse AllGuardianGuardianappsEx(AllGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllGuardianGuardianappsResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianapps.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-获取app列表
         * Summary: 获取app列表
         */
        public async Task<AllGuardianGuardianappsResponse> AllGuardianGuardianappsExAsync(AllGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllGuardianGuardianappsResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianapps.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-查询appName列表
         * Summary: 查询appName列表
         */
        public AllGuardianGuardianappnamesResponse AllGuardianGuardianappnames(AllGuardianGuardianappnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllGuardianGuardianappnamesEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-查询appName列表
         * Summary: 查询appName列表
         */
        public async Task<AllGuardianGuardianappnamesResponse> AllGuardianGuardianappnamesAsync(AllGuardianGuardianappnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllGuardianGuardianappnamesExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-查询appName列表
         * Summary: 查询appName列表
         */
        public AllGuardianGuardianappnamesResponse AllGuardianGuardianappnamesEx(AllGuardianGuardianappnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllGuardianGuardianappnamesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianappnames.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-查询appName列表
         * Summary: 查询appName列表
         */
        public async Task<AllGuardianGuardianappnamesResponse> AllGuardianGuardianappnamesExAsync(AllGuardianGuardianappnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllGuardianGuardianappnamesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianappnames.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分页查询app
         * Summary: 分页查询app
         */
        public QueryGuardianGuardianappsResponse QueryGuardianGuardianapps(QueryGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardianGuardianappsEx(request, headers, runtime);
        }

        /**
         * Description: 微服务-分页查询app
         * Summary: 分页查询app
         */
        public async Task<QueryGuardianGuardianappsResponse> QueryGuardianGuardianappsAsync(QueryGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardianGuardianappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 微服务-分页查询app
         * Summary: 分页查询app
         */
        public QueryGuardianGuardianappsResponse QueryGuardianGuardianappsEx(QueryGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardianGuardianappsResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianapps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 微服务-分页查询app
         * Summary: 分页查询app
         */
        public async Task<QueryGuardianGuardianappsResponse> QueryGuardianGuardianappsExAsync(QueryGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardianGuardianappsResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianapps.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms -根据appName获取app
         * Summary: 根据appName获取app
         */
        public GetGuardianGuardianappsResponse GetGuardianGuardianapps(GetGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGuardianGuardianappsEx(request, headers, runtime);
        }

        /**
         * Description: ms -根据appName获取app
         * Summary: 根据appName获取app
         */
        public async Task<GetGuardianGuardianappsResponse> GetGuardianGuardianappsAsync(GetGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGuardianGuardianappsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms -根据appName获取app
         * Summary: 根据appName获取app
         */
        public GetGuardianGuardianappsResponse GetGuardianGuardianappsEx(GetGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGuardianGuardianappsResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianapps.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms -根据appName获取app
         * Summary: 根据appName获取app
         */
        public async Task<GetGuardianGuardianappsResponse> GetGuardianGuardianappsExAsync(GetGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGuardianGuardianappsResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianapps.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加 监控App
         * Summary: 添加 监控App
         */
        public AddGuardianGuardianappsResponse AddGuardianGuardianapps(AddGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddGuardianGuardianappsEx(request, headers, runtime);
        }

        /**
         * Description: ms-添加 监控App
         * Summary: 添加 监控App
         */
        public async Task<AddGuardianGuardianappsResponse> AddGuardianGuardianappsAsync(AddGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddGuardianGuardianappsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-添加 监控App
         * Summary: 添加 监控App
         */
        public AddGuardianGuardianappsResponse AddGuardianGuardianappsEx(AddGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGuardianGuardianappsResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianapps.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加 监控App
         * Summary: 添加 监控App
         */
        public async Task<AddGuardianGuardianappsResponse> AddGuardianGuardianappsExAsync(AddGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGuardianGuardianappsResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianapps.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ws-更新监控app
         * Summary: 更新监控app
         */
        public UpdateGuardianGuardianappsResponse UpdateGuardianGuardianapps(UpdateGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGuardianGuardianappsEx(request, headers, runtime);
        }

        /**
         * Description: ws-更新监控app
         * Summary: 更新监控app
         */
        public async Task<UpdateGuardianGuardianappsResponse> UpdateGuardianGuardianappsAsync(UpdateGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGuardianGuardianappsExAsync(request, headers, runtime);
        }

        /**
         * Description: ws-更新监控app
         * Summary: 更新监控app
         */
        public UpdateGuardianGuardianappsResponse UpdateGuardianGuardianappsEx(UpdateGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGuardianGuardianappsResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianapps.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ws-更新监控app
         * Summary: 更新监控app
         */
        public async Task<UpdateGuardianGuardianappsResponse> UpdateGuardianGuardianappsExAsync(UpdateGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGuardianGuardianappsResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianapps.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms- 删除监控 app
         * Summary: 删除监控 app
         */
        public DeleteGuardianGuardianappsResponse DeleteGuardianGuardianapps(DeleteGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteGuardianGuardianappsEx(request, headers, runtime);
        }

        /**
         * Description: ms- 删除监控 app
         * Summary: 删除监控 app
         */
        public async Task<DeleteGuardianGuardianappsResponse> DeleteGuardianGuardianappsAsync(DeleteGuardianGuardianappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteGuardianGuardianappsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms- 删除监控 app
         * Summary: 删除监控 app
         */
        public DeleteGuardianGuardianappsResponse DeleteGuardianGuardianappsEx(DeleteGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteGuardianGuardianappsResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianapps.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms- 删除监控 app
         * Summary: 删除监控 app
         */
        public async Task<DeleteGuardianGuardianappsResponse> DeleteGuardianGuardianappsExAsync(DeleteGuardianGuardianappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteGuardianGuardianappsResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianapps.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms - 规则配置分页
         * Summary: 规则配置分页
         */
        public QueryGuardianGuardianrulesResponse QueryGuardianGuardianrules(QueryGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardianGuardianrulesEx(request, headers, runtime);
        }

        /**
         * Description: ms - 规则配置分页
         * Summary: 规则配置分页
         */
        public async Task<QueryGuardianGuardianrulesResponse> QueryGuardianGuardianrulesAsync(QueryGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardianGuardianrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms - 规则配置分页
         * Summary: 规则配置分页
         */
        public QueryGuardianGuardianrulesResponse QueryGuardianGuardianrulesEx(QueryGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardianGuardianrulesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms - 规则配置分页
         * Summary: 规则配置分页
         */
        public async Task<QueryGuardianGuardianrulesResponse> QueryGuardianGuardianrulesExAsync(QueryGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardianGuardianrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-根据id获取规则
         * Summary: 根据id获取规则
         */
        public GetGuardianGuardianrulesResponse GetGuardianGuardianrules(GetGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetGuardianGuardianrulesEx(request, headers, runtime);
        }

        /**
         * Description: ms-根据id获取规则
         * Summary: 根据id获取规则
         */
        public async Task<GetGuardianGuardianrulesResponse> GetGuardianGuardianrulesAsync(GetGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetGuardianGuardianrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-根据id获取规则
         * Summary: 根据id获取规则
         */
        public GetGuardianGuardianrulesResponse GetGuardianGuardianrulesEx(GetGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGuardianGuardianrulesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrules.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-根据id获取规则
         * Summary: 根据id获取规则
         */
        public async Task<GetGuardianGuardianrulesResponse> GetGuardianGuardianrulesExAsync(GetGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetGuardianGuardianrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrules.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加规则
         * Summary: 添加规则
         */
        public AddGuardianGuardianrulesResponse AddGuardianGuardianrules(AddGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddGuardianGuardianrulesEx(request, headers, runtime);
        }

        /**
         * Description: ms-添加规则
         * Summary: 添加规则
         */
        public async Task<AddGuardianGuardianrulesResponse> AddGuardianGuardianrulesAsync(AddGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddGuardianGuardianrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-添加规则
         * Summary: 添加规则
         */
        public AddGuardianGuardianrulesResponse AddGuardianGuardianrulesEx(AddGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGuardianGuardianrulesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加规则
         * Summary: 添加规则
         */
        public async Task<AddGuardianGuardianrulesResponse> AddGuardianGuardianrulesExAsync(AddGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGuardianGuardianrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新规则
         * Summary: 更新规则
         */
        public UpdateGuardianGuardianrulesResponse UpdateGuardianGuardianrules(UpdateGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGuardianGuardianrulesEx(request, headers, runtime);
        }

        /**
         * Description: ms-更新规则
         * Summary: 更新规则
         */
        public async Task<UpdateGuardianGuardianrulesResponse> UpdateGuardianGuardianrulesAsync(UpdateGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGuardianGuardianrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-更新规则
         * Summary: 更新规则
         */
        public UpdateGuardianGuardianrulesResponse UpdateGuardianGuardianrulesEx(UpdateGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGuardianGuardianrulesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新规则
         * Summary: 更新规则
         */
        public async Task<UpdateGuardianGuardianrulesResponse> UpdateGuardianGuardianrulesExAsync(UpdateGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGuardianGuardianrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新规则状态
         * Summary: 更新规则状态
         */
        public UpdateGuardianGuardianrulestatusResponse UpdateGuardianGuardianrulestatus(UpdateGuardianGuardianrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGuardianGuardianrulestatusEx(request, headers, runtime);
        }

        /**
         * Description: ms-更新规则状态
         * Summary: 更新规则状态
         */
        public async Task<UpdateGuardianGuardianrulestatusResponse> UpdateGuardianGuardianrulestatusAsync(UpdateGuardianGuardianrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGuardianGuardianrulestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-更新规则状态
         * Summary: 更新规则状态
         */
        public UpdateGuardianGuardianrulestatusResponse UpdateGuardianGuardianrulestatusEx(UpdateGuardianGuardianrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGuardianGuardianrulestatusResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新规则状态
         * Summary: 更新规则状态
         */
        public async Task<UpdateGuardianGuardianrulestatusResponse> UpdateGuardianGuardianrulestatusExAsync(UpdateGuardianGuardianrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGuardianGuardianrulestatusResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-删除规则
         * Summary: 删除规则
         */
        public DeleteGuardianGuardianrulesResponse DeleteGuardianGuardianrules(DeleteGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteGuardianGuardianrulesEx(request, headers, runtime);
        }

        /**
         * Description: ms-删除规则
         * Summary: 删除规则
         */
        public async Task<DeleteGuardianGuardianrulesResponse> DeleteGuardianGuardianrulesAsync(DeleteGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteGuardianGuardianrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-删除规则
         * Summary: 删除规则
         */
        public DeleteGuardianGuardianrulesResponse DeleteGuardianGuardianrulesEx(DeleteGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteGuardianGuardianrulesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrules.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-删除规则
         * Summary: 删除规则
         */
        public async Task<DeleteGuardianGuardianrulesResponse> DeleteGuardianGuardianrulesExAsync(DeleteGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteGuardianGuardianrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrules.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-分页查询推送历史
         * Summary: 分页查询推送历史
         */
        public QueryGuardianGuardianrulepushhistorysResponse QueryGuardianGuardianrulepushhistorys(QueryGuardianGuardianrulepushhistorysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGuardianGuardianrulepushhistorysEx(request, headers, runtime);
        }

        /**
         * Description: ms-分页查询推送历史
         * Summary: 分页查询推送历史
         */
        public async Task<QueryGuardianGuardianrulepushhistorysResponse> QueryGuardianGuardianrulepushhistorysAsync(QueryGuardianGuardianrulepushhistorysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGuardianGuardianrulepushhistorysExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-分页查询推送历史
         * Summary: 分页查询推送历史
         */
        public QueryGuardianGuardianrulepushhistorysResponse QueryGuardianGuardianrulepushhistorysEx(QueryGuardianGuardianrulepushhistorysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardianGuardianrulepushhistorysResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrulepushhistorys.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-分页查询推送历史
         * Summary: 分页查询推送历史
         */
        public async Task<QueryGuardianGuardianrulepushhistorysResponse> QueryGuardianGuardianrulepushhistorysExAsync(QueryGuardianGuardianrulepushhistorysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGuardianGuardianrulepushhistorysResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrulepushhistorys.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-查询推送历史
         * Summary: 查询推送历史
         */
        public ListGuardianGuardianrulepushhistorysResponse ListGuardianGuardianrulepushhistorys(ListGuardianGuardianrulepushhistorysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListGuardianGuardianrulepushhistorysEx(request, headers, runtime);
        }

        /**
         * Description: ms-查询推送历史
         * Summary: 查询推送历史
         */
        public async Task<ListGuardianGuardianrulepushhistorysResponse> ListGuardianGuardianrulepushhistorysAsync(ListGuardianGuardianrulepushhistorysRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListGuardianGuardianrulepushhistorysExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-查询推送历史
         * Summary: 查询推送历史
         */
        public ListGuardianGuardianrulepushhistorysResponse ListGuardianGuardianrulepushhistorysEx(ListGuardianGuardianrulepushhistorysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListGuardianGuardianrulepushhistorysResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrulepushhistorys.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-查询推送历史
         * Summary: 查询推送历史
         */
        public async Task<ListGuardianGuardianrulepushhistorysResponse> ListGuardianGuardianrulepushhistorysExAsync(ListGuardianGuardianrulepushhistorysRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListGuardianGuardianrulepushhistorysResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrulepushhistorys.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-灰度推送
         * Summary: 灰度推送
         */
        public AddGuardianGuardiangrayrulesResponse AddGuardianGuardiangrayrules(AddGuardianGuardiangrayrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddGuardianGuardiangrayrulesEx(request, headers, runtime);
        }

        /**
         * Description: ms-灰度推送
         * Summary: 灰度推送
         */
        public async Task<AddGuardianGuardiangrayrulesResponse> AddGuardianGuardiangrayrulesAsync(AddGuardianGuardiangrayrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddGuardianGuardiangrayrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-灰度推送
         * Summary: 灰度推送
         */
        public AddGuardianGuardiangrayrulesResponse AddGuardianGuardiangrayrulesEx(AddGuardianGuardiangrayrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGuardianGuardiangrayrulesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardiangrayrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-灰度推送
         * Summary: 灰度推送
         */
        public async Task<AddGuardianGuardiangrayrulesResponse> AddGuardianGuardiangrayrulesExAsync(AddGuardianGuardiangrayrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddGuardianGuardiangrayrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardiangrayrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更改规则灰度状态
         * Summary: 更改规则灰度状态
         */
        public UpdateGuardianGuardiangrayrulestatusResponse UpdateGuardianGuardiangrayrulestatus(UpdateGuardianGuardiangrayrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGuardianGuardiangrayrulestatusEx(request, headers, runtime);
        }

        /**
         * Description: ms-更改规则灰度状态
         * Summary: 更改规则灰度状态
         */
        public async Task<UpdateGuardianGuardiangrayrulestatusResponse> UpdateGuardianGuardiangrayrulestatusAsync(UpdateGuardianGuardiangrayrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGuardianGuardiangrayrulestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-更改规则灰度状态
         * Summary: 更改规则灰度状态
         */
        public UpdateGuardianGuardiangrayrulestatusResponse UpdateGuardianGuardiangrayrulestatusEx(UpdateGuardianGuardiangrayrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGuardianGuardiangrayrulestatusResponse>(DoRequest("2.0", "sofa.ms.guardian.guardiangrayrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更改规则灰度状态
         * Summary: 更改规则灰度状态
         */
        public async Task<UpdateGuardianGuardiangrayrulestatusResponse> UpdateGuardianGuardiangrayrulestatusExAsync(UpdateGuardianGuardiangrayrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGuardianGuardiangrayrulestatusResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardiangrayrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-查询实例App name
         * Summary: 查询实例App name
         */
        public AllDrmDrmappsResponse AllDrmDrmapps(AllDrmDrmappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllDrmDrmappsEx(request, headers, runtime);
        }

        /**
         * Description: ms-查询实例App name
         * Summary: 查询实例App name
         */
        public async Task<AllDrmDrmappsResponse> AllDrmDrmappsAsync(AllDrmDrmappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllDrmDrmappsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-查询实例App name
         * Summary: 查询实例App name
         */
        public AllDrmDrmappsResponse AllDrmDrmappsEx(AllDrmDrmappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDrmDrmappsResponse>(DoRequest("2.0", "sofa.ms.drm.drmapps.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-查询实例App name
         * Summary: 查询实例App name
         */
        public async Task<AllDrmDrmappsResponse> AllDrmDrmappsExAsync(AllDrmDrmappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDrmDrmappsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmapps.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-分页查询Drm资源
         * Summary: 分页查询Drm资源
         */
        public QueryDrmDrmresourcesResponse QueryDrmDrmresources(QueryDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDrmDrmresourcesEx(request, headers, runtime);
        }

        /**
         * Description: ms-分页查询Drm资源
         * Summary: 分页查询Drm资源
         */
        public async Task<QueryDrmDrmresourcesResponse> QueryDrmDrmresourcesAsync(QueryDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDrmDrmresourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-分页查询Drm资源
         * Summary: 分页查询Drm资源
         */
        public QueryDrmDrmresourcesResponse QueryDrmDrmresourcesEx(QueryDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmresourcesResponse>(DoRequest("2.0", "sofa.ms.drm.drmresources.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-分页查询Drm资源
         * Summary: 分页查询Drm资源
         */
        public async Task<QueryDrmDrmresourcesResponse> QueryDrmDrmresourcesExAsync(QueryDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmresourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresources.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加drm资源
         * Summary: 添加drm资源
         */
        public AddDrmDrmresourcesResponse AddDrmDrmresources(AddDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDrmDrmresourcesEx(request, headers, runtime);
        }

        /**
         * Description: ms-添加drm资源
         * Summary: 添加drm资源
         */
        public async Task<AddDrmDrmresourcesResponse> AddDrmDrmresourcesAsync(AddDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDrmDrmresourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-添加drm资源
         * Summary: 添加drm资源
         */
        public AddDrmDrmresourcesResponse AddDrmDrmresourcesEx(AddDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmresourcesResponse>(DoRequest("2.0", "sofa.ms.drm.drmresources.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加drm资源
         * Summary: 添加drm资源
         */
        public async Task<AddDrmDrmresourcesResponse> AddDrmDrmresourcesExAsync(AddDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmresourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresources.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新drm资源
         * Summary: 更新drm资源
         */
        public UpdateDrmDrmresourcesResponse UpdateDrmDrmresources(UpdateDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDrmDrmresourcesEx(request, headers, runtime);
        }

        /**
         * Description: ms-更新drm资源
         * Summary: 更新drm资源
         */
        public async Task<UpdateDrmDrmresourcesResponse> UpdateDrmDrmresourcesAsync(UpdateDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDrmDrmresourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-更新drm资源
         * Summary: 更新drm资源
         */
        public UpdateDrmDrmresourcesResponse UpdateDrmDrmresourcesEx(UpdateDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDrmDrmresourcesResponse>(DoRequest("2.0", "sofa.ms.drm.drmresources.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新drm资源
         * Summary: 更新drm资源
         */
        public async Task<UpdateDrmDrmresourcesResponse> UpdateDrmDrmresourcesExAsync(UpdateDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDrmDrmresourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresources.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加drm属性
         * Summary: 添加drm属性
         */
        public AddDrmDrmattributesResponse AddDrmDrmattributes(AddDrmDrmattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDrmDrmattributesEx(request, headers, runtime);
        }

        /**
         * Description: ms-添加drm属性
         * Summary: 添加drm属性
         */
        public async Task<AddDrmDrmattributesResponse> AddDrmDrmattributesAsync(AddDrmDrmattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDrmDrmattributesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-添加drm属性
         * Summary: 添加drm属性
         */
        public AddDrmDrmattributesResponse AddDrmDrmattributesEx(AddDrmDrmattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmattributesResponse>(DoRequest("2.0", "sofa.ms.drm.drmattributes.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加drm属性
         * Summary: 添加drm属性
         */
        public async Task<AddDrmDrmattributesResponse> AddDrmDrmattributesExAsync(AddDrmDrmattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmattributesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmattributes.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新drm资源属性
         * Summary: 更新drm资源属性
         */
        public UpdateDrmDrmattributesResponse UpdateDrmDrmattributes(UpdateDrmDrmattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDrmDrmattributesEx(request, headers, runtime);
        }

        /**
         * Description: ms-更新drm资源属性
         * Summary: 更新drm资源属性
         */
        public async Task<UpdateDrmDrmattributesResponse> UpdateDrmDrmattributesAsync(UpdateDrmDrmattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDrmDrmattributesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-更新drm资源属性
         * Summary: 更新drm资源属性
         */
        public UpdateDrmDrmattributesResponse UpdateDrmDrmattributesEx(UpdateDrmDrmattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDrmDrmattributesResponse>(DoRequest("2.0", "sofa.ms.drm.drmattributes.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新drm资源属性
         * Summary: 更新drm资源属性
         */
        public async Task<UpdateDrmDrmattributesResponse> UpdateDrmDrmattributesExAsync(UpdateDrmDrmattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDrmDrmattributesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmattributes.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-Delete resource
         * Summary: Delete resource
         */
        public DeleteDrmDrmresourcesResponse DeleteDrmDrmresources(DeleteDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDrmDrmresourcesEx(request, headers, runtime);
        }

        /**
         * Description: ms-Delete resource
         * Summary: Delete resource
         */
        public async Task<DeleteDrmDrmresourcesResponse> DeleteDrmDrmresourcesAsync(DeleteDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDrmDrmresourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-Delete resource
         * Summary: Delete resource
         */
        public DeleteDrmDrmresourcesResponse DeleteDrmDrmresourcesEx(DeleteDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDrmDrmresourcesResponse>(DoRequest("2.0", "sofa.ms.drm.drmresources.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-Delete resource
         * Summary: Delete resource
         */
        public async Task<DeleteDrmDrmresourcesResponse> DeleteDrmDrmresourcesExAsync(DeleteDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDrmDrmresourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresources.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-删除drm资源属性
         * Summary: 删除drm资源属性
         */
        public DeleteDrmDrmattributesResponse DeleteDrmDrmattributes(DeleteDrmDrmattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDrmDrmattributesEx(request, headers, runtime);
        }

        /**
         * Description: ms-删除drm资源属性
         * Summary: 删除drm资源属性
         */
        public async Task<DeleteDrmDrmattributesResponse> DeleteDrmDrmattributesAsync(DeleteDrmDrmattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDrmDrmattributesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-删除drm资源属性
         * Summary: 删除drm资源属性
         */
        public DeleteDrmDrmattributesResponse DeleteDrmDrmattributesEx(DeleteDrmDrmattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDrmDrmattributesResponse>(DoRequest("2.0", "sofa.ms.drm.drmattributes.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-删除drm资源属性
         * Summary: 删除drm资源属性
         */
        public async Task<DeleteDrmDrmattributesResponse> DeleteDrmDrmattributesExAsync(DeleteDrmDrmattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDrmDrmattributesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmattributes.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-获取drm资源属性
         * Summary: 获取drm资源属性
         */
        public GetDrmDrmattributesResponse GetDrmDrmattributes(GetDrmDrmattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDrmDrmattributesEx(request, headers, runtime);
        }

        /**
         * Description: ms-获取drm资源属性
         * Summary: 获取drm资源属性
         */
        public async Task<GetDrmDrmattributesResponse> GetDrmDrmattributesAsync(GetDrmDrmattributesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDrmDrmattributesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-获取drm资源属性
         * Summary: 获取drm资源属性
         */
        public GetDrmDrmattributesResponse GetDrmDrmattributesEx(GetDrmDrmattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDrmDrmattributesResponse>(DoRequest("2.0", "sofa.ms.drm.drmattributes.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-获取drm资源属性
         * Summary: 获取drm资源属性
         */
        public async Task<GetDrmDrmattributesResponse> GetDrmDrmattributesExAsync(GetDrmDrmattributesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDrmDrmattributesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmattributes.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-搜索客户端信息
         * Summary: 搜索客户端信息
         */
        public QueryDrmDrmclientsResponse QueryDrmDrmclients(QueryDrmDrmclientsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDrmDrmclientsEx(request, headers, runtime);
        }

        /**
         * Description: ms-搜索客户端信息
         * Summary: 搜索客户端信息
         */
        public async Task<QueryDrmDrmclientsResponse> QueryDrmDrmclientsAsync(QueryDrmDrmclientsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDrmDrmclientsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-搜索客户端信息
         * Summary: 搜索客户端信息
         */
        public QueryDrmDrmclientsResponse QueryDrmDrmclientsEx(QueryDrmDrmclientsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmclientsResponse>(DoRequest("2.0", "sofa.ms.drm.drmclients.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-搜索客户端信息
         * Summary: 搜索客户端信息
         */
        public async Task<QueryDrmDrmclientsResponse> QueryDrmDrmclientsExAsync(QueryDrmDrmclientsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmclientsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmclients.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-搜索客户端信息
         * Summary: 搜索客户端信息
         */
        public QueryDrmDrmhostsResponse QueryDrmDrmhosts(QueryDrmDrmhostsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDrmDrmhostsEx(request, headers, runtime);
        }

        /**
         * Description: ms-搜索客户端信息
         * Summary: 搜索客户端信息
         */
        public async Task<QueryDrmDrmhostsResponse> QueryDrmDrmhostsAsync(QueryDrmDrmhostsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDrmDrmhostsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-搜索客户端信息
         * Summary: 搜索客户端信息
         */
        public QueryDrmDrmhostsResponse QueryDrmDrmhostsEx(QueryDrmDrmhostsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmhostsResponse>(DoRequest("2.0", "sofa.ms.drm.drmhosts.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-搜索客户端信息
         * Summary: 搜索客户端信息
         */
        public async Task<QueryDrmDrmhostsResponse> QueryDrmDrmhostsExAsync(QueryDrmDrmhostsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmhostsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmhosts.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-分页搜索推送日志
         * Summary: 分页搜索推送日志
         */
        public ListDrmDrmpushlogsResponse ListDrmDrmpushlogs(ListDrmDrmpushlogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDrmDrmpushlogsEx(request, headers, runtime);
        }

        /**
         * Description: ms-分页搜索推送日志
         * Summary: 分页搜索推送日志
         */
        public async Task<ListDrmDrmpushlogsResponse> ListDrmDrmpushlogsAsync(ListDrmDrmpushlogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDrmDrmpushlogsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-分页搜索推送日志
         * Summary: 分页搜索推送日志
         */
        public ListDrmDrmpushlogsResponse ListDrmDrmpushlogsEx(ListDrmDrmpushlogsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDrmDrmpushlogsResponse>(DoRequest("2.0", "sofa.ms.drm.drmpushlogs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-分页搜索推送日志
         * Summary: 分页搜索推送日志
         */
        public async Task<ListDrmDrmpushlogsResponse> ListDrmDrmpushlogsExAsync(ListDrmDrmpushlogsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDrmDrmpushlogsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmpushlogs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-按条件分页查询推送日志
         * Summary: 按条件分页查询推送日志
         */
        public QueryDrmDrmpushlogsResponse QueryDrmDrmpushlogs(QueryDrmDrmpushlogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDrmDrmpushlogsEx(request, headers, runtime);
        }

        /**
         * Description: ms-按条件分页查询推送日志
         * Summary: 按条件分页查询推送日志
         */
        public async Task<QueryDrmDrmpushlogsResponse> QueryDrmDrmpushlogsAsync(QueryDrmDrmpushlogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDrmDrmpushlogsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-按条件分页查询推送日志
         * Summary: 按条件分页查询推送日志
         */
        public QueryDrmDrmpushlogsResponse QueryDrmDrmpushlogsEx(QueryDrmDrmpushlogsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmpushlogsResponse>(DoRequest("2.0", "sofa.ms.drm.drmpushlogs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-按条件分页查询推送日志
         * Summary: 按条件分页查询推送日志
         */
        public async Task<QueryDrmDrmpushlogsResponse> QueryDrmDrmpushlogsExAsync(QueryDrmDrmpushlogsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmpushlogsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmpushlogs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-推送drm配置
         * Summary: 推送drm配置
         */
        public AddDrmDrmdataResponse AddDrmDrmdata(AddDrmDrmdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDrmDrmdataEx(request, headers, runtime);
        }

        /**
         * Description: ms-推送drm配置
         * Summary: 推送drm配置
         */
        public async Task<AddDrmDrmdataResponse> AddDrmDrmdataAsync(AddDrmDrmdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDrmDrmdataExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-推送drm配置
         * Summary: 推送drm配置
         */
        public AddDrmDrmdataResponse AddDrmDrmdataEx(AddDrmDrmdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmdataResponse>(DoRequest("2.0", "sofa.ms.drm.drmdata.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-推送drm配置
         * Summary: 推送drm配置
         */
        public async Task<AddDrmDrmdataResponse> AddDrmDrmdataExAsync(AddDrmDrmdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmdataResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmdata.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-灰度推送数据
         * Summary: 灰度推送数据
         */
        public AddDrmDrmgraydataResponse AddDrmDrmgraydata(AddDrmDrmgraydataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDrmDrmgraydataEx(request, headers, runtime);
        }

        /**
         * Description: ms-灰度推送数据
         * Summary: 灰度推送数据
         */
        public async Task<AddDrmDrmgraydataResponse> AddDrmDrmgraydataAsync(AddDrmDrmgraydataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDrmDrmgraydataExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-灰度推送数据
         * Summary: 灰度推送数据
         */
        public AddDrmDrmgraydataResponse AddDrmDrmgraydataEx(AddDrmDrmgraydataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmgraydataResponse>(DoRequest("2.0", "sofa.ms.drm.drmgraydata.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-灰度推送数据
         * Summary: 灰度推送数据
         */
        public async Task<AddDrmDrmgraydataResponse> AddDrmDrmgraydataExAsync(AddDrmDrmgraydataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmgraydataResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmgraydata.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-获取实例的单元格
         * Summary: 获取实例的单元格
         */
        public AllDrmDrmcellsResponse AllDrmDrmcells(AllDrmDrmcellsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllDrmDrmcellsEx(request, headers, runtime);
        }

        /**
         * Description: ms-获取实例的单元格
         * Summary: 获取实例的单元格
         */
        public async Task<AllDrmDrmcellsResponse> AllDrmDrmcellsAsync(AllDrmDrmcellsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllDrmDrmcellsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-获取实例的单元格
         * Summary: 获取实例的单元格
         */
        public AllDrmDrmcellsResponse AllDrmDrmcellsEx(AllDrmDrmcellsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDrmDrmcellsResponse>(DoRequest("2.0", "sofa.ms.drm.drmcells.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-获取实例的单元格
         * Summary: 获取实例的单元格
         */
        public async Task<AllDrmDrmcellsResponse> AllDrmDrmcellsExAsync(AllDrmDrmcellsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDrmDrmcellsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmcells.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-获取Drm数据单元信息
         * Summary: 获取Drm数据单元信息
         */
        public ListDrmDrmdatacellsResponse ListDrmDrmdatacells(ListDrmDrmdatacellsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDrmDrmdatacellsEx(request, headers, runtime);
        }

        /**
         * Description: ms-获取Drm数据单元信息
         * Summary: 获取Drm数据单元信息
         */
        public async Task<ListDrmDrmdatacellsResponse> ListDrmDrmdatacellsAsync(ListDrmDrmdatacellsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDrmDrmdatacellsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-获取Drm数据单元信息
         * Summary: 获取Drm数据单元信息
         */
        public ListDrmDrmdatacellsResponse ListDrmDrmdatacellsEx(ListDrmDrmdatacellsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDrmDrmdatacellsResponse>(DoRequest("2.0", "sofa.ms.drm.drmdatacells.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-获取Drm数据单元信息
         * Summary: 获取Drm数据单元信息
         */
        public async Task<ListDrmDrmdatacellsResponse> ListDrmDrmdatacellsExAsync(ListDrmDrmdatacellsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDrmDrmdatacellsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmdatacells.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加Tpl类型drm资源
         * Summary: 添加Tpl类型drm资源
         */
        public AddDrmDrmresourcetplsResponse AddDrmDrmresourcetpls(AddDrmDrmresourcetplsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDrmDrmresourcetplsEx(request, headers, runtime);
        }

        /**
         * Description: ms-添加Tpl类型drm资源
         * Summary: 添加Tpl类型drm资源
         */
        public async Task<AddDrmDrmresourcetplsResponse> AddDrmDrmresourcetplsAsync(AddDrmDrmresourcetplsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDrmDrmresourcetplsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-添加Tpl类型drm资源
         * Summary: 添加Tpl类型drm资源
         */
        public AddDrmDrmresourcetplsResponse AddDrmDrmresourcetplsEx(AddDrmDrmresourcetplsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmresourcetplsResponse>(DoRequest("2.0", "sofa.ms.drm.drmresourcetpls.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-添加Tpl类型drm资源
         * Summary: 添加Tpl类型drm资源
         */
        public async Task<AddDrmDrmresourcetplsResponse> AddDrmDrmresourcetplsExAsync(AddDrmDrmresourcetplsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmresourcetplsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresourcetpls.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新Tpl类型drm资源
         * Summary: 更新Tpl类型drm资源
         */
        public UpdateDrmDrmresourcetplsResponse UpdateDrmDrmresourcetpls(UpdateDrmDrmresourcetplsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateDrmDrmresourcetplsEx(request, headers, runtime);
        }

        /**
         * Description: ms-更新Tpl类型drm资源
         * Summary: 更新Tpl类型drm资源
         */
        public async Task<UpdateDrmDrmresourcetplsResponse> UpdateDrmDrmresourcetplsAsync(UpdateDrmDrmresourcetplsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateDrmDrmresourcetplsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-更新Tpl类型drm资源
         * Summary: 更新Tpl类型drm资源
         */
        public UpdateDrmDrmresourcetplsResponse UpdateDrmDrmresourcetplsEx(UpdateDrmDrmresourcetplsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDrmDrmresourcetplsResponse>(DoRequest("2.0", "sofa.ms.drm.drmresourcetpls.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-更新Tpl类型drm资源
         * Summary: 更新Tpl类型drm资源
         */
        public async Task<UpdateDrmDrmresourcetplsResponse> UpdateDrmDrmresourcetplsExAsync(UpdateDrmDrmresourcetplsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateDrmDrmresourcetplsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresourcetpls.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-删除Tpl类型drm资源
         * Summary: 删除Tpl类型drm资源
         */
        public DeleteDrmDrmresourcetplsResponse DeleteDrmDrmresourcetpls(DeleteDrmDrmresourcetplsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteDrmDrmresourcetplsEx(request, headers, runtime);
        }

        /**
         * Description: ms-删除Tpl类型drm资源
         * Summary: 删除Tpl类型drm资源
         */
        public async Task<DeleteDrmDrmresourcetplsResponse> DeleteDrmDrmresourcetplsAsync(DeleteDrmDrmresourcetplsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteDrmDrmresourcetplsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-删除Tpl类型drm资源
         * Summary: 删除Tpl类型drm资源
         */
        public DeleteDrmDrmresourcetplsResponse DeleteDrmDrmresourcetplsEx(DeleteDrmDrmresourcetplsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDrmDrmresourcetplsResponse>(DoRequest("2.0", "sofa.ms.drm.drmresourcetpls.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-删除Tpl类型drm资源
         * Summary: 删除Tpl类型drm资源
         */
        public async Task<DeleteDrmDrmresourcetplsResponse> DeleteDrmDrmresourcetplsExAsync(DeleteDrmDrmresourcetplsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteDrmDrmresourcetplsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresourcetpls.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms -分页查询Tpl类型drm资源
         * Summary: 分页查询Tpl类型drm资源
         */
        public QueryDrmDrmresourcetplsResponse QueryDrmDrmresourcetpls(QueryDrmDrmresourcetplsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDrmDrmresourcetplsEx(request, headers, runtime);
        }

        /**
         * Description: ms -分页查询Tpl类型drm资源
         * Summary: 分页查询Tpl类型drm资源
         */
        public async Task<QueryDrmDrmresourcetplsResponse> QueryDrmDrmresourcetplsAsync(QueryDrmDrmresourcetplsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDrmDrmresourcetplsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms -分页查询Tpl类型drm资源
         * Summary: 分页查询Tpl类型drm资源
         */
        public QueryDrmDrmresourcetplsResponse QueryDrmDrmresourcetplsEx(QueryDrmDrmresourcetplsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmresourcetplsResponse>(DoRequest("2.0", "sofa.ms.drm.drmresourcetpls.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms -分页查询Tpl类型drm资源
         * Summary: 分页查询Tpl类型drm资源
         */
        public async Task<QueryDrmDrmresourcetplsResponse> QueryDrmDrmresourcetplsExAsync(QueryDrmDrmresourcetplsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDrmDrmresourcetplsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresourcetpls.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms -创建资源Tpl实例
         * Summary: 创建资源Tpl实例
         */
        public AddDrmDrmresourcetplinstancesResponse AddDrmDrmresourcetplinstances(AddDrmDrmresourcetplinstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddDrmDrmresourcetplinstancesEx(request, headers, runtime);
        }

        /**
         * Description: ms -创建资源Tpl实例
         * Summary: 创建资源Tpl实例
         */
        public async Task<AddDrmDrmresourcetplinstancesResponse> AddDrmDrmresourcetplinstancesAsync(AddDrmDrmresourcetplinstancesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddDrmDrmresourcetplinstancesExAsync(request, headers, runtime);
        }

        /**
         * Description: ms -创建资源Tpl实例
         * Summary: 创建资源Tpl实例
         */
        public AddDrmDrmresourcetplinstancesResponse AddDrmDrmresourcetplinstancesEx(AddDrmDrmresourcetplinstancesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmresourcetplinstancesResponse>(DoRequest("2.0", "sofa.ms.drm.drmresourcetplinstances.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms -创建资源Tpl实例
         * Summary: 创建资源Tpl实例
         */
        public async Task<AddDrmDrmresourcetplinstancesResponse> AddDrmDrmresourcetplinstancesExAsync(AddDrmDrmresourcetplinstancesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddDrmDrmresourcetplinstancesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresourcetplinstances.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一键创建注册中心同步任务
         * Summary: 一键创建注册中心同步任务
         */
        public AddRcSyncbucketResponse AddRcSyncbucket(AddRcSyncbucketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddRcSyncbucketEx(request, headers, runtime);
        }

        /**
         * Description: 一键创建注册中心同步任务
         * Summary: 一键创建注册中心同步任务
         */
        public async Task<AddRcSyncbucketResponse> AddRcSyncbucketAsync(AddRcSyncbucketRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddRcSyncbucketExAsync(request, headers, runtime);
        }

        /**
         * Description: 一键创建注册中心同步任务
         * Summary: 一键创建注册中心同步任务
         */
        public AddRcSyncbucketResponse AddRcSyncbucketEx(AddRcSyncbucketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddRcSyncbucketResponse>(DoRequest("2.0", "sofa.ms.rc.syncbucket.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 一键创建注册中心同步任务
         * Summary: 一键创建注册中心同步任务
         */
        public async Task<AddRcSyncbucketResponse> AddRcSyncbucketExAsync(AddRcSyncbucketRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddRcSyncbucketResponse>(await DoRequestAsync("2.0", "sofa.ms.rc.syncbucket.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册中心同步集群信息
         * Summary: 查询注册中心同步集群信息
         */
        public QueryRcSyncclusterResponse QueryRcSynccluster(QueryRcSyncclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRcSyncclusterEx(request, headers, runtime);
        }

        /**
         * Description: 查询注册中心同步集群信息
         * Summary: 查询注册中心同步集群信息
         */
        public async Task<QueryRcSyncclusterResponse> QueryRcSyncclusterAsync(QueryRcSyncclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRcSyncclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询注册中心同步集群信息
         * Summary: 查询注册中心同步集群信息
         */
        public QueryRcSyncclusterResponse QueryRcSyncclusterEx(QueryRcSyncclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRcSyncclusterResponse>(DoRequest("2.0", "sofa.ms.rc.synccluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询注册中心同步集群信息
         * Summary: 查询注册中心同步集群信息
         */
        public async Task<QueryRcSyncclusterResponse> QueryRcSyncclusterExAsync(QueryRcSyncclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRcSyncclusterResponse>(await DoRequestAsync("2.0", "sofa.ms.rc.synccluster.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群同步任务信息
         * Summary: 查询集群同步任务信息
         */
        public QueryRcSynctaskResponse QueryRcSynctask(QueryRcSynctaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRcSynctaskEx(request, headers, runtime);
        }

        /**
         * Description: 查询集群同步任务信息
         * Summary: 查询集群同步任务信息
         */
        public async Task<QueryRcSynctaskResponse> QueryRcSynctaskAsync(QueryRcSynctaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRcSynctaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询集群同步任务信息
         * Summary: 查询集群同步任务信息
         */
        public QueryRcSynctaskResponse QueryRcSynctaskEx(QueryRcSynctaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRcSynctaskResponse>(DoRequest("2.0", "sofa.ms.rc.synctask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群同步任务信息
         * Summary: 查询集群同步任务信息
         */
        public async Task<QueryRcSynctaskResponse> QueryRcSynctaskExAsync(QueryRcSynctaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRcSynctaskResponse>(await DoRequestAsync("2.0", "sofa.ms.rc.synctask.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某个服务具体同步的数据
         * Summary: 查询某个服务具体同步的数据
         */
        public QueryRcSyncdataResponse QueryRcSyncdata(QueryRcSyncdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRcSyncdataEx(request, headers, runtime);
        }

        /**
         * Description: 查询某个服务具体同步的数据
         * Summary: 查询某个服务具体同步的数据
         */
        public async Task<QueryRcSyncdataResponse> QueryRcSyncdataAsync(QueryRcSyncdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRcSyncdataExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询某个服务具体同步的数据
         * Summary: 查询某个服务具体同步的数据
         */
        public QueryRcSyncdataResponse QueryRcSyncdataEx(QueryRcSyncdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRcSyncdataResponse>(DoRequest("2.0", "sofa.ms.rc.syncdata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某个服务具体同步的数据
         * Summary: 查询某个服务具体同步的数据
         */
        public async Task<QueryRcSyncdataResponse> QueryRcSyncdataExAsync(QueryRcSyncdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRcSyncdataResponse>(await DoRequestAsync("2.0", "sofa.ms.rc.syncdata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启任务
         * Summary: 开启任务
         */
        public StartRcSynctaskResponse StartRcSynctask(StartRcSynctaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartRcSynctaskEx(request, headers, runtime);
        }

        /**
         * Description: 开启任务
         * Summary: 开启任务
         */
        public async Task<StartRcSynctaskResponse> StartRcSynctaskAsync(StartRcSynctaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartRcSynctaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 开启任务
         * Summary: 开启任务
         */
        public StartRcSynctaskResponse StartRcSynctaskEx(StartRcSynctaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcSynctaskResponse>(DoRequest("2.0", "sofa.ms.rc.synctask.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启任务
         * Summary: 开启任务
         */
        public async Task<StartRcSynctaskResponse> StartRcSynctaskExAsync(StartRcSynctaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRcSynctaskResponse>(await DoRequestAsync("2.0", "sofa.ms.rc.synctask.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止任务
         * Summary: 停止任务
         */
        public StopRcSynctaskResponse StopRcSynctask(StopRcSynctaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopRcSynctaskEx(request, headers, runtime);
        }

        /**
         * Description: 停止任务
         * Summary: 停止任务
         */
        public async Task<StopRcSynctaskResponse> StopRcSynctaskAsync(StopRcSynctaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopRcSynctaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 停止任务
         * Summary: 停止任务
         */
        public StopRcSynctaskResponse StopRcSynctaskEx(StopRcSynctaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopRcSynctaskResponse>(DoRequest("2.0", "sofa.ms.rc.synctask.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 停止任务
         * Summary: 停止任务
         */
        public async Task<StopRcSynctaskResponse> StopRcSynctaskExAsync(StopRcSynctaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopRcSynctaskResponse>(await DoRequestAsync("2.0", "sofa.ms.rc.synctask.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当前workspace下所有资源元信息
         * Summary: 导出资源
         */
        public ExportDrmDrmresourcesResponse ExportDrmDrmresources(ExportDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportDrmDrmresourcesEx(request, headers, runtime);
        }

        /**
         * Description: 当前workspace下所有资源元信息
         * Summary: 导出资源
         */
        public async Task<ExportDrmDrmresourcesResponse> ExportDrmDrmresourcesAsync(ExportDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportDrmDrmresourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 当前workspace下所有资源元信息
         * Summary: 导出资源
         */
        public ExportDrmDrmresourcesResponse ExportDrmDrmresourcesEx(ExportDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportDrmDrmresourcesResponse>(DoRequest("2.0", "sofa.ms.drm.drmresources.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 当前workspace下所有资源元信息
         * Summary: 导出资源
         */
        public async Task<ExportDrmDrmresourcesResponse> ExportDrmDrmresourcesExAsync(ExportDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportDrmDrmresourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresources.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入drm资源元信息
         * Summary: 导入drm资源元信息
         */
        public ImportDrmDrmresourcesResponse ImportDrmDrmresources(ImportDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportDrmDrmresourcesEx(request, headers, runtime);
        }

        /**
         * Description: 导入drm资源元信息
         * Summary: 导入drm资源元信息
         */
        public async Task<ImportDrmDrmresourcesResponse> ImportDrmDrmresourcesAsync(ImportDrmDrmresourcesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportDrmDrmresourcesExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入drm资源元信息
         * Summary: 导入drm资源元信息
         */
        public ImportDrmDrmresourcesResponse ImportDrmDrmresourcesEx(ImportDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDrmDrmresourcesResponse>(DoRequest("2.0", "sofa.ms.drm.drmresources.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入drm资源元信息
         * Summary: 导入drm资源元信息
         */
        public async Task<ImportDrmDrmresourcesResponse> ImportDrmDrmresourcesExAsync(ImportDrmDrmresourcesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportDrmDrmresourcesResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmresources.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入guardian规则
         * Summary: 导入guardian规则
         */
        public ImportGuardianGuardianrulesResponse ImportGuardianGuardianrules(ImportGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportGuardianGuardianrulesEx(request, headers, runtime);
        }

        /**
         * Description: 导入guardian规则
         * Summary: 导入guardian规则
         */
        public async Task<ImportGuardianGuardianrulesResponse> ImportGuardianGuardianrulesAsync(ImportGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportGuardianGuardianrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入guardian规则
         * Summary: 导入guardian规则
         */
        public ImportGuardianGuardianrulesResponse ImportGuardianGuardianrulesEx(ImportGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportGuardianGuardianrulesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrules.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入guardian规则
         * Summary: 导入guardian规则
         */
        public async Task<ImportGuardianGuardianrulesResponse> ImportGuardianGuardianrulesExAsync(ImportGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportGuardianGuardianrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrules.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出guardian路由规则
         * Summary: 导出guardian路由规则
         */
        public ExportGuardianGuardianrulesResponse ExportGuardianGuardianrules(ExportGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportGuardianGuardianrulesEx(request, headers, runtime);
        }

        /**
         * Description: 导出guardian路由规则
         * Summary: 导出guardian路由规则
         */
        public async Task<ExportGuardianGuardianrulesResponse> ExportGuardianGuardianrulesAsync(ExportGuardianGuardianrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportGuardianGuardianrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 导出guardian路由规则
         * Summary: 导出guardian路由规则
         */
        public ExportGuardianGuardianrulesResponse ExportGuardianGuardianrulesEx(ExportGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportGuardianGuardianrulesResponse>(DoRequest("2.0", "sofa.ms.guardian.guardianrules.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出guardian路由规则
         * Summary: 导出guardian路由规则
         */
        public async Task<ExportGuardianGuardianrulesResponse> ExportGuardianGuardianrulesExAsync(ExportGuardianGuardianrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportGuardianGuardianrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.guardian.guardianrules.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取上传地址
         * Summary: 获取上传地址
         */
        public GetDrmUploadurlResponse GetDrmUploadurl(GetDrmUploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDrmUploadurlEx(request, headers, runtime);
        }

        /**
         * Description: 获取上传地址
         * Summary: 获取上传地址
         */
        public async Task<GetDrmUploadurlResponse> GetDrmUploadurlAsync(GetDrmUploadurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDrmUploadurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取上传地址
         * Summary: 获取上传地址
         */
        public GetDrmUploadurlResponse GetDrmUploadurlEx(GetDrmUploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDrmUploadurlResponse>(DoRequest("2.0", "sofa.ms.drm.uploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取上传地址
         * Summary: 获取上传地址
         */
        public async Task<GetDrmUploadurlResponse> GetDrmUploadurlExAsync(GetDrmUploadurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDrmUploadurlResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.uploadurl.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门计费回调
         * Summary: 南天门计费回调
         */
        public CallbackSpiOmsResponse CallbackSpiOms(CallbackSpiOmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackSpiOmsEx(request, headers, runtime);
        }

        /**
         * Description: 南天门计费回调
         * Summary: 南天门计费回调
         */
        public async Task<CallbackSpiOmsResponse> CallbackSpiOmsAsync(CallbackSpiOmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackSpiOmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 南天门计费回调
         * Summary: 南天门计费回调
         */
        public CallbackSpiOmsResponse CallbackSpiOmsEx(CallbackSpiOmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiOmsResponse>(DoRequest("2.0", "sofa.ms.spi.oms.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 南天门计费回调
         * Summary: 南天门计费回调
         */
        public async Task<CallbackSpiOmsResponse> CallbackSpiOmsExAsync(CallbackSpiOmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackSpiOmsResponse>(await DoRequestAsync("2.0", "sofa.ms.spi.oms.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-查询实例下所有cells
         * Summary: 查询实例下所有cells
         */
        public AllDrmDrmldccellsResponse AllDrmDrmldccells(AllDrmDrmldccellsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllDrmDrmldccellsEx(request, headers, runtime);
        }

        /**
         * Description: ms-查询实例下所有cells
         * Summary: 查询实例下所有cells
         */
        public async Task<AllDrmDrmldccellsResponse> AllDrmDrmldccellsAsync(AllDrmDrmldccellsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllDrmDrmldccellsExAsync(request, headers, runtime);
        }

        /**
         * Description: ms-查询实例下所有cells
         * Summary: 查询实例下所有cells
         */
        public AllDrmDrmldccellsResponse AllDrmDrmldccellsEx(AllDrmDrmldccellsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDrmDrmldccellsResponse>(DoRequest("2.0", "sofa.ms.drm.drmldccells.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: ms-查询实例下所有cells
         * Summary: 查询实例下所有cells
         */
        public async Task<AllDrmDrmldccellsResponse> AllDrmDrmldccellsExAsync(AllDrmDrmldccellsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllDrmDrmldccellsResponse>(await DoRequestAsync("2.0", "sofa.ms.drm.drmldccells.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给 paas 平台，发布时先调用下线接口，再发布
         * Summary: 服务下线接口
         */
        public OfflineSgServicepublishersResponse OfflineSgServicepublishers(OfflineSgServicepublishersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OfflineSgServicepublishersEx(request, headers, runtime);
        }

        /**
         * Description: 提供给 paas 平台，发布时先调用下线接口，再发布
         * Summary: 服务下线接口
         */
        public async Task<OfflineSgServicepublishersResponse> OfflineSgServicepublishersAsync(OfflineSgServicepublishersRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OfflineSgServicepublishersExAsync(request, headers, runtime);
        }

        /**
         * Description: 提供给 paas 平台，发布时先调用下线接口，再发布
         * Summary: 服务下线接口
         */
        public OfflineSgServicepublishersResponse OfflineSgServicepublishersEx(OfflineSgServicepublishersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineSgServicepublishersResponse>(DoRequest("2.0", "sofa.ms.sg.servicepublishers.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提供给 paas 平台，发布时先调用下线接口，再发布
         * Summary: 服务下线接口
         */
        public async Task<OfflineSgServicepublishersResponse> OfflineSgServicepublishersExAsync(OfflineSgServicepublishersRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OfflineSgServicepublishersResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.servicepublishers.offline", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除任务
         * Summary: 删除任务
         */
        public DeleteRcSynctaskResponse DeleteRcSynctask(DeleteRcSynctaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteRcSynctaskEx(request, headers, runtime);
        }

        /**
         * Description: 删除任务
         * Summary: 删除任务
         */
        public async Task<DeleteRcSynctaskResponse> DeleteRcSynctaskAsync(DeleteRcSynctaskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteRcSynctaskExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除任务
         * Summary: 删除任务
         */
        public DeleteRcSynctaskResponse DeleteRcSynctaskEx(DeleteRcSynctaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRcSynctaskResponse>(DoRequest("2.0", "sofa.ms.rc.synctask.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除任务
         * Summary: 删除任务
         */
        public async Task<DeleteRcSynctaskResponse> DeleteRcSynctaskExAsync(DeleteRcSynctaskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteRcSynctaskResponse>(await DoRequestAsync("2.0", "sofa.ms.rc.synctask.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询降级规则组列表
         * Summary: 查询降级规则组列表
         */
        public QuerySgDowngradegroupsResponse QuerySgDowngradegroups(QuerySgDowngradegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgDowngradegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 查询降级规则组列表
         * Summary: 查询降级规则组列表
         */
        public async Task<QuerySgDowngradegroupsResponse> QuerySgDowngradegroupsAsync(QuerySgDowngradegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgDowngradegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询降级规则组列表
         * Summary: 查询降级规则组列表
         */
        public QuerySgDowngradegroupsResponse QuerySgDowngradegroupsEx(QuerySgDowngradegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgDowngradegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.downgradegroups.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询降级规则组列表
         * Summary: 查询降级规则组列表
         */
        public async Task<QuerySgDowngradegroupsResponse> QuerySgDowngradegroupsExAsync(QuerySgDowngradegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgDowngradegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.downgradegroups.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除降级规则
         * Summary: 删除降级规则
         */
        public DeleteSgDowngradesResponse DeleteSgDowngrades(DeleteSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgDowngradesEx(request, headers, runtime);
        }

        /**
         * Description: 删除降级规则
         * Summary: 删除降级规则
         */
        public async Task<DeleteSgDowngradesResponse> DeleteSgDowngradesAsync(DeleteSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgDowngradesExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除降级规则
         * Summary: 删除降级规则
         */
        public DeleteSgDowngradesResponse DeleteSgDowngradesEx(DeleteSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgDowngradesResponse>(DoRequest("2.0", "sofa.ms.sg.downgrades.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除降级规则
         * Summary: 删除降级规则
         */
        public async Task<DeleteSgDowngradesResponse> DeleteSgDowngradesExAsync(DeleteSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgDowngradesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.downgrades.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增降级规则
         * Summary: 新增降级规则
         */
        public AddSgDowngradesResponse AddSgDowngrades(AddSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgDowngradesEx(request, headers, runtime);
        }

        /**
         * Description: 新增降级规则
         * Summary: 新增降级规则
         */
        public async Task<AddSgDowngradesResponse> AddSgDowngradesAsync(AddSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgDowngradesExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增降级规则
         * Summary: 新增降级规则
         */
        public AddSgDowngradesResponse AddSgDowngradesEx(AddSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgDowngradesResponse>(DoRequest("2.0", "sofa.ms.sg.downgrades.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增降级规则
         * Summary: 新增降级规则
         */
        public async Task<AddSgDowngradesResponse> AddSgDowngradesExAsync(AddSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgDowngradesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.downgrades.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新降级规则
         * Summary: 更新降级规则
         */
        public UpdateSgDowngradesResponse UpdateSgDowngrades(UpdateSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgDowngradesEx(request, headers, runtime);
        }

        /**
         * Description: 更新降级规则
         * Summary: 更新降级规则
         */
        public async Task<UpdateSgDowngradesResponse> UpdateSgDowngradesAsync(UpdateSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgDowngradesExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新降级规则
         * Summary: 更新降级规则
         */
        public UpdateSgDowngradesResponse UpdateSgDowngradesEx(UpdateSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgDowngradesResponse>(DoRequest("2.0", "sofa.ms.sg.downgrades.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新降级规则
         * Summary: 更新降级规则
         */
        public async Task<UpdateSgDowngradesResponse> UpdateSgDowngradesExAsync(UpdateSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgDowngradesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.downgrades.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全局开启降级规则
         * Summary: 全局开启降级规则
         */
        public EnableSgDowngradegroupsResponse EnableSgDowngradegroups(EnableSgDowngradegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgDowngradegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 全局开启降级规则
         * Summary: 全局开启降级规则
         */
        public async Task<EnableSgDowngradegroupsResponse> EnableSgDowngradegroupsAsync(EnableSgDowngradegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgDowngradegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 全局开启降级规则
         * Summary: 全局开启降级规则
         */
        public EnableSgDowngradegroupsResponse EnableSgDowngradegroupsEx(EnableSgDowngradegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgDowngradegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.downgradegroups.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全局开启降级规则
         * Summary: 全局开启降级规则
         */
        public async Task<EnableSgDowngradegroupsResponse> EnableSgDowngradegroupsExAsync(EnableSgDowngradegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgDowngradegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.downgradegroups.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全局关闭降级规则
         * Summary: 全局关闭降级规则
         */
        public DisableSgDowngradegroupsResponse DisableSgDowngradegroups(DisableSgDowngradegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableSgDowngradegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 全局关闭降级规则
         * Summary: 全局关闭降级规则
         */
        public async Task<DisableSgDowngradegroupsResponse> DisableSgDowngradegroupsAsync(DisableSgDowngradegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableSgDowngradegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 全局关闭降级规则
         * Summary: 全局关闭降级规则
         */
        public DisableSgDowngradegroupsResponse DisableSgDowngradegroupsEx(DisableSgDowngradegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgDowngradegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.downgradegroups.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全局关闭降级规则
         * Summary: 全局关闭降级规则
         */
        public async Task<DisableSgDowngradegroupsResponse> DisableSgDowngradegroupsExAsync(DisableSgDowngradegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgDowngradegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.downgradegroups.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启一条降级规则
         * Summary: 开启一条降级规则
         */
        public EnableSgDowngradesResponse EnableSgDowngrades(EnableSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgDowngradesEx(request, headers, runtime);
        }

        /**
         * Description: 开启一条降级规则
         * Summary: 开启一条降级规则
         */
        public async Task<EnableSgDowngradesResponse> EnableSgDowngradesAsync(EnableSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgDowngradesExAsync(request, headers, runtime);
        }

        /**
         * Description: 开启一条降级规则
         * Summary: 开启一条降级规则
         */
        public EnableSgDowngradesResponse EnableSgDowngradesEx(EnableSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgDowngradesResponse>(DoRequest("2.0", "sofa.ms.sg.downgrades.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开启一条降级规则
         * Summary: 开启一条降级规则
         */
        public async Task<EnableSgDowngradesResponse> EnableSgDowngradesExAsync(EnableSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgDowngradesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.downgrades.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关闭一条降级规则
         * Summary: 关闭一条降级规则
         */
        public DisableSgDowngradesResponse DisableSgDowngrades(DisableSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableSgDowngradesEx(request, headers, runtime);
        }

        /**
         * Description: 关闭一条降级规则
         * Summary: 关闭一条降级规则
         */
        public async Task<DisableSgDowngradesResponse> DisableSgDowngradesAsync(DisableSgDowngradesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableSgDowngradesExAsync(request, headers, runtime);
        }

        /**
         * Description: 关闭一条降级规则
         * Summary: 关闭一条降级规则
         */
        public DisableSgDowngradesResponse DisableSgDowngradesEx(DisableSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgDowngradesResponse>(DoRequest("2.0", "sofa.ms.sg.downgrades.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 关闭一条降级规则
         * Summary: 关闭一条降级规则
         */
        public async Task<DisableSgDowngradesResponse> DisableSgDowngradesExAsync(DisableSgDowngradesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgDowngradesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.downgrades.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生效熔断规则
         * Summary: 生效熔断规则
         */
        public EnableSgCircuitbreakerrulesResponse EnableSgCircuitbreakerrules(EnableSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 生效熔断规则
         * Summary: 生效熔断规则
         */
        public async Task<EnableSgCircuitbreakerrulesResponse> EnableSgCircuitbreakerrulesAsync(EnableSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 生效熔断规则
         * Summary: 生效熔断规则
         */
        public EnableSgCircuitbreakerrulesResponse EnableSgCircuitbreakerrulesEx(EnableSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生效熔断规则
         * Summary: 生效熔断规则
         */
        public async Task<EnableSgCircuitbreakerrulesResponse> EnableSgCircuitbreakerrulesExAsync(EnableSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据实例id和服务id获取所有荣富安规则
         * Summary: 熔断规则查询
         */
        public QuerySgCircuitbreakerrulesResponse QuerySgCircuitbreakerrules(QuerySgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 根据实例id和服务id获取所有荣富安规则
         * Summary: 熔断规则查询
         */
        public async Task<QuerySgCircuitbreakerrulesResponse> QuerySgCircuitbreakerrulesAsync(QuerySgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据实例id和服务id获取所有荣富安规则
         * Summary: 熔断规则查询
         */
        public QuerySgCircuitbreakerrulesResponse QuerySgCircuitbreakerrulesEx(QuerySgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据实例id和服务id获取所有荣富安规则
         * Summary: 熔断规则查询
         */
        public async Task<QuerySgCircuitbreakerrulesResponse> QuerySgCircuitbreakerrulesExAsync(QuerySgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户下服务熔断规则
         * Summary: 服务熔断查询
         */
        public ListSgCircuitbreakerrulesResponse ListSgCircuitbreakerrules(ListSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 获取租户下服务熔断规则
         * Summary: 服务熔断查询
         */
        public async Task<ListSgCircuitbreakerrulesResponse> ListSgCircuitbreakerrulesAsync(ListSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取租户下服务熔断规则
         * Summary: 服务熔断查询
         */
        public ListSgCircuitbreakerrulesResponse ListSgCircuitbreakerrulesEx(ListSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户下服务熔断规则
         * Summary: 服务熔断查询
         */
        public async Task<ListSgCircuitbreakerrulesResponse> ListSgCircuitbreakerrulesExAsync(ListSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新熔断规则
         * Summary: 更新熔断规则
         */
        public UpdateSgCircuitbreakerrulesResponse UpdateSgCircuitbreakerrules(UpdateSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 更新熔断规则
         * Summary: 更新熔断规则
         */
        public async Task<UpdateSgCircuitbreakerrulesResponse> UpdateSgCircuitbreakerrulesAsync(UpdateSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新熔断规则
         * Summary: 更新熔断规则
         */
        public UpdateSgCircuitbreakerrulesResponse UpdateSgCircuitbreakerrulesEx(UpdateSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新熔断规则
         * Summary: 更新熔断规则
         */
        public async Task<UpdateSgCircuitbreakerrulesResponse> UpdateSgCircuitbreakerrulesExAsync(UpdateSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除熔断规则
         * Summary: 删除熔断规则
         */
        public DeleteSgCircuitbreakerrulesResponse DeleteSgCircuitbreakerrules(DeleteSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 删除熔断规则
         * Summary: 删除熔断规则
         */
        public async Task<DeleteSgCircuitbreakerrulesResponse> DeleteSgCircuitbreakerrulesAsync(DeleteSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除熔断规则
         * Summary: 删除熔断规则
         */
        public DeleteSgCircuitbreakerrulesResponse DeleteSgCircuitbreakerrulesEx(DeleteSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除熔断规则
         * Summary: 删除熔断规则
         */
        public async Task<DeleteSgCircuitbreakerrulesResponse> DeleteSgCircuitbreakerrulesExAsync(DeleteSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加熔断规则
         * Summary: 添加熔断规则
         */
        public AddSgCircuitbreakerrulesResponse AddSgCircuitbreakerrules(AddSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 添加熔断规则
         * Summary: 添加熔断规则
         */
        public async Task<AddSgCircuitbreakerrulesResponse> AddSgCircuitbreakerrulesAsync(AddSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加熔断规则
         * Summary: 添加熔断规则
         */
        public AddSgCircuitbreakerrulesResponse AddSgCircuitbreakerrulesEx(AddSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加熔断规则
         * Summary: 添加熔断规则
         */
        public async Task<AddSgCircuitbreakerrulesResponse> AddSgCircuitbreakerrulesExAsync(AddSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置熔断规则运行模式
         * Summary: 设置熔断规则运行模式
         */
        public SetSgCircuitbreakerrulesResponse SetSgCircuitbreakerrules(SetSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SetSgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 设置熔断规则运行模式
         * Summary: 设置熔断规则运行模式
         */
        public async Task<SetSgCircuitbreakerrulesResponse> SetSgCircuitbreakerrulesAsync(SetSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SetSgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 设置熔断规则运行模式
         * Summary: 设置熔断规则运行模式
         */
        public SetSgCircuitbreakerrulesResponse SetSgCircuitbreakerrulesEx(SetSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetSgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 设置熔断规则运行模式
         * Summary: 设置熔断规则运行模式
         */
        public async Task<SetSgCircuitbreakerrulesResponse> SetSgCircuitbreakerrulesExAsync(SetSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SetSgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.set", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化注册中心同步集群信息
         * Summary: 重新初始化注册中心同步集群信息
         */
        public ReinitRcSyncclusterResponse ReinitRcSynccluster(ReinitRcSyncclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ReinitRcSyncclusterEx(request, headers, runtime);
        }

        /**
         * Description: 重新初始化注册中心同步集群信息
         * Summary: 重新初始化注册中心同步集群信息
         */
        public async Task<ReinitRcSyncclusterResponse> ReinitRcSyncclusterAsync(ReinitRcSyncclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ReinitRcSyncclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 重新初始化注册中心同步集群信息
         * Summary: 重新初始化注册中心同步集群信息
         */
        public ReinitRcSyncclusterResponse ReinitRcSyncclusterEx(ReinitRcSyncclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitRcSyncclusterResponse>(DoRequest("2.0", "sofa.ms.rc.synccluster.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重新初始化注册中心同步集群信息
         * Summary: 重新初始化注册中心同步集群信息
         */
        public async Task<ReinitRcSyncclusterResponse> ReinitRcSyncclusterExAsync(ReinitRcSyncclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ReinitRcSyncclusterResponse>(await DoRequestAsync("2.0", "sofa.ms.rc.synccluster.reinit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在指定应用上添加透明劫持节点。
         * Summary: 添加透明劫持节点
         */
        public AddTransparentproxyNodeResponse AddTransparentproxyNode(AddTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTransparentproxyNodeEx(request, headers, runtime);
        }

        /**
         * Description: 在指定应用上添加透明劫持节点。
         * Summary: 添加透明劫持节点
         */
        public async Task<AddTransparentproxyNodeResponse> AddTransparentproxyNodeAsync(AddTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTransparentproxyNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 在指定应用上添加透明劫持节点。
         * Summary: 添加透明劫持节点
         */
        public AddTransparentproxyNodeResponse AddTransparentproxyNodeEx(AddTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTransparentproxyNodeResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.node.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在指定应用上添加透明劫持节点。
         * Summary: 添加透明劫持节点
         */
        public async Task<AddTransparentproxyNodeResponse> AddTransparentproxyNodeExAsync(AddTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTransparentproxyNodeResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.node.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用 ID，删除对应的透明劫持应用。
         * Summary: 删除透明劫持应用
         */
        public DeleteTransparentproxyAppResponse DeleteTransparentproxyApp(DeleteTransparentproxyAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTransparentproxyAppEx(request, headers, runtime);
        }

        /**
         * Description: 根据应用 ID，删除对应的透明劫持应用。
         * Summary: 删除透明劫持应用
         */
        public async Task<DeleteTransparentproxyAppResponse> DeleteTransparentproxyAppAsync(DeleteTransparentproxyAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTransparentproxyAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据应用 ID，删除对应的透明劫持应用。
         * Summary: 删除透明劫持应用
         */
        public DeleteTransparentproxyAppResponse DeleteTransparentproxyAppEx(DeleteTransparentproxyAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTransparentproxyAppResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用 ID，删除对应的透明劫持应用。
         * Summary: 删除透明劫持应用
         */
        public async Task<DeleteTransparentproxyAppResponse> DeleteTransparentproxyAppExAsync(DeleteTransparentproxyAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTransparentproxyAppResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.app.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定环境下服务治理中的透明劫持应用列表。
         * Summary: 服务治理透明劫持应用列表
         */
        public QueryTransparentproxyAppResponse QueryTransparentproxyApp(QueryTransparentproxyAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTransparentproxyAppEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定环境下服务治理中的透明劫持应用列表。
         * Summary: 服务治理透明劫持应用列表
         */
        public async Task<QueryTransparentproxyAppResponse> QueryTransparentproxyAppAsync(QueryTransparentproxyAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTransparentproxyAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定环境下服务治理中的透明劫持应用列表。
         * Summary: 服务治理透明劫持应用列表
         */
        public QueryTransparentproxyAppResponse QueryTransparentproxyAppEx(QueryTransparentproxyAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransparentproxyAppResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定环境下服务治理中的透明劫持应用列表。
         * Summary: 服务治理透明劫持应用列表
         */
        public async Task<QueryTransparentproxyAppResponse> QueryTransparentproxyAppExAsync(QueryTransparentproxyAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransparentproxyAppResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.app.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
         * Summary: 透明劫持规则配置
         */
        public UpdateTransparentproxyConfigResponse UpdateTransparentproxyConfig(UpdateTransparentproxyConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTransparentproxyConfigEx(request, headers, runtime);
        }

        /**
         * Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
         * Summary: 透明劫持规则配置
         */
        public async Task<UpdateTransparentproxyConfigResponse> UpdateTransparentproxyConfigAsync(UpdateTransparentproxyConfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTransparentproxyConfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
         * Summary: 透明劫持规则配置
         */
        public UpdateTransparentproxyConfigResponse UpdateTransparentproxyConfigEx(UpdateTransparentproxyConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTransparentproxyConfigResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用名与实例 ID，配置指定应用的透明劫持参数。
         * Summary: 透明劫持规则配置
         */
        public async Task<UpdateTransparentproxyConfigResponse> UpdateTransparentproxyConfigExAsync(UpdateTransparentproxyConfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTransparentproxyConfigResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.config.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
         * Summary: 查询透明劫持应用治理日志
         */
        public QueryTransparentproxyLogResponse QueryTransparentproxyLog(QueryTransparentproxyLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTransparentproxyLogEx(request, headers, runtime);
        }

        /**
         * Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
         * Summary: 查询透明劫持应用治理日志
         */
        public async Task<QueryTransparentproxyLogResponse> QueryTransparentproxyLogAsync(QueryTransparentproxyLogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTransparentproxyLogExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
         * Summary: 查询透明劫持应用治理日志
         */
        public QueryTransparentproxyLogResponse QueryTransparentproxyLogEx(QueryTransparentproxyLogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransparentproxyLogResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.log.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据应用名与实例 ID，查询指定应用的透明劫持应用治理日志。
         * Summary: 查询透明劫持应用治理日志
         */
        public async Task<QueryTransparentproxyLogResponse> QueryTransparentproxyLogExAsync(QueryTransparentproxyLogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransparentproxyLogResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.log.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加一个透明劫持应用。
         * Summary: 添加透明劫持应用
         */
        public AddTransparentproxyAppResponse AddTransparentproxyApp(AddTransparentproxyAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTransparentproxyAppEx(request, headers, runtime);
        }

        /**
         * Description: 添加一个透明劫持应用。
         * Summary: 添加透明劫持应用
         */
        public async Task<AddTransparentproxyAppResponse> AddTransparentproxyAppAsync(AddTransparentproxyAppRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTransparentproxyAppExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加一个透明劫持应用。
         * Summary: 添加透明劫持应用
         */
        public AddTransparentproxyAppResponse AddTransparentproxyAppEx(AddTransparentproxyAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTransparentproxyAppResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.app.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加一个透明劫持应用。
         * Summary: 添加透明劫持应用
         */
        public async Task<AddTransparentproxyAppResponse> AddTransparentproxyAppExAsync(AddTransparentproxyAppRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTransparentproxyAppResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.app.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据节点 ID，删除对应的透明劫持应用节点。
         * Summary: 删除透明劫持应用节点
         */
        public DeleteTransparentproxyNodeResponse DeleteTransparentproxyNode(DeleteTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteTransparentproxyNodeEx(request, headers, runtime);
        }

        /**
         * Description: 根据节点 ID，删除对应的透明劫持应用节点。
         * Summary: 删除透明劫持应用节点
         */
        public async Task<DeleteTransparentproxyNodeResponse> DeleteTransparentproxyNodeAsync(DeleteTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteTransparentproxyNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据节点 ID，删除对应的透明劫持应用节点。
         * Summary: 删除透明劫持应用节点
         */
        public DeleteTransparentproxyNodeResponse DeleteTransparentproxyNodeEx(DeleteTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTransparentproxyNodeResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.node.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据节点 ID，删除对应的透明劫持应用节点。
         * Summary: 删除透明劫持应用节点
         */
        public async Task<DeleteTransparentproxyNodeResponse> DeleteTransparentproxyNodeExAsync(DeleteTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteTransparentproxyNodeResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.node.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询透明劫持应用的节点列表。
         * Summary: 查询透明劫持应用的节点列表
         */
        public QueryTransparentproxyNodeResponse QueryTransparentproxyNode(QueryTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTransparentproxyNodeEx(request, headers, runtime);
        }

        /**
         * Description: 查询透明劫持应用的节点列表。
         * Summary: 查询透明劫持应用的节点列表
         */
        public async Task<QueryTransparentproxyNodeResponse> QueryTransparentproxyNodeAsync(QueryTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTransparentproxyNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询透明劫持应用的节点列表。
         * Summary: 查询透明劫持应用的节点列表
         */
        public QueryTransparentproxyNodeResponse QueryTransparentproxyNodeEx(QueryTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransparentproxyNodeResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.node.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询透明劫持应用的节点列表。
         * Summary: 查询透明劫持应用的节点列表
         */
        public async Task<QueryTransparentproxyNodeResponse> QueryTransparentproxyNodeExAsync(QueryTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransparentproxyNodeResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.node.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
         * Summary: 更新透明劫持应用治理配置
         */
        public UpdateTransparentproxyProtocolconfigResponse UpdateTransparentproxyProtocolconfig(UpdateTransparentproxyProtocolconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTransparentproxyProtocolconfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
         * Summary: 更新透明劫持应用治理配置
         */
        public async Task<UpdateTransparentproxyProtocolconfigResponse> UpdateTransparentproxyProtocolconfigAsync(UpdateTransparentproxyProtocolconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTransparentproxyProtocolconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
         * Summary: 更新透明劫持应用治理配置
         */
        public UpdateTransparentproxyProtocolconfigResponse UpdateTransparentproxyProtocolconfigEx(UpdateTransparentproxyProtocolconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTransparentproxyProtocolconfigResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.protocolconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新对应的透明劫持应用的治理参数配置，如最大请求数。
         * Summary: 更新透明劫持应用治理配置
         */
        public async Task<UpdateTransparentproxyProtocolconfigResponse> UpdateTransparentproxyProtocolconfigExAsync(UpdateTransparentproxyProtocolconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTransparentproxyProtocolconfigResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.protocolconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
         * Summary: 打开节点透明劫持开关（批量）
         */
        public EnableTransparentproxyNodeResponse EnableTransparentproxyNode(EnableTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableTransparentproxyNodeEx(request, headers, runtime);
        }

        /**
         * Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
         * Summary: 打开节点透明劫持开关（批量）
         */
        public async Task<EnableTransparentproxyNodeResponse> EnableTransparentproxyNodeAsync(EnableTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableTransparentproxyNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
         * Summary: 打开节点透明劫持开关（批量）
         */
        public EnableTransparentproxyNodeResponse EnableTransparentproxyNodeEx(EnableTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableTransparentproxyNodeResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.node.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据节点 ID，批量开启对应节点的透明劫持功能。
         * Summary: 打开节点透明劫持开关（批量）
         */
        public async Task<EnableTransparentproxyNodeResponse> EnableTransparentproxyNodeExAsync(EnableTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableTransparentproxyNodeResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.node.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
         * Summary: 关闭透明劫持节点开关（批量）
         */
        public DisableTransparentproxyNodeResponse DisableTransparentproxyNode(DisableTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableTransparentproxyNodeEx(request, headers, runtime);
        }

        /**
         * Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
         * Summary: 关闭透明劫持节点开关（批量）
         */
        public async Task<DisableTransparentproxyNodeResponse> DisableTransparentproxyNodeAsync(DisableTransparentproxyNodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableTransparentproxyNodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
         * Summary: 关闭透明劫持节点开关（批量）
         */
        public DisableTransparentproxyNodeResponse DisableTransparentproxyNodeEx(DisableTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableTransparentproxyNodeResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.node.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据节点 ID，批量关闭对应节点的透明劫持功能。
         * Summary: 关闭透明劫持节点开关（批量）
         */
        public async Task<DisableTransparentproxyNodeResponse> DisableTransparentproxyNodeExAsync(DisableTransparentproxyNodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableTransparentproxyNodeResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.node.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有的服务熔断的appName及对应的规则数
         * Summary: 服务熔断查询
         */
        public AllSgCircuitbreakerrulesResponse AllSgCircuitbreakerrules(AllSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AllSgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 查询所有的服务熔断的appName及对应的规则数
         * Summary: 服务熔断查询
         */
        public async Task<AllSgCircuitbreakerrulesResponse> AllSgCircuitbreakerrulesAsync(AllSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AllSgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询所有的服务熔断的appName及对应的规则数
         * Summary: 服务熔断查询
         */
        public AllSgCircuitbreakerrulesResponse AllSgCircuitbreakerrulesEx(AllSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询所有的服务熔断的appName及对应的规则数
         * Summary: 服务熔断查询
         */
        public async Task<AllSgCircuitbreakerrulesResponse> AllSgCircuitbreakerrulesExAsync(AllSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AllSgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.all", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过appName查询熔断规则
         * Summary: 通过appName查询熔断规则
         */
        public GetSgCircuitbreakerrulesResponse GetSgCircuitbreakerrules(GetSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSgCircuitbreakerrulesEx(request, headers, runtime);
        }

        /**
         * Description: 通过appName查询熔断规则
         * Summary: 通过appName查询熔断规则
         */
        public async Task<GetSgCircuitbreakerrulesResponse> GetSgCircuitbreakerrulesAsync(GetSgCircuitbreakerrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSgCircuitbreakerrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过appName查询熔断规则
         * Summary: 通过appName查询熔断规则
         */
        public GetSgCircuitbreakerrulesResponse GetSgCircuitbreakerrulesEx(GetSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgCircuitbreakerrulesResponse>(DoRequest("2.0", "sofa.ms.sg.circuitbreakerrules.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过appName查询熔断规则
         * Summary: 通过appName查询熔断规则
         */
        public async Task<GetSgCircuitbreakerrulesResponse> GetSgCircuitbreakerrulesExAsync(GetSgCircuitbreakerrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSgCircuitbreakerrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.circuitbreakerrules.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 透明劫持sidecar脚本链接查询接口
         * Summary: 透明劫持sidecar脚本链接查询接口
         */
        public QueryTransparentproxySidecarlinkResponse QueryTransparentproxySidecarlink(QueryTransparentproxySidecarlinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTransparentproxySidecarlinkEx(request, headers, runtime);
        }

        /**
         * Description: 透明劫持sidecar脚本链接查询接口
         * Summary: 透明劫持sidecar脚本链接查询接口
         */
        public async Task<QueryTransparentproxySidecarlinkResponse> QueryTransparentproxySidecarlinkAsync(QueryTransparentproxySidecarlinkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTransparentproxySidecarlinkExAsync(request, headers, runtime);
        }

        /**
         * Description: 透明劫持sidecar脚本链接查询接口
         * Summary: 透明劫持sidecar脚本链接查询接口
         */
        public QueryTransparentproxySidecarlinkResponse QueryTransparentproxySidecarlinkEx(QueryTransparentproxySidecarlinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransparentproxySidecarlinkResponse>(DoRequest("2.0", "sofa.ms.transparentproxy.sidecarlink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 透明劫持sidecar脚本链接查询接口
         * Summary: 透明劫持sidecar脚本链接查询接口
         */
        public async Task<QueryTransparentproxySidecarlinkResponse> QueryTransparentproxySidecarlinkExAsync(QueryTransparentproxySidecarlinkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTransparentproxySidecarlinkResponse>(await DoRequestAsync("2.0", "sofa.ms.transparentproxy.sidecarlink.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
         * Summary: 查找出所有包含鉴权规则组的服务ID
         */
        public ListSgAuthruledataidsResponse ListSgAuthruledataids(ListSgAuthruledataidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAuthruledataidsEx(request, headers, runtime);
        }

        /**
         * Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
         * Summary: 查找出所有包含鉴权规则组的服务ID
         */
        public async Task<ListSgAuthruledataidsResponse> ListSgAuthruledataidsAsync(ListSgAuthruledataidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAuthruledataidsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
         * Summary: 查找出所有包含鉴权规则组的服务ID
         */
        public ListSgAuthruledataidsResponse ListSgAuthruledataidsEx(ListSgAuthruledataidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthruledataidsResponse>(DoRequest("2.0", "sofa.ms.sg.authruledataids.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查找出所有包含鉴权规则组的服务ID（一般用于鉴权规则列表搜索框查询）
         * Summary: 查找出所有包含鉴权规则组的服务ID
         */
        public async Task<ListSgAuthruledataidsResponse> ListSgAuthruledataidsExAsync(ListSgAuthruledataidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthruledataidsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authruledataids.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
         * Summary: 查找出所有包含鉴权规则组的应用名
         */
        public ListSgAuthruleappnamesResponse ListSgAuthruleappnames(ListSgAuthruleappnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAuthruleappnamesEx(request, headers, runtime);
        }

        /**
         * Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
         * Summary: 查找出所有包含鉴权规则组的应用名
         */
        public async Task<ListSgAuthruleappnamesResponse> ListSgAuthruleappnamesAsync(ListSgAuthruleappnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAuthruleappnamesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
         * Summary: 查找出所有包含鉴权规则组的应用名
         */
        public ListSgAuthruleappnamesResponse ListSgAuthruleappnamesEx(ListSgAuthruleappnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthruleappnamesResponse>(DoRequest("2.0", "sofa.ms.sg.authruleappnames.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查找出所有包含鉴权规则组的应用名（一般用于服务鉴权列表搜索框查询）
         * Summary: 查找出所有包含鉴权规则组的应用名
         */
        public async Task<ListSgAuthruleappnamesResponse> ListSgAuthruleappnamesExAsync(ListSgAuthruleappnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthruleappnamesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authruleappnames.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查找出目前存活的应用名称列表
         * Summary: 查找出目前存活的应用名称列表
         */
        public ListSgAuthruleactiveappnamesResponse ListSgAuthruleactiveappnames(ListSgAuthruleactiveappnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAuthruleactiveappnamesEx(request, headers, runtime);
        }

        /**
         * Description: 查找出目前存活的应用名称列表
         * Summary: 查找出目前存活的应用名称列表
         */
        public async Task<ListSgAuthruleactiveappnamesResponse> ListSgAuthruleactiveappnamesAsync(ListSgAuthruleactiveappnamesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAuthruleactiveappnamesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查找出目前存活的应用名称列表
         * Summary: 查找出目前存活的应用名称列表
         */
        public ListSgAuthruleactiveappnamesResponse ListSgAuthruleactiveappnamesEx(ListSgAuthruleactiveappnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthruleactiveappnamesResponse>(DoRequest("2.0", "sofa.ms.sg.authruleactiveappnames.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查找出目前存活的应用名称列表
         * Summary: 查找出目前存活的应用名称列表
         */
        public async Task<ListSgAuthruleactiveappnamesResponse> ListSgAuthruleactiveappnamesExAsync(ListSgAuthruleactiveappnamesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthruleactiveappnamesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authruleactiveappnames.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查找该应用下存活的服务列表
         * Summary: 查找该应用下存活的服务列表
         */
        public ListSgAuthruleactivedataidsResponse ListSgAuthruleactivedataids(ListSgAuthruleactivedataidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAuthruleactivedataidsEx(request, headers, runtime);
        }

        /**
         * Description: 查找该应用下存活的服务列表
         * Summary: 查找该应用下存活的服务列表
         */
        public async Task<ListSgAuthruleactivedataidsResponse> ListSgAuthruleactivedataidsAsync(ListSgAuthruleactivedataidsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAuthruleactivedataidsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查找该应用下存活的服务列表
         * Summary: 查找该应用下存活的服务列表
         */
        public ListSgAuthruleactivedataidsResponse ListSgAuthruleactivedataidsEx(ListSgAuthruleactivedataidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthruleactivedataidsResponse>(DoRequest("2.0", "sofa.ms.sg.authruleactivedataids.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查找该应用下存活的服务列表
         * Summary: 查找该应用下存活的服务列表
         */
        public async Task<ListSgAuthruleactivedataidsResponse> ListSgAuthruleactivedataidsExAsync(ListSgAuthruleactivedataidsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthruleactivedataidsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authruleactivedataids.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用级服务鉴权列表搜索
         * Summary: 应用级服务鉴权列表搜索
         */
        public ListSgAuthrulegroupappsResponse ListSgAuthrulegroupapps(ListSgAuthrulegroupappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAuthrulegroupappsEx(request, headers, runtime);
        }

        /**
         * Description: 应用级服务鉴权列表搜索
         * Summary: 应用级服务鉴权列表搜索
         */
        public async Task<ListSgAuthrulegroupappsResponse> ListSgAuthrulegroupappsAsync(ListSgAuthrulegroupappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAuthrulegroupappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用级服务鉴权列表搜索
         * Summary: 应用级服务鉴权列表搜索
         */
        public ListSgAuthrulegroupappsResponse ListSgAuthrulegroupappsEx(ListSgAuthrulegroupappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthrulegroupappsResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroupapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用级服务鉴权列表搜索
         * Summary: 应用级服务鉴权列表搜索
         */
        public async Task<ListSgAuthrulegroupappsResponse> ListSgAuthrulegroupappsExAsync(ListSgAuthrulegroupappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthrulegroupappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroupapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务级服务鉴权列表搜索
         * Summary: 服务级服务鉴权列表搜索
         */
        public ListSgAuthrulegroupservicesResponse ListSgAuthrulegroupservices(ListSgAuthrulegroupservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAuthrulegroupservicesEx(request, headers, runtime);
        }

        /**
         * Description: 服务级服务鉴权列表搜索
         * Summary: 服务级服务鉴权列表搜索
         */
        public async Task<ListSgAuthrulegroupservicesResponse> ListSgAuthrulegroupservicesAsync(ListSgAuthrulegroupservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAuthrulegroupservicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 服务级服务鉴权列表搜索
         * Summary: 服务级服务鉴权列表搜索
         */
        public ListSgAuthrulegroupservicesResponse ListSgAuthrulegroupservicesEx(ListSgAuthrulegroupservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthrulegroupservicesResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroupservices.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 服务级服务鉴权列表搜索
         * Summary: 服务级服务鉴权列表搜索
         */
        public async Task<ListSgAuthrulegroupservicesResponse> ListSgAuthrulegroupservicesExAsync(ListSgAuthrulegroupservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuthrulegroupservicesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroupservices.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
         * Summary: 添加鉴权规则
         */
        public AddSgAuthrulegroupsbatchResponse AddSgAuthrulegroupsbatch(AddSgAuthrulegroupsbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgAuthrulegroupsbatchEx(request, headers, runtime);
        }

        /**
         * Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
         * Summary: 添加鉴权规则
         */
        public async Task<AddSgAuthrulegroupsbatchResponse> AddSgAuthrulegroupsbatchAsync(AddSgAuthrulegroupsbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgAuthrulegroupsbatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
         * Summary: 添加鉴权规则
         */
        public AddSgAuthrulegroupsbatchResponse AddSgAuthrulegroupsbatchEx(AddSgAuthrulegroupsbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgAuthrulegroupsbatchResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroupsbatch.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加鉴权规则 (添加服务级鉴权规则可批量添加)
         * Summary: 添加鉴权规则
         */
        public async Task<AddSgAuthrulegroupsbatchResponse> AddSgAuthrulegroupsbatchExAsync(AddSgAuthrulegroupsbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgAuthrulegroupsbatchResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroupsbatch.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量开启鉴权规则
         * Summary: 批量开启鉴权规则
         */
        public EnableSgAuthrulegroupsbatchResponse EnableSgAuthrulegroupsbatch(EnableSgAuthrulegroupsbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgAuthrulegroupsbatchEx(request, headers, runtime);
        }

        /**
         * Description: 批量开启鉴权规则
         * Summary: 批量开启鉴权规则
         */
        public async Task<EnableSgAuthrulegroupsbatchResponse> EnableSgAuthrulegroupsbatchAsync(EnableSgAuthrulegroupsbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgAuthrulegroupsbatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量开启鉴权规则
         * Summary: 批量开启鉴权规则
         */
        public EnableSgAuthrulegroupsbatchResponse EnableSgAuthrulegroupsbatchEx(EnableSgAuthrulegroupsbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgAuthrulegroupsbatchResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroupsbatch.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量开启鉴权规则
         * Summary: 批量开启鉴权规则
         */
        public async Task<EnableSgAuthrulegroupsbatchResponse> EnableSgAuthrulegroupsbatchExAsync(EnableSgAuthrulegroupsbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgAuthrulegroupsbatchResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroupsbatch.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量关闭鉴权规则
         * Summary: 批量关闭鉴权规则
         */
        public DisableSgAuthrulegroupsbatchResponse DisableSgAuthrulegroupsbatch(DisableSgAuthrulegroupsbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DisableSgAuthrulegroupsbatchEx(request, headers, runtime);
        }

        /**
         * Description: 批量关闭鉴权规则
         * Summary: 批量关闭鉴权规则
         */
        public async Task<DisableSgAuthrulegroupsbatchResponse> DisableSgAuthrulegroupsbatchAsync(DisableSgAuthrulegroupsbatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DisableSgAuthrulegroupsbatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量关闭鉴权规则
         * Summary: 批量关闭鉴权规则
         */
        public DisableSgAuthrulegroupsbatchResponse DisableSgAuthrulegroupsbatchEx(DisableSgAuthrulegroupsbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgAuthrulegroupsbatchResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroupsbatch.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量关闭鉴权规则
         * Summary: 批量关闭鉴权规则
         */
        public async Task<DisableSgAuthrulegroupsbatchResponse> DisableSgAuthrulegroupsbatchExAsync(DisableSgAuthrulegroupsbatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DisableSgAuthrulegroupsbatchResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroupsbatch.disable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出鉴权规则数据
         * Summary: 导出鉴权规则数据
         */
        public ExportSgAuthrulegroupsResponse ExportSgAuthrulegroups(ExportSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportSgAuthrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 导出鉴权规则数据
         * Summary: 导出鉴权规则数据
         */
        public async Task<ExportSgAuthrulegroupsResponse> ExportSgAuthrulegroupsAsync(ExportSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportSgAuthrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 导出鉴权规则数据
         * Summary: 导出鉴权规则数据
         */
        public ExportSgAuthrulegroupsResponse ExportSgAuthrulegroupsEx(ExportSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSgAuthrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroups.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出鉴权规则数据
         * Summary: 导出鉴权规则数据
         */
        public async Task<ExportSgAuthrulegroupsResponse> ExportSgAuthrulegroupsExAsync(ExportSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSgAuthrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroups.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入鉴权规则数据
         * Summary: 导入鉴权规则数据
         */
        public ImportSgAuthrulegroupsResponse ImportSgAuthrulegroups(ImportSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportSgAuthrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 导入鉴权规则数据
         * Summary: 导入鉴权规则数据
         */
        public async Task<ImportSgAuthrulegroupsResponse> ImportSgAuthrulegroupsAsync(ImportSgAuthrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportSgAuthrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入鉴权规则数据
         * Summary: 导入鉴权规则数据
         */
        public ImportSgAuthrulegroupsResponse ImportSgAuthrulegroupsEx(ImportSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSgAuthrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.authrulegroups.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入鉴权规则数据
         * Summary: 导入鉴权规则数据
         */
        public async Task<ImportSgAuthrulegroupsResponse> ImportSgAuthrulegroupsExAsync(ImportSgAuthrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSgAuthrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.authrulegroups.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源以文件形式导入导出
         * Summary: 资源以文件形式导入导出
         */
        public ImportSgResourceResponse ImportSgResource(ImportSgResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportSgResourceEx(request, headers, runtime);
        }

        /**
         * Description: 资源以文件形式导入导出
         * Summary: 资源以文件形式导入导出
         */
        public async Task<ImportSgResourceResponse> ImportSgResourceAsync(ImportSgResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportSgResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源以文件形式导入导出
         * Summary: 资源以文件形式导入导出
         */
        public ImportSgResourceResponse ImportSgResourceEx(ImportSgResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSgResourceResponse>(DoRequest("2.0", "sofa.ms.sg.resource.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源以文件形式导入导出
         * Summary: 资源以文件形式导入导出
         */
        public async Task<ImportSgResourceResponse> ImportSgResourceExAsync(ImportSgResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSgResourceResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.resource.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源以文件形式导出
         * Summary: 资源以文件形式导出
         */
        public ExportSgResourceResponse ExportSgResource(ExportSgResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportSgResourceEx(request, headers, runtime);
        }

        /**
         * Description: 资源以文件形式导出
         * Summary: 资源以文件形式导出
         */
        public async Task<ExportSgResourceResponse> ExportSgResourceAsync(ExportSgResourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportSgResourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 资源以文件形式导出
         * Summary: 资源以文件形式导出
         */
        public ExportSgResourceResponse ExportSgResourceEx(ExportSgResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSgResourceResponse>(DoRequest("2.0", "sofa.ms.sg.resource.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 资源以文件形式导出
         * Summary: 资源以文件形式导出
         */
        public async Task<ExportSgResourceResponse> ExportSgResourceExAsync(ExportSgResourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSgResourceResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.resource.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取不展示的UI列表
         * Summary: 前端屏蔽UI
         */
        public ListUndisplayComponentsResponse ListUndisplayComponents(ListUndisplayComponentsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUndisplayComponentsEx(request, headers, runtime);
        }

        /**
         * Description: 获取不展示的UI列表
         * Summary: 前端屏蔽UI
         */
        public async Task<ListUndisplayComponentsResponse> ListUndisplayComponentsAsync(ListUndisplayComponentsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUndisplayComponentsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取不展示的UI列表
         * Summary: 前端屏蔽UI
         */
        public ListUndisplayComponentsResponse ListUndisplayComponentsEx(ListUndisplayComponentsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUndisplayComponentsResponse>(DoRequest("2.0", "sofa.ms.undisplay.components.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取不展示的UI列表
         * Summary: 前端屏蔽UI
         */
        public async Task<ListUndisplayComponentsResponse> ListUndisplayComponentsExAsync(ListUndisplayComponentsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUndisplayComponentsResponse>(await DoRequestAsync("2.0", "sofa.ms.undisplay.components.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
         * Summary: 列表使用的更新服务鉴权接口
         */
        public UpdateSgListauthrulesResponse UpdateSgListauthrules(UpdateSgListauthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgListauthrulesEx(request, headers, runtime);
        }

        /**
         * Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
         * Summary: 列表使用的更新服务鉴权接口
         */
        public async Task<UpdateSgListauthrulesResponse> UpdateSgListauthrulesAsync(UpdateSgListauthrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgListauthrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
         * Summary: 列表使用的更新服务鉴权接口
         */
        public UpdateSgListauthrulesResponse UpdateSgListauthrulesEx(UpdateSgListauthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgListauthrulesResponse>(DoRequest("2.0", "sofa.ms.sg.listauthrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列表使用的更新服务鉴权接口，由于原有的更新接口存在diff操作，不会触发规则下发。列表是没有diff操作的，所以需要下发一次。
         * Summary: 列表使用的更新服务鉴权接口
         */
        public async Task<UpdateSgListauthrulesResponse> UpdateSgListauthrulesExAsync(UpdateSgListauthrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgListauthrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.listauthrules.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按照条件分页查询限流规则列表数据
         * Summary: 限流规则列表查询
         */
        public ListSgServiceratelimitrulesResponse ListSgServiceratelimitrules(ListSgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgServiceratelimitrulesEx(request, headers, runtime);
        }

        /**
         * Description: 按照条件分页查询限流规则列表数据
         * Summary: 限流规则列表查询
         */
        public async Task<ListSgServiceratelimitrulesResponse> ListSgServiceratelimitrulesAsync(ListSgServiceratelimitrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgServiceratelimitrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 按照条件分页查询限流规则列表数据
         * Summary: 限流规则列表查询
         */
        public ListSgServiceratelimitrulesResponse ListSgServiceratelimitrulesEx(ListSgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgServiceratelimitrulesResponse>(DoRequest("2.0", "sofa.ms.sg.serviceratelimitrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 按照条件分页查询限流规则列表数据
         * Summary: 限流规则列表查询
         */
        public async Task<ListSgServiceratelimitrulesResponse> ListSgServiceratelimitrulesExAsync(ListSgServiceratelimitrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgServiceratelimitrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.serviceratelimitrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询故障注入一级列表
         * Summary: 查询故障注入一级列表
         */
        public ListSgFaultinjectappsResponse ListSgFaultinjectapps(ListSgFaultinjectappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgFaultinjectappsEx(request, headers, runtime);
        }

        /**
         * Description: 查询故障注入一级列表
         * Summary: 查询故障注入一级列表
         */
        public async Task<ListSgFaultinjectappsResponse> ListSgFaultinjectappsAsync(ListSgFaultinjectappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgFaultinjectappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询故障注入一级列表
         * Summary: 查询故障注入一级列表
         */
        public ListSgFaultinjectappsResponse ListSgFaultinjectappsEx(ListSgFaultinjectappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaultinjectappsResponse>(DoRequest("2.0", "sofa.ms.sg.faultinjectapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询故障注入一级列表
         * Summary: 查询故障注入一级列表
         */
        public async Task<ListSgFaultinjectappsResponse> ListSgFaultinjectappsExAsync(ListSgFaultinjectappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaultinjectappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faultinjectapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询故障注入二级列表
         * Summary: 分页查询故障注入二级列表
         */
        public ListSgFaultinjectrulesResponse ListSgFaultinjectrules(ListSgFaultinjectrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgFaultinjectrulesEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询故障注入二级列表
         * Summary: 分页查询故障注入二级列表
         */
        public async Task<ListSgFaultinjectrulesResponse> ListSgFaultinjectrulesAsync(ListSgFaultinjectrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgFaultinjectrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询故障注入二级列表
         * Summary: 分页查询故障注入二级列表
         */
        public ListSgFaultinjectrulesResponse ListSgFaultinjectrulesEx(ListSgFaultinjectrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaultinjectrulesResponse>(DoRequest("2.0", "sofa.ms.sg.faultinjectrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询故障注入二级列表
         * Summary: 分页查询故障注入二级列表
         */
        public async Task<ListSgFaultinjectrulesResponse> ListSgFaultinjectrulesExAsync(ListSgFaultinjectrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaultinjectrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faultinjectrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已添加故障注入规则的应用
         * Summary: 查询已添加故障注入规则的应用
         */
        public ListSgFaultinjectallappsResponse ListSgFaultinjectallapps(ListSgFaultinjectallappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgFaultinjectallappsEx(request, headers, runtime);
        }

        /**
         * Description: 查询已添加故障注入规则的应用
         * Summary: 查询已添加故障注入规则的应用
         */
        public async Task<ListSgFaultinjectallappsResponse> ListSgFaultinjectallappsAsync(ListSgFaultinjectallappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgFaultinjectallappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已添加故障注入规则的应用
         * Summary: 查询已添加故障注入规则的应用
         */
        public ListSgFaultinjectallappsResponse ListSgFaultinjectallappsEx(ListSgFaultinjectallappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaultinjectallappsResponse>(DoRequest("2.0", "sofa.ms.sg.faultinjectallapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已添加故障注入规则的应用
         * Summary: 查询已添加故障注入规则的应用
         */
        public async Task<ListSgFaultinjectallappsResponse> ListSgFaultinjectallappsExAsync(ListSgFaultinjectallappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaultinjectallappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faultinjectallapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已添加故障注入规则的服务
         * Summary: 查询已添加故障注入规则的服务
         */
        public ListSgFaultinjectallservicesResponse ListSgFaultinjectallservices(ListSgFaultinjectallservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgFaultinjectallservicesEx(request, headers, runtime);
        }

        /**
         * Description: 查询已添加故障注入规则的服务
         * Summary: 查询已添加故障注入规则的服务
         */
        public async Task<ListSgFaultinjectallservicesResponse> ListSgFaultinjectallservicesAsync(ListSgFaultinjectallservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgFaultinjectallservicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已添加故障注入规则的服务
         * Summary: 查询已添加故障注入规则的服务
         */
        public ListSgFaultinjectallservicesResponse ListSgFaultinjectallservicesEx(ListSgFaultinjectallservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaultinjectallservicesResponse>(DoRequest("2.0", "sofa.ms.sg.faultinjectallservices.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已添加故障注入规则的服务
         * Summary: 查询已添加故障注入规则的服务
         */
        public async Task<ListSgFaultinjectallservicesResponse> ListSgFaultinjectallservicesExAsync(ListSgFaultinjectallservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaultinjectallservicesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faultinjectallservices.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新故障注入规则
         * Summary: 更新故障注入规则
         */
        public UpdateSgFaultinjectruleResponse UpdateSgFaultinjectrule(UpdateSgFaultinjectruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgFaultinjectruleEx(request, headers, runtime);
        }

        /**
         * Description: 更新故障注入规则
         * Summary: 更新故障注入规则
         */
        public async Task<UpdateSgFaultinjectruleResponse> UpdateSgFaultinjectruleAsync(UpdateSgFaultinjectruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgFaultinjectruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新故障注入规则
         * Summary: 更新故障注入规则
         */
        public UpdateSgFaultinjectruleResponse UpdateSgFaultinjectruleEx(UpdateSgFaultinjectruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgFaultinjectruleResponse>(DoRequest("2.0", "sofa.ms.sg.faultinjectrule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新故障注入规则
         * Summary: 更新故障注入规则
         */
        public async Task<UpdateSgFaultinjectruleResponse> UpdateSgFaultinjectruleExAsync(UpdateSgFaultinjectruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgFaultinjectruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faultinjectrule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增故障注入规则
         * Summary: 新增故障注入规则
         */
        public AddSgFaultinjectruleResponse AddSgFaultinjectrule(AddSgFaultinjectruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgFaultinjectruleEx(request, headers, runtime);
        }

        /**
         * Description: 新增故障注入规则
         * Summary: 新增故障注入规则
         */
        public async Task<AddSgFaultinjectruleResponse> AddSgFaultinjectruleAsync(AddSgFaultinjectruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgFaultinjectruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增故障注入规则
         * Summary: 新增故障注入规则
         */
        public AddSgFaultinjectruleResponse AddSgFaultinjectruleEx(AddSgFaultinjectruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgFaultinjectruleResponse>(DoRequest("2.0", "sofa.ms.sg.faultinjectrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增故障注入规则
         * Summary: 新增故障注入规则
         */
        public async Task<AddSgFaultinjectruleResponse> AddSgFaultinjectruleExAsync(AddSgFaultinjectruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgFaultinjectruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faultinjectrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新故障注入规则状态
         * Summary: 更新故障注入规则状态
         */
        public UpdateSgFaultinjectrulestatusResponse UpdateSgFaultinjectrulestatus(UpdateSgFaultinjectrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgFaultinjectrulestatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新故障注入规则状态
         * Summary: 更新故障注入规则状态
         */
        public async Task<UpdateSgFaultinjectrulestatusResponse> UpdateSgFaultinjectrulestatusAsync(UpdateSgFaultinjectrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgFaultinjectrulestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新故障注入规则状态
         * Summary: 更新故障注入规则状态
         */
        public UpdateSgFaultinjectrulestatusResponse UpdateSgFaultinjectrulestatusEx(UpdateSgFaultinjectrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgFaultinjectrulestatusResponse>(DoRequest("2.0", "sofa.ms.sg.faultinjectrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新故障注入规则状态
         * Summary: 更新故障注入规则状态
         */
        public async Task<UpdateSgFaultinjectrulestatusResponse> UpdateSgFaultinjectrulestatusExAsync(UpdateSgFaultinjectrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgFaultinjectrulestatusResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faultinjectrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除故障注入规则
         * Summary: 删除故障注入规则
         */
        public DeleteSgFaultinjectruleResponse DeleteSgFaultinjectrule(DeleteSgFaultinjectruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgFaultinjectruleEx(request, headers, runtime);
        }

        /**
         * Description: 删除故障注入规则
         * Summary: 删除故障注入规则
         */
        public async Task<DeleteSgFaultinjectruleResponse> DeleteSgFaultinjectruleAsync(DeleteSgFaultinjectruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgFaultinjectruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除故障注入规则
         * Summary: 删除故障注入规则
         */
        public DeleteSgFaultinjectruleResponse DeleteSgFaultinjectruleEx(DeleteSgFaultinjectruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgFaultinjectruleResponse>(DoRequest("2.0", "sofa.ms.sg.faultinjectrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除故障注入规则
         * Summary: 删除故障注入规则
         */
        public async Task<DeleteSgFaultinjectruleResponse> DeleteSgFaultinjectruleExAsync(DeleteSgFaultinjectruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgFaultinjectruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faultinjectrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public ListSgAppsResponse ListSgApps(ListSgAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAppsEx(request, headers, runtime);
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public async Task<ListSgAppsResponse> ListSgAppsAsync(ListSgAppsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAppsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public ListSgAppsResponse ListSgAppsEx(ListSgAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAppsResponse>(DoRequest("2.0", "sofa.ms.sg.apps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取应用列表
         * Summary: 获取应用列表
         */
        public async Task<ListSgAppsResponse> ListSgAppsExAsync(ListSgAppsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAppsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.apps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询服务路由一级列表
         * Summary: 查询服务路由一级列表
         */
        public ListSgRouterrulegroupappsResponse ListSgRouterrulegroupapps(ListSgRouterrulegroupappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgRouterrulegroupappsEx(request, headers, runtime);
        }

        /**
         * Description: 查询服务路由一级列表
         * Summary: 查询服务路由一级列表
         */
        public async Task<ListSgRouterrulegroupappsResponse> ListSgRouterrulegroupappsAsync(ListSgRouterrulegroupappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgRouterrulegroupappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询服务路由一级列表
         * Summary: 查询服务路由一级列表
         */
        public ListSgRouterrulegroupappsResponse ListSgRouterrulegroupappsEx(ListSgRouterrulegroupappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterrulegroupappsResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulegroupapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询服务路由一级列表
         * Summary: 查询服务路由一级列表
         */
        public async Task<ListSgRouterrulegroupappsResponse> ListSgRouterrulegroupappsExAsync(ListSgRouterrulegroupappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterrulegroupappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulegroupapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询服务路由二级例表
         * Summary: 查询服务路由二级例表
         */
        public ListSgRouterrulegroupsResponse ListSgRouterrulegroups(ListSgRouterrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgRouterrulegroupsEx(request, headers, runtime);
        }

        /**
         * Description: 查询服务路由二级例表
         * Summary: 查询服务路由二级例表
         */
        public async Task<ListSgRouterrulegroupsResponse> ListSgRouterrulegroupsAsync(ListSgRouterrulegroupsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgRouterrulegroupsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询服务路由二级例表
         * Summary: 查询服务路由二级例表
         */
        public ListSgRouterrulegroupsResponse ListSgRouterrulegroupsEx(ListSgRouterrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterrulegroupsResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulegroups.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询服务路由二级例表
         * Summary: 查询服务路由二级例表
         */
        public async Task<ListSgRouterrulegroupsResponse> ListSgRouterrulegroupsExAsync(ListSgRouterrulegroupsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterrulegroupsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulegroups.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已存在服务路由规则的应用接口
         * Summary: 查询已存在服务路由规则的应用接口
         */
        public ListSgRouterruleallappsResponse ListSgRouterruleallapps(ListSgRouterruleallappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgRouterruleallappsEx(request, headers, runtime);
        }

        /**
         * Description: 查询已存在服务路由规则的应用接口
         * Summary: 查询已存在服务路由规则的应用接口
         */
        public async Task<ListSgRouterruleallappsResponse> ListSgRouterruleallappsAsync(ListSgRouterruleallappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgRouterruleallappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已存在服务路由规则的应用接口
         * Summary: 查询已存在服务路由规则的应用接口
         */
        public ListSgRouterruleallappsResponse ListSgRouterruleallappsEx(ListSgRouterruleallappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterruleallappsResponse>(DoRequest("2.0", "sofa.ms.sg.routerruleallapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已存在服务路由规则的应用接口
         * Summary: 查询已存在服务路由规则的应用接口
         */
        public async Task<ListSgRouterruleallappsResponse> ListSgRouterruleallappsExAsync(ListSgRouterruleallappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterruleallappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerruleallapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已存在服务路由规则的服务接口
         * Summary: 查询已存在服务路由规则的服务接口
         */
        public ListSgRouterruleallservicesResponse ListSgRouterruleallservices(ListSgRouterruleallservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgRouterruleallservicesEx(request, headers, runtime);
        }

        /**
         * Description: 查询已存在服务路由规则的服务接口
         * Summary: 查询已存在服务路由规则的服务接口
         */
        public async Task<ListSgRouterruleallservicesResponse> ListSgRouterruleallservicesAsync(ListSgRouterruleallservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgRouterruleallservicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已存在服务路由规则的服务接口
         * Summary: 查询已存在服务路由规则的服务接口
         */
        public ListSgRouterruleallservicesResponse ListSgRouterruleallservicesEx(ListSgRouterruleallservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterruleallservicesResponse>(DoRequest("2.0", "sofa.ms.sg.routerruleallservices.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已存在服务路由规则的服务接口
         * Summary: 查询已存在服务路由规则的服务接口
         */
        public async Task<ListSgRouterruleallservicesResponse> ListSgRouterruleallservicesExAsync(ListSgRouterruleallservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgRouterruleallservicesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerruleallservices.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新路由规则组状态
         * Summary: 更新路由规则组状态
         */
        public UpdateSgRouterrulegroupstatusResponse UpdateSgRouterrulegroupstatus(UpdateSgRouterrulegroupstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgRouterrulegroupstatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新路由规则组状态
         * Summary: 更新路由规则组状态
         */
        public async Task<UpdateSgRouterrulegroupstatusResponse> UpdateSgRouterrulegroupstatusAsync(UpdateSgRouterrulegroupstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgRouterrulegroupstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新路由规则组状态
         * Summary: 更新路由规则组状态
         */
        public UpdateSgRouterrulegroupstatusResponse UpdateSgRouterrulegroupstatusEx(UpdateSgRouterrulegroupstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgRouterrulegroupstatusResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulegroupstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新路由规则组状态
         * Summary: 更新路由规则组状态
         */
        public async Task<UpdateSgRouterrulegroupstatusResponse> UpdateSgRouterrulegroupstatusExAsync(UpdateSgRouterrulegroupstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgRouterrulegroupstatusResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulegroupstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除路由规则组
         * Summary: 删除路由规则组
         */
        public DeleteSgRouterrulegroupResponse DeleteSgRouterrulegroup(DeleteSgRouterrulegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgRouterrulegroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除路由规则组
         * Summary: 删除路由规则组
         */
        public async Task<DeleteSgRouterrulegroupResponse> DeleteSgRouterrulegroupAsync(DeleteSgRouterrulegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgRouterrulegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除路由规则组
         * Summary: 删除路由规则组
         */
        public DeleteSgRouterrulegroupResponse DeleteSgRouterrulegroupEx(DeleteSgRouterrulegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgRouterrulegroupResponse>(DoRequest("2.0", "sofa.ms.sg.routerrulegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除路由规则组
         * Summary: 删除路由规则组
         */
        public async Task<DeleteSgRouterrulegroupResponse> DeleteSgRouterrulegroupExAsync(DeleteSgRouterrulegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgRouterrulegroupResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.routerrulegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离App列表及其规则数量
         * Summary: 故障隔离App列表
         */
        public ListSgFaulttoleranceappsResponse ListSgFaulttoleranceapps(ListSgFaulttoleranceappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgFaulttoleranceappsEx(request, headers, runtime);
        }

        /**
         * Description: 故障隔离App列表及其规则数量
         * Summary: 故障隔离App列表
         */
        public async Task<ListSgFaulttoleranceappsResponse> ListSgFaulttoleranceappsAsync(ListSgFaulttoleranceappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgFaulttoleranceappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 故障隔离App列表及其规则数量
         * Summary: 故障隔离App列表
         */
        public ListSgFaulttoleranceappsResponse ListSgFaulttoleranceappsEx(ListSgFaulttoleranceappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaulttoleranceappsResponse>(DoRequest("2.0", "sofa.ms.sg.faulttoleranceapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离App列表及其规则数量
         * Summary: 故障隔离App列表
         */
        public async Task<ListSgFaulttoleranceappsResponse> ListSgFaulttoleranceappsExAsync(ListSgFaulttoleranceappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaulttoleranceappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faulttoleranceapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则列表
         * Summary: 故障隔离规则列表
         */
        public ListSgFaulttolerancerulesResponse ListSgFaulttolerancerules(ListSgFaulttolerancerulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgFaulttolerancerulesEx(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则列表
         * Summary: 故障隔离规则列表
         */
        public async Task<ListSgFaulttolerancerulesResponse> ListSgFaulttolerancerulesAsync(ListSgFaulttolerancerulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgFaulttolerancerulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则列表
         * Summary: 故障隔离规则列表
         */
        public ListSgFaulttolerancerulesResponse ListSgFaulttolerancerulesEx(ListSgFaulttolerancerulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaulttolerancerulesResponse>(DoRequest("2.0", "sofa.ms.sg.faulttolerancerules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则列表
         * Summary: 故障隔离规则列表
         */
        public async Task<ListSgFaulttolerancerulesResponse> ListSgFaulttolerancerulesExAsync(ListSgFaulttolerancerulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgFaulttolerancerulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faulttolerancerules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则新增
         * Summary: 故障隔离规则新增
         */
        public AddSgFaulttoleranceruleResponse AddSgFaulttolerancerule(AddSgFaulttoleranceruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgFaulttoleranceruleEx(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则新增
         * Summary: 故障隔离规则新增
         */
        public async Task<AddSgFaulttoleranceruleResponse> AddSgFaulttoleranceruleAsync(AddSgFaulttoleranceruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgFaulttoleranceruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则新增
         * Summary: 故障隔离规则新增
         */
        public AddSgFaulttoleranceruleResponse AddSgFaulttoleranceruleEx(AddSgFaulttoleranceruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgFaulttoleranceruleResponse>(DoRequest("2.0", "sofa.ms.sg.faulttolerancerule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则新增
         * Summary: 故障隔离规则新增
         */
        public async Task<AddSgFaulttoleranceruleResponse> AddSgFaulttoleranceruleExAsync(AddSgFaulttoleranceruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgFaulttoleranceruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faulttolerancerule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则更新
         * Summary: 故障隔离规则更新
         */
        public UpdateSgFaulttoleranceruleResponse UpdateSgFaulttolerancerule(UpdateSgFaulttoleranceruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgFaulttoleranceruleEx(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则更新
         * Summary: 故障隔离规则更新
         */
        public async Task<UpdateSgFaulttoleranceruleResponse> UpdateSgFaulttoleranceruleAsync(UpdateSgFaulttoleranceruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgFaulttoleranceruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则更新
         * Summary: 故障隔离规则更新
         */
        public UpdateSgFaulttoleranceruleResponse UpdateSgFaulttoleranceruleEx(UpdateSgFaulttoleranceruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgFaulttoleranceruleResponse>(DoRequest("2.0", "sofa.ms.sg.faulttolerancerule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则更新
         * Summary: 故障隔离规则更新
         */
        public async Task<UpdateSgFaulttoleranceruleResponse> UpdateSgFaulttoleranceruleExAsync(UpdateSgFaulttoleranceruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgFaulttoleranceruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faulttolerancerule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则删除
         * Summary: 故障隔离规则删除
         */
        public DeleteSgFaulttoleranceruleResponse DeleteSgFaulttolerancerule(DeleteSgFaulttoleranceruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgFaulttoleranceruleEx(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则删除
         * Summary: 故障隔离规则删除
         */
        public async Task<DeleteSgFaulttoleranceruleResponse> DeleteSgFaulttoleranceruleAsync(DeleteSgFaulttoleranceruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgFaulttoleranceruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则删除
         * Summary: 故障隔离规则删除
         */
        public DeleteSgFaulttoleranceruleResponse DeleteSgFaulttoleranceruleEx(DeleteSgFaulttoleranceruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgFaulttoleranceruleResponse>(DoRequest("2.0", "sofa.ms.sg.faulttolerancerule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则删除
         * Summary: 故障隔离规则删除
         */
        public async Task<DeleteSgFaulttoleranceruleResponse> DeleteSgFaulttoleranceruleExAsync(DeleteSgFaulttoleranceruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgFaulttoleranceruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faulttolerancerule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则启用
         * Summary: 故障隔离规则启用
         */
        public EnableSgFaulttoleranceruleResponse EnableSgFaulttolerancerule(EnableSgFaulttoleranceruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSgFaulttoleranceruleEx(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则启用
         * Summary: 故障隔离规则启用
         */
        public async Task<EnableSgFaulttoleranceruleResponse> EnableSgFaulttoleranceruleAsync(EnableSgFaulttoleranceruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSgFaulttoleranceruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 故障隔离规则启用
         * Summary: 故障隔离规则启用
         */
        public EnableSgFaulttoleranceruleResponse EnableSgFaulttoleranceruleEx(EnableSgFaulttoleranceruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgFaulttoleranceruleResponse>(DoRequest("2.0", "sofa.ms.sg.faulttolerancerule.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 故障隔离规则启用
         * Summary: 故障隔离规则启用
         */
        public async Task<EnableSgFaulttoleranceruleResponse> EnableSgFaulttoleranceruleExAsync(EnableSgFaulttoleranceruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSgFaulttoleranceruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.faulttolerancerule.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询审计日志
         * Summary: 分页查询审计日志
         */
        public ListSgAuditlogsResponse ListSgAuditlogs(ListSgAuditlogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgAuditlogsEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询审计日志
         * Summary: 分页查询审计日志
         */
        public async Task<ListSgAuditlogsResponse> ListSgAuditlogsAsync(ListSgAuditlogsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgAuditlogsExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询审计日志
         * Summary: 分页查询审计日志
         */
        public ListSgAuditlogsResponse ListSgAuditlogsEx(ListSgAuditlogsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuditlogsResponse>(DoRequest("2.0", "sofa.ms.sg.auditlogs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询审计日志
         * Summary: 分页查询审计日志
         */
        public async Task<ListSgAuditlogsResponse> ListSgAuditlogsExAsync(ListSgAuditlogsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgAuditlogsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.auditlogs.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群列表
         * Summary: 查询集群列表
         */
        public ListSgMeshclusterResponse ListSgMeshcluster(ListSgMeshclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgMeshclusterEx(request, headers, runtime);
        }

        /**
         * Description: 查询集群列表
         * Summary: 查询集群列表
         */
        public async Task<ListSgMeshclusterResponse> ListSgMeshclusterAsync(ListSgMeshclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgMeshclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询集群列表
         * Summary: 查询集群列表
         */
        public ListSgMeshclusterResponse ListSgMeshclusterEx(ListSgMeshclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgMeshclusterResponse>(DoRequest("2.0", "sofa.ms.sg.meshcluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群列表
         * Summary: 查询集群列表
         */
        public async Task<ListSgMeshclusterResponse> ListSgMeshclusterExAsync(ListSgMeshclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgMeshclusterResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.meshcluster.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增集群
         * Summary: 新增集群
         */
        public AddSgMeshclusterResponse AddSgMeshcluster(AddSgMeshclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgMeshclusterEx(request, headers, runtime);
        }

        /**
         * Description: 新增集群
         * Summary: 新增集群
         */
        public async Task<AddSgMeshclusterResponse> AddSgMeshclusterAsync(AddSgMeshclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgMeshclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增集群
         * Summary: 新增集群
         */
        public AddSgMeshclusterResponse AddSgMeshclusterEx(AddSgMeshclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgMeshclusterResponse>(DoRequest("2.0", "sofa.ms.sg.meshcluster.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增集群
         * Summary: 新增集群
         */
        public async Task<AddSgMeshclusterResponse> AddSgMeshclusterExAsync(AddSgMeshclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgMeshclusterResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.meshcluster.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新集群状态
         * Summary: 更新集群状态
         */
        public UpdateSgMeshclusterstatusResponse UpdateSgMeshclusterstatus(UpdateSgMeshclusterstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgMeshclusterstatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新集群状态
         * Summary: 更新集群状态
         */
        public async Task<UpdateSgMeshclusterstatusResponse> UpdateSgMeshclusterstatusAsync(UpdateSgMeshclusterstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgMeshclusterstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新集群状态
         * Summary: 更新集群状态
         */
        public UpdateSgMeshclusterstatusResponse UpdateSgMeshclusterstatusEx(UpdateSgMeshclusterstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgMeshclusterstatusResponse>(DoRequest("2.0", "sofa.ms.sg.meshclusterstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新集群状态
         * Summary: 更新集群状态
         */
        public async Task<UpdateSgMeshclusterstatusResponse> UpdateSgMeshclusterstatusExAsync(UpdateSgMeshclusterstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgMeshclusterstatusResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.meshclusterstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除集群
         * Summary: 删除集群
         */
        public DeleteSgMeshclusterResponse DeleteSgMeshcluster(DeleteSgMeshclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgMeshclusterEx(request, headers, runtime);
        }

        /**
         * Description: 删除集群
         * Summary: 删除集群
         */
        public async Task<DeleteSgMeshclusterResponse> DeleteSgMeshclusterAsync(DeleteSgMeshclusterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgMeshclusterExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除集群
         * Summary: 删除集群
         */
        public DeleteSgMeshclusterResponse DeleteSgMeshclusterEx(DeleteSgMeshclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgMeshclusterResponse>(DoRequest("2.0", "sofa.ms.sg.meshcluster.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除集群
         * Summary: 删除集群
         */
        public async Task<DeleteSgMeshclusterResponse> DeleteSgMeshclusterExAsync(DeleteSgMeshclusterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgMeshclusterResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.meshcluster.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sideCar注入配置列表
         * Summary: 查询sideCar注入配置列表
         */
        public ListSgSidecarinjectResponse ListSgSidecarinject(ListSgSidecarinjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgSidecarinjectEx(request, headers, runtime);
        }

        /**
         * Description: 查询sideCar注入配置列表
         * Summary: 查询sideCar注入配置列表
         */
        public async Task<ListSgSidecarinjectResponse> ListSgSidecarinjectAsync(ListSgSidecarinjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgSidecarinjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询sideCar注入配置列表
         * Summary: 查询sideCar注入配置列表
         */
        public ListSgSidecarinjectResponse ListSgSidecarinjectEx(ListSgSidecarinjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgSidecarinjectResponse>(DoRequest("2.0", "sofa.ms.sg.sidecarinject.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询sideCar注入配置列表
         * Summary: 查询sideCar注入配置列表
         */
        public async Task<ListSgSidecarinjectResponse> ListSgSidecarinjectExAsync(ListSgSidecarinjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgSidecarinjectResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.sidecarinject.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增sideCar注入配置
         * Summary: 新增sideCar注入配置
         */
        public AddSgSidecarinjectResponse AddSgSidecarinject(AddSgSidecarinjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgSidecarinjectEx(request, headers, runtime);
        }

        /**
         * Description: 新增sideCar注入配置
         * Summary: 新增sideCar注入配置
         */
        public async Task<AddSgSidecarinjectResponse> AddSgSidecarinjectAsync(AddSgSidecarinjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgSidecarinjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增sideCar注入配置
         * Summary: 新增sideCar注入配置
         */
        public AddSgSidecarinjectResponse AddSgSidecarinjectEx(AddSgSidecarinjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgSidecarinjectResponse>(DoRequest("2.0", "sofa.ms.sg.sidecarinject.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增sideCar注入配置
         * Summary: 新增sideCar注入配置
         */
        public async Task<AddSgSidecarinjectResponse> AddSgSidecarinjectExAsync(AddSgSidecarinjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgSidecarinjectResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.sidecarinject.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar注入配置
         * Summary: 更新sidecar注入配置
         */
        public UpdateSgSidecarinjectResponse UpdateSgSidecarinject(UpdateSgSidecarinjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgSidecarinjectEx(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar注入配置
         * Summary: 更新sidecar注入配置
         */
        public async Task<UpdateSgSidecarinjectResponse> UpdateSgSidecarinjectAsync(UpdateSgSidecarinjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgSidecarinjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新sidecar注入配置
         * Summary: 更新sidecar注入配置
         */
        public UpdateSgSidecarinjectResponse UpdateSgSidecarinjectEx(UpdateSgSidecarinjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgSidecarinjectResponse>(DoRequest("2.0", "sofa.ms.sg.sidecarinject.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新sidecar注入配置
         * Summary: 更新sidecar注入配置
         */
        public async Task<UpdateSgSidecarinjectResponse> UpdateSgSidecarinjectExAsync(UpdateSgSidecarinjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgSidecarinjectResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.sidecarinject.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sideCar注入配置
         * Summary: 删除sideCar注入配置
         */
        public DeleteSgSidecarinjectResponse DeleteSgSidecarinject(DeleteSgSidecarinjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgSidecarinjectEx(request, headers, runtime);
        }

        /**
         * Description: 删除sideCar注入配置
         * Summary: 删除sideCar注入配置
         */
        public async Task<DeleteSgSidecarinjectResponse> DeleteSgSidecarinjectAsync(DeleteSgSidecarinjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgSidecarinjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除sideCar注入配置
         * Summary: 删除sideCar注入配置
         */
        public DeleteSgSidecarinjectResponse DeleteSgSidecarinjectEx(DeleteSgSidecarinjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgSidecarinjectResponse>(DoRequest("2.0", "sofa.ms.sg.sidecarinject.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除sideCar注入配置
         * Summary: 删除sideCar注入配置
         */
        public async Task<DeleteSgSidecarinjectResponse> DeleteSgSidecarinjectExAsync(DeleteSgSidecarinjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgSidecarinjectResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.sidecarinject.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通/关闭sideCar注入配置
         * Summary: 开通/关闭sideCar注入配置
         */
        public UpdateSgSidecarinjectstatusResponse UpdateSgSidecarinjectstatus(UpdateSgSidecarinjectstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgSidecarinjectstatusEx(request, headers, runtime);
        }

        /**
         * Description: 开通/关闭sideCar注入配置
         * Summary: 开通/关闭sideCar注入配置
         */
        public async Task<UpdateSgSidecarinjectstatusResponse> UpdateSgSidecarinjectstatusAsync(UpdateSgSidecarinjectstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgSidecarinjectstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 开通/关闭sideCar注入配置
         * Summary: 开通/关闭sideCar注入配置
         */
        public UpdateSgSidecarinjectstatusResponse UpdateSgSidecarinjectstatusEx(UpdateSgSidecarinjectstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgSidecarinjectstatusResponse>(DoRequest("2.0", "sofa.ms.sg.sidecarinjectstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通/关闭sideCar注入配置
         * Summary: 开通/关闭sideCar注入配置
         */
        public async Task<UpdateSgSidecarinjectstatusResponse> UpdateSgSidecarinjectstatusExAsync(UpdateSgSidecarinjectstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgSidecarinjectstatusResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.sidecarinjectstatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流量镜像分页查询一级列表
         * Summary: 流量镜像分页查询一级列表
         */
        public ListSgTrafficmirrorappsResponse ListSgTrafficmirrorapps(ListSgTrafficmirrorappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgTrafficmirrorappsEx(request, headers, runtime);
        }

        /**
         * Description: 流量镜像分页查询一级列表
         * Summary: 流量镜像分页查询一级列表
         */
        public async Task<ListSgTrafficmirrorappsResponse> ListSgTrafficmirrorappsAsync(ListSgTrafficmirrorappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgTrafficmirrorappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 流量镜像分页查询一级列表
         * Summary: 流量镜像分页查询一级列表
         */
        public ListSgTrafficmirrorappsResponse ListSgTrafficmirrorappsEx(ListSgTrafficmirrorappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgTrafficmirrorappsResponse>(DoRequest("2.0", "sofa.ms.sg.trafficmirrorapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流量镜像分页查询一级列表
         * Summary: 流量镜像分页查询一级列表
         */
        public async Task<ListSgTrafficmirrorappsResponse> ListSgTrafficmirrorappsExAsync(ListSgTrafficmirrorappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgTrafficmirrorappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.trafficmirrorapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流量镜像分页查询二级列表
         * Summary: 流量镜像分页查询二级列表
         */
        public ListSgTrafficmirrorrulesResponse ListSgTrafficmirrorrules(ListSgTrafficmirrorrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgTrafficmirrorrulesEx(request, headers, runtime);
        }

        /**
         * Description: 流量镜像分页查询二级列表
         * Summary: 流量镜像分页查询二级列表
         */
        public async Task<ListSgTrafficmirrorrulesResponse> ListSgTrafficmirrorrulesAsync(ListSgTrafficmirrorrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgTrafficmirrorrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 流量镜像分页查询二级列表
         * Summary: 流量镜像分页查询二级列表
         */
        public ListSgTrafficmirrorrulesResponse ListSgTrafficmirrorrulesEx(ListSgTrafficmirrorrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgTrafficmirrorrulesResponse>(DoRequest("2.0", "sofa.ms.sg.trafficmirrorrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 流量镜像分页查询二级列表
         * Summary: 流量镜像分页查询二级列表
         */
        public async Task<ListSgTrafficmirrorrulesResponse> ListSgTrafficmirrorrulesExAsync(ListSgTrafficmirrorrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgTrafficmirrorrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.trafficmirrorrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已添加规则的应用
         * Summary: 查询已添加规则的应用
         */
        public ListSgTrafficmirrorallappsResponse ListSgTrafficmirrorallapps(ListSgTrafficmirrorallappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgTrafficmirrorallappsEx(request, headers, runtime);
        }

        /**
         * Description: 查询已添加规则的应用
         * Summary: 查询已添加规则的应用
         */
        public async Task<ListSgTrafficmirrorallappsResponse> ListSgTrafficmirrorallappsAsync(ListSgTrafficmirrorallappsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgTrafficmirrorallappsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已添加规则的应用
         * Summary: 查询已添加规则的应用
         */
        public ListSgTrafficmirrorallappsResponse ListSgTrafficmirrorallappsEx(ListSgTrafficmirrorallappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgTrafficmirrorallappsResponse>(DoRequest("2.0", "sofa.ms.sg.trafficmirrorallapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已添加规则的应用
         * Summary: 查询已添加规则的应用
         */
        public async Task<ListSgTrafficmirrorallappsResponse> ListSgTrafficmirrorallappsExAsync(ListSgTrafficmirrorallappsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgTrafficmirrorallappsResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.trafficmirrorallapps.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已添加规则的服务
         * Summary: 查询已添加规则的服务
         */
        public ListSgTrafficmirrorservicesResponse ListSgTrafficmirrorservices(ListSgTrafficmirrorservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSgTrafficmirrorservicesEx(request, headers, runtime);
        }

        /**
         * Description: 查询已添加规则的服务
         * Summary: 查询已添加规则的服务
         */
        public async Task<ListSgTrafficmirrorservicesResponse> ListSgTrafficmirrorservicesAsync(ListSgTrafficmirrorservicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSgTrafficmirrorservicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询已添加规则的服务
         * Summary: 查询已添加规则的服务
         */
        public ListSgTrafficmirrorservicesResponse ListSgTrafficmirrorservicesEx(ListSgTrafficmirrorservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgTrafficmirrorservicesResponse>(DoRequest("2.0", "sofa.ms.sg.trafficmirrorservices.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询已添加规则的服务
         * Summary: 查询已添加规则的服务
         */
        public async Task<ListSgTrafficmirrorservicesResponse> ListSgTrafficmirrorservicesExAsync(ListSgTrafficmirrorservicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSgTrafficmirrorservicesResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.trafficmirrorservices.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增流量镜像规则
         * Summary: 新增流量镜像规则
         */
        public AddSgTrafficmirrorruleResponse AddSgTrafficmirrorrule(AddSgTrafficmirrorruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSgTrafficmirrorruleEx(request, headers, runtime);
        }

        /**
         * Description: 新增流量镜像规则
         * Summary: 新增流量镜像规则
         */
        public async Task<AddSgTrafficmirrorruleResponse> AddSgTrafficmirrorruleAsync(AddSgTrafficmirrorruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSgTrafficmirrorruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增流量镜像规则
         * Summary: 新增流量镜像规则
         */
        public AddSgTrafficmirrorruleResponse AddSgTrafficmirrorruleEx(AddSgTrafficmirrorruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgTrafficmirrorruleResponse>(DoRequest("2.0", "sofa.ms.sg.trafficmirrorrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增流量镜像规则
         * Summary: 新增流量镜像规则
         */
        public async Task<AddSgTrafficmirrorruleResponse> AddSgTrafficmirrorruleExAsync(AddSgTrafficmirrorruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSgTrafficmirrorruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.trafficmirrorrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新流量镜像规则状态
         * Summary: 更新流量镜像规则状态
         */
        public UpdateSgTrafficmirrorrulestatusResponse UpdateSgTrafficmirrorrulestatus(UpdateSgTrafficmirrorrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgTrafficmirrorrulestatusEx(request, headers, runtime);
        }

        /**
         * Description: 更新流量镜像规则状态
         * Summary: 更新流量镜像规则状态
         */
        public async Task<UpdateSgTrafficmirrorrulestatusResponse> UpdateSgTrafficmirrorrulestatusAsync(UpdateSgTrafficmirrorrulestatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgTrafficmirrorrulestatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新流量镜像规则状态
         * Summary: 更新流量镜像规则状态
         */
        public UpdateSgTrafficmirrorrulestatusResponse UpdateSgTrafficmirrorrulestatusEx(UpdateSgTrafficmirrorrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgTrafficmirrorrulestatusResponse>(DoRequest("2.0", "sofa.ms.sg.trafficmirrorrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新流量镜像规则状态
         * Summary: 更新流量镜像规则状态
         */
        public async Task<UpdateSgTrafficmirrorrulestatusResponse> UpdateSgTrafficmirrorrulestatusExAsync(UpdateSgTrafficmirrorrulestatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgTrafficmirrorrulestatusResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.trafficmirrorrulestatus.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除流量镜像规则
         * Summary: 删除流量镜像规则
         */
        public DeleteSgTrafficmirrorruleResponse DeleteSgTrafficmirrorrule(DeleteSgTrafficmirrorruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSgTrafficmirrorruleEx(request, headers, runtime);
        }

        /**
         * Description: 删除流量镜像规则
         * Summary: 删除流量镜像规则
         */
        public async Task<DeleteSgTrafficmirrorruleResponse> DeleteSgTrafficmirrorruleAsync(DeleteSgTrafficmirrorruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSgTrafficmirrorruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除流量镜像规则
         * Summary: 删除流量镜像规则
         */
        public DeleteSgTrafficmirrorruleResponse DeleteSgTrafficmirrorruleEx(DeleteSgTrafficmirrorruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgTrafficmirrorruleResponse>(DoRequest("2.0", "sofa.ms.sg.trafficmirrorrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除流量镜像规则
         * Summary: 删除流量镜像规则
         */
        public async Task<DeleteSgTrafficmirrorruleResponse> DeleteSgTrafficmirrorruleExAsync(DeleteSgTrafficmirrorruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSgTrafficmirrorruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.trafficmirrorrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新流量镜像规则
         * Summary: 更新流量镜像规则
         */
        public UpdateSgTrafficmirrorruleResponse UpdateSgTrafficmirrorrule(UpdateSgTrafficmirrorruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSgTrafficmirrorruleEx(request, headers, runtime);
        }

        /**
         * Description: 更新流量镜像规则
         * Summary: 更新流量镜像规则
         */
        public async Task<UpdateSgTrafficmirrorruleResponse> UpdateSgTrafficmirrorruleAsync(UpdateSgTrafficmirrorruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSgTrafficmirrorruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新流量镜像规则
         * Summary: 更新流量镜像规则
         */
        public UpdateSgTrafficmirrorruleResponse UpdateSgTrafficmirrorruleEx(UpdateSgTrafficmirrorruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgTrafficmirrorruleResponse>(DoRequest("2.0", "sofa.ms.sg.trafficmirrorrule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新流量镜像规则
         * Summary: 更新流量镜像规则
         */
        public async Task<UpdateSgTrafficmirrorruleResponse> UpdateSgTrafficmirrorruleExAsync(UpdateSgTrafficmirrorruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSgTrafficmirrorruleResponse>(await DoRequestAsync("2.0", "sofa.ms.sg.trafficmirrorrule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询通信安全规则列表接口
         * Summary: 查询列表接口
         */
        public ListSafeCommunicationrulesResponse ListSafeCommunicationrules(ListSafeCommunicationrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListSafeCommunicationrulesEx(request, headers, runtime);
        }

        /**
         * Description: 查询通信安全规则列表接口
         * Summary: 查询列表接口
         */
        public async Task<ListSafeCommunicationrulesResponse> ListSafeCommunicationrulesAsync(ListSafeCommunicationrulesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListSafeCommunicationrulesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询通信安全规则列表接口
         * Summary: 查询列表接口
         */
        public ListSafeCommunicationrulesResponse ListSafeCommunicationrulesEx(ListSafeCommunicationrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSafeCommunicationrulesResponse>(DoRequest("2.0", "sofa.ms.safe.communicationrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询通信安全规则列表接口
         * Summary: 查询列表接口
         */
        public async Task<ListSafeCommunicationrulesResponse> ListSafeCommunicationrulesExAsync(ListSafeCommunicationrulesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListSafeCommunicationrulesResponse>(await DoRequestAsync("2.0", "sofa.ms.safe.communicationrules.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取rule规则详情
         * Summary: 获取规则详情
         */
        public GetSafeCommunicationruleResponse GetSafeCommunicationrule(GetSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSafeCommunicationruleEx(request, headers, runtime);
        }

        /**
         * Description: 获取rule规则详情
         * Summary: 获取规则详情
         */
        public async Task<GetSafeCommunicationruleResponse> GetSafeCommunicationruleAsync(GetSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSafeCommunicationruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取rule规则详情
         * Summary: 获取规则详情
         */
        public GetSafeCommunicationruleResponse GetSafeCommunicationruleEx(GetSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSafeCommunicationruleResponse>(DoRequest("2.0", "sofa.ms.safe.communicationrule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取rule规则详情
         * Summary: 获取规则详情
         */
        public async Task<GetSafeCommunicationruleResponse> GetSafeCommunicationruleExAsync(GetSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSafeCommunicationruleResponse>(await DoRequestAsync("2.0", "sofa.ms.safe.communicationrule.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增通信规则接口
         * Summary: 新增通信规则接口
         */
        public AddSafeCommunicationruleResponse AddSafeCommunicationrule(AddSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddSafeCommunicationruleEx(request, headers, runtime);
        }

        /**
         * Description: 新增通信规则接口
         * Summary: 新增通信规则接口
         */
        public async Task<AddSafeCommunicationruleResponse> AddSafeCommunicationruleAsync(AddSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddSafeCommunicationruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增通信规则接口
         * Summary: 新增通信规则接口
         */
        public AddSafeCommunicationruleResponse AddSafeCommunicationruleEx(AddSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSafeCommunicationruleResponse>(DoRequest("2.0", "sofa.ms.safe.communicationrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增通信规则接口
         * Summary: 新增通信规则接口
         */
        public async Task<AddSafeCommunicationruleResponse> AddSafeCommunicationruleExAsync(AddSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddSafeCommunicationruleResponse>(await DoRequestAsync("2.0", "sofa.ms.safe.communicationrule.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改通信安全规则
         * Summary: 修改通信安全规则
         */
        public UpdateSafeCommunicationruleResponse UpdateSafeCommunicationrule(UpdateSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateSafeCommunicationruleEx(request, headers, runtime);
        }

        /**
         * Description: 修改通信安全规则
         * Summary: 修改通信安全规则
         */
        public async Task<UpdateSafeCommunicationruleResponse> UpdateSafeCommunicationruleAsync(UpdateSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateSafeCommunicationruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改通信安全规则
         * Summary: 修改通信安全规则
         */
        public UpdateSafeCommunicationruleResponse UpdateSafeCommunicationruleEx(UpdateSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSafeCommunicationruleResponse>(DoRequest("2.0", "sofa.ms.safe.communicationrule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改通信安全规则
         * Summary: 修改通信安全规则
         */
        public async Task<UpdateSafeCommunicationruleResponse> UpdateSafeCommunicationruleExAsync(UpdateSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateSafeCommunicationruleResponse>(await DoRequestAsync("2.0", "sofa.ms.safe.communicationrule.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除通信规则接口
         * Summary: 删除通信规则接口
         */
        public DeleteSafeCommunicationruleResponse DeleteSafeCommunicationrule(DeleteSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteSafeCommunicationruleEx(request, headers, runtime);
        }

        /**
         * Description: 删除通信规则接口
         * Summary: 删除通信规则接口
         */
        public async Task<DeleteSafeCommunicationruleResponse> DeleteSafeCommunicationruleAsync(DeleteSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteSafeCommunicationruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除通信规则接口
         * Summary: 删除通信规则接口
         */
        public DeleteSafeCommunicationruleResponse DeleteSafeCommunicationruleEx(DeleteSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSafeCommunicationruleResponse>(DoRequest("2.0", "sofa.ms.safe.communicationrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除通信规则接口
         * Summary: 删除通信规则接口
         */
        public async Task<DeleteSafeCommunicationruleResponse> DeleteSafeCommunicationruleExAsync(DeleteSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteSafeCommunicationruleResponse>(await DoRequestAsync("2.0", "sofa.ms.safe.communicationrule.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改通信规则生效状态
         * Summary: 修改通信规则状态
         */
        public EnableSafeCommunicationruleResponse EnableSafeCommunicationrule(EnableSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableSafeCommunicationruleEx(request, headers, runtime);
        }

        /**
         * Description: 修改通信规则生效状态
         * Summary: 修改通信规则状态
         */
        public async Task<EnableSafeCommunicationruleResponse> EnableSafeCommunicationruleAsync(EnableSafeCommunicationruleRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableSafeCommunicationruleExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改通信规则生效状态
         * Summary: 修改通信规则状态
         */
        public EnableSafeCommunicationruleResponse EnableSafeCommunicationruleEx(EnableSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSafeCommunicationruleResponse>(DoRequest("2.0", "sofa.ms.safe.communicationrule.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改通信规则生效状态
         * Summary: 修改通信规则状态
         */
        public async Task<EnableSafeCommunicationruleResponse> EnableSafeCommunicationruleExAsync(EnableSafeCommunicationruleRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableSafeCommunicationruleResponse>(await DoRequestAsync("2.0", "sofa.ms.safe.communicationrule.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
