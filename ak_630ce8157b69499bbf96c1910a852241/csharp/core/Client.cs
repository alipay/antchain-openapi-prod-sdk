// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241.Models;

namespace AntChain.SDK.Ak_630ce8157b69499bbf96c1910a852241
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
                        {"_prod_code", "ak_630ce8157b69499bbf96c1910a852241"},
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
                        {"_prod_code", "ak_630ce8157b69499bbf96c1910a852241"},
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
         * Description: 区块链实例创建（内部）
         * Summary: 区块链创建（内部）
         */
        public CreateBaasBlockchainInstanceInnerResponse CreateBaasBlockchainInstanceInner(CreateBaasBlockchainInstanceInnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaasBlockchainInstanceInnerEx(request, headers, runtime);
        }

        /**
         * Description: 区块链实例创建（内部）
         * Summary: 区块链创建（内部）
         */
        public async Task<CreateBaasBlockchainInstanceInnerResponse> CreateBaasBlockchainInstanceInnerAsync(CreateBaasBlockchainInstanceInnerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaasBlockchainInstanceInnerExAsync(request, headers, runtime);
        }

        /**
         * Description: 区块链实例创建（内部）
         * Summary: 区块链创建（内部）
         */
        public CreateBaasBlockchainInstanceInnerResponse CreateBaasBlockchainInstanceInnerEx(CreateBaasBlockchainInstanceInnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasBlockchainInstanceInnerResponse>(DoRequest("1.0", "baas.blockchain.instance.inner.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链实例创建（内部）
         * Summary: 区块链创建（内部）
         */
        public async Task<CreateBaasBlockchainInstanceInnerResponse> CreateBaasBlockchainInstanceInnerExAsync(CreateBaasBlockchainInstanceInnerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasBlockchainInstanceInnerResponse>(await DoRequestAsync("1.0", "baas.blockchain.instance.inner.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动创建账户
         * Summary: 自动创建账户
         */
        public ApplyBaasChainAccountAntResponse ApplyBaasChainAccountAnt(ApplyBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyBaasChainAccountAntEx(request, headers, runtime);
        }

        /**
         * Description: 自动创建账户
         * Summary: 自动创建账户
         */
        public async Task<ApplyBaasChainAccountAntResponse> ApplyBaasChainAccountAntAsync(ApplyBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyBaasChainAccountAntExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动创建账户
         * Summary: 自动创建账户
         */
        public ApplyBaasChainAccountAntResponse ApplyBaasChainAccountAntEx(ApplyBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBaasChainAccountAntResponse>(DoRequest("1.0", "baas.chain.account.ant.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动创建账户
         * Summary: 自动创建账户
         */
        public async Task<ApplyBaasChainAccountAntResponse> ApplyBaasChainAccountAntExAsync(ApplyBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBaasChainAccountAntResponse>(await DoRequestAsync("1.0", "baas.chain.account.ant.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手工创建账户
         * Summary: 手工创建账户
         */
        public CreateBaasChainAccountAntResponse CreateBaasChainAccountAnt(CreateBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaasChainAccountAntEx(request, headers, runtime);
        }

        /**
         * Description: 手工创建账户
         * Summary: 手工创建账户
         */
        public async Task<CreateBaasChainAccountAntResponse> CreateBaasChainAccountAntAsync(CreateBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaasChainAccountAntExAsync(request, headers, runtime);
        }

        /**
         * Description: 手工创建账户
         * Summary: 手工创建账户
         */
        public CreateBaasChainAccountAntResponse CreateBaasChainAccountAntEx(CreateBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasChainAccountAntResponse>(DoRequest("1.0", "baas.chain.account.ant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 手工创建账户
         * Summary: 手工创建账户
         */
        public async Task<CreateBaasChainAccountAntResponse> CreateBaasChainAccountAntExAsync(CreateBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasChainAccountAntResponse>(await DoRequestAsync("1.0", "baas.chain.account.ant.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链链上账户冻结
         * Summary: 区块链链上账户冻结
         */
        public FreezeBaasChainAccountAntResponse FreezeBaasChainAccountAnt(FreezeBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return FreezeBaasChainAccountAntEx(request, headers, runtime);
        }

        /**
         * Description: 区块链链上账户冻结
         * Summary: 区块链链上账户冻结
         */
        public async Task<FreezeBaasChainAccountAntResponse> FreezeBaasChainAccountAntAsync(FreezeBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await FreezeBaasChainAccountAntExAsync(request, headers, runtime);
        }

        /**
         * Description: 区块链链上账户冻结
         * Summary: 区块链链上账户冻结
         */
        public FreezeBaasChainAccountAntResponse FreezeBaasChainAccountAntEx(FreezeBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeBaasChainAccountAntResponse>(DoRequest("1.0", "baas.chain.account.ant.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链链上账户冻结
         * Summary: 区块链链上账户冻结
         */
        public async Task<FreezeBaasChainAccountAntResponse> FreezeBaasChainAccountAntExAsync(FreezeBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<FreezeBaasChainAccountAntResponse>(await DoRequestAsync("1.0", "baas.chain.account.ant.freeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上账户列表
         * Summary: 查询链上账户列表
         */
        public QueryBaasChainAccountAntResponse QueryBaasChainAccountAnt(QueryBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasChainAccountAntEx(request, headers, runtime);
        }

        /**
         * Description: 查询链上账户列表
         * Summary: 查询链上账户列表
         */
        public async Task<QueryBaasChainAccountAntResponse> QueryBaasChainAccountAntAsync(QueryBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasChainAccountAntExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询链上账户列表
         * Summary: 查询链上账户列表
         */
        public QueryBaasChainAccountAntResponse QueryBaasChainAccountAntEx(QueryBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasChainAccountAntResponse>(DoRequest("1.0", "baas.chain.account.ant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询链上账户列表
         * Summary: 查询链上账户列表
         */
        public async Task<QueryBaasChainAccountAntResponse> QueryBaasChainAccountAntExAsync(QueryBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasChainAccountAntResponse>(await DoRequestAsync("1.0", "baas.chain.account.ant.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蚂蚁区块链账户解冻
         * Summary: 蚂蚁区块链账户解冻
         */
        public UnfreezeBaasChainAccountAntResponse UnfreezeBaasChainAccountAnt(UnfreezeBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UnfreezeBaasChainAccountAntEx(request, headers, runtime);
        }

        /**
         * Description: 蚂蚁区块链账户解冻
         * Summary: 蚂蚁区块链账户解冻
         */
        public async Task<UnfreezeBaasChainAccountAntResponse> UnfreezeBaasChainAccountAntAsync(UnfreezeBaasChainAccountAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UnfreezeBaasChainAccountAntExAsync(request, headers, runtime);
        }

        /**
         * Description: 蚂蚁区块链账户解冻
         * Summary: 蚂蚁区块链账户解冻
         */
        public UnfreezeBaasChainAccountAntResponse UnfreezeBaasChainAccountAntEx(UnfreezeBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeBaasChainAccountAntResponse>(DoRequest("1.0", "baas.chain.account.ant.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 蚂蚁区块链账户解冻
         * Summary: 蚂蚁区块链账户解冻
         */
        public async Task<UnfreezeBaasChainAccountAntResponse> UnfreezeBaasChainAccountAntExAsync(UnfreezeBaasChainAccountAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UnfreezeBaasChainAccountAntResponse>(await DoRequestAsync("1.0", "baas.chain.account.ant.unfreeze", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新区块链的名称
         * Summary: 更新区块链的名称
         */
        public UpdateBaasChainNameAntResponse UpdateBaasChainNameAnt(UpdateBaasChainNameAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaasChainNameAntEx(request, headers, runtime);
        }

        /**
         * Description: 更新区块链的名称
         * Summary: 更新区块链的名称
         */
        public async Task<UpdateBaasChainNameAntResponse> UpdateBaasChainNameAntAsync(UpdateBaasChainNameAntRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaasChainNameAntExAsync(request, headers, runtime);
        }

        /**
         * Description: 更新区块链的名称
         * Summary: 更新区块链的名称
         */
        public UpdateBaasChainNameAntResponse UpdateBaasChainNameAntEx(UpdateBaasChainNameAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasChainNameAntResponse>(DoRequest("1.0", "baas.chain.name.ant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 更新区块链的名称
         * Summary: 更新区块链的名称
         */
        public async Task<UpdateBaasChainNameAntResponse> UpdateBaasChainNameAntExAsync(UpdateBaasChainNameAntRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasChainNameAntResponse>(await DoRequestAsync("1.0", "baas.chain.name.ant.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链创建
         * Summary: 阿里云子链创建
         */
        public CreateBaasChainSubnetResponse CreateBaasChainSubnet(CreateBaasChainSubnetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaasChainSubnetEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链创建
         * Summary: 阿里云子链创建
         */
        public async Task<CreateBaasChainSubnetResponse> CreateBaasChainSubnetAsync(CreateBaasChainSubnetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaasChainSubnetExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链创建
         * Summary: 阿里云子链创建
         */
        public CreateBaasChainSubnetResponse CreateBaasChainSubnetEx(CreateBaasChainSubnetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasChainSubnetResponse>(DoRequest("1.0", "baas.chain.subnet.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链创建
         * Summary: 阿里云子链创建
         */
        public async Task<CreateBaasChainSubnetResponse> CreateBaasChainSubnetExAsync(CreateBaasChainSubnetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasChainSubnetResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链创建的前置检查
         * Summary: 阿里云子链创建的前置检查
         */
        public CheckBaasChainSubnetCreateResponse CheckBaasChainSubnetCreate(CheckBaasChainSubnetCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckBaasChainSubnetCreateEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链创建的前置检查
         * Summary: 阿里云子链创建的前置检查
         */
        public async Task<CheckBaasChainSubnetCreateResponse> CheckBaasChainSubnetCreateAsync(CheckBaasChainSubnetCreateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckBaasChainSubnetCreateExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链创建的前置检查
         * Summary: 阿里云子链创建的前置检查
         */
        public CheckBaasChainSubnetCreateResponse CheckBaasChainSubnetCreateEx(CheckBaasChainSubnetCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckBaasChainSubnetCreateResponse>(DoRequest("1.0", "baas.chain.subnet.create.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链创建的前置检查
         * Summary: 阿里云子链创建的前置检查
         */
        public async Task<CheckBaasChainSubnetCreateResponse> CheckBaasChainSubnetCreateExAsync(CheckBaasChainSubnetCreateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckBaasChainSubnetCreateResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.create.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链的启动
         * Summary: 阿里云子链的启动
         */
        public ExecBaasChainSubnetResponse ExecBaasChainSubnet(ExecBaasChainSubnetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecBaasChainSubnetEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链的启动
         * Summary: 阿里云子链的启动
         */
        public async Task<ExecBaasChainSubnetResponse> ExecBaasChainSubnetAsync(ExecBaasChainSubnetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecBaasChainSubnetExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链的启动
         * Summary: 阿里云子链的启动
         */
        public ExecBaasChainSubnetResponse ExecBaasChainSubnetEx(ExecBaasChainSubnetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecBaasChainSubnetResponse>(DoRequest("1.0", "baas.chain.subnet.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链的启动
         * Summary: 阿里云子链的启动
         */
        public async Task<ExecBaasChainSubnetResponse> ExecBaasChainSubnetExAsync(ExecBaasChainSubnetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecBaasChainSubnetResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链成员添加
         * Summary: 阿里云子链成员添加
         */
        public AddBaasChainSubnetMemberResponse AddBaasChainSubnetMember(AddBaasChainSubnetMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AddBaasChainSubnetMemberEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链成员添加
         * Summary: 阿里云子链成员添加
         */
        public async Task<AddBaasChainSubnetMemberResponse> AddBaasChainSubnetMemberAsync(AddBaasChainSubnetMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AddBaasChainSubnetMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链成员添加
         * Summary: 阿里云子链成员添加
         */
        public AddBaasChainSubnetMemberResponse AddBaasChainSubnetMemberEx(AddBaasChainSubnetMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBaasChainSubnetMemberResponse>(DoRequest("1.0", "baas.chain.subnet.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链成员添加
         * Summary: 阿里云子链成员添加
         */
        public async Task<AddBaasChainSubnetMemberResponse> AddBaasChainSubnetMemberExAsync(AddBaasChainSubnetMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AddBaasChainSubnetMemberResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.member.add", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链成员添加前校验
         * Summary: 阿里云子链成员添加前校验
         */
        public CheckBaasChainSubnetMemberResponse CheckBaasChainSubnetMember(CheckBaasChainSubnetMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckBaasChainSubnetMemberEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链成员添加前校验
         * Summary: 阿里云子链成员添加前校验
         */
        public async Task<CheckBaasChainSubnetMemberResponse> CheckBaasChainSubnetMemberAsync(CheckBaasChainSubnetMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckBaasChainSubnetMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链成员添加前校验
         * Summary: 阿里云子链成员添加前校验
         */
        public CheckBaasChainSubnetMemberResponse CheckBaasChainSubnetMemberEx(CheckBaasChainSubnetMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckBaasChainSubnetMemberResponse>(DoRequest("1.0", "baas.chain.subnet.member.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链成员添加前校验
         * Summary: 阿里云子链成员添加前校验
         */
        public async Task<CheckBaasChainSubnetMemberResponse> CheckBaasChainSubnetMemberExAsync(CheckBaasChainSubnetMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckBaasChainSubnetMemberResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.member.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链成员删除
         * Summary: 阿里云子链成员删除
         */
        public DeleteBaasChainSubnetMemberResponse DeleteBaasChainSubnetMember(DeleteBaasChainSubnetMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteBaasChainSubnetMemberEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链成员删除
         * Summary: 阿里云子链成员删除
         */
        public async Task<DeleteBaasChainSubnetMemberResponse> DeleteBaasChainSubnetMemberAsync(DeleteBaasChainSubnetMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteBaasChainSubnetMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链成员删除
         * Summary: 阿里云子链成员删除
         */
        public DeleteBaasChainSubnetMemberResponse DeleteBaasChainSubnetMemberEx(DeleteBaasChainSubnetMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBaasChainSubnetMemberResponse>(DoRequest("1.0", "baas.chain.subnet.member.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链成员删除
         * Summary: 阿里云子链成员删除
         */
        public async Task<DeleteBaasChainSubnetMemberResponse> DeleteBaasChainSubnetMemberExAsync(DeleteBaasChainSubnetMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBaasChainSubnetMemberResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.member.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链机构列表查询
         * Summary: 阿里云子链机构列表查询
         */
        public QueryBaasChainSubnetMemberResponse QueryBaasChainSubnetMember(QueryBaasChainSubnetMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasChainSubnetMemberEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链机构列表查询
         * Summary: 阿里云子链机构列表查询
         */
        public async Task<QueryBaasChainSubnetMemberResponse> QueryBaasChainSubnetMemberAsync(QueryBaasChainSubnetMemberRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasChainSubnetMemberExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链机构列表查询
         * Summary: 阿里云子链机构列表查询
         */
        public QueryBaasChainSubnetMemberResponse QueryBaasChainSubnetMemberEx(QueryBaasChainSubnetMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasChainSubnetMemberResponse>(DoRequest("1.0", "baas.chain.subnet.member.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链机构列表查询
         * Summary: 阿里云子链机构列表查询
         */
        public async Task<QueryBaasChainSubnetMemberResponse> QueryBaasChainSubnetMemberExAsync(QueryBaasChainSubnetMemberRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasChainSubnetMemberResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.member.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链名称修改
         * Summary: 阿里云子链名称修改
         */
        public UpdateBaasChainSubnetNameResponse UpdateBaasChainSubnetName(UpdateBaasChainSubnetNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaasChainSubnetNameEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链名称修改
         * Summary: 阿里云子链名称修改
         */
        public async Task<UpdateBaasChainSubnetNameResponse> UpdateBaasChainSubnetNameAsync(UpdateBaasChainSubnetNameRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaasChainSubnetNameExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链名称修改
         * Summary: 阿里云子链名称修改
         */
        public UpdateBaasChainSubnetNameResponse UpdateBaasChainSubnetNameEx(UpdateBaasChainSubnetNameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasChainSubnetNameResponse>(DoRequest("1.0", "baas.chain.subnet.name.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链名称修改
         * Summary: 阿里云子链名称修改
         */
        public async Task<UpdateBaasChainSubnetNameResponse> UpdateBaasChainSubnetNameExAsync(UpdateBaasChainSubnetNameRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasChainSubnetNameResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.name.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链列表查询
         * Summary: 阿里云子链列表查询
         */
        public QueryBaasChainSubnetResponse QueryBaasChainSubnet(QueryBaasChainSubnetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasChainSubnetEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链列表查询
         * Summary: 阿里云子链列表查询
         */
        public async Task<QueryBaasChainSubnetResponse> QueryBaasChainSubnetAsync(QueryBaasChainSubnetRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasChainSubnetExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链列表查询
         * Summary: 阿里云子链列表查询
         */
        public QueryBaasChainSubnetResponse QueryBaasChainSubnetEx(QueryBaasChainSubnetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasChainSubnetResponse>(DoRequest("1.0", "baas.chain.subnet.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链列表查询
         * Summary: 阿里云子链列表查询
         */
        public async Task<QueryBaasChainSubnetResponse> QueryBaasChainSubnetExAsync(QueryBaasChainSubnetRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasChainSubnetResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链REST开通
         * Summary: 阿里云子链REST开通
         */
        public ApplyBaasChainSubnetRestResponse ApplyBaasChainSubnetRest(ApplyBaasChainSubnetRestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ApplyBaasChainSubnetRestEx(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链REST开通
         * Summary: 阿里云子链REST开通
         */
        public async Task<ApplyBaasChainSubnetRestResponse> ApplyBaasChainSubnetRestAsync(ApplyBaasChainSubnetRestRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ApplyBaasChainSubnetRestExAsync(request, headers, runtime);
        }

        /**
         * Description: 阿里云子链REST开通
         * Summary: 阿里云子链REST开通
         */
        public ApplyBaasChainSubnetRestResponse ApplyBaasChainSubnetRestEx(ApplyBaasChainSubnetRestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBaasChainSubnetRestResponse>(DoRequest("1.0", "baas.chain.subnet.rest.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 阿里云子链REST开通
         * Summary: 阿里云子链REST开通
         */
        public async Task<ApplyBaasChainSubnetRestResponse> ApplyBaasChainSubnetRestExAsync(ApplyBaasChainSubnetRestRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ApplyBaasChainSubnetRestResponse>(await DoRequestAsync("1.0", "baas.chain.subnet.rest.apply", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取联盟内的蚂蚁区块链列表
         * Summary: 获取联盟内的蚂蚁区块链列表
         */
        public QueryBaasUnionChainResponse QueryBaasUnionChain(QueryBaasUnionChainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasUnionChainEx(request, headers, runtime);
        }

        /**
         * Description: 获取联盟内的蚂蚁区块链列表
         * Summary: 获取联盟内的蚂蚁区块链列表
         */
        public async Task<QueryBaasUnionChainResponse> QueryBaasUnionChainAsync(QueryBaasUnionChainRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasUnionChainExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取联盟内的蚂蚁区块链列表
         * Summary: 获取联盟内的蚂蚁区块链列表
         */
        public QueryBaasUnionChainResponse QueryBaasUnionChainEx(QueryBaasUnionChainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasUnionChainResponse>(DoRequest("1.0", "baas.union.chain.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取联盟内的蚂蚁区块链列表
         * Summary: 获取联盟内的蚂蚁区块链列表
         */
        public async Task<QueryBaasUnionChainResponse> QueryBaasUnionChainExAsync(QueryBaasUnionChainRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasUnionChainResponse>(await DoRequestAsync("1.0", "baas.union.chain.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public CreateBaasUnionUnionResponse CreateBaasUnionUnion(CreateBaasUnionUnionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateBaasUnionUnionEx(request, headers, runtime);
        }

        /**
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public async Task<CreateBaasUnionUnionResponse> CreateBaasUnionUnionAsync(CreateBaasUnionUnionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateBaasUnionUnionExAsync(request, headers, runtime);
        }

        /**
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public CreateBaasUnionUnionResponse CreateBaasUnionUnionEx(CreateBaasUnionUnionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasUnionUnionResponse>(DoRequest("1.0", "baas.union.union.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 创建联盟
         * Summary: 创建联盟
         */
        public async Task<CreateBaasUnionUnionResponse> CreateBaasUnionUnionExAsync(CreateBaasUnionUnionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateBaasUnionUnionResponse>(await DoRequestAsync("1.0", "baas.union.union.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除联盟
         * Summary: 删除联盟
         */
        public DeleteBaasUnionUnionResponse DeleteBaasUnionUnion(DeleteBaasUnionUnionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DeleteBaasUnionUnionEx(request, headers, runtime);
        }

        /**
         * Description: 删除联盟
         * Summary: 删除联盟
         */
        public async Task<DeleteBaasUnionUnionResponse> DeleteBaasUnionUnionAsync(DeleteBaasUnionUnionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DeleteBaasUnionUnionExAsync(request, headers, runtime);
        }

        /**
         * Description: 删除联盟
         * Summary: 删除联盟
         */
        public DeleteBaasUnionUnionResponse DeleteBaasUnionUnionEx(DeleteBaasUnionUnionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBaasUnionUnionResponse>(DoRequest("1.0", "baas.union.union.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 删除联盟
         * Summary: 删除联盟
         */
        public async Task<DeleteBaasUnionUnionResponse> DeleteBaasUnionUnionExAsync(DeleteBaasUnionUnionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DeleteBaasUnionUnionResponse>(await DoRequestAsync("1.0", "baas.union.union.delete", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联盟查询
         * Summary: 联盟查询
         */
        public QueryBaasUnionUnionResponse QueryBaasUnionUnion(QueryBaasUnionUnionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryBaasUnionUnionEx(request, headers, runtime);
        }

        /**
         * Description: 联盟查询
         * Summary: 联盟查询
         */
        public async Task<QueryBaasUnionUnionResponse> QueryBaasUnionUnionAsync(QueryBaasUnionUnionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryBaasUnionUnionExAsync(request, headers, runtime);
        }

        /**
         * Description: 联盟查询
         * Summary: 联盟查询
         */
        public QueryBaasUnionUnionResponse QueryBaasUnionUnionEx(QueryBaasUnionUnionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasUnionUnionResponse>(DoRequest("1.0", "baas.union.union.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联盟查询
         * Summary: 联盟查询
         */
        public async Task<QueryBaasUnionUnionResponse> QueryBaasUnionUnionExAsync(QueryBaasUnionUnionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryBaasUnionUnionResponse>(await DoRequestAsync("1.0", "baas.union.union.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联盟更新
         * Summary: 联盟更新
         */
        public UpdateBaasUnionUnionResponse UpdateBaasUnionUnion(UpdateBaasUnionUnionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UpdateBaasUnionUnionEx(request, headers, runtime);
        }

        /**
         * Description: 联盟更新
         * Summary: 联盟更新
         */
        public async Task<UpdateBaasUnionUnionResponse> UpdateBaasUnionUnionAsync(UpdateBaasUnionUnionRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UpdateBaasUnionUnionExAsync(request, headers, runtime);
        }

        /**
         * Description: 联盟更新
         * Summary: 联盟更新
         */
        public UpdateBaasUnionUnionResponse UpdateBaasUnionUnionEx(UpdateBaasUnionUnionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasUnionUnionResponse>(DoRequest("1.0", "baas.union.union.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 联盟更新
         * Summary: 联盟更新
         */
        public async Task<UpdateBaasUnionUnionResponse> UpdateBaasUnionUnionExAsync(UpdateBaasUnionUnionRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UpdateBaasUnionUnionResponse>(await DoRequestAsync("1.0", "baas.union.union.update", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
