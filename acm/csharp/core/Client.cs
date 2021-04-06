// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Acm.Models;

namespace AntChain.SDK.Acm
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
                        {"sdk_version", "1.0.19"},
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
                        {"sdk_version", "1.0.19"},
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
         * Description: 查询企业详情
         * Summary: 获取企业
         */
        public GetCustomerResponse GetCustomer(GetCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 查询企业详情
         * Summary: 获取企业
         */
        public async Task<GetCustomerResponse> GetCustomerAsync(GetCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询企业详情
         * Summary: 获取企业
         */
        public GetCustomerResponse GetCustomerEx(GetCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerResponse>(DoRequest("1.0", "antcloud.acm.customer.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业详情
         * Summary: 获取企业
         */
        public async Task<GetCustomerResponse> GetCustomerExAsync(GetCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCustomerResponse>(await DoRequestAsync("1.0", "antcloud.acm.customer.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个操作员的详情
         * Summary: 获取操作员
         */
        public GetOperatorResponse GetOperator(GetOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 查询一个操作员的详情
         * Summary: 获取操作员
         */
        public async Task<GetOperatorResponse> GetOperatorAsync(GetOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询一个操作员的详情
         * Summary: 获取操作员
         */
        public GetOperatorResponse GetOperatorEx(GetOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOperatorResponse>(DoRequest("1.0", "antcloud.acm.operator.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询一个操作员的详情
         * Summary: 获取操作员
         */
        public async Task<GetOperatorResponse> GetOperatorExAsync(GetOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetOperatorResponse>(await DoRequestAsync("1.0", "antcloud.acm.operator.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询操作员列表
         * Summary: 查询操作员
         */
        public QueryOperatorResponse QueryOperator(QueryOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 查询操作员列表
         * Summary: 查询操作员
         */
        public async Task<QueryOperatorResponse> QueryOperatorAsync(QueryOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询操作员列表
         * Summary: 查询操作员
         */
        public QueryOperatorResponse QueryOperatorEx(QueryOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperatorResponse>(DoRequest("1.0", "antcloud.acm.operator.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询操作员列表
         * Summary: 查询操作员
         */
        public async Task<QueryOperatorResponse> QueryOperatorExAsync(QueryOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryOperatorResponse>(await DoRequestAsync("1.0", "antcloud.acm.operator.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 搜索操作员
         * Summary: 搜索操作员
         */
        public SearchOperatorResponse SearchOperator(SearchOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SearchOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 搜索操作员
         * Summary: 搜索操作员
         */
        public async Task<SearchOperatorResponse> SearchOperatorAsync(SearchOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SearchOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 搜索操作员
         * Summary: 搜索操作员
         */
        public SearchOperatorResponse SearchOperatorEx(SearchOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchOperatorResponse>(DoRequest("1.0", "antcloud.acm.operator.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 搜索操作员
         * Summary: 搜索操作员
         */
        public async Task<SearchOperatorResponse> SearchOperatorExAsync(SearchOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SearchOperatorResponse>(await DoRequestAsync("1.0", "antcloud.acm.operator.search", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建操作员
         * Summary: 创建操作员
         */
        public CreateOperatorResponse CreateOperator(CreateOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 创建操作员
         * Summary: 创建操作员
         */
        public async Task<CreateOperatorResponse> CreateOperatorAsync(CreateOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建操作员
         * Summary: 创建操作员
         */
        public CreateOperatorResponse CreateOperatorEx(CreateOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOperatorResponse>(DoRequest("1.0", "antcloud.acm.operator.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建操作员
         * Summary: 创建操作员
         */
        public async Task<CreateOperatorResponse> CreateOperatorExAsync(CreateOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateOperatorResponse>(await DoRequestAsync("1.0", "antcloud.acm.operator.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新操作员
         * Summary: 更新操作员
         */
        public UpdateOperatorResponse UpdateOperator(UpdateOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 更新操作员
         * Summary: 更新操作员
         */
        public async Task<UpdateOperatorResponse> UpdateOperatorAsync(UpdateOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新操作员
         * Summary: 更新操作员
         */
        public UpdateOperatorResponse UpdateOperatorEx(UpdateOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOperatorResponse>(DoRequest("1.0", "antcloud.acm.operator.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新操作员
         * Summary: 更新操作员
         */
        public async Task<UpdateOperatorResponse> UpdateOperatorExAsync(UpdateOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateOperatorResponse>(await DoRequestAsync("1.0", "antcloud.acm.operator.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除操作员
         * Summary: 删除操作员
         */
        public DeleteOperatorResponse DeleteOperator(DeleteOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteOperatorEx(request, headers, runtime);
        }

        /**
         * Description: 删除操作员
         * Summary: 删除操作员
         */
        public async Task<DeleteOperatorResponse> DeleteOperatorAsync(DeleteOperatorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteOperatorExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除操作员
         * Summary: 删除操作员
         */
        public DeleteOperatorResponse DeleteOperatorEx(DeleteOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteOperatorResponse>(DoRequest("1.0", "antcloud.acm.operator.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除操作员
         * Summary: 删除操作员
         */
        public async Task<DeleteOperatorResponse> DeleteOperatorExAsync(DeleteOperatorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteOperatorResponse>(await DoRequestAsync("1.0", "antcloud.acm.operator.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加租户成员
         * Summary: 添加租户成员
         */
        public AddTenantMemberResponse AddTenantMember(AddTenantMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTenantMemberEx(request, headers, runtime);
        }

        /**
         * Description: 添加租户成员
         * Summary: 添加租户成员
         */
        public async Task<AddTenantMemberResponse> AddTenantMemberAsync(AddTenantMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTenantMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加租户成员
         * Summary: 添加租户成员
         */
        public AddTenantMemberResponse AddTenantMemberEx(AddTenantMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTenantMemberResponse>(DoRequest("1.0", "antcloud.acm.tenant.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加租户成员
         * Summary: 添加租户成员
         */
        public async Task<AddTenantMemberResponse> AddTenantMemberExAsync(AddTenantMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTenantMemberResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化租户
         * Summary: 初始化租户
         */
        public CreateTenantResponse CreateTenant(CreateTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateTenantEx(request, headers, runtime);
        }

        /**
         * Description: 初始化租户
         * Summary: 初始化租户
         */
        public async Task<CreateTenantResponse> CreateTenantAsync(CreateTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 初始化租户
         * Summary: 初始化租户
         */
        public CreateTenantResponse CreateTenantEx(CreateTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTenantResponse>(DoRequest("1.0", "antcloud.acm.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化租户
         * Summary: 初始化租户
         */
        public async Task<CreateTenantResponse> CreateTenantExAsync(CreateTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateTenantResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户详情
         * Summary: 获取租户
         */
        public GetTenantResponse GetTenant(GetTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTenantEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户详情
         * Summary: 获取租户
         */
        public async Task<GetTenantResponse> GetTenantAsync(GetTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户详情
         * Summary: 获取租户
         */
        public GetTenantResponse GetTenantEx(GetTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTenantResponse>(DoRequest("1.0", "antcloud.acm.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户详情
         * Summary: 获取租户
         */
        public async Task<GetTenantResponse> GetTenantExAsync(GetTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTenantResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户列表
         * Summary: 查询租户列表
         */
        public QueryTenantResponse QueryTenant(QueryTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTenantEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户列表
         * Summary: 查询租户列表
         */
        public async Task<QueryTenantResponse> QueryTenantAsync(QueryTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户列表
         * Summary: 查询租户列表
         */
        public QueryTenantResponse QueryTenantEx(QueryTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantResponse>(DoRequest("1.0", "antcloud.acm.tenant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户列表
         * Summary: 查询租户列表
         */
        public async Task<QueryTenantResponse> QueryTenantExAsync(QueryTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据蚂蚁通行证uid查询租户id
         * Summary: 查询租户ID
         */
        public GetAntpassportTenantResponse GetAntpassportTenant(GetAntpassportTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntpassportTenantEx(request, headers, runtime);
        }

        /**
         * Description: 根据蚂蚁通行证uid查询租户id
         * Summary: 查询租户ID
         */
        public async Task<GetAntpassportTenantResponse> GetAntpassportTenantAsync(GetAntpassportTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntpassportTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据蚂蚁通行证uid查询租户id
         * Summary: 查询租户ID
         */
        public GetAntpassportTenantResponse GetAntpassportTenantEx(GetAntpassportTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntpassportTenantResponse>(DoRequest("1.0", "antcloud.acm.antpassport.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据蚂蚁通行证uid查询租户id
         * Summary: 查询租户ID
         */
        public async Task<GetAntpassportTenantResponse> GetAntpassportTenantExAsync(GetAntpassportTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntpassportTenantResponse>(await DoRequestAsync("1.0", "antcloud.acm.antpassport.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户AccessKey信息
         * Summary: 获取用户AccessKey信息
         */
        public ListAccesskeyResponse ListAccesskey(ListAccesskeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListAccesskeyEx(request, headers, runtime);
        }

        /**
         * Description: 获取用户AccessKey信息
         * Summary: 获取用户AccessKey信息
         */
        public async Task<ListAccesskeyResponse> ListAccesskeyAsync(ListAccesskeyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListAccesskeyExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取用户AccessKey信息
         * Summary: 获取用户AccessKey信息
         */
        public ListAccesskeyResponse ListAccesskeyEx(ListAccesskeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAccesskeyResponse>(DoRequest("1.0", "antcloud.acm.accesskey.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户AccessKey信息
         * Summary: 获取用户AccessKey信息
         */
        public async Task<ListAccesskeyResponse> ListAccesskeyExAsync(ListAccesskeyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListAccesskeyResponse>(await DoRequestAsync("1.0", "antcloud.acm.accesskey.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取调用接口所使用AccessKey对应的身份实体信息
         * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
         */
        public GetCurrentidResponse GetCurrentid(GetCurrentidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetCurrentidEx(request, headers, runtime);
        }

        /**
         * Description: 获取调用接口所使用AccessKey对应的身份实体信息
         * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
         */
        public async Task<GetCurrentidResponse> GetCurrentidAsync(GetCurrentidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetCurrentidExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取调用接口所使用AccessKey对应的身份实体信息
         * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
         */
        public GetCurrentidResponse GetCurrentidEx(GetCurrentidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCurrentidResponse>(DoRequest("1.0", "antcloud.acm.currentid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取调用接口所使用AccessKey对应的身份实体信息
         * Summary: 获取调用接口所使用AccessKey对应的身份实体信息
         */
        public async Task<GetCurrentidResponse> GetCurrentidExAsync(GetCurrentidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetCurrentidResponse>(await DoRequestAsync("1.0", "antcloud.acm.currentid.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户Accessor信息
         * Summary: 获取用户Accessor信息
         */
        public GetAccessorResponse GetAccessor(GetAccessorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAccessorEx(request, headers, runtime);
        }

        /**
         * Description: 获取用户Accessor信息
         * Summary: 获取用户Accessor信息
         */
        public async Task<GetAccessorResponse> GetAccessorAsync(GetAccessorRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAccessorExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取用户Accessor信息
         * Summary: 获取用户Accessor信息
         */
        public GetAccessorResponse GetAccessorEx(GetAccessorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAccessorResponse>(DoRequest("1.0", "antcloud.acm.accessor.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取用户Accessor信息
         * Summary: 获取用户Accessor信息
         */
        public async Task<GetAccessorResponse> GetAccessorExAsync(GetAccessorRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAccessorResponse>(await DoRequestAsync("1.0", "antcloud.acm.accessor.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户对应的钉钉授权token信息，内部接口
         * Summary: 获取租户的钉钉授权
         */
        public GetTenantDingtokenResponse GetTenantDingtoken(GetTenantDingtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTenantDingtokenEx(request, headers, runtime);
        }

        /**
         * Description: 获取租户对应的钉钉授权token信息，内部接口
         * Summary: 获取租户的钉钉授权
         */
        public async Task<GetTenantDingtokenResponse> GetTenantDingtokenAsync(GetTenantDingtokenRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTenantDingtokenExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取租户对应的钉钉授权token信息，内部接口
         * Summary: 获取租户的钉钉授权
         */
        public GetTenantDingtokenResponse GetTenantDingtokenEx(GetTenantDingtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTenantDingtokenResponse>(DoRequest("1.0", "antcloud.acm.tenant.dingtoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户对应的钉钉授权token信息，内部接口
         * Summary: 获取租户的钉钉授权
         */
        public async Task<GetTenantDingtokenResponse> GetTenantDingtokenExAsync(GetTenantDingtokenRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTenantDingtokenResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.dingtoken.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询管理员，内部接口
         * Summary: 分页查询管理员
         */
        public QueryAdminResponse QueryAdmin(QueryAdminRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAdminEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询管理员，内部接口
         * Summary: 分页查询管理员
         */
        public async Task<QueryAdminResponse> QueryAdminAsync(QueryAdminRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAdminExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询管理员，内部接口
         * Summary: 分页查询管理员
         */
        public QueryAdminResponse QueryAdminEx(QueryAdminRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAdminResponse>(DoRequest("1.0", "antcloud.acm.admin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询管理员，内部接口
         * Summary: 分页查询管理员
         */
        public async Task<QueryAdminResponse> QueryAdminExAsync(QueryAdminRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAdminResponse>(await DoRequestAsync("1.0", "antcloud.acm.admin.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户的IaaS账号
         * Summary: 获取租户的IaaS账号
         */
        public GetTenantIaasaccountResponse GetTenantIaasaccount(GetTenantIaasaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetTenantIaasaccountEx(request, headers, runtime);
        }

        /**
         * Description: 获取租户的IaaS账号
         * Summary: 获取租户的IaaS账号
         */
        public async Task<GetTenantIaasaccountResponse> GetTenantIaasaccountAsync(GetTenantIaasaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetTenantIaasaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取租户的IaaS账号
         * Summary: 获取租户的IaaS账号
         */
        public GetTenantIaasaccountResponse GetTenantIaasaccountEx(GetTenantIaasaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTenantIaasaccountResponse>(DoRequest("1.0", "antcloud.acm.tenant.iaasaccount.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取租户的IaaS账号
         * Summary: 获取租户的IaaS账号
         */
        public async Task<GetTenantIaasaccountResponse> GetTenantIaasaccountExAsync(GetTenantIaasaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetTenantIaasaccountResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.iaasaccount.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业列表(内部接口,私有云开放)
         * Summary: 查询企业列表
         */
        public ListCustomerResponse ListCustomer(ListCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 查询企业列表(内部接口,私有云开放)
         * Summary: 查询企业列表
         */
        public async Task<ListCustomerResponse> ListCustomerAsync(ListCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询企业列表(内部接口,私有云开放)
         * Summary: 查询企业列表
         */
        public ListCustomerResponse ListCustomerEx(ListCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCustomerResponse>(DoRequest("1.0", "antcloud.acm.customer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询企业列表(内部接口,私有云开放)
         * Summary: 查询企业列表
         */
        public async Task<ListCustomerResponse> ListCustomerExAsync(ListCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListCustomerResponse>(await DoRequestAsync("1.0", "antcloud.acm.customer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝账号证书信息校验及校验、入驻、打标
         * Summary: 支付宝账号证书信息校验、入驻、打标
         */
        public CheckAlipayTenantResponse CheckAlipayTenant(CheckAlipayTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAlipayTenantEx(request, headers, runtime);
        }

        /**
         * Description: 支付宝账号证书信息校验及校验、入驻、打标
         * Summary: 支付宝账号证书信息校验、入驻、打标
         */
        public async Task<CheckAlipayTenantResponse> CheckAlipayTenantAsync(CheckAlipayTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAlipayTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 支付宝账号证书信息校验及校验、入驻、打标
         * Summary: 支付宝账号证书信息校验、入驻、打标
         */
        public CheckAlipayTenantResponse CheckAlipayTenantEx(CheckAlipayTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAlipayTenantResponse>(DoRequest("1.0", "antcloud.acm.alipay.tenant.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 支付宝账号证书信息校验及校验、入驻、打标
         * Summary: 支付宝账号证书信息校验、入驻、打标
         */
        public async Task<CheckAlipayTenantResponse> CheckAlipayTenantExAsync(CheckAlipayTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAlipayTenantResponse>(await DoRequestAsync("1.0", "antcloud.acm.alipay.tenant.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户入住状态查询
         * Summary: 租户入住状态查询
         */
        public QueryTenantStatusResponse QueryTenantStatus(QueryTenantStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTenantStatusEx(request, headers, runtime);
        }

        /**
         * Description: 租户入住状态查询
         * Summary: 租户入住状态查询
         */
        public async Task<QueryTenantStatusResponse> QueryTenantStatusAsync(QueryTenantStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTenantStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 租户入住状态查询
         * Summary: 租户入住状态查询
         */
        public QueryTenantStatusResponse QueryTenantStatusEx(QueryTenantStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantStatusResponse>(DoRequest("1.0", "antcloud.acm.tenant.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户入住状态查询
         * Summary: 租户入住状态查询
         */
        public async Task<QueryTenantStatusResponse> QueryTenantStatusExAsync(QueryTenantStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantStatusResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账号创建
         * Summary: 账号创建
         */
        public CreateAntchainTenantResponse CreateAntchainTenant(CreateAntchainTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainTenantEx(request, headers, runtime);
        }

        /**
         * Description: 账号创建
         * Summary: 账号创建
         */
        public async Task<CreateAntchainTenantResponse> CreateAntchainTenantAsync(CreateAntchainTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 账号创建
         * Summary: 账号创建
         */
        public CreateAntchainTenantResponse CreateAntchainTenantEx(CreateAntchainTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainTenantResponse>(DoRequest("1.0", "antcloud.acm.antchain.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 账号创建
         * Summary: 账号创建
         */
        public async Task<CreateAntchainTenantResponse> CreateAntchainTenantExAsync(CreateAntchainTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainTenantResponse>(await DoRequestAsync("1.0", "antcloud.acm.antchain.tenant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户认证信息更新
         * Summary: 客户认证信息更新
         */
        public UpdateCustomerIdentityResponse UpdateCustomerIdentity(UpdateCustomerIdentityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateCustomerIdentityEx(request, headers, runtime);
        }

        /**
         * Description: 客户认证信息更新
         * Summary: 客户认证信息更新
         */
        public async Task<UpdateCustomerIdentityResponse> UpdateCustomerIdentityAsync(UpdateCustomerIdentityRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateCustomerIdentityExAsync(request, headers, runtime);
        }

        /**
         * Description: 客户认证信息更新
         * Summary: 客户认证信息更新
         */
        public UpdateCustomerIdentityResponse UpdateCustomerIdentityEx(UpdateCustomerIdentityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustomerIdentityResponse>(DoRequest("1.0", "antcloud.acm.customer.identity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户认证信息更新
         * Summary: 客户认证信息更新
         */
        public async Task<UpdateCustomerIdentityResponse> UpdateCustomerIdentityExAsync(UpdateCustomerIdentityRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateCustomerIdentityResponse>(await DoRequestAsync("1.0", "antcloud.acm.customer.identity.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验邮箱是否可以创建账号
         * Summary: 校验邮箱是否可以创建账号
         */
        public CheckLoginIdResponse CheckLoginId(CheckLoginIdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckLoginIdEx(request, headers, runtime);
        }

        /**
         * Description: 校验邮箱是否可以创建账号
         * Summary: 校验邮箱是否可以创建账号
         */
        public async Task<CheckLoginIdResponse> CheckLoginIdAsync(CheckLoginIdRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckLoginIdExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验邮箱是否可以创建账号
         * Summary: 校验邮箱是否可以创建账号
         */
        public CheckLoginIdResponse CheckLoginIdEx(CheckLoginIdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckLoginIdResponse>(DoRequest("1.0", "antcloud.acm.login.id.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验邮箱是否可以创建账号
         * Summary: 校验邮箱是否可以创建账号
         */
        public async Task<CheckLoginIdResponse> CheckLoginIdExAsync(CheckLoginIdRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckLoginIdResponse>(await DoRequestAsync("1.0", "antcloud.acm.login.id.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用租户ID查询租户信息
         * Summary: 使用租户ID查询租户信息
         */
        public GetMasterTenantResponse GetMasterTenant(GetMasterTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetMasterTenantEx(request, headers, runtime);
        }

        /**
         * Description: 使用租户ID查询租户信息
         * Summary: 使用租户ID查询租户信息
         */
        public async Task<GetMasterTenantResponse> GetMasterTenantAsync(GetMasterTenantRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetMasterTenantExAsync(request, headers, runtime);
        }

        /**
         * Description: 使用租户ID查询租户信息
         * Summary: 使用租户ID查询租户信息
         */
        public GetMasterTenantResponse GetMasterTenantEx(GetMasterTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMasterTenantResponse>(DoRequest("1.0", "antcloud.acm.master.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 使用租户ID查询租户信息
         * Summary: 使用租户ID查询租户信息
         */
        public async Task<GetMasterTenantResponse> GetMasterTenantExAsync(GetMasterTenantRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetMasterTenantResponse>(await DoRequestAsync("1.0", "antcloud.acm.master.tenant.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查邮箱是否可以用来注册
         * Summary: 检查邮箱是否可以用来注册
         */
        public CheckLoginnameResponse CheckLoginname(CheckLoginnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckLoginnameEx(request, headers, runtime);
        }

        /**
         * Description: 检查邮箱是否可以用来注册
         * Summary: 检查邮箱是否可以用来注册
         */
        public async Task<CheckLoginnameResponse> CheckLoginnameAsync(CheckLoginnameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckLoginnameExAsync(request, headers, runtime);
        }

        /**
         * Description: 检查邮箱是否可以用来注册
         * Summary: 检查邮箱是否可以用来注册
         */
        public CheckLoginnameResponse CheckLoginnameEx(CheckLoginnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckLoginnameResponse>(DoRequest("1.0", "antcloud.acm.loginname.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检查邮箱是否可以用来注册
         * Summary: 检查邮箱是否可以用来注册
         */
        public async Task<CheckLoginnameResponse> CheckLoginnameExAsync(CheckLoginnameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckLoginnameResponse>(await DoRequestAsync("1.0", "antcloud.acm.loginname.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的标签
         * Summary: 查询租户的标签列表
         */
        public QueryTenantTagResponse QueryTenantTag(QueryTenantTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryTenantTagEx(request, headers, runtime);
        }

        /**
         * Description: 查询租户的标签
         * Summary: 查询租户的标签列表
         */
        public async Task<QueryTenantTagResponse> QueryTenantTagAsync(QueryTenantTagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryTenantTagExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询租户的标签
         * Summary: 查询租户的标签列表
         */
        public QueryTenantTagResponse QueryTenantTagEx(QueryTenantTagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantTagResponse>(DoRequest("1.0", "antcloud.acm.tenant.tag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询租户的标签
         * Summary: 查询租户的标签列表
         */
        public async Task<QueryTenantTagResponse> QueryTenantTagExAsync(QueryTenantTagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryTenantTagResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.tag.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户增加业务标签
         * Summary: 租户增加业务标签
         */
        public AddTenantBusinesstagResponse AddTenantBusinesstag(AddTenantBusinesstagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddTenantBusinesstagEx(request, headers, runtime);
        }

        /**
         * Description: 租户增加业务标签
         * Summary: 租户增加业务标签
         */
        public async Task<AddTenantBusinesstagResponse> AddTenantBusinesstagAsync(AddTenantBusinesstagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddTenantBusinesstagExAsync(request, headers, runtime);
        }

        /**
         * Description: 租户增加业务标签
         * Summary: 租户增加业务标签
         */
        public AddTenantBusinesstagResponse AddTenantBusinesstagEx(AddTenantBusinesstagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTenantBusinesstagResponse>(DoRequest("1.0", "antcloud.acm.tenant.businesstag.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 租户增加业务标签
         * Summary: 租户增加业务标签
         */
        public async Task<AddTenantBusinesstagResponse> AddTenantBusinesstagExAsync(AddTenantBusinesstagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddTenantBusinesstagResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.businesstag.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除业务标签
         * Summary: 删除业务标签
         */
        public RemoveTenantBusinesstagResponse RemoveTenantBusinesstag(RemoveTenantBusinesstagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveTenantBusinesstagEx(request, headers, runtime);
        }

        /**
         * Description: 删除业务标签
         * Summary: 删除业务标签
         */
        public async Task<RemoveTenantBusinesstagResponse> RemoveTenantBusinesstagAsync(RemoveTenantBusinesstagRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveTenantBusinesstagExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除业务标签
         * Summary: 删除业务标签
         */
        public RemoveTenantBusinesstagResponse RemoveTenantBusinesstagEx(RemoveTenantBusinesstagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveTenantBusinesstagResponse>(DoRequest("1.0", "antcloud.acm.tenant.businesstag.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除业务标签
         * Summary: 删除业务标签
         */
        public async Task<RemoveTenantBusinesstagResponse> RemoveTenantBusinesstagExAsync(RemoveTenantBusinesstagRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveTenantBusinesstagResponse>(await DoRequestAsync("1.0", "antcloud.acm.tenant.businesstag.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
