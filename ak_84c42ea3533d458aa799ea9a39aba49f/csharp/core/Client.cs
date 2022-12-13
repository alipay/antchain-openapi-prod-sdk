// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.Ak_84c42ea3533d458aa799ea9a39aba49f.Models;

namespace AntChain.SDK.Ak_84c42ea3533d458aa799ea9a39aba49f
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
         * Description: 用于外部业务平台会员查询已绑定账号
         * Summary: B2B资金服务账号查询
         */
        public QueryAntchainDefincashierSaasAccountResponse QueryAntchainDefincashierSaasAccount(QueryAntchainDefincashierSaasAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDefincashierSaasAccountEx(request, headers, runtime);
        }

        /**
         * Description: 用于外部业务平台会员查询已绑定账号
         * Summary: B2B资金服务账号查询
         */
        public async Task<QueryAntchainDefincashierSaasAccountResponse> QueryAntchainDefincashierSaasAccountAsync(QueryAntchainDefincashierSaasAccountRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDefincashierSaasAccountExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于外部业务平台会员查询已绑定账号
         * Summary: B2B资金服务账号查询
         */
        public QueryAntchainDefincashierSaasAccountResponse QueryAntchainDefincashierSaasAccountEx(QueryAntchainDefincashierSaasAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasAccountResponse>(DoRequest("1.0", "antchain.defincashier.saas.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于外部业务平台会员查询已绑定账号
         * Summary: B2B资金服务账号查询
         */
        public async Task<QueryAntchainDefincashierSaasAccountResponse> QueryAntchainDefincashierSaasAccountExAsync(QueryAntchainDefincashierSaasAccountRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasAccountResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.account.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询会员的产品签约协议
         * Summary: B2B资金服务签约查询
         */
        public QueryAntchainDefincashierSaasAgreementResponse QueryAntchainDefincashierSaasAgreement(QueryAntchainDefincashierSaasAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDefincashierSaasAgreementEx(request, headers, runtime);
        }

        /**
         * Description: 查询会员的产品签约协议
         * Summary: B2B资金服务签约查询
         */
        public async Task<QueryAntchainDefincashierSaasAgreementResponse> QueryAntchainDefincashierSaasAgreementAsync(QueryAntchainDefincashierSaasAgreementRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDefincashierSaasAgreementExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询会员的产品签约协议
         * Summary: B2B资金服务签约查询
         */
        public QueryAntchainDefincashierSaasAgreementResponse QueryAntchainDefincashierSaasAgreementEx(QueryAntchainDefincashierSaasAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasAgreementResponse>(DoRequest("1.0", "antchain.defincashier.saas.agreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询会员的产品签约协议
         * Summary: B2B资金服务签约查询
         */
        public async Task<QueryAntchainDefincashierSaasAgreementResponse> QueryAntchainDefincashierSaasAgreementExAsync(QueryAntchainDefincashierSaasAgreementRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasAgreementResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.agreement.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以根据流水号查询请款，退款等资金操作明细
         * Summary: B2B资金服务交易资金操作明细查询
         */
        public QueryAntchainDefincashierSaasFunditemResponse QueryAntchainDefincashierSaasFunditem(QueryAntchainDefincashierSaasFunditemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDefincashierSaasFunditemEx(request, headers, runtime);
        }

        /**
         * Description: 可以根据流水号查询请款，退款等资金操作明细
         * Summary: B2B资金服务交易资金操作明细查询
         */
        public async Task<QueryAntchainDefincashierSaasFunditemResponse> QueryAntchainDefincashierSaasFunditemAsync(QueryAntchainDefincashierSaasFunditemRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDefincashierSaasFunditemExAsync(request, headers, runtime);
        }

        /**
         * Description: 可以根据流水号查询请款，退款等资金操作明细
         * Summary: B2B资金服务交易资金操作明细查询
         */
        public QueryAntchainDefincashierSaasFunditemResponse QueryAntchainDefincashierSaasFunditemEx(QueryAntchainDefincashierSaasFunditemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasFunditemResponse>(DoRequest("1.0", "antchain.defincashier.saas.funditem.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 可以根据流水号查询请款，退款等资金操作明细
         * Summary: B2B资金服务交易资金操作明细查询
         */
        public async Task<QueryAntchainDefincashierSaasFunditemResponse> QueryAntchainDefincashierSaasFunditemExAsync(QueryAntchainDefincashierSaasFunditemRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasFunditemResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.funditem.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
         * Summary: B2B资金服务机构信息查询
         */
        public QueryAntchainDefincashierSaasInstResponse QueryAntchainDefincashierSaasInst(QueryAntchainDefincashierSaasInstRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDefincashierSaasInstEx(request, headers, runtime);
        }

        /**
         * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
         * Summary: B2B资金服务机构信息查询
         */
        public async Task<QueryAntchainDefincashierSaasInstResponse> QueryAntchainDefincashierSaasInstAsync(QueryAntchainDefincashierSaasInstRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDefincashierSaasInstExAsync(request, headers, runtime);
        }

        /**
         * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
         * Summary: B2B资金服务机构信息查询
         */
        public QueryAntchainDefincashierSaasInstResponse QueryAntchainDefincashierSaasInstEx(QueryAntchainDefincashierSaasInstRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasInstResponse>(DoRequest("1.0", "antchain.defincashier.saas.inst.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
         * Summary: B2B资金服务机构信息查询
         */
        public async Task<QueryAntchainDefincashierSaasInstResponse> QueryAntchainDefincashierSaasInstExAsync(QueryAntchainDefincashierSaasInstRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasInstResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.inst.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
         * Summary: B2B资金服务交易撤销
         */
        public CancelAntchainDefincashierSaasPaymentResponse CancelAntchainDefincashierSaasPayment(CancelAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CancelAntchainDefincashierSaasPaymentEx(request, headers, runtime);
        }

        /**
         * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
         * Summary: B2B资金服务交易撤销
         */
        public async Task<CancelAntchainDefincashierSaasPaymentResponse> CancelAntchainDefincashierSaasPaymentAsync(CancelAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CancelAntchainDefincashierSaasPaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
         * Summary: B2B资金服务交易撤销
         */
        public CancelAntchainDefincashierSaasPaymentResponse CancelAntchainDefincashierSaasPaymentEx(CancelAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainDefincashierSaasPaymentResponse>(DoRequest("1.0", "antchain.defincashier.saas.payment.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
         * Summary: B2B资金服务交易撤销
         */
        public async Task<CancelAntchainDefincashierSaasPaymentResponse> CancelAntchainDefincashierSaasPaymentExAsync(CancelAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CancelAntchainDefincashierSaasPaymentResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.payment.cancel", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
         * Summary: B2B资金服务交易请款
         */
        public CaptureAntchainDefincashierSaasPaymentResponse CaptureAntchainDefincashierSaasPayment(CaptureAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CaptureAntchainDefincashierSaasPaymentEx(request, headers, runtime);
        }

        /**
         * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
         * Summary: B2B资金服务交易请款
         */
        public async Task<CaptureAntchainDefincashierSaasPaymentResponse> CaptureAntchainDefincashierSaasPaymentAsync(CaptureAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CaptureAntchainDefincashierSaasPaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
         * Summary: B2B资金服务交易请款
         */
        public CaptureAntchainDefincashierSaasPaymentResponse CaptureAntchainDefincashierSaasPaymentEx(CaptureAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CaptureAntchainDefincashierSaasPaymentResponse>(DoRequest("1.0", "antchain.defincashier.saas.payment.capture", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
         * Summary: B2B资金服务交易请款
         */
        public async Task<CaptureAntchainDefincashierSaasPaymentResponse> CaptureAntchainDefincashierSaasPaymentExAsync(CaptureAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CaptureAntchainDefincashierSaasPaymentResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.payment.capture", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B2B支付场景，创建交易前检查
         * Summary: B2B资金服务交易前检查
         */
        public CheckAntchainDefincashierSaasPaymentResponse CheckAntchainDefincashierSaasPayment(CheckAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckAntchainDefincashierSaasPaymentEx(request, headers, runtime);
        }

        /**
         * Description: B2B支付场景，创建交易前检查
         * Summary: B2B资金服务交易前检查
         */
        public async Task<CheckAntchainDefincashierSaasPaymentResponse> CheckAntchainDefincashierSaasPaymentAsync(CheckAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckAntchainDefincashierSaasPaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: B2B支付场景，创建交易前检查
         * Summary: B2B资金服务交易前检查
         */
        public CheckAntchainDefincashierSaasPaymentResponse CheckAntchainDefincashierSaasPaymentEx(CheckAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAntchainDefincashierSaasPaymentResponse>(DoRequest("1.0", "antchain.defincashier.saas.payment.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B2B支付场景，创建交易前检查
         * Summary: B2B资金服务交易前检查
         */
        public async Task<CheckAntchainDefincashierSaasPaymentResponse> CheckAntchainDefincashierSaasPaymentExAsync(CheckAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckAntchainDefincashierSaasPaymentResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.payment.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B2B支付场景，创建交易服务
         * Summary: B2B资金服务创建交易
         */
        public CreateAntchainDefincashierSaasPaymentResponse CreateAntchainDefincashierSaasPayment(CreateAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateAntchainDefincashierSaasPaymentEx(request, headers, runtime);
        }

        /**
         * Description: B2B支付场景，创建交易服务
         * Summary: B2B资金服务创建交易
         */
        public async Task<CreateAntchainDefincashierSaasPaymentResponse> CreateAntchainDefincashierSaasPaymentAsync(CreateAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateAntchainDefincashierSaasPaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: B2B支付场景，创建交易服务
         * Summary: B2B资金服务创建交易
         */
        public CreateAntchainDefincashierSaasPaymentResponse CreateAntchainDefincashierSaasPaymentEx(CreateAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainDefincashierSaasPaymentResponse>(DoRequest("1.0", "antchain.defincashier.saas.payment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: B2B支付场景，创建交易服务
         * Summary: B2B资金服务创建交易
         */
        public async Task<CreateAntchainDefincashierSaasPaymentResponse> CreateAntchainDefincashierSaasPaymentExAsync(CreateAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateAntchainDefincashierSaasPaymentResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.payment.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 适用于创建交易后，查询交易详情。
         * Summary: B2B资金服务查询交易
         */
        public QueryAntchainDefincashierSaasPaymentResponse QueryAntchainDefincashierSaasPayment(QueryAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryAntchainDefincashierSaasPaymentEx(request, headers, runtime);
        }

        /**
         * Description: 适用于创建交易后，查询交易详情。
         * Summary: B2B资金服务查询交易
         */
        public async Task<QueryAntchainDefincashierSaasPaymentResponse> QueryAntchainDefincashierSaasPaymentAsync(QueryAntchainDefincashierSaasPaymentRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryAntchainDefincashierSaasPaymentExAsync(request, headers, runtime);
        }

        /**
         * Description: 适用于创建交易后，查询交易详情。
         * Summary: B2B资金服务查询交易
         */
        public QueryAntchainDefincashierSaasPaymentResponse QueryAntchainDefincashierSaasPaymentEx(QueryAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasPaymentResponse>(DoRequest("1.0", "antchain.defincashier.saas.payment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 适用于创建交易后，查询交易详情。
         * Summary: B2B资金服务查询交易
         */
        public async Task<QueryAntchainDefincashierSaasPaymentResponse> QueryAntchainDefincashierSaasPaymentExAsync(QueryAntchainDefincashierSaasPaymentRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryAntchainDefincashierSaasPaymentResponse>(await DoRequestAsync("1.0", "antchain.defincashier.saas.payment.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
