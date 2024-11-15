// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.ACOPM.Models;

namespace AntChain.SDK.ACOPM
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
                        {"sdk_version", "1.3.39"},
                        {"_prod_code", "ACOPM"},
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
                        {"sdk_version", "1.3.39"},
                        {"_prod_code", "ACOPM"},
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
         * Description: 获取产品列表
         * Summary: 获取产品列表
         */
        public ListProductResponse ListProduct(ListProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListProductEx(request, headers, runtime);
        }

        /**
         * Description: 获取产品列表
         * Summary: 获取产品列表
         */
        public async Task<ListProductResponse> ListProductAsync(ListProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取产品列表
         * Summary: 获取产品列表
         */
        public ListProductResponse ListProductEx(ListProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListProductResponse>(DoRequest("1.0", "antcloud.acopm.product.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取产品列表
         * Summary: 获取产品列表
         */
        public async Task<ListProductResponse> ListProductExAsync(ListProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListProductResponse>(await DoRequestAsync("1.0", "antcloud.acopm.product.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云Tea多语言SDK生成回调
         * Summary: 阿里云Tea多语言SDK生成回调
         */
        public CallbackMultisdkResponse CallbackMultisdk(CallbackMultisdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackMultisdkEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云Tea多语言SDK生成回调
         * Summary: 阿里云Tea多语言SDK生成回调
         */
        public async Task<CallbackMultisdkResponse> CallbackMultisdkAsync(CallbackMultisdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackMultisdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云Tea多语言SDK生成回调
         * Summary: 阿里云Tea多语言SDK生成回调
         */
        public CallbackMultisdkResponse CallbackMultisdkEx(CallbackMultisdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackMultisdkResponse>(DoRequest("1.0", "antcloud.acopm.multisdk.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云Tea多语言SDK生成回调
         * Summary: 阿里云Tea多语言SDK生成回调
         */
        public async Task<CallbackMultisdkResponse> CallbackMultisdkExAsync(CallbackMultisdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackMultisdkResponse>(await DoRequestAsync("1.0", "antcloud.acopm.multisdk.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建产品
         * Summary: 创建产品
         */
        public CreateProductResponse CreateProduct(CreateProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateProductEx(request, headers, runtime);
        }

        /**
         * Description: 创建产品
         * Summary: 创建产品
         */
        public async Task<CreateProductResponse> CreateProductAsync(CreateProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建产品
         * Summary: 创建产品
         */
        public CreateProductResponse CreateProductEx(CreateProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProductResponse>(DoRequest("1.0", "antcloud.acopm.product.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建产品
         * Summary: 创建产品
         */
        public async Task<CreateProductResponse> CreateProductExAsync(CreateProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateProductResponse>(await DoRequestAsync("1.0", "antcloud.acopm.product.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api初始化
         * Summary: api初始化
         */
        public InitProductResponse InitProduct(InitProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitProductEx(request, headers, runtime);
        }

        /**
         * Description: api初始化
         * Summary: api初始化
         */
        public async Task<InitProductResponse> InitProductAsync(InitProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitProductExAsync(request, headers, runtime);
        }

        /**
         * Description: api初始化
         * Summary: api初始化
         */
        public InitProductResponse InitProductEx(InitProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitProductResponse>(DoRequest("1.0", "antcloud.acopm.product.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api初始化
         * Summary: api初始化
         */
        public async Task<InitProductResponse> InitProductExAsync(InitProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitProductResponse>(await DoRequestAsync("1.0", "antcloud.acopm.product.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除产品
         * Summary: 删除产品
         */
        public DeleteProductResponse DeleteProduct(DeleteProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteProductEx(request, headers, runtime);
        }

        /**
         * Description: 删除产品
         * Summary: 删除产品
         */
        public async Task<DeleteProductResponse> DeleteProductAsync(DeleteProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除产品
         * Summary: 删除产品
         */
        public DeleteProductResponse DeleteProductEx(DeleteProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteProductResponse>(DoRequest("1.0", "antcloud.acopm.product.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除产品
         * Summary: 删除产品
         */
        public async Task<DeleteProductResponse> DeleteProductExAsync(DeleteProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteProductResponse>(await DoRequestAsync("1.0", "antcloud.acopm.product.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布sdk
         * Summary: 发布sdk
         */
        public PublishProductSdkResponse PublishProductSdk(PublishProductSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishProductSdkEx(request, headers, runtime);
        }

        /**
         * Description: 发布sdk
         * Summary: 发布sdk
         */
        public async Task<PublishProductSdkResponse> PublishProductSdkAsync(PublishProductSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishProductSdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布sdk
         * Summary: 发布sdk
         */
        public PublishProductSdkResponse PublishProductSdkEx(PublishProductSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishProductSdkResponse>(DoRequest("1.0", "antcloud.acopm.product.sdk.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布sdk
         * Summary: 发布sdk
         */
        public async Task<PublishProductSdkResponse> PublishProductSdkExAsync(PublishProductSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishProductSdkResponse>(await DoRequestAsync("1.0", "antcloud.acopm.product.sdk.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sdk元数据snapshot
         * Summary: 获取sdk元数据snapshot
         */
        public GetSdkResponse GetSdk(GetSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSdkEx(request, headers, runtime);
        }

        /**
         * Description: 获取sdk元数据snapshot
         * Summary: 获取sdk元数据snapshot
         */
        public async Task<GetSdkResponse> GetSdkAsync(GetSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取sdk元数据snapshot
         * Summary: 获取sdk元数据snapshot
         */
        public GetSdkResponse GetSdkEx(GetSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSdkResponse>(DoRequest("1.0", "antcloud.acopm.sdk.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取sdk元数据snapshot
         * Summary: 获取sdk元数据snapshot
         */
        public async Task<GetSdkResponse> GetSdkExAsync(GetSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSdkResponse>(await DoRequestAsync("1.0", "antcloud.acopm.sdk.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布共享能力中心sdk
         * Summary: 共享能力中心sdk发布
         */
        public PublishProductSaassdkResponse PublishProductSaassdk(PublishProductSaassdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PublishProductSaassdkEx(request, headers, runtime);
        }

        /**
         * Description: 发布共享能力中心sdk
         * Summary: 共享能力中心sdk发布
         */
        public async Task<PublishProductSaassdkResponse> PublishProductSaassdkAsync(PublishProductSaassdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PublishProductSaassdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 发布共享能力中心sdk
         * Summary: 共享能力中心sdk发布
         */
        public PublishProductSaassdkResponse PublishProductSaassdkEx(PublishProductSaassdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishProductSaassdkResponse>(DoRequest("1.0", "antcloud.acopm.product.saassdk.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发布共享能力中心sdk
         * Summary: 共享能力中心sdk发布
         */
        public async Task<PublishProductSaassdkResponse> PublishProductSaassdkExAsync(PublishProductSaassdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PublishProductSaassdkResponse>(await DoRequestAsync("1.0", "antcloud.acopm.product.saassdk.publish", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力中心获取sdk打包结果
         * Summary: 共享能力中心获取sdk打包结果
         */
        public GetProductSaassdkResponse GetProductSaassdk(GetProductSaassdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetProductSaassdkEx(request, headers, runtime);
        }

        /**
         * Description: 共享能力中心获取sdk打包结果
         * Summary: 共享能力中心获取sdk打包结果
         */
        public async Task<GetProductSaassdkResponse> GetProductSaassdkAsync(GetProductSaassdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetProductSaassdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 共享能力中心获取sdk打包结果
         * Summary: 共享能力中心获取sdk打包结果
         */
        public GetProductSaassdkResponse GetProductSaassdkEx(GetProductSaassdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetProductSaassdkResponse>(DoRequest("1.0", "antcloud.acopm.product.saassdk.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 共享能力中心获取sdk打包结果
         * Summary: 共享能力中心获取sdk打包结果
         */
        public async Task<GetProductSaassdkResponse> GetProductSaassdkExAsync(GetProductSaassdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetProductSaassdkResponse>(await DoRequestAsync("1.0", "antcloud.acopm.product.saassdk.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步产品成员权限
         * Summary: 同步产品成员权限
         */
        public AddProductMemberResponse AddProductMember(AddProductMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddProductMemberEx(request, headers, runtime);
        }

        /**
         * Description: 同步产品成员权限
         * Summary: 同步产品成员权限
         */
        public async Task<AddProductMemberResponse> AddProductMemberAsync(AddProductMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddProductMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 同步产品成员权限
         * Summary: 同步产品成员权限
         */
        public AddProductMemberResponse AddProductMemberEx(AddProductMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddProductMemberResponse>(DoRequest("1.0", "antcloud.acopm.product.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 同步产品成员权限
         * Summary: 同步产品成员权限
         */
        public async Task<AddProductMemberResponse> AddProductMemberExAsync(AddProductMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddProductMemberResponse>(await DoRequestAsync("1.0", "antcloud.acopm.product.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api限流信息
         * Summary: 查询api限流信息（api）
         */
        public QueryApiRatelimitResponse QueryApiRatelimit(QueryApiRatelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiRatelimitEx(request, headers, runtime);
        }

        /**
         * Description: 查询api限流信息
         * Summary: 查询api限流信息（api）
         */
        public async Task<QueryApiRatelimitResponse> QueryApiRatelimitAsync(QueryApiRatelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiRatelimitExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询api限流信息
         * Summary: 查询api限流信息（api）
         */
        public QueryApiRatelimitResponse QueryApiRatelimitEx(QueryApiRatelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiRatelimitResponse>(DoRequest("1.0", "antcloud.acopm.api.ratelimit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api限流信息
         * Summary: 查询api限流信息（api）
         */
        public async Task<QueryApiRatelimitResponse> QueryApiRatelimitExAsync(QueryApiRatelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiRatelimitResponse>(await DoRequestAsync("1.0", "antcloud.acopm.api.ratelimit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询api限流信息
         * Summary:  查询api限流信息（租户维度）
         */
        public QueryTenantRatelimitResponse QueryTenantRatelimit(QueryTenantRatelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTenantRatelimitEx(request, headers, runtime);
        }

        /**
         * Description:  查询api限流信息
         * Summary:  查询api限流信息（租户维度）
         */
        public async Task<QueryTenantRatelimitResponse> QueryTenantRatelimitAsync(QueryTenantRatelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTenantRatelimitExAsync(request, headers, runtime);
        }

        /**
         * Description:  查询api限流信息
         * Summary:  查询api限流信息（租户维度）
         */
        public QueryTenantRatelimitResponse QueryTenantRatelimitEx(QueryTenantRatelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantRatelimitResponse>(DoRequest("1.0", "antcloud.acopm.tenant.ratelimit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description:  查询api限流信息
         * Summary:  查询api限流信息（租户维度）
         */
        public async Task<QueryTenantRatelimitResponse> QueryTenantRatelimitExAsync(QueryTenantRatelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantRatelimitResponse>(await DoRequestAsync("1.0", "antcloud.acopm.tenant.ratelimit.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api限流更新
         * Summary: api限流更新（api维度）
         */
        public UpdateApiRatelimitResponse UpdateApiRatelimit(UpdateApiRatelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApiRatelimitEx(request, headers, runtime);
        }

        /**
         * Description: api限流更新
         * Summary: api限流更新（api维度）
         */
        public async Task<UpdateApiRatelimitResponse> UpdateApiRatelimitAsync(UpdateApiRatelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApiRatelimitExAsync(request, headers, runtime);
        }

        /**
         * Description: api限流更新
         * Summary: api限流更新（api维度）
         */
        public UpdateApiRatelimitResponse UpdateApiRatelimitEx(UpdateApiRatelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiRatelimitResponse>(DoRequest("1.0", "antcloud.acopm.api.ratelimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api限流更新
         * Summary: api限流更新（api维度）
         */
        public async Task<UpdateApiRatelimitResponse> UpdateApiRatelimitExAsync(UpdateApiRatelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApiRatelimitResponse>(await DoRequestAsync("1.0", "antcloud.acopm.api.ratelimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api限流更新
         * Summary: api限流更新（租户维度）
         */
        public UpdateTenantRatelimitResponse UpdateTenantRatelimit(UpdateTenantRatelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateTenantRatelimitEx(request, headers, runtime);
        }

        /**
         * Description: api限流更新
         * Summary: api限流更新（租户维度）
         */
        public async Task<UpdateTenantRatelimitResponse> UpdateTenantRatelimitAsync(UpdateTenantRatelimitRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateTenantRatelimitExAsync(request, headers, runtime);
        }

        /**
         * Description: api限流更新
         * Summary: api限流更新（租户维度）
         */
        public UpdateTenantRatelimitResponse UpdateTenantRatelimitEx(UpdateTenantRatelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTenantRatelimitResponse>(DoRequest("1.0", "antcloud.acopm.tenant.ratelimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api限流更新
         * Summary: api限流更新（租户维度）
         */
        public async Task<UpdateTenantRatelimitResponse> UpdateTenantRatelimitExAsync(UpdateTenantRatelimitRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateTenantRatelimitResponse>(await DoRequestAsync("1.0", "antcloud.acopm.tenant.ratelimit.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 九州工单回调接口
         * Summary: 九州工单回调接口
         */
        public CallbackJiuzhouPlanResponse CallbackJiuzhouPlan(CallbackJiuzhouPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CallbackJiuzhouPlanEx(request, headers, runtime);
        }

        /**
         * Description: 九州工单回调接口
         * Summary: 九州工单回调接口
         */
        public async Task<CallbackJiuzhouPlanResponse> CallbackJiuzhouPlanAsync(CallbackJiuzhouPlanRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CallbackJiuzhouPlanExAsync(request, headers, runtime);
        }

        /**
         * Description: 九州工单回调接口
         * Summary: 九州工单回调接口
         */
        public CallbackJiuzhouPlanResponse CallbackJiuzhouPlanEx(CallbackJiuzhouPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackJiuzhouPlanResponse>(DoRequest("1.0", "antcloud.acopm.jiuzhou.plan.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 九州工单回调接口
         * Summary: 九州工单回调接口
         */
        public async Task<CallbackJiuzhouPlanResponse> CallbackJiuzhouPlanExAsync(CallbackJiuzhouPlanRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CallbackJiuzhouPlanResponse>(await DoRequestAsync("1.0", "antcloud.acopm.jiuzhou.plan.callback", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智能排障机器人接口
         * Summary: 排障机器人接口
         */
        public ExecRobotIntelligentResponse ExecRobotIntelligent(ExecRobotIntelligentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecRobotIntelligentEx(request, headers, runtime);
        }

        /**
         * Description: 智能排障机器人接口
         * Summary: 排障机器人接口
         */
        public async Task<ExecRobotIntelligentResponse> ExecRobotIntelligentAsync(ExecRobotIntelligentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecRobotIntelligentExAsync(request, headers, runtime);
        }

        /**
         * Description: 智能排障机器人接口
         * Summary: 排障机器人接口
         */
        public ExecRobotIntelligentResponse ExecRobotIntelligentEx(ExecRobotIntelligentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRobotIntelligentResponse>(DoRequest("1.0", "antcloud.acopm.robot.intelligent.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智能排障机器人接口
         * Summary: 排障机器人接口
         */
        public async Task<ExecRobotIntelligentResponse> ExecRobotIntelligentExAsync(ExecRobotIntelligentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRobotIntelligentResponse>(await DoRequestAsync("1.0", "antcloud.acopm.robot.intelligent.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生产环境api状态更新
         * Summary: 生产环境api状态更新
         */
        public UpdateApisStatusResponse UpdateApisStatus(UpdateApisStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateApisStatusEx(request, headers, runtime);
        }

        /**
         * Description: 生产环境api状态更新
         * Summary: 生产环境api状态更新
         */
        public async Task<UpdateApisStatusResponse> UpdateApisStatusAsync(UpdateApisStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateApisStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 生产环境api状态更新
         * Summary: 生产环境api状态更新
         */
        public UpdateApisStatusResponse UpdateApisStatusEx(UpdateApisStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApisStatusResponse>(DoRequest("1.0", "antcloud.acopm.apis.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生产环境api状态更新
         * Summary: 生产环境api状态更新
         */
        public async Task<UpdateApisStatusResponse> UpdateApisStatusExAsync(UpdateApisStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateApisStatusResponse>(await DoRequestAsync("1.0", "antcloud.acopm.apis.status.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商业产品sdk版本api信息
         * Summary: 查询商业产品sdk版本api信息
         */
        public QuerySdkApiResponse QuerySdkApi(QuerySdkApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySdkApiEx(request, headers, runtime);
        }

        /**
         * Description: 查询商业产品sdk版本api信息
         * Summary: 查询商业产品sdk版本api信息
         */
        public async Task<QuerySdkApiResponse> QuerySdkApiAsync(QuerySdkApiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySdkApiExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询商业产品sdk版本api信息
         * Summary: 查询商业产品sdk版本api信息
         */
        public QuerySdkApiResponse QuerySdkApiEx(QuerySdkApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySdkApiResponse>(DoRequest("1.0", "antcloud.acopm.sdk.api.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询商业产品sdk版本api信息
         * Summary: 查询商业产品sdk版本api信息
         */
        public async Task<QuerySdkApiResponse> QuerySdkApiExAsync(QuerySdkApiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySdkApiResponse>(await DoRequestAsync("1.0", "antcloud.acopm.sdk.api.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证排障
         * Summary: 企业认证排障
         */
        public ExecRobotBaasplusResponse ExecRobotBaasplus(ExecRobotBaasplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecRobotBaasplusEx(request, headers, runtime);
        }

        /**
         * Description: 企业认证排障
         * Summary: 企业认证排障
         */
        public async Task<ExecRobotBaasplusResponse> ExecRobotBaasplusAsync(ExecRobotBaasplusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecRobotBaasplusExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业认证排障
         * Summary: 企业认证排障
         */
        public ExecRobotBaasplusResponse ExecRobotBaasplusEx(ExecRobotBaasplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRobotBaasplusResponse>(DoRequest("1.0", "antcloud.acopm.robot.baasplus.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业认证排障
         * Summary: 企业认证排障
         */
        public async Task<ExecRobotBaasplusResponse> ExecRobotBaasplusExAsync(ExecRobotBaasplusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecRobotBaasplusResponse>(await DoRequestAsync("1.0", "antcloud.acopm.robot.baasplus.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api数据获取
         * Summary: api数据获取
         */
        public QueryApiDetailResponse QueryApiDetail(QueryApiDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiDetailEx(request, headers, runtime);
        }

        /**
         * Description: api数据获取
         * Summary: api数据获取
         */
        public async Task<QueryApiDetailResponse> QueryApiDetailAsync(QueryApiDetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiDetailExAsync(request, headers, runtime);
        }

        /**
         * Description: api数据获取
         * Summary: api数据获取
         */
        public QueryApiDetailResponse QueryApiDetailEx(QueryApiDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiDetailResponse>(DoRequest("1.0", "antcloud.acopm.api.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: api数据获取
         * Summary: api数据获取
         */
        public async Task<QueryApiDetailResponse> QueryApiDetailExAsync(QueryApiDetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiDetailResponse>(await DoRequestAsync("1.0", "antcloud.acopm.api.detail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api负责人信息
         * Summary: 查询api负责人信息
         */
        public QueryApiOwnerResponse QueryApiOwner(QueryApiOwnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiOwnerEx(request, headers, runtime);
        }

        /**
         * Description: 查询api负责人信息
         * Summary: 查询api负责人信息
         */
        public async Task<QueryApiOwnerResponse> QueryApiOwnerAsync(QueryApiOwnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiOwnerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询api负责人信息
         * Summary: 查询api负责人信息
         */
        public QueryApiOwnerResponse QueryApiOwnerEx(QueryApiOwnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiOwnerResponse>(DoRequest("1.0", "antcloud.acopm.api.owner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api负责人信息
         * Summary: 查询api负责人信息
         */
        public async Task<QueryApiOwnerResponse> QueryApiOwnerExAsync(QueryApiOwnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiOwnerResponse>(await DoRequestAsync("1.0", "antcloud.acopm.api.owner.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求刷新gw的缓存
         * Summary: 网关运行态gw cache刷新
         */
        public UpdateGwCacheResponse UpdateGwCache(UpdateGwCacheRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGwCacheEx(request, headers, runtime);
        }

        /**
         * Description: 请求刷新gw的缓存
         * Summary: 网关运行态gw cache刷新
         */
        public async Task<UpdateGwCacheResponse> UpdateGwCacheAsync(UpdateGwCacheRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGwCacheExAsync(request, headers, runtime);
        }

        /**
         * Description: 请求刷新gw的缓存
         * Summary: 网关运行态gw cache刷新
         */
        public UpdateGwCacheResponse UpdateGwCacheEx(UpdateGwCacheRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGwCacheResponse>(DoRequest("1.0", "antcloud.acopm.gw.cache.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求刷新gw的缓存
         * Summary: 网关运行态gw cache刷新
         */
        public async Task<UpdateGwCacheResponse> UpdateGwCacheExAsync(UpdateGwCacheRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGwCacheResponse>(await DoRequestAsync("1.0", "antcloud.acopm.gw.cache.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商业化规则创建
         * Summary: 商业化规则创建
         */
        public CreateBusinessruleOperateResponse CreateBusinessruleOperate(CreateBusinessruleOperateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBusinessruleOperateEx(request, headers, runtime);
        }

        /**
         * Description: 商业化规则创建
         * Summary: 商业化规则创建
         */
        public async Task<CreateBusinessruleOperateResponse> CreateBusinessruleOperateAsync(CreateBusinessruleOperateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBusinessruleOperateExAsync(request, headers, runtime);
        }

        /**
         * Description: 商业化规则创建
         * Summary: 商业化规则创建
         */
        public CreateBusinessruleOperateResponse CreateBusinessruleOperateEx(CreateBusinessruleOperateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBusinessruleOperateResponse>(DoRequest("1.0", "antcloud.acopm.businessrule.operate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 商业化规则创建
         * Summary: 商业化规则创建
         */
        public async Task<CreateBusinessruleOperateResponse> CreateBusinessruleOperateExAsync(CreateBusinessruleOperateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBusinessruleOperateResponse>(await DoRequestAsync("1.0", "antcloud.acopm.businessrule.operate.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生效商业化规则
         * Summary: 生效商业化规则
         */
        public EnableBusinessruleOperateResponse EnableBusinessruleOperate(EnableBusinessruleOperateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return EnableBusinessruleOperateEx(request, headers, runtime);
        }

        /**
         * Description: 生效商业化规则
         * Summary: 生效商业化规则
         */
        public async Task<EnableBusinessruleOperateResponse> EnableBusinessruleOperateAsync(EnableBusinessruleOperateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await EnableBusinessruleOperateExAsync(request, headers, runtime);
        }

        /**
         * Description: 生效商业化规则
         * Summary: 生效商业化规则
         */
        public EnableBusinessruleOperateResponse EnableBusinessruleOperateEx(EnableBusinessruleOperateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableBusinessruleOperateResponse>(DoRequest("1.0", "antcloud.acopm.businessrule.operate.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生效商业化规则
         * Summary: 生效商业化规则
         */
        public async Task<EnableBusinessruleOperateResponse> EnableBusinessruleOperateExAsync(EnableBusinessruleOperateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<EnableBusinessruleOperateResponse>(await DoRequestAsync("1.0", "antcloud.acopm.businessrule.operate.enable", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询规则匹配情况
         * Summary: 查询规则匹配情况
         */
        public QueryBusinessruleMatchResponse QueryBusinessruleMatch(QueryBusinessruleMatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBusinessruleMatchEx(request, headers, runtime);
        }

        /**
         * Description: 查询规则匹配情况
         * Summary: 查询规则匹配情况
         */
        public async Task<QueryBusinessruleMatchResponse> QueryBusinessruleMatchAsync(QueryBusinessruleMatchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBusinessruleMatchExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询规则匹配情况
         * Summary: 查询规则匹配情况
         */
        public QueryBusinessruleMatchResponse QueryBusinessruleMatchEx(QueryBusinessruleMatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessruleMatchResponse>(DoRequest("1.0", "antcloud.acopm.businessrule.match.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询规则匹配情况
         * Summary: 查询规则匹配情况
         */
        public async Task<QueryBusinessruleMatchResponse> QueryBusinessruleMatchExAsync(QueryBusinessruleMatchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessruleMatchResponse>(await DoRequestAsync("1.0", "antcloud.acopm.businessrule.match.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前登录人有权限的服务列表
         * Summary: 查询当前登录人有权限的服务列表
         */
        public QueryBusinessruleServicesResponse QueryBusinessruleServices(QueryBusinessruleServicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBusinessruleServicesEx(request, headers, runtime);
        }

        /**
         * Description: 查询当前登录人有权限的服务列表
         * Summary: 查询当前登录人有权限的服务列表
         */
        public async Task<QueryBusinessruleServicesResponse> QueryBusinessruleServicesAsync(QueryBusinessruleServicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBusinessruleServicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询当前登录人有权限的服务列表
         * Summary: 查询当前登录人有权限的服务列表
         */
        public QueryBusinessruleServicesResponse QueryBusinessruleServicesEx(QueryBusinessruleServicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessruleServicesResponse>(DoRequest("1.0", "antcloud.acopm.businessrule.services.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询当前登录人有权限的服务列表
         * Summary: 查询当前登录人有权限的服务列表
         */
        public async Task<QueryBusinessruleServicesResponse> QueryBusinessruleServicesExAsync(QueryBusinessruleServicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBusinessruleServicesResponse>(await DoRequestAsync("1.0", "antcloud.acopm.businessrule.services.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个服务的参数/返回等元信息
         * Summary: 查询单个服务的参数/返回等元信息
         */
        public GetBusinessruleServicesResponse GetBusinessruleServices(GetBusinessruleServicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetBusinessruleServicesEx(request, headers, runtime);
        }

        /**
         * Description: 查询单个服务的参数/返回等元信息
         * Summary: 查询单个服务的参数/返回等元信息
         */
        public async Task<GetBusinessruleServicesResponse> GetBusinessruleServicesAsync(GetBusinessruleServicesRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetBusinessruleServicesExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询单个服务的参数/返回等元信息
         * Summary: 查询单个服务的参数/返回等元信息
         */
        public GetBusinessruleServicesResponse GetBusinessruleServicesEx(GetBusinessruleServicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBusinessruleServicesResponse>(DoRequest("1.0", "antcloud.acopm.businessrule.services.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个服务的参数/返回等元信息
         * Summary: 查询单个服务的参数/返回等元信息
         */
        public async Task<GetBusinessruleServicesResponse> GetBusinessruleServicesExAsync(GetBusinessruleServicesRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetBusinessruleServicesResponse>(await DoRequestAsync("1.0", "antcloud.acopm.businessrule.services.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实例更新
         * Summary: 实例更新
         */
        public UpdateInstanceResponse UpdateInstance(UpdateInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInstanceEx(request, headers, runtime);
        }

        /**
         * Description: 实例更新
         * Summary: 实例更新
         */
        public async Task<UpdateInstanceResponse> UpdateInstanceAsync(UpdateInstanceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInstanceExAsync(request, headers, runtime);
        }

        /**
         * Description: 实例更新
         * Summary: 实例更新
         */
        public UpdateInstanceResponse UpdateInstanceEx(UpdateInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInstanceResponse>(DoRequest("1.0", "antcloud.acopm.instance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 实例更新
         * Summary: 实例更新
         */
        public async Task<UpdateInstanceResponse> UpdateInstanceExAsync(UpdateInstanceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInstanceResponse>(await DoRequestAsync("1.0", "antcloud.acopm.instance.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户实例更新
         * Summary: 租户实例更新
         */
        public UpdateInstanceTenantResponse UpdateInstanceTenant(UpdateInstanceTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateInstanceTenantEx(request, headers, runtime);
        }

        /**
         * Description: 租户实例更新
         * Summary: 租户实例更新
         */
        public async Task<UpdateInstanceTenantResponse> UpdateInstanceTenantAsync(UpdateInstanceTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateInstanceTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 租户实例更新
         * Summary: 租户实例更新
         */
        public UpdateInstanceTenantResponse UpdateInstanceTenantEx(UpdateInstanceTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInstanceTenantResponse>(DoRequest("1.0", "antcloud.acopm.instance.tenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户实例更新
         * Summary: 租户实例更新
         */
        public async Task<UpdateInstanceTenantResponse> UpdateInstanceTenantExAsync(UpdateInstanceTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateInstanceTenantResponse>(await DoRequestAsync("1.0", "antcloud.acopm.instance.tenant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
