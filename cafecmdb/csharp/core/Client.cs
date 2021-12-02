// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.CAFECMDB.Models;

namespace AntChain.SDK.CAFECMDB
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
                        {"sdk_version", "1.0.27"},
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
                        {"sdk_version", "1.0.27"},
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
         * Description: 查询资源
         * Summary: 查询资源
         */
        public QueryItemResponse QueryItem(QueryItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryItemEx(request, headers, runtime);
        }

        /**
         * Description: 查询资源
         * Summary: 查询资源
         */
        public async Task<QueryItemResponse> QueryItemAsync(QueryItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询资源
         * Summary: 查询资源
         */
        public QueryItemResponse QueryItemEx(QueryItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryItemResponse>(DoRequest("1.0", "antcloud.cmdb.item.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询资源
         * Summary: 查询资源
         */
        public async Task<QueryItemResponse> QueryItemExAsync(QueryItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryItemResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建资源
         * Summary: 创建资源
         */
        public CreateItemResponse CreateItem(CreateItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateItemEx(request, headers, runtime);
        }

        /**
         * Description: 创建资源
         * Summary: 创建资源
         */
        public async Task<CreateItemResponse> CreateItemAsync(CreateItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建资源
         * Summary: 创建资源
         */
        public CreateItemResponse CreateItemEx(CreateItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateItemResponse>(DoRequest("1.0", "antcloud.cmdb.item.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建资源
         * Summary: 创建资源
         */
        public async Task<CreateItemResponse> CreateItemExAsync(CreateItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateItemResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
         * Summary: 更新资源属性
         */
        public UpdateItemResponse UpdateItem(UpdateItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateItemEx(request, headers, runtime);
        }

        /**
         * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
         * Summary: 更新资源属性
         */
        public async Task<UpdateItemResponse> UpdateItemAsync(UpdateItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
         * Summary: 更新资源属性
         */
        public UpdateItemResponse UpdateItemEx(UpdateItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateItemResponse>(DoRequest("1.0", "antcloud.cmdb.item.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 全量更新资源属性，不传的属性如果原本有值会被覆盖成空值
         * Summary: 更新资源属性
         */
        public async Task<UpdateItemResponse> UpdateItemExAsync(UpdateItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateItemResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个资源
         * Summary: 删除单个资源
         */
        public DeleteItemResponse DeleteItem(DeleteItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteItemEx(request, headers, runtime);
        }

        /**
         * Description: 删除单个资源
         * Summary: 删除单个资源
         */
        public async Task<DeleteItemResponse> DeleteItemAsync(DeleteItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除单个资源
         * Summary: 删除单个资源
         */
        public DeleteItemResponse DeleteItemEx(DeleteItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteItemResponse>(DoRequest("1.0", "antcloud.cmdb.item.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除单个资源
         * Summary: 删除单个资源
         */
        public async Task<DeleteItemResponse> DeleteItemExAsync(DeleteItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteItemResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个Item的详细信息
         * Summary: 获取单个Item的详细信息
         */
        public GetItemResponse GetItem(GetItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetItemEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个Item的详细信息
         * Summary: 获取单个Item的详细信息
         */
        public async Task<GetItemResponse> GetItemAsync(GetItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个Item的详细信息
         * Summary: 获取单个Item的详细信息
         */
        public GetItemResponse GetItemEx(GetItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetItemResponse>(DoRequest("1.0", "antcloud.cmdb.item.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个Item的详细信息
         * Summary: 获取单个Item的详细信息
         */
        public async Task<GetItemResponse> GetItemExAsync(GetItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetItemResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个模型
         * Summary: 获取单个模型
         */
        public GetModelResponse GetModel(GetModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetModelEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个模型
         * Summary: 获取单个模型
         */
        public async Task<GetModelResponse> GetModelAsync(GetModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个模型
         * Summary: 获取单个模型
         */
        public GetModelResponse GetModelEx(GetModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetModelResponse>(DoRequest("1.0", "antcloud.cmdb.model.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个模型
         * Summary: 获取单个模型
         */
        public async Task<GetModelResponse> GetModelExAsync(GetModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetModelResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型
         * Summary: 查询模型
         */
        public QueryModelResponse QueryModel(QueryModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelEx(request, headers, runtime);
        }

        /**
         * Description: 查询模型
         * Summary: 查询模型
         */
        public async Task<QueryModelResponse> QueryModelAsync(QueryModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询模型
         * Summary: 查询模型
         */
        public QueryModelResponse QueryModelEx(QueryModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelResponse>(DoRequest("1.0", "antcloud.cmdb.model.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型
         * Summary: 查询模型
         */
        public async Task<QueryModelResponse> QueryModelExAsync(QueryModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模型
         * Summary: 创建模型
         */
        public CreateModelResponse CreateModel(CreateModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateModelEx(request, headers, runtime);
        }

        /**
         * Description: 创建模型
         * Summary: 创建模型
         */
        public async Task<CreateModelResponse> CreateModelAsync(CreateModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建模型
         * Summary: 创建模型
         */
        public CreateModelResponse CreateModelEx(CreateModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateModelResponse>(DoRequest("1.0", "antcloud.cmdb.model.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模型
         * Summary: 创建模型
         */
        public async Task<CreateModelResponse> CreateModelExAsync(CreateModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateModelResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型
         * Summary: 更新模型
         */
        public UpdateModelResponse UpdateModel(UpdateModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateModelEx(request, headers, runtime);
        }

        /**
         * Description: 更新模型
         * Summary: 更新模型
         */
        public async Task<UpdateModelResponse> UpdateModelAsync(UpdateModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新模型
         * Summary: 更新模型
         */
        public UpdateModelResponse UpdateModelEx(UpdateModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateModelResponse>(DoRequest("1.0", "antcloud.cmdb.model.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型
         * Summary: 更新模型
         */
        public async Task<UpdateModelResponse> UpdateModelExAsync(UpdateModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateModelResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个模型分组
         * Summary: 获取单个模型分组
         */
        public GetModelcategoryResponse GetModelcategory(GetModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetModelcategoryEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个模型分组
         * Summary: 获取单个模型分组
         */
        public async Task<GetModelcategoryResponse> GetModelcategoryAsync(GetModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetModelcategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个模型分组
         * Summary: 获取单个模型分组
         */
        public GetModelcategoryResponse GetModelcategoryEx(GetModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetModelcategoryResponse>(DoRequest("1.0", "antcloud.cmdb.modelcategory.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个模型分组
         * Summary: 获取单个模型分组
         */
        public async Task<GetModelcategoryResponse> GetModelcategoryExAsync(GetModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetModelcategoryResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelcategory.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型
         * Summary: 删除模型
         */
        public DeleteModelResponse DeleteModel(DeleteModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteModelEx(request, headers, runtime);
        }

        /**
         * Description: 删除模型
         * Summary: 删除模型
         */
        public async Task<DeleteModelResponse> DeleteModelAsync(DeleteModelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteModelExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除模型
         * Summary: 删除模型
         */
        public DeleteModelResponse DeleteModelEx(DeleteModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteModelResponse>(DoRequest("1.0", "antcloud.cmdb.model.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型
         * Summary: 删除模型
         */
        public async Task<DeleteModelResponse> DeleteModelExAsync(DeleteModelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteModelResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型分组
         * Summary: 查询模型分组
         */
        public QueryModelcategoryResponse QueryModelcategory(QueryModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelcategoryEx(request, headers, runtime);
        }

        /**
         * Description: 查询模型分组
         * Summary: 查询模型分组
         */
        public async Task<QueryModelcategoryResponse> QueryModelcategoryAsync(QueryModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelcategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询模型分组
         * Summary: 查询模型分组
         */
        public QueryModelcategoryResponse QueryModelcategoryEx(QueryModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelcategoryResponse>(DoRequest("1.0", "antcloud.cmdb.modelcategory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型分组
         * Summary: 查询模型分组
         */
        public async Task<QueryModelcategoryResponse> QueryModelcategoryExAsync(QueryModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelcategoryResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelcategory.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模型分组
         * Summary: 创建模型分组
         */
        public CreateModelcategoryResponse CreateModelcategory(CreateModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateModelcategoryEx(request, headers, runtime);
        }

        /**
         * Description: 创建模型分组
         * Summary: 创建模型分组
         */
        public async Task<CreateModelcategoryResponse> CreateModelcategoryAsync(CreateModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateModelcategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建模型分组
         * Summary: 创建模型分组
         */
        public CreateModelcategoryResponse CreateModelcategoryEx(CreateModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateModelcategoryResponse>(DoRequest("1.0", "antcloud.cmdb.modelcategory.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模型分组
         * Summary: 创建模型分组
         */
        public async Task<CreateModelcategoryResponse> CreateModelcategoryExAsync(CreateModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateModelcategoryResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelcategory.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型分组
         * Summary: 更新模型分组
         */
        public UpdateModelcategoryResponse UpdateModelcategory(UpdateModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateModelcategoryEx(request, headers, runtime);
        }

        /**
         * Description: 更新模型分组
         * Summary: 更新模型分组
         */
        public async Task<UpdateModelcategoryResponse> UpdateModelcategoryAsync(UpdateModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateModelcategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新模型分组
         * Summary: 更新模型分组
         */
        public UpdateModelcategoryResponse UpdateModelcategoryEx(UpdateModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateModelcategoryResponse>(DoRequest("1.0", "antcloud.cmdb.modelcategory.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型分组
         * Summary: 更新模型分组
         */
        public async Task<UpdateModelcategoryResponse> UpdateModelcategoryExAsync(UpdateModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateModelcategoryResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelcategory.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型分组
         * Summary: 删除模型分组
         */
        public DeleteModelcategoryResponse DeleteModelcategory(DeleteModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteModelcategoryEx(request, headers, runtime);
        }

        /**
         * Description: 删除模型分组
         * Summary: 删除模型分组
         */
        public async Task<DeleteModelcategoryResponse> DeleteModelcategoryAsync(DeleteModelcategoryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteModelcategoryExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除模型分组
         * Summary: 删除模型分组
         */
        public DeleteModelcategoryResponse DeleteModelcategoryEx(DeleteModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteModelcategoryResponse>(DoRequest("1.0", "antcloud.cmdb.modelcategory.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型分组
         * Summary: 删除模型分组
         */
        public async Task<DeleteModelcategoryResponse> DeleteModelcategoryExAsync(DeleteModelcategoryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteModelcategoryResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelcategory.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个模型字段
         * Summary: 获取单个模型字段
         */
        public GetModelAttributeResponse GetModelAttribute(GetModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetModelAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个模型字段
         * Summary: 获取单个模型字段
         */
        public async Task<GetModelAttributeResponse> GetModelAttributeAsync(GetModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetModelAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个模型字段
         * Summary: 获取单个模型字段
         */
        public GetModelAttributeResponse GetModelAttributeEx(GetModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetModelAttributeResponse>(DoRequest("1.0", "antcloud.cmdb.model.attribute.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个模型字段
         * Summary: 获取单个模型字段
         */
        public async Task<GetModelAttributeResponse> GetModelAttributeExAsync(GetModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetModelAttributeResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.attribute.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型字段
         * Summary: 查询模型字段
         */
        public QueryModelAttributeResponse QueryModelAttribute(QueryModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 查询模型字段
         * Summary: 查询模型字段
         */
        public async Task<QueryModelAttributeResponse> QueryModelAttributeAsync(QueryModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询模型字段
         * Summary: 查询模型字段
         */
        public QueryModelAttributeResponse QueryModelAttributeEx(QueryModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelAttributeResponse>(DoRequest("1.0", "antcloud.cmdb.model.attribute.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型字段
         * Summary: 查询模型字段
         */
        public async Task<QueryModelAttributeResponse> QueryModelAttributeExAsync(QueryModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelAttributeResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.attribute.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模型字段
         * Summary: 创建模型字段
         */
        public CreateModelAttributeResponse CreateModelAttribute(CreateModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateModelAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 创建模型字段
         * Summary: 创建模型字段
         */
        public async Task<CreateModelAttributeResponse> CreateModelAttributeAsync(CreateModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateModelAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建模型字段
         * Summary: 创建模型字段
         */
        public CreateModelAttributeResponse CreateModelAttributeEx(CreateModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateModelAttributeResponse>(DoRequest("1.0", "antcloud.cmdb.model.attribute.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模型字段
         * Summary: 创建模型字段
         */
        public async Task<CreateModelAttributeResponse> CreateModelAttributeExAsync(CreateModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateModelAttributeResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.attribute.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型字段
         * Summary: 更新模型字段
         */
        public UpdateModelAttributeResponse UpdateModelAttribute(UpdateModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateModelAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 更新模型字段
         * Summary: 更新模型字段
         */
        public async Task<UpdateModelAttributeResponse> UpdateModelAttributeAsync(UpdateModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateModelAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新模型字段
         * Summary: 更新模型字段
         */
        public UpdateModelAttributeResponse UpdateModelAttributeEx(UpdateModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateModelAttributeResponse>(DoRequest("1.0", "antcloud.cmdb.model.attribute.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型字段
         * Summary: 更新模型字段
         */
        public async Task<UpdateModelAttributeResponse> UpdateModelAttributeExAsync(UpdateModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateModelAttributeResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.attribute.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型字段
         * Summary: 删除模型字段
         */
        public DeleteModelAttributeResponse DeleteModelAttribute(DeleteModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteModelAttributeEx(request, headers, runtime);
        }

        /**
         * Description: 删除模型字段
         * Summary: 删除模型字段
         */
        public async Task<DeleteModelAttributeResponse> DeleteModelAttributeAsync(DeleteModelAttributeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteModelAttributeExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除模型字段
         * Summary: 删除模型字段
         */
        public DeleteModelAttributeResponse DeleteModelAttributeEx(DeleteModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteModelAttributeResponse>(DoRequest("1.0", "antcloud.cmdb.model.attribute.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型字段
         * Summary: 删除模型字段
         */
        public async Task<DeleteModelAttributeResponse> DeleteModelAttributeExAsync(DeleteModelAttributeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteModelAttributeResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.model.attribute.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: id是否存在
         * Summary: id是否存在
         */
        public ExistItemIdResponse ExistItemId(ExistItemIdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExistItemIdEx(request, headers, runtime);
        }

        /**
         * Description: id是否存在
         * Summary: id是否存在
         */
        public async Task<ExistItemIdResponse> ExistItemIdAsync(ExistItemIdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExistItemIdExAsync(request, headers, runtime);
        }

        /**
         * Description: id是否存在
         * Summary: id是否存在
         */
        public ExistItemIdResponse ExistItemIdEx(ExistItemIdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistItemIdResponse>(DoRequest("1.0", "antcloud.cmdb.item.id.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: id是否存在
         * Summary: id是否存在
         */
        public async Task<ExistItemIdResponse> ExistItemIdExAsync(ExistItemIdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExistItemIdResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.id.exist", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前item的关系资源，注意区分上钻和下钻
         * Summary: 查询当前item的关系资源
         */
        public QueryItemRelationsResponse QueryItemRelations(QueryItemRelationsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryItemRelationsEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前item的关系资源，注意区分上钻和下钻
         * Summary: 查询当前item的关系资源
         */
        public async Task<QueryItemRelationsResponse> QueryItemRelationsAsync(QueryItemRelationsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryItemRelationsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前item的关系资源，注意区分上钻和下钻
         * Summary: 查询当前item的关系资源
         */
        public QueryItemRelationsResponse QueryItemRelationsEx(QueryItemRelationsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryItemRelationsResponse>(DoRequest("1.0", "antcloud.cmdb.item.relations.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前item的关系资源，注意区分上钻和下钻
         * Summary: 查询当前item的关系资源
         */
        public async Task<QueryItemRelationsResponse> QueryItemRelationsExAsync(QueryItemRelationsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryItemRelationsResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.relations.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入ITEM
         * Summary: 导入ITEM
         */
        public ImportItemResponse ImportItem(ImportItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportItemEx(request, headers, runtime);
        }

        /**
         * Description: 导入ITEM
         * Summary: 导入ITEM
         */
        public async Task<ImportItemResponse> ImportItemAsync(ImportItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入ITEM
         * Summary: 导入ITEM
         */
        public ImportItemResponse ImportItemEx(ImportItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportItemResponse>(DoRequest("1.0", "antcloud.cmdb.item.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入ITEM
         * Summary: 导入ITEM
         */
        public async Task<ImportItemResponse> ImportItemExAsync(ImportItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportItemResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出资源
         * Summary: 导出资源
         */
        public ExportItemResponse ExportItem(ExportItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportItemEx(request, headers, runtime);
        }

        /**
         * Description: 导出资源
         * Summary: 导出资源
         */
        public async Task<ExportItemResponse> ExportItemAsync(ExportItemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportItemExAsync(request, headers, runtime);
        }

        /**
         * Description: 导出资源
         * Summary: 导出资源
         */
        public ExportItemResponse ExportItemEx(ExportItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportItemResponse>(DoRequest("1.0", "antcloud.cmdb.item.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出资源
         * Summary: 导出资源
         */
        public async Task<ExportItemResponse> ExportItemExAsync(ExportItemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportItemResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.item.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个模型关联
         * Summary: 获取单个模型关联
         */
        public GetModelrelationshipResponse GetModelrelationship(GetModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetModelrelationshipEx(request, headers, runtime);
        }

        /**
         * Description: 获取单个模型关联
         * Summary: 获取单个模型关联
         */
        public async Task<GetModelrelationshipResponse> GetModelrelationshipAsync(GetModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetModelrelationshipExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取单个模型关联
         * Summary: 获取单个模型关联
         */
        public GetModelrelationshipResponse GetModelrelationshipEx(GetModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetModelrelationshipResponse>(DoRequest("1.0", "antcloud.cmdb.modelrelationship.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取单个模型关联
         * Summary: 获取单个模型关联
         */
        public async Task<GetModelrelationshipResponse> GetModelrelationshipExAsync(GetModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetModelrelationshipResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelrelationship.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型关联
         * Summary: 查询模型关联
         */
        public QueryModelrelationshipResponse QueryModelrelationship(QueryModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryModelrelationshipEx(request, headers, runtime);
        }

        /**
         * Description: 查询模型关联
         * Summary: 查询模型关联
         */
        public async Task<QueryModelrelationshipResponse> QueryModelrelationshipAsync(QueryModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryModelrelationshipExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询模型关联
         * Summary: 查询模型关联
         */
        public QueryModelrelationshipResponse QueryModelrelationshipEx(QueryModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelrelationshipResponse>(DoRequest("1.0", "antcloud.cmdb.modelrelationship.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询模型关联
         * Summary: 查询模型关联
         */
        public async Task<QueryModelrelationshipResponse> QueryModelrelationshipExAsync(QueryModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryModelrelationshipResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelrelationship.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模型关联
         * Summary: 创建模型关联
         */
        public CreateModelrelationshipResponse CreateModelrelationship(CreateModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateModelrelationshipEx(request, headers, runtime);
        }

        /**
         * Description: 创建模型关联
         * Summary: 创建模型关联
         */
        public async Task<CreateModelrelationshipResponse> CreateModelrelationshipAsync(CreateModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateModelrelationshipExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建模型关联
         * Summary: 创建模型关联
         */
        public CreateModelrelationshipResponse CreateModelrelationshipEx(CreateModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateModelrelationshipResponse>(DoRequest("1.0", "antcloud.cmdb.modelrelationship.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建模型关联
         * Summary: 创建模型关联
         */
        public async Task<CreateModelrelationshipResponse> CreateModelrelationshipExAsync(CreateModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateModelrelationshipResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelrelationship.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型关联
         * Summary: 更新模型关联
         */
        public UpdateModelrelationshipResponse UpdateModelrelationship(UpdateModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateModelrelationshipEx(request, headers, runtime);
        }

        /**
         * Description: 更新模型关联
         * Summary: 更新模型关联
         */
        public async Task<UpdateModelrelationshipResponse> UpdateModelrelationshipAsync(UpdateModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateModelrelationshipExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新模型关联
         * Summary: 更新模型关联
         */
        public UpdateModelrelationshipResponse UpdateModelrelationshipEx(UpdateModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateModelrelationshipResponse>(DoRequest("1.0", "antcloud.cmdb.modelrelationship.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新模型关联
         * Summary: 更新模型关联
         */
        public async Task<UpdateModelrelationshipResponse> UpdateModelrelationshipExAsync(UpdateModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateModelrelationshipResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelrelationship.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型关联
         * Summary: 删除模型关联
         */
        public DeleteModelrelationshipResponse DeleteModelrelationship(DeleteModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteModelrelationshipEx(request, headers, runtime);
        }

        /**
         * Description: 删除模型关联
         * Summary: 删除模型关联
         */
        public async Task<DeleteModelrelationshipResponse> DeleteModelrelationshipAsync(DeleteModelrelationshipRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteModelrelationshipExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除模型关联
         * Summary: 删除模型关联
         */
        public DeleteModelrelationshipResponse DeleteModelrelationshipEx(DeleteModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteModelrelationshipResponse>(DoRequest("1.0", "antcloud.cmdb.modelrelationship.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除模型关联
         * Summary: 删除模型关联
         */
        public async Task<DeleteModelrelationshipResponse> DeleteModelrelationshipExAsync(DeleteModelrelationshipRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteModelrelationshipResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.modelrelationship.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拉取当前环境的参数表
         * Summary: 拉取当前环境的参数表
         */
        public PullParamResponse PullParam(PullParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullParamEx(request, headers, runtime);
        }

        /**
         * Description: 拉取当前环境的参数表
         * Summary: 拉取当前环境的参数表
         */
        public async Task<PullParamResponse> PullParamAsync(PullParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullParamExAsync(request, headers, runtime);
        }

        /**
         * Description: 拉取当前环境的参数表
         * Summary: 拉取当前环境的参数表
         */
        public PullParamResponse PullParamEx(PullParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullParamResponse>(DoRequest("1.0", "antcloud.cmdb.param.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 拉取当前环境的参数表
         * Summary: 拉取当前环境的参数表
         */
        public async Task<PullParamResponse> PullParamExAsync(PullParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullParamResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.param.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新配置信息
         * Summary: 更新配置信息
         */
        public PushParamResponse PushParam(PushParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushParamEx(request, headers, runtime);
        }

        /**
         * Description: 更新配置信息
         * Summary: 更新配置信息
         */
        public async Task<PushParamResponse> PushParamAsync(PushParamRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushParamExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新配置信息
         * Summary: 更新配置信息
         */
        public PushParamResponse PushParamEx(PushParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushParamResponse>(DoRequest("1.0", "antcloud.cmdb.param.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新配置信息
         * Summary: 更新配置信息
         */
        public async Task<PushParamResponse> PushParamExAsync(PushParamRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushParamResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.param.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建字段组
         * Summary: 创建字段组
         */
        public CreateAttributegroupResponse CreateAttributegroup(CreateAttributegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAttributegroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建字段组
         * Summary: 创建字段组
         */
        public async Task<CreateAttributegroupResponse> CreateAttributegroupAsync(CreateAttributegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAttributegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建字段组
         * Summary: 创建字段组
         */
        public CreateAttributegroupResponse CreateAttributegroupEx(CreateAttributegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAttributegroupResponse>(DoRequest("1.0", "antcloud.cmdb.attributegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建字段组
         * Summary: 创建字段组
         */
        public async Task<CreateAttributegroupResponse> CreateAttributegroupExAsync(CreateAttributegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAttributegroupResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.attributegroup.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询字段组
         * Summary: 查询字段组
         */
        public QueryAttributegroupResponse QueryAttributegroup(QueryAttributegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAttributegroupEx(request, headers, runtime);
        }

        /**
         * Description: 查询字段组
         * Summary: 查询字段组
         */
        public async Task<QueryAttributegroupResponse> QueryAttributegroupAsync(QueryAttributegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAttributegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询字段组
         * Summary: 查询字段组
         */
        public QueryAttributegroupResponse QueryAttributegroupEx(QueryAttributegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAttributegroupResponse>(DoRequest("1.0", "antcloud.cmdb.attributegroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询字段组
         * Summary: 查询字段组
         */
        public async Task<QueryAttributegroupResponse> QueryAttributegroupExAsync(QueryAttributegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAttributegroupResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.attributegroup.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除字段组
         * Summary: 删除字段组
         */
        public DeleteAttributegroupResponse DeleteAttributegroup(DeleteAttributegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAttributegroupEx(request, headers, runtime);
        }

        /**
         * Description: 删除字段组
         * Summary: 删除字段组
         */
        public async Task<DeleteAttributegroupResponse> DeleteAttributegroupAsync(DeleteAttributegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAttributegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除字段组
         * Summary: 删除字段组
         */
        public DeleteAttributegroupResponse DeleteAttributegroupEx(DeleteAttributegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAttributegroupResponse>(DoRequest("1.0", "antcloud.cmdb.attributegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除字段组
         * Summary: 删除字段组
         */
        public async Task<DeleteAttributegroupResponse> DeleteAttributegroupExAsync(DeleteAttributegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAttributegroupResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.attributegroup.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新字段组
         * Summary: 更新字段组
         */
        public UpdateAttributegroupResponse UpdateAttributegroup(UpdateAttributegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAttributegroupEx(request, headers, runtime);
        }

        /**
         * Description: 更新字段组
         * Summary: 更新字段组
         */
        public async Task<UpdateAttributegroupResponse> UpdateAttributegroupAsync(UpdateAttributegroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAttributegroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新字段组
         * Summary: 更新字段组
         */
        public UpdateAttributegroupResponse UpdateAttributegroupEx(UpdateAttributegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAttributegroupResponse>(DoRequest("1.0", "antcloud.cmdb.attributegroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新字段组
         * Summary: 更新字段组
         */
        public async Task<UpdateAttributegroupResponse> UpdateAttributegroupExAsync(UpdateAttributegroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAttributegroupResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.attributegroup.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 审计日志查询
         * Summary: 审计日志查询
         */
        public QueryAuditlogResponse QueryAuditlog(QueryAuditlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAuditlogEx(request, headers, runtime);
        }

        /**
         * Description: 审计日志查询
         * Summary: 审计日志查询
         */
        public async Task<QueryAuditlogResponse> QueryAuditlogAsync(QueryAuditlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAuditlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 审计日志查询
         * Summary: 审计日志查询
         */
        public QueryAuditlogResponse QueryAuditlogEx(QueryAuditlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditlogResponse>(DoRequest("1.0", "antcloud.cmdb.auditlog.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 审计日志查询
         * Summary: 审计日志查询
         */
        public async Task<QueryAuditlogResponse> QueryAuditlogExAsync(QueryAuditlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAuditlogResponse>(await DoRequestAsync("1.0", "antcloud.cmdb.auditlog.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
