// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.OP.Models;

namespace AntChain.SDK.OP
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
                        {"sdk_version", "3.2.3"},
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
                        {"sdk_version", "3.2.3"},
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
         * Description: 查询api详情
         * Summary: 查询api
         */
        public QueryApiserviceResponse QueryApiservice(QueryApiserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiserviceEx(request, headers, runtime);
        }

        /**
         * Description: 查询api详情
         * Summary: 查询api
         */
        public async Task<QueryApiserviceResponse> QueryApiserviceAsync(QueryApiserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询api详情
         * Summary: 查询api
         */
        public QueryApiserviceResponse QueryApiserviceEx(QueryApiserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiserviceResponse>(DoRequest("1.0", "antcloud.openapi.apiservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询api详情
         * Summary: 查询api
         */
        public async Task<QueryApiserviceResponse> QueryApiserviceExAsync(QueryApiserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiserviceResponse>(await DoRequestAsync("1.0", "antcloud.openapi.apiservice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入api信息
         * Summary: 导入api信息
         */
        public ImportApiserviceResponse ImportApiservice(ImportApiserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportApiserviceEx(request, headers, runtime);
        }

        /**
         * Description: 导入api信息
         * Summary: 导入api信息
         */
        public async Task<ImportApiserviceResponse> ImportApiserviceAsync(ImportApiserviceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportApiserviceExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入api信息
         * Summary: 导入api信息
         */
        public ImportApiserviceResponse ImportApiserviceEx(ImportApiserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportApiserviceResponse>(DoRequest("1.0", "antcloud.openapi.apiservice.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入api信息
         * Summary: 导入api信息
         */
        public async Task<ImportApiserviceResponse> ImportApiserviceExAsync(ImportApiserviceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportApiserviceResponse>(await DoRequestAsync("1.0", "antcloud.openapi.apiservice.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用apicore创建产品
         * Summary: 创建产品
         */
        public CreateApiserviceProductResponse CreateApiserviceProduct(CreateApiserviceProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApiserviceProductEx(request, headers, runtime);
        }

        /**
         * Description: 调用apicore创建产品
         * Summary: 创建产品
         */
        public async Task<CreateApiserviceProductResponse> CreateApiserviceProductAsync(CreateApiserviceProductRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApiserviceProductExAsync(request, headers, runtime);
        }

        /**
         * Description: 调用apicore创建产品
         * Summary: 创建产品
         */
        public CreateApiserviceProductResponse CreateApiserviceProductEx(CreateApiserviceProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiserviceProductResponse>(DoRequest("1.0", "antcloud.openapi.apiservice.product.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 调用apicore创建产品
         * Summary: 创建产品
         */
        public async Task<CreateApiserviceProductResponse> CreateApiserviceProductExAsync(CreateApiserviceProductRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiserviceProductResponse>(await DoRequestAsync("1.0", "antcloud.openapi.apiservice.product.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建分组
         * Summary: 创建分组
         */
        public CreateApiserviceGroupResponse CreateApiserviceGroup(CreateApiserviceGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApiserviceGroupEx(request, headers, runtime);
        }

        /**
         * Description: 创建分组
         * Summary: 创建分组
         */
        public async Task<CreateApiserviceGroupResponse> CreateApiserviceGroupAsync(CreateApiserviceGroupRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApiserviceGroupExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建分组
         * Summary: 创建分组
         */
        public CreateApiserviceGroupResponse CreateApiserviceGroupEx(CreateApiserviceGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiserviceGroupResponse>(DoRequest("1.0", "antcloud.openapi.apiservice.group.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建分组
         * Summary: 创建分组
         */
        public async Task<CreateApiserviceGroupResponse> CreateApiserviceGroupExAsync(CreateApiserviceGroupRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiserviceGroupResponse>(await DoRequestAsync("1.0", "antcloud.openapi.apiservice.group.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建suite
         * Summary: 创建suite
         */
        public CreateApiserviceSuiteResponse CreateApiserviceSuite(CreateApiserviceSuiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApiserviceSuiteEx(request, headers, runtime);
        }

        /**
         * Description: 创建suite
         * Summary: 创建suite
         */
        public async Task<CreateApiserviceSuiteResponse> CreateApiserviceSuiteAsync(CreateApiserviceSuiteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApiserviceSuiteExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建suite
         * Summary: 创建suite
         */
        public CreateApiserviceSuiteResponse CreateApiserviceSuiteEx(CreateApiserviceSuiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiserviceSuiteResponse>(DoRequest("1.0", "antcloud.openapi.apiservice.suite.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建suite
         * Summary: 创建suite
         */
        public async Task<CreateApiserviceSuiteResponse> CreateApiserviceSuiteExAsync(CreateApiserviceSuiteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiserviceSuiteResponse>(await DoRequestAsync("1.0", "antcloud.openapi.apiservice.suite.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过XML Spec形式导入产品的API配置
         * Summary: 导入API配置
         */
        public ImportSpecResponse ImportSpec(ImportSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportSpecEx(request, headers, runtime);
        }

        /**
         * Description: 通过XML Spec形式导入产品的API配置
         * Summary: 导入API配置
         */
        public async Task<ImportSpecResponse> ImportSpecAsync(ImportSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过XML Spec形式导入产品的API配置
         * Summary: 导入API配置
         */
        public ImportSpecResponse ImportSpecEx(ImportSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSpecResponse>(DoRequest("1.0", "antcloud.openapi.spec.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过XML Spec形式导入产品的API配置
         * Summary: 导入API配置
         */
        public async Task<ImportSpecResponse> ImportSpecExAsync(ImportSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSpecResponse>(await DoRequestAsync("1.0", "antcloud.openapi.spec.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出Spec
         * Summary: 导出Spec
         */
        public ExportSpecResponse ExportSpec(ExportSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExportSpecEx(request, headers, runtime);
        }

        /**
         * Description: 导出Spec
         * Summary: 导出Spec
         */
        public async Task<ExportSpecResponse> ExportSpecAsync(ExportSpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExportSpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 导出Spec
         * Summary: 导出Spec
         */
        public ExportSpecResponse ExportSpecEx(ExportSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSpecResponse>(DoRequest("1.0", "antcloud.openapi.spec.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导出Spec
         * Summary: 导出Spec
         */
        public async Task<ExportSpecResponse> ExportSpecExAsync(ExportSpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExportSpecResponse>(await DoRequestAsync("1.0", "antcloud.openapi.spec.export", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取OpenAPI提供方详情
         * Summary: 获取OpenAPI提供方详情
         */
        public GetProviderResponse GetProvider(GetProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetProviderEx(request, headers, runtime);
        }

        /**
         * Description: 获取OpenAPI提供方详情
         * Summary: 获取OpenAPI提供方详情
         */
        public async Task<GetProviderResponse> GetProviderAsync(GetProviderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetProviderExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取OpenAPI提供方详情
         * Summary: 获取OpenAPI提供方详情
         */
        public GetProviderResponse GetProviderEx(GetProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetProviderResponse>(DoRequest("1.0", "antcloud.openapi.provider.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取OpenAPI提供方详情
         * Summary: 获取OpenAPI提供方详情
         */
        public async Task<GetProviderResponse> GetProviderExAsync(GetProviderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetProviderResponse>(await DoRequestAsync("1.0", "antcloud.openapi.provider.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渠道API导入
         * Summary: 渠道API导入
         */
        public ImportChannelapiResponse ImportChannelapi(ImportChannelapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportChannelapiEx(request, headers, runtime);
        }

        /**
         * Description: 渠道API导入
         * Summary: 渠道API导入
         */
        public async Task<ImportChannelapiResponse> ImportChannelapiAsync(ImportChannelapiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportChannelapiExAsync(request, headers, runtime);
        }

        /**
         * Description: 渠道API导入
         * Summary: 渠道API导入
         */
        public ImportChannelapiResponse ImportChannelapiEx(ImportChannelapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportChannelapiResponse>(DoRequest("1.0", "antcloud.openapi.channelapi.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 渠道API导入
         * Summary: 渠道API导入
         */
        public async Task<ImportChannelapiResponse> ImportChannelapiExAsync(ImportChannelapiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportChannelapiResponse>(await DoRequestAsync("1.0", "antcloud.openapi.channelapi.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检测金融云网关目前的健康状态
         * Summary: 网关健康检查1
         */
        public ServiceGatewayCheckResponse ServiceGatewayCheck(ServiceGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ServiceGatewayCheckEx(request, headers, runtime);
        }

        /**
         * Description: 检测金融云网关目前的健康状态
         * Summary: 网关健康检查1
         */
        public async Task<ServiceGatewayCheckResponse> ServiceGatewayCheckAsync(ServiceGatewayCheckRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ServiceGatewayCheckExAsync(request, headers, runtime);
        }

        /**
         * Description: 检测金融云网关目前的健康状态
         * Summary: 网关健康检查1
         */
        public ServiceGatewayCheckResponse ServiceGatewayCheckEx(ServiceGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ServiceGatewayCheckResponse>(DoRequest("1.0", "antcloud.openapi.gateway.check.service", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检测金融云网关目前的健康状态
         * Summary: 网关健康检查1
         */
        public async Task<ServiceGatewayCheckResponse> ServiceGatewayCheckExAsync(ServiceGatewayCheckRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ServiceGatewayCheckResponse>(await DoRequestAsync("1.0", "antcloud.openapi.gateway.check.service", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过XML Spec形式导入产品的API配置
         * Summary: 导入API配置
         */
        public ImportGatewaySpecResponse ImportGatewaySpec(ImportGatewaySpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportGatewaySpecEx(request, headers, runtime);
        }

        /**
         * Description: 通过XML Spec形式导入产品的API配置
         * Summary: 导入API配置
         */
        public async Task<ImportGatewaySpecResponse> ImportGatewaySpecAsync(ImportGatewaySpecRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportGatewaySpecExAsync(request, headers, runtime);
        }

        /**
         * Description: 通过XML Spec形式导入产品的API配置
         * Summary: 导入API配置
         */
        public ImportGatewaySpecResponse ImportGatewaySpecEx(ImportGatewaySpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportGatewaySpecResponse>(DoRequest("1.0", "antcloud.openapi.gateway.spec.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通过XML Spec形式导入产品的API配置
         * Summary: 导入API配置
         */
        public async Task<ImportGatewaySpecResponse> ImportGatewaySpecExAsync(ImportGatewaySpecRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportGatewaySpecResponse>(await DoRequestAsync("1.0", "antcloud.openapi.gateway.spec.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新集群路由host
         * Summary: 更新集群路由host
         */
        public UpdateGatewayClusterhostResponse UpdateGatewayClusterhost(UpdateGatewayClusterhostRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateGatewayClusterhostEx(request, headers, runtime);
        }

        /**
         * Description: 更新集群路由host
         * Summary: 更新集群路由host
         */
        public async Task<UpdateGatewayClusterhostResponse> UpdateGatewayClusterhostAsync(UpdateGatewayClusterhostRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateGatewayClusterhostExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新集群路由host
         * Summary: 更新集群路由host
         */
        public UpdateGatewayClusterhostResponse UpdateGatewayClusterhostEx(UpdateGatewayClusterhostRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGatewayClusterhostResponse>(DoRequest("1.0", "antcloud.openapi.gateway.clusterhost.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新集群路由host
         * Summary: 更新集群路由host
         */
        public async Task<UpdateGatewayClusterhostResponse> UpdateGatewayClusterhostExAsync(UpdateGatewayClusterhostRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateGatewayClusterhostResponse>(await DoRequestAsync("1.0", "antcloud.openapi.gateway.clusterhost.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建静态路由
         * Summary: 创建静态路由
         */
        public CreateGatewayStaticrouterResponse CreateGatewayStaticrouter(CreateGatewayStaticrouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateGatewayStaticrouterEx(request, headers, runtime);
        }

        /**
         * Description: 创建静态路由
         * Summary: 创建静态路由
         */
        public async Task<CreateGatewayStaticrouterResponse> CreateGatewayStaticrouterAsync(CreateGatewayStaticrouterRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateGatewayStaticrouterExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建静态路由
         * Summary: 创建静态路由
         */
        public CreateGatewayStaticrouterResponse CreateGatewayStaticrouterEx(CreateGatewayStaticrouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGatewayStaticrouterResponse>(DoRequest("1.0", "antcloud.openapi.gateway.staticrouter.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建静态路由
         * Summary: 创建静态路由
         */
        public async Task<CreateGatewayStaticrouterResponse> CreateGatewayStaticrouterExAsync(CreateGatewayStaticrouterRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateGatewayStaticrouterResponse>(await DoRequestAsync("1.0", "antcloud.openapi.gateway.staticrouter.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群路由host
         * Summary: 查询集群路由host
         */
        public QueryGatewayClusterhostResponse QueryGatewayClusterhost(QueryGatewayClusterhostRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryGatewayClusterhostEx(request, headers, runtime);
        }

        /**
         * Description: 查询集群路由host
         * Summary: 查询集群路由host
         */
        public async Task<QueryGatewayClusterhostResponse> QueryGatewayClusterhostAsync(QueryGatewayClusterhostRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryGatewayClusterhostExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询集群路由host
         * Summary: 查询集群路由host
         */
        public QueryGatewayClusterhostResponse QueryGatewayClusterhostEx(QueryGatewayClusterhostRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayClusterhostResponse>(DoRequest("1.0", "antcloud.openapi.gateway.clusterhost.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询集群路由host
         * Summary: 查询集群路由host
         */
        public async Task<QueryGatewayClusterhostResponse> QueryGatewayClusterhostExAsync(QueryGatewayClusterhostRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryGatewayClusterhostResponse>(await DoRequestAsync("1.0", "antcloud.openapi.gateway.clusterhost.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入SDK信息
         * Summary: 导入SDK信息
         */
        public ImportSdkResponse ImportSdk(ImportSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ImportSdkEx(request, headers, runtime);
        }

        /**
         * Description: 导入SDK信息
         * Summary: 导入SDK信息
         */
        public async Task<ImportSdkResponse> ImportSdkAsync(ImportSdkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ImportSdkExAsync(request, headers, runtime);
        }

        /**
         * Description: 导入SDK信息
         * Summary: 导入SDK信息
         */
        public ImportSdkResponse ImportSdkEx(ImportSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSdkResponse>(DoRequest("1.0", "antcloud.openapi.sdk.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 导入SDK信息
         * Summary: 导入SDK信息
         */
        public async Task<ImportSdkResponse> ImportSdkExAsync(ImportSdkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ImportSdkResponse>(await DoRequestAsync("1.0", "antcloud.openapi.sdk.import", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
