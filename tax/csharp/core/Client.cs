// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using AntChain.SDK.TAX.Models;

namespace AntChain.SDK.TAX
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
                        {"sdk_version", "1.6.0"},
                        {"_prod_code", "TAX"},
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
                        {"sdk_version", "1.6.0"},
                        {"_prod_code", "TAX"},
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
         * Description: 目前仅用于广州区块链发票开通企业信息推送
         * Summary: 区块链发票开通企业信息推送
         */
        public AuthCorpResponse AuthCorp(AuthCorpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthCorpEx(request, headers, runtime);
        }

        /**
         * Description: 目前仅用于广州区块链发票开通企业信息推送
         * Summary: 区块链发票开通企业信息推送
         */
        public async Task<AuthCorpResponse> AuthCorpAsync(AuthCorpRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthCorpExAsync(request, headers, runtime);
        }

        /**
         * Description: 目前仅用于广州区块链发票开通企业信息推送
         * Summary: 区块链发票开通企业信息推送
         */
        public AuthCorpResponse AuthCorpEx(AuthCorpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthCorpResponse>(DoRequest("1.0", "blockchain.tax.corp.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 目前仅用于广州区块链发票开通企业信息推送
         * Summary: 区块链发票开通企业信息推送
         */
        public async Task<AuthCorpResponse> AuthCorpExAsync(AuthCorpRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthCorpResponse>(await DoRequestAsync("1.0", "blockchain.tax.corp.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
         * Summary: 计费推送
         */
        public PushChargeResponse PushCharge(PushChargeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushChargeEx(request, headers, runtime);
        }

        /**
         * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
         * Summary: 计费推送
         */
        public async Task<PushChargeResponse> PushChargeAsync(PushChargeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushChargeExAsync(request, headers, runtime);
        }

        /**
         * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
         * Summary: 计费推送
         */
        public PushChargeResponse PushChargeEx(PushChargeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushChargeResponse>(DoRequest("1.0", "blockchain.tax.charge.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 目前用于浙江票据的计费推送，其他主站环境还是继续使用msg。
         * Summary: 计费推送
         */
        public async Task<PushChargeResponse> PushChargeExAsync(PushChargeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushChargeResponse>(await DoRequestAsync("1.0", "blockchain.tax.charge.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询计收费授权情况
         * Summary: 查询计收费授权情况
         */
        public QueryChargeAuthResponse QueryChargeAuth(QueryChargeAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryChargeAuthEx(request, headers, runtime);
        }

        /**
         * Description: 查询计收费授权情况
         * Summary: 查询计收费授权情况
         */
        public async Task<QueryChargeAuthResponse> QueryChargeAuthAsync(QueryChargeAuthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryChargeAuthExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询计收费授权情况
         * Summary: 查询计收费授权情况
         */
        public QueryChargeAuthResponse QueryChargeAuthEx(QueryChargeAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChargeAuthResponse>(DoRequest("1.0", "blockchain.tax.charge.auth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询计收费授权情况
         * Summary: 查询计收费授权情况
         */
        public async Task<QueryChargeAuthResponse> QueryChargeAuthExAsync(QueryChargeAuthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryChargeAuthResponse>(await DoRequestAsync("1.0", "blockchain.tax.charge.auth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 目前仅用于广州区块链发票信息推送
         * Summary:  区块链发票信息推送
         */
        public PushIcmInvoiceResponse PushIcmInvoice(PushIcmInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushIcmInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 目前仅用于广州区块链发票信息推送
         * Summary:  区块链发票信息推送
         */
        public async Task<PushIcmInvoiceResponse> PushIcmInvoiceAsync(PushIcmInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushIcmInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 目前仅用于广州区块链发票信息推送
         * Summary:  区块链发票信息推送
         */
        public PushIcmInvoiceResponse PushIcmInvoiceEx(PushIcmInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushIcmInvoiceResponse>(DoRequest("1.0", "blockchain.tax.icm.invoice.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 目前仅用于广州区块链发票信息推送
         * Summary:  区块链发票信息推送
         */
        public async Task<PushIcmInvoiceResponse> PushIcmInvoiceExAsync(PushIcmInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushIcmInvoiceResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.invoice.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
         * Summary:  区块链发票信息查询
         */
        public QueryIcmInvoiceResponse QueryIcmInvoice(QueryIcmInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIcmInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
         * Summary:  区块链发票信息查询
         */
        public async Task<QueryIcmInvoiceResponse> QueryIcmInvoiceAsync(QueryIcmInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIcmInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
         * Summary:  区块链发票信息查询
         */
        public QueryIcmInvoiceResponse QueryIcmInvoiceEx(QueryIcmInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIcmInvoiceResponse>(DoRequest("1.0", "blockchain.tax.icm.invoice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链发票信息查询接口-该接口为异步查询接口，查询结果通过回调调用方提供的callUrl方式进行通知
         * Summary:  区块链发票信息查询
         */
        public async Task<QueryIcmInvoiceResponse> QueryIcmInvoiceExAsync(QueryIcmInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIcmInvoiceResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.invoice.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标准发票推送
         * Summary: 标准发票推送
         */
        public PushIcmInvoiceinfoResponse PushIcmInvoiceinfo(PushIcmInvoiceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PushIcmInvoiceinfoEx(request, headers, runtime);
        }

        /**
         * Description: 标准发票推送
         * Summary: 标准发票推送
         */
        public async Task<PushIcmInvoiceinfoResponse> PushIcmInvoiceinfoAsync(PushIcmInvoiceinfoRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PushIcmInvoiceinfoExAsync(request, headers, runtime);
        }

        /**
         * Description: 标准发票推送
         * Summary: 标准发票推送
         */
        public PushIcmInvoiceinfoResponse PushIcmInvoiceinfoEx(PushIcmInvoiceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushIcmInvoiceinfoResponse>(DoRequest("1.0", "blockchain.tax.icm.invoiceinfo.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 标准发票推送
         * Summary: 标准发票推送
         */
        public async Task<PushIcmInvoiceinfoResponse> PushIcmInvoiceinfoExAsync(PushIcmInvoiceinfoRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PushIcmInvoiceinfoResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.invoiceinfo.push", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
         * Summary: 获取数据的上链信息描述
         */
        public DescribeIcmInvoiceResponse DescribeIcmInvoice(DescribeIcmInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return DescribeIcmInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
         * Summary: 获取数据的上链信息描述
         */
        public async Task<DescribeIcmInvoiceResponse> DescribeIcmInvoiceAsync(DescribeIcmInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await DescribeIcmInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
         * Summary: 获取数据的上链信息描述
         */
        public DescribeIcmInvoiceResponse DescribeIcmInvoiceEx(DescribeIcmInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeIcmInvoiceResponse>(DoRequest("1.0", "blockchain.tax.icm.invoice.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 根据发票销方税号，发票代码和发票号码获取该张发票在链上的信息，比如快高，交易hash，交易时间
         * Summary: 获取数据的上链信息描述
         */
        public async Task<DescribeIcmInvoiceResponse> DescribeIcmInvoiceExAsync(DescribeIcmInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<DescribeIcmInvoiceResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.invoice.describe", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
         * Summary: 区块链银行授权接口
         */
        public AuthIcmInvoiceResponse AuthIcmInvoice(AuthIcmInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthIcmInvoiceEx(request, headers, runtime);
        }

        /**
         * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
         * Summary: 区块链银行授权接口
         */
        public async Task<AuthIcmInvoiceResponse> AuthIcmInvoiceAsync(AuthIcmInvoiceRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthIcmInvoiceExAsync(request, headers, runtime);
        }

        /**
         * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
         * Summary: 区块链银行授权接口
         */
        public AuthIcmInvoiceResponse AuthIcmInvoiceEx(AuthIcmInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIcmInvoiceResponse>(DoRequest("1.0", "blockchain.tax.icm.invoice.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 区块链银行接口-该接口为支持贷后授权接口，授权结果以同步方式返回
         * Summary: 区块链银行授权接口
         */
        public async Task<AuthIcmInvoiceResponse> AuthIcmInvoiceExAsync(AuthIcmInvoiceRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIcmInvoiceResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.invoice.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人数据使用授权
         * Summary: 个人数据使用授权
         */
        public AuthIcmRealpersonResponse AuthIcmRealperson(AuthIcmRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthIcmRealpersonEx(request, headers, runtime);
        }

        /**
         * Description: 个人数据使用授权
         * Summary: 个人数据使用授权
         */
        public async Task<AuthIcmRealpersonResponse> AuthIcmRealpersonAsync(AuthIcmRealpersonRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthIcmRealpersonExAsync(request, headers, runtime);
        }

        /**
         * Description: 个人数据使用授权
         * Summary: 个人数据使用授权
         */
        public AuthIcmRealpersonResponse AuthIcmRealpersonEx(AuthIcmRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIcmRealpersonResponse>(DoRequest("1.0", "blockchain.tax.icm.realperson.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 个人数据使用授权
         * Summary: 个人数据使用授权
         */
        public async Task<AuthIcmRealpersonResponse> AuthIcmRealpersonExAsync(AuthIcmRealpersonRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIcmRealpersonResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.realperson.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采集，不限制同步 异步
         * Summary: 采集
         */
        public ExecIcmSyncgatheringResponse ExecIcmSyncgathering(ExecIcmSyncgatheringRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecIcmSyncgatheringEx(request, headers, runtime);
        }

        /**
         * Description: 采集，不限制同步 异步
         * Summary: 采集
         */
        public async Task<ExecIcmSyncgatheringResponse> ExecIcmSyncgatheringAsync(ExecIcmSyncgatheringRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecIcmSyncgatheringExAsync(request, headers, runtime);
        }

        /**
         * Description: 采集，不限制同步 异步
         * Summary: 采集
         */
        public ExecIcmSyncgatheringResponse ExecIcmSyncgatheringEx(ExecIcmSyncgatheringRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIcmSyncgatheringResponse>(DoRequest("1.0", "blockchain.tax.icm.syncgathering.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 采集，不限制同步 异步
         * Summary: 采集
         */
        public async Task<ExecIcmSyncgatheringResponse> ExecIcmSyncgatheringExAsync(ExecIcmSyncgatheringRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecIcmSyncgatheringResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.syncgathering.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权模版和token
         * Summary: 获取授权模版和token
         */
        public QueryApiAuthteplateResponse QueryApiAuthteplate(QueryApiAuthteplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiAuthteplateEx(request, headers, runtime);
        }

        /**
         * Description: 获取授权模版和token
         * Summary: 获取授权模版和token
         */
        public async Task<QueryApiAuthteplateResponse> QueryApiAuthteplateAsync(QueryApiAuthteplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiAuthteplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取授权模版和token
         * Summary: 获取授权模版和token
         */
        public QueryApiAuthteplateResponse QueryApiAuthteplateEx(QueryApiAuthteplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiAuthteplateResponse>(DoRequest("1.0", "blockchain.tax.api.authteplate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权模版和token
         * Summary: 获取授权模版和token
         */
        public async Task<QueryApiAuthteplateResponse> QueryApiAuthteplateExAsync(QueryApiAuthteplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiAuthteplateResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.authteplate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交
         * Summary: 提交
         */
        public ExecApiAuthtemplateResponse ExecApiAuthtemplate(ExecApiAuthtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecApiAuthtemplateEx(request, headers, runtime);
        }

        /**
         * Description: 提交
         * Summary: 提交
         */
        public async Task<ExecApiAuthtemplateResponse> ExecApiAuthtemplateAsync(ExecApiAuthtemplateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecApiAuthtemplateExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交
         * Summary: 提交
         */
        public ExecApiAuthtemplateResponse ExecApiAuthtemplateEx(ExecApiAuthtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecApiAuthtemplateResponse>(DoRequest("1.0", "blockchain.tax.api.authtemplate.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交
         * Summary: 提交
         */
        public async Task<ExecApiAuthtemplateResponse> ExecApiAuthtemplateExAsync(ExecApiAuthtemplateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecApiAuthtemplateResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.authtemplate.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取要素信息
         * Summary: 获取要素信息
         */
        public QueryApiAuthtemplatedefineResponse QueryApiAuthtemplatedefine(QueryApiAuthtemplatedefineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiAuthtemplatedefineEx(request, headers, runtime);
        }

        /**
         * Description: 获取要素信息
         * Summary: 获取要素信息
         */
        public async Task<QueryApiAuthtemplatedefineResponse> QueryApiAuthtemplatedefineAsync(QueryApiAuthtemplatedefineRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiAuthtemplatedefineExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取要素信息
         * Summary: 获取要素信息
         */
        public QueryApiAuthtemplatedefineResponse QueryApiAuthtemplatedefineEx(QueryApiAuthtemplatedefineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiAuthtemplatedefineResponse>(DoRequest("1.0", "blockchain.tax.api.authtemplatedefine.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取要素信息
         * Summary: 获取要素信息
         */
        public async Task<QueryApiAuthtemplatedefineResponse> QueryApiAuthtemplatedefineExAsync(QueryApiAuthtemplatedefineRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiAuthtemplatedefineResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.authtemplatedefine.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权结果
         * Summary: 获取授权结果
         */
        public QueryApiAuthtemplateresultResponse QueryApiAuthtemplateresult(QueryApiAuthtemplateresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiAuthtemplateresultEx(request, headers, runtime);
        }

        /**
         * Description: 获取授权结果
         * Summary: 获取授权结果
         */
        public async Task<QueryApiAuthtemplateresultResponse> QueryApiAuthtemplateresultAsync(QueryApiAuthtemplateresultRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiAuthtemplateresultExAsync(request, headers, runtime);
        }

        /**
         * Description: 获取授权结果
         * Summary: 获取授权结果
         */
        public QueryApiAuthtemplateresultResponse QueryApiAuthtemplateresultEx(QueryApiAuthtemplateresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiAuthtemplateresultResponse>(DoRequest("1.0", "blockchain.tax.api.authtemplateresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 获取授权结果
         * Summary: 获取授权结果
         */
        public async Task<QueryApiAuthtemplateresultResponse> QueryApiAuthtemplateresultExAsync(QueryApiAuthtemplateresultRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiAuthtemplateresultResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.authtemplateresult.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业的授权接口
         * Summary: 企业授权
         */
        public AuthIcmEnterpriseResponse AuthIcmEnterprise(AuthIcmEnterpriseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthIcmEnterpriseEx(request, headers, runtime);
        }

        /**
         * Description: 企业的授权接口
         * Summary: 企业授权
         */
        public async Task<AuthIcmEnterpriseResponse> AuthIcmEnterpriseAsync(AuthIcmEnterpriseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthIcmEnterpriseExAsync(request, headers, runtime);
        }

        /**
         * Description: 企业的授权接口
         * Summary: 企业授权
         */
        public AuthIcmEnterpriseResponse AuthIcmEnterpriseEx(AuthIcmEnterpriseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIcmEnterpriseResponse>(DoRequest("1.0", "blockchain.tax.icm.enterprise.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 企业的授权接口
         * Summary: 企业授权
         */
        public async Task<AuthIcmEnterpriseResponse> AuthIcmEnterpriseExAsync(AuthIcmEnterpriseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIcmEnterpriseResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.enterprise.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口为支持授权链接的生成
         * Summary: 可信授权链接获取接口
         */
        public CreateApiAuthurlResponse CreateApiAuthurl(CreateApiAuthurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CreateApiAuthurlEx(request, headers, runtime);
        }

        /**
         * Description: 该接口为支持授权链接的生成
         * Summary: 可信授权链接获取接口
         */
        public async Task<CreateApiAuthurlResponse> CreateApiAuthurlAsync(CreateApiAuthurlRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CreateApiAuthurlExAsync(request, headers, runtime);
        }

        /**
         * Description: 该接口为支持授权链接的生成
         * Summary: 可信授权链接获取接口
         */
        public CreateApiAuthurlResponse CreateApiAuthurlEx(CreateApiAuthurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiAuthurlResponse>(DoRequest("1.0", "blockchain.tax.api.authurl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 该接口为支持授权链接的生成
         * Summary: 可信授权链接获取接口
         */
        public async Task<CreateApiAuthurlResponse> CreateApiAuthurlExAsync(CreateApiAuthurlRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CreateApiAuthurlResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.authurl.create", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
