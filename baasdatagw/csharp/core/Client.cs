// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.BAASDATAGW.Models;

namespace AntChain.SDK.BAASDATAGW
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
                        {"sdk_version", "1.4.10"},
                        {"_prod_code", "BAASDATAGW"},
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
                        {"sdk_version", "1.4.10"},
                        {"_prod_code", "BAASDATAGW"},
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
         * Description: 检索索引的链上数据
         * Summary: 检索索引的链上数据
         */
        public QueryDatasearchSearchResponse QueryDatasearchSearch(QueryDatasearchSearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDatasearchSearchEx(request, headers, runtime);
        }

        /**
         * Description: 检索索引的链上数据
         * Summary: 检索索引的链上数据
         */
        public async Task<QueryDatasearchSearchResponse> QueryDatasearchSearchAsync(QueryDatasearchSearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDatasearchSearchExAsync(request, headers, runtime);
        }

        /**
         * Description: 检索索引的链上数据
         * Summary: 检索索引的链上数据
         */
        public QueryDatasearchSearchResponse QueryDatasearchSearchEx(QueryDatasearchSearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatasearchSearchResponse>(DoRequest("1.0", "antchain.baasdatagw.datasearch.search.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 检索索引的链上数据
         * Summary: 检索索引的链上数据
         */
        public async Task<QueryDatasearchSearchResponse> QueryDatasearchSearchExAsync(QueryDatasearchSearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDatasearchSearchResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.datasearch.search.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对某个数据类型的数据开启索引；该方法可重入
         * Summary: 开启数据索引
         */
        public StartDatasearchIndexResponse StartDatasearchIndex(StartDatasearchIndexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartDatasearchIndexEx(request, headers, runtime);
        }

        /**
         * Description: 针对某个数据类型的数据开启索引；该方法可重入
         * Summary: 开启数据索引
         */
        public async Task<StartDatasearchIndexResponse> StartDatasearchIndexAsync(StartDatasearchIndexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartDatasearchIndexExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对某个数据类型的数据开启索引；该方法可重入
         * Summary: 开启数据索引
         */
        public StartDatasearchIndexResponse StartDatasearchIndexEx(StartDatasearchIndexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartDatasearchIndexResponse>(DoRequest("1.0", "antchain.baasdatagw.datasearch.index.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对某个数据类型的数据开启索引；该方法可重入
         * Summary: 开启数据索引
         */
        public async Task<StartDatasearchIndexResponse> StartDatasearchIndexExAsync(StartDatasearchIndexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartDatasearchIndexResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.datasearch.index.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对某个分组的数据停止索引；该方法可重入
         * Summary: 停止数据索引
         */
        public StopDatasearchIndexResponse StopDatasearchIndex(StopDatasearchIndexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StopDatasearchIndexEx(request, headers, runtime);
        }

        /**
         * Description: 针对某个分组的数据停止索引；该方法可重入
         * Summary: 停止数据索引
         */
        public async Task<StopDatasearchIndexResponse> StopDatasearchIndexAsync(StopDatasearchIndexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StopDatasearchIndexExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对某个分组的数据停止索引；该方法可重入
         * Summary: 停止数据索引
         */
        public StopDatasearchIndexResponse StopDatasearchIndexEx(StopDatasearchIndexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopDatasearchIndexResponse>(DoRequest("1.0", "antchain.baasdatagw.datasearch.index.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对某个分组的数据停止索引；该方法可重入
         * Summary: 停止数据索引
         */
        public async Task<StopDatasearchIndexResponse> StopDatasearchIndexExAsync(StopDatasearchIndexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StopDatasearchIndexResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.datasearch.index.stop", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
         * Summary: 删除数据索引
         */
        public RemoveDatasearchIndexResponse RemoveDatasearchIndex(RemoveDatasearchIndexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RemoveDatasearchIndexEx(request, headers, runtime);
        }

        /**
         * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
         * Summary: 删除数据索引
         */
        public async Task<RemoveDatasearchIndexResponse> RemoveDatasearchIndexAsync(RemoveDatasearchIndexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RemoveDatasearchIndexExAsync(request, headers, runtime);
        }

        /**
         * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
         * Summary: 删除数据索引
         */
        public RemoveDatasearchIndexResponse RemoveDatasearchIndexEx(RemoveDatasearchIndexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveDatasearchIndexResponse>(DoRequest("1.0", "antchain.baasdatagw.datasearch.index.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
         * Summary: 删除数据索引
         */
        public async Task<RemoveDatasearchIndexResponse> RemoveDatasearchIndexExAsync(RemoveDatasearchIndexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RemoveDatasearchIndexResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.datasearch.index.remove", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
         * Summary: 查询数据索引进度
         */
        public GetDatasearchIndexResponse GetDatasearchIndex(GetDatasearchIndexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDatasearchIndexEx(request, headers, runtime);
        }

        /**
         * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
         * Summary: 查询数据索引进度
         */
        public async Task<GetDatasearchIndexResponse> GetDatasearchIndexAsync(GetDatasearchIndexRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDatasearchIndexExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
         * Summary: 查询数据索引进度
         */
        public GetDatasearchIndexResponse GetDatasearchIndexEx(GetDatasearchIndexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDatasearchIndexResponse>(DoRequest("1.0", "antchain.baasdatagw.datasearch.index.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
         * Summary: 查询数据索引进度
         */
        public async Task<GetDatasearchIndexResponse> GetDatasearchIndexExAsync(GetDatasearchIndexRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDatasearchIndexResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.datasearch.index.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出租户在链上的所有合约Meta
         * Summary: 列出租户在链上的所有合约Meta
         */
        public ListContractmetaResponse ListContractmeta(ListContractmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListContractmetaEx(request, headers, runtime);
        }

        /**
         * Description: 列出租户在链上的所有合约Meta
         * Summary: 列出租户在链上的所有合约Meta
         */
        public async Task<ListContractmetaResponse> ListContractmetaAsync(ListContractmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListContractmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出租户在链上的所有合约Meta
         * Summary: 列出租户在链上的所有合约Meta
         */
        public ListContractmetaResponse ListContractmetaEx(ListContractmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractmetaResponse>(DoRequest("1.0", "antchain.baasdatagw.contractmeta.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出租户在链上的所有合约Meta
         * Summary: 列出租户在链上的所有合约Meta
         */
        public async Task<ListContractmetaResponse> ListContractmetaExAsync(ListContractmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListContractmetaResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.contractmeta.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增合约Meta
         * Summary: 新增合约Meta
         */
        public AddContractmetaResponse AddContractmeta(AddContractmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddContractmetaEx(request, headers, runtime);
        }

        /**
         * Description: 新增合约Meta
         * Summary: 新增合约Meta
         */
        public async Task<AddContractmetaResponse> AddContractmetaAsync(AddContractmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddContractmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 新增合约Meta
         * Summary: 新增合约Meta
         */
        public AddContractmetaResponse AddContractmetaEx(AddContractmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractmetaResponse>(DoRequest("1.0", "antchain.baasdatagw.contractmeta.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新增合约Meta
         * Summary: 新增合约Meta
         */
        public async Task<AddContractmetaResponse> AddContractmetaExAsync(AddContractmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddContractmetaResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.contractmeta.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除合约meta
         * Summary: 删除合约meta
         */
        public DeleteContractmetaResponse DeleteContractmeta(DeleteContractmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteContractmetaEx(request, headers, runtime);
        }

        /**
         * Description: 删除合约meta
         * Summary: 删除合约meta
         */
        public async Task<DeleteContractmetaResponse> DeleteContractmetaAsync(DeleteContractmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteContractmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除合约meta
         * Summary: 删除合约meta
         */
        public DeleteContractmetaResponse DeleteContractmetaEx(DeleteContractmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContractmetaResponse>(DoRequest("1.0", "antchain.baasdatagw.contractmeta.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除合约meta
         * Summary: 删除合约meta
         */
        public async Task<DeleteContractmetaResponse> DeleteContractmetaExAsync(DeleteContractmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteContractmetaResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.contractmeta.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询meta具体信息
         * Summary: 获取meta信息
         */
        public GetContractmetaResponse GetContractmeta(GetContractmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetContractmetaEx(request, headers, runtime);
        }

        /**
         * Description: 查询meta具体信息
         * Summary: 获取meta信息
         */
        public async Task<GetContractmetaResponse> GetContractmetaAsync(GetContractmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetContractmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询meta具体信息
         * Summary: 获取meta信息
         */
        public GetContractmetaResponse GetContractmetaEx(GetContractmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractmetaResponse>(DoRequest("1.0", "antchain.baasdatagw.contractmeta.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询meta具体信息
         * Summary: 获取meta信息
         */
        public async Task<GetContractmetaResponse> GetContractmetaExAsync(GetContractmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetContractmetaResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.contractmeta.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取导出任务预览数据的异步任务ID
         * Summary: 获取导出任务预览数据的异步任务ID
         */
        public CreateDataexportPreviewdataResponse CreateDataexportPreviewdata(CreateDataexportPreviewdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDataexportPreviewdataEx(request, headers, runtime);
        }

        /**
         * Description: 获取导出任务预览数据的异步任务ID
         * Summary: 获取导出任务预览数据的异步任务ID
         */
        public async Task<CreateDataexportPreviewdataResponse> CreateDataexportPreviewdataAsync(CreateDataexportPreviewdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDataexportPreviewdataExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取导出任务预览数据的异步任务ID
         * Summary: 获取导出任务预览数据的异步任务ID
         */
        public CreateDataexportPreviewdataResponse CreateDataexportPreviewdataEx(CreateDataexportPreviewdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataexportPreviewdataResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.previewdata.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取导出任务预览数据的异步任务ID
         * Summary: 获取导出任务预览数据的异步任务ID
         */
        public async Task<CreateDataexportPreviewdataResponse> CreateDataexportPreviewdataExAsync(CreateDataexportPreviewdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataexportPreviewdataResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.previewdata.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据预览任务结果
         * Summary: 查询数据预览任务结果
         */
        public QueryDataexportPreviewdataResponse QueryDataexportPreviewdata(QueryDataexportPreviewdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDataexportPreviewdataEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据预览任务结果
         * Summary: 查询数据预览任务结果
         */
        public async Task<QueryDataexportPreviewdataResponse> QueryDataexportPreviewdataAsync(QueryDataexportPreviewdataRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDataexportPreviewdataExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据预览任务结果
         * Summary: 查询数据预览任务结果
         */
        public QueryDataexportPreviewdataResponse QueryDataexportPreviewdataEx(QueryDataexportPreviewdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataexportPreviewdataResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.previewdata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据预览任务结果
         * Summary: 查询数据预览任务结果
         */
        public async Task<QueryDataexportPreviewdataResponse> QueryDataexportPreviewdataExAsync(QueryDataexportPreviewdataRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataexportPreviewdataResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.previewdata.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询默认字段映射
         * Summary: 查询默认字段映射
         */
        public GetDataexportPreviewsmappingResponse GetDataexportPreviewsmapping(GetDataexportPreviewsmappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetDataexportPreviewsmappingEx(request, headers, runtime);
        }

        /**
         * Description: 查询默认字段映射
         * Summary: 查询默认字段映射
         */
        public async Task<GetDataexportPreviewsmappingResponse> GetDataexportPreviewsmappingAsync(GetDataexportPreviewsmappingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetDataexportPreviewsmappingExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询默认字段映射
         * Summary: 查询默认字段映射
         */
        public GetDataexportPreviewsmappingResponse GetDataexportPreviewsmappingEx(GetDataexportPreviewsmappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataexportPreviewsmappingResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.previewsmapping.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询默认字段映射
         * Summary: 查询默认字段映射
         */
        public async Task<GetDataexportPreviewsmappingResponse> GetDataexportPreviewsmappingExAsync(GetDataexportPreviewsmappingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetDataexportPreviewsmappingResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.previewsmapping.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建导出任务
         * Summary: 创建导出任务
         */
        public CreateDataexportTriggerResponse CreateDataexportTrigger(CreateDataexportTriggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateDataexportTriggerEx(request, headers, runtime);
        }

        /**
         * Description: 创建导出任务
         * Summary: 创建导出任务
         */
        public async Task<CreateDataexportTriggerResponse> CreateDataexportTriggerAsync(CreateDataexportTriggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateDataexportTriggerExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建导出任务
         * Summary: 创建导出任务
         */
        public CreateDataexportTriggerResponse CreateDataexportTriggerEx(CreateDataexportTriggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataexportTriggerResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.trigger.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建导出任务
         * Summary: 创建导出任务
         */
        public async Task<CreateDataexportTriggerResponse> CreateDataexportTriggerExAsync(CreateDataexportTriggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateDataexportTriggerResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.trigger.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询建表语句
         * Summary: 查询建表语句
         */
        public QueryDataexportPreviewsqlResponse QueryDataexportPreviewsql(QueryDataexportPreviewsqlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryDataexportPreviewsqlEx(request, headers, runtime);
        }

        /**
         * Description: 查询建表语句
         * Summary: 查询建表语句
         */
        public async Task<QueryDataexportPreviewsqlResponse> QueryDataexportPreviewsqlAsync(QueryDataexportPreviewsqlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryDataexportPreviewsqlExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询建表语句
         * Summary: 查询建表语句
         */
        public QueryDataexportPreviewsqlResponse QueryDataexportPreviewsqlEx(QueryDataexportPreviewsqlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataexportPreviewsqlResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.previewsql.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询建表语句
         * Summary: 查询建表语句
         */
        public async Task<QueryDataexportPreviewsqlResponse> QueryDataexportPreviewsqlExAsync(QueryDataexportPreviewsqlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryDataexportPreviewsqlResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.previewsql.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出导出任务
         * Summary: 列出导出任务
         */
        public ListDataexportTriggerResponse ListDataexportTrigger(ListDataexportTriggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDataexportTriggerEx(request, headers, runtime);
        }

        /**
         * Description: 列出导出任务
         * Summary: 列出导出任务
         */
        public async Task<ListDataexportTriggerResponse> ListDataexportTriggerAsync(ListDataexportTriggerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDataexportTriggerExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出导出任务
         * Summary: 列出导出任务
         */
        public ListDataexportTriggerResponse ListDataexportTriggerEx(ListDataexportTriggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDataexportTriggerResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.trigger.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出导出任务
         * Summary: 列出导出任务
         */
        public async Task<ListDataexportTriggerResponse> ListDataexportTriggerExAsync(ListDataexportTriggerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDataexportTriggerResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.trigger.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改导出任务状态
         * Summary: 修改导出任务状态
         */
        public OperateDataexportTriggerstatusResponse OperateDataexportTriggerstatus(OperateDataexportTriggerstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateDataexportTriggerstatusEx(request, headers, runtime);
        }

        /**
         * Description: 修改导出任务状态
         * Summary: 修改导出任务状态
         */
        public async Task<OperateDataexportTriggerstatusResponse> OperateDataexportTriggerstatusAsync(OperateDataexportTriggerstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateDataexportTriggerstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改导出任务状态
         * Summary: 修改导出任务状态
         */
        public OperateDataexportTriggerstatusResponse OperateDataexportTriggerstatusEx(OperateDataexportTriggerstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDataexportTriggerstatusResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.triggerstatus.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改导出任务状态
         * Summary: 修改导出任务状态
         */
        public async Task<OperateDataexportTriggerstatusResponse> OperateDataexportTriggerstatusExAsync(OperateDataexportTriggerstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDataexportTriggerstatusResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.triggerstatus.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改导出任务配置
         * Summary: 修改导出任务配置
         */
        public OperateDataexportTriggerconfigResponse OperateDataexportTriggerconfig(OperateDataexportTriggerconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateDataexportTriggerconfigEx(request, headers, runtime);
        }

        /**
         * Description: 修改导出任务配置
         * Summary: 修改导出任务配置
         */
        public async Task<OperateDataexportTriggerconfigResponse> OperateDataexportTriggerconfigAsync(OperateDataexportTriggerconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateDataexportTriggerconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改导出任务配置
         * Summary: 修改导出任务配置
         */
        public OperateDataexportTriggerconfigResponse OperateDataexportTriggerconfigEx(OperateDataexportTriggerconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDataexportTriggerconfigResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.triggerconfig.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改导出任务配置
         * Summary: 修改导出任务配置
         */
        public async Task<OperateDataexportTriggerconfigResponse> OperateDataexportTriggerconfigExAsync(OperateDataexportTriggerconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDataexportTriggerconfigResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.triggerconfig.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出导出任务失败日志
         * Summary: 列出导出任务失败日志
         */
        public ListDataexportTriggerlogResponse ListDataexportTriggerlog(ListDataexportTriggerlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDataexportTriggerlogEx(request, headers, runtime);
        }

        /**
         * Description: 列出导出任务失败日志
         * Summary: 列出导出任务失败日志
         */
        public async Task<ListDataexportTriggerlogResponse> ListDataexportTriggerlogAsync(ListDataexportTriggerlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDataexportTriggerlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出导出任务失败日志
         * Summary: 列出导出任务失败日志
         */
        public ListDataexportTriggerlogResponse ListDataexportTriggerlogEx(ListDataexportTriggerlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDataexportTriggerlogResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.triggerlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出导出任务失败日志
         * Summary: 列出导出任务失败日志
         */
        public async Task<ListDataexportTriggerlogResponse> ListDataexportTriggerlogExAsync(ListDataexportTriggerlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDataexportTriggerlogResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.triggerlog.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 操作导出任务失败日志
         * Summary: 操作导出任务失败日志
         */
        public OperateDataexportTriggerlogResponse OperateDataexportTriggerlog(OperateDataexportTriggerlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateDataexportTriggerlogEx(request, headers, runtime);
        }

        /**
         * Description: 操作导出任务失败日志
         * Summary: 操作导出任务失败日志
         */
        public async Task<OperateDataexportTriggerlogResponse> OperateDataexportTriggerlogAsync(OperateDataexportTriggerlogRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateDataexportTriggerlogExAsync(request, headers, runtime);
        }

        /**
         * Description: 操作导出任务失败日志
         * Summary: 操作导出任务失败日志
         */
        public OperateDataexportTriggerlogResponse OperateDataexportTriggerlogEx(OperateDataexportTriggerlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDataexportTriggerlogResponse>(DoRequest("1.0", "antchain.baasdatagw.dataexport.triggerlog.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 操作导出任务失败日志
         * Summary: 操作导出任务失败日志
         */
        public async Task<OperateDataexportTriggerlogResponse> OperateDataexportTriggerlogExAsync(OperateDataexportTriggerlogRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateDataexportTriggerlogResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.dataexport.triggerlog.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询地址标签
         * Summary: 查询地址标签
         */
        public QueryChaininsightLabelsResponse QueryChaininsightLabels(QueryChaininsightLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightLabelsEx(request, headers, runtime);
        }

        /**
         * Description: 查询地址标签
         * Summary: 查询地址标签
         */
        public async Task<QueryChaininsightLabelsResponse> QueryChaininsightLabelsAsync(QueryChaininsightLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightLabelsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询地址标签
         * Summary: 查询地址标签
         */
        public QueryChaininsightLabelsResponse QueryChaininsightLabelsEx(QueryChaininsightLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightLabelsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.labels.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询地址标签
         * Summary: 查询地址标签
         */
        public async Task<QueryChaininsightLabelsResponse> QueryChaininsightLabelsExAsync(QueryChaininsightLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightLabelsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.labels.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新地址标签
         * Summary: 更新地址标签
         */
        public UpdateChaininsightLabelsResponse UpdateChaininsightLabels(UpdateChaininsightLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateChaininsightLabelsEx(request, headers, runtime);
        }

        /**
         * Description: 更新地址标签
         * Summary: 更新地址标签
         */
        public async Task<UpdateChaininsightLabelsResponse> UpdateChaininsightLabelsAsync(UpdateChaininsightLabelsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateChaininsightLabelsExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新地址标签
         * Summary: 更新地址标签
         */
        public UpdateChaininsightLabelsResponse UpdateChaininsightLabelsEx(UpdateChaininsightLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateChaininsightLabelsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.labels.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新地址标签
         * Summary: 更新地址标签
         */
        public async Task<UpdateChaininsightLabelsResponse> UpdateChaininsightLabelsExAsync(UpdateChaininsightLabelsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateChaininsightLabelsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.labels.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上搜索
         * Summary: 链上搜索
         */
        public QueryChaininsightSearchResponse QueryChaininsightSearch(QueryChaininsightSearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightSearchEx(request, headers, runtime);
        }

        /**
         * Description: 链上搜索
         * Summary: 链上搜索
         */
        public async Task<QueryChaininsightSearchResponse> QueryChaininsightSearchAsync(QueryChaininsightSearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightSearchExAsync(request, headers, runtime);
        }

        /**
         * Description: 链上搜索
         * Summary: 链上搜索
         */
        public QueryChaininsightSearchResponse QueryChaininsightSearchEx(QueryChaininsightSearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightSearchResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.search.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 链上搜索
         * Summary: 链上搜索
         */
        public async Task<QueryChaininsightSearchResponse> QueryChaininsightSearchExAsync(QueryChaininsightSearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightSearchResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.search.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上地址详情
         * Summary: 查询链上地址详情
         */
        public QueryChaininsightAddressResponse QueryChaininsightAddress(QueryChaininsightAddressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightAddressEx(request, headers, runtime);
        }

        /**
         * Description: 查询链上地址详情
         * Summary: 查询链上地址详情
         */
        public async Task<QueryChaininsightAddressResponse> QueryChaininsightAddressAsync(QueryChaininsightAddressRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightAddressExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链上地址详情
         * Summary: 查询链上地址详情
         */
        public QueryChaininsightAddressResponse QueryChaininsightAddressEx(QueryChaininsightAddressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightAddressResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.address.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上地址详情
         * Summary: 查询链上地址详情
         */
        public async Task<QueryChaininsightAddressResponse> QueryChaininsightAddressExAsync(QueryChaininsightAddressRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightAddressResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.address.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上交易详情
         * Summary: 查询链上交易详情
         */
        public QueryChaininsightTransactionResponse QueryChaininsightTransaction(QueryChaininsightTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightTransactionEx(request, headers, runtime);
        }

        /**
         * Description: 查询链上交易详情
         * Summary: 查询链上交易详情
         */
        public async Task<QueryChaininsightTransactionResponse> QueryChaininsightTransactionAsync(QueryChaininsightTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightTransactionExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链上交易详情
         * Summary: 查询链上交易详情
         */
        public QueryChaininsightTransactionResponse QueryChaininsightTransactionEx(QueryChaininsightTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightTransactionResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.transaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上交易详情
         * Summary: 查询链上交易详情
         */
        public async Task<QueryChaininsightTransactionResponse> QueryChaininsightTransactionExAsync(QueryChaininsightTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightTransactionResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.transaction.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上区块详情
         * Summary: 查询链上区块详情
         */
        public QueryChaininsightBlockResponse QueryChaininsightBlock(QueryChaininsightBlockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightBlockEx(request, headers, runtime);
        }

        /**
         * Description: 查询链上区块详情
         * Summary: 查询链上区块详情
         */
        public async Task<QueryChaininsightBlockResponse> QueryChaininsightBlockAsync(QueryChaininsightBlockRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightBlockExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链上区块详情
         * Summary: 查询链上区块详情
         */
        public QueryChaininsightBlockResponse QueryChaininsightBlockEx(QueryChaininsightBlockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightBlockResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.block.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上区块详情
         * Summary: 查询链上区块详情
         */
        public async Task<QueryChaininsightBlockResponse> QueryChaininsightBlockExAsync(QueryChaininsightBlockRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightBlockResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.block.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询地址近期交易
         * Summary: 查询地址近期交易
         */
        public QueryChaininsightAddresslatesttxsResponse QueryChaininsightAddresslatesttxs(QueryChaininsightAddresslatesttxsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightAddresslatesttxsEx(request, headers, runtime);
        }

        /**
         * Description: 查询地址近期交易
         * Summary: 查询地址近期交易
         */
        public async Task<QueryChaininsightAddresslatesttxsResponse> QueryChaininsightAddresslatesttxsAsync(QueryChaininsightAddresslatesttxsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightAddresslatesttxsExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询地址近期交易
         * Summary: 查询地址近期交易
         */
        public QueryChaininsightAddresslatesttxsResponse QueryChaininsightAddresslatesttxsEx(QueryChaininsightAddresslatesttxsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightAddresslatesttxsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.addresslatesttxs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询地址近期交易
         * Summary: 查询地址近期交易
         */
        public async Task<QueryChaininsightAddresslatesttxsResponse> QueryChaininsightAddresslatesttxsExAsync(QueryChaininsightAddresslatesttxsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightAddresslatesttxsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.addresslatesttxs.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出合约全部接口
         * Summary: 列出合约全部接口
         */
        public ListChaininsightContractinterfaceResponse ListChaininsightContractinterface(ListChaininsightContractinterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListChaininsightContractinterfaceEx(request, headers, runtime);
        }

        /**
         * Description: 列出合约全部接口
         * Summary: 列出合约全部接口
         */
        public async Task<ListChaininsightContractinterfaceResponse> ListChaininsightContractinterfaceAsync(ListChaininsightContractinterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListChaininsightContractinterfaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出合约全部接口
         * Summary: 列出合约全部接口
         */
        public ListChaininsightContractinterfaceResponse ListChaininsightContractinterfaceEx(ListChaininsightContractinterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChaininsightContractinterfaceResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出合约全部接口
         * Summary: 列出合约全部接口
         */
        public async Task<ListChaininsightContractinterfaceResponse> ListChaininsightContractinterfaceExAsync(ListChaininsightContractinterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChaininsightContractinterfaceResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.contractinterface.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询合约接口信息
         * Summary: 查询合约接口信息
         */
        public DetailChaininsightContractinterfaceResponse DetailChaininsightContractinterface(DetailChaininsightContractinterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DetailChaininsightContractinterfaceEx(request, headers, runtime);
        }

        /**
         * Description: 查询合约接口信息
         * Summary: 查询合约接口信息
         */
        public async Task<DetailChaininsightContractinterfaceResponse> DetailChaininsightContractinterfaceAsync(DetailChaininsightContractinterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DetailChaininsightContractinterfaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询合约接口信息
         * Summary: 查询合约接口信息
         */
        public DetailChaininsightContractinterfaceResponse DetailChaininsightContractinterfaceEx(DetailChaininsightContractinterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailChaininsightContractinterfaceResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询合约接口信息
         * Summary: 查询合约接口信息
         */
        public async Task<DetailChaininsightContractinterfaceResponse> DetailChaininsightContractinterfaceExAsync(DetailChaininsightContractinterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DetailChaininsightContractinterfaceResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.contractinterface.detail", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新合约接口信息
         * Summary: 更新合约接口信息
         */
        public UpdateChaininsightContractinterfaceResponse UpdateChaininsightContractinterface(UpdateChaininsightContractinterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateChaininsightContractinterfaceEx(request, headers, runtime);
        }

        /**
         * Description: 更新合约接口信息
         * Summary: 更新合约接口信息
         */
        public async Task<UpdateChaininsightContractinterfaceResponse> UpdateChaininsightContractinterfaceAsync(UpdateChaininsightContractinterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateChaininsightContractinterfaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新合约接口信息
         * Summary: 更新合约接口信息
         */
        public UpdateChaininsightContractinterfaceResponse UpdateChaininsightContractinterfaceEx(UpdateChaininsightContractinterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateChaininsightContractinterfaceResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新合约接口信息
         * Summary: 更新合约接口信息
         */
        public async Task<UpdateChaininsightContractinterfaceResponse> UpdateChaininsightContractinterfaceExAsync(UpdateChaininsightContractinterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateChaininsightContractinterfaceResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.contractinterface.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传合约ABI文件
         * Summary: 上传合约ABI文件
         */
        public UploadChaininsightAbiResponse UploadChaininsightAbi(UploadChaininsightAbiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadChaininsightAbiEx(request, headers, runtime);
        }

        /**
         * Description: 上传合约ABI文件
         * Summary: 上传合约ABI文件
         */
        public async Task<UploadChaininsightAbiResponse> UploadChaininsightAbiAsync(UploadChaininsightAbiRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadChaininsightAbiExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传合约ABI文件
         * Summary: 上传合约ABI文件
         */
        public UploadChaininsightAbiResponse UploadChaininsightAbiEx(UploadChaininsightAbiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadChaininsightAbiResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.abi.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传合约ABI文件
         * Summary: 上传合约ABI文件
         */
        public async Task<UploadChaininsightAbiResponse> UploadChaininsightAbiExAsync(UploadChaininsightAbiRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadChaininsightAbiResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.abi.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询地址的接收交易数量趋势
         * Summary: 查询地址的接收交易数量趋势
         */
        public QueryChaininsightAddresshistogramrxResponse QueryChaininsightAddresshistogramrx(QueryChaininsightAddresshistogramrxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightAddresshistogramrxEx(request, headers, runtime);
        }

        /**
         * Description: 查询地址的接收交易数量趋势
         * Summary: 查询地址的接收交易数量趋势
         */
        public async Task<QueryChaininsightAddresshistogramrxResponse> QueryChaininsightAddresshistogramrxAsync(QueryChaininsightAddresshistogramrxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightAddresshistogramrxExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询地址的接收交易数量趋势
         * Summary: 查询地址的接收交易数量趋势
         */
        public QueryChaininsightAddresshistogramrxResponse QueryChaininsightAddresshistogramrxEx(QueryChaininsightAddresshistogramrxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightAddresshistogramrxResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.addresshistogramrx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询地址的接收交易数量趋势
         * Summary: 查询地址的接收交易数量趋势
         */
        public async Task<QueryChaininsightAddresshistogramrxResponse> QueryChaininsightAddresshistogramrxExAsync(QueryChaininsightAddresshistogramrxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightAddresshistogramrxResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.addresshistogramrx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询地址的发送交易数量趋势
         * Summary: 查询地址的发送交易数量趋势
         */
        public QueryChaininsightAddresshistogramtxResponse QueryChaininsightAddresshistogramtx(QueryChaininsightAddresshistogramtxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightAddresshistogramtxEx(request, headers, runtime);
        }

        /**
         * Description: 查询地址的发送交易数量趋势
         * Summary: 查询地址的发送交易数量趋势
         */
        public async Task<QueryChaininsightAddresshistogramtxResponse> QueryChaininsightAddresshistogramtxAsync(QueryChaininsightAddresshistogramtxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightAddresshistogramtxExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询地址的发送交易数量趋势
         * Summary: 查询地址的发送交易数量趋势
         */
        public QueryChaininsightAddresshistogramtxResponse QueryChaininsightAddresshistogramtxEx(QueryChaininsightAddresshistogramtxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightAddresshistogramtxResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.addresshistogramtx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询地址的发送交易数量趋势
         * Summary: 查询地址的发送交易数量趋势
         */
        public async Task<QueryChaininsightAddresshistogramtxResponse> QueryChaininsightAddresshistogramtxExAsync(QueryChaininsightAddresshistogramtxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightAddresshistogramtxResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.addresshistogramtx.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链交易数量趋势
         * Summary: 查询链交易数量趋势
         */
        public QueryChaininsightChaintxhistogramResponse QueryChaininsightChaintxhistogram(QueryChaininsightChaintxhistogramRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightChaintxhistogramEx(request, headers, runtime);
        }

        /**
         * Description: 查询链交易数量趋势
         * Summary: 查询链交易数量趋势
         */
        public async Task<QueryChaininsightChaintxhistogramResponse> QueryChaininsightChaintxhistogramAsync(QueryChaininsightChaintxhistogramRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightChaintxhistogramExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链交易数量趋势
         * Summary: 查询链交易数量趋势
         */
        public QueryChaininsightChaintxhistogramResponse QueryChaininsightChaintxhistogramEx(QueryChaininsightChaintxhistogramRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightChaintxhistogramResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.chaintxhistogram.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链交易数量趋势
         * Summary: 查询链交易数量趋势
         */
        public async Task<QueryChaininsightChaintxhistogramResponse> QueryChaininsightChaintxhistogramExAsync(QueryChaininsightChaintxhistogramRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightChaintxhistogramResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.chaintxhistogram.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询链上交易详情
         * Summary: 批量查询链上交易详情
         */
        public BatchqueryChaininsightTransactionResponse BatchqueryChaininsightTransaction(BatchqueryChaininsightTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BatchqueryChaininsightTransactionEx(request, headers, runtime);
        }

        /**
         * Description: 批量查询链上交易详情
         * Summary: 批量查询链上交易详情
         */
        public async Task<BatchqueryChaininsightTransactionResponse> BatchqueryChaininsightTransactionAsync(BatchqueryChaininsightTransactionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BatchqueryChaininsightTransactionExAsync(request, headers, runtime);
        }

        /**
         * Description: 批量查询链上交易详情
         * Summary: 批量查询链上交易详情
         */
        public BatchqueryChaininsightTransactionResponse BatchqueryChaininsightTransactionEx(BatchqueryChaininsightTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryChaininsightTransactionResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.transaction.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 批量查询链上交易详情
         * Summary: 批量查询链上交易详情
         */
        public async Task<BatchqueryChaininsightTransactionResponse> BatchqueryChaininsightTransactionExAsync(BatchqueryChaininsightTransactionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BatchqueryChaininsightTransactionResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.transaction.batchquery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统计任务
         * Summary: 查询统计任务
         */
        public ListChaininsightStatisticResponse ListChaininsightStatistic(ListChaininsightStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListChaininsightStatisticEx(request, headers, runtime);
        }

        /**
         * Description: 查询统计任务
         * Summary: 查询统计任务
         */
        public async Task<ListChaininsightStatisticResponse> ListChaininsightStatisticAsync(ListChaininsightStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListChaininsightStatisticExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询统计任务
         * Summary: 查询统计任务
         */
        public ListChaininsightStatisticResponse ListChaininsightStatisticEx(ListChaininsightStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChaininsightStatisticResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统计任务
         * Summary: 查询统计任务
         */
        public async Task<ListChaininsightStatisticResponse> ListChaininsightStatisticExAsync(ListChaininsightStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChaininsightStatisticResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statistic.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新建统计任务
         * Summary: 新建统计任务
         */
        public AddChaininsightStatisticResponse AddChaininsightStatistic(AddChaininsightStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddChaininsightStatisticEx(request, headers, runtime);
        }

        /**
         * Description: 新建统计任务
         * Summary: 新建统计任务
         */
        public async Task<AddChaininsightStatisticResponse> AddChaininsightStatisticAsync(AddChaininsightStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddChaininsightStatisticExAsync(request, headers, runtime);
        }

        /**
         * Description: 新建统计任务
         * Summary: 新建统计任务
         */
        public AddChaininsightStatisticResponse AddChaininsightStatisticEx(AddChaininsightStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddChaininsightStatisticResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 新建统计任务
         * Summary: 新建统计任务
         */
        public async Task<AddChaininsightStatisticResponse> AddChaininsightStatisticExAsync(AddChaininsightStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddChaininsightStatisticResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statistic.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 操作统计任务
         * Summary: 操作统计任务
         */
        public OperateChaininsightStatisticResponse OperateChaininsightStatistic(OperateChaininsightStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateChaininsightStatisticEx(request, headers, runtime);
        }

        /**
         * Description: 操作统计任务
         * Summary: 操作统计任务
         */
        public async Task<OperateChaininsightStatisticResponse> OperateChaininsightStatisticAsync(OperateChaininsightStatisticRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateChaininsightStatisticExAsync(request, headers, runtime);
        }

        /**
         * Description: 操作统计任务
         * Summary: 操作统计任务
         */
        public OperateChaininsightStatisticResponse OperateChaininsightStatisticEx(OperateChaininsightStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateChaininsightStatisticResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statistic.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 操作统计任务
         * Summary: 操作统计任务
         */
        public async Task<OperateChaininsightStatisticResponse> OperateChaininsightStatisticExAsync(OperateChaininsightStatisticRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateChaininsightStatisticResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statistic.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统计任务的统计结果直方图
         * Summary: 查询统计任务的统计结果直方图
         */
        public QueryChaininsightStatistichistogramResponse QueryChaininsightStatistichistogram(QueryChaininsightStatistichistogramRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightStatistichistogramEx(request, headers, runtime);
        }

        /**
         * Description: 查询统计任务的统计结果直方图
         * Summary: 查询统计任务的统计结果直方图
         */
        public async Task<QueryChaininsightStatistichistogramResponse> QueryChaininsightStatistichistogramAsync(QueryChaininsightStatistichistogramRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightStatistichistogramExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询统计任务的统计结果直方图
         * Summary: 查询统计任务的统计结果直方图
         */
        public QueryChaininsightStatistichistogramResponse QueryChaininsightStatistichistogramEx(QueryChaininsightStatistichistogramRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightStatistichistogramResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statistichistogram.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统计任务的统计结果直方图
         * Summary: 查询统计任务的统计结果直方图
         */
        public async Task<QueryChaininsightStatistichistogramResponse> QueryChaininsightStatistichistogramExAsync(QueryChaininsightStatistichistogramRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightStatistichistogramResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statistichistogram.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统计任务的统计结果表格
         * Summary: 查询统计任务的统计结果表格
         */
        public QueryChaininsightStatistictableResponse QueryChaininsightStatistictable(QueryChaininsightStatistictableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightStatistictableEx(request, headers, runtime);
        }

        /**
         * Description: 查询统计任务的统计结果表格
         * Summary: 查询统计任务的统计结果表格
         */
        public async Task<QueryChaininsightStatistictableResponse> QueryChaininsightStatistictableAsync(QueryChaininsightStatistictableRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightStatistictableExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询统计任务的统计结果表格
         * Summary: 查询统计任务的统计结果表格
         */
        public QueryChaininsightStatistictableResponse QueryChaininsightStatistictableEx(QueryChaininsightStatistictableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightStatistictableResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statistictable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询统计任务的统计结果表格
         * Summary: 查询统计任务的统计结果表格
         */
        public async Task<QueryChaininsightStatistictableResponse> QueryChaininsightStatistictableExAsync(QueryChaininsightStatistictableRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightStatistictableResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statistictable.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成支付宝小程序二维码
         * Summary: 生成支付宝小程序二维码
         */
        public CreateChaininsightQrcodeResponse CreateChaininsightQrcode(CreateChaininsightQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateChaininsightQrcodeEx(request, headers, runtime);
        }

        /**
         * Description: 生成支付宝小程序二维码
         * Summary: 生成支付宝小程序二维码
         */
        public async Task<CreateChaininsightQrcodeResponse> CreateChaininsightQrcodeAsync(CreateChaininsightQrcodeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateChaininsightQrcodeExAsync(request, headers, runtime);
        }

        /**
         * Description: 生成支付宝小程序二维码
         * Summary: 生成支付宝小程序二维码
         */
        public CreateChaininsightQrcodeResponse CreateChaininsightQrcodeEx(CreateChaininsightQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateChaininsightQrcodeResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.qrcode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 生成支付宝小程序二维码
         * Summary: 生成支付宝小程序二维码
         */
        public async Task<CreateChaininsightQrcodeResponse> CreateChaininsightQrcodeExAsync(CreateChaininsightQrcodeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateChaininsightQrcodeResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.qrcode.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通数据搜索服务
         * Summary: 开通数据搜索服务
         */
        public OpenChaininsightDatasearchResponse OpenChaininsightDatasearch(OpenChaininsightDatasearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OpenChaininsightDatasearchEx(request, headers, runtime);
        }

        /**
         * Description: 开通数据搜索服务
         * Summary: 开通数据搜索服务
         */
        public async Task<OpenChaininsightDatasearchResponse> OpenChaininsightDatasearchAsync(OpenChaininsightDatasearchRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OpenChaininsightDatasearchExAsync(request, headers, runtime);
        }

        /**
         * Description: 开通数据搜索服务
         * Summary: 开通数据搜索服务
         */
        public OpenChaininsightDatasearchResponse OpenChaininsightDatasearchEx(OpenChaininsightDatasearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenChaininsightDatasearchResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.datasearch.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 开通数据搜索服务
         * Summary: 开通数据搜索服务
         */
        public async Task<OpenChaininsightDatasearchResponse> OpenChaininsightDatasearchExAsync(OpenChaininsightDatasearchRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OpenChaininsightDatasearchResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.datasearch.open", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化场景下查询所有链的数据搜索服务状态
         * Summary: 私有化场景下查询所有链的数据搜索服务状态
         */
        public QueryChaininsightPrivatedatasearchstatusResponse QueryChaininsightPrivatedatasearchstatus(QueryChaininsightPrivatedatasearchstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightPrivatedatasearchstatusEx(request, headers, runtime);
        }

        /**
         * Description: 私有化场景下查询所有链的数据搜索服务状态
         * Summary: 私有化场景下查询所有链的数据搜索服务状态
         */
        public async Task<QueryChaininsightPrivatedatasearchstatusResponse> QueryChaininsightPrivatedatasearchstatusAsync(QueryChaininsightPrivatedatasearchstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightPrivatedatasearchstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 私有化场景下查询所有链的数据搜索服务状态
         * Summary: 私有化场景下查询所有链的数据搜索服务状态
         */
        public QueryChaininsightPrivatedatasearchstatusResponse QueryChaininsightPrivatedatasearchstatusEx(QueryChaininsightPrivatedatasearchstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightPrivatedatasearchstatusResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.privatedatasearchstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化场景下查询所有链的数据搜索服务状态
         * Summary: 私有化场景下查询所有链的数据搜索服务状态
         */
        public async Task<QueryChaininsightPrivatedatasearchstatusResponse> QueryChaininsightPrivatedatasearchstatusExAsync(QueryChaininsightPrivatedatasearchstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightPrivatedatasearchstatusResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.privatedatasearchstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加看板
         * Summary: 添加看板
         */
        public AddChaininsightWidgetsResponse AddChaininsightWidgets(AddChaininsightWidgetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddChaininsightWidgetsEx(request, headers, runtime);
        }

        /**
         * Description: 添加看板
         * Summary: 添加看板
         */
        public async Task<AddChaininsightWidgetsResponse> AddChaininsightWidgetsAsync(AddChaininsightWidgetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddChaininsightWidgetsExAsync(request, headers, runtime);
        }

        /**
         * Description: 添加看板
         * Summary: 添加看板
         */
        public AddChaininsightWidgetsResponse AddChaininsightWidgetsEx(AddChaininsightWidgetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddChaininsightWidgetsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 添加看板
         * Summary: 添加看板
         */
        public async Task<AddChaininsightWidgetsResponse> AddChaininsightWidgetsExAsync(AddChaininsightWidgetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddChaininsightWidgetsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.widgets.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取看板列表
         * Summary: 获取看板列表
         */
        public ListChaininsightWidgetsResponse ListChaininsightWidgets(ListChaininsightWidgetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListChaininsightWidgetsEx(request, headers, runtime);
        }

        /**
         * Description: 获取看板列表
         * Summary: 获取看板列表
         */
        public async Task<ListChaininsightWidgetsResponse> ListChaininsightWidgetsAsync(ListChaininsightWidgetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListChaininsightWidgetsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取看板列表
         * Summary: 获取看板列表
         */
        public ListChaininsightWidgetsResponse ListChaininsightWidgetsEx(ListChaininsightWidgetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChaininsightWidgetsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取看板列表
         * Summary: 获取看板列表
         */
        public async Task<ListChaininsightWidgetsResponse> ListChaininsightWidgetsExAsync(ListChaininsightWidgetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChaininsightWidgetsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.widgets.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上活跃接收地址
         * Summary: 分页查询链上活跃接收地址
         */
        public QueryChaininsightTablesactivereceiverResponse QueryChaininsightTablesactivereceiver(QueryChaininsightTablesactivereceiverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightTablesactivereceiverEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上活跃接收地址
         * Summary: 分页查询链上活跃接收地址
         */
        public async Task<QueryChaininsightTablesactivereceiverResponse> QueryChaininsightTablesactivereceiverAsync(QueryChaininsightTablesactivereceiverRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightTablesactivereceiverExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上活跃接收地址
         * Summary: 分页查询链上活跃接收地址
         */
        public QueryChaininsightTablesactivereceiverResponse QueryChaininsightTablesactivereceiverEx(QueryChaininsightTablesactivereceiverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightTablesactivereceiverResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.tablesactivereceiver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上活跃接收地址
         * Summary: 分页查询链上活跃接收地址
         */
        public async Task<QueryChaininsightTablesactivereceiverResponse> QueryChaininsightTablesactivereceiverExAsync(QueryChaininsightTablesactivereceiverRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightTablesactivereceiverResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.tablesactivereceiver.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上活跃发送地址
         * Summary: 分页查询链上活跃发送地址
         */
        public QueryChaininsightTablesactivesenderResponse QueryChaininsightTablesactivesender(QueryChaininsightTablesactivesenderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightTablesactivesenderEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上活跃发送地址
         * Summary: 分页查询链上活跃发送地址
         */
        public async Task<QueryChaininsightTablesactivesenderResponse> QueryChaininsightTablesactivesenderAsync(QueryChaininsightTablesactivesenderRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightTablesactivesenderExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上活跃发送地址
         * Summary: 分页查询链上活跃发送地址
         */
        public QueryChaininsightTablesactivesenderResponse QueryChaininsightTablesactivesenderEx(QueryChaininsightTablesactivesenderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightTablesactivesenderResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.tablesactivesender.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上活跃发送地址
         * Summary: 分页查询链上活跃发送地址
         */
        public async Task<QueryChaininsightTablesactivesenderResponse> QueryChaininsightTablesactivesenderExAsync(QueryChaininsightTablesactivesenderRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightTablesactivesenderResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.tablesactivesender.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上近期合约
         * Summary: 分页查询链上近期合约
         */
        public PagequeryChaininsightLatestcontractsResponse PagequeryChaininsightLatestcontracts(PagequeryChaininsightLatestcontractsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryChaininsightLatestcontractsEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上近期合约
         * Summary: 分页查询链上近期合约
         */
        public async Task<PagequeryChaininsightLatestcontractsResponse> PagequeryChaininsightLatestcontractsAsync(PagequeryChaininsightLatestcontractsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryChaininsightLatestcontractsExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上近期合约
         * Summary: 分页查询链上近期合约
         */
        public PagequeryChaininsightLatestcontractsResponse PagequeryChaininsightLatestcontractsEx(PagequeryChaininsightLatestcontractsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightLatestcontractsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.latestcontracts.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上近期合约
         * Summary: 分页查询链上近期合约
         */
        public async Task<PagequeryChaininsightLatestcontractsResponse> PagequeryChaininsightLatestcontractsExAsync(PagequeryChaininsightLatestcontractsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightLatestcontractsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.latestcontracts.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上近期交易
         * Summary: 分页查询链上近期交易
         */
        public PagequeryChaininsightLatesttxsResponse PagequeryChaininsightLatesttxs(PagequeryChaininsightLatesttxsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryChaininsightLatesttxsEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上近期交易
         * Summary: 分页查询链上近期交易
         */
        public async Task<PagequeryChaininsightLatesttxsResponse> PagequeryChaininsightLatesttxsAsync(PagequeryChaininsightLatesttxsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryChaininsightLatesttxsExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上近期交易
         * Summary: 分页查询链上近期交易
         */
        public PagequeryChaininsightLatesttxsResponse PagequeryChaininsightLatesttxsEx(PagequeryChaininsightLatesttxsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightLatesttxsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.latesttxs.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上近期交易
         * Summary: 分页查询链上近期交易
         */
        public async Task<PagequeryChaininsightLatesttxsResponse> PagequeryChaininsightLatesttxsExAsync(PagequeryChaininsightLatesttxsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightLatesttxsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.latesttxs.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化场景下查询区块链整体状态
         * Summary: 私有化场景下查询区块链整体状态
         */
        public QueryChaininsightPrivatechainsstatusResponse QueryChaininsightPrivatechainsstatus(QueryChaininsightPrivatechainsstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightPrivatechainsstatusEx(request, headers, runtime);
        }

        /**
         * Description: 私有化场景下查询区块链整体状态
         * Summary: 私有化场景下查询区块链整体状态
         */
        public async Task<QueryChaininsightPrivatechainsstatusResponse> QueryChaininsightPrivatechainsstatusAsync(QueryChaininsightPrivatechainsstatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightPrivatechainsstatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 私有化场景下查询区块链整体状态
         * Summary: 私有化场景下查询区块链整体状态
         */
        public QueryChaininsightPrivatechainsstatusResponse QueryChaininsightPrivatechainsstatusEx(QueryChaininsightPrivatechainsstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightPrivatechainsstatusResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.privatechainsstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化场景下查询区块链整体状态
         * Summary: 私有化场景下查询区块链整体状态
         */
        public async Task<QueryChaininsightPrivatechainsstatusResponse> QueryChaininsightPrivatechainsstatusExAsync(QueryChaininsightPrivatechainsstatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightPrivatechainsstatusResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.privatechainsstatus.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化场景下查询链交易数量趋势
         * Summary: 私有化场景下查询链交易数量趋势
         */
        public QueryChaininsightPrivatechaintxhistogramResponse QueryChaininsightPrivatechaintxhistogram(QueryChaininsightPrivatechaintxhistogramRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightPrivatechaintxhistogramEx(request, headers, runtime);
        }

        /**
         * Description: 私有化场景下查询链交易数量趋势
         * Summary: 私有化场景下查询链交易数量趋势
         */
        public async Task<QueryChaininsightPrivatechaintxhistogramResponse> QueryChaininsightPrivatechaintxhistogramAsync(QueryChaininsightPrivatechaintxhistogramRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightPrivatechaintxhistogramExAsync(request, headers, runtime);
        }

        /**
         * Description: 私有化场景下查询链交易数量趋势
         * Summary: 私有化场景下查询链交易数量趋势
         */
        public QueryChaininsightPrivatechaintxhistogramResponse QueryChaininsightPrivatechaintxhistogramEx(QueryChaininsightPrivatechaintxhistogramRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightPrivatechaintxhistogramResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.privatechaintxhistogram.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 私有化场景下查询链交易数量趋势
         * Summary: 私有化场景下查询链交易数量趋势
         */
        public async Task<QueryChaininsightPrivatechaintxhistogramResponse> QueryChaininsightPrivatechaintxhistogramExAsync(QueryChaininsightPrivatechaintxhistogramRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightPrivatechaintxhistogramResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.privatechaintxhistogram.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除数据洞察看板
         * Summary: 删除数据洞察看板
         */
        public DeleteChaininsightWidgetsResponse DeleteChaininsightWidgets(DeleteChaininsightWidgetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteChaininsightWidgetsEx(request, headers, runtime);
        }

        /**
         * Description: 删除数据洞察看板
         * Summary: 删除数据洞察看板
         */
        public async Task<DeleteChaininsightWidgetsResponse> DeleteChaininsightWidgetsAsync(DeleteChaininsightWidgetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteChaininsightWidgetsExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除数据洞察看板
         * Summary: 删除数据洞察看板
         */
        public DeleteChaininsightWidgetsResponse DeleteChaininsightWidgetsEx(DeleteChaininsightWidgetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteChaininsightWidgetsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除数据洞察看板
         * Summary: 删除数据洞察看板
         */
        public async Task<DeleteChaininsightWidgetsResponse> DeleteChaininsightWidgetsExAsync(DeleteChaininsightWidgetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteChaininsightWidgetsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.widgets.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移动看板
         * Summary: 移动看板
         */
        public OperateChaininsightWidgetsmoveResponse OperateChaininsightWidgetsmove(OperateChaininsightWidgetsmoveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateChaininsightWidgetsmoveEx(request, headers, runtime);
        }

        /**
         * Description: 移动看板
         * Summary: 移动看板
         */
        public async Task<OperateChaininsightWidgetsmoveResponse> OperateChaininsightWidgetsmoveAsync(OperateChaininsightWidgetsmoveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateChaininsightWidgetsmoveExAsync(request, headers, runtime);
        }

        /**
         * Description: 移动看板
         * Summary: 移动看板
         */
        public OperateChaininsightWidgetsmoveResponse OperateChaininsightWidgetsmoveEx(OperateChaininsightWidgetsmoveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateChaininsightWidgetsmoveResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.widgetsmove.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 移动看板
         * Summary: 移动看板
         */
        public async Task<OperateChaininsightWidgetsmoveResponse> OperateChaininsightWidgetsmoveExAsync(OperateChaininsightWidgetsmoveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateChaininsightWidgetsmoveResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.widgetsmove.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改看板
         * Summary: 修改看板
         */
        public UpdateChaininsightWidgetsResponse UpdateChaininsightWidgets(UpdateChaininsightWidgetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateChaininsightWidgetsEx(request, headers, runtime);
        }

        /**
         * Description: 修改看板
         * Summary: 修改看板
         */
        public async Task<UpdateChaininsightWidgetsResponse> UpdateChaininsightWidgetsAsync(UpdateChaininsightWidgetsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateChaininsightWidgetsExAsync(request, headers, runtime);
        }

        /**
         * Description: 修改看板
         * Summary: 修改看板
         */
        public UpdateChaininsightWidgetsResponse UpdateChaininsightWidgetsEx(UpdateChaininsightWidgetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateChaininsightWidgetsResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.widgets.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 修改看板
         * Summary: 修改看板
         */
        public async Task<UpdateChaininsightWidgetsResponse> UpdateChaininsightWidgetsExAsync(UpdateChaininsightWidgetsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateChaininsightWidgetsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.widgets.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载合约
         * Summary: 下载合约
         */
        public DownloadChaininsightContractResponse DownloadChaininsightContract(DownloadChaininsightContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DownloadChaininsightContractEx(request, headers, runtime);
        }

        /**
         * Description: 下载合约
         * Summary: 下载合约
         */
        public async Task<DownloadChaininsightContractResponse> DownloadChaininsightContractAsync(DownloadChaininsightContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DownloadChaininsightContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 下载合约
         * Summary: 下载合约
         */
        public DownloadChaininsightContractResponse DownloadChaininsightContractEx(DownloadChaininsightContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadChaininsightContractResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.contract.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 下载合约
         * Summary: 下载合约
         */
        public async Task<DownloadChaininsightContractResponse> DownloadChaininsightContractExAsync(DownloadChaininsightContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DownloadChaininsightContractResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.contract.download", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询修改合约的交易
         * Summary: 查询修改合约的交易
         */
        public PagequeryChaininsightContractmodifytxResponse PagequeryChaininsightContractmodifytx(PagequeryChaininsightContractmodifytxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryChaininsightContractmodifytxEx(request, headers, runtime);
        }

        /**
         * Description: 查询修改合约的交易
         * Summary: 查询修改合约的交易
         */
        public async Task<PagequeryChaininsightContractmodifytxResponse> PagequeryChaininsightContractmodifytxAsync(PagequeryChaininsightContractmodifytxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryChaininsightContractmodifytxExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询修改合约的交易
         * Summary: 查询修改合约的交易
         */
        public PagequeryChaininsightContractmodifytxResponse PagequeryChaininsightContractmodifytxEx(PagequeryChaininsightContractmodifytxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightContractmodifytxResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.contractmodifytx.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询修改合约的交易
         * Summary: 查询修改合约的交易
         */
        public async Task<PagequeryChaininsightContractmodifytxResponse> PagequeryChaininsightContractmodifytxExAsync(PagequeryChaininsightContractmodifytxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightContractmodifytxResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.contractmodifytx.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询账户的修改交易
         * Summary: 分页查询账户的修改交易
         */
        public PagequeryChaininsightAccountmodifytxResponse PagequeryChaininsightAccountmodifytx(PagequeryChaininsightAccountmodifytxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryChaininsightAccountmodifytxEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询账户的修改交易
         * Summary: 分页查询账户的修改交易
         */
        public async Task<PagequeryChaininsightAccountmodifytxResponse> PagequeryChaininsightAccountmodifytxAsync(PagequeryChaininsightAccountmodifytxRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryChaininsightAccountmodifytxExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询账户的修改交易
         * Summary: 分页查询账户的修改交易
         */
        public PagequeryChaininsightAccountmodifytxResponse PagequeryChaininsightAccountmodifytxEx(PagequeryChaininsightAccountmodifytxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightAccountmodifytxResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.accountmodifytx.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询账户的修改交易
         * Summary: 分页查询账户的修改交易
         */
        public async Task<PagequeryChaininsightAccountmodifytxResponse> PagequeryChaininsightAccountmodifytxExAsync(PagequeryChaininsightAccountmodifytxRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightAccountmodifytxResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.accountmodifytx.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 返回对应 ERC 类型资产统计所必须的接口
         * Summary: 查询资产统计所必须的接口
         */
        public ListChaininsightAssetinterfacesrequiredResponse ListChaininsightAssetinterfacesrequired(ListChaininsightAssetinterfacesrequiredRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListChaininsightAssetinterfacesrequiredEx(request, headers, runtime);
        }

        /**
         * Description: 返回对应 ERC 类型资产统计所必须的接口
         * Summary: 查询资产统计所必须的接口
         */
        public async Task<ListChaininsightAssetinterfacesrequiredResponse> ListChaininsightAssetinterfacesrequiredAsync(ListChaininsightAssetinterfacesrequiredRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListChaininsightAssetinterfacesrequiredExAsync(request, headers, runtime);
        }

        /**
         * Description: 返回对应 ERC 类型资产统计所必须的接口
         * Summary: 查询资产统计所必须的接口
         */
        public ListChaininsightAssetinterfacesrequiredResponse ListChaininsightAssetinterfacesrequiredEx(ListChaininsightAssetinterfacesrequiredRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChaininsightAssetinterfacesrequiredResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.assetinterfacesrequired.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 返回对应 ERC 类型资产统计所必须的接口
         * Summary: 查询资产统计所必须的接口
         */
        public async Task<ListChaininsightAssetinterfacesrequiredResponse> ListChaininsightAssetinterfacesrequiredExAsync(ListChaininsightAssetinterfacesrequiredRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChaininsightAssetinterfacesrequiredResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.assetinterfacesrequired.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上资产的详情
         * Summary: 查询资产详情
         */
        public QueryChaininsightStatisticassetdetailResponse QueryChaininsightStatisticassetdetail(QueryChaininsightStatisticassetdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightStatisticassetdetailEx(request, headers, runtime);
        }

        /**
         * Description: 查询链上资产的详情
         * Summary: 查询资产详情
         */
        public async Task<QueryChaininsightStatisticassetdetailResponse> QueryChaininsightStatisticassetdetailAsync(QueryChaininsightStatisticassetdetailRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightStatisticassetdetailExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链上资产的详情
         * Summary: 查询资产详情
         */
        public QueryChaininsightStatisticassetdetailResponse QueryChaininsightStatisticassetdetailEx(QueryChaininsightStatisticassetdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightStatisticassetdetailResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上资产的详情
         * Summary: 查询资产详情
         */
        public async Task<QueryChaininsightStatisticassetdetailResponse> QueryChaininsightStatisticassetdetailExAsync(QueryChaininsightStatisticassetdetailRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightStatisticassetdetailResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statisticassetdetail.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上资产合约中资产的元信息
         * Summary: 查询链上资产元信息
         */
        public QueryChaininsightStatisticassetmetaResponse QueryChaininsightStatisticassetmeta(QueryChaininsightStatisticassetmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightStatisticassetmetaEx(request, headers, runtime);
        }

        /**
         * Description: 查询链上资产合约中资产的元信息
         * Summary: 查询链上资产元信息
         */
        public async Task<QueryChaininsightStatisticassetmetaResponse> QueryChaininsightStatisticassetmetaAsync(QueryChaininsightStatisticassetmetaRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightStatisticassetmetaExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链上资产合约中资产的元信息
         * Summary: 查询链上资产元信息
         */
        public QueryChaininsightStatisticassetmetaResponse QueryChaininsightStatisticassetmetaEx(QueryChaininsightStatisticassetmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightStatisticassetmetaResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上资产合约中资产的元信息
         * Summary: 查询链上资产元信息
         */
        public async Task<QueryChaininsightStatisticassetmetaResponse> QueryChaininsightStatisticassetmetaExAsync(QueryChaininsightStatisticassetmetaRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightStatisticassetmetaResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statisticassetmeta.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
         * Summary: 查询链上资产的持有者信息
         */
        public PagequeryChaininsightStatisticassetownerResponse PagequeryChaininsightStatisticassetowner(PagequeryChaininsightStatisticassetownerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryChaininsightStatisticassetownerEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
         * Summary: 查询链上资产的持有者信息
         */
        public async Task<PagequeryChaininsightStatisticassetownerResponse> PagequeryChaininsightStatisticassetownerAsync(PagequeryChaininsightStatisticassetownerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryChaininsightStatisticassetownerExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
         * Summary: 查询链上资产的持有者信息
         */
        public PagequeryChaininsightStatisticassetownerResponse PagequeryChaininsightStatisticassetownerEx(PagequeryChaininsightStatisticassetownerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightStatisticassetownerResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetowner.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上资产合约中资产的持有者信息，按最近一次交易时间降序
         * Summary: 查询链上资产的持有者信息
         */
        public async Task<PagequeryChaininsightStatisticassetownerResponse> PagequeryChaininsightStatisticassetownerExAsync(PagequeryChaininsightStatisticassetownerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightStatisticassetownerResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statisticassetowner.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
         * Summary: 查询链上账户的资产列表
         */
        public PagequeryChaininsightStatisticassetinventoryaccountResponse PagequeryChaininsightStatisticassetinventoryaccount(PagequeryChaininsightStatisticassetinventoryaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryChaininsightStatisticassetinventoryaccountEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
         * Summary: 查询链上账户的资产列表
         */
        public async Task<PagequeryChaininsightStatisticassetinventoryaccountResponse> PagequeryChaininsightStatisticassetinventoryaccountAsync(PagequeryChaininsightStatisticassetinventoryaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryChaininsightStatisticassetinventoryaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
         * Summary: 查询链上账户的资产列表
         */
        public PagequeryChaininsightStatisticassetinventoryaccountResponse PagequeryChaininsightStatisticassetinventoryaccountEx(PagequeryChaininsightStatisticassetinventoryaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightStatisticassetinventoryaccountResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassetinventoryaccount.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上账户的资产列表，按最近一次交易时间降序
         * Summary: 查询链上账户的资产列表
         */
        public async Task<PagequeryChaininsightStatisticassetinventoryaccountResponse> PagequeryChaininsightStatisticassetinventoryaccountExAsync(PagequeryChaininsightStatisticassetinventoryaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightStatisticassetinventoryaccountResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statisticassetinventoryaccount.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
         * Summary: 查询链上资产的流转信息
         */
        public PagequeryChaininsightStatisticassethistoryassetResponse PagequeryChaininsightStatisticassethistoryasset(PagequeryChaininsightStatisticassethistoryassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryChaininsightStatisticassethistoryassetEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
         * Summary: 查询链上资产的流转信息
         */
        public async Task<PagequeryChaininsightStatisticassethistoryassetResponse> PagequeryChaininsightStatisticassethistoryassetAsync(PagequeryChaininsightStatisticassethistoryassetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryChaininsightStatisticassethistoryassetExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
         * Summary: 查询链上资产的流转信息
         */
        public PagequeryChaininsightStatisticassethistoryassetResponse PagequeryChaininsightStatisticassethistoryassetEx(PagequeryChaininsightStatisticassethistoryassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightStatisticassethistoryassetResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassethistoryasset.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上资产合约中资产的流转信息，按交易时间降序
         * Summary: 查询链上资产的流转信息
         */
        public async Task<PagequeryChaininsightStatisticassethistoryassetResponse> PagequeryChaininsightStatisticassethistoryassetExAsync(PagequeryChaininsightStatisticassethistoryassetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightStatisticassethistoryassetResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statisticassethistoryasset.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
         * Summary: 查询链上资产合约的资产流转信息
         */
        public PagequeryChaininsightStatisticassethistorycontractResponse PagequeryChaininsightStatisticassethistorycontract(PagequeryChaininsightStatisticassethistorycontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryChaininsightStatisticassethistorycontractEx(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
         * Summary: 查询链上资产合约的资产流转信息
         */
        public async Task<PagequeryChaininsightStatisticassethistorycontractResponse> PagequeryChaininsightStatisticassethistorycontractAsync(PagequeryChaininsightStatisticassethistorycontractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryChaininsightStatisticassethistorycontractExAsync(request, headers, runtime);
        }

        /**
         * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
         * Summary: 查询链上资产合约的资产流转信息
         */
        public PagequeryChaininsightStatisticassethistorycontractResponse PagequeryChaininsightStatisticassethistorycontractEx(PagequeryChaininsightStatisticassethistorycontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightStatisticassethistorycontractResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.statisticassethistorycontract.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 分页查询链上资产合约的资产流转信息，按交易时间降序
         * Summary: 查询链上资产合约的资产流转信息
         */
        public async Task<PagequeryChaininsightStatisticassethistorycontractResponse> PagequeryChaininsightStatisticassethistorycontractExAsync(PagequeryChaininsightStatisticassethistorycontractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryChaininsightStatisticassethistorycontractResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.statisticassethistorycontract.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
         * Summary: 列出链上地址的时间轴配置
         */
        public QueryChaininsightContracttimelineconfigResponse QueryChaininsightContracttimelineconfig(QueryChaininsightContracttimelineconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChaininsightContracttimelineconfigEx(request, headers, runtime);
        }

        /**
         * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
         * Summary: 列出链上地址的时间轴配置
         */
        public async Task<QueryChaininsightContracttimelineconfigResponse> QueryChaininsightContracttimelineconfigAsync(QueryChaininsightContracttimelineconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChaininsightContracttimelineconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
         * Summary: 列出链上地址的时间轴配置
         */
        public QueryChaininsightContracttimelineconfigResponse QueryChaininsightContracttimelineconfigEx(QueryChaininsightContracttimelineconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightContracttimelineconfigResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.contracttimelineconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 列出链上地址（合约 / 存证账户）的时间轴配置
         * Summary: 列出链上地址的时间轴配置
         */
        public async Task<QueryChaininsightContracttimelineconfigResponse> QueryChaininsightContracttimelineconfigExAsync(QueryChaininsightContracttimelineconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChaininsightContracttimelineconfigResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.contracttimelineconfig.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
         * Summary: 更新链上地址的时间轴配置
         */
        public UpdateChaininsightContracttimelineconfigResponse UpdateChaininsightContracttimelineconfig(UpdateChaininsightContracttimelineconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateChaininsightContracttimelineconfigEx(request, headers, runtime);
        }

        /**
         * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
         * Summary: 更新链上地址的时间轴配置
         */
        public async Task<UpdateChaininsightContracttimelineconfigResponse> UpdateChaininsightContracttimelineconfigAsync(UpdateChaininsightContracttimelineconfigRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateChaininsightContracttimelineconfigExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
         * Summary: 更新链上地址的时间轴配置
         */
        public UpdateChaininsightContracttimelineconfigResponse UpdateChaininsightContracttimelineconfigEx(UpdateChaininsightContracttimelineconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateChaininsightContracttimelineconfigResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.contracttimelineconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新链上地址（合约 / 存证账户）的时间轴配置
         * Summary: 更新链上地址的时间轴配置
         */
        public async Task<UpdateChaininsightContracttimelineconfigResponse> UpdateChaininsightContracttimelineconfigExAsync(UpdateChaininsightContracttimelineconfigRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateChaininsightContracttimelineconfigResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.contracttimelineconfig.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重写接口参数配置
         * Summary: 重写接口参数配置
         */
        public SaveChaininsightContractinterfaceResponse SaveChaininsightContractinterface(SaveChaininsightContractinterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveChaininsightContractinterfaceEx(request, headers, runtime);
        }

        /**
         * Description: 重写接口参数配置
         * Summary: 重写接口参数配置
         */
        public async Task<SaveChaininsightContractinterfaceResponse> SaveChaininsightContractinterfaceAsync(SaveChaininsightContractinterfaceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveChaininsightContractinterfaceExAsync(request, headers, runtime);
        }

        /**
         * Description: 重写接口参数配置
         * Summary: 重写接口参数配置
         */
        public SaveChaininsightContractinterfaceResponse SaveChaininsightContractinterfaceEx(SaveChaininsightContractinterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveChaininsightContractinterfaceResponse>(DoRequest("1.0", "antchain.baasdatagw.chaininsight.contractinterface.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 重写接口参数配置
         * Summary: 重写接口参数配置
         */
        public async Task<SaveChaininsightContractinterfaceResponse> SaveChaininsightContractinterfaceExAsync(SaveChaininsightContractinterfaceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveChaininsightContractinterfaceResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chaininsight.contractinterface.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册链信息
         * Summary: 注册链信息
         */
        public RegisterChainsResponse RegisterChains(RegisterChainsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RegisterChainsEx(request, headers, runtime);
        }

        /**
         * Description: 注册链信息
         * Summary: 注册链信息
         */
        public async Task<RegisterChainsResponse> RegisterChainsAsync(RegisterChainsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RegisterChainsExAsync(request, headers, runtime);
        }

        /**
         * Description: 注册链信息
         * Summary: 注册链信息
         */
        public RegisterChainsResponse RegisterChainsEx(RegisterChainsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterChainsResponse>(DoRequest("1.0", "antchain.baasdatagw.chains.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 注册链信息
         * Summary: 注册链信息
         */
        public async Task<RegisterChainsResponse> RegisterChainsExAsync(RegisterChainsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RegisterChainsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chains.register", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 操作数据网关开通状态
         * Summary: 操作数据网关开通状态
         */
        public OperateChainsResponse OperateChains(OperateChainsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateChainsEx(request, headers, runtime);
        }

        /**
         * Description: 操作数据网关开通状态
         * Summary: 操作数据网关开通状态
         */
        public async Task<OperateChainsResponse> OperateChainsAsync(OperateChainsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateChainsExAsync(request, headers, runtime);
        }

        /**
         * Description: 操作数据网关开通状态
         * Summary: 操作数据网关开通状态
         */
        public OperateChainsResponse OperateChainsEx(OperateChainsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateChainsResponse>(DoRequest("1.0", "antchain.baasdatagw.chains.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 操作数据网关开通状态
         * Summary: 操作数据网关开通状态
         */
        public async Task<OperateChainsResponse> OperateChainsExAsync(OperateChainsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateChainsResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chains.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某条链的服务开通状态
         * Summary: 查询某条链的服务开通状态
         */
        public GetChainsStatusResponse GetChainsStatus(GetChainsStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetChainsStatusEx(request, headers, runtime);
        }

        /**
         * Description: 查询某条链的服务开通状态
         * Summary: 查询某条链的服务开通状态
         */
        public async Task<GetChainsStatusResponse> GetChainsStatusAsync(GetChainsStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetChainsStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询某条链的服务开通状态
         * Summary: 查询某条链的服务开通状态
         */
        public GetChainsStatusResponse GetChainsStatusEx(GetChainsStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetChainsStatusResponse>(DoRequest("1.0", "antchain.baasdatagw.chains.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询某条链的服务开通状态
         * Summary: 查询某条链的服务开通状态
         */
        public async Task<GetChainsStatusResponse> GetChainsStatusExAsync(GetChainsStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetChainsStatusResponse>(await DoRequestAsync("1.0", "antchain.baasdatagw.chains.status.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
