// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.APPEX.Models;

namespace AntChain.SDK.APPEX
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
                        {"sdk_version", "1.3.8"},
                        {"_prod_code", "APPEX"},
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
                        {"sdk_version", "1.3.8"},
                        {"_prod_code", "APPEX"},
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
         * Description: 为用户在MyPocket创建链上账户
         * Summary: MyPocket创建链上账户
         */
        public CreateMypocketChainaccountResponse CreateMypocketChainaccount(CreateMypocketChainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMypocketChainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 为用户在MyPocket创建链上账户
         * Summary: MyPocket创建链上账户
         */
        public async Task<CreateMypocketChainaccountResponse> CreateMypocketChainaccountAsync(CreateMypocketChainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMypocketChainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 为用户在MyPocket创建链上账户
         * Summary: MyPocket创建链上账户
         */
        public CreateMypocketChainaccountResponse CreateMypocketChainaccountEx(CreateMypocketChainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMypocketChainaccountResponse>(DoRequest("1.0", "blockchain.appex.mypocket.chainaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 为用户在MyPocket创建链上账户
         * Summary: MyPocket创建链上账户
         */
        public async Task<CreateMypocketChainaccountResponse> CreateMypocketChainaccountExAsync(CreateMypocketChainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMypocketChainaccountResponse>(await DoRequestAsync("1.0", "blockchain.appex.mypocket.chainaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户根据DID和chainID，查询区块链账户
         * Summary: 用户查询区块链账户
         */
        public QueryMypocketChainaccountResponse QueryMypocketChainaccount(QueryMypocketChainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMypocketChainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 用户根据DID和chainID，查询区块链账户
         * Summary: 用户查询区块链账户
         */
        public async Task<QueryMypocketChainaccountResponse> QueryMypocketChainaccountAsync(QueryMypocketChainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMypocketChainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 用户根据DID和chainID，查询区块链账户
         * Summary: 用户查询区块链账户
         */
        public QueryMypocketChainaccountResponse QueryMypocketChainaccountEx(QueryMypocketChainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypocketChainaccountResponse>(DoRequest("1.0", "blockchain.appex.mypocket.chainaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用户根据DID和chainID，查询区块链账户
         * Summary: 用户查询区块链账户
         */
        public async Task<QueryMypocketChainaccountResponse> QueryMypocketChainaccountExAsync(QueryMypocketChainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypocketChainaccountResponse>(await DoRequestAsync("1.0", "blockchain.appex.mypocket.chainaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
         * Summary: 创建普通用户DID账户（支付宝UID）
         */
        public CreateMypocketDidaccountbyalipayResponse CreateMypocketDidaccountbyalipay(CreateMypocketDidaccountbyalipayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMypocketDidaccountbyalipayEx(request, headers, runtime);
        }

        /**
         * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
         * Summary: 创建普通用户DID账户（支付宝UID）
         */
        public async Task<CreateMypocketDidaccountbyalipayResponse> CreateMypocketDidaccountbyalipayAsync(CreateMypocketDidaccountbyalipayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMypocketDidaccountbyalipayExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
         * Summary: 创建普通用户DID账户（支付宝UID）
         */
        public CreateMypocketDidaccountbyalipayResponse CreateMypocketDidaccountbyalipayEx(CreateMypocketDidaccountbyalipayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMypocketDidaccountbyalipayResponse>(DoRequest("1.0", "blockchain.appex.mypocket.didaccountbyalipay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部DApp应用通过支付宝UID创建普通用户did账户
         * Summary: 创建普通用户DID账户（支付宝UID）
         */
        public async Task<CreateMypocketDidaccountbyalipayResponse> CreateMypocketDidaccountbyalipayExAsync(CreateMypocketDidaccountbyalipayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMypocketDidaccountbyalipayResponse>(await DoRequestAsync("1.0", "blockchain.appex.mypocket.didaccountbyalipay.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部DApp应用通过支付宝UID查询普通用户did
         * Summary: 查询普通用户did（支付宝UID）
         */
        public QueryMypocketDidaccountbyalipayResponse QueryMypocketDidaccountbyalipay(QueryMypocketDidaccountbyalipayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMypocketDidaccountbyalipayEx(request, headers, runtime);
        }

        /**
         * Description: 外部DApp应用通过支付宝UID查询普通用户did
         * Summary: 查询普通用户did（支付宝UID）
         */
        public async Task<QueryMypocketDidaccountbyalipayResponse> QueryMypocketDidaccountbyalipayAsync(QueryMypocketDidaccountbyalipayRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMypocketDidaccountbyalipayExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部DApp应用通过支付宝UID查询普通用户did
         * Summary: 查询普通用户did（支付宝UID）
         */
        public QueryMypocketDidaccountbyalipayResponse QueryMypocketDidaccountbyalipayEx(QueryMypocketDidaccountbyalipayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypocketDidaccountbyalipayResponse>(DoRequest("1.0", "blockchain.appex.mypocket.didaccountbyalipay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部DApp应用通过支付宝UID查询普通用户did
         * Summary: 查询普通用户did（支付宝UID）
         */
        public async Task<QueryMypocketDidaccountbyalipayResponse> QueryMypocketDidaccountbyalipayExAsync(QueryMypocketDidaccountbyalipayRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypocketDidaccountbyalipayResponse>(await DoRequestAsync("1.0", "blockchain.appex.mypocket.didaccountbyalipay.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部DApp应用创建用户链上账户
         * Summary: 外部DApp应用创建用户链上账户
         */
        public CreateMypocketEscrowchainaccountResponse CreateMypocketEscrowchainaccount(CreateMypocketEscrowchainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateMypocketEscrowchainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 外部DApp应用创建用户链上账户
         * Summary: 外部DApp应用创建用户链上账户
         */
        public async Task<CreateMypocketEscrowchainaccountResponse> CreateMypocketEscrowchainaccountAsync(CreateMypocketEscrowchainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateMypocketEscrowchainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部DApp应用创建用户链上账户
         * Summary: 外部DApp应用创建用户链上账户
         */
        public CreateMypocketEscrowchainaccountResponse CreateMypocketEscrowchainaccountEx(CreateMypocketEscrowchainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMypocketEscrowchainaccountResponse>(DoRequest("1.0", "blockchain.appex.mypocket.escrowchainaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部DApp应用创建用户链上账户
         * Summary: 外部DApp应用创建用户链上账户
         */
        public async Task<CreateMypocketEscrowchainaccountResponse> CreateMypocketEscrowchainaccountExAsync(CreateMypocketEscrowchainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateMypocketEscrowchainaccountResponse>(await DoRequestAsync("1.0", "blockchain.appex.mypocket.escrowchainaccount.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部DApp应用查询did在指定链上关联的账户
         * Summary: 外部查询did在指定链上关联的账户
         */
        public QueryMypocketEscrowchainaccountResponse QueryMypocketEscrowchainaccount(QueryMypocketEscrowchainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryMypocketEscrowchainaccountEx(request, headers, runtime);
        }

        /**
         * Description: 外部DApp应用查询did在指定链上关联的账户
         * Summary: 外部查询did在指定链上关联的账户
         */
        public async Task<QueryMypocketEscrowchainaccountResponse> QueryMypocketEscrowchainaccountAsync(QueryMypocketEscrowchainaccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryMypocketEscrowchainaccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 外部DApp应用查询did在指定链上关联的账户
         * Summary: 外部查询did在指定链上关联的账户
         */
        public QueryMypocketEscrowchainaccountResponse QueryMypocketEscrowchainaccountEx(QueryMypocketEscrowchainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypocketEscrowchainaccountResponse>(DoRequest("1.0", "blockchain.appex.mypocket.escrowchainaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 外部DApp应用查询did在指定链上关联的账户
         * Summary: 外部查询did在指定链上关联的账户
         */
        public async Task<QueryMypocketEscrowchainaccountResponse> QueryMypocketEscrowchainaccountExAsync(QueryMypocketEscrowchainaccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryMypocketEscrowchainaccountResponse>(await DoRequestAsync("1.0", "blockchain.appex.mypocket.escrowchainaccount.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 验证app did签名
         * Summary: app did验签接口
         */
        public StartMypocketAppdidsignverifyResponse StartMypocketAppdidsignverify(StartMypocketAppdidsignverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartMypocketAppdidsignverifyEx(request, headers, runtime);
        }

        /**
         * Description: 验证app did签名
         * Summary: app did验签接口
         */
        public async Task<StartMypocketAppdidsignverifyResponse> StartMypocketAppdidsignverifyAsync(StartMypocketAppdidsignverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartMypocketAppdidsignverifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 验证app did签名
         * Summary: app did验签接口
         */
        public StartMypocketAppdidsignverifyResponse StartMypocketAppdidsignverifyEx(StartMypocketAppdidsignverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartMypocketAppdidsignverifyResponse>(DoRequest("1.0", "blockchain.appex.mypocket.appdidsignverify.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 验证app did签名
         * Summary: app did验签接口
         */
        public async Task<StartMypocketAppdidsignverifyResponse> StartMypocketAppdidsignverifyExAsync(StartMypocketAppdidsignverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartMypocketAppdidsignverifyResponse>(await DoRequestAsync("1.0", "blockchain.appex.mypocket.appdidsignverify.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 验证user did签名
         * Summary: 验证user did签名
         */
        public StartMypocketUserdidsignverifyResponse StartMypocketUserdidsignverify(StartMypocketUserdidsignverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartMypocketUserdidsignverifyEx(request, headers, runtime);
        }

        /**
         * Description: 验证user did签名
         * Summary: 验证user did签名
         */
        public async Task<StartMypocketUserdidsignverifyResponse> StartMypocketUserdidsignverifyAsync(StartMypocketUserdidsignverifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartMypocketUserdidsignverifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 验证user did签名
         * Summary: 验证user did签名
         */
        public StartMypocketUserdidsignverifyResponse StartMypocketUserdidsignverifyEx(StartMypocketUserdidsignverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartMypocketUserdidsignverifyResponse>(DoRequest("1.0", "blockchain.appex.mypocket.userdidsignverify.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 验证user did签名
         * Summary: 验证user did签名
         */
        public async Task<StartMypocketUserdidsignverifyResponse> StartMypocketUserdidsignverifyExAsync(StartMypocketUserdidsignverifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartMypocketUserdidsignverifyResponse>(await DoRequestAsync("1.0", "blockchain.appex.mypocket.userdidsignverify.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链身份创建
         * Summary: 区块链身份创建
         */
        public CreateUserDidResponse CreateUserDid(CreateUserDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUserDidEx(request, headers, runtime);
        }

        /**
         * Description: 区块链身份创建
         * Summary: 区块链身份创建
         */
        public async Task<CreateUserDidResponse> CreateUserDidAsync(CreateUserDidRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUserDidExAsync(request, headers, runtime);
        }

        /**
         * Description: 区块链身份创建
         * Summary: 区块链身份创建
         */
        public CreateUserDidResponse CreateUserDidEx(CreateUserDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserDidResponse>(DoRequest("1.0", "blockchain.appex.user.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链身份创建
         * Summary: 区块链身份创建
         */
        public async Task<CreateUserDidResponse> CreateUserDidExAsync(CreateUserDidRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUserDidResponse>(await DoRequestAsync("1.0", "blockchain.appex.user.did.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 协作联盟创建申请
         * Summary: 协作联盟创建申请
         */
        public CreateUnionApplyResponse CreateUnionApply(CreateUnionApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUnionApplyEx(request, headers, runtime);
        }

        /**
         * Description: 协作联盟创建申请
         * Summary: 协作联盟创建申请
         */
        public async Task<CreateUnionApplyResponse> CreateUnionApplyAsync(CreateUnionApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUnionApplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 协作联盟创建申请
         * Summary: 协作联盟创建申请
         */
        public CreateUnionApplyResponse CreateUnionApplyEx(CreateUnionApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnionApplyResponse>(DoRequest("1.0", "blockchain.appex.union.apply.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 协作联盟创建申请
         * Summary: 协作联盟创建申请
         */
        public async Task<CreateUnionApplyResponse> CreateUnionApplyExAsync(CreateUnionApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnionApplyResponse>(await DoRequestAsync("1.0", "blockchain.appex.union.apply.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联盟创建申请审核，仅内部租户可调用
         * Summary: 联盟创建申请审核
         */
        public ConfirmUnionApplyResponse ConfirmUnionApply(ConfirmUnionApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ConfirmUnionApplyEx(request, headers, runtime);
        }

        /**
         * Description: 联盟创建申请审核，仅内部租户可调用
         * Summary: 联盟创建申请审核
         */
        public async Task<ConfirmUnionApplyResponse> ConfirmUnionApplyAsync(ConfirmUnionApplyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ConfirmUnionApplyExAsync(request, headers, runtime);
        }

        /**
         * Description: 联盟创建申请审核，仅内部租户可调用
         * Summary: 联盟创建申请审核
         */
        public ConfirmUnionApplyResponse ConfirmUnionApplyEx(ConfirmUnionApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmUnionApplyResponse>(DoRequest("1.0", "blockchain.appex.union.apply.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联盟创建申请审核，仅内部租户可调用
         * Summary: 联盟创建申请审核
         */
        public async Task<ConfirmUnionApplyResponse> ConfirmUnionApplyExAsync(ConfirmUnionApplyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ConfirmUnionApplyResponse>(await DoRequestAsync("1.0", "blockchain.appex.union.apply.confirm", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在联盟中创建信息通道Channel
         * Summary: 在联盟中创建信息通道Channel
         */
        public CreateUnionChannelResponse CreateUnionChannel(CreateUnionChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUnionChannelEx(request, headers, runtime);
        }

        /**
         * Description: 在联盟中创建信息通道Channel
         * Summary: 在联盟中创建信息通道Channel
         */
        public async Task<CreateUnionChannelResponse> CreateUnionChannelAsync(CreateUnionChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUnionChannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 在联盟中创建信息通道Channel
         * Summary: 在联盟中创建信息通道Channel
         */
        public CreateUnionChannelResponse CreateUnionChannelEx(CreateUnionChannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnionChannelResponse>(DoRequest("1.0", "blockchain.appex.union.channel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 在联盟中创建信息通道Channel
         * Summary: 在联盟中创建信息通道Channel
         */
        public async Task<CreateUnionChannelResponse> CreateUnionChannelExAsync(CreateUnionChannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnionChannelResponse>(await DoRequestAsync("1.0", "blockchain.appex.union.channel.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
         * Summary: 成员查询自己拥有访问权限的channel
         */
        public ListUserChannelResponse ListUserChannel(ListUserChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUserChannelEx(request, headers, runtime);
        }

        /**
         * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
         * Summary: 成员查询自己拥有访问权限的channel
         */
        public async Task<ListUserChannelResponse> ListUserChannelAsync(ListUserChannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUserChannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
         * Summary: 成员查询自己拥有访问权限的channel
         */
        public ListUserChannelResponse ListUserChannelEx(ListUserChannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUserChannelResponse>(DoRequest("1.0", "blockchain.appex.user.channel.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 成员查询自己拥有读或写权限的channel，返回非公开访问的可读Channel集。如果需要查询公开访问的Channel集可以使用blockchain.appex.union.publicChannel.list
         * Summary: 成员查询自己拥有访问权限的channel
         */
        public async Task<ListUserChannelResponse> ListUserChannelExAsync(ListUserChannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUserChannelResponse>(await DoRequestAsync("1.0", "blockchain.appex.user.channel.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联盟公开Channel查询
         * Summary: 联盟公开Channel查询
         */
        public ListUnionPubchannelResponse ListUnionPubchannel(ListUnionPubchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListUnionPubchannelEx(request, headers, runtime);
        }

        /**
         * Description: 联盟公开Channel查询
         * Summary: 联盟公开Channel查询
         */
        public async Task<ListUnionPubchannelResponse> ListUnionPubchannelAsync(ListUnionPubchannelRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListUnionPubchannelExAsync(request, headers, runtime);
        }

        /**
         * Description: 联盟公开Channel查询
         * Summary: 联盟公开Channel查询
         */
        public ListUnionPubchannelResponse ListUnionPubchannelEx(ListUnionPubchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnionPubchannelResponse>(DoRequest("1.0", "blockchain.appex.union.pubchannel.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联盟公开Channel查询
         * Summary: 联盟公开Channel查询
         */
        public async Task<ListUnionPubchannelResponse> ListUnionPubchannelExAsync(ListUnionPubchannelRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListUnionPubchannelResponse>(await DoRequestAsync("1.0", "blockchain.appex.union.pubchannel.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Channel授权给用户
         * Summary: Channel授权给用户
         */
        public AuthChannelUserResponse AuthChannelUser(AuthChannelUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthChannelUserEx(request, headers, runtime);
        }

        /**
         * Description: Channel授权给用户
         * Summary: Channel授权给用户
         */
        public async Task<AuthChannelUserResponse> AuthChannelUserAsync(AuthChannelUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthChannelUserExAsync(request, headers, runtime);
        }

        /**
         * Description: Channel授权给用户
         * Summary: Channel授权给用户
         */
        public AuthChannelUserResponse AuthChannelUserEx(AuthChannelUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthChannelUserResponse>(DoRequest("1.0", "blockchain.appex.channel.user.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: Channel授权给用户
         * Summary: Channel授权给用户
         */
        public async Task<AuthChannelUserResponse> AuthChannelUserExAsync(AuthChannelUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthChannelUserResponse>(await DoRequestAsync("1.0", "blockchain.appex.channel.user.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消用户访问Channel的权限
         * Summary: 取消用户访问Channel的权限
         */
        public CancelChannelUserResponse CancelChannelUser(CancelChannelUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelChannelUserEx(request, headers, runtime);
        }

        /**
         * Description: 取消用户访问Channel的权限
         * Summary: 取消用户访问Channel的权限
         */
        public async Task<CancelChannelUserResponse> CancelChannelUserAsync(CancelChannelUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelChannelUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 取消用户访问Channel的权限
         * Summary: 取消用户访问Channel的权限
         */
        public CancelChannelUserResponse CancelChannelUserEx(CancelChannelUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelChannelUserResponse>(DoRequest("1.0", "blockchain.appex.channel.user.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 取消用户访问Channel的权限
         * Summary: 取消用户访问Channel的权限
         */
        public async Task<CancelChannelUserResponse> CancelChannelUserExAsync(CancelChannelUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelChannelUserResponse>(await DoRequestAsync("1.0", "blockchain.appex.channel.user.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单据加密上链
         * Summary: 单据加密上链
         */
        public CreateUnionFormResponse CreateUnionForm(CreateUnionFormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateUnionFormEx(request, headers, runtime);
        }

        /**
         * Description: 单据加密上链
         * Summary: 单据加密上链
         */
        public async Task<CreateUnionFormResponse> CreateUnionFormAsync(CreateUnionFormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateUnionFormExAsync(request, headers, runtime);
        }

        /**
         * Description: 单据加密上链
         * Summary: 单据加密上链
         */
        public CreateUnionFormResponse CreateUnionFormEx(CreateUnionFormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnionFormResponse>(DoRequest("1.0", "blockchain.appex.union.form.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单据加密上链
         * Summary: 单据加密上链
         */
        public async Task<CreateUnionFormResponse> CreateUnionFormExAsync(CreateUnionFormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateUnionFormResponse>(await DoRequestAsync("1.0", "blockchain.appex.union.form.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个表单
         * Summary: 查询单个表单
         */
        public QueryUnionFormResponse QueryUnionForm(QueryUnionFormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryUnionFormEx(request, headers, runtime);
        }

        /**
         * Description: 查询单个表单
         * Summary: 查询单个表单
         */
        public async Task<QueryUnionFormResponse> QueryUnionFormAsync(QueryUnionFormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryUnionFormExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询单个表单
         * Summary: 查询单个表单
         */
        public QueryUnionFormResponse QueryUnionFormEx(QueryUnionFormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnionFormResponse>(DoRequest("1.0", "blockchain.appex.union.form.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询单个表单
         * Summary: 查询单个表单
         */
        public async Task<QueryUnionFormResponse> QueryUnionFormExAsync(QueryUnionFormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryUnionFormResponse>(await DoRequestAsync("1.0", "blockchain.appex.union.form.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通道中用户可以访问的表单列表
         * Summary: 通道中用户可以访问的表单列表
         */
        public ListChannelUserformResponse ListChannelUserform(ListChannelUserformRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListChannelUserformEx(request, headers, runtime);
        }

        /**
         * Description: 通道中用户可以访问的表单列表
         * Summary: 通道中用户可以访问的表单列表
         */
        public async Task<ListChannelUserformResponse> ListChannelUserformAsync(ListChannelUserformRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListChannelUserformExAsync(request, headers, runtime);
        }

        /**
         * Description: 通道中用户可以访问的表单列表
         * Summary: 通道中用户可以访问的表单列表
         */
        public ListChannelUserformResponse ListChannelUserformEx(ListChannelUserformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChannelUserformResponse>(DoRequest("1.0", "blockchain.appex.channel.userform.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通道中用户可以访问的表单列表
         * Summary: 通道中用户可以访问的表单列表
         */
        public async Task<ListChannelUserformResponse> ListChannelUserformExAsync(ListChannelUserformRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListChannelUserformResponse>(await DoRequestAsync("1.0", "blockchain.appex.channel.userform.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物上链，链上数字物体创建
         * Summary: 物权上链
         */
        public CreateObjectResponse CreateObject(CreateObjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateObjectEx(request, headers, runtime);
        }

        /**
         * Description: 物上链，链上数字物体创建
         * Summary: 物权上链
         */
        public async Task<CreateObjectResponse> CreateObjectAsync(CreateObjectRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateObjectExAsync(request, headers, runtime);
        }

        /**
         * Description: 物上链，链上数字物体创建
         * Summary: 物权上链
         */
        public CreateObjectResponse CreateObjectEx(CreateObjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateObjectResponse>(DoRequest("1.0", "blockchain.appex.object.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 物上链，链上数字物体创建
         * Summary: 物权上链
         */
        public async Task<CreateObjectResponse> CreateObjectExAsync(CreateObjectRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateObjectResponse>(await DoRequestAsync("1.0", "blockchain.appex.object.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据归属权流转
         * Summary: 数据归属权流转
         */
        public CreateObjectTransferResponse CreateObjectTransfer(CreateObjectTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateObjectTransferEx(request, headers, runtime);
        }

        /**
         * Description: 数据归属权流转
         * Summary: 数据归属权流转
         */
        public async Task<CreateObjectTransferResponse> CreateObjectTransferAsync(CreateObjectTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateObjectTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据归属权流转
         * Summary: 数据归属权流转
         */
        public CreateObjectTransferResponse CreateObjectTransferEx(CreateObjectTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateObjectTransferResponse>(DoRequest("1.0", "blockchain.appex.object.transfer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据归属权流转
         * Summary: 数据归属权流转
         */
        public async Task<CreateObjectTransferResponse> CreateObjectTransferExAsync(CreateObjectTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateObjectTransferResponse>(await DoRequestAsync("1.0", "blockchain.appex.object.transfer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据归属权流转记录查询
         * Summary: 数据归属权流转记录查询
         */
        public ListObjectTransferResponse ListObjectTransfer(ListObjectTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListObjectTransferEx(request, headers, runtime);
        }

        /**
         * Description: 数据归属权流转记录查询
         * Summary: 数据归属权流转记录查询
         */
        public async Task<ListObjectTransferResponse> ListObjectTransferAsync(ListObjectTransferRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListObjectTransferExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据归属权流转记录查询
         * Summary: 数据归属权流转记录查询
         */
        public ListObjectTransferResponse ListObjectTransferEx(ListObjectTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListObjectTransferResponse>(DoRequest("1.0", "blockchain.appex.object.transfer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据归属权流转记录查询
         * Summary: 数据归属权流转记录查询
         */
        public async Task<ListObjectTransferResponse> ListObjectTransferExAsync(ListObjectTransferRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListObjectTransferResponse>(await DoRequestAsync("1.0", "blockchain.appex.object.transfer.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 状态流驱动模版新增
         * Summary: 状态流驱动模版新增
         */
        public CreateStatusflowTemplateResponse CreateStatusflowTemplate(CreateStatusflowTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateStatusflowTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 状态流驱动模版新增
         * Summary: 状态流驱动模版新增
         */
        public async Task<CreateStatusflowTemplateResponse> CreateStatusflowTemplateAsync(CreateStatusflowTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateStatusflowTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 状态流驱动模版新增
         * Summary: 状态流驱动模版新增
         */
        public CreateStatusflowTemplateResponse CreateStatusflowTemplateEx(CreateStatusflowTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStatusflowTemplateResponse>(DoRequest("1.0", "blockchain.appex.statusflow.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 状态流驱动模版新增
         * Summary: 状态流驱动模版新增
         */
        public async Task<CreateStatusflowTemplateResponse> CreateStatusflowTemplateExAsync(CreateStatusflowTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateStatusflowTemplateResponse>(await DoRequestAsync("1.0", "blockchain.appex.statusflow.template.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 状态流驱动模版删除
         * Summary: 状态流驱动模版删除
         */
        public DeleteStatusflowTemplateResponse DeleteStatusflowTemplate(DeleteStatusflowTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteStatusflowTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 状态流驱动模版删除
         * Summary: 状态流驱动模版删除
         */
        public async Task<DeleteStatusflowTemplateResponse> DeleteStatusflowTemplateAsync(DeleteStatusflowTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteStatusflowTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 状态流驱动模版删除
         * Summary: 状态流驱动模版删除
         */
        public DeleteStatusflowTemplateResponse DeleteStatusflowTemplateEx(DeleteStatusflowTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStatusflowTemplateResponse>(DoRequest("1.0", "blockchain.appex.statusflow.template.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 状态流驱动模版删除
         * Summary: 状态流驱动模版删除
         */
        public async Task<DeleteStatusflowTemplateResponse> DeleteStatusflowTemplateExAsync(DeleteStatusflowTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteStatusflowTemplateResponse>(await DoRequestAsync("1.0", "blockchain.appex.statusflow.template.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 状态流驱动模版查询
         * Summary: 状态流驱动模版查询
         */
        public QueryStatusflowTemplateResponse QueryStatusflowTemplate(QueryStatusflowTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryStatusflowTemplateEx(request, headers, runtime);
        }

        /**
         * Description: 状态流驱动模版查询
         * Summary: 状态流驱动模版查询
         */
        public async Task<QueryStatusflowTemplateResponse> QueryStatusflowTemplateAsync(QueryStatusflowTemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryStatusflowTemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 状态流驱动模版查询
         * Summary: 状态流驱动模版查询
         */
        public QueryStatusflowTemplateResponse QueryStatusflowTemplateEx(QueryStatusflowTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStatusflowTemplateResponse>(DoRequest("1.0", "blockchain.appex.statusflow.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 状态流驱动模版查询
         * Summary: 状态流驱动模版查询
         */
        public async Task<QueryStatusflowTemplateResponse> QueryStatusflowTemplateExAsync(QueryStatusflowTemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryStatusflowTemplateResponse>(await DoRequestAsync("1.0", "blockchain.appex.statusflow.template.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据状态驱动
         * Summary: 数据状态驱动
         */
        public StartDatastatusDriveResponse StartDatastatusDrive(StartDatastatusDriveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartDatastatusDriveEx(request, headers, runtime);
        }

        /**
         * Description: 数据状态驱动
         * Summary: 数据状态驱动
         */
        public async Task<StartDatastatusDriveResponse> StartDatastatusDriveAsync(StartDatastatusDriveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartDatastatusDriveExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据状态驱动
         * Summary: 数据状态驱动
         */
        public StartDatastatusDriveResponse StartDatastatusDriveEx(StartDatastatusDriveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartDatastatusDriveResponse>(DoRequest("1.0", "blockchain.appex.datastatus.drive.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据状态驱动
         * Summary: 数据状态驱动
         */
        public async Task<StartDatastatusDriveResponse> StartDatastatusDriveExAsync(StartDatastatusDriveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartDatastatusDriveResponse>(await DoRequestAsync("1.0", "blockchain.appex.datastatus.drive.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据状态流转记录
         * Summary: 查询数据状态流转记录
         */
        public ListDatastatusDriveResponse ListDatastatusDrive(ListDatastatusDriveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ListDatastatusDriveEx(request, headers, runtime);
        }

        /**
         * Description: 查询数据状态流转记录
         * Summary: 查询数据状态流转记录
         */
        public async Task<ListDatastatusDriveResponse> ListDatastatusDriveAsync(ListDatastatusDriveRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ListDatastatusDriveExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询数据状态流转记录
         * Summary: 查询数据状态流转记录
         */
        public ListDatastatusDriveResponse ListDatastatusDriveEx(ListDatastatusDriveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDatastatusDriveResponse>(DoRequest("1.0", "blockchain.appex.datastatus.drive.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询数据状态流转记录
         * Summary: 查询数据状态流转记录
         */
        public async Task<ListDatastatusDriveResponse> ListDatastatusDriveExAsync(ListDatastatusDriveRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ListDatastatusDriveResponse>(await DoRequestAsync("1.0", "blockchain.appex.datastatus.drive.list", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
         * Summary: 单据加密异步上链
         */
        public CreateAsynformFormResponse CreateAsynformForm(CreateAsynformFormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAsynformFormEx(request, headers, runtime);
        }

        /**
         * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
         * Summary: 单据加密异步上链
         */
        public async Task<CreateAsynformFormResponse> CreateAsynformFormAsync(CreateAsynformFormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAsynformFormExAsync(request, headers, runtime);
        }

        /**
         * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
         * Summary: 单据加密异步上链
         */
        public CreateAsynformFormResponse CreateAsynformFormEx(CreateAsynformFormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAsynformFormResponse>(DoRequest("1.0", "blockchain.appex.asynform.form.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单据加密异步上链，返回哈希，后续需要查询上链状态以确定是否成功上链
         * Summary: 单据加密异步上链
         */
        public async Task<CreateAsynformFormResponse> CreateAsynformFormExAsync(CreateAsynformFormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAsynformFormResponse>(await DoRequestAsync("1.0", "blockchain.appex.asynform.form.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
         * Summary: 单据分页查询
         */
        public PagequeryUnionFormResponse PagequeryUnionForm(PagequeryUnionFormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PagequeryUnionFormEx(request, headers, runtime);
        }

        /**
         * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
         * Summary: 单据分页查询
         */
        public async Task<PagequeryUnionFormResponse> PagequeryUnionFormAsync(PagequeryUnionFormRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PagequeryUnionFormExAsync(request, headers, runtime);
        }

        /**
         * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
         * Summary: 单据分页查询
         */
        public PagequeryUnionFormResponse PagequeryUnionFormEx(PagequeryUnionFormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryUnionFormResponse>(DoRequest("1.0", "blockchain.appex.union.form.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单据分页查询，支持关联ID(trace_id)和时间段过滤
         * Summary: 单据分页查询
         */
        public async Task<PagequeryUnionFormResponse> PagequeryUnionFormExAsync(PagequeryUnionFormRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PagequeryUnionFormResponse>(await DoRequestAsync("1.0", "blockchain.appex.union.form.pagequery", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
         * Summary: 单据上链状态查询
         */
        public QueryAsynformStatusResponse QueryAsynformStatus(QueryAsynformStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAsynformStatusEx(request, headers, runtime);
        }

        /**
         * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
         * Summary: 单据上链状态查询
         */
        public async Task<QueryAsynformStatusResponse> QueryAsynformStatusAsync(QueryAsynformStatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAsynformStatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
         * Summary: 单据上链状态查询
         */
        public QueryAsynformStatusResponse QueryAsynformStatusEx(QueryAsynformStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAsynformStatusResponse>(DoRequest("1.0", "blockchain.appex.asynform.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 单据上链状态查询，异步上链后查询交易是否成功上链
         * Summary: 单据上链状态查询
         */
        public async Task<QueryAsynformStatusResponse> QueryAsynformStatusExAsync(QueryAsynformStatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAsynformStatusResponse>(await DoRequestAsync("1.0", "blockchain.appex.asynform.status.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 结构化存证查询
         * Summary: 结构化存证查询
         */
        public QuerySolutionFastnotaryResponse QuerySolutionFastnotary(QuerySolutionFastnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySolutionFastnotaryEx(request, headers, runtime);
        }

        /**
         * Description: 结构化存证查询
         * Summary: 结构化存证查询
         */
        public async Task<QuerySolutionFastnotaryResponse> QuerySolutionFastnotaryAsync(QuerySolutionFastnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySolutionFastnotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 结构化存证查询
         * Summary: 结构化存证查询
         */
        public QuerySolutionFastnotaryResponse QuerySolutionFastnotaryEx(QuerySolutionFastnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutionFastnotaryResponse>(DoRequest("1.0", "blockchain.appex.solution.fastnotary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 结构化存证查询
         * Summary: 结构化存证查询
         */
        public async Task<QuerySolutionFastnotaryResponse> QuerySolutionFastnotaryExAsync(QuerySolutionFastnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutionFastnotaryResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.fastnotary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起结构化存证
         * Summary: 发起结构化存证
         */
        public SaveSolutionFastnotaryResponse SaveSolutionFastnotary(SaveSolutionFastnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SaveSolutionFastnotaryEx(request, headers, runtime);
        }

        /**
         * Description: 发起结构化存证
         * Summary: 发起结构化存证
         */
        public async Task<SaveSolutionFastnotaryResponse> SaveSolutionFastnotaryAsync(SaveSolutionFastnotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SaveSolutionFastnotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 发起结构化存证
         * Summary: 发起结构化存证
         */
        public SaveSolutionFastnotaryResponse SaveSolutionFastnotaryEx(SaveSolutionFastnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveSolutionFastnotaryResponse>(DoRequest("1.0", "blockchain.appex.solution.fastnotary.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 发起结构化存证
         * Summary: 发起结构化存证
         */
        public async Task<SaveSolutionFastnotaryResponse> SaveSolutionFastnotaryExAsync(SaveSolutionFastnotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SaveSolutionFastnotaryResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.fastnotary.save", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化文件存证
         * Summary: 初始化文件存证
         */
        public InitSolutionFilenotaryResponse InitSolutionFilenotary(InitSolutionFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitSolutionFilenotaryEx(request, headers, runtime);
        }

        /**
         * Description: 初始化文件存证
         * Summary: 初始化文件存证
         */
        public async Task<InitSolutionFilenotaryResponse> InitSolutionFilenotaryAsync(InitSolutionFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitSolutionFilenotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 初始化文件存证
         * Summary: 初始化文件存证
         */
        public InitSolutionFilenotaryResponse InitSolutionFilenotaryEx(InitSolutionFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSolutionFilenotaryResponse>(DoRequest("1.0", "blockchain.appex.solution.filenotary.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化文件存证
         * Summary: 初始化文件存证
         */
        public async Task<InitSolutionFilenotaryResponse> InitSolutionFilenotaryExAsync(InitSolutionFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSolutionFilenotaryResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.filenotary.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知文件上传完成
         * Summary: 通知文件上传完成
         */
        public SyncSolutionFilenotaryResponse SyncSolutionFilenotary(SyncSolutionFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncSolutionFilenotaryEx(request, headers, runtime);
        }

        /**
         * Description: 通知文件上传完成
         * Summary: 通知文件上传完成
         */
        public async Task<SyncSolutionFilenotaryResponse> SyncSolutionFilenotaryAsync(SyncSolutionFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncSolutionFilenotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 通知文件上传完成
         * Summary: 通知文件上传完成
         */
        public SyncSolutionFilenotaryResponse SyncSolutionFilenotaryEx(SyncSolutionFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSolutionFilenotaryResponse>(DoRequest("1.0", "blockchain.appex.solution.filenotary.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 通知文件上传完成
         * Summary: 通知文件上传完成
         */
        public async Task<SyncSolutionFilenotaryResponse> SyncSolutionFilenotaryExAsync(SyncSolutionFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncSolutionFilenotaryResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.filenotary.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取文件存证的状态
         * Summary: 获取文件存证的状态
         */
        public GetSolutionFilenotarystatusResponse GetSolutionFilenotarystatus(GetSolutionFilenotarystatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return GetSolutionFilenotarystatusEx(request, headers, runtime);
        }

        /**
         * Description: 获取文件存证的状态
         * Summary: 获取文件存证的状态
         */
        public async Task<GetSolutionFilenotarystatusResponse> GetSolutionFilenotarystatusAsync(GetSolutionFilenotarystatusRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await GetSolutionFilenotarystatusExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取文件存证的状态
         * Summary: 获取文件存证的状态
         */
        public GetSolutionFilenotarystatusResponse GetSolutionFilenotarystatusEx(GetSolutionFilenotarystatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSolutionFilenotarystatusResponse>(DoRequest("1.0", "blockchain.appex.solution.filenotarystatus.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取文件存证的状态
         * Summary: 获取文件存证的状态
         */
        public async Task<GetSolutionFilenotarystatusResponse> GetSolutionFilenotarystatusExAsync(GetSolutionFilenotarystatusRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<GetSolutionFilenotarystatusResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.filenotarystatus.get", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件存证
         * Summary: 查询文件存证
         */
        public QuerySolutionFilenotaryResponse QuerySolutionFilenotary(QuerySolutionFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySolutionFilenotaryEx(request, headers, runtime);
        }

        /**
         * Description: 查询文件存证
         * Summary: 查询文件存证
         */
        public async Task<QuerySolutionFilenotaryResponse> QuerySolutionFilenotaryAsync(QuerySolutionFilenotaryRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySolutionFilenotaryExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询文件存证
         * Summary: 查询文件存证
         */
        public QuerySolutionFilenotaryResponse QuerySolutionFilenotaryEx(QuerySolutionFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutionFilenotaryResponse>(DoRequest("1.0", "blockchain.appex.solution.filenotary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询文件存证
         * Summary: 查询文件存证
         */
        public async Task<QuerySolutionFilenotaryResponse> QuerySolutionFilenotaryExAsync(QuerySolutionFilenotaryRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutionFilenotaryResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.filenotary.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合约服务调用
         * Summary: 合约服务调用
         */
        public ExecContractServiceResponse ExecContractService(ExecContractServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecContractServiceEx(request, headers, runtime);
        }

        /**
         * Description: 合约服务调用
         * Summary: 合约服务调用
         */
        public async Task<ExecContractServiceResponse> ExecContractServiceAsync(ExecContractServiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecContractServiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 合约服务调用
         * Summary: 合约服务调用
         */
        public ExecContractServiceResponse ExecContractServiceEx(ExecContractServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractServiceResponse>(DoRequest("1.0", "blockchain.appex.contract.service.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 合约服务调用
         * Summary: 合约服务调用
         */
        public async Task<ExecContractServiceResponse> ExecContractServiceExAsync(ExecContractServiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecContractServiceResponse>(await DoRequestAsync("1.0", "blockchain.appex.contract.service.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 速搭平台支持openapi创建应用
         * Summary: 创建合约应用
         */
        public InitSolutionBmsResponse InitSolutionBms(InitSolutionBmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitSolutionBmsEx(request, headers, runtime);
        }

        /**
         * Description: 速搭平台支持openapi创建应用
         * Summary: 创建合约应用
         */
        public async Task<InitSolutionBmsResponse> InitSolutionBmsAsync(InitSolutionBmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitSolutionBmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 速搭平台支持openapi创建应用
         * Summary: 创建合约应用
         */
        public InitSolutionBmsResponse InitSolutionBmsEx(InitSolutionBmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSolutionBmsResponse>(DoRequest("1.0", "blockchain.appex.solution.bms.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 速搭平台支持openapi创建应用
         * Summary: 创建合约应用
         */
        public async Task<InitSolutionBmsResponse> InitSolutionBmsExAsync(InitSolutionBmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitSolutionBmsResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.bms.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合约临时oss url
         * Summary: 获取合约临时oss url
         */
        public QuerySolutionBmsResponse QuerySolutionBms(QuerySolutionBmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySolutionBmsEx(request, headers, runtime);
        }

        /**
         * Description: 获取合约临时oss url
         * Summary: 获取合约临时oss url
         */
        public async Task<QuerySolutionBmsResponse> QuerySolutionBmsAsync(QuerySolutionBmsRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySolutionBmsExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取合约临时oss url
         * Summary: 获取合约临时oss url
         */
        public QuerySolutionBmsResponse QuerySolutionBmsEx(QuerySolutionBmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutionBmsResponse>(DoRequest("1.0", "blockchain.appex.solution.bms.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取合约临时oss url
         * Summary: 获取合约临时oss url
         */
        public async Task<QuerySolutionBmsResponse> QuerySolutionBmsExAsync(QuerySolutionBmsRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySolutionBmsResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.bms.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用速搭平台部署合约接口
         * Summary: 应用速搭平台部署合约接口
         */
        public DeploySolutionContractResponse DeploySolutionContract(DeploySolutionContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeploySolutionContractEx(request, headers, runtime);
        }

        /**
         * Description: 应用速搭平台部署合约接口
         * Summary: 应用速搭平台部署合约接口
         */
        public async Task<DeploySolutionContractResponse> DeploySolutionContractAsync(DeploySolutionContractRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeploySolutionContractExAsync(request, headers, runtime);
        }

        /**
         * Description: 应用速搭平台部署合约接口
         * Summary: 应用速搭平台部署合约接口
         */
        public DeploySolutionContractResponse DeploySolutionContractEx(DeploySolutionContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeploySolutionContractResponse>(DoRequest("1.0", "blockchain.appex.solution.contract.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 应用速搭平台部署合约接口
         * Summary: 应用速搭平台部署合约接口
         */
        public async Task<DeploySolutionContractResponse> DeploySolutionContractExAsync(DeploySolutionContractRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeploySolutionContractResponse>(await DoRequestAsync("1.0", "blockchain.appex.solution.contract.deploy", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
