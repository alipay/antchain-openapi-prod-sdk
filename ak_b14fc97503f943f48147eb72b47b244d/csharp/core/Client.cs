// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_b14fc97503f943f48147eb72b47b244d.Models;

namespace AntChain.SDK.Ak_b14fc97503f943f48147eb72b47b244d
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
                        {"sdk_version", "1.0.1"},
                        {"_prod_code", "ak_b14fc97503f943f48147eb72b47b244d"},
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
                        {"sdk_version", "1.0.1"},
                        {"_prod_code", "ak_b14fc97503f943f48147eb72b47b244d"},
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
         * Description: 对企业/个人进行身份认证
         * Summary: 统一客户认证接口
         */
        public AuthAntchainBbpCustomerResponse AuthAntchainBbpCustomer(AuthAntchainBbpCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthAntchainBbpCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 对企业/个人进行身份认证
         * Summary: 统一客户认证接口
         */
        public async Task<AuthAntchainBbpCustomerResponse> AuthAntchainBbpCustomerAsync(AuthAntchainBbpCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthAntchainBbpCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 对企业/个人进行身份认证
         * Summary: 统一客户认证接口
         */
        public AuthAntchainBbpCustomerResponse AuthAntchainBbpCustomerEx(AuthAntchainBbpCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainBbpCustomerResponse>(DoRequest("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 对企业/个人进行身份认证
         * Summary: 统一客户认证接口
         */
        public async Task<AuthAntchainBbpCustomerResponse> AuthAntchainBbpCustomerExAsync(AuthAntchainBbpCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthAntchainBbpCustomerResponse>(await DoRequestAsync("1.0", "antchain.bbp.customer.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智科统一客户注册
         * Summary: 统一客户注册接口
         */
        public CreateAntchainBbpCustomerResponse CreateAntchainBbpCustomer(CreateAntchainBbpCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainBbpCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 智科统一客户注册
         * Summary: 统一客户注册接口
         */
        public async Task<CreateAntchainBbpCustomerResponse> CreateAntchainBbpCustomerAsync(CreateAntchainBbpCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainBbpCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 智科统一客户注册
         * Summary: 统一客户注册接口
         */
        public CreateAntchainBbpCustomerResponse CreateAntchainBbpCustomerEx(CreateAntchainBbpCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainBbpCustomerResponse>(DoRequest("1.0", "antchain.bbp.customer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 智科统一客户注册
         * Summary: 统一客户注册接口
         */
        public async Task<CreateAntchainBbpCustomerResponse> CreateAntchainBbpCustomerExAsync(CreateAntchainBbpCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainBbpCustomerResponse>(await DoRequestAsync("1.0", "antchain.bbp.customer.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户信息查询
         * Summary: 客户信息查询
         */
        public QueryAntchainBbpCustomerResponse QueryAntchainBbpCustomer(QueryAntchainBbpCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainBbpCustomerEx(request, headers, runtime);
        }

        /**
         * Description: 客户信息查询
         * Summary: 客户信息查询
         */
        public async Task<QueryAntchainBbpCustomerResponse> QueryAntchainBbpCustomerAsync(QueryAntchainBbpCustomerRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainBbpCustomerExAsync(request, headers, runtime);
        }

        /**
         * Description: 客户信息查询
         * Summary: 客户信息查询
         */
        public QueryAntchainBbpCustomerResponse QueryAntchainBbpCustomerEx(QueryAntchainBbpCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainBbpCustomerResponse>(DoRequest("1.0", "antchain.bbp.customer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 客户信息查询
         * Summary: 客户信息查询
         */
        public async Task<QueryAntchainBbpCustomerResponse> QueryAntchainBbpCustomerExAsync(QueryAntchainBbpCustomerRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainBbpCustomerResponse>(await DoRequestAsync("1.0", "antchain.bbp.customer.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份关联链上账户
         * Summary: 身份关联链上账户
         */
        public MatchAntchainBbpDidAccountResponse MatchAntchainBbpDidAccount(MatchAntchainBbpDidAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MatchAntchainBbpDidAccountEx(request, headers, runtime);
        }

        /**
         * Description: 身份关联链上账户
         * Summary: 身份关联链上账户
         */
        public async Task<MatchAntchainBbpDidAccountResponse> MatchAntchainBbpDidAccountAsync(MatchAntchainBbpDidAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MatchAntchainBbpDidAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 身份关联链上账户
         * Summary: 身份关联链上账户
         */
        public MatchAntchainBbpDidAccountResponse MatchAntchainBbpDidAccountEx(MatchAntchainBbpDidAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchAntchainBbpDidAccountResponse>(DoRequest("1.0", "antchain.bbp.did.account.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 身份关联链上账户
         * Summary: 身份关联链上账户
         */
        public async Task<MatchAntchainBbpDidAccountResponse> MatchAntchainBbpDidAccountExAsync(MatchAntchainBbpDidAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchAntchainBbpDidAccountResponse>(await DoRequestAsync("1.0", "antchain.bbp.did.account.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单信息上链，保单信息同步
         * Summary: 保单信息上链
         */
        public OperateAntchainBbpInsuranceResponse OperateAntchainBbpInsurance(OperateAntchainBbpInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return OperateAntchainBbpInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 保单信息上链，保单信息同步
         * Summary: 保单信息上链
         */
        public async Task<OperateAntchainBbpInsuranceResponse> OperateAntchainBbpInsuranceAsync(OperateAntchainBbpInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await OperateAntchainBbpInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 保单信息上链，保单信息同步
         * Summary: 保单信息上链
         */
        public OperateAntchainBbpInsuranceResponse OperateAntchainBbpInsuranceEx(OperateAntchainBbpInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateAntchainBbpInsuranceResponse>(DoRequest("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保单信息上链，保单信息同步
         * Summary: 保单信息上链
         */
        public async Task<OperateAntchainBbpInsuranceResponse> OperateAntchainBbpInsuranceExAsync(OperateAntchainBbpInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<OperateAntchainBbpInsuranceResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.operate", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险理赔受理信息同步到蚂蚁链
         * Summary: 理赔受理上链
         */
        public SyncAntchainBbpInsuranceResponse SyncAntchainBbpInsurance(SyncAntchainBbpInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncAntchainBbpInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 保险理赔受理信息同步到蚂蚁链
         * Summary: 理赔受理上链
         */
        public async Task<SyncAntchainBbpInsuranceResponse> SyncAntchainBbpInsuranceAsync(SyncAntchainBbpInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncAntchainBbpInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 保险理赔受理信息同步到蚂蚁链
         * Summary: 理赔受理上链
         */
        public SyncAntchainBbpInsuranceResponse SyncAntchainBbpInsuranceEx(SyncAntchainBbpInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainBbpInsuranceResponse>(DoRequest("1.0", "antchain.bbp.insurance.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 保险理赔受理信息同步到蚂蚁链
         * Summary: 理赔受理上链
         */
        public async Task<SyncAntchainBbpInsuranceResponse> SyncAntchainBbpInsuranceExAsync(SyncAntchainBbpInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncAntchainBbpInsuranceResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传保单附件至阿里云OSS
         * Summary: 上传保单附件
         */
        public UploadAntchainBbpInsuranceResponse UploadAntchainBbpInsurance(UploadAntchainBbpInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return UploadAntchainBbpInsuranceEx(request, headers, runtime);
        }

        /**
         * Description: 上传保单附件至阿里云OSS
         * Summary: 上传保单附件
         */
        public async Task<UploadAntchainBbpInsuranceResponse> UploadAntchainBbpInsuranceAsync(UploadAntchainBbpInsuranceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await UploadAntchainBbpInsuranceExAsync(request, headers, runtime);
        }

        /**
         * Description: 上传保单附件至阿里云OSS
         * Summary: 上传保单附件
         */
        public UploadAntchainBbpInsuranceResponse UploadAntchainBbpInsuranceEx(UploadAntchainBbpInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainBbpInsuranceResponse>(DoRequest("1.0", "antchain.bbp.insurance.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 上传保单附件至阿里云OSS
         * Summary: 上传保单附件
         */
        public async Task<UploadAntchainBbpInsuranceResponse> UploadAntchainBbpInsuranceExAsync(UploadAntchainBbpInsuranceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<UploadAntchainBbpInsuranceResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.upload", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 记录用户登录保司小程序信息
         * Summary: 用户登陆页面埋点
         */
        public InitAntchainBbpInsuranceUserResponse InitAntchainBbpInsuranceUser(InitAntchainBbpInsuranceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitAntchainBbpInsuranceUserEx(request, headers, runtime);
        }

        /**
         * Description: 记录用户登录保司小程序信息
         * Summary: 用户登陆页面埋点
         */
        public async Task<InitAntchainBbpInsuranceUserResponse> InitAntchainBbpInsuranceUserAsync(InitAntchainBbpInsuranceUserRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitAntchainBbpInsuranceUserExAsync(request, headers, runtime);
        }

        /**
         * Description: 记录用户登录保司小程序信息
         * Summary: 用户登陆页面埋点
         */
        public InitAntchainBbpInsuranceUserResponse InitAntchainBbpInsuranceUserEx(InitAntchainBbpInsuranceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitAntchainBbpInsuranceUserResponse>(DoRequest("1.0", "antchain.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 记录用户登录保司小程序信息
         * Summary: 用户登陆页面埋点
         */
        public async Task<InitAntchainBbpInsuranceUserResponse> InitAntchainBbpInsuranceUserExAsync(InitAntchainBbpInsuranceUserRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitAntchainBbpInsuranceUserResponse>(await DoRequestAsync("1.0", "antchain.bbp.insurance.user.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身结果查询
         * Summary: 核身结果查询
         */
        public CheckAntchainBbpVerifyResponse CheckAntchainBbpVerify(CheckAntchainBbpVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAntchainBbpVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 核身结果查询
         * Summary: 核身结果查询
         */
        public async Task<CheckAntchainBbpVerifyResponse> CheckAntchainBbpVerifyAsync(CheckAntchainBbpVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAntchainBbpVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 核身结果查询
         * Summary: 核身结果查询
         */
        public CheckAntchainBbpVerifyResponse CheckAntchainBbpVerifyEx(CheckAntchainBbpVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAntchainBbpVerifyResponse>(DoRequest("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身结果查询
         * Summary: 核身结果查询
         */
        public async Task<CheckAntchainBbpVerifyResponse> CheckAntchainBbpVerifyExAsync(CheckAntchainBbpVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAntchainBbpVerifyResponse>(await DoRequestAsync("1.0", "antchain.bbp.verify.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public InitAntchainBbpVerifyResponse InitAntchainBbpVerify(InitAntchainBbpVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitAntchainBbpVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public async Task<InitAntchainBbpVerifyResponse> InitAntchainBbpVerifyAsync(InitAntchainBbpVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitAntchainBbpVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public InitAntchainBbpVerifyResponse InitAntchainBbpVerifyEx(InitAntchainBbpVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitAntchainBbpVerifyResponse>(DoRequest("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身初始化接口
         * Summary: 核身初始化接口
         */
        public async Task<InitAntchainBbpVerifyResponse> InitAntchainBbpVerifyExAsync(InitAntchainBbpVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitAntchainBbpVerifyResponse>(await DoRequestAsync("1.0", "antchain.bbp.verify.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身产品渲染接口
         * Summary: 核身产品渲染接口
         */
        public StartAntchainBbpVerifyResponse StartAntchainBbpVerify(StartAntchainBbpVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartAntchainBbpVerifyEx(request, headers, runtime);
        }

        /**
         * Description: 核身产品渲染接口
         * Summary: 核身产品渲染接口
         */
        public async Task<StartAntchainBbpVerifyResponse> StartAntchainBbpVerifyAsync(StartAntchainBbpVerifyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartAntchainBbpVerifyExAsync(request, headers, runtime);
        }

        /**
         * Description: 核身产品渲染接口
         * Summary: 核身产品渲染接口
         */
        public StartAntchainBbpVerifyResponse StartAntchainBbpVerifyEx(StartAntchainBbpVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAntchainBbpVerifyResponse>(DoRequest("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核身产品渲染接口
         * Summary: 核身产品渲染接口
         */
        public async Task<StartAntchainBbpVerifyResponse> StartAntchainBbpVerifyExAsync(StartAntchainBbpVerifyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartAntchainBbpVerifyResponse>(await DoRequestAsync("1.0", "antchain.bbp.verify.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建，用于测试新建&修改功能
         * Summary: 自动化测试创建，用于测试新建&修改功能
         */
        public BindDemoAaaBbbCccResponse BindDemoAaaBbbCcc(BindDemoAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return BindDemoAaaBbbCccEx(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建，用于测试新建&修改功能
         * Summary: 自动化测试创建，用于测试新建&修改功能
         */
        public async Task<BindDemoAaaBbbCccResponse> BindDemoAaaBbbCccAsync(BindDemoAaaBbbCccRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await BindDemoAaaBbbCccExAsync(request, headers, runtime);
        }

        /**
         * Description: 自动化测试创建，用于测试新建&修改功能
         * Summary: 自动化测试创建，用于测试新建&修改功能
         */
        public BindDemoAaaBbbCccResponse BindDemoAaaBbbCccEx(BindDemoAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoAaaBbbCccResponse>(DoRequest("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 自动化测试创建，用于测试新建&修改功能
         * Summary: 自动化测试创建，用于测试新建&修改功能
         */
        public async Task<BindDemoAaaBbbCccResponse> BindDemoAaaBbbCccExAsync(BindDemoAaaBbbCccRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<BindDemoAaaBbbCccResponse>(await DoRequestAsync("1.0", "demo.aaa.bbb.ccc.bind", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
