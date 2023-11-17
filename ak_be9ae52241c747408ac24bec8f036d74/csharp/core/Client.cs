// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74.Models;

namespace AntChain.SDK.Ak_be9ae52241c747408ac24bec8f036d74
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_be9ae52241c747408ac24bec8f036d74"},
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
                        {"sdk_version", "1.0.0"},
                        {"_prod_code", "ak_be9ae52241c747408ac24bec8f036d74"},
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
         * Description: 请求创建数据源
         * Summary: 创建新的数据源
         */
        public CreateAntchainPdcpDatasourceResponse CreateAntchainPdcpDatasource(CreateAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainPdcpDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 请求创建数据源
         * Summary: 创建新的数据源
         */
        public async Task<CreateAntchainPdcpDatasourceResponse> CreateAntchainPdcpDatasourceAsync(CreateAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainPdcpDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 请求创建数据源
         * Summary: 创建新的数据源
         */
        public CreateAntchainPdcpDatasourceResponse CreateAntchainPdcpDatasourceEx(CreateAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainPdcpDatasourceResponse>(DoRequest("1.0", "antchain.pdcp.datasource.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求创建数据源
         * Summary: 创建新的数据源
         */
        public async Task<CreateAntchainPdcpDatasourceResponse> CreateAntchainPdcpDatasourceExAsync(CreateAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainPdcpDatasourceResponse>(await DoRequestAsync("1.0", "antchain.pdcp.datasource.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求删除指定的数据源。
         * Summary: 删除指定的数据源
         */
        public DeleteAntchainPdcpDatasourceResponse DeleteAntchainPdcpDatasource(DeleteAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAntchainPdcpDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 请求删除指定的数据源。
         * Summary: 删除指定的数据源
         */
        public async Task<DeleteAntchainPdcpDatasourceResponse> DeleteAntchainPdcpDatasourceAsync(DeleteAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAntchainPdcpDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 请求删除指定的数据源。
         * Summary: 删除指定的数据源
         */
        public DeleteAntchainPdcpDatasourceResponse DeleteAntchainPdcpDatasourceEx(DeleteAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAntchainPdcpDatasourceResponse>(DoRequest("1.0", "antchain.pdcp.datasource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求删除指定的数据源。
         * Summary: 删除指定的数据源
         */
        public async Task<DeleteAntchainPdcpDatasourceResponse> DeleteAntchainPdcpDatasourceExAsync(DeleteAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAntchainPdcpDatasourceResponse>(await DoRequestAsync("1.0", "antchain.pdcp.datasource.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求更新指定数据源的信息。
         * Summary: 更新指定数据源的信息
         */
        public UpdateAntchainPdcpDatasourceResponse UpdateAntchainPdcpDatasource(UpdateAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntchainPdcpDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 请求更新指定数据源的信息。
         * Summary: 更新指定数据源的信息
         */
        public async Task<UpdateAntchainPdcpDatasourceResponse> UpdateAntchainPdcpDatasourceAsync(UpdateAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntchainPdcpDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 请求更新指定数据源的信息。
         * Summary: 更新指定数据源的信息
         */
        public UpdateAntchainPdcpDatasourceResponse UpdateAntchainPdcpDatasourceEx(UpdateAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainPdcpDatasourceResponse>(DoRequest("1.0", "antchain.pdcp.datasource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求更新指定数据源的信息。
         * Summary: 更新指定数据源的信息
         */
        public async Task<UpdateAntchainPdcpDatasourceResponse> UpdateAntchainPdcpDatasourceExAsync(UpdateAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainPdcpDatasourceResponse>(await DoRequestAsync("1.0", "antchain.pdcp.datasource.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求查询指定的数据源信息。
         * Summary: 查询指定的数据源信息
         */
        public QueryAntchainPdcpDatasourceResponse QueryAntchainPdcpDatasource(QueryAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainPdcpDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 请求查询指定的数据源信息。
         * Summary: 查询指定的数据源信息
         */
        public async Task<QueryAntchainPdcpDatasourceResponse> QueryAntchainPdcpDatasourceAsync(QueryAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainPdcpDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 请求查询指定的数据源信息。
         * Summary: 查询指定的数据源信息
         */
        public QueryAntchainPdcpDatasourceResponse QueryAntchainPdcpDatasourceEx(QueryAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainPdcpDatasourceResponse>(DoRequest("1.0", "antchain.pdcp.datasource.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请求查询指定的数据源信息。
         * Summary: 查询指定的数据源信息
         */
        public async Task<QueryAntchainPdcpDatasourceResponse> QueryAntchainPdcpDatasourceExAsync(QueryAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainPdcpDatasourceResponse>(await DoRequestAsync("1.0", "antchain.pdcp.datasource.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页搜索数据源
         * Summary: 分页搜索数据源
         */
        public PagequeryAntchainPdcpDatasourceResponse PagequeryAntchainPdcpDatasource(PagequeryAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryAntchainPdcpDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 分页搜索数据源
         * Summary: 分页搜索数据源
         */
        public async Task<PagequeryAntchainPdcpDatasourceResponse> PagequeryAntchainPdcpDatasourceAsync(PagequeryAntchainPdcpDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryAntchainPdcpDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页搜索数据源
         * Summary: 分页搜索数据源
         */
        public PagequeryAntchainPdcpDatasourceResponse PagequeryAntchainPdcpDatasourceEx(PagequeryAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAntchainPdcpDatasourceResponse>(DoRequest("1.0", "antchain.pdcp.datasource.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页搜索数据源
         * Summary: 分页搜索数据源
         */
        public async Task<PagequeryAntchainPdcpDatasourceResponse> PagequeryAntchainPdcpDatasourceExAsync(PagequeryAntchainPdcpDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAntchainPdcpDatasourceResponse>(await DoRequestAsync("1.0", "antchain.pdcp.datasource.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建新的数据集
         * Summary: 创建新的数据集
         */
        public CreateAntchainPdcpDatasetResponse CreateAntchainPdcpDataset(CreateAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainPdcpDatasetEx(request, headers, runtime);
        }

        /**
         * Description: 创建新的数据集
         * Summary: 创建新的数据集
         */
        public async Task<CreateAntchainPdcpDatasetResponse> CreateAntchainPdcpDatasetAsync(CreateAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainPdcpDatasetExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建新的数据集
         * Summary: 创建新的数据集
         */
        public CreateAntchainPdcpDatasetResponse CreateAntchainPdcpDatasetEx(CreateAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainPdcpDatasetResponse>(DoRequest("1.0", "antchain.pdcp.dataset.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建新的数据集
         * Summary: 创建新的数据集
         */
        public async Task<CreateAntchainPdcpDatasetResponse> CreateAntchainPdcpDatasetExAsync(CreateAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainPdcpDatasetResponse>(await DoRequestAsync("1.0", "antchain.pdcp.dataset.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定数据集
         * Summary: 删除指定数据集
         */
        public DeleteAntchainPdcpDatasetResponse DeleteAntchainPdcpDataset(DeleteAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteAntchainPdcpDatasetEx(request, headers, runtime);
        }

        /**
         * Description: 删除指定数据集
         * Summary: 删除指定数据集
         */
        public async Task<DeleteAntchainPdcpDatasetResponse> DeleteAntchainPdcpDatasetAsync(DeleteAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteAntchainPdcpDatasetExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除指定数据集
         * Summary: 删除指定数据集
         */
        public DeleteAntchainPdcpDatasetResponse DeleteAntchainPdcpDatasetEx(DeleteAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAntchainPdcpDatasetResponse>(DoRequest("1.0", "antchain.pdcp.dataset.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除指定数据集
         * Summary: 删除指定数据集
         */
        public async Task<DeleteAntchainPdcpDatasetResponse> DeleteAntchainPdcpDatasetExAsync(DeleteAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteAntchainPdcpDatasetResponse>(await DoRequestAsync("1.0", "antchain.pdcp.dataset.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定数据集信息
         * Summary: 更新指定数据集信息
         */
        public UpdateAntchainPdcpDatasetResponse UpdateAntchainPdcpDataset(UpdateAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateAntchainPdcpDatasetEx(request, headers, runtime);
        }

        /**
         * Description: 更新指定数据集信息
         * Summary: 更新指定数据集信息
         */
        public async Task<UpdateAntchainPdcpDatasetResponse> UpdateAntchainPdcpDatasetAsync(UpdateAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateAntchainPdcpDatasetExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新指定数据集信息
         * Summary: 更新指定数据集信息
         */
        public UpdateAntchainPdcpDatasetResponse UpdateAntchainPdcpDatasetEx(UpdateAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainPdcpDatasetResponse>(DoRequest("1.0", "antchain.pdcp.dataset.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新指定数据集信息
         * Summary: 更新指定数据集信息
         */
        public async Task<UpdateAntchainPdcpDatasetResponse> UpdateAntchainPdcpDatasetExAsync(UpdateAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateAntchainPdcpDatasetResponse>(await DoRequestAsync("1.0", "antchain.pdcp.dataset.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定数据集信息
         * Summary: 查询指定数据集信息
         */
        public QueryAntchainPdcpDatasetResponse QueryAntchainPdcpDataset(QueryAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainPdcpDatasetEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定数据集信息
         * Summary: 查询指定数据集信息
         */
        public async Task<QueryAntchainPdcpDatasetResponse> QueryAntchainPdcpDatasetAsync(QueryAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainPdcpDatasetExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定数据集信息
         * Summary: 查询指定数据集信息
         */
        public QueryAntchainPdcpDatasetResponse QueryAntchainPdcpDatasetEx(QueryAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainPdcpDatasetResponse>(DoRequest("1.0", "antchain.pdcp.dataset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定数据集信息
         * Summary: 查询指定数据集信息
         */
        public async Task<QueryAntchainPdcpDatasetResponse> QueryAntchainPdcpDatasetExAsync(QueryAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainPdcpDatasetResponse>(await DoRequestAsync("1.0", "antchain.pdcp.dataset.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页搜索数据集
         * Summary: 分页搜索数据集
         */
        public PagequeryAntchainPdcpDatasetResponse PagequeryAntchainPdcpDataset(PagequeryAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryAntchainPdcpDatasetEx(request, headers, runtime);
        }

        /**
         * Description: 分页搜索数据集
         * Summary: 分页搜索数据集
         */
        public async Task<PagequeryAntchainPdcpDatasetResponse> PagequeryAntchainPdcpDatasetAsync(PagequeryAntchainPdcpDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryAntchainPdcpDatasetExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页搜索数据集
         * Summary: 分页搜索数据集
         */
        public PagequeryAntchainPdcpDatasetResponse PagequeryAntchainPdcpDatasetEx(PagequeryAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAntchainPdcpDatasetResponse>(DoRequest("1.0", "antchain.pdcp.dataset.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页搜索数据集
         * Summary: 分页搜索数据集
         */
        public async Task<PagequeryAntchainPdcpDatasetResponse> PagequeryAntchainPdcpDatasetExAsync(PagequeryAntchainPdcpDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAntchainPdcpDatasetResponse>(await DoRequestAsync("1.0", "antchain.pdcp.dataset.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 识别数据集的 schema 信息
         * Summary: 识别数据集的 schema 信息
         */
        public RecognizeAntchainPdcpDatasetSchemaResponse RecognizeAntchainPdcpDatasetSchema(RecognizeAntchainPdcpDatasetSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RecognizeAntchainPdcpDatasetSchemaEx(request, headers, runtime);
        }

        /**
         * Description: 识别数据集的 schema 信息
         * Summary: 识别数据集的 schema 信息
         */
        public async Task<RecognizeAntchainPdcpDatasetSchemaResponse> RecognizeAntchainPdcpDatasetSchemaAsync(RecognizeAntchainPdcpDatasetSchemaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RecognizeAntchainPdcpDatasetSchemaExAsync(request, headers, runtime);
        }

        /**
         * Description: 识别数据集的 schema 信息
         * Summary: 识别数据集的 schema 信息
         */
        public RecognizeAntchainPdcpDatasetSchemaResponse RecognizeAntchainPdcpDatasetSchemaEx(RecognizeAntchainPdcpDatasetSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeAntchainPdcpDatasetSchemaResponse>(DoRequest("1.0", "antchain.pdcp.dataset.schema.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 识别数据集的 schema 信息
         * Summary: 识别数据集的 schema 信息
         */
        public async Task<RecognizeAntchainPdcpDatasetSchemaResponse> RecognizeAntchainPdcpDatasetSchemaExAsync(RecognizeAntchainPdcpDatasetSchemaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RecognizeAntchainPdcpDatasetSchemaResponse>(await DoRequestAsync("1.0", "antchain.pdcp.dataset.schema.recognize", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建项目，添加线下参与方协作节点
         * Summary: 创建项目
         */
        public CreateAntchainPdcpProjectResponse CreateAntchainPdcpProject(CreateAntchainPdcpProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainPdcpProjectEx(request, headers, runtime);
        }

        /**
         * Description: 创建项目，添加线下参与方协作节点
         * Summary: 创建项目
         */
        public async Task<CreateAntchainPdcpProjectResponse> CreateAntchainPdcpProjectAsync(CreateAntchainPdcpProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainPdcpProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建项目，添加线下参与方协作节点
         * Summary: 创建项目
         */
        public CreateAntchainPdcpProjectResponse CreateAntchainPdcpProjectEx(CreateAntchainPdcpProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainPdcpProjectResponse>(DoRequest("1.0", "antchain.pdcp.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建项目，添加线下参与方协作节点
         * Summary: 创建项目
         */
        public async Task<CreateAntchainPdcpProjectResponse> CreateAntchainPdcpProjectExAsync(CreateAntchainPdcpProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainPdcpProjectResponse>(await DoRequestAsync("1.0", "antchain.pdcp.project.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据项目ID查询项目信息
         * Summary: 根据项目ID查询项目信息
         */
        public GetAntchainPdcpProjectResponse GetAntchainPdcpProject(GetAntchainPdcpProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetAntchainPdcpProjectEx(request, headers, runtime);
        }

        /**
         * Description: 根据项目ID查询项目信息
         * Summary: 根据项目ID查询项目信息
         */
        public async Task<GetAntchainPdcpProjectResponse> GetAntchainPdcpProjectAsync(GetAntchainPdcpProjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetAntchainPdcpProjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据项目ID查询项目信息
         * Summary: 根据项目ID查询项目信息
         */
        public GetAntchainPdcpProjectResponse GetAntchainPdcpProjectEx(GetAntchainPdcpProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainPdcpProjectResponse>(DoRequest("1.0", "antchain.pdcp.project.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据项目ID查询项目信息
         * Summary: 根据项目ID查询项目信息
         */
        public async Task<GetAntchainPdcpProjectResponse> GetAntchainPdcpProjectExAsync(GetAntchainPdcpProjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetAntchainPdcpProjectResponse>(await DoRequestAsync("1.0", "antchain.pdcp.project.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
         * Summary: 授权某个本地的数据集至项目中
         */
        public AuthAntchainPdcpProjectDatasetResponse AuthAntchainPdcpProjectDataset(AuthAntchainPdcpProjectDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthAntchainPdcpProjectDatasetEx(request, headers, runtime);
        }

        /**
         * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
         * Summary: 授权某个本地的数据集至项目中
         */
        public async Task<AuthAntchainPdcpProjectDatasetResponse> AuthAntchainPdcpProjectDatasetAsync(AuthAntchainPdcpProjectDatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthAntchainPdcpProjectDatasetExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
         * Summary: 授权某个本地的数据集至项目中
         */
        public AuthAntchainPdcpProjectDatasetResponse AuthAntchainPdcpProjectDatasetEx(AuthAntchainPdcpProjectDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainPdcpProjectDatasetResponse>(DoRequest("1.0", "antchain.pdcp.project.dataset.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
         * Summary: 授权某个本地的数据集至项目中
         */
        public async Task<AuthAntchainPdcpProjectDatasetResponse> AuthAntchainPdcpProjectDatasetExAsync(AuthAntchainPdcpProjectDatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainPdcpProjectDatasetResponse>(await DoRequestAsync("1.0", "antchain.pdcp.project.dataset.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权数据源至项目/api/project/datasource/auth
         * Summary: 授权某个本地数据源至项目中
         */
        public AuthAntchainPdcpProjectDatasourceResponse AuthAntchainPdcpProjectDatasource(AuthAntchainPdcpProjectDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthAntchainPdcpProjectDatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 授权数据源至项目/api/project/datasource/auth
         * Summary: 授权某个本地数据源至项目中
         */
        public async Task<AuthAntchainPdcpProjectDatasourceResponse> AuthAntchainPdcpProjectDatasourceAsync(AuthAntchainPdcpProjectDatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthAntchainPdcpProjectDatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权数据源至项目/api/project/datasource/auth
         * Summary: 授权某个本地数据源至项目中
         */
        public AuthAntchainPdcpProjectDatasourceResponse AuthAntchainPdcpProjectDatasourceEx(AuthAntchainPdcpProjectDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainPdcpProjectDatasourceResponse>(DoRequest("1.0", "antchain.pdcp.project.datasource.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权数据源至项目/api/project/datasource/auth
         * Summary: 授权某个本地数据源至项目中
         */
        public async Task<AuthAntchainPdcpProjectDatasourceResponse> AuthAntchainPdcpProjectDatasourceExAsync(AuthAntchainPdcpProjectDatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainPdcpProjectDatasourceResponse>(await DoRequestAsync("1.0", "antchain.pdcp.project.datasource.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询项目内已授权的数据集列表
         * Summary: 分页查询项目内已授权的数据集列表
         */
        public PagequeryAntchainPdcpProjectAuthdatasetResponse PagequeryAntchainPdcpProjectAuthdataset(PagequeryAntchainPdcpProjectAuthdatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryAntchainPdcpProjectAuthdatasetEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询项目内已授权的数据集列表
         * Summary: 分页查询项目内已授权的数据集列表
         */
        public async Task<PagequeryAntchainPdcpProjectAuthdatasetResponse> PagequeryAntchainPdcpProjectAuthdatasetAsync(PagequeryAntchainPdcpProjectAuthdatasetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryAntchainPdcpProjectAuthdatasetExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询项目内已授权的数据集列表
         * Summary: 分页查询项目内已授权的数据集列表
         */
        public PagequeryAntchainPdcpProjectAuthdatasetResponse PagequeryAntchainPdcpProjectAuthdatasetEx(PagequeryAntchainPdcpProjectAuthdatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAntchainPdcpProjectAuthdatasetResponse>(DoRequest("1.0", "antchain.pdcp.project.authdataset.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询项目内已授权的数据集列表
         * Summary: 分页查询项目内已授权的数据集列表
         */
        public async Task<PagequeryAntchainPdcpProjectAuthdatasetResponse> PagequeryAntchainPdcpProjectAuthdatasetExAsync(PagequeryAntchainPdcpProjectAuthdatasetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAntchainPdcpProjectAuthdatasetResponse>(await DoRequestAsync("1.0", "antchain.pdcp.project.authdataset.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询项目内已授权的数据源列表
         * Summary: 分页查询项目内已授权的数据源列表
         */
        public PagequeryAntchainPdcpProjectAuthdatasourceResponse PagequeryAntchainPdcpProjectAuthdatasource(PagequeryAntchainPdcpProjectAuthdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryAntchainPdcpProjectAuthdatasourceEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询项目内已授权的数据源列表
         * Summary: 分页查询项目内已授权的数据源列表
         */
        public async Task<PagequeryAntchainPdcpProjectAuthdatasourceResponse> PagequeryAntchainPdcpProjectAuthdatasourceAsync(PagequeryAntchainPdcpProjectAuthdatasourceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryAntchainPdcpProjectAuthdatasourceExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询项目内已授权的数据源列表
         * Summary: 分页查询项目内已授权的数据源列表
         */
        public PagequeryAntchainPdcpProjectAuthdatasourceResponse PagequeryAntchainPdcpProjectAuthdatasourceEx(PagequeryAntchainPdcpProjectAuthdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAntchainPdcpProjectAuthdatasourceResponse>(DoRequest("1.0", "antchain.pdcp.project.authdatasource.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询项目内已授权的数据源列表
         * Summary: 分页查询项目内已授权的数据源列表
         */
        public async Task<PagequeryAntchainPdcpProjectAuthdatasourceResponse> PagequeryAntchainPdcpProjectAuthdatasourceExAsync(PagequeryAntchainPdcpProjectAuthdatasourceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryAntchainPdcpProjectAuthdatasourceResponse>(await DoRequestAsync("1.0", "antchain.pdcp.project.authdatasource.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询任务信息
         * Summary: 查询任务状态
         */
        public QueryAntchainPdcpJobPsiResponse QueryAntchainPdcpJobPsi(QueryAntchainPdcpJobPsiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainPdcpJobPsiEx(request, headers, runtime);
        }

        /**
         * Description: 查询任务信息
         * Summary: 查询任务状态
         */
        public async Task<QueryAntchainPdcpJobPsiResponse> QueryAntchainPdcpJobPsiAsync(QueryAntchainPdcpJobPsiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainPdcpJobPsiExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询任务信息
         * Summary: 查询任务状态
         */
        public QueryAntchainPdcpJobPsiResponse QueryAntchainPdcpJobPsiEx(QueryAntchainPdcpJobPsiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainPdcpJobPsiResponse>(DoRequest("1.0", "antchain.pdcp.job.psi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询任务信息
         * Summary: 查询任务状态
         */
        public async Task<QueryAntchainPdcpJobPsiResponse> QueryAntchainPdcpJobPsiExAsync(QueryAntchainPdcpJobPsiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainPdcpJobPsiResponse>(await DoRequestAsync("1.0", "antchain.pdcp.job.psi.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交psi任务接口
         * Summary: 提交psi任务接口
         */
        public SubmitAntchainPdcpJobPsiResponse SubmitAntchainPdcpJobPsi(SubmitAntchainPdcpJobPsiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitAntchainPdcpJobPsiEx(request, headers, runtime);
        }

        /**
         * Description: 提交psi任务接口
         * Summary: 提交psi任务接口
         */
        public async Task<SubmitAntchainPdcpJobPsiResponse> SubmitAntchainPdcpJobPsiAsync(SubmitAntchainPdcpJobPsiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitAntchainPdcpJobPsiExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交psi任务接口
         * Summary: 提交psi任务接口
         */
        public SubmitAntchainPdcpJobPsiResponse SubmitAntchainPdcpJobPsiEx(SubmitAntchainPdcpJobPsiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainPdcpJobPsiResponse>(DoRequest("1.0", "antchain.pdcp.job.psi.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交psi任务接口
         * Summary: 提交psi任务接口
         */
        public async Task<SubmitAntchainPdcpJobPsiResponse> SubmitAntchainPdcpJobPsiExAsync(SubmitAntchainPdcpJobPsiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitAntchainPdcpJobPsiResponse>(await DoRequestAsync("1.0", "antchain.pdcp.job.psi.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
