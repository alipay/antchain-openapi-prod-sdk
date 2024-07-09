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
                        {"sdk_version", "1.8.41"},
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
                        {"sdk_version", "1.8.41"},
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
         * Description: 授权接口
         * Summary: 授权
         */
        public AuthIcmEnterpriseResponse AuthIcmEnterprise(AuthIcmEnterpriseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthIcmEnterpriseEx(request, headers, runtime);
        }

        /**
         * Description: 授权接口
         * Summary: 授权
         */
        public async Task<AuthIcmEnterpriseResponse> AuthIcmEnterpriseAsync(AuthIcmEnterpriseRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthIcmEnterpriseExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权接口
         * Summary: 授权
         */
        public AuthIcmEnterpriseResponse AuthIcmEnterpriseEx(AuthIcmEnterpriseRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthIcmEnterpriseResponse>(DoRequest("1.0", "blockchain.tax.icm.enterprise.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权接口
         * Summary: 授权
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

        /**
         * Description: 极简授权-判断该企业是否支持要素授权
         * Summary: 极简授权-判断该企业是否支持要素授权
         */
        public MatchIcmSimpleauthResponse MatchIcmSimpleauth(MatchIcmSimpleauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return MatchIcmSimpleauthEx(request, headers, runtime);
        }

        /**
         * Description: 极简授权-判断该企业是否支持要素授权
         * Summary: 极简授权-判断该企业是否支持要素授权
         */
        public async Task<MatchIcmSimpleauthResponse> MatchIcmSimpleauthAsync(MatchIcmSimpleauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await MatchIcmSimpleauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 极简授权-判断该企业是否支持要素授权
         * Summary: 极简授权-判断该企业是否支持要素授权
         */
        public MatchIcmSimpleauthResponse MatchIcmSimpleauthEx(MatchIcmSimpleauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchIcmSimpleauthResponse>(DoRequest("1.0", "blockchain.tax.icm.simpleauth.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权-判断该企业是否支持要素授权
         * Summary: 极简授权-判断该企业是否支持要素授权
         */
        public async Task<MatchIcmSimpleauthResponse> MatchIcmSimpleauthExAsync(MatchIcmSimpleauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<MatchIcmSimpleauthResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.simpleauth.match", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权-获取数据，用于获取指标类的数据
         * Summary: 极简授权-获取数据
         */
        public QueryIcmSimpleauthResponse QueryIcmSimpleauth(QueryIcmSimpleauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryIcmSimpleauthEx(request, headers, runtime);
        }

        /**
         * Description: 极简授权-获取数据，用于获取指标类的数据
         * Summary: 极简授权-获取数据
         */
        public async Task<QueryIcmSimpleauthResponse> QueryIcmSimpleauthAsync(QueryIcmSimpleauthRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryIcmSimpleauthExAsync(request, headers, runtime);
        }

        /**
         * Description: 极简授权-获取数据，用于获取指标类的数据
         * Summary: 极简授权-获取数据
         */
        public QueryIcmSimpleauthResponse QueryIcmSimpleauthEx(QueryIcmSimpleauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIcmSimpleauthResponse>(DoRequest("1.0", "blockchain.tax.icm.simpleauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权-获取数据，用于获取指标类的数据
         * Summary: 极简授权-获取数据
         */
        public async Task<QueryIcmSimpleauthResponse> QueryIcmSimpleauthExAsync(QueryIcmSimpleauthRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryIcmSimpleauthResponse>(await DoRequestAsync("1.0", "blockchain.tax.icm.simpleauth.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权异步查询接口
         * Summary: 极简授权-异步获取数据
         */
        public QueryApiSimpleauthasyncResponse QueryApiSimpleauthasync(QueryApiSimpleauthasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiSimpleauthasyncEx(request, headers, runtime);
        }

        /**
         * Description: 极简授权异步查询接口
         * Summary: 极简授权-异步获取数据
         */
        public async Task<QueryApiSimpleauthasyncResponse> QueryApiSimpleauthasyncAsync(QueryApiSimpleauthasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiSimpleauthasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 极简授权异步查询接口
         * Summary: 极简授权-异步获取数据
         */
        public QueryApiSimpleauthasyncResponse QueryApiSimpleauthasyncEx(QueryApiSimpleauthasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiSimpleauthasyncResponse>(DoRequest("1.0", "blockchain.tax.api.simpleauthasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权异步查询接口
         * Summary: 极简授权-异步获取数据
         */
        public async Task<QueryApiSimpleauthasyncResponse> QueryApiSimpleauthasyncExAsync(QueryApiSimpleauthasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiSimpleauthasyncResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.simpleauthasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权接口
         * Summary: 授权接口
         */
        public AuthRiskEvaluationResponse AuthRiskEvaluation(AuthRiskEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return AuthRiskEvaluationEx(request, headers, runtime);
        }

        /**
         * Description: 授权接口
         * Summary: 授权接口
         */
        public async Task<AuthRiskEvaluationResponse> AuthRiskEvaluationAsync(AuthRiskEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await AuthRiskEvaluationExAsync(request, headers, runtime);
        }

        /**
         * Description: 授权接口
         * Summary: 授权接口
         */
        public AuthRiskEvaluationResponse AuthRiskEvaluationEx(AuthRiskEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthRiskEvaluationResponse>(DoRequest("1.0", "blockchain.tax.risk.evaluation.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 授权接口
         * Summary: 授权接口
         */
        public async Task<AuthRiskEvaluationResponse> AuthRiskEvaluationExAsync(AuthRiskEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<AuthRiskEvaluationResponse>(await DoRequestAsync("1.0", "blockchain.tax.risk.evaluation.auth", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询
         * Summary: 查询
         */
        public QueryRiskEvaluationResponse QueryRiskEvaluation(QueryRiskEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryRiskEvaluationEx(request, headers, runtime);
        }

        /**
         * Description: 查询
         * Summary: 查询
         */
        public async Task<QueryRiskEvaluationResponse> QueryRiskEvaluationAsync(QueryRiskEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryRiskEvaluationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询
         * Summary: 查询
         */
        public QueryRiskEvaluationResponse QueryRiskEvaluationEx(QueryRiskEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskEvaluationResponse>(DoRequest("1.0", "blockchain.tax.risk.evaluation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询
         * Summary: 查询
         */
        public async Task<QueryRiskEvaluationResponse> QueryRiskEvaluationExAsync(QueryRiskEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryRiskEvaluationResponse>(await DoRequestAsync("1.0", "blockchain.tax.risk.evaluation.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权-异步查询数据-轮询拉取结果
         * Summary: 极简授权-异步查询数据-轮询拉取结果
         */
        public PullApiSimpleauthasyncpollingResponse PullApiSimpleauthasyncpolling(PullApiSimpleauthasyncpollingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullApiSimpleauthasyncpollingEx(request, headers, runtime);
        }

        /**
         * Description: 极简授权-异步查询数据-轮询拉取结果
         * Summary: 极简授权-异步查询数据-轮询拉取结果
         */
        public async Task<PullApiSimpleauthasyncpollingResponse> PullApiSimpleauthasyncpollingAsync(PullApiSimpleauthasyncpollingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullApiSimpleauthasyncpollingExAsync(request, headers, runtime);
        }

        /**
         * Description: 极简授权-异步查询数据-轮询拉取结果
         * Summary: 极简授权-异步查询数据-轮询拉取结果
         */
        public PullApiSimpleauthasyncpollingResponse PullApiSimpleauthasyncpollingEx(PullApiSimpleauthasyncpollingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullApiSimpleauthasyncpollingResponse>(DoRequest("1.0", "blockchain.tax.api.simpleauthasyncpolling.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权-异步查询数据-轮询拉取结果
         * Summary: 极简授权-异步查询数据-轮询拉取结果
         */
        public async Task<PullApiSimpleauthasyncpollingResponse> PullApiSimpleauthasyncpollingExAsync(PullApiSimpleauthasyncpollingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullApiSimpleauthasyncpollingResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.simpleauthasyncpolling.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权异步查询接口
         * Summary: 极简授权-异步获取数据
         */
        public QueryApiSimpleauthstandardResponse QueryApiSimpleauthstandard(QueryApiSimpleauthstandardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiSimpleauthstandardEx(request, headers, runtime);
        }

        /**
         * Description: 极简授权异步查询接口
         * Summary: 极简授权-异步获取数据
         */
        public async Task<QueryApiSimpleauthstandardResponse> QueryApiSimpleauthstandardAsync(QueryApiSimpleauthstandardRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiSimpleauthstandardExAsync(request, headers, runtime);
        }

        /**
         * Description: 极简授权异步查询接口
         * Summary: 极简授权-异步获取数据
         */
        public QueryApiSimpleauthstandardResponse QueryApiSimpleauthstandardEx(QueryApiSimpleauthstandardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiSimpleauthstandardResponse>(DoRequest("1.0", "blockchain.tax.api.simpleauthstandard.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 极简授权异步查询接口
         * Summary: 极简授权-异步获取数据
         */
        public async Task<QueryApiSimpleauthstandardResponse> QueryApiSimpleauthstandardExAsync(QueryApiSimpleauthstandardRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiSimpleauthstandardResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.simpleauthstandard.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 给对应的税号进行打标
         * Summary: 要素授权打标接口
         */
        public ExecApiSimpleauthmarkResponse ExecApiSimpleauthmark(ExecApiSimpleauthmarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecApiSimpleauthmarkEx(request, headers, runtime);
        }

        /**
         * Description: 给对应的税号进行打标
         * Summary: 要素授权打标接口
         */
        public async Task<ExecApiSimpleauthmarkResponse> ExecApiSimpleauthmarkAsync(ExecApiSimpleauthmarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecApiSimpleauthmarkExAsync(request, headers, runtime);
        }

        /**
         * Description: 给对应的税号进行打标
         * Summary: 要素授权打标接口
         */
        public ExecApiSimpleauthmarkResponse ExecApiSimpleauthmarkEx(ExecApiSimpleauthmarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecApiSimpleauthmarkResponse>(DoRequest("1.0", "blockchain.tax.api.simpleauthmark.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 给对应的税号进行打标
         * Summary: 要素授权打标接口
         */
        public async Task<ExecApiSimpleauthmarkResponse> ExecApiSimpleauthmarkExAsync(ExecApiSimpleauthmarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecApiSimpleauthmarkResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.simpleauthmark.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交打标结果，仅限内部使用
         * Summary: 提交打标结果
         */
        public SubmitApiSimpleauthmarkResponse SubmitApiSimpleauthmark(SubmitApiSimpleauthmarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SubmitApiSimpleauthmarkEx(request, headers, runtime);
        }

        /**
         * Description: 提交打标结果，仅限内部使用
         * Summary: 提交打标结果
         */
        public async Task<SubmitApiSimpleauthmarkResponse> SubmitApiSimpleauthmarkAsync(SubmitApiSimpleauthmarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SubmitApiSimpleauthmarkExAsync(request, headers, runtime);
        }

        /**
         * Description: 提交打标结果，仅限内部使用
         * Summary: 提交打标结果
         */
        public SubmitApiSimpleauthmarkResponse SubmitApiSimpleauthmarkEx(SubmitApiSimpleauthmarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitApiSimpleauthmarkResponse>(DoRequest("1.0", "blockchain.tax.api.simpleauthmark.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提交打标结果，仅限内部使用
         * Summary: 提交打标结果
         */
        public async Task<SubmitApiSimpleauthmarkResponse> SubmitApiSimpleauthmarkExAsync(SubmitApiSimpleauthmarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SubmitApiSimpleauthmarkResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.simpleauthmark.submit", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: blockchain.tax.api.simpleauthmark.exec
         * Summary: 数据打标拉取接口
         */
        public PullApiSimpleauthmarkResponse PullApiSimpleauthmark(PullApiSimpleauthmarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullApiSimpleauthmarkEx(request, headers, runtime);
        }

        /**
         * Description: blockchain.tax.api.simpleauthmark.exec
         * Summary: 数据打标拉取接口
         */
        public async Task<PullApiSimpleauthmarkResponse> PullApiSimpleauthmarkAsync(PullApiSimpleauthmarkRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullApiSimpleauthmarkExAsync(request, headers, runtime);
        }

        /**
         * Description: blockchain.tax.api.simpleauthmark.exec
         * Summary: 数据打标拉取接口
         */
        public PullApiSimpleauthmarkResponse PullApiSimpleauthmarkEx(PullApiSimpleauthmarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullApiSimpleauthmarkResponse>(DoRequest("1.0", "blockchain.tax.api.simpleauthmark.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: blockchain.tax.api.simpleauthmark.exec
         * Summary: 数据打标拉取接口
         */
        public async Task<PullApiSimpleauthmarkResponse> PullApiSimpleauthmarkExAsync(PullApiSimpleauthmarkRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullApiSimpleauthmarkResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.simpleauthmark.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询-同步返回提额数据
         * Summary: 查询-同步提额数据返回
         */
        public SyncRiskEvaluationResponse SyncRiskEvaluation(SyncRiskEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return SyncRiskEvaluationEx(request, headers, runtime);
        }

        /**
         * Description: 查询-同步返回提额数据
         * Summary: 查询-同步提额数据返回
         */
        public async Task<SyncRiskEvaluationResponse> SyncRiskEvaluationAsync(SyncRiskEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await SyncRiskEvaluationExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询-同步返回提额数据
         * Summary: 查询-同步提额数据返回
         */
        public SyncRiskEvaluationResponse SyncRiskEvaluationEx(SyncRiskEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncRiskEvaluationResponse>(DoRequest("1.0", "blockchain.tax.risk.evaluation.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询-同步返回提额数据
         * Summary: 查询-同步提额数据返回
         */
        public async Task<SyncRiskEvaluationResponse> SyncRiskEvaluationExAsync(SyncRiskEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<SyncRiskEvaluationResponse>(await DoRequestAsync("1.0", "blockchain.tax.risk.evaluation.sync", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纳税人状态查询
         * Summary: 纳税人状态查询
         */
        public QuerySimpleauthIdentitystateResponse QuerySimpleauthIdentitystate(QuerySimpleauthIdentitystateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QuerySimpleauthIdentitystateEx(request, headers, runtime);
        }

        /**
         * Description: 纳税人状态查询
         * Summary: 纳税人状态查询
         */
        public async Task<QuerySimpleauthIdentitystateResponse> QuerySimpleauthIdentitystateAsync(QuerySimpleauthIdentitystateRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QuerySimpleauthIdentitystateExAsync(request, headers, runtime);
        }

        /**
         * Description: 纳税人状态查询
         * Summary: 纳税人状态查询
         */
        public QuerySimpleauthIdentitystateResponse QuerySimpleauthIdentitystateEx(QuerySimpleauthIdentitystateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySimpleauthIdentitystateResponse>(DoRequest("1.0", "blockchain.tax.simpleauth.identitystate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 纳税人状态查询
         * Summary: 纳税人状态查询
         */
        public async Task<QuerySimpleauthIdentitystateResponse> QuerySimpleauthIdentitystateExAsync(QuerySimpleauthIdentitystateRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QuerySimpleauthIdentitystateResponse>(await DoRequestAsync("1.0", "blockchain.tax.simpleauth.identitystate.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海关-异步查询数据
         * Summary: 海关-异步查询数据
         */
        public QueryApiHaiguanasyncResponse QueryApiHaiguanasync(QueryApiHaiguanasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiHaiguanasyncEx(request, headers, runtime);
        }

        /**
         * Description: 海关-异步查询数据
         * Summary: 海关-异步查询数据
         */
        public async Task<QueryApiHaiguanasyncResponse> QueryApiHaiguanasyncAsync(QueryApiHaiguanasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiHaiguanasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 海关-异步查询数据
         * Summary: 海关-异步查询数据
         */
        public QueryApiHaiguanasyncResponse QueryApiHaiguanasyncEx(QueryApiHaiguanasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiHaiguanasyncResponse>(DoRequest("1.0", "blockchain.tax.api.haiguanasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海关-异步查询数据
         * Summary: 海关-异步查询数据
         */
        public async Task<QueryApiHaiguanasyncResponse> QueryApiHaiguanasyncExAsync(QueryApiHaiguanasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiHaiguanasyncResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.haiguanasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海关-异步查询数据-轮询拉取数据
         * Summary: 海关-异步查询数据-轮询拉取数据
         */
        public PullApiHaiguanasyncpollingResponse PullApiHaiguanasyncpolling(PullApiHaiguanasyncpollingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return PullApiHaiguanasyncpollingEx(request, headers, runtime);
        }

        /**
         * Description: 海关-异步查询数据-轮询拉取数据
         * Summary: 海关-异步查询数据-轮询拉取数据
         */
        public async Task<PullApiHaiguanasyncpollingResponse> PullApiHaiguanasyncpollingAsync(PullApiHaiguanasyncpollingRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await PullApiHaiguanasyncpollingExAsync(request, headers, runtime);
        }

        /**
         * Description: 海关-异步查询数据-轮询拉取数据
         * Summary: 海关-异步查询数据-轮询拉取数据
         */
        public PullApiHaiguanasyncpollingResponse PullApiHaiguanasyncpollingEx(PullApiHaiguanasyncpollingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullApiHaiguanasyncpollingResponse>(DoRequest("1.0", "blockchain.tax.api.haiguanasyncpolling.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 海关-异步查询数据-轮询拉取数据
         * Summary: 海关-异步查询数据-轮询拉取数据
         */
        public async Task<PullApiHaiguanasyncpollingResponse> PullApiHaiguanasyncpollingExAsync(PullApiHaiguanasyncpollingRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<PullApiHaiguanasyncpollingResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.haiguanasyncpolling.pull", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提额资质评估授权并查询,支持省级查询
         * Summary: 提额资质评估授权并查询
         */
        public StartRiskEvaluationResponse StartRiskEvaluation(StartRiskEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return StartRiskEvaluationEx(request, headers, runtime);
        }

        /**
         * Description: 提额资质评估授权并查询,支持省级查询
         * Summary: 提额资质评估授权并查询
         */
        public async Task<StartRiskEvaluationResponse> StartRiskEvaluationAsync(StartRiskEvaluationRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await StartRiskEvaluationExAsync(request, headers, runtime);
        }

        /**
         * Description: 提额资质评估授权并查询,支持省级查询
         * Summary: 提额资质评估授权并查询
         */
        public StartRiskEvaluationResponse StartRiskEvaluationEx(StartRiskEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRiskEvaluationResponse>(DoRequest("1.0", "blockchain.tax.risk.evaluation.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 提额资质评估授权并查询,支持省级查询
         * Summary: 提额资质评估授权并查询
         */
        public async Task<StartRiskEvaluationResponse> StartRiskEvaluationExAsync(StartRiskEvaluationRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<StartRiskEvaluationResponse>(await DoRequestAsync("1.0", "blockchain.tax.risk.evaluation.start", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电力异步接口
         * Summary: 电力异步接口
         */
        public QueryEnterpriseElectronicasyncResponse QueryEnterpriseElectronicasync(QueryEnterpriseElectronicasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryEnterpriseElectronicasyncEx(request, headers, runtime);
        }

        /**
         * Description: 电力异步接口
         * Summary: 电力异步接口
         */
        public async Task<QueryEnterpriseElectronicasyncResponse> QueryEnterpriseElectronicasyncAsync(QueryEnterpriseElectronicasyncRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryEnterpriseElectronicasyncExAsync(request, headers, runtime);
        }

        /**
         * Description: 电力异步接口
         * Summary: 电力异步接口
         */
        public QueryEnterpriseElectronicasyncResponse QueryEnterpriseElectronicasyncEx(QueryEnterpriseElectronicasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseElectronicasyncResponse>(DoRequest("1.0", "blockchain.tax.enterprise.electronicasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 电力异步接口
         * Summary: 电力异步接口
         */
        public async Task<QueryEnterpriseElectronicasyncResponse> QueryEnterpriseElectronicasyncExAsync(QueryEnterpriseElectronicasyncRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryEnterpriseElectronicasyncResponse>(await DoRequestAsync("1.0", "blockchain.tax.enterprise.electronicasync.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定账户的数据
         * Summary: 查询指定账户的数据
         */
        public QueryApiDataprocessResponse QueryApiDataprocess(QueryApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryApiDataprocessEx(request, headers, runtime);
        }

        /**
         * Description: 查询指定账户的数据
         * Summary: 查询指定账户的数据
         */
        public async Task<QueryApiDataprocessResponse> QueryApiDataprocessAsync(QueryApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryApiDataprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 查询指定账户的数据
         * Summary: 查询指定账户的数据
         */
        public QueryApiDataprocessResponse QueryApiDataprocessEx(QueryApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiDataprocessResponse>(DoRequest("1.0", "blockchain.tax.api.dataprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 查询指定账户的数据
         * Summary: 查询指定账户的数据
         */
        public async Task<QueryApiDataprocessResponse> QueryApiDataprocessExAsync(QueryApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryApiDataprocessResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.dataprocess.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验当前目标查询数据初始化接口
         * Summary: 校验当前目标查询数据初始化接口
         */
        public InitApiDataprocessResponse InitApiDataprocess(InitApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return InitApiDataprocessEx(request, headers, runtime);
        }

        /**
         * Description: 校验当前目标查询数据初始化接口
         * Summary: 校验当前目标查询数据初始化接口
         */
        public async Task<InitApiDataprocessResponse> InitApiDataprocessAsync(InitApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await InitApiDataprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 校验当前目标查询数据初始化接口
         * Summary: 校验当前目标查询数据初始化接口
         */
        public InitApiDataprocessResponse InitApiDataprocessEx(InitApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitApiDataprocessResponse>(DoRequest("1.0", "blockchain.tax.api.dataprocess.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 校验当前目标查询数据初始化接口
         * Summary: 校验当前目标查询数据初始化接口
         */
        public async Task<InitApiDataprocessResponse> InitApiDataprocessExAsync(InitApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<InitApiDataprocessResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.dataprocess.init", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转目标客户是否可用接口
         * Summary: 数据流转目标客户是否可用接口
         */
        public JudgeApiDataprocessResponse JudgeApiDataprocess(JudgeApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return JudgeApiDataprocessEx(request, headers, runtime);
        }

        /**
         * Description: 数据流转目标客户是否可用接口
         * Summary: 数据流转目标客户是否可用接口
         */
        public async Task<JudgeApiDataprocessResponse> JudgeApiDataprocessAsync(JudgeApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await JudgeApiDataprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据流转目标客户是否可用接口
         * Summary: 数据流转目标客户是否可用接口
         */
        public JudgeApiDataprocessResponse JudgeApiDataprocessEx(JudgeApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeApiDataprocessResponse>(DoRequest("1.0", "blockchain.tax.api.dataprocess.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转目标客户是否可用接口
         * Summary: 数据流转目标客户是否可用接口
         */
        public async Task<JudgeApiDataprocessResponse> JudgeApiDataprocessExAsync(JudgeApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<JudgeApiDataprocessResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.dataprocess.judge", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化与查询合并统一执行接口
         * Summary: 初始化与查询合并统一执行接口
         */
        public ExecApiDataprocessResponse ExecApiDataprocess(ExecApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return ExecApiDataprocessEx(request, headers, runtime);
        }

        /**
         * Description: 初始化与查询合并统一执行接口
         * Summary: 初始化与查询合并统一执行接口
         */
        public async Task<ExecApiDataprocessResponse> ExecApiDataprocessAsync(ExecApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await ExecApiDataprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 初始化与查询合并统一执行接口
         * Summary: 初始化与查询合并统一执行接口
         */
        public ExecApiDataprocessResponse ExecApiDataprocessEx(ExecApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecApiDataprocessResponse>(DoRequest("1.0", "blockchain.tax.api.dataprocess.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 初始化与查询合并统一执行接口
         * Summary: 初始化与查询合并统一执行接口
         */
        public async Task<ExecApiDataprocessResponse> ExecApiDataprocessExAsync(ExecApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<ExecApiDataprocessResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.dataprocess.exec", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转通用执行接口
         * Summary: 数据流转通用执行接口
         */
        public RunApiDataprocessResponse RunApiDataprocess(RunApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return RunApiDataprocessEx(request, headers, runtime);
        }

        /**
         * Description: 数据流转通用执行接口
         * Summary: 数据流转通用执行接口
         */
        public async Task<RunApiDataprocessResponse> RunApiDataprocessAsync(RunApiDataprocessRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await RunApiDataprocessExAsync(request, headers, runtime);
        }

        /**
         * Description: 数据流转通用执行接口
         * Summary: 数据流转通用执行接口
         */
        public RunApiDataprocessResponse RunApiDataprocessEx(RunApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunApiDataprocessResponse>(DoRequest("1.0", "blockchain.tax.api.dataprocess.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 数据流转通用执行接口
         * Summary: 数据流转通用执行接口
         */
        public async Task<RunApiDataprocessResponse> RunApiDataprocessExAsync(RunApiDataprocessRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<RunApiDataprocessResponse>(await DoRequestAsync("1.0", "blockchain.tax.api.dataprocess.run", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收入评估服务A
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
         * Summary: 收入评估服务A
         */
        public QueryPdataPersonalincomeResponse QueryPdataPersonalincome(QueryPdataPersonalincomeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdataPersonalincomeEx(request, headers, runtime);
        }

        /**
         * Description: 收入评估服务A
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
         * Summary: 收入评估服务A
         */
        public async Task<QueryPdataPersonalincomeResponse> QueryPdataPersonalincomeAsync(QueryPdataPersonalincomeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdataPersonalincomeExAsync(request, headers, runtime);
        }

        /**
         * Description: 收入评估服务A
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
         * Summary: 收入评估服务A
         */
        public QueryPdataPersonalincomeResponse QueryPdataPersonalincomeEx(QueryPdataPersonalincomeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdataPersonalincomeResponse>(DoRequest("1.0", "blockchain.tax.pdata.personalincome.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收入评估服务A
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#Vdzsg
         * Summary: 收入评估服务A
         */
        public async Task<QueryPdataPersonalincomeResponse> QueryPdataPersonalincomeExAsync(QueryPdataPersonalincomeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdataPersonalincomeResponse>(await DoRequestAsync("1.0", "blockchain.tax.pdata.personalincome.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收入评估服务B
         * Summary: 收入评估服务B
         */
        public QueryPdataSocialincomeResponse QueryPdataSocialincome(QueryPdataSocialincomeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdataSocialincomeEx(request, headers, runtime);
        }

        /**
         * Description: 收入评估服务B
         * Summary: 收入评估服务B
         */
        public async Task<QueryPdataSocialincomeResponse> QueryPdataSocialincomeAsync(QueryPdataSocialincomeRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdataSocialincomeExAsync(request, headers, runtime);
        }

        /**
         * Description: 收入评估服务B
         * Summary: 收入评估服务B
         */
        public QueryPdataSocialincomeResponse QueryPdataSocialincomeEx(QueryPdataSocialincomeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdataSocialincomeResponse>(DoRequest("1.0", "blockchain.tax.pdata.socialincome.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 收入评估服务B
         * Summary: 收入评估服务B
         */
        public async Task<QueryPdataSocialincomeResponse> QueryPdataSocialincomeExAsync(QueryPdataSocialincomeRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdataSocialincomeResponse>(await DoRequestAsync("1.0", "blockchain.tax.pdata.socialincome.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 婚姻状况查验服务
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
         * Summary: 婚姻状况查验
         */
        public CheckPdataMarriageResponse CheckPdataMarriage(CheckPdataMarriageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return CheckPdataMarriageEx(request, headers, runtime);
        }

        /**
         * Description: 婚姻状况查验服务
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
         * Summary: 婚姻状况查验
         */
        public async Task<CheckPdataMarriageResponse> CheckPdataMarriageAsync(CheckPdataMarriageRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await CheckPdataMarriageExAsync(request, headers, runtime);
        }

        /**
         * Description: 婚姻状况查验服务
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
         * Summary: 婚姻状况查验
         */
        public CheckPdataMarriageResponse CheckPdataMarriageEx(CheckPdataMarriageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPdataMarriageResponse>(DoRequest("1.0", "blockchain.tax.pdata.marriage.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 婚姻状况查验服务
        https://yuque.antfin-inc.com/antchain/xqqgyw/gsqy2kup47rytr4u#FWoSp
         * Summary: 婚姻状况查验
         */
        public async Task<CheckPdataMarriageResponse> CheckPdataMarriageExAsync(CheckPdataMarriageRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<CheckPdataMarriageResponse>(await DoRequestAsync("1.0", "blockchain.tax.pdata.marriage.check", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 断卡行动风险识别服务
         * Summary: 断卡行动风险识别服务
         */
        public QueryPdataRiskResponse QueryPdataRisk(QueryPdataRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdataRiskEx(request, headers, runtime);
        }

        /**
         * Description: 断卡行动风险识别服务
         * Summary: 断卡行动风险识别服务
         */
        public async Task<QueryPdataRiskResponse> QueryPdataRiskAsync(QueryPdataRiskRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdataRiskExAsync(request, headers, runtime);
        }

        /**
         * Description: 断卡行动风险识别服务
         * Summary: 断卡行动风险识别服务
         */
        public QueryPdataRiskResponse QueryPdataRiskEx(QueryPdataRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdataRiskResponse>(DoRequest("1.0", "blockchain.tax.pdata.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 断卡行动风险识别服务
         * Summary: 断卡行动风险识别服务
         */
        public async Task<QueryPdataRiskResponse> QueryPdataRiskExAsync(QueryPdataRiskRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdataRiskResponse>(await DoRequestAsync("1.0", "blockchain.tax.pdata.risk.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核保医疗查询
         * Summary: 核保医疗查询
         */
        public QueryPdataUnderwriteResponse QueryPdataUnderwrite(QueryPdataUnderwriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPdataUnderwriteEx(request, headers, runtime);
        }

        /**
         * Description: 核保医疗查询
         * Summary: 核保医疗查询
         */
        public async Task<QueryPdataUnderwriteResponse> QueryPdataUnderwriteAsync(QueryPdataUnderwriteRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPdataUnderwriteExAsync(request, headers, runtime);
        }

        /**
         * Description: 核保医疗查询
         * Summary: 核保医疗查询
         */
        public QueryPdataUnderwriteResponse QueryPdataUnderwriteEx(QueryPdataUnderwriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdataUnderwriteResponse>(DoRequest("1.0", "blockchain.tax.pdata.underwrite.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 核保医疗查询
         * Summary: 核保医疗查询
         */
        public async Task<QueryPdataUnderwriteResponse> QueryPdataUnderwriteExAsync(QueryPdataUnderwriteRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPdataUnderwriteResponse>(await DoRequestAsync("1.0", "blockchain.tax.pdata.underwrite.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 经济画像
         * Summary: 财富洞察经济画像
         */
        public QueryPortraiteconomyResponse QueryPortraiteconomy(QueryPortraiteconomyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return QueryPortraiteconomyEx(request, headers, runtime);
        }

        /**
         * Description: 经济画像
         * Summary: 财富洞察经济画像
         */
        public async Task<QueryPortraiteconomyResponse> QueryPortraiteconomyAsync(QueryPortraiteconomyRequest request)
        {
            AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime = new AlibabaCloud.TeaUtil.Models.RuntimeOptions();
            Dictionary<string, string> headers = new Dictionary<string, string>(){};
            return await QueryPortraiteconomyExAsync(request, headers, runtime);
        }

        /**
         * Description: 经济画像
         * Summary: 财富洞察经济画像
         */
        public QueryPortraiteconomyResponse QueryPortraiteconomyEx(QueryPortraiteconomyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPortraiteconomyResponse>(DoRequest("1.0", "blockchain.tax.portraiteconomy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

        /**
         * Description: 经济画像
         * Summary: 财富洞察经济画像
         */
        public async Task<QueryPortraiteconomyResponse> QueryPortraiteconomyExAsync(QueryPortraiteconomyRequest request, Dictionary<string, string> headers, AlibabaCloud.TeaUtil.Models.RuntimeOptions runtime)
        {
            AlibabaCloud.TeaUtil.Common.ValidateModel(request);
            return TeaModel.ToObject<QueryPortraiteconomyResponse>(await DoRequestAsync("1.0", "blockchain.tax.portraiteconomy.query", "HTTPS", "POST", "/gateway.do", request.ToMap(), headers, runtime));
        }

    }
}
